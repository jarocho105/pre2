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
package com.bydan.erp.facturacion.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;

import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;

//import com.bydan.erp.facturacion.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.facturacion.util.ParametroProductoConstantesFunciones;

import com.bydan.erp.facturacion.business.logic.*;
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
public class ParametroProductoJInternalFrame extends ParametroProductoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarParametroProducto;
	
	protected JMenuBar jmenuBarParametroProducto;
	
	protected JMenu jmenuParametroProducto;
	protected JMenu jmenuDatosParametroProducto;
	protected JMenu jmenuArchivoParametroProducto;
	protected JMenu jmenuAccionesParametroProducto;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosParametroProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutParametroProducto;	
	protected GridBagConstraints gridBagConstraintsParametroProducto;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public ParametroProductoDetalleFormJInternalFrame jInternalFrameDetalleFormParametroProducto;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoParametroProducto;	
	protected ImportacionJInternalFrame jInternalFrameImportacionParametroProducto;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected ModuloBeanSwingJInternalFrame moduloBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_modulo="";

	protected TransaccionBeanSwingJInternalFrame transaccionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_transaccion="";

	protected TipoTransaccionModuloBeanSwingJInternalFrame tipotransaccionmoduloBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipotransaccionmodulo="";

	protected BodegaBeanSwingJInternalFrame bodegaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_bodega="";

	protected ProductoBeanSwingJInternalFrame productoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_producto="";

	protected FormatoBeanSwingJInternalFrame formatoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_formato="";
	
	public ParametroProductoSessionBean parametroproductoSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public ModuloSessionBean moduloSessionBean;
	public TransaccionSessionBean transaccionSessionBean;
	public TipoTransaccionModuloSessionBean tipotransaccionmoduloSessionBean;
	public BodegaSessionBean bodegaSessionBean;
	public ProductoSessionBean productoSessionBean;
	public FormatoSessionBean formatoSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<ParametroProducto> parametroproductos;		
	public List<ParametroProducto> parametroproductosEliminados;	
	public List<ParametroProducto> parametroproductosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByParametroProducto;		
	protected JButton jButtonAbrirOrderByParametroProducto;
	
	
	//protected JPanel jPanelOrderByParametroProducto;
	//public JScrollPane jScrollPanelOrderByParametroProducto;	
	//protected JButton jButtonCerrarOrderByParametroProducto;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public ParametroProductoLogic parametroproductoLogic;
	
	
	
	public JScrollPane jScrollPanelDatosParametroProducto;
	public JScrollPane jScrollPanelDatosEdicionParametroProducto;
	public JScrollPane jScrollPanelDatosGeneralParametroProducto;
    
	
	
	//public JScrollPane jScrollPanelDatosParametroProductoOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoParametroProducto;
	//public JScrollPane jScrollPanelImportacionParametroProducto;
	
	
	
	protected JPanel jPanelAccionesParametroProducto;
	
    protected JPanel jPanelPaginacionParametroProducto;
    protected JPanel jPanelParametrosReportesParametroProducto;
	protected JPanel jPanelParametrosReportesAccionesParametroProducto;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1ParametroProducto;
	protected JPanel jPanelParametrosAuxiliar2ParametroProducto;
	protected JPanel jPanelParametrosAuxiliar3ParametroProducto;
	protected JPanel jPanelParametrosAuxiliar4ParametroProducto;
	//protected JPanel jPanelParametrosAuxiliar5ParametroProducto;
	
	
	
	//protected JPanel jPanelReporteDinamicoParametroProducto;
	//protected JPanel jPanelImportacionParametroProducto;
	
	
	public JTable jTableDatosParametroProducto;
	
	
	
	//public JTable jTableDatosParametroProductoOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoParametroProducto;
	protected JButton jButtonDuplicarParametroProducto;
	protected JButton jButtonCopiarParametroProducto;
	protected JButton jButtonVerFormParametroProducto;
	protected JButton jButtonNuevoRelacionesParametroProducto;
	protected JButton jButtonModificarParametroProducto;
	
    protected JButton jButtonGuardarCambiosTablaParametroProducto;
	protected JButton jButtonCerrarParametroProducto;
	
	
	protected JButton jButtonRecargarInformacionParametroProducto;
	protected JButton jButtonProcesarInformacionParametroProducto;
	
	
	protected JButton jButtonAnterioresParametroProducto;
	protected JButton jButtonSiguientesParametroProducto;
	protected JButton jButtonNuevoGuardarCambiosParametroProducto;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoParametroProducto;
	//protected JButton jButtonCerrarReporteDinamicoParametroProducto;
	//protected JButton jButtonGenerarExcelReporteDinamicoParametroProducto;	
	
	
	
	//protected JButton jButtonAbrirImportacionParametroProducto;
	//protected JButton jButtonGenerarImportacionParametroProducto;
	//protected JButton jButtonCerrarImportacionParametroProducto;
	//protected JFileChooser jFileChooserImportacionParametroProducto;
	//protected File fileImportacionParametroProducto;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarParametroProducto;
	protected JButton jButtonDuplicarToolBarParametroProducto;
	protected JButton jButtonNuevoRelacionesToolBarParametroProducto;
	
	
	public JButton jButtonGuardarCambiosToolBarParametroProducto;
	protected JButton jButtonCopiarToolBarParametroProducto;
	protected JButton jButtonVerFormToolBarParametroProducto;
	public JButton jButtonGuardarCambiosTablaToolBarParametroProducto;
	protected JButton jButtonMostrarOcultarTablaToolBarParametroProducto;
	protected JButton jButtonCerrarToolBarParametroProducto;
	
	protected JButton jButtonRecargarInformacionToolBarParametroProducto;
	protected JButton jButtonProcesarInformacionToolBarParametroProducto;
	protected JButton jButtonAnterioresToolBarParametroProducto;
	protected JButton jButtonSiguientesToolBarParametroProducto;
	protected JButton jButtonNuevoGuardarCambiosToolBarParametroProducto;
	protected JButton jButtonAbrirOrderByToolBarParametroProducto;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoParametroProducto;
	protected JMenuItem jMenuItemDuplicarParametroProducto;
	protected JMenuItem jMenuItemNuevoRelacionesParametroProducto;
	
	
	protected JMenuItem jMenuItemGuardarCambiosParametroProducto;
	protected JMenuItem jMenuItemCopiarParametroProducto;
	protected JMenuItem jMenuItemVerFormParametroProducto;
	protected JMenuItem jMenuItemGuardarCambiosTablaParametroProducto;
	protected JMenuItem jMenuItemCerrarParametroProducto;
	protected JMenuItem jMenuItemDetalleCerrarParametroProducto;
	protected JMenuItem jMenuItemDetalleAbrirOrderByParametroProducto;
	protected JMenuItem jMenuItemDetalleMostarOcultarParametroProducto;
	
	protected JMenuItem jMenuItemRecargarInformacionParametroProducto;
	protected JMenuItem jMenuItemProcesarInformacionParametroProducto;
	protected JMenuItem jMenuItemAnterioresParametroProducto;
	protected JMenuItem jMenuItemSiguientesParametroProducto;
	protected JMenuItem jMenuItemNuevoGuardarCambiosParametroProducto;
	protected JMenuItem jMenuItemAbrirOrderByParametroProducto;
	protected JMenuItem jMenuItemMostrarOcultarParametroProducto;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesParametroProducto;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosParametroProducto;
	protected JCheckBox jCheckBoxSeleccionadosParametroProducto;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaParametroProducto;
	protected JCheckBox jCheckBoxConGraficoReporteParametroProducto;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesParametroProducto;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesParametroProducto;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoParametroProducto;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoParametroProducto;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesParametroProducto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionParametroProducto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesParametroProducto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesParametroProducto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarParametroProducto;
	protected JTextField jTextFieldValorCampoGeneralParametroProducto;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteParametroProducto;
	//public JList<Reporte> jListColumnasSelectReporteParametroProducto;
	//public JScrollPane jScrollColumnasSelectReporteParametroProducto;
	
	//public JLabel jLabelRelacionesSelectReporteParametroProducto;
	//public JList<Reporte> jListRelacionesSelectReporteParametroProducto;
	//public JScrollPane jScrollRelacionesSelectReporteParametroProducto;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoParametroProducto;
	//protected JCheckBox jCheckBoxConGraficoDinamicoParametroProducto;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoParametroProducto;
	//public JLabel jLabelTiposArchivoReporteDinamicoParametroProducto;
	
		
	//public JLabel jLabelArchivoImportacionParametroProducto;	
	//public JLabel jLabelPathArchivoImportacionParametroProducto;
	//protected JTextField jTextFieldPathArchivoImportacionParametroProducto;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoParametroProducto;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoParametroProducto;
	
	//public JLabel jLabelColumnaCategoriaValorParametroProducto;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorParametroProducto;
	
	//public JLabel jLabelColumnasValoresGraficoParametroProducto;
	//public JList<Reporte> jListColumnasValoresGraficoParametroProducto;
	//public JScrollPane jScrollColumnasValoresGraficoParametroProducto;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoParametroProducto;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoParametroProducto;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasParametroProducto;
	public JPanel jPanelFK_IdModuloParametroProducto;
	public JButton jButtonFK_IdModuloParametroProducto;
	
	public JPanel jPanelid_moduloFK_IdModuloParametroProducto;
	public JLabel jLabelid_moduloFK_IdModuloParametroProducto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_moduloFK_IdModuloParametroProducto;
	public JButton jButtonid_moduloFK_IdModuloParametroProducto= new JButtonMe();
	public JButton jButtonid_moduloFK_IdModuloParametroProductoUpdate= new JButtonMe();
	public JButton jButtonid_moduloFK_IdModuloParametroProductoBusqueda= new JButtonMe();

	
	
	
	
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
	public ParametroProductoJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("ParametroProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParametroProductoJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ParametroProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParametroProductoJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ParametroProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParametroProductoJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ParametroProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionParametroProducto)	{
		this.jButtonRecargarInformacionParametroProducto = jButtonRecargarInformacionParametroProducto;
	}
	
	public JButton getjButtonProcesarInformacionParametroProducto() {
		return this.jButtonProcesarInformacionParametroProducto;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionParametroProducto)	{
		this.jButtonProcesarInformacionParametroProducto = jButtonProcesarInformacionParametroProducto;
	}
	
	
	public JButton getjButtonRecargarInformacionParametroProducto() {
		return this.jButtonRecargarInformacionParametroProducto;
	}
	
	
	public List<ParametroProducto> getparametroproductos() {
		return this.parametroproductos;
	}

	public void setparametroproductos(List<ParametroProducto> parametroproductos) {
		this.parametroproductos = parametroproductos;
	}
	
	public List<ParametroProducto> getparametroproductosAux() {
		return this.parametroproductosAux;
	}

	public void setparametroproductosAux(List<ParametroProducto> parametroproductosAux) {
		this.parametroproductosAux = parametroproductosAux;
	}
	
	public List<ParametroProducto> getparametroproductosEliminados() {
		return this.parametroproductosEliminados;
	}

	public void setParametroProductosEliminados(List<ParametroProducto> parametroproductosEliminados) {
		this.parametroproductosEliminados = parametroproductosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarParametroProducto() {
		return jComboBoxTiposSeleccionarParametroProducto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarParametroProducto(
			JComboBox jComboBoxTiposSeleccionarParametroProducto) {
		this.jComboBoxTiposSeleccionarParametroProducto = jComboBoxTiposSeleccionarParametroProducto;
	}
	
	public void setBorderResaltarTiposSeleccionarParametroProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarParametroProducto.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarParametroProducto .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralParametroProducto() {
		return jTextFieldValorCampoGeneralParametroProducto;
	}

	public void setjTextFieldValorCampoGeneralParametroProducto(
			JTextField jTextFieldValorCampoGeneralParametroProducto) {
		this.jTextFieldValorCampoGeneralParametroProducto = jTextFieldValorCampoGeneralParametroProducto;
	}

	public void setBorderResaltarValorCampoGeneralParametroProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroProducto.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralParametroProducto .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosParametroProducto() {
		return this.jCheckBoxSeleccionarTodosParametroProducto;
	}

	public void setjCheckBoxSeleccionarTodosParametroProducto(
			JCheckBox jCheckBoxSeleccionarTodosParametroProducto) {
		this.jCheckBoxSeleccionarTodosParametroProducto = jCheckBoxSeleccionarTodosParametroProducto;
	}

	public void setBorderResaltarSeleccionarTodosParametroProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroProducto.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosParametroProducto .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosParametroProducto() {
		return this.jCheckBoxSeleccionadosParametroProducto;
	}

	public void setjCheckBoxSeleccionadosParametroProducto(
			JCheckBox jCheckBoxSeleccionadosParametroProducto) {
		this.jCheckBoxSeleccionadosParametroProducto = jCheckBoxSeleccionadosParametroProducto;
	}
	
	public void setBorderResaltarSeleccionadosParametroProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroProducto.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosParametroProducto .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesParametroProducto() {
		return this.jComboBoxTiposArchivosReportesParametroProducto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesParametroProducto(
			JComboBox jComboBoxTiposArchivosReportesParametroProducto) {
		this.jComboBoxTiposArchivosReportesParametroProducto = jComboBoxTiposArchivosReportesParametroProducto;
	}

	public void setBorderResaltarTiposArchivosReportesParametroProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroProducto.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesParametroProducto .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesParametroProducto() {
		return this.jComboBoxTiposReportesParametroProducto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesParametroProducto(
			JComboBox jComboBoxTiposReportesParametroProducto) {
		this.jComboBoxTiposReportesParametroProducto = jComboBoxTiposReportesParametroProducto;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoParametroProducto() {
	//	return jComboBoxTiposReportesDinamicoParametroProducto;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoParametroProducto(
	//		JComboBox jComboBoxTiposReportesDinamicoParametroProducto) {
	//	this.jComboBoxTiposReportesDinamicoParametroProducto = jComboBoxTiposReportesDinamicoParametroProducto;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoParametroProducto() {
	//	return jComboBoxTiposArchivosReportesDinamicoParametroProducto;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoParametroProducto(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoParametroProducto) {
	//	this.jComboBoxTiposArchivosReportesDinamicoParametroProducto = jComboBoxTiposArchivosReportesDinamicoParametroProducto;
	//}
	
	public void setBorderResaltarTiposReportesParametroProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroProducto.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesParametroProducto .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesParametroProducto() {
		return this.jComboBoxTiposGraficosReportesParametroProducto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesParametroProducto(
			JComboBox jComboBoxTiposGraficosReportesParametroProducto) {
		this.jComboBoxTiposGraficosReportesParametroProducto = jComboBoxTiposGraficosReportesParametroProducto;
	}
	
	public void setBorderResaltarTiposGraficosReportesParametroProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroProducto.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesParametroProducto .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionParametroProducto() {
		return this.jComboBoxTiposPaginacionParametroProducto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionParametroProducto(
			JComboBox jComboBoxTiposPaginacionParametroProducto) {
		this.jComboBoxTiposPaginacionParametroProducto = jComboBoxTiposPaginacionParametroProducto;
	}
	
	public void setBorderResaltarTiposPaginacionParametroProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroProducto.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionParametroProducto .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesParametroProducto() {
		return this.jComboBoxTiposRelacionesParametroProducto;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesParametroProducto() {
		return this.jComboBoxTiposAccionesParametroProducto;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesParametroProducto(
			JComboBox jComboBoxTiposRelacionesParametroProducto) {
		this.jComboBoxTiposRelacionesParametroProducto = jComboBoxTiposRelacionesParametroProducto;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesParametroProducto(
			JComboBox jComboBoxTiposAccionesParametroProducto) {
		this.jComboBoxTiposAccionesParametroProducto = jComboBoxTiposAccionesParametroProducto;
	}
	
	public void setBorderResaltarTiposRelacionesParametroProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroProducto.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesParametroProducto .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesParametroProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroProducto.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesParametroProducto .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoParametroProducto() {
	//	return jCheckBoxConGraficoDinamicoParametroProducto;
	//}

	//public void setjCheckBoxConGraficoDinamicoParametroProducto(
	//		JCheckBox jCheckBoxConGraficoDinamicoParametroProducto) {
	//	this.jCheckBoxConGraficoDinamicoParametroProducto = jCheckBoxConGraficoDinamicoParametroProducto;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoParametroProducto() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarParametroProducto.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoParametroProducto .setBorder(borderResaltar);		
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
		this.parametroproductoSessionBean=new ParametroProductoSessionBean();
		
		this.parametroproductoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.parametroproductoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.parametroproductoSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=ParametroProductoJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=ParametroProductoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ParametroProductoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ParametroProductoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ParametroProductoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Parametro Producto MANTENIMIENTO"));
		
		
		if(iWidth > 850) {
			iWidth=850;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.parametroproductoSessionBean.getEsGuardarRelacionado()) {
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
		
		ParametroProductoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("ParametroProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarParametroProducto= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarParametroProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarParametroProducto,this.jTtoolBarParametroProducto,
							"nuevo","nuevo","Nuevo"+" "+ParametroProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarParametroProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarParametroProducto,this.jTtoolBarParametroProducto,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarParametroProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarParametroProducto,this.jTtoolBarParametroProducto,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+ParametroProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarParametroProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarParametroProducto,this.jTtoolBarParametroProducto,
							"duplicar","duplicar","Duplicar"+" "+ParametroProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarParametroProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarParametroProducto,this.jTtoolBarParametroProducto,
							"copiar","copiar","Copiar"+" "+ParametroProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarParametroProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarParametroProducto,this.jTtoolBarParametroProducto,
							"ver_form","ver_form","Ver"+" "+ParametroProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarParametroProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarParametroProducto,this.jTtoolBarParametroProducto,
							"recargar","recargar","Recargar"+" "+ParametroProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarParametroProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarParametroProducto,this.jTtoolBarParametroProducto,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarParametroProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarParametroProducto,this.jTtoolBarParametroProducto,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarParametroProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarParametroProducto,this.jTtoolBarParametroProducto,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarParametroProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarParametroProducto,this.jTtoolBarParametroProducto,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarParametroProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarParametroProducto,this.jTtoolBarParametroProducto,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+ParametroProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarParametroProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarParametroProducto,this.jTtoolBarParametroProducto,
							"cerrar","cerrar","Salir"+" "+ParametroProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarParametroProducto=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarParametroProducto;
			
				this.jButtonProcesarInformacionToolBarParametroProducto=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarParametroProducto;
				
		//protected JButton jButtonModificarToolBarParametroProducto;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarParametroProducto=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuParametroProducto=new JMenuMe("General");
		this.jmenuArchivoParametroProducto=new JMenuMe("Archivo");
		this.jmenuAccionesParametroProducto=new JMenuMe("Acciones");
		this.jmenuDatosParametroProducto=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoParametroProducto= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoParametroProducto.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoParametroProducto,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoParametroProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarParametroProducto= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarParametroProducto.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarParametroProducto,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarParametroProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesParametroProducto= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesParametroProducto.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesParametroProducto,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesParametroProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosParametroProducto= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosParametroProducto.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosParametroProducto,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosParametroProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarParametroProducto= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarParametroProducto.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarParametroProducto,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarParametroProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormParametroProducto= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormParametroProducto.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormParametroProducto,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormParametroProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaParametroProducto= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaParametroProducto.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaParametroProducto,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaParametroProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarParametroProducto= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarParametroProducto.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarParametroProducto,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarParametroProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionParametroProducto= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionParametroProducto.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionParametroProducto,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionParametroProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionParametroProducto= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionParametroProducto.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionParametroProducto,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresParametroProducto= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresParametroProducto.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresParametroProducto,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresParametroProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesParametroProducto= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesParametroProducto.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesParametroProducto,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesParametroProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByParametroProducto= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByParametroProducto.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByParametroProducto,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByParametroProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarParametroProducto= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarParametroProducto.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarParametroProducto,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarParametroProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByParametroProducto= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByParametroProducto.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByParametroProducto,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByParametroProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarParametroProducto= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarParametroProducto.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarParametroProducto,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarParametroProducto, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosParametroProducto= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosParametroProducto.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosParametroProducto,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosParametroProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoParametroProducto.add(this.jMenuItemCerrarParametroProducto);
			
			this.jmenuAccionesParametroProducto.add(this.jMenuItemNuevoParametroProducto);
			this.jmenuAccionesParametroProducto.add(this.jMenuItemNuevoGuardarCambiosParametroProducto);
			this.jmenuAccionesParametroProducto.add(this.jMenuItemNuevoRelacionesParametroProducto);
			this.jmenuAccionesParametroProducto.add(this.jMenuItemGuardarCambiosTablaParametroProducto);		
			this.jmenuAccionesParametroProducto.add(this.jMenuItemDuplicarParametroProducto);		
			this.jmenuAccionesParametroProducto.add(this.jMenuItemCopiarParametroProducto);		
			this.jmenuAccionesParametroProducto.add(this.jMenuItemVerFormParametroProducto);		
			
			this.jmenuDatosParametroProducto.add(this.jMenuItemRecargarInformacionParametroProducto);				
			this.jmenuDatosParametroProducto.add(this.jMenuItemAnterioresParametroProducto);				
			this.jmenuDatosParametroProducto.add(this.jMenuItemSiguientesParametroProducto);				
			this.jmenuDatosParametroProducto.add(this.jMenuItemAbrirOrderByParametroProducto);				
			this.jmenuDatosParametroProducto.add(this.jMenuItemMostrarOcultarParametroProducto);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesParametroProducto.add(this.jMenuItemGuardarCambiosParametroProducto);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoParametroProducto, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesParametroProducto, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosParametroProducto, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarParametroProducto.add(this.jmenuArchivoParametroProducto);		
			this.jmenuBarParametroProducto.add(this.jmenuAccionesParametroProducto);		
			this.jmenuBarParametroProducto.add(this.jmenuDatosParametroProducto);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarParametroProducto);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasParametroProducto() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdModuloParametroProducto=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdModuloParametroProducto.setToolTipText("Buscar Por Modulo ");
		this.jButtonFK_IdModuloParametroProducto= new JButtonMe();
		this.jButtonFK_IdModuloParametroProducto.setText("Buscar");
		this.jButtonFK_IdModuloParametroProducto.setToolTipText("Buscar Por Modulo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdModuloParametroProducto,"buscar_button","Buscar Por Modulo ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdModuloParametroProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_moduloFK_IdModuloParametroProducto = new JLabelMe();
		jLabelid_moduloFK_IdModuloParametroProducto.setText("Modulo :");
		jLabelid_moduloFK_IdModuloParametroProducto.setToolTipText("Modulo");
		jLabelid_moduloFK_IdModuloParametroProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_moduloFK_IdModuloParametroProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_moduloFK_IdModuloParametroProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_moduloFK_IdModuloParametroProducto,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_moduloFK_IdModuloParametroProducto= new JComboBoxMe();
		jComboBoxid_moduloFK_IdModuloParametroProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_moduloFK_IdModuloParametroProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_moduloFK_IdModuloParametroProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_moduloFK_IdModuloParametroProducto,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasParametroProducto=new JTabbedPane();


		this.jTabbedPaneBusquedasParametroProducto.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasParametroProducto.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasParametroProducto.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasParametroProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasParametroProducto.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasParametroProducto,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleParametroProducto = new ParametroProductoDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Parametro Producto DATOS");
			this.jInternalFrameDetalleFormParametroProducto = new ParametroProductoDetalleFormJInternalFrame(jDesktopPane,this.parametroproductoSessionBean.getConGuardarRelaciones(),this.parametroproductoSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormParametroProducto = null;//new ParametroProductoDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutParametroProducto= new GridBagLayout();
		
		
		this.jTableDatosParametroProducto = new JTableMe();      
		
		String sToolTipParametroProducto="";
		sToolTipParametroProducto=ParametroProductoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipParametroProducto+="(Facturacion.ParametroProducto)";
		}
		
		if(!this.parametroproductoSessionBean.getEsGuardarRelacionado()) {
			sToolTipParametroProducto+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosParametroProducto.setToolTipText(sToolTipParametroProducto);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosParametroProducto);
		this.jTableDatosParametroProducto.setAutoCreateRowSorter(true);
		this.jTableDatosParametroProducto.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosParametroProducto.setRowSelectionAllowed(true);
		this.jTableDatosParametroProducto.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosParametroProducto,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoParametroProducto = new JButtonMe();
		this.jButtonDuplicarParametroProducto = new JButtonMe();
		this.jButtonCopiarParametroProducto = new JButtonMe();
		this.jButtonVerFormParametroProducto = new JButtonMe();
		this.jButtonNuevoRelacionesParametroProducto = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaParametroProducto = new JButtonMe();
		this.jButtonCerrarParametroProducto = new JButtonMe();
		
		this.jScrollPanelDatosParametroProducto = new JScrollPane();   
        this.jScrollPanelDatosGeneralParametroProducto = new JScrollPane();
		
				
		
		
		this.jPanelAccionesParametroProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Parametro Producto";
		
		if(!this.parametroproductoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosParametroProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Parametro Productos" + this.sPath));
		} else {
			this.jScrollPanelDatosParametroProducto.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralParametroProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesParametroProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesParametroProducto.setToolTipText("Acciones");
        this.jPanelAccionesParametroProducto.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralParametroProducto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosParametroProducto, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoParametroProducto=new ReporteDinamicoJInternalFrame(ParametroProductoConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoParametroProducto();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionParametroProducto=new ImportacionJInternalFrame(ParametroProductoConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionParametroProducto();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByParametroProducto = new JButtonMe();
		
		this.jButtonAbrirOrderByParametroProducto.setText("Orden");
		this.jButtonAbrirOrderByParametroProducto.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByParametroProducto,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByParametroProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByParametroProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByParametroProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByParametroProducto=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByParametroProducto,false,this);
			
			//this.cargarOrderByParametroProducto(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByParametroProducto=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByParametroProducto,true,this);
			
			//this.cargarOrderByParametroProducto(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosParametroProducto.setMinimumSize(new Dimension(400,50));//830
		this.jTableDatosParametroProducto.setMaximumSize(new Dimension(400,50));//830
		this.jTableDatosParametroProducto.setPreferredSize(new Dimension(400,50));//830
		
		this.jScrollPanelDatosParametroProducto.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosParametroProducto.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosParametroProducto.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoParametroProducto.setText("Nuevo");
		this.jButtonDuplicarParametroProducto.setText("Duplicar");
		this.jButtonCopiarParametroProducto.setText("Copiar");
		this.jButtonVerFormParametroProducto.setText("Ver");
		this.jButtonNuevoRelacionesParametroProducto.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaParametroProducto.setText("Guardar");
		this.jButtonCerrarParametroProducto.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoParametroProducto,"nuevo_button","Nuevo",this.parametroproductoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarParametroProducto,"duplicar_button","Duplicar",this.parametroproductoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarParametroProducto,"copiar_button","Copiar",this.parametroproductoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormParametroProducto,"ver_form","Ver",this.parametroproductoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesParametroProducto,"nuevorelaciones_button","Nuevo Rel",this.parametroproductoSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaParametroProducto,"guardarcambiostabla_button","Guardar",this.parametroproductoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarParametroProducto,"cerrar_button","Salir",this.parametroproductoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoParametroProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarParametroProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarParametroProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormParametroProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesParametroProducto, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaParametroProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarParametroProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoParametroProducto.setToolTipText("Nuevo"+" "+ParametroProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarParametroProducto.setToolTipText("Duplicar"+" "+ParametroProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarParametroProducto.setToolTipText("Copiar"+" "+ParametroProductoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormParametroProducto.setToolTipText("Ver"+" "+ParametroProductoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesParametroProducto.setToolTipText("Nuevo Rel"+" "+ParametroProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaParametroProducto.setToolTipText("Guardar"+" "+ParametroProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarParametroProducto.setToolTipText("Salir"+" "+ParametroProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoParametroProducto";
		inputMap = this.jButtonNuevoParametroProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoParametroProducto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoParametroProducto"));
		
		//DUPLICAR
		sMapKey = "DuplicarParametroProducto";
		inputMap = this.jButtonDuplicarParametroProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarParametroProducto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarParametroProducto"));
		
		//COPIAR
		sMapKey = "CopiarParametroProducto";
		inputMap = this.jButtonCopiarParametroProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarParametroProducto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarParametroProducto"));
		
		//VEr FORM
		sMapKey = "VerFormParametroProducto";
		inputMap = this.jButtonVerFormParametroProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormParametroProducto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormParametroProducto"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesParametroProducto";
		inputMap = this.jButtonNuevoRelacionesParametroProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesParametroProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesParametroProducto"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarParametroProducto";
		inputMap = this.jButtonModificarParametroProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarParametroProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarParametroProducto"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarParametroProducto";
		inputMap = this.jButtonCerrarParametroProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarParametroProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarParametroProducto"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaParametroProducto";
		inputMap = this.jButtonGuardarCambiosTablaParametroProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaParametroProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaParametroProducto"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesParametroProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesParametroProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionParametroProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1ParametroProducto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2ParametroProducto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3ParametroProducto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4ParametroProducto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5ParametroProducto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesParametroProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesParametroProducto.setName("jPanelParametrosReportesParametroProducto"); 
		
		this.jPanelParametrosReportesAccionesParametroProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesParametroProducto.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesParametroProducto.setName("jPanelParametrosReportesAccionesParametroProducto"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesParametroProducto, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesParametroProducto, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionParametroProducto = new JButtonMe();
		this.jButtonRecargarInformacionParametroProducto.setText("Recargar");
		this.jButtonRecargarInformacionParametroProducto.setToolTipText("Recargar"+" "+ParametroProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionParametroProducto,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionParametroProducto = new JButtonMe();
		this.jButtonProcesarInformacionParametroProducto.setText("Procesar");
		this.jButtonProcesarInformacionParametroProducto.setToolTipText("Procesar"+" "+ParametroProductoConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionParametroProducto.setVisible(false);
			
		this.jButtonProcesarInformacionParametroProducto.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionParametroProducto.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionParametroProducto.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesParametroProducto = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesParametroProducto.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesParametroProducto.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesParametroProducto = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesParametroProducto.setText("TIPO");       
		this.jComboBoxTiposReportesParametroProducto.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesParametroProducto = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesParametroProducto.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesParametroProducto.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionParametroProducto = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionParametroProducto.setText("Paginacion");
		this.jComboBoxTiposPaginacionParametroProducto.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesParametroProducto = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesParametroProducto.setText("Accion");
		this.jComboBoxTiposRelacionesParametroProducto.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesParametroProducto = new JComboBoxMe();
		//this.jComboBoxTiposAccionesParametroProducto.setText("Accion");
		this.jComboBoxTiposAccionesParametroProducto.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarParametroProducto = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarParametroProducto.setText("Accion");
		this.jComboBoxTiposSeleccionarParametroProducto.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralParametroProducto=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralParametroProducto.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralParametroProducto.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralParametroProducto.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesParametroProducto = new JLabelMe();
		
		this.jLabelAccionesParametroProducto.setText("Acciones");		
		this.jLabelAccionesParametroProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesParametroProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesParametroProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosParametroProducto = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosParametroProducto.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosParametroProducto.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosParametroProducto = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosParametroProducto.setText("Seleccionados");
		this.jCheckBoxSeleccionadosParametroProducto.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaParametroProducto = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaParametroProducto.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaParametroProducto.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteParametroProducto = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteParametroProducto.setText("Graf.");
		this.jCheckBoxConGraficoReporteParametroProducto.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresParametroProducto = new JButtonMe();
		//this.jButtonAnterioresParametroProducto.setText("<<");
        this.jButtonAnterioresParametroProducto.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresParametroProducto,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresParametroProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesParametroProducto = new JButtonMe();
		//this.jButtonSiguientesParametroProducto.setText(">>");
        this.jButtonSiguientesParametroProducto.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesParametroProducto,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesParametroProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosParametroProducto = new JButtonMe();
		this.jButtonNuevoGuardarCambiosParametroProducto.setText("Nue");
        this.jButtonNuevoGuardarCambiosParametroProducto.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosParametroProducto,"nuevoguardarcambios_button","Nue",this.parametroproductoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosParametroProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosParametroProducto";
		inputMap = this.jButtonNuevoGuardarCambiosParametroProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosParametroProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosParametroProducto"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionParametroProducto";
		inputMap = this.jButtonRecargarInformacionParametroProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionParametroProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionParametroProducto"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesParametroProducto";
		inputMap = this.jButtonSiguientesParametroProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesParametroProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesParametroProducto"));
		
		//ANTERIORES		
		sMapKey = "AnterioresParametroProducto";
		inputMap = this.jButtonAnterioresParametroProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresParametroProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresParametroProducto"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasParametroProducto();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesParametroProducto.setMinimumSize(new Dimension(this.getWidth(),ParametroProductoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ParametroProductoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesParametroProducto.setMaximumSize(new Dimension(this.getWidth(),ParametroProductoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ParametroProductoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesParametroProducto.setPreferredSize(new Dimension(this.getWidth(),ParametroProductoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ParametroProductoBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionParametroProducto = new GridBagLayout();

			this.jPanelPaginacionParametroProducto.setLayout(gridaBagLayoutPaginacionParametroProducto);						
			
			this.gridBagConstraintsParametroProducto = new GridBagConstraints();
			this.gridBagConstraintsParametroProducto.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsParametroProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroProducto.gridy = 0;
			this.gridBagConstraintsParametroProducto.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionParametroProducto.add(this.jButtonAnterioresParametroProducto, this.gridBagConstraintsParametroProducto);
					
						
			this.gridBagConstraintsParametroProducto = new GridBagConstraints();
			this.gridBagConstraintsParametroProducto.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsParametroProducto.gridy = 0;
			
			this.jPanelPaginacionParametroProducto.add(this.jButtonNuevoGuardarCambiosParametroProducto, this.gridBagConstraintsParametroProducto);
						
			
			this.gridBagConstraintsParametroProducto = new GridBagConstraints();
			this.gridBagConstraintsParametroProducto.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsParametroProducto.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsParametroProducto.gridy = 0;
			this.jPanelPaginacionParametroProducto.add(this.jButtonSiguientesParametroProducto, this.gridBagConstraintsParametroProducto);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsParametroProducto = new GridBagConstraints();
			this.gridBagConstraintsParametroProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroProducto.gridy = 1;
			this.gridBagConstraintsParametroProducto.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionParametroProducto.add(this.jButtonNuevoParametroProducto, this.gridBagConstraintsParametroProducto);
						
			
			
			if(!this.parametroproductoSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsParametroProducto = new GridBagConstraints();
				this.gridBagConstraintsParametroProducto.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsParametroProducto.gridy = 1;
				this.gridBagConstraintsParametroProducto.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionParametroProducto.add(this.jButtonGuardarCambiosTablaParametroProducto, this.gridBagConstraintsParametroProducto);
			}
			
			
			
			this.gridBagConstraintsParametroProducto = new GridBagConstraints();
			this.gridBagConstraintsParametroProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroProducto.gridy = 1;
			this.gridBagConstraintsParametroProducto.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionParametroProducto.add(this.jButtonDuplicarParametroProducto, this.gridBagConstraintsParametroProducto);
			
			this.gridBagConstraintsParametroProducto = new GridBagConstraints();
			this.gridBagConstraintsParametroProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroProducto.gridy = 1;
			this.gridBagConstraintsParametroProducto.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionParametroProducto.add(this.jButtonCopiarParametroProducto, this.gridBagConstraintsParametroProducto);
		
			this.gridBagConstraintsParametroProducto = new GridBagConstraints();
			this.gridBagConstraintsParametroProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroProducto.gridy = 1;
			this.gridBagConstraintsParametroProducto.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionParametroProducto.add(this.jButtonVerFormParametroProducto, this.gridBagConstraintsParametroProducto);
		
			this.gridBagConstraintsParametroProducto = new GridBagConstraints();
			this.gridBagConstraintsParametroProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroProducto.gridy = 1;
			this.gridBagConstraintsParametroProducto.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionParametroProducto.add(this.jButtonCerrarParametroProducto, this.gridBagConstraintsParametroProducto);
		
		
		
		this.jButtonRecargarInformacionParametroProducto.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionParametroProducto.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionParametroProducto.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionParametroProducto, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesParametroProducto.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesParametroProducto.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesParametroProducto.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesParametroProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesParametroProducto.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesParametroProducto.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesParametroProducto.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesParametroProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesParametroProducto.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesParametroProducto.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesParametroProducto.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesParametroProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionParametroProducto.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionParametroProducto.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionParametroProducto.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionParametroProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesParametroProducto.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesParametroProducto.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesParametroProducto.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesParametroProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesParametroProducto.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesParametroProducto.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesParametroProducto.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesParametroProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarParametroProducto.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarParametroProducto.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarParametroProducto.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarParametroProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaParametroProducto.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaParametroProducto.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaParametroProducto.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaParametroProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteParametroProducto.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteParametroProducto.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteParametroProducto.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteParametroProducto, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosParametroProducto.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosParametroProducto.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosParametroProducto.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosParametroProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosParametroProducto.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosParametroProducto.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosParametroProducto.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosParametroProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesParametroProducto = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesParametroProducto = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1ParametroProducto = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2ParametroProducto = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3ParametroProducto = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4ParametroProducto = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesParametroProducto.setLayout(gridaBagParametrosReportesParametroProducto);
			this.jPanelParametrosReportesAccionesParametroProducto.setLayout(gridaBagParametrosReportesAccionesParametroProducto);
			
			
			this.jPanelParametrosAuxiliar1ParametroProducto.setLayout(gridaBagParametrosAuxiliar1ParametroProducto);
			this.jPanelParametrosAuxiliar2ParametroProducto.setLayout(gridaBagParametrosAuxiliar2ParametroProducto);
			this.jPanelParametrosAuxiliar3ParametroProducto.setLayout(gridaBagParametrosAuxiliar3ParametroProducto);
			this.jPanelParametrosAuxiliar4ParametroProducto.setLayout(gridaBagParametrosAuxiliar4ParametroProducto);
			//this.jPanelParametrosAuxiliar5ParametroProducto.setLayout(gridaBagParametrosAuxiliar2ParametroProducto);			
			
			
			
			
			this.gridBagConstraintsParametroProducto = new GridBagConstraints();
			this.gridBagConstraintsParametroProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroProducto.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsParametroProducto.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesParametroProducto.add(this.jButtonRecargarInformacionParametroProducto, this.gridBagConstraintsParametroProducto);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsParametroProducto = new GridBagConstraints();
			this.gridBagConstraintsParametroProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroProducto.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsParametroProducto.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ParametroProducto.add(this.jComboBoxTiposPaginacionParametroProducto, this.gridBagConstraintsParametroProducto);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsParametroProducto = new GridBagConstraints();
			this.gridBagConstraintsParametroProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroProducto.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsParametroProducto.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ParametroProducto.add(this.jCheckBoxConAltoMaximoTablaParametroProducto, this.gridBagConstraintsParametroProducto);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsParametroProducto = new GridBagConstraints();
			this.gridBagConstraintsParametroProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroProducto.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsParametroProducto.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ParametroProducto.add(this.jComboBoxTiposArchivosReportesParametroProducto, this.gridBagConstraintsParametroProducto);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsParametroProducto = new GridBagConstraints();
			this.gridBagConstraintsParametroProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroProducto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroProducto.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesParametroProducto.add(this.jPanelParametrosAuxiliar1ParametroProducto, this.gridBagConstraintsParametroProducto);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsParametroProducto = new GridBagConstraints();
			this.gridBagConstraintsParametroProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroProducto.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsParametroProducto.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4ParametroProducto.add(this.jComboBoxTiposReportesParametroProducto, this.gridBagConstraintsParametroProducto);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsParametroProducto = new GridBagConstraints();
			this.gridBagConstraintsParametroProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroProducto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroProducto.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesParametroProducto.add(this.jPanelParametrosAuxiliar4ParametroProducto, this.gridBagConstraintsParametroProducto);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsParametroProducto = new GridBagConstraints();
			this.gridBagConstraintsParametroProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroProducto.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsParametroProducto.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesParametroProducto.add(this.jComboBoxTiposReportesParametroProducto, this.gridBagConstraintsParametroProducto);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsParametroProducto = new GridBagConstraints();
			this.gridBagConstraintsParametroProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroProducto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroProducto.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesParametroProducto.add(this.jCheckBoxGenerarReporteParametroProducto, this.gridBagConstraintsParametroProducto);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsParametroProducto = new GridBagConstraints();
			this.gridBagConstraintsParametroProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroProducto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroProducto.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesParametroProducto.add(this.jPanelParametrosAuxiliar2ParametroProducto, this.gridBagConstraintsParametroProducto);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsParametroProducto = new GridBagConstraints();
			this.gridBagConstraintsParametroProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroProducto.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsParametroProducto.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesParametroProducto.add(this.jLabelAccionesParametroProducto, this.gridBagConstraintsParametroProducto);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsParametroProducto = new GridBagConstraints();
				this.gridBagConstraintsParametroProducto.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsParametroProducto.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsParametroProducto.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesParametroProducto.add(this.jButtonAbrirOrderByParametroProducto, this.gridBagConstraintsParametroProducto);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsParametroProducto = new GridBagConstraints();
			this.gridBagConstraintsParametroProducto.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsParametroProducto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroProducto.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesParametroProducto.add(this.jComboBoxTiposSeleccionarParametroProducto, this.gridBagConstraintsParametroProducto);			
			
			
			/*
			this.gridBagConstraintsParametroProducto = new GridBagConstraints();
			this.gridBagConstraintsParametroProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroProducto.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsParametroProducto.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesParametroProducto.add(this.jCheckBoxSeleccionarTodosParametroProducto, this.gridBagConstraintsParametroProducto);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsParametroProducto = new GridBagConstraints();
			this.gridBagConstraintsParametroProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroProducto.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsParametroProducto.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ParametroProducto.add(this.jCheckBoxSeleccionarTodosParametroProducto, this.gridBagConstraintsParametroProducto);															
				
			this.gridBagConstraintsParametroProducto = new GridBagConstraints();
			this.gridBagConstraintsParametroProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroProducto.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsParametroProducto.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ParametroProducto.add(this.jCheckBoxSeleccionadosParametroProducto, this.gridBagConstraintsParametroProducto);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsParametroProducto = new GridBagConstraints();
			this.gridBagConstraintsParametroProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroProducto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroProducto.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesParametroProducto.add(this.jPanelParametrosAuxiliar3ParametroProducto, this.gridBagConstraintsParametroProducto);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsParametroProducto = new GridBagConstraints();
			this.gridBagConstraintsParametroProducto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroProducto.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesParametroProducto.add(this.jComboBoxTiposAccionesParametroProducto, this.gridBagConstraintsParametroProducto);
	
				
			this.gridBagConstraintsParametroProducto = new GridBagConstraints();
			this.gridBagConstraintsParametroProducto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroProducto.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesParametroProducto.add(this.jTextFieldValorCampoGeneralParametroProducto, this.gridBagConstraintsParametroProducto);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosParametroProducto = new GridBagLayout();

			this.jScrollPanelDatosParametroProducto.setLayout(gridaBagLayoutDatosParametroProducto);
			
			this.gridBagConstraintsParametroProducto = new GridBagConstraints();
			this.gridBagConstraintsParametroProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroProducto.gridy = 0;
			this.gridBagConstraintsParametroProducto.gridx = 0;
			
			this.jScrollPanelDatosParametroProducto.add(this.jTableDatosParametroProducto, this.gridBagConstraintsParametroProducto);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosParametroProducto.setViewportView(this.jTableDatosParametroProducto);
		this.jTableDatosParametroProducto.setFillsViewportHeight(true);
		this.jTableDatosParametroProducto.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesParametroProducto= new GridBagLayout();
		this.jPanelAccionesParametroProducto.setLayout(gridaBagLayoutAccionesParametroProducto);
		
		
		/*	
		this.gridBagConstraintsParametroProducto = new GridBagConstraints();
		this.gridBagConstraintsParametroProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroProducto.gridy = 0;
		this.gridBagConstraintsParametroProducto.gridx = 0;
			
		this.jPanelAccionesParametroProducto.add(this.jButtonNuevoParametroProducto, this.gridBagConstraintsParametroProducto);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdModuloParametroProducto= new GridBagLayout();
		gridaBagLayoutFK_IdModuloParametroProducto.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdModuloParametroProducto.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdModuloParametroProducto.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdModuloParametroProducto.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdModuloParametroProducto.setLayout(gridaBagLayoutFK_IdModuloParametroProducto);

		gridBagConstraintsParametroProducto = new GridBagConstraints();
		gridBagConstraintsParametroProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsParametroProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsParametroProducto.gridy = 0;
		gridBagConstraintsParametroProducto.gridx = 0;
		jPanelFK_IdModuloParametroProducto.add(jLabelid_moduloFK_IdModuloParametroProducto, gridBagConstraintsParametroProducto);

		gridBagConstraintsParametroProducto = new GridBagConstraints();
		gridBagConstraintsParametroProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsParametroProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsParametroProducto.gridy = 0;
		gridBagConstraintsParametroProducto.gridx = 1;
		jPanelFK_IdModuloParametroProducto.add(jComboBoxid_moduloFK_IdModuloParametroProducto, gridBagConstraintsParametroProducto);

		gridBagConstraintsParametroProducto = new GridBagConstraints();
		gridBagConstraintsParametroProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsParametroProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsParametroProducto.gridy = 1;
		gridBagConstraintsParametroProducto.gridx =1;
		jPanelFK_IdModuloParametroProducto.add(jButtonFK_IdModuloParametroProducto, gridBagConstraintsParametroProducto);

		jTabbedPaneBusquedasParametroProducto.addTab("1.-Por Modulo ", jPanelFK_IdModuloParametroProducto);
		jTabbedPaneBusquedasParametroProducto.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutParametroProducto = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutParametroProducto);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.parametroproductoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsParametroProducto = new GridBagConstraints();						
			this.gridBagConstraintsParametroProducto.gridy = iGridyPrincipal++;
			this.gridBagConstraintsParametroProducto.gridx = 0;		
			//this.gridBagConstraintsParametroProducto.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroProducto.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsParametroProducto.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarParametroProducto, this.gridBagConstraintsParametroProducto);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsParametroProducto = new GridBagConstraints();
		this.gridBagConstraintsParametroProducto.gridy = iGridyPrincipal++;
		this.gridBagConstraintsParametroProducto.gridx = 0;		
		//this.gridBagConstraintsParametroProducto.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroProducto.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsParametroProducto.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsParametroProducto);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsParametroProducto = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsParametroProducto.gridy = iGridyPrincipal++;
			this.gridBagConstraintsParametroProducto.gridx = 0;		
			this.gridBagConstraintsParametroProducto.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroProducto.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsParametroProducto.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasParametroProducto, this.gridBagConstraintsParametroProducto);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsParametroProducto = new GridBagConstraints();
		this.gridBagConstraintsParametroProducto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsParametroProducto.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesParametroProducto, this.gridBagConstraintsParametroProducto);								
		
		
		/*
		this.gridBagConstraintsParametroProducto = new GridBagConstraints();
		this.gridBagConstraintsParametroProducto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsParametroProducto.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesParametroProducto, this.gridBagConstraintsParametroProducto);
		*/		
		
		this.gridBagConstraintsParametroProducto = new GridBagConstraints();
		this.gridBagConstraintsParametroProducto.gridy =iGridyPrincipal++;
		this.gridBagConstraintsParametroProducto.gridx =0;
		this.gridBagConstraintsParametroProducto.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsParametroProducto.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosParametroProducto, this.gridBagConstraintsParametroProducto);
				
		
		this.gridBagConstraintsParametroProducto = new GridBagConstraints();
		this.gridBagConstraintsParametroProducto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsParametroProducto.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionParametroProducto, this.gridBagConstraintsParametroProducto);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(ParametroProductoJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosParametroProducto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosParametroProducto = new GridBagLayout();
			this.jPanelBusquedasParametrosParametroProducto.setLayout(gridaBagLayoutBusquedasParametrosParametroProducto);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralParametroProducto=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralParametroProducto.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralParametroProducto.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralParametroProducto.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsParametroProducto = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsParametroProducto = new GridBagConstraints();
		this.gridBagConstraintsParametroProducto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsParametroProducto.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposParametroProducto, this.gridBagConstraintsParametroProducto);
			
			
		this.gridBagConstraintsParametroProducto = new GridBagConstraints();
		this.gridBagConstraintsParametroProducto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsParametroProducto.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosParametroProducto, this.gridBagConstraintsParametroProducto);
		
			
		this.gridBagConstraintsParametroProducto = new GridBagConstraints();
		this.gridBagConstraintsParametroProducto.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsParametroProducto.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesParametroProducto, this.gridBagConstraintsParametroProducto);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralParametroProducto;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoParametroProducto() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoParametroProducto = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoParametroProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoParametroProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoParametroProducto.setName("jPanelReporteDinamicoParametroProducto"); 
		
		this.jPanelReporteDinamicoParametroProducto.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoParametroProducto.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoParametroProducto.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoParametroProducto.setLayout(gridaBagLayoutReporteDinamicoParametroProducto);
		
		
		this.jInternalFrameReporteDinamicoParametroProducto= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoParametroProducto = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteParametroProducto= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoParametroProducto.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoParametroProducto.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoParametroProducto.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoParametroProducto.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoParametroProducto.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoParametroProducto.setResizable(true);
	    this.jInternalFrameReporteDinamicoParametroProducto.setClosable(true);
	    this.jInternalFrameReporteDinamicoParametroProducto.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoParametroProducto.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoParametroProducto.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoParametroProducto.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoParametroProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Parametro Productos"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteParametroProducto = new JLabelMe();

		this.jLabelColumnasSelectReporteParametroProducto.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteParametroProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteParametroProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteParametroProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsParametroProducto = new GridBagConstraints();
		this.gridBagConstraintsParametroProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroProducto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsParametroProducto.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoParametroProducto.add(this.jLabelColumnasSelectReporteParametroProducto, this.gridBagConstraintsParametroProducto);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteParametroProducto = new JList<Reporte>();
		this.jListColumnasSelectReporteParametroProducto.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteParametroProducto.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteParametroProducto.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteParametroProducto.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteParametroProducto.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteParametroProducto=new JScrollPane(this.jListColumnasSelectReporteParametroProducto);
			
			this.jScrollColumnasSelectReporteParametroProducto.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteParametroProducto.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteParametroProducto.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteParametroProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsParametroProducto = new GridBagConstraints();
		this.gridBagConstraintsParametroProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroProducto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsParametroProducto.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoParametroProducto.add(this.jListColumnasSelectReporteParametroProducto, this.gridBagConstraintsParametroProducto);
		this.jPanelReporteDinamicoParametroProducto.add(this.jScrollColumnasSelectReporteParametroProducto, this.gridBagConstraintsParametroProducto);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteParametroProducto = new JLabelMe();

		this.jLabelRelacionesSelectReporteParametroProducto.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteParametroProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteParametroProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteParametroProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteParametroProducto = new JList<Reporte>();
		this.jListRelacionesSelectReporteParametroProducto.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteParametroProducto.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteParametroProducto.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteParametroProducto.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteParametroProducto.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteParametroProducto=new JScrollPane(this.jListRelacionesSelectReporteParametroProducto);
			
			this.jScrollRelacionesSelectReporteParametroProducto.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteParametroProducto.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteParametroProducto.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteParametroProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoParametroProducto = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoParametroProducto = new JComboBoxMe();
		this.jListColumnasValoresGraficoParametroProducto = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoParametroProducto = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoParametroProducto.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoParametroProducto.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoParametroProducto.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoParametroProducto.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoParametroProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoParametroProducto = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoParametroProducto.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoParametroProducto.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoParametroProducto.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoParametroProducto.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoParametroProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoParametroProducto = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoParametroProducto.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoParametroProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoParametroProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoParametroProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsParametroProducto = new GridBagConstraints();
		this.gridBagConstraintsParametroProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroProducto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsParametroProducto.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoParametroProducto.add(this.jLabelGenerarExcelReporteDinamicoParametroProducto, this.gridBagConstraintsParametroProducto);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoParametroProducto = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoParametroProducto.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoParametroProducto,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoParametroProducto.setToolTipText("Generar EXCEL"+" "+ParametroProductoConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsParametroProducto = new GridBagConstraints();
		//this.gridBagConstraintsParametroProducto.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsParametroProducto.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsParametroProducto.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoParametroProducto.add(this.jButtonGenerarExcelReporteDinamicoParametroProducto, this.gridBagConstraintsParametroProducto);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsParametroProducto = new GridBagConstraints();
		this.gridBagConstraintsParametroProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroProducto.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsParametroProducto.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoParametroProducto.add(this.jComboBoxTiposReportesDinamicoParametroProducto, this.gridBagConstraintsParametroProducto);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoParametroProducto = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoParametroProducto.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoParametroProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoParametroProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoParametroProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsParametroProducto = new GridBagConstraints();
		this.gridBagConstraintsParametroProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroProducto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsParametroProducto.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoParametroProducto.add(this.jLabelTiposArchivoReporteDinamicoParametroProducto, this.gridBagConstraintsParametroProducto);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsParametroProducto = new GridBagConstraints();
		this.gridBagConstraintsParametroProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroProducto.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsParametroProducto.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoParametroProducto.add(this.jComboBoxTiposArchivosReportesDinamicoParametroProducto, this.gridBagConstraintsParametroProducto);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoParametroProducto = new JButtonMe();
		this.jButtonGenerarReporteDinamicoParametroProducto.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoParametroProducto,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoParametroProducto.setToolTipText("Generar"+" "+ParametroProductoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsParametroProducto = new GridBagConstraints();
		this.gridBagConstraintsParametroProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroProducto.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsParametroProducto.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoParametroProducto.add(this.jButtonGenerarReporteDinamicoParametroProducto, this.gridBagConstraintsParametroProducto);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoParametroProducto = new JButtonMe();
		this.jButtonCerrarReporteDinamicoParametroProducto.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoParametroProducto,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoParametroProducto.setToolTipText("Cancelar"+" "+ParametroProductoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsParametroProducto = new GridBagConstraints();
		this.gridBagConstraintsParametroProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroProducto.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsParametroProducto.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoParametroProducto.add(this.jButtonCerrarReporteDinamicoParametroProducto, this.gridBagConstraintsParametroProducto);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalParametroProducto = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoParametroProducto= new JScrollPane(jPanelReporteDinamicoParametroProducto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoParametroProducto.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoParametroProducto.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoParametroProducto.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoParametroProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Parametro Productos"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsParametroProducto = new GridBagConstraints();
		this.gridBagConstraintsParametroProducto.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsParametroProducto.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsParametroProducto.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoParametroProducto.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoParametroProducto.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalParametroProducto);
		this.jInternalFrameReporteDinamicoParametroProducto.getContentPane().add(this.jScrollPanelReporteDinamicoParametroProducto, this.gridBagConstraintsParametroProducto);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionParametroProducto() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionParametroProducto = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionParametroProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionParametroProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionParametroProducto.setName("jPanelImportacionParametroProducto"); 
		
		this.jPanelImportacionParametroProducto.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionParametroProducto.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionParametroProducto.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionParametroProducto.setLayout(gridaBagLayoutImportacionParametroProducto);
		
		
		this.jInternalFrameImportacionParametroProducto= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionParametroProducto= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionParametroProducto = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteParametroProducto= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionParametroProducto.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionParametroProducto.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionParametroProducto.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionParametroProducto.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionParametroProducto.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionParametroProducto.setResizable(true);
	    this.jInternalFrameImportacionParametroProducto.setClosable(true);
	    this.jInternalFrameImportacionParametroProducto.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionParametroProducto.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionParametroProducto.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionParametroProducto.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionParametroProducto.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionParametroProducto.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionParametroProducto.setResizable(true);
	    this.jInternalFrameImportacionParametroProducto.setClosable(true);
	    this.jInternalFrameImportacionParametroProducto.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionParametroProducto.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionParametroProducto.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionParametroProducto.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionParametroProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Parametro Productos"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionParametroProducto = new JLabelMe();

		this.jLabelArchivoImportacionParametroProducto.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionParametroProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionParametroProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionParametroProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsParametroProducto = new GridBagConstraints();
		this.gridBagConstraintsParametroProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroProducto.gridy = iPosYImportacion;		
		this.gridBagConstraintsParametroProducto.gridx = iPosXImportacion++;
			
		this.jPanelImportacionParametroProducto.add(this.jLabelArchivoImportacionParametroProducto, this.gridBagConstraintsParametroProducto);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionParametroProducto = new JFileChooser();		
		this.jFileChooserImportacionParametroProducto.setToolTipText("ESCOGER ARCHIVO"+" "+ParametroProductoConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionParametroProducto = new JButtonMe();
		this.jButtonAbrirImportacionParametroProducto.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionParametroProducto,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionParametroProducto.setToolTipText("Generar"+" "+ParametroProductoConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsParametroProducto = new GridBagConstraints();
		this.gridBagConstraintsParametroProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroProducto.gridy = iPosYImportacion;
		this.gridBagConstraintsParametroProducto.gridx = iPosXImportacion++;
							
		this.jPanelImportacionParametroProducto.add(this.jButtonAbrirImportacionParametroProducto, this.gridBagConstraintsParametroProducto);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionParametroProducto = new JLabelMe();

		this.jLabelPathArchivoImportacionParametroProducto.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionParametroProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionParametroProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionParametroProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsParametroProducto = new GridBagConstraints();
		this.gridBagConstraintsParametroProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroProducto.gridy = iPosYImportacion;		
		this.gridBagConstraintsParametroProducto.gridx = iPosXImportacion++;
			
		this.jPanelImportacionParametroProducto.add(this.jLabelPathArchivoImportacionParametroProducto, this.gridBagConstraintsParametroProducto);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionParametroProducto=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionParametroProducto.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionParametroProducto.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionParametroProducto.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsParametroProducto = new GridBagConstraints();
		this.gridBagConstraintsParametroProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroProducto.gridy = iPosYImportacion;
		this.gridBagConstraintsParametroProducto.gridx = iPosXImportacion++;
							
		this.jPanelImportacionParametroProducto.add(this.jTextFieldPathArchivoImportacionParametroProducto, this.gridBagConstraintsParametroProducto);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionParametroProducto = new JButtonMe();
		this.jButtonGenerarImportacionParametroProducto.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionParametroProducto,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionParametroProducto.setToolTipText("Generar"+" "+ParametroProductoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsParametroProducto = new GridBagConstraints();
		this.gridBagConstraintsParametroProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroProducto.gridy = iPosYImportacion;
		this.gridBagConstraintsParametroProducto.gridx = iPosXImportacion++;
							
		this.jPanelImportacionParametroProducto.add(this.jButtonGenerarImportacionParametroProducto, this.gridBagConstraintsParametroProducto);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionParametroProducto = new JButtonMe();
		this.jButtonCerrarImportacionParametroProducto.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionParametroProducto,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionParametroProducto.setToolTipText("Cancelar"+" "+ParametroProductoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsParametroProducto = new GridBagConstraints();
		this.gridBagConstraintsParametroProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroProducto.gridy = iPosYImportacion;
		this.gridBagConstraintsParametroProducto.gridx = iPosXImportacion++;
							
		this.jPanelImportacionParametroProducto.add(this.jButtonCerrarImportacionParametroProducto, this.gridBagConstraintsParametroProducto);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalParametroProducto = new GridBagLayout();
		
		this.jScrollPanelImportacionParametroProducto= new JScrollPane(jPanelImportacionParametroProducto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsParametroProducto = new GridBagConstraints();
		this.gridBagConstraintsParametroProducto.gridy =iPosYImportacion;
		this.gridBagConstraintsParametroProducto.gridx =iPosXImportacion;
		this.gridBagConstraintsParametroProducto.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionParametroProducto.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionParametroProducto.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalParametroProducto);
		this.jInternalFrameImportacionParametroProducto.getContentPane().add(this.jScrollPanelImportacionParametroProducto, this.gridBagConstraintsParametroProducto);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByParametroProducto(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByParametroProducto = new JButtonMe();
			this.jButtonAbrirOrderByParametroProducto.setText("Orden");
			this.jButtonAbrirOrderByParametroProducto.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByParametroProducto,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByParametroProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByParametroProducto";
			inputMap = this.jButtonAbrirOrderByParametroProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByParametroProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByParametroProducto"));
		
		
			GridBagLayout gridaBagLayoutOrderByParametroProducto = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByParametroProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByParametroProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByParametroProducto.setName("jPanelOrderByParametroProducto"); 
			
			this.jPanelOrderByParametroProducto.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByParametroProducto.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByParametroProducto.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByParametroProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByParametroProducto.setLayout(gridaBagLayoutOrderByParametroProducto);
			
			
			this.jTableDatosParametroProductoOrderBy = new JTableMe();        
			this.jTableDatosParametroProductoOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosParametroProductoOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosParametroProductoOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosParametroProductoOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosParametroProductoOrderBy.setViewportView(this.jTableDatosParametroProductoOrderBy);
			this.jTableDatosParametroProductoOrderBy.setFillsViewportHeight(true);
			this.jTableDatosParametroProductoOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByParametroProducto= new OrderByJInternalFrame();
			this.jInternalFrameOrderByParametroProducto= new OrderByJInternalFrame();
			this.jScrollPanelOrderByParametroProducto = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteParametroProducto= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByParametroProducto.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByParametroProducto.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByParametroProducto.setTitle("Orden");
			this.jInternalFrameOrderByParametroProducto.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByParametroProducto.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByParametroProducto.setResizable(true);
			this.jInternalFrameOrderByParametroProducto.setClosable(true);
			this.jInternalFrameOrderByParametroProducto.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByParametroProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByParametroProducto.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByParametroProducto.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByParametroProducto.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByParametroProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByParametroProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Parametro Productos"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsParametroProducto = new GridBagConstraints();
			this.gridBagConstraintsParametroProducto.gridy =iPosYOrderBy++;
			this.gridBagConstraintsParametroProducto.gridx =iPosXOrderBy;
			this.gridBagConstraintsParametroProducto.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsParametroProducto.ipady =150;
				
			this.jPanelOrderByParametroProducto.add(jScrollPanelDatosParametroProductoOrderBy, this.gridBagConstraintsParametroProducto);//this.jTableDatosParametroProductoTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByParametroProducto = new JButtonMe();
			this.jButtonCerrarOrderByParametroProducto.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByParametroProducto,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByParametroProducto.setToolTipText("Cancelar"+" "+ParametroProductoConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByParametroProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsParametroProducto = new GridBagConstraints();
			this.gridBagConstraintsParametroProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroProducto.gridy = iPosYOrderBy++;
			this.gridBagConstraintsParametroProducto.gridx = iPosXOrderBy;
									
			this.jPanelOrderByParametroProducto.add(this.jButtonCerrarOrderByParametroProducto, this.gridBagConstraintsParametroProducto);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalParametroProducto = new GridBagLayout();
			
			this.jScrollPanelOrderByParametroProducto= new JScrollPane(jPanelOrderByParametroProducto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsParametroProducto = new GridBagConstraints();
			this.gridBagConstraintsParametroProducto.gridy =iPosYOrderBy;
			this.gridBagConstraintsParametroProducto.gridx =iPosXOrderBy;
			this.gridBagConstraintsParametroProducto.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByParametroProducto.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByParametroProducto.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalParametroProducto);
			
			this.jInternalFrameOrderByParametroProducto.getContentPane().add(this.jScrollPanelOrderByParametroProducto, this.gridBagConstraintsParametroProducto);			
		
		} else {
			this.jButtonAbrirOrderByParametroProducto = new JButtonMe();
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
		int iWidthTableCalculado=0;//1830
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=830;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1000;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.parametroproductoSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosParametroProducto.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosParametroProducto.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosParametroProducto.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosParametroProducto.getRowHeight();//ParametroProductoConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.parametroproductoSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > ParametroProductoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaParametroProducto.isSelected()) {
					iHeightTable=ParametroProductoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ParametroProductoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ParametroProductoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > ParametroProductoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaParametroProducto.isSelected()) {
					iHeightTable=ParametroProductoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ParametroProductoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ParametroProductoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosParametroProducto.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosParametroProducto.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosParametroProducto.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosParametroProducto.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosParametroProducto.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosParametroProducto.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByParametroProducto!=null && this.jInternalFrameOrderByParametroProducto.getjTableDatosOrderBy()!=null) {
			//if(!this.parametroproductoSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByParametroProducto.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByParametroProducto.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByParametroProducto.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByParametroProducto.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByParametroProducto.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByParametroProducto.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByParametroProducto.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosParametroProducto.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosParametroProducto.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosParametroProducto.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=parametroproductoLogic.getParametroProductos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=parametroproductos.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<ParametroProducto> TraerParametroProductoBeans(List<ParametroProducto> parametroproductos,ArrayList<Classe> classes)throws Exception {
		try {
			for(ParametroProducto parametroproducto:parametroproductos) {
					
				if(!(ParametroProductoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || ParametroProductoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					parametroproducto.setsDetalleGeneralEntityReporte(ParametroProductoConstantesFunciones.getParametroProductoDescripcion(parametroproducto));
										
						
					
						
					
				} else  {
							
					//parametroproducto.setsDetalleGeneralEntityReporte(parametroproducto.getsDetalleGeneralEntityReporte());
										
				}
				
				//parametroproductobeans.add(parametroproductobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return parametroproductos;
    }
	//PARA REPORTES FIN
}
