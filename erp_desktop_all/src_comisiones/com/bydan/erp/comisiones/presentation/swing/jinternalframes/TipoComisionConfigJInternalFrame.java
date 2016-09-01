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
package com.bydan.erp.comisiones.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;

import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;

//import com.bydan.erp.comisiones.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.comisiones.business.entity.*;
import com.bydan.erp.comisiones.util.TipoComisionConfigConstantesFunciones;

import com.bydan.erp.comisiones.business.logic.*;
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
public class TipoComisionConfigJInternalFrame extends TipoComisionConfigBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarTipoComisionConfig;
	
	protected JMenuBar jmenuBarTipoComisionConfig;
	
	protected JMenu jmenuTipoComisionConfig;
	protected JMenu jmenuDatosTipoComisionConfig;
	protected JMenu jmenuArchivoTipoComisionConfig;
	protected JMenu jmenuAccionesTipoComisionConfig;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosTipoComisionConfig = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoComisionConfig;	
	protected GridBagConstraints gridBagConstraintsTipoComisionConfig;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public TipoComisionConfigDetalleFormJInternalFrame jInternalFrameDetalleFormTipoComisionConfig;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoTipoComisionConfig;	
	protected ImportacionJInternalFrame jInternalFrameImportacionTipoComisionConfig;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public TipoComisionConfigSessionBean tipocomisionconfigSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<TipoComisionConfig> tipocomisionconfigs;		
	public List<TipoComisionConfig> tipocomisionconfigsEliminados;	
	public List<TipoComisionConfig> tipocomisionconfigsAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByTipoComisionConfig;		
	protected JButton jButtonAbrirOrderByTipoComisionConfig;
	
	
	//protected JPanel jPanelOrderByTipoComisionConfig;
	//public JScrollPane jScrollPanelOrderByTipoComisionConfig;	
	//protected JButton jButtonCerrarOrderByTipoComisionConfig;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public TipoComisionConfigLogic tipocomisionconfigLogic;
	
	
	
	public JScrollPane jScrollPanelDatosTipoComisionConfig;
	public JScrollPane jScrollPanelDatosEdicionTipoComisionConfig;
	public JScrollPane jScrollPanelDatosGeneralTipoComisionConfig;
    
	
	
	//public JScrollPane jScrollPanelDatosTipoComisionConfigOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoTipoComisionConfig;
	//public JScrollPane jScrollPanelImportacionTipoComisionConfig;
	
	
	
	protected JPanel jPanelAccionesTipoComisionConfig;
	
    protected JPanel jPanelPaginacionTipoComisionConfig;
    protected JPanel jPanelParametrosReportesTipoComisionConfig;
	protected JPanel jPanelParametrosReportesAccionesTipoComisionConfig;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1TipoComisionConfig;
	protected JPanel jPanelParametrosAuxiliar2TipoComisionConfig;
	protected JPanel jPanelParametrosAuxiliar3TipoComisionConfig;
	protected JPanel jPanelParametrosAuxiliar4TipoComisionConfig;
	//protected JPanel jPanelParametrosAuxiliar5TipoComisionConfig;
	
	
	
	//protected JPanel jPanelReporteDinamicoTipoComisionConfig;
	//protected JPanel jPanelImportacionTipoComisionConfig;
	
	
	public JTable jTableDatosTipoComisionConfig;
	
	
	
	//public JTable jTableDatosTipoComisionConfigOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoTipoComisionConfig;
	protected JButton jButtonDuplicarTipoComisionConfig;
	protected JButton jButtonCopiarTipoComisionConfig;
	protected JButton jButtonVerFormTipoComisionConfig;
	protected JButton jButtonNuevoRelacionesTipoComisionConfig;
	protected JButton jButtonModificarTipoComisionConfig;
	
    protected JButton jButtonGuardarCambiosTablaTipoComisionConfig;
	protected JButton jButtonCerrarTipoComisionConfig;
	
	
	protected JButton jButtonRecargarInformacionTipoComisionConfig;
	protected JButton jButtonProcesarInformacionTipoComisionConfig;
	
	
	protected JButton jButtonAnterioresTipoComisionConfig;
	protected JButton jButtonSiguientesTipoComisionConfig;
	protected JButton jButtonNuevoGuardarCambiosTipoComisionConfig;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoTipoComisionConfig;
	//protected JButton jButtonCerrarReporteDinamicoTipoComisionConfig;
	//protected JButton jButtonGenerarExcelReporteDinamicoTipoComisionConfig;	
	
	
	
	//protected JButton jButtonAbrirImportacionTipoComisionConfig;
	//protected JButton jButtonGenerarImportacionTipoComisionConfig;
	//protected JButton jButtonCerrarImportacionTipoComisionConfig;
	//protected JFileChooser jFileChooserImportacionTipoComisionConfig;
	//protected File fileImportacionTipoComisionConfig;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoComisionConfig;
	protected JButton jButtonDuplicarToolBarTipoComisionConfig;
	protected JButton jButtonNuevoRelacionesToolBarTipoComisionConfig;
	
	
	public JButton jButtonGuardarCambiosToolBarTipoComisionConfig;
	protected JButton jButtonCopiarToolBarTipoComisionConfig;
	protected JButton jButtonVerFormToolBarTipoComisionConfig;
	public JButton jButtonGuardarCambiosTablaToolBarTipoComisionConfig;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoComisionConfig;
	protected JButton jButtonCerrarToolBarTipoComisionConfig;
	
	protected JButton jButtonRecargarInformacionToolBarTipoComisionConfig;
	protected JButton jButtonProcesarInformacionToolBarTipoComisionConfig;
	protected JButton jButtonAnterioresToolBarTipoComisionConfig;
	protected JButton jButtonSiguientesToolBarTipoComisionConfig;
	protected JButton jButtonNuevoGuardarCambiosToolBarTipoComisionConfig;
	protected JButton jButtonAbrirOrderByToolBarTipoComisionConfig;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoComisionConfig;
	protected JMenuItem jMenuItemDuplicarTipoComisionConfig;
	protected JMenuItem jMenuItemNuevoRelacionesTipoComisionConfig;
	
	
	protected JMenuItem jMenuItemGuardarCambiosTipoComisionConfig;
	protected JMenuItem jMenuItemCopiarTipoComisionConfig;
	protected JMenuItem jMenuItemVerFormTipoComisionConfig;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoComisionConfig;
	protected JMenuItem jMenuItemCerrarTipoComisionConfig;
	protected JMenuItem jMenuItemDetalleCerrarTipoComisionConfig;
	protected JMenuItem jMenuItemDetalleAbrirOrderByTipoComisionConfig;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoComisionConfig;
	
	protected JMenuItem jMenuItemRecargarInformacionTipoComisionConfig;
	protected JMenuItem jMenuItemProcesarInformacionTipoComisionConfig;
	protected JMenuItem jMenuItemAnterioresTipoComisionConfig;
	protected JMenuItem jMenuItemSiguientesTipoComisionConfig;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoComisionConfig;
	protected JMenuItem jMenuItemAbrirOrderByTipoComisionConfig;
	protected JMenuItem jMenuItemMostrarOcultarTipoComisionConfig;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoComisionConfig;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosTipoComisionConfig;
	protected JCheckBox jCheckBoxSeleccionadosTipoComisionConfig;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaTipoComisionConfig;
	protected JCheckBox jCheckBoxConGraficoReporteTipoComisionConfig;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesTipoComisionConfig;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesTipoComisionConfig;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoTipoComisionConfig;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoTipoComisionConfig;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesTipoComisionConfig;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionTipoComisionConfig;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoComisionConfig;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoComisionConfig;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarTipoComisionConfig;
	protected JTextField jTextFieldValorCampoGeneralTipoComisionConfig;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteTipoComisionConfig;
	//public JList<Reporte> jListColumnasSelectReporteTipoComisionConfig;
	//public JScrollPane jScrollColumnasSelectReporteTipoComisionConfig;
	
	//public JLabel jLabelRelacionesSelectReporteTipoComisionConfig;
	//public JList<Reporte> jListRelacionesSelectReporteTipoComisionConfig;
	//public JScrollPane jScrollRelacionesSelectReporteTipoComisionConfig;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoTipoComisionConfig;
	//protected JCheckBox jCheckBoxConGraficoDinamicoTipoComisionConfig;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoTipoComisionConfig;
	//public JLabel jLabelTiposArchivoReporteDinamicoTipoComisionConfig;
	
		
	//public JLabel jLabelArchivoImportacionTipoComisionConfig;	
	//public JLabel jLabelPathArchivoImportacionTipoComisionConfig;
	//protected JTextField jTextFieldPathArchivoImportacionTipoComisionConfig;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoTipoComisionConfig;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoTipoComisionConfig;
	
	//public JLabel jLabelColumnaCategoriaValorTipoComisionConfig;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorTipoComisionConfig;
	
	//public JLabel jLabelColumnasValoresGraficoTipoComisionConfig;
	//public JList<Reporte> jListColumnasValoresGraficoTipoComisionConfig;
	//public JScrollPane jScrollColumnasValoresGraficoTipoComisionConfig;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoTipoComisionConfig;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoTipoComisionConfig;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasTipoComisionConfig;
	
	
	
	
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
	public TipoComisionConfigJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("TipoComisionConfig No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoComisionConfigJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoComisionConfig No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoComisionConfigJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoComisionConfig No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoComisionConfigJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoComisionConfig No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionTipoComisionConfig)	{
		this.jButtonRecargarInformacionTipoComisionConfig = jButtonRecargarInformacionTipoComisionConfig;
	}
	
	public JButton getjButtonProcesarInformacionTipoComisionConfig() {
		return this.jButtonProcesarInformacionTipoComisionConfig;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoComisionConfig)	{
		this.jButtonProcesarInformacionTipoComisionConfig = jButtonProcesarInformacionTipoComisionConfig;
	}
	
	
	public JButton getjButtonRecargarInformacionTipoComisionConfig() {
		return this.jButtonRecargarInformacionTipoComisionConfig;
	}
	
	
	public List<TipoComisionConfig> gettipocomisionconfigs() {
		return this.tipocomisionconfigs;
	}

	public void settipocomisionconfigs(List<TipoComisionConfig> tipocomisionconfigs) {
		this.tipocomisionconfigs = tipocomisionconfigs;
	}
	
	public List<TipoComisionConfig> gettipocomisionconfigsAux() {
		return this.tipocomisionconfigsAux;
	}

	public void settipocomisionconfigsAux(List<TipoComisionConfig> tipocomisionconfigsAux) {
		this.tipocomisionconfigsAux = tipocomisionconfigsAux;
	}
	
	public List<TipoComisionConfig> gettipocomisionconfigsEliminados() {
		return this.tipocomisionconfigsEliminados;
	}

	public void setTipoComisionConfigsEliminados(List<TipoComisionConfig> tipocomisionconfigsEliminados) {
		this.tipocomisionconfigsEliminados = tipocomisionconfigsEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarTipoComisionConfig() {
		return jComboBoxTiposSeleccionarTipoComisionConfig;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarTipoComisionConfig(
			JComboBox jComboBoxTiposSeleccionarTipoComisionConfig) {
		this.jComboBoxTiposSeleccionarTipoComisionConfig = jComboBoxTiposSeleccionarTipoComisionConfig;
	}
	
	public void setBorderResaltarTiposSeleccionarTipoComisionConfig() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarTipoComisionConfig.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarTipoComisionConfig .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralTipoComisionConfig() {
		return jTextFieldValorCampoGeneralTipoComisionConfig;
	}

	public void setjTextFieldValorCampoGeneralTipoComisionConfig(
			JTextField jTextFieldValorCampoGeneralTipoComisionConfig) {
		this.jTextFieldValorCampoGeneralTipoComisionConfig = jTextFieldValorCampoGeneralTipoComisionConfig;
	}

	public void setBorderResaltarValorCampoGeneralTipoComisionConfig() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoComisionConfig.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralTipoComisionConfig .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosTipoComisionConfig() {
		return this.jCheckBoxSeleccionarTodosTipoComisionConfig;
	}

	public void setjCheckBoxSeleccionarTodosTipoComisionConfig(
			JCheckBox jCheckBoxSeleccionarTodosTipoComisionConfig) {
		this.jCheckBoxSeleccionarTodosTipoComisionConfig = jCheckBoxSeleccionarTodosTipoComisionConfig;
	}

	public void setBorderResaltarSeleccionarTodosTipoComisionConfig() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoComisionConfig.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosTipoComisionConfig .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosTipoComisionConfig() {
		return this.jCheckBoxSeleccionadosTipoComisionConfig;
	}

	public void setjCheckBoxSeleccionadosTipoComisionConfig(
			JCheckBox jCheckBoxSeleccionadosTipoComisionConfig) {
		this.jCheckBoxSeleccionadosTipoComisionConfig = jCheckBoxSeleccionadosTipoComisionConfig;
	}
	
	public void setBorderResaltarSeleccionadosTipoComisionConfig() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoComisionConfig.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosTipoComisionConfig .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesTipoComisionConfig() {
		return this.jComboBoxTiposArchivosReportesTipoComisionConfig;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesTipoComisionConfig(
			JComboBox jComboBoxTiposArchivosReportesTipoComisionConfig) {
		this.jComboBoxTiposArchivosReportesTipoComisionConfig = jComboBoxTiposArchivosReportesTipoComisionConfig;
	}

	public void setBorderResaltarTiposArchivosReportesTipoComisionConfig() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoComisionConfig.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesTipoComisionConfig .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesTipoComisionConfig() {
		return this.jComboBoxTiposReportesTipoComisionConfig;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesTipoComisionConfig(
			JComboBox jComboBoxTiposReportesTipoComisionConfig) {
		this.jComboBoxTiposReportesTipoComisionConfig = jComboBoxTiposReportesTipoComisionConfig;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoTipoComisionConfig() {
	//	return jComboBoxTiposReportesDinamicoTipoComisionConfig;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoTipoComisionConfig(
	//		JComboBox jComboBoxTiposReportesDinamicoTipoComisionConfig) {
	//	this.jComboBoxTiposReportesDinamicoTipoComisionConfig = jComboBoxTiposReportesDinamicoTipoComisionConfig;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoTipoComisionConfig() {
	//	return jComboBoxTiposArchivosReportesDinamicoTipoComisionConfig;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoTipoComisionConfig(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoTipoComisionConfig) {
	//	this.jComboBoxTiposArchivosReportesDinamicoTipoComisionConfig = jComboBoxTiposArchivosReportesDinamicoTipoComisionConfig;
	//}
	
	public void setBorderResaltarTiposReportesTipoComisionConfig() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoComisionConfig.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesTipoComisionConfig .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesTipoComisionConfig() {
		return this.jComboBoxTiposGraficosReportesTipoComisionConfig;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesTipoComisionConfig(
			JComboBox jComboBoxTiposGraficosReportesTipoComisionConfig) {
		this.jComboBoxTiposGraficosReportesTipoComisionConfig = jComboBoxTiposGraficosReportesTipoComisionConfig;
	}
	
	public void setBorderResaltarTiposGraficosReportesTipoComisionConfig() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoComisionConfig.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesTipoComisionConfig .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionTipoComisionConfig() {
		return this.jComboBoxTiposPaginacionTipoComisionConfig;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionTipoComisionConfig(
			JComboBox jComboBoxTiposPaginacionTipoComisionConfig) {
		this.jComboBoxTiposPaginacionTipoComisionConfig = jComboBoxTiposPaginacionTipoComisionConfig;
	}
	
	public void setBorderResaltarTiposPaginacionTipoComisionConfig() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoComisionConfig.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionTipoComisionConfig .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesTipoComisionConfig() {
		return this.jComboBoxTiposRelacionesTipoComisionConfig;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoComisionConfig() {
		return this.jComboBoxTiposAccionesTipoComisionConfig;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoComisionConfig(
			JComboBox jComboBoxTiposRelacionesTipoComisionConfig) {
		this.jComboBoxTiposRelacionesTipoComisionConfig = jComboBoxTiposRelacionesTipoComisionConfig;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoComisionConfig(
			JComboBox jComboBoxTiposAccionesTipoComisionConfig) {
		this.jComboBoxTiposAccionesTipoComisionConfig = jComboBoxTiposAccionesTipoComisionConfig;
	}
	
	public void setBorderResaltarTiposRelacionesTipoComisionConfig() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoComisionConfig.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesTipoComisionConfig .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesTipoComisionConfig() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoComisionConfig.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesTipoComisionConfig .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoTipoComisionConfig() {
	//	return jCheckBoxConGraficoDinamicoTipoComisionConfig;
	//}

	//public void setjCheckBoxConGraficoDinamicoTipoComisionConfig(
	//		JCheckBox jCheckBoxConGraficoDinamicoTipoComisionConfig) {
	//	this.jCheckBoxConGraficoDinamicoTipoComisionConfig = jCheckBoxConGraficoDinamicoTipoComisionConfig;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoTipoComisionConfig() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarTipoComisionConfig.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoTipoComisionConfig .setBorder(borderResaltar);		
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
		this.tipocomisionconfigSessionBean=new TipoComisionConfigSessionBean();
		
		this.tipocomisionconfigSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipocomisionconfigSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipocomisionconfigSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=TipoComisionConfigJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=TipoComisionConfigJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoComisionConfigJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoComisionConfigJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoComisionConfigJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Comision Config MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.tipocomisionconfigSessionBean.getEsGuardarRelacionado()) {
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
		
		TipoComisionConfigJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("TipoComisionConfig No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarTipoComisionConfig= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarTipoComisionConfig=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarTipoComisionConfig,this.jTtoolBarTipoComisionConfig,
							"nuevo","nuevo","Nuevo"+" "+TipoComisionConfigConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoComisionConfig=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarTipoComisionConfig,this.jTtoolBarTipoComisionConfig,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoComisionConfig=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarTipoComisionConfig,this.jTtoolBarTipoComisionConfig,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+TipoComisionConfigConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarTipoComisionConfig=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarTipoComisionConfig,this.jTtoolBarTipoComisionConfig,
							"duplicar","duplicar","Duplicar"+" "+TipoComisionConfigConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarTipoComisionConfig=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarTipoComisionConfig,this.jTtoolBarTipoComisionConfig,
							"copiar","copiar","Copiar"+" "+TipoComisionConfigConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarTipoComisionConfig=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarTipoComisionConfig,this.jTtoolBarTipoComisionConfig,
							"ver_form","ver_form","Ver"+" "+TipoComisionConfigConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarTipoComisionConfig=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoComisionConfig,this.jTtoolBarTipoComisionConfig,
							"recargar","recargar","Recargar"+" "+TipoComisionConfigConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarTipoComisionConfig=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoComisionConfig,this.jTtoolBarTipoComisionConfig,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarTipoComisionConfig=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoComisionConfig,this.jTtoolBarTipoComisionConfig,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarTipoComisionConfig=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarTipoComisionConfig,this.jTtoolBarTipoComisionConfig,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarTipoComisionConfig=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarTipoComisionConfig,this.jTtoolBarTipoComisionConfig,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarTipoComisionConfig=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarTipoComisionConfig,this.jTtoolBarTipoComisionConfig,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+TipoComisionConfigConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarTipoComisionConfig=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarTipoComisionConfig,this.jTtoolBarTipoComisionConfig,
							"cerrar","cerrar","Salir"+" "+TipoComisionConfigConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarTipoComisionConfig=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarTipoComisionConfig;
			
				this.jButtonProcesarInformacionToolBarTipoComisionConfig=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarTipoComisionConfig;
				
		//protected JButton jButtonModificarToolBarTipoComisionConfig;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarTipoComisionConfig=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuTipoComisionConfig=new JMenuMe("General");
		this.jmenuArchivoTipoComisionConfig=new JMenuMe("Archivo");
		this.jmenuAccionesTipoComisionConfig=new JMenuMe("Acciones");
		this.jmenuDatosTipoComisionConfig=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoComisionConfig= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoComisionConfig.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoComisionConfig,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoComisionConfig, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarTipoComisionConfig= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarTipoComisionConfig.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarTipoComisionConfig,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarTipoComisionConfig, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesTipoComisionConfig= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesTipoComisionConfig.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesTipoComisionConfig,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesTipoComisionConfig, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosTipoComisionConfig= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoComisionConfig.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoComisionConfig,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoComisionConfig, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarTipoComisionConfig= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarTipoComisionConfig.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarTipoComisionConfig,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarTipoComisionConfig, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormTipoComisionConfig= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormTipoComisionConfig.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormTipoComisionConfig,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormTipoComisionConfig, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaTipoComisionConfig= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaTipoComisionConfig.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaTipoComisionConfig,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaTipoComisionConfig, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoComisionConfig= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoComisionConfig.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoComisionConfig,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoComisionConfig, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionTipoComisionConfig= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionTipoComisionConfig.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionTipoComisionConfig,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionTipoComisionConfig, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionTipoComisionConfig= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionTipoComisionConfig.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionTipoComisionConfig,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresTipoComisionConfig= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresTipoComisionConfig.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresTipoComisionConfig,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresTipoComisionConfig, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesTipoComisionConfig= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesTipoComisionConfig.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesTipoComisionConfig,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesTipoComisionConfig, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByTipoComisionConfig= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByTipoComisionConfig.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByTipoComisionConfig,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByTipoComisionConfig, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoComisionConfig= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoComisionConfig.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoComisionConfig,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoComisionConfig, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByTipoComisionConfig= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByTipoComisionConfig.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByTipoComisionConfig,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByTipoComisionConfig, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoComisionConfig= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoComisionConfig.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoComisionConfig,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoComisionConfig, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosTipoComisionConfig= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosTipoComisionConfig.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosTipoComisionConfig,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosTipoComisionConfig, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoTipoComisionConfig.add(this.jMenuItemCerrarTipoComisionConfig);
			
			this.jmenuAccionesTipoComisionConfig.add(this.jMenuItemNuevoTipoComisionConfig);
			this.jmenuAccionesTipoComisionConfig.add(this.jMenuItemNuevoGuardarCambiosTipoComisionConfig);
			this.jmenuAccionesTipoComisionConfig.add(this.jMenuItemNuevoRelacionesTipoComisionConfig);
			this.jmenuAccionesTipoComisionConfig.add(this.jMenuItemGuardarCambiosTablaTipoComisionConfig);		
			this.jmenuAccionesTipoComisionConfig.add(this.jMenuItemDuplicarTipoComisionConfig);		
			this.jmenuAccionesTipoComisionConfig.add(this.jMenuItemCopiarTipoComisionConfig);		
			this.jmenuAccionesTipoComisionConfig.add(this.jMenuItemVerFormTipoComisionConfig);		
			
			this.jmenuDatosTipoComisionConfig.add(this.jMenuItemRecargarInformacionTipoComisionConfig);				
			this.jmenuDatosTipoComisionConfig.add(this.jMenuItemAnterioresTipoComisionConfig);				
			this.jmenuDatosTipoComisionConfig.add(this.jMenuItemSiguientesTipoComisionConfig);				
			this.jmenuDatosTipoComisionConfig.add(this.jMenuItemAbrirOrderByTipoComisionConfig);				
			this.jmenuDatosTipoComisionConfig.add(this.jMenuItemMostrarOcultarTipoComisionConfig);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesTipoComisionConfig.add(this.jMenuItemGuardarCambiosTipoComisionConfig);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoTipoComisionConfig, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesTipoComisionConfig, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosTipoComisionConfig, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarTipoComisionConfig.add(this.jmenuArchivoTipoComisionConfig);		
			this.jmenuBarTipoComisionConfig.add(this.jmenuAccionesTipoComisionConfig);		
			this.jmenuBarTipoComisionConfig.add(this.jmenuDatosTipoComisionConfig);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarTipoComisionConfig);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasTipoComisionConfig() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		

		this.jTabbedPaneBusquedasTipoComisionConfig=new JTabbedPane();


		this.jTabbedPaneBusquedasTipoComisionConfig.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoComisionConfig.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoComisionConfig.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasTipoComisionConfig.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasTipoComisionConfig.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasTipoComisionConfig,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleTipoComisionConfig = new TipoComisionConfigDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Tipo Comision Config DATOS");
			this.jInternalFrameDetalleFormTipoComisionConfig = new TipoComisionConfigDetalleFormJInternalFrame(jDesktopPane,this.tipocomisionconfigSessionBean.getConGuardarRelaciones(),this.tipocomisionconfigSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormTipoComisionConfig = null;//new TipoComisionConfigDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoComisionConfig= new GridBagLayout();
		
		
		this.jTableDatosTipoComisionConfig = new JTableMe();      
		
		String sToolTipTipoComisionConfig="";
		sToolTipTipoComisionConfig=TipoComisionConfigConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoComisionConfig+="(Comisiones.TipoComisionConfig)";
		}
		
		if(!this.tipocomisionconfigSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoComisionConfig+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosTipoComisionConfig.setToolTipText(sToolTipTipoComisionConfig);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosTipoComisionConfig);
		this.jTableDatosTipoComisionConfig.setAutoCreateRowSorter(true);
		this.jTableDatosTipoComisionConfig.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosTipoComisionConfig.setRowSelectionAllowed(true);
		this.jTableDatosTipoComisionConfig.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosTipoComisionConfig,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoTipoComisionConfig = new JButtonMe();
		this.jButtonDuplicarTipoComisionConfig = new JButtonMe();
		this.jButtonCopiarTipoComisionConfig = new JButtonMe();
		this.jButtonVerFormTipoComisionConfig = new JButtonMe();
		this.jButtonNuevoRelacionesTipoComisionConfig = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaTipoComisionConfig = new JButtonMe();
		this.jButtonCerrarTipoComisionConfig = new JButtonMe();
		
		this.jScrollPanelDatosTipoComisionConfig = new JScrollPane();   
        this.jScrollPanelDatosGeneralTipoComisionConfig = new JScrollPane();
		
				
		
		
		this.jPanelAccionesTipoComisionConfig = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Comision Config";
		
		if(!this.tipocomisionconfigSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoComisionConfig.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Comision Configes" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoComisionConfig.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralTipoComisionConfig.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesTipoComisionConfig.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoComisionConfig.setToolTipText("Acciones");
        this.jPanelAccionesTipoComisionConfig.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoComisionConfig, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoComisionConfig, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoTipoComisionConfig=new ReporteDinamicoJInternalFrame(TipoComisionConfigConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoTipoComisionConfig();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionTipoComisionConfig=new ImportacionJInternalFrame(TipoComisionConfigConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionTipoComisionConfig();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByTipoComisionConfig = new JButtonMe();
		
		this.jButtonAbrirOrderByTipoComisionConfig.setText("Orden");
		this.jButtonAbrirOrderByTipoComisionConfig.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoComisionConfig,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoComisionConfig, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByTipoComisionConfig.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByTipoComisionConfig.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoComisionConfig=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoComisionConfig,false,this);
			
			//this.cargarOrderByTipoComisionConfig(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoComisionConfig=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoComisionConfig,true,this);
			
			//this.cargarOrderByTipoComisionConfig(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosTipoComisionConfig.setMinimumSize(new Dimension(400,50));//430
		this.jTableDatosTipoComisionConfig.setMaximumSize(new Dimension(400,50));//430
		this.jTableDatosTipoComisionConfig.setPreferredSize(new Dimension(400,50));//430
		
		this.jScrollPanelDatosTipoComisionConfig.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoComisionConfig.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoComisionConfig.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoTipoComisionConfig.setText("Nuevo");
		this.jButtonDuplicarTipoComisionConfig.setText("Duplicar");
		this.jButtonCopiarTipoComisionConfig.setText("Copiar");
		this.jButtonVerFormTipoComisionConfig.setText("Ver");
		this.jButtonNuevoRelacionesTipoComisionConfig.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaTipoComisionConfig.setText("Guardar");
		this.jButtonCerrarTipoComisionConfig.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoComisionConfig,"nuevo_button","Nuevo",this.tipocomisionconfigSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarTipoComisionConfig,"duplicar_button","Duplicar",this.tipocomisionconfigSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarTipoComisionConfig,"copiar_button","Copiar",this.tipocomisionconfigSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormTipoComisionConfig,"ver_form","Ver",this.tipocomisionconfigSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesTipoComisionConfig,"nuevorelaciones_button","Nuevo Rel",this.tipocomisionconfigSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoComisionConfig,"guardarcambiostabla_button","Guardar",this.tipocomisionconfigSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoComisionConfig,"cerrar_button","Salir",this.tipocomisionconfigSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoComisionConfig, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarTipoComisionConfig, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarTipoComisionConfig, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormTipoComisionConfig, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesTipoComisionConfig, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoComisionConfig, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoComisionConfig, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoTipoComisionConfig.setToolTipText("Nuevo"+" "+TipoComisionConfigConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarTipoComisionConfig.setToolTipText("Duplicar"+" "+TipoComisionConfigConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarTipoComisionConfig.setToolTipText("Copiar"+" "+TipoComisionConfigConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormTipoComisionConfig.setToolTipText("Ver"+" "+TipoComisionConfigConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesTipoComisionConfig.setToolTipText("Nuevo Rel"+" "+TipoComisionConfigConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaTipoComisionConfig.setToolTipText("Guardar"+" "+TipoComisionConfigConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoComisionConfig.setToolTipText("Salir"+" "+TipoComisionConfigConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoComisionConfig";
		inputMap = this.jButtonNuevoTipoComisionConfig.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoComisionConfig.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoComisionConfig"));
		
		//DUPLICAR
		sMapKey = "DuplicarTipoComisionConfig";
		inputMap = this.jButtonDuplicarTipoComisionConfig.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarTipoComisionConfig.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarTipoComisionConfig"));
		
		//COPIAR
		sMapKey = "CopiarTipoComisionConfig";
		inputMap = this.jButtonCopiarTipoComisionConfig.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarTipoComisionConfig.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarTipoComisionConfig"));
		
		//VEr FORM
		sMapKey = "VerFormTipoComisionConfig";
		inputMap = this.jButtonVerFormTipoComisionConfig.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormTipoComisionConfig.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormTipoComisionConfig"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesTipoComisionConfig";
		inputMap = this.jButtonNuevoRelacionesTipoComisionConfig.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesTipoComisionConfig.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesTipoComisionConfig"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarTipoComisionConfig";
		inputMap = this.jButtonModificarTipoComisionConfig.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarTipoComisionConfig.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarTipoComisionConfig"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarTipoComisionConfig";
		inputMap = this.jButtonCerrarTipoComisionConfig.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoComisionConfig.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoComisionConfig"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoComisionConfig";
		inputMap = this.jButtonGuardarCambiosTablaTipoComisionConfig.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoComisionConfig.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoComisionConfig"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesTipoComisionConfig = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesTipoComisionConfig = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionTipoComisionConfig = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1TipoComisionConfig= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2TipoComisionConfig= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3TipoComisionConfig= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4TipoComisionConfig= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5TipoComisionConfig= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesTipoComisionConfig.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesTipoComisionConfig.setName("jPanelParametrosReportesTipoComisionConfig"); 
		
		this.jPanelParametrosReportesAccionesTipoComisionConfig.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesTipoComisionConfig.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesTipoComisionConfig.setName("jPanelParametrosReportesAccionesTipoComisionConfig"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesTipoComisionConfig, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesTipoComisionConfig, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionTipoComisionConfig = new JButtonMe();
		this.jButtonRecargarInformacionTipoComisionConfig.setText("Recargar");
		this.jButtonRecargarInformacionTipoComisionConfig.setToolTipText("Recargar"+" "+TipoComisionConfigConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionTipoComisionConfig,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionTipoComisionConfig = new JButtonMe();
		this.jButtonProcesarInformacionTipoComisionConfig.setText("Procesar");
		this.jButtonProcesarInformacionTipoComisionConfig.setToolTipText("Procesar"+" "+TipoComisionConfigConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionTipoComisionConfig.setVisible(false);
			
		this.jButtonProcesarInformacionTipoComisionConfig.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoComisionConfig.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoComisionConfig.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesTipoComisionConfig = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoComisionConfig.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesTipoComisionConfig.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesTipoComisionConfig = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoComisionConfig.setText("TIPO");       
		this.jComboBoxTiposReportesTipoComisionConfig.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesTipoComisionConfig = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoComisionConfig.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesTipoComisionConfig.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionTipoComisionConfig = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionTipoComisionConfig.setText("Paginacion");
		this.jComboBoxTiposPaginacionTipoComisionConfig.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesTipoComisionConfig = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesTipoComisionConfig.setText("Accion");
		this.jComboBoxTiposRelacionesTipoComisionConfig.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesTipoComisionConfig = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoComisionConfig.setText("Accion");
		this.jComboBoxTiposAccionesTipoComisionConfig.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarTipoComisionConfig = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarTipoComisionConfig.setText("Accion");
		this.jComboBoxTiposSeleccionarTipoComisionConfig.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralTipoComisionConfig=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralTipoComisionConfig.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoComisionConfig.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoComisionConfig.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesTipoComisionConfig = new JLabelMe();
		
		this.jLabelAccionesTipoComisionConfig.setText("Acciones");		
		this.jLabelAccionesTipoComisionConfig.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoComisionConfig.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoComisionConfig.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosTipoComisionConfig = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosTipoComisionConfig.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosTipoComisionConfig.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosTipoComisionConfig = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosTipoComisionConfig.setText("Seleccionados");
		this.jCheckBoxSeleccionadosTipoComisionConfig.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaTipoComisionConfig = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaTipoComisionConfig.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaTipoComisionConfig.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteTipoComisionConfig = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteTipoComisionConfig.setText("Graf.");
		this.jCheckBoxConGraficoReporteTipoComisionConfig.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresTipoComisionConfig = new JButtonMe();
		//this.jButtonAnterioresTipoComisionConfig.setText("<<");
        this.jButtonAnterioresTipoComisionConfig.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresTipoComisionConfig,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresTipoComisionConfig, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesTipoComisionConfig = new JButtonMe();
		//this.jButtonSiguientesTipoComisionConfig.setText(">>");
        this.jButtonSiguientesTipoComisionConfig.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesTipoComisionConfig,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesTipoComisionConfig, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosTipoComisionConfig = new JButtonMe();
		this.jButtonNuevoGuardarCambiosTipoComisionConfig.setText("Nue");
        this.jButtonNuevoGuardarCambiosTipoComisionConfig.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosTipoComisionConfig,"nuevoguardarcambios_button","Nue",this.tipocomisionconfigSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosTipoComisionConfig, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosTipoComisionConfig";
		inputMap = this.jButtonNuevoGuardarCambiosTipoComisionConfig.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosTipoComisionConfig.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosTipoComisionConfig"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionTipoComisionConfig";
		inputMap = this.jButtonRecargarInformacionTipoComisionConfig.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionTipoComisionConfig.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionTipoComisionConfig"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesTipoComisionConfig";
		inputMap = this.jButtonSiguientesTipoComisionConfig.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesTipoComisionConfig.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesTipoComisionConfig"));
		
		//ANTERIORES		
		sMapKey = "AnterioresTipoComisionConfig";
		inputMap = this.jButtonAnterioresTipoComisionConfig.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresTipoComisionConfig.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresTipoComisionConfig"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasTipoComisionConfig();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesTipoComisionConfig.setMinimumSize(new Dimension(this.getWidth(),TipoComisionConfigBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoComisionConfigBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoComisionConfig.setMaximumSize(new Dimension(this.getWidth(),TipoComisionConfigBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoComisionConfigBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoComisionConfig.setPreferredSize(new Dimension(this.getWidth(),TipoComisionConfigBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoComisionConfigBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionTipoComisionConfig = new GridBagLayout();

			this.jPanelPaginacionTipoComisionConfig.setLayout(gridaBagLayoutPaginacionTipoComisionConfig);						
			
			this.gridBagConstraintsTipoComisionConfig = new GridBagConstraints();
			this.gridBagConstraintsTipoComisionConfig.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsTipoComisionConfig.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoComisionConfig.gridy = 0;
			this.gridBagConstraintsTipoComisionConfig.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionTipoComisionConfig.add(this.jButtonAnterioresTipoComisionConfig, this.gridBagConstraintsTipoComisionConfig);
					
						
			this.gridBagConstraintsTipoComisionConfig = new GridBagConstraints();
			this.gridBagConstraintsTipoComisionConfig.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoComisionConfig.gridy = 0;
			
			this.jPanelPaginacionTipoComisionConfig.add(this.jButtonNuevoGuardarCambiosTipoComisionConfig, this.gridBagConstraintsTipoComisionConfig);
						
			
			this.gridBagConstraintsTipoComisionConfig = new GridBagConstraints();
			this.gridBagConstraintsTipoComisionConfig.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsTipoComisionConfig.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoComisionConfig.gridy = 0;
			this.jPanelPaginacionTipoComisionConfig.add(this.jButtonSiguientesTipoComisionConfig, this.gridBagConstraintsTipoComisionConfig);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsTipoComisionConfig = new GridBagConstraints();
			this.gridBagConstraintsTipoComisionConfig.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoComisionConfig.gridy = 1;
			this.gridBagConstraintsTipoComisionConfig.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoComisionConfig.add(this.jButtonNuevoTipoComisionConfig, this.gridBagConstraintsTipoComisionConfig);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsTipoComisionConfig = new GridBagConstraints();
				this.gridBagConstraintsTipoComisionConfig.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoComisionConfig.gridy = 1;
				this.gridBagConstraintsTipoComisionConfig.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionTipoComisionConfig.add(this.jButtonNuevoRelacionesTipoComisionConfig, this.gridBagConstraintsTipoComisionConfig);
			}
			
			
			if(!this.tipocomisionconfigSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsTipoComisionConfig = new GridBagConstraints();
				this.gridBagConstraintsTipoComisionConfig.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoComisionConfig.gridy = 1;
				this.gridBagConstraintsTipoComisionConfig.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionTipoComisionConfig.add(this.jButtonGuardarCambiosTablaTipoComisionConfig, this.gridBagConstraintsTipoComisionConfig);
			}
			
			
			
			this.gridBagConstraintsTipoComisionConfig = new GridBagConstraints();
			this.gridBagConstraintsTipoComisionConfig.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoComisionConfig.gridy = 1;
			this.gridBagConstraintsTipoComisionConfig.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoComisionConfig.add(this.jButtonDuplicarTipoComisionConfig, this.gridBagConstraintsTipoComisionConfig);
			
			this.gridBagConstraintsTipoComisionConfig = new GridBagConstraints();
			this.gridBagConstraintsTipoComisionConfig.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoComisionConfig.gridy = 1;
			this.gridBagConstraintsTipoComisionConfig.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoComisionConfig.add(this.jButtonCopiarTipoComisionConfig, this.gridBagConstraintsTipoComisionConfig);
		
			this.gridBagConstraintsTipoComisionConfig = new GridBagConstraints();
			this.gridBagConstraintsTipoComisionConfig.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoComisionConfig.gridy = 1;
			this.gridBagConstraintsTipoComisionConfig.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoComisionConfig.add(this.jButtonVerFormTipoComisionConfig, this.gridBagConstraintsTipoComisionConfig);
		
			this.gridBagConstraintsTipoComisionConfig = new GridBagConstraints();
			this.gridBagConstraintsTipoComisionConfig.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoComisionConfig.gridy = 1;
			this.gridBagConstraintsTipoComisionConfig.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionTipoComisionConfig.add(this.jButtonCerrarTipoComisionConfig, this.gridBagConstraintsTipoComisionConfig);
		
		
		
		this.jButtonRecargarInformacionTipoComisionConfig.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoComisionConfig.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoComisionConfig.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionTipoComisionConfig, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesTipoComisionConfig.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoComisionConfig.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoComisionConfig.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesTipoComisionConfig, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesTipoComisionConfig.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoComisionConfig.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoComisionConfig.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesTipoComisionConfig, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesTipoComisionConfig.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoComisionConfig.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoComisionConfig.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesTipoComisionConfig, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionTipoComisionConfig.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoComisionConfig.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoComisionConfig.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionTipoComisionConfig, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesTipoComisionConfig.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoComisionConfig.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoComisionConfig.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesTipoComisionConfig, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesTipoComisionConfig.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoComisionConfig.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoComisionConfig.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoComisionConfig, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarTipoComisionConfig.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoComisionConfig.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoComisionConfig.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarTipoComisionConfig, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaTipoComisionConfig.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoComisionConfig.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoComisionConfig.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaTipoComisionConfig, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteTipoComisionConfig.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoComisionConfig.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoComisionConfig.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteTipoComisionConfig, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosTipoComisionConfig.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoComisionConfig.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoComisionConfig.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosTipoComisionConfig, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosTipoComisionConfig.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoComisionConfig.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoComisionConfig.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosTipoComisionConfig, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesTipoComisionConfig = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesTipoComisionConfig = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1TipoComisionConfig = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2TipoComisionConfig = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3TipoComisionConfig = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4TipoComisionConfig = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesTipoComisionConfig.setLayout(gridaBagParametrosReportesTipoComisionConfig);
			this.jPanelParametrosReportesAccionesTipoComisionConfig.setLayout(gridaBagParametrosReportesAccionesTipoComisionConfig);
			
			
			this.jPanelParametrosAuxiliar1TipoComisionConfig.setLayout(gridaBagParametrosAuxiliar1TipoComisionConfig);
			this.jPanelParametrosAuxiliar2TipoComisionConfig.setLayout(gridaBagParametrosAuxiliar2TipoComisionConfig);
			this.jPanelParametrosAuxiliar3TipoComisionConfig.setLayout(gridaBagParametrosAuxiliar3TipoComisionConfig);
			this.jPanelParametrosAuxiliar4TipoComisionConfig.setLayout(gridaBagParametrosAuxiliar4TipoComisionConfig);
			//this.jPanelParametrosAuxiliar5TipoComisionConfig.setLayout(gridaBagParametrosAuxiliar2TipoComisionConfig);			
			
			
			
			
			this.gridBagConstraintsTipoComisionConfig = new GridBagConstraints();
			this.gridBagConstraintsTipoComisionConfig.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoComisionConfig.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoComisionConfig.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoComisionConfig.add(this.jButtonRecargarInformacionTipoComisionConfig, this.gridBagConstraintsTipoComisionConfig);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsTipoComisionConfig = new GridBagConstraints();
			this.gridBagConstraintsTipoComisionConfig.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoComisionConfig.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoComisionConfig.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoComisionConfig.add(this.jComboBoxTiposPaginacionTipoComisionConfig, this.gridBagConstraintsTipoComisionConfig);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsTipoComisionConfig = new GridBagConstraints();
			this.gridBagConstraintsTipoComisionConfig.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoComisionConfig.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoComisionConfig.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoComisionConfig.add(this.jCheckBoxConAltoMaximoTablaTipoComisionConfig, this.gridBagConstraintsTipoComisionConfig);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsTipoComisionConfig = new GridBagConstraints();
			this.gridBagConstraintsTipoComisionConfig.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoComisionConfig.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoComisionConfig.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoComisionConfig.add(this.jComboBoxTiposArchivosReportesTipoComisionConfig, this.gridBagConstraintsTipoComisionConfig);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsTipoComisionConfig = new GridBagConstraints();
			this.gridBagConstraintsTipoComisionConfig.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoComisionConfig.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoComisionConfig.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoComisionConfig.add(this.jPanelParametrosAuxiliar1TipoComisionConfig, this.gridBagConstraintsTipoComisionConfig);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsTipoComisionConfig = new GridBagConstraints();
			this.gridBagConstraintsTipoComisionConfig.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoComisionConfig.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoComisionConfig.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoComisionConfig.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4TipoComisionConfig.add(this.jComboBoxTiposReportesTipoComisionConfig, this.gridBagConstraintsTipoComisionConfig);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsTipoComisionConfig = new GridBagConstraints();
			this.gridBagConstraintsTipoComisionConfig.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoComisionConfig.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoComisionConfig.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoComisionConfig.add(this.jPanelParametrosAuxiliar4TipoComisionConfig, this.gridBagConstraintsTipoComisionConfig);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsTipoComisionConfig = new GridBagConstraints();
			this.gridBagConstraintsTipoComisionConfig.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoComisionConfig.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoComisionConfig.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoComisionConfig.add(this.jComboBoxTiposReportesTipoComisionConfig, this.gridBagConstraintsTipoComisionConfig);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsTipoComisionConfig = new GridBagConstraints();
			this.gridBagConstraintsTipoComisionConfig.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoComisionConfig.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoComisionConfig.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoComisionConfig.add(this.jCheckBoxGenerarReporteTipoComisionConfig, this.gridBagConstraintsTipoComisionConfig);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsTipoComisionConfig = new GridBagConstraints();
			this.gridBagConstraintsTipoComisionConfig.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoComisionConfig.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoComisionConfig.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoComisionConfig.add(this.jPanelParametrosAuxiliar2TipoComisionConfig, this.gridBagConstraintsTipoComisionConfig);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsTipoComisionConfig = new GridBagConstraints();
			this.gridBagConstraintsTipoComisionConfig.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoComisionConfig.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoComisionConfig.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoComisionConfig.add(this.jLabelAccionesTipoComisionConfig, this.gridBagConstraintsTipoComisionConfig);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsTipoComisionConfig = new GridBagConstraints();
				this.gridBagConstraintsTipoComisionConfig.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsTipoComisionConfig.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsTipoComisionConfig.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesTipoComisionConfig.add(this.jButtonAbrirOrderByTipoComisionConfig, this.gridBagConstraintsTipoComisionConfig);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsTipoComisionConfig = new GridBagConstraints();
			this.gridBagConstraintsTipoComisionConfig.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsTipoComisionConfig.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoComisionConfig.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoComisionConfig.add(this.jComboBoxTiposSeleccionarTipoComisionConfig, this.gridBagConstraintsTipoComisionConfig);			
			
			
			/*
			this.gridBagConstraintsTipoComisionConfig = new GridBagConstraints();
			this.gridBagConstraintsTipoComisionConfig.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoComisionConfig.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoComisionConfig.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoComisionConfig.add(this.jCheckBoxSeleccionarTodosTipoComisionConfig, this.gridBagConstraintsTipoComisionConfig);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsTipoComisionConfig = new GridBagConstraints();
			this.gridBagConstraintsTipoComisionConfig.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoComisionConfig.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoComisionConfig.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoComisionConfig.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoComisionConfig.add(this.jCheckBoxSeleccionarTodosTipoComisionConfig, this.gridBagConstraintsTipoComisionConfig);															
				
			this.gridBagConstraintsTipoComisionConfig = new GridBagConstraints();
			this.gridBagConstraintsTipoComisionConfig.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoComisionConfig.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoComisionConfig.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoComisionConfig.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoComisionConfig.add(this.jCheckBoxSeleccionadosTipoComisionConfig, this.gridBagConstraintsTipoComisionConfig);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsTipoComisionConfig = new GridBagConstraints();
			this.gridBagConstraintsTipoComisionConfig.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoComisionConfig.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoComisionConfig.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoComisionConfig.add(this.jPanelParametrosAuxiliar3TipoComisionConfig, this.gridBagConstraintsTipoComisionConfig);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsTipoComisionConfig = new GridBagConstraints();
			this.gridBagConstraintsTipoComisionConfig.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoComisionConfig.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoComisionConfig.add(this.jComboBoxTiposRelacionesTipoComisionConfig, this.gridBagConstraintsTipoComisionConfig);
				
			this.gridBagConstraintsTipoComisionConfig = new GridBagConstraints();
			this.gridBagConstraintsTipoComisionConfig.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoComisionConfig.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoComisionConfig.add(this.jComboBoxTiposAccionesTipoComisionConfig, this.gridBagConstraintsTipoComisionConfig);
	
				
			this.gridBagConstraintsTipoComisionConfig = new GridBagConstraints();
			this.gridBagConstraintsTipoComisionConfig.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoComisionConfig.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoComisionConfig.add(this.jTextFieldValorCampoGeneralTipoComisionConfig, this.gridBagConstraintsTipoComisionConfig);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosTipoComisionConfig = new GridBagLayout();

			this.jScrollPanelDatosTipoComisionConfig.setLayout(gridaBagLayoutDatosTipoComisionConfig);
			
			this.gridBagConstraintsTipoComisionConfig = new GridBagConstraints();
			this.gridBagConstraintsTipoComisionConfig.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoComisionConfig.gridy = 0;
			this.gridBagConstraintsTipoComisionConfig.gridx = 0;
			
			this.jScrollPanelDatosTipoComisionConfig.add(this.jTableDatosTipoComisionConfig, this.gridBagConstraintsTipoComisionConfig);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosTipoComisionConfig.setViewportView(this.jTableDatosTipoComisionConfig);
		this.jTableDatosTipoComisionConfig.setFillsViewportHeight(true);
		this.jTableDatosTipoComisionConfig.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesTipoComisionConfig= new GridBagLayout();
		this.jPanelAccionesTipoComisionConfig.setLayout(gridaBagLayoutAccionesTipoComisionConfig);
		
		
		/*	
		this.gridBagConstraintsTipoComisionConfig = new GridBagConstraints();
		this.gridBagConstraintsTipoComisionConfig.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoComisionConfig.gridy = 0;
		this.gridBagConstraintsTipoComisionConfig.gridx = 0;
			
		this.jPanelAccionesTipoComisionConfig.add(this.jButtonNuevoTipoComisionConfig, this.gridBagConstraintsTipoComisionConfig);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoComisionConfig = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoComisionConfig);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipocomisionconfigSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoComisionConfig = new GridBagConstraints();						
			this.gridBagConstraintsTipoComisionConfig.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoComisionConfig.gridx = 0;		
			//this.gridBagConstraintsTipoComisionConfig.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoComisionConfig.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoComisionConfig.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarTipoComisionConfig, this.gridBagConstraintsTipoComisionConfig);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsTipoComisionConfig = new GridBagConstraints();
		this.gridBagConstraintsTipoComisionConfig.gridy = iGridyPrincipal++;
		this.gridBagConstraintsTipoComisionConfig.gridx = 0;		
		//this.gridBagConstraintsTipoComisionConfig.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoComisionConfig.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsTipoComisionConfig.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsTipoComisionConfig);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsTipoComisionConfig = new GridBagConstraints();
		this.gridBagConstraintsTipoComisionConfig.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoComisionConfig.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesTipoComisionConfig, this.gridBagConstraintsTipoComisionConfig);								
		
		
		/*
		this.gridBagConstraintsTipoComisionConfig = new GridBagConstraints();
		this.gridBagConstraintsTipoComisionConfig.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoComisionConfig.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesTipoComisionConfig, this.gridBagConstraintsTipoComisionConfig);
		*/		
		
		this.gridBagConstraintsTipoComisionConfig = new GridBagConstraints();
		this.gridBagConstraintsTipoComisionConfig.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoComisionConfig.gridx =0;
		this.gridBagConstraintsTipoComisionConfig.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoComisionConfig.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoComisionConfig, this.gridBagConstraintsTipoComisionConfig);
				
		
		this.gridBagConstraintsTipoComisionConfig = new GridBagConstraints();
		this.gridBagConstraintsTipoComisionConfig.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoComisionConfig.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionTipoComisionConfig, this.gridBagConstraintsTipoComisionConfig);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(TipoComisionConfigJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosTipoComisionConfig= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoComisionConfig = new GridBagLayout();
			this.jPanelBusquedasParametrosTipoComisionConfig.setLayout(gridaBagLayoutBusquedasParametrosTipoComisionConfig);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralTipoComisionConfig=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoComisionConfig.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoComisionConfig.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoComisionConfig.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoComisionConfig = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsTipoComisionConfig = new GridBagConstraints();
		this.gridBagConstraintsTipoComisionConfig.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoComisionConfig.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoComisionConfig, this.gridBagConstraintsTipoComisionConfig);
			
			
		this.gridBagConstraintsTipoComisionConfig = new GridBagConstraints();
		this.gridBagConstraintsTipoComisionConfig.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoComisionConfig.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoComisionConfig, this.gridBagConstraintsTipoComisionConfig);
		
			
		this.gridBagConstraintsTipoComisionConfig = new GridBagConstraints();
		this.gridBagConstraintsTipoComisionConfig.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoComisionConfig.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoComisionConfig, this.gridBagConstraintsTipoComisionConfig);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralTipoComisionConfig;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoTipoComisionConfig() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoTipoComisionConfig = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoTipoComisionConfig = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoTipoComisionConfig.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoTipoComisionConfig.setName("jPanelReporteDinamicoTipoComisionConfig"); 
		
		this.jPanelReporteDinamicoTipoComisionConfig.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoComisionConfig.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoComisionConfig.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoTipoComisionConfig.setLayout(gridaBagLayoutReporteDinamicoTipoComisionConfig);
		
		
		this.jInternalFrameReporteDinamicoTipoComisionConfig= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoTipoComisionConfig = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoComisionConfig= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoTipoComisionConfig.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoTipoComisionConfig.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoTipoComisionConfig.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoTipoComisionConfig.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoTipoComisionConfig.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoTipoComisionConfig.setResizable(true);
	    this.jInternalFrameReporteDinamicoTipoComisionConfig.setClosable(true);
	    this.jInternalFrameReporteDinamicoTipoComisionConfig.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoTipoComisionConfig.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoComisionConfig.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoComisionConfig.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoTipoComisionConfig.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Comision Configes"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteTipoComisionConfig = new JLabelMe();

		this.jLabelColumnasSelectReporteTipoComisionConfig.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteTipoComisionConfig.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoComisionConfig.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoComisionConfig.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoComisionConfig = new GridBagConstraints();
		this.gridBagConstraintsTipoComisionConfig.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoComisionConfig.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoComisionConfig.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoComisionConfig.add(this.jLabelColumnasSelectReporteTipoComisionConfig, this.gridBagConstraintsTipoComisionConfig);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteTipoComisionConfig = new JList<Reporte>();
		this.jListColumnasSelectReporteTipoComisionConfig.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteTipoComisionConfig.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteTipoComisionConfig.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoComisionConfig.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoComisionConfig.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteTipoComisionConfig=new JScrollPane(this.jListColumnasSelectReporteTipoComisionConfig);
			
			this.jScrollColumnasSelectReporteTipoComisionConfig.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoComisionConfig.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoComisionConfig.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteTipoComisionConfig.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTipoComisionConfig = new GridBagConstraints();
		this.gridBagConstraintsTipoComisionConfig.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoComisionConfig.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoComisionConfig.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoComisionConfig.add(this.jListColumnasSelectReporteTipoComisionConfig, this.gridBagConstraintsTipoComisionConfig);
		this.jPanelReporteDinamicoTipoComisionConfig.add(this.jScrollColumnasSelectReporteTipoComisionConfig, this.gridBagConstraintsTipoComisionConfig);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteTipoComisionConfig = new JLabelMe();

		this.jLabelRelacionesSelectReporteTipoComisionConfig.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteTipoComisionConfig.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoComisionConfig.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoComisionConfig.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsTipoComisionConfig = new GridBagConstraints();
		this.gridBagConstraintsTipoComisionConfig.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoComisionConfig.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoComisionConfig.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoComisionConfig.add(this.jLabelRelacionesSelectReporteTipoComisionConfig, this.gridBagConstraintsTipoComisionConfig);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteTipoComisionConfig = new JList<Reporte>();
		this.jListRelacionesSelectReporteTipoComisionConfig.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteTipoComisionConfig.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteTipoComisionConfig.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoComisionConfig.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoComisionConfig.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteTipoComisionConfig=new JScrollPane(this.jListRelacionesSelectReporteTipoComisionConfig);
			
			this.jScrollRelacionesSelectReporteTipoComisionConfig.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoComisionConfig.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoComisionConfig.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteTipoComisionConfig.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsTipoComisionConfig = new GridBagConstraints();
		this.gridBagConstraintsTipoComisionConfig.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoComisionConfig.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoComisionConfig.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoComisionConfig.add(this.jListRelacionesSelectReporteTipoComisionConfig, this.gridBagConstraintsTipoComisionConfig);
		this.jPanelReporteDinamicoTipoComisionConfig.add(this.jScrollRelacionesSelectReporteTipoComisionConfig, this.gridBagConstraintsTipoComisionConfig);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoTipoComisionConfig = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoTipoComisionConfig = new JComboBoxMe();
		this.jListColumnasValoresGraficoTipoComisionConfig = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoTipoComisionConfig = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoTipoComisionConfig.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoTipoComisionConfig.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoComisionConfig.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoComisionConfig.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoTipoComisionConfig, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoTipoComisionConfig = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoTipoComisionConfig.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoTipoComisionConfig.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoComisionConfig.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoComisionConfig.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoTipoComisionConfig, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoTipoComisionConfig = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoTipoComisionConfig.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoTipoComisionConfig.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoComisionConfig.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoComisionConfig.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoComisionConfig = new GridBagConstraints();
		this.gridBagConstraintsTipoComisionConfig.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoComisionConfig.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoComisionConfig.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoComisionConfig.add(this.jLabelGenerarExcelReporteDinamicoTipoComisionConfig, this.gridBagConstraintsTipoComisionConfig);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoTipoComisionConfig = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoTipoComisionConfig.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoTipoComisionConfig,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoTipoComisionConfig.setToolTipText("Generar EXCEL"+" "+TipoComisionConfigConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsTipoComisionConfig = new GridBagConstraints();
		//this.gridBagConstraintsTipoComisionConfig.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsTipoComisionConfig.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsTipoComisionConfig.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoTipoComisionConfig.add(this.jButtonGenerarExcelReporteDinamicoTipoComisionConfig, this.gridBagConstraintsTipoComisionConfig);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsTipoComisionConfig = new GridBagConstraints();
		this.gridBagConstraintsTipoComisionConfig.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoComisionConfig.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoComisionConfig.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoComisionConfig.add(this.jComboBoxTiposReportesDinamicoTipoComisionConfig, this.gridBagConstraintsTipoComisionConfig);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoTipoComisionConfig = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoTipoComisionConfig.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoTipoComisionConfig.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoComisionConfig.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoComisionConfig.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoComisionConfig = new GridBagConstraints();
		this.gridBagConstraintsTipoComisionConfig.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoComisionConfig.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoComisionConfig.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoComisionConfig.add(this.jLabelTiposArchivoReporteDinamicoTipoComisionConfig, this.gridBagConstraintsTipoComisionConfig);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsTipoComisionConfig = new GridBagConstraints();
		this.gridBagConstraintsTipoComisionConfig.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoComisionConfig.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoComisionConfig.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoComisionConfig.add(this.jComboBoxTiposArchivosReportesDinamicoTipoComisionConfig, this.gridBagConstraintsTipoComisionConfig);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoTipoComisionConfig = new JButtonMe();
		this.jButtonGenerarReporteDinamicoTipoComisionConfig.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoTipoComisionConfig,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoTipoComisionConfig.setToolTipText("Generar"+" "+TipoComisionConfigConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsTipoComisionConfig = new GridBagConstraints();
		this.gridBagConstraintsTipoComisionConfig.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoComisionConfig.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoComisionConfig.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoComisionConfig.add(this.jButtonGenerarReporteDinamicoTipoComisionConfig, this.gridBagConstraintsTipoComisionConfig);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoTipoComisionConfig = new JButtonMe();
		this.jButtonCerrarReporteDinamicoTipoComisionConfig.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoTipoComisionConfig,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoTipoComisionConfig.setToolTipText("Cancelar"+" "+TipoComisionConfigConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoComisionConfig = new GridBagConstraints();
		this.gridBagConstraintsTipoComisionConfig.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoComisionConfig.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoComisionConfig.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoComisionConfig.add(this.jButtonCerrarReporteDinamicoTipoComisionConfig, this.gridBagConstraintsTipoComisionConfig);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalTipoComisionConfig = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoTipoComisionConfig= new JScrollPane(jPanelReporteDinamicoTipoComisionConfig,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoTipoComisionConfig.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoComisionConfig.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoComisionConfig.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoTipoComisionConfig.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Comision Configes"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoComisionConfig = new GridBagConstraints();
		this.gridBagConstraintsTipoComisionConfig.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsTipoComisionConfig.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsTipoComisionConfig.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoTipoComisionConfig.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoTipoComisionConfig.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalTipoComisionConfig);
		this.jInternalFrameReporteDinamicoTipoComisionConfig.getContentPane().add(this.jScrollPanelReporteDinamicoTipoComisionConfig, this.gridBagConstraintsTipoComisionConfig);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionTipoComisionConfig() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionTipoComisionConfig = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionTipoComisionConfig = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionTipoComisionConfig.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionTipoComisionConfig.setName("jPanelImportacionTipoComisionConfig"); 
		
		this.jPanelImportacionTipoComisionConfig.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoComisionConfig.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoComisionConfig.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionTipoComisionConfig.setLayout(gridaBagLayoutImportacionTipoComisionConfig);
		
		
		this.jInternalFrameImportacionTipoComisionConfig= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionTipoComisionConfig= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionTipoComisionConfig = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoComisionConfig= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionTipoComisionConfig.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoComisionConfig.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoComisionConfig.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionTipoComisionConfig.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoComisionConfig.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoComisionConfig.setResizable(true);
	    this.jInternalFrameImportacionTipoComisionConfig.setClosable(true);
	    this.jInternalFrameImportacionTipoComisionConfig.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionTipoComisionConfig.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoComisionConfig.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoComisionConfig.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionTipoComisionConfig.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoComisionConfig.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoComisionConfig.setResizable(true);
	    this.jInternalFrameImportacionTipoComisionConfig.setClosable(true);
	    this.jInternalFrameImportacionTipoComisionConfig.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionTipoComisionConfig.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoComisionConfig.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoComisionConfig.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionTipoComisionConfig.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Comision Configes"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionTipoComisionConfig = new JLabelMe();

		this.jLabelArchivoImportacionTipoComisionConfig.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionTipoComisionConfig.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoComisionConfig.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoComisionConfig.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoComisionConfig = new GridBagConstraints();
		this.gridBagConstraintsTipoComisionConfig.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoComisionConfig.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoComisionConfig.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoComisionConfig.add(this.jLabelArchivoImportacionTipoComisionConfig, this.gridBagConstraintsTipoComisionConfig);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionTipoComisionConfig = new JFileChooser();		
		this.jFileChooserImportacionTipoComisionConfig.setToolTipText("ESCOGER ARCHIVO"+" "+TipoComisionConfigConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionTipoComisionConfig = new JButtonMe();
		this.jButtonAbrirImportacionTipoComisionConfig.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionTipoComisionConfig,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionTipoComisionConfig.setToolTipText("Generar"+" "+TipoComisionConfigConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsTipoComisionConfig = new GridBagConstraints();
		this.gridBagConstraintsTipoComisionConfig.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoComisionConfig.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoComisionConfig.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoComisionConfig.add(this.jButtonAbrirImportacionTipoComisionConfig, this.gridBagConstraintsTipoComisionConfig);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionTipoComisionConfig = new JLabelMe();

		this.jLabelPathArchivoImportacionTipoComisionConfig.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionTipoComisionConfig.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoComisionConfig.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoComisionConfig.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoComisionConfig = new GridBagConstraints();
		this.gridBagConstraintsTipoComisionConfig.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoComisionConfig.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoComisionConfig.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoComisionConfig.add(this.jLabelPathArchivoImportacionTipoComisionConfig, this.gridBagConstraintsTipoComisionConfig);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionTipoComisionConfig=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionTipoComisionConfig.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoComisionConfig.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoComisionConfig.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsTipoComisionConfig = new GridBagConstraints();
		this.gridBagConstraintsTipoComisionConfig.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoComisionConfig.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoComisionConfig.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoComisionConfig.add(this.jTextFieldPathArchivoImportacionTipoComisionConfig, this.gridBagConstraintsTipoComisionConfig);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionTipoComisionConfig = new JButtonMe();
		this.jButtonGenerarImportacionTipoComisionConfig.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionTipoComisionConfig,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionTipoComisionConfig.setToolTipText("Generar"+" "+TipoComisionConfigConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsTipoComisionConfig = new GridBagConstraints();
		this.gridBagConstraintsTipoComisionConfig.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoComisionConfig.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoComisionConfig.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoComisionConfig.add(this.jButtonGenerarImportacionTipoComisionConfig, this.gridBagConstraintsTipoComisionConfig);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionTipoComisionConfig = new JButtonMe();
		this.jButtonCerrarImportacionTipoComisionConfig.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionTipoComisionConfig,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionTipoComisionConfig.setToolTipText("Cancelar"+" "+TipoComisionConfigConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoComisionConfig = new GridBagConstraints();
		this.gridBagConstraintsTipoComisionConfig.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoComisionConfig.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoComisionConfig.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoComisionConfig.add(this.jButtonCerrarImportacionTipoComisionConfig, this.gridBagConstraintsTipoComisionConfig);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalTipoComisionConfig = new GridBagLayout();
		
		this.jScrollPanelImportacionTipoComisionConfig= new JScrollPane(jPanelImportacionTipoComisionConfig,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsTipoComisionConfig = new GridBagConstraints();
		this.gridBagConstraintsTipoComisionConfig.gridy =iPosYImportacion;
		this.gridBagConstraintsTipoComisionConfig.gridx =iPosXImportacion;
		this.gridBagConstraintsTipoComisionConfig.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionTipoComisionConfig.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionTipoComisionConfig.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalTipoComisionConfig);
		this.jInternalFrameImportacionTipoComisionConfig.getContentPane().add(this.jScrollPanelImportacionTipoComisionConfig, this.gridBagConstraintsTipoComisionConfig);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByTipoComisionConfig(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByTipoComisionConfig = new JButtonMe();
			this.jButtonAbrirOrderByTipoComisionConfig.setText("Orden");
			this.jButtonAbrirOrderByTipoComisionConfig.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoComisionConfig,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoComisionConfig, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByTipoComisionConfig";
			inputMap = this.jButtonAbrirOrderByTipoComisionConfig.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByTipoComisionConfig.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByTipoComisionConfig"));
		
		
			GridBagLayout gridaBagLayoutOrderByTipoComisionConfig = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByTipoComisionConfig = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByTipoComisionConfig.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByTipoComisionConfig.setName("jPanelOrderByTipoComisionConfig"); 
			
			this.jPanelOrderByTipoComisionConfig.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoComisionConfig.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoComisionConfig.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByTipoComisionConfig, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByTipoComisionConfig.setLayout(gridaBagLayoutOrderByTipoComisionConfig);
			
			
			this.jTableDatosTipoComisionConfigOrderBy = new JTableMe();        
			this.jTableDatosTipoComisionConfigOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosTipoComisionConfigOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosTipoComisionConfigOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosTipoComisionConfigOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosTipoComisionConfigOrderBy.setViewportView(this.jTableDatosTipoComisionConfigOrderBy);
			this.jTableDatosTipoComisionConfigOrderBy.setFillsViewportHeight(true);
			this.jTableDatosTipoComisionConfigOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByTipoComisionConfig= new OrderByJInternalFrame();
			this.jInternalFrameOrderByTipoComisionConfig= new OrderByJInternalFrame();
			this.jScrollPanelOrderByTipoComisionConfig = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteTipoComisionConfig= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByTipoComisionConfig.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByTipoComisionConfig.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByTipoComisionConfig.setTitle("Orden");
			this.jInternalFrameOrderByTipoComisionConfig.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByTipoComisionConfig.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByTipoComisionConfig.setResizable(true);
			this.jInternalFrameOrderByTipoComisionConfig.setClosable(true);
			this.jInternalFrameOrderByTipoComisionConfig.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByTipoComisionConfig, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByTipoComisionConfig.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoComisionConfig.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoComisionConfig.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByTipoComisionConfig, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByTipoComisionConfig.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Comision Configes"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsTipoComisionConfig = new GridBagConstraints();
			this.gridBagConstraintsTipoComisionConfig.gridy =iPosYOrderBy++;
			this.gridBagConstraintsTipoComisionConfig.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoComisionConfig.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsTipoComisionConfig.ipady =150;
				
			this.jPanelOrderByTipoComisionConfig.add(jScrollPanelDatosTipoComisionConfigOrderBy, this.gridBagConstraintsTipoComisionConfig);//this.jTableDatosTipoComisionConfigTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByTipoComisionConfig = new JButtonMe();
			this.jButtonCerrarOrderByTipoComisionConfig.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByTipoComisionConfig,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByTipoComisionConfig.setToolTipText("Cancelar"+" "+TipoComisionConfigConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByTipoComisionConfig, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsTipoComisionConfig = new GridBagConstraints();
			this.gridBagConstraintsTipoComisionConfig.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoComisionConfig.gridy = iPosYOrderBy++;
			this.gridBagConstraintsTipoComisionConfig.gridx = iPosXOrderBy;
									
			this.jPanelOrderByTipoComisionConfig.add(this.jButtonCerrarOrderByTipoComisionConfig, this.gridBagConstraintsTipoComisionConfig);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalTipoComisionConfig = new GridBagLayout();
			
			this.jScrollPanelOrderByTipoComisionConfig= new JScrollPane(jPanelOrderByTipoComisionConfig,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsTipoComisionConfig = new GridBagConstraints();
			this.gridBagConstraintsTipoComisionConfig.gridy =iPosYOrderBy;
			this.gridBagConstraintsTipoComisionConfig.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoComisionConfig.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByTipoComisionConfig.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByTipoComisionConfig.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalTipoComisionConfig);
			
			this.jInternalFrameOrderByTipoComisionConfig.getContentPane().add(this.jScrollPanelOrderByTipoComisionConfig, this.gridBagConstraintsTipoComisionConfig);			
		
		} else {
			this.jButtonAbrirOrderByTipoComisionConfig = new JButtonMe();
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
			&& this.tipocomisionconfigSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosTipoComisionConfig.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosTipoComisionConfig.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosTipoComisionConfig.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosTipoComisionConfig.getRowHeight();//TipoComisionConfigConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.tipocomisionconfigSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > TipoComisionConfigConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoComisionConfig.isSelected()) {
					iHeightTable=TipoComisionConfigConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoComisionConfigConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoComisionConfigConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > TipoComisionConfigConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoComisionConfig.isSelected()) {
					iHeightTable=TipoComisionConfigConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoComisionConfigConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoComisionConfigConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosTipoComisionConfig.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoComisionConfig.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoComisionConfig.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosTipoComisionConfig.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoComisionConfig.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoComisionConfig.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByTipoComisionConfig!=null && this.jInternalFrameOrderByTipoComisionConfig.getjTableDatosOrderBy()!=null) {
			//if(!this.tipocomisionconfigSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByTipoComisionConfig.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByTipoComisionConfig.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByTipoComisionConfig.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByTipoComisionConfig.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByTipoComisionConfig.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByTipoComisionConfig.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByTipoComisionConfig.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosTipoComisionConfig.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoComisionConfig.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoComisionConfig.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=tipocomisionconfigLogic.getTipoComisionConfigs().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipocomisionconfigs.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<TipoComisionConfig> TraerTipoComisionConfigBeans(List<TipoComisionConfig> tipocomisionconfigs,ArrayList<Classe> classes)throws Exception {
		try {
			for(TipoComisionConfig tipocomisionconfig:tipocomisionconfigs) {
					
				if(!(TipoComisionConfigConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || TipoComisionConfigConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					tipocomisionconfig.setsDetalleGeneralEntityReporte(TipoComisionConfigConstantesFunciones.getTipoComisionConfigDescripcion(tipocomisionconfig));
										
						
					
					

					if(tipocomisionconfig.getComisionConfigs()!=null && Funciones.existeClass(classes,ComisionConfig.class)) {
						try{tipocomisionconfig.setcomisionconfigsDescripcionReporte(new JRBeanCollectionDataSource(ComisionConfigJInternalFrame.TraerComisionConfigBeans(tipocomisionconfig.getComisionConfigs(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//tipocomisionconfig.setsDetalleGeneralEntityReporte(tipocomisionconfig.getsDetalleGeneralEntityReporte());
										
				}
				
				//tipocomisionconfigbeans.add(tipocomisionconfigbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return tipocomisionconfigs;
    }
	//PARA REPORTES FIN
}
