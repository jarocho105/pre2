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
package com.bydan.erp.tesoreria.presentation.swing.jinternalframes;



import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.auxiliar.*;





//import com.bydan.erp.tesoreria.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.tesoreria.util.EstadoPagoAutoConstantesFunciones;

import com.bydan.erp.tesoreria.business.logic.*;
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
public class EstadoPagoAutoJInternalFrame extends EstadoPagoAutoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarEstadoPagoAuto;
	
	protected JMenuBar jmenuBarEstadoPagoAuto;
	
	protected JMenu jmenuEstadoPagoAuto;
	protected JMenu jmenuDatosEstadoPagoAuto;
	protected JMenu jmenuArchivoEstadoPagoAuto;
	protected JMenu jmenuAccionesEstadoPagoAuto;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosEstadoPagoAuto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutEstadoPagoAuto;	
	protected GridBagConstraints gridBagConstraintsEstadoPagoAuto;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public EstadoPagoAutoDetalleFormJInternalFrame jInternalFrameDetalleFormEstadoPagoAuto;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoEstadoPagoAuto;	
	protected ImportacionJInternalFrame jInternalFrameImportacionEstadoPagoAuto;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public EstadoPagoAutoSessionBean estadopagoautoSessionBean;
		
	
	
	
	//protected JDesktopPane jDesktopPane;
	public List<EstadoPagoAuto> estadopagoautos;		
	public List<EstadoPagoAuto> estadopagoautosEliminados;	
	public List<EstadoPagoAuto> estadopagoautosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByEstadoPagoAuto;		
	protected JButton jButtonAbrirOrderByEstadoPagoAuto;
	
	
	//protected JPanel jPanelOrderByEstadoPagoAuto;
	//public JScrollPane jScrollPanelOrderByEstadoPagoAuto;	
	//protected JButton jButtonCerrarOrderByEstadoPagoAuto;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public EstadoPagoAutoLogic estadopagoautoLogic;
	
	
	
	public JScrollPane jScrollPanelDatosEstadoPagoAuto;
	public JScrollPane jScrollPanelDatosEdicionEstadoPagoAuto;
	public JScrollPane jScrollPanelDatosGeneralEstadoPagoAuto;
    
	
	
	//public JScrollPane jScrollPanelDatosEstadoPagoAutoOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoEstadoPagoAuto;
	//public JScrollPane jScrollPanelImportacionEstadoPagoAuto;
	
	
	
	protected JPanel jPanelAccionesEstadoPagoAuto;
	
    protected JPanel jPanelPaginacionEstadoPagoAuto;
    protected JPanel jPanelParametrosReportesEstadoPagoAuto;
	protected JPanel jPanelParametrosReportesAccionesEstadoPagoAuto;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1EstadoPagoAuto;
	protected JPanel jPanelParametrosAuxiliar2EstadoPagoAuto;
	protected JPanel jPanelParametrosAuxiliar3EstadoPagoAuto;
	protected JPanel jPanelParametrosAuxiliar4EstadoPagoAuto;
	//protected JPanel jPanelParametrosAuxiliar5EstadoPagoAuto;
	
	
	
	//protected JPanel jPanelReporteDinamicoEstadoPagoAuto;
	//protected JPanel jPanelImportacionEstadoPagoAuto;
	
	
	public JTable jTableDatosEstadoPagoAuto;
	
	
	
	//public JTable jTableDatosEstadoPagoAutoOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoEstadoPagoAuto;
	protected JButton jButtonDuplicarEstadoPagoAuto;
	protected JButton jButtonCopiarEstadoPagoAuto;
	protected JButton jButtonVerFormEstadoPagoAuto;
	protected JButton jButtonNuevoRelacionesEstadoPagoAuto;
	protected JButton jButtonModificarEstadoPagoAuto;
	
    protected JButton jButtonGuardarCambiosTablaEstadoPagoAuto;
	protected JButton jButtonCerrarEstadoPagoAuto;
	
	
	protected JButton jButtonRecargarInformacionEstadoPagoAuto;
	protected JButton jButtonProcesarInformacionEstadoPagoAuto;
	
	
	protected JButton jButtonAnterioresEstadoPagoAuto;
	protected JButton jButtonSiguientesEstadoPagoAuto;
	protected JButton jButtonNuevoGuardarCambiosEstadoPagoAuto;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoEstadoPagoAuto;
	//protected JButton jButtonCerrarReporteDinamicoEstadoPagoAuto;
	//protected JButton jButtonGenerarExcelReporteDinamicoEstadoPagoAuto;	
	
	
	
	//protected JButton jButtonAbrirImportacionEstadoPagoAuto;
	//protected JButton jButtonGenerarImportacionEstadoPagoAuto;
	//protected JButton jButtonCerrarImportacionEstadoPagoAuto;
	//protected JFileChooser jFileChooserImportacionEstadoPagoAuto;
	//protected File fileImportacionEstadoPagoAuto;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarEstadoPagoAuto;
	protected JButton jButtonDuplicarToolBarEstadoPagoAuto;
	protected JButton jButtonNuevoRelacionesToolBarEstadoPagoAuto;
	
	
	public JButton jButtonGuardarCambiosToolBarEstadoPagoAuto;
	protected JButton jButtonCopiarToolBarEstadoPagoAuto;
	protected JButton jButtonVerFormToolBarEstadoPagoAuto;
	public JButton jButtonGuardarCambiosTablaToolBarEstadoPagoAuto;
	protected JButton jButtonMostrarOcultarTablaToolBarEstadoPagoAuto;
	protected JButton jButtonCerrarToolBarEstadoPagoAuto;
	
	protected JButton jButtonRecargarInformacionToolBarEstadoPagoAuto;
	protected JButton jButtonProcesarInformacionToolBarEstadoPagoAuto;
	protected JButton jButtonAnterioresToolBarEstadoPagoAuto;
	protected JButton jButtonSiguientesToolBarEstadoPagoAuto;
	protected JButton jButtonNuevoGuardarCambiosToolBarEstadoPagoAuto;
	protected JButton jButtonAbrirOrderByToolBarEstadoPagoAuto;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoEstadoPagoAuto;
	protected JMenuItem jMenuItemDuplicarEstadoPagoAuto;
	protected JMenuItem jMenuItemNuevoRelacionesEstadoPagoAuto;
	
	
	protected JMenuItem jMenuItemGuardarCambiosEstadoPagoAuto;
	protected JMenuItem jMenuItemCopiarEstadoPagoAuto;
	protected JMenuItem jMenuItemVerFormEstadoPagoAuto;
	protected JMenuItem jMenuItemGuardarCambiosTablaEstadoPagoAuto;
	protected JMenuItem jMenuItemCerrarEstadoPagoAuto;
	protected JMenuItem jMenuItemDetalleCerrarEstadoPagoAuto;
	protected JMenuItem jMenuItemDetalleAbrirOrderByEstadoPagoAuto;
	protected JMenuItem jMenuItemDetalleMostarOcultarEstadoPagoAuto;
	
	protected JMenuItem jMenuItemRecargarInformacionEstadoPagoAuto;
	protected JMenuItem jMenuItemProcesarInformacionEstadoPagoAuto;
	protected JMenuItem jMenuItemAnterioresEstadoPagoAuto;
	protected JMenuItem jMenuItemSiguientesEstadoPagoAuto;
	protected JMenuItem jMenuItemNuevoGuardarCambiosEstadoPagoAuto;
	protected JMenuItem jMenuItemAbrirOrderByEstadoPagoAuto;
	protected JMenuItem jMenuItemMostrarOcultarEstadoPagoAuto;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesEstadoPagoAuto;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosEstadoPagoAuto;
	protected JCheckBox jCheckBoxSeleccionadosEstadoPagoAuto;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaEstadoPagoAuto;
	protected JCheckBox jCheckBoxConGraficoReporteEstadoPagoAuto;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesEstadoPagoAuto;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesEstadoPagoAuto;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoEstadoPagoAuto;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoEstadoPagoAuto;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesEstadoPagoAuto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionEstadoPagoAuto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesEstadoPagoAuto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesEstadoPagoAuto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarEstadoPagoAuto;
	protected JTextField jTextFieldValorCampoGeneralEstadoPagoAuto;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteEstadoPagoAuto;
	//public JList<Reporte> jListColumnasSelectReporteEstadoPagoAuto;
	//public JScrollPane jScrollColumnasSelectReporteEstadoPagoAuto;
	
	//public JLabel jLabelRelacionesSelectReporteEstadoPagoAuto;
	//public JList<Reporte> jListRelacionesSelectReporteEstadoPagoAuto;
	//public JScrollPane jScrollRelacionesSelectReporteEstadoPagoAuto;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoEstadoPagoAuto;
	//protected JCheckBox jCheckBoxConGraficoDinamicoEstadoPagoAuto;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoEstadoPagoAuto;
	//public JLabel jLabelTiposArchivoReporteDinamicoEstadoPagoAuto;
	
		
	//public JLabel jLabelArchivoImportacionEstadoPagoAuto;	
	//public JLabel jLabelPathArchivoImportacionEstadoPagoAuto;
	//protected JTextField jTextFieldPathArchivoImportacionEstadoPagoAuto;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoEstadoPagoAuto;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoEstadoPagoAuto;
	
	//public JLabel jLabelColumnaCategoriaValorEstadoPagoAuto;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorEstadoPagoAuto;
	
	//public JLabel jLabelColumnasValoresGraficoEstadoPagoAuto;
	//public JList<Reporte> jListColumnasValoresGraficoEstadoPagoAuto;
	//public JScrollPane jScrollColumnasValoresGraficoEstadoPagoAuto;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoEstadoPagoAuto;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoEstadoPagoAuto;	
	
	
	
	
	
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
	public EstadoPagoAutoJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("EstadoPagoAuto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoPagoAutoJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EstadoPagoAuto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoPagoAutoJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EstadoPagoAuto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoPagoAutoJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("EstadoPagoAuto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionEstadoPagoAuto)	{
		this.jButtonRecargarInformacionEstadoPagoAuto = jButtonRecargarInformacionEstadoPagoAuto;
	}
	
	public JButton getjButtonProcesarInformacionEstadoPagoAuto() {
		return this.jButtonProcesarInformacionEstadoPagoAuto;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionEstadoPagoAuto)	{
		this.jButtonProcesarInformacionEstadoPagoAuto = jButtonProcesarInformacionEstadoPagoAuto;
	}
	
	
	public JButton getjButtonRecargarInformacionEstadoPagoAuto() {
		return this.jButtonRecargarInformacionEstadoPagoAuto;
	}
	
	
	public List<EstadoPagoAuto> getestadopagoautos() {
		return this.estadopagoautos;
	}

	public void setestadopagoautos(List<EstadoPagoAuto> estadopagoautos) {
		this.estadopagoautos = estadopagoautos;
	}
	
	public List<EstadoPagoAuto> getestadopagoautosAux() {
		return this.estadopagoautosAux;
	}

	public void setestadopagoautosAux(List<EstadoPagoAuto> estadopagoautosAux) {
		this.estadopagoautosAux = estadopagoautosAux;
	}
	
	public List<EstadoPagoAuto> getestadopagoautosEliminados() {
		return this.estadopagoautosEliminados;
	}

	public void setEstadoPagoAutosEliminados(List<EstadoPagoAuto> estadopagoautosEliminados) {
		this.estadopagoautosEliminados = estadopagoautosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarEstadoPagoAuto() {
		return jComboBoxTiposSeleccionarEstadoPagoAuto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarEstadoPagoAuto(
			JComboBox jComboBoxTiposSeleccionarEstadoPagoAuto) {
		this.jComboBoxTiposSeleccionarEstadoPagoAuto = jComboBoxTiposSeleccionarEstadoPagoAuto;
	}
	
	public void setBorderResaltarTiposSeleccionarEstadoPagoAuto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarEstadoPagoAuto.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarEstadoPagoAuto .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralEstadoPagoAuto() {
		return jTextFieldValorCampoGeneralEstadoPagoAuto;
	}

	public void setjTextFieldValorCampoGeneralEstadoPagoAuto(
			JTextField jTextFieldValorCampoGeneralEstadoPagoAuto) {
		this.jTextFieldValorCampoGeneralEstadoPagoAuto = jTextFieldValorCampoGeneralEstadoPagoAuto;
	}

	public void setBorderResaltarValorCampoGeneralEstadoPagoAuto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoPagoAuto.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralEstadoPagoAuto .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosEstadoPagoAuto() {
		return this.jCheckBoxSeleccionarTodosEstadoPagoAuto;
	}

	public void setjCheckBoxSeleccionarTodosEstadoPagoAuto(
			JCheckBox jCheckBoxSeleccionarTodosEstadoPagoAuto) {
		this.jCheckBoxSeleccionarTodosEstadoPagoAuto = jCheckBoxSeleccionarTodosEstadoPagoAuto;
	}

	public void setBorderResaltarSeleccionarTodosEstadoPagoAuto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoPagoAuto.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosEstadoPagoAuto .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosEstadoPagoAuto() {
		return this.jCheckBoxSeleccionadosEstadoPagoAuto;
	}

	public void setjCheckBoxSeleccionadosEstadoPagoAuto(
			JCheckBox jCheckBoxSeleccionadosEstadoPagoAuto) {
		this.jCheckBoxSeleccionadosEstadoPagoAuto = jCheckBoxSeleccionadosEstadoPagoAuto;
	}
	
	public void setBorderResaltarSeleccionadosEstadoPagoAuto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoPagoAuto.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosEstadoPagoAuto .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesEstadoPagoAuto() {
		return this.jComboBoxTiposArchivosReportesEstadoPagoAuto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesEstadoPagoAuto(
			JComboBox jComboBoxTiposArchivosReportesEstadoPagoAuto) {
		this.jComboBoxTiposArchivosReportesEstadoPagoAuto = jComboBoxTiposArchivosReportesEstadoPagoAuto;
	}

	public void setBorderResaltarTiposArchivosReportesEstadoPagoAuto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoPagoAuto.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesEstadoPagoAuto .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesEstadoPagoAuto() {
		return this.jComboBoxTiposReportesEstadoPagoAuto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesEstadoPagoAuto(
			JComboBox jComboBoxTiposReportesEstadoPagoAuto) {
		this.jComboBoxTiposReportesEstadoPagoAuto = jComboBoxTiposReportesEstadoPagoAuto;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoEstadoPagoAuto() {
	//	return jComboBoxTiposReportesDinamicoEstadoPagoAuto;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoEstadoPagoAuto(
	//		JComboBox jComboBoxTiposReportesDinamicoEstadoPagoAuto) {
	//	this.jComboBoxTiposReportesDinamicoEstadoPagoAuto = jComboBoxTiposReportesDinamicoEstadoPagoAuto;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoEstadoPagoAuto() {
	//	return jComboBoxTiposArchivosReportesDinamicoEstadoPagoAuto;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoEstadoPagoAuto(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoEstadoPagoAuto) {
	//	this.jComboBoxTiposArchivosReportesDinamicoEstadoPagoAuto = jComboBoxTiposArchivosReportesDinamicoEstadoPagoAuto;
	//}
	
	public void setBorderResaltarTiposReportesEstadoPagoAuto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoPagoAuto.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesEstadoPagoAuto .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesEstadoPagoAuto() {
		return this.jComboBoxTiposGraficosReportesEstadoPagoAuto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesEstadoPagoAuto(
			JComboBox jComboBoxTiposGraficosReportesEstadoPagoAuto) {
		this.jComboBoxTiposGraficosReportesEstadoPagoAuto = jComboBoxTiposGraficosReportesEstadoPagoAuto;
	}
	
	public void setBorderResaltarTiposGraficosReportesEstadoPagoAuto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoPagoAuto.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesEstadoPagoAuto .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionEstadoPagoAuto() {
		return this.jComboBoxTiposPaginacionEstadoPagoAuto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionEstadoPagoAuto(
			JComboBox jComboBoxTiposPaginacionEstadoPagoAuto) {
		this.jComboBoxTiposPaginacionEstadoPagoAuto = jComboBoxTiposPaginacionEstadoPagoAuto;
	}
	
	public void setBorderResaltarTiposPaginacionEstadoPagoAuto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoPagoAuto.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionEstadoPagoAuto .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesEstadoPagoAuto() {
		return this.jComboBoxTiposRelacionesEstadoPagoAuto;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesEstadoPagoAuto() {
		return this.jComboBoxTiposAccionesEstadoPagoAuto;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesEstadoPagoAuto(
			JComboBox jComboBoxTiposRelacionesEstadoPagoAuto) {
		this.jComboBoxTiposRelacionesEstadoPagoAuto = jComboBoxTiposRelacionesEstadoPagoAuto;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesEstadoPagoAuto(
			JComboBox jComboBoxTiposAccionesEstadoPagoAuto) {
		this.jComboBoxTiposAccionesEstadoPagoAuto = jComboBoxTiposAccionesEstadoPagoAuto;
	}
	
	public void setBorderResaltarTiposRelacionesEstadoPagoAuto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoPagoAuto.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesEstadoPagoAuto .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesEstadoPagoAuto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoPagoAuto.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesEstadoPagoAuto .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoEstadoPagoAuto() {
	//	return jCheckBoxConGraficoDinamicoEstadoPagoAuto;
	//}

	//public void setjCheckBoxConGraficoDinamicoEstadoPagoAuto(
	//		JCheckBox jCheckBoxConGraficoDinamicoEstadoPagoAuto) {
	//	this.jCheckBoxConGraficoDinamicoEstadoPagoAuto = jCheckBoxConGraficoDinamicoEstadoPagoAuto;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoEstadoPagoAuto() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarEstadoPagoAuto.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoEstadoPagoAuto .setBorder(borderResaltar);		
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
		this.estadopagoautoSessionBean=new EstadoPagoAutoSessionBean();
		
		this.estadopagoautoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.estadopagoautoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.estadopagoautoSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=EstadoPagoAutoJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=EstadoPagoAutoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		EstadoPagoAutoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		EstadoPagoAutoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		EstadoPagoAutoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Estado Pago Automatico MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 910) {
			iHeight=910;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.estadopagoautoSessionBean.getEsGuardarRelacionado()) {
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
		
		EstadoPagoAutoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("EstadoPagoAuto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarEstadoPagoAuto= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarEstadoPagoAuto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarEstadoPagoAuto,this.jTtoolBarEstadoPagoAuto,
							"nuevo","nuevo","Nuevo"+" "+EstadoPagoAutoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarEstadoPagoAuto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarEstadoPagoAuto,this.jTtoolBarEstadoPagoAuto,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarEstadoPagoAuto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarEstadoPagoAuto,this.jTtoolBarEstadoPagoAuto,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+EstadoPagoAutoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarEstadoPagoAuto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarEstadoPagoAuto,this.jTtoolBarEstadoPagoAuto,
							"duplicar","duplicar","Duplicar"+" "+EstadoPagoAutoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarEstadoPagoAuto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarEstadoPagoAuto,this.jTtoolBarEstadoPagoAuto,
							"copiar","copiar","Copiar"+" "+EstadoPagoAutoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarEstadoPagoAuto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarEstadoPagoAuto,this.jTtoolBarEstadoPagoAuto,
							"ver_form","ver_form","Ver"+" "+EstadoPagoAutoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarEstadoPagoAuto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEstadoPagoAuto,this.jTtoolBarEstadoPagoAuto,
							"recargar","recargar","Recargar"+" "+EstadoPagoAutoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarEstadoPagoAuto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEstadoPagoAuto,this.jTtoolBarEstadoPagoAuto,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarEstadoPagoAuto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEstadoPagoAuto,this.jTtoolBarEstadoPagoAuto,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarEstadoPagoAuto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarEstadoPagoAuto,this.jTtoolBarEstadoPagoAuto,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarEstadoPagoAuto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarEstadoPagoAuto,this.jTtoolBarEstadoPagoAuto,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarEstadoPagoAuto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarEstadoPagoAuto,this.jTtoolBarEstadoPagoAuto,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+EstadoPagoAutoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarEstadoPagoAuto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarEstadoPagoAuto,this.jTtoolBarEstadoPagoAuto,
							"cerrar","cerrar","Salir"+" "+EstadoPagoAutoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarEstadoPagoAuto=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarEstadoPagoAuto;
			
				this.jButtonProcesarInformacionToolBarEstadoPagoAuto=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarEstadoPagoAuto;
				
		//protected JButton jButtonModificarToolBarEstadoPagoAuto;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarEstadoPagoAuto=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuEstadoPagoAuto=new JMenuMe("General");
		this.jmenuArchivoEstadoPagoAuto=new JMenuMe("Archivo");
		this.jmenuAccionesEstadoPagoAuto=new JMenuMe("Acciones");
		this.jmenuDatosEstadoPagoAuto=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoEstadoPagoAuto= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoEstadoPagoAuto.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoEstadoPagoAuto,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoEstadoPagoAuto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarEstadoPagoAuto= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarEstadoPagoAuto.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarEstadoPagoAuto,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarEstadoPagoAuto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesEstadoPagoAuto= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesEstadoPagoAuto.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesEstadoPagoAuto,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesEstadoPagoAuto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosEstadoPagoAuto= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosEstadoPagoAuto.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosEstadoPagoAuto,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosEstadoPagoAuto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarEstadoPagoAuto= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarEstadoPagoAuto.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarEstadoPagoAuto,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarEstadoPagoAuto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormEstadoPagoAuto= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormEstadoPagoAuto.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormEstadoPagoAuto,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormEstadoPagoAuto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaEstadoPagoAuto= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaEstadoPagoAuto.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaEstadoPagoAuto,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaEstadoPagoAuto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarEstadoPagoAuto= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarEstadoPagoAuto.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarEstadoPagoAuto,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarEstadoPagoAuto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionEstadoPagoAuto= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionEstadoPagoAuto.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionEstadoPagoAuto,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionEstadoPagoAuto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionEstadoPagoAuto= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionEstadoPagoAuto.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionEstadoPagoAuto,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresEstadoPagoAuto= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresEstadoPagoAuto.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresEstadoPagoAuto,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresEstadoPagoAuto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesEstadoPagoAuto= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesEstadoPagoAuto.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesEstadoPagoAuto,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesEstadoPagoAuto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByEstadoPagoAuto= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByEstadoPagoAuto.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByEstadoPagoAuto,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByEstadoPagoAuto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarEstadoPagoAuto= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarEstadoPagoAuto.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarEstadoPagoAuto,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarEstadoPagoAuto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByEstadoPagoAuto= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByEstadoPagoAuto.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByEstadoPagoAuto,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByEstadoPagoAuto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarEstadoPagoAuto= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarEstadoPagoAuto.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarEstadoPagoAuto,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarEstadoPagoAuto, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosEstadoPagoAuto= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosEstadoPagoAuto.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosEstadoPagoAuto,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosEstadoPagoAuto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoEstadoPagoAuto.add(this.jMenuItemCerrarEstadoPagoAuto);
			
			this.jmenuAccionesEstadoPagoAuto.add(this.jMenuItemNuevoEstadoPagoAuto);
			this.jmenuAccionesEstadoPagoAuto.add(this.jMenuItemNuevoGuardarCambiosEstadoPagoAuto);
			this.jmenuAccionesEstadoPagoAuto.add(this.jMenuItemNuevoRelacionesEstadoPagoAuto);
			this.jmenuAccionesEstadoPagoAuto.add(this.jMenuItemGuardarCambiosTablaEstadoPagoAuto);		
			this.jmenuAccionesEstadoPagoAuto.add(this.jMenuItemDuplicarEstadoPagoAuto);		
			this.jmenuAccionesEstadoPagoAuto.add(this.jMenuItemCopiarEstadoPagoAuto);		
			this.jmenuAccionesEstadoPagoAuto.add(this.jMenuItemVerFormEstadoPagoAuto);		
			
			this.jmenuDatosEstadoPagoAuto.add(this.jMenuItemRecargarInformacionEstadoPagoAuto);				
			this.jmenuDatosEstadoPagoAuto.add(this.jMenuItemAnterioresEstadoPagoAuto);				
			this.jmenuDatosEstadoPagoAuto.add(this.jMenuItemSiguientesEstadoPagoAuto);				
			this.jmenuDatosEstadoPagoAuto.add(this.jMenuItemAbrirOrderByEstadoPagoAuto);				
			this.jmenuDatosEstadoPagoAuto.add(this.jMenuItemMostrarOcultarEstadoPagoAuto);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesEstadoPagoAuto.add(this.jMenuItemGuardarCambiosEstadoPagoAuto);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoEstadoPagoAuto, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesEstadoPagoAuto, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosEstadoPagoAuto, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarEstadoPagoAuto.add(this.jmenuArchivoEstadoPagoAuto);		
			this.jmenuBarEstadoPagoAuto.add(this.jmenuAccionesEstadoPagoAuto);		
			this.jmenuBarEstadoPagoAuto.add(this.jmenuDatosEstadoPagoAuto);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarEstadoPagoAuto);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasEstadoPagoAuto() {
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
			//this.jInternalFrameDetalleEstadoPagoAuto = new EstadoPagoAutoDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Estado Pago Automatico DATOS");
			this.jInternalFrameDetalleFormEstadoPagoAuto = new EstadoPagoAutoDetalleFormJInternalFrame(jDesktopPane,this.estadopagoautoSessionBean.getConGuardarRelaciones(),this.estadopagoautoSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormEstadoPagoAuto = null;//new EstadoPagoAutoDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutEstadoPagoAuto= new GridBagLayout();
		
		
		this.jTableDatosEstadoPagoAuto = new JTableMe();      
		
		String sToolTipEstadoPagoAuto="";
		sToolTipEstadoPagoAuto=EstadoPagoAutoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipEstadoPagoAuto+="(Tesoreria.EstadoPagoAuto)";
		}
		
		if(!this.estadopagoautoSessionBean.getEsGuardarRelacionado()) {
			sToolTipEstadoPagoAuto+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosEstadoPagoAuto.setToolTipText(sToolTipEstadoPagoAuto);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosEstadoPagoAuto);
		this.jTableDatosEstadoPagoAuto.setAutoCreateRowSorter(true);
		this.jTableDatosEstadoPagoAuto.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosEstadoPagoAuto.setRowSelectionAllowed(true);
		this.jTableDatosEstadoPagoAuto.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosEstadoPagoAuto,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoEstadoPagoAuto = new JButtonMe();
		this.jButtonDuplicarEstadoPagoAuto = new JButtonMe();
		this.jButtonCopiarEstadoPagoAuto = new JButtonMe();
		this.jButtonVerFormEstadoPagoAuto = new JButtonMe();
		this.jButtonNuevoRelacionesEstadoPagoAuto = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaEstadoPagoAuto = new JButtonMe();
		this.jButtonCerrarEstadoPagoAuto = new JButtonMe();
		
		this.jScrollPanelDatosEstadoPagoAuto = new JScrollPane();   
        this.jScrollPanelDatosGeneralEstadoPagoAuto = new JScrollPane();
		
				
		
		
		this.jPanelAccionesEstadoPagoAuto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Estado Pago Automatico";
		
		if(!this.estadopagoautoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosEstadoPagoAuto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Pago Automaticos" + this.sPath));
		} else {
			this.jScrollPanelDatosEstadoPagoAuto.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralEstadoPagoAuto.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesEstadoPagoAuto.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesEstadoPagoAuto.setToolTipText("Acciones");
        this.jPanelAccionesEstadoPagoAuto.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralEstadoPagoAuto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEstadoPagoAuto, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoEstadoPagoAuto=new ReporteDinamicoJInternalFrame(EstadoPagoAutoConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoEstadoPagoAuto();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionEstadoPagoAuto=new ImportacionJInternalFrame(EstadoPagoAutoConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionEstadoPagoAuto();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByEstadoPagoAuto = new JButtonMe();
		
		this.jButtonAbrirOrderByEstadoPagoAuto.setText("Orden");
		this.jButtonAbrirOrderByEstadoPagoAuto.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByEstadoPagoAuto,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByEstadoPagoAuto, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByEstadoPagoAuto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByEstadoPagoAuto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByEstadoPagoAuto=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEstadoPagoAuto,false,this);
			
			//this.cargarOrderByEstadoPagoAuto(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByEstadoPagoAuto=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEstadoPagoAuto,true,this);
			
			//this.cargarOrderByEstadoPagoAuto(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosEstadoPagoAuto.setMinimumSize(new Dimension(400,50));//330
		this.jTableDatosEstadoPagoAuto.setMaximumSize(new Dimension(400,50));//330
		this.jTableDatosEstadoPagoAuto.setPreferredSize(new Dimension(400,50));//330
		
		this.jScrollPanelDatosEstadoPagoAuto.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosEstadoPagoAuto.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosEstadoPagoAuto.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoEstadoPagoAuto.setText("Nuevo");
		this.jButtonDuplicarEstadoPagoAuto.setText("Duplicar");
		this.jButtonCopiarEstadoPagoAuto.setText("Copiar");
		this.jButtonVerFormEstadoPagoAuto.setText("Ver");
		this.jButtonNuevoRelacionesEstadoPagoAuto.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaEstadoPagoAuto.setText("Guardar");
		this.jButtonCerrarEstadoPagoAuto.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoEstadoPagoAuto,"nuevo_button","Nuevo",this.estadopagoautoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarEstadoPagoAuto,"duplicar_button","Duplicar",this.estadopagoautoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarEstadoPagoAuto,"copiar_button","Copiar",this.estadopagoautoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormEstadoPagoAuto,"ver_form","Ver",this.estadopagoautoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesEstadoPagoAuto,"nuevorelaciones_button","Nuevo Rel",this.estadopagoautoSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaEstadoPagoAuto,"guardarcambiostabla_button","Guardar",this.estadopagoautoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarEstadoPagoAuto,"cerrar_button","Salir",this.estadopagoautoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoEstadoPagoAuto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarEstadoPagoAuto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarEstadoPagoAuto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormEstadoPagoAuto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesEstadoPagoAuto, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaEstadoPagoAuto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarEstadoPagoAuto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoEstadoPagoAuto.setToolTipText("Nuevo"+" "+EstadoPagoAutoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarEstadoPagoAuto.setToolTipText("Duplicar"+" "+EstadoPagoAutoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarEstadoPagoAuto.setToolTipText("Copiar"+" "+EstadoPagoAutoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormEstadoPagoAuto.setToolTipText("Ver"+" "+EstadoPagoAutoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesEstadoPagoAuto.setToolTipText("Nuevo Rel"+" "+EstadoPagoAutoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaEstadoPagoAuto.setToolTipText("Guardar"+" "+EstadoPagoAutoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarEstadoPagoAuto.setToolTipText("Salir"+" "+EstadoPagoAutoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoEstadoPagoAuto";
		inputMap = this.jButtonNuevoEstadoPagoAuto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoEstadoPagoAuto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoEstadoPagoAuto"));
		
		//DUPLICAR
		sMapKey = "DuplicarEstadoPagoAuto";
		inputMap = this.jButtonDuplicarEstadoPagoAuto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarEstadoPagoAuto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarEstadoPagoAuto"));
		
		//COPIAR
		sMapKey = "CopiarEstadoPagoAuto";
		inputMap = this.jButtonCopiarEstadoPagoAuto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarEstadoPagoAuto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarEstadoPagoAuto"));
		
		//VEr FORM
		sMapKey = "VerFormEstadoPagoAuto";
		inputMap = this.jButtonVerFormEstadoPagoAuto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormEstadoPagoAuto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormEstadoPagoAuto"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesEstadoPagoAuto";
		inputMap = this.jButtonNuevoRelacionesEstadoPagoAuto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesEstadoPagoAuto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesEstadoPagoAuto"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarEstadoPagoAuto";
		inputMap = this.jButtonModificarEstadoPagoAuto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarEstadoPagoAuto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarEstadoPagoAuto"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarEstadoPagoAuto";
		inputMap = this.jButtonCerrarEstadoPagoAuto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarEstadoPagoAuto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarEstadoPagoAuto"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaEstadoPagoAuto";
		inputMap = this.jButtonGuardarCambiosTablaEstadoPagoAuto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaEstadoPagoAuto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaEstadoPagoAuto"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesEstadoPagoAuto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesEstadoPagoAuto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionEstadoPagoAuto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1EstadoPagoAuto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2EstadoPagoAuto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3EstadoPagoAuto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4EstadoPagoAuto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5EstadoPagoAuto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesEstadoPagoAuto.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesEstadoPagoAuto.setName("jPanelParametrosReportesEstadoPagoAuto"); 
		
		this.jPanelParametrosReportesAccionesEstadoPagoAuto.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesEstadoPagoAuto.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesEstadoPagoAuto.setName("jPanelParametrosReportesAccionesEstadoPagoAuto"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesEstadoPagoAuto, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesEstadoPagoAuto, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionEstadoPagoAuto = new JButtonMe();
		this.jButtonRecargarInformacionEstadoPagoAuto.setText("Recargar");
		this.jButtonRecargarInformacionEstadoPagoAuto.setToolTipText("Recargar"+" "+EstadoPagoAutoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionEstadoPagoAuto,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionEstadoPagoAuto = new JButtonMe();
		this.jButtonProcesarInformacionEstadoPagoAuto.setText("Procesar");
		this.jButtonProcesarInformacionEstadoPagoAuto.setToolTipText("Procesar"+" "+EstadoPagoAutoConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionEstadoPagoAuto.setVisible(false);
			
		this.jButtonProcesarInformacionEstadoPagoAuto.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionEstadoPagoAuto.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionEstadoPagoAuto.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesEstadoPagoAuto = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEstadoPagoAuto.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesEstadoPagoAuto.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesEstadoPagoAuto = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEstadoPagoAuto.setText("TIPO");       
		this.jComboBoxTiposReportesEstadoPagoAuto.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesEstadoPagoAuto = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEstadoPagoAuto.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesEstadoPagoAuto.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionEstadoPagoAuto = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionEstadoPagoAuto.setText("Paginacion");
		this.jComboBoxTiposPaginacionEstadoPagoAuto.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesEstadoPagoAuto = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesEstadoPagoAuto.setText("Accion");
		this.jComboBoxTiposRelacionesEstadoPagoAuto.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesEstadoPagoAuto = new JComboBoxMe();
		//this.jComboBoxTiposAccionesEstadoPagoAuto.setText("Accion");
		this.jComboBoxTiposAccionesEstadoPagoAuto.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarEstadoPagoAuto = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarEstadoPagoAuto.setText("Accion");
		this.jComboBoxTiposSeleccionarEstadoPagoAuto.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralEstadoPagoAuto=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralEstadoPagoAuto.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralEstadoPagoAuto.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralEstadoPagoAuto.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesEstadoPagoAuto = new JLabelMe();
		
		this.jLabelAccionesEstadoPagoAuto.setText("Acciones");		
		this.jLabelAccionesEstadoPagoAuto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEstadoPagoAuto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEstadoPagoAuto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosEstadoPagoAuto = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosEstadoPagoAuto.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosEstadoPagoAuto.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosEstadoPagoAuto = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosEstadoPagoAuto.setText("Seleccionados");
		this.jCheckBoxSeleccionadosEstadoPagoAuto.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaEstadoPagoAuto = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaEstadoPagoAuto.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaEstadoPagoAuto.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteEstadoPagoAuto = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteEstadoPagoAuto.setText("Graf.");
		this.jCheckBoxConGraficoReporteEstadoPagoAuto.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresEstadoPagoAuto = new JButtonMe();
		//this.jButtonAnterioresEstadoPagoAuto.setText("<<");
        this.jButtonAnterioresEstadoPagoAuto.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresEstadoPagoAuto,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresEstadoPagoAuto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesEstadoPagoAuto = new JButtonMe();
		//this.jButtonSiguientesEstadoPagoAuto.setText(">>");
        this.jButtonSiguientesEstadoPagoAuto.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesEstadoPagoAuto,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesEstadoPagoAuto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosEstadoPagoAuto = new JButtonMe();
		this.jButtonNuevoGuardarCambiosEstadoPagoAuto.setText("Nue");
        this.jButtonNuevoGuardarCambiosEstadoPagoAuto.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosEstadoPagoAuto,"nuevoguardarcambios_button","Nue",this.estadopagoautoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosEstadoPagoAuto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosEstadoPagoAuto";
		inputMap = this.jButtonNuevoGuardarCambiosEstadoPagoAuto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosEstadoPagoAuto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosEstadoPagoAuto"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionEstadoPagoAuto";
		inputMap = this.jButtonRecargarInformacionEstadoPagoAuto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionEstadoPagoAuto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionEstadoPagoAuto"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesEstadoPagoAuto";
		inputMap = this.jButtonSiguientesEstadoPagoAuto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesEstadoPagoAuto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesEstadoPagoAuto"));
		
		//ANTERIORES		
		sMapKey = "AnterioresEstadoPagoAuto";
		inputMap = this.jButtonAnterioresEstadoPagoAuto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresEstadoPagoAuto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresEstadoPagoAuto"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasEstadoPagoAuto();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesEstadoPagoAuto.setMinimumSize(new Dimension(this.getWidth(),EstadoPagoAutoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EstadoPagoAutoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesEstadoPagoAuto.setMaximumSize(new Dimension(this.getWidth(),EstadoPagoAutoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EstadoPagoAutoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesEstadoPagoAuto.setPreferredSize(new Dimension(this.getWidth(),EstadoPagoAutoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EstadoPagoAutoBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionEstadoPagoAuto = new GridBagLayout();

			this.jPanelPaginacionEstadoPagoAuto.setLayout(gridaBagLayoutPaginacionEstadoPagoAuto);						
			
			this.gridBagConstraintsEstadoPagoAuto = new GridBagConstraints();
			this.gridBagConstraintsEstadoPagoAuto.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsEstadoPagoAuto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoPagoAuto.gridy = 0;
			this.gridBagConstraintsEstadoPagoAuto.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionEstadoPagoAuto.add(this.jButtonAnterioresEstadoPagoAuto, this.gridBagConstraintsEstadoPagoAuto);
					
						
			this.gridBagConstraintsEstadoPagoAuto = new GridBagConstraints();
			this.gridBagConstraintsEstadoPagoAuto.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsEstadoPagoAuto.gridy = 0;
			
			this.jPanelPaginacionEstadoPagoAuto.add(this.jButtonNuevoGuardarCambiosEstadoPagoAuto, this.gridBagConstraintsEstadoPagoAuto);
						
			
			this.gridBagConstraintsEstadoPagoAuto = new GridBagConstraints();
			this.gridBagConstraintsEstadoPagoAuto.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsEstadoPagoAuto.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsEstadoPagoAuto.gridy = 0;
			this.jPanelPaginacionEstadoPagoAuto.add(this.jButtonSiguientesEstadoPagoAuto, this.gridBagConstraintsEstadoPagoAuto);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsEstadoPagoAuto = new GridBagConstraints();
			this.gridBagConstraintsEstadoPagoAuto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoPagoAuto.gridy = 1;
			this.gridBagConstraintsEstadoPagoAuto.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEstadoPagoAuto.add(this.jButtonNuevoEstadoPagoAuto, this.gridBagConstraintsEstadoPagoAuto);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsEstadoPagoAuto = new GridBagConstraints();
				this.gridBagConstraintsEstadoPagoAuto.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsEstadoPagoAuto.gridy = 1;
				this.gridBagConstraintsEstadoPagoAuto.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionEstadoPagoAuto.add(this.jButtonNuevoRelacionesEstadoPagoAuto, this.gridBagConstraintsEstadoPagoAuto);
			}
			
			
			if(!this.estadopagoautoSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsEstadoPagoAuto = new GridBagConstraints();
				this.gridBagConstraintsEstadoPagoAuto.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsEstadoPagoAuto.gridy = 1;
				this.gridBagConstraintsEstadoPagoAuto.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionEstadoPagoAuto.add(this.jButtonGuardarCambiosTablaEstadoPagoAuto, this.gridBagConstraintsEstadoPagoAuto);
			}
			
			
			
			this.gridBagConstraintsEstadoPagoAuto = new GridBagConstraints();
			this.gridBagConstraintsEstadoPagoAuto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoPagoAuto.gridy = 1;
			this.gridBagConstraintsEstadoPagoAuto.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEstadoPagoAuto.add(this.jButtonDuplicarEstadoPagoAuto, this.gridBagConstraintsEstadoPagoAuto);
			
			this.gridBagConstraintsEstadoPagoAuto = new GridBagConstraints();
			this.gridBagConstraintsEstadoPagoAuto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoPagoAuto.gridy = 1;
			this.gridBagConstraintsEstadoPagoAuto.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEstadoPagoAuto.add(this.jButtonCopiarEstadoPagoAuto, this.gridBagConstraintsEstadoPagoAuto);
		
			this.gridBagConstraintsEstadoPagoAuto = new GridBagConstraints();
			this.gridBagConstraintsEstadoPagoAuto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoPagoAuto.gridy = 1;
			this.gridBagConstraintsEstadoPagoAuto.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEstadoPagoAuto.add(this.jButtonVerFormEstadoPagoAuto, this.gridBagConstraintsEstadoPagoAuto);
		
			this.gridBagConstraintsEstadoPagoAuto = new GridBagConstraints();
			this.gridBagConstraintsEstadoPagoAuto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoPagoAuto.gridy = 1;
			this.gridBagConstraintsEstadoPagoAuto.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionEstadoPagoAuto.add(this.jButtonCerrarEstadoPagoAuto, this.gridBagConstraintsEstadoPagoAuto);
		
		
		
		this.jButtonRecargarInformacionEstadoPagoAuto.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionEstadoPagoAuto.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionEstadoPagoAuto.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionEstadoPagoAuto, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesEstadoPagoAuto.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesEstadoPagoAuto.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesEstadoPagoAuto.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesEstadoPagoAuto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesEstadoPagoAuto.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesEstadoPagoAuto.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesEstadoPagoAuto.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesEstadoPagoAuto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesEstadoPagoAuto.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesEstadoPagoAuto.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesEstadoPagoAuto.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesEstadoPagoAuto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionEstadoPagoAuto.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionEstadoPagoAuto.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionEstadoPagoAuto.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionEstadoPagoAuto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesEstadoPagoAuto.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesEstadoPagoAuto.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesEstadoPagoAuto.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesEstadoPagoAuto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesEstadoPagoAuto.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEstadoPagoAuto.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEstadoPagoAuto.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesEstadoPagoAuto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarEstadoPagoAuto.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarEstadoPagoAuto.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarEstadoPagoAuto.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarEstadoPagoAuto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaEstadoPagoAuto.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaEstadoPagoAuto.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaEstadoPagoAuto.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaEstadoPagoAuto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteEstadoPagoAuto.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteEstadoPagoAuto.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteEstadoPagoAuto.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteEstadoPagoAuto, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosEstadoPagoAuto.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosEstadoPagoAuto.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosEstadoPagoAuto.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosEstadoPagoAuto, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosEstadoPagoAuto.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosEstadoPagoAuto.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosEstadoPagoAuto.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosEstadoPagoAuto, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesEstadoPagoAuto = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesEstadoPagoAuto = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1EstadoPagoAuto = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2EstadoPagoAuto = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3EstadoPagoAuto = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4EstadoPagoAuto = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesEstadoPagoAuto.setLayout(gridaBagParametrosReportesEstadoPagoAuto);
			this.jPanelParametrosReportesAccionesEstadoPagoAuto.setLayout(gridaBagParametrosReportesAccionesEstadoPagoAuto);
			
			
			this.jPanelParametrosAuxiliar1EstadoPagoAuto.setLayout(gridaBagParametrosAuxiliar1EstadoPagoAuto);
			this.jPanelParametrosAuxiliar2EstadoPagoAuto.setLayout(gridaBagParametrosAuxiliar2EstadoPagoAuto);
			this.jPanelParametrosAuxiliar3EstadoPagoAuto.setLayout(gridaBagParametrosAuxiliar3EstadoPagoAuto);
			this.jPanelParametrosAuxiliar4EstadoPagoAuto.setLayout(gridaBagParametrosAuxiliar4EstadoPagoAuto);
			//this.jPanelParametrosAuxiliar5EstadoPagoAuto.setLayout(gridaBagParametrosAuxiliar2EstadoPagoAuto);			
			
			
			
			
			this.gridBagConstraintsEstadoPagoAuto = new GridBagConstraints();
			this.gridBagConstraintsEstadoPagoAuto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoPagoAuto.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEstadoPagoAuto.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstadoPagoAuto.add(this.jButtonRecargarInformacionEstadoPagoAuto, this.gridBagConstraintsEstadoPagoAuto);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsEstadoPagoAuto = new GridBagConstraints();
			this.gridBagConstraintsEstadoPagoAuto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoPagoAuto.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoPagoAuto.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1EstadoPagoAuto.add(this.jComboBoxTiposPaginacionEstadoPagoAuto, this.gridBagConstraintsEstadoPagoAuto);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsEstadoPagoAuto = new GridBagConstraints();
			this.gridBagConstraintsEstadoPagoAuto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoPagoAuto.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoPagoAuto.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1EstadoPagoAuto.add(this.jCheckBoxConAltoMaximoTablaEstadoPagoAuto, this.gridBagConstraintsEstadoPagoAuto);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsEstadoPagoAuto = new GridBagConstraints();
			this.gridBagConstraintsEstadoPagoAuto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoPagoAuto.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoPagoAuto.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1EstadoPagoAuto.add(this.jComboBoxTiposArchivosReportesEstadoPagoAuto, this.gridBagConstraintsEstadoPagoAuto);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsEstadoPagoAuto = new GridBagConstraints();
			this.gridBagConstraintsEstadoPagoAuto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoPagoAuto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoPagoAuto.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoPagoAuto.add(this.jPanelParametrosAuxiliar1EstadoPagoAuto, this.gridBagConstraintsEstadoPagoAuto);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsEstadoPagoAuto = new GridBagConstraints();
			this.gridBagConstraintsEstadoPagoAuto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoPagoAuto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoPagoAuto.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEstadoPagoAuto.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4EstadoPagoAuto.add(this.jComboBoxTiposReportesEstadoPagoAuto, this.gridBagConstraintsEstadoPagoAuto);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsEstadoPagoAuto = new GridBagConstraints();
			this.gridBagConstraintsEstadoPagoAuto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoPagoAuto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoPagoAuto.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoPagoAuto.add(this.jPanelParametrosAuxiliar4EstadoPagoAuto, this.gridBagConstraintsEstadoPagoAuto);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsEstadoPagoAuto = new GridBagConstraints();
			this.gridBagConstraintsEstadoPagoAuto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoPagoAuto.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoPagoAuto.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoPagoAuto.add(this.jComboBoxTiposReportesEstadoPagoAuto, this.gridBagConstraintsEstadoPagoAuto);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsEstadoPagoAuto = new GridBagConstraints();
			this.gridBagConstraintsEstadoPagoAuto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoPagoAuto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoPagoAuto.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEstadoPagoAuto.add(this.jCheckBoxGenerarReporteEstadoPagoAuto, this.gridBagConstraintsEstadoPagoAuto);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsEstadoPagoAuto = new GridBagConstraints();
			this.gridBagConstraintsEstadoPagoAuto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoPagoAuto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoPagoAuto.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoPagoAuto.add(this.jPanelParametrosAuxiliar2EstadoPagoAuto, this.gridBagConstraintsEstadoPagoAuto);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsEstadoPagoAuto = new GridBagConstraints();
			this.gridBagConstraintsEstadoPagoAuto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoPagoAuto.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEstadoPagoAuto.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEstadoPagoAuto.add(this.jLabelAccionesEstadoPagoAuto, this.gridBagConstraintsEstadoPagoAuto);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsEstadoPagoAuto = new GridBagConstraints();
				this.gridBagConstraintsEstadoPagoAuto.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsEstadoPagoAuto.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsEstadoPagoAuto.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesEstadoPagoAuto.add(this.jButtonAbrirOrderByEstadoPagoAuto, this.gridBagConstraintsEstadoPagoAuto);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsEstadoPagoAuto = new GridBagConstraints();
			this.gridBagConstraintsEstadoPagoAuto.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsEstadoPagoAuto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoPagoAuto.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstadoPagoAuto.add(this.jComboBoxTiposSeleccionarEstadoPagoAuto, this.gridBagConstraintsEstadoPagoAuto);			
			
			
			/*
			this.gridBagConstraintsEstadoPagoAuto = new GridBagConstraints();
			this.gridBagConstraintsEstadoPagoAuto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoPagoAuto.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEstadoPagoAuto.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEstadoPagoAuto.add(this.jCheckBoxSeleccionarTodosEstadoPagoAuto, this.gridBagConstraintsEstadoPagoAuto);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsEstadoPagoAuto = new GridBagConstraints();
			this.gridBagConstraintsEstadoPagoAuto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoPagoAuto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoPagoAuto.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEstadoPagoAuto.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3EstadoPagoAuto.add(this.jCheckBoxSeleccionarTodosEstadoPagoAuto, this.gridBagConstraintsEstadoPagoAuto);															
				
			this.gridBagConstraintsEstadoPagoAuto = new GridBagConstraints();
			this.gridBagConstraintsEstadoPagoAuto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoPagoAuto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoPagoAuto.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEstadoPagoAuto.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3EstadoPagoAuto.add(this.jCheckBoxSeleccionadosEstadoPagoAuto, this.gridBagConstraintsEstadoPagoAuto);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsEstadoPagoAuto = new GridBagConstraints();
			this.gridBagConstraintsEstadoPagoAuto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoPagoAuto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoPagoAuto.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoPagoAuto.add(this.jPanelParametrosAuxiliar3EstadoPagoAuto, this.gridBagConstraintsEstadoPagoAuto);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsEstadoPagoAuto = new GridBagConstraints();
			this.gridBagConstraintsEstadoPagoAuto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoPagoAuto.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstadoPagoAuto.add(this.jComboBoxTiposRelacionesEstadoPagoAuto, this.gridBagConstraintsEstadoPagoAuto);
				
			this.gridBagConstraintsEstadoPagoAuto = new GridBagConstraints();
			this.gridBagConstraintsEstadoPagoAuto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoPagoAuto.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstadoPagoAuto.add(this.jComboBoxTiposAccionesEstadoPagoAuto, this.gridBagConstraintsEstadoPagoAuto);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosEstadoPagoAuto = new GridBagLayout();

			this.jScrollPanelDatosEstadoPagoAuto.setLayout(gridaBagLayoutDatosEstadoPagoAuto);
			
			this.gridBagConstraintsEstadoPagoAuto = new GridBagConstraints();
			this.gridBagConstraintsEstadoPagoAuto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoPagoAuto.gridy = 0;
			this.gridBagConstraintsEstadoPagoAuto.gridx = 0;
			
			this.jScrollPanelDatosEstadoPagoAuto.add(this.jTableDatosEstadoPagoAuto, this.gridBagConstraintsEstadoPagoAuto);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosEstadoPagoAuto.setViewportView(this.jTableDatosEstadoPagoAuto);
		this.jTableDatosEstadoPagoAuto.setFillsViewportHeight(true);
		this.jTableDatosEstadoPagoAuto.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesEstadoPagoAuto= new GridBagLayout();
		this.jPanelAccionesEstadoPagoAuto.setLayout(gridaBagLayoutAccionesEstadoPagoAuto);
		
		
		/*	
		this.gridBagConstraintsEstadoPagoAuto = new GridBagConstraints();
		this.gridBagConstraintsEstadoPagoAuto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoPagoAuto.gridy = 0;
		this.gridBagConstraintsEstadoPagoAuto.gridx = 0;
			
		this.jPanelAccionesEstadoPagoAuto.add(this.jButtonNuevoEstadoPagoAuto, this.gridBagConstraintsEstadoPagoAuto);
		*/
		int iPosXAccion=0;
		
						
		
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutEstadoPagoAuto = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutEstadoPagoAuto);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.estadopagoautoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsEstadoPagoAuto = new GridBagConstraints();						
			this.gridBagConstraintsEstadoPagoAuto.gridy = iGridyPrincipal++;
			this.gridBagConstraintsEstadoPagoAuto.gridx = 0;		
			//this.gridBagConstraintsEstadoPagoAuto.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoPagoAuto.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsEstadoPagoAuto.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarEstadoPagoAuto, this.gridBagConstraintsEstadoPagoAuto);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsEstadoPagoAuto = new GridBagConstraints();
		this.gridBagConstraintsEstadoPagoAuto.gridy = iGridyPrincipal++;
		this.gridBagConstraintsEstadoPagoAuto.gridx = 0;		
		//this.gridBagConstraintsEstadoPagoAuto.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoPagoAuto.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsEstadoPagoAuto.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsEstadoPagoAuto);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsEstadoPagoAuto = new GridBagConstraints();
		this.gridBagConstraintsEstadoPagoAuto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoPagoAuto.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesEstadoPagoAuto, this.gridBagConstraintsEstadoPagoAuto);								
		
		
		/*
		this.gridBagConstraintsEstadoPagoAuto = new GridBagConstraints();
		this.gridBagConstraintsEstadoPagoAuto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoPagoAuto.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesEstadoPagoAuto, this.gridBagConstraintsEstadoPagoAuto);
		*/		
		
		this.gridBagConstraintsEstadoPagoAuto = new GridBagConstraints();
		this.gridBagConstraintsEstadoPagoAuto.gridy =iGridyPrincipal++;
		this.gridBagConstraintsEstadoPagoAuto.gridx =0;
		this.gridBagConstraintsEstadoPagoAuto.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsEstadoPagoAuto.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosEstadoPagoAuto, this.gridBagConstraintsEstadoPagoAuto);
				
		
		this.gridBagConstraintsEstadoPagoAuto = new GridBagConstraints();
		this.gridBagConstraintsEstadoPagoAuto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoPagoAuto.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionEstadoPagoAuto, this.gridBagConstraintsEstadoPagoAuto);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(EstadoPagoAutoJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosEstadoPagoAuto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosEstadoPagoAuto = new GridBagLayout();
			this.jPanelBusquedasParametrosEstadoPagoAuto.setLayout(gridaBagLayoutBusquedasParametrosEstadoPagoAuto);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralEstadoPagoAuto=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralEstadoPagoAuto.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEstadoPagoAuto.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEstadoPagoAuto.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsEstadoPagoAuto = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsEstadoPagoAuto = new GridBagConstraints();
		this.gridBagConstraintsEstadoPagoAuto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoPagoAuto.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposEstadoPagoAuto, this.gridBagConstraintsEstadoPagoAuto);
			
			
		this.gridBagConstraintsEstadoPagoAuto = new GridBagConstraints();
		this.gridBagConstraintsEstadoPagoAuto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoPagoAuto.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosEstadoPagoAuto, this.gridBagConstraintsEstadoPagoAuto);
		
			
		this.gridBagConstraintsEstadoPagoAuto = new GridBagConstraints();
		this.gridBagConstraintsEstadoPagoAuto.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsEstadoPagoAuto.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesEstadoPagoAuto, this.gridBagConstraintsEstadoPagoAuto);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralEstadoPagoAuto;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoEstadoPagoAuto() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoEstadoPagoAuto = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoEstadoPagoAuto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoEstadoPagoAuto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoEstadoPagoAuto.setName("jPanelReporteDinamicoEstadoPagoAuto"); 
		
		this.jPanelReporteDinamicoEstadoPagoAuto.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoEstadoPagoAuto.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoEstadoPagoAuto.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoEstadoPagoAuto.setLayout(gridaBagLayoutReporteDinamicoEstadoPagoAuto);
		
		
		this.jInternalFrameReporteDinamicoEstadoPagoAuto= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoEstadoPagoAuto = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteEstadoPagoAuto= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoEstadoPagoAuto.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoEstadoPagoAuto.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoEstadoPagoAuto.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoEstadoPagoAuto.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoEstadoPagoAuto.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoEstadoPagoAuto.setResizable(true);
	    this.jInternalFrameReporteDinamicoEstadoPagoAuto.setClosable(true);
	    this.jInternalFrameReporteDinamicoEstadoPagoAuto.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoEstadoPagoAuto.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoEstadoPagoAuto.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoEstadoPagoAuto.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoEstadoPagoAuto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Pago Automaticos"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteEstadoPagoAuto = new JLabelMe();

		this.jLabelColumnasSelectReporteEstadoPagoAuto.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteEstadoPagoAuto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteEstadoPagoAuto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteEstadoPagoAuto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsEstadoPagoAuto = new GridBagConstraints();
		this.gridBagConstraintsEstadoPagoAuto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoPagoAuto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoPagoAuto.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoEstadoPagoAuto.add(this.jLabelColumnasSelectReporteEstadoPagoAuto, this.gridBagConstraintsEstadoPagoAuto);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteEstadoPagoAuto = new JList<Reporte>();
		this.jListColumnasSelectReporteEstadoPagoAuto.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteEstadoPagoAuto.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteEstadoPagoAuto.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteEstadoPagoAuto.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteEstadoPagoAuto.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteEstadoPagoAuto=new JScrollPane(this.jListColumnasSelectReporteEstadoPagoAuto);
			
			this.jScrollColumnasSelectReporteEstadoPagoAuto.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteEstadoPagoAuto.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteEstadoPagoAuto.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteEstadoPagoAuto.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsEstadoPagoAuto = new GridBagConstraints();
		this.gridBagConstraintsEstadoPagoAuto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoPagoAuto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoPagoAuto.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoEstadoPagoAuto.add(this.jListColumnasSelectReporteEstadoPagoAuto, this.gridBagConstraintsEstadoPagoAuto);
		this.jPanelReporteDinamicoEstadoPagoAuto.add(this.jScrollColumnasSelectReporteEstadoPagoAuto, this.gridBagConstraintsEstadoPagoAuto);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteEstadoPagoAuto = new JLabelMe();

		this.jLabelRelacionesSelectReporteEstadoPagoAuto.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteEstadoPagoAuto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteEstadoPagoAuto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteEstadoPagoAuto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsEstadoPagoAuto = new GridBagConstraints();
		this.gridBagConstraintsEstadoPagoAuto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoPagoAuto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoPagoAuto.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoEstadoPagoAuto.add(this.jLabelRelacionesSelectReporteEstadoPagoAuto, this.gridBagConstraintsEstadoPagoAuto);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteEstadoPagoAuto = new JList<Reporte>();
		this.jListRelacionesSelectReporteEstadoPagoAuto.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteEstadoPagoAuto.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteEstadoPagoAuto.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteEstadoPagoAuto.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteEstadoPagoAuto.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteEstadoPagoAuto=new JScrollPane(this.jListRelacionesSelectReporteEstadoPagoAuto);
			
			this.jScrollRelacionesSelectReporteEstadoPagoAuto.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteEstadoPagoAuto.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteEstadoPagoAuto.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteEstadoPagoAuto.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsEstadoPagoAuto = new GridBagConstraints();
		this.gridBagConstraintsEstadoPagoAuto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoPagoAuto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoPagoAuto.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoEstadoPagoAuto.add(this.jListRelacionesSelectReporteEstadoPagoAuto, this.gridBagConstraintsEstadoPagoAuto);
		this.jPanelReporteDinamicoEstadoPagoAuto.add(this.jScrollRelacionesSelectReporteEstadoPagoAuto, this.gridBagConstraintsEstadoPagoAuto);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoEstadoPagoAuto = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoEstadoPagoAuto = new JComboBoxMe();
		this.jListColumnasValoresGraficoEstadoPagoAuto = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoEstadoPagoAuto = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoEstadoPagoAuto.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoEstadoPagoAuto.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoEstadoPagoAuto.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoEstadoPagoAuto.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoEstadoPagoAuto, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoEstadoPagoAuto = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoEstadoPagoAuto.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoEstadoPagoAuto.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoEstadoPagoAuto.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoEstadoPagoAuto.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoEstadoPagoAuto, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoEstadoPagoAuto = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoEstadoPagoAuto.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoEstadoPagoAuto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoEstadoPagoAuto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoEstadoPagoAuto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsEstadoPagoAuto = new GridBagConstraints();
		this.gridBagConstraintsEstadoPagoAuto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoPagoAuto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoPagoAuto.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEstadoPagoAuto.add(this.jLabelGenerarExcelReporteDinamicoEstadoPagoAuto, this.gridBagConstraintsEstadoPagoAuto);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoEstadoPagoAuto = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoEstadoPagoAuto.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoEstadoPagoAuto,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoEstadoPagoAuto.setToolTipText("Generar EXCEL"+" "+EstadoPagoAutoConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsEstadoPagoAuto = new GridBagConstraints();
		//this.gridBagConstraintsEstadoPagoAuto.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsEstadoPagoAuto.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsEstadoPagoAuto.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoEstadoPagoAuto.add(this.jButtonGenerarExcelReporteDinamicoEstadoPagoAuto, this.gridBagConstraintsEstadoPagoAuto);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsEstadoPagoAuto = new GridBagConstraints();
		this.gridBagConstraintsEstadoPagoAuto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoPagoAuto.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEstadoPagoAuto.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEstadoPagoAuto.add(this.jComboBoxTiposReportesDinamicoEstadoPagoAuto, this.gridBagConstraintsEstadoPagoAuto);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoEstadoPagoAuto = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoEstadoPagoAuto.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoEstadoPagoAuto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoEstadoPagoAuto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoEstadoPagoAuto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsEstadoPagoAuto = new GridBagConstraints();
		this.gridBagConstraintsEstadoPagoAuto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoPagoAuto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoPagoAuto.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEstadoPagoAuto.add(this.jLabelTiposArchivoReporteDinamicoEstadoPagoAuto, this.gridBagConstraintsEstadoPagoAuto);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsEstadoPagoAuto = new GridBagConstraints();
		this.gridBagConstraintsEstadoPagoAuto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoPagoAuto.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEstadoPagoAuto.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEstadoPagoAuto.add(this.jComboBoxTiposArchivosReportesDinamicoEstadoPagoAuto, this.gridBagConstraintsEstadoPagoAuto);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoEstadoPagoAuto = new JButtonMe();
		this.jButtonGenerarReporteDinamicoEstadoPagoAuto.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoEstadoPagoAuto,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoEstadoPagoAuto.setToolTipText("Generar"+" "+EstadoPagoAutoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsEstadoPagoAuto = new GridBagConstraints();
		this.gridBagConstraintsEstadoPagoAuto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoPagoAuto.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEstadoPagoAuto.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEstadoPagoAuto.add(this.jButtonGenerarReporteDinamicoEstadoPagoAuto, this.gridBagConstraintsEstadoPagoAuto);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoEstadoPagoAuto = new JButtonMe();
		this.jButtonCerrarReporteDinamicoEstadoPagoAuto.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoEstadoPagoAuto,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoEstadoPagoAuto.setToolTipText("Cancelar"+" "+EstadoPagoAutoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsEstadoPagoAuto = new GridBagConstraints();
		this.gridBagConstraintsEstadoPagoAuto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoPagoAuto.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEstadoPagoAuto.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEstadoPagoAuto.add(this.jButtonCerrarReporteDinamicoEstadoPagoAuto, this.gridBagConstraintsEstadoPagoAuto);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalEstadoPagoAuto = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoEstadoPagoAuto= new JScrollPane(jPanelReporteDinamicoEstadoPagoAuto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoEstadoPagoAuto.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoEstadoPagoAuto.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoEstadoPagoAuto.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoEstadoPagoAuto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Pago Automaticos"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsEstadoPagoAuto = new GridBagConstraints();
		this.gridBagConstraintsEstadoPagoAuto.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsEstadoPagoAuto.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsEstadoPagoAuto.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoEstadoPagoAuto.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoEstadoPagoAuto.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalEstadoPagoAuto);
		this.jInternalFrameReporteDinamicoEstadoPagoAuto.getContentPane().add(this.jScrollPanelReporteDinamicoEstadoPagoAuto, this.gridBagConstraintsEstadoPagoAuto);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionEstadoPagoAuto() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionEstadoPagoAuto = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionEstadoPagoAuto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionEstadoPagoAuto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionEstadoPagoAuto.setName("jPanelImportacionEstadoPagoAuto"); 
		
		this.jPanelImportacionEstadoPagoAuto.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionEstadoPagoAuto.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionEstadoPagoAuto.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionEstadoPagoAuto.setLayout(gridaBagLayoutImportacionEstadoPagoAuto);
		
		
		this.jInternalFrameImportacionEstadoPagoAuto= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionEstadoPagoAuto= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionEstadoPagoAuto = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteEstadoPagoAuto= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionEstadoPagoAuto.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionEstadoPagoAuto.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionEstadoPagoAuto.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionEstadoPagoAuto.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionEstadoPagoAuto.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionEstadoPagoAuto.setResizable(true);
	    this.jInternalFrameImportacionEstadoPagoAuto.setClosable(true);
	    this.jInternalFrameImportacionEstadoPagoAuto.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionEstadoPagoAuto.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionEstadoPagoAuto.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionEstadoPagoAuto.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionEstadoPagoAuto.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionEstadoPagoAuto.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionEstadoPagoAuto.setResizable(true);
	    this.jInternalFrameImportacionEstadoPagoAuto.setClosable(true);
	    this.jInternalFrameImportacionEstadoPagoAuto.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionEstadoPagoAuto.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionEstadoPagoAuto.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionEstadoPagoAuto.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionEstadoPagoAuto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Pago Automaticos"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionEstadoPagoAuto = new JLabelMe();

		this.jLabelArchivoImportacionEstadoPagoAuto.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionEstadoPagoAuto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionEstadoPagoAuto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionEstadoPagoAuto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsEstadoPagoAuto = new GridBagConstraints();
		this.gridBagConstraintsEstadoPagoAuto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoPagoAuto.gridy = iPosYImportacion;		
		this.gridBagConstraintsEstadoPagoAuto.gridx = iPosXImportacion++;
			
		this.jPanelImportacionEstadoPagoAuto.add(this.jLabelArchivoImportacionEstadoPagoAuto, this.gridBagConstraintsEstadoPagoAuto);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionEstadoPagoAuto = new JFileChooser();		
		this.jFileChooserImportacionEstadoPagoAuto.setToolTipText("ESCOGER ARCHIVO"+" "+EstadoPagoAutoConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionEstadoPagoAuto = new JButtonMe();
		this.jButtonAbrirImportacionEstadoPagoAuto.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionEstadoPagoAuto,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionEstadoPagoAuto.setToolTipText("Generar"+" "+EstadoPagoAutoConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsEstadoPagoAuto = new GridBagConstraints();
		this.gridBagConstraintsEstadoPagoAuto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoPagoAuto.gridy = iPosYImportacion;
		this.gridBagConstraintsEstadoPagoAuto.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEstadoPagoAuto.add(this.jButtonAbrirImportacionEstadoPagoAuto, this.gridBagConstraintsEstadoPagoAuto);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionEstadoPagoAuto = new JLabelMe();

		this.jLabelPathArchivoImportacionEstadoPagoAuto.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionEstadoPagoAuto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionEstadoPagoAuto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionEstadoPagoAuto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsEstadoPagoAuto = new GridBagConstraints();
		this.gridBagConstraintsEstadoPagoAuto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoPagoAuto.gridy = iPosYImportacion;		
		this.gridBagConstraintsEstadoPagoAuto.gridx = iPosXImportacion++;
			
		this.jPanelImportacionEstadoPagoAuto.add(this.jLabelPathArchivoImportacionEstadoPagoAuto, this.gridBagConstraintsEstadoPagoAuto);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionEstadoPagoAuto=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionEstadoPagoAuto.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionEstadoPagoAuto.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionEstadoPagoAuto.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsEstadoPagoAuto = new GridBagConstraints();
		this.gridBagConstraintsEstadoPagoAuto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoPagoAuto.gridy = iPosYImportacion;
		this.gridBagConstraintsEstadoPagoAuto.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEstadoPagoAuto.add(this.jTextFieldPathArchivoImportacionEstadoPagoAuto, this.gridBagConstraintsEstadoPagoAuto);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionEstadoPagoAuto = new JButtonMe();
		this.jButtonGenerarImportacionEstadoPagoAuto.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionEstadoPagoAuto,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionEstadoPagoAuto.setToolTipText("Generar"+" "+EstadoPagoAutoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsEstadoPagoAuto = new GridBagConstraints();
		this.gridBagConstraintsEstadoPagoAuto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoPagoAuto.gridy = iPosYImportacion;
		this.gridBagConstraintsEstadoPagoAuto.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEstadoPagoAuto.add(this.jButtonGenerarImportacionEstadoPagoAuto, this.gridBagConstraintsEstadoPagoAuto);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionEstadoPagoAuto = new JButtonMe();
		this.jButtonCerrarImportacionEstadoPagoAuto.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionEstadoPagoAuto,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionEstadoPagoAuto.setToolTipText("Cancelar"+" "+EstadoPagoAutoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsEstadoPagoAuto = new GridBagConstraints();
		this.gridBagConstraintsEstadoPagoAuto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoPagoAuto.gridy = iPosYImportacion;
		this.gridBagConstraintsEstadoPagoAuto.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEstadoPagoAuto.add(this.jButtonCerrarImportacionEstadoPagoAuto, this.gridBagConstraintsEstadoPagoAuto);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalEstadoPagoAuto = new GridBagLayout();
		
		this.jScrollPanelImportacionEstadoPagoAuto= new JScrollPane(jPanelImportacionEstadoPagoAuto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsEstadoPagoAuto = new GridBagConstraints();
		this.gridBagConstraintsEstadoPagoAuto.gridy =iPosYImportacion;
		this.gridBagConstraintsEstadoPagoAuto.gridx =iPosXImportacion;
		this.gridBagConstraintsEstadoPagoAuto.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionEstadoPagoAuto.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionEstadoPagoAuto.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalEstadoPagoAuto);
		this.jInternalFrameImportacionEstadoPagoAuto.getContentPane().add(this.jScrollPanelImportacionEstadoPagoAuto, this.gridBagConstraintsEstadoPagoAuto);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByEstadoPagoAuto(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByEstadoPagoAuto = new JButtonMe();
			this.jButtonAbrirOrderByEstadoPagoAuto.setText("Orden");
			this.jButtonAbrirOrderByEstadoPagoAuto.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByEstadoPagoAuto,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByEstadoPagoAuto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByEstadoPagoAuto";
			inputMap = this.jButtonAbrirOrderByEstadoPagoAuto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByEstadoPagoAuto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByEstadoPagoAuto"));
		
		
			GridBagLayout gridaBagLayoutOrderByEstadoPagoAuto = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByEstadoPagoAuto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByEstadoPagoAuto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByEstadoPagoAuto.setName("jPanelOrderByEstadoPagoAuto"); 
			
			this.jPanelOrderByEstadoPagoAuto.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByEstadoPagoAuto.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByEstadoPagoAuto.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByEstadoPagoAuto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByEstadoPagoAuto.setLayout(gridaBagLayoutOrderByEstadoPagoAuto);
			
			
			this.jTableDatosEstadoPagoAutoOrderBy = new JTableMe();        
			this.jTableDatosEstadoPagoAutoOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosEstadoPagoAutoOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosEstadoPagoAutoOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosEstadoPagoAutoOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosEstadoPagoAutoOrderBy.setViewportView(this.jTableDatosEstadoPagoAutoOrderBy);
			this.jTableDatosEstadoPagoAutoOrderBy.setFillsViewportHeight(true);
			this.jTableDatosEstadoPagoAutoOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByEstadoPagoAuto= new OrderByJInternalFrame();
			this.jInternalFrameOrderByEstadoPagoAuto= new OrderByJInternalFrame();
			this.jScrollPanelOrderByEstadoPagoAuto = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteEstadoPagoAuto= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByEstadoPagoAuto.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByEstadoPagoAuto.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByEstadoPagoAuto.setTitle("Orden");
			this.jInternalFrameOrderByEstadoPagoAuto.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByEstadoPagoAuto.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByEstadoPagoAuto.setResizable(true);
			this.jInternalFrameOrderByEstadoPagoAuto.setClosable(true);
			this.jInternalFrameOrderByEstadoPagoAuto.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByEstadoPagoAuto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByEstadoPagoAuto.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByEstadoPagoAuto.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByEstadoPagoAuto.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByEstadoPagoAuto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByEstadoPagoAuto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Pago Automaticos"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsEstadoPagoAuto = new GridBagConstraints();
			this.gridBagConstraintsEstadoPagoAuto.gridy =iPosYOrderBy++;
			this.gridBagConstraintsEstadoPagoAuto.gridx =iPosXOrderBy;
			this.gridBagConstraintsEstadoPagoAuto.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsEstadoPagoAuto.ipady =150;
				
			this.jPanelOrderByEstadoPagoAuto.add(jScrollPanelDatosEstadoPagoAutoOrderBy, this.gridBagConstraintsEstadoPagoAuto);//this.jTableDatosEstadoPagoAutoTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByEstadoPagoAuto = new JButtonMe();
			this.jButtonCerrarOrderByEstadoPagoAuto.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByEstadoPagoAuto,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByEstadoPagoAuto.setToolTipText("Cancelar"+" "+EstadoPagoAutoConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByEstadoPagoAuto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsEstadoPagoAuto = new GridBagConstraints();
			this.gridBagConstraintsEstadoPagoAuto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoPagoAuto.gridy = iPosYOrderBy++;
			this.gridBagConstraintsEstadoPagoAuto.gridx = iPosXOrderBy;
									
			this.jPanelOrderByEstadoPagoAuto.add(this.jButtonCerrarOrderByEstadoPagoAuto, this.gridBagConstraintsEstadoPagoAuto);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalEstadoPagoAuto = new GridBagLayout();
			
			this.jScrollPanelOrderByEstadoPagoAuto= new JScrollPane(jPanelOrderByEstadoPagoAuto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsEstadoPagoAuto = new GridBagConstraints();
			this.gridBagConstraintsEstadoPagoAuto.gridy =iPosYOrderBy;
			this.gridBagConstraintsEstadoPagoAuto.gridx =iPosXOrderBy;
			this.gridBagConstraintsEstadoPagoAuto.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByEstadoPagoAuto.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByEstadoPagoAuto.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalEstadoPagoAuto);
			
			this.jInternalFrameOrderByEstadoPagoAuto.getContentPane().add(this.jScrollPanelOrderByEstadoPagoAuto, this.gridBagConstraintsEstadoPagoAuto);			
		
		} else {
			this.jButtonAbrirOrderByEstadoPagoAuto = new JButtonMe();
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
			&& this.estadopagoautoSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosEstadoPagoAuto.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosEstadoPagoAuto.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosEstadoPagoAuto.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosEstadoPagoAuto.getRowHeight();//EstadoPagoAutoConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.estadopagoautoSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > EstadoPagoAutoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaEstadoPagoAuto.isSelected()) {
					iHeightTable=EstadoPagoAutoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < EstadoPagoAutoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=EstadoPagoAutoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > EstadoPagoAutoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaEstadoPagoAuto.isSelected()) {
					iHeightTable=EstadoPagoAutoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < EstadoPagoAutoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=EstadoPagoAutoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosEstadoPagoAuto.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosEstadoPagoAuto.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosEstadoPagoAuto.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosEstadoPagoAuto.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosEstadoPagoAuto.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosEstadoPagoAuto.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByEstadoPagoAuto!=null && this.jInternalFrameOrderByEstadoPagoAuto.getjTableDatosOrderBy()!=null) {
			//if(!this.estadopagoautoSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByEstadoPagoAuto.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByEstadoPagoAuto.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByEstadoPagoAuto.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByEstadoPagoAuto.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByEstadoPagoAuto.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByEstadoPagoAuto.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByEstadoPagoAuto.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosEstadoPagoAuto.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosEstadoPagoAuto.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosEstadoPagoAuto.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=estadopagoautoLogic.getEstadoPagoAutos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=estadopagoautos.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<EstadoPagoAuto> TraerEstadoPagoAutoBeans(List<EstadoPagoAuto> estadopagoautos,ArrayList<Classe> classes)throws Exception {
		try {
			for(EstadoPagoAuto estadopagoauto:estadopagoautos) {
					
				if(!(EstadoPagoAutoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || EstadoPagoAutoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					estadopagoauto.setsDetalleGeneralEntityReporte(EstadoPagoAutoConstantesFunciones.getEstadoPagoAutoDescripcion(estadopagoauto));
										
						
					
					

					if(estadopagoauto.getPagoAutos()!=null && Funciones.existeClass(classes,PagoAuto.class)) {
						try{estadopagoauto.setpagoautosDescripcionReporte(new JRBeanCollectionDataSource(PagoAutoJInternalFrame.TraerPagoAutoBeans(estadopagoauto.getPagoAutos(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//estadopagoauto.setsDetalleGeneralEntityReporte(estadopagoauto.getsDetalleGeneralEntityReporte());
										
				}
				
				//estadopagoautobeans.add(estadopagoautobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return estadopagoautos;
    }
	//PARA REPORTES FIN
}
