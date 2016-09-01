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
package com.bydan.erp.sris.presentation.swing.jinternalframes;



import com.bydan.erp.sris.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.sris.presentation.swing.jinternalframes.*;
import com.bydan.erp.sris.presentation.swing.jinternalframes.auxiliar.*;





//import com.bydan.erp.sris.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.sris.business.entity.*;
import com.bydan.erp.sris.util.SrisConstantesFunciones;

import com.bydan.erp.sris.business.logic.*;
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
public class SrisJInternalFrame extends SrisBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarSris;
	
	protected JMenuBar jmenuBarSris;
	
	protected JMenu jmenuSris;
	protected JMenu jmenuDatosSris;
	protected JMenu jmenuArchivoSris;
	protected JMenu jmenuAccionesSris;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosSris = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutSris;	
	protected GridBagConstraints gridBagConstraintsSris;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public SrisDetalleFormJInternalFrame jInternalFrameDetalleFormSris;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoSris;	
	protected ImportacionJInternalFrame jInternalFrameImportacionSris;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public SrisSessionBean srisSessionBean;
		
	
	
	
	//protected JDesktopPane jDesktopPane;
	public List<Sris> sriss;		
	public List<Sris> srissEliminados;	
	public List<Sris> srissAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderBySris;		
	protected JButton jButtonAbrirOrderBySris;
	
	
	//protected JPanel jPanelOrderBySris;
	//public JScrollPane jScrollPanelOrderBySris;	
	//protected JButton jButtonCerrarOrderBySris;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public SrisLogic srisLogic;
	
	
	
	public JScrollPane jScrollPanelDatosSris;
	public JScrollPane jScrollPanelDatosEdicionSris;
	public JScrollPane jScrollPanelDatosGeneralSris;
    
	
	
	//public JScrollPane jScrollPanelDatosSrisOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoSris;
	//public JScrollPane jScrollPanelImportacionSris;
	
	
	
	protected JPanel jPanelAccionesSris;
	
    protected JPanel jPanelPaginacionSris;
    protected JPanel jPanelParametrosReportesSris;
	protected JPanel jPanelParametrosReportesAccionesSris;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1Sris;
	protected JPanel jPanelParametrosAuxiliar2Sris;
	protected JPanel jPanelParametrosAuxiliar3Sris;
	protected JPanel jPanelParametrosAuxiliar4Sris;
	//protected JPanel jPanelParametrosAuxiliar5Sris;
	
	
	
	//protected JPanel jPanelReporteDinamicoSris;
	//protected JPanel jPanelImportacionSris;
	
	
	public JTable jTableDatosSris;
	
	
	
	//public JTable jTableDatosSrisOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoSris;
	protected JButton jButtonDuplicarSris;
	protected JButton jButtonCopiarSris;
	protected JButton jButtonVerFormSris;
	protected JButton jButtonNuevoRelacionesSris;
	protected JButton jButtonModificarSris;
	
    protected JButton jButtonGuardarCambiosTablaSris;
	protected JButton jButtonCerrarSris;
	
	
	protected JButton jButtonRecargarInformacionSris;
	protected JButton jButtonProcesarInformacionSris;
	
	
	protected JButton jButtonAnterioresSris;
	protected JButton jButtonSiguientesSris;
	protected JButton jButtonNuevoGuardarCambiosSris;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoSris;
	//protected JButton jButtonCerrarReporteDinamicoSris;
	//protected JButton jButtonGenerarExcelReporteDinamicoSris;	
	
	
	
	//protected JButton jButtonAbrirImportacionSris;
	//protected JButton jButtonGenerarImportacionSris;
	//protected JButton jButtonCerrarImportacionSris;
	//protected JFileChooser jFileChooserImportacionSris;
	//protected File fileImportacionSris;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarSris;
	protected JButton jButtonDuplicarToolBarSris;
	protected JButton jButtonNuevoRelacionesToolBarSris;
	
	
	public JButton jButtonGuardarCambiosToolBarSris;
	protected JButton jButtonCopiarToolBarSris;
	protected JButton jButtonVerFormToolBarSris;
	public JButton jButtonGuardarCambiosTablaToolBarSris;
	protected JButton jButtonMostrarOcultarTablaToolBarSris;
	protected JButton jButtonCerrarToolBarSris;
	
	protected JButton jButtonRecargarInformacionToolBarSris;
	protected JButton jButtonProcesarInformacionToolBarSris;
	protected JButton jButtonAnterioresToolBarSris;
	protected JButton jButtonSiguientesToolBarSris;
	protected JButton jButtonNuevoGuardarCambiosToolBarSris;
	protected JButton jButtonAbrirOrderByToolBarSris;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoSris;
	protected JMenuItem jMenuItemDuplicarSris;
	protected JMenuItem jMenuItemNuevoRelacionesSris;
	
	
	protected JMenuItem jMenuItemGuardarCambiosSris;
	protected JMenuItem jMenuItemCopiarSris;
	protected JMenuItem jMenuItemVerFormSris;
	protected JMenuItem jMenuItemGuardarCambiosTablaSris;
	protected JMenuItem jMenuItemCerrarSris;
	protected JMenuItem jMenuItemDetalleCerrarSris;
	protected JMenuItem jMenuItemDetalleAbrirOrderBySris;
	protected JMenuItem jMenuItemDetalleMostarOcultarSris;
	
	protected JMenuItem jMenuItemRecargarInformacionSris;
	protected JMenuItem jMenuItemProcesarInformacionSris;
	protected JMenuItem jMenuItemAnterioresSris;
	protected JMenuItem jMenuItemSiguientesSris;
	protected JMenuItem jMenuItemNuevoGuardarCambiosSris;
	protected JMenuItem jMenuItemAbrirOrderBySris;
	protected JMenuItem jMenuItemMostrarOcultarSris;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesSris;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosSris;
	protected JCheckBox jCheckBoxSeleccionadosSris;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaSris;
	protected JCheckBox jCheckBoxConGraficoReporteSris;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesSris;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesSris;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoSris;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoSris;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesSris;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionSris;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesSris;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesSris;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarSris;
	protected JTextField jTextFieldValorCampoGeneralSris;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteSris;
	//public JList<Reporte> jListColumnasSelectReporteSris;
	//public JScrollPane jScrollColumnasSelectReporteSris;
	
	//public JLabel jLabelRelacionesSelectReporteSris;
	//public JList<Reporte> jListRelacionesSelectReporteSris;
	//public JScrollPane jScrollRelacionesSelectReporteSris;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoSris;
	//protected JCheckBox jCheckBoxConGraficoDinamicoSris;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoSris;
	//public JLabel jLabelTiposArchivoReporteDinamicoSris;
	
		
	//public JLabel jLabelArchivoImportacionSris;	
	//public JLabel jLabelPathArchivoImportacionSris;
	//protected JTextField jTextFieldPathArchivoImportacionSris;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoSris;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoSris;
	
	//public JLabel jLabelColumnaCategoriaValorSris;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorSris;
	
	//public JLabel jLabelColumnasValoresGraficoSris;
	//public JList<Reporte> jListColumnasValoresGraficoSris;
	//public JScrollPane jScrollColumnasValoresGraficoSris;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoSris;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoSris;	
	
	
	
	
	
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
	public SrisJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("Sris No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public SrisJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Sris No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public SrisJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Sris No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public SrisJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Sris No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionSris)	{
		this.jButtonRecargarInformacionSris = jButtonRecargarInformacionSris;
	}
	
	public JButton getjButtonProcesarInformacionSris() {
		return this.jButtonProcesarInformacionSris;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionSris)	{
		this.jButtonProcesarInformacionSris = jButtonProcesarInformacionSris;
	}
	
	
	public JButton getjButtonRecargarInformacionSris() {
		return this.jButtonRecargarInformacionSris;
	}
	
	
	public List<Sris> getsriss() {
		return this.sriss;
	}

	public void setsriss(List<Sris> sriss) {
		this.sriss = sriss;
	}
	
	public List<Sris> getsrissAux() {
		return this.srissAux;
	}

	public void setsrissAux(List<Sris> srissAux) {
		this.srissAux = srissAux;
	}
	
	public List<Sris> getsrissEliminados() {
		return this.srissEliminados;
	}

	public void setSrissEliminados(List<Sris> srissEliminados) {
		this.srissEliminados = srissEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarSris() {
		return jComboBoxTiposSeleccionarSris;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarSris(
			JComboBox jComboBoxTiposSeleccionarSris) {
		this.jComboBoxTiposSeleccionarSris = jComboBoxTiposSeleccionarSris;
	}
	
	public void setBorderResaltarTiposSeleccionarSris() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarSris.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarSris .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralSris() {
		return jTextFieldValorCampoGeneralSris;
	}

	public void setjTextFieldValorCampoGeneralSris(
			JTextField jTextFieldValorCampoGeneralSris) {
		this.jTextFieldValorCampoGeneralSris = jTextFieldValorCampoGeneralSris;
	}

	public void setBorderResaltarValorCampoGeneralSris() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSris.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralSris .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosSris() {
		return this.jCheckBoxSeleccionarTodosSris;
	}

	public void setjCheckBoxSeleccionarTodosSris(
			JCheckBox jCheckBoxSeleccionarTodosSris) {
		this.jCheckBoxSeleccionarTodosSris = jCheckBoxSeleccionarTodosSris;
	}

	public void setBorderResaltarSeleccionarTodosSris() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSris.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosSris .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosSris() {
		return this.jCheckBoxSeleccionadosSris;
	}

	public void setjCheckBoxSeleccionadosSris(
			JCheckBox jCheckBoxSeleccionadosSris) {
		this.jCheckBoxSeleccionadosSris = jCheckBoxSeleccionadosSris;
	}
	
	public void setBorderResaltarSeleccionadosSris() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSris.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosSris .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesSris() {
		return this.jComboBoxTiposArchivosReportesSris;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesSris(
			JComboBox jComboBoxTiposArchivosReportesSris) {
		this.jComboBoxTiposArchivosReportesSris = jComboBoxTiposArchivosReportesSris;
	}

	public void setBorderResaltarTiposArchivosReportesSris() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSris.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesSris .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesSris() {
		return this.jComboBoxTiposReportesSris;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesSris(
			JComboBox jComboBoxTiposReportesSris) {
		this.jComboBoxTiposReportesSris = jComboBoxTiposReportesSris;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoSris() {
	//	return jComboBoxTiposReportesDinamicoSris;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoSris(
	//		JComboBox jComboBoxTiposReportesDinamicoSris) {
	//	this.jComboBoxTiposReportesDinamicoSris = jComboBoxTiposReportesDinamicoSris;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoSris() {
	//	return jComboBoxTiposArchivosReportesDinamicoSris;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoSris(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoSris) {
	//	this.jComboBoxTiposArchivosReportesDinamicoSris = jComboBoxTiposArchivosReportesDinamicoSris;
	//}
	
	public void setBorderResaltarTiposReportesSris() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSris.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesSris .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesSris() {
		return this.jComboBoxTiposGraficosReportesSris;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesSris(
			JComboBox jComboBoxTiposGraficosReportesSris) {
		this.jComboBoxTiposGraficosReportesSris = jComboBoxTiposGraficosReportesSris;
	}
	
	public void setBorderResaltarTiposGraficosReportesSris() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSris.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesSris .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionSris() {
		return this.jComboBoxTiposPaginacionSris;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionSris(
			JComboBox jComboBoxTiposPaginacionSris) {
		this.jComboBoxTiposPaginacionSris = jComboBoxTiposPaginacionSris;
	}
	
	public void setBorderResaltarTiposPaginacionSris() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSris.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionSris .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesSris() {
		return this.jComboBoxTiposRelacionesSris;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesSris() {
		return this.jComboBoxTiposAccionesSris;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesSris(
			JComboBox jComboBoxTiposRelacionesSris) {
		this.jComboBoxTiposRelacionesSris = jComboBoxTiposRelacionesSris;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesSris(
			JComboBox jComboBoxTiposAccionesSris) {
		this.jComboBoxTiposAccionesSris = jComboBoxTiposAccionesSris;
	}
	
	public void setBorderResaltarTiposRelacionesSris() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSris.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesSris .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesSris() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSris.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesSris .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoSris() {
	//	return jCheckBoxConGraficoDinamicoSris;
	//}

	//public void setjCheckBoxConGraficoDinamicoSris(
	//		JCheckBox jCheckBoxConGraficoDinamicoSris) {
	//	this.jCheckBoxConGraficoDinamicoSris = jCheckBoxConGraficoDinamicoSris;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoSris() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarSris.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoSris .setBorder(borderResaltar);		
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
		this.srisSessionBean=new SrisSessionBean();
		
		this.srisSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.srisSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.srisSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=SrisJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=SrisJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		SrisJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		SrisJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		SrisJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Sris MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 650) {
			iHeight=650;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.srisSessionBean.getEsGuardarRelacionado()) {
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
		
		SrisJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("Sris No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarSris= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarSris=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarSris,this.jTtoolBarSris,
							"nuevo","nuevo","Nuevo"+" "+SrisConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarSris=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarSris,this.jTtoolBarSris,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarSris=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarSris,this.jTtoolBarSris,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+SrisConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarSris=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarSris,this.jTtoolBarSris,
							"duplicar","duplicar","Duplicar"+" "+SrisConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarSris=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarSris,this.jTtoolBarSris,
							"copiar","copiar","Copiar"+" "+SrisConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarSris=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarSris,this.jTtoolBarSris,
							"ver_form","ver_form","Ver"+" "+SrisConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarSris=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarSris,this.jTtoolBarSris,
							"recargar","recargar","Recargar"+" "+SrisConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarSris=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarSris,this.jTtoolBarSris,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarSris=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarSris,this.jTtoolBarSris,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarSris=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarSris,this.jTtoolBarSris,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarSris=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarSris,this.jTtoolBarSris,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarSris=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarSris,this.jTtoolBarSris,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+SrisConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarSris=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarSris,this.jTtoolBarSris,
							"cerrar","cerrar","Salir"+" "+SrisConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarSris=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarSris;
			
				this.jButtonProcesarInformacionToolBarSris=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarSris;
				
		//protected JButton jButtonModificarToolBarSris;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarSris=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuSris=new JMenuMe("General");
		this.jmenuArchivoSris=new JMenuMe("Archivo");
		this.jmenuAccionesSris=new JMenuMe("Acciones");
		this.jmenuDatosSris=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoSris= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoSris.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoSris,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoSris, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarSris= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarSris.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarSris,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarSris, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesSris= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesSris.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesSris,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesSris, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosSris= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosSris.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosSris,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosSris, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarSris= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarSris.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarSris,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarSris, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormSris= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormSris.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormSris,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormSris, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaSris= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaSris.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaSris,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaSris, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarSris= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarSris.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarSris,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarSris, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionSris= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionSris.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionSris,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionSris, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionSris= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionSris.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionSris,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresSris= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresSris.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresSris,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresSris, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesSris= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesSris.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesSris,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesSris, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderBySris= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderBySris.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderBySris,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderBySris, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarSris= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarSris.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarSris,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarSris, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderBySris= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderBySris.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderBySris,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderBySris, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarSris= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarSris.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarSris,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarSris, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosSris= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosSris.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosSris,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosSris, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoSris.add(this.jMenuItemCerrarSris);
			
			this.jmenuAccionesSris.add(this.jMenuItemNuevoSris);
			this.jmenuAccionesSris.add(this.jMenuItemNuevoGuardarCambiosSris);
			this.jmenuAccionesSris.add(this.jMenuItemNuevoRelacionesSris);
			this.jmenuAccionesSris.add(this.jMenuItemGuardarCambiosTablaSris);		
			this.jmenuAccionesSris.add(this.jMenuItemDuplicarSris);		
			this.jmenuAccionesSris.add(this.jMenuItemCopiarSris);		
			this.jmenuAccionesSris.add(this.jMenuItemVerFormSris);		
			
			this.jmenuDatosSris.add(this.jMenuItemRecargarInformacionSris);				
			this.jmenuDatosSris.add(this.jMenuItemAnterioresSris);				
			this.jmenuDatosSris.add(this.jMenuItemSiguientesSris);				
			this.jmenuDatosSris.add(this.jMenuItemAbrirOrderBySris);				
			this.jmenuDatosSris.add(this.jMenuItemMostrarOcultarSris);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesSris.add(this.jMenuItemGuardarCambiosSris);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoSris, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesSris, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosSris, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarSris.add(this.jmenuArchivoSris);		
			this.jmenuBarSris.add(this.jmenuAccionesSris);		
			this.jmenuBarSris.add(this.jmenuDatosSris);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarSris);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasSris() {
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
			//this.jInternalFrameDetalleSris = new SrisDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Sris DATOS");
			this.jInternalFrameDetalleFormSris = new SrisDetalleFormJInternalFrame(jDesktopPane,this.srisSessionBean.getConGuardarRelaciones(),this.srisSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormSris = null;//new SrisDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutSris= new GridBagLayout();
		
		
		this.jTableDatosSris = new JTableMe();      
		
		String sToolTipSris="";
		sToolTipSris=SrisConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipSris+="(Sris.Sris)";
		}
		
		if(!this.srisSessionBean.getEsGuardarRelacionado()) {
			sToolTipSris+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosSris.setToolTipText(sToolTipSris);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosSris);
		this.jTableDatosSris.setAutoCreateRowSorter(true);
		this.jTableDatosSris.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosSris.setRowSelectionAllowed(true);
		this.jTableDatosSris.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosSris,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoSris = new JButtonMe();
		this.jButtonDuplicarSris = new JButtonMe();
		this.jButtonCopiarSris = new JButtonMe();
		this.jButtonVerFormSris = new JButtonMe();
		this.jButtonNuevoRelacionesSris = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaSris = new JButtonMe();
		this.jButtonCerrarSris = new JButtonMe();
		
		this.jScrollPanelDatosSris = new JScrollPane();   
        this.jScrollPanelDatosGeneralSris = new JScrollPane();
		
				
		
		
		this.jPanelAccionesSris = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Sris";
		
		if(!this.srisSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosSris.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Sriss" + this.sPath));
		} else {
			this.jScrollPanelDatosSris.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralSris.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesSris.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesSris.setToolTipText("Acciones");
        this.jPanelAccionesSris.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralSris, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosSris, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoSris=new ReporteDinamicoJInternalFrame(SrisConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoSris();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionSris=new ImportacionJInternalFrame(SrisConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionSris();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderBySris = new JButtonMe();
		
		this.jButtonAbrirOrderBySris.setText("Orden");
		this.jButtonAbrirOrderBySris.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderBySris,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderBySris, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderBySris.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderBySris.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderBySris=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderBySris,false,this);
			
			//this.cargarOrderBySris(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderBySris=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderBySris,true,this);
			
			//this.cargarOrderBySris(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosSris.setMinimumSize(new Dimension(400,50));//330
		this.jTableDatosSris.setMaximumSize(new Dimension(400,50));//330
		this.jTableDatosSris.setPreferredSize(new Dimension(400,50));//330
		
		this.jScrollPanelDatosSris.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosSris.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosSris.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoSris.setText("Nuevo");
		this.jButtonDuplicarSris.setText("Duplicar");
		this.jButtonCopiarSris.setText("Copiar");
		this.jButtonVerFormSris.setText("Ver");
		this.jButtonNuevoRelacionesSris.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaSris.setText("Guardar");
		this.jButtonCerrarSris.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoSris,"nuevo_button","Nuevo",this.srisSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarSris,"duplicar_button","Duplicar",this.srisSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarSris,"copiar_button","Copiar",this.srisSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormSris,"ver_form","Ver",this.srisSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesSris,"nuevorelaciones_button","Nuevo Rel",this.srisSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaSris,"guardarcambiostabla_button","Guardar",this.srisSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarSris,"cerrar_button","Salir",this.srisSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoSris, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarSris, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarSris, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormSris, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesSris, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaSris, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarSris, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoSris.setToolTipText("Nuevo"+" "+SrisConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarSris.setToolTipText("Duplicar"+" "+SrisConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarSris.setToolTipText("Copiar"+" "+SrisConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormSris.setToolTipText("Ver"+" "+SrisConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesSris.setToolTipText("Nuevo Rel"+" "+SrisConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaSris.setToolTipText("Guardar"+" "+SrisConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarSris.setToolTipText("Salir"+" "+SrisConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoSris";
		inputMap = this.jButtonNuevoSris.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoSris.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoSris"));
		
		//DUPLICAR
		sMapKey = "DuplicarSris";
		inputMap = this.jButtonDuplicarSris.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarSris.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarSris"));
		
		//COPIAR
		sMapKey = "CopiarSris";
		inputMap = this.jButtonCopiarSris.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarSris.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarSris"));
		
		//VEr FORM
		sMapKey = "VerFormSris";
		inputMap = this.jButtonVerFormSris.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormSris.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormSris"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesSris";
		inputMap = this.jButtonNuevoRelacionesSris.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesSris.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesSris"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarSris";
		inputMap = this.jButtonModificarSris.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarSris.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarSris"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarSris";
		inputMap = this.jButtonCerrarSris.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarSris.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarSris"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaSris";
		inputMap = this.jButtonGuardarCambiosTablaSris.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaSris.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaSris"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesSris = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesSris = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionSris = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1Sris= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2Sris= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3Sris= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4Sris= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5Sris= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesSris.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesSris.setName("jPanelParametrosReportesSris"); 
		
		this.jPanelParametrosReportesAccionesSris.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesSris.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesSris.setName("jPanelParametrosReportesAccionesSris"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesSris, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesSris, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionSris = new JButtonMe();
		this.jButtonRecargarInformacionSris.setText("Recargar");
		this.jButtonRecargarInformacionSris.setToolTipText("Recargar"+" "+SrisConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionSris,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionSris = new JButtonMe();
		this.jButtonProcesarInformacionSris.setText("Procesar");
		this.jButtonProcesarInformacionSris.setToolTipText("Procesar"+" "+SrisConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionSris.setVisible(false);
			
		this.jButtonProcesarInformacionSris.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionSris.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionSris.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesSris = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesSris.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesSris.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesSris = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesSris.setText("TIPO");       
		this.jComboBoxTiposReportesSris.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesSris = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesSris.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesSris.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionSris = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionSris.setText("Paginacion");
		this.jComboBoxTiposPaginacionSris.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesSris = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesSris.setText("Accion");
		this.jComboBoxTiposRelacionesSris.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesSris = new JComboBoxMe();
		//this.jComboBoxTiposAccionesSris.setText("Accion");
		this.jComboBoxTiposAccionesSris.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarSris = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarSris.setText("Accion");
		this.jComboBoxTiposSeleccionarSris.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralSris=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralSris.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralSris.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralSris.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesSris = new JLabelMe();
		
		this.jLabelAccionesSris.setText("Acciones");		
		this.jLabelAccionesSris.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesSris.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesSris.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosSris = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosSris.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosSris.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosSris = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosSris.setText("Seleccionados");
		this.jCheckBoxSeleccionadosSris.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaSris = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaSris.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaSris.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteSris = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteSris.setText("Graf.");
		this.jCheckBoxConGraficoReporteSris.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresSris = new JButtonMe();
		//this.jButtonAnterioresSris.setText("<<");
        this.jButtonAnterioresSris.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresSris,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresSris, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesSris = new JButtonMe();
		//this.jButtonSiguientesSris.setText(">>");
        this.jButtonSiguientesSris.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesSris,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesSris, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosSris = new JButtonMe();
		this.jButtonNuevoGuardarCambiosSris.setText("Nue");
        this.jButtonNuevoGuardarCambiosSris.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosSris,"nuevoguardarcambios_button","Nue",this.srisSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosSris, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosSris";
		inputMap = this.jButtonNuevoGuardarCambiosSris.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosSris.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosSris"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionSris";
		inputMap = this.jButtonRecargarInformacionSris.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionSris.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionSris"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesSris";
		inputMap = this.jButtonSiguientesSris.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesSris.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesSris"));
		
		//ANTERIORES		
		sMapKey = "AnterioresSris";
		inputMap = this.jButtonAnterioresSris.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresSris.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresSris"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasSris();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesSris.setMinimumSize(new Dimension(this.getWidth(),SrisBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(SrisBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesSris.setMaximumSize(new Dimension(this.getWidth(),SrisBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(SrisBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesSris.setPreferredSize(new Dimension(this.getWidth(),SrisBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(SrisBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionSris = new GridBagLayout();

			this.jPanelPaginacionSris.setLayout(gridaBagLayoutPaginacionSris);						
			
			this.gridBagConstraintsSris = new GridBagConstraints();
			this.gridBagConstraintsSris.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsSris.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSris.gridy = 0;
			this.gridBagConstraintsSris.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionSris.add(this.jButtonAnterioresSris, this.gridBagConstraintsSris);
					
						
			this.gridBagConstraintsSris = new GridBagConstraints();
			this.gridBagConstraintsSris.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsSris.gridy = 0;
			
			this.jPanelPaginacionSris.add(this.jButtonNuevoGuardarCambiosSris, this.gridBagConstraintsSris);
						
			
			this.gridBagConstraintsSris = new GridBagConstraints();
			this.gridBagConstraintsSris.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsSris.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsSris.gridy = 0;
			this.jPanelPaginacionSris.add(this.jButtonSiguientesSris, this.gridBagConstraintsSris);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsSris = new GridBagConstraints();
			this.gridBagConstraintsSris.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSris.gridy = 1;
			this.gridBagConstraintsSris.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionSris.add(this.jButtonNuevoSris, this.gridBagConstraintsSris);
						
			
			
			if(!this.srisSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsSris = new GridBagConstraints();
				this.gridBagConstraintsSris.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsSris.gridy = 1;
				this.gridBagConstraintsSris.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionSris.add(this.jButtonGuardarCambiosTablaSris, this.gridBagConstraintsSris);
			}
			
			
			
			this.gridBagConstraintsSris = new GridBagConstraints();
			this.gridBagConstraintsSris.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSris.gridy = 1;
			this.gridBagConstraintsSris.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionSris.add(this.jButtonDuplicarSris, this.gridBagConstraintsSris);
			
			this.gridBagConstraintsSris = new GridBagConstraints();
			this.gridBagConstraintsSris.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSris.gridy = 1;
			this.gridBagConstraintsSris.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionSris.add(this.jButtonCopiarSris, this.gridBagConstraintsSris);
		
			this.gridBagConstraintsSris = new GridBagConstraints();
			this.gridBagConstraintsSris.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSris.gridy = 1;
			this.gridBagConstraintsSris.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionSris.add(this.jButtonVerFormSris, this.gridBagConstraintsSris);
		
			this.gridBagConstraintsSris = new GridBagConstraints();
			this.gridBagConstraintsSris.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSris.gridy = 1;
			this.gridBagConstraintsSris.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionSris.add(this.jButtonCerrarSris, this.gridBagConstraintsSris);
		
		
		
		this.jButtonRecargarInformacionSris.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionSris.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionSris.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionSris, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesSris.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesSris.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesSris.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesSris, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesSris.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesSris.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesSris.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesSris, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesSris.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesSris.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesSris.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesSris, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionSris.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionSris.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionSris.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionSris, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesSris.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesSris.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesSris.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesSris, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesSris.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesSris.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesSris.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesSris, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarSris.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarSris.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarSris.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarSris, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaSris.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaSris.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaSris.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaSris, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteSris.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteSris.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteSris.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteSris, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosSris.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosSris.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosSris.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosSris, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosSris.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosSris.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosSris.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosSris, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesSris = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesSris = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1Sris = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2Sris = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3Sris = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4Sris = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesSris.setLayout(gridaBagParametrosReportesSris);
			this.jPanelParametrosReportesAccionesSris.setLayout(gridaBagParametrosReportesAccionesSris);
			
			
			this.jPanelParametrosAuxiliar1Sris.setLayout(gridaBagParametrosAuxiliar1Sris);
			this.jPanelParametrosAuxiliar2Sris.setLayout(gridaBagParametrosAuxiliar2Sris);
			this.jPanelParametrosAuxiliar3Sris.setLayout(gridaBagParametrosAuxiliar3Sris);
			this.jPanelParametrosAuxiliar4Sris.setLayout(gridaBagParametrosAuxiliar4Sris);
			//this.jPanelParametrosAuxiliar5Sris.setLayout(gridaBagParametrosAuxiliar2Sris);			
			
			
			
			
			this.gridBagConstraintsSris = new GridBagConstraints();
			this.gridBagConstraintsSris.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSris.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsSris.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesSris.add(this.jButtonRecargarInformacionSris, this.gridBagConstraintsSris);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsSris = new GridBagConstraints();
			this.gridBagConstraintsSris.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSris.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsSris.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Sris.add(this.jComboBoxTiposPaginacionSris, this.gridBagConstraintsSris);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsSris = new GridBagConstraints();
			this.gridBagConstraintsSris.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSris.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsSris.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Sris.add(this.jCheckBoxConAltoMaximoTablaSris, this.gridBagConstraintsSris);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsSris = new GridBagConstraints();
			this.gridBagConstraintsSris.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSris.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsSris.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Sris.add(this.jComboBoxTiposArchivosReportesSris, this.gridBagConstraintsSris);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsSris = new GridBagConstraints();
			this.gridBagConstraintsSris.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSris.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSris.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesSris.add(this.jPanelParametrosAuxiliar1Sris, this.gridBagConstraintsSris);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsSris = new GridBagConstraints();
			this.gridBagConstraintsSris.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSris.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSris.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsSris.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4Sris.add(this.jComboBoxTiposReportesSris, this.gridBagConstraintsSris);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsSris = new GridBagConstraints();
			this.gridBagConstraintsSris.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSris.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSris.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesSris.add(this.jPanelParametrosAuxiliar4Sris, this.gridBagConstraintsSris);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsSris = new GridBagConstraints();
			this.gridBagConstraintsSris.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSris.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsSris.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesSris.add(this.jComboBoxTiposReportesSris, this.gridBagConstraintsSris);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsSris = new GridBagConstraints();
			this.gridBagConstraintsSris.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSris.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSris.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesSris.add(this.jCheckBoxGenerarReporteSris, this.gridBagConstraintsSris);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsSris = new GridBagConstraints();
			this.gridBagConstraintsSris.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSris.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSris.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesSris.add(this.jPanelParametrosAuxiliar2Sris, this.gridBagConstraintsSris);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsSris = new GridBagConstraints();
			this.gridBagConstraintsSris.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSris.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsSris.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesSris.add(this.jLabelAccionesSris, this.gridBagConstraintsSris);
			*/
			
			//DEJA UN ESPACIO CUANDO ES MODULO, UNO A UNO FK O PROCESO
			 iGridxParametrosReportes++;
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsSris = new GridBagConstraints();
			this.gridBagConstraintsSris.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsSris.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSris.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesSris.add(this.jComboBoxTiposSeleccionarSris, this.gridBagConstraintsSris);			
			
			
			/*
			this.gridBagConstraintsSris = new GridBagConstraints();
			this.gridBagConstraintsSris.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSris.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsSris.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesSris.add(this.jCheckBoxSeleccionarTodosSris, this.gridBagConstraintsSris);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsSris = new GridBagConstraints();
			this.gridBagConstraintsSris.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSris.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSris.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsSris.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Sris.add(this.jCheckBoxSeleccionarTodosSris, this.gridBagConstraintsSris);															
				
			this.gridBagConstraintsSris = new GridBagConstraints();
			this.gridBagConstraintsSris.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSris.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSris.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsSris.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Sris.add(this.jCheckBoxSeleccionadosSris, this.gridBagConstraintsSris);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsSris = new GridBagConstraints();
			this.gridBagConstraintsSris.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSris.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSris.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesSris.add(this.jPanelParametrosAuxiliar3Sris, this.gridBagConstraintsSris);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsSris = new GridBagConstraints();
			this.gridBagConstraintsSris.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSris.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesSris.add(this.jComboBoxTiposAccionesSris, this.gridBagConstraintsSris);
	
				
			this.gridBagConstraintsSris = new GridBagConstraints();
			this.gridBagConstraintsSris.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSris.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesSris.add(this.jTextFieldValorCampoGeneralSris, this.gridBagConstraintsSris);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosSris = new GridBagLayout();

			this.jScrollPanelDatosSris.setLayout(gridaBagLayoutDatosSris);
			
			this.gridBagConstraintsSris = new GridBagConstraints();
			this.gridBagConstraintsSris.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSris.gridy = 0;
			this.gridBagConstraintsSris.gridx = 0;
			
			this.jScrollPanelDatosSris.add(this.jTableDatosSris, this.gridBagConstraintsSris);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosSris.setViewportView(this.jTableDatosSris);
		this.jTableDatosSris.setFillsViewportHeight(true);
		this.jTableDatosSris.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesSris= new GridBagLayout();
		this.jPanelAccionesSris.setLayout(gridaBagLayoutAccionesSris);
		
		
		/*	
		this.gridBagConstraintsSris = new GridBagConstraints();
		this.gridBagConstraintsSris.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSris.gridy = 0;
		this.gridBagConstraintsSris.gridx = 0;
			
		this.jPanelAccionesSris.add(this.jButtonNuevoSris, this.gridBagConstraintsSris);
		*/
		int iPosXAccion=0;
		
						
		
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutSris = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutSris);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.srisSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsSris = new GridBagConstraints();						
			this.gridBagConstraintsSris.gridy = iGridyPrincipal++;
			this.gridBagConstraintsSris.gridx = 0;		
			//this.gridBagConstraintsSris.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSris.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsSris.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarSris, this.gridBagConstraintsSris);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsSris = new GridBagConstraints();
		this.gridBagConstraintsSris.gridy = iGridyPrincipal++;
		this.gridBagConstraintsSris.gridx = 0;		
		//this.gridBagConstraintsSris.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSris.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsSris.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsSris);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsSris = new GridBagConstraints();
		this.gridBagConstraintsSris.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsSris.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesSris, this.gridBagConstraintsSris);								
		
		
		/*
		this.gridBagConstraintsSris = new GridBagConstraints();
		this.gridBagConstraintsSris.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsSris.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesSris, this.gridBagConstraintsSris);
		*/		
		
		this.gridBagConstraintsSris = new GridBagConstraints();
		this.gridBagConstraintsSris.gridy =iGridyPrincipal++;
		this.gridBagConstraintsSris.gridx =0;
		this.gridBagConstraintsSris.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsSris.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosSris, this.gridBagConstraintsSris);
				
		
		this.gridBagConstraintsSris = new GridBagConstraints();
		this.gridBagConstraintsSris.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsSris.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionSris, this.gridBagConstraintsSris);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(SrisJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosSris= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosSris = new GridBagLayout();
			this.jPanelBusquedasParametrosSris.setLayout(gridaBagLayoutBusquedasParametrosSris);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralSris=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralSris.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralSris.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralSris.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsSris = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsSris = new GridBagConstraints();
		this.gridBagConstraintsSris.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsSris.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposSris, this.gridBagConstraintsSris);
			
			
		this.gridBagConstraintsSris = new GridBagConstraints();
		this.gridBagConstraintsSris.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsSris.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosSris, this.gridBagConstraintsSris);
		
			
		this.gridBagConstraintsSris = new GridBagConstraints();
		this.gridBagConstraintsSris.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsSris.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesSris, this.gridBagConstraintsSris);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralSris;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoSris() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoSris = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoSris = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoSris.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoSris.setName("jPanelReporteDinamicoSris"); 
		
		this.jPanelReporteDinamicoSris.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoSris.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoSris.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoSris.setLayout(gridaBagLayoutReporteDinamicoSris);
		
		
		this.jInternalFrameReporteDinamicoSris= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoSris = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteSris= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoSris.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoSris.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoSris.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoSris.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoSris.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoSris.setResizable(true);
	    this.jInternalFrameReporteDinamicoSris.setClosable(true);
	    this.jInternalFrameReporteDinamicoSris.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoSris.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoSris.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoSris.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoSris.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Sriss"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteSris = new JLabelMe();

		this.jLabelColumnasSelectReporteSris.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteSris.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteSris.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteSris.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsSris = new GridBagConstraints();
		this.gridBagConstraintsSris.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSris.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSris.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoSris.add(this.jLabelColumnasSelectReporteSris, this.gridBagConstraintsSris);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteSris = new JList<Reporte>();
		this.jListColumnasSelectReporteSris.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteSris.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteSris.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteSris.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteSris.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteSris=new JScrollPane(this.jListColumnasSelectReporteSris);
			
			this.jScrollColumnasSelectReporteSris.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteSris.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteSris.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteSris.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsSris = new GridBagConstraints();
		this.gridBagConstraintsSris.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSris.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSris.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoSris.add(this.jListColumnasSelectReporteSris, this.gridBagConstraintsSris);
		this.jPanelReporteDinamicoSris.add(this.jScrollColumnasSelectReporteSris, this.gridBagConstraintsSris);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteSris = new JLabelMe();

		this.jLabelRelacionesSelectReporteSris.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteSris.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteSris.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteSris.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteSris = new JList<Reporte>();
		this.jListRelacionesSelectReporteSris.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteSris.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteSris.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteSris.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteSris.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteSris=new JScrollPane(this.jListRelacionesSelectReporteSris);
			
			this.jScrollRelacionesSelectReporteSris.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteSris.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteSris.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteSris.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoSris = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoSris = new JComboBoxMe();
		this.jListColumnasValoresGraficoSris = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoSris = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoSris.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoSris.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoSris.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoSris.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoSris, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoSris = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoSris.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoSris.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoSris.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoSris.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoSris, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoSris = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoSris.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoSris.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoSris.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoSris.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsSris = new GridBagConstraints();
		this.gridBagConstraintsSris.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSris.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSris.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoSris.add(this.jLabelGenerarExcelReporteDinamicoSris, this.gridBagConstraintsSris);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoSris = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoSris.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoSris,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoSris.setToolTipText("Generar EXCEL"+" "+SrisConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsSris = new GridBagConstraints();
		//this.gridBagConstraintsSris.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsSris.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsSris.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoSris.add(this.jButtonGenerarExcelReporteDinamicoSris, this.gridBagConstraintsSris);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsSris = new GridBagConstraints();
		this.gridBagConstraintsSris.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSris.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsSris.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoSris.add(this.jComboBoxTiposReportesDinamicoSris, this.gridBagConstraintsSris);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoSris = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoSris.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoSris.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoSris.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoSris.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsSris = new GridBagConstraints();
		this.gridBagConstraintsSris.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSris.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSris.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoSris.add(this.jLabelTiposArchivoReporteDinamicoSris, this.gridBagConstraintsSris);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsSris = new GridBagConstraints();
		this.gridBagConstraintsSris.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSris.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsSris.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoSris.add(this.jComboBoxTiposArchivosReportesDinamicoSris, this.gridBagConstraintsSris);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoSris = new JButtonMe();
		this.jButtonGenerarReporteDinamicoSris.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoSris,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoSris.setToolTipText("Generar"+" "+SrisConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsSris = new GridBagConstraints();
		this.gridBagConstraintsSris.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSris.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsSris.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoSris.add(this.jButtonGenerarReporteDinamicoSris, this.gridBagConstraintsSris);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoSris = new JButtonMe();
		this.jButtonCerrarReporteDinamicoSris.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoSris,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoSris.setToolTipText("Cancelar"+" "+SrisConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsSris = new GridBagConstraints();
		this.gridBagConstraintsSris.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSris.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsSris.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoSris.add(this.jButtonCerrarReporteDinamicoSris, this.gridBagConstraintsSris);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalSris = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoSris= new JScrollPane(jPanelReporteDinamicoSris,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoSris.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoSris.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoSris.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoSris.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Sriss"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsSris = new GridBagConstraints();
		this.gridBagConstraintsSris.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsSris.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsSris.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoSris.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoSris.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalSris);
		this.jInternalFrameReporteDinamicoSris.getContentPane().add(this.jScrollPanelReporteDinamicoSris, this.gridBagConstraintsSris);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionSris() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionSris = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionSris = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionSris.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionSris.setName("jPanelImportacionSris"); 
		
		this.jPanelImportacionSris.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionSris.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionSris.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionSris.setLayout(gridaBagLayoutImportacionSris);
		
		
		this.jInternalFrameImportacionSris= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionSris= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionSris = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteSris= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionSris.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionSris.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionSris.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionSris.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionSris.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionSris.setResizable(true);
	    this.jInternalFrameImportacionSris.setClosable(true);
	    this.jInternalFrameImportacionSris.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionSris.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionSris.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionSris.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionSris.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionSris.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionSris.setResizable(true);
	    this.jInternalFrameImportacionSris.setClosable(true);
	    this.jInternalFrameImportacionSris.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionSris.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionSris.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionSris.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionSris.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Sriss"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionSris = new JLabelMe();

		this.jLabelArchivoImportacionSris.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionSris.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionSris.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionSris.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsSris = new GridBagConstraints();
		this.gridBagConstraintsSris.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSris.gridy = iPosYImportacion;		
		this.gridBagConstraintsSris.gridx = iPosXImportacion++;
			
		this.jPanelImportacionSris.add(this.jLabelArchivoImportacionSris, this.gridBagConstraintsSris);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionSris = new JFileChooser();		
		this.jFileChooserImportacionSris.setToolTipText("ESCOGER ARCHIVO"+" "+SrisConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionSris = new JButtonMe();
		this.jButtonAbrirImportacionSris.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionSris,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionSris.setToolTipText("Generar"+" "+SrisConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsSris = new GridBagConstraints();
		this.gridBagConstraintsSris.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSris.gridy = iPosYImportacion;
		this.gridBagConstraintsSris.gridx = iPosXImportacion++;
							
		this.jPanelImportacionSris.add(this.jButtonAbrirImportacionSris, this.gridBagConstraintsSris);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionSris = new JLabelMe();

		this.jLabelPathArchivoImportacionSris.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionSris.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionSris.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionSris.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsSris = new GridBagConstraints();
		this.gridBagConstraintsSris.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSris.gridy = iPosYImportacion;		
		this.gridBagConstraintsSris.gridx = iPosXImportacion++;
			
		this.jPanelImportacionSris.add(this.jLabelPathArchivoImportacionSris, this.gridBagConstraintsSris);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionSris=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionSris.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionSris.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionSris.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsSris = new GridBagConstraints();
		this.gridBagConstraintsSris.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSris.gridy = iPosYImportacion;
		this.gridBagConstraintsSris.gridx = iPosXImportacion++;
							
		this.jPanelImportacionSris.add(this.jTextFieldPathArchivoImportacionSris, this.gridBagConstraintsSris);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionSris = new JButtonMe();
		this.jButtonGenerarImportacionSris.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionSris,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionSris.setToolTipText("Generar"+" "+SrisConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsSris = new GridBagConstraints();
		this.gridBagConstraintsSris.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSris.gridy = iPosYImportacion;
		this.gridBagConstraintsSris.gridx = iPosXImportacion++;
							
		this.jPanelImportacionSris.add(this.jButtonGenerarImportacionSris, this.gridBagConstraintsSris);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionSris = new JButtonMe();
		this.jButtonCerrarImportacionSris.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionSris,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionSris.setToolTipText("Cancelar"+" "+SrisConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsSris = new GridBagConstraints();
		this.gridBagConstraintsSris.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSris.gridy = iPosYImportacion;
		this.gridBagConstraintsSris.gridx = iPosXImportacion++;
							
		this.jPanelImportacionSris.add(this.jButtonCerrarImportacionSris, this.gridBagConstraintsSris);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalSris = new GridBagLayout();
		
		this.jScrollPanelImportacionSris= new JScrollPane(jPanelImportacionSris,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsSris = new GridBagConstraints();
		this.gridBagConstraintsSris.gridy =iPosYImportacion;
		this.gridBagConstraintsSris.gridx =iPosXImportacion;
		this.gridBagConstraintsSris.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionSris.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionSris.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalSris);
		this.jInternalFrameImportacionSris.getContentPane().add(this.jScrollPanelImportacionSris, this.gridBagConstraintsSris);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderBySris(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderBySris = new JButtonMe();
			this.jButtonAbrirOrderBySris.setText("Orden");
			this.jButtonAbrirOrderBySris.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderBySris,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderBySris, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderBySris";
			inputMap = this.jButtonAbrirOrderBySris.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderBySris.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySris"));
		
		
			GridBagLayout gridaBagLayoutOrderBySris = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderBySris = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderBySris.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderBySris.setName("jPanelOrderBySris"); 
			
			this.jPanelOrderBySris.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderBySris.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderBySris.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderBySris, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderBySris.setLayout(gridaBagLayoutOrderBySris);
			
			
			this.jTableDatosSrisOrderBy = new JTableMe();        
			this.jTableDatosSrisOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosSrisOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosSrisOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosSrisOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosSrisOrderBy.setViewportView(this.jTableDatosSrisOrderBy);
			this.jTableDatosSrisOrderBy.setFillsViewportHeight(true);
			this.jTableDatosSrisOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderBySris= new OrderByJInternalFrame();
			this.jInternalFrameOrderBySris= new OrderByJInternalFrame();
			this.jScrollPanelOrderBySris = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteSris= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderBySris.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderBySris.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderBySris.setTitle("Orden");
			this.jInternalFrameOrderBySris.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderBySris.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderBySris.setResizable(true);
			this.jInternalFrameOrderBySris.setClosable(true);
			this.jInternalFrameOrderBySris.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderBySris, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderBySris.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderBySris.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderBySris.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderBySris, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderBySris.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Sriss"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsSris = new GridBagConstraints();
			this.gridBagConstraintsSris.gridy =iPosYOrderBy++;
			this.gridBagConstraintsSris.gridx =iPosXOrderBy;
			this.gridBagConstraintsSris.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsSris.ipady =150;
				
			this.jPanelOrderBySris.add(jScrollPanelDatosSrisOrderBy, this.gridBagConstraintsSris);//this.jTableDatosSrisTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderBySris = new JButtonMe();
			this.jButtonCerrarOrderBySris.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderBySris,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderBySris.setToolTipText("Cancelar"+" "+SrisConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderBySris, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsSris = new GridBagConstraints();
			this.gridBagConstraintsSris.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSris.gridy = iPosYOrderBy++;
			this.gridBagConstraintsSris.gridx = iPosXOrderBy;
									
			this.jPanelOrderBySris.add(this.jButtonCerrarOrderBySris, this.gridBagConstraintsSris);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalSris = new GridBagLayout();
			
			this.jScrollPanelOrderBySris= new JScrollPane(jPanelOrderBySris,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsSris = new GridBagConstraints();
			this.gridBagConstraintsSris.gridy =iPosYOrderBy;
			this.gridBagConstraintsSris.gridx =iPosXOrderBy;
			this.gridBagConstraintsSris.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderBySris.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderBySris.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalSris);
			
			this.jInternalFrameOrderBySris.getContentPane().add(this.jScrollPanelOrderBySris, this.gridBagConstraintsSris);			
		
		} else {
			this.jButtonAbrirOrderBySris = new JButtonMe();
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
			&& this.srisSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosSris.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosSris.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosSris.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosSris.getRowHeight();//SrisConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.srisSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > SrisConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaSris.isSelected()) {
					iHeightTable=SrisConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < SrisConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=SrisConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > SrisConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaSris.isSelected()) {
					iHeightTable=SrisConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < SrisConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=SrisConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosSris.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosSris.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosSris.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosSris.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosSris.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosSris.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderBySris!=null && this.jInternalFrameOrderBySris.getjTableDatosOrderBy()!=null) {
			//if(!this.srisSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderBySris.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderBySris.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderBySris.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderBySris.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderBySris.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderBySris.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderBySris.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosSris.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosSris.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosSris.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=srisLogic.getSriss().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=sriss.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<Sris> TraerSrisBeans(List<Sris> sriss,ArrayList<Classe> classes)throws Exception {
		try {
			for(Sris sris:sriss) {
					
				if(!(SrisConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || SrisConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					sris.setsDetalleGeneralEntityReporte(SrisConstantesFunciones.getSrisDescripcion(sris));
										
						
					
						
					
				} else  {
							
					//sris.setsDetalleGeneralEntityReporte(sris.getsDetalleGeneralEntityReporte());
										
				}
				
				//srisbeans.add(srisbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return sriss;
    }
	//PARA REPORTES FIN
}
