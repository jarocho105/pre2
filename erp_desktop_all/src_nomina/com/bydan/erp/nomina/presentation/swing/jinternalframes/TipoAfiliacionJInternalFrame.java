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
package com.bydan.erp.nomina.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;

//import com.bydan.erp.nomina.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.nomina.util.TipoAfiliacionConstantesFunciones;

import com.bydan.erp.nomina.business.logic.*;
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
public class TipoAfiliacionJInternalFrame extends TipoAfiliacionBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarTipoAfiliacion;
	
	protected JMenuBar jmenuBarTipoAfiliacion;
	
	protected JMenu jmenuTipoAfiliacion;
	protected JMenu jmenuDatosTipoAfiliacion;
	protected JMenu jmenuArchivoTipoAfiliacion;
	protected JMenu jmenuAccionesTipoAfiliacion;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosTipoAfiliacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoAfiliacion;	
	protected GridBagConstraints gridBagConstraintsTipoAfiliacion;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public TipoAfiliacionDetalleFormJInternalFrame jInternalFrameDetalleFormTipoAfiliacion;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoTipoAfiliacion;	
	protected ImportacionJInternalFrame jInternalFrameImportacionTipoAfiliacion;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected CateTipoAfiliacionBeanSwingJInternalFrame catetipoafiliacionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_catetipoafiliacion="";
	
	public TipoAfiliacionSessionBean tipoafiliacionSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public CateTipoAfiliacionSessionBean catetipoafiliacionSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<TipoAfiliacion> tipoafiliacions;		
	public List<TipoAfiliacion> tipoafiliacionsEliminados;	
	public List<TipoAfiliacion> tipoafiliacionsAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByTipoAfiliacion;		
	protected JButton jButtonAbrirOrderByTipoAfiliacion;
	
	
	//protected JPanel jPanelOrderByTipoAfiliacion;
	//public JScrollPane jScrollPanelOrderByTipoAfiliacion;	
	//protected JButton jButtonCerrarOrderByTipoAfiliacion;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public TipoAfiliacionLogic tipoafiliacionLogic;
	
	
	
	public JScrollPane jScrollPanelDatosTipoAfiliacion;
	public JScrollPane jScrollPanelDatosEdicionTipoAfiliacion;
	public JScrollPane jScrollPanelDatosGeneralTipoAfiliacion;
    
	
	
	//public JScrollPane jScrollPanelDatosTipoAfiliacionOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoTipoAfiliacion;
	//public JScrollPane jScrollPanelImportacionTipoAfiliacion;
	
	
	
	protected JPanel jPanelAccionesTipoAfiliacion;
	
    protected JPanel jPanelPaginacionTipoAfiliacion;
    protected JPanel jPanelParametrosReportesTipoAfiliacion;
	protected JPanel jPanelParametrosReportesAccionesTipoAfiliacion;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1TipoAfiliacion;
	protected JPanel jPanelParametrosAuxiliar2TipoAfiliacion;
	protected JPanel jPanelParametrosAuxiliar3TipoAfiliacion;
	protected JPanel jPanelParametrosAuxiliar4TipoAfiliacion;
	//protected JPanel jPanelParametrosAuxiliar5TipoAfiliacion;
	
	
	
	//protected JPanel jPanelReporteDinamicoTipoAfiliacion;
	//protected JPanel jPanelImportacionTipoAfiliacion;
	
	
	public JTable jTableDatosTipoAfiliacion;
	
	
	
	//public JTable jTableDatosTipoAfiliacionOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoTipoAfiliacion;
	protected JButton jButtonDuplicarTipoAfiliacion;
	protected JButton jButtonCopiarTipoAfiliacion;
	protected JButton jButtonVerFormTipoAfiliacion;
	protected JButton jButtonNuevoRelacionesTipoAfiliacion;
	protected JButton jButtonModificarTipoAfiliacion;
	
    protected JButton jButtonGuardarCambiosTablaTipoAfiliacion;
	protected JButton jButtonCerrarTipoAfiliacion;
	
	
	protected JButton jButtonRecargarInformacionTipoAfiliacion;
	protected JButton jButtonProcesarInformacionTipoAfiliacion;
	
	
	protected JButton jButtonAnterioresTipoAfiliacion;
	protected JButton jButtonSiguientesTipoAfiliacion;
	protected JButton jButtonNuevoGuardarCambiosTipoAfiliacion;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoTipoAfiliacion;
	//protected JButton jButtonCerrarReporteDinamicoTipoAfiliacion;
	//protected JButton jButtonGenerarExcelReporteDinamicoTipoAfiliacion;	
	
	
	
	//protected JButton jButtonAbrirImportacionTipoAfiliacion;
	//protected JButton jButtonGenerarImportacionTipoAfiliacion;
	//protected JButton jButtonCerrarImportacionTipoAfiliacion;
	//protected JFileChooser jFileChooserImportacionTipoAfiliacion;
	//protected File fileImportacionTipoAfiliacion;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoAfiliacion;
	protected JButton jButtonDuplicarToolBarTipoAfiliacion;
	protected JButton jButtonNuevoRelacionesToolBarTipoAfiliacion;
	
	
	public JButton jButtonGuardarCambiosToolBarTipoAfiliacion;
	protected JButton jButtonCopiarToolBarTipoAfiliacion;
	protected JButton jButtonVerFormToolBarTipoAfiliacion;
	public JButton jButtonGuardarCambiosTablaToolBarTipoAfiliacion;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoAfiliacion;
	protected JButton jButtonCerrarToolBarTipoAfiliacion;
	
	protected JButton jButtonRecargarInformacionToolBarTipoAfiliacion;
	protected JButton jButtonProcesarInformacionToolBarTipoAfiliacion;
	protected JButton jButtonAnterioresToolBarTipoAfiliacion;
	protected JButton jButtonSiguientesToolBarTipoAfiliacion;
	protected JButton jButtonNuevoGuardarCambiosToolBarTipoAfiliacion;
	protected JButton jButtonAbrirOrderByToolBarTipoAfiliacion;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoAfiliacion;
	protected JMenuItem jMenuItemDuplicarTipoAfiliacion;
	protected JMenuItem jMenuItemNuevoRelacionesTipoAfiliacion;
	
	
	protected JMenuItem jMenuItemGuardarCambiosTipoAfiliacion;
	protected JMenuItem jMenuItemCopiarTipoAfiliacion;
	protected JMenuItem jMenuItemVerFormTipoAfiliacion;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoAfiliacion;
	protected JMenuItem jMenuItemCerrarTipoAfiliacion;
	protected JMenuItem jMenuItemDetalleCerrarTipoAfiliacion;
	protected JMenuItem jMenuItemDetalleAbrirOrderByTipoAfiliacion;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoAfiliacion;
	
	protected JMenuItem jMenuItemRecargarInformacionTipoAfiliacion;
	protected JMenuItem jMenuItemProcesarInformacionTipoAfiliacion;
	protected JMenuItem jMenuItemAnterioresTipoAfiliacion;
	protected JMenuItem jMenuItemSiguientesTipoAfiliacion;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoAfiliacion;
	protected JMenuItem jMenuItemAbrirOrderByTipoAfiliacion;
	protected JMenuItem jMenuItemMostrarOcultarTipoAfiliacion;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoAfiliacion;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosTipoAfiliacion;
	protected JCheckBox jCheckBoxSeleccionadosTipoAfiliacion;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaTipoAfiliacion;
	protected JCheckBox jCheckBoxConGraficoReporteTipoAfiliacion;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesTipoAfiliacion;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesTipoAfiliacion;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoTipoAfiliacion;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoTipoAfiliacion;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesTipoAfiliacion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionTipoAfiliacion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoAfiliacion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoAfiliacion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarTipoAfiliacion;
	protected JTextField jTextFieldValorCampoGeneralTipoAfiliacion;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteTipoAfiliacion;
	//public JList<Reporte> jListColumnasSelectReporteTipoAfiliacion;
	//public JScrollPane jScrollColumnasSelectReporteTipoAfiliacion;
	
	//public JLabel jLabelRelacionesSelectReporteTipoAfiliacion;
	//public JList<Reporte> jListRelacionesSelectReporteTipoAfiliacion;
	//public JScrollPane jScrollRelacionesSelectReporteTipoAfiliacion;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoTipoAfiliacion;
	//protected JCheckBox jCheckBoxConGraficoDinamicoTipoAfiliacion;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoTipoAfiliacion;
	//public JLabel jLabelTiposArchivoReporteDinamicoTipoAfiliacion;
	
		
	//public JLabel jLabelArchivoImportacionTipoAfiliacion;	
	//public JLabel jLabelPathArchivoImportacionTipoAfiliacion;
	//protected JTextField jTextFieldPathArchivoImportacionTipoAfiliacion;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoTipoAfiliacion;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoTipoAfiliacion;
	
	//public JLabel jLabelColumnaCategoriaValorTipoAfiliacion;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorTipoAfiliacion;
	
	//public JLabel jLabelColumnasValoresGraficoTipoAfiliacion;
	//public JList<Reporte> jListColumnasValoresGraficoTipoAfiliacion;
	//public JScrollPane jScrollColumnasValoresGraficoTipoAfiliacion;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoTipoAfiliacion;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoTipoAfiliacion;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasTipoAfiliacion;
	public JPanel jPanelFK_IdCateTipoAfiliacionTipoAfiliacion;
	public JButton jButtonFK_IdCateTipoAfiliacionTipoAfiliacion;
	
	public JPanel jPanelid_cate_tipo_afiliacionFK_IdCateTipoAfiliacionTipoAfiliacion;
	public JLabel jLabelid_cate_tipo_afiliacionFK_IdCateTipoAfiliacionTipoAfiliacion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cate_tipo_afiliacionFK_IdCateTipoAfiliacionTipoAfiliacion;
	public JButton jButtonid_cate_tipo_afiliacionFK_IdCateTipoAfiliacionTipoAfiliacion= new JButtonMe();
	public JButton jButtonid_cate_tipo_afiliacionFK_IdCateTipoAfiliacionTipoAfiliacionUpdate= new JButtonMe();
	public JButton jButtonid_cate_tipo_afiliacionFK_IdCateTipoAfiliacionTipoAfiliacionBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=858;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public TipoAfiliacionJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("TipoAfiliacion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoAfiliacionJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoAfiliacion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoAfiliacionJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoAfiliacion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoAfiliacionJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoAfiliacion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionTipoAfiliacion)	{
		this.jButtonRecargarInformacionTipoAfiliacion = jButtonRecargarInformacionTipoAfiliacion;
	}
	
	public JButton getjButtonProcesarInformacionTipoAfiliacion() {
		return this.jButtonProcesarInformacionTipoAfiliacion;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoAfiliacion)	{
		this.jButtonProcesarInformacionTipoAfiliacion = jButtonProcesarInformacionTipoAfiliacion;
	}
	
	
	public JButton getjButtonRecargarInformacionTipoAfiliacion() {
		return this.jButtonRecargarInformacionTipoAfiliacion;
	}
	
	
	public List<TipoAfiliacion> gettipoafiliacions() {
		return this.tipoafiliacions;
	}

	public void settipoafiliacions(List<TipoAfiliacion> tipoafiliacions) {
		this.tipoafiliacions = tipoafiliacions;
	}
	
	public List<TipoAfiliacion> gettipoafiliacionsAux() {
		return this.tipoafiliacionsAux;
	}

	public void settipoafiliacionsAux(List<TipoAfiliacion> tipoafiliacionsAux) {
		this.tipoafiliacionsAux = tipoafiliacionsAux;
	}
	
	public List<TipoAfiliacion> gettipoafiliacionsEliminados() {
		return this.tipoafiliacionsEliminados;
	}

	public void setTipoAfiliacionsEliminados(List<TipoAfiliacion> tipoafiliacionsEliminados) {
		this.tipoafiliacionsEliminados = tipoafiliacionsEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarTipoAfiliacion() {
		return jComboBoxTiposSeleccionarTipoAfiliacion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarTipoAfiliacion(
			JComboBox jComboBoxTiposSeleccionarTipoAfiliacion) {
		this.jComboBoxTiposSeleccionarTipoAfiliacion = jComboBoxTiposSeleccionarTipoAfiliacion;
	}
	
	public void setBorderResaltarTiposSeleccionarTipoAfiliacion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarTipoAfiliacion.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarTipoAfiliacion .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralTipoAfiliacion() {
		return jTextFieldValorCampoGeneralTipoAfiliacion;
	}

	public void setjTextFieldValorCampoGeneralTipoAfiliacion(
			JTextField jTextFieldValorCampoGeneralTipoAfiliacion) {
		this.jTextFieldValorCampoGeneralTipoAfiliacion = jTextFieldValorCampoGeneralTipoAfiliacion;
	}

	public void setBorderResaltarValorCampoGeneralTipoAfiliacion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoAfiliacion.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralTipoAfiliacion .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosTipoAfiliacion() {
		return this.jCheckBoxSeleccionarTodosTipoAfiliacion;
	}

	public void setjCheckBoxSeleccionarTodosTipoAfiliacion(
			JCheckBox jCheckBoxSeleccionarTodosTipoAfiliacion) {
		this.jCheckBoxSeleccionarTodosTipoAfiliacion = jCheckBoxSeleccionarTodosTipoAfiliacion;
	}

	public void setBorderResaltarSeleccionarTodosTipoAfiliacion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoAfiliacion.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosTipoAfiliacion .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosTipoAfiliacion() {
		return this.jCheckBoxSeleccionadosTipoAfiliacion;
	}

	public void setjCheckBoxSeleccionadosTipoAfiliacion(
			JCheckBox jCheckBoxSeleccionadosTipoAfiliacion) {
		this.jCheckBoxSeleccionadosTipoAfiliacion = jCheckBoxSeleccionadosTipoAfiliacion;
	}
	
	public void setBorderResaltarSeleccionadosTipoAfiliacion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoAfiliacion.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosTipoAfiliacion .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesTipoAfiliacion() {
		return this.jComboBoxTiposArchivosReportesTipoAfiliacion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesTipoAfiliacion(
			JComboBox jComboBoxTiposArchivosReportesTipoAfiliacion) {
		this.jComboBoxTiposArchivosReportesTipoAfiliacion = jComboBoxTiposArchivosReportesTipoAfiliacion;
	}

	public void setBorderResaltarTiposArchivosReportesTipoAfiliacion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoAfiliacion.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesTipoAfiliacion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesTipoAfiliacion() {
		return this.jComboBoxTiposReportesTipoAfiliacion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesTipoAfiliacion(
			JComboBox jComboBoxTiposReportesTipoAfiliacion) {
		this.jComboBoxTiposReportesTipoAfiliacion = jComboBoxTiposReportesTipoAfiliacion;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoTipoAfiliacion() {
	//	return jComboBoxTiposReportesDinamicoTipoAfiliacion;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoTipoAfiliacion(
	//		JComboBox jComboBoxTiposReportesDinamicoTipoAfiliacion) {
	//	this.jComboBoxTiposReportesDinamicoTipoAfiliacion = jComboBoxTiposReportesDinamicoTipoAfiliacion;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoTipoAfiliacion() {
	//	return jComboBoxTiposArchivosReportesDinamicoTipoAfiliacion;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoTipoAfiliacion(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoTipoAfiliacion) {
	//	this.jComboBoxTiposArchivosReportesDinamicoTipoAfiliacion = jComboBoxTiposArchivosReportesDinamicoTipoAfiliacion;
	//}
	
	public void setBorderResaltarTiposReportesTipoAfiliacion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoAfiliacion.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesTipoAfiliacion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesTipoAfiliacion() {
		return this.jComboBoxTiposGraficosReportesTipoAfiliacion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesTipoAfiliacion(
			JComboBox jComboBoxTiposGraficosReportesTipoAfiliacion) {
		this.jComboBoxTiposGraficosReportesTipoAfiliacion = jComboBoxTiposGraficosReportesTipoAfiliacion;
	}
	
	public void setBorderResaltarTiposGraficosReportesTipoAfiliacion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoAfiliacion.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesTipoAfiliacion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionTipoAfiliacion() {
		return this.jComboBoxTiposPaginacionTipoAfiliacion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionTipoAfiliacion(
			JComboBox jComboBoxTiposPaginacionTipoAfiliacion) {
		this.jComboBoxTiposPaginacionTipoAfiliacion = jComboBoxTiposPaginacionTipoAfiliacion;
	}
	
	public void setBorderResaltarTiposPaginacionTipoAfiliacion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoAfiliacion.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionTipoAfiliacion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesTipoAfiliacion() {
		return this.jComboBoxTiposRelacionesTipoAfiliacion;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoAfiliacion() {
		return this.jComboBoxTiposAccionesTipoAfiliacion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoAfiliacion(
			JComboBox jComboBoxTiposRelacionesTipoAfiliacion) {
		this.jComboBoxTiposRelacionesTipoAfiliacion = jComboBoxTiposRelacionesTipoAfiliacion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoAfiliacion(
			JComboBox jComboBoxTiposAccionesTipoAfiliacion) {
		this.jComboBoxTiposAccionesTipoAfiliacion = jComboBoxTiposAccionesTipoAfiliacion;
	}
	
	public void setBorderResaltarTiposRelacionesTipoAfiliacion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoAfiliacion.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesTipoAfiliacion .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesTipoAfiliacion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoAfiliacion.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesTipoAfiliacion .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoTipoAfiliacion() {
	//	return jCheckBoxConGraficoDinamicoTipoAfiliacion;
	//}

	//public void setjCheckBoxConGraficoDinamicoTipoAfiliacion(
	//		JCheckBox jCheckBoxConGraficoDinamicoTipoAfiliacion) {
	//	this.jCheckBoxConGraficoDinamicoTipoAfiliacion = jCheckBoxConGraficoDinamicoTipoAfiliacion;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoTipoAfiliacion() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarTipoAfiliacion.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoTipoAfiliacion .setBorder(borderResaltar);		
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
		this.tipoafiliacionSessionBean=new TipoAfiliacionSessionBean();
		
		this.tipoafiliacionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipoafiliacionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipoafiliacionSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=TipoAfiliacionJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=TipoAfiliacionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoAfiliacionJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoAfiliacionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoAfiliacionJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Afiliacion MANTENIMIENTO"));
		
		
		if(iWidth > 1250) {
			iWidth=1250;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.tipoafiliacionSessionBean.getEsGuardarRelacionado()) {
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
		
		TipoAfiliacionJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("TipoAfiliacion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarTipoAfiliacion= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarTipoAfiliacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarTipoAfiliacion,this.jTtoolBarTipoAfiliacion,
							"nuevo","nuevo","Nuevo"+" "+TipoAfiliacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoAfiliacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarTipoAfiliacion,this.jTtoolBarTipoAfiliacion,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoAfiliacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarTipoAfiliacion,this.jTtoolBarTipoAfiliacion,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+TipoAfiliacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarTipoAfiliacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarTipoAfiliacion,this.jTtoolBarTipoAfiliacion,
							"duplicar","duplicar","Duplicar"+" "+TipoAfiliacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarTipoAfiliacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarTipoAfiliacion,this.jTtoolBarTipoAfiliacion,
							"copiar","copiar","Copiar"+" "+TipoAfiliacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarTipoAfiliacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarTipoAfiliacion,this.jTtoolBarTipoAfiliacion,
							"ver_form","ver_form","Ver"+" "+TipoAfiliacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarTipoAfiliacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoAfiliacion,this.jTtoolBarTipoAfiliacion,
							"recargar","recargar","Recargar"+" "+TipoAfiliacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarTipoAfiliacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoAfiliacion,this.jTtoolBarTipoAfiliacion,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarTipoAfiliacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoAfiliacion,this.jTtoolBarTipoAfiliacion,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarTipoAfiliacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarTipoAfiliacion,this.jTtoolBarTipoAfiliacion,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarTipoAfiliacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarTipoAfiliacion,this.jTtoolBarTipoAfiliacion,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarTipoAfiliacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarTipoAfiliacion,this.jTtoolBarTipoAfiliacion,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+TipoAfiliacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarTipoAfiliacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarTipoAfiliacion,this.jTtoolBarTipoAfiliacion,
							"cerrar","cerrar","Salir"+" "+TipoAfiliacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarTipoAfiliacion=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarTipoAfiliacion;
			
				this.jButtonProcesarInformacionToolBarTipoAfiliacion=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarTipoAfiliacion;
				
		//protected JButton jButtonModificarToolBarTipoAfiliacion;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarTipoAfiliacion=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuTipoAfiliacion=new JMenuMe("General");
		this.jmenuArchivoTipoAfiliacion=new JMenuMe("Archivo");
		this.jmenuAccionesTipoAfiliacion=new JMenuMe("Acciones");
		this.jmenuDatosTipoAfiliacion=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoAfiliacion= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoAfiliacion.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoAfiliacion,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoAfiliacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarTipoAfiliacion= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarTipoAfiliacion.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarTipoAfiliacion,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarTipoAfiliacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesTipoAfiliacion= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesTipoAfiliacion.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesTipoAfiliacion,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesTipoAfiliacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosTipoAfiliacion= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoAfiliacion.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoAfiliacion,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoAfiliacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarTipoAfiliacion= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarTipoAfiliacion.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarTipoAfiliacion,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarTipoAfiliacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormTipoAfiliacion= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormTipoAfiliacion.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormTipoAfiliacion,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormTipoAfiliacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaTipoAfiliacion= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaTipoAfiliacion.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaTipoAfiliacion,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaTipoAfiliacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoAfiliacion= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoAfiliacion.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoAfiliacion,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoAfiliacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionTipoAfiliacion= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionTipoAfiliacion.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionTipoAfiliacion,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionTipoAfiliacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionTipoAfiliacion= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionTipoAfiliacion.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionTipoAfiliacion,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresTipoAfiliacion= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresTipoAfiliacion.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresTipoAfiliacion,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresTipoAfiliacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesTipoAfiliacion= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesTipoAfiliacion.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesTipoAfiliacion,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesTipoAfiliacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByTipoAfiliacion= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByTipoAfiliacion.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByTipoAfiliacion,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByTipoAfiliacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoAfiliacion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoAfiliacion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoAfiliacion,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoAfiliacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByTipoAfiliacion= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByTipoAfiliacion.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByTipoAfiliacion,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByTipoAfiliacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoAfiliacion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoAfiliacion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoAfiliacion,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoAfiliacion, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosTipoAfiliacion= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosTipoAfiliacion.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosTipoAfiliacion,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosTipoAfiliacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoTipoAfiliacion.add(this.jMenuItemCerrarTipoAfiliacion);
			
			this.jmenuAccionesTipoAfiliacion.add(this.jMenuItemNuevoTipoAfiliacion);
			this.jmenuAccionesTipoAfiliacion.add(this.jMenuItemNuevoGuardarCambiosTipoAfiliacion);
			this.jmenuAccionesTipoAfiliacion.add(this.jMenuItemNuevoRelacionesTipoAfiliacion);
			this.jmenuAccionesTipoAfiliacion.add(this.jMenuItemGuardarCambiosTablaTipoAfiliacion);		
			this.jmenuAccionesTipoAfiliacion.add(this.jMenuItemDuplicarTipoAfiliacion);		
			this.jmenuAccionesTipoAfiliacion.add(this.jMenuItemCopiarTipoAfiliacion);		
			this.jmenuAccionesTipoAfiliacion.add(this.jMenuItemVerFormTipoAfiliacion);		
			
			this.jmenuDatosTipoAfiliacion.add(this.jMenuItemRecargarInformacionTipoAfiliacion);				
			this.jmenuDatosTipoAfiliacion.add(this.jMenuItemAnterioresTipoAfiliacion);				
			this.jmenuDatosTipoAfiliacion.add(this.jMenuItemSiguientesTipoAfiliacion);				
			this.jmenuDatosTipoAfiliacion.add(this.jMenuItemAbrirOrderByTipoAfiliacion);				
			this.jmenuDatosTipoAfiliacion.add(this.jMenuItemMostrarOcultarTipoAfiliacion);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesTipoAfiliacion.add(this.jMenuItemGuardarCambiosTipoAfiliacion);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoTipoAfiliacion, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesTipoAfiliacion, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosTipoAfiliacion, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarTipoAfiliacion.add(this.jmenuArchivoTipoAfiliacion);		
			this.jmenuBarTipoAfiliacion.add(this.jmenuAccionesTipoAfiliacion);		
			this.jmenuBarTipoAfiliacion.add(this.jmenuDatosTipoAfiliacion);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarTipoAfiliacion);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasTipoAfiliacion() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdCateTipoAfiliacionTipoAfiliacion=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdCateTipoAfiliacionTipoAfiliacion.setToolTipText("Buscar Por Cate Tipo Afiliacion ");
		this.jButtonFK_IdCateTipoAfiliacionTipoAfiliacion= new JButtonMe();
		this.jButtonFK_IdCateTipoAfiliacionTipoAfiliacion.setText("Buscar");
		this.jButtonFK_IdCateTipoAfiliacionTipoAfiliacion.setToolTipText("Buscar Por Cate Tipo Afiliacion ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdCateTipoAfiliacionTipoAfiliacion,"buscar_button","Buscar Por Cate Tipo Afiliacion ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdCateTipoAfiliacionTipoAfiliacion, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_cate_tipo_afiliacionFK_IdCateTipoAfiliacionTipoAfiliacion = new JLabelMe();
		jLabelid_cate_tipo_afiliacionFK_IdCateTipoAfiliacionTipoAfiliacion.setText("Cate Tipo Afiliacion :");
		jLabelid_cate_tipo_afiliacionFK_IdCateTipoAfiliacionTipoAfiliacion.setToolTipText("Cate Tipo Afiliacion");
		jLabelid_cate_tipo_afiliacionFK_IdCateTipoAfiliacionTipoAfiliacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_cate_tipo_afiliacionFK_IdCateTipoAfiliacionTipoAfiliacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_cate_tipo_afiliacionFK_IdCateTipoAfiliacionTipoAfiliacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_cate_tipo_afiliacionFK_IdCateTipoAfiliacionTipoAfiliacion,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_cate_tipo_afiliacionFK_IdCateTipoAfiliacionTipoAfiliacion= new JComboBoxMe();
		jComboBoxid_cate_tipo_afiliacionFK_IdCateTipoAfiliacionTipoAfiliacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cate_tipo_afiliacionFK_IdCateTipoAfiliacionTipoAfiliacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cate_tipo_afiliacionFK_IdCateTipoAfiliacionTipoAfiliacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cate_tipo_afiliacionFK_IdCateTipoAfiliacionTipoAfiliacion,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasTipoAfiliacion=new JTabbedPane();


		this.jTabbedPaneBusquedasTipoAfiliacion.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoAfiliacion.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoAfiliacion.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasTipoAfiliacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasTipoAfiliacion.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasTipoAfiliacion,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleTipoAfiliacion = new TipoAfiliacionDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Tipo Afiliacion DATOS");
			this.jInternalFrameDetalleFormTipoAfiliacion = new TipoAfiliacionDetalleFormJInternalFrame(jDesktopPane,this.tipoafiliacionSessionBean.getConGuardarRelaciones(),this.tipoafiliacionSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormTipoAfiliacion = null;//new TipoAfiliacionDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoAfiliacion= new GridBagLayout();
		
		
		this.jTableDatosTipoAfiliacion = new JTableMe();      
		
		String sToolTipTipoAfiliacion="";
		sToolTipTipoAfiliacion=TipoAfiliacionConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoAfiliacion+="(Nomina.TipoAfiliacion)";
		}
		
		if(!this.tipoafiliacionSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoAfiliacion+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosTipoAfiliacion.setToolTipText(sToolTipTipoAfiliacion);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosTipoAfiliacion);
		this.jTableDatosTipoAfiliacion.setAutoCreateRowSorter(true);
		this.jTableDatosTipoAfiliacion.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosTipoAfiliacion.setRowSelectionAllowed(true);
		this.jTableDatosTipoAfiliacion.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosTipoAfiliacion,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoTipoAfiliacion = new JButtonMe();
		this.jButtonDuplicarTipoAfiliacion = new JButtonMe();
		this.jButtonCopiarTipoAfiliacion = new JButtonMe();
		this.jButtonVerFormTipoAfiliacion = new JButtonMe();
		this.jButtonNuevoRelacionesTipoAfiliacion = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaTipoAfiliacion = new JButtonMe();
		this.jButtonCerrarTipoAfiliacion = new JButtonMe();
		
		this.jScrollPanelDatosTipoAfiliacion = new JScrollPane();   
        this.jScrollPanelDatosGeneralTipoAfiliacion = new JScrollPane();
		
				
		
		
		this.jPanelAccionesTipoAfiliacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Afiliacion";
		
		if(!this.tipoafiliacionSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoAfiliacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Afiliaciones" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoAfiliacion.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralTipoAfiliacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesTipoAfiliacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoAfiliacion.setToolTipText("Acciones");
        this.jPanelAccionesTipoAfiliacion.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoAfiliacion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoAfiliacion, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoTipoAfiliacion=new ReporteDinamicoJInternalFrame(TipoAfiliacionConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoTipoAfiliacion();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionTipoAfiliacion=new ImportacionJInternalFrame(TipoAfiliacionConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionTipoAfiliacion();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByTipoAfiliacion = new JButtonMe();
		
		this.jButtonAbrirOrderByTipoAfiliacion.setText("Orden");
		this.jButtonAbrirOrderByTipoAfiliacion.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoAfiliacion,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoAfiliacion, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByTipoAfiliacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByTipoAfiliacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoAfiliacion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoAfiliacion,false,this);
			
			//this.cargarOrderByTipoAfiliacion(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoAfiliacion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoAfiliacion,true,this);
			
			//this.cargarOrderByTipoAfiliacion(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosTipoAfiliacion.setMinimumSize(new Dimension(400,50));//1230
		this.jTableDatosTipoAfiliacion.setMaximumSize(new Dimension(400,50));//1230
		this.jTableDatosTipoAfiliacion.setPreferredSize(new Dimension(400,50));//1230
		
		this.jScrollPanelDatosTipoAfiliacion.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoAfiliacion.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoAfiliacion.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoTipoAfiliacion.setText("Nuevo");
		this.jButtonDuplicarTipoAfiliacion.setText("Duplicar");
		this.jButtonCopiarTipoAfiliacion.setText("Copiar");
		this.jButtonVerFormTipoAfiliacion.setText("Ver");
		this.jButtonNuevoRelacionesTipoAfiliacion.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaTipoAfiliacion.setText("Guardar");
		this.jButtonCerrarTipoAfiliacion.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoAfiliacion,"nuevo_button","Nuevo",this.tipoafiliacionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarTipoAfiliacion,"duplicar_button","Duplicar",this.tipoafiliacionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarTipoAfiliacion,"copiar_button","Copiar",this.tipoafiliacionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormTipoAfiliacion,"ver_form","Ver",this.tipoafiliacionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesTipoAfiliacion,"nuevorelaciones_button","Nuevo Rel",this.tipoafiliacionSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoAfiliacion,"guardarcambiostabla_button","Guardar",this.tipoafiliacionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoAfiliacion,"cerrar_button","Salir",this.tipoafiliacionSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoAfiliacion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarTipoAfiliacion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarTipoAfiliacion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormTipoAfiliacion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesTipoAfiliacion, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoAfiliacion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoAfiliacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoTipoAfiliacion.setToolTipText("Nuevo"+" "+TipoAfiliacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarTipoAfiliacion.setToolTipText("Duplicar"+" "+TipoAfiliacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarTipoAfiliacion.setToolTipText("Copiar"+" "+TipoAfiliacionConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormTipoAfiliacion.setToolTipText("Ver"+" "+TipoAfiliacionConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesTipoAfiliacion.setToolTipText("Nuevo Rel"+" "+TipoAfiliacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaTipoAfiliacion.setToolTipText("Guardar"+" "+TipoAfiliacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoAfiliacion.setToolTipText("Salir"+" "+TipoAfiliacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoAfiliacion";
		inputMap = this.jButtonNuevoTipoAfiliacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoAfiliacion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoAfiliacion"));
		
		//DUPLICAR
		sMapKey = "DuplicarTipoAfiliacion";
		inputMap = this.jButtonDuplicarTipoAfiliacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarTipoAfiliacion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarTipoAfiliacion"));
		
		//COPIAR
		sMapKey = "CopiarTipoAfiliacion";
		inputMap = this.jButtonCopiarTipoAfiliacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarTipoAfiliacion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarTipoAfiliacion"));
		
		//VEr FORM
		sMapKey = "VerFormTipoAfiliacion";
		inputMap = this.jButtonVerFormTipoAfiliacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormTipoAfiliacion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormTipoAfiliacion"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesTipoAfiliacion";
		inputMap = this.jButtonNuevoRelacionesTipoAfiliacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesTipoAfiliacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesTipoAfiliacion"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarTipoAfiliacion";
		inputMap = this.jButtonModificarTipoAfiliacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarTipoAfiliacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarTipoAfiliacion"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarTipoAfiliacion";
		inputMap = this.jButtonCerrarTipoAfiliacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoAfiliacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoAfiliacion"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoAfiliacion";
		inputMap = this.jButtonGuardarCambiosTablaTipoAfiliacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoAfiliacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoAfiliacion"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesTipoAfiliacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesTipoAfiliacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionTipoAfiliacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1TipoAfiliacion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2TipoAfiliacion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3TipoAfiliacion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4TipoAfiliacion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5TipoAfiliacion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesTipoAfiliacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesTipoAfiliacion.setName("jPanelParametrosReportesTipoAfiliacion"); 
		
		this.jPanelParametrosReportesAccionesTipoAfiliacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesTipoAfiliacion.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesTipoAfiliacion.setName("jPanelParametrosReportesAccionesTipoAfiliacion"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesTipoAfiliacion, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesTipoAfiliacion, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionTipoAfiliacion = new JButtonMe();
		this.jButtonRecargarInformacionTipoAfiliacion.setText("Recargar");
		this.jButtonRecargarInformacionTipoAfiliacion.setToolTipText("Recargar"+" "+TipoAfiliacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionTipoAfiliacion,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionTipoAfiliacion = new JButtonMe();
		this.jButtonProcesarInformacionTipoAfiliacion.setText("Procesar");
		this.jButtonProcesarInformacionTipoAfiliacion.setToolTipText("Procesar"+" "+TipoAfiliacionConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionTipoAfiliacion.setVisible(false);
			
		this.jButtonProcesarInformacionTipoAfiliacion.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoAfiliacion.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoAfiliacion.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesTipoAfiliacion = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoAfiliacion.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesTipoAfiliacion.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesTipoAfiliacion = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoAfiliacion.setText("TIPO");       
		this.jComboBoxTiposReportesTipoAfiliacion.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesTipoAfiliacion = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoAfiliacion.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesTipoAfiliacion.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionTipoAfiliacion = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionTipoAfiliacion.setText("Paginacion");
		this.jComboBoxTiposPaginacionTipoAfiliacion.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesTipoAfiliacion = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesTipoAfiliacion.setText("Accion");
		this.jComboBoxTiposRelacionesTipoAfiliacion.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesTipoAfiliacion = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoAfiliacion.setText("Accion");
		this.jComboBoxTiposAccionesTipoAfiliacion.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarTipoAfiliacion = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarTipoAfiliacion.setText("Accion");
		this.jComboBoxTiposSeleccionarTipoAfiliacion.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralTipoAfiliacion=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralTipoAfiliacion.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoAfiliacion.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoAfiliacion.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesTipoAfiliacion = new JLabelMe();
		
		this.jLabelAccionesTipoAfiliacion.setText("Acciones");		
		this.jLabelAccionesTipoAfiliacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoAfiliacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoAfiliacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosTipoAfiliacion = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosTipoAfiliacion.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosTipoAfiliacion.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosTipoAfiliacion = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosTipoAfiliacion.setText("Seleccionados");
		this.jCheckBoxSeleccionadosTipoAfiliacion.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaTipoAfiliacion = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaTipoAfiliacion.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaTipoAfiliacion.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteTipoAfiliacion = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteTipoAfiliacion.setText("Graf.");
		this.jCheckBoxConGraficoReporteTipoAfiliacion.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresTipoAfiliacion = new JButtonMe();
		//this.jButtonAnterioresTipoAfiliacion.setText("<<");
        this.jButtonAnterioresTipoAfiliacion.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresTipoAfiliacion,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresTipoAfiliacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesTipoAfiliacion = new JButtonMe();
		//this.jButtonSiguientesTipoAfiliacion.setText(">>");
        this.jButtonSiguientesTipoAfiliacion.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesTipoAfiliacion,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesTipoAfiliacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosTipoAfiliacion = new JButtonMe();
		this.jButtonNuevoGuardarCambiosTipoAfiliacion.setText("Nue");
        this.jButtonNuevoGuardarCambiosTipoAfiliacion.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosTipoAfiliacion,"nuevoguardarcambios_button","Nue",this.tipoafiliacionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosTipoAfiliacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosTipoAfiliacion";
		inputMap = this.jButtonNuevoGuardarCambiosTipoAfiliacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosTipoAfiliacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosTipoAfiliacion"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionTipoAfiliacion";
		inputMap = this.jButtonRecargarInformacionTipoAfiliacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionTipoAfiliacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionTipoAfiliacion"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesTipoAfiliacion";
		inputMap = this.jButtonSiguientesTipoAfiliacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesTipoAfiliacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesTipoAfiliacion"));
		
		//ANTERIORES		
		sMapKey = "AnterioresTipoAfiliacion";
		inputMap = this.jButtonAnterioresTipoAfiliacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresTipoAfiliacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresTipoAfiliacion"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasTipoAfiliacion();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesTipoAfiliacion.setMinimumSize(new Dimension(this.getWidth(),TipoAfiliacionBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoAfiliacionBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoAfiliacion.setMaximumSize(new Dimension(this.getWidth(),TipoAfiliacionBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoAfiliacionBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoAfiliacion.setPreferredSize(new Dimension(this.getWidth(),TipoAfiliacionBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoAfiliacionBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionTipoAfiliacion = new GridBagLayout();

			this.jPanelPaginacionTipoAfiliacion.setLayout(gridaBagLayoutPaginacionTipoAfiliacion);						
			
			this.gridBagConstraintsTipoAfiliacion = new GridBagConstraints();
			this.gridBagConstraintsTipoAfiliacion.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsTipoAfiliacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoAfiliacion.gridy = 0;
			this.gridBagConstraintsTipoAfiliacion.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionTipoAfiliacion.add(this.jButtonAnterioresTipoAfiliacion, this.gridBagConstraintsTipoAfiliacion);
					
						
			this.gridBagConstraintsTipoAfiliacion = new GridBagConstraints();
			this.gridBagConstraintsTipoAfiliacion.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoAfiliacion.gridy = 0;
			
			this.jPanelPaginacionTipoAfiliacion.add(this.jButtonNuevoGuardarCambiosTipoAfiliacion, this.gridBagConstraintsTipoAfiliacion);
						
			
			this.gridBagConstraintsTipoAfiliacion = new GridBagConstraints();
			this.gridBagConstraintsTipoAfiliacion.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsTipoAfiliacion.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoAfiliacion.gridy = 0;
			this.jPanelPaginacionTipoAfiliacion.add(this.jButtonSiguientesTipoAfiliacion, this.gridBagConstraintsTipoAfiliacion);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsTipoAfiliacion = new GridBagConstraints();
			this.gridBagConstraintsTipoAfiliacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoAfiliacion.gridy = 1;
			this.gridBagConstraintsTipoAfiliacion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoAfiliacion.add(this.jButtonNuevoTipoAfiliacion, this.gridBagConstraintsTipoAfiliacion);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsTipoAfiliacion = new GridBagConstraints();
				this.gridBagConstraintsTipoAfiliacion.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoAfiliacion.gridy = 1;
				this.gridBagConstraintsTipoAfiliacion.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionTipoAfiliacion.add(this.jButtonNuevoRelacionesTipoAfiliacion, this.gridBagConstraintsTipoAfiliacion);
			}
			
			
			if(!this.tipoafiliacionSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsTipoAfiliacion = new GridBagConstraints();
				this.gridBagConstraintsTipoAfiliacion.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoAfiliacion.gridy = 1;
				this.gridBagConstraintsTipoAfiliacion.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionTipoAfiliacion.add(this.jButtonGuardarCambiosTablaTipoAfiliacion, this.gridBagConstraintsTipoAfiliacion);
			}
			
			
			
			this.gridBagConstraintsTipoAfiliacion = new GridBagConstraints();
			this.gridBagConstraintsTipoAfiliacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoAfiliacion.gridy = 1;
			this.gridBagConstraintsTipoAfiliacion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoAfiliacion.add(this.jButtonDuplicarTipoAfiliacion, this.gridBagConstraintsTipoAfiliacion);
			
			this.gridBagConstraintsTipoAfiliacion = new GridBagConstraints();
			this.gridBagConstraintsTipoAfiliacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoAfiliacion.gridy = 1;
			this.gridBagConstraintsTipoAfiliacion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoAfiliacion.add(this.jButtonCopiarTipoAfiliacion, this.gridBagConstraintsTipoAfiliacion);
		
			this.gridBagConstraintsTipoAfiliacion = new GridBagConstraints();
			this.gridBagConstraintsTipoAfiliacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoAfiliacion.gridy = 1;
			this.gridBagConstraintsTipoAfiliacion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoAfiliacion.add(this.jButtonVerFormTipoAfiliacion, this.gridBagConstraintsTipoAfiliacion);
		
			this.gridBagConstraintsTipoAfiliacion = new GridBagConstraints();
			this.gridBagConstraintsTipoAfiliacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoAfiliacion.gridy = 1;
			this.gridBagConstraintsTipoAfiliacion.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionTipoAfiliacion.add(this.jButtonCerrarTipoAfiliacion, this.gridBagConstraintsTipoAfiliacion);
		
		
		
		this.jButtonRecargarInformacionTipoAfiliacion.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoAfiliacion.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoAfiliacion.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionTipoAfiliacion, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesTipoAfiliacion.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoAfiliacion.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoAfiliacion.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesTipoAfiliacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesTipoAfiliacion.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoAfiliacion.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoAfiliacion.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesTipoAfiliacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesTipoAfiliacion.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoAfiliacion.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoAfiliacion.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesTipoAfiliacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionTipoAfiliacion.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoAfiliacion.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoAfiliacion.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionTipoAfiliacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesTipoAfiliacion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoAfiliacion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoAfiliacion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesTipoAfiliacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesTipoAfiliacion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoAfiliacion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoAfiliacion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoAfiliacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarTipoAfiliacion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoAfiliacion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoAfiliacion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarTipoAfiliacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaTipoAfiliacion.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoAfiliacion.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoAfiliacion.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaTipoAfiliacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteTipoAfiliacion.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoAfiliacion.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoAfiliacion.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteTipoAfiliacion, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosTipoAfiliacion.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoAfiliacion.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoAfiliacion.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosTipoAfiliacion, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosTipoAfiliacion.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoAfiliacion.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoAfiliacion.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosTipoAfiliacion, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesTipoAfiliacion = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesTipoAfiliacion = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1TipoAfiliacion = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2TipoAfiliacion = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3TipoAfiliacion = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4TipoAfiliacion = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesTipoAfiliacion.setLayout(gridaBagParametrosReportesTipoAfiliacion);
			this.jPanelParametrosReportesAccionesTipoAfiliacion.setLayout(gridaBagParametrosReportesAccionesTipoAfiliacion);
			
			
			this.jPanelParametrosAuxiliar1TipoAfiliacion.setLayout(gridaBagParametrosAuxiliar1TipoAfiliacion);
			this.jPanelParametrosAuxiliar2TipoAfiliacion.setLayout(gridaBagParametrosAuxiliar2TipoAfiliacion);
			this.jPanelParametrosAuxiliar3TipoAfiliacion.setLayout(gridaBagParametrosAuxiliar3TipoAfiliacion);
			this.jPanelParametrosAuxiliar4TipoAfiliacion.setLayout(gridaBagParametrosAuxiliar4TipoAfiliacion);
			//this.jPanelParametrosAuxiliar5TipoAfiliacion.setLayout(gridaBagParametrosAuxiliar2TipoAfiliacion);			
			
			
			
			
			this.gridBagConstraintsTipoAfiliacion = new GridBagConstraints();
			this.gridBagConstraintsTipoAfiliacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoAfiliacion.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoAfiliacion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoAfiliacion.add(this.jButtonRecargarInformacionTipoAfiliacion, this.gridBagConstraintsTipoAfiliacion);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsTipoAfiliacion = new GridBagConstraints();
			this.gridBagConstraintsTipoAfiliacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoAfiliacion.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoAfiliacion.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoAfiliacion.add(this.jComboBoxTiposPaginacionTipoAfiliacion, this.gridBagConstraintsTipoAfiliacion);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsTipoAfiliacion = new GridBagConstraints();
			this.gridBagConstraintsTipoAfiliacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoAfiliacion.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoAfiliacion.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoAfiliacion.add(this.jCheckBoxConAltoMaximoTablaTipoAfiliacion, this.gridBagConstraintsTipoAfiliacion);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsTipoAfiliacion = new GridBagConstraints();
			this.gridBagConstraintsTipoAfiliacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoAfiliacion.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoAfiliacion.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoAfiliacion.add(this.jComboBoxTiposArchivosReportesTipoAfiliacion, this.gridBagConstraintsTipoAfiliacion);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsTipoAfiliacion = new GridBagConstraints();
			this.gridBagConstraintsTipoAfiliacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoAfiliacion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoAfiliacion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoAfiliacion.add(this.jPanelParametrosAuxiliar1TipoAfiliacion, this.gridBagConstraintsTipoAfiliacion);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsTipoAfiliacion = new GridBagConstraints();
			this.gridBagConstraintsTipoAfiliacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoAfiliacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoAfiliacion.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoAfiliacion.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4TipoAfiliacion.add(this.jComboBoxTiposReportesTipoAfiliacion, this.gridBagConstraintsTipoAfiliacion);																		
			
			
			
			this.gridBagConstraintsTipoAfiliacion = new GridBagConstraints();
			this.gridBagConstraintsTipoAfiliacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoAfiliacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoAfiliacion.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoAfiliacion.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4TipoAfiliacion.add(this.jComboBoxTiposGraficosReportesTipoAfiliacion, this.gridBagConstraintsTipoAfiliacion);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsTipoAfiliacion = new GridBagConstraints();
			this.gridBagConstraintsTipoAfiliacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoAfiliacion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoAfiliacion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoAfiliacion.add(this.jPanelParametrosAuxiliar4TipoAfiliacion, this.gridBagConstraintsTipoAfiliacion);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsTipoAfiliacion = new GridBagConstraints();
			this.gridBagConstraintsTipoAfiliacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoAfiliacion.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoAfiliacion.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoAfiliacion.add(this.jComboBoxTiposReportesTipoAfiliacion, this.gridBagConstraintsTipoAfiliacion);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsTipoAfiliacion = new GridBagConstraints();
			this.gridBagConstraintsTipoAfiliacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoAfiliacion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoAfiliacion.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoAfiliacion.add(this.jCheckBoxGenerarReporteTipoAfiliacion, this.gridBagConstraintsTipoAfiliacion);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsTipoAfiliacion = new GridBagConstraints();
			this.gridBagConstraintsTipoAfiliacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoAfiliacion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoAfiliacion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoAfiliacion.add(this.jPanelParametrosAuxiliar2TipoAfiliacion, this.gridBagConstraintsTipoAfiliacion);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsTipoAfiliacion = new GridBagConstraints();
			this.gridBagConstraintsTipoAfiliacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoAfiliacion.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoAfiliacion.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoAfiliacion.add(this.jLabelAccionesTipoAfiliacion, this.gridBagConstraintsTipoAfiliacion);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsTipoAfiliacion = new GridBagConstraints();
				this.gridBagConstraintsTipoAfiliacion.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsTipoAfiliacion.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsTipoAfiliacion.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesTipoAfiliacion.add(this.jButtonAbrirOrderByTipoAfiliacion, this.gridBagConstraintsTipoAfiliacion);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsTipoAfiliacion = new GridBagConstraints();
			this.gridBagConstraintsTipoAfiliacion.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsTipoAfiliacion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoAfiliacion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoAfiliacion.add(this.jComboBoxTiposSeleccionarTipoAfiliacion, this.gridBagConstraintsTipoAfiliacion);			
			
			
			/*
			this.gridBagConstraintsTipoAfiliacion = new GridBagConstraints();
			this.gridBagConstraintsTipoAfiliacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoAfiliacion.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoAfiliacion.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoAfiliacion.add(this.jCheckBoxSeleccionarTodosTipoAfiliacion, this.gridBagConstraintsTipoAfiliacion);
			
			this.gridBagConstraintsTipoAfiliacion = new GridBagConstraints();
			this.gridBagConstraintsTipoAfiliacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoAfiliacion.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoAfiliacion.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoAfiliacion.add(this.jCheckBoxConGraficoReporteTipoAfiliacion, this.gridBagConstraintsTipoAfiliacion);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsTipoAfiliacion = new GridBagConstraints();
			this.gridBagConstraintsTipoAfiliacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoAfiliacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoAfiliacion.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoAfiliacion.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoAfiliacion.add(this.jCheckBoxSeleccionarTodosTipoAfiliacion, this.gridBagConstraintsTipoAfiliacion);															
				
			this.gridBagConstraintsTipoAfiliacion = new GridBagConstraints();
			this.gridBagConstraintsTipoAfiliacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoAfiliacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoAfiliacion.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoAfiliacion.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoAfiliacion.add(this.jCheckBoxSeleccionadosTipoAfiliacion, this.gridBagConstraintsTipoAfiliacion);															
			
			this.gridBagConstraintsTipoAfiliacion = new GridBagConstraints();
			this.gridBagConstraintsTipoAfiliacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoAfiliacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoAfiliacion.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoAfiliacion.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoAfiliacion.add(this.jCheckBoxConGraficoReporteTipoAfiliacion, this.gridBagConstraintsTipoAfiliacion);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsTipoAfiliacion = new GridBagConstraints();
			this.gridBagConstraintsTipoAfiliacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoAfiliacion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoAfiliacion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoAfiliacion.add(this.jPanelParametrosAuxiliar3TipoAfiliacion, this.gridBagConstraintsTipoAfiliacion);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsTipoAfiliacion = new GridBagConstraints();
			this.gridBagConstraintsTipoAfiliacion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoAfiliacion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoAfiliacion.add(this.jComboBoxTiposRelacionesTipoAfiliacion, this.gridBagConstraintsTipoAfiliacion);
				
			this.gridBagConstraintsTipoAfiliacion = new GridBagConstraints();
			this.gridBagConstraintsTipoAfiliacion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoAfiliacion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoAfiliacion.add(this.jComboBoxTiposAccionesTipoAfiliacion, this.gridBagConstraintsTipoAfiliacion);
	
				
			this.gridBagConstraintsTipoAfiliacion = new GridBagConstraints();
			this.gridBagConstraintsTipoAfiliacion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoAfiliacion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoAfiliacion.add(this.jTextFieldValorCampoGeneralTipoAfiliacion, this.gridBagConstraintsTipoAfiliacion);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosTipoAfiliacion = new GridBagLayout();

			this.jScrollPanelDatosTipoAfiliacion.setLayout(gridaBagLayoutDatosTipoAfiliacion);
			
			this.gridBagConstraintsTipoAfiliacion = new GridBagConstraints();
			this.gridBagConstraintsTipoAfiliacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoAfiliacion.gridy = 0;
			this.gridBagConstraintsTipoAfiliacion.gridx = 0;
			
			this.jScrollPanelDatosTipoAfiliacion.add(this.jTableDatosTipoAfiliacion, this.gridBagConstraintsTipoAfiliacion);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosTipoAfiliacion.setViewportView(this.jTableDatosTipoAfiliacion);
		this.jTableDatosTipoAfiliacion.setFillsViewportHeight(true);
		this.jTableDatosTipoAfiliacion.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesTipoAfiliacion= new GridBagLayout();
		this.jPanelAccionesTipoAfiliacion.setLayout(gridaBagLayoutAccionesTipoAfiliacion);
		
		
		/*	
		this.gridBagConstraintsTipoAfiliacion = new GridBagConstraints();
		this.gridBagConstraintsTipoAfiliacion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoAfiliacion.gridy = 0;
		this.gridBagConstraintsTipoAfiliacion.gridx = 0;
			
		this.jPanelAccionesTipoAfiliacion.add(this.jButtonNuevoTipoAfiliacion, this.gridBagConstraintsTipoAfiliacion);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdCateTipoAfiliacionTipoAfiliacion= new GridBagLayout();
		gridaBagLayoutFK_IdCateTipoAfiliacionTipoAfiliacion.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdCateTipoAfiliacionTipoAfiliacion.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdCateTipoAfiliacionTipoAfiliacion.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdCateTipoAfiliacionTipoAfiliacion.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdCateTipoAfiliacionTipoAfiliacion.setLayout(gridaBagLayoutFK_IdCateTipoAfiliacionTipoAfiliacion);

		gridBagConstraintsTipoAfiliacion = new GridBagConstraints();
		gridBagConstraintsTipoAfiliacion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoAfiliacion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoAfiliacion.gridy = 0;
		gridBagConstraintsTipoAfiliacion.gridx = 0;
		jPanelFK_IdCateTipoAfiliacionTipoAfiliacion.add(jLabelid_cate_tipo_afiliacionFK_IdCateTipoAfiliacionTipoAfiliacion, gridBagConstraintsTipoAfiliacion);

		gridBagConstraintsTipoAfiliacion = new GridBagConstraints();
		gridBagConstraintsTipoAfiliacion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoAfiliacion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoAfiliacion.gridy = 0;
		gridBagConstraintsTipoAfiliacion.gridx = 1;
		jPanelFK_IdCateTipoAfiliacionTipoAfiliacion.add(jComboBoxid_cate_tipo_afiliacionFK_IdCateTipoAfiliacionTipoAfiliacion, gridBagConstraintsTipoAfiliacion);

		gridBagConstraintsTipoAfiliacion = new GridBagConstraints();
		gridBagConstraintsTipoAfiliacion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoAfiliacion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoAfiliacion.gridy = 1;
		gridBagConstraintsTipoAfiliacion.gridx =1;
		jPanelFK_IdCateTipoAfiliacionTipoAfiliacion.add(jButtonFK_IdCateTipoAfiliacionTipoAfiliacion, gridBagConstraintsTipoAfiliacion);

		jTabbedPaneBusquedasTipoAfiliacion.addTab("1.-Por Cate Tipo Afiliacion ", jPanelFK_IdCateTipoAfiliacionTipoAfiliacion);
		jTabbedPaneBusquedasTipoAfiliacion.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoAfiliacion = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoAfiliacion);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipoafiliacionSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoAfiliacion = new GridBagConstraints();						
			this.gridBagConstraintsTipoAfiliacion.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoAfiliacion.gridx = 0;		
			//this.gridBagConstraintsTipoAfiliacion.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoAfiliacion.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoAfiliacion.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarTipoAfiliacion, this.gridBagConstraintsTipoAfiliacion);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsTipoAfiliacion = new GridBagConstraints();
		this.gridBagConstraintsTipoAfiliacion.gridy = iGridyPrincipal++;
		this.gridBagConstraintsTipoAfiliacion.gridx = 0;		
		//this.gridBagConstraintsTipoAfiliacion.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoAfiliacion.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsTipoAfiliacion.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsTipoAfiliacion);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsTipoAfiliacion = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsTipoAfiliacion.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoAfiliacion.gridx = 0;		
			this.gridBagConstraintsTipoAfiliacion.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoAfiliacion.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsTipoAfiliacion.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasTipoAfiliacion, this.gridBagConstraintsTipoAfiliacion);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsTipoAfiliacion = new GridBagConstraints();
		this.gridBagConstraintsTipoAfiliacion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoAfiliacion.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesTipoAfiliacion, this.gridBagConstraintsTipoAfiliacion);								
		
		
		/*
		this.gridBagConstraintsTipoAfiliacion = new GridBagConstraints();
		this.gridBagConstraintsTipoAfiliacion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoAfiliacion.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesTipoAfiliacion, this.gridBagConstraintsTipoAfiliacion);
		*/		
		
		this.gridBagConstraintsTipoAfiliacion = new GridBagConstraints();
		this.gridBagConstraintsTipoAfiliacion.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoAfiliacion.gridx =0;
		this.gridBagConstraintsTipoAfiliacion.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoAfiliacion.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoAfiliacion, this.gridBagConstraintsTipoAfiliacion);
				
		
		this.gridBagConstraintsTipoAfiliacion = new GridBagConstraints();
		this.gridBagConstraintsTipoAfiliacion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoAfiliacion.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionTipoAfiliacion, this.gridBagConstraintsTipoAfiliacion);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(TipoAfiliacionJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosTipoAfiliacion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoAfiliacion = new GridBagLayout();
			this.jPanelBusquedasParametrosTipoAfiliacion.setLayout(gridaBagLayoutBusquedasParametrosTipoAfiliacion);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralTipoAfiliacion=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoAfiliacion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoAfiliacion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoAfiliacion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoAfiliacion = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsTipoAfiliacion = new GridBagConstraints();
		this.gridBagConstraintsTipoAfiliacion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoAfiliacion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoAfiliacion, this.gridBagConstraintsTipoAfiliacion);
			
			
		this.gridBagConstraintsTipoAfiliacion = new GridBagConstraints();
		this.gridBagConstraintsTipoAfiliacion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoAfiliacion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoAfiliacion, this.gridBagConstraintsTipoAfiliacion);
		
			
		this.gridBagConstraintsTipoAfiliacion = new GridBagConstraints();
		this.gridBagConstraintsTipoAfiliacion.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoAfiliacion.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoAfiliacion, this.gridBagConstraintsTipoAfiliacion);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralTipoAfiliacion;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoTipoAfiliacion() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoTipoAfiliacion = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoTipoAfiliacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoTipoAfiliacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoTipoAfiliacion.setName("jPanelReporteDinamicoTipoAfiliacion"); 
		
		this.jPanelReporteDinamicoTipoAfiliacion.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoAfiliacion.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoAfiliacion.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoTipoAfiliacion.setLayout(gridaBagLayoutReporteDinamicoTipoAfiliacion);
		
		
		this.jInternalFrameReporteDinamicoTipoAfiliacion= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoTipoAfiliacion = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoAfiliacion= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoTipoAfiliacion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoTipoAfiliacion.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoTipoAfiliacion.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoTipoAfiliacion.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoTipoAfiliacion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoTipoAfiliacion.setResizable(true);
	    this.jInternalFrameReporteDinamicoTipoAfiliacion.setClosable(true);
	    this.jInternalFrameReporteDinamicoTipoAfiliacion.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoTipoAfiliacion.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoAfiliacion.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoAfiliacion.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoTipoAfiliacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Afiliaciones"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteTipoAfiliacion = new JLabelMe();

		this.jLabelColumnasSelectReporteTipoAfiliacion.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteTipoAfiliacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoAfiliacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoAfiliacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoAfiliacion = new GridBagConstraints();
		this.gridBagConstraintsTipoAfiliacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoAfiliacion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoAfiliacion.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoAfiliacion.add(this.jLabelColumnasSelectReporteTipoAfiliacion, this.gridBagConstraintsTipoAfiliacion);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteTipoAfiliacion = new JList<Reporte>();
		this.jListColumnasSelectReporteTipoAfiliacion.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteTipoAfiliacion.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteTipoAfiliacion.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoAfiliacion.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoAfiliacion.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteTipoAfiliacion=new JScrollPane(this.jListColumnasSelectReporteTipoAfiliacion);
			
			this.jScrollColumnasSelectReporteTipoAfiliacion.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoAfiliacion.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoAfiliacion.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteTipoAfiliacion.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTipoAfiliacion = new GridBagConstraints();
		this.gridBagConstraintsTipoAfiliacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoAfiliacion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoAfiliacion.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoAfiliacion.add(this.jListColumnasSelectReporteTipoAfiliacion, this.gridBagConstraintsTipoAfiliacion);
		this.jPanelReporteDinamicoTipoAfiliacion.add(this.jScrollColumnasSelectReporteTipoAfiliacion, this.gridBagConstraintsTipoAfiliacion);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteTipoAfiliacion = new JLabelMe();

		this.jLabelRelacionesSelectReporteTipoAfiliacion.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteTipoAfiliacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoAfiliacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoAfiliacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsTipoAfiliacion = new GridBagConstraints();
		this.gridBagConstraintsTipoAfiliacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoAfiliacion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoAfiliacion.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoAfiliacion.add(this.jLabelRelacionesSelectReporteTipoAfiliacion, this.gridBagConstraintsTipoAfiliacion);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteTipoAfiliacion = new JList<Reporte>();
		this.jListRelacionesSelectReporteTipoAfiliacion.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteTipoAfiliacion.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteTipoAfiliacion.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoAfiliacion.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoAfiliacion.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteTipoAfiliacion=new JScrollPane(this.jListRelacionesSelectReporteTipoAfiliacion);
			
			this.jScrollRelacionesSelectReporteTipoAfiliacion.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoAfiliacion.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoAfiliacion.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteTipoAfiliacion.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsTipoAfiliacion = new GridBagConstraints();
		this.gridBagConstraintsTipoAfiliacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoAfiliacion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoAfiliacion.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoAfiliacion.add(this.jListRelacionesSelectReporteTipoAfiliacion, this.gridBagConstraintsTipoAfiliacion);
		this.jPanelReporteDinamicoTipoAfiliacion.add(this.jScrollRelacionesSelectReporteTipoAfiliacion, this.gridBagConstraintsTipoAfiliacion);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoTipoAfiliacion = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoTipoAfiliacion = new JComboBoxMe();
		this.jListColumnasValoresGraficoTipoAfiliacion = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoTipoAfiliacion = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoTipoAfiliacion.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoTipoAfiliacion.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoAfiliacion.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoAfiliacion.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoTipoAfiliacion, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoTipoAfiliacion = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoTipoAfiliacion.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoTipoAfiliacion.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoAfiliacion.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoAfiliacion.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoTipoAfiliacion, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoTipoAfiliacion = new JLabelMe();

		this.jLabelConGraficoDinamicoTipoAfiliacion.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoTipoAfiliacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoTipoAfiliacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoTipoAfiliacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsTipoAfiliacion = new GridBagConstraints();
		this.gridBagConstraintsTipoAfiliacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoAfiliacion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoAfiliacion.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoAfiliacion.add(this.jLabelConGraficoDinamicoTipoAfiliacion, this.gridBagConstraintsTipoAfiliacion);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoTipoAfiliacion = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoTipoAfiliacion.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoTipoAfiliacion.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoTipoAfiliacion.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoTipoAfiliacion.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoTipoAfiliacion.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsTipoAfiliacion = new GridBagConstraints();
		this.gridBagConstraintsTipoAfiliacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoAfiliacion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoAfiliacion.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoAfiliacion.add(this.jCheckBoxConGraficoDinamicoTipoAfiliacion, this.gridBagConstraintsTipoAfiliacion);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoTipoAfiliacion = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoTipoAfiliacion.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoTipoAfiliacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoTipoAfiliacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoTipoAfiliacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsTipoAfiliacion = new GridBagConstraints();
		this.gridBagConstraintsTipoAfiliacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoAfiliacion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoAfiliacion.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoAfiliacion.add(this.jLabelColumnaCategoriaGraficoTipoAfiliacion, this.gridBagConstraintsTipoAfiliacion);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoTipoAfiliacion = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoTipoAfiliacion.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoTipoAfiliacion.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoTipoAfiliacion.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoTipoAfiliacion.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoTipoAfiliacion.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsTipoAfiliacion = new GridBagConstraints();
		this.gridBagConstraintsTipoAfiliacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoAfiliacion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoAfiliacion.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoTipoAfiliacion.add(this.jComboBoxColumnaCategoriaGraficoTipoAfiliacion, this.gridBagConstraintsTipoAfiliacion);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorTipoAfiliacion = new JLabelMe();

		this.jLabelColumnaCategoriaValorTipoAfiliacion.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorTipoAfiliacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorTipoAfiliacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorTipoAfiliacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsTipoAfiliacion = new GridBagConstraints();
		this.gridBagConstraintsTipoAfiliacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoAfiliacion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoAfiliacion.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoAfiliacion.add(this.jLabelColumnaCategoriaValorTipoAfiliacion, this.gridBagConstraintsTipoAfiliacion);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorTipoAfiliacion = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorTipoAfiliacion.setText("Accion");
        this.jComboBoxColumnaCategoriaValorTipoAfiliacion.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorTipoAfiliacion.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorTipoAfiliacion.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorTipoAfiliacion.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsTipoAfiliacion = new GridBagConstraints();
		this.gridBagConstraintsTipoAfiliacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoAfiliacion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoAfiliacion.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoTipoAfiliacion.add(this.jComboBoxColumnaCategoriaValorTipoAfiliacion, this.gridBagConstraintsTipoAfiliacion);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoTipoAfiliacion = new JLabelMe();

		this.jLabelColumnasValoresGraficoTipoAfiliacion.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoTipoAfiliacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoTipoAfiliacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoTipoAfiliacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsTipoAfiliacion = new GridBagConstraints();
		this.gridBagConstraintsTipoAfiliacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoAfiliacion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoAfiliacion.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoAfiliacion.add(this.jLabelColumnasValoresGraficoTipoAfiliacion, this.gridBagConstraintsTipoAfiliacion);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoTipoAfiliacion = new JList<Reporte>();
		this.jListColumnasValoresGraficoTipoAfiliacion.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoTipoAfiliacion.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoTipoAfiliacion.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoTipoAfiliacion.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoTipoAfiliacion.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoTipoAfiliacion=new JScrollPane(this.jListColumnasValoresGraficoTipoAfiliacion);
			
			this.jScrollColumnasValoresGraficoTipoAfiliacion.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoTipoAfiliacion.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoTipoAfiliacion.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoTipoAfiliacion.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTipoAfiliacion = new GridBagConstraints();
		this.gridBagConstraintsTipoAfiliacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoAfiliacion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoAfiliacion.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoTipoAfiliacion.add(this.jListColumnasSelectReporteTipoAfiliacion, this.gridBagConstraintsTipoAfiliacion);
		this.jPanelReporteDinamicoTipoAfiliacion.add(this.jScrollColumnasValoresGraficoTipoAfiliacion, this.gridBagConstraintsTipoAfiliacion);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoTipoAfiliacion = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoTipoAfiliacion.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoTipoAfiliacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoTipoAfiliacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoTipoAfiliacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsTipoAfiliacion = new GridBagConstraints();
		this.gridBagConstraintsTipoAfiliacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoAfiliacion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoAfiliacion.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoAfiliacion.add(this.jLabelTiposGraficosReportesDinamicoTipoAfiliacion, this.gridBagConstraintsTipoAfiliacion);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoTipoAfiliacion = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoTipoAfiliacion.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoTipoAfiliacion.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoTipoAfiliacion.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoTipoAfiliacion.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoTipoAfiliacion.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsTipoAfiliacion = new GridBagConstraints();
		this.gridBagConstraintsTipoAfiliacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoAfiliacion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoAfiliacion.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoAfiliacion.add(this.jComboBoxTiposGraficosReportesDinamicoTipoAfiliacion, this.gridBagConstraintsTipoAfiliacion);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoTipoAfiliacion = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoTipoAfiliacion.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoTipoAfiliacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoAfiliacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoAfiliacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoAfiliacion = new GridBagConstraints();
		this.gridBagConstraintsTipoAfiliacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoAfiliacion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoAfiliacion.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoAfiliacion.add(this.jLabelGenerarExcelReporteDinamicoTipoAfiliacion, this.gridBagConstraintsTipoAfiliacion);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoTipoAfiliacion = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoTipoAfiliacion.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoTipoAfiliacion,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoTipoAfiliacion.setToolTipText("Generar EXCEL"+" "+TipoAfiliacionConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsTipoAfiliacion = new GridBagConstraints();
		//this.gridBagConstraintsTipoAfiliacion.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsTipoAfiliacion.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsTipoAfiliacion.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoTipoAfiliacion.add(this.jButtonGenerarExcelReporteDinamicoTipoAfiliacion, this.gridBagConstraintsTipoAfiliacion);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsTipoAfiliacion = new GridBagConstraints();
		this.gridBagConstraintsTipoAfiliacion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoAfiliacion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoAfiliacion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoAfiliacion.add(this.jComboBoxTiposReportesDinamicoTipoAfiliacion, this.gridBagConstraintsTipoAfiliacion);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoTipoAfiliacion = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoTipoAfiliacion.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoTipoAfiliacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoAfiliacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoAfiliacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoAfiliacion = new GridBagConstraints();
		this.gridBagConstraintsTipoAfiliacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoAfiliacion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoAfiliacion.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoAfiliacion.add(this.jLabelTiposArchivoReporteDinamicoTipoAfiliacion, this.gridBagConstraintsTipoAfiliacion);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsTipoAfiliacion = new GridBagConstraints();
		this.gridBagConstraintsTipoAfiliacion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoAfiliacion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoAfiliacion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoAfiliacion.add(this.jComboBoxTiposArchivosReportesDinamicoTipoAfiliacion, this.gridBagConstraintsTipoAfiliacion);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoTipoAfiliacion = new JButtonMe();
		this.jButtonGenerarReporteDinamicoTipoAfiliacion.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoTipoAfiliacion,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoTipoAfiliacion.setToolTipText("Generar"+" "+TipoAfiliacionConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsTipoAfiliacion = new GridBagConstraints();
		this.gridBagConstraintsTipoAfiliacion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoAfiliacion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoAfiliacion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoAfiliacion.add(this.jButtonGenerarReporteDinamicoTipoAfiliacion, this.gridBagConstraintsTipoAfiliacion);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoTipoAfiliacion = new JButtonMe();
		this.jButtonCerrarReporteDinamicoTipoAfiliacion.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoTipoAfiliacion,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoTipoAfiliacion.setToolTipText("Cancelar"+" "+TipoAfiliacionConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoAfiliacion = new GridBagConstraints();
		this.gridBagConstraintsTipoAfiliacion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoAfiliacion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoAfiliacion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoAfiliacion.add(this.jButtonCerrarReporteDinamicoTipoAfiliacion, this.gridBagConstraintsTipoAfiliacion);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalTipoAfiliacion = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoTipoAfiliacion= new JScrollPane(jPanelReporteDinamicoTipoAfiliacion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoTipoAfiliacion.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoAfiliacion.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoAfiliacion.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoTipoAfiliacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Afiliaciones"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoAfiliacion = new GridBagConstraints();
		this.gridBagConstraintsTipoAfiliacion.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsTipoAfiliacion.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsTipoAfiliacion.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoTipoAfiliacion.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoTipoAfiliacion.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalTipoAfiliacion);
		this.jInternalFrameReporteDinamicoTipoAfiliacion.getContentPane().add(this.jScrollPanelReporteDinamicoTipoAfiliacion, this.gridBagConstraintsTipoAfiliacion);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionTipoAfiliacion() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionTipoAfiliacion = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionTipoAfiliacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionTipoAfiliacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionTipoAfiliacion.setName("jPanelImportacionTipoAfiliacion"); 
		
		this.jPanelImportacionTipoAfiliacion.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoAfiliacion.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoAfiliacion.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionTipoAfiliacion.setLayout(gridaBagLayoutImportacionTipoAfiliacion);
		
		
		this.jInternalFrameImportacionTipoAfiliacion= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionTipoAfiliacion= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionTipoAfiliacion = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoAfiliacion= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionTipoAfiliacion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoAfiliacion.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoAfiliacion.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionTipoAfiliacion.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoAfiliacion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoAfiliacion.setResizable(true);
	    this.jInternalFrameImportacionTipoAfiliacion.setClosable(true);
	    this.jInternalFrameImportacionTipoAfiliacion.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionTipoAfiliacion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoAfiliacion.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoAfiliacion.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionTipoAfiliacion.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoAfiliacion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoAfiliacion.setResizable(true);
	    this.jInternalFrameImportacionTipoAfiliacion.setClosable(true);
	    this.jInternalFrameImportacionTipoAfiliacion.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionTipoAfiliacion.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoAfiliacion.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoAfiliacion.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionTipoAfiliacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Afiliaciones"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionTipoAfiliacion = new JLabelMe();

		this.jLabelArchivoImportacionTipoAfiliacion.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionTipoAfiliacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoAfiliacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoAfiliacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoAfiliacion = new GridBagConstraints();
		this.gridBagConstraintsTipoAfiliacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoAfiliacion.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoAfiliacion.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoAfiliacion.add(this.jLabelArchivoImportacionTipoAfiliacion, this.gridBagConstraintsTipoAfiliacion);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionTipoAfiliacion = new JFileChooser();		
		this.jFileChooserImportacionTipoAfiliacion.setToolTipText("ESCOGER ARCHIVO"+" "+TipoAfiliacionConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionTipoAfiliacion = new JButtonMe();
		this.jButtonAbrirImportacionTipoAfiliacion.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionTipoAfiliacion,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionTipoAfiliacion.setToolTipText("Generar"+" "+TipoAfiliacionConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsTipoAfiliacion = new GridBagConstraints();
		this.gridBagConstraintsTipoAfiliacion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoAfiliacion.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoAfiliacion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoAfiliacion.add(this.jButtonAbrirImportacionTipoAfiliacion, this.gridBagConstraintsTipoAfiliacion);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionTipoAfiliacion = new JLabelMe();

		this.jLabelPathArchivoImportacionTipoAfiliacion.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionTipoAfiliacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoAfiliacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoAfiliacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoAfiliacion = new GridBagConstraints();
		this.gridBagConstraintsTipoAfiliacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoAfiliacion.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoAfiliacion.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoAfiliacion.add(this.jLabelPathArchivoImportacionTipoAfiliacion, this.gridBagConstraintsTipoAfiliacion);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionTipoAfiliacion=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionTipoAfiliacion.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoAfiliacion.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoAfiliacion.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsTipoAfiliacion = new GridBagConstraints();
		this.gridBagConstraintsTipoAfiliacion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoAfiliacion.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoAfiliacion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoAfiliacion.add(this.jTextFieldPathArchivoImportacionTipoAfiliacion, this.gridBagConstraintsTipoAfiliacion);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionTipoAfiliacion = new JButtonMe();
		this.jButtonGenerarImportacionTipoAfiliacion.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionTipoAfiliacion,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionTipoAfiliacion.setToolTipText("Generar"+" "+TipoAfiliacionConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsTipoAfiliacion = new GridBagConstraints();
		this.gridBagConstraintsTipoAfiliacion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoAfiliacion.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoAfiliacion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoAfiliacion.add(this.jButtonGenerarImportacionTipoAfiliacion, this.gridBagConstraintsTipoAfiliacion);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionTipoAfiliacion = new JButtonMe();
		this.jButtonCerrarImportacionTipoAfiliacion.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionTipoAfiliacion,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionTipoAfiliacion.setToolTipText("Cancelar"+" "+TipoAfiliacionConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoAfiliacion = new GridBagConstraints();
		this.gridBagConstraintsTipoAfiliacion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoAfiliacion.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoAfiliacion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoAfiliacion.add(this.jButtonCerrarImportacionTipoAfiliacion, this.gridBagConstraintsTipoAfiliacion);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalTipoAfiliacion = new GridBagLayout();
		
		this.jScrollPanelImportacionTipoAfiliacion= new JScrollPane(jPanelImportacionTipoAfiliacion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsTipoAfiliacion = new GridBagConstraints();
		this.gridBagConstraintsTipoAfiliacion.gridy =iPosYImportacion;
		this.gridBagConstraintsTipoAfiliacion.gridx =iPosXImportacion;
		this.gridBagConstraintsTipoAfiliacion.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionTipoAfiliacion.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionTipoAfiliacion.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalTipoAfiliacion);
		this.jInternalFrameImportacionTipoAfiliacion.getContentPane().add(this.jScrollPanelImportacionTipoAfiliacion, this.gridBagConstraintsTipoAfiliacion);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByTipoAfiliacion(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByTipoAfiliacion = new JButtonMe();
			this.jButtonAbrirOrderByTipoAfiliacion.setText("Orden");
			this.jButtonAbrirOrderByTipoAfiliacion.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoAfiliacion,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoAfiliacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByTipoAfiliacion";
			inputMap = this.jButtonAbrirOrderByTipoAfiliacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByTipoAfiliacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByTipoAfiliacion"));
		
		
			GridBagLayout gridaBagLayoutOrderByTipoAfiliacion = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByTipoAfiliacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByTipoAfiliacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByTipoAfiliacion.setName("jPanelOrderByTipoAfiliacion"); 
			
			this.jPanelOrderByTipoAfiliacion.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoAfiliacion.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoAfiliacion.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByTipoAfiliacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByTipoAfiliacion.setLayout(gridaBagLayoutOrderByTipoAfiliacion);
			
			
			this.jTableDatosTipoAfiliacionOrderBy = new JTableMe();        
			this.jTableDatosTipoAfiliacionOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosTipoAfiliacionOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosTipoAfiliacionOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosTipoAfiliacionOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosTipoAfiliacionOrderBy.setViewportView(this.jTableDatosTipoAfiliacionOrderBy);
			this.jTableDatosTipoAfiliacionOrderBy.setFillsViewportHeight(true);
			this.jTableDatosTipoAfiliacionOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByTipoAfiliacion= new OrderByJInternalFrame();
			this.jInternalFrameOrderByTipoAfiliacion= new OrderByJInternalFrame();
			this.jScrollPanelOrderByTipoAfiliacion = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteTipoAfiliacion= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByTipoAfiliacion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByTipoAfiliacion.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByTipoAfiliacion.setTitle("Orden");
			this.jInternalFrameOrderByTipoAfiliacion.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByTipoAfiliacion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByTipoAfiliacion.setResizable(true);
			this.jInternalFrameOrderByTipoAfiliacion.setClosable(true);
			this.jInternalFrameOrderByTipoAfiliacion.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByTipoAfiliacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByTipoAfiliacion.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoAfiliacion.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoAfiliacion.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByTipoAfiliacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByTipoAfiliacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Afiliaciones"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsTipoAfiliacion = new GridBagConstraints();
			this.gridBagConstraintsTipoAfiliacion.gridy =iPosYOrderBy++;
			this.gridBagConstraintsTipoAfiliacion.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoAfiliacion.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsTipoAfiliacion.ipady =150;
				
			this.jPanelOrderByTipoAfiliacion.add(jScrollPanelDatosTipoAfiliacionOrderBy, this.gridBagConstraintsTipoAfiliacion);//this.jTableDatosTipoAfiliacionTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByTipoAfiliacion = new JButtonMe();
			this.jButtonCerrarOrderByTipoAfiliacion.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByTipoAfiliacion,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByTipoAfiliacion.setToolTipText("Cancelar"+" "+TipoAfiliacionConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByTipoAfiliacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsTipoAfiliacion = new GridBagConstraints();
			this.gridBagConstraintsTipoAfiliacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoAfiliacion.gridy = iPosYOrderBy++;
			this.gridBagConstraintsTipoAfiliacion.gridx = iPosXOrderBy;
									
			this.jPanelOrderByTipoAfiliacion.add(this.jButtonCerrarOrderByTipoAfiliacion, this.gridBagConstraintsTipoAfiliacion);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalTipoAfiliacion = new GridBagLayout();
			
			this.jScrollPanelOrderByTipoAfiliacion= new JScrollPane(jPanelOrderByTipoAfiliacion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsTipoAfiliacion = new GridBagConstraints();
			this.gridBagConstraintsTipoAfiliacion.gridy =iPosYOrderBy;
			this.gridBagConstraintsTipoAfiliacion.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoAfiliacion.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByTipoAfiliacion.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByTipoAfiliacion.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalTipoAfiliacion);
			
			this.jInternalFrameOrderByTipoAfiliacion.getContentPane().add(this.jScrollPanelOrderByTipoAfiliacion, this.gridBagConstraintsTipoAfiliacion);			
		
		} else {
			this.jButtonAbrirOrderByTipoAfiliacion = new JButtonMe();
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
		int iWidthTableCalculado=0;//2530
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=1230;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1200;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=100;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.tipoafiliacionSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosTipoAfiliacion.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosTipoAfiliacion.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosTipoAfiliacion.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosTipoAfiliacion.getRowHeight();//TipoAfiliacionConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.tipoafiliacionSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > TipoAfiliacionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoAfiliacion.isSelected()) {
					iHeightTable=TipoAfiliacionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoAfiliacionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoAfiliacionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > TipoAfiliacionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoAfiliacion.isSelected()) {
					iHeightTable=TipoAfiliacionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoAfiliacionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoAfiliacionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosTipoAfiliacion.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoAfiliacion.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoAfiliacion.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosTipoAfiliacion.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoAfiliacion.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoAfiliacion.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByTipoAfiliacion!=null && this.jInternalFrameOrderByTipoAfiliacion.getjTableDatosOrderBy()!=null) {
			//if(!this.tipoafiliacionSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByTipoAfiliacion.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByTipoAfiliacion.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByTipoAfiliacion.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByTipoAfiliacion.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByTipoAfiliacion.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByTipoAfiliacion.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByTipoAfiliacion.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosTipoAfiliacion.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoAfiliacion.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoAfiliacion.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=tipoafiliacionLogic.getTipoAfiliacions().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipoafiliacions.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<TipoAfiliacion> TraerTipoAfiliacionBeans(List<TipoAfiliacion> tipoafiliacions,ArrayList<Classe> classes)throws Exception {
		try {
			for(TipoAfiliacion tipoafiliacion:tipoafiliacions) {
					
				if(!(TipoAfiliacionConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || TipoAfiliacionConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					tipoafiliacion.setsDetalleGeneralEntityReporte(TipoAfiliacionConstantesFunciones.getTipoAfiliacionDescripcion(tipoafiliacion));
										
						
					
					

					if(tipoafiliacion.getDatoGeneralEmpleados()!=null && Funciones.existeClass(classes,DatoGeneralEmpleado.class)) {
						try{tipoafiliacion.setdatogeneralempleadosDescripcionReporte(new JRBeanCollectionDataSource(DatoGeneralEmpleadoJInternalFrame.TraerDatoGeneralEmpleadoBeans(tipoafiliacion.getDatoGeneralEmpleados(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//tipoafiliacion.setsDetalleGeneralEntityReporte(tipoafiliacion.getsDetalleGeneralEntityReporte());
										
				}
				
				//tipoafiliacionbeans.add(tipoafiliacionbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return tipoafiliacions;
    }
	//PARA REPORTES FIN
}
