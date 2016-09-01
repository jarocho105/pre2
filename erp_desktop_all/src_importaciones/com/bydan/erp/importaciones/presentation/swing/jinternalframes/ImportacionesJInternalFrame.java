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
package com.bydan.erp.importaciones.presentation.swing.jinternalframes;



import com.bydan.erp.importaciones.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.importaciones.presentation.swing.jinternalframes.*;
import com.bydan.erp.importaciones.presentation.swing.jinternalframes.auxiliar.*;





//import com.bydan.erp.importaciones.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.importaciones.business.entity.*;
import com.bydan.erp.importaciones.util.ImportacionesConstantesFunciones;

import com.bydan.erp.importaciones.business.logic.*;
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
public class ImportacionesJInternalFrame extends ImportacionesBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarImportaciones;
	
	protected JMenuBar jmenuBarImportaciones;
	
	protected JMenu jmenuImportaciones;
	protected JMenu jmenuDatosImportaciones;
	protected JMenu jmenuArchivoImportaciones;
	protected JMenu jmenuAccionesImportaciones;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosImportaciones = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutImportaciones;	
	protected GridBagConstraints gridBagConstraintsImportaciones;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public ImportacionesDetalleFormJInternalFrame jInternalFrameDetalleFormImportaciones;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoImportaciones;	
	protected ImportacionJInternalFrame jInternalFrameImportacionImportaciones;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public ImportacionesSessionBean importacionesSessionBean;
		
	
	
	
	//protected JDesktopPane jDesktopPane;
	public List<Importaciones> importacioness;		
	public List<Importaciones> importacionessEliminados;	
	public List<Importaciones> importacionessAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByImportaciones;		
	protected JButton jButtonAbrirOrderByImportaciones;
	
	
	//protected JPanel jPanelOrderByImportaciones;
	//public JScrollPane jScrollPanelOrderByImportaciones;	
	//protected JButton jButtonCerrarOrderByImportaciones;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public ImportacionesLogic importacionesLogic;
	
	
	
	public JScrollPane jScrollPanelDatosImportaciones;
	public JScrollPane jScrollPanelDatosEdicionImportaciones;
	public JScrollPane jScrollPanelDatosGeneralImportaciones;
    
	
	
	//public JScrollPane jScrollPanelDatosImportacionesOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoImportaciones;
	//public JScrollPane jScrollPanelImportacionImportaciones;
	
	
	
	protected JPanel jPanelAccionesImportaciones;
	
    protected JPanel jPanelPaginacionImportaciones;
    protected JPanel jPanelParametrosReportesImportaciones;
	protected JPanel jPanelParametrosReportesAccionesImportaciones;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1Importaciones;
	protected JPanel jPanelParametrosAuxiliar2Importaciones;
	protected JPanel jPanelParametrosAuxiliar3Importaciones;
	protected JPanel jPanelParametrosAuxiliar4Importaciones;
	//protected JPanel jPanelParametrosAuxiliar5Importaciones;
	
	
	
	//protected JPanel jPanelReporteDinamicoImportaciones;
	//protected JPanel jPanelImportacionImportaciones;
	
	
	public JTable jTableDatosImportaciones;
	
	
	
	//public JTable jTableDatosImportacionesOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoImportaciones;
	protected JButton jButtonDuplicarImportaciones;
	protected JButton jButtonCopiarImportaciones;
	protected JButton jButtonVerFormImportaciones;
	protected JButton jButtonNuevoRelacionesImportaciones;
	protected JButton jButtonModificarImportaciones;
	
    protected JButton jButtonGuardarCambiosTablaImportaciones;
	protected JButton jButtonCerrarImportaciones;
	
	
	protected JButton jButtonRecargarInformacionImportaciones;
	protected JButton jButtonProcesarInformacionImportaciones;
	
	
	protected JButton jButtonAnterioresImportaciones;
	protected JButton jButtonSiguientesImportaciones;
	protected JButton jButtonNuevoGuardarCambiosImportaciones;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoImportaciones;
	//protected JButton jButtonCerrarReporteDinamicoImportaciones;
	//protected JButton jButtonGenerarExcelReporteDinamicoImportaciones;	
	
	
	
	//protected JButton jButtonAbrirImportacionImportaciones;
	//protected JButton jButtonGenerarImportacionImportaciones;
	//protected JButton jButtonCerrarImportacionImportaciones;
	//protected JFileChooser jFileChooserImportacionImportaciones;
	//protected File fileImportacionImportaciones;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarImportaciones;
	protected JButton jButtonDuplicarToolBarImportaciones;
	protected JButton jButtonNuevoRelacionesToolBarImportaciones;
	
	
	public JButton jButtonGuardarCambiosToolBarImportaciones;
	protected JButton jButtonCopiarToolBarImportaciones;
	protected JButton jButtonVerFormToolBarImportaciones;
	public JButton jButtonGuardarCambiosTablaToolBarImportaciones;
	protected JButton jButtonMostrarOcultarTablaToolBarImportaciones;
	protected JButton jButtonCerrarToolBarImportaciones;
	
	protected JButton jButtonRecargarInformacionToolBarImportaciones;
	protected JButton jButtonProcesarInformacionToolBarImportaciones;
	protected JButton jButtonAnterioresToolBarImportaciones;
	protected JButton jButtonSiguientesToolBarImportaciones;
	protected JButton jButtonNuevoGuardarCambiosToolBarImportaciones;
	protected JButton jButtonAbrirOrderByToolBarImportaciones;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoImportaciones;
	protected JMenuItem jMenuItemDuplicarImportaciones;
	protected JMenuItem jMenuItemNuevoRelacionesImportaciones;
	
	
	protected JMenuItem jMenuItemGuardarCambiosImportaciones;
	protected JMenuItem jMenuItemCopiarImportaciones;
	protected JMenuItem jMenuItemVerFormImportaciones;
	protected JMenuItem jMenuItemGuardarCambiosTablaImportaciones;
	protected JMenuItem jMenuItemCerrarImportaciones;
	protected JMenuItem jMenuItemDetalleCerrarImportaciones;
	protected JMenuItem jMenuItemDetalleAbrirOrderByImportaciones;
	protected JMenuItem jMenuItemDetalleMostarOcultarImportaciones;
	
	protected JMenuItem jMenuItemRecargarInformacionImportaciones;
	protected JMenuItem jMenuItemProcesarInformacionImportaciones;
	protected JMenuItem jMenuItemAnterioresImportaciones;
	protected JMenuItem jMenuItemSiguientesImportaciones;
	protected JMenuItem jMenuItemNuevoGuardarCambiosImportaciones;
	protected JMenuItem jMenuItemAbrirOrderByImportaciones;
	protected JMenuItem jMenuItemMostrarOcultarImportaciones;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesImportaciones;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosImportaciones;
	protected JCheckBox jCheckBoxSeleccionadosImportaciones;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaImportaciones;
	protected JCheckBox jCheckBoxConGraficoReporteImportaciones;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesImportaciones;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesImportaciones;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoImportaciones;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoImportaciones;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesImportaciones;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionImportaciones;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesImportaciones;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesImportaciones;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarImportaciones;
	protected JTextField jTextFieldValorCampoGeneralImportaciones;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteImportaciones;
	//public JList<Reporte> jListColumnasSelectReporteImportaciones;
	//public JScrollPane jScrollColumnasSelectReporteImportaciones;
	
	//public JLabel jLabelRelacionesSelectReporteImportaciones;
	//public JList<Reporte> jListRelacionesSelectReporteImportaciones;
	//public JScrollPane jScrollRelacionesSelectReporteImportaciones;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoImportaciones;
	//protected JCheckBox jCheckBoxConGraficoDinamicoImportaciones;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoImportaciones;
	//public JLabel jLabelTiposArchivoReporteDinamicoImportaciones;
	
		
	//public JLabel jLabelArchivoImportacionImportaciones;	
	//public JLabel jLabelPathArchivoImportacionImportaciones;
	//protected JTextField jTextFieldPathArchivoImportacionImportaciones;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoImportaciones;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoImportaciones;
	
	//public JLabel jLabelColumnaCategoriaValorImportaciones;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorImportaciones;
	
	//public JLabel jLabelColumnasValoresGraficoImportaciones;
	//public JList<Reporte> jListColumnasValoresGraficoImportaciones;
	//public JScrollPane jScrollColumnasValoresGraficoImportaciones;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoImportaciones;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoImportaciones;	
	
	
	
	
	
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
	public ImportacionesJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("Importaciones No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ImportacionesJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Importaciones No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ImportacionesJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Importaciones No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ImportacionesJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Importaciones No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionImportaciones)	{
		this.jButtonRecargarInformacionImportaciones = jButtonRecargarInformacionImportaciones;
	}
	
	public JButton getjButtonProcesarInformacionImportaciones() {
		return this.jButtonProcesarInformacionImportaciones;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionImportaciones)	{
		this.jButtonProcesarInformacionImportaciones = jButtonProcesarInformacionImportaciones;
	}
	
	
	public JButton getjButtonRecargarInformacionImportaciones() {
		return this.jButtonRecargarInformacionImportaciones;
	}
	
	
	public List<Importaciones> getimportacioness() {
		return this.importacioness;
	}

	public void setimportacioness(List<Importaciones> importacioness) {
		this.importacioness = importacioness;
	}
	
	public List<Importaciones> getimportacionessAux() {
		return this.importacionessAux;
	}

	public void setimportacionessAux(List<Importaciones> importacionessAux) {
		this.importacionessAux = importacionessAux;
	}
	
	public List<Importaciones> getimportacionessEliminados() {
		return this.importacionessEliminados;
	}

	public void setImportacionessEliminados(List<Importaciones> importacionessEliminados) {
		this.importacionessEliminados = importacionessEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarImportaciones() {
		return jComboBoxTiposSeleccionarImportaciones;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarImportaciones(
			JComboBox jComboBoxTiposSeleccionarImportaciones) {
		this.jComboBoxTiposSeleccionarImportaciones = jComboBoxTiposSeleccionarImportaciones;
	}
	
	public void setBorderResaltarTiposSeleccionarImportaciones() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarImportaciones.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarImportaciones .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralImportaciones() {
		return jTextFieldValorCampoGeneralImportaciones;
	}

	public void setjTextFieldValorCampoGeneralImportaciones(
			JTextField jTextFieldValorCampoGeneralImportaciones) {
		this.jTextFieldValorCampoGeneralImportaciones = jTextFieldValorCampoGeneralImportaciones;
	}

	public void setBorderResaltarValorCampoGeneralImportaciones() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarImportaciones.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralImportaciones .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosImportaciones() {
		return this.jCheckBoxSeleccionarTodosImportaciones;
	}

	public void setjCheckBoxSeleccionarTodosImportaciones(
			JCheckBox jCheckBoxSeleccionarTodosImportaciones) {
		this.jCheckBoxSeleccionarTodosImportaciones = jCheckBoxSeleccionarTodosImportaciones;
	}

	public void setBorderResaltarSeleccionarTodosImportaciones() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarImportaciones.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosImportaciones .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosImportaciones() {
		return this.jCheckBoxSeleccionadosImportaciones;
	}

	public void setjCheckBoxSeleccionadosImportaciones(
			JCheckBox jCheckBoxSeleccionadosImportaciones) {
		this.jCheckBoxSeleccionadosImportaciones = jCheckBoxSeleccionadosImportaciones;
	}
	
	public void setBorderResaltarSeleccionadosImportaciones() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarImportaciones.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosImportaciones .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesImportaciones() {
		return this.jComboBoxTiposArchivosReportesImportaciones;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesImportaciones(
			JComboBox jComboBoxTiposArchivosReportesImportaciones) {
		this.jComboBoxTiposArchivosReportesImportaciones = jComboBoxTiposArchivosReportesImportaciones;
	}

	public void setBorderResaltarTiposArchivosReportesImportaciones() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarImportaciones.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesImportaciones .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesImportaciones() {
		return this.jComboBoxTiposReportesImportaciones;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesImportaciones(
			JComboBox jComboBoxTiposReportesImportaciones) {
		this.jComboBoxTiposReportesImportaciones = jComboBoxTiposReportesImportaciones;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoImportaciones() {
	//	return jComboBoxTiposReportesDinamicoImportaciones;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoImportaciones(
	//		JComboBox jComboBoxTiposReportesDinamicoImportaciones) {
	//	this.jComboBoxTiposReportesDinamicoImportaciones = jComboBoxTiposReportesDinamicoImportaciones;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoImportaciones() {
	//	return jComboBoxTiposArchivosReportesDinamicoImportaciones;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoImportaciones(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoImportaciones) {
	//	this.jComboBoxTiposArchivosReportesDinamicoImportaciones = jComboBoxTiposArchivosReportesDinamicoImportaciones;
	//}
	
	public void setBorderResaltarTiposReportesImportaciones() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarImportaciones.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesImportaciones .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesImportaciones() {
		return this.jComboBoxTiposGraficosReportesImportaciones;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesImportaciones(
			JComboBox jComboBoxTiposGraficosReportesImportaciones) {
		this.jComboBoxTiposGraficosReportesImportaciones = jComboBoxTiposGraficosReportesImportaciones;
	}
	
	public void setBorderResaltarTiposGraficosReportesImportaciones() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarImportaciones.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesImportaciones .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionImportaciones() {
		return this.jComboBoxTiposPaginacionImportaciones;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionImportaciones(
			JComboBox jComboBoxTiposPaginacionImportaciones) {
		this.jComboBoxTiposPaginacionImportaciones = jComboBoxTiposPaginacionImportaciones;
	}
	
	public void setBorderResaltarTiposPaginacionImportaciones() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarImportaciones.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionImportaciones .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesImportaciones() {
		return this.jComboBoxTiposRelacionesImportaciones;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesImportaciones() {
		return this.jComboBoxTiposAccionesImportaciones;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesImportaciones(
			JComboBox jComboBoxTiposRelacionesImportaciones) {
		this.jComboBoxTiposRelacionesImportaciones = jComboBoxTiposRelacionesImportaciones;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesImportaciones(
			JComboBox jComboBoxTiposAccionesImportaciones) {
		this.jComboBoxTiposAccionesImportaciones = jComboBoxTiposAccionesImportaciones;
	}
	
	public void setBorderResaltarTiposRelacionesImportaciones() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarImportaciones.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesImportaciones .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesImportaciones() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarImportaciones.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesImportaciones .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoImportaciones() {
	//	return jCheckBoxConGraficoDinamicoImportaciones;
	//}

	//public void setjCheckBoxConGraficoDinamicoImportaciones(
	//		JCheckBox jCheckBoxConGraficoDinamicoImportaciones) {
	//	this.jCheckBoxConGraficoDinamicoImportaciones = jCheckBoxConGraficoDinamicoImportaciones;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoImportaciones() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarImportaciones.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoImportaciones .setBorder(borderResaltar);		
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
		this.importacionesSessionBean=new ImportacionesSessionBean();
		
		this.importacionesSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.importacionesSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.importacionesSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=ImportacionesJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=ImportacionesJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ImportacionesJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ImportacionesJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ImportacionesJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Importaciones MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 650) {
			iHeight=650;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.importacionesSessionBean.getEsGuardarRelacionado()) {
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
		
		ImportacionesJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("Importaciones No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarImportaciones= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarImportaciones=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarImportaciones,this.jTtoolBarImportaciones,
							"nuevo","nuevo","Nuevo"+" "+ImportacionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarImportaciones=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarImportaciones,this.jTtoolBarImportaciones,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarImportaciones=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarImportaciones,this.jTtoolBarImportaciones,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+ImportacionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarImportaciones=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarImportaciones,this.jTtoolBarImportaciones,
							"duplicar","duplicar","Duplicar"+" "+ImportacionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarImportaciones=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarImportaciones,this.jTtoolBarImportaciones,
							"copiar","copiar","Copiar"+" "+ImportacionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarImportaciones=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarImportaciones,this.jTtoolBarImportaciones,
							"ver_form","ver_form","Ver"+" "+ImportacionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarImportaciones=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarImportaciones,this.jTtoolBarImportaciones,
							"recargar","recargar","Recargar"+" "+ImportacionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarImportaciones=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarImportaciones,this.jTtoolBarImportaciones,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarImportaciones=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarImportaciones,this.jTtoolBarImportaciones,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarImportaciones=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarImportaciones,this.jTtoolBarImportaciones,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarImportaciones=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarImportaciones,this.jTtoolBarImportaciones,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarImportaciones=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarImportaciones,this.jTtoolBarImportaciones,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+ImportacionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarImportaciones=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarImportaciones,this.jTtoolBarImportaciones,
							"cerrar","cerrar","Salir"+" "+ImportacionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarImportaciones=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarImportaciones;
			
				this.jButtonProcesarInformacionToolBarImportaciones=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarImportaciones;
				
		//protected JButton jButtonModificarToolBarImportaciones;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarImportaciones=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuImportaciones=new JMenuMe("General");
		this.jmenuArchivoImportaciones=new JMenuMe("Archivo");
		this.jmenuAccionesImportaciones=new JMenuMe("Acciones");
		this.jmenuDatosImportaciones=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoImportaciones= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoImportaciones.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoImportaciones,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoImportaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarImportaciones= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarImportaciones.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarImportaciones,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarImportaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesImportaciones= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesImportaciones.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesImportaciones,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesImportaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosImportaciones= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosImportaciones.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosImportaciones,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosImportaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarImportaciones= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarImportaciones.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarImportaciones,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarImportaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormImportaciones= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormImportaciones.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormImportaciones,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormImportaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaImportaciones= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaImportaciones.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaImportaciones,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaImportaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarImportaciones= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarImportaciones.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarImportaciones,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarImportaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionImportaciones= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionImportaciones.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionImportaciones,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionImportaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionImportaciones= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionImportaciones.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionImportaciones,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresImportaciones= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresImportaciones.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresImportaciones,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresImportaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesImportaciones= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesImportaciones.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesImportaciones,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesImportaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByImportaciones= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByImportaciones.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByImportaciones,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByImportaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarImportaciones= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarImportaciones.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarImportaciones,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarImportaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByImportaciones= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByImportaciones.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByImportaciones,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByImportaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarImportaciones= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarImportaciones.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarImportaciones,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarImportaciones, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosImportaciones= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosImportaciones.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosImportaciones,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosImportaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoImportaciones.add(this.jMenuItemCerrarImportaciones);
			
			this.jmenuAccionesImportaciones.add(this.jMenuItemNuevoImportaciones);
			this.jmenuAccionesImportaciones.add(this.jMenuItemNuevoGuardarCambiosImportaciones);
			this.jmenuAccionesImportaciones.add(this.jMenuItemNuevoRelacionesImportaciones);
			this.jmenuAccionesImportaciones.add(this.jMenuItemGuardarCambiosTablaImportaciones);		
			this.jmenuAccionesImportaciones.add(this.jMenuItemDuplicarImportaciones);		
			this.jmenuAccionesImportaciones.add(this.jMenuItemCopiarImportaciones);		
			this.jmenuAccionesImportaciones.add(this.jMenuItemVerFormImportaciones);		
			
			this.jmenuDatosImportaciones.add(this.jMenuItemRecargarInformacionImportaciones);				
			this.jmenuDatosImportaciones.add(this.jMenuItemAnterioresImportaciones);				
			this.jmenuDatosImportaciones.add(this.jMenuItemSiguientesImportaciones);				
			this.jmenuDatosImportaciones.add(this.jMenuItemAbrirOrderByImportaciones);				
			this.jmenuDatosImportaciones.add(this.jMenuItemMostrarOcultarImportaciones);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesImportaciones.add(this.jMenuItemGuardarCambiosImportaciones);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoImportaciones, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesImportaciones, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosImportaciones, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarImportaciones.add(this.jmenuArchivoImportaciones);		
			this.jmenuBarImportaciones.add(this.jmenuAccionesImportaciones);		
			this.jmenuBarImportaciones.add(this.jmenuDatosImportaciones);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarImportaciones);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasImportaciones() {
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
			//this.jInternalFrameDetalleImportaciones = new ImportacionesDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Importaciones DATOS");
			this.jInternalFrameDetalleFormImportaciones = new ImportacionesDetalleFormJInternalFrame(jDesktopPane,this.importacionesSessionBean.getConGuardarRelaciones(),this.importacionesSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormImportaciones = null;//new ImportacionesDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutImportaciones= new GridBagLayout();
		
		
		this.jTableDatosImportaciones = new JTableMe();      
		
		String sToolTipImportaciones="";
		sToolTipImportaciones=ImportacionesConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipImportaciones+="(Importaciones.Importaciones)";
		}
		
		if(!this.importacionesSessionBean.getEsGuardarRelacionado()) {
			sToolTipImportaciones+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosImportaciones.setToolTipText(sToolTipImportaciones);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosImportaciones);
		this.jTableDatosImportaciones.setAutoCreateRowSorter(true);
		this.jTableDatosImportaciones.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosImportaciones.setRowSelectionAllowed(true);
		this.jTableDatosImportaciones.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosImportaciones,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoImportaciones = new JButtonMe();
		this.jButtonDuplicarImportaciones = new JButtonMe();
		this.jButtonCopiarImportaciones = new JButtonMe();
		this.jButtonVerFormImportaciones = new JButtonMe();
		this.jButtonNuevoRelacionesImportaciones = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaImportaciones = new JButtonMe();
		this.jButtonCerrarImportaciones = new JButtonMe();
		
		this.jScrollPanelDatosImportaciones = new JScrollPane();   
        this.jScrollPanelDatosGeneralImportaciones = new JScrollPane();
		
				
		
		
		this.jPanelAccionesImportaciones = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Importaciones";
		
		if(!this.importacionesSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosImportaciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Importacioneses" + this.sPath));
		} else {
			this.jScrollPanelDatosImportaciones.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralImportaciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesImportaciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesImportaciones.setToolTipText("Acciones");
        this.jPanelAccionesImportaciones.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralImportaciones, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosImportaciones, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoImportaciones=new ReporteDinamicoJInternalFrame(ImportacionesConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoImportaciones();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionImportaciones=new ImportacionJInternalFrame(ImportacionesConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionImportaciones();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByImportaciones = new JButtonMe();
		
		this.jButtonAbrirOrderByImportaciones.setText("Orden");
		this.jButtonAbrirOrderByImportaciones.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByImportaciones,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByImportaciones, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByImportaciones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByImportaciones.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByImportaciones=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByImportaciones,false,this);
			
			//this.cargarOrderByImportaciones(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByImportaciones=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByImportaciones,true,this);
			
			//this.cargarOrderByImportaciones(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosImportaciones.setMinimumSize(new Dimension(400,50));//330
		this.jTableDatosImportaciones.setMaximumSize(new Dimension(400,50));//330
		this.jTableDatosImportaciones.setPreferredSize(new Dimension(400,50));//330
		
		this.jScrollPanelDatosImportaciones.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosImportaciones.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosImportaciones.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoImportaciones.setText("Nuevo");
		this.jButtonDuplicarImportaciones.setText("Duplicar");
		this.jButtonCopiarImportaciones.setText("Copiar");
		this.jButtonVerFormImportaciones.setText("Ver");
		this.jButtonNuevoRelacionesImportaciones.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaImportaciones.setText("Guardar");
		this.jButtonCerrarImportaciones.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoImportaciones,"nuevo_button","Nuevo",this.importacionesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarImportaciones,"duplicar_button","Duplicar",this.importacionesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarImportaciones,"copiar_button","Copiar",this.importacionesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormImportaciones,"ver_form","Ver",this.importacionesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesImportaciones,"nuevorelaciones_button","Nuevo Rel",this.importacionesSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaImportaciones,"guardarcambiostabla_button","Guardar",this.importacionesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportaciones,"cerrar_button","Salir",this.importacionesSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoImportaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarImportaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarImportaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormImportaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesImportaciones, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaImportaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarImportaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoImportaciones.setToolTipText("Nuevo"+" "+ImportacionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarImportaciones.setToolTipText("Duplicar"+" "+ImportacionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarImportaciones.setToolTipText("Copiar"+" "+ImportacionesConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormImportaciones.setToolTipText("Ver"+" "+ImportacionesConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesImportaciones.setToolTipText("Nuevo Rel"+" "+ImportacionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaImportaciones.setToolTipText("Guardar"+" "+ImportacionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarImportaciones.setToolTipText("Salir"+" "+ImportacionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoImportaciones";
		inputMap = this.jButtonNuevoImportaciones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoImportaciones.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoImportaciones"));
		
		//DUPLICAR
		sMapKey = "DuplicarImportaciones";
		inputMap = this.jButtonDuplicarImportaciones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarImportaciones.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarImportaciones"));
		
		//COPIAR
		sMapKey = "CopiarImportaciones";
		inputMap = this.jButtonCopiarImportaciones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarImportaciones.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarImportaciones"));
		
		//VEr FORM
		sMapKey = "VerFormImportaciones";
		inputMap = this.jButtonVerFormImportaciones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormImportaciones.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormImportaciones"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesImportaciones";
		inputMap = this.jButtonNuevoRelacionesImportaciones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesImportaciones.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesImportaciones"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarImportaciones";
		inputMap = this.jButtonModificarImportaciones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarImportaciones.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarImportaciones"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarImportaciones";
		inputMap = this.jButtonCerrarImportaciones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarImportaciones.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarImportaciones"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaImportaciones";
		inputMap = this.jButtonGuardarCambiosTablaImportaciones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaImportaciones.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaImportaciones"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesImportaciones = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesImportaciones = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionImportaciones = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1Importaciones= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2Importaciones= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3Importaciones= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4Importaciones= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5Importaciones= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesImportaciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesImportaciones.setName("jPanelParametrosReportesImportaciones"); 
		
		this.jPanelParametrosReportesAccionesImportaciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesImportaciones.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesImportaciones.setName("jPanelParametrosReportesAccionesImportaciones"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesImportaciones, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesImportaciones, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionImportaciones = new JButtonMe();
		this.jButtonRecargarInformacionImportaciones.setText("Recargar");
		this.jButtonRecargarInformacionImportaciones.setToolTipText("Recargar"+" "+ImportacionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionImportaciones,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionImportaciones = new JButtonMe();
		this.jButtonProcesarInformacionImportaciones.setText("Procesar");
		this.jButtonProcesarInformacionImportaciones.setToolTipText("Procesar"+" "+ImportacionesConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionImportaciones.setVisible(false);
			
		this.jButtonProcesarInformacionImportaciones.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionImportaciones.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionImportaciones.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesImportaciones = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesImportaciones.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesImportaciones.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesImportaciones = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesImportaciones.setText("TIPO");       
		this.jComboBoxTiposReportesImportaciones.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesImportaciones = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesImportaciones.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesImportaciones.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionImportaciones = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionImportaciones.setText("Paginacion");
		this.jComboBoxTiposPaginacionImportaciones.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesImportaciones = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesImportaciones.setText("Accion");
		this.jComboBoxTiposRelacionesImportaciones.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesImportaciones = new JComboBoxMe();
		//this.jComboBoxTiposAccionesImportaciones.setText("Accion");
		this.jComboBoxTiposAccionesImportaciones.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarImportaciones = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarImportaciones.setText("Accion");
		this.jComboBoxTiposSeleccionarImportaciones.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralImportaciones=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralImportaciones.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralImportaciones.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralImportaciones.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesImportaciones = new JLabelMe();
		
		this.jLabelAccionesImportaciones.setText("Acciones");		
		this.jLabelAccionesImportaciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesImportaciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesImportaciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosImportaciones = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosImportaciones.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosImportaciones.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosImportaciones = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosImportaciones.setText("Seleccionados");
		this.jCheckBoxSeleccionadosImportaciones.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaImportaciones = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaImportaciones.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaImportaciones.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteImportaciones = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteImportaciones.setText("Graf.");
		this.jCheckBoxConGraficoReporteImportaciones.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresImportaciones = new JButtonMe();
		//this.jButtonAnterioresImportaciones.setText("<<");
        this.jButtonAnterioresImportaciones.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresImportaciones,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresImportaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesImportaciones = new JButtonMe();
		//this.jButtonSiguientesImportaciones.setText(">>");
        this.jButtonSiguientesImportaciones.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesImportaciones,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesImportaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosImportaciones = new JButtonMe();
		this.jButtonNuevoGuardarCambiosImportaciones.setText("Nue");
        this.jButtonNuevoGuardarCambiosImportaciones.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosImportaciones,"nuevoguardarcambios_button","Nue",this.importacionesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosImportaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosImportaciones";
		inputMap = this.jButtonNuevoGuardarCambiosImportaciones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosImportaciones.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosImportaciones"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionImportaciones";
		inputMap = this.jButtonRecargarInformacionImportaciones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionImportaciones.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionImportaciones"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesImportaciones";
		inputMap = this.jButtonSiguientesImportaciones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesImportaciones.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesImportaciones"));
		
		//ANTERIORES		
		sMapKey = "AnterioresImportaciones";
		inputMap = this.jButtonAnterioresImportaciones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresImportaciones.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresImportaciones"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasImportaciones();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesImportaciones.setMinimumSize(new Dimension(this.getWidth(),ImportacionesBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ImportacionesBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesImportaciones.setMaximumSize(new Dimension(this.getWidth(),ImportacionesBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ImportacionesBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesImportaciones.setPreferredSize(new Dimension(this.getWidth(),ImportacionesBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ImportacionesBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionImportaciones = new GridBagLayout();

			this.jPanelPaginacionImportaciones.setLayout(gridaBagLayoutPaginacionImportaciones);						
			
			this.gridBagConstraintsImportaciones = new GridBagConstraints();
			this.gridBagConstraintsImportaciones.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsImportaciones.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsImportaciones.gridy = 0;
			this.gridBagConstraintsImportaciones.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionImportaciones.add(this.jButtonAnterioresImportaciones, this.gridBagConstraintsImportaciones);
					
						
			this.gridBagConstraintsImportaciones = new GridBagConstraints();
			this.gridBagConstraintsImportaciones.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsImportaciones.gridy = 0;
			
			this.jPanelPaginacionImportaciones.add(this.jButtonNuevoGuardarCambiosImportaciones, this.gridBagConstraintsImportaciones);
						
			
			this.gridBagConstraintsImportaciones = new GridBagConstraints();
			this.gridBagConstraintsImportaciones.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsImportaciones.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsImportaciones.gridy = 0;
			this.jPanelPaginacionImportaciones.add(this.jButtonSiguientesImportaciones, this.gridBagConstraintsImportaciones);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsImportaciones = new GridBagConstraints();
			this.gridBagConstraintsImportaciones.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsImportaciones.gridy = 1;
			this.gridBagConstraintsImportaciones.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionImportaciones.add(this.jButtonNuevoImportaciones, this.gridBagConstraintsImportaciones);
						
			
			
			if(!this.importacionesSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsImportaciones = new GridBagConstraints();
				this.gridBagConstraintsImportaciones.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsImportaciones.gridy = 1;
				this.gridBagConstraintsImportaciones.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionImportaciones.add(this.jButtonGuardarCambiosTablaImportaciones, this.gridBagConstraintsImportaciones);
			}
			
			
			
			this.gridBagConstraintsImportaciones = new GridBagConstraints();
			this.gridBagConstraintsImportaciones.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsImportaciones.gridy = 1;
			this.gridBagConstraintsImportaciones.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionImportaciones.add(this.jButtonDuplicarImportaciones, this.gridBagConstraintsImportaciones);
			
			this.gridBagConstraintsImportaciones = new GridBagConstraints();
			this.gridBagConstraintsImportaciones.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsImportaciones.gridy = 1;
			this.gridBagConstraintsImportaciones.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionImportaciones.add(this.jButtonCopiarImportaciones, this.gridBagConstraintsImportaciones);
		
			this.gridBagConstraintsImportaciones = new GridBagConstraints();
			this.gridBagConstraintsImportaciones.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsImportaciones.gridy = 1;
			this.gridBagConstraintsImportaciones.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionImportaciones.add(this.jButtonVerFormImportaciones, this.gridBagConstraintsImportaciones);
		
			this.gridBagConstraintsImportaciones = new GridBagConstraints();
			this.gridBagConstraintsImportaciones.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsImportaciones.gridy = 1;
			this.gridBagConstraintsImportaciones.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionImportaciones.add(this.jButtonCerrarImportaciones, this.gridBagConstraintsImportaciones);
		
		
		
		this.jButtonRecargarInformacionImportaciones.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionImportaciones.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionImportaciones.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionImportaciones, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesImportaciones.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesImportaciones.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesImportaciones.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesImportaciones, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesImportaciones.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesImportaciones.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesImportaciones.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesImportaciones, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesImportaciones.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesImportaciones.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesImportaciones.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesImportaciones, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionImportaciones.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionImportaciones.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionImportaciones.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionImportaciones, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesImportaciones.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesImportaciones.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesImportaciones.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesImportaciones, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesImportaciones.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesImportaciones.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesImportaciones.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesImportaciones, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarImportaciones.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarImportaciones.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarImportaciones.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarImportaciones, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaImportaciones.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaImportaciones.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaImportaciones.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaImportaciones, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteImportaciones.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteImportaciones.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteImportaciones.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteImportaciones, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosImportaciones.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosImportaciones.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosImportaciones.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosImportaciones, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosImportaciones.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosImportaciones.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosImportaciones.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosImportaciones, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesImportaciones = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesImportaciones = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1Importaciones = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2Importaciones = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3Importaciones = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4Importaciones = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesImportaciones.setLayout(gridaBagParametrosReportesImportaciones);
			this.jPanelParametrosReportesAccionesImportaciones.setLayout(gridaBagParametrosReportesAccionesImportaciones);
			
			
			this.jPanelParametrosAuxiliar1Importaciones.setLayout(gridaBagParametrosAuxiliar1Importaciones);
			this.jPanelParametrosAuxiliar2Importaciones.setLayout(gridaBagParametrosAuxiliar2Importaciones);
			this.jPanelParametrosAuxiliar3Importaciones.setLayout(gridaBagParametrosAuxiliar3Importaciones);
			this.jPanelParametrosAuxiliar4Importaciones.setLayout(gridaBagParametrosAuxiliar4Importaciones);
			//this.jPanelParametrosAuxiliar5Importaciones.setLayout(gridaBagParametrosAuxiliar2Importaciones);			
			
			
			
			
			this.gridBagConstraintsImportaciones = new GridBagConstraints();
			this.gridBagConstraintsImportaciones.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsImportaciones.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsImportaciones.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesImportaciones.add(this.jButtonRecargarInformacionImportaciones, this.gridBagConstraintsImportaciones);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsImportaciones = new GridBagConstraints();
			this.gridBagConstraintsImportaciones.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsImportaciones.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsImportaciones.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Importaciones.add(this.jComboBoxTiposPaginacionImportaciones, this.gridBagConstraintsImportaciones);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsImportaciones = new GridBagConstraints();
			this.gridBagConstraintsImportaciones.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsImportaciones.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsImportaciones.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Importaciones.add(this.jCheckBoxConAltoMaximoTablaImportaciones, this.gridBagConstraintsImportaciones);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsImportaciones = new GridBagConstraints();
			this.gridBagConstraintsImportaciones.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsImportaciones.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsImportaciones.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Importaciones.add(this.jComboBoxTiposArchivosReportesImportaciones, this.gridBagConstraintsImportaciones);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsImportaciones = new GridBagConstraints();
			this.gridBagConstraintsImportaciones.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsImportaciones.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsImportaciones.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesImportaciones.add(this.jPanelParametrosAuxiliar1Importaciones, this.gridBagConstraintsImportaciones);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsImportaciones = new GridBagConstraints();
			this.gridBagConstraintsImportaciones.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsImportaciones.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsImportaciones.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsImportaciones.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4Importaciones.add(this.jComboBoxTiposReportesImportaciones, this.gridBagConstraintsImportaciones);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsImportaciones = new GridBagConstraints();
			this.gridBagConstraintsImportaciones.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsImportaciones.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsImportaciones.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesImportaciones.add(this.jPanelParametrosAuxiliar4Importaciones, this.gridBagConstraintsImportaciones);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsImportaciones = new GridBagConstraints();
			this.gridBagConstraintsImportaciones.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsImportaciones.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsImportaciones.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesImportaciones.add(this.jComboBoxTiposReportesImportaciones, this.gridBagConstraintsImportaciones);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsImportaciones = new GridBagConstraints();
			this.gridBagConstraintsImportaciones.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsImportaciones.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsImportaciones.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesImportaciones.add(this.jCheckBoxGenerarReporteImportaciones, this.gridBagConstraintsImportaciones);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsImportaciones = new GridBagConstraints();
			this.gridBagConstraintsImportaciones.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsImportaciones.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsImportaciones.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesImportaciones.add(this.jPanelParametrosAuxiliar2Importaciones, this.gridBagConstraintsImportaciones);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsImportaciones = new GridBagConstraints();
			this.gridBagConstraintsImportaciones.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsImportaciones.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsImportaciones.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesImportaciones.add(this.jLabelAccionesImportaciones, this.gridBagConstraintsImportaciones);
			*/
			
			//DEJA UN ESPACIO CUANDO ES MODULO, UNO A UNO FK O PROCESO
			 iGridxParametrosReportes++;
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsImportaciones = new GridBagConstraints();
			this.gridBagConstraintsImportaciones.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsImportaciones.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsImportaciones.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesImportaciones.add(this.jComboBoxTiposSeleccionarImportaciones, this.gridBagConstraintsImportaciones);			
			
			
			/*
			this.gridBagConstraintsImportaciones = new GridBagConstraints();
			this.gridBagConstraintsImportaciones.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsImportaciones.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsImportaciones.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesImportaciones.add(this.jCheckBoxSeleccionarTodosImportaciones, this.gridBagConstraintsImportaciones);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsImportaciones = new GridBagConstraints();
			this.gridBagConstraintsImportaciones.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsImportaciones.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsImportaciones.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsImportaciones.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Importaciones.add(this.jCheckBoxSeleccionarTodosImportaciones, this.gridBagConstraintsImportaciones);															
				
			this.gridBagConstraintsImportaciones = new GridBagConstraints();
			this.gridBagConstraintsImportaciones.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsImportaciones.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsImportaciones.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsImportaciones.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Importaciones.add(this.jCheckBoxSeleccionadosImportaciones, this.gridBagConstraintsImportaciones);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsImportaciones = new GridBagConstraints();
			this.gridBagConstraintsImportaciones.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsImportaciones.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsImportaciones.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesImportaciones.add(this.jPanelParametrosAuxiliar3Importaciones, this.gridBagConstraintsImportaciones);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsImportaciones = new GridBagConstraints();
			this.gridBagConstraintsImportaciones.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsImportaciones.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesImportaciones.add(this.jComboBoxTiposAccionesImportaciones, this.gridBagConstraintsImportaciones);
	
				
			this.gridBagConstraintsImportaciones = new GridBagConstraints();
			this.gridBagConstraintsImportaciones.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsImportaciones.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesImportaciones.add(this.jTextFieldValorCampoGeneralImportaciones, this.gridBagConstraintsImportaciones);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosImportaciones = new GridBagLayout();

			this.jScrollPanelDatosImportaciones.setLayout(gridaBagLayoutDatosImportaciones);
			
			this.gridBagConstraintsImportaciones = new GridBagConstraints();
			this.gridBagConstraintsImportaciones.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsImportaciones.gridy = 0;
			this.gridBagConstraintsImportaciones.gridx = 0;
			
			this.jScrollPanelDatosImportaciones.add(this.jTableDatosImportaciones, this.gridBagConstraintsImportaciones);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosImportaciones.setViewportView(this.jTableDatosImportaciones);
		this.jTableDatosImportaciones.setFillsViewportHeight(true);
		this.jTableDatosImportaciones.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesImportaciones= new GridBagLayout();
		this.jPanelAccionesImportaciones.setLayout(gridaBagLayoutAccionesImportaciones);
		
		
		/*	
		this.gridBagConstraintsImportaciones = new GridBagConstraints();
		this.gridBagConstraintsImportaciones.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsImportaciones.gridy = 0;
		this.gridBagConstraintsImportaciones.gridx = 0;
			
		this.jPanelAccionesImportaciones.add(this.jButtonNuevoImportaciones, this.gridBagConstraintsImportaciones);
		*/
		int iPosXAccion=0;
		
						
		
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutImportaciones = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutImportaciones);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.importacionesSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsImportaciones = new GridBagConstraints();						
			this.gridBagConstraintsImportaciones.gridy = iGridyPrincipal++;
			this.gridBagConstraintsImportaciones.gridx = 0;		
			//this.gridBagConstraintsImportaciones.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsImportaciones.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsImportaciones.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarImportaciones, this.gridBagConstraintsImportaciones);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsImportaciones = new GridBagConstraints();
		this.gridBagConstraintsImportaciones.gridy = iGridyPrincipal++;
		this.gridBagConstraintsImportaciones.gridx = 0;		
		//this.gridBagConstraintsImportaciones.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsImportaciones.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsImportaciones.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsImportaciones);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsImportaciones = new GridBagConstraints();
		this.gridBagConstraintsImportaciones.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsImportaciones.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesImportaciones, this.gridBagConstraintsImportaciones);								
		
		
		/*
		this.gridBagConstraintsImportaciones = new GridBagConstraints();
		this.gridBagConstraintsImportaciones.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsImportaciones.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesImportaciones, this.gridBagConstraintsImportaciones);
		*/		
		
		this.gridBagConstraintsImportaciones = new GridBagConstraints();
		this.gridBagConstraintsImportaciones.gridy =iGridyPrincipal++;
		this.gridBagConstraintsImportaciones.gridx =0;
		this.gridBagConstraintsImportaciones.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsImportaciones.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosImportaciones, this.gridBagConstraintsImportaciones);
				
		
		this.gridBagConstraintsImportaciones = new GridBagConstraints();
		this.gridBagConstraintsImportaciones.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsImportaciones.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionImportaciones, this.gridBagConstraintsImportaciones);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(ImportacionesJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosImportaciones= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosImportaciones = new GridBagLayout();
			this.jPanelBusquedasParametrosImportaciones.setLayout(gridaBagLayoutBusquedasParametrosImportaciones);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralImportaciones=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralImportaciones.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralImportaciones.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralImportaciones.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsImportaciones = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsImportaciones = new GridBagConstraints();
		this.gridBagConstraintsImportaciones.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsImportaciones.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposImportaciones, this.gridBagConstraintsImportaciones);
			
			
		this.gridBagConstraintsImportaciones = new GridBagConstraints();
		this.gridBagConstraintsImportaciones.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsImportaciones.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosImportaciones, this.gridBagConstraintsImportaciones);
		
			
		this.gridBagConstraintsImportaciones = new GridBagConstraints();
		this.gridBagConstraintsImportaciones.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsImportaciones.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesImportaciones, this.gridBagConstraintsImportaciones);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralImportaciones;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoImportaciones() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoImportaciones = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoImportaciones = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoImportaciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoImportaciones.setName("jPanelReporteDinamicoImportaciones"); 
		
		this.jPanelReporteDinamicoImportaciones.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoImportaciones.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoImportaciones.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoImportaciones.setLayout(gridaBagLayoutReporteDinamicoImportaciones);
		
		
		this.jInternalFrameReporteDinamicoImportaciones= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoImportaciones = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteImportaciones= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoImportaciones.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoImportaciones.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoImportaciones.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoImportaciones.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoImportaciones.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoImportaciones.setResizable(true);
	    this.jInternalFrameReporteDinamicoImportaciones.setClosable(true);
	    this.jInternalFrameReporteDinamicoImportaciones.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoImportaciones.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoImportaciones.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoImportaciones.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoImportaciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Importacioneses"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteImportaciones = new JLabelMe();

		this.jLabelColumnasSelectReporteImportaciones.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteImportaciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteImportaciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteImportaciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsImportaciones = new GridBagConstraints();
		this.gridBagConstraintsImportaciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsImportaciones.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsImportaciones.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoImportaciones.add(this.jLabelColumnasSelectReporteImportaciones, this.gridBagConstraintsImportaciones);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteImportaciones = new JList<Reporte>();
		this.jListColumnasSelectReporteImportaciones.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteImportaciones.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteImportaciones.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteImportaciones.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteImportaciones.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteImportaciones=new JScrollPane(this.jListColumnasSelectReporteImportaciones);
			
			this.jScrollColumnasSelectReporteImportaciones.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteImportaciones.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteImportaciones.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteImportaciones.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsImportaciones = new GridBagConstraints();
		this.gridBagConstraintsImportaciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsImportaciones.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsImportaciones.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoImportaciones.add(this.jListColumnasSelectReporteImportaciones, this.gridBagConstraintsImportaciones);
		this.jPanelReporteDinamicoImportaciones.add(this.jScrollColumnasSelectReporteImportaciones, this.gridBagConstraintsImportaciones);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteImportaciones = new JLabelMe();

		this.jLabelRelacionesSelectReporteImportaciones.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteImportaciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteImportaciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteImportaciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteImportaciones = new JList<Reporte>();
		this.jListRelacionesSelectReporteImportaciones.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteImportaciones.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteImportaciones.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteImportaciones.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteImportaciones.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteImportaciones=new JScrollPane(this.jListRelacionesSelectReporteImportaciones);
			
			this.jScrollRelacionesSelectReporteImportaciones.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteImportaciones.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteImportaciones.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteImportaciones.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoImportaciones = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoImportaciones = new JComboBoxMe();
		this.jListColumnasValoresGraficoImportaciones = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoImportaciones = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoImportaciones.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoImportaciones.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoImportaciones.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoImportaciones.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoImportaciones, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoImportaciones = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoImportaciones.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoImportaciones.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoImportaciones.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoImportaciones.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoImportaciones, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoImportaciones = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoImportaciones.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoImportaciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoImportaciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoImportaciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsImportaciones = new GridBagConstraints();
		this.gridBagConstraintsImportaciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsImportaciones.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsImportaciones.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoImportaciones.add(this.jLabelGenerarExcelReporteDinamicoImportaciones, this.gridBagConstraintsImportaciones);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoImportaciones = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoImportaciones.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoImportaciones,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoImportaciones.setToolTipText("Generar EXCEL"+" "+ImportacionesConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsImportaciones = new GridBagConstraints();
		//this.gridBagConstraintsImportaciones.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsImportaciones.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsImportaciones.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoImportaciones.add(this.jButtonGenerarExcelReporteDinamicoImportaciones, this.gridBagConstraintsImportaciones);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsImportaciones = new GridBagConstraints();
		this.gridBagConstraintsImportaciones.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsImportaciones.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsImportaciones.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoImportaciones.add(this.jComboBoxTiposReportesDinamicoImportaciones, this.gridBagConstraintsImportaciones);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoImportaciones = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoImportaciones.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoImportaciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoImportaciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoImportaciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsImportaciones = new GridBagConstraints();
		this.gridBagConstraintsImportaciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsImportaciones.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsImportaciones.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoImportaciones.add(this.jLabelTiposArchivoReporteDinamicoImportaciones, this.gridBagConstraintsImportaciones);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsImportaciones = new GridBagConstraints();
		this.gridBagConstraintsImportaciones.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsImportaciones.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsImportaciones.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoImportaciones.add(this.jComboBoxTiposArchivosReportesDinamicoImportaciones, this.gridBagConstraintsImportaciones);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoImportaciones = new JButtonMe();
		this.jButtonGenerarReporteDinamicoImportaciones.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoImportaciones,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoImportaciones.setToolTipText("Generar"+" "+ImportacionesConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsImportaciones = new GridBagConstraints();
		this.gridBagConstraintsImportaciones.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsImportaciones.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsImportaciones.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoImportaciones.add(this.jButtonGenerarReporteDinamicoImportaciones, this.gridBagConstraintsImportaciones);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoImportaciones = new JButtonMe();
		this.jButtonCerrarReporteDinamicoImportaciones.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoImportaciones,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoImportaciones.setToolTipText("Cancelar"+" "+ImportacionesConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsImportaciones = new GridBagConstraints();
		this.gridBagConstraintsImportaciones.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsImportaciones.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsImportaciones.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoImportaciones.add(this.jButtonCerrarReporteDinamicoImportaciones, this.gridBagConstraintsImportaciones);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalImportaciones = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoImportaciones= new JScrollPane(jPanelReporteDinamicoImportaciones,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoImportaciones.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoImportaciones.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoImportaciones.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoImportaciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Importacioneses"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsImportaciones = new GridBagConstraints();
		this.gridBagConstraintsImportaciones.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsImportaciones.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsImportaciones.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoImportaciones.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoImportaciones.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalImportaciones);
		this.jInternalFrameReporteDinamicoImportaciones.getContentPane().add(this.jScrollPanelReporteDinamicoImportaciones, this.gridBagConstraintsImportaciones);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionImportaciones() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionImportaciones = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionImportaciones = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionImportaciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionImportaciones.setName("jPanelImportacionImportaciones"); 
		
		this.jPanelImportacionImportaciones.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionImportaciones.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionImportaciones.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionImportaciones.setLayout(gridaBagLayoutImportacionImportaciones);
		
		
		this.jInternalFrameImportacionImportaciones= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionImportaciones= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionImportaciones = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteImportaciones= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionImportaciones.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionImportaciones.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionImportaciones.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionImportaciones.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionImportaciones.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionImportaciones.setResizable(true);
	    this.jInternalFrameImportacionImportaciones.setClosable(true);
	    this.jInternalFrameImportacionImportaciones.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionImportaciones.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionImportaciones.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionImportaciones.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionImportaciones.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionImportaciones.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionImportaciones.setResizable(true);
	    this.jInternalFrameImportacionImportaciones.setClosable(true);
	    this.jInternalFrameImportacionImportaciones.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionImportaciones.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionImportaciones.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionImportaciones.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionImportaciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Importacioneses"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionImportaciones = new JLabelMe();

		this.jLabelArchivoImportacionImportaciones.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionImportaciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionImportaciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionImportaciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsImportaciones = new GridBagConstraints();
		this.gridBagConstraintsImportaciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsImportaciones.gridy = iPosYImportacion;		
		this.gridBagConstraintsImportaciones.gridx = iPosXImportacion++;
			
		this.jPanelImportacionImportaciones.add(this.jLabelArchivoImportacionImportaciones, this.gridBagConstraintsImportaciones);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionImportaciones = new JFileChooser();		
		this.jFileChooserImportacionImportaciones.setToolTipText("ESCOGER ARCHIVO"+" "+ImportacionesConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionImportaciones = new JButtonMe();
		this.jButtonAbrirImportacionImportaciones.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionImportaciones,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionImportaciones.setToolTipText("Generar"+" "+ImportacionesConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsImportaciones = new GridBagConstraints();
		this.gridBagConstraintsImportaciones.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsImportaciones.gridy = iPosYImportacion;
		this.gridBagConstraintsImportaciones.gridx = iPosXImportacion++;
							
		this.jPanelImportacionImportaciones.add(this.jButtonAbrirImportacionImportaciones, this.gridBagConstraintsImportaciones);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionImportaciones = new JLabelMe();

		this.jLabelPathArchivoImportacionImportaciones.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionImportaciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionImportaciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionImportaciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsImportaciones = new GridBagConstraints();
		this.gridBagConstraintsImportaciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsImportaciones.gridy = iPosYImportacion;		
		this.gridBagConstraintsImportaciones.gridx = iPosXImportacion++;
			
		this.jPanelImportacionImportaciones.add(this.jLabelPathArchivoImportacionImportaciones, this.gridBagConstraintsImportaciones);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionImportaciones=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionImportaciones.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionImportaciones.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionImportaciones.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsImportaciones = new GridBagConstraints();
		this.gridBagConstraintsImportaciones.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsImportaciones.gridy = iPosYImportacion;
		this.gridBagConstraintsImportaciones.gridx = iPosXImportacion++;
							
		this.jPanelImportacionImportaciones.add(this.jTextFieldPathArchivoImportacionImportaciones, this.gridBagConstraintsImportaciones);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionImportaciones = new JButtonMe();
		this.jButtonGenerarImportacionImportaciones.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionImportaciones,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionImportaciones.setToolTipText("Generar"+" "+ImportacionesConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsImportaciones = new GridBagConstraints();
		this.gridBagConstraintsImportaciones.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsImportaciones.gridy = iPosYImportacion;
		this.gridBagConstraintsImportaciones.gridx = iPosXImportacion++;
							
		this.jPanelImportacionImportaciones.add(this.jButtonGenerarImportacionImportaciones, this.gridBagConstraintsImportaciones);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionImportaciones = new JButtonMe();
		this.jButtonCerrarImportacionImportaciones.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionImportaciones,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionImportaciones.setToolTipText("Cancelar"+" "+ImportacionesConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsImportaciones = new GridBagConstraints();
		this.gridBagConstraintsImportaciones.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsImportaciones.gridy = iPosYImportacion;
		this.gridBagConstraintsImportaciones.gridx = iPosXImportacion++;
							
		this.jPanelImportacionImportaciones.add(this.jButtonCerrarImportacionImportaciones, this.gridBagConstraintsImportaciones);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalImportaciones = new GridBagLayout();
		
		this.jScrollPanelImportacionImportaciones= new JScrollPane(jPanelImportacionImportaciones,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsImportaciones = new GridBagConstraints();
		this.gridBagConstraintsImportaciones.gridy =iPosYImportacion;
		this.gridBagConstraintsImportaciones.gridx =iPosXImportacion;
		this.gridBagConstraintsImportaciones.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionImportaciones.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionImportaciones.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalImportaciones);
		this.jInternalFrameImportacionImportaciones.getContentPane().add(this.jScrollPanelImportacionImportaciones, this.gridBagConstraintsImportaciones);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByImportaciones(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByImportaciones = new JButtonMe();
			this.jButtonAbrirOrderByImportaciones.setText("Orden");
			this.jButtonAbrirOrderByImportaciones.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByImportaciones,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByImportaciones, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByImportaciones";
			inputMap = this.jButtonAbrirOrderByImportaciones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByImportaciones.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByImportaciones"));
		
		
			GridBagLayout gridaBagLayoutOrderByImportaciones = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByImportaciones = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByImportaciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByImportaciones.setName("jPanelOrderByImportaciones"); 
			
			this.jPanelOrderByImportaciones.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByImportaciones.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByImportaciones.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByImportaciones, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByImportaciones.setLayout(gridaBagLayoutOrderByImportaciones);
			
			
			this.jTableDatosImportacionesOrderBy = new JTableMe();        
			this.jTableDatosImportacionesOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosImportacionesOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosImportacionesOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosImportacionesOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosImportacionesOrderBy.setViewportView(this.jTableDatosImportacionesOrderBy);
			this.jTableDatosImportacionesOrderBy.setFillsViewportHeight(true);
			this.jTableDatosImportacionesOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByImportaciones= new OrderByJInternalFrame();
			this.jInternalFrameOrderByImportaciones= new OrderByJInternalFrame();
			this.jScrollPanelOrderByImportaciones = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteImportaciones= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByImportaciones.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByImportaciones.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByImportaciones.setTitle("Orden");
			this.jInternalFrameOrderByImportaciones.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByImportaciones.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByImportaciones.setResizable(true);
			this.jInternalFrameOrderByImportaciones.setClosable(true);
			this.jInternalFrameOrderByImportaciones.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByImportaciones, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByImportaciones.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByImportaciones.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByImportaciones.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByImportaciones, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByImportaciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Importacioneses"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsImportaciones = new GridBagConstraints();
			this.gridBagConstraintsImportaciones.gridy =iPosYOrderBy++;
			this.gridBagConstraintsImportaciones.gridx =iPosXOrderBy;
			this.gridBagConstraintsImportaciones.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsImportaciones.ipady =150;
				
			this.jPanelOrderByImportaciones.add(jScrollPanelDatosImportacionesOrderBy, this.gridBagConstraintsImportaciones);//this.jTableDatosImportacionesTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByImportaciones = new JButtonMe();
			this.jButtonCerrarOrderByImportaciones.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByImportaciones,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByImportaciones.setToolTipText("Cancelar"+" "+ImportacionesConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByImportaciones, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsImportaciones = new GridBagConstraints();
			this.gridBagConstraintsImportaciones.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsImportaciones.gridy = iPosYOrderBy++;
			this.gridBagConstraintsImportaciones.gridx = iPosXOrderBy;
									
			this.jPanelOrderByImportaciones.add(this.jButtonCerrarOrderByImportaciones, this.gridBagConstraintsImportaciones);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalImportaciones = new GridBagLayout();
			
			this.jScrollPanelOrderByImportaciones= new JScrollPane(jPanelOrderByImportaciones,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsImportaciones = new GridBagConstraints();
			this.gridBagConstraintsImportaciones.gridy =iPosYOrderBy;
			this.gridBagConstraintsImportaciones.gridx =iPosXOrderBy;
			this.gridBagConstraintsImportaciones.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByImportaciones.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByImportaciones.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalImportaciones);
			
			this.jInternalFrameOrderByImportaciones.getContentPane().add(this.jScrollPanelOrderByImportaciones, this.gridBagConstraintsImportaciones);			
		
		} else {
			this.jButtonAbrirOrderByImportaciones = new JButtonMe();
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
			&& this.importacionesSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosImportaciones.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosImportaciones.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosImportaciones.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosImportaciones.getRowHeight();//ImportacionesConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.importacionesSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > ImportacionesConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaImportaciones.isSelected()) {
					iHeightTable=ImportacionesConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ImportacionesConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ImportacionesConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > ImportacionesConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaImportaciones.isSelected()) {
					iHeightTable=ImportacionesConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ImportacionesConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ImportacionesConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosImportaciones.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosImportaciones.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosImportaciones.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosImportaciones.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosImportaciones.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosImportaciones.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByImportaciones!=null && this.jInternalFrameOrderByImportaciones.getjTableDatosOrderBy()!=null) {
			//if(!this.importacionesSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByImportaciones.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByImportaciones.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByImportaciones.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByImportaciones.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByImportaciones.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByImportaciones.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByImportaciones.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosImportaciones.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosImportaciones.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosImportaciones.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=importacionesLogic.getImportacioness().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=importacioness.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<Importaciones> TraerImportacionesBeans(List<Importaciones> importacioness,ArrayList<Classe> classes)throws Exception {
		try {
			for(Importaciones importaciones:importacioness) {
					
				if(!(ImportacionesConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || ImportacionesConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					importaciones.setsDetalleGeneralEntityReporte(ImportacionesConstantesFunciones.getImportacionesDescripcion(importaciones));
										
						
					
						
					
				} else  {
							
					//importaciones.setsDetalleGeneralEntityReporte(importaciones.getsDetalleGeneralEntityReporte());
										
				}
				
				//importacionesbeans.add(importacionesbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return importacioness;
    }
	//PARA REPORTES FIN
}
