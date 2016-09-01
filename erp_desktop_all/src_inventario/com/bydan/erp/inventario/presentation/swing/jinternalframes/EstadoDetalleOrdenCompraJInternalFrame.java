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



import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;





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
import com.bydan.erp.inventario.util.EstadoDetalleOrdenCompraConstantesFunciones;

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
public class EstadoDetalleOrdenCompraJInternalFrame extends EstadoDetalleOrdenCompraBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarEstadoDetalleOrdenCompra;
	
	protected JMenuBar jmenuBarEstadoDetalleOrdenCompra;
	
	protected JMenu jmenuEstadoDetalleOrdenCompra;
	protected JMenu jmenuDatosEstadoDetalleOrdenCompra;
	protected JMenu jmenuArchivoEstadoDetalleOrdenCompra;
	protected JMenu jmenuAccionesEstadoDetalleOrdenCompra;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosEstadoDetalleOrdenCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutEstadoDetalleOrdenCompra;	
	protected GridBagConstraints gridBagConstraintsEstadoDetalleOrdenCompra;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public EstadoDetalleOrdenCompraDetalleFormJInternalFrame jInternalFrameDetalleFormEstadoDetalleOrdenCompra;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoEstadoDetalleOrdenCompra;	
	protected ImportacionJInternalFrame jInternalFrameImportacionEstadoDetalleOrdenCompra;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public EstadoDetalleOrdenCompraSessionBean estadodetalleordencompraSessionBean;
		
	
	
	
	//protected JDesktopPane jDesktopPane;
	public List<EstadoDetalleOrdenCompra> estadodetalleordencompras;		
	public List<EstadoDetalleOrdenCompra> estadodetalleordencomprasEliminados;	
	public List<EstadoDetalleOrdenCompra> estadodetalleordencomprasAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByEstadoDetalleOrdenCompra;		
	protected JButton jButtonAbrirOrderByEstadoDetalleOrdenCompra;
	
	
	//protected JPanel jPanelOrderByEstadoDetalleOrdenCompra;
	//public JScrollPane jScrollPanelOrderByEstadoDetalleOrdenCompra;	
	//protected JButton jButtonCerrarOrderByEstadoDetalleOrdenCompra;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public EstadoDetalleOrdenCompraLogic estadodetalleordencompraLogic;
	
	
	
	public JScrollPane jScrollPanelDatosEstadoDetalleOrdenCompra;
	public JScrollPane jScrollPanelDatosEdicionEstadoDetalleOrdenCompra;
	public JScrollPane jScrollPanelDatosGeneralEstadoDetalleOrdenCompra;
    
	
	
	//public JScrollPane jScrollPanelDatosEstadoDetalleOrdenCompraOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoEstadoDetalleOrdenCompra;
	//public JScrollPane jScrollPanelImportacionEstadoDetalleOrdenCompra;
	
	
	
	protected JPanel jPanelAccionesEstadoDetalleOrdenCompra;
	
    protected JPanel jPanelPaginacionEstadoDetalleOrdenCompra;
    protected JPanel jPanelParametrosReportesEstadoDetalleOrdenCompra;
	protected JPanel jPanelParametrosReportesAccionesEstadoDetalleOrdenCompra;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1EstadoDetalleOrdenCompra;
	protected JPanel jPanelParametrosAuxiliar2EstadoDetalleOrdenCompra;
	protected JPanel jPanelParametrosAuxiliar3EstadoDetalleOrdenCompra;
	protected JPanel jPanelParametrosAuxiliar4EstadoDetalleOrdenCompra;
	//protected JPanel jPanelParametrosAuxiliar5EstadoDetalleOrdenCompra;
	
	
	
	//protected JPanel jPanelReporteDinamicoEstadoDetalleOrdenCompra;
	//protected JPanel jPanelImportacionEstadoDetalleOrdenCompra;
	
	
	public JTable jTableDatosEstadoDetalleOrdenCompra;
	
	
	
	//public JTable jTableDatosEstadoDetalleOrdenCompraOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoEstadoDetalleOrdenCompra;
	protected JButton jButtonDuplicarEstadoDetalleOrdenCompra;
	protected JButton jButtonCopiarEstadoDetalleOrdenCompra;
	protected JButton jButtonVerFormEstadoDetalleOrdenCompra;
	protected JButton jButtonNuevoRelacionesEstadoDetalleOrdenCompra;
	protected JButton jButtonModificarEstadoDetalleOrdenCompra;
	
    protected JButton jButtonGuardarCambiosTablaEstadoDetalleOrdenCompra;
	protected JButton jButtonCerrarEstadoDetalleOrdenCompra;
	
	
	protected JButton jButtonRecargarInformacionEstadoDetalleOrdenCompra;
	protected JButton jButtonProcesarInformacionEstadoDetalleOrdenCompra;
	
	
	protected JButton jButtonAnterioresEstadoDetalleOrdenCompra;
	protected JButton jButtonSiguientesEstadoDetalleOrdenCompra;
	protected JButton jButtonNuevoGuardarCambiosEstadoDetalleOrdenCompra;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoEstadoDetalleOrdenCompra;
	//protected JButton jButtonCerrarReporteDinamicoEstadoDetalleOrdenCompra;
	//protected JButton jButtonGenerarExcelReporteDinamicoEstadoDetalleOrdenCompra;	
	
	
	
	//protected JButton jButtonAbrirImportacionEstadoDetalleOrdenCompra;
	//protected JButton jButtonGenerarImportacionEstadoDetalleOrdenCompra;
	//protected JButton jButtonCerrarImportacionEstadoDetalleOrdenCompra;
	//protected JFileChooser jFileChooserImportacionEstadoDetalleOrdenCompra;
	//protected File fileImportacionEstadoDetalleOrdenCompra;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarEstadoDetalleOrdenCompra;
	protected JButton jButtonDuplicarToolBarEstadoDetalleOrdenCompra;
	protected JButton jButtonNuevoRelacionesToolBarEstadoDetalleOrdenCompra;
	
	
	public JButton jButtonGuardarCambiosToolBarEstadoDetalleOrdenCompra;
	protected JButton jButtonCopiarToolBarEstadoDetalleOrdenCompra;
	protected JButton jButtonVerFormToolBarEstadoDetalleOrdenCompra;
	public JButton jButtonGuardarCambiosTablaToolBarEstadoDetalleOrdenCompra;
	protected JButton jButtonMostrarOcultarTablaToolBarEstadoDetalleOrdenCompra;
	protected JButton jButtonCerrarToolBarEstadoDetalleOrdenCompra;
	
	protected JButton jButtonRecargarInformacionToolBarEstadoDetalleOrdenCompra;
	protected JButton jButtonProcesarInformacionToolBarEstadoDetalleOrdenCompra;
	protected JButton jButtonAnterioresToolBarEstadoDetalleOrdenCompra;
	protected JButton jButtonSiguientesToolBarEstadoDetalleOrdenCompra;
	protected JButton jButtonNuevoGuardarCambiosToolBarEstadoDetalleOrdenCompra;
	protected JButton jButtonAbrirOrderByToolBarEstadoDetalleOrdenCompra;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoEstadoDetalleOrdenCompra;
	protected JMenuItem jMenuItemDuplicarEstadoDetalleOrdenCompra;
	protected JMenuItem jMenuItemNuevoRelacionesEstadoDetalleOrdenCompra;
	
	
	protected JMenuItem jMenuItemGuardarCambiosEstadoDetalleOrdenCompra;
	protected JMenuItem jMenuItemCopiarEstadoDetalleOrdenCompra;
	protected JMenuItem jMenuItemVerFormEstadoDetalleOrdenCompra;
	protected JMenuItem jMenuItemGuardarCambiosTablaEstadoDetalleOrdenCompra;
	protected JMenuItem jMenuItemCerrarEstadoDetalleOrdenCompra;
	protected JMenuItem jMenuItemDetalleCerrarEstadoDetalleOrdenCompra;
	protected JMenuItem jMenuItemDetalleAbrirOrderByEstadoDetalleOrdenCompra;
	protected JMenuItem jMenuItemDetalleMostarOcultarEstadoDetalleOrdenCompra;
	
	protected JMenuItem jMenuItemRecargarInformacionEstadoDetalleOrdenCompra;
	protected JMenuItem jMenuItemProcesarInformacionEstadoDetalleOrdenCompra;
	protected JMenuItem jMenuItemAnterioresEstadoDetalleOrdenCompra;
	protected JMenuItem jMenuItemSiguientesEstadoDetalleOrdenCompra;
	protected JMenuItem jMenuItemNuevoGuardarCambiosEstadoDetalleOrdenCompra;
	protected JMenuItem jMenuItemAbrirOrderByEstadoDetalleOrdenCompra;
	protected JMenuItem jMenuItemMostrarOcultarEstadoDetalleOrdenCompra;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesEstadoDetalleOrdenCompra;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosEstadoDetalleOrdenCompra;
	protected JCheckBox jCheckBoxSeleccionadosEstadoDetalleOrdenCompra;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaEstadoDetalleOrdenCompra;
	protected JCheckBox jCheckBoxConGraficoReporteEstadoDetalleOrdenCompra;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesEstadoDetalleOrdenCompra;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesEstadoDetalleOrdenCompra;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoEstadoDetalleOrdenCompra;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoEstadoDetalleOrdenCompra;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesEstadoDetalleOrdenCompra;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionEstadoDetalleOrdenCompra;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesEstadoDetalleOrdenCompra;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesEstadoDetalleOrdenCompra;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarEstadoDetalleOrdenCompra;
	protected JTextField jTextFieldValorCampoGeneralEstadoDetalleOrdenCompra;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteEstadoDetalleOrdenCompra;
	//public JList<Reporte> jListColumnasSelectReporteEstadoDetalleOrdenCompra;
	//public JScrollPane jScrollColumnasSelectReporteEstadoDetalleOrdenCompra;
	
	//public JLabel jLabelRelacionesSelectReporteEstadoDetalleOrdenCompra;
	//public JList<Reporte> jListRelacionesSelectReporteEstadoDetalleOrdenCompra;
	//public JScrollPane jScrollRelacionesSelectReporteEstadoDetalleOrdenCompra;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoEstadoDetalleOrdenCompra;
	//protected JCheckBox jCheckBoxConGraficoDinamicoEstadoDetalleOrdenCompra;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoEstadoDetalleOrdenCompra;
	//public JLabel jLabelTiposArchivoReporteDinamicoEstadoDetalleOrdenCompra;
	
		
	//public JLabel jLabelArchivoImportacionEstadoDetalleOrdenCompra;	
	//public JLabel jLabelPathArchivoImportacionEstadoDetalleOrdenCompra;
	//protected JTextField jTextFieldPathArchivoImportacionEstadoDetalleOrdenCompra;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoEstadoDetalleOrdenCompra;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoEstadoDetalleOrdenCompra;
	
	//public JLabel jLabelColumnaCategoriaValorEstadoDetalleOrdenCompra;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorEstadoDetalleOrdenCompra;
	
	//public JLabel jLabelColumnasValoresGraficoEstadoDetalleOrdenCompra;
	//public JList<Reporte> jListColumnasValoresGraficoEstadoDetalleOrdenCompra;
	//public JScrollPane jScrollColumnasValoresGraficoEstadoDetalleOrdenCompra;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoEstadoDetalleOrdenCompra;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoEstadoDetalleOrdenCompra;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	
	
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
	//public int iHeightFormulario=418;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public EstadoDetalleOrdenCompraJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("EstadoDetalleOrdenCompra No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoDetalleOrdenCompraJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EstadoDetalleOrdenCompra No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoDetalleOrdenCompraJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EstadoDetalleOrdenCompra No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoDetalleOrdenCompraJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("EstadoDetalleOrdenCompra No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionEstadoDetalleOrdenCompra)	{
		this.jButtonRecargarInformacionEstadoDetalleOrdenCompra = jButtonRecargarInformacionEstadoDetalleOrdenCompra;
	}
	
	public JButton getjButtonProcesarInformacionEstadoDetalleOrdenCompra() {
		return this.jButtonProcesarInformacionEstadoDetalleOrdenCompra;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionEstadoDetalleOrdenCompra)	{
		this.jButtonProcesarInformacionEstadoDetalleOrdenCompra = jButtonProcesarInformacionEstadoDetalleOrdenCompra;
	}
	
	
	public JButton getjButtonRecargarInformacionEstadoDetalleOrdenCompra() {
		return this.jButtonRecargarInformacionEstadoDetalleOrdenCompra;
	}
	
	
	public List<EstadoDetalleOrdenCompra> getestadodetalleordencompras() {
		return this.estadodetalleordencompras;
	}

	public void setestadodetalleordencompras(List<EstadoDetalleOrdenCompra> estadodetalleordencompras) {
		this.estadodetalleordencompras = estadodetalleordencompras;
	}
	
	public List<EstadoDetalleOrdenCompra> getestadodetalleordencomprasAux() {
		return this.estadodetalleordencomprasAux;
	}

	public void setestadodetalleordencomprasAux(List<EstadoDetalleOrdenCompra> estadodetalleordencomprasAux) {
		this.estadodetalleordencomprasAux = estadodetalleordencomprasAux;
	}
	
	public List<EstadoDetalleOrdenCompra> getestadodetalleordencomprasEliminados() {
		return this.estadodetalleordencomprasEliminados;
	}

	public void setEstadoDetalleOrdenComprasEliminados(List<EstadoDetalleOrdenCompra> estadodetalleordencomprasEliminados) {
		this.estadodetalleordencomprasEliminados = estadodetalleordencomprasEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarEstadoDetalleOrdenCompra() {
		return jComboBoxTiposSeleccionarEstadoDetalleOrdenCompra;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarEstadoDetalleOrdenCompra(
			JComboBox jComboBoxTiposSeleccionarEstadoDetalleOrdenCompra) {
		this.jComboBoxTiposSeleccionarEstadoDetalleOrdenCompra = jComboBoxTiposSeleccionarEstadoDetalleOrdenCompra;
	}
	
	public void setBorderResaltarTiposSeleccionarEstadoDetalleOrdenCompra() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarEstadoDetalleOrdenCompra.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarEstadoDetalleOrdenCompra .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralEstadoDetalleOrdenCompra() {
		return jTextFieldValorCampoGeneralEstadoDetalleOrdenCompra;
	}

	public void setjTextFieldValorCampoGeneralEstadoDetalleOrdenCompra(
			JTextField jTextFieldValorCampoGeneralEstadoDetalleOrdenCompra) {
		this.jTextFieldValorCampoGeneralEstadoDetalleOrdenCompra = jTextFieldValorCampoGeneralEstadoDetalleOrdenCompra;
	}

	public void setBorderResaltarValorCampoGeneralEstadoDetalleOrdenCompra() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoDetalleOrdenCompra.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralEstadoDetalleOrdenCompra .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosEstadoDetalleOrdenCompra() {
		return this.jCheckBoxSeleccionarTodosEstadoDetalleOrdenCompra;
	}

	public void setjCheckBoxSeleccionarTodosEstadoDetalleOrdenCompra(
			JCheckBox jCheckBoxSeleccionarTodosEstadoDetalleOrdenCompra) {
		this.jCheckBoxSeleccionarTodosEstadoDetalleOrdenCompra = jCheckBoxSeleccionarTodosEstadoDetalleOrdenCompra;
	}

	public void setBorderResaltarSeleccionarTodosEstadoDetalleOrdenCompra() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoDetalleOrdenCompra.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosEstadoDetalleOrdenCompra .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosEstadoDetalleOrdenCompra() {
		return this.jCheckBoxSeleccionadosEstadoDetalleOrdenCompra;
	}

	public void setjCheckBoxSeleccionadosEstadoDetalleOrdenCompra(
			JCheckBox jCheckBoxSeleccionadosEstadoDetalleOrdenCompra) {
		this.jCheckBoxSeleccionadosEstadoDetalleOrdenCompra = jCheckBoxSeleccionadosEstadoDetalleOrdenCompra;
	}
	
	public void setBorderResaltarSeleccionadosEstadoDetalleOrdenCompra() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoDetalleOrdenCompra.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosEstadoDetalleOrdenCompra .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesEstadoDetalleOrdenCompra() {
		return this.jComboBoxTiposArchivosReportesEstadoDetalleOrdenCompra;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesEstadoDetalleOrdenCompra(
			JComboBox jComboBoxTiposArchivosReportesEstadoDetalleOrdenCompra) {
		this.jComboBoxTiposArchivosReportesEstadoDetalleOrdenCompra = jComboBoxTiposArchivosReportesEstadoDetalleOrdenCompra;
	}

	public void setBorderResaltarTiposArchivosReportesEstadoDetalleOrdenCompra() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoDetalleOrdenCompra.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesEstadoDetalleOrdenCompra .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesEstadoDetalleOrdenCompra() {
		return this.jComboBoxTiposReportesEstadoDetalleOrdenCompra;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesEstadoDetalleOrdenCompra(
			JComboBox jComboBoxTiposReportesEstadoDetalleOrdenCompra) {
		this.jComboBoxTiposReportesEstadoDetalleOrdenCompra = jComboBoxTiposReportesEstadoDetalleOrdenCompra;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoEstadoDetalleOrdenCompra() {
	//	return jComboBoxTiposReportesDinamicoEstadoDetalleOrdenCompra;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoEstadoDetalleOrdenCompra(
	//		JComboBox jComboBoxTiposReportesDinamicoEstadoDetalleOrdenCompra) {
	//	this.jComboBoxTiposReportesDinamicoEstadoDetalleOrdenCompra = jComboBoxTiposReportesDinamicoEstadoDetalleOrdenCompra;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoEstadoDetalleOrdenCompra() {
	//	return jComboBoxTiposArchivosReportesDinamicoEstadoDetalleOrdenCompra;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoEstadoDetalleOrdenCompra(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoEstadoDetalleOrdenCompra) {
	//	this.jComboBoxTiposArchivosReportesDinamicoEstadoDetalleOrdenCompra = jComboBoxTiposArchivosReportesDinamicoEstadoDetalleOrdenCompra;
	//}
	
	public void setBorderResaltarTiposReportesEstadoDetalleOrdenCompra() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoDetalleOrdenCompra.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesEstadoDetalleOrdenCompra .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesEstadoDetalleOrdenCompra() {
		return this.jComboBoxTiposGraficosReportesEstadoDetalleOrdenCompra;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesEstadoDetalleOrdenCompra(
			JComboBox jComboBoxTiposGraficosReportesEstadoDetalleOrdenCompra) {
		this.jComboBoxTiposGraficosReportesEstadoDetalleOrdenCompra = jComboBoxTiposGraficosReportesEstadoDetalleOrdenCompra;
	}
	
	public void setBorderResaltarTiposGraficosReportesEstadoDetalleOrdenCompra() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoDetalleOrdenCompra.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesEstadoDetalleOrdenCompra .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionEstadoDetalleOrdenCompra() {
		return this.jComboBoxTiposPaginacionEstadoDetalleOrdenCompra;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionEstadoDetalleOrdenCompra(
			JComboBox jComboBoxTiposPaginacionEstadoDetalleOrdenCompra) {
		this.jComboBoxTiposPaginacionEstadoDetalleOrdenCompra = jComboBoxTiposPaginacionEstadoDetalleOrdenCompra;
	}
	
	public void setBorderResaltarTiposPaginacionEstadoDetalleOrdenCompra() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoDetalleOrdenCompra.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionEstadoDetalleOrdenCompra .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesEstadoDetalleOrdenCompra() {
		return this.jComboBoxTiposRelacionesEstadoDetalleOrdenCompra;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesEstadoDetalleOrdenCompra() {
		return this.jComboBoxTiposAccionesEstadoDetalleOrdenCompra;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesEstadoDetalleOrdenCompra(
			JComboBox jComboBoxTiposRelacionesEstadoDetalleOrdenCompra) {
		this.jComboBoxTiposRelacionesEstadoDetalleOrdenCompra = jComboBoxTiposRelacionesEstadoDetalleOrdenCompra;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesEstadoDetalleOrdenCompra(
			JComboBox jComboBoxTiposAccionesEstadoDetalleOrdenCompra) {
		this.jComboBoxTiposAccionesEstadoDetalleOrdenCompra = jComboBoxTiposAccionesEstadoDetalleOrdenCompra;
	}
	
	public void setBorderResaltarTiposRelacionesEstadoDetalleOrdenCompra() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoDetalleOrdenCompra.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesEstadoDetalleOrdenCompra .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesEstadoDetalleOrdenCompra() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoDetalleOrdenCompra.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesEstadoDetalleOrdenCompra .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoEstadoDetalleOrdenCompra() {
	//	return jCheckBoxConGraficoDinamicoEstadoDetalleOrdenCompra;
	//}

	//public void setjCheckBoxConGraficoDinamicoEstadoDetalleOrdenCompra(
	//		JCheckBox jCheckBoxConGraficoDinamicoEstadoDetalleOrdenCompra) {
	//	this.jCheckBoxConGraficoDinamicoEstadoDetalleOrdenCompra = jCheckBoxConGraficoDinamicoEstadoDetalleOrdenCompra;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoEstadoDetalleOrdenCompra() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarEstadoDetalleOrdenCompra.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoEstadoDetalleOrdenCompra .setBorder(borderResaltar);		
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
		this.estadodetalleordencompraSessionBean=new EstadoDetalleOrdenCompraSessionBean();
		
		this.estadodetalleordencompraSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.estadodetalleordencompraSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.estadodetalleordencompraSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=EstadoDetalleOrdenCompraJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=EstadoDetalleOrdenCompraJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		EstadoDetalleOrdenCompraJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		EstadoDetalleOrdenCompraJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		EstadoDetalleOrdenCompraJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Estado Detalle Orden Compra MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 910) {
			iHeight=910;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.estadodetalleordencompraSessionBean.getEsGuardarRelacionado()) {
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
		
		EstadoDetalleOrdenCompraJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("EstadoDetalleOrdenCompra No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarEstadoDetalleOrdenCompra= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarEstadoDetalleOrdenCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarEstadoDetalleOrdenCompra,this.jTtoolBarEstadoDetalleOrdenCompra,
							"nuevo","nuevo","Nuevo"+" "+EstadoDetalleOrdenCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarEstadoDetalleOrdenCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarEstadoDetalleOrdenCompra,this.jTtoolBarEstadoDetalleOrdenCompra,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarEstadoDetalleOrdenCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarEstadoDetalleOrdenCompra,this.jTtoolBarEstadoDetalleOrdenCompra,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+EstadoDetalleOrdenCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarEstadoDetalleOrdenCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarEstadoDetalleOrdenCompra,this.jTtoolBarEstadoDetalleOrdenCompra,
							"duplicar","duplicar","Duplicar"+" "+EstadoDetalleOrdenCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarEstadoDetalleOrdenCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarEstadoDetalleOrdenCompra,this.jTtoolBarEstadoDetalleOrdenCompra,
							"copiar","copiar","Copiar"+" "+EstadoDetalleOrdenCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarEstadoDetalleOrdenCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarEstadoDetalleOrdenCompra,this.jTtoolBarEstadoDetalleOrdenCompra,
							"ver_form","ver_form","Ver"+" "+EstadoDetalleOrdenCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarEstadoDetalleOrdenCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEstadoDetalleOrdenCompra,this.jTtoolBarEstadoDetalleOrdenCompra,
							"recargar","recargar","Recargar"+" "+EstadoDetalleOrdenCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarEstadoDetalleOrdenCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEstadoDetalleOrdenCompra,this.jTtoolBarEstadoDetalleOrdenCompra,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarEstadoDetalleOrdenCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEstadoDetalleOrdenCompra,this.jTtoolBarEstadoDetalleOrdenCompra,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarEstadoDetalleOrdenCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarEstadoDetalleOrdenCompra,this.jTtoolBarEstadoDetalleOrdenCompra,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarEstadoDetalleOrdenCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarEstadoDetalleOrdenCompra,this.jTtoolBarEstadoDetalleOrdenCompra,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarEstadoDetalleOrdenCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarEstadoDetalleOrdenCompra,this.jTtoolBarEstadoDetalleOrdenCompra,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+EstadoDetalleOrdenCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarEstadoDetalleOrdenCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarEstadoDetalleOrdenCompra,this.jTtoolBarEstadoDetalleOrdenCompra,
							"cerrar","cerrar","Salir"+" "+EstadoDetalleOrdenCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarEstadoDetalleOrdenCompra=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarEstadoDetalleOrdenCompra;
			
				this.jButtonProcesarInformacionToolBarEstadoDetalleOrdenCompra=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarEstadoDetalleOrdenCompra;
				
		//protected JButton jButtonModificarToolBarEstadoDetalleOrdenCompra;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarEstadoDetalleOrdenCompra=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuEstadoDetalleOrdenCompra=new JMenuMe("General");
		this.jmenuArchivoEstadoDetalleOrdenCompra=new JMenuMe("Archivo");
		this.jmenuAccionesEstadoDetalleOrdenCompra=new JMenuMe("Acciones");
		this.jmenuDatosEstadoDetalleOrdenCompra=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoEstadoDetalleOrdenCompra= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoEstadoDetalleOrdenCompra.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoEstadoDetalleOrdenCompra,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoEstadoDetalleOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarEstadoDetalleOrdenCompra= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarEstadoDetalleOrdenCompra.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarEstadoDetalleOrdenCompra,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarEstadoDetalleOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesEstadoDetalleOrdenCompra= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesEstadoDetalleOrdenCompra.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesEstadoDetalleOrdenCompra,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesEstadoDetalleOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosEstadoDetalleOrdenCompra= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosEstadoDetalleOrdenCompra.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosEstadoDetalleOrdenCompra,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosEstadoDetalleOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarEstadoDetalleOrdenCompra= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarEstadoDetalleOrdenCompra.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarEstadoDetalleOrdenCompra,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarEstadoDetalleOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormEstadoDetalleOrdenCompra= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormEstadoDetalleOrdenCompra.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormEstadoDetalleOrdenCompra,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormEstadoDetalleOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaEstadoDetalleOrdenCompra= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaEstadoDetalleOrdenCompra.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaEstadoDetalleOrdenCompra,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaEstadoDetalleOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarEstadoDetalleOrdenCompra= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarEstadoDetalleOrdenCompra.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarEstadoDetalleOrdenCompra,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarEstadoDetalleOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionEstadoDetalleOrdenCompra= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionEstadoDetalleOrdenCompra.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionEstadoDetalleOrdenCompra,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionEstadoDetalleOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionEstadoDetalleOrdenCompra= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionEstadoDetalleOrdenCompra.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionEstadoDetalleOrdenCompra,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresEstadoDetalleOrdenCompra= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresEstadoDetalleOrdenCompra.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresEstadoDetalleOrdenCompra,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresEstadoDetalleOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesEstadoDetalleOrdenCompra= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesEstadoDetalleOrdenCompra.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesEstadoDetalleOrdenCompra,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesEstadoDetalleOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByEstadoDetalleOrdenCompra= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByEstadoDetalleOrdenCompra.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByEstadoDetalleOrdenCompra,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByEstadoDetalleOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarEstadoDetalleOrdenCompra= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarEstadoDetalleOrdenCompra.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarEstadoDetalleOrdenCompra,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarEstadoDetalleOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByEstadoDetalleOrdenCompra= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByEstadoDetalleOrdenCompra.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByEstadoDetalleOrdenCompra,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByEstadoDetalleOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarEstadoDetalleOrdenCompra= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarEstadoDetalleOrdenCompra.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarEstadoDetalleOrdenCompra,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarEstadoDetalleOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosEstadoDetalleOrdenCompra= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosEstadoDetalleOrdenCompra.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosEstadoDetalleOrdenCompra,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosEstadoDetalleOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoEstadoDetalleOrdenCompra.add(this.jMenuItemCerrarEstadoDetalleOrdenCompra);
			
			this.jmenuAccionesEstadoDetalleOrdenCompra.add(this.jMenuItemNuevoEstadoDetalleOrdenCompra);
			this.jmenuAccionesEstadoDetalleOrdenCompra.add(this.jMenuItemNuevoGuardarCambiosEstadoDetalleOrdenCompra);
			this.jmenuAccionesEstadoDetalleOrdenCompra.add(this.jMenuItemNuevoRelacionesEstadoDetalleOrdenCompra);
			this.jmenuAccionesEstadoDetalleOrdenCompra.add(this.jMenuItemGuardarCambiosTablaEstadoDetalleOrdenCompra);		
			this.jmenuAccionesEstadoDetalleOrdenCompra.add(this.jMenuItemDuplicarEstadoDetalleOrdenCompra);		
			this.jmenuAccionesEstadoDetalleOrdenCompra.add(this.jMenuItemCopiarEstadoDetalleOrdenCompra);		
			this.jmenuAccionesEstadoDetalleOrdenCompra.add(this.jMenuItemVerFormEstadoDetalleOrdenCompra);		
			
			this.jmenuDatosEstadoDetalleOrdenCompra.add(this.jMenuItemRecargarInformacionEstadoDetalleOrdenCompra);				
			this.jmenuDatosEstadoDetalleOrdenCompra.add(this.jMenuItemAnterioresEstadoDetalleOrdenCompra);				
			this.jmenuDatosEstadoDetalleOrdenCompra.add(this.jMenuItemSiguientesEstadoDetalleOrdenCompra);				
			this.jmenuDatosEstadoDetalleOrdenCompra.add(this.jMenuItemAbrirOrderByEstadoDetalleOrdenCompra);				
			this.jmenuDatosEstadoDetalleOrdenCompra.add(this.jMenuItemMostrarOcultarEstadoDetalleOrdenCompra);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesEstadoDetalleOrdenCompra.add(this.jMenuItemGuardarCambiosEstadoDetalleOrdenCompra);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoEstadoDetalleOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesEstadoDetalleOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosEstadoDetalleOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarEstadoDetalleOrdenCompra.add(this.jmenuArchivoEstadoDetalleOrdenCompra);		
			this.jmenuBarEstadoDetalleOrdenCompra.add(this.jmenuAccionesEstadoDetalleOrdenCompra);		
			this.jmenuBarEstadoDetalleOrdenCompra.add(this.jmenuDatosEstadoDetalleOrdenCompra);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarEstadoDetalleOrdenCompra);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasEstadoDetalleOrdenCompra() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
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
			//this.jInternalFrameDetalleEstadoDetalleOrdenCompra = new EstadoDetalleOrdenCompraDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Estado Detalle Orden Compra DATOS");
			this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra = new EstadoDetalleOrdenCompraDetalleFormJInternalFrame(jDesktopPane,this.estadodetalleordencompraSessionBean.getConGuardarRelaciones(),this.estadodetalleordencompraSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra = null;//new EstadoDetalleOrdenCompraDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutEstadoDetalleOrdenCompra= new GridBagLayout();
		
		
		this.jTableDatosEstadoDetalleOrdenCompra = new JTableMe();      
		
		String sToolTipEstadoDetalleOrdenCompra="";
		sToolTipEstadoDetalleOrdenCompra=EstadoDetalleOrdenCompraConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipEstadoDetalleOrdenCompra+="(Inventario.EstadoDetalleOrdenCompra)";
		}
		
		if(!this.estadodetalleordencompraSessionBean.getEsGuardarRelacionado()) {
			sToolTipEstadoDetalleOrdenCompra+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosEstadoDetalleOrdenCompra.setToolTipText(sToolTipEstadoDetalleOrdenCompra);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosEstadoDetalleOrdenCompra);
		this.jTableDatosEstadoDetalleOrdenCompra.setAutoCreateRowSorter(true);
		this.jTableDatosEstadoDetalleOrdenCompra.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosEstadoDetalleOrdenCompra.setRowSelectionAllowed(true);
		this.jTableDatosEstadoDetalleOrdenCompra.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosEstadoDetalleOrdenCompra,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoEstadoDetalleOrdenCompra = new JButtonMe();
		this.jButtonDuplicarEstadoDetalleOrdenCompra = new JButtonMe();
		this.jButtonCopiarEstadoDetalleOrdenCompra = new JButtonMe();
		this.jButtonVerFormEstadoDetalleOrdenCompra = new JButtonMe();
		this.jButtonNuevoRelacionesEstadoDetalleOrdenCompra = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaEstadoDetalleOrdenCompra = new JButtonMe();
		this.jButtonCerrarEstadoDetalleOrdenCompra = new JButtonMe();
		
		this.jScrollPanelDatosEstadoDetalleOrdenCompra = new JScrollPane();   
        this.jScrollPanelDatosGeneralEstadoDetalleOrdenCompra = new JScrollPane();
		
				
		
		
		this.jPanelAccionesEstadoDetalleOrdenCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Estado Detalle Orden Compra";
		
		if(!this.estadodetalleordencompraSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosEstadoDetalleOrdenCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Detalle Orden Compras" + this.sPath));
		} else {
			this.jScrollPanelDatosEstadoDetalleOrdenCompra.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralEstadoDetalleOrdenCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesEstadoDetalleOrdenCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesEstadoDetalleOrdenCompra.setToolTipText("Acciones");
        this.jPanelAccionesEstadoDetalleOrdenCompra.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralEstadoDetalleOrdenCompra, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEstadoDetalleOrdenCompra, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoEstadoDetalleOrdenCompra=new ReporteDinamicoJInternalFrame(EstadoDetalleOrdenCompraConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoEstadoDetalleOrdenCompra();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionEstadoDetalleOrdenCompra=new ImportacionJInternalFrame(EstadoDetalleOrdenCompraConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionEstadoDetalleOrdenCompra();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByEstadoDetalleOrdenCompra = new JButtonMe();
		
		this.jButtonAbrirOrderByEstadoDetalleOrdenCompra.setText("Orden");
		this.jButtonAbrirOrderByEstadoDetalleOrdenCompra.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByEstadoDetalleOrdenCompra,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByEstadoDetalleOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByEstadoDetalleOrdenCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByEstadoDetalleOrdenCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByEstadoDetalleOrdenCompra=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEstadoDetalleOrdenCompra,false,this);
			
			//this.cargarOrderByEstadoDetalleOrdenCompra(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByEstadoDetalleOrdenCompra=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEstadoDetalleOrdenCompra,true,this);
			
			//this.cargarOrderByEstadoDetalleOrdenCompra(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosEstadoDetalleOrdenCompra.setMinimumSize(new Dimension(400,50));//430
		this.jTableDatosEstadoDetalleOrdenCompra.setMaximumSize(new Dimension(400,50));//430
		this.jTableDatosEstadoDetalleOrdenCompra.setPreferredSize(new Dimension(400,50));//430
		
		this.jScrollPanelDatosEstadoDetalleOrdenCompra.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosEstadoDetalleOrdenCompra.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosEstadoDetalleOrdenCompra.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoEstadoDetalleOrdenCompra.setText("Nuevo");
		this.jButtonDuplicarEstadoDetalleOrdenCompra.setText("Duplicar");
		this.jButtonCopiarEstadoDetalleOrdenCompra.setText("Copiar");
		this.jButtonVerFormEstadoDetalleOrdenCompra.setText("Ver");
		this.jButtonNuevoRelacionesEstadoDetalleOrdenCompra.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaEstadoDetalleOrdenCompra.setText("Guardar");
		this.jButtonCerrarEstadoDetalleOrdenCompra.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoEstadoDetalleOrdenCompra,"nuevo_button","Nuevo",this.estadodetalleordencompraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarEstadoDetalleOrdenCompra,"duplicar_button","Duplicar",this.estadodetalleordencompraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarEstadoDetalleOrdenCompra,"copiar_button","Copiar",this.estadodetalleordencompraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormEstadoDetalleOrdenCompra,"ver_form","Ver",this.estadodetalleordencompraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesEstadoDetalleOrdenCompra,"nuevorelaciones_button","Nuevo Rel",this.estadodetalleordencompraSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaEstadoDetalleOrdenCompra,"guardarcambiostabla_button","Guardar",this.estadodetalleordencompraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarEstadoDetalleOrdenCompra,"cerrar_button","Salir",this.estadodetalleordencompraSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoEstadoDetalleOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarEstadoDetalleOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarEstadoDetalleOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormEstadoDetalleOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesEstadoDetalleOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaEstadoDetalleOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarEstadoDetalleOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoEstadoDetalleOrdenCompra.setToolTipText("Nuevo"+" "+EstadoDetalleOrdenCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarEstadoDetalleOrdenCompra.setToolTipText("Duplicar"+" "+EstadoDetalleOrdenCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarEstadoDetalleOrdenCompra.setToolTipText("Copiar"+" "+EstadoDetalleOrdenCompraConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormEstadoDetalleOrdenCompra.setToolTipText("Ver"+" "+EstadoDetalleOrdenCompraConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesEstadoDetalleOrdenCompra.setToolTipText("Nuevo Rel"+" "+EstadoDetalleOrdenCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaEstadoDetalleOrdenCompra.setToolTipText("Guardar"+" "+EstadoDetalleOrdenCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarEstadoDetalleOrdenCompra.setToolTipText("Salir"+" "+EstadoDetalleOrdenCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoEstadoDetalleOrdenCompra";
		inputMap = this.jButtonNuevoEstadoDetalleOrdenCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoEstadoDetalleOrdenCompra.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoEstadoDetalleOrdenCompra"));
		
		//DUPLICAR
		sMapKey = "DuplicarEstadoDetalleOrdenCompra";
		inputMap = this.jButtonDuplicarEstadoDetalleOrdenCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarEstadoDetalleOrdenCompra.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarEstadoDetalleOrdenCompra"));
		
		//COPIAR
		sMapKey = "CopiarEstadoDetalleOrdenCompra";
		inputMap = this.jButtonCopiarEstadoDetalleOrdenCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarEstadoDetalleOrdenCompra.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarEstadoDetalleOrdenCompra"));
		
		//VEr FORM
		sMapKey = "VerFormEstadoDetalleOrdenCompra";
		inputMap = this.jButtonVerFormEstadoDetalleOrdenCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormEstadoDetalleOrdenCompra.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormEstadoDetalleOrdenCompra"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesEstadoDetalleOrdenCompra";
		inputMap = this.jButtonNuevoRelacionesEstadoDetalleOrdenCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesEstadoDetalleOrdenCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesEstadoDetalleOrdenCompra"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarEstadoDetalleOrdenCompra";
		inputMap = this.jButtonModificarEstadoDetalleOrdenCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarEstadoDetalleOrdenCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarEstadoDetalleOrdenCompra"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarEstadoDetalleOrdenCompra";
		inputMap = this.jButtonCerrarEstadoDetalleOrdenCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarEstadoDetalleOrdenCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarEstadoDetalleOrdenCompra"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaEstadoDetalleOrdenCompra";
		inputMap = this.jButtonGuardarCambiosTablaEstadoDetalleOrdenCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaEstadoDetalleOrdenCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaEstadoDetalleOrdenCompra"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesEstadoDetalleOrdenCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesEstadoDetalleOrdenCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionEstadoDetalleOrdenCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1EstadoDetalleOrdenCompra= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2EstadoDetalleOrdenCompra= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3EstadoDetalleOrdenCompra= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4EstadoDetalleOrdenCompra= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5EstadoDetalleOrdenCompra= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesEstadoDetalleOrdenCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesEstadoDetalleOrdenCompra.setName("jPanelParametrosReportesEstadoDetalleOrdenCompra"); 
		
		this.jPanelParametrosReportesAccionesEstadoDetalleOrdenCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesEstadoDetalleOrdenCompra.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesEstadoDetalleOrdenCompra.setName("jPanelParametrosReportesAccionesEstadoDetalleOrdenCompra"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesEstadoDetalleOrdenCompra, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesEstadoDetalleOrdenCompra, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionEstadoDetalleOrdenCompra = new JButtonMe();
		this.jButtonRecargarInformacionEstadoDetalleOrdenCompra.setText("Recargar");
		this.jButtonRecargarInformacionEstadoDetalleOrdenCompra.setToolTipText("Recargar"+" "+EstadoDetalleOrdenCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionEstadoDetalleOrdenCompra,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionEstadoDetalleOrdenCompra = new JButtonMe();
		this.jButtonProcesarInformacionEstadoDetalleOrdenCompra.setText("Procesar");
		this.jButtonProcesarInformacionEstadoDetalleOrdenCompra.setToolTipText("Procesar"+" "+EstadoDetalleOrdenCompraConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionEstadoDetalleOrdenCompra.setVisible(false);
			
		this.jButtonProcesarInformacionEstadoDetalleOrdenCompra.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionEstadoDetalleOrdenCompra.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionEstadoDetalleOrdenCompra.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesEstadoDetalleOrdenCompra = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEstadoDetalleOrdenCompra.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesEstadoDetalleOrdenCompra.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesEstadoDetalleOrdenCompra = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEstadoDetalleOrdenCompra.setText("TIPO");       
		this.jComboBoxTiposReportesEstadoDetalleOrdenCompra.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesEstadoDetalleOrdenCompra = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEstadoDetalleOrdenCompra.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesEstadoDetalleOrdenCompra.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionEstadoDetalleOrdenCompra = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionEstadoDetalleOrdenCompra.setText("Paginacion");
		this.jComboBoxTiposPaginacionEstadoDetalleOrdenCompra.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesEstadoDetalleOrdenCompra = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesEstadoDetalleOrdenCompra.setText("Accion");
		this.jComboBoxTiposRelacionesEstadoDetalleOrdenCompra.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesEstadoDetalleOrdenCompra = new JComboBoxMe();
		//this.jComboBoxTiposAccionesEstadoDetalleOrdenCompra.setText("Accion");
		this.jComboBoxTiposAccionesEstadoDetalleOrdenCompra.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarEstadoDetalleOrdenCompra = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarEstadoDetalleOrdenCompra.setText("Accion");
		this.jComboBoxTiposSeleccionarEstadoDetalleOrdenCompra.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralEstadoDetalleOrdenCompra=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralEstadoDetalleOrdenCompra.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralEstadoDetalleOrdenCompra.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralEstadoDetalleOrdenCompra.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesEstadoDetalleOrdenCompra = new JLabelMe();
		
		this.jLabelAccionesEstadoDetalleOrdenCompra.setText("Acciones");		
		this.jLabelAccionesEstadoDetalleOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEstadoDetalleOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEstadoDetalleOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosEstadoDetalleOrdenCompra = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosEstadoDetalleOrdenCompra.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosEstadoDetalleOrdenCompra.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosEstadoDetalleOrdenCompra = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosEstadoDetalleOrdenCompra.setText("Seleccionados");
		this.jCheckBoxSeleccionadosEstadoDetalleOrdenCompra.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaEstadoDetalleOrdenCompra = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaEstadoDetalleOrdenCompra.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaEstadoDetalleOrdenCompra.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteEstadoDetalleOrdenCompra = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteEstadoDetalleOrdenCompra.setText("Graf.");
		this.jCheckBoxConGraficoReporteEstadoDetalleOrdenCompra.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresEstadoDetalleOrdenCompra = new JButtonMe();
		//this.jButtonAnterioresEstadoDetalleOrdenCompra.setText("<<");
        this.jButtonAnterioresEstadoDetalleOrdenCompra.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresEstadoDetalleOrdenCompra,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresEstadoDetalleOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesEstadoDetalleOrdenCompra = new JButtonMe();
		//this.jButtonSiguientesEstadoDetalleOrdenCompra.setText(">>");
        this.jButtonSiguientesEstadoDetalleOrdenCompra.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesEstadoDetalleOrdenCompra,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesEstadoDetalleOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosEstadoDetalleOrdenCompra = new JButtonMe();
		this.jButtonNuevoGuardarCambiosEstadoDetalleOrdenCompra.setText("Nue");
        this.jButtonNuevoGuardarCambiosEstadoDetalleOrdenCompra.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosEstadoDetalleOrdenCompra,"nuevoguardarcambios_button","Nue",this.estadodetalleordencompraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosEstadoDetalleOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosEstadoDetalleOrdenCompra";
		inputMap = this.jButtonNuevoGuardarCambiosEstadoDetalleOrdenCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosEstadoDetalleOrdenCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosEstadoDetalleOrdenCompra"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionEstadoDetalleOrdenCompra";
		inputMap = this.jButtonRecargarInformacionEstadoDetalleOrdenCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionEstadoDetalleOrdenCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionEstadoDetalleOrdenCompra"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesEstadoDetalleOrdenCompra";
		inputMap = this.jButtonSiguientesEstadoDetalleOrdenCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesEstadoDetalleOrdenCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesEstadoDetalleOrdenCompra"));
		
		//ANTERIORES		
		sMapKey = "AnterioresEstadoDetalleOrdenCompra";
		inputMap = this.jButtonAnterioresEstadoDetalleOrdenCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresEstadoDetalleOrdenCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresEstadoDetalleOrdenCompra"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasEstadoDetalleOrdenCompra();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesEstadoDetalleOrdenCompra.setMinimumSize(new Dimension(this.getWidth(),EstadoDetalleOrdenCompraBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EstadoDetalleOrdenCompraBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesEstadoDetalleOrdenCompra.setMaximumSize(new Dimension(this.getWidth(),EstadoDetalleOrdenCompraBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EstadoDetalleOrdenCompraBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesEstadoDetalleOrdenCompra.setPreferredSize(new Dimension(this.getWidth(),EstadoDetalleOrdenCompraBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EstadoDetalleOrdenCompraBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionEstadoDetalleOrdenCompra = new GridBagLayout();

			this.jPanelPaginacionEstadoDetalleOrdenCompra.setLayout(gridaBagLayoutPaginacionEstadoDetalleOrdenCompra);						
			
			this.gridBagConstraintsEstadoDetalleOrdenCompra = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetalleOrdenCompra.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsEstadoDetalleOrdenCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoDetalleOrdenCompra.gridy = 0;
			this.gridBagConstraintsEstadoDetalleOrdenCompra.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionEstadoDetalleOrdenCompra.add(this.jButtonAnterioresEstadoDetalleOrdenCompra, this.gridBagConstraintsEstadoDetalleOrdenCompra);
					
						
			this.gridBagConstraintsEstadoDetalleOrdenCompra = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetalleOrdenCompra.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsEstadoDetalleOrdenCompra.gridy = 0;
			
			this.jPanelPaginacionEstadoDetalleOrdenCompra.add(this.jButtonNuevoGuardarCambiosEstadoDetalleOrdenCompra, this.gridBagConstraintsEstadoDetalleOrdenCompra);
						
			
			this.gridBagConstraintsEstadoDetalleOrdenCompra = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetalleOrdenCompra.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsEstadoDetalleOrdenCompra.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsEstadoDetalleOrdenCompra.gridy = 0;
			this.jPanelPaginacionEstadoDetalleOrdenCompra.add(this.jButtonSiguientesEstadoDetalleOrdenCompra, this.gridBagConstraintsEstadoDetalleOrdenCompra);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsEstadoDetalleOrdenCompra = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetalleOrdenCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoDetalleOrdenCompra.gridy = 1;
			this.gridBagConstraintsEstadoDetalleOrdenCompra.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEstadoDetalleOrdenCompra.add(this.jButtonNuevoEstadoDetalleOrdenCompra, this.gridBagConstraintsEstadoDetalleOrdenCompra);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsEstadoDetalleOrdenCompra = new GridBagConstraints();
				this.gridBagConstraintsEstadoDetalleOrdenCompra.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsEstadoDetalleOrdenCompra.gridy = 1;
				this.gridBagConstraintsEstadoDetalleOrdenCompra.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionEstadoDetalleOrdenCompra.add(this.jButtonNuevoRelacionesEstadoDetalleOrdenCompra, this.gridBagConstraintsEstadoDetalleOrdenCompra);
			}
			
			
			if(!this.estadodetalleordencompraSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsEstadoDetalleOrdenCompra = new GridBagConstraints();
				this.gridBagConstraintsEstadoDetalleOrdenCompra.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsEstadoDetalleOrdenCompra.gridy = 1;
				this.gridBagConstraintsEstadoDetalleOrdenCompra.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionEstadoDetalleOrdenCompra.add(this.jButtonGuardarCambiosTablaEstadoDetalleOrdenCompra, this.gridBagConstraintsEstadoDetalleOrdenCompra);
			}
			
			
			
			this.gridBagConstraintsEstadoDetalleOrdenCompra = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetalleOrdenCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoDetalleOrdenCompra.gridy = 1;
			this.gridBagConstraintsEstadoDetalleOrdenCompra.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEstadoDetalleOrdenCompra.add(this.jButtonDuplicarEstadoDetalleOrdenCompra, this.gridBagConstraintsEstadoDetalleOrdenCompra);
			
			this.gridBagConstraintsEstadoDetalleOrdenCompra = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetalleOrdenCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoDetalleOrdenCompra.gridy = 1;
			this.gridBagConstraintsEstadoDetalleOrdenCompra.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEstadoDetalleOrdenCompra.add(this.jButtonCopiarEstadoDetalleOrdenCompra, this.gridBagConstraintsEstadoDetalleOrdenCompra);
		
			this.gridBagConstraintsEstadoDetalleOrdenCompra = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetalleOrdenCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoDetalleOrdenCompra.gridy = 1;
			this.gridBagConstraintsEstadoDetalleOrdenCompra.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEstadoDetalleOrdenCompra.add(this.jButtonVerFormEstadoDetalleOrdenCompra, this.gridBagConstraintsEstadoDetalleOrdenCompra);
		
			this.gridBagConstraintsEstadoDetalleOrdenCompra = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetalleOrdenCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoDetalleOrdenCompra.gridy = 1;
			this.gridBagConstraintsEstadoDetalleOrdenCompra.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionEstadoDetalleOrdenCompra.add(this.jButtonCerrarEstadoDetalleOrdenCompra, this.gridBagConstraintsEstadoDetalleOrdenCompra);
		
		
		
		this.jButtonRecargarInformacionEstadoDetalleOrdenCompra.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionEstadoDetalleOrdenCompra.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionEstadoDetalleOrdenCompra.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionEstadoDetalleOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesEstadoDetalleOrdenCompra.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesEstadoDetalleOrdenCompra.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesEstadoDetalleOrdenCompra.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesEstadoDetalleOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesEstadoDetalleOrdenCompra.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesEstadoDetalleOrdenCompra.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesEstadoDetalleOrdenCompra.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesEstadoDetalleOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesEstadoDetalleOrdenCompra.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesEstadoDetalleOrdenCompra.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesEstadoDetalleOrdenCompra.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesEstadoDetalleOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionEstadoDetalleOrdenCompra.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionEstadoDetalleOrdenCompra.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionEstadoDetalleOrdenCompra.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionEstadoDetalleOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesEstadoDetalleOrdenCompra.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesEstadoDetalleOrdenCompra.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesEstadoDetalleOrdenCompra.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesEstadoDetalleOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesEstadoDetalleOrdenCompra.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEstadoDetalleOrdenCompra.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEstadoDetalleOrdenCompra.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesEstadoDetalleOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarEstadoDetalleOrdenCompra.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarEstadoDetalleOrdenCompra.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarEstadoDetalleOrdenCompra.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarEstadoDetalleOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaEstadoDetalleOrdenCompra.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaEstadoDetalleOrdenCompra.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaEstadoDetalleOrdenCompra.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaEstadoDetalleOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteEstadoDetalleOrdenCompra.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteEstadoDetalleOrdenCompra.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteEstadoDetalleOrdenCompra.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteEstadoDetalleOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosEstadoDetalleOrdenCompra.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosEstadoDetalleOrdenCompra.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosEstadoDetalleOrdenCompra.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosEstadoDetalleOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosEstadoDetalleOrdenCompra.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosEstadoDetalleOrdenCompra.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosEstadoDetalleOrdenCompra.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosEstadoDetalleOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesEstadoDetalleOrdenCompra = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesEstadoDetalleOrdenCompra = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1EstadoDetalleOrdenCompra = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2EstadoDetalleOrdenCompra = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3EstadoDetalleOrdenCompra = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4EstadoDetalleOrdenCompra = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesEstadoDetalleOrdenCompra.setLayout(gridaBagParametrosReportesEstadoDetalleOrdenCompra);
			this.jPanelParametrosReportesAccionesEstadoDetalleOrdenCompra.setLayout(gridaBagParametrosReportesAccionesEstadoDetalleOrdenCompra);
			
			
			this.jPanelParametrosAuxiliar1EstadoDetalleOrdenCompra.setLayout(gridaBagParametrosAuxiliar1EstadoDetalleOrdenCompra);
			this.jPanelParametrosAuxiliar2EstadoDetalleOrdenCompra.setLayout(gridaBagParametrosAuxiliar2EstadoDetalleOrdenCompra);
			this.jPanelParametrosAuxiliar3EstadoDetalleOrdenCompra.setLayout(gridaBagParametrosAuxiliar3EstadoDetalleOrdenCompra);
			this.jPanelParametrosAuxiliar4EstadoDetalleOrdenCompra.setLayout(gridaBagParametrosAuxiliar4EstadoDetalleOrdenCompra);
			//this.jPanelParametrosAuxiliar5EstadoDetalleOrdenCompra.setLayout(gridaBagParametrosAuxiliar2EstadoDetalleOrdenCompra);			
			
			
			
			
			this.gridBagConstraintsEstadoDetalleOrdenCompra = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetalleOrdenCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoDetalleOrdenCompra.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEstadoDetalleOrdenCompra.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstadoDetalleOrdenCompra.add(this.jButtonRecargarInformacionEstadoDetalleOrdenCompra, this.gridBagConstraintsEstadoDetalleOrdenCompra);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsEstadoDetalleOrdenCompra = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetalleOrdenCompra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoDetalleOrdenCompra.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoDetalleOrdenCompra.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1EstadoDetalleOrdenCompra.add(this.jComboBoxTiposPaginacionEstadoDetalleOrdenCompra, this.gridBagConstraintsEstadoDetalleOrdenCompra);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsEstadoDetalleOrdenCompra = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetalleOrdenCompra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoDetalleOrdenCompra.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoDetalleOrdenCompra.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1EstadoDetalleOrdenCompra.add(this.jCheckBoxConAltoMaximoTablaEstadoDetalleOrdenCompra, this.gridBagConstraintsEstadoDetalleOrdenCompra);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsEstadoDetalleOrdenCompra = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetalleOrdenCompra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoDetalleOrdenCompra.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoDetalleOrdenCompra.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1EstadoDetalleOrdenCompra.add(this.jComboBoxTiposArchivosReportesEstadoDetalleOrdenCompra, this.gridBagConstraintsEstadoDetalleOrdenCompra);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsEstadoDetalleOrdenCompra = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetalleOrdenCompra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoDetalleOrdenCompra.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoDetalleOrdenCompra.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoDetalleOrdenCompra.add(this.jPanelParametrosAuxiliar1EstadoDetalleOrdenCompra, this.gridBagConstraintsEstadoDetalleOrdenCompra);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsEstadoDetalleOrdenCompra = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetalleOrdenCompra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoDetalleOrdenCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoDetalleOrdenCompra.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEstadoDetalleOrdenCompra.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4EstadoDetalleOrdenCompra.add(this.jComboBoxTiposReportesEstadoDetalleOrdenCompra, this.gridBagConstraintsEstadoDetalleOrdenCompra);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsEstadoDetalleOrdenCompra = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetalleOrdenCompra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoDetalleOrdenCompra.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoDetalleOrdenCompra.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoDetalleOrdenCompra.add(this.jPanelParametrosAuxiliar4EstadoDetalleOrdenCompra, this.gridBagConstraintsEstadoDetalleOrdenCompra);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsEstadoDetalleOrdenCompra = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetalleOrdenCompra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoDetalleOrdenCompra.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoDetalleOrdenCompra.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoDetalleOrdenCompra.add(this.jComboBoxTiposReportesEstadoDetalleOrdenCompra, this.gridBagConstraintsEstadoDetalleOrdenCompra);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsEstadoDetalleOrdenCompra = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetalleOrdenCompra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoDetalleOrdenCompra.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoDetalleOrdenCompra.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEstadoDetalleOrdenCompra.add(this.jCheckBoxGenerarReporteEstadoDetalleOrdenCompra, this.gridBagConstraintsEstadoDetalleOrdenCompra);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsEstadoDetalleOrdenCompra = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetalleOrdenCompra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoDetalleOrdenCompra.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoDetalleOrdenCompra.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoDetalleOrdenCompra.add(this.jPanelParametrosAuxiliar2EstadoDetalleOrdenCompra, this.gridBagConstraintsEstadoDetalleOrdenCompra);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsEstadoDetalleOrdenCompra = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetalleOrdenCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoDetalleOrdenCompra.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEstadoDetalleOrdenCompra.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEstadoDetalleOrdenCompra.add(this.jLabelAccionesEstadoDetalleOrdenCompra, this.gridBagConstraintsEstadoDetalleOrdenCompra);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsEstadoDetalleOrdenCompra = new GridBagConstraints();
				this.gridBagConstraintsEstadoDetalleOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsEstadoDetalleOrdenCompra.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsEstadoDetalleOrdenCompra.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesEstadoDetalleOrdenCompra.add(this.jButtonAbrirOrderByEstadoDetalleOrdenCompra, this.gridBagConstraintsEstadoDetalleOrdenCompra);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsEstadoDetalleOrdenCompra = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetalleOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsEstadoDetalleOrdenCompra.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoDetalleOrdenCompra.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstadoDetalleOrdenCompra.add(this.jComboBoxTiposSeleccionarEstadoDetalleOrdenCompra, this.gridBagConstraintsEstadoDetalleOrdenCompra);			
			
			
			/*
			this.gridBagConstraintsEstadoDetalleOrdenCompra = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetalleOrdenCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoDetalleOrdenCompra.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEstadoDetalleOrdenCompra.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEstadoDetalleOrdenCompra.add(this.jCheckBoxSeleccionarTodosEstadoDetalleOrdenCompra, this.gridBagConstraintsEstadoDetalleOrdenCompra);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsEstadoDetalleOrdenCompra = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetalleOrdenCompra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoDetalleOrdenCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoDetalleOrdenCompra.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEstadoDetalleOrdenCompra.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3EstadoDetalleOrdenCompra.add(this.jCheckBoxSeleccionarTodosEstadoDetalleOrdenCompra, this.gridBagConstraintsEstadoDetalleOrdenCompra);															
				
			this.gridBagConstraintsEstadoDetalleOrdenCompra = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetalleOrdenCompra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoDetalleOrdenCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoDetalleOrdenCompra.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEstadoDetalleOrdenCompra.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3EstadoDetalleOrdenCompra.add(this.jCheckBoxSeleccionadosEstadoDetalleOrdenCompra, this.gridBagConstraintsEstadoDetalleOrdenCompra);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsEstadoDetalleOrdenCompra = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetalleOrdenCompra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoDetalleOrdenCompra.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoDetalleOrdenCompra.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoDetalleOrdenCompra.add(this.jPanelParametrosAuxiliar3EstadoDetalleOrdenCompra, this.gridBagConstraintsEstadoDetalleOrdenCompra);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsEstadoDetalleOrdenCompra = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetalleOrdenCompra.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoDetalleOrdenCompra.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstadoDetalleOrdenCompra.add(this.jComboBoxTiposRelacionesEstadoDetalleOrdenCompra, this.gridBagConstraintsEstadoDetalleOrdenCompra);
				
			this.gridBagConstraintsEstadoDetalleOrdenCompra = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetalleOrdenCompra.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoDetalleOrdenCompra.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstadoDetalleOrdenCompra.add(this.jComboBoxTiposAccionesEstadoDetalleOrdenCompra, this.gridBagConstraintsEstadoDetalleOrdenCompra);
	
				
			this.gridBagConstraintsEstadoDetalleOrdenCompra = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetalleOrdenCompra.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoDetalleOrdenCompra.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstadoDetalleOrdenCompra.add(this.jTextFieldValorCampoGeneralEstadoDetalleOrdenCompra, this.gridBagConstraintsEstadoDetalleOrdenCompra);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosEstadoDetalleOrdenCompra = new GridBagLayout();

			this.jScrollPanelDatosEstadoDetalleOrdenCompra.setLayout(gridaBagLayoutDatosEstadoDetalleOrdenCompra);
			
			this.gridBagConstraintsEstadoDetalleOrdenCompra = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetalleOrdenCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoDetalleOrdenCompra.gridy = 0;
			this.gridBagConstraintsEstadoDetalleOrdenCompra.gridx = 0;
			
			this.jScrollPanelDatosEstadoDetalleOrdenCompra.add(this.jTableDatosEstadoDetalleOrdenCompra, this.gridBagConstraintsEstadoDetalleOrdenCompra);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosEstadoDetalleOrdenCompra.setViewportView(this.jTableDatosEstadoDetalleOrdenCompra);
		this.jTableDatosEstadoDetalleOrdenCompra.setFillsViewportHeight(true);
		this.jTableDatosEstadoDetalleOrdenCompra.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesEstadoDetalleOrdenCompra= new GridBagLayout();
		this.jPanelAccionesEstadoDetalleOrdenCompra.setLayout(gridaBagLayoutAccionesEstadoDetalleOrdenCompra);
		
		
		/*	
		this.gridBagConstraintsEstadoDetalleOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleOrdenCompra.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoDetalleOrdenCompra.gridy = 0;
		this.gridBagConstraintsEstadoDetalleOrdenCompra.gridx = 0;
			
		this.jPanelAccionesEstadoDetalleOrdenCompra.add(this.jButtonNuevoEstadoDetalleOrdenCompra, this.gridBagConstraintsEstadoDetalleOrdenCompra);
		*/
		int iPosXAccion=0;
		
						
		
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutEstadoDetalleOrdenCompra = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutEstadoDetalleOrdenCompra);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.estadodetalleordencompraSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsEstadoDetalleOrdenCompra = new GridBagConstraints();						
			this.gridBagConstraintsEstadoDetalleOrdenCompra.gridy = iGridyPrincipal++;
			this.gridBagConstraintsEstadoDetalleOrdenCompra.gridx = 0;		
			//this.gridBagConstraintsEstadoDetalleOrdenCompra.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoDetalleOrdenCompra.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsEstadoDetalleOrdenCompra.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarEstadoDetalleOrdenCompra, this.gridBagConstraintsEstadoDetalleOrdenCompra);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsEstadoDetalleOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleOrdenCompra.gridy = iGridyPrincipal++;
		this.gridBagConstraintsEstadoDetalleOrdenCompra.gridx = 0;		
		//this.gridBagConstraintsEstadoDetalleOrdenCompra.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoDetalleOrdenCompra.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsEstadoDetalleOrdenCompra.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsEstadoDetalleOrdenCompra);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsEstadoDetalleOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleOrdenCompra.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoDetalleOrdenCompra.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesEstadoDetalleOrdenCompra, this.gridBagConstraintsEstadoDetalleOrdenCompra);								
		
		
		/*
		this.gridBagConstraintsEstadoDetalleOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleOrdenCompra.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoDetalleOrdenCompra.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesEstadoDetalleOrdenCompra, this.gridBagConstraintsEstadoDetalleOrdenCompra);
		*/		
		
		this.gridBagConstraintsEstadoDetalleOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleOrdenCompra.gridy =iGridyPrincipal++;
		this.gridBagConstraintsEstadoDetalleOrdenCompra.gridx =0;
		this.gridBagConstraintsEstadoDetalleOrdenCompra.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsEstadoDetalleOrdenCompra.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosEstadoDetalleOrdenCompra, this.gridBagConstraintsEstadoDetalleOrdenCompra);
				
		
		this.gridBagConstraintsEstadoDetalleOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleOrdenCompra.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoDetalleOrdenCompra.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionEstadoDetalleOrdenCompra, this.gridBagConstraintsEstadoDetalleOrdenCompra);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(EstadoDetalleOrdenCompraJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosEstadoDetalleOrdenCompra= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosEstadoDetalleOrdenCompra = new GridBagLayout();
			this.jPanelBusquedasParametrosEstadoDetalleOrdenCompra.setLayout(gridaBagLayoutBusquedasParametrosEstadoDetalleOrdenCompra);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralEstadoDetalleOrdenCompra=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralEstadoDetalleOrdenCompra.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEstadoDetalleOrdenCompra.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEstadoDetalleOrdenCompra.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsEstadoDetalleOrdenCompra = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsEstadoDetalleOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleOrdenCompra.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoDetalleOrdenCompra.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposEstadoDetalleOrdenCompra, this.gridBagConstraintsEstadoDetalleOrdenCompra);
			
			
		this.gridBagConstraintsEstadoDetalleOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleOrdenCompra.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoDetalleOrdenCompra.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosEstadoDetalleOrdenCompra, this.gridBagConstraintsEstadoDetalleOrdenCompra);
		
			
		this.gridBagConstraintsEstadoDetalleOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleOrdenCompra.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsEstadoDetalleOrdenCompra.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesEstadoDetalleOrdenCompra, this.gridBagConstraintsEstadoDetalleOrdenCompra);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralEstadoDetalleOrdenCompra;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoEstadoDetalleOrdenCompra() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoEstadoDetalleOrdenCompra = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoEstadoDetalleOrdenCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoEstadoDetalleOrdenCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoEstadoDetalleOrdenCompra.setName("jPanelReporteDinamicoEstadoDetalleOrdenCompra"); 
		
		this.jPanelReporteDinamicoEstadoDetalleOrdenCompra.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoEstadoDetalleOrdenCompra.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoEstadoDetalleOrdenCompra.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoEstadoDetalleOrdenCompra.setLayout(gridaBagLayoutReporteDinamicoEstadoDetalleOrdenCompra);
		
		
		this.jInternalFrameReporteDinamicoEstadoDetalleOrdenCompra= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoEstadoDetalleOrdenCompra = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteEstadoDetalleOrdenCompra= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoEstadoDetalleOrdenCompra.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoEstadoDetalleOrdenCompra.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoEstadoDetalleOrdenCompra.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoEstadoDetalleOrdenCompra.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoEstadoDetalleOrdenCompra.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoEstadoDetalleOrdenCompra.setResizable(true);
	    this.jInternalFrameReporteDinamicoEstadoDetalleOrdenCompra.setClosable(true);
	    this.jInternalFrameReporteDinamicoEstadoDetalleOrdenCompra.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoEstadoDetalleOrdenCompra.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoEstadoDetalleOrdenCompra.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoEstadoDetalleOrdenCompra.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoEstadoDetalleOrdenCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Detalle Orden Compras"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteEstadoDetalleOrdenCompra = new JLabelMe();

		this.jLabelColumnasSelectReporteEstadoDetalleOrdenCompra.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteEstadoDetalleOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteEstadoDetalleOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteEstadoDetalleOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsEstadoDetalleOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoDetalleOrdenCompra.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoDetalleOrdenCompra.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoEstadoDetalleOrdenCompra.add(this.jLabelColumnasSelectReporteEstadoDetalleOrdenCompra, this.gridBagConstraintsEstadoDetalleOrdenCompra);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteEstadoDetalleOrdenCompra = new JList<Reporte>();
		this.jListColumnasSelectReporteEstadoDetalleOrdenCompra.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteEstadoDetalleOrdenCompra.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteEstadoDetalleOrdenCompra.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteEstadoDetalleOrdenCompra.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteEstadoDetalleOrdenCompra.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteEstadoDetalleOrdenCompra=new JScrollPane(this.jListColumnasSelectReporteEstadoDetalleOrdenCompra);
			
			this.jScrollColumnasSelectReporteEstadoDetalleOrdenCompra.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteEstadoDetalleOrdenCompra.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteEstadoDetalleOrdenCompra.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteEstadoDetalleOrdenCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsEstadoDetalleOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoDetalleOrdenCompra.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoDetalleOrdenCompra.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoEstadoDetalleOrdenCompra.add(this.jListColumnasSelectReporteEstadoDetalleOrdenCompra, this.gridBagConstraintsEstadoDetalleOrdenCompra);
		this.jPanelReporteDinamicoEstadoDetalleOrdenCompra.add(this.jScrollColumnasSelectReporteEstadoDetalleOrdenCompra, this.gridBagConstraintsEstadoDetalleOrdenCompra);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteEstadoDetalleOrdenCompra = new JLabelMe();

		this.jLabelRelacionesSelectReporteEstadoDetalleOrdenCompra.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteEstadoDetalleOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteEstadoDetalleOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteEstadoDetalleOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsEstadoDetalleOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoDetalleOrdenCompra.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoDetalleOrdenCompra.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoEstadoDetalleOrdenCompra.add(this.jLabelRelacionesSelectReporteEstadoDetalleOrdenCompra, this.gridBagConstraintsEstadoDetalleOrdenCompra);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteEstadoDetalleOrdenCompra = new JList<Reporte>();
		this.jListRelacionesSelectReporteEstadoDetalleOrdenCompra.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteEstadoDetalleOrdenCompra.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteEstadoDetalleOrdenCompra.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteEstadoDetalleOrdenCompra.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteEstadoDetalleOrdenCompra.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteEstadoDetalleOrdenCompra=new JScrollPane(this.jListRelacionesSelectReporteEstadoDetalleOrdenCompra);
			
			this.jScrollRelacionesSelectReporteEstadoDetalleOrdenCompra.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteEstadoDetalleOrdenCompra.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteEstadoDetalleOrdenCompra.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteEstadoDetalleOrdenCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsEstadoDetalleOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoDetalleOrdenCompra.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoDetalleOrdenCompra.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoEstadoDetalleOrdenCompra.add(this.jListRelacionesSelectReporteEstadoDetalleOrdenCompra, this.gridBagConstraintsEstadoDetalleOrdenCompra);
		this.jPanelReporteDinamicoEstadoDetalleOrdenCompra.add(this.jScrollRelacionesSelectReporteEstadoDetalleOrdenCompra, this.gridBagConstraintsEstadoDetalleOrdenCompra);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoEstadoDetalleOrdenCompra = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoEstadoDetalleOrdenCompra = new JComboBoxMe();
		this.jListColumnasValoresGraficoEstadoDetalleOrdenCompra = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoEstadoDetalleOrdenCompra = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoEstadoDetalleOrdenCompra.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoEstadoDetalleOrdenCompra.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoEstadoDetalleOrdenCompra.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoEstadoDetalleOrdenCompra.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoEstadoDetalleOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoEstadoDetalleOrdenCompra = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoEstadoDetalleOrdenCompra.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoEstadoDetalleOrdenCompra.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoEstadoDetalleOrdenCompra.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoEstadoDetalleOrdenCompra.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoEstadoDetalleOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoEstadoDetalleOrdenCompra = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoEstadoDetalleOrdenCompra.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoEstadoDetalleOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoEstadoDetalleOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoEstadoDetalleOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsEstadoDetalleOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoDetalleOrdenCompra.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoDetalleOrdenCompra.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEstadoDetalleOrdenCompra.add(this.jLabelGenerarExcelReporteDinamicoEstadoDetalleOrdenCompra, this.gridBagConstraintsEstadoDetalleOrdenCompra);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoEstadoDetalleOrdenCompra = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoEstadoDetalleOrdenCompra.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoEstadoDetalleOrdenCompra,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoEstadoDetalleOrdenCompra.setToolTipText("Generar EXCEL"+" "+EstadoDetalleOrdenCompraConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsEstadoDetalleOrdenCompra = new GridBagConstraints();
		//this.gridBagConstraintsEstadoDetalleOrdenCompra.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsEstadoDetalleOrdenCompra.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsEstadoDetalleOrdenCompra.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoEstadoDetalleOrdenCompra.add(this.jButtonGenerarExcelReporteDinamicoEstadoDetalleOrdenCompra, this.gridBagConstraintsEstadoDetalleOrdenCompra);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsEstadoDetalleOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleOrdenCompra.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoDetalleOrdenCompra.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEstadoDetalleOrdenCompra.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEstadoDetalleOrdenCompra.add(this.jComboBoxTiposReportesDinamicoEstadoDetalleOrdenCompra, this.gridBagConstraintsEstadoDetalleOrdenCompra);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoEstadoDetalleOrdenCompra = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoEstadoDetalleOrdenCompra.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoEstadoDetalleOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoEstadoDetalleOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoEstadoDetalleOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsEstadoDetalleOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoDetalleOrdenCompra.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoDetalleOrdenCompra.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEstadoDetalleOrdenCompra.add(this.jLabelTiposArchivoReporteDinamicoEstadoDetalleOrdenCompra, this.gridBagConstraintsEstadoDetalleOrdenCompra);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsEstadoDetalleOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleOrdenCompra.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoDetalleOrdenCompra.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEstadoDetalleOrdenCompra.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEstadoDetalleOrdenCompra.add(this.jComboBoxTiposArchivosReportesDinamicoEstadoDetalleOrdenCompra, this.gridBagConstraintsEstadoDetalleOrdenCompra);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoEstadoDetalleOrdenCompra = new JButtonMe();
		this.jButtonGenerarReporteDinamicoEstadoDetalleOrdenCompra.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoEstadoDetalleOrdenCompra,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoEstadoDetalleOrdenCompra.setToolTipText("Generar"+" "+EstadoDetalleOrdenCompraConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsEstadoDetalleOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleOrdenCompra.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoDetalleOrdenCompra.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEstadoDetalleOrdenCompra.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEstadoDetalleOrdenCompra.add(this.jButtonGenerarReporteDinamicoEstadoDetalleOrdenCompra, this.gridBagConstraintsEstadoDetalleOrdenCompra);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoEstadoDetalleOrdenCompra = new JButtonMe();
		this.jButtonCerrarReporteDinamicoEstadoDetalleOrdenCompra.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoEstadoDetalleOrdenCompra,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoEstadoDetalleOrdenCompra.setToolTipText("Cancelar"+" "+EstadoDetalleOrdenCompraConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsEstadoDetalleOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleOrdenCompra.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoDetalleOrdenCompra.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEstadoDetalleOrdenCompra.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEstadoDetalleOrdenCompra.add(this.jButtonCerrarReporteDinamicoEstadoDetalleOrdenCompra, this.gridBagConstraintsEstadoDetalleOrdenCompra);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalEstadoDetalleOrdenCompra = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoEstadoDetalleOrdenCompra= new JScrollPane(jPanelReporteDinamicoEstadoDetalleOrdenCompra,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoEstadoDetalleOrdenCompra.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoEstadoDetalleOrdenCompra.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoEstadoDetalleOrdenCompra.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoEstadoDetalleOrdenCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Detalle Orden Compras"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsEstadoDetalleOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleOrdenCompra.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsEstadoDetalleOrdenCompra.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsEstadoDetalleOrdenCompra.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoEstadoDetalleOrdenCompra.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoEstadoDetalleOrdenCompra.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalEstadoDetalleOrdenCompra);
		this.jInternalFrameReporteDinamicoEstadoDetalleOrdenCompra.getContentPane().add(this.jScrollPanelReporteDinamicoEstadoDetalleOrdenCompra, this.gridBagConstraintsEstadoDetalleOrdenCompra);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionEstadoDetalleOrdenCompra() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionEstadoDetalleOrdenCompra = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionEstadoDetalleOrdenCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionEstadoDetalleOrdenCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionEstadoDetalleOrdenCompra.setName("jPanelImportacionEstadoDetalleOrdenCompra"); 
		
		this.jPanelImportacionEstadoDetalleOrdenCompra.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionEstadoDetalleOrdenCompra.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionEstadoDetalleOrdenCompra.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionEstadoDetalleOrdenCompra.setLayout(gridaBagLayoutImportacionEstadoDetalleOrdenCompra);
		
		
		this.jInternalFrameImportacionEstadoDetalleOrdenCompra= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionEstadoDetalleOrdenCompra= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionEstadoDetalleOrdenCompra = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteEstadoDetalleOrdenCompra= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionEstadoDetalleOrdenCompra.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionEstadoDetalleOrdenCompra.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionEstadoDetalleOrdenCompra.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionEstadoDetalleOrdenCompra.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionEstadoDetalleOrdenCompra.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionEstadoDetalleOrdenCompra.setResizable(true);
	    this.jInternalFrameImportacionEstadoDetalleOrdenCompra.setClosable(true);
	    this.jInternalFrameImportacionEstadoDetalleOrdenCompra.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionEstadoDetalleOrdenCompra.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionEstadoDetalleOrdenCompra.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionEstadoDetalleOrdenCompra.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionEstadoDetalleOrdenCompra.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionEstadoDetalleOrdenCompra.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionEstadoDetalleOrdenCompra.setResizable(true);
	    this.jInternalFrameImportacionEstadoDetalleOrdenCompra.setClosable(true);
	    this.jInternalFrameImportacionEstadoDetalleOrdenCompra.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionEstadoDetalleOrdenCompra.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionEstadoDetalleOrdenCompra.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionEstadoDetalleOrdenCompra.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionEstadoDetalleOrdenCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Detalle Orden Compras"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionEstadoDetalleOrdenCompra = new JLabelMe();

		this.jLabelArchivoImportacionEstadoDetalleOrdenCompra.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionEstadoDetalleOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionEstadoDetalleOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionEstadoDetalleOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsEstadoDetalleOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoDetalleOrdenCompra.gridy = iPosYImportacion;		
		this.gridBagConstraintsEstadoDetalleOrdenCompra.gridx = iPosXImportacion++;
			
		this.jPanelImportacionEstadoDetalleOrdenCompra.add(this.jLabelArchivoImportacionEstadoDetalleOrdenCompra, this.gridBagConstraintsEstadoDetalleOrdenCompra);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionEstadoDetalleOrdenCompra = new JFileChooser();		
		this.jFileChooserImportacionEstadoDetalleOrdenCompra.setToolTipText("ESCOGER ARCHIVO"+" "+EstadoDetalleOrdenCompraConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionEstadoDetalleOrdenCompra = new JButtonMe();
		this.jButtonAbrirImportacionEstadoDetalleOrdenCompra.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionEstadoDetalleOrdenCompra,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionEstadoDetalleOrdenCompra.setToolTipText("Generar"+" "+EstadoDetalleOrdenCompraConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsEstadoDetalleOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleOrdenCompra.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoDetalleOrdenCompra.gridy = iPosYImportacion;
		this.gridBagConstraintsEstadoDetalleOrdenCompra.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEstadoDetalleOrdenCompra.add(this.jButtonAbrirImportacionEstadoDetalleOrdenCompra, this.gridBagConstraintsEstadoDetalleOrdenCompra);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionEstadoDetalleOrdenCompra = new JLabelMe();

		this.jLabelPathArchivoImportacionEstadoDetalleOrdenCompra.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionEstadoDetalleOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionEstadoDetalleOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionEstadoDetalleOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsEstadoDetalleOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoDetalleOrdenCompra.gridy = iPosYImportacion;		
		this.gridBagConstraintsEstadoDetalleOrdenCompra.gridx = iPosXImportacion++;
			
		this.jPanelImportacionEstadoDetalleOrdenCompra.add(this.jLabelPathArchivoImportacionEstadoDetalleOrdenCompra, this.gridBagConstraintsEstadoDetalleOrdenCompra);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionEstadoDetalleOrdenCompra=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionEstadoDetalleOrdenCompra.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionEstadoDetalleOrdenCompra.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionEstadoDetalleOrdenCompra.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsEstadoDetalleOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleOrdenCompra.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoDetalleOrdenCompra.gridy = iPosYImportacion;
		this.gridBagConstraintsEstadoDetalleOrdenCompra.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEstadoDetalleOrdenCompra.add(this.jTextFieldPathArchivoImportacionEstadoDetalleOrdenCompra, this.gridBagConstraintsEstadoDetalleOrdenCompra);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionEstadoDetalleOrdenCompra = new JButtonMe();
		this.jButtonGenerarImportacionEstadoDetalleOrdenCompra.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionEstadoDetalleOrdenCompra,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionEstadoDetalleOrdenCompra.setToolTipText("Generar"+" "+EstadoDetalleOrdenCompraConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsEstadoDetalleOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleOrdenCompra.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoDetalleOrdenCompra.gridy = iPosYImportacion;
		this.gridBagConstraintsEstadoDetalleOrdenCompra.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEstadoDetalleOrdenCompra.add(this.jButtonGenerarImportacionEstadoDetalleOrdenCompra, this.gridBagConstraintsEstadoDetalleOrdenCompra);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionEstadoDetalleOrdenCompra = new JButtonMe();
		this.jButtonCerrarImportacionEstadoDetalleOrdenCompra.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionEstadoDetalleOrdenCompra,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionEstadoDetalleOrdenCompra.setToolTipText("Cancelar"+" "+EstadoDetalleOrdenCompraConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsEstadoDetalleOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleOrdenCompra.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoDetalleOrdenCompra.gridy = iPosYImportacion;
		this.gridBagConstraintsEstadoDetalleOrdenCompra.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEstadoDetalleOrdenCompra.add(this.jButtonCerrarImportacionEstadoDetalleOrdenCompra, this.gridBagConstraintsEstadoDetalleOrdenCompra);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalEstadoDetalleOrdenCompra = new GridBagLayout();
		
		this.jScrollPanelImportacionEstadoDetalleOrdenCompra= new JScrollPane(jPanelImportacionEstadoDetalleOrdenCompra,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsEstadoDetalleOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleOrdenCompra.gridy =iPosYImportacion;
		this.gridBagConstraintsEstadoDetalleOrdenCompra.gridx =iPosXImportacion;
		this.gridBagConstraintsEstadoDetalleOrdenCompra.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionEstadoDetalleOrdenCompra.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionEstadoDetalleOrdenCompra.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalEstadoDetalleOrdenCompra);
		this.jInternalFrameImportacionEstadoDetalleOrdenCompra.getContentPane().add(this.jScrollPanelImportacionEstadoDetalleOrdenCompra, this.gridBagConstraintsEstadoDetalleOrdenCompra);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByEstadoDetalleOrdenCompra(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByEstadoDetalleOrdenCompra = new JButtonMe();
			this.jButtonAbrirOrderByEstadoDetalleOrdenCompra.setText("Orden");
			this.jButtonAbrirOrderByEstadoDetalleOrdenCompra.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByEstadoDetalleOrdenCompra,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByEstadoDetalleOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByEstadoDetalleOrdenCompra";
			inputMap = this.jButtonAbrirOrderByEstadoDetalleOrdenCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByEstadoDetalleOrdenCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByEstadoDetalleOrdenCompra"));
		
		
			GridBagLayout gridaBagLayoutOrderByEstadoDetalleOrdenCompra = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByEstadoDetalleOrdenCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByEstadoDetalleOrdenCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByEstadoDetalleOrdenCompra.setName("jPanelOrderByEstadoDetalleOrdenCompra"); 
			
			this.jPanelOrderByEstadoDetalleOrdenCompra.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByEstadoDetalleOrdenCompra.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByEstadoDetalleOrdenCompra.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByEstadoDetalleOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByEstadoDetalleOrdenCompra.setLayout(gridaBagLayoutOrderByEstadoDetalleOrdenCompra);
			
			
			this.jTableDatosEstadoDetalleOrdenCompraOrderBy = new JTableMe();        
			this.jTableDatosEstadoDetalleOrdenCompraOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosEstadoDetalleOrdenCompraOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosEstadoDetalleOrdenCompraOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosEstadoDetalleOrdenCompraOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosEstadoDetalleOrdenCompraOrderBy.setViewportView(this.jTableDatosEstadoDetalleOrdenCompraOrderBy);
			this.jTableDatosEstadoDetalleOrdenCompraOrderBy.setFillsViewportHeight(true);
			this.jTableDatosEstadoDetalleOrdenCompraOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByEstadoDetalleOrdenCompra= new OrderByJInternalFrame();
			this.jInternalFrameOrderByEstadoDetalleOrdenCompra= new OrderByJInternalFrame();
			this.jScrollPanelOrderByEstadoDetalleOrdenCompra = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteEstadoDetalleOrdenCompra= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByEstadoDetalleOrdenCompra.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByEstadoDetalleOrdenCompra.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByEstadoDetalleOrdenCompra.setTitle("Orden");
			this.jInternalFrameOrderByEstadoDetalleOrdenCompra.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByEstadoDetalleOrdenCompra.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByEstadoDetalleOrdenCompra.setResizable(true);
			this.jInternalFrameOrderByEstadoDetalleOrdenCompra.setClosable(true);
			this.jInternalFrameOrderByEstadoDetalleOrdenCompra.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByEstadoDetalleOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByEstadoDetalleOrdenCompra.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByEstadoDetalleOrdenCompra.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByEstadoDetalleOrdenCompra.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByEstadoDetalleOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByEstadoDetalleOrdenCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Detalle Orden Compras"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsEstadoDetalleOrdenCompra = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetalleOrdenCompra.gridy =iPosYOrderBy++;
			this.gridBagConstraintsEstadoDetalleOrdenCompra.gridx =iPosXOrderBy;
			this.gridBagConstraintsEstadoDetalleOrdenCompra.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsEstadoDetalleOrdenCompra.ipady =150;
				
			this.jPanelOrderByEstadoDetalleOrdenCompra.add(jScrollPanelDatosEstadoDetalleOrdenCompraOrderBy, this.gridBagConstraintsEstadoDetalleOrdenCompra);//this.jTableDatosEstadoDetalleOrdenCompraTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByEstadoDetalleOrdenCompra = new JButtonMe();
			this.jButtonCerrarOrderByEstadoDetalleOrdenCompra.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByEstadoDetalleOrdenCompra,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByEstadoDetalleOrdenCompra.setToolTipText("Cancelar"+" "+EstadoDetalleOrdenCompraConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByEstadoDetalleOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsEstadoDetalleOrdenCompra = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetalleOrdenCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoDetalleOrdenCompra.gridy = iPosYOrderBy++;
			this.gridBagConstraintsEstadoDetalleOrdenCompra.gridx = iPosXOrderBy;
									
			this.jPanelOrderByEstadoDetalleOrdenCompra.add(this.jButtonCerrarOrderByEstadoDetalleOrdenCompra, this.gridBagConstraintsEstadoDetalleOrdenCompra);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalEstadoDetalleOrdenCompra = new GridBagLayout();
			
			this.jScrollPanelOrderByEstadoDetalleOrdenCompra= new JScrollPane(jPanelOrderByEstadoDetalleOrdenCompra,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsEstadoDetalleOrdenCompra = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetalleOrdenCompra.gridy =iPosYOrderBy;
			this.gridBagConstraintsEstadoDetalleOrdenCompra.gridx =iPosXOrderBy;
			this.gridBagConstraintsEstadoDetalleOrdenCompra.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByEstadoDetalleOrdenCompra.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByEstadoDetalleOrdenCompra.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalEstadoDetalleOrdenCompra);
			
			this.jInternalFrameOrderByEstadoDetalleOrdenCompra.getContentPane().add(this.jScrollPanelOrderByEstadoDetalleOrdenCompra, this.gridBagConstraintsEstadoDetalleOrdenCompra);			
		
		} else {
			this.jButtonAbrirOrderByEstadoDetalleOrdenCompra = new JButtonMe();
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
		int iWidthTableCalculado=0;//830
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=430;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=300;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=100;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.estadodetalleordencompraSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosEstadoDetalleOrdenCompra.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosEstadoDetalleOrdenCompra.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosEstadoDetalleOrdenCompra.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosEstadoDetalleOrdenCompra.getRowHeight();//EstadoDetalleOrdenCompraConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.estadodetalleordencompraSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > EstadoDetalleOrdenCompraConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaEstadoDetalleOrdenCompra.isSelected()) {
					iHeightTable=EstadoDetalleOrdenCompraConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < EstadoDetalleOrdenCompraConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=EstadoDetalleOrdenCompraConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > EstadoDetalleOrdenCompraConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaEstadoDetalleOrdenCompra.isSelected()) {
					iHeightTable=EstadoDetalleOrdenCompraConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < EstadoDetalleOrdenCompraConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=EstadoDetalleOrdenCompraConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosEstadoDetalleOrdenCompra.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosEstadoDetalleOrdenCompra.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosEstadoDetalleOrdenCompra.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosEstadoDetalleOrdenCompra.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosEstadoDetalleOrdenCompra.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosEstadoDetalleOrdenCompra.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByEstadoDetalleOrdenCompra!=null && this.jInternalFrameOrderByEstadoDetalleOrdenCompra.getjTableDatosOrderBy()!=null) {
			//if(!this.estadodetalleordencompraSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByEstadoDetalleOrdenCompra.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByEstadoDetalleOrdenCompra.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByEstadoDetalleOrdenCompra.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByEstadoDetalleOrdenCompra.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByEstadoDetalleOrdenCompra.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByEstadoDetalleOrdenCompra.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByEstadoDetalleOrdenCompra.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosEstadoDetalleOrdenCompra.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosEstadoDetalleOrdenCompra.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosEstadoDetalleOrdenCompra.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=estadodetalleordencompraLogic.getEstadoDetalleOrdenCompras().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=estadodetalleordencompras.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<EstadoDetalleOrdenCompra> TraerEstadoDetalleOrdenCompraBeans(List<EstadoDetalleOrdenCompra> estadodetalleordencompras,ArrayList<Classe> classes)throws Exception {
		try {
			for(EstadoDetalleOrdenCompra estadodetalleordencompra:estadodetalleordencompras) {
					
				if(!(EstadoDetalleOrdenCompraConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || EstadoDetalleOrdenCompraConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					estadodetalleordencompra.setsDetalleGeneralEntityReporte(EstadoDetalleOrdenCompraConstantesFunciones.getEstadoDetalleOrdenCompraDescripcion(estadodetalleordencompra));
										
						
					
					

					if(estadodetalleordencompra.getDetalleOrdenCompras()!=null && Funciones.existeClass(classes,DetalleOrdenCompra.class)) {
						try{estadodetalleordencompra.setdetalleordencomprasDescripcionReporte(new JRBeanCollectionDataSource(DetalleOrdenCompraJInternalFrame.TraerDetalleOrdenCompraBeans(estadodetalleordencompra.getDetalleOrdenCompras(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//estadodetalleordencompra.setsDetalleGeneralEntityReporte(estadodetalleordencompra.getsDetalleGeneralEntityReporte());
										
				}
				
				//estadodetalleordencomprabeans.add(estadodetalleordencomprabean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return estadodetalleordencompras;
    }
	//PARA REPORTES FIN
}
