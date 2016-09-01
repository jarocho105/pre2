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
import com.bydan.erp.cartera.util.TipoCompaniaConstantesFunciones;

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
public class TipoCompaniaJInternalFrame extends TipoCompaniaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarTipoCompania;
	
	protected JMenuBar jmenuBarTipoCompania;
	
	protected JMenu jmenuTipoCompania;
	protected JMenu jmenuDatosTipoCompania;
	protected JMenu jmenuArchivoTipoCompania;
	protected JMenu jmenuAccionesTipoCompania;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosTipoCompania = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoCompania;	
	protected GridBagConstraints gridBagConstraintsTipoCompania;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public TipoCompaniaDetalleFormJInternalFrame jInternalFrameDetalleFormTipoCompania;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoTipoCompania;	
	protected ImportacionJInternalFrame jInternalFrameImportacionTipoCompania;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public TipoCompaniaSessionBean tipocompaniaSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<TipoCompania> tipocompanias;		
	public List<TipoCompania> tipocompaniasEliminados;	
	public List<TipoCompania> tipocompaniasAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByTipoCompania;		
	protected JButton jButtonAbrirOrderByTipoCompania;
	
	
	//protected JPanel jPanelOrderByTipoCompania;
	//public JScrollPane jScrollPanelOrderByTipoCompania;	
	//protected JButton jButtonCerrarOrderByTipoCompania;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public TipoCompaniaLogic tipocompaniaLogic;
	
	
	
	public JScrollPane jScrollPanelDatosTipoCompania;
	public JScrollPane jScrollPanelDatosEdicionTipoCompania;
	public JScrollPane jScrollPanelDatosGeneralTipoCompania;
    
	
	
	//public JScrollPane jScrollPanelDatosTipoCompaniaOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoTipoCompania;
	//public JScrollPane jScrollPanelImportacionTipoCompania;
	
	
	
	protected JPanel jPanelAccionesTipoCompania;
	
    protected JPanel jPanelPaginacionTipoCompania;
    protected JPanel jPanelParametrosReportesTipoCompania;
	protected JPanel jPanelParametrosReportesAccionesTipoCompania;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1TipoCompania;
	protected JPanel jPanelParametrosAuxiliar2TipoCompania;
	protected JPanel jPanelParametrosAuxiliar3TipoCompania;
	protected JPanel jPanelParametrosAuxiliar4TipoCompania;
	//protected JPanel jPanelParametrosAuxiliar5TipoCompania;
	
	
	
	//protected JPanel jPanelReporteDinamicoTipoCompania;
	//protected JPanel jPanelImportacionTipoCompania;
	
	
	public JTable jTableDatosTipoCompania;
	
	
	
	//public JTable jTableDatosTipoCompaniaOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoTipoCompania;
	protected JButton jButtonDuplicarTipoCompania;
	protected JButton jButtonCopiarTipoCompania;
	protected JButton jButtonVerFormTipoCompania;
	protected JButton jButtonNuevoRelacionesTipoCompania;
	protected JButton jButtonModificarTipoCompania;
	
    protected JButton jButtonGuardarCambiosTablaTipoCompania;
	protected JButton jButtonCerrarTipoCompania;
	
	
	protected JButton jButtonRecargarInformacionTipoCompania;
	protected JButton jButtonProcesarInformacionTipoCompania;
	
	
	protected JButton jButtonAnterioresTipoCompania;
	protected JButton jButtonSiguientesTipoCompania;
	protected JButton jButtonNuevoGuardarCambiosTipoCompania;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoTipoCompania;
	//protected JButton jButtonCerrarReporteDinamicoTipoCompania;
	//protected JButton jButtonGenerarExcelReporteDinamicoTipoCompania;	
	
	
	
	//protected JButton jButtonAbrirImportacionTipoCompania;
	//protected JButton jButtonGenerarImportacionTipoCompania;
	//protected JButton jButtonCerrarImportacionTipoCompania;
	//protected JFileChooser jFileChooserImportacionTipoCompania;
	//protected File fileImportacionTipoCompania;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoCompania;
	protected JButton jButtonDuplicarToolBarTipoCompania;
	protected JButton jButtonNuevoRelacionesToolBarTipoCompania;
	
	
	public JButton jButtonGuardarCambiosToolBarTipoCompania;
	protected JButton jButtonCopiarToolBarTipoCompania;
	protected JButton jButtonVerFormToolBarTipoCompania;
	public JButton jButtonGuardarCambiosTablaToolBarTipoCompania;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoCompania;
	protected JButton jButtonCerrarToolBarTipoCompania;
	
	protected JButton jButtonRecargarInformacionToolBarTipoCompania;
	protected JButton jButtonProcesarInformacionToolBarTipoCompania;
	protected JButton jButtonAnterioresToolBarTipoCompania;
	protected JButton jButtonSiguientesToolBarTipoCompania;
	protected JButton jButtonNuevoGuardarCambiosToolBarTipoCompania;
	protected JButton jButtonAbrirOrderByToolBarTipoCompania;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoCompania;
	protected JMenuItem jMenuItemDuplicarTipoCompania;
	protected JMenuItem jMenuItemNuevoRelacionesTipoCompania;
	
	
	protected JMenuItem jMenuItemGuardarCambiosTipoCompania;
	protected JMenuItem jMenuItemCopiarTipoCompania;
	protected JMenuItem jMenuItemVerFormTipoCompania;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoCompania;
	protected JMenuItem jMenuItemCerrarTipoCompania;
	protected JMenuItem jMenuItemDetalleCerrarTipoCompania;
	protected JMenuItem jMenuItemDetalleAbrirOrderByTipoCompania;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoCompania;
	
	protected JMenuItem jMenuItemRecargarInformacionTipoCompania;
	protected JMenuItem jMenuItemProcesarInformacionTipoCompania;
	protected JMenuItem jMenuItemAnterioresTipoCompania;
	protected JMenuItem jMenuItemSiguientesTipoCompania;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoCompania;
	protected JMenuItem jMenuItemAbrirOrderByTipoCompania;
	protected JMenuItem jMenuItemMostrarOcultarTipoCompania;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoCompania;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosTipoCompania;
	protected JCheckBox jCheckBoxSeleccionadosTipoCompania;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaTipoCompania;
	protected JCheckBox jCheckBoxConGraficoReporteTipoCompania;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesTipoCompania;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesTipoCompania;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoTipoCompania;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoTipoCompania;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesTipoCompania;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionTipoCompania;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoCompania;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoCompania;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarTipoCompania;
	protected JTextField jTextFieldValorCampoGeneralTipoCompania;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteTipoCompania;
	//public JList<Reporte> jListColumnasSelectReporteTipoCompania;
	//public JScrollPane jScrollColumnasSelectReporteTipoCompania;
	
	//public JLabel jLabelRelacionesSelectReporteTipoCompania;
	//public JList<Reporte> jListRelacionesSelectReporteTipoCompania;
	//public JScrollPane jScrollRelacionesSelectReporteTipoCompania;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoTipoCompania;
	//protected JCheckBox jCheckBoxConGraficoDinamicoTipoCompania;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoTipoCompania;
	//public JLabel jLabelTiposArchivoReporteDinamicoTipoCompania;
	
		
	//public JLabel jLabelArchivoImportacionTipoCompania;	
	//public JLabel jLabelPathArchivoImportacionTipoCompania;
	//protected JTextField jTextFieldPathArchivoImportacionTipoCompania;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoTipoCompania;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoTipoCompania;
	
	//public JLabel jLabelColumnaCategoriaValorTipoCompania;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorTipoCompania;
	
	//public JLabel jLabelColumnasValoresGraficoTipoCompania;
	//public JList<Reporte> jListColumnasValoresGraficoTipoCompania;
	//public JScrollPane jScrollColumnasValoresGraficoTipoCompania;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoTipoCompania;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoTipoCompania;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasTipoCompania;
	
	
	
	
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
	public TipoCompaniaJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("TipoCompania No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoCompaniaJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoCompania No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoCompaniaJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoCompania No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoCompaniaJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoCompania No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionTipoCompania)	{
		this.jButtonRecargarInformacionTipoCompania = jButtonRecargarInformacionTipoCompania;
	}
	
	public JButton getjButtonProcesarInformacionTipoCompania() {
		return this.jButtonProcesarInformacionTipoCompania;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoCompania)	{
		this.jButtonProcesarInformacionTipoCompania = jButtonProcesarInformacionTipoCompania;
	}
	
	
	public JButton getjButtonRecargarInformacionTipoCompania() {
		return this.jButtonRecargarInformacionTipoCompania;
	}
	
	
	public List<TipoCompania> gettipocompanias() {
		return this.tipocompanias;
	}

	public void settipocompanias(List<TipoCompania> tipocompanias) {
		this.tipocompanias = tipocompanias;
	}
	
	public List<TipoCompania> gettipocompaniasAux() {
		return this.tipocompaniasAux;
	}

	public void settipocompaniasAux(List<TipoCompania> tipocompaniasAux) {
		this.tipocompaniasAux = tipocompaniasAux;
	}
	
	public List<TipoCompania> gettipocompaniasEliminados() {
		return this.tipocompaniasEliminados;
	}

	public void setTipoCompaniasEliminados(List<TipoCompania> tipocompaniasEliminados) {
		this.tipocompaniasEliminados = tipocompaniasEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarTipoCompania() {
		return jComboBoxTiposSeleccionarTipoCompania;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarTipoCompania(
			JComboBox jComboBoxTiposSeleccionarTipoCompania) {
		this.jComboBoxTiposSeleccionarTipoCompania = jComboBoxTiposSeleccionarTipoCompania;
	}
	
	public void setBorderResaltarTiposSeleccionarTipoCompania() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarTipoCompania.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarTipoCompania .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralTipoCompania() {
		return jTextFieldValorCampoGeneralTipoCompania;
	}

	public void setjTextFieldValorCampoGeneralTipoCompania(
			JTextField jTextFieldValorCampoGeneralTipoCompania) {
		this.jTextFieldValorCampoGeneralTipoCompania = jTextFieldValorCampoGeneralTipoCompania;
	}

	public void setBorderResaltarValorCampoGeneralTipoCompania() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoCompania.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralTipoCompania .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosTipoCompania() {
		return this.jCheckBoxSeleccionarTodosTipoCompania;
	}

	public void setjCheckBoxSeleccionarTodosTipoCompania(
			JCheckBox jCheckBoxSeleccionarTodosTipoCompania) {
		this.jCheckBoxSeleccionarTodosTipoCompania = jCheckBoxSeleccionarTodosTipoCompania;
	}

	public void setBorderResaltarSeleccionarTodosTipoCompania() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoCompania.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosTipoCompania .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosTipoCompania() {
		return this.jCheckBoxSeleccionadosTipoCompania;
	}

	public void setjCheckBoxSeleccionadosTipoCompania(
			JCheckBox jCheckBoxSeleccionadosTipoCompania) {
		this.jCheckBoxSeleccionadosTipoCompania = jCheckBoxSeleccionadosTipoCompania;
	}
	
	public void setBorderResaltarSeleccionadosTipoCompania() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoCompania.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosTipoCompania .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesTipoCompania() {
		return this.jComboBoxTiposArchivosReportesTipoCompania;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesTipoCompania(
			JComboBox jComboBoxTiposArchivosReportesTipoCompania) {
		this.jComboBoxTiposArchivosReportesTipoCompania = jComboBoxTiposArchivosReportesTipoCompania;
	}

	public void setBorderResaltarTiposArchivosReportesTipoCompania() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoCompania.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesTipoCompania .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesTipoCompania() {
		return this.jComboBoxTiposReportesTipoCompania;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesTipoCompania(
			JComboBox jComboBoxTiposReportesTipoCompania) {
		this.jComboBoxTiposReportesTipoCompania = jComboBoxTiposReportesTipoCompania;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoTipoCompania() {
	//	return jComboBoxTiposReportesDinamicoTipoCompania;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoTipoCompania(
	//		JComboBox jComboBoxTiposReportesDinamicoTipoCompania) {
	//	this.jComboBoxTiposReportesDinamicoTipoCompania = jComboBoxTiposReportesDinamicoTipoCompania;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoTipoCompania() {
	//	return jComboBoxTiposArchivosReportesDinamicoTipoCompania;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoTipoCompania(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoTipoCompania) {
	//	this.jComboBoxTiposArchivosReportesDinamicoTipoCompania = jComboBoxTiposArchivosReportesDinamicoTipoCompania;
	//}
	
	public void setBorderResaltarTiposReportesTipoCompania() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoCompania.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesTipoCompania .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesTipoCompania() {
		return this.jComboBoxTiposGraficosReportesTipoCompania;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesTipoCompania(
			JComboBox jComboBoxTiposGraficosReportesTipoCompania) {
		this.jComboBoxTiposGraficosReportesTipoCompania = jComboBoxTiposGraficosReportesTipoCompania;
	}
	
	public void setBorderResaltarTiposGraficosReportesTipoCompania() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoCompania.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesTipoCompania .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionTipoCompania() {
		return this.jComboBoxTiposPaginacionTipoCompania;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionTipoCompania(
			JComboBox jComboBoxTiposPaginacionTipoCompania) {
		this.jComboBoxTiposPaginacionTipoCompania = jComboBoxTiposPaginacionTipoCompania;
	}
	
	public void setBorderResaltarTiposPaginacionTipoCompania() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoCompania.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionTipoCompania .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesTipoCompania() {
		return this.jComboBoxTiposRelacionesTipoCompania;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoCompania() {
		return this.jComboBoxTiposAccionesTipoCompania;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoCompania(
			JComboBox jComboBoxTiposRelacionesTipoCompania) {
		this.jComboBoxTiposRelacionesTipoCompania = jComboBoxTiposRelacionesTipoCompania;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoCompania(
			JComboBox jComboBoxTiposAccionesTipoCompania) {
		this.jComboBoxTiposAccionesTipoCompania = jComboBoxTiposAccionesTipoCompania;
	}
	
	public void setBorderResaltarTiposRelacionesTipoCompania() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoCompania.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesTipoCompania .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesTipoCompania() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoCompania.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesTipoCompania .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoTipoCompania() {
	//	return jCheckBoxConGraficoDinamicoTipoCompania;
	//}

	//public void setjCheckBoxConGraficoDinamicoTipoCompania(
	//		JCheckBox jCheckBoxConGraficoDinamicoTipoCompania) {
	//	this.jCheckBoxConGraficoDinamicoTipoCompania = jCheckBoxConGraficoDinamicoTipoCompania;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoTipoCompania() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarTipoCompania.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoTipoCompania .setBorder(borderResaltar);		
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
		this.tipocompaniaSessionBean=new TipoCompaniaSessionBean();
		
		this.tipocompaniaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipocompaniaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipocompaniaSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=TipoCompaniaJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=TipoCompaniaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoCompaniaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoCompaniaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoCompaniaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Compania MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.tipocompaniaSessionBean.getEsGuardarRelacionado()) {
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
		
		TipoCompaniaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("TipoCompania No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarTipoCompania= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarTipoCompania=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarTipoCompania,this.jTtoolBarTipoCompania,
							"nuevo","nuevo","Nuevo"+" "+TipoCompaniaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoCompania=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarTipoCompania,this.jTtoolBarTipoCompania,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoCompania=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarTipoCompania,this.jTtoolBarTipoCompania,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+TipoCompaniaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarTipoCompania=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarTipoCompania,this.jTtoolBarTipoCompania,
							"duplicar","duplicar","Duplicar"+" "+TipoCompaniaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarTipoCompania=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarTipoCompania,this.jTtoolBarTipoCompania,
							"copiar","copiar","Copiar"+" "+TipoCompaniaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarTipoCompania=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarTipoCompania,this.jTtoolBarTipoCompania,
							"ver_form","ver_form","Ver"+" "+TipoCompaniaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarTipoCompania=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoCompania,this.jTtoolBarTipoCompania,
							"recargar","recargar","Recargar"+" "+TipoCompaniaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarTipoCompania=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoCompania,this.jTtoolBarTipoCompania,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarTipoCompania=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoCompania,this.jTtoolBarTipoCompania,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarTipoCompania=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarTipoCompania,this.jTtoolBarTipoCompania,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarTipoCompania=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarTipoCompania,this.jTtoolBarTipoCompania,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarTipoCompania=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarTipoCompania,this.jTtoolBarTipoCompania,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+TipoCompaniaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarTipoCompania=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarTipoCompania,this.jTtoolBarTipoCompania,
							"cerrar","cerrar","Salir"+" "+TipoCompaniaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarTipoCompania=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarTipoCompania;
			
				this.jButtonProcesarInformacionToolBarTipoCompania=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarTipoCompania;
				
		//protected JButton jButtonModificarToolBarTipoCompania;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarTipoCompania=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuTipoCompania=new JMenuMe("General");
		this.jmenuArchivoTipoCompania=new JMenuMe("Archivo");
		this.jmenuAccionesTipoCompania=new JMenuMe("Acciones");
		this.jmenuDatosTipoCompania=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoCompania= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoCompania.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoCompania,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoCompania, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarTipoCompania= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarTipoCompania.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarTipoCompania,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarTipoCompania, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesTipoCompania= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesTipoCompania.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesTipoCompania,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesTipoCompania, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosTipoCompania= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoCompania.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoCompania,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoCompania, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarTipoCompania= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarTipoCompania.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarTipoCompania,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarTipoCompania, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormTipoCompania= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormTipoCompania.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormTipoCompania,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormTipoCompania, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaTipoCompania= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaTipoCompania.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaTipoCompania,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaTipoCompania, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoCompania= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoCompania.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoCompania,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoCompania, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionTipoCompania= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionTipoCompania.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionTipoCompania,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionTipoCompania, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionTipoCompania= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionTipoCompania.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionTipoCompania,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresTipoCompania= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresTipoCompania.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresTipoCompania,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresTipoCompania, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesTipoCompania= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesTipoCompania.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesTipoCompania,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesTipoCompania, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByTipoCompania= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByTipoCompania.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByTipoCompania,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByTipoCompania, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoCompania= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoCompania.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoCompania,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoCompania, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByTipoCompania= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByTipoCompania.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByTipoCompania,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByTipoCompania, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoCompania= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoCompania.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoCompania,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoCompania, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosTipoCompania= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosTipoCompania.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosTipoCompania,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosTipoCompania, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoTipoCompania.add(this.jMenuItemCerrarTipoCompania);
			
			this.jmenuAccionesTipoCompania.add(this.jMenuItemNuevoTipoCompania);
			this.jmenuAccionesTipoCompania.add(this.jMenuItemNuevoGuardarCambiosTipoCompania);
			this.jmenuAccionesTipoCompania.add(this.jMenuItemNuevoRelacionesTipoCompania);
			this.jmenuAccionesTipoCompania.add(this.jMenuItemGuardarCambiosTablaTipoCompania);		
			this.jmenuAccionesTipoCompania.add(this.jMenuItemDuplicarTipoCompania);		
			this.jmenuAccionesTipoCompania.add(this.jMenuItemCopiarTipoCompania);		
			this.jmenuAccionesTipoCompania.add(this.jMenuItemVerFormTipoCompania);		
			
			this.jmenuDatosTipoCompania.add(this.jMenuItemRecargarInformacionTipoCompania);				
			this.jmenuDatosTipoCompania.add(this.jMenuItemAnterioresTipoCompania);				
			this.jmenuDatosTipoCompania.add(this.jMenuItemSiguientesTipoCompania);				
			this.jmenuDatosTipoCompania.add(this.jMenuItemAbrirOrderByTipoCompania);				
			this.jmenuDatosTipoCompania.add(this.jMenuItemMostrarOcultarTipoCompania);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesTipoCompania.add(this.jMenuItemGuardarCambiosTipoCompania);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoTipoCompania, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesTipoCompania, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosTipoCompania, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarTipoCompania.add(this.jmenuArchivoTipoCompania);		
			this.jmenuBarTipoCompania.add(this.jmenuAccionesTipoCompania);		
			this.jmenuBarTipoCompania.add(this.jmenuDatosTipoCompania);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarTipoCompania);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasTipoCompania() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		

		this.jTabbedPaneBusquedasTipoCompania=new JTabbedPane();


		this.jTabbedPaneBusquedasTipoCompania.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoCompania.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoCompania.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasTipoCompania.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasTipoCompania.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasTipoCompania,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleTipoCompania = new TipoCompaniaDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Tipo Compania DATOS");
			this.jInternalFrameDetalleFormTipoCompania = new TipoCompaniaDetalleFormJInternalFrame(jDesktopPane,this.tipocompaniaSessionBean.getConGuardarRelaciones(),this.tipocompaniaSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormTipoCompania = null;//new TipoCompaniaDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoCompania= new GridBagLayout();
		
		
		this.jTableDatosTipoCompania = new JTableMe();      
		
		String sToolTipTipoCompania="";
		sToolTipTipoCompania=TipoCompaniaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoCompania+="(Cartera.TipoCompania)";
		}
		
		if(!this.tipocompaniaSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoCompania+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosTipoCompania.setToolTipText(sToolTipTipoCompania);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosTipoCompania);
		this.jTableDatosTipoCompania.setAutoCreateRowSorter(true);
		this.jTableDatosTipoCompania.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosTipoCompania.setRowSelectionAllowed(true);
		this.jTableDatosTipoCompania.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosTipoCompania,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoTipoCompania = new JButtonMe();
		this.jButtonDuplicarTipoCompania = new JButtonMe();
		this.jButtonCopiarTipoCompania = new JButtonMe();
		this.jButtonVerFormTipoCompania = new JButtonMe();
		this.jButtonNuevoRelacionesTipoCompania = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaTipoCompania = new JButtonMe();
		this.jButtonCerrarTipoCompania = new JButtonMe();
		
		this.jScrollPanelDatosTipoCompania = new JScrollPane();   
        this.jScrollPanelDatosGeneralTipoCompania = new JScrollPane();
		
				
		
		
		this.jPanelAccionesTipoCompania = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Compania";
		
		if(!this.tipocompaniaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoCompania.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Companias" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoCompania.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralTipoCompania.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesTipoCompania.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoCompania.setToolTipText("Acciones");
        this.jPanelAccionesTipoCompania.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoCompania, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoCompania, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoTipoCompania=new ReporteDinamicoJInternalFrame(TipoCompaniaConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoTipoCompania();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionTipoCompania=new ImportacionJInternalFrame(TipoCompaniaConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionTipoCompania();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByTipoCompania = new JButtonMe();
		
		this.jButtonAbrirOrderByTipoCompania.setText("Orden");
		this.jButtonAbrirOrderByTipoCompania.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoCompania,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoCompania, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByTipoCompania.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByTipoCompania.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoCompania=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoCompania,false,this);
			
			//this.cargarOrderByTipoCompania(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoCompania=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoCompania,true,this);
			
			//this.cargarOrderByTipoCompania(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosTipoCompania.setMinimumSize(new Dimension(400,50));//430
		this.jTableDatosTipoCompania.setMaximumSize(new Dimension(400,50));//430
		this.jTableDatosTipoCompania.setPreferredSize(new Dimension(400,50));//430
		
		this.jScrollPanelDatosTipoCompania.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoCompania.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoCompania.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoTipoCompania.setText("Nuevo");
		this.jButtonDuplicarTipoCompania.setText("Duplicar");
		this.jButtonCopiarTipoCompania.setText("Copiar");
		this.jButtonVerFormTipoCompania.setText("Ver");
		this.jButtonNuevoRelacionesTipoCompania.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaTipoCompania.setText("Guardar");
		this.jButtonCerrarTipoCompania.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoCompania,"nuevo_button","Nuevo",this.tipocompaniaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarTipoCompania,"duplicar_button","Duplicar",this.tipocompaniaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarTipoCompania,"copiar_button","Copiar",this.tipocompaniaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormTipoCompania,"ver_form","Ver",this.tipocompaniaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesTipoCompania,"nuevorelaciones_button","Nuevo Rel",this.tipocompaniaSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoCompania,"guardarcambiostabla_button","Guardar",this.tipocompaniaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoCompania,"cerrar_button","Salir",this.tipocompaniaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoCompania, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarTipoCompania, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarTipoCompania, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormTipoCompania, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesTipoCompania, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoCompania, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoCompania, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoTipoCompania.setToolTipText("Nuevo"+" "+TipoCompaniaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarTipoCompania.setToolTipText("Duplicar"+" "+TipoCompaniaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarTipoCompania.setToolTipText("Copiar"+" "+TipoCompaniaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormTipoCompania.setToolTipText("Ver"+" "+TipoCompaniaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesTipoCompania.setToolTipText("Nuevo Rel"+" "+TipoCompaniaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaTipoCompania.setToolTipText("Guardar"+" "+TipoCompaniaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoCompania.setToolTipText("Salir"+" "+TipoCompaniaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoCompania";
		inputMap = this.jButtonNuevoTipoCompania.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoCompania.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoCompania"));
		
		//DUPLICAR
		sMapKey = "DuplicarTipoCompania";
		inputMap = this.jButtonDuplicarTipoCompania.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarTipoCompania.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarTipoCompania"));
		
		//COPIAR
		sMapKey = "CopiarTipoCompania";
		inputMap = this.jButtonCopiarTipoCompania.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarTipoCompania.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarTipoCompania"));
		
		//VEr FORM
		sMapKey = "VerFormTipoCompania";
		inputMap = this.jButtonVerFormTipoCompania.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormTipoCompania.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormTipoCompania"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesTipoCompania";
		inputMap = this.jButtonNuevoRelacionesTipoCompania.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesTipoCompania.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesTipoCompania"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarTipoCompania";
		inputMap = this.jButtonModificarTipoCompania.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarTipoCompania.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarTipoCompania"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarTipoCompania";
		inputMap = this.jButtonCerrarTipoCompania.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoCompania.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoCompania"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoCompania";
		inputMap = this.jButtonGuardarCambiosTablaTipoCompania.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoCompania.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoCompania"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesTipoCompania = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesTipoCompania = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionTipoCompania = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1TipoCompania= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2TipoCompania= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3TipoCompania= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4TipoCompania= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5TipoCompania= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesTipoCompania.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesTipoCompania.setName("jPanelParametrosReportesTipoCompania"); 
		
		this.jPanelParametrosReportesAccionesTipoCompania.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesTipoCompania.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesTipoCompania.setName("jPanelParametrosReportesAccionesTipoCompania"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesTipoCompania, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesTipoCompania, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionTipoCompania = new JButtonMe();
		this.jButtonRecargarInformacionTipoCompania.setText("Recargar");
		this.jButtonRecargarInformacionTipoCompania.setToolTipText("Recargar"+" "+TipoCompaniaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionTipoCompania,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionTipoCompania = new JButtonMe();
		this.jButtonProcesarInformacionTipoCompania.setText("Procesar");
		this.jButtonProcesarInformacionTipoCompania.setToolTipText("Procesar"+" "+TipoCompaniaConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionTipoCompania.setVisible(false);
			
		this.jButtonProcesarInformacionTipoCompania.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoCompania.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoCompania.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesTipoCompania = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoCompania.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesTipoCompania.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesTipoCompania = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoCompania.setText("TIPO");       
		this.jComboBoxTiposReportesTipoCompania.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesTipoCompania = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoCompania.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesTipoCompania.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionTipoCompania = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionTipoCompania.setText("Paginacion");
		this.jComboBoxTiposPaginacionTipoCompania.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesTipoCompania = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesTipoCompania.setText("Accion");
		this.jComboBoxTiposRelacionesTipoCompania.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesTipoCompania = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoCompania.setText("Accion");
		this.jComboBoxTiposAccionesTipoCompania.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarTipoCompania = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarTipoCompania.setText("Accion");
		this.jComboBoxTiposSeleccionarTipoCompania.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralTipoCompania=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralTipoCompania.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoCompania.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoCompania.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesTipoCompania = new JLabelMe();
		
		this.jLabelAccionesTipoCompania.setText("Acciones");		
		this.jLabelAccionesTipoCompania.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoCompania.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoCompania.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosTipoCompania = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosTipoCompania.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosTipoCompania.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosTipoCompania = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosTipoCompania.setText("Seleccionados");
		this.jCheckBoxSeleccionadosTipoCompania.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaTipoCompania = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaTipoCompania.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaTipoCompania.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteTipoCompania = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteTipoCompania.setText("Graf.");
		this.jCheckBoxConGraficoReporteTipoCompania.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresTipoCompania = new JButtonMe();
		//this.jButtonAnterioresTipoCompania.setText("<<");
        this.jButtonAnterioresTipoCompania.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresTipoCompania,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresTipoCompania, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesTipoCompania = new JButtonMe();
		//this.jButtonSiguientesTipoCompania.setText(">>");
        this.jButtonSiguientesTipoCompania.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesTipoCompania,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesTipoCompania, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosTipoCompania = new JButtonMe();
		this.jButtonNuevoGuardarCambiosTipoCompania.setText("Nue");
        this.jButtonNuevoGuardarCambiosTipoCompania.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosTipoCompania,"nuevoguardarcambios_button","Nue",this.tipocompaniaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosTipoCompania, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosTipoCompania";
		inputMap = this.jButtonNuevoGuardarCambiosTipoCompania.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosTipoCompania.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosTipoCompania"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionTipoCompania";
		inputMap = this.jButtonRecargarInformacionTipoCompania.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionTipoCompania.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionTipoCompania"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesTipoCompania";
		inputMap = this.jButtonSiguientesTipoCompania.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesTipoCompania.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesTipoCompania"));
		
		//ANTERIORES		
		sMapKey = "AnterioresTipoCompania";
		inputMap = this.jButtonAnterioresTipoCompania.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresTipoCompania.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresTipoCompania"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasTipoCompania();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesTipoCompania.setMinimumSize(new Dimension(this.getWidth(),TipoCompaniaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoCompaniaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoCompania.setMaximumSize(new Dimension(this.getWidth(),TipoCompaniaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoCompaniaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoCompania.setPreferredSize(new Dimension(this.getWidth(),TipoCompaniaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoCompaniaBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionTipoCompania = new GridBagLayout();

			this.jPanelPaginacionTipoCompania.setLayout(gridaBagLayoutPaginacionTipoCompania);						
			
			this.gridBagConstraintsTipoCompania = new GridBagConstraints();
			this.gridBagConstraintsTipoCompania.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsTipoCompania.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCompania.gridy = 0;
			this.gridBagConstraintsTipoCompania.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionTipoCompania.add(this.jButtonAnterioresTipoCompania, this.gridBagConstraintsTipoCompania);
					
						
			this.gridBagConstraintsTipoCompania = new GridBagConstraints();
			this.gridBagConstraintsTipoCompania.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoCompania.gridy = 0;
			
			this.jPanelPaginacionTipoCompania.add(this.jButtonNuevoGuardarCambiosTipoCompania, this.gridBagConstraintsTipoCompania);
						
			
			this.gridBagConstraintsTipoCompania = new GridBagConstraints();
			this.gridBagConstraintsTipoCompania.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsTipoCompania.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoCompania.gridy = 0;
			this.jPanelPaginacionTipoCompania.add(this.jButtonSiguientesTipoCompania, this.gridBagConstraintsTipoCompania);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsTipoCompania = new GridBagConstraints();
			this.gridBagConstraintsTipoCompania.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCompania.gridy = 1;
			this.gridBagConstraintsTipoCompania.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoCompania.add(this.jButtonNuevoTipoCompania, this.gridBagConstraintsTipoCompania);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsTipoCompania = new GridBagConstraints();
				this.gridBagConstraintsTipoCompania.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoCompania.gridy = 1;
				this.gridBagConstraintsTipoCompania.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionTipoCompania.add(this.jButtonNuevoRelacionesTipoCompania, this.gridBagConstraintsTipoCompania);
			}
			
			
			if(!this.tipocompaniaSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsTipoCompania = new GridBagConstraints();
				this.gridBagConstraintsTipoCompania.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoCompania.gridy = 1;
				this.gridBagConstraintsTipoCompania.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionTipoCompania.add(this.jButtonGuardarCambiosTablaTipoCompania, this.gridBagConstraintsTipoCompania);
			}
			
			
			
			this.gridBagConstraintsTipoCompania = new GridBagConstraints();
			this.gridBagConstraintsTipoCompania.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCompania.gridy = 1;
			this.gridBagConstraintsTipoCompania.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoCompania.add(this.jButtonDuplicarTipoCompania, this.gridBagConstraintsTipoCompania);
			
			this.gridBagConstraintsTipoCompania = new GridBagConstraints();
			this.gridBagConstraintsTipoCompania.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCompania.gridy = 1;
			this.gridBagConstraintsTipoCompania.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoCompania.add(this.jButtonCopiarTipoCompania, this.gridBagConstraintsTipoCompania);
		
			this.gridBagConstraintsTipoCompania = new GridBagConstraints();
			this.gridBagConstraintsTipoCompania.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCompania.gridy = 1;
			this.gridBagConstraintsTipoCompania.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoCompania.add(this.jButtonVerFormTipoCompania, this.gridBagConstraintsTipoCompania);
		
			this.gridBagConstraintsTipoCompania = new GridBagConstraints();
			this.gridBagConstraintsTipoCompania.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCompania.gridy = 1;
			this.gridBagConstraintsTipoCompania.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionTipoCompania.add(this.jButtonCerrarTipoCompania, this.gridBagConstraintsTipoCompania);
		
		
		
		this.jButtonRecargarInformacionTipoCompania.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoCompania.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoCompania.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionTipoCompania, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesTipoCompania.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoCompania.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoCompania.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesTipoCompania, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesTipoCompania.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoCompania.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoCompania.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesTipoCompania, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesTipoCompania.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoCompania.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoCompania.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesTipoCompania, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionTipoCompania.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoCompania.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoCompania.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionTipoCompania, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesTipoCompania.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoCompania.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoCompania.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesTipoCompania, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesTipoCompania.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoCompania.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoCompania.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoCompania, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarTipoCompania.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoCompania.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoCompania.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarTipoCompania, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaTipoCompania.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoCompania.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoCompania.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaTipoCompania, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteTipoCompania.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoCompania.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoCompania.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteTipoCompania, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosTipoCompania.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoCompania.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoCompania.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosTipoCompania, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosTipoCompania.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoCompania.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoCompania.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosTipoCompania, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesTipoCompania = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesTipoCompania = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1TipoCompania = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2TipoCompania = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3TipoCompania = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4TipoCompania = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesTipoCompania.setLayout(gridaBagParametrosReportesTipoCompania);
			this.jPanelParametrosReportesAccionesTipoCompania.setLayout(gridaBagParametrosReportesAccionesTipoCompania);
			
			
			this.jPanelParametrosAuxiliar1TipoCompania.setLayout(gridaBagParametrosAuxiliar1TipoCompania);
			this.jPanelParametrosAuxiliar2TipoCompania.setLayout(gridaBagParametrosAuxiliar2TipoCompania);
			this.jPanelParametrosAuxiliar3TipoCompania.setLayout(gridaBagParametrosAuxiliar3TipoCompania);
			this.jPanelParametrosAuxiliar4TipoCompania.setLayout(gridaBagParametrosAuxiliar4TipoCompania);
			//this.jPanelParametrosAuxiliar5TipoCompania.setLayout(gridaBagParametrosAuxiliar2TipoCompania);			
			
			
			
			
			this.gridBagConstraintsTipoCompania = new GridBagConstraints();
			this.gridBagConstraintsTipoCompania.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCompania.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoCompania.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoCompania.add(this.jButtonRecargarInformacionTipoCompania, this.gridBagConstraintsTipoCompania);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsTipoCompania = new GridBagConstraints();
			this.gridBagConstraintsTipoCompania.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCompania.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCompania.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoCompania.add(this.jComboBoxTiposPaginacionTipoCompania, this.gridBagConstraintsTipoCompania);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsTipoCompania = new GridBagConstraints();
			this.gridBagConstraintsTipoCompania.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCompania.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCompania.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoCompania.add(this.jCheckBoxConAltoMaximoTablaTipoCompania, this.gridBagConstraintsTipoCompania);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsTipoCompania = new GridBagConstraints();
			this.gridBagConstraintsTipoCompania.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCompania.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCompania.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoCompania.add(this.jComboBoxTiposArchivosReportesTipoCompania, this.gridBagConstraintsTipoCompania);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsTipoCompania = new GridBagConstraints();
			this.gridBagConstraintsTipoCompania.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCompania.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCompania.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoCompania.add(this.jPanelParametrosAuxiliar1TipoCompania, this.gridBagConstraintsTipoCompania);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsTipoCompania = new GridBagConstraints();
			this.gridBagConstraintsTipoCompania.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCompania.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCompania.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoCompania.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4TipoCompania.add(this.jComboBoxTiposReportesTipoCompania, this.gridBagConstraintsTipoCompania);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsTipoCompania = new GridBagConstraints();
			this.gridBagConstraintsTipoCompania.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCompania.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCompania.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoCompania.add(this.jPanelParametrosAuxiliar4TipoCompania, this.gridBagConstraintsTipoCompania);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsTipoCompania = new GridBagConstraints();
			this.gridBagConstraintsTipoCompania.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCompania.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCompania.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoCompania.add(this.jComboBoxTiposReportesTipoCompania, this.gridBagConstraintsTipoCompania);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsTipoCompania = new GridBagConstraints();
			this.gridBagConstraintsTipoCompania.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCompania.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCompania.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoCompania.add(this.jCheckBoxGenerarReporteTipoCompania, this.gridBagConstraintsTipoCompania);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsTipoCompania = new GridBagConstraints();
			this.gridBagConstraintsTipoCompania.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCompania.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCompania.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoCompania.add(this.jPanelParametrosAuxiliar2TipoCompania, this.gridBagConstraintsTipoCompania);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsTipoCompania = new GridBagConstraints();
			this.gridBagConstraintsTipoCompania.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCompania.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoCompania.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoCompania.add(this.jLabelAccionesTipoCompania, this.gridBagConstraintsTipoCompania);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsTipoCompania = new GridBagConstraints();
				this.gridBagConstraintsTipoCompania.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsTipoCompania.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsTipoCompania.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesTipoCompania.add(this.jButtonAbrirOrderByTipoCompania, this.gridBagConstraintsTipoCompania);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsTipoCompania = new GridBagConstraints();
			this.gridBagConstraintsTipoCompania.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsTipoCompania.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCompania.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoCompania.add(this.jComboBoxTiposSeleccionarTipoCompania, this.gridBagConstraintsTipoCompania);			
			
			
			/*
			this.gridBagConstraintsTipoCompania = new GridBagConstraints();
			this.gridBagConstraintsTipoCompania.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCompania.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoCompania.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoCompania.add(this.jCheckBoxSeleccionarTodosTipoCompania, this.gridBagConstraintsTipoCompania);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsTipoCompania = new GridBagConstraints();
			this.gridBagConstraintsTipoCompania.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCompania.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCompania.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoCompania.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoCompania.add(this.jCheckBoxSeleccionarTodosTipoCompania, this.gridBagConstraintsTipoCompania);															
				
			this.gridBagConstraintsTipoCompania = new GridBagConstraints();
			this.gridBagConstraintsTipoCompania.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCompania.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCompania.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoCompania.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoCompania.add(this.jCheckBoxSeleccionadosTipoCompania, this.gridBagConstraintsTipoCompania);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsTipoCompania = new GridBagConstraints();
			this.gridBagConstraintsTipoCompania.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCompania.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCompania.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoCompania.add(this.jPanelParametrosAuxiliar3TipoCompania, this.gridBagConstraintsTipoCompania);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsTipoCompania = new GridBagConstraints();
			this.gridBagConstraintsTipoCompania.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCompania.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoCompania.add(this.jComboBoxTiposRelacionesTipoCompania, this.gridBagConstraintsTipoCompania);
				
			this.gridBagConstraintsTipoCompania = new GridBagConstraints();
			this.gridBagConstraintsTipoCompania.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCompania.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoCompania.add(this.jComboBoxTiposAccionesTipoCompania, this.gridBagConstraintsTipoCompania);
	
				
			this.gridBagConstraintsTipoCompania = new GridBagConstraints();
			this.gridBagConstraintsTipoCompania.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCompania.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoCompania.add(this.jTextFieldValorCampoGeneralTipoCompania, this.gridBagConstraintsTipoCompania);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosTipoCompania = new GridBagLayout();

			this.jScrollPanelDatosTipoCompania.setLayout(gridaBagLayoutDatosTipoCompania);
			
			this.gridBagConstraintsTipoCompania = new GridBagConstraints();
			this.gridBagConstraintsTipoCompania.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCompania.gridy = 0;
			this.gridBagConstraintsTipoCompania.gridx = 0;
			
			this.jScrollPanelDatosTipoCompania.add(this.jTableDatosTipoCompania, this.gridBagConstraintsTipoCompania);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosTipoCompania.setViewportView(this.jTableDatosTipoCompania);
		this.jTableDatosTipoCompania.setFillsViewportHeight(true);
		this.jTableDatosTipoCompania.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesTipoCompania= new GridBagLayout();
		this.jPanelAccionesTipoCompania.setLayout(gridaBagLayoutAccionesTipoCompania);
		
		
		/*	
		this.gridBagConstraintsTipoCompania = new GridBagConstraints();
		this.gridBagConstraintsTipoCompania.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCompania.gridy = 0;
		this.gridBagConstraintsTipoCompania.gridx = 0;
			
		this.jPanelAccionesTipoCompania.add(this.jButtonNuevoTipoCompania, this.gridBagConstraintsTipoCompania);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoCompania = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoCompania);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipocompaniaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoCompania = new GridBagConstraints();						
			this.gridBagConstraintsTipoCompania.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoCompania.gridx = 0;		
			//this.gridBagConstraintsTipoCompania.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCompania.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoCompania.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarTipoCompania, this.gridBagConstraintsTipoCompania);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsTipoCompania = new GridBagConstraints();
		this.gridBagConstraintsTipoCompania.gridy = iGridyPrincipal++;
		this.gridBagConstraintsTipoCompania.gridx = 0;		
		//this.gridBagConstraintsTipoCompania.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCompania.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsTipoCompania.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsTipoCompania);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsTipoCompania = new GridBagConstraints();
		this.gridBagConstraintsTipoCompania.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoCompania.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesTipoCompania, this.gridBagConstraintsTipoCompania);								
		
		
		/*
		this.gridBagConstraintsTipoCompania = new GridBagConstraints();
		this.gridBagConstraintsTipoCompania.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoCompania.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesTipoCompania, this.gridBagConstraintsTipoCompania);
		*/		
		
		this.gridBagConstraintsTipoCompania = new GridBagConstraints();
		this.gridBagConstraintsTipoCompania.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoCompania.gridx =0;
		this.gridBagConstraintsTipoCompania.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoCompania.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoCompania, this.gridBagConstraintsTipoCompania);
				
		
		this.gridBagConstraintsTipoCompania = new GridBagConstraints();
		this.gridBagConstraintsTipoCompania.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoCompania.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionTipoCompania, this.gridBagConstraintsTipoCompania);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(TipoCompaniaJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosTipoCompania= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoCompania = new GridBagLayout();
			this.jPanelBusquedasParametrosTipoCompania.setLayout(gridaBagLayoutBusquedasParametrosTipoCompania);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralTipoCompania=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoCompania.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoCompania.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoCompania.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoCompania = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsTipoCompania = new GridBagConstraints();
		this.gridBagConstraintsTipoCompania.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoCompania.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoCompania, this.gridBagConstraintsTipoCompania);
			
			
		this.gridBagConstraintsTipoCompania = new GridBagConstraints();
		this.gridBagConstraintsTipoCompania.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoCompania.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoCompania, this.gridBagConstraintsTipoCompania);
		
			
		this.gridBagConstraintsTipoCompania = new GridBagConstraints();
		this.gridBagConstraintsTipoCompania.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoCompania.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoCompania, this.gridBagConstraintsTipoCompania);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralTipoCompania;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoTipoCompania() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoTipoCompania = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoTipoCompania = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoTipoCompania.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoTipoCompania.setName("jPanelReporteDinamicoTipoCompania"); 
		
		this.jPanelReporteDinamicoTipoCompania.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoCompania.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoCompania.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoTipoCompania.setLayout(gridaBagLayoutReporteDinamicoTipoCompania);
		
		
		this.jInternalFrameReporteDinamicoTipoCompania= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoTipoCompania = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoCompania= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoTipoCompania.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoTipoCompania.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoTipoCompania.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoTipoCompania.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoTipoCompania.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoTipoCompania.setResizable(true);
	    this.jInternalFrameReporteDinamicoTipoCompania.setClosable(true);
	    this.jInternalFrameReporteDinamicoTipoCompania.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoTipoCompania.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoCompania.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoCompania.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoTipoCompania.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Companias"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteTipoCompania = new JLabelMe();

		this.jLabelColumnasSelectReporteTipoCompania.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteTipoCompania.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoCompania.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoCompania.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoCompania = new GridBagConstraints();
		this.gridBagConstraintsTipoCompania.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCompania.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoCompania.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoCompania.add(this.jLabelColumnasSelectReporteTipoCompania, this.gridBagConstraintsTipoCompania);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteTipoCompania = new JList<Reporte>();
		this.jListColumnasSelectReporteTipoCompania.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteTipoCompania.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteTipoCompania.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoCompania.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoCompania.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteTipoCompania=new JScrollPane(this.jListColumnasSelectReporteTipoCompania);
			
			this.jScrollColumnasSelectReporteTipoCompania.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoCompania.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoCompania.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteTipoCompania.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTipoCompania = new GridBagConstraints();
		this.gridBagConstraintsTipoCompania.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCompania.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoCompania.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoCompania.add(this.jListColumnasSelectReporteTipoCompania, this.gridBagConstraintsTipoCompania);
		this.jPanelReporteDinamicoTipoCompania.add(this.jScrollColumnasSelectReporteTipoCompania, this.gridBagConstraintsTipoCompania);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteTipoCompania = new JLabelMe();

		this.jLabelRelacionesSelectReporteTipoCompania.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteTipoCompania.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoCompania.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoCompania.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsTipoCompania = new GridBagConstraints();
		this.gridBagConstraintsTipoCompania.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCompania.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoCompania.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoCompania.add(this.jLabelRelacionesSelectReporteTipoCompania, this.gridBagConstraintsTipoCompania);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteTipoCompania = new JList<Reporte>();
		this.jListRelacionesSelectReporteTipoCompania.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteTipoCompania.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteTipoCompania.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoCompania.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoCompania.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteTipoCompania=new JScrollPane(this.jListRelacionesSelectReporteTipoCompania);
			
			this.jScrollRelacionesSelectReporteTipoCompania.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoCompania.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoCompania.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteTipoCompania.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsTipoCompania = new GridBagConstraints();
		this.gridBagConstraintsTipoCompania.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCompania.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoCompania.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoCompania.add(this.jListRelacionesSelectReporteTipoCompania, this.gridBagConstraintsTipoCompania);
		this.jPanelReporteDinamicoTipoCompania.add(this.jScrollRelacionesSelectReporteTipoCompania, this.gridBagConstraintsTipoCompania);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoTipoCompania = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoTipoCompania = new JComboBoxMe();
		this.jListColumnasValoresGraficoTipoCompania = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoTipoCompania = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoTipoCompania.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoTipoCompania.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoCompania.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoCompania.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoTipoCompania, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoTipoCompania = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoTipoCompania.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoTipoCompania.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoCompania.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoCompania.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoTipoCompania, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoTipoCompania = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoTipoCompania.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoTipoCompania.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoCompania.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoCompania.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoCompania = new GridBagConstraints();
		this.gridBagConstraintsTipoCompania.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCompania.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoCompania.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoCompania.add(this.jLabelGenerarExcelReporteDinamicoTipoCompania, this.gridBagConstraintsTipoCompania);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoTipoCompania = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoTipoCompania.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoTipoCompania,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoTipoCompania.setToolTipText("Generar EXCEL"+" "+TipoCompaniaConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsTipoCompania = new GridBagConstraints();
		//this.gridBagConstraintsTipoCompania.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsTipoCompania.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsTipoCompania.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoTipoCompania.add(this.jButtonGenerarExcelReporteDinamicoTipoCompania, this.gridBagConstraintsTipoCompania);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsTipoCompania = new GridBagConstraints();
		this.gridBagConstraintsTipoCompania.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCompania.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoCompania.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoCompania.add(this.jComboBoxTiposReportesDinamicoTipoCompania, this.gridBagConstraintsTipoCompania);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoTipoCompania = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoTipoCompania.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoTipoCompania.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoCompania.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoCompania.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoCompania = new GridBagConstraints();
		this.gridBagConstraintsTipoCompania.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCompania.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoCompania.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoCompania.add(this.jLabelTiposArchivoReporteDinamicoTipoCompania, this.gridBagConstraintsTipoCompania);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsTipoCompania = new GridBagConstraints();
		this.gridBagConstraintsTipoCompania.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCompania.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoCompania.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoCompania.add(this.jComboBoxTiposArchivosReportesDinamicoTipoCompania, this.gridBagConstraintsTipoCompania);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoTipoCompania = new JButtonMe();
		this.jButtonGenerarReporteDinamicoTipoCompania.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoTipoCompania,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoTipoCompania.setToolTipText("Generar"+" "+TipoCompaniaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsTipoCompania = new GridBagConstraints();
		this.gridBagConstraintsTipoCompania.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCompania.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoCompania.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoCompania.add(this.jButtonGenerarReporteDinamicoTipoCompania, this.gridBagConstraintsTipoCompania);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoTipoCompania = new JButtonMe();
		this.jButtonCerrarReporteDinamicoTipoCompania.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoTipoCompania,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoTipoCompania.setToolTipText("Cancelar"+" "+TipoCompaniaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoCompania = new GridBagConstraints();
		this.gridBagConstraintsTipoCompania.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCompania.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoCompania.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoCompania.add(this.jButtonCerrarReporteDinamicoTipoCompania, this.gridBagConstraintsTipoCompania);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalTipoCompania = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoTipoCompania= new JScrollPane(jPanelReporteDinamicoTipoCompania,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoTipoCompania.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoCompania.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoCompania.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoTipoCompania.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Companias"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoCompania = new GridBagConstraints();
		this.gridBagConstraintsTipoCompania.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsTipoCompania.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsTipoCompania.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoTipoCompania.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoTipoCompania.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalTipoCompania);
		this.jInternalFrameReporteDinamicoTipoCompania.getContentPane().add(this.jScrollPanelReporteDinamicoTipoCompania, this.gridBagConstraintsTipoCompania);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionTipoCompania() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionTipoCompania = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionTipoCompania = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionTipoCompania.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionTipoCompania.setName("jPanelImportacionTipoCompania"); 
		
		this.jPanelImportacionTipoCompania.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoCompania.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoCompania.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionTipoCompania.setLayout(gridaBagLayoutImportacionTipoCompania);
		
		
		this.jInternalFrameImportacionTipoCompania= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionTipoCompania= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionTipoCompania = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoCompania= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionTipoCompania.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoCompania.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoCompania.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionTipoCompania.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoCompania.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoCompania.setResizable(true);
	    this.jInternalFrameImportacionTipoCompania.setClosable(true);
	    this.jInternalFrameImportacionTipoCompania.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionTipoCompania.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoCompania.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoCompania.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionTipoCompania.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoCompania.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoCompania.setResizable(true);
	    this.jInternalFrameImportacionTipoCompania.setClosable(true);
	    this.jInternalFrameImportacionTipoCompania.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionTipoCompania.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoCompania.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoCompania.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionTipoCompania.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Companias"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionTipoCompania = new JLabelMe();

		this.jLabelArchivoImportacionTipoCompania.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionTipoCompania.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoCompania.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoCompania.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoCompania = new GridBagConstraints();
		this.gridBagConstraintsTipoCompania.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCompania.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoCompania.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoCompania.add(this.jLabelArchivoImportacionTipoCompania, this.gridBagConstraintsTipoCompania);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionTipoCompania = new JFileChooser();		
		this.jFileChooserImportacionTipoCompania.setToolTipText("ESCOGER ARCHIVO"+" "+TipoCompaniaConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionTipoCompania = new JButtonMe();
		this.jButtonAbrirImportacionTipoCompania.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionTipoCompania,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionTipoCompania.setToolTipText("Generar"+" "+TipoCompaniaConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsTipoCompania = new GridBagConstraints();
		this.gridBagConstraintsTipoCompania.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCompania.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoCompania.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoCompania.add(this.jButtonAbrirImportacionTipoCompania, this.gridBagConstraintsTipoCompania);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionTipoCompania = new JLabelMe();

		this.jLabelPathArchivoImportacionTipoCompania.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionTipoCompania.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoCompania.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoCompania.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoCompania = new GridBagConstraints();
		this.gridBagConstraintsTipoCompania.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCompania.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoCompania.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoCompania.add(this.jLabelPathArchivoImportacionTipoCompania, this.gridBagConstraintsTipoCompania);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionTipoCompania=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionTipoCompania.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoCompania.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoCompania.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsTipoCompania = new GridBagConstraints();
		this.gridBagConstraintsTipoCompania.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCompania.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoCompania.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoCompania.add(this.jTextFieldPathArchivoImportacionTipoCompania, this.gridBagConstraintsTipoCompania);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionTipoCompania = new JButtonMe();
		this.jButtonGenerarImportacionTipoCompania.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionTipoCompania,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionTipoCompania.setToolTipText("Generar"+" "+TipoCompaniaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsTipoCompania = new GridBagConstraints();
		this.gridBagConstraintsTipoCompania.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCompania.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoCompania.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoCompania.add(this.jButtonGenerarImportacionTipoCompania, this.gridBagConstraintsTipoCompania);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionTipoCompania = new JButtonMe();
		this.jButtonCerrarImportacionTipoCompania.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionTipoCompania,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionTipoCompania.setToolTipText("Cancelar"+" "+TipoCompaniaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoCompania = new GridBagConstraints();
		this.gridBagConstraintsTipoCompania.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCompania.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoCompania.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoCompania.add(this.jButtonCerrarImportacionTipoCompania, this.gridBagConstraintsTipoCompania);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalTipoCompania = new GridBagLayout();
		
		this.jScrollPanelImportacionTipoCompania= new JScrollPane(jPanelImportacionTipoCompania,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsTipoCompania = new GridBagConstraints();
		this.gridBagConstraintsTipoCompania.gridy =iPosYImportacion;
		this.gridBagConstraintsTipoCompania.gridx =iPosXImportacion;
		this.gridBagConstraintsTipoCompania.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionTipoCompania.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionTipoCompania.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalTipoCompania);
		this.jInternalFrameImportacionTipoCompania.getContentPane().add(this.jScrollPanelImportacionTipoCompania, this.gridBagConstraintsTipoCompania);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByTipoCompania(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByTipoCompania = new JButtonMe();
			this.jButtonAbrirOrderByTipoCompania.setText("Orden");
			this.jButtonAbrirOrderByTipoCompania.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoCompania,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoCompania, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByTipoCompania";
			inputMap = this.jButtonAbrirOrderByTipoCompania.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByTipoCompania.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByTipoCompania"));
		
		
			GridBagLayout gridaBagLayoutOrderByTipoCompania = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByTipoCompania = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByTipoCompania.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByTipoCompania.setName("jPanelOrderByTipoCompania"); 
			
			this.jPanelOrderByTipoCompania.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoCompania.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoCompania.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByTipoCompania, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByTipoCompania.setLayout(gridaBagLayoutOrderByTipoCompania);
			
			
			this.jTableDatosTipoCompaniaOrderBy = new JTableMe();        
			this.jTableDatosTipoCompaniaOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosTipoCompaniaOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosTipoCompaniaOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosTipoCompaniaOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosTipoCompaniaOrderBy.setViewportView(this.jTableDatosTipoCompaniaOrderBy);
			this.jTableDatosTipoCompaniaOrderBy.setFillsViewportHeight(true);
			this.jTableDatosTipoCompaniaOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByTipoCompania= new OrderByJInternalFrame();
			this.jInternalFrameOrderByTipoCompania= new OrderByJInternalFrame();
			this.jScrollPanelOrderByTipoCompania = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteTipoCompania= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByTipoCompania.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByTipoCompania.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByTipoCompania.setTitle("Orden");
			this.jInternalFrameOrderByTipoCompania.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByTipoCompania.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByTipoCompania.setResizable(true);
			this.jInternalFrameOrderByTipoCompania.setClosable(true);
			this.jInternalFrameOrderByTipoCompania.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByTipoCompania, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByTipoCompania.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoCompania.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoCompania.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByTipoCompania, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByTipoCompania.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Companias"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsTipoCompania = new GridBagConstraints();
			this.gridBagConstraintsTipoCompania.gridy =iPosYOrderBy++;
			this.gridBagConstraintsTipoCompania.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoCompania.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsTipoCompania.ipady =150;
				
			this.jPanelOrderByTipoCompania.add(jScrollPanelDatosTipoCompaniaOrderBy, this.gridBagConstraintsTipoCompania);//this.jTableDatosTipoCompaniaTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByTipoCompania = new JButtonMe();
			this.jButtonCerrarOrderByTipoCompania.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByTipoCompania,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByTipoCompania.setToolTipText("Cancelar"+" "+TipoCompaniaConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByTipoCompania, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsTipoCompania = new GridBagConstraints();
			this.gridBagConstraintsTipoCompania.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCompania.gridy = iPosYOrderBy++;
			this.gridBagConstraintsTipoCompania.gridx = iPosXOrderBy;
									
			this.jPanelOrderByTipoCompania.add(this.jButtonCerrarOrderByTipoCompania, this.gridBagConstraintsTipoCompania);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalTipoCompania = new GridBagLayout();
			
			this.jScrollPanelOrderByTipoCompania= new JScrollPane(jPanelOrderByTipoCompania,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsTipoCompania = new GridBagConstraints();
			this.gridBagConstraintsTipoCompania.gridy =iPosYOrderBy;
			this.gridBagConstraintsTipoCompania.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoCompania.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByTipoCompania.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByTipoCompania.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalTipoCompania);
			
			this.jInternalFrameOrderByTipoCompania.getContentPane().add(this.jScrollPanelOrderByTipoCompania, this.gridBagConstraintsTipoCompania);			
		
		} else {
			this.jButtonAbrirOrderByTipoCompania = new JButtonMe();
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
			&& this.tipocompaniaSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosTipoCompania.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosTipoCompania.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosTipoCompania.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosTipoCompania.getRowHeight();//TipoCompaniaConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.tipocompaniaSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > TipoCompaniaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoCompania.isSelected()) {
					iHeightTable=TipoCompaniaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoCompaniaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoCompaniaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > TipoCompaniaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoCompania.isSelected()) {
					iHeightTable=TipoCompaniaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoCompaniaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoCompaniaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosTipoCompania.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoCompania.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoCompania.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosTipoCompania.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoCompania.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoCompania.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByTipoCompania!=null && this.jInternalFrameOrderByTipoCompania.getjTableDatosOrderBy()!=null) {
			//if(!this.tipocompaniaSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByTipoCompania.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByTipoCompania.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByTipoCompania.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByTipoCompania.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByTipoCompania.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByTipoCompania.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByTipoCompania.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosTipoCompania.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoCompania.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoCompania.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=tipocompaniaLogic.getTipoCompanias().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipocompanias.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<TipoCompania> TraerTipoCompaniaBeans(List<TipoCompania> tipocompanias,ArrayList<Classe> classes)throws Exception {
		try {
			for(TipoCompania tipocompania:tipocompanias) {
					
				if(!(TipoCompaniaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || TipoCompaniaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					tipocompania.setsDetalleGeneralEntityReporte(TipoCompaniaConstantesFunciones.getTipoCompaniaDescripcion(tipocompania));
										
						
					
					

					if(tipocompania.getDatoConstitucions()!=null && Funciones.existeClass(classes,DatoConstitucion.class)) {
						try{tipocompania.setdatoconstitucionsDescripcionReporte(new JRBeanCollectionDataSource(DatoConstitucionJInternalFrame.TraerDatoConstitucionBeans(tipocompania.getDatoConstitucions(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//tipocompania.setsDetalleGeneralEntityReporte(tipocompania.getsDetalleGeneralEntityReporte());
										
				}
				
				//tipocompaniabeans.add(tipocompaniabean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return tipocompanias;
    }
	//PARA REPORTES FIN
}
