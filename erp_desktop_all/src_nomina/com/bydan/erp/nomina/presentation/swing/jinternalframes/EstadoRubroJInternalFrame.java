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



import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;





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
import com.bydan.erp.nomina.util.EstadoRubroConstantesFunciones;

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
public class EstadoRubroJInternalFrame extends EstadoRubroBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarEstadoRubro;
	
	protected JMenuBar jmenuBarEstadoRubro;
	
	protected JMenu jmenuEstadoRubro;
	protected JMenu jmenuDatosEstadoRubro;
	protected JMenu jmenuArchivoEstadoRubro;
	protected JMenu jmenuAccionesEstadoRubro;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosEstadoRubro = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutEstadoRubro;	
	protected GridBagConstraints gridBagConstraintsEstadoRubro;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public EstadoRubroDetalleFormJInternalFrame jInternalFrameDetalleFormEstadoRubro;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoEstadoRubro;	
	protected ImportacionJInternalFrame jInternalFrameImportacionEstadoRubro;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public EstadoRubroSessionBean estadorubroSessionBean;
		
	
	
	
	//protected JDesktopPane jDesktopPane;
	public List<EstadoRubro> estadorubros;		
	public List<EstadoRubro> estadorubrosEliminados;	
	public List<EstadoRubro> estadorubrosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByEstadoRubro;		
	protected JButton jButtonAbrirOrderByEstadoRubro;
	
	
	//protected JPanel jPanelOrderByEstadoRubro;
	//public JScrollPane jScrollPanelOrderByEstadoRubro;	
	//protected JButton jButtonCerrarOrderByEstadoRubro;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public EstadoRubroLogic estadorubroLogic;
	
	
	
	public JScrollPane jScrollPanelDatosEstadoRubro;
	public JScrollPane jScrollPanelDatosEdicionEstadoRubro;
	public JScrollPane jScrollPanelDatosGeneralEstadoRubro;
    
	
	
	//public JScrollPane jScrollPanelDatosEstadoRubroOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoEstadoRubro;
	//public JScrollPane jScrollPanelImportacionEstadoRubro;
	
	
	
	protected JPanel jPanelAccionesEstadoRubro;
	
    protected JPanel jPanelPaginacionEstadoRubro;
    protected JPanel jPanelParametrosReportesEstadoRubro;
	protected JPanel jPanelParametrosReportesAccionesEstadoRubro;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1EstadoRubro;
	protected JPanel jPanelParametrosAuxiliar2EstadoRubro;
	protected JPanel jPanelParametrosAuxiliar3EstadoRubro;
	protected JPanel jPanelParametrosAuxiliar4EstadoRubro;
	//protected JPanel jPanelParametrosAuxiliar5EstadoRubro;
	
	
	
	//protected JPanel jPanelReporteDinamicoEstadoRubro;
	//protected JPanel jPanelImportacionEstadoRubro;
	
	
	public JTable jTableDatosEstadoRubro;
	
	
	
	//public JTable jTableDatosEstadoRubroOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoEstadoRubro;
	protected JButton jButtonDuplicarEstadoRubro;
	protected JButton jButtonCopiarEstadoRubro;
	protected JButton jButtonVerFormEstadoRubro;
	protected JButton jButtonNuevoRelacionesEstadoRubro;
	protected JButton jButtonModificarEstadoRubro;
	
    protected JButton jButtonGuardarCambiosTablaEstadoRubro;
	protected JButton jButtonCerrarEstadoRubro;
	
	
	protected JButton jButtonRecargarInformacionEstadoRubro;
	protected JButton jButtonProcesarInformacionEstadoRubro;
	
	
	protected JButton jButtonAnterioresEstadoRubro;
	protected JButton jButtonSiguientesEstadoRubro;
	protected JButton jButtonNuevoGuardarCambiosEstadoRubro;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoEstadoRubro;
	//protected JButton jButtonCerrarReporteDinamicoEstadoRubro;
	//protected JButton jButtonGenerarExcelReporteDinamicoEstadoRubro;	
	
	
	
	//protected JButton jButtonAbrirImportacionEstadoRubro;
	//protected JButton jButtonGenerarImportacionEstadoRubro;
	//protected JButton jButtonCerrarImportacionEstadoRubro;
	//protected JFileChooser jFileChooserImportacionEstadoRubro;
	//protected File fileImportacionEstadoRubro;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarEstadoRubro;
	protected JButton jButtonDuplicarToolBarEstadoRubro;
	protected JButton jButtonNuevoRelacionesToolBarEstadoRubro;
	
	
	public JButton jButtonGuardarCambiosToolBarEstadoRubro;
	protected JButton jButtonCopiarToolBarEstadoRubro;
	protected JButton jButtonVerFormToolBarEstadoRubro;
	public JButton jButtonGuardarCambiosTablaToolBarEstadoRubro;
	protected JButton jButtonMostrarOcultarTablaToolBarEstadoRubro;
	protected JButton jButtonCerrarToolBarEstadoRubro;
	
	protected JButton jButtonRecargarInformacionToolBarEstadoRubro;
	protected JButton jButtonProcesarInformacionToolBarEstadoRubro;
	protected JButton jButtonAnterioresToolBarEstadoRubro;
	protected JButton jButtonSiguientesToolBarEstadoRubro;
	protected JButton jButtonNuevoGuardarCambiosToolBarEstadoRubro;
	protected JButton jButtonAbrirOrderByToolBarEstadoRubro;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoEstadoRubro;
	protected JMenuItem jMenuItemDuplicarEstadoRubro;
	protected JMenuItem jMenuItemNuevoRelacionesEstadoRubro;
	
	
	protected JMenuItem jMenuItemGuardarCambiosEstadoRubro;
	protected JMenuItem jMenuItemCopiarEstadoRubro;
	protected JMenuItem jMenuItemVerFormEstadoRubro;
	protected JMenuItem jMenuItemGuardarCambiosTablaEstadoRubro;
	protected JMenuItem jMenuItemCerrarEstadoRubro;
	protected JMenuItem jMenuItemDetalleCerrarEstadoRubro;
	protected JMenuItem jMenuItemDetalleAbrirOrderByEstadoRubro;
	protected JMenuItem jMenuItemDetalleMostarOcultarEstadoRubro;
	
	protected JMenuItem jMenuItemRecargarInformacionEstadoRubro;
	protected JMenuItem jMenuItemProcesarInformacionEstadoRubro;
	protected JMenuItem jMenuItemAnterioresEstadoRubro;
	protected JMenuItem jMenuItemSiguientesEstadoRubro;
	protected JMenuItem jMenuItemNuevoGuardarCambiosEstadoRubro;
	protected JMenuItem jMenuItemAbrirOrderByEstadoRubro;
	protected JMenuItem jMenuItemMostrarOcultarEstadoRubro;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesEstadoRubro;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosEstadoRubro;
	protected JCheckBox jCheckBoxSeleccionadosEstadoRubro;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaEstadoRubro;
	protected JCheckBox jCheckBoxConGraficoReporteEstadoRubro;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesEstadoRubro;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesEstadoRubro;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoEstadoRubro;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoEstadoRubro;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesEstadoRubro;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionEstadoRubro;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesEstadoRubro;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesEstadoRubro;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarEstadoRubro;
	protected JTextField jTextFieldValorCampoGeneralEstadoRubro;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteEstadoRubro;
	//public JList<Reporte> jListColumnasSelectReporteEstadoRubro;
	//public JScrollPane jScrollColumnasSelectReporteEstadoRubro;
	
	//public JLabel jLabelRelacionesSelectReporteEstadoRubro;
	//public JList<Reporte> jListRelacionesSelectReporteEstadoRubro;
	//public JScrollPane jScrollRelacionesSelectReporteEstadoRubro;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoEstadoRubro;
	//protected JCheckBox jCheckBoxConGraficoDinamicoEstadoRubro;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoEstadoRubro;
	//public JLabel jLabelTiposArchivoReporteDinamicoEstadoRubro;
	
		
	//public JLabel jLabelArchivoImportacionEstadoRubro;	
	//public JLabel jLabelPathArchivoImportacionEstadoRubro;
	//protected JTextField jTextFieldPathArchivoImportacionEstadoRubro;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoEstadoRubro;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoEstadoRubro;
	
	//public JLabel jLabelColumnaCategoriaValorEstadoRubro;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorEstadoRubro;
	
	//public JLabel jLabelColumnasValoresGraficoEstadoRubro;
	//public JList<Reporte> jListColumnasValoresGraficoEstadoRubro;
	//public JScrollPane jScrollColumnasValoresGraficoEstadoRubro;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoEstadoRubro;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoEstadoRubro;	
	
	
	
	
	
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
	public EstadoRubroJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("EstadoRubro No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoRubroJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EstadoRubro No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoRubroJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EstadoRubro No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoRubroJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("EstadoRubro No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionEstadoRubro)	{
		this.jButtonRecargarInformacionEstadoRubro = jButtonRecargarInformacionEstadoRubro;
	}
	
	public JButton getjButtonProcesarInformacionEstadoRubro() {
		return this.jButtonProcesarInformacionEstadoRubro;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionEstadoRubro)	{
		this.jButtonProcesarInformacionEstadoRubro = jButtonProcesarInformacionEstadoRubro;
	}
	
	
	public JButton getjButtonRecargarInformacionEstadoRubro() {
		return this.jButtonRecargarInformacionEstadoRubro;
	}
	
	
	public List<EstadoRubro> getestadorubros() {
		return this.estadorubros;
	}

	public void setestadorubros(List<EstadoRubro> estadorubros) {
		this.estadorubros = estadorubros;
	}
	
	public List<EstadoRubro> getestadorubrosAux() {
		return this.estadorubrosAux;
	}

	public void setestadorubrosAux(List<EstadoRubro> estadorubrosAux) {
		this.estadorubrosAux = estadorubrosAux;
	}
	
	public List<EstadoRubro> getestadorubrosEliminados() {
		return this.estadorubrosEliminados;
	}

	public void setEstadoRubrosEliminados(List<EstadoRubro> estadorubrosEliminados) {
		this.estadorubrosEliminados = estadorubrosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarEstadoRubro() {
		return jComboBoxTiposSeleccionarEstadoRubro;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarEstadoRubro(
			JComboBox jComboBoxTiposSeleccionarEstadoRubro) {
		this.jComboBoxTiposSeleccionarEstadoRubro = jComboBoxTiposSeleccionarEstadoRubro;
	}
	
	public void setBorderResaltarTiposSeleccionarEstadoRubro() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarEstadoRubro.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarEstadoRubro .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralEstadoRubro() {
		return jTextFieldValorCampoGeneralEstadoRubro;
	}

	public void setjTextFieldValorCampoGeneralEstadoRubro(
			JTextField jTextFieldValorCampoGeneralEstadoRubro) {
		this.jTextFieldValorCampoGeneralEstadoRubro = jTextFieldValorCampoGeneralEstadoRubro;
	}

	public void setBorderResaltarValorCampoGeneralEstadoRubro() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoRubro.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralEstadoRubro .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosEstadoRubro() {
		return this.jCheckBoxSeleccionarTodosEstadoRubro;
	}

	public void setjCheckBoxSeleccionarTodosEstadoRubro(
			JCheckBox jCheckBoxSeleccionarTodosEstadoRubro) {
		this.jCheckBoxSeleccionarTodosEstadoRubro = jCheckBoxSeleccionarTodosEstadoRubro;
	}

	public void setBorderResaltarSeleccionarTodosEstadoRubro() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoRubro.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosEstadoRubro .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosEstadoRubro() {
		return this.jCheckBoxSeleccionadosEstadoRubro;
	}

	public void setjCheckBoxSeleccionadosEstadoRubro(
			JCheckBox jCheckBoxSeleccionadosEstadoRubro) {
		this.jCheckBoxSeleccionadosEstadoRubro = jCheckBoxSeleccionadosEstadoRubro;
	}
	
	public void setBorderResaltarSeleccionadosEstadoRubro() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoRubro.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosEstadoRubro .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesEstadoRubro() {
		return this.jComboBoxTiposArchivosReportesEstadoRubro;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesEstadoRubro(
			JComboBox jComboBoxTiposArchivosReportesEstadoRubro) {
		this.jComboBoxTiposArchivosReportesEstadoRubro = jComboBoxTiposArchivosReportesEstadoRubro;
	}

	public void setBorderResaltarTiposArchivosReportesEstadoRubro() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoRubro.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesEstadoRubro .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesEstadoRubro() {
		return this.jComboBoxTiposReportesEstadoRubro;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesEstadoRubro(
			JComboBox jComboBoxTiposReportesEstadoRubro) {
		this.jComboBoxTiposReportesEstadoRubro = jComboBoxTiposReportesEstadoRubro;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoEstadoRubro() {
	//	return jComboBoxTiposReportesDinamicoEstadoRubro;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoEstadoRubro(
	//		JComboBox jComboBoxTiposReportesDinamicoEstadoRubro) {
	//	this.jComboBoxTiposReportesDinamicoEstadoRubro = jComboBoxTiposReportesDinamicoEstadoRubro;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoEstadoRubro() {
	//	return jComboBoxTiposArchivosReportesDinamicoEstadoRubro;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoEstadoRubro(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoEstadoRubro) {
	//	this.jComboBoxTiposArchivosReportesDinamicoEstadoRubro = jComboBoxTiposArchivosReportesDinamicoEstadoRubro;
	//}
	
	public void setBorderResaltarTiposReportesEstadoRubro() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoRubro.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesEstadoRubro .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesEstadoRubro() {
		return this.jComboBoxTiposGraficosReportesEstadoRubro;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesEstadoRubro(
			JComboBox jComboBoxTiposGraficosReportesEstadoRubro) {
		this.jComboBoxTiposGraficosReportesEstadoRubro = jComboBoxTiposGraficosReportesEstadoRubro;
	}
	
	public void setBorderResaltarTiposGraficosReportesEstadoRubro() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoRubro.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesEstadoRubro .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionEstadoRubro() {
		return this.jComboBoxTiposPaginacionEstadoRubro;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionEstadoRubro(
			JComboBox jComboBoxTiposPaginacionEstadoRubro) {
		this.jComboBoxTiposPaginacionEstadoRubro = jComboBoxTiposPaginacionEstadoRubro;
	}
	
	public void setBorderResaltarTiposPaginacionEstadoRubro() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoRubro.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionEstadoRubro .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesEstadoRubro() {
		return this.jComboBoxTiposRelacionesEstadoRubro;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesEstadoRubro() {
		return this.jComboBoxTiposAccionesEstadoRubro;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesEstadoRubro(
			JComboBox jComboBoxTiposRelacionesEstadoRubro) {
		this.jComboBoxTiposRelacionesEstadoRubro = jComboBoxTiposRelacionesEstadoRubro;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesEstadoRubro(
			JComboBox jComboBoxTiposAccionesEstadoRubro) {
		this.jComboBoxTiposAccionesEstadoRubro = jComboBoxTiposAccionesEstadoRubro;
	}
	
	public void setBorderResaltarTiposRelacionesEstadoRubro() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoRubro.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesEstadoRubro .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesEstadoRubro() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoRubro.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesEstadoRubro .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoEstadoRubro() {
	//	return jCheckBoxConGraficoDinamicoEstadoRubro;
	//}

	//public void setjCheckBoxConGraficoDinamicoEstadoRubro(
	//		JCheckBox jCheckBoxConGraficoDinamicoEstadoRubro) {
	//	this.jCheckBoxConGraficoDinamicoEstadoRubro = jCheckBoxConGraficoDinamicoEstadoRubro;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoEstadoRubro() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarEstadoRubro.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoEstadoRubro .setBorder(borderResaltar);		
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
		this.estadorubroSessionBean=new EstadoRubroSessionBean();
		
		this.estadorubroSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.estadorubroSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.estadorubroSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=EstadoRubroJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=EstadoRubroJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		EstadoRubroJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		EstadoRubroJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		EstadoRubroJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Estado Rubro MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 910) {
			iHeight=910;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.estadorubroSessionBean.getEsGuardarRelacionado()) {
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
		
		EstadoRubroJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("EstadoRubro No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarEstadoRubro= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarEstadoRubro=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarEstadoRubro,this.jTtoolBarEstadoRubro,
							"nuevo","nuevo","Nuevo"+" "+EstadoRubroConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarEstadoRubro=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarEstadoRubro,this.jTtoolBarEstadoRubro,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarEstadoRubro=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarEstadoRubro,this.jTtoolBarEstadoRubro,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+EstadoRubroConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarEstadoRubro=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarEstadoRubro,this.jTtoolBarEstadoRubro,
							"duplicar","duplicar","Duplicar"+" "+EstadoRubroConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarEstadoRubro=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarEstadoRubro,this.jTtoolBarEstadoRubro,
							"copiar","copiar","Copiar"+" "+EstadoRubroConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarEstadoRubro=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarEstadoRubro,this.jTtoolBarEstadoRubro,
							"ver_form","ver_form","Ver"+" "+EstadoRubroConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarEstadoRubro=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEstadoRubro,this.jTtoolBarEstadoRubro,
							"recargar","recargar","Recargar"+" "+EstadoRubroConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarEstadoRubro=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEstadoRubro,this.jTtoolBarEstadoRubro,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarEstadoRubro=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEstadoRubro,this.jTtoolBarEstadoRubro,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarEstadoRubro=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarEstadoRubro,this.jTtoolBarEstadoRubro,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarEstadoRubro=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarEstadoRubro,this.jTtoolBarEstadoRubro,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarEstadoRubro=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarEstadoRubro,this.jTtoolBarEstadoRubro,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+EstadoRubroConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarEstadoRubro=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarEstadoRubro,this.jTtoolBarEstadoRubro,
							"cerrar","cerrar","Salir"+" "+EstadoRubroConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarEstadoRubro=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarEstadoRubro;
			
				this.jButtonProcesarInformacionToolBarEstadoRubro=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarEstadoRubro;
				
		//protected JButton jButtonModificarToolBarEstadoRubro;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarEstadoRubro=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuEstadoRubro=new JMenuMe("General");
		this.jmenuArchivoEstadoRubro=new JMenuMe("Archivo");
		this.jmenuAccionesEstadoRubro=new JMenuMe("Acciones");
		this.jmenuDatosEstadoRubro=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoEstadoRubro= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoEstadoRubro.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoEstadoRubro,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoEstadoRubro, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarEstadoRubro= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarEstadoRubro.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarEstadoRubro,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarEstadoRubro, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesEstadoRubro= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesEstadoRubro.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesEstadoRubro,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesEstadoRubro, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosEstadoRubro= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosEstadoRubro.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosEstadoRubro,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosEstadoRubro, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarEstadoRubro= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarEstadoRubro.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarEstadoRubro,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarEstadoRubro, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormEstadoRubro= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormEstadoRubro.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormEstadoRubro,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormEstadoRubro, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaEstadoRubro= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaEstadoRubro.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaEstadoRubro,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaEstadoRubro, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarEstadoRubro= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarEstadoRubro.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarEstadoRubro,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarEstadoRubro, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionEstadoRubro= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionEstadoRubro.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionEstadoRubro,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionEstadoRubro, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionEstadoRubro= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionEstadoRubro.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionEstadoRubro,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresEstadoRubro= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresEstadoRubro.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresEstadoRubro,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresEstadoRubro, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesEstadoRubro= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesEstadoRubro.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesEstadoRubro,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesEstadoRubro, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByEstadoRubro= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByEstadoRubro.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByEstadoRubro,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByEstadoRubro, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarEstadoRubro= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarEstadoRubro.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarEstadoRubro,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarEstadoRubro, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByEstadoRubro= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByEstadoRubro.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByEstadoRubro,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByEstadoRubro, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarEstadoRubro= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarEstadoRubro.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarEstadoRubro,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarEstadoRubro, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosEstadoRubro= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosEstadoRubro.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosEstadoRubro,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosEstadoRubro, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoEstadoRubro.add(this.jMenuItemCerrarEstadoRubro);
			
			this.jmenuAccionesEstadoRubro.add(this.jMenuItemNuevoEstadoRubro);
			this.jmenuAccionesEstadoRubro.add(this.jMenuItemNuevoGuardarCambiosEstadoRubro);
			this.jmenuAccionesEstadoRubro.add(this.jMenuItemNuevoRelacionesEstadoRubro);
			this.jmenuAccionesEstadoRubro.add(this.jMenuItemGuardarCambiosTablaEstadoRubro);		
			this.jmenuAccionesEstadoRubro.add(this.jMenuItemDuplicarEstadoRubro);		
			this.jmenuAccionesEstadoRubro.add(this.jMenuItemCopiarEstadoRubro);		
			this.jmenuAccionesEstadoRubro.add(this.jMenuItemVerFormEstadoRubro);		
			
			this.jmenuDatosEstadoRubro.add(this.jMenuItemRecargarInformacionEstadoRubro);				
			this.jmenuDatosEstadoRubro.add(this.jMenuItemAnterioresEstadoRubro);				
			this.jmenuDatosEstadoRubro.add(this.jMenuItemSiguientesEstadoRubro);				
			this.jmenuDatosEstadoRubro.add(this.jMenuItemAbrirOrderByEstadoRubro);				
			this.jmenuDatosEstadoRubro.add(this.jMenuItemMostrarOcultarEstadoRubro);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesEstadoRubro.add(this.jMenuItemGuardarCambiosEstadoRubro);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoEstadoRubro, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesEstadoRubro, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosEstadoRubro, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarEstadoRubro.add(this.jmenuArchivoEstadoRubro);		
			this.jmenuBarEstadoRubro.add(this.jmenuAccionesEstadoRubro);		
			this.jmenuBarEstadoRubro.add(this.jmenuDatosEstadoRubro);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarEstadoRubro);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasEstadoRubro() {
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
			//this.jInternalFrameDetalleEstadoRubro = new EstadoRubroDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Estado Rubro DATOS");
			this.jInternalFrameDetalleFormEstadoRubro = new EstadoRubroDetalleFormJInternalFrame(jDesktopPane,this.estadorubroSessionBean.getConGuardarRelaciones(),this.estadorubroSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormEstadoRubro = null;//new EstadoRubroDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutEstadoRubro= new GridBagLayout();
		
		
		this.jTableDatosEstadoRubro = new JTableMe();      
		
		String sToolTipEstadoRubro="";
		sToolTipEstadoRubro=EstadoRubroConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipEstadoRubro+="(Nomina.EstadoRubro)";
		}
		
		if(!this.estadorubroSessionBean.getEsGuardarRelacionado()) {
			sToolTipEstadoRubro+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosEstadoRubro.setToolTipText(sToolTipEstadoRubro);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosEstadoRubro);
		this.jTableDatosEstadoRubro.setAutoCreateRowSorter(true);
		this.jTableDatosEstadoRubro.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosEstadoRubro.setRowSelectionAllowed(true);
		this.jTableDatosEstadoRubro.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosEstadoRubro,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoEstadoRubro = new JButtonMe();
		this.jButtonDuplicarEstadoRubro = new JButtonMe();
		this.jButtonCopiarEstadoRubro = new JButtonMe();
		this.jButtonVerFormEstadoRubro = new JButtonMe();
		this.jButtonNuevoRelacionesEstadoRubro = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaEstadoRubro = new JButtonMe();
		this.jButtonCerrarEstadoRubro = new JButtonMe();
		
		this.jScrollPanelDatosEstadoRubro = new JScrollPane();   
        this.jScrollPanelDatosGeneralEstadoRubro = new JScrollPane();
		
				
		
		
		this.jPanelAccionesEstadoRubro = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Estado Rubro";
		
		if(!this.estadorubroSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosEstadoRubro.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Rubros" + this.sPath));
		} else {
			this.jScrollPanelDatosEstadoRubro.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralEstadoRubro.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesEstadoRubro.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesEstadoRubro.setToolTipText("Acciones");
        this.jPanelAccionesEstadoRubro.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralEstadoRubro, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEstadoRubro, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoEstadoRubro=new ReporteDinamicoJInternalFrame(EstadoRubroConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoEstadoRubro();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionEstadoRubro=new ImportacionJInternalFrame(EstadoRubroConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionEstadoRubro();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByEstadoRubro = new JButtonMe();
		
		this.jButtonAbrirOrderByEstadoRubro.setText("Orden");
		this.jButtonAbrirOrderByEstadoRubro.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByEstadoRubro,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByEstadoRubro, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByEstadoRubro.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByEstadoRubro.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByEstadoRubro=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEstadoRubro,false,this);
			
			//this.cargarOrderByEstadoRubro(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByEstadoRubro=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEstadoRubro,true,this);
			
			//this.cargarOrderByEstadoRubro(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosEstadoRubro.setMinimumSize(new Dimension(400,50));//430
		this.jTableDatosEstadoRubro.setMaximumSize(new Dimension(400,50));//430
		this.jTableDatosEstadoRubro.setPreferredSize(new Dimension(400,50));//430
		
		this.jScrollPanelDatosEstadoRubro.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosEstadoRubro.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosEstadoRubro.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoEstadoRubro.setText("Nuevo");
		this.jButtonDuplicarEstadoRubro.setText("Duplicar");
		this.jButtonCopiarEstadoRubro.setText("Copiar");
		this.jButtonVerFormEstadoRubro.setText("Ver");
		this.jButtonNuevoRelacionesEstadoRubro.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaEstadoRubro.setText("Guardar");
		this.jButtonCerrarEstadoRubro.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoEstadoRubro,"nuevo_button","Nuevo",this.estadorubroSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarEstadoRubro,"duplicar_button","Duplicar",this.estadorubroSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarEstadoRubro,"copiar_button","Copiar",this.estadorubroSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormEstadoRubro,"ver_form","Ver",this.estadorubroSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesEstadoRubro,"nuevorelaciones_button","Nuevo Rel",this.estadorubroSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaEstadoRubro,"guardarcambiostabla_button","Guardar",this.estadorubroSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarEstadoRubro,"cerrar_button","Salir",this.estadorubroSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoEstadoRubro, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarEstadoRubro, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarEstadoRubro, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormEstadoRubro, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesEstadoRubro, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaEstadoRubro, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarEstadoRubro, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoEstadoRubro.setToolTipText("Nuevo"+" "+EstadoRubroConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarEstadoRubro.setToolTipText("Duplicar"+" "+EstadoRubroConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarEstadoRubro.setToolTipText("Copiar"+" "+EstadoRubroConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormEstadoRubro.setToolTipText("Ver"+" "+EstadoRubroConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesEstadoRubro.setToolTipText("Nuevo Rel"+" "+EstadoRubroConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaEstadoRubro.setToolTipText("Guardar"+" "+EstadoRubroConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarEstadoRubro.setToolTipText("Salir"+" "+EstadoRubroConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoEstadoRubro";
		inputMap = this.jButtonNuevoEstadoRubro.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoEstadoRubro.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoEstadoRubro"));
		
		//DUPLICAR
		sMapKey = "DuplicarEstadoRubro";
		inputMap = this.jButtonDuplicarEstadoRubro.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarEstadoRubro.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarEstadoRubro"));
		
		//COPIAR
		sMapKey = "CopiarEstadoRubro";
		inputMap = this.jButtonCopiarEstadoRubro.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarEstadoRubro.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarEstadoRubro"));
		
		//VEr FORM
		sMapKey = "VerFormEstadoRubro";
		inputMap = this.jButtonVerFormEstadoRubro.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormEstadoRubro.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormEstadoRubro"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesEstadoRubro";
		inputMap = this.jButtonNuevoRelacionesEstadoRubro.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesEstadoRubro.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesEstadoRubro"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarEstadoRubro";
		inputMap = this.jButtonModificarEstadoRubro.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarEstadoRubro.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarEstadoRubro"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarEstadoRubro";
		inputMap = this.jButtonCerrarEstadoRubro.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarEstadoRubro.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarEstadoRubro"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaEstadoRubro";
		inputMap = this.jButtonGuardarCambiosTablaEstadoRubro.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaEstadoRubro.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaEstadoRubro"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesEstadoRubro = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesEstadoRubro = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionEstadoRubro = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1EstadoRubro= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2EstadoRubro= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3EstadoRubro= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4EstadoRubro= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5EstadoRubro= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesEstadoRubro.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesEstadoRubro.setName("jPanelParametrosReportesEstadoRubro"); 
		
		this.jPanelParametrosReportesAccionesEstadoRubro.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesEstadoRubro.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesEstadoRubro.setName("jPanelParametrosReportesAccionesEstadoRubro"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesEstadoRubro, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesEstadoRubro, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionEstadoRubro = new JButtonMe();
		this.jButtonRecargarInformacionEstadoRubro.setText("Recargar");
		this.jButtonRecargarInformacionEstadoRubro.setToolTipText("Recargar"+" "+EstadoRubroConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionEstadoRubro,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionEstadoRubro = new JButtonMe();
		this.jButtonProcesarInformacionEstadoRubro.setText("Procesar");
		this.jButtonProcesarInformacionEstadoRubro.setToolTipText("Procesar"+" "+EstadoRubroConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionEstadoRubro.setVisible(false);
			
		this.jButtonProcesarInformacionEstadoRubro.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionEstadoRubro.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionEstadoRubro.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesEstadoRubro = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEstadoRubro.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesEstadoRubro.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesEstadoRubro = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEstadoRubro.setText("TIPO");       
		this.jComboBoxTiposReportesEstadoRubro.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesEstadoRubro = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEstadoRubro.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesEstadoRubro.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionEstadoRubro = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionEstadoRubro.setText("Paginacion");
		this.jComboBoxTiposPaginacionEstadoRubro.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesEstadoRubro = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesEstadoRubro.setText("Accion");
		this.jComboBoxTiposRelacionesEstadoRubro.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesEstadoRubro = new JComboBoxMe();
		//this.jComboBoxTiposAccionesEstadoRubro.setText("Accion");
		this.jComboBoxTiposAccionesEstadoRubro.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarEstadoRubro = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarEstadoRubro.setText("Accion");
		this.jComboBoxTiposSeleccionarEstadoRubro.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralEstadoRubro=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralEstadoRubro.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralEstadoRubro.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralEstadoRubro.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesEstadoRubro = new JLabelMe();
		
		this.jLabelAccionesEstadoRubro.setText("Acciones");		
		this.jLabelAccionesEstadoRubro.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEstadoRubro.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEstadoRubro.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosEstadoRubro = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosEstadoRubro.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosEstadoRubro.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosEstadoRubro = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosEstadoRubro.setText("Seleccionados");
		this.jCheckBoxSeleccionadosEstadoRubro.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaEstadoRubro = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaEstadoRubro.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaEstadoRubro.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteEstadoRubro = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteEstadoRubro.setText("Graf.");
		this.jCheckBoxConGraficoReporteEstadoRubro.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresEstadoRubro = new JButtonMe();
		//this.jButtonAnterioresEstadoRubro.setText("<<");
        this.jButtonAnterioresEstadoRubro.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresEstadoRubro,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresEstadoRubro, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesEstadoRubro = new JButtonMe();
		//this.jButtonSiguientesEstadoRubro.setText(">>");
        this.jButtonSiguientesEstadoRubro.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesEstadoRubro,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesEstadoRubro, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosEstadoRubro = new JButtonMe();
		this.jButtonNuevoGuardarCambiosEstadoRubro.setText("Nue");
        this.jButtonNuevoGuardarCambiosEstadoRubro.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosEstadoRubro,"nuevoguardarcambios_button","Nue",this.estadorubroSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosEstadoRubro, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosEstadoRubro";
		inputMap = this.jButtonNuevoGuardarCambiosEstadoRubro.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosEstadoRubro.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosEstadoRubro"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionEstadoRubro";
		inputMap = this.jButtonRecargarInformacionEstadoRubro.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionEstadoRubro.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionEstadoRubro"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesEstadoRubro";
		inputMap = this.jButtonSiguientesEstadoRubro.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesEstadoRubro.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesEstadoRubro"));
		
		//ANTERIORES		
		sMapKey = "AnterioresEstadoRubro";
		inputMap = this.jButtonAnterioresEstadoRubro.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresEstadoRubro.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresEstadoRubro"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasEstadoRubro();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesEstadoRubro.setMinimumSize(new Dimension(this.getWidth(),EstadoRubroBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EstadoRubroBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesEstadoRubro.setMaximumSize(new Dimension(this.getWidth(),EstadoRubroBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EstadoRubroBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesEstadoRubro.setPreferredSize(new Dimension(this.getWidth(),EstadoRubroBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EstadoRubroBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionEstadoRubro = new GridBagLayout();

			this.jPanelPaginacionEstadoRubro.setLayout(gridaBagLayoutPaginacionEstadoRubro);						
			
			this.gridBagConstraintsEstadoRubro = new GridBagConstraints();
			this.gridBagConstraintsEstadoRubro.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsEstadoRubro.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoRubro.gridy = 0;
			this.gridBagConstraintsEstadoRubro.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionEstadoRubro.add(this.jButtonAnterioresEstadoRubro, this.gridBagConstraintsEstadoRubro);
					
						
			this.gridBagConstraintsEstadoRubro = new GridBagConstraints();
			this.gridBagConstraintsEstadoRubro.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsEstadoRubro.gridy = 0;
			
			this.jPanelPaginacionEstadoRubro.add(this.jButtonNuevoGuardarCambiosEstadoRubro, this.gridBagConstraintsEstadoRubro);
						
			
			this.gridBagConstraintsEstadoRubro = new GridBagConstraints();
			this.gridBagConstraintsEstadoRubro.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsEstadoRubro.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsEstadoRubro.gridy = 0;
			this.jPanelPaginacionEstadoRubro.add(this.jButtonSiguientesEstadoRubro, this.gridBagConstraintsEstadoRubro);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsEstadoRubro = new GridBagConstraints();
			this.gridBagConstraintsEstadoRubro.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoRubro.gridy = 1;
			this.gridBagConstraintsEstadoRubro.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEstadoRubro.add(this.jButtonNuevoEstadoRubro, this.gridBagConstraintsEstadoRubro);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsEstadoRubro = new GridBagConstraints();
				this.gridBagConstraintsEstadoRubro.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsEstadoRubro.gridy = 1;
				this.gridBagConstraintsEstadoRubro.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionEstadoRubro.add(this.jButtonNuevoRelacionesEstadoRubro, this.gridBagConstraintsEstadoRubro);
			}
			
			
			if(!this.estadorubroSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsEstadoRubro = new GridBagConstraints();
				this.gridBagConstraintsEstadoRubro.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsEstadoRubro.gridy = 1;
				this.gridBagConstraintsEstadoRubro.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionEstadoRubro.add(this.jButtonGuardarCambiosTablaEstadoRubro, this.gridBagConstraintsEstadoRubro);
			}
			
			
			
			this.gridBagConstraintsEstadoRubro = new GridBagConstraints();
			this.gridBagConstraintsEstadoRubro.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoRubro.gridy = 1;
			this.gridBagConstraintsEstadoRubro.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEstadoRubro.add(this.jButtonDuplicarEstadoRubro, this.gridBagConstraintsEstadoRubro);
			
			this.gridBagConstraintsEstadoRubro = new GridBagConstraints();
			this.gridBagConstraintsEstadoRubro.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoRubro.gridy = 1;
			this.gridBagConstraintsEstadoRubro.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEstadoRubro.add(this.jButtonCopiarEstadoRubro, this.gridBagConstraintsEstadoRubro);
		
			this.gridBagConstraintsEstadoRubro = new GridBagConstraints();
			this.gridBagConstraintsEstadoRubro.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoRubro.gridy = 1;
			this.gridBagConstraintsEstadoRubro.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEstadoRubro.add(this.jButtonVerFormEstadoRubro, this.gridBagConstraintsEstadoRubro);
		
			this.gridBagConstraintsEstadoRubro = new GridBagConstraints();
			this.gridBagConstraintsEstadoRubro.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoRubro.gridy = 1;
			this.gridBagConstraintsEstadoRubro.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionEstadoRubro.add(this.jButtonCerrarEstadoRubro, this.gridBagConstraintsEstadoRubro);
		
		
		
		this.jButtonRecargarInformacionEstadoRubro.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionEstadoRubro.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionEstadoRubro.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionEstadoRubro, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesEstadoRubro.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesEstadoRubro.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesEstadoRubro.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesEstadoRubro, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesEstadoRubro.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesEstadoRubro.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesEstadoRubro.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesEstadoRubro, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesEstadoRubro.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesEstadoRubro.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesEstadoRubro.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesEstadoRubro, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionEstadoRubro.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionEstadoRubro.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionEstadoRubro.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionEstadoRubro, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesEstadoRubro.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesEstadoRubro.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesEstadoRubro.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesEstadoRubro, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesEstadoRubro.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEstadoRubro.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEstadoRubro.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesEstadoRubro, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarEstadoRubro.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarEstadoRubro.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarEstadoRubro.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarEstadoRubro, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaEstadoRubro.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaEstadoRubro.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaEstadoRubro.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaEstadoRubro, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteEstadoRubro.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteEstadoRubro.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteEstadoRubro.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteEstadoRubro, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosEstadoRubro.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosEstadoRubro.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosEstadoRubro.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosEstadoRubro, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosEstadoRubro.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosEstadoRubro.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosEstadoRubro.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosEstadoRubro, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesEstadoRubro = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesEstadoRubro = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1EstadoRubro = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2EstadoRubro = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3EstadoRubro = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4EstadoRubro = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesEstadoRubro.setLayout(gridaBagParametrosReportesEstadoRubro);
			this.jPanelParametrosReportesAccionesEstadoRubro.setLayout(gridaBagParametrosReportesAccionesEstadoRubro);
			
			
			this.jPanelParametrosAuxiliar1EstadoRubro.setLayout(gridaBagParametrosAuxiliar1EstadoRubro);
			this.jPanelParametrosAuxiliar2EstadoRubro.setLayout(gridaBagParametrosAuxiliar2EstadoRubro);
			this.jPanelParametrosAuxiliar3EstadoRubro.setLayout(gridaBagParametrosAuxiliar3EstadoRubro);
			this.jPanelParametrosAuxiliar4EstadoRubro.setLayout(gridaBagParametrosAuxiliar4EstadoRubro);
			//this.jPanelParametrosAuxiliar5EstadoRubro.setLayout(gridaBagParametrosAuxiliar2EstadoRubro);			
			
			
			
			
			this.gridBagConstraintsEstadoRubro = new GridBagConstraints();
			this.gridBagConstraintsEstadoRubro.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoRubro.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEstadoRubro.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstadoRubro.add(this.jButtonRecargarInformacionEstadoRubro, this.gridBagConstraintsEstadoRubro);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsEstadoRubro = new GridBagConstraints();
			this.gridBagConstraintsEstadoRubro.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoRubro.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoRubro.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1EstadoRubro.add(this.jComboBoxTiposPaginacionEstadoRubro, this.gridBagConstraintsEstadoRubro);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsEstadoRubro = new GridBagConstraints();
			this.gridBagConstraintsEstadoRubro.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoRubro.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoRubro.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1EstadoRubro.add(this.jCheckBoxConAltoMaximoTablaEstadoRubro, this.gridBagConstraintsEstadoRubro);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsEstadoRubro = new GridBagConstraints();
			this.gridBagConstraintsEstadoRubro.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoRubro.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoRubro.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1EstadoRubro.add(this.jComboBoxTiposArchivosReportesEstadoRubro, this.gridBagConstraintsEstadoRubro);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsEstadoRubro = new GridBagConstraints();
			this.gridBagConstraintsEstadoRubro.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoRubro.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoRubro.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoRubro.add(this.jPanelParametrosAuxiliar1EstadoRubro, this.gridBagConstraintsEstadoRubro);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsEstadoRubro = new GridBagConstraints();
			this.gridBagConstraintsEstadoRubro.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoRubro.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoRubro.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEstadoRubro.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4EstadoRubro.add(this.jComboBoxTiposReportesEstadoRubro, this.gridBagConstraintsEstadoRubro);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsEstadoRubro = new GridBagConstraints();
			this.gridBagConstraintsEstadoRubro.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoRubro.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoRubro.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoRubro.add(this.jPanelParametrosAuxiliar4EstadoRubro, this.gridBagConstraintsEstadoRubro);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsEstadoRubro = new GridBagConstraints();
			this.gridBagConstraintsEstadoRubro.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoRubro.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoRubro.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoRubro.add(this.jComboBoxTiposReportesEstadoRubro, this.gridBagConstraintsEstadoRubro);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsEstadoRubro = new GridBagConstraints();
			this.gridBagConstraintsEstadoRubro.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoRubro.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoRubro.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEstadoRubro.add(this.jCheckBoxGenerarReporteEstadoRubro, this.gridBagConstraintsEstadoRubro);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsEstadoRubro = new GridBagConstraints();
			this.gridBagConstraintsEstadoRubro.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoRubro.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoRubro.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoRubro.add(this.jPanelParametrosAuxiliar2EstadoRubro, this.gridBagConstraintsEstadoRubro);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsEstadoRubro = new GridBagConstraints();
			this.gridBagConstraintsEstadoRubro.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoRubro.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEstadoRubro.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEstadoRubro.add(this.jLabelAccionesEstadoRubro, this.gridBagConstraintsEstadoRubro);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsEstadoRubro = new GridBagConstraints();
				this.gridBagConstraintsEstadoRubro.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsEstadoRubro.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsEstadoRubro.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesEstadoRubro.add(this.jButtonAbrirOrderByEstadoRubro, this.gridBagConstraintsEstadoRubro);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsEstadoRubro = new GridBagConstraints();
			this.gridBagConstraintsEstadoRubro.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsEstadoRubro.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoRubro.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstadoRubro.add(this.jComboBoxTiposSeleccionarEstadoRubro, this.gridBagConstraintsEstadoRubro);			
			
			
			/*
			this.gridBagConstraintsEstadoRubro = new GridBagConstraints();
			this.gridBagConstraintsEstadoRubro.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoRubro.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEstadoRubro.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEstadoRubro.add(this.jCheckBoxSeleccionarTodosEstadoRubro, this.gridBagConstraintsEstadoRubro);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsEstadoRubro = new GridBagConstraints();
			this.gridBagConstraintsEstadoRubro.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoRubro.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoRubro.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEstadoRubro.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3EstadoRubro.add(this.jCheckBoxSeleccionarTodosEstadoRubro, this.gridBagConstraintsEstadoRubro);															
				
			this.gridBagConstraintsEstadoRubro = new GridBagConstraints();
			this.gridBagConstraintsEstadoRubro.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoRubro.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoRubro.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEstadoRubro.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3EstadoRubro.add(this.jCheckBoxSeleccionadosEstadoRubro, this.gridBagConstraintsEstadoRubro);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsEstadoRubro = new GridBagConstraints();
			this.gridBagConstraintsEstadoRubro.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoRubro.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoRubro.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoRubro.add(this.jPanelParametrosAuxiliar3EstadoRubro, this.gridBagConstraintsEstadoRubro);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsEstadoRubro = new GridBagConstraints();
			this.gridBagConstraintsEstadoRubro.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoRubro.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstadoRubro.add(this.jComboBoxTiposRelacionesEstadoRubro, this.gridBagConstraintsEstadoRubro);
				
			this.gridBagConstraintsEstadoRubro = new GridBagConstraints();
			this.gridBagConstraintsEstadoRubro.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoRubro.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstadoRubro.add(this.jComboBoxTiposAccionesEstadoRubro, this.gridBagConstraintsEstadoRubro);
	
				
			this.gridBagConstraintsEstadoRubro = new GridBagConstraints();
			this.gridBagConstraintsEstadoRubro.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoRubro.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstadoRubro.add(this.jTextFieldValorCampoGeneralEstadoRubro, this.gridBagConstraintsEstadoRubro);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosEstadoRubro = new GridBagLayout();

			this.jScrollPanelDatosEstadoRubro.setLayout(gridaBagLayoutDatosEstadoRubro);
			
			this.gridBagConstraintsEstadoRubro = new GridBagConstraints();
			this.gridBagConstraintsEstadoRubro.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoRubro.gridy = 0;
			this.gridBagConstraintsEstadoRubro.gridx = 0;
			
			this.jScrollPanelDatosEstadoRubro.add(this.jTableDatosEstadoRubro, this.gridBagConstraintsEstadoRubro);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosEstadoRubro.setViewportView(this.jTableDatosEstadoRubro);
		this.jTableDatosEstadoRubro.setFillsViewportHeight(true);
		this.jTableDatosEstadoRubro.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesEstadoRubro= new GridBagLayout();
		this.jPanelAccionesEstadoRubro.setLayout(gridaBagLayoutAccionesEstadoRubro);
		
		
		/*	
		this.gridBagConstraintsEstadoRubro = new GridBagConstraints();
		this.gridBagConstraintsEstadoRubro.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoRubro.gridy = 0;
		this.gridBagConstraintsEstadoRubro.gridx = 0;
			
		this.jPanelAccionesEstadoRubro.add(this.jButtonNuevoEstadoRubro, this.gridBagConstraintsEstadoRubro);
		*/
		int iPosXAccion=0;
		
						
		
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutEstadoRubro = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutEstadoRubro);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.estadorubroSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsEstadoRubro = new GridBagConstraints();						
			this.gridBagConstraintsEstadoRubro.gridy = iGridyPrincipal++;
			this.gridBagConstraintsEstadoRubro.gridx = 0;		
			//this.gridBagConstraintsEstadoRubro.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoRubro.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsEstadoRubro.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarEstadoRubro, this.gridBagConstraintsEstadoRubro);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsEstadoRubro = new GridBagConstraints();
		this.gridBagConstraintsEstadoRubro.gridy = iGridyPrincipal++;
		this.gridBagConstraintsEstadoRubro.gridx = 0;		
		//this.gridBagConstraintsEstadoRubro.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoRubro.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsEstadoRubro.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsEstadoRubro);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsEstadoRubro = new GridBagConstraints();
		this.gridBagConstraintsEstadoRubro.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoRubro.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesEstadoRubro, this.gridBagConstraintsEstadoRubro);								
		
		
		/*
		this.gridBagConstraintsEstadoRubro = new GridBagConstraints();
		this.gridBagConstraintsEstadoRubro.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoRubro.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesEstadoRubro, this.gridBagConstraintsEstadoRubro);
		*/		
		
		this.gridBagConstraintsEstadoRubro = new GridBagConstraints();
		this.gridBagConstraintsEstadoRubro.gridy =iGridyPrincipal++;
		this.gridBagConstraintsEstadoRubro.gridx =0;
		this.gridBagConstraintsEstadoRubro.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsEstadoRubro.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosEstadoRubro, this.gridBagConstraintsEstadoRubro);
				
		
		this.gridBagConstraintsEstadoRubro = new GridBagConstraints();
		this.gridBagConstraintsEstadoRubro.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoRubro.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionEstadoRubro, this.gridBagConstraintsEstadoRubro);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(EstadoRubroJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosEstadoRubro= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosEstadoRubro = new GridBagLayout();
			this.jPanelBusquedasParametrosEstadoRubro.setLayout(gridaBagLayoutBusquedasParametrosEstadoRubro);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralEstadoRubro=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralEstadoRubro.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEstadoRubro.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEstadoRubro.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsEstadoRubro = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsEstadoRubro = new GridBagConstraints();
		this.gridBagConstraintsEstadoRubro.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoRubro.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposEstadoRubro, this.gridBagConstraintsEstadoRubro);
			
			
		this.gridBagConstraintsEstadoRubro = new GridBagConstraints();
		this.gridBagConstraintsEstadoRubro.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoRubro.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosEstadoRubro, this.gridBagConstraintsEstadoRubro);
		
			
		this.gridBagConstraintsEstadoRubro = new GridBagConstraints();
		this.gridBagConstraintsEstadoRubro.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsEstadoRubro.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesEstadoRubro, this.gridBagConstraintsEstadoRubro);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralEstadoRubro;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoEstadoRubro() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoEstadoRubro = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoEstadoRubro = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoEstadoRubro.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoEstadoRubro.setName("jPanelReporteDinamicoEstadoRubro"); 
		
		this.jPanelReporteDinamicoEstadoRubro.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoEstadoRubro.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoEstadoRubro.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoEstadoRubro.setLayout(gridaBagLayoutReporteDinamicoEstadoRubro);
		
		
		this.jInternalFrameReporteDinamicoEstadoRubro= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoEstadoRubro = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteEstadoRubro= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoEstadoRubro.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoEstadoRubro.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoEstadoRubro.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoEstadoRubro.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoEstadoRubro.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoEstadoRubro.setResizable(true);
	    this.jInternalFrameReporteDinamicoEstadoRubro.setClosable(true);
	    this.jInternalFrameReporteDinamicoEstadoRubro.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoEstadoRubro.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoEstadoRubro.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoEstadoRubro.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoEstadoRubro.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Rubros"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteEstadoRubro = new JLabelMe();

		this.jLabelColumnasSelectReporteEstadoRubro.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteEstadoRubro.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteEstadoRubro.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteEstadoRubro.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsEstadoRubro = new GridBagConstraints();
		this.gridBagConstraintsEstadoRubro.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoRubro.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoRubro.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoEstadoRubro.add(this.jLabelColumnasSelectReporteEstadoRubro, this.gridBagConstraintsEstadoRubro);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteEstadoRubro = new JList<Reporte>();
		this.jListColumnasSelectReporteEstadoRubro.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteEstadoRubro.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteEstadoRubro.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteEstadoRubro.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteEstadoRubro.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteEstadoRubro=new JScrollPane(this.jListColumnasSelectReporteEstadoRubro);
			
			this.jScrollColumnasSelectReporteEstadoRubro.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteEstadoRubro.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteEstadoRubro.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteEstadoRubro.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsEstadoRubro = new GridBagConstraints();
		this.gridBagConstraintsEstadoRubro.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoRubro.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoRubro.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoEstadoRubro.add(this.jListColumnasSelectReporteEstadoRubro, this.gridBagConstraintsEstadoRubro);
		this.jPanelReporteDinamicoEstadoRubro.add(this.jScrollColumnasSelectReporteEstadoRubro, this.gridBagConstraintsEstadoRubro);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteEstadoRubro = new JLabelMe();

		this.jLabelRelacionesSelectReporteEstadoRubro.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteEstadoRubro.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteEstadoRubro.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteEstadoRubro.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsEstadoRubro = new GridBagConstraints();
		this.gridBagConstraintsEstadoRubro.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoRubro.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoRubro.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoEstadoRubro.add(this.jLabelRelacionesSelectReporteEstadoRubro, this.gridBagConstraintsEstadoRubro);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteEstadoRubro = new JList<Reporte>();
		this.jListRelacionesSelectReporteEstadoRubro.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteEstadoRubro.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteEstadoRubro.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteEstadoRubro.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteEstadoRubro.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteEstadoRubro=new JScrollPane(this.jListRelacionesSelectReporteEstadoRubro);
			
			this.jScrollRelacionesSelectReporteEstadoRubro.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteEstadoRubro.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteEstadoRubro.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteEstadoRubro.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsEstadoRubro = new GridBagConstraints();
		this.gridBagConstraintsEstadoRubro.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoRubro.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoRubro.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoEstadoRubro.add(this.jListRelacionesSelectReporteEstadoRubro, this.gridBagConstraintsEstadoRubro);
		this.jPanelReporteDinamicoEstadoRubro.add(this.jScrollRelacionesSelectReporteEstadoRubro, this.gridBagConstraintsEstadoRubro);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoEstadoRubro = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoEstadoRubro = new JComboBoxMe();
		this.jListColumnasValoresGraficoEstadoRubro = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoEstadoRubro = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoEstadoRubro.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoEstadoRubro.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoEstadoRubro.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoEstadoRubro.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoEstadoRubro, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoEstadoRubro = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoEstadoRubro.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoEstadoRubro.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoEstadoRubro.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoEstadoRubro.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoEstadoRubro, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoEstadoRubro = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoEstadoRubro.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoEstadoRubro.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoEstadoRubro.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoEstadoRubro.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsEstadoRubro = new GridBagConstraints();
		this.gridBagConstraintsEstadoRubro.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoRubro.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoRubro.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEstadoRubro.add(this.jLabelGenerarExcelReporteDinamicoEstadoRubro, this.gridBagConstraintsEstadoRubro);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoEstadoRubro = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoEstadoRubro.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoEstadoRubro,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoEstadoRubro.setToolTipText("Generar EXCEL"+" "+EstadoRubroConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsEstadoRubro = new GridBagConstraints();
		//this.gridBagConstraintsEstadoRubro.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsEstadoRubro.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsEstadoRubro.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoEstadoRubro.add(this.jButtonGenerarExcelReporteDinamicoEstadoRubro, this.gridBagConstraintsEstadoRubro);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsEstadoRubro = new GridBagConstraints();
		this.gridBagConstraintsEstadoRubro.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoRubro.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEstadoRubro.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEstadoRubro.add(this.jComboBoxTiposReportesDinamicoEstadoRubro, this.gridBagConstraintsEstadoRubro);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoEstadoRubro = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoEstadoRubro.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoEstadoRubro.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoEstadoRubro.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoEstadoRubro.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsEstadoRubro = new GridBagConstraints();
		this.gridBagConstraintsEstadoRubro.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoRubro.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoRubro.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEstadoRubro.add(this.jLabelTiposArchivoReporteDinamicoEstadoRubro, this.gridBagConstraintsEstadoRubro);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsEstadoRubro = new GridBagConstraints();
		this.gridBagConstraintsEstadoRubro.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoRubro.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEstadoRubro.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEstadoRubro.add(this.jComboBoxTiposArchivosReportesDinamicoEstadoRubro, this.gridBagConstraintsEstadoRubro);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoEstadoRubro = new JButtonMe();
		this.jButtonGenerarReporteDinamicoEstadoRubro.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoEstadoRubro,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoEstadoRubro.setToolTipText("Generar"+" "+EstadoRubroConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsEstadoRubro = new GridBagConstraints();
		this.gridBagConstraintsEstadoRubro.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoRubro.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEstadoRubro.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEstadoRubro.add(this.jButtonGenerarReporteDinamicoEstadoRubro, this.gridBagConstraintsEstadoRubro);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoEstadoRubro = new JButtonMe();
		this.jButtonCerrarReporteDinamicoEstadoRubro.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoEstadoRubro,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoEstadoRubro.setToolTipText("Cancelar"+" "+EstadoRubroConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsEstadoRubro = new GridBagConstraints();
		this.gridBagConstraintsEstadoRubro.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoRubro.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEstadoRubro.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEstadoRubro.add(this.jButtonCerrarReporteDinamicoEstadoRubro, this.gridBagConstraintsEstadoRubro);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalEstadoRubro = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoEstadoRubro= new JScrollPane(jPanelReporteDinamicoEstadoRubro,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoEstadoRubro.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoEstadoRubro.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoEstadoRubro.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoEstadoRubro.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Rubros"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsEstadoRubro = new GridBagConstraints();
		this.gridBagConstraintsEstadoRubro.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsEstadoRubro.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsEstadoRubro.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoEstadoRubro.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoEstadoRubro.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalEstadoRubro);
		this.jInternalFrameReporteDinamicoEstadoRubro.getContentPane().add(this.jScrollPanelReporteDinamicoEstadoRubro, this.gridBagConstraintsEstadoRubro);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionEstadoRubro() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionEstadoRubro = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionEstadoRubro = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionEstadoRubro.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionEstadoRubro.setName("jPanelImportacionEstadoRubro"); 
		
		this.jPanelImportacionEstadoRubro.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionEstadoRubro.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionEstadoRubro.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionEstadoRubro.setLayout(gridaBagLayoutImportacionEstadoRubro);
		
		
		this.jInternalFrameImportacionEstadoRubro= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionEstadoRubro= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionEstadoRubro = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteEstadoRubro= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionEstadoRubro.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionEstadoRubro.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionEstadoRubro.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionEstadoRubro.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionEstadoRubro.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionEstadoRubro.setResizable(true);
	    this.jInternalFrameImportacionEstadoRubro.setClosable(true);
	    this.jInternalFrameImportacionEstadoRubro.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionEstadoRubro.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionEstadoRubro.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionEstadoRubro.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionEstadoRubro.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionEstadoRubro.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionEstadoRubro.setResizable(true);
	    this.jInternalFrameImportacionEstadoRubro.setClosable(true);
	    this.jInternalFrameImportacionEstadoRubro.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionEstadoRubro.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionEstadoRubro.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionEstadoRubro.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionEstadoRubro.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Rubros"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionEstadoRubro = new JLabelMe();

		this.jLabelArchivoImportacionEstadoRubro.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionEstadoRubro.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionEstadoRubro.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionEstadoRubro.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsEstadoRubro = new GridBagConstraints();
		this.gridBagConstraintsEstadoRubro.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoRubro.gridy = iPosYImportacion;		
		this.gridBagConstraintsEstadoRubro.gridx = iPosXImportacion++;
			
		this.jPanelImportacionEstadoRubro.add(this.jLabelArchivoImportacionEstadoRubro, this.gridBagConstraintsEstadoRubro);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionEstadoRubro = new JFileChooser();		
		this.jFileChooserImportacionEstadoRubro.setToolTipText("ESCOGER ARCHIVO"+" "+EstadoRubroConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionEstadoRubro = new JButtonMe();
		this.jButtonAbrirImportacionEstadoRubro.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionEstadoRubro,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionEstadoRubro.setToolTipText("Generar"+" "+EstadoRubroConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsEstadoRubro = new GridBagConstraints();
		this.gridBagConstraintsEstadoRubro.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoRubro.gridy = iPosYImportacion;
		this.gridBagConstraintsEstadoRubro.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEstadoRubro.add(this.jButtonAbrirImportacionEstadoRubro, this.gridBagConstraintsEstadoRubro);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionEstadoRubro = new JLabelMe();

		this.jLabelPathArchivoImportacionEstadoRubro.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionEstadoRubro.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionEstadoRubro.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionEstadoRubro.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsEstadoRubro = new GridBagConstraints();
		this.gridBagConstraintsEstadoRubro.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoRubro.gridy = iPosYImportacion;		
		this.gridBagConstraintsEstadoRubro.gridx = iPosXImportacion++;
			
		this.jPanelImportacionEstadoRubro.add(this.jLabelPathArchivoImportacionEstadoRubro, this.gridBagConstraintsEstadoRubro);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionEstadoRubro=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionEstadoRubro.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionEstadoRubro.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionEstadoRubro.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsEstadoRubro = new GridBagConstraints();
		this.gridBagConstraintsEstadoRubro.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoRubro.gridy = iPosYImportacion;
		this.gridBagConstraintsEstadoRubro.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEstadoRubro.add(this.jTextFieldPathArchivoImportacionEstadoRubro, this.gridBagConstraintsEstadoRubro);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionEstadoRubro = new JButtonMe();
		this.jButtonGenerarImportacionEstadoRubro.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionEstadoRubro,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionEstadoRubro.setToolTipText("Generar"+" "+EstadoRubroConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsEstadoRubro = new GridBagConstraints();
		this.gridBagConstraintsEstadoRubro.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoRubro.gridy = iPosYImportacion;
		this.gridBagConstraintsEstadoRubro.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEstadoRubro.add(this.jButtonGenerarImportacionEstadoRubro, this.gridBagConstraintsEstadoRubro);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionEstadoRubro = new JButtonMe();
		this.jButtonCerrarImportacionEstadoRubro.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionEstadoRubro,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionEstadoRubro.setToolTipText("Cancelar"+" "+EstadoRubroConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsEstadoRubro = new GridBagConstraints();
		this.gridBagConstraintsEstadoRubro.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoRubro.gridy = iPosYImportacion;
		this.gridBagConstraintsEstadoRubro.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEstadoRubro.add(this.jButtonCerrarImportacionEstadoRubro, this.gridBagConstraintsEstadoRubro);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalEstadoRubro = new GridBagLayout();
		
		this.jScrollPanelImportacionEstadoRubro= new JScrollPane(jPanelImportacionEstadoRubro,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsEstadoRubro = new GridBagConstraints();
		this.gridBagConstraintsEstadoRubro.gridy =iPosYImportacion;
		this.gridBagConstraintsEstadoRubro.gridx =iPosXImportacion;
		this.gridBagConstraintsEstadoRubro.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionEstadoRubro.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionEstadoRubro.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalEstadoRubro);
		this.jInternalFrameImportacionEstadoRubro.getContentPane().add(this.jScrollPanelImportacionEstadoRubro, this.gridBagConstraintsEstadoRubro);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByEstadoRubro(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByEstadoRubro = new JButtonMe();
			this.jButtonAbrirOrderByEstadoRubro.setText("Orden");
			this.jButtonAbrirOrderByEstadoRubro.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByEstadoRubro,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByEstadoRubro, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByEstadoRubro";
			inputMap = this.jButtonAbrirOrderByEstadoRubro.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByEstadoRubro.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByEstadoRubro"));
		
		
			GridBagLayout gridaBagLayoutOrderByEstadoRubro = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByEstadoRubro = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByEstadoRubro.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByEstadoRubro.setName("jPanelOrderByEstadoRubro"); 
			
			this.jPanelOrderByEstadoRubro.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByEstadoRubro.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByEstadoRubro.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByEstadoRubro, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByEstadoRubro.setLayout(gridaBagLayoutOrderByEstadoRubro);
			
			
			this.jTableDatosEstadoRubroOrderBy = new JTableMe();        
			this.jTableDatosEstadoRubroOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosEstadoRubroOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosEstadoRubroOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosEstadoRubroOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosEstadoRubroOrderBy.setViewportView(this.jTableDatosEstadoRubroOrderBy);
			this.jTableDatosEstadoRubroOrderBy.setFillsViewportHeight(true);
			this.jTableDatosEstadoRubroOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByEstadoRubro= new OrderByJInternalFrame();
			this.jInternalFrameOrderByEstadoRubro= new OrderByJInternalFrame();
			this.jScrollPanelOrderByEstadoRubro = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteEstadoRubro= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByEstadoRubro.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByEstadoRubro.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByEstadoRubro.setTitle("Orden");
			this.jInternalFrameOrderByEstadoRubro.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByEstadoRubro.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByEstadoRubro.setResizable(true);
			this.jInternalFrameOrderByEstadoRubro.setClosable(true);
			this.jInternalFrameOrderByEstadoRubro.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByEstadoRubro, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByEstadoRubro.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByEstadoRubro.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByEstadoRubro.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByEstadoRubro, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByEstadoRubro.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Rubros"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsEstadoRubro = new GridBagConstraints();
			this.gridBagConstraintsEstadoRubro.gridy =iPosYOrderBy++;
			this.gridBagConstraintsEstadoRubro.gridx =iPosXOrderBy;
			this.gridBagConstraintsEstadoRubro.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsEstadoRubro.ipady =150;
				
			this.jPanelOrderByEstadoRubro.add(jScrollPanelDatosEstadoRubroOrderBy, this.gridBagConstraintsEstadoRubro);//this.jTableDatosEstadoRubroTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByEstadoRubro = new JButtonMe();
			this.jButtonCerrarOrderByEstadoRubro.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByEstadoRubro,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByEstadoRubro.setToolTipText("Cancelar"+" "+EstadoRubroConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByEstadoRubro, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsEstadoRubro = new GridBagConstraints();
			this.gridBagConstraintsEstadoRubro.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoRubro.gridy = iPosYOrderBy++;
			this.gridBagConstraintsEstadoRubro.gridx = iPosXOrderBy;
									
			this.jPanelOrderByEstadoRubro.add(this.jButtonCerrarOrderByEstadoRubro, this.gridBagConstraintsEstadoRubro);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalEstadoRubro = new GridBagLayout();
			
			this.jScrollPanelOrderByEstadoRubro= new JScrollPane(jPanelOrderByEstadoRubro,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsEstadoRubro = new GridBagConstraints();
			this.gridBagConstraintsEstadoRubro.gridy =iPosYOrderBy;
			this.gridBagConstraintsEstadoRubro.gridx =iPosXOrderBy;
			this.gridBagConstraintsEstadoRubro.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByEstadoRubro.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByEstadoRubro.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalEstadoRubro);
			
			this.jInternalFrameOrderByEstadoRubro.getContentPane().add(this.jScrollPanelOrderByEstadoRubro, this.gridBagConstraintsEstadoRubro);			
		
		} else {
			this.jButtonAbrirOrderByEstadoRubro = new JButtonMe();
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
			iWidthTableCalculado+=300;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=100;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.estadorubroSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosEstadoRubro.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosEstadoRubro.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosEstadoRubro.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosEstadoRubro.getRowHeight();//EstadoRubroConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.estadorubroSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > EstadoRubroConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaEstadoRubro.isSelected()) {
					iHeightTable=EstadoRubroConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < EstadoRubroConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=EstadoRubroConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > EstadoRubroConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaEstadoRubro.isSelected()) {
					iHeightTable=EstadoRubroConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < EstadoRubroConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=EstadoRubroConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosEstadoRubro.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosEstadoRubro.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosEstadoRubro.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosEstadoRubro.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosEstadoRubro.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosEstadoRubro.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByEstadoRubro!=null && this.jInternalFrameOrderByEstadoRubro.getjTableDatosOrderBy()!=null) {
			//if(!this.estadorubroSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByEstadoRubro.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByEstadoRubro.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByEstadoRubro.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByEstadoRubro.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByEstadoRubro.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByEstadoRubro.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByEstadoRubro.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosEstadoRubro.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosEstadoRubro.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosEstadoRubro.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=estadorubroLogic.getEstadoRubros().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=estadorubros.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<EstadoRubro> TraerEstadoRubroBeans(List<EstadoRubro> estadorubros,ArrayList<Classe> classes)throws Exception {
		try {
			for(EstadoRubro estadorubro:estadorubros) {
					
				if(!(EstadoRubroConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || EstadoRubroConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					estadorubro.setsDetalleGeneralEntityReporte(EstadoRubroConstantesFunciones.getEstadoRubroDescripcion(estadorubro));
										
						
					
					

					if(estadorubro.getRubroEmpleados()!=null && Funciones.existeClass(classes,RubroEmpleado.class)) {
						try{estadorubro.setrubroempleadosDescripcionReporte(new JRBeanCollectionDataSource(RubroEmpleadoJInternalFrame.TraerRubroEmpleadoBeans(estadorubro.getRubroEmpleados(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//estadorubro.setsDetalleGeneralEntityReporte(estadorubro.getsDetalleGeneralEntityReporte());
										
				}
				
				//estadorubrobeans.add(estadorubrobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return estadorubros;
    }
	//PARA REPORTES FIN
}
