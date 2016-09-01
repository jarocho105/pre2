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
import com.bydan.erp.cartera.util.TipoViviendaConstantesFunciones;

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
public class TipoViviendaJInternalFrame extends TipoViviendaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarTipoVivienda;
	
	protected JMenuBar jmenuBarTipoVivienda;
	
	protected JMenu jmenuTipoVivienda;
	protected JMenu jmenuDatosTipoVivienda;
	protected JMenu jmenuArchivoTipoVivienda;
	protected JMenu jmenuAccionesTipoVivienda;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosTipoVivienda = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoVivienda;	
	protected GridBagConstraints gridBagConstraintsTipoVivienda;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public TipoViviendaDetalleFormJInternalFrame jInternalFrameDetalleFormTipoVivienda;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoTipoVivienda;	
	protected ImportacionJInternalFrame jInternalFrameImportacionTipoVivienda;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public TipoViviendaSessionBean tipoviviendaSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<TipoVivienda> tipoviviendas;		
	public List<TipoVivienda> tipoviviendasEliminados;	
	public List<TipoVivienda> tipoviviendasAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByTipoVivienda;		
	protected JButton jButtonAbrirOrderByTipoVivienda;
	
	
	//protected JPanel jPanelOrderByTipoVivienda;
	//public JScrollPane jScrollPanelOrderByTipoVivienda;	
	//protected JButton jButtonCerrarOrderByTipoVivienda;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public TipoViviendaLogic tipoviviendaLogic;
	
	
	
	public JScrollPane jScrollPanelDatosTipoVivienda;
	public JScrollPane jScrollPanelDatosEdicionTipoVivienda;
	public JScrollPane jScrollPanelDatosGeneralTipoVivienda;
    
	
	
	//public JScrollPane jScrollPanelDatosTipoViviendaOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoTipoVivienda;
	//public JScrollPane jScrollPanelImportacionTipoVivienda;
	
	
	
	protected JPanel jPanelAccionesTipoVivienda;
	
    protected JPanel jPanelPaginacionTipoVivienda;
    protected JPanel jPanelParametrosReportesTipoVivienda;
	protected JPanel jPanelParametrosReportesAccionesTipoVivienda;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1TipoVivienda;
	protected JPanel jPanelParametrosAuxiliar2TipoVivienda;
	protected JPanel jPanelParametrosAuxiliar3TipoVivienda;
	protected JPanel jPanelParametrosAuxiliar4TipoVivienda;
	//protected JPanel jPanelParametrosAuxiliar5TipoVivienda;
	
	
	
	//protected JPanel jPanelReporteDinamicoTipoVivienda;
	//protected JPanel jPanelImportacionTipoVivienda;
	
	
	public JTable jTableDatosTipoVivienda;
	
	
	
	//public JTable jTableDatosTipoViviendaOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoTipoVivienda;
	protected JButton jButtonDuplicarTipoVivienda;
	protected JButton jButtonCopiarTipoVivienda;
	protected JButton jButtonVerFormTipoVivienda;
	protected JButton jButtonNuevoRelacionesTipoVivienda;
	protected JButton jButtonModificarTipoVivienda;
	
    protected JButton jButtonGuardarCambiosTablaTipoVivienda;
	protected JButton jButtonCerrarTipoVivienda;
	
	
	protected JButton jButtonRecargarInformacionTipoVivienda;
	protected JButton jButtonProcesarInformacionTipoVivienda;
	
	
	protected JButton jButtonAnterioresTipoVivienda;
	protected JButton jButtonSiguientesTipoVivienda;
	protected JButton jButtonNuevoGuardarCambiosTipoVivienda;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoTipoVivienda;
	//protected JButton jButtonCerrarReporteDinamicoTipoVivienda;
	//protected JButton jButtonGenerarExcelReporteDinamicoTipoVivienda;	
	
	
	
	//protected JButton jButtonAbrirImportacionTipoVivienda;
	//protected JButton jButtonGenerarImportacionTipoVivienda;
	//protected JButton jButtonCerrarImportacionTipoVivienda;
	//protected JFileChooser jFileChooserImportacionTipoVivienda;
	//protected File fileImportacionTipoVivienda;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoVivienda;
	protected JButton jButtonDuplicarToolBarTipoVivienda;
	protected JButton jButtonNuevoRelacionesToolBarTipoVivienda;
	
	
	public JButton jButtonGuardarCambiosToolBarTipoVivienda;
	protected JButton jButtonCopiarToolBarTipoVivienda;
	protected JButton jButtonVerFormToolBarTipoVivienda;
	public JButton jButtonGuardarCambiosTablaToolBarTipoVivienda;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoVivienda;
	protected JButton jButtonCerrarToolBarTipoVivienda;
	
	protected JButton jButtonRecargarInformacionToolBarTipoVivienda;
	protected JButton jButtonProcesarInformacionToolBarTipoVivienda;
	protected JButton jButtonAnterioresToolBarTipoVivienda;
	protected JButton jButtonSiguientesToolBarTipoVivienda;
	protected JButton jButtonNuevoGuardarCambiosToolBarTipoVivienda;
	protected JButton jButtonAbrirOrderByToolBarTipoVivienda;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoVivienda;
	protected JMenuItem jMenuItemDuplicarTipoVivienda;
	protected JMenuItem jMenuItemNuevoRelacionesTipoVivienda;
	
	
	protected JMenuItem jMenuItemGuardarCambiosTipoVivienda;
	protected JMenuItem jMenuItemCopiarTipoVivienda;
	protected JMenuItem jMenuItemVerFormTipoVivienda;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoVivienda;
	protected JMenuItem jMenuItemCerrarTipoVivienda;
	protected JMenuItem jMenuItemDetalleCerrarTipoVivienda;
	protected JMenuItem jMenuItemDetalleAbrirOrderByTipoVivienda;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoVivienda;
	
	protected JMenuItem jMenuItemRecargarInformacionTipoVivienda;
	protected JMenuItem jMenuItemProcesarInformacionTipoVivienda;
	protected JMenuItem jMenuItemAnterioresTipoVivienda;
	protected JMenuItem jMenuItemSiguientesTipoVivienda;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoVivienda;
	protected JMenuItem jMenuItemAbrirOrderByTipoVivienda;
	protected JMenuItem jMenuItemMostrarOcultarTipoVivienda;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoVivienda;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosTipoVivienda;
	protected JCheckBox jCheckBoxSeleccionadosTipoVivienda;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaTipoVivienda;
	protected JCheckBox jCheckBoxConGraficoReporteTipoVivienda;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesTipoVivienda;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesTipoVivienda;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoTipoVivienda;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoTipoVivienda;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesTipoVivienda;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionTipoVivienda;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoVivienda;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoVivienda;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarTipoVivienda;
	protected JTextField jTextFieldValorCampoGeneralTipoVivienda;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteTipoVivienda;
	//public JList<Reporte> jListColumnasSelectReporteTipoVivienda;
	//public JScrollPane jScrollColumnasSelectReporteTipoVivienda;
	
	//public JLabel jLabelRelacionesSelectReporteTipoVivienda;
	//public JList<Reporte> jListRelacionesSelectReporteTipoVivienda;
	//public JScrollPane jScrollRelacionesSelectReporteTipoVivienda;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoTipoVivienda;
	//protected JCheckBox jCheckBoxConGraficoDinamicoTipoVivienda;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoTipoVivienda;
	//public JLabel jLabelTiposArchivoReporteDinamicoTipoVivienda;
	
		
	//public JLabel jLabelArchivoImportacionTipoVivienda;	
	//public JLabel jLabelPathArchivoImportacionTipoVivienda;
	//protected JTextField jTextFieldPathArchivoImportacionTipoVivienda;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoTipoVivienda;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoTipoVivienda;
	
	//public JLabel jLabelColumnaCategoriaValorTipoVivienda;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorTipoVivienda;
	
	//public JLabel jLabelColumnasValoresGraficoTipoVivienda;
	//public JList<Reporte> jListColumnasValoresGraficoTipoVivienda;
	//public JScrollPane jScrollColumnasValoresGraficoTipoVivienda;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoTipoVivienda;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoTipoVivienda;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasTipoVivienda;
	
	
	
	
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
	public TipoViviendaJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("TipoVivienda No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoViviendaJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoVivienda No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoViviendaJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoVivienda No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoViviendaJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoVivienda No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionTipoVivienda)	{
		this.jButtonRecargarInformacionTipoVivienda = jButtonRecargarInformacionTipoVivienda;
	}
	
	public JButton getjButtonProcesarInformacionTipoVivienda() {
		return this.jButtonProcesarInformacionTipoVivienda;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoVivienda)	{
		this.jButtonProcesarInformacionTipoVivienda = jButtonProcesarInformacionTipoVivienda;
	}
	
	
	public JButton getjButtonRecargarInformacionTipoVivienda() {
		return this.jButtonRecargarInformacionTipoVivienda;
	}
	
	
	public List<TipoVivienda> gettipoviviendas() {
		return this.tipoviviendas;
	}

	public void settipoviviendas(List<TipoVivienda> tipoviviendas) {
		this.tipoviviendas = tipoviviendas;
	}
	
	public List<TipoVivienda> gettipoviviendasAux() {
		return this.tipoviviendasAux;
	}

	public void settipoviviendasAux(List<TipoVivienda> tipoviviendasAux) {
		this.tipoviviendasAux = tipoviviendasAux;
	}
	
	public List<TipoVivienda> gettipoviviendasEliminados() {
		return this.tipoviviendasEliminados;
	}

	public void setTipoViviendasEliminados(List<TipoVivienda> tipoviviendasEliminados) {
		this.tipoviviendasEliminados = tipoviviendasEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarTipoVivienda() {
		return jComboBoxTiposSeleccionarTipoVivienda;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarTipoVivienda(
			JComboBox jComboBoxTiposSeleccionarTipoVivienda) {
		this.jComboBoxTiposSeleccionarTipoVivienda = jComboBoxTiposSeleccionarTipoVivienda;
	}
	
	public void setBorderResaltarTiposSeleccionarTipoVivienda() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarTipoVivienda.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarTipoVivienda .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralTipoVivienda() {
		return jTextFieldValorCampoGeneralTipoVivienda;
	}

	public void setjTextFieldValorCampoGeneralTipoVivienda(
			JTextField jTextFieldValorCampoGeneralTipoVivienda) {
		this.jTextFieldValorCampoGeneralTipoVivienda = jTextFieldValorCampoGeneralTipoVivienda;
	}

	public void setBorderResaltarValorCampoGeneralTipoVivienda() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoVivienda.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralTipoVivienda .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosTipoVivienda() {
		return this.jCheckBoxSeleccionarTodosTipoVivienda;
	}

	public void setjCheckBoxSeleccionarTodosTipoVivienda(
			JCheckBox jCheckBoxSeleccionarTodosTipoVivienda) {
		this.jCheckBoxSeleccionarTodosTipoVivienda = jCheckBoxSeleccionarTodosTipoVivienda;
	}

	public void setBorderResaltarSeleccionarTodosTipoVivienda() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoVivienda.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosTipoVivienda .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosTipoVivienda() {
		return this.jCheckBoxSeleccionadosTipoVivienda;
	}

	public void setjCheckBoxSeleccionadosTipoVivienda(
			JCheckBox jCheckBoxSeleccionadosTipoVivienda) {
		this.jCheckBoxSeleccionadosTipoVivienda = jCheckBoxSeleccionadosTipoVivienda;
	}
	
	public void setBorderResaltarSeleccionadosTipoVivienda() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoVivienda.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosTipoVivienda .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesTipoVivienda() {
		return this.jComboBoxTiposArchivosReportesTipoVivienda;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesTipoVivienda(
			JComboBox jComboBoxTiposArchivosReportesTipoVivienda) {
		this.jComboBoxTiposArchivosReportesTipoVivienda = jComboBoxTiposArchivosReportesTipoVivienda;
	}

	public void setBorderResaltarTiposArchivosReportesTipoVivienda() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoVivienda.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesTipoVivienda .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesTipoVivienda() {
		return this.jComboBoxTiposReportesTipoVivienda;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesTipoVivienda(
			JComboBox jComboBoxTiposReportesTipoVivienda) {
		this.jComboBoxTiposReportesTipoVivienda = jComboBoxTiposReportesTipoVivienda;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoTipoVivienda() {
	//	return jComboBoxTiposReportesDinamicoTipoVivienda;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoTipoVivienda(
	//		JComboBox jComboBoxTiposReportesDinamicoTipoVivienda) {
	//	this.jComboBoxTiposReportesDinamicoTipoVivienda = jComboBoxTiposReportesDinamicoTipoVivienda;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoTipoVivienda() {
	//	return jComboBoxTiposArchivosReportesDinamicoTipoVivienda;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoTipoVivienda(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoTipoVivienda) {
	//	this.jComboBoxTiposArchivosReportesDinamicoTipoVivienda = jComboBoxTiposArchivosReportesDinamicoTipoVivienda;
	//}
	
	public void setBorderResaltarTiposReportesTipoVivienda() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoVivienda.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesTipoVivienda .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesTipoVivienda() {
		return this.jComboBoxTiposGraficosReportesTipoVivienda;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesTipoVivienda(
			JComboBox jComboBoxTiposGraficosReportesTipoVivienda) {
		this.jComboBoxTiposGraficosReportesTipoVivienda = jComboBoxTiposGraficosReportesTipoVivienda;
	}
	
	public void setBorderResaltarTiposGraficosReportesTipoVivienda() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoVivienda.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesTipoVivienda .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionTipoVivienda() {
		return this.jComboBoxTiposPaginacionTipoVivienda;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionTipoVivienda(
			JComboBox jComboBoxTiposPaginacionTipoVivienda) {
		this.jComboBoxTiposPaginacionTipoVivienda = jComboBoxTiposPaginacionTipoVivienda;
	}
	
	public void setBorderResaltarTiposPaginacionTipoVivienda() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoVivienda.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionTipoVivienda .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesTipoVivienda() {
		return this.jComboBoxTiposRelacionesTipoVivienda;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoVivienda() {
		return this.jComboBoxTiposAccionesTipoVivienda;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoVivienda(
			JComboBox jComboBoxTiposRelacionesTipoVivienda) {
		this.jComboBoxTiposRelacionesTipoVivienda = jComboBoxTiposRelacionesTipoVivienda;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoVivienda(
			JComboBox jComboBoxTiposAccionesTipoVivienda) {
		this.jComboBoxTiposAccionesTipoVivienda = jComboBoxTiposAccionesTipoVivienda;
	}
	
	public void setBorderResaltarTiposRelacionesTipoVivienda() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoVivienda.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesTipoVivienda .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesTipoVivienda() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoVivienda.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesTipoVivienda .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoTipoVivienda() {
	//	return jCheckBoxConGraficoDinamicoTipoVivienda;
	//}

	//public void setjCheckBoxConGraficoDinamicoTipoVivienda(
	//		JCheckBox jCheckBoxConGraficoDinamicoTipoVivienda) {
	//	this.jCheckBoxConGraficoDinamicoTipoVivienda = jCheckBoxConGraficoDinamicoTipoVivienda;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoTipoVivienda() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarTipoVivienda.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoTipoVivienda .setBorder(borderResaltar);		
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
		this.tipoviviendaSessionBean=new TipoViviendaSessionBean();
		
		this.tipoviviendaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipoviviendaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipoviviendaSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=TipoViviendaJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=TipoViviendaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoViviendaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoViviendaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoViviendaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Vivienda MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.tipoviviendaSessionBean.getEsGuardarRelacionado()) {
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
		
		TipoViviendaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("TipoVivienda No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarTipoVivienda= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarTipoVivienda=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarTipoVivienda,this.jTtoolBarTipoVivienda,
							"nuevo","nuevo","Nuevo"+" "+TipoViviendaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoVivienda=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarTipoVivienda,this.jTtoolBarTipoVivienda,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoVivienda=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarTipoVivienda,this.jTtoolBarTipoVivienda,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+TipoViviendaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarTipoVivienda=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarTipoVivienda,this.jTtoolBarTipoVivienda,
							"duplicar","duplicar","Duplicar"+" "+TipoViviendaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarTipoVivienda=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarTipoVivienda,this.jTtoolBarTipoVivienda,
							"copiar","copiar","Copiar"+" "+TipoViviendaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarTipoVivienda=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarTipoVivienda,this.jTtoolBarTipoVivienda,
							"ver_form","ver_form","Ver"+" "+TipoViviendaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarTipoVivienda=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoVivienda,this.jTtoolBarTipoVivienda,
							"recargar","recargar","Recargar"+" "+TipoViviendaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarTipoVivienda=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoVivienda,this.jTtoolBarTipoVivienda,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarTipoVivienda=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoVivienda,this.jTtoolBarTipoVivienda,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarTipoVivienda=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarTipoVivienda,this.jTtoolBarTipoVivienda,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarTipoVivienda=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarTipoVivienda,this.jTtoolBarTipoVivienda,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarTipoVivienda=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarTipoVivienda,this.jTtoolBarTipoVivienda,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+TipoViviendaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarTipoVivienda=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarTipoVivienda,this.jTtoolBarTipoVivienda,
							"cerrar","cerrar","Salir"+" "+TipoViviendaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarTipoVivienda=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarTipoVivienda;
			
				this.jButtonProcesarInformacionToolBarTipoVivienda=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarTipoVivienda;
				
		//protected JButton jButtonModificarToolBarTipoVivienda;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarTipoVivienda=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuTipoVivienda=new JMenuMe("General");
		this.jmenuArchivoTipoVivienda=new JMenuMe("Archivo");
		this.jmenuAccionesTipoVivienda=new JMenuMe("Acciones");
		this.jmenuDatosTipoVivienda=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoVivienda= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoVivienda.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoVivienda,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoVivienda, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarTipoVivienda= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarTipoVivienda.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarTipoVivienda,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarTipoVivienda, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesTipoVivienda= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesTipoVivienda.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesTipoVivienda,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesTipoVivienda, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosTipoVivienda= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoVivienda.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoVivienda,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoVivienda, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarTipoVivienda= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarTipoVivienda.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarTipoVivienda,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarTipoVivienda, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormTipoVivienda= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormTipoVivienda.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormTipoVivienda,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormTipoVivienda, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaTipoVivienda= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaTipoVivienda.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaTipoVivienda,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaTipoVivienda, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoVivienda= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoVivienda.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoVivienda,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoVivienda, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionTipoVivienda= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionTipoVivienda.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionTipoVivienda,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionTipoVivienda, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionTipoVivienda= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionTipoVivienda.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionTipoVivienda,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresTipoVivienda= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresTipoVivienda.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresTipoVivienda,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresTipoVivienda, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesTipoVivienda= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesTipoVivienda.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesTipoVivienda,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesTipoVivienda, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByTipoVivienda= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByTipoVivienda.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByTipoVivienda,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByTipoVivienda, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoVivienda= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoVivienda.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoVivienda,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoVivienda, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByTipoVivienda= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByTipoVivienda.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByTipoVivienda,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByTipoVivienda, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoVivienda= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoVivienda.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoVivienda,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoVivienda, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosTipoVivienda= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosTipoVivienda.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosTipoVivienda,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosTipoVivienda, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoTipoVivienda.add(this.jMenuItemCerrarTipoVivienda);
			
			this.jmenuAccionesTipoVivienda.add(this.jMenuItemNuevoTipoVivienda);
			this.jmenuAccionesTipoVivienda.add(this.jMenuItemNuevoGuardarCambiosTipoVivienda);
			this.jmenuAccionesTipoVivienda.add(this.jMenuItemNuevoRelacionesTipoVivienda);
			this.jmenuAccionesTipoVivienda.add(this.jMenuItemGuardarCambiosTablaTipoVivienda);		
			this.jmenuAccionesTipoVivienda.add(this.jMenuItemDuplicarTipoVivienda);		
			this.jmenuAccionesTipoVivienda.add(this.jMenuItemCopiarTipoVivienda);		
			this.jmenuAccionesTipoVivienda.add(this.jMenuItemVerFormTipoVivienda);		
			
			this.jmenuDatosTipoVivienda.add(this.jMenuItemRecargarInformacionTipoVivienda);				
			this.jmenuDatosTipoVivienda.add(this.jMenuItemAnterioresTipoVivienda);				
			this.jmenuDatosTipoVivienda.add(this.jMenuItemSiguientesTipoVivienda);				
			this.jmenuDatosTipoVivienda.add(this.jMenuItemAbrirOrderByTipoVivienda);				
			this.jmenuDatosTipoVivienda.add(this.jMenuItemMostrarOcultarTipoVivienda);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesTipoVivienda.add(this.jMenuItemGuardarCambiosTipoVivienda);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoTipoVivienda, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesTipoVivienda, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosTipoVivienda, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarTipoVivienda.add(this.jmenuArchivoTipoVivienda);		
			this.jmenuBarTipoVivienda.add(this.jmenuAccionesTipoVivienda);		
			this.jmenuBarTipoVivienda.add(this.jmenuDatosTipoVivienda);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarTipoVivienda);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasTipoVivienda() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		

		this.jTabbedPaneBusquedasTipoVivienda=new JTabbedPane();


		this.jTabbedPaneBusquedasTipoVivienda.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoVivienda.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoVivienda.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasTipoVivienda.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasTipoVivienda.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasTipoVivienda,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleTipoVivienda = new TipoViviendaDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Tipo Vivienda DATOS");
			this.jInternalFrameDetalleFormTipoVivienda = new TipoViviendaDetalleFormJInternalFrame(jDesktopPane,this.tipoviviendaSessionBean.getConGuardarRelaciones(),this.tipoviviendaSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormTipoVivienda = null;//new TipoViviendaDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoVivienda= new GridBagLayout();
		
		
		this.jTableDatosTipoVivienda = new JTableMe();      
		
		String sToolTipTipoVivienda="";
		sToolTipTipoVivienda=TipoViviendaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoVivienda+="(Cartera.TipoVivienda)";
		}
		
		if(!this.tipoviviendaSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoVivienda+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosTipoVivienda.setToolTipText(sToolTipTipoVivienda);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosTipoVivienda);
		this.jTableDatosTipoVivienda.setAutoCreateRowSorter(true);
		this.jTableDatosTipoVivienda.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosTipoVivienda.setRowSelectionAllowed(true);
		this.jTableDatosTipoVivienda.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosTipoVivienda,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoTipoVivienda = new JButtonMe();
		this.jButtonDuplicarTipoVivienda = new JButtonMe();
		this.jButtonCopiarTipoVivienda = new JButtonMe();
		this.jButtonVerFormTipoVivienda = new JButtonMe();
		this.jButtonNuevoRelacionesTipoVivienda = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaTipoVivienda = new JButtonMe();
		this.jButtonCerrarTipoVivienda = new JButtonMe();
		
		this.jScrollPanelDatosTipoVivienda = new JScrollPane();   
        this.jScrollPanelDatosGeneralTipoVivienda = new JScrollPane();
		
				
		
		
		this.jPanelAccionesTipoVivienda = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Vivienda";
		
		if(!this.tipoviviendaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoVivienda.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Viviendas" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoVivienda.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralTipoVivienda.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesTipoVivienda.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoVivienda.setToolTipText("Acciones");
        this.jPanelAccionesTipoVivienda.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoVivienda, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoVivienda, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoTipoVivienda=new ReporteDinamicoJInternalFrame(TipoViviendaConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoTipoVivienda();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionTipoVivienda=new ImportacionJInternalFrame(TipoViviendaConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionTipoVivienda();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByTipoVivienda = new JButtonMe();
		
		this.jButtonAbrirOrderByTipoVivienda.setText("Orden");
		this.jButtonAbrirOrderByTipoVivienda.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoVivienda,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoVivienda, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByTipoVivienda.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByTipoVivienda.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoVivienda=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoVivienda,false,this);
			
			//this.cargarOrderByTipoVivienda(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoVivienda=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoVivienda,true,this);
			
			//this.cargarOrderByTipoVivienda(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosTipoVivienda.setMinimumSize(new Dimension(400,50));//430
		this.jTableDatosTipoVivienda.setMaximumSize(new Dimension(400,50));//430
		this.jTableDatosTipoVivienda.setPreferredSize(new Dimension(400,50));//430
		
		this.jScrollPanelDatosTipoVivienda.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoVivienda.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoVivienda.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoTipoVivienda.setText("Nuevo");
		this.jButtonDuplicarTipoVivienda.setText("Duplicar");
		this.jButtonCopiarTipoVivienda.setText("Copiar");
		this.jButtonVerFormTipoVivienda.setText("Ver");
		this.jButtonNuevoRelacionesTipoVivienda.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaTipoVivienda.setText("Guardar");
		this.jButtonCerrarTipoVivienda.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoVivienda,"nuevo_button","Nuevo",this.tipoviviendaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarTipoVivienda,"duplicar_button","Duplicar",this.tipoviviendaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarTipoVivienda,"copiar_button","Copiar",this.tipoviviendaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormTipoVivienda,"ver_form","Ver",this.tipoviviendaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesTipoVivienda,"nuevorelaciones_button","Nuevo Rel",this.tipoviviendaSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoVivienda,"guardarcambiostabla_button","Guardar",this.tipoviviendaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoVivienda,"cerrar_button","Salir",this.tipoviviendaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoVivienda, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarTipoVivienda, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarTipoVivienda, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormTipoVivienda, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesTipoVivienda, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoVivienda, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoVivienda, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoTipoVivienda.setToolTipText("Nuevo"+" "+TipoViviendaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarTipoVivienda.setToolTipText("Duplicar"+" "+TipoViviendaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarTipoVivienda.setToolTipText("Copiar"+" "+TipoViviendaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormTipoVivienda.setToolTipText("Ver"+" "+TipoViviendaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesTipoVivienda.setToolTipText("Nuevo Rel"+" "+TipoViviendaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaTipoVivienda.setToolTipText("Guardar"+" "+TipoViviendaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoVivienda.setToolTipText("Salir"+" "+TipoViviendaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoVivienda";
		inputMap = this.jButtonNuevoTipoVivienda.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoVivienda.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoVivienda"));
		
		//DUPLICAR
		sMapKey = "DuplicarTipoVivienda";
		inputMap = this.jButtonDuplicarTipoVivienda.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarTipoVivienda.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarTipoVivienda"));
		
		//COPIAR
		sMapKey = "CopiarTipoVivienda";
		inputMap = this.jButtonCopiarTipoVivienda.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarTipoVivienda.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarTipoVivienda"));
		
		//VEr FORM
		sMapKey = "VerFormTipoVivienda";
		inputMap = this.jButtonVerFormTipoVivienda.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormTipoVivienda.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormTipoVivienda"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesTipoVivienda";
		inputMap = this.jButtonNuevoRelacionesTipoVivienda.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesTipoVivienda.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesTipoVivienda"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarTipoVivienda";
		inputMap = this.jButtonModificarTipoVivienda.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarTipoVivienda.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarTipoVivienda"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarTipoVivienda";
		inputMap = this.jButtonCerrarTipoVivienda.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoVivienda.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoVivienda"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoVivienda";
		inputMap = this.jButtonGuardarCambiosTablaTipoVivienda.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoVivienda.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoVivienda"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesTipoVivienda = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesTipoVivienda = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionTipoVivienda = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1TipoVivienda= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2TipoVivienda= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3TipoVivienda= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4TipoVivienda= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5TipoVivienda= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesTipoVivienda.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesTipoVivienda.setName("jPanelParametrosReportesTipoVivienda"); 
		
		this.jPanelParametrosReportesAccionesTipoVivienda.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesTipoVivienda.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesTipoVivienda.setName("jPanelParametrosReportesAccionesTipoVivienda"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesTipoVivienda, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesTipoVivienda, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionTipoVivienda = new JButtonMe();
		this.jButtonRecargarInformacionTipoVivienda.setText("Recargar");
		this.jButtonRecargarInformacionTipoVivienda.setToolTipText("Recargar"+" "+TipoViviendaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionTipoVivienda,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionTipoVivienda = new JButtonMe();
		this.jButtonProcesarInformacionTipoVivienda.setText("Procesar");
		this.jButtonProcesarInformacionTipoVivienda.setToolTipText("Procesar"+" "+TipoViviendaConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionTipoVivienda.setVisible(false);
			
		this.jButtonProcesarInformacionTipoVivienda.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoVivienda.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoVivienda.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesTipoVivienda = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoVivienda.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesTipoVivienda.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesTipoVivienda = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoVivienda.setText("TIPO");       
		this.jComboBoxTiposReportesTipoVivienda.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesTipoVivienda = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoVivienda.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesTipoVivienda.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionTipoVivienda = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionTipoVivienda.setText("Paginacion");
		this.jComboBoxTiposPaginacionTipoVivienda.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesTipoVivienda = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesTipoVivienda.setText("Accion");
		this.jComboBoxTiposRelacionesTipoVivienda.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesTipoVivienda = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoVivienda.setText("Accion");
		this.jComboBoxTiposAccionesTipoVivienda.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarTipoVivienda = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarTipoVivienda.setText("Accion");
		this.jComboBoxTiposSeleccionarTipoVivienda.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralTipoVivienda=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralTipoVivienda.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoVivienda.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoVivienda.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesTipoVivienda = new JLabelMe();
		
		this.jLabelAccionesTipoVivienda.setText("Acciones");		
		this.jLabelAccionesTipoVivienda.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoVivienda.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoVivienda.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosTipoVivienda = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosTipoVivienda.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosTipoVivienda.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosTipoVivienda = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosTipoVivienda.setText("Seleccionados");
		this.jCheckBoxSeleccionadosTipoVivienda.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaTipoVivienda = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaTipoVivienda.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaTipoVivienda.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteTipoVivienda = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteTipoVivienda.setText("Graf.");
		this.jCheckBoxConGraficoReporteTipoVivienda.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresTipoVivienda = new JButtonMe();
		//this.jButtonAnterioresTipoVivienda.setText("<<");
        this.jButtonAnterioresTipoVivienda.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresTipoVivienda,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresTipoVivienda, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesTipoVivienda = new JButtonMe();
		//this.jButtonSiguientesTipoVivienda.setText(">>");
        this.jButtonSiguientesTipoVivienda.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesTipoVivienda,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesTipoVivienda, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosTipoVivienda = new JButtonMe();
		this.jButtonNuevoGuardarCambiosTipoVivienda.setText("Nue");
        this.jButtonNuevoGuardarCambiosTipoVivienda.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosTipoVivienda,"nuevoguardarcambios_button","Nue",this.tipoviviendaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosTipoVivienda, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosTipoVivienda";
		inputMap = this.jButtonNuevoGuardarCambiosTipoVivienda.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosTipoVivienda.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosTipoVivienda"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionTipoVivienda";
		inputMap = this.jButtonRecargarInformacionTipoVivienda.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionTipoVivienda.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionTipoVivienda"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesTipoVivienda";
		inputMap = this.jButtonSiguientesTipoVivienda.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesTipoVivienda.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesTipoVivienda"));
		
		//ANTERIORES		
		sMapKey = "AnterioresTipoVivienda";
		inputMap = this.jButtonAnterioresTipoVivienda.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresTipoVivienda.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresTipoVivienda"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasTipoVivienda();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesTipoVivienda.setMinimumSize(new Dimension(this.getWidth(),TipoViviendaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoViviendaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoVivienda.setMaximumSize(new Dimension(this.getWidth(),TipoViviendaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoViviendaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoVivienda.setPreferredSize(new Dimension(this.getWidth(),TipoViviendaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoViviendaBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionTipoVivienda = new GridBagLayout();

			this.jPanelPaginacionTipoVivienda.setLayout(gridaBagLayoutPaginacionTipoVivienda);						
			
			this.gridBagConstraintsTipoVivienda = new GridBagConstraints();
			this.gridBagConstraintsTipoVivienda.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsTipoVivienda.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoVivienda.gridy = 0;
			this.gridBagConstraintsTipoVivienda.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionTipoVivienda.add(this.jButtonAnterioresTipoVivienda, this.gridBagConstraintsTipoVivienda);
					
						
			this.gridBagConstraintsTipoVivienda = new GridBagConstraints();
			this.gridBagConstraintsTipoVivienda.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoVivienda.gridy = 0;
			
			this.jPanelPaginacionTipoVivienda.add(this.jButtonNuevoGuardarCambiosTipoVivienda, this.gridBagConstraintsTipoVivienda);
						
			
			this.gridBagConstraintsTipoVivienda = new GridBagConstraints();
			this.gridBagConstraintsTipoVivienda.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsTipoVivienda.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoVivienda.gridy = 0;
			this.jPanelPaginacionTipoVivienda.add(this.jButtonSiguientesTipoVivienda, this.gridBagConstraintsTipoVivienda);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsTipoVivienda = new GridBagConstraints();
			this.gridBagConstraintsTipoVivienda.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoVivienda.gridy = 1;
			this.gridBagConstraintsTipoVivienda.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoVivienda.add(this.jButtonNuevoTipoVivienda, this.gridBagConstraintsTipoVivienda);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsTipoVivienda = new GridBagConstraints();
				this.gridBagConstraintsTipoVivienda.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoVivienda.gridy = 1;
				this.gridBagConstraintsTipoVivienda.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionTipoVivienda.add(this.jButtonNuevoRelacionesTipoVivienda, this.gridBagConstraintsTipoVivienda);
			}
			
			
			if(!this.tipoviviendaSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsTipoVivienda = new GridBagConstraints();
				this.gridBagConstraintsTipoVivienda.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoVivienda.gridy = 1;
				this.gridBagConstraintsTipoVivienda.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionTipoVivienda.add(this.jButtonGuardarCambiosTablaTipoVivienda, this.gridBagConstraintsTipoVivienda);
			}
			
			
			
			this.gridBagConstraintsTipoVivienda = new GridBagConstraints();
			this.gridBagConstraintsTipoVivienda.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoVivienda.gridy = 1;
			this.gridBagConstraintsTipoVivienda.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoVivienda.add(this.jButtonDuplicarTipoVivienda, this.gridBagConstraintsTipoVivienda);
			
			this.gridBagConstraintsTipoVivienda = new GridBagConstraints();
			this.gridBagConstraintsTipoVivienda.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoVivienda.gridy = 1;
			this.gridBagConstraintsTipoVivienda.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoVivienda.add(this.jButtonCopiarTipoVivienda, this.gridBagConstraintsTipoVivienda);
		
			this.gridBagConstraintsTipoVivienda = new GridBagConstraints();
			this.gridBagConstraintsTipoVivienda.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoVivienda.gridy = 1;
			this.gridBagConstraintsTipoVivienda.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoVivienda.add(this.jButtonVerFormTipoVivienda, this.gridBagConstraintsTipoVivienda);
		
			this.gridBagConstraintsTipoVivienda = new GridBagConstraints();
			this.gridBagConstraintsTipoVivienda.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoVivienda.gridy = 1;
			this.gridBagConstraintsTipoVivienda.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionTipoVivienda.add(this.jButtonCerrarTipoVivienda, this.gridBagConstraintsTipoVivienda);
		
		
		
		this.jButtonRecargarInformacionTipoVivienda.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoVivienda.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoVivienda.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionTipoVivienda, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesTipoVivienda.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoVivienda.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoVivienda.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesTipoVivienda, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesTipoVivienda.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoVivienda.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoVivienda.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesTipoVivienda, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesTipoVivienda.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoVivienda.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoVivienda.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesTipoVivienda, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionTipoVivienda.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoVivienda.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoVivienda.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionTipoVivienda, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesTipoVivienda.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoVivienda.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoVivienda.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesTipoVivienda, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesTipoVivienda.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoVivienda.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoVivienda.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoVivienda, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarTipoVivienda.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoVivienda.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoVivienda.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarTipoVivienda, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaTipoVivienda.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoVivienda.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoVivienda.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaTipoVivienda, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteTipoVivienda.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoVivienda.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoVivienda.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteTipoVivienda, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosTipoVivienda.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoVivienda.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoVivienda.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosTipoVivienda, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosTipoVivienda.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoVivienda.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoVivienda.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosTipoVivienda, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesTipoVivienda = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesTipoVivienda = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1TipoVivienda = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2TipoVivienda = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3TipoVivienda = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4TipoVivienda = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesTipoVivienda.setLayout(gridaBagParametrosReportesTipoVivienda);
			this.jPanelParametrosReportesAccionesTipoVivienda.setLayout(gridaBagParametrosReportesAccionesTipoVivienda);
			
			
			this.jPanelParametrosAuxiliar1TipoVivienda.setLayout(gridaBagParametrosAuxiliar1TipoVivienda);
			this.jPanelParametrosAuxiliar2TipoVivienda.setLayout(gridaBagParametrosAuxiliar2TipoVivienda);
			this.jPanelParametrosAuxiliar3TipoVivienda.setLayout(gridaBagParametrosAuxiliar3TipoVivienda);
			this.jPanelParametrosAuxiliar4TipoVivienda.setLayout(gridaBagParametrosAuxiliar4TipoVivienda);
			//this.jPanelParametrosAuxiliar5TipoVivienda.setLayout(gridaBagParametrosAuxiliar2TipoVivienda);			
			
			
			
			
			this.gridBagConstraintsTipoVivienda = new GridBagConstraints();
			this.gridBagConstraintsTipoVivienda.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoVivienda.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoVivienda.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoVivienda.add(this.jButtonRecargarInformacionTipoVivienda, this.gridBagConstraintsTipoVivienda);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsTipoVivienda = new GridBagConstraints();
			this.gridBagConstraintsTipoVivienda.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoVivienda.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoVivienda.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoVivienda.add(this.jComboBoxTiposPaginacionTipoVivienda, this.gridBagConstraintsTipoVivienda);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsTipoVivienda = new GridBagConstraints();
			this.gridBagConstraintsTipoVivienda.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoVivienda.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoVivienda.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoVivienda.add(this.jCheckBoxConAltoMaximoTablaTipoVivienda, this.gridBagConstraintsTipoVivienda);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsTipoVivienda = new GridBagConstraints();
			this.gridBagConstraintsTipoVivienda.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoVivienda.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoVivienda.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoVivienda.add(this.jComboBoxTiposArchivosReportesTipoVivienda, this.gridBagConstraintsTipoVivienda);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsTipoVivienda = new GridBagConstraints();
			this.gridBagConstraintsTipoVivienda.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoVivienda.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoVivienda.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoVivienda.add(this.jPanelParametrosAuxiliar1TipoVivienda, this.gridBagConstraintsTipoVivienda);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsTipoVivienda = new GridBagConstraints();
			this.gridBagConstraintsTipoVivienda.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoVivienda.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoVivienda.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoVivienda.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4TipoVivienda.add(this.jComboBoxTiposReportesTipoVivienda, this.gridBagConstraintsTipoVivienda);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsTipoVivienda = new GridBagConstraints();
			this.gridBagConstraintsTipoVivienda.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoVivienda.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoVivienda.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoVivienda.add(this.jPanelParametrosAuxiliar4TipoVivienda, this.gridBagConstraintsTipoVivienda);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsTipoVivienda = new GridBagConstraints();
			this.gridBagConstraintsTipoVivienda.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoVivienda.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoVivienda.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoVivienda.add(this.jComboBoxTiposReportesTipoVivienda, this.gridBagConstraintsTipoVivienda);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsTipoVivienda = new GridBagConstraints();
			this.gridBagConstraintsTipoVivienda.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoVivienda.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoVivienda.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoVivienda.add(this.jCheckBoxGenerarReporteTipoVivienda, this.gridBagConstraintsTipoVivienda);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsTipoVivienda = new GridBagConstraints();
			this.gridBagConstraintsTipoVivienda.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoVivienda.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoVivienda.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoVivienda.add(this.jPanelParametrosAuxiliar2TipoVivienda, this.gridBagConstraintsTipoVivienda);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsTipoVivienda = new GridBagConstraints();
			this.gridBagConstraintsTipoVivienda.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoVivienda.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoVivienda.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoVivienda.add(this.jLabelAccionesTipoVivienda, this.gridBagConstraintsTipoVivienda);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsTipoVivienda = new GridBagConstraints();
				this.gridBagConstraintsTipoVivienda.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsTipoVivienda.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsTipoVivienda.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesTipoVivienda.add(this.jButtonAbrirOrderByTipoVivienda, this.gridBagConstraintsTipoVivienda);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsTipoVivienda = new GridBagConstraints();
			this.gridBagConstraintsTipoVivienda.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsTipoVivienda.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoVivienda.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoVivienda.add(this.jComboBoxTiposSeleccionarTipoVivienda, this.gridBagConstraintsTipoVivienda);			
			
			
			/*
			this.gridBagConstraintsTipoVivienda = new GridBagConstraints();
			this.gridBagConstraintsTipoVivienda.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoVivienda.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoVivienda.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoVivienda.add(this.jCheckBoxSeleccionarTodosTipoVivienda, this.gridBagConstraintsTipoVivienda);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsTipoVivienda = new GridBagConstraints();
			this.gridBagConstraintsTipoVivienda.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoVivienda.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoVivienda.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoVivienda.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoVivienda.add(this.jCheckBoxSeleccionarTodosTipoVivienda, this.gridBagConstraintsTipoVivienda);															
				
			this.gridBagConstraintsTipoVivienda = new GridBagConstraints();
			this.gridBagConstraintsTipoVivienda.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoVivienda.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoVivienda.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoVivienda.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoVivienda.add(this.jCheckBoxSeleccionadosTipoVivienda, this.gridBagConstraintsTipoVivienda);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsTipoVivienda = new GridBagConstraints();
			this.gridBagConstraintsTipoVivienda.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoVivienda.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoVivienda.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoVivienda.add(this.jPanelParametrosAuxiliar3TipoVivienda, this.gridBagConstraintsTipoVivienda);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsTipoVivienda = new GridBagConstraints();
			this.gridBagConstraintsTipoVivienda.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoVivienda.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoVivienda.add(this.jComboBoxTiposRelacionesTipoVivienda, this.gridBagConstraintsTipoVivienda);
				
			this.gridBagConstraintsTipoVivienda = new GridBagConstraints();
			this.gridBagConstraintsTipoVivienda.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoVivienda.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoVivienda.add(this.jComboBoxTiposAccionesTipoVivienda, this.gridBagConstraintsTipoVivienda);
	
				
			this.gridBagConstraintsTipoVivienda = new GridBagConstraints();
			this.gridBagConstraintsTipoVivienda.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoVivienda.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoVivienda.add(this.jTextFieldValorCampoGeneralTipoVivienda, this.gridBagConstraintsTipoVivienda);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosTipoVivienda = new GridBagLayout();

			this.jScrollPanelDatosTipoVivienda.setLayout(gridaBagLayoutDatosTipoVivienda);
			
			this.gridBagConstraintsTipoVivienda = new GridBagConstraints();
			this.gridBagConstraintsTipoVivienda.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoVivienda.gridy = 0;
			this.gridBagConstraintsTipoVivienda.gridx = 0;
			
			this.jScrollPanelDatosTipoVivienda.add(this.jTableDatosTipoVivienda, this.gridBagConstraintsTipoVivienda);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosTipoVivienda.setViewportView(this.jTableDatosTipoVivienda);
		this.jTableDatosTipoVivienda.setFillsViewportHeight(true);
		this.jTableDatosTipoVivienda.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesTipoVivienda= new GridBagLayout();
		this.jPanelAccionesTipoVivienda.setLayout(gridaBagLayoutAccionesTipoVivienda);
		
		
		/*	
		this.gridBagConstraintsTipoVivienda = new GridBagConstraints();
		this.gridBagConstraintsTipoVivienda.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoVivienda.gridy = 0;
		this.gridBagConstraintsTipoVivienda.gridx = 0;
			
		this.jPanelAccionesTipoVivienda.add(this.jButtonNuevoTipoVivienda, this.gridBagConstraintsTipoVivienda);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoVivienda = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoVivienda);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipoviviendaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoVivienda = new GridBagConstraints();						
			this.gridBagConstraintsTipoVivienda.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoVivienda.gridx = 0;		
			//this.gridBagConstraintsTipoVivienda.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoVivienda.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoVivienda.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarTipoVivienda, this.gridBagConstraintsTipoVivienda);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsTipoVivienda = new GridBagConstraints();
		this.gridBagConstraintsTipoVivienda.gridy = iGridyPrincipal++;
		this.gridBagConstraintsTipoVivienda.gridx = 0;		
		//this.gridBagConstraintsTipoVivienda.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoVivienda.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsTipoVivienda.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsTipoVivienda);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsTipoVivienda = new GridBagConstraints();
		this.gridBagConstraintsTipoVivienda.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoVivienda.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesTipoVivienda, this.gridBagConstraintsTipoVivienda);								
		
		
		/*
		this.gridBagConstraintsTipoVivienda = new GridBagConstraints();
		this.gridBagConstraintsTipoVivienda.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoVivienda.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesTipoVivienda, this.gridBagConstraintsTipoVivienda);
		*/		
		
		this.gridBagConstraintsTipoVivienda = new GridBagConstraints();
		this.gridBagConstraintsTipoVivienda.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoVivienda.gridx =0;
		this.gridBagConstraintsTipoVivienda.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoVivienda.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoVivienda, this.gridBagConstraintsTipoVivienda);
				
		
		this.gridBagConstraintsTipoVivienda = new GridBagConstraints();
		this.gridBagConstraintsTipoVivienda.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoVivienda.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionTipoVivienda, this.gridBagConstraintsTipoVivienda);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(TipoViviendaJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosTipoVivienda= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoVivienda = new GridBagLayout();
			this.jPanelBusquedasParametrosTipoVivienda.setLayout(gridaBagLayoutBusquedasParametrosTipoVivienda);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralTipoVivienda=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoVivienda.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoVivienda.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoVivienda.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoVivienda = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsTipoVivienda = new GridBagConstraints();
		this.gridBagConstraintsTipoVivienda.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoVivienda.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoVivienda, this.gridBagConstraintsTipoVivienda);
			
			
		this.gridBagConstraintsTipoVivienda = new GridBagConstraints();
		this.gridBagConstraintsTipoVivienda.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoVivienda.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoVivienda, this.gridBagConstraintsTipoVivienda);
		
			
		this.gridBagConstraintsTipoVivienda = new GridBagConstraints();
		this.gridBagConstraintsTipoVivienda.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoVivienda.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoVivienda, this.gridBagConstraintsTipoVivienda);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralTipoVivienda;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoTipoVivienda() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoTipoVivienda = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoTipoVivienda = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoTipoVivienda.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoTipoVivienda.setName("jPanelReporteDinamicoTipoVivienda"); 
		
		this.jPanelReporteDinamicoTipoVivienda.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoVivienda.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoVivienda.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoTipoVivienda.setLayout(gridaBagLayoutReporteDinamicoTipoVivienda);
		
		
		this.jInternalFrameReporteDinamicoTipoVivienda= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoTipoVivienda = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoVivienda= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoTipoVivienda.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoTipoVivienda.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoTipoVivienda.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoTipoVivienda.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoTipoVivienda.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoTipoVivienda.setResizable(true);
	    this.jInternalFrameReporteDinamicoTipoVivienda.setClosable(true);
	    this.jInternalFrameReporteDinamicoTipoVivienda.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoTipoVivienda.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoVivienda.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoVivienda.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoTipoVivienda.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Viviendas"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteTipoVivienda = new JLabelMe();

		this.jLabelColumnasSelectReporteTipoVivienda.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteTipoVivienda.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoVivienda.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoVivienda.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoVivienda = new GridBagConstraints();
		this.gridBagConstraintsTipoVivienda.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoVivienda.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoVivienda.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoVivienda.add(this.jLabelColumnasSelectReporteTipoVivienda, this.gridBagConstraintsTipoVivienda);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteTipoVivienda = new JList<Reporte>();
		this.jListColumnasSelectReporteTipoVivienda.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteTipoVivienda.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteTipoVivienda.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoVivienda.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoVivienda.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteTipoVivienda=new JScrollPane(this.jListColumnasSelectReporteTipoVivienda);
			
			this.jScrollColumnasSelectReporteTipoVivienda.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoVivienda.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoVivienda.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteTipoVivienda.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTipoVivienda = new GridBagConstraints();
		this.gridBagConstraintsTipoVivienda.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoVivienda.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoVivienda.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoVivienda.add(this.jListColumnasSelectReporteTipoVivienda, this.gridBagConstraintsTipoVivienda);
		this.jPanelReporteDinamicoTipoVivienda.add(this.jScrollColumnasSelectReporteTipoVivienda, this.gridBagConstraintsTipoVivienda);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteTipoVivienda = new JLabelMe();

		this.jLabelRelacionesSelectReporteTipoVivienda.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteTipoVivienda.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoVivienda.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoVivienda.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsTipoVivienda = new GridBagConstraints();
		this.gridBagConstraintsTipoVivienda.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoVivienda.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoVivienda.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoVivienda.add(this.jLabelRelacionesSelectReporteTipoVivienda, this.gridBagConstraintsTipoVivienda);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteTipoVivienda = new JList<Reporte>();
		this.jListRelacionesSelectReporteTipoVivienda.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteTipoVivienda.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteTipoVivienda.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoVivienda.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoVivienda.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteTipoVivienda=new JScrollPane(this.jListRelacionesSelectReporteTipoVivienda);
			
			this.jScrollRelacionesSelectReporteTipoVivienda.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoVivienda.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoVivienda.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteTipoVivienda.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsTipoVivienda = new GridBagConstraints();
		this.gridBagConstraintsTipoVivienda.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoVivienda.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoVivienda.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoVivienda.add(this.jListRelacionesSelectReporteTipoVivienda, this.gridBagConstraintsTipoVivienda);
		this.jPanelReporteDinamicoTipoVivienda.add(this.jScrollRelacionesSelectReporteTipoVivienda, this.gridBagConstraintsTipoVivienda);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoTipoVivienda = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoTipoVivienda = new JComboBoxMe();
		this.jListColumnasValoresGraficoTipoVivienda = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoTipoVivienda = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoTipoVivienda.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoTipoVivienda.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoVivienda.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoVivienda.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoTipoVivienda, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoTipoVivienda = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoTipoVivienda.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoTipoVivienda.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoVivienda.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoVivienda.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoTipoVivienda, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoTipoVivienda = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoTipoVivienda.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoTipoVivienda.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoVivienda.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoVivienda.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoVivienda = new GridBagConstraints();
		this.gridBagConstraintsTipoVivienda.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoVivienda.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoVivienda.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoVivienda.add(this.jLabelGenerarExcelReporteDinamicoTipoVivienda, this.gridBagConstraintsTipoVivienda);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoTipoVivienda = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoTipoVivienda.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoTipoVivienda,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoTipoVivienda.setToolTipText("Generar EXCEL"+" "+TipoViviendaConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsTipoVivienda = new GridBagConstraints();
		//this.gridBagConstraintsTipoVivienda.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsTipoVivienda.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsTipoVivienda.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoTipoVivienda.add(this.jButtonGenerarExcelReporteDinamicoTipoVivienda, this.gridBagConstraintsTipoVivienda);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsTipoVivienda = new GridBagConstraints();
		this.gridBagConstraintsTipoVivienda.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoVivienda.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoVivienda.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoVivienda.add(this.jComboBoxTiposReportesDinamicoTipoVivienda, this.gridBagConstraintsTipoVivienda);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoTipoVivienda = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoTipoVivienda.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoTipoVivienda.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoVivienda.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoVivienda.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoVivienda = new GridBagConstraints();
		this.gridBagConstraintsTipoVivienda.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoVivienda.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoVivienda.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoVivienda.add(this.jLabelTiposArchivoReporteDinamicoTipoVivienda, this.gridBagConstraintsTipoVivienda);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsTipoVivienda = new GridBagConstraints();
		this.gridBagConstraintsTipoVivienda.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoVivienda.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoVivienda.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoVivienda.add(this.jComboBoxTiposArchivosReportesDinamicoTipoVivienda, this.gridBagConstraintsTipoVivienda);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoTipoVivienda = new JButtonMe();
		this.jButtonGenerarReporteDinamicoTipoVivienda.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoTipoVivienda,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoTipoVivienda.setToolTipText("Generar"+" "+TipoViviendaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsTipoVivienda = new GridBagConstraints();
		this.gridBagConstraintsTipoVivienda.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoVivienda.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoVivienda.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoVivienda.add(this.jButtonGenerarReporteDinamicoTipoVivienda, this.gridBagConstraintsTipoVivienda);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoTipoVivienda = new JButtonMe();
		this.jButtonCerrarReporteDinamicoTipoVivienda.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoTipoVivienda,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoTipoVivienda.setToolTipText("Cancelar"+" "+TipoViviendaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoVivienda = new GridBagConstraints();
		this.gridBagConstraintsTipoVivienda.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoVivienda.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoVivienda.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoVivienda.add(this.jButtonCerrarReporteDinamicoTipoVivienda, this.gridBagConstraintsTipoVivienda);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalTipoVivienda = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoTipoVivienda= new JScrollPane(jPanelReporteDinamicoTipoVivienda,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoTipoVivienda.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoVivienda.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoVivienda.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoTipoVivienda.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Viviendas"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoVivienda = new GridBagConstraints();
		this.gridBagConstraintsTipoVivienda.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsTipoVivienda.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsTipoVivienda.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoTipoVivienda.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoTipoVivienda.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalTipoVivienda);
		this.jInternalFrameReporteDinamicoTipoVivienda.getContentPane().add(this.jScrollPanelReporteDinamicoTipoVivienda, this.gridBagConstraintsTipoVivienda);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionTipoVivienda() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionTipoVivienda = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionTipoVivienda = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionTipoVivienda.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionTipoVivienda.setName("jPanelImportacionTipoVivienda"); 
		
		this.jPanelImportacionTipoVivienda.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoVivienda.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoVivienda.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionTipoVivienda.setLayout(gridaBagLayoutImportacionTipoVivienda);
		
		
		this.jInternalFrameImportacionTipoVivienda= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionTipoVivienda= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionTipoVivienda = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoVivienda= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionTipoVivienda.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoVivienda.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoVivienda.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionTipoVivienda.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoVivienda.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoVivienda.setResizable(true);
	    this.jInternalFrameImportacionTipoVivienda.setClosable(true);
	    this.jInternalFrameImportacionTipoVivienda.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionTipoVivienda.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoVivienda.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoVivienda.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionTipoVivienda.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoVivienda.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoVivienda.setResizable(true);
	    this.jInternalFrameImportacionTipoVivienda.setClosable(true);
	    this.jInternalFrameImportacionTipoVivienda.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionTipoVivienda.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoVivienda.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoVivienda.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionTipoVivienda.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Viviendas"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionTipoVivienda = new JLabelMe();

		this.jLabelArchivoImportacionTipoVivienda.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionTipoVivienda.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoVivienda.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoVivienda.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoVivienda = new GridBagConstraints();
		this.gridBagConstraintsTipoVivienda.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoVivienda.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoVivienda.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoVivienda.add(this.jLabelArchivoImportacionTipoVivienda, this.gridBagConstraintsTipoVivienda);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionTipoVivienda = new JFileChooser();		
		this.jFileChooserImportacionTipoVivienda.setToolTipText("ESCOGER ARCHIVO"+" "+TipoViviendaConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionTipoVivienda = new JButtonMe();
		this.jButtonAbrirImportacionTipoVivienda.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionTipoVivienda,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionTipoVivienda.setToolTipText("Generar"+" "+TipoViviendaConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsTipoVivienda = new GridBagConstraints();
		this.gridBagConstraintsTipoVivienda.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoVivienda.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoVivienda.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoVivienda.add(this.jButtonAbrirImportacionTipoVivienda, this.gridBagConstraintsTipoVivienda);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionTipoVivienda = new JLabelMe();

		this.jLabelPathArchivoImportacionTipoVivienda.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionTipoVivienda.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoVivienda.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoVivienda.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoVivienda = new GridBagConstraints();
		this.gridBagConstraintsTipoVivienda.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoVivienda.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoVivienda.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoVivienda.add(this.jLabelPathArchivoImportacionTipoVivienda, this.gridBagConstraintsTipoVivienda);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionTipoVivienda=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionTipoVivienda.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoVivienda.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoVivienda.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsTipoVivienda = new GridBagConstraints();
		this.gridBagConstraintsTipoVivienda.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoVivienda.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoVivienda.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoVivienda.add(this.jTextFieldPathArchivoImportacionTipoVivienda, this.gridBagConstraintsTipoVivienda);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionTipoVivienda = new JButtonMe();
		this.jButtonGenerarImportacionTipoVivienda.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionTipoVivienda,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionTipoVivienda.setToolTipText("Generar"+" "+TipoViviendaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsTipoVivienda = new GridBagConstraints();
		this.gridBagConstraintsTipoVivienda.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoVivienda.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoVivienda.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoVivienda.add(this.jButtonGenerarImportacionTipoVivienda, this.gridBagConstraintsTipoVivienda);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionTipoVivienda = new JButtonMe();
		this.jButtonCerrarImportacionTipoVivienda.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionTipoVivienda,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionTipoVivienda.setToolTipText("Cancelar"+" "+TipoViviendaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoVivienda = new GridBagConstraints();
		this.gridBagConstraintsTipoVivienda.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoVivienda.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoVivienda.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoVivienda.add(this.jButtonCerrarImportacionTipoVivienda, this.gridBagConstraintsTipoVivienda);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalTipoVivienda = new GridBagLayout();
		
		this.jScrollPanelImportacionTipoVivienda= new JScrollPane(jPanelImportacionTipoVivienda,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsTipoVivienda = new GridBagConstraints();
		this.gridBagConstraintsTipoVivienda.gridy =iPosYImportacion;
		this.gridBagConstraintsTipoVivienda.gridx =iPosXImportacion;
		this.gridBagConstraintsTipoVivienda.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionTipoVivienda.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionTipoVivienda.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalTipoVivienda);
		this.jInternalFrameImportacionTipoVivienda.getContentPane().add(this.jScrollPanelImportacionTipoVivienda, this.gridBagConstraintsTipoVivienda);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByTipoVivienda(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByTipoVivienda = new JButtonMe();
			this.jButtonAbrirOrderByTipoVivienda.setText("Orden");
			this.jButtonAbrirOrderByTipoVivienda.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoVivienda,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoVivienda, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByTipoVivienda";
			inputMap = this.jButtonAbrirOrderByTipoVivienda.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByTipoVivienda.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByTipoVivienda"));
		
		
			GridBagLayout gridaBagLayoutOrderByTipoVivienda = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByTipoVivienda = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByTipoVivienda.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByTipoVivienda.setName("jPanelOrderByTipoVivienda"); 
			
			this.jPanelOrderByTipoVivienda.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoVivienda.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoVivienda.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByTipoVivienda, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByTipoVivienda.setLayout(gridaBagLayoutOrderByTipoVivienda);
			
			
			this.jTableDatosTipoViviendaOrderBy = new JTableMe();        
			this.jTableDatosTipoViviendaOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosTipoViviendaOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosTipoViviendaOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosTipoViviendaOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosTipoViviendaOrderBy.setViewportView(this.jTableDatosTipoViviendaOrderBy);
			this.jTableDatosTipoViviendaOrderBy.setFillsViewportHeight(true);
			this.jTableDatosTipoViviendaOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByTipoVivienda= new OrderByJInternalFrame();
			this.jInternalFrameOrderByTipoVivienda= new OrderByJInternalFrame();
			this.jScrollPanelOrderByTipoVivienda = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteTipoVivienda= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByTipoVivienda.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByTipoVivienda.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByTipoVivienda.setTitle("Orden");
			this.jInternalFrameOrderByTipoVivienda.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByTipoVivienda.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByTipoVivienda.setResizable(true);
			this.jInternalFrameOrderByTipoVivienda.setClosable(true);
			this.jInternalFrameOrderByTipoVivienda.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByTipoVivienda, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByTipoVivienda.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoVivienda.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoVivienda.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByTipoVivienda, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByTipoVivienda.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Viviendas"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsTipoVivienda = new GridBagConstraints();
			this.gridBagConstraintsTipoVivienda.gridy =iPosYOrderBy++;
			this.gridBagConstraintsTipoVivienda.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoVivienda.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsTipoVivienda.ipady =150;
				
			this.jPanelOrderByTipoVivienda.add(jScrollPanelDatosTipoViviendaOrderBy, this.gridBagConstraintsTipoVivienda);//this.jTableDatosTipoViviendaTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByTipoVivienda = new JButtonMe();
			this.jButtonCerrarOrderByTipoVivienda.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByTipoVivienda,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByTipoVivienda.setToolTipText("Cancelar"+" "+TipoViviendaConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByTipoVivienda, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsTipoVivienda = new GridBagConstraints();
			this.gridBagConstraintsTipoVivienda.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoVivienda.gridy = iPosYOrderBy++;
			this.gridBagConstraintsTipoVivienda.gridx = iPosXOrderBy;
									
			this.jPanelOrderByTipoVivienda.add(this.jButtonCerrarOrderByTipoVivienda, this.gridBagConstraintsTipoVivienda);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalTipoVivienda = new GridBagLayout();
			
			this.jScrollPanelOrderByTipoVivienda= new JScrollPane(jPanelOrderByTipoVivienda,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsTipoVivienda = new GridBagConstraints();
			this.gridBagConstraintsTipoVivienda.gridy =iPosYOrderBy;
			this.gridBagConstraintsTipoVivienda.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoVivienda.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByTipoVivienda.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByTipoVivienda.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalTipoVivienda);
			
			this.jInternalFrameOrderByTipoVivienda.getContentPane().add(this.jScrollPanelOrderByTipoVivienda, this.gridBagConstraintsTipoVivienda);			
		
		} else {
			this.jButtonAbrirOrderByTipoVivienda = new JButtonMe();
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
			&& this.tipoviviendaSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosTipoVivienda.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosTipoVivienda.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosTipoVivienda.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosTipoVivienda.getRowHeight();//TipoViviendaConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.tipoviviendaSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > TipoViviendaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoVivienda.isSelected()) {
					iHeightTable=TipoViviendaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoViviendaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoViviendaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > TipoViviendaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoVivienda.isSelected()) {
					iHeightTable=TipoViviendaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoViviendaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoViviendaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosTipoVivienda.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoVivienda.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoVivienda.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosTipoVivienda.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoVivienda.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoVivienda.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByTipoVivienda!=null && this.jInternalFrameOrderByTipoVivienda.getjTableDatosOrderBy()!=null) {
			//if(!this.tipoviviendaSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByTipoVivienda.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByTipoVivienda.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByTipoVivienda.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByTipoVivienda.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByTipoVivienda.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByTipoVivienda.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByTipoVivienda.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosTipoVivienda.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoVivienda.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoVivienda.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=tipoviviendaLogic.getTipoViviendas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipoviviendas.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<TipoVivienda> TraerTipoViviendaBeans(List<TipoVivienda> tipoviviendas,ArrayList<Classe> classes)throws Exception {
		try {
			for(TipoVivienda tipovivienda:tipoviviendas) {
					
				if(!(TipoViviendaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || TipoViviendaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					tipovivienda.setsDetalleGeneralEntityReporte(TipoViviendaConstantesFunciones.getTipoViviendaDescripcion(tipovivienda));
										
						
					
					

					if(tipovivienda.getDireccions()!=null && Funciones.existeClass(classes,Direccion.class)) {
						try{tipovivienda.setdireccionsDescripcionReporte(new JRBeanCollectionDataSource(DireccionJInternalFrame.TraerDireccionBeans(tipovivienda.getDireccions(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//tipovivienda.setsDetalleGeneralEntityReporte(tipovivienda.getsDetalleGeneralEntityReporte());
										
				}
				
				//tipoviviendabeans.add(tipoviviendabean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return tipoviviendas;
    }
	//PARA REPORTES FIN
}
