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
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.sris.presentation.swing.jinternalframes.*;

import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.sris.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.sris.business.entity.*;

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
import com.bydan.erp.inventario.util.EstadoOrdenCompraConstantesFunciones;

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
public class EstadoOrdenCompraJInternalFrame extends EstadoOrdenCompraBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarEstadoOrdenCompra;
	
	protected JMenuBar jmenuBarEstadoOrdenCompra;
	
	protected JMenu jmenuEstadoOrdenCompra;
	protected JMenu jmenuDatosEstadoOrdenCompra;
	protected JMenu jmenuArchivoEstadoOrdenCompra;
	protected JMenu jmenuAccionesEstadoOrdenCompra;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosEstadoOrdenCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutEstadoOrdenCompra;	
	protected GridBagConstraints gridBagConstraintsEstadoOrdenCompra;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public EstadoOrdenCompraDetalleFormJInternalFrame jInternalFrameDetalleFormEstadoOrdenCompra;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoEstadoOrdenCompra;	
	protected ImportacionJInternalFrame jInternalFrameImportacionEstadoOrdenCompra;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public EstadoOrdenCompraSessionBean estadoordencompraSessionBean;
		
	
	
	
	//protected JDesktopPane jDesktopPane;
	public List<EstadoOrdenCompra> estadoordencompras;		
	public List<EstadoOrdenCompra> estadoordencomprasEliminados;	
	public List<EstadoOrdenCompra> estadoordencomprasAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByEstadoOrdenCompra;		
	protected JButton jButtonAbrirOrderByEstadoOrdenCompra;
	
	
	//protected JPanel jPanelOrderByEstadoOrdenCompra;
	//public JScrollPane jScrollPanelOrderByEstadoOrdenCompra;	
	//protected JButton jButtonCerrarOrderByEstadoOrdenCompra;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public EstadoOrdenCompraLogic estadoordencompraLogic;
	
	
	
	public JScrollPane jScrollPanelDatosEstadoOrdenCompra;
	public JScrollPane jScrollPanelDatosEdicionEstadoOrdenCompra;
	public JScrollPane jScrollPanelDatosGeneralEstadoOrdenCompra;
    
	
	
	//public JScrollPane jScrollPanelDatosEstadoOrdenCompraOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoEstadoOrdenCompra;
	//public JScrollPane jScrollPanelImportacionEstadoOrdenCompra;
	
	
	
	protected JPanel jPanelAccionesEstadoOrdenCompra;
	
    protected JPanel jPanelPaginacionEstadoOrdenCompra;
    protected JPanel jPanelParametrosReportesEstadoOrdenCompra;
	protected JPanel jPanelParametrosReportesAccionesEstadoOrdenCompra;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1EstadoOrdenCompra;
	protected JPanel jPanelParametrosAuxiliar2EstadoOrdenCompra;
	protected JPanel jPanelParametrosAuxiliar3EstadoOrdenCompra;
	protected JPanel jPanelParametrosAuxiliar4EstadoOrdenCompra;
	//protected JPanel jPanelParametrosAuxiliar5EstadoOrdenCompra;
	
	
	
	//protected JPanel jPanelReporteDinamicoEstadoOrdenCompra;
	//protected JPanel jPanelImportacionEstadoOrdenCompra;
	
	
	public JTable jTableDatosEstadoOrdenCompra;
	
	
	
	//public JTable jTableDatosEstadoOrdenCompraOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoEstadoOrdenCompra;
	protected JButton jButtonDuplicarEstadoOrdenCompra;
	protected JButton jButtonCopiarEstadoOrdenCompra;
	protected JButton jButtonVerFormEstadoOrdenCompra;
	protected JButton jButtonNuevoRelacionesEstadoOrdenCompra;
	protected JButton jButtonModificarEstadoOrdenCompra;
	
    protected JButton jButtonGuardarCambiosTablaEstadoOrdenCompra;
	protected JButton jButtonCerrarEstadoOrdenCompra;
	
	
	protected JButton jButtonRecargarInformacionEstadoOrdenCompra;
	protected JButton jButtonProcesarInformacionEstadoOrdenCompra;
	
	
	protected JButton jButtonAnterioresEstadoOrdenCompra;
	protected JButton jButtonSiguientesEstadoOrdenCompra;
	protected JButton jButtonNuevoGuardarCambiosEstadoOrdenCompra;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoEstadoOrdenCompra;
	//protected JButton jButtonCerrarReporteDinamicoEstadoOrdenCompra;
	//protected JButton jButtonGenerarExcelReporteDinamicoEstadoOrdenCompra;	
	
	
	
	//protected JButton jButtonAbrirImportacionEstadoOrdenCompra;
	//protected JButton jButtonGenerarImportacionEstadoOrdenCompra;
	//protected JButton jButtonCerrarImportacionEstadoOrdenCompra;
	//protected JFileChooser jFileChooserImportacionEstadoOrdenCompra;
	//protected File fileImportacionEstadoOrdenCompra;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarEstadoOrdenCompra;
	protected JButton jButtonDuplicarToolBarEstadoOrdenCompra;
	protected JButton jButtonNuevoRelacionesToolBarEstadoOrdenCompra;
	
	
	public JButton jButtonGuardarCambiosToolBarEstadoOrdenCompra;
	protected JButton jButtonCopiarToolBarEstadoOrdenCompra;
	protected JButton jButtonVerFormToolBarEstadoOrdenCompra;
	public JButton jButtonGuardarCambiosTablaToolBarEstadoOrdenCompra;
	protected JButton jButtonMostrarOcultarTablaToolBarEstadoOrdenCompra;
	protected JButton jButtonCerrarToolBarEstadoOrdenCompra;
	
	protected JButton jButtonRecargarInformacionToolBarEstadoOrdenCompra;
	protected JButton jButtonProcesarInformacionToolBarEstadoOrdenCompra;
	protected JButton jButtonAnterioresToolBarEstadoOrdenCompra;
	protected JButton jButtonSiguientesToolBarEstadoOrdenCompra;
	protected JButton jButtonNuevoGuardarCambiosToolBarEstadoOrdenCompra;
	protected JButton jButtonAbrirOrderByToolBarEstadoOrdenCompra;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoEstadoOrdenCompra;
	protected JMenuItem jMenuItemDuplicarEstadoOrdenCompra;
	protected JMenuItem jMenuItemNuevoRelacionesEstadoOrdenCompra;
	
	
	protected JMenuItem jMenuItemGuardarCambiosEstadoOrdenCompra;
	protected JMenuItem jMenuItemCopiarEstadoOrdenCompra;
	protected JMenuItem jMenuItemVerFormEstadoOrdenCompra;
	protected JMenuItem jMenuItemGuardarCambiosTablaEstadoOrdenCompra;
	protected JMenuItem jMenuItemCerrarEstadoOrdenCompra;
	protected JMenuItem jMenuItemDetalleCerrarEstadoOrdenCompra;
	protected JMenuItem jMenuItemDetalleAbrirOrderByEstadoOrdenCompra;
	protected JMenuItem jMenuItemDetalleMostarOcultarEstadoOrdenCompra;
	
	protected JMenuItem jMenuItemRecargarInformacionEstadoOrdenCompra;
	protected JMenuItem jMenuItemProcesarInformacionEstadoOrdenCompra;
	protected JMenuItem jMenuItemAnterioresEstadoOrdenCompra;
	protected JMenuItem jMenuItemSiguientesEstadoOrdenCompra;
	protected JMenuItem jMenuItemNuevoGuardarCambiosEstadoOrdenCompra;
	protected JMenuItem jMenuItemAbrirOrderByEstadoOrdenCompra;
	protected JMenuItem jMenuItemMostrarOcultarEstadoOrdenCompra;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesEstadoOrdenCompra;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosEstadoOrdenCompra;
	protected JCheckBox jCheckBoxSeleccionadosEstadoOrdenCompra;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaEstadoOrdenCompra;
	protected JCheckBox jCheckBoxConGraficoReporteEstadoOrdenCompra;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesEstadoOrdenCompra;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesEstadoOrdenCompra;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoEstadoOrdenCompra;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoEstadoOrdenCompra;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesEstadoOrdenCompra;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionEstadoOrdenCompra;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesEstadoOrdenCompra;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesEstadoOrdenCompra;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarEstadoOrdenCompra;
	protected JTextField jTextFieldValorCampoGeneralEstadoOrdenCompra;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteEstadoOrdenCompra;
	//public JList<Reporte> jListColumnasSelectReporteEstadoOrdenCompra;
	//public JScrollPane jScrollColumnasSelectReporteEstadoOrdenCompra;
	
	//public JLabel jLabelRelacionesSelectReporteEstadoOrdenCompra;
	//public JList<Reporte> jListRelacionesSelectReporteEstadoOrdenCompra;
	//public JScrollPane jScrollRelacionesSelectReporteEstadoOrdenCompra;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoEstadoOrdenCompra;
	//protected JCheckBox jCheckBoxConGraficoDinamicoEstadoOrdenCompra;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoEstadoOrdenCompra;
	//public JLabel jLabelTiposArchivoReporteDinamicoEstadoOrdenCompra;
	
		
	//public JLabel jLabelArchivoImportacionEstadoOrdenCompra;	
	//public JLabel jLabelPathArchivoImportacionEstadoOrdenCompra;
	//protected JTextField jTextFieldPathArchivoImportacionEstadoOrdenCompra;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoEstadoOrdenCompra;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoEstadoOrdenCompra;
	
	//public JLabel jLabelColumnaCategoriaValorEstadoOrdenCompra;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorEstadoOrdenCompra;
	
	//public JLabel jLabelColumnasValoresGraficoEstadoOrdenCompra;
	//public JList<Reporte> jListColumnasValoresGraficoEstadoOrdenCompra;
	//public JScrollPane jScrollColumnasValoresGraficoEstadoOrdenCompra;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoEstadoOrdenCompra;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoEstadoOrdenCompra;	
	
	
	
	
	
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
	public EstadoOrdenCompraJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("EstadoOrdenCompra No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoOrdenCompraJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EstadoOrdenCompra No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoOrdenCompraJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EstadoOrdenCompra No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoOrdenCompraJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("EstadoOrdenCompra No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionEstadoOrdenCompra)	{
		this.jButtonRecargarInformacionEstadoOrdenCompra = jButtonRecargarInformacionEstadoOrdenCompra;
	}
	
	public JButton getjButtonProcesarInformacionEstadoOrdenCompra() {
		return this.jButtonProcesarInformacionEstadoOrdenCompra;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionEstadoOrdenCompra)	{
		this.jButtonProcesarInformacionEstadoOrdenCompra = jButtonProcesarInformacionEstadoOrdenCompra;
	}
	
	
	public JButton getjButtonRecargarInformacionEstadoOrdenCompra() {
		return this.jButtonRecargarInformacionEstadoOrdenCompra;
	}
	
	
	public List<EstadoOrdenCompra> getestadoordencompras() {
		return this.estadoordencompras;
	}

	public void setestadoordencompras(List<EstadoOrdenCompra> estadoordencompras) {
		this.estadoordencompras = estadoordencompras;
	}
	
	public List<EstadoOrdenCompra> getestadoordencomprasAux() {
		return this.estadoordencomprasAux;
	}

	public void setestadoordencomprasAux(List<EstadoOrdenCompra> estadoordencomprasAux) {
		this.estadoordencomprasAux = estadoordencomprasAux;
	}
	
	public List<EstadoOrdenCompra> getestadoordencomprasEliminados() {
		return this.estadoordencomprasEliminados;
	}

	public void setEstadoOrdenComprasEliminados(List<EstadoOrdenCompra> estadoordencomprasEliminados) {
		this.estadoordencomprasEliminados = estadoordencomprasEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarEstadoOrdenCompra() {
		return jComboBoxTiposSeleccionarEstadoOrdenCompra;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarEstadoOrdenCompra(
			JComboBox jComboBoxTiposSeleccionarEstadoOrdenCompra) {
		this.jComboBoxTiposSeleccionarEstadoOrdenCompra = jComboBoxTiposSeleccionarEstadoOrdenCompra;
	}
	
	public void setBorderResaltarTiposSeleccionarEstadoOrdenCompra() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarEstadoOrdenCompra.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarEstadoOrdenCompra .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralEstadoOrdenCompra() {
		return jTextFieldValorCampoGeneralEstadoOrdenCompra;
	}

	public void setjTextFieldValorCampoGeneralEstadoOrdenCompra(
			JTextField jTextFieldValorCampoGeneralEstadoOrdenCompra) {
		this.jTextFieldValorCampoGeneralEstadoOrdenCompra = jTextFieldValorCampoGeneralEstadoOrdenCompra;
	}

	public void setBorderResaltarValorCampoGeneralEstadoOrdenCompra() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoOrdenCompra.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralEstadoOrdenCompra .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosEstadoOrdenCompra() {
		return this.jCheckBoxSeleccionarTodosEstadoOrdenCompra;
	}

	public void setjCheckBoxSeleccionarTodosEstadoOrdenCompra(
			JCheckBox jCheckBoxSeleccionarTodosEstadoOrdenCompra) {
		this.jCheckBoxSeleccionarTodosEstadoOrdenCompra = jCheckBoxSeleccionarTodosEstadoOrdenCompra;
	}

	public void setBorderResaltarSeleccionarTodosEstadoOrdenCompra() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoOrdenCompra.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosEstadoOrdenCompra .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosEstadoOrdenCompra() {
		return this.jCheckBoxSeleccionadosEstadoOrdenCompra;
	}

	public void setjCheckBoxSeleccionadosEstadoOrdenCompra(
			JCheckBox jCheckBoxSeleccionadosEstadoOrdenCompra) {
		this.jCheckBoxSeleccionadosEstadoOrdenCompra = jCheckBoxSeleccionadosEstadoOrdenCompra;
	}
	
	public void setBorderResaltarSeleccionadosEstadoOrdenCompra() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoOrdenCompra.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosEstadoOrdenCompra .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesEstadoOrdenCompra() {
		return this.jComboBoxTiposArchivosReportesEstadoOrdenCompra;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesEstadoOrdenCompra(
			JComboBox jComboBoxTiposArchivosReportesEstadoOrdenCompra) {
		this.jComboBoxTiposArchivosReportesEstadoOrdenCompra = jComboBoxTiposArchivosReportesEstadoOrdenCompra;
	}

	public void setBorderResaltarTiposArchivosReportesEstadoOrdenCompra() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoOrdenCompra.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesEstadoOrdenCompra .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesEstadoOrdenCompra() {
		return this.jComboBoxTiposReportesEstadoOrdenCompra;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesEstadoOrdenCompra(
			JComboBox jComboBoxTiposReportesEstadoOrdenCompra) {
		this.jComboBoxTiposReportesEstadoOrdenCompra = jComboBoxTiposReportesEstadoOrdenCompra;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoEstadoOrdenCompra() {
	//	return jComboBoxTiposReportesDinamicoEstadoOrdenCompra;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoEstadoOrdenCompra(
	//		JComboBox jComboBoxTiposReportesDinamicoEstadoOrdenCompra) {
	//	this.jComboBoxTiposReportesDinamicoEstadoOrdenCompra = jComboBoxTiposReportesDinamicoEstadoOrdenCompra;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoEstadoOrdenCompra() {
	//	return jComboBoxTiposArchivosReportesDinamicoEstadoOrdenCompra;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoEstadoOrdenCompra(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoEstadoOrdenCompra) {
	//	this.jComboBoxTiposArchivosReportesDinamicoEstadoOrdenCompra = jComboBoxTiposArchivosReportesDinamicoEstadoOrdenCompra;
	//}
	
	public void setBorderResaltarTiposReportesEstadoOrdenCompra() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoOrdenCompra.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesEstadoOrdenCompra .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesEstadoOrdenCompra() {
		return this.jComboBoxTiposGraficosReportesEstadoOrdenCompra;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesEstadoOrdenCompra(
			JComboBox jComboBoxTiposGraficosReportesEstadoOrdenCompra) {
		this.jComboBoxTiposGraficosReportesEstadoOrdenCompra = jComboBoxTiposGraficosReportesEstadoOrdenCompra;
	}
	
	public void setBorderResaltarTiposGraficosReportesEstadoOrdenCompra() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoOrdenCompra.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesEstadoOrdenCompra .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionEstadoOrdenCompra() {
		return this.jComboBoxTiposPaginacionEstadoOrdenCompra;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionEstadoOrdenCompra(
			JComboBox jComboBoxTiposPaginacionEstadoOrdenCompra) {
		this.jComboBoxTiposPaginacionEstadoOrdenCompra = jComboBoxTiposPaginacionEstadoOrdenCompra;
	}
	
	public void setBorderResaltarTiposPaginacionEstadoOrdenCompra() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoOrdenCompra.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionEstadoOrdenCompra .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesEstadoOrdenCompra() {
		return this.jComboBoxTiposRelacionesEstadoOrdenCompra;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesEstadoOrdenCompra() {
		return this.jComboBoxTiposAccionesEstadoOrdenCompra;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesEstadoOrdenCompra(
			JComboBox jComboBoxTiposRelacionesEstadoOrdenCompra) {
		this.jComboBoxTiposRelacionesEstadoOrdenCompra = jComboBoxTiposRelacionesEstadoOrdenCompra;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesEstadoOrdenCompra(
			JComboBox jComboBoxTiposAccionesEstadoOrdenCompra) {
		this.jComboBoxTiposAccionesEstadoOrdenCompra = jComboBoxTiposAccionesEstadoOrdenCompra;
	}
	
	public void setBorderResaltarTiposRelacionesEstadoOrdenCompra() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoOrdenCompra.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesEstadoOrdenCompra .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesEstadoOrdenCompra() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoOrdenCompra.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesEstadoOrdenCompra .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoEstadoOrdenCompra() {
	//	return jCheckBoxConGraficoDinamicoEstadoOrdenCompra;
	//}

	//public void setjCheckBoxConGraficoDinamicoEstadoOrdenCompra(
	//		JCheckBox jCheckBoxConGraficoDinamicoEstadoOrdenCompra) {
	//	this.jCheckBoxConGraficoDinamicoEstadoOrdenCompra = jCheckBoxConGraficoDinamicoEstadoOrdenCompra;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoEstadoOrdenCompra() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarEstadoOrdenCompra.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoEstadoOrdenCompra .setBorder(borderResaltar);		
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
		this.estadoordencompraSessionBean=new EstadoOrdenCompraSessionBean();
		
		this.estadoordencompraSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.estadoordencompraSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.estadoordencompraSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=EstadoOrdenCompraJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=EstadoOrdenCompraJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		EstadoOrdenCompraJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		EstadoOrdenCompraJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		EstadoOrdenCompraJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Estado Orden Compra MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 910) {
			iHeight=910;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.estadoordencompraSessionBean.getEsGuardarRelacionado()) {
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
		
		EstadoOrdenCompraJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("EstadoOrdenCompra No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarEstadoOrdenCompra= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarEstadoOrdenCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarEstadoOrdenCompra,this.jTtoolBarEstadoOrdenCompra,
							"nuevo","nuevo","Nuevo"+" "+EstadoOrdenCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarEstadoOrdenCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarEstadoOrdenCompra,this.jTtoolBarEstadoOrdenCompra,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarEstadoOrdenCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarEstadoOrdenCompra,this.jTtoolBarEstadoOrdenCompra,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+EstadoOrdenCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarEstadoOrdenCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarEstadoOrdenCompra,this.jTtoolBarEstadoOrdenCompra,
							"duplicar","duplicar","Duplicar"+" "+EstadoOrdenCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarEstadoOrdenCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarEstadoOrdenCompra,this.jTtoolBarEstadoOrdenCompra,
							"copiar","copiar","Copiar"+" "+EstadoOrdenCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarEstadoOrdenCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarEstadoOrdenCompra,this.jTtoolBarEstadoOrdenCompra,
							"ver_form","ver_form","Ver"+" "+EstadoOrdenCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarEstadoOrdenCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEstadoOrdenCompra,this.jTtoolBarEstadoOrdenCompra,
							"recargar","recargar","Recargar"+" "+EstadoOrdenCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarEstadoOrdenCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEstadoOrdenCompra,this.jTtoolBarEstadoOrdenCompra,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarEstadoOrdenCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEstadoOrdenCompra,this.jTtoolBarEstadoOrdenCompra,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarEstadoOrdenCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarEstadoOrdenCompra,this.jTtoolBarEstadoOrdenCompra,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarEstadoOrdenCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarEstadoOrdenCompra,this.jTtoolBarEstadoOrdenCompra,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarEstadoOrdenCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarEstadoOrdenCompra,this.jTtoolBarEstadoOrdenCompra,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+EstadoOrdenCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarEstadoOrdenCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarEstadoOrdenCompra,this.jTtoolBarEstadoOrdenCompra,
							"cerrar","cerrar","Salir"+" "+EstadoOrdenCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarEstadoOrdenCompra=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarEstadoOrdenCompra;
			
				this.jButtonProcesarInformacionToolBarEstadoOrdenCompra=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarEstadoOrdenCompra;
				
		//protected JButton jButtonModificarToolBarEstadoOrdenCompra;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarEstadoOrdenCompra=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuEstadoOrdenCompra=new JMenuMe("General");
		this.jmenuArchivoEstadoOrdenCompra=new JMenuMe("Archivo");
		this.jmenuAccionesEstadoOrdenCompra=new JMenuMe("Acciones");
		this.jmenuDatosEstadoOrdenCompra=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoEstadoOrdenCompra= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoEstadoOrdenCompra.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoEstadoOrdenCompra,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoEstadoOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarEstadoOrdenCompra= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarEstadoOrdenCompra.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarEstadoOrdenCompra,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarEstadoOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesEstadoOrdenCompra= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesEstadoOrdenCompra.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesEstadoOrdenCompra,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesEstadoOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosEstadoOrdenCompra= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosEstadoOrdenCompra.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosEstadoOrdenCompra,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosEstadoOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarEstadoOrdenCompra= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarEstadoOrdenCompra.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarEstadoOrdenCompra,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarEstadoOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormEstadoOrdenCompra= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormEstadoOrdenCompra.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormEstadoOrdenCompra,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormEstadoOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaEstadoOrdenCompra= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaEstadoOrdenCompra.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaEstadoOrdenCompra,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaEstadoOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarEstadoOrdenCompra= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarEstadoOrdenCompra.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarEstadoOrdenCompra,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarEstadoOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionEstadoOrdenCompra= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionEstadoOrdenCompra.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionEstadoOrdenCompra,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionEstadoOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionEstadoOrdenCompra= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionEstadoOrdenCompra.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionEstadoOrdenCompra,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresEstadoOrdenCompra= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresEstadoOrdenCompra.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresEstadoOrdenCompra,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresEstadoOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesEstadoOrdenCompra= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesEstadoOrdenCompra.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesEstadoOrdenCompra,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesEstadoOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByEstadoOrdenCompra= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByEstadoOrdenCompra.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByEstadoOrdenCompra,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByEstadoOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarEstadoOrdenCompra= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarEstadoOrdenCompra.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarEstadoOrdenCompra,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarEstadoOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByEstadoOrdenCompra= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByEstadoOrdenCompra.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByEstadoOrdenCompra,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByEstadoOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarEstadoOrdenCompra= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarEstadoOrdenCompra.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarEstadoOrdenCompra,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarEstadoOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosEstadoOrdenCompra= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosEstadoOrdenCompra.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosEstadoOrdenCompra,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosEstadoOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoEstadoOrdenCompra.add(this.jMenuItemCerrarEstadoOrdenCompra);
			
			this.jmenuAccionesEstadoOrdenCompra.add(this.jMenuItemNuevoEstadoOrdenCompra);
			this.jmenuAccionesEstadoOrdenCompra.add(this.jMenuItemNuevoGuardarCambiosEstadoOrdenCompra);
			this.jmenuAccionesEstadoOrdenCompra.add(this.jMenuItemNuevoRelacionesEstadoOrdenCompra);
			this.jmenuAccionesEstadoOrdenCompra.add(this.jMenuItemGuardarCambiosTablaEstadoOrdenCompra);		
			this.jmenuAccionesEstadoOrdenCompra.add(this.jMenuItemDuplicarEstadoOrdenCompra);		
			this.jmenuAccionesEstadoOrdenCompra.add(this.jMenuItemCopiarEstadoOrdenCompra);		
			this.jmenuAccionesEstadoOrdenCompra.add(this.jMenuItemVerFormEstadoOrdenCompra);		
			
			this.jmenuDatosEstadoOrdenCompra.add(this.jMenuItemRecargarInformacionEstadoOrdenCompra);				
			this.jmenuDatosEstadoOrdenCompra.add(this.jMenuItemAnterioresEstadoOrdenCompra);				
			this.jmenuDatosEstadoOrdenCompra.add(this.jMenuItemSiguientesEstadoOrdenCompra);				
			this.jmenuDatosEstadoOrdenCompra.add(this.jMenuItemAbrirOrderByEstadoOrdenCompra);				
			this.jmenuDatosEstadoOrdenCompra.add(this.jMenuItemMostrarOcultarEstadoOrdenCompra);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesEstadoOrdenCompra.add(this.jMenuItemGuardarCambiosEstadoOrdenCompra);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoEstadoOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesEstadoOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosEstadoOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarEstadoOrdenCompra.add(this.jmenuArchivoEstadoOrdenCompra);		
			this.jmenuBarEstadoOrdenCompra.add(this.jmenuAccionesEstadoOrdenCompra);		
			this.jmenuBarEstadoOrdenCompra.add(this.jmenuDatosEstadoOrdenCompra);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarEstadoOrdenCompra);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasEstadoOrdenCompra() {
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
			//this.jInternalFrameDetalleEstadoOrdenCompra = new EstadoOrdenCompraDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Estado Orden Compra DATOS");
			this.jInternalFrameDetalleFormEstadoOrdenCompra = new EstadoOrdenCompraDetalleFormJInternalFrame(jDesktopPane,this.estadoordencompraSessionBean.getConGuardarRelaciones(),this.estadoordencompraSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormEstadoOrdenCompra = null;//new EstadoOrdenCompraDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutEstadoOrdenCompra= new GridBagLayout();
		
		
		this.jTableDatosEstadoOrdenCompra = new JTableMe();      
		
		String sToolTipEstadoOrdenCompra="";
		sToolTipEstadoOrdenCompra=EstadoOrdenCompraConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipEstadoOrdenCompra+="(Inventario.EstadoOrdenCompra)";
		}
		
		if(!this.estadoordencompraSessionBean.getEsGuardarRelacionado()) {
			sToolTipEstadoOrdenCompra+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosEstadoOrdenCompra.setToolTipText(sToolTipEstadoOrdenCompra);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosEstadoOrdenCompra);
		this.jTableDatosEstadoOrdenCompra.setAutoCreateRowSorter(true);
		this.jTableDatosEstadoOrdenCompra.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosEstadoOrdenCompra.setRowSelectionAllowed(true);
		this.jTableDatosEstadoOrdenCompra.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosEstadoOrdenCompra,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoEstadoOrdenCompra = new JButtonMe();
		this.jButtonDuplicarEstadoOrdenCompra = new JButtonMe();
		this.jButtonCopiarEstadoOrdenCompra = new JButtonMe();
		this.jButtonVerFormEstadoOrdenCompra = new JButtonMe();
		this.jButtonNuevoRelacionesEstadoOrdenCompra = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaEstadoOrdenCompra = new JButtonMe();
		this.jButtonCerrarEstadoOrdenCompra = new JButtonMe();
		
		this.jScrollPanelDatosEstadoOrdenCompra = new JScrollPane();   
        this.jScrollPanelDatosGeneralEstadoOrdenCompra = new JScrollPane();
		
				
		
		
		this.jPanelAccionesEstadoOrdenCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Estado Orden Compra";
		
		if(!this.estadoordencompraSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosEstadoOrdenCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Orden Compras" + this.sPath));
		} else {
			this.jScrollPanelDatosEstadoOrdenCompra.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralEstadoOrdenCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesEstadoOrdenCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesEstadoOrdenCompra.setToolTipText("Acciones");
        this.jPanelAccionesEstadoOrdenCompra.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralEstadoOrdenCompra, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEstadoOrdenCompra, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoEstadoOrdenCompra=new ReporteDinamicoJInternalFrame(EstadoOrdenCompraConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoEstadoOrdenCompra();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionEstadoOrdenCompra=new ImportacionJInternalFrame(EstadoOrdenCompraConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionEstadoOrdenCompra();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByEstadoOrdenCompra = new JButtonMe();
		
		this.jButtonAbrirOrderByEstadoOrdenCompra.setText("Orden");
		this.jButtonAbrirOrderByEstadoOrdenCompra.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByEstadoOrdenCompra,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByEstadoOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByEstadoOrdenCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByEstadoOrdenCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByEstadoOrdenCompra=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEstadoOrdenCompra,false,this);
			
			//this.cargarOrderByEstadoOrdenCompra(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByEstadoOrdenCompra=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEstadoOrdenCompra,true,this);
			
			//this.cargarOrderByEstadoOrdenCompra(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosEstadoOrdenCompra.setMinimumSize(new Dimension(400,50));//430
		this.jTableDatosEstadoOrdenCompra.setMaximumSize(new Dimension(400,50));//430
		this.jTableDatosEstadoOrdenCompra.setPreferredSize(new Dimension(400,50));//430
		
		this.jScrollPanelDatosEstadoOrdenCompra.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosEstadoOrdenCompra.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosEstadoOrdenCompra.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoEstadoOrdenCompra.setText("Nuevo");
		this.jButtonDuplicarEstadoOrdenCompra.setText("Duplicar");
		this.jButtonCopiarEstadoOrdenCompra.setText("Copiar");
		this.jButtonVerFormEstadoOrdenCompra.setText("Ver");
		this.jButtonNuevoRelacionesEstadoOrdenCompra.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaEstadoOrdenCompra.setText("Guardar");
		this.jButtonCerrarEstadoOrdenCompra.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoEstadoOrdenCompra,"nuevo_button","Nuevo",this.estadoordencompraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarEstadoOrdenCompra,"duplicar_button","Duplicar",this.estadoordencompraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarEstadoOrdenCompra,"copiar_button","Copiar",this.estadoordencompraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormEstadoOrdenCompra,"ver_form","Ver",this.estadoordencompraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesEstadoOrdenCompra,"nuevorelaciones_button","Nuevo Rel",this.estadoordencompraSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaEstadoOrdenCompra,"guardarcambiostabla_button","Guardar",this.estadoordencompraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarEstadoOrdenCompra,"cerrar_button","Salir",this.estadoordencompraSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoEstadoOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarEstadoOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarEstadoOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormEstadoOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesEstadoOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaEstadoOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarEstadoOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoEstadoOrdenCompra.setToolTipText("Nuevo"+" "+EstadoOrdenCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarEstadoOrdenCompra.setToolTipText("Duplicar"+" "+EstadoOrdenCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarEstadoOrdenCompra.setToolTipText("Copiar"+" "+EstadoOrdenCompraConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormEstadoOrdenCompra.setToolTipText("Ver"+" "+EstadoOrdenCompraConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesEstadoOrdenCompra.setToolTipText("Nuevo Rel"+" "+EstadoOrdenCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaEstadoOrdenCompra.setToolTipText("Guardar"+" "+EstadoOrdenCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarEstadoOrdenCompra.setToolTipText("Salir"+" "+EstadoOrdenCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoEstadoOrdenCompra";
		inputMap = this.jButtonNuevoEstadoOrdenCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoEstadoOrdenCompra.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoEstadoOrdenCompra"));
		
		//DUPLICAR
		sMapKey = "DuplicarEstadoOrdenCompra";
		inputMap = this.jButtonDuplicarEstadoOrdenCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarEstadoOrdenCompra.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarEstadoOrdenCompra"));
		
		//COPIAR
		sMapKey = "CopiarEstadoOrdenCompra";
		inputMap = this.jButtonCopiarEstadoOrdenCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarEstadoOrdenCompra.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarEstadoOrdenCompra"));
		
		//VEr FORM
		sMapKey = "VerFormEstadoOrdenCompra";
		inputMap = this.jButtonVerFormEstadoOrdenCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormEstadoOrdenCompra.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormEstadoOrdenCompra"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesEstadoOrdenCompra";
		inputMap = this.jButtonNuevoRelacionesEstadoOrdenCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesEstadoOrdenCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesEstadoOrdenCompra"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarEstadoOrdenCompra";
		inputMap = this.jButtonModificarEstadoOrdenCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarEstadoOrdenCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarEstadoOrdenCompra"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarEstadoOrdenCompra";
		inputMap = this.jButtonCerrarEstadoOrdenCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarEstadoOrdenCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarEstadoOrdenCompra"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaEstadoOrdenCompra";
		inputMap = this.jButtonGuardarCambiosTablaEstadoOrdenCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaEstadoOrdenCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaEstadoOrdenCompra"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesEstadoOrdenCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesEstadoOrdenCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionEstadoOrdenCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1EstadoOrdenCompra= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2EstadoOrdenCompra= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3EstadoOrdenCompra= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4EstadoOrdenCompra= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5EstadoOrdenCompra= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesEstadoOrdenCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesEstadoOrdenCompra.setName("jPanelParametrosReportesEstadoOrdenCompra"); 
		
		this.jPanelParametrosReportesAccionesEstadoOrdenCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesEstadoOrdenCompra.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesEstadoOrdenCompra.setName("jPanelParametrosReportesAccionesEstadoOrdenCompra"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesEstadoOrdenCompra, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesEstadoOrdenCompra, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionEstadoOrdenCompra = new JButtonMe();
		this.jButtonRecargarInformacionEstadoOrdenCompra.setText("Recargar");
		this.jButtonRecargarInformacionEstadoOrdenCompra.setToolTipText("Recargar"+" "+EstadoOrdenCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionEstadoOrdenCompra,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionEstadoOrdenCompra = new JButtonMe();
		this.jButtonProcesarInformacionEstadoOrdenCompra.setText("Procesar");
		this.jButtonProcesarInformacionEstadoOrdenCompra.setToolTipText("Procesar"+" "+EstadoOrdenCompraConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionEstadoOrdenCompra.setVisible(false);
			
		this.jButtonProcesarInformacionEstadoOrdenCompra.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionEstadoOrdenCompra.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionEstadoOrdenCompra.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesEstadoOrdenCompra = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEstadoOrdenCompra.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesEstadoOrdenCompra.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesEstadoOrdenCompra = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEstadoOrdenCompra.setText("TIPO");       
		this.jComboBoxTiposReportesEstadoOrdenCompra.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesEstadoOrdenCompra = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEstadoOrdenCompra.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesEstadoOrdenCompra.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionEstadoOrdenCompra = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionEstadoOrdenCompra.setText("Paginacion");
		this.jComboBoxTiposPaginacionEstadoOrdenCompra.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesEstadoOrdenCompra = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesEstadoOrdenCompra.setText("Accion");
		this.jComboBoxTiposRelacionesEstadoOrdenCompra.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesEstadoOrdenCompra = new JComboBoxMe();
		//this.jComboBoxTiposAccionesEstadoOrdenCompra.setText("Accion");
		this.jComboBoxTiposAccionesEstadoOrdenCompra.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarEstadoOrdenCompra = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarEstadoOrdenCompra.setText("Accion");
		this.jComboBoxTiposSeleccionarEstadoOrdenCompra.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralEstadoOrdenCompra=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralEstadoOrdenCompra.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralEstadoOrdenCompra.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralEstadoOrdenCompra.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesEstadoOrdenCompra = new JLabelMe();
		
		this.jLabelAccionesEstadoOrdenCompra.setText("Acciones");		
		this.jLabelAccionesEstadoOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEstadoOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEstadoOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosEstadoOrdenCompra = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosEstadoOrdenCompra.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosEstadoOrdenCompra.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosEstadoOrdenCompra = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosEstadoOrdenCompra.setText("Seleccionados");
		this.jCheckBoxSeleccionadosEstadoOrdenCompra.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaEstadoOrdenCompra = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaEstadoOrdenCompra.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaEstadoOrdenCompra.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteEstadoOrdenCompra = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteEstadoOrdenCompra.setText("Graf.");
		this.jCheckBoxConGraficoReporteEstadoOrdenCompra.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresEstadoOrdenCompra = new JButtonMe();
		//this.jButtonAnterioresEstadoOrdenCompra.setText("<<");
        this.jButtonAnterioresEstadoOrdenCompra.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresEstadoOrdenCompra,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresEstadoOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesEstadoOrdenCompra = new JButtonMe();
		//this.jButtonSiguientesEstadoOrdenCompra.setText(">>");
        this.jButtonSiguientesEstadoOrdenCompra.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesEstadoOrdenCompra,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesEstadoOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosEstadoOrdenCompra = new JButtonMe();
		this.jButtonNuevoGuardarCambiosEstadoOrdenCompra.setText("Nue");
        this.jButtonNuevoGuardarCambiosEstadoOrdenCompra.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosEstadoOrdenCompra,"nuevoguardarcambios_button","Nue",this.estadoordencompraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosEstadoOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosEstadoOrdenCompra";
		inputMap = this.jButtonNuevoGuardarCambiosEstadoOrdenCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosEstadoOrdenCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosEstadoOrdenCompra"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionEstadoOrdenCompra";
		inputMap = this.jButtonRecargarInformacionEstadoOrdenCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionEstadoOrdenCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionEstadoOrdenCompra"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesEstadoOrdenCompra";
		inputMap = this.jButtonSiguientesEstadoOrdenCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesEstadoOrdenCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesEstadoOrdenCompra"));
		
		//ANTERIORES		
		sMapKey = "AnterioresEstadoOrdenCompra";
		inputMap = this.jButtonAnterioresEstadoOrdenCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresEstadoOrdenCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresEstadoOrdenCompra"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasEstadoOrdenCompra();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesEstadoOrdenCompra.setMinimumSize(new Dimension(this.getWidth(),EstadoOrdenCompraBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EstadoOrdenCompraBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesEstadoOrdenCompra.setMaximumSize(new Dimension(this.getWidth(),EstadoOrdenCompraBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EstadoOrdenCompraBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesEstadoOrdenCompra.setPreferredSize(new Dimension(this.getWidth(),EstadoOrdenCompraBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EstadoOrdenCompraBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionEstadoOrdenCompra = new GridBagLayout();

			this.jPanelPaginacionEstadoOrdenCompra.setLayout(gridaBagLayoutPaginacionEstadoOrdenCompra);						
			
			this.gridBagConstraintsEstadoOrdenCompra = new GridBagConstraints();
			this.gridBagConstraintsEstadoOrdenCompra.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsEstadoOrdenCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoOrdenCompra.gridy = 0;
			this.gridBagConstraintsEstadoOrdenCompra.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionEstadoOrdenCompra.add(this.jButtonAnterioresEstadoOrdenCompra, this.gridBagConstraintsEstadoOrdenCompra);
					
						
			this.gridBagConstraintsEstadoOrdenCompra = new GridBagConstraints();
			this.gridBagConstraintsEstadoOrdenCompra.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsEstadoOrdenCompra.gridy = 0;
			
			this.jPanelPaginacionEstadoOrdenCompra.add(this.jButtonNuevoGuardarCambiosEstadoOrdenCompra, this.gridBagConstraintsEstadoOrdenCompra);
						
			
			this.gridBagConstraintsEstadoOrdenCompra = new GridBagConstraints();
			this.gridBagConstraintsEstadoOrdenCompra.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsEstadoOrdenCompra.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsEstadoOrdenCompra.gridy = 0;
			this.jPanelPaginacionEstadoOrdenCompra.add(this.jButtonSiguientesEstadoOrdenCompra, this.gridBagConstraintsEstadoOrdenCompra);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsEstadoOrdenCompra = new GridBagConstraints();
			this.gridBagConstraintsEstadoOrdenCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoOrdenCompra.gridy = 1;
			this.gridBagConstraintsEstadoOrdenCompra.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEstadoOrdenCompra.add(this.jButtonNuevoEstadoOrdenCompra, this.gridBagConstraintsEstadoOrdenCompra);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsEstadoOrdenCompra = new GridBagConstraints();
				this.gridBagConstraintsEstadoOrdenCompra.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsEstadoOrdenCompra.gridy = 1;
				this.gridBagConstraintsEstadoOrdenCompra.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionEstadoOrdenCompra.add(this.jButtonNuevoRelacionesEstadoOrdenCompra, this.gridBagConstraintsEstadoOrdenCompra);
			}
			
			
			if(!this.estadoordencompraSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsEstadoOrdenCompra = new GridBagConstraints();
				this.gridBagConstraintsEstadoOrdenCompra.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsEstadoOrdenCompra.gridy = 1;
				this.gridBagConstraintsEstadoOrdenCompra.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionEstadoOrdenCompra.add(this.jButtonGuardarCambiosTablaEstadoOrdenCompra, this.gridBagConstraintsEstadoOrdenCompra);
			}
			
			
			
			this.gridBagConstraintsEstadoOrdenCompra = new GridBagConstraints();
			this.gridBagConstraintsEstadoOrdenCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoOrdenCompra.gridy = 1;
			this.gridBagConstraintsEstadoOrdenCompra.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEstadoOrdenCompra.add(this.jButtonDuplicarEstadoOrdenCompra, this.gridBagConstraintsEstadoOrdenCompra);
			
			this.gridBagConstraintsEstadoOrdenCompra = new GridBagConstraints();
			this.gridBagConstraintsEstadoOrdenCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoOrdenCompra.gridy = 1;
			this.gridBagConstraintsEstadoOrdenCompra.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEstadoOrdenCompra.add(this.jButtonCopiarEstadoOrdenCompra, this.gridBagConstraintsEstadoOrdenCompra);
		
			this.gridBagConstraintsEstadoOrdenCompra = new GridBagConstraints();
			this.gridBagConstraintsEstadoOrdenCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoOrdenCompra.gridy = 1;
			this.gridBagConstraintsEstadoOrdenCompra.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEstadoOrdenCompra.add(this.jButtonVerFormEstadoOrdenCompra, this.gridBagConstraintsEstadoOrdenCompra);
		
			this.gridBagConstraintsEstadoOrdenCompra = new GridBagConstraints();
			this.gridBagConstraintsEstadoOrdenCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoOrdenCompra.gridy = 1;
			this.gridBagConstraintsEstadoOrdenCompra.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionEstadoOrdenCompra.add(this.jButtonCerrarEstadoOrdenCompra, this.gridBagConstraintsEstadoOrdenCompra);
		
		
		
		this.jButtonRecargarInformacionEstadoOrdenCompra.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionEstadoOrdenCompra.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionEstadoOrdenCompra.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionEstadoOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesEstadoOrdenCompra.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesEstadoOrdenCompra.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesEstadoOrdenCompra.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesEstadoOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesEstadoOrdenCompra.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesEstadoOrdenCompra.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesEstadoOrdenCompra.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesEstadoOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesEstadoOrdenCompra.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesEstadoOrdenCompra.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesEstadoOrdenCompra.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesEstadoOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionEstadoOrdenCompra.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionEstadoOrdenCompra.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionEstadoOrdenCompra.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionEstadoOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesEstadoOrdenCompra.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesEstadoOrdenCompra.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesEstadoOrdenCompra.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesEstadoOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesEstadoOrdenCompra.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEstadoOrdenCompra.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEstadoOrdenCompra.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesEstadoOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarEstadoOrdenCompra.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarEstadoOrdenCompra.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarEstadoOrdenCompra.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarEstadoOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaEstadoOrdenCompra.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaEstadoOrdenCompra.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaEstadoOrdenCompra.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaEstadoOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteEstadoOrdenCompra.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteEstadoOrdenCompra.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteEstadoOrdenCompra.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteEstadoOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosEstadoOrdenCompra.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosEstadoOrdenCompra.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosEstadoOrdenCompra.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosEstadoOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosEstadoOrdenCompra.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosEstadoOrdenCompra.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosEstadoOrdenCompra.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosEstadoOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesEstadoOrdenCompra = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesEstadoOrdenCompra = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1EstadoOrdenCompra = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2EstadoOrdenCompra = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3EstadoOrdenCompra = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4EstadoOrdenCompra = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesEstadoOrdenCompra.setLayout(gridaBagParametrosReportesEstadoOrdenCompra);
			this.jPanelParametrosReportesAccionesEstadoOrdenCompra.setLayout(gridaBagParametrosReportesAccionesEstadoOrdenCompra);
			
			
			this.jPanelParametrosAuxiliar1EstadoOrdenCompra.setLayout(gridaBagParametrosAuxiliar1EstadoOrdenCompra);
			this.jPanelParametrosAuxiliar2EstadoOrdenCompra.setLayout(gridaBagParametrosAuxiliar2EstadoOrdenCompra);
			this.jPanelParametrosAuxiliar3EstadoOrdenCompra.setLayout(gridaBagParametrosAuxiliar3EstadoOrdenCompra);
			this.jPanelParametrosAuxiliar4EstadoOrdenCompra.setLayout(gridaBagParametrosAuxiliar4EstadoOrdenCompra);
			//this.jPanelParametrosAuxiliar5EstadoOrdenCompra.setLayout(gridaBagParametrosAuxiliar2EstadoOrdenCompra);			
			
			
			
			
			this.gridBagConstraintsEstadoOrdenCompra = new GridBagConstraints();
			this.gridBagConstraintsEstadoOrdenCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoOrdenCompra.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEstadoOrdenCompra.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstadoOrdenCompra.add(this.jButtonRecargarInformacionEstadoOrdenCompra, this.gridBagConstraintsEstadoOrdenCompra);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsEstadoOrdenCompra = new GridBagConstraints();
			this.gridBagConstraintsEstadoOrdenCompra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoOrdenCompra.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoOrdenCompra.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1EstadoOrdenCompra.add(this.jComboBoxTiposPaginacionEstadoOrdenCompra, this.gridBagConstraintsEstadoOrdenCompra);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsEstadoOrdenCompra = new GridBagConstraints();
			this.gridBagConstraintsEstadoOrdenCompra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoOrdenCompra.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoOrdenCompra.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1EstadoOrdenCompra.add(this.jCheckBoxConAltoMaximoTablaEstadoOrdenCompra, this.gridBagConstraintsEstadoOrdenCompra);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsEstadoOrdenCompra = new GridBagConstraints();
			this.gridBagConstraintsEstadoOrdenCompra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoOrdenCompra.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoOrdenCompra.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1EstadoOrdenCompra.add(this.jComboBoxTiposArchivosReportesEstadoOrdenCompra, this.gridBagConstraintsEstadoOrdenCompra);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsEstadoOrdenCompra = new GridBagConstraints();
			this.gridBagConstraintsEstadoOrdenCompra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoOrdenCompra.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoOrdenCompra.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoOrdenCompra.add(this.jPanelParametrosAuxiliar1EstadoOrdenCompra, this.gridBagConstraintsEstadoOrdenCompra);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsEstadoOrdenCompra = new GridBagConstraints();
			this.gridBagConstraintsEstadoOrdenCompra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoOrdenCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoOrdenCompra.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEstadoOrdenCompra.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4EstadoOrdenCompra.add(this.jComboBoxTiposReportesEstadoOrdenCompra, this.gridBagConstraintsEstadoOrdenCompra);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsEstadoOrdenCompra = new GridBagConstraints();
			this.gridBagConstraintsEstadoOrdenCompra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoOrdenCompra.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoOrdenCompra.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoOrdenCompra.add(this.jPanelParametrosAuxiliar4EstadoOrdenCompra, this.gridBagConstraintsEstadoOrdenCompra);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsEstadoOrdenCompra = new GridBagConstraints();
			this.gridBagConstraintsEstadoOrdenCompra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoOrdenCompra.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoOrdenCompra.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoOrdenCompra.add(this.jComboBoxTiposReportesEstadoOrdenCompra, this.gridBagConstraintsEstadoOrdenCompra);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsEstadoOrdenCompra = new GridBagConstraints();
			this.gridBagConstraintsEstadoOrdenCompra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoOrdenCompra.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoOrdenCompra.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEstadoOrdenCompra.add(this.jCheckBoxGenerarReporteEstadoOrdenCompra, this.gridBagConstraintsEstadoOrdenCompra);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsEstadoOrdenCompra = new GridBagConstraints();
			this.gridBagConstraintsEstadoOrdenCompra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoOrdenCompra.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoOrdenCompra.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoOrdenCompra.add(this.jPanelParametrosAuxiliar2EstadoOrdenCompra, this.gridBagConstraintsEstadoOrdenCompra);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsEstadoOrdenCompra = new GridBagConstraints();
			this.gridBagConstraintsEstadoOrdenCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoOrdenCompra.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEstadoOrdenCompra.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEstadoOrdenCompra.add(this.jLabelAccionesEstadoOrdenCompra, this.gridBagConstraintsEstadoOrdenCompra);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsEstadoOrdenCompra = new GridBagConstraints();
				this.gridBagConstraintsEstadoOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsEstadoOrdenCompra.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsEstadoOrdenCompra.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesEstadoOrdenCompra.add(this.jButtonAbrirOrderByEstadoOrdenCompra, this.gridBagConstraintsEstadoOrdenCompra);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsEstadoOrdenCompra = new GridBagConstraints();
			this.gridBagConstraintsEstadoOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsEstadoOrdenCompra.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoOrdenCompra.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstadoOrdenCompra.add(this.jComboBoxTiposSeleccionarEstadoOrdenCompra, this.gridBagConstraintsEstadoOrdenCompra);			
			
			
			/*
			this.gridBagConstraintsEstadoOrdenCompra = new GridBagConstraints();
			this.gridBagConstraintsEstadoOrdenCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoOrdenCompra.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEstadoOrdenCompra.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEstadoOrdenCompra.add(this.jCheckBoxSeleccionarTodosEstadoOrdenCompra, this.gridBagConstraintsEstadoOrdenCompra);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsEstadoOrdenCompra = new GridBagConstraints();
			this.gridBagConstraintsEstadoOrdenCompra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoOrdenCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoOrdenCompra.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEstadoOrdenCompra.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3EstadoOrdenCompra.add(this.jCheckBoxSeleccionarTodosEstadoOrdenCompra, this.gridBagConstraintsEstadoOrdenCompra);															
				
			this.gridBagConstraintsEstadoOrdenCompra = new GridBagConstraints();
			this.gridBagConstraintsEstadoOrdenCompra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoOrdenCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoOrdenCompra.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEstadoOrdenCompra.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3EstadoOrdenCompra.add(this.jCheckBoxSeleccionadosEstadoOrdenCompra, this.gridBagConstraintsEstadoOrdenCompra);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsEstadoOrdenCompra = new GridBagConstraints();
			this.gridBagConstraintsEstadoOrdenCompra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoOrdenCompra.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoOrdenCompra.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoOrdenCompra.add(this.jPanelParametrosAuxiliar3EstadoOrdenCompra, this.gridBagConstraintsEstadoOrdenCompra);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsEstadoOrdenCompra = new GridBagConstraints();
			this.gridBagConstraintsEstadoOrdenCompra.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoOrdenCompra.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstadoOrdenCompra.add(this.jComboBoxTiposRelacionesEstadoOrdenCompra, this.gridBagConstraintsEstadoOrdenCompra);
				
			this.gridBagConstraintsEstadoOrdenCompra = new GridBagConstraints();
			this.gridBagConstraintsEstadoOrdenCompra.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoOrdenCompra.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstadoOrdenCompra.add(this.jComboBoxTiposAccionesEstadoOrdenCompra, this.gridBagConstraintsEstadoOrdenCompra);
	
				
			this.gridBagConstraintsEstadoOrdenCompra = new GridBagConstraints();
			this.gridBagConstraintsEstadoOrdenCompra.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoOrdenCompra.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstadoOrdenCompra.add(this.jTextFieldValorCampoGeneralEstadoOrdenCompra, this.gridBagConstraintsEstadoOrdenCompra);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosEstadoOrdenCompra = new GridBagLayout();

			this.jScrollPanelDatosEstadoOrdenCompra.setLayout(gridaBagLayoutDatosEstadoOrdenCompra);
			
			this.gridBagConstraintsEstadoOrdenCompra = new GridBagConstraints();
			this.gridBagConstraintsEstadoOrdenCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoOrdenCompra.gridy = 0;
			this.gridBagConstraintsEstadoOrdenCompra.gridx = 0;
			
			this.jScrollPanelDatosEstadoOrdenCompra.add(this.jTableDatosEstadoOrdenCompra, this.gridBagConstraintsEstadoOrdenCompra);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosEstadoOrdenCompra.setViewportView(this.jTableDatosEstadoOrdenCompra);
		this.jTableDatosEstadoOrdenCompra.setFillsViewportHeight(true);
		this.jTableDatosEstadoOrdenCompra.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesEstadoOrdenCompra= new GridBagLayout();
		this.jPanelAccionesEstadoOrdenCompra.setLayout(gridaBagLayoutAccionesEstadoOrdenCompra);
		
		
		/*	
		this.gridBagConstraintsEstadoOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsEstadoOrdenCompra.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoOrdenCompra.gridy = 0;
		this.gridBagConstraintsEstadoOrdenCompra.gridx = 0;
			
		this.jPanelAccionesEstadoOrdenCompra.add(this.jButtonNuevoEstadoOrdenCompra, this.gridBagConstraintsEstadoOrdenCompra);
		*/
		int iPosXAccion=0;
		
						
		
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutEstadoOrdenCompra = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutEstadoOrdenCompra);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.estadoordencompraSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsEstadoOrdenCompra = new GridBagConstraints();						
			this.gridBagConstraintsEstadoOrdenCompra.gridy = iGridyPrincipal++;
			this.gridBagConstraintsEstadoOrdenCompra.gridx = 0;		
			//this.gridBagConstraintsEstadoOrdenCompra.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoOrdenCompra.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsEstadoOrdenCompra.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarEstadoOrdenCompra, this.gridBagConstraintsEstadoOrdenCompra);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsEstadoOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsEstadoOrdenCompra.gridy = iGridyPrincipal++;
		this.gridBagConstraintsEstadoOrdenCompra.gridx = 0;		
		//this.gridBagConstraintsEstadoOrdenCompra.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoOrdenCompra.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsEstadoOrdenCompra.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsEstadoOrdenCompra);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsEstadoOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsEstadoOrdenCompra.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoOrdenCompra.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesEstadoOrdenCompra, this.gridBagConstraintsEstadoOrdenCompra);								
		
		
		/*
		this.gridBagConstraintsEstadoOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsEstadoOrdenCompra.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoOrdenCompra.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesEstadoOrdenCompra, this.gridBagConstraintsEstadoOrdenCompra);
		*/		
		
		this.gridBagConstraintsEstadoOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsEstadoOrdenCompra.gridy =iGridyPrincipal++;
		this.gridBagConstraintsEstadoOrdenCompra.gridx =0;
		this.gridBagConstraintsEstadoOrdenCompra.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsEstadoOrdenCompra.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosEstadoOrdenCompra, this.gridBagConstraintsEstadoOrdenCompra);
				
		
		this.gridBagConstraintsEstadoOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsEstadoOrdenCompra.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoOrdenCompra.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionEstadoOrdenCompra, this.gridBagConstraintsEstadoOrdenCompra);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(EstadoOrdenCompraJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosEstadoOrdenCompra= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosEstadoOrdenCompra = new GridBagLayout();
			this.jPanelBusquedasParametrosEstadoOrdenCompra.setLayout(gridaBagLayoutBusquedasParametrosEstadoOrdenCompra);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralEstadoOrdenCompra=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralEstadoOrdenCompra.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEstadoOrdenCompra.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEstadoOrdenCompra.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsEstadoOrdenCompra = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsEstadoOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsEstadoOrdenCompra.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoOrdenCompra.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposEstadoOrdenCompra, this.gridBagConstraintsEstadoOrdenCompra);
			
			
		this.gridBagConstraintsEstadoOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsEstadoOrdenCompra.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoOrdenCompra.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosEstadoOrdenCompra, this.gridBagConstraintsEstadoOrdenCompra);
		
			
		this.gridBagConstraintsEstadoOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsEstadoOrdenCompra.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsEstadoOrdenCompra.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesEstadoOrdenCompra, this.gridBagConstraintsEstadoOrdenCompra);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralEstadoOrdenCompra;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoEstadoOrdenCompra() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoEstadoOrdenCompra = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoEstadoOrdenCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoEstadoOrdenCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoEstadoOrdenCompra.setName("jPanelReporteDinamicoEstadoOrdenCompra"); 
		
		this.jPanelReporteDinamicoEstadoOrdenCompra.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoEstadoOrdenCompra.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoEstadoOrdenCompra.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoEstadoOrdenCompra.setLayout(gridaBagLayoutReporteDinamicoEstadoOrdenCompra);
		
		
		this.jInternalFrameReporteDinamicoEstadoOrdenCompra= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoEstadoOrdenCompra = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteEstadoOrdenCompra= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoEstadoOrdenCompra.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoEstadoOrdenCompra.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoEstadoOrdenCompra.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoEstadoOrdenCompra.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoEstadoOrdenCompra.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoEstadoOrdenCompra.setResizable(true);
	    this.jInternalFrameReporteDinamicoEstadoOrdenCompra.setClosable(true);
	    this.jInternalFrameReporteDinamicoEstadoOrdenCompra.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoEstadoOrdenCompra.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoEstadoOrdenCompra.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoEstadoOrdenCompra.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoEstadoOrdenCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Orden Compras"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteEstadoOrdenCompra = new JLabelMe();

		this.jLabelColumnasSelectReporteEstadoOrdenCompra.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteEstadoOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteEstadoOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteEstadoOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsEstadoOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsEstadoOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoOrdenCompra.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoOrdenCompra.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoEstadoOrdenCompra.add(this.jLabelColumnasSelectReporteEstadoOrdenCompra, this.gridBagConstraintsEstadoOrdenCompra);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteEstadoOrdenCompra = new JList<Reporte>();
		this.jListColumnasSelectReporteEstadoOrdenCompra.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteEstadoOrdenCompra.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteEstadoOrdenCompra.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteEstadoOrdenCompra.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteEstadoOrdenCompra.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteEstadoOrdenCompra=new JScrollPane(this.jListColumnasSelectReporteEstadoOrdenCompra);
			
			this.jScrollColumnasSelectReporteEstadoOrdenCompra.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteEstadoOrdenCompra.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteEstadoOrdenCompra.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteEstadoOrdenCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsEstadoOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsEstadoOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoOrdenCompra.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoOrdenCompra.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoEstadoOrdenCompra.add(this.jListColumnasSelectReporteEstadoOrdenCompra, this.gridBagConstraintsEstadoOrdenCompra);
		this.jPanelReporteDinamicoEstadoOrdenCompra.add(this.jScrollColumnasSelectReporteEstadoOrdenCompra, this.gridBagConstraintsEstadoOrdenCompra);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteEstadoOrdenCompra = new JLabelMe();

		this.jLabelRelacionesSelectReporteEstadoOrdenCompra.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteEstadoOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteEstadoOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteEstadoOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsEstadoOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsEstadoOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoOrdenCompra.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoOrdenCompra.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoEstadoOrdenCompra.add(this.jLabelRelacionesSelectReporteEstadoOrdenCompra, this.gridBagConstraintsEstadoOrdenCompra);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteEstadoOrdenCompra = new JList<Reporte>();
		this.jListRelacionesSelectReporteEstadoOrdenCompra.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteEstadoOrdenCompra.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteEstadoOrdenCompra.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteEstadoOrdenCompra.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteEstadoOrdenCompra.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteEstadoOrdenCompra=new JScrollPane(this.jListRelacionesSelectReporteEstadoOrdenCompra);
			
			this.jScrollRelacionesSelectReporteEstadoOrdenCompra.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteEstadoOrdenCompra.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteEstadoOrdenCompra.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteEstadoOrdenCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsEstadoOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsEstadoOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoOrdenCompra.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoOrdenCompra.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoEstadoOrdenCompra.add(this.jListRelacionesSelectReporteEstadoOrdenCompra, this.gridBagConstraintsEstadoOrdenCompra);
		this.jPanelReporteDinamicoEstadoOrdenCompra.add(this.jScrollRelacionesSelectReporteEstadoOrdenCompra, this.gridBagConstraintsEstadoOrdenCompra);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoEstadoOrdenCompra = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoEstadoOrdenCompra = new JComboBoxMe();
		this.jListColumnasValoresGraficoEstadoOrdenCompra = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoEstadoOrdenCompra = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoEstadoOrdenCompra.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoEstadoOrdenCompra.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoEstadoOrdenCompra.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoEstadoOrdenCompra.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoEstadoOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoEstadoOrdenCompra = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoEstadoOrdenCompra.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoEstadoOrdenCompra.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoEstadoOrdenCompra.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoEstadoOrdenCompra.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoEstadoOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoEstadoOrdenCompra = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoEstadoOrdenCompra.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoEstadoOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoEstadoOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoEstadoOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsEstadoOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsEstadoOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoOrdenCompra.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoOrdenCompra.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEstadoOrdenCompra.add(this.jLabelGenerarExcelReporteDinamicoEstadoOrdenCompra, this.gridBagConstraintsEstadoOrdenCompra);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoEstadoOrdenCompra = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoEstadoOrdenCompra.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoEstadoOrdenCompra,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoEstadoOrdenCompra.setToolTipText("Generar EXCEL"+" "+EstadoOrdenCompraConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsEstadoOrdenCompra = new GridBagConstraints();
		//this.gridBagConstraintsEstadoOrdenCompra.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsEstadoOrdenCompra.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsEstadoOrdenCompra.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoEstadoOrdenCompra.add(this.jButtonGenerarExcelReporteDinamicoEstadoOrdenCompra, this.gridBagConstraintsEstadoOrdenCompra);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsEstadoOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsEstadoOrdenCompra.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoOrdenCompra.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEstadoOrdenCompra.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEstadoOrdenCompra.add(this.jComboBoxTiposReportesDinamicoEstadoOrdenCompra, this.gridBagConstraintsEstadoOrdenCompra);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoEstadoOrdenCompra = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoEstadoOrdenCompra.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoEstadoOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoEstadoOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoEstadoOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsEstadoOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsEstadoOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoOrdenCompra.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoOrdenCompra.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEstadoOrdenCompra.add(this.jLabelTiposArchivoReporteDinamicoEstadoOrdenCompra, this.gridBagConstraintsEstadoOrdenCompra);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsEstadoOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsEstadoOrdenCompra.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoOrdenCompra.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEstadoOrdenCompra.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEstadoOrdenCompra.add(this.jComboBoxTiposArchivosReportesDinamicoEstadoOrdenCompra, this.gridBagConstraintsEstadoOrdenCompra);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoEstadoOrdenCompra = new JButtonMe();
		this.jButtonGenerarReporteDinamicoEstadoOrdenCompra.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoEstadoOrdenCompra,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoEstadoOrdenCompra.setToolTipText("Generar"+" "+EstadoOrdenCompraConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsEstadoOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsEstadoOrdenCompra.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoOrdenCompra.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEstadoOrdenCompra.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEstadoOrdenCompra.add(this.jButtonGenerarReporteDinamicoEstadoOrdenCompra, this.gridBagConstraintsEstadoOrdenCompra);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoEstadoOrdenCompra = new JButtonMe();
		this.jButtonCerrarReporteDinamicoEstadoOrdenCompra.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoEstadoOrdenCompra,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoEstadoOrdenCompra.setToolTipText("Cancelar"+" "+EstadoOrdenCompraConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsEstadoOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsEstadoOrdenCompra.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoOrdenCompra.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEstadoOrdenCompra.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEstadoOrdenCompra.add(this.jButtonCerrarReporteDinamicoEstadoOrdenCompra, this.gridBagConstraintsEstadoOrdenCompra);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalEstadoOrdenCompra = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoEstadoOrdenCompra= new JScrollPane(jPanelReporteDinamicoEstadoOrdenCompra,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoEstadoOrdenCompra.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoEstadoOrdenCompra.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoEstadoOrdenCompra.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoEstadoOrdenCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Orden Compras"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsEstadoOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsEstadoOrdenCompra.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsEstadoOrdenCompra.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsEstadoOrdenCompra.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoEstadoOrdenCompra.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoEstadoOrdenCompra.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalEstadoOrdenCompra);
		this.jInternalFrameReporteDinamicoEstadoOrdenCompra.getContentPane().add(this.jScrollPanelReporteDinamicoEstadoOrdenCompra, this.gridBagConstraintsEstadoOrdenCompra);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionEstadoOrdenCompra() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionEstadoOrdenCompra = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionEstadoOrdenCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionEstadoOrdenCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionEstadoOrdenCompra.setName("jPanelImportacionEstadoOrdenCompra"); 
		
		this.jPanelImportacionEstadoOrdenCompra.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionEstadoOrdenCompra.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionEstadoOrdenCompra.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionEstadoOrdenCompra.setLayout(gridaBagLayoutImportacionEstadoOrdenCompra);
		
		
		this.jInternalFrameImportacionEstadoOrdenCompra= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionEstadoOrdenCompra= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionEstadoOrdenCompra = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteEstadoOrdenCompra= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionEstadoOrdenCompra.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionEstadoOrdenCompra.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionEstadoOrdenCompra.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionEstadoOrdenCompra.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionEstadoOrdenCompra.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionEstadoOrdenCompra.setResizable(true);
	    this.jInternalFrameImportacionEstadoOrdenCompra.setClosable(true);
	    this.jInternalFrameImportacionEstadoOrdenCompra.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionEstadoOrdenCompra.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionEstadoOrdenCompra.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionEstadoOrdenCompra.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionEstadoOrdenCompra.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionEstadoOrdenCompra.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionEstadoOrdenCompra.setResizable(true);
	    this.jInternalFrameImportacionEstadoOrdenCompra.setClosable(true);
	    this.jInternalFrameImportacionEstadoOrdenCompra.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionEstadoOrdenCompra.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionEstadoOrdenCompra.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionEstadoOrdenCompra.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionEstadoOrdenCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Orden Compras"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionEstadoOrdenCompra = new JLabelMe();

		this.jLabelArchivoImportacionEstadoOrdenCompra.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionEstadoOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionEstadoOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionEstadoOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsEstadoOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsEstadoOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoOrdenCompra.gridy = iPosYImportacion;		
		this.gridBagConstraintsEstadoOrdenCompra.gridx = iPosXImportacion++;
			
		this.jPanelImportacionEstadoOrdenCompra.add(this.jLabelArchivoImportacionEstadoOrdenCompra, this.gridBagConstraintsEstadoOrdenCompra);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionEstadoOrdenCompra = new JFileChooser();		
		this.jFileChooserImportacionEstadoOrdenCompra.setToolTipText("ESCOGER ARCHIVO"+" "+EstadoOrdenCompraConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionEstadoOrdenCompra = new JButtonMe();
		this.jButtonAbrirImportacionEstadoOrdenCompra.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionEstadoOrdenCompra,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionEstadoOrdenCompra.setToolTipText("Generar"+" "+EstadoOrdenCompraConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsEstadoOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsEstadoOrdenCompra.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoOrdenCompra.gridy = iPosYImportacion;
		this.gridBagConstraintsEstadoOrdenCompra.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEstadoOrdenCompra.add(this.jButtonAbrirImportacionEstadoOrdenCompra, this.gridBagConstraintsEstadoOrdenCompra);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionEstadoOrdenCompra = new JLabelMe();

		this.jLabelPathArchivoImportacionEstadoOrdenCompra.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionEstadoOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionEstadoOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionEstadoOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsEstadoOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsEstadoOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoOrdenCompra.gridy = iPosYImportacion;		
		this.gridBagConstraintsEstadoOrdenCompra.gridx = iPosXImportacion++;
			
		this.jPanelImportacionEstadoOrdenCompra.add(this.jLabelPathArchivoImportacionEstadoOrdenCompra, this.gridBagConstraintsEstadoOrdenCompra);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionEstadoOrdenCompra=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionEstadoOrdenCompra.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionEstadoOrdenCompra.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionEstadoOrdenCompra.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsEstadoOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsEstadoOrdenCompra.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoOrdenCompra.gridy = iPosYImportacion;
		this.gridBagConstraintsEstadoOrdenCompra.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEstadoOrdenCompra.add(this.jTextFieldPathArchivoImportacionEstadoOrdenCompra, this.gridBagConstraintsEstadoOrdenCompra);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionEstadoOrdenCompra = new JButtonMe();
		this.jButtonGenerarImportacionEstadoOrdenCompra.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionEstadoOrdenCompra,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionEstadoOrdenCompra.setToolTipText("Generar"+" "+EstadoOrdenCompraConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsEstadoOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsEstadoOrdenCompra.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoOrdenCompra.gridy = iPosYImportacion;
		this.gridBagConstraintsEstadoOrdenCompra.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEstadoOrdenCompra.add(this.jButtonGenerarImportacionEstadoOrdenCompra, this.gridBagConstraintsEstadoOrdenCompra);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionEstadoOrdenCompra = new JButtonMe();
		this.jButtonCerrarImportacionEstadoOrdenCompra.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionEstadoOrdenCompra,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionEstadoOrdenCompra.setToolTipText("Cancelar"+" "+EstadoOrdenCompraConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsEstadoOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsEstadoOrdenCompra.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoOrdenCompra.gridy = iPosYImportacion;
		this.gridBagConstraintsEstadoOrdenCompra.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEstadoOrdenCompra.add(this.jButtonCerrarImportacionEstadoOrdenCompra, this.gridBagConstraintsEstadoOrdenCompra);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalEstadoOrdenCompra = new GridBagLayout();
		
		this.jScrollPanelImportacionEstadoOrdenCompra= new JScrollPane(jPanelImportacionEstadoOrdenCompra,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsEstadoOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsEstadoOrdenCompra.gridy =iPosYImportacion;
		this.gridBagConstraintsEstadoOrdenCompra.gridx =iPosXImportacion;
		this.gridBagConstraintsEstadoOrdenCompra.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionEstadoOrdenCompra.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionEstadoOrdenCompra.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalEstadoOrdenCompra);
		this.jInternalFrameImportacionEstadoOrdenCompra.getContentPane().add(this.jScrollPanelImportacionEstadoOrdenCompra, this.gridBagConstraintsEstadoOrdenCompra);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByEstadoOrdenCompra(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByEstadoOrdenCompra = new JButtonMe();
			this.jButtonAbrirOrderByEstadoOrdenCompra.setText("Orden");
			this.jButtonAbrirOrderByEstadoOrdenCompra.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByEstadoOrdenCompra,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByEstadoOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByEstadoOrdenCompra";
			inputMap = this.jButtonAbrirOrderByEstadoOrdenCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByEstadoOrdenCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByEstadoOrdenCompra"));
		
		
			GridBagLayout gridaBagLayoutOrderByEstadoOrdenCompra = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByEstadoOrdenCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByEstadoOrdenCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByEstadoOrdenCompra.setName("jPanelOrderByEstadoOrdenCompra"); 
			
			this.jPanelOrderByEstadoOrdenCompra.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByEstadoOrdenCompra.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByEstadoOrdenCompra.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByEstadoOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByEstadoOrdenCompra.setLayout(gridaBagLayoutOrderByEstadoOrdenCompra);
			
			
			this.jTableDatosEstadoOrdenCompraOrderBy = new JTableMe();        
			this.jTableDatosEstadoOrdenCompraOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosEstadoOrdenCompraOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosEstadoOrdenCompraOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosEstadoOrdenCompraOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosEstadoOrdenCompraOrderBy.setViewportView(this.jTableDatosEstadoOrdenCompraOrderBy);
			this.jTableDatosEstadoOrdenCompraOrderBy.setFillsViewportHeight(true);
			this.jTableDatosEstadoOrdenCompraOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByEstadoOrdenCompra= new OrderByJInternalFrame();
			this.jInternalFrameOrderByEstadoOrdenCompra= new OrderByJInternalFrame();
			this.jScrollPanelOrderByEstadoOrdenCompra = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteEstadoOrdenCompra= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByEstadoOrdenCompra.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByEstadoOrdenCompra.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByEstadoOrdenCompra.setTitle("Orden");
			this.jInternalFrameOrderByEstadoOrdenCompra.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByEstadoOrdenCompra.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByEstadoOrdenCompra.setResizable(true);
			this.jInternalFrameOrderByEstadoOrdenCompra.setClosable(true);
			this.jInternalFrameOrderByEstadoOrdenCompra.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByEstadoOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByEstadoOrdenCompra.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByEstadoOrdenCompra.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByEstadoOrdenCompra.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByEstadoOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByEstadoOrdenCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Orden Compras"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsEstadoOrdenCompra = new GridBagConstraints();
			this.gridBagConstraintsEstadoOrdenCompra.gridy =iPosYOrderBy++;
			this.gridBagConstraintsEstadoOrdenCompra.gridx =iPosXOrderBy;
			this.gridBagConstraintsEstadoOrdenCompra.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsEstadoOrdenCompra.ipady =150;
				
			this.jPanelOrderByEstadoOrdenCompra.add(jScrollPanelDatosEstadoOrdenCompraOrderBy, this.gridBagConstraintsEstadoOrdenCompra);//this.jTableDatosEstadoOrdenCompraTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByEstadoOrdenCompra = new JButtonMe();
			this.jButtonCerrarOrderByEstadoOrdenCompra.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByEstadoOrdenCompra,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByEstadoOrdenCompra.setToolTipText("Cancelar"+" "+EstadoOrdenCompraConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByEstadoOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsEstadoOrdenCompra = new GridBagConstraints();
			this.gridBagConstraintsEstadoOrdenCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoOrdenCompra.gridy = iPosYOrderBy++;
			this.gridBagConstraintsEstadoOrdenCompra.gridx = iPosXOrderBy;
									
			this.jPanelOrderByEstadoOrdenCompra.add(this.jButtonCerrarOrderByEstadoOrdenCompra, this.gridBagConstraintsEstadoOrdenCompra);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalEstadoOrdenCompra = new GridBagLayout();
			
			this.jScrollPanelOrderByEstadoOrdenCompra= new JScrollPane(jPanelOrderByEstadoOrdenCompra,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsEstadoOrdenCompra = new GridBagConstraints();
			this.gridBagConstraintsEstadoOrdenCompra.gridy =iPosYOrderBy;
			this.gridBagConstraintsEstadoOrdenCompra.gridx =iPosXOrderBy;
			this.gridBagConstraintsEstadoOrdenCompra.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByEstadoOrdenCompra.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByEstadoOrdenCompra.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalEstadoOrdenCompra);
			
			this.jInternalFrameOrderByEstadoOrdenCompra.getContentPane().add(this.jScrollPanelOrderByEstadoOrdenCompra, this.gridBagConstraintsEstadoOrdenCompra);			
		
		} else {
			this.jButtonAbrirOrderByEstadoOrdenCompra = new JButtonMe();
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
			&& this.estadoordencompraSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosEstadoOrdenCompra.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosEstadoOrdenCompra.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosEstadoOrdenCompra.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosEstadoOrdenCompra.getRowHeight();//EstadoOrdenCompraConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.estadoordencompraSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > EstadoOrdenCompraConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaEstadoOrdenCompra.isSelected()) {
					iHeightTable=EstadoOrdenCompraConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < EstadoOrdenCompraConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=EstadoOrdenCompraConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > EstadoOrdenCompraConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaEstadoOrdenCompra.isSelected()) {
					iHeightTable=EstadoOrdenCompraConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < EstadoOrdenCompraConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=EstadoOrdenCompraConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosEstadoOrdenCompra.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosEstadoOrdenCompra.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosEstadoOrdenCompra.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosEstadoOrdenCompra.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosEstadoOrdenCompra.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosEstadoOrdenCompra.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByEstadoOrdenCompra!=null && this.jInternalFrameOrderByEstadoOrdenCompra.getjTableDatosOrderBy()!=null) {
			//if(!this.estadoordencompraSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByEstadoOrdenCompra.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByEstadoOrdenCompra.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByEstadoOrdenCompra.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByEstadoOrdenCompra.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByEstadoOrdenCompra.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByEstadoOrdenCompra.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByEstadoOrdenCompra.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosEstadoOrdenCompra.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosEstadoOrdenCompra.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosEstadoOrdenCompra.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=estadoordencompraLogic.getEstadoOrdenCompras().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=estadoordencompras.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<EstadoOrdenCompra> TraerEstadoOrdenCompraBeans(List<EstadoOrdenCompra> estadoordencompras,ArrayList<Classe> classes)throws Exception {
		try {
			for(EstadoOrdenCompra estadoordencompra:estadoordencompras) {
					
				if(!(EstadoOrdenCompraConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || EstadoOrdenCompraConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					estadoordencompra.setsDetalleGeneralEntityReporte(EstadoOrdenCompraConstantesFunciones.getEstadoOrdenCompraDescripcion(estadoordencompra));
										
						
					
					

					if(estadoordencompra.getOrdenCompras()!=null && Funciones.existeClass(classes,OrdenCompra.class)) {
						try{estadoordencompra.setordencomprasDescripcionReporte(new JRBeanCollectionDataSource(OrdenCompraJInternalFrame.TraerOrdenCompraBeans(estadoordencompra.getOrdenCompras(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//estadoordencompra.setsDetalleGeneralEntityReporte(estadoordencompra.getsDetalleGeneralEntityReporte());
										
				}
				
				//estadoordencomprabeans.add(estadoordencomprabean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return estadoordencompras;
    }
	//PARA REPORTES FIN
}
