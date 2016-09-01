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
import com.bydan.erp.cartera.util.TipoNacionalidadConstantesFunciones;

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
public class TipoNacionalidadJInternalFrame extends TipoNacionalidadBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarTipoNacionalidad;
	
	protected JMenuBar jmenuBarTipoNacionalidad;
	
	protected JMenu jmenuTipoNacionalidad;
	protected JMenu jmenuDatosTipoNacionalidad;
	protected JMenu jmenuArchivoTipoNacionalidad;
	protected JMenu jmenuAccionesTipoNacionalidad;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosTipoNacionalidad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoNacionalidad;	
	protected GridBagConstraints gridBagConstraintsTipoNacionalidad;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public TipoNacionalidadDetalleFormJInternalFrame jInternalFrameDetalleFormTipoNacionalidad;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoTipoNacionalidad;	
	protected ImportacionJInternalFrame jInternalFrameImportacionTipoNacionalidad;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public TipoNacionalidadSessionBean tiponacionalidadSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<TipoNacionalidad> tiponacionalidads;		
	public List<TipoNacionalidad> tiponacionalidadsEliminados;	
	public List<TipoNacionalidad> tiponacionalidadsAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByTipoNacionalidad;		
	protected JButton jButtonAbrirOrderByTipoNacionalidad;
	
	
	//protected JPanel jPanelOrderByTipoNacionalidad;
	//public JScrollPane jScrollPanelOrderByTipoNacionalidad;	
	//protected JButton jButtonCerrarOrderByTipoNacionalidad;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public TipoNacionalidadLogic tiponacionalidadLogic;
	
	
	
	public JScrollPane jScrollPanelDatosTipoNacionalidad;
	public JScrollPane jScrollPanelDatosEdicionTipoNacionalidad;
	public JScrollPane jScrollPanelDatosGeneralTipoNacionalidad;
    
	
	
	//public JScrollPane jScrollPanelDatosTipoNacionalidadOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoTipoNacionalidad;
	//public JScrollPane jScrollPanelImportacionTipoNacionalidad;
	
	
	
	protected JPanel jPanelAccionesTipoNacionalidad;
	
    protected JPanel jPanelPaginacionTipoNacionalidad;
    protected JPanel jPanelParametrosReportesTipoNacionalidad;
	protected JPanel jPanelParametrosReportesAccionesTipoNacionalidad;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1TipoNacionalidad;
	protected JPanel jPanelParametrosAuxiliar2TipoNacionalidad;
	protected JPanel jPanelParametrosAuxiliar3TipoNacionalidad;
	protected JPanel jPanelParametrosAuxiliar4TipoNacionalidad;
	//protected JPanel jPanelParametrosAuxiliar5TipoNacionalidad;
	
	
	
	//protected JPanel jPanelReporteDinamicoTipoNacionalidad;
	//protected JPanel jPanelImportacionTipoNacionalidad;
	
	
	public JTable jTableDatosTipoNacionalidad;
	
	
	
	//public JTable jTableDatosTipoNacionalidadOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoTipoNacionalidad;
	protected JButton jButtonDuplicarTipoNacionalidad;
	protected JButton jButtonCopiarTipoNacionalidad;
	protected JButton jButtonVerFormTipoNacionalidad;
	protected JButton jButtonNuevoRelacionesTipoNacionalidad;
	protected JButton jButtonModificarTipoNacionalidad;
	
    protected JButton jButtonGuardarCambiosTablaTipoNacionalidad;
	protected JButton jButtonCerrarTipoNacionalidad;
	
	
	protected JButton jButtonRecargarInformacionTipoNacionalidad;
	protected JButton jButtonProcesarInformacionTipoNacionalidad;
	
	
	protected JButton jButtonAnterioresTipoNacionalidad;
	protected JButton jButtonSiguientesTipoNacionalidad;
	protected JButton jButtonNuevoGuardarCambiosTipoNacionalidad;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoTipoNacionalidad;
	//protected JButton jButtonCerrarReporteDinamicoTipoNacionalidad;
	//protected JButton jButtonGenerarExcelReporteDinamicoTipoNacionalidad;	
	
	
	
	//protected JButton jButtonAbrirImportacionTipoNacionalidad;
	//protected JButton jButtonGenerarImportacionTipoNacionalidad;
	//protected JButton jButtonCerrarImportacionTipoNacionalidad;
	//protected JFileChooser jFileChooserImportacionTipoNacionalidad;
	//protected File fileImportacionTipoNacionalidad;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoNacionalidad;
	protected JButton jButtonDuplicarToolBarTipoNacionalidad;
	protected JButton jButtonNuevoRelacionesToolBarTipoNacionalidad;
	
	
	public JButton jButtonGuardarCambiosToolBarTipoNacionalidad;
	protected JButton jButtonCopiarToolBarTipoNacionalidad;
	protected JButton jButtonVerFormToolBarTipoNacionalidad;
	public JButton jButtonGuardarCambiosTablaToolBarTipoNacionalidad;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoNacionalidad;
	protected JButton jButtonCerrarToolBarTipoNacionalidad;
	
	protected JButton jButtonRecargarInformacionToolBarTipoNacionalidad;
	protected JButton jButtonProcesarInformacionToolBarTipoNacionalidad;
	protected JButton jButtonAnterioresToolBarTipoNacionalidad;
	protected JButton jButtonSiguientesToolBarTipoNacionalidad;
	protected JButton jButtonNuevoGuardarCambiosToolBarTipoNacionalidad;
	protected JButton jButtonAbrirOrderByToolBarTipoNacionalidad;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoNacionalidad;
	protected JMenuItem jMenuItemDuplicarTipoNacionalidad;
	protected JMenuItem jMenuItemNuevoRelacionesTipoNacionalidad;
	
	
	protected JMenuItem jMenuItemGuardarCambiosTipoNacionalidad;
	protected JMenuItem jMenuItemCopiarTipoNacionalidad;
	protected JMenuItem jMenuItemVerFormTipoNacionalidad;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoNacionalidad;
	protected JMenuItem jMenuItemCerrarTipoNacionalidad;
	protected JMenuItem jMenuItemDetalleCerrarTipoNacionalidad;
	protected JMenuItem jMenuItemDetalleAbrirOrderByTipoNacionalidad;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoNacionalidad;
	
	protected JMenuItem jMenuItemRecargarInformacionTipoNacionalidad;
	protected JMenuItem jMenuItemProcesarInformacionTipoNacionalidad;
	protected JMenuItem jMenuItemAnterioresTipoNacionalidad;
	protected JMenuItem jMenuItemSiguientesTipoNacionalidad;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoNacionalidad;
	protected JMenuItem jMenuItemAbrirOrderByTipoNacionalidad;
	protected JMenuItem jMenuItemMostrarOcultarTipoNacionalidad;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoNacionalidad;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosTipoNacionalidad;
	protected JCheckBox jCheckBoxSeleccionadosTipoNacionalidad;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaTipoNacionalidad;
	protected JCheckBox jCheckBoxConGraficoReporteTipoNacionalidad;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesTipoNacionalidad;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesTipoNacionalidad;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoTipoNacionalidad;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoTipoNacionalidad;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesTipoNacionalidad;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionTipoNacionalidad;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoNacionalidad;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoNacionalidad;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarTipoNacionalidad;
	protected JTextField jTextFieldValorCampoGeneralTipoNacionalidad;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteTipoNacionalidad;
	//public JList<Reporte> jListColumnasSelectReporteTipoNacionalidad;
	//public JScrollPane jScrollColumnasSelectReporteTipoNacionalidad;
	
	//public JLabel jLabelRelacionesSelectReporteTipoNacionalidad;
	//public JList<Reporte> jListRelacionesSelectReporteTipoNacionalidad;
	//public JScrollPane jScrollRelacionesSelectReporteTipoNacionalidad;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoTipoNacionalidad;
	//protected JCheckBox jCheckBoxConGraficoDinamicoTipoNacionalidad;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoTipoNacionalidad;
	//public JLabel jLabelTiposArchivoReporteDinamicoTipoNacionalidad;
	
		
	//public JLabel jLabelArchivoImportacionTipoNacionalidad;	
	//public JLabel jLabelPathArchivoImportacionTipoNacionalidad;
	//protected JTextField jTextFieldPathArchivoImportacionTipoNacionalidad;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoTipoNacionalidad;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoTipoNacionalidad;
	
	//public JLabel jLabelColumnaCategoriaValorTipoNacionalidad;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorTipoNacionalidad;
	
	//public JLabel jLabelColumnasValoresGraficoTipoNacionalidad;
	//public JList<Reporte> jListColumnasValoresGraficoTipoNacionalidad;
	//public JScrollPane jScrollColumnasValoresGraficoTipoNacionalidad;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoTipoNacionalidad;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoTipoNacionalidad;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasTipoNacionalidad;
	
	
	
	
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
	public TipoNacionalidadJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("TipoNacionalidad No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoNacionalidadJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoNacionalidad No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoNacionalidadJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoNacionalidad No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoNacionalidadJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoNacionalidad No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionTipoNacionalidad)	{
		this.jButtonRecargarInformacionTipoNacionalidad = jButtonRecargarInformacionTipoNacionalidad;
	}
	
	public JButton getjButtonProcesarInformacionTipoNacionalidad() {
		return this.jButtonProcesarInformacionTipoNacionalidad;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoNacionalidad)	{
		this.jButtonProcesarInformacionTipoNacionalidad = jButtonProcesarInformacionTipoNacionalidad;
	}
	
	
	public JButton getjButtonRecargarInformacionTipoNacionalidad() {
		return this.jButtonRecargarInformacionTipoNacionalidad;
	}
	
	
	public List<TipoNacionalidad> gettiponacionalidads() {
		return this.tiponacionalidads;
	}

	public void settiponacionalidads(List<TipoNacionalidad> tiponacionalidads) {
		this.tiponacionalidads = tiponacionalidads;
	}
	
	public List<TipoNacionalidad> gettiponacionalidadsAux() {
		return this.tiponacionalidadsAux;
	}

	public void settiponacionalidadsAux(List<TipoNacionalidad> tiponacionalidadsAux) {
		this.tiponacionalidadsAux = tiponacionalidadsAux;
	}
	
	public List<TipoNacionalidad> gettiponacionalidadsEliminados() {
		return this.tiponacionalidadsEliminados;
	}

	public void setTipoNacionalidadsEliminados(List<TipoNacionalidad> tiponacionalidadsEliminados) {
		this.tiponacionalidadsEliminados = tiponacionalidadsEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarTipoNacionalidad() {
		return jComboBoxTiposSeleccionarTipoNacionalidad;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarTipoNacionalidad(
			JComboBox jComboBoxTiposSeleccionarTipoNacionalidad) {
		this.jComboBoxTiposSeleccionarTipoNacionalidad = jComboBoxTiposSeleccionarTipoNacionalidad;
	}
	
	public void setBorderResaltarTiposSeleccionarTipoNacionalidad() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarTipoNacionalidad.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarTipoNacionalidad .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralTipoNacionalidad() {
		return jTextFieldValorCampoGeneralTipoNacionalidad;
	}

	public void setjTextFieldValorCampoGeneralTipoNacionalidad(
			JTextField jTextFieldValorCampoGeneralTipoNacionalidad) {
		this.jTextFieldValorCampoGeneralTipoNacionalidad = jTextFieldValorCampoGeneralTipoNacionalidad;
	}

	public void setBorderResaltarValorCampoGeneralTipoNacionalidad() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoNacionalidad.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralTipoNacionalidad .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosTipoNacionalidad() {
		return this.jCheckBoxSeleccionarTodosTipoNacionalidad;
	}

	public void setjCheckBoxSeleccionarTodosTipoNacionalidad(
			JCheckBox jCheckBoxSeleccionarTodosTipoNacionalidad) {
		this.jCheckBoxSeleccionarTodosTipoNacionalidad = jCheckBoxSeleccionarTodosTipoNacionalidad;
	}

	public void setBorderResaltarSeleccionarTodosTipoNacionalidad() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoNacionalidad.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosTipoNacionalidad .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosTipoNacionalidad() {
		return this.jCheckBoxSeleccionadosTipoNacionalidad;
	}

	public void setjCheckBoxSeleccionadosTipoNacionalidad(
			JCheckBox jCheckBoxSeleccionadosTipoNacionalidad) {
		this.jCheckBoxSeleccionadosTipoNacionalidad = jCheckBoxSeleccionadosTipoNacionalidad;
	}
	
	public void setBorderResaltarSeleccionadosTipoNacionalidad() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoNacionalidad.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosTipoNacionalidad .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesTipoNacionalidad() {
		return this.jComboBoxTiposArchivosReportesTipoNacionalidad;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesTipoNacionalidad(
			JComboBox jComboBoxTiposArchivosReportesTipoNacionalidad) {
		this.jComboBoxTiposArchivosReportesTipoNacionalidad = jComboBoxTiposArchivosReportesTipoNacionalidad;
	}

	public void setBorderResaltarTiposArchivosReportesTipoNacionalidad() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoNacionalidad.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesTipoNacionalidad .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesTipoNacionalidad() {
		return this.jComboBoxTiposReportesTipoNacionalidad;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesTipoNacionalidad(
			JComboBox jComboBoxTiposReportesTipoNacionalidad) {
		this.jComboBoxTiposReportesTipoNacionalidad = jComboBoxTiposReportesTipoNacionalidad;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoTipoNacionalidad() {
	//	return jComboBoxTiposReportesDinamicoTipoNacionalidad;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoTipoNacionalidad(
	//		JComboBox jComboBoxTiposReportesDinamicoTipoNacionalidad) {
	//	this.jComboBoxTiposReportesDinamicoTipoNacionalidad = jComboBoxTiposReportesDinamicoTipoNacionalidad;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoTipoNacionalidad() {
	//	return jComboBoxTiposArchivosReportesDinamicoTipoNacionalidad;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoTipoNacionalidad(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoTipoNacionalidad) {
	//	this.jComboBoxTiposArchivosReportesDinamicoTipoNacionalidad = jComboBoxTiposArchivosReportesDinamicoTipoNacionalidad;
	//}
	
	public void setBorderResaltarTiposReportesTipoNacionalidad() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoNacionalidad.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesTipoNacionalidad .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesTipoNacionalidad() {
		return this.jComboBoxTiposGraficosReportesTipoNacionalidad;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesTipoNacionalidad(
			JComboBox jComboBoxTiposGraficosReportesTipoNacionalidad) {
		this.jComboBoxTiposGraficosReportesTipoNacionalidad = jComboBoxTiposGraficosReportesTipoNacionalidad;
	}
	
	public void setBorderResaltarTiposGraficosReportesTipoNacionalidad() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoNacionalidad.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesTipoNacionalidad .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionTipoNacionalidad() {
		return this.jComboBoxTiposPaginacionTipoNacionalidad;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionTipoNacionalidad(
			JComboBox jComboBoxTiposPaginacionTipoNacionalidad) {
		this.jComboBoxTiposPaginacionTipoNacionalidad = jComboBoxTiposPaginacionTipoNacionalidad;
	}
	
	public void setBorderResaltarTiposPaginacionTipoNacionalidad() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoNacionalidad.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionTipoNacionalidad .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesTipoNacionalidad() {
		return this.jComboBoxTiposRelacionesTipoNacionalidad;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoNacionalidad() {
		return this.jComboBoxTiposAccionesTipoNacionalidad;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoNacionalidad(
			JComboBox jComboBoxTiposRelacionesTipoNacionalidad) {
		this.jComboBoxTiposRelacionesTipoNacionalidad = jComboBoxTiposRelacionesTipoNacionalidad;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoNacionalidad(
			JComboBox jComboBoxTiposAccionesTipoNacionalidad) {
		this.jComboBoxTiposAccionesTipoNacionalidad = jComboBoxTiposAccionesTipoNacionalidad;
	}
	
	public void setBorderResaltarTiposRelacionesTipoNacionalidad() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoNacionalidad.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesTipoNacionalidad .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesTipoNacionalidad() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoNacionalidad.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesTipoNacionalidad .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoTipoNacionalidad() {
	//	return jCheckBoxConGraficoDinamicoTipoNacionalidad;
	//}

	//public void setjCheckBoxConGraficoDinamicoTipoNacionalidad(
	//		JCheckBox jCheckBoxConGraficoDinamicoTipoNacionalidad) {
	//	this.jCheckBoxConGraficoDinamicoTipoNacionalidad = jCheckBoxConGraficoDinamicoTipoNacionalidad;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoTipoNacionalidad() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarTipoNacionalidad.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoTipoNacionalidad .setBorder(borderResaltar);		
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
		this.tiponacionalidadSessionBean=new TipoNacionalidadSessionBean();
		
		this.tiponacionalidadSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tiponacionalidadSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tiponacionalidadSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=TipoNacionalidadJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=TipoNacionalidadJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoNacionalidadJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoNacionalidadJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoNacionalidadJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Nacionalidad MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.tiponacionalidadSessionBean.getEsGuardarRelacionado()) {
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
		
		TipoNacionalidadJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("TipoNacionalidad No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarTipoNacionalidad= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarTipoNacionalidad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarTipoNacionalidad,this.jTtoolBarTipoNacionalidad,
							"nuevo","nuevo","Nuevo"+" "+TipoNacionalidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoNacionalidad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarTipoNacionalidad,this.jTtoolBarTipoNacionalidad,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoNacionalidad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarTipoNacionalidad,this.jTtoolBarTipoNacionalidad,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+TipoNacionalidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarTipoNacionalidad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarTipoNacionalidad,this.jTtoolBarTipoNacionalidad,
							"duplicar","duplicar","Duplicar"+" "+TipoNacionalidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarTipoNacionalidad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarTipoNacionalidad,this.jTtoolBarTipoNacionalidad,
							"copiar","copiar","Copiar"+" "+TipoNacionalidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarTipoNacionalidad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarTipoNacionalidad,this.jTtoolBarTipoNacionalidad,
							"ver_form","ver_form","Ver"+" "+TipoNacionalidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarTipoNacionalidad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoNacionalidad,this.jTtoolBarTipoNacionalidad,
							"recargar","recargar","Recargar"+" "+TipoNacionalidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarTipoNacionalidad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoNacionalidad,this.jTtoolBarTipoNacionalidad,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarTipoNacionalidad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoNacionalidad,this.jTtoolBarTipoNacionalidad,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarTipoNacionalidad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarTipoNacionalidad,this.jTtoolBarTipoNacionalidad,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarTipoNacionalidad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarTipoNacionalidad,this.jTtoolBarTipoNacionalidad,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarTipoNacionalidad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarTipoNacionalidad,this.jTtoolBarTipoNacionalidad,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+TipoNacionalidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarTipoNacionalidad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarTipoNacionalidad,this.jTtoolBarTipoNacionalidad,
							"cerrar","cerrar","Salir"+" "+TipoNacionalidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarTipoNacionalidad=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarTipoNacionalidad;
			
				this.jButtonProcesarInformacionToolBarTipoNacionalidad=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarTipoNacionalidad;
				
		//protected JButton jButtonModificarToolBarTipoNacionalidad;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarTipoNacionalidad=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuTipoNacionalidad=new JMenuMe("General");
		this.jmenuArchivoTipoNacionalidad=new JMenuMe("Archivo");
		this.jmenuAccionesTipoNacionalidad=new JMenuMe("Acciones");
		this.jmenuDatosTipoNacionalidad=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoNacionalidad= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoNacionalidad.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoNacionalidad,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoNacionalidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarTipoNacionalidad= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarTipoNacionalidad.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarTipoNacionalidad,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarTipoNacionalidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesTipoNacionalidad= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesTipoNacionalidad.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesTipoNacionalidad,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesTipoNacionalidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosTipoNacionalidad= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoNacionalidad.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoNacionalidad,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoNacionalidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarTipoNacionalidad= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarTipoNacionalidad.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarTipoNacionalidad,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarTipoNacionalidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormTipoNacionalidad= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormTipoNacionalidad.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormTipoNacionalidad,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormTipoNacionalidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaTipoNacionalidad= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaTipoNacionalidad.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaTipoNacionalidad,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaTipoNacionalidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoNacionalidad= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoNacionalidad.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoNacionalidad,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoNacionalidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionTipoNacionalidad= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionTipoNacionalidad.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionTipoNacionalidad,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionTipoNacionalidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionTipoNacionalidad= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionTipoNacionalidad.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionTipoNacionalidad,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresTipoNacionalidad= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresTipoNacionalidad.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresTipoNacionalidad,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresTipoNacionalidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesTipoNacionalidad= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesTipoNacionalidad.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesTipoNacionalidad,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesTipoNacionalidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByTipoNacionalidad= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByTipoNacionalidad.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByTipoNacionalidad,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByTipoNacionalidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoNacionalidad= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoNacionalidad.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoNacionalidad,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoNacionalidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByTipoNacionalidad= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByTipoNacionalidad.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByTipoNacionalidad,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByTipoNacionalidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoNacionalidad= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoNacionalidad.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoNacionalidad,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoNacionalidad, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosTipoNacionalidad= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosTipoNacionalidad.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosTipoNacionalidad,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosTipoNacionalidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoTipoNacionalidad.add(this.jMenuItemCerrarTipoNacionalidad);
			
			this.jmenuAccionesTipoNacionalidad.add(this.jMenuItemNuevoTipoNacionalidad);
			this.jmenuAccionesTipoNacionalidad.add(this.jMenuItemNuevoGuardarCambiosTipoNacionalidad);
			this.jmenuAccionesTipoNacionalidad.add(this.jMenuItemNuevoRelacionesTipoNacionalidad);
			this.jmenuAccionesTipoNacionalidad.add(this.jMenuItemGuardarCambiosTablaTipoNacionalidad);		
			this.jmenuAccionesTipoNacionalidad.add(this.jMenuItemDuplicarTipoNacionalidad);		
			this.jmenuAccionesTipoNacionalidad.add(this.jMenuItemCopiarTipoNacionalidad);		
			this.jmenuAccionesTipoNacionalidad.add(this.jMenuItemVerFormTipoNacionalidad);		
			
			this.jmenuDatosTipoNacionalidad.add(this.jMenuItemRecargarInformacionTipoNacionalidad);				
			this.jmenuDatosTipoNacionalidad.add(this.jMenuItemAnterioresTipoNacionalidad);				
			this.jmenuDatosTipoNacionalidad.add(this.jMenuItemSiguientesTipoNacionalidad);				
			this.jmenuDatosTipoNacionalidad.add(this.jMenuItemAbrirOrderByTipoNacionalidad);				
			this.jmenuDatosTipoNacionalidad.add(this.jMenuItemMostrarOcultarTipoNacionalidad);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesTipoNacionalidad.add(this.jMenuItemGuardarCambiosTipoNacionalidad);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoTipoNacionalidad, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesTipoNacionalidad, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosTipoNacionalidad, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarTipoNacionalidad.add(this.jmenuArchivoTipoNacionalidad);		
			this.jmenuBarTipoNacionalidad.add(this.jmenuAccionesTipoNacionalidad);		
			this.jmenuBarTipoNacionalidad.add(this.jmenuDatosTipoNacionalidad);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarTipoNacionalidad);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasTipoNacionalidad() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		

		this.jTabbedPaneBusquedasTipoNacionalidad=new JTabbedPane();


		this.jTabbedPaneBusquedasTipoNacionalidad.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoNacionalidad.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoNacionalidad.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasTipoNacionalidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasTipoNacionalidad.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasTipoNacionalidad,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleTipoNacionalidad = new TipoNacionalidadDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Tipo Nacionalidad DATOS");
			this.jInternalFrameDetalleFormTipoNacionalidad = new TipoNacionalidadDetalleFormJInternalFrame(jDesktopPane,this.tiponacionalidadSessionBean.getConGuardarRelaciones(),this.tiponacionalidadSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormTipoNacionalidad = null;//new TipoNacionalidadDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoNacionalidad= new GridBagLayout();
		
		
		this.jTableDatosTipoNacionalidad = new JTableMe();      
		
		String sToolTipTipoNacionalidad="";
		sToolTipTipoNacionalidad=TipoNacionalidadConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoNacionalidad+="(Cartera.TipoNacionalidad)";
		}
		
		if(!this.tiponacionalidadSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoNacionalidad+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosTipoNacionalidad.setToolTipText(sToolTipTipoNacionalidad);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosTipoNacionalidad);
		this.jTableDatosTipoNacionalidad.setAutoCreateRowSorter(true);
		this.jTableDatosTipoNacionalidad.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosTipoNacionalidad.setRowSelectionAllowed(true);
		this.jTableDatosTipoNacionalidad.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosTipoNacionalidad,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoTipoNacionalidad = new JButtonMe();
		this.jButtonDuplicarTipoNacionalidad = new JButtonMe();
		this.jButtonCopiarTipoNacionalidad = new JButtonMe();
		this.jButtonVerFormTipoNacionalidad = new JButtonMe();
		this.jButtonNuevoRelacionesTipoNacionalidad = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaTipoNacionalidad = new JButtonMe();
		this.jButtonCerrarTipoNacionalidad = new JButtonMe();
		
		this.jScrollPanelDatosTipoNacionalidad = new JScrollPane();   
        this.jScrollPanelDatosGeneralTipoNacionalidad = new JScrollPane();
		
				
		
		
		this.jPanelAccionesTipoNacionalidad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Nacionalidad";
		
		if(!this.tiponacionalidadSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoNacionalidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Nacionalidades" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoNacionalidad.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralTipoNacionalidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesTipoNacionalidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoNacionalidad.setToolTipText("Acciones");
        this.jPanelAccionesTipoNacionalidad.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoNacionalidad, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoNacionalidad, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoTipoNacionalidad=new ReporteDinamicoJInternalFrame(TipoNacionalidadConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoTipoNacionalidad();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionTipoNacionalidad=new ImportacionJInternalFrame(TipoNacionalidadConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionTipoNacionalidad();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByTipoNacionalidad = new JButtonMe();
		
		this.jButtonAbrirOrderByTipoNacionalidad.setText("Orden");
		this.jButtonAbrirOrderByTipoNacionalidad.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoNacionalidad,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoNacionalidad, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByTipoNacionalidad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByTipoNacionalidad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoNacionalidad=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoNacionalidad,false,this);
			
			//this.cargarOrderByTipoNacionalidad(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoNacionalidad=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoNacionalidad,true,this);
			
			//this.cargarOrderByTipoNacionalidad(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosTipoNacionalidad.setMinimumSize(new Dimension(400,50));//430
		this.jTableDatosTipoNacionalidad.setMaximumSize(new Dimension(400,50));//430
		this.jTableDatosTipoNacionalidad.setPreferredSize(new Dimension(400,50));//430
		
		this.jScrollPanelDatosTipoNacionalidad.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoNacionalidad.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoNacionalidad.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoTipoNacionalidad.setText("Nuevo");
		this.jButtonDuplicarTipoNacionalidad.setText("Duplicar");
		this.jButtonCopiarTipoNacionalidad.setText("Copiar");
		this.jButtonVerFormTipoNacionalidad.setText("Ver");
		this.jButtonNuevoRelacionesTipoNacionalidad.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaTipoNacionalidad.setText("Guardar");
		this.jButtonCerrarTipoNacionalidad.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoNacionalidad,"nuevo_button","Nuevo",this.tiponacionalidadSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarTipoNacionalidad,"duplicar_button","Duplicar",this.tiponacionalidadSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarTipoNacionalidad,"copiar_button","Copiar",this.tiponacionalidadSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormTipoNacionalidad,"ver_form","Ver",this.tiponacionalidadSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesTipoNacionalidad,"nuevorelaciones_button","Nuevo Rel",this.tiponacionalidadSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoNacionalidad,"guardarcambiostabla_button","Guardar",this.tiponacionalidadSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoNacionalidad,"cerrar_button","Salir",this.tiponacionalidadSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoNacionalidad, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarTipoNacionalidad, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarTipoNacionalidad, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormTipoNacionalidad, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesTipoNacionalidad, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoNacionalidad, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoNacionalidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoTipoNacionalidad.setToolTipText("Nuevo"+" "+TipoNacionalidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarTipoNacionalidad.setToolTipText("Duplicar"+" "+TipoNacionalidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarTipoNacionalidad.setToolTipText("Copiar"+" "+TipoNacionalidadConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormTipoNacionalidad.setToolTipText("Ver"+" "+TipoNacionalidadConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesTipoNacionalidad.setToolTipText("Nuevo Rel"+" "+TipoNacionalidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaTipoNacionalidad.setToolTipText("Guardar"+" "+TipoNacionalidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoNacionalidad.setToolTipText("Salir"+" "+TipoNacionalidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoNacionalidad";
		inputMap = this.jButtonNuevoTipoNacionalidad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoNacionalidad.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoNacionalidad"));
		
		//DUPLICAR
		sMapKey = "DuplicarTipoNacionalidad";
		inputMap = this.jButtonDuplicarTipoNacionalidad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarTipoNacionalidad.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarTipoNacionalidad"));
		
		//COPIAR
		sMapKey = "CopiarTipoNacionalidad";
		inputMap = this.jButtonCopiarTipoNacionalidad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarTipoNacionalidad.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarTipoNacionalidad"));
		
		//VEr FORM
		sMapKey = "VerFormTipoNacionalidad";
		inputMap = this.jButtonVerFormTipoNacionalidad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormTipoNacionalidad.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormTipoNacionalidad"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesTipoNacionalidad";
		inputMap = this.jButtonNuevoRelacionesTipoNacionalidad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesTipoNacionalidad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesTipoNacionalidad"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarTipoNacionalidad";
		inputMap = this.jButtonModificarTipoNacionalidad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarTipoNacionalidad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarTipoNacionalidad"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarTipoNacionalidad";
		inputMap = this.jButtonCerrarTipoNacionalidad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoNacionalidad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoNacionalidad"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoNacionalidad";
		inputMap = this.jButtonGuardarCambiosTablaTipoNacionalidad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoNacionalidad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoNacionalidad"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesTipoNacionalidad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesTipoNacionalidad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionTipoNacionalidad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1TipoNacionalidad= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2TipoNacionalidad= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3TipoNacionalidad= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4TipoNacionalidad= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5TipoNacionalidad= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesTipoNacionalidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesTipoNacionalidad.setName("jPanelParametrosReportesTipoNacionalidad"); 
		
		this.jPanelParametrosReportesAccionesTipoNacionalidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesTipoNacionalidad.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesTipoNacionalidad.setName("jPanelParametrosReportesAccionesTipoNacionalidad"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesTipoNacionalidad, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesTipoNacionalidad, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionTipoNacionalidad = new JButtonMe();
		this.jButtonRecargarInformacionTipoNacionalidad.setText("Recargar");
		this.jButtonRecargarInformacionTipoNacionalidad.setToolTipText("Recargar"+" "+TipoNacionalidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionTipoNacionalidad,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionTipoNacionalidad = new JButtonMe();
		this.jButtonProcesarInformacionTipoNacionalidad.setText("Procesar");
		this.jButtonProcesarInformacionTipoNacionalidad.setToolTipText("Procesar"+" "+TipoNacionalidadConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionTipoNacionalidad.setVisible(false);
			
		this.jButtonProcesarInformacionTipoNacionalidad.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoNacionalidad.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoNacionalidad.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesTipoNacionalidad = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoNacionalidad.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesTipoNacionalidad.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesTipoNacionalidad = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoNacionalidad.setText("TIPO");       
		this.jComboBoxTiposReportesTipoNacionalidad.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesTipoNacionalidad = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoNacionalidad.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesTipoNacionalidad.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionTipoNacionalidad = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionTipoNacionalidad.setText("Paginacion");
		this.jComboBoxTiposPaginacionTipoNacionalidad.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesTipoNacionalidad = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesTipoNacionalidad.setText("Accion");
		this.jComboBoxTiposRelacionesTipoNacionalidad.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesTipoNacionalidad = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoNacionalidad.setText("Accion");
		this.jComboBoxTiposAccionesTipoNacionalidad.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarTipoNacionalidad = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarTipoNacionalidad.setText("Accion");
		this.jComboBoxTiposSeleccionarTipoNacionalidad.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralTipoNacionalidad=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralTipoNacionalidad.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoNacionalidad.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoNacionalidad.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesTipoNacionalidad = new JLabelMe();
		
		this.jLabelAccionesTipoNacionalidad.setText("Acciones");		
		this.jLabelAccionesTipoNacionalidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoNacionalidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoNacionalidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosTipoNacionalidad = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosTipoNacionalidad.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosTipoNacionalidad.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosTipoNacionalidad = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosTipoNacionalidad.setText("Seleccionados");
		this.jCheckBoxSeleccionadosTipoNacionalidad.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaTipoNacionalidad = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaTipoNacionalidad.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaTipoNacionalidad.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteTipoNacionalidad = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteTipoNacionalidad.setText("Graf.");
		this.jCheckBoxConGraficoReporteTipoNacionalidad.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresTipoNacionalidad = new JButtonMe();
		//this.jButtonAnterioresTipoNacionalidad.setText("<<");
        this.jButtonAnterioresTipoNacionalidad.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresTipoNacionalidad,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresTipoNacionalidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesTipoNacionalidad = new JButtonMe();
		//this.jButtonSiguientesTipoNacionalidad.setText(">>");
        this.jButtonSiguientesTipoNacionalidad.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesTipoNacionalidad,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesTipoNacionalidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosTipoNacionalidad = new JButtonMe();
		this.jButtonNuevoGuardarCambiosTipoNacionalidad.setText("Nue");
        this.jButtonNuevoGuardarCambiosTipoNacionalidad.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosTipoNacionalidad,"nuevoguardarcambios_button","Nue",this.tiponacionalidadSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosTipoNacionalidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosTipoNacionalidad";
		inputMap = this.jButtonNuevoGuardarCambiosTipoNacionalidad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosTipoNacionalidad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosTipoNacionalidad"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionTipoNacionalidad";
		inputMap = this.jButtonRecargarInformacionTipoNacionalidad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionTipoNacionalidad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionTipoNacionalidad"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesTipoNacionalidad";
		inputMap = this.jButtonSiguientesTipoNacionalidad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesTipoNacionalidad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesTipoNacionalidad"));
		
		//ANTERIORES		
		sMapKey = "AnterioresTipoNacionalidad";
		inputMap = this.jButtonAnterioresTipoNacionalidad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresTipoNacionalidad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresTipoNacionalidad"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasTipoNacionalidad();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesTipoNacionalidad.setMinimumSize(new Dimension(this.getWidth(),TipoNacionalidadBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoNacionalidadBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoNacionalidad.setMaximumSize(new Dimension(this.getWidth(),TipoNacionalidadBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoNacionalidadBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoNacionalidad.setPreferredSize(new Dimension(this.getWidth(),TipoNacionalidadBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoNacionalidadBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionTipoNacionalidad = new GridBagLayout();

			this.jPanelPaginacionTipoNacionalidad.setLayout(gridaBagLayoutPaginacionTipoNacionalidad);						
			
			this.gridBagConstraintsTipoNacionalidad = new GridBagConstraints();
			this.gridBagConstraintsTipoNacionalidad.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsTipoNacionalidad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoNacionalidad.gridy = 0;
			this.gridBagConstraintsTipoNacionalidad.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionTipoNacionalidad.add(this.jButtonAnterioresTipoNacionalidad, this.gridBagConstraintsTipoNacionalidad);
					
						
			this.gridBagConstraintsTipoNacionalidad = new GridBagConstraints();
			this.gridBagConstraintsTipoNacionalidad.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoNacionalidad.gridy = 0;
			
			this.jPanelPaginacionTipoNacionalidad.add(this.jButtonNuevoGuardarCambiosTipoNacionalidad, this.gridBagConstraintsTipoNacionalidad);
						
			
			this.gridBagConstraintsTipoNacionalidad = new GridBagConstraints();
			this.gridBagConstraintsTipoNacionalidad.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsTipoNacionalidad.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoNacionalidad.gridy = 0;
			this.jPanelPaginacionTipoNacionalidad.add(this.jButtonSiguientesTipoNacionalidad, this.gridBagConstraintsTipoNacionalidad);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsTipoNacionalidad = new GridBagConstraints();
			this.gridBagConstraintsTipoNacionalidad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoNacionalidad.gridy = 1;
			this.gridBagConstraintsTipoNacionalidad.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoNacionalidad.add(this.jButtonNuevoTipoNacionalidad, this.gridBagConstraintsTipoNacionalidad);
						
			
			
			if(!this.tiponacionalidadSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsTipoNacionalidad = new GridBagConstraints();
				this.gridBagConstraintsTipoNacionalidad.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoNacionalidad.gridy = 1;
				this.gridBagConstraintsTipoNacionalidad.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionTipoNacionalidad.add(this.jButtonGuardarCambiosTablaTipoNacionalidad, this.gridBagConstraintsTipoNacionalidad);
			}
			
			
			
			this.gridBagConstraintsTipoNacionalidad = new GridBagConstraints();
			this.gridBagConstraintsTipoNacionalidad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoNacionalidad.gridy = 1;
			this.gridBagConstraintsTipoNacionalidad.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoNacionalidad.add(this.jButtonDuplicarTipoNacionalidad, this.gridBagConstraintsTipoNacionalidad);
			
			this.gridBagConstraintsTipoNacionalidad = new GridBagConstraints();
			this.gridBagConstraintsTipoNacionalidad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoNacionalidad.gridy = 1;
			this.gridBagConstraintsTipoNacionalidad.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoNacionalidad.add(this.jButtonCopiarTipoNacionalidad, this.gridBagConstraintsTipoNacionalidad);
		
			this.gridBagConstraintsTipoNacionalidad = new GridBagConstraints();
			this.gridBagConstraintsTipoNacionalidad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoNacionalidad.gridy = 1;
			this.gridBagConstraintsTipoNacionalidad.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoNacionalidad.add(this.jButtonVerFormTipoNacionalidad, this.gridBagConstraintsTipoNacionalidad);
		
			this.gridBagConstraintsTipoNacionalidad = new GridBagConstraints();
			this.gridBagConstraintsTipoNacionalidad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoNacionalidad.gridy = 1;
			this.gridBagConstraintsTipoNacionalidad.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionTipoNacionalidad.add(this.jButtonCerrarTipoNacionalidad, this.gridBagConstraintsTipoNacionalidad);
		
		
		
		this.jButtonRecargarInformacionTipoNacionalidad.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoNacionalidad.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoNacionalidad.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionTipoNacionalidad, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesTipoNacionalidad.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoNacionalidad.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoNacionalidad.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesTipoNacionalidad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesTipoNacionalidad.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoNacionalidad.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoNacionalidad.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesTipoNacionalidad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesTipoNacionalidad.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoNacionalidad.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoNacionalidad.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesTipoNacionalidad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionTipoNacionalidad.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoNacionalidad.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoNacionalidad.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionTipoNacionalidad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesTipoNacionalidad.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoNacionalidad.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoNacionalidad.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesTipoNacionalidad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesTipoNacionalidad.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoNacionalidad.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoNacionalidad.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoNacionalidad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarTipoNacionalidad.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoNacionalidad.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoNacionalidad.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarTipoNacionalidad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaTipoNacionalidad.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoNacionalidad.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoNacionalidad.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaTipoNacionalidad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteTipoNacionalidad.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoNacionalidad.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoNacionalidad.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteTipoNacionalidad, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosTipoNacionalidad.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoNacionalidad.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoNacionalidad.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosTipoNacionalidad, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosTipoNacionalidad.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoNacionalidad.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoNacionalidad.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosTipoNacionalidad, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesTipoNacionalidad = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesTipoNacionalidad = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1TipoNacionalidad = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2TipoNacionalidad = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3TipoNacionalidad = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4TipoNacionalidad = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesTipoNacionalidad.setLayout(gridaBagParametrosReportesTipoNacionalidad);
			this.jPanelParametrosReportesAccionesTipoNacionalidad.setLayout(gridaBagParametrosReportesAccionesTipoNacionalidad);
			
			
			this.jPanelParametrosAuxiliar1TipoNacionalidad.setLayout(gridaBagParametrosAuxiliar1TipoNacionalidad);
			this.jPanelParametrosAuxiliar2TipoNacionalidad.setLayout(gridaBagParametrosAuxiliar2TipoNacionalidad);
			this.jPanelParametrosAuxiliar3TipoNacionalidad.setLayout(gridaBagParametrosAuxiliar3TipoNacionalidad);
			this.jPanelParametrosAuxiliar4TipoNacionalidad.setLayout(gridaBagParametrosAuxiliar4TipoNacionalidad);
			//this.jPanelParametrosAuxiliar5TipoNacionalidad.setLayout(gridaBagParametrosAuxiliar2TipoNacionalidad);			
			
			
			
			
			this.gridBagConstraintsTipoNacionalidad = new GridBagConstraints();
			this.gridBagConstraintsTipoNacionalidad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoNacionalidad.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoNacionalidad.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoNacionalidad.add(this.jButtonRecargarInformacionTipoNacionalidad, this.gridBagConstraintsTipoNacionalidad);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsTipoNacionalidad = new GridBagConstraints();
			this.gridBagConstraintsTipoNacionalidad.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoNacionalidad.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoNacionalidad.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoNacionalidad.add(this.jComboBoxTiposPaginacionTipoNacionalidad, this.gridBagConstraintsTipoNacionalidad);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsTipoNacionalidad = new GridBagConstraints();
			this.gridBagConstraintsTipoNacionalidad.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoNacionalidad.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoNacionalidad.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoNacionalidad.add(this.jCheckBoxConAltoMaximoTablaTipoNacionalidad, this.gridBagConstraintsTipoNacionalidad);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsTipoNacionalidad = new GridBagConstraints();
			this.gridBagConstraintsTipoNacionalidad.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoNacionalidad.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoNacionalidad.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoNacionalidad.add(this.jComboBoxTiposArchivosReportesTipoNacionalidad, this.gridBagConstraintsTipoNacionalidad);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsTipoNacionalidad = new GridBagConstraints();
			this.gridBagConstraintsTipoNacionalidad.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoNacionalidad.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoNacionalidad.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoNacionalidad.add(this.jPanelParametrosAuxiliar1TipoNacionalidad, this.gridBagConstraintsTipoNacionalidad);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsTipoNacionalidad = new GridBagConstraints();
			this.gridBagConstraintsTipoNacionalidad.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoNacionalidad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoNacionalidad.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoNacionalidad.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4TipoNacionalidad.add(this.jComboBoxTiposReportesTipoNacionalidad, this.gridBagConstraintsTipoNacionalidad);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsTipoNacionalidad = new GridBagConstraints();
			this.gridBagConstraintsTipoNacionalidad.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoNacionalidad.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoNacionalidad.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoNacionalidad.add(this.jPanelParametrosAuxiliar4TipoNacionalidad, this.gridBagConstraintsTipoNacionalidad);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsTipoNacionalidad = new GridBagConstraints();
			this.gridBagConstraintsTipoNacionalidad.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoNacionalidad.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoNacionalidad.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoNacionalidad.add(this.jComboBoxTiposReportesTipoNacionalidad, this.gridBagConstraintsTipoNacionalidad);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsTipoNacionalidad = new GridBagConstraints();
			this.gridBagConstraintsTipoNacionalidad.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoNacionalidad.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoNacionalidad.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoNacionalidad.add(this.jCheckBoxGenerarReporteTipoNacionalidad, this.gridBagConstraintsTipoNacionalidad);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsTipoNacionalidad = new GridBagConstraints();
			this.gridBagConstraintsTipoNacionalidad.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoNacionalidad.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoNacionalidad.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoNacionalidad.add(this.jPanelParametrosAuxiliar2TipoNacionalidad, this.gridBagConstraintsTipoNacionalidad);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsTipoNacionalidad = new GridBagConstraints();
			this.gridBagConstraintsTipoNacionalidad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoNacionalidad.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoNacionalidad.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoNacionalidad.add(this.jLabelAccionesTipoNacionalidad, this.gridBagConstraintsTipoNacionalidad);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsTipoNacionalidad = new GridBagConstraints();
				this.gridBagConstraintsTipoNacionalidad.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsTipoNacionalidad.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsTipoNacionalidad.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesTipoNacionalidad.add(this.jButtonAbrirOrderByTipoNacionalidad, this.gridBagConstraintsTipoNacionalidad);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsTipoNacionalidad = new GridBagConstraints();
			this.gridBagConstraintsTipoNacionalidad.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsTipoNacionalidad.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoNacionalidad.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoNacionalidad.add(this.jComboBoxTiposSeleccionarTipoNacionalidad, this.gridBagConstraintsTipoNacionalidad);			
			
			
			/*
			this.gridBagConstraintsTipoNacionalidad = new GridBagConstraints();
			this.gridBagConstraintsTipoNacionalidad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoNacionalidad.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoNacionalidad.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoNacionalidad.add(this.jCheckBoxSeleccionarTodosTipoNacionalidad, this.gridBagConstraintsTipoNacionalidad);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsTipoNacionalidad = new GridBagConstraints();
			this.gridBagConstraintsTipoNacionalidad.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoNacionalidad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoNacionalidad.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoNacionalidad.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoNacionalidad.add(this.jCheckBoxSeleccionarTodosTipoNacionalidad, this.gridBagConstraintsTipoNacionalidad);															
				
			this.gridBagConstraintsTipoNacionalidad = new GridBagConstraints();
			this.gridBagConstraintsTipoNacionalidad.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoNacionalidad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoNacionalidad.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoNacionalidad.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoNacionalidad.add(this.jCheckBoxSeleccionadosTipoNacionalidad, this.gridBagConstraintsTipoNacionalidad);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsTipoNacionalidad = new GridBagConstraints();
			this.gridBagConstraintsTipoNacionalidad.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoNacionalidad.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoNacionalidad.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoNacionalidad.add(this.jPanelParametrosAuxiliar3TipoNacionalidad, this.gridBagConstraintsTipoNacionalidad);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsTipoNacionalidad = new GridBagConstraints();
			this.gridBagConstraintsTipoNacionalidad.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoNacionalidad.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoNacionalidad.add(this.jComboBoxTiposAccionesTipoNacionalidad, this.gridBagConstraintsTipoNacionalidad);
	
				
			this.gridBagConstraintsTipoNacionalidad = new GridBagConstraints();
			this.gridBagConstraintsTipoNacionalidad.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoNacionalidad.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoNacionalidad.add(this.jTextFieldValorCampoGeneralTipoNacionalidad, this.gridBagConstraintsTipoNacionalidad);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosTipoNacionalidad = new GridBagLayout();

			this.jScrollPanelDatosTipoNacionalidad.setLayout(gridaBagLayoutDatosTipoNacionalidad);
			
			this.gridBagConstraintsTipoNacionalidad = new GridBagConstraints();
			this.gridBagConstraintsTipoNacionalidad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoNacionalidad.gridy = 0;
			this.gridBagConstraintsTipoNacionalidad.gridx = 0;
			
			this.jScrollPanelDatosTipoNacionalidad.add(this.jTableDatosTipoNacionalidad, this.gridBagConstraintsTipoNacionalidad);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosTipoNacionalidad.setViewportView(this.jTableDatosTipoNacionalidad);
		this.jTableDatosTipoNacionalidad.setFillsViewportHeight(true);
		this.jTableDatosTipoNacionalidad.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesTipoNacionalidad= new GridBagLayout();
		this.jPanelAccionesTipoNacionalidad.setLayout(gridaBagLayoutAccionesTipoNacionalidad);
		
		
		/*	
		this.gridBagConstraintsTipoNacionalidad = new GridBagConstraints();
		this.gridBagConstraintsTipoNacionalidad.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoNacionalidad.gridy = 0;
		this.gridBagConstraintsTipoNacionalidad.gridx = 0;
			
		this.jPanelAccionesTipoNacionalidad.add(this.jButtonNuevoTipoNacionalidad, this.gridBagConstraintsTipoNacionalidad);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoNacionalidad = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoNacionalidad);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tiponacionalidadSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoNacionalidad = new GridBagConstraints();						
			this.gridBagConstraintsTipoNacionalidad.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoNacionalidad.gridx = 0;		
			//this.gridBagConstraintsTipoNacionalidad.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoNacionalidad.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoNacionalidad.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarTipoNacionalidad, this.gridBagConstraintsTipoNacionalidad);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsTipoNacionalidad = new GridBagConstraints();
		this.gridBagConstraintsTipoNacionalidad.gridy = iGridyPrincipal++;
		this.gridBagConstraintsTipoNacionalidad.gridx = 0;		
		//this.gridBagConstraintsTipoNacionalidad.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoNacionalidad.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsTipoNacionalidad.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsTipoNacionalidad);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsTipoNacionalidad = new GridBagConstraints();
		this.gridBagConstraintsTipoNacionalidad.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoNacionalidad.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesTipoNacionalidad, this.gridBagConstraintsTipoNacionalidad);								
		
		
		/*
		this.gridBagConstraintsTipoNacionalidad = new GridBagConstraints();
		this.gridBagConstraintsTipoNacionalidad.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoNacionalidad.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesTipoNacionalidad, this.gridBagConstraintsTipoNacionalidad);
		*/		
		
		this.gridBagConstraintsTipoNacionalidad = new GridBagConstraints();
		this.gridBagConstraintsTipoNacionalidad.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoNacionalidad.gridx =0;
		this.gridBagConstraintsTipoNacionalidad.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoNacionalidad.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoNacionalidad, this.gridBagConstraintsTipoNacionalidad);
				
		
		this.gridBagConstraintsTipoNacionalidad = new GridBagConstraints();
		this.gridBagConstraintsTipoNacionalidad.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoNacionalidad.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionTipoNacionalidad, this.gridBagConstraintsTipoNacionalidad);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(TipoNacionalidadJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosTipoNacionalidad= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoNacionalidad = new GridBagLayout();
			this.jPanelBusquedasParametrosTipoNacionalidad.setLayout(gridaBagLayoutBusquedasParametrosTipoNacionalidad);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralTipoNacionalidad=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoNacionalidad.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoNacionalidad.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoNacionalidad.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoNacionalidad = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsTipoNacionalidad = new GridBagConstraints();
		this.gridBagConstraintsTipoNacionalidad.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoNacionalidad.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoNacionalidad, this.gridBagConstraintsTipoNacionalidad);
			
			
		this.gridBagConstraintsTipoNacionalidad = new GridBagConstraints();
		this.gridBagConstraintsTipoNacionalidad.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoNacionalidad.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoNacionalidad, this.gridBagConstraintsTipoNacionalidad);
		
			
		this.gridBagConstraintsTipoNacionalidad = new GridBagConstraints();
		this.gridBagConstraintsTipoNacionalidad.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoNacionalidad.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoNacionalidad, this.gridBagConstraintsTipoNacionalidad);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralTipoNacionalidad;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoTipoNacionalidad() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoTipoNacionalidad = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoTipoNacionalidad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoTipoNacionalidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoTipoNacionalidad.setName("jPanelReporteDinamicoTipoNacionalidad"); 
		
		this.jPanelReporteDinamicoTipoNacionalidad.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoNacionalidad.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoNacionalidad.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoTipoNacionalidad.setLayout(gridaBagLayoutReporteDinamicoTipoNacionalidad);
		
		
		this.jInternalFrameReporteDinamicoTipoNacionalidad= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoTipoNacionalidad = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoNacionalidad= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoTipoNacionalidad.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoTipoNacionalidad.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoTipoNacionalidad.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoTipoNacionalidad.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoTipoNacionalidad.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoTipoNacionalidad.setResizable(true);
	    this.jInternalFrameReporteDinamicoTipoNacionalidad.setClosable(true);
	    this.jInternalFrameReporteDinamicoTipoNacionalidad.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoTipoNacionalidad.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoNacionalidad.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoNacionalidad.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoTipoNacionalidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Nacionalidades"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteTipoNacionalidad = new JLabelMe();

		this.jLabelColumnasSelectReporteTipoNacionalidad.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteTipoNacionalidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoNacionalidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoNacionalidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoNacionalidad = new GridBagConstraints();
		this.gridBagConstraintsTipoNacionalidad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoNacionalidad.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoNacionalidad.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoNacionalidad.add(this.jLabelColumnasSelectReporteTipoNacionalidad, this.gridBagConstraintsTipoNacionalidad);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteTipoNacionalidad = new JList<Reporte>();
		this.jListColumnasSelectReporteTipoNacionalidad.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteTipoNacionalidad.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteTipoNacionalidad.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoNacionalidad.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoNacionalidad.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteTipoNacionalidad=new JScrollPane(this.jListColumnasSelectReporteTipoNacionalidad);
			
			this.jScrollColumnasSelectReporteTipoNacionalidad.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoNacionalidad.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoNacionalidad.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteTipoNacionalidad.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTipoNacionalidad = new GridBagConstraints();
		this.gridBagConstraintsTipoNacionalidad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoNacionalidad.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoNacionalidad.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoNacionalidad.add(this.jListColumnasSelectReporteTipoNacionalidad, this.gridBagConstraintsTipoNacionalidad);
		this.jPanelReporteDinamicoTipoNacionalidad.add(this.jScrollColumnasSelectReporteTipoNacionalidad, this.gridBagConstraintsTipoNacionalidad);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteTipoNacionalidad = new JLabelMe();

		this.jLabelRelacionesSelectReporteTipoNacionalidad.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteTipoNacionalidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoNacionalidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoNacionalidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteTipoNacionalidad = new JList<Reporte>();
		this.jListRelacionesSelectReporteTipoNacionalidad.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteTipoNacionalidad.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteTipoNacionalidad.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoNacionalidad.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoNacionalidad.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteTipoNacionalidad=new JScrollPane(this.jListRelacionesSelectReporteTipoNacionalidad);
			
			this.jScrollRelacionesSelectReporteTipoNacionalidad.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoNacionalidad.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoNacionalidad.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteTipoNacionalidad.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoTipoNacionalidad = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoTipoNacionalidad = new JComboBoxMe();
		this.jListColumnasValoresGraficoTipoNacionalidad = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoTipoNacionalidad = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoTipoNacionalidad.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoTipoNacionalidad.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoNacionalidad.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoNacionalidad.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoTipoNacionalidad, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoTipoNacionalidad = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoTipoNacionalidad.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoTipoNacionalidad.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoNacionalidad.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoNacionalidad.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoTipoNacionalidad, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoTipoNacionalidad = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoTipoNacionalidad.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoTipoNacionalidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoNacionalidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoNacionalidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoNacionalidad = new GridBagConstraints();
		this.gridBagConstraintsTipoNacionalidad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoNacionalidad.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoNacionalidad.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoNacionalidad.add(this.jLabelGenerarExcelReporteDinamicoTipoNacionalidad, this.gridBagConstraintsTipoNacionalidad);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoTipoNacionalidad = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoTipoNacionalidad.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoTipoNacionalidad,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoTipoNacionalidad.setToolTipText("Generar EXCEL"+" "+TipoNacionalidadConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsTipoNacionalidad = new GridBagConstraints();
		//this.gridBagConstraintsTipoNacionalidad.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsTipoNacionalidad.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsTipoNacionalidad.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoTipoNacionalidad.add(this.jButtonGenerarExcelReporteDinamicoTipoNacionalidad, this.gridBagConstraintsTipoNacionalidad);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsTipoNacionalidad = new GridBagConstraints();
		this.gridBagConstraintsTipoNacionalidad.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoNacionalidad.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoNacionalidad.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoNacionalidad.add(this.jComboBoxTiposReportesDinamicoTipoNacionalidad, this.gridBagConstraintsTipoNacionalidad);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoTipoNacionalidad = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoTipoNacionalidad.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoTipoNacionalidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoNacionalidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoNacionalidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoNacionalidad = new GridBagConstraints();
		this.gridBagConstraintsTipoNacionalidad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoNacionalidad.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoNacionalidad.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoNacionalidad.add(this.jLabelTiposArchivoReporteDinamicoTipoNacionalidad, this.gridBagConstraintsTipoNacionalidad);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsTipoNacionalidad = new GridBagConstraints();
		this.gridBagConstraintsTipoNacionalidad.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoNacionalidad.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoNacionalidad.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoNacionalidad.add(this.jComboBoxTiposArchivosReportesDinamicoTipoNacionalidad, this.gridBagConstraintsTipoNacionalidad);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoTipoNacionalidad = new JButtonMe();
		this.jButtonGenerarReporteDinamicoTipoNacionalidad.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoTipoNacionalidad,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoTipoNacionalidad.setToolTipText("Generar"+" "+TipoNacionalidadConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsTipoNacionalidad = new GridBagConstraints();
		this.gridBagConstraintsTipoNacionalidad.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoNacionalidad.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoNacionalidad.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoNacionalidad.add(this.jButtonGenerarReporteDinamicoTipoNacionalidad, this.gridBagConstraintsTipoNacionalidad);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoTipoNacionalidad = new JButtonMe();
		this.jButtonCerrarReporteDinamicoTipoNacionalidad.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoTipoNacionalidad,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoTipoNacionalidad.setToolTipText("Cancelar"+" "+TipoNacionalidadConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoNacionalidad = new GridBagConstraints();
		this.gridBagConstraintsTipoNacionalidad.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoNacionalidad.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoNacionalidad.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoNacionalidad.add(this.jButtonCerrarReporteDinamicoTipoNacionalidad, this.gridBagConstraintsTipoNacionalidad);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalTipoNacionalidad = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoTipoNacionalidad= new JScrollPane(jPanelReporteDinamicoTipoNacionalidad,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoTipoNacionalidad.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoNacionalidad.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoNacionalidad.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoTipoNacionalidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Nacionalidades"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoNacionalidad = new GridBagConstraints();
		this.gridBagConstraintsTipoNacionalidad.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsTipoNacionalidad.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsTipoNacionalidad.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoTipoNacionalidad.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoTipoNacionalidad.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalTipoNacionalidad);
		this.jInternalFrameReporteDinamicoTipoNacionalidad.getContentPane().add(this.jScrollPanelReporteDinamicoTipoNacionalidad, this.gridBagConstraintsTipoNacionalidad);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionTipoNacionalidad() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionTipoNacionalidad = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionTipoNacionalidad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionTipoNacionalidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionTipoNacionalidad.setName("jPanelImportacionTipoNacionalidad"); 
		
		this.jPanelImportacionTipoNacionalidad.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoNacionalidad.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoNacionalidad.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionTipoNacionalidad.setLayout(gridaBagLayoutImportacionTipoNacionalidad);
		
		
		this.jInternalFrameImportacionTipoNacionalidad= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionTipoNacionalidad= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionTipoNacionalidad = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoNacionalidad= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionTipoNacionalidad.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoNacionalidad.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoNacionalidad.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionTipoNacionalidad.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoNacionalidad.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoNacionalidad.setResizable(true);
	    this.jInternalFrameImportacionTipoNacionalidad.setClosable(true);
	    this.jInternalFrameImportacionTipoNacionalidad.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionTipoNacionalidad.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoNacionalidad.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoNacionalidad.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionTipoNacionalidad.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoNacionalidad.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoNacionalidad.setResizable(true);
	    this.jInternalFrameImportacionTipoNacionalidad.setClosable(true);
	    this.jInternalFrameImportacionTipoNacionalidad.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionTipoNacionalidad.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoNacionalidad.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoNacionalidad.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionTipoNacionalidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Nacionalidades"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionTipoNacionalidad = new JLabelMe();

		this.jLabelArchivoImportacionTipoNacionalidad.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionTipoNacionalidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoNacionalidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoNacionalidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoNacionalidad = new GridBagConstraints();
		this.gridBagConstraintsTipoNacionalidad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoNacionalidad.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoNacionalidad.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoNacionalidad.add(this.jLabelArchivoImportacionTipoNacionalidad, this.gridBagConstraintsTipoNacionalidad);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionTipoNacionalidad = new JFileChooser();		
		this.jFileChooserImportacionTipoNacionalidad.setToolTipText("ESCOGER ARCHIVO"+" "+TipoNacionalidadConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionTipoNacionalidad = new JButtonMe();
		this.jButtonAbrirImportacionTipoNacionalidad.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionTipoNacionalidad,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionTipoNacionalidad.setToolTipText("Generar"+" "+TipoNacionalidadConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsTipoNacionalidad = new GridBagConstraints();
		this.gridBagConstraintsTipoNacionalidad.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoNacionalidad.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoNacionalidad.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoNacionalidad.add(this.jButtonAbrirImportacionTipoNacionalidad, this.gridBagConstraintsTipoNacionalidad);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionTipoNacionalidad = new JLabelMe();

		this.jLabelPathArchivoImportacionTipoNacionalidad.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionTipoNacionalidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoNacionalidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoNacionalidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoNacionalidad = new GridBagConstraints();
		this.gridBagConstraintsTipoNacionalidad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoNacionalidad.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoNacionalidad.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoNacionalidad.add(this.jLabelPathArchivoImportacionTipoNacionalidad, this.gridBagConstraintsTipoNacionalidad);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionTipoNacionalidad=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionTipoNacionalidad.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoNacionalidad.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoNacionalidad.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsTipoNacionalidad = new GridBagConstraints();
		this.gridBagConstraintsTipoNacionalidad.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoNacionalidad.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoNacionalidad.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoNacionalidad.add(this.jTextFieldPathArchivoImportacionTipoNacionalidad, this.gridBagConstraintsTipoNacionalidad);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionTipoNacionalidad = new JButtonMe();
		this.jButtonGenerarImportacionTipoNacionalidad.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionTipoNacionalidad,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionTipoNacionalidad.setToolTipText("Generar"+" "+TipoNacionalidadConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsTipoNacionalidad = new GridBagConstraints();
		this.gridBagConstraintsTipoNacionalidad.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoNacionalidad.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoNacionalidad.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoNacionalidad.add(this.jButtonGenerarImportacionTipoNacionalidad, this.gridBagConstraintsTipoNacionalidad);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionTipoNacionalidad = new JButtonMe();
		this.jButtonCerrarImportacionTipoNacionalidad.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionTipoNacionalidad,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionTipoNacionalidad.setToolTipText("Cancelar"+" "+TipoNacionalidadConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoNacionalidad = new GridBagConstraints();
		this.gridBagConstraintsTipoNacionalidad.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoNacionalidad.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoNacionalidad.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoNacionalidad.add(this.jButtonCerrarImportacionTipoNacionalidad, this.gridBagConstraintsTipoNacionalidad);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalTipoNacionalidad = new GridBagLayout();
		
		this.jScrollPanelImportacionTipoNacionalidad= new JScrollPane(jPanelImportacionTipoNacionalidad,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsTipoNacionalidad = new GridBagConstraints();
		this.gridBagConstraintsTipoNacionalidad.gridy =iPosYImportacion;
		this.gridBagConstraintsTipoNacionalidad.gridx =iPosXImportacion;
		this.gridBagConstraintsTipoNacionalidad.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionTipoNacionalidad.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionTipoNacionalidad.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalTipoNacionalidad);
		this.jInternalFrameImportacionTipoNacionalidad.getContentPane().add(this.jScrollPanelImportacionTipoNacionalidad, this.gridBagConstraintsTipoNacionalidad);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByTipoNacionalidad(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByTipoNacionalidad = new JButtonMe();
			this.jButtonAbrirOrderByTipoNacionalidad.setText("Orden");
			this.jButtonAbrirOrderByTipoNacionalidad.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoNacionalidad,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoNacionalidad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByTipoNacionalidad";
			inputMap = this.jButtonAbrirOrderByTipoNacionalidad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByTipoNacionalidad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByTipoNacionalidad"));
		
		
			GridBagLayout gridaBagLayoutOrderByTipoNacionalidad = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByTipoNacionalidad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByTipoNacionalidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByTipoNacionalidad.setName("jPanelOrderByTipoNacionalidad"); 
			
			this.jPanelOrderByTipoNacionalidad.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoNacionalidad.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoNacionalidad.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByTipoNacionalidad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByTipoNacionalidad.setLayout(gridaBagLayoutOrderByTipoNacionalidad);
			
			
			this.jTableDatosTipoNacionalidadOrderBy = new JTableMe();        
			this.jTableDatosTipoNacionalidadOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosTipoNacionalidadOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosTipoNacionalidadOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosTipoNacionalidadOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosTipoNacionalidadOrderBy.setViewportView(this.jTableDatosTipoNacionalidadOrderBy);
			this.jTableDatosTipoNacionalidadOrderBy.setFillsViewportHeight(true);
			this.jTableDatosTipoNacionalidadOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByTipoNacionalidad= new OrderByJInternalFrame();
			this.jInternalFrameOrderByTipoNacionalidad= new OrderByJInternalFrame();
			this.jScrollPanelOrderByTipoNacionalidad = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteTipoNacionalidad= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByTipoNacionalidad.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByTipoNacionalidad.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByTipoNacionalidad.setTitle("Orden");
			this.jInternalFrameOrderByTipoNacionalidad.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByTipoNacionalidad.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByTipoNacionalidad.setResizable(true);
			this.jInternalFrameOrderByTipoNacionalidad.setClosable(true);
			this.jInternalFrameOrderByTipoNacionalidad.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByTipoNacionalidad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByTipoNacionalidad.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoNacionalidad.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoNacionalidad.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByTipoNacionalidad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByTipoNacionalidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Nacionalidades"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsTipoNacionalidad = new GridBagConstraints();
			this.gridBagConstraintsTipoNacionalidad.gridy =iPosYOrderBy++;
			this.gridBagConstraintsTipoNacionalidad.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoNacionalidad.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsTipoNacionalidad.ipady =150;
				
			this.jPanelOrderByTipoNacionalidad.add(jScrollPanelDatosTipoNacionalidadOrderBy, this.gridBagConstraintsTipoNacionalidad);//this.jTableDatosTipoNacionalidadTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByTipoNacionalidad = new JButtonMe();
			this.jButtonCerrarOrderByTipoNacionalidad.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByTipoNacionalidad,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByTipoNacionalidad.setToolTipText("Cancelar"+" "+TipoNacionalidadConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByTipoNacionalidad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsTipoNacionalidad = new GridBagConstraints();
			this.gridBagConstraintsTipoNacionalidad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoNacionalidad.gridy = iPosYOrderBy++;
			this.gridBagConstraintsTipoNacionalidad.gridx = iPosXOrderBy;
									
			this.jPanelOrderByTipoNacionalidad.add(this.jButtonCerrarOrderByTipoNacionalidad, this.gridBagConstraintsTipoNacionalidad);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalTipoNacionalidad = new GridBagLayout();
			
			this.jScrollPanelOrderByTipoNacionalidad= new JScrollPane(jPanelOrderByTipoNacionalidad,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsTipoNacionalidad = new GridBagConstraints();
			this.gridBagConstraintsTipoNacionalidad.gridy =iPosYOrderBy;
			this.gridBagConstraintsTipoNacionalidad.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoNacionalidad.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByTipoNacionalidad.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByTipoNacionalidad.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalTipoNacionalidad);
			
			this.jInternalFrameOrderByTipoNacionalidad.getContentPane().add(this.jScrollPanelOrderByTipoNacionalidad, this.gridBagConstraintsTipoNacionalidad);			
		
		} else {
			this.jButtonAbrirOrderByTipoNacionalidad = new JButtonMe();
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
			iWidthTableCalculado+=400;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.tiponacionalidadSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosTipoNacionalidad.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosTipoNacionalidad.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosTipoNacionalidad.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosTipoNacionalidad.getRowHeight();//TipoNacionalidadConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.tiponacionalidadSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > TipoNacionalidadConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoNacionalidad.isSelected()) {
					iHeightTable=TipoNacionalidadConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoNacionalidadConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoNacionalidadConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > TipoNacionalidadConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoNacionalidad.isSelected()) {
					iHeightTable=TipoNacionalidadConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoNacionalidadConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoNacionalidadConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosTipoNacionalidad.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoNacionalidad.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoNacionalidad.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosTipoNacionalidad.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoNacionalidad.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoNacionalidad.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByTipoNacionalidad!=null && this.jInternalFrameOrderByTipoNacionalidad.getjTableDatosOrderBy()!=null) {
			//if(!this.tiponacionalidadSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByTipoNacionalidad.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByTipoNacionalidad.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByTipoNacionalidad.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByTipoNacionalidad.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByTipoNacionalidad.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByTipoNacionalidad.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByTipoNacionalidad.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosTipoNacionalidad.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoNacionalidad.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoNacionalidad.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=tiponacionalidadLogic.getTipoNacionalidads().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tiponacionalidads.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<TipoNacionalidad> TraerTipoNacionalidadBeans(List<TipoNacionalidad> tiponacionalidads,ArrayList<Classe> classes)throws Exception {
		try {
			for(TipoNacionalidad tiponacionalidad:tiponacionalidads) {
					
				if(!(TipoNacionalidadConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || TipoNacionalidadConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					tiponacionalidad.setsDetalleGeneralEntityReporte(TipoNacionalidadConstantesFunciones.getTipoNacionalidadDescripcion(tiponacionalidad));
										
						
					
						
					
				} else  {
							
					//tiponacionalidad.setsDetalleGeneralEntityReporte(tiponacionalidad.getsDetalleGeneralEntityReporte());
										
				}
				
				//tiponacionalidadbeans.add(tiponacionalidadbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return tiponacionalidads;
    }
	//PARA REPORTES FIN
}
