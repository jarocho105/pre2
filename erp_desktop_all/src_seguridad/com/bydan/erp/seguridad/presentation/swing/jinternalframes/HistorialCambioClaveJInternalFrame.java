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
package com.bydan.erp.seguridad.presentation.swing.jinternalframes;



import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;





//import com.bydan.erp.seguridad.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.seguridad.util.HistorialCambioClaveConstantesFunciones;

import com.bydan.erp.seguridad.business.logic.*;
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
public class HistorialCambioClaveJInternalFrame extends HistorialCambioClaveBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarHistorialCambioClave;
	
	protected JMenuBar jmenuBarHistorialCambioClave;
	
	protected JMenu jmenuHistorialCambioClave;
	protected JMenu jmenuDatosHistorialCambioClave;
	protected JMenu jmenuArchivoHistorialCambioClave;
	protected JMenu jmenuAccionesHistorialCambioClave;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosHistorialCambioClave = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutHistorialCambioClave;	
	protected GridBagConstraints gridBagConstraintsHistorialCambioClave;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public HistorialCambioClaveDetalleFormJInternalFrame jInternalFrameDetalleFormHistorialCambioClave;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoHistorialCambioClave;	
	protected ImportacionJInternalFrame jInternalFrameImportacionHistorialCambioClave;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected UsuarioBeanSwingJInternalFrame usuarioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_usuario="";
	
	public HistorialCambioClaveSessionBean historialcambioclaveSessionBean;
		
	
	
	public UsuarioSessionBean usuarioSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<HistorialCambioClave> historialcambioclaves;		
	public List<HistorialCambioClave> historialcambioclavesEliminados;	
	public List<HistorialCambioClave> historialcambioclavesAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByHistorialCambioClave;		
	protected JButton jButtonAbrirOrderByHistorialCambioClave;
	
	
	//protected JPanel jPanelOrderByHistorialCambioClave;
	//public JScrollPane jScrollPanelOrderByHistorialCambioClave;	
	//protected JButton jButtonCerrarOrderByHistorialCambioClave;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public HistorialCambioClaveLogic historialcambioclaveLogic;
	
	
	
	public JScrollPane jScrollPanelDatosHistorialCambioClave;
	public JScrollPane jScrollPanelDatosEdicionHistorialCambioClave;
	public JScrollPane jScrollPanelDatosGeneralHistorialCambioClave;
    
	
	
	//public JScrollPane jScrollPanelDatosHistorialCambioClaveOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoHistorialCambioClave;
	//public JScrollPane jScrollPanelImportacionHistorialCambioClave;
	
	
	
	protected JPanel jPanelAccionesHistorialCambioClave;
	
    protected JPanel jPanelPaginacionHistorialCambioClave;
    protected JPanel jPanelParametrosReportesHistorialCambioClave;
	protected JPanel jPanelParametrosReportesAccionesHistorialCambioClave;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1HistorialCambioClave;
	protected JPanel jPanelParametrosAuxiliar2HistorialCambioClave;
	protected JPanel jPanelParametrosAuxiliar3HistorialCambioClave;
	protected JPanel jPanelParametrosAuxiliar4HistorialCambioClave;
	//protected JPanel jPanelParametrosAuxiliar5HistorialCambioClave;
	
	
	
	//protected JPanel jPanelReporteDinamicoHistorialCambioClave;
	//protected JPanel jPanelImportacionHistorialCambioClave;
	
	
	public JTable jTableDatosHistorialCambioClave;
	
	
	
	//public JTable jTableDatosHistorialCambioClaveOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoHistorialCambioClave;
	protected JButton jButtonDuplicarHistorialCambioClave;
	protected JButton jButtonCopiarHistorialCambioClave;
	protected JButton jButtonVerFormHistorialCambioClave;
	protected JButton jButtonNuevoRelacionesHistorialCambioClave;
	protected JButton jButtonModificarHistorialCambioClave;
	
    protected JButton jButtonGuardarCambiosTablaHistorialCambioClave;
	protected JButton jButtonCerrarHistorialCambioClave;
	
	
	protected JButton jButtonRecargarInformacionHistorialCambioClave;
	protected JButton jButtonProcesarInformacionHistorialCambioClave;
	
	
	protected JButton jButtonAnterioresHistorialCambioClave;
	protected JButton jButtonSiguientesHistorialCambioClave;
	protected JButton jButtonNuevoGuardarCambiosHistorialCambioClave;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoHistorialCambioClave;
	//protected JButton jButtonCerrarReporteDinamicoHistorialCambioClave;
	//protected JButton jButtonGenerarExcelReporteDinamicoHistorialCambioClave;	
	
	
	
	//protected JButton jButtonAbrirImportacionHistorialCambioClave;
	//protected JButton jButtonGenerarImportacionHistorialCambioClave;
	//protected JButton jButtonCerrarImportacionHistorialCambioClave;
	//protected JFileChooser jFileChooserImportacionHistorialCambioClave;
	//protected File fileImportacionHistorialCambioClave;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarHistorialCambioClave;
	protected JButton jButtonDuplicarToolBarHistorialCambioClave;
	protected JButton jButtonNuevoRelacionesToolBarHistorialCambioClave;
	
	
	public JButton jButtonGuardarCambiosToolBarHistorialCambioClave;
	protected JButton jButtonCopiarToolBarHistorialCambioClave;
	protected JButton jButtonVerFormToolBarHistorialCambioClave;
	public JButton jButtonGuardarCambiosTablaToolBarHistorialCambioClave;
	protected JButton jButtonMostrarOcultarTablaToolBarHistorialCambioClave;
	protected JButton jButtonCerrarToolBarHistorialCambioClave;
	
	protected JButton jButtonRecargarInformacionToolBarHistorialCambioClave;
	protected JButton jButtonProcesarInformacionToolBarHistorialCambioClave;
	protected JButton jButtonAnterioresToolBarHistorialCambioClave;
	protected JButton jButtonSiguientesToolBarHistorialCambioClave;
	protected JButton jButtonNuevoGuardarCambiosToolBarHistorialCambioClave;
	protected JButton jButtonAbrirOrderByToolBarHistorialCambioClave;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoHistorialCambioClave;
	protected JMenuItem jMenuItemDuplicarHistorialCambioClave;
	protected JMenuItem jMenuItemNuevoRelacionesHistorialCambioClave;
	
	
	protected JMenuItem jMenuItemGuardarCambiosHistorialCambioClave;
	protected JMenuItem jMenuItemCopiarHistorialCambioClave;
	protected JMenuItem jMenuItemVerFormHistorialCambioClave;
	protected JMenuItem jMenuItemGuardarCambiosTablaHistorialCambioClave;
	protected JMenuItem jMenuItemCerrarHistorialCambioClave;
	protected JMenuItem jMenuItemDetalleCerrarHistorialCambioClave;
	protected JMenuItem jMenuItemDetalleAbrirOrderByHistorialCambioClave;
	protected JMenuItem jMenuItemDetalleMostarOcultarHistorialCambioClave;
	
	protected JMenuItem jMenuItemRecargarInformacionHistorialCambioClave;
	protected JMenuItem jMenuItemProcesarInformacionHistorialCambioClave;
	protected JMenuItem jMenuItemAnterioresHistorialCambioClave;
	protected JMenuItem jMenuItemSiguientesHistorialCambioClave;
	protected JMenuItem jMenuItemNuevoGuardarCambiosHistorialCambioClave;
	protected JMenuItem jMenuItemAbrirOrderByHistorialCambioClave;
	protected JMenuItem jMenuItemMostrarOcultarHistorialCambioClave;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesHistorialCambioClave;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosHistorialCambioClave;
	protected JCheckBox jCheckBoxSeleccionadosHistorialCambioClave;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaHistorialCambioClave;
	protected JCheckBox jCheckBoxConGraficoReporteHistorialCambioClave;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesHistorialCambioClave;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesHistorialCambioClave;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoHistorialCambioClave;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoHistorialCambioClave;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesHistorialCambioClave;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionHistorialCambioClave;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesHistorialCambioClave;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesHistorialCambioClave;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarHistorialCambioClave;
	protected JTextField jTextFieldValorCampoGeneralHistorialCambioClave;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteHistorialCambioClave;
	//public JList<Reporte> jListColumnasSelectReporteHistorialCambioClave;
	//public JScrollPane jScrollColumnasSelectReporteHistorialCambioClave;
	
	//public JLabel jLabelRelacionesSelectReporteHistorialCambioClave;
	//public JList<Reporte> jListRelacionesSelectReporteHistorialCambioClave;
	//public JScrollPane jScrollRelacionesSelectReporteHistorialCambioClave;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoHistorialCambioClave;
	//protected JCheckBox jCheckBoxConGraficoDinamicoHistorialCambioClave;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoHistorialCambioClave;
	//public JLabel jLabelTiposArchivoReporteDinamicoHistorialCambioClave;
	
		
	//public JLabel jLabelArchivoImportacionHistorialCambioClave;	
	//public JLabel jLabelPathArchivoImportacionHistorialCambioClave;
	//protected JTextField jTextFieldPathArchivoImportacionHistorialCambioClave;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoHistorialCambioClave;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoHistorialCambioClave;
	
	//public JLabel jLabelColumnaCategoriaValorHistorialCambioClave;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorHistorialCambioClave;
	
	//public JLabel jLabelColumnasValoresGraficoHistorialCambioClave;
	//public JList<Reporte> jListColumnasValoresGraficoHistorialCambioClave;
	//public JScrollPane jScrollColumnasValoresGraficoHistorialCambioClave;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoHistorialCambioClave;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoHistorialCambioClave;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasHistorialCambioClave;
	public JPanel jPanelBusquedaPorIdUsuarioPorFechaHoraHistorialCambioClave;
	public JButton jButtonBusquedaPorIdUsuarioPorFechaHoraHistorialCambioClave;
	
	public JPanel jPanelid_usuarioBusquedaPorIdUsuarioPorFechaHoraHistorialCambioClave;
	public JLabel jLabelid_usuarioBusquedaPorIdUsuarioPorFechaHoraHistorialCambioClave;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_usuarioBusquedaPorIdUsuarioPorFechaHoraHistorialCambioClave;
	public JButton jButtonid_usuarioBusquedaPorIdUsuarioPorFechaHoraHistorialCambioClave= new JButtonMe();
	public JButton jButtonid_usuarioBusquedaPorIdUsuarioPorFechaHoraHistorialCambioClaveUpdate= new JButtonMe();
	public JButton jButtonid_usuarioBusquedaPorIdUsuarioPorFechaHoraHistorialCambioClaveBusqueda= new JButtonMe();

	
	public JPanel jPanelfecha_horaBusquedaPorIdUsuarioPorFechaHoraHistorialCambioClave;
	public JLabel jLabelfecha_horaBusquedaPorIdUsuarioPorFechaHoraHistorialCambioClave;
	//public JFormattedTextField jDateChooserfecha_horaBusquedaPorIdUsuarioPorFechaHoraHistorialCambioClave;

	public JPanelDateTimeMe jDateChooserfecha_horaBusquedaPorIdUsuarioPorFechaHoraHistorialCambioClave;
	public JButton jButtonfecha_horaBusquedaPorIdUsuarioPorFechaHoraHistorialCambioClaveBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=462;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public HistorialCambioClaveJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("HistorialCambioClave No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public HistorialCambioClaveJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("HistorialCambioClave No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public HistorialCambioClaveJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("HistorialCambioClave No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public HistorialCambioClaveJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("HistorialCambioClave No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionHistorialCambioClave)	{
		this.jButtonRecargarInformacionHistorialCambioClave = jButtonRecargarInformacionHistorialCambioClave;
	}
	
	public JButton getjButtonProcesarInformacionHistorialCambioClave() {
		return this.jButtonProcesarInformacionHistorialCambioClave;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionHistorialCambioClave)	{
		this.jButtonProcesarInformacionHistorialCambioClave = jButtonProcesarInformacionHistorialCambioClave;
	}
	
	
	public JButton getjButtonRecargarInformacionHistorialCambioClave() {
		return this.jButtonRecargarInformacionHistorialCambioClave;
	}
	
	
	public List<HistorialCambioClave> gethistorialcambioclaves() {
		return this.historialcambioclaves;
	}

	public void sethistorialcambioclaves(List<HistorialCambioClave> historialcambioclaves) {
		this.historialcambioclaves = historialcambioclaves;
	}
	
	public List<HistorialCambioClave> gethistorialcambioclavesAux() {
		return this.historialcambioclavesAux;
	}

	public void sethistorialcambioclavesAux(List<HistorialCambioClave> historialcambioclavesAux) {
		this.historialcambioclavesAux = historialcambioclavesAux;
	}
	
	public List<HistorialCambioClave> gethistorialcambioclavesEliminados() {
		return this.historialcambioclavesEliminados;
	}

	public void setHistorialCambioClavesEliminados(List<HistorialCambioClave> historialcambioclavesEliminados) {
		this.historialcambioclavesEliminados = historialcambioclavesEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarHistorialCambioClave() {
		return jComboBoxTiposSeleccionarHistorialCambioClave;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarHistorialCambioClave(
			JComboBox jComboBoxTiposSeleccionarHistorialCambioClave) {
		this.jComboBoxTiposSeleccionarHistorialCambioClave = jComboBoxTiposSeleccionarHistorialCambioClave;
	}
	
	public void setBorderResaltarTiposSeleccionarHistorialCambioClave() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarHistorialCambioClave.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarHistorialCambioClave .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralHistorialCambioClave() {
		return jTextFieldValorCampoGeneralHistorialCambioClave;
	}

	public void setjTextFieldValorCampoGeneralHistorialCambioClave(
			JTextField jTextFieldValorCampoGeneralHistorialCambioClave) {
		this.jTextFieldValorCampoGeneralHistorialCambioClave = jTextFieldValorCampoGeneralHistorialCambioClave;
	}

	public void setBorderResaltarValorCampoGeneralHistorialCambioClave() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarHistorialCambioClave.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralHistorialCambioClave .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosHistorialCambioClave() {
		return this.jCheckBoxSeleccionarTodosHistorialCambioClave;
	}

	public void setjCheckBoxSeleccionarTodosHistorialCambioClave(
			JCheckBox jCheckBoxSeleccionarTodosHistorialCambioClave) {
		this.jCheckBoxSeleccionarTodosHistorialCambioClave = jCheckBoxSeleccionarTodosHistorialCambioClave;
	}

	public void setBorderResaltarSeleccionarTodosHistorialCambioClave() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarHistorialCambioClave.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosHistorialCambioClave .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosHistorialCambioClave() {
		return this.jCheckBoxSeleccionadosHistorialCambioClave;
	}

	public void setjCheckBoxSeleccionadosHistorialCambioClave(
			JCheckBox jCheckBoxSeleccionadosHistorialCambioClave) {
		this.jCheckBoxSeleccionadosHistorialCambioClave = jCheckBoxSeleccionadosHistorialCambioClave;
	}
	
	public void setBorderResaltarSeleccionadosHistorialCambioClave() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarHistorialCambioClave.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosHistorialCambioClave .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesHistorialCambioClave() {
		return this.jComboBoxTiposArchivosReportesHistorialCambioClave;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesHistorialCambioClave(
			JComboBox jComboBoxTiposArchivosReportesHistorialCambioClave) {
		this.jComboBoxTiposArchivosReportesHistorialCambioClave = jComboBoxTiposArchivosReportesHistorialCambioClave;
	}

	public void setBorderResaltarTiposArchivosReportesHistorialCambioClave() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarHistorialCambioClave.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesHistorialCambioClave .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesHistorialCambioClave() {
		return this.jComboBoxTiposReportesHistorialCambioClave;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesHistorialCambioClave(
			JComboBox jComboBoxTiposReportesHistorialCambioClave) {
		this.jComboBoxTiposReportesHistorialCambioClave = jComboBoxTiposReportesHistorialCambioClave;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoHistorialCambioClave() {
	//	return jComboBoxTiposReportesDinamicoHistorialCambioClave;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoHistorialCambioClave(
	//		JComboBox jComboBoxTiposReportesDinamicoHistorialCambioClave) {
	//	this.jComboBoxTiposReportesDinamicoHistorialCambioClave = jComboBoxTiposReportesDinamicoHistorialCambioClave;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoHistorialCambioClave() {
	//	return jComboBoxTiposArchivosReportesDinamicoHistorialCambioClave;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoHistorialCambioClave(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoHistorialCambioClave) {
	//	this.jComboBoxTiposArchivosReportesDinamicoHistorialCambioClave = jComboBoxTiposArchivosReportesDinamicoHistorialCambioClave;
	//}
	
	public void setBorderResaltarTiposReportesHistorialCambioClave() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarHistorialCambioClave.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesHistorialCambioClave .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesHistorialCambioClave() {
		return this.jComboBoxTiposGraficosReportesHistorialCambioClave;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesHistorialCambioClave(
			JComboBox jComboBoxTiposGraficosReportesHistorialCambioClave) {
		this.jComboBoxTiposGraficosReportesHistorialCambioClave = jComboBoxTiposGraficosReportesHistorialCambioClave;
	}
	
	public void setBorderResaltarTiposGraficosReportesHistorialCambioClave() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarHistorialCambioClave.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesHistorialCambioClave .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionHistorialCambioClave() {
		return this.jComboBoxTiposPaginacionHistorialCambioClave;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionHistorialCambioClave(
			JComboBox jComboBoxTiposPaginacionHistorialCambioClave) {
		this.jComboBoxTiposPaginacionHistorialCambioClave = jComboBoxTiposPaginacionHistorialCambioClave;
	}
	
	public void setBorderResaltarTiposPaginacionHistorialCambioClave() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarHistorialCambioClave.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionHistorialCambioClave .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesHistorialCambioClave() {
		return this.jComboBoxTiposRelacionesHistorialCambioClave;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesHistorialCambioClave() {
		return this.jComboBoxTiposAccionesHistorialCambioClave;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesHistorialCambioClave(
			JComboBox jComboBoxTiposRelacionesHistorialCambioClave) {
		this.jComboBoxTiposRelacionesHistorialCambioClave = jComboBoxTiposRelacionesHistorialCambioClave;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesHistorialCambioClave(
			JComboBox jComboBoxTiposAccionesHistorialCambioClave) {
		this.jComboBoxTiposAccionesHistorialCambioClave = jComboBoxTiposAccionesHistorialCambioClave;
	}
	
	public void setBorderResaltarTiposRelacionesHistorialCambioClave() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarHistorialCambioClave.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesHistorialCambioClave .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesHistorialCambioClave() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarHistorialCambioClave.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesHistorialCambioClave .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoHistorialCambioClave() {
	//	return jCheckBoxConGraficoDinamicoHistorialCambioClave;
	//}

	//public void setjCheckBoxConGraficoDinamicoHistorialCambioClave(
	//		JCheckBox jCheckBoxConGraficoDinamicoHistorialCambioClave) {
	//	this.jCheckBoxConGraficoDinamicoHistorialCambioClave = jCheckBoxConGraficoDinamicoHistorialCambioClave;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoHistorialCambioClave() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarHistorialCambioClave.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoHistorialCambioClave .setBorder(borderResaltar);		
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
		this.historialcambioclaveSessionBean=new HistorialCambioClaveSessionBean();
		
		this.historialcambioclaveSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.historialcambioclaveSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.historialcambioclaveSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=HistorialCambioClaveJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=HistorialCambioClaveJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		HistorialCambioClaveJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		HistorialCambioClaveJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		HistorialCambioClaveJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Historial Cambio Clave MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.historialcambioclaveSessionBean.getEsGuardarRelacionado()) {
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
		
		HistorialCambioClaveJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("HistorialCambioClave No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarHistorialCambioClave= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarHistorialCambioClave=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarHistorialCambioClave,this.jTtoolBarHistorialCambioClave,
							"nuevo","nuevo","Nuevo"+" "+HistorialCambioClaveConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarHistorialCambioClave=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarHistorialCambioClave,this.jTtoolBarHistorialCambioClave,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarHistorialCambioClave=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarHistorialCambioClave,this.jTtoolBarHistorialCambioClave,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+HistorialCambioClaveConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarHistorialCambioClave=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarHistorialCambioClave,this.jTtoolBarHistorialCambioClave,
							"duplicar","duplicar","Duplicar"+" "+HistorialCambioClaveConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarHistorialCambioClave=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarHistorialCambioClave,this.jTtoolBarHistorialCambioClave,
							"copiar","copiar","Copiar"+" "+HistorialCambioClaveConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarHistorialCambioClave=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarHistorialCambioClave,this.jTtoolBarHistorialCambioClave,
							"ver_form","ver_form","Ver"+" "+HistorialCambioClaveConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarHistorialCambioClave=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarHistorialCambioClave,this.jTtoolBarHistorialCambioClave,
							"recargar","recargar","Recargar"+" "+HistorialCambioClaveConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarHistorialCambioClave=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarHistorialCambioClave,this.jTtoolBarHistorialCambioClave,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarHistorialCambioClave=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarHistorialCambioClave,this.jTtoolBarHistorialCambioClave,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarHistorialCambioClave=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarHistorialCambioClave,this.jTtoolBarHistorialCambioClave,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarHistorialCambioClave=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarHistorialCambioClave,this.jTtoolBarHistorialCambioClave,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarHistorialCambioClave=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarHistorialCambioClave,this.jTtoolBarHistorialCambioClave,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+HistorialCambioClaveConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarHistorialCambioClave=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarHistorialCambioClave,this.jTtoolBarHistorialCambioClave,
							"cerrar","cerrar","Salir"+" "+HistorialCambioClaveConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarHistorialCambioClave=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarHistorialCambioClave;
			
				this.jButtonProcesarInformacionToolBarHistorialCambioClave=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarHistorialCambioClave;
				
		//protected JButton jButtonModificarToolBarHistorialCambioClave;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarHistorialCambioClave=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuHistorialCambioClave=new JMenuMe("General");
		this.jmenuArchivoHistorialCambioClave=new JMenuMe("Archivo");
		this.jmenuAccionesHistorialCambioClave=new JMenuMe("Acciones");
		this.jmenuDatosHistorialCambioClave=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoHistorialCambioClave= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoHistorialCambioClave.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoHistorialCambioClave,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoHistorialCambioClave, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarHistorialCambioClave= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarHistorialCambioClave.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarHistorialCambioClave,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarHistorialCambioClave, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesHistorialCambioClave= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesHistorialCambioClave.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesHistorialCambioClave,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesHistorialCambioClave, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosHistorialCambioClave= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosHistorialCambioClave.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosHistorialCambioClave,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosHistorialCambioClave, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarHistorialCambioClave= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarHistorialCambioClave.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarHistorialCambioClave,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarHistorialCambioClave, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormHistorialCambioClave= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormHistorialCambioClave.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormHistorialCambioClave,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormHistorialCambioClave, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaHistorialCambioClave= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaHistorialCambioClave.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaHistorialCambioClave,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaHistorialCambioClave, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarHistorialCambioClave= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarHistorialCambioClave.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarHistorialCambioClave,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarHistorialCambioClave, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionHistorialCambioClave= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionHistorialCambioClave.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionHistorialCambioClave,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionHistorialCambioClave, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionHistorialCambioClave= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionHistorialCambioClave.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionHistorialCambioClave,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresHistorialCambioClave= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresHistorialCambioClave.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresHistorialCambioClave,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresHistorialCambioClave, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesHistorialCambioClave= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesHistorialCambioClave.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesHistorialCambioClave,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesHistorialCambioClave, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByHistorialCambioClave= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByHistorialCambioClave.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByHistorialCambioClave,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByHistorialCambioClave, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarHistorialCambioClave= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarHistorialCambioClave.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarHistorialCambioClave,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarHistorialCambioClave, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByHistorialCambioClave= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByHistorialCambioClave.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByHistorialCambioClave,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByHistorialCambioClave, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarHistorialCambioClave= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarHistorialCambioClave.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarHistorialCambioClave,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarHistorialCambioClave, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosHistorialCambioClave= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosHistorialCambioClave.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosHistorialCambioClave,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosHistorialCambioClave, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoHistorialCambioClave.add(this.jMenuItemCerrarHistorialCambioClave);
			
			this.jmenuAccionesHistorialCambioClave.add(this.jMenuItemNuevoHistorialCambioClave);
			this.jmenuAccionesHistorialCambioClave.add(this.jMenuItemNuevoGuardarCambiosHistorialCambioClave);
			this.jmenuAccionesHistorialCambioClave.add(this.jMenuItemNuevoRelacionesHistorialCambioClave);
			this.jmenuAccionesHistorialCambioClave.add(this.jMenuItemGuardarCambiosTablaHistorialCambioClave);		
			this.jmenuAccionesHistorialCambioClave.add(this.jMenuItemDuplicarHistorialCambioClave);		
			this.jmenuAccionesHistorialCambioClave.add(this.jMenuItemCopiarHistorialCambioClave);		
			this.jmenuAccionesHistorialCambioClave.add(this.jMenuItemVerFormHistorialCambioClave);		
			
			this.jmenuDatosHistorialCambioClave.add(this.jMenuItemRecargarInformacionHistorialCambioClave);				
			this.jmenuDatosHistorialCambioClave.add(this.jMenuItemAnterioresHistorialCambioClave);				
			this.jmenuDatosHistorialCambioClave.add(this.jMenuItemSiguientesHistorialCambioClave);				
			this.jmenuDatosHistorialCambioClave.add(this.jMenuItemAbrirOrderByHistorialCambioClave);				
			this.jmenuDatosHistorialCambioClave.add(this.jMenuItemMostrarOcultarHistorialCambioClave);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesHistorialCambioClave.add(this.jMenuItemGuardarCambiosHistorialCambioClave);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoHistorialCambioClave, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesHistorialCambioClave, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosHistorialCambioClave, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarHistorialCambioClave.add(this.jmenuArchivoHistorialCambioClave);		
			this.jmenuBarHistorialCambioClave.add(this.jmenuAccionesHistorialCambioClave);		
			this.jmenuBarHistorialCambioClave.add(this.jmenuDatosHistorialCambioClave);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarHistorialCambioClave);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasHistorialCambioClave() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaPorIdUsuarioPorFechaHoraHistorialCambioClave=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorIdUsuarioPorFechaHoraHistorialCambioClave.setToolTipText("Buscar Por Usuario Por Fecha Hora ");
		this.jButtonBusquedaPorIdUsuarioPorFechaHoraHistorialCambioClave= new JButtonMe();
		this.jButtonBusquedaPorIdUsuarioPorFechaHoraHistorialCambioClave.setText("Buscar");
		this.jButtonBusquedaPorIdUsuarioPorFechaHoraHistorialCambioClave.setToolTipText("Buscar Por Usuario Por Fecha Hora ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorIdUsuarioPorFechaHoraHistorialCambioClave,"buscar_button","Buscar Por Usuario Por Fecha Hora ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorIdUsuarioPorFechaHoraHistorialCambioClave, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_usuarioBusquedaPorIdUsuarioPorFechaHoraHistorialCambioClave = new JLabelMe();
		jLabelid_usuarioBusquedaPorIdUsuarioPorFechaHoraHistorialCambioClave.setText("Usuario :");
		jLabelid_usuarioBusquedaPorIdUsuarioPorFechaHoraHistorialCambioClave.setToolTipText("Usuario");
		jLabelid_usuarioBusquedaPorIdUsuarioPorFechaHoraHistorialCambioClave.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_usuarioBusquedaPorIdUsuarioPorFechaHoraHistorialCambioClave.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_usuarioBusquedaPorIdUsuarioPorFechaHoraHistorialCambioClave.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_usuarioBusquedaPorIdUsuarioPorFechaHoraHistorialCambioClave,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_usuarioBusquedaPorIdUsuarioPorFechaHoraHistorialCambioClave= new JComboBoxMe();
		jComboBoxid_usuarioBusquedaPorIdUsuarioPorFechaHoraHistorialCambioClave.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_usuarioBusquedaPorIdUsuarioPorFechaHoraHistorialCambioClave.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_usuarioBusquedaPorIdUsuarioPorFechaHoraHistorialCambioClave.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_usuarioBusquedaPorIdUsuarioPorFechaHoraHistorialCambioClave,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelfecha_horaBusquedaPorIdUsuarioPorFechaHoraHistorialCambioClave = new JLabelMe();
		jLabelfecha_horaBusquedaPorIdUsuarioPorFechaHoraHistorialCambioClave.setText("Fecha Hora :");
		jLabelfecha_horaBusquedaPorIdUsuarioPorFechaHoraHistorialCambioClave.setToolTipText("Fecha Hora");
		jLabelfecha_horaBusquedaPorIdUsuarioPorFechaHoraHistorialCambioClave.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelfecha_horaBusquedaPorIdUsuarioPorFechaHoraHistorialCambioClave.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelfecha_horaBusquedaPorIdUsuarioPorFechaHoraHistorialCambioClave.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelfecha_horaBusquedaPorIdUsuarioPorFechaHoraHistorialCambioClave,STIPO_TAMANIO_GENERAL,false,true,this);

		jDateChooserfecha_horaBusquedaPorIdUsuarioPorFechaHoraHistorialCambioClave= new JPanelDateTimeMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		jDateChooserfecha_horaBusquedaPorIdUsuarioPorFechaHoraHistorialCambioClave.setMinimumSize(new Dimension(FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL*2,85),Constantes.ISWING_ALTO_CONTROL + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA));
		jDateChooserfecha_horaBusquedaPorIdUsuarioPorFechaHoraHistorialCambioClave.setMaximumSize(new Dimension(FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL*2,85),Constantes.ISWING_ALTO_CONTROL + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA));
		jDateChooserfecha_horaBusquedaPorIdUsuarioPorFechaHoraHistorialCambioClave.setPreferredSize(new Dimension(FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL*2,85),Constantes.ISWING_ALTO_CONTROL + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA));
		jDateChooserfecha_horaBusquedaPorIdUsuarioPorFechaHoraHistorialCambioClave.setDate(new Timestamp((new Date()).getTime()));
		jDateChooserfecha_horaBusquedaPorIdUsuarioPorFechaHoraHistorialCambioClave.setDateFormatString("yyyy-MM-dd");;
		//jDateChooserfecha_horaBusquedaPorIdUsuarioPorFechaHoraHistorialCambioClave.setText(Funciones.getStringMySqlCurrentDate());




		this.jTabbedPaneBusquedasHistorialCambioClave=new JTabbedPane();


		this.jTabbedPaneBusquedasHistorialCambioClave.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasHistorialCambioClave.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasHistorialCambioClave.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasHistorialCambioClave.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasHistorialCambioClave.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasHistorialCambioClave,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleHistorialCambioClave = new HistorialCambioClaveDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Historial Cambio Clave DATOS");
			this.jInternalFrameDetalleFormHistorialCambioClave = new HistorialCambioClaveDetalleFormJInternalFrame(jDesktopPane,this.historialcambioclaveSessionBean.getConGuardarRelaciones(),this.historialcambioclaveSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormHistorialCambioClave = null;//new HistorialCambioClaveDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutHistorialCambioClave= new GridBagLayout();
		
		
		this.jTableDatosHistorialCambioClave = new JTableMe();      
		
		String sToolTipHistorialCambioClave="";
		sToolTipHistorialCambioClave=HistorialCambioClaveConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipHistorialCambioClave+="(Seguridad.HistorialCambioClave)";
		}
		
		if(!this.historialcambioclaveSessionBean.getEsGuardarRelacionado()) {
			sToolTipHistorialCambioClave+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosHistorialCambioClave.setToolTipText(sToolTipHistorialCambioClave);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosHistorialCambioClave);
		this.jTableDatosHistorialCambioClave.setAutoCreateRowSorter(true);
		this.jTableDatosHistorialCambioClave.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosHistorialCambioClave.setRowSelectionAllowed(true);
		this.jTableDatosHistorialCambioClave.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosHistorialCambioClave,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoHistorialCambioClave = new JButtonMe();
		this.jButtonDuplicarHistorialCambioClave = new JButtonMe();
		this.jButtonCopiarHistorialCambioClave = new JButtonMe();
		this.jButtonVerFormHistorialCambioClave = new JButtonMe();
		this.jButtonNuevoRelacionesHistorialCambioClave = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaHistorialCambioClave = new JButtonMe();
		this.jButtonCerrarHistorialCambioClave = new JButtonMe();
		
		this.jScrollPanelDatosHistorialCambioClave = new JScrollPane();   
        this.jScrollPanelDatosGeneralHistorialCambioClave = new JScrollPane();
		
				
		
		
		this.jPanelAccionesHistorialCambioClave = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Historial Cambio Clave";
		
		if(!this.historialcambioclaveSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosHistorialCambioClave.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Historial Cambio Claves" + this.sPath));
		} else {
			this.jScrollPanelDatosHistorialCambioClave.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralHistorialCambioClave.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesHistorialCambioClave.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesHistorialCambioClave.setToolTipText("Acciones");
        this.jPanelAccionesHistorialCambioClave.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralHistorialCambioClave, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosHistorialCambioClave, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoHistorialCambioClave=new ReporteDinamicoJInternalFrame(HistorialCambioClaveConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoHistorialCambioClave();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionHistorialCambioClave=new ImportacionJInternalFrame(HistorialCambioClaveConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionHistorialCambioClave();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByHistorialCambioClave = new JButtonMe();
		
		this.jButtonAbrirOrderByHistorialCambioClave.setText("Orden");
		this.jButtonAbrirOrderByHistorialCambioClave.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByHistorialCambioClave,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByHistorialCambioClave, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByHistorialCambioClave.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByHistorialCambioClave.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByHistorialCambioClave=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByHistorialCambioClave,false,this);
			
			//this.cargarOrderByHistorialCambioClave(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByHistorialCambioClave=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByHistorialCambioClave,true,this);
			
			//this.cargarOrderByHistorialCambioClave(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosHistorialCambioClave.setMinimumSize(new Dimension(400,50));//530
		this.jTableDatosHistorialCambioClave.setMaximumSize(new Dimension(400,50));//530
		this.jTableDatosHistorialCambioClave.setPreferredSize(new Dimension(400,50));//530
		
		this.jScrollPanelDatosHistorialCambioClave.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosHistorialCambioClave.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosHistorialCambioClave.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoHistorialCambioClave.setText("Nuevo");
		this.jButtonDuplicarHistorialCambioClave.setText("Duplicar");
		this.jButtonCopiarHistorialCambioClave.setText("Copiar");
		this.jButtonVerFormHistorialCambioClave.setText("Ver");
		this.jButtonNuevoRelacionesHistorialCambioClave.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaHistorialCambioClave.setText("Guardar");
		this.jButtonCerrarHistorialCambioClave.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoHistorialCambioClave,"nuevo_button","Nuevo",this.historialcambioclaveSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarHistorialCambioClave,"duplicar_button","Duplicar",this.historialcambioclaveSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarHistorialCambioClave,"copiar_button","Copiar",this.historialcambioclaveSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormHistorialCambioClave,"ver_form","Ver",this.historialcambioclaveSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesHistorialCambioClave,"nuevorelaciones_button","Nuevo Rel",this.historialcambioclaveSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaHistorialCambioClave,"guardarcambiostabla_button","Guardar",this.historialcambioclaveSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarHistorialCambioClave,"cerrar_button","Salir",this.historialcambioclaveSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoHistorialCambioClave, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarHistorialCambioClave, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarHistorialCambioClave, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormHistorialCambioClave, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesHistorialCambioClave, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaHistorialCambioClave, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarHistorialCambioClave, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoHistorialCambioClave.setToolTipText("Nuevo"+" "+HistorialCambioClaveConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarHistorialCambioClave.setToolTipText("Duplicar"+" "+HistorialCambioClaveConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarHistorialCambioClave.setToolTipText("Copiar"+" "+HistorialCambioClaveConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormHistorialCambioClave.setToolTipText("Ver"+" "+HistorialCambioClaveConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesHistorialCambioClave.setToolTipText("Nuevo Rel"+" "+HistorialCambioClaveConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaHistorialCambioClave.setToolTipText("Guardar"+" "+HistorialCambioClaveConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarHistorialCambioClave.setToolTipText("Salir"+" "+HistorialCambioClaveConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoHistorialCambioClave";
		inputMap = this.jButtonNuevoHistorialCambioClave.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoHistorialCambioClave.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoHistorialCambioClave"));
		
		//DUPLICAR
		sMapKey = "DuplicarHistorialCambioClave";
		inputMap = this.jButtonDuplicarHistorialCambioClave.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarHistorialCambioClave.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarHistorialCambioClave"));
		
		//COPIAR
		sMapKey = "CopiarHistorialCambioClave";
		inputMap = this.jButtonCopiarHistorialCambioClave.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarHistorialCambioClave.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarHistorialCambioClave"));
		
		//VEr FORM
		sMapKey = "VerFormHistorialCambioClave";
		inputMap = this.jButtonVerFormHistorialCambioClave.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormHistorialCambioClave.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormHistorialCambioClave"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesHistorialCambioClave";
		inputMap = this.jButtonNuevoRelacionesHistorialCambioClave.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesHistorialCambioClave.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesHistorialCambioClave"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarHistorialCambioClave";
		inputMap = this.jButtonModificarHistorialCambioClave.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarHistorialCambioClave.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarHistorialCambioClave"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarHistorialCambioClave";
		inputMap = this.jButtonCerrarHistorialCambioClave.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarHistorialCambioClave.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarHistorialCambioClave"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaHistorialCambioClave";
		inputMap = this.jButtonGuardarCambiosTablaHistorialCambioClave.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaHistorialCambioClave.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaHistorialCambioClave"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesHistorialCambioClave = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesHistorialCambioClave = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionHistorialCambioClave = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1HistorialCambioClave= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2HistorialCambioClave= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3HistorialCambioClave= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4HistorialCambioClave= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5HistorialCambioClave= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesHistorialCambioClave.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesHistorialCambioClave.setName("jPanelParametrosReportesHistorialCambioClave"); 
		
		this.jPanelParametrosReportesAccionesHistorialCambioClave.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesHistorialCambioClave.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesHistorialCambioClave.setName("jPanelParametrosReportesAccionesHistorialCambioClave"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesHistorialCambioClave, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesHistorialCambioClave, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionHistorialCambioClave = new JButtonMe();
		this.jButtonRecargarInformacionHistorialCambioClave.setText("Recargar");
		this.jButtonRecargarInformacionHistorialCambioClave.setToolTipText("Recargar"+" "+HistorialCambioClaveConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionHistorialCambioClave,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionHistorialCambioClave = new JButtonMe();
		this.jButtonProcesarInformacionHistorialCambioClave.setText("Procesar");
		this.jButtonProcesarInformacionHistorialCambioClave.setToolTipText("Procesar"+" "+HistorialCambioClaveConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionHistorialCambioClave.setVisible(false);
			
		this.jButtonProcesarInformacionHistorialCambioClave.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionHistorialCambioClave.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionHistorialCambioClave.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesHistorialCambioClave = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesHistorialCambioClave.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesHistorialCambioClave.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesHistorialCambioClave = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesHistorialCambioClave.setText("TIPO");       
		this.jComboBoxTiposReportesHistorialCambioClave.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesHistorialCambioClave = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesHistorialCambioClave.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesHistorialCambioClave.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionHistorialCambioClave = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionHistorialCambioClave.setText("Paginacion");
		this.jComboBoxTiposPaginacionHistorialCambioClave.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesHistorialCambioClave = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesHistorialCambioClave.setText("Accion");
		this.jComboBoxTiposRelacionesHistorialCambioClave.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesHistorialCambioClave = new JComboBoxMe();
		//this.jComboBoxTiposAccionesHistorialCambioClave.setText("Accion");
		this.jComboBoxTiposAccionesHistorialCambioClave.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarHistorialCambioClave = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarHistorialCambioClave.setText("Accion");
		this.jComboBoxTiposSeleccionarHistorialCambioClave.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralHistorialCambioClave=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralHistorialCambioClave.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralHistorialCambioClave.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralHistorialCambioClave.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesHistorialCambioClave = new JLabelMe();
		
		this.jLabelAccionesHistorialCambioClave.setText("Acciones");		
		this.jLabelAccionesHistorialCambioClave.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesHistorialCambioClave.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesHistorialCambioClave.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosHistorialCambioClave = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosHistorialCambioClave.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosHistorialCambioClave.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosHistorialCambioClave = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosHistorialCambioClave.setText("Seleccionados");
		this.jCheckBoxSeleccionadosHistorialCambioClave.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaHistorialCambioClave = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaHistorialCambioClave.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaHistorialCambioClave.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteHistorialCambioClave = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteHistorialCambioClave.setText("Graf.");
		this.jCheckBoxConGraficoReporteHistorialCambioClave.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresHistorialCambioClave = new JButtonMe();
		//this.jButtonAnterioresHistorialCambioClave.setText("<<");
        this.jButtonAnterioresHistorialCambioClave.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresHistorialCambioClave,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresHistorialCambioClave, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesHistorialCambioClave = new JButtonMe();
		//this.jButtonSiguientesHistorialCambioClave.setText(">>");
        this.jButtonSiguientesHistorialCambioClave.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesHistorialCambioClave,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesHistorialCambioClave, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosHistorialCambioClave = new JButtonMe();
		this.jButtonNuevoGuardarCambiosHistorialCambioClave.setText("Nue");
        this.jButtonNuevoGuardarCambiosHistorialCambioClave.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosHistorialCambioClave,"nuevoguardarcambios_button","Nue",this.historialcambioclaveSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosHistorialCambioClave, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosHistorialCambioClave";
		inputMap = this.jButtonNuevoGuardarCambiosHistorialCambioClave.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosHistorialCambioClave.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosHistorialCambioClave"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionHistorialCambioClave";
		inputMap = this.jButtonRecargarInformacionHistorialCambioClave.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionHistorialCambioClave.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionHistorialCambioClave"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesHistorialCambioClave";
		inputMap = this.jButtonSiguientesHistorialCambioClave.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesHistorialCambioClave.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesHistorialCambioClave"));
		
		//ANTERIORES		
		sMapKey = "AnterioresHistorialCambioClave";
		inputMap = this.jButtonAnterioresHistorialCambioClave.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresHistorialCambioClave.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresHistorialCambioClave"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasHistorialCambioClave();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesHistorialCambioClave.setMinimumSize(new Dimension(this.getWidth(),HistorialCambioClaveBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(HistorialCambioClaveBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesHistorialCambioClave.setMaximumSize(new Dimension(this.getWidth(),HistorialCambioClaveBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(HistorialCambioClaveBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesHistorialCambioClave.setPreferredSize(new Dimension(this.getWidth(),HistorialCambioClaveBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(HistorialCambioClaveBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionHistorialCambioClave = new GridBagLayout();

			this.jPanelPaginacionHistorialCambioClave.setLayout(gridaBagLayoutPaginacionHistorialCambioClave);						
			
			this.gridBagConstraintsHistorialCambioClave = new GridBagConstraints();
			this.gridBagConstraintsHistorialCambioClave.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsHistorialCambioClave.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsHistorialCambioClave.gridy = 0;
			this.gridBagConstraintsHistorialCambioClave.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionHistorialCambioClave.add(this.jButtonAnterioresHistorialCambioClave, this.gridBagConstraintsHistorialCambioClave);
					
						
			this.gridBagConstraintsHistorialCambioClave = new GridBagConstraints();
			this.gridBagConstraintsHistorialCambioClave.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsHistorialCambioClave.gridy = 0;
			
			this.jPanelPaginacionHistorialCambioClave.add(this.jButtonNuevoGuardarCambiosHistorialCambioClave, this.gridBagConstraintsHistorialCambioClave);
						
			
			this.gridBagConstraintsHistorialCambioClave = new GridBagConstraints();
			this.gridBagConstraintsHistorialCambioClave.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsHistorialCambioClave.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsHistorialCambioClave.gridy = 0;
			this.jPanelPaginacionHistorialCambioClave.add(this.jButtonSiguientesHistorialCambioClave, this.gridBagConstraintsHistorialCambioClave);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsHistorialCambioClave = new GridBagConstraints();
			this.gridBagConstraintsHistorialCambioClave.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsHistorialCambioClave.gridy = 1;
			this.gridBagConstraintsHistorialCambioClave.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionHistorialCambioClave.add(this.jButtonNuevoHistorialCambioClave, this.gridBagConstraintsHistorialCambioClave);
						
			
			
			if(!this.historialcambioclaveSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsHistorialCambioClave = new GridBagConstraints();
				this.gridBagConstraintsHistorialCambioClave.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsHistorialCambioClave.gridy = 1;
				this.gridBagConstraintsHistorialCambioClave.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionHistorialCambioClave.add(this.jButtonGuardarCambiosTablaHistorialCambioClave, this.gridBagConstraintsHistorialCambioClave);
			}
			
			
			
			this.gridBagConstraintsHistorialCambioClave = new GridBagConstraints();
			this.gridBagConstraintsHistorialCambioClave.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsHistorialCambioClave.gridy = 1;
			this.gridBagConstraintsHistorialCambioClave.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionHistorialCambioClave.add(this.jButtonDuplicarHistorialCambioClave, this.gridBagConstraintsHistorialCambioClave);
			
			this.gridBagConstraintsHistorialCambioClave = new GridBagConstraints();
			this.gridBagConstraintsHistorialCambioClave.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsHistorialCambioClave.gridy = 1;
			this.gridBagConstraintsHistorialCambioClave.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionHistorialCambioClave.add(this.jButtonCopiarHistorialCambioClave, this.gridBagConstraintsHistorialCambioClave);
		
			this.gridBagConstraintsHistorialCambioClave = new GridBagConstraints();
			this.gridBagConstraintsHistorialCambioClave.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsHistorialCambioClave.gridy = 1;
			this.gridBagConstraintsHistorialCambioClave.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionHistorialCambioClave.add(this.jButtonVerFormHistorialCambioClave, this.gridBagConstraintsHistorialCambioClave);
		
			this.gridBagConstraintsHistorialCambioClave = new GridBagConstraints();
			this.gridBagConstraintsHistorialCambioClave.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsHistorialCambioClave.gridy = 1;
			this.gridBagConstraintsHistorialCambioClave.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionHistorialCambioClave.add(this.jButtonCerrarHistorialCambioClave, this.gridBagConstraintsHistorialCambioClave);
		
		
		
		this.jButtonRecargarInformacionHistorialCambioClave.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionHistorialCambioClave.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionHistorialCambioClave.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionHistorialCambioClave, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesHistorialCambioClave.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesHistorialCambioClave.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesHistorialCambioClave.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesHistorialCambioClave, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesHistorialCambioClave.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesHistorialCambioClave.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesHistorialCambioClave.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesHistorialCambioClave, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesHistorialCambioClave.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesHistorialCambioClave.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesHistorialCambioClave.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesHistorialCambioClave, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionHistorialCambioClave.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionHistorialCambioClave.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionHistorialCambioClave.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionHistorialCambioClave, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesHistorialCambioClave.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesHistorialCambioClave.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesHistorialCambioClave.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesHistorialCambioClave, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesHistorialCambioClave.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesHistorialCambioClave.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesHistorialCambioClave.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesHistorialCambioClave, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarHistorialCambioClave.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarHistorialCambioClave.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarHistorialCambioClave.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarHistorialCambioClave, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaHistorialCambioClave.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaHistorialCambioClave.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaHistorialCambioClave.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaHistorialCambioClave, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteHistorialCambioClave.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteHistorialCambioClave.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteHistorialCambioClave.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteHistorialCambioClave, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosHistorialCambioClave.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosHistorialCambioClave.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosHistorialCambioClave.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosHistorialCambioClave, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosHistorialCambioClave.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosHistorialCambioClave.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosHistorialCambioClave.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosHistorialCambioClave, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesHistorialCambioClave = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesHistorialCambioClave = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1HistorialCambioClave = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2HistorialCambioClave = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3HistorialCambioClave = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4HistorialCambioClave = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesHistorialCambioClave.setLayout(gridaBagParametrosReportesHistorialCambioClave);
			this.jPanelParametrosReportesAccionesHistorialCambioClave.setLayout(gridaBagParametrosReportesAccionesHistorialCambioClave);
			
			
			this.jPanelParametrosAuxiliar1HistorialCambioClave.setLayout(gridaBagParametrosAuxiliar1HistorialCambioClave);
			this.jPanelParametrosAuxiliar2HistorialCambioClave.setLayout(gridaBagParametrosAuxiliar2HistorialCambioClave);
			this.jPanelParametrosAuxiliar3HistorialCambioClave.setLayout(gridaBagParametrosAuxiliar3HistorialCambioClave);
			this.jPanelParametrosAuxiliar4HistorialCambioClave.setLayout(gridaBagParametrosAuxiliar4HistorialCambioClave);
			//this.jPanelParametrosAuxiliar5HistorialCambioClave.setLayout(gridaBagParametrosAuxiliar2HistorialCambioClave);			
			
			
			
			
			this.gridBagConstraintsHistorialCambioClave = new GridBagConstraints();
			this.gridBagConstraintsHistorialCambioClave.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsHistorialCambioClave.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsHistorialCambioClave.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesHistorialCambioClave.add(this.jButtonRecargarInformacionHistorialCambioClave, this.gridBagConstraintsHistorialCambioClave);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsHistorialCambioClave = new GridBagConstraints();
			this.gridBagConstraintsHistorialCambioClave.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsHistorialCambioClave.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsHistorialCambioClave.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1HistorialCambioClave.add(this.jComboBoxTiposPaginacionHistorialCambioClave, this.gridBagConstraintsHistorialCambioClave);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsHistorialCambioClave = new GridBagConstraints();
			this.gridBagConstraintsHistorialCambioClave.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsHistorialCambioClave.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsHistorialCambioClave.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1HistorialCambioClave.add(this.jCheckBoxConAltoMaximoTablaHistorialCambioClave, this.gridBagConstraintsHistorialCambioClave);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsHistorialCambioClave = new GridBagConstraints();
			this.gridBagConstraintsHistorialCambioClave.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsHistorialCambioClave.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsHistorialCambioClave.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1HistorialCambioClave.add(this.jComboBoxTiposArchivosReportesHistorialCambioClave, this.gridBagConstraintsHistorialCambioClave);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsHistorialCambioClave = new GridBagConstraints();
			this.gridBagConstraintsHistorialCambioClave.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsHistorialCambioClave.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsHistorialCambioClave.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesHistorialCambioClave.add(this.jPanelParametrosAuxiliar1HistorialCambioClave, this.gridBagConstraintsHistorialCambioClave);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsHistorialCambioClave = new GridBagConstraints();
			this.gridBagConstraintsHistorialCambioClave.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsHistorialCambioClave.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsHistorialCambioClave.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsHistorialCambioClave.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4HistorialCambioClave.add(this.jComboBoxTiposReportesHistorialCambioClave, this.gridBagConstraintsHistorialCambioClave);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsHistorialCambioClave = new GridBagConstraints();
			this.gridBagConstraintsHistorialCambioClave.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsHistorialCambioClave.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsHistorialCambioClave.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesHistorialCambioClave.add(this.jPanelParametrosAuxiliar4HistorialCambioClave, this.gridBagConstraintsHistorialCambioClave);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsHistorialCambioClave = new GridBagConstraints();
			this.gridBagConstraintsHistorialCambioClave.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsHistorialCambioClave.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsHistorialCambioClave.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesHistorialCambioClave.add(this.jComboBoxTiposReportesHistorialCambioClave, this.gridBagConstraintsHistorialCambioClave);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsHistorialCambioClave = new GridBagConstraints();
			this.gridBagConstraintsHistorialCambioClave.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsHistorialCambioClave.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsHistorialCambioClave.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesHistorialCambioClave.add(this.jCheckBoxGenerarReporteHistorialCambioClave, this.gridBagConstraintsHistorialCambioClave);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsHistorialCambioClave = new GridBagConstraints();
			this.gridBagConstraintsHistorialCambioClave.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsHistorialCambioClave.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsHistorialCambioClave.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesHistorialCambioClave.add(this.jPanelParametrosAuxiliar2HistorialCambioClave, this.gridBagConstraintsHistorialCambioClave);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsHistorialCambioClave = new GridBagConstraints();
			this.gridBagConstraintsHistorialCambioClave.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsHistorialCambioClave.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsHistorialCambioClave.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesHistorialCambioClave.add(this.jLabelAccionesHistorialCambioClave, this.gridBagConstraintsHistorialCambioClave);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsHistorialCambioClave = new GridBagConstraints();
				this.gridBagConstraintsHistorialCambioClave.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsHistorialCambioClave.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsHistorialCambioClave.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesHistorialCambioClave.add(this.jButtonAbrirOrderByHistorialCambioClave, this.gridBagConstraintsHistorialCambioClave);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsHistorialCambioClave = new GridBagConstraints();
			this.gridBagConstraintsHistorialCambioClave.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsHistorialCambioClave.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsHistorialCambioClave.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesHistorialCambioClave.add(this.jComboBoxTiposSeleccionarHistorialCambioClave, this.gridBagConstraintsHistorialCambioClave);			
			
			
			/*
			this.gridBagConstraintsHistorialCambioClave = new GridBagConstraints();
			this.gridBagConstraintsHistorialCambioClave.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsHistorialCambioClave.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsHistorialCambioClave.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesHistorialCambioClave.add(this.jCheckBoxSeleccionarTodosHistorialCambioClave, this.gridBagConstraintsHistorialCambioClave);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsHistorialCambioClave = new GridBagConstraints();
			this.gridBagConstraintsHistorialCambioClave.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsHistorialCambioClave.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsHistorialCambioClave.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsHistorialCambioClave.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3HistorialCambioClave.add(this.jCheckBoxSeleccionarTodosHistorialCambioClave, this.gridBagConstraintsHistorialCambioClave);															
				
			this.gridBagConstraintsHistorialCambioClave = new GridBagConstraints();
			this.gridBagConstraintsHistorialCambioClave.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsHistorialCambioClave.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsHistorialCambioClave.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsHistorialCambioClave.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3HistorialCambioClave.add(this.jCheckBoxSeleccionadosHistorialCambioClave, this.gridBagConstraintsHistorialCambioClave);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsHistorialCambioClave = new GridBagConstraints();
			this.gridBagConstraintsHistorialCambioClave.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsHistorialCambioClave.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsHistorialCambioClave.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesHistorialCambioClave.add(this.jPanelParametrosAuxiliar3HistorialCambioClave, this.gridBagConstraintsHistorialCambioClave);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsHistorialCambioClave = new GridBagConstraints();
			this.gridBagConstraintsHistorialCambioClave.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsHistorialCambioClave.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesHistorialCambioClave.add(this.jComboBoxTiposAccionesHistorialCambioClave, this.gridBagConstraintsHistorialCambioClave);
	
				
			this.gridBagConstraintsHistorialCambioClave = new GridBagConstraints();
			this.gridBagConstraintsHistorialCambioClave.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsHistorialCambioClave.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesHistorialCambioClave.add(this.jTextFieldValorCampoGeneralHistorialCambioClave, this.gridBagConstraintsHistorialCambioClave);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosHistorialCambioClave = new GridBagLayout();

			this.jScrollPanelDatosHistorialCambioClave.setLayout(gridaBagLayoutDatosHistorialCambioClave);
			
			this.gridBagConstraintsHistorialCambioClave = new GridBagConstraints();
			this.gridBagConstraintsHistorialCambioClave.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsHistorialCambioClave.gridy = 0;
			this.gridBagConstraintsHistorialCambioClave.gridx = 0;
			
			this.jScrollPanelDatosHistorialCambioClave.add(this.jTableDatosHistorialCambioClave, this.gridBagConstraintsHistorialCambioClave);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosHistorialCambioClave.setViewportView(this.jTableDatosHistorialCambioClave);
		this.jTableDatosHistorialCambioClave.setFillsViewportHeight(true);
		this.jTableDatosHistorialCambioClave.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesHistorialCambioClave= new GridBagLayout();
		this.jPanelAccionesHistorialCambioClave.setLayout(gridaBagLayoutAccionesHistorialCambioClave);
		
		
		/*	
		this.gridBagConstraintsHistorialCambioClave = new GridBagConstraints();
		this.gridBagConstraintsHistorialCambioClave.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsHistorialCambioClave.gridy = 0;
		this.gridBagConstraintsHistorialCambioClave.gridx = 0;
			
		this.jPanelAccionesHistorialCambioClave.add(this.jButtonNuevoHistorialCambioClave, this.gridBagConstraintsHistorialCambioClave);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaPorIdUsuarioPorFechaHoraHistorialCambioClave= new GridBagLayout();
		gridaBagLayoutBusquedaPorIdUsuarioPorFechaHoraHistorialCambioClave.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorIdUsuarioPorFechaHoraHistorialCambioClave.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorIdUsuarioPorFechaHoraHistorialCambioClave.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorIdUsuarioPorFechaHoraHistorialCambioClave.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorIdUsuarioPorFechaHoraHistorialCambioClave.setLayout(gridaBagLayoutBusquedaPorIdUsuarioPorFechaHoraHistorialCambioClave);

		gridBagConstraintsHistorialCambioClave = new GridBagConstraints();
		gridBagConstraintsHistorialCambioClave.anchor = GridBagConstraints.WEST;
		gridBagConstraintsHistorialCambioClave.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsHistorialCambioClave.gridy = 0;
		gridBagConstraintsHistorialCambioClave.gridx = 0;
		jPanelBusquedaPorIdUsuarioPorFechaHoraHistorialCambioClave.add(jLabelid_usuarioBusquedaPorIdUsuarioPorFechaHoraHistorialCambioClave, gridBagConstraintsHistorialCambioClave);

		gridBagConstraintsHistorialCambioClave = new GridBagConstraints();
		gridBagConstraintsHistorialCambioClave.anchor = GridBagConstraints.WEST;
		gridBagConstraintsHistorialCambioClave.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsHistorialCambioClave.gridy = 0;
		gridBagConstraintsHistorialCambioClave.gridx = 1;
		jPanelBusquedaPorIdUsuarioPorFechaHoraHistorialCambioClave.add(jComboBoxid_usuarioBusquedaPorIdUsuarioPorFechaHoraHistorialCambioClave, gridBagConstraintsHistorialCambioClave);


		gridBagConstraintsHistorialCambioClave = new GridBagConstraints();
		gridBagConstraintsHistorialCambioClave.anchor = GridBagConstraints.WEST;
		gridBagConstraintsHistorialCambioClave.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsHistorialCambioClave.gridy = 1;
		gridBagConstraintsHistorialCambioClave.gridx = 0;
		jPanelBusquedaPorIdUsuarioPorFechaHoraHistorialCambioClave.add(jLabelfecha_horaBusquedaPorIdUsuarioPorFechaHoraHistorialCambioClave, gridBagConstraintsHistorialCambioClave);

		gridBagConstraintsHistorialCambioClave = new GridBagConstraints();
		gridBagConstraintsHistorialCambioClave.anchor = GridBagConstraints.WEST;
		gridBagConstraintsHistorialCambioClave.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsHistorialCambioClave.gridy = 1;
		gridBagConstraintsHistorialCambioClave.gridx = 1;
		jPanelBusquedaPorIdUsuarioPorFechaHoraHistorialCambioClave.add(jDateChooserfecha_horaBusquedaPorIdUsuarioPorFechaHoraHistorialCambioClave, gridBagConstraintsHistorialCambioClave);

		gridBagConstraintsHistorialCambioClave = new GridBagConstraints();
		gridBagConstraintsHistorialCambioClave.anchor = GridBagConstraints.WEST;
		gridBagConstraintsHistorialCambioClave.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsHistorialCambioClave.gridy = 2;
		gridBagConstraintsHistorialCambioClave.gridx =1;
		jPanelBusquedaPorIdUsuarioPorFechaHoraHistorialCambioClave.add(jButtonBusquedaPorIdUsuarioPorFechaHoraHistorialCambioClave, gridBagConstraintsHistorialCambioClave);

		jTabbedPaneBusquedasHistorialCambioClave.addTab("1.-Por Usuario Por Fecha Hora ", jPanelBusquedaPorIdUsuarioPorFechaHoraHistorialCambioClave);
		jTabbedPaneBusquedasHistorialCambioClave.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutHistorialCambioClave = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutHistorialCambioClave);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.historialcambioclaveSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsHistorialCambioClave = new GridBagConstraints();						
			this.gridBagConstraintsHistorialCambioClave.gridy = iGridyPrincipal++;
			this.gridBagConstraintsHistorialCambioClave.gridx = 0;		
			//this.gridBagConstraintsHistorialCambioClave.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsHistorialCambioClave.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsHistorialCambioClave.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarHistorialCambioClave, this.gridBagConstraintsHistorialCambioClave);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsHistorialCambioClave = new GridBagConstraints();
		this.gridBagConstraintsHistorialCambioClave.gridy = iGridyPrincipal++;
		this.gridBagConstraintsHistorialCambioClave.gridx = 0;		
		//this.gridBagConstraintsHistorialCambioClave.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsHistorialCambioClave.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsHistorialCambioClave.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsHistorialCambioClave);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsHistorialCambioClave = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsHistorialCambioClave.gridy = iGridyPrincipal++;
			this.gridBagConstraintsHistorialCambioClave.gridx = 0;		
			this.gridBagConstraintsHistorialCambioClave.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsHistorialCambioClave.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsHistorialCambioClave.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasHistorialCambioClave, this.gridBagConstraintsHistorialCambioClave);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsHistorialCambioClave = new GridBagConstraints();
		this.gridBagConstraintsHistorialCambioClave.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsHistorialCambioClave.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesHistorialCambioClave, this.gridBagConstraintsHistorialCambioClave);								
		
		
		/*
		this.gridBagConstraintsHistorialCambioClave = new GridBagConstraints();
		this.gridBagConstraintsHistorialCambioClave.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsHistorialCambioClave.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesHistorialCambioClave, this.gridBagConstraintsHistorialCambioClave);
		*/		
		
		this.gridBagConstraintsHistorialCambioClave = new GridBagConstraints();
		this.gridBagConstraintsHistorialCambioClave.gridy =iGridyPrincipal++;
		this.gridBagConstraintsHistorialCambioClave.gridx =0;
		this.gridBagConstraintsHistorialCambioClave.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsHistorialCambioClave.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosHistorialCambioClave, this.gridBagConstraintsHistorialCambioClave);
				
		
		this.gridBagConstraintsHistorialCambioClave = new GridBagConstraints();
		this.gridBagConstraintsHistorialCambioClave.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsHistorialCambioClave.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionHistorialCambioClave, this.gridBagConstraintsHistorialCambioClave);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(HistorialCambioClaveJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosHistorialCambioClave= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosHistorialCambioClave = new GridBagLayout();
			this.jPanelBusquedasParametrosHistorialCambioClave.setLayout(gridaBagLayoutBusquedasParametrosHistorialCambioClave);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralHistorialCambioClave=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralHistorialCambioClave.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralHistorialCambioClave.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralHistorialCambioClave.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsHistorialCambioClave = new GridBagConstraints();
			
			
			
			
			//if(!this.conCargarMinimo) {
			
			//}
			
			this.conMaximoRelaciones=true;
			
			if(this.parametroGeneralUsuario.getcon_cargar_por_parte()) {
			}
			
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
			
			
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
		this.gridBagConstraintsHistorialCambioClave = new GridBagConstraints();
		this.gridBagConstraintsHistorialCambioClave.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsHistorialCambioClave.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposHistorialCambioClave, this.gridBagConstraintsHistorialCambioClave);
			
			
		this.gridBagConstraintsHistorialCambioClave = new GridBagConstraints();
		this.gridBagConstraintsHistorialCambioClave.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsHistorialCambioClave.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosHistorialCambioClave, this.gridBagConstraintsHistorialCambioClave);
		
			
		this.gridBagConstraintsHistorialCambioClave = new GridBagConstraints();
		this.gridBagConstraintsHistorialCambioClave.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsHistorialCambioClave.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesHistorialCambioClave, this.gridBagConstraintsHistorialCambioClave);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralHistorialCambioClave;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoHistorialCambioClave() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoHistorialCambioClave = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoHistorialCambioClave = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoHistorialCambioClave.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoHistorialCambioClave.setName("jPanelReporteDinamicoHistorialCambioClave"); 
		
		this.jPanelReporteDinamicoHistorialCambioClave.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoHistorialCambioClave.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoHistorialCambioClave.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoHistorialCambioClave.setLayout(gridaBagLayoutReporteDinamicoHistorialCambioClave);
		
		
		this.jInternalFrameReporteDinamicoHistorialCambioClave= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoHistorialCambioClave = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteHistorialCambioClave= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoHistorialCambioClave.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoHistorialCambioClave.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoHistorialCambioClave.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoHistorialCambioClave.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoHistorialCambioClave.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoHistorialCambioClave.setResizable(true);
	    this.jInternalFrameReporteDinamicoHistorialCambioClave.setClosable(true);
	    this.jInternalFrameReporteDinamicoHistorialCambioClave.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoHistorialCambioClave.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoHistorialCambioClave.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoHistorialCambioClave.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoHistorialCambioClave.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Historial Cambio Claves"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteHistorialCambioClave = new JLabelMe();

		this.jLabelColumnasSelectReporteHistorialCambioClave.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteHistorialCambioClave.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteHistorialCambioClave.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteHistorialCambioClave.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsHistorialCambioClave = new GridBagConstraints();
		this.gridBagConstraintsHistorialCambioClave.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsHistorialCambioClave.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsHistorialCambioClave.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoHistorialCambioClave.add(this.jLabelColumnasSelectReporteHistorialCambioClave, this.gridBagConstraintsHistorialCambioClave);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteHistorialCambioClave = new JList<Reporte>();
		this.jListColumnasSelectReporteHistorialCambioClave.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteHistorialCambioClave.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteHistorialCambioClave.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteHistorialCambioClave.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteHistorialCambioClave.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteHistorialCambioClave=new JScrollPane(this.jListColumnasSelectReporteHistorialCambioClave);
			
			this.jScrollColumnasSelectReporteHistorialCambioClave.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteHistorialCambioClave.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteHistorialCambioClave.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteHistorialCambioClave.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsHistorialCambioClave = new GridBagConstraints();
		this.gridBagConstraintsHistorialCambioClave.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsHistorialCambioClave.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsHistorialCambioClave.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoHistorialCambioClave.add(this.jListColumnasSelectReporteHistorialCambioClave, this.gridBagConstraintsHistorialCambioClave);
		this.jPanelReporteDinamicoHistorialCambioClave.add(this.jScrollColumnasSelectReporteHistorialCambioClave, this.gridBagConstraintsHistorialCambioClave);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteHistorialCambioClave = new JLabelMe();

		this.jLabelRelacionesSelectReporteHistorialCambioClave.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteHistorialCambioClave.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteHistorialCambioClave.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteHistorialCambioClave.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteHistorialCambioClave = new JList<Reporte>();
		this.jListRelacionesSelectReporteHistorialCambioClave.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteHistorialCambioClave.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteHistorialCambioClave.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteHistorialCambioClave.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteHistorialCambioClave.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteHistorialCambioClave=new JScrollPane(this.jListRelacionesSelectReporteHistorialCambioClave);
			
			this.jScrollRelacionesSelectReporteHistorialCambioClave.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteHistorialCambioClave.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteHistorialCambioClave.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteHistorialCambioClave.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoHistorialCambioClave = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoHistorialCambioClave = new JComboBoxMe();
		this.jListColumnasValoresGraficoHistorialCambioClave = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoHistorialCambioClave = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoHistorialCambioClave.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoHistorialCambioClave.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoHistorialCambioClave.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoHistorialCambioClave.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoHistorialCambioClave, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoHistorialCambioClave = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoHistorialCambioClave.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoHistorialCambioClave.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoHistorialCambioClave.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoHistorialCambioClave.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoHistorialCambioClave, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoHistorialCambioClave = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoHistorialCambioClave.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoHistorialCambioClave.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoHistorialCambioClave.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoHistorialCambioClave.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsHistorialCambioClave = new GridBagConstraints();
		this.gridBagConstraintsHistorialCambioClave.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsHistorialCambioClave.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsHistorialCambioClave.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoHistorialCambioClave.add(this.jLabelGenerarExcelReporteDinamicoHistorialCambioClave, this.gridBagConstraintsHistorialCambioClave);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoHistorialCambioClave = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoHistorialCambioClave.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoHistorialCambioClave,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoHistorialCambioClave.setToolTipText("Generar EXCEL"+" "+HistorialCambioClaveConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsHistorialCambioClave = new GridBagConstraints();
		//this.gridBagConstraintsHistorialCambioClave.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsHistorialCambioClave.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsHistorialCambioClave.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoHistorialCambioClave.add(this.jButtonGenerarExcelReporteDinamicoHistorialCambioClave, this.gridBagConstraintsHistorialCambioClave);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsHistorialCambioClave = new GridBagConstraints();
		this.gridBagConstraintsHistorialCambioClave.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsHistorialCambioClave.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsHistorialCambioClave.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoHistorialCambioClave.add(this.jComboBoxTiposReportesDinamicoHistorialCambioClave, this.gridBagConstraintsHistorialCambioClave);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoHistorialCambioClave = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoHistorialCambioClave.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoHistorialCambioClave.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoHistorialCambioClave.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoHistorialCambioClave.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsHistorialCambioClave = new GridBagConstraints();
		this.gridBagConstraintsHistorialCambioClave.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsHistorialCambioClave.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsHistorialCambioClave.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoHistorialCambioClave.add(this.jLabelTiposArchivoReporteDinamicoHistorialCambioClave, this.gridBagConstraintsHistorialCambioClave);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsHistorialCambioClave = new GridBagConstraints();
		this.gridBagConstraintsHistorialCambioClave.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsHistorialCambioClave.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsHistorialCambioClave.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoHistorialCambioClave.add(this.jComboBoxTiposArchivosReportesDinamicoHistorialCambioClave, this.gridBagConstraintsHistorialCambioClave);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoHistorialCambioClave = new JButtonMe();
		this.jButtonGenerarReporteDinamicoHistorialCambioClave.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoHistorialCambioClave,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoHistorialCambioClave.setToolTipText("Generar"+" "+HistorialCambioClaveConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsHistorialCambioClave = new GridBagConstraints();
		this.gridBagConstraintsHistorialCambioClave.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsHistorialCambioClave.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsHistorialCambioClave.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoHistorialCambioClave.add(this.jButtonGenerarReporteDinamicoHistorialCambioClave, this.gridBagConstraintsHistorialCambioClave);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoHistorialCambioClave = new JButtonMe();
		this.jButtonCerrarReporteDinamicoHistorialCambioClave.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoHistorialCambioClave,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoHistorialCambioClave.setToolTipText("Cancelar"+" "+HistorialCambioClaveConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsHistorialCambioClave = new GridBagConstraints();
		this.gridBagConstraintsHistorialCambioClave.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsHistorialCambioClave.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsHistorialCambioClave.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoHistorialCambioClave.add(this.jButtonCerrarReporteDinamicoHistorialCambioClave, this.gridBagConstraintsHistorialCambioClave);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalHistorialCambioClave = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoHistorialCambioClave= new JScrollPane(jPanelReporteDinamicoHistorialCambioClave,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoHistorialCambioClave.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoHistorialCambioClave.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoHistorialCambioClave.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoHistorialCambioClave.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Historial Cambio Claves"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsHistorialCambioClave = new GridBagConstraints();
		this.gridBagConstraintsHistorialCambioClave.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsHistorialCambioClave.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsHistorialCambioClave.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoHistorialCambioClave.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoHistorialCambioClave.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalHistorialCambioClave);
		this.jInternalFrameReporteDinamicoHistorialCambioClave.getContentPane().add(this.jScrollPanelReporteDinamicoHistorialCambioClave, this.gridBagConstraintsHistorialCambioClave);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionHistorialCambioClave() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionHistorialCambioClave = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionHistorialCambioClave = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionHistorialCambioClave.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionHistorialCambioClave.setName("jPanelImportacionHistorialCambioClave"); 
		
		this.jPanelImportacionHistorialCambioClave.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionHistorialCambioClave.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionHistorialCambioClave.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionHistorialCambioClave.setLayout(gridaBagLayoutImportacionHistorialCambioClave);
		
		
		this.jInternalFrameImportacionHistorialCambioClave= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionHistorialCambioClave= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionHistorialCambioClave = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteHistorialCambioClave= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionHistorialCambioClave.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionHistorialCambioClave.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionHistorialCambioClave.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionHistorialCambioClave.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionHistorialCambioClave.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionHistorialCambioClave.setResizable(true);
	    this.jInternalFrameImportacionHistorialCambioClave.setClosable(true);
	    this.jInternalFrameImportacionHistorialCambioClave.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionHistorialCambioClave.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionHistorialCambioClave.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionHistorialCambioClave.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionHistorialCambioClave.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionHistorialCambioClave.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionHistorialCambioClave.setResizable(true);
	    this.jInternalFrameImportacionHistorialCambioClave.setClosable(true);
	    this.jInternalFrameImportacionHistorialCambioClave.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionHistorialCambioClave.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionHistorialCambioClave.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionHistorialCambioClave.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionHistorialCambioClave.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Historial Cambio Claves"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionHistorialCambioClave = new JLabelMe();

		this.jLabelArchivoImportacionHistorialCambioClave.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionHistorialCambioClave.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionHistorialCambioClave.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionHistorialCambioClave.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsHistorialCambioClave = new GridBagConstraints();
		this.gridBagConstraintsHistorialCambioClave.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsHistorialCambioClave.gridy = iPosYImportacion;		
		this.gridBagConstraintsHistorialCambioClave.gridx = iPosXImportacion++;
			
		this.jPanelImportacionHistorialCambioClave.add(this.jLabelArchivoImportacionHistorialCambioClave, this.gridBagConstraintsHistorialCambioClave);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionHistorialCambioClave = new JFileChooser();		
		this.jFileChooserImportacionHistorialCambioClave.setToolTipText("ESCOGER ARCHIVO"+" "+HistorialCambioClaveConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionHistorialCambioClave = new JButtonMe();
		this.jButtonAbrirImportacionHistorialCambioClave.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionHistorialCambioClave,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionHistorialCambioClave.setToolTipText("Generar"+" "+HistorialCambioClaveConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsHistorialCambioClave = new GridBagConstraints();
		this.gridBagConstraintsHistorialCambioClave.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsHistorialCambioClave.gridy = iPosYImportacion;
		this.gridBagConstraintsHistorialCambioClave.gridx = iPosXImportacion++;
							
		this.jPanelImportacionHistorialCambioClave.add(this.jButtonAbrirImportacionHistorialCambioClave, this.gridBagConstraintsHistorialCambioClave);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionHistorialCambioClave = new JLabelMe();

		this.jLabelPathArchivoImportacionHistorialCambioClave.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionHistorialCambioClave.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionHistorialCambioClave.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionHistorialCambioClave.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsHistorialCambioClave = new GridBagConstraints();
		this.gridBagConstraintsHistorialCambioClave.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsHistorialCambioClave.gridy = iPosYImportacion;		
		this.gridBagConstraintsHistorialCambioClave.gridx = iPosXImportacion++;
			
		this.jPanelImportacionHistorialCambioClave.add(this.jLabelPathArchivoImportacionHistorialCambioClave, this.gridBagConstraintsHistorialCambioClave);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionHistorialCambioClave=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionHistorialCambioClave.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionHistorialCambioClave.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionHistorialCambioClave.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsHistorialCambioClave = new GridBagConstraints();
		this.gridBagConstraintsHistorialCambioClave.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsHistorialCambioClave.gridy = iPosYImportacion;
		this.gridBagConstraintsHistorialCambioClave.gridx = iPosXImportacion++;
							
		this.jPanelImportacionHistorialCambioClave.add(this.jTextFieldPathArchivoImportacionHistorialCambioClave, this.gridBagConstraintsHistorialCambioClave);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionHistorialCambioClave = new JButtonMe();
		this.jButtonGenerarImportacionHistorialCambioClave.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionHistorialCambioClave,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionHistorialCambioClave.setToolTipText("Generar"+" "+HistorialCambioClaveConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsHistorialCambioClave = new GridBagConstraints();
		this.gridBagConstraintsHistorialCambioClave.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsHistorialCambioClave.gridy = iPosYImportacion;
		this.gridBagConstraintsHistorialCambioClave.gridx = iPosXImportacion++;
							
		this.jPanelImportacionHistorialCambioClave.add(this.jButtonGenerarImportacionHistorialCambioClave, this.gridBagConstraintsHistorialCambioClave);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionHistorialCambioClave = new JButtonMe();
		this.jButtonCerrarImportacionHistorialCambioClave.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionHistorialCambioClave,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionHistorialCambioClave.setToolTipText("Cancelar"+" "+HistorialCambioClaveConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsHistorialCambioClave = new GridBagConstraints();
		this.gridBagConstraintsHistorialCambioClave.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsHistorialCambioClave.gridy = iPosYImportacion;
		this.gridBagConstraintsHistorialCambioClave.gridx = iPosXImportacion++;
							
		this.jPanelImportacionHistorialCambioClave.add(this.jButtonCerrarImportacionHistorialCambioClave, this.gridBagConstraintsHistorialCambioClave);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalHistorialCambioClave = new GridBagLayout();
		
		this.jScrollPanelImportacionHistorialCambioClave= new JScrollPane(jPanelImportacionHistorialCambioClave,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsHistorialCambioClave = new GridBagConstraints();
		this.gridBagConstraintsHistorialCambioClave.gridy =iPosYImportacion;
		this.gridBagConstraintsHistorialCambioClave.gridx =iPosXImportacion;
		this.gridBagConstraintsHistorialCambioClave.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionHistorialCambioClave.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionHistorialCambioClave.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalHistorialCambioClave);
		this.jInternalFrameImportacionHistorialCambioClave.getContentPane().add(this.jScrollPanelImportacionHistorialCambioClave, this.gridBagConstraintsHistorialCambioClave);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByHistorialCambioClave(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByHistorialCambioClave = new JButtonMe();
			this.jButtonAbrirOrderByHistorialCambioClave.setText("Orden");
			this.jButtonAbrirOrderByHistorialCambioClave.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByHistorialCambioClave,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByHistorialCambioClave, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByHistorialCambioClave";
			inputMap = this.jButtonAbrirOrderByHistorialCambioClave.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByHistorialCambioClave.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByHistorialCambioClave"));
		
		
			GridBagLayout gridaBagLayoutOrderByHistorialCambioClave = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByHistorialCambioClave = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByHistorialCambioClave.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByHistorialCambioClave.setName("jPanelOrderByHistorialCambioClave"); 
			
			this.jPanelOrderByHistorialCambioClave.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByHistorialCambioClave.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByHistorialCambioClave.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByHistorialCambioClave, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByHistorialCambioClave.setLayout(gridaBagLayoutOrderByHistorialCambioClave);
			
			
			this.jTableDatosHistorialCambioClaveOrderBy = new JTableMe();        
			this.jTableDatosHistorialCambioClaveOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosHistorialCambioClaveOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosHistorialCambioClaveOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosHistorialCambioClaveOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosHistorialCambioClaveOrderBy.setViewportView(this.jTableDatosHistorialCambioClaveOrderBy);
			this.jTableDatosHistorialCambioClaveOrderBy.setFillsViewportHeight(true);
			this.jTableDatosHistorialCambioClaveOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByHistorialCambioClave= new OrderByJInternalFrame();
			this.jInternalFrameOrderByHistorialCambioClave= new OrderByJInternalFrame();
			this.jScrollPanelOrderByHistorialCambioClave = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteHistorialCambioClave= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByHistorialCambioClave.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByHistorialCambioClave.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByHistorialCambioClave.setTitle("Orden");
			this.jInternalFrameOrderByHistorialCambioClave.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByHistorialCambioClave.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByHistorialCambioClave.setResizable(true);
			this.jInternalFrameOrderByHistorialCambioClave.setClosable(true);
			this.jInternalFrameOrderByHistorialCambioClave.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByHistorialCambioClave, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByHistorialCambioClave.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByHistorialCambioClave.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByHistorialCambioClave.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByHistorialCambioClave, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByHistorialCambioClave.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Historial Cambio Claves"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsHistorialCambioClave = new GridBagConstraints();
			this.gridBagConstraintsHistorialCambioClave.gridy =iPosYOrderBy++;
			this.gridBagConstraintsHistorialCambioClave.gridx =iPosXOrderBy;
			this.gridBagConstraintsHistorialCambioClave.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsHistorialCambioClave.ipady =150;
				
			this.jPanelOrderByHistorialCambioClave.add(jScrollPanelDatosHistorialCambioClaveOrderBy, this.gridBagConstraintsHistorialCambioClave);//this.jTableDatosHistorialCambioClaveTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByHistorialCambioClave = new JButtonMe();
			this.jButtonCerrarOrderByHistorialCambioClave.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByHistorialCambioClave,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByHistorialCambioClave.setToolTipText("Cancelar"+" "+HistorialCambioClaveConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByHistorialCambioClave, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsHistorialCambioClave = new GridBagConstraints();
			this.gridBagConstraintsHistorialCambioClave.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsHistorialCambioClave.gridy = iPosYOrderBy++;
			this.gridBagConstraintsHistorialCambioClave.gridx = iPosXOrderBy;
									
			this.jPanelOrderByHistorialCambioClave.add(this.jButtonCerrarOrderByHistorialCambioClave, this.gridBagConstraintsHistorialCambioClave);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalHistorialCambioClave = new GridBagLayout();
			
			this.jScrollPanelOrderByHistorialCambioClave= new JScrollPane(jPanelOrderByHistorialCambioClave,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsHistorialCambioClave = new GridBagConstraints();
			this.gridBagConstraintsHistorialCambioClave.gridy =iPosYOrderBy;
			this.gridBagConstraintsHistorialCambioClave.gridx =iPosXOrderBy;
			this.gridBagConstraintsHistorialCambioClave.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByHistorialCambioClave.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByHistorialCambioClave.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalHistorialCambioClave);
			
			this.jInternalFrameOrderByHistorialCambioClave.getContentPane().add(this.jScrollPanelOrderByHistorialCambioClave, this.gridBagConstraintsHistorialCambioClave);			
		
		} else {
			this.jButtonAbrirOrderByHistorialCambioClave = new JButtonMe();
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
		iWidthTableCalculado+=530;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=500;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.historialcambioclaveSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosHistorialCambioClave.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosHistorialCambioClave.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosHistorialCambioClave.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosHistorialCambioClave.getRowHeight();//HistorialCambioClaveConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.historialcambioclaveSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > HistorialCambioClaveConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaHistorialCambioClave.isSelected()) {
					iHeightTable=HistorialCambioClaveConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < HistorialCambioClaveConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=HistorialCambioClaveConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > HistorialCambioClaveConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaHistorialCambioClave.isSelected()) {
					iHeightTable=HistorialCambioClaveConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < HistorialCambioClaveConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=HistorialCambioClaveConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosHistorialCambioClave.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosHistorialCambioClave.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosHistorialCambioClave.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosHistorialCambioClave.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosHistorialCambioClave.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosHistorialCambioClave.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByHistorialCambioClave!=null && this.jInternalFrameOrderByHistorialCambioClave.getjTableDatosOrderBy()!=null) {
			//if(!this.historialcambioclaveSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByHistorialCambioClave.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByHistorialCambioClave.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByHistorialCambioClave.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByHistorialCambioClave.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByHistorialCambioClave.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByHistorialCambioClave.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByHistorialCambioClave.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosHistorialCambioClave.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosHistorialCambioClave.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosHistorialCambioClave.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=historialcambioclaveLogic.getHistorialCambioClaves().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=historialcambioclaves.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<HistorialCambioClave> TraerHistorialCambioClaveBeans(List<HistorialCambioClave> historialcambioclaves,ArrayList<Classe> classes)throws Exception {
		try {
			for(HistorialCambioClave historialcambioclave:historialcambioclaves) {
					
				if(!(HistorialCambioClaveConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || HistorialCambioClaveConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					historialcambioclave.setsDetalleGeneralEntityReporte(HistorialCambioClaveConstantesFunciones.getHistorialCambioClaveDescripcion(historialcambioclave));
										
						
					
						
					
				} else  {
							
					//historialcambioclave.setsDetalleGeneralEntityReporte(historialcambioclave.getsDetalleGeneralEntityReporte());
										
				}
				
				//historialcambioclavebeans.add(historialcambioclavebean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return historialcambioclaves;
    }
	//PARA REPORTES FIN
}
