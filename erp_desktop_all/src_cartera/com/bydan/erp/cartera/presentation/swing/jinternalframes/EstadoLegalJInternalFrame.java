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
package com.bydan.erp.cartera.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.sris.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.*;
import com.bydan.erp.importaciones.presentation.swing.jinternalframes.*;
import com.bydan.erp.produccion.presentation.swing.jinternalframes.*;

import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.sris.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.importaciones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.produccion.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.comisiones.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.sris.business.entity.*;
import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.puntoventa.business.entity.*;
import com.bydan.erp.activosfijos.business.entity.*;
import com.bydan.erp.importaciones.business.entity.*;
import com.bydan.erp.produccion.business.entity.*;

//import com.bydan.erp.cartera.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.cartera.util.EstadoLegalConstantesFunciones;

import com.bydan.erp.cartera.business.logic.*;
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
public class EstadoLegalJInternalFrame extends EstadoLegalBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarEstadoLegal;
	
	protected JMenuBar jmenuBarEstadoLegal;
	
	protected JMenu jmenuEstadoLegal;
	protected JMenu jmenuDatosEstadoLegal;
	protected JMenu jmenuArchivoEstadoLegal;
	protected JMenu jmenuAccionesEstadoLegal;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosEstadoLegal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutEstadoLegal;	
	protected GridBagConstraints gridBagConstraintsEstadoLegal;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public EstadoLegalDetalleFormJInternalFrame jInternalFrameDetalleFormEstadoLegal;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoEstadoLegal;	
	protected ImportacionJInternalFrame jInternalFrameImportacionEstadoLegal;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public EstadoLegalSessionBean estadolegalSessionBean;
		
	
	
	
	//protected JDesktopPane jDesktopPane;
	public List<EstadoLegal> estadolegals;		
	public List<EstadoLegal> estadolegalsEliminados;	
	public List<EstadoLegal> estadolegalsAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByEstadoLegal;		
	protected JButton jButtonAbrirOrderByEstadoLegal;
	
	
	//protected JPanel jPanelOrderByEstadoLegal;
	//public JScrollPane jScrollPanelOrderByEstadoLegal;	
	//protected JButton jButtonCerrarOrderByEstadoLegal;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public EstadoLegalLogic estadolegalLogic;
	
	
	
	public JScrollPane jScrollPanelDatosEstadoLegal;
	public JScrollPane jScrollPanelDatosEdicionEstadoLegal;
	public JScrollPane jScrollPanelDatosGeneralEstadoLegal;
    
	
	
	//public JScrollPane jScrollPanelDatosEstadoLegalOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoEstadoLegal;
	//public JScrollPane jScrollPanelImportacionEstadoLegal;
	
	
	
	protected JPanel jPanelAccionesEstadoLegal;
	
    protected JPanel jPanelPaginacionEstadoLegal;
    protected JPanel jPanelParametrosReportesEstadoLegal;
	protected JPanel jPanelParametrosReportesAccionesEstadoLegal;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1EstadoLegal;
	protected JPanel jPanelParametrosAuxiliar2EstadoLegal;
	protected JPanel jPanelParametrosAuxiliar3EstadoLegal;
	protected JPanel jPanelParametrosAuxiliar4EstadoLegal;
	//protected JPanel jPanelParametrosAuxiliar5EstadoLegal;
	
	
	
	//protected JPanel jPanelReporteDinamicoEstadoLegal;
	//protected JPanel jPanelImportacionEstadoLegal;
	
	
	public JTable jTableDatosEstadoLegal;
	
	
	
	//public JTable jTableDatosEstadoLegalOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoEstadoLegal;
	protected JButton jButtonDuplicarEstadoLegal;
	protected JButton jButtonCopiarEstadoLegal;
	protected JButton jButtonVerFormEstadoLegal;
	protected JButton jButtonNuevoRelacionesEstadoLegal;
	protected JButton jButtonModificarEstadoLegal;
	
    protected JButton jButtonGuardarCambiosTablaEstadoLegal;
	protected JButton jButtonCerrarEstadoLegal;
	
	
	protected JButton jButtonRecargarInformacionEstadoLegal;
	protected JButton jButtonProcesarInformacionEstadoLegal;
	
	
	protected JButton jButtonAnterioresEstadoLegal;
	protected JButton jButtonSiguientesEstadoLegal;
	protected JButton jButtonNuevoGuardarCambiosEstadoLegal;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoEstadoLegal;
	//protected JButton jButtonCerrarReporteDinamicoEstadoLegal;
	//protected JButton jButtonGenerarExcelReporteDinamicoEstadoLegal;	
	
	
	
	//protected JButton jButtonAbrirImportacionEstadoLegal;
	//protected JButton jButtonGenerarImportacionEstadoLegal;
	//protected JButton jButtonCerrarImportacionEstadoLegal;
	//protected JFileChooser jFileChooserImportacionEstadoLegal;
	//protected File fileImportacionEstadoLegal;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarEstadoLegal;
	protected JButton jButtonDuplicarToolBarEstadoLegal;
	protected JButton jButtonNuevoRelacionesToolBarEstadoLegal;
	
	
	public JButton jButtonGuardarCambiosToolBarEstadoLegal;
	protected JButton jButtonCopiarToolBarEstadoLegal;
	protected JButton jButtonVerFormToolBarEstadoLegal;
	public JButton jButtonGuardarCambiosTablaToolBarEstadoLegal;
	protected JButton jButtonMostrarOcultarTablaToolBarEstadoLegal;
	protected JButton jButtonCerrarToolBarEstadoLegal;
	
	protected JButton jButtonRecargarInformacionToolBarEstadoLegal;
	protected JButton jButtonProcesarInformacionToolBarEstadoLegal;
	protected JButton jButtonAnterioresToolBarEstadoLegal;
	protected JButton jButtonSiguientesToolBarEstadoLegal;
	protected JButton jButtonNuevoGuardarCambiosToolBarEstadoLegal;
	protected JButton jButtonAbrirOrderByToolBarEstadoLegal;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoEstadoLegal;
	protected JMenuItem jMenuItemDuplicarEstadoLegal;
	protected JMenuItem jMenuItemNuevoRelacionesEstadoLegal;
	
	
	protected JMenuItem jMenuItemGuardarCambiosEstadoLegal;
	protected JMenuItem jMenuItemCopiarEstadoLegal;
	protected JMenuItem jMenuItemVerFormEstadoLegal;
	protected JMenuItem jMenuItemGuardarCambiosTablaEstadoLegal;
	protected JMenuItem jMenuItemCerrarEstadoLegal;
	protected JMenuItem jMenuItemDetalleCerrarEstadoLegal;
	protected JMenuItem jMenuItemDetalleAbrirOrderByEstadoLegal;
	protected JMenuItem jMenuItemDetalleMostarOcultarEstadoLegal;
	
	protected JMenuItem jMenuItemRecargarInformacionEstadoLegal;
	protected JMenuItem jMenuItemProcesarInformacionEstadoLegal;
	protected JMenuItem jMenuItemAnterioresEstadoLegal;
	protected JMenuItem jMenuItemSiguientesEstadoLegal;
	protected JMenuItem jMenuItemNuevoGuardarCambiosEstadoLegal;
	protected JMenuItem jMenuItemAbrirOrderByEstadoLegal;
	protected JMenuItem jMenuItemMostrarOcultarEstadoLegal;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesEstadoLegal;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosEstadoLegal;
	protected JCheckBox jCheckBoxSeleccionadosEstadoLegal;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaEstadoLegal;
	protected JCheckBox jCheckBoxConGraficoReporteEstadoLegal;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesEstadoLegal;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesEstadoLegal;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoEstadoLegal;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoEstadoLegal;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesEstadoLegal;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionEstadoLegal;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesEstadoLegal;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesEstadoLegal;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarEstadoLegal;
	protected JTextField jTextFieldValorCampoGeneralEstadoLegal;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteEstadoLegal;
	//public JList<Reporte> jListColumnasSelectReporteEstadoLegal;
	//public JScrollPane jScrollColumnasSelectReporteEstadoLegal;
	
	//public JLabel jLabelRelacionesSelectReporteEstadoLegal;
	//public JList<Reporte> jListRelacionesSelectReporteEstadoLegal;
	//public JScrollPane jScrollRelacionesSelectReporteEstadoLegal;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoEstadoLegal;
	//protected JCheckBox jCheckBoxConGraficoDinamicoEstadoLegal;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoEstadoLegal;
	//public JLabel jLabelTiposArchivoReporteDinamicoEstadoLegal;
	
		
	//public JLabel jLabelArchivoImportacionEstadoLegal;	
	//public JLabel jLabelPathArchivoImportacionEstadoLegal;
	//protected JTextField jTextFieldPathArchivoImportacionEstadoLegal;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoEstadoLegal;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoEstadoLegal;
	
	//public JLabel jLabelColumnaCategoriaValorEstadoLegal;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorEstadoLegal;
	
	//public JLabel jLabelColumnasValoresGraficoEstadoLegal;
	//public JList<Reporte> jListColumnasValoresGraficoEstadoLegal;
	//public JScrollPane jScrollColumnasValoresGraficoEstadoLegal;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoEstadoLegal;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoEstadoLegal;	
	
	
	
	
	
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
	public EstadoLegalJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("EstadoLegal No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoLegalJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EstadoLegal No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoLegalJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EstadoLegal No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoLegalJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("EstadoLegal No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionEstadoLegal)	{
		this.jButtonRecargarInformacionEstadoLegal = jButtonRecargarInformacionEstadoLegal;
	}
	
	public JButton getjButtonProcesarInformacionEstadoLegal() {
		return this.jButtonProcesarInformacionEstadoLegal;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionEstadoLegal)	{
		this.jButtonProcesarInformacionEstadoLegal = jButtonProcesarInformacionEstadoLegal;
	}
	
	
	public JButton getjButtonRecargarInformacionEstadoLegal() {
		return this.jButtonRecargarInformacionEstadoLegal;
	}
	
	
	public List<EstadoLegal> getestadolegals() {
		return this.estadolegals;
	}

	public void setestadolegals(List<EstadoLegal> estadolegals) {
		this.estadolegals = estadolegals;
	}
	
	public List<EstadoLegal> getestadolegalsAux() {
		return this.estadolegalsAux;
	}

	public void setestadolegalsAux(List<EstadoLegal> estadolegalsAux) {
		this.estadolegalsAux = estadolegalsAux;
	}
	
	public List<EstadoLegal> getestadolegalsEliminados() {
		return this.estadolegalsEliminados;
	}

	public void setEstadoLegalsEliminados(List<EstadoLegal> estadolegalsEliminados) {
		this.estadolegalsEliminados = estadolegalsEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarEstadoLegal() {
		return jComboBoxTiposSeleccionarEstadoLegal;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarEstadoLegal(
			JComboBox jComboBoxTiposSeleccionarEstadoLegal) {
		this.jComboBoxTiposSeleccionarEstadoLegal = jComboBoxTiposSeleccionarEstadoLegal;
	}
	
	public void setBorderResaltarTiposSeleccionarEstadoLegal() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarEstadoLegal.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarEstadoLegal .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralEstadoLegal() {
		return jTextFieldValorCampoGeneralEstadoLegal;
	}

	public void setjTextFieldValorCampoGeneralEstadoLegal(
			JTextField jTextFieldValorCampoGeneralEstadoLegal) {
		this.jTextFieldValorCampoGeneralEstadoLegal = jTextFieldValorCampoGeneralEstadoLegal;
	}

	public void setBorderResaltarValorCampoGeneralEstadoLegal() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoLegal.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralEstadoLegal .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosEstadoLegal() {
		return this.jCheckBoxSeleccionarTodosEstadoLegal;
	}

	public void setjCheckBoxSeleccionarTodosEstadoLegal(
			JCheckBox jCheckBoxSeleccionarTodosEstadoLegal) {
		this.jCheckBoxSeleccionarTodosEstadoLegal = jCheckBoxSeleccionarTodosEstadoLegal;
	}

	public void setBorderResaltarSeleccionarTodosEstadoLegal() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoLegal.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosEstadoLegal .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosEstadoLegal() {
		return this.jCheckBoxSeleccionadosEstadoLegal;
	}

	public void setjCheckBoxSeleccionadosEstadoLegal(
			JCheckBox jCheckBoxSeleccionadosEstadoLegal) {
		this.jCheckBoxSeleccionadosEstadoLegal = jCheckBoxSeleccionadosEstadoLegal;
	}
	
	public void setBorderResaltarSeleccionadosEstadoLegal() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoLegal.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosEstadoLegal .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesEstadoLegal() {
		return this.jComboBoxTiposArchivosReportesEstadoLegal;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesEstadoLegal(
			JComboBox jComboBoxTiposArchivosReportesEstadoLegal) {
		this.jComboBoxTiposArchivosReportesEstadoLegal = jComboBoxTiposArchivosReportesEstadoLegal;
	}

	public void setBorderResaltarTiposArchivosReportesEstadoLegal() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoLegal.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesEstadoLegal .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesEstadoLegal() {
		return this.jComboBoxTiposReportesEstadoLegal;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesEstadoLegal(
			JComboBox jComboBoxTiposReportesEstadoLegal) {
		this.jComboBoxTiposReportesEstadoLegal = jComboBoxTiposReportesEstadoLegal;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoEstadoLegal() {
	//	return jComboBoxTiposReportesDinamicoEstadoLegal;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoEstadoLegal(
	//		JComboBox jComboBoxTiposReportesDinamicoEstadoLegal) {
	//	this.jComboBoxTiposReportesDinamicoEstadoLegal = jComboBoxTiposReportesDinamicoEstadoLegal;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoEstadoLegal() {
	//	return jComboBoxTiposArchivosReportesDinamicoEstadoLegal;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoEstadoLegal(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoEstadoLegal) {
	//	this.jComboBoxTiposArchivosReportesDinamicoEstadoLegal = jComboBoxTiposArchivosReportesDinamicoEstadoLegal;
	//}
	
	public void setBorderResaltarTiposReportesEstadoLegal() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoLegal.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesEstadoLegal .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesEstadoLegal() {
		return this.jComboBoxTiposGraficosReportesEstadoLegal;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesEstadoLegal(
			JComboBox jComboBoxTiposGraficosReportesEstadoLegal) {
		this.jComboBoxTiposGraficosReportesEstadoLegal = jComboBoxTiposGraficosReportesEstadoLegal;
	}
	
	public void setBorderResaltarTiposGraficosReportesEstadoLegal() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoLegal.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesEstadoLegal .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionEstadoLegal() {
		return this.jComboBoxTiposPaginacionEstadoLegal;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionEstadoLegal(
			JComboBox jComboBoxTiposPaginacionEstadoLegal) {
		this.jComboBoxTiposPaginacionEstadoLegal = jComboBoxTiposPaginacionEstadoLegal;
	}
	
	public void setBorderResaltarTiposPaginacionEstadoLegal() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoLegal.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionEstadoLegal .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesEstadoLegal() {
		return this.jComboBoxTiposRelacionesEstadoLegal;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesEstadoLegal() {
		return this.jComboBoxTiposAccionesEstadoLegal;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesEstadoLegal(
			JComboBox jComboBoxTiposRelacionesEstadoLegal) {
		this.jComboBoxTiposRelacionesEstadoLegal = jComboBoxTiposRelacionesEstadoLegal;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesEstadoLegal(
			JComboBox jComboBoxTiposAccionesEstadoLegal) {
		this.jComboBoxTiposAccionesEstadoLegal = jComboBoxTiposAccionesEstadoLegal;
	}
	
	public void setBorderResaltarTiposRelacionesEstadoLegal() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoLegal.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesEstadoLegal .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesEstadoLegal() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoLegal.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesEstadoLegal .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoEstadoLegal() {
	//	return jCheckBoxConGraficoDinamicoEstadoLegal;
	//}

	//public void setjCheckBoxConGraficoDinamicoEstadoLegal(
	//		JCheckBox jCheckBoxConGraficoDinamicoEstadoLegal) {
	//	this.jCheckBoxConGraficoDinamicoEstadoLegal = jCheckBoxConGraficoDinamicoEstadoLegal;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoEstadoLegal() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarEstadoLegal.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoEstadoLegal .setBorder(borderResaltar);		
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
		this.estadolegalSessionBean=new EstadoLegalSessionBean();
		
		this.estadolegalSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.estadolegalSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.estadolegalSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=EstadoLegalJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=EstadoLegalJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		EstadoLegalJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		EstadoLegalJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		EstadoLegalJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Estado Legal MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 910) {
			iHeight=910;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.estadolegalSessionBean.getEsGuardarRelacionado()) {
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
		
		EstadoLegalJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("EstadoLegal No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarEstadoLegal= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarEstadoLegal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarEstadoLegal,this.jTtoolBarEstadoLegal,
							"nuevo","nuevo","Nuevo"+" "+EstadoLegalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarEstadoLegal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarEstadoLegal,this.jTtoolBarEstadoLegal,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarEstadoLegal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarEstadoLegal,this.jTtoolBarEstadoLegal,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+EstadoLegalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarEstadoLegal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarEstadoLegal,this.jTtoolBarEstadoLegal,
							"duplicar","duplicar","Duplicar"+" "+EstadoLegalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarEstadoLegal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarEstadoLegal,this.jTtoolBarEstadoLegal,
							"copiar","copiar","Copiar"+" "+EstadoLegalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarEstadoLegal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarEstadoLegal,this.jTtoolBarEstadoLegal,
							"ver_form","ver_form","Ver"+" "+EstadoLegalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarEstadoLegal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEstadoLegal,this.jTtoolBarEstadoLegal,
							"recargar","recargar","Recargar"+" "+EstadoLegalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarEstadoLegal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEstadoLegal,this.jTtoolBarEstadoLegal,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarEstadoLegal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEstadoLegal,this.jTtoolBarEstadoLegal,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarEstadoLegal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarEstadoLegal,this.jTtoolBarEstadoLegal,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarEstadoLegal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarEstadoLegal,this.jTtoolBarEstadoLegal,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarEstadoLegal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarEstadoLegal,this.jTtoolBarEstadoLegal,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+EstadoLegalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarEstadoLegal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarEstadoLegal,this.jTtoolBarEstadoLegal,
							"cerrar","cerrar","Salir"+" "+EstadoLegalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarEstadoLegal=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarEstadoLegal;
			
				this.jButtonProcesarInformacionToolBarEstadoLegal=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarEstadoLegal;
				
		//protected JButton jButtonModificarToolBarEstadoLegal;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarEstadoLegal=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuEstadoLegal=new JMenuMe("General");
		this.jmenuArchivoEstadoLegal=new JMenuMe("Archivo");
		this.jmenuAccionesEstadoLegal=new JMenuMe("Acciones");
		this.jmenuDatosEstadoLegal=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoEstadoLegal= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoEstadoLegal.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoEstadoLegal,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoEstadoLegal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarEstadoLegal= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarEstadoLegal.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarEstadoLegal,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarEstadoLegal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesEstadoLegal= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesEstadoLegal.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesEstadoLegal,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesEstadoLegal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosEstadoLegal= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosEstadoLegal.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosEstadoLegal,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosEstadoLegal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarEstadoLegal= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarEstadoLegal.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarEstadoLegal,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarEstadoLegal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormEstadoLegal= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormEstadoLegal.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormEstadoLegal,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormEstadoLegal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaEstadoLegal= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaEstadoLegal.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaEstadoLegal,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaEstadoLegal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarEstadoLegal= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarEstadoLegal.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarEstadoLegal,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarEstadoLegal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionEstadoLegal= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionEstadoLegal.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionEstadoLegal,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionEstadoLegal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionEstadoLegal= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionEstadoLegal.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionEstadoLegal,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresEstadoLegal= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresEstadoLegal.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresEstadoLegal,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresEstadoLegal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesEstadoLegal= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesEstadoLegal.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesEstadoLegal,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesEstadoLegal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByEstadoLegal= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByEstadoLegal.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByEstadoLegal,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByEstadoLegal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarEstadoLegal= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarEstadoLegal.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarEstadoLegal,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarEstadoLegal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByEstadoLegal= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByEstadoLegal.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByEstadoLegal,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByEstadoLegal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarEstadoLegal= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarEstadoLegal.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarEstadoLegal,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarEstadoLegal, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosEstadoLegal= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosEstadoLegal.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosEstadoLegal,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosEstadoLegal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoEstadoLegal.add(this.jMenuItemCerrarEstadoLegal);
			
			this.jmenuAccionesEstadoLegal.add(this.jMenuItemNuevoEstadoLegal);
			this.jmenuAccionesEstadoLegal.add(this.jMenuItemNuevoGuardarCambiosEstadoLegal);
			this.jmenuAccionesEstadoLegal.add(this.jMenuItemNuevoRelacionesEstadoLegal);
			this.jmenuAccionesEstadoLegal.add(this.jMenuItemGuardarCambiosTablaEstadoLegal);		
			this.jmenuAccionesEstadoLegal.add(this.jMenuItemDuplicarEstadoLegal);		
			this.jmenuAccionesEstadoLegal.add(this.jMenuItemCopiarEstadoLegal);		
			this.jmenuAccionesEstadoLegal.add(this.jMenuItemVerFormEstadoLegal);		
			
			this.jmenuDatosEstadoLegal.add(this.jMenuItemRecargarInformacionEstadoLegal);				
			this.jmenuDatosEstadoLegal.add(this.jMenuItemAnterioresEstadoLegal);				
			this.jmenuDatosEstadoLegal.add(this.jMenuItemSiguientesEstadoLegal);				
			this.jmenuDatosEstadoLegal.add(this.jMenuItemAbrirOrderByEstadoLegal);				
			this.jmenuDatosEstadoLegal.add(this.jMenuItemMostrarOcultarEstadoLegal);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesEstadoLegal.add(this.jMenuItemGuardarCambiosEstadoLegal);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoEstadoLegal, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesEstadoLegal, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosEstadoLegal, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarEstadoLegal.add(this.jmenuArchivoEstadoLegal);		
			this.jmenuBarEstadoLegal.add(this.jmenuAccionesEstadoLegal);		
			this.jmenuBarEstadoLegal.add(this.jmenuDatosEstadoLegal);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarEstadoLegal);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasEstadoLegal() {
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
			//this.jInternalFrameDetalleEstadoLegal = new EstadoLegalDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Estado Legal DATOS");
			this.jInternalFrameDetalleFormEstadoLegal = new EstadoLegalDetalleFormJInternalFrame(jDesktopPane,this.estadolegalSessionBean.getConGuardarRelaciones(),this.estadolegalSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormEstadoLegal = null;//new EstadoLegalDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutEstadoLegal= new GridBagLayout();
		
		
		this.jTableDatosEstadoLegal = new JTableMe();      
		
		String sToolTipEstadoLegal="";
		sToolTipEstadoLegal=EstadoLegalConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipEstadoLegal+="(Cartera.EstadoLegal)";
		}
		
		if(!this.estadolegalSessionBean.getEsGuardarRelacionado()) {
			sToolTipEstadoLegal+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosEstadoLegal.setToolTipText(sToolTipEstadoLegal);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosEstadoLegal);
		this.jTableDatosEstadoLegal.setAutoCreateRowSorter(true);
		this.jTableDatosEstadoLegal.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosEstadoLegal.setRowSelectionAllowed(true);
		this.jTableDatosEstadoLegal.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosEstadoLegal,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoEstadoLegal = new JButtonMe();
		this.jButtonDuplicarEstadoLegal = new JButtonMe();
		this.jButtonCopiarEstadoLegal = new JButtonMe();
		this.jButtonVerFormEstadoLegal = new JButtonMe();
		this.jButtonNuevoRelacionesEstadoLegal = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaEstadoLegal = new JButtonMe();
		this.jButtonCerrarEstadoLegal = new JButtonMe();
		
		this.jScrollPanelDatosEstadoLegal = new JScrollPane();   
        this.jScrollPanelDatosGeneralEstadoLegal = new JScrollPane();
		
				
		
		
		this.jPanelAccionesEstadoLegal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Estado Legal";
		
		if(!this.estadolegalSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosEstadoLegal.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Legales" + this.sPath));
		} else {
			this.jScrollPanelDatosEstadoLegal.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralEstadoLegal.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesEstadoLegal.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesEstadoLegal.setToolTipText("Acciones");
        this.jPanelAccionesEstadoLegal.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralEstadoLegal, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEstadoLegal, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoEstadoLegal=new ReporteDinamicoJInternalFrame(EstadoLegalConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoEstadoLegal();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionEstadoLegal=new ImportacionJInternalFrame(EstadoLegalConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionEstadoLegal();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByEstadoLegal = new JButtonMe();
		
		this.jButtonAbrirOrderByEstadoLegal.setText("Orden");
		this.jButtonAbrirOrderByEstadoLegal.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByEstadoLegal,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByEstadoLegal, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByEstadoLegal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByEstadoLegal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByEstadoLegal=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEstadoLegal,false,this);
			
			//this.cargarOrderByEstadoLegal(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByEstadoLegal=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEstadoLegal,true,this);
			
			//this.cargarOrderByEstadoLegal(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosEstadoLegal.setMinimumSize(new Dimension(400,50));//430
		this.jTableDatosEstadoLegal.setMaximumSize(new Dimension(400,50));//430
		this.jTableDatosEstadoLegal.setPreferredSize(new Dimension(400,50));//430
		
		this.jScrollPanelDatosEstadoLegal.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosEstadoLegal.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosEstadoLegal.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoEstadoLegal.setText("Nuevo");
		this.jButtonDuplicarEstadoLegal.setText("Duplicar");
		this.jButtonCopiarEstadoLegal.setText("Copiar");
		this.jButtonVerFormEstadoLegal.setText("Ver");
		this.jButtonNuevoRelacionesEstadoLegal.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaEstadoLegal.setText("Guardar");
		this.jButtonCerrarEstadoLegal.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoEstadoLegal,"nuevo_button","Nuevo",this.estadolegalSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarEstadoLegal,"duplicar_button","Duplicar",this.estadolegalSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarEstadoLegal,"copiar_button","Copiar",this.estadolegalSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormEstadoLegal,"ver_form","Ver",this.estadolegalSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesEstadoLegal,"nuevorelaciones_button","Nuevo Rel",this.estadolegalSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaEstadoLegal,"guardarcambiostabla_button","Guardar",this.estadolegalSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarEstadoLegal,"cerrar_button","Salir",this.estadolegalSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoEstadoLegal, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarEstadoLegal, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarEstadoLegal, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormEstadoLegal, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesEstadoLegal, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaEstadoLegal, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarEstadoLegal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoEstadoLegal.setToolTipText("Nuevo"+" "+EstadoLegalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarEstadoLegal.setToolTipText("Duplicar"+" "+EstadoLegalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarEstadoLegal.setToolTipText("Copiar"+" "+EstadoLegalConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormEstadoLegal.setToolTipText("Ver"+" "+EstadoLegalConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesEstadoLegal.setToolTipText("Nuevo Rel"+" "+EstadoLegalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaEstadoLegal.setToolTipText("Guardar"+" "+EstadoLegalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarEstadoLegal.setToolTipText("Salir"+" "+EstadoLegalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoEstadoLegal";
		inputMap = this.jButtonNuevoEstadoLegal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoEstadoLegal.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoEstadoLegal"));
		
		//DUPLICAR
		sMapKey = "DuplicarEstadoLegal";
		inputMap = this.jButtonDuplicarEstadoLegal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarEstadoLegal.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarEstadoLegal"));
		
		//COPIAR
		sMapKey = "CopiarEstadoLegal";
		inputMap = this.jButtonCopiarEstadoLegal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarEstadoLegal.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarEstadoLegal"));
		
		//VEr FORM
		sMapKey = "VerFormEstadoLegal";
		inputMap = this.jButtonVerFormEstadoLegal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormEstadoLegal.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormEstadoLegal"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesEstadoLegal";
		inputMap = this.jButtonNuevoRelacionesEstadoLegal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesEstadoLegal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesEstadoLegal"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarEstadoLegal";
		inputMap = this.jButtonModificarEstadoLegal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarEstadoLegal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarEstadoLegal"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarEstadoLegal";
		inputMap = this.jButtonCerrarEstadoLegal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarEstadoLegal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarEstadoLegal"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaEstadoLegal";
		inputMap = this.jButtonGuardarCambiosTablaEstadoLegal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaEstadoLegal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaEstadoLegal"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesEstadoLegal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesEstadoLegal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionEstadoLegal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1EstadoLegal= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2EstadoLegal= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3EstadoLegal= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4EstadoLegal= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5EstadoLegal= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesEstadoLegal.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesEstadoLegal.setName("jPanelParametrosReportesEstadoLegal"); 
		
		this.jPanelParametrosReportesAccionesEstadoLegal.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesEstadoLegal.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesEstadoLegal.setName("jPanelParametrosReportesAccionesEstadoLegal"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesEstadoLegal, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesEstadoLegal, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionEstadoLegal = new JButtonMe();
		this.jButtonRecargarInformacionEstadoLegal.setText("Recargar");
		this.jButtonRecargarInformacionEstadoLegal.setToolTipText("Recargar"+" "+EstadoLegalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionEstadoLegal,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionEstadoLegal = new JButtonMe();
		this.jButtonProcesarInformacionEstadoLegal.setText("Procesar");
		this.jButtonProcesarInformacionEstadoLegal.setToolTipText("Procesar"+" "+EstadoLegalConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionEstadoLegal.setVisible(false);
			
		this.jButtonProcesarInformacionEstadoLegal.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionEstadoLegal.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionEstadoLegal.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesEstadoLegal = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEstadoLegal.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesEstadoLegal.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesEstadoLegal = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEstadoLegal.setText("TIPO");       
		this.jComboBoxTiposReportesEstadoLegal.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesEstadoLegal = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEstadoLegal.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesEstadoLegal.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionEstadoLegal = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionEstadoLegal.setText("Paginacion");
		this.jComboBoxTiposPaginacionEstadoLegal.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesEstadoLegal = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesEstadoLegal.setText("Accion");
		this.jComboBoxTiposRelacionesEstadoLegal.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesEstadoLegal = new JComboBoxMe();
		//this.jComboBoxTiposAccionesEstadoLegal.setText("Accion");
		this.jComboBoxTiposAccionesEstadoLegal.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarEstadoLegal = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarEstadoLegal.setText("Accion");
		this.jComboBoxTiposSeleccionarEstadoLegal.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralEstadoLegal=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralEstadoLegal.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralEstadoLegal.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralEstadoLegal.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesEstadoLegal = new JLabelMe();
		
		this.jLabelAccionesEstadoLegal.setText("Acciones");		
		this.jLabelAccionesEstadoLegal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEstadoLegal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEstadoLegal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosEstadoLegal = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosEstadoLegal.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosEstadoLegal.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosEstadoLegal = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosEstadoLegal.setText("Seleccionados");
		this.jCheckBoxSeleccionadosEstadoLegal.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaEstadoLegal = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaEstadoLegal.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaEstadoLegal.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteEstadoLegal = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteEstadoLegal.setText("Graf.");
		this.jCheckBoxConGraficoReporteEstadoLegal.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresEstadoLegal = new JButtonMe();
		//this.jButtonAnterioresEstadoLegal.setText("<<");
        this.jButtonAnterioresEstadoLegal.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresEstadoLegal,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresEstadoLegal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesEstadoLegal = new JButtonMe();
		//this.jButtonSiguientesEstadoLegal.setText(">>");
        this.jButtonSiguientesEstadoLegal.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesEstadoLegal,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesEstadoLegal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosEstadoLegal = new JButtonMe();
		this.jButtonNuevoGuardarCambiosEstadoLegal.setText("Nue");
        this.jButtonNuevoGuardarCambiosEstadoLegal.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosEstadoLegal,"nuevoguardarcambios_button","Nue",this.estadolegalSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosEstadoLegal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosEstadoLegal";
		inputMap = this.jButtonNuevoGuardarCambiosEstadoLegal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosEstadoLegal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosEstadoLegal"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionEstadoLegal";
		inputMap = this.jButtonRecargarInformacionEstadoLegal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionEstadoLegal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionEstadoLegal"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesEstadoLegal";
		inputMap = this.jButtonSiguientesEstadoLegal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesEstadoLegal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesEstadoLegal"));
		
		//ANTERIORES		
		sMapKey = "AnterioresEstadoLegal";
		inputMap = this.jButtonAnterioresEstadoLegal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresEstadoLegal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresEstadoLegal"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasEstadoLegal();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesEstadoLegal.setMinimumSize(new Dimension(this.getWidth(),EstadoLegalBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EstadoLegalBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesEstadoLegal.setMaximumSize(new Dimension(this.getWidth(),EstadoLegalBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EstadoLegalBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesEstadoLegal.setPreferredSize(new Dimension(this.getWidth(),EstadoLegalBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EstadoLegalBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionEstadoLegal = new GridBagLayout();

			this.jPanelPaginacionEstadoLegal.setLayout(gridaBagLayoutPaginacionEstadoLegal);						
			
			this.gridBagConstraintsEstadoLegal = new GridBagConstraints();
			this.gridBagConstraintsEstadoLegal.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsEstadoLegal.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoLegal.gridy = 0;
			this.gridBagConstraintsEstadoLegal.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionEstadoLegal.add(this.jButtonAnterioresEstadoLegal, this.gridBagConstraintsEstadoLegal);
					
						
			this.gridBagConstraintsEstadoLegal = new GridBagConstraints();
			this.gridBagConstraintsEstadoLegal.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsEstadoLegal.gridy = 0;
			
			this.jPanelPaginacionEstadoLegal.add(this.jButtonNuevoGuardarCambiosEstadoLegal, this.gridBagConstraintsEstadoLegal);
						
			
			this.gridBagConstraintsEstadoLegal = new GridBagConstraints();
			this.gridBagConstraintsEstadoLegal.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsEstadoLegal.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsEstadoLegal.gridy = 0;
			this.jPanelPaginacionEstadoLegal.add(this.jButtonSiguientesEstadoLegal, this.gridBagConstraintsEstadoLegal);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsEstadoLegal = new GridBagConstraints();
			this.gridBagConstraintsEstadoLegal.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoLegal.gridy = 1;
			this.gridBagConstraintsEstadoLegal.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEstadoLegal.add(this.jButtonNuevoEstadoLegal, this.gridBagConstraintsEstadoLegal);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsEstadoLegal = new GridBagConstraints();
				this.gridBagConstraintsEstadoLegal.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsEstadoLegal.gridy = 1;
				this.gridBagConstraintsEstadoLegal.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionEstadoLegal.add(this.jButtonNuevoRelacionesEstadoLegal, this.gridBagConstraintsEstadoLegal);
			}
			
			
			if(!this.estadolegalSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsEstadoLegal = new GridBagConstraints();
				this.gridBagConstraintsEstadoLegal.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsEstadoLegal.gridy = 1;
				this.gridBagConstraintsEstadoLegal.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionEstadoLegal.add(this.jButtonGuardarCambiosTablaEstadoLegal, this.gridBagConstraintsEstadoLegal);
			}
			
			
			
			this.gridBagConstraintsEstadoLegal = new GridBagConstraints();
			this.gridBagConstraintsEstadoLegal.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoLegal.gridy = 1;
			this.gridBagConstraintsEstadoLegal.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEstadoLegal.add(this.jButtonDuplicarEstadoLegal, this.gridBagConstraintsEstadoLegal);
			
			this.gridBagConstraintsEstadoLegal = new GridBagConstraints();
			this.gridBagConstraintsEstadoLegal.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoLegal.gridy = 1;
			this.gridBagConstraintsEstadoLegal.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEstadoLegal.add(this.jButtonCopiarEstadoLegal, this.gridBagConstraintsEstadoLegal);
		
			this.gridBagConstraintsEstadoLegal = new GridBagConstraints();
			this.gridBagConstraintsEstadoLegal.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoLegal.gridy = 1;
			this.gridBagConstraintsEstadoLegal.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEstadoLegal.add(this.jButtonVerFormEstadoLegal, this.gridBagConstraintsEstadoLegal);
		
			this.gridBagConstraintsEstadoLegal = new GridBagConstraints();
			this.gridBagConstraintsEstadoLegal.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoLegal.gridy = 1;
			this.gridBagConstraintsEstadoLegal.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionEstadoLegal.add(this.jButtonCerrarEstadoLegal, this.gridBagConstraintsEstadoLegal);
		
		
		
		this.jButtonRecargarInformacionEstadoLegal.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionEstadoLegal.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionEstadoLegal.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionEstadoLegal, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesEstadoLegal.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesEstadoLegal.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesEstadoLegal.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesEstadoLegal, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesEstadoLegal.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesEstadoLegal.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesEstadoLegal.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesEstadoLegal, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesEstadoLegal.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesEstadoLegal.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesEstadoLegal.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesEstadoLegal, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionEstadoLegal.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionEstadoLegal.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionEstadoLegal.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionEstadoLegal, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesEstadoLegal.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesEstadoLegal.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesEstadoLegal.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesEstadoLegal, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesEstadoLegal.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEstadoLegal.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEstadoLegal.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesEstadoLegal, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarEstadoLegal.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarEstadoLegal.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarEstadoLegal.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarEstadoLegal, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaEstadoLegal.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaEstadoLegal.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaEstadoLegal.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaEstadoLegal, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteEstadoLegal.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteEstadoLegal.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteEstadoLegal.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteEstadoLegal, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosEstadoLegal.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosEstadoLegal.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosEstadoLegal.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosEstadoLegal, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosEstadoLegal.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosEstadoLegal.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosEstadoLegal.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosEstadoLegal, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesEstadoLegal = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesEstadoLegal = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1EstadoLegal = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2EstadoLegal = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3EstadoLegal = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4EstadoLegal = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesEstadoLegal.setLayout(gridaBagParametrosReportesEstadoLegal);
			this.jPanelParametrosReportesAccionesEstadoLegal.setLayout(gridaBagParametrosReportesAccionesEstadoLegal);
			
			
			this.jPanelParametrosAuxiliar1EstadoLegal.setLayout(gridaBagParametrosAuxiliar1EstadoLegal);
			this.jPanelParametrosAuxiliar2EstadoLegal.setLayout(gridaBagParametrosAuxiliar2EstadoLegal);
			this.jPanelParametrosAuxiliar3EstadoLegal.setLayout(gridaBagParametrosAuxiliar3EstadoLegal);
			this.jPanelParametrosAuxiliar4EstadoLegal.setLayout(gridaBagParametrosAuxiliar4EstadoLegal);
			//this.jPanelParametrosAuxiliar5EstadoLegal.setLayout(gridaBagParametrosAuxiliar2EstadoLegal);			
			
			
			
			
			this.gridBagConstraintsEstadoLegal = new GridBagConstraints();
			this.gridBagConstraintsEstadoLegal.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoLegal.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEstadoLegal.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstadoLegal.add(this.jButtonRecargarInformacionEstadoLegal, this.gridBagConstraintsEstadoLegal);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsEstadoLegal = new GridBagConstraints();
			this.gridBagConstraintsEstadoLegal.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoLegal.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoLegal.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1EstadoLegal.add(this.jComboBoxTiposPaginacionEstadoLegal, this.gridBagConstraintsEstadoLegal);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsEstadoLegal = new GridBagConstraints();
			this.gridBagConstraintsEstadoLegal.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoLegal.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoLegal.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1EstadoLegal.add(this.jCheckBoxConAltoMaximoTablaEstadoLegal, this.gridBagConstraintsEstadoLegal);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsEstadoLegal = new GridBagConstraints();
			this.gridBagConstraintsEstadoLegal.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoLegal.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoLegal.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1EstadoLegal.add(this.jComboBoxTiposArchivosReportesEstadoLegal, this.gridBagConstraintsEstadoLegal);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsEstadoLegal = new GridBagConstraints();
			this.gridBagConstraintsEstadoLegal.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoLegal.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoLegal.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoLegal.add(this.jPanelParametrosAuxiliar1EstadoLegal, this.gridBagConstraintsEstadoLegal);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsEstadoLegal = new GridBagConstraints();
			this.gridBagConstraintsEstadoLegal.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoLegal.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoLegal.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEstadoLegal.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4EstadoLegal.add(this.jComboBoxTiposReportesEstadoLegal, this.gridBagConstraintsEstadoLegal);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsEstadoLegal = new GridBagConstraints();
			this.gridBagConstraintsEstadoLegal.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoLegal.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoLegal.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoLegal.add(this.jPanelParametrosAuxiliar4EstadoLegal, this.gridBagConstraintsEstadoLegal);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsEstadoLegal = new GridBagConstraints();
			this.gridBagConstraintsEstadoLegal.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoLegal.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoLegal.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoLegal.add(this.jComboBoxTiposReportesEstadoLegal, this.gridBagConstraintsEstadoLegal);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsEstadoLegal = new GridBagConstraints();
			this.gridBagConstraintsEstadoLegal.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoLegal.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoLegal.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEstadoLegal.add(this.jCheckBoxGenerarReporteEstadoLegal, this.gridBagConstraintsEstadoLegal);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsEstadoLegal = new GridBagConstraints();
			this.gridBagConstraintsEstadoLegal.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoLegal.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoLegal.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoLegal.add(this.jPanelParametrosAuxiliar2EstadoLegal, this.gridBagConstraintsEstadoLegal);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsEstadoLegal = new GridBagConstraints();
			this.gridBagConstraintsEstadoLegal.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoLegal.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEstadoLegal.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEstadoLegal.add(this.jLabelAccionesEstadoLegal, this.gridBagConstraintsEstadoLegal);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsEstadoLegal = new GridBagConstraints();
				this.gridBagConstraintsEstadoLegal.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsEstadoLegal.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsEstadoLegal.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesEstadoLegal.add(this.jButtonAbrirOrderByEstadoLegal, this.gridBagConstraintsEstadoLegal);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsEstadoLegal = new GridBagConstraints();
			this.gridBagConstraintsEstadoLegal.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsEstadoLegal.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoLegal.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstadoLegal.add(this.jComboBoxTiposSeleccionarEstadoLegal, this.gridBagConstraintsEstadoLegal);			
			
			
			/*
			this.gridBagConstraintsEstadoLegal = new GridBagConstraints();
			this.gridBagConstraintsEstadoLegal.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoLegal.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEstadoLegal.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEstadoLegal.add(this.jCheckBoxSeleccionarTodosEstadoLegal, this.gridBagConstraintsEstadoLegal);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsEstadoLegal = new GridBagConstraints();
			this.gridBagConstraintsEstadoLegal.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoLegal.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoLegal.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEstadoLegal.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3EstadoLegal.add(this.jCheckBoxSeleccionarTodosEstadoLegal, this.gridBagConstraintsEstadoLegal);															
				
			this.gridBagConstraintsEstadoLegal = new GridBagConstraints();
			this.gridBagConstraintsEstadoLegal.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoLegal.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoLegal.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEstadoLegal.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3EstadoLegal.add(this.jCheckBoxSeleccionadosEstadoLegal, this.gridBagConstraintsEstadoLegal);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsEstadoLegal = new GridBagConstraints();
			this.gridBagConstraintsEstadoLegal.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoLegal.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoLegal.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoLegal.add(this.jPanelParametrosAuxiliar3EstadoLegal, this.gridBagConstraintsEstadoLegal);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsEstadoLegal = new GridBagConstraints();
			this.gridBagConstraintsEstadoLegal.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoLegal.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstadoLegal.add(this.jComboBoxTiposRelacionesEstadoLegal, this.gridBagConstraintsEstadoLegal);
				
			this.gridBagConstraintsEstadoLegal = new GridBagConstraints();
			this.gridBagConstraintsEstadoLegal.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoLegal.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstadoLegal.add(this.jComboBoxTiposAccionesEstadoLegal, this.gridBagConstraintsEstadoLegal);
	
				
			this.gridBagConstraintsEstadoLegal = new GridBagConstraints();
			this.gridBagConstraintsEstadoLegal.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoLegal.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstadoLegal.add(this.jTextFieldValorCampoGeneralEstadoLegal, this.gridBagConstraintsEstadoLegal);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosEstadoLegal = new GridBagLayout();

			this.jScrollPanelDatosEstadoLegal.setLayout(gridaBagLayoutDatosEstadoLegal);
			
			this.gridBagConstraintsEstadoLegal = new GridBagConstraints();
			this.gridBagConstraintsEstadoLegal.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoLegal.gridy = 0;
			this.gridBagConstraintsEstadoLegal.gridx = 0;
			
			this.jScrollPanelDatosEstadoLegal.add(this.jTableDatosEstadoLegal, this.gridBagConstraintsEstadoLegal);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosEstadoLegal.setViewportView(this.jTableDatosEstadoLegal);
		this.jTableDatosEstadoLegal.setFillsViewportHeight(true);
		this.jTableDatosEstadoLegal.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesEstadoLegal= new GridBagLayout();
		this.jPanelAccionesEstadoLegal.setLayout(gridaBagLayoutAccionesEstadoLegal);
		
		
		/*	
		this.gridBagConstraintsEstadoLegal = new GridBagConstraints();
		this.gridBagConstraintsEstadoLegal.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoLegal.gridy = 0;
		this.gridBagConstraintsEstadoLegal.gridx = 0;
			
		this.jPanelAccionesEstadoLegal.add(this.jButtonNuevoEstadoLegal, this.gridBagConstraintsEstadoLegal);
		*/
		int iPosXAccion=0;
		
						
		
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutEstadoLegal = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutEstadoLegal);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.estadolegalSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsEstadoLegal = new GridBagConstraints();						
			this.gridBagConstraintsEstadoLegal.gridy = iGridyPrincipal++;
			this.gridBagConstraintsEstadoLegal.gridx = 0;		
			//this.gridBagConstraintsEstadoLegal.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoLegal.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsEstadoLegal.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarEstadoLegal, this.gridBagConstraintsEstadoLegal);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsEstadoLegal = new GridBagConstraints();
		this.gridBagConstraintsEstadoLegal.gridy = iGridyPrincipal++;
		this.gridBagConstraintsEstadoLegal.gridx = 0;		
		//this.gridBagConstraintsEstadoLegal.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoLegal.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsEstadoLegal.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsEstadoLegal);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsEstadoLegal = new GridBagConstraints();
		this.gridBagConstraintsEstadoLegal.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoLegal.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesEstadoLegal, this.gridBagConstraintsEstadoLegal);								
		
		
		/*
		this.gridBagConstraintsEstadoLegal = new GridBagConstraints();
		this.gridBagConstraintsEstadoLegal.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoLegal.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesEstadoLegal, this.gridBagConstraintsEstadoLegal);
		*/		
		
		this.gridBagConstraintsEstadoLegal = new GridBagConstraints();
		this.gridBagConstraintsEstadoLegal.gridy =iGridyPrincipal++;
		this.gridBagConstraintsEstadoLegal.gridx =0;
		this.gridBagConstraintsEstadoLegal.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsEstadoLegal.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosEstadoLegal, this.gridBagConstraintsEstadoLegal);
				
		
		this.gridBagConstraintsEstadoLegal = new GridBagConstraints();
		this.gridBagConstraintsEstadoLegal.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoLegal.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionEstadoLegal, this.gridBagConstraintsEstadoLegal);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(EstadoLegalJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosEstadoLegal= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosEstadoLegal = new GridBagLayout();
			this.jPanelBusquedasParametrosEstadoLegal.setLayout(gridaBagLayoutBusquedasParametrosEstadoLegal);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralEstadoLegal=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralEstadoLegal.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEstadoLegal.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEstadoLegal.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsEstadoLegal = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsEstadoLegal = new GridBagConstraints();
		this.gridBagConstraintsEstadoLegal.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoLegal.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposEstadoLegal, this.gridBagConstraintsEstadoLegal);
			
			
		this.gridBagConstraintsEstadoLegal = new GridBagConstraints();
		this.gridBagConstraintsEstadoLegal.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoLegal.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosEstadoLegal, this.gridBagConstraintsEstadoLegal);
		
			
		this.gridBagConstraintsEstadoLegal = new GridBagConstraints();
		this.gridBagConstraintsEstadoLegal.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsEstadoLegal.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesEstadoLegal, this.gridBagConstraintsEstadoLegal);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralEstadoLegal;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoEstadoLegal() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoEstadoLegal = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoEstadoLegal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoEstadoLegal.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoEstadoLegal.setName("jPanelReporteDinamicoEstadoLegal"); 
		
		this.jPanelReporteDinamicoEstadoLegal.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoEstadoLegal.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoEstadoLegal.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoEstadoLegal.setLayout(gridaBagLayoutReporteDinamicoEstadoLegal);
		
		
		this.jInternalFrameReporteDinamicoEstadoLegal= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoEstadoLegal = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteEstadoLegal= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoEstadoLegal.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoEstadoLegal.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoEstadoLegal.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoEstadoLegal.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoEstadoLegal.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoEstadoLegal.setResizable(true);
	    this.jInternalFrameReporteDinamicoEstadoLegal.setClosable(true);
	    this.jInternalFrameReporteDinamicoEstadoLegal.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoEstadoLegal.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoEstadoLegal.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoEstadoLegal.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoEstadoLegal.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Legales"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteEstadoLegal = new JLabelMe();

		this.jLabelColumnasSelectReporteEstadoLegal.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteEstadoLegal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteEstadoLegal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteEstadoLegal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsEstadoLegal = new GridBagConstraints();
		this.gridBagConstraintsEstadoLegal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoLegal.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoLegal.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoEstadoLegal.add(this.jLabelColumnasSelectReporteEstadoLegal, this.gridBagConstraintsEstadoLegal);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteEstadoLegal = new JList<Reporte>();
		this.jListColumnasSelectReporteEstadoLegal.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteEstadoLegal.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteEstadoLegal.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteEstadoLegal.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteEstadoLegal.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteEstadoLegal=new JScrollPane(this.jListColumnasSelectReporteEstadoLegal);
			
			this.jScrollColumnasSelectReporteEstadoLegal.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteEstadoLegal.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteEstadoLegal.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteEstadoLegal.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsEstadoLegal = new GridBagConstraints();
		this.gridBagConstraintsEstadoLegal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoLegal.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoLegal.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoEstadoLegal.add(this.jListColumnasSelectReporteEstadoLegal, this.gridBagConstraintsEstadoLegal);
		this.jPanelReporteDinamicoEstadoLegal.add(this.jScrollColumnasSelectReporteEstadoLegal, this.gridBagConstraintsEstadoLegal);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteEstadoLegal = new JLabelMe();

		this.jLabelRelacionesSelectReporteEstadoLegal.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteEstadoLegal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteEstadoLegal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteEstadoLegal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsEstadoLegal = new GridBagConstraints();
		this.gridBagConstraintsEstadoLegal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoLegal.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoLegal.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoEstadoLegal.add(this.jLabelRelacionesSelectReporteEstadoLegal, this.gridBagConstraintsEstadoLegal);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteEstadoLegal = new JList<Reporte>();
		this.jListRelacionesSelectReporteEstadoLegal.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteEstadoLegal.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteEstadoLegal.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteEstadoLegal.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteEstadoLegal.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteEstadoLegal=new JScrollPane(this.jListRelacionesSelectReporteEstadoLegal);
			
			this.jScrollRelacionesSelectReporteEstadoLegal.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteEstadoLegal.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteEstadoLegal.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteEstadoLegal.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsEstadoLegal = new GridBagConstraints();
		this.gridBagConstraintsEstadoLegal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoLegal.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoLegal.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoEstadoLegal.add(this.jListRelacionesSelectReporteEstadoLegal, this.gridBagConstraintsEstadoLegal);
		this.jPanelReporteDinamicoEstadoLegal.add(this.jScrollRelacionesSelectReporteEstadoLegal, this.gridBagConstraintsEstadoLegal);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoEstadoLegal = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoEstadoLegal = new JComboBoxMe();
		this.jListColumnasValoresGraficoEstadoLegal = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoEstadoLegal = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoEstadoLegal.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoEstadoLegal.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoEstadoLegal.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoEstadoLegal.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoEstadoLegal, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoEstadoLegal = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoEstadoLegal.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoEstadoLegal.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoEstadoLegal.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoEstadoLegal.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoEstadoLegal, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoEstadoLegal = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoEstadoLegal.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoEstadoLegal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoEstadoLegal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoEstadoLegal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsEstadoLegal = new GridBagConstraints();
		this.gridBagConstraintsEstadoLegal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoLegal.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoLegal.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEstadoLegal.add(this.jLabelGenerarExcelReporteDinamicoEstadoLegal, this.gridBagConstraintsEstadoLegal);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoEstadoLegal = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoEstadoLegal.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoEstadoLegal,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoEstadoLegal.setToolTipText("Generar EXCEL"+" "+EstadoLegalConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsEstadoLegal = new GridBagConstraints();
		//this.gridBagConstraintsEstadoLegal.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsEstadoLegal.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsEstadoLegal.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoEstadoLegal.add(this.jButtonGenerarExcelReporteDinamicoEstadoLegal, this.gridBagConstraintsEstadoLegal);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsEstadoLegal = new GridBagConstraints();
		this.gridBagConstraintsEstadoLegal.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoLegal.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEstadoLegal.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEstadoLegal.add(this.jComboBoxTiposReportesDinamicoEstadoLegal, this.gridBagConstraintsEstadoLegal);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoEstadoLegal = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoEstadoLegal.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoEstadoLegal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoEstadoLegal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoEstadoLegal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsEstadoLegal = new GridBagConstraints();
		this.gridBagConstraintsEstadoLegal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoLegal.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoLegal.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEstadoLegal.add(this.jLabelTiposArchivoReporteDinamicoEstadoLegal, this.gridBagConstraintsEstadoLegal);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsEstadoLegal = new GridBagConstraints();
		this.gridBagConstraintsEstadoLegal.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoLegal.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEstadoLegal.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEstadoLegal.add(this.jComboBoxTiposArchivosReportesDinamicoEstadoLegal, this.gridBagConstraintsEstadoLegal);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoEstadoLegal = new JButtonMe();
		this.jButtonGenerarReporteDinamicoEstadoLegal.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoEstadoLegal,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoEstadoLegal.setToolTipText("Generar"+" "+EstadoLegalConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsEstadoLegal = new GridBagConstraints();
		this.gridBagConstraintsEstadoLegal.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoLegal.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEstadoLegal.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEstadoLegal.add(this.jButtonGenerarReporteDinamicoEstadoLegal, this.gridBagConstraintsEstadoLegal);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoEstadoLegal = new JButtonMe();
		this.jButtonCerrarReporteDinamicoEstadoLegal.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoEstadoLegal,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoEstadoLegal.setToolTipText("Cancelar"+" "+EstadoLegalConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsEstadoLegal = new GridBagConstraints();
		this.gridBagConstraintsEstadoLegal.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoLegal.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEstadoLegal.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEstadoLegal.add(this.jButtonCerrarReporteDinamicoEstadoLegal, this.gridBagConstraintsEstadoLegal);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalEstadoLegal = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoEstadoLegal= new JScrollPane(jPanelReporteDinamicoEstadoLegal,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoEstadoLegal.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoEstadoLegal.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoEstadoLegal.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoEstadoLegal.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Legales"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsEstadoLegal = new GridBagConstraints();
		this.gridBagConstraintsEstadoLegal.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsEstadoLegal.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsEstadoLegal.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoEstadoLegal.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoEstadoLegal.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalEstadoLegal);
		this.jInternalFrameReporteDinamicoEstadoLegal.getContentPane().add(this.jScrollPanelReporteDinamicoEstadoLegal, this.gridBagConstraintsEstadoLegal);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionEstadoLegal() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionEstadoLegal = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionEstadoLegal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionEstadoLegal.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionEstadoLegal.setName("jPanelImportacionEstadoLegal"); 
		
		this.jPanelImportacionEstadoLegal.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionEstadoLegal.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionEstadoLegal.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionEstadoLegal.setLayout(gridaBagLayoutImportacionEstadoLegal);
		
		
		this.jInternalFrameImportacionEstadoLegal= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionEstadoLegal= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionEstadoLegal = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteEstadoLegal= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionEstadoLegal.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionEstadoLegal.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionEstadoLegal.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionEstadoLegal.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionEstadoLegal.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionEstadoLegal.setResizable(true);
	    this.jInternalFrameImportacionEstadoLegal.setClosable(true);
	    this.jInternalFrameImportacionEstadoLegal.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionEstadoLegal.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionEstadoLegal.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionEstadoLegal.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionEstadoLegal.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionEstadoLegal.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionEstadoLegal.setResizable(true);
	    this.jInternalFrameImportacionEstadoLegal.setClosable(true);
	    this.jInternalFrameImportacionEstadoLegal.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionEstadoLegal.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionEstadoLegal.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionEstadoLegal.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionEstadoLegal.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Legales"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionEstadoLegal = new JLabelMe();

		this.jLabelArchivoImportacionEstadoLegal.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionEstadoLegal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionEstadoLegal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionEstadoLegal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsEstadoLegal = new GridBagConstraints();
		this.gridBagConstraintsEstadoLegal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoLegal.gridy = iPosYImportacion;		
		this.gridBagConstraintsEstadoLegal.gridx = iPosXImportacion++;
			
		this.jPanelImportacionEstadoLegal.add(this.jLabelArchivoImportacionEstadoLegal, this.gridBagConstraintsEstadoLegal);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionEstadoLegal = new JFileChooser();		
		this.jFileChooserImportacionEstadoLegal.setToolTipText("ESCOGER ARCHIVO"+" "+EstadoLegalConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionEstadoLegal = new JButtonMe();
		this.jButtonAbrirImportacionEstadoLegal.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionEstadoLegal,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionEstadoLegal.setToolTipText("Generar"+" "+EstadoLegalConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsEstadoLegal = new GridBagConstraints();
		this.gridBagConstraintsEstadoLegal.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoLegal.gridy = iPosYImportacion;
		this.gridBagConstraintsEstadoLegal.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEstadoLegal.add(this.jButtonAbrirImportacionEstadoLegal, this.gridBagConstraintsEstadoLegal);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionEstadoLegal = new JLabelMe();

		this.jLabelPathArchivoImportacionEstadoLegal.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionEstadoLegal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionEstadoLegal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionEstadoLegal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsEstadoLegal = new GridBagConstraints();
		this.gridBagConstraintsEstadoLegal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoLegal.gridy = iPosYImportacion;		
		this.gridBagConstraintsEstadoLegal.gridx = iPosXImportacion++;
			
		this.jPanelImportacionEstadoLegal.add(this.jLabelPathArchivoImportacionEstadoLegal, this.gridBagConstraintsEstadoLegal);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionEstadoLegal=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionEstadoLegal.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionEstadoLegal.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionEstadoLegal.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsEstadoLegal = new GridBagConstraints();
		this.gridBagConstraintsEstadoLegal.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoLegal.gridy = iPosYImportacion;
		this.gridBagConstraintsEstadoLegal.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEstadoLegal.add(this.jTextFieldPathArchivoImportacionEstadoLegal, this.gridBagConstraintsEstadoLegal);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionEstadoLegal = new JButtonMe();
		this.jButtonGenerarImportacionEstadoLegal.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionEstadoLegal,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionEstadoLegal.setToolTipText("Generar"+" "+EstadoLegalConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsEstadoLegal = new GridBagConstraints();
		this.gridBagConstraintsEstadoLegal.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoLegal.gridy = iPosYImportacion;
		this.gridBagConstraintsEstadoLegal.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEstadoLegal.add(this.jButtonGenerarImportacionEstadoLegal, this.gridBagConstraintsEstadoLegal);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionEstadoLegal = new JButtonMe();
		this.jButtonCerrarImportacionEstadoLegal.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionEstadoLegal,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionEstadoLegal.setToolTipText("Cancelar"+" "+EstadoLegalConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsEstadoLegal = new GridBagConstraints();
		this.gridBagConstraintsEstadoLegal.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoLegal.gridy = iPosYImportacion;
		this.gridBagConstraintsEstadoLegal.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEstadoLegal.add(this.jButtonCerrarImportacionEstadoLegal, this.gridBagConstraintsEstadoLegal);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalEstadoLegal = new GridBagLayout();
		
		this.jScrollPanelImportacionEstadoLegal= new JScrollPane(jPanelImportacionEstadoLegal,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsEstadoLegal = new GridBagConstraints();
		this.gridBagConstraintsEstadoLegal.gridy =iPosYImportacion;
		this.gridBagConstraintsEstadoLegal.gridx =iPosXImportacion;
		this.gridBagConstraintsEstadoLegal.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionEstadoLegal.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionEstadoLegal.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalEstadoLegal);
		this.jInternalFrameImportacionEstadoLegal.getContentPane().add(this.jScrollPanelImportacionEstadoLegal, this.gridBagConstraintsEstadoLegal);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByEstadoLegal(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByEstadoLegal = new JButtonMe();
			this.jButtonAbrirOrderByEstadoLegal.setText("Orden");
			this.jButtonAbrirOrderByEstadoLegal.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByEstadoLegal,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByEstadoLegal, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByEstadoLegal";
			inputMap = this.jButtonAbrirOrderByEstadoLegal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByEstadoLegal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByEstadoLegal"));
		
		
			GridBagLayout gridaBagLayoutOrderByEstadoLegal = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByEstadoLegal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByEstadoLegal.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByEstadoLegal.setName("jPanelOrderByEstadoLegal"); 
			
			this.jPanelOrderByEstadoLegal.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByEstadoLegal.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByEstadoLegal.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByEstadoLegal, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByEstadoLegal.setLayout(gridaBagLayoutOrderByEstadoLegal);
			
			
			this.jTableDatosEstadoLegalOrderBy = new JTableMe();        
			this.jTableDatosEstadoLegalOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosEstadoLegalOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosEstadoLegalOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosEstadoLegalOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosEstadoLegalOrderBy.setViewportView(this.jTableDatosEstadoLegalOrderBy);
			this.jTableDatosEstadoLegalOrderBy.setFillsViewportHeight(true);
			this.jTableDatosEstadoLegalOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByEstadoLegal= new OrderByJInternalFrame();
			this.jInternalFrameOrderByEstadoLegal= new OrderByJInternalFrame();
			this.jScrollPanelOrderByEstadoLegal = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteEstadoLegal= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByEstadoLegal.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByEstadoLegal.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByEstadoLegal.setTitle("Orden");
			this.jInternalFrameOrderByEstadoLegal.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByEstadoLegal.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByEstadoLegal.setResizable(true);
			this.jInternalFrameOrderByEstadoLegal.setClosable(true);
			this.jInternalFrameOrderByEstadoLegal.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByEstadoLegal, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByEstadoLegal.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByEstadoLegal.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByEstadoLegal.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByEstadoLegal, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByEstadoLegal.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Legales"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsEstadoLegal = new GridBagConstraints();
			this.gridBagConstraintsEstadoLegal.gridy =iPosYOrderBy++;
			this.gridBagConstraintsEstadoLegal.gridx =iPosXOrderBy;
			this.gridBagConstraintsEstadoLegal.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsEstadoLegal.ipady =150;
				
			this.jPanelOrderByEstadoLegal.add(jScrollPanelDatosEstadoLegalOrderBy, this.gridBagConstraintsEstadoLegal);//this.jTableDatosEstadoLegalTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByEstadoLegal = new JButtonMe();
			this.jButtonCerrarOrderByEstadoLegal.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByEstadoLegal,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByEstadoLegal.setToolTipText("Cancelar"+" "+EstadoLegalConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByEstadoLegal, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsEstadoLegal = new GridBagConstraints();
			this.gridBagConstraintsEstadoLegal.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoLegal.gridy = iPosYOrderBy++;
			this.gridBagConstraintsEstadoLegal.gridx = iPosXOrderBy;
									
			this.jPanelOrderByEstadoLegal.add(this.jButtonCerrarOrderByEstadoLegal, this.gridBagConstraintsEstadoLegal);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalEstadoLegal = new GridBagLayout();
			
			this.jScrollPanelOrderByEstadoLegal= new JScrollPane(jPanelOrderByEstadoLegal,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsEstadoLegal = new GridBagConstraints();
			this.gridBagConstraintsEstadoLegal.gridy =iPosYOrderBy;
			this.gridBagConstraintsEstadoLegal.gridx =iPosXOrderBy;
			this.gridBagConstraintsEstadoLegal.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByEstadoLegal.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByEstadoLegal.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalEstadoLegal);
			
			this.jInternalFrameOrderByEstadoLegal.getContentPane().add(this.jScrollPanelOrderByEstadoLegal, this.gridBagConstraintsEstadoLegal);			
		
		} else {
			this.jButtonAbrirOrderByEstadoLegal = new JButtonMe();
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
		int iWidthTableCalculado=0;//1030
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=430;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=300;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=300;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.estadolegalSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosEstadoLegal.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosEstadoLegal.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosEstadoLegal.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosEstadoLegal.getRowHeight();//EstadoLegalConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.estadolegalSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > EstadoLegalConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaEstadoLegal.isSelected()) {
					iHeightTable=EstadoLegalConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < EstadoLegalConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=EstadoLegalConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > EstadoLegalConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaEstadoLegal.isSelected()) {
					iHeightTable=EstadoLegalConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < EstadoLegalConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=EstadoLegalConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosEstadoLegal.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosEstadoLegal.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosEstadoLegal.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosEstadoLegal.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosEstadoLegal.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosEstadoLegal.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByEstadoLegal!=null && this.jInternalFrameOrderByEstadoLegal.getjTableDatosOrderBy()!=null) {
			//if(!this.estadolegalSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByEstadoLegal.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByEstadoLegal.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByEstadoLegal.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByEstadoLegal.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByEstadoLegal.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByEstadoLegal.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByEstadoLegal.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosEstadoLegal.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosEstadoLegal.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosEstadoLegal.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=estadolegalLogic.getEstadoLegals().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=estadolegals.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<EstadoLegal> TraerEstadoLegalBeans(List<EstadoLegal> estadolegals,ArrayList<Classe> classes)throws Exception {
		try {
			for(EstadoLegal estadolegal:estadolegals) {
					
				if(!(EstadoLegalConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || EstadoLegalConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					estadolegal.setsDetalleGeneralEntityReporte(EstadoLegalConstantesFunciones.getEstadoLegalDescripcion(estadolegal));
										
						
					
					

					if(estadolegal.getClientes()!=null && Funciones.existeClass(classes,Cliente.class)) {
						try{estadolegal.setclientesDescripcionReporte(new JRBeanCollectionDataSource(ClienteJInternalFrame.TraerClienteBeans(estadolegal.getClientes(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(estadolegal.getSubClientes()!=null && Funciones.existeClass(classes,SubCliente.class)) {
						try{estadolegal.setsubclientesDescripcionReporte(new JRBeanCollectionDataSource(SubClienteJInternalFrame.TraerSubClienteBeans(estadolegal.getSubClientes(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(estadolegal.getParametroCarteraDefectos()!=null && Funciones.existeClass(classes,ParametroCarteraDefecto.class)) {
						try{estadolegal.setparametrocarteradefectosDescripcionReporte(new JRBeanCollectionDataSource(ParametroCarteraDefectoJInternalFrame.TraerParametroCarteraDefectoBeans(estadolegal.getParametroCarteraDefectos(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//estadolegal.setsDetalleGeneralEntityReporte(estadolegal.getsDetalleGeneralEntityReporte());
										
				}
				
				//estadolegalbeans.add(estadolegalbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return estadolegals;
    }
	//PARA REPORTES FIN
}
