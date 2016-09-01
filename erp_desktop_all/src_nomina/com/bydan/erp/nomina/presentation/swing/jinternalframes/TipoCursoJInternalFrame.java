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
import com.bydan.erp.nomina.util.TipoCursoConstantesFunciones;

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
public class TipoCursoJInternalFrame extends TipoCursoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarTipoCurso;
	
	protected JMenuBar jmenuBarTipoCurso;
	
	protected JMenu jmenuTipoCurso;
	protected JMenu jmenuDatosTipoCurso;
	protected JMenu jmenuArchivoTipoCurso;
	protected JMenu jmenuAccionesTipoCurso;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosTipoCurso = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoCurso;	
	protected GridBagConstraints gridBagConstraintsTipoCurso;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public TipoCursoDetalleFormJInternalFrame jInternalFrameDetalleFormTipoCurso;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoTipoCurso;	
	protected ImportacionJInternalFrame jInternalFrameImportacionTipoCurso;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public TipoCursoSessionBean tipocursoSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<TipoCurso> tipocursos;		
	public List<TipoCurso> tipocursosEliminados;	
	public List<TipoCurso> tipocursosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByTipoCurso;		
	protected JButton jButtonAbrirOrderByTipoCurso;
	
	
	//protected JPanel jPanelOrderByTipoCurso;
	//public JScrollPane jScrollPanelOrderByTipoCurso;	
	//protected JButton jButtonCerrarOrderByTipoCurso;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public TipoCursoLogic tipocursoLogic;
	
	
	
	public JScrollPane jScrollPanelDatosTipoCurso;
	public JScrollPane jScrollPanelDatosEdicionTipoCurso;
	public JScrollPane jScrollPanelDatosGeneralTipoCurso;
    
	
	
	//public JScrollPane jScrollPanelDatosTipoCursoOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoTipoCurso;
	//public JScrollPane jScrollPanelImportacionTipoCurso;
	
	
	
	protected JPanel jPanelAccionesTipoCurso;
	
    protected JPanel jPanelPaginacionTipoCurso;
    protected JPanel jPanelParametrosReportesTipoCurso;
	protected JPanel jPanelParametrosReportesAccionesTipoCurso;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1TipoCurso;
	protected JPanel jPanelParametrosAuxiliar2TipoCurso;
	protected JPanel jPanelParametrosAuxiliar3TipoCurso;
	protected JPanel jPanelParametrosAuxiliar4TipoCurso;
	//protected JPanel jPanelParametrosAuxiliar5TipoCurso;
	
	
	
	//protected JPanel jPanelReporteDinamicoTipoCurso;
	//protected JPanel jPanelImportacionTipoCurso;
	
	
	public JTable jTableDatosTipoCurso;
	
	
	
	//public JTable jTableDatosTipoCursoOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoTipoCurso;
	protected JButton jButtonDuplicarTipoCurso;
	protected JButton jButtonCopiarTipoCurso;
	protected JButton jButtonVerFormTipoCurso;
	protected JButton jButtonNuevoRelacionesTipoCurso;
	protected JButton jButtonModificarTipoCurso;
	
    protected JButton jButtonGuardarCambiosTablaTipoCurso;
	protected JButton jButtonCerrarTipoCurso;
	
	
	protected JButton jButtonRecargarInformacionTipoCurso;
	protected JButton jButtonProcesarInformacionTipoCurso;
	
	
	protected JButton jButtonAnterioresTipoCurso;
	protected JButton jButtonSiguientesTipoCurso;
	protected JButton jButtonNuevoGuardarCambiosTipoCurso;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoTipoCurso;
	//protected JButton jButtonCerrarReporteDinamicoTipoCurso;
	//protected JButton jButtonGenerarExcelReporteDinamicoTipoCurso;	
	
	
	
	//protected JButton jButtonAbrirImportacionTipoCurso;
	//protected JButton jButtonGenerarImportacionTipoCurso;
	//protected JButton jButtonCerrarImportacionTipoCurso;
	//protected JFileChooser jFileChooserImportacionTipoCurso;
	//protected File fileImportacionTipoCurso;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoCurso;
	protected JButton jButtonDuplicarToolBarTipoCurso;
	protected JButton jButtonNuevoRelacionesToolBarTipoCurso;
	
	
	public JButton jButtonGuardarCambiosToolBarTipoCurso;
	protected JButton jButtonCopiarToolBarTipoCurso;
	protected JButton jButtonVerFormToolBarTipoCurso;
	public JButton jButtonGuardarCambiosTablaToolBarTipoCurso;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoCurso;
	protected JButton jButtonCerrarToolBarTipoCurso;
	
	protected JButton jButtonRecargarInformacionToolBarTipoCurso;
	protected JButton jButtonProcesarInformacionToolBarTipoCurso;
	protected JButton jButtonAnterioresToolBarTipoCurso;
	protected JButton jButtonSiguientesToolBarTipoCurso;
	protected JButton jButtonNuevoGuardarCambiosToolBarTipoCurso;
	protected JButton jButtonAbrirOrderByToolBarTipoCurso;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoCurso;
	protected JMenuItem jMenuItemDuplicarTipoCurso;
	protected JMenuItem jMenuItemNuevoRelacionesTipoCurso;
	
	
	protected JMenuItem jMenuItemGuardarCambiosTipoCurso;
	protected JMenuItem jMenuItemCopiarTipoCurso;
	protected JMenuItem jMenuItemVerFormTipoCurso;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoCurso;
	protected JMenuItem jMenuItemCerrarTipoCurso;
	protected JMenuItem jMenuItemDetalleCerrarTipoCurso;
	protected JMenuItem jMenuItemDetalleAbrirOrderByTipoCurso;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoCurso;
	
	protected JMenuItem jMenuItemRecargarInformacionTipoCurso;
	protected JMenuItem jMenuItemProcesarInformacionTipoCurso;
	protected JMenuItem jMenuItemAnterioresTipoCurso;
	protected JMenuItem jMenuItemSiguientesTipoCurso;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoCurso;
	protected JMenuItem jMenuItemAbrirOrderByTipoCurso;
	protected JMenuItem jMenuItemMostrarOcultarTipoCurso;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoCurso;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosTipoCurso;
	protected JCheckBox jCheckBoxSeleccionadosTipoCurso;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaTipoCurso;
	protected JCheckBox jCheckBoxConGraficoReporteTipoCurso;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesTipoCurso;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesTipoCurso;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoTipoCurso;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoTipoCurso;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesTipoCurso;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionTipoCurso;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoCurso;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoCurso;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarTipoCurso;
	protected JTextField jTextFieldValorCampoGeneralTipoCurso;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteTipoCurso;
	//public JList<Reporte> jListColumnasSelectReporteTipoCurso;
	//public JScrollPane jScrollColumnasSelectReporteTipoCurso;
	
	//public JLabel jLabelRelacionesSelectReporteTipoCurso;
	//public JList<Reporte> jListRelacionesSelectReporteTipoCurso;
	//public JScrollPane jScrollRelacionesSelectReporteTipoCurso;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoTipoCurso;
	//protected JCheckBox jCheckBoxConGraficoDinamicoTipoCurso;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoTipoCurso;
	//public JLabel jLabelTiposArchivoReporteDinamicoTipoCurso;
	
		
	//public JLabel jLabelArchivoImportacionTipoCurso;	
	//public JLabel jLabelPathArchivoImportacionTipoCurso;
	//protected JTextField jTextFieldPathArchivoImportacionTipoCurso;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoTipoCurso;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoTipoCurso;
	
	//public JLabel jLabelColumnaCategoriaValorTipoCurso;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorTipoCurso;
	
	//public JLabel jLabelColumnasValoresGraficoTipoCurso;
	//public JList<Reporte> jListColumnasValoresGraficoTipoCurso;
	//public JScrollPane jScrollColumnasValoresGraficoTipoCurso;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoTipoCurso;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoTipoCurso;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasTipoCurso;
	
	
	
	
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
	public TipoCursoJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("TipoCurso No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoCursoJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoCurso No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoCursoJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoCurso No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoCursoJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoCurso No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionTipoCurso)	{
		this.jButtonRecargarInformacionTipoCurso = jButtonRecargarInformacionTipoCurso;
	}
	
	public JButton getjButtonProcesarInformacionTipoCurso() {
		return this.jButtonProcesarInformacionTipoCurso;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoCurso)	{
		this.jButtonProcesarInformacionTipoCurso = jButtonProcesarInformacionTipoCurso;
	}
	
	
	public JButton getjButtonRecargarInformacionTipoCurso() {
		return this.jButtonRecargarInformacionTipoCurso;
	}
	
	
	public List<TipoCurso> gettipocursos() {
		return this.tipocursos;
	}

	public void settipocursos(List<TipoCurso> tipocursos) {
		this.tipocursos = tipocursos;
	}
	
	public List<TipoCurso> gettipocursosAux() {
		return this.tipocursosAux;
	}

	public void settipocursosAux(List<TipoCurso> tipocursosAux) {
		this.tipocursosAux = tipocursosAux;
	}
	
	public List<TipoCurso> gettipocursosEliminados() {
		return this.tipocursosEliminados;
	}

	public void setTipoCursosEliminados(List<TipoCurso> tipocursosEliminados) {
		this.tipocursosEliminados = tipocursosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarTipoCurso() {
		return jComboBoxTiposSeleccionarTipoCurso;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarTipoCurso(
			JComboBox jComboBoxTiposSeleccionarTipoCurso) {
		this.jComboBoxTiposSeleccionarTipoCurso = jComboBoxTiposSeleccionarTipoCurso;
	}
	
	public void setBorderResaltarTiposSeleccionarTipoCurso() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarTipoCurso.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarTipoCurso .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralTipoCurso() {
		return jTextFieldValorCampoGeneralTipoCurso;
	}

	public void setjTextFieldValorCampoGeneralTipoCurso(
			JTextField jTextFieldValorCampoGeneralTipoCurso) {
		this.jTextFieldValorCampoGeneralTipoCurso = jTextFieldValorCampoGeneralTipoCurso;
	}

	public void setBorderResaltarValorCampoGeneralTipoCurso() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoCurso.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralTipoCurso .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosTipoCurso() {
		return this.jCheckBoxSeleccionarTodosTipoCurso;
	}

	public void setjCheckBoxSeleccionarTodosTipoCurso(
			JCheckBox jCheckBoxSeleccionarTodosTipoCurso) {
		this.jCheckBoxSeleccionarTodosTipoCurso = jCheckBoxSeleccionarTodosTipoCurso;
	}

	public void setBorderResaltarSeleccionarTodosTipoCurso() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoCurso.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosTipoCurso .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosTipoCurso() {
		return this.jCheckBoxSeleccionadosTipoCurso;
	}

	public void setjCheckBoxSeleccionadosTipoCurso(
			JCheckBox jCheckBoxSeleccionadosTipoCurso) {
		this.jCheckBoxSeleccionadosTipoCurso = jCheckBoxSeleccionadosTipoCurso;
	}
	
	public void setBorderResaltarSeleccionadosTipoCurso() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoCurso.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosTipoCurso .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesTipoCurso() {
		return this.jComboBoxTiposArchivosReportesTipoCurso;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesTipoCurso(
			JComboBox jComboBoxTiposArchivosReportesTipoCurso) {
		this.jComboBoxTiposArchivosReportesTipoCurso = jComboBoxTiposArchivosReportesTipoCurso;
	}

	public void setBorderResaltarTiposArchivosReportesTipoCurso() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoCurso.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesTipoCurso .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesTipoCurso() {
		return this.jComboBoxTiposReportesTipoCurso;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesTipoCurso(
			JComboBox jComboBoxTiposReportesTipoCurso) {
		this.jComboBoxTiposReportesTipoCurso = jComboBoxTiposReportesTipoCurso;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoTipoCurso() {
	//	return jComboBoxTiposReportesDinamicoTipoCurso;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoTipoCurso(
	//		JComboBox jComboBoxTiposReportesDinamicoTipoCurso) {
	//	this.jComboBoxTiposReportesDinamicoTipoCurso = jComboBoxTiposReportesDinamicoTipoCurso;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoTipoCurso() {
	//	return jComboBoxTiposArchivosReportesDinamicoTipoCurso;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoTipoCurso(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoTipoCurso) {
	//	this.jComboBoxTiposArchivosReportesDinamicoTipoCurso = jComboBoxTiposArchivosReportesDinamicoTipoCurso;
	//}
	
	public void setBorderResaltarTiposReportesTipoCurso() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoCurso.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesTipoCurso .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesTipoCurso() {
		return this.jComboBoxTiposGraficosReportesTipoCurso;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesTipoCurso(
			JComboBox jComboBoxTiposGraficosReportesTipoCurso) {
		this.jComboBoxTiposGraficosReportesTipoCurso = jComboBoxTiposGraficosReportesTipoCurso;
	}
	
	public void setBorderResaltarTiposGraficosReportesTipoCurso() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoCurso.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesTipoCurso .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionTipoCurso() {
		return this.jComboBoxTiposPaginacionTipoCurso;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionTipoCurso(
			JComboBox jComboBoxTiposPaginacionTipoCurso) {
		this.jComboBoxTiposPaginacionTipoCurso = jComboBoxTiposPaginacionTipoCurso;
	}
	
	public void setBorderResaltarTiposPaginacionTipoCurso() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoCurso.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionTipoCurso .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesTipoCurso() {
		return this.jComboBoxTiposRelacionesTipoCurso;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoCurso() {
		return this.jComboBoxTiposAccionesTipoCurso;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoCurso(
			JComboBox jComboBoxTiposRelacionesTipoCurso) {
		this.jComboBoxTiposRelacionesTipoCurso = jComboBoxTiposRelacionesTipoCurso;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoCurso(
			JComboBox jComboBoxTiposAccionesTipoCurso) {
		this.jComboBoxTiposAccionesTipoCurso = jComboBoxTiposAccionesTipoCurso;
	}
	
	public void setBorderResaltarTiposRelacionesTipoCurso() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoCurso.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesTipoCurso .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesTipoCurso() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoCurso.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesTipoCurso .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoTipoCurso() {
	//	return jCheckBoxConGraficoDinamicoTipoCurso;
	//}

	//public void setjCheckBoxConGraficoDinamicoTipoCurso(
	//		JCheckBox jCheckBoxConGraficoDinamicoTipoCurso) {
	//	this.jCheckBoxConGraficoDinamicoTipoCurso = jCheckBoxConGraficoDinamicoTipoCurso;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoTipoCurso() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarTipoCurso.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoTipoCurso .setBorder(borderResaltar);		
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
		this.tipocursoSessionBean=new TipoCursoSessionBean();
		
		this.tipocursoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipocursoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipocursoSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=TipoCursoJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=TipoCursoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoCursoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoCursoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoCursoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Curso MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.tipocursoSessionBean.getEsGuardarRelacionado()) {
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
		
		TipoCursoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("TipoCurso No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarTipoCurso= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarTipoCurso=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarTipoCurso,this.jTtoolBarTipoCurso,
							"nuevo","nuevo","Nuevo"+" "+TipoCursoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoCurso=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarTipoCurso,this.jTtoolBarTipoCurso,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoCurso=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarTipoCurso,this.jTtoolBarTipoCurso,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+TipoCursoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarTipoCurso=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarTipoCurso,this.jTtoolBarTipoCurso,
							"duplicar","duplicar","Duplicar"+" "+TipoCursoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarTipoCurso=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarTipoCurso,this.jTtoolBarTipoCurso,
							"copiar","copiar","Copiar"+" "+TipoCursoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarTipoCurso=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarTipoCurso,this.jTtoolBarTipoCurso,
							"ver_form","ver_form","Ver"+" "+TipoCursoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarTipoCurso=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoCurso,this.jTtoolBarTipoCurso,
							"recargar","recargar","Recargar"+" "+TipoCursoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarTipoCurso=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoCurso,this.jTtoolBarTipoCurso,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarTipoCurso=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoCurso,this.jTtoolBarTipoCurso,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarTipoCurso=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarTipoCurso,this.jTtoolBarTipoCurso,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarTipoCurso=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarTipoCurso,this.jTtoolBarTipoCurso,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarTipoCurso=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarTipoCurso,this.jTtoolBarTipoCurso,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+TipoCursoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarTipoCurso=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarTipoCurso,this.jTtoolBarTipoCurso,
							"cerrar","cerrar","Salir"+" "+TipoCursoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarTipoCurso=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarTipoCurso;
			
				this.jButtonProcesarInformacionToolBarTipoCurso=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarTipoCurso;
				
		//protected JButton jButtonModificarToolBarTipoCurso;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarTipoCurso=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuTipoCurso=new JMenuMe("General");
		this.jmenuArchivoTipoCurso=new JMenuMe("Archivo");
		this.jmenuAccionesTipoCurso=new JMenuMe("Acciones");
		this.jmenuDatosTipoCurso=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoCurso= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoCurso.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoCurso,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoCurso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarTipoCurso= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarTipoCurso.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarTipoCurso,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarTipoCurso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesTipoCurso= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesTipoCurso.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesTipoCurso,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesTipoCurso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosTipoCurso= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoCurso.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoCurso,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoCurso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarTipoCurso= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarTipoCurso.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarTipoCurso,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarTipoCurso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormTipoCurso= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormTipoCurso.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormTipoCurso,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormTipoCurso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaTipoCurso= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaTipoCurso.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaTipoCurso,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaTipoCurso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoCurso= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoCurso.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoCurso,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoCurso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionTipoCurso= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionTipoCurso.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionTipoCurso,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionTipoCurso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionTipoCurso= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionTipoCurso.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionTipoCurso,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresTipoCurso= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresTipoCurso.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresTipoCurso,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresTipoCurso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesTipoCurso= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesTipoCurso.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesTipoCurso,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesTipoCurso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByTipoCurso= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByTipoCurso.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByTipoCurso,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByTipoCurso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoCurso= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoCurso.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoCurso,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoCurso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByTipoCurso= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByTipoCurso.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByTipoCurso,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByTipoCurso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoCurso= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoCurso.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoCurso,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoCurso, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosTipoCurso= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosTipoCurso.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosTipoCurso,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosTipoCurso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoTipoCurso.add(this.jMenuItemCerrarTipoCurso);
			
			this.jmenuAccionesTipoCurso.add(this.jMenuItemNuevoTipoCurso);
			this.jmenuAccionesTipoCurso.add(this.jMenuItemNuevoGuardarCambiosTipoCurso);
			this.jmenuAccionesTipoCurso.add(this.jMenuItemNuevoRelacionesTipoCurso);
			this.jmenuAccionesTipoCurso.add(this.jMenuItemGuardarCambiosTablaTipoCurso);		
			this.jmenuAccionesTipoCurso.add(this.jMenuItemDuplicarTipoCurso);		
			this.jmenuAccionesTipoCurso.add(this.jMenuItemCopiarTipoCurso);		
			this.jmenuAccionesTipoCurso.add(this.jMenuItemVerFormTipoCurso);		
			
			this.jmenuDatosTipoCurso.add(this.jMenuItemRecargarInformacionTipoCurso);				
			this.jmenuDatosTipoCurso.add(this.jMenuItemAnterioresTipoCurso);				
			this.jmenuDatosTipoCurso.add(this.jMenuItemSiguientesTipoCurso);				
			this.jmenuDatosTipoCurso.add(this.jMenuItemAbrirOrderByTipoCurso);				
			this.jmenuDatosTipoCurso.add(this.jMenuItemMostrarOcultarTipoCurso);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesTipoCurso.add(this.jMenuItemGuardarCambiosTipoCurso);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoTipoCurso, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesTipoCurso, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosTipoCurso, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarTipoCurso.add(this.jmenuArchivoTipoCurso);		
			this.jmenuBarTipoCurso.add(this.jmenuAccionesTipoCurso);		
			this.jmenuBarTipoCurso.add(this.jmenuDatosTipoCurso);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarTipoCurso);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasTipoCurso() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		

		this.jTabbedPaneBusquedasTipoCurso=new JTabbedPane();


		this.jTabbedPaneBusquedasTipoCurso.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoCurso.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoCurso.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasTipoCurso.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasTipoCurso.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasTipoCurso,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleTipoCurso = new TipoCursoDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Tipo Curso DATOS");
			this.jInternalFrameDetalleFormTipoCurso = new TipoCursoDetalleFormJInternalFrame(jDesktopPane,this.tipocursoSessionBean.getConGuardarRelaciones(),this.tipocursoSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormTipoCurso = null;//new TipoCursoDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoCurso= new GridBagLayout();
		
		
		this.jTableDatosTipoCurso = new JTableMe();      
		
		String sToolTipTipoCurso="";
		sToolTipTipoCurso=TipoCursoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoCurso+="(Nomina.TipoCurso)";
		}
		
		if(!this.tipocursoSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoCurso+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosTipoCurso.setToolTipText(sToolTipTipoCurso);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosTipoCurso);
		this.jTableDatosTipoCurso.setAutoCreateRowSorter(true);
		this.jTableDatosTipoCurso.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosTipoCurso.setRowSelectionAllowed(true);
		this.jTableDatosTipoCurso.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosTipoCurso,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoTipoCurso = new JButtonMe();
		this.jButtonDuplicarTipoCurso = new JButtonMe();
		this.jButtonCopiarTipoCurso = new JButtonMe();
		this.jButtonVerFormTipoCurso = new JButtonMe();
		this.jButtonNuevoRelacionesTipoCurso = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaTipoCurso = new JButtonMe();
		this.jButtonCerrarTipoCurso = new JButtonMe();
		
		this.jScrollPanelDatosTipoCurso = new JScrollPane();   
        this.jScrollPanelDatosGeneralTipoCurso = new JScrollPane();
		
				
		
		
		this.jPanelAccionesTipoCurso = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Curso";
		
		if(!this.tipocursoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoCurso.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Cursos" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoCurso.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralTipoCurso.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesTipoCurso.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoCurso.setToolTipText("Acciones");
        this.jPanelAccionesTipoCurso.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoCurso, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoCurso, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoTipoCurso=new ReporteDinamicoJInternalFrame(TipoCursoConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoTipoCurso();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionTipoCurso=new ImportacionJInternalFrame(TipoCursoConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionTipoCurso();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByTipoCurso = new JButtonMe();
		
		this.jButtonAbrirOrderByTipoCurso.setText("Orden");
		this.jButtonAbrirOrderByTipoCurso.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoCurso,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoCurso, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByTipoCurso.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByTipoCurso.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoCurso=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoCurso,false,this);
			
			//this.cargarOrderByTipoCurso(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoCurso=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoCurso,true,this);
			
			//this.cargarOrderByTipoCurso(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosTipoCurso.setMinimumSize(new Dimension(400,50));//430
		this.jTableDatosTipoCurso.setMaximumSize(new Dimension(400,50));//430
		this.jTableDatosTipoCurso.setPreferredSize(new Dimension(400,50));//430
		
		this.jScrollPanelDatosTipoCurso.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoCurso.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoCurso.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoTipoCurso.setText("Nuevo");
		this.jButtonDuplicarTipoCurso.setText("Duplicar");
		this.jButtonCopiarTipoCurso.setText("Copiar");
		this.jButtonVerFormTipoCurso.setText("Ver");
		this.jButtonNuevoRelacionesTipoCurso.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaTipoCurso.setText("Guardar");
		this.jButtonCerrarTipoCurso.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoCurso,"nuevo_button","Nuevo",this.tipocursoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarTipoCurso,"duplicar_button","Duplicar",this.tipocursoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarTipoCurso,"copiar_button","Copiar",this.tipocursoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormTipoCurso,"ver_form","Ver",this.tipocursoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesTipoCurso,"nuevorelaciones_button","Nuevo Rel",this.tipocursoSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoCurso,"guardarcambiostabla_button","Guardar",this.tipocursoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoCurso,"cerrar_button","Salir",this.tipocursoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoCurso, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarTipoCurso, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarTipoCurso, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormTipoCurso, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesTipoCurso, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoCurso, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoCurso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoTipoCurso.setToolTipText("Nuevo"+" "+TipoCursoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarTipoCurso.setToolTipText("Duplicar"+" "+TipoCursoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarTipoCurso.setToolTipText("Copiar"+" "+TipoCursoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormTipoCurso.setToolTipText("Ver"+" "+TipoCursoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesTipoCurso.setToolTipText("Nuevo Rel"+" "+TipoCursoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaTipoCurso.setToolTipText("Guardar"+" "+TipoCursoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoCurso.setToolTipText("Salir"+" "+TipoCursoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoCurso";
		inputMap = this.jButtonNuevoTipoCurso.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoCurso.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoCurso"));
		
		//DUPLICAR
		sMapKey = "DuplicarTipoCurso";
		inputMap = this.jButtonDuplicarTipoCurso.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarTipoCurso.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarTipoCurso"));
		
		//COPIAR
		sMapKey = "CopiarTipoCurso";
		inputMap = this.jButtonCopiarTipoCurso.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarTipoCurso.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarTipoCurso"));
		
		//VEr FORM
		sMapKey = "VerFormTipoCurso";
		inputMap = this.jButtonVerFormTipoCurso.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormTipoCurso.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormTipoCurso"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesTipoCurso";
		inputMap = this.jButtonNuevoRelacionesTipoCurso.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesTipoCurso.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesTipoCurso"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarTipoCurso";
		inputMap = this.jButtonModificarTipoCurso.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarTipoCurso.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarTipoCurso"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarTipoCurso";
		inputMap = this.jButtonCerrarTipoCurso.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoCurso.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoCurso"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoCurso";
		inputMap = this.jButtonGuardarCambiosTablaTipoCurso.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoCurso.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoCurso"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesTipoCurso = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesTipoCurso = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionTipoCurso = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1TipoCurso= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2TipoCurso= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3TipoCurso= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4TipoCurso= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5TipoCurso= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesTipoCurso.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesTipoCurso.setName("jPanelParametrosReportesTipoCurso"); 
		
		this.jPanelParametrosReportesAccionesTipoCurso.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesTipoCurso.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesTipoCurso.setName("jPanelParametrosReportesAccionesTipoCurso"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesTipoCurso, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesTipoCurso, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionTipoCurso = new JButtonMe();
		this.jButtonRecargarInformacionTipoCurso.setText("Recargar");
		this.jButtonRecargarInformacionTipoCurso.setToolTipText("Recargar"+" "+TipoCursoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionTipoCurso,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionTipoCurso = new JButtonMe();
		this.jButtonProcesarInformacionTipoCurso.setText("Procesar");
		this.jButtonProcesarInformacionTipoCurso.setToolTipText("Procesar"+" "+TipoCursoConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionTipoCurso.setVisible(false);
			
		this.jButtonProcesarInformacionTipoCurso.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoCurso.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoCurso.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesTipoCurso = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoCurso.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesTipoCurso.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesTipoCurso = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoCurso.setText("TIPO");       
		this.jComboBoxTiposReportesTipoCurso.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesTipoCurso = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoCurso.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesTipoCurso.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionTipoCurso = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionTipoCurso.setText("Paginacion");
		this.jComboBoxTiposPaginacionTipoCurso.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesTipoCurso = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesTipoCurso.setText("Accion");
		this.jComboBoxTiposRelacionesTipoCurso.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesTipoCurso = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoCurso.setText("Accion");
		this.jComboBoxTiposAccionesTipoCurso.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarTipoCurso = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarTipoCurso.setText("Accion");
		this.jComboBoxTiposSeleccionarTipoCurso.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralTipoCurso=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralTipoCurso.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoCurso.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoCurso.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesTipoCurso = new JLabelMe();
		
		this.jLabelAccionesTipoCurso.setText("Acciones");		
		this.jLabelAccionesTipoCurso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoCurso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoCurso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosTipoCurso = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosTipoCurso.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosTipoCurso.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosTipoCurso = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosTipoCurso.setText("Seleccionados");
		this.jCheckBoxSeleccionadosTipoCurso.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaTipoCurso = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaTipoCurso.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaTipoCurso.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteTipoCurso = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteTipoCurso.setText("Graf.");
		this.jCheckBoxConGraficoReporteTipoCurso.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresTipoCurso = new JButtonMe();
		//this.jButtonAnterioresTipoCurso.setText("<<");
        this.jButtonAnterioresTipoCurso.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresTipoCurso,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresTipoCurso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesTipoCurso = new JButtonMe();
		//this.jButtonSiguientesTipoCurso.setText(">>");
        this.jButtonSiguientesTipoCurso.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesTipoCurso,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesTipoCurso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosTipoCurso = new JButtonMe();
		this.jButtonNuevoGuardarCambiosTipoCurso.setText("Nue");
        this.jButtonNuevoGuardarCambiosTipoCurso.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosTipoCurso,"nuevoguardarcambios_button","Nue",this.tipocursoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosTipoCurso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosTipoCurso";
		inputMap = this.jButtonNuevoGuardarCambiosTipoCurso.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosTipoCurso.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosTipoCurso"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionTipoCurso";
		inputMap = this.jButtonRecargarInformacionTipoCurso.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionTipoCurso.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionTipoCurso"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesTipoCurso";
		inputMap = this.jButtonSiguientesTipoCurso.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesTipoCurso.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesTipoCurso"));
		
		//ANTERIORES		
		sMapKey = "AnterioresTipoCurso";
		inputMap = this.jButtonAnterioresTipoCurso.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresTipoCurso.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresTipoCurso"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasTipoCurso();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesTipoCurso.setMinimumSize(new Dimension(this.getWidth(),TipoCursoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoCursoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoCurso.setMaximumSize(new Dimension(this.getWidth(),TipoCursoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoCursoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoCurso.setPreferredSize(new Dimension(this.getWidth(),TipoCursoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoCursoBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionTipoCurso = new GridBagLayout();

			this.jPanelPaginacionTipoCurso.setLayout(gridaBagLayoutPaginacionTipoCurso);						
			
			this.gridBagConstraintsTipoCurso = new GridBagConstraints();
			this.gridBagConstraintsTipoCurso.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsTipoCurso.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCurso.gridy = 0;
			this.gridBagConstraintsTipoCurso.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionTipoCurso.add(this.jButtonAnterioresTipoCurso, this.gridBagConstraintsTipoCurso);
					
						
			this.gridBagConstraintsTipoCurso = new GridBagConstraints();
			this.gridBagConstraintsTipoCurso.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoCurso.gridy = 0;
			
			this.jPanelPaginacionTipoCurso.add(this.jButtonNuevoGuardarCambiosTipoCurso, this.gridBagConstraintsTipoCurso);
						
			
			this.gridBagConstraintsTipoCurso = new GridBagConstraints();
			this.gridBagConstraintsTipoCurso.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsTipoCurso.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoCurso.gridy = 0;
			this.jPanelPaginacionTipoCurso.add(this.jButtonSiguientesTipoCurso, this.gridBagConstraintsTipoCurso);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsTipoCurso = new GridBagConstraints();
			this.gridBagConstraintsTipoCurso.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCurso.gridy = 1;
			this.gridBagConstraintsTipoCurso.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoCurso.add(this.jButtonNuevoTipoCurso, this.gridBagConstraintsTipoCurso);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsTipoCurso = new GridBagConstraints();
				this.gridBagConstraintsTipoCurso.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoCurso.gridy = 1;
				this.gridBagConstraintsTipoCurso.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionTipoCurso.add(this.jButtonNuevoRelacionesTipoCurso, this.gridBagConstraintsTipoCurso);
			}
			
			
			if(!this.tipocursoSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsTipoCurso = new GridBagConstraints();
				this.gridBagConstraintsTipoCurso.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoCurso.gridy = 1;
				this.gridBagConstraintsTipoCurso.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionTipoCurso.add(this.jButtonGuardarCambiosTablaTipoCurso, this.gridBagConstraintsTipoCurso);
			}
			
			
			
			this.gridBagConstraintsTipoCurso = new GridBagConstraints();
			this.gridBagConstraintsTipoCurso.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCurso.gridy = 1;
			this.gridBagConstraintsTipoCurso.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoCurso.add(this.jButtonDuplicarTipoCurso, this.gridBagConstraintsTipoCurso);
			
			this.gridBagConstraintsTipoCurso = new GridBagConstraints();
			this.gridBagConstraintsTipoCurso.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCurso.gridy = 1;
			this.gridBagConstraintsTipoCurso.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoCurso.add(this.jButtonCopiarTipoCurso, this.gridBagConstraintsTipoCurso);
		
			this.gridBagConstraintsTipoCurso = new GridBagConstraints();
			this.gridBagConstraintsTipoCurso.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCurso.gridy = 1;
			this.gridBagConstraintsTipoCurso.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoCurso.add(this.jButtonVerFormTipoCurso, this.gridBagConstraintsTipoCurso);
		
			this.gridBagConstraintsTipoCurso = new GridBagConstraints();
			this.gridBagConstraintsTipoCurso.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCurso.gridy = 1;
			this.gridBagConstraintsTipoCurso.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionTipoCurso.add(this.jButtonCerrarTipoCurso, this.gridBagConstraintsTipoCurso);
		
		
		
		this.jButtonRecargarInformacionTipoCurso.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoCurso.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoCurso.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionTipoCurso, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesTipoCurso.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoCurso.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoCurso.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesTipoCurso, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesTipoCurso.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoCurso.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoCurso.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesTipoCurso, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesTipoCurso.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoCurso.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoCurso.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesTipoCurso, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionTipoCurso.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoCurso.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoCurso.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionTipoCurso, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesTipoCurso.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoCurso.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoCurso.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesTipoCurso, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesTipoCurso.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoCurso.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoCurso.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoCurso, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarTipoCurso.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoCurso.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoCurso.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarTipoCurso, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaTipoCurso.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoCurso.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoCurso.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaTipoCurso, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteTipoCurso.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoCurso.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoCurso.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteTipoCurso, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosTipoCurso.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoCurso.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoCurso.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosTipoCurso, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosTipoCurso.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoCurso.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoCurso.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosTipoCurso, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesTipoCurso = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesTipoCurso = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1TipoCurso = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2TipoCurso = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3TipoCurso = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4TipoCurso = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesTipoCurso.setLayout(gridaBagParametrosReportesTipoCurso);
			this.jPanelParametrosReportesAccionesTipoCurso.setLayout(gridaBagParametrosReportesAccionesTipoCurso);
			
			
			this.jPanelParametrosAuxiliar1TipoCurso.setLayout(gridaBagParametrosAuxiliar1TipoCurso);
			this.jPanelParametrosAuxiliar2TipoCurso.setLayout(gridaBagParametrosAuxiliar2TipoCurso);
			this.jPanelParametrosAuxiliar3TipoCurso.setLayout(gridaBagParametrosAuxiliar3TipoCurso);
			this.jPanelParametrosAuxiliar4TipoCurso.setLayout(gridaBagParametrosAuxiliar4TipoCurso);
			//this.jPanelParametrosAuxiliar5TipoCurso.setLayout(gridaBagParametrosAuxiliar2TipoCurso);			
			
			
			
			
			this.gridBagConstraintsTipoCurso = new GridBagConstraints();
			this.gridBagConstraintsTipoCurso.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCurso.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoCurso.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoCurso.add(this.jButtonRecargarInformacionTipoCurso, this.gridBagConstraintsTipoCurso);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsTipoCurso = new GridBagConstraints();
			this.gridBagConstraintsTipoCurso.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCurso.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCurso.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoCurso.add(this.jComboBoxTiposPaginacionTipoCurso, this.gridBagConstraintsTipoCurso);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsTipoCurso = new GridBagConstraints();
			this.gridBagConstraintsTipoCurso.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCurso.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCurso.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoCurso.add(this.jCheckBoxConAltoMaximoTablaTipoCurso, this.gridBagConstraintsTipoCurso);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsTipoCurso = new GridBagConstraints();
			this.gridBagConstraintsTipoCurso.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCurso.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCurso.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoCurso.add(this.jComboBoxTiposArchivosReportesTipoCurso, this.gridBagConstraintsTipoCurso);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsTipoCurso = new GridBagConstraints();
			this.gridBagConstraintsTipoCurso.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCurso.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCurso.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoCurso.add(this.jPanelParametrosAuxiliar1TipoCurso, this.gridBagConstraintsTipoCurso);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsTipoCurso = new GridBagConstraints();
			this.gridBagConstraintsTipoCurso.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCurso.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCurso.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoCurso.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4TipoCurso.add(this.jComboBoxTiposReportesTipoCurso, this.gridBagConstraintsTipoCurso);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsTipoCurso = new GridBagConstraints();
			this.gridBagConstraintsTipoCurso.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCurso.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCurso.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoCurso.add(this.jPanelParametrosAuxiliar4TipoCurso, this.gridBagConstraintsTipoCurso);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsTipoCurso = new GridBagConstraints();
			this.gridBagConstraintsTipoCurso.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCurso.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCurso.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoCurso.add(this.jComboBoxTiposReportesTipoCurso, this.gridBagConstraintsTipoCurso);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsTipoCurso = new GridBagConstraints();
			this.gridBagConstraintsTipoCurso.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCurso.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCurso.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoCurso.add(this.jCheckBoxGenerarReporteTipoCurso, this.gridBagConstraintsTipoCurso);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsTipoCurso = new GridBagConstraints();
			this.gridBagConstraintsTipoCurso.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCurso.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCurso.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoCurso.add(this.jPanelParametrosAuxiliar2TipoCurso, this.gridBagConstraintsTipoCurso);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsTipoCurso = new GridBagConstraints();
			this.gridBagConstraintsTipoCurso.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCurso.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoCurso.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoCurso.add(this.jLabelAccionesTipoCurso, this.gridBagConstraintsTipoCurso);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsTipoCurso = new GridBagConstraints();
				this.gridBagConstraintsTipoCurso.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsTipoCurso.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsTipoCurso.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesTipoCurso.add(this.jButtonAbrirOrderByTipoCurso, this.gridBagConstraintsTipoCurso);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsTipoCurso = new GridBagConstraints();
			this.gridBagConstraintsTipoCurso.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsTipoCurso.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCurso.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoCurso.add(this.jComboBoxTiposSeleccionarTipoCurso, this.gridBagConstraintsTipoCurso);			
			
			
			/*
			this.gridBagConstraintsTipoCurso = new GridBagConstraints();
			this.gridBagConstraintsTipoCurso.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCurso.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoCurso.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoCurso.add(this.jCheckBoxSeleccionarTodosTipoCurso, this.gridBagConstraintsTipoCurso);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsTipoCurso = new GridBagConstraints();
			this.gridBagConstraintsTipoCurso.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCurso.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCurso.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoCurso.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoCurso.add(this.jCheckBoxSeleccionarTodosTipoCurso, this.gridBagConstraintsTipoCurso);															
				
			this.gridBagConstraintsTipoCurso = new GridBagConstraints();
			this.gridBagConstraintsTipoCurso.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCurso.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCurso.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoCurso.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoCurso.add(this.jCheckBoxSeleccionadosTipoCurso, this.gridBagConstraintsTipoCurso);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsTipoCurso = new GridBagConstraints();
			this.gridBagConstraintsTipoCurso.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCurso.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCurso.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoCurso.add(this.jPanelParametrosAuxiliar3TipoCurso, this.gridBagConstraintsTipoCurso);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsTipoCurso = new GridBagConstraints();
			this.gridBagConstraintsTipoCurso.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCurso.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoCurso.add(this.jComboBoxTiposRelacionesTipoCurso, this.gridBagConstraintsTipoCurso);
				
			this.gridBagConstraintsTipoCurso = new GridBagConstraints();
			this.gridBagConstraintsTipoCurso.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCurso.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoCurso.add(this.jComboBoxTiposAccionesTipoCurso, this.gridBagConstraintsTipoCurso);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosTipoCurso = new GridBagLayout();

			this.jScrollPanelDatosTipoCurso.setLayout(gridaBagLayoutDatosTipoCurso);
			
			this.gridBagConstraintsTipoCurso = new GridBagConstraints();
			this.gridBagConstraintsTipoCurso.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCurso.gridy = 0;
			this.gridBagConstraintsTipoCurso.gridx = 0;
			
			this.jScrollPanelDatosTipoCurso.add(this.jTableDatosTipoCurso, this.gridBagConstraintsTipoCurso);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosTipoCurso.setViewportView(this.jTableDatosTipoCurso);
		this.jTableDatosTipoCurso.setFillsViewportHeight(true);
		this.jTableDatosTipoCurso.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesTipoCurso= new GridBagLayout();
		this.jPanelAccionesTipoCurso.setLayout(gridaBagLayoutAccionesTipoCurso);
		
		
		/*	
		this.gridBagConstraintsTipoCurso = new GridBagConstraints();
		this.gridBagConstraintsTipoCurso.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCurso.gridy = 0;
		this.gridBagConstraintsTipoCurso.gridx = 0;
			
		this.jPanelAccionesTipoCurso.add(this.jButtonNuevoTipoCurso, this.gridBagConstraintsTipoCurso);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoCurso = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoCurso);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipocursoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoCurso = new GridBagConstraints();						
			this.gridBagConstraintsTipoCurso.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoCurso.gridx = 0;		
			//this.gridBagConstraintsTipoCurso.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCurso.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoCurso.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarTipoCurso, this.gridBagConstraintsTipoCurso);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsTipoCurso = new GridBagConstraints();
		this.gridBagConstraintsTipoCurso.gridy = iGridyPrincipal++;
		this.gridBagConstraintsTipoCurso.gridx = 0;		
		//this.gridBagConstraintsTipoCurso.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCurso.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsTipoCurso.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsTipoCurso);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsTipoCurso = new GridBagConstraints();
		this.gridBagConstraintsTipoCurso.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoCurso.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesTipoCurso, this.gridBagConstraintsTipoCurso);								
		
		
		/*
		this.gridBagConstraintsTipoCurso = new GridBagConstraints();
		this.gridBagConstraintsTipoCurso.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoCurso.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesTipoCurso, this.gridBagConstraintsTipoCurso);
		*/		
		
		this.gridBagConstraintsTipoCurso = new GridBagConstraints();
		this.gridBagConstraintsTipoCurso.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoCurso.gridx =0;
		this.gridBagConstraintsTipoCurso.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoCurso.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoCurso, this.gridBagConstraintsTipoCurso);
				
		
		this.gridBagConstraintsTipoCurso = new GridBagConstraints();
		this.gridBagConstraintsTipoCurso.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoCurso.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionTipoCurso, this.gridBagConstraintsTipoCurso);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(TipoCursoJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosTipoCurso= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoCurso = new GridBagLayout();
			this.jPanelBusquedasParametrosTipoCurso.setLayout(gridaBagLayoutBusquedasParametrosTipoCurso);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralTipoCurso=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoCurso.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoCurso.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoCurso.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoCurso = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsTipoCurso = new GridBagConstraints();
		this.gridBagConstraintsTipoCurso.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoCurso.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoCurso, this.gridBagConstraintsTipoCurso);
			
			
		this.gridBagConstraintsTipoCurso = new GridBagConstraints();
		this.gridBagConstraintsTipoCurso.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoCurso.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoCurso, this.gridBagConstraintsTipoCurso);
		
			
		this.gridBagConstraintsTipoCurso = new GridBagConstraints();
		this.gridBagConstraintsTipoCurso.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoCurso.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoCurso, this.gridBagConstraintsTipoCurso);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralTipoCurso;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoTipoCurso() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoTipoCurso = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoTipoCurso = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoTipoCurso.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoTipoCurso.setName("jPanelReporteDinamicoTipoCurso"); 
		
		this.jPanelReporteDinamicoTipoCurso.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoCurso.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoCurso.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoTipoCurso.setLayout(gridaBagLayoutReporteDinamicoTipoCurso);
		
		
		this.jInternalFrameReporteDinamicoTipoCurso= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoTipoCurso = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoCurso= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoTipoCurso.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoTipoCurso.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoTipoCurso.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoTipoCurso.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoTipoCurso.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoTipoCurso.setResizable(true);
	    this.jInternalFrameReporteDinamicoTipoCurso.setClosable(true);
	    this.jInternalFrameReporteDinamicoTipoCurso.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoTipoCurso.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoCurso.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoCurso.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoTipoCurso.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Cursos"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteTipoCurso = new JLabelMe();

		this.jLabelColumnasSelectReporteTipoCurso.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteTipoCurso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoCurso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoCurso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoCurso = new GridBagConstraints();
		this.gridBagConstraintsTipoCurso.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCurso.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoCurso.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoCurso.add(this.jLabelColumnasSelectReporteTipoCurso, this.gridBagConstraintsTipoCurso);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteTipoCurso = new JList<Reporte>();
		this.jListColumnasSelectReporteTipoCurso.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteTipoCurso.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteTipoCurso.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoCurso.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoCurso.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteTipoCurso=new JScrollPane(this.jListColumnasSelectReporteTipoCurso);
			
			this.jScrollColumnasSelectReporteTipoCurso.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoCurso.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoCurso.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteTipoCurso.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTipoCurso = new GridBagConstraints();
		this.gridBagConstraintsTipoCurso.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCurso.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoCurso.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoCurso.add(this.jListColumnasSelectReporteTipoCurso, this.gridBagConstraintsTipoCurso);
		this.jPanelReporteDinamicoTipoCurso.add(this.jScrollColumnasSelectReporteTipoCurso, this.gridBagConstraintsTipoCurso);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteTipoCurso = new JLabelMe();

		this.jLabelRelacionesSelectReporteTipoCurso.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteTipoCurso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoCurso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoCurso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsTipoCurso = new GridBagConstraints();
		this.gridBagConstraintsTipoCurso.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCurso.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoCurso.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoCurso.add(this.jLabelRelacionesSelectReporteTipoCurso, this.gridBagConstraintsTipoCurso);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteTipoCurso = new JList<Reporte>();
		this.jListRelacionesSelectReporteTipoCurso.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteTipoCurso.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteTipoCurso.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoCurso.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoCurso.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteTipoCurso=new JScrollPane(this.jListRelacionesSelectReporteTipoCurso);
			
			this.jScrollRelacionesSelectReporteTipoCurso.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoCurso.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoCurso.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteTipoCurso.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsTipoCurso = new GridBagConstraints();
		this.gridBagConstraintsTipoCurso.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCurso.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoCurso.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoCurso.add(this.jListRelacionesSelectReporteTipoCurso, this.gridBagConstraintsTipoCurso);
		this.jPanelReporteDinamicoTipoCurso.add(this.jScrollRelacionesSelectReporteTipoCurso, this.gridBagConstraintsTipoCurso);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoTipoCurso = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoTipoCurso = new JComboBoxMe();
		this.jListColumnasValoresGraficoTipoCurso = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoTipoCurso = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoTipoCurso.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoTipoCurso.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoCurso.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoCurso.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoTipoCurso, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoTipoCurso = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoTipoCurso.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoTipoCurso.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoCurso.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoCurso.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoTipoCurso, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoTipoCurso = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoTipoCurso.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoTipoCurso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoCurso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoCurso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoCurso = new GridBagConstraints();
		this.gridBagConstraintsTipoCurso.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCurso.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoCurso.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoCurso.add(this.jLabelGenerarExcelReporteDinamicoTipoCurso, this.gridBagConstraintsTipoCurso);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoTipoCurso = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoTipoCurso.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoTipoCurso,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoTipoCurso.setToolTipText("Generar EXCEL"+" "+TipoCursoConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsTipoCurso = new GridBagConstraints();
		//this.gridBagConstraintsTipoCurso.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsTipoCurso.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsTipoCurso.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoTipoCurso.add(this.jButtonGenerarExcelReporteDinamicoTipoCurso, this.gridBagConstraintsTipoCurso);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsTipoCurso = new GridBagConstraints();
		this.gridBagConstraintsTipoCurso.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCurso.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoCurso.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoCurso.add(this.jComboBoxTiposReportesDinamicoTipoCurso, this.gridBagConstraintsTipoCurso);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoTipoCurso = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoTipoCurso.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoTipoCurso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoCurso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoCurso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoCurso = new GridBagConstraints();
		this.gridBagConstraintsTipoCurso.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCurso.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoCurso.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoCurso.add(this.jLabelTiposArchivoReporteDinamicoTipoCurso, this.gridBagConstraintsTipoCurso);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsTipoCurso = new GridBagConstraints();
		this.gridBagConstraintsTipoCurso.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCurso.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoCurso.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoCurso.add(this.jComboBoxTiposArchivosReportesDinamicoTipoCurso, this.gridBagConstraintsTipoCurso);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoTipoCurso = new JButtonMe();
		this.jButtonGenerarReporteDinamicoTipoCurso.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoTipoCurso,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoTipoCurso.setToolTipText("Generar"+" "+TipoCursoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsTipoCurso = new GridBagConstraints();
		this.gridBagConstraintsTipoCurso.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCurso.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoCurso.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoCurso.add(this.jButtonGenerarReporteDinamicoTipoCurso, this.gridBagConstraintsTipoCurso);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoTipoCurso = new JButtonMe();
		this.jButtonCerrarReporteDinamicoTipoCurso.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoTipoCurso,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoTipoCurso.setToolTipText("Cancelar"+" "+TipoCursoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoCurso = new GridBagConstraints();
		this.gridBagConstraintsTipoCurso.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCurso.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoCurso.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoCurso.add(this.jButtonCerrarReporteDinamicoTipoCurso, this.gridBagConstraintsTipoCurso);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalTipoCurso = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoTipoCurso= new JScrollPane(jPanelReporteDinamicoTipoCurso,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoTipoCurso.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoCurso.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoCurso.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoTipoCurso.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Cursos"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoCurso = new GridBagConstraints();
		this.gridBagConstraintsTipoCurso.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsTipoCurso.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsTipoCurso.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoTipoCurso.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoTipoCurso.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalTipoCurso);
		this.jInternalFrameReporteDinamicoTipoCurso.getContentPane().add(this.jScrollPanelReporteDinamicoTipoCurso, this.gridBagConstraintsTipoCurso);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionTipoCurso() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionTipoCurso = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionTipoCurso = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionTipoCurso.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionTipoCurso.setName("jPanelImportacionTipoCurso"); 
		
		this.jPanelImportacionTipoCurso.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoCurso.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoCurso.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionTipoCurso.setLayout(gridaBagLayoutImportacionTipoCurso);
		
		
		this.jInternalFrameImportacionTipoCurso= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionTipoCurso= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionTipoCurso = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoCurso= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionTipoCurso.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoCurso.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoCurso.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionTipoCurso.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoCurso.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoCurso.setResizable(true);
	    this.jInternalFrameImportacionTipoCurso.setClosable(true);
	    this.jInternalFrameImportacionTipoCurso.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionTipoCurso.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoCurso.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoCurso.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionTipoCurso.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoCurso.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoCurso.setResizable(true);
	    this.jInternalFrameImportacionTipoCurso.setClosable(true);
	    this.jInternalFrameImportacionTipoCurso.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionTipoCurso.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoCurso.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoCurso.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionTipoCurso.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Cursos"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionTipoCurso = new JLabelMe();

		this.jLabelArchivoImportacionTipoCurso.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionTipoCurso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoCurso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoCurso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoCurso = new GridBagConstraints();
		this.gridBagConstraintsTipoCurso.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCurso.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoCurso.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoCurso.add(this.jLabelArchivoImportacionTipoCurso, this.gridBagConstraintsTipoCurso);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionTipoCurso = new JFileChooser();		
		this.jFileChooserImportacionTipoCurso.setToolTipText("ESCOGER ARCHIVO"+" "+TipoCursoConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionTipoCurso = new JButtonMe();
		this.jButtonAbrirImportacionTipoCurso.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionTipoCurso,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionTipoCurso.setToolTipText("Generar"+" "+TipoCursoConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsTipoCurso = new GridBagConstraints();
		this.gridBagConstraintsTipoCurso.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCurso.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoCurso.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoCurso.add(this.jButtonAbrirImportacionTipoCurso, this.gridBagConstraintsTipoCurso);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionTipoCurso = new JLabelMe();

		this.jLabelPathArchivoImportacionTipoCurso.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionTipoCurso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoCurso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoCurso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoCurso = new GridBagConstraints();
		this.gridBagConstraintsTipoCurso.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCurso.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoCurso.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoCurso.add(this.jLabelPathArchivoImportacionTipoCurso, this.gridBagConstraintsTipoCurso);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionTipoCurso=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionTipoCurso.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoCurso.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoCurso.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsTipoCurso = new GridBagConstraints();
		this.gridBagConstraintsTipoCurso.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCurso.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoCurso.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoCurso.add(this.jTextFieldPathArchivoImportacionTipoCurso, this.gridBagConstraintsTipoCurso);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionTipoCurso = new JButtonMe();
		this.jButtonGenerarImportacionTipoCurso.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionTipoCurso,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionTipoCurso.setToolTipText("Generar"+" "+TipoCursoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsTipoCurso = new GridBagConstraints();
		this.gridBagConstraintsTipoCurso.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCurso.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoCurso.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoCurso.add(this.jButtonGenerarImportacionTipoCurso, this.gridBagConstraintsTipoCurso);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionTipoCurso = new JButtonMe();
		this.jButtonCerrarImportacionTipoCurso.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionTipoCurso,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionTipoCurso.setToolTipText("Cancelar"+" "+TipoCursoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoCurso = new GridBagConstraints();
		this.gridBagConstraintsTipoCurso.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCurso.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoCurso.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoCurso.add(this.jButtonCerrarImportacionTipoCurso, this.gridBagConstraintsTipoCurso);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalTipoCurso = new GridBagLayout();
		
		this.jScrollPanelImportacionTipoCurso= new JScrollPane(jPanelImportacionTipoCurso,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsTipoCurso = new GridBagConstraints();
		this.gridBagConstraintsTipoCurso.gridy =iPosYImportacion;
		this.gridBagConstraintsTipoCurso.gridx =iPosXImportacion;
		this.gridBagConstraintsTipoCurso.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionTipoCurso.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionTipoCurso.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalTipoCurso);
		this.jInternalFrameImportacionTipoCurso.getContentPane().add(this.jScrollPanelImportacionTipoCurso, this.gridBagConstraintsTipoCurso);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByTipoCurso(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByTipoCurso = new JButtonMe();
			this.jButtonAbrirOrderByTipoCurso.setText("Orden");
			this.jButtonAbrirOrderByTipoCurso.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoCurso,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoCurso, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByTipoCurso";
			inputMap = this.jButtonAbrirOrderByTipoCurso.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByTipoCurso.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByTipoCurso"));
		
		
			GridBagLayout gridaBagLayoutOrderByTipoCurso = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByTipoCurso = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByTipoCurso.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByTipoCurso.setName("jPanelOrderByTipoCurso"); 
			
			this.jPanelOrderByTipoCurso.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoCurso.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoCurso.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByTipoCurso, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByTipoCurso.setLayout(gridaBagLayoutOrderByTipoCurso);
			
			
			this.jTableDatosTipoCursoOrderBy = new JTableMe();        
			this.jTableDatosTipoCursoOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosTipoCursoOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosTipoCursoOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosTipoCursoOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosTipoCursoOrderBy.setViewportView(this.jTableDatosTipoCursoOrderBy);
			this.jTableDatosTipoCursoOrderBy.setFillsViewportHeight(true);
			this.jTableDatosTipoCursoOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByTipoCurso= new OrderByJInternalFrame();
			this.jInternalFrameOrderByTipoCurso= new OrderByJInternalFrame();
			this.jScrollPanelOrderByTipoCurso = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteTipoCurso= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByTipoCurso.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByTipoCurso.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByTipoCurso.setTitle("Orden");
			this.jInternalFrameOrderByTipoCurso.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByTipoCurso.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByTipoCurso.setResizable(true);
			this.jInternalFrameOrderByTipoCurso.setClosable(true);
			this.jInternalFrameOrderByTipoCurso.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByTipoCurso, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByTipoCurso.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoCurso.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoCurso.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByTipoCurso, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByTipoCurso.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Cursos"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsTipoCurso = new GridBagConstraints();
			this.gridBagConstraintsTipoCurso.gridy =iPosYOrderBy++;
			this.gridBagConstraintsTipoCurso.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoCurso.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsTipoCurso.ipady =150;
				
			this.jPanelOrderByTipoCurso.add(jScrollPanelDatosTipoCursoOrderBy, this.gridBagConstraintsTipoCurso);//this.jTableDatosTipoCursoTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByTipoCurso = new JButtonMe();
			this.jButtonCerrarOrderByTipoCurso.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByTipoCurso,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByTipoCurso.setToolTipText("Cancelar"+" "+TipoCursoConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByTipoCurso, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsTipoCurso = new GridBagConstraints();
			this.gridBagConstraintsTipoCurso.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCurso.gridy = iPosYOrderBy++;
			this.gridBagConstraintsTipoCurso.gridx = iPosXOrderBy;
									
			this.jPanelOrderByTipoCurso.add(this.jButtonCerrarOrderByTipoCurso, this.gridBagConstraintsTipoCurso);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalTipoCurso = new GridBagLayout();
			
			this.jScrollPanelOrderByTipoCurso= new JScrollPane(jPanelOrderByTipoCurso,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsTipoCurso = new GridBagConstraints();
			this.gridBagConstraintsTipoCurso.gridy =iPosYOrderBy;
			this.gridBagConstraintsTipoCurso.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoCurso.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByTipoCurso.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByTipoCurso.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalTipoCurso);
			
			this.jInternalFrameOrderByTipoCurso.getContentPane().add(this.jScrollPanelOrderByTipoCurso, this.gridBagConstraintsTipoCurso);			
		
		} else {
			this.jButtonAbrirOrderByTipoCurso = new JButtonMe();
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
			&& this.tipocursoSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosTipoCurso.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosTipoCurso.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosTipoCurso.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosTipoCurso.getRowHeight();//TipoCursoConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.tipocursoSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > TipoCursoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoCurso.isSelected()) {
					iHeightTable=TipoCursoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoCursoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoCursoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > TipoCursoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoCurso.isSelected()) {
					iHeightTable=TipoCursoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoCursoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoCursoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosTipoCurso.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoCurso.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoCurso.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosTipoCurso.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoCurso.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoCurso.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByTipoCurso!=null && this.jInternalFrameOrderByTipoCurso.getjTableDatosOrderBy()!=null) {
			//if(!this.tipocursoSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByTipoCurso.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByTipoCurso.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByTipoCurso.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByTipoCurso.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByTipoCurso.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByTipoCurso.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByTipoCurso.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosTipoCurso.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoCurso.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoCurso.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=tipocursoLogic.getTipoCursos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipocursos.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<TipoCurso> TraerTipoCursoBeans(List<TipoCurso> tipocursos,ArrayList<Classe> classes)throws Exception {
		try {
			for(TipoCurso tipocurso:tipocursos) {
					
				if(!(TipoCursoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || TipoCursoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					tipocurso.setsDetalleGeneralEntityReporte(TipoCursoConstantesFunciones.getTipoCursoDescripcion(tipocurso));
										
						
					
					

					if(tipocurso.getCursos()!=null && Funciones.existeClass(classes,Curso.class)) {
						try{tipocurso.setcursosDescripcionReporte(new JRBeanCollectionDataSource(CursoJInternalFrame.TraerCursoBeans(tipocurso.getCursos(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//tipocurso.setsDetalleGeneralEntityReporte(tipocurso.getsDetalleGeneralEntityReporte());
										
				}
				
				//tipocursobeans.add(tipocursobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return tipocursos;
    }
	//PARA REPORTES FIN
}
