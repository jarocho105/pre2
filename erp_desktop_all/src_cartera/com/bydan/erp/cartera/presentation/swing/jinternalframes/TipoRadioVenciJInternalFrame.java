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



import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;





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
import com.bydan.erp.cartera.util.TipoRadioVenciConstantesFunciones;

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
public class TipoRadioVenciJInternalFrame extends TipoRadioVenciBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarTipoRadioVenci;
	
	protected JMenuBar jmenuBarTipoRadioVenci;
	
	protected JMenu jmenuTipoRadioVenci;
	protected JMenu jmenuDatosTipoRadioVenci;
	protected JMenu jmenuArchivoTipoRadioVenci;
	protected JMenu jmenuAccionesTipoRadioVenci;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosTipoRadioVenci = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoRadioVenci;	
	protected GridBagConstraints gridBagConstraintsTipoRadioVenci;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public TipoRadioVenciDetalleFormJInternalFrame jInternalFrameDetalleFormTipoRadioVenci;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoTipoRadioVenci;	
	protected ImportacionJInternalFrame jInternalFrameImportacionTipoRadioVenci;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public TipoRadioVenciSessionBean tiporadiovenciSessionBean;
		
	
	
	
	//protected JDesktopPane jDesktopPane;
	public List<TipoRadioVenci> tiporadiovencis;		
	public List<TipoRadioVenci> tiporadiovencisEliminados;	
	public List<TipoRadioVenci> tiporadiovencisAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByTipoRadioVenci;		
	protected JButton jButtonAbrirOrderByTipoRadioVenci;
	
	
	//protected JPanel jPanelOrderByTipoRadioVenci;
	//public JScrollPane jScrollPanelOrderByTipoRadioVenci;	
	//protected JButton jButtonCerrarOrderByTipoRadioVenci;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public TipoRadioVenciLogic tiporadiovenciLogic;
	
	
	
	public JScrollPane jScrollPanelDatosTipoRadioVenci;
	public JScrollPane jScrollPanelDatosEdicionTipoRadioVenci;
	public JScrollPane jScrollPanelDatosGeneralTipoRadioVenci;
    
	
	
	//public JScrollPane jScrollPanelDatosTipoRadioVenciOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoTipoRadioVenci;
	//public JScrollPane jScrollPanelImportacionTipoRadioVenci;
	
	
	
	protected JPanel jPanelAccionesTipoRadioVenci;
	
    protected JPanel jPanelPaginacionTipoRadioVenci;
    protected JPanel jPanelParametrosReportesTipoRadioVenci;
	protected JPanel jPanelParametrosReportesAccionesTipoRadioVenci;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1TipoRadioVenci;
	protected JPanel jPanelParametrosAuxiliar2TipoRadioVenci;
	protected JPanel jPanelParametrosAuxiliar3TipoRadioVenci;
	protected JPanel jPanelParametrosAuxiliar4TipoRadioVenci;
	//protected JPanel jPanelParametrosAuxiliar5TipoRadioVenci;
	
	
	
	//protected JPanel jPanelReporteDinamicoTipoRadioVenci;
	//protected JPanel jPanelImportacionTipoRadioVenci;
	
	
	public JTable jTableDatosTipoRadioVenci;
	
	
	
	//public JTable jTableDatosTipoRadioVenciOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoTipoRadioVenci;
	protected JButton jButtonDuplicarTipoRadioVenci;
	protected JButton jButtonCopiarTipoRadioVenci;
	protected JButton jButtonVerFormTipoRadioVenci;
	protected JButton jButtonNuevoRelacionesTipoRadioVenci;
	protected JButton jButtonModificarTipoRadioVenci;
	
    protected JButton jButtonGuardarCambiosTablaTipoRadioVenci;
	protected JButton jButtonCerrarTipoRadioVenci;
	
	
	protected JButton jButtonRecargarInformacionTipoRadioVenci;
	protected JButton jButtonProcesarInformacionTipoRadioVenci;
	
	
	protected JButton jButtonAnterioresTipoRadioVenci;
	protected JButton jButtonSiguientesTipoRadioVenci;
	protected JButton jButtonNuevoGuardarCambiosTipoRadioVenci;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoTipoRadioVenci;
	//protected JButton jButtonCerrarReporteDinamicoTipoRadioVenci;
	//protected JButton jButtonGenerarExcelReporteDinamicoTipoRadioVenci;	
	
	
	
	//protected JButton jButtonAbrirImportacionTipoRadioVenci;
	//protected JButton jButtonGenerarImportacionTipoRadioVenci;
	//protected JButton jButtonCerrarImportacionTipoRadioVenci;
	//protected JFileChooser jFileChooserImportacionTipoRadioVenci;
	//protected File fileImportacionTipoRadioVenci;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoRadioVenci;
	protected JButton jButtonDuplicarToolBarTipoRadioVenci;
	protected JButton jButtonNuevoRelacionesToolBarTipoRadioVenci;
	
	
	public JButton jButtonGuardarCambiosToolBarTipoRadioVenci;
	protected JButton jButtonCopiarToolBarTipoRadioVenci;
	protected JButton jButtonVerFormToolBarTipoRadioVenci;
	public JButton jButtonGuardarCambiosTablaToolBarTipoRadioVenci;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoRadioVenci;
	protected JButton jButtonCerrarToolBarTipoRadioVenci;
	
	protected JButton jButtonRecargarInformacionToolBarTipoRadioVenci;
	protected JButton jButtonProcesarInformacionToolBarTipoRadioVenci;
	protected JButton jButtonAnterioresToolBarTipoRadioVenci;
	protected JButton jButtonSiguientesToolBarTipoRadioVenci;
	protected JButton jButtonNuevoGuardarCambiosToolBarTipoRadioVenci;
	protected JButton jButtonAbrirOrderByToolBarTipoRadioVenci;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoRadioVenci;
	protected JMenuItem jMenuItemDuplicarTipoRadioVenci;
	protected JMenuItem jMenuItemNuevoRelacionesTipoRadioVenci;
	
	
	protected JMenuItem jMenuItemGuardarCambiosTipoRadioVenci;
	protected JMenuItem jMenuItemCopiarTipoRadioVenci;
	protected JMenuItem jMenuItemVerFormTipoRadioVenci;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoRadioVenci;
	protected JMenuItem jMenuItemCerrarTipoRadioVenci;
	protected JMenuItem jMenuItemDetalleCerrarTipoRadioVenci;
	protected JMenuItem jMenuItemDetalleAbrirOrderByTipoRadioVenci;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoRadioVenci;
	
	protected JMenuItem jMenuItemRecargarInformacionTipoRadioVenci;
	protected JMenuItem jMenuItemProcesarInformacionTipoRadioVenci;
	protected JMenuItem jMenuItemAnterioresTipoRadioVenci;
	protected JMenuItem jMenuItemSiguientesTipoRadioVenci;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoRadioVenci;
	protected JMenuItem jMenuItemAbrirOrderByTipoRadioVenci;
	protected JMenuItem jMenuItemMostrarOcultarTipoRadioVenci;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoRadioVenci;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosTipoRadioVenci;
	protected JCheckBox jCheckBoxSeleccionadosTipoRadioVenci;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaTipoRadioVenci;
	protected JCheckBox jCheckBoxConGraficoReporteTipoRadioVenci;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesTipoRadioVenci;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesTipoRadioVenci;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoTipoRadioVenci;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoTipoRadioVenci;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesTipoRadioVenci;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionTipoRadioVenci;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoRadioVenci;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoRadioVenci;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarTipoRadioVenci;
	protected JTextField jTextFieldValorCampoGeneralTipoRadioVenci;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteTipoRadioVenci;
	//public JList<Reporte> jListColumnasSelectReporteTipoRadioVenci;
	//public JScrollPane jScrollColumnasSelectReporteTipoRadioVenci;
	
	//public JLabel jLabelRelacionesSelectReporteTipoRadioVenci;
	//public JList<Reporte> jListRelacionesSelectReporteTipoRadioVenci;
	//public JScrollPane jScrollRelacionesSelectReporteTipoRadioVenci;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoTipoRadioVenci;
	//protected JCheckBox jCheckBoxConGraficoDinamicoTipoRadioVenci;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoTipoRadioVenci;
	//public JLabel jLabelTiposArchivoReporteDinamicoTipoRadioVenci;
	
		
	//public JLabel jLabelArchivoImportacionTipoRadioVenci;	
	//public JLabel jLabelPathArchivoImportacionTipoRadioVenci;
	//protected JTextField jTextFieldPathArchivoImportacionTipoRadioVenci;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoTipoRadioVenci;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoTipoRadioVenci;
	
	//public JLabel jLabelColumnaCategoriaValorTipoRadioVenci;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorTipoRadioVenci;
	
	//public JLabel jLabelColumnasValoresGraficoTipoRadioVenci;
	//public JList<Reporte> jListColumnasValoresGraficoTipoRadioVenci;
	//public JScrollPane jScrollColumnasValoresGraficoTipoRadioVenci;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoTipoRadioVenci;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoTipoRadioVenci;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	
	
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
	//public int iHeightFormulario=286;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public TipoRadioVenciJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("TipoRadioVenci No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoRadioVenciJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoRadioVenci No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoRadioVenciJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoRadioVenci No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoRadioVenciJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoRadioVenci No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionTipoRadioVenci)	{
		this.jButtonRecargarInformacionTipoRadioVenci = jButtonRecargarInformacionTipoRadioVenci;
	}
	
	public JButton getjButtonProcesarInformacionTipoRadioVenci() {
		return this.jButtonProcesarInformacionTipoRadioVenci;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoRadioVenci)	{
		this.jButtonProcesarInformacionTipoRadioVenci = jButtonProcesarInformacionTipoRadioVenci;
	}
	
	
	public JButton getjButtonRecargarInformacionTipoRadioVenci() {
		return this.jButtonRecargarInformacionTipoRadioVenci;
	}
	
	
	public List<TipoRadioVenci> gettiporadiovencis() {
		return this.tiporadiovencis;
	}

	public void settiporadiovencis(List<TipoRadioVenci> tiporadiovencis) {
		this.tiporadiovencis = tiporadiovencis;
	}
	
	public List<TipoRadioVenci> gettiporadiovencisAux() {
		return this.tiporadiovencisAux;
	}

	public void settiporadiovencisAux(List<TipoRadioVenci> tiporadiovencisAux) {
		this.tiporadiovencisAux = tiporadiovencisAux;
	}
	
	public List<TipoRadioVenci> gettiporadiovencisEliminados() {
		return this.tiporadiovencisEliminados;
	}

	public void setTipoRadioVencisEliminados(List<TipoRadioVenci> tiporadiovencisEliminados) {
		this.tiporadiovencisEliminados = tiporadiovencisEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarTipoRadioVenci() {
		return jComboBoxTiposSeleccionarTipoRadioVenci;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarTipoRadioVenci(
			JComboBox jComboBoxTiposSeleccionarTipoRadioVenci) {
		this.jComboBoxTiposSeleccionarTipoRadioVenci = jComboBoxTiposSeleccionarTipoRadioVenci;
	}
	
	public void setBorderResaltarTiposSeleccionarTipoRadioVenci() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarTipoRadioVenci.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarTipoRadioVenci .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralTipoRadioVenci() {
		return jTextFieldValorCampoGeneralTipoRadioVenci;
	}

	public void setjTextFieldValorCampoGeneralTipoRadioVenci(
			JTextField jTextFieldValorCampoGeneralTipoRadioVenci) {
		this.jTextFieldValorCampoGeneralTipoRadioVenci = jTextFieldValorCampoGeneralTipoRadioVenci;
	}

	public void setBorderResaltarValorCampoGeneralTipoRadioVenci() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoRadioVenci.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralTipoRadioVenci .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosTipoRadioVenci() {
		return this.jCheckBoxSeleccionarTodosTipoRadioVenci;
	}

	public void setjCheckBoxSeleccionarTodosTipoRadioVenci(
			JCheckBox jCheckBoxSeleccionarTodosTipoRadioVenci) {
		this.jCheckBoxSeleccionarTodosTipoRadioVenci = jCheckBoxSeleccionarTodosTipoRadioVenci;
	}

	public void setBorderResaltarSeleccionarTodosTipoRadioVenci() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoRadioVenci.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosTipoRadioVenci .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosTipoRadioVenci() {
		return this.jCheckBoxSeleccionadosTipoRadioVenci;
	}

	public void setjCheckBoxSeleccionadosTipoRadioVenci(
			JCheckBox jCheckBoxSeleccionadosTipoRadioVenci) {
		this.jCheckBoxSeleccionadosTipoRadioVenci = jCheckBoxSeleccionadosTipoRadioVenci;
	}
	
	public void setBorderResaltarSeleccionadosTipoRadioVenci() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoRadioVenci.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosTipoRadioVenci .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesTipoRadioVenci() {
		return this.jComboBoxTiposArchivosReportesTipoRadioVenci;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesTipoRadioVenci(
			JComboBox jComboBoxTiposArchivosReportesTipoRadioVenci) {
		this.jComboBoxTiposArchivosReportesTipoRadioVenci = jComboBoxTiposArchivosReportesTipoRadioVenci;
	}

	public void setBorderResaltarTiposArchivosReportesTipoRadioVenci() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoRadioVenci.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesTipoRadioVenci .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesTipoRadioVenci() {
		return this.jComboBoxTiposReportesTipoRadioVenci;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesTipoRadioVenci(
			JComboBox jComboBoxTiposReportesTipoRadioVenci) {
		this.jComboBoxTiposReportesTipoRadioVenci = jComboBoxTiposReportesTipoRadioVenci;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoTipoRadioVenci() {
	//	return jComboBoxTiposReportesDinamicoTipoRadioVenci;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoTipoRadioVenci(
	//		JComboBox jComboBoxTiposReportesDinamicoTipoRadioVenci) {
	//	this.jComboBoxTiposReportesDinamicoTipoRadioVenci = jComboBoxTiposReportesDinamicoTipoRadioVenci;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoTipoRadioVenci() {
	//	return jComboBoxTiposArchivosReportesDinamicoTipoRadioVenci;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoTipoRadioVenci(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoTipoRadioVenci) {
	//	this.jComboBoxTiposArchivosReportesDinamicoTipoRadioVenci = jComboBoxTiposArchivosReportesDinamicoTipoRadioVenci;
	//}
	
	public void setBorderResaltarTiposReportesTipoRadioVenci() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoRadioVenci.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesTipoRadioVenci .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesTipoRadioVenci() {
		return this.jComboBoxTiposGraficosReportesTipoRadioVenci;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesTipoRadioVenci(
			JComboBox jComboBoxTiposGraficosReportesTipoRadioVenci) {
		this.jComboBoxTiposGraficosReportesTipoRadioVenci = jComboBoxTiposGraficosReportesTipoRadioVenci;
	}
	
	public void setBorderResaltarTiposGraficosReportesTipoRadioVenci() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoRadioVenci.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesTipoRadioVenci .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionTipoRadioVenci() {
		return this.jComboBoxTiposPaginacionTipoRadioVenci;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionTipoRadioVenci(
			JComboBox jComboBoxTiposPaginacionTipoRadioVenci) {
		this.jComboBoxTiposPaginacionTipoRadioVenci = jComboBoxTiposPaginacionTipoRadioVenci;
	}
	
	public void setBorderResaltarTiposPaginacionTipoRadioVenci() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoRadioVenci.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionTipoRadioVenci .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesTipoRadioVenci() {
		return this.jComboBoxTiposRelacionesTipoRadioVenci;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoRadioVenci() {
		return this.jComboBoxTiposAccionesTipoRadioVenci;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoRadioVenci(
			JComboBox jComboBoxTiposRelacionesTipoRadioVenci) {
		this.jComboBoxTiposRelacionesTipoRadioVenci = jComboBoxTiposRelacionesTipoRadioVenci;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoRadioVenci(
			JComboBox jComboBoxTiposAccionesTipoRadioVenci) {
		this.jComboBoxTiposAccionesTipoRadioVenci = jComboBoxTiposAccionesTipoRadioVenci;
	}
	
	public void setBorderResaltarTiposRelacionesTipoRadioVenci() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoRadioVenci.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesTipoRadioVenci .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesTipoRadioVenci() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoRadioVenci.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesTipoRadioVenci .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoTipoRadioVenci() {
	//	return jCheckBoxConGraficoDinamicoTipoRadioVenci;
	//}

	//public void setjCheckBoxConGraficoDinamicoTipoRadioVenci(
	//		JCheckBox jCheckBoxConGraficoDinamicoTipoRadioVenci) {
	//	this.jCheckBoxConGraficoDinamicoTipoRadioVenci = jCheckBoxConGraficoDinamicoTipoRadioVenci;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoTipoRadioVenci() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarTipoRadioVenci.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoTipoRadioVenci .setBorder(borderResaltar);		
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
		this.tiporadiovenciSessionBean=new TipoRadioVenciSessionBean();
		
		this.tiporadiovenciSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tiporadiovenciSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tiporadiovenciSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=TipoRadioVenciJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=TipoRadioVenciJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoRadioVenciJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoRadioVenciJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoRadioVenciJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Radio Venci MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 910) {
			iHeight=910;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.tiporadiovenciSessionBean.getEsGuardarRelacionado()) {
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
		
		TipoRadioVenciJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("TipoRadioVenci No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarTipoRadioVenci= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarTipoRadioVenci=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarTipoRadioVenci,this.jTtoolBarTipoRadioVenci,
							"nuevo","nuevo","Nuevo"+" "+TipoRadioVenciConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoRadioVenci=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarTipoRadioVenci,this.jTtoolBarTipoRadioVenci,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoRadioVenci=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarTipoRadioVenci,this.jTtoolBarTipoRadioVenci,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+TipoRadioVenciConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarTipoRadioVenci=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarTipoRadioVenci,this.jTtoolBarTipoRadioVenci,
							"duplicar","duplicar","Duplicar"+" "+TipoRadioVenciConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarTipoRadioVenci=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarTipoRadioVenci,this.jTtoolBarTipoRadioVenci,
							"copiar","copiar","Copiar"+" "+TipoRadioVenciConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarTipoRadioVenci=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarTipoRadioVenci,this.jTtoolBarTipoRadioVenci,
							"ver_form","ver_form","Ver"+" "+TipoRadioVenciConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarTipoRadioVenci=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoRadioVenci,this.jTtoolBarTipoRadioVenci,
							"recargar","recargar","Recargar"+" "+TipoRadioVenciConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarTipoRadioVenci=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoRadioVenci,this.jTtoolBarTipoRadioVenci,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarTipoRadioVenci=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoRadioVenci,this.jTtoolBarTipoRadioVenci,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarTipoRadioVenci=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarTipoRadioVenci,this.jTtoolBarTipoRadioVenci,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarTipoRadioVenci=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarTipoRadioVenci,this.jTtoolBarTipoRadioVenci,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarTipoRadioVenci=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarTipoRadioVenci,this.jTtoolBarTipoRadioVenci,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+TipoRadioVenciConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarTipoRadioVenci=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarTipoRadioVenci,this.jTtoolBarTipoRadioVenci,
							"cerrar","cerrar","Salir"+" "+TipoRadioVenciConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarTipoRadioVenci=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarTipoRadioVenci;
			
				this.jButtonProcesarInformacionToolBarTipoRadioVenci=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarTipoRadioVenci;
				
		//protected JButton jButtonModificarToolBarTipoRadioVenci;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarTipoRadioVenci=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuTipoRadioVenci=new JMenuMe("General");
		this.jmenuArchivoTipoRadioVenci=new JMenuMe("Archivo");
		this.jmenuAccionesTipoRadioVenci=new JMenuMe("Acciones");
		this.jmenuDatosTipoRadioVenci=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoRadioVenci= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoRadioVenci.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoRadioVenci,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoRadioVenci, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarTipoRadioVenci= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarTipoRadioVenci.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarTipoRadioVenci,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarTipoRadioVenci, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesTipoRadioVenci= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesTipoRadioVenci.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesTipoRadioVenci,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesTipoRadioVenci, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosTipoRadioVenci= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoRadioVenci.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoRadioVenci,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoRadioVenci, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarTipoRadioVenci= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarTipoRadioVenci.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarTipoRadioVenci,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarTipoRadioVenci, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormTipoRadioVenci= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormTipoRadioVenci.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormTipoRadioVenci,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormTipoRadioVenci, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaTipoRadioVenci= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaTipoRadioVenci.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaTipoRadioVenci,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaTipoRadioVenci, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoRadioVenci= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoRadioVenci.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoRadioVenci,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoRadioVenci, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionTipoRadioVenci= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionTipoRadioVenci.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionTipoRadioVenci,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionTipoRadioVenci, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionTipoRadioVenci= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionTipoRadioVenci.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionTipoRadioVenci,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresTipoRadioVenci= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresTipoRadioVenci.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresTipoRadioVenci,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresTipoRadioVenci, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesTipoRadioVenci= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesTipoRadioVenci.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesTipoRadioVenci,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesTipoRadioVenci, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByTipoRadioVenci= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByTipoRadioVenci.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByTipoRadioVenci,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByTipoRadioVenci, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoRadioVenci= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoRadioVenci.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoRadioVenci,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoRadioVenci, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByTipoRadioVenci= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByTipoRadioVenci.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByTipoRadioVenci,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByTipoRadioVenci, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoRadioVenci= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoRadioVenci.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoRadioVenci,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoRadioVenci, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosTipoRadioVenci= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosTipoRadioVenci.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosTipoRadioVenci,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosTipoRadioVenci, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoTipoRadioVenci.add(this.jMenuItemCerrarTipoRadioVenci);
			
			this.jmenuAccionesTipoRadioVenci.add(this.jMenuItemNuevoTipoRadioVenci);
			this.jmenuAccionesTipoRadioVenci.add(this.jMenuItemNuevoGuardarCambiosTipoRadioVenci);
			this.jmenuAccionesTipoRadioVenci.add(this.jMenuItemNuevoRelacionesTipoRadioVenci);
			this.jmenuAccionesTipoRadioVenci.add(this.jMenuItemGuardarCambiosTablaTipoRadioVenci);		
			this.jmenuAccionesTipoRadioVenci.add(this.jMenuItemDuplicarTipoRadioVenci);		
			this.jmenuAccionesTipoRadioVenci.add(this.jMenuItemCopiarTipoRadioVenci);		
			this.jmenuAccionesTipoRadioVenci.add(this.jMenuItemVerFormTipoRadioVenci);		
			
			this.jmenuDatosTipoRadioVenci.add(this.jMenuItemRecargarInformacionTipoRadioVenci);				
			this.jmenuDatosTipoRadioVenci.add(this.jMenuItemAnterioresTipoRadioVenci);				
			this.jmenuDatosTipoRadioVenci.add(this.jMenuItemSiguientesTipoRadioVenci);				
			this.jmenuDatosTipoRadioVenci.add(this.jMenuItemAbrirOrderByTipoRadioVenci);				
			this.jmenuDatosTipoRadioVenci.add(this.jMenuItemMostrarOcultarTipoRadioVenci);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesTipoRadioVenci.add(this.jMenuItemGuardarCambiosTipoRadioVenci);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoTipoRadioVenci, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesTipoRadioVenci, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosTipoRadioVenci, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarTipoRadioVenci.add(this.jmenuArchivoTipoRadioVenci);		
			this.jmenuBarTipoRadioVenci.add(this.jmenuAccionesTipoRadioVenci);		
			this.jmenuBarTipoRadioVenci.add(this.jmenuDatosTipoRadioVenci);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarTipoRadioVenci);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasTipoRadioVenci() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
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
			//this.jInternalFrameDetalleTipoRadioVenci = new TipoRadioVenciDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Tipo Radio Venci DATOS");
			this.jInternalFrameDetalleFormTipoRadioVenci = new TipoRadioVenciDetalleFormJInternalFrame(jDesktopPane,this.tiporadiovenciSessionBean.getConGuardarRelaciones(),this.tiporadiovenciSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormTipoRadioVenci = null;//new TipoRadioVenciDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoRadioVenci= new GridBagLayout();
		
		
		this.jTableDatosTipoRadioVenci = new JTableMe();      
		
		String sToolTipTipoRadioVenci="";
		sToolTipTipoRadioVenci=TipoRadioVenciConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoRadioVenci+="(Cartera.TipoRadioVenci)";
		}
		
		if(!this.tiporadiovenciSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoRadioVenci+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosTipoRadioVenci.setToolTipText(sToolTipTipoRadioVenci);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosTipoRadioVenci);
		this.jTableDatosTipoRadioVenci.setAutoCreateRowSorter(true);
		this.jTableDatosTipoRadioVenci.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosTipoRadioVenci.setRowSelectionAllowed(true);
		this.jTableDatosTipoRadioVenci.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosTipoRadioVenci,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoTipoRadioVenci = new JButtonMe();
		this.jButtonDuplicarTipoRadioVenci = new JButtonMe();
		this.jButtonCopiarTipoRadioVenci = new JButtonMe();
		this.jButtonVerFormTipoRadioVenci = new JButtonMe();
		this.jButtonNuevoRelacionesTipoRadioVenci = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaTipoRadioVenci = new JButtonMe();
		this.jButtonCerrarTipoRadioVenci = new JButtonMe();
		
		this.jScrollPanelDatosTipoRadioVenci = new JScrollPane();   
        this.jScrollPanelDatosGeneralTipoRadioVenci = new JScrollPane();
		
				
		
		
		this.jPanelAccionesTipoRadioVenci = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Radio Venci";
		
		if(!this.tiporadiovenciSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoRadioVenci.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Radio Vencis" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoRadioVenci.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralTipoRadioVenci.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesTipoRadioVenci.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoRadioVenci.setToolTipText("Acciones");
        this.jPanelAccionesTipoRadioVenci.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoRadioVenci, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoRadioVenci, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoTipoRadioVenci=new ReporteDinamicoJInternalFrame(TipoRadioVenciConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoTipoRadioVenci();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionTipoRadioVenci=new ImportacionJInternalFrame(TipoRadioVenciConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionTipoRadioVenci();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByTipoRadioVenci = new JButtonMe();
		
		this.jButtonAbrirOrderByTipoRadioVenci.setText("Orden");
		this.jButtonAbrirOrderByTipoRadioVenci.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoRadioVenci,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoRadioVenci, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByTipoRadioVenci.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByTipoRadioVenci.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoRadioVenci=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoRadioVenci,false,this);
			
			//this.cargarOrderByTipoRadioVenci(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoRadioVenci=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoRadioVenci,true,this);
			
			//this.cargarOrderByTipoRadioVenci(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosTipoRadioVenci.setMinimumSize(new Dimension(400,50));//330
		this.jTableDatosTipoRadioVenci.setMaximumSize(new Dimension(400,50));//330
		this.jTableDatosTipoRadioVenci.setPreferredSize(new Dimension(400,50));//330
		
		this.jScrollPanelDatosTipoRadioVenci.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoRadioVenci.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoRadioVenci.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoTipoRadioVenci.setText("Nuevo");
		this.jButtonDuplicarTipoRadioVenci.setText("Duplicar");
		this.jButtonCopiarTipoRadioVenci.setText("Copiar");
		this.jButtonVerFormTipoRadioVenci.setText("Ver");
		this.jButtonNuevoRelacionesTipoRadioVenci.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaTipoRadioVenci.setText("Guardar");
		this.jButtonCerrarTipoRadioVenci.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoRadioVenci,"nuevo_button","Nuevo",this.tiporadiovenciSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarTipoRadioVenci,"duplicar_button","Duplicar",this.tiporadiovenciSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarTipoRadioVenci,"copiar_button","Copiar",this.tiporadiovenciSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormTipoRadioVenci,"ver_form","Ver",this.tiporadiovenciSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesTipoRadioVenci,"nuevorelaciones_button","Nuevo Rel",this.tiporadiovenciSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoRadioVenci,"guardarcambiostabla_button","Guardar",this.tiporadiovenciSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoRadioVenci,"cerrar_button","Salir",this.tiporadiovenciSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoRadioVenci, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarTipoRadioVenci, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarTipoRadioVenci, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormTipoRadioVenci, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesTipoRadioVenci, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoRadioVenci, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoRadioVenci, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoTipoRadioVenci.setToolTipText("Nuevo"+" "+TipoRadioVenciConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarTipoRadioVenci.setToolTipText("Duplicar"+" "+TipoRadioVenciConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarTipoRadioVenci.setToolTipText("Copiar"+" "+TipoRadioVenciConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormTipoRadioVenci.setToolTipText("Ver"+" "+TipoRadioVenciConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesTipoRadioVenci.setToolTipText("Nuevo Rel"+" "+TipoRadioVenciConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaTipoRadioVenci.setToolTipText("Guardar"+" "+TipoRadioVenciConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoRadioVenci.setToolTipText("Salir"+" "+TipoRadioVenciConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoRadioVenci";
		inputMap = this.jButtonNuevoTipoRadioVenci.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoRadioVenci.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoRadioVenci"));
		
		//DUPLICAR
		sMapKey = "DuplicarTipoRadioVenci";
		inputMap = this.jButtonDuplicarTipoRadioVenci.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarTipoRadioVenci.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarTipoRadioVenci"));
		
		//COPIAR
		sMapKey = "CopiarTipoRadioVenci";
		inputMap = this.jButtonCopiarTipoRadioVenci.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarTipoRadioVenci.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarTipoRadioVenci"));
		
		//VEr FORM
		sMapKey = "VerFormTipoRadioVenci";
		inputMap = this.jButtonVerFormTipoRadioVenci.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormTipoRadioVenci.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormTipoRadioVenci"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesTipoRadioVenci";
		inputMap = this.jButtonNuevoRelacionesTipoRadioVenci.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesTipoRadioVenci.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesTipoRadioVenci"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarTipoRadioVenci";
		inputMap = this.jButtonModificarTipoRadioVenci.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarTipoRadioVenci.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarTipoRadioVenci"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarTipoRadioVenci";
		inputMap = this.jButtonCerrarTipoRadioVenci.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoRadioVenci.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoRadioVenci"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoRadioVenci";
		inputMap = this.jButtonGuardarCambiosTablaTipoRadioVenci.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoRadioVenci.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoRadioVenci"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesTipoRadioVenci = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesTipoRadioVenci = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionTipoRadioVenci = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1TipoRadioVenci= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2TipoRadioVenci= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3TipoRadioVenci= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4TipoRadioVenci= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5TipoRadioVenci= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesTipoRadioVenci.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesTipoRadioVenci.setName("jPanelParametrosReportesTipoRadioVenci"); 
		
		this.jPanelParametrosReportesAccionesTipoRadioVenci.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesTipoRadioVenci.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesTipoRadioVenci.setName("jPanelParametrosReportesAccionesTipoRadioVenci"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesTipoRadioVenci, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesTipoRadioVenci, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionTipoRadioVenci = new JButtonMe();
		this.jButtonRecargarInformacionTipoRadioVenci.setText("Recargar");
		this.jButtonRecargarInformacionTipoRadioVenci.setToolTipText("Recargar"+" "+TipoRadioVenciConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionTipoRadioVenci,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionTipoRadioVenci = new JButtonMe();
		this.jButtonProcesarInformacionTipoRadioVenci.setText("Procesar");
		this.jButtonProcesarInformacionTipoRadioVenci.setToolTipText("Procesar"+" "+TipoRadioVenciConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionTipoRadioVenci.setVisible(false);
			
		this.jButtonProcesarInformacionTipoRadioVenci.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoRadioVenci.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoRadioVenci.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesTipoRadioVenci = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoRadioVenci.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesTipoRadioVenci.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesTipoRadioVenci = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoRadioVenci.setText("TIPO");       
		this.jComboBoxTiposReportesTipoRadioVenci.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesTipoRadioVenci = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoRadioVenci.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesTipoRadioVenci.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionTipoRadioVenci = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionTipoRadioVenci.setText("Paginacion");
		this.jComboBoxTiposPaginacionTipoRadioVenci.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesTipoRadioVenci = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesTipoRadioVenci.setText("Accion");
		this.jComboBoxTiposRelacionesTipoRadioVenci.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesTipoRadioVenci = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoRadioVenci.setText("Accion");
		this.jComboBoxTiposAccionesTipoRadioVenci.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarTipoRadioVenci = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarTipoRadioVenci.setText("Accion");
		this.jComboBoxTiposSeleccionarTipoRadioVenci.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralTipoRadioVenci=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralTipoRadioVenci.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoRadioVenci.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoRadioVenci.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesTipoRadioVenci = new JLabelMe();
		
		this.jLabelAccionesTipoRadioVenci.setText("Acciones");		
		this.jLabelAccionesTipoRadioVenci.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoRadioVenci.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoRadioVenci.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosTipoRadioVenci = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosTipoRadioVenci.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosTipoRadioVenci.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosTipoRadioVenci = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosTipoRadioVenci.setText("Seleccionados");
		this.jCheckBoxSeleccionadosTipoRadioVenci.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaTipoRadioVenci = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaTipoRadioVenci.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaTipoRadioVenci.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteTipoRadioVenci = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteTipoRadioVenci.setText("Graf.");
		this.jCheckBoxConGraficoReporteTipoRadioVenci.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresTipoRadioVenci = new JButtonMe();
		//this.jButtonAnterioresTipoRadioVenci.setText("<<");
        this.jButtonAnterioresTipoRadioVenci.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresTipoRadioVenci,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresTipoRadioVenci, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesTipoRadioVenci = new JButtonMe();
		//this.jButtonSiguientesTipoRadioVenci.setText(">>");
        this.jButtonSiguientesTipoRadioVenci.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesTipoRadioVenci,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesTipoRadioVenci, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosTipoRadioVenci = new JButtonMe();
		this.jButtonNuevoGuardarCambiosTipoRadioVenci.setText("Nue");
        this.jButtonNuevoGuardarCambiosTipoRadioVenci.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosTipoRadioVenci,"nuevoguardarcambios_button","Nue",this.tiporadiovenciSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosTipoRadioVenci, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosTipoRadioVenci";
		inputMap = this.jButtonNuevoGuardarCambiosTipoRadioVenci.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosTipoRadioVenci.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosTipoRadioVenci"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionTipoRadioVenci";
		inputMap = this.jButtonRecargarInformacionTipoRadioVenci.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionTipoRadioVenci.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionTipoRadioVenci"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesTipoRadioVenci";
		inputMap = this.jButtonSiguientesTipoRadioVenci.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesTipoRadioVenci.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesTipoRadioVenci"));
		
		//ANTERIORES		
		sMapKey = "AnterioresTipoRadioVenci";
		inputMap = this.jButtonAnterioresTipoRadioVenci.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresTipoRadioVenci.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresTipoRadioVenci"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasTipoRadioVenci();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesTipoRadioVenci.setMinimumSize(new Dimension(this.getWidth(),TipoRadioVenciBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoRadioVenciBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoRadioVenci.setMaximumSize(new Dimension(this.getWidth(),TipoRadioVenciBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoRadioVenciBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoRadioVenci.setPreferredSize(new Dimension(this.getWidth(),TipoRadioVenciBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoRadioVenciBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionTipoRadioVenci = new GridBagLayout();

			this.jPanelPaginacionTipoRadioVenci.setLayout(gridaBagLayoutPaginacionTipoRadioVenci);						
			
			this.gridBagConstraintsTipoRadioVenci = new GridBagConstraints();
			this.gridBagConstraintsTipoRadioVenci.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsTipoRadioVenci.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoRadioVenci.gridy = 0;
			this.gridBagConstraintsTipoRadioVenci.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionTipoRadioVenci.add(this.jButtonAnterioresTipoRadioVenci, this.gridBagConstraintsTipoRadioVenci);
					
						
			this.gridBagConstraintsTipoRadioVenci = new GridBagConstraints();
			this.gridBagConstraintsTipoRadioVenci.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoRadioVenci.gridy = 0;
			
			this.jPanelPaginacionTipoRadioVenci.add(this.jButtonNuevoGuardarCambiosTipoRadioVenci, this.gridBagConstraintsTipoRadioVenci);
						
			
			this.gridBagConstraintsTipoRadioVenci = new GridBagConstraints();
			this.gridBagConstraintsTipoRadioVenci.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsTipoRadioVenci.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoRadioVenci.gridy = 0;
			this.jPanelPaginacionTipoRadioVenci.add(this.jButtonSiguientesTipoRadioVenci, this.gridBagConstraintsTipoRadioVenci);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsTipoRadioVenci = new GridBagConstraints();
			this.gridBagConstraintsTipoRadioVenci.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoRadioVenci.gridy = 1;
			this.gridBagConstraintsTipoRadioVenci.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoRadioVenci.add(this.jButtonNuevoTipoRadioVenci, this.gridBagConstraintsTipoRadioVenci);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsTipoRadioVenci = new GridBagConstraints();
				this.gridBagConstraintsTipoRadioVenci.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoRadioVenci.gridy = 1;
				this.gridBagConstraintsTipoRadioVenci.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionTipoRadioVenci.add(this.jButtonNuevoRelacionesTipoRadioVenci, this.gridBagConstraintsTipoRadioVenci);
			}
			
			
			if(!this.tiporadiovenciSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsTipoRadioVenci = new GridBagConstraints();
				this.gridBagConstraintsTipoRadioVenci.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoRadioVenci.gridy = 1;
				this.gridBagConstraintsTipoRadioVenci.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionTipoRadioVenci.add(this.jButtonGuardarCambiosTablaTipoRadioVenci, this.gridBagConstraintsTipoRadioVenci);
			}
			
			
			
			this.gridBagConstraintsTipoRadioVenci = new GridBagConstraints();
			this.gridBagConstraintsTipoRadioVenci.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoRadioVenci.gridy = 1;
			this.gridBagConstraintsTipoRadioVenci.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoRadioVenci.add(this.jButtonDuplicarTipoRadioVenci, this.gridBagConstraintsTipoRadioVenci);
			
			this.gridBagConstraintsTipoRadioVenci = new GridBagConstraints();
			this.gridBagConstraintsTipoRadioVenci.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoRadioVenci.gridy = 1;
			this.gridBagConstraintsTipoRadioVenci.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoRadioVenci.add(this.jButtonCopiarTipoRadioVenci, this.gridBagConstraintsTipoRadioVenci);
		
			this.gridBagConstraintsTipoRadioVenci = new GridBagConstraints();
			this.gridBagConstraintsTipoRadioVenci.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoRadioVenci.gridy = 1;
			this.gridBagConstraintsTipoRadioVenci.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoRadioVenci.add(this.jButtonVerFormTipoRadioVenci, this.gridBagConstraintsTipoRadioVenci);
		
			this.gridBagConstraintsTipoRadioVenci = new GridBagConstraints();
			this.gridBagConstraintsTipoRadioVenci.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoRadioVenci.gridy = 1;
			this.gridBagConstraintsTipoRadioVenci.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionTipoRadioVenci.add(this.jButtonCerrarTipoRadioVenci, this.gridBagConstraintsTipoRadioVenci);
		
		
		
		this.jButtonRecargarInformacionTipoRadioVenci.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoRadioVenci.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoRadioVenci.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionTipoRadioVenci, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesTipoRadioVenci.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoRadioVenci.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoRadioVenci.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesTipoRadioVenci, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesTipoRadioVenci.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoRadioVenci.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoRadioVenci.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesTipoRadioVenci, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesTipoRadioVenci.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoRadioVenci.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoRadioVenci.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesTipoRadioVenci, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionTipoRadioVenci.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoRadioVenci.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoRadioVenci.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionTipoRadioVenci, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesTipoRadioVenci.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoRadioVenci.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoRadioVenci.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesTipoRadioVenci, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesTipoRadioVenci.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoRadioVenci.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoRadioVenci.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoRadioVenci, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarTipoRadioVenci.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoRadioVenci.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoRadioVenci.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarTipoRadioVenci, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaTipoRadioVenci.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoRadioVenci.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoRadioVenci.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaTipoRadioVenci, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteTipoRadioVenci.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoRadioVenci.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoRadioVenci.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteTipoRadioVenci, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosTipoRadioVenci.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoRadioVenci.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoRadioVenci.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosTipoRadioVenci, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosTipoRadioVenci.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoRadioVenci.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoRadioVenci.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosTipoRadioVenci, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesTipoRadioVenci = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesTipoRadioVenci = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1TipoRadioVenci = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2TipoRadioVenci = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3TipoRadioVenci = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4TipoRadioVenci = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesTipoRadioVenci.setLayout(gridaBagParametrosReportesTipoRadioVenci);
			this.jPanelParametrosReportesAccionesTipoRadioVenci.setLayout(gridaBagParametrosReportesAccionesTipoRadioVenci);
			
			
			this.jPanelParametrosAuxiliar1TipoRadioVenci.setLayout(gridaBagParametrosAuxiliar1TipoRadioVenci);
			this.jPanelParametrosAuxiliar2TipoRadioVenci.setLayout(gridaBagParametrosAuxiliar2TipoRadioVenci);
			this.jPanelParametrosAuxiliar3TipoRadioVenci.setLayout(gridaBagParametrosAuxiliar3TipoRadioVenci);
			this.jPanelParametrosAuxiliar4TipoRadioVenci.setLayout(gridaBagParametrosAuxiliar4TipoRadioVenci);
			//this.jPanelParametrosAuxiliar5TipoRadioVenci.setLayout(gridaBagParametrosAuxiliar2TipoRadioVenci);			
			
			
			
			
			this.gridBagConstraintsTipoRadioVenci = new GridBagConstraints();
			this.gridBagConstraintsTipoRadioVenci.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoRadioVenci.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoRadioVenci.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoRadioVenci.add(this.jButtonRecargarInformacionTipoRadioVenci, this.gridBagConstraintsTipoRadioVenci);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsTipoRadioVenci = new GridBagConstraints();
			this.gridBagConstraintsTipoRadioVenci.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoRadioVenci.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoRadioVenci.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoRadioVenci.add(this.jComboBoxTiposPaginacionTipoRadioVenci, this.gridBagConstraintsTipoRadioVenci);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsTipoRadioVenci = new GridBagConstraints();
			this.gridBagConstraintsTipoRadioVenci.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoRadioVenci.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoRadioVenci.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoRadioVenci.add(this.jCheckBoxConAltoMaximoTablaTipoRadioVenci, this.gridBagConstraintsTipoRadioVenci);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsTipoRadioVenci = new GridBagConstraints();
			this.gridBagConstraintsTipoRadioVenci.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoRadioVenci.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoRadioVenci.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoRadioVenci.add(this.jComboBoxTiposArchivosReportesTipoRadioVenci, this.gridBagConstraintsTipoRadioVenci);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsTipoRadioVenci = new GridBagConstraints();
			this.gridBagConstraintsTipoRadioVenci.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoRadioVenci.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoRadioVenci.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoRadioVenci.add(this.jPanelParametrosAuxiliar1TipoRadioVenci, this.gridBagConstraintsTipoRadioVenci);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsTipoRadioVenci = new GridBagConstraints();
			this.gridBagConstraintsTipoRadioVenci.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoRadioVenci.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoRadioVenci.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoRadioVenci.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4TipoRadioVenci.add(this.jComboBoxTiposReportesTipoRadioVenci, this.gridBagConstraintsTipoRadioVenci);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsTipoRadioVenci = new GridBagConstraints();
			this.gridBagConstraintsTipoRadioVenci.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoRadioVenci.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoRadioVenci.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoRadioVenci.add(this.jPanelParametrosAuxiliar4TipoRadioVenci, this.gridBagConstraintsTipoRadioVenci);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsTipoRadioVenci = new GridBagConstraints();
			this.gridBagConstraintsTipoRadioVenci.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoRadioVenci.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoRadioVenci.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoRadioVenci.add(this.jComboBoxTiposReportesTipoRadioVenci, this.gridBagConstraintsTipoRadioVenci);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsTipoRadioVenci = new GridBagConstraints();
			this.gridBagConstraintsTipoRadioVenci.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoRadioVenci.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoRadioVenci.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoRadioVenci.add(this.jCheckBoxGenerarReporteTipoRadioVenci, this.gridBagConstraintsTipoRadioVenci);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsTipoRadioVenci = new GridBagConstraints();
			this.gridBagConstraintsTipoRadioVenci.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoRadioVenci.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoRadioVenci.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoRadioVenci.add(this.jPanelParametrosAuxiliar2TipoRadioVenci, this.gridBagConstraintsTipoRadioVenci);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsTipoRadioVenci = new GridBagConstraints();
			this.gridBagConstraintsTipoRadioVenci.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoRadioVenci.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoRadioVenci.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoRadioVenci.add(this.jLabelAccionesTipoRadioVenci, this.gridBagConstraintsTipoRadioVenci);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsTipoRadioVenci = new GridBagConstraints();
				this.gridBagConstraintsTipoRadioVenci.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsTipoRadioVenci.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsTipoRadioVenci.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesTipoRadioVenci.add(this.jButtonAbrirOrderByTipoRadioVenci, this.gridBagConstraintsTipoRadioVenci);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsTipoRadioVenci = new GridBagConstraints();
			this.gridBagConstraintsTipoRadioVenci.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsTipoRadioVenci.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoRadioVenci.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoRadioVenci.add(this.jComboBoxTiposSeleccionarTipoRadioVenci, this.gridBagConstraintsTipoRadioVenci);			
			
			
			/*
			this.gridBagConstraintsTipoRadioVenci = new GridBagConstraints();
			this.gridBagConstraintsTipoRadioVenci.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoRadioVenci.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoRadioVenci.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoRadioVenci.add(this.jCheckBoxSeleccionarTodosTipoRadioVenci, this.gridBagConstraintsTipoRadioVenci);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsTipoRadioVenci = new GridBagConstraints();
			this.gridBagConstraintsTipoRadioVenci.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoRadioVenci.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoRadioVenci.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoRadioVenci.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoRadioVenci.add(this.jCheckBoxSeleccionarTodosTipoRadioVenci, this.gridBagConstraintsTipoRadioVenci);															
				
			this.gridBagConstraintsTipoRadioVenci = new GridBagConstraints();
			this.gridBagConstraintsTipoRadioVenci.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoRadioVenci.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoRadioVenci.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoRadioVenci.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoRadioVenci.add(this.jCheckBoxSeleccionadosTipoRadioVenci, this.gridBagConstraintsTipoRadioVenci);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsTipoRadioVenci = new GridBagConstraints();
			this.gridBagConstraintsTipoRadioVenci.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoRadioVenci.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoRadioVenci.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoRadioVenci.add(this.jPanelParametrosAuxiliar3TipoRadioVenci, this.gridBagConstraintsTipoRadioVenci);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsTipoRadioVenci = new GridBagConstraints();
			this.gridBagConstraintsTipoRadioVenci.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoRadioVenci.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoRadioVenci.add(this.jComboBoxTiposRelacionesTipoRadioVenci, this.gridBagConstraintsTipoRadioVenci);
				
			this.gridBagConstraintsTipoRadioVenci = new GridBagConstraints();
			this.gridBagConstraintsTipoRadioVenci.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoRadioVenci.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoRadioVenci.add(this.jComboBoxTiposAccionesTipoRadioVenci, this.gridBagConstraintsTipoRadioVenci);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosTipoRadioVenci = new GridBagLayout();

			this.jScrollPanelDatosTipoRadioVenci.setLayout(gridaBagLayoutDatosTipoRadioVenci);
			
			this.gridBagConstraintsTipoRadioVenci = new GridBagConstraints();
			this.gridBagConstraintsTipoRadioVenci.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoRadioVenci.gridy = 0;
			this.gridBagConstraintsTipoRadioVenci.gridx = 0;
			
			this.jScrollPanelDatosTipoRadioVenci.add(this.jTableDatosTipoRadioVenci, this.gridBagConstraintsTipoRadioVenci);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosTipoRadioVenci.setViewportView(this.jTableDatosTipoRadioVenci);
		this.jTableDatosTipoRadioVenci.setFillsViewportHeight(true);
		this.jTableDatosTipoRadioVenci.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesTipoRadioVenci= new GridBagLayout();
		this.jPanelAccionesTipoRadioVenci.setLayout(gridaBagLayoutAccionesTipoRadioVenci);
		
		
		/*	
		this.gridBagConstraintsTipoRadioVenci = new GridBagConstraints();
		this.gridBagConstraintsTipoRadioVenci.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoRadioVenci.gridy = 0;
		this.gridBagConstraintsTipoRadioVenci.gridx = 0;
			
		this.jPanelAccionesTipoRadioVenci.add(this.jButtonNuevoTipoRadioVenci, this.gridBagConstraintsTipoRadioVenci);
		*/
		int iPosXAccion=0;
		
						
		
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoRadioVenci = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoRadioVenci);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tiporadiovenciSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoRadioVenci = new GridBagConstraints();						
			this.gridBagConstraintsTipoRadioVenci.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoRadioVenci.gridx = 0;		
			//this.gridBagConstraintsTipoRadioVenci.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoRadioVenci.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoRadioVenci.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarTipoRadioVenci, this.gridBagConstraintsTipoRadioVenci);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsTipoRadioVenci = new GridBagConstraints();
		this.gridBagConstraintsTipoRadioVenci.gridy = iGridyPrincipal++;
		this.gridBagConstraintsTipoRadioVenci.gridx = 0;		
		//this.gridBagConstraintsTipoRadioVenci.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoRadioVenci.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsTipoRadioVenci.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsTipoRadioVenci);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsTipoRadioVenci = new GridBagConstraints();
		this.gridBagConstraintsTipoRadioVenci.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoRadioVenci.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesTipoRadioVenci, this.gridBagConstraintsTipoRadioVenci);								
		
		
		/*
		this.gridBagConstraintsTipoRadioVenci = new GridBagConstraints();
		this.gridBagConstraintsTipoRadioVenci.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoRadioVenci.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesTipoRadioVenci, this.gridBagConstraintsTipoRadioVenci);
		*/		
		
		this.gridBagConstraintsTipoRadioVenci = new GridBagConstraints();
		this.gridBagConstraintsTipoRadioVenci.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoRadioVenci.gridx =0;
		this.gridBagConstraintsTipoRadioVenci.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoRadioVenci.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoRadioVenci, this.gridBagConstraintsTipoRadioVenci);
				
		
		this.gridBagConstraintsTipoRadioVenci = new GridBagConstraints();
		this.gridBagConstraintsTipoRadioVenci.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoRadioVenci.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionTipoRadioVenci, this.gridBagConstraintsTipoRadioVenci);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(TipoRadioVenciJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosTipoRadioVenci= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoRadioVenci = new GridBagLayout();
			this.jPanelBusquedasParametrosTipoRadioVenci.setLayout(gridaBagLayoutBusquedasParametrosTipoRadioVenci);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralTipoRadioVenci=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoRadioVenci.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoRadioVenci.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoRadioVenci.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoRadioVenci = new GridBagConstraints();
			
			
			
			
			//if(!this.conCargarMinimo) {
			
			//}
			
			this.conMaximoRelaciones=true;
			
			if(this.parametroGeneralUsuario.getcon_cargar_por_parte()) {
			}
			
			
			Boolean tieneColumnasOcultas=false;
			
			
			
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
		this.gridBagConstraintsTipoRadioVenci = new GridBagConstraints();
		this.gridBagConstraintsTipoRadioVenci.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoRadioVenci.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoRadioVenci, this.gridBagConstraintsTipoRadioVenci);
			
			
		this.gridBagConstraintsTipoRadioVenci = new GridBagConstraints();
		this.gridBagConstraintsTipoRadioVenci.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoRadioVenci.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoRadioVenci, this.gridBagConstraintsTipoRadioVenci);
		
			
		this.gridBagConstraintsTipoRadioVenci = new GridBagConstraints();
		this.gridBagConstraintsTipoRadioVenci.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoRadioVenci.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoRadioVenci, this.gridBagConstraintsTipoRadioVenci);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralTipoRadioVenci;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoTipoRadioVenci() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoTipoRadioVenci = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoTipoRadioVenci = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoTipoRadioVenci.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoTipoRadioVenci.setName("jPanelReporteDinamicoTipoRadioVenci"); 
		
		this.jPanelReporteDinamicoTipoRadioVenci.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoRadioVenci.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoRadioVenci.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoTipoRadioVenci.setLayout(gridaBagLayoutReporteDinamicoTipoRadioVenci);
		
		
		this.jInternalFrameReporteDinamicoTipoRadioVenci= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoTipoRadioVenci = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoRadioVenci= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoTipoRadioVenci.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoTipoRadioVenci.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoTipoRadioVenci.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoTipoRadioVenci.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoTipoRadioVenci.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoTipoRadioVenci.setResizable(true);
	    this.jInternalFrameReporteDinamicoTipoRadioVenci.setClosable(true);
	    this.jInternalFrameReporteDinamicoTipoRadioVenci.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoTipoRadioVenci.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoRadioVenci.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoRadioVenci.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoTipoRadioVenci.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Radio Vencis"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteTipoRadioVenci = new JLabelMe();

		this.jLabelColumnasSelectReporteTipoRadioVenci.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteTipoRadioVenci.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoRadioVenci.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoRadioVenci.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoRadioVenci = new GridBagConstraints();
		this.gridBagConstraintsTipoRadioVenci.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoRadioVenci.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoRadioVenci.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoRadioVenci.add(this.jLabelColumnasSelectReporteTipoRadioVenci, this.gridBagConstraintsTipoRadioVenci);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteTipoRadioVenci = new JList<Reporte>();
		this.jListColumnasSelectReporteTipoRadioVenci.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteTipoRadioVenci.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteTipoRadioVenci.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoRadioVenci.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoRadioVenci.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteTipoRadioVenci=new JScrollPane(this.jListColumnasSelectReporteTipoRadioVenci);
			
			this.jScrollColumnasSelectReporteTipoRadioVenci.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoRadioVenci.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoRadioVenci.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteTipoRadioVenci.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTipoRadioVenci = new GridBagConstraints();
		this.gridBagConstraintsTipoRadioVenci.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoRadioVenci.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoRadioVenci.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoRadioVenci.add(this.jListColumnasSelectReporteTipoRadioVenci, this.gridBagConstraintsTipoRadioVenci);
		this.jPanelReporteDinamicoTipoRadioVenci.add(this.jScrollColumnasSelectReporteTipoRadioVenci, this.gridBagConstraintsTipoRadioVenci);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteTipoRadioVenci = new JLabelMe();

		this.jLabelRelacionesSelectReporteTipoRadioVenci.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteTipoRadioVenci.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoRadioVenci.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoRadioVenci.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsTipoRadioVenci = new GridBagConstraints();
		this.gridBagConstraintsTipoRadioVenci.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoRadioVenci.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoRadioVenci.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoRadioVenci.add(this.jLabelRelacionesSelectReporteTipoRadioVenci, this.gridBagConstraintsTipoRadioVenci);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteTipoRadioVenci = new JList<Reporte>();
		this.jListRelacionesSelectReporteTipoRadioVenci.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteTipoRadioVenci.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteTipoRadioVenci.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoRadioVenci.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoRadioVenci.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteTipoRadioVenci=new JScrollPane(this.jListRelacionesSelectReporteTipoRadioVenci);
			
			this.jScrollRelacionesSelectReporteTipoRadioVenci.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoRadioVenci.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoRadioVenci.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteTipoRadioVenci.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsTipoRadioVenci = new GridBagConstraints();
		this.gridBagConstraintsTipoRadioVenci.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoRadioVenci.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoRadioVenci.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoRadioVenci.add(this.jListRelacionesSelectReporteTipoRadioVenci, this.gridBagConstraintsTipoRadioVenci);
		this.jPanelReporteDinamicoTipoRadioVenci.add(this.jScrollRelacionesSelectReporteTipoRadioVenci, this.gridBagConstraintsTipoRadioVenci);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoTipoRadioVenci = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoTipoRadioVenci = new JComboBoxMe();
		this.jListColumnasValoresGraficoTipoRadioVenci = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoTipoRadioVenci = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoTipoRadioVenci.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoTipoRadioVenci.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoRadioVenci.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoRadioVenci.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoTipoRadioVenci, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoTipoRadioVenci = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoTipoRadioVenci.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoTipoRadioVenci.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoRadioVenci.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoRadioVenci.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoTipoRadioVenci, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoTipoRadioVenci = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoTipoRadioVenci.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoTipoRadioVenci.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoRadioVenci.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoRadioVenci.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoRadioVenci = new GridBagConstraints();
		this.gridBagConstraintsTipoRadioVenci.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoRadioVenci.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoRadioVenci.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoRadioVenci.add(this.jLabelGenerarExcelReporteDinamicoTipoRadioVenci, this.gridBagConstraintsTipoRadioVenci);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoTipoRadioVenci = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoTipoRadioVenci.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoTipoRadioVenci,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoTipoRadioVenci.setToolTipText("Generar EXCEL"+" "+TipoRadioVenciConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsTipoRadioVenci = new GridBagConstraints();
		//this.gridBagConstraintsTipoRadioVenci.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsTipoRadioVenci.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsTipoRadioVenci.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoTipoRadioVenci.add(this.jButtonGenerarExcelReporteDinamicoTipoRadioVenci, this.gridBagConstraintsTipoRadioVenci);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsTipoRadioVenci = new GridBagConstraints();
		this.gridBagConstraintsTipoRadioVenci.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoRadioVenci.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoRadioVenci.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoRadioVenci.add(this.jComboBoxTiposReportesDinamicoTipoRadioVenci, this.gridBagConstraintsTipoRadioVenci);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoTipoRadioVenci = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoTipoRadioVenci.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoTipoRadioVenci.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoRadioVenci.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoRadioVenci.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoRadioVenci = new GridBagConstraints();
		this.gridBagConstraintsTipoRadioVenci.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoRadioVenci.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoRadioVenci.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoRadioVenci.add(this.jLabelTiposArchivoReporteDinamicoTipoRadioVenci, this.gridBagConstraintsTipoRadioVenci);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsTipoRadioVenci = new GridBagConstraints();
		this.gridBagConstraintsTipoRadioVenci.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoRadioVenci.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoRadioVenci.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoRadioVenci.add(this.jComboBoxTiposArchivosReportesDinamicoTipoRadioVenci, this.gridBagConstraintsTipoRadioVenci);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoTipoRadioVenci = new JButtonMe();
		this.jButtonGenerarReporteDinamicoTipoRadioVenci.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoTipoRadioVenci,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoTipoRadioVenci.setToolTipText("Generar"+" "+TipoRadioVenciConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsTipoRadioVenci = new GridBagConstraints();
		this.gridBagConstraintsTipoRadioVenci.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoRadioVenci.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoRadioVenci.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoRadioVenci.add(this.jButtonGenerarReporteDinamicoTipoRadioVenci, this.gridBagConstraintsTipoRadioVenci);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoTipoRadioVenci = new JButtonMe();
		this.jButtonCerrarReporteDinamicoTipoRadioVenci.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoTipoRadioVenci,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoTipoRadioVenci.setToolTipText("Cancelar"+" "+TipoRadioVenciConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoRadioVenci = new GridBagConstraints();
		this.gridBagConstraintsTipoRadioVenci.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoRadioVenci.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoRadioVenci.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoRadioVenci.add(this.jButtonCerrarReporteDinamicoTipoRadioVenci, this.gridBagConstraintsTipoRadioVenci);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalTipoRadioVenci = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoTipoRadioVenci= new JScrollPane(jPanelReporteDinamicoTipoRadioVenci,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoTipoRadioVenci.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoRadioVenci.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoRadioVenci.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoTipoRadioVenci.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Radio Vencis"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoRadioVenci = new GridBagConstraints();
		this.gridBagConstraintsTipoRadioVenci.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsTipoRadioVenci.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsTipoRadioVenci.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoTipoRadioVenci.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoTipoRadioVenci.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalTipoRadioVenci);
		this.jInternalFrameReporteDinamicoTipoRadioVenci.getContentPane().add(this.jScrollPanelReporteDinamicoTipoRadioVenci, this.gridBagConstraintsTipoRadioVenci);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionTipoRadioVenci() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionTipoRadioVenci = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionTipoRadioVenci = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionTipoRadioVenci.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionTipoRadioVenci.setName("jPanelImportacionTipoRadioVenci"); 
		
		this.jPanelImportacionTipoRadioVenci.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoRadioVenci.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoRadioVenci.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionTipoRadioVenci.setLayout(gridaBagLayoutImportacionTipoRadioVenci);
		
		
		this.jInternalFrameImportacionTipoRadioVenci= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionTipoRadioVenci= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionTipoRadioVenci = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoRadioVenci= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionTipoRadioVenci.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoRadioVenci.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoRadioVenci.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionTipoRadioVenci.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoRadioVenci.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoRadioVenci.setResizable(true);
	    this.jInternalFrameImportacionTipoRadioVenci.setClosable(true);
	    this.jInternalFrameImportacionTipoRadioVenci.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionTipoRadioVenci.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoRadioVenci.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoRadioVenci.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionTipoRadioVenci.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoRadioVenci.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoRadioVenci.setResizable(true);
	    this.jInternalFrameImportacionTipoRadioVenci.setClosable(true);
	    this.jInternalFrameImportacionTipoRadioVenci.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionTipoRadioVenci.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoRadioVenci.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoRadioVenci.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionTipoRadioVenci.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Radio Vencis"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionTipoRadioVenci = new JLabelMe();

		this.jLabelArchivoImportacionTipoRadioVenci.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionTipoRadioVenci.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoRadioVenci.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoRadioVenci.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoRadioVenci = new GridBagConstraints();
		this.gridBagConstraintsTipoRadioVenci.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoRadioVenci.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoRadioVenci.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoRadioVenci.add(this.jLabelArchivoImportacionTipoRadioVenci, this.gridBagConstraintsTipoRadioVenci);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionTipoRadioVenci = new JFileChooser();		
		this.jFileChooserImportacionTipoRadioVenci.setToolTipText("ESCOGER ARCHIVO"+" "+TipoRadioVenciConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionTipoRadioVenci = new JButtonMe();
		this.jButtonAbrirImportacionTipoRadioVenci.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionTipoRadioVenci,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionTipoRadioVenci.setToolTipText("Generar"+" "+TipoRadioVenciConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsTipoRadioVenci = new GridBagConstraints();
		this.gridBagConstraintsTipoRadioVenci.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoRadioVenci.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoRadioVenci.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoRadioVenci.add(this.jButtonAbrirImportacionTipoRadioVenci, this.gridBagConstraintsTipoRadioVenci);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionTipoRadioVenci = new JLabelMe();

		this.jLabelPathArchivoImportacionTipoRadioVenci.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionTipoRadioVenci.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoRadioVenci.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoRadioVenci.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoRadioVenci = new GridBagConstraints();
		this.gridBagConstraintsTipoRadioVenci.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoRadioVenci.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoRadioVenci.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoRadioVenci.add(this.jLabelPathArchivoImportacionTipoRadioVenci, this.gridBagConstraintsTipoRadioVenci);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionTipoRadioVenci=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionTipoRadioVenci.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoRadioVenci.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoRadioVenci.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsTipoRadioVenci = new GridBagConstraints();
		this.gridBagConstraintsTipoRadioVenci.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoRadioVenci.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoRadioVenci.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoRadioVenci.add(this.jTextFieldPathArchivoImportacionTipoRadioVenci, this.gridBagConstraintsTipoRadioVenci);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionTipoRadioVenci = new JButtonMe();
		this.jButtonGenerarImportacionTipoRadioVenci.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionTipoRadioVenci,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionTipoRadioVenci.setToolTipText("Generar"+" "+TipoRadioVenciConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsTipoRadioVenci = new GridBagConstraints();
		this.gridBagConstraintsTipoRadioVenci.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoRadioVenci.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoRadioVenci.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoRadioVenci.add(this.jButtonGenerarImportacionTipoRadioVenci, this.gridBagConstraintsTipoRadioVenci);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionTipoRadioVenci = new JButtonMe();
		this.jButtonCerrarImportacionTipoRadioVenci.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionTipoRadioVenci,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionTipoRadioVenci.setToolTipText("Cancelar"+" "+TipoRadioVenciConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoRadioVenci = new GridBagConstraints();
		this.gridBagConstraintsTipoRadioVenci.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoRadioVenci.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoRadioVenci.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoRadioVenci.add(this.jButtonCerrarImportacionTipoRadioVenci, this.gridBagConstraintsTipoRadioVenci);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalTipoRadioVenci = new GridBagLayout();
		
		this.jScrollPanelImportacionTipoRadioVenci= new JScrollPane(jPanelImportacionTipoRadioVenci,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsTipoRadioVenci = new GridBagConstraints();
		this.gridBagConstraintsTipoRadioVenci.gridy =iPosYImportacion;
		this.gridBagConstraintsTipoRadioVenci.gridx =iPosXImportacion;
		this.gridBagConstraintsTipoRadioVenci.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionTipoRadioVenci.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionTipoRadioVenci.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalTipoRadioVenci);
		this.jInternalFrameImportacionTipoRadioVenci.getContentPane().add(this.jScrollPanelImportacionTipoRadioVenci, this.gridBagConstraintsTipoRadioVenci);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByTipoRadioVenci(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByTipoRadioVenci = new JButtonMe();
			this.jButtonAbrirOrderByTipoRadioVenci.setText("Orden");
			this.jButtonAbrirOrderByTipoRadioVenci.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoRadioVenci,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoRadioVenci, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByTipoRadioVenci";
			inputMap = this.jButtonAbrirOrderByTipoRadioVenci.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByTipoRadioVenci.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByTipoRadioVenci"));
		
		
			GridBagLayout gridaBagLayoutOrderByTipoRadioVenci = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByTipoRadioVenci = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByTipoRadioVenci.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByTipoRadioVenci.setName("jPanelOrderByTipoRadioVenci"); 
			
			this.jPanelOrderByTipoRadioVenci.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoRadioVenci.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoRadioVenci.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByTipoRadioVenci, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByTipoRadioVenci.setLayout(gridaBagLayoutOrderByTipoRadioVenci);
			
			
			this.jTableDatosTipoRadioVenciOrderBy = new JTableMe();        
			this.jTableDatosTipoRadioVenciOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosTipoRadioVenciOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosTipoRadioVenciOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosTipoRadioVenciOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosTipoRadioVenciOrderBy.setViewportView(this.jTableDatosTipoRadioVenciOrderBy);
			this.jTableDatosTipoRadioVenciOrderBy.setFillsViewportHeight(true);
			this.jTableDatosTipoRadioVenciOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByTipoRadioVenci= new OrderByJInternalFrame();
			this.jInternalFrameOrderByTipoRadioVenci= new OrderByJInternalFrame();
			this.jScrollPanelOrderByTipoRadioVenci = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteTipoRadioVenci= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByTipoRadioVenci.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByTipoRadioVenci.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByTipoRadioVenci.setTitle("Orden");
			this.jInternalFrameOrderByTipoRadioVenci.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByTipoRadioVenci.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByTipoRadioVenci.setResizable(true);
			this.jInternalFrameOrderByTipoRadioVenci.setClosable(true);
			this.jInternalFrameOrderByTipoRadioVenci.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByTipoRadioVenci, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByTipoRadioVenci.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoRadioVenci.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoRadioVenci.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByTipoRadioVenci, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByTipoRadioVenci.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Radio Vencis"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsTipoRadioVenci = new GridBagConstraints();
			this.gridBagConstraintsTipoRadioVenci.gridy =iPosYOrderBy++;
			this.gridBagConstraintsTipoRadioVenci.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoRadioVenci.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsTipoRadioVenci.ipady =150;
				
			this.jPanelOrderByTipoRadioVenci.add(jScrollPanelDatosTipoRadioVenciOrderBy, this.gridBagConstraintsTipoRadioVenci);//this.jTableDatosTipoRadioVenciTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByTipoRadioVenci = new JButtonMe();
			this.jButtonCerrarOrderByTipoRadioVenci.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByTipoRadioVenci,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByTipoRadioVenci.setToolTipText("Cancelar"+" "+TipoRadioVenciConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByTipoRadioVenci, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsTipoRadioVenci = new GridBagConstraints();
			this.gridBagConstraintsTipoRadioVenci.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoRadioVenci.gridy = iPosYOrderBy++;
			this.gridBagConstraintsTipoRadioVenci.gridx = iPosXOrderBy;
									
			this.jPanelOrderByTipoRadioVenci.add(this.jButtonCerrarOrderByTipoRadioVenci, this.gridBagConstraintsTipoRadioVenci);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalTipoRadioVenci = new GridBagLayout();
			
			this.jScrollPanelOrderByTipoRadioVenci= new JScrollPane(jPanelOrderByTipoRadioVenci,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsTipoRadioVenci = new GridBagConstraints();
			this.gridBagConstraintsTipoRadioVenci.gridy =iPosYOrderBy;
			this.gridBagConstraintsTipoRadioVenci.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoRadioVenci.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByTipoRadioVenci.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByTipoRadioVenci.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalTipoRadioVenci);
			
			this.jInternalFrameOrderByTipoRadioVenci.getContentPane().add(this.jScrollPanelOrderByTipoRadioVenci, this.gridBagConstraintsTipoRadioVenci);			
		
		} else {
			this.jButtonAbrirOrderByTipoRadioVenci = new JButtonMe();
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
		int iWidthTableCalculado=0;//730
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=330;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=200;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=200;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.tiporadiovenciSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosTipoRadioVenci.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosTipoRadioVenci.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosTipoRadioVenci.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosTipoRadioVenci.getRowHeight();//TipoRadioVenciConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.tiporadiovenciSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > TipoRadioVenciConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoRadioVenci.isSelected()) {
					iHeightTable=TipoRadioVenciConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoRadioVenciConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoRadioVenciConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > TipoRadioVenciConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoRadioVenci.isSelected()) {
					iHeightTable=TipoRadioVenciConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoRadioVenciConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoRadioVenciConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosTipoRadioVenci.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoRadioVenci.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoRadioVenci.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosTipoRadioVenci.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoRadioVenci.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoRadioVenci.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByTipoRadioVenci!=null && this.jInternalFrameOrderByTipoRadioVenci.getjTableDatosOrderBy()!=null) {
			//if(!this.tiporadiovenciSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByTipoRadioVenci.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByTipoRadioVenci.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByTipoRadioVenci.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByTipoRadioVenci.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByTipoRadioVenci.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByTipoRadioVenci.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByTipoRadioVenci.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosTipoRadioVenci.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoRadioVenci.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoRadioVenci.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=tiporadiovenciLogic.getTipoRadioVencis().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tiporadiovencis.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<TipoRadioVenci> TraerTipoRadioVenciBeans(List<TipoRadioVenci> tiporadiovencis,ArrayList<Classe> classes)throws Exception {
		try {
			for(TipoRadioVenci tiporadiovenci:tiporadiovencis) {
					
				if(!(TipoRadioVenciConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || TipoRadioVenciConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					tiporadiovenci.setsDetalleGeneralEntityReporte(TipoRadioVenciConstantesFunciones.getTipoRadioVenciDescripcion(tiporadiovenci));
										
						
					
					

					if(tiporadiovenci.getRadioVenciProves()!=null && Funciones.existeClass(classes,RadioVenciProve.class)) {
						try{tiporadiovenci.setradiovenciprovesDescripcionReporte(new JRBeanCollectionDataSource(RadioVenciProveJInternalFrame.TraerRadioVenciProveBeans(tiporadiovenci.getRadioVenciProves(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(tiporadiovenci.getRadioVenciClienteProves()!=null && Funciones.existeClass(classes,RadioVenciClienteProve.class)) {
						try{tiporadiovenci.setradiovenciclienteprovesDescripcionReporte(new JRBeanCollectionDataSource(RadioVenciClienteProveJInternalFrame.TraerRadioVenciClienteProveBeans(tiporadiovenci.getRadioVenciClienteProves(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//tiporadiovenci.setsDetalleGeneralEntityReporte(tiporadiovenci.getsDetalleGeneralEntityReporte());
										
				}
				
				//tiporadiovencibeans.add(tiporadiovencibean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return tiporadiovencis;
    }
	//PARA REPORTES FIN
}
