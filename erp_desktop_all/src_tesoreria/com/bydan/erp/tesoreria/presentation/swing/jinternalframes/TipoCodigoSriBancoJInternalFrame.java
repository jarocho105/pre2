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
package com.bydan.erp.tesoreria.presentation.swing.jinternalframes;



import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.auxiliar.*;





//import com.bydan.erp.tesoreria.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.tesoreria.util.TipoCodigoSriBancoConstantesFunciones;

import com.bydan.erp.tesoreria.business.logic.*;
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
public class TipoCodigoSriBancoJInternalFrame extends TipoCodigoSriBancoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarTipoCodigoSriBanco;
	
	protected JMenuBar jmenuBarTipoCodigoSriBanco;
	
	protected JMenu jmenuTipoCodigoSriBanco;
	protected JMenu jmenuDatosTipoCodigoSriBanco;
	protected JMenu jmenuArchivoTipoCodigoSriBanco;
	protected JMenu jmenuAccionesTipoCodigoSriBanco;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosTipoCodigoSriBanco = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoCodigoSriBanco;	
	protected GridBagConstraints gridBagConstraintsTipoCodigoSriBanco;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public TipoCodigoSriBancoDetalleFormJInternalFrame jInternalFrameDetalleFormTipoCodigoSriBanco;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoTipoCodigoSriBanco;	
	protected ImportacionJInternalFrame jInternalFrameImportacionTipoCodigoSriBanco;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public TipoCodigoSriBancoSessionBean tipocodigosribancoSessionBean;
		
	
	
	
	//protected JDesktopPane jDesktopPane;
	public List<TipoCodigoSriBanco> tipocodigosribancos;		
	public List<TipoCodigoSriBanco> tipocodigosribancosEliminados;	
	public List<TipoCodigoSriBanco> tipocodigosribancosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByTipoCodigoSriBanco;		
	protected JButton jButtonAbrirOrderByTipoCodigoSriBanco;
	
	
	//protected JPanel jPanelOrderByTipoCodigoSriBanco;
	//public JScrollPane jScrollPanelOrderByTipoCodigoSriBanco;	
	//protected JButton jButtonCerrarOrderByTipoCodigoSriBanco;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public TipoCodigoSriBancoLogic tipocodigosribancoLogic;
	
	
	
	public JScrollPane jScrollPanelDatosTipoCodigoSriBanco;
	public JScrollPane jScrollPanelDatosEdicionTipoCodigoSriBanco;
	public JScrollPane jScrollPanelDatosGeneralTipoCodigoSriBanco;
    
	
	
	//public JScrollPane jScrollPanelDatosTipoCodigoSriBancoOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoTipoCodigoSriBanco;
	//public JScrollPane jScrollPanelImportacionTipoCodigoSriBanco;
	
	
	
	protected JPanel jPanelAccionesTipoCodigoSriBanco;
	
    protected JPanel jPanelPaginacionTipoCodigoSriBanco;
    protected JPanel jPanelParametrosReportesTipoCodigoSriBanco;
	protected JPanel jPanelParametrosReportesAccionesTipoCodigoSriBanco;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1TipoCodigoSriBanco;
	protected JPanel jPanelParametrosAuxiliar2TipoCodigoSriBanco;
	protected JPanel jPanelParametrosAuxiliar3TipoCodigoSriBanco;
	protected JPanel jPanelParametrosAuxiliar4TipoCodigoSriBanco;
	//protected JPanel jPanelParametrosAuxiliar5TipoCodigoSriBanco;
	
	
	
	//protected JPanel jPanelReporteDinamicoTipoCodigoSriBanco;
	//protected JPanel jPanelImportacionTipoCodigoSriBanco;
	
	
	public JTable jTableDatosTipoCodigoSriBanco;
	
	
	
	//public JTable jTableDatosTipoCodigoSriBancoOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoTipoCodigoSriBanco;
	protected JButton jButtonDuplicarTipoCodigoSriBanco;
	protected JButton jButtonCopiarTipoCodigoSriBanco;
	protected JButton jButtonVerFormTipoCodigoSriBanco;
	protected JButton jButtonNuevoRelacionesTipoCodigoSriBanco;
	protected JButton jButtonModificarTipoCodigoSriBanco;
	
    protected JButton jButtonGuardarCambiosTablaTipoCodigoSriBanco;
	protected JButton jButtonCerrarTipoCodigoSriBanco;
	
	
	protected JButton jButtonRecargarInformacionTipoCodigoSriBanco;
	protected JButton jButtonProcesarInformacionTipoCodigoSriBanco;
	
	
	protected JButton jButtonAnterioresTipoCodigoSriBanco;
	protected JButton jButtonSiguientesTipoCodigoSriBanco;
	protected JButton jButtonNuevoGuardarCambiosTipoCodigoSriBanco;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoTipoCodigoSriBanco;
	//protected JButton jButtonCerrarReporteDinamicoTipoCodigoSriBanco;
	//protected JButton jButtonGenerarExcelReporteDinamicoTipoCodigoSriBanco;	
	
	
	
	//protected JButton jButtonAbrirImportacionTipoCodigoSriBanco;
	//protected JButton jButtonGenerarImportacionTipoCodigoSriBanco;
	//protected JButton jButtonCerrarImportacionTipoCodigoSriBanco;
	//protected JFileChooser jFileChooserImportacionTipoCodigoSriBanco;
	//protected File fileImportacionTipoCodigoSriBanco;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoCodigoSriBanco;
	protected JButton jButtonDuplicarToolBarTipoCodigoSriBanco;
	protected JButton jButtonNuevoRelacionesToolBarTipoCodigoSriBanco;
	
	
	public JButton jButtonGuardarCambiosToolBarTipoCodigoSriBanco;
	protected JButton jButtonCopiarToolBarTipoCodigoSriBanco;
	protected JButton jButtonVerFormToolBarTipoCodigoSriBanco;
	public JButton jButtonGuardarCambiosTablaToolBarTipoCodigoSriBanco;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoCodigoSriBanco;
	protected JButton jButtonCerrarToolBarTipoCodigoSriBanco;
	
	protected JButton jButtonRecargarInformacionToolBarTipoCodigoSriBanco;
	protected JButton jButtonProcesarInformacionToolBarTipoCodigoSriBanco;
	protected JButton jButtonAnterioresToolBarTipoCodigoSriBanco;
	protected JButton jButtonSiguientesToolBarTipoCodigoSriBanco;
	protected JButton jButtonNuevoGuardarCambiosToolBarTipoCodigoSriBanco;
	protected JButton jButtonAbrirOrderByToolBarTipoCodigoSriBanco;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoCodigoSriBanco;
	protected JMenuItem jMenuItemDuplicarTipoCodigoSriBanco;
	protected JMenuItem jMenuItemNuevoRelacionesTipoCodigoSriBanco;
	
	
	protected JMenuItem jMenuItemGuardarCambiosTipoCodigoSriBanco;
	protected JMenuItem jMenuItemCopiarTipoCodigoSriBanco;
	protected JMenuItem jMenuItemVerFormTipoCodigoSriBanco;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoCodigoSriBanco;
	protected JMenuItem jMenuItemCerrarTipoCodigoSriBanco;
	protected JMenuItem jMenuItemDetalleCerrarTipoCodigoSriBanco;
	protected JMenuItem jMenuItemDetalleAbrirOrderByTipoCodigoSriBanco;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoCodigoSriBanco;
	
	protected JMenuItem jMenuItemRecargarInformacionTipoCodigoSriBanco;
	protected JMenuItem jMenuItemProcesarInformacionTipoCodigoSriBanco;
	protected JMenuItem jMenuItemAnterioresTipoCodigoSriBanco;
	protected JMenuItem jMenuItemSiguientesTipoCodigoSriBanco;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoCodigoSriBanco;
	protected JMenuItem jMenuItemAbrirOrderByTipoCodigoSriBanco;
	protected JMenuItem jMenuItemMostrarOcultarTipoCodigoSriBanco;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoCodigoSriBanco;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosTipoCodigoSriBanco;
	protected JCheckBox jCheckBoxSeleccionadosTipoCodigoSriBanco;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaTipoCodigoSriBanco;
	protected JCheckBox jCheckBoxConGraficoReporteTipoCodigoSriBanco;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesTipoCodigoSriBanco;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesTipoCodigoSriBanco;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoTipoCodigoSriBanco;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoTipoCodigoSriBanco;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesTipoCodigoSriBanco;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionTipoCodigoSriBanco;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoCodigoSriBanco;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoCodigoSriBanco;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarTipoCodigoSriBanco;
	protected JTextField jTextFieldValorCampoGeneralTipoCodigoSriBanco;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteTipoCodigoSriBanco;
	//public JList<Reporte> jListColumnasSelectReporteTipoCodigoSriBanco;
	//public JScrollPane jScrollColumnasSelectReporteTipoCodigoSriBanco;
	
	//public JLabel jLabelRelacionesSelectReporteTipoCodigoSriBanco;
	//public JList<Reporte> jListRelacionesSelectReporteTipoCodigoSriBanco;
	//public JScrollPane jScrollRelacionesSelectReporteTipoCodigoSriBanco;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoTipoCodigoSriBanco;
	//protected JCheckBox jCheckBoxConGraficoDinamicoTipoCodigoSriBanco;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoTipoCodigoSriBanco;
	//public JLabel jLabelTiposArchivoReporteDinamicoTipoCodigoSriBanco;
	
		
	//public JLabel jLabelArchivoImportacionTipoCodigoSriBanco;	
	//public JLabel jLabelPathArchivoImportacionTipoCodigoSriBanco;
	//protected JTextField jTextFieldPathArchivoImportacionTipoCodigoSriBanco;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoTipoCodigoSriBanco;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoTipoCodigoSriBanco;
	
	//public JLabel jLabelColumnaCategoriaValorTipoCodigoSriBanco;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorTipoCodigoSriBanco;
	
	//public JLabel jLabelColumnasValoresGraficoTipoCodigoSriBanco;
	//public JList<Reporte> jListColumnasValoresGraficoTipoCodigoSriBanco;
	//public JScrollPane jScrollColumnasValoresGraficoTipoCodigoSriBanco;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoTipoCodigoSriBanco;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoTipoCodigoSriBanco;	
	
	
	
	
	
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
	public TipoCodigoSriBancoJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("TipoCodigoSriBanco No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoCodigoSriBancoJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoCodigoSriBanco No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoCodigoSriBancoJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoCodigoSriBanco No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoCodigoSriBancoJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoCodigoSriBanco No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionTipoCodigoSriBanco)	{
		this.jButtonRecargarInformacionTipoCodigoSriBanco = jButtonRecargarInformacionTipoCodigoSriBanco;
	}
	
	public JButton getjButtonProcesarInformacionTipoCodigoSriBanco() {
		return this.jButtonProcesarInformacionTipoCodigoSriBanco;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoCodigoSriBanco)	{
		this.jButtonProcesarInformacionTipoCodigoSriBanco = jButtonProcesarInformacionTipoCodigoSriBanco;
	}
	
	
	public JButton getjButtonRecargarInformacionTipoCodigoSriBanco() {
		return this.jButtonRecargarInformacionTipoCodigoSriBanco;
	}
	
	
	public List<TipoCodigoSriBanco> gettipocodigosribancos() {
		return this.tipocodigosribancos;
	}

	public void settipocodigosribancos(List<TipoCodigoSriBanco> tipocodigosribancos) {
		this.tipocodigosribancos = tipocodigosribancos;
	}
	
	public List<TipoCodigoSriBanco> gettipocodigosribancosAux() {
		return this.tipocodigosribancosAux;
	}

	public void settipocodigosribancosAux(List<TipoCodigoSriBanco> tipocodigosribancosAux) {
		this.tipocodigosribancosAux = tipocodigosribancosAux;
	}
	
	public List<TipoCodigoSriBanco> gettipocodigosribancosEliminados() {
		return this.tipocodigosribancosEliminados;
	}

	public void setTipoCodigoSriBancosEliminados(List<TipoCodigoSriBanco> tipocodigosribancosEliminados) {
		this.tipocodigosribancosEliminados = tipocodigosribancosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarTipoCodigoSriBanco() {
		return jComboBoxTiposSeleccionarTipoCodigoSriBanco;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarTipoCodigoSriBanco(
			JComboBox jComboBoxTiposSeleccionarTipoCodigoSriBanco) {
		this.jComboBoxTiposSeleccionarTipoCodigoSriBanco = jComboBoxTiposSeleccionarTipoCodigoSriBanco;
	}
	
	public void setBorderResaltarTiposSeleccionarTipoCodigoSriBanco() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarTipoCodigoSriBanco.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarTipoCodigoSriBanco .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralTipoCodigoSriBanco() {
		return jTextFieldValorCampoGeneralTipoCodigoSriBanco;
	}

	public void setjTextFieldValorCampoGeneralTipoCodigoSriBanco(
			JTextField jTextFieldValorCampoGeneralTipoCodigoSriBanco) {
		this.jTextFieldValorCampoGeneralTipoCodigoSriBanco = jTextFieldValorCampoGeneralTipoCodigoSriBanco;
	}

	public void setBorderResaltarValorCampoGeneralTipoCodigoSriBanco() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoCodigoSriBanco.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralTipoCodigoSriBanco .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosTipoCodigoSriBanco() {
		return this.jCheckBoxSeleccionarTodosTipoCodigoSriBanco;
	}

	public void setjCheckBoxSeleccionarTodosTipoCodigoSriBanco(
			JCheckBox jCheckBoxSeleccionarTodosTipoCodigoSriBanco) {
		this.jCheckBoxSeleccionarTodosTipoCodigoSriBanco = jCheckBoxSeleccionarTodosTipoCodigoSriBanco;
	}

	public void setBorderResaltarSeleccionarTodosTipoCodigoSriBanco() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoCodigoSriBanco.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosTipoCodigoSriBanco .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosTipoCodigoSriBanco() {
		return this.jCheckBoxSeleccionadosTipoCodigoSriBanco;
	}

	public void setjCheckBoxSeleccionadosTipoCodigoSriBanco(
			JCheckBox jCheckBoxSeleccionadosTipoCodigoSriBanco) {
		this.jCheckBoxSeleccionadosTipoCodigoSriBanco = jCheckBoxSeleccionadosTipoCodigoSriBanco;
	}
	
	public void setBorderResaltarSeleccionadosTipoCodigoSriBanco() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoCodigoSriBanco.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosTipoCodigoSriBanco .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesTipoCodigoSriBanco() {
		return this.jComboBoxTiposArchivosReportesTipoCodigoSriBanco;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesTipoCodigoSriBanco(
			JComboBox jComboBoxTiposArchivosReportesTipoCodigoSriBanco) {
		this.jComboBoxTiposArchivosReportesTipoCodigoSriBanco = jComboBoxTiposArchivosReportesTipoCodigoSriBanco;
	}

	public void setBorderResaltarTiposArchivosReportesTipoCodigoSriBanco() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoCodigoSriBanco.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesTipoCodigoSriBanco .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesTipoCodigoSriBanco() {
		return this.jComboBoxTiposReportesTipoCodigoSriBanco;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesTipoCodigoSriBanco(
			JComboBox jComboBoxTiposReportesTipoCodigoSriBanco) {
		this.jComboBoxTiposReportesTipoCodigoSriBanco = jComboBoxTiposReportesTipoCodigoSriBanco;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoTipoCodigoSriBanco() {
	//	return jComboBoxTiposReportesDinamicoTipoCodigoSriBanco;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoTipoCodigoSriBanco(
	//		JComboBox jComboBoxTiposReportesDinamicoTipoCodigoSriBanco) {
	//	this.jComboBoxTiposReportesDinamicoTipoCodigoSriBanco = jComboBoxTiposReportesDinamicoTipoCodigoSriBanco;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoTipoCodigoSriBanco() {
	//	return jComboBoxTiposArchivosReportesDinamicoTipoCodigoSriBanco;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoTipoCodigoSriBanco(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoTipoCodigoSriBanco) {
	//	this.jComboBoxTiposArchivosReportesDinamicoTipoCodigoSriBanco = jComboBoxTiposArchivosReportesDinamicoTipoCodigoSriBanco;
	//}
	
	public void setBorderResaltarTiposReportesTipoCodigoSriBanco() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoCodigoSriBanco.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesTipoCodigoSriBanco .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesTipoCodigoSriBanco() {
		return this.jComboBoxTiposGraficosReportesTipoCodigoSriBanco;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesTipoCodigoSriBanco(
			JComboBox jComboBoxTiposGraficosReportesTipoCodigoSriBanco) {
		this.jComboBoxTiposGraficosReportesTipoCodigoSriBanco = jComboBoxTiposGraficosReportesTipoCodigoSriBanco;
	}
	
	public void setBorderResaltarTiposGraficosReportesTipoCodigoSriBanco() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoCodigoSriBanco.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesTipoCodigoSriBanco .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionTipoCodigoSriBanco() {
		return this.jComboBoxTiposPaginacionTipoCodigoSriBanco;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionTipoCodigoSriBanco(
			JComboBox jComboBoxTiposPaginacionTipoCodigoSriBanco) {
		this.jComboBoxTiposPaginacionTipoCodigoSriBanco = jComboBoxTiposPaginacionTipoCodigoSriBanco;
	}
	
	public void setBorderResaltarTiposPaginacionTipoCodigoSriBanco() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoCodigoSriBanco.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionTipoCodigoSriBanco .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesTipoCodigoSriBanco() {
		return this.jComboBoxTiposRelacionesTipoCodigoSriBanco;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoCodigoSriBanco() {
		return this.jComboBoxTiposAccionesTipoCodigoSriBanco;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoCodigoSriBanco(
			JComboBox jComboBoxTiposRelacionesTipoCodigoSriBanco) {
		this.jComboBoxTiposRelacionesTipoCodigoSriBanco = jComboBoxTiposRelacionesTipoCodigoSriBanco;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoCodigoSriBanco(
			JComboBox jComboBoxTiposAccionesTipoCodigoSriBanco) {
		this.jComboBoxTiposAccionesTipoCodigoSriBanco = jComboBoxTiposAccionesTipoCodigoSriBanco;
	}
	
	public void setBorderResaltarTiposRelacionesTipoCodigoSriBanco() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoCodigoSriBanco.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesTipoCodigoSriBanco .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesTipoCodigoSriBanco() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoCodigoSriBanco.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesTipoCodigoSriBanco .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoTipoCodigoSriBanco() {
	//	return jCheckBoxConGraficoDinamicoTipoCodigoSriBanco;
	//}

	//public void setjCheckBoxConGraficoDinamicoTipoCodigoSriBanco(
	//		JCheckBox jCheckBoxConGraficoDinamicoTipoCodigoSriBanco) {
	//	this.jCheckBoxConGraficoDinamicoTipoCodigoSriBanco = jCheckBoxConGraficoDinamicoTipoCodigoSriBanco;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoTipoCodigoSriBanco() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarTipoCodigoSriBanco.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoTipoCodigoSriBanco .setBorder(borderResaltar);		
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
		this.tipocodigosribancoSessionBean=new TipoCodigoSriBancoSessionBean();
		
		this.tipocodigosribancoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipocodigosribancoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipocodigosribancoSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=TipoCodigoSriBancoJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=TipoCodigoSriBancoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoCodigoSriBancoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoCodigoSriBancoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoCodigoSriBancoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"A MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 650) {
			iHeight=650;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.tipocodigosribancoSessionBean.getEsGuardarRelacionado()) {
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
		
		TipoCodigoSriBancoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("TipoCodigoSriBanco No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarTipoCodigoSriBanco= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarTipoCodigoSriBanco=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarTipoCodigoSriBanco,this.jTtoolBarTipoCodigoSriBanco,
							"nuevo","nuevo","Nuevo"+" "+TipoCodigoSriBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoCodigoSriBanco=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarTipoCodigoSriBanco,this.jTtoolBarTipoCodigoSriBanco,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoCodigoSriBanco=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarTipoCodigoSriBanco,this.jTtoolBarTipoCodigoSriBanco,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+TipoCodigoSriBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarTipoCodigoSriBanco=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarTipoCodigoSriBanco,this.jTtoolBarTipoCodigoSriBanco,
							"duplicar","duplicar","Duplicar"+" "+TipoCodigoSriBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarTipoCodigoSriBanco=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarTipoCodigoSriBanco,this.jTtoolBarTipoCodigoSriBanco,
							"copiar","copiar","Copiar"+" "+TipoCodigoSriBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarTipoCodigoSriBanco=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarTipoCodigoSriBanco,this.jTtoolBarTipoCodigoSriBanco,
							"ver_form","ver_form","Ver"+" "+TipoCodigoSriBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarTipoCodigoSriBanco=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoCodigoSriBanco,this.jTtoolBarTipoCodigoSriBanco,
							"recargar","recargar","Recargar"+" "+TipoCodigoSriBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarTipoCodigoSriBanco=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoCodigoSriBanco,this.jTtoolBarTipoCodigoSriBanco,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarTipoCodigoSriBanco=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoCodigoSriBanco,this.jTtoolBarTipoCodigoSriBanco,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarTipoCodigoSriBanco=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarTipoCodigoSriBanco,this.jTtoolBarTipoCodigoSriBanco,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarTipoCodigoSriBanco=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarTipoCodigoSriBanco,this.jTtoolBarTipoCodigoSriBanco,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarTipoCodigoSriBanco=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarTipoCodigoSriBanco,this.jTtoolBarTipoCodigoSriBanco,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+TipoCodigoSriBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarTipoCodigoSriBanco=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarTipoCodigoSriBanco,this.jTtoolBarTipoCodigoSriBanco,
							"cerrar","cerrar","Salir"+" "+TipoCodigoSriBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarTipoCodigoSriBanco=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarTipoCodigoSriBanco;
			
				this.jButtonProcesarInformacionToolBarTipoCodigoSriBanco=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarTipoCodigoSriBanco;
				
		//protected JButton jButtonModificarToolBarTipoCodigoSriBanco;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarTipoCodigoSriBanco=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuTipoCodigoSriBanco=new JMenuMe("General");
		this.jmenuArchivoTipoCodigoSriBanco=new JMenuMe("Archivo");
		this.jmenuAccionesTipoCodigoSriBanco=new JMenuMe("Acciones");
		this.jmenuDatosTipoCodigoSriBanco=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoCodigoSriBanco= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoCodigoSriBanco.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoCodigoSriBanco,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoCodigoSriBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarTipoCodigoSriBanco= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarTipoCodigoSriBanco.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarTipoCodigoSriBanco,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarTipoCodigoSriBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesTipoCodigoSriBanco= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesTipoCodigoSriBanco.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesTipoCodigoSriBanco,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesTipoCodigoSriBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosTipoCodigoSriBanco= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoCodigoSriBanco.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoCodigoSriBanco,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoCodigoSriBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarTipoCodigoSriBanco= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarTipoCodigoSriBanco.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarTipoCodigoSriBanco,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarTipoCodigoSriBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormTipoCodigoSriBanco= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormTipoCodigoSriBanco.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormTipoCodigoSriBanco,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormTipoCodigoSriBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaTipoCodigoSriBanco= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaTipoCodigoSriBanco.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaTipoCodigoSriBanco,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaTipoCodigoSriBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoCodigoSriBanco= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoCodigoSriBanco.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoCodigoSriBanco,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoCodigoSriBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionTipoCodigoSriBanco= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionTipoCodigoSriBanco.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionTipoCodigoSriBanco,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionTipoCodigoSriBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionTipoCodigoSriBanco= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionTipoCodigoSriBanco.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionTipoCodigoSriBanco,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresTipoCodigoSriBanco= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresTipoCodigoSriBanco.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresTipoCodigoSriBanco,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresTipoCodigoSriBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesTipoCodigoSriBanco= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesTipoCodigoSriBanco.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesTipoCodigoSriBanco,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesTipoCodigoSriBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByTipoCodigoSriBanco= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByTipoCodigoSriBanco.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByTipoCodigoSriBanco,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByTipoCodigoSriBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoCodigoSriBanco= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoCodigoSriBanco.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoCodigoSriBanco,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoCodigoSriBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByTipoCodigoSriBanco= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByTipoCodigoSriBanco.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByTipoCodigoSriBanco,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByTipoCodigoSriBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoCodigoSriBanco= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoCodigoSriBanco.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoCodigoSriBanco,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoCodigoSriBanco, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosTipoCodigoSriBanco= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosTipoCodigoSriBanco.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosTipoCodigoSriBanco,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosTipoCodigoSriBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoTipoCodigoSriBanco.add(this.jMenuItemCerrarTipoCodigoSriBanco);
			
			this.jmenuAccionesTipoCodigoSriBanco.add(this.jMenuItemNuevoTipoCodigoSriBanco);
			this.jmenuAccionesTipoCodigoSriBanco.add(this.jMenuItemNuevoGuardarCambiosTipoCodigoSriBanco);
			this.jmenuAccionesTipoCodigoSriBanco.add(this.jMenuItemNuevoRelacionesTipoCodigoSriBanco);
			this.jmenuAccionesTipoCodigoSriBanco.add(this.jMenuItemGuardarCambiosTablaTipoCodigoSriBanco);		
			this.jmenuAccionesTipoCodigoSriBanco.add(this.jMenuItemDuplicarTipoCodigoSriBanco);		
			this.jmenuAccionesTipoCodigoSriBanco.add(this.jMenuItemCopiarTipoCodigoSriBanco);		
			this.jmenuAccionesTipoCodigoSriBanco.add(this.jMenuItemVerFormTipoCodigoSriBanco);		
			
			this.jmenuDatosTipoCodigoSriBanco.add(this.jMenuItemRecargarInformacionTipoCodigoSriBanco);				
			this.jmenuDatosTipoCodigoSriBanco.add(this.jMenuItemAnterioresTipoCodigoSriBanco);				
			this.jmenuDatosTipoCodigoSriBanco.add(this.jMenuItemSiguientesTipoCodigoSriBanco);				
			this.jmenuDatosTipoCodigoSriBanco.add(this.jMenuItemAbrirOrderByTipoCodigoSriBanco);				
			this.jmenuDatosTipoCodigoSriBanco.add(this.jMenuItemMostrarOcultarTipoCodigoSriBanco);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesTipoCodigoSriBanco.add(this.jMenuItemGuardarCambiosTipoCodigoSriBanco);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoTipoCodigoSriBanco, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesTipoCodigoSriBanco, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosTipoCodigoSriBanco, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarTipoCodigoSriBanco.add(this.jmenuArchivoTipoCodigoSriBanco);		
			this.jmenuBarTipoCodigoSriBanco.add(this.jmenuAccionesTipoCodigoSriBanco);		
			this.jmenuBarTipoCodigoSriBanco.add(this.jmenuDatosTipoCodigoSriBanco);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarTipoCodigoSriBanco);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasTipoCodigoSriBanco() {
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
			//this.jInternalFrameDetalleTipoCodigoSriBanco = new TipoCodigoSriBancoDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("A DATOS");
			this.jInternalFrameDetalleFormTipoCodigoSriBanco = new TipoCodigoSriBancoDetalleFormJInternalFrame(jDesktopPane,this.tipocodigosribancoSessionBean.getConGuardarRelaciones(),this.tipocodigosribancoSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormTipoCodigoSriBanco = null;//new TipoCodigoSriBancoDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoCodigoSriBanco= new GridBagLayout();
		
		
		this.jTableDatosTipoCodigoSriBanco = new JTableMe();      
		
		String sToolTipTipoCodigoSriBanco="";
		sToolTipTipoCodigoSriBanco=TipoCodigoSriBancoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoCodigoSriBanco+="(Tesoreria.TipoCodigoSriBanco)";
		}
		
		if(!this.tipocodigosribancoSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoCodigoSriBanco+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosTipoCodigoSriBanco.setToolTipText(sToolTipTipoCodigoSriBanco);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosTipoCodigoSriBanco);
		this.jTableDatosTipoCodigoSriBanco.setAutoCreateRowSorter(true);
		this.jTableDatosTipoCodigoSriBanco.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosTipoCodigoSriBanco.setRowSelectionAllowed(true);
		this.jTableDatosTipoCodigoSriBanco.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosTipoCodigoSriBanco,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoTipoCodigoSriBanco = new JButtonMe();
		this.jButtonDuplicarTipoCodigoSriBanco = new JButtonMe();
		this.jButtonCopiarTipoCodigoSriBanco = new JButtonMe();
		this.jButtonVerFormTipoCodigoSriBanco = new JButtonMe();
		this.jButtonNuevoRelacionesTipoCodigoSriBanco = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaTipoCodigoSriBanco = new JButtonMe();
		this.jButtonCerrarTipoCodigoSriBanco = new JButtonMe();
		
		this.jScrollPanelDatosTipoCodigoSriBanco = new JScrollPane();   
        this.jScrollPanelDatosGeneralTipoCodigoSriBanco = new JScrollPane();
		
				
		
		
		this.jPanelAccionesTipoCodigoSriBanco = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: A";
		
		if(!this.tipocodigosribancoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoCodigoSriBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos As" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoCodigoSriBanco.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralTipoCodigoSriBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesTipoCodigoSriBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoCodigoSriBanco.setToolTipText("Acciones");
        this.jPanelAccionesTipoCodigoSriBanco.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoCodigoSriBanco, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoCodigoSriBanco, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoTipoCodigoSriBanco=new ReporteDinamicoJInternalFrame(TipoCodigoSriBancoConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoTipoCodigoSriBanco();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionTipoCodigoSriBanco=new ImportacionJInternalFrame(TipoCodigoSriBancoConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionTipoCodigoSriBanco();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByTipoCodigoSriBanco = new JButtonMe();
		
		this.jButtonAbrirOrderByTipoCodigoSriBanco.setText("Orden");
		this.jButtonAbrirOrderByTipoCodigoSriBanco.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoCodigoSriBanco,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoCodigoSriBanco, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByTipoCodigoSriBanco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByTipoCodigoSriBanco.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoCodigoSriBanco=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoCodigoSriBanco,false,this);
			
			//this.cargarOrderByTipoCodigoSriBanco(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoCodigoSriBanco=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoCodigoSriBanco,true,this);
			
			//this.cargarOrderByTipoCodigoSriBanco(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosTipoCodigoSriBanco.setMinimumSize(new Dimension(400,50));//430
		this.jTableDatosTipoCodigoSriBanco.setMaximumSize(new Dimension(400,50));//430
		this.jTableDatosTipoCodigoSriBanco.setPreferredSize(new Dimension(400,50));//430
		
		this.jScrollPanelDatosTipoCodigoSriBanco.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoCodigoSriBanco.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoCodigoSriBanco.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoTipoCodigoSriBanco.setText("Nuevo");
		this.jButtonDuplicarTipoCodigoSriBanco.setText("Duplicar");
		this.jButtonCopiarTipoCodigoSriBanco.setText("Copiar");
		this.jButtonVerFormTipoCodigoSriBanco.setText("Ver");
		this.jButtonNuevoRelacionesTipoCodigoSriBanco.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaTipoCodigoSriBanco.setText("Guardar");
		this.jButtonCerrarTipoCodigoSriBanco.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoCodigoSriBanco,"nuevo_button","Nuevo",this.tipocodigosribancoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarTipoCodigoSriBanco,"duplicar_button","Duplicar",this.tipocodigosribancoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarTipoCodigoSriBanco,"copiar_button","Copiar",this.tipocodigosribancoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormTipoCodigoSriBanco,"ver_form","Ver",this.tipocodigosribancoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesTipoCodigoSriBanco,"nuevorelaciones_button","Nuevo Rel",this.tipocodigosribancoSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoCodigoSriBanco,"guardarcambiostabla_button","Guardar",this.tipocodigosribancoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoCodigoSriBanco,"cerrar_button","Salir",this.tipocodigosribancoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoCodigoSriBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarTipoCodigoSriBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarTipoCodigoSriBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormTipoCodigoSriBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesTipoCodigoSriBanco, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoCodigoSriBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoCodigoSriBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoTipoCodigoSriBanco.setToolTipText("Nuevo"+" "+TipoCodigoSriBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarTipoCodigoSriBanco.setToolTipText("Duplicar"+" "+TipoCodigoSriBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarTipoCodigoSriBanco.setToolTipText("Copiar"+" "+TipoCodigoSriBancoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormTipoCodigoSriBanco.setToolTipText("Ver"+" "+TipoCodigoSriBancoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesTipoCodigoSriBanco.setToolTipText("Nuevo Rel"+" "+TipoCodigoSriBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaTipoCodigoSriBanco.setToolTipText("Guardar"+" "+TipoCodigoSriBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoCodigoSriBanco.setToolTipText("Salir"+" "+TipoCodigoSriBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoCodigoSriBanco";
		inputMap = this.jButtonNuevoTipoCodigoSriBanco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoCodigoSriBanco.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoCodigoSriBanco"));
		
		//DUPLICAR
		sMapKey = "DuplicarTipoCodigoSriBanco";
		inputMap = this.jButtonDuplicarTipoCodigoSriBanco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarTipoCodigoSriBanco.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarTipoCodigoSriBanco"));
		
		//COPIAR
		sMapKey = "CopiarTipoCodigoSriBanco";
		inputMap = this.jButtonCopiarTipoCodigoSriBanco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarTipoCodigoSriBanco.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarTipoCodigoSriBanco"));
		
		//VEr FORM
		sMapKey = "VerFormTipoCodigoSriBanco";
		inputMap = this.jButtonVerFormTipoCodigoSriBanco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormTipoCodigoSriBanco.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormTipoCodigoSriBanco"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesTipoCodigoSriBanco";
		inputMap = this.jButtonNuevoRelacionesTipoCodigoSriBanco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesTipoCodigoSriBanco.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesTipoCodigoSriBanco"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarTipoCodigoSriBanco";
		inputMap = this.jButtonModificarTipoCodigoSriBanco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarTipoCodigoSriBanco.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarTipoCodigoSriBanco"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarTipoCodigoSriBanco";
		inputMap = this.jButtonCerrarTipoCodigoSriBanco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoCodigoSriBanco.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoCodigoSriBanco"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoCodigoSriBanco";
		inputMap = this.jButtonGuardarCambiosTablaTipoCodigoSriBanco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoCodigoSriBanco.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoCodigoSriBanco"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesTipoCodigoSriBanco = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesTipoCodigoSriBanco = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionTipoCodigoSriBanco = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1TipoCodigoSriBanco= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2TipoCodigoSriBanco= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3TipoCodigoSriBanco= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4TipoCodigoSriBanco= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5TipoCodigoSriBanco= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesTipoCodigoSriBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesTipoCodigoSriBanco.setName("jPanelParametrosReportesTipoCodigoSriBanco"); 
		
		this.jPanelParametrosReportesAccionesTipoCodigoSriBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesTipoCodigoSriBanco.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesTipoCodigoSriBanco.setName("jPanelParametrosReportesAccionesTipoCodigoSriBanco"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesTipoCodigoSriBanco, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesTipoCodigoSriBanco, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionTipoCodigoSriBanco = new JButtonMe();
		this.jButtonRecargarInformacionTipoCodigoSriBanco.setText("Recargar");
		this.jButtonRecargarInformacionTipoCodigoSriBanco.setToolTipText("Recargar"+" "+TipoCodigoSriBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionTipoCodigoSriBanco,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionTipoCodigoSriBanco = new JButtonMe();
		this.jButtonProcesarInformacionTipoCodigoSriBanco.setText("Procesar");
		this.jButtonProcesarInformacionTipoCodigoSriBanco.setToolTipText("Procesar"+" "+TipoCodigoSriBancoConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionTipoCodigoSriBanco.setVisible(false);
			
		this.jButtonProcesarInformacionTipoCodigoSriBanco.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoCodigoSriBanco.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoCodigoSriBanco.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesTipoCodigoSriBanco = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoCodigoSriBanco.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesTipoCodigoSriBanco.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesTipoCodigoSriBanco = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoCodigoSriBanco.setText("TIPO");       
		this.jComboBoxTiposReportesTipoCodigoSriBanco.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesTipoCodigoSriBanco = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoCodigoSriBanco.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesTipoCodigoSriBanco.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionTipoCodigoSriBanco = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionTipoCodigoSriBanco.setText("Paginacion");
		this.jComboBoxTiposPaginacionTipoCodigoSriBanco.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesTipoCodigoSriBanco = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesTipoCodigoSriBanco.setText("Accion");
		this.jComboBoxTiposRelacionesTipoCodigoSriBanco.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesTipoCodigoSriBanco = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoCodigoSriBanco.setText("Accion");
		this.jComboBoxTiposAccionesTipoCodigoSriBanco.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarTipoCodigoSriBanco = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarTipoCodigoSriBanco.setText("Accion");
		this.jComboBoxTiposSeleccionarTipoCodigoSriBanco.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralTipoCodigoSriBanco=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralTipoCodigoSriBanco.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoCodigoSriBanco.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoCodigoSriBanco.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesTipoCodigoSriBanco = new JLabelMe();
		
		this.jLabelAccionesTipoCodigoSriBanco.setText("Acciones");		
		this.jLabelAccionesTipoCodigoSriBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoCodigoSriBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoCodigoSriBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosTipoCodigoSriBanco = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosTipoCodigoSriBanco.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosTipoCodigoSriBanco.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosTipoCodigoSriBanco = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosTipoCodigoSriBanco.setText("Seleccionados");
		this.jCheckBoxSeleccionadosTipoCodigoSriBanco.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaTipoCodigoSriBanco = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaTipoCodigoSriBanco.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaTipoCodigoSriBanco.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteTipoCodigoSriBanco = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteTipoCodigoSriBanco.setText("Graf.");
		this.jCheckBoxConGraficoReporteTipoCodigoSriBanco.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresTipoCodigoSriBanco = new JButtonMe();
		//this.jButtonAnterioresTipoCodigoSriBanco.setText("<<");
        this.jButtonAnterioresTipoCodigoSriBanco.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresTipoCodigoSriBanco,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresTipoCodigoSriBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesTipoCodigoSriBanco = new JButtonMe();
		//this.jButtonSiguientesTipoCodigoSriBanco.setText(">>");
        this.jButtonSiguientesTipoCodigoSriBanco.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesTipoCodigoSriBanco,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesTipoCodigoSriBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosTipoCodigoSriBanco = new JButtonMe();
		this.jButtonNuevoGuardarCambiosTipoCodigoSriBanco.setText("Nue");
        this.jButtonNuevoGuardarCambiosTipoCodigoSriBanco.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosTipoCodigoSriBanco,"nuevoguardarcambios_button","Nue",this.tipocodigosribancoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosTipoCodigoSriBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosTipoCodigoSriBanco";
		inputMap = this.jButtonNuevoGuardarCambiosTipoCodigoSriBanco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosTipoCodigoSriBanco.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosTipoCodigoSriBanco"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionTipoCodigoSriBanco";
		inputMap = this.jButtonRecargarInformacionTipoCodigoSriBanco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionTipoCodigoSriBanco.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionTipoCodigoSriBanco"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesTipoCodigoSriBanco";
		inputMap = this.jButtonSiguientesTipoCodigoSriBanco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesTipoCodigoSriBanco.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesTipoCodigoSriBanco"));
		
		//ANTERIORES		
		sMapKey = "AnterioresTipoCodigoSriBanco";
		inputMap = this.jButtonAnterioresTipoCodigoSriBanco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresTipoCodigoSriBanco.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresTipoCodigoSriBanco"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasTipoCodigoSriBanco();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesTipoCodigoSriBanco.setMinimumSize(new Dimension(this.getWidth(),TipoCodigoSriBancoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoCodigoSriBancoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoCodigoSriBanco.setMaximumSize(new Dimension(this.getWidth(),TipoCodigoSriBancoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoCodigoSriBancoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoCodigoSriBanco.setPreferredSize(new Dimension(this.getWidth(),TipoCodigoSriBancoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoCodigoSriBancoBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionTipoCodigoSriBanco = new GridBagLayout();

			this.jPanelPaginacionTipoCodigoSriBanco.setLayout(gridaBagLayoutPaginacionTipoCodigoSriBanco);						
			
			this.gridBagConstraintsTipoCodigoSriBanco = new GridBagConstraints();
			this.gridBagConstraintsTipoCodigoSriBanco.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsTipoCodigoSriBanco.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCodigoSriBanco.gridy = 0;
			this.gridBagConstraintsTipoCodigoSriBanco.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionTipoCodigoSriBanco.add(this.jButtonAnterioresTipoCodigoSriBanco, this.gridBagConstraintsTipoCodigoSriBanco);
					
						
			this.gridBagConstraintsTipoCodigoSriBanco = new GridBagConstraints();
			this.gridBagConstraintsTipoCodigoSriBanco.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoCodigoSriBanco.gridy = 0;
			
			this.jPanelPaginacionTipoCodigoSriBanco.add(this.jButtonNuevoGuardarCambiosTipoCodigoSriBanco, this.gridBagConstraintsTipoCodigoSriBanco);
						
			
			this.gridBagConstraintsTipoCodigoSriBanco = new GridBagConstraints();
			this.gridBagConstraintsTipoCodigoSriBanco.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsTipoCodigoSriBanco.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoCodigoSriBanco.gridy = 0;
			this.jPanelPaginacionTipoCodigoSriBanco.add(this.jButtonSiguientesTipoCodigoSriBanco, this.gridBagConstraintsTipoCodigoSriBanco);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsTipoCodigoSriBanco = new GridBagConstraints();
			this.gridBagConstraintsTipoCodigoSriBanco.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCodigoSriBanco.gridy = 1;
			this.gridBagConstraintsTipoCodigoSriBanco.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoCodigoSriBanco.add(this.jButtonNuevoTipoCodigoSriBanco, this.gridBagConstraintsTipoCodigoSriBanco);
						
			
			
			if(!this.tipocodigosribancoSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsTipoCodigoSriBanco = new GridBagConstraints();
				this.gridBagConstraintsTipoCodigoSriBanco.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoCodigoSriBanco.gridy = 1;
				this.gridBagConstraintsTipoCodigoSriBanco.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionTipoCodigoSriBanco.add(this.jButtonGuardarCambiosTablaTipoCodigoSriBanco, this.gridBagConstraintsTipoCodigoSriBanco);
			}
			
			
			
			this.gridBagConstraintsTipoCodigoSriBanco = new GridBagConstraints();
			this.gridBagConstraintsTipoCodigoSriBanco.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCodigoSriBanco.gridy = 1;
			this.gridBagConstraintsTipoCodigoSriBanco.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoCodigoSriBanco.add(this.jButtonDuplicarTipoCodigoSriBanco, this.gridBagConstraintsTipoCodigoSriBanco);
			
			this.gridBagConstraintsTipoCodigoSriBanco = new GridBagConstraints();
			this.gridBagConstraintsTipoCodigoSriBanco.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCodigoSriBanco.gridy = 1;
			this.gridBagConstraintsTipoCodigoSriBanco.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoCodigoSriBanco.add(this.jButtonCopiarTipoCodigoSriBanco, this.gridBagConstraintsTipoCodigoSriBanco);
		
			this.gridBagConstraintsTipoCodigoSriBanco = new GridBagConstraints();
			this.gridBagConstraintsTipoCodigoSriBanco.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCodigoSriBanco.gridy = 1;
			this.gridBagConstraintsTipoCodigoSriBanco.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoCodigoSriBanco.add(this.jButtonVerFormTipoCodigoSriBanco, this.gridBagConstraintsTipoCodigoSriBanco);
		
			this.gridBagConstraintsTipoCodigoSriBanco = new GridBagConstraints();
			this.gridBagConstraintsTipoCodigoSriBanco.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCodigoSriBanco.gridy = 1;
			this.gridBagConstraintsTipoCodigoSriBanco.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionTipoCodigoSriBanco.add(this.jButtonCerrarTipoCodigoSriBanco, this.gridBagConstraintsTipoCodigoSriBanco);
		
		
		
		this.jButtonRecargarInformacionTipoCodigoSriBanco.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoCodigoSriBanco.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoCodigoSriBanco.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionTipoCodigoSriBanco, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesTipoCodigoSriBanco.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoCodigoSriBanco.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoCodigoSriBanco.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesTipoCodigoSriBanco, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesTipoCodigoSriBanco.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoCodigoSriBanco.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoCodigoSriBanco.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesTipoCodigoSriBanco, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesTipoCodigoSriBanco.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoCodigoSriBanco.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoCodigoSriBanco.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesTipoCodigoSriBanco, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionTipoCodigoSriBanco.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoCodigoSriBanco.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoCodigoSriBanco.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionTipoCodigoSriBanco, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesTipoCodigoSriBanco.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoCodigoSriBanco.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoCodigoSriBanco.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesTipoCodigoSriBanco, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesTipoCodigoSriBanco.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoCodigoSriBanco.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoCodigoSriBanco.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoCodigoSriBanco, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarTipoCodigoSriBanco.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoCodigoSriBanco.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoCodigoSriBanco.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarTipoCodigoSriBanco, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaTipoCodigoSriBanco.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoCodigoSriBanco.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoCodigoSriBanco.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaTipoCodigoSriBanco, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteTipoCodigoSriBanco.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoCodigoSriBanco.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoCodigoSriBanco.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteTipoCodigoSriBanco, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosTipoCodigoSriBanco.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoCodigoSriBanco.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoCodigoSriBanco.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosTipoCodigoSriBanco, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosTipoCodigoSriBanco.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoCodigoSriBanco.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoCodigoSriBanco.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosTipoCodigoSriBanco, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesTipoCodigoSriBanco = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesTipoCodigoSriBanco = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1TipoCodigoSriBanco = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2TipoCodigoSriBanco = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3TipoCodigoSriBanco = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4TipoCodigoSriBanco = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesTipoCodigoSriBanco.setLayout(gridaBagParametrosReportesTipoCodigoSriBanco);
			this.jPanelParametrosReportesAccionesTipoCodigoSriBanco.setLayout(gridaBagParametrosReportesAccionesTipoCodigoSriBanco);
			
			
			this.jPanelParametrosAuxiliar1TipoCodigoSriBanco.setLayout(gridaBagParametrosAuxiliar1TipoCodigoSriBanco);
			this.jPanelParametrosAuxiliar2TipoCodigoSriBanco.setLayout(gridaBagParametrosAuxiliar2TipoCodigoSriBanco);
			this.jPanelParametrosAuxiliar3TipoCodigoSriBanco.setLayout(gridaBagParametrosAuxiliar3TipoCodigoSriBanco);
			this.jPanelParametrosAuxiliar4TipoCodigoSriBanco.setLayout(gridaBagParametrosAuxiliar4TipoCodigoSriBanco);
			//this.jPanelParametrosAuxiliar5TipoCodigoSriBanco.setLayout(gridaBagParametrosAuxiliar2TipoCodigoSriBanco);			
			
			
			
			
			this.gridBagConstraintsTipoCodigoSriBanco = new GridBagConstraints();
			this.gridBagConstraintsTipoCodigoSriBanco.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCodigoSriBanco.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoCodigoSriBanco.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoCodigoSriBanco.add(this.jButtonRecargarInformacionTipoCodigoSriBanco, this.gridBagConstraintsTipoCodigoSriBanco);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsTipoCodigoSriBanco = new GridBagConstraints();
			this.gridBagConstraintsTipoCodigoSriBanco.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCodigoSriBanco.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCodigoSriBanco.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoCodigoSriBanco.add(this.jComboBoxTiposPaginacionTipoCodigoSriBanco, this.gridBagConstraintsTipoCodigoSriBanco);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsTipoCodigoSriBanco = new GridBagConstraints();
			this.gridBagConstraintsTipoCodigoSriBanco.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCodigoSriBanco.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCodigoSriBanco.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoCodigoSriBanco.add(this.jCheckBoxConAltoMaximoTablaTipoCodigoSriBanco, this.gridBagConstraintsTipoCodigoSriBanco);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsTipoCodigoSriBanco = new GridBagConstraints();
			this.gridBagConstraintsTipoCodigoSriBanco.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCodigoSriBanco.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCodigoSriBanco.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoCodigoSriBanco.add(this.jComboBoxTiposArchivosReportesTipoCodigoSriBanco, this.gridBagConstraintsTipoCodigoSriBanco);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsTipoCodigoSriBanco = new GridBagConstraints();
			this.gridBagConstraintsTipoCodigoSriBanco.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCodigoSriBanco.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCodigoSriBanco.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoCodigoSriBanco.add(this.jPanelParametrosAuxiliar1TipoCodigoSriBanco, this.gridBagConstraintsTipoCodigoSriBanco);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsTipoCodigoSriBanco = new GridBagConstraints();
			this.gridBagConstraintsTipoCodigoSriBanco.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCodigoSriBanco.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCodigoSriBanco.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoCodigoSriBanco.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4TipoCodigoSriBanco.add(this.jComboBoxTiposReportesTipoCodigoSriBanco, this.gridBagConstraintsTipoCodigoSriBanco);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsTipoCodigoSriBanco = new GridBagConstraints();
			this.gridBagConstraintsTipoCodigoSriBanco.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCodigoSriBanco.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCodigoSriBanco.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoCodigoSriBanco.add(this.jPanelParametrosAuxiliar4TipoCodigoSriBanco, this.gridBagConstraintsTipoCodigoSriBanco);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsTipoCodigoSriBanco = new GridBagConstraints();
			this.gridBagConstraintsTipoCodigoSriBanco.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCodigoSriBanco.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCodigoSriBanco.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoCodigoSriBanco.add(this.jComboBoxTiposReportesTipoCodigoSriBanco, this.gridBagConstraintsTipoCodigoSriBanco);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsTipoCodigoSriBanco = new GridBagConstraints();
			this.gridBagConstraintsTipoCodigoSriBanco.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCodigoSriBanco.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCodigoSriBanco.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoCodigoSriBanco.add(this.jCheckBoxGenerarReporteTipoCodigoSriBanco, this.gridBagConstraintsTipoCodigoSriBanco);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsTipoCodigoSriBanco = new GridBagConstraints();
			this.gridBagConstraintsTipoCodigoSriBanco.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCodigoSriBanco.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCodigoSriBanco.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoCodigoSriBanco.add(this.jPanelParametrosAuxiliar2TipoCodigoSriBanco, this.gridBagConstraintsTipoCodigoSriBanco);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsTipoCodigoSriBanco = new GridBagConstraints();
			this.gridBagConstraintsTipoCodigoSriBanco.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCodigoSriBanco.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoCodigoSriBanco.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoCodigoSriBanco.add(this.jLabelAccionesTipoCodigoSriBanco, this.gridBagConstraintsTipoCodigoSriBanco);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsTipoCodigoSriBanco = new GridBagConstraints();
				this.gridBagConstraintsTipoCodigoSriBanco.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsTipoCodigoSriBanco.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsTipoCodigoSriBanco.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesTipoCodigoSriBanco.add(this.jButtonAbrirOrderByTipoCodigoSriBanco, this.gridBagConstraintsTipoCodigoSriBanco);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsTipoCodigoSriBanco = new GridBagConstraints();
			this.gridBagConstraintsTipoCodigoSriBanco.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsTipoCodigoSriBanco.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCodigoSriBanco.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoCodigoSriBanco.add(this.jComboBoxTiposSeleccionarTipoCodigoSriBanco, this.gridBagConstraintsTipoCodigoSriBanco);			
			
			
			/*
			this.gridBagConstraintsTipoCodigoSriBanco = new GridBagConstraints();
			this.gridBagConstraintsTipoCodigoSriBanco.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCodigoSriBanco.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoCodigoSriBanco.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoCodigoSriBanco.add(this.jCheckBoxSeleccionarTodosTipoCodigoSriBanco, this.gridBagConstraintsTipoCodigoSriBanco);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsTipoCodigoSriBanco = new GridBagConstraints();
			this.gridBagConstraintsTipoCodigoSriBanco.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCodigoSriBanco.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCodigoSriBanco.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoCodigoSriBanco.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoCodigoSriBanco.add(this.jCheckBoxSeleccionarTodosTipoCodigoSriBanco, this.gridBagConstraintsTipoCodigoSriBanco);															
				
			this.gridBagConstraintsTipoCodigoSriBanco = new GridBagConstraints();
			this.gridBagConstraintsTipoCodigoSriBanco.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCodigoSriBanco.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCodigoSriBanco.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoCodigoSriBanco.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoCodigoSriBanco.add(this.jCheckBoxSeleccionadosTipoCodigoSriBanco, this.gridBagConstraintsTipoCodigoSriBanco);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsTipoCodigoSriBanco = new GridBagConstraints();
			this.gridBagConstraintsTipoCodigoSriBanco.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCodigoSriBanco.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCodigoSriBanco.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoCodigoSriBanco.add(this.jPanelParametrosAuxiliar3TipoCodigoSriBanco, this.gridBagConstraintsTipoCodigoSriBanco);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsTipoCodigoSriBanco = new GridBagConstraints();
			this.gridBagConstraintsTipoCodigoSriBanco.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCodigoSriBanco.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoCodigoSriBanco.add(this.jComboBoxTiposAccionesTipoCodigoSriBanco, this.gridBagConstraintsTipoCodigoSriBanco);
	
				
			this.gridBagConstraintsTipoCodigoSriBanco = new GridBagConstraints();
			this.gridBagConstraintsTipoCodigoSriBanco.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCodigoSriBanco.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoCodigoSriBanco.add(this.jTextFieldValorCampoGeneralTipoCodigoSriBanco, this.gridBagConstraintsTipoCodigoSriBanco);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosTipoCodigoSriBanco = new GridBagLayout();

			this.jScrollPanelDatosTipoCodigoSriBanco.setLayout(gridaBagLayoutDatosTipoCodigoSriBanco);
			
			this.gridBagConstraintsTipoCodigoSriBanco = new GridBagConstraints();
			this.gridBagConstraintsTipoCodigoSriBanco.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCodigoSriBanco.gridy = 0;
			this.gridBagConstraintsTipoCodigoSriBanco.gridx = 0;
			
			this.jScrollPanelDatosTipoCodigoSriBanco.add(this.jTableDatosTipoCodigoSriBanco, this.gridBagConstraintsTipoCodigoSriBanco);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosTipoCodigoSriBanco.setViewportView(this.jTableDatosTipoCodigoSriBanco);
		this.jTableDatosTipoCodigoSriBanco.setFillsViewportHeight(true);
		this.jTableDatosTipoCodigoSriBanco.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesTipoCodigoSriBanco= new GridBagLayout();
		this.jPanelAccionesTipoCodigoSriBanco.setLayout(gridaBagLayoutAccionesTipoCodigoSriBanco);
		
		
		/*	
		this.gridBagConstraintsTipoCodigoSriBanco = new GridBagConstraints();
		this.gridBagConstraintsTipoCodigoSriBanco.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCodigoSriBanco.gridy = 0;
		this.gridBagConstraintsTipoCodigoSriBanco.gridx = 0;
			
		this.jPanelAccionesTipoCodigoSriBanco.add(this.jButtonNuevoTipoCodigoSriBanco, this.gridBagConstraintsTipoCodigoSriBanco);
		*/
		int iPosXAccion=0;
		
						
		
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoCodigoSriBanco = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoCodigoSriBanco);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipocodigosribancoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoCodigoSriBanco = new GridBagConstraints();						
			this.gridBagConstraintsTipoCodigoSriBanco.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoCodigoSriBanco.gridx = 0;		
			//this.gridBagConstraintsTipoCodigoSriBanco.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCodigoSriBanco.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoCodigoSriBanco.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarTipoCodigoSriBanco, this.gridBagConstraintsTipoCodigoSriBanco);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsTipoCodigoSriBanco = new GridBagConstraints();
		this.gridBagConstraintsTipoCodigoSriBanco.gridy = iGridyPrincipal++;
		this.gridBagConstraintsTipoCodigoSriBanco.gridx = 0;		
		//this.gridBagConstraintsTipoCodigoSriBanco.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCodigoSriBanco.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsTipoCodigoSriBanco.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsTipoCodigoSriBanco);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsTipoCodigoSriBanco = new GridBagConstraints();
		this.gridBagConstraintsTipoCodigoSriBanco.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoCodigoSriBanco.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesTipoCodigoSriBanco, this.gridBagConstraintsTipoCodigoSriBanco);								
		
		
		/*
		this.gridBagConstraintsTipoCodigoSriBanco = new GridBagConstraints();
		this.gridBagConstraintsTipoCodigoSriBanco.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoCodigoSriBanco.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesTipoCodigoSriBanco, this.gridBagConstraintsTipoCodigoSriBanco);
		*/		
		
		this.gridBagConstraintsTipoCodigoSriBanco = new GridBagConstraints();
		this.gridBagConstraintsTipoCodigoSriBanco.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoCodigoSriBanco.gridx =0;
		this.gridBagConstraintsTipoCodigoSriBanco.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoCodigoSriBanco.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoCodigoSriBanco, this.gridBagConstraintsTipoCodigoSriBanco);
				
		
		this.gridBagConstraintsTipoCodigoSriBanco = new GridBagConstraints();
		this.gridBagConstraintsTipoCodigoSriBanco.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoCodigoSriBanco.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionTipoCodigoSriBanco, this.gridBagConstraintsTipoCodigoSriBanco);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(TipoCodigoSriBancoJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosTipoCodigoSriBanco= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoCodigoSriBanco = new GridBagLayout();
			this.jPanelBusquedasParametrosTipoCodigoSriBanco.setLayout(gridaBagLayoutBusquedasParametrosTipoCodigoSriBanco);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralTipoCodigoSriBanco=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoCodigoSriBanco.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoCodigoSriBanco.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoCodigoSriBanco.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoCodigoSriBanco = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsTipoCodigoSriBanco = new GridBagConstraints();
		this.gridBagConstraintsTipoCodigoSriBanco.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoCodigoSriBanco.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoCodigoSriBanco, this.gridBagConstraintsTipoCodigoSriBanco);
			
			
		this.gridBagConstraintsTipoCodigoSriBanco = new GridBagConstraints();
		this.gridBagConstraintsTipoCodigoSriBanco.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoCodigoSriBanco.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoCodigoSriBanco, this.gridBagConstraintsTipoCodigoSriBanco);
		
			
		this.gridBagConstraintsTipoCodigoSriBanco = new GridBagConstraints();
		this.gridBagConstraintsTipoCodigoSriBanco.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoCodigoSriBanco.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoCodigoSriBanco, this.gridBagConstraintsTipoCodigoSriBanco);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralTipoCodigoSriBanco;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoTipoCodigoSriBanco() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoTipoCodigoSriBanco = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoTipoCodigoSriBanco = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoTipoCodigoSriBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoTipoCodigoSriBanco.setName("jPanelReporteDinamicoTipoCodigoSriBanco"); 
		
		this.jPanelReporteDinamicoTipoCodigoSriBanco.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoCodigoSriBanco.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoCodigoSriBanco.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoTipoCodigoSriBanco.setLayout(gridaBagLayoutReporteDinamicoTipoCodigoSriBanco);
		
		
		this.jInternalFrameReporteDinamicoTipoCodigoSriBanco= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoTipoCodigoSriBanco = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoCodigoSriBanco= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoTipoCodigoSriBanco.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoTipoCodigoSriBanco.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoTipoCodigoSriBanco.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoTipoCodigoSriBanco.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoTipoCodigoSriBanco.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoTipoCodigoSriBanco.setResizable(true);
	    this.jInternalFrameReporteDinamicoTipoCodigoSriBanco.setClosable(true);
	    this.jInternalFrameReporteDinamicoTipoCodigoSriBanco.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoTipoCodigoSriBanco.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoCodigoSriBanco.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoCodigoSriBanco.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoTipoCodigoSriBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos As"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteTipoCodigoSriBanco = new JLabelMe();

		this.jLabelColumnasSelectReporteTipoCodigoSriBanco.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteTipoCodigoSriBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoCodigoSriBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoCodigoSriBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoCodigoSriBanco = new GridBagConstraints();
		this.gridBagConstraintsTipoCodigoSriBanco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCodigoSriBanco.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoCodigoSriBanco.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoCodigoSriBanco.add(this.jLabelColumnasSelectReporteTipoCodigoSriBanco, this.gridBagConstraintsTipoCodigoSriBanco);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteTipoCodigoSriBanco = new JList<Reporte>();
		this.jListColumnasSelectReporteTipoCodigoSriBanco.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteTipoCodigoSriBanco.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteTipoCodigoSriBanco.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoCodigoSriBanco.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoCodigoSriBanco.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteTipoCodigoSriBanco=new JScrollPane(this.jListColumnasSelectReporteTipoCodigoSriBanco);
			
			this.jScrollColumnasSelectReporteTipoCodigoSriBanco.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoCodigoSriBanco.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoCodigoSriBanco.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteTipoCodigoSriBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTipoCodigoSriBanco = new GridBagConstraints();
		this.gridBagConstraintsTipoCodigoSriBanco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCodigoSriBanco.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoCodigoSriBanco.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoCodigoSriBanco.add(this.jListColumnasSelectReporteTipoCodigoSriBanco, this.gridBagConstraintsTipoCodigoSriBanco);
		this.jPanelReporteDinamicoTipoCodigoSriBanco.add(this.jScrollColumnasSelectReporteTipoCodigoSriBanco, this.gridBagConstraintsTipoCodigoSriBanco);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteTipoCodigoSriBanco = new JLabelMe();

		this.jLabelRelacionesSelectReporteTipoCodigoSriBanco.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteTipoCodigoSriBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoCodigoSriBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoCodigoSriBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteTipoCodigoSriBanco = new JList<Reporte>();
		this.jListRelacionesSelectReporteTipoCodigoSriBanco.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteTipoCodigoSriBanco.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteTipoCodigoSriBanco.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoCodigoSriBanco.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoCodigoSriBanco.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteTipoCodigoSriBanco=new JScrollPane(this.jListRelacionesSelectReporteTipoCodigoSriBanco);
			
			this.jScrollRelacionesSelectReporteTipoCodigoSriBanco.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoCodigoSriBanco.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoCodigoSriBanco.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteTipoCodigoSriBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoTipoCodigoSriBanco = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoTipoCodigoSriBanco = new JComboBoxMe();
		this.jListColumnasValoresGraficoTipoCodigoSriBanco = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoTipoCodigoSriBanco = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoTipoCodigoSriBanco.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoTipoCodigoSriBanco.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoCodigoSriBanco.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoCodigoSriBanco.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoTipoCodigoSriBanco, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoTipoCodigoSriBanco = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoTipoCodigoSriBanco.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoTipoCodigoSriBanco.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoCodigoSriBanco.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoCodigoSriBanco.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoTipoCodigoSriBanco, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoTipoCodigoSriBanco = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoTipoCodigoSriBanco.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoTipoCodigoSriBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoCodigoSriBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoCodigoSriBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoCodigoSriBanco = new GridBagConstraints();
		this.gridBagConstraintsTipoCodigoSriBanco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCodigoSriBanco.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoCodigoSriBanco.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoCodigoSriBanco.add(this.jLabelGenerarExcelReporteDinamicoTipoCodigoSriBanco, this.gridBagConstraintsTipoCodigoSriBanco);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoTipoCodigoSriBanco = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoTipoCodigoSriBanco.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoTipoCodigoSriBanco,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoTipoCodigoSriBanco.setToolTipText("Generar EXCEL"+" "+TipoCodigoSriBancoConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsTipoCodigoSriBanco = new GridBagConstraints();
		//this.gridBagConstraintsTipoCodigoSriBanco.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsTipoCodigoSriBanco.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsTipoCodigoSriBanco.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoTipoCodigoSriBanco.add(this.jButtonGenerarExcelReporteDinamicoTipoCodigoSriBanco, this.gridBagConstraintsTipoCodigoSriBanco);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsTipoCodigoSriBanco = new GridBagConstraints();
		this.gridBagConstraintsTipoCodigoSriBanco.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCodigoSriBanco.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoCodigoSriBanco.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoCodigoSriBanco.add(this.jComboBoxTiposReportesDinamicoTipoCodigoSriBanco, this.gridBagConstraintsTipoCodigoSriBanco);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoTipoCodigoSriBanco = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoTipoCodigoSriBanco.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoTipoCodigoSriBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoCodigoSriBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoCodigoSriBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoCodigoSriBanco = new GridBagConstraints();
		this.gridBagConstraintsTipoCodigoSriBanco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCodigoSriBanco.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoCodigoSriBanco.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoCodigoSriBanco.add(this.jLabelTiposArchivoReporteDinamicoTipoCodigoSriBanco, this.gridBagConstraintsTipoCodigoSriBanco);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsTipoCodigoSriBanco = new GridBagConstraints();
		this.gridBagConstraintsTipoCodigoSriBanco.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCodigoSriBanco.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoCodigoSriBanco.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoCodigoSriBanco.add(this.jComboBoxTiposArchivosReportesDinamicoTipoCodigoSriBanco, this.gridBagConstraintsTipoCodigoSriBanco);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoTipoCodigoSriBanco = new JButtonMe();
		this.jButtonGenerarReporteDinamicoTipoCodigoSriBanco.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoTipoCodigoSriBanco,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoTipoCodigoSriBanco.setToolTipText("Generar"+" "+TipoCodigoSriBancoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsTipoCodigoSriBanco = new GridBagConstraints();
		this.gridBagConstraintsTipoCodigoSriBanco.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCodigoSriBanco.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoCodigoSriBanco.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoCodigoSriBanco.add(this.jButtonGenerarReporteDinamicoTipoCodigoSriBanco, this.gridBagConstraintsTipoCodigoSriBanco);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoTipoCodigoSriBanco = new JButtonMe();
		this.jButtonCerrarReporteDinamicoTipoCodigoSriBanco.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoTipoCodigoSriBanco,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoTipoCodigoSriBanco.setToolTipText("Cancelar"+" "+TipoCodigoSriBancoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoCodigoSriBanco = new GridBagConstraints();
		this.gridBagConstraintsTipoCodigoSriBanco.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCodigoSriBanco.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoCodigoSriBanco.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoCodigoSriBanco.add(this.jButtonCerrarReporteDinamicoTipoCodigoSriBanco, this.gridBagConstraintsTipoCodigoSriBanco);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalTipoCodigoSriBanco = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoTipoCodigoSriBanco= new JScrollPane(jPanelReporteDinamicoTipoCodigoSriBanco,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoTipoCodigoSriBanco.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoCodigoSriBanco.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoCodigoSriBanco.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoTipoCodigoSriBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos As"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoCodigoSriBanco = new GridBagConstraints();
		this.gridBagConstraintsTipoCodigoSriBanco.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsTipoCodigoSriBanco.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsTipoCodigoSriBanco.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoTipoCodigoSriBanco.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoTipoCodigoSriBanco.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalTipoCodigoSriBanco);
		this.jInternalFrameReporteDinamicoTipoCodigoSriBanco.getContentPane().add(this.jScrollPanelReporteDinamicoTipoCodigoSriBanco, this.gridBagConstraintsTipoCodigoSriBanco);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionTipoCodigoSriBanco() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionTipoCodigoSriBanco = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionTipoCodigoSriBanco = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionTipoCodigoSriBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionTipoCodigoSriBanco.setName("jPanelImportacionTipoCodigoSriBanco"); 
		
		this.jPanelImportacionTipoCodigoSriBanco.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoCodigoSriBanco.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoCodigoSriBanco.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionTipoCodigoSriBanco.setLayout(gridaBagLayoutImportacionTipoCodigoSriBanco);
		
		
		this.jInternalFrameImportacionTipoCodigoSriBanco= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionTipoCodigoSriBanco= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionTipoCodigoSriBanco = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoCodigoSriBanco= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionTipoCodigoSriBanco.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoCodigoSriBanco.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoCodigoSriBanco.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionTipoCodigoSriBanco.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoCodigoSriBanco.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoCodigoSriBanco.setResizable(true);
	    this.jInternalFrameImportacionTipoCodigoSriBanco.setClosable(true);
	    this.jInternalFrameImportacionTipoCodigoSriBanco.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionTipoCodigoSriBanco.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoCodigoSriBanco.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoCodigoSriBanco.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionTipoCodigoSriBanco.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoCodigoSriBanco.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoCodigoSriBanco.setResizable(true);
	    this.jInternalFrameImportacionTipoCodigoSriBanco.setClosable(true);
	    this.jInternalFrameImportacionTipoCodigoSriBanco.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionTipoCodigoSriBanco.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoCodigoSriBanco.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoCodigoSriBanco.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionTipoCodigoSriBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos As"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionTipoCodigoSriBanco = new JLabelMe();

		this.jLabelArchivoImportacionTipoCodigoSriBanco.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionTipoCodigoSriBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoCodigoSriBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoCodigoSriBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoCodigoSriBanco = new GridBagConstraints();
		this.gridBagConstraintsTipoCodigoSriBanco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCodigoSriBanco.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoCodigoSriBanco.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoCodigoSriBanco.add(this.jLabelArchivoImportacionTipoCodigoSriBanco, this.gridBagConstraintsTipoCodigoSriBanco);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionTipoCodigoSriBanco = new JFileChooser();		
		this.jFileChooserImportacionTipoCodigoSriBanco.setToolTipText("ESCOGER ARCHIVO"+" "+TipoCodigoSriBancoConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionTipoCodigoSriBanco = new JButtonMe();
		this.jButtonAbrirImportacionTipoCodigoSriBanco.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionTipoCodigoSriBanco,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionTipoCodigoSriBanco.setToolTipText("Generar"+" "+TipoCodigoSriBancoConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsTipoCodigoSriBanco = new GridBagConstraints();
		this.gridBagConstraintsTipoCodigoSriBanco.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCodigoSriBanco.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoCodigoSriBanco.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoCodigoSriBanco.add(this.jButtonAbrirImportacionTipoCodigoSriBanco, this.gridBagConstraintsTipoCodigoSriBanco);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionTipoCodigoSriBanco = new JLabelMe();

		this.jLabelPathArchivoImportacionTipoCodigoSriBanco.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionTipoCodigoSriBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoCodigoSriBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoCodigoSriBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoCodigoSriBanco = new GridBagConstraints();
		this.gridBagConstraintsTipoCodigoSriBanco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCodigoSriBanco.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoCodigoSriBanco.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoCodigoSriBanco.add(this.jLabelPathArchivoImportacionTipoCodigoSriBanco, this.gridBagConstraintsTipoCodigoSriBanco);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionTipoCodigoSriBanco=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionTipoCodigoSriBanco.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoCodigoSriBanco.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoCodigoSriBanco.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsTipoCodigoSriBanco = new GridBagConstraints();
		this.gridBagConstraintsTipoCodigoSriBanco.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCodigoSriBanco.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoCodigoSriBanco.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoCodigoSriBanco.add(this.jTextFieldPathArchivoImportacionTipoCodigoSriBanco, this.gridBagConstraintsTipoCodigoSriBanco);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionTipoCodigoSriBanco = new JButtonMe();
		this.jButtonGenerarImportacionTipoCodigoSriBanco.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionTipoCodigoSriBanco,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionTipoCodigoSriBanco.setToolTipText("Generar"+" "+TipoCodigoSriBancoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsTipoCodigoSriBanco = new GridBagConstraints();
		this.gridBagConstraintsTipoCodigoSriBanco.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCodigoSriBanco.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoCodigoSriBanco.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoCodigoSriBanco.add(this.jButtonGenerarImportacionTipoCodigoSriBanco, this.gridBagConstraintsTipoCodigoSriBanco);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionTipoCodigoSriBanco = new JButtonMe();
		this.jButtonCerrarImportacionTipoCodigoSriBanco.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionTipoCodigoSriBanco,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionTipoCodigoSriBanco.setToolTipText("Cancelar"+" "+TipoCodigoSriBancoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoCodigoSriBanco = new GridBagConstraints();
		this.gridBagConstraintsTipoCodigoSriBanco.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCodigoSriBanco.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoCodigoSriBanco.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoCodigoSriBanco.add(this.jButtonCerrarImportacionTipoCodigoSriBanco, this.gridBagConstraintsTipoCodigoSriBanco);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalTipoCodigoSriBanco = new GridBagLayout();
		
		this.jScrollPanelImportacionTipoCodigoSriBanco= new JScrollPane(jPanelImportacionTipoCodigoSriBanco,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsTipoCodigoSriBanco = new GridBagConstraints();
		this.gridBagConstraintsTipoCodigoSriBanco.gridy =iPosYImportacion;
		this.gridBagConstraintsTipoCodigoSriBanco.gridx =iPosXImportacion;
		this.gridBagConstraintsTipoCodigoSriBanco.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionTipoCodigoSriBanco.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionTipoCodigoSriBanco.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalTipoCodigoSriBanco);
		this.jInternalFrameImportacionTipoCodigoSriBanco.getContentPane().add(this.jScrollPanelImportacionTipoCodigoSriBanco, this.gridBagConstraintsTipoCodigoSriBanco);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByTipoCodigoSriBanco(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByTipoCodigoSriBanco = new JButtonMe();
			this.jButtonAbrirOrderByTipoCodigoSriBanco.setText("Orden");
			this.jButtonAbrirOrderByTipoCodigoSriBanco.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoCodigoSriBanco,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoCodigoSriBanco, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByTipoCodigoSriBanco";
			inputMap = this.jButtonAbrirOrderByTipoCodigoSriBanco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByTipoCodigoSriBanco.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByTipoCodigoSriBanco"));
		
		
			GridBagLayout gridaBagLayoutOrderByTipoCodigoSriBanco = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByTipoCodigoSriBanco = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByTipoCodigoSriBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByTipoCodigoSriBanco.setName("jPanelOrderByTipoCodigoSriBanco"); 
			
			this.jPanelOrderByTipoCodigoSriBanco.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoCodigoSriBanco.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoCodigoSriBanco.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByTipoCodigoSriBanco, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByTipoCodigoSriBanco.setLayout(gridaBagLayoutOrderByTipoCodigoSriBanco);
			
			
			this.jTableDatosTipoCodigoSriBancoOrderBy = new JTableMe();        
			this.jTableDatosTipoCodigoSriBancoOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosTipoCodigoSriBancoOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosTipoCodigoSriBancoOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosTipoCodigoSriBancoOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosTipoCodigoSriBancoOrderBy.setViewportView(this.jTableDatosTipoCodigoSriBancoOrderBy);
			this.jTableDatosTipoCodigoSriBancoOrderBy.setFillsViewportHeight(true);
			this.jTableDatosTipoCodigoSriBancoOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByTipoCodigoSriBanco= new OrderByJInternalFrame();
			this.jInternalFrameOrderByTipoCodigoSriBanco= new OrderByJInternalFrame();
			this.jScrollPanelOrderByTipoCodigoSriBanco = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteTipoCodigoSriBanco= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByTipoCodigoSriBanco.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByTipoCodigoSriBanco.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByTipoCodigoSriBanco.setTitle("Orden");
			this.jInternalFrameOrderByTipoCodigoSriBanco.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByTipoCodigoSriBanco.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByTipoCodigoSriBanco.setResizable(true);
			this.jInternalFrameOrderByTipoCodigoSriBanco.setClosable(true);
			this.jInternalFrameOrderByTipoCodigoSriBanco.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByTipoCodigoSriBanco, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByTipoCodigoSriBanco.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoCodigoSriBanco.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoCodigoSriBanco.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByTipoCodigoSriBanco, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByTipoCodigoSriBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos As"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsTipoCodigoSriBanco = new GridBagConstraints();
			this.gridBagConstraintsTipoCodigoSriBanco.gridy =iPosYOrderBy++;
			this.gridBagConstraintsTipoCodigoSriBanco.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoCodigoSriBanco.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsTipoCodigoSriBanco.ipady =150;
				
			this.jPanelOrderByTipoCodigoSriBanco.add(jScrollPanelDatosTipoCodigoSriBancoOrderBy, this.gridBagConstraintsTipoCodigoSriBanco);//this.jTableDatosTipoCodigoSriBancoTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByTipoCodigoSriBanco = new JButtonMe();
			this.jButtonCerrarOrderByTipoCodigoSriBanco.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByTipoCodigoSriBanco,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByTipoCodigoSriBanco.setToolTipText("Cancelar"+" "+TipoCodigoSriBancoConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByTipoCodigoSriBanco, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsTipoCodigoSriBanco = new GridBagConstraints();
			this.gridBagConstraintsTipoCodigoSriBanco.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCodigoSriBanco.gridy = iPosYOrderBy++;
			this.gridBagConstraintsTipoCodigoSriBanco.gridx = iPosXOrderBy;
									
			this.jPanelOrderByTipoCodigoSriBanco.add(this.jButtonCerrarOrderByTipoCodigoSriBanco, this.gridBagConstraintsTipoCodigoSriBanco);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalTipoCodigoSriBanco = new GridBagLayout();
			
			this.jScrollPanelOrderByTipoCodigoSriBanco= new JScrollPane(jPanelOrderByTipoCodigoSriBanco,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsTipoCodigoSriBanco = new GridBagConstraints();
			this.gridBagConstraintsTipoCodigoSriBanco.gridy =iPosYOrderBy;
			this.gridBagConstraintsTipoCodigoSriBanco.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoCodigoSriBanco.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByTipoCodigoSriBanco.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByTipoCodigoSriBanco.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalTipoCodigoSriBanco);
			
			this.jInternalFrameOrderByTipoCodigoSriBanco.getContentPane().add(this.jScrollPanelOrderByTipoCodigoSriBanco, this.gridBagConstraintsTipoCodigoSriBanco);			
		
		} else {
			this.jButtonAbrirOrderByTipoCodigoSriBanco = new JButtonMe();
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
			&& this.tipocodigosribancoSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosTipoCodigoSriBanco.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosTipoCodigoSriBanco.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosTipoCodigoSriBanco.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosTipoCodigoSriBanco.getRowHeight();//TipoCodigoSriBancoConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.tipocodigosribancoSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > TipoCodigoSriBancoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoCodigoSriBanco.isSelected()) {
					iHeightTable=TipoCodigoSriBancoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoCodigoSriBancoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoCodigoSriBancoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > TipoCodigoSriBancoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoCodigoSriBanco.isSelected()) {
					iHeightTable=TipoCodigoSriBancoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoCodigoSriBancoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoCodigoSriBancoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosTipoCodigoSriBanco.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoCodigoSriBanco.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoCodigoSriBanco.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosTipoCodigoSriBanco.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoCodigoSriBanco.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoCodigoSriBanco.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByTipoCodigoSriBanco!=null && this.jInternalFrameOrderByTipoCodigoSriBanco.getjTableDatosOrderBy()!=null) {
			//if(!this.tipocodigosribancoSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByTipoCodigoSriBanco.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByTipoCodigoSriBanco.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByTipoCodigoSriBanco.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByTipoCodigoSriBanco.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByTipoCodigoSriBanco.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByTipoCodigoSriBanco.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByTipoCodigoSriBanco.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosTipoCodigoSriBanco.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoCodigoSriBanco.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoCodigoSriBanco.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=tipocodigosribancoLogic.getTipoCodigoSriBancos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipocodigosribancos.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<TipoCodigoSriBanco> TraerTipoCodigoSriBancoBeans(List<TipoCodigoSriBanco> tipocodigosribancos,ArrayList<Classe> classes)throws Exception {
		try {
			for(TipoCodigoSriBanco tipocodigosribanco:tipocodigosribancos) {
					
				if(!(TipoCodigoSriBancoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || TipoCodigoSriBancoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					tipocodigosribanco.setsDetalleGeneralEntityReporte(TipoCodigoSriBancoConstantesFunciones.getTipoCodigoSriBancoDescripcion(tipocodigosribanco));
										
						
					
						
					
				} else  {
							
					//tipocodigosribanco.setsDetalleGeneralEntityReporte(tipocodigosribanco.getsDetalleGeneralEntityReporte());
										
				}
				
				//tipocodigosribancobeans.add(tipocodigosribancobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return tipocodigosribancos;
    }
	//PARA REPORTES FIN
}
