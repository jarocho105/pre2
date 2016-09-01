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


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;

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
import com.bydan.erp.tesoreria.util.TipoMovimiento_TSConstantesFunciones;

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
public class TipoMovimiento_TSJInternalFrame extends TipoMovimiento_TSBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarTipoMovimiento_TS;
	
	protected JMenuBar jmenuBarTipoMovimiento_TS;
	
	protected JMenu jmenuTipoMovimiento_TS;
	protected JMenu jmenuDatosTipoMovimiento_TS;
	protected JMenu jmenuArchivoTipoMovimiento_TS;
	protected JMenu jmenuAccionesTipoMovimiento_TS;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosTipoMovimiento_TS = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoMovimiento_TS;	
	protected GridBagConstraints gridBagConstraintsTipoMovimiento_TS;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public TipoMovimiento_TSDetalleFormJInternalFrame jInternalFrameDetalleFormTipoMovimiento_TS;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoTipoMovimiento_TS;	
	protected ImportacionJInternalFrame jInternalFrameImportacionTipoMovimiento_TS;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public TipoMovimiento_TSSessionBean tipomovimiento_tsSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<TipoMovimiento_TS> tipomovimiento_tss;		
	public List<TipoMovimiento_TS> tipomovimiento_tssEliminados;	
	public List<TipoMovimiento_TS> tipomovimiento_tssAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByTipoMovimiento_TS;		
	protected JButton jButtonAbrirOrderByTipoMovimiento_TS;
	
	
	//protected JPanel jPanelOrderByTipoMovimiento_TS;
	//public JScrollPane jScrollPanelOrderByTipoMovimiento_TS;	
	//protected JButton jButtonCerrarOrderByTipoMovimiento_TS;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public TipoMovimiento_TSLogic tipomovimiento_tsLogic;
	
	
	
	public JScrollPane jScrollPanelDatosTipoMovimiento_TS;
	public JScrollPane jScrollPanelDatosEdicionTipoMovimiento_TS;
	public JScrollPane jScrollPanelDatosGeneralTipoMovimiento_TS;
    
	
	
	//public JScrollPane jScrollPanelDatosTipoMovimiento_TSOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoTipoMovimiento_TS;
	//public JScrollPane jScrollPanelImportacionTipoMovimiento_TS;
	
	
	
	protected JPanel jPanelAccionesTipoMovimiento_TS;
	
    protected JPanel jPanelPaginacionTipoMovimiento_TS;
    protected JPanel jPanelParametrosReportesTipoMovimiento_TS;
	protected JPanel jPanelParametrosReportesAccionesTipoMovimiento_TS;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1TipoMovimiento_TS;
	protected JPanel jPanelParametrosAuxiliar2TipoMovimiento_TS;
	protected JPanel jPanelParametrosAuxiliar3TipoMovimiento_TS;
	protected JPanel jPanelParametrosAuxiliar4TipoMovimiento_TS;
	//protected JPanel jPanelParametrosAuxiliar5TipoMovimiento_TS;
	
	
	
	//protected JPanel jPanelReporteDinamicoTipoMovimiento_TS;
	//protected JPanel jPanelImportacionTipoMovimiento_TS;
	
	
	public JTable jTableDatosTipoMovimiento_TS;
	
	
	
	//public JTable jTableDatosTipoMovimiento_TSOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoTipoMovimiento_TS;
	protected JButton jButtonDuplicarTipoMovimiento_TS;
	protected JButton jButtonCopiarTipoMovimiento_TS;
	protected JButton jButtonVerFormTipoMovimiento_TS;
	protected JButton jButtonNuevoRelacionesTipoMovimiento_TS;
	protected JButton jButtonModificarTipoMovimiento_TS;
	
    protected JButton jButtonGuardarCambiosTablaTipoMovimiento_TS;
	protected JButton jButtonCerrarTipoMovimiento_TS;
	
	
	protected JButton jButtonRecargarInformacionTipoMovimiento_TS;
	protected JButton jButtonProcesarInformacionTipoMovimiento_TS;
	
	
	protected JButton jButtonAnterioresTipoMovimiento_TS;
	protected JButton jButtonSiguientesTipoMovimiento_TS;
	protected JButton jButtonNuevoGuardarCambiosTipoMovimiento_TS;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoTipoMovimiento_TS;
	//protected JButton jButtonCerrarReporteDinamicoTipoMovimiento_TS;
	//protected JButton jButtonGenerarExcelReporteDinamicoTipoMovimiento_TS;	
	
	
	
	//protected JButton jButtonAbrirImportacionTipoMovimiento_TS;
	//protected JButton jButtonGenerarImportacionTipoMovimiento_TS;
	//protected JButton jButtonCerrarImportacionTipoMovimiento_TS;
	//protected JFileChooser jFileChooserImportacionTipoMovimiento_TS;
	//protected File fileImportacionTipoMovimiento_TS;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoMovimiento_TS;
	protected JButton jButtonDuplicarToolBarTipoMovimiento_TS;
	protected JButton jButtonNuevoRelacionesToolBarTipoMovimiento_TS;
	
	
	public JButton jButtonGuardarCambiosToolBarTipoMovimiento_TS;
	protected JButton jButtonCopiarToolBarTipoMovimiento_TS;
	protected JButton jButtonVerFormToolBarTipoMovimiento_TS;
	public JButton jButtonGuardarCambiosTablaToolBarTipoMovimiento_TS;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoMovimiento_TS;
	protected JButton jButtonCerrarToolBarTipoMovimiento_TS;
	
	protected JButton jButtonRecargarInformacionToolBarTipoMovimiento_TS;
	protected JButton jButtonProcesarInformacionToolBarTipoMovimiento_TS;
	protected JButton jButtonAnterioresToolBarTipoMovimiento_TS;
	protected JButton jButtonSiguientesToolBarTipoMovimiento_TS;
	protected JButton jButtonNuevoGuardarCambiosToolBarTipoMovimiento_TS;
	protected JButton jButtonAbrirOrderByToolBarTipoMovimiento_TS;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoMovimiento_TS;
	protected JMenuItem jMenuItemDuplicarTipoMovimiento_TS;
	protected JMenuItem jMenuItemNuevoRelacionesTipoMovimiento_TS;
	
	
	protected JMenuItem jMenuItemGuardarCambiosTipoMovimiento_TS;
	protected JMenuItem jMenuItemCopiarTipoMovimiento_TS;
	protected JMenuItem jMenuItemVerFormTipoMovimiento_TS;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoMovimiento_TS;
	protected JMenuItem jMenuItemCerrarTipoMovimiento_TS;
	protected JMenuItem jMenuItemDetalleCerrarTipoMovimiento_TS;
	protected JMenuItem jMenuItemDetalleAbrirOrderByTipoMovimiento_TS;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoMovimiento_TS;
	
	protected JMenuItem jMenuItemRecargarInformacionTipoMovimiento_TS;
	protected JMenuItem jMenuItemProcesarInformacionTipoMovimiento_TS;
	protected JMenuItem jMenuItemAnterioresTipoMovimiento_TS;
	protected JMenuItem jMenuItemSiguientesTipoMovimiento_TS;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoMovimiento_TS;
	protected JMenuItem jMenuItemAbrirOrderByTipoMovimiento_TS;
	protected JMenuItem jMenuItemMostrarOcultarTipoMovimiento_TS;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoMovimiento_TS;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosTipoMovimiento_TS;
	protected JCheckBox jCheckBoxSeleccionadosTipoMovimiento_TS;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaTipoMovimiento_TS;
	protected JCheckBox jCheckBoxConGraficoReporteTipoMovimiento_TS;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesTipoMovimiento_TS;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesTipoMovimiento_TS;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoTipoMovimiento_TS;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoTipoMovimiento_TS;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesTipoMovimiento_TS;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionTipoMovimiento_TS;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoMovimiento_TS;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoMovimiento_TS;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarTipoMovimiento_TS;
	protected JTextField jTextFieldValorCampoGeneralTipoMovimiento_TS;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteTipoMovimiento_TS;
	//public JList<Reporte> jListColumnasSelectReporteTipoMovimiento_TS;
	//public JScrollPane jScrollColumnasSelectReporteTipoMovimiento_TS;
	
	//public JLabel jLabelRelacionesSelectReporteTipoMovimiento_TS;
	//public JList<Reporte> jListRelacionesSelectReporteTipoMovimiento_TS;
	//public JScrollPane jScrollRelacionesSelectReporteTipoMovimiento_TS;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoTipoMovimiento_TS;
	//protected JCheckBox jCheckBoxConGraficoDinamicoTipoMovimiento_TS;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoTipoMovimiento_TS;
	//public JLabel jLabelTiposArchivoReporteDinamicoTipoMovimiento_TS;
	
		
	//public JLabel jLabelArchivoImportacionTipoMovimiento_TS;	
	//public JLabel jLabelPathArchivoImportacionTipoMovimiento_TS;
	//protected JTextField jTextFieldPathArchivoImportacionTipoMovimiento_TS;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoTipoMovimiento_TS;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoTipoMovimiento_TS;
	
	//public JLabel jLabelColumnaCategoriaValorTipoMovimiento_TS;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorTipoMovimiento_TS;
	
	//public JLabel jLabelColumnasValoresGraficoTipoMovimiento_TS;
	//public JList<Reporte> jListColumnasValoresGraficoTipoMovimiento_TS;
	//public JScrollPane jScrollColumnasValoresGraficoTipoMovimiento_TS;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoTipoMovimiento_TS;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoTipoMovimiento_TS;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasTipoMovimiento_TS;
	
	
	
	
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
	public TipoMovimiento_TSJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("TipoMovimiento_TS No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoMovimiento_TSJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoMovimiento_TS No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoMovimiento_TSJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoMovimiento_TS No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoMovimiento_TSJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoMovimiento_TS No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionTipoMovimiento_TS)	{
		this.jButtonRecargarInformacionTipoMovimiento_TS = jButtonRecargarInformacionTipoMovimiento_TS;
	}
	
	public JButton getjButtonProcesarInformacionTipoMovimiento_TS() {
		return this.jButtonProcesarInformacionTipoMovimiento_TS;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoMovimiento_TS)	{
		this.jButtonProcesarInformacionTipoMovimiento_TS = jButtonProcesarInformacionTipoMovimiento_TS;
	}
	
	
	public JButton getjButtonRecargarInformacionTipoMovimiento_TS() {
		return this.jButtonRecargarInformacionTipoMovimiento_TS;
	}
	
	
	public List<TipoMovimiento_TS> gettipomovimiento_tss() {
		return this.tipomovimiento_tss;
	}

	public void settipomovimiento_tss(List<TipoMovimiento_TS> tipomovimiento_tss) {
		this.tipomovimiento_tss = tipomovimiento_tss;
	}
	
	public List<TipoMovimiento_TS> gettipomovimiento_tssAux() {
		return this.tipomovimiento_tssAux;
	}

	public void settipomovimiento_tssAux(List<TipoMovimiento_TS> tipomovimiento_tssAux) {
		this.tipomovimiento_tssAux = tipomovimiento_tssAux;
	}
	
	public List<TipoMovimiento_TS> gettipomovimiento_tssEliminados() {
		return this.tipomovimiento_tssEliminados;
	}

	public void setTipoMovimiento_TSsEliminados(List<TipoMovimiento_TS> tipomovimiento_tssEliminados) {
		this.tipomovimiento_tssEliminados = tipomovimiento_tssEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarTipoMovimiento_TS() {
		return jComboBoxTiposSeleccionarTipoMovimiento_TS;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarTipoMovimiento_TS(
			JComboBox jComboBoxTiposSeleccionarTipoMovimiento_TS) {
		this.jComboBoxTiposSeleccionarTipoMovimiento_TS = jComboBoxTiposSeleccionarTipoMovimiento_TS;
	}
	
	public void setBorderResaltarTiposSeleccionarTipoMovimiento_TS() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarTipoMovimiento_TS.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarTipoMovimiento_TS .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralTipoMovimiento_TS() {
		return jTextFieldValorCampoGeneralTipoMovimiento_TS;
	}

	public void setjTextFieldValorCampoGeneralTipoMovimiento_TS(
			JTextField jTextFieldValorCampoGeneralTipoMovimiento_TS) {
		this.jTextFieldValorCampoGeneralTipoMovimiento_TS = jTextFieldValorCampoGeneralTipoMovimiento_TS;
	}

	public void setBorderResaltarValorCampoGeneralTipoMovimiento_TS() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoMovimiento_TS.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralTipoMovimiento_TS .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosTipoMovimiento_TS() {
		return this.jCheckBoxSeleccionarTodosTipoMovimiento_TS;
	}

	public void setjCheckBoxSeleccionarTodosTipoMovimiento_TS(
			JCheckBox jCheckBoxSeleccionarTodosTipoMovimiento_TS) {
		this.jCheckBoxSeleccionarTodosTipoMovimiento_TS = jCheckBoxSeleccionarTodosTipoMovimiento_TS;
	}

	public void setBorderResaltarSeleccionarTodosTipoMovimiento_TS() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoMovimiento_TS.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosTipoMovimiento_TS .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosTipoMovimiento_TS() {
		return this.jCheckBoxSeleccionadosTipoMovimiento_TS;
	}

	public void setjCheckBoxSeleccionadosTipoMovimiento_TS(
			JCheckBox jCheckBoxSeleccionadosTipoMovimiento_TS) {
		this.jCheckBoxSeleccionadosTipoMovimiento_TS = jCheckBoxSeleccionadosTipoMovimiento_TS;
	}
	
	public void setBorderResaltarSeleccionadosTipoMovimiento_TS() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoMovimiento_TS.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosTipoMovimiento_TS .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesTipoMovimiento_TS() {
		return this.jComboBoxTiposArchivosReportesTipoMovimiento_TS;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesTipoMovimiento_TS(
			JComboBox jComboBoxTiposArchivosReportesTipoMovimiento_TS) {
		this.jComboBoxTiposArchivosReportesTipoMovimiento_TS = jComboBoxTiposArchivosReportesTipoMovimiento_TS;
	}

	public void setBorderResaltarTiposArchivosReportesTipoMovimiento_TS() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoMovimiento_TS.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesTipoMovimiento_TS .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesTipoMovimiento_TS() {
		return this.jComboBoxTiposReportesTipoMovimiento_TS;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesTipoMovimiento_TS(
			JComboBox jComboBoxTiposReportesTipoMovimiento_TS) {
		this.jComboBoxTiposReportesTipoMovimiento_TS = jComboBoxTiposReportesTipoMovimiento_TS;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoTipoMovimiento_TS() {
	//	return jComboBoxTiposReportesDinamicoTipoMovimiento_TS;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoTipoMovimiento_TS(
	//		JComboBox jComboBoxTiposReportesDinamicoTipoMovimiento_TS) {
	//	this.jComboBoxTiposReportesDinamicoTipoMovimiento_TS = jComboBoxTiposReportesDinamicoTipoMovimiento_TS;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoTipoMovimiento_TS() {
	//	return jComboBoxTiposArchivosReportesDinamicoTipoMovimiento_TS;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoTipoMovimiento_TS(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoTipoMovimiento_TS) {
	//	this.jComboBoxTiposArchivosReportesDinamicoTipoMovimiento_TS = jComboBoxTiposArchivosReportesDinamicoTipoMovimiento_TS;
	//}
	
	public void setBorderResaltarTiposReportesTipoMovimiento_TS() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoMovimiento_TS.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesTipoMovimiento_TS .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesTipoMovimiento_TS() {
		return this.jComboBoxTiposGraficosReportesTipoMovimiento_TS;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesTipoMovimiento_TS(
			JComboBox jComboBoxTiposGraficosReportesTipoMovimiento_TS) {
		this.jComboBoxTiposGraficosReportesTipoMovimiento_TS = jComboBoxTiposGraficosReportesTipoMovimiento_TS;
	}
	
	public void setBorderResaltarTiposGraficosReportesTipoMovimiento_TS() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoMovimiento_TS.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesTipoMovimiento_TS .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionTipoMovimiento_TS() {
		return this.jComboBoxTiposPaginacionTipoMovimiento_TS;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionTipoMovimiento_TS(
			JComboBox jComboBoxTiposPaginacionTipoMovimiento_TS) {
		this.jComboBoxTiposPaginacionTipoMovimiento_TS = jComboBoxTiposPaginacionTipoMovimiento_TS;
	}
	
	public void setBorderResaltarTiposPaginacionTipoMovimiento_TS() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoMovimiento_TS.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionTipoMovimiento_TS .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesTipoMovimiento_TS() {
		return this.jComboBoxTiposRelacionesTipoMovimiento_TS;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoMovimiento_TS() {
		return this.jComboBoxTiposAccionesTipoMovimiento_TS;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoMovimiento_TS(
			JComboBox jComboBoxTiposRelacionesTipoMovimiento_TS) {
		this.jComboBoxTiposRelacionesTipoMovimiento_TS = jComboBoxTiposRelacionesTipoMovimiento_TS;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoMovimiento_TS(
			JComboBox jComboBoxTiposAccionesTipoMovimiento_TS) {
		this.jComboBoxTiposAccionesTipoMovimiento_TS = jComboBoxTiposAccionesTipoMovimiento_TS;
	}
	
	public void setBorderResaltarTiposRelacionesTipoMovimiento_TS() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoMovimiento_TS.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesTipoMovimiento_TS .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesTipoMovimiento_TS() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoMovimiento_TS.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesTipoMovimiento_TS .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoTipoMovimiento_TS() {
	//	return jCheckBoxConGraficoDinamicoTipoMovimiento_TS;
	//}

	//public void setjCheckBoxConGraficoDinamicoTipoMovimiento_TS(
	//		JCheckBox jCheckBoxConGraficoDinamicoTipoMovimiento_TS) {
	//	this.jCheckBoxConGraficoDinamicoTipoMovimiento_TS = jCheckBoxConGraficoDinamicoTipoMovimiento_TS;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoTipoMovimiento_TS() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarTipoMovimiento_TS.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoTipoMovimiento_TS .setBorder(borderResaltar);		
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
		this.tipomovimiento_tsSessionBean=new TipoMovimiento_TSSessionBean();
		
		this.tipomovimiento_tsSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipomovimiento_tsSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipomovimiento_tsSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=TipoMovimiento_TSJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=TipoMovimiento_TSJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoMovimiento_TSJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoMovimiento_TSJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoMovimiento_TSJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Movimiento_ T S MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.tipomovimiento_tsSessionBean.getEsGuardarRelacionado()) {
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
		
		TipoMovimiento_TSJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("TipoMovimiento_TS No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarTipoMovimiento_TS= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarTipoMovimiento_TS=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarTipoMovimiento_TS,this.jTtoolBarTipoMovimiento_TS,
							"nuevo","nuevo","Nuevo"+" "+TipoMovimiento_TSConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoMovimiento_TS=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarTipoMovimiento_TS,this.jTtoolBarTipoMovimiento_TS,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoMovimiento_TS=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarTipoMovimiento_TS,this.jTtoolBarTipoMovimiento_TS,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+TipoMovimiento_TSConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarTipoMovimiento_TS=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarTipoMovimiento_TS,this.jTtoolBarTipoMovimiento_TS,
							"duplicar","duplicar","Duplicar"+" "+TipoMovimiento_TSConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarTipoMovimiento_TS=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarTipoMovimiento_TS,this.jTtoolBarTipoMovimiento_TS,
							"copiar","copiar","Copiar"+" "+TipoMovimiento_TSConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarTipoMovimiento_TS=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarTipoMovimiento_TS,this.jTtoolBarTipoMovimiento_TS,
							"ver_form","ver_form","Ver"+" "+TipoMovimiento_TSConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarTipoMovimiento_TS=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoMovimiento_TS,this.jTtoolBarTipoMovimiento_TS,
							"recargar","recargar","Recargar"+" "+TipoMovimiento_TSConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarTipoMovimiento_TS=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoMovimiento_TS,this.jTtoolBarTipoMovimiento_TS,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarTipoMovimiento_TS=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoMovimiento_TS,this.jTtoolBarTipoMovimiento_TS,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarTipoMovimiento_TS=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarTipoMovimiento_TS,this.jTtoolBarTipoMovimiento_TS,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarTipoMovimiento_TS=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarTipoMovimiento_TS,this.jTtoolBarTipoMovimiento_TS,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarTipoMovimiento_TS=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarTipoMovimiento_TS,this.jTtoolBarTipoMovimiento_TS,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+TipoMovimiento_TSConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarTipoMovimiento_TS=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarTipoMovimiento_TS,this.jTtoolBarTipoMovimiento_TS,
							"cerrar","cerrar","Salir"+" "+TipoMovimiento_TSConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarTipoMovimiento_TS=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarTipoMovimiento_TS;
			
				this.jButtonProcesarInformacionToolBarTipoMovimiento_TS=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarTipoMovimiento_TS;
				
		//protected JButton jButtonModificarToolBarTipoMovimiento_TS;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarTipoMovimiento_TS=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuTipoMovimiento_TS=new JMenuMe("General");
		this.jmenuArchivoTipoMovimiento_TS=new JMenuMe("Archivo");
		this.jmenuAccionesTipoMovimiento_TS=new JMenuMe("Acciones");
		this.jmenuDatosTipoMovimiento_TS=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoMovimiento_TS= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoMovimiento_TS.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoMovimiento_TS,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoMovimiento_TS, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarTipoMovimiento_TS= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarTipoMovimiento_TS.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarTipoMovimiento_TS,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarTipoMovimiento_TS, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesTipoMovimiento_TS= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesTipoMovimiento_TS.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesTipoMovimiento_TS,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesTipoMovimiento_TS, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosTipoMovimiento_TS= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoMovimiento_TS.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoMovimiento_TS,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoMovimiento_TS, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarTipoMovimiento_TS= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarTipoMovimiento_TS.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarTipoMovimiento_TS,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarTipoMovimiento_TS, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormTipoMovimiento_TS= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormTipoMovimiento_TS.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormTipoMovimiento_TS,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormTipoMovimiento_TS, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaTipoMovimiento_TS= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaTipoMovimiento_TS.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaTipoMovimiento_TS,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaTipoMovimiento_TS, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoMovimiento_TS= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoMovimiento_TS.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoMovimiento_TS,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoMovimiento_TS, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionTipoMovimiento_TS= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionTipoMovimiento_TS.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionTipoMovimiento_TS,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionTipoMovimiento_TS, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionTipoMovimiento_TS= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionTipoMovimiento_TS.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionTipoMovimiento_TS,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresTipoMovimiento_TS= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresTipoMovimiento_TS.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresTipoMovimiento_TS,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresTipoMovimiento_TS, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesTipoMovimiento_TS= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesTipoMovimiento_TS.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesTipoMovimiento_TS,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesTipoMovimiento_TS, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByTipoMovimiento_TS= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByTipoMovimiento_TS.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByTipoMovimiento_TS,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByTipoMovimiento_TS, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoMovimiento_TS= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoMovimiento_TS.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoMovimiento_TS,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoMovimiento_TS, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByTipoMovimiento_TS= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByTipoMovimiento_TS.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByTipoMovimiento_TS,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByTipoMovimiento_TS, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoMovimiento_TS= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoMovimiento_TS.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoMovimiento_TS,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoMovimiento_TS, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosTipoMovimiento_TS= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosTipoMovimiento_TS.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosTipoMovimiento_TS,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosTipoMovimiento_TS, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoTipoMovimiento_TS.add(this.jMenuItemCerrarTipoMovimiento_TS);
			
			this.jmenuAccionesTipoMovimiento_TS.add(this.jMenuItemNuevoTipoMovimiento_TS);
			this.jmenuAccionesTipoMovimiento_TS.add(this.jMenuItemNuevoGuardarCambiosTipoMovimiento_TS);
			this.jmenuAccionesTipoMovimiento_TS.add(this.jMenuItemNuevoRelacionesTipoMovimiento_TS);
			this.jmenuAccionesTipoMovimiento_TS.add(this.jMenuItemGuardarCambiosTablaTipoMovimiento_TS);		
			this.jmenuAccionesTipoMovimiento_TS.add(this.jMenuItemDuplicarTipoMovimiento_TS);		
			this.jmenuAccionesTipoMovimiento_TS.add(this.jMenuItemCopiarTipoMovimiento_TS);		
			this.jmenuAccionesTipoMovimiento_TS.add(this.jMenuItemVerFormTipoMovimiento_TS);		
			
			this.jmenuDatosTipoMovimiento_TS.add(this.jMenuItemRecargarInformacionTipoMovimiento_TS);				
			this.jmenuDatosTipoMovimiento_TS.add(this.jMenuItemAnterioresTipoMovimiento_TS);				
			this.jmenuDatosTipoMovimiento_TS.add(this.jMenuItemSiguientesTipoMovimiento_TS);				
			this.jmenuDatosTipoMovimiento_TS.add(this.jMenuItemAbrirOrderByTipoMovimiento_TS);				
			this.jmenuDatosTipoMovimiento_TS.add(this.jMenuItemMostrarOcultarTipoMovimiento_TS);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesTipoMovimiento_TS.add(this.jMenuItemGuardarCambiosTipoMovimiento_TS);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoTipoMovimiento_TS, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesTipoMovimiento_TS, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosTipoMovimiento_TS, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarTipoMovimiento_TS.add(this.jmenuArchivoTipoMovimiento_TS);		
			this.jmenuBarTipoMovimiento_TS.add(this.jmenuAccionesTipoMovimiento_TS);		
			this.jmenuBarTipoMovimiento_TS.add(this.jmenuDatosTipoMovimiento_TS);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarTipoMovimiento_TS);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasTipoMovimiento_TS() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		

		this.jTabbedPaneBusquedasTipoMovimiento_TS=new JTabbedPane();


		this.jTabbedPaneBusquedasTipoMovimiento_TS.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoMovimiento_TS.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoMovimiento_TS.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasTipoMovimiento_TS.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasTipoMovimiento_TS.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasTipoMovimiento_TS,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleTipoMovimiento_TS = new TipoMovimiento_TSDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Tipo Movimiento_ T S DATOS");
			this.jInternalFrameDetalleFormTipoMovimiento_TS = new TipoMovimiento_TSDetalleFormJInternalFrame(jDesktopPane,this.tipomovimiento_tsSessionBean.getConGuardarRelaciones(),this.tipomovimiento_tsSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormTipoMovimiento_TS = null;//new TipoMovimiento_TSDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoMovimiento_TS= new GridBagLayout();
		
		
		this.jTableDatosTipoMovimiento_TS = new JTableMe();      
		
		String sToolTipTipoMovimiento_TS="";
		sToolTipTipoMovimiento_TS=TipoMovimiento_TSConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoMovimiento_TS+="(Tesoreria.TipoMovimiento_TS)";
		}
		
		if(!this.tipomovimiento_tsSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoMovimiento_TS+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosTipoMovimiento_TS.setToolTipText(sToolTipTipoMovimiento_TS);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosTipoMovimiento_TS);
		this.jTableDatosTipoMovimiento_TS.setAutoCreateRowSorter(true);
		this.jTableDatosTipoMovimiento_TS.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosTipoMovimiento_TS.setRowSelectionAllowed(true);
		this.jTableDatosTipoMovimiento_TS.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosTipoMovimiento_TS,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoTipoMovimiento_TS = new JButtonMe();
		this.jButtonDuplicarTipoMovimiento_TS = new JButtonMe();
		this.jButtonCopiarTipoMovimiento_TS = new JButtonMe();
		this.jButtonVerFormTipoMovimiento_TS = new JButtonMe();
		this.jButtonNuevoRelacionesTipoMovimiento_TS = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaTipoMovimiento_TS = new JButtonMe();
		this.jButtonCerrarTipoMovimiento_TS = new JButtonMe();
		
		this.jScrollPanelDatosTipoMovimiento_TS = new JScrollPane();   
        this.jScrollPanelDatosGeneralTipoMovimiento_TS = new JScrollPane();
		
				
		
		
		this.jPanelAccionesTipoMovimiento_TS = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Movimiento_ T S";
		
		if(!this.tipomovimiento_tsSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoMovimiento_TS.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Movimiento_ T Ses" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoMovimiento_TS.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralTipoMovimiento_TS.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesTipoMovimiento_TS.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoMovimiento_TS.setToolTipText("Acciones");
        this.jPanelAccionesTipoMovimiento_TS.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoMovimiento_TS, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoMovimiento_TS, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoTipoMovimiento_TS=new ReporteDinamicoJInternalFrame(TipoMovimiento_TSConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoTipoMovimiento_TS();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionTipoMovimiento_TS=new ImportacionJInternalFrame(TipoMovimiento_TSConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionTipoMovimiento_TS();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByTipoMovimiento_TS = new JButtonMe();
		
		this.jButtonAbrirOrderByTipoMovimiento_TS.setText("Orden");
		this.jButtonAbrirOrderByTipoMovimiento_TS.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoMovimiento_TS,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoMovimiento_TS, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByTipoMovimiento_TS.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByTipoMovimiento_TS.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoMovimiento_TS=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoMovimiento_TS,false,this);
			
			//this.cargarOrderByTipoMovimiento_TS(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoMovimiento_TS=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoMovimiento_TS,true,this);
			
			//this.cargarOrderByTipoMovimiento_TS(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosTipoMovimiento_TS.setMinimumSize(new Dimension(400,50));//430
		this.jTableDatosTipoMovimiento_TS.setMaximumSize(new Dimension(400,50));//430
		this.jTableDatosTipoMovimiento_TS.setPreferredSize(new Dimension(400,50));//430
		
		this.jScrollPanelDatosTipoMovimiento_TS.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoMovimiento_TS.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoMovimiento_TS.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoTipoMovimiento_TS.setText("Nuevo");
		this.jButtonDuplicarTipoMovimiento_TS.setText("Duplicar");
		this.jButtonCopiarTipoMovimiento_TS.setText("Copiar");
		this.jButtonVerFormTipoMovimiento_TS.setText("Ver");
		this.jButtonNuevoRelacionesTipoMovimiento_TS.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaTipoMovimiento_TS.setText("Guardar");
		this.jButtonCerrarTipoMovimiento_TS.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoMovimiento_TS,"nuevo_button","Nuevo",this.tipomovimiento_tsSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarTipoMovimiento_TS,"duplicar_button","Duplicar",this.tipomovimiento_tsSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarTipoMovimiento_TS,"copiar_button","Copiar",this.tipomovimiento_tsSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormTipoMovimiento_TS,"ver_form","Ver",this.tipomovimiento_tsSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesTipoMovimiento_TS,"nuevorelaciones_button","Nuevo Rel",this.tipomovimiento_tsSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoMovimiento_TS,"guardarcambiostabla_button","Guardar",this.tipomovimiento_tsSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoMovimiento_TS,"cerrar_button","Salir",this.tipomovimiento_tsSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoMovimiento_TS, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarTipoMovimiento_TS, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarTipoMovimiento_TS, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormTipoMovimiento_TS, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesTipoMovimiento_TS, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoMovimiento_TS, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoMovimiento_TS, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoTipoMovimiento_TS.setToolTipText("Nuevo"+" "+TipoMovimiento_TSConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarTipoMovimiento_TS.setToolTipText("Duplicar"+" "+TipoMovimiento_TSConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarTipoMovimiento_TS.setToolTipText("Copiar"+" "+TipoMovimiento_TSConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormTipoMovimiento_TS.setToolTipText("Ver"+" "+TipoMovimiento_TSConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesTipoMovimiento_TS.setToolTipText("Nuevo Rel"+" "+TipoMovimiento_TSConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaTipoMovimiento_TS.setToolTipText("Guardar"+" "+TipoMovimiento_TSConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoMovimiento_TS.setToolTipText("Salir"+" "+TipoMovimiento_TSConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoMovimiento_TS";
		inputMap = this.jButtonNuevoTipoMovimiento_TS.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoMovimiento_TS.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoMovimiento_TS"));
		
		//DUPLICAR
		sMapKey = "DuplicarTipoMovimiento_TS";
		inputMap = this.jButtonDuplicarTipoMovimiento_TS.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarTipoMovimiento_TS.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarTipoMovimiento_TS"));
		
		//COPIAR
		sMapKey = "CopiarTipoMovimiento_TS";
		inputMap = this.jButtonCopiarTipoMovimiento_TS.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarTipoMovimiento_TS.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarTipoMovimiento_TS"));
		
		//VEr FORM
		sMapKey = "VerFormTipoMovimiento_TS";
		inputMap = this.jButtonVerFormTipoMovimiento_TS.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormTipoMovimiento_TS.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormTipoMovimiento_TS"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesTipoMovimiento_TS";
		inputMap = this.jButtonNuevoRelacionesTipoMovimiento_TS.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesTipoMovimiento_TS.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesTipoMovimiento_TS"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarTipoMovimiento_TS";
		inputMap = this.jButtonModificarTipoMovimiento_TS.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarTipoMovimiento_TS.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarTipoMovimiento_TS"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarTipoMovimiento_TS";
		inputMap = this.jButtonCerrarTipoMovimiento_TS.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoMovimiento_TS.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoMovimiento_TS"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoMovimiento_TS";
		inputMap = this.jButtonGuardarCambiosTablaTipoMovimiento_TS.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoMovimiento_TS.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoMovimiento_TS"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesTipoMovimiento_TS = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesTipoMovimiento_TS = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionTipoMovimiento_TS = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1TipoMovimiento_TS= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2TipoMovimiento_TS= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3TipoMovimiento_TS= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4TipoMovimiento_TS= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5TipoMovimiento_TS= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesTipoMovimiento_TS.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesTipoMovimiento_TS.setName("jPanelParametrosReportesTipoMovimiento_TS"); 
		
		this.jPanelParametrosReportesAccionesTipoMovimiento_TS.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesTipoMovimiento_TS.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesTipoMovimiento_TS.setName("jPanelParametrosReportesAccionesTipoMovimiento_TS"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesTipoMovimiento_TS, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesTipoMovimiento_TS, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionTipoMovimiento_TS = new JButtonMe();
		this.jButtonRecargarInformacionTipoMovimiento_TS.setText("Recargar");
		this.jButtonRecargarInformacionTipoMovimiento_TS.setToolTipText("Recargar"+" "+TipoMovimiento_TSConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionTipoMovimiento_TS,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionTipoMovimiento_TS = new JButtonMe();
		this.jButtonProcesarInformacionTipoMovimiento_TS.setText("Procesar");
		this.jButtonProcesarInformacionTipoMovimiento_TS.setToolTipText("Procesar"+" "+TipoMovimiento_TSConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionTipoMovimiento_TS.setVisible(false);
			
		this.jButtonProcesarInformacionTipoMovimiento_TS.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoMovimiento_TS.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoMovimiento_TS.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesTipoMovimiento_TS = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoMovimiento_TS.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesTipoMovimiento_TS.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesTipoMovimiento_TS = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoMovimiento_TS.setText("TIPO");       
		this.jComboBoxTiposReportesTipoMovimiento_TS.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesTipoMovimiento_TS = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoMovimiento_TS.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesTipoMovimiento_TS.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionTipoMovimiento_TS = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionTipoMovimiento_TS.setText("Paginacion");
		this.jComboBoxTiposPaginacionTipoMovimiento_TS.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesTipoMovimiento_TS = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesTipoMovimiento_TS.setText("Accion");
		this.jComboBoxTiposRelacionesTipoMovimiento_TS.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesTipoMovimiento_TS = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoMovimiento_TS.setText("Accion");
		this.jComboBoxTiposAccionesTipoMovimiento_TS.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarTipoMovimiento_TS = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarTipoMovimiento_TS.setText("Accion");
		this.jComboBoxTiposSeleccionarTipoMovimiento_TS.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralTipoMovimiento_TS=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralTipoMovimiento_TS.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoMovimiento_TS.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoMovimiento_TS.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesTipoMovimiento_TS = new JLabelMe();
		
		this.jLabelAccionesTipoMovimiento_TS.setText("Acciones");		
		this.jLabelAccionesTipoMovimiento_TS.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoMovimiento_TS.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoMovimiento_TS.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosTipoMovimiento_TS = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosTipoMovimiento_TS.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosTipoMovimiento_TS.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosTipoMovimiento_TS = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosTipoMovimiento_TS.setText("Seleccionados");
		this.jCheckBoxSeleccionadosTipoMovimiento_TS.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaTipoMovimiento_TS = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaTipoMovimiento_TS.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaTipoMovimiento_TS.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteTipoMovimiento_TS = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteTipoMovimiento_TS.setText("Graf.");
		this.jCheckBoxConGraficoReporteTipoMovimiento_TS.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresTipoMovimiento_TS = new JButtonMe();
		//this.jButtonAnterioresTipoMovimiento_TS.setText("<<");
        this.jButtonAnterioresTipoMovimiento_TS.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresTipoMovimiento_TS,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresTipoMovimiento_TS, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesTipoMovimiento_TS = new JButtonMe();
		//this.jButtonSiguientesTipoMovimiento_TS.setText(">>");
        this.jButtonSiguientesTipoMovimiento_TS.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesTipoMovimiento_TS,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesTipoMovimiento_TS, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosTipoMovimiento_TS = new JButtonMe();
		this.jButtonNuevoGuardarCambiosTipoMovimiento_TS.setText("Nue");
        this.jButtonNuevoGuardarCambiosTipoMovimiento_TS.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosTipoMovimiento_TS,"nuevoguardarcambios_button","Nue",this.tipomovimiento_tsSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosTipoMovimiento_TS, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosTipoMovimiento_TS";
		inputMap = this.jButtonNuevoGuardarCambiosTipoMovimiento_TS.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosTipoMovimiento_TS.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosTipoMovimiento_TS"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionTipoMovimiento_TS";
		inputMap = this.jButtonRecargarInformacionTipoMovimiento_TS.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionTipoMovimiento_TS.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionTipoMovimiento_TS"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesTipoMovimiento_TS";
		inputMap = this.jButtonSiguientesTipoMovimiento_TS.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesTipoMovimiento_TS.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesTipoMovimiento_TS"));
		
		//ANTERIORES		
		sMapKey = "AnterioresTipoMovimiento_TS";
		inputMap = this.jButtonAnterioresTipoMovimiento_TS.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresTipoMovimiento_TS.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresTipoMovimiento_TS"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasTipoMovimiento_TS();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesTipoMovimiento_TS.setMinimumSize(new Dimension(this.getWidth(),TipoMovimiento_TSBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoMovimiento_TSBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoMovimiento_TS.setMaximumSize(new Dimension(this.getWidth(),TipoMovimiento_TSBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoMovimiento_TSBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoMovimiento_TS.setPreferredSize(new Dimension(this.getWidth(),TipoMovimiento_TSBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoMovimiento_TSBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionTipoMovimiento_TS = new GridBagLayout();

			this.jPanelPaginacionTipoMovimiento_TS.setLayout(gridaBagLayoutPaginacionTipoMovimiento_TS);						
			
			this.gridBagConstraintsTipoMovimiento_TS = new GridBagConstraints();
			this.gridBagConstraintsTipoMovimiento_TS.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsTipoMovimiento_TS.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoMovimiento_TS.gridy = 0;
			this.gridBagConstraintsTipoMovimiento_TS.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionTipoMovimiento_TS.add(this.jButtonAnterioresTipoMovimiento_TS, this.gridBagConstraintsTipoMovimiento_TS);
					
						
			this.gridBagConstraintsTipoMovimiento_TS = new GridBagConstraints();
			this.gridBagConstraintsTipoMovimiento_TS.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoMovimiento_TS.gridy = 0;
			
			this.jPanelPaginacionTipoMovimiento_TS.add(this.jButtonNuevoGuardarCambiosTipoMovimiento_TS, this.gridBagConstraintsTipoMovimiento_TS);
						
			
			this.gridBagConstraintsTipoMovimiento_TS = new GridBagConstraints();
			this.gridBagConstraintsTipoMovimiento_TS.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsTipoMovimiento_TS.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoMovimiento_TS.gridy = 0;
			this.jPanelPaginacionTipoMovimiento_TS.add(this.jButtonSiguientesTipoMovimiento_TS, this.gridBagConstraintsTipoMovimiento_TS);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsTipoMovimiento_TS = new GridBagConstraints();
			this.gridBagConstraintsTipoMovimiento_TS.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoMovimiento_TS.gridy = 1;
			this.gridBagConstraintsTipoMovimiento_TS.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoMovimiento_TS.add(this.jButtonNuevoTipoMovimiento_TS, this.gridBagConstraintsTipoMovimiento_TS);
						
			
			
			if(!this.tipomovimiento_tsSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsTipoMovimiento_TS = new GridBagConstraints();
				this.gridBagConstraintsTipoMovimiento_TS.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoMovimiento_TS.gridy = 1;
				this.gridBagConstraintsTipoMovimiento_TS.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionTipoMovimiento_TS.add(this.jButtonGuardarCambiosTablaTipoMovimiento_TS, this.gridBagConstraintsTipoMovimiento_TS);
			}
			
			
			
			this.gridBagConstraintsTipoMovimiento_TS = new GridBagConstraints();
			this.gridBagConstraintsTipoMovimiento_TS.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoMovimiento_TS.gridy = 1;
			this.gridBagConstraintsTipoMovimiento_TS.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoMovimiento_TS.add(this.jButtonDuplicarTipoMovimiento_TS, this.gridBagConstraintsTipoMovimiento_TS);
			
			this.gridBagConstraintsTipoMovimiento_TS = new GridBagConstraints();
			this.gridBagConstraintsTipoMovimiento_TS.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoMovimiento_TS.gridy = 1;
			this.gridBagConstraintsTipoMovimiento_TS.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoMovimiento_TS.add(this.jButtonCopiarTipoMovimiento_TS, this.gridBagConstraintsTipoMovimiento_TS);
		
			this.gridBagConstraintsTipoMovimiento_TS = new GridBagConstraints();
			this.gridBagConstraintsTipoMovimiento_TS.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoMovimiento_TS.gridy = 1;
			this.gridBagConstraintsTipoMovimiento_TS.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoMovimiento_TS.add(this.jButtonVerFormTipoMovimiento_TS, this.gridBagConstraintsTipoMovimiento_TS);
		
			this.gridBagConstraintsTipoMovimiento_TS = new GridBagConstraints();
			this.gridBagConstraintsTipoMovimiento_TS.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoMovimiento_TS.gridy = 1;
			this.gridBagConstraintsTipoMovimiento_TS.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionTipoMovimiento_TS.add(this.jButtonCerrarTipoMovimiento_TS, this.gridBagConstraintsTipoMovimiento_TS);
		
		
		
		this.jButtonRecargarInformacionTipoMovimiento_TS.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoMovimiento_TS.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoMovimiento_TS.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionTipoMovimiento_TS, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesTipoMovimiento_TS.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoMovimiento_TS.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoMovimiento_TS.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesTipoMovimiento_TS, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesTipoMovimiento_TS.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoMovimiento_TS.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoMovimiento_TS.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesTipoMovimiento_TS, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesTipoMovimiento_TS.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoMovimiento_TS.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoMovimiento_TS.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesTipoMovimiento_TS, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionTipoMovimiento_TS.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoMovimiento_TS.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoMovimiento_TS.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionTipoMovimiento_TS, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesTipoMovimiento_TS.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoMovimiento_TS.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoMovimiento_TS.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesTipoMovimiento_TS, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesTipoMovimiento_TS.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoMovimiento_TS.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoMovimiento_TS.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoMovimiento_TS, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarTipoMovimiento_TS.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoMovimiento_TS.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoMovimiento_TS.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarTipoMovimiento_TS, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaTipoMovimiento_TS.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoMovimiento_TS.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoMovimiento_TS.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaTipoMovimiento_TS, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteTipoMovimiento_TS.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoMovimiento_TS.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoMovimiento_TS.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteTipoMovimiento_TS, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosTipoMovimiento_TS.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoMovimiento_TS.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoMovimiento_TS.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosTipoMovimiento_TS, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosTipoMovimiento_TS.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoMovimiento_TS.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoMovimiento_TS.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosTipoMovimiento_TS, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesTipoMovimiento_TS = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesTipoMovimiento_TS = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1TipoMovimiento_TS = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2TipoMovimiento_TS = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3TipoMovimiento_TS = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4TipoMovimiento_TS = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesTipoMovimiento_TS.setLayout(gridaBagParametrosReportesTipoMovimiento_TS);
			this.jPanelParametrosReportesAccionesTipoMovimiento_TS.setLayout(gridaBagParametrosReportesAccionesTipoMovimiento_TS);
			
			
			this.jPanelParametrosAuxiliar1TipoMovimiento_TS.setLayout(gridaBagParametrosAuxiliar1TipoMovimiento_TS);
			this.jPanelParametrosAuxiliar2TipoMovimiento_TS.setLayout(gridaBagParametrosAuxiliar2TipoMovimiento_TS);
			this.jPanelParametrosAuxiliar3TipoMovimiento_TS.setLayout(gridaBagParametrosAuxiliar3TipoMovimiento_TS);
			this.jPanelParametrosAuxiliar4TipoMovimiento_TS.setLayout(gridaBagParametrosAuxiliar4TipoMovimiento_TS);
			//this.jPanelParametrosAuxiliar5TipoMovimiento_TS.setLayout(gridaBagParametrosAuxiliar2TipoMovimiento_TS);			
			
			
			
			
			this.gridBagConstraintsTipoMovimiento_TS = new GridBagConstraints();
			this.gridBagConstraintsTipoMovimiento_TS.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoMovimiento_TS.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoMovimiento_TS.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoMovimiento_TS.add(this.jButtonRecargarInformacionTipoMovimiento_TS, this.gridBagConstraintsTipoMovimiento_TS);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsTipoMovimiento_TS = new GridBagConstraints();
			this.gridBagConstraintsTipoMovimiento_TS.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoMovimiento_TS.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoMovimiento_TS.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoMovimiento_TS.add(this.jComboBoxTiposPaginacionTipoMovimiento_TS, this.gridBagConstraintsTipoMovimiento_TS);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsTipoMovimiento_TS = new GridBagConstraints();
			this.gridBagConstraintsTipoMovimiento_TS.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoMovimiento_TS.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoMovimiento_TS.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoMovimiento_TS.add(this.jCheckBoxConAltoMaximoTablaTipoMovimiento_TS, this.gridBagConstraintsTipoMovimiento_TS);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsTipoMovimiento_TS = new GridBagConstraints();
			this.gridBagConstraintsTipoMovimiento_TS.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoMovimiento_TS.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoMovimiento_TS.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoMovimiento_TS.add(this.jComboBoxTiposArchivosReportesTipoMovimiento_TS, this.gridBagConstraintsTipoMovimiento_TS);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsTipoMovimiento_TS = new GridBagConstraints();
			this.gridBagConstraintsTipoMovimiento_TS.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoMovimiento_TS.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoMovimiento_TS.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoMovimiento_TS.add(this.jPanelParametrosAuxiliar1TipoMovimiento_TS, this.gridBagConstraintsTipoMovimiento_TS);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsTipoMovimiento_TS = new GridBagConstraints();
			this.gridBagConstraintsTipoMovimiento_TS.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoMovimiento_TS.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoMovimiento_TS.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoMovimiento_TS.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4TipoMovimiento_TS.add(this.jComboBoxTiposReportesTipoMovimiento_TS, this.gridBagConstraintsTipoMovimiento_TS);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsTipoMovimiento_TS = new GridBagConstraints();
			this.gridBagConstraintsTipoMovimiento_TS.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoMovimiento_TS.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoMovimiento_TS.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoMovimiento_TS.add(this.jPanelParametrosAuxiliar4TipoMovimiento_TS, this.gridBagConstraintsTipoMovimiento_TS);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsTipoMovimiento_TS = new GridBagConstraints();
			this.gridBagConstraintsTipoMovimiento_TS.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoMovimiento_TS.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoMovimiento_TS.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoMovimiento_TS.add(this.jComboBoxTiposReportesTipoMovimiento_TS, this.gridBagConstraintsTipoMovimiento_TS);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsTipoMovimiento_TS = new GridBagConstraints();
			this.gridBagConstraintsTipoMovimiento_TS.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoMovimiento_TS.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoMovimiento_TS.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoMovimiento_TS.add(this.jCheckBoxGenerarReporteTipoMovimiento_TS, this.gridBagConstraintsTipoMovimiento_TS);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsTipoMovimiento_TS = new GridBagConstraints();
			this.gridBagConstraintsTipoMovimiento_TS.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoMovimiento_TS.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoMovimiento_TS.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoMovimiento_TS.add(this.jPanelParametrosAuxiliar2TipoMovimiento_TS, this.gridBagConstraintsTipoMovimiento_TS);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsTipoMovimiento_TS = new GridBagConstraints();
			this.gridBagConstraintsTipoMovimiento_TS.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoMovimiento_TS.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoMovimiento_TS.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoMovimiento_TS.add(this.jLabelAccionesTipoMovimiento_TS, this.gridBagConstraintsTipoMovimiento_TS);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsTipoMovimiento_TS = new GridBagConstraints();
				this.gridBagConstraintsTipoMovimiento_TS.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsTipoMovimiento_TS.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsTipoMovimiento_TS.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesTipoMovimiento_TS.add(this.jButtonAbrirOrderByTipoMovimiento_TS, this.gridBagConstraintsTipoMovimiento_TS);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsTipoMovimiento_TS = new GridBagConstraints();
			this.gridBagConstraintsTipoMovimiento_TS.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsTipoMovimiento_TS.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoMovimiento_TS.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoMovimiento_TS.add(this.jComboBoxTiposSeleccionarTipoMovimiento_TS, this.gridBagConstraintsTipoMovimiento_TS);			
			
			
			/*
			this.gridBagConstraintsTipoMovimiento_TS = new GridBagConstraints();
			this.gridBagConstraintsTipoMovimiento_TS.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoMovimiento_TS.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoMovimiento_TS.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoMovimiento_TS.add(this.jCheckBoxSeleccionarTodosTipoMovimiento_TS, this.gridBagConstraintsTipoMovimiento_TS);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsTipoMovimiento_TS = new GridBagConstraints();
			this.gridBagConstraintsTipoMovimiento_TS.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoMovimiento_TS.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoMovimiento_TS.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoMovimiento_TS.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoMovimiento_TS.add(this.jCheckBoxSeleccionarTodosTipoMovimiento_TS, this.gridBagConstraintsTipoMovimiento_TS);															
				
			this.gridBagConstraintsTipoMovimiento_TS = new GridBagConstraints();
			this.gridBagConstraintsTipoMovimiento_TS.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoMovimiento_TS.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoMovimiento_TS.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoMovimiento_TS.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoMovimiento_TS.add(this.jCheckBoxSeleccionadosTipoMovimiento_TS, this.gridBagConstraintsTipoMovimiento_TS);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsTipoMovimiento_TS = new GridBagConstraints();
			this.gridBagConstraintsTipoMovimiento_TS.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoMovimiento_TS.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoMovimiento_TS.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoMovimiento_TS.add(this.jPanelParametrosAuxiliar3TipoMovimiento_TS, this.gridBagConstraintsTipoMovimiento_TS);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsTipoMovimiento_TS = new GridBagConstraints();
			this.gridBagConstraintsTipoMovimiento_TS.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoMovimiento_TS.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoMovimiento_TS.add(this.jComboBoxTiposAccionesTipoMovimiento_TS, this.gridBagConstraintsTipoMovimiento_TS);
	
				
			this.gridBagConstraintsTipoMovimiento_TS = new GridBagConstraints();
			this.gridBagConstraintsTipoMovimiento_TS.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoMovimiento_TS.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoMovimiento_TS.add(this.jTextFieldValorCampoGeneralTipoMovimiento_TS, this.gridBagConstraintsTipoMovimiento_TS);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosTipoMovimiento_TS = new GridBagLayout();

			this.jScrollPanelDatosTipoMovimiento_TS.setLayout(gridaBagLayoutDatosTipoMovimiento_TS);
			
			this.gridBagConstraintsTipoMovimiento_TS = new GridBagConstraints();
			this.gridBagConstraintsTipoMovimiento_TS.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoMovimiento_TS.gridy = 0;
			this.gridBagConstraintsTipoMovimiento_TS.gridx = 0;
			
			this.jScrollPanelDatosTipoMovimiento_TS.add(this.jTableDatosTipoMovimiento_TS, this.gridBagConstraintsTipoMovimiento_TS);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosTipoMovimiento_TS.setViewportView(this.jTableDatosTipoMovimiento_TS);
		this.jTableDatosTipoMovimiento_TS.setFillsViewportHeight(true);
		this.jTableDatosTipoMovimiento_TS.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesTipoMovimiento_TS= new GridBagLayout();
		this.jPanelAccionesTipoMovimiento_TS.setLayout(gridaBagLayoutAccionesTipoMovimiento_TS);
		
		
		/*	
		this.gridBagConstraintsTipoMovimiento_TS = new GridBagConstraints();
		this.gridBagConstraintsTipoMovimiento_TS.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoMovimiento_TS.gridy = 0;
		this.gridBagConstraintsTipoMovimiento_TS.gridx = 0;
			
		this.jPanelAccionesTipoMovimiento_TS.add(this.jButtonNuevoTipoMovimiento_TS, this.gridBagConstraintsTipoMovimiento_TS);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoMovimiento_TS = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoMovimiento_TS);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipomovimiento_tsSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoMovimiento_TS = new GridBagConstraints();						
			this.gridBagConstraintsTipoMovimiento_TS.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoMovimiento_TS.gridx = 0;		
			//this.gridBagConstraintsTipoMovimiento_TS.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoMovimiento_TS.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoMovimiento_TS.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarTipoMovimiento_TS, this.gridBagConstraintsTipoMovimiento_TS);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsTipoMovimiento_TS = new GridBagConstraints();
		this.gridBagConstraintsTipoMovimiento_TS.gridy = iGridyPrincipal++;
		this.gridBagConstraintsTipoMovimiento_TS.gridx = 0;		
		//this.gridBagConstraintsTipoMovimiento_TS.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoMovimiento_TS.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsTipoMovimiento_TS.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsTipoMovimiento_TS);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsTipoMovimiento_TS = new GridBagConstraints();
		this.gridBagConstraintsTipoMovimiento_TS.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoMovimiento_TS.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesTipoMovimiento_TS, this.gridBagConstraintsTipoMovimiento_TS);								
		
		
		/*
		this.gridBagConstraintsTipoMovimiento_TS = new GridBagConstraints();
		this.gridBagConstraintsTipoMovimiento_TS.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoMovimiento_TS.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesTipoMovimiento_TS, this.gridBagConstraintsTipoMovimiento_TS);
		*/		
		
		this.gridBagConstraintsTipoMovimiento_TS = new GridBagConstraints();
		this.gridBagConstraintsTipoMovimiento_TS.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoMovimiento_TS.gridx =0;
		this.gridBagConstraintsTipoMovimiento_TS.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoMovimiento_TS.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoMovimiento_TS, this.gridBagConstraintsTipoMovimiento_TS);
				
		
		this.gridBagConstraintsTipoMovimiento_TS = new GridBagConstraints();
		this.gridBagConstraintsTipoMovimiento_TS.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoMovimiento_TS.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionTipoMovimiento_TS, this.gridBagConstraintsTipoMovimiento_TS);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(TipoMovimiento_TSJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosTipoMovimiento_TS= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoMovimiento_TS = new GridBagLayout();
			this.jPanelBusquedasParametrosTipoMovimiento_TS.setLayout(gridaBagLayoutBusquedasParametrosTipoMovimiento_TS);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralTipoMovimiento_TS=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoMovimiento_TS.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoMovimiento_TS.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoMovimiento_TS.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoMovimiento_TS = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsTipoMovimiento_TS = new GridBagConstraints();
		this.gridBagConstraintsTipoMovimiento_TS.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoMovimiento_TS.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoMovimiento_TS, this.gridBagConstraintsTipoMovimiento_TS);
			
			
		this.gridBagConstraintsTipoMovimiento_TS = new GridBagConstraints();
		this.gridBagConstraintsTipoMovimiento_TS.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoMovimiento_TS.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoMovimiento_TS, this.gridBagConstraintsTipoMovimiento_TS);
		
			
		this.gridBagConstraintsTipoMovimiento_TS = new GridBagConstraints();
		this.gridBagConstraintsTipoMovimiento_TS.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoMovimiento_TS.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoMovimiento_TS, this.gridBagConstraintsTipoMovimiento_TS);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralTipoMovimiento_TS;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoTipoMovimiento_TS() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoTipoMovimiento_TS = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoTipoMovimiento_TS = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoTipoMovimiento_TS.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoTipoMovimiento_TS.setName("jPanelReporteDinamicoTipoMovimiento_TS"); 
		
		this.jPanelReporteDinamicoTipoMovimiento_TS.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoMovimiento_TS.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoMovimiento_TS.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoTipoMovimiento_TS.setLayout(gridaBagLayoutReporteDinamicoTipoMovimiento_TS);
		
		
		this.jInternalFrameReporteDinamicoTipoMovimiento_TS= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoTipoMovimiento_TS = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoMovimiento_TS= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoTipoMovimiento_TS.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoTipoMovimiento_TS.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoTipoMovimiento_TS.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoTipoMovimiento_TS.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoTipoMovimiento_TS.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoTipoMovimiento_TS.setResizable(true);
	    this.jInternalFrameReporteDinamicoTipoMovimiento_TS.setClosable(true);
	    this.jInternalFrameReporteDinamicoTipoMovimiento_TS.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoTipoMovimiento_TS.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoMovimiento_TS.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoMovimiento_TS.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoTipoMovimiento_TS.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Movimiento_ T Ses"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteTipoMovimiento_TS = new JLabelMe();

		this.jLabelColumnasSelectReporteTipoMovimiento_TS.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteTipoMovimiento_TS.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoMovimiento_TS.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoMovimiento_TS.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoMovimiento_TS = new GridBagConstraints();
		this.gridBagConstraintsTipoMovimiento_TS.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoMovimiento_TS.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoMovimiento_TS.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoMovimiento_TS.add(this.jLabelColumnasSelectReporteTipoMovimiento_TS, this.gridBagConstraintsTipoMovimiento_TS);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteTipoMovimiento_TS = new JList<Reporte>();
		this.jListColumnasSelectReporteTipoMovimiento_TS.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteTipoMovimiento_TS.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteTipoMovimiento_TS.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoMovimiento_TS.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoMovimiento_TS.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteTipoMovimiento_TS=new JScrollPane(this.jListColumnasSelectReporteTipoMovimiento_TS);
			
			this.jScrollColumnasSelectReporteTipoMovimiento_TS.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoMovimiento_TS.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoMovimiento_TS.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteTipoMovimiento_TS.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTipoMovimiento_TS = new GridBagConstraints();
		this.gridBagConstraintsTipoMovimiento_TS.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoMovimiento_TS.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoMovimiento_TS.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoMovimiento_TS.add(this.jListColumnasSelectReporteTipoMovimiento_TS, this.gridBagConstraintsTipoMovimiento_TS);
		this.jPanelReporteDinamicoTipoMovimiento_TS.add(this.jScrollColumnasSelectReporteTipoMovimiento_TS, this.gridBagConstraintsTipoMovimiento_TS);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteTipoMovimiento_TS = new JLabelMe();

		this.jLabelRelacionesSelectReporteTipoMovimiento_TS.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteTipoMovimiento_TS.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoMovimiento_TS.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoMovimiento_TS.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteTipoMovimiento_TS = new JList<Reporte>();
		this.jListRelacionesSelectReporteTipoMovimiento_TS.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteTipoMovimiento_TS.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteTipoMovimiento_TS.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoMovimiento_TS.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoMovimiento_TS.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteTipoMovimiento_TS=new JScrollPane(this.jListRelacionesSelectReporteTipoMovimiento_TS);
			
			this.jScrollRelacionesSelectReporteTipoMovimiento_TS.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoMovimiento_TS.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoMovimiento_TS.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteTipoMovimiento_TS.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoTipoMovimiento_TS = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoTipoMovimiento_TS = new JComboBoxMe();
		this.jListColumnasValoresGraficoTipoMovimiento_TS = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoTipoMovimiento_TS = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoTipoMovimiento_TS.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoTipoMovimiento_TS.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoMovimiento_TS.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoMovimiento_TS.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoTipoMovimiento_TS, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoTipoMovimiento_TS = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoTipoMovimiento_TS.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoTipoMovimiento_TS.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoMovimiento_TS.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoMovimiento_TS.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoTipoMovimiento_TS, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoTipoMovimiento_TS = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoTipoMovimiento_TS.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoTipoMovimiento_TS.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoMovimiento_TS.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoMovimiento_TS.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoMovimiento_TS = new GridBagConstraints();
		this.gridBagConstraintsTipoMovimiento_TS.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoMovimiento_TS.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoMovimiento_TS.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoMovimiento_TS.add(this.jLabelGenerarExcelReporteDinamicoTipoMovimiento_TS, this.gridBagConstraintsTipoMovimiento_TS);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoTipoMovimiento_TS = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoTipoMovimiento_TS.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoTipoMovimiento_TS,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoTipoMovimiento_TS.setToolTipText("Generar EXCEL"+" "+TipoMovimiento_TSConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsTipoMovimiento_TS = new GridBagConstraints();
		//this.gridBagConstraintsTipoMovimiento_TS.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsTipoMovimiento_TS.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsTipoMovimiento_TS.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoTipoMovimiento_TS.add(this.jButtonGenerarExcelReporteDinamicoTipoMovimiento_TS, this.gridBagConstraintsTipoMovimiento_TS);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsTipoMovimiento_TS = new GridBagConstraints();
		this.gridBagConstraintsTipoMovimiento_TS.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoMovimiento_TS.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoMovimiento_TS.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoMovimiento_TS.add(this.jComboBoxTiposReportesDinamicoTipoMovimiento_TS, this.gridBagConstraintsTipoMovimiento_TS);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoTipoMovimiento_TS = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoTipoMovimiento_TS.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoTipoMovimiento_TS.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoMovimiento_TS.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoMovimiento_TS.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoMovimiento_TS = new GridBagConstraints();
		this.gridBagConstraintsTipoMovimiento_TS.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoMovimiento_TS.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoMovimiento_TS.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoMovimiento_TS.add(this.jLabelTiposArchivoReporteDinamicoTipoMovimiento_TS, this.gridBagConstraintsTipoMovimiento_TS);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsTipoMovimiento_TS = new GridBagConstraints();
		this.gridBagConstraintsTipoMovimiento_TS.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoMovimiento_TS.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoMovimiento_TS.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoMovimiento_TS.add(this.jComboBoxTiposArchivosReportesDinamicoTipoMovimiento_TS, this.gridBagConstraintsTipoMovimiento_TS);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoTipoMovimiento_TS = new JButtonMe();
		this.jButtonGenerarReporteDinamicoTipoMovimiento_TS.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoTipoMovimiento_TS,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoTipoMovimiento_TS.setToolTipText("Generar"+" "+TipoMovimiento_TSConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsTipoMovimiento_TS = new GridBagConstraints();
		this.gridBagConstraintsTipoMovimiento_TS.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoMovimiento_TS.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoMovimiento_TS.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoMovimiento_TS.add(this.jButtonGenerarReporteDinamicoTipoMovimiento_TS, this.gridBagConstraintsTipoMovimiento_TS);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoTipoMovimiento_TS = new JButtonMe();
		this.jButtonCerrarReporteDinamicoTipoMovimiento_TS.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoTipoMovimiento_TS,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoTipoMovimiento_TS.setToolTipText("Cancelar"+" "+TipoMovimiento_TSConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoMovimiento_TS = new GridBagConstraints();
		this.gridBagConstraintsTipoMovimiento_TS.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoMovimiento_TS.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoMovimiento_TS.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoMovimiento_TS.add(this.jButtonCerrarReporteDinamicoTipoMovimiento_TS, this.gridBagConstraintsTipoMovimiento_TS);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalTipoMovimiento_TS = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoTipoMovimiento_TS= new JScrollPane(jPanelReporteDinamicoTipoMovimiento_TS,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoTipoMovimiento_TS.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoMovimiento_TS.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoMovimiento_TS.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoTipoMovimiento_TS.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Movimiento_ T Ses"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoMovimiento_TS = new GridBagConstraints();
		this.gridBagConstraintsTipoMovimiento_TS.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsTipoMovimiento_TS.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsTipoMovimiento_TS.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoTipoMovimiento_TS.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoTipoMovimiento_TS.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalTipoMovimiento_TS);
		this.jInternalFrameReporteDinamicoTipoMovimiento_TS.getContentPane().add(this.jScrollPanelReporteDinamicoTipoMovimiento_TS, this.gridBagConstraintsTipoMovimiento_TS);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionTipoMovimiento_TS() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionTipoMovimiento_TS = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionTipoMovimiento_TS = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionTipoMovimiento_TS.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionTipoMovimiento_TS.setName("jPanelImportacionTipoMovimiento_TS"); 
		
		this.jPanelImportacionTipoMovimiento_TS.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoMovimiento_TS.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoMovimiento_TS.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionTipoMovimiento_TS.setLayout(gridaBagLayoutImportacionTipoMovimiento_TS);
		
		
		this.jInternalFrameImportacionTipoMovimiento_TS= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionTipoMovimiento_TS= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionTipoMovimiento_TS = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoMovimiento_TS= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionTipoMovimiento_TS.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoMovimiento_TS.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoMovimiento_TS.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionTipoMovimiento_TS.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoMovimiento_TS.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoMovimiento_TS.setResizable(true);
	    this.jInternalFrameImportacionTipoMovimiento_TS.setClosable(true);
	    this.jInternalFrameImportacionTipoMovimiento_TS.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionTipoMovimiento_TS.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoMovimiento_TS.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoMovimiento_TS.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionTipoMovimiento_TS.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoMovimiento_TS.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoMovimiento_TS.setResizable(true);
	    this.jInternalFrameImportacionTipoMovimiento_TS.setClosable(true);
	    this.jInternalFrameImportacionTipoMovimiento_TS.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionTipoMovimiento_TS.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoMovimiento_TS.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoMovimiento_TS.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionTipoMovimiento_TS.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Movimiento_ T Ses"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionTipoMovimiento_TS = new JLabelMe();

		this.jLabelArchivoImportacionTipoMovimiento_TS.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionTipoMovimiento_TS.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoMovimiento_TS.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoMovimiento_TS.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoMovimiento_TS = new GridBagConstraints();
		this.gridBagConstraintsTipoMovimiento_TS.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoMovimiento_TS.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoMovimiento_TS.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoMovimiento_TS.add(this.jLabelArchivoImportacionTipoMovimiento_TS, this.gridBagConstraintsTipoMovimiento_TS);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionTipoMovimiento_TS = new JFileChooser();		
		this.jFileChooserImportacionTipoMovimiento_TS.setToolTipText("ESCOGER ARCHIVO"+" "+TipoMovimiento_TSConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionTipoMovimiento_TS = new JButtonMe();
		this.jButtonAbrirImportacionTipoMovimiento_TS.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionTipoMovimiento_TS,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionTipoMovimiento_TS.setToolTipText("Generar"+" "+TipoMovimiento_TSConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsTipoMovimiento_TS = new GridBagConstraints();
		this.gridBagConstraintsTipoMovimiento_TS.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoMovimiento_TS.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoMovimiento_TS.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoMovimiento_TS.add(this.jButtonAbrirImportacionTipoMovimiento_TS, this.gridBagConstraintsTipoMovimiento_TS);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionTipoMovimiento_TS = new JLabelMe();

		this.jLabelPathArchivoImportacionTipoMovimiento_TS.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionTipoMovimiento_TS.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoMovimiento_TS.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoMovimiento_TS.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoMovimiento_TS = new GridBagConstraints();
		this.gridBagConstraintsTipoMovimiento_TS.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoMovimiento_TS.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoMovimiento_TS.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoMovimiento_TS.add(this.jLabelPathArchivoImportacionTipoMovimiento_TS, this.gridBagConstraintsTipoMovimiento_TS);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionTipoMovimiento_TS=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionTipoMovimiento_TS.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoMovimiento_TS.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoMovimiento_TS.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsTipoMovimiento_TS = new GridBagConstraints();
		this.gridBagConstraintsTipoMovimiento_TS.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoMovimiento_TS.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoMovimiento_TS.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoMovimiento_TS.add(this.jTextFieldPathArchivoImportacionTipoMovimiento_TS, this.gridBagConstraintsTipoMovimiento_TS);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionTipoMovimiento_TS = new JButtonMe();
		this.jButtonGenerarImportacionTipoMovimiento_TS.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionTipoMovimiento_TS,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionTipoMovimiento_TS.setToolTipText("Generar"+" "+TipoMovimiento_TSConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsTipoMovimiento_TS = new GridBagConstraints();
		this.gridBagConstraintsTipoMovimiento_TS.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoMovimiento_TS.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoMovimiento_TS.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoMovimiento_TS.add(this.jButtonGenerarImportacionTipoMovimiento_TS, this.gridBagConstraintsTipoMovimiento_TS);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionTipoMovimiento_TS = new JButtonMe();
		this.jButtonCerrarImportacionTipoMovimiento_TS.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionTipoMovimiento_TS,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionTipoMovimiento_TS.setToolTipText("Cancelar"+" "+TipoMovimiento_TSConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoMovimiento_TS = new GridBagConstraints();
		this.gridBagConstraintsTipoMovimiento_TS.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoMovimiento_TS.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoMovimiento_TS.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoMovimiento_TS.add(this.jButtonCerrarImportacionTipoMovimiento_TS, this.gridBagConstraintsTipoMovimiento_TS);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalTipoMovimiento_TS = new GridBagLayout();
		
		this.jScrollPanelImportacionTipoMovimiento_TS= new JScrollPane(jPanelImportacionTipoMovimiento_TS,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsTipoMovimiento_TS = new GridBagConstraints();
		this.gridBagConstraintsTipoMovimiento_TS.gridy =iPosYImportacion;
		this.gridBagConstraintsTipoMovimiento_TS.gridx =iPosXImportacion;
		this.gridBagConstraintsTipoMovimiento_TS.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionTipoMovimiento_TS.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionTipoMovimiento_TS.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalTipoMovimiento_TS);
		this.jInternalFrameImportacionTipoMovimiento_TS.getContentPane().add(this.jScrollPanelImportacionTipoMovimiento_TS, this.gridBagConstraintsTipoMovimiento_TS);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByTipoMovimiento_TS(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByTipoMovimiento_TS = new JButtonMe();
			this.jButtonAbrirOrderByTipoMovimiento_TS.setText("Orden");
			this.jButtonAbrirOrderByTipoMovimiento_TS.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoMovimiento_TS,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoMovimiento_TS, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByTipoMovimiento_TS";
			inputMap = this.jButtonAbrirOrderByTipoMovimiento_TS.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByTipoMovimiento_TS.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByTipoMovimiento_TS"));
		
		
			GridBagLayout gridaBagLayoutOrderByTipoMovimiento_TS = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByTipoMovimiento_TS = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByTipoMovimiento_TS.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByTipoMovimiento_TS.setName("jPanelOrderByTipoMovimiento_TS"); 
			
			this.jPanelOrderByTipoMovimiento_TS.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoMovimiento_TS.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoMovimiento_TS.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByTipoMovimiento_TS, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByTipoMovimiento_TS.setLayout(gridaBagLayoutOrderByTipoMovimiento_TS);
			
			
			this.jTableDatosTipoMovimiento_TSOrderBy = new JTableMe();        
			this.jTableDatosTipoMovimiento_TSOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosTipoMovimiento_TSOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosTipoMovimiento_TSOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosTipoMovimiento_TSOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosTipoMovimiento_TSOrderBy.setViewportView(this.jTableDatosTipoMovimiento_TSOrderBy);
			this.jTableDatosTipoMovimiento_TSOrderBy.setFillsViewportHeight(true);
			this.jTableDatosTipoMovimiento_TSOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByTipoMovimiento_TS= new OrderByJInternalFrame();
			this.jInternalFrameOrderByTipoMovimiento_TS= new OrderByJInternalFrame();
			this.jScrollPanelOrderByTipoMovimiento_TS = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteTipoMovimiento_TS= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByTipoMovimiento_TS.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByTipoMovimiento_TS.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByTipoMovimiento_TS.setTitle("Orden");
			this.jInternalFrameOrderByTipoMovimiento_TS.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByTipoMovimiento_TS.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByTipoMovimiento_TS.setResizable(true);
			this.jInternalFrameOrderByTipoMovimiento_TS.setClosable(true);
			this.jInternalFrameOrderByTipoMovimiento_TS.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByTipoMovimiento_TS, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByTipoMovimiento_TS.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoMovimiento_TS.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoMovimiento_TS.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByTipoMovimiento_TS, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByTipoMovimiento_TS.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Movimiento_ T Ses"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsTipoMovimiento_TS = new GridBagConstraints();
			this.gridBagConstraintsTipoMovimiento_TS.gridy =iPosYOrderBy++;
			this.gridBagConstraintsTipoMovimiento_TS.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoMovimiento_TS.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsTipoMovimiento_TS.ipady =150;
				
			this.jPanelOrderByTipoMovimiento_TS.add(jScrollPanelDatosTipoMovimiento_TSOrderBy, this.gridBagConstraintsTipoMovimiento_TS);//this.jTableDatosTipoMovimiento_TSTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByTipoMovimiento_TS = new JButtonMe();
			this.jButtonCerrarOrderByTipoMovimiento_TS.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByTipoMovimiento_TS,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByTipoMovimiento_TS.setToolTipText("Cancelar"+" "+TipoMovimiento_TSConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByTipoMovimiento_TS, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsTipoMovimiento_TS = new GridBagConstraints();
			this.gridBagConstraintsTipoMovimiento_TS.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoMovimiento_TS.gridy = iPosYOrderBy++;
			this.gridBagConstraintsTipoMovimiento_TS.gridx = iPosXOrderBy;
									
			this.jPanelOrderByTipoMovimiento_TS.add(this.jButtonCerrarOrderByTipoMovimiento_TS, this.gridBagConstraintsTipoMovimiento_TS);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalTipoMovimiento_TS = new GridBagLayout();
			
			this.jScrollPanelOrderByTipoMovimiento_TS= new JScrollPane(jPanelOrderByTipoMovimiento_TS,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsTipoMovimiento_TS = new GridBagConstraints();
			this.gridBagConstraintsTipoMovimiento_TS.gridy =iPosYOrderBy;
			this.gridBagConstraintsTipoMovimiento_TS.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoMovimiento_TS.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByTipoMovimiento_TS.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByTipoMovimiento_TS.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalTipoMovimiento_TS);
			
			this.jInternalFrameOrderByTipoMovimiento_TS.getContentPane().add(this.jScrollPanelOrderByTipoMovimiento_TS, this.gridBagConstraintsTipoMovimiento_TS);			
		
		} else {
			this.jButtonAbrirOrderByTipoMovimiento_TS = new JButtonMe();
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
			&& this.tipomovimiento_tsSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosTipoMovimiento_TS.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosTipoMovimiento_TS.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosTipoMovimiento_TS.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosTipoMovimiento_TS.getRowHeight();//TipoMovimiento_TSConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.tipomovimiento_tsSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > TipoMovimiento_TSConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoMovimiento_TS.isSelected()) {
					iHeightTable=TipoMovimiento_TSConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoMovimiento_TSConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoMovimiento_TSConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > TipoMovimiento_TSConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoMovimiento_TS.isSelected()) {
					iHeightTable=TipoMovimiento_TSConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoMovimiento_TSConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoMovimiento_TSConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosTipoMovimiento_TS.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoMovimiento_TS.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoMovimiento_TS.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosTipoMovimiento_TS.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoMovimiento_TS.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoMovimiento_TS.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByTipoMovimiento_TS!=null && this.jInternalFrameOrderByTipoMovimiento_TS.getjTableDatosOrderBy()!=null) {
			//if(!this.tipomovimiento_tsSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByTipoMovimiento_TS.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByTipoMovimiento_TS.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByTipoMovimiento_TS.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByTipoMovimiento_TS.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByTipoMovimiento_TS.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByTipoMovimiento_TS.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByTipoMovimiento_TS.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosTipoMovimiento_TS.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoMovimiento_TS.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoMovimiento_TS.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=tipomovimiento_tsLogic.getTipoMovimiento_TSs().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipomovimiento_tss.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<TipoMovimiento_TS> TraerTipoMovimiento_TSBeans(List<TipoMovimiento_TS> tipomovimiento_tss,ArrayList<Classe> classes)throws Exception {
		try {
			for(TipoMovimiento_TS tipomovimiento_ts:tipomovimiento_tss) {
					
				if(!(TipoMovimiento_TSConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || TipoMovimiento_TSConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					tipomovimiento_ts.setsDetalleGeneralEntityReporte(TipoMovimiento_TSConstantesFunciones.getTipoMovimiento_TSDescripcion(tipomovimiento_ts));
										
						
					
						
					
				} else  {
							
					//tipomovimiento_ts.setsDetalleGeneralEntityReporte(tipomovimiento_ts.getsDetalleGeneralEntityReporte());
										
				}
				
				//tipomovimiento_tsbeans.add(tipomovimiento_tsbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return tipomovimiento_tss;
    }
	//PARA REPORTES FIN
}
