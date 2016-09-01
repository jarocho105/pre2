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
import com.bydan.erp.inventario.util.EstadoNovedadSeguimientoConstantesFunciones;

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
public class EstadoNovedadSeguimientoJInternalFrame extends EstadoNovedadSeguimientoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarEstadoNovedadSeguimiento;
	
	protected JMenuBar jmenuBarEstadoNovedadSeguimiento;
	
	protected JMenu jmenuEstadoNovedadSeguimiento;
	protected JMenu jmenuDatosEstadoNovedadSeguimiento;
	protected JMenu jmenuArchivoEstadoNovedadSeguimiento;
	protected JMenu jmenuAccionesEstadoNovedadSeguimiento;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosEstadoNovedadSeguimiento = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutEstadoNovedadSeguimiento;	
	protected GridBagConstraints gridBagConstraintsEstadoNovedadSeguimiento;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public EstadoNovedadSeguimientoDetalleFormJInternalFrame jInternalFrameDetalleFormEstadoNovedadSeguimiento;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoEstadoNovedadSeguimiento;	
	protected ImportacionJInternalFrame jInternalFrameImportacionEstadoNovedadSeguimiento;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public EstadoNovedadSeguimientoSessionBean estadonovedadseguimientoSessionBean;
		
	
	
	
	//protected JDesktopPane jDesktopPane;
	public List<EstadoNovedadSeguimiento> estadonovedadseguimientos;		
	public List<EstadoNovedadSeguimiento> estadonovedadseguimientosEliminados;	
	public List<EstadoNovedadSeguimiento> estadonovedadseguimientosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByEstadoNovedadSeguimiento;		
	protected JButton jButtonAbrirOrderByEstadoNovedadSeguimiento;
	
	
	//protected JPanel jPanelOrderByEstadoNovedadSeguimiento;
	//public JScrollPane jScrollPanelOrderByEstadoNovedadSeguimiento;	
	//protected JButton jButtonCerrarOrderByEstadoNovedadSeguimiento;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public EstadoNovedadSeguimientoLogic estadonovedadseguimientoLogic;
	
	
	
	public JScrollPane jScrollPanelDatosEstadoNovedadSeguimiento;
	public JScrollPane jScrollPanelDatosEdicionEstadoNovedadSeguimiento;
	public JScrollPane jScrollPanelDatosGeneralEstadoNovedadSeguimiento;
    
	
	
	//public JScrollPane jScrollPanelDatosEstadoNovedadSeguimientoOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoEstadoNovedadSeguimiento;
	//public JScrollPane jScrollPanelImportacionEstadoNovedadSeguimiento;
	
	
	
	protected JPanel jPanelAccionesEstadoNovedadSeguimiento;
	
    protected JPanel jPanelPaginacionEstadoNovedadSeguimiento;
    protected JPanel jPanelParametrosReportesEstadoNovedadSeguimiento;
	protected JPanel jPanelParametrosReportesAccionesEstadoNovedadSeguimiento;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1EstadoNovedadSeguimiento;
	protected JPanel jPanelParametrosAuxiliar2EstadoNovedadSeguimiento;
	protected JPanel jPanelParametrosAuxiliar3EstadoNovedadSeguimiento;
	protected JPanel jPanelParametrosAuxiliar4EstadoNovedadSeguimiento;
	//protected JPanel jPanelParametrosAuxiliar5EstadoNovedadSeguimiento;
	
	
	
	//protected JPanel jPanelReporteDinamicoEstadoNovedadSeguimiento;
	//protected JPanel jPanelImportacionEstadoNovedadSeguimiento;
	
	
	public JTable jTableDatosEstadoNovedadSeguimiento;
	
	
	
	//public JTable jTableDatosEstadoNovedadSeguimientoOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoEstadoNovedadSeguimiento;
	protected JButton jButtonDuplicarEstadoNovedadSeguimiento;
	protected JButton jButtonCopiarEstadoNovedadSeguimiento;
	protected JButton jButtonVerFormEstadoNovedadSeguimiento;
	protected JButton jButtonNuevoRelacionesEstadoNovedadSeguimiento;
	protected JButton jButtonModificarEstadoNovedadSeguimiento;
	
    protected JButton jButtonGuardarCambiosTablaEstadoNovedadSeguimiento;
	protected JButton jButtonCerrarEstadoNovedadSeguimiento;
	
	
	protected JButton jButtonRecargarInformacionEstadoNovedadSeguimiento;
	protected JButton jButtonProcesarInformacionEstadoNovedadSeguimiento;
	
	
	protected JButton jButtonAnterioresEstadoNovedadSeguimiento;
	protected JButton jButtonSiguientesEstadoNovedadSeguimiento;
	protected JButton jButtonNuevoGuardarCambiosEstadoNovedadSeguimiento;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoEstadoNovedadSeguimiento;
	//protected JButton jButtonCerrarReporteDinamicoEstadoNovedadSeguimiento;
	//protected JButton jButtonGenerarExcelReporteDinamicoEstadoNovedadSeguimiento;	
	
	
	
	//protected JButton jButtonAbrirImportacionEstadoNovedadSeguimiento;
	//protected JButton jButtonGenerarImportacionEstadoNovedadSeguimiento;
	//protected JButton jButtonCerrarImportacionEstadoNovedadSeguimiento;
	//protected JFileChooser jFileChooserImportacionEstadoNovedadSeguimiento;
	//protected File fileImportacionEstadoNovedadSeguimiento;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarEstadoNovedadSeguimiento;
	protected JButton jButtonDuplicarToolBarEstadoNovedadSeguimiento;
	protected JButton jButtonNuevoRelacionesToolBarEstadoNovedadSeguimiento;
	
	
	public JButton jButtonGuardarCambiosToolBarEstadoNovedadSeguimiento;
	protected JButton jButtonCopiarToolBarEstadoNovedadSeguimiento;
	protected JButton jButtonVerFormToolBarEstadoNovedadSeguimiento;
	public JButton jButtonGuardarCambiosTablaToolBarEstadoNovedadSeguimiento;
	protected JButton jButtonMostrarOcultarTablaToolBarEstadoNovedadSeguimiento;
	protected JButton jButtonCerrarToolBarEstadoNovedadSeguimiento;
	
	protected JButton jButtonRecargarInformacionToolBarEstadoNovedadSeguimiento;
	protected JButton jButtonProcesarInformacionToolBarEstadoNovedadSeguimiento;
	protected JButton jButtonAnterioresToolBarEstadoNovedadSeguimiento;
	protected JButton jButtonSiguientesToolBarEstadoNovedadSeguimiento;
	protected JButton jButtonNuevoGuardarCambiosToolBarEstadoNovedadSeguimiento;
	protected JButton jButtonAbrirOrderByToolBarEstadoNovedadSeguimiento;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoEstadoNovedadSeguimiento;
	protected JMenuItem jMenuItemDuplicarEstadoNovedadSeguimiento;
	protected JMenuItem jMenuItemNuevoRelacionesEstadoNovedadSeguimiento;
	
	
	protected JMenuItem jMenuItemGuardarCambiosEstadoNovedadSeguimiento;
	protected JMenuItem jMenuItemCopiarEstadoNovedadSeguimiento;
	protected JMenuItem jMenuItemVerFormEstadoNovedadSeguimiento;
	protected JMenuItem jMenuItemGuardarCambiosTablaEstadoNovedadSeguimiento;
	protected JMenuItem jMenuItemCerrarEstadoNovedadSeguimiento;
	protected JMenuItem jMenuItemDetalleCerrarEstadoNovedadSeguimiento;
	protected JMenuItem jMenuItemDetalleAbrirOrderByEstadoNovedadSeguimiento;
	protected JMenuItem jMenuItemDetalleMostarOcultarEstadoNovedadSeguimiento;
	
	protected JMenuItem jMenuItemRecargarInformacionEstadoNovedadSeguimiento;
	protected JMenuItem jMenuItemProcesarInformacionEstadoNovedadSeguimiento;
	protected JMenuItem jMenuItemAnterioresEstadoNovedadSeguimiento;
	protected JMenuItem jMenuItemSiguientesEstadoNovedadSeguimiento;
	protected JMenuItem jMenuItemNuevoGuardarCambiosEstadoNovedadSeguimiento;
	protected JMenuItem jMenuItemAbrirOrderByEstadoNovedadSeguimiento;
	protected JMenuItem jMenuItemMostrarOcultarEstadoNovedadSeguimiento;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesEstadoNovedadSeguimiento;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosEstadoNovedadSeguimiento;
	protected JCheckBox jCheckBoxSeleccionadosEstadoNovedadSeguimiento;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaEstadoNovedadSeguimiento;
	protected JCheckBox jCheckBoxConGraficoReporteEstadoNovedadSeguimiento;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesEstadoNovedadSeguimiento;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesEstadoNovedadSeguimiento;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoEstadoNovedadSeguimiento;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoEstadoNovedadSeguimiento;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesEstadoNovedadSeguimiento;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionEstadoNovedadSeguimiento;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesEstadoNovedadSeguimiento;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesEstadoNovedadSeguimiento;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarEstadoNovedadSeguimiento;
	protected JTextField jTextFieldValorCampoGeneralEstadoNovedadSeguimiento;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteEstadoNovedadSeguimiento;
	//public JList<Reporte> jListColumnasSelectReporteEstadoNovedadSeguimiento;
	//public JScrollPane jScrollColumnasSelectReporteEstadoNovedadSeguimiento;
	
	//public JLabel jLabelRelacionesSelectReporteEstadoNovedadSeguimiento;
	//public JList<Reporte> jListRelacionesSelectReporteEstadoNovedadSeguimiento;
	//public JScrollPane jScrollRelacionesSelectReporteEstadoNovedadSeguimiento;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoEstadoNovedadSeguimiento;
	//protected JCheckBox jCheckBoxConGraficoDinamicoEstadoNovedadSeguimiento;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoEstadoNovedadSeguimiento;
	//public JLabel jLabelTiposArchivoReporteDinamicoEstadoNovedadSeguimiento;
	
		
	//public JLabel jLabelArchivoImportacionEstadoNovedadSeguimiento;	
	//public JLabel jLabelPathArchivoImportacionEstadoNovedadSeguimiento;
	//protected JTextField jTextFieldPathArchivoImportacionEstadoNovedadSeguimiento;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoEstadoNovedadSeguimiento;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoEstadoNovedadSeguimiento;
	
	//public JLabel jLabelColumnaCategoriaValorEstadoNovedadSeguimiento;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorEstadoNovedadSeguimiento;
	
	//public JLabel jLabelColumnasValoresGraficoEstadoNovedadSeguimiento;
	//public JList<Reporte> jListColumnasValoresGraficoEstadoNovedadSeguimiento;
	//public JScrollPane jScrollColumnasValoresGraficoEstadoNovedadSeguimiento;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoEstadoNovedadSeguimiento;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoEstadoNovedadSeguimiento;	
	
	
	
	
	
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
	public EstadoNovedadSeguimientoJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("EstadoNovedadSeguimiento No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoNovedadSeguimientoJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EstadoNovedadSeguimiento No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoNovedadSeguimientoJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EstadoNovedadSeguimiento No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoNovedadSeguimientoJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("EstadoNovedadSeguimiento No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionEstadoNovedadSeguimiento)	{
		this.jButtonRecargarInformacionEstadoNovedadSeguimiento = jButtonRecargarInformacionEstadoNovedadSeguimiento;
	}
	
	public JButton getjButtonProcesarInformacionEstadoNovedadSeguimiento() {
		return this.jButtonProcesarInformacionEstadoNovedadSeguimiento;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionEstadoNovedadSeguimiento)	{
		this.jButtonProcesarInformacionEstadoNovedadSeguimiento = jButtonProcesarInformacionEstadoNovedadSeguimiento;
	}
	
	
	public JButton getjButtonRecargarInformacionEstadoNovedadSeguimiento() {
		return this.jButtonRecargarInformacionEstadoNovedadSeguimiento;
	}
	
	
	public List<EstadoNovedadSeguimiento> getestadonovedadseguimientos() {
		return this.estadonovedadseguimientos;
	}

	public void setestadonovedadseguimientos(List<EstadoNovedadSeguimiento> estadonovedadseguimientos) {
		this.estadonovedadseguimientos = estadonovedadseguimientos;
	}
	
	public List<EstadoNovedadSeguimiento> getestadonovedadseguimientosAux() {
		return this.estadonovedadseguimientosAux;
	}

	public void setestadonovedadseguimientosAux(List<EstadoNovedadSeguimiento> estadonovedadseguimientosAux) {
		this.estadonovedadseguimientosAux = estadonovedadseguimientosAux;
	}
	
	public List<EstadoNovedadSeguimiento> getestadonovedadseguimientosEliminados() {
		return this.estadonovedadseguimientosEliminados;
	}

	public void setEstadoNovedadSeguimientosEliminados(List<EstadoNovedadSeguimiento> estadonovedadseguimientosEliminados) {
		this.estadonovedadseguimientosEliminados = estadonovedadseguimientosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarEstadoNovedadSeguimiento() {
		return jComboBoxTiposSeleccionarEstadoNovedadSeguimiento;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarEstadoNovedadSeguimiento(
			JComboBox jComboBoxTiposSeleccionarEstadoNovedadSeguimiento) {
		this.jComboBoxTiposSeleccionarEstadoNovedadSeguimiento = jComboBoxTiposSeleccionarEstadoNovedadSeguimiento;
	}
	
	public void setBorderResaltarTiposSeleccionarEstadoNovedadSeguimiento() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarEstadoNovedadSeguimiento.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarEstadoNovedadSeguimiento .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralEstadoNovedadSeguimiento() {
		return jTextFieldValorCampoGeneralEstadoNovedadSeguimiento;
	}

	public void setjTextFieldValorCampoGeneralEstadoNovedadSeguimiento(
			JTextField jTextFieldValorCampoGeneralEstadoNovedadSeguimiento) {
		this.jTextFieldValorCampoGeneralEstadoNovedadSeguimiento = jTextFieldValorCampoGeneralEstadoNovedadSeguimiento;
	}

	public void setBorderResaltarValorCampoGeneralEstadoNovedadSeguimiento() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoNovedadSeguimiento.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralEstadoNovedadSeguimiento .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosEstadoNovedadSeguimiento() {
		return this.jCheckBoxSeleccionarTodosEstadoNovedadSeguimiento;
	}

	public void setjCheckBoxSeleccionarTodosEstadoNovedadSeguimiento(
			JCheckBox jCheckBoxSeleccionarTodosEstadoNovedadSeguimiento) {
		this.jCheckBoxSeleccionarTodosEstadoNovedadSeguimiento = jCheckBoxSeleccionarTodosEstadoNovedadSeguimiento;
	}

	public void setBorderResaltarSeleccionarTodosEstadoNovedadSeguimiento() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoNovedadSeguimiento.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosEstadoNovedadSeguimiento .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosEstadoNovedadSeguimiento() {
		return this.jCheckBoxSeleccionadosEstadoNovedadSeguimiento;
	}

	public void setjCheckBoxSeleccionadosEstadoNovedadSeguimiento(
			JCheckBox jCheckBoxSeleccionadosEstadoNovedadSeguimiento) {
		this.jCheckBoxSeleccionadosEstadoNovedadSeguimiento = jCheckBoxSeleccionadosEstadoNovedadSeguimiento;
	}
	
	public void setBorderResaltarSeleccionadosEstadoNovedadSeguimiento() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoNovedadSeguimiento.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosEstadoNovedadSeguimiento .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesEstadoNovedadSeguimiento() {
		return this.jComboBoxTiposArchivosReportesEstadoNovedadSeguimiento;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesEstadoNovedadSeguimiento(
			JComboBox jComboBoxTiposArchivosReportesEstadoNovedadSeguimiento) {
		this.jComboBoxTiposArchivosReportesEstadoNovedadSeguimiento = jComboBoxTiposArchivosReportesEstadoNovedadSeguimiento;
	}

	public void setBorderResaltarTiposArchivosReportesEstadoNovedadSeguimiento() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoNovedadSeguimiento.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesEstadoNovedadSeguimiento .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesEstadoNovedadSeguimiento() {
		return this.jComboBoxTiposReportesEstadoNovedadSeguimiento;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesEstadoNovedadSeguimiento(
			JComboBox jComboBoxTiposReportesEstadoNovedadSeguimiento) {
		this.jComboBoxTiposReportesEstadoNovedadSeguimiento = jComboBoxTiposReportesEstadoNovedadSeguimiento;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoEstadoNovedadSeguimiento() {
	//	return jComboBoxTiposReportesDinamicoEstadoNovedadSeguimiento;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoEstadoNovedadSeguimiento(
	//		JComboBox jComboBoxTiposReportesDinamicoEstadoNovedadSeguimiento) {
	//	this.jComboBoxTiposReportesDinamicoEstadoNovedadSeguimiento = jComboBoxTiposReportesDinamicoEstadoNovedadSeguimiento;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoEstadoNovedadSeguimiento() {
	//	return jComboBoxTiposArchivosReportesDinamicoEstadoNovedadSeguimiento;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoEstadoNovedadSeguimiento(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoEstadoNovedadSeguimiento) {
	//	this.jComboBoxTiposArchivosReportesDinamicoEstadoNovedadSeguimiento = jComboBoxTiposArchivosReportesDinamicoEstadoNovedadSeguimiento;
	//}
	
	public void setBorderResaltarTiposReportesEstadoNovedadSeguimiento() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoNovedadSeguimiento.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesEstadoNovedadSeguimiento .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesEstadoNovedadSeguimiento() {
		return this.jComboBoxTiposGraficosReportesEstadoNovedadSeguimiento;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesEstadoNovedadSeguimiento(
			JComboBox jComboBoxTiposGraficosReportesEstadoNovedadSeguimiento) {
		this.jComboBoxTiposGraficosReportesEstadoNovedadSeguimiento = jComboBoxTiposGraficosReportesEstadoNovedadSeguimiento;
	}
	
	public void setBorderResaltarTiposGraficosReportesEstadoNovedadSeguimiento() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoNovedadSeguimiento.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesEstadoNovedadSeguimiento .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionEstadoNovedadSeguimiento() {
		return this.jComboBoxTiposPaginacionEstadoNovedadSeguimiento;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionEstadoNovedadSeguimiento(
			JComboBox jComboBoxTiposPaginacionEstadoNovedadSeguimiento) {
		this.jComboBoxTiposPaginacionEstadoNovedadSeguimiento = jComboBoxTiposPaginacionEstadoNovedadSeguimiento;
	}
	
	public void setBorderResaltarTiposPaginacionEstadoNovedadSeguimiento() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoNovedadSeguimiento.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionEstadoNovedadSeguimiento .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesEstadoNovedadSeguimiento() {
		return this.jComboBoxTiposRelacionesEstadoNovedadSeguimiento;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesEstadoNovedadSeguimiento() {
		return this.jComboBoxTiposAccionesEstadoNovedadSeguimiento;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesEstadoNovedadSeguimiento(
			JComboBox jComboBoxTiposRelacionesEstadoNovedadSeguimiento) {
		this.jComboBoxTiposRelacionesEstadoNovedadSeguimiento = jComboBoxTiposRelacionesEstadoNovedadSeguimiento;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesEstadoNovedadSeguimiento(
			JComboBox jComboBoxTiposAccionesEstadoNovedadSeguimiento) {
		this.jComboBoxTiposAccionesEstadoNovedadSeguimiento = jComboBoxTiposAccionesEstadoNovedadSeguimiento;
	}
	
	public void setBorderResaltarTiposRelacionesEstadoNovedadSeguimiento() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoNovedadSeguimiento.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesEstadoNovedadSeguimiento .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesEstadoNovedadSeguimiento() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoNovedadSeguimiento.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesEstadoNovedadSeguimiento .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoEstadoNovedadSeguimiento() {
	//	return jCheckBoxConGraficoDinamicoEstadoNovedadSeguimiento;
	//}

	//public void setjCheckBoxConGraficoDinamicoEstadoNovedadSeguimiento(
	//		JCheckBox jCheckBoxConGraficoDinamicoEstadoNovedadSeguimiento) {
	//	this.jCheckBoxConGraficoDinamicoEstadoNovedadSeguimiento = jCheckBoxConGraficoDinamicoEstadoNovedadSeguimiento;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoEstadoNovedadSeguimiento() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarEstadoNovedadSeguimiento.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoEstadoNovedadSeguimiento .setBorder(borderResaltar);		
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
		this.estadonovedadseguimientoSessionBean=new EstadoNovedadSeguimientoSessionBean();
		
		this.estadonovedadseguimientoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.estadonovedadseguimientoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.estadonovedadseguimientoSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=EstadoNovedadSeguimientoJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=EstadoNovedadSeguimientoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		EstadoNovedadSeguimientoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		EstadoNovedadSeguimientoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		EstadoNovedadSeguimientoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Estado Novedad Seguimiento MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 650) {
			iHeight=650;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.estadonovedadseguimientoSessionBean.getEsGuardarRelacionado()) {
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
		
		EstadoNovedadSeguimientoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("EstadoNovedadSeguimiento No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarEstadoNovedadSeguimiento= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarEstadoNovedadSeguimiento=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarEstadoNovedadSeguimiento,this.jTtoolBarEstadoNovedadSeguimiento,
							"nuevo","nuevo","Nuevo"+" "+EstadoNovedadSeguimientoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarEstadoNovedadSeguimiento=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarEstadoNovedadSeguimiento,this.jTtoolBarEstadoNovedadSeguimiento,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarEstadoNovedadSeguimiento=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarEstadoNovedadSeguimiento,this.jTtoolBarEstadoNovedadSeguimiento,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+EstadoNovedadSeguimientoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarEstadoNovedadSeguimiento=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarEstadoNovedadSeguimiento,this.jTtoolBarEstadoNovedadSeguimiento,
							"duplicar","duplicar","Duplicar"+" "+EstadoNovedadSeguimientoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarEstadoNovedadSeguimiento=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarEstadoNovedadSeguimiento,this.jTtoolBarEstadoNovedadSeguimiento,
							"copiar","copiar","Copiar"+" "+EstadoNovedadSeguimientoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarEstadoNovedadSeguimiento=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarEstadoNovedadSeguimiento,this.jTtoolBarEstadoNovedadSeguimiento,
							"ver_form","ver_form","Ver"+" "+EstadoNovedadSeguimientoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarEstadoNovedadSeguimiento=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEstadoNovedadSeguimiento,this.jTtoolBarEstadoNovedadSeguimiento,
							"recargar","recargar","Recargar"+" "+EstadoNovedadSeguimientoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarEstadoNovedadSeguimiento=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEstadoNovedadSeguimiento,this.jTtoolBarEstadoNovedadSeguimiento,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarEstadoNovedadSeguimiento=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEstadoNovedadSeguimiento,this.jTtoolBarEstadoNovedadSeguimiento,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarEstadoNovedadSeguimiento=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarEstadoNovedadSeguimiento,this.jTtoolBarEstadoNovedadSeguimiento,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarEstadoNovedadSeguimiento=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarEstadoNovedadSeguimiento,this.jTtoolBarEstadoNovedadSeguimiento,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarEstadoNovedadSeguimiento=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarEstadoNovedadSeguimiento,this.jTtoolBarEstadoNovedadSeguimiento,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+EstadoNovedadSeguimientoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarEstadoNovedadSeguimiento=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarEstadoNovedadSeguimiento,this.jTtoolBarEstadoNovedadSeguimiento,
							"cerrar","cerrar","Salir"+" "+EstadoNovedadSeguimientoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarEstadoNovedadSeguimiento=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarEstadoNovedadSeguimiento;
			
				this.jButtonProcesarInformacionToolBarEstadoNovedadSeguimiento=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarEstadoNovedadSeguimiento;
				
		//protected JButton jButtonModificarToolBarEstadoNovedadSeguimiento;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarEstadoNovedadSeguimiento=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuEstadoNovedadSeguimiento=new JMenuMe("General");
		this.jmenuArchivoEstadoNovedadSeguimiento=new JMenuMe("Archivo");
		this.jmenuAccionesEstadoNovedadSeguimiento=new JMenuMe("Acciones");
		this.jmenuDatosEstadoNovedadSeguimiento=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoEstadoNovedadSeguimiento= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoEstadoNovedadSeguimiento.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoEstadoNovedadSeguimiento,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoEstadoNovedadSeguimiento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarEstadoNovedadSeguimiento= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarEstadoNovedadSeguimiento.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarEstadoNovedadSeguimiento,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarEstadoNovedadSeguimiento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesEstadoNovedadSeguimiento= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesEstadoNovedadSeguimiento.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesEstadoNovedadSeguimiento,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesEstadoNovedadSeguimiento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosEstadoNovedadSeguimiento= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosEstadoNovedadSeguimiento.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosEstadoNovedadSeguimiento,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosEstadoNovedadSeguimiento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarEstadoNovedadSeguimiento= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarEstadoNovedadSeguimiento.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarEstadoNovedadSeguimiento,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarEstadoNovedadSeguimiento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormEstadoNovedadSeguimiento= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormEstadoNovedadSeguimiento.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormEstadoNovedadSeguimiento,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormEstadoNovedadSeguimiento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaEstadoNovedadSeguimiento= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaEstadoNovedadSeguimiento.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaEstadoNovedadSeguimiento,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaEstadoNovedadSeguimiento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarEstadoNovedadSeguimiento= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarEstadoNovedadSeguimiento.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarEstadoNovedadSeguimiento,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarEstadoNovedadSeguimiento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionEstadoNovedadSeguimiento= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionEstadoNovedadSeguimiento.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionEstadoNovedadSeguimiento,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionEstadoNovedadSeguimiento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionEstadoNovedadSeguimiento= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionEstadoNovedadSeguimiento.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionEstadoNovedadSeguimiento,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresEstadoNovedadSeguimiento= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresEstadoNovedadSeguimiento.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresEstadoNovedadSeguimiento,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresEstadoNovedadSeguimiento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesEstadoNovedadSeguimiento= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesEstadoNovedadSeguimiento.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesEstadoNovedadSeguimiento,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesEstadoNovedadSeguimiento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByEstadoNovedadSeguimiento= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByEstadoNovedadSeguimiento.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByEstadoNovedadSeguimiento,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByEstadoNovedadSeguimiento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarEstadoNovedadSeguimiento= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarEstadoNovedadSeguimiento.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarEstadoNovedadSeguimiento,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarEstadoNovedadSeguimiento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByEstadoNovedadSeguimiento= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByEstadoNovedadSeguimiento.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByEstadoNovedadSeguimiento,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByEstadoNovedadSeguimiento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarEstadoNovedadSeguimiento= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarEstadoNovedadSeguimiento.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarEstadoNovedadSeguimiento,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarEstadoNovedadSeguimiento, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosEstadoNovedadSeguimiento= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosEstadoNovedadSeguimiento.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosEstadoNovedadSeguimiento,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosEstadoNovedadSeguimiento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoEstadoNovedadSeguimiento.add(this.jMenuItemCerrarEstadoNovedadSeguimiento);
			
			this.jmenuAccionesEstadoNovedadSeguimiento.add(this.jMenuItemNuevoEstadoNovedadSeguimiento);
			this.jmenuAccionesEstadoNovedadSeguimiento.add(this.jMenuItemNuevoGuardarCambiosEstadoNovedadSeguimiento);
			this.jmenuAccionesEstadoNovedadSeguimiento.add(this.jMenuItemNuevoRelacionesEstadoNovedadSeguimiento);
			this.jmenuAccionesEstadoNovedadSeguimiento.add(this.jMenuItemGuardarCambiosTablaEstadoNovedadSeguimiento);		
			this.jmenuAccionesEstadoNovedadSeguimiento.add(this.jMenuItemDuplicarEstadoNovedadSeguimiento);		
			this.jmenuAccionesEstadoNovedadSeguimiento.add(this.jMenuItemCopiarEstadoNovedadSeguimiento);		
			this.jmenuAccionesEstadoNovedadSeguimiento.add(this.jMenuItemVerFormEstadoNovedadSeguimiento);		
			
			this.jmenuDatosEstadoNovedadSeguimiento.add(this.jMenuItemRecargarInformacionEstadoNovedadSeguimiento);				
			this.jmenuDatosEstadoNovedadSeguimiento.add(this.jMenuItemAnterioresEstadoNovedadSeguimiento);				
			this.jmenuDatosEstadoNovedadSeguimiento.add(this.jMenuItemSiguientesEstadoNovedadSeguimiento);				
			this.jmenuDatosEstadoNovedadSeguimiento.add(this.jMenuItemAbrirOrderByEstadoNovedadSeguimiento);				
			this.jmenuDatosEstadoNovedadSeguimiento.add(this.jMenuItemMostrarOcultarEstadoNovedadSeguimiento);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesEstadoNovedadSeguimiento.add(this.jMenuItemGuardarCambiosEstadoNovedadSeguimiento);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoEstadoNovedadSeguimiento, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesEstadoNovedadSeguimiento, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosEstadoNovedadSeguimiento, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarEstadoNovedadSeguimiento.add(this.jmenuArchivoEstadoNovedadSeguimiento);		
			this.jmenuBarEstadoNovedadSeguimiento.add(this.jmenuAccionesEstadoNovedadSeguimiento);		
			this.jmenuBarEstadoNovedadSeguimiento.add(this.jmenuDatosEstadoNovedadSeguimiento);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarEstadoNovedadSeguimiento);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasEstadoNovedadSeguimiento() {
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
			//this.jInternalFrameDetalleEstadoNovedadSeguimiento = new EstadoNovedadSeguimientoDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Estado Novedad Seguimiento DATOS");
			this.jInternalFrameDetalleFormEstadoNovedadSeguimiento = new EstadoNovedadSeguimientoDetalleFormJInternalFrame(jDesktopPane,this.estadonovedadseguimientoSessionBean.getConGuardarRelaciones(),this.estadonovedadseguimientoSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormEstadoNovedadSeguimiento = null;//new EstadoNovedadSeguimientoDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutEstadoNovedadSeguimiento= new GridBagLayout();
		
		
		this.jTableDatosEstadoNovedadSeguimiento = new JTableMe();      
		
		String sToolTipEstadoNovedadSeguimiento="";
		sToolTipEstadoNovedadSeguimiento=EstadoNovedadSeguimientoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipEstadoNovedadSeguimiento+="(Inventario.EstadoNovedadSeguimiento)";
		}
		
		if(!this.estadonovedadseguimientoSessionBean.getEsGuardarRelacionado()) {
			sToolTipEstadoNovedadSeguimiento+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosEstadoNovedadSeguimiento.setToolTipText(sToolTipEstadoNovedadSeguimiento);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosEstadoNovedadSeguimiento);
		this.jTableDatosEstadoNovedadSeguimiento.setAutoCreateRowSorter(true);
		this.jTableDatosEstadoNovedadSeguimiento.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosEstadoNovedadSeguimiento.setRowSelectionAllowed(true);
		this.jTableDatosEstadoNovedadSeguimiento.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosEstadoNovedadSeguimiento,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoEstadoNovedadSeguimiento = new JButtonMe();
		this.jButtonDuplicarEstadoNovedadSeguimiento = new JButtonMe();
		this.jButtonCopiarEstadoNovedadSeguimiento = new JButtonMe();
		this.jButtonVerFormEstadoNovedadSeguimiento = new JButtonMe();
		this.jButtonNuevoRelacionesEstadoNovedadSeguimiento = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaEstadoNovedadSeguimiento = new JButtonMe();
		this.jButtonCerrarEstadoNovedadSeguimiento = new JButtonMe();
		
		this.jScrollPanelDatosEstadoNovedadSeguimiento = new JScrollPane();   
        this.jScrollPanelDatosGeneralEstadoNovedadSeguimiento = new JScrollPane();
		
				
		
		
		this.jPanelAccionesEstadoNovedadSeguimiento = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Estado Novedad Seguimiento";
		
		if(!this.estadonovedadseguimientoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosEstadoNovedadSeguimiento.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Novedad Seguimientoes" + this.sPath));
		} else {
			this.jScrollPanelDatosEstadoNovedadSeguimiento.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralEstadoNovedadSeguimiento.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesEstadoNovedadSeguimiento.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesEstadoNovedadSeguimiento.setToolTipText("Acciones");
        this.jPanelAccionesEstadoNovedadSeguimiento.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralEstadoNovedadSeguimiento, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEstadoNovedadSeguimiento, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoEstadoNovedadSeguimiento=new ReporteDinamicoJInternalFrame(EstadoNovedadSeguimientoConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoEstadoNovedadSeguimiento();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionEstadoNovedadSeguimiento=new ImportacionJInternalFrame(EstadoNovedadSeguimientoConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionEstadoNovedadSeguimiento();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByEstadoNovedadSeguimiento = new JButtonMe();
		
		this.jButtonAbrirOrderByEstadoNovedadSeguimiento.setText("Orden");
		this.jButtonAbrirOrderByEstadoNovedadSeguimiento.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByEstadoNovedadSeguimiento,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByEstadoNovedadSeguimiento, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByEstadoNovedadSeguimiento.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByEstadoNovedadSeguimiento.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByEstadoNovedadSeguimiento=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEstadoNovedadSeguimiento,false,this);
			
			//this.cargarOrderByEstadoNovedadSeguimiento(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByEstadoNovedadSeguimiento=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEstadoNovedadSeguimiento,true,this);
			
			//this.cargarOrderByEstadoNovedadSeguimiento(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosEstadoNovedadSeguimiento.setMinimumSize(new Dimension(400,50));//430
		this.jTableDatosEstadoNovedadSeguimiento.setMaximumSize(new Dimension(400,50));//430
		this.jTableDatosEstadoNovedadSeguimiento.setPreferredSize(new Dimension(400,50));//430
		
		this.jScrollPanelDatosEstadoNovedadSeguimiento.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosEstadoNovedadSeguimiento.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosEstadoNovedadSeguimiento.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoEstadoNovedadSeguimiento.setText("Nuevo");
		this.jButtonDuplicarEstadoNovedadSeguimiento.setText("Duplicar");
		this.jButtonCopiarEstadoNovedadSeguimiento.setText("Copiar");
		this.jButtonVerFormEstadoNovedadSeguimiento.setText("Ver");
		this.jButtonNuevoRelacionesEstadoNovedadSeguimiento.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaEstadoNovedadSeguimiento.setText("Guardar");
		this.jButtonCerrarEstadoNovedadSeguimiento.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoEstadoNovedadSeguimiento,"nuevo_button","Nuevo",this.estadonovedadseguimientoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarEstadoNovedadSeguimiento,"duplicar_button","Duplicar",this.estadonovedadseguimientoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarEstadoNovedadSeguimiento,"copiar_button","Copiar",this.estadonovedadseguimientoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormEstadoNovedadSeguimiento,"ver_form","Ver",this.estadonovedadseguimientoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesEstadoNovedadSeguimiento,"nuevorelaciones_button","Nuevo Rel",this.estadonovedadseguimientoSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaEstadoNovedadSeguimiento,"guardarcambiostabla_button","Guardar",this.estadonovedadseguimientoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarEstadoNovedadSeguimiento,"cerrar_button","Salir",this.estadonovedadseguimientoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoEstadoNovedadSeguimiento, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarEstadoNovedadSeguimiento, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarEstadoNovedadSeguimiento, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormEstadoNovedadSeguimiento, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesEstadoNovedadSeguimiento, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaEstadoNovedadSeguimiento, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarEstadoNovedadSeguimiento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoEstadoNovedadSeguimiento.setToolTipText("Nuevo"+" "+EstadoNovedadSeguimientoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarEstadoNovedadSeguimiento.setToolTipText("Duplicar"+" "+EstadoNovedadSeguimientoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarEstadoNovedadSeguimiento.setToolTipText("Copiar"+" "+EstadoNovedadSeguimientoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormEstadoNovedadSeguimiento.setToolTipText("Ver"+" "+EstadoNovedadSeguimientoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesEstadoNovedadSeguimiento.setToolTipText("Nuevo Rel"+" "+EstadoNovedadSeguimientoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaEstadoNovedadSeguimiento.setToolTipText("Guardar"+" "+EstadoNovedadSeguimientoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarEstadoNovedadSeguimiento.setToolTipText("Salir"+" "+EstadoNovedadSeguimientoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoEstadoNovedadSeguimiento";
		inputMap = this.jButtonNuevoEstadoNovedadSeguimiento.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoEstadoNovedadSeguimiento.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoEstadoNovedadSeguimiento"));
		
		//DUPLICAR
		sMapKey = "DuplicarEstadoNovedadSeguimiento";
		inputMap = this.jButtonDuplicarEstadoNovedadSeguimiento.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarEstadoNovedadSeguimiento.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarEstadoNovedadSeguimiento"));
		
		//COPIAR
		sMapKey = "CopiarEstadoNovedadSeguimiento";
		inputMap = this.jButtonCopiarEstadoNovedadSeguimiento.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarEstadoNovedadSeguimiento.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarEstadoNovedadSeguimiento"));
		
		//VEr FORM
		sMapKey = "VerFormEstadoNovedadSeguimiento";
		inputMap = this.jButtonVerFormEstadoNovedadSeguimiento.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormEstadoNovedadSeguimiento.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormEstadoNovedadSeguimiento"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesEstadoNovedadSeguimiento";
		inputMap = this.jButtonNuevoRelacionesEstadoNovedadSeguimiento.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesEstadoNovedadSeguimiento.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesEstadoNovedadSeguimiento"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarEstadoNovedadSeguimiento";
		inputMap = this.jButtonModificarEstadoNovedadSeguimiento.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarEstadoNovedadSeguimiento.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarEstadoNovedadSeguimiento"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarEstadoNovedadSeguimiento";
		inputMap = this.jButtonCerrarEstadoNovedadSeguimiento.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarEstadoNovedadSeguimiento.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarEstadoNovedadSeguimiento"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaEstadoNovedadSeguimiento";
		inputMap = this.jButtonGuardarCambiosTablaEstadoNovedadSeguimiento.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaEstadoNovedadSeguimiento.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaEstadoNovedadSeguimiento"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesEstadoNovedadSeguimiento = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesEstadoNovedadSeguimiento = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionEstadoNovedadSeguimiento = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1EstadoNovedadSeguimiento= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2EstadoNovedadSeguimiento= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3EstadoNovedadSeguimiento= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4EstadoNovedadSeguimiento= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5EstadoNovedadSeguimiento= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesEstadoNovedadSeguimiento.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesEstadoNovedadSeguimiento.setName("jPanelParametrosReportesEstadoNovedadSeguimiento"); 
		
		this.jPanelParametrosReportesAccionesEstadoNovedadSeguimiento.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesEstadoNovedadSeguimiento.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesEstadoNovedadSeguimiento.setName("jPanelParametrosReportesAccionesEstadoNovedadSeguimiento"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesEstadoNovedadSeguimiento, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesEstadoNovedadSeguimiento, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionEstadoNovedadSeguimiento = new JButtonMe();
		this.jButtonRecargarInformacionEstadoNovedadSeguimiento.setText("Recargar");
		this.jButtonRecargarInformacionEstadoNovedadSeguimiento.setToolTipText("Recargar"+" "+EstadoNovedadSeguimientoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionEstadoNovedadSeguimiento,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionEstadoNovedadSeguimiento = new JButtonMe();
		this.jButtonProcesarInformacionEstadoNovedadSeguimiento.setText("Procesar");
		this.jButtonProcesarInformacionEstadoNovedadSeguimiento.setToolTipText("Procesar"+" "+EstadoNovedadSeguimientoConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionEstadoNovedadSeguimiento.setVisible(false);
			
		this.jButtonProcesarInformacionEstadoNovedadSeguimiento.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionEstadoNovedadSeguimiento.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionEstadoNovedadSeguimiento.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesEstadoNovedadSeguimiento = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEstadoNovedadSeguimiento.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesEstadoNovedadSeguimiento.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesEstadoNovedadSeguimiento = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEstadoNovedadSeguimiento.setText("TIPO");       
		this.jComboBoxTiposReportesEstadoNovedadSeguimiento.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesEstadoNovedadSeguimiento = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEstadoNovedadSeguimiento.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesEstadoNovedadSeguimiento.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionEstadoNovedadSeguimiento = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionEstadoNovedadSeguimiento.setText("Paginacion");
		this.jComboBoxTiposPaginacionEstadoNovedadSeguimiento.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesEstadoNovedadSeguimiento = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesEstadoNovedadSeguimiento.setText("Accion");
		this.jComboBoxTiposRelacionesEstadoNovedadSeguimiento.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesEstadoNovedadSeguimiento = new JComboBoxMe();
		//this.jComboBoxTiposAccionesEstadoNovedadSeguimiento.setText("Accion");
		this.jComboBoxTiposAccionesEstadoNovedadSeguimiento.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarEstadoNovedadSeguimiento = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarEstadoNovedadSeguimiento.setText("Accion");
		this.jComboBoxTiposSeleccionarEstadoNovedadSeguimiento.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralEstadoNovedadSeguimiento=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralEstadoNovedadSeguimiento.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralEstadoNovedadSeguimiento.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralEstadoNovedadSeguimiento.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesEstadoNovedadSeguimiento = new JLabelMe();
		
		this.jLabelAccionesEstadoNovedadSeguimiento.setText("Acciones");		
		this.jLabelAccionesEstadoNovedadSeguimiento.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEstadoNovedadSeguimiento.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEstadoNovedadSeguimiento.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosEstadoNovedadSeguimiento = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosEstadoNovedadSeguimiento.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosEstadoNovedadSeguimiento.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosEstadoNovedadSeguimiento = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosEstadoNovedadSeguimiento.setText("Seleccionados");
		this.jCheckBoxSeleccionadosEstadoNovedadSeguimiento.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaEstadoNovedadSeguimiento = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaEstadoNovedadSeguimiento.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaEstadoNovedadSeguimiento.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteEstadoNovedadSeguimiento = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteEstadoNovedadSeguimiento.setText("Graf.");
		this.jCheckBoxConGraficoReporteEstadoNovedadSeguimiento.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresEstadoNovedadSeguimiento = new JButtonMe();
		//this.jButtonAnterioresEstadoNovedadSeguimiento.setText("<<");
        this.jButtonAnterioresEstadoNovedadSeguimiento.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresEstadoNovedadSeguimiento,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresEstadoNovedadSeguimiento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesEstadoNovedadSeguimiento = new JButtonMe();
		//this.jButtonSiguientesEstadoNovedadSeguimiento.setText(">>");
        this.jButtonSiguientesEstadoNovedadSeguimiento.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesEstadoNovedadSeguimiento,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesEstadoNovedadSeguimiento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosEstadoNovedadSeguimiento = new JButtonMe();
		this.jButtonNuevoGuardarCambiosEstadoNovedadSeguimiento.setText("Nue");
        this.jButtonNuevoGuardarCambiosEstadoNovedadSeguimiento.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosEstadoNovedadSeguimiento,"nuevoguardarcambios_button","Nue",this.estadonovedadseguimientoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosEstadoNovedadSeguimiento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosEstadoNovedadSeguimiento";
		inputMap = this.jButtonNuevoGuardarCambiosEstadoNovedadSeguimiento.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosEstadoNovedadSeguimiento.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosEstadoNovedadSeguimiento"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionEstadoNovedadSeguimiento";
		inputMap = this.jButtonRecargarInformacionEstadoNovedadSeguimiento.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionEstadoNovedadSeguimiento.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionEstadoNovedadSeguimiento"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesEstadoNovedadSeguimiento";
		inputMap = this.jButtonSiguientesEstadoNovedadSeguimiento.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesEstadoNovedadSeguimiento.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesEstadoNovedadSeguimiento"));
		
		//ANTERIORES		
		sMapKey = "AnterioresEstadoNovedadSeguimiento";
		inputMap = this.jButtonAnterioresEstadoNovedadSeguimiento.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresEstadoNovedadSeguimiento.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresEstadoNovedadSeguimiento"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasEstadoNovedadSeguimiento();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesEstadoNovedadSeguimiento.setMinimumSize(new Dimension(this.getWidth(),EstadoNovedadSeguimientoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EstadoNovedadSeguimientoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesEstadoNovedadSeguimiento.setMaximumSize(new Dimension(this.getWidth(),EstadoNovedadSeguimientoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EstadoNovedadSeguimientoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesEstadoNovedadSeguimiento.setPreferredSize(new Dimension(this.getWidth(),EstadoNovedadSeguimientoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EstadoNovedadSeguimientoBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionEstadoNovedadSeguimiento = new GridBagLayout();

			this.jPanelPaginacionEstadoNovedadSeguimiento.setLayout(gridaBagLayoutPaginacionEstadoNovedadSeguimiento);						
			
			this.gridBagConstraintsEstadoNovedadSeguimiento = new GridBagConstraints();
			this.gridBagConstraintsEstadoNovedadSeguimiento.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsEstadoNovedadSeguimiento.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoNovedadSeguimiento.gridy = 0;
			this.gridBagConstraintsEstadoNovedadSeguimiento.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionEstadoNovedadSeguimiento.add(this.jButtonAnterioresEstadoNovedadSeguimiento, this.gridBagConstraintsEstadoNovedadSeguimiento);
					
						
			this.gridBagConstraintsEstadoNovedadSeguimiento = new GridBagConstraints();
			this.gridBagConstraintsEstadoNovedadSeguimiento.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsEstadoNovedadSeguimiento.gridy = 0;
			
			this.jPanelPaginacionEstadoNovedadSeguimiento.add(this.jButtonNuevoGuardarCambiosEstadoNovedadSeguimiento, this.gridBagConstraintsEstadoNovedadSeguimiento);
						
			
			this.gridBagConstraintsEstadoNovedadSeguimiento = new GridBagConstraints();
			this.gridBagConstraintsEstadoNovedadSeguimiento.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsEstadoNovedadSeguimiento.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsEstadoNovedadSeguimiento.gridy = 0;
			this.jPanelPaginacionEstadoNovedadSeguimiento.add(this.jButtonSiguientesEstadoNovedadSeguimiento, this.gridBagConstraintsEstadoNovedadSeguimiento);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsEstadoNovedadSeguimiento = new GridBagConstraints();
			this.gridBagConstraintsEstadoNovedadSeguimiento.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoNovedadSeguimiento.gridy = 1;
			this.gridBagConstraintsEstadoNovedadSeguimiento.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEstadoNovedadSeguimiento.add(this.jButtonNuevoEstadoNovedadSeguimiento, this.gridBagConstraintsEstadoNovedadSeguimiento);
						
			
			
			if(!this.estadonovedadseguimientoSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsEstadoNovedadSeguimiento = new GridBagConstraints();
				this.gridBagConstraintsEstadoNovedadSeguimiento.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsEstadoNovedadSeguimiento.gridy = 1;
				this.gridBagConstraintsEstadoNovedadSeguimiento.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionEstadoNovedadSeguimiento.add(this.jButtonGuardarCambiosTablaEstadoNovedadSeguimiento, this.gridBagConstraintsEstadoNovedadSeguimiento);
			}
			
			
			
			this.gridBagConstraintsEstadoNovedadSeguimiento = new GridBagConstraints();
			this.gridBagConstraintsEstadoNovedadSeguimiento.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoNovedadSeguimiento.gridy = 1;
			this.gridBagConstraintsEstadoNovedadSeguimiento.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEstadoNovedadSeguimiento.add(this.jButtonDuplicarEstadoNovedadSeguimiento, this.gridBagConstraintsEstadoNovedadSeguimiento);
			
			this.gridBagConstraintsEstadoNovedadSeguimiento = new GridBagConstraints();
			this.gridBagConstraintsEstadoNovedadSeguimiento.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoNovedadSeguimiento.gridy = 1;
			this.gridBagConstraintsEstadoNovedadSeguimiento.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEstadoNovedadSeguimiento.add(this.jButtonCopiarEstadoNovedadSeguimiento, this.gridBagConstraintsEstadoNovedadSeguimiento);
		
			this.gridBagConstraintsEstadoNovedadSeguimiento = new GridBagConstraints();
			this.gridBagConstraintsEstadoNovedadSeguimiento.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoNovedadSeguimiento.gridy = 1;
			this.gridBagConstraintsEstadoNovedadSeguimiento.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEstadoNovedadSeguimiento.add(this.jButtonVerFormEstadoNovedadSeguimiento, this.gridBagConstraintsEstadoNovedadSeguimiento);
		
			this.gridBagConstraintsEstadoNovedadSeguimiento = new GridBagConstraints();
			this.gridBagConstraintsEstadoNovedadSeguimiento.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoNovedadSeguimiento.gridy = 1;
			this.gridBagConstraintsEstadoNovedadSeguimiento.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionEstadoNovedadSeguimiento.add(this.jButtonCerrarEstadoNovedadSeguimiento, this.gridBagConstraintsEstadoNovedadSeguimiento);
		
		
		
		this.jButtonRecargarInformacionEstadoNovedadSeguimiento.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionEstadoNovedadSeguimiento.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionEstadoNovedadSeguimiento.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionEstadoNovedadSeguimiento, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesEstadoNovedadSeguimiento.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesEstadoNovedadSeguimiento.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesEstadoNovedadSeguimiento.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesEstadoNovedadSeguimiento, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesEstadoNovedadSeguimiento.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesEstadoNovedadSeguimiento.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesEstadoNovedadSeguimiento.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesEstadoNovedadSeguimiento, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesEstadoNovedadSeguimiento.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesEstadoNovedadSeguimiento.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesEstadoNovedadSeguimiento.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesEstadoNovedadSeguimiento, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionEstadoNovedadSeguimiento.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionEstadoNovedadSeguimiento.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionEstadoNovedadSeguimiento.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionEstadoNovedadSeguimiento, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesEstadoNovedadSeguimiento.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesEstadoNovedadSeguimiento.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesEstadoNovedadSeguimiento.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesEstadoNovedadSeguimiento, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesEstadoNovedadSeguimiento.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEstadoNovedadSeguimiento.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEstadoNovedadSeguimiento.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesEstadoNovedadSeguimiento, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarEstadoNovedadSeguimiento.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarEstadoNovedadSeguimiento.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarEstadoNovedadSeguimiento.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarEstadoNovedadSeguimiento, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaEstadoNovedadSeguimiento.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaEstadoNovedadSeguimiento.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaEstadoNovedadSeguimiento.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaEstadoNovedadSeguimiento, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteEstadoNovedadSeguimiento.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteEstadoNovedadSeguimiento.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteEstadoNovedadSeguimiento.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteEstadoNovedadSeguimiento, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosEstadoNovedadSeguimiento.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosEstadoNovedadSeguimiento.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosEstadoNovedadSeguimiento.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosEstadoNovedadSeguimiento, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosEstadoNovedadSeguimiento.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosEstadoNovedadSeguimiento.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosEstadoNovedadSeguimiento.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosEstadoNovedadSeguimiento, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesEstadoNovedadSeguimiento = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesEstadoNovedadSeguimiento = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1EstadoNovedadSeguimiento = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2EstadoNovedadSeguimiento = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3EstadoNovedadSeguimiento = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4EstadoNovedadSeguimiento = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesEstadoNovedadSeguimiento.setLayout(gridaBagParametrosReportesEstadoNovedadSeguimiento);
			this.jPanelParametrosReportesAccionesEstadoNovedadSeguimiento.setLayout(gridaBagParametrosReportesAccionesEstadoNovedadSeguimiento);
			
			
			this.jPanelParametrosAuxiliar1EstadoNovedadSeguimiento.setLayout(gridaBagParametrosAuxiliar1EstadoNovedadSeguimiento);
			this.jPanelParametrosAuxiliar2EstadoNovedadSeguimiento.setLayout(gridaBagParametrosAuxiliar2EstadoNovedadSeguimiento);
			this.jPanelParametrosAuxiliar3EstadoNovedadSeguimiento.setLayout(gridaBagParametrosAuxiliar3EstadoNovedadSeguimiento);
			this.jPanelParametrosAuxiliar4EstadoNovedadSeguimiento.setLayout(gridaBagParametrosAuxiliar4EstadoNovedadSeguimiento);
			//this.jPanelParametrosAuxiliar5EstadoNovedadSeguimiento.setLayout(gridaBagParametrosAuxiliar2EstadoNovedadSeguimiento);			
			
			
			
			
			this.gridBagConstraintsEstadoNovedadSeguimiento = new GridBagConstraints();
			this.gridBagConstraintsEstadoNovedadSeguimiento.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoNovedadSeguimiento.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEstadoNovedadSeguimiento.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstadoNovedadSeguimiento.add(this.jButtonRecargarInformacionEstadoNovedadSeguimiento, this.gridBagConstraintsEstadoNovedadSeguimiento);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsEstadoNovedadSeguimiento = new GridBagConstraints();
			this.gridBagConstraintsEstadoNovedadSeguimiento.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoNovedadSeguimiento.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoNovedadSeguimiento.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1EstadoNovedadSeguimiento.add(this.jComboBoxTiposPaginacionEstadoNovedadSeguimiento, this.gridBagConstraintsEstadoNovedadSeguimiento);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsEstadoNovedadSeguimiento = new GridBagConstraints();
			this.gridBagConstraintsEstadoNovedadSeguimiento.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoNovedadSeguimiento.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoNovedadSeguimiento.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1EstadoNovedadSeguimiento.add(this.jCheckBoxConAltoMaximoTablaEstadoNovedadSeguimiento, this.gridBagConstraintsEstadoNovedadSeguimiento);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsEstadoNovedadSeguimiento = new GridBagConstraints();
			this.gridBagConstraintsEstadoNovedadSeguimiento.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoNovedadSeguimiento.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoNovedadSeguimiento.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1EstadoNovedadSeguimiento.add(this.jComboBoxTiposArchivosReportesEstadoNovedadSeguimiento, this.gridBagConstraintsEstadoNovedadSeguimiento);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsEstadoNovedadSeguimiento = new GridBagConstraints();
			this.gridBagConstraintsEstadoNovedadSeguimiento.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoNovedadSeguimiento.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoNovedadSeguimiento.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoNovedadSeguimiento.add(this.jPanelParametrosAuxiliar1EstadoNovedadSeguimiento, this.gridBagConstraintsEstadoNovedadSeguimiento);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsEstadoNovedadSeguimiento = new GridBagConstraints();
			this.gridBagConstraintsEstadoNovedadSeguimiento.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoNovedadSeguimiento.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoNovedadSeguimiento.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEstadoNovedadSeguimiento.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4EstadoNovedadSeguimiento.add(this.jComboBoxTiposReportesEstadoNovedadSeguimiento, this.gridBagConstraintsEstadoNovedadSeguimiento);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsEstadoNovedadSeguimiento = new GridBagConstraints();
			this.gridBagConstraintsEstadoNovedadSeguimiento.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoNovedadSeguimiento.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoNovedadSeguimiento.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoNovedadSeguimiento.add(this.jPanelParametrosAuxiliar4EstadoNovedadSeguimiento, this.gridBagConstraintsEstadoNovedadSeguimiento);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsEstadoNovedadSeguimiento = new GridBagConstraints();
			this.gridBagConstraintsEstadoNovedadSeguimiento.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoNovedadSeguimiento.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoNovedadSeguimiento.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoNovedadSeguimiento.add(this.jComboBoxTiposReportesEstadoNovedadSeguimiento, this.gridBagConstraintsEstadoNovedadSeguimiento);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsEstadoNovedadSeguimiento = new GridBagConstraints();
			this.gridBagConstraintsEstadoNovedadSeguimiento.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoNovedadSeguimiento.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoNovedadSeguimiento.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEstadoNovedadSeguimiento.add(this.jCheckBoxGenerarReporteEstadoNovedadSeguimiento, this.gridBagConstraintsEstadoNovedadSeguimiento);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsEstadoNovedadSeguimiento = new GridBagConstraints();
			this.gridBagConstraintsEstadoNovedadSeguimiento.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoNovedadSeguimiento.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoNovedadSeguimiento.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoNovedadSeguimiento.add(this.jPanelParametrosAuxiliar2EstadoNovedadSeguimiento, this.gridBagConstraintsEstadoNovedadSeguimiento);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsEstadoNovedadSeguimiento = new GridBagConstraints();
			this.gridBagConstraintsEstadoNovedadSeguimiento.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoNovedadSeguimiento.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEstadoNovedadSeguimiento.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEstadoNovedadSeguimiento.add(this.jLabelAccionesEstadoNovedadSeguimiento, this.gridBagConstraintsEstadoNovedadSeguimiento);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsEstadoNovedadSeguimiento = new GridBagConstraints();
				this.gridBagConstraintsEstadoNovedadSeguimiento.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsEstadoNovedadSeguimiento.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsEstadoNovedadSeguimiento.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesEstadoNovedadSeguimiento.add(this.jButtonAbrirOrderByEstadoNovedadSeguimiento, this.gridBagConstraintsEstadoNovedadSeguimiento);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsEstadoNovedadSeguimiento = new GridBagConstraints();
			this.gridBagConstraintsEstadoNovedadSeguimiento.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsEstadoNovedadSeguimiento.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoNovedadSeguimiento.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstadoNovedadSeguimiento.add(this.jComboBoxTiposSeleccionarEstadoNovedadSeguimiento, this.gridBagConstraintsEstadoNovedadSeguimiento);			
			
			
			/*
			this.gridBagConstraintsEstadoNovedadSeguimiento = new GridBagConstraints();
			this.gridBagConstraintsEstadoNovedadSeguimiento.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoNovedadSeguimiento.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEstadoNovedadSeguimiento.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEstadoNovedadSeguimiento.add(this.jCheckBoxSeleccionarTodosEstadoNovedadSeguimiento, this.gridBagConstraintsEstadoNovedadSeguimiento);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsEstadoNovedadSeguimiento = new GridBagConstraints();
			this.gridBagConstraintsEstadoNovedadSeguimiento.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoNovedadSeguimiento.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoNovedadSeguimiento.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEstadoNovedadSeguimiento.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3EstadoNovedadSeguimiento.add(this.jCheckBoxSeleccionarTodosEstadoNovedadSeguimiento, this.gridBagConstraintsEstadoNovedadSeguimiento);															
				
			this.gridBagConstraintsEstadoNovedadSeguimiento = new GridBagConstraints();
			this.gridBagConstraintsEstadoNovedadSeguimiento.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoNovedadSeguimiento.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoNovedadSeguimiento.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEstadoNovedadSeguimiento.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3EstadoNovedadSeguimiento.add(this.jCheckBoxSeleccionadosEstadoNovedadSeguimiento, this.gridBagConstraintsEstadoNovedadSeguimiento);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsEstadoNovedadSeguimiento = new GridBagConstraints();
			this.gridBagConstraintsEstadoNovedadSeguimiento.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoNovedadSeguimiento.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoNovedadSeguimiento.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoNovedadSeguimiento.add(this.jPanelParametrosAuxiliar3EstadoNovedadSeguimiento, this.gridBagConstraintsEstadoNovedadSeguimiento);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsEstadoNovedadSeguimiento = new GridBagConstraints();
			this.gridBagConstraintsEstadoNovedadSeguimiento.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoNovedadSeguimiento.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstadoNovedadSeguimiento.add(this.jComboBoxTiposRelacionesEstadoNovedadSeguimiento, this.gridBagConstraintsEstadoNovedadSeguimiento);
				
			this.gridBagConstraintsEstadoNovedadSeguimiento = new GridBagConstraints();
			this.gridBagConstraintsEstadoNovedadSeguimiento.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoNovedadSeguimiento.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstadoNovedadSeguimiento.add(this.jComboBoxTiposAccionesEstadoNovedadSeguimiento, this.gridBagConstraintsEstadoNovedadSeguimiento);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosEstadoNovedadSeguimiento = new GridBagLayout();

			this.jScrollPanelDatosEstadoNovedadSeguimiento.setLayout(gridaBagLayoutDatosEstadoNovedadSeguimiento);
			
			this.gridBagConstraintsEstadoNovedadSeguimiento = new GridBagConstraints();
			this.gridBagConstraintsEstadoNovedadSeguimiento.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoNovedadSeguimiento.gridy = 0;
			this.gridBagConstraintsEstadoNovedadSeguimiento.gridx = 0;
			
			this.jScrollPanelDatosEstadoNovedadSeguimiento.add(this.jTableDatosEstadoNovedadSeguimiento, this.gridBagConstraintsEstadoNovedadSeguimiento);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosEstadoNovedadSeguimiento.setViewportView(this.jTableDatosEstadoNovedadSeguimiento);
		this.jTableDatosEstadoNovedadSeguimiento.setFillsViewportHeight(true);
		this.jTableDatosEstadoNovedadSeguimiento.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesEstadoNovedadSeguimiento= new GridBagLayout();
		this.jPanelAccionesEstadoNovedadSeguimiento.setLayout(gridaBagLayoutAccionesEstadoNovedadSeguimiento);
		
		
		/*	
		this.gridBagConstraintsEstadoNovedadSeguimiento = new GridBagConstraints();
		this.gridBagConstraintsEstadoNovedadSeguimiento.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoNovedadSeguimiento.gridy = 0;
		this.gridBagConstraintsEstadoNovedadSeguimiento.gridx = 0;
			
		this.jPanelAccionesEstadoNovedadSeguimiento.add(this.jButtonNuevoEstadoNovedadSeguimiento, this.gridBagConstraintsEstadoNovedadSeguimiento);
		*/
		int iPosXAccion=0;
		
						
		
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutEstadoNovedadSeguimiento = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutEstadoNovedadSeguimiento);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.estadonovedadseguimientoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsEstadoNovedadSeguimiento = new GridBagConstraints();						
			this.gridBagConstraintsEstadoNovedadSeguimiento.gridy = iGridyPrincipal++;
			this.gridBagConstraintsEstadoNovedadSeguimiento.gridx = 0;		
			//this.gridBagConstraintsEstadoNovedadSeguimiento.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoNovedadSeguimiento.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsEstadoNovedadSeguimiento.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarEstadoNovedadSeguimiento, this.gridBagConstraintsEstadoNovedadSeguimiento);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsEstadoNovedadSeguimiento = new GridBagConstraints();
		this.gridBagConstraintsEstadoNovedadSeguimiento.gridy = iGridyPrincipal++;
		this.gridBagConstraintsEstadoNovedadSeguimiento.gridx = 0;		
		//this.gridBagConstraintsEstadoNovedadSeguimiento.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoNovedadSeguimiento.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsEstadoNovedadSeguimiento.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsEstadoNovedadSeguimiento);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsEstadoNovedadSeguimiento = new GridBagConstraints();
		this.gridBagConstraintsEstadoNovedadSeguimiento.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoNovedadSeguimiento.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesEstadoNovedadSeguimiento, this.gridBagConstraintsEstadoNovedadSeguimiento);								
		
		
		/*
		this.gridBagConstraintsEstadoNovedadSeguimiento = new GridBagConstraints();
		this.gridBagConstraintsEstadoNovedadSeguimiento.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoNovedadSeguimiento.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesEstadoNovedadSeguimiento, this.gridBagConstraintsEstadoNovedadSeguimiento);
		*/		
		
		this.gridBagConstraintsEstadoNovedadSeguimiento = new GridBagConstraints();
		this.gridBagConstraintsEstadoNovedadSeguimiento.gridy =iGridyPrincipal++;
		this.gridBagConstraintsEstadoNovedadSeguimiento.gridx =0;
		this.gridBagConstraintsEstadoNovedadSeguimiento.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsEstadoNovedadSeguimiento.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosEstadoNovedadSeguimiento, this.gridBagConstraintsEstadoNovedadSeguimiento);
				
		
		this.gridBagConstraintsEstadoNovedadSeguimiento = new GridBagConstraints();
		this.gridBagConstraintsEstadoNovedadSeguimiento.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoNovedadSeguimiento.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionEstadoNovedadSeguimiento, this.gridBagConstraintsEstadoNovedadSeguimiento);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(EstadoNovedadSeguimientoJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosEstadoNovedadSeguimiento= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosEstadoNovedadSeguimiento = new GridBagLayout();
			this.jPanelBusquedasParametrosEstadoNovedadSeguimiento.setLayout(gridaBagLayoutBusquedasParametrosEstadoNovedadSeguimiento);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralEstadoNovedadSeguimiento=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralEstadoNovedadSeguimiento.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEstadoNovedadSeguimiento.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEstadoNovedadSeguimiento.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsEstadoNovedadSeguimiento = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsEstadoNovedadSeguimiento = new GridBagConstraints();
		this.gridBagConstraintsEstadoNovedadSeguimiento.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoNovedadSeguimiento.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposEstadoNovedadSeguimiento, this.gridBagConstraintsEstadoNovedadSeguimiento);
			
			
		this.gridBagConstraintsEstadoNovedadSeguimiento = new GridBagConstraints();
		this.gridBagConstraintsEstadoNovedadSeguimiento.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoNovedadSeguimiento.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosEstadoNovedadSeguimiento, this.gridBagConstraintsEstadoNovedadSeguimiento);
		
			
		this.gridBagConstraintsEstadoNovedadSeguimiento = new GridBagConstraints();
		this.gridBagConstraintsEstadoNovedadSeguimiento.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsEstadoNovedadSeguimiento.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesEstadoNovedadSeguimiento, this.gridBagConstraintsEstadoNovedadSeguimiento);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralEstadoNovedadSeguimiento;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoEstadoNovedadSeguimiento() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoEstadoNovedadSeguimiento = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoEstadoNovedadSeguimiento = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoEstadoNovedadSeguimiento.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoEstadoNovedadSeguimiento.setName("jPanelReporteDinamicoEstadoNovedadSeguimiento"); 
		
		this.jPanelReporteDinamicoEstadoNovedadSeguimiento.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoEstadoNovedadSeguimiento.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoEstadoNovedadSeguimiento.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoEstadoNovedadSeguimiento.setLayout(gridaBagLayoutReporteDinamicoEstadoNovedadSeguimiento);
		
		
		this.jInternalFrameReporteDinamicoEstadoNovedadSeguimiento= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoEstadoNovedadSeguimiento = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteEstadoNovedadSeguimiento= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoEstadoNovedadSeguimiento.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoEstadoNovedadSeguimiento.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoEstadoNovedadSeguimiento.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoEstadoNovedadSeguimiento.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoEstadoNovedadSeguimiento.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoEstadoNovedadSeguimiento.setResizable(true);
	    this.jInternalFrameReporteDinamicoEstadoNovedadSeguimiento.setClosable(true);
	    this.jInternalFrameReporteDinamicoEstadoNovedadSeguimiento.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoEstadoNovedadSeguimiento.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoEstadoNovedadSeguimiento.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoEstadoNovedadSeguimiento.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoEstadoNovedadSeguimiento.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Novedad Seguimientoes"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteEstadoNovedadSeguimiento = new JLabelMe();

		this.jLabelColumnasSelectReporteEstadoNovedadSeguimiento.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteEstadoNovedadSeguimiento.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteEstadoNovedadSeguimiento.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteEstadoNovedadSeguimiento.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsEstadoNovedadSeguimiento = new GridBagConstraints();
		this.gridBagConstraintsEstadoNovedadSeguimiento.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoNovedadSeguimiento.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoNovedadSeguimiento.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoEstadoNovedadSeguimiento.add(this.jLabelColumnasSelectReporteEstadoNovedadSeguimiento, this.gridBagConstraintsEstadoNovedadSeguimiento);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteEstadoNovedadSeguimiento = new JList<Reporte>();
		this.jListColumnasSelectReporteEstadoNovedadSeguimiento.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteEstadoNovedadSeguimiento.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteEstadoNovedadSeguimiento.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteEstadoNovedadSeguimiento.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteEstadoNovedadSeguimiento.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteEstadoNovedadSeguimiento=new JScrollPane(this.jListColumnasSelectReporteEstadoNovedadSeguimiento);
			
			this.jScrollColumnasSelectReporteEstadoNovedadSeguimiento.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteEstadoNovedadSeguimiento.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteEstadoNovedadSeguimiento.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteEstadoNovedadSeguimiento.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsEstadoNovedadSeguimiento = new GridBagConstraints();
		this.gridBagConstraintsEstadoNovedadSeguimiento.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoNovedadSeguimiento.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoNovedadSeguimiento.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoEstadoNovedadSeguimiento.add(this.jListColumnasSelectReporteEstadoNovedadSeguimiento, this.gridBagConstraintsEstadoNovedadSeguimiento);
		this.jPanelReporteDinamicoEstadoNovedadSeguimiento.add(this.jScrollColumnasSelectReporteEstadoNovedadSeguimiento, this.gridBagConstraintsEstadoNovedadSeguimiento);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteEstadoNovedadSeguimiento = new JLabelMe();

		this.jLabelRelacionesSelectReporteEstadoNovedadSeguimiento.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteEstadoNovedadSeguimiento.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteEstadoNovedadSeguimiento.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteEstadoNovedadSeguimiento.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteEstadoNovedadSeguimiento = new JList<Reporte>();
		this.jListRelacionesSelectReporteEstadoNovedadSeguimiento.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteEstadoNovedadSeguimiento.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteEstadoNovedadSeguimiento.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteEstadoNovedadSeguimiento.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteEstadoNovedadSeguimiento.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteEstadoNovedadSeguimiento=new JScrollPane(this.jListRelacionesSelectReporteEstadoNovedadSeguimiento);
			
			this.jScrollRelacionesSelectReporteEstadoNovedadSeguimiento.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteEstadoNovedadSeguimiento.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteEstadoNovedadSeguimiento.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteEstadoNovedadSeguimiento.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoEstadoNovedadSeguimiento = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoEstadoNovedadSeguimiento = new JComboBoxMe();
		this.jListColumnasValoresGraficoEstadoNovedadSeguimiento = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoEstadoNovedadSeguimiento = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoEstadoNovedadSeguimiento.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoEstadoNovedadSeguimiento.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoEstadoNovedadSeguimiento.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoEstadoNovedadSeguimiento.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoEstadoNovedadSeguimiento, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoEstadoNovedadSeguimiento = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoEstadoNovedadSeguimiento.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoEstadoNovedadSeguimiento.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoEstadoNovedadSeguimiento.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoEstadoNovedadSeguimiento.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoEstadoNovedadSeguimiento, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoEstadoNovedadSeguimiento = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoEstadoNovedadSeguimiento.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoEstadoNovedadSeguimiento.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoEstadoNovedadSeguimiento.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoEstadoNovedadSeguimiento.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsEstadoNovedadSeguimiento = new GridBagConstraints();
		this.gridBagConstraintsEstadoNovedadSeguimiento.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoNovedadSeguimiento.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoNovedadSeguimiento.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEstadoNovedadSeguimiento.add(this.jLabelGenerarExcelReporteDinamicoEstadoNovedadSeguimiento, this.gridBagConstraintsEstadoNovedadSeguimiento);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoEstadoNovedadSeguimiento = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoEstadoNovedadSeguimiento.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoEstadoNovedadSeguimiento,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoEstadoNovedadSeguimiento.setToolTipText("Generar EXCEL"+" "+EstadoNovedadSeguimientoConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsEstadoNovedadSeguimiento = new GridBagConstraints();
		//this.gridBagConstraintsEstadoNovedadSeguimiento.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsEstadoNovedadSeguimiento.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsEstadoNovedadSeguimiento.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoEstadoNovedadSeguimiento.add(this.jButtonGenerarExcelReporteDinamicoEstadoNovedadSeguimiento, this.gridBagConstraintsEstadoNovedadSeguimiento);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsEstadoNovedadSeguimiento = new GridBagConstraints();
		this.gridBagConstraintsEstadoNovedadSeguimiento.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoNovedadSeguimiento.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEstadoNovedadSeguimiento.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEstadoNovedadSeguimiento.add(this.jComboBoxTiposReportesDinamicoEstadoNovedadSeguimiento, this.gridBagConstraintsEstadoNovedadSeguimiento);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoEstadoNovedadSeguimiento = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoEstadoNovedadSeguimiento.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoEstadoNovedadSeguimiento.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoEstadoNovedadSeguimiento.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoEstadoNovedadSeguimiento.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsEstadoNovedadSeguimiento = new GridBagConstraints();
		this.gridBagConstraintsEstadoNovedadSeguimiento.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoNovedadSeguimiento.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoNovedadSeguimiento.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEstadoNovedadSeguimiento.add(this.jLabelTiposArchivoReporteDinamicoEstadoNovedadSeguimiento, this.gridBagConstraintsEstadoNovedadSeguimiento);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsEstadoNovedadSeguimiento = new GridBagConstraints();
		this.gridBagConstraintsEstadoNovedadSeguimiento.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoNovedadSeguimiento.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEstadoNovedadSeguimiento.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEstadoNovedadSeguimiento.add(this.jComboBoxTiposArchivosReportesDinamicoEstadoNovedadSeguimiento, this.gridBagConstraintsEstadoNovedadSeguimiento);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoEstadoNovedadSeguimiento = new JButtonMe();
		this.jButtonGenerarReporteDinamicoEstadoNovedadSeguimiento.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoEstadoNovedadSeguimiento,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoEstadoNovedadSeguimiento.setToolTipText("Generar"+" "+EstadoNovedadSeguimientoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsEstadoNovedadSeguimiento = new GridBagConstraints();
		this.gridBagConstraintsEstadoNovedadSeguimiento.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoNovedadSeguimiento.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEstadoNovedadSeguimiento.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEstadoNovedadSeguimiento.add(this.jButtonGenerarReporteDinamicoEstadoNovedadSeguimiento, this.gridBagConstraintsEstadoNovedadSeguimiento);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoEstadoNovedadSeguimiento = new JButtonMe();
		this.jButtonCerrarReporteDinamicoEstadoNovedadSeguimiento.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoEstadoNovedadSeguimiento,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoEstadoNovedadSeguimiento.setToolTipText("Cancelar"+" "+EstadoNovedadSeguimientoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsEstadoNovedadSeguimiento = new GridBagConstraints();
		this.gridBagConstraintsEstadoNovedadSeguimiento.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoNovedadSeguimiento.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEstadoNovedadSeguimiento.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEstadoNovedadSeguimiento.add(this.jButtonCerrarReporteDinamicoEstadoNovedadSeguimiento, this.gridBagConstraintsEstadoNovedadSeguimiento);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalEstadoNovedadSeguimiento = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoEstadoNovedadSeguimiento= new JScrollPane(jPanelReporteDinamicoEstadoNovedadSeguimiento,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoEstadoNovedadSeguimiento.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoEstadoNovedadSeguimiento.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoEstadoNovedadSeguimiento.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoEstadoNovedadSeguimiento.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Novedad Seguimientoes"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsEstadoNovedadSeguimiento = new GridBagConstraints();
		this.gridBagConstraintsEstadoNovedadSeguimiento.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsEstadoNovedadSeguimiento.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsEstadoNovedadSeguimiento.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoEstadoNovedadSeguimiento.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoEstadoNovedadSeguimiento.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalEstadoNovedadSeguimiento);
		this.jInternalFrameReporteDinamicoEstadoNovedadSeguimiento.getContentPane().add(this.jScrollPanelReporteDinamicoEstadoNovedadSeguimiento, this.gridBagConstraintsEstadoNovedadSeguimiento);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionEstadoNovedadSeguimiento() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionEstadoNovedadSeguimiento = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionEstadoNovedadSeguimiento = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionEstadoNovedadSeguimiento.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionEstadoNovedadSeguimiento.setName("jPanelImportacionEstadoNovedadSeguimiento"); 
		
		this.jPanelImportacionEstadoNovedadSeguimiento.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionEstadoNovedadSeguimiento.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionEstadoNovedadSeguimiento.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionEstadoNovedadSeguimiento.setLayout(gridaBagLayoutImportacionEstadoNovedadSeguimiento);
		
		
		this.jInternalFrameImportacionEstadoNovedadSeguimiento= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionEstadoNovedadSeguimiento= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionEstadoNovedadSeguimiento = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteEstadoNovedadSeguimiento= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionEstadoNovedadSeguimiento.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionEstadoNovedadSeguimiento.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionEstadoNovedadSeguimiento.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionEstadoNovedadSeguimiento.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionEstadoNovedadSeguimiento.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionEstadoNovedadSeguimiento.setResizable(true);
	    this.jInternalFrameImportacionEstadoNovedadSeguimiento.setClosable(true);
	    this.jInternalFrameImportacionEstadoNovedadSeguimiento.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionEstadoNovedadSeguimiento.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionEstadoNovedadSeguimiento.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionEstadoNovedadSeguimiento.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionEstadoNovedadSeguimiento.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionEstadoNovedadSeguimiento.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionEstadoNovedadSeguimiento.setResizable(true);
	    this.jInternalFrameImportacionEstadoNovedadSeguimiento.setClosable(true);
	    this.jInternalFrameImportacionEstadoNovedadSeguimiento.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionEstadoNovedadSeguimiento.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionEstadoNovedadSeguimiento.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionEstadoNovedadSeguimiento.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionEstadoNovedadSeguimiento.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Novedad Seguimientoes"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionEstadoNovedadSeguimiento = new JLabelMe();

		this.jLabelArchivoImportacionEstadoNovedadSeguimiento.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionEstadoNovedadSeguimiento.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionEstadoNovedadSeguimiento.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionEstadoNovedadSeguimiento.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsEstadoNovedadSeguimiento = new GridBagConstraints();
		this.gridBagConstraintsEstadoNovedadSeguimiento.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoNovedadSeguimiento.gridy = iPosYImportacion;		
		this.gridBagConstraintsEstadoNovedadSeguimiento.gridx = iPosXImportacion++;
			
		this.jPanelImportacionEstadoNovedadSeguimiento.add(this.jLabelArchivoImportacionEstadoNovedadSeguimiento, this.gridBagConstraintsEstadoNovedadSeguimiento);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionEstadoNovedadSeguimiento = new JFileChooser();		
		this.jFileChooserImportacionEstadoNovedadSeguimiento.setToolTipText("ESCOGER ARCHIVO"+" "+EstadoNovedadSeguimientoConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionEstadoNovedadSeguimiento = new JButtonMe();
		this.jButtonAbrirImportacionEstadoNovedadSeguimiento.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionEstadoNovedadSeguimiento,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionEstadoNovedadSeguimiento.setToolTipText("Generar"+" "+EstadoNovedadSeguimientoConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsEstadoNovedadSeguimiento = new GridBagConstraints();
		this.gridBagConstraintsEstadoNovedadSeguimiento.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoNovedadSeguimiento.gridy = iPosYImportacion;
		this.gridBagConstraintsEstadoNovedadSeguimiento.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEstadoNovedadSeguimiento.add(this.jButtonAbrirImportacionEstadoNovedadSeguimiento, this.gridBagConstraintsEstadoNovedadSeguimiento);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionEstadoNovedadSeguimiento = new JLabelMe();

		this.jLabelPathArchivoImportacionEstadoNovedadSeguimiento.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionEstadoNovedadSeguimiento.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionEstadoNovedadSeguimiento.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionEstadoNovedadSeguimiento.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsEstadoNovedadSeguimiento = new GridBagConstraints();
		this.gridBagConstraintsEstadoNovedadSeguimiento.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoNovedadSeguimiento.gridy = iPosYImportacion;		
		this.gridBagConstraintsEstadoNovedadSeguimiento.gridx = iPosXImportacion++;
			
		this.jPanelImportacionEstadoNovedadSeguimiento.add(this.jLabelPathArchivoImportacionEstadoNovedadSeguimiento, this.gridBagConstraintsEstadoNovedadSeguimiento);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionEstadoNovedadSeguimiento=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionEstadoNovedadSeguimiento.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionEstadoNovedadSeguimiento.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionEstadoNovedadSeguimiento.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsEstadoNovedadSeguimiento = new GridBagConstraints();
		this.gridBagConstraintsEstadoNovedadSeguimiento.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoNovedadSeguimiento.gridy = iPosYImportacion;
		this.gridBagConstraintsEstadoNovedadSeguimiento.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEstadoNovedadSeguimiento.add(this.jTextFieldPathArchivoImportacionEstadoNovedadSeguimiento, this.gridBagConstraintsEstadoNovedadSeguimiento);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionEstadoNovedadSeguimiento = new JButtonMe();
		this.jButtonGenerarImportacionEstadoNovedadSeguimiento.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionEstadoNovedadSeguimiento,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionEstadoNovedadSeguimiento.setToolTipText("Generar"+" "+EstadoNovedadSeguimientoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsEstadoNovedadSeguimiento = new GridBagConstraints();
		this.gridBagConstraintsEstadoNovedadSeguimiento.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoNovedadSeguimiento.gridy = iPosYImportacion;
		this.gridBagConstraintsEstadoNovedadSeguimiento.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEstadoNovedadSeguimiento.add(this.jButtonGenerarImportacionEstadoNovedadSeguimiento, this.gridBagConstraintsEstadoNovedadSeguimiento);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionEstadoNovedadSeguimiento = new JButtonMe();
		this.jButtonCerrarImportacionEstadoNovedadSeguimiento.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionEstadoNovedadSeguimiento,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionEstadoNovedadSeguimiento.setToolTipText("Cancelar"+" "+EstadoNovedadSeguimientoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsEstadoNovedadSeguimiento = new GridBagConstraints();
		this.gridBagConstraintsEstadoNovedadSeguimiento.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoNovedadSeguimiento.gridy = iPosYImportacion;
		this.gridBagConstraintsEstadoNovedadSeguimiento.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEstadoNovedadSeguimiento.add(this.jButtonCerrarImportacionEstadoNovedadSeguimiento, this.gridBagConstraintsEstadoNovedadSeguimiento);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalEstadoNovedadSeguimiento = new GridBagLayout();
		
		this.jScrollPanelImportacionEstadoNovedadSeguimiento= new JScrollPane(jPanelImportacionEstadoNovedadSeguimiento,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsEstadoNovedadSeguimiento = new GridBagConstraints();
		this.gridBagConstraintsEstadoNovedadSeguimiento.gridy =iPosYImportacion;
		this.gridBagConstraintsEstadoNovedadSeguimiento.gridx =iPosXImportacion;
		this.gridBagConstraintsEstadoNovedadSeguimiento.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionEstadoNovedadSeguimiento.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionEstadoNovedadSeguimiento.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalEstadoNovedadSeguimiento);
		this.jInternalFrameImportacionEstadoNovedadSeguimiento.getContentPane().add(this.jScrollPanelImportacionEstadoNovedadSeguimiento, this.gridBagConstraintsEstadoNovedadSeguimiento);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByEstadoNovedadSeguimiento(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByEstadoNovedadSeguimiento = new JButtonMe();
			this.jButtonAbrirOrderByEstadoNovedadSeguimiento.setText("Orden");
			this.jButtonAbrirOrderByEstadoNovedadSeguimiento.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByEstadoNovedadSeguimiento,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByEstadoNovedadSeguimiento, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByEstadoNovedadSeguimiento";
			inputMap = this.jButtonAbrirOrderByEstadoNovedadSeguimiento.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByEstadoNovedadSeguimiento.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByEstadoNovedadSeguimiento"));
		
		
			GridBagLayout gridaBagLayoutOrderByEstadoNovedadSeguimiento = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByEstadoNovedadSeguimiento = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByEstadoNovedadSeguimiento.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByEstadoNovedadSeguimiento.setName("jPanelOrderByEstadoNovedadSeguimiento"); 
			
			this.jPanelOrderByEstadoNovedadSeguimiento.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByEstadoNovedadSeguimiento.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByEstadoNovedadSeguimiento.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByEstadoNovedadSeguimiento, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByEstadoNovedadSeguimiento.setLayout(gridaBagLayoutOrderByEstadoNovedadSeguimiento);
			
			
			this.jTableDatosEstadoNovedadSeguimientoOrderBy = new JTableMe();        
			this.jTableDatosEstadoNovedadSeguimientoOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosEstadoNovedadSeguimientoOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosEstadoNovedadSeguimientoOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosEstadoNovedadSeguimientoOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosEstadoNovedadSeguimientoOrderBy.setViewportView(this.jTableDatosEstadoNovedadSeguimientoOrderBy);
			this.jTableDatosEstadoNovedadSeguimientoOrderBy.setFillsViewportHeight(true);
			this.jTableDatosEstadoNovedadSeguimientoOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByEstadoNovedadSeguimiento= new OrderByJInternalFrame();
			this.jInternalFrameOrderByEstadoNovedadSeguimiento= new OrderByJInternalFrame();
			this.jScrollPanelOrderByEstadoNovedadSeguimiento = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteEstadoNovedadSeguimiento= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByEstadoNovedadSeguimiento.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByEstadoNovedadSeguimiento.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByEstadoNovedadSeguimiento.setTitle("Orden");
			this.jInternalFrameOrderByEstadoNovedadSeguimiento.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByEstadoNovedadSeguimiento.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByEstadoNovedadSeguimiento.setResizable(true);
			this.jInternalFrameOrderByEstadoNovedadSeguimiento.setClosable(true);
			this.jInternalFrameOrderByEstadoNovedadSeguimiento.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByEstadoNovedadSeguimiento, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByEstadoNovedadSeguimiento.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByEstadoNovedadSeguimiento.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByEstadoNovedadSeguimiento.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByEstadoNovedadSeguimiento, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByEstadoNovedadSeguimiento.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Novedad Seguimientoes"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsEstadoNovedadSeguimiento = new GridBagConstraints();
			this.gridBagConstraintsEstadoNovedadSeguimiento.gridy =iPosYOrderBy++;
			this.gridBagConstraintsEstadoNovedadSeguimiento.gridx =iPosXOrderBy;
			this.gridBagConstraintsEstadoNovedadSeguimiento.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsEstadoNovedadSeguimiento.ipady =150;
				
			this.jPanelOrderByEstadoNovedadSeguimiento.add(jScrollPanelDatosEstadoNovedadSeguimientoOrderBy, this.gridBagConstraintsEstadoNovedadSeguimiento);//this.jTableDatosEstadoNovedadSeguimientoTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByEstadoNovedadSeguimiento = new JButtonMe();
			this.jButtonCerrarOrderByEstadoNovedadSeguimiento.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByEstadoNovedadSeguimiento,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByEstadoNovedadSeguimiento.setToolTipText("Cancelar"+" "+EstadoNovedadSeguimientoConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByEstadoNovedadSeguimiento, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsEstadoNovedadSeguimiento = new GridBagConstraints();
			this.gridBagConstraintsEstadoNovedadSeguimiento.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoNovedadSeguimiento.gridy = iPosYOrderBy++;
			this.gridBagConstraintsEstadoNovedadSeguimiento.gridx = iPosXOrderBy;
									
			this.jPanelOrderByEstadoNovedadSeguimiento.add(this.jButtonCerrarOrderByEstadoNovedadSeguimiento, this.gridBagConstraintsEstadoNovedadSeguimiento);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalEstadoNovedadSeguimiento = new GridBagLayout();
			
			this.jScrollPanelOrderByEstadoNovedadSeguimiento= new JScrollPane(jPanelOrderByEstadoNovedadSeguimiento,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsEstadoNovedadSeguimiento = new GridBagConstraints();
			this.gridBagConstraintsEstadoNovedadSeguimiento.gridy =iPosYOrderBy;
			this.gridBagConstraintsEstadoNovedadSeguimiento.gridx =iPosXOrderBy;
			this.gridBagConstraintsEstadoNovedadSeguimiento.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByEstadoNovedadSeguimiento.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByEstadoNovedadSeguimiento.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalEstadoNovedadSeguimiento);
			
			this.jInternalFrameOrderByEstadoNovedadSeguimiento.getContentPane().add(this.jScrollPanelOrderByEstadoNovedadSeguimiento, this.gridBagConstraintsEstadoNovedadSeguimiento);			
		
		} else {
			this.jButtonAbrirOrderByEstadoNovedadSeguimiento = new JButtonMe();
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
			&& this.estadonovedadseguimientoSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosEstadoNovedadSeguimiento.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosEstadoNovedadSeguimiento.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosEstadoNovedadSeguimiento.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosEstadoNovedadSeguimiento.getRowHeight();//EstadoNovedadSeguimientoConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.estadonovedadseguimientoSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > EstadoNovedadSeguimientoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaEstadoNovedadSeguimiento.isSelected()) {
					iHeightTable=EstadoNovedadSeguimientoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < EstadoNovedadSeguimientoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=EstadoNovedadSeguimientoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > EstadoNovedadSeguimientoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaEstadoNovedadSeguimiento.isSelected()) {
					iHeightTable=EstadoNovedadSeguimientoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < EstadoNovedadSeguimientoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=EstadoNovedadSeguimientoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosEstadoNovedadSeguimiento.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosEstadoNovedadSeguimiento.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosEstadoNovedadSeguimiento.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosEstadoNovedadSeguimiento.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosEstadoNovedadSeguimiento.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosEstadoNovedadSeguimiento.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByEstadoNovedadSeguimiento!=null && this.jInternalFrameOrderByEstadoNovedadSeguimiento.getjTableDatosOrderBy()!=null) {
			//if(!this.estadonovedadseguimientoSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByEstadoNovedadSeguimiento.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByEstadoNovedadSeguimiento.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByEstadoNovedadSeguimiento.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByEstadoNovedadSeguimiento.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByEstadoNovedadSeguimiento.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByEstadoNovedadSeguimiento.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByEstadoNovedadSeguimiento.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosEstadoNovedadSeguimiento.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosEstadoNovedadSeguimiento.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosEstadoNovedadSeguimiento.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=estadonovedadseguimientoLogic.getEstadoNovedadSeguimientos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=estadonovedadseguimientos.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<EstadoNovedadSeguimiento> TraerEstadoNovedadSeguimientoBeans(List<EstadoNovedadSeguimiento> estadonovedadseguimientos,ArrayList<Classe> classes)throws Exception {
		try {
			for(EstadoNovedadSeguimiento estadonovedadseguimiento:estadonovedadseguimientos) {
					
				if(!(EstadoNovedadSeguimientoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || EstadoNovedadSeguimientoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					estadonovedadseguimiento.setsDetalleGeneralEntityReporte(EstadoNovedadSeguimientoConstantesFunciones.getEstadoNovedadSeguimientoDescripcion(estadonovedadseguimiento));
										
						
					
						
					
				} else  {
							
					//estadonovedadseguimiento.setsDetalleGeneralEntityReporte(estadonovedadseguimiento.getsDetalleGeneralEntityReporte());
										
				}
				
				//estadonovedadseguimientobeans.add(estadonovedadseguimientobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return estadonovedadseguimientos;
    }
	//PARA REPORTES FIN
}
