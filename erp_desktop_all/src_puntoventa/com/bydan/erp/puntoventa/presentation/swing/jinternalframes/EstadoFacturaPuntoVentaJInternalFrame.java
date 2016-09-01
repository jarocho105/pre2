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
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.comisiones.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;

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
import com.bydan.erp.puntoventa.util.EstadoFacturaPuntoVentaConstantesFunciones;

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
public class EstadoFacturaPuntoVentaJInternalFrame extends EstadoFacturaPuntoVentaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarEstadoFacturaPuntoVenta;
	
	protected JMenuBar jmenuBarEstadoFacturaPuntoVenta;
	
	protected JMenu jmenuEstadoFacturaPuntoVenta;
	protected JMenu jmenuDatosEstadoFacturaPuntoVenta;
	protected JMenu jmenuArchivoEstadoFacturaPuntoVenta;
	protected JMenu jmenuAccionesEstadoFacturaPuntoVenta;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosEstadoFacturaPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutEstadoFacturaPuntoVenta;	
	protected GridBagConstraints gridBagConstraintsEstadoFacturaPuntoVenta;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public EstadoFacturaPuntoVentaDetalleFormJInternalFrame jInternalFrameDetalleFormEstadoFacturaPuntoVenta;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoEstadoFacturaPuntoVenta;	
	protected ImportacionJInternalFrame jInternalFrameImportacionEstadoFacturaPuntoVenta;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public EstadoFacturaPuntoVentaSessionBean estadofacturapuntoventaSessionBean;
		
	
	
	
	//protected JDesktopPane jDesktopPane;
	public List<EstadoFacturaPuntoVenta> estadofacturapuntoventas;		
	public List<EstadoFacturaPuntoVenta> estadofacturapuntoventasEliminados;	
	public List<EstadoFacturaPuntoVenta> estadofacturapuntoventasAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByEstadoFacturaPuntoVenta;		
	protected JButton jButtonAbrirOrderByEstadoFacturaPuntoVenta;
	
	
	//protected JPanel jPanelOrderByEstadoFacturaPuntoVenta;
	//public JScrollPane jScrollPanelOrderByEstadoFacturaPuntoVenta;	
	//protected JButton jButtonCerrarOrderByEstadoFacturaPuntoVenta;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public EstadoFacturaPuntoVentaLogic estadofacturapuntoventaLogic;
	
	
	
	public JScrollPane jScrollPanelDatosEstadoFacturaPuntoVenta;
	public JScrollPane jScrollPanelDatosEdicionEstadoFacturaPuntoVenta;
	public JScrollPane jScrollPanelDatosGeneralEstadoFacturaPuntoVenta;
    
	
	
	//public JScrollPane jScrollPanelDatosEstadoFacturaPuntoVentaOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoEstadoFacturaPuntoVenta;
	//public JScrollPane jScrollPanelImportacionEstadoFacturaPuntoVenta;
	
	
	
	protected JPanel jPanelAccionesEstadoFacturaPuntoVenta;
	
    protected JPanel jPanelPaginacionEstadoFacturaPuntoVenta;
    protected JPanel jPanelParametrosReportesEstadoFacturaPuntoVenta;
	protected JPanel jPanelParametrosReportesAccionesEstadoFacturaPuntoVenta;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1EstadoFacturaPuntoVenta;
	protected JPanel jPanelParametrosAuxiliar2EstadoFacturaPuntoVenta;
	protected JPanel jPanelParametrosAuxiliar3EstadoFacturaPuntoVenta;
	protected JPanel jPanelParametrosAuxiliar4EstadoFacturaPuntoVenta;
	//protected JPanel jPanelParametrosAuxiliar5EstadoFacturaPuntoVenta;
	
	
	
	//protected JPanel jPanelReporteDinamicoEstadoFacturaPuntoVenta;
	//protected JPanel jPanelImportacionEstadoFacturaPuntoVenta;
	
	
	public JTable jTableDatosEstadoFacturaPuntoVenta;
	
	
	
	//public JTable jTableDatosEstadoFacturaPuntoVentaOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoEstadoFacturaPuntoVenta;
	protected JButton jButtonDuplicarEstadoFacturaPuntoVenta;
	protected JButton jButtonCopiarEstadoFacturaPuntoVenta;
	protected JButton jButtonVerFormEstadoFacturaPuntoVenta;
	protected JButton jButtonNuevoRelacionesEstadoFacturaPuntoVenta;
	protected JButton jButtonModificarEstadoFacturaPuntoVenta;
	
    protected JButton jButtonGuardarCambiosTablaEstadoFacturaPuntoVenta;
	protected JButton jButtonCerrarEstadoFacturaPuntoVenta;
	
	
	protected JButton jButtonRecargarInformacionEstadoFacturaPuntoVenta;
	protected JButton jButtonProcesarInformacionEstadoFacturaPuntoVenta;
	
	
	protected JButton jButtonAnterioresEstadoFacturaPuntoVenta;
	protected JButton jButtonSiguientesEstadoFacturaPuntoVenta;
	protected JButton jButtonNuevoGuardarCambiosEstadoFacturaPuntoVenta;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoEstadoFacturaPuntoVenta;
	//protected JButton jButtonCerrarReporteDinamicoEstadoFacturaPuntoVenta;
	//protected JButton jButtonGenerarExcelReporteDinamicoEstadoFacturaPuntoVenta;	
	
	
	
	//protected JButton jButtonAbrirImportacionEstadoFacturaPuntoVenta;
	//protected JButton jButtonGenerarImportacionEstadoFacturaPuntoVenta;
	//protected JButton jButtonCerrarImportacionEstadoFacturaPuntoVenta;
	//protected JFileChooser jFileChooserImportacionEstadoFacturaPuntoVenta;
	//protected File fileImportacionEstadoFacturaPuntoVenta;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarEstadoFacturaPuntoVenta;
	protected JButton jButtonDuplicarToolBarEstadoFacturaPuntoVenta;
	protected JButton jButtonNuevoRelacionesToolBarEstadoFacturaPuntoVenta;
	
	
	public JButton jButtonGuardarCambiosToolBarEstadoFacturaPuntoVenta;
	protected JButton jButtonCopiarToolBarEstadoFacturaPuntoVenta;
	protected JButton jButtonVerFormToolBarEstadoFacturaPuntoVenta;
	public JButton jButtonGuardarCambiosTablaToolBarEstadoFacturaPuntoVenta;
	protected JButton jButtonMostrarOcultarTablaToolBarEstadoFacturaPuntoVenta;
	protected JButton jButtonCerrarToolBarEstadoFacturaPuntoVenta;
	
	protected JButton jButtonRecargarInformacionToolBarEstadoFacturaPuntoVenta;
	protected JButton jButtonProcesarInformacionToolBarEstadoFacturaPuntoVenta;
	protected JButton jButtonAnterioresToolBarEstadoFacturaPuntoVenta;
	protected JButton jButtonSiguientesToolBarEstadoFacturaPuntoVenta;
	protected JButton jButtonNuevoGuardarCambiosToolBarEstadoFacturaPuntoVenta;
	protected JButton jButtonAbrirOrderByToolBarEstadoFacturaPuntoVenta;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoEstadoFacturaPuntoVenta;
	protected JMenuItem jMenuItemDuplicarEstadoFacturaPuntoVenta;
	protected JMenuItem jMenuItemNuevoRelacionesEstadoFacturaPuntoVenta;
	
	
	protected JMenuItem jMenuItemGuardarCambiosEstadoFacturaPuntoVenta;
	protected JMenuItem jMenuItemCopiarEstadoFacturaPuntoVenta;
	protected JMenuItem jMenuItemVerFormEstadoFacturaPuntoVenta;
	protected JMenuItem jMenuItemGuardarCambiosTablaEstadoFacturaPuntoVenta;
	protected JMenuItem jMenuItemCerrarEstadoFacturaPuntoVenta;
	protected JMenuItem jMenuItemDetalleCerrarEstadoFacturaPuntoVenta;
	protected JMenuItem jMenuItemDetalleAbrirOrderByEstadoFacturaPuntoVenta;
	protected JMenuItem jMenuItemDetalleMostarOcultarEstadoFacturaPuntoVenta;
	
	protected JMenuItem jMenuItemRecargarInformacionEstadoFacturaPuntoVenta;
	protected JMenuItem jMenuItemProcesarInformacionEstadoFacturaPuntoVenta;
	protected JMenuItem jMenuItemAnterioresEstadoFacturaPuntoVenta;
	protected JMenuItem jMenuItemSiguientesEstadoFacturaPuntoVenta;
	protected JMenuItem jMenuItemNuevoGuardarCambiosEstadoFacturaPuntoVenta;
	protected JMenuItem jMenuItemAbrirOrderByEstadoFacturaPuntoVenta;
	protected JMenuItem jMenuItemMostrarOcultarEstadoFacturaPuntoVenta;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesEstadoFacturaPuntoVenta;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosEstadoFacturaPuntoVenta;
	protected JCheckBox jCheckBoxSeleccionadosEstadoFacturaPuntoVenta;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaEstadoFacturaPuntoVenta;
	protected JCheckBox jCheckBoxConGraficoReporteEstadoFacturaPuntoVenta;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesEstadoFacturaPuntoVenta;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesEstadoFacturaPuntoVenta;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoEstadoFacturaPuntoVenta;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoEstadoFacturaPuntoVenta;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesEstadoFacturaPuntoVenta;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionEstadoFacturaPuntoVenta;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesEstadoFacturaPuntoVenta;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesEstadoFacturaPuntoVenta;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarEstadoFacturaPuntoVenta;
	protected JTextField jTextFieldValorCampoGeneralEstadoFacturaPuntoVenta;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteEstadoFacturaPuntoVenta;
	//public JList<Reporte> jListColumnasSelectReporteEstadoFacturaPuntoVenta;
	//public JScrollPane jScrollColumnasSelectReporteEstadoFacturaPuntoVenta;
	
	//public JLabel jLabelRelacionesSelectReporteEstadoFacturaPuntoVenta;
	//public JList<Reporte> jListRelacionesSelectReporteEstadoFacturaPuntoVenta;
	//public JScrollPane jScrollRelacionesSelectReporteEstadoFacturaPuntoVenta;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoEstadoFacturaPuntoVenta;
	//protected JCheckBox jCheckBoxConGraficoDinamicoEstadoFacturaPuntoVenta;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoEstadoFacturaPuntoVenta;
	//public JLabel jLabelTiposArchivoReporteDinamicoEstadoFacturaPuntoVenta;
	
		
	//public JLabel jLabelArchivoImportacionEstadoFacturaPuntoVenta;	
	//public JLabel jLabelPathArchivoImportacionEstadoFacturaPuntoVenta;
	//protected JTextField jTextFieldPathArchivoImportacionEstadoFacturaPuntoVenta;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoEstadoFacturaPuntoVenta;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoEstadoFacturaPuntoVenta;
	
	//public JLabel jLabelColumnaCategoriaValorEstadoFacturaPuntoVenta;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorEstadoFacturaPuntoVenta;
	
	//public JLabel jLabelColumnasValoresGraficoEstadoFacturaPuntoVenta;
	//public JList<Reporte> jListColumnasValoresGraficoEstadoFacturaPuntoVenta;
	//public JScrollPane jScrollColumnasValoresGraficoEstadoFacturaPuntoVenta;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoEstadoFacturaPuntoVenta;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoEstadoFacturaPuntoVenta;	
	
	
	
	
	
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
	public EstadoFacturaPuntoVentaJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("EstadoFacturaPuntoVenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoFacturaPuntoVentaJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EstadoFacturaPuntoVenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoFacturaPuntoVentaJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EstadoFacturaPuntoVenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoFacturaPuntoVentaJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("EstadoFacturaPuntoVenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionEstadoFacturaPuntoVenta)	{
		this.jButtonRecargarInformacionEstadoFacturaPuntoVenta = jButtonRecargarInformacionEstadoFacturaPuntoVenta;
	}
	
	public JButton getjButtonProcesarInformacionEstadoFacturaPuntoVenta() {
		return this.jButtonProcesarInformacionEstadoFacturaPuntoVenta;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionEstadoFacturaPuntoVenta)	{
		this.jButtonProcesarInformacionEstadoFacturaPuntoVenta = jButtonProcesarInformacionEstadoFacturaPuntoVenta;
	}
	
	
	public JButton getjButtonRecargarInformacionEstadoFacturaPuntoVenta() {
		return this.jButtonRecargarInformacionEstadoFacturaPuntoVenta;
	}
	
	
	public List<EstadoFacturaPuntoVenta> getestadofacturapuntoventas() {
		return this.estadofacturapuntoventas;
	}

	public void setestadofacturapuntoventas(List<EstadoFacturaPuntoVenta> estadofacturapuntoventas) {
		this.estadofacturapuntoventas = estadofacturapuntoventas;
	}
	
	public List<EstadoFacturaPuntoVenta> getestadofacturapuntoventasAux() {
		return this.estadofacturapuntoventasAux;
	}

	public void setestadofacturapuntoventasAux(List<EstadoFacturaPuntoVenta> estadofacturapuntoventasAux) {
		this.estadofacturapuntoventasAux = estadofacturapuntoventasAux;
	}
	
	public List<EstadoFacturaPuntoVenta> getestadofacturapuntoventasEliminados() {
		return this.estadofacturapuntoventasEliminados;
	}

	public void setEstadoFacturaPuntoVentasEliminados(List<EstadoFacturaPuntoVenta> estadofacturapuntoventasEliminados) {
		this.estadofacturapuntoventasEliminados = estadofacturapuntoventasEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarEstadoFacturaPuntoVenta() {
		return jComboBoxTiposSeleccionarEstadoFacturaPuntoVenta;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarEstadoFacturaPuntoVenta(
			JComboBox jComboBoxTiposSeleccionarEstadoFacturaPuntoVenta) {
		this.jComboBoxTiposSeleccionarEstadoFacturaPuntoVenta = jComboBoxTiposSeleccionarEstadoFacturaPuntoVenta;
	}
	
	public void setBorderResaltarTiposSeleccionarEstadoFacturaPuntoVenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarEstadoFacturaPuntoVenta.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarEstadoFacturaPuntoVenta .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralEstadoFacturaPuntoVenta() {
		return jTextFieldValorCampoGeneralEstadoFacturaPuntoVenta;
	}

	public void setjTextFieldValorCampoGeneralEstadoFacturaPuntoVenta(
			JTextField jTextFieldValorCampoGeneralEstadoFacturaPuntoVenta) {
		this.jTextFieldValorCampoGeneralEstadoFacturaPuntoVenta = jTextFieldValorCampoGeneralEstadoFacturaPuntoVenta;
	}

	public void setBorderResaltarValorCampoGeneralEstadoFacturaPuntoVenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoFacturaPuntoVenta.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralEstadoFacturaPuntoVenta .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosEstadoFacturaPuntoVenta() {
		return this.jCheckBoxSeleccionarTodosEstadoFacturaPuntoVenta;
	}

	public void setjCheckBoxSeleccionarTodosEstadoFacturaPuntoVenta(
			JCheckBox jCheckBoxSeleccionarTodosEstadoFacturaPuntoVenta) {
		this.jCheckBoxSeleccionarTodosEstadoFacturaPuntoVenta = jCheckBoxSeleccionarTodosEstadoFacturaPuntoVenta;
	}

	public void setBorderResaltarSeleccionarTodosEstadoFacturaPuntoVenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoFacturaPuntoVenta.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosEstadoFacturaPuntoVenta .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosEstadoFacturaPuntoVenta() {
		return this.jCheckBoxSeleccionadosEstadoFacturaPuntoVenta;
	}

	public void setjCheckBoxSeleccionadosEstadoFacturaPuntoVenta(
			JCheckBox jCheckBoxSeleccionadosEstadoFacturaPuntoVenta) {
		this.jCheckBoxSeleccionadosEstadoFacturaPuntoVenta = jCheckBoxSeleccionadosEstadoFacturaPuntoVenta;
	}
	
	public void setBorderResaltarSeleccionadosEstadoFacturaPuntoVenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoFacturaPuntoVenta.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosEstadoFacturaPuntoVenta .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesEstadoFacturaPuntoVenta() {
		return this.jComboBoxTiposArchivosReportesEstadoFacturaPuntoVenta;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesEstadoFacturaPuntoVenta(
			JComboBox jComboBoxTiposArchivosReportesEstadoFacturaPuntoVenta) {
		this.jComboBoxTiposArchivosReportesEstadoFacturaPuntoVenta = jComboBoxTiposArchivosReportesEstadoFacturaPuntoVenta;
	}

	public void setBorderResaltarTiposArchivosReportesEstadoFacturaPuntoVenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoFacturaPuntoVenta.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesEstadoFacturaPuntoVenta .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesEstadoFacturaPuntoVenta() {
		return this.jComboBoxTiposReportesEstadoFacturaPuntoVenta;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesEstadoFacturaPuntoVenta(
			JComboBox jComboBoxTiposReportesEstadoFacturaPuntoVenta) {
		this.jComboBoxTiposReportesEstadoFacturaPuntoVenta = jComboBoxTiposReportesEstadoFacturaPuntoVenta;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoEstadoFacturaPuntoVenta() {
	//	return jComboBoxTiposReportesDinamicoEstadoFacturaPuntoVenta;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoEstadoFacturaPuntoVenta(
	//		JComboBox jComboBoxTiposReportesDinamicoEstadoFacturaPuntoVenta) {
	//	this.jComboBoxTiposReportesDinamicoEstadoFacturaPuntoVenta = jComboBoxTiposReportesDinamicoEstadoFacturaPuntoVenta;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoEstadoFacturaPuntoVenta() {
	//	return jComboBoxTiposArchivosReportesDinamicoEstadoFacturaPuntoVenta;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoEstadoFacturaPuntoVenta(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoEstadoFacturaPuntoVenta) {
	//	this.jComboBoxTiposArchivosReportesDinamicoEstadoFacturaPuntoVenta = jComboBoxTiposArchivosReportesDinamicoEstadoFacturaPuntoVenta;
	//}
	
	public void setBorderResaltarTiposReportesEstadoFacturaPuntoVenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoFacturaPuntoVenta.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesEstadoFacturaPuntoVenta .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesEstadoFacturaPuntoVenta() {
		return this.jComboBoxTiposGraficosReportesEstadoFacturaPuntoVenta;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesEstadoFacturaPuntoVenta(
			JComboBox jComboBoxTiposGraficosReportesEstadoFacturaPuntoVenta) {
		this.jComboBoxTiposGraficosReportesEstadoFacturaPuntoVenta = jComboBoxTiposGraficosReportesEstadoFacturaPuntoVenta;
	}
	
	public void setBorderResaltarTiposGraficosReportesEstadoFacturaPuntoVenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoFacturaPuntoVenta.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesEstadoFacturaPuntoVenta .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionEstadoFacturaPuntoVenta() {
		return this.jComboBoxTiposPaginacionEstadoFacturaPuntoVenta;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionEstadoFacturaPuntoVenta(
			JComboBox jComboBoxTiposPaginacionEstadoFacturaPuntoVenta) {
		this.jComboBoxTiposPaginacionEstadoFacturaPuntoVenta = jComboBoxTiposPaginacionEstadoFacturaPuntoVenta;
	}
	
	public void setBorderResaltarTiposPaginacionEstadoFacturaPuntoVenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoFacturaPuntoVenta.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionEstadoFacturaPuntoVenta .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesEstadoFacturaPuntoVenta() {
		return this.jComboBoxTiposRelacionesEstadoFacturaPuntoVenta;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesEstadoFacturaPuntoVenta() {
		return this.jComboBoxTiposAccionesEstadoFacturaPuntoVenta;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesEstadoFacturaPuntoVenta(
			JComboBox jComboBoxTiposRelacionesEstadoFacturaPuntoVenta) {
		this.jComboBoxTiposRelacionesEstadoFacturaPuntoVenta = jComboBoxTiposRelacionesEstadoFacturaPuntoVenta;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesEstadoFacturaPuntoVenta(
			JComboBox jComboBoxTiposAccionesEstadoFacturaPuntoVenta) {
		this.jComboBoxTiposAccionesEstadoFacturaPuntoVenta = jComboBoxTiposAccionesEstadoFacturaPuntoVenta;
	}
	
	public void setBorderResaltarTiposRelacionesEstadoFacturaPuntoVenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoFacturaPuntoVenta.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesEstadoFacturaPuntoVenta .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesEstadoFacturaPuntoVenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoFacturaPuntoVenta.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesEstadoFacturaPuntoVenta .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoEstadoFacturaPuntoVenta() {
	//	return jCheckBoxConGraficoDinamicoEstadoFacturaPuntoVenta;
	//}

	//public void setjCheckBoxConGraficoDinamicoEstadoFacturaPuntoVenta(
	//		JCheckBox jCheckBoxConGraficoDinamicoEstadoFacturaPuntoVenta) {
	//	this.jCheckBoxConGraficoDinamicoEstadoFacturaPuntoVenta = jCheckBoxConGraficoDinamicoEstadoFacturaPuntoVenta;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoEstadoFacturaPuntoVenta() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarEstadoFacturaPuntoVenta.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoEstadoFacturaPuntoVenta .setBorder(borderResaltar);		
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
		this.estadofacturapuntoventaSessionBean=new EstadoFacturaPuntoVentaSessionBean();
		
		this.estadofacturapuntoventaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.estadofacturapuntoventaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.estadofacturapuntoventaSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=EstadoFacturaPuntoVentaJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=EstadoFacturaPuntoVentaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		EstadoFacturaPuntoVentaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		EstadoFacturaPuntoVentaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		EstadoFacturaPuntoVentaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Estado Factura MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 910) {
			iHeight=910;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.estadofacturapuntoventaSessionBean.getEsGuardarRelacionado()) {
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
		
		EstadoFacturaPuntoVentaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("EstadoFacturaPuntoVenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarEstadoFacturaPuntoVenta= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarEstadoFacturaPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarEstadoFacturaPuntoVenta,this.jTtoolBarEstadoFacturaPuntoVenta,
							"nuevo","nuevo","Nuevo"+" "+EstadoFacturaPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarEstadoFacturaPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarEstadoFacturaPuntoVenta,this.jTtoolBarEstadoFacturaPuntoVenta,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarEstadoFacturaPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarEstadoFacturaPuntoVenta,this.jTtoolBarEstadoFacturaPuntoVenta,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+EstadoFacturaPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarEstadoFacturaPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarEstadoFacturaPuntoVenta,this.jTtoolBarEstadoFacturaPuntoVenta,
							"duplicar","duplicar","Duplicar"+" "+EstadoFacturaPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarEstadoFacturaPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarEstadoFacturaPuntoVenta,this.jTtoolBarEstadoFacturaPuntoVenta,
							"copiar","copiar","Copiar"+" "+EstadoFacturaPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarEstadoFacturaPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarEstadoFacturaPuntoVenta,this.jTtoolBarEstadoFacturaPuntoVenta,
							"ver_form","ver_form","Ver"+" "+EstadoFacturaPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarEstadoFacturaPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEstadoFacturaPuntoVenta,this.jTtoolBarEstadoFacturaPuntoVenta,
							"recargar","recargar","Recargar"+" "+EstadoFacturaPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarEstadoFacturaPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEstadoFacturaPuntoVenta,this.jTtoolBarEstadoFacturaPuntoVenta,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarEstadoFacturaPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEstadoFacturaPuntoVenta,this.jTtoolBarEstadoFacturaPuntoVenta,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarEstadoFacturaPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarEstadoFacturaPuntoVenta,this.jTtoolBarEstadoFacturaPuntoVenta,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarEstadoFacturaPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarEstadoFacturaPuntoVenta,this.jTtoolBarEstadoFacturaPuntoVenta,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarEstadoFacturaPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarEstadoFacturaPuntoVenta,this.jTtoolBarEstadoFacturaPuntoVenta,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+EstadoFacturaPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarEstadoFacturaPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarEstadoFacturaPuntoVenta,this.jTtoolBarEstadoFacturaPuntoVenta,
							"cerrar","cerrar","Salir"+" "+EstadoFacturaPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarEstadoFacturaPuntoVenta=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarEstadoFacturaPuntoVenta;
			
				this.jButtonProcesarInformacionToolBarEstadoFacturaPuntoVenta=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarEstadoFacturaPuntoVenta;
				
		//protected JButton jButtonModificarToolBarEstadoFacturaPuntoVenta;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarEstadoFacturaPuntoVenta=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuEstadoFacturaPuntoVenta=new JMenuMe("General");
		this.jmenuArchivoEstadoFacturaPuntoVenta=new JMenuMe("Archivo");
		this.jmenuAccionesEstadoFacturaPuntoVenta=new JMenuMe("Acciones");
		this.jmenuDatosEstadoFacturaPuntoVenta=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoEstadoFacturaPuntoVenta= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoEstadoFacturaPuntoVenta.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoEstadoFacturaPuntoVenta,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoEstadoFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarEstadoFacturaPuntoVenta= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarEstadoFacturaPuntoVenta.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarEstadoFacturaPuntoVenta,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarEstadoFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesEstadoFacturaPuntoVenta= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesEstadoFacturaPuntoVenta.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesEstadoFacturaPuntoVenta,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesEstadoFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosEstadoFacturaPuntoVenta= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosEstadoFacturaPuntoVenta.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosEstadoFacturaPuntoVenta,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosEstadoFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarEstadoFacturaPuntoVenta= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarEstadoFacturaPuntoVenta.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarEstadoFacturaPuntoVenta,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarEstadoFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormEstadoFacturaPuntoVenta= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormEstadoFacturaPuntoVenta.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormEstadoFacturaPuntoVenta,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormEstadoFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaEstadoFacturaPuntoVenta= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaEstadoFacturaPuntoVenta.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaEstadoFacturaPuntoVenta,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaEstadoFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarEstadoFacturaPuntoVenta= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarEstadoFacturaPuntoVenta.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarEstadoFacturaPuntoVenta,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarEstadoFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionEstadoFacturaPuntoVenta= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionEstadoFacturaPuntoVenta.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionEstadoFacturaPuntoVenta,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionEstadoFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionEstadoFacturaPuntoVenta= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionEstadoFacturaPuntoVenta.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionEstadoFacturaPuntoVenta,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresEstadoFacturaPuntoVenta= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresEstadoFacturaPuntoVenta.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresEstadoFacturaPuntoVenta,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresEstadoFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesEstadoFacturaPuntoVenta= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesEstadoFacturaPuntoVenta.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesEstadoFacturaPuntoVenta,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesEstadoFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByEstadoFacturaPuntoVenta= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByEstadoFacturaPuntoVenta.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByEstadoFacturaPuntoVenta,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByEstadoFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarEstadoFacturaPuntoVenta= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarEstadoFacturaPuntoVenta.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarEstadoFacturaPuntoVenta,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarEstadoFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByEstadoFacturaPuntoVenta= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByEstadoFacturaPuntoVenta.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByEstadoFacturaPuntoVenta,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByEstadoFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarEstadoFacturaPuntoVenta= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarEstadoFacturaPuntoVenta.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarEstadoFacturaPuntoVenta,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarEstadoFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosEstadoFacturaPuntoVenta= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosEstadoFacturaPuntoVenta.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosEstadoFacturaPuntoVenta,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosEstadoFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoEstadoFacturaPuntoVenta.add(this.jMenuItemCerrarEstadoFacturaPuntoVenta);
			
			this.jmenuAccionesEstadoFacturaPuntoVenta.add(this.jMenuItemNuevoEstadoFacturaPuntoVenta);
			this.jmenuAccionesEstadoFacturaPuntoVenta.add(this.jMenuItemNuevoGuardarCambiosEstadoFacturaPuntoVenta);
			this.jmenuAccionesEstadoFacturaPuntoVenta.add(this.jMenuItemNuevoRelacionesEstadoFacturaPuntoVenta);
			this.jmenuAccionesEstadoFacturaPuntoVenta.add(this.jMenuItemGuardarCambiosTablaEstadoFacturaPuntoVenta);		
			this.jmenuAccionesEstadoFacturaPuntoVenta.add(this.jMenuItemDuplicarEstadoFacturaPuntoVenta);		
			this.jmenuAccionesEstadoFacturaPuntoVenta.add(this.jMenuItemCopiarEstadoFacturaPuntoVenta);		
			this.jmenuAccionesEstadoFacturaPuntoVenta.add(this.jMenuItemVerFormEstadoFacturaPuntoVenta);		
			
			this.jmenuDatosEstadoFacturaPuntoVenta.add(this.jMenuItemRecargarInformacionEstadoFacturaPuntoVenta);				
			this.jmenuDatosEstadoFacturaPuntoVenta.add(this.jMenuItemAnterioresEstadoFacturaPuntoVenta);				
			this.jmenuDatosEstadoFacturaPuntoVenta.add(this.jMenuItemSiguientesEstadoFacturaPuntoVenta);				
			this.jmenuDatosEstadoFacturaPuntoVenta.add(this.jMenuItemAbrirOrderByEstadoFacturaPuntoVenta);				
			this.jmenuDatosEstadoFacturaPuntoVenta.add(this.jMenuItemMostrarOcultarEstadoFacturaPuntoVenta);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesEstadoFacturaPuntoVenta.add(this.jMenuItemGuardarCambiosEstadoFacturaPuntoVenta);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoEstadoFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesEstadoFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosEstadoFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarEstadoFacturaPuntoVenta.add(this.jmenuArchivoEstadoFacturaPuntoVenta);		
			this.jmenuBarEstadoFacturaPuntoVenta.add(this.jmenuAccionesEstadoFacturaPuntoVenta);		
			this.jmenuBarEstadoFacturaPuntoVenta.add(this.jmenuDatosEstadoFacturaPuntoVenta);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarEstadoFacturaPuntoVenta);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasEstadoFacturaPuntoVenta() {
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
			//this.jInternalFrameDetalleEstadoFacturaPuntoVenta = new EstadoFacturaPuntoVentaDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Estado Factura DATOS");
			this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta = new EstadoFacturaPuntoVentaDetalleFormJInternalFrame(jDesktopPane,this.estadofacturapuntoventaSessionBean.getConGuardarRelaciones(),this.estadofacturapuntoventaSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormEstadoFacturaPuntoVenta = null;//new EstadoFacturaPuntoVentaDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutEstadoFacturaPuntoVenta= new GridBagLayout();
		
		
		this.jTableDatosEstadoFacturaPuntoVenta = new JTableMe();      
		
		String sToolTipEstadoFacturaPuntoVenta="";
		sToolTipEstadoFacturaPuntoVenta=EstadoFacturaPuntoVentaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipEstadoFacturaPuntoVenta+="(PuntoVenta.EstadoFacturaPuntoVenta)";
		}
		
		if(!this.estadofacturapuntoventaSessionBean.getEsGuardarRelacionado()) {
			sToolTipEstadoFacturaPuntoVenta+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosEstadoFacturaPuntoVenta.setToolTipText(sToolTipEstadoFacturaPuntoVenta);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosEstadoFacturaPuntoVenta);
		this.jTableDatosEstadoFacturaPuntoVenta.setAutoCreateRowSorter(true);
		this.jTableDatosEstadoFacturaPuntoVenta.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosEstadoFacturaPuntoVenta.setRowSelectionAllowed(true);
		this.jTableDatosEstadoFacturaPuntoVenta.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosEstadoFacturaPuntoVenta,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoEstadoFacturaPuntoVenta = new JButtonMe();
		this.jButtonDuplicarEstadoFacturaPuntoVenta = new JButtonMe();
		this.jButtonCopiarEstadoFacturaPuntoVenta = new JButtonMe();
		this.jButtonVerFormEstadoFacturaPuntoVenta = new JButtonMe();
		this.jButtonNuevoRelacionesEstadoFacturaPuntoVenta = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaEstadoFacturaPuntoVenta = new JButtonMe();
		this.jButtonCerrarEstadoFacturaPuntoVenta = new JButtonMe();
		
		this.jScrollPanelDatosEstadoFacturaPuntoVenta = new JScrollPane();   
        this.jScrollPanelDatosGeneralEstadoFacturaPuntoVenta = new JScrollPane();
		
				
		
		
		this.jPanelAccionesEstadoFacturaPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Estado Factura";
		
		if(!this.estadofacturapuntoventaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosEstadoFacturaPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Facturas" + this.sPath));
		} else {
			this.jScrollPanelDatosEstadoFacturaPuntoVenta.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralEstadoFacturaPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesEstadoFacturaPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesEstadoFacturaPuntoVenta.setToolTipText("Acciones");
        this.jPanelAccionesEstadoFacturaPuntoVenta.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralEstadoFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEstadoFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoEstadoFacturaPuntoVenta=new ReporteDinamicoJInternalFrame(EstadoFacturaPuntoVentaConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoEstadoFacturaPuntoVenta();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionEstadoFacturaPuntoVenta=new ImportacionJInternalFrame(EstadoFacturaPuntoVentaConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionEstadoFacturaPuntoVenta();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByEstadoFacturaPuntoVenta = new JButtonMe();
		
		this.jButtonAbrirOrderByEstadoFacturaPuntoVenta.setText("Orden");
		this.jButtonAbrirOrderByEstadoFacturaPuntoVenta.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByEstadoFacturaPuntoVenta,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByEstadoFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByEstadoFacturaPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByEstadoFacturaPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByEstadoFacturaPuntoVenta=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEstadoFacturaPuntoVenta,false,this);
			
			//this.cargarOrderByEstadoFacturaPuntoVenta(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByEstadoFacturaPuntoVenta=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEstadoFacturaPuntoVenta,true,this);
			
			//this.cargarOrderByEstadoFacturaPuntoVenta(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosEstadoFacturaPuntoVenta.setMinimumSize(new Dimension(400,50));//330
		this.jTableDatosEstadoFacturaPuntoVenta.setMaximumSize(new Dimension(400,50));//330
		this.jTableDatosEstadoFacturaPuntoVenta.setPreferredSize(new Dimension(400,50));//330
		
		this.jScrollPanelDatosEstadoFacturaPuntoVenta.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosEstadoFacturaPuntoVenta.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosEstadoFacturaPuntoVenta.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoEstadoFacturaPuntoVenta.setText("Nuevo");
		this.jButtonDuplicarEstadoFacturaPuntoVenta.setText("Duplicar");
		this.jButtonCopiarEstadoFacturaPuntoVenta.setText("Copiar");
		this.jButtonVerFormEstadoFacturaPuntoVenta.setText("Ver");
		this.jButtonNuevoRelacionesEstadoFacturaPuntoVenta.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaEstadoFacturaPuntoVenta.setText("Guardar");
		this.jButtonCerrarEstadoFacturaPuntoVenta.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoEstadoFacturaPuntoVenta,"nuevo_button","Nuevo",this.estadofacturapuntoventaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarEstadoFacturaPuntoVenta,"duplicar_button","Duplicar",this.estadofacturapuntoventaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarEstadoFacturaPuntoVenta,"copiar_button","Copiar",this.estadofacturapuntoventaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormEstadoFacturaPuntoVenta,"ver_form","Ver",this.estadofacturapuntoventaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesEstadoFacturaPuntoVenta,"nuevorelaciones_button","Nuevo Rel",this.estadofacturapuntoventaSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaEstadoFacturaPuntoVenta,"guardarcambiostabla_button","Guardar",this.estadofacturapuntoventaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarEstadoFacturaPuntoVenta,"cerrar_button","Salir",this.estadofacturapuntoventaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoEstadoFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarEstadoFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarEstadoFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormEstadoFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesEstadoFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaEstadoFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarEstadoFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoEstadoFacturaPuntoVenta.setToolTipText("Nuevo"+" "+EstadoFacturaPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarEstadoFacturaPuntoVenta.setToolTipText("Duplicar"+" "+EstadoFacturaPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarEstadoFacturaPuntoVenta.setToolTipText("Copiar"+" "+EstadoFacturaPuntoVentaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormEstadoFacturaPuntoVenta.setToolTipText("Ver"+" "+EstadoFacturaPuntoVentaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesEstadoFacturaPuntoVenta.setToolTipText("Nuevo Rel"+" "+EstadoFacturaPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaEstadoFacturaPuntoVenta.setToolTipText("Guardar"+" "+EstadoFacturaPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarEstadoFacturaPuntoVenta.setToolTipText("Salir"+" "+EstadoFacturaPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoEstadoFacturaPuntoVenta";
		inputMap = this.jButtonNuevoEstadoFacturaPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoEstadoFacturaPuntoVenta.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoEstadoFacturaPuntoVenta"));
		
		//DUPLICAR
		sMapKey = "DuplicarEstadoFacturaPuntoVenta";
		inputMap = this.jButtonDuplicarEstadoFacturaPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarEstadoFacturaPuntoVenta.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarEstadoFacturaPuntoVenta"));
		
		//COPIAR
		sMapKey = "CopiarEstadoFacturaPuntoVenta";
		inputMap = this.jButtonCopiarEstadoFacturaPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarEstadoFacturaPuntoVenta.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarEstadoFacturaPuntoVenta"));
		
		//VEr FORM
		sMapKey = "VerFormEstadoFacturaPuntoVenta";
		inputMap = this.jButtonVerFormEstadoFacturaPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormEstadoFacturaPuntoVenta.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormEstadoFacturaPuntoVenta"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesEstadoFacturaPuntoVenta";
		inputMap = this.jButtonNuevoRelacionesEstadoFacturaPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesEstadoFacturaPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesEstadoFacturaPuntoVenta"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarEstadoFacturaPuntoVenta";
		inputMap = this.jButtonModificarEstadoFacturaPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarEstadoFacturaPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarEstadoFacturaPuntoVenta"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarEstadoFacturaPuntoVenta";
		inputMap = this.jButtonCerrarEstadoFacturaPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarEstadoFacturaPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarEstadoFacturaPuntoVenta"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaEstadoFacturaPuntoVenta";
		inputMap = this.jButtonGuardarCambiosTablaEstadoFacturaPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaEstadoFacturaPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaEstadoFacturaPuntoVenta"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesEstadoFacturaPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesEstadoFacturaPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionEstadoFacturaPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1EstadoFacturaPuntoVenta= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2EstadoFacturaPuntoVenta= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3EstadoFacturaPuntoVenta= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4EstadoFacturaPuntoVenta= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5EstadoFacturaPuntoVenta= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesEstadoFacturaPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesEstadoFacturaPuntoVenta.setName("jPanelParametrosReportesEstadoFacturaPuntoVenta"); 
		
		this.jPanelParametrosReportesAccionesEstadoFacturaPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesEstadoFacturaPuntoVenta.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesEstadoFacturaPuntoVenta.setName("jPanelParametrosReportesAccionesEstadoFacturaPuntoVenta"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesEstadoFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesEstadoFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionEstadoFacturaPuntoVenta = new JButtonMe();
		this.jButtonRecargarInformacionEstadoFacturaPuntoVenta.setText("Recargar");
		this.jButtonRecargarInformacionEstadoFacturaPuntoVenta.setToolTipText("Recargar"+" "+EstadoFacturaPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionEstadoFacturaPuntoVenta,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionEstadoFacturaPuntoVenta = new JButtonMe();
		this.jButtonProcesarInformacionEstadoFacturaPuntoVenta.setText("Procesar");
		this.jButtonProcesarInformacionEstadoFacturaPuntoVenta.setToolTipText("Procesar"+" "+EstadoFacturaPuntoVentaConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionEstadoFacturaPuntoVenta.setVisible(false);
			
		this.jButtonProcesarInformacionEstadoFacturaPuntoVenta.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionEstadoFacturaPuntoVenta.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionEstadoFacturaPuntoVenta.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesEstadoFacturaPuntoVenta = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEstadoFacturaPuntoVenta.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesEstadoFacturaPuntoVenta.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesEstadoFacturaPuntoVenta = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEstadoFacturaPuntoVenta.setText("TIPO");       
		this.jComboBoxTiposReportesEstadoFacturaPuntoVenta.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesEstadoFacturaPuntoVenta = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEstadoFacturaPuntoVenta.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesEstadoFacturaPuntoVenta.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionEstadoFacturaPuntoVenta = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionEstadoFacturaPuntoVenta.setText("Paginacion");
		this.jComboBoxTiposPaginacionEstadoFacturaPuntoVenta.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesEstadoFacturaPuntoVenta = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesEstadoFacturaPuntoVenta.setText("Accion");
		this.jComboBoxTiposRelacionesEstadoFacturaPuntoVenta.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesEstadoFacturaPuntoVenta = new JComboBoxMe();
		//this.jComboBoxTiposAccionesEstadoFacturaPuntoVenta.setText("Accion");
		this.jComboBoxTiposAccionesEstadoFacturaPuntoVenta.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarEstadoFacturaPuntoVenta = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarEstadoFacturaPuntoVenta.setText("Accion");
		this.jComboBoxTiposSeleccionarEstadoFacturaPuntoVenta.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralEstadoFacturaPuntoVenta=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralEstadoFacturaPuntoVenta.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralEstadoFacturaPuntoVenta.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralEstadoFacturaPuntoVenta.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesEstadoFacturaPuntoVenta = new JLabelMe();
		
		this.jLabelAccionesEstadoFacturaPuntoVenta.setText("Acciones");		
		this.jLabelAccionesEstadoFacturaPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEstadoFacturaPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEstadoFacturaPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosEstadoFacturaPuntoVenta = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosEstadoFacturaPuntoVenta.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosEstadoFacturaPuntoVenta.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosEstadoFacturaPuntoVenta = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosEstadoFacturaPuntoVenta.setText("Seleccionados");
		this.jCheckBoxSeleccionadosEstadoFacturaPuntoVenta.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaEstadoFacturaPuntoVenta = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaEstadoFacturaPuntoVenta.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaEstadoFacturaPuntoVenta.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteEstadoFacturaPuntoVenta = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteEstadoFacturaPuntoVenta.setText("Graf.");
		this.jCheckBoxConGraficoReporteEstadoFacturaPuntoVenta.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresEstadoFacturaPuntoVenta = new JButtonMe();
		//this.jButtonAnterioresEstadoFacturaPuntoVenta.setText("<<");
        this.jButtonAnterioresEstadoFacturaPuntoVenta.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresEstadoFacturaPuntoVenta,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresEstadoFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesEstadoFacturaPuntoVenta = new JButtonMe();
		//this.jButtonSiguientesEstadoFacturaPuntoVenta.setText(">>");
        this.jButtonSiguientesEstadoFacturaPuntoVenta.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesEstadoFacturaPuntoVenta,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesEstadoFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosEstadoFacturaPuntoVenta = new JButtonMe();
		this.jButtonNuevoGuardarCambiosEstadoFacturaPuntoVenta.setText("Nue");
        this.jButtonNuevoGuardarCambiosEstadoFacturaPuntoVenta.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosEstadoFacturaPuntoVenta,"nuevoguardarcambios_button","Nue",this.estadofacturapuntoventaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosEstadoFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosEstadoFacturaPuntoVenta";
		inputMap = this.jButtonNuevoGuardarCambiosEstadoFacturaPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosEstadoFacturaPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosEstadoFacturaPuntoVenta"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionEstadoFacturaPuntoVenta";
		inputMap = this.jButtonRecargarInformacionEstadoFacturaPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionEstadoFacturaPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionEstadoFacturaPuntoVenta"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesEstadoFacturaPuntoVenta";
		inputMap = this.jButtonSiguientesEstadoFacturaPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesEstadoFacturaPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesEstadoFacturaPuntoVenta"));
		
		//ANTERIORES		
		sMapKey = "AnterioresEstadoFacturaPuntoVenta";
		inputMap = this.jButtonAnterioresEstadoFacturaPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresEstadoFacturaPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresEstadoFacturaPuntoVenta"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasEstadoFacturaPuntoVenta();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesEstadoFacturaPuntoVenta.setMinimumSize(new Dimension(this.getWidth(),EstadoFacturaPuntoVentaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EstadoFacturaPuntoVentaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesEstadoFacturaPuntoVenta.setMaximumSize(new Dimension(this.getWidth(),EstadoFacturaPuntoVentaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EstadoFacturaPuntoVentaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesEstadoFacturaPuntoVenta.setPreferredSize(new Dimension(this.getWidth(),EstadoFacturaPuntoVentaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EstadoFacturaPuntoVentaBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionEstadoFacturaPuntoVenta = new GridBagLayout();

			this.jPanelPaginacionEstadoFacturaPuntoVenta.setLayout(gridaBagLayoutPaginacionEstadoFacturaPuntoVenta);						
			
			this.gridBagConstraintsEstadoFacturaPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsEstadoFacturaPuntoVenta.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsEstadoFacturaPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoFacturaPuntoVenta.gridy = 0;
			this.gridBagConstraintsEstadoFacturaPuntoVenta.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionEstadoFacturaPuntoVenta.add(this.jButtonAnterioresEstadoFacturaPuntoVenta, this.gridBagConstraintsEstadoFacturaPuntoVenta);
					
						
			this.gridBagConstraintsEstadoFacturaPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsEstadoFacturaPuntoVenta.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsEstadoFacturaPuntoVenta.gridy = 0;
			
			this.jPanelPaginacionEstadoFacturaPuntoVenta.add(this.jButtonNuevoGuardarCambiosEstadoFacturaPuntoVenta, this.gridBagConstraintsEstadoFacturaPuntoVenta);
						
			
			this.gridBagConstraintsEstadoFacturaPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsEstadoFacturaPuntoVenta.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsEstadoFacturaPuntoVenta.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsEstadoFacturaPuntoVenta.gridy = 0;
			this.jPanelPaginacionEstadoFacturaPuntoVenta.add(this.jButtonSiguientesEstadoFacturaPuntoVenta, this.gridBagConstraintsEstadoFacturaPuntoVenta);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsEstadoFacturaPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsEstadoFacturaPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoFacturaPuntoVenta.gridy = 1;
			this.gridBagConstraintsEstadoFacturaPuntoVenta.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEstadoFacturaPuntoVenta.add(this.jButtonNuevoEstadoFacturaPuntoVenta, this.gridBagConstraintsEstadoFacturaPuntoVenta);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsEstadoFacturaPuntoVenta = new GridBagConstraints();
				this.gridBagConstraintsEstadoFacturaPuntoVenta.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsEstadoFacturaPuntoVenta.gridy = 1;
				this.gridBagConstraintsEstadoFacturaPuntoVenta.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionEstadoFacturaPuntoVenta.add(this.jButtonNuevoRelacionesEstadoFacturaPuntoVenta, this.gridBagConstraintsEstadoFacturaPuntoVenta);
			}
			
			
			if(!this.estadofacturapuntoventaSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsEstadoFacturaPuntoVenta = new GridBagConstraints();
				this.gridBagConstraintsEstadoFacturaPuntoVenta.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsEstadoFacturaPuntoVenta.gridy = 1;
				this.gridBagConstraintsEstadoFacturaPuntoVenta.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionEstadoFacturaPuntoVenta.add(this.jButtonGuardarCambiosTablaEstadoFacturaPuntoVenta, this.gridBagConstraintsEstadoFacturaPuntoVenta);
			}
			
			
			
			this.gridBagConstraintsEstadoFacturaPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsEstadoFacturaPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoFacturaPuntoVenta.gridy = 1;
			this.gridBagConstraintsEstadoFacturaPuntoVenta.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEstadoFacturaPuntoVenta.add(this.jButtonDuplicarEstadoFacturaPuntoVenta, this.gridBagConstraintsEstadoFacturaPuntoVenta);
			
			this.gridBagConstraintsEstadoFacturaPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsEstadoFacturaPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoFacturaPuntoVenta.gridy = 1;
			this.gridBagConstraintsEstadoFacturaPuntoVenta.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEstadoFacturaPuntoVenta.add(this.jButtonCopiarEstadoFacturaPuntoVenta, this.gridBagConstraintsEstadoFacturaPuntoVenta);
		
			this.gridBagConstraintsEstadoFacturaPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsEstadoFacturaPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoFacturaPuntoVenta.gridy = 1;
			this.gridBagConstraintsEstadoFacturaPuntoVenta.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEstadoFacturaPuntoVenta.add(this.jButtonVerFormEstadoFacturaPuntoVenta, this.gridBagConstraintsEstadoFacturaPuntoVenta);
		
			this.gridBagConstraintsEstadoFacturaPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsEstadoFacturaPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoFacturaPuntoVenta.gridy = 1;
			this.gridBagConstraintsEstadoFacturaPuntoVenta.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionEstadoFacturaPuntoVenta.add(this.jButtonCerrarEstadoFacturaPuntoVenta, this.gridBagConstraintsEstadoFacturaPuntoVenta);
		
		
		
		this.jButtonRecargarInformacionEstadoFacturaPuntoVenta.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionEstadoFacturaPuntoVenta.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionEstadoFacturaPuntoVenta.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionEstadoFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesEstadoFacturaPuntoVenta.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesEstadoFacturaPuntoVenta.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesEstadoFacturaPuntoVenta.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesEstadoFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesEstadoFacturaPuntoVenta.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesEstadoFacturaPuntoVenta.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesEstadoFacturaPuntoVenta.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesEstadoFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesEstadoFacturaPuntoVenta.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesEstadoFacturaPuntoVenta.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesEstadoFacturaPuntoVenta.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesEstadoFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionEstadoFacturaPuntoVenta.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionEstadoFacturaPuntoVenta.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionEstadoFacturaPuntoVenta.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionEstadoFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesEstadoFacturaPuntoVenta.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesEstadoFacturaPuntoVenta.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesEstadoFacturaPuntoVenta.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesEstadoFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesEstadoFacturaPuntoVenta.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEstadoFacturaPuntoVenta.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEstadoFacturaPuntoVenta.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesEstadoFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarEstadoFacturaPuntoVenta.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarEstadoFacturaPuntoVenta.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarEstadoFacturaPuntoVenta.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarEstadoFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaEstadoFacturaPuntoVenta.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaEstadoFacturaPuntoVenta.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaEstadoFacturaPuntoVenta.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaEstadoFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteEstadoFacturaPuntoVenta.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteEstadoFacturaPuntoVenta.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteEstadoFacturaPuntoVenta.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteEstadoFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosEstadoFacturaPuntoVenta.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosEstadoFacturaPuntoVenta.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosEstadoFacturaPuntoVenta.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosEstadoFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosEstadoFacturaPuntoVenta.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosEstadoFacturaPuntoVenta.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosEstadoFacturaPuntoVenta.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosEstadoFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesEstadoFacturaPuntoVenta = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesEstadoFacturaPuntoVenta = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1EstadoFacturaPuntoVenta = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2EstadoFacturaPuntoVenta = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3EstadoFacturaPuntoVenta = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4EstadoFacturaPuntoVenta = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesEstadoFacturaPuntoVenta.setLayout(gridaBagParametrosReportesEstadoFacturaPuntoVenta);
			this.jPanelParametrosReportesAccionesEstadoFacturaPuntoVenta.setLayout(gridaBagParametrosReportesAccionesEstadoFacturaPuntoVenta);
			
			
			this.jPanelParametrosAuxiliar1EstadoFacturaPuntoVenta.setLayout(gridaBagParametrosAuxiliar1EstadoFacturaPuntoVenta);
			this.jPanelParametrosAuxiliar2EstadoFacturaPuntoVenta.setLayout(gridaBagParametrosAuxiliar2EstadoFacturaPuntoVenta);
			this.jPanelParametrosAuxiliar3EstadoFacturaPuntoVenta.setLayout(gridaBagParametrosAuxiliar3EstadoFacturaPuntoVenta);
			this.jPanelParametrosAuxiliar4EstadoFacturaPuntoVenta.setLayout(gridaBagParametrosAuxiliar4EstadoFacturaPuntoVenta);
			//this.jPanelParametrosAuxiliar5EstadoFacturaPuntoVenta.setLayout(gridaBagParametrosAuxiliar2EstadoFacturaPuntoVenta);			
			
			
			
			
			this.gridBagConstraintsEstadoFacturaPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsEstadoFacturaPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoFacturaPuntoVenta.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEstadoFacturaPuntoVenta.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstadoFacturaPuntoVenta.add(this.jButtonRecargarInformacionEstadoFacturaPuntoVenta, this.gridBagConstraintsEstadoFacturaPuntoVenta);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsEstadoFacturaPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsEstadoFacturaPuntoVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoFacturaPuntoVenta.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoFacturaPuntoVenta.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1EstadoFacturaPuntoVenta.add(this.jComboBoxTiposPaginacionEstadoFacturaPuntoVenta, this.gridBagConstraintsEstadoFacturaPuntoVenta);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsEstadoFacturaPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsEstadoFacturaPuntoVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoFacturaPuntoVenta.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoFacturaPuntoVenta.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1EstadoFacturaPuntoVenta.add(this.jCheckBoxConAltoMaximoTablaEstadoFacturaPuntoVenta, this.gridBagConstraintsEstadoFacturaPuntoVenta);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsEstadoFacturaPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsEstadoFacturaPuntoVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoFacturaPuntoVenta.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoFacturaPuntoVenta.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1EstadoFacturaPuntoVenta.add(this.jComboBoxTiposArchivosReportesEstadoFacturaPuntoVenta, this.gridBagConstraintsEstadoFacturaPuntoVenta);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsEstadoFacturaPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsEstadoFacturaPuntoVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoFacturaPuntoVenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoFacturaPuntoVenta.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoFacturaPuntoVenta.add(this.jPanelParametrosAuxiliar1EstadoFacturaPuntoVenta, this.gridBagConstraintsEstadoFacturaPuntoVenta);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsEstadoFacturaPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsEstadoFacturaPuntoVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoFacturaPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoFacturaPuntoVenta.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEstadoFacturaPuntoVenta.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4EstadoFacturaPuntoVenta.add(this.jComboBoxTiposReportesEstadoFacturaPuntoVenta, this.gridBagConstraintsEstadoFacturaPuntoVenta);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsEstadoFacturaPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsEstadoFacturaPuntoVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoFacturaPuntoVenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoFacturaPuntoVenta.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoFacturaPuntoVenta.add(this.jPanelParametrosAuxiliar4EstadoFacturaPuntoVenta, this.gridBagConstraintsEstadoFacturaPuntoVenta);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsEstadoFacturaPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsEstadoFacturaPuntoVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoFacturaPuntoVenta.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoFacturaPuntoVenta.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoFacturaPuntoVenta.add(this.jComboBoxTiposReportesEstadoFacturaPuntoVenta, this.gridBagConstraintsEstadoFacturaPuntoVenta);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsEstadoFacturaPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsEstadoFacturaPuntoVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoFacturaPuntoVenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoFacturaPuntoVenta.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEstadoFacturaPuntoVenta.add(this.jCheckBoxGenerarReporteEstadoFacturaPuntoVenta, this.gridBagConstraintsEstadoFacturaPuntoVenta);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsEstadoFacturaPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsEstadoFacturaPuntoVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoFacturaPuntoVenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoFacturaPuntoVenta.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoFacturaPuntoVenta.add(this.jPanelParametrosAuxiliar2EstadoFacturaPuntoVenta, this.gridBagConstraintsEstadoFacturaPuntoVenta);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsEstadoFacturaPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsEstadoFacturaPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoFacturaPuntoVenta.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEstadoFacturaPuntoVenta.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEstadoFacturaPuntoVenta.add(this.jLabelAccionesEstadoFacturaPuntoVenta, this.gridBagConstraintsEstadoFacturaPuntoVenta);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsEstadoFacturaPuntoVenta = new GridBagConstraints();
				this.gridBagConstraintsEstadoFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsEstadoFacturaPuntoVenta.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsEstadoFacturaPuntoVenta.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesEstadoFacturaPuntoVenta.add(this.jButtonAbrirOrderByEstadoFacturaPuntoVenta, this.gridBagConstraintsEstadoFacturaPuntoVenta);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsEstadoFacturaPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsEstadoFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsEstadoFacturaPuntoVenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoFacturaPuntoVenta.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstadoFacturaPuntoVenta.add(this.jComboBoxTiposSeleccionarEstadoFacturaPuntoVenta, this.gridBagConstraintsEstadoFacturaPuntoVenta);			
			
			
			/*
			this.gridBagConstraintsEstadoFacturaPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsEstadoFacturaPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoFacturaPuntoVenta.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEstadoFacturaPuntoVenta.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEstadoFacturaPuntoVenta.add(this.jCheckBoxSeleccionarTodosEstadoFacturaPuntoVenta, this.gridBagConstraintsEstadoFacturaPuntoVenta);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsEstadoFacturaPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsEstadoFacturaPuntoVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoFacturaPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoFacturaPuntoVenta.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEstadoFacturaPuntoVenta.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3EstadoFacturaPuntoVenta.add(this.jCheckBoxSeleccionarTodosEstadoFacturaPuntoVenta, this.gridBagConstraintsEstadoFacturaPuntoVenta);															
				
			this.gridBagConstraintsEstadoFacturaPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsEstadoFacturaPuntoVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoFacturaPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoFacturaPuntoVenta.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEstadoFacturaPuntoVenta.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3EstadoFacturaPuntoVenta.add(this.jCheckBoxSeleccionadosEstadoFacturaPuntoVenta, this.gridBagConstraintsEstadoFacturaPuntoVenta);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsEstadoFacturaPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsEstadoFacturaPuntoVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoFacturaPuntoVenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoFacturaPuntoVenta.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoFacturaPuntoVenta.add(this.jPanelParametrosAuxiliar3EstadoFacturaPuntoVenta, this.gridBagConstraintsEstadoFacturaPuntoVenta);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsEstadoFacturaPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsEstadoFacturaPuntoVenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoFacturaPuntoVenta.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstadoFacturaPuntoVenta.add(this.jComboBoxTiposRelacionesEstadoFacturaPuntoVenta, this.gridBagConstraintsEstadoFacturaPuntoVenta);
				
			this.gridBagConstraintsEstadoFacturaPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsEstadoFacturaPuntoVenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoFacturaPuntoVenta.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstadoFacturaPuntoVenta.add(this.jComboBoxTiposAccionesEstadoFacturaPuntoVenta, this.gridBagConstraintsEstadoFacturaPuntoVenta);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosEstadoFacturaPuntoVenta = new GridBagLayout();

			this.jScrollPanelDatosEstadoFacturaPuntoVenta.setLayout(gridaBagLayoutDatosEstadoFacturaPuntoVenta);
			
			this.gridBagConstraintsEstadoFacturaPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsEstadoFacturaPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoFacturaPuntoVenta.gridy = 0;
			this.gridBagConstraintsEstadoFacturaPuntoVenta.gridx = 0;
			
			this.jScrollPanelDatosEstadoFacturaPuntoVenta.add(this.jTableDatosEstadoFacturaPuntoVenta, this.gridBagConstraintsEstadoFacturaPuntoVenta);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosEstadoFacturaPuntoVenta.setViewportView(this.jTableDatosEstadoFacturaPuntoVenta);
		this.jTableDatosEstadoFacturaPuntoVenta.setFillsViewportHeight(true);
		this.jTableDatosEstadoFacturaPuntoVenta.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesEstadoFacturaPuntoVenta= new GridBagLayout();
		this.jPanelAccionesEstadoFacturaPuntoVenta.setLayout(gridaBagLayoutAccionesEstadoFacturaPuntoVenta);
		
		
		/*	
		this.gridBagConstraintsEstadoFacturaPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsEstadoFacturaPuntoVenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoFacturaPuntoVenta.gridy = 0;
		this.gridBagConstraintsEstadoFacturaPuntoVenta.gridx = 0;
			
		this.jPanelAccionesEstadoFacturaPuntoVenta.add(this.jButtonNuevoEstadoFacturaPuntoVenta, this.gridBagConstraintsEstadoFacturaPuntoVenta);
		*/
		int iPosXAccion=0;
		
						
		
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutEstadoFacturaPuntoVenta = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutEstadoFacturaPuntoVenta);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.estadofacturapuntoventaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsEstadoFacturaPuntoVenta = new GridBagConstraints();						
			this.gridBagConstraintsEstadoFacturaPuntoVenta.gridy = iGridyPrincipal++;
			this.gridBagConstraintsEstadoFacturaPuntoVenta.gridx = 0;		
			//this.gridBagConstraintsEstadoFacturaPuntoVenta.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoFacturaPuntoVenta.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsEstadoFacturaPuntoVenta.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarEstadoFacturaPuntoVenta, this.gridBagConstraintsEstadoFacturaPuntoVenta);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsEstadoFacturaPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsEstadoFacturaPuntoVenta.gridy = iGridyPrincipal++;
		this.gridBagConstraintsEstadoFacturaPuntoVenta.gridx = 0;		
		//this.gridBagConstraintsEstadoFacturaPuntoVenta.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoFacturaPuntoVenta.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsEstadoFacturaPuntoVenta.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsEstadoFacturaPuntoVenta);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsEstadoFacturaPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsEstadoFacturaPuntoVenta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoFacturaPuntoVenta.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesEstadoFacturaPuntoVenta, this.gridBagConstraintsEstadoFacturaPuntoVenta);								
		
		
		/*
		this.gridBagConstraintsEstadoFacturaPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsEstadoFacturaPuntoVenta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoFacturaPuntoVenta.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesEstadoFacturaPuntoVenta, this.gridBagConstraintsEstadoFacturaPuntoVenta);
		*/		
		
		this.gridBagConstraintsEstadoFacturaPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsEstadoFacturaPuntoVenta.gridy =iGridyPrincipal++;
		this.gridBagConstraintsEstadoFacturaPuntoVenta.gridx =0;
		this.gridBagConstraintsEstadoFacturaPuntoVenta.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsEstadoFacturaPuntoVenta.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosEstadoFacturaPuntoVenta, this.gridBagConstraintsEstadoFacturaPuntoVenta);
				
		
		this.gridBagConstraintsEstadoFacturaPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsEstadoFacturaPuntoVenta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoFacturaPuntoVenta.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionEstadoFacturaPuntoVenta, this.gridBagConstraintsEstadoFacturaPuntoVenta);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(EstadoFacturaPuntoVentaJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosEstadoFacturaPuntoVenta= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosEstadoFacturaPuntoVenta = new GridBagLayout();
			this.jPanelBusquedasParametrosEstadoFacturaPuntoVenta.setLayout(gridaBagLayoutBusquedasParametrosEstadoFacturaPuntoVenta);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralEstadoFacturaPuntoVenta=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralEstadoFacturaPuntoVenta.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEstadoFacturaPuntoVenta.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEstadoFacturaPuntoVenta.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsEstadoFacturaPuntoVenta = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsEstadoFacturaPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsEstadoFacturaPuntoVenta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoFacturaPuntoVenta.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposEstadoFacturaPuntoVenta, this.gridBagConstraintsEstadoFacturaPuntoVenta);
			
			
		this.gridBagConstraintsEstadoFacturaPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsEstadoFacturaPuntoVenta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoFacturaPuntoVenta.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosEstadoFacturaPuntoVenta, this.gridBagConstraintsEstadoFacturaPuntoVenta);
		
			
		this.gridBagConstraintsEstadoFacturaPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsEstadoFacturaPuntoVenta.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsEstadoFacturaPuntoVenta.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesEstadoFacturaPuntoVenta, this.gridBagConstraintsEstadoFacturaPuntoVenta);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralEstadoFacturaPuntoVenta;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoEstadoFacturaPuntoVenta() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoEstadoFacturaPuntoVenta = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoEstadoFacturaPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoEstadoFacturaPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoEstadoFacturaPuntoVenta.setName("jPanelReporteDinamicoEstadoFacturaPuntoVenta"); 
		
		this.jPanelReporteDinamicoEstadoFacturaPuntoVenta.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoEstadoFacturaPuntoVenta.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoEstadoFacturaPuntoVenta.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoEstadoFacturaPuntoVenta.setLayout(gridaBagLayoutReporteDinamicoEstadoFacturaPuntoVenta);
		
		
		this.jInternalFrameReporteDinamicoEstadoFacturaPuntoVenta= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoEstadoFacturaPuntoVenta = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteEstadoFacturaPuntoVenta= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoEstadoFacturaPuntoVenta.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoEstadoFacturaPuntoVenta.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoEstadoFacturaPuntoVenta.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoEstadoFacturaPuntoVenta.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoEstadoFacturaPuntoVenta.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoEstadoFacturaPuntoVenta.setResizable(true);
	    this.jInternalFrameReporteDinamicoEstadoFacturaPuntoVenta.setClosable(true);
	    this.jInternalFrameReporteDinamicoEstadoFacturaPuntoVenta.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoEstadoFacturaPuntoVenta.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoEstadoFacturaPuntoVenta.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoEstadoFacturaPuntoVenta.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoEstadoFacturaPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Facturas"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteEstadoFacturaPuntoVenta = new JLabelMe();

		this.jLabelColumnasSelectReporteEstadoFacturaPuntoVenta.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteEstadoFacturaPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteEstadoFacturaPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteEstadoFacturaPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsEstadoFacturaPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsEstadoFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoFacturaPuntoVenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoFacturaPuntoVenta.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoEstadoFacturaPuntoVenta.add(this.jLabelColumnasSelectReporteEstadoFacturaPuntoVenta, this.gridBagConstraintsEstadoFacturaPuntoVenta);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteEstadoFacturaPuntoVenta = new JList<Reporte>();
		this.jListColumnasSelectReporteEstadoFacturaPuntoVenta.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteEstadoFacturaPuntoVenta.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteEstadoFacturaPuntoVenta.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteEstadoFacturaPuntoVenta.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteEstadoFacturaPuntoVenta.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteEstadoFacturaPuntoVenta=new JScrollPane(this.jListColumnasSelectReporteEstadoFacturaPuntoVenta);
			
			this.jScrollColumnasSelectReporteEstadoFacturaPuntoVenta.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteEstadoFacturaPuntoVenta.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteEstadoFacturaPuntoVenta.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteEstadoFacturaPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsEstadoFacturaPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsEstadoFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoFacturaPuntoVenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoFacturaPuntoVenta.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoEstadoFacturaPuntoVenta.add(this.jListColumnasSelectReporteEstadoFacturaPuntoVenta, this.gridBagConstraintsEstadoFacturaPuntoVenta);
		this.jPanelReporteDinamicoEstadoFacturaPuntoVenta.add(this.jScrollColumnasSelectReporteEstadoFacturaPuntoVenta, this.gridBagConstraintsEstadoFacturaPuntoVenta);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteEstadoFacturaPuntoVenta = new JLabelMe();

		this.jLabelRelacionesSelectReporteEstadoFacturaPuntoVenta.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteEstadoFacturaPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteEstadoFacturaPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteEstadoFacturaPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsEstadoFacturaPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsEstadoFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoFacturaPuntoVenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoFacturaPuntoVenta.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoEstadoFacturaPuntoVenta.add(this.jLabelRelacionesSelectReporteEstadoFacturaPuntoVenta, this.gridBagConstraintsEstadoFacturaPuntoVenta);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteEstadoFacturaPuntoVenta = new JList<Reporte>();
		this.jListRelacionesSelectReporteEstadoFacturaPuntoVenta.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteEstadoFacturaPuntoVenta.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteEstadoFacturaPuntoVenta.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteEstadoFacturaPuntoVenta.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteEstadoFacturaPuntoVenta.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteEstadoFacturaPuntoVenta=new JScrollPane(this.jListRelacionesSelectReporteEstadoFacturaPuntoVenta);
			
			this.jScrollRelacionesSelectReporteEstadoFacturaPuntoVenta.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteEstadoFacturaPuntoVenta.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteEstadoFacturaPuntoVenta.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteEstadoFacturaPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsEstadoFacturaPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsEstadoFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoFacturaPuntoVenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoFacturaPuntoVenta.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoEstadoFacturaPuntoVenta.add(this.jListRelacionesSelectReporteEstadoFacturaPuntoVenta, this.gridBagConstraintsEstadoFacturaPuntoVenta);
		this.jPanelReporteDinamicoEstadoFacturaPuntoVenta.add(this.jScrollRelacionesSelectReporteEstadoFacturaPuntoVenta, this.gridBagConstraintsEstadoFacturaPuntoVenta);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoEstadoFacturaPuntoVenta = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoEstadoFacturaPuntoVenta = new JComboBoxMe();
		this.jListColumnasValoresGraficoEstadoFacturaPuntoVenta = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoEstadoFacturaPuntoVenta = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoEstadoFacturaPuntoVenta.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoEstadoFacturaPuntoVenta.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoEstadoFacturaPuntoVenta.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoEstadoFacturaPuntoVenta.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoEstadoFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoEstadoFacturaPuntoVenta = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoEstadoFacturaPuntoVenta.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoEstadoFacturaPuntoVenta.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoEstadoFacturaPuntoVenta.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoEstadoFacturaPuntoVenta.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoEstadoFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoEstadoFacturaPuntoVenta = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoEstadoFacturaPuntoVenta.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoEstadoFacturaPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoEstadoFacturaPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoEstadoFacturaPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsEstadoFacturaPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsEstadoFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoFacturaPuntoVenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoFacturaPuntoVenta.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEstadoFacturaPuntoVenta.add(this.jLabelGenerarExcelReporteDinamicoEstadoFacturaPuntoVenta, this.gridBagConstraintsEstadoFacturaPuntoVenta);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoEstadoFacturaPuntoVenta = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoEstadoFacturaPuntoVenta.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoEstadoFacturaPuntoVenta,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoEstadoFacturaPuntoVenta.setToolTipText("Generar EXCEL"+" "+EstadoFacturaPuntoVentaConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsEstadoFacturaPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsEstadoFacturaPuntoVenta.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsEstadoFacturaPuntoVenta.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsEstadoFacturaPuntoVenta.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoEstadoFacturaPuntoVenta.add(this.jButtonGenerarExcelReporteDinamicoEstadoFacturaPuntoVenta, this.gridBagConstraintsEstadoFacturaPuntoVenta);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsEstadoFacturaPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsEstadoFacturaPuntoVenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoFacturaPuntoVenta.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEstadoFacturaPuntoVenta.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEstadoFacturaPuntoVenta.add(this.jComboBoxTiposReportesDinamicoEstadoFacturaPuntoVenta, this.gridBagConstraintsEstadoFacturaPuntoVenta);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoEstadoFacturaPuntoVenta = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoEstadoFacturaPuntoVenta.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoEstadoFacturaPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoEstadoFacturaPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoEstadoFacturaPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsEstadoFacturaPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsEstadoFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoFacturaPuntoVenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoFacturaPuntoVenta.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEstadoFacturaPuntoVenta.add(this.jLabelTiposArchivoReporteDinamicoEstadoFacturaPuntoVenta, this.gridBagConstraintsEstadoFacturaPuntoVenta);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsEstadoFacturaPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsEstadoFacturaPuntoVenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoFacturaPuntoVenta.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEstadoFacturaPuntoVenta.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEstadoFacturaPuntoVenta.add(this.jComboBoxTiposArchivosReportesDinamicoEstadoFacturaPuntoVenta, this.gridBagConstraintsEstadoFacturaPuntoVenta);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoEstadoFacturaPuntoVenta = new JButtonMe();
		this.jButtonGenerarReporteDinamicoEstadoFacturaPuntoVenta.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoEstadoFacturaPuntoVenta,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoEstadoFacturaPuntoVenta.setToolTipText("Generar"+" "+EstadoFacturaPuntoVentaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsEstadoFacturaPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsEstadoFacturaPuntoVenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoFacturaPuntoVenta.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEstadoFacturaPuntoVenta.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEstadoFacturaPuntoVenta.add(this.jButtonGenerarReporteDinamicoEstadoFacturaPuntoVenta, this.gridBagConstraintsEstadoFacturaPuntoVenta);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoEstadoFacturaPuntoVenta = new JButtonMe();
		this.jButtonCerrarReporteDinamicoEstadoFacturaPuntoVenta.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoEstadoFacturaPuntoVenta,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoEstadoFacturaPuntoVenta.setToolTipText("Cancelar"+" "+EstadoFacturaPuntoVentaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsEstadoFacturaPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsEstadoFacturaPuntoVenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoFacturaPuntoVenta.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEstadoFacturaPuntoVenta.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEstadoFacturaPuntoVenta.add(this.jButtonCerrarReporteDinamicoEstadoFacturaPuntoVenta, this.gridBagConstraintsEstadoFacturaPuntoVenta);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalEstadoFacturaPuntoVenta = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoEstadoFacturaPuntoVenta= new JScrollPane(jPanelReporteDinamicoEstadoFacturaPuntoVenta,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoEstadoFacturaPuntoVenta.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoEstadoFacturaPuntoVenta.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoEstadoFacturaPuntoVenta.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoEstadoFacturaPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Facturas"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsEstadoFacturaPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsEstadoFacturaPuntoVenta.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsEstadoFacturaPuntoVenta.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsEstadoFacturaPuntoVenta.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoEstadoFacturaPuntoVenta.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoEstadoFacturaPuntoVenta.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalEstadoFacturaPuntoVenta);
		this.jInternalFrameReporteDinamicoEstadoFacturaPuntoVenta.getContentPane().add(this.jScrollPanelReporteDinamicoEstadoFacturaPuntoVenta, this.gridBagConstraintsEstadoFacturaPuntoVenta);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionEstadoFacturaPuntoVenta() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionEstadoFacturaPuntoVenta = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionEstadoFacturaPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionEstadoFacturaPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionEstadoFacturaPuntoVenta.setName("jPanelImportacionEstadoFacturaPuntoVenta"); 
		
		this.jPanelImportacionEstadoFacturaPuntoVenta.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionEstadoFacturaPuntoVenta.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionEstadoFacturaPuntoVenta.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionEstadoFacturaPuntoVenta.setLayout(gridaBagLayoutImportacionEstadoFacturaPuntoVenta);
		
		
		this.jInternalFrameImportacionEstadoFacturaPuntoVenta= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionEstadoFacturaPuntoVenta= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionEstadoFacturaPuntoVenta = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteEstadoFacturaPuntoVenta= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionEstadoFacturaPuntoVenta.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionEstadoFacturaPuntoVenta.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionEstadoFacturaPuntoVenta.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionEstadoFacturaPuntoVenta.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionEstadoFacturaPuntoVenta.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionEstadoFacturaPuntoVenta.setResizable(true);
	    this.jInternalFrameImportacionEstadoFacturaPuntoVenta.setClosable(true);
	    this.jInternalFrameImportacionEstadoFacturaPuntoVenta.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionEstadoFacturaPuntoVenta.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionEstadoFacturaPuntoVenta.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionEstadoFacturaPuntoVenta.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionEstadoFacturaPuntoVenta.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionEstadoFacturaPuntoVenta.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionEstadoFacturaPuntoVenta.setResizable(true);
	    this.jInternalFrameImportacionEstadoFacturaPuntoVenta.setClosable(true);
	    this.jInternalFrameImportacionEstadoFacturaPuntoVenta.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionEstadoFacturaPuntoVenta.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionEstadoFacturaPuntoVenta.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionEstadoFacturaPuntoVenta.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionEstadoFacturaPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Facturas"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionEstadoFacturaPuntoVenta = new JLabelMe();

		this.jLabelArchivoImportacionEstadoFacturaPuntoVenta.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionEstadoFacturaPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionEstadoFacturaPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionEstadoFacturaPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsEstadoFacturaPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsEstadoFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoFacturaPuntoVenta.gridy = iPosYImportacion;		
		this.gridBagConstraintsEstadoFacturaPuntoVenta.gridx = iPosXImportacion++;
			
		this.jPanelImportacionEstadoFacturaPuntoVenta.add(this.jLabelArchivoImportacionEstadoFacturaPuntoVenta, this.gridBagConstraintsEstadoFacturaPuntoVenta);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionEstadoFacturaPuntoVenta = new JFileChooser();		
		this.jFileChooserImportacionEstadoFacturaPuntoVenta.setToolTipText("ESCOGER ARCHIVO"+" "+EstadoFacturaPuntoVentaConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionEstadoFacturaPuntoVenta = new JButtonMe();
		this.jButtonAbrirImportacionEstadoFacturaPuntoVenta.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionEstadoFacturaPuntoVenta,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionEstadoFacturaPuntoVenta.setToolTipText("Generar"+" "+EstadoFacturaPuntoVentaConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsEstadoFacturaPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsEstadoFacturaPuntoVenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoFacturaPuntoVenta.gridy = iPosYImportacion;
		this.gridBagConstraintsEstadoFacturaPuntoVenta.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEstadoFacturaPuntoVenta.add(this.jButtonAbrirImportacionEstadoFacturaPuntoVenta, this.gridBagConstraintsEstadoFacturaPuntoVenta);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionEstadoFacturaPuntoVenta = new JLabelMe();

		this.jLabelPathArchivoImportacionEstadoFacturaPuntoVenta.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionEstadoFacturaPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionEstadoFacturaPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionEstadoFacturaPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsEstadoFacturaPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsEstadoFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoFacturaPuntoVenta.gridy = iPosYImportacion;		
		this.gridBagConstraintsEstadoFacturaPuntoVenta.gridx = iPosXImportacion++;
			
		this.jPanelImportacionEstadoFacturaPuntoVenta.add(this.jLabelPathArchivoImportacionEstadoFacturaPuntoVenta, this.gridBagConstraintsEstadoFacturaPuntoVenta);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionEstadoFacturaPuntoVenta=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionEstadoFacturaPuntoVenta.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionEstadoFacturaPuntoVenta.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionEstadoFacturaPuntoVenta.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsEstadoFacturaPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsEstadoFacturaPuntoVenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoFacturaPuntoVenta.gridy = iPosYImportacion;
		this.gridBagConstraintsEstadoFacturaPuntoVenta.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEstadoFacturaPuntoVenta.add(this.jTextFieldPathArchivoImportacionEstadoFacturaPuntoVenta, this.gridBagConstraintsEstadoFacturaPuntoVenta);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionEstadoFacturaPuntoVenta = new JButtonMe();
		this.jButtonGenerarImportacionEstadoFacturaPuntoVenta.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionEstadoFacturaPuntoVenta,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionEstadoFacturaPuntoVenta.setToolTipText("Generar"+" "+EstadoFacturaPuntoVentaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsEstadoFacturaPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsEstadoFacturaPuntoVenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoFacturaPuntoVenta.gridy = iPosYImportacion;
		this.gridBagConstraintsEstadoFacturaPuntoVenta.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEstadoFacturaPuntoVenta.add(this.jButtonGenerarImportacionEstadoFacturaPuntoVenta, this.gridBagConstraintsEstadoFacturaPuntoVenta);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionEstadoFacturaPuntoVenta = new JButtonMe();
		this.jButtonCerrarImportacionEstadoFacturaPuntoVenta.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionEstadoFacturaPuntoVenta,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionEstadoFacturaPuntoVenta.setToolTipText("Cancelar"+" "+EstadoFacturaPuntoVentaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsEstadoFacturaPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsEstadoFacturaPuntoVenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoFacturaPuntoVenta.gridy = iPosYImportacion;
		this.gridBagConstraintsEstadoFacturaPuntoVenta.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEstadoFacturaPuntoVenta.add(this.jButtonCerrarImportacionEstadoFacturaPuntoVenta, this.gridBagConstraintsEstadoFacturaPuntoVenta);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalEstadoFacturaPuntoVenta = new GridBagLayout();
		
		this.jScrollPanelImportacionEstadoFacturaPuntoVenta= new JScrollPane(jPanelImportacionEstadoFacturaPuntoVenta,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsEstadoFacturaPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsEstadoFacturaPuntoVenta.gridy =iPosYImportacion;
		this.gridBagConstraintsEstadoFacturaPuntoVenta.gridx =iPosXImportacion;
		this.gridBagConstraintsEstadoFacturaPuntoVenta.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionEstadoFacturaPuntoVenta.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionEstadoFacturaPuntoVenta.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalEstadoFacturaPuntoVenta);
		this.jInternalFrameImportacionEstadoFacturaPuntoVenta.getContentPane().add(this.jScrollPanelImportacionEstadoFacturaPuntoVenta, this.gridBagConstraintsEstadoFacturaPuntoVenta);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByEstadoFacturaPuntoVenta(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByEstadoFacturaPuntoVenta = new JButtonMe();
			this.jButtonAbrirOrderByEstadoFacturaPuntoVenta.setText("Orden");
			this.jButtonAbrirOrderByEstadoFacturaPuntoVenta.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByEstadoFacturaPuntoVenta,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByEstadoFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByEstadoFacturaPuntoVenta";
			inputMap = this.jButtonAbrirOrderByEstadoFacturaPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByEstadoFacturaPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByEstadoFacturaPuntoVenta"));
		
		
			GridBagLayout gridaBagLayoutOrderByEstadoFacturaPuntoVenta = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByEstadoFacturaPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByEstadoFacturaPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByEstadoFacturaPuntoVenta.setName("jPanelOrderByEstadoFacturaPuntoVenta"); 
			
			this.jPanelOrderByEstadoFacturaPuntoVenta.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByEstadoFacturaPuntoVenta.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByEstadoFacturaPuntoVenta.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByEstadoFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByEstadoFacturaPuntoVenta.setLayout(gridaBagLayoutOrderByEstadoFacturaPuntoVenta);
			
			
			this.jTableDatosEstadoFacturaPuntoVentaOrderBy = new JTableMe();        
			this.jTableDatosEstadoFacturaPuntoVentaOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosEstadoFacturaPuntoVentaOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosEstadoFacturaPuntoVentaOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosEstadoFacturaPuntoVentaOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosEstadoFacturaPuntoVentaOrderBy.setViewportView(this.jTableDatosEstadoFacturaPuntoVentaOrderBy);
			this.jTableDatosEstadoFacturaPuntoVentaOrderBy.setFillsViewportHeight(true);
			this.jTableDatosEstadoFacturaPuntoVentaOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByEstadoFacturaPuntoVenta= new OrderByJInternalFrame();
			this.jInternalFrameOrderByEstadoFacturaPuntoVenta= new OrderByJInternalFrame();
			this.jScrollPanelOrderByEstadoFacturaPuntoVenta = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteEstadoFacturaPuntoVenta= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByEstadoFacturaPuntoVenta.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByEstadoFacturaPuntoVenta.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByEstadoFacturaPuntoVenta.setTitle("Orden");
			this.jInternalFrameOrderByEstadoFacturaPuntoVenta.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByEstadoFacturaPuntoVenta.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByEstadoFacturaPuntoVenta.setResizable(true);
			this.jInternalFrameOrderByEstadoFacturaPuntoVenta.setClosable(true);
			this.jInternalFrameOrderByEstadoFacturaPuntoVenta.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByEstadoFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByEstadoFacturaPuntoVenta.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByEstadoFacturaPuntoVenta.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByEstadoFacturaPuntoVenta.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByEstadoFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByEstadoFacturaPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Facturas"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsEstadoFacturaPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsEstadoFacturaPuntoVenta.gridy =iPosYOrderBy++;
			this.gridBagConstraintsEstadoFacturaPuntoVenta.gridx =iPosXOrderBy;
			this.gridBagConstraintsEstadoFacturaPuntoVenta.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsEstadoFacturaPuntoVenta.ipady =150;
				
			this.jPanelOrderByEstadoFacturaPuntoVenta.add(jScrollPanelDatosEstadoFacturaPuntoVentaOrderBy, this.gridBagConstraintsEstadoFacturaPuntoVenta);//this.jTableDatosEstadoFacturaPuntoVentaTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByEstadoFacturaPuntoVenta = new JButtonMe();
			this.jButtonCerrarOrderByEstadoFacturaPuntoVenta.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByEstadoFacturaPuntoVenta,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByEstadoFacturaPuntoVenta.setToolTipText("Cancelar"+" "+EstadoFacturaPuntoVentaConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByEstadoFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsEstadoFacturaPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsEstadoFacturaPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoFacturaPuntoVenta.gridy = iPosYOrderBy++;
			this.gridBagConstraintsEstadoFacturaPuntoVenta.gridx = iPosXOrderBy;
									
			this.jPanelOrderByEstadoFacturaPuntoVenta.add(this.jButtonCerrarOrderByEstadoFacturaPuntoVenta, this.gridBagConstraintsEstadoFacturaPuntoVenta);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalEstadoFacturaPuntoVenta = new GridBagLayout();
			
			this.jScrollPanelOrderByEstadoFacturaPuntoVenta= new JScrollPane(jPanelOrderByEstadoFacturaPuntoVenta,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsEstadoFacturaPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsEstadoFacturaPuntoVenta.gridy =iPosYOrderBy;
			this.gridBagConstraintsEstadoFacturaPuntoVenta.gridx =iPosXOrderBy;
			this.gridBagConstraintsEstadoFacturaPuntoVenta.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByEstadoFacturaPuntoVenta.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByEstadoFacturaPuntoVenta.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalEstadoFacturaPuntoVenta);
			
			this.jInternalFrameOrderByEstadoFacturaPuntoVenta.getContentPane().add(this.jScrollPanelOrderByEstadoFacturaPuntoVenta, this.gridBagConstraintsEstadoFacturaPuntoVenta);			
		
		} else {
			this.jButtonAbrirOrderByEstadoFacturaPuntoVenta = new JButtonMe();
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
			&& this.estadofacturapuntoventaSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosEstadoFacturaPuntoVenta.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosEstadoFacturaPuntoVenta.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosEstadoFacturaPuntoVenta.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosEstadoFacturaPuntoVenta.getRowHeight();//EstadoFacturaPuntoVentaConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.estadofacturapuntoventaSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > EstadoFacturaPuntoVentaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaEstadoFacturaPuntoVenta.isSelected()) {
					iHeightTable=EstadoFacturaPuntoVentaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < EstadoFacturaPuntoVentaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=EstadoFacturaPuntoVentaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > EstadoFacturaPuntoVentaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaEstadoFacturaPuntoVenta.isSelected()) {
					iHeightTable=EstadoFacturaPuntoVentaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < EstadoFacturaPuntoVentaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=EstadoFacturaPuntoVentaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosEstadoFacturaPuntoVenta.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosEstadoFacturaPuntoVenta.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosEstadoFacturaPuntoVenta.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosEstadoFacturaPuntoVenta.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosEstadoFacturaPuntoVenta.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosEstadoFacturaPuntoVenta.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByEstadoFacturaPuntoVenta!=null && this.jInternalFrameOrderByEstadoFacturaPuntoVenta.getjTableDatosOrderBy()!=null) {
			//if(!this.estadofacturapuntoventaSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByEstadoFacturaPuntoVenta.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByEstadoFacturaPuntoVenta.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByEstadoFacturaPuntoVenta.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByEstadoFacturaPuntoVenta.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByEstadoFacturaPuntoVenta.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByEstadoFacturaPuntoVenta.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByEstadoFacturaPuntoVenta.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosEstadoFacturaPuntoVenta.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosEstadoFacturaPuntoVenta.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosEstadoFacturaPuntoVenta.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=estadofacturapuntoventaLogic.getEstadoFacturaPuntoVentas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=estadofacturapuntoventas.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<EstadoFacturaPuntoVenta> TraerEstadoFacturaPuntoVentaBeans(List<EstadoFacturaPuntoVenta> estadofacturapuntoventas,ArrayList<Classe> classes)throws Exception {
		try {
			for(EstadoFacturaPuntoVenta estadofacturapuntoventa:estadofacturapuntoventas) {
					
				if(!(EstadoFacturaPuntoVentaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || EstadoFacturaPuntoVentaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					estadofacturapuntoventa.setsDetalleGeneralEntityReporte(EstadoFacturaPuntoVentaConstantesFunciones.getEstadoFacturaPuntoVentaDescripcion(estadofacturapuntoventa));
										
						
					
					

					if(estadofacturapuntoventa.getFacturaPuntoVentas()!=null && Funciones.existeClass(classes,FacturaPuntoVenta.class)) {
						try{estadofacturapuntoventa.setfacturapuntoventasDescripcionReporte(new JRBeanCollectionDataSource(FacturaPuntoVentaJInternalFrame.TraerFacturaPuntoVentaBeans(estadofacturapuntoventa.getFacturaPuntoVentas(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//estadofacturapuntoventa.setsDetalleGeneralEntityReporte(estadofacturapuntoventa.getsDetalleGeneralEntityReporte());
										
				}
				
				//estadofacturapuntoventabeans.add(estadofacturapuntoventabean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return estadofacturapuntoventas;
    }
	//PARA REPORTES FIN
}
