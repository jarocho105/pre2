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
package com.bydan.erp.puntoventa.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;

import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.comisiones.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;

//import com.bydan.erp.puntoventa.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.puntoventa.business.entity.*;
import com.bydan.erp.puntoventa.util.EstadoPedidoPuntoVentaConstantesFunciones;

import com.bydan.erp.puntoventa.business.logic.*;
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
public class EstadoPedidoPuntoVentaJInternalFrame extends EstadoPedidoPuntoVentaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarEstadoPedidoPuntoVenta;
	
	protected JMenuBar jmenuBarEstadoPedidoPuntoVenta;
	
	protected JMenu jmenuEstadoPedidoPuntoVenta;
	protected JMenu jmenuDatosEstadoPedidoPuntoVenta;
	protected JMenu jmenuArchivoEstadoPedidoPuntoVenta;
	protected JMenu jmenuAccionesEstadoPedidoPuntoVenta;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosEstadoPedidoPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutEstadoPedidoPuntoVenta;	
	protected GridBagConstraints gridBagConstraintsEstadoPedidoPuntoVenta;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public EstadoPedidoPuntoVentaDetalleFormJInternalFrame jInternalFrameDetalleFormEstadoPedidoPuntoVenta;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoEstadoPedidoPuntoVenta;	
	protected ImportacionJInternalFrame jInternalFrameImportacionEstadoPedidoPuntoVenta;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public EstadoPedidoPuntoVentaSessionBean estadopedidopuntoventaSessionBean;
		
	
	
	
	//protected JDesktopPane jDesktopPane;
	public List<EstadoPedidoPuntoVenta> estadopedidopuntoventas;		
	public List<EstadoPedidoPuntoVenta> estadopedidopuntoventasEliminados;	
	public List<EstadoPedidoPuntoVenta> estadopedidopuntoventasAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByEstadoPedidoPuntoVenta;		
	protected JButton jButtonAbrirOrderByEstadoPedidoPuntoVenta;
	
	
	//protected JPanel jPanelOrderByEstadoPedidoPuntoVenta;
	//public JScrollPane jScrollPanelOrderByEstadoPedidoPuntoVenta;	
	//protected JButton jButtonCerrarOrderByEstadoPedidoPuntoVenta;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public EstadoPedidoPuntoVentaLogic estadopedidopuntoventaLogic;
	
	
	
	public JScrollPane jScrollPanelDatosEstadoPedidoPuntoVenta;
	public JScrollPane jScrollPanelDatosEdicionEstadoPedidoPuntoVenta;
	public JScrollPane jScrollPanelDatosGeneralEstadoPedidoPuntoVenta;
    
	
	
	//public JScrollPane jScrollPanelDatosEstadoPedidoPuntoVentaOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoEstadoPedidoPuntoVenta;
	//public JScrollPane jScrollPanelImportacionEstadoPedidoPuntoVenta;
	
	
	
	protected JPanel jPanelAccionesEstadoPedidoPuntoVenta;
	
    protected JPanel jPanelPaginacionEstadoPedidoPuntoVenta;
    protected JPanel jPanelParametrosReportesEstadoPedidoPuntoVenta;
	protected JPanel jPanelParametrosReportesAccionesEstadoPedidoPuntoVenta;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1EstadoPedidoPuntoVenta;
	protected JPanel jPanelParametrosAuxiliar2EstadoPedidoPuntoVenta;
	protected JPanel jPanelParametrosAuxiliar3EstadoPedidoPuntoVenta;
	protected JPanel jPanelParametrosAuxiliar4EstadoPedidoPuntoVenta;
	//protected JPanel jPanelParametrosAuxiliar5EstadoPedidoPuntoVenta;
	
	
	
	//protected JPanel jPanelReporteDinamicoEstadoPedidoPuntoVenta;
	//protected JPanel jPanelImportacionEstadoPedidoPuntoVenta;
	
	
	public JTable jTableDatosEstadoPedidoPuntoVenta;
	
	
	
	//public JTable jTableDatosEstadoPedidoPuntoVentaOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoEstadoPedidoPuntoVenta;
	protected JButton jButtonDuplicarEstadoPedidoPuntoVenta;
	protected JButton jButtonCopiarEstadoPedidoPuntoVenta;
	protected JButton jButtonVerFormEstadoPedidoPuntoVenta;
	protected JButton jButtonNuevoRelacionesEstadoPedidoPuntoVenta;
	protected JButton jButtonModificarEstadoPedidoPuntoVenta;
	
    protected JButton jButtonGuardarCambiosTablaEstadoPedidoPuntoVenta;
	protected JButton jButtonCerrarEstadoPedidoPuntoVenta;
	
	
	protected JButton jButtonRecargarInformacionEstadoPedidoPuntoVenta;
	protected JButton jButtonProcesarInformacionEstadoPedidoPuntoVenta;
	
	
	protected JButton jButtonAnterioresEstadoPedidoPuntoVenta;
	protected JButton jButtonSiguientesEstadoPedidoPuntoVenta;
	protected JButton jButtonNuevoGuardarCambiosEstadoPedidoPuntoVenta;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoEstadoPedidoPuntoVenta;
	//protected JButton jButtonCerrarReporteDinamicoEstadoPedidoPuntoVenta;
	//protected JButton jButtonGenerarExcelReporteDinamicoEstadoPedidoPuntoVenta;	
	
	
	
	//protected JButton jButtonAbrirImportacionEstadoPedidoPuntoVenta;
	//protected JButton jButtonGenerarImportacionEstadoPedidoPuntoVenta;
	//protected JButton jButtonCerrarImportacionEstadoPedidoPuntoVenta;
	//protected JFileChooser jFileChooserImportacionEstadoPedidoPuntoVenta;
	//protected File fileImportacionEstadoPedidoPuntoVenta;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarEstadoPedidoPuntoVenta;
	protected JButton jButtonDuplicarToolBarEstadoPedidoPuntoVenta;
	protected JButton jButtonNuevoRelacionesToolBarEstadoPedidoPuntoVenta;
	
	
	public JButton jButtonGuardarCambiosToolBarEstadoPedidoPuntoVenta;
	protected JButton jButtonCopiarToolBarEstadoPedidoPuntoVenta;
	protected JButton jButtonVerFormToolBarEstadoPedidoPuntoVenta;
	public JButton jButtonGuardarCambiosTablaToolBarEstadoPedidoPuntoVenta;
	protected JButton jButtonMostrarOcultarTablaToolBarEstadoPedidoPuntoVenta;
	protected JButton jButtonCerrarToolBarEstadoPedidoPuntoVenta;
	
	protected JButton jButtonRecargarInformacionToolBarEstadoPedidoPuntoVenta;
	protected JButton jButtonProcesarInformacionToolBarEstadoPedidoPuntoVenta;
	protected JButton jButtonAnterioresToolBarEstadoPedidoPuntoVenta;
	protected JButton jButtonSiguientesToolBarEstadoPedidoPuntoVenta;
	protected JButton jButtonNuevoGuardarCambiosToolBarEstadoPedidoPuntoVenta;
	protected JButton jButtonAbrirOrderByToolBarEstadoPedidoPuntoVenta;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoEstadoPedidoPuntoVenta;
	protected JMenuItem jMenuItemDuplicarEstadoPedidoPuntoVenta;
	protected JMenuItem jMenuItemNuevoRelacionesEstadoPedidoPuntoVenta;
	
	
	protected JMenuItem jMenuItemGuardarCambiosEstadoPedidoPuntoVenta;
	protected JMenuItem jMenuItemCopiarEstadoPedidoPuntoVenta;
	protected JMenuItem jMenuItemVerFormEstadoPedidoPuntoVenta;
	protected JMenuItem jMenuItemGuardarCambiosTablaEstadoPedidoPuntoVenta;
	protected JMenuItem jMenuItemCerrarEstadoPedidoPuntoVenta;
	protected JMenuItem jMenuItemDetalleCerrarEstadoPedidoPuntoVenta;
	protected JMenuItem jMenuItemDetalleAbrirOrderByEstadoPedidoPuntoVenta;
	protected JMenuItem jMenuItemDetalleMostarOcultarEstadoPedidoPuntoVenta;
	
	protected JMenuItem jMenuItemRecargarInformacionEstadoPedidoPuntoVenta;
	protected JMenuItem jMenuItemProcesarInformacionEstadoPedidoPuntoVenta;
	protected JMenuItem jMenuItemAnterioresEstadoPedidoPuntoVenta;
	protected JMenuItem jMenuItemSiguientesEstadoPedidoPuntoVenta;
	protected JMenuItem jMenuItemNuevoGuardarCambiosEstadoPedidoPuntoVenta;
	protected JMenuItem jMenuItemAbrirOrderByEstadoPedidoPuntoVenta;
	protected JMenuItem jMenuItemMostrarOcultarEstadoPedidoPuntoVenta;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesEstadoPedidoPuntoVenta;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosEstadoPedidoPuntoVenta;
	protected JCheckBox jCheckBoxSeleccionadosEstadoPedidoPuntoVenta;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaEstadoPedidoPuntoVenta;
	protected JCheckBox jCheckBoxConGraficoReporteEstadoPedidoPuntoVenta;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesEstadoPedidoPuntoVenta;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesEstadoPedidoPuntoVenta;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoEstadoPedidoPuntoVenta;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoEstadoPedidoPuntoVenta;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesEstadoPedidoPuntoVenta;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionEstadoPedidoPuntoVenta;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesEstadoPedidoPuntoVenta;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesEstadoPedidoPuntoVenta;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarEstadoPedidoPuntoVenta;
	protected JTextField jTextFieldValorCampoGeneralEstadoPedidoPuntoVenta;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteEstadoPedidoPuntoVenta;
	//public JList<Reporte> jListColumnasSelectReporteEstadoPedidoPuntoVenta;
	//public JScrollPane jScrollColumnasSelectReporteEstadoPedidoPuntoVenta;
	
	//public JLabel jLabelRelacionesSelectReporteEstadoPedidoPuntoVenta;
	//public JList<Reporte> jListRelacionesSelectReporteEstadoPedidoPuntoVenta;
	//public JScrollPane jScrollRelacionesSelectReporteEstadoPedidoPuntoVenta;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoEstadoPedidoPuntoVenta;
	//protected JCheckBox jCheckBoxConGraficoDinamicoEstadoPedidoPuntoVenta;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoEstadoPedidoPuntoVenta;
	//public JLabel jLabelTiposArchivoReporteDinamicoEstadoPedidoPuntoVenta;
	
		
	//public JLabel jLabelArchivoImportacionEstadoPedidoPuntoVenta;	
	//public JLabel jLabelPathArchivoImportacionEstadoPedidoPuntoVenta;
	//protected JTextField jTextFieldPathArchivoImportacionEstadoPedidoPuntoVenta;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoEstadoPedidoPuntoVenta;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoEstadoPedidoPuntoVenta;
	
	//public JLabel jLabelColumnaCategoriaValorEstadoPedidoPuntoVenta;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorEstadoPedidoPuntoVenta;
	
	//public JLabel jLabelColumnasValoresGraficoEstadoPedidoPuntoVenta;
	//public JList<Reporte> jListColumnasValoresGraficoEstadoPedidoPuntoVenta;
	//public JScrollPane jScrollColumnasValoresGraficoEstadoPedidoPuntoVenta;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoEstadoPedidoPuntoVenta;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoEstadoPedidoPuntoVenta;	
	
	
	
	
	
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
	//public int iHeightFormulario=286;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public EstadoPedidoPuntoVentaJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("EstadoPedidoPuntoVenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoPedidoPuntoVentaJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EstadoPedidoPuntoVenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoPedidoPuntoVentaJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EstadoPedidoPuntoVenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoPedidoPuntoVentaJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("EstadoPedidoPuntoVenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionEstadoPedidoPuntoVenta)	{
		this.jButtonRecargarInformacionEstadoPedidoPuntoVenta = jButtonRecargarInformacionEstadoPedidoPuntoVenta;
	}
	
	public JButton getjButtonProcesarInformacionEstadoPedidoPuntoVenta() {
		return this.jButtonProcesarInformacionEstadoPedidoPuntoVenta;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionEstadoPedidoPuntoVenta)	{
		this.jButtonProcesarInformacionEstadoPedidoPuntoVenta = jButtonProcesarInformacionEstadoPedidoPuntoVenta;
	}
	
	
	public JButton getjButtonRecargarInformacionEstadoPedidoPuntoVenta() {
		return this.jButtonRecargarInformacionEstadoPedidoPuntoVenta;
	}
	
	
	public List<EstadoPedidoPuntoVenta> getestadopedidopuntoventas() {
		return this.estadopedidopuntoventas;
	}

	public void setestadopedidopuntoventas(List<EstadoPedidoPuntoVenta> estadopedidopuntoventas) {
		this.estadopedidopuntoventas = estadopedidopuntoventas;
	}
	
	public List<EstadoPedidoPuntoVenta> getestadopedidopuntoventasAux() {
		return this.estadopedidopuntoventasAux;
	}

	public void setestadopedidopuntoventasAux(List<EstadoPedidoPuntoVenta> estadopedidopuntoventasAux) {
		this.estadopedidopuntoventasAux = estadopedidopuntoventasAux;
	}
	
	public List<EstadoPedidoPuntoVenta> getestadopedidopuntoventasEliminados() {
		return this.estadopedidopuntoventasEliminados;
	}

	public void setEstadoPedidoPuntoVentasEliminados(List<EstadoPedidoPuntoVenta> estadopedidopuntoventasEliminados) {
		this.estadopedidopuntoventasEliminados = estadopedidopuntoventasEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarEstadoPedidoPuntoVenta() {
		return jComboBoxTiposSeleccionarEstadoPedidoPuntoVenta;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarEstadoPedidoPuntoVenta(
			JComboBox jComboBoxTiposSeleccionarEstadoPedidoPuntoVenta) {
		this.jComboBoxTiposSeleccionarEstadoPedidoPuntoVenta = jComboBoxTiposSeleccionarEstadoPedidoPuntoVenta;
	}
	
	public void setBorderResaltarTiposSeleccionarEstadoPedidoPuntoVenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarEstadoPedidoPuntoVenta.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarEstadoPedidoPuntoVenta .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralEstadoPedidoPuntoVenta() {
		return jTextFieldValorCampoGeneralEstadoPedidoPuntoVenta;
	}

	public void setjTextFieldValorCampoGeneralEstadoPedidoPuntoVenta(
			JTextField jTextFieldValorCampoGeneralEstadoPedidoPuntoVenta) {
		this.jTextFieldValorCampoGeneralEstadoPedidoPuntoVenta = jTextFieldValorCampoGeneralEstadoPedidoPuntoVenta;
	}

	public void setBorderResaltarValorCampoGeneralEstadoPedidoPuntoVenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoPedidoPuntoVenta.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralEstadoPedidoPuntoVenta .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosEstadoPedidoPuntoVenta() {
		return this.jCheckBoxSeleccionarTodosEstadoPedidoPuntoVenta;
	}

	public void setjCheckBoxSeleccionarTodosEstadoPedidoPuntoVenta(
			JCheckBox jCheckBoxSeleccionarTodosEstadoPedidoPuntoVenta) {
		this.jCheckBoxSeleccionarTodosEstadoPedidoPuntoVenta = jCheckBoxSeleccionarTodosEstadoPedidoPuntoVenta;
	}

	public void setBorderResaltarSeleccionarTodosEstadoPedidoPuntoVenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoPedidoPuntoVenta.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosEstadoPedidoPuntoVenta .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosEstadoPedidoPuntoVenta() {
		return this.jCheckBoxSeleccionadosEstadoPedidoPuntoVenta;
	}

	public void setjCheckBoxSeleccionadosEstadoPedidoPuntoVenta(
			JCheckBox jCheckBoxSeleccionadosEstadoPedidoPuntoVenta) {
		this.jCheckBoxSeleccionadosEstadoPedidoPuntoVenta = jCheckBoxSeleccionadosEstadoPedidoPuntoVenta;
	}
	
	public void setBorderResaltarSeleccionadosEstadoPedidoPuntoVenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoPedidoPuntoVenta.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosEstadoPedidoPuntoVenta .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesEstadoPedidoPuntoVenta() {
		return this.jComboBoxTiposArchivosReportesEstadoPedidoPuntoVenta;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesEstadoPedidoPuntoVenta(
			JComboBox jComboBoxTiposArchivosReportesEstadoPedidoPuntoVenta) {
		this.jComboBoxTiposArchivosReportesEstadoPedidoPuntoVenta = jComboBoxTiposArchivosReportesEstadoPedidoPuntoVenta;
	}

	public void setBorderResaltarTiposArchivosReportesEstadoPedidoPuntoVenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoPedidoPuntoVenta.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesEstadoPedidoPuntoVenta .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesEstadoPedidoPuntoVenta() {
		return this.jComboBoxTiposReportesEstadoPedidoPuntoVenta;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesEstadoPedidoPuntoVenta(
			JComboBox jComboBoxTiposReportesEstadoPedidoPuntoVenta) {
		this.jComboBoxTiposReportesEstadoPedidoPuntoVenta = jComboBoxTiposReportesEstadoPedidoPuntoVenta;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoEstadoPedidoPuntoVenta() {
	//	return jComboBoxTiposReportesDinamicoEstadoPedidoPuntoVenta;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoEstadoPedidoPuntoVenta(
	//		JComboBox jComboBoxTiposReportesDinamicoEstadoPedidoPuntoVenta) {
	//	this.jComboBoxTiposReportesDinamicoEstadoPedidoPuntoVenta = jComboBoxTiposReportesDinamicoEstadoPedidoPuntoVenta;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoEstadoPedidoPuntoVenta() {
	//	return jComboBoxTiposArchivosReportesDinamicoEstadoPedidoPuntoVenta;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoEstadoPedidoPuntoVenta(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoEstadoPedidoPuntoVenta) {
	//	this.jComboBoxTiposArchivosReportesDinamicoEstadoPedidoPuntoVenta = jComboBoxTiposArchivosReportesDinamicoEstadoPedidoPuntoVenta;
	//}
	
	public void setBorderResaltarTiposReportesEstadoPedidoPuntoVenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoPedidoPuntoVenta.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesEstadoPedidoPuntoVenta .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesEstadoPedidoPuntoVenta() {
		return this.jComboBoxTiposGraficosReportesEstadoPedidoPuntoVenta;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesEstadoPedidoPuntoVenta(
			JComboBox jComboBoxTiposGraficosReportesEstadoPedidoPuntoVenta) {
		this.jComboBoxTiposGraficosReportesEstadoPedidoPuntoVenta = jComboBoxTiposGraficosReportesEstadoPedidoPuntoVenta;
	}
	
	public void setBorderResaltarTiposGraficosReportesEstadoPedidoPuntoVenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoPedidoPuntoVenta.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesEstadoPedidoPuntoVenta .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionEstadoPedidoPuntoVenta() {
		return this.jComboBoxTiposPaginacionEstadoPedidoPuntoVenta;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionEstadoPedidoPuntoVenta(
			JComboBox jComboBoxTiposPaginacionEstadoPedidoPuntoVenta) {
		this.jComboBoxTiposPaginacionEstadoPedidoPuntoVenta = jComboBoxTiposPaginacionEstadoPedidoPuntoVenta;
	}
	
	public void setBorderResaltarTiposPaginacionEstadoPedidoPuntoVenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoPedidoPuntoVenta.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionEstadoPedidoPuntoVenta .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesEstadoPedidoPuntoVenta() {
		return this.jComboBoxTiposRelacionesEstadoPedidoPuntoVenta;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesEstadoPedidoPuntoVenta() {
		return this.jComboBoxTiposAccionesEstadoPedidoPuntoVenta;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesEstadoPedidoPuntoVenta(
			JComboBox jComboBoxTiposRelacionesEstadoPedidoPuntoVenta) {
		this.jComboBoxTiposRelacionesEstadoPedidoPuntoVenta = jComboBoxTiposRelacionesEstadoPedidoPuntoVenta;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesEstadoPedidoPuntoVenta(
			JComboBox jComboBoxTiposAccionesEstadoPedidoPuntoVenta) {
		this.jComboBoxTiposAccionesEstadoPedidoPuntoVenta = jComboBoxTiposAccionesEstadoPedidoPuntoVenta;
	}
	
	public void setBorderResaltarTiposRelacionesEstadoPedidoPuntoVenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoPedidoPuntoVenta.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesEstadoPedidoPuntoVenta .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesEstadoPedidoPuntoVenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoPedidoPuntoVenta.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesEstadoPedidoPuntoVenta .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoEstadoPedidoPuntoVenta() {
	//	return jCheckBoxConGraficoDinamicoEstadoPedidoPuntoVenta;
	//}

	//public void setjCheckBoxConGraficoDinamicoEstadoPedidoPuntoVenta(
	//		JCheckBox jCheckBoxConGraficoDinamicoEstadoPedidoPuntoVenta) {
	//	this.jCheckBoxConGraficoDinamicoEstadoPedidoPuntoVenta = jCheckBoxConGraficoDinamicoEstadoPedidoPuntoVenta;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoEstadoPedidoPuntoVenta() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarEstadoPedidoPuntoVenta.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoEstadoPedidoPuntoVenta .setBorder(borderResaltar);		
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
		this.estadopedidopuntoventaSessionBean=new EstadoPedidoPuntoVentaSessionBean();
		
		this.estadopedidopuntoventaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.estadopedidopuntoventaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.estadopedidopuntoventaSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=EstadoPedidoPuntoVentaJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=EstadoPedidoPuntoVentaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		EstadoPedidoPuntoVentaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		EstadoPedidoPuntoVentaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		EstadoPedidoPuntoVentaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Estado Pedido MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 910) {
			iHeight=910;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.estadopedidopuntoventaSessionBean.getEsGuardarRelacionado()) {
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
		
		EstadoPedidoPuntoVentaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("EstadoPedidoPuntoVenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarEstadoPedidoPuntoVenta= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarEstadoPedidoPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarEstadoPedidoPuntoVenta,this.jTtoolBarEstadoPedidoPuntoVenta,
							"nuevo","nuevo","Nuevo"+" "+EstadoPedidoPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarEstadoPedidoPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarEstadoPedidoPuntoVenta,this.jTtoolBarEstadoPedidoPuntoVenta,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarEstadoPedidoPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarEstadoPedidoPuntoVenta,this.jTtoolBarEstadoPedidoPuntoVenta,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+EstadoPedidoPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarEstadoPedidoPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarEstadoPedidoPuntoVenta,this.jTtoolBarEstadoPedidoPuntoVenta,
							"duplicar","duplicar","Duplicar"+" "+EstadoPedidoPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarEstadoPedidoPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarEstadoPedidoPuntoVenta,this.jTtoolBarEstadoPedidoPuntoVenta,
							"copiar","copiar","Copiar"+" "+EstadoPedidoPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarEstadoPedidoPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarEstadoPedidoPuntoVenta,this.jTtoolBarEstadoPedidoPuntoVenta,
							"ver_form","ver_form","Ver"+" "+EstadoPedidoPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarEstadoPedidoPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEstadoPedidoPuntoVenta,this.jTtoolBarEstadoPedidoPuntoVenta,
							"recargar","recargar","Recargar"+" "+EstadoPedidoPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarEstadoPedidoPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEstadoPedidoPuntoVenta,this.jTtoolBarEstadoPedidoPuntoVenta,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarEstadoPedidoPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEstadoPedidoPuntoVenta,this.jTtoolBarEstadoPedidoPuntoVenta,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarEstadoPedidoPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarEstadoPedidoPuntoVenta,this.jTtoolBarEstadoPedidoPuntoVenta,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarEstadoPedidoPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarEstadoPedidoPuntoVenta,this.jTtoolBarEstadoPedidoPuntoVenta,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarEstadoPedidoPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarEstadoPedidoPuntoVenta,this.jTtoolBarEstadoPedidoPuntoVenta,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+EstadoPedidoPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarEstadoPedidoPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarEstadoPedidoPuntoVenta,this.jTtoolBarEstadoPedidoPuntoVenta,
							"cerrar","cerrar","Salir"+" "+EstadoPedidoPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarEstadoPedidoPuntoVenta=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarEstadoPedidoPuntoVenta;
			
				this.jButtonProcesarInformacionToolBarEstadoPedidoPuntoVenta=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarEstadoPedidoPuntoVenta;
				
		//protected JButton jButtonModificarToolBarEstadoPedidoPuntoVenta;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarEstadoPedidoPuntoVenta=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuEstadoPedidoPuntoVenta=new JMenuMe("General");
		this.jmenuArchivoEstadoPedidoPuntoVenta=new JMenuMe("Archivo");
		this.jmenuAccionesEstadoPedidoPuntoVenta=new JMenuMe("Acciones");
		this.jmenuDatosEstadoPedidoPuntoVenta=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoEstadoPedidoPuntoVenta= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoEstadoPedidoPuntoVenta.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoEstadoPedidoPuntoVenta,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoEstadoPedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarEstadoPedidoPuntoVenta= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarEstadoPedidoPuntoVenta.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarEstadoPedidoPuntoVenta,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarEstadoPedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesEstadoPedidoPuntoVenta= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesEstadoPedidoPuntoVenta.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesEstadoPedidoPuntoVenta,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesEstadoPedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosEstadoPedidoPuntoVenta= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosEstadoPedidoPuntoVenta.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosEstadoPedidoPuntoVenta,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosEstadoPedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarEstadoPedidoPuntoVenta= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarEstadoPedidoPuntoVenta.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarEstadoPedidoPuntoVenta,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarEstadoPedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormEstadoPedidoPuntoVenta= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormEstadoPedidoPuntoVenta.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormEstadoPedidoPuntoVenta,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormEstadoPedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaEstadoPedidoPuntoVenta= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaEstadoPedidoPuntoVenta.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaEstadoPedidoPuntoVenta,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaEstadoPedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarEstadoPedidoPuntoVenta= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarEstadoPedidoPuntoVenta.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarEstadoPedidoPuntoVenta,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarEstadoPedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionEstadoPedidoPuntoVenta= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionEstadoPedidoPuntoVenta.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionEstadoPedidoPuntoVenta,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionEstadoPedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionEstadoPedidoPuntoVenta= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionEstadoPedidoPuntoVenta.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionEstadoPedidoPuntoVenta,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresEstadoPedidoPuntoVenta= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresEstadoPedidoPuntoVenta.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresEstadoPedidoPuntoVenta,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresEstadoPedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesEstadoPedidoPuntoVenta= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesEstadoPedidoPuntoVenta.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesEstadoPedidoPuntoVenta,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesEstadoPedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByEstadoPedidoPuntoVenta= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByEstadoPedidoPuntoVenta.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByEstadoPedidoPuntoVenta,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByEstadoPedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarEstadoPedidoPuntoVenta= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarEstadoPedidoPuntoVenta.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarEstadoPedidoPuntoVenta,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarEstadoPedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByEstadoPedidoPuntoVenta= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByEstadoPedidoPuntoVenta.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByEstadoPedidoPuntoVenta,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByEstadoPedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarEstadoPedidoPuntoVenta= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarEstadoPedidoPuntoVenta.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarEstadoPedidoPuntoVenta,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarEstadoPedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosEstadoPedidoPuntoVenta= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosEstadoPedidoPuntoVenta.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosEstadoPedidoPuntoVenta,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosEstadoPedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoEstadoPedidoPuntoVenta.add(this.jMenuItemCerrarEstadoPedidoPuntoVenta);
			
			this.jmenuAccionesEstadoPedidoPuntoVenta.add(this.jMenuItemNuevoEstadoPedidoPuntoVenta);
			this.jmenuAccionesEstadoPedidoPuntoVenta.add(this.jMenuItemNuevoGuardarCambiosEstadoPedidoPuntoVenta);
			this.jmenuAccionesEstadoPedidoPuntoVenta.add(this.jMenuItemNuevoRelacionesEstadoPedidoPuntoVenta);
			this.jmenuAccionesEstadoPedidoPuntoVenta.add(this.jMenuItemGuardarCambiosTablaEstadoPedidoPuntoVenta);		
			this.jmenuAccionesEstadoPedidoPuntoVenta.add(this.jMenuItemDuplicarEstadoPedidoPuntoVenta);		
			this.jmenuAccionesEstadoPedidoPuntoVenta.add(this.jMenuItemCopiarEstadoPedidoPuntoVenta);		
			this.jmenuAccionesEstadoPedidoPuntoVenta.add(this.jMenuItemVerFormEstadoPedidoPuntoVenta);		
			
			this.jmenuDatosEstadoPedidoPuntoVenta.add(this.jMenuItemRecargarInformacionEstadoPedidoPuntoVenta);				
			this.jmenuDatosEstadoPedidoPuntoVenta.add(this.jMenuItemAnterioresEstadoPedidoPuntoVenta);				
			this.jmenuDatosEstadoPedidoPuntoVenta.add(this.jMenuItemSiguientesEstadoPedidoPuntoVenta);				
			this.jmenuDatosEstadoPedidoPuntoVenta.add(this.jMenuItemAbrirOrderByEstadoPedidoPuntoVenta);				
			this.jmenuDatosEstadoPedidoPuntoVenta.add(this.jMenuItemMostrarOcultarEstadoPedidoPuntoVenta);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesEstadoPedidoPuntoVenta.add(this.jMenuItemGuardarCambiosEstadoPedidoPuntoVenta);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoEstadoPedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesEstadoPedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosEstadoPedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarEstadoPedidoPuntoVenta.add(this.jmenuArchivoEstadoPedidoPuntoVenta);		
			this.jmenuBarEstadoPedidoPuntoVenta.add(this.jmenuAccionesEstadoPedidoPuntoVenta);		
			this.jmenuBarEstadoPedidoPuntoVenta.add(this.jmenuDatosEstadoPedidoPuntoVenta);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarEstadoPedidoPuntoVenta);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasEstadoPedidoPuntoVenta() {
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
			//this.jInternalFrameDetalleEstadoPedidoPuntoVenta = new EstadoPedidoPuntoVentaDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Estado Pedido DATOS");
			this.jInternalFrameDetalleFormEstadoPedidoPuntoVenta = new EstadoPedidoPuntoVentaDetalleFormJInternalFrame(jDesktopPane,this.estadopedidopuntoventaSessionBean.getConGuardarRelaciones(),this.estadopedidopuntoventaSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormEstadoPedidoPuntoVenta = null;//new EstadoPedidoPuntoVentaDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutEstadoPedidoPuntoVenta= new GridBagLayout();
		
		
		this.jTableDatosEstadoPedidoPuntoVenta = new JTableMe();      
		
		String sToolTipEstadoPedidoPuntoVenta="";
		sToolTipEstadoPedidoPuntoVenta=EstadoPedidoPuntoVentaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipEstadoPedidoPuntoVenta+="(PuntoVenta.EstadoPedidoPuntoVenta)";
		}
		
		if(!this.estadopedidopuntoventaSessionBean.getEsGuardarRelacionado()) {
			sToolTipEstadoPedidoPuntoVenta+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosEstadoPedidoPuntoVenta.setToolTipText(sToolTipEstadoPedidoPuntoVenta);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosEstadoPedidoPuntoVenta);
		this.jTableDatosEstadoPedidoPuntoVenta.setAutoCreateRowSorter(true);
		this.jTableDatosEstadoPedidoPuntoVenta.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosEstadoPedidoPuntoVenta.setRowSelectionAllowed(true);
		this.jTableDatosEstadoPedidoPuntoVenta.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosEstadoPedidoPuntoVenta,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoEstadoPedidoPuntoVenta = new JButtonMe();
		this.jButtonDuplicarEstadoPedidoPuntoVenta = new JButtonMe();
		this.jButtonCopiarEstadoPedidoPuntoVenta = new JButtonMe();
		this.jButtonVerFormEstadoPedidoPuntoVenta = new JButtonMe();
		this.jButtonNuevoRelacionesEstadoPedidoPuntoVenta = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaEstadoPedidoPuntoVenta = new JButtonMe();
		this.jButtonCerrarEstadoPedidoPuntoVenta = new JButtonMe();
		
		this.jScrollPanelDatosEstadoPedidoPuntoVenta = new JScrollPane();   
        this.jScrollPanelDatosGeneralEstadoPedidoPuntoVenta = new JScrollPane();
		
				
		
		
		this.jPanelAccionesEstadoPedidoPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Estado Pedido";
		
		if(!this.estadopedidopuntoventaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosEstadoPedidoPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Pedidos" + this.sPath));
		} else {
			this.jScrollPanelDatosEstadoPedidoPuntoVenta.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralEstadoPedidoPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesEstadoPedidoPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesEstadoPedidoPuntoVenta.setToolTipText("Acciones");
        this.jPanelAccionesEstadoPedidoPuntoVenta.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralEstadoPedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEstadoPedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoEstadoPedidoPuntoVenta=new ReporteDinamicoJInternalFrame(EstadoPedidoPuntoVentaConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoEstadoPedidoPuntoVenta();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionEstadoPedidoPuntoVenta=new ImportacionJInternalFrame(EstadoPedidoPuntoVentaConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionEstadoPedidoPuntoVenta();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByEstadoPedidoPuntoVenta = new JButtonMe();
		
		this.jButtonAbrirOrderByEstadoPedidoPuntoVenta.setText("Orden");
		this.jButtonAbrirOrderByEstadoPedidoPuntoVenta.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByEstadoPedidoPuntoVenta,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByEstadoPedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByEstadoPedidoPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByEstadoPedidoPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByEstadoPedidoPuntoVenta=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEstadoPedidoPuntoVenta,false,this);
			
			//this.cargarOrderByEstadoPedidoPuntoVenta(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByEstadoPedidoPuntoVenta=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEstadoPedidoPuntoVenta,true,this);
			
			//this.cargarOrderByEstadoPedidoPuntoVenta(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosEstadoPedidoPuntoVenta.setMinimumSize(new Dimension(400,50));//330
		this.jTableDatosEstadoPedidoPuntoVenta.setMaximumSize(new Dimension(400,50));//330
		this.jTableDatosEstadoPedidoPuntoVenta.setPreferredSize(new Dimension(400,50));//330
		
		this.jScrollPanelDatosEstadoPedidoPuntoVenta.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosEstadoPedidoPuntoVenta.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosEstadoPedidoPuntoVenta.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoEstadoPedidoPuntoVenta.setText("Nuevo");
		this.jButtonDuplicarEstadoPedidoPuntoVenta.setText("Duplicar");
		this.jButtonCopiarEstadoPedidoPuntoVenta.setText("Copiar");
		this.jButtonVerFormEstadoPedidoPuntoVenta.setText("Ver");
		this.jButtonNuevoRelacionesEstadoPedidoPuntoVenta.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaEstadoPedidoPuntoVenta.setText("Guardar");
		this.jButtonCerrarEstadoPedidoPuntoVenta.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoEstadoPedidoPuntoVenta,"nuevo_button","Nuevo",this.estadopedidopuntoventaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarEstadoPedidoPuntoVenta,"duplicar_button","Duplicar",this.estadopedidopuntoventaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarEstadoPedidoPuntoVenta,"copiar_button","Copiar",this.estadopedidopuntoventaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormEstadoPedidoPuntoVenta,"ver_form","Ver",this.estadopedidopuntoventaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesEstadoPedidoPuntoVenta,"nuevorelaciones_button","Nuevo Rel",this.estadopedidopuntoventaSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaEstadoPedidoPuntoVenta,"guardarcambiostabla_button","Guardar",this.estadopedidopuntoventaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarEstadoPedidoPuntoVenta,"cerrar_button","Salir",this.estadopedidopuntoventaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoEstadoPedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarEstadoPedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarEstadoPedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormEstadoPedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesEstadoPedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaEstadoPedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarEstadoPedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoEstadoPedidoPuntoVenta.setToolTipText("Nuevo"+" "+EstadoPedidoPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarEstadoPedidoPuntoVenta.setToolTipText("Duplicar"+" "+EstadoPedidoPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarEstadoPedidoPuntoVenta.setToolTipText("Copiar"+" "+EstadoPedidoPuntoVentaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormEstadoPedidoPuntoVenta.setToolTipText("Ver"+" "+EstadoPedidoPuntoVentaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesEstadoPedidoPuntoVenta.setToolTipText("Nuevo Rel"+" "+EstadoPedidoPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaEstadoPedidoPuntoVenta.setToolTipText("Guardar"+" "+EstadoPedidoPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarEstadoPedidoPuntoVenta.setToolTipText("Salir"+" "+EstadoPedidoPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoEstadoPedidoPuntoVenta";
		inputMap = this.jButtonNuevoEstadoPedidoPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoEstadoPedidoPuntoVenta.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoEstadoPedidoPuntoVenta"));
		
		//DUPLICAR
		sMapKey = "DuplicarEstadoPedidoPuntoVenta";
		inputMap = this.jButtonDuplicarEstadoPedidoPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarEstadoPedidoPuntoVenta.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarEstadoPedidoPuntoVenta"));
		
		//COPIAR
		sMapKey = "CopiarEstadoPedidoPuntoVenta";
		inputMap = this.jButtonCopiarEstadoPedidoPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarEstadoPedidoPuntoVenta.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarEstadoPedidoPuntoVenta"));
		
		//VEr FORM
		sMapKey = "VerFormEstadoPedidoPuntoVenta";
		inputMap = this.jButtonVerFormEstadoPedidoPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormEstadoPedidoPuntoVenta.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormEstadoPedidoPuntoVenta"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesEstadoPedidoPuntoVenta";
		inputMap = this.jButtonNuevoRelacionesEstadoPedidoPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesEstadoPedidoPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesEstadoPedidoPuntoVenta"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarEstadoPedidoPuntoVenta";
		inputMap = this.jButtonModificarEstadoPedidoPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarEstadoPedidoPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarEstadoPedidoPuntoVenta"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarEstadoPedidoPuntoVenta";
		inputMap = this.jButtonCerrarEstadoPedidoPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarEstadoPedidoPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarEstadoPedidoPuntoVenta"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaEstadoPedidoPuntoVenta";
		inputMap = this.jButtonGuardarCambiosTablaEstadoPedidoPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaEstadoPedidoPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaEstadoPedidoPuntoVenta"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesEstadoPedidoPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesEstadoPedidoPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionEstadoPedidoPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1EstadoPedidoPuntoVenta= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2EstadoPedidoPuntoVenta= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3EstadoPedidoPuntoVenta= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4EstadoPedidoPuntoVenta= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5EstadoPedidoPuntoVenta= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesEstadoPedidoPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesEstadoPedidoPuntoVenta.setName("jPanelParametrosReportesEstadoPedidoPuntoVenta"); 
		
		this.jPanelParametrosReportesAccionesEstadoPedidoPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesEstadoPedidoPuntoVenta.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesEstadoPedidoPuntoVenta.setName("jPanelParametrosReportesAccionesEstadoPedidoPuntoVenta"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesEstadoPedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesEstadoPedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionEstadoPedidoPuntoVenta = new JButtonMe();
		this.jButtonRecargarInformacionEstadoPedidoPuntoVenta.setText("Recargar");
		this.jButtonRecargarInformacionEstadoPedidoPuntoVenta.setToolTipText("Recargar"+" "+EstadoPedidoPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionEstadoPedidoPuntoVenta,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionEstadoPedidoPuntoVenta = new JButtonMe();
		this.jButtonProcesarInformacionEstadoPedidoPuntoVenta.setText("Procesar");
		this.jButtonProcesarInformacionEstadoPedidoPuntoVenta.setToolTipText("Procesar"+" "+EstadoPedidoPuntoVentaConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionEstadoPedidoPuntoVenta.setVisible(false);
			
		this.jButtonProcesarInformacionEstadoPedidoPuntoVenta.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionEstadoPedidoPuntoVenta.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionEstadoPedidoPuntoVenta.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesEstadoPedidoPuntoVenta = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEstadoPedidoPuntoVenta.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesEstadoPedidoPuntoVenta.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesEstadoPedidoPuntoVenta = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEstadoPedidoPuntoVenta.setText("TIPO");       
		this.jComboBoxTiposReportesEstadoPedidoPuntoVenta.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesEstadoPedidoPuntoVenta = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEstadoPedidoPuntoVenta.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesEstadoPedidoPuntoVenta.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionEstadoPedidoPuntoVenta = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionEstadoPedidoPuntoVenta.setText("Paginacion");
		this.jComboBoxTiposPaginacionEstadoPedidoPuntoVenta.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesEstadoPedidoPuntoVenta = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesEstadoPedidoPuntoVenta.setText("Accion");
		this.jComboBoxTiposRelacionesEstadoPedidoPuntoVenta.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesEstadoPedidoPuntoVenta = new JComboBoxMe();
		//this.jComboBoxTiposAccionesEstadoPedidoPuntoVenta.setText("Accion");
		this.jComboBoxTiposAccionesEstadoPedidoPuntoVenta.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarEstadoPedidoPuntoVenta = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarEstadoPedidoPuntoVenta.setText("Accion");
		this.jComboBoxTiposSeleccionarEstadoPedidoPuntoVenta.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralEstadoPedidoPuntoVenta=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralEstadoPedidoPuntoVenta.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralEstadoPedidoPuntoVenta.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralEstadoPedidoPuntoVenta.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesEstadoPedidoPuntoVenta = new JLabelMe();
		
		this.jLabelAccionesEstadoPedidoPuntoVenta.setText("Acciones");		
		this.jLabelAccionesEstadoPedidoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEstadoPedidoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEstadoPedidoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosEstadoPedidoPuntoVenta = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosEstadoPedidoPuntoVenta.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosEstadoPedidoPuntoVenta.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosEstadoPedidoPuntoVenta = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosEstadoPedidoPuntoVenta.setText("Seleccionados");
		this.jCheckBoxSeleccionadosEstadoPedidoPuntoVenta.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaEstadoPedidoPuntoVenta = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaEstadoPedidoPuntoVenta.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaEstadoPedidoPuntoVenta.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteEstadoPedidoPuntoVenta = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteEstadoPedidoPuntoVenta.setText("Graf.");
		this.jCheckBoxConGraficoReporteEstadoPedidoPuntoVenta.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresEstadoPedidoPuntoVenta = new JButtonMe();
		//this.jButtonAnterioresEstadoPedidoPuntoVenta.setText("<<");
        this.jButtonAnterioresEstadoPedidoPuntoVenta.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresEstadoPedidoPuntoVenta,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresEstadoPedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesEstadoPedidoPuntoVenta = new JButtonMe();
		//this.jButtonSiguientesEstadoPedidoPuntoVenta.setText(">>");
        this.jButtonSiguientesEstadoPedidoPuntoVenta.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesEstadoPedidoPuntoVenta,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesEstadoPedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosEstadoPedidoPuntoVenta = new JButtonMe();
		this.jButtonNuevoGuardarCambiosEstadoPedidoPuntoVenta.setText("Nue");
        this.jButtonNuevoGuardarCambiosEstadoPedidoPuntoVenta.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosEstadoPedidoPuntoVenta,"nuevoguardarcambios_button","Nue",this.estadopedidopuntoventaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosEstadoPedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosEstadoPedidoPuntoVenta";
		inputMap = this.jButtonNuevoGuardarCambiosEstadoPedidoPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosEstadoPedidoPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosEstadoPedidoPuntoVenta"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionEstadoPedidoPuntoVenta";
		inputMap = this.jButtonRecargarInformacionEstadoPedidoPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionEstadoPedidoPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionEstadoPedidoPuntoVenta"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesEstadoPedidoPuntoVenta";
		inputMap = this.jButtonSiguientesEstadoPedidoPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesEstadoPedidoPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesEstadoPedidoPuntoVenta"));
		
		//ANTERIORES		
		sMapKey = "AnterioresEstadoPedidoPuntoVenta";
		inputMap = this.jButtonAnterioresEstadoPedidoPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresEstadoPedidoPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresEstadoPedidoPuntoVenta"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasEstadoPedidoPuntoVenta();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesEstadoPedidoPuntoVenta.setMinimumSize(new Dimension(this.getWidth(),EstadoPedidoPuntoVentaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EstadoPedidoPuntoVentaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesEstadoPedidoPuntoVenta.setMaximumSize(new Dimension(this.getWidth(),EstadoPedidoPuntoVentaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EstadoPedidoPuntoVentaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesEstadoPedidoPuntoVenta.setPreferredSize(new Dimension(this.getWidth(),EstadoPedidoPuntoVentaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EstadoPedidoPuntoVentaBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionEstadoPedidoPuntoVenta = new GridBagLayout();

			this.jPanelPaginacionEstadoPedidoPuntoVenta.setLayout(gridaBagLayoutPaginacionEstadoPedidoPuntoVenta);						
			
			this.gridBagConstraintsEstadoPedidoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsEstadoPedidoPuntoVenta.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsEstadoPedidoPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoPedidoPuntoVenta.gridy = 0;
			this.gridBagConstraintsEstadoPedidoPuntoVenta.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionEstadoPedidoPuntoVenta.add(this.jButtonAnterioresEstadoPedidoPuntoVenta, this.gridBagConstraintsEstadoPedidoPuntoVenta);
					
						
			this.gridBagConstraintsEstadoPedidoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsEstadoPedidoPuntoVenta.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsEstadoPedidoPuntoVenta.gridy = 0;
			
			this.jPanelPaginacionEstadoPedidoPuntoVenta.add(this.jButtonNuevoGuardarCambiosEstadoPedidoPuntoVenta, this.gridBagConstraintsEstadoPedidoPuntoVenta);
						
			
			this.gridBagConstraintsEstadoPedidoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsEstadoPedidoPuntoVenta.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsEstadoPedidoPuntoVenta.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsEstadoPedidoPuntoVenta.gridy = 0;
			this.jPanelPaginacionEstadoPedidoPuntoVenta.add(this.jButtonSiguientesEstadoPedidoPuntoVenta, this.gridBagConstraintsEstadoPedidoPuntoVenta);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsEstadoPedidoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsEstadoPedidoPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoPedidoPuntoVenta.gridy = 1;
			this.gridBagConstraintsEstadoPedidoPuntoVenta.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEstadoPedidoPuntoVenta.add(this.jButtonNuevoEstadoPedidoPuntoVenta, this.gridBagConstraintsEstadoPedidoPuntoVenta);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsEstadoPedidoPuntoVenta = new GridBagConstraints();
				this.gridBagConstraintsEstadoPedidoPuntoVenta.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsEstadoPedidoPuntoVenta.gridy = 1;
				this.gridBagConstraintsEstadoPedidoPuntoVenta.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionEstadoPedidoPuntoVenta.add(this.jButtonNuevoRelacionesEstadoPedidoPuntoVenta, this.gridBagConstraintsEstadoPedidoPuntoVenta);
			}
			
			
			if(!this.estadopedidopuntoventaSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsEstadoPedidoPuntoVenta = new GridBagConstraints();
				this.gridBagConstraintsEstadoPedidoPuntoVenta.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsEstadoPedidoPuntoVenta.gridy = 1;
				this.gridBagConstraintsEstadoPedidoPuntoVenta.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionEstadoPedidoPuntoVenta.add(this.jButtonGuardarCambiosTablaEstadoPedidoPuntoVenta, this.gridBagConstraintsEstadoPedidoPuntoVenta);
			}
			
			
			
			this.gridBagConstraintsEstadoPedidoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsEstadoPedidoPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoPedidoPuntoVenta.gridy = 1;
			this.gridBagConstraintsEstadoPedidoPuntoVenta.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEstadoPedidoPuntoVenta.add(this.jButtonDuplicarEstadoPedidoPuntoVenta, this.gridBagConstraintsEstadoPedidoPuntoVenta);
			
			this.gridBagConstraintsEstadoPedidoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsEstadoPedidoPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoPedidoPuntoVenta.gridy = 1;
			this.gridBagConstraintsEstadoPedidoPuntoVenta.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEstadoPedidoPuntoVenta.add(this.jButtonCopiarEstadoPedidoPuntoVenta, this.gridBagConstraintsEstadoPedidoPuntoVenta);
		
			this.gridBagConstraintsEstadoPedidoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsEstadoPedidoPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoPedidoPuntoVenta.gridy = 1;
			this.gridBagConstraintsEstadoPedidoPuntoVenta.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEstadoPedidoPuntoVenta.add(this.jButtonVerFormEstadoPedidoPuntoVenta, this.gridBagConstraintsEstadoPedidoPuntoVenta);
		
			this.gridBagConstraintsEstadoPedidoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsEstadoPedidoPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoPedidoPuntoVenta.gridy = 1;
			this.gridBagConstraintsEstadoPedidoPuntoVenta.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionEstadoPedidoPuntoVenta.add(this.jButtonCerrarEstadoPedidoPuntoVenta, this.gridBagConstraintsEstadoPedidoPuntoVenta);
		
		
		
		this.jButtonRecargarInformacionEstadoPedidoPuntoVenta.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionEstadoPedidoPuntoVenta.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionEstadoPedidoPuntoVenta.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionEstadoPedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesEstadoPedidoPuntoVenta.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesEstadoPedidoPuntoVenta.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesEstadoPedidoPuntoVenta.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesEstadoPedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesEstadoPedidoPuntoVenta.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesEstadoPedidoPuntoVenta.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesEstadoPedidoPuntoVenta.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesEstadoPedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesEstadoPedidoPuntoVenta.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesEstadoPedidoPuntoVenta.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesEstadoPedidoPuntoVenta.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesEstadoPedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionEstadoPedidoPuntoVenta.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionEstadoPedidoPuntoVenta.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionEstadoPedidoPuntoVenta.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionEstadoPedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesEstadoPedidoPuntoVenta.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesEstadoPedidoPuntoVenta.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesEstadoPedidoPuntoVenta.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesEstadoPedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesEstadoPedidoPuntoVenta.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEstadoPedidoPuntoVenta.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEstadoPedidoPuntoVenta.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesEstadoPedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarEstadoPedidoPuntoVenta.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarEstadoPedidoPuntoVenta.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarEstadoPedidoPuntoVenta.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarEstadoPedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaEstadoPedidoPuntoVenta.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaEstadoPedidoPuntoVenta.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaEstadoPedidoPuntoVenta.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaEstadoPedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteEstadoPedidoPuntoVenta.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteEstadoPedidoPuntoVenta.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteEstadoPedidoPuntoVenta.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteEstadoPedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosEstadoPedidoPuntoVenta.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosEstadoPedidoPuntoVenta.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosEstadoPedidoPuntoVenta.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosEstadoPedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosEstadoPedidoPuntoVenta.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosEstadoPedidoPuntoVenta.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosEstadoPedidoPuntoVenta.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosEstadoPedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesEstadoPedidoPuntoVenta = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesEstadoPedidoPuntoVenta = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1EstadoPedidoPuntoVenta = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2EstadoPedidoPuntoVenta = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3EstadoPedidoPuntoVenta = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4EstadoPedidoPuntoVenta = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesEstadoPedidoPuntoVenta.setLayout(gridaBagParametrosReportesEstadoPedidoPuntoVenta);
			this.jPanelParametrosReportesAccionesEstadoPedidoPuntoVenta.setLayout(gridaBagParametrosReportesAccionesEstadoPedidoPuntoVenta);
			
			
			this.jPanelParametrosAuxiliar1EstadoPedidoPuntoVenta.setLayout(gridaBagParametrosAuxiliar1EstadoPedidoPuntoVenta);
			this.jPanelParametrosAuxiliar2EstadoPedidoPuntoVenta.setLayout(gridaBagParametrosAuxiliar2EstadoPedidoPuntoVenta);
			this.jPanelParametrosAuxiliar3EstadoPedidoPuntoVenta.setLayout(gridaBagParametrosAuxiliar3EstadoPedidoPuntoVenta);
			this.jPanelParametrosAuxiliar4EstadoPedidoPuntoVenta.setLayout(gridaBagParametrosAuxiliar4EstadoPedidoPuntoVenta);
			//this.jPanelParametrosAuxiliar5EstadoPedidoPuntoVenta.setLayout(gridaBagParametrosAuxiliar2EstadoPedidoPuntoVenta);			
			
			
			
			
			this.gridBagConstraintsEstadoPedidoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsEstadoPedidoPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoPedidoPuntoVenta.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEstadoPedidoPuntoVenta.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstadoPedidoPuntoVenta.add(this.jButtonRecargarInformacionEstadoPedidoPuntoVenta, this.gridBagConstraintsEstadoPedidoPuntoVenta);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsEstadoPedidoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsEstadoPedidoPuntoVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoPedidoPuntoVenta.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoPedidoPuntoVenta.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1EstadoPedidoPuntoVenta.add(this.jComboBoxTiposPaginacionEstadoPedidoPuntoVenta, this.gridBagConstraintsEstadoPedidoPuntoVenta);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsEstadoPedidoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsEstadoPedidoPuntoVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoPedidoPuntoVenta.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoPedidoPuntoVenta.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1EstadoPedidoPuntoVenta.add(this.jCheckBoxConAltoMaximoTablaEstadoPedidoPuntoVenta, this.gridBagConstraintsEstadoPedidoPuntoVenta);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsEstadoPedidoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsEstadoPedidoPuntoVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoPedidoPuntoVenta.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoPedidoPuntoVenta.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1EstadoPedidoPuntoVenta.add(this.jComboBoxTiposArchivosReportesEstadoPedidoPuntoVenta, this.gridBagConstraintsEstadoPedidoPuntoVenta);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsEstadoPedidoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsEstadoPedidoPuntoVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoPedidoPuntoVenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoPedidoPuntoVenta.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoPedidoPuntoVenta.add(this.jPanelParametrosAuxiliar1EstadoPedidoPuntoVenta, this.gridBagConstraintsEstadoPedidoPuntoVenta);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsEstadoPedidoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsEstadoPedidoPuntoVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoPedidoPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoPedidoPuntoVenta.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEstadoPedidoPuntoVenta.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4EstadoPedidoPuntoVenta.add(this.jComboBoxTiposReportesEstadoPedidoPuntoVenta, this.gridBagConstraintsEstadoPedidoPuntoVenta);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsEstadoPedidoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsEstadoPedidoPuntoVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoPedidoPuntoVenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoPedidoPuntoVenta.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoPedidoPuntoVenta.add(this.jPanelParametrosAuxiliar4EstadoPedidoPuntoVenta, this.gridBagConstraintsEstadoPedidoPuntoVenta);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsEstadoPedidoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsEstadoPedidoPuntoVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoPedidoPuntoVenta.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoPedidoPuntoVenta.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoPedidoPuntoVenta.add(this.jComboBoxTiposReportesEstadoPedidoPuntoVenta, this.gridBagConstraintsEstadoPedidoPuntoVenta);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsEstadoPedidoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsEstadoPedidoPuntoVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoPedidoPuntoVenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoPedidoPuntoVenta.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEstadoPedidoPuntoVenta.add(this.jCheckBoxGenerarReporteEstadoPedidoPuntoVenta, this.gridBagConstraintsEstadoPedidoPuntoVenta);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsEstadoPedidoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsEstadoPedidoPuntoVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoPedidoPuntoVenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoPedidoPuntoVenta.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoPedidoPuntoVenta.add(this.jPanelParametrosAuxiliar2EstadoPedidoPuntoVenta, this.gridBagConstraintsEstadoPedidoPuntoVenta);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsEstadoPedidoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsEstadoPedidoPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoPedidoPuntoVenta.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEstadoPedidoPuntoVenta.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEstadoPedidoPuntoVenta.add(this.jLabelAccionesEstadoPedidoPuntoVenta, this.gridBagConstraintsEstadoPedidoPuntoVenta);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsEstadoPedidoPuntoVenta = new GridBagConstraints();
				this.gridBagConstraintsEstadoPedidoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsEstadoPedidoPuntoVenta.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsEstadoPedidoPuntoVenta.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesEstadoPedidoPuntoVenta.add(this.jButtonAbrirOrderByEstadoPedidoPuntoVenta, this.gridBagConstraintsEstadoPedidoPuntoVenta);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsEstadoPedidoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsEstadoPedidoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsEstadoPedidoPuntoVenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoPedidoPuntoVenta.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstadoPedidoPuntoVenta.add(this.jComboBoxTiposSeleccionarEstadoPedidoPuntoVenta, this.gridBagConstraintsEstadoPedidoPuntoVenta);			
			
			
			/*
			this.gridBagConstraintsEstadoPedidoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsEstadoPedidoPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoPedidoPuntoVenta.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEstadoPedidoPuntoVenta.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEstadoPedidoPuntoVenta.add(this.jCheckBoxSeleccionarTodosEstadoPedidoPuntoVenta, this.gridBagConstraintsEstadoPedidoPuntoVenta);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsEstadoPedidoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsEstadoPedidoPuntoVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoPedidoPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoPedidoPuntoVenta.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEstadoPedidoPuntoVenta.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3EstadoPedidoPuntoVenta.add(this.jCheckBoxSeleccionarTodosEstadoPedidoPuntoVenta, this.gridBagConstraintsEstadoPedidoPuntoVenta);															
				
			this.gridBagConstraintsEstadoPedidoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsEstadoPedidoPuntoVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoPedidoPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoPedidoPuntoVenta.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEstadoPedidoPuntoVenta.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3EstadoPedidoPuntoVenta.add(this.jCheckBoxSeleccionadosEstadoPedidoPuntoVenta, this.gridBagConstraintsEstadoPedidoPuntoVenta);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsEstadoPedidoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsEstadoPedidoPuntoVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoPedidoPuntoVenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoPedidoPuntoVenta.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoPedidoPuntoVenta.add(this.jPanelParametrosAuxiliar3EstadoPedidoPuntoVenta, this.gridBagConstraintsEstadoPedidoPuntoVenta);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsEstadoPedidoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsEstadoPedidoPuntoVenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoPedidoPuntoVenta.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstadoPedidoPuntoVenta.add(this.jComboBoxTiposRelacionesEstadoPedidoPuntoVenta, this.gridBagConstraintsEstadoPedidoPuntoVenta);
				
			this.gridBagConstraintsEstadoPedidoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsEstadoPedidoPuntoVenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoPedidoPuntoVenta.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstadoPedidoPuntoVenta.add(this.jComboBoxTiposAccionesEstadoPedidoPuntoVenta, this.gridBagConstraintsEstadoPedidoPuntoVenta);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosEstadoPedidoPuntoVenta = new GridBagLayout();

			this.jScrollPanelDatosEstadoPedidoPuntoVenta.setLayout(gridaBagLayoutDatosEstadoPedidoPuntoVenta);
			
			this.gridBagConstraintsEstadoPedidoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsEstadoPedidoPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoPedidoPuntoVenta.gridy = 0;
			this.gridBagConstraintsEstadoPedidoPuntoVenta.gridx = 0;
			
			this.jScrollPanelDatosEstadoPedidoPuntoVenta.add(this.jTableDatosEstadoPedidoPuntoVenta, this.gridBagConstraintsEstadoPedidoPuntoVenta);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosEstadoPedidoPuntoVenta.setViewportView(this.jTableDatosEstadoPedidoPuntoVenta);
		this.jTableDatosEstadoPedidoPuntoVenta.setFillsViewportHeight(true);
		this.jTableDatosEstadoPedidoPuntoVenta.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesEstadoPedidoPuntoVenta= new GridBagLayout();
		this.jPanelAccionesEstadoPedidoPuntoVenta.setLayout(gridaBagLayoutAccionesEstadoPedidoPuntoVenta);
		
		
		/*	
		this.gridBagConstraintsEstadoPedidoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsEstadoPedidoPuntoVenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoPedidoPuntoVenta.gridy = 0;
		this.gridBagConstraintsEstadoPedidoPuntoVenta.gridx = 0;
			
		this.jPanelAccionesEstadoPedidoPuntoVenta.add(this.jButtonNuevoEstadoPedidoPuntoVenta, this.gridBagConstraintsEstadoPedidoPuntoVenta);
		*/
		int iPosXAccion=0;
		
						
		
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutEstadoPedidoPuntoVenta = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutEstadoPedidoPuntoVenta);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.estadopedidopuntoventaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsEstadoPedidoPuntoVenta = new GridBagConstraints();						
			this.gridBagConstraintsEstadoPedidoPuntoVenta.gridy = iGridyPrincipal++;
			this.gridBagConstraintsEstadoPedidoPuntoVenta.gridx = 0;		
			//this.gridBagConstraintsEstadoPedidoPuntoVenta.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoPedidoPuntoVenta.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsEstadoPedidoPuntoVenta.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarEstadoPedidoPuntoVenta, this.gridBagConstraintsEstadoPedidoPuntoVenta);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsEstadoPedidoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsEstadoPedidoPuntoVenta.gridy = iGridyPrincipal++;
		this.gridBagConstraintsEstadoPedidoPuntoVenta.gridx = 0;		
		//this.gridBagConstraintsEstadoPedidoPuntoVenta.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoPedidoPuntoVenta.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsEstadoPedidoPuntoVenta.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsEstadoPedidoPuntoVenta);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsEstadoPedidoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsEstadoPedidoPuntoVenta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoPedidoPuntoVenta.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesEstadoPedidoPuntoVenta, this.gridBagConstraintsEstadoPedidoPuntoVenta);								
		
		
		/*
		this.gridBagConstraintsEstadoPedidoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsEstadoPedidoPuntoVenta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoPedidoPuntoVenta.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesEstadoPedidoPuntoVenta, this.gridBagConstraintsEstadoPedidoPuntoVenta);
		*/		
		
		this.gridBagConstraintsEstadoPedidoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsEstadoPedidoPuntoVenta.gridy =iGridyPrincipal++;
		this.gridBagConstraintsEstadoPedidoPuntoVenta.gridx =0;
		this.gridBagConstraintsEstadoPedidoPuntoVenta.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsEstadoPedidoPuntoVenta.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosEstadoPedidoPuntoVenta, this.gridBagConstraintsEstadoPedidoPuntoVenta);
				
		
		this.gridBagConstraintsEstadoPedidoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsEstadoPedidoPuntoVenta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoPedidoPuntoVenta.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionEstadoPedidoPuntoVenta, this.gridBagConstraintsEstadoPedidoPuntoVenta);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(EstadoPedidoPuntoVentaJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosEstadoPedidoPuntoVenta= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosEstadoPedidoPuntoVenta = new GridBagLayout();
			this.jPanelBusquedasParametrosEstadoPedidoPuntoVenta.setLayout(gridaBagLayoutBusquedasParametrosEstadoPedidoPuntoVenta);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralEstadoPedidoPuntoVenta=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralEstadoPedidoPuntoVenta.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEstadoPedidoPuntoVenta.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEstadoPedidoPuntoVenta.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsEstadoPedidoPuntoVenta = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsEstadoPedidoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsEstadoPedidoPuntoVenta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoPedidoPuntoVenta.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposEstadoPedidoPuntoVenta, this.gridBagConstraintsEstadoPedidoPuntoVenta);
			
			
		this.gridBagConstraintsEstadoPedidoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsEstadoPedidoPuntoVenta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoPedidoPuntoVenta.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosEstadoPedidoPuntoVenta, this.gridBagConstraintsEstadoPedidoPuntoVenta);
		
			
		this.gridBagConstraintsEstadoPedidoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsEstadoPedidoPuntoVenta.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsEstadoPedidoPuntoVenta.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesEstadoPedidoPuntoVenta, this.gridBagConstraintsEstadoPedidoPuntoVenta);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralEstadoPedidoPuntoVenta;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoEstadoPedidoPuntoVenta() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoEstadoPedidoPuntoVenta = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoEstadoPedidoPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoEstadoPedidoPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoEstadoPedidoPuntoVenta.setName("jPanelReporteDinamicoEstadoPedidoPuntoVenta"); 
		
		this.jPanelReporteDinamicoEstadoPedidoPuntoVenta.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoEstadoPedidoPuntoVenta.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoEstadoPedidoPuntoVenta.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoEstadoPedidoPuntoVenta.setLayout(gridaBagLayoutReporteDinamicoEstadoPedidoPuntoVenta);
		
		
		this.jInternalFrameReporteDinamicoEstadoPedidoPuntoVenta= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoEstadoPedidoPuntoVenta = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteEstadoPedidoPuntoVenta= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoEstadoPedidoPuntoVenta.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoEstadoPedidoPuntoVenta.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoEstadoPedidoPuntoVenta.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoEstadoPedidoPuntoVenta.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoEstadoPedidoPuntoVenta.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoEstadoPedidoPuntoVenta.setResizable(true);
	    this.jInternalFrameReporteDinamicoEstadoPedidoPuntoVenta.setClosable(true);
	    this.jInternalFrameReporteDinamicoEstadoPedidoPuntoVenta.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoEstadoPedidoPuntoVenta.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoEstadoPedidoPuntoVenta.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoEstadoPedidoPuntoVenta.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoEstadoPedidoPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Pedidos"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteEstadoPedidoPuntoVenta = new JLabelMe();

		this.jLabelColumnasSelectReporteEstadoPedidoPuntoVenta.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteEstadoPedidoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteEstadoPedidoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteEstadoPedidoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsEstadoPedidoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsEstadoPedidoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoPedidoPuntoVenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoPedidoPuntoVenta.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoEstadoPedidoPuntoVenta.add(this.jLabelColumnasSelectReporteEstadoPedidoPuntoVenta, this.gridBagConstraintsEstadoPedidoPuntoVenta);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteEstadoPedidoPuntoVenta = new JList<Reporte>();
		this.jListColumnasSelectReporteEstadoPedidoPuntoVenta.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteEstadoPedidoPuntoVenta.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteEstadoPedidoPuntoVenta.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteEstadoPedidoPuntoVenta.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteEstadoPedidoPuntoVenta.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteEstadoPedidoPuntoVenta=new JScrollPane(this.jListColumnasSelectReporteEstadoPedidoPuntoVenta);
			
			this.jScrollColumnasSelectReporteEstadoPedidoPuntoVenta.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteEstadoPedidoPuntoVenta.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteEstadoPedidoPuntoVenta.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteEstadoPedidoPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsEstadoPedidoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsEstadoPedidoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoPedidoPuntoVenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoPedidoPuntoVenta.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoEstadoPedidoPuntoVenta.add(this.jListColumnasSelectReporteEstadoPedidoPuntoVenta, this.gridBagConstraintsEstadoPedidoPuntoVenta);
		this.jPanelReporteDinamicoEstadoPedidoPuntoVenta.add(this.jScrollColumnasSelectReporteEstadoPedidoPuntoVenta, this.gridBagConstraintsEstadoPedidoPuntoVenta);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteEstadoPedidoPuntoVenta = new JLabelMe();

		this.jLabelRelacionesSelectReporteEstadoPedidoPuntoVenta.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteEstadoPedidoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteEstadoPedidoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteEstadoPedidoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsEstadoPedidoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsEstadoPedidoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoPedidoPuntoVenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoPedidoPuntoVenta.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoEstadoPedidoPuntoVenta.add(this.jLabelRelacionesSelectReporteEstadoPedidoPuntoVenta, this.gridBagConstraintsEstadoPedidoPuntoVenta);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteEstadoPedidoPuntoVenta = new JList<Reporte>();
		this.jListRelacionesSelectReporteEstadoPedidoPuntoVenta.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteEstadoPedidoPuntoVenta.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteEstadoPedidoPuntoVenta.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteEstadoPedidoPuntoVenta.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteEstadoPedidoPuntoVenta.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteEstadoPedidoPuntoVenta=new JScrollPane(this.jListRelacionesSelectReporteEstadoPedidoPuntoVenta);
			
			this.jScrollRelacionesSelectReporteEstadoPedidoPuntoVenta.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteEstadoPedidoPuntoVenta.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteEstadoPedidoPuntoVenta.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteEstadoPedidoPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsEstadoPedidoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsEstadoPedidoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoPedidoPuntoVenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoPedidoPuntoVenta.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoEstadoPedidoPuntoVenta.add(this.jListRelacionesSelectReporteEstadoPedidoPuntoVenta, this.gridBagConstraintsEstadoPedidoPuntoVenta);
		this.jPanelReporteDinamicoEstadoPedidoPuntoVenta.add(this.jScrollRelacionesSelectReporteEstadoPedidoPuntoVenta, this.gridBagConstraintsEstadoPedidoPuntoVenta);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoEstadoPedidoPuntoVenta = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoEstadoPedidoPuntoVenta = new JComboBoxMe();
		this.jListColumnasValoresGraficoEstadoPedidoPuntoVenta = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoEstadoPedidoPuntoVenta = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoEstadoPedidoPuntoVenta.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoEstadoPedidoPuntoVenta.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoEstadoPedidoPuntoVenta.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoEstadoPedidoPuntoVenta.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoEstadoPedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoEstadoPedidoPuntoVenta = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoEstadoPedidoPuntoVenta.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoEstadoPedidoPuntoVenta.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoEstadoPedidoPuntoVenta.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoEstadoPedidoPuntoVenta.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoEstadoPedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoEstadoPedidoPuntoVenta = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoEstadoPedidoPuntoVenta.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoEstadoPedidoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoEstadoPedidoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoEstadoPedidoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsEstadoPedidoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsEstadoPedidoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoPedidoPuntoVenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoPedidoPuntoVenta.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEstadoPedidoPuntoVenta.add(this.jLabelGenerarExcelReporteDinamicoEstadoPedidoPuntoVenta, this.gridBagConstraintsEstadoPedidoPuntoVenta);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoEstadoPedidoPuntoVenta = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoEstadoPedidoPuntoVenta.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoEstadoPedidoPuntoVenta,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoEstadoPedidoPuntoVenta.setToolTipText("Generar EXCEL"+" "+EstadoPedidoPuntoVentaConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsEstadoPedidoPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsEstadoPedidoPuntoVenta.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsEstadoPedidoPuntoVenta.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsEstadoPedidoPuntoVenta.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoEstadoPedidoPuntoVenta.add(this.jButtonGenerarExcelReporteDinamicoEstadoPedidoPuntoVenta, this.gridBagConstraintsEstadoPedidoPuntoVenta);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsEstadoPedidoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsEstadoPedidoPuntoVenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoPedidoPuntoVenta.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEstadoPedidoPuntoVenta.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEstadoPedidoPuntoVenta.add(this.jComboBoxTiposReportesDinamicoEstadoPedidoPuntoVenta, this.gridBagConstraintsEstadoPedidoPuntoVenta);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoEstadoPedidoPuntoVenta = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoEstadoPedidoPuntoVenta.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoEstadoPedidoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoEstadoPedidoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoEstadoPedidoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsEstadoPedidoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsEstadoPedidoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoPedidoPuntoVenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoPedidoPuntoVenta.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEstadoPedidoPuntoVenta.add(this.jLabelTiposArchivoReporteDinamicoEstadoPedidoPuntoVenta, this.gridBagConstraintsEstadoPedidoPuntoVenta);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsEstadoPedidoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsEstadoPedidoPuntoVenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoPedidoPuntoVenta.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEstadoPedidoPuntoVenta.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEstadoPedidoPuntoVenta.add(this.jComboBoxTiposArchivosReportesDinamicoEstadoPedidoPuntoVenta, this.gridBagConstraintsEstadoPedidoPuntoVenta);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoEstadoPedidoPuntoVenta = new JButtonMe();
		this.jButtonGenerarReporteDinamicoEstadoPedidoPuntoVenta.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoEstadoPedidoPuntoVenta,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoEstadoPedidoPuntoVenta.setToolTipText("Generar"+" "+EstadoPedidoPuntoVentaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsEstadoPedidoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsEstadoPedidoPuntoVenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoPedidoPuntoVenta.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEstadoPedidoPuntoVenta.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEstadoPedidoPuntoVenta.add(this.jButtonGenerarReporteDinamicoEstadoPedidoPuntoVenta, this.gridBagConstraintsEstadoPedidoPuntoVenta);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoEstadoPedidoPuntoVenta = new JButtonMe();
		this.jButtonCerrarReporteDinamicoEstadoPedidoPuntoVenta.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoEstadoPedidoPuntoVenta,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoEstadoPedidoPuntoVenta.setToolTipText("Cancelar"+" "+EstadoPedidoPuntoVentaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsEstadoPedidoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsEstadoPedidoPuntoVenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoPedidoPuntoVenta.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEstadoPedidoPuntoVenta.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEstadoPedidoPuntoVenta.add(this.jButtonCerrarReporteDinamicoEstadoPedidoPuntoVenta, this.gridBagConstraintsEstadoPedidoPuntoVenta);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalEstadoPedidoPuntoVenta = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoEstadoPedidoPuntoVenta= new JScrollPane(jPanelReporteDinamicoEstadoPedidoPuntoVenta,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoEstadoPedidoPuntoVenta.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoEstadoPedidoPuntoVenta.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoEstadoPedidoPuntoVenta.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoEstadoPedidoPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Pedidos"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsEstadoPedidoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsEstadoPedidoPuntoVenta.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsEstadoPedidoPuntoVenta.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsEstadoPedidoPuntoVenta.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoEstadoPedidoPuntoVenta.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoEstadoPedidoPuntoVenta.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalEstadoPedidoPuntoVenta);
		this.jInternalFrameReporteDinamicoEstadoPedidoPuntoVenta.getContentPane().add(this.jScrollPanelReporteDinamicoEstadoPedidoPuntoVenta, this.gridBagConstraintsEstadoPedidoPuntoVenta);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionEstadoPedidoPuntoVenta() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionEstadoPedidoPuntoVenta = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionEstadoPedidoPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionEstadoPedidoPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionEstadoPedidoPuntoVenta.setName("jPanelImportacionEstadoPedidoPuntoVenta"); 
		
		this.jPanelImportacionEstadoPedidoPuntoVenta.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionEstadoPedidoPuntoVenta.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionEstadoPedidoPuntoVenta.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionEstadoPedidoPuntoVenta.setLayout(gridaBagLayoutImportacionEstadoPedidoPuntoVenta);
		
		
		this.jInternalFrameImportacionEstadoPedidoPuntoVenta= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionEstadoPedidoPuntoVenta= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionEstadoPedidoPuntoVenta = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteEstadoPedidoPuntoVenta= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionEstadoPedidoPuntoVenta.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionEstadoPedidoPuntoVenta.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionEstadoPedidoPuntoVenta.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionEstadoPedidoPuntoVenta.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionEstadoPedidoPuntoVenta.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionEstadoPedidoPuntoVenta.setResizable(true);
	    this.jInternalFrameImportacionEstadoPedidoPuntoVenta.setClosable(true);
	    this.jInternalFrameImportacionEstadoPedidoPuntoVenta.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionEstadoPedidoPuntoVenta.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionEstadoPedidoPuntoVenta.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionEstadoPedidoPuntoVenta.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionEstadoPedidoPuntoVenta.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionEstadoPedidoPuntoVenta.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionEstadoPedidoPuntoVenta.setResizable(true);
	    this.jInternalFrameImportacionEstadoPedidoPuntoVenta.setClosable(true);
	    this.jInternalFrameImportacionEstadoPedidoPuntoVenta.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionEstadoPedidoPuntoVenta.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionEstadoPedidoPuntoVenta.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionEstadoPedidoPuntoVenta.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionEstadoPedidoPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Pedidos"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionEstadoPedidoPuntoVenta = new JLabelMe();

		this.jLabelArchivoImportacionEstadoPedidoPuntoVenta.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionEstadoPedidoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionEstadoPedidoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionEstadoPedidoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsEstadoPedidoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsEstadoPedidoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoPedidoPuntoVenta.gridy = iPosYImportacion;		
		this.gridBagConstraintsEstadoPedidoPuntoVenta.gridx = iPosXImportacion++;
			
		this.jPanelImportacionEstadoPedidoPuntoVenta.add(this.jLabelArchivoImportacionEstadoPedidoPuntoVenta, this.gridBagConstraintsEstadoPedidoPuntoVenta);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionEstadoPedidoPuntoVenta = new JFileChooser();		
		this.jFileChooserImportacionEstadoPedidoPuntoVenta.setToolTipText("ESCOGER ARCHIVO"+" "+EstadoPedidoPuntoVentaConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionEstadoPedidoPuntoVenta = new JButtonMe();
		this.jButtonAbrirImportacionEstadoPedidoPuntoVenta.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionEstadoPedidoPuntoVenta,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionEstadoPedidoPuntoVenta.setToolTipText("Generar"+" "+EstadoPedidoPuntoVentaConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsEstadoPedidoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsEstadoPedidoPuntoVenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoPedidoPuntoVenta.gridy = iPosYImportacion;
		this.gridBagConstraintsEstadoPedidoPuntoVenta.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEstadoPedidoPuntoVenta.add(this.jButtonAbrirImportacionEstadoPedidoPuntoVenta, this.gridBagConstraintsEstadoPedidoPuntoVenta);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionEstadoPedidoPuntoVenta = new JLabelMe();

		this.jLabelPathArchivoImportacionEstadoPedidoPuntoVenta.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionEstadoPedidoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionEstadoPedidoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionEstadoPedidoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsEstadoPedidoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsEstadoPedidoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoPedidoPuntoVenta.gridy = iPosYImportacion;		
		this.gridBagConstraintsEstadoPedidoPuntoVenta.gridx = iPosXImportacion++;
			
		this.jPanelImportacionEstadoPedidoPuntoVenta.add(this.jLabelPathArchivoImportacionEstadoPedidoPuntoVenta, this.gridBagConstraintsEstadoPedidoPuntoVenta);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionEstadoPedidoPuntoVenta=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionEstadoPedidoPuntoVenta.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionEstadoPedidoPuntoVenta.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionEstadoPedidoPuntoVenta.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsEstadoPedidoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsEstadoPedidoPuntoVenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoPedidoPuntoVenta.gridy = iPosYImportacion;
		this.gridBagConstraintsEstadoPedidoPuntoVenta.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEstadoPedidoPuntoVenta.add(this.jTextFieldPathArchivoImportacionEstadoPedidoPuntoVenta, this.gridBagConstraintsEstadoPedidoPuntoVenta);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionEstadoPedidoPuntoVenta = new JButtonMe();
		this.jButtonGenerarImportacionEstadoPedidoPuntoVenta.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionEstadoPedidoPuntoVenta,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionEstadoPedidoPuntoVenta.setToolTipText("Generar"+" "+EstadoPedidoPuntoVentaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsEstadoPedidoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsEstadoPedidoPuntoVenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoPedidoPuntoVenta.gridy = iPosYImportacion;
		this.gridBagConstraintsEstadoPedidoPuntoVenta.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEstadoPedidoPuntoVenta.add(this.jButtonGenerarImportacionEstadoPedidoPuntoVenta, this.gridBagConstraintsEstadoPedidoPuntoVenta);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionEstadoPedidoPuntoVenta = new JButtonMe();
		this.jButtonCerrarImportacionEstadoPedidoPuntoVenta.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionEstadoPedidoPuntoVenta,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionEstadoPedidoPuntoVenta.setToolTipText("Cancelar"+" "+EstadoPedidoPuntoVentaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsEstadoPedidoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsEstadoPedidoPuntoVenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoPedidoPuntoVenta.gridy = iPosYImportacion;
		this.gridBagConstraintsEstadoPedidoPuntoVenta.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEstadoPedidoPuntoVenta.add(this.jButtonCerrarImportacionEstadoPedidoPuntoVenta, this.gridBagConstraintsEstadoPedidoPuntoVenta);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalEstadoPedidoPuntoVenta = new GridBagLayout();
		
		this.jScrollPanelImportacionEstadoPedidoPuntoVenta= new JScrollPane(jPanelImportacionEstadoPedidoPuntoVenta,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsEstadoPedidoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsEstadoPedidoPuntoVenta.gridy =iPosYImportacion;
		this.gridBagConstraintsEstadoPedidoPuntoVenta.gridx =iPosXImportacion;
		this.gridBagConstraintsEstadoPedidoPuntoVenta.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionEstadoPedidoPuntoVenta.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionEstadoPedidoPuntoVenta.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalEstadoPedidoPuntoVenta);
		this.jInternalFrameImportacionEstadoPedidoPuntoVenta.getContentPane().add(this.jScrollPanelImportacionEstadoPedidoPuntoVenta, this.gridBagConstraintsEstadoPedidoPuntoVenta);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByEstadoPedidoPuntoVenta(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByEstadoPedidoPuntoVenta = new JButtonMe();
			this.jButtonAbrirOrderByEstadoPedidoPuntoVenta.setText("Orden");
			this.jButtonAbrirOrderByEstadoPedidoPuntoVenta.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByEstadoPedidoPuntoVenta,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByEstadoPedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByEstadoPedidoPuntoVenta";
			inputMap = this.jButtonAbrirOrderByEstadoPedidoPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByEstadoPedidoPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByEstadoPedidoPuntoVenta"));
		
		
			GridBagLayout gridaBagLayoutOrderByEstadoPedidoPuntoVenta = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByEstadoPedidoPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByEstadoPedidoPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByEstadoPedidoPuntoVenta.setName("jPanelOrderByEstadoPedidoPuntoVenta"); 
			
			this.jPanelOrderByEstadoPedidoPuntoVenta.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByEstadoPedidoPuntoVenta.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByEstadoPedidoPuntoVenta.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByEstadoPedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByEstadoPedidoPuntoVenta.setLayout(gridaBagLayoutOrderByEstadoPedidoPuntoVenta);
			
			
			this.jTableDatosEstadoPedidoPuntoVentaOrderBy = new JTableMe();        
			this.jTableDatosEstadoPedidoPuntoVentaOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosEstadoPedidoPuntoVentaOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosEstadoPedidoPuntoVentaOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosEstadoPedidoPuntoVentaOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosEstadoPedidoPuntoVentaOrderBy.setViewportView(this.jTableDatosEstadoPedidoPuntoVentaOrderBy);
			this.jTableDatosEstadoPedidoPuntoVentaOrderBy.setFillsViewportHeight(true);
			this.jTableDatosEstadoPedidoPuntoVentaOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByEstadoPedidoPuntoVenta= new OrderByJInternalFrame();
			this.jInternalFrameOrderByEstadoPedidoPuntoVenta= new OrderByJInternalFrame();
			this.jScrollPanelOrderByEstadoPedidoPuntoVenta = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteEstadoPedidoPuntoVenta= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByEstadoPedidoPuntoVenta.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByEstadoPedidoPuntoVenta.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByEstadoPedidoPuntoVenta.setTitle("Orden");
			this.jInternalFrameOrderByEstadoPedidoPuntoVenta.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByEstadoPedidoPuntoVenta.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByEstadoPedidoPuntoVenta.setResizable(true);
			this.jInternalFrameOrderByEstadoPedidoPuntoVenta.setClosable(true);
			this.jInternalFrameOrderByEstadoPedidoPuntoVenta.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByEstadoPedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByEstadoPedidoPuntoVenta.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByEstadoPedidoPuntoVenta.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByEstadoPedidoPuntoVenta.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByEstadoPedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByEstadoPedidoPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Pedidos"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsEstadoPedidoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsEstadoPedidoPuntoVenta.gridy =iPosYOrderBy++;
			this.gridBagConstraintsEstadoPedidoPuntoVenta.gridx =iPosXOrderBy;
			this.gridBagConstraintsEstadoPedidoPuntoVenta.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsEstadoPedidoPuntoVenta.ipady =150;
				
			this.jPanelOrderByEstadoPedidoPuntoVenta.add(jScrollPanelDatosEstadoPedidoPuntoVentaOrderBy, this.gridBagConstraintsEstadoPedidoPuntoVenta);//this.jTableDatosEstadoPedidoPuntoVentaTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByEstadoPedidoPuntoVenta = new JButtonMe();
			this.jButtonCerrarOrderByEstadoPedidoPuntoVenta.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByEstadoPedidoPuntoVenta,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByEstadoPedidoPuntoVenta.setToolTipText("Cancelar"+" "+EstadoPedidoPuntoVentaConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByEstadoPedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsEstadoPedidoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsEstadoPedidoPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoPedidoPuntoVenta.gridy = iPosYOrderBy++;
			this.gridBagConstraintsEstadoPedidoPuntoVenta.gridx = iPosXOrderBy;
									
			this.jPanelOrderByEstadoPedidoPuntoVenta.add(this.jButtonCerrarOrderByEstadoPedidoPuntoVenta, this.gridBagConstraintsEstadoPedidoPuntoVenta);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalEstadoPedidoPuntoVenta = new GridBagLayout();
			
			this.jScrollPanelOrderByEstadoPedidoPuntoVenta= new JScrollPane(jPanelOrderByEstadoPedidoPuntoVenta,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsEstadoPedidoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsEstadoPedidoPuntoVenta.gridy =iPosYOrderBy;
			this.gridBagConstraintsEstadoPedidoPuntoVenta.gridx =iPosXOrderBy;
			this.gridBagConstraintsEstadoPedidoPuntoVenta.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByEstadoPedidoPuntoVenta.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByEstadoPedidoPuntoVenta.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalEstadoPedidoPuntoVenta);
			
			this.jInternalFrameOrderByEstadoPedidoPuntoVenta.getContentPane().add(this.jScrollPanelOrderByEstadoPedidoPuntoVenta, this.gridBagConstraintsEstadoPedidoPuntoVenta);			
		
		} else {
			this.jButtonAbrirOrderByEstadoPedidoPuntoVenta = new JButtonMe();
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
		int iWidthTableCalculado=0;//630
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=330;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=200;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=100;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.estadopedidopuntoventaSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosEstadoPedidoPuntoVenta.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosEstadoPedidoPuntoVenta.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosEstadoPedidoPuntoVenta.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosEstadoPedidoPuntoVenta.getRowHeight();//EstadoPedidoPuntoVentaConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.estadopedidopuntoventaSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > EstadoPedidoPuntoVentaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaEstadoPedidoPuntoVenta.isSelected()) {
					iHeightTable=EstadoPedidoPuntoVentaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < EstadoPedidoPuntoVentaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=EstadoPedidoPuntoVentaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > EstadoPedidoPuntoVentaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaEstadoPedidoPuntoVenta.isSelected()) {
					iHeightTable=EstadoPedidoPuntoVentaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < EstadoPedidoPuntoVentaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=EstadoPedidoPuntoVentaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosEstadoPedidoPuntoVenta.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosEstadoPedidoPuntoVenta.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosEstadoPedidoPuntoVenta.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosEstadoPedidoPuntoVenta.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosEstadoPedidoPuntoVenta.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosEstadoPedidoPuntoVenta.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByEstadoPedidoPuntoVenta!=null && this.jInternalFrameOrderByEstadoPedidoPuntoVenta.getjTableDatosOrderBy()!=null) {
			//if(!this.estadopedidopuntoventaSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByEstadoPedidoPuntoVenta.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByEstadoPedidoPuntoVenta.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByEstadoPedidoPuntoVenta.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByEstadoPedidoPuntoVenta.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByEstadoPedidoPuntoVenta.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByEstadoPedidoPuntoVenta.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByEstadoPedidoPuntoVenta.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosEstadoPedidoPuntoVenta.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosEstadoPedidoPuntoVenta.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosEstadoPedidoPuntoVenta.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=estadopedidopuntoventaLogic.getEstadoPedidoPuntoVentas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=estadopedidopuntoventas.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<EstadoPedidoPuntoVenta> TraerEstadoPedidoPuntoVentaBeans(List<EstadoPedidoPuntoVenta> estadopedidopuntoventas,ArrayList<Classe> classes)throws Exception {
		try {
			for(EstadoPedidoPuntoVenta estadopedidopuntoventa:estadopedidopuntoventas) {
					
				if(!(EstadoPedidoPuntoVentaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || EstadoPedidoPuntoVentaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					estadopedidopuntoventa.setsDetalleGeneralEntityReporte(EstadoPedidoPuntoVentaConstantesFunciones.getEstadoPedidoPuntoVentaDescripcion(estadopedidopuntoventa));
										
						
					
					

					if(estadopedidopuntoventa.getPedidoPuntoVentas()!=null && Funciones.existeClass(classes,PedidoPuntoVenta.class)) {
						try{estadopedidopuntoventa.setpedidopuntoventasDescripcionReporte(new JRBeanCollectionDataSource(PedidoPuntoVentaJInternalFrame.TraerPedidoPuntoVentaBeans(estadopedidopuntoventa.getPedidoPuntoVentas(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//estadopedidopuntoventa.setsDetalleGeneralEntityReporte(estadopedidopuntoventa.getsDetalleGeneralEntityReporte());
										
				}
				
				//estadopedidopuntoventabeans.add(estadopedidopuntoventabean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return estadopedidopuntoventas;
    }
	//PARA REPORTES FIN
}
