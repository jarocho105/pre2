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


import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.importaciones.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.sris.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;

import com.bydan.erp.importaciones.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.importaciones.presentation.swing.jinternalframes.*;
import com.bydan.erp.importaciones.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.importaciones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.sris.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.importaciones.business.entity.*;
import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.sris.business.entity.*;
import com.bydan.erp.tesoreria.business.entity.*;

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
import com.bydan.erp.importaciones.util.EstadoPedidoCompraConstantesFunciones;

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
public class EstadoPedidoCompraJInternalFrame extends EstadoPedidoCompraBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarEstadoPedidoCompra;
	
	protected JMenuBar jmenuBarEstadoPedidoCompra;
	
	protected JMenu jmenuEstadoPedidoCompra;
	protected JMenu jmenuDatosEstadoPedidoCompra;
	protected JMenu jmenuArchivoEstadoPedidoCompra;
	protected JMenu jmenuAccionesEstadoPedidoCompra;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosEstadoPedidoCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutEstadoPedidoCompra;	
	protected GridBagConstraints gridBagConstraintsEstadoPedidoCompra;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public EstadoPedidoCompraDetalleFormJInternalFrame jInternalFrameDetalleFormEstadoPedidoCompra;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoEstadoPedidoCompra;	
	protected ImportacionJInternalFrame jInternalFrameImportacionEstadoPedidoCompra;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public EstadoPedidoCompraSessionBean estadopedidocompraSessionBean;
		
	
	
	
	//protected JDesktopPane jDesktopPane;
	public List<EstadoPedidoCompra> estadopedidocompras;		
	public List<EstadoPedidoCompra> estadopedidocomprasEliminados;	
	public List<EstadoPedidoCompra> estadopedidocomprasAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByEstadoPedidoCompra;		
	protected JButton jButtonAbrirOrderByEstadoPedidoCompra;
	
	
	//protected JPanel jPanelOrderByEstadoPedidoCompra;
	//public JScrollPane jScrollPanelOrderByEstadoPedidoCompra;	
	//protected JButton jButtonCerrarOrderByEstadoPedidoCompra;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public EstadoPedidoCompraLogic estadopedidocompraLogic;
	
	
	
	public JScrollPane jScrollPanelDatosEstadoPedidoCompra;
	public JScrollPane jScrollPanelDatosEdicionEstadoPedidoCompra;
	public JScrollPane jScrollPanelDatosGeneralEstadoPedidoCompra;
    
	
	
	//public JScrollPane jScrollPanelDatosEstadoPedidoCompraOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoEstadoPedidoCompra;
	//public JScrollPane jScrollPanelImportacionEstadoPedidoCompra;
	
	
	
	protected JPanel jPanelAccionesEstadoPedidoCompra;
	
    protected JPanel jPanelPaginacionEstadoPedidoCompra;
    protected JPanel jPanelParametrosReportesEstadoPedidoCompra;
	protected JPanel jPanelParametrosReportesAccionesEstadoPedidoCompra;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1EstadoPedidoCompra;
	protected JPanel jPanelParametrosAuxiliar2EstadoPedidoCompra;
	protected JPanel jPanelParametrosAuxiliar3EstadoPedidoCompra;
	protected JPanel jPanelParametrosAuxiliar4EstadoPedidoCompra;
	//protected JPanel jPanelParametrosAuxiliar5EstadoPedidoCompra;
	
	
	
	//protected JPanel jPanelReporteDinamicoEstadoPedidoCompra;
	//protected JPanel jPanelImportacionEstadoPedidoCompra;
	
	
	public JTable jTableDatosEstadoPedidoCompra;
	
	
	
	//public JTable jTableDatosEstadoPedidoCompraOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoEstadoPedidoCompra;
	protected JButton jButtonDuplicarEstadoPedidoCompra;
	protected JButton jButtonCopiarEstadoPedidoCompra;
	protected JButton jButtonVerFormEstadoPedidoCompra;
	protected JButton jButtonNuevoRelacionesEstadoPedidoCompra;
	protected JButton jButtonModificarEstadoPedidoCompra;
	
    protected JButton jButtonGuardarCambiosTablaEstadoPedidoCompra;
	protected JButton jButtonCerrarEstadoPedidoCompra;
	
	
	protected JButton jButtonRecargarInformacionEstadoPedidoCompra;
	protected JButton jButtonProcesarInformacionEstadoPedidoCompra;
	
	
	protected JButton jButtonAnterioresEstadoPedidoCompra;
	protected JButton jButtonSiguientesEstadoPedidoCompra;
	protected JButton jButtonNuevoGuardarCambiosEstadoPedidoCompra;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoEstadoPedidoCompra;
	//protected JButton jButtonCerrarReporteDinamicoEstadoPedidoCompra;
	//protected JButton jButtonGenerarExcelReporteDinamicoEstadoPedidoCompra;	
	
	
	
	//protected JButton jButtonAbrirImportacionEstadoPedidoCompra;
	//protected JButton jButtonGenerarImportacionEstadoPedidoCompra;
	//protected JButton jButtonCerrarImportacionEstadoPedidoCompra;
	//protected JFileChooser jFileChooserImportacionEstadoPedidoCompra;
	//protected File fileImportacionEstadoPedidoCompra;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarEstadoPedidoCompra;
	protected JButton jButtonDuplicarToolBarEstadoPedidoCompra;
	protected JButton jButtonNuevoRelacionesToolBarEstadoPedidoCompra;
	
	
	public JButton jButtonGuardarCambiosToolBarEstadoPedidoCompra;
	protected JButton jButtonCopiarToolBarEstadoPedidoCompra;
	protected JButton jButtonVerFormToolBarEstadoPedidoCompra;
	public JButton jButtonGuardarCambiosTablaToolBarEstadoPedidoCompra;
	protected JButton jButtonMostrarOcultarTablaToolBarEstadoPedidoCompra;
	protected JButton jButtonCerrarToolBarEstadoPedidoCompra;
	
	protected JButton jButtonRecargarInformacionToolBarEstadoPedidoCompra;
	protected JButton jButtonProcesarInformacionToolBarEstadoPedidoCompra;
	protected JButton jButtonAnterioresToolBarEstadoPedidoCompra;
	protected JButton jButtonSiguientesToolBarEstadoPedidoCompra;
	protected JButton jButtonNuevoGuardarCambiosToolBarEstadoPedidoCompra;
	protected JButton jButtonAbrirOrderByToolBarEstadoPedidoCompra;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoEstadoPedidoCompra;
	protected JMenuItem jMenuItemDuplicarEstadoPedidoCompra;
	protected JMenuItem jMenuItemNuevoRelacionesEstadoPedidoCompra;
	
	
	protected JMenuItem jMenuItemGuardarCambiosEstadoPedidoCompra;
	protected JMenuItem jMenuItemCopiarEstadoPedidoCompra;
	protected JMenuItem jMenuItemVerFormEstadoPedidoCompra;
	protected JMenuItem jMenuItemGuardarCambiosTablaEstadoPedidoCompra;
	protected JMenuItem jMenuItemCerrarEstadoPedidoCompra;
	protected JMenuItem jMenuItemDetalleCerrarEstadoPedidoCompra;
	protected JMenuItem jMenuItemDetalleAbrirOrderByEstadoPedidoCompra;
	protected JMenuItem jMenuItemDetalleMostarOcultarEstadoPedidoCompra;
	
	protected JMenuItem jMenuItemRecargarInformacionEstadoPedidoCompra;
	protected JMenuItem jMenuItemProcesarInformacionEstadoPedidoCompra;
	protected JMenuItem jMenuItemAnterioresEstadoPedidoCompra;
	protected JMenuItem jMenuItemSiguientesEstadoPedidoCompra;
	protected JMenuItem jMenuItemNuevoGuardarCambiosEstadoPedidoCompra;
	protected JMenuItem jMenuItemAbrirOrderByEstadoPedidoCompra;
	protected JMenuItem jMenuItemMostrarOcultarEstadoPedidoCompra;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesEstadoPedidoCompra;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosEstadoPedidoCompra;
	protected JCheckBox jCheckBoxSeleccionadosEstadoPedidoCompra;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaEstadoPedidoCompra;
	protected JCheckBox jCheckBoxConGraficoReporteEstadoPedidoCompra;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesEstadoPedidoCompra;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesEstadoPedidoCompra;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoEstadoPedidoCompra;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoEstadoPedidoCompra;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesEstadoPedidoCompra;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionEstadoPedidoCompra;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesEstadoPedidoCompra;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesEstadoPedidoCompra;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarEstadoPedidoCompra;
	protected JTextField jTextFieldValorCampoGeneralEstadoPedidoCompra;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteEstadoPedidoCompra;
	//public JList<Reporte> jListColumnasSelectReporteEstadoPedidoCompra;
	//public JScrollPane jScrollColumnasSelectReporteEstadoPedidoCompra;
	
	//public JLabel jLabelRelacionesSelectReporteEstadoPedidoCompra;
	//public JList<Reporte> jListRelacionesSelectReporteEstadoPedidoCompra;
	//public JScrollPane jScrollRelacionesSelectReporteEstadoPedidoCompra;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoEstadoPedidoCompra;
	//protected JCheckBox jCheckBoxConGraficoDinamicoEstadoPedidoCompra;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoEstadoPedidoCompra;
	//public JLabel jLabelTiposArchivoReporteDinamicoEstadoPedidoCompra;
	
		
	//public JLabel jLabelArchivoImportacionEstadoPedidoCompra;	
	//public JLabel jLabelPathArchivoImportacionEstadoPedidoCompra;
	//protected JTextField jTextFieldPathArchivoImportacionEstadoPedidoCompra;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoEstadoPedidoCompra;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoEstadoPedidoCompra;
	
	//public JLabel jLabelColumnaCategoriaValorEstadoPedidoCompra;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorEstadoPedidoCompra;
	
	//public JLabel jLabelColumnasValoresGraficoEstadoPedidoCompra;
	//public JList<Reporte> jListColumnasValoresGraficoEstadoPedidoCompra;
	//public JScrollPane jScrollColumnasValoresGraficoEstadoPedidoCompra;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoEstadoPedidoCompra;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoEstadoPedidoCompra;	
	
	
	
	
	
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
	public EstadoPedidoCompraJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("EstadoPedidoCompra No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoPedidoCompraJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EstadoPedidoCompra No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoPedidoCompraJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EstadoPedidoCompra No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoPedidoCompraJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("EstadoPedidoCompra No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionEstadoPedidoCompra)	{
		this.jButtonRecargarInformacionEstadoPedidoCompra = jButtonRecargarInformacionEstadoPedidoCompra;
	}
	
	public JButton getjButtonProcesarInformacionEstadoPedidoCompra() {
		return this.jButtonProcesarInformacionEstadoPedidoCompra;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionEstadoPedidoCompra)	{
		this.jButtonProcesarInformacionEstadoPedidoCompra = jButtonProcesarInformacionEstadoPedidoCompra;
	}
	
	
	public JButton getjButtonRecargarInformacionEstadoPedidoCompra() {
		return this.jButtonRecargarInformacionEstadoPedidoCompra;
	}
	
	
	public List<EstadoPedidoCompra> getestadopedidocompras() {
		return this.estadopedidocompras;
	}

	public void setestadopedidocompras(List<EstadoPedidoCompra> estadopedidocompras) {
		this.estadopedidocompras = estadopedidocompras;
	}
	
	public List<EstadoPedidoCompra> getestadopedidocomprasAux() {
		return this.estadopedidocomprasAux;
	}

	public void setestadopedidocomprasAux(List<EstadoPedidoCompra> estadopedidocomprasAux) {
		this.estadopedidocomprasAux = estadopedidocomprasAux;
	}
	
	public List<EstadoPedidoCompra> getestadopedidocomprasEliminados() {
		return this.estadopedidocomprasEliminados;
	}

	public void setEstadoPedidoComprasEliminados(List<EstadoPedidoCompra> estadopedidocomprasEliminados) {
		this.estadopedidocomprasEliminados = estadopedidocomprasEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarEstadoPedidoCompra() {
		return jComboBoxTiposSeleccionarEstadoPedidoCompra;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarEstadoPedidoCompra(
			JComboBox jComboBoxTiposSeleccionarEstadoPedidoCompra) {
		this.jComboBoxTiposSeleccionarEstadoPedidoCompra = jComboBoxTiposSeleccionarEstadoPedidoCompra;
	}
	
	public void setBorderResaltarTiposSeleccionarEstadoPedidoCompra() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarEstadoPedidoCompra.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarEstadoPedidoCompra .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralEstadoPedidoCompra() {
		return jTextFieldValorCampoGeneralEstadoPedidoCompra;
	}

	public void setjTextFieldValorCampoGeneralEstadoPedidoCompra(
			JTextField jTextFieldValorCampoGeneralEstadoPedidoCompra) {
		this.jTextFieldValorCampoGeneralEstadoPedidoCompra = jTextFieldValorCampoGeneralEstadoPedidoCompra;
	}

	public void setBorderResaltarValorCampoGeneralEstadoPedidoCompra() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoPedidoCompra.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralEstadoPedidoCompra .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosEstadoPedidoCompra() {
		return this.jCheckBoxSeleccionarTodosEstadoPedidoCompra;
	}

	public void setjCheckBoxSeleccionarTodosEstadoPedidoCompra(
			JCheckBox jCheckBoxSeleccionarTodosEstadoPedidoCompra) {
		this.jCheckBoxSeleccionarTodosEstadoPedidoCompra = jCheckBoxSeleccionarTodosEstadoPedidoCompra;
	}

	public void setBorderResaltarSeleccionarTodosEstadoPedidoCompra() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoPedidoCompra.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosEstadoPedidoCompra .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosEstadoPedidoCompra() {
		return this.jCheckBoxSeleccionadosEstadoPedidoCompra;
	}

	public void setjCheckBoxSeleccionadosEstadoPedidoCompra(
			JCheckBox jCheckBoxSeleccionadosEstadoPedidoCompra) {
		this.jCheckBoxSeleccionadosEstadoPedidoCompra = jCheckBoxSeleccionadosEstadoPedidoCompra;
	}
	
	public void setBorderResaltarSeleccionadosEstadoPedidoCompra() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoPedidoCompra.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosEstadoPedidoCompra .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesEstadoPedidoCompra() {
		return this.jComboBoxTiposArchivosReportesEstadoPedidoCompra;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesEstadoPedidoCompra(
			JComboBox jComboBoxTiposArchivosReportesEstadoPedidoCompra) {
		this.jComboBoxTiposArchivosReportesEstadoPedidoCompra = jComboBoxTiposArchivosReportesEstadoPedidoCompra;
	}

	public void setBorderResaltarTiposArchivosReportesEstadoPedidoCompra() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoPedidoCompra.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesEstadoPedidoCompra .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesEstadoPedidoCompra() {
		return this.jComboBoxTiposReportesEstadoPedidoCompra;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesEstadoPedidoCompra(
			JComboBox jComboBoxTiposReportesEstadoPedidoCompra) {
		this.jComboBoxTiposReportesEstadoPedidoCompra = jComboBoxTiposReportesEstadoPedidoCompra;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoEstadoPedidoCompra() {
	//	return jComboBoxTiposReportesDinamicoEstadoPedidoCompra;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoEstadoPedidoCompra(
	//		JComboBox jComboBoxTiposReportesDinamicoEstadoPedidoCompra) {
	//	this.jComboBoxTiposReportesDinamicoEstadoPedidoCompra = jComboBoxTiposReportesDinamicoEstadoPedidoCompra;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoEstadoPedidoCompra() {
	//	return jComboBoxTiposArchivosReportesDinamicoEstadoPedidoCompra;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoEstadoPedidoCompra(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoEstadoPedidoCompra) {
	//	this.jComboBoxTiposArchivosReportesDinamicoEstadoPedidoCompra = jComboBoxTiposArchivosReportesDinamicoEstadoPedidoCompra;
	//}
	
	public void setBorderResaltarTiposReportesEstadoPedidoCompra() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoPedidoCompra.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesEstadoPedidoCompra .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesEstadoPedidoCompra() {
		return this.jComboBoxTiposGraficosReportesEstadoPedidoCompra;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesEstadoPedidoCompra(
			JComboBox jComboBoxTiposGraficosReportesEstadoPedidoCompra) {
		this.jComboBoxTiposGraficosReportesEstadoPedidoCompra = jComboBoxTiposGraficosReportesEstadoPedidoCompra;
	}
	
	public void setBorderResaltarTiposGraficosReportesEstadoPedidoCompra() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoPedidoCompra.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesEstadoPedidoCompra .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionEstadoPedidoCompra() {
		return this.jComboBoxTiposPaginacionEstadoPedidoCompra;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionEstadoPedidoCompra(
			JComboBox jComboBoxTiposPaginacionEstadoPedidoCompra) {
		this.jComboBoxTiposPaginacionEstadoPedidoCompra = jComboBoxTiposPaginacionEstadoPedidoCompra;
	}
	
	public void setBorderResaltarTiposPaginacionEstadoPedidoCompra() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoPedidoCompra.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionEstadoPedidoCompra .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesEstadoPedidoCompra() {
		return this.jComboBoxTiposRelacionesEstadoPedidoCompra;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesEstadoPedidoCompra() {
		return this.jComboBoxTiposAccionesEstadoPedidoCompra;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesEstadoPedidoCompra(
			JComboBox jComboBoxTiposRelacionesEstadoPedidoCompra) {
		this.jComboBoxTiposRelacionesEstadoPedidoCompra = jComboBoxTiposRelacionesEstadoPedidoCompra;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesEstadoPedidoCompra(
			JComboBox jComboBoxTiposAccionesEstadoPedidoCompra) {
		this.jComboBoxTiposAccionesEstadoPedidoCompra = jComboBoxTiposAccionesEstadoPedidoCompra;
	}
	
	public void setBorderResaltarTiposRelacionesEstadoPedidoCompra() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoPedidoCompra.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesEstadoPedidoCompra .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesEstadoPedidoCompra() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoPedidoCompra.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesEstadoPedidoCompra .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoEstadoPedidoCompra() {
	//	return jCheckBoxConGraficoDinamicoEstadoPedidoCompra;
	//}

	//public void setjCheckBoxConGraficoDinamicoEstadoPedidoCompra(
	//		JCheckBox jCheckBoxConGraficoDinamicoEstadoPedidoCompra) {
	//	this.jCheckBoxConGraficoDinamicoEstadoPedidoCompra = jCheckBoxConGraficoDinamicoEstadoPedidoCompra;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoEstadoPedidoCompra() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarEstadoPedidoCompra.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoEstadoPedidoCompra .setBorder(borderResaltar);		
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
		this.estadopedidocompraSessionBean=new EstadoPedidoCompraSessionBean();
		
		this.estadopedidocompraSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.estadopedidocompraSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.estadopedidocompraSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=EstadoPedidoCompraJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=EstadoPedidoCompraJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		EstadoPedidoCompraJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		EstadoPedidoCompraJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		EstadoPedidoCompraJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Estado Pedido Compra MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 650) {
			iHeight=650;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.estadopedidocompraSessionBean.getEsGuardarRelacionado()) {
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
		
		EstadoPedidoCompraJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("EstadoPedidoCompra No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarEstadoPedidoCompra= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarEstadoPedidoCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarEstadoPedidoCompra,this.jTtoolBarEstadoPedidoCompra,
							"nuevo","nuevo","Nuevo"+" "+EstadoPedidoCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarEstadoPedidoCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarEstadoPedidoCompra,this.jTtoolBarEstadoPedidoCompra,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarEstadoPedidoCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarEstadoPedidoCompra,this.jTtoolBarEstadoPedidoCompra,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+EstadoPedidoCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarEstadoPedidoCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarEstadoPedidoCompra,this.jTtoolBarEstadoPedidoCompra,
							"duplicar","duplicar","Duplicar"+" "+EstadoPedidoCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarEstadoPedidoCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarEstadoPedidoCompra,this.jTtoolBarEstadoPedidoCompra,
							"copiar","copiar","Copiar"+" "+EstadoPedidoCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarEstadoPedidoCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarEstadoPedidoCompra,this.jTtoolBarEstadoPedidoCompra,
							"ver_form","ver_form","Ver"+" "+EstadoPedidoCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarEstadoPedidoCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEstadoPedidoCompra,this.jTtoolBarEstadoPedidoCompra,
							"recargar","recargar","Recargar"+" "+EstadoPedidoCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarEstadoPedidoCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEstadoPedidoCompra,this.jTtoolBarEstadoPedidoCompra,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarEstadoPedidoCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEstadoPedidoCompra,this.jTtoolBarEstadoPedidoCompra,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarEstadoPedidoCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarEstadoPedidoCompra,this.jTtoolBarEstadoPedidoCompra,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarEstadoPedidoCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarEstadoPedidoCompra,this.jTtoolBarEstadoPedidoCompra,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarEstadoPedidoCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarEstadoPedidoCompra,this.jTtoolBarEstadoPedidoCompra,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+EstadoPedidoCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarEstadoPedidoCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarEstadoPedidoCompra,this.jTtoolBarEstadoPedidoCompra,
							"cerrar","cerrar","Salir"+" "+EstadoPedidoCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarEstadoPedidoCompra=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarEstadoPedidoCompra;
			
				this.jButtonProcesarInformacionToolBarEstadoPedidoCompra=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarEstadoPedidoCompra;
				
		//protected JButton jButtonModificarToolBarEstadoPedidoCompra;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarEstadoPedidoCompra=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuEstadoPedidoCompra=new JMenuMe("General");
		this.jmenuArchivoEstadoPedidoCompra=new JMenuMe("Archivo");
		this.jmenuAccionesEstadoPedidoCompra=new JMenuMe("Acciones");
		this.jmenuDatosEstadoPedidoCompra=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoEstadoPedidoCompra= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoEstadoPedidoCompra.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoEstadoPedidoCompra,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoEstadoPedidoCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarEstadoPedidoCompra= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarEstadoPedidoCompra.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarEstadoPedidoCompra,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarEstadoPedidoCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesEstadoPedidoCompra= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesEstadoPedidoCompra.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesEstadoPedidoCompra,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesEstadoPedidoCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosEstadoPedidoCompra= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosEstadoPedidoCompra.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosEstadoPedidoCompra,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosEstadoPedidoCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarEstadoPedidoCompra= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarEstadoPedidoCompra.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarEstadoPedidoCompra,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarEstadoPedidoCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormEstadoPedidoCompra= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormEstadoPedidoCompra.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormEstadoPedidoCompra,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormEstadoPedidoCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaEstadoPedidoCompra= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaEstadoPedidoCompra.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaEstadoPedidoCompra,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaEstadoPedidoCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarEstadoPedidoCompra= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarEstadoPedidoCompra.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarEstadoPedidoCompra,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarEstadoPedidoCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionEstadoPedidoCompra= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionEstadoPedidoCompra.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionEstadoPedidoCompra,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionEstadoPedidoCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionEstadoPedidoCompra= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionEstadoPedidoCompra.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionEstadoPedidoCompra,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresEstadoPedidoCompra= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresEstadoPedidoCompra.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresEstadoPedidoCompra,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresEstadoPedidoCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesEstadoPedidoCompra= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesEstadoPedidoCompra.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesEstadoPedidoCompra,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesEstadoPedidoCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByEstadoPedidoCompra= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByEstadoPedidoCompra.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByEstadoPedidoCompra,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByEstadoPedidoCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarEstadoPedidoCompra= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarEstadoPedidoCompra.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarEstadoPedidoCompra,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarEstadoPedidoCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByEstadoPedidoCompra= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByEstadoPedidoCompra.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByEstadoPedidoCompra,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByEstadoPedidoCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarEstadoPedidoCompra= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarEstadoPedidoCompra.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarEstadoPedidoCompra,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarEstadoPedidoCompra, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosEstadoPedidoCompra= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosEstadoPedidoCompra.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosEstadoPedidoCompra,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosEstadoPedidoCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoEstadoPedidoCompra.add(this.jMenuItemCerrarEstadoPedidoCompra);
			
			this.jmenuAccionesEstadoPedidoCompra.add(this.jMenuItemNuevoEstadoPedidoCompra);
			this.jmenuAccionesEstadoPedidoCompra.add(this.jMenuItemNuevoGuardarCambiosEstadoPedidoCompra);
			this.jmenuAccionesEstadoPedidoCompra.add(this.jMenuItemNuevoRelacionesEstadoPedidoCompra);
			this.jmenuAccionesEstadoPedidoCompra.add(this.jMenuItemGuardarCambiosTablaEstadoPedidoCompra);		
			this.jmenuAccionesEstadoPedidoCompra.add(this.jMenuItemDuplicarEstadoPedidoCompra);		
			this.jmenuAccionesEstadoPedidoCompra.add(this.jMenuItemCopiarEstadoPedidoCompra);		
			this.jmenuAccionesEstadoPedidoCompra.add(this.jMenuItemVerFormEstadoPedidoCompra);		
			
			this.jmenuDatosEstadoPedidoCompra.add(this.jMenuItemRecargarInformacionEstadoPedidoCompra);				
			this.jmenuDatosEstadoPedidoCompra.add(this.jMenuItemAnterioresEstadoPedidoCompra);				
			this.jmenuDatosEstadoPedidoCompra.add(this.jMenuItemSiguientesEstadoPedidoCompra);				
			this.jmenuDatosEstadoPedidoCompra.add(this.jMenuItemAbrirOrderByEstadoPedidoCompra);				
			this.jmenuDatosEstadoPedidoCompra.add(this.jMenuItemMostrarOcultarEstadoPedidoCompra);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesEstadoPedidoCompra.add(this.jMenuItemGuardarCambiosEstadoPedidoCompra);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoEstadoPedidoCompra, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesEstadoPedidoCompra, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosEstadoPedidoCompra, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarEstadoPedidoCompra.add(this.jmenuArchivoEstadoPedidoCompra);		
			this.jmenuBarEstadoPedidoCompra.add(this.jmenuAccionesEstadoPedidoCompra);		
			this.jmenuBarEstadoPedidoCompra.add(this.jmenuDatosEstadoPedidoCompra);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarEstadoPedidoCompra);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasEstadoPedidoCompra() {
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
			//this.jInternalFrameDetalleEstadoPedidoCompra = new EstadoPedidoCompraDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Estado Pedido Compra DATOS");
			this.jInternalFrameDetalleFormEstadoPedidoCompra = new EstadoPedidoCompraDetalleFormJInternalFrame(jDesktopPane,this.estadopedidocompraSessionBean.getConGuardarRelaciones(),this.estadopedidocompraSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormEstadoPedidoCompra = null;//new EstadoPedidoCompraDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutEstadoPedidoCompra= new GridBagLayout();
		
		
		this.jTableDatosEstadoPedidoCompra = new JTableMe();      
		
		String sToolTipEstadoPedidoCompra="";
		sToolTipEstadoPedidoCompra=EstadoPedidoCompraConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipEstadoPedidoCompra+="(Importaciones.EstadoPedidoCompra)";
		}
		
		if(!this.estadopedidocompraSessionBean.getEsGuardarRelacionado()) {
			sToolTipEstadoPedidoCompra+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosEstadoPedidoCompra.setToolTipText(sToolTipEstadoPedidoCompra);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosEstadoPedidoCompra);
		this.jTableDatosEstadoPedidoCompra.setAutoCreateRowSorter(true);
		this.jTableDatosEstadoPedidoCompra.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosEstadoPedidoCompra.setRowSelectionAllowed(true);
		this.jTableDatosEstadoPedidoCompra.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosEstadoPedidoCompra,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoEstadoPedidoCompra = new JButtonMe();
		this.jButtonDuplicarEstadoPedidoCompra = new JButtonMe();
		this.jButtonCopiarEstadoPedidoCompra = new JButtonMe();
		this.jButtonVerFormEstadoPedidoCompra = new JButtonMe();
		this.jButtonNuevoRelacionesEstadoPedidoCompra = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaEstadoPedidoCompra = new JButtonMe();
		this.jButtonCerrarEstadoPedidoCompra = new JButtonMe();
		
		this.jScrollPanelDatosEstadoPedidoCompra = new JScrollPane();   
        this.jScrollPanelDatosGeneralEstadoPedidoCompra = new JScrollPane();
		
				
		
		
		this.jPanelAccionesEstadoPedidoCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Estado Pedido Compra";
		
		if(!this.estadopedidocompraSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosEstadoPedidoCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Pedido Compras" + this.sPath));
		} else {
			this.jScrollPanelDatosEstadoPedidoCompra.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralEstadoPedidoCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesEstadoPedidoCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesEstadoPedidoCompra.setToolTipText("Acciones");
        this.jPanelAccionesEstadoPedidoCompra.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralEstadoPedidoCompra, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEstadoPedidoCompra, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoEstadoPedidoCompra=new ReporteDinamicoJInternalFrame(EstadoPedidoCompraConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoEstadoPedidoCompra();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionEstadoPedidoCompra=new ImportacionJInternalFrame(EstadoPedidoCompraConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionEstadoPedidoCompra();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByEstadoPedidoCompra = new JButtonMe();
		
		this.jButtonAbrirOrderByEstadoPedidoCompra.setText("Orden");
		this.jButtonAbrirOrderByEstadoPedidoCompra.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByEstadoPedidoCompra,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByEstadoPedidoCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByEstadoPedidoCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByEstadoPedidoCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByEstadoPedidoCompra=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEstadoPedidoCompra,false,this);
			
			//this.cargarOrderByEstadoPedidoCompra(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByEstadoPedidoCompra=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEstadoPedidoCompra,true,this);
			
			//this.cargarOrderByEstadoPedidoCompra(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosEstadoPedidoCompra.setMinimumSize(new Dimension(400,50));//430
		this.jTableDatosEstadoPedidoCompra.setMaximumSize(new Dimension(400,50));//430
		this.jTableDatosEstadoPedidoCompra.setPreferredSize(new Dimension(400,50));//430
		
		this.jScrollPanelDatosEstadoPedidoCompra.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosEstadoPedidoCompra.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosEstadoPedidoCompra.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoEstadoPedidoCompra.setText("Nuevo");
		this.jButtonDuplicarEstadoPedidoCompra.setText("Duplicar");
		this.jButtonCopiarEstadoPedidoCompra.setText("Copiar");
		this.jButtonVerFormEstadoPedidoCompra.setText("Ver");
		this.jButtonNuevoRelacionesEstadoPedidoCompra.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaEstadoPedidoCompra.setText("Guardar");
		this.jButtonCerrarEstadoPedidoCompra.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoEstadoPedidoCompra,"nuevo_button","Nuevo",this.estadopedidocompraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarEstadoPedidoCompra,"duplicar_button","Duplicar",this.estadopedidocompraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarEstadoPedidoCompra,"copiar_button","Copiar",this.estadopedidocompraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormEstadoPedidoCompra,"ver_form","Ver",this.estadopedidocompraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesEstadoPedidoCompra,"nuevorelaciones_button","Nuevo Rel",this.estadopedidocompraSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaEstadoPedidoCompra,"guardarcambiostabla_button","Guardar",this.estadopedidocompraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarEstadoPedidoCompra,"cerrar_button","Salir",this.estadopedidocompraSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoEstadoPedidoCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarEstadoPedidoCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarEstadoPedidoCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormEstadoPedidoCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesEstadoPedidoCompra, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaEstadoPedidoCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarEstadoPedidoCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoEstadoPedidoCompra.setToolTipText("Nuevo"+" "+EstadoPedidoCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarEstadoPedidoCompra.setToolTipText("Duplicar"+" "+EstadoPedidoCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarEstadoPedidoCompra.setToolTipText("Copiar"+" "+EstadoPedidoCompraConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormEstadoPedidoCompra.setToolTipText("Ver"+" "+EstadoPedidoCompraConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesEstadoPedidoCompra.setToolTipText("Nuevo Rel"+" "+EstadoPedidoCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaEstadoPedidoCompra.setToolTipText("Guardar"+" "+EstadoPedidoCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarEstadoPedidoCompra.setToolTipText("Salir"+" "+EstadoPedidoCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoEstadoPedidoCompra";
		inputMap = this.jButtonNuevoEstadoPedidoCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoEstadoPedidoCompra.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoEstadoPedidoCompra"));
		
		//DUPLICAR
		sMapKey = "DuplicarEstadoPedidoCompra";
		inputMap = this.jButtonDuplicarEstadoPedidoCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarEstadoPedidoCompra.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarEstadoPedidoCompra"));
		
		//COPIAR
		sMapKey = "CopiarEstadoPedidoCompra";
		inputMap = this.jButtonCopiarEstadoPedidoCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarEstadoPedidoCompra.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarEstadoPedidoCompra"));
		
		//VEr FORM
		sMapKey = "VerFormEstadoPedidoCompra";
		inputMap = this.jButtonVerFormEstadoPedidoCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormEstadoPedidoCompra.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormEstadoPedidoCompra"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesEstadoPedidoCompra";
		inputMap = this.jButtonNuevoRelacionesEstadoPedidoCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesEstadoPedidoCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesEstadoPedidoCompra"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarEstadoPedidoCompra";
		inputMap = this.jButtonModificarEstadoPedidoCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarEstadoPedidoCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarEstadoPedidoCompra"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarEstadoPedidoCompra";
		inputMap = this.jButtonCerrarEstadoPedidoCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarEstadoPedidoCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarEstadoPedidoCompra"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaEstadoPedidoCompra";
		inputMap = this.jButtonGuardarCambiosTablaEstadoPedidoCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaEstadoPedidoCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaEstadoPedidoCompra"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesEstadoPedidoCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesEstadoPedidoCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionEstadoPedidoCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1EstadoPedidoCompra= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2EstadoPedidoCompra= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3EstadoPedidoCompra= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4EstadoPedidoCompra= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5EstadoPedidoCompra= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesEstadoPedidoCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesEstadoPedidoCompra.setName("jPanelParametrosReportesEstadoPedidoCompra"); 
		
		this.jPanelParametrosReportesAccionesEstadoPedidoCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesEstadoPedidoCompra.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesEstadoPedidoCompra.setName("jPanelParametrosReportesAccionesEstadoPedidoCompra"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesEstadoPedidoCompra, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesEstadoPedidoCompra, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionEstadoPedidoCompra = new JButtonMe();
		this.jButtonRecargarInformacionEstadoPedidoCompra.setText("Recargar");
		this.jButtonRecargarInformacionEstadoPedidoCompra.setToolTipText("Recargar"+" "+EstadoPedidoCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionEstadoPedidoCompra,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionEstadoPedidoCompra = new JButtonMe();
		this.jButtonProcesarInformacionEstadoPedidoCompra.setText("Procesar");
		this.jButtonProcesarInformacionEstadoPedidoCompra.setToolTipText("Procesar"+" "+EstadoPedidoCompraConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionEstadoPedidoCompra.setVisible(false);
			
		this.jButtonProcesarInformacionEstadoPedidoCompra.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionEstadoPedidoCompra.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionEstadoPedidoCompra.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesEstadoPedidoCompra = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEstadoPedidoCompra.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesEstadoPedidoCompra.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesEstadoPedidoCompra = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEstadoPedidoCompra.setText("TIPO");       
		this.jComboBoxTiposReportesEstadoPedidoCompra.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesEstadoPedidoCompra = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEstadoPedidoCompra.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesEstadoPedidoCompra.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionEstadoPedidoCompra = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionEstadoPedidoCompra.setText("Paginacion");
		this.jComboBoxTiposPaginacionEstadoPedidoCompra.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesEstadoPedidoCompra = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesEstadoPedidoCompra.setText("Accion");
		this.jComboBoxTiposRelacionesEstadoPedidoCompra.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesEstadoPedidoCompra = new JComboBoxMe();
		//this.jComboBoxTiposAccionesEstadoPedidoCompra.setText("Accion");
		this.jComboBoxTiposAccionesEstadoPedidoCompra.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarEstadoPedidoCompra = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarEstadoPedidoCompra.setText("Accion");
		this.jComboBoxTiposSeleccionarEstadoPedidoCompra.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralEstadoPedidoCompra=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralEstadoPedidoCompra.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralEstadoPedidoCompra.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralEstadoPedidoCompra.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesEstadoPedidoCompra = new JLabelMe();
		
		this.jLabelAccionesEstadoPedidoCompra.setText("Acciones");		
		this.jLabelAccionesEstadoPedidoCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEstadoPedidoCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEstadoPedidoCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosEstadoPedidoCompra = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosEstadoPedidoCompra.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosEstadoPedidoCompra.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosEstadoPedidoCompra = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosEstadoPedidoCompra.setText("Seleccionados");
		this.jCheckBoxSeleccionadosEstadoPedidoCompra.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaEstadoPedidoCompra = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaEstadoPedidoCompra.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaEstadoPedidoCompra.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteEstadoPedidoCompra = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteEstadoPedidoCompra.setText("Graf.");
		this.jCheckBoxConGraficoReporteEstadoPedidoCompra.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresEstadoPedidoCompra = new JButtonMe();
		//this.jButtonAnterioresEstadoPedidoCompra.setText("<<");
        this.jButtonAnterioresEstadoPedidoCompra.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresEstadoPedidoCompra,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresEstadoPedidoCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesEstadoPedidoCompra = new JButtonMe();
		//this.jButtonSiguientesEstadoPedidoCompra.setText(">>");
        this.jButtonSiguientesEstadoPedidoCompra.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesEstadoPedidoCompra,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesEstadoPedidoCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosEstadoPedidoCompra = new JButtonMe();
		this.jButtonNuevoGuardarCambiosEstadoPedidoCompra.setText("Nue");
        this.jButtonNuevoGuardarCambiosEstadoPedidoCompra.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosEstadoPedidoCompra,"nuevoguardarcambios_button","Nue",this.estadopedidocompraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosEstadoPedidoCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosEstadoPedidoCompra";
		inputMap = this.jButtonNuevoGuardarCambiosEstadoPedidoCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosEstadoPedidoCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosEstadoPedidoCompra"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionEstadoPedidoCompra";
		inputMap = this.jButtonRecargarInformacionEstadoPedidoCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionEstadoPedidoCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionEstadoPedidoCompra"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesEstadoPedidoCompra";
		inputMap = this.jButtonSiguientesEstadoPedidoCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesEstadoPedidoCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesEstadoPedidoCompra"));
		
		//ANTERIORES		
		sMapKey = "AnterioresEstadoPedidoCompra";
		inputMap = this.jButtonAnterioresEstadoPedidoCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresEstadoPedidoCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresEstadoPedidoCompra"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasEstadoPedidoCompra();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesEstadoPedidoCompra.setMinimumSize(new Dimension(this.getWidth(),EstadoPedidoCompraBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EstadoPedidoCompraBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesEstadoPedidoCompra.setMaximumSize(new Dimension(this.getWidth(),EstadoPedidoCompraBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EstadoPedidoCompraBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesEstadoPedidoCompra.setPreferredSize(new Dimension(this.getWidth(),EstadoPedidoCompraBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EstadoPedidoCompraBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionEstadoPedidoCompra = new GridBagLayout();

			this.jPanelPaginacionEstadoPedidoCompra.setLayout(gridaBagLayoutPaginacionEstadoPedidoCompra);						
			
			this.gridBagConstraintsEstadoPedidoCompra = new GridBagConstraints();
			this.gridBagConstraintsEstadoPedidoCompra.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsEstadoPedidoCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoPedidoCompra.gridy = 0;
			this.gridBagConstraintsEstadoPedidoCompra.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionEstadoPedidoCompra.add(this.jButtonAnterioresEstadoPedidoCompra, this.gridBagConstraintsEstadoPedidoCompra);
					
						
			this.gridBagConstraintsEstadoPedidoCompra = new GridBagConstraints();
			this.gridBagConstraintsEstadoPedidoCompra.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsEstadoPedidoCompra.gridy = 0;
			
			this.jPanelPaginacionEstadoPedidoCompra.add(this.jButtonNuevoGuardarCambiosEstadoPedidoCompra, this.gridBagConstraintsEstadoPedidoCompra);
						
			
			this.gridBagConstraintsEstadoPedidoCompra = new GridBagConstraints();
			this.gridBagConstraintsEstadoPedidoCompra.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsEstadoPedidoCompra.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsEstadoPedidoCompra.gridy = 0;
			this.jPanelPaginacionEstadoPedidoCompra.add(this.jButtonSiguientesEstadoPedidoCompra, this.gridBagConstraintsEstadoPedidoCompra);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsEstadoPedidoCompra = new GridBagConstraints();
			this.gridBagConstraintsEstadoPedidoCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoPedidoCompra.gridy = 1;
			this.gridBagConstraintsEstadoPedidoCompra.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEstadoPedidoCompra.add(this.jButtonNuevoEstadoPedidoCompra, this.gridBagConstraintsEstadoPedidoCompra);
						
			
			
			if(!this.estadopedidocompraSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsEstadoPedidoCompra = new GridBagConstraints();
				this.gridBagConstraintsEstadoPedidoCompra.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsEstadoPedidoCompra.gridy = 1;
				this.gridBagConstraintsEstadoPedidoCompra.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionEstadoPedidoCompra.add(this.jButtonGuardarCambiosTablaEstadoPedidoCompra, this.gridBagConstraintsEstadoPedidoCompra);
			}
			
			
			
			this.gridBagConstraintsEstadoPedidoCompra = new GridBagConstraints();
			this.gridBagConstraintsEstadoPedidoCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoPedidoCompra.gridy = 1;
			this.gridBagConstraintsEstadoPedidoCompra.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEstadoPedidoCompra.add(this.jButtonDuplicarEstadoPedidoCompra, this.gridBagConstraintsEstadoPedidoCompra);
			
			this.gridBagConstraintsEstadoPedidoCompra = new GridBagConstraints();
			this.gridBagConstraintsEstadoPedidoCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoPedidoCompra.gridy = 1;
			this.gridBagConstraintsEstadoPedidoCompra.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEstadoPedidoCompra.add(this.jButtonCopiarEstadoPedidoCompra, this.gridBagConstraintsEstadoPedidoCompra);
		
			this.gridBagConstraintsEstadoPedidoCompra = new GridBagConstraints();
			this.gridBagConstraintsEstadoPedidoCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoPedidoCompra.gridy = 1;
			this.gridBagConstraintsEstadoPedidoCompra.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEstadoPedidoCompra.add(this.jButtonVerFormEstadoPedidoCompra, this.gridBagConstraintsEstadoPedidoCompra);
		
			this.gridBagConstraintsEstadoPedidoCompra = new GridBagConstraints();
			this.gridBagConstraintsEstadoPedidoCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoPedidoCompra.gridy = 1;
			this.gridBagConstraintsEstadoPedidoCompra.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionEstadoPedidoCompra.add(this.jButtonCerrarEstadoPedidoCompra, this.gridBagConstraintsEstadoPedidoCompra);
		
		
		
		this.jButtonRecargarInformacionEstadoPedidoCompra.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionEstadoPedidoCompra.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionEstadoPedidoCompra.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionEstadoPedidoCompra, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesEstadoPedidoCompra.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesEstadoPedidoCompra.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesEstadoPedidoCompra.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesEstadoPedidoCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesEstadoPedidoCompra.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesEstadoPedidoCompra.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesEstadoPedidoCompra.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesEstadoPedidoCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesEstadoPedidoCompra.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesEstadoPedidoCompra.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesEstadoPedidoCompra.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesEstadoPedidoCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionEstadoPedidoCompra.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionEstadoPedidoCompra.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionEstadoPedidoCompra.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionEstadoPedidoCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesEstadoPedidoCompra.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesEstadoPedidoCompra.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesEstadoPedidoCompra.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesEstadoPedidoCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesEstadoPedidoCompra.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEstadoPedidoCompra.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEstadoPedidoCompra.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesEstadoPedidoCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarEstadoPedidoCompra.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarEstadoPedidoCompra.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarEstadoPedidoCompra.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarEstadoPedidoCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaEstadoPedidoCompra.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaEstadoPedidoCompra.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaEstadoPedidoCompra.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaEstadoPedidoCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteEstadoPedidoCompra.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteEstadoPedidoCompra.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteEstadoPedidoCompra.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteEstadoPedidoCompra, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosEstadoPedidoCompra.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosEstadoPedidoCompra.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosEstadoPedidoCompra.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosEstadoPedidoCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosEstadoPedidoCompra.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosEstadoPedidoCompra.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosEstadoPedidoCompra.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosEstadoPedidoCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesEstadoPedidoCompra = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesEstadoPedidoCompra = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1EstadoPedidoCompra = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2EstadoPedidoCompra = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3EstadoPedidoCompra = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4EstadoPedidoCompra = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesEstadoPedidoCompra.setLayout(gridaBagParametrosReportesEstadoPedidoCompra);
			this.jPanelParametrosReportesAccionesEstadoPedidoCompra.setLayout(gridaBagParametrosReportesAccionesEstadoPedidoCompra);
			
			
			this.jPanelParametrosAuxiliar1EstadoPedidoCompra.setLayout(gridaBagParametrosAuxiliar1EstadoPedidoCompra);
			this.jPanelParametrosAuxiliar2EstadoPedidoCompra.setLayout(gridaBagParametrosAuxiliar2EstadoPedidoCompra);
			this.jPanelParametrosAuxiliar3EstadoPedidoCompra.setLayout(gridaBagParametrosAuxiliar3EstadoPedidoCompra);
			this.jPanelParametrosAuxiliar4EstadoPedidoCompra.setLayout(gridaBagParametrosAuxiliar4EstadoPedidoCompra);
			//this.jPanelParametrosAuxiliar5EstadoPedidoCompra.setLayout(gridaBagParametrosAuxiliar2EstadoPedidoCompra);			
			
			
			
			
			this.gridBagConstraintsEstadoPedidoCompra = new GridBagConstraints();
			this.gridBagConstraintsEstadoPedidoCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoPedidoCompra.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEstadoPedidoCompra.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstadoPedidoCompra.add(this.jButtonRecargarInformacionEstadoPedidoCompra, this.gridBagConstraintsEstadoPedidoCompra);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsEstadoPedidoCompra = new GridBagConstraints();
			this.gridBagConstraintsEstadoPedidoCompra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoPedidoCompra.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoPedidoCompra.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1EstadoPedidoCompra.add(this.jComboBoxTiposPaginacionEstadoPedidoCompra, this.gridBagConstraintsEstadoPedidoCompra);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsEstadoPedidoCompra = new GridBagConstraints();
			this.gridBagConstraintsEstadoPedidoCompra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoPedidoCompra.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoPedidoCompra.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1EstadoPedidoCompra.add(this.jCheckBoxConAltoMaximoTablaEstadoPedidoCompra, this.gridBagConstraintsEstadoPedidoCompra);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsEstadoPedidoCompra = new GridBagConstraints();
			this.gridBagConstraintsEstadoPedidoCompra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoPedidoCompra.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoPedidoCompra.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1EstadoPedidoCompra.add(this.jComboBoxTiposArchivosReportesEstadoPedidoCompra, this.gridBagConstraintsEstadoPedidoCompra);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsEstadoPedidoCompra = new GridBagConstraints();
			this.gridBagConstraintsEstadoPedidoCompra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoPedidoCompra.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoPedidoCompra.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoPedidoCompra.add(this.jPanelParametrosAuxiliar1EstadoPedidoCompra, this.gridBagConstraintsEstadoPedidoCompra);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsEstadoPedidoCompra = new GridBagConstraints();
			this.gridBagConstraintsEstadoPedidoCompra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoPedidoCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoPedidoCompra.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEstadoPedidoCompra.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4EstadoPedidoCompra.add(this.jComboBoxTiposReportesEstadoPedidoCompra, this.gridBagConstraintsEstadoPedidoCompra);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsEstadoPedidoCompra = new GridBagConstraints();
			this.gridBagConstraintsEstadoPedidoCompra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoPedidoCompra.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoPedidoCompra.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoPedidoCompra.add(this.jPanelParametrosAuxiliar4EstadoPedidoCompra, this.gridBagConstraintsEstadoPedidoCompra);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsEstadoPedidoCompra = new GridBagConstraints();
			this.gridBagConstraintsEstadoPedidoCompra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoPedidoCompra.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoPedidoCompra.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoPedidoCompra.add(this.jComboBoxTiposReportesEstadoPedidoCompra, this.gridBagConstraintsEstadoPedidoCompra);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsEstadoPedidoCompra = new GridBagConstraints();
			this.gridBagConstraintsEstadoPedidoCompra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoPedidoCompra.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoPedidoCompra.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEstadoPedidoCompra.add(this.jCheckBoxGenerarReporteEstadoPedidoCompra, this.gridBagConstraintsEstadoPedidoCompra);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsEstadoPedidoCompra = new GridBagConstraints();
			this.gridBagConstraintsEstadoPedidoCompra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoPedidoCompra.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoPedidoCompra.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoPedidoCompra.add(this.jPanelParametrosAuxiliar2EstadoPedidoCompra, this.gridBagConstraintsEstadoPedidoCompra);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsEstadoPedidoCompra = new GridBagConstraints();
			this.gridBagConstraintsEstadoPedidoCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoPedidoCompra.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEstadoPedidoCompra.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEstadoPedidoCompra.add(this.jLabelAccionesEstadoPedidoCompra, this.gridBagConstraintsEstadoPedidoCompra);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsEstadoPedidoCompra = new GridBagConstraints();
				this.gridBagConstraintsEstadoPedidoCompra.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsEstadoPedidoCompra.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsEstadoPedidoCompra.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesEstadoPedidoCompra.add(this.jButtonAbrirOrderByEstadoPedidoCompra, this.gridBagConstraintsEstadoPedidoCompra);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsEstadoPedidoCompra = new GridBagConstraints();
			this.gridBagConstraintsEstadoPedidoCompra.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsEstadoPedidoCompra.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoPedidoCompra.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstadoPedidoCompra.add(this.jComboBoxTiposSeleccionarEstadoPedidoCompra, this.gridBagConstraintsEstadoPedidoCompra);			
			
			
			/*
			this.gridBagConstraintsEstadoPedidoCompra = new GridBagConstraints();
			this.gridBagConstraintsEstadoPedidoCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoPedidoCompra.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEstadoPedidoCompra.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEstadoPedidoCompra.add(this.jCheckBoxSeleccionarTodosEstadoPedidoCompra, this.gridBagConstraintsEstadoPedidoCompra);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsEstadoPedidoCompra = new GridBagConstraints();
			this.gridBagConstraintsEstadoPedidoCompra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoPedidoCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoPedidoCompra.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEstadoPedidoCompra.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3EstadoPedidoCompra.add(this.jCheckBoxSeleccionarTodosEstadoPedidoCompra, this.gridBagConstraintsEstadoPedidoCompra);															
				
			this.gridBagConstraintsEstadoPedidoCompra = new GridBagConstraints();
			this.gridBagConstraintsEstadoPedidoCompra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoPedidoCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoPedidoCompra.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEstadoPedidoCompra.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3EstadoPedidoCompra.add(this.jCheckBoxSeleccionadosEstadoPedidoCompra, this.gridBagConstraintsEstadoPedidoCompra);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsEstadoPedidoCompra = new GridBagConstraints();
			this.gridBagConstraintsEstadoPedidoCompra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoPedidoCompra.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoPedidoCompra.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoPedidoCompra.add(this.jPanelParametrosAuxiliar3EstadoPedidoCompra, this.gridBagConstraintsEstadoPedidoCompra);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsEstadoPedidoCompra = new GridBagConstraints();
			this.gridBagConstraintsEstadoPedidoCompra.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoPedidoCompra.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstadoPedidoCompra.add(this.jComboBoxTiposRelacionesEstadoPedidoCompra, this.gridBagConstraintsEstadoPedidoCompra);
				
			this.gridBagConstraintsEstadoPedidoCompra = new GridBagConstraints();
			this.gridBagConstraintsEstadoPedidoCompra.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoPedidoCompra.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstadoPedidoCompra.add(this.jComboBoxTiposAccionesEstadoPedidoCompra, this.gridBagConstraintsEstadoPedidoCompra);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosEstadoPedidoCompra = new GridBagLayout();

			this.jScrollPanelDatosEstadoPedidoCompra.setLayout(gridaBagLayoutDatosEstadoPedidoCompra);
			
			this.gridBagConstraintsEstadoPedidoCompra = new GridBagConstraints();
			this.gridBagConstraintsEstadoPedidoCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoPedidoCompra.gridy = 0;
			this.gridBagConstraintsEstadoPedidoCompra.gridx = 0;
			
			this.jScrollPanelDatosEstadoPedidoCompra.add(this.jTableDatosEstadoPedidoCompra, this.gridBagConstraintsEstadoPedidoCompra);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosEstadoPedidoCompra.setViewportView(this.jTableDatosEstadoPedidoCompra);
		this.jTableDatosEstadoPedidoCompra.setFillsViewportHeight(true);
		this.jTableDatosEstadoPedidoCompra.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesEstadoPedidoCompra= new GridBagLayout();
		this.jPanelAccionesEstadoPedidoCompra.setLayout(gridaBagLayoutAccionesEstadoPedidoCompra);
		
		
		/*	
		this.gridBagConstraintsEstadoPedidoCompra = new GridBagConstraints();
		this.gridBagConstraintsEstadoPedidoCompra.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoPedidoCompra.gridy = 0;
		this.gridBagConstraintsEstadoPedidoCompra.gridx = 0;
			
		this.jPanelAccionesEstadoPedidoCompra.add(this.jButtonNuevoEstadoPedidoCompra, this.gridBagConstraintsEstadoPedidoCompra);
		*/
		int iPosXAccion=0;
		
						
		
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutEstadoPedidoCompra = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutEstadoPedidoCompra);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.estadopedidocompraSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsEstadoPedidoCompra = new GridBagConstraints();						
			this.gridBagConstraintsEstadoPedidoCompra.gridy = iGridyPrincipal++;
			this.gridBagConstraintsEstadoPedidoCompra.gridx = 0;		
			//this.gridBagConstraintsEstadoPedidoCompra.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoPedidoCompra.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsEstadoPedidoCompra.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarEstadoPedidoCompra, this.gridBagConstraintsEstadoPedidoCompra);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsEstadoPedidoCompra = new GridBagConstraints();
		this.gridBagConstraintsEstadoPedidoCompra.gridy = iGridyPrincipal++;
		this.gridBagConstraintsEstadoPedidoCompra.gridx = 0;		
		//this.gridBagConstraintsEstadoPedidoCompra.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoPedidoCompra.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsEstadoPedidoCompra.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsEstadoPedidoCompra);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsEstadoPedidoCompra = new GridBagConstraints();
		this.gridBagConstraintsEstadoPedidoCompra.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoPedidoCompra.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesEstadoPedidoCompra, this.gridBagConstraintsEstadoPedidoCompra);								
		
		
		/*
		this.gridBagConstraintsEstadoPedidoCompra = new GridBagConstraints();
		this.gridBagConstraintsEstadoPedidoCompra.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoPedidoCompra.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesEstadoPedidoCompra, this.gridBagConstraintsEstadoPedidoCompra);
		*/		
		
		this.gridBagConstraintsEstadoPedidoCompra = new GridBagConstraints();
		this.gridBagConstraintsEstadoPedidoCompra.gridy =iGridyPrincipal++;
		this.gridBagConstraintsEstadoPedidoCompra.gridx =0;
		this.gridBagConstraintsEstadoPedidoCompra.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsEstadoPedidoCompra.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosEstadoPedidoCompra, this.gridBagConstraintsEstadoPedidoCompra);
				
		
		this.gridBagConstraintsEstadoPedidoCompra = new GridBagConstraints();
		this.gridBagConstraintsEstadoPedidoCompra.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoPedidoCompra.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionEstadoPedidoCompra, this.gridBagConstraintsEstadoPedidoCompra);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(EstadoPedidoCompraJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosEstadoPedidoCompra= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosEstadoPedidoCompra = new GridBagLayout();
			this.jPanelBusquedasParametrosEstadoPedidoCompra.setLayout(gridaBagLayoutBusquedasParametrosEstadoPedidoCompra);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralEstadoPedidoCompra=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralEstadoPedidoCompra.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEstadoPedidoCompra.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEstadoPedidoCompra.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsEstadoPedidoCompra = new GridBagConstraints();
			
			
			
			
			//if(!this.conCargarMinimo) {
			
			//}
			
			this.conMaximoRelaciones=false;
			
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
		this.gridBagConstraintsEstadoPedidoCompra = new GridBagConstraints();
		this.gridBagConstraintsEstadoPedidoCompra.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoPedidoCompra.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposEstadoPedidoCompra, this.gridBagConstraintsEstadoPedidoCompra);
			
			
		this.gridBagConstraintsEstadoPedidoCompra = new GridBagConstraints();
		this.gridBagConstraintsEstadoPedidoCompra.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoPedidoCompra.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosEstadoPedidoCompra, this.gridBagConstraintsEstadoPedidoCompra);
		
			
		this.gridBagConstraintsEstadoPedidoCompra = new GridBagConstraints();
		this.gridBagConstraintsEstadoPedidoCompra.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsEstadoPedidoCompra.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesEstadoPedidoCompra, this.gridBagConstraintsEstadoPedidoCompra);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralEstadoPedidoCompra;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoEstadoPedidoCompra() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoEstadoPedidoCompra = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoEstadoPedidoCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoEstadoPedidoCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoEstadoPedidoCompra.setName("jPanelReporteDinamicoEstadoPedidoCompra"); 
		
		this.jPanelReporteDinamicoEstadoPedidoCompra.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoEstadoPedidoCompra.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoEstadoPedidoCompra.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoEstadoPedidoCompra.setLayout(gridaBagLayoutReporteDinamicoEstadoPedidoCompra);
		
		
		this.jInternalFrameReporteDinamicoEstadoPedidoCompra= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoEstadoPedidoCompra = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteEstadoPedidoCompra= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoEstadoPedidoCompra.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoEstadoPedidoCompra.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoEstadoPedidoCompra.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoEstadoPedidoCompra.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoEstadoPedidoCompra.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoEstadoPedidoCompra.setResizable(true);
	    this.jInternalFrameReporteDinamicoEstadoPedidoCompra.setClosable(true);
	    this.jInternalFrameReporteDinamicoEstadoPedidoCompra.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoEstadoPedidoCompra.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoEstadoPedidoCompra.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoEstadoPedidoCompra.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoEstadoPedidoCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Pedido Compras"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteEstadoPedidoCompra = new JLabelMe();

		this.jLabelColumnasSelectReporteEstadoPedidoCompra.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteEstadoPedidoCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteEstadoPedidoCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteEstadoPedidoCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsEstadoPedidoCompra = new GridBagConstraints();
		this.gridBagConstraintsEstadoPedidoCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoPedidoCompra.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoPedidoCompra.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoEstadoPedidoCompra.add(this.jLabelColumnasSelectReporteEstadoPedidoCompra, this.gridBagConstraintsEstadoPedidoCompra);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteEstadoPedidoCompra = new JList<Reporte>();
		this.jListColumnasSelectReporteEstadoPedidoCompra.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteEstadoPedidoCompra.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteEstadoPedidoCompra.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteEstadoPedidoCompra.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteEstadoPedidoCompra.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteEstadoPedidoCompra=new JScrollPane(this.jListColumnasSelectReporteEstadoPedidoCompra);
			
			this.jScrollColumnasSelectReporteEstadoPedidoCompra.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteEstadoPedidoCompra.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteEstadoPedidoCompra.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteEstadoPedidoCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsEstadoPedidoCompra = new GridBagConstraints();
		this.gridBagConstraintsEstadoPedidoCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoPedidoCompra.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoPedidoCompra.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoEstadoPedidoCompra.add(this.jListColumnasSelectReporteEstadoPedidoCompra, this.gridBagConstraintsEstadoPedidoCompra);
		this.jPanelReporteDinamicoEstadoPedidoCompra.add(this.jScrollColumnasSelectReporteEstadoPedidoCompra, this.gridBagConstraintsEstadoPedidoCompra);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteEstadoPedidoCompra = new JLabelMe();

		this.jLabelRelacionesSelectReporteEstadoPedidoCompra.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteEstadoPedidoCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteEstadoPedidoCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteEstadoPedidoCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteEstadoPedidoCompra = new JList<Reporte>();
		this.jListRelacionesSelectReporteEstadoPedidoCompra.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteEstadoPedidoCompra.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteEstadoPedidoCompra.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteEstadoPedidoCompra.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteEstadoPedidoCompra.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteEstadoPedidoCompra=new JScrollPane(this.jListRelacionesSelectReporteEstadoPedidoCompra);
			
			this.jScrollRelacionesSelectReporteEstadoPedidoCompra.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteEstadoPedidoCompra.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteEstadoPedidoCompra.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteEstadoPedidoCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoEstadoPedidoCompra = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoEstadoPedidoCompra = new JComboBoxMe();
		this.jListColumnasValoresGraficoEstadoPedidoCompra = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoEstadoPedidoCompra = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoEstadoPedidoCompra.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoEstadoPedidoCompra.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoEstadoPedidoCompra.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoEstadoPedidoCompra.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoEstadoPedidoCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoEstadoPedidoCompra = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoEstadoPedidoCompra.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoEstadoPedidoCompra.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoEstadoPedidoCompra.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoEstadoPedidoCompra.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoEstadoPedidoCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoEstadoPedidoCompra = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoEstadoPedidoCompra.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoEstadoPedidoCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoEstadoPedidoCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoEstadoPedidoCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsEstadoPedidoCompra = new GridBagConstraints();
		this.gridBagConstraintsEstadoPedidoCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoPedidoCompra.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoPedidoCompra.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEstadoPedidoCompra.add(this.jLabelGenerarExcelReporteDinamicoEstadoPedidoCompra, this.gridBagConstraintsEstadoPedidoCompra);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoEstadoPedidoCompra = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoEstadoPedidoCompra.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoEstadoPedidoCompra,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoEstadoPedidoCompra.setToolTipText("Generar EXCEL"+" "+EstadoPedidoCompraConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsEstadoPedidoCompra = new GridBagConstraints();
		//this.gridBagConstraintsEstadoPedidoCompra.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsEstadoPedidoCompra.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsEstadoPedidoCompra.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoEstadoPedidoCompra.add(this.jButtonGenerarExcelReporteDinamicoEstadoPedidoCompra, this.gridBagConstraintsEstadoPedidoCompra);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsEstadoPedidoCompra = new GridBagConstraints();
		this.gridBagConstraintsEstadoPedidoCompra.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoPedidoCompra.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEstadoPedidoCompra.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEstadoPedidoCompra.add(this.jComboBoxTiposReportesDinamicoEstadoPedidoCompra, this.gridBagConstraintsEstadoPedidoCompra);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoEstadoPedidoCompra = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoEstadoPedidoCompra.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoEstadoPedidoCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoEstadoPedidoCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoEstadoPedidoCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsEstadoPedidoCompra = new GridBagConstraints();
		this.gridBagConstraintsEstadoPedidoCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoPedidoCompra.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoPedidoCompra.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEstadoPedidoCompra.add(this.jLabelTiposArchivoReporteDinamicoEstadoPedidoCompra, this.gridBagConstraintsEstadoPedidoCompra);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsEstadoPedidoCompra = new GridBagConstraints();
		this.gridBagConstraintsEstadoPedidoCompra.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoPedidoCompra.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEstadoPedidoCompra.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEstadoPedidoCompra.add(this.jComboBoxTiposArchivosReportesDinamicoEstadoPedidoCompra, this.gridBagConstraintsEstadoPedidoCompra);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoEstadoPedidoCompra = new JButtonMe();
		this.jButtonGenerarReporteDinamicoEstadoPedidoCompra.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoEstadoPedidoCompra,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoEstadoPedidoCompra.setToolTipText("Generar"+" "+EstadoPedidoCompraConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsEstadoPedidoCompra = new GridBagConstraints();
		this.gridBagConstraintsEstadoPedidoCompra.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoPedidoCompra.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEstadoPedidoCompra.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEstadoPedidoCompra.add(this.jButtonGenerarReporteDinamicoEstadoPedidoCompra, this.gridBagConstraintsEstadoPedidoCompra);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoEstadoPedidoCompra = new JButtonMe();
		this.jButtonCerrarReporteDinamicoEstadoPedidoCompra.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoEstadoPedidoCompra,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoEstadoPedidoCompra.setToolTipText("Cancelar"+" "+EstadoPedidoCompraConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsEstadoPedidoCompra = new GridBagConstraints();
		this.gridBagConstraintsEstadoPedidoCompra.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoPedidoCompra.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEstadoPedidoCompra.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEstadoPedidoCompra.add(this.jButtonCerrarReporteDinamicoEstadoPedidoCompra, this.gridBagConstraintsEstadoPedidoCompra);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalEstadoPedidoCompra = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoEstadoPedidoCompra= new JScrollPane(jPanelReporteDinamicoEstadoPedidoCompra,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoEstadoPedidoCompra.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoEstadoPedidoCompra.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoEstadoPedidoCompra.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoEstadoPedidoCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Pedido Compras"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsEstadoPedidoCompra = new GridBagConstraints();
		this.gridBagConstraintsEstadoPedidoCompra.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsEstadoPedidoCompra.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsEstadoPedidoCompra.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoEstadoPedidoCompra.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoEstadoPedidoCompra.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalEstadoPedidoCompra);
		this.jInternalFrameReporteDinamicoEstadoPedidoCompra.getContentPane().add(this.jScrollPanelReporteDinamicoEstadoPedidoCompra, this.gridBagConstraintsEstadoPedidoCompra);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionEstadoPedidoCompra() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionEstadoPedidoCompra = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionEstadoPedidoCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionEstadoPedidoCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionEstadoPedidoCompra.setName("jPanelImportacionEstadoPedidoCompra"); 
		
		this.jPanelImportacionEstadoPedidoCompra.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionEstadoPedidoCompra.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionEstadoPedidoCompra.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionEstadoPedidoCompra.setLayout(gridaBagLayoutImportacionEstadoPedidoCompra);
		
		
		this.jInternalFrameImportacionEstadoPedidoCompra= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionEstadoPedidoCompra= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionEstadoPedidoCompra = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteEstadoPedidoCompra= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionEstadoPedidoCompra.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionEstadoPedidoCompra.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionEstadoPedidoCompra.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionEstadoPedidoCompra.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionEstadoPedidoCompra.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionEstadoPedidoCompra.setResizable(true);
	    this.jInternalFrameImportacionEstadoPedidoCompra.setClosable(true);
	    this.jInternalFrameImportacionEstadoPedidoCompra.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionEstadoPedidoCompra.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionEstadoPedidoCompra.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionEstadoPedidoCompra.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionEstadoPedidoCompra.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionEstadoPedidoCompra.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionEstadoPedidoCompra.setResizable(true);
	    this.jInternalFrameImportacionEstadoPedidoCompra.setClosable(true);
	    this.jInternalFrameImportacionEstadoPedidoCompra.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionEstadoPedidoCompra.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionEstadoPedidoCompra.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionEstadoPedidoCompra.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionEstadoPedidoCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Pedido Compras"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionEstadoPedidoCompra = new JLabelMe();

		this.jLabelArchivoImportacionEstadoPedidoCompra.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionEstadoPedidoCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionEstadoPedidoCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionEstadoPedidoCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsEstadoPedidoCompra = new GridBagConstraints();
		this.gridBagConstraintsEstadoPedidoCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoPedidoCompra.gridy = iPosYImportacion;		
		this.gridBagConstraintsEstadoPedidoCompra.gridx = iPosXImportacion++;
			
		this.jPanelImportacionEstadoPedidoCompra.add(this.jLabelArchivoImportacionEstadoPedidoCompra, this.gridBagConstraintsEstadoPedidoCompra);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionEstadoPedidoCompra = new JFileChooser();		
		this.jFileChooserImportacionEstadoPedidoCompra.setToolTipText("ESCOGER ARCHIVO"+" "+EstadoPedidoCompraConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionEstadoPedidoCompra = new JButtonMe();
		this.jButtonAbrirImportacionEstadoPedidoCompra.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionEstadoPedidoCompra,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionEstadoPedidoCompra.setToolTipText("Generar"+" "+EstadoPedidoCompraConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsEstadoPedidoCompra = new GridBagConstraints();
		this.gridBagConstraintsEstadoPedidoCompra.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoPedidoCompra.gridy = iPosYImportacion;
		this.gridBagConstraintsEstadoPedidoCompra.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEstadoPedidoCompra.add(this.jButtonAbrirImportacionEstadoPedidoCompra, this.gridBagConstraintsEstadoPedidoCompra);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionEstadoPedidoCompra = new JLabelMe();

		this.jLabelPathArchivoImportacionEstadoPedidoCompra.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionEstadoPedidoCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionEstadoPedidoCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionEstadoPedidoCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsEstadoPedidoCompra = new GridBagConstraints();
		this.gridBagConstraintsEstadoPedidoCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoPedidoCompra.gridy = iPosYImportacion;		
		this.gridBagConstraintsEstadoPedidoCompra.gridx = iPosXImportacion++;
			
		this.jPanelImportacionEstadoPedidoCompra.add(this.jLabelPathArchivoImportacionEstadoPedidoCompra, this.gridBagConstraintsEstadoPedidoCompra);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionEstadoPedidoCompra=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionEstadoPedidoCompra.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionEstadoPedidoCompra.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionEstadoPedidoCompra.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsEstadoPedidoCompra = new GridBagConstraints();
		this.gridBagConstraintsEstadoPedidoCompra.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoPedidoCompra.gridy = iPosYImportacion;
		this.gridBagConstraintsEstadoPedidoCompra.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEstadoPedidoCompra.add(this.jTextFieldPathArchivoImportacionEstadoPedidoCompra, this.gridBagConstraintsEstadoPedidoCompra);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionEstadoPedidoCompra = new JButtonMe();
		this.jButtonGenerarImportacionEstadoPedidoCompra.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionEstadoPedidoCompra,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionEstadoPedidoCompra.setToolTipText("Generar"+" "+EstadoPedidoCompraConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsEstadoPedidoCompra = new GridBagConstraints();
		this.gridBagConstraintsEstadoPedidoCompra.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoPedidoCompra.gridy = iPosYImportacion;
		this.gridBagConstraintsEstadoPedidoCompra.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEstadoPedidoCompra.add(this.jButtonGenerarImportacionEstadoPedidoCompra, this.gridBagConstraintsEstadoPedidoCompra);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionEstadoPedidoCompra = new JButtonMe();
		this.jButtonCerrarImportacionEstadoPedidoCompra.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionEstadoPedidoCompra,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionEstadoPedidoCompra.setToolTipText("Cancelar"+" "+EstadoPedidoCompraConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsEstadoPedidoCompra = new GridBagConstraints();
		this.gridBagConstraintsEstadoPedidoCompra.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoPedidoCompra.gridy = iPosYImportacion;
		this.gridBagConstraintsEstadoPedidoCompra.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEstadoPedidoCompra.add(this.jButtonCerrarImportacionEstadoPedidoCompra, this.gridBagConstraintsEstadoPedidoCompra);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalEstadoPedidoCompra = new GridBagLayout();
		
		this.jScrollPanelImportacionEstadoPedidoCompra= new JScrollPane(jPanelImportacionEstadoPedidoCompra,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsEstadoPedidoCompra = new GridBagConstraints();
		this.gridBagConstraintsEstadoPedidoCompra.gridy =iPosYImportacion;
		this.gridBagConstraintsEstadoPedidoCompra.gridx =iPosXImportacion;
		this.gridBagConstraintsEstadoPedidoCompra.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionEstadoPedidoCompra.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionEstadoPedidoCompra.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalEstadoPedidoCompra);
		this.jInternalFrameImportacionEstadoPedidoCompra.getContentPane().add(this.jScrollPanelImportacionEstadoPedidoCompra, this.gridBagConstraintsEstadoPedidoCompra);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByEstadoPedidoCompra(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByEstadoPedidoCompra = new JButtonMe();
			this.jButtonAbrirOrderByEstadoPedidoCompra.setText("Orden");
			this.jButtonAbrirOrderByEstadoPedidoCompra.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByEstadoPedidoCompra,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByEstadoPedidoCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByEstadoPedidoCompra";
			inputMap = this.jButtonAbrirOrderByEstadoPedidoCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByEstadoPedidoCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByEstadoPedidoCompra"));
		
		
			GridBagLayout gridaBagLayoutOrderByEstadoPedidoCompra = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByEstadoPedidoCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByEstadoPedidoCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByEstadoPedidoCompra.setName("jPanelOrderByEstadoPedidoCompra"); 
			
			this.jPanelOrderByEstadoPedidoCompra.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByEstadoPedidoCompra.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByEstadoPedidoCompra.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByEstadoPedidoCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByEstadoPedidoCompra.setLayout(gridaBagLayoutOrderByEstadoPedidoCompra);
			
			
			this.jTableDatosEstadoPedidoCompraOrderBy = new JTableMe();        
			this.jTableDatosEstadoPedidoCompraOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosEstadoPedidoCompraOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosEstadoPedidoCompraOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosEstadoPedidoCompraOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosEstadoPedidoCompraOrderBy.setViewportView(this.jTableDatosEstadoPedidoCompraOrderBy);
			this.jTableDatosEstadoPedidoCompraOrderBy.setFillsViewportHeight(true);
			this.jTableDatosEstadoPedidoCompraOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByEstadoPedidoCompra= new OrderByJInternalFrame();
			this.jInternalFrameOrderByEstadoPedidoCompra= new OrderByJInternalFrame();
			this.jScrollPanelOrderByEstadoPedidoCompra = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteEstadoPedidoCompra= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByEstadoPedidoCompra.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByEstadoPedidoCompra.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByEstadoPedidoCompra.setTitle("Orden");
			this.jInternalFrameOrderByEstadoPedidoCompra.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByEstadoPedidoCompra.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByEstadoPedidoCompra.setResizable(true);
			this.jInternalFrameOrderByEstadoPedidoCompra.setClosable(true);
			this.jInternalFrameOrderByEstadoPedidoCompra.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByEstadoPedidoCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByEstadoPedidoCompra.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByEstadoPedidoCompra.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByEstadoPedidoCompra.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByEstadoPedidoCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByEstadoPedidoCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Pedido Compras"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsEstadoPedidoCompra = new GridBagConstraints();
			this.gridBagConstraintsEstadoPedidoCompra.gridy =iPosYOrderBy++;
			this.gridBagConstraintsEstadoPedidoCompra.gridx =iPosXOrderBy;
			this.gridBagConstraintsEstadoPedidoCompra.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsEstadoPedidoCompra.ipady =150;
				
			this.jPanelOrderByEstadoPedidoCompra.add(jScrollPanelDatosEstadoPedidoCompraOrderBy, this.gridBagConstraintsEstadoPedidoCompra);//this.jTableDatosEstadoPedidoCompraTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByEstadoPedidoCompra = new JButtonMe();
			this.jButtonCerrarOrderByEstadoPedidoCompra.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByEstadoPedidoCompra,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByEstadoPedidoCompra.setToolTipText("Cancelar"+" "+EstadoPedidoCompraConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByEstadoPedidoCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsEstadoPedidoCompra = new GridBagConstraints();
			this.gridBagConstraintsEstadoPedidoCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoPedidoCompra.gridy = iPosYOrderBy++;
			this.gridBagConstraintsEstadoPedidoCompra.gridx = iPosXOrderBy;
									
			this.jPanelOrderByEstadoPedidoCompra.add(this.jButtonCerrarOrderByEstadoPedidoCompra, this.gridBagConstraintsEstadoPedidoCompra);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalEstadoPedidoCompra = new GridBagLayout();
			
			this.jScrollPanelOrderByEstadoPedidoCompra= new JScrollPane(jPanelOrderByEstadoPedidoCompra,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsEstadoPedidoCompra = new GridBagConstraints();
			this.gridBagConstraintsEstadoPedidoCompra.gridy =iPosYOrderBy;
			this.gridBagConstraintsEstadoPedidoCompra.gridx =iPosXOrderBy;
			this.gridBagConstraintsEstadoPedidoCompra.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByEstadoPedidoCompra.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByEstadoPedidoCompra.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalEstadoPedidoCompra);
			
			this.jInternalFrameOrderByEstadoPedidoCompra.getContentPane().add(this.jScrollPanelOrderByEstadoPedidoCompra, this.gridBagConstraintsEstadoPedidoCompra);			
		
		} else {
			this.jButtonAbrirOrderByEstadoPedidoCompra = new JButtonMe();
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
			&& this.estadopedidocompraSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosEstadoPedidoCompra.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosEstadoPedidoCompra.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosEstadoPedidoCompra.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosEstadoPedidoCompra.getRowHeight();//EstadoPedidoCompraConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.estadopedidocompraSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > EstadoPedidoCompraConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaEstadoPedidoCompra.isSelected()) {
					iHeightTable=EstadoPedidoCompraConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < EstadoPedidoCompraConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=EstadoPedidoCompraConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > EstadoPedidoCompraConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaEstadoPedidoCompra.isSelected()) {
					iHeightTable=EstadoPedidoCompraConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < EstadoPedidoCompraConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=EstadoPedidoCompraConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosEstadoPedidoCompra.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosEstadoPedidoCompra.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosEstadoPedidoCompra.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosEstadoPedidoCompra.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosEstadoPedidoCompra.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosEstadoPedidoCompra.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByEstadoPedidoCompra!=null && this.jInternalFrameOrderByEstadoPedidoCompra.getjTableDatosOrderBy()!=null) {
			//if(!this.estadopedidocompraSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByEstadoPedidoCompra.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByEstadoPedidoCompra.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByEstadoPedidoCompra.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByEstadoPedidoCompra.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByEstadoPedidoCompra.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByEstadoPedidoCompra.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByEstadoPedidoCompra.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosEstadoPedidoCompra.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosEstadoPedidoCompra.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosEstadoPedidoCompra.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=estadopedidocompraLogic.getEstadoPedidoCompras().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=estadopedidocompras.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<EstadoPedidoCompra> TraerEstadoPedidoCompraBeans(List<EstadoPedidoCompra> estadopedidocompras,ArrayList<Classe> classes)throws Exception {
		try {
			for(EstadoPedidoCompra estadopedidocompra:estadopedidocompras) {
					
				if(!(EstadoPedidoCompraConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || EstadoPedidoCompraConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					estadopedidocompra.setsDetalleGeneralEntityReporte(EstadoPedidoCompraConstantesFunciones.getEstadoPedidoCompraDescripcion(estadopedidocompra));
										
						
					
						
					
				} else  {
							
					//estadopedidocompra.setsDetalleGeneralEntityReporte(estadopedidocompra.getsDetalleGeneralEntityReporte());
										
				}
				
				//estadopedidocomprabeans.add(estadopedidocomprabean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return estadopedidocompras;
    }
	//PARA REPORTES FIN
}
