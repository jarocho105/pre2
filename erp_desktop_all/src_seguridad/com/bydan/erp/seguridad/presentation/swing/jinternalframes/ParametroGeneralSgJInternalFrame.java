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
package com.bydan.erp.seguridad.presentation.swing.jinternalframes;



import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;





//import com.bydan.erp.seguridad.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.seguridad.util.ParametroGeneralSgConstantesFunciones;

import com.bydan.erp.seguridad.business.logic.*;
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
public class ParametroGeneralSgJInternalFrame extends ParametroGeneralSgBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarParametroGeneralSg;
	
	protected JMenuBar jmenuBarParametroGeneralSg;
	
	protected JMenu jmenuParametroGeneralSg;
	protected JMenu jmenuDatosParametroGeneralSg;
	protected JMenu jmenuArchivoParametroGeneralSg;
	protected JMenu jmenuAccionesParametroGeneralSg;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosParametroGeneralSg = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutParametroGeneralSg;	
	protected GridBagConstraints gridBagConstraintsParametroGeneralSg;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public ParametroGeneralSgDetalleFormJInternalFrame jInternalFrameDetalleFormParametroGeneralSg;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoParametroGeneralSg;	
	protected ImportacionJInternalFrame jInternalFrameImportacionParametroGeneralSg;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public ParametroGeneralSgSessionBean parametrogeneralsgSessionBean;
		
	
	
	
	//protected JDesktopPane jDesktopPane;
	public List<ParametroGeneralSg> parametrogeneralsgs;		
	public List<ParametroGeneralSg> parametrogeneralsgsEliminados;	
	public List<ParametroGeneralSg> parametrogeneralsgsAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByParametroGeneralSg;		
	protected JButton jButtonAbrirOrderByParametroGeneralSg;
	
	
	//protected JPanel jPanelOrderByParametroGeneralSg;
	//public JScrollPane jScrollPanelOrderByParametroGeneralSg;	
	//protected JButton jButtonCerrarOrderByParametroGeneralSg;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public ParametroGeneralSgLogic parametrogeneralsgLogic;
	
	
	
	public JScrollPane jScrollPanelDatosParametroGeneralSg;
	public JScrollPane jScrollPanelDatosEdicionParametroGeneralSg;
	public JScrollPane jScrollPanelDatosGeneralParametroGeneralSg;
    
	
	
	//public JScrollPane jScrollPanelDatosParametroGeneralSgOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoParametroGeneralSg;
	//public JScrollPane jScrollPanelImportacionParametroGeneralSg;
	
	
	
	protected JPanel jPanelAccionesParametroGeneralSg;
	
    protected JPanel jPanelPaginacionParametroGeneralSg;
    protected JPanel jPanelParametrosReportesParametroGeneralSg;
	protected JPanel jPanelParametrosReportesAccionesParametroGeneralSg;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1ParametroGeneralSg;
	protected JPanel jPanelParametrosAuxiliar2ParametroGeneralSg;
	protected JPanel jPanelParametrosAuxiliar3ParametroGeneralSg;
	protected JPanel jPanelParametrosAuxiliar4ParametroGeneralSg;
	//protected JPanel jPanelParametrosAuxiliar5ParametroGeneralSg;
	
	
	
	//protected JPanel jPanelReporteDinamicoParametroGeneralSg;
	//protected JPanel jPanelImportacionParametroGeneralSg;
	
	
	public JTable jTableDatosParametroGeneralSg;
	
	
	
	//public JTable jTableDatosParametroGeneralSgOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoParametroGeneralSg;
	protected JButton jButtonDuplicarParametroGeneralSg;
	protected JButton jButtonCopiarParametroGeneralSg;
	protected JButton jButtonVerFormParametroGeneralSg;
	protected JButton jButtonNuevoRelacionesParametroGeneralSg;
	protected JButton jButtonModificarParametroGeneralSg;
	
    protected JButton jButtonGuardarCambiosTablaParametroGeneralSg;
	protected JButton jButtonCerrarParametroGeneralSg;
	
	
	protected JButton jButtonRecargarInformacionParametroGeneralSg;
	protected JButton jButtonProcesarInformacionParametroGeneralSg;
	
	
	protected JButton jButtonAnterioresParametroGeneralSg;
	protected JButton jButtonSiguientesParametroGeneralSg;
	protected JButton jButtonNuevoGuardarCambiosParametroGeneralSg;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoParametroGeneralSg;
	//protected JButton jButtonCerrarReporteDinamicoParametroGeneralSg;
	//protected JButton jButtonGenerarExcelReporteDinamicoParametroGeneralSg;	
	
	
	
	//protected JButton jButtonAbrirImportacionParametroGeneralSg;
	//protected JButton jButtonGenerarImportacionParametroGeneralSg;
	//protected JButton jButtonCerrarImportacionParametroGeneralSg;
	//protected JFileChooser jFileChooserImportacionParametroGeneralSg;
	//protected File fileImportacionParametroGeneralSg;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarParametroGeneralSg;
	protected JButton jButtonDuplicarToolBarParametroGeneralSg;
	protected JButton jButtonNuevoRelacionesToolBarParametroGeneralSg;
	
	
	public JButton jButtonGuardarCambiosToolBarParametroGeneralSg;
	protected JButton jButtonCopiarToolBarParametroGeneralSg;
	protected JButton jButtonVerFormToolBarParametroGeneralSg;
	public JButton jButtonGuardarCambiosTablaToolBarParametroGeneralSg;
	protected JButton jButtonMostrarOcultarTablaToolBarParametroGeneralSg;
	protected JButton jButtonCerrarToolBarParametroGeneralSg;
	
	protected JButton jButtonRecargarInformacionToolBarParametroGeneralSg;
	protected JButton jButtonProcesarInformacionToolBarParametroGeneralSg;
	protected JButton jButtonAnterioresToolBarParametroGeneralSg;
	protected JButton jButtonSiguientesToolBarParametroGeneralSg;
	protected JButton jButtonNuevoGuardarCambiosToolBarParametroGeneralSg;
	protected JButton jButtonAbrirOrderByToolBarParametroGeneralSg;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoParametroGeneralSg;
	protected JMenuItem jMenuItemDuplicarParametroGeneralSg;
	protected JMenuItem jMenuItemNuevoRelacionesParametroGeneralSg;
	
	
	protected JMenuItem jMenuItemGuardarCambiosParametroGeneralSg;
	protected JMenuItem jMenuItemCopiarParametroGeneralSg;
	protected JMenuItem jMenuItemVerFormParametroGeneralSg;
	protected JMenuItem jMenuItemGuardarCambiosTablaParametroGeneralSg;
	protected JMenuItem jMenuItemCerrarParametroGeneralSg;
	protected JMenuItem jMenuItemDetalleCerrarParametroGeneralSg;
	protected JMenuItem jMenuItemDetalleAbrirOrderByParametroGeneralSg;
	protected JMenuItem jMenuItemDetalleMostarOcultarParametroGeneralSg;
	
	protected JMenuItem jMenuItemRecargarInformacionParametroGeneralSg;
	protected JMenuItem jMenuItemProcesarInformacionParametroGeneralSg;
	protected JMenuItem jMenuItemAnterioresParametroGeneralSg;
	protected JMenuItem jMenuItemSiguientesParametroGeneralSg;
	protected JMenuItem jMenuItemNuevoGuardarCambiosParametroGeneralSg;
	protected JMenuItem jMenuItemAbrirOrderByParametroGeneralSg;
	protected JMenuItem jMenuItemMostrarOcultarParametroGeneralSg;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesParametroGeneralSg;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosParametroGeneralSg;
	protected JCheckBox jCheckBoxSeleccionadosParametroGeneralSg;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaParametroGeneralSg;
	protected JCheckBox jCheckBoxConGraficoReporteParametroGeneralSg;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesParametroGeneralSg;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesParametroGeneralSg;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoParametroGeneralSg;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoParametroGeneralSg;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesParametroGeneralSg;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionParametroGeneralSg;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesParametroGeneralSg;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesParametroGeneralSg;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarParametroGeneralSg;
	protected JTextField jTextFieldValorCampoGeneralParametroGeneralSg;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteParametroGeneralSg;
	//public JList<Reporte> jListColumnasSelectReporteParametroGeneralSg;
	//public JScrollPane jScrollColumnasSelectReporteParametroGeneralSg;
	
	//public JLabel jLabelRelacionesSelectReporteParametroGeneralSg;
	//public JList<Reporte> jListRelacionesSelectReporteParametroGeneralSg;
	//public JScrollPane jScrollRelacionesSelectReporteParametroGeneralSg;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoParametroGeneralSg;
	//protected JCheckBox jCheckBoxConGraficoDinamicoParametroGeneralSg;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoParametroGeneralSg;
	//public JLabel jLabelTiposArchivoReporteDinamicoParametroGeneralSg;
	
		
	//public JLabel jLabelArchivoImportacionParametroGeneralSg;	
	//public JLabel jLabelPathArchivoImportacionParametroGeneralSg;
	//protected JTextField jTextFieldPathArchivoImportacionParametroGeneralSg;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoParametroGeneralSg;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoParametroGeneralSg;
	
	//public JLabel jLabelColumnaCategoriaValorParametroGeneralSg;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorParametroGeneralSg;
	
	//public JLabel jLabelColumnasValoresGraficoParametroGeneralSg;
	//public JList<Reporte> jListColumnasValoresGraficoParametroGeneralSg;
	//public JScrollPane jScrollColumnasValoresGraficoParametroGeneralSg;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoParametroGeneralSg;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoParametroGeneralSg;	
	
	
	
	
	
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
	//public int iHeightFormulario=1430;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public ParametroGeneralSgJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("ParametroGeneralSg No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParametroGeneralSgJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ParametroGeneralSg No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParametroGeneralSgJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ParametroGeneralSg No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParametroGeneralSgJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ParametroGeneralSg No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionParametroGeneralSg)	{
		this.jButtonRecargarInformacionParametroGeneralSg = jButtonRecargarInformacionParametroGeneralSg;
	}
	
	public JButton getjButtonProcesarInformacionParametroGeneralSg() {
		return this.jButtonProcesarInformacionParametroGeneralSg;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionParametroGeneralSg)	{
		this.jButtonProcesarInformacionParametroGeneralSg = jButtonProcesarInformacionParametroGeneralSg;
	}
	
	
	public JButton getjButtonRecargarInformacionParametroGeneralSg() {
		return this.jButtonRecargarInformacionParametroGeneralSg;
	}
	
	
	public List<ParametroGeneralSg> getparametrogeneralsgs() {
		return this.parametrogeneralsgs;
	}

	public void setparametrogeneralsgs(List<ParametroGeneralSg> parametrogeneralsgs) {
		this.parametrogeneralsgs = parametrogeneralsgs;
	}
	
	public List<ParametroGeneralSg> getparametrogeneralsgsAux() {
		return this.parametrogeneralsgsAux;
	}

	public void setparametrogeneralsgsAux(List<ParametroGeneralSg> parametrogeneralsgsAux) {
		this.parametrogeneralsgsAux = parametrogeneralsgsAux;
	}
	
	public List<ParametroGeneralSg> getparametrogeneralsgsEliminados() {
		return this.parametrogeneralsgsEliminados;
	}

	public void setParametroGeneralSgsEliminados(List<ParametroGeneralSg> parametrogeneralsgsEliminados) {
		this.parametrogeneralsgsEliminados = parametrogeneralsgsEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarParametroGeneralSg() {
		return jComboBoxTiposSeleccionarParametroGeneralSg;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarParametroGeneralSg(
			JComboBox jComboBoxTiposSeleccionarParametroGeneralSg) {
		this.jComboBoxTiposSeleccionarParametroGeneralSg = jComboBoxTiposSeleccionarParametroGeneralSg;
	}
	
	public void setBorderResaltarTiposSeleccionarParametroGeneralSg() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarParametroGeneralSg.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarParametroGeneralSg .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralParametroGeneralSg() {
		return jTextFieldValorCampoGeneralParametroGeneralSg;
	}

	public void setjTextFieldValorCampoGeneralParametroGeneralSg(
			JTextField jTextFieldValorCampoGeneralParametroGeneralSg) {
		this.jTextFieldValorCampoGeneralParametroGeneralSg = jTextFieldValorCampoGeneralParametroGeneralSg;
	}

	public void setBorderResaltarValorCampoGeneralParametroGeneralSg() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroGeneralSg.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralParametroGeneralSg .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosParametroGeneralSg() {
		return this.jCheckBoxSeleccionarTodosParametroGeneralSg;
	}

	public void setjCheckBoxSeleccionarTodosParametroGeneralSg(
			JCheckBox jCheckBoxSeleccionarTodosParametroGeneralSg) {
		this.jCheckBoxSeleccionarTodosParametroGeneralSg = jCheckBoxSeleccionarTodosParametroGeneralSg;
	}

	public void setBorderResaltarSeleccionarTodosParametroGeneralSg() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroGeneralSg.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosParametroGeneralSg .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosParametroGeneralSg() {
		return this.jCheckBoxSeleccionadosParametroGeneralSg;
	}

	public void setjCheckBoxSeleccionadosParametroGeneralSg(
			JCheckBox jCheckBoxSeleccionadosParametroGeneralSg) {
		this.jCheckBoxSeleccionadosParametroGeneralSg = jCheckBoxSeleccionadosParametroGeneralSg;
	}
	
	public void setBorderResaltarSeleccionadosParametroGeneralSg() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroGeneralSg.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosParametroGeneralSg .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesParametroGeneralSg() {
		return this.jComboBoxTiposArchivosReportesParametroGeneralSg;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesParametroGeneralSg(
			JComboBox jComboBoxTiposArchivosReportesParametroGeneralSg) {
		this.jComboBoxTiposArchivosReportesParametroGeneralSg = jComboBoxTiposArchivosReportesParametroGeneralSg;
	}

	public void setBorderResaltarTiposArchivosReportesParametroGeneralSg() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroGeneralSg.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesParametroGeneralSg .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesParametroGeneralSg() {
		return this.jComboBoxTiposReportesParametroGeneralSg;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesParametroGeneralSg(
			JComboBox jComboBoxTiposReportesParametroGeneralSg) {
		this.jComboBoxTiposReportesParametroGeneralSg = jComboBoxTiposReportesParametroGeneralSg;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoParametroGeneralSg() {
	//	return jComboBoxTiposReportesDinamicoParametroGeneralSg;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoParametroGeneralSg(
	//		JComboBox jComboBoxTiposReportesDinamicoParametroGeneralSg) {
	//	this.jComboBoxTiposReportesDinamicoParametroGeneralSg = jComboBoxTiposReportesDinamicoParametroGeneralSg;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoParametroGeneralSg() {
	//	return jComboBoxTiposArchivosReportesDinamicoParametroGeneralSg;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoParametroGeneralSg(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoParametroGeneralSg) {
	//	this.jComboBoxTiposArchivosReportesDinamicoParametroGeneralSg = jComboBoxTiposArchivosReportesDinamicoParametroGeneralSg;
	//}
	
	public void setBorderResaltarTiposReportesParametroGeneralSg() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroGeneralSg.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesParametroGeneralSg .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesParametroGeneralSg() {
		return this.jComboBoxTiposGraficosReportesParametroGeneralSg;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesParametroGeneralSg(
			JComboBox jComboBoxTiposGraficosReportesParametroGeneralSg) {
		this.jComboBoxTiposGraficosReportesParametroGeneralSg = jComboBoxTiposGraficosReportesParametroGeneralSg;
	}
	
	public void setBorderResaltarTiposGraficosReportesParametroGeneralSg() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroGeneralSg.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesParametroGeneralSg .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionParametroGeneralSg() {
		return this.jComboBoxTiposPaginacionParametroGeneralSg;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionParametroGeneralSg(
			JComboBox jComboBoxTiposPaginacionParametroGeneralSg) {
		this.jComboBoxTiposPaginacionParametroGeneralSg = jComboBoxTiposPaginacionParametroGeneralSg;
	}
	
	public void setBorderResaltarTiposPaginacionParametroGeneralSg() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroGeneralSg.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionParametroGeneralSg .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesParametroGeneralSg() {
		return this.jComboBoxTiposRelacionesParametroGeneralSg;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesParametroGeneralSg() {
		return this.jComboBoxTiposAccionesParametroGeneralSg;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesParametroGeneralSg(
			JComboBox jComboBoxTiposRelacionesParametroGeneralSg) {
		this.jComboBoxTiposRelacionesParametroGeneralSg = jComboBoxTiposRelacionesParametroGeneralSg;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesParametroGeneralSg(
			JComboBox jComboBoxTiposAccionesParametroGeneralSg) {
		this.jComboBoxTiposAccionesParametroGeneralSg = jComboBoxTiposAccionesParametroGeneralSg;
	}
	
	public void setBorderResaltarTiposRelacionesParametroGeneralSg() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroGeneralSg.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesParametroGeneralSg .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesParametroGeneralSg() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroGeneralSg.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesParametroGeneralSg .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoParametroGeneralSg() {
	//	return jCheckBoxConGraficoDinamicoParametroGeneralSg;
	//}

	//public void setjCheckBoxConGraficoDinamicoParametroGeneralSg(
	//		JCheckBox jCheckBoxConGraficoDinamicoParametroGeneralSg) {
	//	this.jCheckBoxConGraficoDinamicoParametroGeneralSg = jCheckBoxConGraficoDinamicoParametroGeneralSg;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoParametroGeneralSg() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarParametroGeneralSg.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoParametroGeneralSg .setBorder(borderResaltar);		
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
		this.parametrogeneralsgSessionBean=new ParametroGeneralSgSessionBean();
		
		this.parametrogeneralsgSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.parametrogeneralsgSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.parametrogeneralsgSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=ParametroGeneralSgJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=ParametroGeneralSgJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ParametroGeneralSgJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ParametroGeneralSgJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ParametroGeneralSgJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Parametro General MANTENIMIENTO"));
		
		
		if(iWidth > 1350) {
			iWidth=1350;
		}
		
		if(iHeight > 650) {
			iHeight=650;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.parametrogeneralsgSessionBean.getEsGuardarRelacionado()) {
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
		
		ParametroGeneralSgJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("ParametroGeneralSg No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarParametroGeneralSg= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarParametroGeneralSg=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarParametroGeneralSg,this.jTtoolBarParametroGeneralSg,
							"nuevo","nuevo","Nuevo"+" "+ParametroGeneralSgConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarParametroGeneralSg=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarParametroGeneralSg,this.jTtoolBarParametroGeneralSg,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarParametroGeneralSg=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarParametroGeneralSg,this.jTtoolBarParametroGeneralSg,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+ParametroGeneralSgConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarParametroGeneralSg=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarParametroGeneralSg,this.jTtoolBarParametroGeneralSg,
							"duplicar","duplicar","Duplicar"+" "+ParametroGeneralSgConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarParametroGeneralSg=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarParametroGeneralSg,this.jTtoolBarParametroGeneralSg,
							"copiar","copiar","Copiar"+" "+ParametroGeneralSgConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarParametroGeneralSg=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarParametroGeneralSg,this.jTtoolBarParametroGeneralSg,
							"ver_form","ver_form","Ver"+" "+ParametroGeneralSgConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarParametroGeneralSg=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarParametroGeneralSg,this.jTtoolBarParametroGeneralSg,
							"recargar","recargar","Recargar"+" "+ParametroGeneralSgConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarParametroGeneralSg=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarParametroGeneralSg,this.jTtoolBarParametroGeneralSg,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarParametroGeneralSg=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarParametroGeneralSg,this.jTtoolBarParametroGeneralSg,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarParametroGeneralSg=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarParametroGeneralSg,this.jTtoolBarParametroGeneralSg,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarParametroGeneralSg=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarParametroGeneralSg,this.jTtoolBarParametroGeneralSg,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarParametroGeneralSg=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarParametroGeneralSg,this.jTtoolBarParametroGeneralSg,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+ParametroGeneralSgConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarParametroGeneralSg=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarParametroGeneralSg,this.jTtoolBarParametroGeneralSg,
							"cerrar","cerrar","Salir"+" "+ParametroGeneralSgConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarParametroGeneralSg=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarParametroGeneralSg;
			
				this.jButtonProcesarInformacionToolBarParametroGeneralSg=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarParametroGeneralSg;
				
		//protected JButton jButtonModificarToolBarParametroGeneralSg;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarParametroGeneralSg=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuParametroGeneralSg=new JMenuMe("General");
		this.jmenuArchivoParametroGeneralSg=new JMenuMe("Archivo");
		this.jmenuAccionesParametroGeneralSg=new JMenuMe("Acciones");
		this.jmenuDatosParametroGeneralSg=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoParametroGeneralSg= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoParametroGeneralSg.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoParametroGeneralSg,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoParametroGeneralSg, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarParametroGeneralSg= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarParametroGeneralSg.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarParametroGeneralSg,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarParametroGeneralSg, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesParametroGeneralSg= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesParametroGeneralSg.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesParametroGeneralSg,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesParametroGeneralSg, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosParametroGeneralSg= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosParametroGeneralSg.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosParametroGeneralSg,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosParametroGeneralSg, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarParametroGeneralSg= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarParametroGeneralSg.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarParametroGeneralSg,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarParametroGeneralSg, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormParametroGeneralSg= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormParametroGeneralSg.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormParametroGeneralSg,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormParametroGeneralSg, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaParametroGeneralSg= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaParametroGeneralSg.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaParametroGeneralSg,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaParametroGeneralSg, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarParametroGeneralSg= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarParametroGeneralSg.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarParametroGeneralSg,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarParametroGeneralSg, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionParametroGeneralSg= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionParametroGeneralSg.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionParametroGeneralSg,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionParametroGeneralSg, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionParametroGeneralSg= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionParametroGeneralSg.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionParametroGeneralSg,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresParametroGeneralSg= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresParametroGeneralSg.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresParametroGeneralSg,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresParametroGeneralSg, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesParametroGeneralSg= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesParametroGeneralSg.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesParametroGeneralSg,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesParametroGeneralSg, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByParametroGeneralSg= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByParametroGeneralSg.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByParametroGeneralSg,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByParametroGeneralSg, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarParametroGeneralSg= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarParametroGeneralSg.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarParametroGeneralSg,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarParametroGeneralSg, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByParametroGeneralSg= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByParametroGeneralSg.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByParametroGeneralSg,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByParametroGeneralSg, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarParametroGeneralSg= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarParametroGeneralSg.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarParametroGeneralSg,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarParametroGeneralSg, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosParametroGeneralSg= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosParametroGeneralSg.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosParametroGeneralSg,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosParametroGeneralSg, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoParametroGeneralSg.add(this.jMenuItemCerrarParametroGeneralSg);
			
			this.jmenuAccionesParametroGeneralSg.add(this.jMenuItemNuevoParametroGeneralSg);
			this.jmenuAccionesParametroGeneralSg.add(this.jMenuItemNuevoGuardarCambiosParametroGeneralSg);
			this.jmenuAccionesParametroGeneralSg.add(this.jMenuItemNuevoRelacionesParametroGeneralSg);
			this.jmenuAccionesParametroGeneralSg.add(this.jMenuItemGuardarCambiosTablaParametroGeneralSg);		
			this.jmenuAccionesParametroGeneralSg.add(this.jMenuItemDuplicarParametroGeneralSg);		
			this.jmenuAccionesParametroGeneralSg.add(this.jMenuItemCopiarParametroGeneralSg);		
			this.jmenuAccionesParametroGeneralSg.add(this.jMenuItemVerFormParametroGeneralSg);		
			
			this.jmenuDatosParametroGeneralSg.add(this.jMenuItemRecargarInformacionParametroGeneralSg);				
			this.jmenuDatosParametroGeneralSg.add(this.jMenuItemAnterioresParametroGeneralSg);				
			this.jmenuDatosParametroGeneralSg.add(this.jMenuItemSiguientesParametroGeneralSg);				
			this.jmenuDatosParametroGeneralSg.add(this.jMenuItemAbrirOrderByParametroGeneralSg);				
			this.jmenuDatosParametroGeneralSg.add(this.jMenuItemMostrarOcultarParametroGeneralSg);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesParametroGeneralSg.add(this.jMenuItemGuardarCambiosParametroGeneralSg);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoParametroGeneralSg, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesParametroGeneralSg, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosParametroGeneralSg, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarParametroGeneralSg.add(this.jmenuArchivoParametroGeneralSg);		
			this.jmenuBarParametroGeneralSg.add(this.jmenuAccionesParametroGeneralSg);		
			this.jmenuBarParametroGeneralSg.add(this.jmenuDatosParametroGeneralSg);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarParametroGeneralSg);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasParametroGeneralSg() {
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
			//this.jInternalFrameDetalleParametroGeneralSg = new ParametroGeneralSgDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Parametro General DATOS");
			this.jInternalFrameDetalleFormParametroGeneralSg = new ParametroGeneralSgDetalleFormJInternalFrame(jDesktopPane,this.parametrogeneralsgSessionBean.getConGuardarRelaciones(),this.parametrogeneralsgSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormParametroGeneralSg = null;//new ParametroGeneralSgDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutParametroGeneralSg= new GridBagLayout();
		
		
		this.jTableDatosParametroGeneralSg = new JTableMe();      
		
		String sToolTipParametroGeneralSg="";
		sToolTipParametroGeneralSg=ParametroGeneralSgConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipParametroGeneralSg+="(Seguridad.ParametroGeneralSg)";
		}
		
		if(!this.parametrogeneralsgSessionBean.getEsGuardarRelacionado()) {
			sToolTipParametroGeneralSg+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosParametroGeneralSg.setToolTipText(sToolTipParametroGeneralSg);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosParametroGeneralSg);
		this.jTableDatosParametroGeneralSg.setAutoCreateRowSorter(true);
		this.jTableDatosParametroGeneralSg.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosParametroGeneralSg.setRowSelectionAllowed(true);
		this.jTableDatosParametroGeneralSg.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosParametroGeneralSg,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoParametroGeneralSg = new JButtonMe();
		this.jButtonDuplicarParametroGeneralSg = new JButtonMe();
		this.jButtonCopiarParametroGeneralSg = new JButtonMe();
		this.jButtonVerFormParametroGeneralSg = new JButtonMe();
		this.jButtonNuevoRelacionesParametroGeneralSg = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaParametroGeneralSg = new JButtonMe();
		this.jButtonCerrarParametroGeneralSg = new JButtonMe();
		
		this.jScrollPanelDatosParametroGeneralSg = new JScrollPane();   
        this.jScrollPanelDatosGeneralParametroGeneralSg = new JScrollPane();
		
				
		
		
		this.jPanelAccionesParametroGeneralSg = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Parametro General";
		
		if(!this.parametrogeneralsgSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosParametroGeneralSg.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Parametro Generales" + this.sPath));
		} else {
			this.jScrollPanelDatosParametroGeneralSg.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralParametroGeneralSg.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesParametroGeneralSg.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesParametroGeneralSg.setToolTipText("Acciones");
        this.jPanelAccionesParametroGeneralSg.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralParametroGeneralSg, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosParametroGeneralSg, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoParametroGeneralSg=new ReporteDinamicoJInternalFrame(ParametroGeneralSgConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoParametroGeneralSg();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionParametroGeneralSg=new ImportacionJInternalFrame(ParametroGeneralSgConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionParametroGeneralSg();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByParametroGeneralSg = new JButtonMe();
		
		this.jButtonAbrirOrderByParametroGeneralSg.setText("Orden");
		this.jButtonAbrirOrderByParametroGeneralSg.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByParametroGeneralSg,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByParametroGeneralSg, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByParametroGeneralSg.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByParametroGeneralSg.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByParametroGeneralSg=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByParametroGeneralSg,false,this);
			
			//this.cargarOrderByParametroGeneralSg(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByParametroGeneralSg=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByParametroGeneralSg,true,this);
			
			//this.cargarOrderByParametroGeneralSg(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosParametroGeneralSg.setMinimumSize(new Dimension(400,50));//1330
		this.jTableDatosParametroGeneralSg.setMaximumSize(new Dimension(400,50));//1330
		this.jTableDatosParametroGeneralSg.setPreferredSize(new Dimension(400,50));//1330
		
		this.jScrollPanelDatosParametroGeneralSg.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosParametroGeneralSg.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosParametroGeneralSg.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoParametroGeneralSg.setText("Nuevo");
		this.jButtonDuplicarParametroGeneralSg.setText("Duplicar");
		this.jButtonCopiarParametroGeneralSg.setText("Copiar");
		this.jButtonVerFormParametroGeneralSg.setText("Ver");
		this.jButtonNuevoRelacionesParametroGeneralSg.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaParametroGeneralSg.setText("Guardar");
		this.jButtonCerrarParametroGeneralSg.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoParametroGeneralSg,"nuevo_button","Nuevo",this.parametrogeneralsgSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarParametroGeneralSg,"duplicar_button","Duplicar",this.parametrogeneralsgSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarParametroGeneralSg,"copiar_button","Copiar",this.parametrogeneralsgSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormParametroGeneralSg,"ver_form","Ver",this.parametrogeneralsgSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesParametroGeneralSg,"nuevorelaciones_button","Nuevo Rel",this.parametrogeneralsgSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaParametroGeneralSg,"guardarcambiostabla_button","Guardar",this.parametrogeneralsgSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarParametroGeneralSg,"cerrar_button","Salir",this.parametrogeneralsgSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoParametroGeneralSg, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarParametroGeneralSg, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarParametroGeneralSg, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormParametroGeneralSg, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesParametroGeneralSg, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaParametroGeneralSg, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarParametroGeneralSg, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoParametroGeneralSg.setToolTipText("Nuevo"+" "+ParametroGeneralSgConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarParametroGeneralSg.setToolTipText("Duplicar"+" "+ParametroGeneralSgConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarParametroGeneralSg.setToolTipText("Copiar"+" "+ParametroGeneralSgConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormParametroGeneralSg.setToolTipText("Ver"+" "+ParametroGeneralSgConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesParametroGeneralSg.setToolTipText("Nuevo Rel"+" "+ParametroGeneralSgConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaParametroGeneralSg.setToolTipText("Guardar"+" "+ParametroGeneralSgConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarParametroGeneralSg.setToolTipText("Salir"+" "+ParametroGeneralSgConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoParametroGeneralSg";
		inputMap = this.jButtonNuevoParametroGeneralSg.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoParametroGeneralSg.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoParametroGeneralSg"));
		
		//DUPLICAR
		sMapKey = "DuplicarParametroGeneralSg";
		inputMap = this.jButtonDuplicarParametroGeneralSg.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarParametroGeneralSg.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarParametroGeneralSg"));
		
		//COPIAR
		sMapKey = "CopiarParametroGeneralSg";
		inputMap = this.jButtonCopiarParametroGeneralSg.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarParametroGeneralSg.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarParametroGeneralSg"));
		
		//VEr FORM
		sMapKey = "VerFormParametroGeneralSg";
		inputMap = this.jButtonVerFormParametroGeneralSg.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormParametroGeneralSg.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormParametroGeneralSg"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesParametroGeneralSg";
		inputMap = this.jButtonNuevoRelacionesParametroGeneralSg.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesParametroGeneralSg.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesParametroGeneralSg"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarParametroGeneralSg";
		inputMap = this.jButtonModificarParametroGeneralSg.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarParametroGeneralSg.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarParametroGeneralSg"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarParametroGeneralSg";
		inputMap = this.jButtonCerrarParametroGeneralSg.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarParametroGeneralSg.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarParametroGeneralSg"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaParametroGeneralSg";
		inputMap = this.jButtonGuardarCambiosTablaParametroGeneralSg.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaParametroGeneralSg.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaParametroGeneralSg"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesParametroGeneralSg = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesParametroGeneralSg = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionParametroGeneralSg = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1ParametroGeneralSg= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2ParametroGeneralSg= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3ParametroGeneralSg= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4ParametroGeneralSg= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5ParametroGeneralSg= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesParametroGeneralSg.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesParametroGeneralSg.setName("jPanelParametrosReportesParametroGeneralSg"); 
		
		this.jPanelParametrosReportesAccionesParametroGeneralSg.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesParametroGeneralSg.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesParametroGeneralSg.setName("jPanelParametrosReportesAccionesParametroGeneralSg"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesParametroGeneralSg, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesParametroGeneralSg, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionParametroGeneralSg = new JButtonMe();
		this.jButtonRecargarInformacionParametroGeneralSg.setText("Recargar");
		this.jButtonRecargarInformacionParametroGeneralSg.setToolTipText("Recargar"+" "+ParametroGeneralSgConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionParametroGeneralSg,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionParametroGeneralSg = new JButtonMe();
		this.jButtonProcesarInformacionParametroGeneralSg.setText("Procesar");
		this.jButtonProcesarInformacionParametroGeneralSg.setToolTipText("Procesar"+" "+ParametroGeneralSgConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionParametroGeneralSg.setVisible(false);
			
		this.jButtonProcesarInformacionParametroGeneralSg.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionParametroGeneralSg.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionParametroGeneralSg.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesParametroGeneralSg = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesParametroGeneralSg.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesParametroGeneralSg.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesParametroGeneralSg = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesParametroGeneralSg.setText("TIPO");       
		this.jComboBoxTiposReportesParametroGeneralSg.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesParametroGeneralSg = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesParametroGeneralSg.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesParametroGeneralSg.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionParametroGeneralSg = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionParametroGeneralSg.setText("Paginacion");
		this.jComboBoxTiposPaginacionParametroGeneralSg.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesParametroGeneralSg = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesParametroGeneralSg.setText("Accion");
		this.jComboBoxTiposRelacionesParametroGeneralSg.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesParametroGeneralSg = new JComboBoxMe();
		//this.jComboBoxTiposAccionesParametroGeneralSg.setText("Accion");
		this.jComboBoxTiposAccionesParametroGeneralSg.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarParametroGeneralSg = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarParametroGeneralSg.setText("Accion");
		this.jComboBoxTiposSeleccionarParametroGeneralSg.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralParametroGeneralSg=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralParametroGeneralSg.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralParametroGeneralSg.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralParametroGeneralSg.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesParametroGeneralSg = new JLabelMe();
		
		this.jLabelAccionesParametroGeneralSg.setText("Acciones");		
		this.jLabelAccionesParametroGeneralSg.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesParametroGeneralSg.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesParametroGeneralSg.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosParametroGeneralSg = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosParametroGeneralSg.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosParametroGeneralSg.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosParametroGeneralSg = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosParametroGeneralSg.setText("Seleccionados");
		this.jCheckBoxSeleccionadosParametroGeneralSg.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaParametroGeneralSg = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaParametroGeneralSg.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaParametroGeneralSg.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteParametroGeneralSg = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteParametroGeneralSg.setText("Graf.");
		this.jCheckBoxConGraficoReporteParametroGeneralSg.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresParametroGeneralSg = new JButtonMe();
		//this.jButtonAnterioresParametroGeneralSg.setText("<<");
        this.jButtonAnterioresParametroGeneralSg.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresParametroGeneralSg,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresParametroGeneralSg, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesParametroGeneralSg = new JButtonMe();
		//this.jButtonSiguientesParametroGeneralSg.setText(">>");
        this.jButtonSiguientesParametroGeneralSg.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesParametroGeneralSg,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesParametroGeneralSg, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosParametroGeneralSg = new JButtonMe();
		this.jButtonNuevoGuardarCambiosParametroGeneralSg.setText("Nue");
        this.jButtonNuevoGuardarCambiosParametroGeneralSg.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosParametroGeneralSg,"nuevoguardarcambios_button","Nue",this.parametrogeneralsgSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosParametroGeneralSg, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosParametroGeneralSg";
		inputMap = this.jButtonNuevoGuardarCambiosParametroGeneralSg.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosParametroGeneralSg.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosParametroGeneralSg"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionParametroGeneralSg";
		inputMap = this.jButtonRecargarInformacionParametroGeneralSg.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionParametroGeneralSg.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionParametroGeneralSg"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesParametroGeneralSg";
		inputMap = this.jButtonSiguientesParametroGeneralSg.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesParametroGeneralSg.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesParametroGeneralSg"));
		
		//ANTERIORES		
		sMapKey = "AnterioresParametroGeneralSg";
		inputMap = this.jButtonAnterioresParametroGeneralSg.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresParametroGeneralSg.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresParametroGeneralSg"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasParametroGeneralSg();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesParametroGeneralSg.setMinimumSize(new Dimension(this.getWidth(),ParametroGeneralSgBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ParametroGeneralSgBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesParametroGeneralSg.setMaximumSize(new Dimension(this.getWidth(),ParametroGeneralSgBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ParametroGeneralSgBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesParametroGeneralSg.setPreferredSize(new Dimension(this.getWidth(),ParametroGeneralSgBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ParametroGeneralSgBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionParametroGeneralSg = new GridBagLayout();

			this.jPanelPaginacionParametroGeneralSg.setLayout(gridaBagLayoutPaginacionParametroGeneralSg);						
			
			this.gridBagConstraintsParametroGeneralSg = new GridBagConstraints();
			this.gridBagConstraintsParametroGeneralSg.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsParametroGeneralSg.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroGeneralSg.gridy = 0;
			this.gridBagConstraintsParametroGeneralSg.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionParametroGeneralSg.add(this.jButtonAnterioresParametroGeneralSg, this.gridBagConstraintsParametroGeneralSg);
					
						
			this.gridBagConstraintsParametroGeneralSg = new GridBagConstraints();
			this.gridBagConstraintsParametroGeneralSg.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsParametroGeneralSg.gridy = 0;
			
			this.jPanelPaginacionParametroGeneralSg.add(this.jButtonNuevoGuardarCambiosParametroGeneralSg, this.gridBagConstraintsParametroGeneralSg);
						
			
			this.gridBagConstraintsParametroGeneralSg = new GridBagConstraints();
			this.gridBagConstraintsParametroGeneralSg.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsParametroGeneralSg.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsParametroGeneralSg.gridy = 0;
			this.jPanelPaginacionParametroGeneralSg.add(this.jButtonSiguientesParametroGeneralSg, this.gridBagConstraintsParametroGeneralSg);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsParametroGeneralSg = new GridBagConstraints();
			this.gridBagConstraintsParametroGeneralSg.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroGeneralSg.gridy = 1;
			this.gridBagConstraintsParametroGeneralSg.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionParametroGeneralSg.add(this.jButtonNuevoParametroGeneralSg, this.gridBagConstraintsParametroGeneralSg);
						
			
			
			if(!this.parametrogeneralsgSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsParametroGeneralSg = new GridBagConstraints();
				this.gridBagConstraintsParametroGeneralSg.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsParametroGeneralSg.gridy = 1;
				this.gridBagConstraintsParametroGeneralSg.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionParametroGeneralSg.add(this.jButtonGuardarCambiosTablaParametroGeneralSg, this.gridBagConstraintsParametroGeneralSg);
			}
			
			
			
			this.gridBagConstraintsParametroGeneralSg = new GridBagConstraints();
			this.gridBagConstraintsParametroGeneralSg.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroGeneralSg.gridy = 1;
			this.gridBagConstraintsParametroGeneralSg.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionParametroGeneralSg.add(this.jButtonDuplicarParametroGeneralSg, this.gridBagConstraintsParametroGeneralSg);
			
			this.gridBagConstraintsParametroGeneralSg = new GridBagConstraints();
			this.gridBagConstraintsParametroGeneralSg.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroGeneralSg.gridy = 1;
			this.gridBagConstraintsParametroGeneralSg.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionParametroGeneralSg.add(this.jButtonCopiarParametroGeneralSg, this.gridBagConstraintsParametroGeneralSg);
		
			this.gridBagConstraintsParametroGeneralSg = new GridBagConstraints();
			this.gridBagConstraintsParametroGeneralSg.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroGeneralSg.gridy = 1;
			this.gridBagConstraintsParametroGeneralSg.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionParametroGeneralSg.add(this.jButtonVerFormParametroGeneralSg, this.gridBagConstraintsParametroGeneralSg);
		
			this.gridBagConstraintsParametroGeneralSg = new GridBagConstraints();
			this.gridBagConstraintsParametroGeneralSg.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroGeneralSg.gridy = 1;
			this.gridBagConstraintsParametroGeneralSg.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionParametroGeneralSg.add(this.jButtonCerrarParametroGeneralSg, this.gridBagConstraintsParametroGeneralSg);
		
		
		
		this.jButtonRecargarInformacionParametroGeneralSg.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionParametroGeneralSg.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionParametroGeneralSg.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionParametroGeneralSg, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesParametroGeneralSg.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesParametroGeneralSg.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesParametroGeneralSg.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesParametroGeneralSg, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesParametroGeneralSg.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesParametroGeneralSg.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesParametroGeneralSg.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesParametroGeneralSg, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesParametroGeneralSg.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesParametroGeneralSg.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesParametroGeneralSg.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesParametroGeneralSg, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionParametroGeneralSg.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionParametroGeneralSg.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionParametroGeneralSg.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionParametroGeneralSg, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesParametroGeneralSg.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesParametroGeneralSg.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesParametroGeneralSg.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesParametroGeneralSg, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesParametroGeneralSg.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesParametroGeneralSg.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesParametroGeneralSg.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesParametroGeneralSg, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarParametroGeneralSg.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarParametroGeneralSg.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarParametroGeneralSg.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarParametroGeneralSg, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaParametroGeneralSg.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaParametroGeneralSg.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaParametroGeneralSg.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaParametroGeneralSg, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteParametroGeneralSg.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteParametroGeneralSg.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteParametroGeneralSg.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteParametroGeneralSg, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosParametroGeneralSg.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosParametroGeneralSg.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosParametroGeneralSg.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosParametroGeneralSg, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosParametroGeneralSg.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosParametroGeneralSg.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosParametroGeneralSg.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosParametroGeneralSg, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesParametroGeneralSg = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesParametroGeneralSg = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1ParametroGeneralSg = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2ParametroGeneralSg = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3ParametroGeneralSg = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4ParametroGeneralSg = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesParametroGeneralSg.setLayout(gridaBagParametrosReportesParametroGeneralSg);
			this.jPanelParametrosReportesAccionesParametroGeneralSg.setLayout(gridaBagParametrosReportesAccionesParametroGeneralSg);
			
			
			this.jPanelParametrosAuxiliar1ParametroGeneralSg.setLayout(gridaBagParametrosAuxiliar1ParametroGeneralSg);
			this.jPanelParametrosAuxiliar2ParametroGeneralSg.setLayout(gridaBagParametrosAuxiliar2ParametroGeneralSg);
			this.jPanelParametrosAuxiliar3ParametroGeneralSg.setLayout(gridaBagParametrosAuxiliar3ParametroGeneralSg);
			this.jPanelParametrosAuxiliar4ParametroGeneralSg.setLayout(gridaBagParametrosAuxiliar4ParametroGeneralSg);
			//this.jPanelParametrosAuxiliar5ParametroGeneralSg.setLayout(gridaBagParametrosAuxiliar2ParametroGeneralSg);			
			
			
			
			
			this.gridBagConstraintsParametroGeneralSg = new GridBagConstraints();
			this.gridBagConstraintsParametroGeneralSg.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroGeneralSg.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsParametroGeneralSg.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesParametroGeneralSg.add(this.jButtonRecargarInformacionParametroGeneralSg, this.gridBagConstraintsParametroGeneralSg);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsParametroGeneralSg = new GridBagConstraints();
			this.gridBagConstraintsParametroGeneralSg.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroGeneralSg.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsParametroGeneralSg.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ParametroGeneralSg.add(this.jComboBoxTiposPaginacionParametroGeneralSg, this.gridBagConstraintsParametroGeneralSg);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsParametroGeneralSg = new GridBagConstraints();
			this.gridBagConstraintsParametroGeneralSg.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroGeneralSg.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsParametroGeneralSg.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ParametroGeneralSg.add(this.jCheckBoxConAltoMaximoTablaParametroGeneralSg, this.gridBagConstraintsParametroGeneralSg);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsParametroGeneralSg = new GridBagConstraints();
			this.gridBagConstraintsParametroGeneralSg.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroGeneralSg.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsParametroGeneralSg.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ParametroGeneralSg.add(this.jComboBoxTiposArchivosReportesParametroGeneralSg, this.gridBagConstraintsParametroGeneralSg);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsParametroGeneralSg = new GridBagConstraints();
			this.gridBagConstraintsParametroGeneralSg.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroGeneralSg.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroGeneralSg.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesParametroGeneralSg.add(this.jPanelParametrosAuxiliar1ParametroGeneralSg, this.gridBagConstraintsParametroGeneralSg);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsParametroGeneralSg = new GridBagConstraints();
			this.gridBagConstraintsParametroGeneralSg.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroGeneralSg.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroGeneralSg.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsParametroGeneralSg.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4ParametroGeneralSg.add(this.jComboBoxTiposReportesParametroGeneralSg, this.gridBagConstraintsParametroGeneralSg);																		
			
			
			
			this.gridBagConstraintsParametroGeneralSg = new GridBagConstraints();
			this.gridBagConstraintsParametroGeneralSg.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroGeneralSg.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroGeneralSg.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsParametroGeneralSg.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4ParametroGeneralSg.add(this.jComboBoxTiposGraficosReportesParametroGeneralSg, this.gridBagConstraintsParametroGeneralSg);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsParametroGeneralSg = new GridBagConstraints();
			this.gridBagConstraintsParametroGeneralSg.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroGeneralSg.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroGeneralSg.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesParametroGeneralSg.add(this.jPanelParametrosAuxiliar4ParametroGeneralSg, this.gridBagConstraintsParametroGeneralSg);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsParametroGeneralSg = new GridBagConstraints();
			this.gridBagConstraintsParametroGeneralSg.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroGeneralSg.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsParametroGeneralSg.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesParametroGeneralSg.add(this.jComboBoxTiposReportesParametroGeneralSg, this.gridBagConstraintsParametroGeneralSg);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsParametroGeneralSg = new GridBagConstraints();
			this.gridBagConstraintsParametroGeneralSg.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroGeneralSg.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroGeneralSg.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesParametroGeneralSg.add(this.jCheckBoxGenerarReporteParametroGeneralSg, this.gridBagConstraintsParametroGeneralSg);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsParametroGeneralSg = new GridBagConstraints();
			this.gridBagConstraintsParametroGeneralSg.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroGeneralSg.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroGeneralSg.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesParametroGeneralSg.add(this.jPanelParametrosAuxiliar2ParametroGeneralSg, this.gridBagConstraintsParametroGeneralSg);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsParametroGeneralSg = new GridBagConstraints();
			this.gridBagConstraintsParametroGeneralSg.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroGeneralSg.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsParametroGeneralSg.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesParametroGeneralSg.add(this.jLabelAccionesParametroGeneralSg, this.gridBagConstraintsParametroGeneralSg);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsParametroGeneralSg = new GridBagConstraints();
				this.gridBagConstraintsParametroGeneralSg.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsParametroGeneralSg.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsParametroGeneralSg.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesParametroGeneralSg.add(this.jButtonAbrirOrderByParametroGeneralSg, this.gridBagConstraintsParametroGeneralSg);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsParametroGeneralSg = new GridBagConstraints();
			this.gridBagConstraintsParametroGeneralSg.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsParametroGeneralSg.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroGeneralSg.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesParametroGeneralSg.add(this.jComboBoxTiposSeleccionarParametroGeneralSg, this.gridBagConstraintsParametroGeneralSg);			
			
			
			/*
			this.gridBagConstraintsParametroGeneralSg = new GridBagConstraints();
			this.gridBagConstraintsParametroGeneralSg.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroGeneralSg.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsParametroGeneralSg.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesParametroGeneralSg.add(this.jCheckBoxSeleccionarTodosParametroGeneralSg, this.gridBagConstraintsParametroGeneralSg);
			
			this.gridBagConstraintsParametroGeneralSg = new GridBagConstraints();
			this.gridBagConstraintsParametroGeneralSg.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroGeneralSg.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsParametroGeneralSg.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesParametroGeneralSg.add(this.jCheckBoxConGraficoReporteParametroGeneralSg, this.gridBagConstraintsParametroGeneralSg);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsParametroGeneralSg = new GridBagConstraints();
			this.gridBagConstraintsParametroGeneralSg.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroGeneralSg.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroGeneralSg.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsParametroGeneralSg.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ParametroGeneralSg.add(this.jCheckBoxSeleccionarTodosParametroGeneralSg, this.gridBagConstraintsParametroGeneralSg);															
				
			this.gridBagConstraintsParametroGeneralSg = new GridBagConstraints();
			this.gridBagConstraintsParametroGeneralSg.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroGeneralSg.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroGeneralSg.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsParametroGeneralSg.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ParametroGeneralSg.add(this.jCheckBoxSeleccionadosParametroGeneralSg, this.gridBagConstraintsParametroGeneralSg);															
			
			this.gridBagConstraintsParametroGeneralSg = new GridBagConstraints();
			this.gridBagConstraintsParametroGeneralSg.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroGeneralSg.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroGeneralSg.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsParametroGeneralSg.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ParametroGeneralSg.add(this.jCheckBoxConGraficoReporteParametroGeneralSg, this.gridBagConstraintsParametroGeneralSg);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsParametroGeneralSg = new GridBagConstraints();
			this.gridBagConstraintsParametroGeneralSg.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroGeneralSg.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroGeneralSg.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesParametroGeneralSg.add(this.jPanelParametrosAuxiliar3ParametroGeneralSg, this.gridBagConstraintsParametroGeneralSg);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsParametroGeneralSg = new GridBagConstraints();
			this.gridBagConstraintsParametroGeneralSg.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroGeneralSg.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesParametroGeneralSg.add(this.jComboBoxTiposAccionesParametroGeneralSg, this.gridBagConstraintsParametroGeneralSg);
	
				
			this.gridBagConstraintsParametroGeneralSg = new GridBagConstraints();
			this.gridBagConstraintsParametroGeneralSg.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroGeneralSg.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesParametroGeneralSg.add(this.jTextFieldValorCampoGeneralParametroGeneralSg, this.gridBagConstraintsParametroGeneralSg);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosParametroGeneralSg = new GridBagLayout();

			this.jScrollPanelDatosParametroGeneralSg.setLayout(gridaBagLayoutDatosParametroGeneralSg);
			
			this.gridBagConstraintsParametroGeneralSg = new GridBagConstraints();
			this.gridBagConstraintsParametroGeneralSg.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroGeneralSg.gridy = 0;
			this.gridBagConstraintsParametroGeneralSg.gridx = 0;
			
			this.jScrollPanelDatosParametroGeneralSg.add(this.jTableDatosParametroGeneralSg, this.gridBagConstraintsParametroGeneralSg);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosParametroGeneralSg.setViewportView(this.jTableDatosParametroGeneralSg);
		this.jTableDatosParametroGeneralSg.setFillsViewportHeight(true);
		this.jTableDatosParametroGeneralSg.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesParametroGeneralSg= new GridBagLayout();
		this.jPanelAccionesParametroGeneralSg.setLayout(gridaBagLayoutAccionesParametroGeneralSg);
		
		
		/*	
		this.gridBagConstraintsParametroGeneralSg = new GridBagConstraints();
		this.gridBagConstraintsParametroGeneralSg.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroGeneralSg.gridy = 0;
		this.gridBagConstraintsParametroGeneralSg.gridx = 0;
			
		this.jPanelAccionesParametroGeneralSg.add(this.jButtonNuevoParametroGeneralSg, this.gridBagConstraintsParametroGeneralSg);
		*/
		int iPosXAccion=0;
		
						
		
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutParametroGeneralSg = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutParametroGeneralSg);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.parametrogeneralsgSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsParametroGeneralSg = new GridBagConstraints();						
			this.gridBagConstraintsParametroGeneralSg.gridy = iGridyPrincipal++;
			this.gridBagConstraintsParametroGeneralSg.gridx = 0;		
			//this.gridBagConstraintsParametroGeneralSg.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroGeneralSg.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsParametroGeneralSg.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarParametroGeneralSg, this.gridBagConstraintsParametroGeneralSg);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsParametroGeneralSg = new GridBagConstraints();
		this.gridBagConstraintsParametroGeneralSg.gridy = iGridyPrincipal++;
		this.gridBagConstraintsParametroGeneralSg.gridx = 0;		
		//this.gridBagConstraintsParametroGeneralSg.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroGeneralSg.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsParametroGeneralSg.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsParametroGeneralSg);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsParametroGeneralSg = new GridBagConstraints();
		this.gridBagConstraintsParametroGeneralSg.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsParametroGeneralSg.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesParametroGeneralSg, this.gridBagConstraintsParametroGeneralSg);								
		
		
		/*
		this.gridBagConstraintsParametroGeneralSg = new GridBagConstraints();
		this.gridBagConstraintsParametroGeneralSg.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsParametroGeneralSg.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesParametroGeneralSg, this.gridBagConstraintsParametroGeneralSg);
		*/		
		
		this.gridBagConstraintsParametroGeneralSg = new GridBagConstraints();
		this.gridBagConstraintsParametroGeneralSg.gridy =iGridyPrincipal++;
		this.gridBagConstraintsParametroGeneralSg.gridx =0;
		this.gridBagConstraintsParametroGeneralSg.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsParametroGeneralSg.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosParametroGeneralSg, this.gridBagConstraintsParametroGeneralSg);
				
		
		this.gridBagConstraintsParametroGeneralSg = new GridBagConstraints();
		this.gridBagConstraintsParametroGeneralSg.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsParametroGeneralSg.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionParametroGeneralSg, this.gridBagConstraintsParametroGeneralSg);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(ParametroGeneralSgJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosParametroGeneralSg= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosParametroGeneralSg = new GridBagLayout();
			this.jPanelBusquedasParametrosParametroGeneralSg.setLayout(gridaBagLayoutBusquedasParametrosParametroGeneralSg);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralParametroGeneralSg=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralParametroGeneralSg.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralParametroGeneralSg.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralParametroGeneralSg.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsParametroGeneralSg = new GridBagConstraints();
			
			
			
			
			//if(!this.conCargarMinimo) {
			
			//}
			
			this.conMaximoRelaciones=false;
			
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
		this.gridBagConstraintsParametroGeneralSg = new GridBagConstraints();
		this.gridBagConstraintsParametroGeneralSg.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsParametroGeneralSg.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposParametroGeneralSg, this.gridBagConstraintsParametroGeneralSg);
			
			
		this.gridBagConstraintsParametroGeneralSg = new GridBagConstraints();
		this.gridBagConstraintsParametroGeneralSg.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsParametroGeneralSg.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosParametroGeneralSg, this.gridBagConstraintsParametroGeneralSg);
		
			
		this.gridBagConstraintsParametroGeneralSg = new GridBagConstraints();
		this.gridBagConstraintsParametroGeneralSg.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsParametroGeneralSg.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesParametroGeneralSg, this.gridBagConstraintsParametroGeneralSg);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralParametroGeneralSg;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoParametroGeneralSg() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoParametroGeneralSg = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoParametroGeneralSg = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoParametroGeneralSg.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoParametroGeneralSg.setName("jPanelReporteDinamicoParametroGeneralSg"); 
		
		this.jPanelReporteDinamicoParametroGeneralSg.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoParametroGeneralSg.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoParametroGeneralSg.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoParametroGeneralSg.setLayout(gridaBagLayoutReporteDinamicoParametroGeneralSg);
		
		
		this.jInternalFrameReporteDinamicoParametroGeneralSg= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoParametroGeneralSg = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteParametroGeneralSg= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoParametroGeneralSg.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoParametroGeneralSg.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoParametroGeneralSg.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoParametroGeneralSg.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoParametroGeneralSg.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoParametroGeneralSg.setResizable(true);
	    this.jInternalFrameReporteDinamicoParametroGeneralSg.setClosable(true);
	    this.jInternalFrameReporteDinamicoParametroGeneralSg.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoParametroGeneralSg.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoParametroGeneralSg.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoParametroGeneralSg.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoParametroGeneralSg.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Parametro Generales"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteParametroGeneralSg = new JLabelMe();

		this.jLabelColumnasSelectReporteParametroGeneralSg.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteParametroGeneralSg.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteParametroGeneralSg.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteParametroGeneralSg.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsParametroGeneralSg = new GridBagConstraints();
		this.gridBagConstraintsParametroGeneralSg.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroGeneralSg.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsParametroGeneralSg.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoParametroGeneralSg.add(this.jLabelColumnasSelectReporteParametroGeneralSg, this.gridBagConstraintsParametroGeneralSg);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteParametroGeneralSg = new JList<Reporte>();
		this.jListColumnasSelectReporteParametroGeneralSg.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteParametroGeneralSg.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteParametroGeneralSg.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteParametroGeneralSg.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteParametroGeneralSg.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteParametroGeneralSg=new JScrollPane(this.jListColumnasSelectReporteParametroGeneralSg);
			
			this.jScrollColumnasSelectReporteParametroGeneralSg.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteParametroGeneralSg.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteParametroGeneralSg.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteParametroGeneralSg.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsParametroGeneralSg = new GridBagConstraints();
		this.gridBagConstraintsParametroGeneralSg.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroGeneralSg.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsParametroGeneralSg.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoParametroGeneralSg.add(this.jListColumnasSelectReporteParametroGeneralSg, this.gridBagConstraintsParametroGeneralSg);
		this.jPanelReporteDinamicoParametroGeneralSg.add(this.jScrollColumnasSelectReporteParametroGeneralSg, this.gridBagConstraintsParametroGeneralSg);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteParametroGeneralSg = new JLabelMe();

		this.jLabelRelacionesSelectReporteParametroGeneralSg.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteParametroGeneralSg.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteParametroGeneralSg.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteParametroGeneralSg.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteParametroGeneralSg = new JList<Reporte>();
		this.jListRelacionesSelectReporteParametroGeneralSg.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteParametroGeneralSg.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteParametroGeneralSg.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteParametroGeneralSg.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteParametroGeneralSg.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteParametroGeneralSg=new JScrollPane(this.jListRelacionesSelectReporteParametroGeneralSg);
			
			this.jScrollRelacionesSelectReporteParametroGeneralSg.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteParametroGeneralSg.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteParametroGeneralSg.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteParametroGeneralSg.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoParametroGeneralSg = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoParametroGeneralSg = new JComboBoxMe();
		this.jListColumnasValoresGraficoParametroGeneralSg = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoParametroGeneralSg = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoParametroGeneralSg.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoParametroGeneralSg.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoParametroGeneralSg.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoParametroGeneralSg.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoParametroGeneralSg, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoParametroGeneralSg = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoParametroGeneralSg.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoParametroGeneralSg.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoParametroGeneralSg.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoParametroGeneralSg.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoParametroGeneralSg, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoParametroGeneralSg = new JLabelMe();

		this.jLabelConGraficoDinamicoParametroGeneralSg.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoParametroGeneralSg.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoParametroGeneralSg.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoParametroGeneralSg.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsParametroGeneralSg = new GridBagConstraints();
		this.gridBagConstraintsParametroGeneralSg.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroGeneralSg.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsParametroGeneralSg.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoParametroGeneralSg.add(this.jLabelConGraficoDinamicoParametroGeneralSg, this.gridBagConstraintsParametroGeneralSg);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoParametroGeneralSg = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoParametroGeneralSg.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoParametroGeneralSg.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoParametroGeneralSg.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoParametroGeneralSg.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoParametroGeneralSg.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsParametroGeneralSg = new GridBagConstraints();
		this.gridBagConstraintsParametroGeneralSg.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroGeneralSg.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsParametroGeneralSg.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoParametroGeneralSg.add(this.jCheckBoxConGraficoDinamicoParametroGeneralSg, this.gridBagConstraintsParametroGeneralSg);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoParametroGeneralSg = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoParametroGeneralSg.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoParametroGeneralSg.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoParametroGeneralSg.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoParametroGeneralSg.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsParametroGeneralSg = new GridBagConstraints();
		this.gridBagConstraintsParametroGeneralSg.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroGeneralSg.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsParametroGeneralSg.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoParametroGeneralSg.add(this.jLabelColumnaCategoriaGraficoParametroGeneralSg, this.gridBagConstraintsParametroGeneralSg);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoParametroGeneralSg = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoParametroGeneralSg.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoParametroGeneralSg.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoParametroGeneralSg.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoParametroGeneralSg.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoParametroGeneralSg.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsParametroGeneralSg = new GridBagConstraints();
		this.gridBagConstraintsParametroGeneralSg.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroGeneralSg.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsParametroGeneralSg.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoParametroGeneralSg.add(this.jComboBoxColumnaCategoriaGraficoParametroGeneralSg, this.gridBagConstraintsParametroGeneralSg);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorParametroGeneralSg = new JLabelMe();

		this.jLabelColumnaCategoriaValorParametroGeneralSg.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorParametroGeneralSg.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorParametroGeneralSg.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorParametroGeneralSg.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsParametroGeneralSg = new GridBagConstraints();
		this.gridBagConstraintsParametroGeneralSg.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroGeneralSg.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsParametroGeneralSg.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoParametroGeneralSg.add(this.jLabelColumnaCategoriaValorParametroGeneralSg, this.gridBagConstraintsParametroGeneralSg);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorParametroGeneralSg = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorParametroGeneralSg.setText("Accion");
        this.jComboBoxColumnaCategoriaValorParametroGeneralSg.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorParametroGeneralSg.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorParametroGeneralSg.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorParametroGeneralSg.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsParametroGeneralSg = new GridBagConstraints();
		this.gridBagConstraintsParametroGeneralSg.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroGeneralSg.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsParametroGeneralSg.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoParametroGeneralSg.add(this.jComboBoxColumnaCategoriaValorParametroGeneralSg, this.gridBagConstraintsParametroGeneralSg);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoParametroGeneralSg = new JLabelMe();

		this.jLabelColumnasValoresGraficoParametroGeneralSg.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoParametroGeneralSg.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoParametroGeneralSg.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoParametroGeneralSg.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsParametroGeneralSg = new GridBagConstraints();
		this.gridBagConstraintsParametroGeneralSg.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroGeneralSg.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsParametroGeneralSg.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoParametroGeneralSg.add(this.jLabelColumnasValoresGraficoParametroGeneralSg, this.gridBagConstraintsParametroGeneralSg);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoParametroGeneralSg = new JList<Reporte>();
		this.jListColumnasValoresGraficoParametroGeneralSg.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoParametroGeneralSg.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoParametroGeneralSg.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoParametroGeneralSg.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoParametroGeneralSg.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoParametroGeneralSg=new JScrollPane(this.jListColumnasValoresGraficoParametroGeneralSg);
			
			this.jScrollColumnasValoresGraficoParametroGeneralSg.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoParametroGeneralSg.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoParametroGeneralSg.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoParametroGeneralSg.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsParametroGeneralSg = new GridBagConstraints();
		this.gridBagConstraintsParametroGeneralSg.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroGeneralSg.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsParametroGeneralSg.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoParametroGeneralSg.add(this.jListColumnasSelectReporteParametroGeneralSg, this.gridBagConstraintsParametroGeneralSg);
		this.jPanelReporteDinamicoParametroGeneralSg.add(this.jScrollColumnasValoresGraficoParametroGeneralSg, this.gridBagConstraintsParametroGeneralSg);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoParametroGeneralSg = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoParametroGeneralSg.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoParametroGeneralSg.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoParametroGeneralSg.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoParametroGeneralSg.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsParametroGeneralSg = new GridBagConstraints();
		this.gridBagConstraintsParametroGeneralSg.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroGeneralSg.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsParametroGeneralSg.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoParametroGeneralSg.add(this.jLabelTiposGraficosReportesDinamicoParametroGeneralSg, this.gridBagConstraintsParametroGeneralSg);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoParametroGeneralSg = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoParametroGeneralSg.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoParametroGeneralSg.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoParametroGeneralSg.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoParametroGeneralSg.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoParametroGeneralSg.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsParametroGeneralSg = new GridBagConstraints();
		this.gridBagConstraintsParametroGeneralSg.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroGeneralSg.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsParametroGeneralSg.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoParametroGeneralSg.add(this.jComboBoxTiposGraficosReportesDinamicoParametroGeneralSg, this.gridBagConstraintsParametroGeneralSg);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoParametroGeneralSg = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoParametroGeneralSg.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoParametroGeneralSg.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoParametroGeneralSg.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoParametroGeneralSg.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsParametroGeneralSg = new GridBagConstraints();
		this.gridBagConstraintsParametroGeneralSg.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroGeneralSg.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsParametroGeneralSg.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoParametroGeneralSg.add(this.jLabelGenerarExcelReporteDinamicoParametroGeneralSg, this.gridBagConstraintsParametroGeneralSg);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoParametroGeneralSg = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoParametroGeneralSg.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoParametroGeneralSg,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoParametroGeneralSg.setToolTipText("Generar EXCEL"+" "+ParametroGeneralSgConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsParametroGeneralSg = new GridBagConstraints();
		//this.gridBagConstraintsParametroGeneralSg.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsParametroGeneralSg.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsParametroGeneralSg.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoParametroGeneralSg.add(this.jButtonGenerarExcelReporteDinamicoParametroGeneralSg, this.gridBagConstraintsParametroGeneralSg);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsParametroGeneralSg = new GridBagConstraints();
		this.gridBagConstraintsParametroGeneralSg.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroGeneralSg.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsParametroGeneralSg.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoParametroGeneralSg.add(this.jComboBoxTiposReportesDinamicoParametroGeneralSg, this.gridBagConstraintsParametroGeneralSg);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoParametroGeneralSg = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoParametroGeneralSg.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoParametroGeneralSg.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoParametroGeneralSg.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoParametroGeneralSg.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsParametroGeneralSg = new GridBagConstraints();
		this.gridBagConstraintsParametroGeneralSg.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroGeneralSg.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsParametroGeneralSg.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoParametroGeneralSg.add(this.jLabelTiposArchivoReporteDinamicoParametroGeneralSg, this.gridBagConstraintsParametroGeneralSg);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsParametroGeneralSg = new GridBagConstraints();
		this.gridBagConstraintsParametroGeneralSg.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroGeneralSg.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsParametroGeneralSg.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoParametroGeneralSg.add(this.jComboBoxTiposArchivosReportesDinamicoParametroGeneralSg, this.gridBagConstraintsParametroGeneralSg);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoParametroGeneralSg = new JButtonMe();
		this.jButtonGenerarReporteDinamicoParametroGeneralSg.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoParametroGeneralSg,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoParametroGeneralSg.setToolTipText("Generar"+" "+ParametroGeneralSgConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsParametroGeneralSg = new GridBagConstraints();
		this.gridBagConstraintsParametroGeneralSg.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroGeneralSg.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsParametroGeneralSg.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoParametroGeneralSg.add(this.jButtonGenerarReporteDinamicoParametroGeneralSg, this.gridBagConstraintsParametroGeneralSg);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoParametroGeneralSg = new JButtonMe();
		this.jButtonCerrarReporteDinamicoParametroGeneralSg.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoParametroGeneralSg,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoParametroGeneralSg.setToolTipText("Cancelar"+" "+ParametroGeneralSgConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsParametroGeneralSg = new GridBagConstraints();
		this.gridBagConstraintsParametroGeneralSg.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroGeneralSg.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsParametroGeneralSg.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoParametroGeneralSg.add(this.jButtonCerrarReporteDinamicoParametroGeneralSg, this.gridBagConstraintsParametroGeneralSg);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalParametroGeneralSg = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoParametroGeneralSg= new JScrollPane(jPanelReporteDinamicoParametroGeneralSg,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoParametroGeneralSg.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoParametroGeneralSg.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoParametroGeneralSg.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoParametroGeneralSg.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Parametro Generales"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsParametroGeneralSg = new GridBagConstraints();
		this.gridBagConstraintsParametroGeneralSg.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsParametroGeneralSg.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsParametroGeneralSg.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoParametroGeneralSg.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoParametroGeneralSg.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalParametroGeneralSg);
		this.jInternalFrameReporteDinamicoParametroGeneralSg.getContentPane().add(this.jScrollPanelReporteDinamicoParametroGeneralSg, this.gridBagConstraintsParametroGeneralSg);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionParametroGeneralSg() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionParametroGeneralSg = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionParametroGeneralSg = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionParametroGeneralSg.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionParametroGeneralSg.setName("jPanelImportacionParametroGeneralSg"); 
		
		this.jPanelImportacionParametroGeneralSg.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionParametroGeneralSg.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionParametroGeneralSg.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionParametroGeneralSg.setLayout(gridaBagLayoutImportacionParametroGeneralSg);
		
		
		this.jInternalFrameImportacionParametroGeneralSg= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionParametroGeneralSg= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionParametroGeneralSg = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteParametroGeneralSg= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionParametroGeneralSg.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionParametroGeneralSg.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionParametroGeneralSg.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionParametroGeneralSg.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionParametroGeneralSg.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionParametroGeneralSg.setResizable(true);
	    this.jInternalFrameImportacionParametroGeneralSg.setClosable(true);
	    this.jInternalFrameImportacionParametroGeneralSg.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionParametroGeneralSg.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionParametroGeneralSg.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionParametroGeneralSg.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionParametroGeneralSg.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionParametroGeneralSg.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionParametroGeneralSg.setResizable(true);
	    this.jInternalFrameImportacionParametroGeneralSg.setClosable(true);
	    this.jInternalFrameImportacionParametroGeneralSg.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionParametroGeneralSg.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionParametroGeneralSg.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionParametroGeneralSg.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionParametroGeneralSg.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Parametro Generales"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionParametroGeneralSg = new JLabelMe();

		this.jLabelArchivoImportacionParametroGeneralSg.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionParametroGeneralSg.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionParametroGeneralSg.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionParametroGeneralSg.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsParametroGeneralSg = new GridBagConstraints();
		this.gridBagConstraintsParametroGeneralSg.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroGeneralSg.gridy = iPosYImportacion;		
		this.gridBagConstraintsParametroGeneralSg.gridx = iPosXImportacion++;
			
		this.jPanelImportacionParametroGeneralSg.add(this.jLabelArchivoImportacionParametroGeneralSg, this.gridBagConstraintsParametroGeneralSg);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionParametroGeneralSg = new JFileChooser();		
		this.jFileChooserImportacionParametroGeneralSg.setToolTipText("ESCOGER ARCHIVO"+" "+ParametroGeneralSgConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionParametroGeneralSg = new JButtonMe();
		this.jButtonAbrirImportacionParametroGeneralSg.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionParametroGeneralSg,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionParametroGeneralSg.setToolTipText("Generar"+" "+ParametroGeneralSgConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsParametroGeneralSg = new GridBagConstraints();
		this.gridBagConstraintsParametroGeneralSg.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroGeneralSg.gridy = iPosYImportacion;
		this.gridBagConstraintsParametroGeneralSg.gridx = iPosXImportacion++;
							
		this.jPanelImportacionParametroGeneralSg.add(this.jButtonAbrirImportacionParametroGeneralSg, this.gridBagConstraintsParametroGeneralSg);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionParametroGeneralSg = new JLabelMe();

		this.jLabelPathArchivoImportacionParametroGeneralSg.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionParametroGeneralSg.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionParametroGeneralSg.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionParametroGeneralSg.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsParametroGeneralSg = new GridBagConstraints();
		this.gridBagConstraintsParametroGeneralSg.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroGeneralSg.gridy = iPosYImportacion;		
		this.gridBagConstraintsParametroGeneralSg.gridx = iPosXImportacion++;
			
		this.jPanelImportacionParametroGeneralSg.add(this.jLabelPathArchivoImportacionParametroGeneralSg, this.gridBagConstraintsParametroGeneralSg);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionParametroGeneralSg=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionParametroGeneralSg.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionParametroGeneralSg.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionParametroGeneralSg.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsParametroGeneralSg = new GridBagConstraints();
		this.gridBagConstraintsParametroGeneralSg.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroGeneralSg.gridy = iPosYImportacion;
		this.gridBagConstraintsParametroGeneralSg.gridx = iPosXImportacion++;
							
		this.jPanelImportacionParametroGeneralSg.add(this.jTextFieldPathArchivoImportacionParametroGeneralSg, this.gridBagConstraintsParametroGeneralSg);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionParametroGeneralSg = new JButtonMe();
		this.jButtonGenerarImportacionParametroGeneralSg.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionParametroGeneralSg,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionParametroGeneralSg.setToolTipText("Generar"+" "+ParametroGeneralSgConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsParametroGeneralSg = new GridBagConstraints();
		this.gridBagConstraintsParametroGeneralSg.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroGeneralSg.gridy = iPosYImportacion;
		this.gridBagConstraintsParametroGeneralSg.gridx = iPosXImportacion++;
							
		this.jPanelImportacionParametroGeneralSg.add(this.jButtonGenerarImportacionParametroGeneralSg, this.gridBagConstraintsParametroGeneralSg);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionParametroGeneralSg = new JButtonMe();
		this.jButtonCerrarImportacionParametroGeneralSg.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionParametroGeneralSg,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionParametroGeneralSg.setToolTipText("Cancelar"+" "+ParametroGeneralSgConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsParametroGeneralSg = new GridBagConstraints();
		this.gridBagConstraintsParametroGeneralSg.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroGeneralSg.gridy = iPosYImportacion;
		this.gridBagConstraintsParametroGeneralSg.gridx = iPosXImportacion++;
							
		this.jPanelImportacionParametroGeneralSg.add(this.jButtonCerrarImportacionParametroGeneralSg, this.gridBagConstraintsParametroGeneralSg);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalParametroGeneralSg = new GridBagLayout();
		
		this.jScrollPanelImportacionParametroGeneralSg= new JScrollPane(jPanelImportacionParametroGeneralSg,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsParametroGeneralSg = new GridBagConstraints();
		this.gridBagConstraintsParametroGeneralSg.gridy =iPosYImportacion;
		this.gridBagConstraintsParametroGeneralSg.gridx =iPosXImportacion;
		this.gridBagConstraintsParametroGeneralSg.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionParametroGeneralSg.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionParametroGeneralSg.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalParametroGeneralSg);
		this.jInternalFrameImportacionParametroGeneralSg.getContentPane().add(this.jScrollPanelImportacionParametroGeneralSg, this.gridBagConstraintsParametroGeneralSg);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByParametroGeneralSg(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByParametroGeneralSg = new JButtonMe();
			this.jButtonAbrirOrderByParametroGeneralSg.setText("Orden");
			this.jButtonAbrirOrderByParametroGeneralSg.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByParametroGeneralSg,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByParametroGeneralSg, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByParametroGeneralSg";
			inputMap = this.jButtonAbrirOrderByParametroGeneralSg.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByParametroGeneralSg.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByParametroGeneralSg"));
		
		
			GridBagLayout gridaBagLayoutOrderByParametroGeneralSg = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByParametroGeneralSg = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByParametroGeneralSg.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByParametroGeneralSg.setName("jPanelOrderByParametroGeneralSg"); 
			
			this.jPanelOrderByParametroGeneralSg.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByParametroGeneralSg.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByParametroGeneralSg.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByParametroGeneralSg, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByParametroGeneralSg.setLayout(gridaBagLayoutOrderByParametroGeneralSg);
			
			
			this.jTableDatosParametroGeneralSgOrderBy = new JTableMe();        
			this.jTableDatosParametroGeneralSgOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosParametroGeneralSgOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosParametroGeneralSgOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosParametroGeneralSgOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosParametroGeneralSgOrderBy.setViewportView(this.jTableDatosParametroGeneralSgOrderBy);
			this.jTableDatosParametroGeneralSgOrderBy.setFillsViewportHeight(true);
			this.jTableDatosParametroGeneralSgOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByParametroGeneralSg= new OrderByJInternalFrame();
			this.jInternalFrameOrderByParametroGeneralSg= new OrderByJInternalFrame();
			this.jScrollPanelOrderByParametroGeneralSg = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteParametroGeneralSg= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByParametroGeneralSg.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByParametroGeneralSg.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByParametroGeneralSg.setTitle("Orden");
			this.jInternalFrameOrderByParametroGeneralSg.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByParametroGeneralSg.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByParametroGeneralSg.setResizable(true);
			this.jInternalFrameOrderByParametroGeneralSg.setClosable(true);
			this.jInternalFrameOrderByParametroGeneralSg.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByParametroGeneralSg, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByParametroGeneralSg.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByParametroGeneralSg.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByParametroGeneralSg.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByParametroGeneralSg, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByParametroGeneralSg.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Parametro Generales"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsParametroGeneralSg = new GridBagConstraints();
			this.gridBagConstraintsParametroGeneralSg.gridy =iPosYOrderBy++;
			this.gridBagConstraintsParametroGeneralSg.gridx =iPosXOrderBy;
			this.gridBagConstraintsParametroGeneralSg.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsParametroGeneralSg.ipady =150;
				
			this.jPanelOrderByParametroGeneralSg.add(jScrollPanelDatosParametroGeneralSgOrderBy, this.gridBagConstraintsParametroGeneralSg);//this.jTableDatosParametroGeneralSgTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByParametroGeneralSg = new JButtonMe();
			this.jButtonCerrarOrderByParametroGeneralSg.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByParametroGeneralSg,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByParametroGeneralSg.setToolTipText("Cancelar"+" "+ParametroGeneralSgConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByParametroGeneralSg, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsParametroGeneralSg = new GridBagConstraints();
			this.gridBagConstraintsParametroGeneralSg.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroGeneralSg.gridy = iPosYOrderBy++;
			this.gridBagConstraintsParametroGeneralSg.gridx = iPosXOrderBy;
									
			this.jPanelOrderByParametroGeneralSg.add(this.jButtonCerrarOrderByParametroGeneralSg, this.gridBagConstraintsParametroGeneralSg);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalParametroGeneralSg = new GridBagLayout();
			
			this.jScrollPanelOrderByParametroGeneralSg= new JScrollPane(jPanelOrderByParametroGeneralSg,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsParametroGeneralSg = new GridBagConstraints();
			this.gridBagConstraintsParametroGeneralSg.gridy =iPosYOrderBy;
			this.gridBagConstraintsParametroGeneralSg.gridx =iPosXOrderBy;
			this.gridBagConstraintsParametroGeneralSg.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByParametroGeneralSg.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByParametroGeneralSg.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalParametroGeneralSg);
			
			this.jInternalFrameOrderByParametroGeneralSg.getContentPane().add(this.jScrollPanelOrderByParametroGeneralSg, this.gridBagConstraintsParametroGeneralSg);			
		
		} else {
			this.jButtonAbrirOrderByParametroGeneralSg = new JButtonMe();
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
		int iWidthTableCalculado=0;//2530
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=1330;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1200;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.parametrogeneralsgSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosParametroGeneralSg.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosParametroGeneralSg.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosParametroGeneralSg.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosParametroGeneralSg.getRowHeight();//ParametroGeneralSgConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.parametrogeneralsgSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > ParametroGeneralSgConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaParametroGeneralSg.isSelected()) {
					iHeightTable=ParametroGeneralSgConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ParametroGeneralSgConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ParametroGeneralSgConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > ParametroGeneralSgConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaParametroGeneralSg.isSelected()) {
					iHeightTable=ParametroGeneralSgConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ParametroGeneralSgConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ParametroGeneralSgConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosParametroGeneralSg.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosParametroGeneralSg.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosParametroGeneralSg.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosParametroGeneralSg.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosParametroGeneralSg.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosParametroGeneralSg.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByParametroGeneralSg!=null && this.jInternalFrameOrderByParametroGeneralSg.getjTableDatosOrderBy()!=null) {
			//if(!this.parametrogeneralsgSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByParametroGeneralSg.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByParametroGeneralSg.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByParametroGeneralSg.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByParametroGeneralSg.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByParametroGeneralSg.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByParametroGeneralSg.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByParametroGeneralSg.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosParametroGeneralSg.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosParametroGeneralSg.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosParametroGeneralSg.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=parametrogeneralsgLogic.getParametroGeneralSgs().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=parametrogeneralsgs.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<ParametroGeneralSg> TraerParametroGeneralSgBeans(List<ParametroGeneralSg> parametrogeneralsgs,ArrayList<Classe> classes)throws Exception {
		try {
			for(ParametroGeneralSg parametrogeneralsg:parametrogeneralsgs) {
					
				if(!(ParametroGeneralSgConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || ParametroGeneralSgConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					parametrogeneralsg.setsDetalleGeneralEntityReporte(ParametroGeneralSgConstantesFunciones.getParametroGeneralSgDescripcion(parametrogeneralsg));
										
					parametrogeneralsg.setesta_activo_descripcion(ParametroGeneralSgConstantesFunciones.getesta_activoDescripcion(parametrogeneralsg));	
					
						
					
				} else  {
							
					//parametrogeneralsg.setsDetalleGeneralEntityReporte(parametrogeneralsg.getsDetalleGeneralEntityReporte());
										
				}
				
				//parametrogeneralsgbeans.add(parametrogeneralsgbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return parametrogeneralsgs;
    }
	//PARA REPORTES FIN
}
