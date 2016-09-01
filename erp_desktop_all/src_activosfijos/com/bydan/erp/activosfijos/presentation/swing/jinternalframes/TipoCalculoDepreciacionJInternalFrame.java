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
package com.bydan.erp.activosfijos.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.*;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;

//import com.bydan.erp.activosfijos.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.activosfijos.business.entity.*;
import com.bydan.erp.activosfijos.util.TipoCalculoDepreciacionConstantesFunciones;

import com.bydan.erp.activosfijos.business.logic.*;
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
public class TipoCalculoDepreciacionJInternalFrame extends TipoCalculoDepreciacionBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarTipoCalculoDepreciacion;
	
	protected JMenuBar jmenuBarTipoCalculoDepreciacion;
	
	protected JMenu jmenuTipoCalculoDepreciacion;
	protected JMenu jmenuDatosTipoCalculoDepreciacion;
	protected JMenu jmenuArchivoTipoCalculoDepreciacion;
	protected JMenu jmenuAccionesTipoCalculoDepreciacion;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosTipoCalculoDepreciacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoCalculoDepreciacion;	
	protected GridBagConstraints gridBagConstraintsTipoCalculoDepreciacion;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public TipoCalculoDepreciacionDetalleFormJInternalFrame jInternalFrameDetalleFormTipoCalculoDepreciacion;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoTipoCalculoDepreciacion;	
	protected ImportacionJInternalFrame jInternalFrameImportacionTipoCalculoDepreciacion;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected PaisBeanSwingJInternalFrame paisBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_pais="";
	
	public TipoCalculoDepreciacionSessionBean tipocalculodepreciacionSessionBean;
		
	
	
	public PaisSessionBean paisSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<TipoCalculoDepreciacion> tipocalculodepreciacions;		
	public List<TipoCalculoDepreciacion> tipocalculodepreciacionsEliminados;	
	public List<TipoCalculoDepreciacion> tipocalculodepreciacionsAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByTipoCalculoDepreciacion;		
	protected JButton jButtonAbrirOrderByTipoCalculoDepreciacion;
	
	
	//protected JPanel jPanelOrderByTipoCalculoDepreciacion;
	//public JScrollPane jScrollPanelOrderByTipoCalculoDepreciacion;	
	//protected JButton jButtonCerrarOrderByTipoCalculoDepreciacion;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public TipoCalculoDepreciacionLogic tipocalculodepreciacionLogic;
	
	
	
	public JScrollPane jScrollPanelDatosTipoCalculoDepreciacion;
	public JScrollPane jScrollPanelDatosEdicionTipoCalculoDepreciacion;
	public JScrollPane jScrollPanelDatosGeneralTipoCalculoDepreciacion;
    
	
	
	//public JScrollPane jScrollPanelDatosTipoCalculoDepreciacionOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoTipoCalculoDepreciacion;
	//public JScrollPane jScrollPanelImportacionTipoCalculoDepreciacion;
	
	
	
	protected JPanel jPanelAccionesTipoCalculoDepreciacion;
	
    protected JPanel jPanelPaginacionTipoCalculoDepreciacion;
    protected JPanel jPanelParametrosReportesTipoCalculoDepreciacion;
	protected JPanel jPanelParametrosReportesAccionesTipoCalculoDepreciacion;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1TipoCalculoDepreciacion;
	protected JPanel jPanelParametrosAuxiliar2TipoCalculoDepreciacion;
	protected JPanel jPanelParametrosAuxiliar3TipoCalculoDepreciacion;
	protected JPanel jPanelParametrosAuxiliar4TipoCalculoDepreciacion;
	//protected JPanel jPanelParametrosAuxiliar5TipoCalculoDepreciacion;
	
	
	
	//protected JPanel jPanelReporteDinamicoTipoCalculoDepreciacion;
	//protected JPanel jPanelImportacionTipoCalculoDepreciacion;
	
	
	public JTable jTableDatosTipoCalculoDepreciacion;
	
	
	
	//public JTable jTableDatosTipoCalculoDepreciacionOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoTipoCalculoDepreciacion;
	protected JButton jButtonDuplicarTipoCalculoDepreciacion;
	protected JButton jButtonCopiarTipoCalculoDepreciacion;
	protected JButton jButtonVerFormTipoCalculoDepreciacion;
	protected JButton jButtonNuevoRelacionesTipoCalculoDepreciacion;
	protected JButton jButtonModificarTipoCalculoDepreciacion;
	
    protected JButton jButtonGuardarCambiosTablaTipoCalculoDepreciacion;
	protected JButton jButtonCerrarTipoCalculoDepreciacion;
	
	
	protected JButton jButtonRecargarInformacionTipoCalculoDepreciacion;
	protected JButton jButtonProcesarInformacionTipoCalculoDepreciacion;
	
	
	protected JButton jButtonAnterioresTipoCalculoDepreciacion;
	protected JButton jButtonSiguientesTipoCalculoDepreciacion;
	protected JButton jButtonNuevoGuardarCambiosTipoCalculoDepreciacion;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoTipoCalculoDepreciacion;
	//protected JButton jButtonCerrarReporteDinamicoTipoCalculoDepreciacion;
	//protected JButton jButtonGenerarExcelReporteDinamicoTipoCalculoDepreciacion;	
	
	
	
	//protected JButton jButtonAbrirImportacionTipoCalculoDepreciacion;
	//protected JButton jButtonGenerarImportacionTipoCalculoDepreciacion;
	//protected JButton jButtonCerrarImportacionTipoCalculoDepreciacion;
	//protected JFileChooser jFileChooserImportacionTipoCalculoDepreciacion;
	//protected File fileImportacionTipoCalculoDepreciacion;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoCalculoDepreciacion;
	protected JButton jButtonDuplicarToolBarTipoCalculoDepreciacion;
	protected JButton jButtonNuevoRelacionesToolBarTipoCalculoDepreciacion;
	
	
	public JButton jButtonGuardarCambiosToolBarTipoCalculoDepreciacion;
	protected JButton jButtonCopiarToolBarTipoCalculoDepreciacion;
	protected JButton jButtonVerFormToolBarTipoCalculoDepreciacion;
	public JButton jButtonGuardarCambiosTablaToolBarTipoCalculoDepreciacion;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoCalculoDepreciacion;
	protected JButton jButtonCerrarToolBarTipoCalculoDepreciacion;
	
	protected JButton jButtonRecargarInformacionToolBarTipoCalculoDepreciacion;
	protected JButton jButtonProcesarInformacionToolBarTipoCalculoDepreciacion;
	protected JButton jButtonAnterioresToolBarTipoCalculoDepreciacion;
	protected JButton jButtonSiguientesToolBarTipoCalculoDepreciacion;
	protected JButton jButtonNuevoGuardarCambiosToolBarTipoCalculoDepreciacion;
	protected JButton jButtonAbrirOrderByToolBarTipoCalculoDepreciacion;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoCalculoDepreciacion;
	protected JMenuItem jMenuItemDuplicarTipoCalculoDepreciacion;
	protected JMenuItem jMenuItemNuevoRelacionesTipoCalculoDepreciacion;
	
	
	protected JMenuItem jMenuItemGuardarCambiosTipoCalculoDepreciacion;
	protected JMenuItem jMenuItemCopiarTipoCalculoDepreciacion;
	protected JMenuItem jMenuItemVerFormTipoCalculoDepreciacion;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoCalculoDepreciacion;
	protected JMenuItem jMenuItemCerrarTipoCalculoDepreciacion;
	protected JMenuItem jMenuItemDetalleCerrarTipoCalculoDepreciacion;
	protected JMenuItem jMenuItemDetalleAbrirOrderByTipoCalculoDepreciacion;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoCalculoDepreciacion;
	
	protected JMenuItem jMenuItemRecargarInformacionTipoCalculoDepreciacion;
	protected JMenuItem jMenuItemProcesarInformacionTipoCalculoDepreciacion;
	protected JMenuItem jMenuItemAnterioresTipoCalculoDepreciacion;
	protected JMenuItem jMenuItemSiguientesTipoCalculoDepreciacion;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoCalculoDepreciacion;
	protected JMenuItem jMenuItemAbrirOrderByTipoCalculoDepreciacion;
	protected JMenuItem jMenuItemMostrarOcultarTipoCalculoDepreciacion;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoCalculoDepreciacion;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosTipoCalculoDepreciacion;
	protected JCheckBox jCheckBoxSeleccionadosTipoCalculoDepreciacion;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaTipoCalculoDepreciacion;
	protected JCheckBox jCheckBoxConGraficoReporteTipoCalculoDepreciacion;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesTipoCalculoDepreciacion;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesTipoCalculoDepreciacion;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoTipoCalculoDepreciacion;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoTipoCalculoDepreciacion;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesTipoCalculoDepreciacion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionTipoCalculoDepreciacion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoCalculoDepreciacion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoCalculoDepreciacion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarTipoCalculoDepreciacion;
	protected JTextField jTextFieldValorCampoGeneralTipoCalculoDepreciacion;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteTipoCalculoDepreciacion;
	//public JList<Reporte> jListColumnasSelectReporteTipoCalculoDepreciacion;
	//public JScrollPane jScrollColumnasSelectReporteTipoCalculoDepreciacion;
	
	//public JLabel jLabelRelacionesSelectReporteTipoCalculoDepreciacion;
	//public JList<Reporte> jListRelacionesSelectReporteTipoCalculoDepreciacion;
	//public JScrollPane jScrollRelacionesSelectReporteTipoCalculoDepreciacion;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoTipoCalculoDepreciacion;
	//protected JCheckBox jCheckBoxConGraficoDinamicoTipoCalculoDepreciacion;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoTipoCalculoDepreciacion;
	//public JLabel jLabelTiposArchivoReporteDinamicoTipoCalculoDepreciacion;
	
		
	//public JLabel jLabelArchivoImportacionTipoCalculoDepreciacion;	
	//public JLabel jLabelPathArchivoImportacionTipoCalculoDepreciacion;
	//protected JTextField jTextFieldPathArchivoImportacionTipoCalculoDepreciacion;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoTipoCalculoDepreciacion;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoTipoCalculoDepreciacion;
	
	//public JLabel jLabelColumnaCategoriaValorTipoCalculoDepreciacion;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorTipoCalculoDepreciacion;
	
	//public JLabel jLabelColumnasValoresGraficoTipoCalculoDepreciacion;
	//public JList<Reporte> jListColumnasValoresGraficoTipoCalculoDepreciacion;
	//public JScrollPane jScrollColumnasValoresGraficoTipoCalculoDepreciacion;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoTipoCalculoDepreciacion;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoTipoCalculoDepreciacion;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasTipoCalculoDepreciacion;
	public JPanel jPanelFK_IdPaisTipoCalculoDepreciacion;
	public JButton jButtonFK_IdPaisTipoCalculoDepreciacion;
	
	public JPanel jPanelid_paisFK_IdPaisTipoCalculoDepreciacion;
	public JLabel jLabelid_paisFK_IdPaisTipoCalculoDepreciacion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_paisFK_IdPaisTipoCalculoDepreciacion;
	public JButton jButtonid_paisFK_IdPaisTipoCalculoDepreciacion= new JButtonMe();
	public JButton jButtonid_paisFK_IdPaisTipoCalculoDepreciacionUpdate= new JButtonMe();
	public JButton jButtonid_paisFK_IdPaisTipoCalculoDepreciacionBusqueda= new JButtonMe();

	
	
	
	
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
	public TipoCalculoDepreciacionJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("TipoCalculoDepreciacion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoCalculoDepreciacionJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoCalculoDepreciacion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoCalculoDepreciacionJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoCalculoDepreciacion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoCalculoDepreciacionJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoCalculoDepreciacion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionTipoCalculoDepreciacion)	{
		this.jButtonRecargarInformacionTipoCalculoDepreciacion = jButtonRecargarInformacionTipoCalculoDepreciacion;
	}
	
	public JButton getjButtonProcesarInformacionTipoCalculoDepreciacion() {
		return this.jButtonProcesarInformacionTipoCalculoDepreciacion;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoCalculoDepreciacion)	{
		this.jButtonProcesarInformacionTipoCalculoDepreciacion = jButtonProcesarInformacionTipoCalculoDepreciacion;
	}
	
	
	public JButton getjButtonRecargarInformacionTipoCalculoDepreciacion() {
		return this.jButtonRecargarInformacionTipoCalculoDepreciacion;
	}
	
	
	public List<TipoCalculoDepreciacion> gettipocalculodepreciacions() {
		return this.tipocalculodepreciacions;
	}

	public void settipocalculodepreciacions(List<TipoCalculoDepreciacion> tipocalculodepreciacions) {
		this.tipocalculodepreciacions = tipocalculodepreciacions;
	}
	
	public List<TipoCalculoDepreciacion> gettipocalculodepreciacionsAux() {
		return this.tipocalculodepreciacionsAux;
	}

	public void settipocalculodepreciacionsAux(List<TipoCalculoDepreciacion> tipocalculodepreciacionsAux) {
		this.tipocalculodepreciacionsAux = tipocalculodepreciacionsAux;
	}
	
	public List<TipoCalculoDepreciacion> gettipocalculodepreciacionsEliminados() {
		return this.tipocalculodepreciacionsEliminados;
	}

	public void setTipoCalculoDepreciacionsEliminados(List<TipoCalculoDepreciacion> tipocalculodepreciacionsEliminados) {
		this.tipocalculodepreciacionsEliminados = tipocalculodepreciacionsEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarTipoCalculoDepreciacion() {
		return jComboBoxTiposSeleccionarTipoCalculoDepreciacion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarTipoCalculoDepreciacion(
			JComboBox jComboBoxTiposSeleccionarTipoCalculoDepreciacion) {
		this.jComboBoxTiposSeleccionarTipoCalculoDepreciacion = jComboBoxTiposSeleccionarTipoCalculoDepreciacion;
	}
	
	public void setBorderResaltarTiposSeleccionarTipoCalculoDepreciacion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarTipoCalculoDepreciacion.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarTipoCalculoDepreciacion .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralTipoCalculoDepreciacion() {
		return jTextFieldValorCampoGeneralTipoCalculoDepreciacion;
	}

	public void setjTextFieldValorCampoGeneralTipoCalculoDepreciacion(
			JTextField jTextFieldValorCampoGeneralTipoCalculoDepreciacion) {
		this.jTextFieldValorCampoGeneralTipoCalculoDepreciacion = jTextFieldValorCampoGeneralTipoCalculoDepreciacion;
	}

	public void setBorderResaltarValorCampoGeneralTipoCalculoDepreciacion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoCalculoDepreciacion.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralTipoCalculoDepreciacion .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosTipoCalculoDepreciacion() {
		return this.jCheckBoxSeleccionarTodosTipoCalculoDepreciacion;
	}

	public void setjCheckBoxSeleccionarTodosTipoCalculoDepreciacion(
			JCheckBox jCheckBoxSeleccionarTodosTipoCalculoDepreciacion) {
		this.jCheckBoxSeleccionarTodosTipoCalculoDepreciacion = jCheckBoxSeleccionarTodosTipoCalculoDepreciacion;
	}

	public void setBorderResaltarSeleccionarTodosTipoCalculoDepreciacion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoCalculoDepreciacion.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosTipoCalculoDepreciacion .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosTipoCalculoDepreciacion() {
		return this.jCheckBoxSeleccionadosTipoCalculoDepreciacion;
	}

	public void setjCheckBoxSeleccionadosTipoCalculoDepreciacion(
			JCheckBox jCheckBoxSeleccionadosTipoCalculoDepreciacion) {
		this.jCheckBoxSeleccionadosTipoCalculoDepreciacion = jCheckBoxSeleccionadosTipoCalculoDepreciacion;
	}
	
	public void setBorderResaltarSeleccionadosTipoCalculoDepreciacion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoCalculoDepreciacion.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosTipoCalculoDepreciacion .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesTipoCalculoDepreciacion() {
		return this.jComboBoxTiposArchivosReportesTipoCalculoDepreciacion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesTipoCalculoDepreciacion(
			JComboBox jComboBoxTiposArchivosReportesTipoCalculoDepreciacion) {
		this.jComboBoxTiposArchivosReportesTipoCalculoDepreciacion = jComboBoxTiposArchivosReportesTipoCalculoDepreciacion;
	}

	public void setBorderResaltarTiposArchivosReportesTipoCalculoDepreciacion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoCalculoDepreciacion.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesTipoCalculoDepreciacion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesTipoCalculoDepreciacion() {
		return this.jComboBoxTiposReportesTipoCalculoDepreciacion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesTipoCalculoDepreciacion(
			JComboBox jComboBoxTiposReportesTipoCalculoDepreciacion) {
		this.jComboBoxTiposReportesTipoCalculoDepreciacion = jComboBoxTiposReportesTipoCalculoDepreciacion;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoTipoCalculoDepreciacion() {
	//	return jComboBoxTiposReportesDinamicoTipoCalculoDepreciacion;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoTipoCalculoDepreciacion(
	//		JComboBox jComboBoxTiposReportesDinamicoTipoCalculoDepreciacion) {
	//	this.jComboBoxTiposReportesDinamicoTipoCalculoDepreciacion = jComboBoxTiposReportesDinamicoTipoCalculoDepreciacion;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoTipoCalculoDepreciacion() {
	//	return jComboBoxTiposArchivosReportesDinamicoTipoCalculoDepreciacion;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoTipoCalculoDepreciacion(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoTipoCalculoDepreciacion) {
	//	this.jComboBoxTiposArchivosReportesDinamicoTipoCalculoDepreciacion = jComboBoxTiposArchivosReportesDinamicoTipoCalculoDepreciacion;
	//}
	
	public void setBorderResaltarTiposReportesTipoCalculoDepreciacion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoCalculoDepreciacion.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesTipoCalculoDepreciacion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesTipoCalculoDepreciacion() {
		return this.jComboBoxTiposGraficosReportesTipoCalculoDepreciacion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesTipoCalculoDepreciacion(
			JComboBox jComboBoxTiposGraficosReportesTipoCalculoDepreciacion) {
		this.jComboBoxTiposGraficosReportesTipoCalculoDepreciacion = jComboBoxTiposGraficosReportesTipoCalculoDepreciacion;
	}
	
	public void setBorderResaltarTiposGraficosReportesTipoCalculoDepreciacion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoCalculoDepreciacion.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesTipoCalculoDepreciacion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionTipoCalculoDepreciacion() {
		return this.jComboBoxTiposPaginacionTipoCalculoDepreciacion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionTipoCalculoDepreciacion(
			JComboBox jComboBoxTiposPaginacionTipoCalculoDepreciacion) {
		this.jComboBoxTiposPaginacionTipoCalculoDepreciacion = jComboBoxTiposPaginacionTipoCalculoDepreciacion;
	}
	
	public void setBorderResaltarTiposPaginacionTipoCalculoDepreciacion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoCalculoDepreciacion.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionTipoCalculoDepreciacion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesTipoCalculoDepreciacion() {
		return this.jComboBoxTiposRelacionesTipoCalculoDepreciacion;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoCalculoDepreciacion() {
		return this.jComboBoxTiposAccionesTipoCalculoDepreciacion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoCalculoDepreciacion(
			JComboBox jComboBoxTiposRelacionesTipoCalculoDepreciacion) {
		this.jComboBoxTiposRelacionesTipoCalculoDepreciacion = jComboBoxTiposRelacionesTipoCalculoDepreciacion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoCalculoDepreciacion(
			JComboBox jComboBoxTiposAccionesTipoCalculoDepreciacion) {
		this.jComboBoxTiposAccionesTipoCalculoDepreciacion = jComboBoxTiposAccionesTipoCalculoDepreciacion;
	}
	
	public void setBorderResaltarTiposRelacionesTipoCalculoDepreciacion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoCalculoDepreciacion.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesTipoCalculoDepreciacion .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesTipoCalculoDepreciacion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoCalculoDepreciacion.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesTipoCalculoDepreciacion .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoTipoCalculoDepreciacion() {
	//	return jCheckBoxConGraficoDinamicoTipoCalculoDepreciacion;
	//}

	//public void setjCheckBoxConGraficoDinamicoTipoCalculoDepreciacion(
	//		JCheckBox jCheckBoxConGraficoDinamicoTipoCalculoDepreciacion) {
	//	this.jCheckBoxConGraficoDinamicoTipoCalculoDepreciacion = jCheckBoxConGraficoDinamicoTipoCalculoDepreciacion;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoTipoCalculoDepreciacion() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarTipoCalculoDepreciacion.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoTipoCalculoDepreciacion .setBorder(borderResaltar);		
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
		this.tipocalculodepreciacionSessionBean=new TipoCalculoDepreciacionSessionBean();
		
		this.tipocalculodepreciacionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipocalculodepreciacionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipocalculodepreciacionSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=TipoCalculoDepreciacionJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=TipoCalculoDepreciacionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoCalculoDepreciacionJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoCalculoDepreciacionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoCalculoDepreciacionJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Calculo Depreciacion MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.tipocalculodepreciacionSessionBean.getEsGuardarRelacionado()) {
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
		
		TipoCalculoDepreciacionJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("TipoCalculoDepreciacion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarTipoCalculoDepreciacion= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarTipoCalculoDepreciacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarTipoCalculoDepreciacion,this.jTtoolBarTipoCalculoDepreciacion,
							"nuevo","nuevo","Nuevo"+" "+TipoCalculoDepreciacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoCalculoDepreciacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarTipoCalculoDepreciacion,this.jTtoolBarTipoCalculoDepreciacion,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoCalculoDepreciacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarTipoCalculoDepreciacion,this.jTtoolBarTipoCalculoDepreciacion,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+TipoCalculoDepreciacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarTipoCalculoDepreciacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarTipoCalculoDepreciacion,this.jTtoolBarTipoCalculoDepreciacion,
							"duplicar","duplicar","Duplicar"+" "+TipoCalculoDepreciacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarTipoCalculoDepreciacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarTipoCalculoDepreciacion,this.jTtoolBarTipoCalculoDepreciacion,
							"copiar","copiar","Copiar"+" "+TipoCalculoDepreciacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarTipoCalculoDepreciacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarTipoCalculoDepreciacion,this.jTtoolBarTipoCalculoDepreciacion,
							"ver_form","ver_form","Ver"+" "+TipoCalculoDepreciacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarTipoCalculoDepreciacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoCalculoDepreciacion,this.jTtoolBarTipoCalculoDepreciacion,
							"recargar","recargar","Recargar"+" "+TipoCalculoDepreciacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarTipoCalculoDepreciacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoCalculoDepreciacion,this.jTtoolBarTipoCalculoDepreciacion,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarTipoCalculoDepreciacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoCalculoDepreciacion,this.jTtoolBarTipoCalculoDepreciacion,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarTipoCalculoDepreciacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarTipoCalculoDepreciacion,this.jTtoolBarTipoCalculoDepreciacion,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarTipoCalculoDepreciacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarTipoCalculoDepreciacion,this.jTtoolBarTipoCalculoDepreciacion,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarTipoCalculoDepreciacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarTipoCalculoDepreciacion,this.jTtoolBarTipoCalculoDepreciacion,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+TipoCalculoDepreciacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarTipoCalculoDepreciacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarTipoCalculoDepreciacion,this.jTtoolBarTipoCalculoDepreciacion,
							"cerrar","cerrar","Salir"+" "+TipoCalculoDepreciacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarTipoCalculoDepreciacion=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarTipoCalculoDepreciacion;
			
				this.jButtonProcesarInformacionToolBarTipoCalculoDepreciacion=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarTipoCalculoDepreciacion;
				
		//protected JButton jButtonModificarToolBarTipoCalculoDepreciacion;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarTipoCalculoDepreciacion=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuTipoCalculoDepreciacion=new JMenuMe("General");
		this.jmenuArchivoTipoCalculoDepreciacion=new JMenuMe("Archivo");
		this.jmenuAccionesTipoCalculoDepreciacion=new JMenuMe("Acciones");
		this.jmenuDatosTipoCalculoDepreciacion=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoCalculoDepreciacion= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoCalculoDepreciacion.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoCalculoDepreciacion,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoCalculoDepreciacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarTipoCalculoDepreciacion= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarTipoCalculoDepreciacion.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarTipoCalculoDepreciacion,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarTipoCalculoDepreciacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesTipoCalculoDepreciacion= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesTipoCalculoDepreciacion.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesTipoCalculoDepreciacion,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesTipoCalculoDepreciacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosTipoCalculoDepreciacion= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoCalculoDepreciacion.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoCalculoDepreciacion,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoCalculoDepreciacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarTipoCalculoDepreciacion= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarTipoCalculoDepreciacion.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarTipoCalculoDepreciacion,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarTipoCalculoDepreciacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormTipoCalculoDepreciacion= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormTipoCalculoDepreciacion.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormTipoCalculoDepreciacion,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormTipoCalculoDepreciacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaTipoCalculoDepreciacion= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaTipoCalculoDepreciacion.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaTipoCalculoDepreciacion,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaTipoCalculoDepreciacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoCalculoDepreciacion= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoCalculoDepreciacion.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoCalculoDepreciacion,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoCalculoDepreciacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionTipoCalculoDepreciacion= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionTipoCalculoDepreciacion.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionTipoCalculoDepreciacion,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionTipoCalculoDepreciacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionTipoCalculoDepreciacion= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionTipoCalculoDepreciacion.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionTipoCalculoDepreciacion,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresTipoCalculoDepreciacion= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresTipoCalculoDepreciacion.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresTipoCalculoDepreciacion,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresTipoCalculoDepreciacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesTipoCalculoDepreciacion= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesTipoCalculoDepreciacion.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesTipoCalculoDepreciacion,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesTipoCalculoDepreciacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByTipoCalculoDepreciacion= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByTipoCalculoDepreciacion.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByTipoCalculoDepreciacion,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByTipoCalculoDepreciacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoCalculoDepreciacion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoCalculoDepreciacion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoCalculoDepreciacion,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoCalculoDepreciacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByTipoCalculoDepreciacion= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByTipoCalculoDepreciacion.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByTipoCalculoDepreciacion,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByTipoCalculoDepreciacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoCalculoDepreciacion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoCalculoDepreciacion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoCalculoDepreciacion,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoCalculoDepreciacion, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosTipoCalculoDepreciacion= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosTipoCalculoDepreciacion.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosTipoCalculoDepreciacion,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosTipoCalculoDepreciacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoTipoCalculoDepreciacion.add(this.jMenuItemCerrarTipoCalculoDepreciacion);
			
			this.jmenuAccionesTipoCalculoDepreciacion.add(this.jMenuItemNuevoTipoCalculoDepreciacion);
			this.jmenuAccionesTipoCalculoDepreciacion.add(this.jMenuItemNuevoGuardarCambiosTipoCalculoDepreciacion);
			this.jmenuAccionesTipoCalculoDepreciacion.add(this.jMenuItemNuevoRelacionesTipoCalculoDepreciacion);
			this.jmenuAccionesTipoCalculoDepreciacion.add(this.jMenuItemGuardarCambiosTablaTipoCalculoDepreciacion);		
			this.jmenuAccionesTipoCalculoDepreciacion.add(this.jMenuItemDuplicarTipoCalculoDepreciacion);		
			this.jmenuAccionesTipoCalculoDepreciacion.add(this.jMenuItemCopiarTipoCalculoDepreciacion);		
			this.jmenuAccionesTipoCalculoDepreciacion.add(this.jMenuItemVerFormTipoCalculoDepreciacion);		
			
			this.jmenuDatosTipoCalculoDepreciacion.add(this.jMenuItemRecargarInformacionTipoCalculoDepreciacion);				
			this.jmenuDatosTipoCalculoDepreciacion.add(this.jMenuItemAnterioresTipoCalculoDepreciacion);				
			this.jmenuDatosTipoCalculoDepreciacion.add(this.jMenuItemSiguientesTipoCalculoDepreciacion);				
			this.jmenuDatosTipoCalculoDepreciacion.add(this.jMenuItemAbrirOrderByTipoCalculoDepreciacion);				
			this.jmenuDatosTipoCalculoDepreciacion.add(this.jMenuItemMostrarOcultarTipoCalculoDepreciacion);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesTipoCalculoDepreciacion.add(this.jMenuItemGuardarCambiosTipoCalculoDepreciacion);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoTipoCalculoDepreciacion, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesTipoCalculoDepreciacion, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosTipoCalculoDepreciacion, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarTipoCalculoDepreciacion.add(this.jmenuArchivoTipoCalculoDepreciacion);		
			this.jmenuBarTipoCalculoDepreciacion.add(this.jmenuAccionesTipoCalculoDepreciacion);		
			this.jmenuBarTipoCalculoDepreciacion.add(this.jmenuDatosTipoCalculoDepreciacion);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarTipoCalculoDepreciacion);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasTipoCalculoDepreciacion() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdPaisTipoCalculoDepreciacion=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdPaisTipoCalculoDepreciacion.setToolTipText("Buscar Por Pais ");
		this.jButtonFK_IdPaisTipoCalculoDepreciacion= new JButtonMe();
		this.jButtonFK_IdPaisTipoCalculoDepreciacion.setText("Buscar");
		this.jButtonFK_IdPaisTipoCalculoDepreciacion.setToolTipText("Buscar Por Pais ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdPaisTipoCalculoDepreciacion,"buscar_button","Buscar Por Pais ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdPaisTipoCalculoDepreciacion, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_paisFK_IdPaisTipoCalculoDepreciacion = new JLabelMe();
		jLabelid_paisFK_IdPaisTipoCalculoDepreciacion.setText("Pais :");
		jLabelid_paisFK_IdPaisTipoCalculoDepreciacion.setToolTipText("Pais");
		jLabelid_paisFK_IdPaisTipoCalculoDepreciacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_paisFK_IdPaisTipoCalculoDepreciacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_paisFK_IdPaisTipoCalculoDepreciacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_paisFK_IdPaisTipoCalculoDepreciacion,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_paisFK_IdPaisTipoCalculoDepreciacion= new JComboBoxMe();
		jComboBoxid_paisFK_IdPaisTipoCalculoDepreciacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_paisFK_IdPaisTipoCalculoDepreciacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_paisFK_IdPaisTipoCalculoDepreciacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_paisFK_IdPaisTipoCalculoDepreciacion,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasTipoCalculoDepreciacion=new JTabbedPane();


		this.jTabbedPaneBusquedasTipoCalculoDepreciacion.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));
		this.jTabbedPaneBusquedasTipoCalculoDepreciacion.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));
		this.jTabbedPaneBusquedasTipoCalculoDepreciacion.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));

		//this.jTabbedPaneBusquedasTipoCalculoDepreciacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasTipoCalculoDepreciacion.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasTipoCalculoDepreciacion,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleTipoCalculoDepreciacion = new TipoCalculoDepreciacionDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Tipo Calculo Depreciacion DATOS");
			this.jInternalFrameDetalleFormTipoCalculoDepreciacion = new TipoCalculoDepreciacionDetalleFormJInternalFrame(jDesktopPane,this.tipocalculodepreciacionSessionBean.getConGuardarRelaciones(),this.tipocalculodepreciacionSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormTipoCalculoDepreciacion = null;//new TipoCalculoDepreciacionDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoCalculoDepreciacion= new GridBagLayout();
		
		
		this.jTableDatosTipoCalculoDepreciacion = new JTableMe();      
		
		String sToolTipTipoCalculoDepreciacion="";
		sToolTipTipoCalculoDepreciacion=TipoCalculoDepreciacionConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoCalculoDepreciacion+="(ActivosFijos.TipoCalculoDepreciacion)";
		}
		
		if(!this.tipocalculodepreciacionSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoCalculoDepreciacion+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosTipoCalculoDepreciacion.setToolTipText(sToolTipTipoCalculoDepreciacion);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosTipoCalculoDepreciacion);
		this.jTableDatosTipoCalculoDepreciacion.setAutoCreateRowSorter(true);
		this.jTableDatosTipoCalculoDepreciacion.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosTipoCalculoDepreciacion.setRowSelectionAllowed(true);
		this.jTableDatosTipoCalculoDepreciacion.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosTipoCalculoDepreciacion,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoTipoCalculoDepreciacion = new JButtonMe();
		this.jButtonDuplicarTipoCalculoDepreciacion = new JButtonMe();
		this.jButtonCopiarTipoCalculoDepreciacion = new JButtonMe();
		this.jButtonVerFormTipoCalculoDepreciacion = new JButtonMe();
		this.jButtonNuevoRelacionesTipoCalculoDepreciacion = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaTipoCalculoDepreciacion = new JButtonMe();
		this.jButtonCerrarTipoCalculoDepreciacion = new JButtonMe();
		
		this.jScrollPanelDatosTipoCalculoDepreciacion = new JScrollPane();   
        this.jScrollPanelDatosGeneralTipoCalculoDepreciacion = new JScrollPane();
		
				
		
		
		this.jPanelAccionesTipoCalculoDepreciacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Calculo Depreciacion";
		
		if(!this.tipocalculodepreciacionSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoCalculoDepreciacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Calculo Depreciacions" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoCalculoDepreciacion.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralTipoCalculoDepreciacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesTipoCalculoDepreciacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoCalculoDepreciacion.setToolTipText("Acciones");
        this.jPanelAccionesTipoCalculoDepreciacion.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoCalculoDepreciacion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoCalculoDepreciacion, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoTipoCalculoDepreciacion=new ReporteDinamicoJInternalFrame(TipoCalculoDepreciacionConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoTipoCalculoDepreciacion();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionTipoCalculoDepreciacion=new ImportacionJInternalFrame(TipoCalculoDepreciacionConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionTipoCalculoDepreciacion();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByTipoCalculoDepreciacion = new JButtonMe();
		
		this.jButtonAbrirOrderByTipoCalculoDepreciacion.setText("Orden");
		this.jButtonAbrirOrderByTipoCalculoDepreciacion.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoCalculoDepreciacion,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoCalculoDepreciacion, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByTipoCalculoDepreciacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByTipoCalculoDepreciacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoCalculoDepreciacion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoCalculoDepreciacion,false,this);
			
			//this.cargarOrderByTipoCalculoDepreciacion(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoCalculoDepreciacion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoCalculoDepreciacion,true,this);
			
			//this.cargarOrderByTipoCalculoDepreciacion(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosTipoCalculoDepreciacion.setMinimumSize(new Dimension(400,50));//430
		this.jTableDatosTipoCalculoDepreciacion.setMaximumSize(new Dimension(400,50));//430
		this.jTableDatosTipoCalculoDepreciacion.setPreferredSize(new Dimension(400,50));//430
		
		this.jScrollPanelDatosTipoCalculoDepreciacion.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoCalculoDepreciacion.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoCalculoDepreciacion.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoTipoCalculoDepreciacion.setText("Nuevo");
		this.jButtonDuplicarTipoCalculoDepreciacion.setText("Duplicar");
		this.jButtonCopiarTipoCalculoDepreciacion.setText("Copiar");
		this.jButtonVerFormTipoCalculoDepreciacion.setText("Ver");
		this.jButtonNuevoRelacionesTipoCalculoDepreciacion.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaTipoCalculoDepreciacion.setText("Guardar");
		this.jButtonCerrarTipoCalculoDepreciacion.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoCalculoDepreciacion,"nuevo_button","Nuevo",this.tipocalculodepreciacionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarTipoCalculoDepreciacion,"duplicar_button","Duplicar",this.tipocalculodepreciacionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarTipoCalculoDepreciacion,"copiar_button","Copiar",this.tipocalculodepreciacionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormTipoCalculoDepreciacion,"ver_form","Ver",this.tipocalculodepreciacionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesTipoCalculoDepreciacion,"nuevorelaciones_button","Nuevo Rel",this.tipocalculodepreciacionSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoCalculoDepreciacion,"guardarcambiostabla_button","Guardar",this.tipocalculodepreciacionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoCalculoDepreciacion,"cerrar_button","Salir",this.tipocalculodepreciacionSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoCalculoDepreciacion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarTipoCalculoDepreciacion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarTipoCalculoDepreciacion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormTipoCalculoDepreciacion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesTipoCalculoDepreciacion, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoCalculoDepreciacion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoCalculoDepreciacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoTipoCalculoDepreciacion.setToolTipText("Nuevo"+" "+TipoCalculoDepreciacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarTipoCalculoDepreciacion.setToolTipText("Duplicar"+" "+TipoCalculoDepreciacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarTipoCalculoDepreciacion.setToolTipText("Copiar"+" "+TipoCalculoDepreciacionConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormTipoCalculoDepreciacion.setToolTipText("Ver"+" "+TipoCalculoDepreciacionConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesTipoCalculoDepreciacion.setToolTipText("Nuevo Rel"+" "+TipoCalculoDepreciacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaTipoCalculoDepreciacion.setToolTipText("Guardar"+" "+TipoCalculoDepreciacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoCalculoDepreciacion.setToolTipText("Salir"+" "+TipoCalculoDepreciacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoCalculoDepreciacion";
		inputMap = this.jButtonNuevoTipoCalculoDepreciacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoCalculoDepreciacion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoCalculoDepreciacion"));
		
		//DUPLICAR
		sMapKey = "DuplicarTipoCalculoDepreciacion";
		inputMap = this.jButtonDuplicarTipoCalculoDepreciacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarTipoCalculoDepreciacion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarTipoCalculoDepreciacion"));
		
		//COPIAR
		sMapKey = "CopiarTipoCalculoDepreciacion";
		inputMap = this.jButtonCopiarTipoCalculoDepreciacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarTipoCalculoDepreciacion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarTipoCalculoDepreciacion"));
		
		//VEr FORM
		sMapKey = "VerFormTipoCalculoDepreciacion";
		inputMap = this.jButtonVerFormTipoCalculoDepreciacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormTipoCalculoDepreciacion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormTipoCalculoDepreciacion"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesTipoCalculoDepreciacion";
		inputMap = this.jButtonNuevoRelacionesTipoCalculoDepreciacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesTipoCalculoDepreciacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesTipoCalculoDepreciacion"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarTipoCalculoDepreciacion";
		inputMap = this.jButtonModificarTipoCalculoDepreciacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarTipoCalculoDepreciacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarTipoCalculoDepreciacion"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarTipoCalculoDepreciacion";
		inputMap = this.jButtonCerrarTipoCalculoDepreciacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoCalculoDepreciacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoCalculoDepreciacion"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoCalculoDepreciacion";
		inputMap = this.jButtonGuardarCambiosTablaTipoCalculoDepreciacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoCalculoDepreciacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoCalculoDepreciacion"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesTipoCalculoDepreciacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesTipoCalculoDepreciacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionTipoCalculoDepreciacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1TipoCalculoDepreciacion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2TipoCalculoDepreciacion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3TipoCalculoDepreciacion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4TipoCalculoDepreciacion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5TipoCalculoDepreciacion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesTipoCalculoDepreciacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesTipoCalculoDepreciacion.setName("jPanelParametrosReportesTipoCalculoDepreciacion"); 
		
		this.jPanelParametrosReportesAccionesTipoCalculoDepreciacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesTipoCalculoDepreciacion.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesTipoCalculoDepreciacion.setName("jPanelParametrosReportesAccionesTipoCalculoDepreciacion"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesTipoCalculoDepreciacion, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesTipoCalculoDepreciacion, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionTipoCalculoDepreciacion = new JButtonMe();
		this.jButtonRecargarInformacionTipoCalculoDepreciacion.setText("Recargar");
		this.jButtonRecargarInformacionTipoCalculoDepreciacion.setToolTipText("Recargar"+" "+TipoCalculoDepreciacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionTipoCalculoDepreciacion,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionTipoCalculoDepreciacion = new JButtonMe();
		this.jButtonProcesarInformacionTipoCalculoDepreciacion.setText("Procesar");
		this.jButtonProcesarInformacionTipoCalculoDepreciacion.setToolTipText("Procesar"+" "+TipoCalculoDepreciacionConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionTipoCalculoDepreciacion.setVisible(false);
			
		this.jButtonProcesarInformacionTipoCalculoDepreciacion.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoCalculoDepreciacion.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoCalculoDepreciacion.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesTipoCalculoDepreciacion = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoCalculoDepreciacion.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesTipoCalculoDepreciacion.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesTipoCalculoDepreciacion = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoCalculoDepreciacion.setText("TIPO");       
		this.jComboBoxTiposReportesTipoCalculoDepreciacion.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesTipoCalculoDepreciacion = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoCalculoDepreciacion.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesTipoCalculoDepreciacion.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionTipoCalculoDepreciacion = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionTipoCalculoDepreciacion.setText("Paginacion");
		this.jComboBoxTiposPaginacionTipoCalculoDepreciacion.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesTipoCalculoDepreciacion = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesTipoCalculoDepreciacion.setText("Accion");
		this.jComboBoxTiposRelacionesTipoCalculoDepreciacion.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesTipoCalculoDepreciacion = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoCalculoDepreciacion.setText("Accion");
		this.jComboBoxTiposAccionesTipoCalculoDepreciacion.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarTipoCalculoDepreciacion = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarTipoCalculoDepreciacion.setText("Accion");
		this.jComboBoxTiposSeleccionarTipoCalculoDepreciacion.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralTipoCalculoDepreciacion=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralTipoCalculoDepreciacion.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoCalculoDepreciacion.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoCalculoDepreciacion.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesTipoCalculoDepreciacion = new JLabelMe();
		
		this.jLabelAccionesTipoCalculoDepreciacion.setText("Acciones");		
		this.jLabelAccionesTipoCalculoDepreciacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoCalculoDepreciacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoCalculoDepreciacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosTipoCalculoDepreciacion = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosTipoCalculoDepreciacion.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosTipoCalculoDepreciacion.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosTipoCalculoDepreciacion = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosTipoCalculoDepreciacion.setText("Seleccionados");
		this.jCheckBoxSeleccionadosTipoCalculoDepreciacion.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaTipoCalculoDepreciacion = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaTipoCalculoDepreciacion.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaTipoCalculoDepreciacion.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteTipoCalculoDepreciacion = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteTipoCalculoDepreciacion.setText("Graf.");
		this.jCheckBoxConGraficoReporteTipoCalculoDepreciacion.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresTipoCalculoDepreciacion = new JButtonMe();
		//this.jButtonAnterioresTipoCalculoDepreciacion.setText("<<");
        this.jButtonAnterioresTipoCalculoDepreciacion.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresTipoCalculoDepreciacion,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresTipoCalculoDepreciacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesTipoCalculoDepreciacion = new JButtonMe();
		//this.jButtonSiguientesTipoCalculoDepreciacion.setText(">>");
        this.jButtonSiguientesTipoCalculoDepreciacion.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesTipoCalculoDepreciacion,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesTipoCalculoDepreciacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosTipoCalculoDepreciacion = new JButtonMe();
		this.jButtonNuevoGuardarCambiosTipoCalculoDepreciacion.setText("Nue");
        this.jButtonNuevoGuardarCambiosTipoCalculoDepreciacion.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosTipoCalculoDepreciacion,"nuevoguardarcambios_button","Nue",this.tipocalculodepreciacionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosTipoCalculoDepreciacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosTipoCalculoDepreciacion";
		inputMap = this.jButtonNuevoGuardarCambiosTipoCalculoDepreciacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosTipoCalculoDepreciacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosTipoCalculoDepreciacion"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionTipoCalculoDepreciacion";
		inputMap = this.jButtonRecargarInformacionTipoCalculoDepreciacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionTipoCalculoDepreciacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionTipoCalculoDepreciacion"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesTipoCalculoDepreciacion";
		inputMap = this.jButtonSiguientesTipoCalculoDepreciacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesTipoCalculoDepreciacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesTipoCalculoDepreciacion"));
		
		//ANTERIORES		
		sMapKey = "AnterioresTipoCalculoDepreciacion";
		inputMap = this.jButtonAnterioresTipoCalculoDepreciacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresTipoCalculoDepreciacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresTipoCalculoDepreciacion"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasTipoCalculoDepreciacion();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesTipoCalculoDepreciacion.setMinimumSize(new Dimension(this.getWidth(),TipoCalculoDepreciacionBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoCalculoDepreciacionBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoCalculoDepreciacion.setMaximumSize(new Dimension(this.getWidth(),TipoCalculoDepreciacionBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoCalculoDepreciacionBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoCalculoDepreciacion.setPreferredSize(new Dimension(this.getWidth(),TipoCalculoDepreciacionBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoCalculoDepreciacionBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionTipoCalculoDepreciacion = new GridBagLayout();

			this.jPanelPaginacionTipoCalculoDepreciacion.setLayout(gridaBagLayoutPaginacionTipoCalculoDepreciacion);						
			
			this.gridBagConstraintsTipoCalculoDepreciacion = new GridBagConstraints();
			this.gridBagConstraintsTipoCalculoDepreciacion.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsTipoCalculoDepreciacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCalculoDepreciacion.gridy = 0;
			this.gridBagConstraintsTipoCalculoDepreciacion.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionTipoCalculoDepreciacion.add(this.jButtonAnterioresTipoCalculoDepreciacion, this.gridBagConstraintsTipoCalculoDepreciacion);
					
						
			this.gridBagConstraintsTipoCalculoDepreciacion = new GridBagConstraints();
			this.gridBagConstraintsTipoCalculoDepreciacion.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoCalculoDepreciacion.gridy = 0;
			
			this.jPanelPaginacionTipoCalculoDepreciacion.add(this.jButtonNuevoGuardarCambiosTipoCalculoDepreciacion, this.gridBagConstraintsTipoCalculoDepreciacion);
						
			
			this.gridBagConstraintsTipoCalculoDepreciacion = new GridBagConstraints();
			this.gridBagConstraintsTipoCalculoDepreciacion.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsTipoCalculoDepreciacion.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoCalculoDepreciacion.gridy = 0;
			this.jPanelPaginacionTipoCalculoDepreciacion.add(this.jButtonSiguientesTipoCalculoDepreciacion, this.gridBagConstraintsTipoCalculoDepreciacion);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsTipoCalculoDepreciacion = new GridBagConstraints();
			this.gridBagConstraintsTipoCalculoDepreciacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCalculoDepreciacion.gridy = 1;
			this.gridBagConstraintsTipoCalculoDepreciacion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoCalculoDepreciacion.add(this.jButtonNuevoTipoCalculoDepreciacion, this.gridBagConstraintsTipoCalculoDepreciacion);
						
			
			
			if(!this.tipocalculodepreciacionSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsTipoCalculoDepreciacion = new GridBagConstraints();
				this.gridBagConstraintsTipoCalculoDepreciacion.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoCalculoDepreciacion.gridy = 1;
				this.gridBagConstraintsTipoCalculoDepreciacion.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionTipoCalculoDepreciacion.add(this.jButtonGuardarCambiosTablaTipoCalculoDepreciacion, this.gridBagConstraintsTipoCalculoDepreciacion);
			}
			
			
			
			this.gridBagConstraintsTipoCalculoDepreciacion = new GridBagConstraints();
			this.gridBagConstraintsTipoCalculoDepreciacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCalculoDepreciacion.gridy = 1;
			this.gridBagConstraintsTipoCalculoDepreciacion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoCalculoDepreciacion.add(this.jButtonDuplicarTipoCalculoDepreciacion, this.gridBagConstraintsTipoCalculoDepreciacion);
			
			this.gridBagConstraintsTipoCalculoDepreciacion = new GridBagConstraints();
			this.gridBagConstraintsTipoCalculoDepreciacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCalculoDepreciacion.gridy = 1;
			this.gridBagConstraintsTipoCalculoDepreciacion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoCalculoDepreciacion.add(this.jButtonCopiarTipoCalculoDepreciacion, this.gridBagConstraintsTipoCalculoDepreciacion);
		
			this.gridBagConstraintsTipoCalculoDepreciacion = new GridBagConstraints();
			this.gridBagConstraintsTipoCalculoDepreciacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCalculoDepreciacion.gridy = 1;
			this.gridBagConstraintsTipoCalculoDepreciacion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoCalculoDepreciacion.add(this.jButtonVerFormTipoCalculoDepreciacion, this.gridBagConstraintsTipoCalculoDepreciacion);
		
			this.gridBagConstraintsTipoCalculoDepreciacion = new GridBagConstraints();
			this.gridBagConstraintsTipoCalculoDepreciacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCalculoDepreciacion.gridy = 1;
			this.gridBagConstraintsTipoCalculoDepreciacion.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionTipoCalculoDepreciacion.add(this.jButtonCerrarTipoCalculoDepreciacion, this.gridBagConstraintsTipoCalculoDepreciacion);
		
		
		
		this.jButtonRecargarInformacionTipoCalculoDepreciacion.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoCalculoDepreciacion.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoCalculoDepreciacion.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionTipoCalculoDepreciacion, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesTipoCalculoDepreciacion.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoCalculoDepreciacion.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoCalculoDepreciacion.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesTipoCalculoDepreciacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesTipoCalculoDepreciacion.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoCalculoDepreciacion.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoCalculoDepreciacion.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesTipoCalculoDepreciacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesTipoCalculoDepreciacion.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoCalculoDepreciacion.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoCalculoDepreciacion.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesTipoCalculoDepreciacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionTipoCalculoDepreciacion.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoCalculoDepreciacion.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoCalculoDepreciacion.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionTipoCalculoDepreciacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesTipoCalculoDepreciacion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoCalculoDepreciacion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoCalculoDepreciacion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesTipoCalculoDepreciacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesTipoCalculoDepreciacion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoCalculoDepreciacion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoCalculoDepreciacion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoCalculoDepreciacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarTipoCalculoDepreciacion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoCalculoDepreciacion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoCalculoDepreciacion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarTipoCalculoDepreciacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaTipoCalculoDepreciacion.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoCalculoDepreciacion.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoCalculoDepreciacion.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaTipoCalculoDepreciacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteTipoCalculoDepreciacion.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoCalculoDepreciacion.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoCalculoDepreciacion.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteTipoCalculoDepreciacion, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosTipoCalculoDepreciacion.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoCalculoDepreciacion.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoCalculoDepreciacion.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosTipoCalculoDepreciacion, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosTipoCalculoDepreciacion.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoCalculoDepreciacion.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoCalculoDepreciacion.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosTipoCalculoDepreciacion, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesTipoCalculoDepreciacion = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesTipoCalculoDepreciacion = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1TipoCalculoDepreciacion = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2TipoCalculoDepreciacion = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3TipoCalculoDepreciacion = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4TipoCalculoDepreciacion = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesTipoCalculoDepreciacion.setLayout(gridaBagParametrosReportesTipoCalculoDepreciacion);
			this.jPanelParametrosReportesAccionesTipoCalculoDepreciacion.setLayout(gridaBagParametrosReportesAccionesTipoCalculoDepreciacion);
			
			
			this.jPanelParametrosAuxiliar1TipoCalculoDepreciacion.setLayout(gridaBagParametrosAuxiliar1TipoCalculoDepreciacion);
			this.jPanelParametrosAuxiliar2TipoCalculoDepreciacion.setLayout(gridaBagParametrosAuxiliar2TipoCalculoDepreciacion);
			this.jPanelParametrosAuxiliar3TipoCalculoDepreciacion.setLayout(gridaBagParametrosAuxiliar3TipoCalculoDepreciacion);
			this.jPanelParametrosAuxiliar4TipoCalculoDepreciacion.setLayout(gridaBagParametrosAuxiliar4TipoCalculoDepreciacion);
			//this.jPanelParametrosAuxiliar5TipoCalculoDepreciacion.setLayout(gridaBagParametrosAuxiliar2TipoCalculoDepreciacion);			
			
			
			
			
			this.gridBagConstraintsTipoCalculoDepreciacion = new GridBagConstraints();
			this.gridBagConstraintsTipoCalculoDepreciacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCalculoDepreciacion.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoCalculoDepreciacion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoCalculoDepreciacion.add(this.jButtonRecargarInformacionTipoCalculoDepreciacion, this.gridBagConstraintsTipoCalculoDepreciacion);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsTipoCalculoDepreciacion = new GridBagConstraints();
			this.gridBagConstraintsTipoCalculoDepreciacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCalculoDepreciacion.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCalculoDepreciacion.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoCalculoDepreciacion.add(this.jComboBoxTiposPaginacionTipoCalculoDepreciacion, this.gridBagConstraintsTipoCalculoDepreciacion);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsTipoCalculoDepreciacion = new GridBagConstraints();
			this.gridBagConstraintsTipoCalculoDepreciacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCalculoDepreciacion.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCalculoDepreciacion.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoCalculoDepreciacion.add(this.jCheckBoxConAltoMaximoTablaTipoCalculoDepreciacion, this.gridBagConstraintsTipoCalculoDepreciacion);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsTipoCalculoDepreciacion = new GridBagConstraints();
			this.gridBagConstraintsTipoCalculoDepreciacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCalculoDepreciacion.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCalculoDepreciacion.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoCalculoDepreciacion.add(this.jComboBoxTiposArchivosReportesTipoCalculoDepreciacion, this.gridBagConstraintsTipoCalculoDepreciacion);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsTipoCalculoDepreciacion = new GridBagConstraints();
			this.gridBagConstraintsTipoCalculoDepreciacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCalculoDepreciacion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCalculoDepreciacion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoCalculoDepreciacion.add(this.jPanelParametrosAuxiliar1TipoCalculoDepreciacion, this.gridBagConstraintsTipoCalculoDepreciacion);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsTipoCalculoDepreciacion = new GridBagConstraints();
			this.gridBagConstraintsTipoCalculoDepreciacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCalculoDepreciacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCalculoDepreciacion.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoCalculoDepreciacion.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4TipoCalculoDepreciacion.add(this.jComboBoxTiposReportesTipoCalculoDepreciacion, this.gridBagConstraintsTipoCalculoDepreciacion);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsTipoCalculoDepreciacion = new GridBagConstraints();
			this.gridBagConstraintsTipoCalculoDepreciacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCalculoDepreciacion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCalculoDepreciacion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoCalculoDepreciacion.add(this.jPanelParametrosAuxiliar4TipoCalculoDepreciacion, this.gridBagConstraintsTipoCalculoDepreciacion);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsTipoCalculoDepreciacion = new GridBagConstraints();
			this.gridBagConstraintsTipoCalculoDepreciacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCalculoDepreciacion.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCalculoDepreciacion.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoCalculoDepreciacion.add(this.jComboBoxTiposReportesTipoCalculoDepreciacion, this.gridBagConstraintsTipoCalculoDepreciacion);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsTipoCalculoDepreciacion = new GridBagConstraints();
			this.gridBagConstraintsTipoCalculoDepreciacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCalculoDepreciacion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCalculoDepreciacion.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoCalculoDepreciacion.add(this.jCheckBoxGenerarReporteTipoCalculoDepreciacion, this.gridBagConstraintsTipoCalculoDepreciacion);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsTipoCalculoDepreciacion = new GridBagConstraints();
			this.gridBagConstraintsTipoCalculoDepreciacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCalculoDepreciacion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCalculoDepreciacion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoCalculoDepreciacion.add(this.jPanelParametrosAuxiliar2TipoCalculoDepreciacion, this.gridBagConstraintsTipoCalculoDepreciacion);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsTipoCalculoDepreciacion = new GridBagConstraints();
			this.gridBagConstraintsTipoCalculoDepreciacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCalculoDepreciacion.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoCalculoDepreciacion.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoCalculoDepreciacion.add(this.jLabelAccionesTipoCalculoDepreciacion, this.gridBagConstraintsTipoCalculoDepreciacion);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsTipoCalculoDepreciacion = new GridBagConstraints();
				this.gridBagConstraintsTipoCalculoDepreciacion.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsTipoCalculoDepreciacion.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsTipoCalculoDepreciacion.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesTipoCalculoDepreciacion.add(this.jButtonAbrirOrderByTipoCalculoDepreciacion, this.gridBagConstraintsTipoCalculoDepreciacion);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsTipoCalculoDepreciacion = new GridBagConstraints();
			this.gridBagConstraintsTipoCalculoDepreciacion.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsTipoCalculoDepreciacion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCalculoDepreciacion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoCalculoDepreciacion.add(this.jComboBoxTiposSeleccionarTipoCalculoDepreciacion, this.gridBagConstraintsTipoCalculoDepreciacion);			
			
			
			/*
			this.gridBagConstraintsTipoCalculoDepreciacion = new GridBagConstraints();
			this.gridBagConstraintsTipoCalculoDepreciacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCalculoDepreciacion.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoCalculoDepreciacion.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoCalculoDepreciacion.add(this.jCheckBoxSeleccionarTodosTipoCalculoDepreciacion, this.gridBagConstraintsTipoCalculoDepreciacion);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsTipoCalculoDepreciacion = new GridBagConstraints();
			this.gridBagConstraintsTipoCalculoDepreciacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCalculoDepreciacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCalculoDepreciacion.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoCalculoDepreciacion.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoCalculoDepreciacion.add(this.jCheckBoxSeleccionarTodosTipoCalculoDepreciacion, this.gridBagConstraintsTipoCalculoDepreciacion);															
				
			this.gridBagConstraintsTipoCalculoDepreciacion = new GridBagConstraints();
			this.gridBagConstraintsTipoCalculoDepreciacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCalculoDepreciacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCalculoDepreciacion.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoCalculoDepreciacion.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoCalculoDepreciacion.add(this.jCheckBoxSeleccionadosTipoCalculoDepreciacion, this.gridBagConstraintsTipoCalculoDepreciacion);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsTipoCalculoDepreciacion = new GridBagConstraints();
			this.gridBagConstraintsTipoCalculoDepreciacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCalculoDepreciacion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCalculoDepreciacion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoCalculoDepreciacion.add(this.jPanelParametrosAuxiliar3TipoCalculoDepreciacion, this.gridBagConstraintsTipoCalculoDepreciacion);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsTipoCalculoDepreciacion = new GridBagConstraints();
			this.gridBagConstraintsTipoCalculoDepreciacion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCalculoDepreciacion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoCalculoDepreciacion.add(this.jComboBoxTiposAccionesTipoCalculoDepreciacion, this.gridBagConstraintsTipoCalculoDepreciacion);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosTipoCalculoDepreciacion = new GridBagLayout();

			this.jScrollPanelDatosTipoCalculoDepreciacion.setLayout(gridaBagLayoutDatosTipoCalculoDepreciacion);
			
			this.gridBagConstraintsTipoCalculoDepreciacion = new GridBagConstraints();
			this.gridBagConstraintsTipoCalculoDepreciacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCalculoDepreciacion.gridy = 0;
			this.gridBagConstraintsTipoCalculoDepreciacion.gridx = 0;
			
			this.jScrollPanelDatosTipoCalculoDepreciacion.add(this.jTableDatosTipoCalculoDepreciacion, this.gridBagConstraintsTipoCalculoDepreciacion);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosTipoCalculoDepreciacion.setViewportView(this.jTableDatosTipoCalculoDepreciacion);
		this.jTableDatosTipoCalculoDepreciacion.setFillsViewportHeight(true);
		this.jTableDatosTipoCalculoDepreciacion.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesTipoCalculoDepreciacion= new GridBagLayout();
		this.jPanelAccionesTipoCalculoDepreciacion.setLayout(gridaBagLayoutAccionesTipoCalculoDepreciacion);
		
		
		/*	
		this.gridBagConstraintsTipoCalculoDepreciacion = new GridBagConstraints();
		this.gridBagConstraintsTipoCalculoDepreciacion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCalculoDepreciacion.gridy = 0;
		this.gridBagConstraintsTipoCalculoDepreciacion.gridx = 0;
			
		this.jPanelAccionesTipoCalculoDepreciacion.add(this.jButtonNuevoTipoCalculoDepreciacion, this.gridBagConstraintsTipoCalculoDepreciacion);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdPaisTipoCalculoDepreciacion= new GridBagLayout();
		gridaBagLayoutFK_IdPaisTipoCalculoDepreciacion.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdPaisTipoCalculoDepreciacion.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdPaisTipoCalculoDepreciacion.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdPaisTipoCalculoDepreciacion.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdPaisTipoCalculoDepreciacion.setLayout(gridaBagLayoutFK_IdPaisTipoCalculoDepreciacion);

		gridBagConstraintsTipoCalculoDepreciacion = new GridBagConstraints();
		gridBagConstraintsTipoCalculoDepreciacion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoCalculoDepreciacion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoCalculoDepreciacion.gridy = 0;
		gridBagConstraintsTipoCalculoDepreciacion.gridx = 0;
		jPanelFK_IdPaisTipoCalculoDepreciacion.add(jLabelid_paisFK_IdPaisTipoCalculoDepreciacion, gridBagConstraintsTipoCalculoDepreciacion);

		gridBagConstraintsTipoCalculoDepreciacion = new GridBagConstraints();
		gridBagConstraintsTipoCalculoDepreciacion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoCalculoDepreciacion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoCalculoDepreciacion.gridy = 0;
		gridBagConstraintsTipoCalculoDepreciacion.gridx = 1;
		jPanelFK_IdPaisTipoCalculoDepreciacion.add(jComboBoxid_paisFK_IdPaisTipoCalculoDepreciacion, gridBagConstraintsTipoCalculoDepreciacion);

		gridBagConstraintsTipoCalculoDepreciacion = new GridBagConstraints();
		gridBagConstraintsTipoCalculoDepreciacion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoCalculoDepreciacion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoCalculoDepreciacion.gridy = 1;
		gridBagConstraintsTipoCalculoDepreciacion.gridx =1;
		jPanelFK_IdPaisTipoCalculoDepreciacion.add(jButtonFK_IdPaisTipoCalculoDepreciacion, gridBagConstraintsTipoCalculoDepreciacion);

		jTabbedPaneBusquedasTipoCalculoDepreciacion.addTab("1.-Por Pais ", jPanelFK_IdPaisTipoCalculoDepreciacion);
		jTabbedPaneBusquedasTipoCalculoDepreciacion.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoCalculoDepreciacion = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoCalculoDepreciacion);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipocalculodepreciacionSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoCalculoDepreciacion = new GridBagConstraints();						
			this.gridBagConstraintsTipoCalculoDepreciacion.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoCalculoDepreciacion.gridx = 0;		
			//this.gridBagConstraintsTipoCalculoDepreciacion.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCalculoDepreciacion.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoCalculoDepreciacion.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarTipoCalculoDepreciacion, this.gridBagConstraintsTipoCalculoDepreciacion);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsTipoCalculoDepreciacion = new GridBagConstraints();
		this.gridBagConstraintsTipoCalculoDepreciacion.gridy = iGridyPrincipal++;
		this.gridBagConstraintsTipoCalculoDepreciacion.gridx = 0;		
		//this.gridBagConstraintsTipoCalculoDepreciacion.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCalculoDepreciacion.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsTipoCalculoDepreciacion.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsTipoCalculoDepreciacion);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsTipoCalculoDepreciacion = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsTipoCalculoDepreciacion.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoCalculoDepreciacion.gridx = 0;		
			this.gridBagConstraintsTipoCalculoDepreciacion.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCalculoDepreciacion.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsTipoCalculoDepreciacion.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasTipoCalculoDepreciacion, this.gridBagConstraintsTipoCalculoDepreciacion);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsTipoCalculoDepreciacion = new GridBagConstraints();
		this.gridBagConstraintsTipoCalculoDepreciacion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoCalculoDepreciacion.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesTipoCalculoDepreciacion, this.gridBagConstraintsTipoCalculoDepreciacion);								
		
		
		/*
		this.gridBagConstraintsTipoCalculoDepreciacion = new GridBagConstraints();
		this.gridBagConstraintsTipoCalculoDepreciacion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoCalculoDepreciacion.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesTipoCalculoDepreciacion, this.gridBagConstraintsTipoCalculoDepreciacion);
		*/		
		
		this.gridBagConstraintsTipoCalculoDepreciacion = new GridBagConstraints();
		this.gridBagConstraintsTipoCalculoDepreciacion.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoCalculoDepreciacion.gridx =0;
		this.gridBagConstraintsTipoCalculoDepreciacion.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoCalculoDepreciacion.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoCalculoDepreciacion, this.gridBagConstraintsTipoCalculoDepreciacion);
				
		
		this.gridBagConstraintsTipoCalculoDepreciacion = new GridBagConstraints();
		this.gridBagConstraintsTipoCalculoDepreciacion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoCalculoDepreciacion.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionTipoCalculoDepreciacion, this.gridBagConstraintsTipoCalculoDepreciacion);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(TipoCalculoDepreciacionJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosTipoCalculoDepreciacion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoCalculoDepreciacion = new GridBagLayout();
			this.jPanelBusquedasParametrosTipoCalculoDepreciacion.setLayout(gridaBagLayoutBusquedasParametrosTipoCalculoDepreciacion);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralTipoCalculoDepreciacion=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoCalculoDepreciacion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoCalculoDepreciacion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoCalculoDepreciacion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoCalculoDepreciacion = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsTipoCalculoDepreciacion = new GridBagConstraints();
		this.gridBagConstraintsTipoCalculoDepreciacion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoCalculoDepreciacion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoCalculoDepreciacion, this.gridBagConstraintsTipoCalculoDepreciacion);
			
			
		this.gridBagConstraintsTipoCalculoDepreciacion = new GridBagConstraints();
		this.gridBagConstraintsTipoCalculoDepreciacion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoCalculoDepreciacion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoCalculoDepreciacion, this.gridBagConstraintsTipoCalculoDepreciacion);
		
			
		this.gridBagConstraintsTipoCalculoDepreciacion = new GridBagConstraints();
		this.gridBagConstraintsTipoCalculoDepreciacion.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoCalculoDepreciacion.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoCalculoDepreciacion, this.gridBagConstraintsTipoCalculoDepreciacion);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralTipoCalculoDepreciacion;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoTipoCalculoDepreciacion() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoTipoCalculoDepreciacion = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoTipoCalculoDepreciacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoTipoCalculoDepreciacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoTipoCalculoDepreciacion.setName("jPanelReporteDinamicoTipoCalculoDepreciacion"); 
		
		this.jPanelReporteDinamicoTipoCalculoDepreciacion.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoCalculoDepreciacion.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoCalculoDepreciacion.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoTipoCalculoDepreciacion.setLayout(gridaBagLayoutReporteDinamicoTipoCalculoDepreciacion);
		
		
		this.jInternalFrameReporteDinamicoTipoCalculoDepreciacion= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoTipoCalculoDepreciacion = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoCalculoDepreciacion= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoTipoCalculoDepreciacion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoTipoCalculoDepreciacion.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoTipoCalculoDepreciacion.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoTipoCalculoDepreciacion.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoTipoCalculoDepreciacion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoTipoCalculoDepreciacion.setResizable(true);
	    this.jInternalFrameReporteDinamicoTipoCalculoDepreciacion.setClosable(true);
	    this.jInternalFrameReporteDinamicoTipoCalculoDepreciacion.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoTipoCalculoDepreciacion.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoCalculoDepreciacion.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoCalculoDepreciacion.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoTipoCalculoDepreciacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Calculo Depreciacions"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteTipoCalculoDepreciacion = new JLabelMe();

		this.jLabelColumnasSelectReporteTipoCalculoDepreciacion.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteTipoCalculoDepreciacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoCalculoDepreciacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoCalculoDepreciacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoCalculoDepreciacion = new GridBagConstraints();
		this.gridBagConstraintsTipoCalculoDepreciacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCalculoDepreciacion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoCalculoDepreciacion.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoCalculoDepreciacion.add(this.jLabelColumnasSelectReporteTipoCalculoDepreciacion, this.gridBagConstraintsTipoCalculoDepreciacion);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteTipoCalculoDepreciacion = new JList<Reporte>();
		this.jListColumnasSelectReporteTipoCalculoDepreciacion.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteTipoCalculoDepreciacion.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteTipoCalculoDepreciacion.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoCalculoDepreciacion.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoCalculoDepreciacion.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteTipoCalculoDepreciacion=new JScrollPane(this.jListColumnasSelectReporteTipoCalculoDepreciacion);
			
			this.jScrollColumnasSelectReporteTipoCalculoDepreciacion.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoCalculoDepreciacion.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoCalculoDepreciacion.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteTipoCalculoDepreciacion.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTipoCalculoDepreciacion = new GridBagConstraints();
		this.gridBagConstraintsTipoCalculoDepreciacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCalculoDepreciacion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoCalculoDepreciacion.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoCalculoDepreciacion.add(this.jListColumnasSelectReporteTipoCalculoDepreciacion, this.gridBagConstraintsTipoCalculoDepreciacion);
		this.jPanelReporteDinamicoTipoCalculoDepreciacion.add(this.jScrollColumnasSelectReporteTipoCalculoDepreciacion, this.gridBagConstraintsTipoCalculoDepreciacion);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteTipoCalculoDepreciacion = new JLabelMe();

		this.jLabelRelacionesSelectReporteTipoCalculoDepreciacion.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteTipoCalculoDepreciacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoCalculoDepreciacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoCalculoDepreciacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteTipoCalculoDepreciacion = new JList<Reporte>();
		this.jListRelacionesSelectReporteTipoCalculoDepreciacion.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteTipoCalculoDepreciacion.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteTipoCalculoDepreciacion.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoCalculoDepreciacion.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoCalculoDepreciacion.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteTipoCalculoDepreciacion=new JScrollPane(this.jListRelacionesSelectReporteTipoCalculoDepreciacion);
			
			this.jScrollRelacionesSelectReporteTipoCalculoDepreciacion.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoCalculoDepreciacion.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoCalculoDepreciacion.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteTipoCalculoDepreciacion.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoTipoCalculoDepreciacion = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoTipoCalculoDepreciacion = new JComboBoxMe();
		this.jListColumnasValoresGraficoTipoCalculoDepreciacion = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoTipoCalculoDepreciacion = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoTipoCalculoDepreciacion.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoTipoCalculoDepreciacion.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoCalculoDepreciacion.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoCalculoDepreciacion.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoTipoCalculoDepreciacion, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoTipoCalculoDepreciacion = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoTipoCalculoDepreciacion.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoTipoCalculoDepreciacion.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoCalculoDepreciacion.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoCalculoDepreciacion.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoTipoCalculoDepreciacion, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoTipoCalculoDepreciacion = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoTipoCalculoDepreciacion.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoTipoCalculoDepreciacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoCalculoDepreciacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoCalculoDepreciacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoCalculoDepreciacion = new GridBagConstraints();
		this.gridBagConstraintsTipoCalculoDepreciacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCalculoDepreciacion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoCalculoDepreciacion.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoCalculoDepreciacion.add(this.jLabelGenerarExcelReporteDinamicoTipoCalculoDepreciacion, this.gridBagConstraintsTipoCalculoDepreciacion);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoTipoCalculoDepreciacion = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoTipoCalculoDepreciacion.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoTipoCalculoDepreciacion,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoTipoCalculoDepreciacion.setToolTipText("Generar EXCEL"+" "+TipoCalculoDepreciacionConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsTipoCalculoDepreciacion = new GridBagConstraints();
		//this.gridBagConstraintsTipoCalculoDepreciacion.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsTipoCalculoDepreciacion.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsTipoCalculoDepreciacion.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoTipoCalculoDepreciacion.add(this.jButtonGenerarExcelReporteDinamicoTipoCalculoDepreciacion, this.gridBagConstraintsTipoCalculoDepreciacion);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsTipoCalculoDepreciacion = new GridBagConstraints();
		this.gridBagConstraintsTipoCalculoDepreciacion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCalculoDepreciacion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoCalculoDepreciacion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoCalculoDepreciacion.add(this.jComboBoxTiposReportesDinamicoTipoCalculoDepreciacion, this.gridBagConstraintsTipoCalculoDepreciacion);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoTipoCalculoDepreciacion = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoTipoCalculoDepreciacion.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoTipoCalculoDepreciacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoCalculoDepreciacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoCalculoDepreciacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoCalculoDepreciacion = new GridBagConstraints();
		this.gridBagConstraintsTipoCalculoDepreciacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCalculoDepreciacion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoCalculoDepreciacion.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoCalculoDepreciacion.add(this.jLabelTiposArchivoReporteDinamicoTipoCalculoDepreciacion, this.gridBagConstraintsTipoCalculoDepreciacion);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsTipoCalculoDepreciacion = new GridBagConstraints();
		this.gridBagConstraintsTipoCalculoDepreciacion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCalculoDepreciacion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoCalculoDepreciacion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoCalculoDepreciacion.add(this.jComboBoxTiposArchivosReportesDinamicoTipoCalculoDepreciacion, this.gridBagConstraintsTipoCalculoDepreciacion);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoTipoCalculoDepreciacion = new JButtonMe();
		this.jButtonGenerarReporteDinamicoTipoCalculoDepreciacion.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoTipoCalculoDepreciacion,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoTipoCalculoDepreciacion.setToolTipText("Generar"+" "+TipoCalculoDepreciacionConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsTipoCalculoDepreciacion = new GridBagConstraints();
		this.gridBagConstraintsTipoCalculoDepreciacion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCalculoDepreciacion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoCalculoDepreciacion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoCalculoDepreciacion.add(this.jButtonGenerarReporteDinamicoTipoCalculoDepreciacion, this.gridBagConstraintsTipoCalculoDepreciacion);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoTipoCalculoDepreciacion = new JButtonMe();
		this.jButtonCerrarReporteDinamicoTipoCalculoDepreciacion.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoTipoCalculoDepreciacion,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoTipoCalculoDepreciacion.setToolTipText("Cancelar"+" "+TipoCalculoDepreciacionConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoCalculoDepreciacion = new GridBagConstraints();
		this.gridBagConstraintsTipoCalculoDepreciacion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCalculoDepreciacion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoCalculoDepreciacion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoCalculoDepreciacion.add(this.jButtonCerrarReporteDinamicoTipoCalculoDepreciacion, this.gridBagConstraintsTipoCalculoDepreciacion);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalTipoCalculoDepreciacion = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoTipoCalculoDepreciacion= new JScrollPane(jPanelReporteDinamicoTipoCalculoDepreciacion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoTipoCalculoDepreciacion.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoCalculoDepreciacion.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoCalculoDepreciacion.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoTipoCalculoDepreciacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Calculo Depreciacions"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoCalculoDepreciacion = new GridBagConstraints();
		this.gridBagConstraintsTipoCalculoDepreciacion.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsTipoCalculoDepreciacion.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsTipoCalculoDepreciacion.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoTipoCalculoDepreciacion.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoTipoCalculoDepreciacion.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalTipoCalculoDepreciacion);
		this.jInternalFrameReporteDinamicoTipoCalculoDepreciacion.getContentPane().add(this.jScrollPanelReporteDinamicoTipoCalculoDepreciacion, this.gridBagConstraintsTipoCalculoDepreciacion);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionTipoCalculoDepreciacion() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionTipoCalculoDepreciacion = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionTipoCalculoDepreciacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionTipoCalculoDepreciacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionTipoCalculoDepreciacion.setName("jPanelImportacionTipoCalculoDepreciacion"); 
		
		this.jPanelImportacionTipoCalculoDepreciacion.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoCalculoDepreciacion.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoCalculoDepreciacion.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionTipoCalculoDepreciacion.setLayout(gridaBagLayoutImportacionTipoCalculoDepreciacion);
		
		
		this.jInternalFrameImportacionTipoCalculoDepreciacion= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionTipoCalculoDepreciacion= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionTipoCalculoDepreciacion = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoCalculoDepreciacion= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionTipoCalculoDepreciacion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoCalculoDepreciacion.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoCalculoDepreciacion.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionTipoCalculoDepreciacion.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoCalculoDepreciacion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoCalculoDepreciacion.setResizable(true);
	    this.jInternalFrameImportacionTipoCalculoDepreciacion.setClosable(true);
	    this.jInternalFrameImportacionTipoCalculoDepreciacion.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionTipoCalculoDepreciacion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoCalculoDepreciacion.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoCalculoDepreciacion.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionTipoCalculoDepreciacion.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoCalculoDepreciacion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoCalculoDepreciacion.setResizable(true);
	    this.jInternalFrameImportacionTipoCalculoDepreciacion.setClosable(true);
	    this.jInternalFrameImportacionTipoCalculoDepreciacion.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionTipoCalculoDepreciacion.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoCalculoDepreciacion.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoCalculoDepreciacion.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionTipoCalculoDepreciacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Calculo Depreciacions"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionTipoCalculoDepreciacion = new JLabelMe();

		this.jLabelArchivoImportacionTipoCalculoDepreciacion.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionTipoCalculoDepreciacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoCalculoDepreciacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoCalculoDepreciacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoCalculoDepreciacion = new GridBagConstraints();
		this.gridBagConstraintsTipoCalculoDepreciacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCalculoDepreciacion.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoCalculoDepreciacion.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoCalculoDepreciacion.add(this.jLabelArchivoImportacionTipoCalculoDepreciacion, this.gridBagConstraintsTipoCalculoDepreciacion);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionTipoCalculoDepreciacion = new JFileChooser();		
		this.jFileChooserImportacionTipoCalculoDepreciacion.setToolTipText("ESCOGER ARCHIVO"+" "+TipoCalculoDepreciacionConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionTipoCalculoDepreciacion = new JButtonMe();
		this.jButtonAbrirImportacionTipoCalculoDepreciacion.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionTipoCalculoDepreciacion,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionTipoCalculoDepreciacion.setToolTipText("Generar"+" "+TipoCalculoDepreciacionConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsTipoCalculoDepreciacion = new GridBagConstraints();
		this.gridBagConstraintsTipoCalculoDepreciacion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCalculoDepreciacion.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoCalculoDepreciacion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoCalculoDepreciacion.add(this.jButtonAbrirImportacionTipoCalculoDepreciacion, this.gridBagConstraintsTipoCalculoDepreciacion);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionTipoCalculoDepreciacion = new JLabelMe();

		this.jLabelPathArchivoImportacionTipoCalculoDepreciacion.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionTipoCalculoDepreciacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoCalculoDepreciacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoCalculoDepreciacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoCalculoDepreciacion = new GridBagConstraints();
		this.gridBagConstraintsTipoCalculoDepreciacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCalculoDepreciacion.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoCalculoDepreciacion.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoCalculoDepreciacion.add(this.jLabelPathArchivoImportacionTipoCalculoDepreciacion, this.gridBagConstraintsTipoCalculoDepreciacion);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionTipoCalculoDepreciacion=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionTipoCalculoDepreciacion.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoCalculoDepreciacion.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoCalculoDepreciacion.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsTipoCalculoDepreciacion = new GridBagConstraints();
		this.gridBagConstraintsTipoCalculoDepreciacion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCalculoDepreciacion.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoCalculoDepreciacion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoCalculoDepreciacion.add(this.jTextFieldPathArchivoImportacionTipoCalculoDepreciacion, this.gridBagConstraintsTipoCalculoDepreciacion);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionTipoCalculoDepreciacion = new JButtonMe();
		this.jButtonGenerarImportacionTipoCalculoDepreciacion.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionTipoCalculoDepreciacion,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionTipoCalculoDepreciacion.setToolTipText("Generar"+" "+TipoCalculoDepreciacionConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsTipoCalculoDepreciacion = new GridBagConstraints();
		this.gridBagConstraintsTipoCalculoDepreciacion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCalculoDepreciacion.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoCalculoDepreciacion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoCalculoDepreciacion.add(this.jButtonGenerarImportacionTipoCalculoDepreciacion, this.gridBagConstraintsTipoCalculoDepreciacion);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionTipoCalculoDepreciacion = new JButtonMe();
		this.jButtonCerrarImportacionTipoCalculoDepreciacion.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionTipoCalculoDepreciacion,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionTipoCalculoDepreciacion.setToolTipText("Cancelar"+" "+TipoCalculoDepreciacionConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoCalculoDepreciacion = new GridBagConstraints();
		this.gridBagConstraintsTipoCalculoDepreciacion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCalculoDepreciacion.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoCalculoDepreciacion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoCalculoDepreciacion.add(this.jButtonCerrarImportacionTipoCalculoDepreciacion, this.gridBagConstraintsTipoCalculoDepreciacion);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalTipoCalculoDepreciacion = new GridBagLayout();
		
		this.jScrollPanelImportacionTipoCalculoDepreciacion= new JScrollPane(jPanelImportacionTipoCalculoDepreciacion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsTipoCalculoDepreciacion = new GridBagConstraints();
		this.gridBagConstraintsTipoCalculoDepreciacion.gridy =iPosYImportacion;
		this.gridBagConstraintsTipoCalculoDepreciacion.gridx =iPosXImportacion;
		this.gridBagConstraintsTipoCalculoDepreciacion.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionTipoCalculoDepreciacion.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionTipoCalculoDepreciacion.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalTipoCalculoDepreciacion);
		this.jInternalFrameImportacionTipoCalculoDepreciacion.getContentPane().add(this.jScrollPanelImportacionTipoCalculoDepreciacion, this.gridBagConstraintsTipoCalculoDepreciacion);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByTipoCalculoDepreciacion(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByTipoCalculoDepreciacion = new JButtonMe();
			this.jButtonAbrirOrderByTipoCalculoDepreciacion.setText("Orden");
			this.jButtonAbrirOrderByTipoCalculoDepreciacion.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoCalculoDepreciacion,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoCalculoDepreciacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByTipoCalculoDepreciacion";
			inputMap = this.jButtonAbrirOrderByTipoCalculoDepreciacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByTipoCalculoDepreciacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByTipoCalculoDepreciacion"));
		
		
			GridBagLayout gridaBagLayoutOrderByTipoCalculoDepreciacion = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByTipoCalculoDepreciacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByTipoCalculoDepreciacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByTipoCalculoDepreciacion.setName("jPanelOrderByTipoCalculoDepreciacion"); 
			
			this.jPanelOrderByTipoCalculoDepreciacion.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoCalculoDepreciacion.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoCalculoDepreciacion.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByTipoCalculoDepreciacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByTipoCalculoDepreciacion.setLayout(gridaBagLayoutOrderByTipoCalculoDepreciacion);
			
			
			this.jTableDatosTipoCalculoDepreciacionOrderBy = new JTableMe();        
			this.jTableDatosTipoCalculoDepreciacionOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosTipoCalculoDepreciacionOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosTipoCalculoDepreciacionOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosTipoCalculoDepreciacionOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosTipoCalculoDepreciacionOrderBy.setViewportView(this.jTableDatosTipoCalculoDepreciacionOrderBy);
			this.jTableDatosTipoCalculoDepreciacionOrderBy.setFillsViewportHeight(true);
			this.jTableDatosTipoCalculoDepreciacionOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByTipoCalculoDepreciacion= new OrderByJInternalFrame();
			this.jInternalFrameOrderByTipoCalculoDepreciacion= new OrderByJInternalFrame();
			this.jScrollPanelOrderByTipoCalculoDepreciacion = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteTipoCalculoDepreciacion= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByTipoCalculoDepreciacion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByTipoCalculoDepreciacion.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByTipoCalculoDepreciacion.setTitle("Orden");
			this.jInternalFrameOrderByTipoCalculoDepreciacion.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByTipoCalculoDepreciacion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByTipoCalculoDepreciacion.setResizable(true);
			this.jInternalFrameOrderByTipoCalculoDepreciacion.setClosable(true);
			this.jInternalFrameOrderByTipoCalculoDepreciacion.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByTipoCalculoDepreciacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByTipoCalculoDepreciacion.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoCalculoDepreciacion.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoCalculoDepreciacion.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByTipoCalculoDepreciacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByTipoCalculoDepreciacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Calculo Depreciacions"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsTipoCalculoDepreciacion = new GridBagConstraints();
			this.gridBagConstraintsTipoCalculoDepreciacion.gridy =iPosYOrderBy++;
			this.gridBagConstraintsTipoCalculoDepreciacion.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoCalculoDepreciacion.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsTipoCalculoDepreciacion.ipady =150;
				
			this.jPanelOrderByTipoCalculoDepreciacion.add(jScrollPanelDatosTipoCalculoDepreciacionOrderBy, this.gridBagConstraintsTipoCalculoDepreciacion);//this.jTableDatosTipoCalculoDepreciacionTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByTipoCalculoDepreciacion = new JButtonMe();
			this.jButtonCerrarOrderByTipoCalculoDepreciacion.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByTipoCalculoDepreciacion,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByTipoCalculoDepreciacion.setToolTipText("Cancelar"+" "+TipoCalculoDepreciacionConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByTipoCalculoDepreciacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsTipoCalculoDepreciacion = new GridBagConstraints();
			this.gridBagConstraintsTipoCalculoDepreciacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCalculoDepreciacion.gridy = iPosYOrderBy++;
			this.gridBagConstraintsTipoCalculoDepreciacion.gridx = iPosXOrderBy;
									
			this.jPanelOrderByTipoCalculoDepreciacion.add(this.jButtonCerrarOrderByTipoCalculoDepreciacion, this.gridBagConstraintsTipoCalculoDepreciacion);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalTipoCalculoDepreciacion = new GridBagLayout();
			
			this.jScrollPanelOrderByTipoCalculoDepreciacion= new JScrollPane(jPanelOrderByTipoCalculoDepreciacion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsTipoCalculoDepreciacion = new GridBagConstraints();
			this.gridBagConstraintsTipoCalculoDepreciacion.gridy =iPosYOrderBy;
			this.gridBagConstraintsTipoCalculoDepreciacion.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoCalculoDepreciacion.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByTipoCalculoDepreciacion.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByTipoCalculoDepreciacion.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalTipoCalculoDepreciacion);
			
			this.jInternalFrameOrderByTipoCalculoDepreciacion.getContentPane().add(this.jScrollPanelOrderByTipoCalculoDepreciacion, this.gridBagConstraintsTipoCalculoDepreciacion);			
		
		} else {
			this.jButtonAbrirOrderByTipoCalculoDepreciacion = new JButtonMe();
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
			&& this.tipocalculodepreciacionSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosTipoCalculoDepreciacion.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosTipoCalculoDepreciacion.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosTipoCalculoDepreciacion.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosTipoCalculoDepreciacion.getRowHeight();//TipoCalculoDepreciacionConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.tipocalculodepreciacionSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > TipoCalculoDepreciacionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoCalculoDepreciacion.isSelected()) {
					iHeightTable=TipoCalculoDepreciacionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoCalculoDepreciacionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoCalculoDepreciacionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > TipoCalculoDepreciacionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoCalculoDepreciacion.isSelected()) {
					iHeightTable=TipoCalculoDepreciacionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoCalculoDepreciacionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoCalculoDepreciacionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosTipoCalculoDepreciacion.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoCalculoDepreciacion.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoCalculoDepreciacion.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosTipoCalculoDepreciacion.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoCalculoDepreciacion.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoCalculoDepreciacion.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByTipoCalculoDepreciacion!=null && this.jInternalFrameOrderByTipoCalculoDepreciacion.getjTableDatosOrderBy()!=null) {
			//if(!this.tipocalculodepreciacionSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByTipoCalculoDepreciacion.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByTipoCalculoDepreciacion.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByTipoCalculoDepreciacion.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByTipoCalculoDepreciacion.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByTipoCalculoDepreciacion.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByTipoCalculoDepreciacion.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByTipoCalculoDepreciacion.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosTipoCalculoDepreciacion.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoCalculoDepreciacion.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoCalculoDepreciacion.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=tipocalculodepreciacionLogic.getTipoCalculoDepreciacions().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipocalculodepreciacions.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<TipoCalculoDepreciacion> TraerTipoCalculoDepreciacionBeans(List<TipoCalculoDepreciacion> tipocalculodepreciacions,ArrayList<Classe> classes)throws Exception {
		try {
			for(TipoCalculoDepreciacion tipocalculodepreciacion:tipocalculodepreciacions) {
					
				if(!(TipoCalculoDepreciacionConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || TipoCalculoDepreciacionConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					tipocalculodepreciacion.setsDetalleGeneralEntityReporte(TipoCalculoDepreciacionConstantesFunciones.getTipoCalculoDepreciacionDescripcion(tipocalculodepreciacion));
										
						
					
						
					
				} else  {
							
					//tipocalculodepreciacion.setsDetalleGeneralEntityReporte(tipocalculodepreciacion.getsDetalleGeneralEntityReporte());
										
				}
				
				//tipocalculodepreciacionbeans.add(tipocalculodepreciacionbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return tipocalculodepreciacions;
    }
	//PARA REPORTES FIN
}
