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
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.*;
import com.bydan.erp.importaciones.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;

import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.importaciones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.comisiones.business.entity.*;
import com.bydan.erp.importaciones.business.entity.*;
import com.bydan.erp.tesoreria.business.entity.*;

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
import com.bydan.erp.facturacion.util.EstadoPedidoConstantesFunciones;

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
public class EstadoPedidoJInternalFrame extends EstadoPedidoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarEstadoPedido;
	
	protected JMenuBar jmenuBarEstadoPedido;
	
	protected JMenu jmenuEstadoPedido;
	protected JMenu jmenuDatosEstadoPedido;
	protected JMenu jmenuArchivoEstadoPedido;
	protected JMenu jmenuAccionesEstadoPedido;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosEstadoPedido = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutEstadoPedido;	
	protected GridBagConstraints gridBagConstraintsEstadoPedido;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public EstadoPedidoDetalleFormJInternalFrame jInternalFrameDetalleFormEstadoPedido;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoEstadoPedido;	
	protected ImportacionJInternalFrame jInternalFrameImportacionEstadoPedido;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected ColorGeneralBeanSwingJInternalFrame colorgeneralBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_colorgeneral="";
	
	public EstadoPedidoSessionBean estadopedidoSessionBean;
		
	
	
	public ColorGeneralSessionBean colorgeneralSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<EstadoPedido> estadopedidos;		
	public List<EstadoPedido> estadopedidosEliminados;	
	public List<EstadoPedido> estadopedidosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByEstadoPedido;		
	protected JButton jButtonAbrirOrderByEstadoPedido;
	
	
	//protected JPanel jPanelOrderByEstadoPedido;
	//public JScrollPane jScrollPanelOrderByEstadoPedido;	
	//protected JButton jButtonCerrarOrderByEstadoPedido;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public EstadoPedidoLogic estadopedidoLogic;
	
	
	
	public JScrollPane jScrollPanelDatosEstadoPedido;
	public JScrollPane jScrollPanelDatosEdicionEstadoPedido;
	public JScrollPane jScrollPanelDatosGeneralEstadoPedido;
    
	
	
	//public JScrollPane jScrollPanelDatosEstadoPedidoOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoEstadoPedido;
	//public JScrollPane jScrollPanelImportacionEstadoPedido;
	
	
	
	protected JPanel jPanelAccionesEstadoPedido;
	
    protected JPanel jPanelPaginacionEstadoPedido;
    protected JPanel jPanelParametrosReportesEstadoPedido;
	protected JPanel jPanelParametrosReportesAccionesEstadoPedido;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1EstadoPedido;
	protected JPanel jPanelParametrosAuxiliar2EstadoPedido;
	protected JPanel jPanelParametrosAuxiliar3EstadoPedido;
	protected JPanel jPanelParametrosAuxiliar4EstadoPedido;
	//protected JPanel jPanelParametrosAuxiliar5EstadoPedido;
	
	
	
	//protected JPanel jPanelReporteDinamicoEstadoPedido;
	//protected JPanel jPanelImportacionEstadoPedido;
	
	
	public JTable jTableDatosEstadoPedido;
	
	
	
	//public JTable jTableDatosEstadoPedidoOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoEstadoPedido;
	protected JButton jButtonDuplicarEstadoPedido;
	protected JButton jButtonCopiarEstadoPedido;
	protected JButton jButtonVerFormEstadoPedido;
	protected JButton jButtonNuevoRelacionesEstadoPedido;
	protected JButton jButtonModificarEstadoPedido;
	
    protected JButton jButtonGuardarCambiosTablaEstadoPedido;
	protected JButton jButtonCerrarEstadoPedido;
	
	
	protected JButton jButtonRecargarInformacionEstadoPedido;
	protected JButton jButtonProcesarInformacionEstadoPedido;
	
	
	protected JButton jButtonAnterioresEstadoPedido;
	protected JButton jButtonSiguientesEstadoPedido;
	protected JButton jButtonNuevoGuardarCambiosEstadoPedido;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoEstadoPedido;
	//protected JButton jButtonCerrarReporteDinamicoEstadoPedido;
	//protected JButton jButtonGenerarExcelReporteDinamicoEstadoPedido;	
	
	
	
	//protected JButton jButtonAbrirImportacionEstadoPedido;
	//protected JButton jButtonGenerarImportacionEstadoPedido;
	//protected JButton jButtonCerrarImportacionEstadoPedido;
	//protected JFileChooser jFileChooserImportacionEstadoPedido;
	//protected File fileImportacionEstadoPedido;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarEstadoPedido;
	protected JButton jButtonDuplicarToolBarEstadoPedido;
	protected JButton jButtonNuevoRelacionesToolBarEstadoPedido;
	
	
	public JButton jButtonGuardarCambiosToolBarEstadoPedido;
	protected JButton jButtonCopiarToolBarEstadoPedido;
	protected JButton jButtonVerFormToolBarEstadoPedido;
	public JButton jButtonGuardarCambiosTablaToolBarEstadoPedido;
	protected JButton jButtonMostrarOcultarTablaToolBarEstadoPedido;
	protected JButton jButtonCerrarToolBarEstadoPedido;
	
	protected JButton jButtonRecargarInformacionToolBarEstadoPedido;
	protected JButton jButtonProcesarInformacionToolBarEstadoPedido;
	protected JButton jButtonAnterioresToolBarEstadoPedido;
	protected JButton jButtonSiguientesToolBarEstadoPedido;
	protected JButton jButtonNuevoGuardarCambiosToolBarEstadoPedido;
	protected JButton jButtonAbrirOrderByToolBarEstadoPedido;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoEstadoPedido;
	protected JMenuItem jMenuItemDuplicarEstadoPedido;
	protected JMenuItem jMenuItemNuevoRelacionesEstadoPedido;
	
	
	protected JMenuItem jMenuItemGuardarCambiosEstadoPedido;
	protected JMenuItem jMenuItemCopiarEstadoPedido;
	protected JMenuItem jMenuItemVerFormEstadoPedido;
	protected JMenuItem jMenuItemGuardarCambiosTablaEstadoPedido;
	protected JMenuItem jMenuItemCerrarEstadoPedido;
	protected JMenuItem jMenuItemDetalleCerrarEstadoPedido;
	protected JMenuItem jMenuItemDetalleAbrirOrderByEstadoPedido;
	protected JMenuItem jMenuItemDetalleMostarOcultarEstadoPedido;
	
	protected JMenuItem jMenuItemRecargarInformacionEstadoPedido;
	protected JMenuItem jMenuItemProcesarInformacionEstadoPedido;
	protected JMenuItem jMenuItemAnterioresEstadoPedido;
	protected JMenuItem jMenuItemSiguientesEstadoPedido;
	protected JMenuItem jMenuItemNuevoGuardarCambiosEstadoPedido;
	protected JMenuItem jMenuItemAbrirOrderByEstadoPedido;
	protected JMenuItem jMenuItemMostrarOcultarEstadoPedido;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesEstadoPedido;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosEstadoPedido;
	protected JCheckBox jCheckBoxSeleccionadosEstadoPedido;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaEstadoPedido;
	protected JCheckBox jCheckBoxConGraficoReporteEstadoPedido;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesEstadoPedido;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesEstadoPedido;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoEstadoPedido;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoEstadoPedido;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesEstadoPedido;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionEstadoPedido;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesEstadoPedido;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesEstadoPedido;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarEstadoPedido;
	protected JTextField jTextFieldValorCampoGeneralEstadoPedido;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteEstadoPedido;
	//public JList<Reporte> jListColumnasSelectReporteEstadoPedido;
	//public JScrollPane jScrollColumnasSelectReporteEstadoPedido;
	
	//public JLabel jLabelRelacionesSelectReporteEstadoPedido;
	//public JList<Reporte> jListRelacionesSelectReporteEstadoPedido;
	//public JScrollPane jScrollRelacionesSelectReporteEstadoPedido;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoEstadoPedido;
	//protected JCheckBox jCheckBoxConGraficoDinamicoEstadoPedido;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoEstadoPedido;
	//public JLabel jLabelTiposArchivoReporteDinamicoEstadoPedido;
	
		
	//public JLabel jLabelArchivoImportacionEstadoPedido;	
	//public JLabel jLabelPathArchivoImportacionEstadoPedido;
	//protected JTextField jTextFieldPathArchivoImportacionEstadoPedido;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoEstadoPedido;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoEstadoPedido;
	
	//public JLabel jLabelColumnaCategoriaValorEstadoPedido;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorEstadoPedido;
	
	//public JLabel jLabelColumnasValoresGraficoEstadoPedido;
	//public JList<Reporte> jListColumnasValoresGraficoEstadoPedido;
	//public JScrollPane jScrollColumnasValoresGraficoEstadoPedido;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoEstadoPedido;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoEstadoPedido;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasEstadoPedido;
	public JPanel jPanelFK_IdColorGeneralEstadoPedido;
	public JButton jButtonFK_IdColorGeneralEstadoPedido;
	
	public JPanel jPanelid_color_generalFK_IdColorGeneralEstadoPedido;
	public JLabel jLabelid_color_generalFK_IdColorGeneralEstadoPedido;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_color_generalFK_IdColorGeneralEstadoPedido;
	public JButton jButtonid_color_generalFK_IdColorGeneralEstadoPedido= new JButtonMe();
	public JButton jButtonid_color_generalFK_IdColorGeneralEstadoPedidoUpdate= new JButtonMe();
	public JButton jButtonid_color_generalFK_IdColorGeneralEstadoPedidoBusqueda= new JButtonMe();

	
	
	
	
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
	public EstadoPedidoJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("EstadoPedido No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoPedidoJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EstadoPedido No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoPedidoJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EstadoPedido No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoPedidoJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("EstadoPedido No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionEstadoPedido)	{
		this.jButtonRecargarInformacionEstadoPedido = jButtonRecargarInformacionEstadoPedido;
	}
	
	public JButton getjButtonProcesarInformacionEstadoPedido() {
		return this.jButtonProcesarInformacionEstadoPedido;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionEstadoPedido)	{
		this.jButtonProcesarInformacionEstadoPedido = jButtonProcesarInformacionEstadoPedido;
	}
	
	
	public JButton getjButtonRecargarInformacionEstadoPedido() {
		return this.jButtonRecargarInformacionEstadoPedido;
	}
	
	
	public List<EstadoPedido> getestadopedidos() {
		return this.estadopedidos;
	}

	public void setestadopedidos(List<EstadoPedido> estadopedidos) {
		this.estadopedidos = estadopedidos;
	}
	
	public List<EstadoPedido> getestadopedidosAux() {
		return this.estadopedidosAux;
	}

	public void setestadopedidosAux(List<EstadoPedido> estadopedidosAux) {
		this.estadopedidosAux = estadopedidosAux;
	}
	
	public List<EstadoPedido> getestadopedidosEliminados() {
		return this.estadopedidosEliminados;
	}

	public void setEstadoPedidosEliminados(List<EstadoPedido> estadopedidosEliminados) {
		this.estadopedidosEliminados = estadopedidosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarEstadoPedido() {
		return jComboBoxTiposSeleccionarEstadoPedido;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarEstadoPedido(
			JComboBox jComboBoxTiposSeleccionarEstadoPedido) {
		this.jComboBoxTiposSeleccionarEstadoPedido = jComboBoxTiposSeleccionarEstadoPedido;
	}
	
	public void setBorderResaltarTiposSeleccionarEstadoPedido() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarEstadoPedido.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarEstadoPedido .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralEstadoPedido() {
		return jTextFieldValorCampoGeneralEstadoPedido;
	}

	public void setjTextFieldValorCampoGeneralEstadoPedido(
			JTextField jTextFieldValorCampoGeneralEstadoPedido) {
		this.jTextFieldValorCampoGeneralEstadoPedido = jTextFieldValorCampoGeneralEstadoPedido;
	}

	public void setBorderResaltarValorCampoGeneralEstadoPedido() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoPedido.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralEstadoPedido .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosEstadoPedido() {
		return this.jCheckBoxSeleccionarTodosEstadoPedido;
	}

	public void setjCheckBoxSeleccionarTodosEstadoPedido(
			JCheckBox jCheckBoxSeleccionarTodosEstadoPedido) {
		this.jCheckBoxSeleccionarTodosEstadoPedido = jCheckBoxSeleccionarTodosEstadoPedido;
	}

	public void setBorderResaltarSeleccionarTodosEstadoPedido() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoPedido.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosEstadoPedido .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosEstadoPedido() {
		return this.jCheckBoxSeleccionadosEstadoPedido;
	}

	public void setjCheckBoxSeleccionadosEstadoPedido(
			JCheckBox jCheckBoxSeleccionadosEstadoPedido) {
		this.jCheckBoxSeleccionadosEstadoPedido = jCheckBoxSeleccionadosEstadoPedido;
	}
	
	public void setBorderResaltarSeleccionadosEstadoPedido() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoPedido.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosEstadoPedido .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesEstadoPedido() {
		return this.jComboBoxTiposArchivosReportesEstadoPedido;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesEstadoPedido(
			JComboBox jComboBoxTiposArchivosReportesEstadoPedido) {
		this.jComboBoxTiposArchivosReportesEstadoPedido = jComboBoxTiposArchivosReportesEstadoPedido;
	}

	public void setBorderResaltarTiposArchivosReportesEstadoPedido() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoPedido.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesEstadoPedido .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesEstadoPedido() {
		return this.jComboBoxTiposReportesEstadoPedido;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesEstadoPedido(
			JComboBox jComboBoxTiposReportesEstadoPedido) {
		this.jComboBoxTiposReportesEstadoPedido = jComboBoxTiposReportesEstadoPedido;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoEstadoPedido() {
	//	return jComboBoxTiposReportesDinamicoEstadoPedido;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoEstadoPedido(
	//		JComboBox jComboBoxTiposReportesDinamicoEstadoPedido) {
	//	this.jComboBoxTiposReportesDinamicoEstadoPedido = jComboBoxTiposReportesDinamicoEstadoPedido;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoEstadoPedido() {
	//	return jComboBoxTiposArchivosReportesDinamicoEstadoPedido;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoEstadoPedido(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoEstadoPedido) {
	//	this.jComboBoxTiposArchivosReportesDinamicoEstadoPedido = jComboBoxTiposArchivosReportesDinamicoEstadoPedido;
	//}
	
	public void setBorderResaltarTiposReportesEstadoPedido() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoPedido.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesEstadoPedido .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesEstadoPedido() {
		return this.jComboBoxTiposGraficosReportesEstadoPedido;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesEstadoPedido(
			JComboBox jComboBoxTiposGraficosReportesEstadoPedido) {
		this.jComboBoxTiposGraficosReportesEstadoPedido = jComboBoxTiposGraficosReportesEstadoPedido;
	}
	
	public void setBorderResaltarTiposGraficosReportesEstadoPedido() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoPedido.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesEstadoPedido .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionEstadoPedido() {
		return this.jComboBoxTiposPaginacionEstadoPedido;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionEstadoPedido(
			JComboBox jComboBoxTiposPaginacionEstadoPedido) {
		this.jComboBoxTiposPaginacionEstadoPedido = jComboBoxTiposPaginacionEstadoPedido;
	}
	
	public void setBorderResaltarTiposPaginacionEstadoPedido() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoPedido.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionEstadoPedido .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesEstadoPedido() {
		return this.jComboBoxTiposRelacionesEstadoPedido;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesEstadoPedido() {
		return this.jComboBoxTiposAccionesEstadoPedido;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesEstadoPedido(
			JComboBox jComboBoxTiposRelacionesEstadoPedido) {
		this.jComboBoxTiposRelacionesEstadoPedido = jComboBoxTiposRelacionesEstadoPedido;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesEstadoPedido(
			JComboBox jComboBoxTiposAccionesEstadoPedido) {
		this.jComboBoxTiposAccionesEstadoPedido = jComboBoxTiposAccionesEstadoPedido;
	}
	
	public void setBorderResaltarTiposRelacionesEstadoPedido() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoPedido.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesEstadoPedido .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesEstadoPedido() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoPedido.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesEstadoPedido .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoEstadoPedido() {
	//	return jCheckBoxConGraficoDinamicoEstadoPedido;
	//}

	//public void setjCheckBoxConGraficoDinamicoEstadoPedido(
	//		JCheckBox jCheckBoxConGraficoDinamicoEstadoPedido) {
	//	this.jCheckBoxConGraficoDinamicoEstadoPedido = jCheckBoxConGraficoDinamicoEstadoPedido;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoEstadoPedido() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarEstadoPedido.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoEstadoPedido .setBorder(borderResaltar);		
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
		this.estadopedidoSessionBean=new EstadoPedidoSessionBean();
		
		this.estadopedidoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.estadopedidoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.estadopedidoSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=EstadoPedidoJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=EstadoPedidoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		EstadoPedidoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		EstadoPedidoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		EstadoPedidoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Estado Pedido MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.estadopedidoSessionBean.getEsGuardarRelacionado()) {
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
		
		EstadoPedidoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("EstadoPedido No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarEstadoPedido= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarEstadoPedido=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarEstadoPedido,this.jTtoolBarEstadoPedido,
							"nuevo","nuevo","Nuevo"+" "+EstadoPedidoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarEstadoPedido=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarEstadoPedido,this.jTtoolBarEstadoPedido,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarEstadoPedido=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarEstadoPedido,this.jTtoolBarEstadoPedido,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+EstadoPedidoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarEstadoPedido=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarEstadoPedido,this.jTtoolBarEstadoPedido,
							"duplicar","duplicar","Duplicar"+" "+EstadoPedidoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarEstadoPedido=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarEstadoPedido,this.jTtoolBarEstadoPedido,
							"copiar","copiar","Copiar"+" "+EstadoPedidoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarEstadoPedido=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarEstadoPedido,this.jTtoolBarEstadoPedido,
							"ver_form","ver_form","Ver"+" "+EstadoPedidoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarEstadoPedido=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEstadoPedido,this.jTtoolBarEstadoPedido,
							"recargar","recargar","Recargar"+" "+EstadoPedidoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarEstadoPedido=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEstadoPedido,this.jTtoolBarEstadoPedido,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarEstadoPedido=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEstadoPedido,this.jTtoolBarEstadoPedido,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarEstadoPedido=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarEstadoPedido,this.jTtoolBarEstadoPedido,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarEstadoPedido=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarEstadoPedido,this.jTtoolBarEstadoPedido,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarEstadoPedido=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarEstadoPedido,this.jTtoolBarEstadoPedido,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+EstadoPedidoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarEstadoPedido=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarEstadoPedido,this.jTtoolBarEstadoPedido,
							"cerrar","cerrar","Salir"+" "+EstadoPedidoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarEstadoPedido=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarEstadoPedido;
			
				this.jButtonProcesarInformacionToolBarEstadoPedido=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarEstadoPedido;
				
		//protected JButton jButtonModificarToolBarEstadoPedido;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarEstadoPedido=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuEstadoPedido=new JMenuMe("General");
		this.jmenuArchivoEstadoPedido=new JMenuMe("Archivo");
		this.jmenuAccionesEstadoPedido=new JMenuMe("Acciones");
		this.jmenuDatosEstadoPedido=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoEstadoPedido= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoEstadoPedido.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoEstadoPedido,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoEstadoPedido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarEstadoPedido= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarEstadoPedido.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarEstadoPedido,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarEstadoPedido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesEstadoPedido= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesEstadoPedido.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesEstadoPedido,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesEstadoPedido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosEstadoPedido= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosEstadoPedido.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosEstadoPedido,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosEstadoPedido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarEstadoPedido= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarEstadoPedido.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarEstadoPedido,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarEstadoPedido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormEstadoPedido= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormEstadoPedido.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormEstadoPedido,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormEstadoPedido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaEstadoPedido= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaEstadoPedido.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaEstadoPedido,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaEstadoPedido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarEstadoPedido= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarEstadoPedido.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarEstadoPedido,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarEstadoPedido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionEstadoPedido= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionEstadoPedido.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionEstadoPedido,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionEstadoPedido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionEstadoPedido= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionEstadoPedido.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionEstadoPedido,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresEstadoPedido= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresEstadoPedido.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresEstadoPedido,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresEstadoPedido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesEstadoPedido= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesEstadoPedido.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesEstadoPedido,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesEstadoPedido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByEstadoPedido= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByEstadoPedido.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByEstadoPedido,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByEstadoPedido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarEstadoPedido= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarEstadoPedido.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarEstadoPedido,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarEstadoPedido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByEstadoPedido= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByEstadoPedido.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByEstadoPedido,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByEstadoPedido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarEstadoPedido= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarEstadoPedido.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarEstadoPedido,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarEstadoPedido, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosEstadoPedido= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosEstadoPedido.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosEstadoPedido,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosEstadoPedido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoEstadoPedido.add(this.jMenuItemCerrarEstadoPedido);
			
			this.jmenuAccionesEstadoPedido.add(this.jMenuItemNuevoEstadoPedido);
			this.jmenuAccionesEstadoPedido.add(this.jMenuItemNuevoGuardarCambiosEstadoPedido);
			this.jmenuAccionesEstadoPedido.add(this.jMenuItemNuevoRelacionesEstadoPedido);
			this.jmenuAccionesEstadoPedido.add(this.jMenuItemGuardarCambiosTablaEstadoPedido);		
			this.jmenuAccionesEstadoPedido.add(this.jMenuItemDuplicarEstadoPedido);		
			this.jmenuAccionesEstadoPedido.add(this.jMenuItemCopiarEstadoPedido);		
			this.jmenuAccionesEstadoPedido.add(this.jMenuItemVerFormEstadoPedido);		
			
			this.jmenuDatosEstadoPedido.add(this.jMenuItemRecargarInformacionEstadoPedido);				
			this.jmenuDatosEstadoPedido.add(this.jMenuItemAnterioresEstadoPedido);				
			this.jmenuDatosEstadoPedido.add(this.jMenuItemSiguientesEstadoPedido);				
			this.jmenuDatosEstadoPedido.add(this.jMenuItemAbrirOrderByEstadoPedido);				
			this.jmenuDatosEstadoPedido.add(this.jMenuItemMostrarOcultarEstadoPedido);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesEstadoPedido.add(this.jMenuItemGuardarCambiosEstadoPedido);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoEstadoPedido, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesEstadoPedido, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosEstadoPedido, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarEstadoPedido.add(this.jmenuArchivoEstadoPedido);		
			this.jmenuBarEstadoPedido.add(this.jmenuAccionesEstadoPedido);		
			this.jmenuBarEstadoPedido.add(this.jmenuDatosEstadoPedido);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarEstadoPedido);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasEstadoPedido() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdColorGeneralEstadoPedido=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdColorGeneralEstadoPedido.setToolTipText("Buscar Por Color General ");
		this.jButtonFK_IdColorGeneralEstadoPedido= new JButtonMe();
		this.jButtonFK_IdColorGeneralEstadoPedido.setText("Buscar");
		this.jButtonFK_IdColorGeneralEstadoPedido.setToolTipText("Buscar Por Color General ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdColorGeneralEstadoPedido,"buscar_button","Buscar Por Color General ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdColorGeneralEstadoPedido, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_color_generalFK_IdColorGeneralEstadoPedido = new JLabelMe();
		jLabelid_color_generalFK_IdColorGeneralEstadoPedido.setText("Color General :");
		jLabelid_color_generalFK_IdColorGeneralEstadoPedido.setToolTipText("Color General");
		jLabelid_color_generalFK_IdColorGeneralEstadoPedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_color_generalFK_IdColorGeneralEstadoPedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_color_generalFK_IdColorGeneralEstadoPedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_color_generalFK_IdColorGeneralEstadoPedido,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_color_generalFK_IdColorGeneralEstadoPedido= new JComboBoxMe();
		jComboBoxid_color_generalFK_IdColorGeneralEstadoPedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_color_generalFK_IdColorGeneralEstadoPedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_color_generalFK_IdColorGeneralEstadoPedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_color_generalFK_IdColorGeneralEstadoPedido,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasEstadoPedido=new JTabbedPane();


		this.jTabbedPaneBusquedasEstadoPedido.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasEstadoPedido.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasEstadoPedido.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasEstadoPedido.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasEstadoPedido.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasEstadoPedido,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleEstadoPedido = new EstadoPedidoDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Estado Pedido DATOS");
			this.jInternalFrameDetalleFormEstadoPedido = new EstadoPedidoDetalleFormJInternalFrame(jDesktopPane,this.estadopedidoSessionBean.getConGuardarRelaciones(),this.estadopedidoSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormEstadoPedido = null;//new EstadoPedidoDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutEstadoPedido= new GridBagLayout();
		
		
		this.jTableDatosEstadoPedido = new JTableMe();      
		
		String sToolTipEstadoPedido="";
		sToolTipEstadoPedido=EstadoPedidoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipEstadoPedido+="(Facturacion.EstadoPedido)";
		}
		
		if(!this.estadopedidoSessionBean.getEsGuardarRelacionado()) {
			sToolTipEstadoPedido+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosEstadoPedido.setToolTipText(sToolTipEstadoPedido);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosEstadoPedido);
		this.jTableDatosEstadoPedido.setAutoCreateRowSorter(true);
		this.jTableDatosEstadoPedido.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosEstadoPedido.setRowSelectionAllowed(true);
		this.jTableDatosEstadoPedido.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosEstadoPedido,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoEstadoPedido = new JButtonMe();
		this.jButtonDuplicarEstadoPedido = new JButtonMe();
		this.jButtonCopiarEstadoPedido = new JButtonMe();
		this.jButtonVerFormEstadoPedido = new JButtonMe();
		this.jButtonNuevoRelacionesEstadoPedido = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaEstadoPedido = new JButtonMe();
		this.jButtonCerrarEstadoPedido = new JButtonMe();
		
		this.jScrollPanelDatosEstadoPedido = new JScrollPane();   
        this.jScrollPanelDatosGeneralEstadoPedido = new JScrollPane();
		
				
		
		
		this.jPanelAccionesEstadoPedido = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Estado Pedido";
		
		if(!this.estadopedidoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosEstadoPedido.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Pedidos" + this.sPath));
		} else {
			this.jScrollPanelDatosEstadoPedido.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralEstadoPedido.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesEstadoPedido.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesEstadoPedido.setToolTipText("Acciones");
        this.jPanelAccionesEstadoPedido.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralEstadoPedido, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEstadoPedido, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoEstadoPedido=new ReporteDinamicoJInternalFrame(EstadoPedidoConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoEstadoPedido();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionEstadoPedido=new ImportacionJInternalFrame(EstadoPedidoConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionEstadoPedido();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByEstadoPedido = new JButtonMe();
		
		this.jButtonAbrirOrderByEstadoPedido.setText("Orden");
		this.jButtonAbrirOrderByEstadoPedido.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByEstadoPedido,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByEstadoPedido, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByEstadoPedido.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByEstadoPedido.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByEstadoPedido=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEstadoPedido,false,this);
			
			//this.cargarOrderByEstadoPedido(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByEstadoPedido=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEstadoPedido,true,this);
			
			//this.cargarOrderByEstadoPedido(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosEstadoPedido.setMinimumSize(new Dimension(400,50));//530
		this.jTableDatosEstadoPedido.setMaximumSize(new Dimension(400,50));//530
		this.jTableDatosEstadoPedido.setPreferredSize(new Dimension(400,50));//530
		
		this.jScrollPanelDatosEstadoPedido.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosEstadoPedido.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosEstadoPedido.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoEstadoPedido.setText("Nuevo");
		this.jButtonDuplicarEstadoPedido.setText("Duplicar");
		this.jButtonCopiarEstadoPedido.setText("Copiar");
		this.jButtonVerFormEstadoPedido.setText("Ver");
		this.jButtonNuevoRelacionesEstadoPedido.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaEstadoPedido.setText("Guardar");
		this.jButtonCerrarEstadoPedido.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoEstadoPedido,"nuevo_button","Nuevo",this.estadopedidoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarEstadoPedido,"duplicar_button","Duplicar",this.estadopedidoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarEstadoPedido,"copiar_button","Copiar",this.estadopedidoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormEstadoPedido,"ver_form","Ver",this.estadopedidoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesEstadoPedido,"nuevorelaciones_button","Nuevo Rel",this.estadopedidoSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaEstadoPedido,"guardarcambiostabla_button","Guardar",this.estadopedidoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarEstadoPedido,"cerrar_button","Salir",this.estadopedidoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoEstadoPedido, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarEstadoPedido, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarEstadoPedido, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormEstadoPedido, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesEstadoPedido, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaEstadoPedido, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarEstadoPedido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoEstadoPedido.setToolTipText("Nuevo"+" "+EstadoPedidoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarEstadoPedido.setToolTipText("Duplicar"+" "+EstadoPedidoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarEstadoPedido.setToolTipText("Copiar"+" "+EstadoPedidoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormEstadoPedido.setToolTipText("Ver"+" "+EstadoPedidoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesEstadoPedido.setToolTipText("Nuevo Rel"+" "+EstadoPedidoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaEstadoPedido.setToolTipText("Guardar"+" "+EstadoPedidoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarEstadoPedido.setToolTipText("Salir"+" "+EstadoPedidoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoEstadoPedido";
		inputMap = this.jButtonNuevoEstadoPedido.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoEstadoPedido.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoEstadoPedido"));
		
		//DUPLICAR
		sMapKey = "DuplicarEstadoPedido";
		inputMap = this.jButtonDuplicarEstadoPedido.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarEstadoPedido.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarEstadoPedido"));
		
		//COPIAR
		sMapKey = "CopiarEstadoPedido";
		inputMap = this.jButtonCopiarEstadoPedido.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarEstadoPedido.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarEstadoPedido"));
		
		//VEr FORM
		sMapKey = "VerFormEstadoPedido";
		inputMap = this.jButtonVerFormEstadoPedido.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormEstadoPedido.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormEstadoPedido"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesEstadoPedido";
		inputMap = this.jButtonNuevoRelacionesEstadoPedido.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesEstadoPedido.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesEstadoPedido"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarEstadoPedido";
		inputMap = this.jButtonModificarEstadoPedido.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarEstadoPedido.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarEstadoPedido"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarEstadoPedido";
		inputMap = this.jButtonCerrarEstadoPedido.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarEstadoPedido.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarEstadoPedido"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaEstadoPedido";
		inputMap = this.jButtonGuardarCambiosTablaEstadoPedido.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaEstadoPedido.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaEstadoPedido"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesEstadoPedido = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesEstadoPedido = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionEstadoPedido = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1EstadoPedido= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2EstadoPedido= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3EstadoPedido= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4EstadoPedido= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5EstadoPedido= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesEstadoPedido.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesEstadoPedido.setName("jPanelParametrosReportesEstadoPedido"); 
		
		this.jPanelParametrosReportesAccionesEstadoPedido.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesEstadoPedido.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesEstadoPedido.setName("jPanelParametrosReportesAccionesEstadoPedido"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesEstadoPedido, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesEstadoPedido, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionEstadoPedido = new JButtonMe();
		this.jButtonRecargarInformacionEstadoPedido.setText("Recargar");
		this.jButtonRecargarInformacionEstadoPedido.setToolTipText("Recargar"+" "+EstadoPedidoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionEstadoPedido,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionEstadoPedido = new JButtonMe();
		this.jButtonProcesarInformacionEstadoPedido.setText("Procesar");
		this.jButtonProcesarInformacionEstadoPedido.setToolTipText("Procesar"+" "+EstadoPedidoConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionEstadoPedido.setVisible(false);
			
		this.jButtonProcesarInformacionEstadoPedido.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionEstadoPedido.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionEstadoPedido.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesEstadoPedido = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEstadoPedido.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesEstadoPedido.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesEstadoPedido = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEstadoPedido.setText("TIPO");       
		this.jComboBoxTiposReportesEstadoPedido.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesEstadoPedido = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEstadoPedido.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesEstadoPedido.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionEstadoPedido = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionEstadoPedido.setText("Paginacion");
		this.jComboBoxTiposPaginacionEstadoPedido.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesEstadoPedido = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesEstadoPedido.setText("Accion");
		this.jComboBoxTiposRelacionesEstadoPedido.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesEstadoPedido = new JComboBoxMe();
		//this.jComboBoxTiposAccionesEstadoPedido.setText("Accion");
		this.jComboBoxTiposAccionesEstadoPedido.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarEstadoPedido = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarEstadoPedido.setText("Accion");
		this.jComboBoxTiposSeleccionarEstadoPedido.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralEstadoPedido=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralEstadoPedido.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralEstadoPedido.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralEstadoPedido.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesEstadoPedido = new JLabelMe();
		
		this.jLabelAccionesEstadoPedido.setText("Acciones");		
		this.jLabelAccionesEstadoPedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEstadoPedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEstadoPedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosEstadoPedido = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosEstadoPedido.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosEstadoPedido.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosEstadoPedido = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosEstadoPedido.setText("Seleccionados");
		this.jCheckBoxSeleccionadosEstadoPedido.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaEstadoPedido = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaEstadoPedido.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaEstadoPedido.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteEstadoPedido = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteEstadoPedido.setText("Graf.");
		this.jCheckBoxConGraficoReporteEstadoPedido.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresEstadoPedido = new JButtonMe();
		//this.jButtonAnterioresEstadoPedido.setText("<<");
        this.jButtonAnterioresEstadoPedido.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresEstadoPedido,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresEstadoPedido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesEstadoPedido = new JButtonMe();
		//this.jButtonSiguientesEstadoPedido.setText(">>");
        this.jButtonSiguientesEstadoPedido.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesEstadoPedido,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesEstadoPedido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosEstadoPedido = new JButtonMe();
		this.jButtonNuevoGuardarCambiosEstadoPedido.setText("Nue");
        this.jButtonNuevoGuardarCambiosEstadoPedido.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosEstadoPedido,"nuevoguardarcambios_button","Nue",this.estadopedidoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosEstadoPedido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosEstadoPedido";
		inputMap = this.jButtonNuevoGuardarCambiosEstadoPedido.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosEstadoPedido.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosEstadoPedido"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionEstadoPedido";
		inputMap = this.jButtonRecargarInformacionEstadoPedido.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionEstadoPedido.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionEstadoPedido"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesEstadoPedido";
		inputMap = this.jButtonSiguientesEstadoPedido.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesEstadoPedido.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesEstadoPedido"));
		
		//ANTERIORES		
		sMapKey = "AnterioresEstadoPedido";
		inputMap = this.jButtonAnterioresEstadoPedido.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresEstadoPedido.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresEstadoPedido"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasEstadoPedido();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesEstadoPedido.setMinimumSize(new Dimension(this.getWidth(),EstadoPedidoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EstadoPedidoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesEstadoPedido.setMaximumSize(new Dimension(this.getWidth(),EstadoPedidoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EstadoPedidoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesEstadoPedido.setPreferredSize(new Dimension(this.getWidth(),EstadoPedidoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EstadoPedidoBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionEstadoPedido = new GridBagLayout();

			this.jPanelPaginacionEstadoPedido.setLayout(gridaBagLayoutPaginacionEstadoPedido);						
			
			this.gridBagConstraintsEstadoPedido = new GridBagConstraints();
			this.gridBagConstraintsEstadoPedido.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsEstadoPedido.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoPedido.gridy = 0;
			this.gridBagConstraintsEstadoPedido.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionEstadoPedido.add(this.jButtonAnterioresEstadoPedido, this.gridBagConstraintsEstadoPedido);
					
						
			this.gridBagConstraintsEstadoPedido = new GridBagConstraints();
			this.gridBagConstraintsEstadoPedido.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsEstadoPedido.gridy = 0;
			
			this.jPanelPaginacionEstadoPedido.add(this.jButtonNuevoGuardarCambiosEstadoPedido, this.gridBagConstraintsEstadoPedido);
						
			
			this.gridBagConstraintsEstadoPedido = new GridBagConstraints();
			this.gridBagConstraintsEstadoPedido.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsEstadoPedido.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsEstadoPedido.gridy = 0;
			this.jPanelPaginacionEstadoPedido.add(this.jButtonSiguientesEstadoPedido, this.gridBagConstraintsEstadoPedido);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsEstadoPedido = new GridBagConstraints();
			this.gridBagConstraintsEstadoPedido.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoPedido.gridy = 1;
			this.gridBagConstraintsEstadoPedido.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEstadoPedido.add(this.jButtonNuevoEstadoPedido, this.gridBagConstraintsEstadoPedido);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsEstadoPedido = new GridBagConstraints();
				this.gridBagConstraintsEstadoPedido.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsEstadoPedido.gridy = 1;
				this.gridBagConstraintsEstadoPedido.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionEstadoPedido.add(this.jButtonNuevoRelacionesEstadoPedido, this.gridBagConstraintsEstadoPedido);
			}
			
			
			if(!this.estadopedidoSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsEstadoPedido = new GridBagConstraints();
				this.gridBagConstraintsEstadoPedido.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsEstadoPedido.gridy = 1;
				this.gridBagConstraintsEstadoPedido.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionEstadoPedido.add(this.jButtonGuardarCambiosTablaEstadoPedido, this.gridBagConstraintsEstadoPedido);
			}
			
			
			
			this.gridBagConstraintsEstadoPedido = new GridBagConstraints();
			this.gridBagConstraintsEstadoPedido.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoPedido.gridy = 1;
			this.gridBagConstraintsEstadoPedido.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEstadoPedido.add(this.jButtonDuplicarEstadoPedido, this.gridBagConstraintsEstadoPedido);
			
			this.gridBagConstraintsEstadoPedido = new GridBagConstraints();
			this.gridBagConstraintsEstadoPedido.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoPedido.gridy = 1;
			this.gridBagConstraintsEstadoPedido.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEstadoPedido.add(this.jButtonCopiarEstadoPedido, this.gridBagConstraintsEstadoPedido);
		
			this.gridBagConstraintsEstadoPedido = new GridBagConstraints();
			this.gridBagConstraintsEstadoPedido.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoPedido.gridy = 1;
			this.gridBagConstraintsEstadoPedido.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEstadoPedido.add(this.jButtonVerFormEstadoPedido, this.gridBagConstraintsEstadoPedido);
		
			this.gridBagConstraintsEstadoPedido = new GridBagConstraints();
			this.gridBagConstraintsEstadoPedido.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoPedido.gridy = 1;
			this.gridBagConstraintsEstadoPedido.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionEstadoPedido.add(this.jButtonCerrarEstadoPedido, this.gridBagConstraintsEstadoPedido);
		
		
		
		this.jButtonRecargarInformacionEstadoPedido.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionEstadoPedido.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionEstadoPedido.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionEstadoPedido, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesEstadoPedido.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesEstadoPedido.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesEstadoPedido.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesEstadoPedido, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesEstadoPedido.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesEstadoPedido.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesEstadoPedido.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesEstadoPedido, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesEstadoPedido.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesEstadoPedido.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesEstadoPedido.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesEstadoPedido, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionEstadoPedido.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionEstadoPedido.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionEstadoPedido.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionEstadoPedido, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesEstadoPedido.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesEstadoPedido.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesEstadoPedido.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesEstadoPedido, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesEstadoPedido.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEstadoPedido.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEstadoPedido.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesEstadoPedido, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarEstadoPedido.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarEstadoPedido.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarEstadoPedido.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarEstadoPedido, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaEstadoPedido.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaEstadoPedido.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaEstadoPedido.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaEstadoPedido, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteEstadoPedido.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteEstadoPedido.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteEstadoPedido.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteEstadoPedido, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosEstadoPedido.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosEstadoPedido.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosEstadoPedido.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosEstadoPedido, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosEstadoPedido.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosEstadoPedido.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosEstadoPedido.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosEstadoPedido, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesEstadoPedido = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesEstadoPedido = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1EstadoPedido = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2EstadoPedido = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3EstadoPedido = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4EstadoPedido = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesEstadoPedido.setLayout(gridaBagParametrosReportesEstadoPedido);
			this.jPanelParametrosReportesAccionesEstadoPedido.setLayout(gridaBagParametrosReportesAccionesEstadoPedido);
			
			
			this.jPanelParametrosAuxiliar1EstadoPedido.setLayout(gridaBagParametrosAuxiliar1EstadoPedido);
			this.jPanelParametrosAuxiliar2EstadoPedido.setLayout(gridaBagParametrosAuxiliar2EstadoPedido);
			this.jPanelParametrosAuxiliar3EstadoPedido.setLayout(gridaBagParametrosAuxiliar3EstadoPedido);
			this.jPanelParametrosAuxiliar4EstadoPedido.setLayout(gridaBagParametrosAuxiliar4EstadoPedido);
			//this.jPanelParametrosAuxiliar5EstadoPedido.setLayout(gridaBagParametrosAuxiliar2EstadoPedido);			
			
			
			
			
			this.gridBagConstraintsEstadoPedido = new GridBagConstraints();
			this.gridBagConstraintsEstadoPedido.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoPedido.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEstadoPedido.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstadoPedido.add(this.jButtonRecargarInformacionEstadoPedido, this.gridBagConstraintsEstadoPedido);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsEstadoPedido = new GridBagConstraints();
			this.gridBagConstraintsEstadoPedido.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoPedido.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoPedido.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1EstadoPedido.add(this.jComboBoxTiposPaginacionEstadoPedido, this.gridBagConstraintsEstadoPedido);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsEstadoPedido = new GridBagConstraints();
			this.gridBagConstraintsEstadoPedido.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoPedido.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoPedido.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1EstadoPedido.add(this.jCheckBoxConAltoMaximoTablaEstadoPedido, this.gridBagConstraintsEstadoPedido);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsEstadoPedido = new GridBagConstraints();
			this.gridBagConstraintsEstadoPedido.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoPedido.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoPedido.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1EstadoPedido.add(this.jComboBoxTiposArchivosReportesEstadoPedido, this.gridBagConstraintsEstadoPedido);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsEstadoPedido = new GridBagConstraints();
			this.gridBagConstraintsEstadoPedido.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoPedido.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoPedido.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoPedido.add(this.jPanelParametrosAuxiliar1EstadoPedido, this.gridBagConstraintsEstadoPedido);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsEstadoPedido = new GridBagConstraints();
			this.gridBagConstraintsEstadoPedido.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoPedido.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoPedido.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEstadoPedido.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4EstadoPedido.add(this.jComboBoxTiposReportesEstadoPedido, this.gridBagConstraintsEstadoPedido);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsEstadoPedido = new GridBagConstraints();
			this.gridBagConstraintsEstadoPedido.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoPedido.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoPedido.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoPedido.add(this.jPanelParametrosAuxiliar4EstadoPedido, this.gridBagConstraintsEstadoPedido);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsEstadoPedido = new GridBagConstraints();
			this.gridBagConstraintsEstadoPedido.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoPedido.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoPedido.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoPedido.add(this.jComboBoxTiposReportesEstadoPedido, this.gridBagConstraintsEstadoPedido);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsEstadoPedido = new GridBagConstraints();
			this.gridBagConstraintsEstadoPedido.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoPedido.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoPedido.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEstadoPedido.add(this.jCheckBoxGenerarReporteEstadoPedido, this.gridBagConstraintsEstadoPedido);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsEstadoPedido = new GridBagConstraints();
			this.gridBagConstraintsEstadoPedido.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoPedido.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoPedido.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoPedido.add(this.jPanelParametrosAuxiliar2EstadoPedido, this.gridBagConstraintsEstadoPedido);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsEstadoPedido = new GridBagConstraints();
			this.gridBagConstraintsEstadoPedido.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoPedido.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEstadoPedido.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEstadoPedido.add(this.jLabelAccionesEstadoPedido, this.gridBagConstraintsEstadoPedido);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsEstadoPedido = new GridBagConstraints();
				this.gridBagConstraintsEstadoPedido.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsEstadoPedido.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsEstadoPedido.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesEstadoPedido.add(this.jButtonAbrirOrderByEstadoPedido, this.gridBagConstraintsEstadoPedido);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsEstadoPedido = new GridBagConstraints();
			this.gridBagConstraintsEstadoPedido.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsEstadoPedido.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoPedido.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstadoPedido.add(this.jComboBoxTiposSeleccionarEstadoPedido, this.gridBagConstraintsEstadoPedido);			
			
			
			/*
			this.gridBagConstraintsEstadoPedido = new GridBagConstraints();
			this.gridBagConstraintsEstadoPedido.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoPedido.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEstadoPedido.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEstadoPedido.add(this.jCheckBoxSeleccionarTodosEstadoPedido, this.gridBagConstraintsEstadoPedido);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsEstadoPedido = new GridBagConstraints();
			this.gridBagConstraintsEstadoPedido.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoPedido.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoPedido.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEstadoPedido.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3EstadoPedido.add(this.jCheckBoxSeleccionarTodosEstadoPedido, this.gridBagConstraintsEstadoPedido);															
				
			this.gridBagConstraintsEstadoPedido = new GridBagConstraints();
			this.gridBagConstraintsEstadoPedido.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoPedido.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoPedido.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEstadoPedido.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3EstadoPedido.add(this.jCheckBoxSeleccionadosEstadoPedido, this.gridBagConstraintsEstadoPedido);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsEstadoPedido = new GridBagConstraints();
			this.gridBagConstraintsEstadoPedido.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoPedido.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoPedido.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoPedido.add(this.jPanelParametrosAuxiliar3EstadoPedido, this.gridBagConstraintsEstadoPedido);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsEstadoPedido = new GridBagConstraints();
			this.gridBagConstraintsEstadoPedido.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoPedido.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstadoPedido.add(this.jComboBoxTiposRelacionesEstadoPedido, this.gridBagConstraintsEstadoPedido);
				
			this.gridBagConstraintsEstadoPedido = new GridBagConstraints();
			this.gridBagConstraintsEstadoPedido.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoPedido.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstadoPedido.add(this.jComboBoxTiposAccionesEstadoPedido, this.gridBagConstraintsEstadoPedido);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosEstadoPedido = new GridBagLayout();

			this.jScrollPanelDatosEstadoPedido.setLayout(gridaBagLayoutDatosEstadoPedido);
			
			this.gridBagConstraintsEstadoPedido = new GridBagConstraints();
			this.gridBagConstraintsEstadoPedido.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoPedido.gridy = 0;
			this.gridBagConstraintsEstadoPedido.gridx = 0;
			
			this.jScrollPanelDatosEstadoPedido.add(this.jTableDatosEstadoPedido, this.gridBagConstraintsEstadoPedido);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosEstadoPedido.setViewportView(this.jTableDatosEstadoPedido);
		this.jTableDatosEstadoPedido.setFillsViewportHeight(true);
		this.jTableDatosEstadoPedido.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesEstadoPedido= new GridBagLayout();
		this.jPanelAccionesEstadoPedido.setLayout(gridaBagLayoutAccionesEstadoPedido);
		
		
		/*	
		this.gridBagConstraintsEstadoPedido = new GridBagConstraints();
		this.gridBagConstraintsEstadoPedido.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoPedido.gridy = 0;
		this.gridBagConstraintsEstadoPedido.gridx = 0;
			
		this.jPanelAccionesEstadoPedido.add(this.jButtonNuevoEstadoPedido, this.gridBagConstraintsEstadoPedido);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdColorGeneralEstadoPedido= new GridBagLayout();
		gridaBagLayoutFK_IdColorGeneralEstadoPedido.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdColorGeneralEstadoPedido.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdColorGeneralEstadoPedido.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdColorGeneralEstadoPedido.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdColorGeneralEstadoPedido.setLayout(gridaBagLayoutFK_IdColorGeneralEstadoPedido);

		gridBagConstraintsEstadoPedido = new GridBagConstraints();
		gridBagConstraintsEstadoPedido.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEstadoPedido.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEstadoPedido.gridy = 0;
		gridBagConstraintsEstadoPedido.gridx = 0;
		jPanelFK_IdColorGeneralEstadoPedido.add(jLabelid_color_generalFK_IdColorGeneralEstadoPedido, gridBagConstraintsEstadoPedido);

		gridBagConstraintsEstadoPedido = new GridBagConstraints();
		gridBagConstraintsEstadoPedido.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEstadoPedido.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEstadoPedido.gridy = 0;
		gridBagConstraintsEstadoPedido.gridx = 1;
		jPanelFK_IdColorGeneralEstadoPedido.add(jComboBoxid_color_generalFK_IdColorGeneralEstadoPedido, gridBagConstraintsEstadoPedido);

		gridBagConstraintsEstadoPedido = new GridBagConstraints();
		gridBagConstraintsEstadoPedido.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEstadoPedido.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEstadoPedido.gridy = 1;
		gridBagConstraintsEstadoPedido.gridx =1;
		jPanelFK_IdColorGeneralEstadoPedido.add(jButtonFK_IdColorGeneralEstadoPedido, gridBagConstraintsEstadoPedido);

		jTabbedPaneBusquedasEstadoPedido.addTab("1.-Por Color General ", jPanelFK_IdColorGeneralEstadoPedido);
		jTabbedPaneBusquedasEstadoPedido.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutEstadoPedido = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutEstadoPedido);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.estadopedidoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsEstadoPedido = new GridBagConstraints();						
			this.gridBagConstraintsEstadoPedido.gridy = iGridyPrincipal++;
			this.gridBagConstraintsEstadoPedido.gridx = 0;		
			//this.gridBagConstraintsEstadoPedido.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoPedido.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsEstadoPedido.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarEstadoPedido, this.gridBagConstraintsEstadoPedido);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsEstadoPedido = new GridBagConstraints();
		this.gridBagConstraintsEstadoPedido.gridy = iGridyPrincipal++;
		this.gridBagConstraintsEstadoPedido.gridx = 0;		
		//this.gridBagConstraintsEstadoPedido.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoPedido.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsEstadoPedido.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsEstadoPedido);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsEstadoPedido = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsEstadoPedido.gridy = iGridyPrincipal++;
			this.gridBagConstraintsEstadoPedido.gridx = 0;		
			this.gridBagConstraintsEstadoPedido.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoPedido.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsEstadoPedido.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasEstadoPedido, this.gridBagConstraintsEstadoPedido);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsEstadoPedido = new GridBagConstraints();
		this.gridBagConstraintsEstadoPedido.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoPedido.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesEstadoPedido, this.gridBagConstraintsEstadoPedido);								
		
		
		/*
		this.gridBagConstraintsEstadoPedido = new GridBagConstraints();
		this.gridBagConstraintsEstadoPedido.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoPedido.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesEstadoPedido, this.gridBagConstraintsEstadoPedido);
		*/		
		
		this.gridBagConstraintsEstadoPedido = new GridBagConstraints();
		this.gridBagConstraintsEstadoPedido.gridy =iGridyPrincipal++;
		this.gridBagConstraintsEstadoPedido.gridx =0;
		this.gridBagConstraintsEstadoPedido.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsEstadoPedido.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosEstadoPedido, this.gridBagConstraintsEstadoPedido);
				
		
		this.gridBagConstraintsEstadoPedido = new GridBagConstraints();
		this.gridBagConstraintsEstadoPedido.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoPedido.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionEstadoPedido, this.gridBagConstraintsEstadoPedido);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(EstadoPedidoJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosEstadoPedido= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosEstadoPedido = new GridBagLayout();
			this.jPanelBusquedasParametrosEstadoPedido.setLayout(gridaBagLayoutBusquedasParametrosEstadoPedido);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralEstadoPedido=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralEstadoPedido.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEstadoPedido.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEstadoPedido.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsEstadoPedido = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsEstadoPedido = new GridBagConstraints();
		this.gridBagConstraintsEstadoPedido.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoPedido.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposEstadoPedido, this.gridBagConstraintsEstadoPedido);
			
			
		this.gridBagConstraintsEstadoPedido = new GridBagConstraints();
		this.gridBagConstraintsEstadoPedido.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoPedido.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosEstadoPedido, this.gridBagConstraintsEstadoPedido);
		
			
		this.gridBagConstraintsEstadoPedido = new GridBagConstraints();
		this.gridBagConstraintsEstadoPedido.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsEstadoPedido.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesEstadoPedido, this.gridBagConstraintsEstadoPedido);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralEstadoPedido;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoEstadoPedido() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoEstadoPedido = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoEstadoPedido = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoEstadoPedido.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoEstadoPedido.setName("jPanelReporteDinamicoEstadoPedido"); 
		
		this.jPanelReporteDinamicoEstadoPedido.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoEstadoPedido.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoEstadoPedido.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoEstadoPedido.setLayout(gridaBagLayoutReporteDinamicoEstadoPedido);
		
		
		this.jInternalFrameReporteDinamicoEstadoPedido= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoEstadoPedido = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteEstadoPedido= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoEstadoPedido.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoEstadoPedido.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoEstadoPedido.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoEstadoPedido.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoEstadoPedido.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoEstadoPedido.setResizable(true);
	    this.jInternalFrameReporteDinamicoEstadoPedido.setClosable(true);
	    this.jInternalFrameReporteDinamicoEstadoPedido.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoEstadoPedido.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoEstadoPedido.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoEstadoPedido.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoEstadoPedido.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Pedidos"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteEstadoPedido = new JLabelMe();

		this.jLabelColumnasSelectReporteEstadoPedido.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteEstadoPedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteEstadoPedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteEstadoPedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsEstadoPedido = new GridBagConstraints();
		this.gridBagConstraintsEstadoPedido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoPedido.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoPedido.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoEstadoPedido.add(this.jLabelColumnasSelectReporteEstadoPedido, this.gridBagConstraintsEstadoPedido);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteEstadoPedido = new JList<Reporte>();
		this.jListColumnasSelectReporteEstadoPedido.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteEstadoPedido.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteEstadoPedido.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteEstadoPedido.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteEstadoPedido.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteEstadoPedido=new JScrollPane(this.jListColumnasSelectReporteEstadoPedido);
			
			this.jScrollColumnasSelectReporteEstadoPedido.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteEstadoPedido.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteEstadoPedido.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteEstadoPedido.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsEstadoPedido = new GridBagConstraints();
		this.gridBagConstraintsEstadoPedido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoPedido.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoPedido.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoEstadoPedido.add(this.jListColumnasSelectReporteEstadoPedido, this.gridBagConstraintsEstadoPedido);
		this.jPanelReporteDinamicoEstadoPedido.add(this.jScrollColumnasSelectReporteEstadoPedido, this.gridBagConstraintsEstadoPedido);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteEstadoPedido = new JLabelMe();

		this.jLabelRelacionesSelectReporteEstadoPedido.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteEstadoPedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteEstadoPedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteEstadoPedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsEstadoPedido = new GridBagConstraints();
		this.gridBagConstraintsEstadoPedido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoPedido.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoPedido.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoEstadoPedido.add(this.jLabelRelacionesSelectReporteEstadoPedido, this.gridBagConstraintsEstadoPedido);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteEstadoPedido = new JList<Reporte>();
		this.jListRelacionesSelectReporteEstadoPedido.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteEstadoPedido.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteEstadoPedido.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteEstadoPedido.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteEstadoPedido.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteEstadoPedido=new JScrollPane(this.jListRelacionesSelectReporteEstadoPedido);
			
			this.jScrollRelacionesSelectReporteEstadoPedido.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteEstadoPedido.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteEstadoPedido.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteEstadoPedido.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsEstadoPedido = new GridBagConstraints();
		this.gridBagConstraintsEstadoPedido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoPedido.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoPedido.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoEstadoPedido.add(this.jListRelacionesSelectReporteEstadoPedido, this.gridBagConstraintsEstadoPedido);
		this.jPanelReporteDinamicoEstadoPedido.add(this.jScrollRelacionesSelectReporteEstadoPedido, this.gridBagConstraintsEstadoPedido);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoEstadoPedido = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoEstadoPedido = new JComboBoxMe();
		this.jListColumnasValoresGraficoEstadoPedido = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoEstadoPedido = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoEstadoPedido.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoEstadoPedido.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoEstadoPedido.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoEstadoPedido.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoEstadoPedido, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoEstadoPedido = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoEstadoPedido.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoEstadoPedido.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoEstadoPedido.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoEstadoPedido.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoEstadoPedido, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoEstadoPedido = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoEstadoPedido.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoEstadoPedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoEstadoPedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoEstadoPedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsEstadoPedido = new GridBagConstraints();
		this.gridBagConstraintsEstadoPedido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoPedido.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoPedido.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEstadoPedido.add(this.jLabelGenerarExcelReporteDinamicoEstadoPedido, this.gridBagConstraintsEstadoPedido);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoEstadoPedido = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoEstadoPedido.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoEstadoPedido,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoEstadoPedido.setToolTipText("Generar EXCEL"+" "+EstadoPedidoConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsEstadoPedido = new GridBagConstraints();
		//this.gridBagConstraintsEstadoPedido.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsEstadoPedido.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsEstadoPedido.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoEstadoPedido.add(this.jButtonGenerarExcelReporteDinamicoEstadoPedido, this.gridBagConstraintsEstadoPedido);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsEstadoPedido = new GridBagConstraints();
		this.gridBagConstraintsEstadoPedido.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoPedido.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEstadoPedido.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEstadoPedido.add(this.jComboBoxTiposReportesDinamicoEstadoPedido, this.gridBagConstraintsEstadoPedido);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoEstadoPedido = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoEstadoPedido.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoEstadoPedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoEstadoPedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoEstadoPedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsEstadoPedido = new GridBagConstraints();
		this.gridBagConstraintsEstadoPedido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoPedido.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoPedido.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEstadoPedido.add(this.jLabelTiposArchivoReporteDinamicoEstadoPedido, this.gridBagConstraintsEstadoPedido);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsEstadoPedido = new GridBagConstraints();
		this.gridBagConstraintsEstadoPedido.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoPedido.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEstadoPedido.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEstadoPedido.add(this.jComboBoxTiposArchivosReportesDinamicoEstadoPedido, this.gridBagConstraintsEstadoPedido);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoEstadoPedido = new JButtonMe();
		this.jButtonGenerarReporteDinamicoEstadoPedido.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoEstadoPedido,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoEstadoPedido.setToolTipText("Generar"+" "+EstadoPedidoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsEstadoPedido = new GridBagConstraints();
		this.gridBagConstraintsEstadoPedido.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoPedido.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEstadoPedido.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEstadoPedido.add(this.jButtonGenerarReporteDinamicoEstadoPedido, this.gridBagConstraintsEstadoPedido);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoEstadoPedido = new JButtonMe();
		this.jButtonCerrarReporteDinamicoEstadoPedido.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoEstadoPedido,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoEstadoPedido.setToolTipText("Cancelar"+" "+EstadoPedidoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsEstadoPedido = new GridBagConstraints();
		this.gridBagConstraintsEstadoPedido.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoPedido.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEstadoPedido.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEstadoPedido.add(this.jButtonCerrarReporteDinamicoEstadoPedido, this.gridBagConstraintsEstadoPedido);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalEstadoPedido = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoEstadoPedido= new JScrollPane(jPanelReporteDinamicoEstadoPedido,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoEstadoPedido.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoEstadoPedido.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoEstadoPedido.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoEstadoPedido.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Pedidos"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsEstadoPedido = new GridBagConstraints();
		this.gridBagConstraintsEstadoPedido.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsEstadoPedido.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsEstadoPedido.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoEstadoPedido.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoEstadoPedido.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalEstadoPedido);
		this.jInternalFrameReporteDinamicoEstadoPedido.getContentPane().add(this.jScrollPanelReporteDinamicoEstadoPedido, this.gridBagConstraintsEstadoPedido);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionEstadoPedido() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionEstadoPedido = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionEstadoPedido = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionEstadoPedido.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionEstadoPedido.setName("jPanelImportacionEstadoPedido"); 
		
		this.jPanelImportacionEstadoPedido.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionEstadoPedido.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionEstadoPedido.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionEstadoPedido.setLayout(gridaBagLayoutImportacionEstadoPedido);
		
		
		this.jInternalFrameImportacionEstadoPedido= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionEstadoPedido= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionEstadoPedido = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteEstadoPedido= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionEstadoPedido.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionEstadoPedido.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionEstadoPedido.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionEstadoPedido.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionEstadoPedido.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionEstadoPedido.setResizable(true);
	    this.jInternalFrameImportacionEstadoPedido.setClosable(true);
	    this.jInternalFrameImportacionEstadoPedido.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionEstadoPedido.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionEstadoPedido.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionEstadoPedido.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionEstadoPedido.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionEstadoPedido.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionEstadoPedido.setResizable(true);
	    this.jInternalFrameImportacionEstadoPedido.setClosable(true);
	    this.jInternalFrameImportacionEstadoPedido.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionEstadoPedido.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionEstadoPedido.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionEstadoPedido.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionEstadoPedido.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Pedidos"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionEstadoPedido = new JLabelMe();

		this.jLabelArchivoImportacionEstadoPedido.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionEstadoPedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionEstadoPedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionEstadoPedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsEstadoPedido = new GridBagConstraints();
		this.gridBagConstraintsEstadoPedido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoPedido.gridy = iPosYImportacion;		
		this.gridBagConstraintsEstadoPedido.gridx = iPosXImportacion++;
			
		this.jPanelImportacionEstadoPedido.add(this.jLabelArchivoImportacionEstadoPedido, this.gridBagConstraintsEstadoPedido);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionEstadoPedido = new JFileChooser();		
		this.jFileChooserImportacionEstadoPedido.setToolTipText("ESCOGER ARCHIVO"+" "+EstadoPedidoConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionEstadoPedido = new JButtonMe();
		this.jButtonAbrirImportacionEstadoPedido.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionEstadoPedido,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionEstadoPedido.setToolTipText("Generar"+" "+EstadoPedidoConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsEstadoPedido = new GridBagConstraints();
		this.gridBagConstraintsEstadoPedido.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoPedido.gridy = iPosYImportacion;
		this.gridBagConstraintsEstadoPedido.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEstadoPedido.add(this.jButtonAbrirImportacionEstadoPedido, this.gridBagConstraintsEstadoPedido);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionEstadoPedido = new JLabelMe();

		this.jLabelPathArchivoImportacionEstadoPedido.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionEstadoPedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionEstadoPedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionEstadoPedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsEstadoPedido = new GridBagConstraints();
		this.gridBagConstraintsEstadoPedido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoPedido.gridy = iPosYImportacion;		
		this.gridBagConstraintsEstadoPedido.gridx = iPosXImportacion++;
			
		this.jPanelImportacionEstadoPedido.add(this.jLabelPathArchivoImportacionEstadoPedido, this.gridBagConstraintsEstadoPedido);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionEstadoPedido=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionEstadoPedido.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionEstadoPedido.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionEstadoPedido.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsEstadoPedido = new GridBagConstraints();
		this.gridBagConstraintsEstadoPedido.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoPedido.gridy = iPosYImportacion;
		this.gridBagConstraintsEstadoPedido.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEstadoPedido.add(this.jTextFieldPathArchivoImportacionEstadoPedido, this.gridBagConstraintsEstadoPedido);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionEstadoPedido = new JButtonMe();
		this.jButtonGenerarImportacionEstadoPedido.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionEstadoPedido,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionEstadoPedido.setToolTipText("Generar"+" "+EstadoPedidoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsEstadoPedido = new GridBagConstraints();
		this.gridBagConstraintsEstadoPedido.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoPedido.gridy = iPosYImportacion;
		this.gridBagConstraintsEstadoPedido.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEstadoPedido.add(this.jButtonGenerarImportacionEstadoPedido, this.gridBagConstraintsEstadoPedido);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionEstadoPedido = new JButtonMe();
		this.jButtonCerrarImportacionEstadoPedido.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionEstadoPedido,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionEstadoPedido.setToolTipText("Cancelar"+" "+EstadoPedidoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsEstadoPedido = new GridBagConstraints();
		this.gridBagConstraintsEstadoPedido.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoPedido.gridy = iPosYImportacion;
		this.gridBagConstraintsEstadoPedido.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEstadoPedido.add(this.jButtonCerrarImportacionEstadoPedido, this.gridBagConstraintsEstadoPedido);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalEstadoPedido = new GridBagLayout();
		
		this.jScrollPanelImportacionEstadoPedido= new JScrollPane(jPanelImportacionEstadoPedido,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsEstadoPedido = new GridBagConstraints();
		this.gridBagConstraintsEstadoPedido.gridy =iPosYImportacion;
		this.gridBagConstraintsEstadoPedido.gridx =iPosXImportacion;
		this.gridBagConstraintsEstadoPedido.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionEstadoPedido.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionEstadoPedido.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalEstadoPedido);
		this.jInternalFrameImportacionEstadoPedido.getContentPane().add(this.jScrollPanelImportacionEstadoPedido, this.gridBagConstraintsEstadoPedido);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByEstadoPedido(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByEstadoPedido = new JButtonMe();
			this.jButtonAbrirOrderByEstadoPedido.setText("Orden");
			this.jButtonAbrirOrderByEstadoPedido.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByEstadoPedido,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByEstadoPedido, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByEstadoPedido";
			inputMap = this.jButtonAbrirOrderByEstadoPedido.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByEstadoPedido.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByEstadoPedido"));
		
		
			GridBagLayout gridaBagLayoutOrderByEstadoPedido = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByEstadoPedido = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByEstadoPedido.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByEstadoPedido.setName("jPanelOrderByEstadoPedido"); 
			
			this.jPanelOrderByEstadoPedido.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByEstadoPedido.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByEstadoPedido.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByEstadoPedido, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByEstadoPedido.setLayout(gridaBagLayoutOrderByEstadoPedido);
			
			
			this.jTableDatosEstadoPedidoOrderBy = new JTableMe();        
			this.jTableDatosEstadoPedidoOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosEstadoPedidoOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosEstadoPedidoOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosEstadoPedidoOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosEstadoPedidoOrderBy.setViewportView(this.jTableDatosEstadoPedidoOrderBy);
			this.jTableDatosEstadoPedidoOrderBy.setFillsViewportHeight(true);
			this.jTableDatosEstadoPedidoOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByEstadoPedido= new OrderByJInternalFrame();
			this.jInternalFrameOrderByEstadoPedido= new OrderByJInternalFrame();
			this.jScrollPanelOrderByEstadoPedido = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteEstadoPedido= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByEstadoPedido.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByEstadoPedido.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByEstadoPedido.setTitle("Orden");
			this.jInternalFrameOrderByEstadoPedido.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByEstadoPedido.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByEstadoPedido.setResizable(true);
			this.jInternalFrameOrderByEstadoPedido.setClosable(true);
			this.jInternalFrameOrderByEstadoPedido.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByEstadoPedido, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByEstadoPedido.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByEstadoPedido.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByEstadoPedido.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByEstadoPedido, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByEstadoPedido.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Pedidos"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsEstadoPedido = new GridBagConstraints();
			this.gridBagConstraintsEstadoPedido.gridy =iPosYOrderBy++;
			this.gridBagConstraintsEstadoPedido.gridx =iPosXOrderBy;
			this.gridBagConstraintsEstadoPedido.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsEstadoPedido.ipady =150;
				
			this.jPanelOrderByEstadoPedido.add(jScrollPanelDatosEstadoPedidoOrderBy, this.gridBagConstraintsEstadoPedido);//this.jTableDatosEstadoPedidoTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByEstadoPedido = new JButtonMe();
			this.jButtonCerrarOrderByEstadoPedido.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByEstadoPedido,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByEstadoPedido.setToolTipText("Cancelar"+" "+EstadoPedidoConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByEstadoPedido, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsEstadoPedido = new GridBagConstraints();
			this.gridBagConstraintsEstadoPedido.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoPedido.gridy = iPosYOrderBy++;
			this.gridBagConstraintsEstadoPedido.gridx = iPosXOrderBy;
									
			this.jPanelOrderByEstadoPedido.add(this.jButtonCerrarOrderByEstadoPedido, this.gridBagConstraintsEstadoPedido);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalEstadoPedido = new GridBagLayout();
			
			this.jScrollPanelOrderByEstadoPedido= new JScrollPane(jPanelOrderByEstadoPedido,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsEstadoPedido = new GridBagConstraints();
			this.gridBagConstraintsEstadoPedido.gridy =iPosYOrderBy;
			this.gridBagConstraintsEstadoPedido.gridx =iPosXOrderBy;
			this.gridBagConstraintsEstadoPedido.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByEstadoPedido.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByEstadoPedido.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalEstadoPedido);
			
			this.jInternalFrameOrderByEstadoPedido.getContentPane().add(this.jScrollPanelOrderByEstadoPedido, this.gridBagConstraintsEstadoPedido);			
		
		} else {
			this.jButtonAbrirOrderByEstadoPedido = new JButtonMe();
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
		int iWidthTableCalculado=0;//1130
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=530;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=400;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=200;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.estadopedidoSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosEstadoPedido.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosEstadoPedido.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosEstadoPedido.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosEstadoPedido.getRowHeight();//EstadoPedidoConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.estadopedidoSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > EstadoPedidoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaEstadoPedido.isSelected()) {
					iHeightTable=EstadoPedidoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < EstadoPedidoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=EstadoPedidoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > EstadoPedidoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaEstadoPedido.isSelected()) {
					iHeightTable=EstadoPedidoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < EstadoPedidoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=EstadoPedidoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosEstadoPedido.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosEstadoPedido.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosEstadoPedido.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosEstadoPedido.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosEstadoPedido.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosEstadoPedido.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByEstadoPedido!=null && this.jInternalFrameOrderByEstadoPedido.getjTableDatosOrderBy()!=null) {
			//if(!this.estadopedidoSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByEstadoPedido.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByEstadoPedido.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByEstadoPedido.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByEstadoPedido.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByEstadoPedido.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByEstadoPedido.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByEstadoPedido.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosEstadoPedido.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosEstadoPedido.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosEstadoPedido.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=estadopedidoLogic.getEstadoPedidos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=estadopedidos.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<EstadoPedido> TraerEstadoPedidoBeans(List<EstadoPedido> estadopedidos,ArrayList<Classe> classes)throws Exception {
		try {
			for(EstadoPedido estadopedido:estadopedidos) {
					
				if(!(EstadoPedidoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || EstadoPedidoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					estadopedido.setsDetalleGeneralEntityReporte(EstadoPedidoConstantesFunciones.getEstadoPedidoDescripcion(estadopedido));
										
						
					
					

					if(estadopedido.getConsignacions()!=null && Funciones.existeClass(classes,Consignacion.class)) {
						try{estadopedido.setconsignacionsDescripcionReporte(new JRBeanCollectionDataSource(ConsignacionJInternalFrame.TraerConsignacionBeans(estadopedido.getConsignacions(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(estadopedido.getPedidoExporExpors()!=null && Funciones.existeClass(classes,PedidoExpor.class)) {
						try{estadopedido.setpedidoexporExporsDescripcionReporte(new JRBeanCollectionDataSource(PedidoExporJInternalFrame.TraerPedidoExporBeans(estadopedido.getPedidoExporExpors(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//estadopedido.setsDetalleGeneralEntityReporte(estadopedido.getsDetalleGeneralEntityReporte());
										
				}
				
				//estadopedidobeans.add(estadopedidobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return estadopedidos;
    }
	//PARA REPORTES FIN
}
