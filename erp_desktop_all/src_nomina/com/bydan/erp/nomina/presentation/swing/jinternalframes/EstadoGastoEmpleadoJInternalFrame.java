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
import com.bydan.erp.nomina.util.EstadoGastoEmpleadoConstantesFunciones;

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
public class EstadoGastoEmpleadoJInternalFrame extends EstadoGastoEmpleadoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarEstadoGastoEmpleado;
	
	protected JMenuBar jmenuBarEstadoGastoEmpleado;
	
	protected JMenu jmenuEstadoGastoEmpleado;
	protected JMenu jmenuDatosEstadoGastoEmpleado;
	protected JMenu jmenuArchivoEstadoGastoEmpleado;
	protected JMenu jmenuAccionesEstadoGastoEmpleado;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosEstadoGastoEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutEstadoGastoEmpleado;	
	protected GridBagConstraints gridBagConstraintsEstadoGastoEmpleado;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public EstadoGastoEmpleadoDetalleFormJInternalFrame jInternalFrameDetalleFormEstadoGastoEmpleado;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoEstadoGastoEmpleado;	
	protected ImportacionJInternalFrame jInternalFrameImportacionEstadoGastoEmpleado;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public EstadoGastoEmpleadoSessionBean estadogastoempleadoSessionBean;
		
	
	
	
	//protected JDesktopPane jDesktopPane;
	public List<EstadoGastoEmpleado> estadogastoempleados;		
	public List<EstadoGastoEmpleado> estadogastoempleadosEliminados;	
	public List<EstadoGastoEmpleado> estadogastoempleadosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByEstadoGastoEmpleado;		
	protected JButton jButtonAbrirOrderByEstadoGastoEmpleado;
	
	
	//protected JPanel jPanelOrderByEstadoGastoEmpleado;
	//public JScrollPane jScrollPanelOrderByEstadoGastoEmpleado;	
	//protected JButton jButtonCerrarOrderByEstadoGastoEmpleado;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public EstadoGastoEmpleadoLogic estadogastoempleadoLogic;
	
	
	
	public JScrollPane jScrollPanelDatosEstadoGastoEmpleado;
	public JScrollPane jScrollPanelDatosEdicionEstadoGastoEmpleado;
	public JScrollPane jScrollPanelDatosGeneralEstadoGastoEmpleado;
    
	
	
	//public JScrollPane jScrollPanelDatosEstadoGastoEmpleadoOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoEstadoGastoEmpleado;
	//public JScrollPane jScrollPanelImportacionEstadoGastoEmpleado;
	
	
	
	protected JPanel jPanelAccionesEstadoGastoEmpleado;
	
    protected JPanel jPanelPaginacionEstadoGastoEmpleado;
    protected JPanel jPanelParametrosReportesEstadoGastoEmpleado;
	protected JPanel jPanelParametrosReportesAccionesEstadoGastoEmpleado;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1EstadoGastoEmpleado;
	protected JPanel jPanelParametrosAuxiliar2EstadoGastoEmpleado;
	protected JPanel jPanelParametrosAuxiliar3EstadoGastoEmpleado;
	protected JPanel jPanelParametrosAuxiliar4EstadoGastoEmpleado;
	//protected JPanel jPanelParametrosAuxiliar5EstadoGastoEmpleado;
	
	
	
	//protected JPanel jPanelReporteDinamicoEstadoGastoEmpleado;
	//protected JPanel jPanelImportacionEstadoGastoEmpleado;
	
	
	public JTable jTableDatosEstadoGastoEmpleado;
	
	
	
	//public JTable jTableDatosEstadoGastoEmpleadoOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoEstadoGastoEmpleado;
	protected JButton jButtonDuplicarEstadoGastoEmpleado;
	protected JButton jButtonCopiarEstadoGastoEmpleado;
	protected JButton jButtonVerFormEstadoGastoEmpleado;
	protected JButton jButtonNuevoRelacionesEstadoGastoEmpleado;
	protected JButton jButtonModificarEstadoGastoEmpleado;
	
    protected JButton jButtonGuardarCambiosTablaEstadoGastoEmpleado;
	protected JButton jButtonCerrarEstadoGastoEmpleado;
	
	
	protected JButton jButtonRecargarInformacionEstadoGastoEmpleado;
	protected JButton jButtonProcesarInformacionEstadoGastoEmpleado;
	
	
	protected JButton jButtonAnterioresEstadoGastoEmpleado;
	protected JButton jButtonSiguientesEstadoGastoEmpleado;
	protected JButton jButtonNuevoGuardarCambiosEstadoGastoEmpleado;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoEstadoGastoEmpleado;
	//protected JButton jButtonCerrarReporteDinamicoEstadoGastoEmpleado;
	//protected JButton jButtonGenerarExcelReporteDinamicoEstadoGastoEmpleado;	
	
	
	
	//protected JButton jButtonAbrirImportacionEstadoGastoEmpleado;
	//protected JButton jButtonGenerarImportacionEstadoGastoEmpleado;
	//protected JButton jButtonCerrarImportacionEstadoGastoEmpleado;
	//protected JFileChooser jFileChooserImportacionEstadoGastoEmpleado;
	//protected File fileImportacionEstadoGastoEmpleado;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarEstadoGastoEmpleado;
	protected JButton jButtonDuplicarToolBarEstadoGastoEmpleado;
	protected JButton jButtonNuevoRelacionesToolBarEstadoGastoEmpleado;
	
	
	public JButton jButtonGuardarCambiosToolBarEstadoGastoEmpleado;
	protected JButton jButtonCopiarToolBarEstadoGastoEmpleado;
	protected JButton jButtonVerFormToolBarEstadoGastoEmpleado;
	public JButton jButtonGuardarCambiosTablaToolBarEstadoGastoEmpleado;
	protected JButton jButtonMostrarOcultarTablaToolBarEstadoGastoEmpleado;
	protected JButton jButtonCerrarToolBarEstadoGastoEmpleado;
	
	protected JButton jButtonRecargarInformacionToolBarEstadoGastoEmpleado;
	protected JButton jButtonProcesarInformacionToolBarEstadoGastoEmpleado;
	protected JButton jButtonAnterioresToolBarEstadoGastoEmpleado;
	protected JButton jButtonSiguientesToolBarEstadoGastoEmpleado;
	protected JButton jButtonNuevoGuardarCambiosToolBarEstadoGastoEmpleado;
	protected JButton jButtonAbrirOrderByToolBarEstadoGastoEmpleado;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoEstadoGastoEmpleado;
	protected JMenuItem jMenuItemDuplicarEstadoGastoEmpleado;
	protected JMenuItem jMenuItemNuevoRelacionesEstadoGastoEmpleado;
	
	
	protected JMenuItem jMenuItemGuardarCambiosEstadoGastoEmpleado;
	protected JMenuItem jMenuItemCopiarEstadoGastoEmpleado;
	protected JMenuItem jMenuItemVerFormEstadoGastoEmpleado;
	protected JMenuItem jMenuItemGuardarCambiosTablaEstadoGastoEmpleado;
	protected JMenuItem jMenuItemCerrarEstadoGastoEmpleado;
	protected JMenuItem jMenuItemDetalleCerrarEstadoGastoEmpleado;
	protected JMenuItem jMenuItemDetalleAbrirOrderByEstadoGastoEmpleado;
	protected JMenuItem jMenuItemDetalleMostarOcultarEstadoGastoEmpleado;
	
	protected JMenuItem jMenuItemRecargarInformacionEstadoGastoEmpleado;
	protected JMenuItem jMenuItemProcesarInformacionEstadoGastoEmpleado;
	protected JMenuItem jMenuItemAnterioresEstadoGastoEmpleado;
	protected JMenuItem jMenuItemSiguientesEstadoGastoEmpleado;
	protected JMenuItem jMenuItemNuevoGuardarCambiosEstadoGastoEmpleado;
	protected JMenuItem jMenuItemAbrirOrderByEstadoGastoEmpleado;
	protected JMenuItem jMenuItemMostrarOcultarEstadoGastoEmpleado;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesEstadoGastoEmpleado;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosEstadoGastoEmpleado;
	protected JCheckBox jCheckBoxSeleccionadosEstadoGastoEmpleado;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaEstadoGastoEmpleado;
	protected JCheckBox jCheckBoxConGraficoReporteEstadoGastoEmpleado;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesEstadoGastoEmpleado;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesEstadoGastoEmpleado;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoEstadoGastoEmpleado;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoEstadoGastoEmpleado;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesEstadoGastoEmpleado;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionEstadoGastoEmpleado;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesEstadoGastoEmpleado;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesEstadoGastoEmpleado;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarEstadoGastoEmpleado;
	protected JTextField jTextFieldValorCampoGeneralEstadoGastoEmpleado;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteEstadoGastoEmpleado;
	//public JList<Reporte> jListColumnasSelectReporteEstadoGastoEmpleado;
	//public JScrollPane jScrollColumnasSelectReporteEstadoGastoEmpleado;
	
	//public JLabel jLabelRelacionesSelectReporteEstadoGastoEmpleado;
	//public JList<Reporte> jListRelacionesSelectReporteEstadoGastoEmpleado;
	//public JScrollPane jScrollRelacionesSelectReporteEstadoGastoEmpleado;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoEstadoGastoEmpleado;
	//protected JCheckBox jCheckBoxConGraficoDinamicoEstadoGastoEmpleado;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoEstadoGastoEmpleado;
	//public JLabel jLabelTiposArchivoReporteDinamicoEstadoGastoEmpleado;
	
		
	//public JLabel jLabelArchivoImportacionEstadoGastoEmpleado;	
	//public JLabel jLabelPathArchivoImportacionEstadoGastoEmpleado;
	//protected JTextField jTextFieldPathArchivoImportacionEstadoGastoEmpleado;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoEstadoGastoEmpleado;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoEstadoGastoEmpleado;
	
	//public JLabel jLabelColumnaCategoriaValorEstadoGastoEmpleado;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorEstadoGastoEmpleado;
	
	//public JLabel jLabelColumnasValoresGraficoEstadoGastoEmpleado;
	//public JList<Reporte> jListColumnasValoresGraficoEstadoGastoEmpleado;
	//public JScrollPane jScrollColumnasValoresGraficoEstadoGastoEmpleado;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoEstadoGastoEmpleado;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoEstadoGastoEmpleado;	
	
	
	
	
	
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
	public EstadoGastoEmpleadoJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("EstadoGastoEmpleado No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoGastoEmpleadoJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EstadoGastoEmpleado No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoGastoEmpleadoJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EstadoGastoEmpleado No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoGastoEmpleadoJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("EstadoGastoEmpleado No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionEstadoGastoEmpleado)	{
		this.jButtonRecargarInformacionEstadoGastoEmpleado = jButtonRecargarInformacionEstadoGastoEmpleado;
	}
	
	public JButton getjButtonProcesarInformacionEstadoGastoEmpleado() {
		return this.jButtonProcesarInformacionEstadoGastoEmpleado;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionEstadoGastoEmpleado)	{
		this.jButtonProcesarInformacionEstadoGastoEmpleado = jButtonProcesarInformacionEstadoGastoEmpleado;
	}
	
	
	public JButton getjButtonRecargarInformacionEstadoGastoEmpleado() {
		return this.jButtonRecargarInformacionEstadoGastoEmpleado;
	}
	
	
	public List<EstadoGastoEmpleado> getestadogastoempleados() {
		return this.estadogastoempleados;
	}

	public void setestadogastoempleados(List<EstadoGastoEmpleado> estadogastoempleados) {
		this.estadogastoempleados = estadogastoempleados;
	}
	
	public List<EstadoGastoEmpleado> getestadogastoempleadosAux() {
		return this.estadogastoempleadosAux;
	}

	public void setestadogastoempleadosAux(List<EstadoGastoEmpleado> estadogastoempleadosAux) {
		this.estadogastoempleadosAux = estadogastoempleadosAux;
	}
	
	public List<EstadoGastoEmpleado> getestadogastoempleadosEliminados() {
		return this.estadogastoempleadosEliminados;
	}

	public void setEstadoGastoEmpleadosEliminados(List<EstadoGastoEmpleado> estadogastoempleadosEliminados) {
		this.estadogastoempleadosEliminados = estadogastoempleadosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarEstadoGastoEmpleado() {
		return jComboBoxTiposSeleccionarEstadoGastoEmpleado;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarEstadoGastoEmpleado(
			JComboBox jComboBoxTiposSeleccionarEstadoGastoEmpleado) {
		this.jComboBoxTiposSeleccionarEstadoGastoEmpleado = jComboBoxTiposSeleccionarEstadoGastoEmpleado;
	}
	
	public void setBorderResaltarTiposSeleccionarEstadoGastoEmpleado() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarEstadoGastoEmpleado.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarEstadoGastoEmpleado .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralEstadoGastoEmpleado() {
		return jTextFieldValorCampoGeneralEstadoGastoEmpleado;
	}

	public void setjTextFieldValorCampoGeneralEstadoGastoEmpleado(
			JTextField jTextFieldValorCampoGeneralEstadoGastoEmpleado) {
		this.jTextFieldValorCampoGeneralEstadoGastoEmpleado = jTextFieldValorCampoGeneralEstadoGastoEmpleado;
	}

	public void setBorderResaltarValorCampoGeneralEstadoGastoEmpleado() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoGastoEmpleado.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralEstadoGastoEmpleado .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosEstadoGastoEmpleado() {
		return this.jCheckBoxSeleccionarTodosEstadoGastoEmpleado;
	}

	public void setjCheckBoxSeleccionarTodosEstadoGastoEmpleado(
			JCheckBox jCheckBoxSeleccionarTodosEstadoGastoEmpleado) {
		this.jCheckBoxSeleccionarTodosEstadoGastoEmpleado = jCheckBoxSeleccionarTodosEstadoGastoEmpleado;
	}

	public void setBorderResaltarSeleccionarTodosEstadoGastoEmpleado() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoGastoEmpleado.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosEstadoGastoEmpleado .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosEstadoGastoEmpleado() {
		return this.jCheckBoxSeleccionadosEstadoGastoEmpleado;
	}

	public void setjCheckBoxSeleccionadosEstadoGastoEmpleado(
			JCheckBox jCheckBoxSeleccionadosEstadoGastoEmpleado) {
		this.jCheckBoxSeleccionadosEstadoGastoEmpleado = jCheckBoxSeleccionadosEstadoGastoEmpleado;
	}
	
	public void setBorderResaltarSeleccionadosEstadoGastoEmpleado() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoGastoEmpleado.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosEstadoGastoEmpleado .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesEstadoGastoEmpleado() {
		return this.jComboBoxTiposArchivosReportesEstadoGastoEmpleado;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesEstadoGastoEmpleado(
			JComboBox jComboBoxTiposArchivosReportesEstadoGastoEmpleado) {
		this.jComboBoxTiposArchivosReportesEstadoGastoEmpleado = jComboBoxTiposArchivosReportesEstadoGastoEmpleado;
	}

	public void setBorderResaltarTiposArchivosReportesEstadoGastoEmpleado() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoGastoEmpleado.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesEstadoGastoEmpleado .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesEstadoGastoEmpleado() {
		return this.jComboBoxTiposReportesEstadoGastoEmpleado;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesEstadoGastoEmpleado(
			JComboBox jComboBoxTiposReportesEstadoGastoEmpleado) {
		this.jComboBoxTiposReportesEstadoGastoEmpleado = jComboBoxTiposReportesEstadoGastoEmpleado;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoEstadoGastoEmpleado() {
	//	return jComboBoxTiposReportesDinamicoEstadoGastoEmpleado;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoEstadoGastoEmpleado(
	//		JComboBox jComboBoxTiposReportesDinamicoEstadoGastoEmpleado) {
	//	this.jComboBoxTiposReportesDinamicoEstadoGastoEmpleado = jComboBoxTiposReportesDinamicoEstadoGastoEmpleado;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoEstadoGastoEmpleado() {
	//	return jComboBoxTiposArchivosReportesDinamicoEstadoGastoEmpleado;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoEstadoGastoEmpleado(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoEstadoGastoEmpleado) {
	//	this.jComboBoxTiposArchivosReportesDinamicoEstadoGastoEmpleado = jComboBoxTiposArchivosReportesDinamicoEstadoGastoEmpleado;
	//}
	
	public void setBorderResaltarTiposReportesEstadoGastoEmpleado() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoGastoEmpleado.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesEstadoGastoEmpleado .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesEstadoGastoEmpleado() {
		return this.jComboBoxTiposGraficosReportesEstadoGastoEmpleado;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesEstadoGastoEmpleado(
			JComboBox jComboBoxTiposGraficosReportesEstadoGastoEmpleado) {
		this.jComboBoxTiposGraficosReportesEstadoGastoEmpleado = jComboBoxTiposGraficosReportesEstadoGastoEmpleado;
	}
	
	public void setBorderResaltarTiposGraficosReportesEstadoGastoEmpleado() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoGastoEmpleado.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesEstadoGastoEmpleado .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionEstadoGastoEmpleado() {
		return this.jComboBoxTiposPaginacionEstadoGastoEmpleado;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionEstadoGastoEmpleado(
			JComboBox jComboBoxTiposPaginacionEstadoGastoEmpleado) {
		this.jComboBoxTiposPaginacionEstadoGastoEmpleado = jComboBoxTiposPaginacionEstadoGastoEmpleado;
	}
	
	public void setBorderResaltarTiposPaginacionEstadoGastoEmpleado() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoGastoEmpleado.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionEstadoGastoEmpleado .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesEstadoGastoEmpleado() {
		return this.jComboBoxTiposRelacionesEstadoGastoEmpleado;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesEstadoGastoEmpleado() {
		return this.jComboBoxTiposAccionesEstadoGastoEmpleado;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesEstadoGastoEmpleado(
			JComboBox jComboBoxTiposRelacionesEstadoGastoEmpleado) {
		this.jComboBoxTiposRelacionesEstadoGastoEmpleado = jComboBoxTiposRelacionesEstadoGastoEmpleado;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesEstadoGastoEmpleado(
			JComboBox jComboBoxTiposAccionesEstadoGastoEmpleado) {
		this.jComboBoxTiposAccionesEstadoGastoEmpleado = jComboBoxTiposAccionesEstadoGastoEmpleado;
	}
	
	public void setBorderResaltarTiposRelacionesEstadoGastoEmpleado() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoGastoEmpleado.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesEstadoGastoEmpleado .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesEstadoGastoEmpleado() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoGastoEmpleado.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesEstadoGastoEmpleado .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoEstadoGastoEmpleado() {
	//	return jCheckBoxConGraficoDinamicoEstadoGastoEmpleado;
	//}

	//public void setjCheckBoxConGraficoDinamicoEstadoGastoEmpleado(
	//		JCheckBox jCheckBoxConGraficoDinamicoEstadoGastoEmpleado) {
	//	this.jCheckBoxConGraficoDinamicoEstadoGastoEmpleado = jCheckBoxConGraficoDinamicoEstadoGastoEmpleado;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoEstadoGastoEmpleado() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarEstadoGastoEmpleado.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoEstadoGastoEmpleado .setBorder(borderResaltar);		
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
		this.estadogastoempleadoSessionBean=new EstadoGastoEmpleadoSessionBean();
		
		this.estadogastoempleadoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.estadogastoempleadoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.estadogastoempleadoSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=EstadoGastoEmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=EstadoGastoEmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		EstadoGastoEmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		EstadoGastoEmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		EstadoGastoEmpleadoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Estado Gasto Empleado MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 910) {
			iHeight=910;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.estadogastoempleadoSessionBean.getEsGuardarRelacionado()) {
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
		
		EstadoGastoEmpleadoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("EstadoGastoEmpleado No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarEstadoGastoEmpleado= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarEstadoGastoEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarEstadoGastoEmpleado,this.jTtoolBarEstadoGastoEmpleado,
							"nuevo","nuevo","Nuevo"+" "+EstadoGastoEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarEstadoGastoEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarEstadoGastoEmpleado,this.jTtoolBarEstadoGastoEmpleado,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarEstadoGastoEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarEstadoGastoEmpleado,this.jTtoolBarEstadoGastoEmpleado,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+EstadoGastoEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarEstadoGastoEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarEstadoGastoEmpleado,this.jTtoolBarEstadoGastoEmpleado,
							"duplicar","duplicar","Duplicar"+" "+EstadoGastoEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarEstadoGastoEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarEstadoGastoEmpleado,this.jTtoolBarEstadoGastoEmpleado,
							"copiar","copiar","Copiar"+" "+EstadoGastoEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarEstadoGastoEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarEstadoGastoEmpleado,this.jTtoolBarEstadoGastoEmpleado,
							"ver_form","ver_form","Ver"+" "+EstadoGastoEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarEstadoGastoEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEstadoGastoEmpleado,this.jTtoolBarEstadoGastoEmpleado,
							"recargar","recargar","Recargar"+" "+EstadoGastoEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarEstadoGastoEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEstadoGastoEmpleado,this.jTtoolBarEstadoGastoEmpleado,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarEstadoGastoEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEstadoGastoEmpleado,this.jTtoolBarEstadoGastoEmpleado,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarEstadoGastoEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarEstadoGastoEmpleado,this.jTtoolBarEstadoGastoEmpleado,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarEstadoGastoEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarEstadoGastoEmpleado,this.jTtoolBarEstadoGastoEmpleado,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarEstadoGastoEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarEstadoGastoEmpleado,this.jTtoolBarEstadoGastoEmpleado,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+EstadoGastoEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarEstadoGastoEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarEstadoGastoEmpleado,this.jTtoolBarEstadoGastoEmpleado,
							"cerrar","cerrar","Salir"+" "+EstadoGastoEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarEstadoGastoEmpleado=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarEstadoGastoEmpleado;
			
				this.jButtonProcesarInformacionToolBarEstadoGastoEmpleado=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarEstadoGastoEmpleado;
				
		//protected JButton jButtonModificarToolBarEstadoGastoEmpleado;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarEstadoGastoEmpleado=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuEstadoGastoEmpleado=new JMenuMe("General");
		this.jmenuArchivoEstadoGastoEmpleado=new JMenuMe("Archivo");
		this.jmenuAccionesEstadoGastoEmpleado=new JMenuMe("Acciones");
		this.jmenuDatosEstadoGastoEmpleado=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoEstadoGastoEmpleado= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoEstadoGastoEmpleado.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoEstadoGastoEmpleado,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoEstadoGastoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarEstadoGastoEmpleado= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarEstadoGastoEmpleado.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarEstadoGastoEmpleado,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarEstadoGastoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesEstadoGastoEmpleado= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesEstadoGastoEmpleado.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesEstadoGastoEmpleado,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesEstadoGastoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosEstadoGastoEmpleado= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosEstadoGastoEmpleado.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosEstadoGastoEmpleado,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosEstadoGastoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarEstadoGastoEmpleado= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarEstadoGastoEmpleado.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarEstadoGastoEmpleado,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarEstadoGastoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormEstadoGastoEmpleado= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormEstadoGastoEmpleado.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormEstadoGastoEmpleado,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormEstadoGastoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaEstadoGastoEmpleado= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaEstadoGastoEmpleado.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaEstadoGastoEmpleado,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaEstadoGastoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarEstadoGastoEmpleado= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarEstadoGastoEmpleado.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarEstadoGastoEmpleado,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarEstadoGastoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionEstadoGastoEmpleado= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionEstadoGastoEmpleado.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionEstadoGastoEmpleado,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionEstadoGastoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionEstadoGastoEmpleado= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionEstadoGastoEmpleado.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionEstadoGastoEmpleado,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresEstadoGastoEmpleado= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresEstadoGastoEmpleado.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresEstadoGastoEmpleado,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresEstadoGastoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesEstadoGastoEmpleado= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesEstadoGastoEmpleado.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesEstadoGastoEmpleado,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesEstadoGastoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByEstadoGastoEmpleado= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByEstadoGastoEmpleado.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByEstadoGastoEmpleado,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByEstadoGastoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarEstadoGastoEmpleado= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarEstadoGastoEmpleado.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarEstadoGastoEmpleado,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarEstadoGastoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByEstadoGastoEmpleado= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByEstadoGastoEmpleado.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByEstadoGastoEmpleado,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByEstadoGastoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarEstadoGastoEmpleado= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarEstadoGastoEmpleado.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarEstadoGastoEmpleado,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarEstadoGastoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosEstadoGastoEmpleado= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosEstadoGastoEmpleado.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosEstadoGastoEmpleado,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosEstadoGastoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoEstadoGastoEmpleado.add(this.jMenuItemCerrarEstadoGastoEmpleado);
			
			this.jmenuAccionesEstadoGastoEmpleado.add(this.jMenuItemNuevoEstadoGastoEmpleado);
			this.jmenuAccionesEstadoGastoEmpleado.add(this.jMenuItemNuevoGuardarCambiosEstadoGastoEmpleado);
			this.jmenuAccionesEstadoGastoEmpleado.add(this.jMenuItemNuevoRelacionesEstadoGastoEmpleado);
			this.jmenuAccionesEstadoGastoEmpleado.add(this.jMenuItemGuardarCambiosTablaEstadoGastoEmpleado);		
			this.jmenuAccionesEstadoGastoEmpleado.add(this.jMenuItemDuplicarEstadoGastoEmpleado);		
			this.jmenuAccionesEstadoGastoEmpleado.add(this.jMenuItemCopiarEstadoGastoEmpleado);		
			this.jmenuAccionesEstadoGastoEmpleado.add(this.jMenuItemVerFormEstadoGastoEmpleado);		
			
			this.jmenuDatosEstadoGastoEmpleado.add(this.jMenuItemRecargarInformacionEstadoGastoEmpleado);				
			this.jmenuDatosEstadoGastoEmpleado.add(this.jMenuItemAnterioresEstadoGastoEmpleado);				
			this.jmenuDatosEstadoGastoEmpleado.add(this.jMenuItemSiguientesEstadoGastoEmpleado);				
			this.jmenuDatosEstadoGastoEmpleado.add(this.jMenuItemAbrirOrderByEstadoGastoEmpleado);				
			this.jmenuDatosEstadoGastoEmpleado.add(this.jMenuItemMostrarOcultarEstadoGastoEmpleado);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesEstadoGastoEmpleado.add(this.jMenuItemGuardarCambiosEstadoGastoEmpleado);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoEstadoGastoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesEstadoGastoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosEstadoGastoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarEstadoGastoEmpleado.add(this.jmenuArchivoEstadoGastoEmpleado);		
			this.jmenuBarEstadoGastoEmpleado.add(this.jmenuAccionesEstadoGastoEmpleado);		
			this.jmenuBarEstadoGastoEmpleado.add(this.jmenuDatosEstadoGastoEmpleado);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarEstadoGastoEmpleado);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasEstadoGastoEmpleado() {
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
			//this.jInternalFrameDetalleEstadoGastoEmpleado = new EstadoGastoEmpleadoDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Estado Gasto Empleado DATOS");
			this.jInternalFrameDetalleFormEstadoGastoEmpleado = new EstadoGastoEmpleadoDetalleFormJInternalFrame(jDesktopPane,this.estadogastoempleadoSessionBean.getConGuardarRelaciones(),this.estadogastoempleadoSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormEstadoGastoEmpleado = null;//new EstadoGastoEmpleadoDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutEstadoGastoEmpleado= new GridBagLayout();
		
		
		this.jTableDatosEstadoGastoEmpleado = new JTableMe();      
		
		String sToolTipEstadoGastoEmpleado="";
		sToolTipEstadoGastoEmpleado=EstadoGastoEmpleadoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipEstadoGastoEmpleado+="(Nomina.EstadoGastoEmpleado)";
		}
		
		if(!this.estadogastoempleadoSessionBean.getEsGuardarRelacionado()) {
			sToolTipEstadoGastoEmpleado+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosEstadoGastoEmpleado.setToolTipText(sToolTipEstadoGastoEmpleado);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosEstadoGastoEmpleado);
		this.jTableDatosEstadoGastoEmpleado.setAutoCreateRowSorter(true);
		this.jTableDatosEstadoGastoEmpleado.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosEstadoGastoEmpleado.setRowSelectionAllowed(true);
		this.jTableDatosEstadoGastoEmpleado.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosEstadoGastoEmpleado,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoEstadoGastoEmpleado = new JButtonMe();
		this.jButtonDuplicarEstadoGastoEmpleado = new JButtonMe();
		this.jButtonCopiarEstadoGastoEmpleado = new JButtonMe();
		this.jButtonVerFormEstadoGastoEmpleado = new JButtonMe();
		this.jButtonNuevoRelacionesEstadoGastoEmpleado = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaEstadoGastoEmpleado = new JButtonMe();
		this.jButtonCerrarEstadoGastoEmpleado = new JButtonMe();
		
		this.jScrollPanelDatosEstadoGastoEmpleado = new JScrollPane();   
        this.jScrollPanelDatosGeneralEstadoGastoEmpleado = new JScrollPane();
		
				
		
		
		this.jPanelAccionesEstadoGastoEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Estado Gasto Empleado";
		
		if(!this.estadogastoempleadoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosEstadoGastoEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Gasto Empleados" + this.sPath));
		} else {
			this.jScrollPanelDatosEstadoGastoEmpleado.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralEstadoGastoEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesEstadoGastoEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesEstadoGastoEmpleado.setToolTipText("Acciones");
        this.jPanelAccionesEstadoGastoEmpleado.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralEstadoGastoEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEstadoGastoEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoEstadoGastoEmpleado=new ReporteDinamicoJInternalFrame(EstadoGastoEmpleadoConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoEstadoGastoEmpleado();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionEstadoGastoEmpleado=new ImportacionJInternalFrame(EstadoGastoEmpleadoConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionEstadoGastoEmpleado();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByEstadoGastoEmpleado = new JButtonMe();
		
		this.jButtonAbrirOrderByEstadoGastoEmpleado.setText("Orden");
		this.jButtonAbrirOrderByEstadoGastoEmpleado.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByEstadoGastoEmpleado,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByEstadoGastoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByEstadoGastoEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByEstadoGastoEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByEstadoGastoEmpleado=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEstadoGastoEmpleado,false,this);
			
			//this.cargarOrderByEstadoGastoEmpleado(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByEstadoGastoEmpleado=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEstadoGastoEmpleado,true,this);
			
			//this.cargarOrderByEstadoGastoEmpleado(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosEstadoGastoEmpleado.setMinimumSize(new Dimension(400,50));//430
		this.jTableDatosEstadoGastoEmpleado.setMaximumSize(new Dimension(400,50));//430
		this.jTableDatosEstadoGastoEmpleado.setPreferredSize(new Dimension(400,50));//430
		
		this.jScrollPanelDatosEstadoGastoEmpleado.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosEstadoGastoEmpleado.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosEstadoGastoEmpleado.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoEstadoGastoEmpleado.setText("Nuevo");
		this.jButtonDuplicarEstadoGastoEmpleado.setText("Duplicar");
		this.jButtonCopiarEstadoGastoEmpleado.setText("Copiar");
		this.jButtonVerFormEstadoGastoEmpleado.setText("Ver");
		this.jButtonNuevoRelacionesEstadoGastoEmpleado.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaEstadoGastoEmpleado.setText("Guardar");
		this.jButtonCerrarEstadoGastoEmpleado.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoEstadoGastoEmpleado,"nuevo_button","Nuevo",this.estadogastoempleadoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarEstadoGastoEmpleado,"duplicar_button","Duplicar",this.estadogastoempleadoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarEstadoGastoEmpleado,"copiar_button","Copiar",this.estadogastoempleadoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormEstadoGastoEmpleado,"ver_form","Ver",this.estadogastoempleadoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesEstadoGastoEmpleado,"nuevorelaciones_button","Nuevo Rel",this.estadogastoempleadoSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaEstadoGastoEmpleado,"guardarcambiostabla_button","Guardar",this.estadogastoempleadoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarEstadoGastoEmpleado,"cerrar_button","Salir",this.estadogastoempleadoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoEstadoGastoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarEstadoGastoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarEstadoGastoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormEstadoGastoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesEstadoGastoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaEstadoGastoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarEstadoGastoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoEstadoGastoEmpleado.setToolTipText("Nuevo"+" "+EstadoGastoEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarEstadoGastoEmpleado.setToolTipText("Duplicar"+" "+EstadoGastoEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarEstadoGastoEmpleado.setToolTipText("Copiar"+" "+EstadoGastoEmpleadoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormEstadoGastoEmpleado.setToolTipText("Ver"+" "+EstadoGastoEmpleadoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesEstadoGastoEmpleado.setToolTipText("Nuevo Rel"+" "+EstadoGastoEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaEstadoGastoEmpleado.setToolTipText("Guardar"+" "+EstadoGastoEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarEstadoGastoEmpleado.setToolTipText("Salir"+" "+EstadoGastoEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoEstadoGastoEmpleado";
		inputMap = this.jButtonNuevoEstadoGastoEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoEstadoGastoEmpleado.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoEstadoGastoEmpleado"));
		
		//DUPLICAR
		sMapKey = "DuplicarEstadoGastoEmpleado";
		inputMap = this.jButtonDuplicarEstadoGastoEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarEstadoGastoEmpleado.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarEstadoGastoEmpleado"));
		
		//COPIAR
		sMapKey = "CopiarEstadoGastoEmpleado";
		inputMap = this.jButtonCopiarEstadoGastoEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarEstadoGastoEmpleado.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarEstadoGastoEmpleado"));
		
		//VEr FORM
		sMapKey = "VerFormEstadoGastoEmpleado";
		inputMap = this.jButtonVerFormEstadoGastoEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormEstadoGastoEmpleado.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormEstadoGastoEmpleado"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesEstadoGastoEmpleado";
		inputMap = this.jButtonNuevoRelacionesEstadoGastoEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesEstadoGastoEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesEstadoGastoEmpleado"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarEstadoGastoEmpleado";
		inputMap = this.jButtonModificarEstadoGastoEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarEstadoGastoEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarEstadoGastoEmpleado"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarEstadoGastoEmpleado";
		inputMap = this.jButtonCerrarEstadoGastoEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarEstadoGastoEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarEstadoGastoEmpleado"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaEstadoGastoEmpleado";
		inputMap = this.jButtonGuardarCambiosTablaEstadoGastoEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaEstadoGastoEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaEstadoGastoEmpleado"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesEstadoGastoEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesEstadoGastoEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionEstadoGastoEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1EstadoGastoEmpleado= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2EstadoGastoEmpleado= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3EstadoGastoEmpleado= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4EstadoGastoEmpleado= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5EstadoGastoEmpleado= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesEstadoGastoEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesEstadoGastoEmpleado.setName("jPanelParametrosReportesEstadoGastoEmpleado"); 
		
		this.jPanelParametrosReportesAccionesEstadoGastoEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesEstadoGastoEmpleado.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesEstadoGastoEmpleado.setName("jPanelParametrosReportesAccionesEstadoGastoEmpleado"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesEstadoGastoEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesEstadoGastoEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionEstadoGastoEmpleado = new JButtonMe();
		this.jButtonRecargarInformacionEstadoGastoEmpleado.setText("Recargar");
		this.jButtonRecargarInformacionEstadoGastoEmpleado.setToolTipText("Recargar"+" "+EstadoGastoEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionEstadoGastoEmpleado,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionEstadoGastoEmpleado = new JButtonMe();
		this.jButtonProcesarInformacionEstadoGastoEmpleado.setText("Procesar");
		this.jButtonProcesarInformacionEstadoGastoEmpleado.setToolTipText("Procesar"+" "+EstadoGastoEmpleadoConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionEstadoGastoEmpleado.setVisible(false);
			
		this.jButtonProcesarInformacionEstadoGastoEmpleado.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionEstadoGastoEmpleado.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionEstadoGastoEmpleado.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesEstadoGastoEmpleado = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEstadoGastoEmpleado.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesEstadoGastoEmpleado.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesEstadoGastoEmpleado = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEstadoGastoEmpleado.setText("TIPO");       
		this.jComboBoxTiposReportesEstadoGastoEmpleado.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesEstadoGastoEmpleado = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEstadoGastoEmpleado.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesEstadoGastoEmpleado.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionEstadoGastoEmpleado = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionEstadoGastoEmpleado.setText("Paginacion");
		this.jComboBoxTiposPaginacionEstadoGastoEmpleado.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesEstadoGastoEmpleado = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesEstadoGastoEmpleado.setText("Accion");
		this.jComboBoxTiposRelacionesEstadoGastoEmpleado.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesEstadoGastoEmpleado = new JComboBoxMe();
		//this.jComboBoxTiposAccionesEstadoGastoEmpleado.setText("Accion");
		this.jComboBoxTiposAccionesEstadoGastoEmpleado.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarEstadoGastoEmpleado = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarEstadoGastoEmpleado.setText("Accion");
		this.jComboBoxTiposSeleccionarEstadoGastoEmpleado.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralEstadoGastoEmpleado=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralEstadoGastoEmpleado.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralEstadoGastoEmpleado.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralEstadoGastoEmpleado.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesEstadoGastoEmpleado = new JLabelMe();
		
		this.jLabelAccionesEstadoGastoEmpleado.setText("Acciones");		
		this.jLabelAccionesEstadoGastoEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEstadoGastoEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEstadoGastoEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosEstadoGastoEmpleado = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosEstadoGastoEmpleado.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosEstadoGastoEmpleado.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosEstadoGastoEmpleado = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosEstadoGastoEmpleado.setText("Seleccionados");
		this.jCheckBoxSeleccionadosEstadoGastoEmpleado.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaEstadoGastoEmpleado = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaEstadoGastoEmpleado.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaEstadoGastoEmpleado.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteEstadoGastoEmpleado = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteEstadoGastoEmpleado.setText("Graf.");
		this.jCheckBoxConGraficoReporteEstadoGastoEmpleado.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresEstadoGastoEmpleado = new JButtonMe();
		//this.jButtonAnterioresEstadoGastoEmpleado.setText("<<");
        this.jButtonAnterioresEstadoGastoEmpleado.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresEstadoGastoEmpleado,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresEstadoGastoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesEstadoGastoEmpleado = new JButtonMe();
		//this.jButtonSiguientesEstadoGastoEmpleado.setText(">>");
        this.jButtonSiguientesEstadoGastoEmpleado.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesEstadoGastoEmpleado,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesEstadoGastoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosEstadoGastoEmpleado = new JButtonMe();
		this.jButtonNuevoGuardarCambiosEstadoGastoEmpleado.setText("Nue");
        this.jButtonNuevoGuardarCambiosEstadoGastoEmpleado.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosEstadoGastoEmpleado,"nuevoguardarcambios_button","Nue",this.estadogastoempleadoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosEstadoGastoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosEstadoGastoEmpleado";
		inputMap = this.jButtonNuevoGuardarCambiosEstadoGastoEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosEstadoGastoEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosEstadoGastoEmpleado"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionEstadoGastoEmpleado";
		inputMap = this.jButtonRecargarInformacionEstadoGastoEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionEstadoGastoEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionEstadoGastoEmpleado"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesEstadoGastoEmpleado";
		inputMap = this.jButtonSiguientesEstadoGastoEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesEstadoGastoEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesEstadoGastoEmpleado"));
		
		//ANTERIORES		
		sMapKey = "AnterioresEstadoGastoEmpleado";
		inputMap = this.jButtonAnterioresEstadoGastoEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresEstadoGastoEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresEstadoGastoEmpleado"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasEstadoGastoEmpleado();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesEstadoGastoEmpleado.setMinimumSize(new Dimension(this.getWidth(),EstadoGastoEmpleadoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EstadoGastoEmpleadoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesEstadoGastoEmpleado.setMaximumSize(new Dimension(this.getWidth(),EstadoGastoEmpleadoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EstadoGastoEmpleadoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesEstadoGastoEmpleado.setPreferredSize(new Dimension(this.getWidth(),EstadoGastoEmpleadoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EstadoGastoEmpleadoBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionEstadoGastoEmpleado = new GridBagLayout();

			this.jPanelPaginacionEstadoGastoEmpleado.setLayout(gridaBagLayoutPaginacionEstadoGastoEmpleado);						
			
			this.gridBagConstraintsEstadoGastoEmpleado = new GridBagConstraints();
			this.gridBagConstraintsEstadoGastoEmpleado.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsEstadoGastoEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoGastoEmpleado.gridy = 0;
			this.gridBagConstraintsEstadoGastoEmpleado.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionEstadoGastoEmpleado.add(this.jButtonAnterioresEstadoGastoEmpleado, this.gridBagConstraintsEstadoGastoEmpleado);
					
						
			this.gridBagConstraintsEstadoGastoEmpleado = new GridBagConstraints();
			this.gridBagConstraintsEstadoGastoEmpleado.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsEstadoGastoEmpleado.gridy = 0;
			
			this.jPanelPaginacionEstadoGastoEmpleado.add(this.jButtonNuevoGuardarCambiosEstadoGastoEmpleado, this.gridBagConstraintsEstadoGastoEmpleado);
						
			
			this.gridBagConstraintsEstadoGastoEmpleado = new GridBagConstraints();
			this.gridBagConstraintsEstadoGastoEmpleado.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsEstadoGastoEmpleado.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsEstadoGastoEmpleado.gridy = 0;
			this.jPanelPaginacionEstadoGastoEmpleado.add(this.jButtonSiguientesEstadoGastoEmpleado, this.gridBagConstraintsEstadoGastoEmpleado);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsEstadoGastoEmpleado = new GridBagConstraints();
			this.gridBagConstraintsEstadoGastoEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoGastoEmpleado.gridy = 1;
			this.gridBagConstraintsEstadoGastoEmpleado.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEstadoGastoEmpleado.add(this.jButtonNuevoEstadoGastoEmpleado, this.gridBagConstraintsEstadoGastoEmpleado);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsEstadoGastoEmpleado = new GridBagConstraints();
				this.gridBagConstraintsEstadoGastoEmpleado.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsEstadoGastoEmpleado.gridy = 1;
				this.gridBagConstraintsEstadoGastoEmpleado.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionEstadoGastoEmpleado.add(this.jButtonNuevoRelacionesEstadoGastoEmpleado, this.gridBagConstraintsEstadoGastoEmpleado);
			}
			
			
			if(!this.estadogastoempleadoSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsEstadoGastoEmpleado = new GridBagConstraints();
				this.gridBagConstraintsEstadoGastoEmpleado.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsEstadoGastoEmpleado.gridy = 1;
				this.gridBagConstraintsEstadoGastoEmpleado.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionEstadoGastoEmpleado.add(this.jButtonGuardarCambiosTablaEstadoGastoEmpleado, this.gridBagConstraintsEstadoGastoEmpleado);
			}
			
			
			
			this.gridBagConstraintsEstadoGastoEmpleado = new GridBagConstraints();
			this.gridBagConstraintsEstadoGastoEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoGastoEmpleado.gridy = 1;
			this.gridBagConstraintsEstadoGastoEmpleado.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEstadoGastoEmpleado.add(this.jButtonDuplicarEstadoGastoEmpleado, this.gridBagConstraintsEstadoGastoEmpleado);
			
			this.gridBagConstraintsEstadoGastoEmpleado = new GridBagConstraints();
			this.gridBagConstraintsEstadoGastoEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoGastoEmpleado.gridy = 1;
			this.gridBagConstraintsEstadoGastoEmpleado.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEstadoGastoEmpleado.add(this.jButtonCopiarEstadoGastoEmpleado, this.gridBagConstraintsEstadoGastoEmpleado);
		
			this.gridBagConstraintsEstadoGastoEmpleado = new GridBagConstraints();
			this.gridBagConstraintsEstadoGastoEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoGastoEmpleado.gridy = 1;
			this.gridBagConstraintsEstadoGastoEmpleado.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEstadoGastoEmpleado.add(this.jButtonVerFormEstadoGastoEmpleado, this.gridBagConstraintsEstadoGastoEmpleado);
		
			this.gridBagConstraintsEstadoGastoEmpleado = new GridBagConstraints();
			this.gridBagConstraintsEstadoGastoEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoGastoEmpleado.gridy = 1;
			this.gridBagConstraintsEstadoGastoEmpleado.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionEstadoGastoEmpleado.add(this.jButtonCerrarEstadoGastoEmpleado, this.gridBagConstraintsEstadoGastoEmpleado);
		
		
		
		this.jButtonRecargarInformacionEstadoGastoEmpleado.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionEstadoGastoEmpleado.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionEstadoGastoEmpleado.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionEstadoGastoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesEstadoGastoEmpleado.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesEstadoGastoEmpleado.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesEstadoGastoEmpleado.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesEstadoGastoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesEstadoGastoEmpleado.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesEstadoGastoEmpleado.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesEstadoGastoEmpleado.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesEstadoGastoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesEstadoGastoEmpleado.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesEstadoGastoEmpleado.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesEstadoGastoEmpleado.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesEstadoGastoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionEstadoGastoEmpleado.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionEstadoGastoEmpleado.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionEstadoGastoEmpleado.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionEstadoGastoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesEstadoGastoEmpleado.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesEstadoGastoEmpleado.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesEstadoGastoEmpleado.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesEstadoGastoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesEstadoGastoEmpleado.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEstadoGastoEmpleado.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEstadoGastoEmpleado.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesEstadoGastoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarEstadoGastoEmpleado.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarEstadoGastoEmpleado.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarEstadoGastoEmpleado.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarEstadoGastoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaEstadoGastoEmpleado.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaEstadoGastoEmpleado.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaEstadoGastoEmpleado.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaEstadoGastoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteEstadoGastoEmpleado.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteEstadoGastoEmpleado.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteEstadoGastoEmpleado.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteEstadoGastoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosEstadoGastoEmpleado.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosEstadoGastoEmpleado.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosEstadoGastoEmpleado.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosEstadoGastoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosEstadoGastoEmpleado.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosEstadoGastoEmpleado.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosEstadoGastoEmpleado.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosEstadoGastoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesEstadoGastoEmpleado = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesEstadoGastoEmpleado = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1EstadoGastoEmpleado = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2EstadoGastoEmpleado = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3EstadoGastoEmpleado = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4EstadoGastoEmpleado = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesEstadoGastoEmpleado.setLayout(gridaBagParametrosReportesEstadoGastoEmpleado);
			this.jPanelParametrosReportesAccionesEstadoGastoEmpleado.setLayout(gridaBagParametrosReportesAccionesEstadoGastoEmpleado);
			
			
			this.jPanelParametrosAuxiliar1EstadoGastoEmpleado.setLayout(gridaBagParametrosAuxiliar1EstadoGastoEmpleado);
			this.jPanelParametrosAuxiliar2EstadoGastoEmpleado.setLayout(gridaBagParametrosAuxiliar2EstadoGastoEmpleado);
			this.jPanelParametrosAuxiliar3EstadoGastoEmpleado.setLayout(gridaBagParametrosAuxiliar3EstadoGastoEmpleado);
			this.jPanelParametrosAuxiliar4EstadoGastoEmpleado.setLayout(gridaBagParametrosAuxiliar4EstadoGastoEmpleado);
			//this.jPanelParametrosAuxiliar5EstadoGastoEmpleado.setLayout(gridaBagParametrosAuxiliar2EstadoGastoEmpleado);			
			
			
			
			
			this.gridBagConstraintsEstadoGastoEmpleado = new GridBagConstraints();
			this.gridBagConstraintsEstadoGastoEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoGastoEmpleado.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEstadoGastoEmpleado.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstadoGastoEmpleado.add(this.jButtonRecargarInformacionEstadoGastoEmpleado, this.gridBagConstraintsEstadoGastoEmpleado);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsEstadoGastoEmpleado = new GridBagConstraints();
			this.gridBagConstraintsEstadoGastoEmpleado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoGastoEmpleado.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoGastoEmpleado.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1EstadoGastoEmpleado.add(this.jComboBoxTiposPaginacionEstadoGastoEmpleado, this.gridBagConstraintsEstadoGastoEmpleado);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsEstadoGastoEmpleado = new GridBagConstraints();
			this.gridBagConstraintsEstadoGastoEmpleado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoGastoEmpleado.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoGastoEmpleado.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1EstadoGastoEmpleado.add(this.jCheckBoxConAltoMaximoTablaEstadoGastoEmpleado, this.gridBagConstraintsEstadoGastoEmpleado);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsEstadoGastoEmpleado = new GridBagConstraints();
			this.gridBagConstraintsEstadoGastoEmpleado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoGastoEmpleado.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoGastoEmpleado.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1EstadoGastoEmpleado.add(this.jComboBoxTiposArchivosReportesEstadoGastoEmpleado, this.gridBagConstraintsEstadoGastoEmpleado);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsEstadoGastoEmpleado = new GridBagConstraints();
			this.gridBagConstraintsEstadoGastoEmpleado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoGastoEmpleado.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoGastoEmpleado.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoGastoEmpleado.add(this.jPanelParametrosAuxiliar1EstadoGastoEmpleado, this.gridBagConstraintsEstadoGastoEmpleado);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsEstadoGastoEmpleado = new GridBagConstraints();
			this.gridBagConstraintsEstadoGastoEmpleado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoGastoEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoGastoEmpleado.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEstadoGastoEmpleado.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4EstadoGastoEmpleado.add(this.jComboBoxTiposReportesEstadoGastoEmpleado, this.gridBagConstraintsEstadoGastoEmpleado);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsEstadoGastoEmpleado = new GridBagConstraints();
			this.gridBagConstraintsEstadoGastoEmpleado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoGastoEmpleado.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoGastoEmpleado.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoGastoEmpleado.add(this.jPanelParametrosAuxiliar4EstadoGastoEmpleado, this.gridBagConstraintsEstadoGastoEmpleado);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsEstadoGastoEmpleado = new GridBagConstraints();
			this.gridBagConstraintsEstadoGastoEmpleado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoGastoEmpleado.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoGastoEmpleado.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoGastoEmpleado.add(this.jComboBoxTiposReportesEstadoGastoEmpleado, this.gridBagConstraintsEstadoGastoEmpleado);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsEstadoGastoEmpleado = new GridBagConstraints();
			this.gridBagConstraintsEstadoGastoEmpleado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoGastoEmpleado.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoGastoEmpleado.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEstadoGastoEmpleado.add(this.jCheckBoxGenerarReporteEstadoGastoEmpleado, this.gridBagConstraintsEstadoGastoEmpleado);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsEstadoGastoEmpleado = new GridBagConstraints();
			this.gridBagConstraintsEstadoGastoEmpleado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoGastoEmpleado.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoGastoEmpleado.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoGastoEmpleado.add(this.jPanelParametrosAuxiliar2EstadoGastoEmpleado, this.gridBagConstraintsEstadoGastoEmpleado);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsEstadoGastoEmpleado = new GridBagConstraints();
			this.gridBagConstraintsEstadoGastoEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoGastoEmpleado.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEstadoGastoEmpleado.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEstadoGastoEmpleado.add(this.jLabelAccionesEstadoGastoEmpleado, this.gridBagConstraintsEstadoGastoEmpleado);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsEstadoGastoEmpleado = new GridBagConstraints();
				this.gridBagConstraintsEstadoGastoEmpleado.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsEstadoGastoEmpleado.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsEstadoGastoEmpleado.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesEstadoGastoEmpleado.add(this.jButtonAbrirOrderByEstadoGastoEmpleado, this.gridBagConstraintsEstadoGastoEmpleado);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsEstadoGastoEmpleado = new GridBagConstraints();
			this.gridBagConstraintsEstadoGastoEmpleado.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsEstadoGastoEmpleado.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoGastoEmpleado.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstadoGastoEmpleado.add(this.jComboBoxTiposSeleccionarEstadoGastoEmpleado, this.gridBagConstraintsEstadoGastoEmpleado);			
			
			
			/*
			this.gridBagConstraintsEstadoGastoEmpleado = new GridBagConstraints();
			this.gridBagConstraintsEstadoGastoEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoGastoEmpleado.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEstadoGastoEmpleado.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEstadoGastoEmpleado.add(this.jCheckBoxSeleccionarTodosEstadoGastoEmpleado, this.gridBagConstraintsEstadoGastoEmpleado);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsEstadoGastoEmpleado = new GridBagConstraints();
			this.gridBagConstraintsEstadoGastoEmpleado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoGastoEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoGastoEmpleado.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEstadoGastoEmpleado.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3EstadoGastoEmpleado.add(this.jCheckBoxSeleccionarTodosEstadoGastoEmpleado, this.gridBagConstraintsEstadoGastoEmpleado);															
				
			this.gridBagConstraintsEstadoGastoEmpleado = new GridBagConstraints();
			this.gridBagConstraintsEstadoGastoEmpleado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoGastoEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoGastoEmpleado.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEstadoGastoEmpleado.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3EstadoGastoEmpleado.add(this.jCheckBoxSeleccionadosEstadoGastoEmpleado, this.gridBagConstraintsEstadoGastoEmpleado);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsEstadoGastoEmpleado = new GridBagConstraints();
			this.gridBagConstraintsEstadoGastoEmpleado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoGastoEmpleado.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoGastoEmpleado.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoGastoEmpleado.add(this.jPanelParametrosAuxiliar3EstadoGastoEmpleado, this.gridBagConstraintsEstadoGastoEmpleado);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsEstadoGastoEmpleado = new GridBagConstraints();
			this.gridBagConstraintsEstadoGastoEmpleado.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoGastoEmpleado.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstadoGastoEmpleado.add(this.jComboBoxTiposRelacionesEstadoGastoEmpleado, this.gridBagConstraintsEstadoGastoEmpleado);
				
			this.gridBagConstraintsEstadoGastoEmpleado = new GridBagConstraints();
			this.gridBagConstraintsEstadoGastoEmpleado.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoGastoEmpleado.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstadoGastoEmpleado.add(this.jComboBoxTiposAccionesEstadoGastoEmpleado, this.gridBagConstraintsEstadoGastoEmpleado);
	
				
			this.gridBagConstraintsEstadoGastoEmpleado = new GridBagConstraints();
			this.gridBagConstraintsEstadoGastoEmpleado.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoGastoEmpleado.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstadoGastoEmpleado.add(this.jTextFieldValorCampoGeneralEstadoGastoEmpleado, this.gridBagConstraintsEstadoGastoEmpleado);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosEstadoGastoEmpleado = new GridBagLayout();

			this.jScrollPanelDatosEstadoGastoEmpleado.setLayout(gridaBagLayoutDatosEstadoGastoEmpleado);
			
			this.gridBagConstraintsEstadoGastoEmpleado = new GridBagConstraints();
			this.gridBagConstraintsEstadoGastoEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoGastoEmpleado.gridy = 0;
			this.gridBagConstraintsEstadoGastoEmpleado.gridx = 0;
			
			this.jScrollPanelDatosEstadoGastoEmpleado.add(this.jTableDatosEstadoGastoEmpleado, this.gridBagConstraintsEstadoGastoEmpleado);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosEstadoGastoEmpleado.setViewportView(this.jTableDatosEstadoGastoEmpleado);
		this.jTableDatosEstadoGastoEmpleado.setFillsViewportHeight(true);
		this.jTableDatosEstadoGastoEmpleado.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesEstadoGastoEmpleado= new GridBagLayout();
		this.jPanelAccionesEstadoGastoEmpleado.setLayout(gridaBagLayoutAccionesEstadoGastoEmpleado);
		
		
		/*	
		this.gridBagConstraintsEstadoGastoEmpleado = new GridBagConstraints();
		this.gridBagConstraintsEstadoGastoEmpleado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoGastoEmpleado.gridy = 0;
		this.gridBagConstraintsEstadoGastoEmpleado.gridx = 0;
			
		this.jPanelAccionesEstadoGastoEmpleado.add(this.jButtonNuevoEstadoGastoEmpleado, this.gridBagConstraintsEstadoGastoEmpleado);
		*/
		int iPosXAccion=0;
		
						
		
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutEstadoGastoEmpleado = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutEstadoGastoEmpleado);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.estadogastoempleadoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsEstadoGastoEmpleado = new GridBagConstraints();						
			this.gridBagConstraintsEstadoGastoEmpleado.gridy = iGridyPrincipal++;
			this.gridBagConstraintsEstadoGastoEmpleado.gridx = 0;		
			//this.gridBagConstraintsEstadoGastoEmpleado.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoGastoEmpleado.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsEstadoGastoEmpleado.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarEstadoGastoEmpleado, this.gridBagConstraintsEstadoGastoEmpleado);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsEstadoGastoEmpleado = new GridBagConstraints();
		this.gridBagConstraintsEstadoGastoEmpleado.gridy = iGridyPrincipal++;
		this.gridBagConstraintsEstadoGastoEmpleado.gridx = 0;		
		//this.gridBagConstraintsEstadoGastoEmpleado.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoGastoEmpleado.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsEstadoGastoEmpleado.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsEstadoGastoEmpleado);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsEstadoGastoEmpleado = new GridBagConstraints();
		this.gridBagConstraintsEstadoGastoEmpleado.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoGastoEmpleado.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesEstadoGastoEmpleado, this.gridBagConstraintsEstadoGastoEmpleado);								
		
		
		/*
		this.gridBagConstraintsEstadoGastoEmpleado = new GridBagConstraints();
		this.gridBagConstraintsEstadoGastoEmpleado.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoGastoEmpleado.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesEstadoGastoEmpleado, this.gridBagConstraintsEstadoGastoEmpleado);
		*/		
		
		this.gridBagConstraintsEstadoGastoEmpleado = new GridBagConstraints();
		this.gridBagConstraintsEstadoGastoEmpleado.gridy =iGridyPrincipal++;
		this.gridBagConstraintsEstadoGastoEmpleado.gridx =0;
		this.gridBagConstraintsEstadoGastoEmpleado.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsEstadoGastoEmpleado.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosEstadoGastoEmpleado, this.gridBagConstraintsEstadoGastoEmpleado);
				
		
		this.gridBagConstraintsEstadoGastoEmpleado = new GridBagConstraints();
		this.gridBagConstraintsEstadoGastoEmpleado.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoGastoEmpleado.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionEstadoGastoEmpleado, this.gridBagConstraintsEstadoGastoEmpleado);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(EstadoGastoEmpleadoJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosEstadoGastoEmpleado= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosEstadoGastoEmpleado = new GridBagLayout();
			this.jPanelBusquedasParametrosEstadoGastoEmpleado.setLayout(gridaBagLayoutBusquedasParametrosEstadoGastoEmpleado);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralEstadoGastoEmpleado=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralEstadoGastoEmpleado.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEstadoGastoEmpleado.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEstadoGastoEmpleado.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsEstadoGastoEmpleado = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsEstadoGastoEmpleado = new GridBagConstraints();
		this.gridBagConstraintsEstadoGastoEmpleado.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoGastoEmpleado.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposEstadoGastoEmpleado, this.gridBagConstraintsEstadoGastoEmpleado);
			
			
		this.gridBagConstraintsEstadoGastoEmpleado = new GridBagConstraints();
		this.gridBagConstraintsEstadoGastoEmpleado.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoGastoEmpleado.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosEstadoGastoEmpleado, this.gridBagConstraintsEstadoGastoEmpleado);
		
			
		this.gridBagConstraintsEstadoGastoEmpleado = new GridBagConstraints();
		this.gridBagConstraintsEstadoGastoEmpleado.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsEstadoGastoEmpleado.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesEstadoGastoEmpleado, this.gridBagConstraintsEstadoGastoEmpleado);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralEstadoGastoEmpleado;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoEstadoGastoEmpleado() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoEstadoGastoEmpleado = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoEstadoGastoEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoEstadoGastoEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoEstadoGastoEmpleado.setName("jPanelReporteDinamicoEstadoGastoEmpleado"); 
		
		this.jPanelReporteDinamicoEstadoGastoEmpleado.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoEstadoGastoEmpleado.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoEstadoGastoEmpleado.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoEstadoGastoEmpleado.setLayout(gridaBagLayoutReporteDinamicoEstadoGastoEmpleado);
		
		
		this.jInternalFrameReporteDinamicoEstadoGastoEmpleado= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoEstadoGastoEmpleado = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteEstadoGastoEmpleado= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoEstadoGastoEmpleado.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoEstadoGastoEmpleado.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoEstadoGastoEmpleado.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoEstadoGastoEmpleado.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoEstadoGastoEmpleado.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoEstadoGastoEmpleado.setResizable(true);
	    this.jInternalFrameReporteDinamicoEstadoGastoEmpleado.setClosable(true);
	    this.jInternalFrameReporteDinamicoEstadoGastoEmpleado.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoEstadoGastoEmpleado.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoEstadoGastoEmpleado.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoEstadoGastoEmpleado.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoEstadoGastoEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Gasto Empleados"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteEstadoGastoEmpleado = new JLabelMe();

		this.jLabelColumnasSelectReporteEstadoGastoEmpleado.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteEstadoGastoEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteEstadoGastoEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteEstadoGastoEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsEstadoGastoEmpleado = new GridBagConstraints();
		this.gridBagConstraintsEstadoGastoEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoGastoEmpleado.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoGastoEmpleado.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoEstadoGastoEmpleado.add(this.jLabelColumnasSelectReporteEstadoGastoEmpleado, this.gridBagConstraintsEstadoGastoEmpleado);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteEstadoGastoEmpleado = new JList<Reporte>();
		this.jListColumnasSelectReporteEstadoGastoEmpleado.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteEstadoGastoEmpleado.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteEstadoGastoEmpleado.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteEstadoGastoEmpleado.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteEstadoGastoEmpleado.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteEstadoGastoEmpleado=new JScrollPane(this.jListColumnasSelectReporteEstadoGastoEmpleado);
			
			this.jScrollColumnasSelectReporteEstadoGastoEmpleado.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteEstadoGastoEmpleado.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteEstadoGastoEmpleado.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteEstadoGastoEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsEstadoGastoEmpleado = new GridBagConstraints();
		this.gridBagConstraintsEstadoGastoEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoGastoEmpleado.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoGastoEmpleado.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoEstadoGastoEmpleado.add(this.jListColumnasSelectReporteEstadoGastoEmpleado, this.gridBagConstraintsEstadoGastoEmpleado);
		this.jPanelReporteDinamicoEstadoGastoEmpleado.add(this.jScrollColumnasSelectReporteEstadoGastoEmpleado, this.gridBagConstraintsEstadoGastoEmpleado);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteEstadoGastoEmpleado = new JLabelMe();

		this.jLabelRelacionesSelectReporteEstadoGastoEmpleado.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteEstadoGastoEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteEstadoGastoEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteEstadoGastoEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsEstadoGastoEmpleado = new GridBagConstraints();
		this.gridBagConstraintsEstadoGastoEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoGastoEmpleado.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoGastoEmpleado.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoEstadoGastoEmpleado.add(this.jLabelRelacionesSelectReporteEstadoGastoEmpleado, this.gridBagConstraintsEstadoGastoEmpleado);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteEstadoGastoEmpleado = new JList<Reporte>();
		this.jListRelacionesSelectReporteEstadoGastoEmpleado.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteEstadoGastoEmpleado.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteEstadoGastoEmpleado.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteEstadoGastoEmpleado.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteEstadoGastoEmpleado.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteEstadoGastoEmpleado=new JScrollPane(this.jListRelacionesSelectReporteEstadoGastoEmpleado);
			
			this.jScrollRelacionesSelectReporteEstadoGastoEmpleado.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteEstadoGastoEmpleado.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteEstadoGastoEmpleado.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteEstadoGastoEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsEstadoGastoEmpleado = new GridBagConstraints();
		this.gridBagConstraintsEstadoGastoEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoGastoEmpleado.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoGastoEmpleado.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoEstadoGastoEmpleado.add(this.jListRelacionesSelectReporteEstadoGastoEmpleado, this.gridBagConstraintsEstadoGastoEmpleado);
		this.jPanelReporteDinamicoEstadoGastoEmpleado.add(this.jScrollRelacionesSelectReporteEstadoGastoEmpleado, this.gridBagConstraintsEstadoGastoEmpleado);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoEstadoGastoEmpleado = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoEstadoGastoEmpleado = new JComboBoxMe();
		this.jListColumnasValoresGraficoEstadoGastoEmpleado = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoEstadoGastoEmpleado = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoEstadoGastoEmpleado.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoEstadoGastoEmpleado.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoEstadoGastoEmpleado.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoEstadoGastoEmpleado.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoEstadoGastoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoEstadoGastoEmpleado = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoEstadoGastoEmpleado.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoEstadoGastoEmpleado.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoEstadoGastoEmpleado.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoEstadoGastoEmpleado.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoEstadoGastoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoEstadoGastoEmpleado = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoEstadoGastoEmpleado.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoEstadoGastoEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoEstadoGastoEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoEstadoGastoEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsEstadoGastoEmpleado = new GridBagConstraints();
		this.gridBagConstraintsEstadoGastoEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoGastoEmpleado.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoGastoEmpleado.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEstadoGastoEmpleado.add(this.jLabelGenerarExcelReporteDinamicoEstadoGastoEmpleado, this.gridBagConstraintsEstadoGastoEmpleado);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoEstadoGastoEmpleado = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoEstadoGastoEmpleado.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoEstadoGastoEmpleado,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoEstadoGastoEmpleado.setToolTipText("Generar EXCEL"+" "+EstadoGastoEmpleadoConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsEstadoGastoEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsEstadoGastoEmpleado.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsEstadoGastoEmpleado.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsEstadoGastoEmpleado.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoEstadoGastoEmpleado.add(this.jButtonGenerarExcelReporteDinamicoEstadoGastoEmpleado, this.gridBagConstraintsEstadoGastoEmpleado);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsEstadoGastoEmpleado = new GridBagConstraints();
		this.gridBagConstraintsEstadoGastoEmpleado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoGastoEmpleado.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEstadoGastoEmpleado.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEstadoGastoEmpleado.add(this.jComboBoxTiposReportesDinamicoEstadoGastoEmpleado, this.gridBagConstraintsEstadoGastoEmpleado);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoEstadoGastoEmpleado = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoEstadoGastoEmpleado.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoEstadoGastoEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoEstadoGastoEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoEstadoGastoEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsEstadoGastoEmpleado = new GridBagConstraints();
		this.gridBagConstraintsEstadoGastoEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoGastoEmpleado.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoGastoEmpleado.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEstadoGastoEmpleado.add(this.jLabelTiposArchivoReporteDinamicoEstadoGastoEmpleado, this.gridBagConstraintsEstadoGastoEmpleado);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsEstadoGastoEmpleado = new GridBagConstraints();
		this.gridBagConstraintsEstadoGastoEmpleado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoGastoEmpleado.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEstadoGastoEmpleado.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEstadoGastoEmpleado.add(this.jComboBoxTiposArchivosReportesDinamicoEstadoGastoEmpleado, this.gridBagConstraintsEstadoGastoEmpleado);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoEstadoGastoEmpleado = new JButtonMe();
		this.jButtonGenerarReporteDinamicoEstadoGastoEmpleado.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoEstadoGastoEmpleado,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoEstadoGastoEmpleado.setToolTipText("Generar"+" "+EstadoGastoEmpleadoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsEstadoGastoEmpleado = new GridBagConstraints();
		this.gridBagConstraintsEstadoGastoEmpleado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoGastoEmpleado.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEstadoGastoEmpleado.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEstadoGastoEmpleado.add(this.jButtonGenerarReporteDinamicoEstadoGastoEmpleado, this.gridBagConstraintsEstadoGastoEmpleado);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoEstadoGastoEmpleado = new JButtonMe();
		this.jButtonCerrarReporteDinamicoEstadoGastoEmpleado.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoEstadoGastoEmpleado,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoEstadoGastoEmpleado.setToolTipText("Cancelar"+" "+EstadoGastoEmpleadoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsEstadoGastoEmpleado = new GridBagConstraints();
		this.gridBagConstraintsEstadoGastoEmpleado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoGastoEmpleado.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEstadoGastoEmpleado.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEstadoGastoEmpleado.add(this.jButtonCerrarReporteDinamicoEstadoGastoEmpleado, this.gridBagConstraintsEstadoGastoEmpleado);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalEstadoGastoEmpleado = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoEstadoGastoEmpleado= new JScrollPane(jPanelReporteDinamicoEstadoGastoEmpleado,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoEstadoGastoEmpleado.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoEstadoGastoEmpleado.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoEstadoGastoEmpleado.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoEstadoGastoEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Gasto Empleados"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsEstadoGastoEmpleado = new GridBagConstraints();
		this.gridBagConstraintsEstadoGastoEmpleado.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsEstadoGastoEmpleado.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsEstadoGastoEmpleado.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoEstadoGastoEmpleado.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoEstadoGastoEmpleado.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalEstadoGastoEmpleado);
		this.jInternalFrameReporteDinamicoEstadoGastoEmpleado.getContentPane().add(this.jScrollPanelReporteDinamicoEstadoGastoEmpleado, this.gridBagConstraintsEstadoGastoEmpleado);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionEstadoGastoEmpleado() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionEstadoGastoEmpleado = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionEstadoGastoEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionEstadoGastoEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionEstadoGastoEmpleado.setName("jPanelImportacionEstadoGastoEmpleado"); 
		
		this.jPanelImportacionEstadoGastoEmpleado.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionEstadoGastoEmpleado.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionEstadoGastoEmpleado.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionEstadoGastoEmpleado.setLayout(gridaBagLayoutImportacionEstadoGastoEmpleado);
		
		
		this.jInternalFrameImportacionEstadoGastoEmpleado= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionEstadoGastoEmpleado= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionEstadoGastoEmpleado = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteEstadoGastoEmpleado= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionEstadoGastoEmpleado.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionEstadoGastoEmpleado.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionEstadoGastoEmpleado.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionEstadoGastoEmpleado.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionEstadoGastoEmpleado.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionEstadoGastoEmpleado.setResizable(true);
	    this.jInternalFrameImportacionEstadoGastoEmpleado.setClosable(true);
	    this.jInternalFrameImportacionEstadoGastoEmpleado.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionEstadoGastoEmpleado.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionEstadoGastoEmpleado.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionEstadoGastoEmpleado.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionEstadoGastoEmpleado.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionEstadoGastoEmpleado.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionEstadoGastoEmpleado.setResizable(true);
	    this.jInternalFrameImportacionEstadoGastoEmpleado.setClosable(true);
	    this.jInternalFrameImportacionEstadoGastoEmpleado.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionEstadoGastoEmpleado.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionEstadoGastoEmpleado.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionEstadoGastoEmpleado.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionEstadoGastoEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Gasto Empleados"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionEstadoGastoEmpleado = new JLabelMe();

		this.jLabelArchivoImportacionEstadoGastoEmpleado.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionEstadoGastoEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionEstadoGastoEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionEstadoGastoEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsEstadoGastoEmpleado = new GridBagConstraints();
		this.gridBagConstraintsEstadoGastoEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoGastoEmpleado.gridy = iPosYImportacion;		
		this.gridBagConstraintsEstadoGastoEmpleado.gridx = iPosXImportacion++;
			
		this.jPanelImportacionEstadoGastoEmpleado.add(this.jLabelArchivoImportacionEstadoGastoEmpleado, this.gridBagConstraintsEstadoGastoEmpleado);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionEstadoGastoEmpleado = new JFileChooser();		
		this.jFileChooserImportacionEstadoGastoEmpleado.setToolTipText("ESCOGER ARCHIVO"+" "+EstadoGastoEmpleadoConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionEstadoGastoEmpleado = new JButtonMe();
		this.jButtonAbrirImportacionEstadoGastoEmpleado.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionEstadoGastoEmpleado,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionEstadoGastoEmpleado.setToolTipText("Generar"+" "+EstadoGastoEmpleadoConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsEstadoGastoEmpleado = new GridBagConstraints();
		this.gridBagConstraintsEstadoGastoEmpleado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoGastoEmpleado.gridy = iPosYImportacion;
		this.gridBagConstraintsEstadoGastoEmpleado.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEstadoGastoEmpleado.add(this.jButtonAbrirImportacionEstadoGastoEmpleado, this.gridBagConstraintsEstadoGastoEmpleado);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionEstadoGastoEmpleado = new JLabelMe();

		this.jLabelPathArchivoImportacionEstadoGastoEmpleado.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionEstadoGastoEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionEstadoGastoEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionEstadoGastoEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsEstadoGastoEmpleado = new GridBagConstraints();
		this.gridBagConstraintsEstadoGastoEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoGastoEmpleado.gridy = iPosYImportacion;		
		this.gridBagConstraintsEstadoGastoEmpleado.gridx = iPosXImportacion++;
			
		this.jPanelImportacionEstadoGastoEmpleado.add(this.jLabelPathArchivoImportacionEstadoGastoEmpleado, this.gridBagConstraintsEstadoGastoEmpleado);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionEstadoGastoEmpleado=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionEstadoGastoEmpleado.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionEstadoGastoEmpleado.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionEstadoGastoEmpleado.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsEstadoGastoEmpleado = new GridBagConstraints();
		this.gridBagConstraintsEstadoGastoEmpleado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoGastoEmpleado.gridy = iPosYImportacion;
		this.gridBagConstraintsEstadoGastoEmpleado.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEstadoGastoEmpleado.add(this.jTextFieldPathArchivoImportacionEstadoGastoEmpleado, this.gridBagConstraintsEstadoGastoEmpleado);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionEstadoGastoEmpleado = new JButtonMe();
		this.jButtonGenerarImportacionEstadoGastoEmpleado.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionEstadoGastoEmpleado,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionEstadoGastoEmpleado.setToolTipText("Generar"+" "+EstadoGastoEmpleadoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsEstadoGastoEmpleado = new GridBagConstraints();
		this.gridBagConstraintsEstadoGastoEmpleado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoGastoEmpleado.gridy = iPosYImportacion;
		this.gridBagConstraintsEstadoGastoEmpleado.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEstadoGastoEmpleado.add(this.jButtonGenerarImportacionEstadoGastoEmpleado, this.gridBagConstraintsEstadoGastoEmpleado);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionEstadoGastoEmpleado = new JButtonMe();
		this.jButtonCerrarImportacionEstadoGastoEmpleado.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionEstadoGastoEmpleado,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionEstadoGastoEmpleado.setToolTipText("Cancelar"+" "+EstadoGastoEmpleadoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsEstadoGastoEmpleado = new GridBagConstraints();
		this.gridBagConstraintsEstadoGastoEmpleado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoGastoEmpleado.gridy = iPosYImportacion;
		this.gridBagConstraintsEstadoGastoEmpleado.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEstadoGastoEmpleado.add(this.jButtonCerrarImportacionEstadoGastoEmpleado, this.gridBagConstraintsEstadoGastoEmpleado);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalEstadoGastoEmpleado = new GridBagLayout();
		
		this.jScrollPanelImportacionEstadoGastoEmpleado= new JScrollPane(jPanelImportacionEstadoGastoEmpleado,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsEstadoGastoEmpleado = new GridBagConstraints();
		this.gridBagConstraintsEstadoGastoEmpleado.gridy =iPosYImportacion;
		this.gridBagConstraintsEstadoGastoEmpleado.gridx =iPosXImportacion;
		this.gridBagConstraintsEstadoGastoEmpleado.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionEstadoGastoEmpleado.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionEstadoGastoEmpleado.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalEstadoGastoEmpleado);
		this.jInternalFrameImportacionEstadoGastoEmpleado.getContentPane().add(this.jScrollPanelImportacionEstadoGastoEmpleado, this.gridBagConstraintsEstadoGastoEmpleado);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByEstadoGastoEmpleado(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByEstadoGastoEmpleado = new JButtonMe();
			this.jButtonAbrirOrderByEstadoGastoEmpleado.setText("Orden");
			this.jButtonAbrirOrderByEstadoGastoEmpleado.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByEstadoGastoEmpleado,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByEstadoGastoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByEstadoGastoEmpleado";
			inputMap = this.jButtonAbrirOrderByEstadoGastoEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByEstadoGastoEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByEstadoGastoEmpleado"));
		
		
			GridBagLayout gridaBagLayoutOrderByEstadoGastoEmpleado = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByEstadoGastoEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByEstadoGastoEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByEstadoGastoEmpleado.setName("jPanelOrderByEstadoGastoEmpleado"); 
			
			this.jPanelOrderByEstadoGastoEmpleado.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByEstadoGastoEmpleado.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByEstadoGastoEmpleado.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByEstadoGastoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByEstadoGastoEmpleado.setLayout(gridaBagLayoutOrderByEstadoGastoEmpleado);
			
			
			this.jTableDatosEstadoGastoEmpleadoOrderBy = new JTableMe();        
			this.jTableDatosEstadoGastoEmpleadoOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosEstadoGastoEmpleadoOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosEstadoGastoEmpleadoOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosEstadoGastoEmpleadoOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosEstadoGastoEmpleadoOrderBy.setViewportView(this.jTableDatosEstadoGastoEmpleadoOrderBy);
			this.jTableDatosEstadoGastoEmpleadoOrderBy.setFillsViewportHeight(true);
			this.jTableDatosEstadoGastoEmpleadoOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByEstadoGastoEmpleado= new OrderByJInternalFrame();
			this.jInternalFrameOrderByEstadoGastoEmpleado= new OrderByJInternalFrame();
			this.jScrollPanelOrderByEstadoGastoEmpleado = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteEstadoGastoEmpleado= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByEstadoGastoEmpleado.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByEstadoGastoEmpleado.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByEstadoGastoEmpleado.setTitle("Orden");
			this.jInternalFrameOrderByEstadoGastoEmpleado.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByEstadoGastoEmpleado.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByEstadoGastoEmpleado.setResizable(true);
			this.jInternalFrameOrderByEstadoGastoEmpleado.setClosable(true);
			this.jInternalFrameOrderByEstadoGastoEmpleado.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByEstadoGastoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByEstadoGastoEmpleado.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByEstadoGastoEmpleado.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByEstadoGastoEmpleado.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByEstadoGastoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByEstadoGastoEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Gasto Empleados"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsEstadoGastoEmpleado = new GridBagConstraints();
			this.gridBagConstraintsEstadoGastoEmpleado.gridy =iPosYOrderBy++;
			this.gridBagConstraintsEstadoGastoEmpleado.gridx =iPosXOrderBy;
			this.gridBagConstraintsEstadoGastoEmpleado.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsEstadoGastoEmpleado.ipady =150;
				
			this.jPanelOrderByEstadoGastoEmpleado.add(jScrollPanelDatosEstadoGastoEmpleadoOrderBy, this.gridBagConstraintsEstadoGastoEmpleado);//this.jTableDatosEstadoGastoEmpleadoTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByEstadoGastoEmpleado = new JButtonMe();
			this.jButtonCerrarOrderByEstadoGastoEmpleado.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByEstadoGastoEmpleado,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByEstadoGastoEmpleado.setToolTipText("Cancelar"+" "+EstadoGastoEmpleadoConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByEstadoGastoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsEstadoGastoEmpleado = new GridBagConstraints();
			this.gridBagConstraintsEstadoGastoEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoGastoEmpleado.gridy = iPosYOrderBy++;
			this.gridBagConstraintsEstadoGastoEmpleado.gridx = iPosXOrderBy;
									
			this.jPanelOrderByEstadoGastoEmpleado.add(this.jButtonCerrarOrderByEstadoGastoEmpleado, this.gridBagConstraintsEstadoGastoEmpleado);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalEstadoGastoEmpleado = new GridBagLayout();
			
			this.jScrollPanelOrderByEstadoGastoEmpleado= new JScrollPane(jPanelOrderByEstadoGastoEmpleado,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsEstadoGastoEmpleado = new GridBagConstraints();
			this.gridBagConstraintsEstadoGastoEmpleado.gridy =iPosYOrderBy;
			this.gridBagConstraintsEstadoGastoEmpleado.gridx =iPosXOrderBy;
			this.gridBagConstraintsEstadoGastoEmpleado.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByEstadoGastoEmpleado.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByEstadoGastoEmpleado.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalEstadoGastoEmpleado);
			
			this.jInternalFrameOrderByEstadoGastoEmpleado.getContentPane().add(this.jScrollPanelOrderByEstadoGastoEmpleado, this.gridBagConstraintsEstadoGastoEmpleado);			
		
		} else {
			this.jButtonAbrirOrderByEstadoGastoEmpleado = new JButtonMe();
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
			&& this.estadogastoempleadoSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosEstadoGastoEmpleado.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosEstadoGastoEmpleado.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosEstadoGastoEmpleado.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosEstadoGastoEmpleado.getRowHeight();//EstadoGastoEmpleadoConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.estadogastoempleadoSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > EstadoGastoEmpleadoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaEstadoGastoEmpleado.isSelected()) {
					iHeightTable=EstadoGastoEmpleadoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < EstadoGastoEmpleadoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=EstadoGastoEmpleadoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > EstadoGastoEmpleadoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaEstadoGastoEmpleado.isSelected()) {
					iHeightTable=EstadoGastoEmpleadoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < EstadoGastoEmpleadoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=EstadoGastoEmpleadoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosEstadoGastoEmpleado.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosEstadoGastoEmpleado.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosEstadoGastoEmpleado.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosEstadoGastoEmpleado.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosEstadoGastoEmpleado.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosEstadoGastoEmpleado.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByEstadoGastoEmpleado!=null && this.jInternalFrameOrderByEstadoGastoEmpleado.getjTableDatosOrderBy()!=null) {
			//if(!this.estadogastoempleadoSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByEstadoGastoEmpleado.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByEstadoGastoEmpleado.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByEstadoGastoEmpleado.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByEstadoGastoEmpleado.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByEstadoGastoEmpleado.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByEstadoGastoEmpleado.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByEstadoGastoEmpleado.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosEstadoGastoEmpleado.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosEstadoGastoEmpleado.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosEstadoGastoEmpleado.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=estadogastoempleadoLogic.getEstadoGastoEmpleados().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=estadogastoempleados.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<EstadoGastoEmpleado> TraerEstadoGastoEmpleadoBeans(List<EstadoGastoEmpleado> estadogastoempleados,ArrayList<Classe> classes)throws Exception {
		try {
			for(EstadoGastoEmpleado estadogastoempleado:estadogastoempleados) {
					
				if(!(EstadoGastoEmpleadoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || EstadoGastoEmpleadoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					estadogastoempleado.setsDetalleGeneralEntityReporte(EstadoGastoEmpleadoConstantesFunciones.getEstadoGastoEmpleadoDescripcion(estadogastoempleado));
										
						
					
					

					if(estadogastoempleado.getGastoEmpleados()!=null && Funciones.existeClass(classes,GastoEmpleado.class)) {
						try{estadogastoempleado.setgastoempleadosDescripcionReporte(new JRBeanCollectionDataSource(GastoEmpleadoJInternalFrame.TraerGastoEmpleadoBeans(estadogastoempleado.getGastoEmpleados(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//estadogastoempleado.setsDetalleGeneralEntityReporte(estadogastoempleado.getsDetalleGeneralEntityReporte());
										
				}
				
				//estadogastoempleadobeans.add(estadogastoempleadobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return estadogastoempleados;
    }
	//PARA REPORTES FIN
}
