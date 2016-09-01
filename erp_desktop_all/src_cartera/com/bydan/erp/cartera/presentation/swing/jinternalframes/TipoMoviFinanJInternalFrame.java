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
import com.bydan.erp.cartera.util.TipoMoviFinanConstantesFunciones;

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
public class TipoMoviFinanJInternalFrame extends TipoMoviFinanBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarTipoMoviFinan;
	
	protected JMenuBar jmenuBarTipoMoviFinan;
	
	protected JMenu jmenuTipoMoviFinan;
	protected JMenu jmenuDatosTipoMoviFinan;
	protected JMenu jmenuArchivoTipoMoviFinan;
	protected JMenu jmenuAccionesTipoMoviFinan;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosTipoMoviFinan = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoMoviFinan;	
	protected GridBagConstraints gridBagConstraintsTipoMoviFinan;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public TipoMoviFinanDetalleFormJInternalFrame jInternalFrameDetalleFormTipoMoviFinan;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoTipoMoviFinan;	
	protected ImportacionJInternalFrame jInternalFrameImportacionTipoMoviFinan;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public TipoMoviFinanSessionBean tipomovifinanSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<TipoMoviFinan> tipomovifinans;		
	public List<TipoMoviFinan> tipomovifinansEliminados;	
	public List<TipoMoviFinan> tipomovifinansAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByTipoMoviFinan;		
	protected JButton jButtonAbrirOrderByTipoMoviFinan;
	
	
	//protected JPanel jPanelOrderByTipoMoviFinan;
	//public JScrollPane jScrollPanelOrderByTipoMoviFinan;	
	//protected JButton jButtonCerrarOrderByTipoMoviFinan;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public TipoMoviFinanLogic tipomovifinanLogic;
	
	
	
	public JScrollPane jScrollPanelDatosTipoMoviFinan;
	public JScrollPane jScrollPanelDatosEdicionTipoMoviFinan;
	public JScrollPane jScrollPanelDatosGeneralTipoMoviFinan;
    
	
	
	//public JScrollPane jScrollPanelDatosTipoMoviFinanOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoTipoMoviFinan;
	//public JScrollPane jScrollPanelImportacionTipoMoviFinan;
	
	
	
	protected JPanel jPanelAccionesTipoMoviFinan;
	
    protected JPanel jPanelPaginacionTipoMoviFinan;
    protected JPanel jPanelParametrosReportesTipoMoviFinan;
	protected JPanel jPanelParametrosReportesAccionesTipoMoviFinan;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1TipoMoviFinan;
	protected JPanel jPanelParametrosAuxiliar2TipoMoviFinan;
	protected JPanel jPanelParametrosAuxiliar3TipoMoviFinan;
	protected JPanel jPanelParametrosAuxiliar4TipoMoviFinan;
	//protected JPanel jPanelParametrosAuxiliar5TipoMoviFinan;
	
	
	
	//protected JPanel jPanelReporteDinamicoTipoMoviFinan;
	//protected JPanel jPanelImportacionTipoMoviFinan;
	
	
	public JTable jTableDatosTipoMoviFinan;
	
	
	
	//public JTable jTableDatosTipoMoviFinanOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoTipoMoviFinan;
	protected JButton jButtonDuplicarTipoMoviFinan;
	protected JButton jButtonCopiarTipoMoviFinan;
	protected JButton jButtonVerFormTipoMoviFinan;
	protected JButton jButtonNuevoRelacionesTipoMoviFinan;
	protected JButton jButtonModificarTipoMoviFinan;
	
    protected JButton jButtonGuardarCambiosTablaTipoMoviFinan;
	protected JButton jButtonCerrarTipoMoviFinan;
	
	
	protected JButton jButtonRecargarInformacionTipoMoviFinan;
	protected JButton jButtonProcesarInformacionTipoMoviFinan;
	
	
	protected JButton jButtonAnterioresTipoMoviFinan;
	protected JButton jButtonSiguientesTipoMoviFinan;
	protected JButton jButtonNuevoGuardarCambiosTipoMoviFinan;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoTipoMoviFinan;
	//protected JButton jButtonCerrarReporteDinamicoTipoMoviFinan;
	//protected JButton jButtonGenerarExcelReporteDinamicoTipoMoviFinan;	
	
	
	
	//protected JButton jButtonAbrirImportacionTipoMoviFinan;
	//protected JButton jButtonGenerarImportacionTipoMoviFinan;
	//protected JButton jButtonCerrarImportacionTipoMoviFinan;
	//protected JFileChooser jFileChooserImportacionTipoMoviFinan;
	//protected File fileImportacionTipoMoviFinan;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoMoviFinan;
	protected JButton jButtonDuplicarToolBarTipoMoviFinan;
	protected JButton jButtonNuevoRelacionesToolBarTipoMoviFinan;
	
	
	public JButton jButtonGuardarCambiosToolBarTipoMoviFinan;
	protected JButton jButtonCopiarToolBarTipoMoviFinan;
	protected JButton jButtonVerFormToolBarTipoMoviFinan;
	public JButton jButtonGuardarCambiosTablaToolBarTipoMoviFinan;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoMoviFinan;
	protected JButton jButtonCerrarToolBarTipoMoviFinan;
	
	protected JButton jButtonRecargarInformacionToolBarTipoMoviFinan;
	protected JButton jButtonProcesarInformacionToolBarTipoMoviFinan;
	protected JButton jButtonAnterioresToolBarTipoMoviFinan;
	protected JButton jButtonSiguientesToolBarTipoMoviFinan;
	protected JButton jButtonNuevoGuardarCambiosToolBarTipoMoviFinan;
	protected JButton jButtonAbrirOrderByToolBarTipoMoviFinan;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoMoviFinan;
	protected JMenuItem jMenuItemDuplicarTipoMoviFinan;
	protected JMenuItem jMenuItemNuevoRelacionesTipoMoviFinan;
	
	
	protected JMenuItem jMenuItemGuardarCambiosTipoMoviFinan;
	protected JMenuItem jMenuItemCopiarTipoMoviFinan;
	protected JMenuItem jMenuItemVerFormTipoMoviFinan;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoMoviFinan;
	protected JMenuItem jMenuItemCerrarTipoMoviFinan;
	protected JMenuItem jMenuItemDetalleCerrarTipoMoviFinan;
	protected JMenuItem jMenuItemDetalleAbrirOrderByTipoMoviFinan;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoMoviFinan;
	
	protected JMenuItem jMenuItemRecargarInformacionTipoMoviFinan;
	protected JMenuItem jMenuItemProcesarInformacionTipoMoviFinan;
	protected JMenuItem jMenuItemAnterioresTipoMoviFinan;
	protected JMenuItem jMenuItemSiguientesTipoMoviFinan;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoMoviFinan;
	protected JMenuItem jMenuItemAbrirOrderByTipoMoviFinan;
	protected JMenuItem jMenuItemMostrarOcultarTipoMoviFinan;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoMoviFinan;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosTipoMoviFinan;
	protected JCheckBox jCheckBoxSeleccionadosTipoMoviFinan;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaTipoMoviFinan;
	protected JCheckBox jCheckBoxConGraficoReporteTipoMoviFinan;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesTipoMoviFinan;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesTipoMoviFinan;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoTipoMoviFinan;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoTipoMoviFinan;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesTipoMoviFinan;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionTipoMoviFinan;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoMoviFinan;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoMoviFinan;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarTipoMoviFinan;
	protected JTextField jTextFieldValorCampoGeneralTipoMoviFinan;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteTipoMoviFinan;
	//public JList<Reporte> jListColumnasSelectReporteTipoMoviFinan;
	//public JScrollPane jScrollColumnasSelectReporteTipoMoviFinan;
	
	//public JLabel jLabelRelacionesSelectReporteTipoMoviFinan;
	//public JList<Reporte> jListRelacionesSelectReporteTipoMoviFinan;
	//public JScrollPane jScrollRelacionesSelectReporteTipoMoviFinan;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoTipoMoviFinan;
	//protected JCheckBox jCheckBoxConGraficoDinamicoTipoMoviFinan;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoTipoMoviFinan;
	//public JLabel jLabelTiposArchivoReporteDinamicoTipoMoviFinan;
	
		
	//public JLabel jLabelArchivoImportacionTipoMoviFinan;	
	//public JLabel jLabelPathArchivoImportacionTipoMoviFinan;
	//protected JTextField jTextFieldPathArchivoImportacionTipoMoviFinan;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoTipoMoviFinan;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoTipoMoviFinan;
	
	//public JLabel jLabelColumnaCategoriaValorTipoMoviFinan;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorTipoMoviFinan;
	
	//public JLabel jLabelColumnasValoresGraficoTipoMoviFinan;
	//public JList<Reporte> jListColumnasValoresGraficoTipoMoviFinan;
	//public JScrollPane jScrollColumnasValoresGraficoTipoMoviFinan;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoTipoMoviFinan;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoTipoMoviFinan;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasTipoMoviFinan;
	
	
	
	
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
	public TipoMoviFinanJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("TipoMoviFinan No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoMoviFinanJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoMoviFinan No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoMoviFinanJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoMoviFinan No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoMoviFinanJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoMoviFinan No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionTipoMoviFinan)	{
		this.jButtonRecargarInformacionTipoMoviFinan = jButtonRecargarInformacionTipoMoviFinan;
	}
	
	public JButton getjButtonProcesarInformacionTipoMoviFinan() {
		return this.jButtonProcesarInformacionTipoMoviFinan;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoMoviFinan)	{
		this.jButtonProcesarInformacionTipoMoviFinan = jButtonProcesarInformacionTipoMoviFinan;
	}
	
	
	public JButton getjButtonRecargarInformacionTipoMoviFinan() {
		return this.jButtonRecargarInformacionTipoMoviFinan;
	}
	
	
	public List<TipoMoviFinan> gettipomovifinans() {
		return this.tipomovifinans;
	}

	public void settipomovifinans(List<TipoMoviFinan> tipomovifinans) {
		this.tipomovifinans = tipomovifinans;
	}
	
	public List<TipoMoviFinan> gettipomovifinansAux() {
		return this.tipomovifinansAux;
	}

	public void settipomovifinansAux(List<TipoMoviFinan> tipomovifinansAux) {
		this.tipomovifinansAux = tipomovifinansAux;
	}
	
	public List<TipoMoviFinan> gettipomovifinansEliminados() {
		return this.tipomovifinansEliminados;
	}

	public void setTipoMoviFinansEliminados(List<TipoMoviFinan> tipomovifinansEliminados) {
		this.tipomovifinansEliminados = tipomovifinansEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarTipoMoviFinan() {
		return jComboBoxTiposSeleccionarTipoMoviFinan;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarTipoMoviFinan(
			JComboBox jComboBoxTiposSeleccionarTipoMoviFinan) {
		this.jComboBoxTiposSeleccionarTipoMoviFinan = jComboBoxTiposSeleccionarTipoMoviFinan;
	}
	
	public void setBorderResaltarTiposSeleccionarTipoMoviFinan() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarTipoMoviFinan.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarTipoMoviFinan .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralTipoMoviFinan() {
		return jTextFieldValorCampoGeneralTipoMoviFinan;
	}

	public void setjTextFieldValorCampoGeneralTipoMoviFinan(
			JTextField jTextFieldValorCampoGeneralTipoMoviFinan) {
		this.jTextFieldValorCampoGeneralTipoMoviFinan = jTextFieldValorCampoGeneralTipoMoviFinan;
	}

	public void setBorderResaltarValorCampoGeneralTipoMoviFinan() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoMoviFinan.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralTipoMoviFinan .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosTipoMoviFinan() {
		return this.jCheckBoxSeleccionarTodosTipoMoviFinan;
	}

	public void setjCheckBoxSeleccionarTodosTipoMoviFinan(
			JCheckBox jCheckBoxSeleccionarTodosTipoMoviFinan) {
		this.jCheckBoxSeleccionarTodosTipoMoviFinan = jCheckBoxSeleccionarTodosTipoMoviFinan;
	}

	public void setBorderResaltarSeleccionarTodosTipoMoviFinan() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoMoviFinan.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosTipoMoviFinan .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosTipoMoviFinan() {
		return this.jCheckBoxSeleccionadosTipoMoviFinan;
	}

	public void setjCheckBoxSeleccionadosTipoMoviFinan(
			JCheckBox jCheckBoxSeleccionadosTipoMoviFinan) {
		this.jCheckBoxSeleccionadosTipoMoviFinan = jCheckBoxSeleccionadosTipoMoviFinan;
	}
	
	public void setBorderResaltarSeleccionadosTipoMoviFinan() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoMoviFinan.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosTipoMoviFinan .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesTipoMoviFinan() {
		return this.jComboBoxTiposArchivosReportesTipoMoviFinan;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesTipoMoviFinan(
			JComboBox jComboBoxTiposArchivosReportesTipoMoviFinan) {
		this.jComboBoxTiposArchivosReportesTipoMoviFinan = jComboBoxTiposArchivosReportesTipoMoviFinan;
	}

	public void setBorderResaltarTiposArchivosReportesTipoMoviFinan() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoMoviFinan.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesTipoMoviFinan .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesTipoMoviFinan() {
		return this.jComboBoxTiposReportesTipoMoviFinan;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesTipoMoviFinan(
			JComboBox jComboBoxTiposReportesTipoMoviFinan) {
		this.jComboBoxTiposReportesTipoMoviFinan = jComboBoxTiposReportesTipoMoviFinan;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoTipoMoviFinan() {
	//	return jComboBoxTiposReportesDinamicoTipoMoviFinan;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoTipoMoviFinan(
	//		JComboBox jComboBoxTiposReportesDinamicoTipoMoviFinan) {
	//	this.jComboBoxTiposReportesDinamicoTipoMoviFinan = jComboBoxTiposReportesDinamicoTipoMoviFinan;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoTipoMoviFinan() {
	//	return jComboBoxTiposArchivosReportesDinamicoTipoMoviFinan;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoTipoMoviFinan(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoTipoMoviFinan) {
	//	this.jComboBoxTiposArchivosReportesDinamicoTipoMoviFinan = jComboBoxTiposArchivosReportesDinamicoTipoMoviFinan;
	//}
	
	public void setBorderResaltarTiposReportesTipoMoviFinan() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoMoviFinan.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesTipoMoviFinan .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesTipoMoviFinan() {
		return this.jComboBoxTiposGraficosReportesTipoMoviFinan;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesTipoMoviFinan(
			JComboBox jComboBoxTiposGraficosReportesTipoMoviFinan) {
		this.jComboBoxTiposGraficosReportesTipoMoviFinan = jComboBoxTiposGraficosReportesTipoMoviFinan;
	}
	
	public void setBorderResaltarTiposGraficosReportesTipoMoviFinan() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoMoviFinan.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesTipoMoviFinan .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionTipoMoviFinan() {
		return this.jComboBoxTiposPaginacionTipoMoviFinan;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionTipoMoviFinan(
			JComboBox jComboBoxTiposPaginacionTipoMoviFinan) {
		this.jComboBoxTiposPaginacionTipoMoviFinan = jComboBoxTiposPaginacionTipoMoviFinan;
	}
	
	public void setBorderResaltarTiposPaginacionTipoMoviFinan() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoMoviFinan.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionTipoMoviFinan .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesTipoMoviFinan() {
		return this.jComboBoxTiposRelacionesTipoMoviFinan;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoMoviFinan() {
		return this.jComboBoxTiposAccionesTipoMoviFinan;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoMoviFinan(
			JComboBox jComboBoxTiposRelacionesTipoMoviFinan) {
		this.jComboBoxTiposRelacionesTipoMoviFinan = jComboBoxTiposRelacionesTipoMoviFinan;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoMoviFinan(
			JComboBox jComboBoxTiposAccionesTipoMoviFinan) {
		this.jComboBoxTiposAccionesTipoMoviFinan = jComboBoxTiposAccionesTipoMoviFinan;
	}
	
	public void setBorderResaltarTiposRelacionesTipoMoviFinan() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoMoviFinan.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesTipoMoviFinan .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesTipoMoviFinan() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoMoviFinan.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesTipoMoviFinan .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoTipoMoviFinan() {
	//	return jCheckBoxConGraficoDinamicoTipoMoviFinan;
	//}

	//public void setjCheckBoxConGraficoDinamicoTipoMoviFinan(
	//		JCheckBox jCheckBoxConGraficoDinamicoTipoMoviFinan) {
	//	this.jCheckBoxConGraficoDinamicoTipoMoviFinan = jCheckBoxConGraficoDinamicoTipoMoviFinan;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoTipoMoviFinan() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarTipoMoviFinan.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoTipoMoviFinan .setBorder(borderResaltar);		
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
		this.tipomovifinanSessionBean=new TipoMoviFinanSessionBean();
		
		this.tipomovifinanSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipomovifinanSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipomovifinanSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=TipoMoviFinanJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=TipoMoviFinanJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoMoviFinanJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoMoviFinanJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoMoviFinanJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Movi Finan MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.tipomovifinanSessionBean.getEsGuardarRelacionado()) {
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
		
		TipoMoviFinanJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("TipoMoviFinan No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarTipoMoviFinan= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarTipoMoviFinan=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarTipoMoviFinan,this.jTtoolBarTipoMoviFinan,
							"nuevo","nuevo","Nuevo"+" "+TipoMoviFinanConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoMoviFinan=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarTipoMoviFinan,this.jTtoolBarTipoMoviFinan,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoMoviFinan=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarTipoMoviFinan,this.jTtoolBarTipoMoviFinan,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+TipoMoviFinanConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarTipoMoviFinan=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarTipoMoviFinan,this.jTtoolBarTipoMoviFinan,
							"duplicar","duplicar","Duplicar"+" "+TipoMoviFinanConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarTipoMoviFinan=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarTipoMoviFinan,this.jTtoolBarTipoMoviFinan,
							"copiar","copiar","Copiar"+" "+TipoMoviFinanConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarTipoMoviFinan=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarTipoMoviFinan,this.jTtoolBarTipoMoviFinan,
							"ver_form","ver_form","Ver"+" "+TipoMoviFinanConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarTipoMoviFinan=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoMoviFinan,this.jTtoolBarTipoMoviFinan,
							"recargar","recargar","Recargar"+" "+TipoMoviFinanConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarTipoMoviFinan=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoMoviFinan,this.jTtoolBarTipoMoviFinan,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarTipoMoviFinan=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoMoviFinan,this.jTtoolBarTipoMoviFinan,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarTipoMoviFinan=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarTipoMoviFinan,this.jTtoolBarTipoMoviFinan,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarTipoMoviFinan=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarTipoMoviFinan,this.jTtoolBarTipoMoviFinan,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarTipoMoviFinan=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarTipoMoviFinan,this.jTtoolBarTipoMoviFinan,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+TipoMoviFinanConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarTipoMoviFinan=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarTipoMoviFinan,this.jTtoolBarTipoMoviFinan,
							"cerrar","cerrar","Salir"+" "+TipoMoviFinanConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarTipoMoviFinan=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarTipoMoviFinan;
			
				this.jButtonProcesarInformacionToolBarTipoMoviFinan=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarTipoMoviFinan;
				
		//protected JButton jButtonModificarToolBarTipoMoviFinan;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarTipoMoviFinan=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuTipoMoviFinan=new JMenuMe("General");
		this.jmenuArchivoTipoMoviFinan=new JMenuMe("Archivo");
		this.jmenuAccionesTipoMoviFinan=new JMenuMe("Acciones");
		this.jmenuDatosTipoMoviFinan=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoMoviFinan= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoMoviFinan.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoMoviFinan,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoMoviFinan, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarTipoMoviFinan= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarTipoMoviFinan.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarTipoMoviFinan,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarTipoMoviFinan, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesTipoMoviFinan= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesTipoMoviFinan.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesTipoMoviFinan,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesTipoMoviFinan, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosTipoMoviFinan= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoMoviFinan.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoMoviFinan,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoMoviFinan, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarTipoMoviFinan= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarTipoMoviFinan.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarTipoMoviFinan,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarTipoMoviFinan, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormTipoMoviFinan= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormTipoMoviFinan.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormTipoMoviFinan,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormTipoMoviFinan, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaTipoMoviFinan= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaTipoMoviFinan.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaTipoMoviFinan,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaTipoMoviFinan, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoMoviFinan= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoMoviFinan.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoMoviFinan,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoMoviFinan, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionTipoMoviFinan= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionTipoMoviFinan.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionTipoMoviFinan,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionTipoMoviFinan, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionTipoMoviFinan= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionTipoMoviFinan.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionTipoMoviFinan,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresTipoMoviFinan= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresTipoMoviFinan.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresTipoMoviFinan,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresTipoMoviFinan, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesTipoMoviFinan= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesTipoMoviFinan.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesTipoMoviFinan,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesTipoMoviFinan, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByTipoMoviFinan= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByTipoMoviFinan.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByTipoMoviFinan,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByTipoMoviFinan, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoMoviFinan= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoMoviFinan.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoMoviFinan,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoMoviFinan, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByTipoMoviFinan= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByTipoMoviFinan.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByTipoMoviFinan,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByTipoMoviFinan, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoMoviFinan= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoMoviFinan.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoMoviFinan,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoMoviFinan, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosTipoMoviFinan= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosTipoMoviFinan.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosTipoMoviFinan,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosTipoMoviFinan, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoTipoMoviFinan.add(this.jMenuItemCerrarTipoMoviFinan);
			
			this.jmenuAccionesTipoMoviFinan.add(this.jMenuItemNuevoTipoMoviFinan);
			this.jmenuAccionesTipoMoviFinan.add(this.jMenuItemNuevoGuardarCambiosTipoMoviFinan);
			this.jmenuAccionesTipoMoviFinan.add(this.jMenuItemNuevoRelacionesTipoMoviFinan);
			this.jmenuAccionesTipoMoviFinan.add(this.jMenuItemGuardarCambiosTablaTipoMoviFinan);		
			this.jmenuAccionesTipoMoviFinan.add(this.jMenuItemDuplicarTipoMoviFinan);		
			this.jmenuAccionesTipoMoviFinan.add(this.jMenuItemCopiarTipoMoviFinan);		
			this.jmenuAccionesTipoMoviFinan.add(this.jMenuItemVerFormTipoMoviFinan);		
			
			this.jmenuDatosTipoMoviFinan.add(this.jMenuItemRecargarInformacionTipoMoviFinan);				
			this.jmenuDatosTipoMoviFinan.add(this.jMenuItemAnterioresTipoMoviFinan);				
			this.jmenuDatosTipoMoviFinan.add(this.jMenuItemSiguientesTipoMoviFinan);				
			this.jmenuDatosTipoMoviFinan.add(this.jMenuItemAbrirOrderByTipoMoviFinan);				
			this.jmenuDatosTipoMoviFinan.add(this.jMenuItemMostrarOcultarTipoMoviFinan);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesTipoMoviFinan.add(this.jMenuItemGuardarCambiosTipoMoviFinan);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoTipoMoviFinan, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesTipoMoviFinan, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosTipoMoviFinan, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarTipoMoviFinan.add(this.jmenuArchivoTipoMoviFinan);		
			this.jmenuBarTipoMoviFinan.add(this.jmenuAccionesTipoMoviFinan);		
			this.jmenuBarTipoMoviFinan.add(this.jmenuDatosTipoMoviFinan);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarTipoMoviFinan);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasTipoMoviFinan() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		

		this.jTabbedPaneBusquedasTipoMoviFinan=new JTabbedPane();


		this.jTabbedPaneBusquedasTipoMoviFinan.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoMoviFinan.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoMoviFinan.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasTipoMoviFinan.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasTipoMoviFinan.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasTipoMoviFinan,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleTipoMoviFinan = new TipoMoviFinanDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Tipo Movi Finan DATOS");
			this.jInternalFrameDetalleFormTipoMoviFinan = new TipoMoviFinanDetalleFormJInternalFrame(jDesktopPane,this.tipomovifinanSessionBean.getConGuardarRelaciones(),this.tipomovifinanSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormTipoMoviFinan = null;//new TipoMoviFinanDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoMoviFinan= new GridBagLayout();
		
		
		this.jTableDatosTipoMoviFinan = new JTableMe();      
		
		String sToolTipTipoMoviFinan="";
		sToolTipTipoMoviFinan=TipoMoviFinanConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoMoviFinan+="(Cartera.TipoMoviFinan)";
		}
		
		if(!this.tipomovifinanSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoMoviFinan+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosTipoMoviFinan.setToolTipText(sToolTipTipoMoviFinan);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosTipoMoviFinan);
		this.jTableDatosTipoMoviFinan.setAutoCreateRowSorter(true);
		this.jTableDatosTipoMoviFinan.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosTipoMoviFinan.setRowSelectionAllowed(true);
		this.jTableDatosTipoMoviFinan.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosTipoMoviFinan,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoTipoMoviFinan = new JButtonMe();
		this.jButtonDuplicarTipoMoviFinan = new JButtonMe();
		this.jButtonCopiarTipoMoviFinan = new JButtonMe();
		this.jButtonVerFormTipoMoviFinan = new JButtonMe();
		this.jButtonNuevoRelacionesTipoMoviFinan = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaTipoMoviFinan = new JButtonMe();
		this.jButtonCerrarTipoMoviFinan = new JButtonMe();
		
		this.jScrollPanelDatosTipoMoviFinan = new JScrollPane();   
        this.jScrollPanelDatosGeneralTipoMoviFinan = new JScrollPane();
		
				
		
		
		this.jPanelAccionesTipoMoviFinan = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Movi Finan";
		
		if(!this.tipomovifinanSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoMoviFinan.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Movi Finanes" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoMoviFinan.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralTipoMoviFinan.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesTipoMoviFinan.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoMoviFinan.setToolTipText("Acciones");
        this.jPanelAccionesTipoMoviFinan.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoMoviFinan, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoMoviFinan, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoTipoMoviFinan=new ReporteDinamicoJInternalFrame(TipoMoviFinanConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoTipoMoviFinan();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionTipoMoviFinan=new ImportacionJInternalFrame(TipoMoviFinanConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionTipoMoviFinan();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByTipoMoviFinan = new JButtonMe();
		
		this.jButtonAbrirOrderByTipoMoviFinan.setText("Orden");
		this.jButtonAbrirOrderByTipoMoviFinan.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoMoviFinan,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoMoviFinan, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByTipoMoviFinan.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByTipoMoviFinan.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoMoviFinan=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoMoviFinan,false,this);
			
			//this.cargarOrderByTipoMoviFinan(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoMoviFinan=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoMoviFinan,true,this);
			
			//this.cargarOrderByTipoMoviFinan(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosTipoMoviFinan.setMinimumSize(new Dimension(400,50));//430
		this.jTableDatosTipoMoviFinan.setMaximumSize(new Dimension(400,50));//430
		this.jTableDatosTipoMoviFinan.setPreferredSize(new Dimension(400,50));//430
		
		this.jScrollPanelDatosTipoMoviFinan.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoMoviFinan.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoMoviFinan.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoTipoMoviFinan.setText("Nuevo");
		this.jButtonDuplicarTipoMoviFinan.setText("Duplicar");
		this.jButtonCopiarTipoMoviFinan.setText("Copiar");
		this.jButtonVerFormTipoMoviFinan.setText("Ver");
		this.jButtonNuevoRelacionesTipoMoviFinan.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaTipoMoviFinan.setText("Guardar");
		this.jButtonCerrarTipoMoviFinan.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoMoviFinan,"nuevo_button","Nuevo",this.tipomovifinanSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarTipoMoviFinan,"duplicar_button","Duplicar",this.tipomovifinanSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarTipoMoviFinan,"copiar_button","Copiar",this.tipomovifinanSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormTipoMoviFinan,"ver_form","Ver",this.tipomovifinanSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesTipoMoviFinan,"nuevorelaciones_button","Nuevo Rel",this.tipomovifinanSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoMoviFinan,"guardarcambiostabla_button","Guardar",this.tipomovifinanSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoMoviFinan,"cerrar_button","Salir",this.tipomovifinanSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoMoviFinan, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarTipoMoviFinan, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarTipoMoviFinan, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormTipoMoviFinan, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesTipoMoviFinan, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoMoviFinan, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoMoviFinan, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoTipoMoviFinan.setToolTipText("Nuevo"+" "+TipoMoviFinanConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarTipoMoviFinan.setToolTipText("Duplicar"+" "+TipoMoviFinanConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarTipoMoviFinan.setToolTipText("Copiar"+" "+TipoMoviFinanConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormTipoMoviFinan.setToolTipText("Ver"+" "+TipoMoviFinanConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesTipoMoviFinan.setToolTipText("Nuevo Rel"+" "+TipoMoviFinanConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaTipoMoviFinan.setToolTipText("Guardar"+" "+TipoMoviFinanConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoMoviFinan.setToolTipText("Salir"+" "+TipoMoviFinanConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoMoviFinan";
		inputMap = this.jButtonNuevoTipoMoviFinan.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoMoviFinan.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoMoviFinan"));
		
		//DUPLICAR
		sMapKey = "DuplicarTipoMoviFinan";
		inputMap = this.jButtonDuplicarTipoMoviFinan.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarTipoMoviFinan.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarTipoMoviFinan"));
		
		//COPIAR
		sMapKey = "CopiarTipoMoviFinan";
		inputMap = this.jButtonCopiarTipoMoviFinan.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarTipoMoviFinan.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarTipoMoviFinan"));
		
		//VEr FORM
		sMapKey = "VerFormTipoMoviFinan";
		inputMap = this.jButtonVerFormTipoMoviFinan.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormTipoMoviFinan.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormTipoMoviFinan"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesTipoMoviFinan";
		inputMap = this.jButtonNuevoRelacionesTipoMoviFinan.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesTipoMoviFinan.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesTipoMoviFinan"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarTipoMoviFinan";
		inputMap = this.jButtonModificarTipoMoviFinan.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarTipoMoviFinan.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarTipoMoviFinan"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarTipoMoviFinan";
		inputMap = this.jButtonCerrarTipoMoviFinan.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoMoviFinan.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoMoviFinan"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoMoviFinan";
		inputMap = this.jButtonGuardarCambiosTablaTipoMoviFinan.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoMoviFinan.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoMoviFinan"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesTipoMoviFinan = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesTipoMoviFinan = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionTipoMoviFinan = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1TipoMoviFinan= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2TipoMoviFinan= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3TipoMoviFinan= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4TipoMoviFinan= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5TipoMoviFinan= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesTipoMoviFinan.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesTipoMoviFinan.setName("jPanelParametrosReportesTipoMoviFinan"); 
		
		this.jPanelParametrosReportesAccionesTipoMoviFinan.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesTipoMoviFinan.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesTipoMoviFinan.setName("jPanelParametrosReportesAccionesTipoMoviFinan"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesTipoMoviFinan, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesTipoMoviFinan, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionTipoMoviFinan = new JButtonMe();
		this.jButtonRecargarInformacionTipoMoviFinan.setText("Recargar");
		this.jButtonRecargarInformacionTipoMoviFinan.setToolTipText("Recargar"+" "+TipoMoviFinanConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionTipoMoviFinan,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionTipoMoviFinan = new JButtonMe();
		this.jButtonProcesarInformacionTipoMoviFinan.setText("Procesar");
		this.jButtonProcesarInformacionTipoMoviFinan.setToolTipText("Procesar"+" "+TipoMoviFinanConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionTipoMoviFinan.setVisible(false);
			
		this.jButtonProcesarInformacionTipoMoviFinan.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoMoviFinan.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoMoviFinan.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesTipoMoviFinan = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoMoviFinan.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesTipoMoviFinan.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesTipoMoviFinan = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoMoviFinan.setText("TIPO");       
		this.jComboBoxTiposReportesTipoMoviFinan.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesTipoMoviFinan = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoMoviFinan.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesTipoMoviFinan.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionTipoMoviFinan = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionTipoMoviFinan.setText("Paginacion");
		this.jComboBoxTiposPaginacionTipoMoviFinan.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesTipoMoviFinan = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesTipoMoviFinan.setText("Accion");
		this.jComboBoxTiposRelacionesTipoMoviFinan.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesTipoMoviFinan = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoMoviFinan.setText("Accion");
		this.jComboBoxTiposAccionesTipoMoviFinan.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarTipoMoviFinan = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarTipoMoviFinan.setText("Accion");
		this.jComboBoxTiposSeleccionarTipoMoviFinan.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralTipoMoviFinan=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralTipoMoviFinan.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoMoviFinan.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoMoviFinan.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesTipoMoviFinan = new JLabelMe();
		
		this.jLabelAccionesTipoMoviFinan.setText("Acciones");		
		this.jLabelAccionesTipoMoviFinan.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoMoviFinan.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoMoviFinan.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosTipoMoviFinan = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosTipoMoviFinan.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosTipoMoviFinan.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosTipoMoviFinan = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosTipoMoviFinan.setText("Seleccionados");
		this.jCheckBoxSeleccionadosTipoMoviFinan.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaTipoMoviFinan = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaTipoMoviFinan.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaTipoMoviFinan.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteTipoMoviFinan = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteTipoMoviFinan.setText("Graf.");
		this.jCheckBoxConGraficoReporteTipoMoviFinan.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresTipoMoviFinan = new JButtonMe();
		//this.jButtonAnterioresTipoMoviFinan.setText("<<");
        this.jButtonAnterioresTipoMoviFinan.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresTipoMoviFinan,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresTipoMoviFinan, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesTipoMoviFinan = new JButtonMe();
		//this.jButtonSiguientesTipoMoviFinan.setText(">>");
        this.jButtonSiguientesTipoMoviFinan.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesTipoMoviFinan,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesTipoMoviFinan, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosTipoMoviFinan = new JButtonMe();
		this.jButtonNuevoGuardarCambiosTipoMoviFinan.setText("Nue");
        this.jButtonNuevoGuardarCambiosTipoMoviFinan.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosTipoMoviFinan,"nuevoguardarcambios_button","Nue",this.tipomovifinanSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosTipoMoviFinan, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosTipoMoviFinan";
		inputMap = this.jButtonNuevoGuardarCambiosTipoMoviFinan.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosTipoMoviFinan.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosTipoMoviFinan"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionTipoMoviFinan";
		inputMap = this.jButtonRecargarInformacionTipoMoviFinan.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionTipoMoviFinan.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionTipoMoviFinan"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesTipoMoviFinan";
		inputMap = this.jButtonSiguientesTipoMoviFinan.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesTipoMoviFinan.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesTipoMoviFinan"));
		
		//ANTERIORES		
		sMapKey = "AnterioresTipoMoviFinan";
		inputMap = this.jButtonAnterioresTipoMoviFinan.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresTipoMoviFinan.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresTipoMoviFinan"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasTipoMoviFinan();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesTipoMoviFinan.setMinimumSize(new Dimension(this.getWidth(),TipoMoviFinanBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoMoviFinanBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoMoviFinan.setMaximumSize(new Dimension(this.getWidth(),TipoMoviFinanBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoMoviFinanBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoMoviFinan.setPreferredSize(new Dimension(this.getWidth(),TipoMoviFinanBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoMoviFinanBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionTipoMoviFinan = new GridBagLayout();

			this.jPanelPaginacionTipoMoviFinan.setLayout(gridaBagLayoutPaginacionTipoMoviFinan);						
			
			this.gridBagConstraintsTipoMoviFinan = new GridBagConstraints();
			this.gridBagConstraintsTipoMoviFinan.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsTipoMoviFinan.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoMoviFinan.gridy = 0;
			this.gridBagConstraintsTipoMoviFinan.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionTipoMoviFinan.add(this.jButtonAnterioresTipoMoviFinan, this.gridBagConstraintsTipoMoviFinan);
					
						
			this.gridBagConstraintsTipoMoviFinan = new GridBagConstraints();
			this.gridBagConstraintsTipoMoviFinan.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoMoviFinan.gridy = 0;
			
			this.jPanelPaginacionTipoMoviFinan.add(this.jButtonNuevoGuardarCambiosTipoMoviFinan, this.gridBagConstraintsTipoMoviFinan);
						
			
			this.gridBagConstraintsTipoMoviFinan = new GridBagConstraints();
			this.gridBagConstraintsTipoMoviFinan.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsTipoMoviFinan.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoMoviFinan.gridy = 0;
			this.jPanelPaginacionTipoMoviFinan.add(this.jButtonSiguientesTipoMoviFinan, this.gridBagConstraintsTipoMoviFinan);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsTipoMoviFinan = new GridBagConstraints();
			this.gridBagConstraintsTipoMoviFinan.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoMoviFinan.gridy = 1;
			this.gridBagConstraintsTipoMoviFinan.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoMoviFinan.add(this.jButtonNuevoTipoMoviFinan, this.gridBagConstraintsTipoMoviFinan);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsTipoMoviFinan = new GridBagConstraints();
				this.gridBagConstraintsTipoMoviFinan.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoMoviFinan.gridy = 1;
				this.gridBagConstraintsTipoMoviFinan.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionTipoMoviFinan.add(this.jButtonNuevoRelacionesTipoMoviFinan, this.gridBagConstraintsTipoMoviFinan);
			}
			
			
			if(!this.tipomovifinanSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsTipoMoviFinan = new GridBagConstraints();
				this.gridBagConstraintsTipoMoviFinan.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoMoviFinan.gridy = 1;
				this.gridBagConstraintsTipoMoviFinan.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionTipoMoviFinan.add(this.jButtonGuardarCambiosTablaTipoMoviFinan, this.gridBagConstraintsTipoMoviFinan);
			}
			
			
			
			this.gridBagConstraintsTipoMoviFinan = new GridBagConstraints();
			this.gridBagConstraintsTipoMoviFinan.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoMoviFinan.gridy = 1;
			this.gridBagConstraintsTipoMoviFinan.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoMoviFinan.add(this.jButtonDuplicarTipoMoviFinan, this.gridBagConstraintsTipoMoviFinan);
			
			this.gridBagConstraintsTipoMoviFinan = new GridBagConstraints();
			this.gridBagConstraintsTipoMoviFinan.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoMoviFinan.gridy = 1;
			this.gridBagConstraintsTipoMoviFinan.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoMoviFinan.add(this.jButtonCopiarTipoMoviFinan, this.gridBagConstraintsTipoMoviFinan);
		
			this.gridBagConstraintsTipoMoviFinan = new GridBagConstraints();
			this.gridBagConstraintsTipoMoviFinan.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoMoviFinan.gridy = 1;
			this.gridBagConstraintsTipoMoviFinan.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoMoviFinan.add(this.jButtonVerFormTipoMoviFinan, this.gridBagConstraintsTipoMoviFinan);
		
			this.gridBagConstraintsTipoMoviFinan = new GridBagConstraints();
			this.gridBagConstraintsTipoMoviFinan.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoMoviFinan.gridy = 1;
			this.gridBagConstraintsTipoMoviFinan.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionTipoMoviFinan.add(this.jButtonCerrarTipoMoviFinan, this.gridBagConstraintsTipoMoviFinan);
		
		
		
		this.jButtonRecargarInformacionTipoMoviFinan.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoMoviFinan.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoMoviFinan.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionTipoMoviFinan, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesTipoMoviFinan.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoMoviFinan.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoMoviFinan.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesTipoMoviFinan, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesTipoMoviFinan.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoMoviFinan.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoMoviFinan.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesTipoMoviFinan, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesTipoMoviFinan.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoMoviFinan.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoMoviFinan.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesTipoMoviFinan, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionTipoMoviFinan.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoMoviFinan.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoMoviFinan.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionTipoMoviFinan, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesTipoMoviFinan.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoMoviFinan.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoMoviFinan.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesTipoMoviFinan, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesTipoMoviFinan.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoMoviFinan.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoMoviFinan.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoMoviFinan, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarTipoMoviFinan.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoMoviFinan.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoMoviFinan.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarTipoMoviFinan, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaTipoMoviFinan.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoMoviFinan.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoMoviFinan.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaTipoMoviFinan, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteTipoMoviFinan.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoMoviFinan.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoMoviFinan.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteTipoMoviFinan, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosTipoMoviFinan.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoMoviFinan.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoMoviFinan.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosTipoMoviFinan, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosTipoMoviFinan.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoMoviFinan.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoMoviFinan.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosTipoMoviFinan, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesTipoMoviFinan = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesTipoMoviFinan = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1TipoMoviFinan = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2TipoMoviFinan = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3TipoMoviFinan = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4TipoMoviFinan = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesTipoMoviFinan.setLayout(gridaBagParametrosReportesTipoMoviFinan);
			this.jPanelParametrosReportesAccionesTipoMoviFinan.setLayout(gridaBagParametrosReportesAccionesTipoMoviFinan);
			
			
			this.jPanelParametrosAuxiliar1TipoMoviFinan.setLayout(gridaBagParametrosAuxiliar1TipoMoviFinan);
			this.jPanelParametrosAuxiliar2TipoMoviFinan.setLayout(gridaBagParametrosAuxiliar2TipoMoviFinan);
			this.jPanelParametrosAuxiliar3TipoMoviFinan.setLayout(gridaBagParametrosAuxiliar3TipoMoviFinan);
			this.jPanelParametrosAuxiliar4TipoMoviFinan.setLayout(gridaBagParametrosAuxiliar4TipoMoviFinan);
			//this.jPanelParametrosAuxiliar5TipoMoviFinan.setLayout(gridaBagParametrosAuxiliar2TipoMoviFinan);			
			
			
			
			
			this.gridBagConstraintsTipoMoviFinan = new GridBagConstraints();
			this.gridBagConstraintsTipoMoviFinan.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoMoviFinan.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoMoviFinan.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoMoviFinan.add(this.jButtonRecargarInformacionTipoMoviFinan, this.gridBagConstraintsTipoMoviFinan);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsTipoMoviFinan = new GridBagConstraints();
			this.gridBagConstraintsTipoMoviFinan.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoMoviFinan.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoMoviFinan.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoMoviFinan.add(this.jComboBoxTiposPaginacionTipoMoviFinan, this.gridBagConstraintsTipoMoviFinan);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsTipoMoviFinan = new GridBagConstraints();
			this.gridBagConstraintsTipoMoviFinan.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoMoviFinan.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoMoviFinan.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoMoviFinan.add(this.jCheckBoxConAltoMaximoTablaTipoMoviFinan, this.gridBagConstraintsTipoMoviFinan);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsTipoMoviFinan = new GridBagConstraints();
			this.gridBagConstraintsTipoMoviFinan.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoMoviFinan.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoMoviFinan.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoMoviFinan.add(this.jComboBoxTiposArchivosReportesTipoMoviFinan, this.gridBagConstraintsTipoMoviFinan);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsTipoMoviFinan = new GridBagConstraints();
			this.gridBagConstraintsTipoMoviFinan.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoMoviFinan.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoMoviFinan.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoMoviFinan.add(this.jPanelParametrosAuxiliar1TipoMoviFinan, this.gridBagConstraintsTipoMoviFinan);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsTipoMoviFinan = new GridBagConstraints();
			this.gridBagConstraintsTipoMoviFinan.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoMoviFinan.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoMoviFinan.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoMoviFinan.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4TipoMoviFinan.add(this.jComboBoxTiposReportesTipoMoviFinan, this.gridBagConstraintsTipoMoviFinan);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsTipoMoviFinan = new GridBagConstraints();
			this.gridBagConstraintsTipoMoviFinan.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoMoviFinan.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoMoviFinan.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoMoviFinan.add(this.jPanelParametrosAuxiliar4TipoMoviFinan, this.gridBagConstraintsTipoMoviFinan);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsTipoMoviFinan = new GridBagConstraints();
			this.gridBagConstraintsTipoMoviFinan.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoMoviFinan.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoMoviFinan.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoMoviFinan.add(this.jComboBoxTiposReportesTipoMoviFinan, this.gridBagConstraintsTipoMoviFinan);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsTipoMoviFinan = new GridBagConstraints();
			this.gridBagConstraintsTipoMoviFinan.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoMoviFinan.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoMoviFinan.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoMoviFinan.add(this.jCheckBoxGenerarReporteTipoMoviFinan, this.gridBagConstraintsTipoMoviFinan);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsTipoMoviFinan = new GridBagConstraints();
			this.gridBagConstraintsTipoMoviFinan.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoMoviFinan.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoMoviFinan.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoMoviFinan.add(this.jPanelParametrosAuxiliar2TipoMoviFinan, this.gridBagConstraintsTipoMoviFinan);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsTipoMoviFinan = new GridBagConstraints();
			this.gridBagConstraintsTipoMoviFinan.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoMoviFinan.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoMoviFinan.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoMoviFinan.add(this.jLabelAccionesTipoMoviFinan, this.gridBagConstraintsTipoMoviFinan);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsTipoMoviFinan = new GridBagConstraints();
				this.gridBagConstraintsTipoMoviFinan.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsTipoMoviFinan.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsTipoMoviFinan.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesTipoMoviFinan.add(this.jButtonAbrirOrderByTipoMoviFinan, this.gridBagConstraintsTipoMoviFinan);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsTipoMoviFinan = new GridBagConstraints();
			this.gridBagConstraintsTipoMoviFinan.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsTipoMoviFinan.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoMoviFinan.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoMoviFinan.add(this.jComboBoxTiposSeleccionarTipoMoviFinan, this.gridBagConstraintsTipoMoviFinan);			
			
			
			/*
			this.gridBagConstraintsTipoMoviFinan = new GridBagConstraints();
			this.gridBagConstraintsTipoMoviFinan.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoMoviFinan.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoMoviFinan.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoMoviFinan.add(this.jCheckBoxSeleccionarTodosTipoMoviFinan, this.gridBagConstraintsTipoMoviFinan);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsTipoMoviFinan = new GridBagConstraints();
			this.gridBagConstraintsTipoMoviFinan.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoMoviFinan.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoMoviFinan.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoMoviFinan.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoMoviFinan.add(this.jCheckBoxSeleccionarTodosTipoMoviFinan, this.gridBagConstraintsTipoMoviFinan);															
				
			this.gridBagConstraintsTipoMoviFinan = new GridBagConstraints();
			this.gridBagConstraintsTipoMoviFinan.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoMoviFinan.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoMoviFinan.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoMoviFinan.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoMoviFinan.add(this.jCheckBoxSeleccionadosTipoMoviFinan, this.gridBagConstraintsTipoMoviFinan);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsTipoMoviFinan = new GridBagConstraints();
			this.gridBagConstraintsTipoMoviFinan.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoMoviFinan.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoMoviFinan.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoMoviFinan.add(this.jPanelParametrosAuxiliar3TipoMoviFinan, this.gridBagConstraintsTipoMoviFinan);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsTipoMoviFinan = new GridBagConstraints();
			this.gridBagConstraintsTipoMoviFinan.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoMoviFinan.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoMoviFinan.add(this.jComboBoxTiposRelacionesTipoMoviFinan, this.gridBagConstraintsTipoMoviFinan);
				
			this.gridBagConstraintsTipoMoviFinan = new GridBagConstraints();
			this.gridBagConstraintsTipoMoviFinan.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoMoviFinan.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoMoviFinan.add(this.jComboBoxTiposAccionesTipoMoviFinan, this.gridBagConstraintsTipoMoviFinan);
	
				
			this.gridBagConstraintsTipoMoviFinan = new GridBagConstraints();
			this.gridBagConstraintsTipoMoviFinan.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoMoviFinan.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoMoviFinan.add(this.jTextFieldValorCampoGeneralTipoMoviFinan, this.gridBagConstraintsTipoMoviFinan);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosTipoMoviFinan = new GridBagLayout();

			this.jScrollPanelDatosTipoMoviFinan.setLayout(gridaBagLayoutDatosTipoMoviFinan);
			
			this.gridBagConstraintsTipoMoviFinan = new GridBagConstraints();
			this.gridBagConstraintsTipoMoviFinan.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoMoviFinan.gridy = 0;
			this.gridBagConstraintsTipoMoviFinan.gridx = 0;
			
			this.jScrollPanelDatosTipoMoviFinan.add(this.jTableDatosTipoMoviFinan, this.gridBagConstraintsTipoMoviFinan);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosTipoMoviFinan.setViewportView(this.jTableDatosTipoMoviFinan);
		this.jTableDatosTipoMoviFinan.setFillsViewportHeight(true);
		this.jTableDatosTipoMoviFinan.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesTipoMoviFinan= new GridBagLayout();
		this.jPanelAccionesTipoMoviFinan.setLayout(gridaBagLayoutAccionesTipoMoviFinan);
		
		
		/*	
		this.gridBagConstraintsTipoMoviFinan = new GridBagConstraints();
		this.gridBagConstraintsTipoMoviFinan.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoMoviFinan.gridy = 0;
		this.gridBagConstraintsTipoMoviFinan.gridx = 0;
			
		this.jPanelAccionesTipoMoviFinan.add(this.jButtonNuevoTipoMoviFinan, this.gridBagConstraintsTipoMoviFinan);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoMoviFinan = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoMoviFinan);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipomovifinanSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoMoviFinan = new GridBagConstraints();						
			this.gridBagConstraintsTipoMoviFinan.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoMoviFinan.gridx = 0;		
			//this.gridBagConstraintsTipoMoviFinan.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoMoviFinan.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoMoviFinan.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarTipoMoviFinan, this.gridBagConstraintsTipoMoviFinan);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsTipoMoviFinan = new GridBagConstraints();
		this.gridBagConstraintsTipoMoviFinan.gridy = iGridyPrincipal++;
		this.gridBagConstraintsTipoMoviFinan.gridx = 0;		
		//this.gridBagConstraintsTipoMoviFinan.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoMoviFinan.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsTipoMoviFinan.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsTipoMoviFinan);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsTipoMoviFinan = new GridBagConstraints();
		this.gridBagConstraintsTipoMoviFinan.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoMoviFinan.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesTipoMoviFinan, this.gridBagConstraintsTipoMoviFinan);								
		
		
		/*
		this.gridBagConstraintsTipoMoviFinan = new GridBagConstraints();
		this.gridBagConstraintsTipoMoviFinan.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoMoviFinan.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesTipoMoviFinan, this.gridBagConstraintsTipoMoviFinan);
		*/		
		
		this.gridBagConstraintsTipoMoviFinan = new GridBagConstraints();
		this.gridBagConstraintsTipoMoviFinan.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoMoviFinan.gridx =0;
		this.gridBagConstraintsTipoMoviFinan.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoMoviFinan.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoMoviFinan, this.gridBagConstraintsTipoMoviFinan);
				
		
		this.gridBagConstraintsTipoMoviFinan = new GridBagConstraints();
		this.gridBagConstraintsTipoMoviFinan.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoMoviFinan.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionTipoMoviFinan, this.gridBagConstraintsTipoMoviFinan);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(TipoMoviFinanJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosTipoMoviFinan= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoMoviFinan = new GridBagLayout();
			this.jPanelBusquedasParametrosTipoMoviFinan.setLayout(gridaBagLayoutBusquedasParametrosTipoMoviFinan);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralTipoMoviFinan=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoMoviFinan.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoMoviFinan.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoMoviFinan.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoMoviFinan = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsTipoMoviFinan = new GridBagConstraints();
		this.gridBagConstraintsTipoMoviFinan.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoMoviFinan.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoMoviFinan, this.gridBagConstraintsTipoMoviFinan);
			
			
		this.gridBagConstraintsTipoMoviFinan = new GridBagConstraints();
		this.gridBagConstraintsTipoMoviFinan.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoMoviFinan.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoMoviFinan, this.gridBagConstraintsTipoMoviFinan);
		
			
		this.gridBagConstraintsTipoMoviFinan = new GridBagConstraints();
		this.gridBagConstraintsTipoMoviFinan.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoMoviFinan.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoMoviFinan, this.gridBagConstraintsTipoMoviFinan);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralTipoMoviFinan;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoTipoMoviFinan() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoTipoMoviFinan = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoTipoMoviFinan = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoTipoMoviFinan.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoTipoMoviFinan.setName("jPanelReporteDinamicoTipoMoviFinan"); 
		
		this.jPanelReporteDinamicoTipoMoviFinan.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoMoviFinan.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoMoviFinan.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoTipoMoviFinan.setLayout(gridaBagLayoutReporteDinamicoTipoMoviFinan);
		
		
		this.jInternalFrameReporteDinamicoTipoMoviFinan= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoTipoMoviFinan = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoMoviFinan= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoTipoMoviFinan.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoTipoMoviFinan.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoTipoMoviFinan.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoTipoMoviFinan.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoTipoMoviFinan.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoTipoMoviFinan.setResizable(true);
	    this.jInternalFrameReporteDinamicoTipoMoviFinan.setClosable(true);
	    this.jInternalFrameReporteDinamicoTipoMoviFinan.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoTipoMoviFinan.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoMoviFinan.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoMoviFinan.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoTipoMoviFinan.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Movi Finanes"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteTipoMoviFinan = new JLabelMe();

		this.jLabelColumnasSelectReporteTipoMoviFinan.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteTipoMoviFinan.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoMoviFinan.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoMoviFinan.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoMoviFinan = new GridBagConstraints();
		this.gridBagConstraintsTipoMoviFinan.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoMoviFinan.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoMoviFinan.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoMoviFinan.add(this.jLabelColumnasSelectReporteTipoMoviFinan, this.gridBagConstraintsTipoMoviFinan);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteTipoMoviFinan = new JList<Reporte>();
		this.jListColumnasSelectReporteTipoMoviFinan.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteTipoMoviFinan.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteTipoMoviFinan.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoMoviFinan.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoMoviFinan.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteTipoMoviFinan=new JScrollPane(this.jListColumnasSelectReporteTipoMoviFinan);
			
			this.jScrollColumnasSelectReporteTipoMoviFinan.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoMoviFinan.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoMoviFinan.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteTipoMoviFinan.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTipoMoviFinan = new GridBagConstraints();
		this.gridBagConstraintsTipoMoviFinan.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoMoviFinan.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoMoviFinan.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoMoviFinan.add(this.jListColumnasSelectReporteTipoMoviFinan, this.gridBagConstraintsTipoMoviFinan);
		this.jPanelReporteDinamicoTipoMoviFinan.add(this.jScrollColumnasSelectReporteTipoMoviFinan, this.gridBagConstraintsTipoMoviFinan);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteTipoMoviFinan = new JLabelMe();

		this.jLabelRelacionesSelectReporteTipoMoviFinan.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteTipoMoviFinan.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoMoviFinan.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoMoviFinan.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsTipoMoviFinan = new GridBagConstraints();
		this.gridBagConstraintsTipoMoviFinan.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoMoviFinan.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoMoviFinan.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoMoviFinan.add(this.jLabelRelacionesSelectReporteTipoMoviFinan, this.gridBagConstraintsTipoMoviFinan);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteTipoMoviFinan = new JList<Reporte>();
		this.jListRelacionesSelectReporteTipoMoviFinan.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteTipoMoviFinan.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteTipoMoviFinan.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoMoviFinan.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoMoviFinan.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteTipoMoviFinan=new JScrollPane(this.jListRelacionesSelectReporteTipoMoviFinan);
			
			this.jScrollRelacionesSelectReporteTipoMoviFinan.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoMoviFinan.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoMoviFinan.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteTipoMoviFinan.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsTipoMoviFinan = new GridBagConstraints();
		this.gridBagConstraintsTipoMoviFinan.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoMoviFinan.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoMoviFinan.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoMoviFinan.add(this.jListRelacionesSelectReporteTipoMoviFinan, this.gridBagConstraintsTipoMoviFinan);
		this.jPanelReporteDinamicoTipoMoviFinan.add(this.jScrollRelacionesSelectReporteTipoMoviFinan, this.gridBagConstraintsTipoMoviFinan);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoTipoMoviFinan = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoTipoMoviFinan = new JComboBoxMe();
		this.jListColumnasValoresGraficoTipoMoviFinan = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoTipoMoviFinan = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoTipoMoviFinan.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoTipoMoviFinan.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoMoviFinan.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoMoviFinan.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoTipoMoviFinan, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoTipoMoviFinan = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoTipoMoviFinan.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoTipoMoviFinan.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoMoviFinan.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoMoviFinan.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoTipoMoviFinan, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoTipoMoviFinan = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoTipoMoviFinan.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoTipoMoviFinan.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoMoviFinan.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoMoviFinan.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoMoviFinan = new GridBagConstraints();
		this.gridBagConstraintsTipoMoviFinan.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoMoviFinan.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoMoviFinan.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoMoviFinan.add(this.jLabelGenerarExcelReporteDinamicoTipoMoviFinan, this.gridBagConstraintsTipoMoviFinan);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoTipoMoviFinan = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoTipoMoviFinan.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoTipoMoviFinan,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoTipoMoviFinan.setToolTipText("Generar EXCEL"+" "+TipoMoviFinanConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsTipoMoviFinan = new GridBagConstraints();
		//this.gridBagConstraintsTipoMoviFinan.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsTipoMoviFinan.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsTipoMoviFinan.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoTipoMoviFinan.add(this.jButtonGenerarExcelReporteDinamicoTipoMoviFinan, this.gridBagConstraintsTipoMoviFinan);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsTipoMoviFinan = new GridBagConstraints();
		this.gridBagConstraintsTipoMoviFinan.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoMoviFinan.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoMoviFinan.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoMoviFinan.add(this.jComboBoxTiposReportesDinamicoTipoMoviFinan, this.gridBagConstraintsTipoMoviFinan);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoTipoMoviFinan = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoTipoMoviFinan.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoTipoMoviFinan.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoMoviFinan.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoMoviFinan.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoMoviFinan = new GridBagConstraints();
		this.gridBagConstraintsTipoMoviFinan.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoMoviFinan.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoMoviFinan.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoMoviFinan.add(this.jLabelTiposArchivoReporteDinamicoTipoMoviFinan, this.gridBagConstraintsTipoMoviFinan);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsTipoMoviFinan = new GridBagConstraints();
		this.gridBagConstraintsTipoMoviFinan.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoMoviFinan.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoMoviFinan.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoMoviFinan.add(this.jComboBoxTiposArchivosReportesDinamicoTipoMoviFinan, this.gridBagConstraintsTipoMoviFinan);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoTipoMoviFinan = new JButtonMe();
		this.jButtonGenerarReporteDinamicoTipoMoviFinan.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoTipoMoviFinan,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoTipoMoviFinan.setToolTipText("Generar"+" "+TipoMoviFinanConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsTipoMoviFinan = new GridBagConstraints();
		this.gridBagConstraintsTipoMoviFinan.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoMoviFinan.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoMoviFinan.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoMoviFinan.add(this.jButtonGenerarReporteDinamicoTipoMoviFinan, this.gridBagConstraintsTipoMoviFinan);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoTipoMoviFinan = new JButtonMe();
		this.jButtonCerrarReporteDinamicoTipoMoviFinan.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoTipoMoviFinan,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoTipoMoviFinan.setToolTipText("Cancelar"+" "+TipoMoviFinanConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoMoviFinan = new GridBagConstraints();
		this.gridBagConstraintsTipoMoviFinan.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoMoviFinan.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoMoviFinan.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoMoviFinan.add(this.jButtonCerrarReporteDinamicoTipoMoviFinan, this.gridBagConstraintsTipoMoviFinan);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalTipoMoviFinan = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoTipoMoviFinan= new JScrollPane(jPanelReporteDinamicoTipoMoviFinan,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoTipoMoviFinan.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoMoviFinan.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoMoviFinan.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoTipoMoviFinan.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Movi Finanes"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoMoviFinan = new GridBagConstraints();
		this.gridBagConstraintsTipoMoviFinan.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsTipoMoviFinan.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsTipoMoviFinan.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoTipoMoviFinan.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoTipoMoviFinan.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalTipoMoviFinan);
		this.jInternalFrameReporteDinamicoTipoMoviFinan.getContentPane().add(this.jScrollPanelReporteDinamicoTipoMoviFinan, this.gridBagConstraintsTipoMoviFinan);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionTipoMoviFinan() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionTipoMoviFinan = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionTipoMoviFinan = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionTipoMoviFinan.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionTipoMoviFinan.setName("jPanelImportacionTipoMoviFinan"); 
		
		this.jPanelImportacionTipoMoviFinan.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoMoviFinan.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoMoviFinan.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionTipoMoviFinan.setLayout(gridaBagLayoutImportacionTipoMoviFinan);
		
		
		this.jInternalFrameImportacionTipoMoviFinan= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionTipoMoviFinan= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionTipoMoviFinan = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoMoviFinan= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionTipoMoviFinan.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoMoviFinan.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoMoviFinan.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionTipoMoviFinan.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoMoviFinan.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoMoviFinan.setResizable(true);
	    this.jInternalFrameImportacionTipoMoviFinan.setClosable(true);
	    this.jInternalFrameImportacionTipoMoviFinan.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionTipoMoviFinan.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoMoviFinan.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoMoviFinan.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionTipoMoviFinan.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoMoviFinan.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoMoviFinan.setResizable(true);
	    this.jInternalFrameImportacionTipoMoviFinan.setClosable(true);
	    this.jInternalFrameImportacionTipoMoviFinan.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionTipoMoviFinan.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoMoviFinan.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoMoviFinan.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionTipoMoviFinan.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Movi Finanes"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionTipoMoviFinan = new JLabelMe();

		this.jLabelArchivoImportacionTipoMoviFinan.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionTipoMoviFinan.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoMoviFinan.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoMoviFinan.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoMoviFinan = new GridBagConstraints();
		this.gridBagConstraintsTipoMoviFinan.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoMoviFinan.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoMoviFinan.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoMoviFinan.add(this.jLabelArchivoImportacionTipoMoviFinan, this.gridBagConstraintsTipoMoviFinan);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionTipoMoviFinan = new JFileChooser();		
		this.jFileChooserImportacionTipoMoviFinan.setToolTipText("ESCOGER ARCHIVO"+" "+TipoMoviFinanConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionTipoMoviFinan = new JButtonMe();
		this.jButtonAbrirImportacionTipoMoviFinan.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionTipoMoviFinan,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionTipoMoviFinan.setToolTipText("Generar"+" "+TipoMoviFinanConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsTipoMoviFinan = new GridBagConstraints();
		this.gridBagConstraintsTipoMoviFinan.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoMoviFinan.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoMoviFinan.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoMoviFinan.add(this.jButtonAbrirImportacionTipoMoviFinan, this.gridBagConstraintsTipoMoviFinan);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionTipoMoviFinan = new JLabelMe();

		this.jLabelPathArchivoImportacionTipoMoviFinan.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionTipoMoviFinan.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoMoviFinan.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoMoviFinan.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoMoviFinan = new GridBagConstraints();
		this.gridBagConstraintsTipoMoviFinan.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoMoviFinan.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoMoviFinan.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoMoviFinan.add(this.jLabelPathArchivoImportacionTipoMoviFinan, this.gridBagConstraintsTipoMoviFinan);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionTipoMoviFinan=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionTipoMoviFinan.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoMoviFinan.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoMoviFinan.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsTipoMoviFinan = new GridBagConstraints();
		this.gridBagConstraintsTipoMoviFinan.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoMoviFinan.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoMoviFinan.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoMoviFinan.add(this.jTextFieldPathArchivoImportacionTipoMoviFinan, this.gridBagConstraintsTipoMoviFinan);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionTipoMoviFinan = new JButtonMe();
		this.jButtonGenerarImportacionTipoMoviFinan.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionTipoMoviFinan,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionTipoMoviFinan.setToolTipText("Generar"+" "+TipoMoviFinanConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsTipoMoviFinan = new GridBagConstraints();
		this.gridBagConstraintsTipoMoviFinan.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoMoviFinan.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoMoviFinan.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoMoviFinan.add(this.jButtonGenerarImportacionTipoMoviFinan, this.gridBagConstraintsTipoMoviFinan);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionTipoMoviFinan = new JButtonMe();
		this.jButtonCerrarImportacionTipoMoviFinan.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionTipoMoviFinan,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionTipoMoviFinan.setToolTipText("Cancelar"+" "+TipoMoviFinanConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoMoviFinan = new GridBagConstraints();
		this.gridBagConstraintsTipoMoviFinan.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoMoviFinan.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoMoviFinan.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoMoviFinan.add(this.jButtonCerrarImportacionTipoMoviFinan, this.gridBagConstraintsTipoMoviFinan);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalTipoMoviFinan = new GridBagLayout();
		
		this.jScrollPanelImportacionTipoMoviFinan= new JScrollPane(jPanelImportacionTipoMoviFinan,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsTipoMoviFinan = new GridBagConstraints();
		this.gridBagConstraintsTipoMoviFinan.gridy =iPosYImportacion;
		this.gridBagConstraintsTipoMoviFinan.gridx =iPosXImportacion;
		this.gridBagConstraintsTipoMoviFinan.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionTipoMoviFinan.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionTipoMoviFinan.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalTipoMoviFinan);
		this.jInternalFrameImportacionTipoMoviFinan.getContentPane().add(this.jScrollPanelImportacionTipoMoviFinan, this.gridBagConstraintsTipoMoviFinan);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByTipoMoviFinan(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByTipoMoviFinan = new JButtonMe();
			this.jButtonAbrirOrderByTipoMoviFinan.setText("Orden");
			this.jButtonAbrirOrderByTipoMoviFinan.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoMoviFinan,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoMoviFinan, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByTipoMoviFinan";
			inputMap = this.jButtonAbrirOrderByTipoMoviFinan.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByTipoMoviFinan.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByTipoMoviFinan"));
		
		
			GridBagLayout gridaBagLayoutOrderByTipoMoviFinan = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByTipoMoviFinan = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByTipoMoviFinan.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByTipoMoviFinan.setName("jPanelOrderByTipoMoviFinan"); 
			
			this.jPanelOrderByTipoMoviFinan.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoMoviFinan.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoMoviFinan.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByTipoMoviFinan, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByTipoMoviFinan.setLayout(gridaBagLayoutOrderByTipoMoviFinan);
			
			
			this.jTableDatosTipoMoviFinanOrderBy = new JTableMe();        
			this.jTableDatosTipoMoviFinanOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosTipoMoviFinanOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosTipoMoviFinanOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosTipoMoviFinanOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosTipoMoviFinanOrderBy.setViewportView(this.jTableDatosTipoMoviFinanOrderBy);
			this.jTableDatosTipoMoviFinanOrderBy.setFillsViewportHeight(true);
			this.jTableDatosTipoMoviFinanOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByTipoMoviFinan= new OrderByJInternalFrame();
			this.jInternalFrameOrderByTipoMoviFinan= new OrderByJInternalFrame();
			this.jScrollPanelOrderByTipoMoviFinan = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteTipoMoviFinan= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByTipoMoviFinan.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByTipoMoviFinan.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByTipoMoviFinan.setTitle("Orden");
			this.jInternalFrameOrderByTipoMoviFinan.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByTipoMoviFinan.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByTipoMoviFinan.setResizable(true);
			this.jInternalFrameOrderByTipoMoviFinan.setClosable(true);
			this.jInternalFrameOrderByTipoMoviFinan.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByTipoMoviFinan, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByTipoMoviFinan.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoMoviFinan.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoMoviFinan.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByTipoMoviFinan, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByTipoMoviFinan.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Movi Finanes"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsTipoMoviFinan = new GridBagConstraints();
			this.gridBagConstraintsTipoMoviFinan.gridy =iPosYOrderBy++;
			this.gridBagConstraintsTipoMoviFinan.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoMoviFinan.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsTipoMoviFinan.ipady =150;
				
			this.jPanelOrderByTipoMoviFinan.add(jScrollPanelDatosTipoMoviFinanOrderBy, this.gridBagConstraintsTipoMoviFinan);//this.jTableDatosTipoMoviFinanTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByTipoMoviFinan = new JButtonMe();
			this.jButtonCerrarOrderByTipoMoviFinan.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByTipoMoviFinan,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByTipoMoviFinan.setToolTipText("Cancelar"+" "+TipoMoviFinanConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByTipoMoviFinan, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsTipoMoviFinan = new GridBagConstraints();
			this.gridBagConstraintsTipoMoviFinan.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoMoviFinan.gridy = iPosYOrderBy++;
			this.gridBagConstraintsTipoMoviFinan.gridx = iPosXOrderBy;
									
			this.jPanelOrderByTipoMoviFinan.add(this.jButtonCerrarOrderByTipoMoviFinan, this.gridBagConstraintsTipoMoviFinan);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalTipoMoviFinan = new GridBagLayout();
			
			this.jScrollPanelOrderByTipoMoviFinan= new JScrollPane(jPanelOrderByTipoMoviFinan,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsTipoMoviFinan = new GridBagConstraints();
			this.gridBagConstraintsTipoMoviFinan.gridy =iPosYOrderBy;
			this.gridBagConstraintsTipoMoviFinan.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoMoviFinan.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByTipoMoviFinan.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByTipoMoviFinan.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalTipoMoviFinan);
			
			this.jInternalFrameOrderByTipoMoviFinan.getContentPane().add(this.jScrollPanelOrderByTipoMoviFinan, this.gridBagConstraintsTipoMoviFinan);			
		
		} else {
			this.jButtonAbrirOrderByTipoMoviFinan = new JButtonMe();
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
			&& this.tipomovifinanSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosTipoMoviFinan.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosTipoMoviFinan.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosTipoMoviFinan.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosTipoMoviFinan.getRowHeight();//TipoMoviFinanConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.tipomovifinanSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > TipoMoviFinanConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoMoviFinan.isSelected()) {
					iHeightTable=TipoMoviFinanConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoMoviFinanConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoMoviFinanConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > TipoMoviFinanConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoMoviFinan.isSelected()) {
					iHeightTable=TipoMoviFinanConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoMoviFinanConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoMoviFinanConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosTipoMoviFinan.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoMoviFinan.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoMoviFinan.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosTipoMoviFinan.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoMoviFinan.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoMoviFinan.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByTipoMoviFinan!=null && this.jInternalFrameOrderByTipoMoviFinan.getjTableDatosOrderBy()!=null) {
			//if(!this.tipomovifinanSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByTipoMoviFinan.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByTipoMoviFinan.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByTipoMoviFinan.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByTipoMoviFinan.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByTipoMoviFinan.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByTipoMoviFinan.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByTipoMoviFinan.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosTipoMoviFinan.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoMoviFinan.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoMoviFinan.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=tipomovifinanLogic.getTipoMoviFinans().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipomovifinans.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<TipoMoviFinan> TraerTipoMoviFinanBeans(List<TipoMoviFinan> tipomovifinans,ArrayList<Classe> classes)throws Exception {
		try {
			for(TipoMoviFinan tipomovifinan:tipomovifinans) {
					
				if(!(TipoMoviFinanConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || TipoMoviFinanConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					tipomovifinan.setsDetalleGeneralEntityReporte(TipoMoviFinanConstantesFunciones.getTipoMoviFinanDescripcion(tipomovifinan));
										
						
					
					

					if(tipomovifinan.getInformacionFinancieras()!=null && Funciones.existeClass(classes,InformacionFinanciera.class)) {
						try{tipomovifinan.setinformacionfinancierasDescripcionReporte(new JRBeanCollectionDataSource(InformacionFinancieraJInternalFrame.TraerInformacionFinancieraBeans(tipomovifinan.getInformacionFinancieras(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//tipomovifinan.setsDetalleGeneralEntityReporte(tipomovifinan.getsDetalleGeneralEntityReporte());
										
				}
				
				//tipomovifinanbeans.add(tipomovifinanbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return tipomovifinans;
    }
	//PARA REPORTES FIN
}
