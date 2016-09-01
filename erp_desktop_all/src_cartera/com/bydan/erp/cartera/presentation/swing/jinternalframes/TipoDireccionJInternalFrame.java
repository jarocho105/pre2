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
import com.bydan.erp.cartera.util.TipoDireccionConstantesFunciones;

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
public class TipoDireccionJInternalFrame extends TipoDireccionBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarTipoDireccion;
	
	protected JMenuBar jmenuBarTipoDireccion;
	
	protected JMenu jmenuTipoDireccion;
	protected JMenu jmenuDatosTipoDireccion;
	protected JMenu jmenuArchivoTipoDireccion;
	protected JMenu jmenuAccionesTipoDireccion;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosTipoDireccion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoDireccion;	
	protected GridBagConstraints gridBagConstraintsTipoDireccion;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public TipoDireccionDetalleFormJInternalFrame jInternalFrameDetalleFormTipoDireccion;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoTipoDireccion;	
	protected ImportacionJInternalFrame jInternalFrameImportacionTipoDireccion;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public TipoDireccionSessionBean tipodireccionSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<TipoDireccion> tipodireccions;		
	public List<TipoDireccion> tipodireccionsEliminados;	
	public List<TipoDireccion> tipodireccionsAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByTipoDireccion;		
	protected JButton jButtonAbrirOrderByTipoDireccion;
	
	
	//protected JPanel jPanelOrderByTipoDireccion;
	//public JScrollPane jScrollPanelOrderByTipoDireccion;	
	//protected JButton jButtonCerrarOrderByTipoDireccion;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public TipoDireccionLogic tipodireccionLogic;
	
	
	
	public JScrollPane jScrollPanelDatosTipoDireccion;
	public JScrollPane jScrollPanelDatosEdicionTipoDireccion;
	public JScrollPane jScrollPanelDatosGeneralTipoDireccion;
    
	
	
	//public JScrollPane jScrollPanelDatosTipoDireccionOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoTipoDireccion;
	//public JScrollPane jScrollPanelImportacionTipoDireccion;
	
	
	
	protected JPanel jPanelAccionesTipoDireccion;
	
    protected JPanel jPanelPaginacionTipoDireccion;
    protected JPanel jPanelParametrosReportesTipoDireccion;
	protected JPanel jPanelParametrosReportesAccionesTipoDireccion;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1TipoDireccion;
	protected JPanel jPanelParametrosAuxiliar2TipoDireccion;
	protected JPanel jPanelParametrosAuxiliar3TipoDireccion;
	protected JPanel jPanelParametrosAuxiliar4TipoDireccion;
	//protected JPanel jPanelParametrosAuxiliar5TipoDireccion;
	
	
	
	//protected JPanel jPanelReporteDinamicoTipoDireccion;
	//protected JPanel jPanelImportacionTipoDireccion;
	
	
	public JTable jTableDatosTipoDireccion;
	
	
	
	//public JTable jTableDatosTipoDireccionOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoTipoDireccion;
	protected JButton jButtonDuplicarTipoDireccion;
	protected JButton jButtonCopiarTipoDireccion;
	protected JButton jButtonVerFormTipoDireccion;
	protected JButton jButtonNuevoRelacionesTipoDireccion;
	protected JButton jButtonModificarTipoDireccion;
	
    protected JButton jButtonGuardarCambiosTablaTipoDireccion;
	protected JButton jButtonCerrarTipoDireccion;
	
	
	protected JButton jButtonRecargarInformacionTipoDireccion;
	protected JButton jButtonProcesarInformacionTipoDireccion;
	
	
	protected JButton jButtonAnterioresTipoDireccion;
	protected JButton jButtonSiguientesTipoDireccion;
	protected JButton jButtonNuevoGuardarCambiosTipoDireccion;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoTipoDireccion;
	//protected JButton jButtonCerrarReporteDinamicoTipoDireccion;
	//protected JButton jButtonGenerarExcelReporteDinamicoTipoDireccion;	
	
	
	
	//protected JButton jButtonAbrirImportacionTipoDireccion;
	//protected JButton jButtonGenerarImportacionTipoDireccion;
	//protected JButton jButtonCerrarImportacionTipoDireccion;
	//protected JFileChooser jFileChooserImportacionTipoDireccion;
	//protected File fileImportacionTipoDireccion;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoDireccion;
	protected JButton jButtonDuplicarToolBarTipoDireccion;
	protected JButton jButtonNuevoRelacionesToolBarTipoDireccion;
	
	
	public JButton jButtonGuardarCambiosToolBarTipoDireccion;
	protected JButton jButtonCopiarToolBarTipoDireccion;
	protected JButton jButtonVerFormToolBarTipoDireccion;
	public JButton jButtonGuardarCambiosTablaToolBarTipoDireccion;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoDireccion;
	protected JButton jButtonCerrarToolBarTipoDireccion;
	
	protected JButton jButtonRecargarInformacionToolBarTipoDireccion;
	protected JButton jButtonProcesarInformacionToolBarTipoDireccion;
	protected JButton jButtonAnterioresToolBarTipoDireccion;
	protected JButton jButtonSiguientesToolBarTipoDireccion;
	protected JButton jButtonNuevoGuardarCambiosToolBarTipoDireccion;
	protected JButton jButtonAbrirOrderByToolBarTipoDireccion;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoDireccion;
	protected JMenuItem jMenuItemDuplicarTipoDireccion;
	protected JMenuItem jMenuItemNuevoRelacionesTipoDireccion;
	
	
	protected JMenuItem jMenuItemGuardarCambiosTipoDireccion;
	protected JMenuItem jMenuItemCopiarTipoDireccion;
	protected JMenuItem jMenuItemVerFormTipoDireccion;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoDireccion;
	protected JMenuItem jMenuItemCerrarTipoDireccion;
	protected JMenuItem jMenuItemDetalleCerrarTipoDireccion;
	protected JMenuItem jMenuItemDetalleAbrirOrderByTipoDireccion;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoDireccion;
	
	protected JMenuItem jMenuItemRecargarInformacionTipoDireccion;
	protected JMenuItem jMenuItemProcesarInformacionTipoDireccion;
	protected JMenuItem jMenuItemAnterioresTipoDireccion;
	protected JMenuItem jMenuItemSiguientesTipoDireccion;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoDireccion;
	protected JMenuItem jMenuItemAbrirOrderByTipoDireccion;
	protected JMenuItem jMenuItemMostrarOcultarTipoDireccion;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoDireccion;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosTipoDireccion;
	protected JCheckBox jCheckBoxSeleccionadosTipoDireccion;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaTipoDireccion;
	protected JCheckBox jCheckBoxConGraficoReporteTipoDireccion;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesTipoDireccion;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesTipoDireccion;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoTipoDireccion;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoTipoDireccion;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesTipoDireccion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionTipoDireccion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoDireccion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoDireccion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarTipoDireccion;
	protected JTextField jTextFieldValorCampoGeneralTipoDireccion;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteTipoDireccion;
	//public JList<Reporte> jListColumnasSelectReporteTipoDireccion;
	//public JScrollPane jScrollColumnasSelectReporteTipoDireccion;
	
	//public JLabel jLabelRelacionesSelectReporteTipoDireccion;
	//public JList<Reporte> jListRelacionesSelectReporteTipoDireccion;
	//public JScrollPane jScrollRelacionesSelectReporteTipoDireccion;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoTipoDireccion;
	//protected JCheckBox jCheckBoxConGraficoDinamicoTipoDireccion;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoTipoDireccion;
	//public JLabel jLabelTiposArchivoReporteDinamicoTipoDireccion;
	
		
	//public JLabel jLabelArchivoImportacionTipoDireccion;	
	//public JLabel jLabelPathArchivoImportacionTipoDireccion;
	//protected JTextField jTextFieldPathArchivoImportacionTipoDireccion;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoTipoDireccion;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoTipoDireccion;
	
	//public JLabel jLabelColumnaCategoriaValorTipoDireccion;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorTipoDireccion;
	
	//public JLabel jLabelColumnasValoresGraficoTipoDireccion;
	//public JList<Reporte> jListColumnasValoresGraficoTipoDireccion;
	//public JScrollPane jScrollColumnasValoresGraficoTipoDireccion;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoTipoDireccion;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoTipoDireccion;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasTipoDireccion;
	
	
	
	
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
	public TipoDireccionJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("TipoDireccion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoDireccionJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoDireccion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoDireccionJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoDireccion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoDireccionJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoDireccion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionTipoDireccion)	{
		this.jButtonRecargarInformacionTipoDireccion = jButtonRecargarInformacionTipoDireccion;
	}
	
	public JButton getjButtonProcesarInformacionTipoDireccion() {
		return this.jButtonProcesarInformacionTipoDireccion;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoDireccion)	{
		this.jButtonProcesarInformacionTipoDireccion = jButtonProcesarInformacionTipoDireccion;
	}
	
	
	public JButton getjButtonRecargarInformacionTipoDireccion() {
		return this.jButtonRecargarInformacionTipoDireccion;
	}
	
	
	public List<TipoDireccion> gettipodireccions() {
		return this.tipodireccions;
	}

	public void settipodireccions(List<TipoDireccion> tipodireccions) {
		this.tipodireccions = tipodireccions;
	}
	
	public List<TipoDireccion> gettipodireccionsAux() {
		return this.tipodireccionsAux;
	}

	public void settipodireccionsAux(List<TipoDireccion> tipodireccionsAux) {
		this.tipodireccionsAux = tipodireccionsAux;
	}
	
	public List<TipoDireccion> gettipodireccionsEliminados() {
		return this.tipodireccionsEliminados;
	}

	public void setTipoDireccionsEliminados(List<TipoDireccion> tipodireccionsEliminados) {
		this.tipodireccionsEliminados = tipodireccionsEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarTipoDireccion() {
		return jComboBoxTiposSeleccionarTipoDireccion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarTipoDireccion(
			JComboBox jComboBoxTiposSeleccionarTipoDireccion) {
		this.jComboBoxTiposSeleccionarTipoDireccion = jComboBoxTiposSeleccionarTipoDireccion;
	}
	
	public void setBorderResaltarTiposSeleccionarTipoDireccion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarTipoDireccion.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarTipoDireccion .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralTipoDireccion() {
		return jTextFieldValorCampoGeneralTipoDireccion;
	}

	public void setjTextFieldValorCampoGeneralTipoDireccion(
			JTextField jTextFieldValorCampoGeneralTipoDireccion) {
		this.jTextFieldValorCampoGeneralTipoDireccion = jTextFieldValorCampoGeneralTipoDireccion;
	}

	public void setBorderResaltarValorCampoGeneralTipoDireccion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoDireccion.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralTipoDireccion .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosTipoDireccion() {
		return this.jCheckBoxSeleccionarTodosTipoDireccion;
	}

	public void setjCheckBoxSeleccionarTodosTipoDireccion(
			JCheckBox jCheckBoxSeleccionarTodosTipoDireccion) {
		this.jCheckBoxSeleccionarTodosTipoDireccion = jCheckBoxSeleccionarTodosTipoDireccion;
	}

	public void setBorderResaltarSeleccionarTodosTipoDireccion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoDireccion.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosTipoDireccion .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosTipoDireccion() {
		return this.jCheckBoxSeleccionadosTipoDireccion;
	}

	public void setjCheckBoxSeleccionadosTipoDireccion(
			JCheckBox jCheckBoxSeleccionadosTipoDireccion) {
		this.jCheckBoxSeleccionadosTipoDireccion = jCheckBoxSeleccionadosTipoDireccion;
	}
	
	public void setBorderResaltarSeleccionadosTipoDireccion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoDireccion.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosTipoDireccion .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesTipoDireccion() {
		return this.jComboBoxTiposArchivosReportesTipoDireccion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesTipoDireccion(
			JComboBox jComboBoxTiposArchivosReportesTipoDireccion) {
		this.jComboBoxTiposArchivosReportesTipoDireccion = jComboBoxTiposArchivosReportesTipoDireccion;
	}

	public void setBorderResaltarTiposArchivosReportesTipoDireccion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoDireccion.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesTipoDireccion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesTipoDireccion() {
		return this.jComboBoxTiposReportesTipoDireccion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesTipoDireccion(
			JComboBox jComboBoxTiposReportesTipoDireccion) {
		this.jComboBoxTiposReportesTipoDireccion = jComboBoxTiposReportesTipoDireccion;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoTipoDireccion() {
	//	return jComboBoxTiposReportesDinamicoTipoDireccion;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoTipoDireccion(
	//		JComboBox jComboBoxTiposReportesDinamicoTipoDireccion) {
	//	this.jComboBoxTiposReportesDinamicoTipoDireccion = jComboBoxTiposReportesDinamicoTipoDireccion;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoTipoDireccion() {
	//	return jComboBoxTiposArchivosReportesDinamicoTipoDireccion;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoTipoDireccion(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoTipoDireccion) {
	//	this.jComboBoxTiposArchivosReportesDinamicoTipoDireccion = jComboBoxTiposArchivosReportesDinamicoTipoDireccion;
	//}
	
	public void setBorderResaltarTiposReportesTipoDireccion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoDireccion.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesTipoDireccion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesTipoDireccion() {
		return this.jComboBoxTiposGraficosReportesTipoDireccion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesTipoDireccion(
			JComboBox jComboBoxTiposGraficosReportesTipoDireccion) {
		this.jComboBoxTiposGraficosReportesTipoDireccion = jComboBoxTiposGraficosReportesTipoDireccion;
	}
	
	public void setBorderResaltarTiposGraficosReportesTipoDireccion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoDireccion.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesTipoDireccion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionTipoDireccion() {
		return this.jComboBoxTiposPaginacionTipoDireccion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionTipoDireccion(
			JComboBox jComboBoxTiposPaginacionTipoDireccion) {
		this.jComboBoxTiposPaginacionTipoDireccion = jComboBoxTiposPaginacionTipoDireccion;
	}
	
	public void setBorderResaltarTiposPaginacionTipoDireccion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoDireccion.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionTipoDireccion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesTipoDireccion() {
		return this.jComboBoxTiposRelacionesTipoDireccion;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoDireccion() {
		return this.jComboBoxTiposAccionesTipoDireccion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoDireccion(
			JComboBox jComboBoxTiposRelacionesTipoDireccion) {
		this.jComboBoxTiposRelacionesTipoDireccion = jComboBoxTiposRelacionesTipoDireccion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoDireccion(
			JComboBox jComboBoxTiposAccionesTipoDireccion) {
		this.jComboBoxTiposAccionesTipoDireccion = jComboBoxTiposAccionesTipoDireccion;
	}
	
	public void setBorderResaltarTiposRelacionesTipoDireccion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoDireccion.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesTipoDireccion .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesTipoDireccion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoDireccion.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesTipoDireccion .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoTipoDireccion() {
	//	return jCheckBoxConGraficoDinamicoTipoDireccion;
	//}

	//public void setjCheckBoxConGraficoDinamicoTipoDireccion(
	//		JCheckBox jCheckBoxConGraficoDinamicoTipoDireccion) {
	//	this.jCheckBoxConGraficoDinamicoTipoDireccion = jCheckBoxConGraficoDinamicoTipoDireccion;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoTipoDireccion() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarTipoDireccion.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoTipoDireccion .setBorder(borderResaltar);		
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
		this.tipodireccionSessionBean=new TipoDireccionSessionBean();
		
		this.tipodireccionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipodireccionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipodireccionSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=TipoDireccionJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=TipoDireccionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoDireccionJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoDireccionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoDireccionJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Direccion MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.tipodireccionSessionBean.getEsGuardarRelacionado()) {
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
		
		TipoDireccionJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("TipoDireccion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarTipoDireccion= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarTipoDireccion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarTipoDireccion,this.jTtoolBarTipoDireccion,
							"nuevo","nuevo","Nuevo"+" "+TipoDireccionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoDireccion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarTipoDireccion,this.jTtoolBarTipoDireccion,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoDireccion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarTipoDireccion,this.jTtoolBarTipoDireccion,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+TipoDireccionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarTipoDireccion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarTipoDireccion,this.jTtoolBarTipoDireccion,
							"duplicar","duplicar","Duplicar"+" "+TipoDireccionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarTipoDireccion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarTipoDireccion,this.jTtoolBarTipoDireccion,
							"copiar","copiar","Copiar"+" "+TipoDireccionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarTipoDireccion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarTipoDireccion,this.jTtoolBarTipoDireccion,
							"ver_form","ver_form","Ver"+" "+TipoDireccionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarTipoDireccion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoDireccion,this.jTtoolBarTipoDireccion,
							"recargar","recargar","Recargar"+" "+TipoDireccionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarTipoDireccion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoDireccion,this.jTtoolBarTipoDireccion,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarTipoDireccion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoDireccion,this.jTtoolBarTipoDireccion,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarTipoDireccion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarTipoDireccion,this.jTtoolBarTipoDireccion,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarTipoDireccion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarTipoDireccion,this.jTtoolBarTipoDireccion,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarTipoDireccion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarTipoDireccion,this.jTtoolBarTipoDireccion,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+TipoDireccionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarTipoDireccion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarTipoDireccion,this.jTtoolBarTipoDireccion,
							"cerrar","cerrar","Salir"+" "+TipoDireccionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarTipoDireccion=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarTipoDireccion;
			
				this.jButtonProcesarInformacionToolBarTipoDireccion=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarTipoDireccion;
				
		//protected JButton jButtonModificarToolBarTipoDireccion;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarTipoDireccion=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuTipoDireccion=new JMenuMe("General");
		this.jmenuArchivoTipoDireccion=new JMenuMe("Archivo");
		this.jmenuAccionesTipoDireccion=new JMenuMe("Acciones");
		this.jmenuDatosTipoDireccion=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoDireccion= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoDireccion.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoDireccion,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoDireccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarTipoDireccion= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarTipoDireccion.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarTipoDireccion,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarTipoDireccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesTipoDireccion= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesTipoDireccion.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesTipoDireccion,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesTipoDireccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosTipoDireccion= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoDireccion.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoDireccion,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoDireccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarTipoDireccion= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarTipoDireccion.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarTipoDireccion,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarTipoDireccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormTipoDireccion= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormTipoDireccion.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormTipoDireccion,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormTipoDireccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaTipoDireccion= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaTipoDireccion.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaTipoDireccion,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaTipoDireccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoDireccion= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoDireccion.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoDireccion,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoDireccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionTipoDireccion= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionTipoDireccion.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionTipoDireccion,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionTipoDireccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionTipoDireccion= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionTipoDireccion.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionTipoDireccion,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresTipoDireccion= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresTipoDireccion.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresTipoDireccion,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresTipoDireccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesTipoDireccion= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesTipoDireccion.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesTipoDireccion,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesTipoDireccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByTipoDireccion= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByTipoDireccion.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByTipoDireccion,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByTipoDireccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoDireccion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoDireccion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoDireccion,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoDireccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByTipoDireccion= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByTipoDireccion.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByTipoDireccion,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByTipoDireccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoDireccion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoDireccion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoDireccion,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoDireccion, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosTipoDireccion= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosTipoDireccion.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosTipoDireccion,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosTipoDireccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoTipoDireccion.add(this.jMenuItemCerrarTipoDireccion);
			
			this.jmenuAccionesTipoDireccion.add(this.jMenuItemNuevoTipoDireccion);
			this.jmenuAccionesTipoDireccion.add(this.jMenuItemNuevoGuardarCambiosTipoDireccion);
			this.jmenuAccionesTipoDireccion.add(this.jMenuItemNuevoRelacionesTipoDireccion);
			this.jmenuAccionesTipoDireccion.add(this.jMenuItemGuardarCambiosTablaTipoDireccion);		
			this.jmenuAccionesTipoDireccion.add(this.jMenuItemDuplicarTipoDireccion);		
			this.jmenuAccionesTipoDireccion.add(this.jMenuItemCopiarTipoDireccion);		
			this.jmenuAccionesTipoDireccion.add(this.jMenuItemVerFormTipoDireccion);		
			
			this.jmenuDatosTipoDireccion.add(this.jMenuItemRecargarInformacionTipoDireccion);				
			this.jmenuDatosTipoDireccion.add(this.jMenuItemAnterioresTipoDireccion);				
			this.jmenuDatosTipoDireccion.add(this.jMenuItemSiguientesTipoDireccion);				
			this.jmenuDatosTipoDireccion.add(this.jMenuItemAbrirOrderByTipoDireccion);				
			this.jmenuDatosTipoDireccion.add(this.jMenuItemMostrarOcultarTipoDireccion);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesTipoDireccion.add(this.jMenuItemGuardarCambiosTipoDireccion);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoTipoDireccion, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesTipoDireccion, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosTipoDireccion, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarTipoDireccion.add(this.jmenuArchivoTipoDireccion);		
			this.jmenuBarTipoDireccion.add(this.jmenuAccionesTipoDireccion);		
			this.jmenuBarTipoDireccion.add(this.jmenuDatosTipoDireccion);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarTipoDireccion);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasTipoDireccion() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		

		this.jTabbedPaneBusquedasTipoDireccion=new JTabbedPane();


		this.jTabbedPaneBusquedasTipoDireccion.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoDireccion.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoDireccion.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasTipoDireccion.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasTipoDireccion.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasTipoDireccion,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleTipoDireccion = new TipoDireccionDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Tipo Direccion DATOS");
			this.jInternalFrameDetalleFormTipoDireccion = new TipoDireccionDetalleFormJInternalFrame(jDesktopPane,this.tipodireccionSessionBean.getConGuardarRelaciones(),this.tipodireccionSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormTipoDireccion = null;//new TipoDireccionDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoDireccion= new GridBagLayout();
		
		
		this.jTableDatosTipoDireccion = new JTableMe();      
		
		String sToolTipTipoDireccion="";
		sToolTipTipoDireccion=TipoDireccionConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoDireccion+="(Cartera.TipoDireccion)";
		}
		
		if(!this.tipodireccionSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoDireccion+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosTipoDireccion.setToolTipText(sToolTipTipoDireccion);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosTipoDireccion);
		this.jTableDatosTipoDireccion.setAutoCreateRowSorter(true);
		this.jTableDatosTipoDireccion.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosTipoDireccion.setRowSelectionAllowed(true);
		this.jTableDatosTipoDireccion.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosTipoDireccion,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoTipoDireccion = new JButtonMe();
		this.jButtonDuplicarTipoDireccion = new JButtonMe();
		this.jButtonCopiarTipoDireccion = new JButtonMe();
		this.jButtonVerFormTipoDireccion = new JButtonMe();
		this.jButtonNuevoRelacionesTipoDireccion = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaTipoDireccion = new JButtonMe();
		this.jButtonCerrarTipoDireccion = new JButtonMe();
		
		this.jScrollPanelDatosTipoDireccion = new JScrollPane();   
        this.jScrollPanelDatosGeneralTipoDireccion = new JScrollPane();
		
				
		
		
		this.jPanelAccionesTipoDireccion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Direccion";
		
		if(!this.tipodireccionSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoDireccion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Direcciones" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoDireccion.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralTipoDireccion.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesTipoDireccion.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoDireccion.setToolTipText("Acciones");
        this.jPanelAccionesTipoDireccion.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoDireccion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoDireccion, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoTipoDireccion=new ReporteDinamicoJInternalFrame(TipoDireccionConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoTipoDireccion();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionTipoDireccion=new ImportacionJInternalFrame(TipoDireccionConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionTipoDireccion();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByTipoDireccion = new JButtonMe();
		
		this.jButtonAbrirOrderByTipoDireccion.setText("Orden");
		this.jButtonAbrirOrderByTipoDireccion.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoDireccion,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoDireccion, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByTipoDireccion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByTipoDireccion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoDireccion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoDireccion,false,this);
			
			//this.cargarOrderByTipoDireccion(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoDireccion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoDireccion,true,this);
			
			//this.cargarOrderByTipoDireccion(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosTipoDireccion.setMinimumSize(new Dimension(400,50));//430
		this.jTableDatosTipoDireccion.setMaximumSize(new Dimension(400,50));//430
		this.jTableDatosTipoDireccion.setPreferredSize(new Dimension(400,50));//430
		
		this.jScrollPanelDatosTipoDireccion.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoDireccion.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoDireccion.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoTipoDireccion.setText("Nuevo");
		this.jButtonDuplicarTipoDireccion.setText("Duplicar");
		this.jButtonCopiarTipoDireccion.setText("Copiar");
		this.jButtonVerFormTipoDireccion.setText("Ver");
		this.jButtonNuevoRelacionesTipoDireccion.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaTipoDireccion.setText("Guardar");
		this.jButtonCerrarTipoDireccion.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoDireccion,"nuevo_button","Nuevo",this.tipodireccionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarTipoDireccion,"duplicar_button","Duplicar",this.tipodireccionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarTipoDireccion,"copiar_button","Copiar",this.tipodireccionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormTipoDireccion,"ver_form","Ver",this.tipodireccionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesTipoDireccion,"nuevorelaciones_button","Nuevo Rel",this.tipodireccionSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoDireccion,"guardarcambiostabla_button","Guardar",this.tipodireccionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoDireccion,"cerrar_button","Salir",this.tipodireccionSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoDireccion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarTipoDireccion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarTipoDireccion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormTipoDireccion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesTipoDireccion, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoDireccion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoDireccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoTipoDireccion.setToolTipText("Nuevo"+" "+TipoDireccionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarTipoDireccion.setToolTipText("Duplicar"+" "+TipoDireccionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarTipoDireccion.setToolTipText("Copiar"+" "+TipoDireccionConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormTipoDireccion.setToolTipText("Ver"+" "+TipoDireccionConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesTipoDireccion.setToolTipText("Nuevo Rel"+" "+TipoDireccionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaTipoDireccion.setToolTipText("Guardar"+" "+TipoDireccionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoDireccion.setToolTipText("Salir"+" "+TipoDireccionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoDireccion";
		inputMap = this.jButtonNuevoTipoDireccion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoDireccion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoDireccion"));
		
		//DUPLICAR
		sMapKey = "DuplicarTipoDireccion";
		inputMap = this.jButtonDuplicarTipoDireccion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarTipoDireccion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarTipoDireccion"));
		
		//COPIAR
		sMapKey = "CopiarTipoDireccion";
		inputMap = this.jButtonCopiarTipoDireccion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarTipoDireccion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarTipoDireccion"));
		
		//VEr FORM
		sMapKey = "VerFormTipoDireccion";
		inputMap = this.jButtonVerFormTipoDireccion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormTipoDireccion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormTipoDireccion"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesTipoDireccion";
		inputMap = this.jButtonNuevoRelacionesTipoDireccion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesTipoDireccion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesTipoDireccion"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarTipoDireccion";
		inputMap = this.jButtonModificarTipoDireccion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarTipoDireccion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarTipoDireccion"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarTipoDireccion";
		inputMap = this.jButtonCerrarTipoDireccion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoDireccion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoDireccion"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoDireccion";
		inputMap = this.jButtonGuardarCambiosTablaTipoDireccion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoDireccion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoDireccion"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesTipoDireccion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesTipoDireccion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionTipoDireccion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1TipoDireccion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2TipoDireccion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3TipoDireccion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4TipoDireccion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5TipoDireccion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesTipoDireccion.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesTipoDireccion.setName("jPanelParametrosReportesTipoDireccion"); 
		
		this.jPanelParametrosReportesAccionesTipoDireccion.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesTipoDireccion.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesTipoDireccion.setName("jPanelParametrosReportesAccionesTipoDireccion"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesTipoDireccion, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesTipoDireccion, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionTipoDireccion = new JButtonMe();
		this.jButtonRecargarInformacionTipoDireccion.setText("Recargar");
		this.jButtonRecargarInformacionTipoDireccion.setToolTipText("Recargar"+" "+TipoDireccionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionTipoDireccion,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionTipoDireccion = new JButtonMe();
		this.jButtonProcesarInformacionTipoDireccion.setText("Procesar");
		this.jButtonProcesarInformacionTipoDireccion.setToolTipText("Procesar"+" "+TipoDireccionConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionTipoDireccion.setVisible(false);
			
		this.jButtonProcesarInformacionTipoDireccion.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoDireccion.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoDireccion.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesTipoDireccion = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoDireccion.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesTipoDireccion.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesTipoDireccion = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoDireccion.setText("TIPO");       
		this.jComboBoxTiposReportesTipoDireccion.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesTipoDireccion = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoDireccion.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesTipoDireccion.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionTipoDireccion = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionTipoDireccion.setText("Paginacion");
		this.jComboBoxTiposPaginacionTipoDireccion.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesTipoDireccion = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesTipoDireccion.setText("Accion");
		this.jComboBoxTiposRelacionesTipoDireccion.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesTipoDireccion = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoDireccion.setText("Accion");
		this.jComboBoxTiposAccionesTipoDireccion.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarTipoDireccion = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarTipoDireccion.setText("Accion");
		this.jComboBoxTiposSeleccionarTipoDireccion.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralTipoDireccion=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralTipoDireccion.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoDireccion.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoDireccion.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesTipoDireccion = new JLabelMe();
		
		this.jLabelAccionesTipoDireccion.setText("Acciones");		
		this.jLabelAccionesTipoDireccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoDireccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoDireccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosTipoDireccion = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosTipoDireccion.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosTipoDireccion.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosTipoDireccion = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosTipoDireccion.setText("Seleccionados");
		this.jCheckBoxSeleccionadosTipoDireccion.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaTipoDireccion = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaTipoDireccion.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaTipoDireccion.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteTipoDireccion = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteTipoDireccion.setText("Graf.");
		this.jCheckBoxConGraficoReporteTipoDireccion.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresTipoDireccion = new JButtonMe();
		//this.jButtonAnterioresTipoDireccion.setText("<<");
        this.jButtonAnterioresTipoDireccion.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresTipoDireccion,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresTipoDireccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesTipoDireccion = new JButtonMe();
		//this.jButtonSiguientesTipoDireccion.setText(">>");
        this.jButtonSiguientesTipoDireccion.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesTipoDireccion,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesTipoDireccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosTipoDireccion = new JButtonMe();
		this.jButtonNuevoGuardarCambiosTipoDireccion.setText("Nue");
        this.jButtonNuevoGuardarCambiosTipoDireccion.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosTipoDireccion,"nuevoguardarcambios_button","Nue",this.tipodireccionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosTipoDireccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosTipoDireccion";
		inputMap = this.jButtonNuevoGuardarCambiosTipoDireccion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosTipoDireccion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosTipoDireccion"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionTipoDireccion";
		inputMap = this.jButtonRecargarInformacionTipoDireccion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionTipoDireccion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionTipoDireccion"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesTipoDireccion";
		inputMap = this.jButtonSiguientesTipoDireccion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesTipoDireccion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesTipoDireccion"));
		
		//ANTERIORES		
		sMapKey = "AnterioresTipoDireccion";
		inputMap = this.jButtonAnterioresTipoDireccion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresTipoDireccion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresTipoDireccion"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasTipoDireccion();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesTipoDireccion.setMinimumSize(new Dimension(this.getWidth(),TipoDireccionBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoDireccionBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoDireccion.setMaximumSize(new Dimension(this.getWidth(),TipoDireccionBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoDireccionBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoDireccion.setPreferredSize(new Dimension(this.getWidth(),TipoDireccionBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoDireccionBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionTipoDireccion = new GridBagLayout();

			this.jPanelPaginacionTipoDireccion.setLayout(gridaBagLayoutPaginacionTipoDireccion);						
			
			this.gridBagConstraintsTipoDireccion = new GridBagConstraints();
			this.gridBagConstraintsTipoDireccion.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsTipoDireccion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDireccion.gridy = 0;
			this.gridBagConstraintsTipoDireccion.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionTipoDireccion.add(this.jButtonAnterioresTipoDireccion, this.gridBagConstraintsTipoDireccion);
					
						
			this.gridBagConstraintsTipoDireccion = new GridBagConstraints();
			this.gridBagConstraintsTipoDireccion.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoDireccion.gridy = 0;
			
			this.jPanelPaginacionTipoDireccion.add(this.jButtonNuevoGuardarCambiosTipoDireccion, this.gridBagConstraintsTipoDireccion);
						
			
			this.gridBagConstraintsTipoDireccion = new GridBagConstraints();
			this.gridBagConstraintsTipoDireccion.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsTipoDireccion.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoDireccion.gridy = 0;
			this.jPanelPaginacionTipoDireccion.add(this.jButtonSiguientesTipoDireccion, this.gridBagConstraintsTipoDireccion);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsTipoDireccion = new GridBagConstraints();
			this.gridBagConstraintsTipoDireccion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDireccion.gridy = 1;
			this.gridBagConstraintsTipoDireccion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoDireccion.add(this.jButtonNuevoTipoDireccion, this.gridBagConstraintsTipoDireccion);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsTipoDireccion = new GridBagConstraints();
				this.gridBagConstraintsTipoDireccion.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoDireccion.gridy = 1;
				this.gridBagConstraintsTipoDireccion.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionTipoDireccion.add(this.jButtonNuevoRelacionesTipoDireccion, this.gridBagConstraintsTipoDireccion);
			}
			
			
			if(!this.tipodireccionSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsTipoDireccion = new GridBagConstraints();
				this.gridBagConstraintsTipoDireccion.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoDireccion.gridy = 1;
				this.gridBagConstraintsTipoDireccion.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionTipoDireccion.add(this.jButtonGuardarCambiosTablaTipoDireccion, this.gridBagConstraintsTipoDireccion);
			}
			
			
			
			this.gridBagConstraintsTipoDireccion = new GridBagConstraints();
			this.gridBagConstraintsTipoDireccion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDireccion.gridy = 1;
			this.gridBagConstraintsTipoDireccion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoDireccion.add(this.jButtonDuplicarTipoDireccion, this.gridBagConstraintsTipoDireccion);
			
			this.gridBagConstraintsTipoDireccion = new GridBagConstraints();
			this.gridBagConstraintsTipoDireccion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDireccion.gridy = 1;
			this.gridBagConstraintsTipoDireccion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoDireccion.add(this.jButtonCopiarTipoDireccion, this.gridBagConstraintsTipoDireccion);
		
			this.gridBagConstraintsTipoDireccion = new GridBagConstraints();
			this.gridBagConstraintsTipoDireccion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDireccion.gridy = 1;
			this.gridBagConstraintsTipoDireccion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoDireccion.add(this.jButtonVerFormTipoDireccion, this.gridBagConstraintsTipoDireccion);
		
			this.gridBagConstraintsTipoDireccion = new GridBagConstraints();
			this.gridBagConstraintsTipoDireccion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDireccion.gridy = 1;
			this.gridBagConstraintsTipoDireccion.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionTipoDireccion.add(this.jButtonCerrarTipoDireccion, this.gridBagConstraintsTipoDireccion);
		
		
		
		this.jButtonRecargarInformacionTipoDireccion.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoDireccion.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoDireccion.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionTipoDireccion, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesTipoDireccion.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoDireccion.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoDireccion.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesTipoDireccion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesTipoDireccion.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoDireccion.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoDireccion.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesTipoDireccion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesTipoDireccion.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoDireccion.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoDireccion.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesTipoDireccion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionTipoDireccion.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoDireccion.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoDireccion.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionTipoDireccion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesTipoDireccion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoDireccion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoDireccion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesTipoDireccion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesTipoDireccion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoDireccion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoDireccion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoDireccion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarTipoDireccion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoDireccion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoDireccion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarTipoDireccion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaTipoDireccion.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoDireccion.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoDireccion.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaTipoDireccion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteTipoDireccion.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoDireccion.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoDireccion.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteTipoDireccion, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosTipoDireccion.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoDireccion.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoDireccion.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosTipoDireccion, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosTipoDireccion.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoDireccion.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoDireccion.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosTipoDireccion, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesTipoDireccion = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesTipoDireccion = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1TipoDireccion = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2TipoDireccion = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3TipoDireccion = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4TipoDireccion = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesTipoDireccion.setLayout(gridaBagParametrosReportesTipoDireccion);
			this.jPanelParametrosReportesAccionesTipoDireccion.setLayout(gridaBagParametrosReportesAccionesTipoDireccion);
			
			
			this.jPanelParametrosAuxiliar1TipoDireccion.setLayout(gridaBagParametrosAuxiliar1TipoDireccion);
			this.jPanelParametrosAuxiliar2TipoDireccion.setLayout(gridaBagParametrosAuxiliar2TipoDireccion);
			this.jPanelParametrosAuxiliar3TipoDireccion.setLayout(gridaBagParametrosAuxiliar3TipoDireccion);
			this.jPanelParametrosAuxiliar4TipoDireccion.setLayout(gridaBagParametrosAuxiliar4TipoDireccion);
			//this.jPanelParametrosAuxiliar5TipoDireccion.setLayout(gridaBagParametrosAuxiliar2TipoDireccion);			
			
			
			
			
			this.gridBagConstraintsTipoDireccion = new GridBagConstraints();
			this.gridBagConstraintsTipoDireccion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDireccion.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoDireccion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoDireccion.add(this.jButtonRecargarInformacionTipoDireccion, this.gridBagConstraintsTipoDireccion);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsTipoDireccion = new GridBagConstraints();
			this.gridBagConstraintsTipoDireccion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoDireccion.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoDireccion.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoDireccion.add(this.jComboBoxTiposPaginacionTipoDireccion, this.gridBagConstraintsTipoDireccion);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsTipoDireccion = new GridBagConstraints();
			this.gridBagConstraintsTipoDireccion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoDireccion.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoDireccion.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoDireccion.add(this.jCheckBoxConAltoMaximoTablaTipoDireccion, this.gridBagConstraintsTipoDireccion);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsTipoDireccion = new GridBagConstraints();
			this.gridBagConstraintsTipoDireccion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoDireccion.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoDireccion.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoDireccion.add(this.jComboBoxTiposArchivosReportesTipoDireccion, this.gridBagConstraintsTipoDireccion);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsTipoDireccion = new GridBagConstraints();
			this.gridBagConstraintsTipoDireccion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoDireccion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoDireccion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoDireccion.add(this.jPanelParametrosAuxiliar1TipoDireccion, this.gridBagConstraintsTipoDireccion);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsTipoDireccion = new GridBagConstraints();
			this.gridBagConstraintsTipoDireccion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoDireccion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDireccion.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoDireccion.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4TipoDireccion.add(this.jComboBoxTiposReportesTipoDireccion, this.gridBagConstraintsTipoDireccion);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsTipoDireccion = new GridBagConstraints();
			this.gridBagConstraintsTipoDireccion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoDireccion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoDireccion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoDireccion.add(this.jPanelParametrosAuxiliar4TipoDireccion, this.gridBagConstraintsTipoDireccion);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsTipoDireccion = new GridBagConstraints();
			this.gridBagConstraintsTipoDireccion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoDireccion.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoDireccion.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoDireccion.add(this.jComboBoxTiposReportesTipoDireccion, this.gridBagConstraintsTipoDireccion);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsTipoDireccion = new GridBagConstraints();
			this.gridBagConstraintsTipoDireccion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoDireccion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoDireccion.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoDireccion.add(this.jCheckBoxGenerarReporteTipoDireccion, this.gridBagConstraintsTipoDireccion);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsTipoDireccion = new GridBagConstraints();
			this.gridBagConstraintsTipoDireccion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoDireccion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoDireccion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoDireccion.add(this.jPanelParametrosAuxiliar2TipoDireccion, this.gridBagConstraintsTipoDireccion);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsTipoDireccion = new GridBagConstraints();
			this.gridBagConstraintsTipoDireccion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDireccion.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoDireccion.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoDireccion.add(this.jLabelAccionesTipoDireccion, this.gridBagConstraintsTipoDireccion);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsTipoDireccion = new GridBagConstraints();
				this.gridBagConstraintsTipoDireccion.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsTipoDireccion.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsTipoDireccion.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesTipoDireccion.add(this.jButtonAbrirOrderByTipoDireccion, this.gridBagConstraintsTipoDireccion);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsTipoDireccion = new GridBagConstraints();
			this.gridBagConstraintsTipoDireccion.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsTipoDireccion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoDireccion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoDireccion.add(this.jComboBoxTiposSeleccionarTipoDireccion, this.gridBagConstraintsTipoDireccion);			
			
			
			/*
			this.gridBagConstraintsTipoDireccion = new GridBagConstraints();
			this.gridBagConstraintsTipoDireccion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDireccion.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoDireccion.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoDireccion.add(this.jCheckBoxSeleccionarTodosTipoDireccion, this.gridBagConstraintsTipoDireccion);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsTipoDireccion = new GridBagConstraints();
			this.gridBagConstraintsTipoDireccion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoDireccion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDireccion.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoDireccion.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoDireccion.add(this.jCheckBoxSeleccionarTodosTipoDireccion, this.gridBagConstraintsTipoDireccion);															
				
			this.gridBagConstraintsTipoDireccion = new GridBagConstraints();
			this.gridBagConstraintsTipoDireccion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoDireccion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDireccion.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoDireccion.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoDireccion.add(this.jCheckBoxSeleccionadosTipoDireccion, this.gridBagConstraintsTipoDireccion);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsTipoDireccion = new GridBagConstraints();
			this.gridBagConstraintsTipoDireccion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoDireccion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoDireccion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoDireccion.add(this.jPanelParametrosAuxiliar3TipoDireccion, this.gridBagConstraintsTipoDireccion);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsTipoDireccion = new GridBagConstraints();
			this.gridBagConstraintsTipoDireccion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoDireccion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoDireccion.add(this.jComboBoxTiposRelacionesTipoDireccion, this.gridBagConstraintsTipoDireccion);
				
			this.gridBagConstraintsTipoDireccion = new GridBagConstraints();
			this.gridBagConstraintsTipoDireccion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoDireccion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoDireccion.add(this.jComboBoxTiposAccionesTipoDireccion, this.gridBagConstraintsTipoDireccion);
	
				
			this.gridBagConstraintsTipoDireccion = new GridBagConstraints();
			this.gridBagConstraintsTipoDireccion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoDireccion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoDireccion.add(this.jTextFieldValorCampoGeneralTipoDireccion, this.gridBagConstraintsTipoDireccion);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosTipoDireccion = new GridBagLayout();

			this.jScrollPanelDatosTipoDireccion.setLayout(gridaBagLayoutDatosTipoDireccion);
			
			this.gridBagConstraintsTipoDireccion = new GridBagConstraints();
			this.gridBagConstraintsTipoDireccion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDireccion.gridy = 0;
			this.gridBagConstraintsTipoDireccion.gridx = 0;
			
			this.jScrollPanelDatosTipoDireccion.add(this.jTableDatosTipoDireccion, this.gridBagConstraintsTipoDireccion);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosTipoDireccion.setViewportView(this.jTableDatosTipoDireccion);
		this.jTableDatosTipoDireccion.setFillsViewportHeight(true);
		this.jTableDatosTipoDireccion.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesTipoDireccion= new GridBagLayout();
		this.jPanelAccionesTipoDireccion.setLayout(gridaBagLayoutAccionesTipoDireccion);
		
		
		/*	
		this.gridBagConstraintsTipoDireccion = new GridBagConstraints();
		this.gridBagConstraintsTipoDireccion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoDireccion.gridy = 0;
		this.gridBagConstraintsTipoDireccion.gridx = 0;
			
		this.jPanelAccionesTipoDireccion.add(this.jButtonNuevoTipoDireccion, this.gridBagConstraintsTipoDireccion);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoDireccion = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoDireccion);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipodireccionSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoDireccion = new GridBagConstraints();						
			this.gridBagConstraintsTipoDireccion.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoDireccion.gridx = 0;		
			//this.gridBagConstraintsTipoDireccion.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDireccion.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoDireccion.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarTipoDireccion, this.gridBagConstraintsTipoDireccion);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsTipoDireccion = new GridBagConstraints();
		this.gridBagConstraintsTipoDireccion.gridy = iGridyPrincipal++;
		this.gridBagConstraintsTipoDireccion.gridx = 0;		
		//this.gridBagConstraintsTipoDireccion.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoDireccion.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsTipoDireccion.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsTipoDireccion);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsTipoDireccion = new GridBagConstraints();
		this.gridBagConstraintsTipoDireccion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoDireccion.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesTipoDireccion, this.gridBagConstraintsTipoDireccion);								
		
		
		/*
		this.gridBagConstraintsTipoDireccion = new GridBagConstraints();
		this.gridBagConstraintsTipoDireccion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoDireccion.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesTipoDireccion, this.gridBagConstraintsTipoDireccion);
		*/		
		
		this.gridBagConstraintsTipoDireccion = new GridBagConstraints();
		this.gridBagConstraintsTipoDireccion.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoDireccion.gridx =0;
		this.gridBagConstraintsTipoDireccion.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoDireccion.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoDireccion, this.gridBagConstraintsTipoDireccion);
				
		
		this.gridBagConstraintsTipoDireccion = new GridBagConstraints();
		this.gridBagConstraintsTipoDireccion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoDireccion.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionTipoDireccion, this.gridBagConstraintsTipoDireccion);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(TipoDireccionJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosTipoDireccion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoDireccion = new GridBagLayout();
			this.jPanelBusquedasParametrosTipoDireccion.setLayout(gridaBagLayoutBusquedasParametrosTipoDireccion);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralTipoDireccion=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoDireccion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoDireccion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoDireccion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoDireccion = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsTipoDireccion = new GridBagConstraints();
		this.gridBagConstraintsTipoDireccion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoDireccion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoDireccion, this.gridBagConstraintsTipoDireccion);
			
			
		this.gridBagConstraintsTipoDireccion = new GridBagConstraints();
		this.gridBagConstraintsTipoDireccion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoDireccion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoDireccion, this.gridBagConstraintsTipoDireccion);
		
			
		this.gridBagConstraintsTipoDireccion = new GridBagConstraints();
		this.gridBagConstraintsTipoDireccion.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoDireccion.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoDireccion, this.gridBagConstraintsTipoDireccion);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralTipoDireccion;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoTipoDireccion() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoTipoDireccion = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoTipoDireccion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoTipoDireccion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoTipoDireccion.setName("jPanelReporteDinamicoTipoDireccion"); 
		
		this.jPanelReporteDinamicoTipoDireccion.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoDireccion.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoDireccion.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoTipoDireccion.setLayout(gridaBagLayoutReporteDinamicoTipoDireccion);
		
		
		this.jInternalFrameReporteDinamicoTipoDireccion= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoTipoDireccion = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoDireccion= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoTipoDireccion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoTipoDireccion.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoTipoDireccion.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoTipoDireccion.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoTipoDireccion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoTipoDireccion.setResizable(true);
	    this.jInternalFrameReporteDinamicoTipoDireccion.setClosable(true);
	    this.jInternalFrameReporteDinamicoTipoDireccion.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoTipoDireccion.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoDireccion.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoDireccion.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoTipoDireccion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Direcciones"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteTipoDireccion = new JLabelMe();

		this.jLabelColumnasSelectReporteTipoDireccion.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteTipoDireccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoDireccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoDireccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoDireccion = new GridBagConstraints();
		this.gridBagConstraintsTipoDireccion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoDireccion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoDireccion.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoDireccion.add(this.jLabelColumnasSelectReporteTipoDireccion, this.gridBagConstraintsTipoDireccion);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteTipoDireccion = new JList<Reporte>();
		this.jListColumnasSelectReporteTipoDireccion.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteTipoDireccion.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteTipoDireccion.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoDireccion.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoDireccion.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteTipoDireccion=new JScrollPane(this.jListColumnasSelectReporteTipoDireccion);
			
			this.jScrollColumnasSelectReporteTipoDireccion.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoDireccion.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoDireccion.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteTipoDireccion.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTipoDireccion = new GridBagConstraints();
		this.gridBagConstraintsTipoDireccion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoDireccion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoDireccion.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoDireccion.add(this.jListColumnasSelectReporteTipoDireccion, this.gridBagConstraintsTipoDireccion);
		this.jPanelReporteDinamicoTipoDireccion.add(this.jScrollColumnasSelectReporteTipoDireccion, this.gridBagConstraintsTipoDireccion);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteTipoDireccion = new JLabelMe();

		this.jLabelRelacionesSelectReporteTipoDireccion.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteTipoDireccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoDireccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoDireccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsTipoDireccion = new GridBagConstraints();
		this.gridBagConstraintsTipoDireccion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoDireccion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoDireccion.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoDireccion.add(this.jLabelRelacionesSelectReporteTipoDireccion, this.gridBagConstraintsTipoDireccion);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteTipoDireccion = new JList<Reporte>();
		this.jListRelacionesSelectReporteTipoDireccion.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteTipoDireccion.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteTipoDireccion.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoDireccion.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoDireccion.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteTipoDireccion=new JScrollPane(this.jListRelacionesSelectReporteTipoDireccion);
			
			this.jScrollRelacionesSelectReporteTipoDireccion.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoDireccion.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoDireccion.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteTipoDireccion.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsTipoDireccion = new GridBagConstraints();
		this.gridBagConstraintsTipoDireccion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoDireccion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoDireccion.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoDireccion.add(this.jListRelacionesSelectReporteTipoDireccion, this.gridBagConstraintsTipoDireccion);
		this.jPanelReporteDinamicoTipoDireccion.add(this.jScrollRelacionesSelectReporteTipoDireccion, this.gridBagConstraintsTipoDireccion);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoTipoDireccion = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoTipoDireccion = new JComboBoxMe();
		this.jListColumnasValoresGraficoTipoDireccion = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoTipoDireccion = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoTipoDireccion.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoTipoDireccion.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoDireccion.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoDireccion.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoTipoDireccion, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoTipoDireccion = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoTipoDireccion.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoTipoDireccion.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoDireccion.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoDireccion.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoTipoDireccion, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoTipoDireccion = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoTipoDireccion.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoTipoDireccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoDireccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoDireccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoDireccion = new GridBagConstraints();
		this.gridBagConstraintsTipoDireccion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoDireccion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoDireccion.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoDireccion.add(this.jLabelGenerarExcelReporteDinamicoTipoDireccion, this.gridBagConstraintsTipoDireccion);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoTipoDireccion = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoTipoDireccion.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoTipoDireccion,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoTipoDireccion.setToolTipText("Generar EXCEL"+" "+TipoDireccionConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsTipoDireccion = new GridBagConstraints();
		//this.gridBagConstraintsTipoDireccion.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsTipoDireccion.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsTipoDireccion.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoTipoDireccion.add(this.jButtonGenerarExcelReporteDinamicoTipoDireccion, this.gridBagConstraintsTipoDireccion);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsTipoDireccion = new GridBagConstraints();
		this.gridBagConstraintsTipoDireccion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoDireccion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoDireccion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoDireccion.add(this.jComboBoxTiposReportesDinamicoTipoDireccion, this.gridBagConstraintsTipoDireccion);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoTipoDireccion = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoTipoDireccion.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoTipoDireccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoDireccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoDireccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoDireccion = new GridBagConstraints();
		this.gridBagConstraintsTipoDireccion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoDireccion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoDireccion.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoDireccion.add(this.jLabelTiposArchivoReporteDinamicoTipoDireccion, this.gridBagConstraintsTipoDireccion);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsTipoDireccion = new GridBagConstraints();
		this.gridBagConstraintsTipoDireccion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoDireccion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoDireccion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoDireccion.add(this.jComboBoxTiposArchivosReportesDinamicoTipoDireccion, this.gridBagConstraintsTipoDireccion);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoTipoDireccion = new JButtonMe();
		this.jButtonGenerarReporteDinamicoTipoDireccion.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoTipoDireccion,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoTipoDireccion.setToolTipText("Generar"+" "+TipoDireccionConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsTipoDireccion = new GridBagConstraints();
		this.gridBagConstraintsTipoDireccion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoDireccion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoDireccion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoDireccion.add(this.jButtonGenerarReporteDinamicoTipoDireccion, this.gridBagConstraintsTipoDireccion);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoTipoDireccion = new JButtonMe();
		this.jButtonCerrarReporteDinamicoTipoDireccion.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoTipoDireccion,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoTipoDireccion.setToolTipText("Cancelar"+" "+TipoDireccionConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoDireccion = new GridBagConstraints();
		this.gridBagConstraintsTipoDireccion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoDireccion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoDireccion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoDireccion.add(this.jButtonCerrarReporteDinamicoTipoDireccion, this.gridBagConstraintsTipoDireccion);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalTipoDireccion = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoTipoDireccion= new JScrollPane(jPanelReporteDinamicoTipoDireccion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoTipoDireccion.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoDireccion.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoDireccion.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoTipoDireccion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Direcciones"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoDireccion = new GridBagConstraints();
		this.gridBagConstraintsTipoDireccion.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsTipoDireccion.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsTipoDireccion.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoTipoDireccion.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoTipoDireccion.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalTipoDireccion);
		this.jInternalFrameReporteDinamicoTipoDireccion.getContentPane().add(this.jScrollPanelReporteDinamicoTipoDireccion, this.gridBagConstraintsTipoDireccion);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionTipoDireccion() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionTipoDireccion = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionTipoDireccion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionTipoDireccion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionTipoDireccion.setName("jPanelImportacionTipoDireccion"); 
		
		this.jPanelImportacionTipoDireccion.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoDireccion.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoDireccion.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionTipoDireccion.setLayout(gridaBagLayoutImportacionTipoDireccion);
		
		
		this.jInternalFrameImportacionTipoDireccion= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionTipoDireccion= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionTipoDireccion = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoDireccion= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionTipoDireccion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoDireccion.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoDireccion.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionTipoDireccion.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoDireccion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoDireccion.setResizable(true);
	    this.jInternalFrameImportacionTipoDireccion.setClosable(true);
	    this.jInternalFrameImportacionTipoDireccion.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionTipoDireccion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoDireccion.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoDireccion.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionTipoDireccion.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoDireccion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoDireccion.setResizable(true);
	    this.jInternalFrameImportacionTipoDireccion.setClosable(true);
	    this.jInternalFrameImportacionTipoDireccion.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionTipoDireccion.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoDireccion.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoDireccion.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionTipoDireccion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Direcciones"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionTipoDireccion = new JLabelMe();

		this.jLabelArchivoImportacionTipoDireccion.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionTipoDireccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoDireccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoDireccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoDireccion = new GridBagConstraints();
		this.gridBagConstraintsTipoDireccion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoDireccion.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoDireccion.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoDireccion.add(this.jLabelArchivoImportacionTipoDireccion, this.gridBagConstraintsTipoDireccion);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionTipoDireccion = new JFileChooser();		
		this.jFileChooserImportacionTipoDireccion.setToolTipText("ESCOGER ARCHIVO"+" "+TipoDireccionConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionTipoDireccion = new JButtonMe();
		this.jButtonAbrirImportacionTipoDireccion.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionTipoDireccion,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionTipoDireccion.setToolTipText("Generar"+" "+TipoDireccionConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsTipoDireccion = new GridBagConstraints();
		this.gridBagConstraintsTipoDireccion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoDireccion.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoDireccion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoDireccion.add(this.jButtonAbrirImportacionTipoDireccion, this.gridBagConstraintsTipoDireccion);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionTipoDireccion = new JLabelMe();

		this.jLabelPathArchivoImportacionTipoDireccion.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionTipoDireccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoDireccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoDireccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoDireccion = new GridBagConstraints();
		this.gridBagConstraintsTipoDireccion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoDireccion.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoDireccion.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoDireccion.add(this.jLabelPathArchivoImportacionTipoDireccion, this.gridBagConstraintsTipoDireccion);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionTipoDireccion=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionTipoDireccion.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoDireccion.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoDireccion.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsTipoDireccion = new GridBagConstraints();
		this.gridBagConstraintsTipoDireccion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoDireccion.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoDireccion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoDireccion.add(this.jTextFieldPathArchivoImportacionTipoDireccion, this.gridBagConstraintsTipoDireccion);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionTipoDireccion = new JButtonMe();
		this.jButtonGenerarImportacionTipoDireccion.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionTipoDireccion,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionTipoDireccion.setToolTipText("Generar"+" "+TipoDireccionConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsTipoDireccion = new GridBagConstraints();
		this.gridBagConstraintsTipoDireccion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoDireccion.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoDireccion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoDireccion.add(this.jButtonGenerarImportacionTipoDireccion, this.gridBagConstraintsTipoDireccion);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionTipoDireccion = new JButtonMe();
		this.jButtonCerrarImportacionTipoDireccion.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionTipoDireccion,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionTipoDireccion.setToolTipText("Cancelar"+" "+TipoDireccionConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoDireccion = new GridBagConstraints();
		this.gridBagConstraintsTipoDireccion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoDireccion.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoDireccion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoDireccion.add(this.jButtonCerrarImportacionTipoDireccion, this.gridBagConstraintsTipoDireccion);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalTipoDireccion = new GridBagLayout();
		
		this.jScrollPanelImportacionTipoDireccion= new JScrollPane(jPanelImportacionTipoDireccion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsTipoDireccion = new GridBagConstraints();
		this.gridBagConstraintsTipoDireccion.gridy =iPosYImportacion;
		this.gridBagConstraintsTipoDireccion.gridx =iPosXImportacion;
		this.gridBagConstraintsTipoDireccion.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionTipoDireccion.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionTipoDireccion.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalTipoDireccion);
		this.jInternalFrameImportacionTipoDireccion.getContentPane().add(this.jScrollPanelImportacionTipoDireccion, this.gridBagConstraintsTipoDireccion);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByTipoDireccion(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByTipoDireccion = new JButtonMe();
			this.jButtonAbrirOrderByTipoDireccion.setText("Orden");
			this.jButtonAbrirOrderByTipoDireccion.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoDireccion,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoDireccion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByTipoDireccion";
			inputMap = this.jButtonAbrirOrderByTipoDireccion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByTipoDireccion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByTipoDireccion"));
		
		
			GridBagLayout gridaBagLayoutOrderByTipoDireccion = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByTipoDireccion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByTipoDireccion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByTipoDireccion.setName("jPanelOrderByTipoDireccion"); 
			
			this.jPanelOrderByTipoDireccion.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoDireccion.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoDireccion.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByTipoDireccion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByTipoDireccion.setLayout(gridaBagLayoutOrderByTipoDireccion);
			
			
			this.jTableDatosTipoDireccionOrderBy = new JTableMe();        
			this.jTableDatosTipoDireccionOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosTipoDireccionOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosTipoDireccionOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosTipoDireccionOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosTipoDireccionOrderBy.setViewportView(this.jTableDatosTipoDireccionOrderBy);
			this.jTableDatosTipoDireccionOrderBy.setFillsViewportHeight(true);
			this.jTableDatosTipoDireccionOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByTipoDireccion= new OrderByJInternalFrame();
			this.jInternalFrameOrderByTipoDireccion= new OrderByJInternalFrame();
			this.jScrollPanelOrderByTipoDireccion = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteTipoDireccion= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByTipoDireccion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByTipoDireccion.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByTipoDireccion.setTitle("Orden");
			this.jInternalFrameOrderByTipoDireccion.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByTipoDireccion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByTipoDireccion.setResizable(true);
			this.jInternalFrameOrderByTipoDireccion.setClosable(true);
			this.jInternalFrameOrderByTipoDireccion.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByTipoDireccion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByTipoDireccion.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoDireccion.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoDireccion.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByTipoDireccion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByTipoDireccion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Direcciones"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsTipoDireccion = new GridBagConstraints();
			this.gridBagConstraintsTipoDireccion.gridy =iPosYOrderBy++;
			this.gridBagConstraintsTipoDireccion.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoDireccion.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsTipoDireccion.ipady =150;
				
			this.jPanelOrderByTipoDireccion.add(jScrollPanelDatosTipoDireccionOrderBy, this.gridBagConstraintsTipoDireccion);//this.jTableDatosTipoDireccionTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByTipoDireccion = new JButtonMe();
			this.jButtonCerrarOrderByTipoDireccion.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByTipoDireccion,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByTipoDireccion.setToolTipText("Cancelar"+" "+TipoDireccionConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByTipoDireccion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsTipoDireccion = new GridBagConstraints();
			this.gridBagConstraintsTipoDireccion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDireccion.gridy = iPosYOrderBy++;
			this.gridBagConstraintsTipoDireccion.gridx = iPosXOrderBy;
									
			this.jPanelOrderByTipoDireccion.add(this.jButtonCerrarOrderByTipoDireccion, this.gridBagConstraintsTipoDireccion);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalTipoDireccion = new GridBagLayout();
			
			this.jScrollPanelOrderByTipoDireccion= new JScrollPane(jPanelOrderByTipoDireccion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsTipoDireccion = new GridBagConstraints();
			this.gridBagConstraintsTipoDireccion.gridy =iPosYOrderBy;
			this.gridBagConstraintsTipoDireccion.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoDireccion.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByTipoDireccion.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByTipoDireccion.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalTipoDireccion);
			
			this.jInternalFrameOrderByTipoDireccion.getContentPane().add(this.jScrollPanelOrderByTipoDireccion, this.gridBagConstraintsTipoDireccion);			
		
		} else {
			this.jButtonAbrirOrderByTipoDireccion = new JButtonMe();
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
			&& this.tipodireccionSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosTipoDireccion.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosTipoDireccion.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosTipoDireccion.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosTipoDireccion.getRowHeight();//TipoDireccionConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.tipodireccionSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > TipoDireccionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoDireccion.isSelected()) {
					iHeightTable=TipoDireccionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoDireccionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoDireccionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > TipoDireccionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoDireccion.isSelected()) {
					iHeightTable=TipoDireccionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoDireccionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoDireccionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosTipoDireccion.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoDireccion.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoDireccion.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosTipoDireccion.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoDireccion.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoDireccion.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByTipoDireccion!=null && this.jInternalFrameOrderByTipoDireccion.getjTableDatosOrderBy()!=null) {
			//if(!this.tipodireccionSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByTipoDireccion.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByTipoDireccion.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByTipoDireccion.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByTipoDireccion.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByTipoDireccion.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByTipoDireccion.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByTipoDireccion.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosTipoDireccion.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoDireccion.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoDireccion.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=tipodireccionLogic.getTipoDireccions().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipodireccions.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<TipoDireccion> TraerTipoDireccionBeans(List<TipoDireccion> tipodireccions,ArrayList<Classe> classes)throws Exception {
		try {
			for(TipoDireccion tipodireccion:tipodireccions) {
					
				if(!(TipoDireccionConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || TipoDireccionConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					tipodireccion.setsDetalleGeneralEntityReporte(TipoDireccionConstantesFunciones.getTipoDireccionDescripcion(tipodireccion));
										
						
					
					

					if(tipodireccion.getDireccions()!=null && Funciones.existeClass(classes,Direccion.class)) {
						try{tipodireccion.setdireccionsDescripcionReporte(new JRBeanCollectionDataSource(DireccionJInternalFrame.TraerDireccionBeans(tipodireccion.getDireccions(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//tipodireccion.setsDetalleGeneralEntityReporte(tipodireccion.getsDetalleGeneralEntityReporte());
										
				}
				
				//tipodireccionbeans.add(tipodireccionbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return tipodireccions;
    }
	//PARA REPORTES FIN
}
