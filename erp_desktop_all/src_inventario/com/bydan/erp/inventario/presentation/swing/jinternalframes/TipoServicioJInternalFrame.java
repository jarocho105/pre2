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
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;

import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.facturacion.business.entity.*;

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
import com.bydan.erp.inventario.util.TipoServicioConstantesFunciones;

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
public class TipoServicioJInternalFrame extends TipoServicioBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarTipoServicio;
	
	protected JMenuBar jmenuBarTipoServicio;
	
	protected JMenu jmenuTipoServicio;
	protected JMenu jmenuDatosTipoServicio;
	protected JMenu jmenuArchivoTipoServicio;
	protected JMenu jmenuAccionesTipoServicio;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosTipoServicio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoServicio;	
	protected GridBagConstraints gridBagConstraintsTipoServicio;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public TipoServicioDetalleFormJInternalFrame jInternalFrameDetalleFormTipoServicio;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoTipoServicio;	
	protected ImportacionJInternalFrame jInternalFrameImportacionTipoServicio;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public TipoServicioSessionBean tiposervicioSessionBean;
		
	
	
	
	//protected JDesktopPane jDesktopPane;
	public List<TipoServicio> tiposervicios;		
	public List<TipoServicio> tiposerviciosEliminados;	
	public List<TipoServicio> tiposerviciosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByTipoServicio;		
	protected JButton jButtonAbrirOrderByTipoServicio;
	
	
	//protected JPanel jPanelOrderByTipoServicio;
	//public JScrollPane jScrollPanelOrderByTipoServicio;	
	//protected JButton jButtonCerrarOrderByTipoServicio;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public TipoServicioLogic tiposervicioLogic;
	
	
	
	public JScrollPane jScrollPanelDatosTipoServicio;
	public JScrollPane jScrollPanelDatosEdicionTipoServicio;
	public JScrollPane jScrollPanelDatosGeneralTipoServicio;
    
	
	
	//public JScrollPane jScrollPanelDatosTipoServicioOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoTipoServicio;
	//public JScrollPane jScrollPanelImportacionTipoServicio;
	
	
	
	protected JPanel jPanelAccionesTipoServicio;
	
    protected JPanel jPanelPaginacionTipoServicio;
    protected JPanel jPanelParametrosReportesTipoServicio;
	protected JPanel jPanelParametrosReportesAccionesTipoServicio;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1TipoServicio;
	protected JPanel jPanelParametrosAuxiliar2TipoServicio;
	protected JPanel jPanelParametrosAuxiliar3TipoServicio;
	protected JPanel jPanelParametrosAuxiliar4TipoServicio;
	//protected JPanel jPanelParametrosAuxiliar5TipoServicio;
	
	
	
	//protected JPanel jPanelReporteDinamicoTipoServicio;
	//protected JPanel jPanelImportacionTipoServicio;
	
	
	public JTable jTableDatosTipoServicio;
	
	
	
	//public JTable jTableDatosTipoServicioOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoTipoServicio;
	protected JButton jButtonDuplicarTipoServicio;
	protected JButton jButtonCopiarTipoServicio;
	protected JButton jButtonVerFormTipoServicio;
	protected JButton jButtonNuevoRelacionesTipoServicio;
	protected JButton jButtonModificarTipoServicio;
	
    protected JButton jButtonGuardarCambiosTablaTipoServicio;
	protected JButton jButtonCerrarTipoServicio;
	
	
	protected JButton jButtonRecargarInformacionTipoServicio;
	protected JButton jButtonProcesarInformacionTipoServicio;
	
	
	protected JButton jButtonAnterioresTipoServicio;
	protected JButton jButtonSiguientesTipoServicio;
	protected JButton jButtonNuevoGuardarCambiosTipoServicio;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoTipoServicio;
	//protected JButton jButtonCerrarReporteDinamicoTipoServicio;
	//protected JButton jButtonGenerarExcelReporteDinamicoTipoServicio;	
	
	
	
	//protected JButton jButtonAbrirImportacionTipoServicio;
	//protected JButton jButtonGenerarImportacionTipoServicio;
	//protected JButton jButtonCerrarImportacionTipoServicio;
	//protected JFileChooser jFileChooserImportacionTipoServicio;
	//protected File fileImportacionTipoServicio;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoServicio;
	protected JButton jButtonDuplicarToolBarTipoServicio;
	protected JButton jButtonNuevoRelacionesToolBarTipoServicio;
	
	
	public JButton jButtonGuardarCambiosToolBarTipoServicio;
	protected JButton jButtonCopiarToolBarTipoServicio;
	protected JButton jButtonVerFormToolBarTipoServicio;
	public JButton jButtonGuardarCambiosTablaToolBarTipoServicio;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoServicio;
	protected JButton jButtonCerrarToolBarTipoServicio;
	
	protected JButton jButtonRecargarInformacionToolBarTipoServicio;
	protected JButton jButtonProcesarInformacionToolBarTipoServicio;
	protected JButton jButtonAnterioresToolBarTipoServicio;
	protected JButton jButtonSiguientesToolBarTipoServicio;
	protected JButton jButtonNuevoGuardarCambiosToolBarTipoServicio;
	protected JButton jButtonAbrirOrderByToolBarTipoServicio;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoServicio;
	protected JMenuItem jMenuItemDuplicarTipoServicio;
	protected JMenuItem jMenuItemNuevoRelacionesTipoServicio;
	
	
	protected JMenuItem jMenuItemGuardarCambiosTipoServicio;
	protected JMenuItem jMenuItemCopiarTipoServicio;
	protected JMenuItem jMenuItemVerFormTipoServicio;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoServicio;
	protected JMenuItem jMenuItemCerrarTipoServicio;
	protected JMenuItem jMenuItemDetalleCerrarTipoServicio;
	protected JMenuItem jMenuItemDetalleAbrirOrderByTipoServicio;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoServicio;
	
	protected JMenuItem jMenuItemRecargarInformacionTipoServicio;
	protected JMenuItem jMenuItemProcesarInformacionTipoServicio;
	protected JMenuItem jMenuItemAnterioresTipoServicio;
	protected JMenuItem jMenuItemSiguientesTipoServicio;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoServicio;
	protected JMenuItem jMenuItemAbrirOrderByTipoServicio;
	protected JMenuItem jMenuItemMostrarOcultarTipoServicio;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoServicio;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosTipoServicio;
	protected JCheckBox jCheckBoxSeleccionadosTipoServicio;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaTipoServicio;
	protected JCheckBox jCheckBoxConGraficoReporteTipoServicio;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesTipoServicio;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesTipoServicio;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoTipoServicio;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoTipoServicio;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesTipoServicio;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionTipoServicio;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoServicio;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoServicio;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarTipoServicio;
	protected JTextField jTextFieldValorCampoGeneralTipoServicio;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteTipoServicio;
	//public JList<Reporte> jListColumnasSelectReporteTipoServicio;
	//public JScrollPane jScrollColumnasSelectReporteTipoServicio;
	
	//public JLabel jLabelRelacionesSelectReporteTipoServicio;
	//public JList<Reporte> jListRelacionesSelectReporteTipoServicio;
	//public JScrollPane jScrollRelacionesSelectReporteTipoServicio;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoTipoServicio;
	//protected JCheckBox jCheckBoxConGraficoDinamicoTipoServicio;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoTipoServicio;
	//public JLabel jLabelTiposArchivoReporteDinamicoTipoServicio;
	
		
	//public JLabel jLabelArchivoImportacionTipoServicio;	
	//public JLabel jLabelPathArchivoImportacionTipoServicio;
	//protected JTextField jTextFieldPathArchivoImportacionTipoServicio;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoTipoServicio;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoTipoServicio;
	
	//public JLabel jLabelColumnaCategoriaValorTipoServicio;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorTipoServicio;
	
	//public JLabel jLabelColumnasValoresGraficoTipoServicio;
	//public JList<Reporte> jListColumnasValoresGraficoTipoServicio;
	//public JScrollPane jScrollColumnasValoresGraficoTipoServicio;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoTipoServicio;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoTipoServicio;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasTipoServicio;
	public JPanel jPanelBusquedaPorCodigoTipoServicio;
	public JButton jButtonBusquedaPorCodigoTipoServicio;
	public JPanel jPanelBusquedaPorNombreTipoServicio;
	public JButton jButtonBusquedaPorNombreTipoServicio;
	
	public JPanel jPanelcodigoBusquedaPorCodigoTipoServicio;
	public JLabel jLabelcodigoBusquedaPorCodigoTipoServicio;
	public JTextField jTextFieldcodigoBusquedaPorCodigoTipoServicio;
	public JButton jButtoncodigoBusquedaPorCodigoTipoServicioBusqueda= new JButtonMe();

	
	public JPanel jPanelnombreBusquedaPorNombreTipoServicio;
	public JLabel jLabelnombreBusquedaPorNombreTipoServicio;
	public JTextField jTextFieldnombreBusquedaPorNombreTipoServicio;
	public JButton jButtonnombreBusquedaPorNombreTipoServicioBusqueda= new JButtonMe();

	
	
	
	
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
	public TipoServicioJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("TipoServicio No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoServicioJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoServicio No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoServicioJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoServicio No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoServicioJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoServicio No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionTipoServicio)	{
		this.jButtonRecargarInformacionTipoServicio = jButtonRecargarInformacionTipoServicio;
	}
	
	public JButton getjButtonProcesarInformacionTipoServicio() {
		return this.jButtonProcesarInformacionTipoServicio;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoServicio)	{
		this.jButtonProcesarInformacionTipoServicio = jButtonProcesarInformacionTipoServicio;
	}
	
	
	public JButton getjButtonRecargarInformacionTipoServicio() {
		return this.jButtonRecargarInformacionTipoServicio;
	}
	
	
	public List<TipoServicio> gettiposervicios() {
		return this.tiposervicios;
	}

	public void settiposervicios(List<TipoServicio> tiposervicios) {
		this.tiposervicios = tiposervicios;
	}
	
	public List<TipoServicio> gettiposerviciosAux() {
		return this.tiposerviciosAux;
	}

	public void settiposerviciosAux(List<TipoServicio> tiposerviciosAux) {
		this.tiposerviciosAux = tiposerviciosAux;
	}
	
	public List<TipoServicio> gettiposerviciosEliminados() {
		return this.tiposerviciosEliminados;
	}

	public void setTipoServiciosEliminados(List<TipoServicio> tiposerviciosEliminados) {
		this.tiposerviciosEliminados = tiposerviciosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarTipoServicio() {
		return jComboBoxTiposSeleccionarTipoServicio;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarTipoServicio(
			JComboBox jComboBoxTiposSeleccionarTipoServicio) {
		this.jComboBoxTiposSeleccionarTipoServicio = jComboBoxTiposSeleccionarTipoServicio;
	}
	
	public void setBorderResaltarTiposSeleccionarTipoServicio() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarTipoServicio.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarTipoServicio .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralTipoServicio() {
		return jTextFieldValorCampoGeneralTipoServicio;
	}

	public void setjTextFieldValorCampoGeneralTipoServicio(
			JTextField jTextFieldValorCampoGeneralTipoServicio) {
		this.jTextFieldValorCampoGeneralTipoServicio = jTextFieldValorCampoGeneralTipoServicio;
	}

	public void setBorderResaltarValorCampoGeneralTipoServicio() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoServicio.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralTipoServicio .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosTipoServicio() {
		return this.jCheckBoxSeleccionarTodosTipoServicio;
	}

	public void setjCheckBoxSeleccionarTodosTipoServicio(
			JCheckBox jCheckBoxSeleccionarTodosTipoServicio) {
		this.jCheckBoxSeleccionarTodosTipoServicio = jCheckBoxSeleccionarTodosTipoServicio;
	}

	public void setBorderResaltarSeleccionarTodosTipoServicio() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoServicio.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosTipoServicio .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosTipoServicio() {
		return this.jCheckBoxSeleccionadosTipoServicio;
	}

	public void setjCheckBoxSeleccionadosTipoServicio(
			JCheckBox jCheckBoxSeleccionadosTipoServicio) {
		this.jCheckBoxSeleccionadosTipoServicio = jCheckBoxSeleccionadosTipoServicio;
	}
	
	public void setBorderResaltarSeleccionadosTipoServicio() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoServicio.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosTipoServicio .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesTipoServicio() {
		return this.jComboBoxTiposArchivosReportesTipoServicio;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesTipoServicio(
			JComboBox jComboBoxTiposArchivosReportesTipoServicio) {
		this.jComboBoxTiposArchivosReportesTipoServicio = jComboBoxTiposArchivosReportesTipoServicio;
	}

	public void setBorderResaltarTiposArchivosReportesTipoServicio() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoServicio.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesTipoServicio .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesTipoServicio() {
		return this.jComboBoxTiposReportesTipoServicio;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesTipoServicio(
			JComboBox jComboBoxTiposReportesTipoServicio) {
		this.jComboBoxTiposReportesTipoServicio = jComboBoxTiposReportesTipoServicio;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoTipoServicio() {
	//	return jComboBoxTiposReportesDinamicoTipoServicio;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoTipoServicio(
	//		JComboBox jComboBoxTiposReportesDinamicoTipoServicio) {
	//	this.jComboBoxTiposReportesDinamicoTipoServicio = jComboBoxTiposReportesDinamicoTipoServicio;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoTipoServicio() {
	//	return jComboBoxTiposArchivosReportesDinamicoTipoServicio;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoTipoServicio(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoTipoServicio) {
	//	this.jComboBoxTiposArchivosReportesDinamicoTipoServicio = jComboBoxTiposArchivosReportesDinamicoTipoServicio;
	//}
	
	public void setBorderResaltarTiposReportesTipoServicio() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoServicio.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesTipoServicio .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesTipoServicio() {
		return this.jComboBoxTiposGraficosReportesTipoServicio;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesTipoServicio(
			JComboBox jComboBoxTiposGraficosReportesTipoServicio) {
		this.jComboBoxTiposGraficosReportesTipoServicio = jComboBoxTiposGraficosReportesTipoServicio;
	}
	
	public void setBorderResaltarTiposGraficosReportesTipoServicio() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoServicio.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesTipoServicio .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionTipoServicio() {
		return this.jComboBoxTiposPaginacionTipoServicio;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionTipoServicio(
			JComboBox jComboBoxTiposPaginacionTipoServicio) {
		this.jComboBoxTiposPaginacionTipoServicio = jComboBoxTiposPaginacionTipoServicio;
	}
	
	public void setBorderResaltarTiposPaginacionTipoServicio() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoServicio.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionTipoServicio .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesTipoServicio() {
		return this.jComboBoxTiposRelacionesTipoServicio;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoServicio() {
		return this.jComboBoxTiposAccionesTipoServicio;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoServicio(
			JComboBox jComboBoxTiposRelacionesTipoServicio) {
		this.jComboBoxTiposRelacionesTipoServicio = jComboBoxTiposRelacionesTipoServicio;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoServicio(
			JComboBox jComboBoxTiposAccionesTipoServicio) {
		this.jComboBoxTiposAccionesTipoServicio = jComboBoxTiposAccionesTipoServicio;
	}
	
	public void setBorderResaltarTiposRelacionesTipoServicio() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoServicio.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesTipoServicio .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesTipoServicio() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoServicio.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesTipoServicio .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoTipoServicio() {
	//	return jCheckBoxConGraficoDinamicoTipoServicio;
	//}

	//public void setjCheckBoxConGraficoDinamicoTipoServicio(
	//		JCheckBox jCheckBoxConGraficoDinamicoTipoServicio) {
	//	this.jCheckBoxConGraficoDinamicoTipoServicio = jCheckBoxConGraficoDinamicoTipoServicio;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoTipoServicio() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarTipoServicio.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoTipoServicio .setBorder(borderResaltar);		
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
		this.tiposervicioSessionBean=new TipoServicioSessionBean();
		
		this.tiposervicioSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tiposervicioSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tiposervicioSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=TipoServicioJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=TipoServicioJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoServicioJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoServicioJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoServicioJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Servicio MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.tiposervicioSessionBean.getEsGuardarRelacionado()) {
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
		
		TipoServicioJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("TipoServicio No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarTipoServicio= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarTipoServicio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarTipoServicio,this.jTtoolBarTipoServicio,
							"nuevo","nuevo","Nuevo"+" "+TipoServicioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoServicio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarTipoServicio,this.jTtoolBarTipoServicio,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoServicio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarTipoServicio,this.jTtoolBarTipoServicio,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+TipoServicioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarTipoServicio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarTipoServicio,this.jTtoolBarTipoServicio,
							"duplicar","duplicar","Duplicar"+" "+TipoServicioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarTipoServicio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarTipoServicio,this.jTtoolBarTipoServicio,
							"copiar","copiar","Copiar"+" "+TipoServicioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarTipoServicio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarTipoServicio,this.jTtoolBarTipoServicio,
							"ver_form","ver_form","Ver"+" "+TipoServicioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarTipoServicio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoServicio,this.jTtoolBarTipoServicio,
							"recargar","recargar","Recargar"+" "+TipoServicioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarTipoServicio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoServicio,this.jTtoolBarTipoServicio,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarTipoServicio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoServicio,this.jTtoolBarTipoServicio,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarTipoServicio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarTipoServicio,this.jTtoolBarTipoServicio,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarTipoServicio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarTipoServicio,this.jTtoolBarTipoServicio,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarTipoServicio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarTipoServicio,this.jTtoolBarTipoServicio,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+TipoServicioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarTipoServicio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarTipoServicio,this.jTtoolBarTipoServicio,
							"cerrar","cerrar","Salir"+" "+TipoServicioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarTipoServicio=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarTipoServicio;
			
				this.jButtonProcesarInformacionToolBarTipoServicio=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarTipoServicio;
				
		//protected JButton jButtonModificarToolBarTipoServicio;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarTipoServicio=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuTipoServicio=new JMenuMe("General");
		this.jmenuArchivoTipoServicio=new JMenuMe("Archivo");
		this.jmenuAccionesTipoServicio=new JMenuMe("Acciones");
		this.jmenuDatosTipoServicio=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoServicio= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoServicio.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoServicio,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoServicio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarTipoServicio= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarTipoServicio.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarTipoServicio,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarTipoServicio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesTipoServicio= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesTipoServicio.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesTipoServicio,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesTipoServicio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosTipoServicio= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoServicio.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoServicio,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoServicio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarTipoServicio= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarTipoServicio.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarTipoServicio,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarTipoServicio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormTipoServicio= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormTipoServicio.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormTipoServicio,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormTipoServicio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaTipoServicio= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaTipoServicio.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaTipoServicio,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaTipoServicio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoServicio= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoServicio.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoServicio,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoServicio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionTipoServicio= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionTipoServicio.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionTipoServicio,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionTipoServicio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionTipoServicio= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionTipoServicio.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionTipoServicio,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresTipoServicio= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresTipoServicio.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresTipoServicio,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresTipoServicio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesTipoServicio= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesTipoServicio.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesTipoServicio,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesTipoServicio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByTipoServicio= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByTipoServicio.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByTipoServicio,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByTipoServicio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoServicio= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoServicio.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoServicio,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoServicio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByTipoServicio= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByTipoServicio.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByTipoServicio,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByTipoServicio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoServicio= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoServicio.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoServicio,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoServicio, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosTipoServicio= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosTipoServicio.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosTipoServicio,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosTipoServicio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoTipoServicio.add(this.jMenuItemCerrarTipoServicio);
			
			this.jmenuAccionesTipoServicio.add(this.jMenuItemNuevoTipoServicio);
			this.jmenuAccionesTipoServicio.add(this.jMenuItemNuevoGuardarCambiosTipoServicio);
			this.jmenuAccionesTipoServicio.add(this.jMenuItemNuevoRelacionesTipoServicio);
			this.jmenuAccionesTipoServicio.add(this.jMenuItemGuardarCambiosTablaTipoServicio);		
			this.jmenuAccionesTipoServicio.add(this.jMenuItemDuplicarTipoServicio);		
			this.jmenuAccionesTipoServicio.add(this.jMenuItemCopiarTipoServicio);		
			this.jmenuAccionesTipoServicio.add(this.jMenuItemVerFormTipoServicio);		
			
			this.jmenuDatosTipoServicio.add(this.jMenuItemRecargarInformacionTipoServicio);				
			this.jmenuDatosTipoServicio.add(this.jMenuItemAnterioresTipoServicio);				
			this.jmenuDatosTipoServicio.add(this.jMenuItemSiguientesTipoServicio);				
			this.jmenuDatosTipoServicio.add(this.jMenuItemAbrirOrderByTipoServicio);				
			this.jmenuDatosTipoServicio.add(this.jMenuItemMostrarOcultarTipoServicio);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesTipoServicio.add(this.jMenuItemGuardarCambiosTipoServicio);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoTipoServicio, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesTipoServicio, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosTipoServicio, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarTipoServicio.add(this.jmenuArchivoTipoServicio);		
			this.jmenuBarTipoServicio.add(this.jmenuAccionesTipoServicio);		
			this.jmenuBarTipoServicio.add(this.jmenuDatosTipoServicio);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarTipoServicio);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasTipoServicio() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaPorCodigoTipoServicio=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorCodigoTipoServicio.setToolTipText("Buscar Por Codigo ");
		this.jButtonBusquedaPorCodigoTipoServicio= new JButtonMe();
		this.jButtonBusquedaPorCodigoTipoServicio.setText("Buscar");
		this.jButtonBusquedaPorCodigoTipoServicio.setToolTipText("Buscar Por Codigo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorCodigoTipoServicio,"buscar_button","Buscar Por Codigo ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorCodigoTipoServicio, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelcodigoBusquedaPorCodigoTipoServicio = new JLabelMe();
		jLabelcodigoBusquedaPorCodigoTipoServicio.setText("Codigo :");
		jLabelcodigoBusquedaPorCodigoTipoServicio.setToolTipText("Codigo");
		jLabelcodigoBusquedaPorCodigoTipoServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelcodigoBusquedaPorCodigoTipoServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelcodigoBusquedaPorCodigoTipoServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelcodigoBusquedaPorCodigoTipoServicio,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextFieldcodigoBusquedaPorCodigoTipoServicio= new JTextFieldMe();
		jTextFieldcodigoBusquedaPorCodigoTipoServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoBusquedaPorCodigoTipoServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoBusquedaPorCodigoTipoServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoBusquedaPorCodigoTipoServicio,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelBusquedaPorNombreTipoServicio=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorNombreTipoServicio.setToolTipText("Buscar Por Nombre ");
		this.jButtonBusquedaPorNombreTipoServicio= new JButtonMe();
		this.jButtonBusquedaPorNombreTipoServicio.setText("Buscar");
		this.jButtonBusquedaPorNombreTipoServicio.setToolTipText("Buscar Por Nombre ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorNombreTipoServicio,"buscar_button","Buscar Por Nombre ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorNombreTipoServicio, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelnombreBusquedaPorNombreTipoServicio = new JLabelMe();
		jLabelnombreBusquedaPorNombreTipoServicio.setText("Nombre :");
		jLabelnombreBusquedaPorNombreTipoServicio.setToolTipText("Nombre");
		jLabelnombreBusquedaPorNombreTipoServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombreTipoServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombreTipoServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelnombreBusquedaPorNombreTipoServicio,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextFieldnombreBusquedaPorNombreTipoServicio= new JTextFieldMe();
		jTextFieldnombreBusquedaPorNombreTipoServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombreBusquedaPorNombreTipoServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombreBusquedaPorNombreTipoServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnombreBusquedaPorNombreTipoServicio,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasTipoServicio=new JTabbedPane();


		this.jTabbedPaneBusquedasTipoServicio.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoServicio.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoServicio.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasTipoServicio.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasTipoServicio.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasTipoServicio,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleTipoServicio = new TipoServicioDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Tipo Servicio DATOS");
			this.jInternalFrameDetalleFormTipoServicio = new TipoServicioDetalleFormJInternalFrame(jDesktopPane,this.tiposervicioSessionBean.getConGuardarRelaciones(),this.tiposervicioSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormTipoServicio = null;//new TipoServicioDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoServicio= new GridBagLayout();
		
		
		this.jTableDatosTipoServicio = new JTableMe();      
		
		String sToolTipTipoServicio="";
		sToolTipTipoServicio=TipoServicioConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoServicio+="(Inventario.TipoServicio)";
		}
		
		if(!this.tiposervicioSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoServicio+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosTipoServicio.setToolTipText(sToolTipTipoServicio);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosTipoServicio);
		this.jTableDatosTipoServicio.setAutoCreateRowSorter(true);
		this.jTableDatosTipoServicio.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosTipoServicio.setRowSelectionAllowed(true);
		this.jTableDatosTipoServicio.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosTipoServicio,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoTipoServicio = new JButtonMe();
		this.jButtonDuplicarTipoServicio = new JButtonMe();
		this.jButtonCopiarTipoServicio = new JButtonMe();
		this.jButtonVerFormTipoServicio = new JButtonMe();
		this.jButtonNuevoRelacionesTipoServicio = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaTipoServicio = new JButtonMe();
		this.jButtonCerrarTipoServicio = new JButtonMe();
		
		this.jScrollPanelDatosTipoServicio = new JScrollPane();   
        this.jScrollPanelDatosGeneralTipoServicio = new JScrollPane();
		
				
		
		
		this.jPanelAccionesTipoServicio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Servicio";
		
		if(!this.tiposervicioSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoServicio.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Servicioes" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoServicio.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralTipoServicio.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesTipoServicio.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoServicio.setToolTipText("Acciones");
        this.jPanelAccionesTipoServicio.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoServicio, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoServicio, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoTipoServicio=new ReporteDinamicoJInternalFrame(TipoServicioConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoTipoServicio();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionTipoServicio=new ImportacionJInternalFrame(TipoServicioConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionTipoServicio();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByTipoServicio = new JButtonMe();
		
		this.jButtonAbrirOrderByTipoServicio.setText("Orden");
		this.jButtonAbrirOrderByTipoServicio.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoServicio,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoServicio, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByTipoServicio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByTipoServicio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoServicio=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoServicio,false,this);
			
			//this.cargarOrderByTipoServicio(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoServicio=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoServicio,true,this);
			
			//this.cargarOrderByTipoServicio(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosTipoServicio.setMinimumSize(new Dimension(400,50));//430
		this.jTableDatosTipoServicio.setMaximumSize(new Dimension(400,50));//430
		this.jTableDatosTipoServicio.setPreferredSize(new Dimension(400,50));//430
		
		this.jScrollPanelDatosTipoServicio.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoServicio.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoServicio.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoTipoServicio.setText("Nuevo");
		this.jButtonDuplicarTipoServicio.setText("Duplicar");
		this.jButtonCopiarTipoServicio.setText("Copiar");
		this.jButtonVerFormTipoServicio.setText("Ver");
		this.jButtonNuevoRelacionesTipoServicio.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaTipoServicio.setText("Guardar");
		this.jButtonCerrarTipoServicio.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoServicio,"nuevo_button","Nuevo",this.tiposervicioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarTipoServicio,"duplicar_button","Duplicar",this.tiposervicioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarTipoServicio,"copiar_button","Copiar",this.tiposervicioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormTipoServicio,"ver_form","Ver",this.tiposervicioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesTipoServicio,"nuevorelaciones_button","Nuevo Rel",this.tiposervicioSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoServicio,"guardarcambiostabla_button","Guardar",this.tiposervicioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoServicio,"cerrar_button","Salir",this.tiposervicioSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoServicio, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarTipoServicio, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarTipoServicio, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormTipoServicio, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesTipoServicio, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoServicio, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoServicio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoTipoServicio.setToolTipText("Nuevo"+" "+TipoServicioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarTipoServicio.setToolTipText("Duplicar"+" "+TipoServicioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarTipoServicio.setToolTipText("Copiar"+" "+TipoServicioConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormTipoServicio.setToolTipText("Ver"+" "+TipoServicioConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesTipoServicio.setToolTipText("Nuevo Rel"+" "+TipoServicioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaTipoServicio.setToolTipText("Guardar"+" "+TipoServicioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoServicio.setToolTipText("Salir"+" "+TipoServicioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoServicio";
		inputMap = this.jButtonNuevoTipoServicio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoServicio.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoServicio"));
		
		//DUPLICAR
		sMapKey = "DuplicarTipoServicio";
		inputMap = this.jButtonDuplicarTipoServicio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarTipoServicio.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarTipoServicio"));
		
		//COPIAR
		sMapKey = "CopiarTipoServicio";
		inputMap = this.jButtonCopiarTipoServicio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarTipoServicio.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarTipoServicio"));
		
		//VEr FORM
		sMapKey = "VerFormTipoServicio";
		inputMap = this.jButtonVerFormTipoServicio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormTipoServicio.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormTipoServicio"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesTipoServicio";
		inputMap = this.jButtonNuevoRelacionesTipoServicio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesTipoServicio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesTipoServicio"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarTipoServicio";
		inputMap = this.jButtonModificarTipoServicio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarTipoServicio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarTipoServicio"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarTipoServicio";
		inputMap = this.jButtonCerrarTipoServicio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoServicio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoServicio"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoServicio";
		inputMap = this.jButtonGuardarCambiosTablaTipoServicio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoServicio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoServicio"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesTipoServicio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesTipoServicio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionTipoServicio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1TipoServicio= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2TipoServicio= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3TipoServicio= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4TipoServicio= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5TipoServicio= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesTipoServicio.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesTipoServicio.setName("jPanelParametrosReportesTipoServicio"); 
		
		this.jPanelParametrosReportesAccionesTipoServicio.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesTipoServicio.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesTipoServicio.setName("jPanelParametrosReportesAccionesTipoServicio"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesTipoServicio, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesTipoServicio, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionTipoServicio = new JButtonMe();
		this.jButtonRecargarInformacionTipoServicio.setText("Recargar");
		this.jButtonRecargarInformacionTipoServicio.setToolTipText("Recargar"+" "+TipoServicioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionTipoServicio,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionTipoServicio = new JButtonMe();
		this.jButtonProcesarInformacionTipoServicio.setText("Procesar");
		this.jButtonProcesarInformacionTipoServicio.setToolTipText("Procesar"+" "+TipoServicioConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionTipoServicio.setVisible(false);
			
		this.jButtonProcesarInformacionTipoServicio.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoServicio.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoServicio.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesTipoServicio = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoServicio.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesTipoServicio.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesTipoServicio = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoServicio.setText("TIPO");       
		this.jComboBoxTiposReportesTipoServicio.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesTipoServicio = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoServicio.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesTipoServicio.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionTipoServicio = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionTipoServicio.setText("Paginacion");
		this.jComboBoxTiposPaginacionTipoServicio.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesTipoServicio = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesTipoServicio.setText("Accion");
		this.jComboBoxTiposRelacionesTipoServicio.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesTipoServicio = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoServicio.setText("Accion");
		this.jComboBoxTiposAccionesTipoServicio.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarTipoServicio = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarTipoServicio.setText("Accion");
		this.jComboBoxTiposSeleccionarTipoServicio.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralTipoServicio=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralTipoServicio.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoServicio.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoServicio.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesTipoServicio = new JLabelMe();
		
		this.jLabelAccionesTipoServicio.setText("Acciones");		
		this.jLabelAccionesTipoServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosTipoServicio = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosTipoServicio.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosTipoServicio.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosTipoServicio = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosTipoServicio.setText("Seleccionados");
		this.jCheckBoxSeleccionadosTipoServicio.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaTipoServicio = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaTipoServicio.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaTipoServicio.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteTipoServicio = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteTipoServicio.setText("Graf.");
		this.jCheckBoxConGraficoReporteTipoServicio.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresTipoServicio = new JButtonMe();
		//this.jButtonAnterioresTipoServicio.setText("<<");
        this.jButtonAnterioresTipoServicio.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresTipoServicio,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresTipoServicio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesTipoServicio = new JButtonMe();
		//this.jButtonSiguientesTipoServicio.setText(">>");
        this.jButtonSiguientesTipoServicio.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesTipoServicio,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesTipoServicio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosTipoServicio = new JButtonMe();
		this.jButtonNuevoGuardarCambiosTipoServicio.setText("Nue");
        this.jButtonNuevoGuardarCambiosTipoServicio.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosTipoServicio,"nuevoguardarcambios_button","Nue",this.tiposervicioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosTipoServicio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosTipoServicio";
		inputMap = this.jButtonNuevoGuardarCambiosTipoServicio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosTipoServicio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosTipoServicio"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionTipoServicio";
		inputMap = this.jButtonRecargarInformacionTipoServicio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionTipoServicio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionTipoServicio"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesTipoServicio";
		inputMap = this.jButtonSiguientesTipoServicio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesTipoServicio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesTipoServicio"));
		
		//ANTERIORES		
		sMapKey = "AnterioresTipoServicio";
		inputMap = this.jButtonAnterioresTipoServicio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresTipoServicio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresTipoServicio"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasTipoServicio();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesTipoServicio.setMinimumSize(new Dimension(this.getWidth(),TipoServicioBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoServicioBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoServicio.setMaximumSize(new Dimension(this.getWidth(),TipoServicioBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoServicioBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoServicio.setPreferredSize(new Dimension(this.getWidth(),TipoServicioBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoServicioBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionTipoServicio = new GridBagLayout();

			this.jPanelPaginacionTipoServicio.setLayout(gridaBagLayoutPaginacionTipoServicio);						
			
			this.gridBagConstraintsTipoServicio = new GridBagConstraints();
			this.gridBagConstraintsTipoServicio.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsTipoServicio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoServicio.gridy = 0;
			this.gridBagConstraintsTipoServicio.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionTipoServicio.add(this.jButtonAnterioresTipoServicio, this.gridBagConstraintsTipoServicio);
					
						
			this.gridBagConstraintsTipoServicio = new GridBagConstraints();
			this.gridBagConstraintsTipoServicio.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoServicio.gridy = 0;
			
			this.jPanelPaginacionTipoServicio.add(this.jButtonNuevoGuardarCambiosTipoServicio, this.gridBagConstraintsTipoServicio);
						
			
			this.gridBagConstraintsTipoServicio = new GridBagConstraints();
			this.gridBagConstraintsTipoServicio.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsTipoServicio.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoServicio.gridy = 0;
			this.jPanelPaginacionTipoServicio.add(this.jButtonSiguientesTipoServicio, this.gridBagConstraintsTipoServicio);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsTipoServicio = new GridBagConstraints();
			this.gridBagConstraintsTipoServicio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoServicio.gridy = 1;
			this.gridBagConstraintsTipoServicio.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoServicio.add(this.jButtonNuevoTipoServicio, this.gridBagConstraintsTipoServicio);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsTipoServicio = new GridBagConstraints();
				this.gridBagConstraintsTipoServicio.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoServicio.gridy = 1;
				this.gridBagConstraintsTipoServicio.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionTipoServicio.add(this.jButtonNuevoRelacionesTipoServicio, this.gridBagConstraintsTipoServicio);
			}
			
			
			if(!this.tiposervicioSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsTipoServicio = new GridBagConstraints();
				this.gridBagConstraintsTipoServicio.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoServicio.gridy = 1;
				this.gridBagConstraintsTipoServicio.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionTipoServicio.add(this.jButtonGuardarCambiosTablaTipoServicio, this.gridBagConstraintsTipoServicio);
			}
			
			
			
			this.gridBagConstraintsTipoServicio = new GridBagConstraints();
			this.gridBagConstraintsTipoServicio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoServicio.gridy = 1;
			this.gridBagConstraintsTipoServicio.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoServicio.add(this.jButtonDuplicarTipoServicio, this.gridBagConstraintsTipoServicio);
			
			this.gridBagConstraintsTipoServicio = new GridBagConstraints();
			this.gridBagConstraintsTipoServicio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoServicio.gridy = 1;
			this.gridBagConstraintsTipoServicio.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoServicio.add(this.jButtonCopiarTipoServicio, this.gridBagConstraintsTipoServicio);
		
			this.gridBagConstraintsTipoServicio = new GridBagConstraints();
			this.gridBagConstraintsTipoServicio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoServicio.gridy = 1;
			this.gridBagConstraintsTipoServicio.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoServicio.add(this.jButtonVerFormTipoServicio, this.gridBagConstraintsTipoServicio);
		
			this.gridBagConstraintsTipoServicio = new GridBagConstraints();
			this.gridBagConstraintsTipoServicio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoServicio.gridy = 1;
			this.gridBagConstraintsTipoServicio.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionTipoServicio.add(this.jButtonCerrarTipoServicio, this.gridBagConstraintsTipoServicio);
		
		
		
		this.jButtonRecargarInformacionTipoServicio.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoServicio.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoServicio.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionTipoServicio, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesTipoServicio.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoServicio.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoServicio.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesTipoServicio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesTipoServicio.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoServicio.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoServicio.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesTipoServicio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesTipoServicio.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoServicio.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoServicio.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesTipoServicio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionTipoServicio.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoServicio.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoServicio.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionTipoServicio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesTipoServicio.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoServicio.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoServicio.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesTipoServicio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesTipoServicio.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoServicio.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoServicio.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoServicio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarTipoServicio.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoServicio.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoServicio.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarTipoServicio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaTipoServicio.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoServicio.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoServicio.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaTipoServicio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteTipoServicio.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoServicio.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoServicio.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteTipoServicio, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosTipoServicio.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoServicio.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoServicio.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosTipoServicio, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosTipoServicio.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoServicio.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoServicio.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosTipoServicio, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesTipoServicio = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesTipoServicio = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1TipoServicio = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2TipoServicio = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3TipoServicio = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4TipoServicio = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesTipoServicio.setLayout(gridaBagParametrosReportesTipoServicio);
			this.jPanelParametrosReportesAccionesTipoServicio.setLayout(gridaBagParametrosReportesAccionesTipoServicio);
			
			
			this.jPanelParametrosAuxiliar1TipoServicio.setLayout(gridaBagParametrosAuxiliar1TipoServicio);
			this.jPanelParametrosAuxiliar2TipoServicio.setLayout(gridaBagParametrosAuxiliar2TipoServicio);
			this.jPanelParametrosAuxiliar3TipoServicio.setLayout(gridaBagParametrosAuxiliar3TipoServicio);
			this.jPanelParametrosAuxiliar4TipoServicio.setLayout(gridaBagParametrosAuxiliar4TipoServicio);
			//this.jPanelParametrosAuxiliar5TipoServicio.setLayout(gridaBagParametrosAuxiliar2TipoServicio);			
			
			
			
			
			this.gridBagConstraintsTipoServicio = new GridBagConstraints();
			this.gridBagConstraintsTipoServicio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoServicio.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoServicio.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoServicio.add(this.jButtonRecargarInformacionTipoServicio, this.gridBagConstraintsTipoServicio);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsTipoServicio = new GridBagConstraints();
			this.gridBagConstraintsTipoServicio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoServicio.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoServicio.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoServicio.add(this.jComboBoxTiposPaginacionTipoServicio, this.gridBagConstraintsTipoServicio);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsTipoServicio = new GridBagConstraints();
			this.gridBagConstraintsTipoServicio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoServicio.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoServicio.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoServicio.add(this.jCheckBoxConAltoMaximoTablaTipoServicio, this.gridBagConstraintsTipoServicio);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsTipoServicio = new GridBagConstraints();
			this.gridBagConstraintsTipoServicio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoServicio.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoServicio.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoServicio.add(this.jComboBoxTiposArchivosReportesTipoServicio, this.gridBagConstraintsTipoServicio);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsTipoServicio = new GridBagConstraints();
			this.gridBagConstraintsTipoServicio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoServicio.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoServicio.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoServicio.add(this.jPanelParametrosAuxiliar1TipoServicio, this.gridBagConstraintsTipoServicio);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsTipoServicio = new GridBagConstraints();
			this.gridBagConstraintsTipoServicio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoServicio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoServicio.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoServicio.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4TipoServicio.add(this.jComboBoxTiposReportesTipoServicio, this.gridBagConstraintsTipoServicio);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsTipoServicio = new GridBagConstraints();
			this.gridBagConstraintsTipoServicio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoServicio.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoServicio.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoServicio.add(this.jPanelParametrosAuxiliar4TipoServicio, this.gridBagConstraintsTipoServicio);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsTipoServicio = new GridBagConstraints();
			this.gridBagConstraintsTipoServicio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoServicio.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoServicio.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoServicio.add(this.jComboBoxTiposReportesTipoServicio, this.gridBagConstraintsTipoServicio);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsTipoServicio = new GridBagConstraints();
			this.gridBagConstraintsTipoServicio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoServicio.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoServicio.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoServicio.add(this.jCheckBoxGenerarReporteTipoServicio, this.gridBagConstraintsTipoServicio);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsTipoServicio = new GridBagConstraints();
			this.gridBagConstraintsTipoServicio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoServicio.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoServicio.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoServicio.add(this.jPanelParametrosAuxiliar2TipoServicio, this.gridBagConstraintsTipoServicio);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsTipoServicio = new GridBagConstraints();
			this.gridBagConstraintsTipoServicio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoServicio.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoServicio.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoServicio.add(this.jLabelAccionesTipoServicio, this.gridBagConstraintsTipoServicio);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsTipoServicio = new GridBagConstraints();
				this.gridBagConstraintsTipoServicio.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsTipoServicio.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsTipoServicio.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesTipoServicio.add(this.jButtonAbrirOrderByTipoServicio, this.gridBagConstraintsTipoServicio);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsTipoServicio = new GridBagConstraints();
			this.gridBagConstraintsTipoServicio.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsTipoServicio.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoServicio.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoServicio.add(this.jComboBoxTiposSeleccionarTipoServicio, this.gridBagConstraintsTipoServicio);			
			
			
			/*
			this.gridBagConstraintsTipoServicio = new GridBagConstraints();
			this.gridBagConstraintsTipoServicio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoServicio.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoServicio.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoServicio.add(this.jCheckBoxSeleccionarTodosTipoServicio, this.gridBagConstraintsTipoServicio);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsTipoServicio = new GridBagConstraints();
			this.gridBagConstraintsTipoServicio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoServicio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoServicio.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoServicio.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoServicio.add(this.jCheckBoxSeleccionarTodosTipoServicio, this.gridBagConstraintsTipoServicio);															
				
			this.gridBagConstraintsTipoServicio = new GridBagConstraints();
			this.gridBagConstraintsTipoServicio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoServicio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoServicio.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoServicio.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoServicio.add(this.jCheckBoxSeleccionadosTipoServicio, this.gridBagConstraintsTipoServicio);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsTipoServicio = new GridBagConstraints();
			this.gridBagConstraintsTipoServicio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoServicio.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoServicio.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoServicio.add(this.jPanelParametrosAuxiliar3TipoServicio, this.gridBagConstraintsTipoServicio);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsTipoServicio = new GridBagConstraints();
			this.gridBagConstraintsTipoServicio.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoServicio.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoServicio.add(this.jComboBoxTiposRelacionesTipoServicio, this.gridBagConstraintsTipoServicio);
				
			this.gridBagConstraintsTipoServicio = new GridBagConstraints();
			this.gridBagConstraintsTipoServicio.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoServicio.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoServicio.add(this.jComboBoxTiposAccionesTipoServicio, this.gridBagConstraintsTipoServicio);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosTipoServicio = new GridBagLayout();

			this.jScrollPanelDatosTipoServicio.setLayout(gridaBagLayoutDatosTipoServicio);
			
			this.gridBagConstraintsTipoServicio = new GridBagConstraints();
			this.gridBagConstraintsTipoServicio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoServicio.gridy = 0;
			this.gridBagConstraintsTipoServicio.gridx = 0;
			
			this.jScrollPanelDatosTipoServicio.add(this.jTableDatosTipoServicio, this.gridBagConstraintsTipoServicio);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosTipoServicio.setViewportView(this.jTableDatosTipoServicio);
		this.jTableDatosTipoServicio.setFillsViewportHeight(true);
		this.jTableDatosTipoServicio.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesTipoServicio= new GridBagLayout();
		this.jPanelAccionesTipoServicio.setLayout(gridaBagLayoutAccionesTipoServicio);
		
		
		/*	
		this.gridBagConstraintsTipoServicio = new GridBagConstraints();
		this.gridBagConstraintsTipoServicio.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoServicio.gridy = 0;
		this.gridBagConstraintsTipoServicio.gridx = 0;
			
		this.jPanelAccionesTipoServicio.add(this.jButtonNuevoTipoServicio, this.gridBagConstraintsTipoServicio);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaPorCodigoTipoServicio= new GridBagLayout();
		gridaBagLayoutBusquedaPorCodigoTipoServicio.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorCodigoTipoServicio.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorCodigoTipoServicio.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorCodigoTipoServicio.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorCodigoTipoServicio.setLayout(gridaBagLayoutBusquedaPorCodigoTipoServicio);

		gridBagConstraintsTipoServicio = new GridBagConstraints();
		gridBagConstraintsTipoServicio.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoServicio.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoServicio.gridy = 0;
		gridBagConstraintsTipoServicio.gridx = 0;
		jPanelBusquedaPorCodigoTipoServicio.add(jLabelcodigoBusquedaPorCodigoTipoServicio, gridBagConstraintsTipoServicio);

		gridBagConstraintsTipoServicio = new GridBagConstraints();
		gridBagConstraintsTipoServicio.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoServicio.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoServicio.gridy = 0;
		gridBagConstraintsTipoServicio.gridx = 1;
		jPanelBusquedaPorCodigoTipoServicio.add(jTextFieldcodigoBusquedaPorCodigoTipoServicio, gridBagConstraintsTipoServicio);

		gridBagConstraintsTipoServicio = new GridBagConstraints();
		gridBagConstraintsTipoServicio.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoServicio.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoServicio.gridy = 1;
		gridBagConstraintsTipoServicio.gridx =1;
		jPanelBusquedaPorCodigoTipoServicio.add(jButtonBusquedaPorCodigoTipoServicio, gridBagConstraintsTipoServicio);

		jTabbedPaneBusquedasTipoServicio.addTab("1.-Por Codigo ", jPanelBusquedaPorCodigoTipoServicio);
		jTabbedPaneBusquedasTipoServicio.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutBusquedaPorNombreTipoServicio= new GridBagLayout();
		gridaBagLayoutBusquedaPorNombreTipoServicio.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorNombreTipoServicio.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorNombreTipoServicio.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorNombreTipoServicio.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorNombreTipoServicio.setLayout(gridaBagLayoutBusquedaPorNombreTipoServicio);

		gridBagConstraintsTipoServicio = new GridBagConstraints();
		gridBagConstraintsTipoServicio.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoServicio.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoServicio.gridy = 0;
		gridBagConstraintsTipoServicio.gridx = 0;
		jPanelBusquedaPorNombreTipoServicio.add(jLabelnombreBusquedaPorNombreTipoServicio, gridBagConstraintsTipoServicio);

		gridBagConstraintsTipoServicio = new GridBagConstraints();
		gridBagConstraintsTipoServicio.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoServicio.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoServicio.gridy = 0;
		gridBagConstraintsTipoServicio.gridx = 1;
		jPanelBusquedaPorNombreTipoServicio.add(jTextFieldnombreBusquedaPorNombreTipoServicio, gridBagConstraintsTipoServicio);

		gridBagConstraintsTipoServicio = new GridBagConstraints();
		gridBagConstraintsTipoServicio.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoServicio.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoServicio.gridy = 1;
		gridBagConstraintsTipoServicio.gridx =1;
		jPanelBusquedaPorNombreTipoServicio.add(jButtonBusquedaPorNombreTipoServicio, gridBagConstraintsTipoServicio);

		jTabbedPaneBusquedasTipoServicio.addTab("2.-Por Nombre ", jPanelBusquedaPorNombreTipoServicio);
		jTabbedPaneBusquedasTipoServicio.setMnemonicAt(1, KeyEvent.VK_2);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoServicio = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoServicio);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tiposervicioSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoServicio = new GridBagConstraints();						
			this.gridBagConstraintsTipoServicio.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoServicio.gridx = 0;		
			//this.gridBagConstraintsTipoServicio.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoServicio.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoServicio.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarTipoServicio, this.gridBagConstraintsTipoServicio);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsTipoServicio = new GridBagConstraints();
		this.gridBagConstraintsTipoServicio.gridy = iGridyPrincipal++;
		this.gridBagConstraintsTipoServicio.gridx = 0;		
		//this.gridBagConstraintsTipoServicio.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoServicio.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsTipoServicio.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsTipoServicio);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsTipoServicio = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsTipoServicio.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoServicio.gridx = 0;		
			this.gridBagConstraintsTipoServicio.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoServicio.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsTipoServicio.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasTipoServicio, this.gridBagConstraintsTipoServicio);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsTipoServicio = new GridBagConstraints();
		this.gridBagConstraintsTipoServicio.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoServicio.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesTipoServicio, this.gridBagConstraintsTipoServicio);								
		
		
		/*
		this.gridBagConstraintsTipoServicio = new GridBagConstraints();
		this.gridBagConstraintsTipoServicio.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoServicio.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesTipoServicio, this.gridBagConstraintsTipoServicio);
		*/		
		
		this.gridBagConstraintsTipoServicio = new GridBagConstraints();
		this.gridBagConstraintsTipoServicio.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoServicio.gridx =0;
		this.gridBagConstraintsTipoServicio.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoServicio.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoServicio, this.gridBagConstraintsTipoServicio);
				
		
		this.gridBagConstraintsTipoServicio = new GridBagConstraints();
		this.gridBagConstraintsTipoServicio.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoServicio.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionTipoServicio, this.gridBagConstraintsTipoServicio);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(TipoServicioJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosTipoServicio= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoServicio = new GridBagLayout();
			this.jPanelBusquedasParametrosTipoServicio.setLayout(gridaBagLayoutBusquedasParametrosTipoServicio);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralTipoServicio=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoServicio.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoServicio.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoServicio.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoServicio = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsTipoServicio = new GridBagConstraints();
		this.gridBagConstraintsTipoServicio.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoServicio.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoServicio, this.gridBagConstraintsTipoServicio);
			
			
		this.gridBagConstraintsTipoServicio = new GridBagConstraints();
		this.gridBagConstraintsTipoServicio.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoServicio.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoServicio, this.gridBagConstraintsTipoServicio);
		
			
		this.gridBagConstraintsTipoServicio = new GridBagConstraints();
		this.gridBagConstraintsTipoServicio.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoServicio.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoServicio, this.gridBagConstraintsTipoServicio);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralTipoServicio;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoTipoServicio() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoTipoServicio = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoTipoServicio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoTipoServicio.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoTipoServicio.setName("jPanelReporteDinamicoTipoServicio"); 
		
		this.jPanelReporteDinamicoTipoServicio.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoServicio.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoServicio.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoTipoServicio.setLayout(gridaBagLayoutReporteDinamicoTipoServicio);
		
		
		this.jInternalFrameReporteDinamicoTipoServicio= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoTipoServicio = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoServicio= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoTipoServicio.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoTipoServicio.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoTipoServicio.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoTipoServicio.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoTipoServicio.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoTipoServicio.setResizable(true);
	    this.jInternalFrameReporteDinamicoTipoServicio.setClosable(true);
	    this.jInternalFrameReporteDinamicoTipoServicio.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoTipoServicio.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoServicio.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoServicio.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoTipoServicio.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Servicioes"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteTipoServicio = new JLabelMe();

		this.jLabelColumnasSelectReporteTipoServicio.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteTipoServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoServicio = new GridBagConstraints();
		this.gridBagConstraintsTipoServicio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoServicio.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoServicio.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoServicio.add(this.jLabelColumnasSelectReporteTipoServicio, this.gridBagConstraintsTipoServicio);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteTipoServicio = new JList<Reporte>();
		this.jListColumnasSelectReporteTipoServicio.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteTipoServicio.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteTipoServicio.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoServicio.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoServicio.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteTipoServicio=new JScrollPane(this.jListColumnasSelectReporteTipoServicio);
			
			this.jScrollColumnasSelectReporteTipoServicio.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoServicio.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoServicio.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteTipoServicio.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTipoServicio = new GridBagConstraints();
		this.gridBagConstraintsTipoServicio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoServicio.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoServicio.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoServicio.add(this.jListColumnasSelectReporteTipoServicio, this.gridBagConstraintsTipoServicio);
		this.jPanelReporteDinamicoTipoServicio.add(this.jScrollColumnasSelectReporteTipoServicio, this.gridBagConstraintsTipoServicio);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteTipoServicio = new JLabelMe();

		this.jLabelRelacionesSelectReporteTipoServicio.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteTipoServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsTipoServicio = new GridBagConstraints();
		this.gridBagConstraintsTipoServicio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoServicio.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoServicio.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoServicio.add(this.jLabelRelacionesSelectReporteTipoServicio, this.gridBagConstraintsTipoServicio);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteTipoServicio = new JList<Reporte>();
		this.jListRelacionesSelectReporteTipoServicio.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteTipoServicio.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteTipoServicio.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoServicio.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoServicio.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteTipoServicio=new JScrollPane(this.jListRelacionesSelectReporteTipoServicio);
			
			this.jScrollRelacionesSelectReporteTipoServicio.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoServicio.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoServicio.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteTipoServicio.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsTipoServicio = new GridBagConstraints();
		this.gridBagConstraintsTipoServicio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoServicio.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoServicio.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoServicio.add(this.jListRelacionesSelectReporteTipoServicio, this.gridBagConstraintsTipoServicio);
		this.jPanelReporteDinamicoTipoServicio.add(this.jScrollRelacionesSelectReporteTipoServicio, this.gridBagConstraintsTipoServicio);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoTipoServicio = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoTipoServicio = new JComboBoxMe();
		this.jListColumnasValoresGraficoTipoServicio = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoTipoServicio = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoTipoServicio.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoTipoServicio.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoServicio.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoServicio.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoTipoServicio, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoTipoServicio = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoTipoServicio.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoTipoServicio.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoServicio.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoServicio.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoTipoServicio, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoTipoServicio = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoTipoServicio.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoTipoServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoServicio = new GridBagConstraints();
		this.gridBagConstraintsTipoServicio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoServicio.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoServicio.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoServicio.add(this.jLabelGenerarExcelReporteDinamicoTipoServicio, this.gridBagConstraintsTipoServicio);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoTipoServicio = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoTipoServicio.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoTipoServicio,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoTipoServicio.setToolTipText("Generar EXCEL"+" "+TipoServicioConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsTipoServicio = new GridBagConstraints();
		//this.gridBagConstraintsTipoServicio.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsTipoServicio.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsTipoServicio.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoTipoServicio.add(this.jButtonGenerarExcelReporteDinamicoTipoServicio, this.gridBagConstraintsTipoServicio);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsTipoServicio = new GridBagConstraints();
		this.gridBagConstraintsTipoServicio.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoServicio.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoServicio.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoServicio.add(this.jComboBoxTiposReportesDinamicoTipoServicio, this.gridBagConstraintsTipoServicio);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoTipoServicio = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoTipoServicio.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoTipoServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoServicio = new GridBagConstraints();
		this.gridBagConstraintsTipoServicio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoServicio.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoServicio.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoServicio.add(this.jLabelTiposArchivoReporteDinamicoTipoServicio, this.gridBagConstraintsTipoServicio);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsTipoServicio = new GridBagConstraints();
		this.gridBagConstraintsTipoServicio.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoServicio.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoServicio.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoServicio.add(this.jComboBoxTiposArchivosReportesDinamicoTipoServicio, this.gridBagConstraintsTipoServicio);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoTipoServicio = new JButtonMe();
		this.jButtonGenerarReporteDinamicoTipoServicio.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoTipoServicio,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoTipoServicio.setToolTipText("Generar"+" "+TipoServicioConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsTipoServicio = new GridBagConstraints();
		this.gridBagConstraintsTipoServicio.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoServicio.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoServicio.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoServicio.add(this.jButtonGenerarReporteDinamicoTipoServicio, this.gridBagConstraintsTipoServicio);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoTipoServicio = new JButtonMe();
		this.jButtonCerrarReporteDinamicoTipoServicio.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoTipoServicio,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoTipoServicio.setToolTipText("Cancelar"+" "+TipoServicioConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoServicio = new GridBagConstraints();
		this.gridBagConstraintsTipoServicio.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoServicio.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoServicio.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoServicio.add(this.jButtonCerrarReporteDinamicoTipoServicio, this.gridBagConstraintsTipoServicio);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalTipoServicio = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoTipoServicio= new JScrollPane(jPanelReporteDinamicoTipoServicio,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoTipoServicio.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoServicio.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoServicio.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoTipoServicio.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Servicioes"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoServicio = new GridBagConstraints();
		this.gridBagConstraintsTipoServicio.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsTipoServicio.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsTipoServicio.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoTipoServicio.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoTipoServicio.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalTipoServicio);
		this.jInternalFrameReporteDinamicoTipoServicio.getContentPane().add(this.jScrollPanelReporteDinamicoTipoServicio, this.gridBagConstraintsTipoServicio);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionTipoServicio() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionTipoServicio = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionTipoServicio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionTipoServicio.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionTipoServicio.setName("jPanelImportacionTipoServicio"); 
		
		this.jPanelImportacionTipoServicio.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoServicio.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoServicio.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionTipoServicio.setLayout(gridaBagLayoutImportacionTipoServicio);
		
		
		this.jInternalFrameImportacionTipoServicio= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionTipoServicio= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionTipoServicio = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoServicio= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionTipoServicio.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoServicio.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoServicio.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionTipoServicio.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoServicio.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoServicio.setResizable(true);
	    this.jInternalFrameImportacionTipoServicio.setClosable(true);
	    this.jInternalFrameImportacionTipoServicio.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionTipoServicio.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoServicio.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoServicio.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionTipoServicio.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoServicio.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoServicio.setResizable(true);
	    this.jInternalFrameImportacionTipoServicio.setClosable(true);
	    this.jInternalFrameImportacionTipoServicio.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionTipoServicio.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoServicio.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoServicio.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionTipoServicio.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Servicioes"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionTipoServicio = new JLabelMe();

		this.jLabelArchivoImportacionTipoServicio.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionTipoServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoServicio = new GridBagConstraints();
		this.gridBagConstraintsTipoServicio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoServicio.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoServicio.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoServicio.add(this.jLabelArchivoImportacionTipoServicio, this.gridBagConstraintsTipoServicio);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionTipoServicio = new JFileChooser();		
		this.jFileChooserImportacionTipoServicio.setToolTipText("ESCOGER ARCHIVO"+" "+TipoServicioConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionTipoServicio = new JButtonMe();
		this.jButtonAbrirImportacionTipoServicio.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionTipoServicio,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionTipoServicio.setToolTipText("Generar"+" "+TipoServicioConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsTipoServicio = new GridBagConstraints();
		this.gridBagConstraintsTipoServicio.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoServicio.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoServicio.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoServicio.add(this.jButtonAbrirImportacionTipoServicio, this.gridBagConstraintsTipoServicio);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionTipoServicio = new JLabelMe();

		this.jLabelPathArchivoImportacionTipoServicio.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionTipoServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoServicio = new GridBagConstraints();
		this.gridBagConstraintsTipoServicio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoServicio.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoServicio.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoServicio.add(this.jLabelPathArchivoImportacionTipoServicio, this.gridBagConstraintsTipoServicio);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionTipoServicio=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionTipoServicio.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoServicio.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoServicio.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsTipoServicio = new GridBagConstraints();
		this.gridBagConstraintsTipoServicio.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoServicio.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoServicio.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoServicio.add(this.jTextFieldPathArchivoImportacionTipoServicio, this.gridBagConstraintsTipoServicio);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionTipoServicio = new JButtonMe();
		this.jButtonGenerarImportacionTipoServicio.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionTipoServicio,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionTipoServicio.setToolTipText("Generar"+" "+TipoServicioConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsTipoServicio = new GridBagConstraints();
		this.gridBagConstraintsTipoServicio.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoServicio.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoServicio.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoServicio.add(this.jButtonGenerarImportacionTipoServicio, this.gridBagConstraintsTipoServicio);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionTipoServicio = new JButtonMe();
		this.jButtonCerrarImportacionTipoServicio.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionTipoServicio,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionTipoServicio.setToolTipText("Cancelar"+" "+TipoServicioConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoServicio = new GridBagConstraints();
		this.gridBagConstraintsTipoServicio.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoServicio.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoServicio.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoServicio.add(this.jButtonCerrarImportacionTipoServicio, this.gridBagConstraintsTipoServicio);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalTipoServicio = new GridBagLayout();
		
		this.jScrollPanelImportacionTipoServicio= new JScrollPane(jPanelImportacionTipoServicio,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsTipoServicio = new GridBagConstraints();
		this.gridBagConstraintsTipoServicio.gridy =iPosYImportacion;
		this.gridBagConstraintsTipoServicio.gridx =iPosXImportacion;
		this.gridBagConstraintsTipoServicio.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionTipoServicio.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionTipoServicio.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalTipoServicio);
		this.jInternalFrameImportacionTipoServicio.getContentPane().add(this.jScrollPanelImportacionTipoServicio, this.gridBagConstraintsTipoServicio);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByTipoServicio(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByTipoServicio = new JButtonMe();
			this.jButtonAbrirOrderByTipoServicio.setText("Orden");
			this.jButtonAbrirOrderByTipoServicio.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoServicio,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoServicio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByTipoServicio";
			inputMap = this.jButtonAbrirOrderByTipoServicio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByTipoServicio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByTipoServicio"));
		
		
			GridBagLayout gridaBagLayoutOrderByTipoServicio = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByTipoServicio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByTipoServicio.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByTipoServicio.setName("jPanelOrderByTipoServicio"); 
			
			this.jPanelOrderByTipoServicio.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoServicio.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoServicio.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByTipoServicio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByTipoServicio.setLayout(gridaBagLayoutOrderByTipoServicio);
			
			
			this.jTableDatosTipoServicioOrderBy = new JTableMe();        
			this.jTableDatosTipoServicioOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosTipoServicioOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosTipoServicioOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosTipoServicioOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosTipoServicioOrderBy.setViewportView(this.jTableDatosTipoServicioOrderBy);
			this.jTableDatosTipoServicioOrderBy.setFillsViewportHeight(true);
			this.jTableDatosTipoServicioOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByTipoServicio= new OrderByJInternalFrame();
			this.jInternalFrameOrderByTipoServicio= new OrderByJInternalFrame();
			this.jScrollPanelOrderByTipoServicio = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteTipoServicio= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByTipoServicio.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByTipoServicio.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByTipoServicio.setTitle("Orden");
			this.jInternalFrameOrderByTipoServicio.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByTipoServicio.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByTipoServicio.setResizable(true);
			this.jInternalFrameOrderByTipoServicio.setClosable(true);
			this.jInternalFrameOrderByTipoServicio.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByTipoServicio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByTipoServicio.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoServicio.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoServicio.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByTipoServicio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByTipoServicio.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Servicioes"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsTipoServicio = new GridBagConstraints();
			this.gridBagConstraintsTipoServicio.gridy =iPosYOrderBy++;
			this.gridBagConstraintsTipoServicio.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoServicio.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsTipoServicio.ipady =150;
				
			this.jPanelOrderByTipoServicio.add(jScrollPanelDatosTipoServicioOrderBy, this.gridBagConstraintsTipoServicio);//this.jTableDatosTipoServicioTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByTipoServicio = new JButtonMe();
			this.jButtonCerrarOrderByTipoServicio.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByTipoServicio,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByTipoServicio.setToolTipText("Cancelar"+" "+TipoServicioConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByTipoServicio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsTipoServicio = new GridBagConstraints();
			this.gridBagConstraintsTipoServicio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoServicio.gridy = iPosYOrderBy++;
			this.gridBagConstraintsTipoServicio.gridx = iPosXOrderBy;
									
			this.jPanelOrderByTipoServicio.add(this.jButtonCerrarOrderByTipoServicio, this.gridBagConstraintsTipoServicio);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalTipoServicio = new GridBagLayout();
			
			this.jScrollPanelOrderByTipoServicio= new JScrollPane(jPanelOrderByTipoServicio,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsTipoServicio = new GridBagConstraints();
			this.gridBagConstraintsTipoServicio.gridy =iPosYOrderBy;
			this.gridBagConstraintsTipoServicio.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoServicio.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByTipoServicio.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByTipoServicio.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalTipoServicio);
			
			this.jInternalFrameOrderByTipoServicio.getContentPane().add(this.jScrollPanelOrderByTipoServicio, this.gridBagConstraintsTipoServicio);			
		
		} else {
			this.jButtonAbrirOrderByTipoServicio = new JButtonMe();
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
			&& this.tiposervicioSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosTipoServicio.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosTipoServicio.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosTipoServicio.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosTipoServicio.getRowHeight();//TipoServicioConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.tiposervicioSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > TipoServicioConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoServicio.isSelected()) {
					iHeightTable=TipoServicioConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoServicioConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoServicioConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > TipoServicioConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoServicio.isSelected()) {
					iHeightTable=TipoServicioConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoServicioConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoServicioConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosTipoServicio.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoServicio.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoServicio.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosTipoServicio.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoServicio.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoServicio.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByTipoServicio!=null && this.jInternalFrameOrderByTipoServicio.getjTableDatosOrderBy()!=null) {
			//if(!this.tiposervicioSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByTipoServicio.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByTipoServicio.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByTipoServicio.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByTipoServicio.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByTipoServicio.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByTipoServicio.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByTipoServicio.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosTipoServicio.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoServicio.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoServicio.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=tiposervicioLogic.getTipoServicios().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tiposervicios.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<TipoServicio> TraerTipoServicioBeans(List<TipoServicio> tiposervicios,ArrayList<Classe> classes)throws Exception {
		try {
			for(TipoServicio tiposervicio:tiposervicios) {
					
				if(!(TipoServicioConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || TipoServicioConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					tiposervicio.setsDetalleGeneralEntityReporte(TipoServicioConstantesFunciones.getTipoServicioDescripcion(tiposervicio));
										
						
					
					

					if(tiposervicio.getParametroInventarioDefectos()!=null && Funciones.existeClass(classes,ParametroInventarioDefecto.class)) {
						try{tiposervicio.setparametroinventariodefectosDescripcionReporte(new JRBeanCollectionDataSource(ParametroInventarioDefectoJInternalFrame.TraerParametroInventarioDefectoBeans(tiposervicio.getParametroInventarioDefectos(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//tiposervicio.setsDetalleGeneralEntityReporte(tiposervicio.getsDetalleGeneralEntityReporte());
										
				}
				
				//tiposerviciobeans.add(tiposerviciobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return tiposervicios;
    }
	//PARA REPORTES FIN
}
