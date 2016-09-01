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
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;

import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;

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
import com.bydan.erp.inventario.util.TipoCosteoConstantesFunciones;

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
public class TipoCosteoJInternalFrame extends TipoCosteoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarTipoCosteo;
	
	protected JMenuBar jmenuBarTipoCosteo;
	
	protected JMenu jmenuTipoCosteo;
	protected JMenu jmenuDatosTipoCosteo;
	protected JMenu jmenuArchivoTipoCosteo;
	protected JMenu jmenuAccionesTipoCosteo;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosTipoCosteo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoCosteo;	
	protected GridBagConstraints gridBagConstraintsTipoCosteo;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public TipoCosteoDetalleFormJInternalFrame jInternalFrameDetalleFormTipoCosteo;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoTipoCosteo;	
	protected ImportacionJInternalFrame jInternalFrameImportacionTipoCosteo;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public TipoCosteoSessionBean tipocosteoSessionBean;
		
	
	
	
	//protected JDesktopPane jDesktopPane;
	public List<TipoCosteo> tipocosteos;		
	public List<TipoCosteo> tipocosteosEliminados;	
	public List<TipoCosteo> tipocosteosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByTipoCosteo;		
	protected JButton jButtonAbrirOrderByTipoCosteo;
	
	
	//protected JPanel jPanelOrderByTipoCosteo;
	//public JScrollPane jScrollPanelOrderByTipoCosteo;	
	//protected JButton jButtonCerrarOrderByTipoCosteo;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public TipoCosteoLogic tipocosteoLogic;
	
	
	
	public JScrollPane jScrollPanelDatosTipoCosteo;
	public JScrollPane jScrollPanelDatosEdicionTipoCosteo;
	public JScrollPane jScrollPanelDatosGeneralTipoCosteo;
    
	
	
	//public JScrollPane jScrollPanelDatosTipoCosteoOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoTipoCosteo;
	//public JScrollPane jScrollPanelImportacionTipoCosteo;
	
	
	
	protected JPanel jPanelAccionesTipoCosteo;
	
    protected JPanel jPanelPaginacionTipoCosteo;
    protected JPanel jPanelParametrosReportesTipoCosteo;
	protected JPanel jPanelParametrosReportesAccionesTipoCosteo;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1TipoCosteo;
	protected JPanel jPanelParametrosAuxiliar2TipoCosteo;
	protected JPanel jPanelParametrosAuxiliar3TipoCosteo;
	protected JPanel jPanelParametrosAuxiliar4TipoCosteo;
	//protected JPanel jPanelParametrosAuxiliar5TipoCosteo;
	
	
	
	//protected JPanel jPanelReporteDinamicoTipoCosteo;
	//protected JPanel jPanelImportacionTipoCosteo;
	
	
	public JTable jTableDatosTipoCosteo;
	
	
	
	//public JTable jTableDatosTipoCosteoOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoTipoCosteo;
	protected JButton jButtonDuplicarTipoCosteo;
	protected JButton jButtonCopiarTipoCosteo;
	protected JButton jButtonVerFormTipoCosteo;
	protected JButton jButtonNuevoRelacionesTipoCosteo;
	protected JButton jButtonModificarTipoCosteo;
	
    protected JButton jButtonGuardarCambiosTablaTipoCosteo;
	protected JButton jButtonCerrarTipoCosteo;
	
	
	protected JButton jButtonRecargarInformacionTipoCosteo;
	protected JButton jButtonProcesarInformacionTipoCosteo;
	
	
	protected JButton jButtonAnterioresTipoCosteo;
	protected JButton jButtonSiguientesTipoCosteo;
	protected JButton jButtonNuevoGuardarCambiosTipoCosteo;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoTipoCosteo;
	//protected JButton jButtonCerrarReporteDinamicoTipoCosteo;
	//protected JButton jButtonGenerarExcelReporteDinamicoTipoCosteo;	
	
	
	
	//protected JButton jButtonAbrirImportacionTipoCosteo;
	//protected JButton jButtonGenerarImportacionTipoCosteo;
	//protected JButton jButtonCerrarImportacionTipoCosteo;
	//protected JFileChooser jFileChooserImportacionTipoCosteo;
	//protected File fileImportacionTipoCosteo;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoCosteo;
	protected JButton jButtonDuplicarToolBarTipoCosteo;
	protected JButton jButtonNuevoRelacionesToolBarTipoCosteo;
	
	
	public JButton jButtonGuardarCambiosToolBarTipoCosteo;
	protected JButton jButtonCopiarToolBarTipoCosteo;
	protected JButton jButtonVerFormToolBarTipoCosteo;
	public JButton jButtonGuardarCambiosTablaToolBarTipoCosteo;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoCosteo;
	protected JButton jButtonCerrarToolBarTipoCosteo;
	
	protected JButton jButtonRecargarInformacionToolBarTipoCosteo;
	protected JButton jButtonProcesarInformacionToolBarTipoCosteo;
	protected JButton jButtonAnterioresToolBarTipoCosteo;
	protected JButton jButtonSiguientesToolBarTipoCosteo;
	protected JButton jButtonNuevoGuardarCambiosToolBarTipoCosteo;
	protected JButton jButtonAbrirOrderByToolBarTipoCosteo;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoCosteo;
	protected JMenuItem jMenuItemDuplicarTipoCosteo;
	protected JMenuItem jMenuItemNuevoRelacionesTipoCosteo;
	
	
	protected JMenuItem jMenuItemGuardarCambiosTipoCosteo;
	protected JMenuItem jMenuItemCopiarTipoCosteo;
	protected JMenuItem jMenuItemVerFormTipoCosteo;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoCosteo;
	protected JMenuItem jMenuItemCerrarTipoCosteo;
	protected JMenuItem jMenuItemDetalleCerrarTipoCosteo;
	protected JMenuItem jMenuItemDetalleAbrirOrderByTipoCosteo;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoCosteo;
	
	protected JMenuItem jMenuItemRecargarInformacionTipoCosteo;
	protected JMenuItem jMenuItemProcesarInformacionTipoCosteo;
	protected JMenuItem jMenuItemAnterioresTipoCosteo;
	protected JMenuItem jMenuItemSiguientesTipoCosteo;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoCosteo;
	protected JMenuItem jMenuItemAbrirOrderByTipoCosteo;
	protected JMenuItem jMenuItemMostrarOcultarTipoCosteo;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoCosteo;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosTipoCosteo;
	protected JCheckBox jCheckBoxSeleccionadosTipoCosteo;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaTipoCosteo;
	protected JCheckBox jCheckBoxConGraficoReporteTipoCosteo;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesTipoCosteo;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesTipoCosteo;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoTipoCosteo;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoTipoCosteo;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesTipoCosteo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionTipoCosteo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoCosteo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoCosteo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarTipoCosteo;
	protected JTextField jTextFieldValorCampoGeneralTipoCosteo;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteTipoCosteo;
	//public JList<Reporte> jListColumnasSelectReporteTipoCosteo;
	//public JScrollPane jScrollColumnasSelectReporteTipoCosteo;
	
	//public JLabel jLabelRelacionesSelectReporteTipoCosteo;
	//public JList<Reporte> jListRelacionesSelectReporteTipoCosteo;
	//public JScrollPane jScrollRelacionesSelectReporteTipoCosteo;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoTipoCosteo;
	//protected JCheckBox jCheckBoxConGraficoDinamicoTipoCosteo;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoTipoCosteo;
	//public JLabel jLabelTiposArchivoReporteDinamicoTipoCosteo;
	
		
	//public JLabel jLabelArchivoImportacionTipoCosteo;	
	//public JLabel jLabelPathArchivoImportacionTipoCosteo;
	//protected JTextField jTextFieldPathArchivoImportacionTipoCosteo;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoTipoCosteo;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoTipoCosteo;
	
	//public JLabel jLabelColumnaCategoriaValorTipoCosteo;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorTipoCosteo;
	
	//public JLabel jLabelColumnasValoresGraficoTipoCosteo;
	//public JList<Reporte> jListColumnasValoresGraficoTipoCosteo;
	//public JScrollPane jScrollColumnasValoresGraficoTipoCosteo;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoTipoCosteo;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoTipoCosteo;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasTipoCosteo;
	public JPanel jPanelBusquedaPorNombreTipoCosteo;
	public JButton jButtonBusquedaPorNombreTipoCosteo;
	
	public JPanel jPanelnombreBusquedaPorNombreTipoCosteo;
	public JLabel jLabelnombreBusquedaPorNombreTipoCosteo;
	public JTextArea jTextAreanombreBusquedaPorNombreTipoCosteo;
	public JButton jButtonnombreBusquedaPorNombreTipoCosteoBusqueda= new JButtonMe();

	
	
	
	
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
	public TipoCosteoJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("TipoCosteo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoCosteoJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoCosteo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoCosteoJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoCosteo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoCosteoJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoCosteo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionTipoCosteo)	{
		this.jButtonRecargarInformacionTipoCosteo = jButtonRecargarInformacionTipoCosteo;
	}
	
	public JButton getjButtonProcesarInformacionTipoCosteo() {
		return this.jButtonProcesarInformacionTipoCosteo;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoCosteo)	{
		this.jButtonProcesarInformacionTipoCosteo = jButtonProcesarInformacionTipoCosteo;
	}
	
	
	public JButton getjButtonRecargarInformacionTipoCosteo() {
		return this.jButtonRecargarInformacionTipoCosteo;
	}
	
	
	public List<TipoCosteo> gettipocosteos() {
		return this.tipocosteos;
	}

	public void settipocosteos(List<TipoCosteo> tipocosteos) {
		this.tipocosteos = tipocosteos;
	}
	
	public List<TipoCosteo> gettipocosteosAux() {
		return this.tipocosteosAux;
	}

	public void settipocosteosAux(List<TipoCosteo> tipocosteosAux) {
		this.tipocosteosAux = tipocosteosAux;
	}
	
	public List<TipoCosteo> gettipocosteosEliminados() {
		return this.tipocosteosEliminados;
	}

	public void setTipoCosteosEliminados(List<TipoCosteo> tipocosteosEliminados) {
		this.tipocosteosEliminados = tipocosteosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarTipoCosteo() {
		return jComboBoxTiposSeleccionarTipoCosteo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarTipoCosteo(
			JComboBox jComboBoxTiposSeleccionarTipoCosteo) {
		this.jComboBoxTiposSeleccionarTipoCosteo = jComboBoxTiposSeleccionarTipoCosteo;
	}
	
	public void setBorderResaltarTiposSeleccionarTipoCosteo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarTipoCosteo.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarTipoCosteo .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralTipoCosteo() {
		return jTextFieldValorCampoGeneralTipoCosteo;
	}

	public void setjTextFieldValorCampoGeneralTipoCosteo(
			JTextField jTextFieldValorCampoGeneralTipoCosteo) {
		this.jTextFieldValorCampoGeneralTipoCosteo = jTextFieldValorCampoGeneralTipoCosteo;
	}

	public void setBorderResaltarValorCampoGeneralTipoCosteo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoCosteo.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralTipoCosteo .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosTipoCosteo() {
		return this.jCheckBoxSeleccionarTodosTipoCosteo;
	}

	public void setjCheckBoxSeleccionarTodosTipoCosteo(
			JCheckBox jCheckBoxSeleccionarTodosTipoCosteo) {
		this.jCheckBoxSeleccionarTodosTipoCosteo = jCheckBoxSeleccionarTodosTipoCosteo;
	}

	public void setBorderResaltarSeleccionarTodosTipoCosteo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoCosteo.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosTipoCosteo .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosTipoCosteo() {
		return this.jCheckBoxSeleccionadosTipoCosteo;
	}

	public void setjCheckBoxSeleccionadosTipoCosteo(
			JCheckBox jCheckBoxSeleccionadosTipoCosteo) {
		this.jCheckBoxSeleccionadosTipoCosteo = jCheckBoxSeleccionadosTipoCosteo;
	}
	
	public void setBorderResaltarSeleccionadosTipoCosteo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoCosteo.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosTipoCosteo .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesTipoCosteo() {
		return this.jComboBoxTiposArchivosReportesTipoCosteo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesTipoCosteo(
			JComboBox jComboBoxTiposArchivosReportesTipoCosteo) {
		this.jComboBoxTiposArchivosReportesTipoCosteo = jComboBoxTiposArchivosReportesTipoCosteo;
	}

	public void setBorderResaltarTiposArchivosReportesTipoCosteo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoCosteo.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesTipoCosteo .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesTipoCosteo() {
		return this.jComboBoxTiposReportesTipoCosteo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesTipoCosteo(
			JComboBox jComboBoxTiposReportesTipoCosteo) {
		this.jComboBoxTiposReportesTipoCosteo = jComboBoxTiposReportesTipoCosteo;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoTipoCosteo() {
	//	return jComboBoxTiposReportesDinamicoTipoCosteo;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoTipoCosteo(
	//		JComboBox jComboBoxTiposReportesDinamicoTipoCosteo) {
	//	this.jComboBoxTiposReportesDinamicoTipoCosteo = jComboBoxTiposReportesDinamicoTipoCosteo;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoTipoCosteo() {
	//	return jComboBoxTiposArchivosReportesDinamicoTipoCosteo;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoTipoCosteo(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoTipoCosteo) {
	//	this.jComboBoxTiposArchivosReportesDinamicoTipoCosteo = jComboBoxTiposArchivosReportesDinamicoTipoCosteo;
	//}
	
	public void setBorderResaltarTiposReportesTipoCosteo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoCosteo.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesTipoCosteo .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesTipoCosteo() {
		return this.jComboBoxTiposGraficosReportesTipoCosteo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesTipoCosteo(
			JComboBox jComboBoxTiposGraficosReportesTipoCosteo) {
		this.jComboBoxTiposGraficosReportesTipoCosteo = jComboBoxTiposGraficosReportesTipoCosteo;
	}
	
	public void setBorderResaltarTiposGraficosReportesTipoCosteo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoCosteo.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesTipoCosteo .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionTipoCosteo() {
		return this.jComboBoxTiposPaginacionTipoCosteo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionTipoCosteo(
			JComboBox jComboBoxTiposPaginacionTipoCosteo) {
		this.jComboBoxTiposPaginacionTipoCosteo = jComboBoxTiposPaginacionTipoCosteo;
	}
	
	public void setBorderResaltarTiposPaginacionTipoCosteo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoCosteo.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionTipoCosteo .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesTipoCosteo() {
		return this.jComboBoxTiposRelacionesTipoCosteo;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoCosteo() {
		return this.jComboBoxTiposAccionesTipoCosteo;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoCosteo(
			JComboBox jComboBoxTiposRelacionesTipoCosteo) {
		this.jComboBoxTiposRelacionesTipoCosteo = jComboBoxTiposRelacionesTipoCosteo;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoCosteo(
			JComboBox jComboBoxTiposAccionesTipoCosteo) {
		this.jComboBoxTiposAccionesTipoCosteo = jComboBoxTiposAccionesTipoCosteo;
	}
	
	public void setBorderResaltarTiposRelacionesTipoCosteo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoCosteo.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesTipoCosteo .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesTipoCosteo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoCosteo.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesTipoCosteo .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoTipoCosteo() {
	//	return jCheckBoxConGraficoDinamicoTipoCosteo;
	//}

	//public void setjCheckBoxConGraficoDinamicoTipoCosteo(
	//		JCheckBox jCheckBoxConGraficoDinamicoTipoCosteo) {
	//	this.jCheckBoxConGraficoDinamicoTipoCosteo = jCheckBoxConGraficoDinamicoTipoCosteo;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoTipoCosteo() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarTipoCosteo.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoTipoCosteo .setBorder(borderResaltar);		
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
		this.tipocosteoSessionBean=new TipoCosteoSessionBean();
		
		this.tipocosteoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipocosteoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipocosteoSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=TipoCosteoJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=TipoCosteoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoCosteoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoCosteoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoCosteoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Costeo MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.tipocosteoSessionBean.getEsGuardarRelacionado()) {
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
		
		TipoCosteoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("TipoCosteo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarTipoCosteo= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarTipoCosteo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarTipoCosteo,this.jTtoolBarTipoCosteo,
							"nuevo","nuevo","Nuevo"+" "+TipoCosteoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoCosteo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarTipoCosteo,this.jTtoolBarTipoCosteo,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoCosteo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarTipoCosteo,this.jTtoolBarTipoCosteo,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+TipoCosteoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarTipoCosteo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarTipoCosteo,this.jTtoolBarTipoCosteo,
							"duplicar","duplicar","Duplicar"+" "+TipoCosteoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarTipoCosteo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarTipoCosteo,this.jTtoolBarTipoCosteo,
							"copiar","copiar","Copiar"+" "+TipoCosteoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarTipoCosteo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarTipoCosteo,this.jTtoolBarTipoCosteo,
							"ver_form","ver_form","Ver"+" "+TipoCosteoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarTipoCosteo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoCosteo,this.jTtoolBarTipoCosteo,
							"recargar","recargar","Recargar"+" "+TipoCosteoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarTipoCosteo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoCosteo,this.jTtoolBarTipoCosteo,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarTipoCosteo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoCosteo,this.jTtoolBarTipoCosteo,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarTipoCosteo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarTipoCosteo,this.jTtoolBarTipoCosteo,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarTipoCosteo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarTipoCosteo,this.jTtoolBarTipoCosteo,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarTipoCosteo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarTipoCosteo,this.jTtoolBarTipoCosteo,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+TipoCosteoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarTipoCosteo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarTipoCosteo,this.jTtoolBarTipoCosteo,
							"cerrar","cerrar","Salir"+" "+TipoCosteoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarTipoCosteo=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarTipoCosteo;
			
				this.jButtonProcesarInformacionToolBarTipoCosteo=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarTipoCosteo;
				
		//protected JButton jButtonModificarToolBarTipoCosteo;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarTipoCosteo=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuTipoCosteo=new JMenuMe("General");
		this.jmenuArchivoTipoCosteo=new JMenuMe("Archivo");
		this.jmenuAccionesTipoCosteo=new JMenuMe("Acciones");
		this.jmenuDatosTipoCosteo=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoCosteo= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoCosteo.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoCosteo,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoCosteo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarTipoCosteo= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarTipoCosteo.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarTipoCosteo,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarTipoCosteo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesTipoCosteo= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesTipoCosteo.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesTipoCosteo,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesTipoCosteo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosTipoCosteo= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoCosteo.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoCosteo,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoCosteo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarTipoCosteo= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarTipoCosteo.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarTipoCosteo,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarTipoCosteo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormTipoCosteo= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormTipoCosteo.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormTipoCosteo,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormTipoCosteo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaTipoCosteo= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaTipoCosteo.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaTipoCosteo,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaTipoCosteo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoCosteo= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoCosteo.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoCosteo,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoCosteo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionTipoCosteo= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionTipoCosteo.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionTipoCosteo,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionTipoCosteo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionTipoCosteo= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionTipoCosteo.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionTipoCosteo,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresTipoCosteo= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresTipoCosteo.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresTipoCosteo,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresTipoCosteo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesTipoCosteo= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesTipoCosteo.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesTipoCosteo,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesTipoCosteo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByTipoCosteo= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByTipoCosteo.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByTipoCosteo,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByTipoCosteo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoCosteo= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoCosteo.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoCosteo,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoCosteo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByTipoCosteo= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByTipoCosteo.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByTipoCosteo,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByTipoCosteo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoCosteo= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoCosteo.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoCosteo,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoCosteo, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosTipoCosteo= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosTipoCosteo.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosTipoCosteo,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosTipoCosteo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoTipoCosteo.add(this.jMenuItemCerrarTipoCosteo);
			
			this.jmenuAccionesTipoCosteo.add(this.jMenuItemNuevoTipoCosteo);
			this.jmenuAccionesTipoCosteo.add(this.jMenuItemNuevoGuardarCambiosTipoCosteo);
			this.jmenuAccionesTipoCosteo.add(this.jMenuItemNuevoRelacionesTipoCosteo);
			this.jmenuAccionesTipoCosteo.add(this.jMenuItemGuardarCambiosTablaTipoCosteo);		
			this.jmenuAccionesTipoCosteo.add(this.jMenuItemDuplicarTipoCosteo);		
			this.jmenuAccionesTipoCosteo.add(this.jMenuItemCopiarTipoCosteo);		
			this.jmenuAccionesTipoCosteo.add(this.jMenuItemVerFormTipoCosteo);		
			
			this.jmenuDatosTipoCosteo.add(this.jMenuItemRecargarInformacionTipoCosteo);				
			this.jmenuDatosTipoCosteo.add(this.jMenuItemAnterioresTipoCosteo);				
			this.jmenuDatosTipoCosteo.add(this.jMenuItemSiguientesTipoCosteo);				
			this.jmenuDatosTipoCosteo.add(this.jMenuItemAbrirOrderByTipoCosteo);				
			this.jmenuDatosTipoCosteo.add(this.jMenuItemMostrarOcultarTipoCosteo);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesTipoCosteo.add(this.jMenuItemGuardarCambiosTipoCosteo);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoTipoCosteo, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesTipoCosteo, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosTipoCosteo, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarTipoCosteo.add(this.jmenuArchivoTipoCosteo);		
			this.jmenuBarTipoCosteo.add(this.jmenuAccionesTipoCosteo);		
			this.jmenuBarTipoCosteo.add(this.jmenuDatosTipoCosteo);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarTipoCosteo);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasTipoCosteo() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaPorNombreTipoCosteo=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorNombreTipoCosteo.setToolTipText("Buscar Por Nombre ");
		this.jButtonBusquedaPorNombreTipoCosteo= new JButtonMe();
		this.jButtonBusquedaPorNombreTipoCosteo.setText("Buscar");
		this.jButtonBusquedaPorNombreTipoCosteo.setToolTipText("Buscar Por Nombre ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorNombreTipoCosteo,"buscar_button","Buscar Por Nombre ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorNombreTipoCosteo, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelnombreBusquedaPorNombreTipoCosteo = new JLabelMe();
		jLabelnombreBusquedaPorNombreTipoCosteo.setText("Nombre :");
		jLabelnombreBusquedaPorNombreTipoCosteo.setToolTipText("Nombre");
		jLabelnombreBusquedaPorNombreTipoCosteo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombreTipoCosteo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombreTipoCosteo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelnombreBusquedaPorNombreTipoCosteo,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextAreanombreBusquedaPorNombreTipoCosteo= new JTextAreaMe();
		jTextAreanombreBusquedaPorNombreTipoCosteo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBusquedaPorNombreTipoCosteo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBusquedaPorNombreTipoCosteo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextArea(jTextAreanombreBusquedaPorNombreTipoCosteo,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasTipoCosteo=new JTabbedPane();


		this.jTabbedPaneBusquedasTipoCosteo.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoCosteo.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoCosteo.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasTipoCosteo.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasTipoCosteo.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasTipoCosteo,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleTipoCosteo = new TipoCosteoDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Tipo Costeo DATOS");
			this.jInternalFrameDetalleFormTipoCosteo = new TipoCosteoDetalleFormJInternalFrame(jDesktopPane,this.tipocosteoSessionBean.getConGuardarRelaciones(),this.tipocosteoSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormTipoCosteo = null;//new TipoCosteoDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoCosteo= new GridBagLayout();
		
		
		this.jTableDatosTipoCosteo = new JTableMe();      
		
		String sToolTipTipoCosteo="";
		sToolTipTipoCosteo=TipoCosteoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoCosteo+="(Inventario.TipoCosteo)";
		}
		
		if(!this.tipocosteoSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoCosteo+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosTipoCosteo.setToolTipText(sToolTipTipoCosteo);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosTipoCosteo);
		this.jTableDatosTipoCosteo.setAutoCreateRowSorter(true);
		this.jTableDatosTipoCosteo.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosTipoCosteo.setRowSelectionAllowed(true);
		this.jTableDatosTipoCosteo.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosTipoCosteo,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoTipoCosteo = new JButtonMe();
		this.jButtonDuplicarTipoCosteo = new JButtonMe();
		this.jButtonCopiarTipoCosteo = new JButtonMe();
		this.jButtonVerFormTipoCosteo = new JButtonMe();
		this.jButtonNuevoRelacionesTipoCosteo = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaTipoCosteo = new JButtonMe();
		this.jButtonCerrarTipoCosteo = new JButtonMe();
		
		this.jScrollPanelDatosTipoCosteo = new JScrollPane();   
        this.jScrollPanelDatosGeneralTipoCosteo = new JScrollPane();
		
				
		
		
		this.jPanelAccionesTipoCosteo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Costeo";
		
		if(!this.tipocosteoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoCosteo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Costeos" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoCosteo.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralTipoCosteo.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesTipoCosteo.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoCosteo.setToolTipText("Acciones");
        this.jPanelAccionesTipoCosteo.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoCosteo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoCosteo, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoTipoCosteo=new ReporteDinamicoJInternalFrame(TipoCosteoConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoTipoCosteo();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionTipoCosteo=new ImportacionJInternalFrame(TipoCosteoConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionTipoCosteo();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByTipoCosteo = new JButtonMe();
		
		this.jButtonAbrirOrderByTipoCosteo.setText("Orden");
		this.jButtonAbrirOrderByTipoCosteo.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoCosteo,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoCosteo, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByTipoCosteo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByTipoCosteo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoCosteo=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoCosteo,false,this);
			
			//this.cargarOrderByTipoCosteo(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoCosteo=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoCosteo,true,this);
			
			//this.cargarOrderByTipoCosteo(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosTipoCosteo.setMinimumSize(new Dimension(400,50));//330
		this.jTableDatosTipoCosteo.setMaximumSize(new Dimension(400,50));//330
		this.jTableDatosTipoCosteo.setPreferredSize(new Dimension(400,50));//330
		
		this.jScrollPanelDatosTipoCosteo.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoCosteo.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoCosteo.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoTipoCosteo.setText("Nuevo");
		this.jButtonDuplicarTipoCosteo.setText("Duplicar");
		this.jButtonCopiarTipoCosteo.setText("Copiar");
		this.jButtonVerFormTipoCosteo.setText("Ver");
		this.jButtonNuevoRelacionesTipoCosteo.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaTipoCosteo.setText("Guardar");
		this.jButtonCerrarTipoCosteo.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoCosteo,"nuevo_button","Nuevo",this.tipocosteoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarTipoCosteo,"duplicar_button","Duplicar",this.tipocosteoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarTipoCosteo,"copiar_button","Copiar",this.tipocosteoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormTipoCosteo,"ver_form","Ver",this.tipocosteoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesTipoCosteo,"nuevorelaciones_button","Nuevo Rel",this.tipocosteoSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoCosteo,"guardarcambiostabla_button","Guardar",this.tipocosteoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoCosteo,"cerrar_button","Salir",this.tipocosteoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoCosteo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarTipoCosteo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarTipoCosteo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormTipoCosteo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesTipoCosteo, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoCosteo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoCosteo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoTipoCosteo.setToolTipText("Nuevo"+" "+TipoCosteoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarTipoCosteo.setToolTipText("Duplicar"+" "+TipoCosteoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarTipoCosteo.setToolTipText("Copiar"+" "+TipoCosteoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormTipoCosteo.setToolTipText("Ver"+" "+TipoCosteoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesTipoCosteo.setToolTipText("Nuevo Rel"+" "+TipoCosteoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaTipoCosteo.setToolTipText("Guardar"+" "+TipoCosteoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoCosteo.setToolTipText("Salir"+" "+TipoCosteoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoCosteo";
		inputMap = this.jButtonNuevoTipoCosteo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoCosteo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoCosteo"));
		
		//DUPLICAR
		sMapKey = "DuplicarTipoCosteo";
		inputMap = this.jButtonDuplicarTipoCosteo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarTipoCosteo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarTipoCosteo"));
		
		//COPIAR
		sMapKey = "CopiarTipoCosteo";
		inputMap = this.jButtonCopiarTipoCosteo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarTipoCosteo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarTipoCosteo"));
		
		//VEr FORM
		sMapKey = "VerFormTipoCosteo";
		inputMap = this.jButtonVerFormTipoCosteo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormTipoCosteo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormTipoCosteo"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesTipoCosteo";
		inputMap = this.jButtonNuevoRelacionesTipoCosteo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesTipoCosteo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesTipoCosteo"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarTipoCosteo";
		inputMap = this.jButtonModificarTipoCosteo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarTipoCosteo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarTipoCosteo"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarTipoCosteo";
		inputMap = this.jButtonCerrarTipoCosteo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoCosteo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoCosteo"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoCosteo";
		inputMap = this.jButtonGuardarCambiosTablaTipoCosteo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoCosteo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoCosteo"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesTipoCosteo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesTipoCosteo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionTipoCosteo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1TipoCosteo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2TipoCosteo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3TipoCosteo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4TipoCosteo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5TipoCosteo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesTipoCosteo.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesTipoCosteo.setName("jPanelParametrosReportesTipoCosteo"); 
		
		this.jPanelParametrosReportesAccionesTipoCosteo.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesTipoCosteo.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesTipoCosteo.setName("jPanelParametrosReportesAccionesTipoCosteo"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesTipoCosteo, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesTipoCosteo, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionTipoCosteo = new JButtonMe();
		this.jButtonRecargarInformacionTipoCosteo.setText("Recargar");
		this.jButtonRecargarInformacionTipoCosteo.setToolTipText("Recargar"+" "+TipoCosteoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionTipoCosteo,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionTipoCosteo = new JButtonMe();
		this.jButtonProcesarInformacionTipoCosteo.setText("Procesar");
		this.jButtonProcesarInformacionTipoCosteo.setToolTipText("Procesar"+" "+TipoCosteoConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionTipoCosteo.setVisible(false);
			
		this.jButtonProcesarInformacionTipoCosteo.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoCosteo.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoCosteo.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesTipoCosteo = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoCosteo.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesTipoCosteo.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesTipoCosteo = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoCosteo.setText("TIPO");       
		this.jComboBoxTiposReportesTipoCosteo.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesTipoCosteo = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoCosteo.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesTipoCosteo.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionTipoCosteo = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionTipoCosteo.setText("Paginacion");
		this.jComboBoxTiposPaginacionTipoCosteo.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesTipoCosteo = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesTipoCosteo.setText("Accion");
		this.jComboBoxTiposRelacionesTipoCosteo.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesTipoCosteo = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoCosteo.setText("Accion");
		this.jComboBoxTiposAccionesTipoCosteo.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarTipoCosteo = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarTipoCosteo.setText("Accion");
		this.jComboBoxTiposSeleccionarTipoCosteo.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralTipoCosteo=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralTipoCosteo.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoCosteo.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoCosteo.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesTipoCosteo = new JLabelMe();
		
		this.jLabelAccionesTipoCosteo.setText("Acciones");		
		this.jLabelAccionesTipoCosteo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoCosteo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoCosteo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosTipoCosteo = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosTipoCosteo.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosTipoCosteo.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosTipoCosteo = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosTipoCosteo.setText("Seleccionados");
		this.jCheckBoxSeleccionadosTipoCosteo.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaTipoCosteo = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaTipoCosteo.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaTipoCosteo.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteTipoCosteo = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteTipoCosteo.setText("Graf.");
		this.jCheckBoxConGraficoReporteTipoCosteo.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresTipoCosteo = new JButtonMe();
		//this.jButtonAnterioresTipoCosteo.setText("<<");
        this.jButtonAnterioresTipoCosteo.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresTipoCosteo,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresTipoCosteo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesTipoCosteo = new JButtonMe();
		//this.jButtonSiguientesTipoCosteo.setText(">>");
        this.jButtonSiguientesTipoCosteo.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesTipoCosteo,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesTipoCosteo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosTipoCosteo = new JButtonMe();
		this.jButtonNuevoGuardarCambiosTipoCosteo.setText("Nue");
        this.jButtonNuevoGuardarCambiosTipoCosteo.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosTipoCosteo,"nuevoguardarcambios_button","Nue",this.tipocosteoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosTipoCosteo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosTipoCosteo";
		inputMap = this.jButtonNuevoGuardarCambiosTipoCosteo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosTipoCosteo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosTipoCosteo"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionTipoCosteo";
		inputMap = this.jButtonRecargarInformacionTipoCosteo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionTipoCosteo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionTipoCosteo"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesTipoCosteo";
		inputMap = this.jButtonSiguientesTipoCosteo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesTipoCosteo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesTipoCosteo"));
		
		//ANTERIORES		
		sMapKey = "AnterioresTipoCosteo";
		inputMap = this.jButtonAnterioresTipoCosteo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresTipoCosteo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresTipoCosteo"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasTipoCosteo();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesTipoCosteo.setMinimumSize(new Dimension(this.getWidth(),TipoCosteoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoCosteoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoCosteo.setMaximumSize(new Dimension(this.getWidth(),TipoCosteoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoCosteoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoCosteo.setPreferredSize(new Dimension(this.getWidth(),TipoCosteoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoCosteoBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionTipoCosteo = new GridBagLayout();

			this.jPanelPaginacionTipoCosteo.setLayout(gridaBagLayoutPaginacionTipoCosteo);						
			
			this.gridBagConstraintsTipoCosteo = new GridBagConstraints();
			this.gridBagConstraintsTipoCosteo.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsTipoCosteo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCosteo.gridy = 0;
			this.gridBagConstraintsTipoCosteo.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionTipoCosteo.add(this.jButtonAnterioresTipoCosteo, this.gridBagConstraintsTipoCosteo);
					
						
			this.gridBagConstraintsTipoCosteo = new GridBagConstraints();
			this.gridBagConstraintsTipoCosteo.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoCosteo.gridy = 0;
			
			this.jPanelPaginacionTipoCosteo.add(this.jButtonNuevoGuardarCambiosTipoCosteo, this.gridBagConstraintsTipoCosteo);
						
			
			this.gridBagConstraintsTipoCosteo = new GridBagConstraints();
			this.gridBagConstraintsTipoCosteo.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsTipoCosteo.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoCosteo.gridy = 0;
			this.jPanelPaginacionTipoCosteo.add(this.jButtonSiguientesTipoCosteo, this.gridBagConstraintsTipoCosteo);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsTipoCosteo = new GridBagConstraints();
			this.gridBagConstraintsTipoCosteo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCosteo.gridy = 1;
			this.gridBagConstraintsTipoCosteo.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoCosteo.add(this.jButtonNuevoTipoCosteo, this.gridBagConstraintsTipoCosteo);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsTipoCosteo = new GridBagConstraints();
				this.gridBagConstraintsTipoCosteo.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoCosteo.gridy = 1;
				this.gridBagConstraintsTipoCosteo.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionTipoCosteo.add(this.jButtonNuevoRelacionesTipoCosteo, this.gridBagConstraintsTipoCosteo);
			}
			
			
			if(!this.tipocosteoSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsTipoCosteo = new GridBagConstraints();
				this.gridBagConstraintsTipoCosteo.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoCosteo.gridy = 1;
				this.gridBagConstraintsTipoCosteo.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionTipoCosteo.add(this.jButtonGuardarCambiosTablaTipoCosteo, this.gridBagConstraintsTipoCosteo);
			}
			
			
			
			this.gridBagConstraintsTipoCosteo = new GridBagConstraints();
			this.gridBagConstraintsTipoCosteo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCosteo.gridy = 1;
			this.gridBagConstraintsTipoCosteo.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoCosteo.add(this.jButtonDuplicarTipoCosteo, this.gridBagConstraintsTipoCosteo);
			
			this.gridBagConstraintsTipoCosteo = new GridBagConstraints();
			this.gridBagConstraintsTipoCosteo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCosteo.gridy = 1;
			this.gridBagConstraintsTipoCosteo.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoCosteo.add(this.jButtonCopiarTipoCosteo, this.gridBagConstraintsTipoCosteo);
		
			this.gridBagConstraintsTipoCosteo = new GridBagConstraints();
			this.gridBagConstraintsTipoCosteo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCosteo.gridy = 1;
			this.gridBagConstraintsTipoCosteo.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoCosteo.add(this.jButtonVerFormTipoCosteo, this.gridBagConstraintsTipoCosteo);
		
			this.gridBagConstraintsTipoCosteo = new GridBagConstraints();
			this.gridBagConstraintsTipoCosteo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCosteo.gridy = 1;
			this.gridBagConstraintsTipoCosteo.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionTipoCosteo.add(this.jButtonCerrarTipoCosteo, this.gridBagConstraintsTipoCosteo);
		
		
		
		this.jButtonRecargarInformacionTipoCosteo.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoCosteo.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoCosteo.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionTipoCosteo, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesTipoCosteo.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoCosteo.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoCosteo.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesTipoCosteo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesTipoCosteo.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoCosteo.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoCosteo.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesTipoCosteo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesTipoCosteo.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoCosteo.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoCosteo.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesTipoCosteo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionTipoCosteo.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoCosteo.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoCosteo.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionTipoCosteo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesTipoCosteo.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoCosteo.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoCosteo.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesTipoCosteo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesTipoCosteo.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoCosteo.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoCosteo.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoCosteo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarTipoCosteo.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoCosteo.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoCosteo.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarTipoCosteo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaTipoCosteo.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoCosteo.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoCosteo.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaTipoCosteo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteTipoCosteo.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoCosteo.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoCosteo.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteTipoCosteo, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosTipoCosteo.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoCosteo.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoCosteo.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosTipoCosteo, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosTipoCosteo.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoCosteo.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoCosteo.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosTipoCosteo, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesTipoCosteo = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesTipoCosteo = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1TipoCosteo = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2TipoCosteo = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3TipoCosteo = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4TipoCosteo = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesTipoCosteo.setLayout(gridaBagParametrosReportesTipoCosteo);
			this.jPanelParametrosReportesAccionesTipoCosteo.setLayout(gridaBagParametrosReportesAccionesTipoCosteo);
			
			
			this.jPanelParametrosAuxiliar1TipoCosteo.setLayout(gridaBagParametrosAuxiliar1TipoCosteo);
			this.jPanelParametrosAuxiliar2TipoCosteo.setLayout(gridaBagParametrosAuxiliar2TipoCosteo);
			this.jPanelParametrosAuxiliar3TipoCosteo.setLayout(gridaBagParametrosAuxiliar3TipoCosteo);
			this.jPanelParametrosAuxiliar4TipoCosteo.setLayout(gridaBagParametrosAuxiliar4TipoCosteo);
			//this.jPanelParametrosAuxiliar5TipoCosteo.setLayout(gridaBagParametrosAuxiliar2TipoCosteo);			
			
			
			
			
			this.gridBagConstraintsTipoCosteo = new GridBagConstraints();
			this.gridBagConstraintsTipoCosteo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCosteo.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoCosteo.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoCosteo.add(this.jButtonRecargarInformacionTipoCosteo, this.gridBagConstraintsTipoCosteo);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsTipoCosteo = new GridBagConstraints();
			this.gridBagConstraintsTipoCosteo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCosteo.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCosteo.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoCosteo.add(this.jComboBoxTiposPaginacionTipoCosteo, this.gridBagConstraintsTipoCosteo);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsTipoCosteo = new GridBagConstraints();
			this.gridBagConstraintsTipoCosteo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCosteo.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCosteo.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoCosteo.add(this.jCheckBoxConAltoMaximoTablaTipoCosteo, this.gridBagConstraintsTipoCosteo);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsTipoCosteo = new GridBagConstraints();
			this.gridBagConstraintsTipoCosteo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCosteo.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCosteo.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoCosteo.add(this.jComboBoxTiposArchivosReportesTipoCosteo, this.gridBagConstraintsTipoCosteo);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsTipoCosteo = new GridBagConstraints();
			this.gridBagConstraintsTipoCosteo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCosteo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCosteo.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoCosteo.add(this.jPanelParametrosAuxiliar1TipoCosteo, this.gridBagConstraintsTipoCosteo);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsTipoCosteo = new GridBagConstraints();
			this.gridBagConstraintsTipoCosteo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCosteo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCosteo.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoCosteo.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4TipoCosteo.add(this.jComboBoxTiposReportesTipoCosteo, this.gridBagConstraintsTipoCosteo);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsTipoCosteo = new GridBagConstraints();
			this.gridBagConstraintsTipoCosteo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCosteo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCosteo.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoCosteo.add(this.jPanelParametrosAuxiliar4TipoCosteo, this.gridBagConstraintsTipoCosteo);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsTipoCosteo = new GridBagConstraints();
			this.gridBagConstraintsTipoCosteo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCosteo.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCosteo.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoCosteo.add(this.jComboBoxTiposReportesTipoCosteo, this.gridBagConstraintsTipoCosteo);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsTipoCosteo = new GridBagConstraints();
			this.gridBagConstraintsTipoCosteo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCosteo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCosteo.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoCosteo.add(this.jCheckBoxGenerarReporteTipoCosteo, this.gridBagConstraintsTipoCosteo);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsTipoCosteo = new GridBagConstraints();
			this.gridBagConstraintsTipoCosteo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCosteo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCosteo.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoCosteo.add(this.jPanelParametrosAuxiliar2TipoCosteo, this.gridBagConstraintsTipoCosteo);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsTipoCosteo = new GridBagConstraints();
			this.gridBagConstraintsTipoCosteo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCosteo.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoCosteo.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoCosteo.add(this.jLabelAccionesTipoCosteo, this.gridBagConstraintsTipoCosteo);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsTipoCosteo = new GridBagConstraints();
				this.gridBagConstraintsTipoCosteo.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsTipoCosteo.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsTipoCosteo.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesTipoCosteo.add(this.jButtonAbrirOrderByTipoCosteo, this.gridBagConstraintsTipoCosteo);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsTipoCosteo = new GridBagConstraints();
			this.gridBagConstraintsTipoCosteo.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsTipoCosteo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCosteo.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoCosteo.add(this.jComboBoxTiposSeleccionarTipoCosteo, this.gridBagConstraintsTipoCosteo);			
			
			
			/*
			this.gridBagConstraintsTipoCosteo = new GridBagConstraints();
			this.gridBagConstraintsTipoCosteo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCosteo.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoCosteo.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoCosteo.add(this.jCheckBoxSeleccionarTodosTipoCosteo, this.gridBagConstraintsTipoCosteo);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsTipoCosteo = new GridBagConstraints();
			this.gridBagConstraintsTipoCosteo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCosteo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCosteo.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoCosteo.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoCosteo.add(this.jCheckBoxSeleccionarTodosTipoCosteo, this.gridBagConstraintsTipoCosteo);															
				
			this.gridBagConstraintsTipoCosteo = new GridBagConstraints();
			this.gridBagConstraintsTipoCosteo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCosteo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCosteo.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoCosteo.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoCosteo.add(this.jCheckBoxSeleccionadosTipoCosteo, this.gridBagConstraintsTipoCosteo);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsTipoCosteo = new GridBagConstraints();
			this.gridBagConstraintsTipoCosteo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCosteo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCosteo.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoCosteo.add(this.jPanelParametrosAuxiliar3TipoCosteo, this.gridBagConstraintsTipoCosteo);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsTipoCosteo = new GridBagConstraints();
			this.gridBagConstraintsTipoCosteo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCosteo.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoCosteo.add(this.jComboBoxTiposRelacionesTipoCosteo, this.gridBagConstraintsTipoCosteo);
				
			this.gridBagConstraintsTipoCosteo = new GridBagConstraints();
			this.gridBagConstraintsTipoCosteo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCosteo.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoCosteo.add(this.jComboBoxTiposAccionesTipoCosteo, this.gridBagConstraintsTipoCosteo);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosTipoCosteo = new GridBagLayout();

			this.jScrollPanelDatosTipoCosteo.setLayout(gridaBagLayoutDatosTipoCosteo);
			
			this.gridBagConstraintsTipoCosteo = new GridBagConstraints();
			this.gridBagConstraintsTipoCosteo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCosteo.gridy = 0;
			this.gridBagConstraintsTipoCosteo.gridx = 0;
			
			this.jScrollPanelDatosTipoCosteo.add(this.jTableDatosTipoCosteo, this.gridBagConstraintsTipoCosteo);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosTipoCosteo.setViewportView(this.jTableDatosTipoCosteo);
		this.jTableDatosTipoCosteo.setFillsViewportHeight(true);
		this.jTableDatosTipoCosteo.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesTipoCosteo= new GridBagLayout();
		this.jPanelAccionesTipoCosteo.setLayout(gridaBagLayoutAccionesTipoCosteo);
		
		
		/*	
		this.gridBagConstraintsTipoCosteo = new GridBagConstraints();
		this.gridBagConstraintsTipoCosteo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCosteo.gridy = 0;
		this.gridBagConstraintsTipoCosteo.gridx = 0;
			
		this.jPanelAccionesTipoCosteo.add(this.jButtonNuevoTipoCosteo, this.gridBagConstraintsTipoCosteo);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaPorNombreTipoCosteo= new GridBagLayout();
		gridaBagLayoutBusquedaPorNombreTipoCosteo.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorNombreTipoCosteo.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorNombreTipoCosteo.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorNombreTipoCosteo.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorNombreTipoCosteo.setLayout(gridaBagLayoutBusquedaPorNombreTipoCosteo);

		gridBagConstraintsTipoCosteo = new GridBagConstraints();
		gridBagConstraintsTipoCosteo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoCosteo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoCosteo.gridy = 0;
		gridBagConstraintsTipoCosteo.gridx = 0;
		jPanelBusquedaPorNombreTipoCosteo.add(jLabelnombreBusquedaPorNombreTipoCosteo, gridBagConstraintsTipoCosteo);

		gridBagConstraintsTipoCosteo = new GridBagConstraints();
		gridBagConstraintsTipoCosteo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoCosteo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoCosteo.gridy = 0;
		gridBagConstraintsTipoCosteo.gridx = 1;
		jPanelBusquedaPorNombreTipoCosteo.add(jTextAreanombreBusquedaPorNombreTipoCosteo, gridBagConstraintsTipoCosteo);

		gridBagConstraintsTipoCosteo = new GridBagConstraints();
		gridBagConstraintsTipoCosteo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoCosteo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoCosteo.gridy = 1;
		gridBagConstraintsTipoCosteo.gridx =1;
		jPanelBusquedaPorNombreTipoCosteo.add(jButtonBusquedaPorNombreTipoCosteo, gridBagConstraintsTipoCosteo);

		jTabbedPaneBusquedasTipoCosteo.addTab("1.-Por Nombre ", jPanelBusquedaPorNombreTipoCosteo);
		jTabbedPaneBusquedasTipoCosteo.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoCosteo = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoCosteo);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipocosteoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoCosteo = new GridBagConstraints();						
			this.gridBagConstraintsTipoCosteo.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoCosteo.gridx = 0;		
			//this.gridBagConstraintsTipoCosteo.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCosteo.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoCosteo.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarTipoCosteo, this.gridBagConstraintsTipoCosteo);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsTipoCosteo = new GridBagConstraints();
		this.gridBagConstraintsTipoCosteo.gridy = iGridyPrincipal++;
		this.gridBagConstraintsTipoCosteo.gridx = 0;		
		//this.gridBagConstraintsTipoCosteo.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCosteo.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsTipoCosteo.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsTipoCosteo);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsTipoCosteo = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsTipoCosteo.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoCosteo.gridx = 0;		
			this.gridBagConstraintsTipoCosteo.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCosteo.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsTipoCosteo.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasTipoCosteo, this.gridBagConstraintsTipoCosteo);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsTipoCosteo = new GridBagConstraints();
		this.gridBagConstraintsTipoCosteo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoCosteo.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesTipoCosteo, this.gridBagConstraintsTipoCosteo);								
		
		
		/*
		this.gridBagConstraintsTipoCosteo = new GridBagConstraints();
		this.gridBagConstraintsTipoCosteo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoCosteo.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesTipoCosteo, this.gridBagConstraintsTipoCosteo);
		*/		
		
		this.gridBagConstraintsTipoCosteo = new GridBagConstraints();
		this.gridBagConstraintsTipoCosteo.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoCosteo.gridx =0;
		this.gridBagConstraintsTipoCosteo.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoCosteo.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoCosteo, this.gridBagConstraintsTipoCosteo);
				
		
		this.gridBagConstraintsTipoCosteo = new GridBagConstraints();
		this.gridBagConstraintsTipoCosteo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoCosteo.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionTipoCosteo, this.gridBagConstraintsTipoCosteo);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(TipoCosteoJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosTipoCosteo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoCosteo = new GridBagLayout();
			this.jPanelBusquedasParametrosTipoCosteo.setLayout(gridaBagLayoutBusquedasParametrosTipoCosteo);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralTipoCosteo=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoCosteo.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoCosteo.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoCosteo.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoCosteo = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsTipoCosteo = new GridBagConstraints();
		this.gridBagConstraintsTipoCosteo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoCosteo.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoCosteo, this.gridBagConstraintsTipoCosteo);
			
			
		this.gridBagConstraintsTipoCosteo = new GridBagConstraints();
		this.gridBagConstraintsTipoCosteo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoCosteo.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoCosteo, this.gridBagConstraintsTipoCosteo);
		
			
		this.gridBagConstraintsTipoCosteo = new GridBagConstraints();
		this.gridBagConstraintsTipoCosteo.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoCosteo.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoCosteo, this.gridBagConstraintsTipoCosteo);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralTipoCosteo;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoTipoCosteo() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoTipoCosteo = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoTipoCosteo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoTipoCosteo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoTipoCosteo.setName("jPanelReporteDinamicoTipoCosteo"); 
		
		this.jPanelReporteDinamicoTipoCosteo.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoCosteo.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoCosteo.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoTipoCosteo.setLayout(gridaBagLayoutReporteDinamicoTipoCosteo);
		
		
		this.jInternalFrameReporteDinamicoTipoCosteo= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoTipoCosteo = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoCosteo= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoTipoCosteo.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoTipoCosteo.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoTipoCosteo.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoTipoCosteo.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoTipoCosteo.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoTipoCosteo.setResizable(true);
	    this.jInternalFrameReporteDinamicoTipoCosteo.setClosable(true);
	    this.jInternalFrameReporteDinamicoTipoCosteo.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoTipoCosteo.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoCosteo.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoCosteo.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoTipoCosteo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Costeos"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteTipoCosteo = new JLabelMe();

		this.jLabelColumnasSelectReporteTipoCosteo.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteTipoCosteo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoCosteo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoCosteo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoCosteo = new GridBagConstraints();
		this.gridBagConstraintsTipoCosteo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCosteo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoCosteo.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoCosteo.add(this.jLabelColumnasSelectReporteTipoCosteo, this.gridBagConstraintsTipoCosteo);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteTipoCosteo = new JList<Reporte>();
		this.jListColumnasSelectReporteTipoCosteo.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteTipoCosteo.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteTipoCosteo.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoCosteo.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoCosteo.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteTipoCosteo=new JScrollPane(this.jListColumnasSelectReporteTipoCosteo);
			
			this.jScrollColumnasSelectReporteTipoCosteo.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoCosteo.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoCosteo.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteTipoCosteo.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTipoCosteo = new GridBagConstraints();
		this.gridBagConstraintsTipoCosteo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCosteo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoCosteo.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoCosteo.add(this.jListColumnasSelectReporteTipoCosteo, this.gridBagConstraintsTipoCosteo);
		this.jPanelReporteDinamicoTipoCosteo.add(this.jScrollColumnasSelectReporteTipoCosteo, this.gridBagConstraintsTipoCosteo);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteTipoCosteo = new JLabelMe();

		this.jLabelRelacionesSelectReporteTipoCosteo.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteTipoCosteo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoCosteo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoCosteo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsTipoCosteo = new GridBagConstraints();
		this.gridBagConstraintsTipoCosteo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCosteo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoCosteo.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoCosteo.add(this.jLabelRelacionesSelectReporteTipoCosteo, this.gridBagConstraintsTipoCosteo);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteTipoCosteo = new JList<Reporte>();
		this.jListRelacionesSelectReporteTipoCosteo.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteTipoCosteo.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteTipoCosteo.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoCosteo.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoCosteo.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteTipoCosteo=new JScrollPane(this.jListRelacionesSelectReporteTipoCosteo);
			
			this.jScrollRelacionesSelectReporteTipoCosteo.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoCosteo.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoCosteo.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteTipoCosteo.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsTipoCosteo = new GridBagConstraints();
		this.gridBagConstraintsTipoCosteo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCosteo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoCosteo.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoCosteo.add(this.jListRelacionesSelectReporteTipoCosteo, this.gridBagConstraintsTipoCosteo);
		this.jPanelReporteDinamicoTipoCosteo.add(this.jScrollRelacionesSelectReporteTipoCosteo, this.gridBagConstraintsTipoCosteo);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoTipoCosteo = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoTipoCosteo = new JComboBoxMe();
		this.jListColumnasValoresGraficoTipoCosteo = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoTipoCosteo = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoTipoCosteo.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoTipoCosteo.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoCosteo.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoCosteo.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoTipoCosteo, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoTipoCosteo = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoTipoCosteo.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoTipoCosteo.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoCosteo.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoCosteo.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoTipoCosteo, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoTipoCosteo = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoTipoCosteo.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoTipoCosteo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoCosteo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoCosteo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoCosteo = new GridBagConstraints();
		this.gridBagConstraintsTipoCosteo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCosteo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoCosteo.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoCosteo.add(this.jLabelGenerarExcelReporteDinamicoTipoCosteo, this.gridBagConstraintsTipoCosteo);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoTipoCosteo = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoTipoCosteo.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoTipoCosteo,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoTipoCosteo.setToolTipText("Generar EXCEL"+" "+TipoCosteoConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsTipoCosteo = new GridBagConstraints();
		//this.gridBagConstraintsTipoCosteo.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsTipoCosteo.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsTipoCosteo.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoTipoCosteo.add(this.jButtonGenerarExcelReporteDinamicoTipoCosteo, this.gridBagConstraintsTipoCosteo);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsTipoCosteo = new GridBagConstraints();
		this.gridBagConstraintsTipoCosteo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCosteo.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoCosteo.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoCosteo.add(this.jComboBoxTiposReportesDinamicoTipoCosteo, this.gridBagConstraintsTipoCosteo);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoTipoCosteo = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoTipoCosteo.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoTipoCosteo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoCosteo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoCosteo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoCosteo = new GridBagConstraints();
		this.gridBagConstraintsTipoCosteo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCosteo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoCosteo.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoCosteo.add(this.jLabelTiposArchivoReporteDinamicoTipoCosteo, this.gridBagConstraintsTipoCosteo);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsTipoCosteo = new GridBagConstraints();
		this.gridBagConstraintsTipoCosteo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCosteo.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoCosteo.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoCosteo.add(this.jComboBoxTiposArchivosReportesDinamicoTipoCosteo, this.gridBagConstraintsTipoCosteo);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoTipoCosteo = new JButtonMe();
		this.jButtonGenerarReporteDinamicoTipoCosteo.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoTipoCosteo,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoTipoCosteo.setToolTipText("Generar"+" "+TipoCosteoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsTipoCosteo = new GridBagConstraints();
		this.gridBagConstraintsTipoCosteo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCosteo.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoCosteo.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoCosteo.add(this.jButtonGenerarReporteDinamicoTipoCosteo, this.gridBagConstraintsTipoCosteo);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoTipoCosteo = new JButtonMe();
		this.jButtonCerrarReporteDinamicoTipoCosteo.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoTipoCosteo,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoTipoCosteo.setToolTipText("Cancelar"+" "+TipoCosteoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoCosteo = new GridBagConstraints();
		this.gridBagConstraintsTipoCosteo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCosteo.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoCosteo.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoCosteo.add(this.jButtonCerrarReporteDinamicoTipoCosteo, this.gridBagConstraintsTipoCosteo);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalTipoCosteo = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoTipoCosteo= new JScrollPane(jPanelReporteDinamicoTipoCosteo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoTipoCosteo.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoCosteo.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoCosteo.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoTipoCosteo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Costeos"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoCosteo = new GridBagConstraints();
		this.gridBagConstraintsTipoCosteo.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsTipoCosteo.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsTipoCosteo.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoTipoCosteo.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoTipoCosteo.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalTipoCosteo);
		this.jInternalFrameReporteDinamicoTipoCosteo.getContentPane().add(this.jScrollPanelReporteDinamicoTipoCosteo, this.gridBagConstraintsTipoCosteo);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionTipoCosteo() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionTipoCosteo = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionTipoCosteo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionTipoCosteo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionTipoCosteo.setName("jPanelImportacionTipoCosteo"); 
		
		this.jPanelImportacionTipoCosteo.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoCosteo.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoCosteo.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionTipoCosteo.setLayout(gridaBagLayoutImportacionTipoCosteo);
		
		
		this.jInternalFrameImportacionTipoCosteo= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionTipoCosteo= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionTipoCosteo = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoCosteo= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionTipoCosteo.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoCosteo.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoCosteo.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionTipoCosteo.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoCosteo.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoCosteo.setResizable(true);
	    this.jInternalFrameImportacionTipoCosteo.setClosable(true);
	    this.jInternalFrameImportacionTipoCosteo.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionTipoCosteo.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoCosteo.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoCosteo.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionTipoCosteo.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoCosteo.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoCosteo.setResizable(true);
	    this.jInternalFrameImportacionTipoCosteo.setClosable(true);
	    this.jInternalFrameImportacionTipoCosteo.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionTipoCosteo.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoCosteo.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoCosteo.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionTipoCosteo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Costeos"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionTipoCosteo = new JLabelMe();

		this.jLabelArchivoImportacionTipoCosteo.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionTipoCosteo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoCosteo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoCosteo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoCosteo = new GridBagConstraints();
		this.gridBagConstraintsTipoCosteo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCosteo.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoCosteo.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoCosteo.add(this.jLabelArchivoImportacionTipoCosteo, this.gridBagConstraintsTipoCosteo);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionTipoCosteo = new JFileChooser();		
		this.jFileChooserImportacionTipoCosteo.setToolTipText("ESCOGER ARCHIVO"+" "+TipoCosteoConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionTipoCosteo = new JButtonMe();
		this.jButtonAbrirImportacionTipoCosteo.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionTipoCosteo,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionTipoCosteo.setToolTipText("Generar"+" "+TipoCosteoConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsTipoCosteo = new GridBagConstraints();
		this.gridBagConstraintsTipoCosteo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCosteo.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoCosteo.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoCosteo.add(this.jButtonAbrirImportacionTipoCosteo, this.gridBagConstraintsTipoCosteo);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionTipoCosteo = new JLabelMe();

		this.jLabelPathArchivoImportacionTipoCosteo.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionTipoCosteo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoCosteo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoCosteo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoCosteo = new GridBagConstraints();
		this.gridBagConstraintsTipoCosteo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCosteo.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoCosteo.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoCosteo.add(this.jLabelPathArchivoImportacionTipoCosteo, this.gridBagConstraintsTipoCosteo);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionTipoCosteo=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionTipoCosteo.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoCosteo.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoCosteo.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsTipoCosteo = new GridBagConstraints();
		this.gridBagConstraintsTipoCosteo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCosteo.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoCosteo.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoCosteo.add(this.jTextFieldPathArchivoImportacionTipoCosteo, this.gridBagConstraintsTipoCosteo);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionTipoCosteo = new JButtonMe();
		this.jButtonGenerarImportacionTipoCosteo.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionTipoCosteo,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionTipoCosteo.setToolTipText("Generar"+" "+TipoCosteoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsTipoCosteo = new GridBagConstraints();
		this.gridBagConstraintsTipoCosteo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCosteo.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoCosteo.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoCosteo.add(this.jButtonGenerarImportacionTipoCosteo, this.gridBagConstraintsTipoCosteo);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionTipoCosteo = new JButtonMe();
		this.jButtonCerrarImportacionTipoCosteo.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionTipoCosteo,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionTipoCosteo.setToolTipText("Cancelar"+" "+TipoCosteoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoCosteo = new GridBagConstraints();
		this.gridBagConstraintsTipoCosteo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCosteo.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoCosteo.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoCosteo.add(this.jButtonCerrarImportacionTipoCosteo, this.gridBagConstraintsTipoCosteo);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalTipoCosteo = new GridBagLayout();
		
		this.jScrollPanelImportacionTipoCosteo= new JScrollPane(jPanelImportacionTipoCosteo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsTipoCosteo = new GridBagConstraints();
		this.gridBagConstraintsTipoCosteo.gridy =iPosYImportacion;
		this.gridBagConstraintsTipoCosteo.gridx =iPosXImportacion;
		this.gridBagConstraintsTipoCosteo.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionTipoCosteo.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionTipoCosteo.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalTipoCosteo);
		this.jInternalFrameImportacionTipoCosteo.getContentPane().add(this.jScrollPanelImportacionTipoCosteo, this.gridBagConstraintsTipoCosteo);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByTipoCosteo(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByTipoCosteo = new JButtonMe();
			this.jButtonAbrirOrderByTipoCosteo.setText("Orden");
			this.jButtonAbrirOrderByTipoCosteo.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoCosteo,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoCosteo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByTipoCosteo";
			inputMap = this.jButtonAbrirOrderByTipoCosteo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByTipoCosteo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByTipoCosteo"));
		
		
			GridBagLayout gridaBagLayoutOrderByTipoCosteo = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByTipoCosteo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByTipoCosteo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByTipoCosteo.setName("jPanelOrderByTipoCosteo"); 
			
			this.jPanelOrderByTipoCosteo.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoCosteo.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoCosteo.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByTipoCosteo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByTipoCosteo.setLayout(gridaBagLayoutOrderByTipoCosteo);
			
			
			this.jTableDatosTipoCosteoOrderBy = new JTableMe();        
			this.jTableDatosTipoCosteoOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosTipoCosteoOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosTipoCosteoOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosTipoCosteoOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosTipoCosteoOrderBy.setViewportView(this.jTableDatosTipoCosteoOrderBy);
			this.jTableDatosTipoCosteoOrderBy.setFillsViewportHeight(true);
			this.jTableDatosTipoCosteoOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByTipoCosteo= new OrderByJInternalFrame();
			this.jInternalFrameOrderByTipoCosteo= new OrderByJInternalFrame();
			this.jScrollPanelOrderByTipoCosteo = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteTipoCosteo= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByTipoCosteo.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByTipoCosteo.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByTipoCosteo.setTitle("Orden");
			this.jInternalFrameOrderByTipoCosteo.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByTipoCosteo.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByTipoCosteo.setResizable(true);
			this.jInternalFrameOrderByTipoCosteo.setClosable(true);
			this.jInternalFrameOrderByTipoCosteo.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByTipoCosteo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByTipoCosteo.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoCosteo.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoCosteo.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByTipoCosteo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByTipoCosteo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Costeos"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsTipoCosteo = new GridBagConstraints();
			this.gridBagConstraintsTipoCosteo.gridy =iPosYOrderBy++;
			this.gridBagConstraintsTipoCosteo.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoCosteo.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsTipoCosteo.ipady =150;
				
			this.jPanelOrderByTipoCosteo.add(jScrollPanelDatosTipoCosteoOrderBy, this.gridBagConstraintsTipoCosteo);//this.jTableDatosTipoCosteoTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByTipoCosteo = new JButtonMe();
			this.jButtonCerrarOrderByTipoCosteo.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByTipoCosteo,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByTipoCosteo.setToolTipText("Cancelar"+" "+TipoCosteoConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByTipoCosteo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsTipoCosteo = new GridBagConstraints();
			this.gridBagConstraintsTipoCosteo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCosteo.gridy = iPosYOrderBy++;
			this.gridBagConstraintsTipoCosteo.gridx = iPosXOrderBy;
									
			this.jPanelOrderByTipoCosteo.add(this.jButtonCerrarOrderByTipoCosteo, this.gridBagConstraintsTipoCosteo);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalTipoCosteo = new GridBagLayout();
			
			this.jScrollPanelOrderByTipoCosteo= new JScrollPane(jPanelOrderByTipoCosteo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsTipoCosteo = new GridBagConstraints();
			this.gridBagConstraintsTipoCosteo.gridy =iPosYOrderBy;
			this.gridBagConstraintsTipoCosteo.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoCosteo.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByTipoCosteo.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByTipoCosteo.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalTipoCosteo);
			
			this.jInternalFrameOrderByTipoCosteo.getContentPane().add(this.jScrollPanelOrderByTipoCosteo, this.gridBagConstraintsTipoCosteo);			
		
		} else {
			this.jButtonAbrirOrderByTipoCosteo = new JButtonMe();
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
			&& this.tipocosteoSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosTipoCosteo.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosTipoCosteo.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosTipoCosteo.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosTipoCosteo.getRowHeight();//TipoCosteoConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.tipocosteoSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > TipoCosteoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoCosteo.isSelected()) {
					iHeightTable=TipoCosteoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoCosteoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoCosteoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > TipoCosteoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoCosteo.isSelected()) {
					iHeightTable=TipoCosteoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoCosteoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoCosteoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosTipoCosteo.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoCosteo.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoCosteo.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosTipoCosteo.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoCosteo.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoCosteo.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByTipoCosteo!=null && this.jInternalFrameOrderByTipoCosteo.getjTableDatosOrderBy()!=null) {
			//if(!this.tipocosteoSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByTipoCosteo.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByTipoCosteo.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByTipoCosteo.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByTipoCosteo.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByTipoCosteo.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByTipoCosteo.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByTipoCosteo.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosTipoCosteo.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoCosteo.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoCosteo.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=tipocosteoLogic.getTipoCosteos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipocosteos.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<TipoCosteo> TraerTipoCosteoBeans(List<TipoCosteo> tipocosteos,ArrayList<Classe> classes)throws Exception {
		try {
			for(TipoCosteo tipocosteo:tipocosteos) {
					
				if(!(TipoCosteoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || TipoCosteoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					tipocosteo.setsDetalleGeneralEntityReporte(TipoCosteoConstantesFunciones.getTipoCosteoDescripcion(tipocosteo));
										
						
					
					

					if(tipocosteo.getParametroInventarioDefectos()!=null && Funciones.existeClass(classes,ParametroInventarioDefecto.class)) {
						try{tipocosteo.setparametroinventariodefectosDescripcionReporte(new JRBeanCollectionDataSource(ParametroInventarioDefectoJInternalFrame.TraerParametroInventarioDefectoBeans(tipocosteo.getParametroInventarioDefectos(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//tipocosteo.setsDetalleGeneralEntityReporte(tipocosteo.getsDetalleGeneralEntityReporte());
										
				}
				
				//tipocosteobeans.add(tipocosteobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return tipocosteos;
    }
	//PARA REPORTES FIN
}
