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
package com.bydan.erp.activosfijos.presentation.swing.jinternalframes;



import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.*;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.auxiliar.*;





//import com.bydan.erp.activosfijos.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.activosfijos.business.entity.*;
import com.bydan.erp.activosfijos.util.ActivosFijosConstantesFunciones;

import com.bydan.erp.activosfijos.business.logic.*;
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
public class ActivosFijosJInternalFrame extends ActivosFijosBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarActivosFijos;
	
	protected JMenuBar jmenuBarActivosFijos;
	
	protected JMenu jmenuActivosFijos;
	protected JMenu jmenuDatosActivosFijos;
	protected JMenu jmenuArchivoActivosFijos;
	protected JMenu jmenuAccionesActivosFijos;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosActivosFijos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutActivosFijos;	
	protected GridBagConstraints gridBagConstraintsActivosFijos;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public ActivosFijosDetalleFormJInternalFrame jInternalFrameDetalleFormActivosFijos;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoActivosFijos;	
	protected ImportacionJInternalFrame jInternalFrameImportacionActivosFijos;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public ActivosFijosSessionBean activosfijosSessionBean;
		
	
	
	
	//protected JDesktopPane jDesktopPane;
	public List<ActivosFijos> activosfijoss;		
	public List<ActivosFijos> activosfijossEliminados;	
	public List<ActivosFijos> activosfijossAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByActivosFijos;		
	protected JButton jButtonAbrirOrderByActivosFijos;
	
	
	//protected JPanel jPanelOrderByActivosFijos;
	//public JScrollPane jScrollPanelOrderByActivosFijos;	
	//protected JButton jButtonCerrarOrderByActivosFijos;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public ActivosFijosLogic activosfijosLogic;
	
	
	
	public JScrollPane jScrollPanelDatosActivosFijos;
	public JScrollPane jScrollPanelDatosEdicionActivosFijos;
	public JScrollPane jScrollPanelDatosGeneralActivosFijos;
    
	
	
	//public JScrollPane jScrollPanelDatosActivosFijosOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoActivosFijos;
	//public JScrollPane jScrollPanelImportacionActivosFijos;
	
	
	
	protected JPanel jPanelAccionesActivosFijos;
	
    protected JPanel jPanelPaginacionActivosFijos;
    protected JPanel jPanelParametrosReportesActivosFijos;
	protected JPanel jPanelParametrosReportesAccionesActivosFijos;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1ActivosFijos;
	protected JPanel jPanelParametrosAuxiliar2ActivosFijos;
	protected JPanel jPanelParametrosAuxiliar3ActivosFijos;
	protected JPanel jPanelParametrosAuxiliar4ActivosFijos;
	//protected JPanel jPanelParametrosAuxiliar5ActivosFijos;
	
	
	
	//protected JPanel jPanelReporteDinamicoActivosFijos;
	//protected JPanel jPanelImportacionActivosFijos;
	
	
	public JTable jTableDatosActivosFijos;
	
	
	
	//public JTable jTableDatosActivosFijosOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoActivosFijos;
	protected JButton jButtonDuplicarActivosFijos;
	protected JButton jButtonCopiarActivosFijos;
	protected JButton jButtonVerFormActivosFijos;
	protected JButton jButtonNuevoRelacionesActivosFijos;
	protected JButton jButtonModificarActivosFijos;
	
    protected JButton jButtonGuardarCambiosTablaActivosFijos;
	protected JButton jButtonCerrarActivosFijos;
	
	
	protected JButton jButtonRecargarInformacionActivosFijos;
	protected JButton jButtonProcesarInformacionActivosFijos;
	
	
	protected JButton jButtonAnterioresActivosFijos;
	protected JButton jButtonSiguientesActivosFijos;
	protected JButton jButtonNuevoGuardarCambiosActivosFijos;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoActivosFijos;
	//protected JButton jButtonCerrarReporteDinamicoActivosFijos;
	//protected JButton jButtonGenerarExcelReporteDinamicoActivosFijos;	
	
	
	
	//protected JButton jButtonAbrirImportacionActivosFijos;
	//protected JButton jButtonGenerarImportacionActivosFijos;
	//protected JButton jButtonCerrarImportacionActivosFijos;
	//protected JFileChooser jFileChooserImportacionActivosFijos;
	//protected File fileImportacionActivosFijos;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarActivosFijos;
	protected JButton jButtonDuplicarToolBarActivosFijos;
	protected JButton jButtonNuevoRelacionesToolBarActivosFijos;
	
	
	public JButton jButtonGuardarCambiosToolBarActivosFijos;
	protected JButton jButtonCopiarToolBarActivosFijos;
	protected JButton jButtonVerFormToolBarActivosFijos;
	public JButton jButtonGuardarCambiosTablaToolBarActivosFijos;
	protected JButton jButtonMostrarOcultarTablaToolBarActivosFijos;
	protected JButton jButtonCerrarToolBarActivosFijos;
	
	protected JButton jButtonRecargarInformacionToolBarActivosFijos;
	protected JButton jButtonProcesarInformacionToolBarActivosFijos;
	protected JButton jButtonAnterioresToolBarActivosFijos;
	protected JButton jButtonSiguientesToolBarActivosFijos;
	protected JButton jButtonNuevoGuardarCambiosToolBarActivosFijos;
	protected JButton jButtonAbrirOrderByToolBarActivosFijos;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoActivosFijos;
	protected JMenuItem jMenuItemDuplicarActivosFijos;
	protected JMenuItem jMenuItemNuevoRelacionesActivosFijos;
	
	
	protected JMenuItem jMenuItemGuardarCambiosActivosFijos;
	protected JMenuItem jMenuItemCopiarActivosFijos;
	protected JMenuItem jMenuItemVerFormActivosFijos;
	protected JMenuItem jMenuItemGuardarCambiosTablaActivosFijos;
	protected JMenuItem jMenuItemCerrarActivosFijos;
	protected JMenuItem jMenuItemDetalleCerrarActivosFijos;
	protected JMenuItem jMenuItemDetalleAbrirOrderByActivosFijos;
	protected JMenuItem jMenuItemDetalleMostarOcultarActivosFijos;
	
	protected JMenuItem jMenuItemRecargarInformacionActivosFijos;
	protected JMenuItem jMenuItemProcesarInformacionActivosFijos;
	protected JMenuItem jMenuItemAnterioresActivosFijos;
	protected JMenuItem jMenuItemSiguientesActivosFijos;
	protected JMenuItem jMenuItemNuevoGuardarCambiosActivosFijos;
	protected JMenuItem jMenuItemAbrirOrderByActivosFijos;
	protected JMenuItem jMenuItemMostrarOcultarActivosFijos;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesActivosFijos;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosActivosFijos;
	protected JCheckBox jCheckBoxSeleccionadosActivosFijos;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaActivosFijos;
	protected JCheckBox jCheckBoxConGraficoReporteActivosFijos;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesActivosFijos;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesActivosFijos;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoActivosFijos;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoActivosFijos;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesActivosFijos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionActivosFijos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesActivosFijos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesActivosFijos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarActivosFijos;
	protected JTextField jTextFieldValorCampoGeneralActivosFijos;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteActivosFijos;
	//public JList<Reporte> jListColumnasSelectReporteActivosFijos;
	//public JScrollPane jScrollColumnasSelectReporteActivosFijos;
	
	//public JLabel jLabelRelacionesSelectReporteActivosFijos;
	//public JList<Reporte> jListRelacionesSelectReporteActivosFijos;
	//public JScrollPane jScrollRelacionesSelectReporteActivosFijos;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoActivosFijos;
	//protected JCheckBox jCheckBoxConGraficoDinamicoActivosFijos;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoActivosFijos;
	//public JLabel jLabelTiposArchivoReporteDinamicoActivosFijos;
	
		
	//public JLabel jLabelArchivoImportacionActivosFijos;	
	//public JLabel jLabelPathArchivoImportacionActivosFijos;
	//protected JTextField jTextFieldPathArchivoImportacionActivosFijos;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoActivosFijos;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoActivosFijos;
	
	//public JLabel jLabelColumnaCategoriaValorActivosFijos;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorActivosFijos;
	
	//public JLabel jLabelColumnasValoresGraficoActivosFijos;
	//public JList<Reporte> jListColumnasValoresGraficoActivosFijos;
	//public JScrollPane jScrollColumnasValoresGraficoActivosFijos;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoActivosFijos;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoActivosFijos;	
	
	
	
	
	
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
	public ActivosFijosJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("ActivosFijos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ActivosFijosJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ActivosFijos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ActivosFijosJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ActivosFijos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ActivosFijosJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ActivosFijos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionActivosFijos)	{
		this.jButtonRecargarInformacionActivosFijos = jButtonRecargarInformacionActivosFijos;
	}
	
	public JButton getjButtonProcesarInformacionActivosFijos() {
		return this.jButtonProcesarInformacionActivosFijos;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionActivosFijos)	{
		this.jButtonProcesarInformacionActivosFijos = jButtonProcesarInformacionActivosFijos;
	}
	
	
	public JButton getjButtonRecargarInformacionActivosFijos() {
		return this.jButtonRecargarInformacionActivosFijos;
	}
	
	
	public List<ActivosFijos> getactivosfijoss() {
		return this.activosfijoss;
	}

	public void setactivosfijoss(List<ActivosFijos> activosfijoss) {
		this.activosfijoss = activosfijoss;
	}
	
	public List<ActivosFijos> getactivosfijossAux() {
		return this.activosfijossAux;
	}

	public void setactivosfijossAux(List<ActivosFijos> activosfijossAux) {
		this.activosfijossAux = activosfijossAux;
	}
	
	public List<ActivosFijos> getactivosfijossEliminados() {
		return this.activosfijossEliminados;
	}

	public void setActivosFijossEliminados(List<ActivosFijos> activosfijossEliminados) {
		this.activosfijossEliminados = activosfijossEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarActivosFijos() {
		return jComboBoxTiposSeleccionarActivosFijos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarActivosFijos(
			JComboBox jComboBoxTiposSeleccionarActivosFijos) {
		this.jComboBoxTiposSeleccionarActivosFijos = jComboBoxTiposSeleccionarActivosFijos;
	}
	
	public void setBorderResaltarTiposSeleccionarActivosFijos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarActivosFijos.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarActivosFijos .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralActivosFijos() {
		return jTextFieldValorCampoGeneralActivosFijos;
	}

	public void setjTextFieldValorCampoGeneralActivosFijos(
			JTextField jTextFieldValorCampoGeneralActivosFijos) {
		this.jTextFieldValorCampoGeneralActivosFijos = jTextFieldValorCampoGeneralActivosFijos;
	}

	public void setBorderResaltarValorCampoGeneralActivosFijos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarActivosFijos.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralActivosFijos .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosActivosFijos() {
		return this.jCheckBoxSeleccionarTodosActivosFijos;
	}

	public void setjCheckBoxSeleccionarTodosActivosFijos(
			JCheckBox jCheckBoxSeleccionarTodosActivosFijos) {
		this.jCheckBoxSeleccionarTodosActivosFijos = jCheckBoxSeleccionarTodosActivosFijos;
	}

	public void setBorderResaltarSeleccionarTodosActivosFijos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarActivosFijos.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosActivosFijos .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosActivosFijos() {
		return this.jCheckBoxSeleccionadosActivosFijos;
	}

	public void setjCheckBoxSeleccionadosActivosFijos(
			JCheckBox jCheckBoxSeleccionadosActivosFijos) {
		this.jCheckBoxSeleccionadosActivosFijos = jCheckBoxSeleccionadosActivosFijos;
	}
	
	public void setBorderResaltarSeleccionadosActivosFijos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarActivosFijos.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosActivosFijos .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesActivosFijos() {
		return this.jComboBoxTiposArchivosReportesActivosFijos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesActivosFijos(
			JComboBox jComboBoxTiposArchivosReportesActivosFijos) {
		this.jComboBoxTiposArchivosReportesActivosFijos = jComboBoxTiposArchivosReportesActivosFijos;
	}

	public void setBorderResaltarTiposArchivosReportesActivosFijos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarActivosFijos.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesActivosFijos .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesActivosFijos() {
		return this.jComboBoxTiposReportesActivosFijos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesActivosFijos(
			JComboBox jComboBoxTiposReportesActivosFijos) {
		this.jComboBoxTiposReportesActivosFijos = jComboBoxTiposReportesActivosFijos;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoActivosFijos() {
	//	return jComboBoxTiposReportesDinamicoActivosFijos;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoActivosFijos(
	//		JComboBox jComboBoxTiposReportesDinamicoActivosFijos) {
	//	this.jComboBoxTiposReportesDinamicoActivosFijos = jComboBoxTiposReportesDinamicoActivosFijos;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoActivosFijos() {
	//	return jComboBoxTiposArchivosReportesDinamicoActivosFijos;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoActivosFijos(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoActivosFijos) {
	//	this.jComboBoxTiposArchivosReportesDinamicoActivosFijos = jComboBoxTiposArchivosReportesDinamicoActivosFijos;
	//}
	
	public void setBorderResaltarTiposReportesActivosFijos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarActivosFijos.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesActivosFijos .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesActivosFijos() {
		return this.jComboBoxTiposGraficosReportesActivosFijos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesActivosFijos(
			JComboBox jComboBoxTiposGraficosReportesActivosFijos) {
		this.jComboBoxTiposGraficosReportesActivosFijos = jComboBoxTiposGraficosReportesActivosFijos;
	}
	
	public void setBorderResaltarTiposGraficosReportesActivosFijos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarActivosFijos.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesActivosFijos .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionActivosFijos() {
		return this.jComboBoxTiposPaginacionActivosFijos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionActivosFijos(
			JComboBox jComboBoxTiposPaginacionActivosFijos) {
		this.jComboBoxTiposPaginacionActivosFijos = jComboBoxTiposPaginacionActivosFijos;
	}
	
	public void setBorderResaltarTiposPaginacionActivosFijos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarActivosFijos.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionActivosFijos .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesActivosFijos() {
		return this.jComboBoxTiposRelacionesActivosFijos;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesActivosFijos() {
		return this.jComboBoxTiposAccionesActivosFijos;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesActivosFijos(
			JComboBox jComboBoxTiposRelacionesActivosFijos) {
		this.jComboBoxTiposRelacionesActivosFijos = jComboBoxTiposRelacionesActivosFijos;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesActivosFijos(
			JComboBox jComboBoxTiposAccionesActivosFijos) {
		this.jComboBoxTiposAccionesActivosFijos = jComboBoxTiposAccionesActivosFijos;
	}
	
	public void setBorderResaltarTiposRelacionesActivosFijos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarActivosFijos.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesActivosFijos .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesActivosFijos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarActivosFijos.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesActivosFijos .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoActivosFijos() {
	//	return jCheckBoxConGraficoDinamicoActivosFijos;
	//}

	//public void setjCheckBoxConGraficoDinamicoActivosFijos(
	//		JCheckBox jCheckBoxConGraficoDinamicoActivosFijos) {
	//	this.jCheckBoxConGraficoDinamicoActivosFijos = jCheckBoxConGraficoDinamicoActivosFijos;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoActivosFijos() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarActivosFijos.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoActivosFijos .setBorder(borderResaltar);		
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
		this.activosfijosSessionBean=new ActivosFijosSessionBean();
		
		this.activosfijosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.activosfijosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.activosfijosSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=ActivosFijosJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=ActivosFijosJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ActivosFijosJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ActivosFijosJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ActivosFijosJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Activos Fijos MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 650) {
			iHeight=650;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.activosfijosSessionBean.getEsGuardarRelacionado()) {
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
		
		ActivosFijosJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("ActivosFijos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarActivosFijos= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarActivosFijos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarActivosFijos,this.jTtoolBarActivosFijos,
							"nuevo","nuevo","Nuevo"+" "+ActivosFijosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarActivosFijos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarActivosFijos,this.jTtoolBarActivosFijos,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarActivosFijos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarActivosFijos,this.jTtoolBarActivosFijos,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+ActivosFijosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarActivosFijos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarActivosFijos,this.jTtoolBarActivosFijos,
							"duplicar","duplicar","Duplicar"+" "+ActivosFijosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarActivosFijos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarActivosFijos,this.jTtoolBarActivosFijos,
							"copiar","copiar","Copiar"+" "+ActivosFijosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarActivosFijos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarActivosFijos,this.jTtoolBarActivosFijos,
							"ver_form","ver_form","Ver"+" "+ActivosFijosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarActivosFijos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarActivosFijos,this.jTtoolBarActivosFijos,
							"recargar","recargar","Recargar"+" "+ActivosFijosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarActivosFijos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarActivosFijos,this.jTtoolBarActivosFijos,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarActivosFijos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarActivosFijos,this.jTtoolBarActivosFijos,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarActivosFijos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarActivosFijos,this.jTtoolBarActivosFijos,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarActivosFijos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarActivosFijos,this.jTtoolBarActivosFijos,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarActivosFijos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarActivosFijos,this.jTtoolBarActivosFijos,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+ActivosFijosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarActivosFijos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarActivosFijos,this.jTtoolBarActivosFijos,
							"cerrar","cerrar","Salir"+" "+ActivosFijosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarActivosFijos=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarActivosFijos;
			
				this.jButtonProcesarInformacionToolBarActivosFijos=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarActivosFijos;
				
		//protected JButton jButtonModificarToolBarActivosFijos;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarActivosFijos=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuActivosFijos=new JMenuMe("General");
		this.jmenuArchivoActivosFijos=new JMenuMe("Archivo");
		this.jmenuAccionesActivosFijos=new JMenuMe("Acciones");
		this.jmenuDatosActivosFijos=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoActivosFijos= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoActivosFijos.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoActivosFijos,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarActivosFijos= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarActivosFijos.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarActivosFijos,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesActivosFijos= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesActivosFijos.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesActivosFijos,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosActivosFijos= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosActivosFijos.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosActivosFijos,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarActivosFijos= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarActivosFijos.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarActivosFijos,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormActivosFijos= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormActivosFijos.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormActivosFijos,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaActivosFijos= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaActivosFijos.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaActivosFijos,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarActivosFijos= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarActivosFijos.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarActivosFijos,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionActivosFijos= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionActivosFijos.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionActivosFijos,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionActivosFijos= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionActivosFijos.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionActivosFijos,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresActivosFijos= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresActivosFijos.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresActivosFijos,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesActivosFijos= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesActivosFijos.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesActivosFijos,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByActivosFijos= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByActivosFijos.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByActivosFijos,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarActivosFijos= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarActivosFijos.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarActivosFijos,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByActivosFijos= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByActivosFijos.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByActivosFijos,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarActivosFijos= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarActivosFijos.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarActivosFijos,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosActivosFijos= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosActivosFijos.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosActivosFijos,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoActivosFijos.add(this.jMenuItemCerrarActivosFijos);
			
			this.jmenuAccionesActivosFijos.add(this.jMenuItemNuevoActivosFijos);
			this.jmenuAccionesActivosFijos.add(this.jMenuItemNuevoGuardarCambiosActivosFijos);
			this.jmenuAccionesActivosFijos.add(this.jMenuItemNuevoRelacionesActivosFijos);
			this.jmenuAccionesActivosFijos.add(this.jMenuItemGuardarCambiosTablaActivosFijos);		
			this.jmenuAccionesActivosFijos.add(this.jMenuItemDuplicarActivosFijos);		
			this.jmenuAccionesActivosFijos.add(this.jMenuItemCopiarActivosFijos);		
			this.jmenuAccionesActivosFijos.add(this.jMenuItemVerFormActivosFijos);		
			
			this.jmenuDatosActivosFijos.add(this.jMenuItemRecargarInformacionActivosFijos);				
			this.jmenuDatosActivosFijos.add(this.jMenuItemAnterioresActivosFijos);				
			this.jmenuDatosActivosFijos.add(this.jMenuItemSiguientesActivosFijos);				
			this.jmenuDatosActivosFijos.add(this.jMenuItemAbrirOrderByActivosFijos);				
			this.jmenuDatosActivosFijos.add(this.jMenuItemMostrarOcultarActivosFijos);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesActivosFijos.add(this.jMenuItemGuardarCambiosActivosFijos);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarActivosFijos.add(this.jmenuArchivoActivosFijos);		
			this.jmenuBarActivosFijos.add(this.jmenuAccionesActivosFijos);		
			this.jmenuBarActivosFijos.add(this.jmenuDatosActivosFijos);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarActivosFijos);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasActivosFijos() {
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
			//this.jInternalFrameDetalleActivosFijos = new ActivosFijosDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Activos Fijos DATOS");
			this.jInternalFrameDetalleFormActivosFijos = new ActivosFijosDetalleFormJInternalFrame(jDesktopPane,this.activosfijosSessionBean.getConGuardarRelaciones(),this.activosfijosSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormActivosFijos = null;//new ActivosFijosDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutActivosFijos= new GridBagLayout();
		
		
		this.jTableDatosActivosFijos = new JTableMe();      
		
		String sToolTipActivosFijos="";
		sToolTipActivosFijos=ActivosFijosConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipActivosFijos+="(ActivosFijos.ActivosFijos)";
		}
		
		if(!this.activosfijosSessionBean.getEsGuardarRelacionado()) {
			sToolTipActivosFijos+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosActivosFijos.setToolTipText(sToolTipActivosFijos);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosActivosFijos);
		this.jTableDatosActivosFijos.setAutoCreateRowSorter(true);
		this.jTableDatosActivosFijos.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosActivosFijos.setRowSelectionAllowed(true);
		this.jTableDatosActivosFijos.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosActivosFijos,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoActivosFijos = new JButtonMe();
		this.jButtonDuplicarActivosFijos = new JButtonMe();
		this.jButtonCopiarActivosFijos = new JButtonMe();
		this.jButtonVerFormActivosFijos = new JButtonMe();
		this.jButtonNuevoRelacionesActivosFijos = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaActivosFijos = new JButtonMe();
		this.jButtonCerrarActivosFijos = new JButtonMe();
		
		this.jScrollPanelDatosActivosFijos = new JScrollPane();   
        this.jScrollPanelDatosGeneralActivosFijos = new JScrollPane();
		
				
		
		
		this.jPanelAccionesActivosFijos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Activos Fijos";
		
		if(!this.activosfijosSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosActivosFijos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Activos Fijoses" + this.sPath));
		} else {
			this.jScrollPanelDatosActivosFijos.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralActivosFijos.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesActivosFijos.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesActivosFijos.setToolTipText("Acciones");
        this.jPanelAccionesActivosFijos.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralActivosFijos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosActivosFijos, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoActivosFijos=new ReporteDinamicoJInternalFrame(ActivosFijosConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoActivosFijos();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionActivosFijos=new ImportacionJInternalFrame(ActivosFijosConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionActivosFijos();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByActivosFijos = new JButtonMe();
		
		this.jButtonAbrirOrderByActivosFijos.setText("Orden");
		this.jButtonAbrirOrderByActivosFijos.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByActivosFijos,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByActivosFijos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByActivosFijos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByActivosFijos=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByActivosFijos,false,this);
			
			//this.cargarOrderByActivosFijos(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByActivosFijos=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByActivosFijos,true,this);
			
			//this.cargarOrderByActivosFijos(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosActivosFijos.setMinimumSize(new Dimension(400,50));//330
		this.jTableDatosActivosFijos.setMaximumSize(new Dimension(400,50));//330
		this.jTableDatosActivosFijos.setPreferredSize(new Dimension(400,50));//330
		
		this.jScrollPanelDatosActivosFijos.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosActivosFijos.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosActivosFijos.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoActivosFijos.setText("Nuevo");
		this.jButtonDuplicarActivosFijos.setText("Duplicar");
		this.jButtonCopiarActivosFijos.setText("Copiar");
		this.jButtonVerFormActivosFijos.setText("Ver");
		this.jButtonNuevoRelacionesActivosFijos.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaActivosFijos.setText("Guardar");
		this.jButtonCerrarActivosFijos.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoActivosFijos,"nuevo_button","Nuevo",this.activosfijosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarActivosFijos,"duplicar_button","Duplicar",this.activosfijosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarActivosFijos,"copiar_button","Copiar",this.activosfijosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormActivosFijos,"ver_form","Ver",this.activosfijosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesActivosFijos,"nuevorelaciones_button","Nuevo Rel",this.activosfijosSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaActivosFijos,"guardarcambiostabla_button","Guardar",this.activosfijosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarActivosFijos,"cerrar_button","Salir",this.activosfijosSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoActivosFijos.setToolTipText("Nuevo"+" "+ActivosFijosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarActivosFijos.setToolTipText("Duplicar"+" "+ActivosFijosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarActivosFijos.setToolTipText("Copiar"+" "+ActivosFijosConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormActivosFijos.setToolTipText("Ver"+" "+ActivosFijosConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesActivosFijos.setToolTipText("Nuevo Rel"+" "+ActivosFijosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaActivosFijos.setToolTipText("Guardar"+" "+ActivosFijosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarActivosFijos.setToolTipText("Salir"+" "+ActivosFijosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoActivosFijos";
		inputMap = this.jButtonNuevoActivosFijos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoActivosFijos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoActivosFijos"));
		
		//DUPLICAR
		sMapKey = "DuplicarActivosFijos";
		inputMap = this.jButtonDuplicarActivosFijos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarActivosFijos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarActivosFijos"));
		
		//COPIAR
		sMapKey = "CopiarActivosFijos";
		inputMap = this.jButtonCopiarActivosFijos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarActivosFijos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarActivosFijos"));
		
		//VEr FORM
		sMapKey = "VerFormActivosFijos";
		inputMap = this.jButtonVerFormActivosFijos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormActivosFijos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormActivosFijos"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesActivosFijos";
		inputMap = this.jButtonNuevoRelacionesActivosFijos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesActivosFijos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesActivosFijos"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarActivosFijos";
		inputMap = this.jButtonModificarActivosFijos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarActivosFijos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarActivosFijos"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarActivosFijos";
		inputMap = this.jButtonCerrarActivosFijos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarActivosFijos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarActivosFijos"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaActivosFijos";
		inputMap = this.jButtonGuardarCambiosTablaActivosFijos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaActivosFijos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaActivosFijos"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesActivosFijos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesActivosFijos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionActivosFijos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1ActivosFijos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2ActivosFijos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3ActivosFijos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4ActivosFijos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5ActivosFijos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesActivosFijos.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesActivosFijos.setName("jPanelParametrosReportesActivosFijos"); 
		
		this.jPanelParametrosReportesAccionesActivosFijos.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesActivosFijos.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesActivosFijos.setName("jPanelParametrosReportesAccionesActivosFijos"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesActivosFijos, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesActivosFijos, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionActivosFijos = new JButtonMe();
		this.jButtonRecargarInformacionActivosFijos.setText("Recargar");
		this.jButtonRecargarInformacionActivosFijos.setToolTipText("Recargar"+" "+ActivosFijosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionActivosFijos,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionActivosFijos = new JButtonMe();
		this.jButtonProcesarInformacionActivosFijos.setText("Procesar");
		this.jButtonProcesarInformacionActivosFijos.setToolTipText("Procesar"+" "+ActivosFijosConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionActivosFijos.setVisible(false);
			
		this.jButtonProcesarInformacionActivosFijos.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionActivosFijos.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionActivosFijos.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesActivosFijos = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesActivosFijos.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesActivosFijos.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesActivosFijos = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesActivosFijos.setText("TIPO");       
		this.jComboBoxTiposReportesActivosFijos.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesActivosFijos = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesActivosFijos.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesActivosFijos.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionActivosFijos = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionActivosFijos.setText("Paginacion");
		this.jComboBoxTiposPaginacionActivosFijos.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesActivosFijos = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesActivosFijos.setText("Accion");
		this.jComboBoxTiposRelacionesActivosFijos.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesActivosFijos = new JComboBoxMe();
		//this.jComboBoxTiposAccionesActivosFijos.setText("Accion");
		this.jComboBoxTiposAccionesActivosFijos.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarActivosFijos = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarActivosFijos.setText("Accion");
		this.jComboBoxTiposSeleccionarActivosFijos.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralActivosFijos=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralActivosFijos.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralActivosFijos.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralActivosFijos.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesActivosFijos = new JLabelMe();
		
		this.jLabelAccionesActivosFijos.setText("Acciones");		
		this.jLabelAccionesActivosFijos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesActivosFijos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesActivosFijos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosActivosFijos = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosActivosFijos.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosActivosFijos.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosActivosFijos = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosActivosFijos.setText("Seleccionados");
		this.jCheckBoxSeleccionadosActivosFijos.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaActivosFijos = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaActivosFijos.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaActivosFijos.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteActivosFijos = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteActivosFijos.setText("Graf.");
		this.jCheckBoxConGraficoReporteActivosFijos.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresActivosFijos = new JButtonMe();
		//this.jButtonAnterioresActivosFijos.setText("<<");
        this.jButtonAnterioresActivosFijos.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresActivosFijos,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesActivosFijos = new JButtonMe();
		//this.jButtonSiguientesActivosFijos.setText(">>");
        this.jButtonSiguientesActivosFijos.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesActivosFijos,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosActivosFijos = new JButtonMe();
		this.jButtonNuevoGuardarCambiosActivosFijos.setText("Nue");
        this.jButtonNuevoGuardarCambiosActivosFijos.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosActivosFijos,"nuevoguardarcambios_button","Nue",this.activosfijosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosActivosFijos";
		inputMap = this.jButtonNuevoGuardarCambiosActivosFijos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosActivosFijos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosActivosFijos"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionActivosFijos";
		inputMap = this.jButtonRecargarInformacionActivosFijos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionActivosFijos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionActivosFijos"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesActivosFijos";
		inputMap = this.jButtonSiguientesActivosFijos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesActivosFijos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesActivosFijos"));
		
		//ANTERIORES		
		sMapKey = "AnterioresActivosFijos";
		inputMap = this.jButtonAnterioresActivosFijos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresActivosFijos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresActivosFijos"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasActivosFijos();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesActivosFijos.setMinimumSize(new Dimension(this.getWidth(),ActivosFijosBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ActivosFijosBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesActivosFijos.setMaximumSize(new Dimension(this.getWidth(),ActivosFijosBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ActivosFijosBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesActivosFijos.setPreferredSize(new Dimension(this.getWidth(),ActivosFijosBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ActivosFijosBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionActivosFijos = new GridBagLayout();

			this.jPanelPaginacionActivosFijos.setLayout(gridaBagLayoutPaginacionActivosFijos);						
			
			this.gridBagConstraintsActivosFijos = new GridBagConstraints();
			this.gridBagConstraintsActivosFijos.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsActivosFijos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsActivosFijos.gridy = 0;
			this.gridBagConstraintsActivosFijos.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionActivosFijos.add(this.jButtonAnterioresActivosFijos, this.gridBagConstraintsActivosFijos);
					
						
			this.gridBagConstraintsActivosFijos = new GridBagConstraints();
			this.gridBagConstraintsActivosFijos.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsActivosFijos.gridy = 0;
			
			this.jPanelPaginacionActivosFijos.add(this.jButtonNuevoGuardarCambiosActivosFijos, this.gridBagConstraintsActivosFijos);
						
			
			this.gridBagConstraintsActivosFijos = new GridBagConstraints();
			this.gridBagConstraintsActivosFijos.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsActivosFijos.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsActivosFijos.gridy = 0;
			this.jPanelPaginacionActivosFijos.add(this.jButtonSiguientesActivosFijos, this.gridBagConstraintsActivosFijos);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsActivosFijos = new GridBagConstraints();
			this.gridBagConstraintsActivosFijos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsActivosFijos.gridy = 1;
			this.gridBagConstraintsActivosFijos.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionActivosFijos.add(this.jButtonNuevoActivosFijos, this.gridBagConstraintsActivosFijos);
						
			
			
			if(!this.activosfijosSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsActivosFijos = new GridBagConstraints();
				this.gridBagConstraintsActivosFijos.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsActivosFijos.gridy = 1;
				this.gridBagConstraintsActivosFijos.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionActivosFijos.add(this.jButtonGuardarCambiosTablaActivosFijos, this.gridBagConstraintsActivosFijos);
			}
			
			
			
			this.gridBagConstraintsActivosFijos = new GridBagConstraints();
			this.gridBagConstraintsActivosFijos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsActivosFijos.gridy = 1;
			this.gridBagConstraintsActivosFijos.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionActivosFijos.add(this.jButtonDuplicarActivosFijos, this.gridBagConstraintsActivosFijos);
			
			this.gridBagConstraintsActivosFijos = new GridBagConstraints();
			this.gridBagConstraintsActivosFijos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsActivosFijos.gridy = 1;
			this.gridBagConstraintsActivosFijos.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionActivosFijos.add(this.jButtonCopiarActivosFijos, this.gridBagConstraintsActivosFijos);
		
			this.gridBagConstraintsActivosFijos = new GridBagConstraints();
			this.gridBagConstraintsActivosFijos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsActivosFijos.gridy = 1;
			this.gridBagConstraintsActivosFijos.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionActivosFijos.add(this.jButtonVerFormActivosFijos, this.gridBagConstraintsActivosFijos);
		
			this.gridBagConstraintsActivosFijos = new GridBagConstraints();
			this.gridBagConstraintsActivosFijos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsActivosFijos.gridy = 1;
			this.gridBagConstraintsActivosFijos.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionActivosFijos.add(this.jButtonCerrarActivosFijos, this.gridBagConstraintsActivosFijos);
		
		
		
		this.jButtonRecargarInformacionActivosFijos.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionActivosFijos.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionActivosFijos.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesActivosFijos.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesActivosFijos.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesActivosFijos.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesActivosFijos.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesActivosFijos.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesActivosFijos.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesActivosFijos.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesActivosFijos.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesActivosFijos.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionActivosFijos.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionActivosFijos.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionActivosFijos.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesActivosFijos.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesActivosFijos.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesActivosFijos.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesActivosFijos.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesActivosFijos.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesActivosFijos.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarActivosFijos.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarActivosFijos.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarActivosFijos.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaActivosFijos.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaActivosFijos.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaActivosFijos.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteActivosFijos.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteActivosFijos.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteActivosFijos.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosActivosFijos.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosActivosFijos.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosActivosFijos.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosActivosFijos.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosActivosFijos.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosActivosFijos.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesActivosFijos = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesActivosFijos = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1ActivosFijos = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2ActivosFijos = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3ActivosFijos = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4ActivosFijos = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesActivosFijos.setLayout(gridaBagParametrosReportesActivosFijos);
			this.jPanelParametrosReportesAccionesActivosFijos.setLayout(gridaBagParametrosReportesAccionesActivosFijos);
			
			
			this.jPanelParametrosAuxiliar1ActivosFijos.setLayout(gridaBagParametrosAuxiliar1ActivosFijos);
			this.jPanelParametrosAuxiliar2ActivosFijos.setLayout(gridaBagParametrosAuxiliar2ActivosFijos);
			this.jPanelParametrosAuxiliar3ActivosFijos.setLayout(gridaBagParametrosAuxiliar3ActivosFijos);
			this.jPanelParametrosAuxiliar4ActivosFijos.setLayout(gridaBagParametrosAuxiliar4ActivosFijos);
			//this.jPanelParametrosAuxiliar5ActivosFijos.setLayout(gridaBagParametrosAuxiliar2ActivosFijos);			
			
			
			
			
			this.gridBagConstraintsActivosFijos = new GridBagConstraints();
			this.gridBagConstraintsActivosFijos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsActivosFijos.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsActivosFijos.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesActivosFijos.add(this.jButtonRecargarInformacionActivosFijos, this.gridBagConstraintsActivosFijos);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsActivosFijos = new GridBagConstraints();
			this.gridBagConstraintsActivosFijos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsActivosFijos.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsActivosFijos.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ActivosFijos.add(this.jComboBoxTiposPaginacionActivosFijos, this.gridBagConstraintsActivosFijos);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsActivosFijos = new GridBagConstraints();
			this.gridBagConstraintsActivosFijos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsActivosFijos.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsActivosFijos.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ActivosFijos.add(this.jCheckBoxConAltoMaximoTablaActivosFijos, this.gridBagConstraintsActivosFijos);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsActivosFijos = new GridBagConstraints();
			this.gridBagConstraintsActivosFijos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsActivosFijos.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsActivosFijos.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ActivosFijos.add(this.jComboBoxTiposArchivosReportesActivosFijos, this.gridBagConstraintsActivosFijos);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsActivosFijos = new GridBagConstraints();
			this.gridBagConstraintsActivosFijos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsActivosFijos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsActivosFijos.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesActivosFijos.add(this.jPanelParametrosAuxiliar1ActivosFijos, this.gridBagConstraintsActivosFijos);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsActivosFijos = new GridBagConstraints();
			this.gridBagConstraintsActivosFijos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsActivosFijos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsActivosFijos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsActivosFijos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4ActivosFijos.add(this.jComboBoxTiposReportesActivosFijos, this.gridBagConstraintsActivosFijos);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsActivosFijos = new GridBagConstraints();
			this.gridBagConstraintsActivosFijos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsActivosFijos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsActivosFijos.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesActivosFijos.add(this.jPanelParametrosAuxiliar4ActivosFijos, this.gridBagConstraintsActivosFijos);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsActivosFijos = new GridBagConstraints();
			this.gridBagConstraintsActivosFijos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsActivosFijos.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsActivosFijos.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesActivosFijos.add(this.jComboBoxTiposReportesActivosFijos, this.gridBagConstraintsActivosFijos);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsActivosFijos = new GridBagConstraints();
			this.gridBagConstraintsActivosFijos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsActivosFijos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsActivosFijos.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesActivosFijos.add(this.jCheckBoxGenerarReporteActivosFijos, this.gridBagConstraintsActivosFijos);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsActivosFijos = new GridBagConstraints();
			this.gridBagConstraintsActivosFijos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsActivosFijos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsActivosFijos.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesActivosFijos.add(this.jPanelParametrosAuxiliar2ActivosFijos, this.gridBagConstraintsActivosFijos);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsActivosFijos = new GridBagConstraints();
			this.gridBagConstraintsActivosFijos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsActivosFijos.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsActivosFijos.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesActivosFijos.add(this.jLabelAccionesActivosFijos, this.gridBagConstraintsActivosFijos);
			*/
			
			//DEJA UN ESPACIO CUANDO ES MODULO, UNO A UNO FK O PROCESO
			 iGridxParametrosReportes++;
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsActivosFijos = new GridBagConstraints();
			this.gridBagConstraintsActivosFijos.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsActivosFijos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsActivosFijos.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesActivosFijos.add(this.jComboBoxTiposSeleccionarActivosFijos, this.gridBagConstraintsActivosFijos);			
			
			
			/*
			this.gridBagConstraintsActivosFijos = new GridBagConstraints();
			this.gridBagConstraintsActivosFijos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsActivosFijos.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsActivosFijos.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesActivosFijos.add(this.jCheckBoxSeleccionarTodosActivosFijos, this.gridBagConstraintsActivosFijos);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsActivosFijos = new GridBagConstraints();
			this.gridBagConstraintsActivosFijos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsActivosFijos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsActivosFijos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsActivosFijos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ActivosFijos.add(this.jCheckBoxSeleccionarTodosActivosFijos, this.gridBagConstraintsActivosFijos);															
				
			this.gridBagConstraintsActivosFijos = new GridBagConstraints();
			this.gridBagConstraintsActivosFijos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsActivosFijos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsActivosFijos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsActivosFijos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ActivosFijos.add(this.jCheckBoxSeleccionadosActivosFijos, this.gridBagConstraintsActivosFijos);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsActivosFijos = new GridBagConstraints();
			this.gridBagConstraintsActivosFijos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsActivosFijos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsActivosFijos.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesActivosFijos.add(this.jPanelParametrosAuxiliar3ActivosFijos, this.gridBagConstraintsActivosFijos);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsActivosFijos = new GridBagConstraints();
			this.gridBagConstraintsActivosFijos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsActivosFijos.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesActivosFijos.add(this.jComboBoxTiposAccionesActivosFijos, this.gridBagConstraintsActivosFijos);
	
				
			this.gridBagConstraintsActivosFijos = new GridBagConstraints();
			this.gridBagConstraintsActivosFijos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsActivosFijos.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesActivosFijos.add(this.jTextFieldValorCampoGeneralActivosFijos, this.gridBagConstraintsActivosFijos);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosActivosFijos = new GridBagLayout();

			this.jScrollPanelDatosActivosFijos.setLayout(gridaBagLayoutDatosActivosFijos);
			
			this.gridBagConstraintsActivosFijos = new GridBagConstraints();
			this.gridBagConstraintsActivosFijos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsActivosFijos.gridy = 0;
			this.gridBagConstraintsActivosFijos.gridx = 0;
			
			this.jScrollPanelDatosActivosFijos.add(this.jTableDatosActivosFijos, this.gridBagConstraintsActivosFijos);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosActivosFijos.setViewportView(this.jTableDatosActivosFijos);
		this.jTableDatosActivosFijos.setFillsViewportHeight(true);
		this.jTableDatosActivosFijos.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesActivosFijos= new GridBagLayout();
		this.jPanelAccionesActivosFijos.setLayout(gridaBagLayoutAccionesActivosFijos);
		
		
		/*	
		this.gridBagConstraintsActivosFijos = new GridBagConstraints();
		this.gridBagConstraintsActivosFijos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsActivosFijos.gridy = 0;
		this.gridBagConstraintsActivosFijos.gridx = 0;
			
		this.jPanelAccionesActivosFijos.add(this.jButtonNuevoActivosFijos, this.gridBagConstraintsActivosFijos);
		*/
		int iPosXAccion=0;
		
						
		
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutActivosFijos = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutActivosFijos);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.activosfijosSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsActivosFijos = new GridBagConstraints();						
			this.gridBagConstraintsActivosFijos.gridy = iGridyPrincipal++;
			this.gridBagConstraintsActivosFijos.gridx = 0;		
			//this.gridBagConstraintsActivosFijos.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsActivosFijos.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsActivosFijos.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarActivosFijos, this.gridBagConstraintsActivosFijos);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsActivosFijos = new GridBagConstraints();
		this.gridBagConstraintsActivosFijos.gridy = iGridyPrincipal++;
		this.gridBagConstraintsActivosFijos.gridx = 0;		
		//this.gridBagConstraintsActivosFijos.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsActivosFijos.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsActivosFijos.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsActivosFijos);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsActivosFijos = new GridBagConstraints();
		this.gridBagConstraintsActivosFijos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsActivosFijos.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesActivosFijos, this.gridBagConstraintsActivosFijos);								
		
		
		/*
		this.gridBagConstraintsActivosFijos = new GridBagConstraints();
		this.gridBagConstraintsActivosFijos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsActivosFijos.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesActivosFijos, this.gridBagConstraintsActivosFijos);
		*/		
		
		this.gridBagConstraintsActivosFijos = new GridBagConstraints();
		this.gridBagConstraintsActivosFijos.gridy =iGridyPrincipal++;
		this.gridBagConstraintsActivosFijos.gridx =0;
		this.gridBagConstraintsActivosFijos.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsActivosFijos.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosActivosFijos, this.gridBagConstraintsActivosFijos);
				
		
		this.gridBagConstraintsActivosFijos = new GridBagConstraints();
		this.gridBagConstraintsActivosFijos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsActivosFijos.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionActivosFijos, this.gridBagConstraintsActivosFijos);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(ActivosFijosJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosActivosFijos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosActivosFijos = new GridBagLayout();
			this.jPanelBusquedasParametrosActivosFijos.setLayout(gridaBagLayoutBusquedasParametrosActivosFijos);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralActivosFijos=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralActivosFijos.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralActivosFijos.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralActivosFijos.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsActivosFijos = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsActivosFijos = new GridBagConstraints();
		this.gridBagConstraintsActivosFijos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsActivosFijos.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposActivosFijos, this.gridBagConstraintsActivosFijos);
			
			
		this.gridBagConstraintsActivosFijos = new GridBagConstraints();
		this.gridBagConstraintsActivosFijos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsActivosFijos.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosActivosFijos, this.gridBagConstraintsActivosFijos);
		
			
		this.gridBagConstraintsActivosFijos = new GridBagConstraints();
		this.gridBagConstraintsActivosFijos.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsActivosFijos.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesActivosFijos, this.gridBagConstraintsActivosFijos);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralActivosFijos;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoActivosFijos() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoActivosFijos = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoActivosFijos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoActivosFijos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoActivosFijos.setName("jPanelReporteDinamicoActivosFijos"); 
		
		this.jPanelReporteDinamicoActivosFijos.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoActivosFijos.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoActivosFijos.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoActivosFijos.setLayout(gridaBagLayoutReporteDinamicoActivosFijos);
		
		
		this.jInternalFrameReporteDinamicoActivosFijos= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoActivosFijos = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteActivosFijos= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoActivosFijos.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoActivosFijos.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoActivosFijos.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoActivosFijos.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoActivosFijos.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoActivosFijos.setResizable(true);
	    this.jInternalFrameReporteDinamicoActivosFijos.setClosable(true);
	    this.jInternalFrameReporteDinamicoActivosFijos.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoActivosFijos.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoActivosFijos.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoActivosFijos.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoActivosFijos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Activos Fijoses"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteActivosFijos = new JLabelMe();

		this.jLabelColumnasSelectReporteActivosFijos.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteActivosFijos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteActivosFijos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteActivosFijos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsActivosFijos = new GridBagConstraints();
		this.gridBagConstraintsActivosFijos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsActivosFijos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsActivosFijos.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoActivosFijos.add(this.jLabelColumnasSelectReporteActivosFijos, this.gridBagConstraintsActivosFijos);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteActivosFijos = new JList<Reporte>();
		this.jListColumnasSelectReporteActivosFijos.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteActivosFijos.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteActivosFijos.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteActivosFijos.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteActivosFijos.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteActivosFijos=new JScrollPane(this.jListColumnasSelectReporteActivosFijos);
			
			this.jScrollColumnasSelectReporteActivosFijos.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteActivosFijos.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteActivosFijos.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteActivosFijos.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsActivosFijos = new GridBagConstraints();
		this.gridBagConstraintsActivosFijos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsActivosFijos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsActivosFijos.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoActivosFijos.add(this.jListColumnasSelectReporteActivosFijos, this.gridBagConstraintsActivosFijos);
		this.jPanelReporteDinamicoActivosFijos.add(this.jScrollColumnasSelectReporteActivosFijos, this.gridBagConstraintsActivosFijos);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteActivosFijos = new JLabelMe();

		this.jLabelRelacionesSelectReporteActivosFijos.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteActivosFijos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteActivosFijos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteActivosFijos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteActivosFijos = new JList<Reporte>();
		this.jListRelacionesSelectReporteActivosFijos.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteActivosFijos.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteActivosFijos.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteActivosFijos.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteActivosFijos.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteActivosFijos=new JScrollPane(this.jListRelacionesSelectReporteActivosFijos);
			
			this.jScrollRelacionesSelectReporteActivosFijos.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteActivosFijos.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteActivosFijos.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteActivosFijos.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoActivosFijos = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoActivosFijos = new JComboBoxMe();
		this.jListColumnasValoresGraficoActivosFijos = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoActivosFijos = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoActivosFijos.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoActivosFijos.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoActivosFijos.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoActivosFijos.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoActivosFijos = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoActivosFijos.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoActivosFijos.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoActivosFijos.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoActivosFijos.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoActivosFijos = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoActivosFijos.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoActivosFijos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoActivosFijos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoActivosFijos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsActivosFijos = new GridBagConstraints();
		this.gridBagConstraintsActivosFijos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsActivosFijos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsActivosFijos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoActivosFijos.add(this.jLabelGenerarExcelReporteDinamicoActivosFijos, this.gridBagConstraintsActivosFijos);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoActivosFijos = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoActivosFijos.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoActivosFijos,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoActivosFijos.setToolTipText("Generar EXCEL"+" "+ActivosFijosConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsActivosFijos = new GridBagConstraints();
		//this.gridBagConstraintsActivosFijos.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsActivosFijos.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsActivosFijos.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoActivosFijos.add(this.jButtonGenerarExcelReporteDinamicoActivosFijos, this.gridBagConstraintsActivosFijos);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsActivosFijos = new GridBagConstraints();
		this.gridBagConstraintsActivosFijos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsActivosFijos.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsActivosFijos.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoActivosFijos.add(this.jComboBoxTiposReportesDinamicoActivosFijos, this.gridBagConstraintsActivosFijos);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoActivosFijos = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoActivosFijos.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoActivosFijos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoActivosFijos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoActivosFijos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsActivosFijos = new GridBagConstraints();
		this.gridBagConstraintsActivosFijos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsActivosFijos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsActivosFijos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoActivosFijos.add(this.jLabelTiposArchivoReporteDinamicoActivosFijos, this.gridBagConstraintsActivosFijos);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsActivosFijos = new GridBagConstraints();
		this.gridBagConstraintsActivosFijos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsActivosFijos.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsActivosFijos.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoActivosFijos.add(this.jComboBoxTiposArchivosReportesDinamicoActivosFijos, this.gridBagConstraintsActivosFijos);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoActivosFijos = new JButtonMe();
		this.jButtonGenerarReporteDinamicoActivosFijos.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoActivosFijos,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoActivosFijos.setToolTipText("Generar"+" "+ActivosFijosConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsActivosFijos = new GridBagConstraints();
		this.gridBagConstraintsActivosFijos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsActivosFijos.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsActivosFijos.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoActivosFijos.add(this.jButtonGenerarReporteDinamicoActivosFijos, this.gridBagConstraintsActivosFijos);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoActivosFijos = new JButtonMe();
		this.jButtonCerrarReporteDinamicoActivosFijos.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoActivosFijos,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoActivosFijos.setToolTipText("Cancelar"+" "+ActivosFijosConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsActivosFijos = new GridBagConstraints();
		this.gridBagConstraintsActivosFijos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsActivosFijos.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsActivosFijos.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoActivosFijos.add(this.jButtonCerrarReporteDinamicoActivosFijos, this.gridBagConstraintsActivosFijos);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalActivosFijos = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoActivosFijos= new JScrollPane(jPanelReporteDinamicoActivosFijos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoActivosFijos.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoActivosFijos.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoActivosFijos.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoActivosFijos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Activos Fijoses"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsActivosFijos = new GridBagConstraints();
		this.gridBagConstraintsActivosFijos.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsActivosFijos.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsActivosFijos.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoActivosFijos.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoActivosFijos.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalActivosFijos);
		this.jInternalFrameReporteDinamicoActivosFijos.getContentPane().add(this.jScrollPanelReporteDinamicoActivosFijos, this.gridBagConstraintsActivosFijos);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionActivosFijos() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionActivosFijos = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionActivosFijos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionActivosFijos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionActivosFijos.setName("jPanelImportacionActivosFijos"); 
		
		this.jPanelImportacionActivosFijos.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionActivosFijos.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionActivosFijos.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionActivosFijos.setLayout(gridaBagLayoutImportacionActivosFijos);
		
		
		this.jInternalFrameImportacionActivosFijos= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionActivosFijos= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionActivosFijos = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteActivosFijos= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionActivosFijos.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionActivosFijos.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionActivosFijos.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionActivosFijos.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionActivosFijos.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionActivosFijos.setResizable(true);
	    this.jInternalFrameImportacionActivosFijos.setClosable(true);
	    this.jInternalFrameImportacionActivosFijos.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionActivosFijos.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionActivosFijos.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionActivosFijos.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionActivosFijos.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionActivosFijos.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionActivosFijos.setResizable(true);
	    this.jInternalFrameImportacionActivosFijos.setClosable(true);
	    this.jInternalFrameImportacionActivosFijos.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionActivosFijos.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionActivosFijos.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionActivosFijos.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionActivosFijos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Activos Fijoses"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionActivosFijos = new JLabelMe();

		this.jLabelArchivoImportacionActivosFijos.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionActivosFijos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionActivosFijos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionActivosFijos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsActivosFijos = new GridBagConstraints();
		this.gridBagConstraintsActivosFijos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsActivosFijos.gridy = iPosYImportacion;		
		this.gridBagConstraintsActivosFijos.gridx = iPosXImportacion++;
			
		this.jPanelImportacionActivosFijos.add(this.jLabelArchivoImportacionActivosFijos, this.gridBagConstraintsActivosFijos);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionActivosFijos = new JFileChooser();		
		this.jFileChooserImportacionActivosFijos.setToolTipText("ESCOGER ARCHIVO"+" "+ActivosFijosConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionActivosFijos = new JButtonMe();
		this.jButtonAbrirImportacionActivosFijos.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionActivosFijos,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionActivosFijos.setToolTipText("Generar"+" "+ActivosFijosConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsActivosFijos = new GridBagConstraints();
		this.gridBagConstraintsActivosFijos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsActivosFijos.gridy = iPosYImportacion;
		this.gridBagConstraintsActivosFijos.gridx = iPosXImportacion++;
							
		this.jPanelImportacionActivosFijos.add(this.jButtonAbrirImportacionActivosFijos, this.gridBagConstraintsActivosFijos);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionActivosFijos = new JLabelMe();

		this.jLabelPathArchivoImportacionActivosFijos.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionActivosFijos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionActivosFijos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionActivosFijos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsActivosFijos = new GridBagConstraints();
		this.gridBagConstraintsActivosFijos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsActivosFijos.gridy = iPosYImportacion;		
		this.gridBagConstraintsActivosFijos.gridx = iPosXImportacion++;
			
		this.jPanelImportacionActivosFijos.add(this.jLabelPathArchivoImportacionActivosFijos, this.gridBagConstraintsActivosFijos);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionActivosFijos=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionActivosFijos.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionActivosFijos.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionActivosFijos.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsActivosFijos = new GridBagConstraints();
		this.gridBagConstraintsActivosFijos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsActivosFijos.gridy = iPosYImportacion;
		this.gridBagConstraintsActivosFijos.gridx = iPosXImportacion++;
							
		this.jPanelImportacionActivosFijos.add(this.jTextFieldPathArchivoImportacionActivosFijos, this.gridBagConstraintsActivosFijos);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionActivosFijos = new JButtonMe();
		this.jButtonGenerarImportacionActivosFijos.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionActivosFijos,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionActivosFijos.setToolTipText("Generar"+" "+ActivosFijosConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsActivosFijos = new GridBagConstraints();
		this.gridBagConstraintsActivosFijos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsActivosFijos.gridy = iPosYImportacion;
		this.gridBagConstraintsActivosFijos.gridx = iPosXImportacion++;
							
		this.jPanelImportacionActivosFijos.add(this.jButtonGenerarImportacionActivosFijos, this.gridBagConstraintsActivosFijos);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionActivosFijos = new JButtonMe();
		this.jButtonCerrarImportacionActivosFijos.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionActivosFijos,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionActivosFijos.setToolTipText("Cancelar"+" "+ActivosFijosConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsActivosFijos = new GridBagConstraints();
		this.gridBagConstraintsActivosFijos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsActivosFijos.gridy = iPosYImportacion;
		this.gridBagConstraintsActivosFijos.gridx = iPosXImportacion++;
							
		this.jPanelImportacionActivosFijos.add(this.jButtonCerrarImportacionActivosFijos, this.gridBagConstraintsActivosFijos);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalActivosFijos = new GridBagLayout();
		
		this.jScrollPanelImportacionActivosFijos= new JScrollPane(jPanelImportacionActivosFijos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsActivosFijos = new GridBagConstraints();
		this.gridBagConstraintsActivosFijos.gridy =iPosYImportacion;
		this.gridBagConstraintsActivosFijos.gridx =iPosXImportacion;
		this.gridBagConstraintsActivosFijos.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionActivosFijos.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionActivosFijos.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalActivosFijos);
		this.jInternalFrameImportacionActivosFijos.getContentPane().add(this.jScrollPanelImportacionActivosFijos, this.gridBagConstraintsActivosFijos);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByActivosFijos(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByActivosFijos = new JButtonMe();
			this.jButtonAbrirOrderByActivosFijos.setText("Orden");
			this.jButtonAbrirOrderByActivosFijos.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByActivosFijos,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByActivosFijos";
			inputMap = this.jButtonAbrirOrderByActivosFijos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByActivosFijos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByActivosFijos"));
		
		
			GridBagLayout gridaBagLayoutOrderByActivosFijos = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByActivosFijos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByActivosFijos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByActivosFijos.setName("jPanelOrderByActivosFijos"); 
			
			this.jPanelOrderByActivosFijos.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByActivosFijos.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByActivosFijos.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByActivosFijos.setLayout(gridaBagLayoutOrderByActivosFijos);
			
			
			this.jTableDatosActivosFijosOrderBy = new JTableMe();        
			this.jTableDatosActivosFijosOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosActivosFijosOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosActivosFijosOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosActivosFijosOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosActivosFijosOrderBy.setViewportView(this.jTableDatosActivosFijosOrderBy);
			this.jTableDatosActivosFijosOrderBy.setFillsViewportHeight(true);
			this.jTableDatosActivosFijosOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByActivosFijos= new OrderByJInternalFrame();
			this.jInternalFrameOrderByActivosFijos= new OrderByJInternalFrame();
			this.jScrollPanelOrderByActivosFijos = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteActivosFijos= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByActivosFijos.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByActivosFijos.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByActivosFijos.setTitle("Orden");
			this.jInternalFrameOrderByActivosFijos.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByActivosFijos.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByActivosFijos.setResizable(true);
			this.jInternalFrameOrderByActivosFijos.setClosable(true);
			this.jInternalFrameOrderByActivosFijos.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByActivosFijos.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByActivosFijos.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByActivosFijos.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByActivosFijos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Activos Fijoses"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsActivosFijos = new GridBagConstraints();
			this.gridBagConstraintsActivosFijos.gridy =iPosYOrderBy++;
			this.gridBagConstraintsActivosFijos.gridx =iPosXOrderBy;
			this.gridBagConstraintsActivosFijos.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsActivosFijos.ipady =150;
				
			this.jPanelOrderByActivosFijos.add(jScrollPanelDatosActivosFijosOrderBy, this.gridBagConstraintsActivosFijos);//this.jTableDatosActivosFijosTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByActivosFijos = new JButtonMe();
			this.jButtonCerrarOrderByActivosFijos.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByActivosFijos,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByActivosFijos.setToolTipText("Cancelar"+" "+ActivosFijosConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsActivosFijos = new GridBagConstraints();
			this.gridBagConstraintsActivosFijos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsActivosFijos.gridy = iPosYOrderBy++;
			this.gridBagConstraintsActivosFijos.gridx = iPosXOrderBy;
									
			this.jPanelOrderByActivosFijos.add(this.jButtonCerrarOrderByActivosFijos, this.gridBagConstraintsActivosFijos);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalActivosFijos = new GridBagLayout();
			
			this.jScrollPanelOrderByActivosFijos= new JScrollPane(jPanelOrderByActivosFijos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsActivosFijos = new GridBagConstraints();
			this.gridBagConstraintsActivosFijos.gridy =iPosYOrderBy;
			this.gridBagConstraintsActivosFijos.gridx =iPosXOrderBy;
			this.gridBagConstraintsActivosFijos.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByActivosFijos.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByActivosFijos.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalActivosFijos);
			
			this.jInternalFrameOrderByActivosFijos.getContentPane().add(this.jScrollPanelOrderByActivosFijos, this.gridBagConstraintsActivosFijos);			
		
		} else {
			this.jButtonAbrirOrderByActivosFijos = new JButtonMe();
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
			&& this.activosfijosSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosActivosFijos.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosActivosFijos.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosActivosFijos.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosActivosFijos.getRowHeight();//ActivosFijosConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.activosfijosSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > ActivosFijosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaActivosFijos.isSelected()) {
					iHeightTable=ActivosFijosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ActivosFijosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ActivosFijosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > ActivosFijosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaActivosFijos.isSelected()) {
					iHeightTable=ActivosFijosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ActivosFijosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ActivosFijosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosActivosFijos.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosActivosFijos.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosActivosFijos.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosActivosFijos.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosActivosFijos.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosActivosFijos.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByActivosFijos!=null && this.jInternalFrameOrderByActivosFijos.getjTableDatosOrderBy()!=null) {
			//if(!this.activosfijosSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByActivosFijos.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByActivosFijos.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByActivosFijos.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByActivosFijos.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByActivosFijos.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByActivosFijos.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByActivosFijos.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosActivosFijos.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosActivosFijos.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosActivosFijos.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=activosfijosLogic.getActivosFijoss().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=activosfijoss.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<ActivosFijos> TraerActivosFijosBeans(List<ActivosFijos> activosfijoss,ArrayList<Classe> classes)throws Exception {
		try {
			for(ActivosFijos activosfijos:activosfijoss) {
					
				if(!(ActivosFijosConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || ActivosFijosConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					activosfijos.setsDetalleGeneralEntityReporte(ActivosFijosConstantesFunciones.getActivosFijosDescripcion(activosfijos));
										
						
					
						
					
				} else  {
							
					//activosfijos.setsDetalleGeneralEntityReporte(activosfijos.getsDetalleGeneralEntityReporte());
										
				}
				
				//activosfijosbeans.add(activosfijosbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return activosfijoss;
    }
	//PARA REPORTES FIN
}
