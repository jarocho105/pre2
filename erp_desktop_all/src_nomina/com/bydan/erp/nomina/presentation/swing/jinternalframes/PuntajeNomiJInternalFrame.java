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
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;

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
import com.bydan.erp.nomina.util.PuntajeNomiConstantesFunciones;

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
public class PuntajeNomiJInternalFrame extends PuntajeNomiBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarPuntajeNomi;
	
	protected JMenuBar jmenuBarPuntajeNomi;
	
	protected JMenu jmenuPuntajeNomi;
	protected JMenu jmenuDatosPuntajeNomi;
	protected JMenu jmenuArchivoPuntajeNomi;
	protected JMenu jmenuAccionesPuntajeNomi;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosPuntajeNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutPuntajeNomi;	
	protected GridBagConstraints gridBagConstraintsPuntajeNomi;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public PuntajeNomiDetalleFormJInternalFrame jInternalFrameDetalleFormPuntajeNomi;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoPuntajeNomi;	
	protected ImportacionJInternalFrame jInternalFrameImportacionPuntajeNomi;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public PuntajeNomiSessionBean puntajenomiSessionBean;
		
	
	
	
	//protected JDesktopPane jDesktopPane;
	public List<PuntajeNomi> puntajenomis;		
	public List<PuntajeNomi> puntajenomisEliminados;	
	public List<PuntajeNomi> puntajenomisAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByPuntajeNomi;		
	protected JButton jButtonAbrirOrderByPuntajeNomi;
	
	
	//protected JPanel jPanelOrderByPuntajeNomi;
	//public JScrollPane jScrollPanelOrderByPuntajeNomi;	
	//protected JButton jButtonCerrarOrderByPuntajeNomi;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public PuntajeNomiLogic puntajenomiLogic;
	
	
	
	public JScrollPane jScrollPanelDatosPuntajeNomi;
	public JScrollPane jScrollPanelDatosEdicionPuntajeNomi;
	public JScrollPane jScrollPanelDatosGeneralPuntajeNomi;
    
	
	
	//public JScrollPane jScrollPanelDatosPuntajeNomiOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoPuntajeNomi;
	//public JScrollPane jScrollPanelImportacionPuntajeNomi;
	
	
	
	protected JPanel jPanelAccionesPuntajeNomi;
	
    protected JPanel jPanelPaginacionPuntajeNomi;
    protected JPanel jPanelParametrosReportesPuntajeNomi;
	protected JPanel jPanelParametrosReportesAccionesPuntajeNomi;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1PuntajeNomi;
	protected JPanel jPanelParametrosAuxiliar2PuntajeNomi;
	protected JPanel jPanelParametrosAuxiliar3PuntajeNomi;
	protected JPanel jPanelParametrosAuxiliar4PuntajeNomi;
	//protected JPanel jPanelParametrosAuxiliar5PuntajeNomi;
	
	
	
	//protected JPanel jPanelReporteDinamicoPuntajeNomi;
	//protected JPanel jPanelImportacionPuntajeNomi;
	
	
	public JTable jTableDatosPuntajeNomi;
	
	
	
	//public JTable jTableDatosPuntajeNomiOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoPuntajeNomi;
	protected JButton jButtonDuplicarPuntajeNomi;
	protected JButton jButtonCopiarPuntajeNomi;
	protected JButton jButtonVerFormPuntajeNomi;
	protected JButton jButtonNuevoRelacionesPuntajeNomi;
	protected JButton jButtonModificarPuntajeNomi;
	
    protected JButton jButtonGuardarCambiosTablaPuntajeNomi;
	protected JButton jButtonCerrarPuntajeNomi;
	
	
	protected JButton jButtonRecargarInformacionPuntajeNomi;
	protected JButton jButtonProcesarInformacionPuntajeNomi;
	
	
	protected JButton jButtonAnterioresPuntajeNomi;
	protected JButton jButtonSiguientesPuntajeNomi;
	protected JButton jButtonNuevoGuardarCambiosPuntajeNomi;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoPuntajeNomi;
	//protected JButton jButtonCerrarReporteDinamicoPuntajeNomi;
	//protected JButton jButtonGenerarExcelReporteDinamicoPuntajeNomi;	
	
	
	
	//protected JButton jButtonAbrirImportacionPuntajeNomi;
	//protected JButton jButtonGenerarImportacionPuntajeNomi;
	//protected JButton jButtonCerrarImportacionPuntajeNomi;
	//protected JFileChooser jFileChooserImportacionPuntajeNomi;
	//protected File fileImportacionPuntajeNomi;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarPuntajeNomi;
	protected JButton jButtonDuplicarToolBarPuntajeNomi;
	protected JButton jButtonNuevoRelacionesToolBarPuntajeNomi;
	
	
	public JButton jButtonGuardarCambiosToolBarPuntajeNomi;
	protected JButton jButtonCopiarToolBarPuntajeNomi;
	protected JButton jButtonVerFormToolBarPuntajeNomi;
	public JButton jButtonGuardarCambiosTablaToolBarPuntajeNomi;
	protected JButton jButtonMostrarOcultarTablaToolBarPuntajeNomi;
	protected JButton jButtonCerrarToolBarPuntajeNomi;
	
	protected JButton jButtonRecargarInformacionToolBarPuntajeNomi;
	protected JButton jButtonProcesarInformacionToolBarPuntajeNomi;
	protected JButton jButtonAnterioresToolBarPuntajeNomi;
	protected JButton jButtonSiguientesToolBarPuntajeNomi;
	protected JButton jButtonNuevoGuardarCambiosToolBarPuntajeNomi;
	protected JButton jButtonAbrirOrderByToolBarPuntajeNomi;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoPuntajeNomi;
	protected JMenuItem jMenuItemDuplicarPuntajeNomi;
	protected JMenuItem jMenuItemNuevoRelacionesPuntajeNomi;
	
	
	protected JMenuItem jMenuItemGuardarCambiosPuntajeNomi;
	protected JMenuItem jMenuItemCopiarPuntajeNomi;
	protected JMenuItem jMenuItemVerFormPuntajeNomi;
	protected JMenuItem jMenuItemGuardarCambiosTablaPuntajeNomi;
	protected JMenuItem jMenuItemCerrarPuntajeNomi;
	protected JMenuItem jMenuItemDetalleCerrarPuntajeNomi;
	protected JMenuItem jMenuItemDetalleAbrirOrderByPuntajeNomi;
	protected JMenuItem jMenuItemDetalleMostarOcultarPuntajeNomi;
	
	protected JMenuItem jMenuItemRecargarInformacionPuntajeNomi;
	protected JMenuItem jMenuItemProcesarInformacionPuntajeNomi;
	protected JMenuItem jMenuItemAnterioresPuntajeNomi;
	protected JMenuItem jMenuItemSiguientesPuntajeNomi;
	protected JMenuItem jMenuItemNuevoGuardarCambiosPuntajeNomi;
	protected JMenuItem jMenuItemAbrirOrderByPuntajeNomi;
	protected JMenuItem jMenuItemMostrarOcultarPuntajeNomi;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesPuntajeNomi;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosPuntajeNomi;
	protected JCheckBox jCheckBoxSeleccionadosPuntajeNomi;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaPuntajeNomi;
	protected JCheckBox jCheckBoxConGraficoReportePuntajeNomi;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesPuntajeNomi;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesPuntajeNomi;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoPuntajeNomi;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoPuntajeNomi;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesPuntajeNomi;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionPuntajeNomi;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesPuntajeNomi;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesPuntajeNomi;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarPuntajeNomi;
	protected JTextField jTextFieldValorCampoGeneralPuntajeNomi;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReportePuntajeNomi;
	//public JList<Reporte> jListColumnasSelectReportePuntajeNomi;
	//public JScrollPane jScrollColumnasSelectReportePuntajeNomi;
	
	//public JLabel jLabelRelacionesSelectReportePuntajeNomi;
	//public JList<Reporte> jListRelacionesSelectReportePuntajeNomi;
	//public JScrollPane jScrollRelacionesSelectReportePuntajeNomi;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoPuntajeNomi;
	//protected JCheckBox jCheckBoxConGraficoDinamicoPuntajeNomi;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoPuntajeNomi;
	//public JLabel jLabelTiposArchivoReporteDinamicoPuntajeNomi;
	
		
	//public JLabel jLabelArchivoImportacionPuntajeNomi;	
	//public JLabel jLabelPathArchivoImportacionPuntajeNomi;
	//protected JTextField jTextFieldPathArchivoImportacionPuntajeNomi;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoPuntajeNomi;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoPuntajeNomi;
	
	//public JLabel jLabelColumnaCategoriaValorPuntajeNomi;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorPuntajeNomi;
	
	//public JLabel jLabelColumnasValoresGraficoPuntajeNomi;
	//public JList<Reporte> jListColumnasValoresGraficoPuntajeNomi;
	//public JScrollPane jScrollColumnasValoresGraficoPuntajeNomi;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoPuntajeNomi;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoPuntajeNomi;	
	
	
	
	
	
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
	public PuntajeNomiJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("PuntajeNomi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PuntajeNomiJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("PuntajeNomi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PuntajeNomiJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("PuntajeNomi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PuntajeNomiJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("PuntajeNomi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionPuntajeNomi)	{
		this.jButtonRecargarInformacionPuntajeNomi = jButtonRecargarInformacionPuntajeNomi;
	}
	
	public JButton getjButtonProcesarInformacionPuntajeNomi() {
		return this.jButtonProcesarInformacionPuntajeNomi;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionPuntajeNomi)	{
		this.jButtonProcesarInformacionPuntajeNomi = jButtonProcesarInformacionPuntajeNomi;
	}
	
	
	public JButton getjButtonRecargarInformacionPuntajeNomi() {
		return this.jButtonRecargarInformacionPuntajeNomi;
	}
	
	
	public List<PuntajeNomi> getpuntajenomis() {
		return this.puntajenomis;
	}

	public void setpuntajenomis(List<PuntajeNomi> puntajenomis) {
		this.puntajenomis = puntajenomis;
	}
	
	public List<PuntajeNomi> getpuntajenomisAux() {
		return this.puntajenomisAux;
	}

	public void setpuntajenomisAux(List<PuntajeNomi> puntajenomisAux) {
		this.puntajenomisAux = puntajenomisAux;
	}
	
	public List<PuntajeNomi> getpuntajenomisEliminados() {
		return this.puntajenomisEliminados;
	}

	public void setPuntajeNomisEliminados(List<PuntajeNomi> puntajenomisEliminados) {
		this.puntajenomisEliminados = puntajenomisEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarPuntajeNomi() {
		return jComboBoxTiposSeleccionarPuntajeNomi;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarPuntajeNomi(
			JComboBox jComboBoxTiposSeleccionarPuntajeNomi) {
		this.jComboBoxTiposSeleccionarPuntajeNomi = jComboBoxTiposSeleccionarPuntajeNomi;
	}
	
	public void setBorderResaltarTiposSeleccionarPuntajeNomi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarPuntajeNomi.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarPuntajeNomi .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralPuntajeNomi() {
		return jTextFieldValorCampoGeneralPuntajeNomi;
	}

	public void setjTextFieldValorCampoGeneralPuntajeNomi(
			JTextField jTextFieldValorCampoGeneralPuntajeNomi) {
		this.jTextFieldValorCampoGeneralPuntajeNomi = jTextFieldValorCampoGeneralPuntajeNomi;
	}

	public void setBorderResaltarValorCampoGeneralPuntajeNomi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPuntajeNomi.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralPuntajeNomi .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosPuntajeNomi() {
		return this.jCheckBoxSeleccionarTodosPuntajeNomi;
	}

	public void setjCheckBoxSeleccionarTodosPuntajeNomi(
			JCheckBox jCheckBoxSeleccionarTodosPuntajeNomi) {
		this.jCheckBoxSeleccionarTodosPuntajeNomi = jCheckBoxSeleccionarTodosPuntajeNomi;
	}

	public void setBorderResaltarSeleccionarTodosPuntajeNomi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPuntajeNomi.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosPuntajeNomi .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosPuntajeNomi() {
		return this.jCheckBoxSeleccionadosPuntajeNomi;
	}

	public void setjCheckBoxSeleccionadosPuntajeNomi(
			JCheckBox jCheckBoxSeleccionadosPuntajeNomi) {
		this.jCheckBoxSeleccionadosPuntajeNomi = jCheckBoxSeleccionadosPuntajeNomi;
	}
	
	public void setBorderResaltarSeleccionadosPuntajeNomi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPuntajeNomi.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosPuntajeNomi .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesPuntajeNomi() {
		return this.jComboBoxTiposArchivosReportesPuntajeNomi;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesPuntajeNomi(
			JComboBox jComboBoxTiposArchivosReportesPuntajeNomi) {
		this.jComboBoxTiposArchivosReportesPuntajeNomi = jComboBoxTiposArchivosReportesPuntajeNomi;
	}

	public void setBorderResaltarTiposArchivosReportesPuntajeNomi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPuntajeNomi.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesPuntajeNomi .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesPuntajeNomi() {
		return this.jComboBoxTiposReportesPuntajeNomi;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesPuntajeNomi(
			JComboBox jComboBoxTiposReportesPuntajeNomi) {
		this.jComboBoxTiposReportesPuntajeNomi = jComboBoxTiposReportesPuntajeNomi;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoPuntajeNomi() {
	//	return jComboBoxTiposReportesDinamicoPuntajeNomi;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoPuntajeNomi(
	//		JComboBox jComboBoxTiposReportesDinamicoPuntajeNomi) {
	//	this.jComboBoxTiposReportesDinamicoPuntajeNomi = jComboBoxTiposReportesDinamicoPuntajeNomi;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoPuntajeNomi() {
	//	return jComboBoxTiposArchivosReportesDinamicoPuntajeNomi;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoPuntajeNomi(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoPuntajeNomi) {
	//	this.jComboBoxTiposArchivosReportesDinamicoPuntajeNomi = jComboBoxTiposArchivosReportesDinamicoPuntajeNomi;
	//}
	
	public void setBorderResaltarTiposReportesPuntajeNomi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPuntajeNomi.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesPuntajeNomi .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesPuntajeNomi() {
		return this.jComboBoxTiposGraficosReportesPuntajeNomi;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesPuntajeNomi(
			JComboBox jComboBoxTiposGraficosReportesPuntajeNomi) {
		this.jComboBoxTiposGraficosReportesPuntajeNomi = jComboBoxTiposGraficosReportesPuntajeNomi;
	}
	
	public void setBorderResaltarTiposGraficosReportesPuntajeNomi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPuntajeNomi.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesPuntajeNomi .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionPuntajeNomi() {
		return this.jComboBoxTiposPaginacionPuntajeNomi;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionPuntajeNomi(
			JComboBox jComboBoxTiposPaginacionPuntajeNomi) {
		this.jComboBoxTiposPaginacionPuntajeNomi = jComboBoxTiposPaginacionPuntajeNomi;
	}
	
	public void setBorderResaltarTiposPaginacionPuntajeNomi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPuntajeNomi.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionPuntajeNomi .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesPuntajeNomi() {
		return this.jComboBoxTiposRelacionesPuntajeNomi;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesPuntajeNomi() {
		return this.jComboBoxTiposAccionesPuntajeNomi;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesPuntajeNomi(
			JComboBox jComboBoxTiposRelacionesPuntajeNomi) {
		this.jComboBoxTiposRelacionesPuntajeNomi = jComboBoxTiposRelacionesPuntajeNomi;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesPuntajeNomi(
			JComboBox jComboBoxTiposAccionesPuntajeNomi) {
		this.jComboBoxTiposAccionesPuntajeNomi = jComboBoxTiposAccionesPuntajeNomi;
	}
	
	public void setBorderResaltarTiposRelacionesPuntajeNomi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPuntajeNomi.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesPuntajeNomi .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesPuntajeNomi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPuntajeNomi.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesPuntajeNomi .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoPuntajeNomi() {
	//	return jCheckBoxConGraficoDinamicoPuntajeNomi;
	//}

	//public void setjCheckBoxConGraficoDinamicoPuntajeNomi(
	//		JCheckBox jCheckBoxConGraficoDinamicoPuntajeNomi) {
	//	this.jCheckBoxConGraficoDinamicoPuntajeNomi = jCheckBoxConGraficoDinamicoPuntajeNomi;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoPuntajeNomi() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarPuntajeNomi.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoPuntajeNomi .setBorder(borderResaltar);		
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
		this.puntajenomiSessionBean=new PuntajeNomiSessionBean();
		
		this.puntajenomiSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.puntajenomiSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.puntajenomiSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=PuntajeNomiJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=PuntajeNomiJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		PuntajeNomiJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		PuntajeNomiJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		PuntajeNomiJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Puntaje Nomi MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 910) {
			iHeight=910;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.puntajenomiSessionBean.getEsGuardarRelacionado()) {
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
		
		PuntajeNomiJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("PuntajeNomi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarPuntajeNomi= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarPuntajeNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarPuntajeNomi,this.jTtoolBarPuntajeNomi,
							"nuevo","nuevo","Nuevo"+" "+PuntajeNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarPuntajeNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarPuntajeNomi,this.jTtoolBarPuntajeNomi,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarPuntajeNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarPuntajeNomi,this.jTtoolBarPuntajeNomi,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+PuntajeNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarPuntajeNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarPuntajeNomi,this.jTtoolBarPuntajeNomi,
							"duplicar","duplicar","Duplicar"+" "+PuntajeNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarPuntajeNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarPuntajeNomi,this.jTtoolBarPuntajeNomi,
							"copiar","copiar","Copiar"+" "+PuntajeNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarPuntajeNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarPuntajeNomi,this.jTtoolBarPuntajeNomi,
							"ver_form","ver_form","Ver"+" "+PuntajeNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarPuntajeNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarPuntajeNomi,this.jTtoolBarPuntajeNomi,
							"recargar","recargar","Recargar"+" "+PuntajeNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarPuntajeNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarPuntajeNomi,this.jTtoolBarPuntajeNomi,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarPuntajeNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarPuntajeNomi,this.jTtoolBarPuntajeNomi,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarPuntajeNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarPuntajeNomi,this.jTtoolBarPuntajeNomi,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarPuntajeNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarPuntajeNomi,this.jTtoolBarPuntajeNomi,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarPuntajeNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarPuntajeNomi,this.jTtoolBarPuntajeNomi,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+PuntajeNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarPuntajeNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarPuntajeNomi,this.jTtoolBarPuntajeNomi,
							"cerrar","cerrar","Salir"+" "+PuntajeNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarPuntajeNomi=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarPuntajeNomi;
			
				this.jButtonProcesarInformacionToolBarPuntajeNomi=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarPuntajeNomi;
				
		//protected JButton jButtonModificarToolBarPuntajeNomi;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarPuntajeNomi=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuPuntajeNomi=new JMenuMe("General");
		this.jmenuArchivoPuntajeNomi=new JMenuMe("Archivo");
		this.jmenuAccionesPuntajeNomi=new JMenuMe("Acciones");
		this.jmenuDatosPuntajeNomi=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoPuntajeNomi= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoPuntajeNomi.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoPuntajeNomi,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoPuntajeNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarPuntajeNomi= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarPuntajeNomi.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarPuntajeNomi,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarPuntajeNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesPuntajeNomi= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesPuntajeNomi.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesPuntajeNomi,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesPuntajeNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosPuntajeNomi= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosPuntajeNomi.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosPuntajeNomi,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosPuntajeNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarPuntajeNomi= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarPuntajeNomi.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarPuntajeNomi,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarPuntajeNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormPuntajeNomi= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormPuntajeNomi.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormPuntajeNomi,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormPuntajeNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaPuntajeNomi= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaPuntajeNomi.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaPuntajeNomi,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaPuntajeNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarPuntajeNomi= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarPuntajeNomi.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarPuntajeNomi,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarPuntajeNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionPuntajeNomi= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionPuntajeNomi.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionPuntajeNomi,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionPuntajeNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionPuntajeNomi= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionPuntajeNomi.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionPuntajeNomi,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresPuntajeNomi= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresPuntajeNomi.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresPuntajeNomi,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresPuntajeNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesPuntajeNomi= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesPuntajeNomi.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesPuntajeNomi,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesPuntajeNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByPuntajeNomi= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByPuntajeNomi.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByPuntajeNomi,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByPuntajeNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarPuntajeNomi= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarPuntajeNomi.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarPuntajeNomi,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarPuntajeNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByPuntajeNomi= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByPuntajeNomi.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByPuntajeNomi,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByPuntajeNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarPuntajeNomi= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarPuntajeNomi.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarPuntajeNomi,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarPuntajeNomi, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosPuntajeNomi= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosPuntajeNomi.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosPuntajeNomi,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosPuntajeNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoPuntajeNomi.add(this.jMenuItemCerrarPuntajeNomi);
			
			this.jmenuAccionesPuntajeNomi.add(this.jMenuItemNuevoPuntajeNomi);
			this.jmenuAccionesPuntajeNomi.add(this.jMenuItemNuevoGuardarCambiosPuntajeNomi);
			this.jmenuAccionesPuntajeNomi.add(this.jMenuItemNuevoRelacionesPuntajeNomi);
			this.jmenuAccionesPuntajeNomi.add(this.jMenuItemGuardarCambiosTablaPuntajeNomi);		
			this.jmenuAccionesPuntajeNomi.add(this.jMenuItemDuplicarPuntajeNomi);		
			this.jmenuAccionesPuntajeNomi.add(this.jMenuItemCopiarPuntajeNomi);		
			this.jmenuAccionesPuntajeNomi.add(this.jMenuItemVerFormPuntajeNomi);		
			
			this.jmenuDatosPuntajeNomi.add(this.jMenuItemRecargarInformacionPuntajeNomi);				
			this.jmenuDatosPuntajeNomi.add(this.jMenuItemAnterioresPuntajeNomi);				
			this.jmenuDatosPuntajeNomi.add(this.jMenuItemSiguientesPuntajeNomi);				
			this.jmenuDatosPuntajeNomi.add(this.jMenuItemAbrirOrderByPuntajeNomi);				
			this.jmenuDatosPuntajeNomi.add(this.jMenuItemMostrarOcultarPuntajeNomi);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesPuntajeNomi.add(this.jMenuItemGuardarCambiosPuntajeNomi);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoPuntajeNomi, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesPuntajeNomi, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosPuntajeNomi, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarPuntajeNomi.add(this.jmenuArchivoPuntajeNomi);		
			this.jmenuBarPuntajeNomi.add(this.jmenuAccionesPuntajeNomi);		
			this.jmenuBarPuntajeNomi.add(this.jmenuDatosPuntajeNomi);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarPuntajeNomi);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasPuntajeNomi() {
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
			//this.jInternalFrameDetallePuntajeNomi = new PuntajeNomiDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Puntaje Nomi DATOS");
			this.jInternalFrameDetalleFormPuntajeNomi = new PuntajeNomiDetalleFormJInternalFrame(jDesktopPane,this.puntajenomiSessionBean.getConGuardarRelaciones(),this.puntajenomiSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormPuntajeNomi = null;//new PuntajeNomiDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutPuntajeNomi= new GridBagLayout();
		
		
		this.jTableDatosPuntajeNomi = new JTableMe();      
		
		String sToolTipPuntajeNomi="";
		sToolTipPuntajeNomi=PuntajeNomiConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipPuntajeNomi+="(Nomina.PuntajeNomi)";
		}
		
		if(!this.puntajenomiSessionBean.getEsGuardarRelacionado()) {
			sToolTipPuntajeNomi+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosPuntajeNomi.setToolTipText(sToolTipPuntajeNomi);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosPuntajeNomi);
		this.jTableDatosPuntajeNomi.setAutoCreateRowSorter(true);
		this.jTableDatosPuntajeNomi.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosPuntajeNomi.setRowSelectionAllowed(true);
		this.jTableDatosPuntajeNomi.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosPuntajeNomi,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoPuntajeNomi = new JButtonMe();
		this.jButtonDuplicarPuntajeNomi = new JButtonMe();
		this.jButtonCopiarPuntajeNomi = new JButtonMe();
		this.jButtonVerFormPuntajeNomi = new JButtonMe();
		this.jButtonNuevoRelacionesPuntajeNomi = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaPuntajeNomi = new JButtonMe();
		this.jButtonCerrarPuntajeNomi = new JButtonMe();
		
		this.jScrollPanelDatosPuntajeNomi = new JScrollPane();   
        this.jScrollPanelDatosGeneralPuntajeNomi = new JScrollPane();
		
				
		
		
		this.jPanelAccionesPuntajeNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Puntaje Nomi";
		
		if(!this.puntajenomiSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosPuntajeNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Puntaje Nomis" + this.sPath));
		} else {
			this.jScrollPanelDatosPuntajeNomi.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralPuntajeNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesPuntajeNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesPuntajeNomi.setToolTipText("Acciones");
        this.jPanelAccionesPuntajeNomi.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralPuntajeNomi, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosPuntajeNomi, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoPuntajeNomi=new ReporteDinamicoJInternalFrame(PuntajeNomiConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoPuntajeNomi();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionPuntajeNomi=new ImportacionJInternalFrame(PuntajeNomiConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionPuntajeNomi();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByPuntajeNomi = new JButtonMe();
		
		this.jButtonAbrirOrderByPuntajeNomi.setText("Orden");
		this.jButtonAbrirOrderByPuntajeNomi.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByPuntajeNomi,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByPuntajeNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByPuntajeNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByPuntajeNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByPuntajeNomi=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPuntajeNomi,false,this);
			
			//this.cargarOrderByPuntajeNomi(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByPuntajeNomi=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPuntajeNomi,true,this);
			
			//this.cargarOrderByPuntajeNomi(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosPuntajeNomi.setMinimumSize(new Dimension(400,50));//330
		this.jTableDatosPuntajeNomi.setMaximumSize(new Dimension(400,50));//330
		this.jTableDatosPuntajeNomi.setPreferredSize(new Dimension(400,50));//330
		
		this.jScrollPanelDatosPuntajeNomi.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosPuntajeNomi.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosPuntajeNomi.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoPuntajeNomi.setText("Nuevo");
		this.jButtonDuplicarPuntajeNomi.setText("Duplicar");
		this.jButtonCopiarPuntajeNomi.setText("Copiar");
		this.jButtonVerFormPuntajeNomi.setText("Ver");
		this.jButtonNuevoRelacionesPuntajeNomi.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaPuntajeNomi.setText("Guardar");
		this.jButtonCerrarPuntajeNomi.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoPuntajeNomi,"nuevo_button","Nuevo",this.puntajenomiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarPuntajeNomi,"duplicar_button","Duplicar",this.puntajenomiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarPuntajeNomi,"copiar_button","Copiar",this.puntajenomiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormPuntajeNomi,"ver_form","Ver",this.puntajenomiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesPuntajeNomi,"nuevorelaciones_button","Nuevo Rel",this.puntajenomiSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaPuntajeNomi,"guardarcambiostabla_button","Guardar",this.puntajenomiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarPuntajeNomi,"cerrar_button","Salir",this.puntajenomiSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoPuntajeNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarPuntajeNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarPuntajeNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormPuntajeNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesPuntajeNomi, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaPuntajeNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarPuntajeNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoPuntajeNomi.setToolTipText("Nuevo"+" "+PuntajeNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarPuntajeNomi.setToolTipText("Duplicar"+" "+PuntajeNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarPuntajeNomi.setToolTipText("Copiar"+" "+PuntajeNomiConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormPuntajeNomi.setToolTipText("Ver"+" "+PuntajeNomiConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesPuntajeNomi.setToolTipText("Nuevo Rel"+" "+PuntajeNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaPuntajeNomi.setToolTipText("Guardar"+" "+PuntajeNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarPuntajeNomi.setToolTipText("Salir"+" "+PuntajeNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoPuntajeNomi";
		inputMap = this.jButtonNuevoPuntajeNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoPuntajeNomi.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoPuntajeNomi"));
		
		//DUPLICAR
		sMapKey = "DuplicarPuntajeNomi";
		inputMap = this.jButtonDuplicarPuntajeNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarPuntajeNomi.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarPuntajeNomi"));
		
		//COPIAR
		sMapKey = "CopiarPuntajeNomi";
		inputMap = this.jButtonCopiarPuntajeNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarPuntajeNomi.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarPuntajeNomi"));
		
		//VEr FORM
		sMapKey = "VerFormPuntajeNomi";
		inputMap = this.jButtonVerFormPuntajeNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormPuntajeNomi.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormPuntajeNomi"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesPuntajeNomi";
		inputMap = this.jButtonNuevoRelacionesPuntajeNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesPuntajeNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesPuntajeNomi"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarPuntajeNomi";
		inputMap = this.jButtonModificarPuntajeNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarPuntajeNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarPuntajeNomi"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarPuntajeNomi";
		inputMap = this.jButtonCerrarPuntajeNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarPuntajeNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarPuntajeNomi"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaPuntajeNomi";
		inputMap = this.jButtonGuardarCambiosTablaPuntajeNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaPuntajeNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaPuntajeNomi"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesPuntajeNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesPuntajeNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionPuntajeNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1PuntajeNomi= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2PuntajeNomi= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3PuntajeNomi= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4PuntajeNomi= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5PuntajeNomi= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesPuntajeNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesPuntajeNomi.setName("jPanelParametrosReportesPuntajeNomi"); 
		
		this.jPanelParametrosReportesAccionesPuntajeNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesPuntajeNomi.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesPuntajeNomi.setName("jPanelParametrosReportesAccionesPuntajeNomi"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesPuntajeNomi, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesPuntajeNomi, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionPuntajeNomi = new JButtonMe();
		this.jButtonRecargarInformacionPuntajeNomi.setText("Recargar");
		this.jButtonRecargarInformacionPuntajeNomi.setToolTipText("Recargar"+" "+PuntajeNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionPuntajeNomi,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionPuntajeNomi = new JButtonMe();
		this.jButtonProcesarInformacionPuntajeNomi.setText("Procesar");
		this.jButtonProcesarInformacionPuntajeNomi.setToolTipText("Procesar"+" "+PuntajeNomiConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionPuntajeNomi.setVisible(false);
			
		this.jButtonProcesarInformacionPuntajeNomi.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionPuntajeNomi.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionPuntajeNomi.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesPuntajeNomi = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesPuntajeNomi.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesPuntajeNomi.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesPuntajeNomi = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesPuntajeNomi.setText("TIPO");       
		this.jComboBoxTiposReportesPuntajeNomi.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesPuntajeNomi = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesPuntajeNomi.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesPuntajeNomi.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionPuntajeNomi = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionPuntajeNomi.setText("Paginacion");
		this.jComboBoxTiposPaginacionPuntajeNomi.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesPuntajeNomi = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesPuntajeNomi.setText("Accion");
		this.jComboBoxTiposRelacionesPuntajeNomi.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesPuntajeNomi = new JComboBoxMe();
		//this.jComboBoxTiposAccionesPuntajeNomi.setText("Accion");
		this.jComboBoxTiposAccionesPuntajeNomi.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarPuntajeNomi = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarPuntajeNomi.setText("Accion");
		this.jComboBoxTiposSeleccionarPuntajeNomi.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralPuntajeNomi=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralPuntajeNomi.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralPuntajeNomi.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralPuntajeNomi.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesPuntajeNomi = new JLabelMe();
		
		this.jLabelAccionesPuntajeNomi.setText("Acciones");		
		this.jLabelAccionesPuntajeNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPuntajeNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPuntajeNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosPuntajeNomi = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosPuntajeNomi.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosPuntajeNomi.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosPuntajeNomi = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosPuntajeNomi.setText("Seleccionados");
		this.jCheckBoxSeleccionadosPuntajeNomi.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaPuntajeNomi = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaPuntajeNomi.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaPuntajeNomi.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReportePuntajeNomi = new JCheckBoxMe();
		this.jCheckBoxConGraficoReportePuntajeNomi.setText("Graf.");
		this.jCheckBoxConGraficoReportePuntajeNomi.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresPuntajeNomi = new JButtonMe();
		//this.jButtonAnterioresPuntajeNomi.setText("<<");
        this.jButtonAnterioresPuntajeNomi.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresPuntajeNomi,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresPuntajeNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesPuntajeNomi = new JButtonMe();
		//this.jButtonSiguientesPuntajeNomi.setText(">>");
        this.jButtonSiguientesPuntajeNomi.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesPuntajeNomi,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesPuntajeNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosPuntajeNomi = new JButtonMe();
		this.jButtonNuevoGuardarCambiosPuntajeNomi.setText("Nue");
        this.jButtonNuevoGuardarCambiosPuntajeNomi.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosPuntajeNomi,"nuevoguardarcambios_button","Nue",this.puntajenomiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosPuntajeNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosPuntajeNomi";
		inputMap = this.jButtonNuevoGuardarCambiosPuntajeNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosPuntajeNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosPuntajeNomi"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionPuntajeNomi";
		inputMap = this.jButtonRecargarInformacionPuntajeNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionPuntajeNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionPuntajeNomi"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesPuntajeNomi";
		inputMap = this.jButtonSiguientesPuntajeNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesPuntajeNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesPuntajeNomi"));
		
		//ANTERIORES		
		sMapKey = "AnterioresPuntajeNomi";
		inputMap = this.jButtonAnterioresPuntajeNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresPuntajeNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresPuntajeNomi"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasPuntajeNomi();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesPuntajeNomi.setMinimumSize(new Dimension(this.getWidth(),PuntajeNomiBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(PuntajeNomiBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesPuntajeNomi.setMaximumSize(new Dimension(this.getWidth(),PuntajeNomiBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(PuntajeNomiBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesPuntajeNomi.setPreferredSize(new Dimension(this.getWidth(),PuntajeNomiBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(PuntajeNomiBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionPuntajeNomi = new GridBagLayout();

			this.jPanelPaginacionPuntajeNomi.setLayout(gridaBagLayoutPaginacionPuntajeNomi);						
			
			this.gridBagConstraintsPuntajeNomi = new GridBagConstraints();
			this.gridBagConstraintsPuntajeNomi.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsPuntajeNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPuntajeNomi.gridy = 0;
			this.gridBagConstraintsPuntajeNomi.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionPuntajeNomi.add(this.jButtonAnterioresPuntajeNomi, this.gridBagConstraintsPuntajeNomi);
					
						
			this.gridBagConstraintsPuntajeNomi = new GridBagConstraints();
			this.gridBagConstraintsPuntajeNomi.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsPuntajeNomi.gridy = 0;
			
			this.jPanelPaginacionPuntajeNomi.add(this.jButtonNuevoGuardarCambiosPuntajeNomi, this.gridBagConstraintsPuntajeNomi);
						
			
			this.gridBagConstraintsPuntajeNomi = new GridBagConstraints();
			this.gridBagConstraintsPuntajeNomi.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsPuntajeNomi.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsPuntajeNomi.gridy = 0;
			this.jPanelPaginacionPuntajeNomi.add(this.jButtonSiguientesPuntajeNomi, this.gridBagConstraintsPuntajeNomi);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsPuntajeNomi = new GridBagConstraints();
			this.gridBagConstraintsPuntajeNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPuntajeNomi.gridy = 1;
			this.gridBagConstraintsPuntajeNomi.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionPuntajeNomi.add(this.jButtonNuevoPuntajeNomi, this.gridBagConstraintsPuntajeNomi);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsPuntajeNomi = new GridBagConstraints();
				this.gridBagConstraintsPuntajeNomi.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsPuntajeNomi.gridy = 1;
				this.gridBagConstraintsPuntajeNomi.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionPuntajeNomi.add(this.jButtonNuevoRelacionesPuntajeNomi, this.gridBagConstraintsPuntajeNomi);
			}
			
			
			if(!this.puntajenomiSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsPuntajeNomi = new GridBagConstraints();
				this.gridBagConstraintsPuntajeNomi.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsPuntajeNomi.gridy = 1;
				this.gridBagConstraintsPuntajeNomi.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionPuntajeNomi.add(this.jButtonGuardarCambiosTablaPuntajeNomi, this.gridBagConstraintsPuntajeNomi);
			}
			
			
			
			this.gridBagConstraintsPuntajeNomi = new GridBagConstraints();
			this.gridBagConstraintsPuntajeNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPuntajeNomi.gridy = 1;
			this.gridBagConstraintsPuntajeNomi.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionPuntajeNomi.add(this.jButtonDuplicarPuntajeNomi, this.gridBagConstraintsPuntajeNomi);
			
			this.gridBagConstraintsPuntajeNomi = new GridBagConstraints();
			this.gridBagConstraintsPuntajeNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPuntajeNomi.gridy = 1;
			this.gridBagConstraintsPuntajeNomi.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionPuntajeNomi.add(this.jButtonCopiarPuntajeNomi, this.gridBagConstraintsPuntajeNomi);
		
			this.gridBagConstraintsPuntajeNomi = new GridBagConstraints();
			this.gridBagConstraintsPuntajeNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPuntajeNomi.gridy = 1;
			this.gridBagConstraintsPuntajeNomi.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionPuntajeNomi.add(this.jButtonVerFormPuntajeNomi, this.gridBagConstraintsPuntajeNomi);
		
			this.gridBagConstraintsPuntajeNomi = new GridBagConstraints();
			this.gridBagConstraintsPuntajeNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPuntajeNomi.gridy = 1;
			this.gridBagConstraintsPuntajeNomi.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionPuntajeNomi.add(this.jButtonCerrarPuntajeNomi, this.gridBagConstraintsPuntajeNomi);
		
		
		
		this.jButtonRecargarInformacionPuntajeNomi.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionPuntajeNomi.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionPuntajeNomi.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionPuntajeNomi, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesPuntajeNomi.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesPuntajeNomi.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesPuntajeNomi.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesPuntajeNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesPuntajeNomi.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesPuntajeNomi.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesPuntajeNomi.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesPuntajeNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesPuntajeNomi.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesPuntajeNomi.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesPuntajeNomi.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesPuntajeNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionPuntajeNomi.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionPuntajeNomi.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionPuntajeNomi.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionPuntajeNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesPuntajeNomi.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesPuntajeNomi.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesPuntajeNomi.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesPuntajeNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesPuntajeNomi.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPuntajeNomi.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPuntajeNomi.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesPuntajeNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarPuntajeNomi.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarPuntajeNomi.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarPuntajeNomi.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarPuntajeNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaPuntajeNomi.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaPuntajeNomi.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaPuntajeNomi.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaPuntajeNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReportePuntajeNomi.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReportePuntajeNomi.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReportePuntajeNomi.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReportePuntajeNomi, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosPuntajeNomi.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosPuntajeNomi.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosPuntajeNomi.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosPuntajeNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosPuntajeNomi.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosPuntajeNomi.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosPuntajeNomi.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosPuntajeNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesPuntajeNomi = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesPuntajeNomi = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1PuntajeNomi = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2PuntajeNomi = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3PuntajeNomi = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4PuntajeNomi = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesPuntajeNomi.setLayout(gridaBagParametrosReportesPuntajeNomi);
			this.jPanelParametrosReportesAccionesPuntajeNomi.setLayout(gridaBagParametrosReportesAccionesPuntajeNomi);
			
			
			this.jPanelParametrosAuxiliar1PuntajeNomi.setLayout(gridaBagParametrosAuxiliar1PuntajeNomi);
			this.jPanelParametrosAuxiliar2PuntajeNomi.setLayout(gridaBagParametrosAuxiliar2PuntajeNomi);
			this.jPanelParametrosAuxiliar3PuntajeNomi.setLayout(gridaBagParametrosAuxiliar3PuntajeNomi);
			this.jPanelParametrosAuxiliar4PuntajeNomi.setLayout(gridaBagParametrosAuxiliar4PuntajeNomi);
			//this.jPanelParametrosAuxiliar5PuntajeNomi.setLayout(gridaBagParametrosAuxiliar2PuntajeNomi);			
			
			
			
			
			this.gridBagConstraintsPuntajeNomi = new GridBagConstraints();
			this.gridBagConstraintsPuntajeNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPuntajeNomi.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsPuntajeNomi.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPuntajeNomi.add(this.jButtonRecargarInformacionPuntajeNomi, this.gridBagConstraintsPuntajeNomi);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsPuntajeNomi = new GridBagConstraints();
			this.gridBagConstraintsPuntajeNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPuntajeNomi.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsPuntajeNomi.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1PuntajeNomi.add(this.jComboBoxTiposPaginacionPuntajeNomi, this.gridBagConstraintsPuntajeNomi);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsPuntajeNomi = new GridBagConstraints();
			this.gridBagConstraintsPuntajeNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPuntajeNomi.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsPuntajeNomi.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1PuntajeNomi.add(this.jCheckBoxConAltoMaximoTablaPuntajeNomi, this.gridBagConstraintsPuntajeNomi);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsPuntajeNomi = new GridBagConstraints();
			this.gridBagConstraintsPuntajeNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPuntajeNomi.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsPuntajeNomi.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1PuntajeNomi.add(this.jComboBoxTiposArchivosReportesPuntajeNomi, this.gridBagConstraintsPuntajeNomi);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsPuntajeNomi = new GridBagConstraints();
			this.gridBagConstraintsPuntajeNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPuntajeNomi.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPuntajeNomi.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPuntajeNomi.add(this.jPanelParametrosAuxiliar1PuntajeNomi, this.gridBagConstraintsPuntajeNomi);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsPuntajeNomi = new GridBagConstraints();
			this.gridBagConstraintsPuntajeNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPuntajeNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPuntajeNomi.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPuntajeNomi.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4PuntajeNomi.add(this.jComboBoxTiposReportesPuntajeNomi, this.gridBagConstraintsPuntajeNomi);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsPuntajeNomi = new GridBagConstraints();
			this.gridBagConstraintsPuntajeNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPuntajeNomi.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPuntajeNomi.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPuntajeNomi.add(this.jPanelParametrosAuxiliar4PuntajeNomi, this.gridBagConstraintsPuntajeNomi);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsPuntajeNomi = new GridBagConstraints();
			this.gridBagConstraintsPuntajeNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPuntajeNomi.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsPuntajeNomi.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPuntajeNomi.add(this.jComboBoxTiposReportesPuntajeNomi, this.gridBagConstraintsPuntajeNomi);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsPuntajeNomi = new GridBagConstraints();
			this.gridBagConstraintsPuntajeNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPuntajeNomi.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPuntajeNomi.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesPuntajeNomi.add(this.jCheckBoxGenerarReportePuntajeNomi, this.gridBagConstraintsPuntajeNomi);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsPuntajeNomi = new GridBagConstraints();
			this.gridBagConstraintsPuntajeNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPuntajeNomi.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPuntajeNomi.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPuntajeNomi.add(this.jPanelParametrosAuxiliar2PuntajeNomi, this.gridBagConstraintsPuntajeNomi);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsPuntajeNomi = new GridBagConstraints();
			this.gridBagConstraintsPuntajeNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPuntajeNomi.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsPuntajeNomi.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesPuntajeNomi.add(this.jLabelAccionesPuntajeNomi, this.gridBagConstraintsPuntajeNomi);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsPuntajeNomi = new GridBagConstraints();
				this.gridBagConstraintsPuntajeNomi.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsPuntajeNomi.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsPuntajeNomi.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesPuntajeNomi.add(this.jButtonAbrirOrderByPuntajeNomi, this.gridBagConstraintsPuntajeNomi);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsPuntajeNomi = new GridBagConstraints();
			this.gridBagConstraintsPuntajeNomi.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsPuntajeNomi.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPuntajeNomi.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPuntajeNomi.add(this.jComboBoxTiposSeleccionarPuntajeNomi, this.gridBagConstraintsPuntajeNomi);			
			
			
			/*
			this.gridBagConstraintsPuntajeNomi = new GridBagConstraints();
			this.gridBagConstraintsPuntajeNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPuntajeNomi.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsPuntajeNomi.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesPuntajeNomi.add(this.jCheckBoxSeleccionarTodosPuntajeNomi, this.gridBagConstraintsPuntajeNomi);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsPuntajeNomi = new GridBagConstraints();
			this.gridBagConstraintsPuntajeNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPuntajeNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPuntajeNomi.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPuntajeNomi.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3PuntajeNomi.add(this.jCheckBoxSeleccionarTodosPuntajeNomi, this.gridBagConstraintsPuntajeNomi);															
				
			this.gridBagConstraintsPuntajeNomi = new GridBagConstraints();
			this.gridBagConstraintsPuntajeNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPuntajeNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPuntajeNomi.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPuntajeNomi.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3PuntajeNomi.add(this.jCheckBoxSeleccionadosPuntajeNomi, this.gridBagConstraintsPuntajeNomi);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsPuntajeNomi = new GridBagConstraints();
			this.gridBagConstraintsPuntajeNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPuntajeNomi.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPuntajeNomi.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPuntajeNomi.add(this.jPanelParametrosAuxiliar3PuntajeNomi, this.gridBagConstraintsPuntajeNomi);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsPuntajeNomi = new GridBagConstraints();
			this.gridBagConstraintsPuntajeNomi.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPuntajeNomi.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPuntajeNomi.add(this.jComboBoxTiposRelacionesPuntajeNomi, this.gridBagConstraintsPuntajeNomi);
				
			this.gridBagConstraintsPuntajeNomi = new GridBagConstraints();
			this.gridBagConstraintsPuntajeNomi.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPuntajeNomi.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPuntajeNomi.add(this.jComboBoxTiposAccionesPuntajeNomi, this.gridBagConstraintsPuntajeNomi);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosPuntajeNomi = new GridBagLayout();

			this.jScrollPanelDatosPuntajeNomi.setLayout(gridaBagLayoutDatosPuntajeNomi);
			
			this.gridBagConstraintsPuntajeNomi = new GridBagConstraints();
			this.gridBagConstraintsPuntajeNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPuntajeNomi.gridy = 0;
			this.gridBagConstraintsPuntajeNomi.gridx = 0;
			
			this.jScrollPanelDatosPuntajeNomi.add(this.jTableDatosPuntajeNomi, this.gridBagConstraintsPuntajeNomi);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosPuntajeNomi.setViewportView(this.jTableDatosPuntajeNomi);
		this.jTableDatosPuntajeNomi.setFillsViewportHeight(true);
		this.jTableDatosPuntajeNomi.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesPuntajeNomi= new GridBagLayout();
		this.jPanelAccionesPuntajeNomi.setLayout(gridaBagLayoutAccionesPuntajeNomi);
		
		
		/*	
		this.gridBagConstraintsPuntajeNomi = new GridBagConstraints();
		this.gridBagConstraintsPuntajeNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPuntajeNomi.gridy = 0;
		this.gridBagConstraintsPuntajeNomi.gridx = 0;
			
		this.jPanelAccionesPuntajeNomi.add(this.jButtonNuevoPuntajeNomi, this.gridBagConstraintsPuntajeNomi);
		*/
		int iPosXAccion=0;
		
						
		
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutPuntajeNomi = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutPuntajeNomi);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.puntajenomiSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsPuntajeNomi = new GridBagConstraints();						
			this.gridBagConstraintsPuntajeNomi.gridy = iGridyPrincipal++;
			this.gridBagConstraintsPuntajeNomi.gridx = 0;		
			//this.gridBagConstraintsPuntajeNomi.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPuntajeNomi.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsPuntajeNomi.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarPuntajeNomi, this.gridBagConstraintsPuntajeNomi);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsPuntajeNomi = new GridBagConstraints();
		this.gridBagConstraintsPuntajeNomi.gridy = iGridyPrincipal++;
		this.gridBagConstraintsPuntajeNomi.gridx = 0;		
		//this.gridBagConstraintsPuntajeNomi.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPuntajeNomi.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsPuntajeNomi.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsPuntajeNomi);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsPuntajeNomi = new GridBagConstraints();
		this.gridBagConstraintsPuntajeNomi.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPuntajeNomi.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesPuntajeNomi, this.gridBagConstraintsPuntajeNomi);								
		
		
		/*
		this.gridBagConstraintsPuntajeNomi = new GridBagConstraints();
		this.gridBagConstraintsPuntajeNomi.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPuntajeNomi.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesPuntajeNomi, this.gridBagConstraintsPuntajeNomi);
		*/		
		
		this.gridBagConstraintsPuntajeNomi = new GridBagConstraints();
		this.gridBagConstraintsPuntajeNomi.gridy =iGridyPrincipal++;
		this.gridBagConstraintsPuntajeNomi.gridx =0;
		this.gridBagConstraintsPuntajeNomi.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsPuntajeNomi.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosPuntajeNomi, this.gridBagConstraintsPuntajeNomi);
				
		
		this.gridBagConstraintsPuntajeNomi = new GridBagConstraints();
		this.gridBagConstraintsPuntajeNomi.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPuntajeNomi.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionPuntajeNomi, this.gridBagConstraintsPuntajeNomi);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(PuntajeNomiJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosPuntajeNomi= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosPuntajeNomi = new GridBagLayout();
			this.jPanelBusquedasParametrosPuntajeNomi.setLayout(gridaBagLayoutBusquedasParametrosPuntajeNomi);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralPuntajeNomi=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralPuntajeNomi.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPuntajeNomi.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPuntajeNomi.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsPuntajeNomi = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsPuntajeNomi = new GridBagConstraints();
		this.gridBagConstraintsPuntajeNomi.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPuntajeNomi.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposPuntajeNomi, this.gridBagConstraintsPuntajeNomi);
			
			
		this.gridBagConstraintsPuntajeNomi = new GridBagConstraints();
		this.gridBagConstraintsPuntajeNomi.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPuntajeNomi.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosPuntajeNomi, this.gridBagConstraintsPuntajeNomi);
		
			
		this.gridBagConstraintsPuntajeNomi = new GridBagConstraints();
		this.gridBagConstraintsPuntajeNomi.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsPuntajeNomi.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesPuntajeNomi, this.gridBagConstraintsPuntajeNomi);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralPuntajeNomi;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoPuntajeNomi() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoPuntajeNomi = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoPuntajeNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoPuntajeNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoPuntajeNomi.setName("jPanelReporteDinamicoPuntajeNomi"); 
		
		this.jPanelReporteDinamicoPuntajeNomi.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoPuntajeNomi.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoPuntajeNomi.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoPuntajeNomi.setLayout(gridaBagLayoutReporteDinamicoPuntajeNomi);
		
		
		this.jInternalFrameReporteDinamicoPuntajeNomi= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoPuntajeNomi = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReportePuntajeNomi= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoPuntajeNomi.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoPuntajeNomi.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoPuntajeNomi.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoPuntajeNomi.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoPuntajeNomi.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoPuntajeNomi.setResizable(true);
	    this.jInternalFrameReporteDinamicoPuntajeNomi.setClosable(true);
	    this.jInternalFrameReporteDinamicoPuntajeNomi.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoPuntajeNomi.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoPuntajeNomi.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoPuntajeNomi.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoPuntajeNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Puntaje Nomis"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReportePuntajeNomi = new JLabelMe();

		this.jLabelColumnasSelectReportePuntajeNomi.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReportePuntajeNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReportePuntajeNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReportePuntajeNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsPuntajeNomi = new GridBagConstraints();
		this.gridBagConstraintsPuntajeNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPuntajeNomi.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPuntajeNomi.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoPuntajeNomi.add(this.jLabelColumnasSelectReportePuntajeNomi, this.gridBagConstraintsPuntajeNomi);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReportePuntajeNomi = new JList<Reporte>();
		this.jListColumnasSelectReportePuntajeNomi.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReportePuntajeNomi.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReportePuntajeNomi.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReportePuntajeNomi.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReportePuntajeNomi.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReportePuntajeNomi=new JScrollPane(this.jListColumnasSelectReportePuntajeNomi);
			
			this.jScrollColumnasSelectReportePuntajeNomi.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReportePuntajeNomi.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReportePuntajeNomi.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReportePuntajeNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsPuntajeNomi = new GridBagConstraints();
		this.gridBagConstraintsPuntajeNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPuntajeNomi.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPuntajeNomi.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoPuntajeNomi.add(this.jListColumnasSelectReportePuntajeNomi, this.gridBagConstraintsPuntajeNomi);
		this.jPanelReporteDinamicoPuntajeNomi.add(this.jScrollColumnasSelectReportePuntajeNomi, this.gridBagConstraintsPuntajeNomi);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReportePuntajeNomi = new JLabelMe();

		this.jLabelRelacionesSelectReportePuntajeNomi.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReportePuntajeNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReportePuntajeNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReportePuntajeNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsPuntajeNomi = new GridBagConstraints();
		this.gridBagConstraintsPuntajeNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPuntajeNomi.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPuntajeNomi.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoPuntajeNomi.add(this.jLabelRelacionesSelectReportePuntajeNomi, this.gridBagConstraintsPuntajeNomi);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReportePuntajeNomi = new JList<Reporte>();
		this.jListRelacionesSelectReportePuntajeNomi.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReportePuntajeNomi.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReportePuntajeNomi.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReportePuntajeNomi.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReportePuntajeNomi.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReportePuntajeNomi=new JScrollPane(this.jListRelacionesSelectReportePuntajeNomi);
			
			this.jScrollRelacionesSelectReportePuntajeNomi.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReportePuntajeNomi.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReportePuntajeNomi.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReportePuntajeNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsPuntajeNomi = new GridBagConstraints();
		this.gridBagConstraintsPuntajeNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPuntajeNomi.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPuntajeNomi.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoPuntajeNomi.add(this.jListRelacionesSelectReportePuntajeNomi, this.gridBagConstraintsPuntajeNomi);
		this.jPanelReporteDinamicoPuntajeNomi.add(this.jScrollRelacionesSelectReportePuntajeNomi, this.gridBagConstraintsPuntajeNomi);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoPuntajeNomi = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoPuntajeNomi = new JComboBoxMe();
		this.jListColumnasValoresGraficoPuntajeNomi = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoPuntajeNomi = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoPuntajeNomi.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoPuntajeNomi.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoPuntajeNomi.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoPuntajeNomi.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoPuntajeNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoPuntajeNomi = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoPuntajeNomi.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoPuntajeNomi.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoPuntajeNomi.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoPuntajeNomi.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoPuntajeNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoPuntajeNomi = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoPuntajeNomi.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoPuntajeNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoPuntajeNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoPuntajeNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsPuntajeNomi = new GridBagConstraints();
		this.gridBagConstraintsPuntajeNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPuntajeNomi.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPuntajeNomi.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPuntajeNomi.add(this.jLabelGenerarExcelReporteDinamicoPuntajeNomi, this.gridBagConstraintsPuntajeNomi);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoPuntajeNomi = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoPuntajeNomi.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoPuntajeNomi,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoPuntajeNomi.setToolTipText("Generar EXCEL"+" "+PuntajeNomiConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsPuntajeNomi = new GridBagConstraints();
		//this.gridBagConstraintsPuntajeNomi.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsPuntajeNomi.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsPuntajeNomi.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoPuntajeNomi.add(this.jButtonGenerarExcelReporteDinamicoPuntajeNomi, this.gridBagConstraintsPuntajeNomi);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsPuntajeNomi = new GridBagConstraints();
		this.gridBagConstraintsPuntajeNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPuntajeNomi.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPuntajeNomi.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPuntajeNomi.add(this.jComboBoxTiposReportesDinamicoPuntajeNomi, this.gridBagConstraintsPuntajeNomi);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoPuntajeNomi = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoPuntajeNomi.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoPuntajeNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoPuntajeNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoPuntajeNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsPuntajeNomi = new GridBagConstraints();
		this.gridBagConstraintsPuntajeNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPuntajeNomi.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPuntajeNomi.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPuntajeNomi.add(this.jLabelTiposArchivoReporteDinamicoPuntajeNomi, this.gridBagConstraintsPuntajeNomi);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsPuntajeNomi = new GridBagConstraints();
		this.gridBagConstraintsPuntajeNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPuntajeNomi.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPuntajeNomi.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPuntajeNomi.add(this.jComboBoxTiposArchivosReportesDinamicoPuntajeNomi, this.gridBagConstraintsPuntajeNomi);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoPuntajeNomi = new JButtonMe();
		this.jButtonGenerarReporteDinamicoPuntajeNomi.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoPuntajeNomi,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoPuntajeNomi.setToolTipText("Generar"+" "+PuntajeNomiConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsPuntajeNomi = new GridBagConstraints();
		this.gridBagConstraintsPuntajeNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPuntajeNomi.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPuntajeNomi.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPuntajeNomi.add(this.jButtonGenerarReporteDinamicoPuntajeNomi, this.gridBagConstraintsPuntajeNomi);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoPuntajeNomi = new JButtonMe();
		this.jButtonCerrarReporteDinamicoPuntajeNomi.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoPuntajeNomi,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoPuntajeNomi.setToolTipText("Cancelar"+" "+PuntajeNomiConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsPuntajeNomi = new GridBagConstraints();
		this.gridBagConstraintsPuntajeNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPuntajeNomi.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPuntajeNomi.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPuntajeNomi.add(this.jButtonCerrarReporteDinamicoPuntajeNomi, this.gridBagConstraintsPuntajeNomi);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalPuntajeNomi = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoPuntajeNomi= new JScrollPane(jPanelReporteDinamicoPuntajeNomi,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoPuntajeNomi.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoPuntajeNomi.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoPuntajeNomi.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoPuntajeNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Puntaje Nomis"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsPuntajeNomi = new GridBagConstraints();
		this.gridBagConstraintsPuntajeNomi.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsPuntajeNomi.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsPuntajeNomi.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoPuntajeNomi.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoPuntajeNomi.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalPuntajeNomi);
		this.jInternalFrameReporteDinamicoPuntajeNomi.getContentPane().add(this.jScrollPanelReporteDinamicoPuntajeNomi, this.gridBagConstraintsPuntajeNomi);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionPuntajeNomi() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionPuntajeNomi = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionPuntajeNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionPuntajeNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionPuntajeNomi.setName("jPanelImportacionPuntajeNomi"); 
		
		this.jPanelImportacionPuntajeNomi.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionPuntajeNomi.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionPuntajeNomi.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionPuntajeNomi.setLayout(gridaBagLayoutImportacionPuntajeNomi);
		
		
		this.jInternalFrameImportacionPuntajeNomi= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionPuntajeNomi= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionPuntajeNomi = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReportePuntajeNomi= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionPuntajeNomi.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionPuntajeNomi.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionPuntajeNomi.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionPuntajeNomi.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionPuntajeNomi.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionPuntajeNomi.setResizable(true);
	    this.jInternalFrameImportacionPuntajeNomi.setClosable(true);
	    this.jInternalFrameImportacionPuntajeNomi.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionPuntajeNomi.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionPuntajeNomi.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionPuntajeNomi.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionPuntajeNomi.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionPuntajeNomi.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionPuntajeNomi.setResizable(true);
	    this.jInternalFrameImportacionPuntajeNomi.setClosable(true);
	    this.jInternalFrameImportacionPuntajeNomi.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionPuntajeNomi.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionPuntajeNomi.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionPuntajeNomi.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionPuntajeNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Puntaje Nomis"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionPuntajeNomi = new JLabelMe();

		this.jLabelArchivoImportacionPuntajeNomi.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionPuntajeNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionPuntajeNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionPuntajeNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsPuntajeNomi = new GridBagConstraints();
		this.gridBagConstraintsPuntajeNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPuntajeNomi.gridy = iPosYImportacion;		
		this.gridBagConstraintsPuntajeNomi.gridx = iPosXImportacion++;
			
		this.jPanelImportacionPuntajeNomi.add(this.jLabelArchivoImportacionPuntajeNomi, this.gridBagConstraintsPuntajeNomi);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionPuntajeNomi = new JFileChooser();		
		this.jFileChooserImportacionPuntajeNomi.setToolTipText("ESCOGER ARCHIVO"+" "+PuntajeNomiConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionPuntajeNomi = new JButtonMe();
		this.jButtonAbrirImportacionPuntajeNomi.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionPuntajeNomi,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionPuntajeNomi.setToolTipText("Generar"+" "+PuntajeNomiConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsPuntajeNomi = new GridBagConstraints();
		this.gridBagConstraintsPuntajeNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPuntajeNomi.gridy = iPosYImportacion;
		this.gridBagConstraintsPuntajeNomi.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPuntajeNomi.add(this.jButtonAbrirImportacionPuntajeNomi, this.gridBagConstraintsPuntajeNomi);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionPuntajeNomi = new JLabelMe();

		this.jLabelPathArchivoImportacionPuntajeNomi.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionPuntajeNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionPuntajeNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionPuntajeNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsPuntajeNomi = new GridBagConstraints();
		this.gridBagConstraintsPuntajeNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPuntajeNomi.gridy = iPosYImportacion;		
		this.gridBagConstraintsPuntajeNomi.gridx = iPosXImportacion++;
			
		this.jPanelImportacionPuntajeNomi.add(this.jLabelPathArchivoImportacionPuntajeNomi, this.gridBagConstraintsPuntajeNomi);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionPuntajeNomi=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionPuntajeNomi.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionPuntajeNomi.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionPuntajeNomi.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsPuntajeNomi = new GridBagConstraints();
		this.gridBagConstraintsPuntajeNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPuntajeNomi.gridy = iPosYImportacion;
		this.gridBagConstraintsPuntajeNomi.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPuntajeNomi.add(this.jTextFieldPathArchivoImportacionPuntajeNomi, this.gridBagConstraintsPuntajeNomi);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionPuntajeNomi = new JButtonMe();
		this.jButtonGenerarImportacionPuntajeNomi.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionPuntajeNomi,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionPuntajeNomi.setToolTipText("Generar"+" "+PuntajeNomiConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsPuntajeNomi = new GridBagConstraints();
		this.gridBagConstraintsPuntajeNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPuntajeNomi.gridy = iPosYImportacion;
		this.gridBagConstraintsPuntajeNomi.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPuntajeNomi.add(this.jButtonGenerarImportacionPuntajeNomi, this.gridBagConstraintsPuntajeNomi);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionPuntajeNomi = new JButtonMe();
		this.jButtonCerrarImportacionPuntajeNomi.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionPuntajeNomi,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionPuntajeNomi.setToolTipText("Cancelar"+" "+PuntajeNomiConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsPuntajeNomi = new GridBagConstraints();
		this.gridBagConstraintsPuntajeNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPuntajeNomi.gridy = iPosYImportacion;
		this.gridBagConstraintsPuntajeNomi.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPuntajeNomi.add(this.jButtonCerrarImportacionPuntajeNomi, this.gridBagConstraintsPuntajeNomi);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalPuntajeNomi = new GridBagLayout();
		
		this.jScrollPanelImportacionPuntajeNomi= new JScrollPane(jPanelImportacionPuntajeNomi,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsPuntajeNomi = new GridBagConstraints();
		this.gridBagConstraintsPuntajeNomi.gridy =iPosYImportacion;
		this.gridBagConstraintsPuntajeNomi.gridx =iPosXImportacion;
		this.gridBagConstraintsPuntajeNomi.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionPuntajeNomi.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionPuntajeNomi.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalPuntajeNomi);
		this.jInternalFrameImportacionPuntajeNomi.getContentPane().add(this.jScrollPanelImportacionPuntajeNomi, this.gridBagConstraintsPuntajeNomi);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByPuntajeNomi(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByPuntajeNomi = new JButtonMe();
			this.jButtonAbrirOrderByPuntajeNomi.setText("Orden");
			this.jButtonAbrirOrderByPuntajeNomi.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByPuntajeNomi,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByPuntajeNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByPuntajeNomi";
			inputMap = this.jButtonAbrirOrderByPuntajeNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByPuntajeNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByPuntajeNomi"));
		
		
			GridBagLayout gridaBagLayoutOrderByPuntajeNomi = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByPuntajeNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByPuntajeNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByPuntajeNomi.setName("jPanelOrderByPuntajeNomi"); 
			
			this.jPanelOrderByPuntajeNomi.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByPuntajeNomi.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByPuntajeNomi.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByPuntajeNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByPuntajeNomi.setLayout(gridaBagLayoutOrderByPuntajeNomi);
			
			
			this.jTableDatosPuntajeNomiOrderBy = new JTableMe();        
			this.jTableDatosPuntajeNomiOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosPuntajeNomiOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosPuntajeNomiOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosPuntajeNomiOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosPuntajeNomiOrderBy.setViewportView(this.jTableDatosPuntajeNomiOrderBy);
			this.jTableDatosPuntajeNomiOrderBy.setFillsViewportHeight(true);
			this.jTableDatosPuntajeNomiOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByPuntajeNomi= new OrderByJInternalFrame();
			this.jInternalFrameOrderByPuntajeNomi= new OrderByJInternalFrame();
			this.jScrollPanelOrderByPuntajeNomi = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReportePuntajeNomi= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByPuntajeNomi.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByPuntajeNomi.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByPuntajeNomi.setTitle("Orden");
			this.jInternalFrameOrderByPuntajeNomi.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByPuntajeNomi.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByPuntajeNomi.setResizable(true);
			this.jInternalFrameOrderByPuntajeNomi.setClosable(true);
			this.jInternalFrameOrderByPuntajeNomi.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByPuntajeNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByPuntajeNomi.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByPuntajeNomi.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByPuntajeNomi.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByPuntajeNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByPuntajeNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Puntaje Nomis"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsPuntajeNomi = new GridBagConstraints();
			this.gridBagConstraintsPuntajeNomi.gridy =iPosYOrderBy++;
			this.gridBagConstraintsPuntajeNomi.gridx =iPosXOrderBy;
			this.gridBagConstraintsPuntajeNomi.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsPuntajeNomi.ipady =150;
				
			this.jPanelOrderByPuntajeNomi.add(jScrollPanelDatosPuntajeNomiOrderBy, this.gridBagConstraintsPuntajeNomi);//this.jTableDatosPuntajeNomiTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByPuntajeNomi = new JButtonMe();
			this.jButtonCerrarOrderByPuntajeNomi.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByPuntajeNomi,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByPuntajeNomi.setToolTipText("Cancelar"+" "+PuntajeNomiConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByPuntajeNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsPuntajeNomi = new GridBagConstraints();
			this.gridBagConstraintsPuntajeNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPuntajeNomi.gridy = iPosYOrderBy++;
			this.gridBagConstraintsPuntajeNomi.gridx = iPosXOrderBy;
									
			this.jPanelOrderByPuntajeNomi.add(this.jButtonCerrarOrderByPuntajeNomi, this.gridBagConstraintsPuntajeNomi);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalPuntajeNomi = new GridBagLayout();
			
			this.jScrollPanelOrderByPuntajeNomi= new JScrollPane(jPanelOrderByPuntajeNomi,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsPuntajeNomi = new GridBagConstraints();
			this.gridBagConstraintsPuntajeNomi.gridy =iPosYOrderBy;
			this.gridBagConstraintsPuntajeNomi.gridx =iPosXOrderBy;
			this.gridBagConstraintsPuntajeNomi.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByPuntajeNomi.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByPuntajeNomi.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalPuntajeNomi);
			
			this.jInternalFrameOrderByPuntajeNomi.getContentPane().add(this.jScrollPanelOrderByPuntajeNomi, this.gridBagConstraintsPuntajeNomi);			
		
		} else {
			this.jButtonAbrirOrderByPuntajeNomi = new JButtonMe();
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
		int iWidthTableCalculado=0;//630
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=330;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=200;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=100;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.puntajenomiSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosPuntajeNomi.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosPuntajeNomi.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosPuntajeNomi.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosPuntajeNomi.getRowHeight();//PuntajeNomiConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.puntajenomiSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > PuntajeNomiConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaPuntajeNomi.isSelected()) {
					iHeightTable=PuntajeNomiConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < PuntajeNomiConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=PuntajeNomiConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > PuntajeNomiConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaPuntajeNomi.isSelected()) {
					iHeightTable=PuntajeNomiConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < PuntajeNomiConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=PuntajeNomiConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosPuntajeNomi.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosPuntajeNomi.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosPuntajeNomi.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosPuntajeNomi.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosPuntajeNomi.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosPuntajeNomi.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByPuntajeNomi!=null && this.jInternalFrameOrderByPuntajeNomi.getjTableDatosOrderBy()!=null) {
			//if(!this.puntajenomiSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByPuntajeNomi.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByPuntajeNomi.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByPuntajeNomi.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByPuntajeNomi.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByPuntajeNomi.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByPuntajeNomi.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByPuntajeNomi.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosPuntajeNomi.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosPuntajeNomi.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosPuntajeNomi.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=puntajenomiLogic.getPuntajeNomis().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=puntajenomis.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<PuntajeNomi> TraerPuntajeNomiBeans(List<PuntajeNomi> puntajenomis,ArrayList<Classe> classes)throws Exception {
		try {
			for(PuntajeNomi puntajenomi:puntajenomis) {
					
				if(!(PuntajeNomiConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || PuntajeNomiConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					puntajenomi.setsDetalleGeneralEntityReporte(PuntajeNomiConstantesFunciones.getPuntajeNomiDescripcion(puntajenomi));
										
						
					
					

					if(puntajenomi.getFormatoNomis()!=null && Funciones.existeClass(classes,FormatoNomi.class)) {
						try{puntajenomi.setformatonomisDescripcionReporte(new JRBeanCollectionDataSource(FormatoNomiJInternalFrame.TraerFormatoNomiBeans(puntajenomi.getFormatoNomis(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//puntajenomi.setsDetalleGeneralEntityReporte(puntajenomi.getsDetalleGeneralEntityReporte());
										
				}
				
				//puntajenomibeans.add(puntajenomibean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return puntajenomis;
    }
	//PARA REPORTES FIN
}
