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
package com.bydan.erp.importaciones.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;

import com.bydan.erp.importaciones.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.importaciones.presentation.swing.jinternalframes.*;
import com.bydan.erp.importaciones.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.facturacion.business.entity.*;

//import com.bydan.erp.importaciones.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.importaciones.business.entity.*;
import com.bydan.erp.importaciones.util.ContenedorConstantesFunciones;

import com.bydan.erp.importaciones.business.logic.*;
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
public class ContenedorJInternalFrame extends ContenedorBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarContenedor;
	
	protected JMenuBar jmenuBarContenedor;
	
	protected JMenu jmenuContenedor;
	protected JMenu jmenuDatosContenedor;
	protected JMenu jmenuArchivoContenedor;
	protected JMenu jmenuAccionesContenedor;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosContenedor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutContenedor;	
	protected GridBagConstraints gridBagConstraintsContenedor;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public ContenedorDetalleFormJInternalFrame jInternalFrameDetalleFormContenedor;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoContenedor;	
	protected ImportacionJInternalFrame jInternalFrameImportacionContenedor;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected PedidoBeanSwingJInternalFrame pedidoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_pedido="";
	
	public ContenedorSessionBean contenedorSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public PedidoSessionBean pedidoSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<Contenedor> contenedors;		
	public List<Contenedor> contenedorsEliminados;	
	public List<Contenedor> contenedorsAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByContenedor;		
	protected JButton jButtonAbrirOrderByContenedor;
	
	
	//protected JPanel jPanelOrderByContenedor;
	//public JScrollPane jScrollPanelOrderByContenedor;	
	//protected JButton jButtonCerrarOrderByContenedor;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public ContenedorLogic contenedorLogic;
	
	
	
	public JScrollPane jScrollPanelDatosContenedor;
	public JScrollPane jScrollPanelDatosEdicionContenedor;
	public JScrollPane jScrollPanelDatosGeneralContenedor;
    
	
	
	//public JScrollPane jScrollPanelDatosContenedorOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoContenedor;
	//public JScrollPane jScrollPanelImportacionContenedor;
	
	
	
	protected JPanel jPanelAccionesContenedor;
	
    protected JPanel jPanelPaginacionContenedor;
    protected JPanel jPanelParametrosReportesContenedor;
	protected JPanel jPanelParametrosReportesAccionesContenedor;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1Contenedor;
	protected JPanel jPanelParametrosAuxiliar2Contenedor;
	protected JPanel jPanelParametrosAuxiliar3Contenedor;
	protected JPanel jPanelParametrosAuxiliar4Contenedor;
	//protected JPanel jPanelParametrosAuxiliar5Contenedor;
	
	
	
	//protected JPanel jPanelReporteDinamicoContenedor;
	//protected JPanel jPanelImportacionContenedor;
	
	
	public JTable jTableDatosContenedor;
	
	
	
	//public JTable jTableDatosContenedorOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoContenedor;
	protected JButton jButtonDuplicarContenedor;
	protected JButton jButtonCopiarContenedor;
	protected JButton jButtonVerFormContenedor;
	protected JButton jButtonNuevoRelacionesContenedor;
	protected JButton jButtonModificarContenedor;
	
    protected JButton jButtonGuardarCambiosTablaContenedor;
	protected JButton jButtonCerrarContenedor;
	
	
	protected JButton jButtonRecargarInformacionContenedor;
	protected JButton jButtonProcesarInformacionContenedor;
	
	
	protected JButton jButtonAnterioresContenedor;
	protected JButton jButtonSiguientesContenedor;
	protected JButton jButtonNuevoGuardarCambiosContenedor;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoContenedor;
	//protected JButton jButtonCerrarReporteDinamicoContenedor;
	//protected JButton jButtonGenerarExcelReporteDinamicoContenedor;	
	
	
	
	//protected JButton jButtonAbrirImportacionContenedor;
	//protected JButton jButtonGenerarImportacionContenedor;
	//protected JButton jButtonCerrarImportacionContenedor;
	//protected JFileChooser jFileChooserImportacionContenedor;
	//protected File fileImportacionContenedor;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarContenedor;
	protected JButton jButtonDuplicarToolBarContenedor;
	protected JButton jButtonNuevoRelacionesToolBarContenedor;
	
	
	public JButton jButtonGuardarCambiosToolBarContenedor;
	protected JButton jButtonCopiarToolBarContenedor;
	protected JButton jButtonVerFormToolBarContenedor;
	public JButton jButtonGuardarCambiosTablaToolBarContenedor;
	protected JButton jButtonMostrarOcultarTablaToolBarContenedor;
	protected JButton jButtonCerrarToolBarContenedor;
	
	protected JButton jButtonRecargarInformacionToolBarContenedor;
	protected JButton jButtonProcesarInformacionToolBarContenedor;
	protected JButton jButtonAnterioresToolBarContenedor;
	protected JButton jButtonSiguientesToolBarContenedor;
	protected JButton jButtonNuevoGuardarCambiosToolBarContenedor;
	protected JButton jButtonAbrirOrderByToolBarContenedor;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoContenedor;
	protected JMenuItem jMenuItemDuplicarContenedor;
	protected JMenuItem jMenuItemNuevoRelacionesContenedor;
	
	
	protected JMenuItem jMenuItemGuardarCambiosContenedor;
	protected JMenuItem jMenuItemCopiarContenedor;
	protected JMenuItem jMenuItemVerFormContenedor;
	protected JMenuItem jMenuItemGuardarCambiosTablaContenedor;
	protected JMenuItem jMenuItemCerrarContenedor;
	protected JMenuItem jMenuItemDetalleCerrarContenedor;
	protected JMenuItem jMenuItemDetalleAbrirOrderByContenedor;
	protected JMenuItem jMenuItemDetalleMostarOcultarContenedor;
	
	protected JMenuItem jMenuItemRecargarInformacionContenedor;
	protected JMenuItem jMenuItemProcesarInformacionContenedor;
	protected JMenuItem jMenuItemAnterioresContenedor;
	protected JMenuItem jMenuItemSiguientesContenedor;
	protected JMenuItem jMenuItemNuevoGuardarCambiosContenedor;
	protected JMenuItem jMenuItemAbrirOrderByContenedor;
	protected JMenuItem jMenuItemMostrarOcultarContenedor;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesContenedor;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosContenedor;
	protected JCheckBox jCheckBoxSeleccionadosContenedor;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaContenedor;
	protected JCheckBox jCheckBoxConGraficoReporteContenedor;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesContenedor;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesContenedor;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoContenedor;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoContenedor;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesContenedor;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionContenedor;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesContenedor;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesContenedor;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarContenedor;
	protected JTextField jTextFieldValorCampoGeneralContenedor;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteContenedor;
	//public JList<Reporte> jListColumnasSelectReporteContenedor;
	//public JScrollPane jScrollColumnasSelectReporteContenedor;
	
	//public JLabel jLabelRelacionesSelectReporteContenedor;
	//public JList<Reporte> jListRelacionesSelectReporteContenedor;
	//public JScrollPane jScrollRelacionesSelectReporteContenedor;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoContenedor;
	//protected JCheckBox jCheckBoxConGraficoDinamicoContenedor;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoContenedor;
	//public JLabel jLabelTiposArchivoReporteDinamicoContenedor;
	
		
	//public JLabel jLabelArchivoImportacionContenedor;	
	//public JLabel jLabelPathArchivoImportacionContenedor;
	//protected JTextField jTextFieldPathArchivoImportacionContenedor;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoContenedor;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoContenedor;
	
	//public JLabel jLabelColumnaCategoriaValorContenedor;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorContenedor;
	
	//public JLabel jLabelColumnasValoresGraficoContenedor;
	//public JList<Reporte> jListColumnasValoresGraficoContenedor;
	//public JScrollPane jScrollColumnasValoresGraficoContenedor;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoContenedor;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoContenedor;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasContenedor;
	public JPanel jPanelFK_IdPedidoContenedor;
	public JButton jButtonFK_IdPedidoContenedor;
	
	public JPanel jPanelid_pedidoFK_IdPedidoContenedor;
	public JLabel jLabelid_pedidoFK_IdPedidoContenedor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_pedidoFK_IdPedidoContenedor;
	public JButton jButtonid_pedidoFK_IdPedidoContenedor= new JButtonMe();
	public JButton jButtonid_pedidoFK_IdPedidoContenedorUpdate= new JButtonMe();
	public JButton jButtonid_pedidoFK_IdPedidoContenedorBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=594;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public ContenedorJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("Contenedor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ContenedorJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Contenedor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ContenedorJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Contenedor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ContenedorJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Contenedor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionContenedor)	{
		this.jButtonRecargarInformacionContenedor = jButtonRecargarInformacionContenedor;
	}
	
	public JButton getjButtonProcesarInformacionContenedor() {
		return this.jButtonProcesarInformacionContenedor;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionContenedor)	{
		this.jButtonProcesarInformacionContenedor = jButtonProcesarInformacionContenedor;
	}
	
	
	public JButton getjButtonRecargarInformacionContenedor() {
		return this.jButtonRecargarInformacionContenedor;
	}
	
	
	public List<Contenedor> getcontenedors() {
		return this.contenedors;
	}

	public void setcontenedors(List<Contenedor> contenedors) {
		this.contenedors = contenedors;
	}
	
	public List<Contenedor> getcontenedorsAux() {
		return this.contenedorsAux;
	}

	public void setcontenedorsAux(List<Contenedor> contenedorsAux) {
		this.contenedorsAux = contenedorsAux;
	}
	
	public List<Contenedor> getcontenedorsEliminados() {
		return this.contenedorsEliminados;
	}

	public void setContenedorsEliminados(List<Contenedor> contenedorsEliminados) {
		this.contenedorsEliminados = contenedorsEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarContenedor() {
		return jComboBoxTiposSeleccionarContenedor;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarContenedor(
			JComboBox jComboBoxTiposSeleccionarContenedor) {
		this.jComboBoxTiposSeleccionarContenedor = jComboBoxTiposSeleccionarContenedor;
	}
	
	public void setBorderResaltarTiposSeleccionarContenedor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarContenedor.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarContenedor .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralContenedor() {
		return jTextFieldValorCampoGeneralContenedor;
	}

	public void setjTextFieldValorCampoGeneralContenedor(
			JTextField jTextFieldValorCampoGeneralContenedor) {
		this.jTextFieldValorCampoGeneralContenedor = jTextFieldValorCampoGeneralContenedor;
	}

	public void setBorderResaltarValorCampoGeneralContenedor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarContenedor.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralContenedor .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosContenedor() {
		return this.jCheckBoxSeleccionarTodosContenedor;
	}

	public void setjCheckBoxSeleccionarTodosContenedor(
			JCheckBox jCheckBoxSeleccionarTodosContenedor) {
		this.jCheckBoxSeleccionarTodosContenedor = jCheckBoxSeleccionarTodosContenedor;
	}

	public void setBorderResaltarSeleccionarTodosContenedor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarContenedor.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosContenedor .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosContenedor() {
		return this.jCheckBoxSeleccionadosContenedor;
	}

	public void setjCheckBoxSeleccionadosContenedor(
			JCheckBox jCheckBoxSeleccionadosContenedor) {
		this.jCheckBoxSeleccionadosContenedor = jCheckBoxSeleccionadosContenedor;
	}
	
	public void setBorderResaltarSeleccionadosContenedor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarContenedor.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosContenedor .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesContenedor() {
		return this.jComboBoxTiposArchivosReportesContenedor;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesContenedor(
			JComboBox jComboBoxTiposArchivosReportesContenedor) {
		this.jComboBoxTiposArchivosReportesContenedor = jComboBoxTiposArchivosReportesContenedor;
	}

	public void setBorderResaltarTiposArchivosReportesContenedor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarContenedor.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesContenedor .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesContenedor() {
		return this.jComboBoxTiposReportesContenedor;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesContenedor(
			JComboBox jComboBoxTiposReportesContenedor) {
		this.jComboBoxTiposReportesContenedor = jComboBoxTiposReportesContenedor;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoContenedor() {
	//	return jComboBoxTiposReportesDinamicoContenedor;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoContenedor(
	//		JComboBox jComboBoxTiposReportesDinamicoContenedor) {
	//	this.jComboBoxTiposReportesDinamicoContenedor = jComboBoxTiposReportesDinamicoContenedor;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoContenedor() {
	//	return jComboBoxTiposArchivosReportesDinamicoContenedor;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoContenedor(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoContenedor) {
	//	this.jComboBoxTiposArchivosReportesDinamicoContenedor = jComboBoxTiposArchivosReportesDinamicoContenedor;
	//}
	
	public void setBorderResaltarTiposReportesContenedor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarContenedor.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesContenedor .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesContenedor() {
		return this.jComboBoxTiposGraficosReportesContenedor;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesContenedor(
			JComboBox jComboBoxTiposGraficosReportesContenedor) {
		this.jComboBoxTiposGraficosReportesContenedor = jComboBoxTiposGraficosReportesContenedor;
	}
	
	public void setBorderResaltarTiposGraficosReportesContenedor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarContenedor.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesContenedor .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionContenedor() {
		return this.jComboBoxTiposPaginacionContenedor;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionContenedor(
			JComboBox jComboBoxTiposPaginacionContenedor) {
		this.jComboBoxTiposPaginacionContenedor = jComboBoxTiposPaginacionContenedor;
	}
	
	public void setBorderResaltarTiposPaginacionContenedor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarContenedor.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionContenedor .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesContenedor() {
		return this.jComboBoxTiposRelacionesContenedor;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesContenedor() {
		return this.jComboBoxTiposAccionesContenedor;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesContenedor(
			JComboBox jComboBoxTiposRelacionesContenedor) {
		this.jComboBoxTiposRelacionesContenedor = jComboBoxTiposRelacionesContenedor;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesContenedor(
			JComboBox jComboBoxTiposAccionesContenedor) {
		this.jComboBoxTiposAccionesContenedor = jComboBoxTiposAccionesContenedor;
	}
	
	public void setBorderResaltarTiposRelacionesContenedor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarContenedor.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesContenedor .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesContenedor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarContenedor.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesContenedor .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoContenedor() {
	//	return jCheckBoxConGraficoDinamicoContenedor;
	//}

	//public void setjCheckBoxConGraficoDinamicoContenedor(
	//		JCheckBox jCheckBoxConGraficoDinamicoContenedor) {
	//	this.jCheckBoxConGraficoDinamicoContenedor = jCheckBoxConGraficoDinamicoContenedor;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoContenedor() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarContenedor.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoContenedor .setBorder(borderResaltar);		
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
		this.contenedorSessionBean=new ContenedorSessionBean();
		
		this.contenedorSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.contenedorSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.contenedorSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=ContenedorJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=ContenedorJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ContenedorJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ContenedorJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ContenedorJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Contenedor MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.contenedorSessionBean.getEsGuardarRelacionado()) {
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
		
		ContenedorJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("Contenedor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarContenedor= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarContenedor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarContenedor,this.jTtoolBarContenedor,
							"nuevo","nuevo","Nuevo"+" "+ContenedorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarContenedor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarContenedor,this.jTtoolBarContenedor,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarContenedor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarContenedor,this.jTtoolBarContenedor,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+ContenedorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarContenedor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarContenedor,this.jTtoolBarContenedor,
							"duplicar","duplicar","Duplicar"+" "+ContenedorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarContenedor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarContenedor,this.jTtoolBarContenedor,
							"copiar","copiar","Copiar"+" "+ContenedorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarContenedor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarContenedor,this.jTtoolBarContenedor,
							"ver_form","ver_form","Ver"+" "+ContenedorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarContenedor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarContenedor,this.jTtoolBarContenedor,
							"recargar","recargar","Recargar"+" "+ContenedorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarContenedor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarContenedor,this.jTtoolBarContenedor,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarContenedor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarContenedor,this.jTtoolBarContenedor,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarContenedor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarContenedor,this.jTtoolBarContenedor,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarContenedor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarContenedor,this.jTtoolBarContenedor,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarContenedor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarContenedor,this.jTtoolBarContenedor,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+ContenedorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarContenedor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarContenedor,this.jTtoolBarContenedor,
							"cerrar","cerrar","Salir"+" "+ContenedorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarContenedor=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarContenedor;
			
				this.jButtonProcesarInformacionToolBarContenedor=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarContenedor;
				
		//protected JButton jButtonModificarToolBarContenedor;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarContenedor=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuContenedor=new JMenuMe("General");
		this.jmenuArchivoContenedor=new JMenuMe("Archivo");
		this.jmenuAccionesContenedor=new JMenuMe("Acciones");
		this.jmenuDatosContenedor=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoContenedor= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoContenedor.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoContenedor,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoContenedor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarContenedor= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarContenedor.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarContenedor,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarContenedor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesContenedor= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesContenedor.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesContenedor,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesContenedor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosContenedor= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosContenedor.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosContenedor,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosContenedor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarContenedor= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarContenedor.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarContenedor,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarContenedor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormContenedor= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormContenedor.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormContenedor,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormContenedor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaContenedor= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaContenedor.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaContenedor,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaContenedor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarContenedor= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarContenedor.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarContenedor,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarContenedor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionContenedor= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionContenedor.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionContenedor,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionContenedor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionContenedor= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionContenedor.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionContenedor,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresContenedor= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresContenedor.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresContenedor,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresContenedor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesContenedor= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesContenedor.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesContenedor,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesContenedor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByContenedor= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByContenedor.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByContenedor,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByContenedor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarContenedor= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarContenedor.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarContenedor,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarContenedor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByContenedor= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByContenedor.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByContenedor,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByContenedor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarContenedor= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarContenedor.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarContenedor,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarContenedor, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosContenedor= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosContenedor.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosContenedor,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosContenedor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoContenedor.add(this.jMenuItemCerrarContenedor);
			
			this.jmenuAccionesContenedor.add(this.jMenuItemNuevoContenedor);
			this.jmenuAccionesContenedor.add(this.jMenuItemNuevoGuardarCambiosContenedor);
			this.jmenuAccionesContenedor.add(this.jMenuItemNuevoRelacionesContenedor);
			this.jmenuAccionesContenedor.add(this.jMenuItemGuardarCambiosTablaContenedor);		
			this.jmenuAccionesContenedor.add(this.jMenuItemDuplicarContenedor);		
			this.jmenuAccionesContenedor.add(this.jMenuItemCopiarContenedor);		
			this.jmenuAccionesContenedor.add(this.jMenuItemVerFormContenedor);		
			
			this.jmenuDatosContenedor.add(this.jMenuItemRecargarInformacionContenedor);				
			this.jmenuDatosContenedor.add(this.jMenuItemAnterioresContenedor);				
			this.jmenuDatosContenedor.add(this.jMenuItemSiguientesContenedor);				
			this.jmenuDatosContenedor.add(this.jMenuItemAbrirOrderByContenedor);				
			this.jmenuDatosContenedor.add(this.jMenuItemMostrarOcultarContenedor);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesContenedor.add(this.jMenuItemGuardarCambiosContenedor);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoContenedor, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesContenedor, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosContenedor, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarContenedor.add(this.jmenuArchivoContenedor);		
			this.jmenuBarContenedor.add(this.jmenuAccionesContenedor);		
			this.jmenuBarContenedor.add(this.jmenuDatosContenedor);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarContenedor);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasContenedor() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdPedidoContenedor=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdPedidoContenedor.setToolTipText("Buscar Por Pedido ");
		this.jButtonFK_IdPedidoContenedor= new JButtonMe();
		this.jButtonFK_IdPedidoContenedor.setText("Buscar");
		this.jButtonFK_IdPedidoContenedor.setToolTipText("Buscar Por Pedido ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdPedidoContenedor,"buscar_button","Buscar Por Pedido ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdPedidoContenedor, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_pedidoFK_IdPedidoContenedor = new JLabelMe();
		jLabelid_pedidoFK_IdPedidoContenedor.setText("Pedido :");
		jLabelid_pedidoFK_IdPedidoContenedor.setToolTipText("Pedido");
		jLabelid_pedidoFK_IdPedidoContenedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_pedidoFK_IdPedidoContenedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_pedidoFK_IdPedidoContenedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_pedidoFK_IdPedidoContenedor,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_pedidoFK_IdPedidoContenedor= new JComboBoxMe();
		jComboBoxid_pedidoFK_IdPedidoContenedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_pedidoFK_IdPedidoContenedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_pedidoFK_IdPedidoContenedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_pedidoFK_IdPedidoContenedor,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasContenedor=new JTabbedPane();


		this.jTabbedPaneBusquedasContenedor.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasContenedor.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasContenedor.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasContenedor.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasContenedor.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasContenedor,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleContenedor = new ContenedorDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Contenedor DATOS");
			this.jInternalFrameDetalleFormContenedor = new ContenedorDetalleFormJInternalFrame(jDesktopPane,this.contenedorSessionBean.getConGuardarRelaciones(),this.contenedorSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormContenedor = null;//new ContenedorDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutContenedor= new GridBagLayout();
		
		
		this.jTableDatosContenedor = new JTableMe();      
		
		String sToolTipContenedor="";
		sToolTipContenedor=ContenedorConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipContenedor+="(Importaciones.Contenedor)";
		}
		
		if(!this.contenedorSessionBean.getEsGuardarRelacionado()) {
			sToolTipContenedor+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosContenedor.setToolTipText(sToolTipContenedor);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosContenedor);
		this.jTableDatosContenedor.setAutoCreateRowSorter(true);
		this.jTableDatosContenedor.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosContenedor.setRowSelectionAllowed(true);
		this.jTableDatosContenedor.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosContenedor,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoContenedor = new JButtonMe();
		this.jButtonDuplicarContenedor = new JButtonMe();
		this.jButtonCopiarContenedor = new JButtonMe();
		this.jButtonVerFormContenedor = new JButtonMe();
		this.jButtonNuevoRelacionesContenedor = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaContenedor = new JButtonMe();
		this.jButtonCerrarContenedor = new JButtonMe();
		
		this.jScrollPanelDatosContenedor = new JScrollPane();   
        this.jScrollPanelDatosGeneralContenedor = new JScrollPane();
		
				
		
		
		this.jPanelAccionesContenedor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Contenedor";
		
		if(!this.contenedorSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosContenedor.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Contenedores" + this.sPath));
		} else {
			this.jScrollPanelDatosContenedor.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralContenedor.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesContenedor.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesContenedor.setToolTipText("Acciones");
        this.jPanelAccionesContenedor.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralContenedor, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosContenedor, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoContenedor=new ReporteDinamicoJInternalFrame(ContenedorConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoContenedor();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionContenedor=new ImportacionJInternalFrame(ContenedorConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionContenedor();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByContenedor = new JButtonMe();
		
		this.jButtonAbrirOrderByContenedor.setText("Orden");
		this.jButtonAbrirOrderByContenedor.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByContenedor,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByContenedor, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByContenedor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByContenedor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByContenedor=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByContenedor,false,this);
			
			//this.cargarOrderByContenedor(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByContenedor=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByContenedor,true,this);
			
			//this.cargarOrderByContenedor(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosContenedor.setMinimumSize(new Dimension(400,50));//630
		this.jTableDatosContenedor.setMaximumSize(new Dimension(400,50));//630
		this.jTableDatosContenedor.setPreferredSize(new Dimension(400,50));//630
		
		this.jScrollPanelDatosContenedor.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosContenedor.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosContenedor.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoContenedor.setText("Nuevo");
		this.jButtonDuplicarContenedor.setText("Duplicar");
		this.jButtonCopiarContenedor.setText("Copiar");
		this.jButtonVerFormContenedor.setText("Ver");
		this.jButtonNuevoRelacionesContenedor.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaContenedor.setText("Guardar");
		this.jButtonCerrarContenedor.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoContenedor,"nuevo_button","Nuevo",this.contenedorSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarContenedor,"duplicar_button","Duplicar",this.contenedorSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarContenedor,"copiar_button","Copiar",this.contenedorSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormContenedor,"ver_form","Ver",this.contenedorSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesContenedor,"nuevorelaciones_button","Nuevo Rel",this.contenedorSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaContenedor,"guardarcambiostabla_button","Guardar",this.contenedorSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarContenedor,"cerrar_button","Salir",this.contenedorSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoContenedor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarContenedor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarContenedor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormContenedor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesContenedor, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaContenedor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarContenedor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoContenedor.setToolTipText("Nuevo"+" "+ContenedorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarContenedor.setToolTipText("Duplicar"+" "+ContenedorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarContenedor.setToolTipText("Copiar"+" "+ContenedorConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormContenedor.setToolTipText("Ver"+" "+ContenedorConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesContenedor.setToolTipText("Nuevo Rel"+" "+ContenedorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaContenedor.setToolTipText("Guardar"+" "+ContenedorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarContenedor.setToolTipText("Salir"+" "+ContenedorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoContenedor";
		inputMap = this.jButtonNuevoContenedor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoContenedor.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoContenedor"));
		
		//DUPLICAR
		sMapKey = "DuplicarContenedor";
		inputMap = this.jButtonDuplicarContenedor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarContenedor.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarContenedor"));
		
		//COPIAR
		sMapKey = "CopiarContenedor";
		inputMap = this.jButtonCopiarContenedor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarContenedor.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarContenedor"));
		
		//VEr FORM
		sMapKey = "VerFormContenedor";
		inputMap = this.jButtonVerFormContenedor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormContenedor.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormContenedor"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesContenedor";
		inputMap = this.jButtonNuevoRelacionesContenedor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesContenedor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesContenedor"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarContenedor";
		inputMap = this.jButtonModificarContenedor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarContenedor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarContenedor"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarContenedor";
		inputMap = this.jButtonCerrarContenedor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarContenedor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarContenedor"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaContenedor";
		inputMap = this.jButtonGuardarCambiosTablaContenedor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaContenedor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaContenedor"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesContenedor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesContenedor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionContenedor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1Contenedor= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2Contenedor= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3Contenedor= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4Contenedor= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5Contenedor= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesContenedor.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesContenedor.setName("jPanelParametrosReportesContenedor"); 
		
		this.jPanelParametrosReportesAccionesContenedor.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesContenedor.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesContenedor.setName("jPanelParametrosReportesAccionesContenedor"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesContenedor, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesContenedor, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionContenedor = new JButtonMe();
		this.jButtonRecargarInformacionContenedor.setText("Recargar");
		this.jButtonRecargarInformacionContenedor.setToolTipText("Recargar"+" "+ContenedorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionContenedor,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionContenedor = new JButtonMe();
		this.jButtonProcesarInformacionContenedor.setText("Procesar");
		this.jButtonProcesarInformacionContenedor.setToolTipText("Procesar"+" "+ContenedorConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionContenedor.setVisible(false);
			
		this.jButtonProcesarInformacionContenedor.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionContenedor.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionContenedor.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesContenedor = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesContenedor.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesContenedor.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesContenedor = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesContenedor.setText("TIPO");       
		this.jComboBoxTiposReportesContenedor.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesContenedor = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesContenedor.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesContenedor.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionContenedor = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionContenedor.setText("Paginacion");
		this.jComboBoxTiposPaginacionContenedor.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesContenedor = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesContenedor.setText("Accion");
		this.jComboBoxTiposRelacionesContenedor.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesContenedor = new JComboBoxMe();
		//this.jComboBoxTiposAccionesContenedor.setText("Accion");
		this.jComboBoxTiposAccionesContenedor.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarContenedor = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarContenedor.setText("Accion");
		this.jComboBoxTiposSeleccionarContenedor.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralContenedor=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralContenedor.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralContenedor.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralContenedor.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesContenedor = new JLabelMe();
		
		this.jLabelAccionesContenedor.setText("Acciones");		
		this.jLabelAccionesContenedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesContenedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesContenedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosContenedor = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosContenedor.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosContenedor.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosContenedor = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosContenedor.setText("Seleccionados");
		this.jCheckBoxSeleccionadosContenedor.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaContenedor = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaContenedor.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaContenedor.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteContenedor = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteContenedor.setText("Graf.");
		this.jCheckBoxConGraficoReporteContenedor.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresContenedor = new JButtonMe();
		//this.jButtonAnterioresContenedor.setText("<<");
        this.jButtonAnterioresContenedor.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresContenedor,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresContenedor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesContenedor = new JButtonMe();
		//this.jButtonSiguientesContenedor.setText(">>");
        this.jButtonSiguientesContenedor.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesContenedor,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesContenedor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosContenedor = new JButtonMe();
		this.jButtonNuevoGuardarCambiosContenedor.setText("Nue");
        this.jButtonNuevoGuardarCambiosContenedor.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosContenedor,"nuevoguardarcambios_button","Nue",this.contenedorSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosContenedor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosContenedor";
		inputMap = this.jButtonNuevoGuardarCambiosContenedor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosContenedor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosContenedor"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionContenedor";
		inputMap = this.jButtonRecargarInformacionContenedor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionContenedor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionContenedor"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesContenedor";
		inputMap = this.jButtonSiguientesContenedor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesContenedor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesContenedor"));
		
		//ANTERIORES		
		sMapKey = "AnterioresContenedor";
		inputMap = this.jButtonAnterioresContenedor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresContenedor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresContenedor"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasContenedor();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesContenedor.setMinimumSize(new Dimension(this.getWidth(),ContenedorBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ContenedorBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesContenedor.setMaximumSize(new Dimension(this.getWidth(),ContenedorBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ContenedorBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesContenedor.setPreferredSize(new Dimension(this.getWidth(),ContenedorBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ContenedorBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionContenedor = new GridBagLayout();

			this.jPanelPaginacionContenedor.setLayout(gridaBagLayoutPaginacionContenedor);						
			
			this.gridBagConstraintsContenedor = new GridBagConstraints();
			this.gridBagConstraintsContenedor.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsContenedor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsContenedor.gridy = 0;
			this.gridBagConstraintsContenedor.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionContenedor.add(this.jButtonAnterioresContenedor, this.gridBagConstraintsContenedor);
					
						
			this.gridBagConstraintsContenedor = new GridBagConstraints();
			this.gridBagConstraintsContenedor.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsContenedor.gridy = 0;
			
			this.jPanelPaginacionContenedor.add(this.jButtonNuevoGuardarCambiosContenedor, this.gridBagConstraintsContenedor);
						
			
			this.gridBagConstraintsContenedor = new GridBagConstraints();
			this.gridBagConstraintsContenedor.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsContenedor.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsContenedor.gridy = 0;
			this.jPanelPaginacionContenedor.add(this.jButtonSiguientesContenedor, this.gridBagConstraintsContenedor);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsContenedor = new GridBagConstraints();
			this.gridBagConstraintsContenedor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsContenedor.gridy = 1;
			this.gridBagConstraintsContenedor.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionContenedor.add(this.jButtonNuevoContenedor, this.gridBagConstraintsContenedor);
						
			
			
			if(!this.contenedorSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsContenedor = new GridBagConstraints();
				this.gridBagConstraintsContenedor.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsContenedor.gridy = 1;
				this.gridBagConstraintsContenedor.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionContenedor.add(this.jButtonGuardarCambiosTablaContenedor, this.gridBagConstraintsContenedor);
			}
			
			
			
			this.gridBagConstraintsContenedor = new GridBagConstraints();
			this.gridBagConstraintsContenedor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsContenedor.gridy = 1;
			this.gridBagConstraintsContenedor.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionContenedor.add(this.jButtonDuplicarContenedor, this.gridBagConstraintsContenedor);
			
			this.gridBagConstraintsContenedor = new GridBagConstraints();
			this.gridBagConstraintsContenedor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsContenedor.gridy = 1;
			this.gridBagConstraintsContenedor.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionContenedor.add(this.jButtonCopiarContenedor, this.gridBagConstraintsContenedor);
		
			this.gridBagConstraintsContenedor = new GridBagConstraints();
			this.gridBagConstraintsContenedor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsContenedor.gridy = 1;
			this.gridBagConstraintsContenedor.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionContenedor.add(this.jButtonVerFormContenedor, this.gridBagConstraintsContenedor);
		
			this.gridBagConstraintsContenedor = new GridBagConstraints();
			this.gridBagConstraintsContenedor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsContenedor.gridy = 1;
			this.gridBagConstraintsContenedor.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionContenedor.add(this.jButtonCerrarContenedor, this.gridBagConstraintsContenedor);
		
		
		
		this.jButtonRecargarInformacionContenedor.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionContenedor.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionContenedor.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionContenedor, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesContenedor.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesContenedor.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesContenedor.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesContenedor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesContenedor.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesContenedor.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesContenedor.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesContenedor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesContenedor.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesContenedor.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesContenedor.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesContenedor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionContenedor.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionContenedor.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionContenedor.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionContenedor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesContenedor.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesContenedor.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesContenedor.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesContenedor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesContenedor.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesContenedor.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesContenedor.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesContenedor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarContenedor.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarContenedor.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarContenedor.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarContenedor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaContenedor.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaContenedor.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaContenedor.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaContenedor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteContenedor.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteContenedor.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteContenedor.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteContenedor, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosContenedor.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosContenedor.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosContenedor.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosContenedor, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosContenedor.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosContenedor.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosContenedor.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosContenedor, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesContenedor = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesContenedor = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1Contenedor = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2Contenedor = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3Contenedor = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4Contenedor = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesContenedor.setLayout(gridaBagParametrosReportesContenedor);
			this.jPanelParametrosReportesAccionesContenedor.setLayout(gridaBagParametrosReportesAccionesContenedor);
			
			
			this.jPanelParametrosAuxiliar1Contenedor.setLayout(gridaBagParametrosAuxiliar1Contenedor);
			this.jPanelParametrosAuxiliar2Contenedor.setLayout(gridaBagParametrosAuxiliar2Contenedor);
			this.jPanelParametrosAuxiliar3Contenedor.setLayout(gridaBagParametrosAuxiliar3Contenedor);
			this.jPanelParametrosAuxiliar4Contenedor.setLayout(gridaBagParametrosAuxiliar4Contenedor);
			//this.jPanelParametrosAuxiliar5Contenedor.setLayout(gridaBagParametrosAuxiliar2Contenedor);			
			
			
			
			
			this.gridBagConstraintsContenedor = new GridBagConstraints();
			this.gridBagConstraintsContenedor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsContenedor.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsContenedor.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesContenedor.add(this.jButtonRecargarInformacionContenedor, this.gridBagConstraintsContenedor);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsContenedor = new GridBagConstraints();
			this.gridBagConstraintsContenedor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsContenedor.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsContenedor.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Contenedor.add(this.jComboBoxTiposPaginacionContenedor, this.gridBagConstraintsContenedor);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsContenedor = new GridBagConstraints();
			this.gridBagConstraintsContenedor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsContenedor.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsContenedor.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Contenedor.add(this.jCheckBoxConAltoMaximoTablaContenedor, this.gridBagConstraintsContenedor);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsContenedor = new GridBagConstraints();
			this.gridBagConstraintsContenedor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsContenedor.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsContenedor.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Contenedor.add(this.jComboBoxTiposArchivosReportesContenedor, this.gridBagConstraintsContenedor);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsContenedor = new GridBagConstraints();
			this.gridBagConstraintsContenedor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsContenedor.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsContenedor.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesContenedor.add(this.jPanelParametrosAuxiliar1Contenedor, this.gridBagConstraintsContenedor);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsContenedor = new GridBagConstraints();
			this.gridBagConstraintsContenedor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsContenedor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsContenedor.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsContenedor.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4Contenedor.add(this.jComboBoxTiposReportesContenedor, this.gridBagConstraintsContenedor);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsContenedor = new GridBagConstraints();
			this.gridBagConstraintsContenedor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsContenedor.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsContenedor.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesContenedor.add(this.jPanelParametrosAuxiliar4Contenedor, this.gridBagConstraintsContenedor);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsContenedor = new GridBagConstraints();
			this.gridBagConstraintsContenedor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsContenedor.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsContenedor.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesContenedor.add(this.jComboBoxTiposReportesContenedor, this.gridBagConstraintsContenedor);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsContenedor = new GridBagConstraints();
			this.gridBagConstraintsContenedor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsContenedor.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsContenedor.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesContenedor.add(this.jCheckBoxGenerarReporteContenedor, this.gridBagConstraintsContenedor);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsContenedor = new GridBagConstraints();
			this.gridBagConstraintsContenedor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsContenedor.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsContenedor.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesContenedor.add(this.jPanelParametrosAuxiliar2Contenedor, this.gridBagConstraintsContenedor);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsContenedor = new GridBagConstraints();
			this.gridBagConstraintsContenedor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsContenedor.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsContenedor.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesContenedor.add(this.jLabelAccionesContenedor, this.gridBagConstraintsContenedor);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsContenedor = new GridBagConstraints();
				this.gridBagConstraintsContenedor.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsContenedor.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsContenedor.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesContenedor.add(this.jButtonAbrirOrderByContenedor, this.gridBagConstraintsContenedor);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsContenedor = new GridBagConstraints();
			this.gridBagConstraintsContenedor.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsContenedor.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsContenedor.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesContenedor.add(this.jComboBoxTiposSeleccionarContenedor, this.gridBagConstraintsContenedor);			
			
			
			/*
			this.gridBagConstraintsContenedor = new GridBagConstraints();
			this.gridBagConstraintsContenedor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsContenedor.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsContenedor.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesContenedor.add(this.jCheckBoxSeleccionarTodosContenedor, this.gridBagConstraintsContenedor);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsContenedor = new GridBagConstraints();
			this.gridBagConstraintsContenedor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsContenedor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsContenedor.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsContenedor.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Contenedor.add(this.jCheckBoxSeleccionarTodosContenedor, this.gridBagConstraintsContenedor);															
				
			this.gridBagConstraintsContenedor = new GridBagConstraints();
			this.gridBagConstraintsContenedor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsContenedor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsContenedor.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsContenedor.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Contenedor.add(this.jCheckBoxSeleccionadosContenedor, this.gridBagConstraintsContenedor);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsContenedor = new GridBagConstraints();
			this.gridBagConstraintsContenedor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsContenedor.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsContenedor.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesContenedor.add(this.jPanelParametrosAuxiliar3Contenedor, this.gridBagConstraintsContenedor);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsContenedor = new GridBagConstraints();
			this.gridBagConstraintsContenedor.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsContenedor.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesContenedor.add(this.jComboBoxTiposAccionesContenedor, this.gridBagConstraintsContenedor);
	
				
			this.gridBagConstraintsContenedor = new GridBagConstraints();
			this.gridBagConstraintsContenedor.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsContenedor.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesContenedor.add(this.jTextFieldValorCampoGeneralContenedor, this.gridBagConstraintsContenedor);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosContenedor = new GridBagLayout();

			this.jScrollPanelDatosContenedor.setLayout(gridaBagLayoutDatosContenedor);
			
			this.gridBagConstraintsContenedor = new GridBagConstraints();
			this.gridBagConstraintsContenedor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsContenedor.gridy = 0;
			this.gridBagConstraintsContenedor.gridx = 0;
			
			this.jScrollPanelDatosContenedor.add(this.jTableDatosContenedor, this.gridBagConstraintsContenedor);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosContenedor.setViewportView(this.jTableDatosContenedor);
		this.jTableDatosContenedor.setFillsViewportHeight(true);
		this.jTableDatosContenedor.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesContenedor= new GridBagLayout();
		this.jPanelAccionesContenedor.setLayout(gridaBagLayoutAccionesContenedor);
		
		
		/*	
		this.gridBagConstraintsContenedor = new GridBagConstraints();
		this.gridBagConstraintsContenedor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsContenedor.gridy = 0;
		this.gridBagConstraintsContenedor.gridx = 0;
			
		this.jPanelAccionesContenedor.add(this.jButtonNuevoContenedor, this.gridBagConstraintsContenedor);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdPedidoContenedor= new GridBagLayout();
		gridaBagLayoutFK_IdPedidoContenedor.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdPedidoContenedor.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdPedidoContenedor.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdPedidoContenedor.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdPedidoContenedor.setLayout(gridaBagLayoutFK_IdPedidoContenedor);

		gridBagConstraintsContenedor = new GridBagConstraints();
		gridBagConstraintsContenedor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsContenedor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsContenedor.gridy = 0;
		gridBagConstraintsContenedor.gridx = 0;
		jPanelFK_IdPedidoContenedor.add(jLabelid_pedidoFK_IdPedidoContenedor, gridBagConstraintsContenedor);

		gridBagConstraintsContenedor = new GridBagConstraints();
		gridBagConstraintsContenedor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsContenedor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsContenedor.gridy = 0;
		gridBagConstraintsContenedor.gridx = 1;
		jPanelFK_IdPedidoContenedor.add(jComboBoxid_pedidoFK_IdPedidoContenedor, gridBagConstraintsContenedor);

		gridBagConstraintsContenedor = new GridBagConstraints();
		gridBagConstraintsContenedor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsContenedor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsContenedor.gridy = 1;
		gridBagConstraintsContenedor.gridx =1;
		jPanelFK_IdPedidoContenedor.add(jButtonFK_IdPedidoContenedor, gridBagConstraintsContenedor);

		jTabbedPaneBusquedasContenedor.addTab("1.-Por Pedido ", jPanelFK_IdPedidoContenedor);
		jTabbedPaneBusquedasContenedor.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutContenedor = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutContenedor);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.contenedorSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsContenedor = new GridBagConstraints();						
			this.gridBagConstraintsContenedor.gridy = iGridyPrincipal++;
			this.gridBagConstraintsContenedor.gridx = 0;		
			//this.gridBagConstraintsContenedor.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsContenedor.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsContenedor.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarContenedor, this.gridBagConstraintsContenedor);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsContenedor = new GridBagConstraints();
		this.gridBagConstraintsContenedor.gridy = iGridyPrincipal++;
		this.gridBagConstraintsContenedor.gridx = 0;		
		//this.gridBagConstraintsContenedor.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsContenedor.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsContenedor.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsContenedor);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsContenedor = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsContenedor.gridy = iGridyPrincipal++;
			this.gridBagConstraintsContenedor.gridx = 0;		
			this.gridBagConstraintsContenedor.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsContenedor.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsContenedor.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasContenedor, this.gridBagConstraintsContenedor);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsContenedor = new GridBagConstraints();
		this.gridBagConstraintsContenedor.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsContenedor.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesContenedor, this.gridBagConstraintsContenedor);								
		
		
		/*
		this.gridBagConstraintsContenedor = new GridBagConstraints();
		this.gridBagConstraintsContenedor.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsContenedor.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesContenedor, this.gridBagConstraintsContenedor);
		*/		
		
		this.gridBagConstraintsContenedor = new GridBagConstraints();
		this.gridBagConstraintsContenedor.gridy =iGridyPrincipal++;
		this.gridBagConstraintsContenedor.gridx =0;
		this.gridBagConstraintsContenedor.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsContenedor.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosContenedor, this.gridBagConstraintsContenedor);
				
		
		this.gridBagConstraintsContenedor = new GridBagConstraints();
		this.gridBagConstraintsContenedor.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsContenedor.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionContenedor, this.gridBagConstraintsContenedor);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(ContenedorJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosContenedor= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosContenedor = new GridBagLayout();
			this.jPanelBusquedasParametrosContenedor.setLayout(gridaBagLayoutBusquedasParametrosContenedor);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralContenedor=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralContenedor.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralContenedor.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralContenedor.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsContenedor = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsContenedor = new GridBagConstraints();
		this.gridBagConstraintsContenedor.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsContenedor.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposContenedor, this.gridBagConstraintsContenedor);
			
			
		this.gridBagConstraintsContenedor = new GridBagConstraints();
		this.gridBagConstraintsContenedor.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsContenedor.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosContenedor, this.gridBagConstraintsContenedor);
		
			
		this.gridBagConstraintsContenedor = new GridBagConstraints();
		this.gridBagConstraintsContenedor.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsContenedor.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesContenedor, this.gridBagConstraintsContenedor);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralContenedor;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoContenedor() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoContenedor = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoContenedor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoContenedor.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoContenedor.setName("jPanelReporteDinamicoContenedor"); 
		
		this.jPanelReporteDinamicoContenedor.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoContenedor.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoContenedor.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoContenedor.setLayout(gridaBagLayoutReporteDinamicoContenedor);
		
		
		this.jInternalFrameReporteDinamicoContenedor= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoContenedor = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteContenedor= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoContenedor.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoContenedor.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoContenedor.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoContenedor.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoContenedor.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoContenedor.setResizable(true);
	    this.jInternalFrameReporteDinamicoContenedor.setClosable(true);
	    this.jInternalFrameReporteDinamicoContenedor.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoContenedor.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoContenedor.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoContenedor.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoContenedor.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Contenedores"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteContenedor = new JLabelMe();

		this.jLabelColumnasSelectReporteContenedor.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteContenedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteContenedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteContenedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsContenedor = new GridBagConstraints();
		this.gridBagConstraintsContenedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsContenedor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsContenedor.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoContenedor.add(this.jLabelColumnasSelectReporteContenedor, this.gridBagConstraintsContenedor);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteContenedor = new JList<Reporte>();
		this.jListColumnasSelectReporteContenedor.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteContenedor.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteContenedor.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteContenedor.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteContenedor.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteContenedor=new JScrollPane(this.jListColumnasSelectReporteContenedor);
			
			this.jScrollColumnasSelectReporteContenedor.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteContenedor.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteContenedor.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteContenedor.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsContenedor = new GridBagConstraints();
		this.gridBagConstraintsContenedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsContenedor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsContenedor.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoContenedor.add(this.jListColumnasSelectReporteContenedor, this.gridBagConstraintsContenedor);
		this.jPanelReporteDinamicoContenedor.add(this.jScrollColumnasSelectReporteContenedor, this.gridBagConstraintsContenedor);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteContenedor = new JLabelMe();

		this.jLabelRelacionesSelectReporteContenedor.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteContenedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteContenedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteContenedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteContenedor = new JList<Reporte>();
		this.jListRelacionesSelectReporteContenedor.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteContenedor.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteContenedor.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteContenedor.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteContenedor.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteContenedor=new JScrollPane(this.jListRelacionesSelectReporteContenedor);
			
			this.jScrollRelacionesSelectReporteContenedor.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteContenedor.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteContenedor.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteContenedor.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoContenedor = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoContenedor = new JComboBoxMe();
		this.jListColumnasValoresGraficoContenedor = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoContenedor = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoContenedor.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoContenedor.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoContenedor.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoContenedor.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoContenedor, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoContenedor = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoContenedor.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoContenedor.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoContenedor.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoContenedor.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoContenedor, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoContenedor = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoContenedor.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoContenedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoContenedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoContenedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsContenedor = new GridBagConstraints();
		this.gridBagConstraintsContenedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsContenedor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsContenedor.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoContenedor.add(this.jLabelGenerarExcelReporteDinamicoContenedor, this.gridBagConstraintsContenedor);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoContenedor = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoContenedor.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoContenedor,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoContenedor.setToolTipText("Generar EXCEL"+" "+ContenedorConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsContenedor = new GridBagConstraints();
		//this.gridBagConstraintsContenedor.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsContenedor.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsContenedor.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoContenedor.add(this.jButtonGenerarExcelReporteDinamicoContenedor, this.gridBagConstraintsContenedor);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsContenedor = new GridBagConstraints();
		this.gridBagConstraintsContenedor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsContenedor.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsContenedor.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoContenedor.add(this.jComboBoxTiposReportesDinamicoContenedor, this.gridBagConstraintsContenedor);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoContenedor = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoContenedor.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoContenedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoContenedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoContenedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsContenedor = new GridBagConstraints();
		this.gridBagConstraintsContenedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsContenedor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsContenedor.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoContenedor.add(this.jLabelTiposArchivoReporteDinamicoContenedor, this.gridBagConstraintsContenedor);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsContenedor = new GridBagConstraints();
		this.gridBagConstraintsContenedor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsContenedor.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsContenedor.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoContenedor.add(this.jComboBoxTiposArchivosReportesDinamicoContenedor, this.gridBagConstraintsContenedor);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoContenedor = new JButtonMe();
		this.jButtonGenerarReporteDinamicoContenedor.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoContenedor,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoContenedor.setToolTipText("Generar"+" "+ContenedorConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsContenedor = new GridBagConstraints();
		this.gridBagConstraintsContenedor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsContenedor.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsContenedor.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoContenedor.add(this.jButtonGenerarReporteDinamicoContenedor, this.gridBagConstraintsContenedor);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoContenedor = new JButtonMe();
		this.jButtonCerrarReporteDinamicoContenedor.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoContenedor,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoContenedor.setToolTipText("Cancelar"+" "+ContenedorConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsContenedor = new GridBagConstraints();
		this.gridBagConstraintsContenedor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsContenedor.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsContenedor.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoContenedor.add(this.jButtonCerrarReporteDinamicoContenedor, this.gridBagConstraintsContenedor);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalContenedor = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoContenedor= new JScrollPane(jPanelReporteDinamicoContenedor,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoContenedor.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoContenedor.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoContenedor.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoContenedor.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Contenedores"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsContenedor = new GridBagConstraints();
		this.gridBagConstraintsContenedor.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsContenedor.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsContenedor.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoContenedor.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoContenedor.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalContenedor);
		this.jInternalFrameReporteDinamicoContenedor.getContentPane().add(this.jScrollPanelReporteDinamicoContenedor, this.gridBagConstraintsContenedor);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionContenedor() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionContenedor = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionContenedor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionContenedor.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionContenedor.setName("jPanelImportacionContenedor"); 
		
		this.jPanelImportacionContenedor.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionContenedor.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionContenedor.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionContenedor.setLayout(gridaBagLayoutImportacionContenedor);
		
		
		this.jInternalFrameImportacionContenedor= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionContenedor= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionContenedor = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteContenedor= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionContenedor.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionContenedor.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionContenedor.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionContenedor.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionContenedor.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionContenedor.setResizable(true);
	    this.jInternalFrameImportacionContenedor.setClosable(true);
	    this.jInternalFrameImportacionContenedor.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionContenedor.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionContenedor.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionContenedor.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionContenedor.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionContenedor.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionContenedor.setResizable(true);
	    this.jInternalFrameImportacionContenedor.setClosable(true);
	    this.jInternalFrameImportacionContenedor.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionContenedor.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionContenedor.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionContenedor.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionContenedor.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Contenedores"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionContenedor = new JLabelMe();

		this.jLabelArchivoImportacionContenedor.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionContenedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionContenedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionContenedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsContenedor = new GridBagConstraints();
		this.gridBagConstraintsContenedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsContenedor.gridy = iPosYImportacion;		
		this.gridBagConstraintsContenedor.gridx = iPosXImportacion++;
			
		this.jPanelImportacionContenedor.add(this.jLabelArchivoImportacionContenedor, this.gridBagConstraintsContenedor);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionContenedor = new JFileChooser();		
		this.jFileChooserImportacionContenedor.setToolTipText("ESCOGER ARCHIVO"+" "+ContenedorConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionContenedor = new JButtonMe();
		this.jButtonAbrirImportacionContenedor.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionContenedor,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionContenedor.setToolTipText("Generar"+" "+ContenedorConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsContenedor = new GridBagConstraints();
		this.gridBagConstraintsContenedor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsContenedor.gridy = iPosYImportacion;
		this.gridBagConstraintsContenedor.gridx = iPosXImportacion++;
							
		this.jPanelImportacionContenedor.add(this.jButtonAbrirImportacionContenedor, this.gridBagConstraintsContenedor);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionContenedor = new JLabelMe();

		this.jLabelPathArchivoImportacionContenedor.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionContenedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionContenedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionContenedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsContenedor = new GridBagConstraints();
		this.gridBagConstraintsContenedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsContenedor.gridy = iPosYImportacion;		
		this.gridBagConstraintsContenedor.gridx = iPosXImportacion++;
			
		this.jPanelImportacionContenedor.add(this.jLabelPathArchivoImportacionContenedor, this.gridBagConstraintsContenedor);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionContenedor=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionContenedor.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionContenedor.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionContenedor.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsContenedor = new GridBagConstraints();
		this.gridBagConstraintsContenedor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsContenedor.gridy = iPosYImportacion;
		this.gridBagConstraintsContenedor.gridx = iPosXImportacion++;
							
		this.jPanelImportacionContenedor.add(this.jTextFieldPathArchivoImportacionContenedor, this.gridBagConstraintsContenedor);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionContenedor = new JButtonMe();
		this.jButtonGenerarImportacionContenedor.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionContenedor,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionContenedor.setToolTipText("Generar"+" "+ContenedorConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsContenedor = new GridBagConstraints();
		this.gridBagConstraintsContenedor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsContenedor.gridy = iPosYImportacion;
		this.gridBagConstraintsContenedor.gridx = iPosXImportacion++;
							
		this.jPanelImportacionContenedor.add(this.jButtonGenerarImportacionContenedor, this.gridBagConstraintsContenedor);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionContenedor = new JButtonMe();
		this.jButtonCerrarImportacionContenedor.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionContenedor,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionContenedor.setToolTipText("Cancelar"+" "+ContenedorConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsContenedor = new GridBagConstraints();
		this.gridBagConstraintsContenedor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsContenedor.gridy = iPosYImportacion;
		this.gridBagConstraintsContenedor.gridx = iPosXImportacion++;
							
		this.jPanelImportacionContenedor.add(this.jButtonCerrarImportacionContenedor, this.gridBagConstraintsContenedor);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalContenedor = new GridBagLayout();
		
		this.jScrollPanelImportacionContenedor= new JScrollPane(jPanelImportacionContenedor,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsContenedor = new GridBagConstraints();
		this.gridBagConstraintsContenedor.gridy =iPosYImportacion;
		this.gridBagConstraintsContenedor.gridx =iPosXImportacion;
		this.gridBagConstraintsContenedor.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionContenedor.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionContenedor.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalContenedor);
		this.jInternalFrameImportacionContenedor.getContentPane().add(this.jScrollPanelImportacionContenedor, this.gridBagConstraintsContenedor);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByContenedor(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByContenedor = new JButtonMe();
			this.jButtonAbrirOrderByContenedor.setText("Orden");
			this.jButtonAbrirOrderByContenedor.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByContenedor,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByContenedor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByContenedor";
			inputMap = this.jButtonAbrirOrderByContenedor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByContenedor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByContenedor"));
		
		
			GridBagLayout gridaBagLayoutOrderByContenedor = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByContenedor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByContenedor.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByContenedor.setName("jPanelOrderByContenedor"); 
			
			this.jPanelOrderByContenedor.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByContenedor.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByContenedor.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByContenedor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByContenedor.setLayout(gridaBagLayoutOrderByContenedor);
			
			
			this.jTableDatosContenedorOrderBy = new JTableMe();        
			this.jTableDatosContenedorOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosContenedorOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosContenedorOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosContenedorOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosContenedorOrderBy.setViewportView(this.jTableDatosContenedorOrderBy);
			this.jTableDatosContenedorOrderBy.setFillsViewportHeight(true);
			this.jTableDatosContenedorOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByContenedor= new OrderByJInternalFrame();
			this.jInternalFrameOrderByContenedor= new OrderByJInternalFrame();
			this.jScrollPanelOrderByContenedor = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteContenedor= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByContenedor.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByContenedor.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByContenedor.setTitle("Orden");
			this.jInternalFrameOrderByContenedor.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByContenedor.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByContenedor.setResizable(true);
			this.jInternalFrameOrderByContenedor.setClosable(true);
			this.jInternalFrameOrderByContenedor.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByContenedor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByContenedor.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByContenedor.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByContenedor.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByContenedor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByContenedor.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Contenedores"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsContenedor = new GridBagConstraints();
			this.gridBagConstraintsContenedor.gridy =iPosYOrderBy++;
			this.gridBagConstraintsContenedor.gridx =iPosXOrderBy;
			this.gridBagConstraintsContenedor.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsContenedor.ipady =150;
				
			this.jPanelOrderByContenedor.add(jScrollPanelDatosContenedorOrderBy, this.gridBagConstraintsContenedor);//this.jTableDatosContenedorTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByContenedor = new JButtonMe();
			this.jButtonCerrarOrderByContenedor.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByContenedor,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByContenedor.setToolTipText("Cancelar"+" "+ContenedorConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByContenedor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsContenedor = new GridBagConstraints();
			this.gridBagConstraintsContenedor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsContenedor.gridy = iPosYOrderBy++;
			this.gridBagConstraintsContenedor.gridx = iPosXOrderBy;
									
			this.jPanelOrderByContenedor.add(this.jButtonCerrarOrderByContenedor, this.gridBagConstraintsContenedor);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalContenedor = new GridBagLayout();
			
			this.jScrollPanelOrderByContenedor= new JScrollPane(jPanelOrderByContenedor,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsContenedor = new GridBagConstraints();
			this.gridBagConstraintsContenedor.gridy =iPosYOrderBy;
			this.gridBagConstraintsContenedor.gridx =iPosXOrderBy;
			this.gridBagConstraintsContenedor.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByContenedor.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByContenedor.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalContenedor);
			
			this.jInternalFrameOrderByContenedor.getContentPane().add(this.jScrollPanelOrderByContenedor, this.gridBagConstraintsContenedor);			
		
		} else {
			this.jButtonAbrirOrderByContenedor = new JButtonMe();
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
		int iWidthTableCalculado=0;//1330
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=630;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=700;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.contenedorSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosContenedor.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosContenedor.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosContenedor.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosContenedor.getRowHeight();//ContenedorConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.contenedorSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > ContenedorConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaContenedor.isSelected()) {
					iHeightTable=ContenedorConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ContenedorConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ContenedorConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > ContenedorConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaContenedor.isSelected()) {
					iHeightTable=ContenedorConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ContenedorConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ContenedorConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosContenedor.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosContenedor.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosContenedor.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosContenedor.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosContenedor.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosContenedor.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByContenedor!=null && this.jInternalFrameOrderByContenedor.getjTableDatosOrderBy()!=null) {
			//if(!this.contenedorSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByContenedor.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByContenedor.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByContenedor.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByContenedor.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByContenedor.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByContenedor.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByContenedor.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosContenedor.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosContenedor.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosContenedor.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=contenedorLogic.getContenedors().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=contenedors.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<Contenedor> TraerContenedorBeans(List<Contenedor> contenedors,ArrayList<Classe> classes)throws Exception {
		try {
			for(Contenedor contenedor:contenedors) {
					
				if(!(ContenedorConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || ContenedorConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					contenedor.setsDetalleGeneralEntityReporte(ContenedorConstantesFunciones.getContenedorDescripcion(contenedor));
										
						
					
						
					
				} else  {
							
					//contenedor.setsDetalleGeneralEntityReporte(contenedor.getsDetalleGeneralEntityReporte());
										
				}
				
				//contenedorbeans.add(contenedorbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return contenedors;
    }
	//PARA REPORTES FIN
}
