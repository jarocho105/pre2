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
import com.bydan.erp.cartera.util.TipoBienConstantesFunciones;

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
public class TipoBienJInternalFrame extends TipoBienBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarTipoBien;
	
	protected JMenuBar jmenuBarTipoBien;
	
	protected JMenu jmenuTipoBien;
	protected JMenu jmenuDatosTipoBien;
	protected JMenu jmenuArchivoTipoBien;
	protected JMenu jmenuAccionesTipoBien;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosTipoBien = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoBien;	
	protected GridBagConstraints gridBagConstraintsTipoBien;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public TipoBienDetalleFormJInternalFrame jInternalFrameDetalleFormTipoBien;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoTipoBien;	
	protected ImportacionJInternalFrame jInternalFrameImportacionTipoBien;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public TipoBienSessionBean tipobienSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<TipoBien> tipobiens;		
	public List<TipoBien> tipobiensEliminados;	
	public List<TipoBien> tipobiensAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByTipoBien;		
	protected JButton jButtonAbrirOrderByTipoBien;
	
	
	//protected JPanel jPanelOrderByTipoBien;
	//public JScrollPane jScrollPanelOrderByTipoBien;	
	//protected JButton jButtonCerrarOrderByTipoBien;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public TipoBienLogic tipobienLogic;
	
	
	
	public JScrollPane jScrollPanelDatosTipoBien;
	public JScrollPane jScrollPanelDatosEdicionTipoBien;
	public JScrollPane jScrollPanelDatosGeneralTipoBien;
    
	
	
	//public JScrollPane jScrollPanelDatosTipoBienOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoTipoBien;
	//public JScrollPane jScrollPanelImportacionTipoBien;
	
	
	
	protected JPanel jPanelAccionesTipoBien;
	
    protected JPanel jPanelPaginacionTipoBien;
    protected JPanel jPanelParametrosReportesTipoBien;
	protected JPanel jPanelParametrosReportesAccionesTipoBien;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1TipoBien;
	protected JPanel jPanelParametrosAuxiliar2TipoBien;
	protected JPanel jPanelParametrosAuxiliar3TipoBien;
	protected JPanel jPanelParametrosAuxiliar4TipoBien;
	//protected JPanel jPanelParametrosAuxiliar5TipoBien;
	
	
	
	//protected JPanel jPanelReporteDinamicoTipoBien;
	//protected JPanel jPanelImportacionTipoBien;
	
	
	public JTable jTableDatosTipoBien;
	
	
	
	//public JTable jTableDatosTipoBienOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoTipoBien;
	protected JButton jButtonDuplicarTipoBien;
	protected JButton jButtonCopiarTipoBien;
	protected JButton jButtonVerFormTipoBien;
	protected JButton jButtonNuevoRelacionesTipoBien;
	protected JButton jButtonModificarTipoBien;
	
    protected JButton jButtonGuardarCambiosTablaTipoBien;
	protected JButton jButtonCerrarTipoBien;
	
	
	protected JButton jButtonRecargarInformacionTipoBien;
	protected JButton jButtonProcesarInformacionTipoBien;
	
	
	protected JButton jButtonAnterioresTipoBien;
	protected JButton jButtonSiguientesTipoBien;
	protected JButton jButtonNuevoGuardarCambiosTipoBien;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoTipoBien;
	//protected JButton jButtonCerrarReporteDinamicoTipoBien;
	//protected JButton jButtonGenerarExcelReporteDinamicoTipoBien;	
	
	
	
	//protected JButton jButtonAbrirImportacionTipoBien;
	//protected JButton jButtonGenerarImportacionTipoBien;
	//protected JButton jButtonCerrarImportacionTipoBien;
	//protected JFileChooser jFileChooserImportacionTipoBien;
	//protected File fileImportacionTipoBien;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoBien;
	protected JButton jButtonDuplicarToolBarTipoBien;
	protected JButton jButtonNuevoRelacionesToolBarTipoBien;
	
	
	public JButton jButtonGuardarCambiosToolBarTipoBien;
	protected JButton jButtonCopiarToolBarTipoBien;
	protected JButton jButtonVerFormToolBarTipoBien;
	public JButton jButtonGuardarCambiosTablaToolBarTipoBien;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoBien;
	protected JButton jButtonCerrarToolBarTipoBien;
	
	protected JButton jButtonRecargarInformacionToolBarTipoBien;
	protected JButton jButtonProcesarInformacionToolBarTipoBien;
	protected JButton jButtonAnterioresToolBarTipoBien;
	protected JButton jButtonSiguientesToolBarTipoBien;
	protected JButton jButtonNuevoGuardarCambiosToolBarTipoBien;
	protected JButton jButtonAbrirOrderByToolBarTipoBien;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoBien;
	protected JMenuItem jMenuItemDuplicarTipoBien;
	protected JMenuItem jMenuItemNuevoRelacionesTipoBien;
	
	
	protected JMenuItem jMenuItemGuardarCambiosTipoBien;
	protected JMenuItem jMenuItemCopiarTipoBien;
	protected JMenuItem jMenuItemVerFormTipoBien;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoBien;
	protected JMenuItem jMenuItemCerrarTipoBien;
	protected JMenuItem jMenuItemDetalleCerrarTipoBien;
	protected JMenuItem jMenuItemDetalleAbrirOrderByTipoBien;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoBien;
	
	protected JMenuItem jMenuItemRecargarInformacionTipoBien;
	protected JMenuItem jMenuItemProcesarInformacionTipoBien;
	protected JMenuItem jMenuItemAnterioresTipoBien;
	protected JMenuItem jMenuItemSiguientesTipoBien;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoBien;
	protected JMenuItem jMenuItemAbrirOrderByTipoBien;
	protected JMenuItem jMenuItemMostrarOcultarTipoBien;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoBien;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosTipoBien;
	protected JCheckBox jCheckBoxSeleccionadosTipoBien;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaTipoBien;
	protected JCheckBox jCheckBoxConGraficoReporteTipoBien;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesTipoBien;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesTipoBien;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoTipoBien;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoTipoBien;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesTipoBien;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionTipoBien;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoBien;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoBien;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarTipoBien;
	protected JTextField jTextFieldValorCampoGeneralTipoBien;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteTipoBien;
	//public JList<Reporte> jListColumnasSelectReporteTipoBien;
	//public JScrollPane jScrollColumnasSelectReporteTipoBien;
	
	//public JLabel jLabelRelacionesSelectReporteTipoBien;
	//public JList<Reporte> jListRelacionesSelectReporteTipoBien;
	//public JScrollPane jScrollRelacionesSelectReporteTipoBien;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoTipoBien;
	//protected JCheckBox jCheckBoxConGraficoDinamicoTipoBien;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoTipoBien;
	//public JLabel jLabelTiposArchivoReporteDinamicoTipoBien;
	
		
	//public JLabel jLabelArchivoImportacionTipoBien;	
	//public JLabel jLabelPathArchivoImportacionTipoBien;
	//protected JTextField jTextFieldPathArchivoImportacionTipoBien;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoTipoBien;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoTipoBien;
	
	//public JLabel jLabelColumnaCategoriaValorTipoBien;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorTipoBien;
	
	//public JLabel jLabelColumnasValoresGraficoTipoBien;
	//public JList<Reporte> jListColumnasValoresGraficoTipoBien;
	//public JScrollPane jScrollColumnasValoresGraficoTipoBien;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoTipoBien;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoTipoBien;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasTipoBien;
	
	
	
	
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
	public TipoBienJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("TipoBien No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoBienJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoBien No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoBienJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoBien No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoBienJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoBien No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionTipoBien)	{
		this.jButtonRecargarInformacionTipoBien = jButtonRecargarInformacionTipoBien;
	}
	
	public JButton getjButtonProcesarInformacionTipoBien() {
		return this.jButtonProcesarInformacionTipoBien;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoBien)	{
		this.jButtonProcesarInformacionTipoBien = jButtonProcesarInformacionTipoBien;
	}
	
	
	public JButton getjButtonRecargarInformacionTipoBien() {
		return this.jButtonRecargarInformacionTipoBien;
	}
	
	
	public List<TipoBien> gettipobiens() {
		return this.tipobiens;
	}

	public void settipobiens(List<TipoBien> tipobiens) {
		this.tipobiens = tipobiens;
	}
	
	public List<TipoBien> gettipobiensAux() {
		return this.tipobiensAux;
	}

	public void settipobiensAux(List<TipoBien> tipobiensAux) {
		this.tipobiensAux = tipobiensAux;
	}
	
	public List<TipoBien> gettipobiensEliminados() {
		return this.tipobiensEliminados;
	}

	public void setTipoBiensEliminados(List<TipoBien> tipobiensEliminados) {
		this.tipobiensEliminados = tipobiensEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarTipoBien() {
		return jComboBoxTiposSeleccionarTipoBien;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarTipoBien(
			JComboBox jComboBoxTiposSeleccionarTipoBien) {
		this.jComboBoxTiposSeleccionarTipoBien = jComboBoxTiposSeleccionarTipoBien;
	}
	
	public void setBorderResaltarTiposSeleccionarTipoBien() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarTipoBien.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarTipoBien .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralTipoBien() {
		return jTextFieldValorCampoGeneralTipoBien;
	}

	public void setjTextFieldValorCampoGeneralTipoBien(
			JTextField jTextFieldValorCampoGeneralTipoBien) {
		this.jTextFieldValorCampoGeneralTipoBien = jTextFieldValorCampoGeneralTipoBien;
	}

	public void setBorderResaltarValorCampoGeneralTipoBien() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoBien.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralTipoBien .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosTipoBien() {
		return this.jCheckBoxSeleccionarTodosTipoBien;
	}

	public void setjCheckBoxSeleccionarTodosTipoBien(
			JCheckBox jCheckBoxSeleccionarTodosTipoBien) {
		this.jCheckBoxSeleccionarTodosTipoBien = jCheckBoxSeleccionarTodosTipoBien;
	}

	public void setBorderResaltarSeleccionarTodosTipoBien() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoBien.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosTipoBien .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosTipoBien() {
		return this.jCheckBoxSeleccionadosTipoBien;
	}

	public void setjCheckBoxSeleccionadosTipoBien(
			JCheckBox jCheckBoxSeleccionadosTipoBien) {
		this.jCheckBoxSeleccionadosTipoBien = jCheckBoxSeleccionadosTipoBien;
	}
	
	public void setBorderResaltarSeleccionadosTipoBien() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoBien.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosTipoBien .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesTipoBien() {
		return this.jComboBoxTiposArchivosReportesTipoBien;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesTipoBien(
			JComboBox jComboBoxTiposArchivosReportesTipoBien) {
		this.jComboBoxTiposArchivosReportesTipoBien = jComboBoxTiposArchivosReportesTipoBien;
	}

	public void setBorderResaltarTiposArchivosReportesTipoBien() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoBien.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesTipoBien .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesTipoBien() {
		return this.jComboBoxTiposReportesTipoBien;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesTipoBien(
			JComboBox jComboBoxTiposReportesTipoBien) {
		this.jComboBoxTiposReportesTipoBien = jComboBoxTiposReportesTipoBien;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoTipoBien() {
	//	return jComboBoxTiposReportesDinamicoTipoBien;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoTipoBien(
	//		JComboBox jComboBoxTiposReportesDinamicoTipoBien) {
	//	this.jComboBoxTiposReportesDinamicoTipoBien = jComboBoxTiposReportesDinamicoTipoBien;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoTipoBien() {
	//	return jComboBoxTiposArchivosReportesDinamicoTipoBien;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoTipoBien(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoTipoBien) {
	//	this.jComboBoxTiposArchivosReportesDinamicoTipoBien = jComboBoxTiposArchivosReportesDinamicoTipoBien;
	//}
	
	public void setBorderResaltarTiposReportesTipoBien() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoBien.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesTipoBien .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesTipoBien() {
		return this.jComboBoxTiposGraficosReportesTipoBien;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesTipoBien(
			JComboBox jComboBoxTiposGraficosReportesTipoBien) {
		this.jComboBoxTiposGraficosReportesTipoBien = jComboBoxTiposGraficosReportesTipoBien;
	}
	
	public void setBorderResaltarTiposGraficosReportesTipoBien() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoBien.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesTipoBien .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionTipoBien() {
		return this.jComboBoxTiposPaginacionTipoBien;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionTipoBien(
			JComboBox jComboBoxTiposPaginacionTipoBien) {
		this.jComboBoxTiposPaginacionTipoBien = jComboBoxTiposPaginacionTipoBien;
	}
	
	public void setBorderResaltarTiposPaginacionTipoBien() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoBien.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionTipoBien .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesTipoBien() {
		return this.jComboBoxTiposRelacionesTipoBien;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoBien() {
		return this.jComboBoxTiposAccionesTipoBien;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoBien(
			JComboBox jComboBoxTiposRelacionesTipoBien) {
		this.jComboBoxTiposRelacionesTipoBien = jComboBoxTiposRelacionesTipoBien;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoBien(
			JComboBox jComboBoxTiposAccionesTipoBien) {
		this.jComboBoxTiposAccionesTipoBien = jComboBoxTiposAccionesTipoBien;
	}
	
	public void setBorderResaltarTiposRelacionesTipoBien() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoBien.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesTipoBien .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesTipoBien() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoBien.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesTipoBien .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoTipoBien() {
	//	return jCheckBoxConGraficoDinamicoTipoBien;
	//}

	//public void setjCheckBoxConGraficoDinamicoTipoBien(
	//		JCheckBox jCheckBoxConGraficoDinamicoTipoBien) {
	//	this.jCheckBoxConGraficoDinamicoTipoBien = jCheckBoxConGraficoDinamicoTipoBien;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoTipoBien() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarTipoBien.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoTipoBien .setBorder(borderResaltar);		
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
		this.tipobienSessionBean=new TipoBienSessionBean();
		
		this.tipobienSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipobienSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipobienSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=TipoBienJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=TipoBienJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoBienJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoBienJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoBienJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Bien MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.tipobienSessionBean.getEsGuardarRelacionado()) {
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
		
		TipoBienJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("TipoBien No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarTipoBien= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarTipoBien=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarTipoBien,this.jTtoolBarTipoBien,
							"nuevo","nuevo","Nuevo"+" "+TipoBienConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoBien=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarTipoBien,this.jTtoolBarTipoBien,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoBien=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarTipoBien,this.jTtoolBarTipoBien,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+TipoBienConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarTipoBien=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarTipoBien,this.jTtoolBarTipoBien,
							"duplicar","duplicar","Duplicar"+" "+TipoBienConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarTipoBien=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarTipoBien,this.jTtoolBarTipoBien,
							"copiar","copiar","Copiar"+" "+TipoBienConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarTipoBien=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarTipoBien,this.jTtoolBarTipoBien,
							"ver_form","ver_form","Ver"+" "+TipoBienConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarTipoBien=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoBien,this.jTtoolBarTipoBien,
							"recargar","recargar","Recargar"+" "+TipoBienConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarTipoBien=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoBien,this.jTtoolBarTipoBien,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarTipoBien=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoBien,this.jTtoolBarTipoBien,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarTipoBien=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarTipoBien,this.jTtoolBarTipoBien,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarTipoBien=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarTipoBien,this.jTtoolBarTipoBien,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarTipoBien=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarTipoBien,this.jTtoolBarTipoBien,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+TipoBienConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarTipoBien=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarTipoBien,this.jTtoolBarTipoBien,
							"cerrar","cerrar","Salir"+" "+TipoBienConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarTipoBien=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarTipoBien;
			
				this.jButtonProcesarInformacionToolBarTipoBien=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarTipoBien;
				
		//protected JButton jButtonModificarToolBarTipoBien;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarTipoBien=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuTipoBien=new JMenuMe("General");
		this.jmenuArchivoTipoBien=new JMenuMe("Archivo");
		this.jmenuAccionesTipoBien=new JMenuMe("Acciones");
		this.jmenuDatosTipoBien=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoBien= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoBien.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoBien,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoBien, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarTipoBien= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarTipoBien.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarTipoBien,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarTipoBien, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesTipoBien= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesTipoBien.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesTipoBien,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesTipoBien, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosTipoBien= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoBien.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoBien,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoBien, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarTipoBien= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarTipoBien.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarTipoBien,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarTipoBien, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormTipoBien= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormTipoBien.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormTipoBien,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormTipoBien, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaTipoBien= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaTipoBien.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaTipoBien,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaTipoBien, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoBien= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoBien.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoBien,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoBien, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionTipoBien= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionTipoBien.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionTipoBien,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionTipoBien, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionTipoBien= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionTipoBien.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionTipoBien,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresTipoBien= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresTipoBien.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresTipoBien,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresTipoBien, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesTipoBien= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesTipoBien.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesTipoBien,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesTipoBien, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByTipoBien= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByTipoBien.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByTipoBien,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByTipoBien, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoBien= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoBien.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoBien,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoBien, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByTipoBien= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByTipoBien.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByTipoBien,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByTipoBien, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoBien= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoBien.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoBien,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoBien, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosTipoBien= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosTipoBien.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosTipoBien,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosTipoBien, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoTipoBien.add(this.jMenuItemCerrarTipoBien);
			
			this.jmenuAccionesTipoBien.add(this.jMenuItemNuevoTipoBien);
			this.jmenuAccionesTipoBien.add(this.jMenuItemNuevoGuardarCambiosTipoBien);
			this.jmenuAccionesTipoBien.add(this.jMenuItemNuevoRelacionesTipoBien);
			this.jmenuAccionesTipoBien.add(this.jMenuItemGuardarCambiosTablaTipoBien);		
			this.jmenuAccionesTipoBien.add(this.jMenuItemDuplicarTipoBien);		
			this.jmenuAccionesTipoBien.add(this.jMenuItemCopiarTipoBien);		
			this.jmenuAccionesTipoBien.add(this.jMenuItemVerFormTipoBien);		
			
			this.jmenuDatosTipoBien.add(this.jMenuItemRecargarInformacionTipoBien);				
			this.jmenuDatosTipoBien.add(this.jMenuItemAnterioresTipoBien);				
			this.jmenuDatosTipoBien.add(this.jMenuItemSiguientesTipoBien);				
			this.jmenuDatosTipoBien.add(this.jMenuItemAbrirOrderByTipoBien);				
			this.jmenuDatosTipoBien.add(this.jMenuItemMostrarOcultarTipoBien);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesTipoBien.add(this.jMenuItemGuardarCambiosTipoBien);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoTipoBien, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesTipoBien, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosTipoBien, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarTipoBien.add(this.jmenuArchivoTipoBien);		
			this.jmenuBarTipoBien.add(this.jmenuAccionesTipoBien);		
			this.jmenuBarTipoBien.add(this.jmenuDatosTipoBien);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarTipoBien);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasTipoBien() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		

		this.jTabbedPaneBusquedasTipoBien=new JTabbedPane();


		this.jTabbedPaneBusquedasTipoBien.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoBien.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoBien.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasTipoBien.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasTipoBien.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasTipoBien,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleTipoBien = new TipoBienDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Tipo Bien DATOS");
			this.jInternalFrameDetalleFormTipoBien = new TipoBienDetalleFormJInternalFrame(jDesktopPane,this.tipobienSessionBean.getConGuardarRelaciones(),this.tipobienSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormTipoBien = null;//new TipoBienDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoBien= new GridBagLayout();
		
		
		this.jTableDatosTipoBien = new JTableMe();      
		
		String sToolTipTipoBien="";
		sToolTipTipoBien=TipoBienConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoBien+="(Cartera.TipoBien)";
		}
		
		if(!this.tipobienSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoBien+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosTipoBien.setToolTipText(sToolTipTipoBien);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosTipoBien);
		this.jTableDatosTipoBien.setAutoCreateRowSorter(true);
		this.jTableDatosTipoBien.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosTipoBien.setRowSelectionAllowed(true);
		this.jTableDatosTipoBien.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosTipoBien,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoTipoBien = new JButtonMe();
		this.jButtonDuplicarTipoBien = new JButtonMe();
		this.jButtonCopiarTipoBien = new JButtonMe();
		this.jButtonVerFormTipoBien = new JButtonMe();
		this.jButtonNuevoRelacionesTipoBien = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaTipoBien = new JButtonMe();
		this.jButtonCerrarTipoBien = new JButtonMe();
		
		this.jScrollPanelDatosTipoBien = new JScrollPane();   
        this.jScrollPanelDatosGeneralTipoBien = new JScrollPane();
		
				
		
		
		this.jPanelAccionesTipoBien = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Bien";
		
		if(!this.tipobienSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoBien.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Bienes" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoBien.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralTipoBien.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesTipoBien.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoBien.setToolTipText("Acciones");
        this.jPanelAccionesTipoBien.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoBien, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoBien, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoTipoBien=new ReporteDinamicoJInternalFrame(TipoBienConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoTipoBien();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionTipoBien=new ImportacionJInternalFrame(TipoBienConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionTipoBien();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByTipoBien = new JButtonMe();
		
		this.jButtonAbrirOrderByTipoBien.setText("Orden");
		this.jButtonAbrirOrderByTipoBien.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoBien,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoBien, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByTipoBien.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByTipoBien.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoBien=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoBien,false,this);
			
			//this.cargarOrderByTipoBien(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoBien=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoBien,true,this);
			
			//this.cargarOrderByTipoBien(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosTipoBien.setMinimumSize(new Dimension(400,50));//430
		this.jTableDatosTipoBien.setMaximumSize(new Dimension(400,50));//430
		this.jTableDatosTipoBien.setPreferredSize(new Dimension(400,50));//430
		
		this.jScrollPanelDatosTipoBien.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoBien.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoBien.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoTipoBien.setText("Nuevo");
		this.jButtonDuplicarTipoBien.setText("Duplicar");
		this.jButtonCopiarTipoBien.setText("Copiar");
		this.jButtonVerFormTipoBien.setText("Ver");
		this.jButtonNuevoRelacionesTipoBien.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaTipoBien.setText("Guardar");
		this.jButtonCerrarTipoBien.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoBien,"nuevo_button","Nuevo",this.tipobienSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarTipoBien,"duplicar_button","Duplicar",this.tipobienSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarTipoBien,"copiar_button","Copiar",this.tipobienSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormTipoBien,"ver_form","Ver",this.tipobienSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesTipoBien,"nuevorelaciones_button","Nuevo Rel",this.tipobienSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoBien,"guardarcambiostabla_button","Guardar",this.tipobienSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoBien,"cerrar_button","Salir",this.tipobienSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoBien, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarTipoBien, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarTipoBien, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormTipoBien, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesTipoBien, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoBien, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoBien, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoTipoBien.setToolTipText("Nuevo"+" "+TipoBienConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarTipoBien.setToolTipText("Duplicar"+" "+TipoBienConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarTipoBien.setToolTipText("Copiar"+" "+TipoBienConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormTipoBien.setToolTipText("Ver"+" "+TipoBienConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesTipoBien.setToolTipText("Nuevo Rel"+" "+TipoBienConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaTipoBien.setToolTipText("Guardar"+" "+TipoBienConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoBien.setToolTipText("Salir"+" "+TipoBienConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoBien";
		inputMap = this.jButtonNuevoTipoBien.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoBien.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoBien"));
		
		//DUPLICAR
		sMapKey = "DuplicarTipoBien";
		inputMap = this.jButtonDuplicarTipoBien.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarTipoBien.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarTipoBien"));
		
		//COPIAR
		sMapKey = "CopiarTipoBien";
		inputMap = this.jButtonCopiarTipoBien.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarTipoBien.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarTipoBien"));
		
		//VEr FORM
		sMapKey = "VerFormTipoBien";
		inputMap = this.jButtonVerFormTipoBien.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormTipoBien.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormTipoBien"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesTipoBien";
		inputMap = this.jButtonNuevoRelacionesTipoBien.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesTipoBien.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesTipoBien"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarTipoBien";
		inputMap = this.jButtonModificarTipoBien.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarTipoBien.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarTipoBien"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarTipoBien";
		inputMap = this.jButtonCerrarTipoBien.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoBien.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoBien"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoBien";
		inputMap = this.jButtonGuardarCambiosTablaTipoBien.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoBien.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoBien"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesTipoBien = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesTipoBien = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionTipoBien = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1TipoBien= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2TipoBien= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3TipoBien= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4TipoBien= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5TipoBien= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesTipoBien.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesTipoBien.setName("jPanelParametrosReportesTipoBien"); 
		
		this.jPanelParametrosReportesAccionesTipoBien.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesTipoBien.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesTipoBien.setName("jPanelParametrosReportesAccionesTipoBien"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesTipoBien, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesTipoBien, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionTipoBien = new JButtonMe();
		this.jButtonRecargarInformacionTipoBien.setText("Recargar");
		this.jButtonRecargarInformacionTipoBien.setToolTipText("Recargar"+" "+TipoBienConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionTipoBien,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionTipoBien = new JButtonMe();
		this.jButtonProcesarInformacionTipoBien.setText("Procesar");
		this.jButtonProcesarInformacionTipoBien.setToolTipText("Procesar"+" "+TipoBienConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionTipoBien.setVisible(false);
			
		this.jButtonProcesarInformacionTipoBien.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoBien.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoBien.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesTipoBien = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoBien.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesTipoBien.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesTipoBien = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoBien.setText("TIPO");       
		this.jComboBoxTiposReportesTipoBien.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesTipoBien = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoBien.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesTipoBien.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionTipoBien = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionTipoBien.setText("Paginacion");
		this.jComboBoxTiposPaginacionTipoBien.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesTipoBien = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesTipoBien.setText("Accion");
		this.jComboBoxTiposRelacionesTipoBien.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesTipoBien = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoBien.setText("Accion");
		this.jComboBoxTiposAccionesTipoBien.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarTipoBien = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarTipoBien.setText("Accion");
		this.jComboBoxTiposSeleccionarTipoBien.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralTipoBien=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralTipoBien.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoBien.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoBien.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesTipoBien = new JLabelMe();
		
		this.jLabelAccionesTipoBien.setText("Acciones");		
		this.jLabelAccionesTipoBien.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoBien.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoBien.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosTipoBien = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosTipoBien.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosTipoBien.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosTipoBien = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosTipoBien.setText("Seleccionados");
		this.jCheckBoxSeleccionadosTipoBien.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaTipoBien = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaTipoBien.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaTipoBien.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteTipoBien = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteTipoBien.setText("Graf.");
		this.jCheckBoxConGraficoReporteTipoBien.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresTipoBien = new JButtonMe();
		//this.jButtonAnterioresTipoBien.setText("<<");
        this.jButtonAnterioresTipoBien.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresTipoBien,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresTipoBien, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesTipoBien = new JButtonMe();
		//this.jButtonSiguientesTipoBien.setText(">>");
        this.jButtonSiguientesTipoBien.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesTipoBien,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesTipoBien, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosTipoBien = new JButtonMe();
		this.jButtonNuevoGuardarCambiosTipoBien.setText("Nue");
        this.jButtonNuevoGuardarCambiosTipoBien.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosTipoBien,"nuevoguardarcambios_button","Nue",this.tipobienSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosTipoBien, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosTipoBien";
		inputMap = this.jButtonNuevoGuardarCambiosTipoBien.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosTipoBien.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosTipoBien"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionTipoBien";
		inputMap = this.jButtonRecargarInformacionTipoBien.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionTipoBien.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionTipoBien"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesTipoBien";
		inputMap = this.jButtonSiguientesTipoBien.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesTipoBien.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesTipoBien"));
		
		//ANTERIORES		
		sMapKey = "AnterioresTipoBien";
		inputMap = this.jButtonAnterioresTipoBien.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresTipoBien.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresTipoBien"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasTipoBien();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesTipoBien.setMinimumSize(new Dimension(this.getWidth(),TipoBienBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoBienBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoBien.setMaximumSize(new Dimension(this.getWidth(),TipoBienBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoBienBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoBien.setPreferredSize(new Dimension(this.getWidth(),TipoBienBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoBienBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionTipoBien = new GridBagLayout();

			this.jPanelPaginacionTipoBien.setLayout(gridaBagLayoutPaginacionTipoBien);						
			
			this.gridBagConstraintsTipoBien = new GridBagConstraints();
			this.gridBagConstraintsTipoBien.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsTipoBien.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoBien.gridy = 0;
			this.gridBagConstraintsTipoBien.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionTipoBien.add(this.jButtonAnterioresTipoBien, this.gridBagConstraintsTipoBien);
					
						
			this.gridBagConstraintsTipoBien = new GridBagConstraints();
			this.gridBagConstraintsTipoBien.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoBien.gridy = 0;
			
			this.jPanelPaginacionTipoBien.add(this.jButtonNuevoGuardarCambiosTipoBien, this.gridBagConstraintsTipoBien);
						
			
			this.gridBagConstraintsTipoBien = new GridBagConstraints();
			this.gridBagConstraintsTipoBien.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsTipoBien.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoBien.gridy = 0;
			this.jPanelPaginacionTipoBien.add(this.jButtonSiguientesTipoBien, this.gridBagConstraintsTipoBien);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsTipoBien = new GridBagConstraints();
			this.gridBagConstraintsTipoBien.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoBien.gridy = 1;
			this.gridBagConstraintsTipoBien.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoBien.add(this.jButtonNuevoTipoBien, this.gridBagConstraintsTipoBien);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsTipoBien = new GridBagConstraints();
				this.gridBagConstraintsTipoBien.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoBien.gridy = 1;
				this.gridBagConstraintsTipoBien.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionTipoBien.add(this.jButtonNuevoRelacionesTipoBien, this.gridBagConstraintsTipoBien);
			}
			
			
			if(!this.tipobienSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsTipoBien = new GridBagConstraints();
				this.gridBagConstraintsTipoBien.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoBien.gridy = 1;
				this.gridBagConstraintsTipoBien.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionTipoBien.add(this.jButtonGuardarCambiosTablaTipoBien, this.gridBagConstraintsTipoBien);
			}
			
			
			
			this.gridBagConstraintsTipoBien = new GridBagConstraints();
			this.gridBagConstraintsTipoBien.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoBien.gridy = 1;
			this.gridBagConstraintsTipoBien.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoBien.add(this.jButtonDuplicarTipoBien, this.gridBagConstraintsTipoBien);
			
			this.gridBagConstraintsTipoBien = new GridBagConstraints();
			this.gridBagConstraintsTipoBien.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoBien.gridy = 1;
			this.gridBagConstraintsTipoBien.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoBien.add(this.jButtonCopiarTipoBien, this.gridBagConstraintsTipoBien);
		
			this.gridBagConstraintsTipoBien = new GridBagConstraints();
			this.gridBagConstraintsTipoBien.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoBien.gridy = 1;
			this.gridBagConstraintsTipoBien.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoBien.add(this.jButtonVerFormTipoBien, this.gridBagConstraintsTipoBien);
		
			this.gridBagConstraintsTipoBien = new GridBagConstraints();
			this.gridBagConstraintsTipoBien.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoBien.gridy = 1;
			this.gridBagConstraintsTipoBien.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionTipoBien.add(this.jButtonCerrarTipoBien, this.gridBagConstraintsTipoBien);
		
		
		
		this.jButtonRecargarInformacionTipoBien.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoBien.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoBien.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionTipoBien, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesTipoBien.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoBien.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoBien.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesTipoBien, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesTipoBien.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoBien.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoBien.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesTipoBien, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesTipoBien.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoBien.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoBien.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesTipoBien, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionTipoBien.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoBien.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoBien.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionTipoBien, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesTipoBien.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoBien.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoBien.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesTipoBien, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesTipoBien.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoBien.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoBien.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoBien, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarTipoBien.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoBien.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoBien.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarTipoBien, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaTipoBien.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoBien.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoBien.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaTipoBien, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteTipoBien.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoBien.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoBien.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteTipoBien, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosTipoBien.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoBien.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoBien.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosTipoBien, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosTipoBien.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoBien.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoBien.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosTipoBien, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesTipoBien = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesTipoBien = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1TipoBien = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2TipoBien = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3TipoBien = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4TipoBien = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesTipoBien.setLayout(gridaBagParametrosReportesTipoBien);
			this.jPanelParametrosReportesAccionesTipoBien.setLayout(gridaBagParametrosReportesAccionesTipoBien);
			
			
			this.jPanelParametrosAuxiliar1TipoBien.setLayout(gridaBagParametrosAuxiliar1TipoBien);
			this.jPanelParametrosAuxiliar2TipoBien.setLayout(gridaBagParametrosAuxiliar2TipoBien);
			this.jPanelParametrosAuxiliar3TipoBien.setLayout(gridaBagParametrosAuxiliar3TipoBien);
			this.jPanelParametrosAuxiliar4TipoBien.setLayout(gridaBagParametrosAuxiliar4TipoBien);
			//this.jPanelParametrosAuxiliar5TipoBien.setLayout(gridaBagParametrosAuxiliar2TipoBien);			
			
			
			
			
			this.gridBagConstraintsTipoBien = new GridBagConstraints();
			this.gridBagConstraintsTipoBien.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoBien.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoBien.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoBien.add(this.jButtonRecargarInformacionTipoBien, this.gridBagConstraintsTipoBien);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsTipoBien = new GridBagConstraints();
			this.gridBagConstraintsTipoBien.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoBien.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoBien.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoBien.add(this.jComboBoxTiposPaginacionTipoBien, this.gridBagConstraintsTipoBien);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsTipoBien = new GridBagConstraints();
			this.gridBagConstraintsTipoBien.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoBien.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoBien.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoBien.add(this.jCheckBoxConAltoMaximoTablaTipoBien, this.gridBagConstraintsTipoBien);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsTipoBien = new GridBagConstraints();
			this.gridBagConstraintsTipoBien.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoBien.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoBien.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoBien.add(this.jComboBoxTiposArchivosReportesTipoBien, this.gridBagConstraintsTipoBien);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsTipoBien = new GridBagConstraints();
			this.gridBagConstraintsTipoBien.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoBien.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoBien.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoBien.add(this.jPanelParametrosAuxiliar1TipoBien, this.gridBagConstraintsTipoBien);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsTipoBien = new GridBagConstraints();
			this.gridBagConstraintsTipoBien.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoBien.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoBien.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoBien.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4TipoBien.add(this.jComboBoxTiposReportesTipoBien, this.gridBagConstraintsTipoBien);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsTipoBien = new GridBagConstraints();
			this.gridBagConstraintsTipoBien.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoBien.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoBien.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoBien.add(this.jPanelParametrosAuxiliar4TipoBien, this.gridBagConstraintsTipoBien);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsTipoBien = new GridBagConstraints();
			this.gridBagConstraintsTipoBien.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoBien.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoBien.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoBien.add(this.jComboBoxTiposReportesTipoBien, this.gridBagConstraintsTipoBien);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsTipoBien = new GridBagConstraints();
			this.gridBagConstraintsTipoBien.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoBien.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoBien.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoBien.add(this.jCheckBoxGenerarReporteTipoBien, this.gridBagConstraintsTipoBien);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsTipoBien = new GridBagConstraints();
			this.gridBagConstraintsTipoBien.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoBien.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoBien.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoBien.add(this.jPanelParametrosAuxiliar2TipoBien, this.gridBagConstraintsTipoBien);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsTipoBien = new GridBagConstraints();
			this.gridBagConstraintsTipoBien.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoBien.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoBien.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoBien.add(this.jLabelAccionesTipoBien, this.gridBagConstraintsTipoBien);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsTipoBien = new GridBagConstraints();
				this.gridBagConstraintsTipoBien.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsTipoBien.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsTipoBien.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesTipoBien.add(this.jButtonAbrirOrderByTipoBien, this.gridBagConstraintsTipoBien);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsTipoBien = new GridBagConstraints();
			this.gridBagConstraintsTipoBien.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsTipoBien.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoBien.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoBien.add(this.jComboBoxTiposSeleccionarTipoBien, this.gridBagConstraintsTipoBien);			
			
			
			/*
			this.gridBagConstraintsTipoBien = new GridBagConstraints();
			this.gridBagConstraintsTipoBien.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoBien.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoBien.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoBien.add(this.jCheckBoxSeleccionarTodosTipoBien, this.gridBagConstraintsTipoBien);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsTipoBien = new GridBagConstraints();
			this.gridBagConstraintsTipoBien.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoBien.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoBien.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoBien.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoBien.add(this.jCheckBoxSeleccionarTodosTipoBien, this.gridBagConstraintsTipoBien);															
				
			this.gridBagConstraintsTipoBien = new GridBagConstraints();
			this.gridBagConstraintsTipoBien.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoBien.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoBien.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoBien.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoBien.add(this.jCheckBoxSeleccionadosTipoBien, this.gridBagConstraintsTipoBien);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsTipoBien = new GridBagConstraints();
			this.gridBagConstraintsTipoBien.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoBien.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoBien.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoBien.add(this.jPanelParametrosAuxiliar3TipoBien, this.gridBagConstraintsTipoBien);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsTipoBien = new GridBagConstraints();
			this.gridBagConstraintsTipoBien.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoBien.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoBien.add(this.jComboBoxTiposRelacionesTipoBien, this.gridBagConstraintsTipoBien);
				
			this.gridBagConstraintsTipoBien = new GridBagConstraints();
			this.gridBagConstraintsTipoBien.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoBien.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoBien.add(this.jComboBoxTiposAccionesTipoBien, this.gridBagConstraintsTipoBien);
	
				
			this.gridBagConstraintsTipoBien = new GridBagConstraints();
			this.gridBagConstraintsTipoBien.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoBien.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoBien.add(this.jTextFieldValorCampoGeneralTipoBien, this.gridBagConstraintsTipoBien);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosTipoBien = new GridBagLayout();

			this.jScrollPanelDatosTipoBien.setLayout(gridaBagLayoutDatosTipoBien);
			
			this.gridBagConstraintsTipoBien = new GridBagConstraints();
			this.gridBagConstraintsTipoBien.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoBien.gridy = 0;
			this.gridBagConstraintsTipoBien.gridx = 0;
			
			this.jScrollPanelDatosTipoBien.add(this.jTableDatosTipoBien, this.gridBagConstraintsTipoBien);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosTipoBien.setViewportView(this.jTableDatosTipoBien);
		this.jTableDatosTipoBien.setFillsViewportHeight(true);
		this.jTableDatosTipoBien.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesTipoBien= new GridBagLayout();
		this.jPanelAccionesTipoBien.setLayout(gridaBagLayoutAccionesTipoBien);
		
		
		/*	
		this.gridBagConstraintsTipoBien = new GridBagConstraints();
		this.gridBagConstraintsTipoBien.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoBien.gridy = 0;
		this.gridBagConstraintsTipoBien.gridx = 0;
			
		this.jPanelAccionesTipoBien.add(this.jButtonNuevoTipoBien, this.gridBagConstraintsTipoBien);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoBien = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoBien);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipobienSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoBien = new GridBagConstraints();						
			this.gridBagConstraintsTipoBien.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoBien.gridx = 0;		
			//this.gridBagConstraintsTipoBien.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoBien.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoBien.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarTipoBien, this.gridBagConstraintsTipoBien);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsTipoBien = new GridBagConstraints();
		this.gridBagConstraintsTipoBien.gridy = iGridyPrincipal++;
		this.gridBagConstraintsTipoBien.gridx = 0;		
		//this.gridBagConstraintsTipoBien.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoBien.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsTipoBien.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsTipoBien);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsTipoBien = new GridBagConstraints();
		this.gridBagConstraintsTipoBien.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoBien.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesTipoBien, this.gridBagConstraintsTipoBien);								
		
		
		/*
		this.gridBagConstraintsTipoBien = new GridBagConstraints();
		this.gridBagConstraintsTipoBien.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoBien.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesTipoBien, this.gridBagConstraintsTipoBien);
		*/		
		
		this.gridBagConstraintsTipoBien = new GridBagConstraints();
		this.gridBagConstraintsTipoBien.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoBien.gridx =0;
		this.gridBagConstraintsTipoBien.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoBien.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoBien, this.gridBagConstraintsTipoBien);
				
		
		this.gridBagConstraintsTipoBien = new GridBagConstraints();
		this.gridBagConstraintsTipoBien.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoBien.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionTipoBien, this.gridBagConstraintsTipoBien);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(TipoBienJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosTipoBien= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoBien = new GridBagLayout();
			this.jPanelBusquedasParametrosTipoBien.setLayout(gridaBagLayoutBusquedasParametrosTipoBien);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralTipoBien=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoBien.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoBien.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoBien.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoBien = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsTipoBien = new GridBagConstraints();
		this.gridBagConstraintsTipoBien.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoBien.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoBien, this.gridBagConstraintsTipoBien);
			
			
		this.gridBagConstraintsTipoBien = new GridBagConstraints();
		this.gridBagConstraintsTipoBien.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoBien.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoBien, this.gridBagConstraintsTipoBien);
		
			
		this.gridBagConstraintsTipoBien = new GridBagConstraints();
		this.gridBagConstraintsTipoBien.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoBien.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoBien, this.gridBagConstraintsTipoBien);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralTipoBien;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoTipoBien() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoTipoBien = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoTipoBien = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoTipoBien.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoTipoBien.setName("jPanelReporteDinamicoTipoBien"); 
		
		this.jPanelReporteDinamicoTipoBien.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoBien.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoBien.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoTipoBien.setLayout(gridaBagLayoutReporteDinamicoTipoBien);
		
		
		this.jInternalFrameReporteDinamicoTipoBien= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoTipoBien = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoBien= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoTipoBien.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoTipoBien.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoTipoBien.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoTipoBien.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoTipoBien.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoTipoBien.setResizable(true);
	    this.jInternalFrameReporteDinamicoTipoBien.setClosable(true);
	    this.jInternalFrameReporteDinamicoTipoBien.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoTipoBien.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoBien.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoBien.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoTipoBien.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Bienes"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteTipoBien = new JLabelMe();

		this.jLabelColumnasSelectReporteTipoBien.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteTipoBien.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoBien.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoBien.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoBien = new GridBagConstraints();
		this.gridBagConstraintsTipoBien.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoBien.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoBien.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoBien.add(this.jLabelColumnasSelectReporteTipoBien, this.gridBagConstraintsTipoBien);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteTipoBien = new JList<Reporte>();
		this.jListColumnasSelectReporteTipoBien.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteTipoBien.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteTipoBien.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoBien.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoBien.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteTipoBien=new JScrollPane(this.jListColumnasSelectReporteTipoBien);
			
			this.jScrollColumnasSelectReporteTipoBien.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoBien.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoBien.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteTipoBien.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTipoBien = new GridBagConstraints();
		this.gridBagConstraintsTipoBien.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoBien.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoBien.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoBien.add(this.jListColumnasSelectReporteTipoBien, this.gridBagConstraintsTipoBien);
		this.jPanelReporteDinamicoTipoBien.add(this.jScrollColumnasSelectReporteTipoBien, this.gridBagConstraintsTipoBien);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteTipoBien = new JLabelMe();

		this.jLabelRelacionesSelectReporteTipoBien.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteTipoBien.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoBien.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoBien.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsTipoBien = new GridBagConstraints();
		this.gridBagConstraintsTipoBien.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoBien.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoBien.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoBien.add(this.jLabelRelacionesSelectReporteTipoBien, this.gridBagConstraintsTipoBien);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteTipoBien = new JList<Reporte>();
		this.jListRelacionesSelectReporteTipoBien.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteTipoBien.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteTipoBien.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoBien.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoBien.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteTipoBien=new JScrollPane(this.jListRelacionesSelectReporteTipoBien);
			
			this.jScrollRelacionesSelectReporteTipoBien.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoBien.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoBien.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteTipoBien.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsTipoBien = new GridBagConstraints();
		this.gridBagConstraintsTipoBien.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoBien.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoBien.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoBien.add(this.jListRelacionesSelectReporteTipoBien, this.gridBagConstraintsTipoBien);
		this.jPanelReporteDinamicoTipoBien.add(this.jScrollRelacionesSelectReporteTipoBien, this.gridBagConstraintsTipoBien);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoTipoBien = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoTipoBien = new JComboBoxMe();
		this.jListColumnasValoresGraficoTipoBien = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoTipoBien = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoTipoBien.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoTipoBien.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoBien.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoBien.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoTipoBien, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoTipoBien = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoTipoBien.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoTipoBien.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoBien.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoBien.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoTipoBien, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoTipoBien = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoTipoBien.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoTipoBien.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoBien.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoBien.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoBien = new GridBagConstraints();
		this.gridBagConstraintsTipoBien.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoBien.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoBien.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoBien.add(this.jLabelGenerarExcelReporteDinamicoTipoBien, this.gridBagConstraintsTipoBien);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoTipoBien = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoTipoBien.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoTipoBien,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoTipoBien.setToolTipText("Generar EXCEL"+" "+TipoBienConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsTipoBien = new GridBagConstraints();
		//this.gridBagConstraintsTipoBien.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsTipoBien.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsTipoBien.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoTipoBien.add(this.jButtonGenerarExcelReporteDinamicoTipoBien, this.gridBagConstraintsTipoBien);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsTipoBien = new GridBagConstraints();
		this.gridBagConstraintsTipoBien.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoBien.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoBien.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoBien.add(this.jComboBoxTiposReportesDinamicoTipoBien, this.gridBagConstraintsTipoBien);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoTipoBien = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoTipoBien.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoTipoBien.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoBien.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoBien.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoBien = new GridBagConstraints();
		this.gridBagConstraintsTipoBien.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoBien.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoBien.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoBien.add(this.jLabelTiposArchivoReporteDinamicoTipoBien, this.gridBagConstraintsTipoBien);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsTipoBien = new GridBagConstraints();
		this.gridBagConstraintsTipoBien.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoBien.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoBien.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoBien.add(this.jComboBoxTiposArchivosReportesDinamicoTipoBien, this.gridBagConstraintsTipoBien);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoTipoBien = new JButtonMe();
		this.jButtonGenerarReporteDinamicoTipoBien.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoTipoBien,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoTipoBien.setToolTipText("Generar"+" "+TipoBienConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsTipoBien = new GridBagConstraints();
		this.gridBagConstraintsTipoBien.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoBien.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoBien.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoBien.add(this.jButtonGenerarReporteDinamicoTipoBien, this.gridBagConstraintsTipoBien);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoTipoBien = new JButtonMe();
		this.jButtonCerrarReporteDinamicoTipoBien.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoTipoBien,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoTipoBien.setToolTipText("Cancelar"+" "+TipoBienConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoBien = new GridBagConstraints();
		this.gridBagConstraintsTipoBien.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoBien.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoBien.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoBien.add(this.jButtonCerrarReporteDinamicoTipoBien, this.gridBagConstraintsTipoBien);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalTipoBien = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoTipoBien= new JScrollPane(jPanelReporteDinamicoTipoBien,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoTipoBien.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoBien.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoBien.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoTipoBien.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Bienes"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoBien = new GridBagConstraints();
		this.gridBagConstraintsTipoBien.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsTipoBien.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsTipoBien.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoTipoBien.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoTipoBien.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalTipoBien);
		this.jInternalFrameReporteDinamicoTipoBien.getContentPane().add(this.jScrollPanelReporteDinamicoTipoBien, this.gridBagConstraintsTipoBien);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionTipoBien() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionTipoBien = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionTipoBien = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionTipoBien.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionTipoBien.setName("jPanelImportacionTipoBien"); 
		
		this.jPanelImportacionTipoBien.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoBien.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoBien.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionTipoBien.setLayout(gridaBagLayoutImportacionTipoBien);
		
		
		this.jInternalFrameImportacionTipoBien= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionTipoBien= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionTipoBien = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoBien= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionTipoBien.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoBien.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoBien.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionTipoBien.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoBien.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoBien.setResizable(true);
	    this.jInternalFrameImportacionTipoBien.setClosable(true);
	    this.jInternalFrameImportacionTipoBien.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionTipoBien.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoBien.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoBien.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionTipoBien.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoBien.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoBien.setResizable(true);
	    this.jInternalFrameImportacionTipoBien.setClosable(true);
	    this.jInternalFrameImportacionTipoBien.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionTipoBien.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoBien.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoBien.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionTipoBien.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Bienes"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionTipoBien = new JLabelMe();

		this.jLabelArchivoImportacionTipoBien.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionTipoBien.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoBien.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoBien.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoBien = new GridBagConstraints();
		this.gridBagConstraintsTipoBien.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoBien.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoBien.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoBien.add(this.jLabelArchivoImportacionTipoBien, this.gridBagConstraintsTipoBien);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionTipoBien = new JFileChooser();		
		this.jFileChooserImportacionTipoBien.setToolTipText("ESCOGER ARCHIVO"+" "+TipoBienConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionTipoBien = new JButtonMe();
		this.jButtonAbrirImportacionTipoBien.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionTipoBien,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionTipoBien.setToolTipText("Generar"+" "+TipoBienConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsTipoBien = new GridBagConstraints();
		this.gridBagConstraintsTipoBien.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoBien.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoBien.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoBien.add(this.jButtonAbrirImportacionTipoBien, this.gridBagConstraintsTipoBien);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionTipoBien = new JLabelMe();

		this.jLabelPathArchivoImportacionTipoBien.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionTipoBien.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoBien.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoBien.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoBien = new GridBagConstraints();
		this.gridBagConstraintsTipoBien.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoBien.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoBien.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoBien.add(this.jLabelPathArchivoImportacionTipoBien, this.gridBagConstraintsTipoBien);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionTipoBien=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionTipoBien.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoBien.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoBien.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsTipoBien = new GridBagConstraints();
		this.gridBagConstraintsTipoBien.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoBien.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoBien.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoBien.add(this.jTextFieldPathArchivoImportacionTipoBien, this.gridBagConstraintsTipoBien);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionTipoBien = new JButtonMe();
		this.jButtonGenerarImportacionTipoBien.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionTipoBien,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionTipoBien.setToolTipText("Generar"+" "+TipoBienConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsTipoBien = new GridBagConstraints();
		this.gridBagConstraintsTipoBien.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoBien.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoBien.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoBien.add(this.jButtonGenerarImportacionTipoBien, this.gridBagConstraintsTipoBien);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionTipoBien = new JButtonMe();
		this.jButtonCerrarImportacionTipoBien.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionTipoBien,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionTipoBien.setToolTipText("Cancelar"+" "+TipoBienConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoBien = new GridBagConstraints();
		this.gridBagConstraintsTipoBien.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoBien.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoBien.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoBien.add(this.jButtonCerrarImportacionTipoBien, this.gridBagConstraintsTipoBien);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalTipoBien = new GridBagLayout();
		
		this.jScrollPanelImportacionTipoBien= new JScrollPane(jPanelImportacionTipoBien,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsTipoBien = new GridBagConstraints();
		this.gridBagConstraintsTipoBien.gridy =iPosYImportacion;
		this.gridBagConstraintsTipoBien.gridx =iPosXImportacion;
		this.gridBagConstraintsTipoBien.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionTipoBien.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionTipoBien.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalTipoBien);
		this.jInternalFrameImportacionTipoBien.getContentPane().add(this.jScrollPanelImportacionTipoBien, this.gridBagConstraintsTipoBien);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByTipoBien(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByTipoBien = new JButtonMe();
			this.jButtonAbrirOrderByTipoBien.setText("Orden");
			this.jButtonAbrirOrderByTipoBien.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoBien,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoBien, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByTipoBien";
			inputMap = this.jButtonAbrirOrderByTipoBien.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByTipoBien.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByTipoBien"));
		
		
			GridBagLayout gridaBagLayoutOrderByTipoBien = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByTipoBien = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByTipoBien.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByTipoBien.setName("jPanelOrderByTipoBien"); 
			
			this.jPanelOrderByTipoBien.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoBien.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoBien.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByTipoBien, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByTipoBien.setLayout(gridaBagLayoutOrderByTipoBien);
			
			
			this.jTableDatosTipoBienOrderBy = new JTableMe();        
			this.jTableDatosTipoBienOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosTipoBienOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosTipoBienOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosTipoBienOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosTipoBienOrderBy.setViewportView(this.jTableDatosTipoBienOrderBy);
			this.jTableDatosTipoBienOrderBy.setFillsViewportHeight(true);
			this.jTableDatosTipoBienOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByTipoBien= new OrderByJInternalFrame();
			this.jInternalFrameOrderByTipoBien= new OrderByJInternalFrame();
			this.jScrollPanelOrderByTipoBien = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteTipoBien= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByTipoBien.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByTipoBien.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByTipoBien.setTitle("Orden");
			this.jInternalFrameOrderByTipoBien.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByTipoBien.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByTipoBien.setResizable(true);
			this.jInternalFrameOrderByTipoBien.setClosable(true);
			this.jInternalFrameOrderByTipoBien.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByTipoBien, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByTipoBien.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoBien.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoBien.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByTipoBien, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByTipoBien.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Bienes"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsTipoBien = new GridBagConstraints();
			this.gridBagConstraintsTipoBien.gridy =iPosYOrderBy++;
			this.gridBagConstraintsTipoBien.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoBien.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsTipoBien.ipady =150;
				
			this.jPanelOrderByTipoBien.add(jScrollPanelDatosTipoBienOrderBy, this.gridBagConstraintsTipoBien);//this.jTableDatosTipoBienTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByTipoBien = new JButtonMe();
			this.jButtonCerrarOrderByTipoBien.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByTipoBien,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByTipoBien.setToolTipText("Cancelar"+" "+TipoBienConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByTipoBien, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsTipoBien = new GridBagConstraints();
			this.gridBagConstraintsTipoBien.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoBien.gridy = iPosYOrderBy++;
			this.gridBagConstraintsTipoBien.gridx = iPosXOrderBy;
									
			this.jPanelOrderByTipoBien.add(this.jButtonCerrarOrderByTipoBien, this.gridBagConstraintsTipoBien);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalTipoBien = new GridBagLayout();
			
			this.jScrollPanelOrderByTipoBien= new JScrollPane(jPanelOrderByTipoBien,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsTipoBien = new GridBagConstraints();
			this.gridBagConstraintsTipoBien.gridy =iPosYOrderBy;
			this.gridBagConstraintsTipoBien.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoBien.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByTipoBien.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByTipoBien.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalTipoBien);
			
			this.jInternalFrameOrderByTipoBien.getContentPane().add(this.jScrollPanelOrderByTipoBien, this.gridBagConstraintsTipoBien);			
		
		} else {
			this.jButtonAbrirOrderByTipoBien = new JButtonMe();
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
			&& this.tipobienSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosTipoBien.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosTipoBien.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosTipoBien.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosTipoBien.getRowHeight();//TipoBienConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.tipobienSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > TipoBienConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoBien.isSelected()) {
					iHeightTable=TipoBienConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoBienConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoBienConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > TipoBienConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoBien.isSelected()) {
					iHeightTable=TipoBienConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoBienConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoBienConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosTipoBien.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoBien.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoBien.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosTipoBien.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoBien.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoBien.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByTipoBien!=null && this.jInternalFrameOrderByTipoBien.getjTableDatosOrderBy()!=null) {
			//if(!this.tipobienSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByTipoBien.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByTipoBien.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByTipoBien.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByTipoBien.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByTipoBien.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByTipoBien.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByTipoBien.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosTipoBien.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoBien.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoBien.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=tipobienLogic.getTipoBiens().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipobiens.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<TipoBien> TraerTipoBienBeans(List<TipoBien> tipobiens,ArrayList<Classe> classes)throws Exception {
		try {
			for(TipoBien tipobien:tipobiens) {
					
				if(!(TipoBienConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || TipoBienConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					tipobien.setsDetalleGeneralEntityReporte(TipoBienConstantesFunciones.getTipoBienDescripcion(tipobien));
										
						
					
					

					if(tipobien.getBiens()!=null && Funciones.existeClass(classes,Bien.class)) {
						try{tipobien.setbiensDescripcionReporte(new JRBeanCollectionDataSource(BienJInternalFrame.TraerBienBeans(tipobien.getBiens(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//tipobien.setsDetalleGeneralEntityReporte(tipobien.getsDetalleGeneralEntityReporte());
										
				}
				
				//tipobienbeans.add(tipobienbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return tipobiens;
    }
	//PARA REPORTES FIN
}
