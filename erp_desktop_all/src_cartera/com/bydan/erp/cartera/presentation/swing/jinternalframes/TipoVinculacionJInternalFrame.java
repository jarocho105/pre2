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

import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;

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
import com.bydan.erp.cartera.util.TipoVinculacionConstantesFunciones;

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
public class TipoVinculacionJInternalFrame extends TipoVinculacionBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarTipoVinculacion;
	
	protected JMenuBar jmenuBarTipoVinculacion;
	
	protected JMenu jmenuTipoVinculacion;
	protected JMenu jmenuDatosTipoVinculacion;
	protected JMenu jmenuArchivoTipoVinculacion;
	protected JMenu jmenuAccionesTipoVinculacion;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosTipoVinculacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoVinculacion;	
	protected GridBagConstraints gridBagConstraintsTipoVinculacion;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public TipoVinculacionDetalleFormJInternalFrame jInternalFrameDetalleFormTipoVinculacion;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoTipoVinculacion;	
	protected ImportacionJInternalFrame jInternalFrameImportacionTipoVinculacion;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public TipoVinculacionSessionBean tipovinculacionSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<TipoVinculacion> tipovinculacions;		
	public List<TipoVinculacion> tipovinculacionsEliminados;	
	public List<TipoVinculacion> tipovinculacionsAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByTipoVinculacion;		
	protected JButton jButtonAbrirOrderByTipoVinculacion;
	
	
	//protected JPanel jPanelOrderByTipoVinculacion;
	//public JScrollPane jScrollPanelOrderByTipoVinculacion;	
	//protected JButton jButtonCerrarOrderByTipoVinculacion;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public TipoVinculacionLogic tipovinculacionLogic;
	
	
	
	public JScrollPane jScrollPanelDatosTipoVinculacion;
	public JScrollPane jScrollPanelDatosEdicionTipoVinculacion;
	public JScrollPane jScrollPanelDatosGeneralTipoVinculacion;
    
	
	
	//public JScrollPane jScrollPanelDatosTipoVinculacionOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoTipoVinculacion;
	//public JScrollPane jScrollPanelImportacionTipoVinculacion;
	
	
	
	protected JPanel jPanelAccionesTipoVinculacion;
	
    protected JPanel jPanelPaginacionTipoVinculacion;
    protected JPanel jPanelParametrosReportesTipoVinculacion;
	protected JPanel jPanelParametrosReportesAccionesTipoVinculacion;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1TipoVinculacion;
	protected JPanel jPanelParametrosAuxiliar2TipoVinculacion;
	protected JPanel jPanelParametrosAuxiliar3TipoVinculacion;
	protected JPanel jPanelParametrosAuxiliar4TipoVinculacion;
	//protected JPanel jPanelParametrosAuxiliar5TipoVinculacion;
	
	
	
	//protected JPanel jPanelReporteDinamicoTipoVinculacion;
	//protected JPanel jPanelImportacionTipoVinculacion;
	
	
	public JTable jTableDatosTipoVinculacion;
	
	
	
	//public JTable jTableDatosTipoVinculacionOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoTipoVinculacion;
	protected JButton jButtonDuplicarTipoVinculacion;
	protected JButton jButtonCopiarTipoVinculacion;
	protected JButton jButtonVerFormTipoVinculacion;
	protected JButton jButtonNuevoRelacionesTipoVinculacion;
	protected JButton jButtonModificarTipoVinculacion;
	
    protected JButton jButtonGuardarCambiosTablaTipoVinculacion;
	protected JButton jButtonCerrarTipoVinculacion;
	
	
	protected JButton jButtonRecargarInformacionTipoVinculacion;
	protected JButton jButtonProcesarInformacionTipoVinculacion;
	
	
	protected JButton jButtonAnterioresTipoVinculacion;
	protected JButton jButtonSiguientesTipoVinculacion;
	protected JButton jButtonNuevoGuardarCambiosTipoVinculacion;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoTipoVinculacion;
	//protected JButton jButtonCerrarReporteDinamicoTipoVinculacion;
	//protected JButton jButtonGenerarExcelReporteDinamicoTipoVinculacion;	
	
	
	
	//protected JButton jButtonAbrirImportacionTipoVinculacion;
	//protected JButton jButtonGenerarImportacionTipoVinculacion;
	//protected JButton jButtonCerrarImportacionTipoVinculacion;
	//protected JFileChooser jFileChooserImportacionTipoVinculacion;
	//protected File fileImportacionTipoVinculacion;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoVinculacion;
	protected JButton jButtonDuplicarToolBarTipoVinculacion;
	protected JButton jButtonNuevoRelacionesToolBarTipoVinculacion;
	
	
	public JButton jButtonGuardarCambiosToolBarTipoVinculacion;
	protected JButton jButtonCopiarToolBarTipoVinculacion;
	protected JButton jButtonVerFormToolBarTipoVinculacion;
	public JButton jButtonGuardarCambiosTablaToolBarTipoVinculacion;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoVinculacion;
	protected JButton jButtonCerrarToolBarTipoVinculacion;
	
	protected JButton jButtonRecargarInformacionToolBarTipoVinculacion;
	protected JButton jButtonProcesarInformacionToolBarTipoVinculacion;
	protected JButton jButtonAnterioresToolBarTipoVinculacion;
	protected JButton jButtonSiguientesToolBarTipoVinculacion;
	protected JButton jButtonNuevoGuardarCambiosToolBarTipoVinculacion;
	protected JButton jButtonAbrirOrderByToolBarTipoVinculacion;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoVinculacion;
	protected JMenuItem jMenuItemDuplicarTipoVinculacion;
	protected JMenuItem jMenuItemNuevoRelacionesTipoVinculacion;
	
	
	protected JMenuItem jMenuItemGuardarCambiosTipoVinculacion;
	protected JMenuItem jMenuItemCopiarTipoVinculacion;
	protected JMenuItem jMenuItemVerFormTipoVinculacion;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoVinculacion;
	protected JMenuItem jMenuItemCerrarTipoVinculacion;
	protected JMenuItem jMenuItemDetalleCerrarTipoVinculacion;
	protected JMenuItem jMenuItemDetalleAbrirOrderByTipoVinculacion;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoVinculacion;
	
	protected JMenuItem jMenuItemRecargarInformacionTipoVinculacion;
	protected JMenuItem jMenuItemProcesarInformacionTipoVinculacion;
	protected JMenuItem jMenuItemAnterioresTipoVinculacion;
	protected JMenuItem jMenuItemSiguientesTipoVinculacion;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoVinculacion;
	protected JMenuItem jMenuItemAbrirOrderByTipoVinculacion;
	protected JMenuItem jMenuItemMostrarOcultarTipoVinculacion;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoVinculacion;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosTipoVinculacion;
	protected JCheckBox jCheckBoxSeleccionadosTipoVinculacion;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaTipoVinculacion;
	protected JCheckBox jCheckBoxConGraficoReporteTipoVinculacion;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesTipoVinculacion;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesTipoVinculacion;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoTipoVinculacion;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoTipoVinculacion;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesTipoVinculacion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionTipoVinculacion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoVinculacion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoVinculacion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarTipoVinculacion;
	protected JTextField jTextFieldValorCampoGeneralTipoVinculacion;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteTipoVinculacion;
	//public JList<Reporte> jListColumnasSelectReporteTipoVinculacion;
	//public JScrollPane jScrollColumnasSelectReporteTipoVinculacion;
	
	//public JLabel jLabelRelacionesSelectReporteTipoVinculacion;
	//public JList<Reporte> jListRelacionesSelectReporteTipoVinculacion;
	//public JScrollPane jScrollRelacionesSelectReporteTipoVinculacion;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoTipoVinculacion;
	//protected JCheckBox jCheckBoxConGraficoDinamicoTipoVinculacion;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoTipoVinculacion;
	//public JLabel jLabelTiposArchivoReporteDinamicoTipoVinculacion;
	
		
	//public JLabel jLabelArchivoImportacionTipoVinculacion;	
	//public JLabel jLabelPathArchivoImportacionTipoVinculacion;
	//protected JTextField jTextFieldPathArchivoImportacionTipoVinculacion;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoTipoVinculacion;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoTipoVinculacion;
	
	//public JLabel jLabelColumnaCategoriaValorTipoVinculacion;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorTipoVinculacion;
	
	//public JLabel jLabelColumnasValoresGraficoTipoVinculacion;
	//public JList<Reporte> jListColumnasValoresGraficoTipoVinculacion;
	//public JScrollPane jScrollColumnasValoresGraficoTipoVinculacion;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoTipoVinculacion;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoTipoVinculacion;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasTipoVinculacion;
	
	
	
	
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
	public TipoVinculacionJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("TipoVinculacion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoVinculacionJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoVinculacion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoVinculacionJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoVinculacion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoVinculacionJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoVinculacion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionTipoVinculacion)	{
		this.jButtonRecargarInformacionTipoVinculacion = jButtonRecargarInformacionTipoVinculacion;
	}
	
	public JButton getjButtonProcesarInformacionTipoVinculacion() {
		return this.jButtonProcesarInformacionTipoVinculacion;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoVinculacion)	{
		this.jButtonProcesarInformacionTipoVinculacion = jButtonProcesarInformacionTipoVinculacion;
	}
	
	
	public JButton getjButtonRecargarInformacionTipoVinculacion() {
		return this.jButtonRecargarInformacionTipoVinculacion;
	}
	
	
	public List<TipoVinculacion> gettipovinculacions() {
		return this.tipovinculacions;
	}

	public void settipovinculacions(List<TipoVinculacion> tipovinculacions) {
		this.tipovinculacions = tipovinculacions;
	}
	
	public List<TipoVinculacion> gettipovinculacionsAux() {
		return this.tipovinculacionsAux;
	}

	public void settipovinculacionsAux(List<TipoVinculacion> tipovinculacionsAux) {
		this.tipovinculacionsAux = tipovinculacionsAux;
	}
	
	public List<TipoVinculacion> gettipovinculacionsEliminados() {
		return this.tipovinculacionsEliminados;
	}

	public void setTipoVinculacionsEliminados(List<TipoVinculacion> tipovinculacionsEliminados) {
		this.tipovinculacionsEliminados = tipovinculacionsEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarTipoVinculacion() {
		return jComboBoxTiposSeleccionarTipoVinculacion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarTipoVinculacion(
			JComboBox jComboBoxTiposSeleccionarTipoVinculacion) {
		this.jComboBoxTiposSeleccionarTipoVinculacion = jComboBoxTiposSeleccionarTipoVinculacion;
	}
	
	public void setBorderResaltarTiposSeleccionarTipoVinculacion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarTipoVinculacion.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarTipoVinculacion .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralTipoVinculacion() {
		return jTextFieldValorCampoGeneralTipoVinculacion;
	}

	public void setjTextFieldValorCampoGeneralTipoVinculacion(
			JTextField jTextFieldValorCampoGeneralTipoVinculacion) {
		this.jTextFieldValorCampoGeneralTipoVinculacion = jTextFieldValorCampoGeneralTipoVinculacion;
	}

	public void setBorderResaltarValorCampoGeneralTipoVinculacion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoVinculacion.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralTipoVinculacion .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosTipoVinculacion() {
		return this.jCheckBoxSeleccionarTodosTipoVinculacion;
	}

	public void setjCheckBoxSeleccionarTodosTipoVinculacion(
			JCheckBox jCheckBoxSeleccionarTodosTipoVinculacion) {
		this.jCheckBoxSeleccionarTodosTipoVinculacion = jCheckBoxSeleccionarTodosTipoVinculacion;
	}

	public void setBorderResaltarSeleccionarTodosTipoVinculacion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoVinculacion.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosTipoVinculacion .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosTipoVinculacion() {
		return this.jCheckBoxSeleccionadosTipoVinculacion;
	}

	public void setjCheckBoxSeleccionadosTipoVinculacion(
			JCheckBox jCheckBoxSeleccionadosTipoVinculacion) {
		this.jCheckBoxSeleccionadosTipoVinculacion = jCheckBoxSeleccionadosTipoVinculacion;
	}
	
	public void setBorderResaltarSeleccionadosTipoVinculacion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoVinculacion.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosTipoVinculacion .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesTipoVinculacion() {
		return this.jComboBoxTiposArchivosReportesTipoVinculacion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesTipoVinculacion(
			JComboBox jComboBoxTiposArchivosReportesTipoVinculacion) {
		this.jComboBoxTiposArchivosReportesTipoVinculacion = jComboBoxTiposArchivosReportesTipoVinculacion;
	}

	public void setBorderResaltarTiposArchivosReportesTipoVinculacion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoVinculacion.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesTipoVinculacion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesTipoVinculacion() {
		return this.jComboBoxTiposReportesTipoVinculacion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesTipoVinculacion(
			JComboBox jComboBoxTiposReportesTipoVinculacion) {
		this.jComboBoxTiposReportesTipoVinculacion = jComboBoxTiposReportesTipoVinculacion;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoTipoVinculacion() {
	//	return jComboBoxTiposReportesDinamicoTipoVinculacion;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoTipoVinculacion(
	//		JComboBox jComboBoxTiposReportesDinamicoTipoVinculacion) {
	//	this.jComboBoxTiposReportesDinamicoTipoVinculacion = jComboBoxTiposReportesDinamicoTipoVinculacion;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoTipoVinculacion() {
	//	return jComboBoxTiposArchivosReportesDinamicoTipoVinculacion;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoTipoVinculacion(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoTipoVinculacion) {
	//	this.jComboBoxTiposArchivosReportesDinamicoTipoVinculacion = jComboBoxTiposArchivosReportesDinamicoTipoVinculacion;
	//}
	
	public void setBorderResaltarTiposReportesTipoVinculacion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoVinculacion.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesTipoVinculacion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesTipoVinculacion() {
		return this.jComboBoxTiposGraficosReportesTipoVinculacion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesTipoVinculacion(
			JComboBox jComboBoxTiposGraficosReportesTipoVinculacion) {
		this.jComboBoxTiposGraficosReportesTipoVinculacion = jComboBoxTiposGraficosReportesTipoVinculacion;
	}
	
	public void setBorderResaltarTiposGraficosReportesTipoVinculacion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoVinculacion.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesTipoVinculacion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionTipoVinculacion() {
		return this.jComboBoxTiposPaginacionTipoVinculacion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionTipoVinculacion(
			JComboBox jComboBoxTiposPaginacionTipoVinculacion) {
		this.jComboBoxTiposPaginacionTipoVinculacion = jComboBoxTiposPaginacionTipoVinculacion;
	}
	
	public void setBorderResaltarTiposPaginacionTipoVinculacion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoVinculacion.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionTipoVinculacion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesTipoVinculacion() {
		return this.jComboBoxTiposRelacionesTipoVinculacion;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoVinculacion() {
		return this.jComboBoxTiposAccionesTipoVinculacion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoVinculacion(
			JComboBox jComboBoxTiposRelacionesTipoVinculacion) {
		this.jComboBoxTiposRelacionesTipoVinculacion = jComboBoxTiposRelacionesTipoVinculacion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoVinculacion(
			JComboBox jComboBoxTiposAccionesTipoVinculacion) {
		this.jComboBoxTiposAccionesTipoVinculacion = jComboBoxTiposAccionesTipoVinculacion;
	}
	
	public void setBorderResaltarTiposRelacionesTipoVinculacion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoVinculacion.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesTipoVinculacion .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesTipoVinculacion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoVinculacion.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesTipoVinculacion .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoTipoVinculacion() {
	//	return jCheckBoxConGraficoDinamicoTipoVinculacion;
	//}

	//public void setjCheckBoxConGraficoDinamicoTipoVinculacion(
	//		JCheckBox jCheckBoxConGraficoDinamicoTipoVinculacion) {
	//	this.jCheckBoxConGraficoDinamicoTipoVinculacion = jCheckBoxConGraficoDinamicoTipoVinculacion;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoTipoVinculacion() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarTipoVinculacion.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoTipoVinculacion .setBorder(borderResaltar);		
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
		this.tipovinculacionSessionBean=new TipoVinculacionSessionBean();
		
		this.tipovinculacionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipovinculacionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipovinculacionSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=TipoVinculacionJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=TipoVinculacionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoVinculacionJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoVinculacionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoVinculacionJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Vinculacion MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.tipovinculacionSessionBean.getEsGuardarRelacionado()) {
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
		
		TipoVinculacionJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("TipoVinculacion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarTipoVinculacion= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarTipoVinculacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarTipoVinculacion,this.jTtoolBarTipoVinculacion,
							"nuevo","nuevo","Nuevo"+" "+TipoVinculacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoVinculacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarTipoVinculacion,this.jTtoolBarTipoVinculacion,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoVinculacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarTipoVinculacion,this.jTtoolBarTipoVinculacion,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+TipoVinculacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarTipoVinculacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarTipoVinculacion,this.jTtoolBarTipoVinculacion,
							"duplicar","duplicar","Duplicar"+" "+TipoVinculacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarTipoVinculacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarTipoVinculacion,this.jTtoolBarTipoVinculacion,
							"copiar","copiar","Copiar"+" "+TipoVinculacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarTipoVinculacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarTipoVinculacion,this.jTtoolBarTipoVinculacion,
							"ver_form","ver_form","Ver"+" "+TipoVinculacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarTipoVinculacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoVinculacion,this.jTtoolBarTipoVinculacion,
							"recargar","recargar","Recargar"+" "+TipoVinculacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarTipoVinculacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoVinculacion,this.jTtoolBarTipoVinculacion,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarTipoVinculacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoVinculacion,this.jTtoolBarTipoVinculacion,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarTipoVinculacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarTipoVinculacion,this.jTtoolBarTipoVinculacion,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarTipoVinculacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarTipoVinculacion,this.jTtoolBarTipoVinculacion,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarTipoVinculacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarTipoVinculacion,this.jTtoolBarTipoVinculacion,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+TipoVinculacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarTipoVinculacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarTipoVinculacion,this.jTtoolBarTipoVinculacion,
							"cerrar","cerrar","Salir"+" "+TipoVinculacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarTipoVinculacion=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarTipoVinculacion;
			
				this.jButtonProcesarInformacionToolBarTipoVinculacion=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarTipoVinculacion;
				
		//protected JButton jButtonModificarToolBarTipoVinculacion;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarTipoVinculacion=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuTipoVinculacion=new JMenuMe("General");
		this.jmenuArchivoTipoVinculacion=new JMenuMe("Archivo");
		this.jmenuAccionesTipoVinculacion=new JMenuMe("Acciones");
		this.jmenuDatosTipoVinculacion=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoVinculacion= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoVinculacion.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoVinculacion,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoVinculacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarTipoVinculacion= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarTipoVinculacion.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarTipoVinculacion,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarTipoVinculacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesTipoVinculacion= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesTipoVinculacion.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesTipoVinculacion,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesTipoVinculacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosTipoVinculacion= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoVinculacion.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoVinculacion,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoVinculacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarTipoVinculacion= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarTipoVinculacion.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarTipoVinculacion,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarTipoVinculacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormTipoVinculacion= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormTipoVinculacion.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormTipoVinculacion,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormTipoVinculacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaTipoVinculacion= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaTipoVinculacion.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaTipoVinculacion,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaTipoVinculacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoVinculacion= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoVinculacion.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoVinculacion,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoVinculacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionTipoVinculacion= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionTipoVinculacion.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionTipoVinculacion,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionTipoVinculacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionTipoVinculacion= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionTipoVinculacion.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionTipoVinculacion,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresTipoVinculacion= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresTipoVinculacion.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresTipoVinculacion,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresTipoVinculacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesTipoVinculacion= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesTipoVinculacion.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesTipoVinculacion,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesTipoVinculacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByTipoVinculacion= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByTipoVinculacion.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByTipoVinculacion,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByTipoVinculacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoVinculacion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoVinculacion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoVinculacion,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoVinculacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByTipoVinculacion= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByTipoVinculacion.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByTipoVinculacion,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByTipoVinculacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoVinculacion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoVinculacion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoVinculacion,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoVinculacion, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosTipoVinculacion= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosTipoVinculacion.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosTipoVinculacion,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosTipoVinculacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoTipoVinculacion.add(this.jMenuItemCerrarTipoVinculacion);
			
			this.jmenuAccionesTipoVinculacion.add(this.jMenuItemNuevoTipoVinculacion);
			this.jmenuAccionesTipoVinculacion.add(this.jMenuItemNuevoGuardarCambiosTipoVinculacion);
			this.jmenuAccionesTipoVinculacion.add(this.jMenuItemNuevoRelacionesTipoVinculacion);
			this.jmenuAccionesTipoVinculacion.add(this.jMenuItemGuardarCambiosTablaTipoVinculacion);		
			this.jmenuAccionesTipoVinculacion.add(this.jMenuItemDuplicarTipoVinculacion);		
			this.jmenuAccionesTipoVinculacion.add(this.jMenuItemCopiarTipoVinculacion);		
			this.jmenuAccionesTipoVinculacion.add(this.jMenuItemVerFormTipoVinculacion);		
			
			this.jmenuDatosTipoVinculacion.add(this.jMenuItemRecargarInformacionTipoVinculacion);				
			this.jmenuDatosTipoVinculacion.add(this.jMenuItemAnterioresTipoVinculacion);				
			this.jmenuDatosTipoVinculacion.add(this.jMenuItemSiguientesTipoVinculacion);				
			this.jmenuDatosTipoVinculacion.add(this.jMenuItemAbrirOrderByTipoVinculacion);				
			this.jmenuDatosTipoVinculacion.add(this.jMenuItemMostrarOcultarTipoVinculacion);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesTipoVinculacion.add(this.jMenuItemGuardarCambiosTipoVinculacion);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoTipoVinculacion, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesTipoVinculacion, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosTipoVinculacion, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarTipoVinculacion.add(this.jmenuArchivoTipoVinculacion);		
			this.jmenuBarTipoVinculacion.add(this.jmenuAccionesTipoVinculacion);		
			this.jmenuBarTipoVinculacion.add(this.jmenuDatosTipoVinculacion);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarTipoVinculacion);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasTipoVinculacion() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		

		this.jTabbedPaneBusquedasTipoVinculacion=new JTabbedPane();


		this.jTabbedPaneBusquedasTipoVinculacion.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoVinculacion.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoVinculacion.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasTipoVinculacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasTipoVinculacion.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasTipoVinculacion,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleTipoVinculacion = new TipoVinculacionDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Tipo Vinculacion DATOS");
			this.jInternalFrameDetalleFormTipoVinculacion = new TipoVinculacionDetalleFormJInternalFrame(jDesktopPane,this.tipovinculacionSessionBean.getConGuardarRelaciones(),this.tipovinculacionSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormTipoVinculacion = null;//new TipoVinculacionDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoVinculacion= new GridBagLayout();
		
		
		this.jTableDatosTipoVinculacion = new JTableMe();      
		
		String sToolTipTipoVinculacion="";
		sToolTipTipoVinculacion=TipoVinculacionConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoVinculacion+="(Cartera.TipoVinculacion)";
		}
		
		if(!this.tipovinculacionSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoVinculacion+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosTipoVinculacion.setToolTipText(sToolTipTipoVinculacion);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosTipoVinculacion);
		this.jTableDatosTipoVinculacion.setAutoCreateRowSorter(true);
		this.jTableDatosTipoVinculacion.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosTipoVinculacion.setRowSelectionAllowed(true);
		this.jTableDatosTipoVinculacion.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosTipoVinculacion,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoTipoVinculacion = new JButtonMe();
		this.jButtonDuplicarTipoVinculacion = new JButtonMe();
		this.jButtonCopiarTipoVinculacion = new JButtonMe();
		this.jButtonVerFormTipoVinculacion = new JButtonMe();
		this.jButtonNuevoRelacionesTipoVinculacion = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaTipoVinculacion = new JButtonMe();
		this.jButtonCerrarTipoVinculacion = new JButtonMe();
		
		this.jScrollPanelDatosTipoVinculacion = new JScrollPane();   
        this.jScrollPanelDatosGeneralTipoVinculacion = new JScrollPane();
		
				
		
		
		this.jPanelAccionesTipoVinculacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Vinculacion";
		
		if(!this.tipovinculacionSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoVinculacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Vinculaciones" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoVinculacion.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralTipoVinculacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesTipoVinculacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoVinculacion.setToolTipText("Acciones");
        this.jPanelAccionesTipoVinculacion.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoVinculacion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoVinculacion, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoTipoVinculacion=new ReporteDinamicoJInternalFrame(TipoVinculacionConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoTipoVinculacion();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionTipoVinculacion=new ImportacionJInternalFrame(TipoVinculacionConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionTipoVinculacion();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByTipoVinculacion = new JButtonMe();
		
		this.jButtonAbrirOrderByTipoVinculacion.setText("Orden");
		this.jButtonAbrirOrderByTipoVinculacion.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoVinculacion,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoVinculacion, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByTipoVinculacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByTipoVinculacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoVinculacion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoVinculacion,false,this);
			
			//this.cargarOrderByTipoVinculacion(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoVinculacion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoVinculacion,true,this);
			
			//this.cargarOrderByTipoVinculacion(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosTipoVinculacion.setMinimumSize(new Dimension(400,50));//430
		this.jTableDatosTipoVinculacion.setMaximumSize(new Dimension(400,50));//430
		this.jTableDatosTipoVinculacion.setPreferredSize(new Dimension(400,50));//430
		
		this.jScrollPanelDatosTipoVinculacion.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoVinculacion.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoVinculacion.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoTipoVinculacion.setText("Nuevo");
		this.jButtonDuplicarTipoVinculacion.setText("Duplicar");
		this.jButtonCopiarTipoVinculacion.setText("Copiar");
		this.jButtonVerFormTipoVinculacion.setText("Ver");
		this.jButtonNuevoRelacionesTipoVinculacion.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaTipoVinculacion.setText("Guardar");
		this.jButtonCerrarTipoVinculacion.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoVinculacion,"nuevo_button","Nuevo",this.tipovinculacionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarTipoVinculacion,"duplicar_button","Duplicar",this.tipovinculacionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarTipoVinculacion,"copiar_button","Copiar",this.tipovinculacionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormTipoVinculacion,"ver_form","Ver",this.tipovinculacionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesTipoVinculacion,"nuevorelaciones_button","Nuevo Rel",this.tipovinculacionSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoVinculacion,"guardarcambiostabla_button","Guardar",this.tipovinculacionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoVinculacion,"cerrar_button","Salir",this.tipovinculacionSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoVinculacion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarTipoVinculacion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarTipoVinculacion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormTipoVinculacion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesTipoVinculacion, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoVinculacion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoVinculacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoTipoVinculacion.setToolTipText("Nuevo"+" "+TipoVinculacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarTipoVinculacion.setToolTipText("Duplicar"+" "+TipoVinculacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarTipoVinculacion.setToolTipText("Copiar"+" "+TipoVinculacionConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormTipoVinculacion.setToolTipText("Ver"+" "+TipoVinculacionConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesTipoVinculacion.setToolTipText("Nuevo Rel"+" "+TipoVinculacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaTipoVinculacion.setToolTipText("Guardar"+" "+TipoVinculacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoVinculacion.setToolTipText("Salir"+" "+TipoVinculacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoVinculacion";
		inputMap = this.jButtonNuevoTipoVinculacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoVinculacion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoVinculacion"));
		
		//DUPLICAR
		sMapKey = "DuplicarTipoVinculacion";
		inputMap = this.jButtonDuplicarTipoVinculacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarTipoVinculacion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarTipoVinculacion"));
		
		//COPIAR
		sMapKey = "CopiarTipoVinculacion";
		inputMap = this.jButtonCopiarTipoVinculacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarTipoVinculacion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarTipoVinculacion"));
		
		//VEr FORM
		sMapKey = "VerFormTipoVinculacion";
		inputMap = this.jButtonVerFormTipoVinculacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormTipoVinculacion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormTipoVinculacion"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesTipoVinculacion";
		inputMap = this.jButtonNuevoRelacionesTipoVinculacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesTipoVinculacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesTipoVinculacion"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarTipoVinculacion";
		inputMap = this.jButtonModificarTipoVinculacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarTipoVinculacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarTipoVinculacion"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarTipoVinculacion";
		inputMap = this.jButtonCerrarTipoVinculacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoVinculacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoVinculacion"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoVinculacion";
		inputMap = this.jButtonGuardarCambiosTablaTipoVinculacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoVinculacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoVinculacion"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesTipoVinculacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesTipoVinculacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionTipoVinculacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1TipoVinculacion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2TipoVinculacion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3TipoVinculacion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4TipoVinculacion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5TipoVinculacion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesTipoVinculacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesTipoVinculacion.setName("jPanelParametrosReportesTipoVinculacion"); 
		
		this.jPanelParametrosReportesAccionesTipoVinculacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesTipoVinculacion.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesTipoVinculacion.setName("jPanelParametrosReportesAccionesTipoVinculacion"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesTipoVinculacion, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesTipoVinculacion, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionTipoVinculacion = new JButtonMe();
		this.jButtonRecargarInformacionTipoVinculacion.setText("Recargar");
		this.jButtonRecargarInformacionTipoVinculacion.setToolTipText("Recargar"+" "+TipoVinculacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionTipoVinculacion,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionTipoVinculacion = new JButtonMe();
		this.jButtonProcesarInformacionTipoVinculacion.setText("Procesar");
		this.jButtonProcesarInformacionTipoVinculacion.setToolTipText("Procesar"+" "+TipoVinculacionConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionTipoVinculacion.setVisible(false);
			
		this.jButtonProcesarInformacionTipoVinculacion.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoVinculacion.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoVinculacion.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesTipoVinculacion = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoVinculacion.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesTipoVinculacion.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesTipoVinculacion = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoVinculacion.setText("TIPO");       
		this.jComboBoxTiposReportesTipoVinculacion.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesTipoVinculacion = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoVinculacion.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesTipoVinculacion.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionTipoVinculacion = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionTipoVinculacion.setText("Paginacion");
		this.jComboBoxTiposPaginacionTipoVinculacion.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesTipoVinculacion = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesTipoVinculacion.setText("Accion");
		this.jComboBoxTiposRelacionesTipoVinculacion.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesTipoVinculacion = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoVinculacion.setText("Accion");
		this.jComboBoxTiposAccionesTipoVinculacion.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarTipoVinculacion = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarTipoVinculacion.setText("Accion");
		this.jComboBoxTiposSeleccionarTipoVinculacion.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralTipoVinculacion=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralTipoVinculacion.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoVinculacion.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoVinculacion.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesTipoVinculacion = new JLabelMe();
		
		this.jLabelAccionesTipoVinculacion.setText("Acciones");		
		this.jLabelAccionesTipoVinculacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoVinculacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoVinculacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosTipoVinculacion = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosTipoVinculacion.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosTipoVinculacion.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosTipoVinculacion = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosTipoVinculacion.setText("Seleccionados");
		this.jCheckBoxSeleccionadosTipoVinculacion.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaTipoVinculacion = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaTipoVinculacion.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaTipoVinculacion.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteTipoVinculacion = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteTipoVinculacion.setText("Graf.");
		this.jCheckBoxConGraficoReporteTipoVinculacion.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresTipoVinculacion = new JButtonMe();
		//this.jButtonAnterioresTipoVinculacion.setText("<<");
        this.jButtonAnterioresTipoVinculacion.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresTipoVinculacion,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresTipoVinculacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesTipoVinculacion = new JButtonMe();
		//this.jButtonSiguientesTipoVinculacion.setText(">>");
        this.jButtonSiguientesTipoVinculacion.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesTipoVinculacion,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesTipoVinculacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosTipoVinculacion = new JButtonMe();
		this.jButtonNuevoGuardarCambiosTipoVinculacion.setText("Nue");
        this.jButtonNuevoGuardarCambiosTipoVinculacion.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosTipoVinculacion,"nuevoguardarcambios_button","Nue",this.tipovinculacionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosTipoVinculacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosTipoVinculacion";
		inputMap = this.jButtonNuevoGuardarCambiosTipoVinculacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosTipoVinculacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosTipoVinculacion"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionTipoVinculacion";
		inputMap = this.jButtonRecargarInformacionTipoVinculacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionTipoVinculacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionTipoVinculacion"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesTipoVinculacion";
		inputMap = this.jButtonSiguientesTipoVinculacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesTipoVinculacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesTipoVinculacion"));
		
		//ANTERIORES		
		sMapKey = "AnterioresTipoVinculacion";
		inputMap = this.jButtonAnterioresTipoVinculacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresTipoVinculacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresTipoVinculacion"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasTipoVinculacion();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesTipoVinculacion.setMinimumSize(new Dimension(this.getWidth(),TipoVinculacionBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoVinculacionBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoVinculacion.setMaximumSize(new Dimension(this.getWidth(),TipoVinculacionBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoVinculacionBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoVinculacion.setPreferredSize(new Dimension(this.getWidth(),TipoVinculacionBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoVinculacionBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionTipoVinculacion = new GridBagLayout();

			this.jPanelPaginacionTipoVinculacion.setLayout(gridaBagLayoutPaginacionTipoVinculacion);						
			
			this.gridBagConstraintsTipoVinculacion = new GridBagConstraints();
			this.gridBagConstraintsTipoVinculacion.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsTipoVinculacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoVinculacion.gridy = 0;
			this.gridBagConstraintsTipoVinculacion.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionTipoVinculacion.add(this.jButtonAnterioresTipoVinculacion, this.gridBagConstraintsTipoVinculacion);
					
						
			this.gridBagConstraintsTipoVinculacion = new GridBagConstraints();
			this.gridBagConstraintsTipoVinculacion.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoVinculacion.gridy = 0;
			
			this.jPanelPaginacionTipoVinculacion.add(this.jButtonNuevoGuardarCambiosTipoVinculacion, this.gridBagConstraintsTipoVinculacion);
						
			
			this.gridBagConstraintsTipoVinculacion = new GridBagConstraints();
			this.gridBagConstraintsTipoVinculacion.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsTipoVinculacion.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoVinculacion.gridy = 0;
			this.jPanelPaginacionTipoVinculacion.add(this.jButtonSiguientesTipoVinculacion, this.gridBagConstraintsTipoVinculacion);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsTipoVinculacion = new GridBagConstraints();
			this.gridBagConstraintsTipoVinculacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoVinculacion.gridy = 1;
			this.gridBagConstraintsTipoVinculacion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoVinculacion.add(this.jButtonNuevoTipoVinculacion, this.gridBagConstraintsTipoVinculacion);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsTipoVinculacion = new GridBagConstraints();
				this.gridBagConstraintsTipoVinculacion.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoVinculacion.gridy = 1;
				this.gridBagConstraintsTipoVinculacion.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionTipoVinculacion.add(this.jButtonNuevoRelacionesTipoVinculacion, this.gridBagConstraintsTipoVinculacion);
			}
			
			
			if(!this.tipovinculacionSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsTipoVinculacion = new GridBagConstraints();
				this.gridBagConstraintsTipoVinculacion.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoVinculacion.gridy = 1;
				this.gridBagConstraintsTipoVinculacion.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionTipoVinculacion.add(this.jButtonGuardarCambiosTablaTipoVinculacion, this.gridBagConstraintsTipoVinculacion);
			}
			
			
			
			this.gridBagConstraintsTipoVinculacion = new GridBagConstraints();
			this.gridBagConstraintsTipoVinculacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoVinculacion.gridy = 1;
			this.gridBagConstraintsTipoVinculacion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoVinculacion.add(this.jButtonDuplicarTipoVinculacion, this.gridBagConstraintsTipoVinculacion);
			
			this.gridBagConstraintsTipoVinculacion = new GridBagConstraints();
			this.gridBagConstraintsTipoVinculacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoVinculacion.gridy = 1;
			this.gridBagConstraintsTipoVinculacion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoVinculacion.add(this.jButtonCopiarTipoVinculacion, this.gridBagConstraintsTipoVinculacion);
		
			this.gridBagConstraintsTipoVinculacion = new GridBagConstraints();
			this.gridBagConstraintsTipoVinculacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoVinculacion.gridy = 1;
			this.gridBagConstraintsTipoVinculacion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoVinculacion.add(this.jButtonVerFormTipoVinculacion, this.gridBagConstraintsTipoVinculacion);
		
			this.gridBagConstraintsTipoVinculacion = new GridBagConstraints();
			this.gridBagConstraintsTipoVinculacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoVinculacion.gridy = 1;
			this.gridBagConstraintsTipoVinculacion.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionTipoVinculacion.add(this.jButtonCerrarTipoVinculacion, this.gridBagConstraintsTipoVinculacion);
		
		
		
		this.jButtonRecargarInformacionTipoVinculacion.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoVinculacion.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoVinculacion.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionTipoVinculacion, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesTipoVinculacion.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoVinculacion.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoVinculacion.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesTipoVinculacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesTipoVinculacion.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoVinculacion.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoVinculacion.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesTipoVinculacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesTipoVinculacion.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoVinculacion.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoVinculacion.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesTipoVinculacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionTipoVinculacion.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoVinculacion.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoVinculacion.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionTipoVinculacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesTipoVinculacion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoVinculacion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoVinculacion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesTipoVinculacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesTipoVinculacion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoVinculacion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoVinculacion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoVinculacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarTipoVinculacion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoVinculacion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoVinculacion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarTipoVinculacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaTipoVinculacion.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoVinculacion.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoVinculacion.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaTipoVinculacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteTipoVinculacion.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoVinculacion.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoVinculacion.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteTipoVinculacion, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosTipoVinculacion.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoVinculacion.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoVinculacion.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosTipoVinculacion, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosTipoVinculacion.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoVinculacion.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoVinculacion.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosTipoVinculacion, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesTipoVinculacion = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesTipoVinculacion = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1TipoVinculacion = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2TipoVinculacion = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3TipoVinculacion = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4TipoVinculacion = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesTipoVinculacion.setLayout(gridaBagParametrosReportesTipoVinculacion);
			this.jPanelParametrosReportesAccionesTipoVinculacion.setLayout(gridaBagParametrosReportesAccionesTipoVinculacion);
			
			
			this.jPanelParametrosAuxiliar1TipoVinculacion.setLayout(gridaBagParametrosAuxiliar1TipoVinculacion);
			this.jPanelParametrosAuxiliar2TipoVinculacion.setLayout(gridaBagParametrosAuxiliar2TipoVinculacion);
			this.jPanelParametrosAuxiliar3TipoVinculacion.setLayout(gridaBagParametrosAuxiliar3TipoVinculacion);
			this.jPanelParametrosAuxiliar4TipoVinculacion.setLayout(gridaBagParametrosAuxiliar4TipoVinculacion);
			//this.jPanelParametrosAuxiliar5TipoVinculacion.setLayout(gridaBagParametrosAuxiliar2TipoVinculacion);			
			
			
			
			
			this.gridBagConstraintsTipoVinculacion = new GridBagConstraints();
			this.gridBagConstraintsTipoVinculacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoVinculacion.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoVinculacion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoVinculacion.add(this.jButtonRecargarInformacionTipoVinculacion, this.gridBagConstraintsTipoVinculacion);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsTipoVinculacion = new GridBagConstraints();
			this.gridBagConstraintsTipoVinculacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoVinculacion.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoVinculacion.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoVinculacion.add(this.jComboBoxTiposPaginacionTipoVinculacion, this.gridBagConstraintsTipoVinculacion);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsTipoVinculacion = new GridBagConstraints();
			this.gridBagConstraintsTipoVinculacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoVinculacion.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoVinculacion.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoVinculacion.add(this.jCheckBoxConAltoMaximoTablaTipoVinculacion, this.gridBagConstraintsTipoVinculacion);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsTipoVinculacion = new GridBagConstraints();
			this.gridBagConstraintsTipoVinculacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoVinculacion.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoVinculacion.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoVinculacion.add(this.jComboBoxTiposArchivosReportesTipoVinculacion, this.gridBagConstraintsTipoVinculacion);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsTipoVinculacion = new GridBagConstraints();
			this.gridBagConstraintsTipoVinculacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoVinculacion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoVinculacion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoVinculacion.add(this.jPanelParametrosAuxiliar1TipoVinculacion, this.gridBagConstraintsTipoVinculacion);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsTipoVinculacion = new GridBagConstraints();
			this.gridBagConstraintsTipoVinculacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoVinculacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoVinculacion.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoVinculacion.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4TipoVinculacion.add(this.jComboBoxTiposReportesTipoVinculacion, this.gridBagConstraintsTipoVinculacion);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsTipoVinculacion = new GridBagConstraints();
			this.gridBagConstraintsTipoVinculacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoVinculacion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoVinculacion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoVinculacion.add(this.jPanelParametrosAuxiliar4TipoVinculacion, this.gridBagConstraintsTipoVinculacion);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsTipoVinculacion = new GridBagConstraints();
			this.gridBagConstraintsTipoVinculacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoVinculacion.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoVinculacion.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoVinculacion.add(this.jComboBoxTiposReportesTipoVinculacion, this.gridBagConstraintsTipoVinculacion);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsTipoVinculacion = new GridBagConstraints();
			this.gridBagConstraintsTipoVinculacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoVinculacion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoVinculacion.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoVinculacion.add(this.jCheckBoxGenerarReporteTipoVinculacion, this.gridBagConstraintsTipoVinculacion);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsTipoVinculacion = new GridBagConstraints();
			this.gridBagConstraintsTipoVinculacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoVinculacion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoVinculacion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoVinculacion.add(this.jPanelParametrosAuxiliar2TipoVinculacion, this.gridBagConstraintsTipoVinculacion);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsTipoVinculacion = new GridBagConstraints();
			this.gridBagConstraintsTipoVinculacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoVinculacion.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoVinculacion.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoVinculacion.add(this.jLabelAccionesTipoVinculacion, this.gridBagConstraintsTipoVinculacion);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsTipoVinculacion = new GridBagConstraints();
				this.gridBagConstraintsTipoVinculacion.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsTipoVinculacion.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsTipoVinculacion.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesTipoVinculacion.add(this.jButtonAbrirOrderByTipoVinculacion, this.gridBagConstraintsTipoVinculacion);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsTipoVinculacion = new GridBagConstraints();
			this.gridBagConstraintsTipoVinculacion.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsTipoVinculacion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoVinculacion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoVinculacion.add(this.jComboBoxTiposSeleccionarTipoVinculacion, this.gridBagConstraintsTipoVinculacion);			
			
			
			/*
			this.gridBagConstraintsTipoVinculacion = new GridBagConstraints();
			this.gridBagConstraintsTipoVinculacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoVinculacion.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoVinculacion.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoVinculacion.add(this.jCheckBoxSeleccionarTodosTipoVinculacion, this.gridBagConstraintsTipoVinculacion);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsTipoVinculacion = new GridBagConstraints();
			this.gridBagConstraintsTipoVinculacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoVinculacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoVinculacion.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoVinculacion.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoVinculacion.add(this.jCheckBoxSeleccionarTodosTipoVinculacion, this.gridBagConstraintsTipoVinculacion);															
				
			this.gridBagConstraintsTipoVinculacion = new GridBagConstraints();
			this.gridBagConstraintsTipoVinculacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoVinculacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoVinculacion.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoVinculacion.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoVinculacion.add(this.jCheckBoxSeleccionadosTipoVinculacion, this.gridBagConstraintsTipoVinculacion);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsTipoVinculacion = new GridBagConstraints();
			this.gridBagConstraintsTipoVinculacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoVinculacion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoVinculacion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoVinculacion.add(this.jPanelParametrosAuxiliar3TipoVinculacion, this.gridBagConstraintsTipoVinculacion);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsTipoVinculacion = new GridBagConstraints();
			this.gridBagConstraintsTipoVinculacion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoVinculacion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoVinculacion.add(this.jComboBoxTiposRelacionesTipoVinculacion, this.gridBagConstraintsTipoVinculacion);
				
			this.gridBagConstraintsTipoVinculacion = new GridBagConstraints();
			this.gridBagConstraintsTipoVinculacion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoVinculacion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoVinculacion.add(this.jComboBoxTiposAccionesTipoVinculacion, this.gridBagConstraintsTipoVinculacion);
	
				
			this.gridBagConstraintsTipoVinculacion = new GridBagConstraints();
			this.gridBagConstraintsTipoVinculacion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoVinculacion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoVinculacion.add(this.jTextFieldValorCampoGeneralTipoVinculacion, this.gridBagConstraintsTipoVinculacion);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosTipoVinculacion = new GridBagLayout();

			this.jScrollPanelDatosTipoVinculacion.setLayout(gridaBagLayoutDatosTipoVinculacion);
			
			this.gridBagConstraintsTipoVinculacion = new GridBagConstraints();
			this.gridBagConstraintsTipoVinculacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoVinculacion.gridy = 0;
			this.gridBagConstraintsTipoVinculacion.gridx = 0;
			
			this.jScrollPanelDatosTipoVinculacion.add(this.jTableDatosTipoVinculacion, this.gridBagConstraintsTipoVinculacion);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosTipoVinculacion.setViewportView(this.jTableDatosTipoVinculacion);
		this.jTableDatosTipoVinculacion.setFillsViewportHeight(true);
		this.jTableDatosTipoVinculacion.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesTipoVinculacion= new GridBagLayout();
		this.jPanelAccionesTipoVinculacion.setLayout(gridaBagLayoutAccionesTipoVinculacion);
		
		
		/*	
		this.gridBagConstraintsTipoVinculacion = new GridBagConstraints();
		this.gridBagConstraintsTipoVinculacion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoVinculacion.gridy = 0;
		this.gridBagConstraintsTipoVinculacion.gridx = 0;
			
		this.jPanelAccionesTipoVinculacion.add(this.jButtonNuevoTipoVinculacion, this.gridBagConstraintsTipoVinculacion);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoVinculacion = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoVinculacion);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipovinculacionSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoVinculacion = new GridBagConstraints();						
			this.gridBagConstraintsTipoVinculacion.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoVinculacion.gridx = 0;		
			//this.gridBagConstraintsTipoVinculacion.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoVinculacion.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoVinculacion.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarTipoVinculacion, this.gridBagConstraintsTipoVinculacion);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsTipoVinculacion = new GridBagConstraints();
		this.gridBagConstraintsTipoVinculacion.gridy = iGridyPrincipal++;
		this.gridBagConstraintsTipoVinculacion.gridx = 0;		
		//this.gridBagConstraintsTipoVinculacion.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoVinculacion.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsTipoVinculacion.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsTipoVinculacion);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsTipoVinculacion = new GridBagConstraints();
		this.gridBagConstraintsTipoVinculacion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoVinculacion.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesTipoVinculacion, this.gridBagConstraintsTipoVinculacion);								
		
		
		/*
		this.gridBagConstraintsTipoVinculacion = new GridBagConstraints();
		this.gridBagConstraintsTipoVinculacion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoVinculacion.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesTipoVinculacion, this.gridBagConstraintsTipoVinculacion);
		*/		
		
		this.gridBagConstraintsTipoVinculacion = new GridBagConstraints();
		this.gridBagConstraintsTipoVinculacion.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoVinculacion.gridx =0;
		this.gridBagConstraintsTipoVinculacion.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoVinculacion.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoVinculacion, this.gridBagConstraintsTipoVinculacion);
				
		
		this.gridBagConstraintsTipoVinculacion = new GridBagConstraints();
		this.gridBagConstraintsTipoVinculacion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoVinculacion.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionTipoVinculacion, this.gridBagConstraintsTipoVinculacion);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(TipoVinculacionJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosTipoVinculacion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoVinculacion = new GridBagLayout();
			this.jPanelBusquedasParametrosTipoVinculacion.setLayout(gridaBagLayoutBusquedasParametrosTipoVinculacion);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralTipoVinculacion=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoVinculacion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoVinculacion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoVinculacion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoVinculacion = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsTipoVinculacion = new GridBagConstraints();
		this.gridBagConstraintsTipoVinculacion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoVinculacion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoVinculacion, this.gridBagConstraintsTipoVinculacion);
			
			
		this.gridBagConstraintsTipoVinculacion = new GridBagConstraints();
		this.gridBagConstraintsTipoVinculacion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoVinculacion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoVinculacion, this.gridBagConstraintsTipoVinculacion);
		
			
		this.gridBagConstraintsTipoVinculacion = new GridBagConstraints();
		this.gridBagConstraintsTipoVinculacion.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoVinculacion.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoVinculacion, this.gridBagConstraintsTipoVinculacion);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralTipoVinculacion;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoTipoVinculacion() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoTipoVinculacion = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoTipoVinculacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoTipoVinculacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoTipoVinculacion.setName("jPanelReporteDinamicoTipoVinculacion"); 
		
		this.jPanelReporteDinamicoTipoVinculacion.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoVinculacion.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoVinculacion.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoTipoVinculacion.setLayout(gridaBagLayoutReporteDinamicoTipoVinculacion);
		
		
		this.jInternalFrameReporteDinamicoTipoVinculacion= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoTipoVinculacion = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoVinculacion= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoTipoVinculacion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoTipoVinculacion.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoTipoVinculacion.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoTipoVinculacion.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoTipoVinculacion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoTipoVinculacion.setResizable(true);
	    this.jInternalFrameReporteDinamicoTipoVinculacion.setClosable(true);
	    this.jInternalFrameReporteDinamicoTipoVinculacion.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoTipoVinculacion.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoVinculacion.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoVinculacion.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoTipoVinculacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Vinculaciones"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteTipoVinculacion = new JLabelMe();

		this.jLabelColumnasSelectReporteTipoVinculacion.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteTipoVinculacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoVinculacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoVinculacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoVinculacion = new GridBagConstraints();
		this.gridBagConstraintsTipoVinculacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoVinculacion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoVinculacion.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoVinculacion.add(this.jLabelColumnasSelectReporteTipoVinculacion, this.gridBagConstraintsTipoVinculacion);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteTipoVinculacion = new JList<Reporte>();
		this.jListColumnasSelectReporteTipoVinculacion.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteTipoVinculacion.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteTipoVinculacion.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoVinculacion.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoVinculacion.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteTipoVinculacion=new JScrollPane(this.jListColumnasSelectReporteTipoVinculacion);
			
			this.jScrollColumnasSelectReporteTipoVinculacion.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoVinculacion.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoVinculacion.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteTipoVinculacion.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTipoVinculacion = new GridBagConstraints();
		this.gridBagConstraintsTipoVinculacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoVinculacion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoVinculacion.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoVinculacion.add(this.jListColumnasSelectReporteTipoVinculacion, this.gridBagConstraintsTipoVinculacion);
		this.jPanelReporteDinamicoTipoVinculacion.add(this.jScrollColumnasSelectReporteTipoVinculacion, this.gridBagConstraintsTipoVinculacion);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteTipoVinculacion = new JLabelMe();

		this.jLabelRelacionesSelectReporteTipoVinculacion.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteTipoVinculacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoVinculacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoVinculacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsTipoVinculacion = new GridBagConstraints();
		this.gridBagConstraintsTipoVinculacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoVinculacion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoVinculacion.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoVinculacion.add(this.jLabelRelacionesSelectReporteTipoVinculacion, this.gridBagConstraintsTipoVinculacion);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteTipoVinculacion = new JList<Reporte>();
		this.jListRelacionesSelectReporteTipoVinculacion.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteTipoVinculacion.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteTipoVinculacion.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoVinculacion.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoVinculacion.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteTipoVinculacion=new JScrollPane(this.jListRelacionesSelectReporteTipoVinculacion);
			
			this.jScrollRelacionesSelectReporteTipoVinculacion.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoVinculacion.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoVinculacion.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteTipoVinculacion.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsTipoVinculacion = new GridBagConstraints();
		this.gridBagConstraintsTipoVinculacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoVinculacion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoVinculacion.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoVinculacion.add(this.jListRelacionesSelectReporteTipoVinculacion, this.gridBagConstraintsTipoVinculacion);
		this.jPanelReporteDinamicoTipoVinculacion.add(this.jScrollRelacionesSelectReporteTipoVinculacion, this.gridBagConstraintsTipoVinculacion);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoTipoVinculacion = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoTipoVinculacion = new JComboBoxMe();
		this.jListColumnasValoresGraficoTipoVinculacion = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoTipoVinculacion = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoTipoVinculacion.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoTipoVinculacion.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoVinculacion.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoVinculacion.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoTipoVinculacion, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoTipoVinculacion = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoTipoVinculacion.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoTipoVinculacion.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoVinculacion.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoVinculacion.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoTipoVinculacion, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoTipoVinculacion = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoTipoVinculacion.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoTipoVinculacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoVinculacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoVinculacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoVinculacion = new GridBagConstraints();
		this.gridBagConstraintsTipoVinculacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoVinculacion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoVinculacion.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoVinculacion.add(this.jLabelGenerarExcelReporteDinamicoTipoVinculacion, this.gridBagConstraintsTipoVinculacion);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoTipoVinculacion = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoTipoVinculacion.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoTipoVinculacion,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoTipoVinculacion.setToolTipText("Generar EXCEL"+" "+TipoVinculacionConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsTipoVinculacion = new GridBagConstraints();
		//this.gridBagConstraintsTipoVinculacion.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsTipoVinculacion.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsTipoVinculacion.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoTipoVinculacion.add(this.jButtonGenerarExcelReporteDinamicoTipoVinculacion, this.gridBagConstraintsTipoVinculacion);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsTipoVinculacion = new GridBagConstraints();
		this.gridBagConstraintsTipoVinculacion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoVinculacion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoVinculacion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoVinculacion.add(this.jComboBoxTiposReportesDinamicoTipoVinculacion, this.gridBagConstraintsTipoVinculacion);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoTipoVinculacion = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoTipoVinculacion.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoTipoVinculacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoVinculacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoVinculacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoVinculacion = new GridBagConstraints();
		this.gridBagConstraintsTipoVinculacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoVinculacion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoVinculacion.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoVinculacion.add(this.jLabelTiposArchivoReporteDinamicoTipoVinculacion, this.gridBagConstraintsTipoVinculacion);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsTipoVinculacion = new GridBagConstraints();
		this.gridBagConstraintsTipoVinculacion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoVinculacion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoVinculacion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoVinculacion.add(this.jComboBoxTiposArchivosReportesDinamicoTipoVinculacion, this.gridBagConstraintsTipoVinculacion);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoTipoVinculacion = new JButtonMe();
		this.jButtonGenerarReporteDinamicoTipoVinculacion.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoTipoVinculacion,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoTipoVinculacion.setToolTipText("Generar"+" "+TipoVinculacionConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsTipoVinculacion = new GridBagConstraints();
		this.gridBagConstraintsTipoVinculacion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoVinculacion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoVinculacion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoVinculacion.add(this.jButtonGenerarReporteDinamicoTipoVinculacion, this.gridBagConstraintsTipoVinculacion);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoTipoVinculacion = new JButtonMe();
		this.jButtonCerrarReporteDinamicoTipoVinculacion.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoTipoVinculacion,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoTipoVinculacion.setToolTipText("Cancelar"+" "+TipoVinculacionConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoVinculacion = new GridBagConstraints();
		this.gridBagConstraintsTipoVinculacion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoVinculacion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoVinculacion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoVinculacion.add(this.jButtonCerrarReporteDinamicoTipoVinculacion, this.gridBagConstraintsTipoVinculacion);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalTipoVinculacion = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoTipoVinculacion= new JScrollPane(jPanelReporteDinamicoTipoVinculacion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoTipoVinculacion.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoVinculacion.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoVinculacion.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoTipoVinculacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Vinculaciones"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoVinculacion = new GridBagConstraints();
		this.gridBagConstraintsTipoVinculacion.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsTipoVinculacion.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsTipoVinculacion.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoTipoVinculacion.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoTipoVinculacion.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalTipoVinculacion);
		this.jInternalFrameReporteDinamicoTipoVinculacion.getContentPane().add(this.jScrollPanelReporteDinamicoTipoVinculacion, this.gridBagConstraintsTipoVinculacion);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionTipoVinculacion() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionTipoVinculacion = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionTipoVinculacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionTipoVinculacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionTipoVinculacion.setName("jPanelImportacionTipoVinculacion"); 
		
		this.jPanelImportacionTipoVinculacion.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoVinculacion.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoVinculacion.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionTipoVinculacion.setLayout(gridaBagLayoutImportacionTipoVinculacion);
		
		
		this.jInternalFrameImportacionTipoVinculacion= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionTipoVinculacion= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionTipoVinculacion = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoVinculacion= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionTipoVinculacion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoVinculacion.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoVinculacion.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionTipoVinculacion.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoVinculacion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoVinculacion.setResizable(true);
	    this.jInternalFrameImportacionTipoVinculacion.setClosable(true);
	    this.jInternalFrameImportacionTipoVinculacion.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionTipoVinculacion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoVinculacion.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoVinculacion.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionTipoVinculacion.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoVinculacion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoVinculacion.setResizable(true);
	    this.jInternalFrameImportacionTipoVinculacion.setClosable(true);
	    this.jInternalFrameImportacionTipoVinculacion.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionTipoVinculacion.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoVinculacion.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoVinculacion.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionTipoVinculacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Vinculaciones"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionTipoVinculacion = new JLabelMe();

		this.jLabelArchivoImportacionTipoVinculacion.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionTipoVinculacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoVinculacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoVinculacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoVinculacion = new GridBagConstraints();
		this.gridBagConstraintsTipoVinculacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoVinculacion.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoVinculacion.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoVinculacion.add(this.jLabelArchivoImportacionTipoVinculacion, this.gridBagConstraintsTipoVinculacion);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionTipoVinculacion = new JFileChooser();		
		this.jFileChooserImportacionTipoVinculacion.setToolTipText("ESCOGER ARCHIVO"+" "+TipoVinculacionConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionTipoVinculacion = new JButtonMe();
		this.jButtonAbrirImportacionTipoVinculacion.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionTipoVinculacion,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionTipoVinculacion.setToolTipText("Generar"+" "+TipoVinculacionConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsTipoVinculacion = new GridBagConstraints();
		this.gridBagConstraintsTipoVinculacion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoVinculacion.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoVinculacion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoVinculacion.add(this.jButtonAbrirImportacionTipoVinculacion, this.gridBagConstraintsTipoVinculacion);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionTipoVinculacion = new JLabelMe();

		this.jLabelPathArchivoImportacionTipoVinculacion.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionTipoVinculacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoVinculacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoVinculacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoVinculacion = new GridBagConstraints();
		this.gridBagConstraintsTipoVinculacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoVinculacion.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoVinculacion.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoVinculacion.add(this.jLabelPathArchivoImportacionTipoVinculacion, this.gridBagConstraintsTipoVinculacion);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionTipoVinculacion=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionTipoVinculacion.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoVinculacion.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoVinculacion.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsTipoVinculacion = new GridBagConstraints();
		this.gridBagConstraintsTipoVinculacion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoVinculacion.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoVinculacion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoVinculacion.add(this.jTextFieldPathArchivoImportacionTipoVinculacion, this.gridBagConstraintsTipoVinculacion);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionTipoVinculacion = new JButtonMe();
		this.jButtonGenerarImportacionTipoVinculacion.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionTipoVinculacion,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionTipoVinculacion.setToolTipText("Generar"+" "+TipoVinculacionConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsTipoVinculacion = new GridBagConstraints();
		this.gridBagConstraintsTipoVinculacion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoVinculacion.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoVinculacion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoVinculacion.add(this.jButtonGenerarImportacionTipoVinculacion, this.gridBagConstraintsTipoVinculacion);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionTipoVinculacion = new JButtonMe();
		this.jButtonCerrarImportacionTipoVinculacion.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionTipoVinculacion,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionTipoVinculacion.setToolTipText("Cancelar"+" "+TipoVinculacionConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoVinculacion = new GridBagConstraints();
		this.gridBagConstraintsTipoVinculacion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoVinculacion.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoVinculacion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoVinculacion.add(this.jButtonCerrarImportacionTipoVinculacion, this.gridBagConstraintsTipoVinculacion);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalTipoVinculacion = new GridBagLayout();
		
		this.jScrollPanelImportacionTipoVinculacion= new JScrollPane(jPanelImportacionTipoVinculacion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsTipoVinculacion = new GridBagConstraints();
		this.gridBagConstraintsTipoVinculacion.gridy =iPosYImportacion;
		this.gridBagConstraintsTipoVinculacion.gridx =iPosXImportacion;
		this.gridBagConstraintsTipoVinculacion.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionTipoVinculacion.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionTipoVinculacion.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalTipoVinculacion);
		this.jInternalFrameImportacionTipoVinculacion.getContentPane().add(this.jScrollPanelImportacionTipoVinculacion, this.gridBagConstraintsTipoVinculacion);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByTipoVinculacion(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByTipoVinculacion = new JButtonMe();
			this.jButtonAbrirOrderByTipoVinculacion.setText("Orden");
			this.jButtonAbrirOrderByTipoVinculacion.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoVinculacion,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoVinculacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByTipoVinculacion";
			inputMap = this.jButtonAbrirOrderByTipoVinculacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByTipoVinculacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByTipoVinculacion"));
		
		
			GridBagLayout gridaBagLayoutOrderByTipoVinculacion = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByTipoVinculacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByTipoVinculacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByTipoVinculacion.setName("jPanelOrderByTipoVinculacion"); 
			
			this.jPanelOrderByTipoVinculacion.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoVinculacion.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoVinculacion.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByTipoVinculacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByTipoVinculacion.setLayout(gridaBagLayoutOrderByTipoVinculacion);
			
			
			this.jTableDatosTipoVinculacionOrderBy = new JTableMe();        
			this.jTableDatosTipoVinculacionOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosTipoVinculacionOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosTipoVinculacionOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosTipoVinculacionOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosTipoVinculacionOrderBy.setViewportView(this.jTableDatosTipoVinculacionOrderBy);
			this.jTableDatosTipoVinculacionOrderBy.setFillsViewportHeight(true);
			this.jTableDatosTipoVinculacionOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByTipoVinculacion= new OrderByJInternalFrame();
			this.jInternalFrameOrderByTipoVinculacion= new OrderByJInternalFrame();
			this.jScrollPanelOrderByTipoVinculacion = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteTipoVinculacion= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByTipoVinculacion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByTipoVinculacion.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByTipoVinculacion.setTitle("Orden");
			this.jInternalFrameOrderByTipoVinculacion.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByTipoVinculacion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByTipoVinculacion.setResizable(true);
			this.jInternalFrameOrderByTipoVinculacion.setClosable(true);
			this.jInternalFrameOrderByTipoVinculacion.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByTipoVinculacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByTipoVinculacion.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoVinculacion.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoVinculacion.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByTipoVinculacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByTipoVinculacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Vinculaciones"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsTipoVinculacion = new GridBagConstraints();
			this.gridBagConstraintsTipoVinculacion.gridy =iPosYOrderBy++;
			this.gridBagConstraintsTipoVinculacion.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoVinculacion.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsTipoVinculacion.ipady =150;
				
			this.jPanelOrderByTipoVinculacion.add(jScrollPanelDatosTipoVinculacionOrderBy, this.gridBagConstraintsTipoVinculacion);//this.jTableDatosTipoVinculacionTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByTipoVinculacion = new JButtonMe();
			this.jButtonCerrarOrderByTipoVinculacion.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByTipoVinculacion,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByTipoVinculacion.setToolTipText("Cancelar"+" "+TipoVinculacionConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByTipoVinculacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsTipoVinculacion = new GridBagConstraints();
			this.gridBagConstraintsTipoVinculacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoVinculacion.gridy = iPosYOrderBy++;
			this.gridBagConstraintsTipoVinculacion.gridx = iPosXOrderBy;
									
			this.jPanelOrderByTipoVinculacion.add(this.jButtonCerrarOrderByTipoVinculacion, this.gridBagConstraintsTipoVinculacion);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalTipoVinculacion = new GridBagLayout();
			
			this.jScrollPanelOrderByTipoVinculacion= new JScrollPane(jPanelOrderByTipoVinculacion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsTipoVinculacion = new GridBagConstraints();
			this.gridBagConstraintsTipoVinculacion.gridy =iPosYOrderBy;
			this.gridBagConstraintsTipoVinculacion.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoVinculacion.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByTipoVinculacion.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByTipoVinculacion.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalTipoVinculacion);
			
			this.jInternalFrameOrderByTipoVinculacion.getContentPane().add(this.jScrollPanelOrderByTipoVinculacion, this.gridBagConstraintsTipoVinculacion);			
		
		} else {
			this.jButtonAbrirOrderByTipoVinculacion = new JButtonMe();
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
			iWidthTableCalculado+=400;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=100;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.tipovinculacionSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosTipoVinculacion.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosTipoVinculacion.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosTipoVinculacion.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosTipoVinculacion.getRowHeight();//TipoVinculacionConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.tipovinculacionSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > TipoVinculacionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoVinculacion.isSelected()) {
					iHeightTable=TipoVinculacionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoVinculacionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoVinculacionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > TipoVinculacionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoVinculacion.isSelected()) {
					iHeightTable=TipoVinculacionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoVinculacionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoVinculacionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosTipoVinculacion.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoVinculacion.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoVinculacion.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosTipoVinculacion.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoVinculacion.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoVinculacion.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByTipoVinculacion!=null && this.jInternalFrameOrderByTipoVinculacion.getjTableDatosOrderBy()!=null) {
			//if(!this.tipovinculacionSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByTipoVinculacion.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByTipoVinculacion.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByTipoVinculacion.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByTipoVinculacion.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByTipoVinculacion.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByTipoVinculacion.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByTipoVinculacion.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosTipoVinculacion.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoVinculacion.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoVinculacion.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=tipovinculacionLogic.getTipoVinculacions().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipovinculacions.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<TipoVinculacion> TraerTipoVinculacionBeans(List<TipoVinculacion> tipovinculacions,ArrayList<Classe> classes)throws Exception {
		try {
			for(TipoVinculacion tipovinculacion:tipovinculacions) {
					
				if(!(TipoVinculacionConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || TipoVinculacionConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					tipovinculacion.setsDetalleGeneralEntityReporte(TipoVinculacionConstantesFunciones.getTipoVinculacionDescripcion(tipovinculacion));
										
						
					
					

					if(tipovinculacion.getInformacionEconomicas()!=null && Funciones.existeClass(classes,InformacionEconomica.class)) {
						try{tipovinculacion.setinformacioneconomicasDescripcionReporte(new JRBeanCollectionDataSource(InformacionEconomicaJInternalFrame.TraerInformacionEconomicaBeans(tipovinculacion.getInformacionEconomicas(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//tipovinculacion.setsDetalleGeneralEntityReporte(tipovinculacion.getsDetalleGeneralEntityReporte());
										
				}
				
				//tipovinculacionbeans.add(tipovinculacionbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return tipovinculacions;
    }
	//PARA REPORTES FIN
}
