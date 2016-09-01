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
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;

import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.comisiones.business.entity.*;
import com.bydan.erp.puntoventa.business.entity.*;
import com.bydan.erp.facturacion.business.entity.*;

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
import com.bydan.erp.facturacion.util.EstadoNotaCreditoConstantesFunciones;

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
public class EstadoNotaCreditoJInternalFrame extends EstadoNotaCreditoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarEstadoNotaCredito;
	
	protected JMenuBar jmenuBarEstadoNotaCredito;
	
	protected JMenu jmenuEstadoNotaCredito;
	protected JMenu jmenuDatosEstadoNotaCredito;
	protected JMenu jmenuArchivoEstadoNotaCredito;
	protected JMenu jmenuAccionesEstadoNotaCredito;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosEstadoNotaCredito = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutEstadoNotaCredito;	
	protected GridBagConstraints gridBagConstraintsEstadoNotaCredito;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public EstadoNotaCreditoDetalleFormJInternalFrame jInternalFrameDetalleFormEstadoNotaCredito;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoEstadoNotaCredito;	
	protected ImportacionJInternalFrame jInternalFrameImportacionEstadoNotaCredito;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public EstadoNotaCreditoSessionBean estadonotacreditoSessionBean;
		
	
	
	
	//protected JDesktopPane jDesktopPane;
	public List<EstadoNotaCredito> estadonotacreditos;		
	public List<EstadoNotaCredito> estadonotacreditosEliminados;	
	public List<EstadoNotaCredito> estadonotacreditosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByEstadoNotaCredito;		
	protected JButton jButtonAbrirOrderByEstadoNotaCredito;
	
	
	//protected JPanel jPanelOrderByEstadoNotaCredito;
	//public JScrollPane jScrollPanelOrderByEstadoNotaCredito;	
	//protected JButton jButtonCerrarOrderByEstadoNotaCredito;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public EstadoNotaCreditoLogic estadonotacreditoLogic;
	
	
	
	public JScrollPane jScrollPanelDatosEstadoNotaCredito;
	public JScrollPane jScrollPanelDatosEdicionEstadoNotaCredito;
	public JScrollPane jScrollPanelDatosGeneralEstadoNotaCredito;
    
	
	
	//public JScrollPane jScrollPanelDatosEstadoNotaCreditoOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoEstadoNotaCredito;
	//public JScrollPane jScrollPanelImportacionEstadoNotaCredito;
	
	
	
	protected JPanel jPanelAccionesEstadoNotaCredito;
	
    protected JPanel jPanelPaginacionEstadoNotaCredito;
    protected JPanel jPanelParametrosReportesEstadoNotaCredito;
	protected JPanel jPanelParametrosReportesAccionesEstadoNotaCredito;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1EstadoNotaCredito;
	protected JPanel jPanelParametrosAuxiliar2EstadoNotaCredito;
	protected JPanel jPanelParametrosAuxiliar3EstadoNotaCredito;
	protected JPanel jPanelParametrosAuxiliar4EstadoNotaCredito;
	//protected JPanel jPanelParametrosAuxiliar5EstadoNotaCredito;
	
	
	
	//protected JPanel jPanelReporteDinamicoEstadoNotaCredito;
	//protected JPanel jPanelImportacionEstadoNotaCredito;
	
	
	public JTable jTableDatosEstadoNotaCredito;
	
	
	
	//public JTable jTableDatosEstadoNotaCreditoOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoEstadoNotaCredito;
	protected JButton jButtonDuplicarEstadoNotaCredito;
	protected JButton jButtonCopiarEstadoNotaCredito;
	protected JButton jButtonVerFormEstadoNotaCredito;
	protected JButton jButtonNuevoRelacionesEstadoNotaCredito;
	protected JButton jButtonModificarEstadoNotaCredito;
	
    protected JButton jButtonGuardarCambiosTablaEstadoNotaCredito;
	protected JButton jButtonCerrarEstadoNotaCredito;
	
	
	protected JButton jButtonRecargarInformacionEstadoNotaCredito;
	protected JButton jButtonProcesarInformacionEstadoNotaCredito;
	
	
	protected JButton jButtonAnterioresEstadoNotaCredito;
	protected JButton jButtonSiguientesEstadoNotaCredito;
	protected JButton jButtonNuevoGuardarCambiosEstadoNotaCredito;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoEstadoNotaCredito;
	//protected JButton jButtonCerrarReporteDinamicoEstadoNotaCredito;
	//protected JButton jButtonGenerarExcelReporteDinamicoEstadoNotaCredito;	
	
	
	
	//protected JButton jButtonAbrirImportacionEstadoNotaCredito;
	//protected JButton jButtonGenerarImportacionEstadoNotaCredito;
	//protected JButton jButtonCerrarImportacionEstadoNotaCredito;
	//protected JFileChooser jFileChooserImportacionEstadoNotaCredito;
	//protected File fileImportacionEstadoNotaCredito;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarEstadoNotaCredito;
	protected JButton jButtonDuplicarToolBarEstadoNotaCredito;
	protected JButton jButtonNuevoRelacionesToolBarEstadoNotaCredito;
	
	
	public JButton jButtonGuardarCambiosToolBarEstadoNotaCredito;
	protected JButton jButtonCopiarToolBarEstadoNotaCredito;
	protected JButton jButtonVerFormToolBarEstadoNotaCredito;
	public JButton jButtonGuardarCambiosTablaToolBarEstadoNotaCredito;
	protected JButton jButtonMostrarOcultarTablaToolBarEstadoNotaCredito;
	protected JButton jButtonCerrarToolBarEstadoNotaCredito;
	
	protected JButton jButtonRecargarInformacionToolBarEstadoNotaCredito;
	protected JButton jButtonProcesarInformacionToolBarEstadoNotaCredito;
	protected JButton jButtonAnterioresToolBarEstadoNotaCredito;
	protected JButton jButtonSiguientesToolBarEstadoNotaCredito;
	protected JButton jButtonNuevoGuardarCambiosToolBarEstadoNotaCredito;
	protected JButton jButtonAbrirOrderByToolBarEstadoNotaCredito;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoEstadoNotaCredito;
	protected JMenuItem jMenuItemDuplicarEstadoNotaCredito;
	protected JMenuItem jMenuItemNuevoRelacionesEstadoNotaCredito;
	
	
	protected JMenuItem jMenuItemGuardarCambiosEstadoNotaCredito;
	protected JMenuItem jMenuItemCopiarEstadoNotaCredito;
	protected JMenuItem jMenuItemVerFormEstadoNotaCredito;
	protected JMenuItem jMenuItemGuardarCambiosTablaEstadoNotaCredito;
	protected JMenuItem jMenuItemCerrarEstadoNotaCredito;
	protected JMenuItem jMenuItemDetalleCerrarEstadoNotaCredito;
	protected JMenuItem jMenuItemDetalleAbrirOrderByEstadoNotaCredito;
	protected JMenuItem jMenuItemDetalleMostarOcultarEstadoNotaCredito;
	
	protected JMenuItem jMenuItemRecargarInformacionEstadoNotaCredito;
	protected JMenuItem jMenuItemProcesarInformacionEstadoNotaCredito;
	protected JMenuItem jMenuItemAnterioresEstadoNotaCredito;
	protected JMenuItem jMenuItemSiguientesEstadoNotaCredito;
	protected JMenuItem jMenuItemNuevoGuardarCambiosEstadoNotaCredito;
	protected JMenuItem jMenuItemAbrirOrderByEstadoNotaCredito;
	protected JMenuItem jMenuItemMostrarOcultarEstadoNotaCredito;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesEstadoNotaCredito;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosEstadoNotaCredito;
	protected JCheckBox jCheckBoxSeleccionadosEstadoNotaCredito;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaEstadoNotaCredito;
	protected JCheckBox jCheckBoxConGraficoReporteEstadoNotaCredito;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesEstadoNotaCredito;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesEstadoNotaCredito;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoEstadoNotaCredito;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoEstadoNotaCredito;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesEstadoNotaCredito;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionEstadoNotaCredito;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesEstadoNotaCredito;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesEstadoNotaCredito;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarEstadoNotaCredito;
	protected JTextField jTextFieldValorCampoGeneralEstadoNotaCredito;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteEstadoNotaCredito;
	//public JList<Reporte> jListColumnasSelectReporteEstadoNotaCredito;
	//public JScrollPane jScrollColumnasSelectReporteEstadoNotaCredito;
	
	//public JLabel jLabelRelacionesSelectReporteEstadoNotaCredito;
	//public JList<Reporte> jListRelacionesSelectReporteEstadoNotaCredito;
	//public JScrollPane jScrollRelacionesSelectReporteEstadoNotaCredito;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoEstadoNotaCredito;
	//protected JCheckBox jCheckBoxConGraficoDinamicoEstadoNotaCredito;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoEstadoNotaCredito;
	//public JLabel jLabelTiposArchivoReporteDinamicoEstadoNotaCredito;
	
		
	//public JLabel jLabelArchivoImportacionEstadoNotaCredito;	
	//public JLabel jLabelPathArchivoImportacionEstadoNotaCredito;
	//protected JTextField jTextFieldPathArchivoImportacionEstadoNotaCredito;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoEstadoNotaCredito;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoEstadoNotaCredito;
	
	//public JLabel jLabelColumnaCategoriaValorEstadoNotaCredito;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorEstadoNotaCredito;
	
	//public JLabel jLabelColumnasValoresGraficoEstadoNotaCredito;
	//public JList<Reporte> jListColumnasValoresGraficoEstadoNotaCredito;
	//public JScrollPane jScrollColumnasValoresGraficoEstadoNotaCredito;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoEstadoNotaCredito;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoEstadoNotaCredito;	
	
	
	
	
	
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
	public EstadoNotaCreditoJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("EstadoNotaCredito No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoNotaCreditoJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EstadoNotaCredito No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoNotaCreditoJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EstadoNotaCredito No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoNotaCreditoJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("EstadoNotaCredito No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionEstadoNotaCredito)	{
		this.jButtonRecargarInformacionEstadoNotaCredito = jButtonRecargarInformacionEstadoNotaCredito;
	}
	
	public JButton getjButtonProcesarInformacionEstadoNotaCredito() {
		return this.jButtonProcesarInformacionEstadoNotaCredito;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionEstadoNotaCredito)	{
		this.jButtonProcesarInformacionEstadoNotaCredito = jButtonProcesarInformacionEstadoNotaCredito;
	}
	
	
	public JButton getjButtonRecargarInformacionEstadoNotaCredito() {
		return this.jButtonRecargarInformacionEstadoNotaCredito;
	}
	
	
	public List<EstadoNotaCredito> getestadonotacreditos() {
		return this.estadonotacreditos;
	}

	public void setestadonotacreditos(List<EstadoNotaCredito> estadonotacreditos) {
		this.estadonotacreditos = estadonotacreditos;
	}
	
	public List<EstadoNotaCredito> getestadonotacreditosAux() {
		return this.estadonotacreditosAux;
	}

	public void setestadonotacreditosAux(List<EstadoNotaCredito> estadonotacreditosAux) {
		this.estadonotacreditosAux = estadonotacreditosAux;
	}
	
	public List<EstadoNotaCredito> getestadonotacreditosEliminados() {
		return this.estadonotacreditosEliminados;
	}

	public void setEstadoNotaCreditosEliminados(List<EstadoNotaCredito> estadonotacreditosEliminados) {
		this.estadonotacreditosEliminados = estadonotacreditosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarEstadoNotaCredito() {
		return jComboBoxTiposSeleccionarEstadoNotaCredito;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarEstadoNotaCredito(
			JComboBox jComboBoxTiposSeleccionarEstadoNotaCredito) {
		this.jComboBoxTiposSeleccionarEstadoNotaCredito = jComboBoxTiposSeleccionarEstadoNotaCredito;
	}
	
	public void setBorderResaltarTiposSeleccionarEstadoNotaCredito() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarEstadoNotaCredito.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarEstadoNotaCredito .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralEstadoNotaCredito() {
		return jTextFieldValorCampoGeneralEstadoNotaCredito;
	}

	public void setjTextFieldValorCampoGeneralEstadoNotaCredito(
			JTextField jTextFieldValorCampoGeneralEstadoNotaCredito) {
		this.jTextFieldValorCampoGeneralEstadoNotaCredito = jTextFieldValorCampoGeneralEstadoNotaCredito;
	}

	public void setBorderResaltarValorCampoGeneralEstadoNotaCredito() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoNotaCredito.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralEstadoNotaCredito .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosEstadoNotaCredito() {
		return this.jCheckBoxSeleccionarTodosEstadoNotaCredito;
	}

	public void setjCheckBoxSeleccionarTodosEstadoNotaCredito(
			JCheckBox jCheckBoxSeleccionarTodosEstadoNotaCredito) {
		this.jCheckBoxSeleccionarTodosEstadoNotaCredito = jCheckBoxSeleccionarTodosEstadoNotaCredito;
	}

	public void setBorderResaltarSeleccionarTodosEstadoNotaCredito() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoNotaCredito.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosEstadoNotaCredito .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosEstadoNotaCredito() {
		return this.jCheckBoxSeleccionadosEstadoNotaCredito;
	}

	public void setjCheckBoxSeleccionadosEstadoNotaCredito(
			JCheckBox jCheckBoxSeleccionadosEstadoNotaCredito) {
		this.jCheckBoxSeleccionadosEstadoNotaCredito = jCheckBoxSeleccionadosEstadoNotaCredito;
	}
	
	public void setBorderResaltarSeleccionadosEstadoNotaCredito() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoNotaCredito.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosEstadoNotaCredito .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesEstadoNotaCredito() {
		return this.jComboBoxTiposArchivosReportesEstadoNotaCredito;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesEstadoNotaCredito(
			JComboBox jComboBoxTiposArchivosReportesEstadoNotaCredito) {
		this.jComboBoxTiposArchivosReportesEstadoNotaCredito = jComboBoxTiposArchivosReportesEstadoNotaCredito;
	}

	public void setBorderResaltarTiposArchivosReportesEstadoNotaCredito() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoNotaCredito.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesEstadoNotaCredito .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesEstadoNotaCredito() {
		return this.jComboBoxTiposReportesEstadoNotaCredito;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesEstadoNotaCredito(
			JComboBox jComboBoxTiposReportesEstadoNotaCredito) {
		this.jComboBoxTiposReportesEstadoNotaCredito = jComboBoxTiposReportesEstadoNotaCredito;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoEstadoNotaCredito() {
	//	return jComboBoxTiposReportesDinamicoEstadoNotaCredito;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoEstadoNotaCredito(
	//		JComboBox jComboBoxTiposReportesDinamicoEstadoNotaCredito) {
	//	this.jComboBoxTiposReportesDinamicoEstadoNotaCredito = jComboBoxTiposReportesDinamicoEstadoNotaCredito;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoEstadoNotaCredito() {
	//	return jComboBoxTiposArchivosReportesDinamicoEstadoNotaCredito;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoEstadoNotaCredito(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoEstadoNotaCredito) {
	//	this.jComboBoxTiposArchivosReportesDinamicoEstadoNotaCredito = jComboBoxTiposArchivosReportesDinamicoEstadoNotaCredito;
	//}
	
	public void setBorderResaltarTiposReportesEstadoNotaCredito() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoNotaCredito.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesEstadoNotaCredito .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesEstadoNotaCredito() {
		return this.jComboBoxTiposGraficosReportesEstadoNotaCredito;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesEstadoNotaCredito(
			JComboBox jComboBoxTiposGraficosReportesEstadoNotaCredito) {
		this.jComboBoxTiposGraficosReportesEstadoNotaCredito = jComboBoxTiposGraficosReportesEstadoNotaCredito;
	}
	
	public void setBorderResaltarTiposGraficosReportesEstadoNotaCredito() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoNotaCredito.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesEstadoNotaCredito .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionEstadoNotaCredito() {
		return this.jComboBoxTiposPaginacionEstadoNotaCredito;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionEstadoNotaCredito(
			JComboBox jComboBoxTiposPaginacionEstadoNotaCredito) {
		this.jComboBoxTiposPaginacionEstadoNotaCredito = jComboBoxTiposPaginacionEstadoNotaCredito;
	}
	
	public void setBorderResaltarTiposPaginacionEstadoNotaCredito() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoNotaCredito.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionEstadoNotaCredito .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesEstadoNotaCredito() {
		return this.jComboBoxTiposRelacionesEstadoNotaCredito;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesEstadoNotaCredito() {
		return this.jComboBoxTiposAccionesEstadoNotaCredito;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesEstadoNotaCredito(
			JComboBox jComboBoxTiposRelacionesEstadoNotaCredito) {
		this.jComboBoxTiposRelacionesEstadoNotaCredito = jComboBoxTiposRelacionesEstadoNotaCredito;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesEstadoNotaCredito(
			JComboBox jComboBoxTiposAccionesEstadoNotaCredito) {
		this.jComboBoxTiposAccionesEstadoNotaCredito = jComboBoxTiposAccionesEstadoNotaCredito;
	}
	
	public void setBorderResaltarTiposRelacionesEstadoNotaCredito() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoNotaCredito.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesEstadoNotaCredito .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesEstadoNotaCredito() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoNotaCredito.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesEstadoNotaCredito .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoEstadoNotaCredito() {
	//	return jCheckBoxConGraficoDinamicoEstadoNotaCredito;
	//}

	//public void setjCheckBoxConGraficoDinamicoEstadoNotaCredito(
	//		JCheckBox jCheckBoxConGraficoDinamicoEstadoNotaCredito) {
	//	this.jCheckBoxConGraficoDinamicoEstadoNotaCredito = jCheckBoxConGraficoDinamicoEstadoNotaCredito;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoEstadoNotaCredito() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarEstadoNotaCredito.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoEstadoNotaCredito .setBorder(borderResaltar);		
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
		this.estadonotacreditoSessionBean=new EstadoNotaCreditoSessionBean();
		
		this.estadonotacreditoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.estadonotacreditoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.estadonotacreditoSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=EstadoNotaCreditoJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=EstadoNotaCreditoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		EstadoNotaCreditoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		EstadoNotaCreditoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		EstadoNotaCreditoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Estado Nota Credito MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 910) {
			iHeight=910;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.estadonotacreditoSessionBean.getEsGuardarRelacionado()) {
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
		
		EstadoNotaCreditoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("EstadoNotaCredito No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarEstadoNotaCredito= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarEstadoNotaCredito=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarEstadoNotaCredito,this.jTtoolBarEstadoNotaCredito,
							"nuevo","nuevo","Nuevo"+" "+EstadoNotaCreditoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarEstadoNotaCredito=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarEstadoNotaCredito,this.jTtoolBarEstadoNotaCredito,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarEstadoNotaCredito=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarEstadoNotaCredito,this.jTtoolBarEstadoNotaCredito,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+EstadoNotaCreditoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarEstadoNotaCredito=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarEstadoNotaCredito,this.jTtoolBarEstadoNotaCredito,
							"duplicar","duplicar","Duplicar"+" "+EstadoNotaCreditoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarEstadoNotaCredito=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarEstadoNotaCredito,this.jTtoolBarEstadoNotaCredito,
							"copiar","copiar","Copiar"+" "+EstadoNotaCreditoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarEstadoNotaCredito=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarEstadoNotaCredito,this.jTtoolBarEstadoNotaCredito,
							"ver_form","ver_form","Ver"+" "+EstadoNotaCreditoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarEstadoNotaCredito=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEstadoNotaCredito,this.jTtoolBarEstadoNotaCredito,
							"recargar","recargar","Recargar"+" "+EstadoNotaCreditoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarEstadoNotaCredito=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEstadoNotaCredito,this.jTtoolBarEstadoNotaCredito,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarEstadoNotaCredito=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEstadoNotaCredito,this.jTtoolBarEstadoNotaCredito,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarEstadoNotaCredito=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarEstadoNotaCredito,this.jTtoolBarEstadoNotaCredito,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarEstadoNotaCredito=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarEstadoNotaCredito,this.jTtoolBarEstadoNotaCredito,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarEstadoNotaCredito=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarEstadoNotaCredito,this.jTtoolBarEstadoNotaCredito,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+EstadoNotaCreditoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarEstadoNotaCredito=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarEstadoNotaCredito,this.jTtoolBarEstadoNotaCredito,
							"cerrar","cerrar","Salir"+" "+EstadoNotaCreditoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarEstadoNotaCredito=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarEstadoNotaCredito;
			
				this.jButtonProcesarInformacionToolBarEstadoNotaCredito=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarEstadoNotaCredito;
				
		//protected JButton jButtonModificarToolBarEstadoNotaCredito;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarEstadoNotaCredito=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuEstadoNotaCredito=new JMenuMe("General");
		this.jmenuArchivoEstadoNotaCredito=new JMenuMe("Archivo");
		this.jmenuAccionesEstadoNotaCredito=new JMenuMe("Acciones");
		this.jmenuDatosEstadoNotaCredito=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoEstadoNotaCredito= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoEstadoNotaCredito.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoEstadoNotaCredito,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoEstadoNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarEstadoNotaCredito= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarEstadoNotaCredito.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarEstadoNotaCredito,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarEstadoNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesEstadoNotaCredito= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesEstadoNotaCredito.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesEstadoNotaCredito,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesEstadoNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosEstadoNotaCredito= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosEstadoNotaCredito.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosEstadoNotaCredito,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosEstadoNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarEstadoNotaCredito= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarEstadoNotaCredito.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarEstadoNotaCredito,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarEstadoNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormEstadoNotaCredito= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormEstadoNotaCredito.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormEstadoNotaCredito,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormEstadoNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaEstadoNotaCredito= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaEstadoNotaCredito.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaEstadoNotaCredito,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaEstadoNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarEstadoNotaCredito= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarEstadoNotaCredito.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarEstadoNotaCredito,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarEstadoNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionEstadoNotaCredito= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionEstadoNotaCredito.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionEstadoNotaCredito,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionEstadoNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionEstadoNotaCredito= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionEstadoNotaCredito.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionEstadoNotaCredito,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresEstadoNotaCredito= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresEstadoNotaCredito.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresEstadoNotaCredito,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresEstadoNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesEstadoNotaCredito= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesEstadoNotaCredito.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesEstadoNotaCredito,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesEstadoNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByEstadoNotaCredito= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByEstadoNotaCredito.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByEstadoNotaCredito,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByEstadoNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarEstadoNotaCredito= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarEstadoNotaCredito.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarEstadoNotaCredito,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarEstadoNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByEstadoNotaCredito= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByEstadoNotaCredito.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByEstadoNotaCredito,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByEstadoNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarEstadoNotaCredito= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarEstadoNotaCredito.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarEstadoNotaCredito,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarEstadoNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosEstadoNotaCredito= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosEstadoNotaCredito.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosEstadoNotaCredito,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosEstadoNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoEstadoNotaCredito.add(this.jMenuItemCerrarEstadoNotaCredito);
			
			this.jmenuAccionesEstadoNotaCredito.add(this.jMenuItemNuevoEstadoNotaCredito);
			this.jmenuAccionesEstadoNotaCredito.add(this.jMenuItemNuevoGuardarCambiosEstadoNotaCredito);
			this.jmenuAccionesEstadoNotaCredito.add(this.jMenuItemNuevoRelacionesEstadoNotaCredito);
			this.jmenuAccionesEstadoNotaCredito.add(this.jMenuItemGuardarCambiosTablaEstadoNotaCredito);		
			this.jmenuAccionesEstadoNotaCredito.add(this.jMenuItemDuplicarEstadoNotaCredito);		
			this.jmenuAccionesEstadoNotaCredito.add(this.jMenuItemCopiarEstadoNotaCredito);		
			this.jmenuAccionesEstadoNotaCredito.add(this.jMenuItemVerFormEstadoNotaCredito);		
			
			this.jmenuDatosEstadoNotaCredito.add(this.jMenuItemRecargarInformacionEstadoNotaCredito);				
			this.jmenuDatosEstadoNotaCredito.add(this.jMenuItemAnterioresEstadoNotaCredito);				
			this.jmenuDatosEstadoNotaCredito.add(this.jMenuItemSiguientesEstadoNotaCredito);				
			this.jmenuDatosEstadoNotaCredito.add(this.jMenuItemAbrirOrderByEstadoNotaCredito);				
			this.jmenuDatosEstadoNotaCredito.add(this.jMenuItemMostrarOcultarEstadoNotaCredito);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesEstadoNotaCredito.add(this.jMenuItemGuardarCambiosEstadoNotaCredito);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoEstadoNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesEstadoNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosEstadoNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarEstadoNotaCredito.add(this.jmenuArchivoEstadoNotaCredito);		
			this.jmenuBarEstadoNotaCredito.add(this.jmenuAccionesEstadoNotaCredito);		
			this.jmenuBarEstadoNotaCredito.add(this.jmenuDatosEstadoNotaCredito);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarEstadoNotaCredito);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasEstadoNotaCredito() {
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
			//this.jInternalFrameDetalleEstadoNotaCredito = new EstadoNotaCreditoDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Estado Nota Credito DATOS");
			this.jInternalFrameDetalleFormEstadoNotaCredito = new EstadoNotaCreditoDetalleFormJInternalFrame(jDesktopPane,this.estadonotacreditoSessionBean.getConGuardarRelaciones(),this.estadonotacreditoSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormEstadoNotaCredito = null;//new EstadoNotaCreditoDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutEstadoNotaCredito= new GridBagLayout();
		
		
		this.jTableDatosEstadoNotaCredito = new JTableMe();      
		
		String sToolTipEstadoNotaCredito="";
		sToolTipEstadoNotaCredito=EstadoNotaCreditoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipEstadoNotaCredito+="(Facturacion.EstadoNotaCredito)";
		}
		
		if(!this.estadonotacreditoSessionBean.getEsGuardarRelacionado()) {
			sToolTipEstadoNotaCredito+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosEstadoNotaCredito.setToolTipText(sToolTipEstadoNotaCredito);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosEstadoNotaCredito);
		this.jTableDatosEstadoNotaCredito.setAutoCreateRowSorter(true);
		this.jTableDatosEstadoNotaCredito.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosEstadoNotaCredito.setRowSelectionAllowed(true);
		this.jTableDatosEstadoNotaCredito.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosEstadoNotaCredito,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoEstadoNotaCredito = new JButtonMe();
		this.jButtonDuplicarEstadoNotaCredito = new JButtonMe();
		this.jButtonCopiarEstadoNotaCredito = new JButtonMe();
		this.jButtonVerFormEstadoNotaCredito = new JButtonMe();
		this.jButtonNuevoRelacionesEstadoNotaCredito = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaEstadoNotaCredito = new JButtonMe();
		this.jButtonCerrarEstadoNotaCredito = new JButtonMe();
		
		this.jScrollPanelDatosEstadoNotaCredito = new JScrollPane();   
        this.jScrollPanelDatosGeneralEstadoNotaCredito = new JScrollPane();
		
				
		
		
		this.jPanelAccionesEstadoNotaCredito = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Estado Nota Credito";
		
		if(!this.estadonotacreditoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosEstadoNotaCredito.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Nota Creditos" + this.sPath));
		} else {
			this.jScrollPanelDatosEstadoNotaCredito.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralEstadoNotaCredito.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesEstadoNotaCredito.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesEstadoNotaCredito.setToolTipText("Acciones");
        this.jPanelAccionesEstadoNotaCredito.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralEstadoNotaCredito, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEstadoNotaCredito, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoEstadoNotaCredito=new ReporteDinamicoJInternalFrame(EstadoNotaCreditoConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoEstadoNotaCredito();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionEstadoNotaCredito=new ImportacionJInternalFrame(EstadoNotaCreditoConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionEstadoNotaCredito();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByEstadoNotaCredito = new JButtonMe();
		
		this.jButtonAbrirOrderByEstadoNotaCredito.setText("Orden");
		this.jButtonAbrirOrderByEstadoNotaCredito.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByEstadoNotaCredito,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByEstadoNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByEstadoNotaCredito.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByEstadoNotaCredito.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByEstadoNotaCredito=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEstadoNotaCredito,false,this);
			
			//this.cargarOrderByEstadoNotaCredito(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByEstadoNotaCredito=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEstadoNotaCredito,true,this);
			
			//this.cargarOrderByEstadoNotaCredito(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosEstadoNotaCredito.setMinimumSize(new Dimension(400,50));//430
		this.jTableDatosEstadoNotaCredito.setMaximumSize(new Dimension(400,50));//430
		this.jTableDatosEstadoNotaCredito.setPreferredSize(new Dimension(400,50));//430
		
		this.jScrollPanelDatosEstadoNotaCredito.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosEstadoNotaCredito.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosEstadoNotaCredito.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoEstadoNotaCredito.setText("Nuevo");
		this.jButtonDuplicarEstadoNotaCredito.setText("Duplicar");
		this.jButtonCopiarEstadoNotaCredito.setText("Copiar");
		this.jButtonVerFormEstadoNotaCredito.setText("Ver");
		this.jButtonNuevoRelacionesEstadoNotaCredito.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaEstadoNotaCredito.setText("Guardar");
		this.jButtonCerrarEstadoNotaCredito.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoEstadoNotaCredito,"nuevo_button","Nuevo",this.estadonotacreditoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarEstadoNotaCredito,"duplicar_button","Duplicar",this.estadonotacreditoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarEstadoNotaCredito,"copiar_button","Copiar",this.estadonotacreditoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormEstadoNotaCredito,"ver_form","Ver",this.estadonotacreditoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesEstadoNotaCredito,"nuevorelaciones_button","Nuevo Rel",this.estadonotacreditoSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaEstadoNotaCredito,"guardarcambiostabla_button","Guardar",this.estadonotacreditoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarEstadoNotaCredito,"cerrar_button","Salir",this.estadonotacreditoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoEstadoNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarEstadoNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarEstadoNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormEstadoNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesEstadoNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaEstadoNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarEstadoNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoEstadoNotaCredito.setToolTipText("Nuevo"+" "+EstadoNotaCreditoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarEstadoNotaCredito.setToolTipText("Duplicar"+" "+EstadoNotaCreditoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarEstadoNotaCredito.setToolTipText("Copiar"+" "+EstadoNotaCreditoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormEstadoNotaCredito.setToolTipText("Ver"+" "+EstadoNotaCreditoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesEstadoNotaCredito.setToolTipText("Nuevo Rel"+" "+EstadoNotaCreditoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaEstadoNotaCredito.setToolTipText("Guardar"+" "+EstadoNotaCreditoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarEstadoNotaCredito.setToolTipText("Salir"+" "+EstadoNotaCreditoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoEstadoNotaCredito";
		inputMap = this.jButtonNuevoEstadoNotaCredito.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoEstadoNotaCredito.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoEstadoNotaCredito"));
		
		//DUPLICAR
		sMapKey = "DuplicarEstadoNotaCredito";
		inputMap = this.jButtonDuplicarEstadoNotaCredito.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarEstadoNotaCredito.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarEstadoNotaCredito"));
		
		//COPIAR
		sMapKey = "CopiarEstadoNotaCredito";
		inputMap = this.jButtonCopiarEstadoNotaCredito.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarEstadoNotaCredito.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarEstadoNotaCredito"));
		
		//VEr FORM
		sMapKey = "VerFormEstadoNotaCredito";
		inputMap = this.jButtonVerFormEstadoNotaCredito.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormEstadoNotaCredito.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormEstadoNotaCredito"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesEstadoNotaCredito";
		inputMap = this.jButtonNuevoRelacionesEstadoNotaCredito.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesEstadoNotaCredito.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesEstadoNotaCredito"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarEstadoNotaCredito";
		inputMap = this.jButtonModificarEstadoNotaCredito.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarEstadoNotaCredito.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarEstadoNotaCredito"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarEstadoNotaCredito";
		inputMap = this.jButtonCerrarEstadoNotaCredito.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarEstadoNotaCredito.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarEstadoNotaCredito"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaEstadoNotaCredito";
		inputMap = this.jButtonGuardarCambiosTablaEstadoNotaCredito.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaEstadoNotaCredito.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaEstadoNotaCredito"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesEstadoNotaCredito = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesEstadoNotaCredito = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionEstadoNotaCredito = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1EstadoNotaCredito= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2EstadoNotaCredito= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3EstadoNotaCredito= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4EstadoNotaCredito= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5EstadoNotaCredito= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesEstadoNotaCredito.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesEstadoNotaCredito.setName("jPanelParametrosReportesEstadoNotaCredito"); 
		
		this.jPanelParametrosReportesAccionesEstadoNotaCredito.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesEstadoNotaCredito.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesEstadoNotaCredito.setName("jPanelParametrosReportesAccionesEstadoNotaCredito"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesEstadoNotaCredito, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesEstadoNotaCredito, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionEstadoNotaCredito = new JButtonMe();
		this.jButtonRecargarInformacionEstadoNotaCredito.setText("Recargar");
		this.jButtonRecargarInformacionEstadoNotaCredito.setToolTipText("Recargar"+" "+EstadoNotaCreditoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionEstadoNotaCredito,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionEstadoNotaCredito = new JButtonMe();
		this.jButtonProcesarInformacionEstadoNotaCredito.setText("Procesar");
		this.jButtonProcesarInformacionEstadoNotaCredito.setToolTipText("Procesar"+" "+EstadoNotaCreditoConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionEstadoNotaCredito.setVisible(false);
			
		this.jButtonProcesarInformacionEstadoNotaCredito.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionEstadoNotaCredito.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionEstadoNotaCredito.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesEstadoNotaCredito = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEstadoNotaCredito.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesEstadoNotaCredito.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesEstadoNotaCredito = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEstadoNotaCredito.setText("TIPO");       
		this.jComboBoxTiposReportesEstadoNotaCredito.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesEstadoNotaCredito = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEstadoNotaCredito.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesEstadoNotaCredito.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionEstadoNotaCredito = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionEstadoNotaCredito.setText("Paginacion");
		this.jComboBoxTiposPaginacionEstadoNotaCredito.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesEstadoNotaCredito = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesEstadoNotaCredito.setText("Accion");
		this.jComboBoxTiposRelacionesEstadoNotaCredito.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesEstadoNotaCredito = new JComboBoxMe();
		//this.jComboBoxTiposAccionesEstadoNotaCredito.setText("Accion");
		this.jComboBoxTiposAccionesEstadoNotaCredito.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarEstadoNotaCredito = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarEstadoNotaCredito.setText("Accion");
		this.jComboBoxTiposSeleccionarEstadoNotaCredito.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralEstadoNotaCredito=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralEstadoNotaCredito.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralEstadoNotaCredito.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralEstadoNotaCredito.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesEstadoNotaCredito = new JLabelMe();
		
		this.jLabelAccionesEstadoNotaCredito.setText("Acciones");		
		this.jLabelAccionesEstadoNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEstadoNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEstadoNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosEstadoNotaCredito = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosEstadoNotaCredito.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosEstadoNotaCredito.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosEstadoNotaCredito = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosEstadoNotaCredito.setText("Seleccionados");
		this.jCheckBoxSeleccionadosEstadoNotaCredito.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaEstadoNotaCredito = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaEstadoNotaCredito.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaEstadoNotaCredito.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteEstadoNotaCredito = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteEstadoNotaCredito.setText("Graf.");
		this.jCheckBoxConGraficoReporteEstadoNotaCredito.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresEstadoNotaCredito = new JButtonMe();
		//this.jButtonAnterioresEstadoNotaCredito.setText("<<");
        this.jButtonAnterioresEstadoNotaCredito.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresEstadoNotaCredito,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresEstadoNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesEstadoNotaCredito = new JButtonMe();
		//this.jButtonSiguientesEstadoNotaCredito.setText(">>");
        this.jButtonSiguientesEstadoNotaCredito.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesEstadoNotaCredito,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesEstadoNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosEstadoNotaCredito = new JButtonMe();
		this.jButtonNuevoGuardarCambiosEstadoNotaCredito.setText("Nue");
        this.jButtonNuevoGuardarCambiosEstadoNotaCredito.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosEstadoNotaCredito,"nuevoguardarcambios_button","Nue",this.estadonotacreditoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosEstadoNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosEstadoNotaCredito";
		inputMap = this.jButtonNuevoGuardarCambiosEstadoNotaCredito.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosEstadoNotaCredito.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosEstadoNotaCredito"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionEstadoNotaCredito";
		inputMap = this.jButtonRecargarInformacionEstadoNotaCredito.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionEstadoNotaCredito.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionEstadoNotaCredito"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesEstadoNotaCredito";
		inputMap = this.jButtonSiguientesEstadoNotaCredito.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesEstadoNotaCredito.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesEstadoNotaCredito"));
		
		//ANTERIORES		
		sMapKey = "AnterioresEstadoNotaCredito";
		inputMap = this.jButtonAnterioresEstadoNotaCredito.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresEstadoNotaCredito.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresEstadoNotaCredito"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasEstadoNotaCredito();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesEstadoNotaCredito.setMinimumSize(new Dimension(this.getWidth(),EstadoNotaCreditoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EstadoNotaCreditoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesEstadoNotaCredito.setMaximumSize(new Dimension(this.getWidth(),EstadoNotaCreditoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EstadoNotaCreditoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesEstadoNotaCredito.setPreferredSize(new Dimension(this.getWidth(),EstadoNotaCreditoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EstadoNotaCreditoBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionEstadoNotaCredito = new GridBagLayout();

			this.jPanelPaginacionEstadoNotaCredito.setLayout(gridaBagLayoutPaginacionEstadoNotaCredito);						
			
			this.gridBagConstraintsEstadoNotaCredito = new GridBagConstraints();
			this.gridBagConstraintsEstadoNotaCredito.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsEstadoNotaCredito.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoNotaCredito.gridy = 0;
			this.gridBagConstraintsEstadoNotaCredito.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionEstadoNotaCredito.add(this.jButtonAnterioresEstadoNotaCredito, this.gridBagConstraintsEstadoNotaCredito);
					
						
			this.gridBagConstraintsEstadoNotaCredito = new GridBagConstraints();
			this.gridBagConstraintsEstadoNotaCredito.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsEstadoNotaCredito.gridy = 0;
			
			this.jPanelPaginacionEstadoNotaCredito.add(this.jButtonNuevoGuardarCambiosEstadoNotaCredito, this.gridBagConstraintsEstadoNotaCredito);
						
			
			this.gridBagConstraintsEstadoNotaCredito = new GridBagConstraints();
			this.gridBagConstraintsEstadoNotaCredito.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsEstadoNotaCredito.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsEstadoNotaCredito.gridy = 0;
			this.jPanelPaginacionEstadoNotaCredito.add(this.jButtonSiguientesEstadoNotaCredito, this.gridBagConstraintsEstadoNotaCredito);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsEstadoNotaCredito = new GridBagConstraints();
			this.gridBagConstraintsEstadoNotaCredito.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoNotaCredito.gridy = 1;
			this.gridBagConstraintsEstadoNotaCredito.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEstadoNotaCredito.add(this.jButtonNuevoEstadoNotaCredito, this.gridBagConstraintsEstadoNotaCredito);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsEstadoNotaCredito = new GridBagConstraints();
				this.gridBagConstraintsEstadoNotaCredito.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsEstadoNotaCredito.gridy = 1;
				this.gridBagConstraintsEstadoNotaCredito.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionEstadoNotaCredito.add(this.jButtonNuevoRelacionesEstadoNotaCredito, this.gridBagConstraintsEstadoNotaCredito);
			}
			
			
			if(!this.estadonotacreditoSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsEstadoNotaCredito = new GridBagConstraints();
				this.gridBagConstraintsEstadoNotaCredito.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsEstadoNotaCredito.gridy = 1;
				this.gridBagConstraintsEstadoNotaCredito.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionEstadoNotaCredito.add(this.jButtonGuardarCambiosTablaEstadoNotaCredito, this.gridBagConstraintsEstadoNotaCredito);
			}
			
			
			
			this.gridBagConstraintsEstadoNotaCredito = new GridBagConstraints();
			this.gridBagConstraintsEstadoNotaCredito.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoNotaCredito.gridy = 1;
			this.gridBagConstraintsEstadoNotaCredito.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEstadoNotaCredito.add(this.jButtonDuplicarEstadoNotaCredito, this.gridBagConstraintsEstadoNotaCredito);
			
			this.gridBagConstraintsEstadoNotaCredito = new GridBagConstraints();
			this.gridBagConstraintsEstadoNotaCredito.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoNotaCredito.gridy = 1;
			this.gridBagConstraintsEstadoNotaCredito.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEstadoNotaCredito.add(this.jButtonCopiarEstadoNotaCredito, this.gridBagConstraintsEstadoNotaCredito);
		
			this.gridBagConstraintsEstadoNotaCredito = new GridBagConstraints();
			this.gridBagConstraintsEstadoNotaCredito.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoNotaCredito.gridy = 1;
			this.gridBagConstraintsEstadoNotaCredito.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEstadoNotaCredito.add(this.jButtonVerFormEstadoNotaCredito, this.gridBagConstraintsEstadoNotaCredito);
		
			this.gridBagConstraintsEstadoNotaCredito = new GridBagConstraints();
			this.gridBagConstraintsEstadoNotaCredito.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoNotaCredito.gridy = 1;
			this.gridBagConstraintsEstadoNotaCredito.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionEstadoNotaCredito.add(this.jButtonCerrarEstadoNotaCredito, this.gridBagConstraintsEstadoNotaCredito);
		
		
		
		this.jButtonRecargarInformacionEstadoNotaCredito.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionEstadoNotaCredito.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionEstadoNotaCredito.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionEstadoNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesEstadoNotaCredito.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesEstadoNotaCredito.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesEstadoNotaCredito.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesEstadoNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesEstadoNotaCredito.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesEstadoNotaCredito.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesEstadoNotaCredito.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesEstadoNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesEstadoNotaCredito.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesEstadoNotaCredito.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesEstadoNotaCredito.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesEstadoNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionEstadoNotaCredito.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionEstadoNotaCredito.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionEstadoNotaCredito.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionEstadoNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesEstadoNotaCredito.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesEstadoNotaCredito.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesEstadoNotaCredito.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesEstadoNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesEstadoNotaCredito.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEstadoNotaCredito.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEstadoNotaCredito.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesEstadoNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarEstadoNotaCredito.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarEstadoNotaCredito.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarEstadoNotaCredito.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarEstadoNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaEstadoNotaCredito.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaEstadoNotaCredito.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaEstadoNotaCredito.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaEstadoNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteEstadoNotaCredito.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteEstadoNotaCredito.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteEstadoNotaCredito.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteEstadoNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosEstadoNotaCredito.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosEstadoNotaCredito.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosEstadoNotaCredito.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosEstadoNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosEstadoNotaCredito.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosEstadoNotaCredito.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosEstadoNotaCredito.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosEstadoNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesEstadoNotaCredito = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesEstadoNotaCredito = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1EstadoNotaCredito = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2EstadoNotaCredito = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3EstadoNotaCredito = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4EstadoNotaCredito = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesEstadoNotaCredito.setLayout(gridaBagParametrosReportesEstadoNotaCredito);
			this.jPanelParametrosReportesAccionesEstadoNotaCredito.setLayout(gridaBagParametrosReportesAccionesEstadoNotaCredito);
			
			
			this.jPanelParametrosAuxiliar1EstadoNotaCredito.setLayout(gridaBagParametrosAuxiliar1EstadoNotaCredito);
			this.jPanelParametrosAuxiliar2EstadoNotaCredito.setLayout(gridaBagParametrosAuxiliar2EstadoNotaCredito);
			this.jPanelParametrosAuxiliar3EstadoNotaCredito.setLayout(gridaBagParametrosAuxiliar3EstadoNotaCredito);
			this.jPanelParametrosAuxiliar4EstadoNotaCredito.setLayout(gridaBagParametrosAuxiliar4EstadoNotaCredito);
			//this.jPanelParametrosAuxiliar5EstadoNotaCredito.setLayout(gridaBagParametrosAuxiliar2EstadoNotaCredito);			
			
			
			
			
			this.gridBagConstraintsEstadoNotaCredito = new GridBagConstraints();
			this.gridBagConstraintsEstadoNotaCredito.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoNotaCredito.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEstadoNotaCredito.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstadoNotaCredito.add(this.jButtonRecargarInformacionEstadoNotaCredito, this.gridBagConstraintsEstadoNotaCredito);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsEstadoNotaCredito = new GridBagConstraints();
			this.gridBagConstraintsEstadoNotaCredito.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoNotaCredito.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoNotaCredito.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1EstadoNotaCredito.add(this.jComboBoxTiposPaginacionEstadoNotaCredito, this.gridBagConstraintsEstadoNotaCredito);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsEstadoNotaCredito = new GridBagConstraints();
			this.gridBagConstraintsEstadoNotaCredito.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoNotaCredito.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoNotaCredito.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1EstadoNotaCredito.add(this.jCheckBoxConAltoMaximoTablaEstadoNotaCredito, this.gridBagConstraintsEstadoNotaCredito);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsEstadoNotaCredito = new GridBagConstraints();
			this.gridBagConstraintsEstadoNotaCredito.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoNotaCredito.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoNotaCredito.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1EstadoNotaCredito.add(this.jComboBoxTiposArchivosReportesEstadoNotaCredito, this.gridBagConstraintsEstadoNotaCredito);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsEstadoNotaCredito = new GridBagConstraints();
			this.gridBagConstraintsEstadoNotaCredito.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoNotaCredito.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoNotaCredito.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoNotaCredito.add(this.jPanelParametrosAuxiliar1EstadoNotaCredito, this.gridBagConstraintsEstadoNotaCredito);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsEstadoNotaCredito = new GridBagConstraints();
			this.gridBagConstraintsEstadoNotaCredito.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoNotaCredito.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoNotaCredito.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEstadoNotaCredito.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4EstadoNotaCredito.add(this.jComboBoxTiposReportesEstadoNotaCredito, this.gridBagConstraintsEstadoNotaCredito);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsEstadoNotaCredito = new GridBagConstraints();
			this.gridBagConstraintsEstadoNotaCredito.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoNotaCredito.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoNotaCredito.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoNotaCredito.add(this.jPanelParametrosAuxiliar4EstadoNotaCredito, this.gridBagConstraintsEstadoNotaCredito);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsEstadoNotaCredito = new GridBagConstraints();
			this.gridBagConstraintsEstadoNotaCredito.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoNotaCredito.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoNotaCredito.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoNotaCredito.add(this.jComboBoxTiposReportesEstadoNotaCredito, this.gridBagConstraintsEstadoNotaCredito);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsEstadoNotaCredito = new GridBagConstraints();
			this.gridBagConstraintsEstadoNotaCredito.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoNotaCredito.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoNotaCredito.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEstadoNotaCredito.add(this.jCheckBoxGenerarReporteEstadoNotaCredito, this.gridBagConstraintsEstadoNotaCredito);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsEstadoNotaCredito = new GridBagConstraints();
			this.gridBagConstraintsEstadoNotaCredito.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoNotaCredito.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoNotaCredito.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoNotaCredito.add(this.jPanelParametrosAuxiliar2EstadoNotaCredito, this.gridBagConstraintsEstadoNotaCredito);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsEstadoNotaCredito = new GridBagConstraints();
			this.gridBagConstraintsEstadoNotaCredito.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoNotaCredito.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEstadoNotaCredito.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEstadoNotaCredito.add(this.jLabelAccionesEstadoNotaCredito, this.gridBagConstraintsEstadoNotaCredito);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsEstadoNotaCredito = new GridBagConstraints();
				this.gridBagConstraintsEstadoNotaCredito.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsEstadoNotaCredito.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsEstadoNotaCredito.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesEstadoNotaCredito.add(this.jButtonAbrirOrderByEstadoNotaCredito, this.gridBagConstraintsEstadoNotaCredito);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsEstadoNotaCredito = new GridBagConstraints();
			this.gridBagConstraintsEstadoNotaCredito.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsEstadoNotaCredito.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoNotaCredito.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstadoNotaCredito.add(this.jComboBoxTiposSeleccionarEstadoNotaCredito, this.gridBagConstraintsEstadoNotaCredito);			
			
			
			/*
			this.gridBagConstraintsEstadoNotaCredito = new GridBagConstraints();
			this.gridBagConstraintsEstadoNotaCredito.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoNotaCredito.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEstadoNotaCredito.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEstadoNotaCredito.add(this.jCheckBoxSeleccionarTodosEstadoNotaCredito, this.gridBagConstraintsEstadoNotaCredito);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsEstadoNotaCredito = new GridBagConstraints();
			this.gridBagConstraintsEstadoNotaCredito.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoNotaCredito.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoNotaCredito.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEstadoNotaCredito.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3EstadoNotaCredito.add(this.jCheckBoxSeleccionarTodosEstadoNotaCredito, this.gridBagConstraintsEstadoNotaCredito);															
				
			this.gridBagConstraintsEstadoNotaCredito = new GridBagConstraints();
			this.gridBagConstraintsEstadoNotaCredito.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoNotaCredito.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoNotaCredito.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEstadoNotaCredito.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3EstadoNotaCredito.add(this.jCheckBoxSeleccionadosEstadoNotaCredito, this.gridBagConstraintsEstadoNotaCredito);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsEstadoNotaCredito = new GridBagConstraints();
			this.gridBagConstraintsEstadoNotaCredito.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoNotaCredito.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoNotaCredito.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoNotaCredito.add(this.jPanelParametrosAuxiliar3EstadoNotaCredito, this.gridBagConstraintsEstadoNotaCredito);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsEstadoNotaCredito = new GridBagConstraints();
			this.gridBagConstraintsEstadoNotaCredito.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoNotaCredito.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstadoNotaCredito.add(this.jComboBoxTiposRelacionesEstadoNotaCredito, this.gridBagConstraintsEstadoNotaCredito);
				
			this.gridBagConstraintsEstadoNotaCredito = new GridBagConstraints();
			this.gridBagConstraintsEstadoNotaCredito.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoNotaCredito.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstadoNotaCredito.add(this.jComboBoxTiposAccionesEstadoNotaCredito, this.gridBagConstraintsEstadoNotaCredito);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosEstadoNotaCredito = new GridBagLayout();

			this.jScrollPanelDatosEstadoNotaCredito.setLayout(gridaBagLayoutDatosEstadoNotaCredito);
			
			this.gridBagConstraintsEstadoNotaCredito = new GridBagConstraints();
			this.gridBagConstraintsEstadoNotaCredito.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoNotaCredito.gridy = 0;
			this.gridBagConstraintsEstadoNotaCredito.gridx = 0;
			
			this.jScrollPanelDatosEstadoNotaCredito.add(this.jTableDatosEstadoNotaCredito, this.gridBagConstraintsEstadoNotaCredito);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosEstadoNotaCredito.setViewportView(this.jTableDatosEstadoNotaCredito);
		this.jTableDatosEstadoNotaCredito.setFillsViewportHeight(true);
		this.jTableDatosEstadoNotaCredito.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesEstadoNotaCredito= new GridBagLayout();
		this.jPanelAccionesEstadoNotaCredito.setLayout(gridaBagLayoutAccionesEstadoNotaCredito);
		
		
		/*	
		this.gridBagConstraintsEstadoNotaCredito = new GridBagConstraints();
		this.gridBagConstraintsEstadoNotaCredito.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoNotaCredito.gridy = 0;
		this.gridBagConstraintsEstadoNotaCredito.gridx = 0;
			
		this.jPanelAccionesEstadoNotaCredito.add(this.jButtonNuevoEstadoNotaCredito, this.gridBagConstraintsEstadoNotaCredito);
		*/
		int iPosXAccion=0;
		
						
		
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutEstadoNotaCredito = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutEstadoNotaCredito);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.estadonotacreditoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsEstadoNotaCredito = new GridBagConstraints();						
			this.gridBagConstraintsEstadoNotaCredito.gridy = iGridyPrincipal++;
			this.gridBagConstraintsEstadoNotaCredito.gridx = 0;		
			//this.gridBagConstraintsEstadoNotaCredito.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoNotaCredito.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsEstadoNotaCredito.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarEstadoNotaCredito, this.gridBagConstraintsEstadoNotaCredito);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsEstadoNotaCredito = new GridBagConstraints();
		this.gridBagConstraintsEstadoNotaCredito.gridy = iGridyPrincipal++;
		this.gridBagConstraintsEstadoNotaCredito.gridx = 0;		
		//this.gridBagConstraintsEstadoNotaCredito.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoNotaCredito.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsEstadoNotaCredito.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsEstadoNotaCredito);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsEstadoNotaCredito = new GridBagConstraints();
		this.gridBagConstraintsEstadoNotaCredito.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoNotaCredito.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesEstadoNotaCredito, this.gridBagConstraintsEstadoNotaCredito);								
		
		
		/*
		this.gridBagConstraintsEstadoNotaCredito = new GridBagConstraints();
		this.gridBagConstraintsEstadoNotaCredito.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoNotaCredito.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesEstadoNotaCredito, this.gridBagConstraintsEstadoNotaCredito);
		*/		
		
		this.gridBagConstraintsEstadoNotaCredito = new GridBagConstraints();
		this.gridBagConstraintsEstadoNotaCredito.gridy =iGridyPrincipal++;
		this.gridBagConstraintsEstadoNotaCredito.gridx =0;
		this.gridBagConstraintsEstadoNotaCredito.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsEstadoNotaCredito.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosEstadoNotaCredito, this.gridBagConstraintsEstadoNotaCredito);
				
		
		this.gridBagConstraintsEstadoNotaCredito = new GridBagConstraints();
		this.gridBagConstraintsEstadoNotaCredito.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoNotaCredito.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionEstadoNotaCredito, this.gridBagConstraintsEstadoNotaCredito);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(EstadoNotaCreditoJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosEstadoNotaCredito= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosEstadoNotaCredito = new GridBagLayout();
			this.jPanelBusquedasParametrosEstadoNotaCredito.setLayout(gridaBagLayoutBusquedasParametrosEstadoNotaCredito);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralEstadoNotaCredito=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralEstadoNotaCredito.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEstadoNotaCredito.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEstadoNotaCredito.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsEstadoNotaCredito = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsEstadoNotaCredito = new GridBagConstraints();
		this.gridBagConstraintsEstadoNotaCredito.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoNotaCredito.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposEstadoNotaCredito, this.gridBagConstraintsEstadoNotaCredito);
			
			
		this.gridBagConstraintsEstadoNotaCredito = new GridBagConstraints();
		this.gridBagConstraintsEstadoNotaCredito.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoNotaCredito.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosEstadoNotaCredito, this.gridBagConstraintsEstadoNotaCredito);
		
			
		this.gridBagConstraintsEstadoNotaCredito = new GridBagConstraints();
		this.gridBagConstraintsEstadoNotaCredito.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsEstadoNotaCredito.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesEstadoNotaCredito, this.gridBagConstraintsEstadoNotaCredito);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralEstadoNotaCredito;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoEstadoNotaCredito() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoEstadoNotaCredito = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoEstadoNotaCredito = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoEstadoNotaCredito.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoEstadoNotaCredito.setName("jPanelReporteDinamicoEstadoNotaCredito"); 
		
		this.jPanelReporteDinamicoEstadoNotaCredito.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoEstadoNotaCredito.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoEstadoNotaCredito.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoEstadoNotaCredito.setLayout(gridaBagLayoutReporteDinamicoEstadoNotaCredito);
		
		
		this.jInternalFrameReporteDinamicoEstadoNotaCredito= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoEstadoNotaCredito = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteEstadoNotaCredito= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoEstadoNotaCredito.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoEstadoNotaCredito.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoEstadoNotaCredito.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoEstadoNotaCredito.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoEstadoNotaCredito.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoEstadoNotaCredito.setResizable(true);
	    this.jInternalFrameReporteDinamicoEstadoNotaCredito.setClosable(true);
	    this.jInternalFrameReporteDinamicoEstadoNotaCredito.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoEstadoNotaCredito.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoEstadoNotaCredito.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoEstadoNotaCredito.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoEstadoNotaCredito.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Nota Creditos"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteEstadoNotaCredito = new JLabelMe();

		this.jLabelColumnasSelectReporteEstadoNotaCredito.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteEstadoNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteEstadoNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteEstadoNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsEstadoNotaCredito = new GridBagConstraints();
		this.gridBagConstraintsEstadoNotaCredito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoNotaCredito.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoNotaCredito.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoEstadoNotaCredito.add(this.jLabelColumnasSelectReporteEstadoNotaCredito, this.gridBagConstraintsEstadoNotaCredito);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteEstadoNotaCredito = new JList<Reporte>();
		this.jListColumnasSelectReporteEstadoNotaCredito.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteEstadoNotaCredito.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteEstadoNotaCredito.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteEstadoNotaCredito.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteEstadoNotaCredito.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteEstadoNotaCredito=new JScrollPane(this.jListColumnasSelectReporteEstadoNotaCredito);
			
			this.jScrollColumnasSelectReporteEstadoNotaCredito.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteEstadoNotaCredito.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteEstadoNotaCredito.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteEstadoNotaCredito.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsEstadoNotaCredito = new GridBagConstraints();
		this.gridBagConstraintsEstadoNotaCredito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoNotaCredito.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoNotaCredito.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoEstadoNotaCredito.add(this.jListColumnasSelectReporteEstadoNotaCredito, this.gridBagConstraintsEstadoNotaCredito);
		this.jPanelReporteDinamicoEstadoNotaCredito.add(this.jScrollColumnasSelectReporteEstadoNotaCredito, this.gridBagConstraintsEstadoNotaCredito);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteEstadoNotaCredito = new JLabelMe();

		this.jLabelRelacionesSelectReporteEstadoNotaCredito.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteEstadoNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteEstadoNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteEstadoNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsEstadoNotaCredito = new GridBagConstraints();
		this.gridBagConstraintsEstadoNotaCredito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoNotaCredito.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoNotaCredito.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoEstadoNotaCredito.add(this.jLabelRelacionesSelectReporteEstadoNotaCredito, this.gridBagConstraintsEstadoNotaCredito);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteEstadoNotaCredito = new JList<Reporte>();
		this.jListRelacionesSelectReporteEstadoNotaCredito.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteEstadoNotaCredito.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteEstadoNotaCredito.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteEstadoNotaCredito.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteEstadoNotaCredito.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteEstadoNotaCredito=new JScrollPane(this.jListRelacionesSelectReporteEstadoNotaCredito);
			
			this.jScrollRelacionesSelectReporteEstadoNotaCredito.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteEstadoNotaCredito.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteEstadoNotaCredito.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteEstadoNotaCredito.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsEstadoNotaCredito = new GridBagConstraints();
		this.gridBagConstraintsEstadoNotaCredito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoNotaCredito.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoNotaCredito.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoEstadoNotaCredito.add(this.jListRelacionesSelectReporteEstadoNotaCredito, this.gridBagConstraintsEstadoNotaCredito);
		this.jPanelReporteDinamicoEstadoNotaCredito.add(this.jScrollRelacionesSelectReporteEstadoNotaCredito, this.gridBagConstraintsEstadoNotaCredito);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoEstadoNotaCredito = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoEstadoNotaCredito = new JComboBoxMe();
		this.jListColumnasValoresGraficoEstadoNotaCredito = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoEstadoNotaCredito = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoEstadoNotaCredito.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoEstadoNotaCredito.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoEstadoNotaCredito.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoEstadoNotaCredito.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoEstadoNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoEstadoNotaCredito = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoEstadoNotaCredito.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoEstadoNotaCredito.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoEstadoNotaCredito.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoEstadoNotaCredito.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoEstadoNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoEstadoNotaCredito = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoEstadoNotaCredito.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoEstadoNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoEstadoNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoEstadoNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsEstadoNotaCredito = new GridBagConstraints();
		this.gridBagConstraintsEstadoNotaCredito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoNotaCredito.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoNotaCredito.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEstadoNotaCredito.add(this.jLabelGenerarExcelReporteDinamicoEstadoNotaCredito, this.gridBagConstraintsEstadoNotaCredito);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoEstadoNotaCredito = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoEstadoNotaCredito.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoEstadoNotaCredito,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoEstadoNotaCredito.setToolTipText("Generar EXCEL"+" "+EstadoNotaCreditoConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsEstadoNotaCredito = new GridBagConstraints();
		//this.gridBagConstraintsEstadoNotaCredito.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsEstadoNotaCredito.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsEstadoNotaCredito.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoEstadoNotaCredito.add(this.jButtonGenerarExcelReporteDinamicoEstadoNotaCredito, this.gridBagConstraintsEstadoNotaCredito);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsEstadoNotaCredito = new GridBagConstraints();
		this.gridBagConstraintsEstadoNotaCredito.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoNotaCredito.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEstadoNotaCredito.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEstadoNotaCredito.add(this.jComboBoxTiposReportesDinamicoEstadoNotaCredito, this.gridBagConstraintsEstadoNotaCredito);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoEstadoNotaCredito = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoEstadoNotaCredito.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoEstadoNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoEstadoNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoEstadoNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsEstadoNotaCredito = new GridBagConstraints();
		this.gridBagConstraintsEstadoNotaCredito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoNotaCredito.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoNotaCredito.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEstadoNotaCredito.add(this.jLabelTiposArchivoReporteDinamicoEstadoNotaCredito, this.gridBagConstraintsEstadoNotaCredito);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsEstadoNotaCredito = new GridBagConstraints();
		this.gridBagConstraintsEstadoNotaCredito.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoNotaCredito.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEstadoNotaCredito.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEstadoNotaCredito.add(this.jComboBoxTiposArchivosReportesDinamicoEstadoNotaCredito, this.gridBagConstraintsEstadoNotaCredito);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoEstadoNotaCredito = new JButtonMe();
		this.jButtonGenerarReporteDinamicoEstadoNotaCredito.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoEstadoNotaCredito,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoEstadoNotaCredito.setToolTipText("Generar"+" "+EstadoNotaCreditoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsEstadoNotaCredito = new GridBagConstraints();
		this.gridBagConstraintsEstadoNotaCredito.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoNotaCredito.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEstadoNotaCredito.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEstadoNotaCredito.add(this.jButtonGenerarReporteDinamicoEstadoNotaCredito, this.gridBagConstraintsEstadoNotaCredito);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoEstadoNotaCredito = new JButtonMe();
		this.jButtonCerrarReporteDinamicoEstadoNotaCredito.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoEstadoNotaCredito,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoEstadoNotaCredito.setToolTipText("Cancelar"+" "+EstadoNotaCreditoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsEstadoNotaCredito = new GridBagConstraints();
		this.gridBagConstraintsEstadoNotaCredito.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoNotaCredito.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEstadoNotaCredito.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEstadoNotaCredito.add(this.jButtonCerrarReporteDinamicoEstadoNotaCredito, this.gridBagConstraintsEstadoNotaCredito);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalEstadoNotaCredito = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoEstadoNotaCredito= new JScrollPane(jPanelReporteDinamicoEstadoNotaCredito,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoEstadoNotaCredito.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoEstadoNotaCredito.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoEstadoNotaCredito.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoEstadoNotaCredito.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Nota Creditos"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsEstadoNotaCredito = new GridBagConstraints();
		this.gridBagConstraintsEstadoNotaCredito.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsEstadoNotaCredito.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsEstadoNotaCredito.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoEstadoNotaCredito.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoEstadoNotaCredito.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalEstadoNotaCredito);
		this.jInternalFrameReporteDinamicoEstadoNotaCredito.getContentPane().add(this.jScrollPanelReporteDinamicoEstadoNotaCredito, this.gridBagConstraintsEstadoNotaCredito);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionEstadoNotaCredito() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionEstadoNotaCredito = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionEstadoNotaCredito = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionEstadoNotaCredito.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionEstadoNotaCredito.setName("jPanelImportacionEstadoNotaCredito"); 
		
		this.jPanelImportacionEstadoNotaCredito.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionEstadoNotaCredito.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionEstadoNotaCredito.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionEstadoNotaCredito.setLayout(gridaBagLayoutImportacionEstadoNotaCredito);
		
		
		this.jInternalFrameImportacionEstadoNotaCredito= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionEstadoNotaCredito= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionEstadoNotaCredito = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteEstadoNotaCredito= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionEstadoNotaCredito.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionEstadoNotaCredito.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionEstadoNotaCredito.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionEstadoNotaCredito.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionEstadoNotaCredito.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionEstadoNotaCredito.setResizable(true);
	    this.jInternalFrameImportacionEstadoNotaCredito.setClosable(true);
	    this.jInternalFrameImportacionEstadoNotaCredito.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionEstadoNotaCredito.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionEstadoNotaCredito.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionEstadoNotaCredito.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionEstadoNotaCredito.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionEstadoNotaCredito.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionEstadoNotaCredito.setResizable(true);
	    this.jInternalFrameImportacionEstadoNotaCredito.setClosable(true);
	    this.jInternalFrameImportacionEstadoNotaCredito.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionEstadoNotaCredito.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionEstadoNotaCredito.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionEstadoNotaCredito.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionEstadoNotaCredito.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Nota Creditos"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionEstadoNotaCredito = new JLabelMe();

		this.jLabelArchivoImportacionEstadoNotaCredito.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionEstadoNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionEstadoNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionEstadoNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsEstadoNotaCredito = new GridBagConstraints();
		this.gridBagConstraintsEstadoNotaCredito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoNotaCredito.gridy = iPosYImportacion;		
		this.gridBagConstraintsEstadoNotaCredito.gridx = iPosXImportacion++;
			
		this.jPanelImportacionEstadoNotaCredito.add(this.jLabelArchivoImportacionEstadoNotaCredito, this.gridBagConstraintsEstadoNotaCredito);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionEstadoNotaCredito = new JFileChooser();		
		this.jFileChooserImportacionEstadoNotaCredito.setToolTipText("ESCOGER ARCHIVO"+" "+EstadoNotaCreditoConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionEstadoNotaCredito = new JButtonMe();
		this.jButtonAbrirImportacionEstadoNotaCredito.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionEstadoNotaCredito,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionEstadoNotaCredito.setToolTipText("Generar"+" "+EstadoNotaCreditoConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsEstadoNotaCredito = new GridBagConstraints();
		this.gridBagConstraintsEstadoNotaCredito.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoNotaCredito.gridy = iPosYImportacion;
		this.gridBagConstraintsEstadoNotaCredito.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEstadoNotaCredito.add(this.jButtonAbrirImportacionEstadoNotaCredito, this.gridBagConstraintsEstadoNotaCredito);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionEstadoNotaCredito = new JLabelMe();

		this.jLabelPathArchivoImportacionEstadoNotaCredito.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionEstadoNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionEstadoNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionEstadoNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsEstadoNotaCredito = new GridBagConstraints();
		this.gridBagConstraintsEstadoNotaCredito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoNotaCredito.gridy = iPosYImportacion;		
		this.gridBagConstraintsEstadoNotaCredito.gridx = iPosXImportacion++;
			
		this.jPanelImportacionEstadoNotaCredito.add(this.jLabelPathArchivoImportacionEstadoNotaCredito, this.gridBagConstraintsEstadoNotaCredito);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionEstadoNotaCredito=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionEstadoNotaCredito.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionEstadoNotaCredito.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionEstadoNotaCredito.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsEstadoNotaCredito = new GridBagConstraints();
		this.gridBagConstraintsEstadoNotaCredito.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoNotaCredito.gridy = iPosYImportacion;
		this.gridBagConstraintsEstadoNotaCredito.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEstadoNotaCredito.add(this.jTextFieldPathArchivoImportacionEstadoNotaCredito, this.gridBagConstraintsEstadoNotaCredito);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionEstadoNotaCredito = new JButtonMe();
		this.jButtonGenerarImportacionEstadoNotaCredito.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionEstadoNotaCredito,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionEstadoNotaCredito.setToolTipText("Generar"+" "+EstadoNotaCreditoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsEstadoNotaCredito = new GridBagConstraints();
		this.gridBagConstraintsEstadoNotaCredito.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoNotaCredito.gridy = iPosYImportacion;
		this.gridBagConstraintsEstadoNotaCredito.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEstadoNotaCredito.add(this.jButtonGenerarImportacionEstadoNotaCredito, this.gridBagConstraintsEstadoNotaCredito);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionEstadoNotaCredito = new JButtonMe();
		this.jButtonCerrarImportacionEstadoNotaCredito.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionEstadoNotaCredito,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionEstadoNotaCredito.setToolTipText("Cancelar"+" "+EstadoNotaCreditoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsEstadoNotaCredito = new GridBagConstraints();
		this.gridBagConstraintsEstadoNotaCredito.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoNotaCredito.gridy = iPosYImportacion;
		this.gridBagConstraintsEstadoNotaCredito.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEstadoNotaCredito.add(this.jButtonCerrarImportacionEstadoNotaCredito, this.gridBagConstraintsEstadoNotaCredito);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalEstadoNotaCredito = new GridBagLayout();
		
		this.jScrollPanelImportacionEstadoNotaCredito= new JScrollPane(jPanelImportacionEstadoNotaCredito,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsEstadoNotaCredito = new GridBagConstraints();
		this.gridBagConstraintsEstadoNotaCredito.gridy =iPosYImportacion;
		this.gridBagConstraintsEstadoNotaCredito.gridx =iPosXImportacion;
		this.gridBagConstraintsEstadoNotaCredito.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionEstadoNotaCredito.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionEstadoNotaCredito.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalEstadoNotaCredito);
		this.jInternalFrameImportacionEstadoNotaCredito.getContentPane().add(this.jScrollPanelImportacionEstadoNotaCredito, this.gridBagConstraintsEstadoNotaCredito);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByEstadoNotaCredito(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByEstadoNotaCredito = new JButtonMe();
			this.jButtonAbrirOrderByEstadoNotaCredito.setText("Orden");
			this.jButtonAbrirOrderByEstadoNotaCredito.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByEstadoNotaCredito,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByEstadoNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByEstadoNotaCredito";
			inputMap = this.jButtonAbrirOrderByEstadoNotaCredito.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByEstadoNotaCredito.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByEstadoNotaCredito"));
		
		
			GridBagLayout gridaBagLayoutOrderByEstadoNotaCredito = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByEstadoNotaCredito = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByEstadoNotaCredito.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByEstadoNotaCredito.setName("jPanelOrderByEstadoNotaCredito"); 
			
			this.jPanelOrderByEstadoNotaCredito.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByEstadoNotaCredito.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByEstadoNotaCredito.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByEstadoNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByEstadoNotaCredito.setLayout(gridaBagLayoutOrderByEstadoNotaCredito);
			
			
			this.jTableDatosEstadoNotaCreditoOrderBy = new JTableMe();        
			this.jTableDatosEstadoNotaCreditoOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosEstadoNotaCreditoOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosEstadoNotaCreditoOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosEstadoNotaCreditoOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosEstadoNotaCreditoOrderBy.setViewportView(this.jTableDatosEstadoNotaCreditoOrderBy);
			this.jTableDatosEstadoNotaCreditoOrderBy.setFillsViewportHeight(true);
			this.jTableDatosEstadoNotaCreditoOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByEstadoNotaCredito= new OrderByJInternalFrame();
			this.jInternalFrameOrderByEstadoNotaCredito= new OrderByJInternalFrame();
			this.jScrollPanelOrderByEstadoNotaCredito = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteEstadoNotaCredito= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByEstadoNotaCredito.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByEstadoNotaCredito.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByEstadoNotaCredito.setTitle("Orden");
			this.jInternalFrameOrderByEstadoNotaCredito.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByEstadoNotaCredito.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByEstadoNotaCredito.setResizable(true);
			this.jInternalFrameOrderByEstadoNotaCredito.setClosable(true);
			this.jInternalFrameOrderByEstadoNotaCredito.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByEstadoNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByEstadoNotaCredito.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByEstadoNotaCredito.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByEstadoNotaCredito.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByEstadoNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByEstadoNotaCredito.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Nota Creditos"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsEstadoNotaCredito = new GridBagConstraints();
			this.gridBagConstraintsEstadoNotaCredito.gridy =iPosYOrderBy++;
			this.gridBagConstraintsEstadoNotaCredito.gridx =iPosXOrderBy;
			this.gridBagConstraintsEstadoNotaCredito.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsEstadoNotaCredito.ipady =150;
				
			this.jPanelOrderByEstadoNotaCredito.add(jScrollPanelDatosEstadoNotaCreditoOrderBy, this.gridBagConstraintsEstadoNotaCredito);//this.jTableDatosEstadoNotaCreditoTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByEstadoNotaCredito = new JButtonMe();
			this.jButtonCerrarOrderByEstadoNotaCredito.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByEstadoNotaCredito,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByEstadoNotaCredito.setToolTipText("Cancelar"+" "+EstadoNotaCreditoConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByEstadoNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsEstadoNotaCredito = new GridBagConstraints();
			this.gridBagConstraintsEstadoNotaCredito.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoNotaCredito.gridy = iPosYOrderBy++;
			this.gridBagConstraintsEstadoNotaCredito.gridx = iPosXOrderBy;
									
			this.jPanelOrderByEstadoNotaCredito.add(this.jButtonCerrarOrderByEstadoNotaCredito, this.gridBagConstraintsEstadoNotaCredito);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalEstadoNotaCredito = new GridBagLayout();
			
			this.jScrollPanelOrderByEstadoNotaCredito= new JScrollPane(jPanelOrderByEstadoNotaCredito,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsEstadoNotaCredito = new GridBagConstraints();
			this.gridBagConstraintsEstadoNotaCredito.gridy =iPosYOrderBy;
			this.gridBagConstraintsEstadoNotaCredito.gridx =iPosXOrderBy;
			this.gridBagConstraintsEstadoNotaCredito.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByEstadoNotaCredito.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByEstadoNotaCredito.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalEstadoNotaCredito);
			
			this.jInternalFrameOrderByEstadoNotaCredito.getContentPane().add(this.jScrollPanelOrderByEstadoNotaCredito, this.gridBagConstraintsEstadoNotaCredito);			
		
		} else {
			this.jButtonAbrirOrderByEstadoNotaCredito = new JButtonMe();
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
		int iWidthTableCalculado=0;//930
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=430;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=300;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=200;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.estadonotacreditoSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosEstadoNotaCredito.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosEstadoNotaCredito.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosEstadoNotaCredito.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosEstadoNotaCredito.getRowHeight();//EstadoNotaCreditoConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.estadonotacreditoSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > EstadoNotaCreditoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaEstadoNotaCredito.isSelected()) {
					iHeightTable=EstadoNotaCreditoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < EstadoNotaCreditoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=EstadoNotaCreditoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > EstadoNotaCreditoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaEstadoNotaCredito.isSelected()) {
					iHeightTable=EstadoNotaCreditoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < EstadoNotaCreditoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=EstadoNotaCreditoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosEstadoNotaCredito.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosEstadoNotaCredito.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosEstadoNotaCredito.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosEstadoNotaCredito.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosEstadoNotaCredito.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosEstadoNotaCredito.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByEstadoNotaCredito!=null && this.jInternalFrameOrderByEstadoNotaCredito.getjTableDatosOrderBy()!=null) {
			//if(!this.estadonotacreditoSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByEstadoNotaCredito.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByEstadoNotaCredito.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByEstadoNotaCredito.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByEstadoNotaCredito.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByEstadoNotaCredito.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByEstadoNotaCredito.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByEstadoNotaCredito.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosEstadoNotaCredito.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosEstadoNotaCredito.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosEstadoNotaCredito.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=estadonotacreditoLogic.getEstadoNotaCreditos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=estadonotacreditos.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<EstadoNotaCredito> TraerEstadoNotaCreditoBeans(List<EstadoNotaCredito> estadonotacreditos,ArrayList<Classe> classes)throws Exception {
		try {
			for(EstadoNotaCredito estadonotacredito:estadonotacreditos) {
					
				if(!(EstadoNotaCreditoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || EstadoNotaCreditoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					estadonotacredito.setsDetalleGeneralEntityReporte(EstadoNotaCreditoConstantesFunciones.getEstadoNotaCreditoDescripcion(estadonotacredito));
										
						
					
					

					if(estadonotacredito.getNotaCreditoSoliSolis()!=null && Funciones.existeClass(classes,NotaCreditoSoli.class)) {
						try{estadonotacredito.setnotacreditosoliSolisDescripcionReporte(new JRBeanCollectionDataSource(NotaCreditoSoliJInternalFrame.TraerNotaCreditoSoliBeans(estadonotacredito.getNotaCreditoSoliSolis(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(estadonotacredito.getNotaCreditoPuntoVentaPuntoVentas()!=null && Funciones.existeClass(classes,NotaCreditoPuntoVenta.class)) {
						try{estadonotacredito.setnotacreditopuntoventaPuntoVentasDescripcionReporte(new JRBeanCollectionDataSource(NotaCreditoPuntoVentaJInternalFrame.TraerNotaCreditoPuntoVentaBeans(estadonotacredito.getNotaCreditoPuntoVentaPuntoVentas(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//estadonotacredito.setsDetalleGeneralEntityReporte(estadonotacredito.getsDetalleGeneralEntityReporte());
										
				}
				
				//estadonotacreditobeans.add(estadonotacreditobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return estadonotacreditos;
    }
	//PARA REPORTES FIN
}
