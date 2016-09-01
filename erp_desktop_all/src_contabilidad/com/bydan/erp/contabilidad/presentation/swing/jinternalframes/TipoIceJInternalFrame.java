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
package com.bydan.erp.contabilidad.presentation.swing.jinternalframes;



import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;





//import com.bydan.erp.contabilidad.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.contabilidad.util.TipoIceConstantesFunciones;

import com.bydan.erp.contabilidad.business.logic.*;
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
public class TipoIceJInternalFrame extends TipoIceBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarTipoIce;
	
	protected JMenuBar jmenuBarTipoIce;
	
	protected JMenu jmenuTipoIce;
	protected JMenu jmenuDatosTipoIce;
	protected JMenu jmenuArchivoTipoIce;
	protected JMenu jmenuAccionesTipoIce;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosTipoIce = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoIce;	
	protected GridBagConstraints gridBagConstraintsTipoIce;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public TipoIceDetalleFormJInternalFrame jInternalFrameDetalleFormTipoIce;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoTipoIce;	
	protected ImportacionJInternalFrame jInternalFrameImportacionTipoIce;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public TipoIceSessionBean tipoiceSessionBean;
		
	
	
	
	//protected JDesktopPane jDesktopPane;
	public List<TipoIce> tipoices;		
	public List<TipoIce> tipoicesEliminados;	
	public List<TipoIce> tipoicesAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByTipoIce;		
	protected JButton jButtonAbrirOrderByTipoIce;
	
	
	//protected JPanel jPanelOrderByTipoIce;
	//public JScrollPane jScrollPanelOrderByTipoIce;	
	//protected JButton jButtonCerrarOrderByTipoIce;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public TipoIceLogic tipoiceLogic;
	
	
	
	public JScrollPane jScrollPanelDatosTipoIce;
	public JScrollPane jScrollPanelDatosEdicionTipoIce;
	public JScrollPane jScrollPanelDatosGeneralTipoIce;
    
	
	
	//public JScrollPane jScrollPanelDatosTipoIceOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoTipoIce;
	//public JScrollPane jScrollPanelImportacionTipoIce;
	
	
	
	protected JPanel jPanelAccionesTipoIce;
	
    protected JPanel jPanelPaginacionTipoIce;
    protected JPanel jPanelParametrosReportesTipoIce;
	protected JPanel jPanelParametrosReportesAccionesTipoIce;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1TipoIce;
	protected JPanel jPanelParametrosAuxiliar2TipoIce;
	protected JPanel jPanelParametrosAuxiliar3TipoIce;
	protected JPanel jPanelParametrosAuxiliar4TipoIce;
	//protected JPanel jPanelParametrosAuxiliar5TipoIce;
	
	
	
	//protected JPanel jPanelReporteDinamicoTipoIce;
	//protected JPanel jPanelImportacionTipoIce;
	
	
	public JTable jTableDatosTipoIce;
	
	
	
	//public JTable jTableDatosTipoIceOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoTipoIce;
	protected JButton jButtonDuplicarTipoIce;
	protected JButton jButtonCopiarTipoIce;
	protected JButton jButtonVerFormTipoIce;
	protected JButton jButtonNuevoRelacionesTipoIce;
	protected JButton jButtonModificarTipoIce;
	
    protected JButton jButtonGuardarCambiosTablaTipoIce;
	protected JButton jButtonCerrarTipoIce;
	
	
	protected JButton jButtonRecargarInformacionTipoIce;
	protected JButton jButtonProcesarInformacionTipoIce;
	
	
	protected JButton jButtonAnterioresTipoIce;
	protected JButton jButtonSiguientesTipoIce;
	protected JButton jButtonNuevoGuardarCambiosTipoIce;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoTipoIce;
	//protected JButton jButtonCerrarReporteDinamicoTipoIce;
	//protected JButton jButtonGenerarExcelReporteDinamicoTipoIce;	
	
	
	
	//protected JButton jButtonAbrirImportacionTipoIce;
	//protected JButton jButtonGenerarImportacionTipoIce;
	//protected JButton jButtonCerrarImportacionTipoIce;
	//protected JFileChooser jFileChooserImportacionTipoIce;
	//protected File fileImportacionTipoIce;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoIce;
	protected JButton jButtonDuplicarToolBarTipoIce;
	protected JButton jButtonNuevoRelacionesToolBarTipoIce;
	
	
	public JButton jButtonGuardarCambiosToolBarTipoIce;
	protected JButton jButtonCopiarToolBarTipoIce;
	protected JButton jButtonVerFormToolBarTipoIce;
	public JButton jButtonGuardarCambiosTablaToolBarTipoIce;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoIce;
	protected JButton jButtonCerrarToolBarTipoIce;
	
	protected JButton jButtonRecargarInformacionToolBarTipoIce;
	protected JButton jButtonProcesarInformacionToolBarTipoIce;
	protected JButton jButtonAnterioresToolBarTipoIce;
	protected JButton jButtonSiguientesToolBarTipoIce;
	protected JButton jButtonNuevoGuardarCambiosToolBarTipoIce;
	protected JButton jButtonAbrirOrderByToolBarTipoIce;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoIce;
	protected JMenuItem jMenuItemDuplicarTipoIce;
	protected JMenuItem jMenuItemNuevoRelacionesTipoIce;
	
	
	protected JMenuItem jMenuItemGuardarCambiosTipoIce;
	protected JMenuItem jMenuItemCopiarTipoIce;
	protected JMenuItem jMenuItemVerFormTipoIce;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoIce;
	protected JMenuItem jMenuItemCerrarTipoIce;
	protected JMenuItem jMenuItemDetalleCerrarTipoIce;
	protected JMenuItem jMenuItemDetalleAbrirOrderByTipoIce;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoIce;
	
	protected JMenuItem jMenuItemRecargarInformacionTipoIce;
	protected JMenuItem jMenuItemProcesarInformacionTipoIce;
	protected JMenuItem jMenuItemAnterioresTipoIce;
	protected JMenuItem jMenuItemSiguientesTipoIce;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoIce;
	protected JMenuItem jMenuItemAbrirOrderByTipoIce;
	protected JMenuItem jMenuItemMostrarOcultarTipoIce;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoIce;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosTipoIce;
	protected JCheckBox jCheckBoxSeleccionadosTipoIce;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaTipoIce;
	protected JCheckBox jCheckBoxConGraficoReporteTipoIce;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesTipoIce;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesTipoIce;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoTipoIce;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoTipoIce;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesTipoIce;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionTipoIce;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoIce;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoIce;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarTipoIce;
	protected JTextField jTextFieldValorCampoGeneralTipoIce;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteTipoIce;
	//public JList<Reporte> jListColumnasSelectReporteTipoIce;
	//public JScrollPane jScrollColumnasSelectReporteTipoIce;
	
	//public JLabel jLabelRelacionesSelectReporteTipoIce;
	//public JList<Reporte> jListRelacionesSelectReporteTipoIce;
	//public JScrollPane jScrollRelacionesSelectReporteTipoIce;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoTipoIce;
	//protected JCheckBox jCheckBoxConGraficoDinamicoTipoIce;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoTipoIce;
	//public JLabel jLabelTiposArchivoReporteDinamicoTipoIce;
	
		
	//public JLabel jLabelArchivoImportacionTipoIce;	
	//public JLabel jLabelPathArchivoImportacionTipoIce;
	//protected JTextField jTextFieldPathArchivoImportacionTipoIce;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoTipoIce;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoTipoIce;
	
	//public JLabel jLabelColumnaCategoriaValorTipoIce;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorTipoIce;
	
	//public JLabel jLabelColumnasValoresGraficoTipoIce;
	//public JList<Reporte> jListColumnasValoresGraficoTipoIce;
	//public JScrollPane jScrollColumnasValoresGraficoTipoIce;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoTipoIce;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoTipoIce;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasTipoIce;
	public JPanel jPanelBusquedaPorNombreTipoIce;
	public JButton jButtonBusquedaPorNombreTipoIce;
	
	public JPanel jPanelnombreBusquedaPorNombreTipoIce;
	public JLabel jLabelnombreBusquedaPorNombreTipoIce;
	public JTextArea jTextAreanombreBusquedaPorNombreTipoIce;
	public JButton jButtonnombreBusquedaPorNombreTipoIceBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=330;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public TipoIceJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("TipoIce No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoIceJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoIce No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoIceJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoIce No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoIceJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoIce No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionTipoIce)	{
		this.jButtonRecargarInformacionTipoIce = jButtonRecargarInformacionTipoIce;
	}
	
	public JButton getjButtonProcesarInformacionTipoIce() {
		return this.jButtonProcesarInformacionTipoIce;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoIce)	{
		this.jButtonProcesarInformacionTipoIce = jButtonProcesarInformacionTipoIce;
	}
	
	
	public JButton getjButtonRecargarInformacionTipoIce() {
		return this.jButtonRecargarInformacionTipoIce;
	}
	
	
	public List<TipoIce> gettipoices() {
		return this.tipoices;
	}

	public void settipoices(List<TipoIce> tipoices) {
		this.tipoices = tipoices;
	}
	
	public List<TipoIce> gettipoicesAux() {
		return this.tipoicesAux;
	}

	public void settipoicesAux(List<TipoIce> tipoicesAux) {
		this.tipoicesAux = tipoicesAux;
	}
	
	public List<TipoIce> gettipoicesEliminados() {
		return this.tipoicesEliminados;
	}

	public void setTipoIcesEliminados(List<TipoIce> tipoicesEliminados) {
		this.tipoicesEliminados = tipoicesEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarTipoIce() {
		return jComboBoxTiposSeleccionarTipoIce;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarTipoIce(
			JComboBox jComboBoxTiposSeleccionarTipoIce) {
		this.jComboBoxTiposSeleccionarTipoIce = jComboBoxTiposSeleccionarTipoIce;
	}
	
	public void setBorderResaltarTiposSeleccionarTipoIce() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarTipoIce.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarTipoIce .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralTipoIce() {
		return jTextFieldValorCampoGeneralTipoIce;
	}

	public void setjTextFieldValorCampoGeneralTipoIce(
			JTextField jTextFieldValorCampoGeneralTipoIce) {
		this.jTextFieldValorCampoGeneralTipoIce = jTextFieldValorCampoGeneralTipoIce;
	}

	public void setBorderResaltarValorCampoGeneralTipoIce() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoIce.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralTipoIce .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosTipoIce() {
		return this.jCheckBoxSeleccionarTodosTipoIce;
	}

	public void setjCheckBoxSeleccionarTodosTipoIce(
			JCheckBox jCheckBoxSeleccionarTodosTipoIce) {
		this.jCheckBoxSeleccionarTodosTipoIce = jCheckBoxSeleccionarTodosTipoIce;
	}

	public void setBorderResaltarSeleccionarTodosTipoIce() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoIce.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosTipoIce .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosTipoIce() {
		return this.jCheckBoxSeleccionadosTipoIce;
	}

	public void setjCheckBoxSeleccionadosTipoIce(
			JCheckBox jCheckBoxSeleccionadosTipoIce) {
		this.jCheckBoxSeleccionadosTipoIce = jCheckBoxSeleccionadosTipoIce;
	}
	
	public void setBorderResaltarSeleccionadosTipoIce() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoIce.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosTipoIce .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesTipoIce() {
		return this.jComboBoxTiposArchivosReportesTipoIce;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesTipoIce(
			JComboBox jComboBoxTiposArchivosReportesTipoIce) {
		this.jComboBoxTiposArchivosReportesTipoIce = jComboBoxTiposArchivosReportesTipoIce;
	}

	public void setBorderResaltarTiposArchivosReportesTipoIce() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoIce.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesTipoIce .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesTipoIce() {
		return this.jComboBoxTiposReportesTipoIce;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesTipoIce(
			JComboBox jComboBoxTiposReportesTipoIce) {
		this.jComboBoxTiposReportesTipoIce = jComboBoxTiposReportesTipoIce;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoTipoIce() {
	//	return jComboBoxTiposReportesDinamicoTipoIce;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoTipoIce(
	//		JComboBox jComboBoxTiposReportesDinamicoTipoIce) {
	//	this.jComboBoxTiposReportesDinamicoTipoIce = jComboBoxTiposReportesDinamicoTipoIce;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoTipoIce() {
	//	return jComboBoxTiposArchivosReportesDinamicoTipoIce;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoTipoIce(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoTipoIce) {
	//	this.jComboBoxTiposArchivosReportesDinamicoTipoIce = jComboBoxTiposArchivosReportesDinamicoTipoIce;
	//}
	
	public void setBorderResaltarTiposReportesTipoIce() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoIce.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesTipoIce .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesTipoIce() {
		return this.jComboBoxTiposGraficosReportesTipoIce;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesTipoIce(
			JComboBox jComboBoxTiposGraficosReportesTipoIce) {
		this.jComboBoxTiposGraficosReportesTipoIce = jComboBoxTiposGraficosReportesTipoIce;
	}
	
	public void setBorderResaltarTiposGraficosReportesTipoIce() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoIce.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesTipoIce .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionTipoIce() {
		return this.jComboBoxTiposPaginacionTipoIce;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionTipoIce(
			JComboBox jComboBoxTiposPaginacionTipoIce) {
		this.jComboBoxTiposPaginacionTipoIce = jComboBoxTiposPaginacionTipoIce;
	}
	
	public void setBorderResaltarTiposPaginacionTipoIce() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoIce.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionTipoIce .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesTipoIce() {
		return this.jComboBoxTiposRelacionesTipoIce;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoIce() {
		return this.jComboBoxTiposAccionesTipoIce;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoIce(
			JComboBox jComboBoxTiposRelacionesTipoIce) {
		this.jComboBoxTiposRelacionesTipoIce = jComboBoxTiposRelacionesTipoIce;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoIce(
			JComboBox jComboBoxTiposAccionesTipoIce) {
		this.jComboBoxTiposAccionesTipoIce = jComboBoxTiposAccionesTipoIce;
	}
	
	public void setBorderResaltarTiposRelacionesTipoIce() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoIce.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesTipoIce .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesTipoIce() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoIce.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesTipoIce .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoTipoIce() {
	//	return jCheckBoxConGraficoDinamicoTipoIce;
	//}

	//public void setjCheckBoxConGraficoDinamicoTipoIce(
	//		JCheckBox jCheckBoxConGraficoDinamicoTipoIce) {
	//	this.jCheckBoxConGraficoDinamicoTipoIce = jCheckBoxConGraficoDinamicoTipoIce;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoTipoIce() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarTipoIce.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoTipoIce .setBorder(borderResaltar);		
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
		this.tipoiceSessionBean=new TipoIceSessionBean();
		
		this.tipoiceSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipoiceSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipoiceSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=TipoIceJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=TipoIceJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoIceJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoIceJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoIceJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Ice MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.tipoiceSessionBean.getEsGuardarRelacionado()) {
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
		
		TipoIceJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("TipoIce No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarTipoIce= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarTipoIce=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarTipoIce,this.jTtoolBarTipoIce,
							"nuevo","nuevo","Nuevo"+" "+TipoIceConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoIce=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarTipoIce,this.jTtoolBarTipoIce,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoIce=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarTipoIce,this.jTtoolBarTipoIce,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+TipoIceConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarTipoIce=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarTipoIce,this.jTtoolBarTipoIce,
							"duplicar","duplicar","Duplicar"+" "+TipoIceConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarTipoIce=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarTipoIce,this.jTtoolBarTipoIce,
							"copiar","copiar","Copiar"+" "+TipoIceConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarTipoIce=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarTipoIce,this.jTtoolBarTipoIce,
							"ver_form","ver_form","Ver"+" "+TipoIceConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarTipoIce=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoIce,this.jTtoolBarTipoIce,
							"recargar","recargar","Recargar"+" "+TipoIceConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarTipoIce=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoIce,this.jTtoolBarTipoIce,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarTipoIce=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoIce,this.jTtoolBarTipoIce,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarTipoIce=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarTipoIce,this.jTtoolBarTipoIce,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarTipoIce=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarTipoIce,this.jTtoolBarTipoIce,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarTipoIce=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarTipoIce,this.jTtoolBarTipoIce,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+TipoIceConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarTipoIce=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarTipoIce,this.jTtoolBarTipoIce,
							"cerrar","cerrar","Salir"+" "+TipoIceConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarTipoIce=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarTipoIce;
			
				this.jButtonProcesarInformacionToolBarTipoIce=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarTipoIce;
				
		//protected JButton jButtonModificarToolBarTipoIce;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarTipoIce=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuTipoIce=new JMenuMe("General");
		this.jmenuArchivoTipoIce=new JMenuMe("Archivo");
		this.jmenuAccionesTipoIce=new JMenuMe("Acciones");
		this.jmenuDatosTipoIce=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoIce= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoIce.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoIce,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoIce, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarTipoIce= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarTipoIce.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarTipoIce,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarTipoIce, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesTipoIce= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesTipoIce.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesTipoIce,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesTipoIce, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosTipoIce= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoIce.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoIce,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoIce, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarTipoIce= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarTipoIce.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarTipoIce,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarTipoIce, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormTipoIce= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormTipoIce.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormTipoIce,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormTipoIce, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaTipoIce= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaTipoIce.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaTipoIce,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaTipoIce, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoIce= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoIce.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoIce,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoIce, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionTipoIce= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionTipoIce.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionTipoIce,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionTipoIce, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionTipoIce= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionTipoIce.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionTipoIce,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresTipoIce= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresTipoIce.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresTipoIce,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresTipoIce, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesTipoIce= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesTipoIce.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesTipoIce,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesTipoIce, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByTipoIce= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByTipoIce.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByTipoIce,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByTipoIce, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoIce= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoIce.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoIce,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoIce, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByTipoIce= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByTipoIce.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByTipoIce,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByTipoIce, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoIce= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoIce.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoIce,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoIce, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosTipoIce= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosTipoIce.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosTipoIce,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosTipoIce, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoTipoIce.add(this.jMenuItemCerrarTipoIce);
			
			this.jmenuAccionesTipoIce.add(this.jMenuItemNuevoTipoIce);
			this.jmenuAccionesTipoIce.add(this.jMenuItemNuevoGuardarCambiosTipoIce);
			this.jmenuAccionesTipoIce.add(this.jMenuItemNuevoRelacionesTipoIce);
			this.jmenuAccionesTipoIce.add(this.jMenuItemGuardarCambiosTablaTipoIce);		
			this.jmenuAccionesTipoIce.add(this.jMenuItemDuplicarTipoIce);		
			this.jmenuAccionesTipoIce.add(this.jMenuItemCopiarTipoIce);		
			this.jmenuAccionesTipoIce.add(this.jMenuItemVerFormTipoIce);		
			
			this.jmenuDatosTipoIce.add(this.jMenuItemRecargarInformacionTipoIce);				
			this.jmenuDatosTipoIce.add(this.jMenuItemAnterioresTipoIce);				
			this.jmenuDatosTipoIce.add(this.jMenuItemSiguientesTipoIce);				
			this.jmenuDatosTipoIce.add(this.jMenuItemAbrirOrderByTipoIce);				
			this.jmenuDatosTipoIce.add(this.jMenuItemMostrarOcultarTipoIce);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesTipoIce.add(this.jMenuItemGuardarCambiosTipoIce);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoTipoIce, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesTipoIce, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosTipoIce, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarTipoIce.add(this.jmenuArchivoTipoIce);		
			this.jmenuBarTipoIce.add(this.jmenuAccionesTipoIce);		
			this.jmenuBarTipoIce.add(this.jmenuDatosTipoIce);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarTipoIce);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasTipoIce() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaPorNombreTipoIce=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorNombreTipoIce.setToolTipText("Buscar Por Nombre ");
		this.jButtonBusquedaPorNombreTipoIce= new JButtonMe();
		this.jButtonBusquedaPorNombreTipoIce.setText("Buscar");
		this.jButtonBusquedaPorNombreTipoIce.setToolTipText("Buscar Por Nombre ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorNombreTipoIce,"buscar_button","Buscar Por Nombre ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorNombreTipoIce, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelnombreBusquedaPorNombreTipoIce = new JLabelMe();
		jLabelnombreBusquedaPorNombreTipoIce.setText("Nombre :");
		jLabelnombreBusquedaPorNombreTipoIce.setToolTipText("Nombre");
		jLabelnombreBusquedaPorNombreTipoIce.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombreTipoIce.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombreTipoIce.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelnombreBusquedaPorNombreTipoIce,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextAreanombreBusquedaPorNombreTipoIce= new JTextAreaMe();
		jTextAreanombreBusquedaPorNombreTipoIce.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBusquedaPorNombreTipoIce.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBusquedaPorNombreTipoIce.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextArea(jTextAreanombreBusquedaPorNombreTipoIce,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasTipoIce=new JTabbedPane();


		this.jTabbedPaneBusquedasTipoIce.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoIce.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoIce.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasTipoIce.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasTipoIce.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasTipoIce,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleTipoIce = new TipoIceDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Tipo Ice DATOS");
			this.jInternalFrameDetalleFormTipoIce = new TipoIceDetalleFormJInternalFrame(jDesktopPane,this.tipoiceSessionBean.getConGuardarRelaciones(),this.tipoiceSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormTipoIce = null;//new TipoIceDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoIce= new GridBagLayout();
		
		
		this.jTableDatosTipoIce = new JTableMe();      
		
		String sToolTipTipoIce="";
		sToolTipTipoIce=TipoIceConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoIce+="(Contabilidad.TipoIce)";
		}
		
		if(!this.tipoiceSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoIce+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosTipoIce.setToolTipText(sToolTipTipoIce);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosTipoIce);
		this.jTableDatosTipoIce.setAutoCreateRowSorter(true);
		this.jTableDatosTipoIce.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosTipoIce.setRowSelectionAllowed(true);
		this.jTableDatosTipoIce.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosTipoIce,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoTipoIce = new JButtonMe();
		this.jButtonDuplicarTipoIce = new JButtonMe();
		this.jButtonCopiarTipoIce = new JButtonMe();
		this.jButtonVerFormTipoIce = new JButtonMe();
		this.jButtonNuevoRelacionesTipoIce = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaTipoIce = new JButtonMe();
		this.jButtonCerrarTipoIce = new JButtonMe();
		
		this.jScrollPanelDatosTipoIce = new JScrollPane();   
        this.jScrollPanelDatosGeneralTipoIce = new JScrollPane();
		
				
		
		
		this.jPanelAccionesTipoIce = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Ice";
		
		if(!this.tipoiceSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoIce.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Ices" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoIce.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralTipoIce.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesTipoIce.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoIce.setToolTipText("Acciones");
        this.jPanelAccionesTipoIce.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoIce, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoIce, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoTipoIce=new ReporteDinamicoJInternalFrame(TipoIceConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoTipoIce();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionTipoIce=new ImportacionJInternalFrame(TipoIceConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionTipoIce();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByTipoIce = new JButtonMe();
		
		this.jButtonAbrirOrderByTipoIce.setText("Orden");
		this.jButtonAbrirOrderByTipoIce.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoIce,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoIce, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByTipoIce.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByTipoIce.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoIce=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoIce,false,this);
			
			//this.cargarOrderByTipoIce(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoIce=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoIce,true,this);
			
			//this.cargarOrderByTipoIce(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosTipoIce.setMinimumSize(new Dimension(400,50));//430
		this.jTableDatosTipoIce.setMaximumSize(new Dimension(400,50));//430
		this.jTableDatosTipoIce.setPreferredSize(new Dimension(400,50));//430
		
		this.jScrollPanelDatosTipoIce.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoIce.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoIce.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoTipoIce.setText("Nuevo");
		this.jButtonDuplicarTipoIce.setText("Duplicar");
		this.jButtonCopiarTipoIce.setText("Copiar");
		this.jButtonVerFormTipoIce.setText("Ver");
		this.jButtonNuevoRelacionesTipoIce.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaTipoIce.setText("Guardar");
		this.jButtonCerrarTipoIce.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoIce,"nuevo_button","Nuevo",this.tipoiceSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarTipoIce,"duplicar_button","Duplicar",this.tipoiceSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarTipoIce,"copiar_button","Copiar",this.tipoiceSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormTipoIce,"ver_form","Ver",this.tipoiceSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesTipoIce,"nuevorelaciones_button","Nuevo Rel",this.tipoiceSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoIce,"guardarcambiostabla_button","Guardar",this.tipoiceSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoIce,"cerrar_button","Salir",this.tipoiceSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoIce, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarTipoIce, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarTipoIce, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormTipoIce, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesTipoIce, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoIce, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoIce, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoTipoIce.setToolTipText("Nuevo"+" "+TipoIceConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarTipoIce.setToolTipText("Duplicar"+" "+TipoIceConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarTipoIce.setToolTipText("Copiar"+" "+TipoIceConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormTipoIce.setToolTipText("Ver"+" "+TipoIceConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesTipoIce.setToolTipText("Nuevo Rel"+" "+TipoIceConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaTipoIce.setToolTipText("Guardar"+" "+TipoIceConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoIce.setToolTipText("Salir"+" "+TipoIceConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoIce";
		inputMap = this.jButtonNuevoTipoIce.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoIce.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoIce"));
		
		//DUPLICAR
		sMapKey = "DuplicarTipoIce";
		inputMap = this.jButtonDuplicarTipoIce.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarTipoIce.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarTipoIce"));
		
		//COPIAR
		sMapKey = "CopiarTipoIce";
		inputMap = this.jButtonCopiarTipoIce.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarTipoIce.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarTipoIce"));
		
		//VEr FORM
		sMapKey = "VerFormTipoIce";
		inputMap = this.jButtonVerFormTipoIce.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormTipoIce.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormTipoIce"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesTipoIce";
		inputMap = this.jButtonNuevoRelacionesTipoIce.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesTipoIce.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesTipoIce"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarTipoIce";
		inputMap = this.jButtonModificarTipoIce.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarTipoIce.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarTipoIce"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarTipoIce";
		inputMap = this.jButtonCerrarTipoIce.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoIce.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoIce"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoIce";
		inputMap = this.jButtonGuardarCambiosTablaTipoIce.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoIce.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoIce"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesTipoIce = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesTipoIce = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionTipoIce = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1TipoIce= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2TipoIce= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3TipoIce= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4TipoIce= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5TipoIce= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesTipoIce.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesTipoIce.setName("jPanelParametrosReportesTipoIce"); 
		
		this.jPanelParametrosReportesAccionesTipoIce.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesTipoIce.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesTipoIce.setName("jPanelParametrosReportesAccionesTipoIce"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesTipoIce, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesTipoIce, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionTipoIce = new JButtonMe();
		this.jButtonRecargarInformacionTipoIce.setText("Recargar");
		this.jButtonRecargarInformacionTipoIce.setToolTipText("Recargar"+" "+TipoIceConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionTipoIce,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionTipoIce = new JButtonMe();
		this.jButtonProcesarInformacionTipoIce.setText("Procesar");
		this.jButtonProcesarInformacionTipoIce.setToolTipText("Procesar"+" "+TipoIceConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionTipoIce.setVisible(false);
			
		this.jButtonProcesarInformacionTipoIce.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoIce.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoIce.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesTipoIce = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoIce.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesTipoIce.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesTipoIce = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoIce.setText("TIPO");       
		this.jComboBoxTiposReportesTipoIce.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesTipoIce = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoIce.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesTipoIce.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionTipoIce = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionTipoIce.setText("Paginacion");
		this.jComboBoxTiposPaginacionTipoIce.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesTipoIce = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesTipoIce.setText("Accion");
		this.jComboBoxTiposRelacionesTipoIce.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesTipoIce = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoIce.setText("Accion");
		this.jComboBoxTiposAccionesTipoIce.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarTipoIce = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarTipoIce.setText("Accion");
		this.jComboBoxTiposSeleccionarTipoIce.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralTipoIce=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralTipoIce.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoIce.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoIce.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesTipoIce = new JLabelMe();
		
		this.jLabelAccionesTipoIce.setText("Acciones");		
		this.jLabelAccionesTipoIce.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoIce.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoIce.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosTipoIce = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosTipoIce.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosTipoIce.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosTipoIce = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosTipoIce.setText("Seleccionados");
		this.jCheckBoxSeleccionadosTipoIce.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaTipoIce = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaTipoIce.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaTipoIce.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteTipoIce = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteTipoIce.setText("Graf.");
		this.jCheckBoxConGraficoReporteTipoIce.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresTipoIce = new JButtonMe();
		//this.jButtonAnterioresTipoIce.setText("<<");
        this.jButtonAnterioresTipoIce.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresTipoIce,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresTipoIce, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesTipoIce = new JButtonMe();
		//this.jButtonSiguientesTipoIce.setText(">>");
        this.jButtonSiguientesTipoIce.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesTipoIce,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesTipoIce, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosTipoIce = new JButtonMe();
		this.jButtonNuevoGuardarCambiosTipoIce.setText("Nue");
        this.jButtonNuevoGuardarCambiosTipoIce.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosTipoIce,"nuevoguardarcambios_button","Nue",this.tipoiceSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosTipoIce, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosTipoIce";
		inputMap = this.jButtonNuevoGuardarCambiosTipoIce.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosTipoIce.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosTipoIce"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionTipoIce";
		inputMap = this.jButtonRecargarInformacionTipoIce.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionTipoIce.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionTipoIce"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesTipoIce";
		inputMap = this.jButtonSiguientesTipoIce.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesTipoIce.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesTipoIce"));
		
		//ANTERIORES		
		sMapKey = "AnterioresTipoIce";
		inputMap = this.jButtonAnterioresTipoIce.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresTipoIce.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresTipoIce"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasTipoIce();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesTipoIce.setMinimumSize(new Dimension(this.getWidth(),TipoIceBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoIceBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoIce.setMaximumSize(new Dimension(this.getWidth(),TipoIceBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoIceBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoIce.setPreferredSize(new Dimension(this.getWidth(),TipoIceBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoIceBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionTipoIce = new GridBagLayout();

			this.jPanelPaginacionTipoIce.setLayout(gridaBagLayoutPaginacionTipoIce);						
			
			this.gridBagConstraintsTipoIce = new GridBagConstraints();
			this.gridBagConstraintsTipoIce.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsTipoIce.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoIce.gridy = 0;
			this.gridBagConstraintsTipoIce.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionTipoIce.add(this.jButtonAnterioresTipoIce, this.gridBagConstraintsTipoIce);
					
						
			this.gridBagConstraintsTipoIce = new GridBagConstraints();
			this.gridBagConstraintsTipoIce.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoIce.gridy = 0;
			
			this.jPanelPaginacionTipoIce.add(this.jButtonNuevoGuardarCambiosTipoIce, this.gridBagConstraintsTipoIce);
						
			
			this.gridBagConstraintsTipoIce = new GridBagConstraints();
			this.gridBagConstraintsTipoIce.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsTipoIce.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoIce.gridy = 0;
			this.jPanelPaginacionTipoIce.add(this.jButtonSiguientesTipoIce, this.gridBagConstraintsTipoIce);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsTipoIce = new GridBagConstraints();
			this.gridBagConstraintsTipoIce.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoIce.gridy = 1;
			this.gridBagConstraintsTipoIce.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoIce.add(this.jButtonNuevoTipoIce, this.gridBagConstraintsTipoIce);
						
			
			
			if(!this.tipoiceSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsTipoIce = new GridBagConstraints();
				this.gridBagConstraintsTipoIce.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoIce.gridy = 1;
				this.gridBagConstraintsTipoIce.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionTipoIce.add(this.jButtonGuardarCambiosTablaTipoIce, this.gridBagConstraintsTipoIce);
			}
			
			
			
			this.gridBagConstraintsTipoIce = new GridBagConstraints();
			this.gridBagConstraintsTipoIce.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoIce.gridy = 1;
			this.gridBagConstraintsTipoIce.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoIce.add(this.jButtonDuplicarTipoIce, this.gridBagConstraintsTipoIce);
			
			this.gridBagConstraintsTipoIce = new GridBagConstraints();
			this.gridBagConstraintsTipoIce.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoIce.gridy = 1;
			this.gridBagConstraintsTipoIce.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoIce.add(this.jButtonCopiarTipoIce, this.gridBagConstraintsTipoIce);
		
			this.gridBagConstraintsTipoIce = new GridBagConstraints();
			this.gridBagConstraintsTipoIce.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoIce.gridy = 1;
			this.gridBagConstraintsTipoIce.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoIce.add(this.jButtonVerFormTipoIce, this.gridBagConstraintsTipoIce);
		
			this.gridBagConstraintsTipoIce = new GridBagConstraints();
			this.gridBagConstraintsTipoIce.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoIce.gridy = 1;
			this.gridBagConstraintsTipoIce.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionTipoIce.add(this.jButtonCerrarTipoIce, this.gridBagConstraintsTipoIce);
		
		
		
		this.jButtonRecargarInformacionTipoIce.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoIce.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoIce.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionTipoIce, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesTipoIce.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoIce.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoIce.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesTipoIce, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesTipoIce.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoIce.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoIce.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesTipoIce, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesTipoIce.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoIce.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoIce.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesTipoIce, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionTipoIce.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoIce.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoIce.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionTipoIce, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesTipoIce.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoIce.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoIce.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesTipoIce, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesTipoIce.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoIce.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoIce.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoIce, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarTipoIce.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoIce.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoIce.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarTipoIce, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaTipoIce.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoIce.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoIce.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaTipoIce, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteTipoIce.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoIce.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoIce.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteTipoIce, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosTipoIce.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoIce.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoIce.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosTipoIce, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosTipoIce.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoIce.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoIce.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosTipoIce, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesTipoIce = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesTipoIce = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1TipoIce = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2TipoIce = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3TipoIce = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4TipoIce = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesTipoIce.setLayout(gridaBagParametrosReportesTipoIce);
			this.jPanelParametrosReportesAccionesTipoIce.setLayout(gridaBagParametrosReportesAccionesTipoIce);
			
			
			this.jPanelParametrosAuxiliar1TipoIce.setLayout(gridaBagParametrosAuxiliar1TipoIce);
			this.jPanelParametrosAuxiliar2TipoIce.setLayout(gridaBagParametrosAuxiliar2TipoIce);
			this.jPanelParametrosAuxiliar3TipoIce.setLayout(gridaBagParametrosAuxiliar3TipoIce);
			this.jPanelParametrosAuxiliar4TipoIce.setLayout(gridaBagParametrosAuxiliar4TipoIce);
			//this.jPanelParametrosAuxiliar5TipoIce.setLayout(gridaBagParametrosAuxiliar2TipoIce);			
			
			
			
			
			this.gridBagConstraintsTipoIce = new GridBagConstraints();
			this.gridBagConstraintsTipoIce.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoIce.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoIce.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoIce.add(this.jButtonRecargarInformacionTipoIce, this.gridBagConstraintsTipoIce);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsTipoIce = new GridBagConstraints();
			this.gridBagConstraintsTipoIce.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoIce.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoIce.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoIce.add(this.jComboBoxTiposPaginacionTipoIce, this.gridBagConstraintsTipoIce);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsTipoIce = new GridBagConstraints();
			this.gridBagConstraintsTipoIce.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoIce.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoIce.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoIce.add(this.jCheckBoxConAltoMaximoTablaTipoIce, this.gridBagConstraintsTipoIce);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsTipoIce = new GridBagConstraints();
			this.gridBagConstraintsTipoIce.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoIce.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoIce.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoIce.add(this.jComboBoxTiposArchivosReportesTipoIce, this.gridBagConstraintsTipoIce);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsTipoIce = new GridBagConstraints();
			this.gridBagConstraintsTipoIce.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoIce.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoIce.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoIce.add(this.jPanelParametrosAuxiliar1TipoIce, this.gridBagConstraintsTipoIce);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsTipoIce = new GridBagConstraints();
			this.gridBagConstraintsTipoIce.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoIce.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoIce.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoIce.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4TipoIce.add(this.jComboBoxTiposReportesTipoIce, this.gridBagConstraintsTipoIce);																		
			
			
			
			this.gridBagConstraintsTipoIce = new GridBagConstraints();
			this.gridBagConstraintsTipoIce.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoIce.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoIce.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoIce.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4TipoIce.add(this.jComboBoxTiposGraficosReportesTipoIce, this.gridBagConstraintsTipoIce);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsTipoIce = new GridBagConstraints();
			this.gridBagConstraintsTipoIce.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoIce.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoIce.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoIce.add(this.jPanelParametrosAuxiliar4TipoIce, this.gridBagConstraintsTipoIce);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsTipoIce = new GridBagConstraints();
			this.gridBagConstraintsTipoIce.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoIce.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoIce.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoIce.add(this.jComboBoxTiposReportesTipoIce, this.gridBagConstraintsTipoIce);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsTipoIce = new GridBagConstraints();
			this.gridBagConstraintsTipoIce.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoIce.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoIce.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoIce.add(this.jCheckBoxGenerarReporteTipoIce, this.gridBagConstraintsTipoIce);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsTipoIce = new GridBagConstraints();
			this.gridBagConstraintsTipoIce.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoIce.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoIce.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoIce.add(this.jPanelParametrosAuxiliar2TipoIce, this.gridBagConstraintsTipoIce);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsTipoIce = new GridBagConstraints();
			this.gridBagConstraintsTipoIce.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoIce.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoIce.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoIce.add(this.jLabelAccionesTipoIce, this.gridBagConstraintsTipoIce);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsTipoIce = new GridBagConstraints();
				this.gridBagConstraintsTipoIce.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsTipoIce.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsTipoIce.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesTipoIce.add(this.jButtonAbrirOrderByTipoIce, this.gridBagConstraintsTipoIce);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsTipoIce = new GridBagConstraints();
			this.gridBagConstraintsTipoIce.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsTipoIce.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoIce.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoIce.add(this.jComboBoxTiposSeleccionarTipoIce, this.gridBagConstraintsTipoIce);			
			
			
			/*
			this.gridBagConstraintsTipoIce = new GridBagConstraints();
			this.gridBagConstraintsTipoIce.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoIce.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoIce.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoIce.add(this.jCheckBoxSeleccionarTodosTipoIce, this.gridBagConstraintsTipoIce);
			
			this.gridBagConstraintsTipoIce = new GridBagConstraints();
			this.gridBagConstraintsTipoIce.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoIce.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoIce.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoIce.add(this.jCheckBoxConGraficoReporteTipoIce, this.gridBagConstraintsTipoIce);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsTipoIce = new GridBagConstraints();
			this.gridBagConstraintsTipoIce.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoIce.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoIce.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoIce.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoIce.add(this.jCheckBoxSeleccionarTodosTipoIce, this.gridBagConstraintsTipoIce);															
				
			this.gridBagConstraintsTipoIce = new GridBagConstraints();
			this.gridBagConstraintsTipoIce.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoIce.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoIce.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoIce.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoIce.add(this.jCheckBoxSeleccionadosTipoIce, this.gridBagConstraintsTipoIce);															
			
			this.gridBagConstraintsTipoIce = new GridBagConstraints();
			this.gridBagConstraintsTipoIce.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoIce.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoIce.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoIce.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoIce.add(this.jCheckBoxConGraficoReporteTipoIce, this.gridBagConstraintsTipoIce);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsTipoIce = new GridBagConstraints();
			this.gridBagConstraintsTipoIce.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoIce.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoIce.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoIce.add(this.jPanelParametrosAuxiliar3TipoIce, this.gridBagConstraintsTipoIce);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsTipoIce = new GridBagConstraints();
			this.gridBagConstraintsTipoIce.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoIce.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoIce.add(this.jComboBoxTiposRelacionesTipoIce, this.gridBagConstraintsTipoIce);
				
			this.gridBagConstraintsTipoIce = new GridBagConstraints();
			this.gridBagConstraintsTipoIce.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoIce.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoIce.add(this.jComboBoxTiposAccionesTipoIce, this.gridBagConstraintsTipoIce);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosTipoIce = new GridBagLayout();

			this.jScrollPanelDatosTipoIce.setLayout(gridaBagLayoutDatosTipoIce);
			
			this.gridBagConstraintsTipoIce = new GridBagConstraints();
			this.gridBagConstraintsTipoIce.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoIce.gridy = 0;
			this.gridBagConstraintsTipoIce.gridx = 0;
			
			this.jScrollPanelDatosTipoIce.add(this.jTableDatosTipoIce, this.gridBagConstraintsTipoIce);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosTipoIce.setViewportView(this.jTableDatosTipoIce);
		this.jTableDatosTipoIce.setFillsViewportHeight(true);
		this.jTableDatosTipoIce.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesTipoIce= new GridBagLayout();
		this.jPanelAccionesTipoIce.setLayout(gridaBagLayoutAccionesTipoIce);
		
		
		/*	
		this.gridBagConstraintsTipoIce = new GridBagConstraints();
		this.gridBagConstraintsTipoIce.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoIce.gridy = 0;
		this.gridBagConstraintsTipoIce.gridx = 0;
			
		this.jPanelAccionesTipoIce.add(this.jButtonNuevoTipoIce, this.gridBagConstraintsTipoIce);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaPorNombreTipoIce= new GridBagLayout();
		gridaBagLayoutBusquedaPorNombreTipoIce.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorNombreTipoIce.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorNombreTipoIce.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorNombreTipoIce.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorNombreTipoIce.setLayout(gridaBagLayoutBusquedaPorNombreTipoIce);

		gridBagConstraintsTipoIce = new GridBagConstraints();
		gridBagConstraintsTipoIce.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoIce.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoIce.gridy = 0;
		gridBagConstraintsTipoIce.gridx = 0;
		jPanelBusquedaPorNombreTipoIce.add(jLabelnombreBusquedaPorNombreTipoIce, gridBagConstraintsTipoIce);

		gridBagConstraintsTipoIce = new GridBagConstraints();
		gridBagConstraintsTipoIce.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoIce.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoIce.gridy = 0;
		gridBagConstraintsTipoIce.gridx = 1;
		jPanelBusquedaPorNombreTipoIce.add(jTextAreanombreBusquedaPorNombreTipoIce, gridBagConstraintsTipoIce);

		gridBagConstraintsTipoIce = new GridBagConstraints();
		gridBagConstraintsTipoIce.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoIce.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoIce.gridy = 1;
		gridBagConstraintsTipoIce.gridx =1;
		jPanelBusquedaPorNombreTipoIce.add(jButtonBusquedaPorNombreTipoIce, gridBagConstraintsTipoIce);

		jTabbedPaneBusquedasTipoIce.addTab("1.-Por Nombre ", jPanelBusquedaPorNombreTipoIce);
		jTabbedPaneBusquedasTipoIce.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoIce = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoIce);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipoiceSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoIce = new GridBagConstraints();						
			this.gridBagConstraintsTipoIce.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoIce.gridx = 0;		
			//this.gridBagConstraintsTipoIce.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoIce.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoIce.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarTipoIce, this.gridBagConstraintsTipoIce);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsTipoIce = new GridBagConstraints();
		this.gridBagConstraintsTipoIce.gridy = iGridyPrincipal++;
		this.gridBagConstraintsTipoIce.gridx = 0;		
		//this.gridBagConstraintsTipoIce.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoIce.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsTipoIce.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsTipoIce);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsTipoIce = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsTipoIce.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoIce.gridx = 0;		
			this.gridBagConstraintsTipoIce.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoIce.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsTipoIce.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasTipoIce, this.gridBagConstraintsTipoIce);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsTipoIce = new GridBagConstraints();
		this.gridBagConstraintsTipoIce.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoIce.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesTipoIce, this.gridBagConstraintsTipoIce);								
		
		
		/*
		this.gridBagConstraintsTipoIce = new GridBagConstraints();
		this.gridBagConstraintsTipoIce.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoIce.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesTipoIce, this.gridBagConstraintsTipoIce);
		*/		
		
		this.gridBagConstraintsTipoIce = new GridBagConstraints();
		this.gridBagConstraintsTipoIce.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoIce.gridx =0;
		this.gridBagConstraintsTipoIce.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoIce.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoIce, this.gridBagConstraintsTipoIce);
				
		
		this.gridBagConstraintsTipoIce = new GridBagConstraints();
		this.gridBagConstraintsTipoIce.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoIce.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionTipoIce, this.gridBagConstraintsTipoIce);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(TipoIceJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosTipoIce= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoIce = new GridBagLayout();
			this.jPanelBusquedasParametrosTipoIce.setLayout(gridaBagLayoutBusquedasParametrosTipoIce);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralTipoIce=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoIce.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoIce.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoIce.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoIce = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsTipoIce = new GridBagConstraints();
		this.gridBagConstraintsTipoIce.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoIce.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoIce, this.gridBagConstraintsTipoIce);
			
			
		this.gridBagConstraintsTipoIce = new GridBagConstraints();
		this.gridBagConstraintsTipoIce.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoIce.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoIce, this.gridBagConstraintsTipoIce);
		
			
		this.gridBagConstraintsTipoIce = new GridBagConstraints();
		this.gridBagConstraintsTipoIce.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoIce.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoIce, this.gridBagConstraintsTipoIce);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralTipoIce;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoTipoIce() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoTipoIce = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoTipoIce = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoTipoIce.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoTipoIce.setName("jPanelReporteDinamicoTipoIce"); 
		
		this.jPanelReporteDinamicoTipoIce.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoIce.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoIce.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoTipoIce.setLayout(gridaBagLayoutReporteDinamicoTipoIce);
		
		
		this.jInternalFrameReporteDinamicoTipoIce= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoTipoIce = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoIce= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoTipoIce.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoTipoIce.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoTipoIce.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoTipoIce.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoTipoIce.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoTipoIce.setResizable(true);
	    this.jInternalFrameReporteDinamicoTipoIce.setClosable(true);
	    this.jInternalFrameReporteDinamicoTipoIce.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoTipoIce.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoIce.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoIce.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoTipoIce.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Ices"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteTipoIce = new JLabelMe();

		this.jLabelColumnasSelectReporteTipoIce.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteTipoIce.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoIce.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoIce.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoIce = new GridBagConstraints();
		this.gridBagConstraintsTipoIce.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoIce.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoIce.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoIce.add(this.jLabelColumnasSelectReporteTipoIce, this.gridBagConstraintsTipoIce);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteTipoIce = new JList<Reporte>();
		this.jListColumnasSelectReporteTipoIce.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteTipoIce.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteTipoIce.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoIce.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoIce.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteTipoIce=new JScrollPane(this.jListColumnasSelectReporteTipoIce);
			
			this.jScrollColumnasSelectReporteTipoIce.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoIce.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoIce.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteTipoIce.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTipoIce = new GridBagConstraints();
		this.gridBagConstraintsTipoIce.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoIce.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoIce.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoIce.add(this.jListColumnasSelectReporteTipoIce, this.gridBagConstraintsTipoIce);
		this.jPanelReporteDinamicoTipoIce.add(this.jScrollColumnasSelectReporteTipoIce, this.gridBagConstraintsTipoIce);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteTipoIce = new JLabelMe();

		this.jLabelRelacionesSelectReporteTipoIce.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteTipoIce.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoIce.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoIce.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteTipoIce = new JList<Reporte>();
		this.jListRelacionesSelectReporteTipoIce.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteTipoIce.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteTipoIce.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoIce.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoIce.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteTipoIce=new JScrollPane(this.jListRelacionesSelectReporteTipoIce);
			
			this.jScrollRelacionesSelectReporteTipoIce.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoIce.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoIce.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteTipoIce.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoTipoIce = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoTipoIce = new JComboBoxMe();
		this.jListColumnasValoresGraficoTipoIce = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoTipoIce = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoTipoIce.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoTipoIce.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoIce.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoIce.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoTipoIce, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoTipoIce = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoTipoIce.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoTipoIce.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoIce.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoIce.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoTipoIce, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoTipoIce = new JLabelMe();

		this.jLabelConGraficoDinamicoTipoIce.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoTipoIce.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoTipoIce.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoTipoIce.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsTipoIce = new GridBagConstraints();
		this.gridBagConstraintsTipoIce.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoIce.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoIce.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoIce.add(this.jLabelConGraficoDinamicoTipoIce, this.gridBagConstraintsTipoIce);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoTipoIce = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoTipoIce.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoTipoIce.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoTipoIce.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoTipoIce.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoTipoIce.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsTipoIce = new GridBagConstraints();
		this.gridBagConstraintsTipoIce.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoIce.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoIce.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoIce.add(this.jCheckBoxConGraficoDinamicoTipoIce, this.gridBagConstraintsTipoIce);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoTipoIce = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoTipoIce.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoTipoIce.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoTipoIce.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoTipoIce.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsTipoIce = new GridBagConstraints();
		this.gridBagConstraintsTipoIce.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoIce.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoIce.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoIce.add(this.jLabelColumnaCategoriaGraficoTipoIce, this.gridBagConstraintsTipoIce);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoTipoIce = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoTipoIce.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoTipoIce.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoTipoIce.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoTipoIce.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoTipoIce.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsTipoIce = new GridBagConstraints();
		this.gridBagConstraintsTipoIce.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoIce.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoIce.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoTipoIce.add(this.jComboBoxColumnaCategoriaGraficoTipoIce, this.gridBagConstraintsTipoIce);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorTipoIce = new JLabelMe();

		this.jLabelColumnaCategoriaValorTipoIce.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorTipoIce.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorTipoIce.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorTipoIce.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsTipoIce = new GridBagConstraints();
		this.gridBagConstraintsTipoIce.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoIce.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoIce.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoIce.add(this.jLabelColumnaCategoriaValorTipoIce, this.gridBagConstraintsTipoIce);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorTipoIce = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorTipoIce.setText("Accion");
        this.jComboBoxColumnaCategoriaValorTipoIce.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorTipoIce.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorTipoIce.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorTipoIce.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsTipoIce = new GridBagConstraints();
		this.gridBagConstraintsTipoIce.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoIce.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoIce.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoTipoIce.add(this.jComboBoxColumnaCategoriaValorTipoIce, this.gridBagConstraintsTipoIce);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoTipoIce = new JLabelMe();

		this.jLabelColumnasValoresGraficoTipoIce.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoTipoIce.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoTipoIce.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoTipoIce.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsTipoIce = new GridBagConstraints();
		this.gridBagConstraintsTipoIce.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoIce.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoIce.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoIce.add(this.jLabelColumnasValoresGraficoTipoIce, this.gridBagConstraintsTipoIce);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoTipoIce = new JList<Reporte>();
		this.jListColumnasValoresGraficoTipoIce.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoTipoIce.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoTipoIce.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoTipoIce.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoTipoIce.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoTipoIce=new JScrollPane(this.jListColumnasValoresGraficoTipoIce);
			
			this.jScrollColumnasValoresGraficoTipoIce.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoTipoIce.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoTipoIce.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoTipoIce.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTipoIce = new GridBagConstraints();
		this.gridBagConstraintsTipoIce.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoIce.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoIce.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoTipoIce.add(this.jListColumnasSelectReporteTipoIce, this.gridBagConstraintsTipoIce);
		this.jPanelReporteDinamicoTipoIce.add(this.jScrollColumnasValoresGraficoTipoIce, this.gridBagConstraintsTipoIce);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoTipoIce = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoTipoIce.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoTipoIce.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoTipoIce.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoTipoIce.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsTipoIce = new GridBagConstraints();
		this.gridBagConstraintsTipoIce.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoIce.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoIce.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoIce.add(this.jLabelTiposGraficosReportesDinamicoTipoIce, this.gridBagConstraintsTipoIce);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoTipoIce = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoTipoIce.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoTipoIce.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoTipoIce.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoTipoIce.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoTipoIce.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsTipoIce = new GridBagConstraints();
		this.gridBagConstraintsTipoIce.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoIce.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoIce.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoIce.add(this.jComboBoxTiposGraficosReportesDinamicoTipoIce, this.gridBagConstraintsTipoIce);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoTipoIce = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoTipoIce.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoTipoIce.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoIce.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoIce.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoIce = new GridBagConstraints();
		this.gridBagConstraintsTipoIce.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoIce.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoIce.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoIce.add(this.jLabelGenerarExcelReporteDinamicoTipoIce, this.gridBagConstraintsTipoIce);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoTipoIce = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoTipoIce.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoTipoIce,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoTipoIce.setToolTipText("Generar EXCEL"+" "+TipoIceConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsTipoIce = new GridBagConstraints();
		//this.gridBagConstraintsTipoIce.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsTipoIce.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsTipoIce.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoTipoIce.add(this.jButtonGenerarExcelReporteDinamicoTipoIce, this.gridBagConstraintsTipoIce);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsTipoIce = new GridBagConstraints();
		this.gridBagConstraintsTipoIce.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoIce.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoIce.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoIce.add(this.jComboBoxTiposReportesDinamicoTipoIce, this.gridBagConstraintsTipoIce);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoTipoIce = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoTipoIce.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoTipoIce.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoIce.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoIce.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoIce = new GridBagConstraints();
		this.gridBagConstraintsTipoIce.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoIce.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoIce.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoIce.add(this.jLabelTiposArchivoReporteDinamicoTipoIce, this.gridBagConstraintsTipoIce);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsTipoIce = new GridBagConstraints();
		this.gridBagConstraintsTipoIce.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoIce.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoIce.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoIce.add(this.jComboBoxTiposArchivosReportesDinamicoTipoIce, this.gridBagConstraintsTipoIce);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoTipoIce = new JButtonMe();
		this.jButtonGenerarReporteDinamicoTipoIce.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoTipoIce,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoTipoIce.setToolTipText("Generar"+" "+TipoIceConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsTipoIce = new GridBagConstraints();
		this.gridBagConstraintsTipoIce.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoIce.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoIce.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoIce.add(this.jButtonGenerarReporteDinamicoTipoIce, this.gridBagConstraintsTipoIce);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoTipoIce = new JButtonMe();
		this.jButtonCerrarReporteDinamicoTipoIce.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoTipoIce,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoTipoIce.setToolTipText("Cancelar"+" "+TipoIceConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoIce = new GridBagConstraints();
		this.gridBagConstraintsTipoIce.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoIce.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoIce.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoIce.add(this.jButtonCerrarReporteDinamicoTipoIce, this.gridBagConstraintsTipoIce);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalTipoIce = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoTipoIce= new JScrollPane(jPanelReporteDinamicoTipoIce,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoTipoIce.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoIce.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoIce.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoTipoIce.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Ices"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoIce = new GridBagConstraints();
		this.gridBagConstraintsTipoIce.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsTipoIce.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsTipoIce.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoTipoIce.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoTipoIce.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalTipoIce);
		this.jInternalFrameReporteDinamicoTipoIce.getContentPane().add(this.jScrollPanelReporteDinamicoTipoIce, this.gridBagConstraintsTipoIce);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionTipoIce() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionTipoIce = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionTipoIce = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionTipoIce.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionTipoIce.setName("jPanelImportacionTipoIce"); 
		
		this.jPanelImportacionTipoIce.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoIce.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoIce.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionTipoIce.setLayout(gridaBagLayoutImportacionTipoIce);
		
		
		this.jInternalFrameImportacionTipoIce= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionTipoIce= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionTipoIce = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoIce= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionTipoIce.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoIce.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoIce.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionTipoIce.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoIce.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoIce.setResizable(true);
	    this.jInternalFrameImportacionTipoIce.setClosable(true);
	    this.jInternalFrameImportacionTipoIce.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionTipoIce.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoIce.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoIce.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionTipoIce.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoIce.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoIce.setResizable(true);
	    this.jInternalFrameImportacionTipoIce.setClosable(true);
	    this.jInternalFrameImportacionTipoIce.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionTipoIce.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoIce.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoIce.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionTipoIce.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Ices"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionTipoIce = new JLabelMe();

		this.jLabelArchivoImportacionTipoIce.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionTipoIce.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoIce.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoIce.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoIce = new GridBagConstraints();
		this.gridBagConstraintsTipoIce.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoIce.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoIce.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoIce.add(this.jLabelArchivoImportacionTipoIce, this.gridBagConstraintsTipoIce);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionTipoIce = new JFileChooser();		
		this.jFileChooserImportacionTipoIce.setToolTipText("ESCOGER ARCHIVO"+" "+TipoIceConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionTipoIce = new JButtonMe();
		this.jButtonAbrirImportacionTipoIce.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionTipoIce,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionTipoIce.setToolTipText("Generar"+" "+TipoIceConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsTipoIce = new GridBagConstraints();
		this.gridBagConstraintsTipoIce.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoIce.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoIce.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoIce.add(this.jButtonAbrirImportacionTipoIce, this.gridBagConstraintsTipoIce);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionTipoIce = new JLabelMe();

		this.jLabelPathArchivoImportacionTipoIce.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionTipoIce.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoIce.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoIce.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoIce = new GridBagConstraints();
		this.gridBagConstraintsTipoIce.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoIce.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoIce.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoIce.add(this.jLabelPathArchivoImportacionTipoIce, this.gridBagConstraintsTipoIce);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionTipoIce=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionTipoIce.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoIce.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoIce.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsTipoIce = new GridBagConstraints();
		this.gridBagConstraintsTipoIce.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoIce.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoIce.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoIce.add(this.jTextFieldPathArchivoImportacionTipoIce, this.gridBagConstraintsTipoIce);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionTipoIce = new JButtonMe();
		this.jButtonGenerarImportacionTipoIce.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionTipoIce,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionTipoIce.setToolTipText("Generar"+" "+TipoIceConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsTipoIce = new GridBagConstraints();
		this.gridBagConstraintsTipoIce.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoIce.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoIce.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoIce.add(this.jButtonGenerarImportacionTipoIce, this.gridBagConstraintsTipoIce);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionTipoIce = new JButtonMe();
		this.jButtonCerrarImportacionTipoIce.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionTipoIce,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionTipoIce.setToolTipText("Cancelar"+" "+TipoIceConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoIce = new GridBagConstraints();
		this.gridBagConstraintsTipoIce.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoIce.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoIce.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoIce.add(this.jButtonCerrarImportacionTipoIce, this.gridBagConstraintsTipoIce);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalTipoIce = new GridBagLayout();
		
		this.jScrollPanelImportacionTipoIce= new JScrollPane(jPanelImportacionTipoIce,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsTipoIce = new GridBagConstraints();
		this.gridBagConstraintsTipoIce.gridy =iPosYImportacion;
		this.gridBagConstraintsTipoIce.gridx =iPosXImportacion;
		this.gridBagConstraintsTipoIce.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionTipoIce.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionTipoIce.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalTipoIce);
		this.jInternalFrameImportacionTipoIce.getContentPane().add(this.jScrollPanelImportacionTipoIce, this.gridBagConstraintsTipoIce);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByTipoIce(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByTipoIce = new JButtonMe();
			this.jButtonAbrirOrderByTipoIce.setText("Orden");
			this.jButtonAbrirOrderByTipoIce.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoIce,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoIce, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByTipoIce";
			inputMap = this.jButtonAbrirOrderByTipoIce.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByTipoIce.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByTipoIce"));
		
		
			GridBagLayout gridaBagLayoutOrderByTipoIce = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByTipoIce = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByTipoIce.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByTipoIce.setName("jPanelOrderByTipoIce"); 
			
			this.jPanelOrderByTipoIce.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoIce.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoIce.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByTipoIce, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByTipoIce.setLayout(gridaBagLayoutOrderByTipoIce);
			
			
			this.jTableDatosTipoIceOrderBy = new JTableMe();        
			this.jTableDatosTipoIceOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosTipoIceOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosTipoIceOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosTipoIceOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosTipoIceOrderBy.setViewportView(this.jTableDatosTipoIceOrderBy);
			this.jTableDatosTipoIceOrderBy.setFillsViewportHeight(true);
			this.jTableDatosTipoIceOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByTipoIce= new OrderByJInternalFrame();
			this.jInternalFrameOrderByTipoIce= new OrderByJInternalFrame();
			this.jScrollPanelOrderByTipoIce = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteTipoIce= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByTipoIce.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByTipoIce.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByTipoIce.setTitle("Orden");
			this.jInternalFrameOrderByTipoIce.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByTipoIce.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByTipoIce.setResizable(true);
			this.jInternalFrameOrderByTipoIce.setClosable(true);
			this.jInternalFrameOrderByTipoIce.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByTipoIce, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByTipoIce.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoIce.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoIce.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByTipoIce, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByTipoIce.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Ices"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsTipoIce = new GridBagConstraints();
			this.gridBagConstraintsTipoIce.gridy =iPosYOrderBy++;
			this.gridBagConstraintsTipoIce.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoIce.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsTipoIce.ipady =150;
				
			this.jPanelOrderByTipoIce.add(jScrollPanelDatosTipoIceOrderBy, this.gridBagConstraintsTipoIce);//this.jTableDatosTipoIceTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByTipoIce = new JButtonMe();
			this.jButtonCerrarOrderByTipoIce.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByTipoIce,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByTipoIce.setToolTipText("Cancelar"+" "+TipoIceConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByTipoIce, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsTipoIce = new GridBagConstraints();
			this.gridBagConstraintsTipoIce.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoIce.gridy = iPosYOrderBy++;
			this.gridBagConstraintsTipoIce.gridx = iPosXOrderBy;
									
			this.jPanelOrderByTipoIce.add(this.jButtonCerrarOrderByTipoIce, this.gridBagConstraintsTipoIce);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalTipoIce = new GridBagLayout();
			
			this.jScrollPanelOrderByTipoIce= new JScrollPane(jPanelOrderByTipoIce,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsTipoIce = new GridBagConstraints();
			this.gridBagConstraintsTipoIce.gridy =iPosYOrderBy;
			this.gridBagConstraintsTipoIce.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoIce.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByTipoIce.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByTipoIce.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalTipoIce);
			
			this.jInternalFrameOrderByTipoIce.getContentPane().add(this.jScrollPanelOrderByTipoIce, this.gridBagConstraintsTipoIce);			
		
		} else {
			this.jButtonAbrirOrderByTipoIce = new JButtonMe();
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
			&& this.tipoiceSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosTipoIce.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosTipoIce.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosTipoIce.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosTipoIce.getRowHeight();//TipoIceConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.tipoiceSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > TipoIceConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoIce.isSelected()) {
					iHeightTable=TipoIceConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoIceConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoIceConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > TipoIceConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoIce.isSelected()) {
					iHeightTable=TipoIceConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoIceConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoIceConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosTipoIce.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoIce.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoIce.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosTipoIce.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoIce.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoIce.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByTipoIce!=null && this.jInternalFrameOrderByTipoIce.getjTableDatosOrderBy()!=null) {
			//if(!this.tipoiceSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByTipoIce.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByTipoIce.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByTipoIce.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByTipoIce.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByTipoIce.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByTipoIce.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByTipoIce.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosTipoIce.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoIce.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoIce.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=tipoiceLogic.getTipoIces().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipoices.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<TipoIce> TraerTipoIceBeans(List<TipoIce> tipoices,ArrayList<Classe> classes)throws Exception {
		try {
			for(TipoIce tipoice:tipoices) {
					
				if(!(TipoIceConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || TipoIceConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					tipoice.setsDetalleGeneralEntityReporte(TipoIceConstantesFunciones.getTipoIceDescripcion(tipoice));
										
						
					
						
					
				} else  {
							
					//tipoice.setsDetalleGeneralEntityReporte(tipoice.getsDetalleGeneralEntityReporte());
										
				}
				
				//tipoicebeans.add(tipoicebean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return tipoices;
    }
	//PARA REPORTES FIN
}
