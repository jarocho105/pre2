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



import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.auxiliar.*;





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
import com.bydan.erp.puntoventa.util.TipoConexionConstantesFunciones;

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
public class TipoConexionJInternalFrame extends TipoConexionBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarTipoConexion;
	
	protected JMenuBar jmenuBarTipoConexion;
	
	protected JMenu jmenuTipoConexion;
	protected JMenu jmenuDatosTipoConexion;
	protected JMenu jmenuArchivoTipoConexion;
	protected JMenu jmenuAccionesTipoConexion;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosTipoConexion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoConexion;	
	protected GridBagConstraints gridBagConstraintsTipoConexion;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public TipoConexionDetalleFormJInternalFrame jInternalFrameDetalleFormTipoConexion;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoTipoConexion;	
	protected ImportacionJInternalFrame jInternalFrameImportacionTipoConexion;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public TipoConexionSessionBean tipoconexionSessionBean;
		
	
	
	
	//protected JDesktopPane jDesktopPane;
	public List<TipoConexion> tipoconexions;		
	public List<TipoConexion> tipoconexionsEliminados;	
	public List<TipoConexion> tipoconexionsAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByTipoConexion;		
	protected JButton jButtonAbrirOrderByTipoConexion;
	
	
	//protected JPanel jPanelOrderByTipoConexion;
	//public JScrollPane jScrollPanelOrderByTipoConexion;	
	//protected JButton jButtonCerrarOrderByTipoConexion;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public TipoConexionLogic tipoconexionLogic;
	
	
	
	public JScrollPane jScrollPanelDatosTipoConexion;
	public JScrollPane jScrollPanelDatosEdicionTipoConexion;
	public JScrollPane jScrollPanelDatosGeneralTipoConexion;
    
	
	
	//public JScrollPane jScrollPanelDatosTipoConexionOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoTipoConexion;
	//public JScrollPane jScrollPanelImportacionTipoConexion;
	
	
	
	protected JPanel jPanelAccionesTipoConexion;
	
    protected JPanel jPanelPaginacionTipoConexion;
    protected JPanel jPanelParametrosReportesTipoConexion;
	protected JPanel jPanelParametrosReportesAccionesTipoConexion;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1TipoConexion;
	protected JPanel jPanelParametrosAuxiliar2TipoConexion;
	protected JPanel jPanelParametrosAuxiliar3TipoConexion;
	protected JPanel jPanelParametrosAuxiliar4TipoConexion;
	//protected JPanel jPanelParametrosAuxiliar5TipoConexion;
	
	
	
	//protected JPanel jPanelReporteDinamicoTipoConexion;
	//protected JPanel jPanelImportacionTipoConexion;
	
	
	public JTable jTableDatosTipoConexion;
	
	
	
	//public JTable jTableDatosTipoConexionOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoTipoConexion;
	protected JButton jButtonDuplicarTipoConexion;
	protected JButton jButtonCopiarTipoConexion;
	protected JButton jButtonVerFormTipoConexion;
	protected JButton jButtonNuevoRelacionesTipoConexion;
	protected JButton jButtonModificarTipoConexion;
	
    protected JButton jButtonGuardarCambiosTablaTipoConexion;
	protected JButton jButtonCerrarTipoConexion;
	
	
	protected JButton jButtonRecargarInformacionTipoConexion;
	protected JButton jButtonProcesarInformacionTipoConexion;
	
	
	protected JButton jButtonAnterioresTipoConexion;
	protected JButton jButtonSiguientesTipoConexion;
	protected JButton jButtonNuevoGuardarCambiosTipoConexion;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoTipoConexion;
	//protected JButton jButtonCerrarReporteDinamicoTipoConexion;
	//protected JButton jButtonGenerarExcelReporteDinamicoTipoConexion;	
	
	
	
	//protected JButton jButtonAbrirImportacionTipoConexion;
	//protected JButton jButtonGenerarImportacionTipoConexion;
	//protected JButton jButtonCerrarImportacionTipoConexion;
	//protected JFileChooser jFileChooserImportacionTipoConexion;
	//protected File fileImportacionTipoConexion;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoConexion;
	protected JButton jButtonDuplicarToolBarTipoConexion;
	protected JButton jButtonNuevoRelacionesToolBarTipoConexion;
	
	
	public JButton jButtonGuardarCambiosToolBarTipoConexion;
	protected JButton jButtonCopiarToolBarTipoConexion;
	protected JButton jButtonVerFormToolBarTipoConexion;
	public JButton jButtonGuardarCambiosTablaToolBarTipoConexion;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoConexion;
	protected JButton jButtonCerrarToolBarTipoConexion;
	
	protected JButton jButtonRecargarInformacionToolBarTipoConexion;
	protected JButton jButtonProcesarInformacionToolBarTipoConexion;
	protected JButton jButtonAnterioresToolBarTipoConexion;
	protected JButton jButtonSiguientesToolBarTipoConexion;
	protected JButton jButtonNuevoGuardarCambiosToolBarTipoConexion;
	protected JButton jButtonAbrirOrderByToolBarTipoConexion;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoConexion;
	protected JMenuItem jMenuItemDuplicarTipoConexion;
	protected JMenuItem jMenuItemNuevoRelacionesTipoConexion;
	
	
	protected JMenuItem jMenuItemGuardarCambiosTipoConexion;
	protected JMenuItem jMenuItemCopiarTipoConexion;
	protected JMenuItem jMenuItemVerFormTipoConexion;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoConexion;
	protected JMenuItem jMenuItemCerrarTipoConexion;
	protected JMenuItem jMenuItemDetalleCerrarTipoConexion;
	protected JMenuItem jMenuItemDetalleAbrirOrderByTipoConexion;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoConexion;
	
	protected JMenuItem jMenuItemRecargarInformacionTipoConexion;
	protected JMenuItem jMenuItemProcesarInformacionTipoConexion;
	protected JMenuItem jMenuItemAnterioresTipoConexion;
	protected JMenuItem jMenuItemSiguientesTipoConexion;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoConexion;
	protected JMenuItem jMenuItemAbrirOrderByTipoConexion;
	protected JMenuItem jMenuItemMostrarOcultarTipoConexion;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoConexion;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosTipoConexion;
	protected JCheckBox jCheckBoxSeleccionadosTipoConexion;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaTipoConexion;
	protected JCheckBox jCheckBoxConGraficoReporteTipoConexion;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesTipoConexion;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesTipoConexion;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoTipoConexion;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoTipoConexion;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesTipoConexion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionTipoConexion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoConexion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoConexion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarTipoConexion;
	protected JTextField jTextFieldValorCampoGeneralTipoConexion;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteTipoConexion;
	//public JList<Reporte> jListColumnasSelectReporteTipoConexion;
	//public JScrollPane jScrollColumnasSelectReporteTipoConexion;
	
	//public JLabel jLabelRelacionesSelectReporteTipoConexion;
	//public JList<Reporte> jListRelacionesSelectReporteTipoConexion;
	//public JScrollPane jScrollRelacionesSelectReporteTipoConexion;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoTipoConexion;
	//protected JCheckBox jCheckBoxConGraficoDinamicoTipoConexion;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoTipoConexion;
	//public JLabel jLabelTiposArchivoReporteDinamicoTipoConexion;
	
		
	//public JLabel jLabelArchivoImportacionTipoConexion;	
	//public JLabel jLabelPathArchivoImportacionTipoConexion;
	//protected JTextField jTextFieldPathArchivoImportacionTipoConexion;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoTipoConexion;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoTipoConexion;
	
	//public JLabel jLabelColumnaCategoriaValorTipoConexion;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorTipoConexion;
	
	//public JLabel jLabelColumnasValoresGraficoTipoConexion;
	//public JList<Reporte> jListColumnasValoresGraficoTipoConexion;
	//public JScrollPane jScrollColumnasValoresGraficoTipoConexion;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoTipoConexion;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoTipoConexion;	
	
	
	
	
	
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
	public TipoConexionJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("TipoConexion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoConexionJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoConexion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoConexionJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoConexion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoConexionJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoConexion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionTipoConexion)	{
		this.jButtonRecargarInformacionTipoConexion = jButtonRecargarInformacionTipoConexion;
	}
	
	public JButton getjButtonProcesarInformacionTipoConexion() {
		return this.jButtonProcesarInformacionTipoConexion;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoConexion)	{
		this.jButtonProcesarInformacionTipoConexion = jButtonProcesarInformacionTipoConexion;
	}
	
	
	public JButton getjButtonRecargarInformacionTipoConexion() {
		return this.jButtonRecargarInformacionTipoConexion;
	}
	
	
	public List<TipoConexion> gettipoconexions() {
		return this.tipoconexions;
	}

	public void settipoconexions(List<TipoConexion> tipoconexions) {
		this.tipoconexions = tipoconexions;
	}
	
	public List<TipoConexion> gettipoconexionsAux() {
		return this.tipoconexionsAux;
	}

	public void settipoconexionsAux(List<TipoConexion> tipoconexionsAux) {
		this.tipoconexionsAux = tipoconexionsAux;
	}
	
	public List<TipoConexion> gettipoconexionsEliminados() {
		return this.tipoconexionsEliminados;
	}

	public void setTipoConexionsEliminados(List<TipoConexion> tipoconexionsEliminados) {
		this.tipoconexionsEliminados = tipoconexionsEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarTipoConexion() {
		return jComboBoxTiposSeleccionarTipoConexion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarTipoConexion(
			JComboBox jComboBoxTiposSeleccionarTipoConexion) {
		this.jComboBoxTiposSeleccionarTipoConexion = jComboBoxTiposSeleccionarTipoConexion;
	}
	
	public void setBorderResaltarTiposSeleccionarTipoConexion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarTipoConexion.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarTipoConexion .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralTipoConexion() {
		return jTextFieldValorCampoGeneralTipoConexion;
	}

	public void setjTextFieldValorCampoGeneralTipoConexion(
			JTextField jTextFieldValorCampoGeneralTipoConexion) {
		this.jTextFieldValorCampoGeneralTipoConexion = jTextFieldValorCampoGeneralTipoConexion;
	}

	public void setBorderResaltarValorCampoGeneralTipoConexion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoConexion.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralTipoConexion .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosTipoConexion() {
		return this.jCheckBoxSeleccionarTodosTipoConexion;
	}

	public void setjCheckBoxSeleccionarTodosTipoConexion(
			JCheckBox jCheckBoxSeleccionarTodosTipoConexion) {
		this.jCheckBoxSeleccionarTodosTipoConexion = jCheckBoxSeleccionarTodosTipoConexion;
	}

	public void setBorderResaltarSeleccionarTodosTipoConexion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoConexion.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosTipoConexion .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosTipoConexion() {
		return this.jCheckBoxSeleccionadosTipoConexion;
	}

	public void setjCheckBoxSeleccionadosTipoConexion(
			JCheckBox jCheckBoxSeleccionadosTipoConexion) {
		this.jCheckBoxSeleccionadosTipoConexion = jCheckBoxSeleccionadosTipoConexion;
	}
	
	public void setBorderResaltarSeleccionadosTipoConexion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoConexion.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosTipoConexion .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesTipoConexion() {
		return this.jComboBoxTiposArchivosReportesTipoConexion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesTipoConexion(
			JComboBox jComboBoxTiposArchivosReportesTipoConexion) {
		this.jComboBoxTiposArchivosReportesTipoConexion = jComboBoxTiposArchivosReportesTipoConexion;
	}

	public void setBorderResaltarTiposArchivosReportesTipoConexion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoConexion.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesTipoConexion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesTipoConexion() {
		return this.jComboBoxTiposReportesTipoConexion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesTipoConexion(
			JComboBox jComboBoxTiposReportesTipoConexion) {
		this.jComboBoxTiposReportesTipoConexion = jComboBoxTiposReportesTipoConexion;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoTipoConexion() {
	//	return jComboBoxTiposReportesDinamicoTipoConexion;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoTipoConexion(
	//		JComboBox jComboBoxTiposReportesDinamicoTipoConexion) {
	//	this.jComboBoxTiposReportesDinamicoTipoConexion = jComboBoxTiposReportesDinamicoTipoConexion;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoTipoConexion() {
	//	return jComboBoxTiposArchivosReportesDinamicoTipoConexion;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoTipoConexion(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoTipoConexion) {
	//	this.jComboBoxTiposArchivosReportesDinamicoTipoConexion = jComboBoxTiposArchivosReportesDinamicoTipoConexion;
	//}
	
	public void setBorderResaltarTiposReportesTipoConexion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoConexion.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesTipoConexion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesTipoConexion() {
		return this.jComboBoxTiposGraficosReportesTipoConexion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesTipoConexion(
			JComboBox jComboBoxTiposGraficosReportesTipoConexion) {
		this.jComboBoxTiposGraficosReportesTipoConexion = jComboBoxTiposGraficosReportesTipoConexion;
	}
	
	public void setBorderResaltarTiposGraficosReportesTipoConexion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoConexion.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesTipoConexion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionTipoConexion() {
		return this.jComboBoxTiposPaginacionTipoConexion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionTipoConexion(
			JComboBox jComboBoxTiposPaginacionTipoConexion) {
		this.jComboBoxTiposPaginacionTipoConexion = jComboBoxTiposPaginacionTipoConexion;
	}
	
	public void setBorderResaltarTiposPaginacionTipoConexion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoConexion.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionTipoConexion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesTipoConexion() {
		return this.jComboBoxTiposRelacionesTipoConexion;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoConexion() {
		return this.jComboBoxTiposAccionesTipoConexion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoConexion(
			JComboBox jComboBoxTiposRelacionesTipoConexion) {
		this.jComboBoxTiposRelacionesTipoConexion = jComboBoxTiposRelacionesTipoConexion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoConexion(
			JComboBox jComboBoxTiposAccionesTipoConexion) {
		this.jComboBoxTiposAccionesTipoConexion = jComboBoxTiposAccionesTipoConexion;
	}
	
	public void setBorderResaltarTiposRelacionesTipoConexion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoConexion.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesTipoConexion .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesTipoConexion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoConexion.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesTipoConexion .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoTipoConexion() {
	//	return jCheckBoxConGraficoDinamicoTipoConexion;
	//}

	//public void setjCheckBoxConGraficoDinamicoTipoConexion(
	//		JCheckBox jCheckBoxConGraficoDinamicoTipoConexion) {
	//	this.jCheckBoxConGraficoDinamicoTipoConexion = jCheckBoxConGraficoDinamicoTipoConexion;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoTipoConexion() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarTipoConexion.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoTipoConexion .setBorder(borderResaltar);		
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
		this.tipoconexionSessionBean=new TipoConexionSessionBean();
		
		this.tipoconexionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipoconexionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipoconexionSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=TipoConexionJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=TipoConexionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoConexionJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoConexionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoConexionJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Conexion MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 910) {
			iHeight=910;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.tipoconexionSessionBean.getEsGuardarRelacionado()) {
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
		
		TipoConexionJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("TipoConexion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarTipoConexion= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarTipoConexion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarTipoConexion,this.jTtoolBarTipoConexion,
							"nuevo","nuevo","Nuevo"+" "+TipoConexionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoConexion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarTipoConexion,this.jTtoolBarTipoConexion,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoConexion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarTipoConexion,this.jTtoolBarTipoConexion,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+TipoConexionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarTipoConexion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarTipoConexion,this.jTtoolBarTipoConexion,
							"duplicar","duplicar","Duplicar"+" "+TipoConexionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarTipoConexion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarTipoConexion,this.jTtoolBarTipoConexion,
							"copiar","copiar","Copiar"+" "+TipoConexionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarTipoConexion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarTipoConexion,this.jTtoolBarTipoConexion,
							"ver_form","ver_form","Ver"+" "+TipoConexionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarTipoConexion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoConexion,this.jTtoolBarTipoConexion,
							"recargar","recargar","Recargar"+" "+TipoConexionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarTipoConexion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoConexion,this.jTtoolBarTipoConexion,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarTipoConexion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoConexion,this.jTtoolBarTipoConexion,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarTipoConexion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarTipoConexion,this.jTtoolBarTipoConexion,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarTipoConexion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarTipoConexion,this.jTtoolBarTipoConexion,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarTipoConexion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarTipoConexion,this.jTtoolBarTipoConexion,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+TipoConexionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarTipoConexion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarTipoConexion,this.jTtoolBarTipoConexion,
							"cerrar","cerrar","Salir"+" "+TipoConexionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarTipoConexion=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarTipoConexion;
			
				this.jButtonProcesarInformacionToolBarTipoConexion=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarTipoConexion;
				
		//protected JButton jButtonModificarToolBarTipoConexion;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarTipoConexion=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuTipoConexion=new JMenuMe("General");
		this.jmenuArchivoTipoConexion=new JMenuMe("Archivo");
		this.jmenuAccionesTipoConexion=new JMenuMe("Acciones");
		this.jmenuDatosTipoConexion=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoConexion= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoConexion.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoConexion,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoConexion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarTipoConexion= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarTipoConexion.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarTipoConexion,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarTipoConexion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesTipoConexion= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesTipoConexion.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesTipoConexion,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesTipoConexion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosTipoConexion= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoConexion.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoConexion,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoConexion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarTipoConexion= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarTipoConexion.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarTipoConexion,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarTipoConexion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormTipoConexion= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormTipoConexion.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormTipoConexion,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormTipoConexion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaTipoConexion= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaTipoConexion.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaTipoConexion,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaTipoConexion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoConexion= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoConexion.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoConexion,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoConexion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionTipoConexion= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionTipoConexion.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionTipoConexion,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionTipoConexion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionTipoConexion= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionTipoConexion.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionTipoConexion,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresTipoConexion= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresTipoConexion.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresTipoConexion,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresTipoConexion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesTipoConexion= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesTipoConexion.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesTipoConexion,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesTipoConexion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByTipoConexion= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByTipoConexion.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByTipoConexion,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByTipoConexion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoConexion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoConexion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoConexion,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoConexion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByTipoConexion= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByTipoConexion.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByTipoConexion,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByTipoConexion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoConexion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoConexion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoConexion,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoConexion, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosTipoConexion= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosTipoConexion.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosTipoConexion,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosTipoConexion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoTipoConexion.add(this.jMenuItemCerrarTipoConexion);
			
			this.jmenuAccionesTipoConexion.add(this.jMenuItemNuevoTipoConexion);
			this.jmenuAccionesTipoConexion.add(this.jMenuItemNuevoGuardarCambiosTipoConexion);
			this.jmenuAccionesTipoConexion.add(this.jMenuItemNuevoRelacionesTipoConexion);
			this.jmenuAccionesTipoConexion.add(this.jMenuItemGuardarCambiosTablaTipoConexion);		
			this.jmenuAccionesTipoConexion.add(this.jMenuItemDuplicarTipoConexion);		
			this.jmenuAccionesTipoConexion.add(this.jMenuItemCopiarTipoConexion);		
			this.jmenuAccionesTipoConexion.add(this.jMenuItemVerFormTipoConexion);		
			
			this.jmenuDatosTipoConexion.add(this.jMenuItemRecargarInformacionTipoConexion);				
			this.jmenuDatosTipoConexion.add(this.jMenuItemAnterioresTipoConexion);				
			this.jmenuDatosTipoConexion.add(this.jMenuItemSiguientesTipoConexion);				
			this.jmenuDatosTipoConexion.add(this.jMenuItemAbrirOrderByTipoConexion);				
			this.jmenuDatosTipoConexion.add(this.jMenuItemMostrarOcultarTipoConexion);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesTipoConexion.add(this.jMenuItemGuardarCambiosTipoConexion);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoTipoConexion, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesTipoConexion, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosTipoConexion, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarTipoConexion.add(this.jmenuArchivoTipoConexion);		
			this.jmenuBarTipoConexion.add(this.jmenuAccionesTipoConexion);		
			this.jmenuBarTipoConexion.add(this.jmenuDatosTipoConexion);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarTipoConexion);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasTipoConexion() {
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
			//this.jInternalFrameDetalleTipoConexion = new TipoConexionDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Tipo Conexion DATOS");
			this.jInternalFrameDetalleFormTipoConexion = new TipoConexionDetalleFormJInternalFrame(jDesktopPane,this.tipoconexionSessionBean.getConGuardarRelaciones(),this.tipoconexionSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormTipoConexion = null;//new TipoConexionDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoConexion= new GridBagLayout();
		
		
		this.jTableDatosTipoConexion = new JTableMe();      
		
		String sToolTipTipoConexion="";
		sToolTipTipoConexion=TipoConexionConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoConexion+="(PuntoVenta.TipoConexion)";
		}
		
		if(!this.tipoconexionSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoConexion+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosTipoConexion.setToolTipText(sToolTipTipoConexion);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosTipoConexion);
		this.jTableDatosTipoConexion.setAutoCreateRowSorter(true);
		this.jTableDatosTipoConexion.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosTipoConexion.setRowSelectionAllowed(true);
		this.jTableDatosTipoConexion.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosTipoConexion,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoTipoConexion = new JButtonMe();
		this.jButtonDuplicarTipoConexion = new JButtonMe();
		this.jButtonCopiarTipoConexion = new JButtonMe();
		this.jButtonVerFormTipoConexion = new JButtonMe();
		this.jButtonNuevoRelacionesTipoConexion = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaTipoConexion = new JButtonMe();
		this.jButtonCerrarTipoConexion = new JButtonMe();
		
		this.jScrollPanelDatosTipoConexion = new JScrollPane();   
        this.jScrollPanelDatosGeneralTipoConexion = new JScrollPane();
		
				
		
		
		this.jPanelAccionesTipoConexion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Conexion";
		
		if(!this.tipoconexionSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoConexion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Conexions" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoConexion.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralTipoConexion.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesTipoConexion.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoConexion.setToolTipText("Acciones");
        this.jPanelAccionesTipoConexion.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoConexion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoConexion, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoTipoConexion=new ReporteDinamicoJInternalFrame(TipoConexionConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoTipoConexion();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionTipoConexion=new ImportacionJInternalFrame(TipoConexionConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionTipoConexion();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByTipoConexion = new JButtonMe();
		
		this.jButtonAbrirOrderByTipoConexion.setText("Orden");
		this.jButtonAbrirOrderByTipoConexion.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoConexion,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoConexion, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByTipoConexion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByTipoConexion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoConexion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoConexion,false,this);
			
			//this.cargarOrderByTipoConexion(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoConexion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoConexion,true,this);
			
			//this.cargarOrderByTipoConexion(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosTipoConexion.setMinimumSize(new Dimension(400,50));//430
		this.jTableDatosTipoConexion.setMaximumSize(new Dimension(400,50));//430
		this.jTableDatosTipoConexion.setPreferredSize(new Dimension(400,50));//430
		
		this.jScrollPanelDatosTipoConexion.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoConexion.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoConexion.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoTipoConexion.setText("Nuevo");
		this.jButtonDuplicarTipoConexion.setText("Duplicar");
		this.jButtonCopiarTipoConexion.setText("Copiar");
		this.jButtonVerFormTipoConexion.setText("Ver");
		this.jButtonNuevoRelacionesTipoConexion.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaTipoConexion.setText("Guardar");
		this.jButtonCerrarTipoConexion.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoConexion,"nuevo_button","Nuevo",this.tipoconexionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarTipoConexion,"duplicar_button","Duplicar",this.tipoconexionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarTipoConexion,"copiar_button","Copiar",this.tipoconexionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormTipoConexion,"ver_form","Ver",this.tipoconexionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesTipoConexion,"nuevorelaciones_button","Nuevo Rel",this.tipoconexionSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoConexion,"guardarcambiostabla_button","Guardar",this.tipoconexionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoConexion,"cerrar_button","Salir",this.tipoconexionSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoConexion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarTipoConexion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarTipoConexion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormTipoConexion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesTipoConexion, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoConexion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoConexion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoTipoConexion.setToolTipText("Nuevo"+" "+TipoConexionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarTipoConexion.setToolTipText("Duplicar"+" "+TipoConexionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarTipoConexion.setToolTipText("Copiar"+" "+TipoConexionConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormTipoConexion.setToolTipText("Ver"+" "+TipoConexionConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesTipoConexion.setToolTipText("Nuevo Rel"+" "+TipoConexionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaTipoConexion.setToolTipText("Guardar"+" "+TipoConexionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoConexion.setToolTipText("Salir"+" "+TipoConexionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoConexion";
		inputMap = this.jButtonNuevoTipoConexion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoConexion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoConexion"));
		
		//DUPLICAR
		sMapKey = "DuplicarTipoConexion";
		inputMap = this.jButtonDuplicarTipoConexion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarTipoConexion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarTipoConexion"));
		
		//COPIAR
		sMapKey = "CopiarTipoConexion";
		inputMap = this.jButtonCopiarTipoConexion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarTipoConexion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarTipoConexion"));
		
		//VEr FORM
		sMapKey = "VerFormTipoConexion";
		inputMap = this.jButtonVerFormTipoConexion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormTipoConexion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormTipoConexion"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesTipoConexion";
		inputMap = this.jButtonNuevoRelacionesTipoConexion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesTipoConexion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesTipoConexion"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarTipoConexion";
		inputMap = this.jButtonModificarTipoConexion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarTipoConexion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarTipoConexion"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarTipoConexion";
		inputMap = this.jButtonCerrarTipoConexion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoConexion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoConexion"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoConexion";
		inputMap = this.jButtonGuardarCambiosTablaTipoConexion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoConexion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoConexion"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesTipoConexion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesTipoConexion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionTipoConexion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1TipoConexion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2TipoConexion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3TipoConexion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4TipoConexion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5TipoConexion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesTipoConexion.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesTipoConexion.setName("jPanelParametrosReportesTipoConexion"); 
		
		this.jPanelParametrosReportesAccionesTipoConexion.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesTipoConexion.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesTipoConexion.setName("jPanelParametrosReportesAccionesTipoConexion"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesTipoConexion, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesTipoConexion, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionTipoConexion = new JButtonMe();
		this.jButtonRecargarInformacionTipoConexion.setText("Recargar");
		this.jButtonRecargarInformacionTipoConexion.setToolTipText("Recargar"+" "+TipoConexionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionTipoConexion,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionTipoConexion = new JButtonMe();
		this.jButtonProcesarInformacionTipoConexion.setText("Procesar");
		this.jButtonProcesarInformacionTipoConexion.setToolTipText("Procesar"+" "+TipoConexionConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionTipoConexion.setVisible(false);
			
		this.jButtonProcesarInformacionTipoConexion.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoConexion.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoConexion.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesTipoConexion = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoConexion.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesTipoConexion.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesTipoConexion = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoConexion.setText("TIPO");       
		this.jComboBoxTiposReportesTipoConexion.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesTipoConexion = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoConexion.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesTipoConexion.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionTipoConexion = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionTipoConexion.setText("Paginacion");
		this.jComboBoxTiposPaginacionTipoConexion.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesTipoConexion = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesTipoConexion.setText("Accion");
		this.jComboBoxTiposRelacionesTipoConexion.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesTipoConexion = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoConexion.setText("Accion");
		this.jComboBoxTiposAccionesTipoConexion.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarTipoConexion = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarTipoConexion.setText("Accion");
		this.jComboBoxTiposSeleccionarTipoConexion.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralTipoConexion=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralTipoConexion.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoConexion.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoConexion.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesTipoConexion = new JLabelMe();
		
		this.jLabelAccionesTipoConexion.setText("Acciones");		
		this.jLabelAccionesTipoConexion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoConexion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoConexion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosTipoConexion = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosTipoConexion.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosTipoConexion.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosTipoConexion = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosTipoConexion.setText("Seleccionados");
		this.jCheckBoxSeleccionadosTipoConexion.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaTipoConexion = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaTipoConexion.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaTipoConexion.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteTipoConexion = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteTipoConexion.setText("Graf.");
		this.jCheckBoxConGraficoReporteTipoConexion.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresTipoConexion = new JButtonMe();
		//this.jButtonAnterioresTipoConexion.setText("<<");
        this.jButtonAnterioresTipoConexion.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresTipoConexion,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresTipoConexion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesTipoConexion = new JButtonMe();
		//this.jButtonSiguientesTipoConexion.setText(">>");
        this.jButtonSiguientesTipoConexion.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesTipoConexion,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesTipoConexion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosTipoConexion = new JButtonMe();
		this.jButtonNuevoGuardarCambiosTipoConexion.setText("Nue");
        this.jButtonNuevoGuardarCambiosTipoConexion.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosTipoConexion,"nuevoguardarcambios_button","Nue",this.tipoconexionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosTipoConexion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosTipoConexion";
		inputMap = this.jButtonNuevoGuardarCambiosTipoConexion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosTipoConexion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosTipoConexion"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionTipoConexion";
		inputMap = this.jButtonRecargarInformacionTipoConexion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionTipoConexion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionTipoConexion"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesTipoConexion";
		inputMap = this.jButtonSiguientesTipoConexion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesTipoConexion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesTipoConexion"));
		
		//ANTERIORES		
		sMapKey = "AnterioresTipoConexion";
		inputMap = this.jButtonAnterioresTipoConexion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresTipoConexion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresTipoConexion"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasTipoConexion();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesTipoConexion.setMinimumSize(new Dimension(this.getWidth(),TipoConexionBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoConexionBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoConexion.setMaximumSize(new Dimension(this.getWidth(),TipoConexionBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoConexionBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoConexion.setPreferredSize(new Dimension(this.getWidth(),TipoConexionBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoConexionBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionTipoConexion = new GridBagLayout();

			this.jPanelPaginacionTipoConexion.setLayout(gridaBagLayoutPaginacionTipoConexion);						
			
			this.gridBagConstraintsTipoConexion = new GridBagConstraints();
			this.gridBagConstraintsTipoConexion.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsTipoConexion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoConexion.gridy = 0;
			this.gridBagConstraintsTipoConexion.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionTipoConexion.add(this.jButtonAnterioresTipoConexion, this.gridBagConstraintsTipoConexion);
					
						
			this.gridBagConstraintsTipoConexion = new GridBagConstraints();
			this.gridBagConstraintsTipoConexion.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoConexion.gridy = 0;
			
			this.jPanelPaginacionTipoConexion.add(this.jButtonNuevoGuardarCambiosTipoConexion, this.gridBagConstraintsTipoConexion);
						
			
			this.gridBagConstraintsTipoConexion = new GridBagConstraints();
			this.gridBagConstraintsTipoConexion.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsTipoConexion.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoConexion.gridy = 0;
			this.jPanelPaginacionTipoConexion.add(this.jButtonSiguientesTipoConexion, this.gridBagConstraintsTipoConexion);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsTipoConexion = new GridBagConstraints();
			this.gridBagConstraintsTipoConexion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoConexion.gridy = 1;
			this.gridBagConstraintsTipoConexion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoConexion.add(this.jButtonNuevoTipoConexion, this.gridBagConstraintsTipoConexion);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsTipoConexion = new GridBagConstraints();
				this.gridBagConstraintsTipoConexion.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoConexion.gridy = 1;
				this.gridBagConstraintsTipoConexion.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionTipoConexion.add(this.jButtonNuevoRelacionesTipoConexion, this.gridBagConstraintsTipoConexion);
			}
			
			
			if(!this.tipoconexionSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsTipoConexion = new GridBagConstraints();
				this.gridBagConstraintsTipoConexion.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoConexion.gridy = 1;
				this.gridBagConstraintsTipoConexion.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionTipoConexion.add(this.jButtonGuardarCambiosTablaTipoConexion, this.gridBagConstraintsTipoConexion);
			}
			
			
			
			this.gridBagConstraintsTipoConexion = new GridBagConstraints();
			this.gridBagConstraintsTipoConexion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoConexion.gridy = 1;
			this.gridBagConstraintsTipoConexion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoConexion.add(this.jButtonDuplicarTipoConexion, this.gridBagConstraintsTipoConexion);
			
			this.gridBagConstraintsTipoConexion = new GridBagConstraints();
			this.gridBagConstraintsTipoConexion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoConexion.gridy = 1;
			this.gridBagConstraintsTipoConexion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoConexion.add(this.jButtonCopiarTipoConexion, this.gridBagConstraintsTipoConexion);
		
			this.gridBagConstraintsTipoConexion = new GridBagConstraints();
			this.gridBagConstraintsTipoConexion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoConexion.gridy = 1;
			this.gridBagConstraintsTipoConexion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoConexion.add(this.jButtonVerFormTipoConexion, this.gridBagConstraintsTipoConexion);
		
			this.gridBagConstraintsTipoConexion = new GridBagConstraints();
			this.gridBagConstraintsTipoConexion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoConexion.gridy = 1;
			this.gridBagConstraintsTipoConexion.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionTipoConexion.add(this.jButtonCerrarTipoConexion, this.gridBagConstraintsTipoConexion);
		
		
		
		this.jButtonRecargarInformacionTipoConexion.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoConexion.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoConexion.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionTipoConexion, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesTipoConexion.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoConexion.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoConexion.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesTipoConexion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesTipoConexion.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoConexion.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoConexion.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesTipoConexion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesTipoConexion.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoConexion.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoConexion.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesTipoConexion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionTipoConexion.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoConexion.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoConexion.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionTipoConexion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesTipoConexion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoConexion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoConexion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesTipoConexion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesTipoConexion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoConexion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoConexion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoConexion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarTipoConexion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoConexion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoConexion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarTipoConexion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaTipoConexion.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoConexion.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoConexion.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaTipoConexion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteTipoConexion.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoConexion.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoConexion.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteTipoConexion, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosTipoConexion.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoConexion.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoConexion.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosTipoConexion, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosTipoConexion.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoConexion.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoConexion.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosTipoConexion, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesTipoConexion = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesTipoConexion = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1TipoConexion = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2TipoConexion = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3TipoConexion = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4TipoConexion = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesTipoConexion.setLayout(gridaBagParametrosReportesTipoConexion);
			this.jPanelParametrosReportesAccionesTipoConexion.setLayout(gridaBagParametrosReportesAccionesTipoConexion);
			
			
			this.jPanelParametrosAuxiliar1TipoConexion.setLayout(gridaBagParametrosAuxiliar1TipoConexion);
			this.jPanelParametrosAuxiliar2TipoConexion.setLayout(gridaBagParametrosAuxiliar2TipoConexion);
			this.jPanelParametrosAuxiliar3TipoConexion.setLayout(gridaBagParametrosAuxiliar3TipoConexion);
			this.jPanelParametrosAuxiliar4TipoConexion.setLayout(gridaBagParametrosAuxiliar4TipoConexion);
			//this.jPanelParametrosAuxiliar5TipoConexion.setLayout(gridaBagParametrosAuxiliar2TipoConexion);			
			
			
			
			
			this.gridBagConstraintsTipoConexion = new GridBagConstraints();
			this.gridBagConstraintsTipoConexion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoConexion.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoConexion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoConexion.add(this.jButtonRecargarInformacionTipoConexion, this.gridBagConstraintsTipoConexion);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsTipoConexion = new GridBagConstraints();
			this.gridBagConstraintsTipoConexion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoConexion.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoConexion.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoConexion.add(this.jComboBoxTiposPaginacionTipoConexion, this.gridBagConstraintsTipoConexion);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsTipoConexion = new GridBagConstraints();
			this.gridBagConstraintsTipoConexion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoConexion.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoConexion.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoConexion.add(this.jCheckBoxConAltoMaximoTablaTipoConexion, this.gridBagConstraintsTipoConexion);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsTipoConexion = new GridBagConstraints();
			this.gridBagConstraintsTipoConexion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoConexion.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoConexion.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoConexion.add(this.jComboBoxTiposArchivosReportesTipoConexion, this.gridBagConstraintsTipoConexion);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsTipoConexion = new GridBagConstraints();
			this.gridBagConstraintsTipoConexion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoConexion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoConexion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoConexion.add(this.jPanelParametrosAuxiliar1TipoConexion, this.gridBagConstraintsTipoConexion);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsTipoConexion = new GridBagConstraints();
			this.gridBagConstraintsTipoConexion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoConexion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoConexion.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoConexion.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4TipoConexion.add(this.jComboBoxTiposReportesTipoConexion, this.gridBagConstraintsTipoConexion);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsTipoConexion = new GridBagConstraints();
			this.gridBagConstraintsTipoConexion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoConexion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoConexion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoConexion.add(this.jPanelParametrosAuxiliar4TipoConexion, this.gridBagConstraintsTipoConexion);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsTipoConexion = new GridBagConstraints();
			this.gridBagConstraintsTipoConexion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoConexion.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoConexion.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoConexion.add(this.jComboBoxTiposReportesTipoConexion, this.gridBagConstraintsTipoConexion);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsTipoConexion = new GridBagConstraints();
			this.gridBagConstraintsTipoConexion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoConexion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoConexion.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoConexion.add(this.jCheckBoxGenerarReporteTipoConexion, this.gridBagConstraintsTipoConexion);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsTipoConexion = new GridBagConstraints();
			this.gridBagConstraintsTipoConexion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoConexion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoConexion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoConexion.add(this.jPanelParametrosAuxiliar2TipoConexion, this.gridBagConstraintsTipoConexion);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsTipoConexion = new GridBagConstraints();
			this.gridBagConstraintsTipoConexion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoConexion.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoConexion.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoConexion.add(this.jLabelAccionesTipoConexion, this.gridBagConstraintsTipoConexion);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsTipoConexion = new GridBagConstraints();
				this.gridBagConstraintsTipoConexion.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsTipoConexion.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsTipoConexion.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesTipoConexion.add(this.jButtonAbrirOrderByTipoConexion, this.gridBagConstraintsTipoConexion);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsTipoConexion = new GridBagConstraints();
			this.gridBagConstraintsTipoConexion.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsTipoConexion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoConexion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoConexion.add(this.jComboBoxTiposSeleccionarTipoConexion, this.gridBagConstraintsTipoConexion);			
			
			
			/*
			this.gridBagConstraintsTipoConexion = new GridBagConstraints();
			this.gridBagConstraintsTipoConexion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoConexion.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoConexion.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoConexion.add(this.jCheckBoxSeleccionarTodosTipoConexion, this.gridBagConstraintsTipoConexion);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsTipoConexion = new GridBagConstraints();
			this.gridBagConstraintsTipoConexion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoConexion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoConexion.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoConexion.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoConexion.add(this.jCheckBoxSeleccionarTodosTipoConexion, this.gridBagConstraintsTipoConexion);															
				
			this.gridBagConstraintsTipoConexion = new GridBagConstraints();
			this.gridBagConstraintsTipoConexion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoConexion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoConexion.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoConexion.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoConexion.add(this.jCheckBoxSeleccionadosTipoConexion, this.gridBagConstraintsTipoConexion);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsTipoConexion = new GridBagConstraints();
			this.gridBagConstraintsTipoConexion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoConexion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoConexion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoConexion.add(this.jPanelParametrosAuxiliar3TipoConexion, this.gridBagConstraintsTipoConexion);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsTipoConexion = new GridBagConstraints();
			this.gridBagConstraintsTipoConexion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoConexion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoConexion.add(this.jComboBoxTiposRelacionesTipoConexion, this.gridBagConstraintsTipoConexion);
				
			this.gridBagConstraintsTipoConexion = new GridBagConstraints();
			this.gridBagConstraintsTipoConexion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoConexion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoConexion.add(this.jComboBoxTiposAccionesTipoConexion, this.gridBagConstraintsTipoConexion);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosTipoConexion = new GridBagLayout();

			this.jScrollPanelDatosTipoConexion.setLayout(gridaBagLayoutDatosTipoConexion);
			
			this.gridBagConstraintsTipoConexion = new GridBagConstraints();
			this.gridBagConstraintsTipoConexion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoConexion.gridy = 0;
			this.gridBagConstraintsTipoConexion.gridx = 0;
			
			this.jScrollPanelDatosTipoConexion.add(this.jTableDatosTipoConexion, this.gridBagConstraintsTipoConexion);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosTipoConexion.setViewportView(this.jTableDatosTipoConexion);
		this.jTableDatosTipoConexion.setFillsViewportHeight(true);
		this.jTableDatosTipoConexion.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesTipoConexion= new GridBagLayout();
		this.jPanelAccionesTipoConexion.setLayout(gridaBagLayoutAccionesTipoConexion);
		
		
		/*	
		this.gridBagConstraintsTipoConexion = new GridBagConstraints();
		this.gridBagConstraintsTipoConexion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoConexion.gridy = 0;
		this.gridBagConstraintsTipoConexion.gridx = 0;
			
		this.jPanelAccionesTipoConexion.add(this.jButtonNuevoTipoConexion, this.gridBagConstraintsTipoConexion);
		*/
		int iPosXAccion=0;
		
						
		
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoConexion = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoConexion);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipoconexionSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoConexion = new GridBagConstraints();						
			this.gridBagConstraintsTipoConexion.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoConexion.gridx = 0;		
			//this.gridBagConstraintsTipoConexion.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoConexion.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoConexion.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarTipoConexion, this.gridBagConstraintsTipoConexion);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsTipoConexion = new GridBagConstraints();
		this.gridBagConstraintsTipoConexion.gridy = iGridyPrincipal++;
		this.gridBagConstraintsTipoConexion.gridx = 0;		
		//this.gridBagConstraintsTipoConexion.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoConexion.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsTipoConexion.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsTipoConexion);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsTipoConexion = new GridBagConstraints();
		this.gridBagConstraintsTipoConexion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoConexion.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesTipoConexion, this.gridBagConstraintsTipoConexion);								
		
		
		/*
		this.gridBagConstraintsTipoConexion = new GridBagConstraints();
		this.gridBagConstraintsTipoConexion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoConexion.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesTipoConexion, this.gridBagConstraintsTipoConexion);
		*/		
		
		this.gridBagConstraintsTipoConexion = new GridBagConstraints();
		this.gridBagConstraintsTipoConexion.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoConexion.gridx =0;
		this.gridBagConstraintsTipoConexion.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoConexion.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoConexion, this.gridBagConstraintsTipoConexion);
				
		
		this.gridBagConstraintsTipoConexion = new GridBagConstraints();
		this.gridBagConstraintsTipoConexion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoConexion.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionTipoConexion, this.gridBagConstraintsTipoConexion);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(TipoConexionJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosTipoConexion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoConexion = new GridBagLayout();
			this.jPanelBusquedasParametrosTipoConexion.setLayout(gridaBagLayoutBusquedasParametrosTipoConexion);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralTipoConexion=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoConexion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoConexion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoConexion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoConexion = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsTipoConexion = new GridBagConstraints();
		this.gridBagConstraintsTipoConexion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoConexion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoConexion, this.gridBagConstraintsTipoConexion);
			
			
		this.gridBagConstraintsTipoConexion = new GridBagConstraints();
		this.gridBagConstraintsTipoConexion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoConexion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoConexion, this.gridBagConstraintsTipoConexion);
		
			
		this.gridBagConstraintsTipoConexion = new GridBagConstraints();
		this.gridBagConstraintsTipoConexion.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoConexion.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoConexion, this.gridBagConstraintsTipoConexion);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralTipoConexion;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoTipoConexion() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoTipoConexion = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoTipoConexion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoTipoConexion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoTipoConexion.setName("jPanelReporteDinamicoTipoConexion"); 
		
		this.jPanelReporteDinamicoTipoConexion.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoConexion.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoConexion.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoTipoConexion.setLayout(gridaBagLayoutReporteDinamicoTipoConexion);
		
		
		this.jInternalFrameReporteDinamicoTipoConexion= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoTipoConexion = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoConexion= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoTipoConexion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoTipoConexion.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoTipoConexion.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoTipoConexion.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoTipoConexion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoTipoConexion.setResizable(true);
	    this.jInternalFrameReporteDinamicoTipoConexion.setClosable(true);
	    this.jInternalFrameReporteDinamicoTipoConexion.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoTipoConexion.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoConexion.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoConexion.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoTipoConexion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Conexions"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteTipoConexion = new JLabelMe();

		this.jLabelColumnasSelectReporteTipoConexion.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteTipoConexion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoConexion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoConexion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoConexion = new GridBagConstraints();
		this.gridBagConstraintsTipoConexion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoConexion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoConexion.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoConexion.add(this.jLabelColumnasSelectReporteTipoConexion, this.gridBagConstraintsTipoConexion);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteTipoConexion = new JList<Reporte>();
		this.jListColumnasSelectReporteTipoConexion.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteTipoConexion.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteTipoConexion.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoConexion.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoConexion.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteTipoConexion=new JScrollPane(this.jListColumnasSelectReporteTipoConexion);
			
			this.jScrollColumnasSelectReporteTipoConexion.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoConexion.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoConexion.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteTipoConexion.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTipoConexion = new GridBagConstraints();
		this.gridBagConstraintsTipoConexion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoConexion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoConexion.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoConexion.add(this.jListColumnasSelectReporteTipoConexion, this.gridBagConstraintsTipoConexion);
		this.jPanelReporteDinamicoTipoConexion.add(this.jScrollColumnasSelectReporteTipoConexion, this.gridBagConstraintsTipoConexion);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteTipoConexion = new JLabelMe();

		this.jLabelRelacionesSelectReporteTipoConexion.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteTipoConexion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoConexion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoConexion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsTipoConexion = new GridBagConstraints();
		this.gridBagConstraintsTipoConexion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoConexion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoConexion.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoConexion.add(this.jLabelRelacionesSelectReporteTipoConexion, this.gridBagConstraintsTipoConexion);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteTipoConexion = new JList<Reporte>();
		this.jListRelacionesSelectReporteTipoConexion.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteTipoConexion.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteTipoConexion.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoConexion.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoConexion.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteTipoConexion=new JScrollPane(this.jListRelacionesSelectReporteTipoConexion);
			
			this.jScrollRelacionesSelectReporteTipoConexion.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoConexion.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoConexion.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteTipoConexion.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsTipoConexion = new GridBagConstraints();
		this.gridBagConstraintsTipoConexion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoConexion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoConexion.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoConexion.add(this.jListRelacionesSelectReporteTipoConexion, this.gridBagConstraintsTipoConexion);
		this.jPanelReporteDinamicoTipoConexion.add(this.jScrollRelacionesSelectReporteTipoConexion, this.gridBagConstraintsTipoConexion);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoTipoConexion = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoTipoConexion = new JComboBoxMe();
		this.jListColumnasValoresGraficoTipoConexion = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoTipoConexion = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoTipoConexion.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoTipoConexion.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoConexion.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoConexion.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoTipoConexion, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoTipoConexion = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoTipoConexion.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoTipoConexion.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoConexion.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoConexion.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoTipoConexion, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoTipoConexion = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoTipoConexion.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoTipoConexion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoConexion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoConexion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoConexion = new GridBagConstraints();
		this.gridBagConstraintsTipoConexion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoConexion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoConexion.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoConexion.add(this.jLabelGenerarExcelReporteDinamicoTipoConexion, this.gridBagConstraintsTipoConexion);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoTipoConexion = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoTipoConexion.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoTipoConexion,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoTipoConexion.setToolTipText("Generar EXCEL"+" "+TipoConexionConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsTipoConexion = new GridBagConstraints();
		//this.gridBagConstraintsTipoConexion.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsTipoConexion.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsTipoConexion.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoTipoConexion.add(this.jButtonGenerarExcelReporteDinamicoTipoConexion, this.gridBagConstraintsTipoConexion);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsTipoConexion = new GridBagConstraints();
		this.gridBagConstraintsTipoConexion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoConexion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoConexion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoConexion.add(this.jComboBoxTiposReportesDinamicoTipoConexion, this.gridBagConstraintsTipoConexion);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoTipoConexion = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoTipoConexion.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoTipoConexion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoConexion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoConexion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoConexion = new GridBagConstraints();
		this.gridBagConstraintsTipoConexion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoConexion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoConexion.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoConexion.add(this.jLabelTiposArchivoReporteDinamicoTipoConexion, this.gridBagConstraintsTipoConexion);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsTipoConexion = new GridBagConstraints();
		this.gridBagConstraintsTipoConexion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoConexion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoConexion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoConexion.add(this.jComboBoxTiposArchivosReportesDinamicoTipoConexion, this.gridBagConstraintsTipoConexion);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoTipoConexion = new JButtonMe();
		this.jButtonGenerarReporteDinamicoTipoConexion.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoTipoConexion,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoTipoConexion.setToolTipText("Generar"+" "+TipoConexionConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsTipoConexion = new GridBagConstraints();
		this.gridBagConstraintsTipoConexion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoConexion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoConexion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoConexion.add(this.jButtonGenerarReporteDinamicoTipoConexion, this.gridBagConstraintsTipoConexion);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoTipoConexion = new JButtonMe();
		this.jButtonCerrarReporteDinamicoTipoConexion.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoTipoConexion,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoTipoConexion.setToolTipText("Cancelar"+" "+TipoConexionConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoConexion = new GridBagConstraints();
		this.gridBagConstraintsTipoConexion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoConexion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoConexion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoConexion.add(this.jButtonCerrarReporteDinamicoTipoConexion, this.gridBagConstraintsTipoConexion);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalTipoConexion = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoTipoConexion= new JScrollPane(jPanelReporteDinamicoTipoConexion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoTipoConexion.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoConexion.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoConexion.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoTipoConexion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Conexions"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoConexion = new GridBagConstraints();
		this.gridBagConstraintsTipoConexion.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsTipoConexion.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsTipoConexion.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoTipoConexion.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoTipoConexion.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalTipoConexion);
		this.jInternalFrameReporteDinamicoTipoConexion.getContentPane().add(this.jScrollPanelReporteDinamicoTipoConexion, this.gridBagConstraintsTipoConexion);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionTipoConexion() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionTipoConexion = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionTipoConexion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionTipoConexion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionTipoConexion.setName("jPanelImportacionTipoConexion"); 
		
		this.jPanelImportacionTipoConexion.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoConexion.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoConexion.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionTipoConexion.setLayout(gridaBagLayoutImportacionTipoConexion);
		
		
		this.jInternalFrameImportacionTipoConexion= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionTipoConexion= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionTipoConexion = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoConexion= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionTipoConexion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoConexion.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoConexion.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionTipoConexion.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoConexion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoConexion.setResizable(true);
	    this.jInternalFrameImportacionTipoConexion.setClosable(true);
	    this.jInternalFrameImportacionTipoConexion.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionTipoConexion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoConexion.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoConexion.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionTipoConexion.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoConexion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoConexion.setResizable(true);
	    this.jInternalFrameImportacionTipoConexion.setClosable(true);
	    this.jInternalFrameImportacionTipoConexion.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionTipoConexion.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoConexion.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoConexion.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionTipoConexion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Conexions"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionTipoConexion = new JLabelMe();

		this.jLabelArchivoImportacionTipoConexion.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionTipoConexion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoConexion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoConexion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoConexion = new GridBagConstraints();
		this.gridBagConstraintsTipoConexion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoConexion.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoConexion.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoConexion.add(this.jLabelArchivoImportacionTipoConexion, this.gridBagConstraintsTipoConexion);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionTipoConexion = new JFileChooser();		
		this.jFileChooserImportacionTipoConexion.setToolTipText("ESCOGER ARCHIVO"+" "+TipoConexionConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionTipoConexion = new JButtonMe();
		this.jButtonAbrirImportacionTipoConexion.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionTipoConexion,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionTipoConexion.setToolTipText("Generar"+" "+TipoConexionConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsTipoConexion = new GridBagConstraints();
		this.gridBagConstraintsTipoConexion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoConexion.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoConexion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoConexion.add(this.jButtonAbrirImportacionTipoConexion, this.gridBagConstraintsTipoConexion);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionTipoConexion = new JLabelMe();

		this.jLabelPathArchivoImportacionTipoConexion.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionTipoConexion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoConexion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoConexion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoConexion = new GridBagConstraints();
		this.gridBagConstraintsTipoConexion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoConexion.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoConexion.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoConexion.add(this.jLabelPathArchivoImportacionTipoConexion, this.gridBagConstraintsTipoConexion);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionTipoConexion=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionTipoConexion.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoConexion.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoConexion.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsTipoConexion = new GridBagConstraints();
		this.gridBagConstraintsTipoConexion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoConexion.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoConexion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoConexion.add(this.jTextFieldPathArchivoImportacionTipoConexion, this.gridBagConstraintsTipoConexion);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionTipoConexion = new JButtonMe();
		this.jButtonGenerarImportacionTipoConexion.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionTipoConexion,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionTipoConexion.setToolTipText("Generar"+" "+TipoConexionConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsTipoConexion = new GridBagConstraints();
		this.gridBagConstraintsTipoConexion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoConexion.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoConexion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoConexion.add(this.jButtonGenerarImportacionTipoConexion, this.gridBagConstraintsTipoConexion);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionTipoConexion = new JButtonMe();
		this.jButtonCerrarImportacionTipoConexion.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionTipoConexion,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionTipoConexion.setToolTipText("Cancelar"+" "+TipoConexionConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoConexion = new GridBagConstraints();
		this.gridBagConstraintsTipoConexion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoConexion.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoConexion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoConexion.add(this.jButtonCerrarImportacionTipoConexion, this.gridBagConstraintsTipoConexion);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalTipoConexion = new GridBagLayout();
		
		this.jScrollPanelImportacionTipoConexion= new JScrollPane(jPanelImportacionTipoConexion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsTipoConexion = new GridBagConstraints();
		this.gridBagConstraintsTipoConexion.gridy =iPosYImportacion;
		this.gridBagConstraintsTipoConexion.gridx =iPosXImportacion;
		this.gridBagConstraintsTipoConexion.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionTipoConexion.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionTipoConexion.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalTipoConexion);
		this.jInternalFrameImportacionTipoConexion.getContentPane().add(this.jScrollPanelImportacionTipoConexion, this.gridBagConstraintsTipoConexion);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByTipoConexion(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByTipoConexion = new JButtonMe();
			this.jButtonAbrirOrderByTipoConexion.setText("Orden");
			this.jButtonAbrirOrderByTipoConexion.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoConexion,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoConexion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByTipoConexion";
			inputMap = this.jButtonAbrirOrderByTipoConexion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByTipoConexion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByTipoConexion"));
		
		
			GridBagLayout gridaBagLayoutOrderByTipoConexion = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByTipoConexion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByTipoConexion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByTipoConexion.setName("jPanelOrderByTipoConexion"); 
			
			this.jPanelOrderByTipoConexion.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoConexion.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoConexion.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByTipoConexion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByTipoConexion.setLayout(gridaBagLayoutOrderByTipoConexion);
			
			
			this.jTableDatosTipoConexionOrderBy = new JTableMe();        
			this.jTableDatosTipoConexionOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosTipoConexionOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosTipoConexionOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosTipoConexionOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosTipoConexionOrderBy.setViewportView(this.jTableDatosTipoConexionOrderBy);
			this.jTableDatosTipoConexionOrderBy.setFillsViewportHeight(true);
			this.jTableDatosTipoConexionOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByTipoConexion= new OrderByJInternalFrame();
			this.jInternalFrameOrderByTipoConexion= new OrderByJInternalFrame();
			this.jScrollPanelOrderByTipoConexion = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteTipoConexion= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByTipoConexion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByTipoConexion.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByTipoConexion.setTitle("Orden");
			this.jInternalFrameOrderByTipoConexion.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByTipoConexion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByTipoConexion.setResizable(true);
			this.jInternalFrameOrderByTipoConexion.setClosable(true);
			this.jInternalFrameOrderByTipoConexion.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByTipoConexion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByTipoConexion.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoConexion.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoConexion.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByTipoConexion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByTipoConexion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Conexions"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsTipoConexion = new GridBagConstraints();
			this.gridBagConstraintsTipoConexion.gridy =iPosYOrderBy++;
			this.gridBagConstraintsTipoConexion.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoConexion.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsTipoConexion.ipady =150;
				
			this.jPanelOrderByTipoConexion.add(jScrollPanelDatosTipoConexionOrderBy, this.gridBagConstraintsTipoConexion);//this.jTableDatosTipoConexionTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByTipoConexion = new JButtonMe();
			this.jButtonCerrarOrderByTipoConexion.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByTipoConexion,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByTipoConexion.setToolTipText("Cancelar"+" "+TipoConexionConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByTipoConexion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsTipoConexion = new GridBagConstraints();
			this.gridBagConstraintsTipoConexion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoConexion.gridy = iPosYOrderBy++;
			this.gridBagConstraintsTipoConexion.gridx = iPosXOrderBy;
									
			this.jPanelOrderByTipoConexion.add(this.jButtonCerrarOrderByTipoConexion, this.gridBagConstraintsTipoConexion);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalTipoConexion = new GridBagLayout();
			
			this.jScrollPanelOrderByTipoConexion= new JScrollPane(jPanelOrderByTipoConexion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsTipoConexion = new GridBagConstraints();
			this.gridBagConstraintsTipoConexion.gridy =iPosYOrderBy;
			this.gridBagConstraintsTipoConexion.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoConexion.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByTipoConexion.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByTipoConexion.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalTipoConexion);
			
			this.jInternalFrameOrderByTipoConexion.getContentPane().add(this.jScrollPanelOrderByTipoConexion, this.gridBagConstraintsTipoConexion);			
		
		} else {
			this.jButtonAbrirOrderByTipoConexion = new JButtonMe();
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
			&& this.tipoconexionSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosTipoConexion.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosTipoConexion.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosTipoConexion.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosTipoConexion.getRowHeight();//TipoConexionConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.tipoconexionSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > TipoConexionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoConexion.isSelected()) {
					iHeightTable=TipoConexionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoConexionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoConexionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > TipoConexionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoConexion.isSelected()) {
					iHeightTable=TipoConexionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoConexionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoConexionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosTipoConexion.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoConexion.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoConexion.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosTipoConexion.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoConexion.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoConexion.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByTipoConexion!=null && this.jInternalFrameOrderByTipoConexion.getjTableDatosOrderBy()!=null) {
			//if(!this.tipoconexionSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByTipoConexion.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByTipoConexion.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByTipoConexion.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByTipoConexion.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByTipoConexion.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByTipoConexion.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByTipoConexion.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosTipoConexion.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoConexion.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoConexion.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=tipoconexionLogic.getTipoConexions().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipoconexions.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<TipoConexion> TraerTipoConexionBeans(List<TipoConexion> tipoconexions,ArrayList<Classe> classes)throws Exception {
		try {
			for(TipoConexion tipoconexion:tipoconexions) {
					
				if(!(TipoConexionConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || TipoConexionConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					tipoconexion.setsDetalleGeneralEntityReporte(TipoConexionConstantesFunciones.getTipoConexionDescripcion(tipoconexion));
										
						
					
					

					if(tipoconexion.getConexions()!=null && Funciones.existeClass(classes,Conexion.class)) {
						try{tipoconexion.setconexionsDescripcionReporte(new JRBeanCollectionDataSource(ConexionJInternalFrame.TraerConexionBeans(tipoconexion.getConexions(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//tipoconexion.setsDetalleGeneralEntityReporte(tipoconexion.getsDetalleGeneralEntityReporte());
										
				}
				
				//tipoconexionbeans.add(tipoconexionbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return tipoconexions;
    }
	//PARA REPORTES FIN
}
