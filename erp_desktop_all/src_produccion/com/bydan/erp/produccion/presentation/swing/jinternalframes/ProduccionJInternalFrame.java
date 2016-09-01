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
package com.bydan.erp.produccion.presentation.swing.jinternalframes;



import com.bydan.erp.produccion.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.produccion.presentation.swing.jinternalframes.*;
import com.bydan.erp.produccion.presentation.swing.jinternalframes.auxiliar.*;





//import com.bydan.erp.produccion.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.produccion.business.entity.*;
import com.bydan.erp.produccion.util.ProduccionConstantesFunciones;

import com.bydan.erp.produccion.business.logic.*;
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
public class ProduccionJInternalFrame extends ProduccionBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarProduccion;
	
	protected JMenuBar jmenuBarProduccion;
	
	protected JMenu jmenuProduccion;
	protected JMenu jmenuDatosProduccion;
	protected JMenu jmenuArchivoProduccion;
	protected JMenu jmenuAccionesProduccion;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosProduccion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutProduccion;	
	protected GridBagConstraints gridBagConstraintsProduccion;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public ProduccionDetalleFormJInternalFrame jInternalFrameDetalleFormProduccion;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoProduccion;	
	protected ImportacionJInternalFrame jInternalFrameImportacionProduccion;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public ProduccionSessionBean produccionSessionBean;
		
	
	
	
	//protected JDesktopPane jDesktopPane;
	public List<Produccion> produccions;		
	public List<Produccion> produccionsEliminados;	
	public List<Produccion> produccionsAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByProduccion;		
	protected JButton jButtonAbrirOrderByProduccion;
	
	
	//protected JPanel jPanelOrderByProduccion;
	//public JScrollPane jScrollPanelOrderByProduccion;	
	//protected JButton jButtonCerrarOrderByProduccion;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public ProduccionLogic produccionLogic;
	
	
	
	public JScrollPane jScrollPanelDatosProduccion;
	public JScrollPane jScrollPanelDatosEdicionProduccion;
	public JScrollPane jScrollPanelDatosGeneralProduccion;
    
	
	
	//public JScrollPane jScrollPanelDatosProduccionOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoProduccion;
	//public JScrollPane jScrollPanelImportacionProduccion;
	
	
	
	protected JPanel jPanelAccionesProduccion;
	
    protected JPanel jPanelPaginacionProduccion;
    protected JPanel jPanelParametrosReportesProduccion;
	protected JPanel jPanelParametrosReportesAccionesProduccion;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1Produccion;
	protected JPanel jPanelParametrosAuxiliar2Produccion;
	protected JPanel jPanelParametrosAuxiliar3Produccion;
	protected JPanel jPanelParametrosAuxiliar4Produccion;
	//protected JPanel jPanelParametrosAuxiliar5Produccion;
	
	
	
	//protected JPanel jPanelReporteDinamicoProduccion;
	//protected JPanel jPanelImportacionProduccion;
	
	
	public JTable jTableDatosProduccion;
	
	
	
	//public JTable jTableDatosProduccionOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoProduccion;
	protected JButton jButtonDuplicarProduccion;
	protected JButton jButtonCopiarProduccion;
	protected JButton jButtonVerFormProduccion;
	protected JButton jButtonNuevoRelacionesProduccion;
	protected JButton jButtonModificarProduccion;
	
    protected JButton jButtonGuardarCambiosTablaProduccion;
	protected JButton jButtonCerrarProduccion;
	
	
	protected JButton jButtonRecargarInformacionProduccion;
	protected JButton jButtonProcesarInformacionProduccion;
	
	
	protected JButton jButtonAnterioresProduccion;
	protected JButton jButtonSiguientesProduccion;
	protected JButton jButtonNuevoGuardarCambiosProduccion;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoProduccion;
	//protected JButton jButtonCerrarReporteDinamicoProduccion;
	//protected JButton jButtonGenerarExcelReporteDinamicoProduccion;	
	
	
	
	//protected JButton jButtonAbrirImportacionProduccion;
	//protected JButton jButtonGenerarImportacionProduccion;
	//protected JButton jButtonCerrarImportacionProduccion;
	//protected JFileChooser jFileChooserImportacionProduccion;
	//protected File fileImportacionProduccion;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarProduccion;
	protected JButton jButtonDuplicarToolBarProduccion;
	protected JButton jButtonNuevoRelacionesToolBarProduccion;
	
	
	public JButton jButtonGuardarCambiosToolBarProduccion;
	protected JButton jButtonCopiarToolBarProduccion;
	protected JButton jButtonVerFormToolBarProduccion;
	public JButton jButtonGuardarCambiosTablaToolBarProduccion;
	protected JButton jButtonMostrarOcultarTablaToolBarProduccion;
	protected JButton jButtonCerrarToolBarProduccion;
	
	protected JButton jButtonRecargarInformacionToolBarProduccion;
	protected JButton jButtonProcesarInformacionToolBarProduccion;
	protected JButton jButtonAnterioresToolBarProduccion;
	protected JButton jButtonSiguientesToolBarProduccion;
	protected JButton jButtonNuevoGuardarCambiosToolBarProduccion;
	protected JButton jButtonAbrirOrderByToolBarProduccion;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoProduccion;
	protected JMenuItem jMenuItemDuplicarProduccion;
	protected JMenuItem jMenuItemNuevoRelacionesProduccion;
	
	
	protected JMenuItem jMenuItemGuardarCambiosProduccion;
	protected JMenuItem jMenuItemCopiarProduccion;
	protected JMenuItem jMenuItemVerFormProduccion;
	protected JMenuItem jMenuItemGuardarCambiosTablaProduccion;
	protected JMenuItem jMenuItemCerrarProduccion;
	protected JMenuItem jMenuItemDetalleCerrarProduccion;
	protected JMenuItem jMenuItemDetalleAbrirOrderByProduccion;
	protected JMenuItem jMenuItemDetalleMostarOcultarProduccion;
	
	protected JMenuItem jMenuItemRecargarInformacionProduccion;
	protected JMenuItem jMenuItemProcesarInformacionProduccion;
	protected JMenuItem jMenuItemAnterioresProduccion;
	protected JMenuItem jMenuItemSiguientesProduccion;
	protected JMenuItem jMenuItemNuevoGuardarCambiosProduccion;
	protected JMenuItem jMenuItemAbrirOrderByProduccion;
	protected JMenuItem jMenuItemMostrarOcultarProduccion;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesProduccion;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosProduccion;
	protected JCheckBox jCheckBoxSeleccionadosProduccion;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaProduccion;
	protected JCheckBox jCheckBoxConGraficoReporteProduccion;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesProduccion;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesProduccion;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoProduccion;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoProduccion;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesProduccion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionProduccion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesProduccion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesProduccion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarProduccion;
	protected JTextField jTextFieldValorCampoGeneralProduccion;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteProduccion;
	//public JList<Reporte> jListColumnasSelectReporteProduccion;
	//public JScrollPane jScrollColumnasSelectReporteProduccion;
	
	//public JLabel jLabelRelacionesSelectReporteProduccion;
	//public JList<Reporte> jListRelacionesSelectReporteProduccion;
	//public JScrollPane jScrollRelacionesSelectReporteProduccion;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoProduccion;
	//protected JCheckBox jCheckBoxConGraficoDinamicoProduccion;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoProduccion;
	//public JLabel jLabelTiposArchivoReporteDinamicoProduccion;
	
		
	//public JLabel jLabelArchivoImportacionProduccion;	
	//public JLabel jLabelPathArchivoImportacionProduccion;
	//protected JTextField jTextFieldPathArchivoImportacionProduccion;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoProduccion;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoProduccion;
	
	//public JLabel jLabelColumnaCategoriaValorProduccion;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorProduccion;
	
	//public JLabel jLabelColumnasValoresGraficoProduccion;
	//public JList<Reporte> jListColumnasValoresGraficoProduccion;
	//public JScrollPane jScrollColumnasValoresGraficoProduccion;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoProduccion;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoProduccion;	
	
	
	
	
	
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
	public ProduccionJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("Produccion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProduccionJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Produccion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProduccionJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Produccion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProduccionJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Produccion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionProduccion)	{
		this.jButtonRecargarInformacionProduccion = jButtonRecargarInformacionProduccion;
	}
	
	public JButton getjButtonProcesarInformacionProduccion() {
		return this.jButtonProcesarInformacionProduccion;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionProduccion)	{
		this.jButtonProcesarInformacionProduccion = jButtonProcesarInformacionProduccion;
	}
	
	
	public JButton getjButtonRecargarInformacionProduccion() {
		return this.jButtonRecargarInformacionProduccion;
	}
	
	
	public List<Produccion> getproduccions() {
		return this.produccions;
	}

	public void setproduccions(List<Produccion> produccions) {
		this.produccions = produccions;
	}
	
	public List<Produccion> getproduccionsAux() {
		return this.produccionsAux;
	}

	public void setproduccionsAux(List<Produccion> produccionsAux) {
		this.produccionsAux = produccionsAux;
	}
	
	public List<Produccion> getproduccionsEliminados() {
		return this.produccionsEliminados;
	}

	public void setProduccionsEliminados(List<Produccion> produccionsEliminados) {
		this.produccionsEliminados = produccionsEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarProduccion() {
		return jComboBoxTiposSeleccionarProduccion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarProduccion(
			JComboBox jComboBoxTiposSeleccionarProduccion) {
		this.jComboBoxTiposSeleccionarProduccion = jComboBoxTiposSeleccionarProduccion;
	}
	
	public void setBorderResaltarTiposSeleccionarProduccion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarProduccion.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarProduccion .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralProduccion() {
		return jTextFieldValorCampoGeneralProduccion;
	}

	public void setjTextFieldValorCampoGeneralProduccion(
			JTextField jTextFieldValorCampoGeneralProduccion) {
		this.jTextFieldValorCampoGeneralProduccion = jTextFieldValorCampoGeneralProduccion;
	}

	public void setBorderResaltarValorCampoGeneralProduccion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProduccion.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralProduccion .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosProduccion() {
		return this.jCheckBoxSeleccionarTodosProduccion;
	}

	public void setjCheckBoxSeleccionarTodosProduccion(
			JCheckBox jCheckBoxSeleccionarTodosProduccion) {
		this.jCheckBoxSeleccionarTodosProduccion = jCheckBoxSeleccionarTodosProduccion;
	}

	public void setBorderResaltarSeleccionarTodosProduccion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProduccion.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosProduccion .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosProduccion() {
		return this.jCheckBoxSeleccionadosProduccion;
	}

	public void setjCheckBoxSeleccionadosProduccion(
			JCheckBox jCheckBoxSeleccionadosProduccion) {
		this.jCheckBoxSeleccionadosProduccion = jCheckBoxSeleccionadosProduccion;
	}
	
	public void setBorderResaltarSeleccionadosProduccion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProduccion.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosProduccion .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesProduccion() {
		return this.jComboBoxTiposArchivosReportesProduccion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesProduccion(
			JComboBox jComboBoxTiposArchivosReportesProduccion) {
		this.jComboBoxTiposArchivosReportesProduccion = jComboBoxTiposArchivosReportesProduccion;
	}

	public void setBorderResaltarTiposArchivosReportesProduccion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProduccion.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesProduccion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesProduccion() {
		return this.jComboBoxTiposReportesProduccion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesProduccion(
			JComboBox jComboBoxTiposReportesProduccion) {
		this.jComboBoxTiposReportesProduccion = jComboBoxTiposReportesProduccion;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoProduccion() {
	//	return jComboBoxTiposReportesDinamicoProduccion;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoProduccion(
	//		JComboBox jComboBoxTiposReportesDinamicoProduccion) {
	//	this.jComboBoxTiposReportesDinamicoProduccion = jComboBoxTiposReportesDinamicoProduccion;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoProduccion() {
	//	return jComboBoxTiposArchivosReportesDinamicoProduccion;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoProduccion(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoProduccion) {
	//	this.jComboBoxTiposArchivosReportesDinamicoProduccion = jComboBoxTiposArchivosReportesDinamicoProduccion;
	//}
	
	public void setBorderResaltarTiposReportesProduccion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProduccion.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesProduccion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesProduccion() {
		return this.jComboBoxTiposGraficosReportesProduccion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesProduccion(
			JComboBox jComboBoxTiposGraficosReportesProduccion) {
		this.jComboBoxTiposGraficosReportesProduccion = jComboBoxTiposGraficosReportesProduccion;
	}
	
	public void setBorderResaltarTiposGraficosReportesProduccion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProduccion.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesProduccion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionProduccion() {
		return this.jComboBoxTiposPaginacionProduccion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionProduccion(
			JComboBox jComboBoxTiposPaginacionProduccion) {
		this.jComboBoxTiposPaginacionProduccion = jComboBoxTiposPaginacionProduccion;
	}
	
	public void setBorderResaltarTiposPaginacionProduccion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProduccion.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionProduccion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesProduccion() {
		return this.jComboBoxTiposRelacionesProduccion;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesProduccion() {
		return this.jComboBoxTiposAccionesProduccion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesProduccion(
			JComboBox jComboBoxTiposRelacionesProduccion) {
		this.jComboBoxTiposRelacionesProduccion = jComboBoxTiposRelacionesProduccion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesProduccion(
			JComboBox jComboBoxTiposAccionesProduccion) {
		this.jComboBoxTiposAccionesProduccion = jComboBoxTiposAccionesProduccion;
	}
	
	public void setBorderResaltarTiposRelacionesProduccion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProduccion.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesProduccion .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesProduccion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProduccion.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesProduccion .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoProduccion() {
	//	return jCheckBoxConGraficoDinamicoProduccion;
	//}

	//public void setjCheckBoxConGraficoDinamicoProduccion(
	//		JCheckBox jCheckBoxConGraficoDinamicoProduccion) {
	//	this.jCheckBoxConGraficoDinamicoProduccion = jCheckBoxConGraficoDinamicoProduccion;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoProduccion() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarProduccion.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoProduccion .setBorder(borderResaltar);		
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
		this.produccionSessionBean=new ProduccionSessionBean();
		
		this.produccionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.produccionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.produccionSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=ProduccionJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=ProduccionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ProduccionJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ProduccionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ProduccionJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Produccion MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 650) {
			iHeight=650;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.produccionSessionBean.getEsGuardarRelacionado()) {
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
		
		ProduccionJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("Produccion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarProduccion= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarProduccion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarProduccion,this.jTtoolBarProduccion,
							"nuevo","nuevo","Nuevo"+" "+ProduccionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarProduccion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarProduccion,this.jTtoolBarProduccion,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarProduccion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarProduccion,this.jTtoolBarProduccion,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+ProduccionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarProduccion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarProduccion,this.jTtoolBarProduccion,
							"duplicar","duplicar","Duplicar"+" "+ProduccionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarProduccion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarProduccion,this.jTtoolBarProduccion,
							"copiar","copiar","Copiar"+" "+ProduccionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarProduccion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarProduccion,this.jTtoolBarProduccion,
							"ver_form","ver_form","Ver"+" "+ProduccionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarProduccion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProduccion,this.jTtoolBarProduccion,
							"recargar","recargar","Recargar"+" "+ProduccionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarProduccion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProduccion,this.jTtoolBarProduccion,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarProduccion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProduccion,this.jTtoolBarProduccion,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarProduccion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarProduccion,this.jTtoolBarProduccion,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarProduccion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarProduccion,this.jTtoolBarProduccion,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarProduccion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarProduccion,this.jTtoolBarProduccion,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+ProduccionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarProduccion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarProduccion,this.jTtoolBarProduccion,
							"cerrar","cerrar","Salir"+" "+ProduccionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarProduccion=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarProduccion;
			
				this.jButtonProcesarInformacionToolBarProduccion=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarProduccion;
				
		//protected JButton jButtonModificarToolBarProduccion;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarProduccion=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuProduccion=new JMenuMe("General");
		this.jmenuArchivoProduccion=new JMenuMe("Archivo");
		this.jmenuAccionesProduccion=new JMenuMe("Acciones");
		this.jmenuDatosProduccion=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoProduccion= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoProduccion.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoProduccion,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoProduccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarProduccion= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarProduccion.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarProduccion,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarProduccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesProduccion= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesProduccion.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesProduccion,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesProduccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosProduccion= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosProduccion.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosProduccion,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosProduccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarProduccion= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarProduccion.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarProduccion,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarProduccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormProduccion= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormProduccion.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormProduccion,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormProduccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaProduccion= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaProduccion.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaProduccion,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaProduccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarProduccion= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarProduccion.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarProduccion,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarProduccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionProduccion= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionProduccion.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionProduccion,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionProduccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionProduccion= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionProduccion.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionProduccion,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresProduccion= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresProduccion.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresProduccion,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresProduccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesProduccion= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesProduccion.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesProduccion,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesProduccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByProduccion= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByProduccion.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByProduccion,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByProduccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarProduccion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarProduccion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarProduccion,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarProduccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByProduccion= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByProduccion.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByProduccion,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByProduccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarProduccion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarProduccion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarProduccion,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarProduccion, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosProduccion= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosProduccion.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosProduccion,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosProduccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoProduccion.add(this.jMenuItemCerrarProduccion);
			
			this.jmenuAccionesProduccion.add(this.jMenuItemNuevoProduccion);
			this.jmenuAccionesProduccion.add(this.jMenuItemNuevoGuardarCambiosProduccion);
			this.jmenuAccionesProduccion.add(this.jMenuItemNuevoRelacionesProduccion);
			this.jmenuAccionesProduccion.add(this.jMenuItemGuardarCambiosTablaProduccion);		
			this.jmenuAccionesProduccion.add(this.jMenuItemDuplicarProduccion);		
			this.jmenuAccionesProduccion.add(this.jMenuItemCopiarProduccion);		
			this.jmenuAccionesProduccion.add(this.jMenuItemVerFormProduccion);		
			
			this.jmenuDatosProduccion.add(this.jMenuItemRecargarInformacionProduccion);				
			this.jmenuDatosProduccion.add(this.jMenuItemAnterioresProduccion);				
			this.jmenuDatosProduccion.add(this.jMenuItemSiguientesProduccion);				
			this.jmenuDatosProduccion.add(this.jMenuItemAbrirOrderByProduccion);				
			this.jmenuDatosProduccion.add(this.jMenuItemMostrarOcultarProduccion);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesProduccion.add(this.jMenuItemGuardarCambiosProduccion);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoProduccion, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesProduccion, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosProduccion, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarProduccion.add(this.jmenuArchivoProduccion);		
			this.jmenuBarProduccion.add(this.jmenuAccionesProduccion);		
			this.jmenuBarProduccion.add(this.jmenuDatosProduccion);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarProduccion);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasProduccion() {
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
			//this.jInternalFrameDetalleProduccion = new ProduccionDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Produccion DATOS");
			this.jInternalFrameDetalleFormProduccion = new ProduccionDetalleFormJInternalFrame(jDesktopPane,this.produccionSessionBean.getConGuardarRelaciones(),this.produccionSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormProduccion = null;//new ProduccionDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutProduccion= new GridBagLayout();
		
		
		this.jTableDatosProduccion = new JTableMe();      
		
		String sToolTipProduccion="";
		sToolTipProduccion=ProduccionConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipProduccion+="(Produccion.Produccion)";
		}
		
		if(!this.produccionSessionBean.getEsGuardarRelacionado()) {
			sToolTipProduccion+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosProduccion.setToolTipText(sToolTipProduccion);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosProduccion);
		this.jTableDatosProduccion.setAutoCreateRowSorter(true);
		this.jTableDatosProduccion.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosProduccion.setRowSelectionAllowed(true);
		this.jTableDatosProduccion.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosProduccion,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoProduccion = new JButtonMe();
		this.jButtonDuplicarProduccion = new JButtonMe();
		this.jButtonCopiarProduccion = new JButtonMe();
		this.jButtonVerFormProduccion = new JButtonMe();
		this.jButtonNuevoRelacionesProduccion = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaProduccion = new JButtonMe();
		this.jButtonCerrarProduccion = new JButtonMe();
		
		this.jScrollPanelDatosProduccion = new JScrollPane();   
        this.jScrollPanelDatosGeneralProduccion = new JScrollPane();
		
				
		
		
		this.jPanelAccionesProduccion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Produccion";
		
		if(!this.produccionSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosProduccion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Producciones" + this.sPath));
		} else {
			this.jScrollPanelDatosProduccion.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralProduccion.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesProduccion.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesProduccion.setToolTipText("Acciones");
        this.jPanelAccionesProduccion.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralProduccion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosProduccion, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoProduccion=new ReporteDinamicoJInternalFrame(ProduccionConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoProduccion();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionProduccion=new ImportacionJInternalFrame(ProduccionConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionProduccion();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByProduccion = new JButtonMe();
		
		this.jButtonAbrirOrderByProduccion.setText("Orden");
		this.jButtonAbrirOrderByProduccion.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByProduccion,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByProduccion, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByProduccion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByProduccion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByProduccion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProduccion,false,this);
			
			//this.cargarOrderByProduccion(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByProduccion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProduccion,true,this);
			
			//this.cargarOrderByProduccion(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosProduccion.setMinimumSize(new Dimension(400,50));//330
		this.jTableDatosProduccion.setMaximumSize(new Dimension(400,50));//330
		this.jTableDatosProduccion.setPreferredSize(new Dimension(400,50));//330
		
		this.jScrollPanelDatosProduccion.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosProduccion.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosProduccion.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoProduccion.setText("Nuevo");
		this.jButtonDuplicarProduccion.setText("Duplicar");
		this.jButtonCopiarProduccion.setText("Copiar");
		this.jButtonVerFormProduccion.setText("Ver");
		this.jButtonNuevoRelacionesProduccion.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaProduccion.setText("Guardar");
		this.jButtonCerrarProduccion.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoProduccion,"nuevo_button","Nuevo",this.produccionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarProduccion,"duplicar_button","Duplicar",this.produccionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarProduccion,"copiar_button","Copiar",this.produccionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormProduccion,"ver_form","Ver",this.produccionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesProduccion,"nuevorelaciones_button","Nuevo Rel",this.produccionSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaProduccion,"guardarcambiostabla_button","Guardar",this.produccionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarProduccion,"cerrar_button","Salir",this.produccionSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoProduccion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarProduccion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarProduccion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormProduccion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesProduccion, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaProduccion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarProduccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoProduccion.setToolTipText("Nuevo"+" "+ProduccionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarProduccion.setToolTipText("Duplicar"+" "+ProduccionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarProduccion.setToolTipText("Copiar"+" "+ProduccionConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormProduccion.setToolTipText("Ver"+" "+ProduccionConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesProduccion.setToolTipText("Nuevo Rel"+" "+ProduccionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaProduccion.setToolTipText("Guardar"+" "+ProduccionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarProduccion.setToolTipText("Salir"+" "+ProduccionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoProduccion";
		inputMap = this.jButtonNuevoProduccion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoProduccion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoProduccion"));
		
		//DUPLICAR
		sMapKey = "DuplicarProduccion";
		inputMap = this.jButtonDuplicarProduccion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarProduccion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarProduccion"));
		
		//COPIAR
		sMapKey = "CopiarProduccion";
		inputMap = this.jButtonCopiarProduccion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarProduccion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarProduccion"));
		
		//VEr FORM
		sMapKey = "VerFormProduccion";
		inputMap = this.jButtonVerFormProduccion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormProduccion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormProduccion"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesProduccion";
		inputMap = this.jButtonNuevoRelacionesProduccion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesProduccion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesProduccion"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarProduccion";
		inputMap = this.jButtonModificarProduccion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarProduccion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarProduccion"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarProduccion";
		inputMap = this.jButtonCerrarProduccion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarProduccion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarProduccion"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaProduccion";
		inputMap = this.jButtonGuardarCambiosTablaProduccion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaProduccion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaProduccion"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesProduccion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesProduccion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionProduccion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1Produccion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2Produccion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3Produccion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4Produccion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5Produccion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesProduccion.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesProduccion.setName("jPanelParametrosReportesProduccion"); 
		
		this.jPanelParametrosReportesAccionesProduccion.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesProduccion.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesProduccion.setName("jPanelParametrosReportesAccionesProduccion"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesProduccion, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesProduccion, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionProduccion = new JButtonMe();
		this.jButtonRecargarInformacionProduccion.setText("Recargar");
		this.jButtonRecargarInformacionProduccion.setToolTipText("Recargar"+" "+ProduccionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionProduccion,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionProduccion = new JButtonMe();
		this.jButtonProcesarInformacionProduccion.setText("Procesar");
		this.jButtonProcesarInformacionProduccion.setToolTipText("Procesar"+" "+ProduccionConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionProduccion.setVisible(false);
			
		this.jButtonProcesarInformacionProduccion.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionProduccion.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionProduccion.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesProduccion = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProduccion.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesProduccion.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesProduccion = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProduccion.setText("TIPO");       
		this.jComboBoxTiposReportesProduccion.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesProduccion = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProduccion.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesProduccion.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionProduccion = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionProduccion.setText("Paginacion");
		this.jComboBoxTiposPaginacionProduccion.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesProduccion = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesProduccion.setText("Accion");
		this.jComboBoxTiposRelacionesProduccion.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesProduccion = new JComboBoxMe();
		//this.jComboBoxTiposAccionesProduccion.setText("Accion");
		this.jComboBoxTiposAccionesProduccion.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarProduccion = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarProduccion.setText("Accion");
		this.jComboBoxTiposSeleccionarProduccion.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralProduccion=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralProduccion.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralProduccion.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralProduccion.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesProduccion = new JLabelMe();
		
		this.jLabelAccionesProduccion.setText("Acciones");		
		this.jLabelAccionesProduccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProduccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProduccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosProduccion = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosProduccion.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosProduccion.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosProduccion = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosProduccion.setText("Seleccionados");
		this.jCheckBoxSeleccionadosProduccion.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaProduccion = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaProduccion.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaProduccion.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteProduccion = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteProduccion.setText("Graf.");
		this.jCheckBoxConGraficoReporteProduccion.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresProduccion = new JButtonMe();
		//this.jButtonAnterioresProduccion.setText("<<");
        this.jButtonAnterioresProduccion.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresProduccion,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresProduccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesProduccion = new JButtonMe();
		//this.jButtonSiguientesProduccion.setText(">>");
        this.jButtonSiguientesProduccion.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesProduccion,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesProduccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosProduccion = new JButtonMe();
		this.jButtonNuevoGuardarCambiosProduccion.setText("Nue");
        this.jButtonNuevoGuardarCambiosProduccion.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosProduccion,"nuevoguardarcambios_button","Nue",this.produccionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosProduccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosProduccion";
		inputMap = this.jButtonNuevoGuardarCambiosProduccion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosProduccion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosProduccion"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionProduccion";
		inputMap = this.jButtonRecargarInformacionProduccion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionProduccion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionProduccion"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesProduccion";
		inputMap = this.jButtonSiguientesProduccion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesProduccion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesProduccion"));
		
		//ANTERIORES		
		sMapKey = "AnterioresProduccion";
		inputMap = this.jButtonAnterioresProduccion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresProduccion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresProduccion"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasProduccion();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesProduccion.setMinimumSize(new Dimension(this.getWidth(),ProduccionBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProduccionBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesProduccion.setMaximumSize(new Dimension(this.getWidth(),ProduccionBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProduccionBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesProduccion.setPreferredSize(new Dimension(this.getWidth(),ProduccionBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProduccionBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionProduccion = new GridBagLayout();

			this.jPanelPaginacionProduccion.setLayout(gridaBagLayoutPaginacionProduccion);						
			
			this.gridBagConstraintsProduccion = new GridBagConstraints();
			this.gridBagConstraintsProduccion.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsProduccion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProduccion.gridy = 0;
			this.gridBagConstraintsProduccion.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionProduccion.add(this.jButtonAnterioresProduccion, this.gridBagConstraintsProduccion);
					
						
			this.gridBagConstraintsProduccion = new GridBagConstraints();
			this.gridBagConstraintsProduccion.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsProduccion.gridy = 0;
			
			this.jPanelPaginacionProduccion.add(this.jButtonNuevoGuardarCambiosProduccion, this.gridBagConstraintsProduccion);
						
			
			this.gridBagConstraintsProduccion = new GridBagConstraints();
			this.gridBagConstraintsProduccion.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsProduccion.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsProduccion.gridy = 0;
			this.jPanelPaginacionProduccion.add(this.jButtonSiguientesProduccion, this.gridBagConstraintsProduccion);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsProduccion = new GridBagConstraints();
			this.gridBagConstraintsProduccion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProduccion.gridy = 1;
			this.gridBagConstraintsProduccion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProduccion.add(this.jButtonNuevoProduccion, this.gridBagConstraintsProduccion);
						
			
			
			if(!this.produccionSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsProduccion = new GridBagConstraints();
				this.gridBagConstraintsProduccion.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsProduccion.gridy = 1;
				this.gridBagConstraintsProduccion.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionProduccion.add(this.jButtonGuardarCambiosTablaProduccion, this.gridBagConstraintsProduccion);
			}
			
			
			
			this.gridBagConstraintsProduccion = new GridBagConstraints();
			this.gridBagConstraintsProduccion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProduccion.gridy = 1;
			this.gridBagConstraintsProduccion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProduccion.add(this.jButtonDuplicarProduccion, this.gridBagConstraintsProduccion);
			
			this.gridBagConstraintsProduccion = new GridBagConstraints();
			this.gridBagConstraintsProduccion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProduccion.gridy = 1;
			this.gridBagConstraintsProduccion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProduccion.add(this.jButtonCopiarProduccion, this.gridBagConstraintsProduccion);
		
			this.gridBagConstraintsProduccion = new GridBagConstraints();
			this.gridBagConstraintsProduccion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProduccion.gridy = 1;
			this.gridBagConstraintsProduccion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProduccion.add(this.jButtonVerFormProduccion, this.gridBagConstraintsProduccion);
		
			this.gridBagConstraintsProduccion = new GridBagConstraints();
			this.gridBagConstraintsProduccion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProduccion.gridy = 1;
			this.gridBagConstraintsProduccion.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionProduccion.add(this.jButtonCerrarProduccion, this.gridBagConstraintsProduccion);
		
		
		
		this.jButtonRecargarInformacionProduccion.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionProduccion.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionProduccion.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionProduccion, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesProduccion.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesProduccion.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesProduccion.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesProduccion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesProduccion.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesProduccion.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesProduccion.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesProduccion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesProduccion.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesProduccion.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesProduccion.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesProduccion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionProduccion.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionProduccion.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionProduccion.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionProduccion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesProduccion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesProduccion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesProduccion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesProduccion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesProduccion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProduccion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProduccion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesProduccion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarProduccion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarProduccion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarProduccion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarProduccion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaProduccion.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaProduccion.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaProduccion.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaProduccion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteProduccion.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteProduccion.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteProduccion.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteProduccion, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosProduccion.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosProduccion.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosProduccion.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosProduccion, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosProduccion.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosProduccion.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosProduccion.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosProduccion, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesProduccion = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesProduccion = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1Produccion = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2Produccion = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3Produccion = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4Produccion = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesProduccion.setLayout(gridaBagParametrosReportesProduccion);
			this.jPanelParametrosReportesAccionesProduccion.setLayout(gridaBagParametrosReportesAccionesProduccion);
			
			
			this.jPanelParametrosAuxiliar1Produccion.setLayout(gridaBagParametrosAuxiliar1Produccion);
			this.jPanelParametrosAuxiliar2Produccion.setLayout(gridaBagParametrosAuxiliar2Produccion);
			this.jPanelParametrosAuxiliar3Produccion.setLayout(gridaBagParametrosAuxiliar3Produccion);
			this.jPanelParametrosAuxiliar4Produccion.setLayout(gridaBagParametrosAuxiliar4Produccion);
			//this.jPanelParametrosAuxiliar5Produccion.setLayout(gridaBagParametrosAuxiliar2Produccion);			
			
			
			
			
			this.gridBagConstraintsProduccion = new GridBagConstraints();
			this.gridBagConstraintsProduccion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProduccion.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProduccion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProduccion.add(this.jButtonRecargarInformacionProduccion, this.gridBagConstraintsProduccion);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsProduccion = new GridBagConstraints();
			this.gridBagConstraintsProduccion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProduccion.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProduccion.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Produccion.add(this.jComboBoxTiposPaginacionProduccion, this.gridBagConstraintsProduccion);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsProduccion = new GridBagConstraints();
			this.gridBagConstraintsProduccion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProduccion.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProduccion.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Produccion.add(this.jCheckBoxConAltoMaximoTablaProduccion, this.gridBagConstraintsProduccion);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsProduccion = new GridBagConstraints();
			this.gridBagConstraintsProduccion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProduccion.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProduccion.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Produccion.add(this.jComboBoxTiposArchivosReportesProduccion, this.gridBagConstraintsProduccion);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsProduccion = new GridBagConstraints();
			this.gridBagConstraintsProduccion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProduccion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProduccion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProduccion.add(this.jPanelParametrosAuxiliar1Produccion, this.gridBagConstraintsProduccion);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsProduccion = new GridBagConstraints();
			this.gridBagConstraintsProduccion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProduccion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProduccion.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProduccion.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4Produccion.add(this.jComboBoxTiposReportesProduccion, this.gridBagConstraintsProduccion);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsProduccion = new GridBagConstraints();
			this.gridBagConstraintsProduccion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProduccion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProduccion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProduccion.add(this.jPanelParametrosAuxiliar4Produccion, this.gridBagConstraintsProduccion);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsProduccion = new GridBagConstraints();
			this.gridBagConstraintsProduccion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProduccion.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsProduccion.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProduccion.add(this.jComboBoxTiposReportesProduccion, this.gridBagConstraintsProduccion);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsProduccion = new GridBagConstraints();
			this.gridBagConstraintsProduccion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProduccion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProduccion.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProduccion.add(this.jCheckBoxGenerarReporteProduccion, this.gridBagConstraintsProduccion);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsProduccion = new GridBagConstraints();
			this.gridBagConstraintsProduccion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProduccion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProduccion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProduccion.add(this.jPanelParametrosAuxiliar2Produccion, this.gridBagConstraintsProduccion);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsProduccion = new GridBagConstraints();
			this.gridBagConstraintsProduccion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProduccion.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProduccion.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProduccion.add(this.jLabelAccionesProduccion, this.gridBagConstraintsProduccion);
			*/
			
			//DEJA UN ESPACIO CUANDO ES MODULO, UNO A UNO FK O PROCESO
			 iGridxParametrosReportes++;
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsProduccion = new GridBagConstraints();
			this.gridBagConstraintsProduccion.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsProduccion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProduccion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProduccion.add(this.jComboBoxTiposSeleccionarProduccion, this.gridBagConstraintsProduccion);			
			
			
			/*
			this.gridBagConstraintsProduccion = new GridBagConstraints();
			this.gridBagConstraintsProduccion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProduccion.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProduccion.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProduccion.add(this.jCheckBoxSeleccionarTodosProduccion, this.gridBagConstraintsProduccion);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsProduccion = new GridBagConstraints();
			this.gridBagConstraintsProduccion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProduccion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProduccion.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProduccion.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Produccion.add(this.jCheckBoxSeleccionarTodosProduccion, this.gridBagConstraintsProduccion);															
				
			this.gridBagConstraintsProduccion = new GridBagConstraints();
			this.gridBagConstraintsProduccion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProduccion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProduccion.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProduccion.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Produccion.add(this.jCheckBoxSeleccionadosProduccion, this.gridBagConstraintsProduccion);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsProduccion = new GridBagConstraints();
			this.gridBagConstraintsProduccion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProduccion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProduccion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProduccion.add(this.jPanelParametrosAuxiliar3Produccion, this.gridBagConstraintsProduccion);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsProduccion = new GridBagConstraints();
			this.gridBagConstraintsProduccion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProduccion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProduccion.add(this.jComboBoxTiposAccionesProduccion, this.gridBagConstraintsProduccion);
	
				
			this.gridBagConstraintsProduccion = new GridBagConstraints();
			this.gridBagConstraintsProduccion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProduccion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProduccion.add(this.jTextFieldValorCampoGeneralProduccion, this.gridBagConstraintsProduccion);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosProduccion = new GridBagLayout();

			this.jScrollPanelDatosProduccion.setLayout(gridaBagLayoutDatosProduccion);
			
			this.gridBagConstraintsProduccion = new GridBagConstraints();
			this.gridBagConstraintsProduccion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProduccion.gridy = 0;
			this.gridBagConstraintsProduccion.gridx = 0;
			
			this.jScrollPanelDatosProduccion.add(this.jTableDatosProduccion, this.gridBagConstraintsProduccion);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosProduccion.setViewportView(this.jTableDatosProduccion);
		this.jTableDatosProduccion.setFillsViewportHeight(true);
		this.jTableDatosProduccion.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesProduccion= new GridBagLayout();
		this.jPanelAccionesProduccion.setLayout(gridaBagLayoutAccionesProduccion);
		
		
		/*	
		this.gridBagConstraintsProduccion = new GridBagConstraints();
		this.gridBagConstraintsProduccion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProduccion.gridy = 0;
		this.gridBagConstraintsProduccion.gridx = 0;
			
		this.jPanelAccionesProduccion.add(this.jButtonNuevoProduccion, this.gridBagConstraintsProduccion);
		*/
		int iPosXAccion=0;
		
						
		
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutProduccion = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutProduccion);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.produccionSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsProduccion = new GridBagConstraints();						
			this.gridBagConstraintsProduccion.gridy = iGridyPrincipal++;
			this.gridBagConstraintsProduccion.gridx = 0;		
			//this.gridBagConstraintsProduccion.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProduccion.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsProduccion.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarProduccion, this.gridBagConstraintsProduccion);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsProduccion = new GridBagConstraints();
		this.gridBagConstraintsProduccion.gridy = iGridyPrincipal++;
		this.gridBagConstraintsProduccion.gridx = 0;		
		//this.gridBagConstraintsProduccion.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProduccion.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsProduccion.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsProduccion);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsProduccion = new GridBagConstraints();
		this.gridBagConstraintsProduccion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProduccion.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesProduccion, this.gridBagConstraintsProduccion);								
		
		
		/*
		this.gridBagConstraintsProduccion = new GridBagConstraints();
		this.gridBagConstraintsProduccion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProduccion.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesProduccion, this.gridBagConstraintsProduccion);
		*/		
		
		this.gridBagConstraintsProduccion = new GridBagConstraints();
		this.gridBagConstraintsProduccion.gridy =iGridyPrincipal++;
		this.gridBagConstraintsProduccion.gridx =0;
		this.gridBagConstraintsProduccion.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsProduccion.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosProduccion, this.gridBagConstraintsProduccion);
				
		
		this.gridBagConstraintsProduccion = new GridBagConstraints();
		this.gridBagConstraintsProduccion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProduccion.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionProduccion, this.gridBagConstraintsProduccion);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(ProduccionJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosProduccion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosProduccion = new GridBagLayout();
			this.jPanelBusquedasParametrosProduccion.setLayout(gridaBagLayoutBusquedasParametrosProduccion);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralProduccion=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralProduccion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProduccion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProduccion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsProduccion = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsProduccion = new GridBagConstraints();
		this.gridBagConstraintsProduccion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProduccion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposProduccion, this.gridBagConstraintsProduccion);
			
			
		this.gridBagConstraintsProduccion = new GridBagConstraints();
		this.gridBagConstraintsProduccion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProduccion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosProduccion, this.gridBagConstraintsProduccion);
		
			
		this.gridBagConstraintsProduccion = new GridBagConstraints();
		this.gridBagConstraintsProduccion.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsProduccion.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesProduccion, this.gridBagConstraintsProduccion);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralProduccion;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoProduccion() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoProduccion = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoProduccion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoProduccion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoProduccion.setName("jPanelReporteDinamicoProduccion"); 
		
		this.jPanelReporteDinamicoProduccion.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoProduccion.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoProduccion.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoProduccion.setLayout(gridaBagLayoutReporteDinamicoProduccion);
		
		
		this.jInternalFrameReporteDinamicoProduccion= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoProduccion = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteProduccion= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoProduccion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoProduccion.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoProduccion.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoProduccion.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoProduccion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoProduccion.setResizable(true);
	    this.jInternalFrameReporteDinamicoProduccion.setClosable(true);
	    this.jInternalFrameReporteDinamicoProduccion.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoProduccion.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoProduccion.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoProduccion.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoProduccion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Producciones"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteProduccion = new JLabelMe();

		this.jLabelColumnasSelectReporteProduccion.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteProduccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteProduccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteProduccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsProduccion = new GridBagConstraints();
		this.gridBagConstraintsProduccion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProduccion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProduccion.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoProduccion.add(this.jLabelColumnasSelectReporteProduccion, this.gridBagConstraintsProduccion);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteProduccion = new JList<Reporte>();
		this.jListColumnasSelectReporteProduccion.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteProduccion.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteProduccion.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteProduccion.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteProduccion.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteProduccion=new JScrollPane(this.jListColumnasSelectReporteProduccion);
			
			this.jScrollColumnasSelectReporteProduccion.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteProduccion.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteProduccion.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteProduccion.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsProduccion = new GridBagConstraints();
		this.gridBagConstraintsProduccion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProduccion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProduccion.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoProduccion.add(this.jListColumnasSelectReporteProduccion, this.gridBagConstraintsProduccion);
		this.jPanelReporteDinamicoProduccion.add(this.jScrollColumnasSelectReporteProduccion, this.gridBagConstraintsProduccion);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteProduccion = new JLabelMe();

		this.jLabelRelacionesSelectReporteProduccion.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteProduccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteProduccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteProduccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteProduccion = new JList<Reporte>();
		this.jListRelacionesSelectReporteProduccion.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteProduccion.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteProduccion.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteProduccion.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteProduccion.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteProduccion=new JScrollPane(this.jListRelacionesSelectReporteProduccion);
			
			this.jScrollRelacionesSelectReporteProduccion.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteProduccion.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteProduccion.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteProduccion.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoProduccion = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoProduccion = new JComboBoxMe();
		this.jListColumnasValoresGraficoProduccion = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoProduccion = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoProduccion.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoProduccion.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoProduccion.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoProduccion.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoProduccion, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoProduccion = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoProduccion.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoProduccion.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoProduccion.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoProduccion.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoProduccion, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoProduccion = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoProduccion.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoProduccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoProduccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoProduccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsProduccion = new GridBagConstraints();
		this.gridBagConstraintsProduccion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProduccion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProduccion.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProduccion.add(this.jLabelGenerarExcelReporteDinamicoProduccion, this.gridBagConstraintsProduccion);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoProduccion = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoProduccion.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoProduccion,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoProduccion.setToolTipText("Generar EXCEL"+" "+ProduccionConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsProduccion = new GridBagConstraints();
		//this.gridBagConstraintsProduccion.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsProduccion.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsProduccion.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoProduccion.add(this.jButtonGenerarExcelReporteDinamicoProduccion, this.gridBagConstraintsProduccion);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsProduccion = new GridBagConstraints();
		this.gridBagConstraintsProduccion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProduccion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProduccion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProduccion.add(this.jComboBoxTiposReportesDinamicoProduccion, this.gridBagConstraintsProduccion);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoProduccion = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoProduccion.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoProduccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoProduccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoProduccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsProduccion = new GridBagConstraints();
		this.gridBagConstraintsProduccion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProduccion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProduccion.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProduccion.add(this.jLabelTiposArchivoReporteDinamicoProduccion, this.gridBagConstraintsProduccion);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsProduccion = new GridBagConstraints();
		this.gridBagConstraintsProduccion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProduccion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProduccion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProduccion.add(this.jComboBoxTiposArchivosReportesDinamicoProduccion, this.gridBagConstraintsProduccion);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoProduccion = new JButtonMe();
		this.jButtonGenerarReporteDinamicoProduccion.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoProduccion,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoProduccion.setToolTipText("Generar"+" "+ProduccionConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsProduccion = new GridBagConstraints();
		this.gridBagConstraintsProduccion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProduccion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProduccion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProduccion.add(this.jButtonGenerarReporteDinamicoProduccion, this.gridBagConstraintsProduccion);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoProduccion = new JButtonMe();
		this.jButtonCerrarReporteDinamicoProduccion.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoProduccion,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoProduccion.setToolTipText("Cancelar"+" "+ProduccionConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsProduccion = new GridBagConstraints();
		this.gridBagConstraintsProduccion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProduccion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProduccion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProduccion.add(this.jButtonCerrarReporteDinamicoProduccion, this.gridBagConstraintsProduccion);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalProduccion = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoProduccion= new JScrollPane(jPanelReporteDinamicoProduccion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoProduccion.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoProduccion.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoProduccion.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoProduccion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Producciones"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsProduccion = new GridBagConstraints();
		this.gridBagConstraintsProduccion.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsProduccion.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsProduccion.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoProduccion.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoProduccion.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalProduccion);
		this.jInternalFrameReporteDinamicoProduccion.getContentPane().add(this.jScrollPanelReporteDinamicoProduccion, this.gridBagConstraintsProduccion);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionProduccion() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionProduccion = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionProduccion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionProduccion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionProduccion.setName("jPanelImportacionProduccion"); 
		
		this.jPanelImportacionProduccion.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionProduccion.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionProduccion.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionProduccion.setLayout(gridaBagLayoutImportacionProduccion);
		
		
		this.jInternalFrameImportacionProduccion= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionProduccion= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionProduccion = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteProduccion= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionProduccion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionProduccion.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionProduccion.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionProduccion.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionProduccion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionProduccion.setResizable(true);
	    this.jInternalFrameImportacionProduccion.setClosable(true);
	    this.jInternalFrameImportacionProduccion.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionProduccion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionProduccion.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionProduccion.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionProduccion.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionProduccion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionProduccion.setResizable(true);
	    this.jInternalFrameImportacionProduccion.setClosable(true);
	    this.jInternalFrameImportacionProduccion.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionProduccion.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionProduccion.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionProduccion.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionProduccion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Producciones"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionProduccion = new JLabelMe();

		this.jLabelArchivoImportacionProduccion.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionProduccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionProduccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionProduccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsProduccion = new GridBagConstraints();
		this.gridBagConstraintsProduccion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProduccion.gridy = iPosYImportacion;		
		this.gridBagConstraintsProduccion.gridx = iPosXImportacion++;
			
		this.jPanelImportacionProduccion.add(this.jLabelArchivoImportacionProduccion, this.gridBagConstraintsProduccion);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionProduccion = new JFileChooser();		
		this.jFileChooserImportacionProduccion.setToolTipText("ESCOGER ARCHIVO"+" "+ProduccionConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionProduccion = new JButtonMe();
		this.jButtonAbrirImportacionProduccion.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionProduccion,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionProduccion.setToolTipText("Generar"+" "+ProduccionConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsProduccion = new GridBagConstraints();
		this.gridBagConstraintsProduccion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProduccion.gridy = iPosYImportacion;
		this.gridBagConstraintsProduccion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProduccion.add(this.jButtonAbrirImportacionProduccion, this.gridBagConstraintsProduccion);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionProduccion = new JLabelMe();

		this.jLabelPathArchivoImportacionProduccion.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionProduccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionProduccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionProduccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsProduccion = new GridBagConstraints();
		this.gridBagConstraintsProduccion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProduccion.gridy = iPosYImportacion;		
		this.gridBagConstraintsProduccion.gridx = iPosXImportacion++;
			
		this.jPanelImportacionProduccion.add(this.jLabelPathArchivoImportacionProduccion, this.gridBagConstraintsProduccion);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionProduccion=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionProduccion.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionProduccion.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionProduccion.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsProduccion = new GridBagConstraints();
		this.gridBagConstraintsProduccion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProduccion.gridy = iPosYImportacion;
		this.gridBagConstraintsProduccion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProduccion.add(this.jTextFieldPathArchivoImportacionProduccion, this.gridBagConstraintsProduccion);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionProduccion = new JButtonMe();
		this.jButtonGenerarImportacionProduccion.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionProduccion,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionProduccion.setToolTipText("Generar"+" "+ProduccionConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsProduccion = new GridBagConstraints();
		this.gridBagConstraintsProduccion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProduccion.gridy = iPosYImportacion;
		this.gridBagConstraintsProduccion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProduccion.add(this.jButtonGenerarImportacionProduccion, this.gridBagConstraintsProduccion);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionProduccion = new JButtonMe();
		this.jButtonCerrarImportacionProduccion.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionProduccion,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionProduccion.setToolTipText("Cancelar"+" "+ProduccionConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsProduccion = new GridBagConstraints();
		this.gridBagConstraintsProduccion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProduccion.gridy = iPosYImportacion;
		this.gridBagConstraintsProduccion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProduccion.add(this.jButtonCerrarImportacionProduccion, this.gridBagConstraintsProduccion);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalProduccion = new GridBagLayout();
		
		this.jScrollPanelImportacionProduccion= new JScrollPane(jPanelImportacionProduccion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsProduccion = new GridBagConstraints();
		this.gridBagConstraintsProduccion.gridy =iPosYImportacion;
		this.gridBagConstraintsProduccion.gridx =iPosXImportacion;
		this.gridBagConstraintsProduccion.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionProduccion.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionProduccion.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalProduccion);
		this.jInternalFrameImportacionProduccion.getContentPane().add(this.jScrollPanelImportacionProduccion, this.gridBagConstraintsProduccion);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByProduccion(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByProduccion = new JButtonMe();
			this.jButtonAbrirOrderByProduccion.setText("Orden");
			this.jButtonAbrirOrderByProduccion.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByProduccion,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByProduccion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByProduccion";
			inputMap = this.jButtonAbrirOrderByProduccion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByProduccion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByProduccion"));
		
		
			GridBagLayout gridaBagLayoutOrderByProduccion = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByProduccion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByProduccion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByProduccion.setName("jPanelOrderByProduccion"); 
			
			this.jPanelOrderByProduccion.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByProduccion.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByProduccion.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByProduccion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByProduccion.setLayout(gridaBagLayoutOrderByProduccion);
			
			
			this.jTableDatosProduccionOrderBy = new JTableMe();        
			this.jTableDatosProduccionOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosProduccionOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosProduccionOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosProduccionOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosProduccionOrderBy.setViewportView(this.jTableDatosProduccionOrderBy);
			this.jTableDatosProduccionOrderBy.setFillsViewportHeight(true);
			this.jTableDatosProduccionOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByProduccion= new OrderByJInternalFrame();
			this.jInternalFrameOrderByProduccion= new OrderByJInternalFrame();
			this.jScrollPanelOrderByProduccion = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteProduccion= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByProduccion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByProduccion.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByProduccion.setTitle("Orden");
			this.jInternalFrameOrderByProduccion.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByProduccion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByProduccion.setResizable(true);
			this.jInternalFrameOrderByProduccion.setClosable(true);
			this.jInternalFrameOrderByProduccion.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByProduccion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByProduccion.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByProduccion.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByProduccion.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByProduccion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByProduccion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Producciones"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsProduccion = new GridBagConstraints();
			this.gridBagConstraintsProduccion.gridy =iPosYOrderBy++;
			this.gridBagConstraintsProduccion.gridx =iPosXOrderBy;
			this.gridBagConstraintsProduccion.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsProduccion.ipady =150;
				
			this.jPanelOrderByProduccion.add(jScrollPanelDatosProduccionOrderBy, this.gridBagConstraintsProduccion);//this.jTableDatosProduccionTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByProduccion = new JButtonMe();
			this.jButtonCerrarOrderByProduccion.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByProduccion,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByProduccion.setToolTipText("Cancelar"+" "+ProduccionConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByProduccion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsProduccion = new GridBagConstraints();
			this.gridBagConstraintsProduccion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProduccion.gridy = iPosYOrderBy++;
			this.gridBagConstraintsProduccion.gridx = iPosXOrderBy;
									
			this.jPanelOrderByProduccion.add(this.jButtonCerrarOrderByProduccion, this.gridBagConstraintsProduccion);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalProduccion = new GridBagLayout();
			
			this.jScrollPanelOrderByProduccion= new JScrollPane(jPanelOrderByProduccion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsProduccion = new GridBagConstraints();
			this.gridBagConstraintsProduccion.gridy =iPosYOrderBy;
			this.gridBagConstraintsProduccion.gridx =iPosXOrderBy;
			this.gridBagConstraintsProduccion.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByProduccion.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByProduccion.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalProduccion);
			
			this.jInternalFrameOrderByProduccion.getContentPane().add(this.jScrollPanelOrderByProduccion, this.gridBagConstraintsProduccion);			
		
		} else {
			this.jButtonAbrirOrderByProduccion = new JButtonMe();
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
		int iWidthTableCalculado=0;//530
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=330;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=200;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.produccionSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosProduccion.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosProduccion.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosProduccion.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosProduccion.getRowHeight();//ProduccionConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.produccionSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > ProduccionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaProduccion.isSelected()) {
					iHeightTable=ProduccionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ProduccionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ProduccionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > ProduccionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaProduccion.isSelected()) {
					iHeightTable=ProduccionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ProduccionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ProduccionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosProduccion.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosProduccion.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosProduccion.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosProduccion.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosProduccion.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosProduccion.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByProduccion!=null && this.jInternalFrameOrderByProduccion.getjTableDatosOrderBy()!=null) {
			//if(!this.produccionSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByProduccion.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByProduccion.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByProduccion.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByProduccion.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByProduccion.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByProduccion.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByProduccion.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosProduccion.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosProduccion.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosProduccion.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=produccionLogic.getProduccions().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=produccions.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<Produccion> TraerProduccionBeans(List<Produccion> produccions,ArrayList<Classe> classes)throws Exception {
		try {
			for(Produccion produccion:produccions) {
					
				if(!(ProduccionConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || ProduccionConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					produccion.setsDetalleGeneralEntityReporte(ProduccionConstantesFunciones.getProduccionDescripcion(produccion));
										
						
					
						
					
				} else  {
							
					//produccion.setsDetalleGeneralEntityReporte(produccion.getsDetalleGeneralEntityReporte());
										
				}
				
				//produccionbeans.add(produccionbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return produccions;
    }
	//PARA REPORTES FIN
}
