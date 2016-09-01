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
package com.bydan.erp.contabilidad.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;

import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.nomina.business.entity.*;

//import com.bydan.erp.contabilidad.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.contabilidad.util.PresuEstadoConstantesFunciones;

import com.bydan.erp.contabilidad.business.logic.*;
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
public class PresuEstadoJInternalFrame extends PresuEstadoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarPresuEstado;
	
	protected JMenuBar jmenuBarPresuEstado;
	
	protected JMenu jmenuPresuEstado;
	protected JMenu jmenuDatosPresuEstado;
	protected JMenu jmenuArchivoPresuEstado;
	protected JMenu jmenuAccionesPresuEstado;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosPresuEstado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutPresuEstado;	
	protected GridBagConstraints gridBagConstraintsPresuEstado;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public PresuEstadoDetalleFormJInternalFrame jInternalFrameDetalleFormPresuEstado;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoPresuEstado;	
	protected ImportacionJInternalFrame jInternalFrameImportacionPresuEstado;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public PresuEstadoSessionBean presuestadoSessionBean;
		
	
	
	
	//protected JDesktopPane jDesktopPane;
	public List<PresuEstado> presuestados;		
	public List<PresuEstado> presuestadosEliminados;	
	public List<PresuEstado> presuestadosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByPresuEstado;		
	protected JButton jButtonAbrirOrderByPresuEstado;
	
	
	//protected JPanel jPanelOrderByPresuEstado;
	//public JScrollPane jScrollPanelOrderByPresuEstado;	
	//protected JButton jButtonCerrarOrderByPresuEstado;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public PresuEstadoLogic presuestadoLogic;
	
	
	
	public JScrollPane jScrollPanelDatosPresuEstado;
	public JScrollPane jScrollPanelDatosEdicionPresuEstado;
	public JScrollPane jScrollPanelDatosGeneralPresuEstado;
    
	
	
	//public JScrollPane jScrollPanelDatosPresuEstadoOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoPresuEstado;
	//public JScrollPane jScrollPanelImportacionPresuEstado;
	
	
	
	protected JPanel jPanelAccionesPresuEstado;
	
    protected JPanel jPanelPaginacionPresuEstado;
    protected JPanel jPanelParametrosReportesPresuEstado;
	protected JPanel jPanelParametrosReportesAccionesPresuEstado;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1PresuEstado;
	protected JPanel jPanelParametrosAuxiliar2PresuEstado;
	protected JPanel jPanelParametrosAuxiliar3PresuEstado;
	protected JPanel jPanelParametrosAuxiliar4PresuEstado;
	//protected JPanel jPanelParametrosAuxiliar5PresuEstado;
	
	
	
	//protected JPanel jPanelReporteDinamicoPresuEstado;
	//protected JPanel jPanelImportacionPresuEstado;
	
	
	public JTable jTableDatosPresuEstado;
	
	
	
	//public JTable jTableDatosPresuEstadoOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoPresuEstado;
	protected JButton jButtonDuplicarPresuEstado;
	protected JButton jButtonCopiarPresuEstado;
	protected JButton jButtonVerFormPresuEstado;
	protected JButton jButtonNuevoRelacionesPresuEstado;
	protected JButton jButtonModificarPresuEstado;
	
    protected JButton jButtonGuardarCambiosTablaPresuEstado;
	protected JButton jButtonCerrarPresuEstado;
	
	
	protected JButton jButtonRecargarInformacionPresuEstado;
	protected JButton jButtonProcesarInformacionPresuEstado;
	
	
	protected JButton jButtonAnterioresPresuEstado;
	protected JButton jButtonSiguientesPresuEstado;
	protected JButton jButtonNuevoGuardarCambiosPresuEstado;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoPresuEstado;
	//protected JButton jButtonCerrarReporteDinamicoPresuEstado;
	//protected JButton jButtonGenerarExcelReporteDinamicoPresuEstado;	
	
	
	
	//protected JButton jButtonAbrirImportacionPresuEstado;
	//protected JButton jButtonGenerarImportacionPresuEstado;
	//protected JButton jButtonCerrarImportacionPresuEstado;
	//protected JFileChooser jFileChooserImportacionPresuEstado;
	//protected File fileImportacionPresuEstado;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarPresuEstado;
	protected JButton jButtonDuplicarToolBarPresuEstado;
	protected JButton jButtonNuevoRelacionesToolBarPresuEstado;
	
	
	public JButton jButtonGuardarCambiosToolBarPresuEstado;
	protected JButton jButtonCopiarToolBarPresuEstado;
	protected JButton jButtonVerFormToolBarPresuEstado;
	public JButton jButtonGuardarCambiosTablaToolBarPresuEstado;
	protected JButton jButtonMostrarOcultarTablaToolBarPresuEstado;
	protected JButton jButtonCerrarToolBarPresuEstado;
	
	protected JButton jButtonRecargarInformacionToolBarPresuEstado;
	protected JButton jButtonProcesarInformacionToolBarPresuEstado;
	protected JButton jButtonAnterioresToolBarPresuEstado;
	protected JButton jButtonSiguientesToolBarPresuEstado;
	protected JButton jButtonNuevoGuardarCambiosToolBarPresuEstado;
	protected JButton jButtonAbrirOrderByToolBarPresuEstado;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoPresuEstado;
	protected JMenuItem jMenuItemDuplicarPresuEstado;
	protected JMenuItem jMenuItemNuevoRelacionesPresuEstado;
	
	
	protected JMenuItem jMenuItemGuardarCambiosPresuEstado;
	protected JMenuItem jMenuItemCopiarPresuEstado;
	protected JMenuItem jMenuItemVerFormPresuEstado;
	protected JMenuItem jMenuItemGuardarCambiosTablaPresuEstado;
	protected JMenuItem jMenuItemCerrarPresuEstado;
	protected JMenuItem jMenuItemDetalleCerrarPresuEstado;
	protected JMenuItem jMenuItemDetalleAbrirOrderByPresuEstado;
	protected JMenuItem jMenuItemDetalleMostarOcultarPresuEstado;
	
	protected JMenuItem jMenuItemRecargarInformacionPresuEstado;
	protected JMenuItem jMenuItemProcesarInformacionPresuEstado;
	protected JMenuItem jMenuItemAnterioresPresuEstado;
	protected JMenuItem jMenuItemSiguientesPresuEstado;
	protected JMenuItem jMenuItemNuevoGuardarCambiosPresuEstado;
	protected JMenuItem jMenuItemAbrirOrderByPresuEstado;
	protected JMenuItem jMenuItemMostrarOcultarPresuEstado;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesPresuEstado;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosPresuEstado;
	protected JCheckBox jCheckBoxSeleccionadosPresuEstado;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaPresuEstado;
	protected JCheckBox jCheckBoxConGraficoReportePresuEstado;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesPresuEstado;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesPresuEstado;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoPresuEstado;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoPresuEstado;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesPresuEstado;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionPresuEstado;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesPresuEstado;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesPresuEstado;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarPresuEstado;
	protected JTextField jTextFieldValorCampoGeneralPresuEstado;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReportePresuEstado;
	//public JList<Reporte> jListColumnasSelectReportePresuEstado;
	//public JScrollPane jScrollColumnasSelectReportePresuEstado;
	
	//public JLabel jLabelRelacionesSelectReportePresuEstado;
	//public JList<Reporte> jListRelacionesSelectReportePresuEstado;
	//public JScrollPane jScrollRelacionesSelectReportePresuEstado;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoPresuEstado;
	//protected JCheckBox jCheckBoxConGraficoDinamicoPresuEstado;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoPresuEstado;
	//public JLabel jLabelTiposArchivoReporteDinamicoPresuEstado;
	
		
	//public JLabel jLabelArchivoImportacionPresuEstado;	
	//public JLabel jLabelPathArchivoImportacionPresuEstado;
	//protected JTextField jTextFieldPathArchivoImportacionPresuEstado;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoPresuEstado;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoPresuEstado;
	
	//public JLabel jLabelColumnaCategoriaValorPresuEstado;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorPresuEstado;
	
	//public JLabel jLabelColumnasValoresGraficoPresuEstado;
	//public JList<Reporte> jListColumnasValoresGraficoPresuEstado;
	//public JScrollPane jScrollColumnasValoresGraficoPresuEstado;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoPresuEstado;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoPresuEstado;	
	
	
	
	
	
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
	public PresuEstadoJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("PresuEstado No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PresuEstadoJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("PresuEstado No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PresuEstadoJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("PresuEstado No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PresuEstadoJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("PresuEstado No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionPresuEstado)	{
		this.jButtonRecargarInformacionPresuEstado = jButtonRecargarInformacionPresuEstado;
	}
	
	public JButton getjButtonProcesarInformacionPresuEstado() {
		return this.jButtonProcesarInformacionPresuEstado;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionPresuEstado)	{
		this.jButtonProcesarInformacionPresuEstado = jButtonProcesarInformacionPresuEstado;
	}
	
	
	public JButton getjButtonRecargarInformacionPresuEstado() {
		return this.jButtonRecargarInformacionPresuEstado;
	}
	
	
	public List<PresuEstado> getpresuestados() {
		return this.presuestados;
	}

	public void setpresuestados(List<PresuEstado> presuestados) {
		this.presuestados = presuestados;
	}
	
	public List<PresuEstado> getpresuestadosAux() {
		return this.presuestadosAux;
	}

	public void setpresuestadosAux(List<PresuEstado> presuestadosAux) {
		this.presuestadosAux = presuestadosAux;
	}
	
	public List<PresuEstado> getpresuestadosEliminados() {
		return this.presuestadosEliminados;
	}

	public void setPresuEstadosEliminados(List<PresuEstado> presuestadosEliminados) {
		this.presuestadosEliminados = presuestadosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarPresuEstado() {
		return jComboBoxTiposSeleccionarPresuEstado;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarPresuEstado(
			JComboBox jComboBoxTiposSeleccionarPresuEstado) {
		this.jComboBoxTiposSeleccionarPresuEstado = jComboBoxTiposSeleccionarPresuEstado;
	}
	
	public void setBorderResaltarTiposSeleccionarPresuEstado() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarPresuEstado.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarPresuEstado .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralPresuEstado() {
		return jTextFieldValorCampoGeneralPresuEstado;
	}

	public void setjTextFieldValorCampoGeneralPresuEstado(
			JTextField jTextFieldValorCampoGeneralPresuEstado) {
		this.jTextFieldValorCampoGeneralPresuEstado = jTextFieldValorCampoGeneralPresuEstado;
	}

	public void setBorderResaltarValorCampoGeneralPresuEstado() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPresuEstado.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralPresuEstado .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosPresuEstado() {
		return this.jCheckBoxSeleccionarTodosPresuEstado;
	}

	public void setjCheckBoxSeleccionarTodosPresuEstado(
			JCheckBox jCheckBoxSeleccionarTodosPresuEstado) {
		this.jCheckBoxSeleccionarTodosPresuEstado = jCheckBoxSeleccionarTodosPresuEstado;
	}

	public void setBorderResaltarSeleccionarTodosPresuEstado() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPresuEstado.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosPresuEstado .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosPresuEstado() {
		return this.jCheckBoxSeleccionadosPresuEstado;
	}

	public void setjCheckBoxSeleccionadosPresuEstado(
			JCheckBox jCheckBoxSeleccionadosPresuEstado) {
		this.jCheckBoxSeleccionadosPresuEstado = jCheckBoxSeleccionadosPresuEstado;
	}
	
	public void setBorderResaltarSeleccionadosPresuEstado() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPresuEstado.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosPresuEstado .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesPresuEstado() {
		return this.jComboBoxTiposArchivosReportesPresuEstado;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesPresuEstado(
			JComboBox jComboBoxTiposArchivosReportesPresuEstado) {
		this.jComboBoxTiposArchivosReportesPresuEstado = jComboBoxTiposArchivosReportesPresuEstado;
	}

	public void setBorderResaltarTiposArchivosReportesPresuEstado() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPresuEstado.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesPresuEstado .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesPresuEstado() {
		return this.jComboBoxTiposReportesPresuEstado;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesPresuEstado(
			JComboBox jComboBoxTiposReportesPresuEstado) {
		this.jComboBoxTiposReportesPresuEstado = jComboBoxTiposReportesPresuEstado;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoPresuEstado() {
	//	return jComboBoxTiposReportesDinamicoPresuEstado;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoPresuEstado(
	//		JComboBox jComboBoxTiposReportesDinamicoPresuEstado) {
	//	this.jComboBoxTiposReportesDinamicoPresuEstado = jComboBoxTiposReportesDinamicoPresuEstado;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoPresuEstado() {
	//	return jComboBoxTiposArchivosReportesDinamicoPresuEstado;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoPresuEstado(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoPresuEstado) {
	//	this.jComboBoxTiposArchivosReportesDinamicoPresuEstado = jComboBoxTiposArchivosReportesDinamicoPresuEstado;
	//}
	
	public void setBorderResaltarTiposReportesPresuEstado() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPresuEstado.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesPresuEstado .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesPresuEstado() {
		return this.jComboBoxTiposGraficosReportesPresuEstado;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesPresuEstado(
			JComboBox jComboBoxTiposGraficosReportesPresuEstado) {
		this.jComboBoxTiposGraficosReportesPresuEstado = jComboBoxTiposGraficosReportesPresuEstado;
	}
	
	public void setBorderResaltarTiposGraficosReportesPresuEstado() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPresuEstado.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesPresuEstado .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionPresuEstado() {
		return this.jComboBoxTiposPaginacionPresuEstado;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionPresuEstado(
			JComboBox jComboBoxTiposPaginacionPresuEstado) {
		this.jComboBoxTiposPaginacionPresuEstado = jComboBoxTiposPaginacionPresuEstado;
	}
	
	public void setBorderResaltarTiposPaginacionPresuEstado() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPresuEstado.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionPresuEstado .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesPresuEstado() {
		return this.jComboBoxTiposRelacionesPresuEstado;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesPresuEstado() {
		return this.jComboBoxTiposAccionesPresuEstado;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesPresuEstado(
			JComboBox jComboBoxTiposRelacionesPresuEstado) {
		this.jComboBoxTiposRelacionesPresuEstado = jComboBoxTiposRelacionesPresuEstado;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesPresuEstado(
			JComboBox jComboBoxTiposAccionesPresuEstado) {
		this.jComboBoxTiposAccionesPresuEstado = jComboBoxTiposAccionesPresuEstado;
	}
	
	public void setBorderResaltarTiposRelacionesPresuEstado() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPresuEstado.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesPresuEstado .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesPresuEstado() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPresuEstado.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesPresuEstado .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoPresuEstado() {
	//	return jCheckBoxConGraficoDinamicoPresuEstado;
	//}

	//public void setjCheckBoxConGraficoDinamicoPresuEstado(
	//		JCheckBox jCheckBoxConGraficoDinamicoPresuEstado) {
	//	this.jCheckBoxConGraficoDinamicoPresuEstado = jCheckBoxConGraficoDinamicoPresuEstado;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoPresuEstado() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarPresuEstado.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoPresuEstado .setBorder(borderResaltar);		
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
		this.presuestadoSessionBean=new PresuEstadoSessionBean();
		
		this.presuestadoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.presuestadoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.presuestadoSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=PresuEstadoJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=PresuEstadoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		PresuEstadoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		PresuEstadoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		PresuEstadoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Estado MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 650) {
			iHeight=650;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.presuestadoSessionBean.getEsGuardarRelacionado()) {
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
		
		PresuEstadoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("PresuEstado No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarPresuEstado= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarPresuEstado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarPresuEstado,this.jTtoolBarPresuEstado,
							"nuevo","nuevo","Nuevo"+" "+PresuEstadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarPresuEstado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarPresuEstado,this.jTtoolBarPresuEstado,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarPresuEstado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarPresuEstado,this.jTtoolBarPresuEstado,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+PresuEstadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarPresuEstado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarPresuEstado,this.jTtoolBarPresuEstado,
							"duplicar","duplicar","Duplicar"+" "+PresuEstadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarPresuEstado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarPresuEstado,this.jTtoolBarPresuEstado,
							"copiar","copiar","Copiar"+" "+PresuEstadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarPresuEstado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarPresuEstado,this.jTtoolBarPresuEstado,
							"ver_form","ver_form","Ver"+" "+PresuEstadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarPresuEstado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarPresuEstado,this.jTtoolBarPresuEstado,
							"recargar","recargar","Recargar"+" "+PresuEstadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarPresuEstado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarPresuEstado,this.jTtoolBarPresuEstado,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarPresuEstado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarPresuEstado,this.jTtoolBarPresuEstado,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarPresuEstado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarPresuEstado,this.jTtoolBarPresuEstado,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarPresuEstado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarPresuEstado,this.jTtoolBarPresuEstado,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarPresuEstado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarPresuEstado,this.jTtoolBarPresuEstado,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+PresuEstadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarPresuEstado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarPresuEstado,this.jTtoolBarPresuEstado,
							"cerrar","cerrar","Salir"+" "+PresuEstadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarPresuEstado=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarPresuEstado;
			
				this.jButtonProcesarInformacionToolBarPresuEstado=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarPresuEstado;
				
		//protected JButton jButtonModificarToolBarPresuEstado;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarPresuEstado=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuPresuEstado=new JMenuMe("General");
		this.jmenuArchivoPresuEstado=new JMenuMe("Archivo");
		this.jmenuAccionesPresuEstado=new JMenuMe("Acciones");
		this.jmenuDatosPresuEstado=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoPresuEstado= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoPresuEstado.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoPresuEstado,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoPresuEstado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarPresuEstado= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarPresuEstado.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarPresuEstado,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarPresuEstado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesPresuEstado= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesPresuEstado.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesPresuEstado,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesPresuEstado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosPresuEstado= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosPresuEstado.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosPresuEstado,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosPresuEstado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarPresuEstado= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarPresuEstado.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarPresuEstado,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarPresuEstado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormPresuEstado= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormPresuEstado.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormPresuEstado,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormPresuEstado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaPresuEstado= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaPresuEstado.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaPresuEstado,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaPresuEstado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarPresuEstado= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarPresuEstado.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarPresuEstado,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarPresuEstado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionPresuEstado= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionPresuEstado.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionPresuEstado,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionPresuEstado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionPresuEstado= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionPresuEstado.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionPresuEstado,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresPresuEstado= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresPresuEstado.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresPresuEstado,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresPresuEstado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesPresuEstado= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesPresuEstado.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesPresuEstado,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesPresuEstado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByPresuEstado= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByPresuEstado.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByPresuEstado,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByPresuEstado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarPresuEstado= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarPresuEstado.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarPresuEstado,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarPresuEstado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByPresuEstado= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByPresuEstado.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByPresuEstado,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByPresuEstado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarPresuEstado= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarPresuEstado.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarPresuEstado,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarPresuEstado, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosPresuEstado= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosPresuEstado.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosPresuEstado,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosPresuEstado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoPresuEstado.add(this.jMenuItemCerrarPresuEstado);
			
			this.jmenuAccionesPresuEstado.add(this.jMenuItemNuevoPresuEstado);
			this.jmenuAccionesPresuEstado.add(this.jMenuItemNuevoGuardarCambiosPresuEstado);
			this.jmenuAccionesPresuEstado.add(this.jMenuItemNuevoRelacionesPresuEstado);
			this.jmenuAccionesPresuEstado.add(this.jMenuItemGuardarCambiosTablaPresuEstado);		
			this.jmenuAccionesPresuEstado.add(this.jMenuItemDuplicarPresuEstado);		
			this.jmenuAccionesPresuEstado.add(this.jMenuItemCopiarPresuEstado);		
			this.jmenuAccionesPresuEstado.add(this.jMenuItemVerFormPresuEstado);		
			
			this.jmenuDatosPresuEstado.add(this.jMenuItemRecargarInformacionPresuEstado);				
			this.jmenuDatosPresuEstado.add(this.jMenuItemAnterioresPresuEstado);				
			this.jmenuDatosPresuEstado.add(this.jMenuItemSiguientesPresuEstado);				
			this.jmenuDatosPresuEstado.add(this.jMenuItemAbrirOrderByPresuEstado);				
			this.jmenuDatosPresuEstado.add(this.jMenuItemMostrarOcultarPresuEstado);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesPresuEstado.add(this.jMenuItemGuardarCambiosPresuEstado);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoPresuEstado, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesPresuEstado, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosPresuEstado, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarPresuEstado.add(this.jmenuArchivoPresuEstado);		
			this.jmenuBarPresuEstado.add(this.jmenuAccionesPresuEstado);		
			this.jmenuBarPresuEstado.add(this.jmenuDatosPresuEstado);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarPresuEstado);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasPresuEstado() {
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
			//this.jInternalFrameDetallePresuEstado = new PresuEstadoDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Estado DATOS");
			this.jInternalFrameDetalleFormPresuEstado = new PresuEstadoDetalleFormJInternalFrame(jDesktopPane,this.presuestadoSessionBean.getConGuardarRelaciones(),this.presuestadoSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormPresuEstado = null;//new PresuEstadoDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutPresuEstado= new GridBagLayout();
		
		
		this.jTableDatosPresuEstado = new JTableMe();      
		
		String sToolTipPresuEstado="";
		sToolTipPresuEstado=PresuEstadoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipPresuEstado+="(Contabilidad.PresuEstado)";
		}
		
		if(!this.presuestadoSessionBean.getEsGuardarRelacionado()) {
			sToolTipPresuEstado+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosPresuEstado.setToolTipText(sToolTipPresuEstado);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosPresuEstado);
		this.jTableDatosPresuEstado.setAutoCreateRowSorter(true);
		this.jTableDatosPresuEstado.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosPresuEstado.setRowSelectionAllowed(true);
		this.jTableDatosPresuEstado.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosPresuEstado,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoPresuEstado = new JButtonMe();
		this.jButtonDuplicarPresuEstado = new JButtonMe();
		this.jButtonCopiarPresuEstado = new JButtonMe();
		this.jButtonVerFormPresuEstado = new JButtonMe();
		this.jButtonNuevoRelacionesPresuEstado = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaPresuEstado = new JButtonMe();
		this.jButtonCerrarPresuEstado = new JButtonMe();
		
		this.jScrollPanelDatosPresuEstado = new JScrollPane();   
        this.jScrollPanelDatosGeneralPresuEstado = new JScrollPane();
		
				
		
		
		this.jPanelAccionesPresuEstado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Estado";
		
		if(!this.presuestadoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosPresuEstado.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estados" + this.sPath));
		} else {
			this.jScrollPanelDatosPresuEstado.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralPresuEstado.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesPresuEstado.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesPresuEstado.setToolTipText("Acciones");
        this.jPanelAccionesPresuEstado.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralPresuEstado, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosPresuEstado, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoPresuEstado=new ReporteDinamicoJInternalFrame(PresuEstadoConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoPresuEstado();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionPresuEstado=new ImportacionJInternalFrame(PresuEstadoConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionPresuEstado();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByPresuEstado = new JButtonMe();
		
		this.jButtonAbrirOrderByPresuEstado.setText("Orden");
		this.jButtonAbrirOrderByPresuEstado.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByPresuEstado,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByPresuEstado, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByPresuEstado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByPresuEstado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByPresuEstado=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPresuEstado,false,this);
			
			//this.cargarOrderByPresuEstado(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByPresuEstado=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPresuEstado,true,this);
			
			//this.cargarOrderByPresuEstado(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosPresuEstado.setMinimumSize(new Dimension(400,50));//330
		this.jTableDatosPresuEstado.setMaximumSize(new Dimension(400,50));//330
		this.jTableDatosPresuEstado.setPreferredSize(new Dimension(400,50));//330
		
		this.jScrollPanelDatosPresuEstado.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosPresuEstado.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosPresuEstado.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoPresuEstado.setText("Nuevo");
		this.jButtonDuplicarPresuEstado.setText("Duplicar");
		this.jButtonCopiarPresuEstado.setText("Copiar");
		this.jButtonVerFormPresuEstado.setText("Ver");
		this.jButtonNuevoRelacionesPresuEstado.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaPresuEstado.setText("Guardar");
		this.jButtonCerrarPresuEstado.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoPresuEstado,"nuevo_button","Nuevo",this.presuestadoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarPresuEstado,"duplicar_button","Duplicar",this.presuestadoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarPresuEstado,"copiar_button","Copiar",this.presuestadoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormPresuEstado,"ver_form","Ver",this.presuestadoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesPresuEstado,"nuevorelaciones_button","Nuevo Rel",this.presuestadoSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaPresuEstado,"guardarcambiostabla_button","Guardar",this.presuestadoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarPresuEstado,"cerrar_button","Salir",this.presuestadoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoPresuEstado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarPresuEstado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarPresuEstado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormPresuEstado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesPresuEstado, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaPresuEstado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarPresuEstado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoPresuEstado.setToolTipText("Nuevo"+" "+PresuEstadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarPresuEstado.setToolTipText("Duplicar"+" "+PresuEstadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarPresuEstado.setToolTipText("Copiar"+" "+PresuEstadoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormPresuEstado.setToolTipText("Ver"+" "+PresuEstadoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesPresuEstado.setToolTipText("Nuevo Rel"+" "+PresuEstadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaPresuEstado.setToolTipText("Guardar"+" "+PresuEstadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarPresuEstado.setToolTipText("Salir"+" "+PresuEstadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoPresuEstado";
		inputMap = this.jButtonNuevoPresuEstado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoPresuEstado.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoPresuEstado"));
		
		//DUPLICAR
		sMapKey = "DuplicarPresuEstado";
		inputMap = this.jButtonDuplicarPresuEstado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarPresuEstado.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarPresuEstado"));
		
		//COPIAR
		sMapKey = "CopiarPresuEstado";
		inputMap = this.jButtonCopiarPresuEstado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarPresuEstado.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarPresuEstado"));
		
		//VEr FORM
		sMapKey = "VerFormPresuEstado";
		inputMap = this.jButtonVerFormPresuEstado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormPresuEstado.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormPresuEstado"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesPresuEstado";
		inputMap = this.jButtonNuevoRelacionesPresuEstado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesPresuEstado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesPresuEstado"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarPresuEstado";
		inputMap = this.jButtonModificarPresuEstado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarPresuEstado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarPresuEstado"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarPresuEstado";
		inputMap = this.jButtonCerrarPresuEstado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarPresuEstado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarPresuEstado"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaPresuEstado";
		inputMap = this.jButtonGuardarCambiosTablaPresuEstado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaPresuEstado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaPresuEstado"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesPresuEstado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesPresuEstado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionPresuEstado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1PresuEstado= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2PresuEstado= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3PresuEstado= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4PresuEstado= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5PresuEstado= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesPresuEstado.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesPresuEstado.setName("jPanelParametrosReportesPresuEstado"); 
		
		this.jPanelParametrosReportesAccionesPresuEstado.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesPresuEstado.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesPresuEstado.setName("jPanelParametrosReportesAccionesPresuEstado"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesPresuEstado, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesPresuEstado, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionPresuEstado = new JButtonMe();
		this.jButtonRecargarInformacionPresuEstado.setText("Recargar");
		this.jButtonRecargarInformacionPresuEstado.setToolTipText("Recargar"+" "+PresuEstadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionPresuEstado,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionPresuEstado = new JButtonMe();
		this.jButtonProcesarInformacionPresuEstado.setText("Procesar");
		this.jButtonProcesarInformacionPresuEstado.setToolTipText("Procesar"+" "+PresuEstadoConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionPresuEstado.setVisible(false);
			
		this.jButtonProcesarInformacionPresuEstado.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionPresuEstado.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionPresuEstado.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesPresuEstado = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesPresuEstado.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesPresuEstado.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesPresuEstado = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesPresuEstado.setText("TIPO");       
		this.jComboBoxTiposReportesPresuEstado.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesPresuEstado = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesPresuEstado.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesPresuEstado.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionPresuEstado = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionPresuEstado.setText("Paginacion");
		this.jComboBoxTiposPaginacionPresuEstado.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesPresuEstado = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesPresuEstado.setText("Accion");
		this.jComboBoxTiposRelacionesPresuEstado.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesPresuEstado = new JComboBoxMe();
		//this.jComboBoxTiposAccionesPresuEstado.setText("Accion");
		this.jComboBoxTiposAccionesPresuEstado.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarPresuEstado = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarPresuEstado.setText("Accion");
		this.jComboBoxTiposSeleccionarPresuEstado.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralPresuEstado=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralPresuEstado.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralPresuEstado.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralPresuEstado.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesPresuEstado = new JLabelMe();
		
		this.jLabelAccionesPresuEstado.setText("Acciones");		
		this.jLabelAccionesPresuEstado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPresuEstado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPresuEstado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosPresuEstado = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosPresuEstado.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosPresuEstado.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosPresuEstado = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosPresuEstado.setText("Seleccionados");
		this.jCheckBoxSeleccionadosPresuEstado.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaPresuEstado = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaPresuEstado.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaPresuEstado.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReportePresuEstado = new JCheckBoxMe();
		this.jCheckBoxConGraficoReportePresuEstado.setText("Graf.");
		this.jCheckBoxConGraficoReportePresuEstado.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresPresuEstado = new JButtonMe();
		//this.jButtonAnterioresPresuEstado.setText("<<");
        this.jButtonAnterioresPresuEstado.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresPresuEstado,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresPresuEstado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesPresuEstado = new JButtonMe();
		//this.jButtonSiguientesPresuEstado.setText(">>");
        this.jButtonSiguientesPresuEstado.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesPresuEstado,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesPresuEstado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosPresuEstado = new JButtonMe();
		this.jButtonNuevoGuardarCambiosPresuEstado.setText("Nue");
        this.jButtonNuevoGuardarCambiosPresuEstado.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosPresuEstado,"nuevoguardarcambios_button","Nue",this.presuestadoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosPresuEstado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosPresuEstado";
		inputMap = this.jButtonNuevoGuardarCambiosPresuEstado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosPresuEstado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosPresuEstado"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionPresuEstado";
		inputMap = this.jButtonRecargarInformacionPresuEstado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionPresuEstado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionPresuEstado"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesPresuEstado";
		inputMap = this.jButtonSiguientesPresuEstado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesPresuEstado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesPresuEstado"));
		
		//ANTERIORES		
		sMapKey = "AnterioresPresuEstado";
		inputMap = this.jButtonAnterioresPresuEstado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresPresuEstado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresPresuEstado"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasPresuEstado();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesPresuEstado.setMinimumSize(new Dimension(this.getWidth(),PresuEstadoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(PresuEstadoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesPresuEstado.setMaximumSize(new Dimension(this.getWidth(),PresuEstadoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(PresuEstadoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesPresuEstado.setPreferredSize(new Dimension(this.getWidth(),PresuEstadoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(PresuEstadoBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionPresuEstado = new GridBagLayout();

			this.jPanelPaginacionPresuEstado.setLayout(gridaBagLayoutPaginacionPresuEstado);						
			
			this.gridBagConstraintsPresuEstado = new GridBagConstraints();
			this.gridBagConstraintsPresuEstado.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsPresuEstado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresuEstado.gridy = 0;
			this.gridBagConstraintsPresuEstado.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionPresuEstado.add(this.jButtonAnterioresPresuEstado, this.gridBagConstraintsPresuEstado);
					
						
			this.gridBagConstraintsPresuEstado = new GridBagConstraints();
			this.gridBagConstraintsPresuEstado.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsPresuEstado.gridy = 0;
			
			this.jPanelPaginacionPresuEstado.add(this.jButtonNuevoGuardarCambiosPresuEstado, this.gridBagConstraintsPresuEstado);
						
			
			this.gridBagConstraintsPresuEstado = new GridBagConstraints();
			this.gridBagConstraintsPresuEstado.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsPresuEstado.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsPresuEstado.gridy = 0;
			this.jPanelPaginacionPresuEstado.add(this.jButtonSiguientesPresuEstado, this.gridBagConstraintsPresuEstado);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsPresuEstado = new GridBagConstraints();
			this.gridBagConstraintsPresuEstado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresuEstado.gridy = 1;
			this.gridBagConstraintsPresuEstado.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionPresuEstado.add(this.jButtonNuevoPresuEstado, this.gridBagConstraintsPresuEstado);
						
			
			
			if(!this.presuestadoSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsPresuEstado = new GridBagConstraints();
				this.gridBagConstraintsPresuEstado.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsPresuEstado.gridy = 1;
				this.gridBagConstraintsPresuEstado.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionPresuEstado.add(this.jButtonGuardarCambiosTablaPresuEstado, this.gridBagConstraintsPresuEstado);
			}
			
			
			
			this.gridBagConstraintsPresuEstado = new GridBagConstraints();
			this.gridBagConstraintsPresuEstado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresuEstado.gridy = 1;
			this.gridBagConstraintsPresuEstado.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionPresuEstado.add(this.jButtonDuplicarPresuEstado, this.gridBagConstraintsPresuEstado);
			
			this.gridBagConstraintsPresuEstado = new GridBagConstraints();
			this.gridBagConstraintsPresuEstado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresuEstado.gridy = 1;
			this.gridBagConstraintsPresuEstado.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionPresuEstado.add(this.jButtonCopiarPresuEstado, this.gridBagConstraintsPresuEstado);
		
			this.gridBagConstraintsPresuEstado = new GridBagConstraints();
			this.gridBagConstraintsPresuEstado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresuEstado.gridy = 1;
			this.gridBagConstraintsPresuEstado.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionPresuEstado.add(this.jButtonVerFormPresuEstado, this.gridBagConstraintsPresuEstado);
		
			this.gridBagConstraintsPresuEstado = new GridBagConstraints();
			this.gridBagConstraintsPresuEstado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresuEstado.gridy = 1;
			this.gridBagConstraintsPresuEstado.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionPresuEstado.add(this.jButtonCerrarPresuEstado, this.gridBagConstraintsPresuEstado);
		
		
		
		this.jButtonRecargarInformacionPresuEstado.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionPresuEstado.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionPresuEstado.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionPresuEstado, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesPresuEstado.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesPresuEstado.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesPresuEstado.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesPresuEstado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesPresuEstado.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesPresuEstado.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesPresuEstado.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesPresuEstado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesPresuEstado.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesPresuEstado.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesPresuEstado.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesPresuEstado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionPresuEstado.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionPresuEstado.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionPresuEstado.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionPresuEstado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesPresuEstado.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesPresuEstado.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesPresuEstado.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesPresuEstado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesPresuEstado.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPresuEstado.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPresuEstado.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesPresuEstado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarPresuEstado.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarPresuEstado.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarPresuEstado.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarPresuEstado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaPresuEstado.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaPresuEstado.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaPresuEstado.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaPresuEstado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReportePresuEstado.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReportePresuEstado.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReportePresuEstado.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReportePresuEstado, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosPresuEstado.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosPresuEstado.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosPresuEstado.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosPresuEstado, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosPresuEstado.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosPresuEstado.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosPresuEstado.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosPresuEstado, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesPresuEstado = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesPresuEstado = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1PresuEstado = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2PresuEstado = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3PresuEstado = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4PresuEstado = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesPresuEstado.setLayout(gridaBagParametrosReportesPresuEstado);
			this.jPanelParametrosReportesAccionesPresuEstado.setLayout(gridaBagParametrosReportesAccionesPresuEstado);
			
			
			this.jPanelParametrosAuxiliar1PresuEstado.setLayout(gridaBagParametrosAuxiliar1PresuEstado);
			this.jPanelParametrosAuxiliar2PresuEstado.setLayout(gridaBagParametrosAuxiliar2PresuEstado);
			this.jPanelParametrosAuxiliar3PresuEstado.setLayout(gridaBagParametrosAuxiliar3PresuEstado);
			this.jPanelParametrosAuxiliar4PresuEstado.setLayout(gridaBagParametrosAuxiliar4PresuEstado);
			//this.jPanelParametrosAuxiliar5PresuEstado.setLayout(gridaBagParametrosAuxiliar2PresuEstado);			
			
			
			
			
			this.gridBagConstraintsPresuEstado = new GridBagConstraints();
			this.gridBagConstraintsPresuEstado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresuEstado.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsPresuEstado.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPresuEstado.add(this.jButtonRecargarInformacionPresuEstado, this.gridBagConstraintsPresuEstado);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsPresuEstado = new GridBagConstraints();
			this.gridBagConstraintsPresuEstado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPresuEstado.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsPresuEstado.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1PresuEstado.add(this.jComboBoxTiposPaginacionPresuEstado, this.gridBagConstraintsPresuEstado);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsPresuEstado = new GridBagConstraints();
			this.gridBagConstraintsPresuEstado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPresuEstado.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsPresuEstado.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1PresuEstado.add(this.jCheckBoxConAltoMaximoTablaPresuEstado, this.gridBagConstraintsPresuEstado);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsPresuEstado = new GridBagConstraints();
			this.gridBagConstraintsPresuEstado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPresuEstado.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsPresuEstado.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1PresuEstado.add(this.jComboBoxTiposArchivosReportesPresuEstado, this.gridBagConstraintsPresuEstado);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsPresuEstado = new GridBagConstraints();
			this.gridBagConstraintsPresuEstado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPresuEstado.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPresuEstado.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPresuEstado.add(this.jPanelParametrosAuxiliar1PresuEstado, this.gridBagConstraintsPresuEstado);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsPresuEstado = new GridBagConstraints();
			this.gridBagConstraintsPresuEstado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPresuEstado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresuEstado.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPresuEstado.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4PresuEstado.add(this.jComboBoxTiposReportesPresuEstado, this.gridBagConstraintsPresuEstado);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsPresuEstado = new GridBagConstraints();
			this.gridBagConstraintsPresuEstado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPresuEstado.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPresuEstado.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPresuEstado.add(this.jPanelParametrosAuxiliar4PresuEstado, this.gridBagConstraintsPresuEstado);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsPresuEstado = new GridBagConstraints();
			this.gridBagConstraintsPresuEstado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPresuEstado.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsPresuEstado.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPresuEstado.add(this.jComboBoxTiposReportesPresuEstado, this.gridBagConstraintsPresuEstado);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsPresuEstado = new GridBagConstraints();
			this.gridBagConstraintsPresuEstado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPresuEstado.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPresuEstado.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesPresuEstado.add(this.jCheckBoxGenerarReportePresuEstado, this.gridBagConstraintsPresuEstado);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsPresuEstado = new GridBagConstraints();
			this.gridBagConstraintsPresuEstado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPresuEstado.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPresuEstado.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPresuEstado.add(this.jPanelParametrosAuxiliar2PresuEstado, this.gridBagConstraintsPresuEstado);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsPresuEstado = new GridBagConstraints();
			this.gridBagConstraintsPresuEstado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresuEstado.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsPresuEstado.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesPresuEstado.add(this.jLabelAccionesPresuEstado, this.gridBagConstraintsPresuEstado);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsPresuEstado = new GridBagConstraints();
				this.gridBagConstraintsPresuEstado.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsPresuEstado.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsPresuEstado.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesPresuEstado.add(this.jButtonAbrirOrderByPresuEstado, this.gridBagConstraintsPresuEstado);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsPresuEstado = new GridBagConstraints();
			this.gridBagConstraintsPresuEstado.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsPresuEstado.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPresuEstado.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPresuEstado.add(this.jComboBoxTiposSeleccionarPresuEstado, this.gridBagConstraintsPresuEstado);			
			
			
			/*
			this.gridBagConstraintsPresuEstado = new GridBagConstraints();
			this.gridBagConstraintsPresuEstado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresuEstado.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsPresuEstado.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesPresuEstado.add(this.jCheckBoxSeleccionarTodosPresuEstado, this.gridBagConstraintsPresuEstado);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsPresuEstado = new GridBagConstraints();
			this.gridBagConstraintsPresuEstado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPresuEstado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresuEstado.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPresuEstado.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3PresuEstado.add(this.jCheckBoxSeleccionarTodosPresuEstado, this.gridBagConstraintsPresuEstado);															
				
			this.gridBagConstraintsPresuEstado = new GridBagConstraints();
			this.gridBagConstraintsPresuEstado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPresuEstado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresuEstado.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPresuEstado.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3PresuEstado.add(this.jCheckBoxSeleccionadosPresuEstado, this.gridBagConstraintsPresuEstado);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsPresuEstado = new GridBagConstraints();
			this.gridBagConstraintsPresuEstado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPresuEstado.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPresuEstado.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPresuEstado.add(this.jPanelParametrosAuxiliar3PresuEstado, this.gridBagConstraintsPresuEstado);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsPresuEstado = new GridBagConstraints();
			this.gridBagConstraintsPresuEstado.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPresuEstado.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPresuEstado.add(this.jComboBoxTiposRelacionesPresuEstado, this.gridBagConstraintsPresuEstado);
				
			this.gridBagConstraintsPresuEstado = new GridBagConstraints();
			this.gridBagConstraintsPresuEstado.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPresuEstado.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPresuEstado.add(this.jComboBoxTiposAccionesPresuEstado, this.gridBagConstraintsPresuEstado);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosPresuEstado = new GridBagLayout();

			this.jScrollPanelDatosPresuEstado.setLayout(gridaBagLayoutDatosPresuEstado);
			
			this.gridBagConstraintsPresuEstado = new GridBagConstraints();
			this.gridBagConstraintsPresuEstado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresuEstado.gridy = 0;
			this.gridBagConstraintsPresuEstado.gridx = 0;
			
			this.jScrollPanelDatosPresuEstado.add(this.jTableDatosPresuEstado, this.gridBagConstraintsPresuEstado);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosPresuEstado.setViewportView(this.jTableDatosPresuEstado);
		this.jTableDatosPresuEstado.setFillsViewportHeight(true);
		this.jTableDatosPresuEstado.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesPresuEstado= new GridBagLayout();
		this.jPanelAccionesPresuEstado.setLayout(gridaBagLayoutAccionesPresuEstado);
		
		
		/*	
		this.gridBagConstraintsPresuEstado = new GridBagConstraints();
		this.gridBagConstraintsPresuEstado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPresuEstado.gridy = 0;
		this.gridBagConstraintsPresuEstado.gridx = 0;
			
		this.jPanelAccionesPresuEstado.add(this.jButtonNuevoPresuEstado, this.gridBagConstraintsPresuEstado);
		*/
		int iPosXAccion=0;
		
						
		
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutPresuEstado = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutPresuEstado);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.presuestadoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsPresuEstado = new GridBagConstraints();						
			this.gridBagConstraintsPresuEstado.gridy = iGridyPrincipal++;
			this.gridBagConstraintsPresuEstado.gridx = 0;		
			//this.gridBagConstraintsPresuEstado.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresuEstado.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsPresuEstado.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarPresuEstado, this.gridBagConstraintsPresuEstado);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsPresuEstado = new GridBagConstraints();
		this.gridBagConstraintsPresuEstado.gridy = iGridyPrincipal++;
		this.gridBagConstraintsPresuEstado.gridx = 0;		
		//this.gridBagConstraintsPresuEstado.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPresuEstado.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsPresuEstado.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsPresuEstado);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsPresuEstado = new GridBagConstraints();
		this.gridBagConstraintsPresuEstado.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPresuEstado.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesPresuEstado, this.gridBagConstraintsPresuEstado);								
		
		
		/*
		this.gridBagConstraintsPresuEstado = new GridBagConstraints();
		this.gridBagConstraintsPresuEstado.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPresuEstado.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesPresuEstado, this.gridBagConstraintsPresuEstado);
		*/		
		
		this.gridBagConstraintsPresuEstado = new GridBagConstraints();
		this.gridBagConstraintsPresuEstado.gridy =iGridyPrincipal++;
		this.gridBagConstraintsPresuEstado.gridx =0;
		this.gridBagConstraintsPresuEstado.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsPresuEstado.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosPresuEstado, this.gridBagConstraintsPresuEstado);
				
		
		this.gridBagConstraintsPresuEstado = new GridBagConstraints();
		this.gridBagConstraintsPresuEstado.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPresuEstado.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionPresuEstado, this.gridBagConstraintsPresuEstado);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(PresuEstadoJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosPresuEstado= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosPresuEstado = new GridBagLayout();
			this.jPanelBusquedasParametrosPresuEstado.setLayout(gridaBagLayoutBusquedasParametrosPresuEstado);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralPresuEstado=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralPresuEstado.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPresuEstado.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPresuEstado.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsPresuEstado = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsPresuEstado = new GridBagConstraints();
		this.gridBagConstraintsPresuEstado.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPresuEstado.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposPresuEstado, this.gridBagConstraintsPresuEstado);
			
			
		this.gridBagConstraintsPresuEstado = new GridBagConstraints();
		this.gridBagConstraintsPresuEstado.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPresuEstado.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosPresuEstado, this.gridBagConstraintsPresuEstado);
		
			
		this.gridBagConstraintsPresuEstado = new GridBagConstraints();
		this.gridBagConstraintsPresuEstado.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsPresuEstado.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesPresuEstado, this.gridBagConstraintsPresuEstado);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralPresuEstado;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoPresuEstado() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoPresuEstado = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoPresuEstado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoPresuEstado.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoPresuEstado.setName("jPanelReporteDinamicoPresuEstado"); 
		
		this.jPanelReporteDinamicoPresuEstado.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoPresuEstado.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoPresuEstado.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoPresuEstado.setLayout(gridaBagLayoutReporteDinamicoPresuEstado);
		
		
		this.jInternalFrameReporteDinamicoPresuEstado= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoPresuEstado = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReportePresuEstado= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoPresuEstado.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoPresuEstado.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoPresuEstado.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoPresuEstado.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoPresuEstado.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoPresuEstado.setResizable(true);
	    this.jInternalFrameReporteDinamicoPresuEstado.setClosable(true);
	    this.jInternalFrameReporteDinamicoPresuEstado.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoPresuEstado.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoPresuEstado.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoPresuEstado.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoPresuEstado.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estados"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReportePresuEstado = new JLabelMe();

		this.jLabelColumnasSelectReportePresuEstado.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReportePresuEstado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReportePresuEstado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReportePresuEstado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsPresuEstado = new GridBagConstraints();
		this.gridBagConstraintsPresuEstado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresuEstado.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPresuEstado.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoPresuEstado.add(this.jLabelColumnasSelectReportePresuEstado, this.gridBagConstraintsPresuEstado);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReportePresuEstado = new JList<Reporte>();
		this.jListColumnasSelectReportePresuEstado.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReportePresuEstado.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReportePresuEstado.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReportePresuEstado.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReportePresuEstado.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReportePresuEstado=new JScrollPane(this.jListColumnasSelectReportePresuEstado);
			
			this.jScrollColumnasSelectReportePresuEstado.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReportePresuEstado.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReportePresuEstado.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReportePresuEstado.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsPresuEstado = new GridBagConstraints();
		this.gridBagConstraintsPresuEstado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresuEstado.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPresuEstado.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoPresuEstado.add(this.jListColumnasSelectReportePresuEstado, this.gridBagConstraintsPresuEstado);
		this.jPanelReporteDinamicoPresuEstado.add(this.jScrollColumnasSelectReportePresuEstado, this.gridBagConstraintsPresuEstado);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReportePresuEstado = new JLabelMe();

		this.jLabelRelacionesSelectReportePresuEstado.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReportePresuEstado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReportePresuEstado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReportePresuEstado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReportePresuEstado = new JList<Reporte>();
		this.jListRelacionesSelectReportePresuEstado.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReportePresuEstado.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReportePresuEstado.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReportePresuEstado.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReportePresuEstado.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReportePresuEstado=new JScrollPane(this.jListRelacionesSelectReportePresuEstado);
			
			this.jScrollRelacionesSelectReportePresuEstado.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReportePresuEstado.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReportePresuEstado.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReportePresuEstado.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoPresuEstado = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoPresuEstado = new JComboBoxMe();
		this.jListColumnasValoresGraficoPresuEstado = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoPresuEstado = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoPresuEstado.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoPresuEstado.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoPresuEstado.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoPresuEstado.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoPresuEstado, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoPresuEstado = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoPresuEstado.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoPresuEstado.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoPresuEstado.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoPresuEstado.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoPresuEstado, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoPresuEstado = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoPresuEstado.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoPresuEstado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoPresuEstado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoPresuEstado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsPresuEstado = new GridBagConstraints();
		this.gridBagConstraintsPresuEstado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresuEstado.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPresuEstado.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPresuEstado.add(this.jLabelGenerarExcelReporteDinamicoPresuEstado, this.gridBagConstraintsPresuEstado);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoPresuEstado = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoPresuEstado.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoPresuEstado,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoPresuEstado.setToolTipText("Generar EXCEL"+" "+PresuEstadoConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsPresuEstado = new GridBagConstraints();
		//this.gridBagConstraintsPresuEstado.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsPresuEstado.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsPresuEstado.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoPresuEstado.add(this.jButtonGenerarExcelReporteDinamicoPresuEstado, this.gridBagConstraintsPresuEstado);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsPresuEstado = new GridBagConstraints();
		this.gridBagConstraintsPresuEstado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPresuEstado.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPresuEstado.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPresuEstado.add(this.jComboBoxTiposReportesDinamicoPresuEstado, this.gridBagConstraintsPresuEstado);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoPresuEstado = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoPresuEstado.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoPresuEstado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoPresuEstado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoPresuEstado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsPresuEstado = new GridBagConstraints();
		this.gridBagConstraintsPresuEstado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresuEstado.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPresuEstado.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPresuEstado.add(this.jLabelTiposArchivoReporteDinamicoPresuEstado, this.gridBagConstraintsPresuEstado);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsPresuEstado = new GridBagConstraints();
		this.gridBagConstraintsPresuEstado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPresuEstado.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPresuEstado.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPresuEstado.add(this.jComboBoxTiposArchivosReportesDinamicoPresuEstado, this.gridBagConstraintsPresuEstado);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoPresuEstado = new JButtonMe();
		this.jButtonGenerarReporteDinamicoPresuEstado.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoPresuEstado,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoPresuEstado.setToolTipText("Generar"+" "+PresuEstadoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsPresuEstado = new GridBagConstraints();
		this.gridBagConstraintsPresuEstado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPresuEstado.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPresuEstado.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPresuEstado.add(this.jButtonGenerarReporteDinamicoPresuEstado, this.gridBagConstraintsPresuEstado);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoPresuEstado = new JButtonMe();
		this.jButtonCerrarReporteDinamicoPresuEstado.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoPresuEstado,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoPresuEstado.setToolTipText("Cancelar"+" "+PresuEstadoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsPresuEstado = new GridBagConstraints();
		this.gridBagConstraintsPresuEstado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPresuEstado.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPresuEstado.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPresuEstado.add(this.jButtonCerrarReporteDinamicoPresuEstado, this.gridBagConstraintsPresuEstado);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalPresuEstado = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoPresuEstado= new JScrollPane(jPanelReporteDinamicoPresuEstado,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoPresuEstado.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoPresuEstado.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoPresuEstado.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoPresuEstado.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estados"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsPresuEstado = new GridBagConstraints();
		this.gridBagConstraintsPresuEstado.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsPresuEstado.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsPresuEstado.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoPresuEstado.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoPresuEstado.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalPresuEstado);
		this.jInternalFrameReporteDinamicoPresuEstado.getContentPane().add(this.jScrollPanelReporteDinamicoPresuEstado, this.gridBagConstraintsPresuEstado);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionPresuEstado() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionPresuEstado = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionPresuEstado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionPresuEstado.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionPresuEstado.setName("jPanelImportacionPresuEstado"); 
		
		this.jPanelImportacionPresuEstado.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionPresuEstado.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionPresuEstado.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionPresuEstado.setLayout(gridaBagLayoutImportacionPresuEstado);
		
		
		this.jInternalFrameImportacionPresuEstado= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionPresuEstado= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionPresuEstado = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReportePresuEstado= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionPresuEstado.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionPresuEstado.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionPresuEstado.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionPresuEstado.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionPresuEstado.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionPresuEstado.setResizable(true);
	    this.jInternalFrameImportacionPresuEstado.setClosable(true);
	    this.jInternalFrameImportacionPresuEstado.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionPresuEstado.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionPresuEstado.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionPresuEstado.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionPresuEstado.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionPresuEstado.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionPresuEstado.setResizable(true);
	    this.jInternalFrameImportacionPresuEstado.setClosable(true);
	    this.jInternalFrameImportacionPresuEstado.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionPresuEstado.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionPresuEstado.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionPresuEstado.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionPresuEstado.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estados"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionPresuEstado = new JLabelMe();

		this.jLabelArchivoImportacionPresuEstado.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionPresuEstado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionPresuEstado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionPresuEstado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsPresuEstado = new GridBagConstraints();
		this.gridBagConstraintsPresuEstado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresuEstado.gridy = iPosYImportacion;		
		this.gridBagConstraintsPresuEstado.gridx = iPosXImportacion++;
			
		this.jPanelImportacionPresuEstado.add(this.jLabelArchivoImportacionPresuEstado, this.gridBagConstraintsPresuEstado);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionPresuEstado = new JFileChooser();		
		this.jFileChooserImportacionPresuEstado.setToolTipText("ESCOGER ARCHIVO"+" "+PresuEstadoConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionPresuEstado = new JButtonMe();
		this.jButtonAbrirImportacionPresuEstado.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionPresuEstado,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionPresuEstado.setToolTipText("Generar"+" "+PresuEstadoConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsPresuEstado = new GridBagConstraints();
		this.gridBagConstraintsPresuEstado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPresuEstado.gridy = iPosYImportacion;
		this.gridBagConstraintsPresuEstado.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPresuEstado.add(this.jButtonAbrirImportacionPresuEstado, this.gridBagConstraintsPresuEstado);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionPresuEstado = new JLabelMe();

		this.jLabelPathArchivoImportacionPresuEstado.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionPresuEstado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionPresuEstado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionPresuEstado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsPresuEstado = new GridBagConstraints();
		this.gridBagConstraintsPresuEstado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresuEstado.gridy = iPosYImportacion;		
		this.gridBagConstraintsPresuEstado.gridx = iPosXImportacion++;
			
		this.jPanelImportacionPresuEstado.add(this.jLabelPathArchivoImportacionPresuEstado, this.gridBagConstraintsPresuEstado);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionPresuEstado=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionPresuEstado.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionPresuEstado.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionPresuEstado.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsPresuEstado = new GridBagConstraints();
		this.gridBagConstraintsPresuEstado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPresuEstado.gridy = iPosYImportacion;
		this.gridBagConstraintsPresuEstado.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPresuEstado.add(this.jTextFieldPathArchivoImportacionPresuEstado, this.gridBagConstraintsPresuEstado);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionPresuEstado = new JButtonMe();
		this.jButtonGenerarImportacionPresuEstado.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionPresuEstado,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionPresuEstado.setToolTipText("Generar"+" "+PresuEstadoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsPresuEstado = new GridBagConstraints();
		this.gridBagConstraintsPresuEstado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPresuEstado.gridy = iPosYImportacion;
		this.gridBagConstraintsPresuEstado.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPresuEstado.add(this.jButtonGenerarImportacionPresuEstado, this.gridBagConstraintsPresuEstado);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionPresuEstado = new JButtonMe();
		this.jButtonCerrarImportacionPresuEstado.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionPresuEstado,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionPresuEstado.setToolTipText("Cancelar"+" "+PresuEstadoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsPresuEstado = new GridBagConstraints();
		this.gridBagConstraintsPresuEstado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPresuEstado.gridy = iPosYImportacion;
		this.gridBagConstraintsPresuEstado.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPresuEstado.add(this.jButtonCerrarImportacionPresuEstado, this.gridBagConstraintsPresuEstado);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalPresuEstado = new GridBagLayout();
		
		this.jScrollPanelImportacionPresuEstado= new JScrollPane(jPanelImportacionPresuEstado,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsPresuEstado = new GridBagConstraints();
		this.gridBagConstraintsPresuEstado.gridy =iPosYImportacion;
		this.gridBagConstraintsPresuEstado.gridx =iPosXImportacion;
		this.gridBagConstraintsPresuEstado.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionPresuEstado.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionPresuEstado.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalPresuEstado);
		this.jInternalFrameImportacionPresuEstado.getContentPane().add(this.jScrollPanelImportacionPresuEstado, this.gridBagConstraintsPresuEstado);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByPresuEstado(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByPresuEstado = new JButtonMe();
			this.jButtonAbrirOrderByPresuEstado.setText("Orden");
			this.jButtonAbrirOrderByPresuEstado.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByPresuEstado,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByPresuEstado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByPresuEstado";
			inputMap = this.jButtonAbrirOrderByPresuEstado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByPresuEstado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByPresuEstado"));
		
		
			GridBagLayout gridaBagLayoutOrderByPresuEstado = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByPresuEstado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByPresuEstado.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByPresuEstado.setName("jPanelOrderByPresuEstado"); 
			
			this.jPanelOrderByPresuEstado.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByPresuEstado.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByPresuEstado.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByPresuEstado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByPresuEstado.setLayout(gridaBagLayoutOrderByPresuEstado);
			
			
			this.jTableDatosPresuEstadoOrderBy = new JTableMe();        
			this.jTableDatosPresuEstadoOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosPresuEstadoOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosPresuEstadoOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosPresuEstadoOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosPresuEstadoOrderBy.setViewportView(this.jTableDatosPresuEstadoOrderBy);
			this.jTableDatosPresuEstadoOrderBy.setFillsViewportHeight(true);
			this.jTableDatosPresuEstadoOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByPresuEstado= new OrderByJInternalFrame();
			this.jInternalFrameOrderByPresuEstado= new OrderByJInternalFrame();
			this.jScrollPanelOrderByPresuEstado = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReportePresuEstado= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByPresuEstado.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByPresuEstado.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByPresuEstado.setTitle("Orden");
			this.jInternalFrameOrderByPresuEstado.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByPresuEstado.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByPresuEstado.setResizable(true);
			this.jInternalFrameOrderByPresuEstado.setClosable(true);
			this.jInternalFrameOrderByPresuEstado.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByPresuEstado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByPresuEstado.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByPresuEstado.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByPresuEstado.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByPresuEstado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByPresuEstado.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estados"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsPresuEstado = new GridBagConstraints();
			this.gridBagConstraintsPresuEstado.gridy =iPosYOrderBy++;
			this.gridBagConstraintsPresuEstado.gridx =iPosXOrderBy;
			this.gridBagConstraintsPresuEstado.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsPresuEstado.ipady =150;
				
			this.jPanelOrderByPresuEstado.add(jScrollPanelDatosPresuEstadoOrderBy, this.gridBagConstraintsPresuEstado);//this.jTableDatosPresuEstadoTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByPresuEstado = new JButtonMe();
			this.jButtonCerrarOrderByPresuEstado.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByPresuEstado,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByPresuEstado.setToolTipText("Cancelar"+" "+PresuEstadoConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByPresuEstado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsPresuEstado = new GridBagConstraints();
			this.gridBagConstraintsPresuEstado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresuEstado.gridy = iPosYOrderBy++;
			this.gridBagConstraintsPresuEstado.gridx = iPosXOrderBy;
									
			this.jPanelOrderByPresuEstado.add(this.jButtonCerrarOrderByPresuEstado, this.gridBagConstraintsPresuEstado);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalPresuEstado = new GridBagLayout();
			
			this.jScrollPanelOrderByPresuEstado= new JScrollPane(jPanelOrderByPresuEstado,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsPresuEstado = new GridBagConstraints();
			this.gridBagConstraintsPresuEstado.gridy =iPosYOrderBy;
			this.gridBagConstraintsPresuEstado.gridx =iPosXOrderBy;
			this.gridBagConstraintsPresuEstado.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByPresuEstado.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByPresuEstado.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalPresuEstado);
			
			this.jInternalFrameOrderByPresuEstado.getContentPane().add(this.jScrollPanelOrderByPresuEstado, this.gridBagConstraintsPresuEstado);			
		
		} else {
			this.jButtonAbrirOrderByPresuEstado = new JButtonMe();
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
			&& this.presuestadoSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosPresuEstado.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosPresuEstado.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosPresuEstado.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosPresuEstado.getRowHeight();//PresuEstadoConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.presuestadoSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > PresuEstadoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaPresuEstado.isSelected()) {
					iHeightTable=PresuEstadoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < PresuEstadoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=PresuEstadoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > PresuEstadoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaPresuEstado.isSelected()) {
					iHeightTable=PresuEstadoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < PresuEstadoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=PresuEstadoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosPresuEstado.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosPresuEstado.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosPresuEstado.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosPresuEstado.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosPresuEstado.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosPresuEstado.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByPresuEstado!=null && this.jInternalFrameOrderByPresuEstado.getjTableDatosOrderBy()!=null) {
			//if(!this.presuestadoSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByPresuEstado.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByPresuEstado.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByPresuEstado.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByPresuEstado.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByPresuEstado.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByPresuEstado.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByPresuEstado.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosPresuEstado.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosPresuEstado.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosPresuEstado.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=presuestadoLogic.getPresuEstados().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=presuestados.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<PresuEstado> TraerPresuEstadoBeans(List<PresuEstado> presuestados,ArrayList<Classe> classes)throws Exception {
		try {
			for(PresuEstado presuestado:presuestados) {
					
				if(!(PresuEstadoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || PresuEstadoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					presuestado.setsDetalleGeneralEntityReporte(PresuEstadoConstantesFunciones.getPresuEstadoDescripcion(presuestado));
										
						
					
						
					
				} else  {
							
					//presuestado.setsDetalleGeneralEntityReporte(presuestado.getsDetalleGeneralEntityReporte());
										
				}
				
				//presuestadobeans.add(presuestadobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return presuestados;
    }
	//PARA REPORTES FIN
}
