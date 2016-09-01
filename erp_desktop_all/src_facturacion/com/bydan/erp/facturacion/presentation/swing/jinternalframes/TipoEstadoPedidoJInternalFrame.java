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

import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;

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
import com.bydan.erp.facturacion.util.TipoEstadoPedidoConstantesFunciones;

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
public class TipoEstadoPedidoJInternalFrame extends TipoEstadoPedidoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarTipoEstadoPedido;
	
	protected JMenuBar jmenuBarTipoEstadoPedido;
	
	protected JMenu jmenuTipoEstadoPedido;
	protected JMenu jmenuDatosTipoEstadoPedido;
	protected JMenu jmenuArchivoTipoEstadoPedido;
	protected JMenu jmenuAccionesTipoEstadoPedido;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosTipoEstadoPedido = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoEstadoPedido;	
	protected GridBagConstraints gridBagConstraintsTipoEstadoPedido;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public TipoEstadoPedidoDetalleFormJInternalFrame jInternalFrameDetalleFormTipoEstadoPedido;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoTipoEstadoPedido;	
	protected ImportacionJInternalFrame jInternalFrameImportacionTipoEstadoPedido;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected PaisBeanSwingJInternalFrame paisBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_pais="";
	
	public TipoEstadoPedidoSessionBean tipoestadopedidoSessionBean;
		
	
	
	public PaisSessionBean paisSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<TipoEstadoPedido> tipoestadopedidos;		
	public List<TipoEstadoPedido> tipoestadopedidosEliminados;	
	public List<TipoEstadoPedido> tipoestadopedidosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByTipoEstadoPedido;		
	protected JButton jButtonAbrirOrderByTipoEstadoPedido;
	
	
	//protected JPanel jPanelOrderByTipoEstadoPedido;
	//public JScrollPane jScrollPanelOrderByTipoEstadoPedido;	
	//protected JButton jButtonCerrarOrderByTipoEstadoPedido;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public TipoEstadoPedidoLogic tipoestadopedidoLogic;
	
	
	
	public JScrollPane jScrollPanelDatosTipoEstadoPedido;
	public JScrollPane jScrollPanelDatosEdicionTipoEstadoPedido;
	public JScrollPane jScrollPanelDatosGeneralTipoEstadoPedido;
    
	
	
	//public JScrollPane jScrollPanelDatosTipoEstadoPedidoOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoTipoEstadoPedido;
	//public JScrollPane jScrollPanelImportacionTipoEstadoPedido;
	
	
	
	protected JPanel jPanelAccionesTipoEstadoPedido;
	
    protected JPanel jPanelPaginacionTipoEstadoPedido;
    protected JPanel jPanelParametrosReportesTipoEstadoPedido;
	protected JPanel jPanelParametrosReportesAccionesTipoEstadoPedido;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1TipoEstadoPedido;
	protected JPanel jPanelParametrosAuxiliar2TipoEstadoPedido;
	protected JPanel jPanelParametrosAuxiliar3TipoEstadoPedido;
	protected JPanel jPanelParametrosAuxiliar4TipoEstadoPedido;
	//protected JPanel jPanelParametrosAuxiliar5TipoEstadoPedido;
	
	
	
	//protected JPanel jPanelReporteDinamicoTipoEstadoPedido;
	//protected JPanel jPanelImportacionTipoEstadoPedido;
	
	
	public JTable jTableDatosTipoEstadoPedido;
	
	
	
	//public JTable jTableDatosTipoEstadoPedidoOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoTipoEstadoPedido;
	protected JButton jButtonDuplicarTipoEstadoPedido;
	protected JButton jButtonCopiarTipoEstadoPedido;
	protected JButton jButtonVerFormTipoEstadoPedido;
	protected JButton jButtonNuevoRelacionesTipoEstadoPedido;
	protected JButton jButtonModificarTipoEstadoPedido;
	
    protected JButton jButtonGuardarCambiosTablaTipoEstadoPedido;
	protected JButton jButtonCerrarTipoEstadoPedido;
	
	
	protected JButton jButtonRecargarInformacionTipoEstadoPedido;
	protected JButton jButtonProcesarInformacionTipoEstadoPedido;
	
	
	protected JButton jButtonAnterioresTipoEstadoPedido;
	protected JButton jButtonSiguientesTipoEstadoPedido;
	protected JButton jButtonNuevoGuardarCambiosTipoEstadoPedido;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoTipoEstadoPedido;
	//protected JButton jButtonCerrarReporteDinamicoTipoEstadoPedido;
	//protected JButton jButtonGenerarExcelReporteDinamicoTipoEstadoPedido;	
	
	
	
	//protected JButton jButtonAbrirImportacionTipoEstadoPedido;
	//protected JButton jButtonGenerarImportacionTipoEstadoPedido;
	//protected JButton jButtonCerrarImportacionTipoEstadoPedido;
	//protected JFileChooser jFileChooserImportacionTipoEstadoPedido;
	//protected File fileImportacionTipoEstadoPedido;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoEstadoPedido;
	protected JButton jButtonDuplicarToolBarTipoEstadoPedido;
	protected JButton jButtonNuevoRelacionesToolBarTipoEstadoPedido;
	
	
	public JButton jButtonGuardarCambiosToolBarTipoEstadoPedido;
	protected JButton jButtonCopiarToolBarTipoEstadoPedido;
	protected JButton jButtonVerFormToolBarTipoEstadoPedido;
	public JButton jButtonGuardarCambiosTablaToolBarTipoEstadoPedido;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoEstadoPedido;
	protected JButton jButtonCerrarToolBarTipoEstadoPedido;
	
	protected JButton jButtonRecargarInformacionToolBarTipoEstadoPedido;
	protected JButton jButtonProcesarInformacionToolBarTipoEstadoPedido;
	protected JButton jButtonAnterioresToolBarTipoEstadoPedido;
	protected JButton jButtonSiguientesToolBarTipoEstadoPedido;
	protected JButton jButtonNuevoGuardarCambiosToolBarTipoEstadoPedido;
	protected JButton jButtonAbrirOrderByToolBarTipoEstadoPedido;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoEstadoPedido;
	protected JMenuItem jMenuItemDuplicarTipoEstadoPedido;
	protected JMenuItem jMenuItemNuevoRelacionesTipoEstadoPedido;
	
	
	protected JMenuItem jMenuItemGuardarCambiosTipoEstadoPedido;
	protected JMenuItem jMenuItemCopiarTipoEstadoPedido;
	protected JMenuItem jMenuItemVerFormTipoEstadoPedido;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoEstadoPedido;
	protected JMenuItem jMenuItemCerrarTipoEstadoPedido;
	protected JMenuItem jMenuItemDetalleCerrarTipoEstadoPedido;
	protected JMenuItem jMenuItemDetalleAbrirOrderByTipoEstadoPedido;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoEstadoPedido;
	
	protected JMenuItem jMenuItemRecargarInformacionTipoEstadoPedido;
	protected JMenuItem jMenuItemProcesarInformacionTipoEstadoPedido;
	protected JMenuItem jMenuItemAnterioresTipoEstadoPedido;
	protected JMenuItem jMenuItemSiguientesTipoEstadoPedido;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoEstadoPedido;
	protected JMenuItem jMenuItemAbrirOrderByTipoEstadoPedido;
	protected JMenuItem jMenuItemMostrarOcultarTipoEstadoPedido;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoEstadoPedido;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosTipoEstadoPedido;
	protected JCheckBox jCheckBoxSeleccionadosTipoEstadoPedido;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaTipoEstadoPedido;
	protected JCheckBox jCheckBoxConGraficoReporteTipoEstadoPedido;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesTipoEstadoPedido;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesTipoEstadoPedido;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoTipoEstadoPedido;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoTipoEstadoPedido;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesTipoEstadoPedido;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionTipoEstadoPedido;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoEstadoPedido;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoEstadoPedido;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarTipoEstadoPedido;
	protected JTextField jTextFieldValorCampoGeneralTipoEstadoPedido;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteTipoEstadoPedido;
	//public JList<Reporte> jListColumnasSelectReporteTipoEstadoPedido;
	//public JScrollPane jScrollColumnasSelectReporteTipoEstadoPedido;
	
	//public JLabel jLabelRelacionesSelectReporteTipoEstadoPedido;
	//public JList<Reporte> jListRelacionesSelectReporteTipoEstadoPedido;
	//public JScrollPane jScrollRelacionesSelectReporteTipoEstadoPedido;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoTipoEstadoPedido;
	//protected JCheckBox jCheckBoxConGraficoDinamicoTipoEstadoPedido;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoTipoEstadoPedido;
	//public JLabel jLabelTiposArchivoReporteDinamicoTipoEstadoPedido;
	
		
	//public JLabel jLabelArchivoImportacionTipoEstadoPedido;	
	//public JLabel jLabelPathArchivoImportacionTipoEstadoPedido;
	//protected JTextField jTextFieldPathArchivoImportacionTipoEstadoPedido;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoTipoEstadoPedido;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoTipoEstadoPedido;
	
	//public JLabel jLabelColumnaCategoriaValorTipoEstadoPedido;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorTipoEstadoPedido;
	
	//public JLabel jLabelColumnasValoresGraficoTipoEstadoPedido;
	//public JList<Reporte> jListColumnasValoresGraficoTipoEstadoPedido;
	//public JScrollPane jScrollColumnasValoresGraficoTipoEstadoPedido;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoTipoEstadoPedido;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoTipoEstadoPedido;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasTipoEstadoPedido;
	public JPanel jPanelFK_IdPaisTipoEstadoPedido;
	public JButton jButtonFK_IdPaisTipoEstadoPedido;
	
	public JPanel jPanelid_paisFK_IdPaisTipoEstadoPedido;
	public JLabel jLabelid_paisFK_IdPaisTipoEstadoPedido;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_paisFK_IdPaisTipoEstadoPedido;
	public JButton jButtonid_paisFK_IdPaisTipoEstadoPedido= new JButtonMe();
	public JButton jButtonid_paisFK_IdPaisTipoEstadoPedidoUpdate= new JButtonMe();
	public JButton jButtonid_paisFK_IdPaisTipoEstadoPedidoBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=330;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public TipoEstadoPedidoJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("TipoEstadoPedido No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoEstadoPedidoJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoEstadoPedido No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoEstadoPedidoJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoEstadoPedido No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoEstadoPedidoJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoEstadoPedido No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionTipoEstadoPedido)	{
		this.jButtonRecargarInformacionTipoEstadoPedido = jButtonRecargarInformacionTipoEstadoPedido;
	}
	
	public JButton getjButtonProcesarInformacionTipoEstadoPedido() {
		return this.jButtonProcesarInformacionTipoEstadoPedido;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoEstadoPedido)	{
		this.jButtonProcesarInformacionTipoEstadoPedido = jButtonProcesarInformacionTipoEstadoPedido;
	}
	
	
	public JButton getjButtonRecargarInformacionTipoEstadoPedido() {
		return this.jButtonRecargarInformacionTipoEstadoPedido;
	}
	
	
	public List<TipoEstadoPedido> gettipoestadopedidos() {
		return this.tipoestadopedidos;
	}

	public void settipoestadopedidos(List<TipoEstadoPedido> tipoestadopedidos) {
		this.tipoestadopedidos = tipoestadopedidos;
	}
	
	public List<TipoEstadoPedido> gettipoestadopedidosAux() {
		return this.tipoestadopedidosAux;
	}

	public void settipoestadopedidosAux(List<TipoEstadoPedido> tipoestadopedidosAux) {
		this.tipoestadopedidosAux = tipoestadopedidosAux;
	}
	
	public List<TipoEstadoPedido> gettipoestadopedidosEliminados() {
		return this.tipoestadopedidosEliminados;
	}

	public void setTipoEstadoPedidosEliminados(List<TipoEstadoPedido> tipoestadopedidosEliminados) {
		this.tipoestadopedidosEliminados = tipoestadopedidosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarTipoEstadoPedido() {
		return jComboBoxTiposSeleccionarTipoEstadoPedido;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarTipoEstadoPedido(
			JComboBox jComboBoxTiposSeleccionarTipoEstadoPedido) {
		this.jComboBoxTiposSeleccionarTipoEstadoPedido = jComboBoxTiposSeleccionarTipoEstadoPedido;
	}
	
	public void setBorderResaltarTiposSeleccionarTipoEstadoPedido() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarTipoEstadoPedido.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarTipoEstadoPedido .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralTipoEstadoPedido() {
		return jTextFieldValorCampoGeneralTipoEstadoPedido;
	}

	public void setjTextFieldValorCampoGeneralTipoEstadoPedido(
			JTextField jTextFieldValorCampoGeneralTipoEstadoPedido) {
		this.jTextFieldValorCampoGeneralTipoEstadoPedido = jTextFieldValorCampoGeneralTipoEstadoPedido;
	}

	public void setBorderResaltarValorCampoGeneralTipoEstadoPedido() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoEstadoPedido.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralTipoEstadoPedido .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosTipoEstadoPedido() {
		return this.jCheckBoxSeleccionarTodosTipoEstadoPedido;
	}

	public void setjCheckBoxSeleccionarTodosTipoEstadoPedido(
			JCheckBox jCheckBoxSeleccionarTodosTipoEstadoPedido) {
		this.jCheckBoxSeleccionarTodosTipoEstadoPedido = jCheckBoxSeleccionarTodosTipoEstadoPedido;
	}

	public void setBorderResaltarSeleccionarTodosTipoEstadoPedido() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoEstadoPedido.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosTipoEstadoPedido .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosTipoEstadoPedido() {
		return this.jCheckBoxSeleccionadosTipoEstadoPedido;
	}

	public void setjCheckBoxSeleccionadosTipoEstadoPedido(
			JCheckBox jCheckBoxSeleccionadosTipoEstadoPedido) {
		this.jCheckBoxSeleccionadosTipoEstadoPedido = jCheckBoxSeleccionadosTipoEstadoPedido;
	}
	
	public void setBorderResaltarSeleccionadosTipoEstadoPedido() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoEstadoPedido.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosTipoEstadoPedido .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesTipoEstadoPedido() {
		return this.jComboBoxTiposArchivosReportesTipoEstadoPedido;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesTipoEstadoPedido(
			JComboBox jComboBoxTiposArchivosReportesTipoEstadoPedido) {
		this.jComboBoxTiposArchivosReportesTipoEstadoPedido = jComboBoxTiposArchivosReportesTipoEstadoPedido;
	}

	public void setBorderResaltarTiposArchivosReportesTipoEstadoPedido() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoEstadoPedido.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesTipoEstadoPedido .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesTipoEstadoPedido() {
		return this.jComboBoxTiposReportesTipoEstadoPedido;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesTipoEstadoPedido(
			JComboBox jComboBoxTiposReportesTipoEstadoPedido) {
		this.jComboBoxTiposReportesTipoEstadoPedido = jComboBoxTiposReportesTipoEstadoPedido;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoTipoEstadoPedido() {
	//	return jComboBoxTiposReportesDinamicoTipoEstadoPedido;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoTipoEstadoPedido(
	//		JComboBox jComboBoxTiposReportesDinamicoTipoEstadoPedido) {
	//	this.jComboBoxTiposReportesDinamicoTipoEstadoPedido = jComboBoxTiposReportesDinamicoTipoEstadoPedido;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoTipoEstadoPedido() {
	//	return jComboBoxTiposArchivosReportesDinamicoTipoEstadoPedido;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoTipoEstadoPedido(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoTipoEstadoPedido) {
	//	this.jComboBoxTiposArchivosReportesDinamicoTipoEstadoPedido = jComboBoxTiposArchivosReportesDinamicoTipoEstadoPedido;
	//}
	
	public void setBorderResaltarTiposReportesTipoEstadoPedido() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoEstadoPedido.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesTipoEstadoPedido .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesTipoEstadoPedido() {
		return this.jComboBoxTiposGraficosReportesTipoEstadoPedido;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesTipoEstadoPedido(
			JComboBox jComboBoxTiposGraficosReportesTipoEstadoPedido) {
		this.jComboBoxTiposGraficosReportesTipoEstadoPedido = jComboBoxTiposGraficosReportesTipoEstadoPedido;
	}
	
	public void setBorderResaltarTiposGraficosReportesTipoEstadoPedido() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoEstadoPedido.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesTipoEstadoPedido .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionTipoEstadoPedido() {
		return this.jComboBoxTiposPaginacionTipoEstadoPedido;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionTipoEstadoPedido(
			JComboBox jComboBoxTiposPaginacionTipoEstadoPedido) {
		this.jComboBoxTiposPaginacionTipoEstadoPedido = jComboBoxTiposPaginacionTipoEstadoPedido;
	}
	
	public void setBorderResaltarTiposPaginacionTipoEstadoPedido() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoEstadoPedido.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionTipoEstadoPedido .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesTipoEstadoPedido() {
		return this.jComboBoxTiposRelacionesTipoEstadoPedido;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoEstadoPedido() {
		return this.jComboBoxTiposAccionesTipoEstadoPedido;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoEstadoPedido(
			JComboBox jComboBoxTiposRelacionesTipoEstadoPedido) {
		this.jComboBoxTiposRelacionesTipoEstadoPedido = jComboBoxTiposRelacionesTipoEstadoPedido;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoEstadoPedido(
			JComboBox jComboBoxTiposAccionesTipoEstadoPedido) {
		this.jComboBoxTiposAccionesTipoEstadoPedido = jComboBoxTiposAccionesTipoEstadoPedido;
	}
	
	public void setBorderResaltarTiposRelacionesTipoEstadoPedido() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoEstadoPedido.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesTipoEstadoPedido .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesTipoEstadoPedido() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoEstadoPedido.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesTipoEstadoPedido .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoTipoEstadoPedido() {
	//	return jCheckBoxConGraficoDinamicoTipoEstadoPedido;
	//}

	//public void setjCheckBoxConGraficoDinamicoTipoEstadoPedido(
	//		JCheckBox jCheckBoxConGraficoDinamicoTipoEstadoPedido) {
	//	this.jCheckBoxConGraficoDinamicoTipoEstadoPedido = jCheckBoxConGraficoDinamicoTipoEstadoPedido;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoTipoEstadoPedido() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarTipoEstadoPedido.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoTipoEstadoPedido .setBorder(borderResaltar);		
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
		this.tipoestadopedidoSessionBean=new TipoEstadoPedidoSessionBean();
		
		this.tipoestadopedidoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipoestadopedidoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipoestadopedidoSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=TipoEstadoPedidoJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=TipoEstadoPedidoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoEstadoPedidoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoEstadoPedidoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoEstadoPedidoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Estado Pedido MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.tipoestadopedidoSessionBean.getEsGuardarRelacionado()) {
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
		
		TipoEstadoPedidoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("TipoEstadoPedido No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarTipoEstadoPedido= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarTipoEstadoPedido=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarTipoEstadoPedido,this.jTtoolBarTipoEstadoPedido,
							"nuevo","nuevo","Nuevo"+" "+TipoEstadoPedidoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoEstadoPedido=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarTipoEstadoPedido,this.jTtoolBarTipoEstadoPedido,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoEstadoPedido=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarTipoEstadoPedido,this.jTtoolBarTipoEstadoPedido,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+TipoEstadoPedidoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarTipoEstadoPedido=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarTipoEstadoPedido,this.jTtoolBarTipoEstadoPedido,
							"duplicar","duplicar","Duplicar"+" "+TipoEstadoPedidoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarTipoEstadoPedido=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarTipoEstadoPedido,this.jTtoolBarTipoEstadoPedido,
							"copiar","copiar","Copiar"+" "+TipoEstadoPedidoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarTipoEstadoPedido=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarTipoEstadoPedido,this.jTtoolBarTipoEstadoPedido,
							"ver_form","ver_form","Ver"+" "+TipoEstadoPedidoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarTipoEstadoPedido=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoEstadoPedido,this.jTtoolBarTipoEstadoPedido,
							"recargar","recargar","Recargar"+" "+TipoEstadoPedidoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarTipoEstadoPedido=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoEstadoPedido,this.jTtoolBarTipoEstadoPedido,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarTipoEstadoPedido=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoEstadoPedido,this.jTtoolBarTipoEstadoPedido,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarTipoEstadoPedido=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarTipoEstadoPedido,this.jTtoolBarTipoEstadoPedido,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarTipoEstadoPedido=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarTipoEstadoPedido,this.jTtoolBarTipoEstadoPedido,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarTipoEstadoPedido=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarTipoEstadoPedido,this.jTtoolBarTipoEstadoPedido,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+TipoEstadoPedidoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarTipoEstadoPedido=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarTipoEstadoPedido,this.jTtoolBarTipoEstadoPedido,
							"cerrar","cerrar","Salir"+" "+TipoEstadoPedidoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarTipoEstadoPedido=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarTipoEstadoPedido;
			
				this.jButtonProcesarInformacionToolBarTipoEstadoPedido=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarTipoEstadoPedido;
				
		//protected JButton jButtonModificarToolBarTipoEstadoPedido;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarTipoEstadoPedido=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuTipoEstadoPedido=new JMenuMe("General");
		this.jmenuArchivoTipoEstadoPedido=new JMenuMe("Archivo");
		this.jmenuAccionesTipoEstadoPedido=new JMenuMe("Acciones");
		this.jmenuDatosTipoEstadoPedido=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoEstadoPedido= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoEstadoPedido.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoEstadoPedido,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoEstadoPedido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarTipoEstadoPedido= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarTipoEstadoPedido.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarTipoEstadoPedido,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarTipoEstadoPedido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesTipoEstadoPedido= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesTipoEstadoPedido.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesTipoEstadoPedido,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesTipoEstadoPedido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosTipoEstadoPedido= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoEstadoPedido.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoEstadoPedido,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoEstadoPedido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarTipoEstadoPedido= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarTipoEstadoPedido.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarTipoEstadoPedido,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarTipoEstadoPedido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormTipoEstadoPedido= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormTipoEstadoPedido.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormTipoEstadoPedido,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormTipoEstadoPedido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaTipoEstadoPedido= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaTipoEstadoPedido.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaTipoEstadoPedido,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaTipoEstadoPedido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoEstadoPedido= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoEstadoPedido.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoEstadoPedido,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoEstadoPedido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionTipoEstadoPedido= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionTipoEstadoPedido.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionTipoEstadoPedido,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionTipoEstadoPedido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionTipoEstadoPedido= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionTipoEstadoPedido.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionTipoEstadoPedido,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresTipoEstadoPedido= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresTipoEstadoPedido.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresTipoEstadoPedido,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresTipoEstadoPedido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesTipoEstadoPedido= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesTipoEstadoPedido.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesTipoEstadoPedido,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesTipoEstadoPedido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByTipoEstadoPedido= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByTipoEstadoPedido.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByTipoEstadoPedido,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByTipoEstadoPedido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoEstadoPedido= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoEstadoPedido.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoEstadoPedido,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoEstadoPedido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByTipoEstadoPedido= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByTipoEstadoPedido.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByTipoEstadoPedido,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByTipoEstadoPedido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoEstadoPedido= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoEstadoPedido.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoEstadoPedido,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoEstadoPedido, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosTipoEstadoPedido= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosTipoEstadoPedido.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosTipoEstadoPedido,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosTipoEstadoPedido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoTipoEstadoPedido.add(this.jMenuItemCerrarTipoEstadoPedido);
			
			this.jmenuAccionesTipoEstadoPedido.add(this.jMenuItemNuevoTipoEstadoPedido);
			this.jmenuAccionesTipoEstadoPedido.add(this.jMenuItemNuevoGuardarCambiosTipoEstadoPedido);
			this.jmenuAccionesTipoEstadoPedido.add(this.jMenuItemNuevoRelacionesTipoEstadoPedido);
			this.jmenuAccionesTipoEstadoPedido.add(this.jMenuItemGuardarCambiosTablaTipoEstadoPedido);		
			this.jmenuAccionesTipoEstadoPedido.add(this.jMenuItemDuplicarTipoEstadoPedido);		
			this.jmenuAccionesTipoEstadoPedido.add(this.jMenuItemCopiarTipoEstadoPedido);		
			this.jmenuAccionesTipoEstadoPedido.add(this.jMenuItemVerFormTipoEstadoPedido);		
			
			this.jmenuDatosTipoEstadoPedido.add(this.jMenuItemRecargarInformacionTipoEstadoPedido);				
			this.jmenuDatosTipoEstadoPedido.add(this.jMenuItemAnterioresTipoEstadoPedido);				
			this.jmenuDatosTipoEstadoPedido.add(this.jMenuItemSiguientesTipoEstadoPedido);				
			this.jmenuDatosTipoEstadoPedido.add(this.jMenuItemAbrirOrderByTipoEstadoPedido);				
			this.jmenuDatosTipoEstadoPedido.add(this.jMenuItemMostrarOcultarTipoEstadoPedido);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesTipoEstadoPedido.add(this.jMenuItemGuardarCambiosTipoEstadoPedido);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoTipoEstadoPedido, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesTipoEstadoPedido, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosTipoEstadoPedido, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarTipoEstadoPedido.add(this.jmenuArchivoTipoEstadoPedido);		
			this.jmenuBarTipoEstadoPedido.add(this.jmenuAccionesTipoEstadoPedido);		
			this.jmenuBarTipoEstadoPedido.add(this.jmenuDatosTipoEstadoPedido);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarTipoEstadoPedido);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasTipoEstadoPedido() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdPaisTipoEstadoPedido=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdPaisTipoEstadoPedido.setToolTipText("Buscar Por Pais ");
		this.jButtonFK_IdPaisTipoEstadoPedido= new JButtonMe();
		this.jButtonFK_IdPaisTipoEstadoPedido.setText("Buscar");
		this.jButtonFK_IdPaisTipoEstadoPedido.setToolTipText("Buscar Por Pais ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdPaisTipoEstadoPedido,"buscar_button","Buscar Por Pais ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdPaisTipoEstadoPedido, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_paisFK_IdPaisTipoEstadoPedido = new JLabelMe();
		jLabelid_paisFK_IdPaisTipoEstadoPedido.setText("Pais :");
		jLabelid_paisFK_IdPaisTipoEstadoPedido.setToolTipText("Pais");
		jLabelid_paisFK_IdPaisTipoEstadoPedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_paisFK_IdPaisTipoEstadoPedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_paisFK_IdPaisTipoEstadoPedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_paisFK_IdPaisTipoEstadoPedido,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_paisFK_IdPaisTipoEstadoPedido= new JComboBoxMe();
		jComboBoxid_paisFK_IdPaisTipoEstadoPedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_paisFK_IdPaisTipoEstadoPedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_paisFK_IdPaisTipoEstadoPedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_paisFK_IdPaisTipoEstadoPedido,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasTipoEstadoPedido=new JTabbedPane();


		this.jTabbedPaneBusquedasTipoEstadoPedido.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoEstadoPedido.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoEstadoPedido.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasTipoEstadoPedido.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasTipoEstadoPedido.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasTipoEstadoPedido,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleTipoEstadoPedido = new TipoEstadoPedidoDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Tipo Estado Pedido DATOS");
			this.jInternalFrameDetalleFormTipoEstadoPedido = new TipoEstadoPedidoDetalleFormJInternalFrame(jDesktopPane,this.tipoestadopedidoSessionBean.getConGuardarRelaciones(),this.tipoestadopedidoSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormTipoEstadoPedido = null;//new TipoEstadoPedidoDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoEstadoPedido= new GridBagLayout();
		
		
		this.jTableDatosTipoEstadoPedido = new JTableMe();      
		
		String sToolTipTipoEstadoPedido="";
		sToolTipTipoEstadoPedido=TipoEstadoPedidoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoEstadoPedido+="(Facturacion.TipoEstadoPedido)";
		}
		
		if(!this.tipoestadopedidoSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoEstadoPedido+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosTipoEstadoPedido.setToolTipText(sToolTipTipoEstadoPedido);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosTipoEstadoPedido);
		this.jTableDatosTipoEstadoPedido.setAutoCreateRowSorter(true);
		this.jTableDatosTipoEstadoPedido.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosTipoEstadoPedido.setRowSelectionAllowed(true);
		this.jTableDatosTipoEstadoPedido.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosTipoEstadoPedido,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoTipoEstadoPedido = new JButtonMe();
		this.jButtonDuplicarTipoEstadoPedido = new JButtonMe();
		this.jButtonCopiarTipoEstadoPedido = new JButtonMe();
		this.jButtonVerFormTipoEstadoPedido = new JButtonMe();
		this.jButtonNuevoRelacionesTipoEstadoPedido = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaTipoEstadoPedido = new JButtonMe();
		this.jButtonCerrarTipoEstadoPedido = new JButtonMe();
		
		this.jScrollPanelDatosTipoEstadoPedido = new JScrollPane();   
        this.jScrollPanelDatosGeneralTipoEstadoPedido = new JScrollPane();
		
				
		
		
		this.jPanelAccionesTipoEstadoPedido = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Estado Pedido";
		
		if(!this.tipoestadopedidoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoEstadoPedido.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Estado Pedidos" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoEstadoPedido.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralTipoEstadoPedido.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesTipoEstadoPedido.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoEstadoPedido.setToolTipText("Acciones");
        this.jPanelAccionesTipoEstadoPedido.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoEstadoPedido, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoEstadoPedido, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoTipoEstadoPedido=new ReporteDinamicoJInternalFrame(TipoEstadoPedidoConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoTipoEstadoPedido();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionTipoEstadoPedido=new ImportacionJInternalFrame(TipoEstadoPedidoConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionTipoEstadoPedido();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByTipoEstadoPedido = new JButtonMe();
		
		this.jButtonAbrirOrderByTipoEstadoPedido.setText("Orden");
		this.jButtonAbrirOrderByTipoEstadoPedido.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoEstadoPedido,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoEstadoPedido, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByTipoEstadoPedido.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByTipoEstadoPedido.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoEstadoPedido=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoEstadoPedido,false,this);
			
			//this.cargarOrderByTipoEstadoPedido(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoEstadoPedido=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoEstadoPedido,true,this);
			
			//this.cargarOrderByTipoEstadoPedido(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosTipoEstadoPedido.setMinimumSize(new Dimension(400,50));//430
		this.jTableDatosTipoEstadoPedido.setMaximumSize(new Dimension(400,50));//430
		this.jTableDatosTipoEstadoPedido.setPreferredSize(new Dimension(400,50));//430
		
		this.jScrollPanelDatosTipoEstadoPedido.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoEstadoPedido.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoEstadoPedido.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoTipoEstadoPedido.setText("Nuevo");
		this.jButtonDuplicarTipoEstadoPedido.setText("Duplicar");
		this.jButtonCopiarTipoEstadoPedido.setText("Copiar");
		this.jButtonVerFormTipoEstadoPedido.setText("Ver");
		this.jButtonNuevoRelacionesTipoEstadoPedido.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaTipoEstadoPedido.setText("Guardar");
		this.jButtonCerrarTipoEstadoPedido.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoEstadoPedido,"nuevo_button","Nuevo",this.tipoestadopedidoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarTipoEstadoPedido,"duplicar_button","Duplicar",this.tipoestadopedidoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarTipoEstadoPedido,"copiar_button","Copiar",this.tipoestadopedidoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormTipoEstadoPedido,"ver_form","Ver",this.tipoestadopedidoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesTipoEstadoPedido,"nuevorelaciones_button","Nuevo Rel",this.tipoestadopedidoSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoEstadoPedido,"guardarcambiostabla_button","Guardar",this.tipoestadopedidoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoEstadoPedido,"cerrar_button","Salir",this.tipoestadopedidoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoEstadoPedido, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarTipoEstadoPedido, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarTipoEstadoPedido, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormTipoEstadoPedido, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesTipoEstadoPedido, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoEstadoPedido, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoEstadoPedido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoTipoEstadoPedido.setToolTipText("Nuevo"+" "+TipoEstadoPedidoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarTipoEstadoPedido.setToolTipText("Duplicar"+" "+TipoEstadoPedidoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarTipoEstadoPedido.setToolTipText("Copiar"+" "+TipoEstadoPedidoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormTipoEstadoPedido.setToolTipText("Ver"+" "+TipoEstadoPedidoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesTipoEstadoPedido.setToolTipText("Nuevo Rel"+" "+TipoEstadoPedidoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaTipoEstadoPedido.setToolTipText("Guardar"+" "+TipoEstadoPedidoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoEstadoPedido.setToolTipText("Salir"+" "+TipoEstadoPedidoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoEstadoPedido";
		inputMap = this.jButtonNuevoTipoEstadoPedido.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoEstadoPedido.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoEstadoPedido"));
		
		//DUPLICAR
		sMapKey = "DuplicarTipoEstadoPedido";
		inputMap = this.jButtonDuplicarTipoEstadoPedido.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarTipoEstadoPedido.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarTipoEstadoPedido"));
		
		//COPIAR
		sMapKey = "CopiarTipoEstadoPedido";
		inputMap = this.jButtonCopiarTipoEstadoPedido.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarTipoEstadoPedido.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarTipoEstadoPedido"));
		
		//VEr FORM
		sMapKey = "VerFormTipoEstadoPedido";
		inputMap = this.jButtonVerFormTipoEstadoPedido.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormTipoEstadoPedido.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormTipoEstadoPedido"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesTipoEstadoPedido";
		inputMap = this.jButtonNuevoRelacionesTipoEstadoPedido.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesTipoEstadoPedido.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesTipoEstadoPedido"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarTipoEstadoPedido";
		inputMap = this.jButtonModificarTipoEstadoPedido.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarTipoEstadoPedido.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarTipoEstadoPedido"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarTipoEstadoPedido";
		inputMap = this.jButtonCerrarTipoEstadoPedido.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoEstadoPedido.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoEstadoPedido"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoEstadoPedido";
		inputMap = this.jButtonGuardarCambiosTablaTipoEstadoPedido.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoEstadoPedido.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoEstadoPedido"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesTipoEstadoPedido = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesTipoEstadoPedido = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionTipoEstadoPedido = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1TipoEstadoPedido= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2TipoEstadoPedido= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3TipoEstadoPedido= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4TipoEstadoPedido= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5TipoEstadoPedido= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesTipoEstadoPedido.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesTipoEstadoPedido.setName("jPanelParametrosReportesTipoEstadoPedido"); 
		
		this.jPanelParametrosReportesAccionesTipoEstadoPedido.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesTipoEstadoPedido.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesTipoEstadoPedido.setName("jPanelParametrosReportesAccionesTipoEstadoPedido"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesTipoEstadoPedido, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesTipoEstadoPedido, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionTipoEstadoPedido = new JButtonMe();
		this.jButtonRecargarInformacionTipoEstadoPedido.setText("Recargar");
		this.jButtonRecargarInformacionTipoEstadoPedido.setToolTipText("Recargar"+" "+TipoEstadoPedidoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionTipoEstadoPedido,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionTipoEstadoPedido = new JButtonMe();
		this.jButtonProcesarInformacionTipoEstadoPedido.setText("Procesar");
		this.jButtonProcesarInformacionTipoEstadoPedido.setToolTipText("Procesar"+" "+TipoEstadoPedidoConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionTipoEstadoPedido.setVisible(false);
			
		this.jButtonProcesarInformacionTipoEstadoPedido.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoEstadoPedido.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoEstadoPedido.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesTipoEstadoPedido = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoEstadoPedido.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesTipoEstadoPedido.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesTipoEstadoPedido = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoEstadoPedido.setText("TIPO");       
		this.jComboBoxTiposReportesTipoEstadoPedido.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesTipoEstadoPedido = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoEstadoPedido.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesTipoEstadoPedido.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionTipoEstadoPedido = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionTipoEstadoPedido.setText("Paginacion");
		this.jComboBoxTiposPaginacionTipoEstadoPedido.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesTipoEstadoPedido = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesTipoEstadoPedido.setText("Accion");
		this.jComboBoxTiposRelacionesTipoEstadoPedido.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesTipoEstadoPedido = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoEstadoPedido.setText("Accion");
		this.jComboBoxTiposAccionesTipoEstadoPedido.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarTipoEstadoPedido = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarTipoEstadoPedido.setText("Accion");
		this.jComboBoxTiposSeleccionarTipoEstadoPedido.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralTipoEstadoPedido=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralTipoEstadoPedido.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoEstadoPedido.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoEstadoPedido.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesTipoEstadoPedido = new JLabelMe();
		
		this.jLabelAccionesTipoEstadoPedido.setText("Acciones");		
		this.jLabelAccionesTipoEstadoPedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoEstadoPedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoEstadoPedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosTipoEstadoPedido = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosTipoEstadoPedido.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosTipoEstadoPedido.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosTipoEstadoPedido = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosTipoEstadoPedido.setText("Seleccionados");
		this.jCheckBoxSeleccionadosTipoEstadoPedido.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaTipoEstadoPedido = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaTipoEstadoPedido.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaTipoEstadoPedido.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteTipoEstadoPedido = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteTipoEstadoPedido.setText("Graf.");
		this.jCheckBoxConGraficoReporteTipoEstadoPedido.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresTipoEstadoPedido = new JButtonMe();
		//this.jButtonAnterioresTipoEstadoPedido.setText("<<");
        this.jButtonAnterioresTipoEstadoPedido.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresTipoEstadoPedido,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresTipoEstadoPedido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesTipoEstadoPedido = new JButtonMe();
		//this.jButtonSiguientesTipoEstadoPedido.setText(">>");
        this.jButtonSiguientesTipoEstadoPedido.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesTipoEstadoPedido,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesTipoEstadoPedido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosTipoEstadoPedido = new JButtonMe();
		this.jButtonNuevoGuardarCambiosTipoEstadoPedido.setText("Nue");
        this.jButtonNuevoGuardarCambiosTipoEstadoPedido.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosTipoEstadoPedido,"nuevoguardarcambios_button","Nue",this.tipoestadopedidoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosTipoEstadoPedido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosTipoEstadoPedido";
		inputMap = this.jButtonNuevoGuardarCambiosTipoEstadoPedido.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosTipoEstadoPedido.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosTipoEstadoPedido"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionTipoEstadoPedido";
		inputMap = this.jButtonRecargarInformacionTipoEstadoPedido.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionTipoEstadoPedido.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionTipoEstadoPedido"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesTipoEstadoPedido";
		inputMap = this.jButtonSiguientesTipoEstadoPedido.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesTipoEstadoPedido.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesTipoEstadoPedido"));
		
		//ANTERIORES		
		sMapKey = "AnterioresTipoEstadoPedido";
		inputMap = this.jButtonAnterioresTipoEstadoPedido.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresTipoEstadoPedido.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresTipoEstadoPedido"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasTipoEstadoPedido();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesTipoEstadoPedido.setMinimumSize(new Dimension(this.getWidth(),TipoEstadoPedidoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoEstadoPedidoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoEstadoPedido.setMaximumSize(new Dimension(this.getWidth(),TipoEstadoPedidoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoEstadoPedidoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoEstadoPedido.setPreferredSize(new Dimension(this.getWidth(),TipoEstadoPedidoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoEstadoPedidoBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionTipoEstadoPedido = new GridBagLayout();

			this.jPanelPaginacionTipoEstadoPedido.setLayout(gridaBagLayoutPaginacionTipoEstadoPedido);						
			
			this.gridBagConstraintsTipoEstadoPedido = new GridBagConstraints();
			this.gridBagConstraintsTipoEstadoPedido.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsTipoEstadoPedido.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoEstadoPedido.gridy = 0;
			this.gridBagConstraintsTipoEstadoPedido.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionTipoEstadoPedido.add(this.jButtonAnterioresTipoEstadoPedido, this.gridBagConstraintsTipoEstadoPedido);
					
						
			this.gridBagConstraintsTipoEstadoPedido = new GridBagConstraints();
			this.gridBagConstraintsTipoEstadoPedido.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoEstadoPedido.gridy = 0;
			
			this.jPanelPaginacionTipoEstadoPedido.add(this.jButtonNuevoGuardarCambiosTipoEstadoPedido, this.gridBagConstraintsTipoEstadoPedido);
						
			
			this.gridBagConstraintsTipoEstadoPedido = new GridBagConstraints();
			this.gridBagConstraintsTipoEstadoPedido.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsTipoEstadoPedido.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoEstadoPedido.gridy = 0;
			this.jPanelPaginacionTipoEstadoPedido.add(this.jButtonSiguientesTipoEstadoPedido, this.gridBagConstraintsTipoEstadoPedido);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsTipoEstadoPedido = new GridBagConstraints();
			this.gridBagConstraintsTipoEstadoPedido.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoEstadoPedido.gridy = 1;
			this.gridBagConstraintsTipoEstadoPedido.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoEstadoPedido.add(this.jButtonNuevoTipoEstadoPedido, this.gridBagConstraintsTipoEstadoPedido);
						
			
			
			if(!this.tipoestadopedidoSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsTipoEstadoPedido = new GridBagConstraints();
				this.gridBagConstraintsTipoEstadoPedido.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoEstadoPedido.gridy = 1;
				this.gridBagConstraintsTipoEstadoPedido.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionTipoEstadoPedido.add(this.jButtonGuardarCambiosTablaTipoEstadoPedido, this.gridBagConstraintsTipoEstadoPedido);
			}
			
			
			
			this.gridBagConstraintsTipoEstadoPedido = new GridBagConstraints();
			this.gridBagConstraintsTipoEstadoPedido.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoEstadoPedido.gridy = 1;
			this.gridBagConstraintsTipoEstadoPedido.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoEstadoPedido.add(this.jButtonDuplicarTipoEstadoPedido, this.gridBagConstraintsTipoEstadoPedido);
			
			this.gridBagConstraintsTipoEstadoPedido = new GridBagConstraints();
			this.gridBagConstraintsTipoEstadoPedido.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoEstadoPedido.gridy = 1;
			this.gridBagConstraintsTipoEstadoPedido.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoEstadoPedido.add(this.jButtonCopiarTipoEstadoPedido, this.gridBagConstraintsTipoEstadoPedido);
		
			this.gridBagConstraintsTipoEstadoPedido = new GridBagConstraints();
			this.gridBagConstraintsTipoEstadoPedido.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoEstadoPedido.gridy = 1;
			this.gridBagConstraintsTipoEstadoPedido.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoEstadoPedido.add(this.jButtonVerFormTipoEstadoPedido, this.gridBagConstraintsTipoEstadoPedido);
		
			this.gridBagConstraintsTipoEstadoPedido = new GridBagConstraints();
			this.gridBagConstraintsTipoEstadoPedido.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoEstadoPedido.gridy = 1;
			this.gridBagConstraintsTipoEstadoPedido.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionTipoEstadoPedido.add(this.jButtonCerrarTipoEstadoPedido, this.gridBagConstraintsTipoEstadoPedido);
		
		
		
		this.jButtonRecargarInformacionTipoEstadoPedido.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoEstadoPedido.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoEstadoPedido.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionTipoEstadoPedido, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesTipoEstadoPedido.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoEstadoPedido.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoEstadoPedido.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesTipoEstadoPedido, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesTipoEstadoPedido.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoEstadoPedido.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoEstadoPedido.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesTipoEstadoPedido, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesTipoEstadoPedido.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoEstadoPedido.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoEstadoPedido.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesTipoEstadoPedido, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionTipoEstadoPedido.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoEstadoPedido.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoEstadoPedido.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionTipoEstadoPedido, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesTipoEstadoPedido.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoEstadoPedido.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoEstadoPedido.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesTipoEstadoPedido, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesTipoEstadoPedido.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoEstadoPedido.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoEstadoPedido.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoEstadoPedido, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarTipoEstadoPedido.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoEstadoPedido.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoEstadoPedido.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarTipoEstadoPedido, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaTipoEstadoPedido.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoEstadoPedido.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoEstadoPedido.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaTipoEstadoPedido, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteTipoEstadoPedido.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoEstadoPedido.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoEstadoPedido.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteTipoEstadoPedido, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosTipoEstadoPedido.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoEstadoPedido.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoEstadoPedido.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosTipoEstadoPedido, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosTipoEstadoPedido.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoEstadoPedido.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoEstadoPedido.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosTipoEstadoPedido, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesTipoEstadoPedido = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesTipoEstadoPedido = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1TipoEstadoPedido = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2TipoEstadoPedido = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3TipoEstadoPedido = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4TipoEstadoPedido = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesTipoEstadoPedido.setLayout(gridaBagParametrosReportesTipoEstadoPedido);
			this.jPanelParametrosReportesAccionesTipoEstadoPedido.setLayout(gridaBagParametrosReportesAccionesTipoEstadoPedido);
			
			
			this.jPanelParametrosAuxiliar1TipoEstadoPedido.setLayout(gridaBagParametrosAuxiliar1TipoEstadoPedido);
			this.jPanelParametrosAuxiliar2TipoEstadoPedido.setLayout(gridaBagParametrosAuxiliar2TipoEstadoPedido);
			this.jPanelParametrosAuxiliar3TipoEstadoPedido.setLayout(gridaBagParametrosAuxiliar3TipoEstadoPedido);
			this.jPanelParametrosAuxiliar4TipoEstadoPedido.setLayout(gridaBagParametrosAuxiliar4TipoEstadoPedido);
			//this.jPanelParametrosAuxiliar5TipoEstadoPedido.setLayout(gridaBagParametrosAuxiliar2TipoEstadoPedido);			
			
			
			
			
			this.gridBagConstraintsTipoEstadoPedido = new GridBagConstraints();
			this.gridBagConstraintsTipoEstadoPedido.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoEstadoPedido.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoEstadoPedido.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoEstadoPedido.add(this.jButtonRecargarInformacionTipoEstadoPedido, this.gridBagConstraintsTipoEstadoPedido);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsTipoEstadoPedido = new GridBagConstraints();
			this.gridBagConstraintsTipoEstadoPedido.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoEstadoPedido.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoEstadoPedido.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoEstadoPedido.add(this.jComboBoxTiposPaginacionTipoEstadoPedido, this.gridBagConstraintsTipoEstadoPedido);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsTipoEstadoPedido = new GridBagConstraints();
			this.gridBagConstraintsTipoEstadoPedido.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoEstadoPedido.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoEstadoPedido.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoEstadoPedido.add(this.jCheckBoxConAltoMaximoTablaTipoEstadoPedido, this.gridBagConstraintsTipoEstadoPedido);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsTipoEstadoPedido = new GridBagConstraints();
			this.gridBagConstraintsTipoEstadoPedido.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoEstadoPedido.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoEstadoPedido.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoEstadoPedido.add(this.jComboBoxTiposArchivosReportesTipoEstadoPedido, this.gridBagConstraintsTipoEstadoPedido);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsTipoEstadoPedido = new GridBagConstraints();
			this.gridBagConstraintsTipoEstadoPedido.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoEstadoPedido.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoEstadoPedido.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoEstadoPedido.add(this.jPanelParametrosAuxiliar1TipoEstadoPedido, this.gridBagConstraintsTipoEstadoPedido);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsTipoEstadoPedido = new GridBagConstraints();
			this.gridBagConstraintsTipoEstadoPedido.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoEstadoPedido.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoEstadoPedido.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoEstadoPedido.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4TipoEstadoPedido.add(this.jComboBoxTiposReportesTipoEstadoPedido, this.gridBagConstraintsTipoEstadoPedido);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsTipoEstadoPedido = new GridBagConstraints();
			this.gridBagConstraintsTipoEstadoPedido.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoEstadoPedido.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoEstadoPedido.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoEstadoPedido.add(this.jPanelParametrosAuxiliar4TipoEstadoPedido, this.gridBagConstraintsTipoEstadoPedido);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsTipoEstadoPedido = new GridBagConstraints();
			this.gridBagConstraintsTipoEstadoPedido.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoEstadoPedido.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoEstadoPedido.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoEstadoPedido.add(this.jComboBoxTiposReportesTipoEstadoPedido, this.gridBagConstraintsTipoEstadoPedido);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsTipoEstadoPedido = new GridBagConstraints();
			this.gridBagConstraintsTipoEstadoPedido.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoEstadoPedido.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoEstadoPedido.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoEstadoPedido.add(this.jCheckBoxGenerarReporteTipoEstadoPedido, this.gridBagConstraintsTipoEstadoPedido);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsTipoEstadoPedido = new GridBagConstraints();
			this.gridBagConstraintsTipoEstadoPedido.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoEstadoPedido.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoEstadoPedido.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoEstadoPedido.add(this.jPanelParametrosAuxiliar2TipoEstadoPedido, this.gridBagConstraintsTipoEstadoPedido);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsTipoEstadoPedido = new GridBagConstraints();
			this.gridBagConstraintsTipoEstadoPedido.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoEstadoPedido.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoEstadoPedido.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoEstadoPedido.add(this.jLabelAccionesTipoEstadoPedido, this.gridBagConstraintsTipoEstadoPedido);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsTipoEstadoPedido = new GridBagConstraints();
				this.gridBagConstraintsTipoEstadoPedido.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsTipoEstadoPedido.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsTipoEstadoPedido.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesTipoEstadoPedido.add(this.jButtonAbrirOrderByTipoEstadoPedido, this.gridBagConstraintsTipoEstadoPedido);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsTipoEstadoPedido = new GridBagConstraints();
			this.gridBagConstraintsTipoEstadoPedido.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsTipoEstadoPedido.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoEstadoPedido.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoEstadoPedido.add(this.jComboBoxTiposSeleccionarTipoEstadoPedido, this.gridBagConstraintsTipoEstadoPedido);			
			
			
			/*
			this.gridBagConstraintsTipoEstadoPedido = new GridBagConstraints();
			this.gridBagConstraintsTipoEstadoPedido.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoEstadoPedido.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoEstadoPedido.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoEstadoPedido.add(this.jCheckBoxSeleccionarTodosTipoEstadoPedido, this.gridBagConstraintsTipoEstadoPedido);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsTipoEstadoPedido = new GridBagConstraints();
			this.gridBagConstraintsTipoEstadoPedido.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoEstadoPedido.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoEstadoPedido.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoEstadoPedido.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoEstadoPedido.add(this.jCheckBoxSeleccionarTodosTipoEstadoPedido, this.gridBagConstraintsTipoEstadoPedido);															
				
			this.gridBagConstraintsTipoEstadoPedido = new GridBagConstraints();
			this.gridBagConstraintsTipoEstadoPedido.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoEstadoPedido.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoEstadoPedido.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoEstadoPedido.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoEstadoPedido.add(this.jCheckBoxSeleccionadosTipoEstadoPedido, this.gridBagConstraintsTipoEstadoPedido);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsTipoEstadoPedido = new GridBagConstraints();
			this.gridBagConstraintsTipoEstadoPedido.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoEstadoPedido.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoEstadoPedido.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoEstadoPedido.add(this.jPanelParametrosAuxiliar3TipoEstadoPedido, this.gridBagConstraintsTipoEstadoPedido);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsTipoEstadoPedido = new GridBagConstraints();
			this.gridBagConstraintsTipoEstadoPedido.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoEstadoPedido.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoEstadoPedido.add(this.jComboBoxTiposAccionesTipoEstadoPedido, this.gridBagConstraintsTipoEstadoPedido);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosTipoEstadoPedido = new GridBagLayout();

			this.jScrollPanelDatosTipoEstadoPedido.setLayout(gridaBagLayoutDatosTipoEstadoPedido);
			
			this.gridBagConstraintsTipoEstadoPedido = new GridBagConstraints();
			this.gridBagConstraintsTipoEstadoPedido.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoEstadoPedido.gridy = 0;
			this.gridBagConstraintsTipoEstadoPedido.gridx = 0;
			
			this.jScrollPanelDatosTipoEstadoPedido.add(this.jTableDatosTipoEstadoPedido, this.gridBagConstraintsTipoEstadoPedido);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosTipoEstadoPedido.setViewportView(this.jTableDatosTipoEstadoPedido);
		this.jTableDatosTipoEstadoPedido.setFillsViewportHeight(true);
		this.jTableDatosTipoEstadoPedido.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesTipoEstadoPedido= new GridBagLayout();
		this.jPanelAccionesTipoEstadoPedido.setLayout(gridaBagLayoutAccionesTipoEstadoPedido);
		
		
		/*	
		this.gridBagConstraintsTipoEstadoPedido = new GridBagConstraints();
		this.gridBagConstraintsTipoEstadoPedido.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoEstadoPedido.gridy = 0;
		this.gridBagConstraintsTipoEstadoPedido.gridx = 0;
			
		this.jPanelAccionesTipoEstadoPedido.add(this.jButtonNuevoTipoEstadoPedido, this.gridBagConstraintsTipoEstadoPedido);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdPaisTipoEstadoPedido= new GridBagLayout();
		gridaBagLayoutFK_IdPaisTipoEstadoPedido.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdPaisTipoEstadoPedido.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdPaisTipoEstadoPedido.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdPaisTipoEstadoPedido.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdPaisTipoEstadoPedido.setLayout(gridaBagLayoutFK_IdPaisTipoEstadoPedido);

		gridBagConstraintsTipoEstadoPedido = new GridBagConstraints();
		gridBagConstraintsTipoEstadoPedido.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoEstadoPedido.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoEstadoPedido.gridy = 0;
		gridBagConstraintsTipoEstadoPedido.gridx = 0;
		jPanelFK_IdPaisTipoEstadoPedido.add(jLabelid_paisFK_IdPaisTipoEstadoPedido, gridBagConstraintsTipoEstadoPedido);

		gridBagConstraintsTipoEstadoPedido = new GridBagConstraints();
		gridBagConstraintsTipoEstadoPedido.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoEstadoPedido.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoEstadoPedido.gridy = 0;
		gridBagConstraintsTipoEstadoPedido.gridx = 1;
		jPanelFK_IdPaisTipoEstadoPedido.add(jComboBoxid_paisFK_IdPaisTipoEstadoPedido, gridBagConstraintsTipoEstadoPedido);

		gridBagConstraintsTipoEstadoPedido = new GridBagConstraints();
		gridBagConstraintsTipoEstadoPedido.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoEstadoPedido.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoEstadoPedido.gridy = 1;
		gridBagConstraintsTipoEstadoPedido.gridx =1;
		jPanelFK_IdPaisTipoEstadoPedido.add(jButtonFK_IdPaisTipoEstadoPedido, gridBagConstraintsTipoEstadoPedido);

		jTabbedPaneBusquedasTipoEstadoPedido.addTab("1.-Por Pais ", jPanelFK_IdPaisTipoEstadoPedido);
		jTabbedPaneBusquedasTipoEstadoPedido.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoEstadoPedido = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoEstadoPedido);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipoestadopedidoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoEstadoPedido = new GridBagConstraints();						
			this.gridBagConstraintsTipoEstadoPedido.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoEstadoPedido.gridx = 0;		
			//this.gridBagConstraintsTipoEstadoPedido.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoEstadoPedido.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoEstadoPedido.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarTipoEstadoPedido, this.gridBagConstraintsTipoEstadoPedido);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsTipoEstadoPedido = new GridBagConstraints();
		this.gridBagConstraintsTipoEstadoPedido.gridy = iGridyPrincipal++;
		this.gridBagConstraintsTipoEstadoPedido.gridx = 0;		
		//this.gridBagConstraintsTipoEstadoPedido.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoEstadoPedido.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsTipoEstadoPedido.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsTipoEstadoPedido);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsTipoEstadoPedido = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsTipoEstadoPedido.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoEstadoPedido.gridx = 0;		
			this.gridBagConstraintsTipoEstadoPedido.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoEstadoPedido.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsTipoEstadoPedido.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasTipoEstadoPedido, this.gridBagConstraintsTipoEstadoPedido);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsTipoEstadoPedido = new GridBagConstraints();
		this.gridBagConstraintsTipoEstadoPedido.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoEstadoPedido.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesTipoEstadoPedido, this.gridBagConstraintsTipoEstadoPedido);								
		
		
		/*
		this.gridBagConstraintsTipoEstadoPedido = new GridBagConstraints();
		this.gridBagConstraintsTipoEstadoPedido.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoEstadoPedido.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesTipoEstadoPedido, this.gridBagConstraintsTipoEstadoPedido);
		*/		
		
		this.gridBagConstraintsTipoEstadoPedido = new GridBagConstraints();
		this.gridBagConstraintsTipoEstadoPedido.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoEstadoPedido.gridx =0;
		this.gridBagConstraintsTipoEstadoPedido.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoEstadoPedido.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoEstadoPedido, this.gridBagConstraintsTipoEstadoPedido);
				
		
		this.gridBagConstraintsTipoEstadoPedido = new GridBagConstraints();
		this.gridBagConstraintsTipoEstadoPedido.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoEstadoPedido.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionTipoEstadoPedido, this.gridBagConstraintsTipoEstadoPedido);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(TipoEstadoPedidoJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosTipoEstadoPedido= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoEstadoPedido = new GridBagLayout();
			this.jPanelBusquedasParametrosTipoEstadoPedido.setLayout(gridaBagLayoutBusquedasParametrosTipoEstadoPedido);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralTipoEstadoPedido=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoEstadoPedido.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoEstadoPedido.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoEstadoPedido.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoEstadoPedido = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsTipoEstadoPedido = new GridBagConstraints();
		this.gridBagConstraintsTipoEstadoPedido.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoEstadoPedido.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoEstadoPedido, this.gridBagConstraintsTipoEstadoPedido);
			
			
		this.gridBagConstraintsTipoEstadoPedido = new GridBagConstraints();
		this.gridBagConstraintsTipoEstadoPedido.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoEstadoPedido.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoEstadoPedido, this.gridBagConstraintsTipoEstadoPedido);
		
			
		this.gridBagConstraintsTipoEstadoPedido = new GridBagConstraints();
		this.gridBagConstraintsTipoEstadoPedido.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoEstadoPedido.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoEstadoPedido, this.gridBagConstraintsTipoEstadoPedido);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralTipoEstadoPedido;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoTipoEstadoPedido() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoTipoEstadoPedido = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoTipoEstadoPedido = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoTipoEstadoPedido.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoTipoEstadoPedido.setName("jPanelReporteDinamicoTipoEstadoPedido"); 
		
		this.jPanelReporteDinamicoTipoEstadoPedido.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoEstadoPedido.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoEstadoPedido.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoTipoEstadoPedido.setLayout(gridaBagLayoutReporteDinamicoTipoEstadoPedido);
		
		
		this.jInternalFrameReporteDinamicoTipoEstadoPedido= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoTipoEstadoPedido = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoEstadoPedido= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoTipoEstadoPedido.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoTipoEstadoPedido.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoTipoEstadoPedido.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoTipoEstadoPedido.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoTipoEstadoPedido.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoTipoEstadoPedido.setResizable(true);
	    this.jInternalFrameReporteDinamicoTipoEstadoPedido.setClosable(true);
	    this.jInternalFrameReporteDinamicoTipoEstadoPedido.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoTipoEstadoPedido.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoEstadoPedido.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoEstadoPedido.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoTipoEstadoPedido.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Estado Pedidos"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteTipoEstadoPedido = new JLabelMe();

		this.jLabelColumnasSelectReporteTipoEstadoPedido.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteTipoEstadoPedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoEstadoPedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoEstadoPedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoEstadoPedido = new GridBagConstraints();
		this.gridBagConstraintsTipoEstadoPedido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoEstadoPedido.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoEstadoPedido.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoEstadoPedido.add(this.jLabelColumnasSelectReporteTipoEstadoPedido, this.gridBagConstraintsTipoEstadoPedido);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteTipoEstadoPedido = new JList<Reporte>();
		this.jListColumnasSelectReporteTipoEstadoPedido.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteTipoEstadoPedido.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteTipoEstadoPedido.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoEstadoPedido.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoEstadoPedido.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteTipoEstadoPedido=new JScrollPane(this.jListColumnasSelectReporteTipoEstadoPedido);
			
			this.jScrollColumnasSelectReporteTipoEstadoPedido.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoEstadoPedido.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoEstadoPedido.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteTipoEstadoPedido.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTipoEstadoPedido = new GridBagConstraints();
		this.gridBagConstraintsTipoEstadoPedido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoEstadoPedido.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoEstadoPedido.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoEstadoPedido.add(this.jListColumnasSelectReporteTipoEstadoPedido, this.gridBagConstraintsTipoEstadoPedido);
		this.jPanelReporteDinamicoTipoEstadoPedido.add(this.jScrollColumnasSelectReporteTipoEstadoPedido, this.gridBagConstraintsTipoEstadoPedido);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteTipoEstadoPedido = new JLabelMe();

		this.jLabelRelacionesSelectReporteTipoEstadoPedido.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteTipoEstadoPedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoEstadoPedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoEstadoPedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteTipoEstadoPedido = new JList<Reporte>();
		this.jListRelacionesSelectReporteTipoEstadoPedido.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteTipoEstadoPedido.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteTipoEstadoPedido.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoEstadoPedido.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoEstadoPedido.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteTipoEstadoPedido=new JScrollPane(this.jListRelacionesSelectReporteTipoEstadoPedido);
			
			this.jScrollRelacionesSelectReporteTipoEstadoPedido.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoEstadoPedido.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoEstadoPedido.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteTipoEstadoPedido.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoTipoEstadoPedido = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoTipoEstadoPedido = new JComboBoxMe();
		this.jListColumnasValoresGraficoTipoEstadoPedido = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoTipoEstadoPedido = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoTipoEstadoPedido.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoTipoEstadoPedido.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoEstadoPedido.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoEstadoPedido.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoTipoEstadoPedido, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoTipoEstadoPedido = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoTipoEstadoPedido.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoTipoEstadoPedido.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoEstadoPedido.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoEstadoPedido.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoTipoEstadoPedido, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoTipoEstadoPedido = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoTipoEstadoPedido.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoTipoEstadoPedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoEstadoPedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoEstadoPedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoEstadoPedido = new GridBagConstraints();
		this.gridBagConstraintsTipoEstadoPedido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoEstadoPedido.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoEstadoPedido.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoEstadoPedido.add(this.jLabelGenerarExcelReporteDinamicoTipoEstadoPedido, this.gridBagConstraintsTipoEstadoPedido);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoTipoEstadoPedido = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoTipoEstadoPedido.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoTipoEstadoPedido,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoTipoEstadoPedido.setToolTipText("Generar EXCEL"+" "+TipoEstadoPedidoConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsTipoEstadoPedido = new GridBagConstraints();
		//this.gridBagConstraintsTipoEstadoPedido.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsTipoEstadoPedido.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsTipoEstadoPedido.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoTipoEstadoPedido.add(this.jButtonGenerarExcelReporteDinamicoTipoEstadoPedido, this.gridBagConstraintsTipoEstadoPedido);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsTipoEstadoPedido = new GridBagConstraints();
		this.gridBagConstraintsTipoEstadoPedido.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoEstadoPedido.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoEstadoPedido.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoEstadoPedido.add(this.jComboBoxTiposReportesDinamicoTipoEstadoPedido, this.gridBagConstraintsTipoEstadoPedido);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoTipoEstadoPedido = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoTipoEstadoPedido.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoTipoEstadoPedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoEstadoPedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoEstadoPedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoEstadoPedido = new GridBagConstraints();
		this.gridBagConstraintsTipoEstadoPedido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoEstadoPedido.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoEstadoPedido.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoEstadoPedido.add(this.jLabelTiposArchivoReporteDinamicoTipoEstadoPedido, this.gridBagConstraintsTipoEstadoPedido);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsTipoEstadoPedido = new GridBagConstraints();
		this.gridBagConstraintsTipoEstadoPedido.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoEstadoPedido.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoEstadoPedido.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoEstadoPedido.add(this.jComboBoxTiposArchivosReportesDinamicoTipoEstadoPedido, this.gridBagConstraintsTipoEstadoPedido);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoTipoEstadoPedido = new JButtonMe();
		this.jButtonGenerarReporteDinamicoTipoEstadoPedido.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoTipoEstadoPedido,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoTipoEstadoPedido.setToolTipText("Generar"+" "+TipoEstadoPedidoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsTipoEstadoPedido = new GridBagConstraints();
		this.gridBagConstraintsTipoEstadoPedido.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoEstadoPedido.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoEstadoPedido.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoEstadoPedido.add(this.jButtonGenerarReporteDinamicoTipoEstadoPedido, this.gridBagConstraintsTipoEstadoPedido);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoTipoEstadoPedido = new JButtonMe();
		this.jButtonCerrarReporteDinamicoTipoEstadoPedido.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoTipoEstadoPedido,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoTipoEstadoPedido.setToolTipText("Cancelar"+" "+TipoEstadoPedidoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoEstadoPedido = new GridBagConstraints();
		this.gridBagConstraintsTipoEstadoPedido.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoEstadoPedido.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoEstadoPedido.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoEstadoPedido.add(this.jButtonCerrarReporteDinamicoTipoEstadoPedido, this.gridBagConstraintsTipoEstadoPedido);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalTipoEstadoPedido = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoTipoEstadoPedido= new JScrollPane(jPanelReporteDinamicoTipoEstadoPedido,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoTipoEstadoPedido.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoEstadoPedido.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoEstadoPedido.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoTipoEstadoPedido.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Estado Pedidos"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoEstadoPedido = new GridBagConstraints();
		this.gridBagConstraintsTipoEstadoPedido.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsTipoEstadoPedido.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsTipoEstadoPedido.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoTipoEstadoPedido.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoTipoEstadoPedido.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalTipoEstadoPedido);
		this.jInternalFrameReporteDinamicoTipoEstadoPedido.getContentPane().add(this.jScrollPanelReporteDinamicoTipoEstadoPedido, this.gridBagConstraintsTipoEstadoPedido);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionTipoEstadoPedido() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionTipoEstadoPedido = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionTipoEstadoPedido = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionTipoEstadoPedido.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionTipoEstadoPedido.setName("jPanelImportacionTipoEstadoPedido"); 
		
		this.jPanelImportacionTipoEstadoPedido.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoEstadoPedido.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoEstadoPedido.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionTipoEstadoPedido.setLayout(gridaBagLayoutImportacionTipoEstadoPedido);
		
		
		this.jInternalFrameImportacionTipoEstadoPedido= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionTipoEstadoPedido= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionTipoEstadoPedido = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoEstadoPedido= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionTipoEstadoPedido.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoEstadoPedido.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoEstadoPedido.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionTipoEstadoPedido.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoEstadoPedido.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoEstadoPedido.setResizable(true);
	    this.jInternalFrameImportacionTipoEstadoPedido.setClosable(true);
	    this.jInternalFrameImportacionTipoEstadoPedido.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionTipoEstadoPedido.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoEstadoPedido.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoEstadoPedido.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionTipoEstadoPedido.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoEstadoPedido.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoEstadoPedido.setResizable(true);
	    this.jInternalFrameImportacionTipoEstadoPedido.setClosable(true);
	    this.jInternalFrameImportacionTipoEstadoPedido.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionTipoEstadoPedido.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoEstadoPedido.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoEstadoPedido.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionTipoEstadoPedido.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Estado Pedidos"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionTipoEstadoPedido = new JLabelMe();

		this.jLabelArchivoImportacionTipoEstadoPedido.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionTipoEstadoPedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoEstadoPedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoEstadoPedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoEstadoPedido = new GridBagConstraints();
		this.gridBagConstraintsTipoEstadoPedido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoEstadoPedido.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoEstadoPedido.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoEstadoPedido.add(this.jLabelArchivoImportacionTipoEstadoPedido, this.gridBagConstraintsTipoEstadoPedido);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionTipoEstadoPedido = new JFileChooser();		
		this.jFileChooserImportacionTipoEstadoPedido.setToolTipText("ESCOGER ARCHIVO"+" "+TipoEstadoPedidoConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionTipoEstadoPedido = new JButtonMe();
		this.jButtonAbrirImportacionTipoEstadoPedido.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionTipoEstadoPedido,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionTipoEstadoPedido.setToolTipText("Generar"+" "+TipoEstadoPedidoConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsTipoEstadoPedido = new GridBagConstraints();
		this.gridBagConstraintsTipoEstadoPedido.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoEstadoPedido.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoEstadoPedido.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoEstadoPedido.add(this.jButtonAbrirImportacionTipoEstadoPedido, this.gridBagConstraintsTipoEstadoPedido);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionTipoEstadoPedido = new JLabelMe();

		this.jLabelPathArchivoImportacionTipoEstadoPedido.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionTipoEstadoPedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoEstadoPedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoEstadoPedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoEstadoPedido = new GridBagConstraints();
		this.gridBagConstraintsTipoEstadoPedido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoEstadoPedido.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoEstadoPedido.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoEstadoPedido.add(this.jLabelPathArchivoImportacionTipoEstadoPedido, this.gridBagConstraintsTipoEstadoPedido);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionTipoEstadoPedido=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionTipoEstadoPedido.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoEstadoPedido.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoEstadoPedido.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsTipoEstadoPedido = new GridBagConstraints();
		this.gridBagConstraintsTipoEstadoPedido.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoEstadoPedido.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoEstadoPedido.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoEstadoPedido.add(this.jTextFieldPathArchivoImportacionTipoEstadoPedido, this.gridBagConstraintsTipoEstadoPedido);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionTipoEstadoPedido = new JButtonMe();
		this.jButtonGenerarImportacionTipoEstadoPedido.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionTipoEstadoPedido,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionTipoEstadoPedido.setToolTipText("Generar"+" "+TipoEstadoPedidoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsTipoEstadoPedido = new GridBagConstraints();
		this.gridBagConstraintsTipoEstadoPedido.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoEstadoPedido.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoEstadoPedido.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoEstadoPedido.add(this.jButtonGenerarImportacionTipoEstadoPedido, this.gridBagConstraintsTipoEstadoPedido);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionTipoEstadoPedido = new JButtonMe();
		this.jButtonCerrarImportacionTipoEstadoPedido.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionTipoEstadoPedido,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionTipoEstadoPedido.setToolTipText("Cancelar"+" "+TipoEstadoPedidoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoEstadoPedido = new GridBagConstraints();
		this.gridBagConstraintsTipoEstadoPedido.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoEstadoPedido.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoEstadoPedido.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoEstadoPedido.add(this.jButtonCerrarImportacionTipoEstadoPedido, this.gridBagConstraintsTipoEstadoPedido);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalTipoEstadoPedido = new GridBagLayout();
		
		this.jScrollPanelImportacionTipoEstadoPedido= new JScrollPane(jPanelImportacionTipoEstadoPedido,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsTipoEstadoPedido = new GridBagConstraints();
		this.gridBagConstraintsTipoEstadoPedido.gridy =iPosYImportacion;
		this.gridBagConstraintsTipoEstadoPedido.gridx =iPosXImportacion;
		this.gridBagConstraintsTipoEstadoPedido.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionTipoEstadoPedido.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionTipoEstadoPedido.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalTipoEstadoPedido);
		this.jInternalFrameImportacionTipoEstadoPedido.getContentPane().add(this.jScrollPanelImportacionTipoEstadoPedido, this.gridBagConstraintsTipoEstadoPedido);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByTipoEstadoPedido(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByTipoEstadoPedido = new JButtonMe();
			this.jButtonAbrirOrderByTipoEstadoPedido.setText("Orden");
			this.jButtonAbrirOrderByTipoEstadoPedido.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoEstadoPedido,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoEstadoPedido, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByTipoEstadoPedido";
			inputMap = this.jButtonAbrirOrderByTipoEstadoPedido.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByTipoEstadoPedido.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByTipoEstadoPedido"));
		
		
			GridBagLayout gridaBagLayoutOrderByTipoEstadoPedido = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByTipoEstadoPedido = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByTipoEstadoPedido.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByTipoEstadoPedido.setName("jPanelOrderByTipoEstadoPedido"); 
			
			this.jPanelOrderByTipoEstadoPedido.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoEstadoPedido.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoEstadoPedido.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByTipoEstadoPedido, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByTipoEstadoPedido.setLayout(gridaBagLayoutOrderByTipoEstadoPedido);
			
			
			this.jTableDatosTipoEstadoPedidoOrderBy = new JTableMe();        
			this.jTableDatosTipoEstadoPedidoOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosTipoEstadoPedidoOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosTipoEstadoPedidoOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosTipoEstadoPedidoOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosTipoEstadoPedidoOrderBy.setViewportView(this.jTableDatosTipoEstadoPedidoOrderBy);
			this.jTableDatosTipoEstadoPedidoOrderBy.setFillsViewportHeight(true);
			this.jTableDatosTipoEstadoPedidoOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByTipoEstadoPedido= new OrderByJInternalFrame();
			this.jInternalFrameOrderByTipoEstadoPedido= new OrderByJInternalFrame();
			this.jScrollPanelOrderByTipoEstadoPedido = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteTipoEstadoPedido= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByTipoEstadoPedido.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByTipoEstadoPedido.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByTipoEstadoPedido.setTitle("Orden");
			this.jInternalFrameOrderByTipoEstadoPedido.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByTipoEstadoPedido.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByTipoEstadoPedido.setResizable(true);
			this.jInternalFrameOrderByTipoEstadoPedido.setClosable(true);
			this.jInternalFrameOrderByTipoEstadoPedido.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByTipoEstadoPedido, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByTipoEstadoPedido.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoEstadoPedido.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoEstadoPedido.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByTipoEstadoPedido, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByTipoEstadoPedido.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Estado Pedidos"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsTipoEstadoPedido = new GridBagConstraints();
			this.gridBagConstraintsTipoEstadoPedido.gridy =iPosYOrderBy++;
			this.gridBagConstraintsTipoEstadoPedido.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoEstadoPedido.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsTipoEstadoPedido.ipady =150;
				
			this.jPanelOrderByTipoEstadoPedido.add(jScrollPanelDatosTipoEstadoPedidoOrderBy, this.gridBagConstraintsTipoEstadoPedido);//this.jTableDatosTipoEstadoPedidoTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByTipoEstadoPedido = new JButtonMe();
			this.jButtonCerrarOrderByTipoEstadoPedido.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByTipoEstadoPedido,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByTipoEstadoPedido.setToolTipText("Cancelar"+" "+TipoEstadoPedidoConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByTipoEstadoPedido, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsTipoEstadoPedido = new GridBagConstraints();
			this.gridBagConstraintsTipoEstadoPedido.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoEstadoPedido.gridy = iPosYOrderBy++;
			this.gridBagConstraintsTipoEstadoPedido.gridx = iPosXOrderBy;
									
			this.jPanelOrderByTipoEstadoPedido.add(this.jButtonCerrarOrderByTipoEstadoPedido, this.gridBagConstraintsTipoEstadoPedido);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalTipoEstadoPedido = new GridBagLayout();
			
			this.jScrollPanelOrderByTipoEstadoPedido= new JScrollPane(jPanelOrderByTipoEstadoPedido,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsTipoEstadoPedido = new GridBagConstraints();
			this.gridBagConstraintsTipoEstadoPedido.gridy =iPosYOrderBy;
			this.gridBagConstraintsTipoEstadoPedido.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoEstadoPedido.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByTipoEstadoPedido.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByTipoEstadoPedido.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalTipoEstadoPedido);
			
			this.jInternalFrameOrderByTipoEstadoPedido.getContentPane().add(this.jScrollPanelOrderByTipoEstadoPedido, this.gridBagConstraintsTipoEstadoPedido);			
		
		} else {
			this.jButtonAbrirOrderByTipoEstadoPedido = new JButtonMe();
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
		int iWidthTableCalculado=0;//730
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=430;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=300;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.tipoestadopedidoSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosTipoEstadoPedido.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosTipoEstadoPedido.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosTipoEstadoPedido.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosTipoEstadoPedido.getRowHeight();//TipoEstadoPedidoConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.tipoestadopedidoSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > TipoEstadoPedidoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoEstadoPedido.isSelected()) {
					iHeightTable=TipoEstadoPedidoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoEstadoPedidoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoEstadoPedidoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > TipoEstadoPedidoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoEstadoPedido.isSelected()) {
					iHeightTable=TipoEstadoPedidoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoEstadoPedidoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoEstadoPedidoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosTipoEstadoPedido.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoEstadoPedido.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoEstadoPedido.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosTipoEstadoPedido.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoEstadoPedido.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoEstadoPedido.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByTipoEstadoPedido!=null && this.jInternalFrameOrderByTipoEstadoPedido.getjTableDatosOrderBy()!=null) {
			//if(!this.tipoestadopedidoSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByTipoEstadoPedido.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByTipoEstadoPedido.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByTipoEstadoPedido.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByTipoEstadoPedido.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByTipoEstadoPedido.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByTipoEstadoPedido.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByTipoEstadoPedido.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosTipoEstadoPedido.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoEstadoPedido.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoEstadoPedido.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=tipoestadopedidoLogic.getTipoEstadoPedidos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipoestadopedidos.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<TipoEstadoPedido> TraerTipoEstadoPedidoBeans(List<TipoEstadoPedido> tipoestadopedidos,ArrayList<Classe> classes)throws Exception {
		try {
			for(TipoEstadoPedido tipoestadopedido:tipoestadopedidos) {
					
				if(!(TipoEstadoPedidoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || TipoEstadoPedidoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					tipoestadopedido.setsDetalleGeneralEntityReporte(TipoEstadoPedidoConstantesFunciones.getTipoEstadoPedidoDescripcion(tipoestadopedido));
										
						
					
						
					
				} else  {
							
					//tipoestadopedido.setsDetalleGeneralEntityReporte(tipoestadopedido.getsDetalleGeneralEntityReporte());
										
				}
				
				//tipoestadopedidobeans.add(tipoestadopedidobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return tipoestadopedidos;
    }
	//PARA REPORTES FIN
}
