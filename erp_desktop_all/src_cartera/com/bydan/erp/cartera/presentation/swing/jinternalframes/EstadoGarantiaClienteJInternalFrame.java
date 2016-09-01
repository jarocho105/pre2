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
package com.bydan.erp.cartera.presentation.swing.jinternalframes;



import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;





//import com.bydan.erp.cartera.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.cartera.util.EstadoGarantiaClienteConstantesFunciones;

import com.bydan.erp.cartera.business.logic.*;
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
public class EstadoGarantiaClienteJInternalFrame extends EstadoGarantiaClienteBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarEstadoGarantiaCliente;
	
	protected JMenuBar jmenuBarEstadoGarantiaCliente;
	
	protected JMenu jmenuEstadoGarantiaCliente;
	protected JMenu jmenuDatosEstadoGarantiaCliente;
	protected JMenu jmenuArchivoEstadoGarantiaCliente;
	protected JMenu jmenuAccionesEstadoGarantiaCliente;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosEstadoGarantiaCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutEstadoGarantiaCliente;	
	protected GridBagConstraints gridBagConstraintsEstadoGarantiaCliente;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public EstadoGarantiaClienteDetalleFormJInternalFrame jInternalFrameDetalleFormEstadoGarantiaCliente;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoEstadoGarantiaCliente;	
	protected ImportacionJInternalFrame jInternalFrameImportacionEstadoGarantiaCliente;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public EstadoGarantiaClienteSessionBean estadogarantiaclienteSessionBean;
		
	
	
	
	//protected JDesktopPane jDesktopPane;
	public List<EstadoGarantiaCliente> estadogarantiaclientes;		
	public List<EstadoGarantiaCliente> estadogarantiaclientesEliminados;	
	public List<EstadoGarantiaCliente> estadogarantiaclientesAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByEstadoGarantiaCliente;		
	protected JButton jButtonAbrirOrderByEstadoGarantiaCliente;
	
	
	//protected JPanel jPanelOrderByEstadoGarantiaCliente;
	//public JScrollPane jScrollPanelOrderByEstadoGarantiaCliente;	
	//protected JButton jButtonCerrarOrderByEstadoGarantiaCliente;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public EstadoGarantiaClienteLogic estadogarantiaclienteLogic;
	
	
	
	public JScrollPane jScrollPanelDatosEstadoGarantiaCliente;
	public JScrollPane jScrollPanelDatosEdicionEstadoGarantiaCliente;
	public JScrollPane jScrollPanelDatosGeneralEstadoGarantiaCliente;
    
	
	
	//public JScrollPane jScrollPanelDatosEstadoGarantiaClienteOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoEstadoGarantiaCliente;
	//public JScrollPane jScrollPanelImportacionEstadoGarantiaCliente;
	
	
	
	protected JPanel jPanelAccionesEstadoGarantiaCliente;
	
    protected JPanel jPanelPaginacionEstadoGarantiaCliente;
    protected JPanel jPanelParametrosReportesEstadoGarantiaCliente;
	protected JPanel jPanelParametrosReportesAccionesEstadoGarantiaCliente;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1EstadoGarantiaCliente;
	protected JPanel jPanelParametrosAuxiliar2EstadoGarantiaCliente;
	protected JPanel jPanelParametrosAuxiliar3EstadoGarantiaCliente;
	protected JPanel jPanelParametrosAuxiliar4EstadoGarantiaCliente;
	//protected JPanel jPanelParametrosAuxiliar5EstadoGarantiaCliente;
	
	
	
	//protected JPanel jPanelReporteDinamicoEstadoGarantiaCliente;
	//protected JPanel jPanelImportacionEstadoGarantiaCliente;
	
	
	public JTable jTableDatosEstadoGarantiaCliente;
	
	
	
	//public JTable jTableDatosEstadoGarantiaClienteOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoEstadoGarantiaCliente;
	protected JButton jButtonDuplicarEstadoGarantiaCliente;
	protected JButton jButtonCopiarEstadoGarantiaCliente;
	protected JButton jButtonVerFormEstadoGarantiaCliente;
	protected JButton jButtonNuevoRelacionesEstadoGarantiaCliente;
	protected JButton jButtonModificarEstadoGarantiaCliente;
	
    protected JButton jButtonGuardarCambiosTablaEstadoGarantiaCliente;
	protected JButton jButtonCerrarEstadoGarantiaCliente;
	
	
	protected JButton jButtonRecargarInformacionEstadoGarantiaCliente;
	protected JButton jButtonProcesarInformacionEstadoGarantiaCliente;
	
	
	protected JButton jButtonAnterioresEstadoGarantiaCliente;
	protected JButton jButtonSiguientesEstadoGarantiaCliente;
	protected JButton jButtonNuevoGuardarCambiosEstadoGarantiaCliente;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoEstadoGarantiaCliente;
	//protected JButton jButtonCerrarReporteDinamicoEstadoGarantiaCliente;
	//protected JButton jButtonGenerarExcelReporteDinamicoEstadoGarantiaCliente;	
	
	
	
	//protected JButton jButtonAbrirImportacionEstadoGarantiaCliente;
	//protected JButton jButtonGenerarImportacionEstadoGarantiaCliente;
	//protected JButton jButtonCerrarImportacionEstadoGarantiaCliente;
	//protected JFileChooser jFileChooserImportacionEstadoGarantiaCliente;
	//protected File fileImportacionEstadoGarantiaCliente;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarEstadoGarantiaCliente;
	protected JButton jButtonDuplicarToolBarEstadoGarantiaCliente;
	protected JButton jButtonNuevoRelacionesToolBarEstadoGarantiaCliente;
	
	
	public JButton jButtonGuardarCambiosToolBarEstadoGarantiaCliente;
	protected JButton jButtonCopiarToolBarEstadoGarantiaCliente;
	protected JButton jButtonVerFormToolBarEstadoGarantiaCliente;
	public JButton jButtonGuardarCambiosTablaToolBarEstadoGarantiaCliente;
	protected JButton jButtonMostrarOcultarTablaToolBarEstadoGarantiaCliente;
	protected JButton jButtonCerrarToolBarEstadoGarantiaCliente;
	
	protected JButton jButtonRecargarInformacionToolBarEstadoGarantiaCliente;
	protected JButton jButtonProcesarInformacionToolBarEstadoGarantiaCliente;
	protected JButton jButtonAnterioresToolBarEstadoGarantiaCliente;
	protected JButton jButtonSiguientesToolBarEstadoGarantiaCliente;
	protected JButton jButtonNuevoGuardarCambiosToolBarEstadoGarantiaCliente;
	protected JButton jButtonAbrirOrderByToolBarEstadoGarantiaCliente;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoEstadoGarantiaCliente;
	protected JMenuItem jMenuItemDuplicarEstadoGarantiaCliente;
	protected JMenuItem jMenuItemNuevoRelacionesEstadoGarantiaCliente;
	
	
	protected JMenuItem jMenuItemGuardarCambiosEstadoGarantiaCliente;
	protected JMenuItem jMenuItemCopiarEstadoGarantiaCliente;
	protected JMenuItem jMenuItemVerFormEstadoGarantiaCliente;
	protected JMenuItem jMenuItemGuardarCambiosTablaEstadoGarantiaCliente;
	protected JMenuItem jMenuItemCerrarEstadoGarantiaCliente;
	protected JMenuItem jMenuItemDetalleCerrarEstadoGarantiaCliente;
	protected JMenuItem jMenuItemDetalleAbrirOrderByEstadoGarantiaCliente;
	protected JMenuItem jMenuItemDetalleMostarOcultarEstadoGarantiaCliente;
	
	protected JMenuItem jMenuItemRecargarInformacionEstadoGarantiaCliente;
	protected JMenuItem jMenuItemProcesarInformacionEstadoGarantiaCliente;
	protected JMenuItem jMenuItemAnterioresEstadoGarantiaCliente;
	protected JMenuItem jMenuItemSiguientesEstadoGarantiaCliente;
	protected JMenuItem jMenuItemNuevoGuardarCambiosEstadoGarantiaCliente;
	protected JMenuItem jMenuItemAbrirOrderByEstadoGarantiaCliente;
	protected JMenuItem jMenuItemMostrarOcultarEstadoGarantiaCliente;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesEstadoGarantiaCliente;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosEstadoGarantiaCliente;
	protected JCheckBox jCheckBoxSeleccionadosEstadoGarantiaCliente;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaEstadoGarantiaCliente;
	protected JCheckBox jCheckBoxConGraficoReporteEstadoGarantiaCliente;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesEstadoGarantiaCliente;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesEstadoGarantiaCliente;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoEstadoGarantiaCliente;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoEstadoGarantiaCliente;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesEstadoGarantiaCliente;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionEstadoGarantiaCliente;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesEstadoGarantiaCliente;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesEstadoGarantiaCliente;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarEstadoGarantiaCliente;
	protected JTextField jTextFieldValorCampoGeneralEstadoGarantiaCliente;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteEstadoGarantiaCliente;
	//public JList<Reporte> jListColumnasSelectReporteEstadoGarantiaCliente;
	//public JScrollPane jScrollColumnasSelectReporteEstadoGarantiaCliente;
	
	//public JLabel jLabelRelacionesSelectReporteEstadoGarantiaCliente;
	//public JList<Reporte> jListRelacionesSelectReporteEstadoGarantiaCliente;
	//public JScrollPane jScrollRelacionesSelectReporteEstadoGarantiaCliente;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoEstadoGarantiaCliente;
	//protected JCheckBox jCheckBoxConGraficoDinamicoEstadoGarantiaCliente;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoEstadoGarantiaCliente;
	//public JLabel jLabelTiposArchivoReporteDinamicoEstadoGarantiaCliente;
	
		
	//public JLabel jLabelArchivoImportacionEstadoGarantiaCliente;	
	//public JLabel jLabelPathArchivoImportacionEstadoGarantiaCliente;
	//protected JTextField jTextFieldPathArchivoImportacionEstadoGarantiaCliente;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoEstadoGarantiaCliente;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoEstadoGarantiaCliente;
	
	//public JLabel jLabelColumnaCategoriaValorEstadoGarantiaCliente;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorEstadoGarantiaCliente;
	
	//public JLabel jLabelColumnasValoresGraficoEstadoGarantiaCliente;
	//public JList<Reporte> jListColumnasValoresGraficoEstadoGarantiaCliente;
	//public JScrollPane jScrollColumnasValoresGraficoEstadoGarantiaCliente;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoEstadoGarantiaCliente;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoEstadoGarantiaCliente;	
	
	
	
	
	
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
	public EstadoGarantiaClienteJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("EstadoGarantiaCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoGarantiaClienteJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EstadoGarantiaCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoGarantiaClienteJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EstadoGarantiaCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoGarantiaClienteJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("EstadoGarantiaCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionEstadoGarantiaCliente)	{
		this.jButtonRecargarInformacionEstadoGarantiaCliente = jButtonRecargarInformacionEstadoGarantiaCliente;
	}
	
	public JButton getjButtonProcesarInformacionEstadoGarantiaCliente() {
		return this.jButtonProcesarInformacionEstadoGarantiaCliente;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionEstadoGarantiaCliente)	{
		this.jButtonProcesarInformacionEstadoGarantiaCliente = jButtonProcesarInformacionEstadoGarantiaCliente;
	}
	
	
	public JButton getjButtonRecargarInformacionEstadoGarantiaCliente() {
		return this.jButtonRecargarInformacionEstadoGarantiaCliente;
	}
	
	
	public List<EstadoGarantiaCliente> getestadogarantiaclientes() {
		return this.estadogarantiaclientes;
	}

	public void setestadogarantiaclientes(List<EstadoGarantiaCliente> estadogarantiaclientes) {
		this.estadogarantiaclientes = estadogarantiaclientes;
	}
	
	public List<EstadoGarantiaCliente> getestadogarantiaclientesAux() {
		return this.estadogarantiaclientesAux;
	}

	public void setestadogarantiaclientesAux(List<EstadoGarantiaCliente> estadogarantiaclientesAux) {
		this.estadogarantiaclientesAux = estadogarantiaclientesAux;
	}
	
	public List<EstadoGarantiaCliente> getestadogarantiaclientesEliminados() {
		return this.estadogarantiaclientesEliminados;
	}

	public void setEstadoGarantiaClientesEliminados(List<EstadoGarantiaCliente> estadogarantiaclientesEliminados) {
		this.estadogarantiaclientesEliminados = estadogarantiaclientesEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarEstadoGarantiaCliente() {
		return jComboBoxTiposSeleccionarEstadoGarantiaCliente;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarEstadoGarantiaCliente(
			JComboBox jComboBoxTiposSeleccionarEstadoGarantiaCliente) {
		this.jComboBoxTiposSeleccionarEstadoGarantiaCliente = jComboBoxTiposSeleccionarEstadoGarantiaCliente;
	}
	
	public void setBorderResaltarTiposSeleccionarEstadoGarantiaCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarEstadoGarantiaCliente.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarEstadoGarantiaCliente .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralEstadoGarantiaCliente() {
		return jTextFieldValorCampoGeneralEstadoGarantiaCliente;
	}

	public void setjTextFieldValorCampoGeneralEstadoGarantiaCliente(
			JTextField jTextFieldValorCampoGeneralEstadoGarantiaCliente) {
		this.jTextFieldValorCampoGeneralEstadoGarantiaCliente = jTextFieldValorCampoGeneralEstadoGarantiaCliente;
	}

	public void setBorderResaltarValorCampoGeneralEstadoGarantiaCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoGarantiaCliente.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralEstadoGarantiaCliente .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosEstadoGarantiaCliente() {
		return this.jCheckBoxSeleccionarTodosEstadoGarantiaCliente;
	}

	public void setjCheckBoxSeleccionarTodosEstadoGarantiaCliente(
			JCheckBox jCheckBoxSeleccionarTodosEstadoGarantiaCliente) {
		this.jCheckBoxSeleccionarTodosEstadoGarantiaCliente = jCheckBoxSeleccionarTodosEstadoGarantiaCliente;
	}

	public void setBorderResaltarSeleccionarTodosEstadoGarantiaCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoGarantiaCliente.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosEstadoGarantiaCliente .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosEstadoGarantiaCliente() {
		return this.jCheckBoxSeleccionadosEstadoGarantiaCliente;
	}

	public void setjCheckBoxSeleccionadosEstadoGarantiaCliente(
			JCheckBox jCheckBoxSeleccionadosEstadoGarantiaCliente) {
		this.jCheckBoxSeleccionadosEstadoGarantiaCliente = jCheckBoxSeleccionadosEstadoGarantiaCliente;
	}
	
	public void setBorderResaltarSeleccionadosEstadoGarantiaCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoGarantiaCliente.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosEstadoGarantiaCliente .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesEstadoGarantiaCliente() {
		return this.jComboBoxTiposArchivosReportesEstadoGarantiaCliente;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesEstadoGarantiaCliente(
			JComboBox jComboBoxTiposArchivosReportesEstadoGarantiaCliente) {
		this.jComboBoxTiposArchivosReportesEstadoGarantiaCliente = jComboBoxTiposArchivosReportesEstadoGarantiaCliente;
	}

	public void setBorderResaltarTiposArchivosReportesEstadoGarantiaCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoGarantiaCliente.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesEstadoGarantiaCliente .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesEstadoGarantiaCliente() {
		return this.jComboBoxTiposReportesEstadoGarantiaCliente;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesEstadoGarantiaCliente(
			JComboBox jComboBoxTiposReportesEstadoGarantiaCliente) {
		this.jComboBoxTiposReportesEstadoGarantiaCliente = jComboBoxTiposReportesEstadoGarantiaCliente;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoEstadoGarantiaCliente() {
	//	return jComboBoxTiposReportesDinamicoEstadoGarantiaCliente;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoEstadoGarantiaCliente(
	//		JComboBox jComboBoxTiposReportesDinamicoEstadoGarantiaCliente) {
	//	this.jComboBoxTiposReportesDinamicoEstadoGarantiaCliente = jComboBoxTiposReportesDinamicoEstadoGarantiaCliente;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoEstadoGarantiaCliente() {
	//	return jComboBoxTiposArchivosReportesDinamicoEstadoGarantiaCliente;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoEstadoGarantiaCliente(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoEstadoGarantiaCliente) {
	//	this.jComboBoxTiposArchivosReportesDinamicoEstadoGarantiaCliente = jComboBoxTiposArchivosReportesDinamicoEstadoGarantiaCliente;
	//}
	
	public void setBorderResaltarTiposReportesEstadoGarantiaCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoGarantiaCliente.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesEstadoGarantiaCliente .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesEstadoGarantiaCliente() {
		return this.jComboBoxTiposGraficosReportesEstadoGarantiaCliente;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesEstadoGarantiaCliente(
			JComboBox jComboBoxTiposGraficosReportesEstadoGarantiaCliente) {
		this.jComboBoxTiposGraficosReportesEstadoGarantiaCliente = jComboBoxTiposGraficosReportesEstadoGarantiaCliente;
	}
	
	public void setBorderResaltarTiposGraficosReportesEstadoGarantiaCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoGarantiaCliente.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesEstadoGarantiaCliente .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionEstadoGarantiaCliente() {
		return this.jComboBoxTiposPaginacionEstadoGarantiaCliente;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionEstadoGarantiaCliente(
			JComboBox jComboBoxTiposPaginacionEstadoGarantiaCliente) {
		this.jComboBoxTiposPaginacionEstadoGarantiaCliente = jComboBoxTiposPaginacionEstadoGarantiaCliente;
	}
	
	public void setBorderResaltarTiposPaginacionEstadoGarantiaCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoGarantiaCliente.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionEstadoGarantiaCliente .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesEstadoGarantiaCliente() {
		return this.jComboBoxTiposRelacionesEstadoGarantiaCliente;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesEstadoGarantiaCliente() {
		return this.jComboBoxTiposAccionesEstadoGarantiaCliente;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesEstadoGarantiaCliente(
			JComboBox jComboBoxTiposRelacionesEstadoGarantiaCliente) {
		this.jComboBoxTiposRelacionesEstadoGarantiaCliente = jComboBoxTiposRelacionesEstadoGarantiaCliente;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesEstadoGarantiaCliente(
			JComboBox jComboBoxTiposAccionesEstadoGarantiaCliente) {
		this.jComboBoxTiposAccionesEstadoGarantiaCliente = jComboBoxTiposAccionesEstadoGarantiaCliente;
	}
	
	public void setBorderResaltarTiposRelacionesEstadoGarantiaCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoGarantiaCliente.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesEstadoGarantiaCliente .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesEstadoGarantiaCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoGarantiaCliente.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesEstadoGarantiaCliente .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoEstadoGarantiaCliente() {
	//	return jCheckBoxConGraficoDinamicoEstadoGarantiaCliente;
	//}

	//public void setjCheckBoxConGraficoDinamicoEstadoGarantiaCliente(
	//		JCheckBox jCheckBoxConGraficoDinamicoEstadoGarantiaCliente) {
	//	this.jCheckBoxConGraficoDinamicoEstadoGarantiaCliente = jCheckBoxConGraficoDinamicoEstadoGarantiaCliente;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoEstadoGarantiaCliente() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarEstadoGarantiaCliente.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoEstadoGarantiaCliente .setBorder(borderResaltar);		
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
		this.estadogarantiaclienteSessionBean=new EstadoGarantiaClienteSessionBean();
		
		this.estadogarantiaclienteSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.estadogarantiaclienteSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.estadogarantiaclienteSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=EstadoGarantiaClienteJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=EstadoGarantiaClienteJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		EstadoGarantiaClienteJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		EstadoGarantiaClienteJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		EstadoGarantiaClienteJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Estado Garantia Cliente MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 910) {
			iHeight=910;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.estadogarantiaclienteSessionBean.getEsGuardarRelacionado()) {
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
		
		EstadoGarantiaClienteJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("EstadoGarantiaCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarEstadoGarantiaCliente= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarEstadoGarantiaCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarEstadoGarantiaCliente,this.jTtoolBarEstadoGarantiaCliente,
							"nuevo","nuevo","Nuevo"+" "+EstadoGarantiaClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarEstadoGarantiaCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarEstadoGarantiaCliente,this.jTtoolBarEstadoGarantiaCliente,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarEstadoGarantiaCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarEstadoGarantiaCliente,this.jTtoolBarEstadoGarantiaCliente,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+EstadoGarantiaClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarEstadoGarantiaCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarEstadoGarantiaCliente,this.jTtoolBarEstadoGarantiaCliente,
							"duplicar","duplicar","Duplicar"+" "+EstadoGarantiaClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarEstadoGarantiaCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarEstadoGarantiaCliente,this.jTtoolBarEstadoGarantiaCliente,
							"copiar","copiar","Copiar"+" "+EstadoGarantiaClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarEstadoGarantiaCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarEstadoGarantiaCliente,this.jTtoolBarEstadoGarantiaCliente,
							"ver_form","ver_form","Ver"+" "+EstadoGarantiaClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarEstadoGarantiaCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEstadoGarantiaCliente,this.jTtoolBarEstadoGarantiaCliente,
							"recargar","recargar","Recargar"+" "+EstadoGarantiaClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarEstadoGarantiaCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEstadoGarantiaCliente,this.jTtoolBarEstadoGarantiaCliente,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarEstadoGarantiaCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEstadoGarantiaCliente,this.jTtoolBarEstadoGarantiaCliente,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarEstadoGarantiaCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarEstadoGarantiaCliente,this.jTtoolBarEstadoGarantiaCliente,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarEstadoGarantiaCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarEstadoGarantiaCliente,this.jTtoolBarEstadoGarantiaCliente,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarEstadoGarantiaCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarEstadoGarantiaCliente,this.jTtoolBarEstadoGarantiaCliente,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+EstadoGarantiaClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarEstadoGarantiaCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarEstadoGarantiaCliente,this.jTtoolBarEstadoGarantiaCliente,
							"cerrar","cerrar","Salir"+" "+EstadoGarantiaClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarEstadoGarantiaCliente=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarEstadoGarantiaCliente;
			
				this.jButtonProcesarInformacionToolBarEstadoGarantiaCliente=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarEstadoGarantiaCliente;
				
		//protected JButton jButtonModificarToolBarEstadoGarantiaCliente;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarEstadoGarantiaCliente=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuEstadoGarantiaCliente=new JMenuMe("General");
		this.jmenuArchivoEstadoGarantiaCliente=new JMenuMe("Archivo");
		this.jmenuAccionesEstadoGarantiaCliente=new JMenuMe("Acciones");
		this.jmenuDatosEstadoGarantiaCliente=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoEstadoGarantiaCliente= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoEstadoGarantiaCliente.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoEstadoGarantiaCliente,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoEstadoGarantiaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarEstadoGarantiaCliente= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarEstadoGarantiaCliente.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarEstadoGarantiaCliente,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarEstadoGarantiaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesEstadoGarantiaCliente= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesEstadoGarantiaCliente.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesEstadoGarantiaCliente,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesEstadoGarantiaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosEstadoGarantiaCliente= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosEstadoGarantiaCliente.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosEstadoGarantiaCliente,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosEstadoGarantiaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarEstadoGarantiaCliente= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarEstadoGarantiaCliente.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarEstadoGarantiaCliente,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarEstadoGarantiaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormEstadoGarantiaCliente= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormEstadoGarantiaCliente.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormEstadoGarantiaCliente,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormEstadoGarantiaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaEstadoGarantiaCliente= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaEstadoGarantiaCliente.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaEstadoGarantiaCliente,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaEstadoGarantiaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarEstadoGarantiaCliente= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarEstadoGarantiaCliente.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarEstadoGarantiaCliente,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarEstadoGarantiaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionEstadoGarantiaCliente= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionEstadoGarantiaCliente.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionEstadoGarantiaCliente,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionEstadoGarantiaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionEstadoGarantiaCliente= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionEstadoGarantiaCliente.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionEstadoGarantiaCliente,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresEstadoGarantiaCliente= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresEstadoGarantiaCliente.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresEstadoGarantiaCliente,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresEstadoGarantiaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesEstadoGarantiaCliente= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesEstadoGarantiaCliente.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesEstadoGarantiaCliente,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesEstadoGarantiaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByEstadoGarantiaCliente= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByEstadoGarantiaCliente.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByEstadoGarantiaCliente,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByEstadoGarantiaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarEstadoGarantiaCliente= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarEstadoGarantiaCliente.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarEstadoGarantiaCliente,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarEstadoGarantiaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByEstadoGarantiaCliente= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByEstadoGarantiaCliente.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByEstadoGarantiaCliente,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByEstadoGarantiaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarEstadoGarantiaCliente= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarEstadoGarantiaCliente.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarEstadoGarantiaCliente,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarEstadoGarantiaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosEstadoGarantiaCliente= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosEstadoGarantiaCliente.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosEstadoGarantiaCliente,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosEstadoGarantiaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoEstadoGarantiaCliente.add(this.jMenuItemCerrarEstadoGarantiaCliente);
			
			this.jmenuAccionesEstadoGarantiaCliente.add(this.jMenuItemNuevoEstadoGarantiaCliente);
			this.jmenuAccionesEstadoGarantiaCliente.add(this.jMenuItemNuevoGuardarCambiosEstadoGarantiaCliente);
			this.jmenuAccionesEstadoGarantiaCliente.add(this.jMenuItemNuevoRelacionesEstadoGarantiaCliente);
			this.jmenuAccionesEstadoGarantiaCliente.add(this.jMenuItemGuardarCambiosTablaEstadoGarantiaCliente);		
			this.jmenuAccionesEstadoGarantiaCliente.add(this.jMenuItemDuplicarEstadoGarantiaCliente);		
			this.jmenuAccionesEstadoGarantiaCliente.add(this.jMenuItemCopiarEstadoGarantiaCliente);		
			this.jmenuAccionesEstadoGarantiaCliente.add(this.jMenuItemVerFormEstadoGarantiaCliente);		
			
			this.jmenuDatosEstadoGarantiaCliente.add(this.jMenuItemRecargarInformacionEstadoGarantiaCliente);				
			this.jmenuDatosEstadoGarantiaCliente.add(this.jMenuItemAnterioresEstadoGarantiaCliente);				
			this.jmenuDatosEstadoGarantiaCliente.add(this.jMenuItemSiguientesEstadoGarantiaCliente);				
			this.jmenuDatosEstadoGarantiaCliente.add(this.jMenuItemAbrirOrderByEstadoGarantiaCliente);				
			this.jmenuDatosEstadoGarantiaCliente.add(this.jMenuItemMostrarOcultarEstadoGarantiaCliente);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesEstadoGarantiaCliente.add(this.jMenuItemGuardarCambiosEstadoGarantiaCliente);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoEstadoGarantiaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesEstadoGarantiaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosEstadoGarantiaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarEstadoGarantiaCliente.add(this.jmenuArchivoEstadoGarantiaCliente);		
			this.jmenuBarEstadoGarantiaCliente.add(this.jmenuAccionesEstadoGarantiaCliente);		
			this.jmenuBarEstadoGarantiaCliente.add(this.jmenuDatosEstadoGarantiaCliente);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarEstadoGarantiaCliente);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasEstadoGarantiaCliente() {
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
			//this.jInternalFrameDetalleEstadoGarantiaCliente = new EstadoGarantiaClienteDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Estado Garantia Cliente DATOS");
			this.jInternalFrameDetalleFormEstadoGarantiaCliente = new EstadoGarantiaClienteDetalleFormJInternalFrame(jDesktopPane,this.estadogarantiaclienteSessionBean.getConGuardarRelaciones(),this.estadogarantiaclienteSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormEstadoGarantiaCliente = null;//new EstadoGarantiaClienteDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutEstadoGarantiaCliente= new GridBagLayout();
		
		
		this.jTableDatosEstadoGarantiaCliente = new JTableMe();      
		
		String sToolTipEstadoGarantiaCliente="";
		sToolTipEstadoGarantiaCliente=EstadoGarantiaClienteConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipEstadoGarantiaCliente+="(Cartera.EstadoGarantiaCliente)";
		}
		
		if(!this.estadogarantiaclienteSessionBean.getEsGuardarRelacionado()) {
			sToolTipEstadoGarantiaCliente+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosEstadoGarantiaCliente.setToolTipText(sToolTipEstadoGarantiaCliente);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosEstadoGarantiaCliente);
		this.jTableDatosEstadoGarantiaCliente.setAutoCreateRowSorter(true);
		this.jTableDatosEstadoGarantiaCliente.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosEstadoGarantiaCliente.setRowSelectionAllowed(true);
		this.jTableDatosEstadoGarantiaCliente.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosEstadoGarantiaCliente,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoEstadoGarantiaCliente = new JButtonMe();
		this.jButtonDuplicarEstadoGarantiaCliente = new JButtonMe();
		this.jButtonCopiarEstadoGarantiaCliente = new JButtonMe();
		this.jButtonVerFormEstadoGarantiaCliente = new JButtonMe();
		this.jButtonNuevoRelacionesEstadoGarantiaCliente = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaEstadoGarantiaCliente = new JButtonMe();
		this.jButtonCerrarEstadoGarantiaCliente = new JButtonMe();
		
		this.jScrollPanelDatosEstadoGarantiaCliente = new JScrollPane();   
        this.jScrollPanelDatosGeneralEstadoGarantiaCliente = new JScrollPane();
		
				
		
		
		this.jPanelAccionesEstadoGarantiaCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Estado Garantia Cliente";
		
		if(!this.estadogarantiaclienteSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosEstadoGarantiaCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Garantia Clientes" + this.sPath));
		} else {
			this.jScrollPanelDatosEstadoGarantiaCliente.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralEstadoGarantiaCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesEstadoGarantiaCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesEstadoGarantiaCliente.setToolTipText("Acciones");
        this.jPanelAccionesEstadoGarantiaCliente.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralEstadoGarantiaCliente, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEstadoGarantiaCliente, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoEstadoGarantiaCliente=new ReporteDinamicoJInternalFrame(EstadoGarantiaClienteConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoEstadoGarantiaCliente();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionEstadoGarantiaCliente=new ImportacionJInternalFrame(EstadoGarantiaClienteConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionEstadoGarantiaCliente();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByEstadoGarantiaCliente = new JButtonMe();
		
		this.jButtonAbrirOrderByEstadoGarantiaCliente.setText("Orden");
		this.jButtonAbrirOrderByEstadoGarantiaCliente.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByEstadoGarantiaCliente,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByEstadoGarantiaCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByEstadoGarantiaCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByEstadoGarantiaCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByEstadoGarantiaCliente=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEstadoGarantiaCliente,false,this);
			
			//this.cargarOrderByEstadoGarantiaCliente(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByEstadoGarantiaCliente=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEstadoGarantiaCliente,true,this);
			
			//this.cargarOrderByEstadoGarantiaCliente(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosEstadoGarantiaCliente.setMinimumSize(new Dimension(400,50));//430
		this.jTableDatosEstadoGarantiaCliente.setMaximumSize(new Dimension(400,50));//430
		this.jTableDatosEstadoGarantiaCliente.setPreferredSize(new Dimension(400,50));//430
		
		this.jScrollPanelDatosEstadoGarantiaCliente.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosEstadoGarantiaCliente.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosEstadoGarantiaCliente.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoEstadoGarantiaCliente.setText("Nuevo");
		this.jButtonDuplicarEstadoGarantiaCliente.setText("Duplicar");
		this.jButtonCopiarEstadoGarantiaCliente.setText("Copiar");
		this.jButtonVerFormEstadoGarantiaCliente.setText("Ver");
		this.jButtonNuevoRelacionesEstadoGarantiaCliente.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaEstadoGarantiaCliente.setText("Guardar");
		this.jButtonCerrarEstadoGarantiaCliente.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoEstadoGarantiaCliente,"nuevo_button","Nuevo",this.estadogarantiaclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarEstadoGarantiaCliente,"duplicar_button","Duplicar",this.estadogarantiaclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarEstadoGarantiaCliente,"copiar_button","Copiar",this.estadogarantiaclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormEstadoGarantiaCliente,"ver_form","Ver",this.estadogarantiaclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesEstadoGarantiaCliente,"nuevorelaciones_button","Nuevo Rel",this.estadogarantiaclienteSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaEstadoGarantiaCliente,"guardarcambiostabla_button","Guardar",this.estadogarantiaclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarEstadoGarantiaCliente,"cerrar_button","Salir",this.estadogarantiaclienteSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoEstadoGarantiaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarEstadoGarantiaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarEstadoGarantiaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormEstadoGarantiaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesEstadoGarantiaCliente, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaEstadoGarantiaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarEstadoGarantiaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoEstadoGarantiaCliente.setToolTipText("Nuevo"+" "+EstadoGarantiaClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarEstadoGarantiaCliente.setToolTipText("Duplicar"+" "+EstadoGarantiaClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarEstadoGarantiaCliente.setToolTipText("Copiar"+" "+EstadoGarantiaClienteConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormEstadoGarantiaCliente.setToolTipText("Ver"+" "+EstadoGarantiaClienteConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesEstadoGarantiaCliente.setToolTipText("Nuevo Rel"+" "+EstadoGarantiaClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaEstadoGarantiaCliente.setToolTipText("Guardar"+" "+EstadoGarantiaClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarEstadoGarantiaCliente.setToolTipText("Salir"+" "+EstadoGarantiaClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoEstadoGarantiaCliente";
		inputMap = this.jButtonNuevoEstadoGarantiaCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoEstadoGarantiaCliente.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoEstadoGarantiaCliente"));
		
		//DUPLICAR
		sMapKey = "DuplicarEstadoGarantiaCliente";
		inputMap = this.jButtonDuplicarEstadoGarantiaCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarEstadoGarantiaCliente.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarEstadoGarantiaCliente"));
		
		//COPIAR
		sMapKey = "CopiarEstadoGarantiaCliente";
		inputMap = this.jButtonCopiarEstadoGarantiaCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarEstadoGarantiaCliente.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarEstadoGarantiaCliente"));
		
		//VEr FORM
		sMapKey = "VerFormEstadoGarantiaCliente";
		inputMap = this.jButtonVerFormEstadoGarantiaCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormEstadoGarantiaCliente.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormEstadoGarantiaCliente"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesEstadoGarantiaCliente";
		inputMap = this.jButtonNuevoRelacionesEstadoGarantiaCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesEstadoGarantiaCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesEstadoGarantiaCliente"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarEstadoGarantiaCliente";
		inputMap = this.jButtonModificarEstadoGarantiaCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarEstadoGarantiaCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarEstadoGarantiaCliente"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarEstadoGarantiaCliente";
		inputMap = this.jButtonCerrarEstadoGarantiaCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarEstadoGarantiaCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarEstadoGarantiaCliente"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaEstadoGarantiaCliente";
		inputMap = this.jButtonGuardarCambiosTablaEstadoGarantiaCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaEstadoGarantiaCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaEstadoGarantiaCliente"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesEstadoGarantiaCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesEstadoGarantiaCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionEstadoGarantiaCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1EstadoGarantiaCliente= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2EstadoGarantiaCliente= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3EstadoGarantiaCliente= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4EstadoGarantiaCliente= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5EstadoGarantiaCliente= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesEstadoGarantiaCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesEstadoGarantiaCliente.setName("jPanelParametrosReportesEstadoGarantiaCliente"); 
		
		this.jPanelParametrosReportesAccionesEstadoGarantiaCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesEstadoGarantiaCliente.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesEstadoGarantiaCliente.setName("jPanelParametrosReportesAccionesEstadoGarantiaCliente"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesEstadoGarantiaCliente, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesEstadoGarantiaCliente, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionEstadoGarantiaCliente = new JButtonMe();
		this.jButtonRecargarInformacionEstadoGarantiaCliente.setText("Recargar");
		this.jButtonRecargarInformacionEstadoGarantiaCliente.setToolTipText("Recargar"+" "+EstadoGarantiaClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionEstadoGarantiaCliente,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionEstadoGarantiaCliente = new JButtonMe();
		this.jButtonProcesarInformacionEstadoGarantiaCliente.setText("Procesar");
		this.jButtonProcesarInformacionEstadoGarantiaCliente.setToolTipText("Procesar"+" "+EstadoGarantiaClienteConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionEstadoGarantiaCliente.setVisible(false);
			
		this.jButtonProcesarInformacionEstadoGarantiaCliente.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionEstadoGarantiaCliente.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionEstadoGarantiaCliente.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesEstadoGarantiaCliente = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEstadoGarantiaCliente.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesEstadoGarantiaCliente.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesEstadoGarantiaCliente = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEstadoGarantiaCliente.setText("TIPO");       
		this.jComboBoxTiposReportesEstadoGarantiaCliente.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesEstadoGarantiaCliente = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEstadoGarantiaCliente.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesEstadoGarantiaCliente.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionEstadoGarantiaCliente = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionEstadoGarantiaCliente.setText("Paginacion");
		this.jComboBoxTiposPaginacionEstadoGarantiaCliente.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesEstadoGarantiaCliente = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesEstadoGarantiaCliente.setText("Accion");
		this.jComboBoxTiposRelacionesEstadoGarantiaCliente.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesEstadoGarantiaCliente = new JComboBoxMe();
		//this.jComboBoxTiposAccionesEstadoGarantiaCliente.setText("Accion");
		this.jComboBoxTiposAccionesEstadoGarantiaCliente.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarEstadoGarantiaCliente = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarEstadoGarantiaCliente.setText("Accion");
		this.jComboBoxTiposSeleccionarEstadoGarantiaCliente.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralEstadoGarantiaCliente=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralEstadoGarantiaCliente.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralEstadoGarantiaCliente.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralEstadoGarantiaCliente.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesEstadoGarantiaCliente = new JLabelMe();
		
		this.jLabelAccionesEstadoGarantiaCliente.setText("Acciones");		
		this.jLabelAccionesEstadoGarantiaCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEstadoGarantiaCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEstadoGarantiaCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosEstadoGarantiaCliente = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosEstadoGarantiaCliente.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosEstadoGarantiaCliente.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosEstadoGarantiaCliente = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosEstadoGarantiaCliente.setText("Seleccionados");
		this.jCheckBoxSeleccionadosEstadoGarantiaCliente.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaEstadoGarantiaCliente = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaEstadoGarantiaCliente.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaEstadoGarantiaCliente.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteEstadoGarantiaCliente = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteEstadoGarantiaCliente.setText("Graf.");
		this.jCheckBoxConGraficoReporteEstadoGarantiaCliente.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresEstadoGarantiaCliente = new JButtonMe();
		//this.jButtonAnterioresEstadoGarantiaCliente.setText("<<");
        this.jButtonAnterioresEstadoGarantiaCliente.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresEstadoGarantiaCliente,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresEstadoGarantiaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesEstadoGarantiaCliente = new JButtonMe();
		//this.jButtonSiguientesEstadoGarantiaCliente.setText(">>");
        this.jButtonSiguientesEstadoGarantiaCliente.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesEstadoGarantiaCliente,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesEstadoGarantiaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosEstadoGarantiaCliente = new JButtonMe();
		this.jButtonNuevoGuardarCambiosEstadoGarantiaCliente.setText("Nue");
        this.jButtonNuevoGuardarCambiosEstadoGarantiaCliente.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosEstadoGarantiaCliente,"nuevoguardarcambios_button","Nue",this.estadogarantiaclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosEstadoGarantiaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosEstadoGarantiaCliente";
		inputMap = this.jButtonNuevoGuardarCambiosEstadoGarantiaCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosEstadoGarantiaCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosEstadoGarantiaCliente"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionEstadoGarantiaCliente";
		inputMap = this.jButtonRecargarInformacionEstadoGarantiaCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionEstadoGarantiaCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionEstadoGarantiaCliente"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesEstadoGarantiaCliente";
		inputMap = this.jButtonSiguientesEstadoGarantiaCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesEstadoGarantiaCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesEstadoGarantiaCliente"));
		
		//ANTERIORES		
		sMapKey = "AnterioresEstadoGarantiaCliente";
		inputMap = this.jButtonAnterioresEstadoGarantiaCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresEstadoGarantiaCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresEstadoGarantiaCliente"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasEstadoGarantiaCliente();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesEstadoGarantiaCliente.setMinimumSize(new Dimension(this.getWidth(),EstadoGarantiaClienteBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EstadoGarantiaClienteBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesEstadoGarantiaCliente.setMaximumSize(new Dimension(this.getWidth(),EstadoGarantiaClienteBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EstadoGarantiaClienteBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesEstadoGarantiaCliente.setPreferredSize(new Dimension(this.getWidth(),EstadoGarantiaClienteBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EstadoGarantiaClienteBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionEstadoGarantiaCliente = new GridBagLayout();

			this.jPanelPaginacionEstadoGarantiaCliente.setLayout(gridaBagLayoutPaginacionEstadoGarantiaCliente);						
			
			this.gridBagConstraintsEstadoGarantiaCliente = new GridBagConstraints();
			this.gridBagConstraintsEstadoGarantiaCliente.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsEstadoGarantiaCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoGarantiaCliente.gridy = 0;
			this.gridBagConstraintsEstadoGarantiaCliente.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionEstadoGarantiaCliente.add(this.jButtonAnterioresEstadoGarantiaCliente, this.gridBagConstraintsEstadoGarantiaCliente);
					
						
			this.gridBagConstraintsEstadoGarantiaCliente = new GridBagConstraints();
			this.gridBagConstraintsEstadoGarantiaCliente.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsEstadoGarantiaCliente.gridy = 0;
			
			this.jPanelPaginacionEstadoGarantiaCliente.add(this.jButtonNuevoGuardarCambiosEstadoGarantiaCliente, this.gridBagConstraintsEstadoGarantiaCliente);
						
			
			this.gridBagConstraintsEstadoGarantiaCliente = new GridBagConstraints();
			this.gridBagConstraintsEstadoGarantiaCliente.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsEstadoGarantiaCliente.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsEstadoGarantiaCliente.gridy = 0;
			this.jPanelPaginacionEstadoGarantiaCliente.add(this.jButtonSiguientesEstadoGarantiaCliente, this.gridBagConstraintsEstadoGarantiaCliente);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsEstadoGarantiaCliente = new GridBagConstraints();
			this.gridBagConstraintsEstadoGarantiaCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoGarantiaCliente.gridy = 1;
			this.gridBagConstraintsEstadoGarantiaCliente.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEstadoGarantiaCliente.add(this.jButtonNuevoEstadoGarantiaCliente, this.gridBagConstraintsEstadoGarantiaCliente);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsEstadoGarantiaCliente = new GridBagConstraints();
				this.gridBagConstraintsEstadoGarantiaCliente.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsEstadoGarantiaCliente.gridy = 1;
				this.gridBagConstraintsEstadoGarantiaCliente.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionEstadoGarantiaCliente.add(this.jButtonNuevoRelacionesEstadoGarantiaCliente, this.gridBagConstraintsEstadoGarantiaCliente);
			}
			
			
			if(!this.estadogarantiaclienteSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsEstadoGarantiaCliente = new GridBagConstraints();
				this.gridBagConstraintsEstadoGarantiaCliente.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsEstadoGarantiaCliente.gridy = 1;
				this.gridBagConstraintsEstadoGarantiaCliente.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionEstadoGarantiaCliente.add(this.jButtonGuardarCambiosTablaEstadoGarantiaCliente, this.gridBagConstraintsEstadoGarantiaCliente);
			}
			
			
			
			this.gridBagConstraintsEstadoGarantiaCliente = new GridBagConstraints();
			this.gridBagConstraintsEstadoGarantiaCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoGarantiaCliente.gridy = 1;
			this.gridBagConstraintsEstadoGarantiaCliente.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEstadoGarantiaCliente.add(this.jButtonDuplicarEstadoGarantiaCliente, this.gridBagConstraintsEstadoGarantiaCliente);
			
			this.gridBagConstraintsEstadoGarantiaCliente = new GridBagConstraints();
			this.gridBagConstraintsEstadoGarantiaCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoGarantiaCliente.gridy = 1;
			this.gridBagConstraintsEstadoGarantiaCliente.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEstadoGarantiaCliente.add(this.jButtonCopiarEstadoGarantiaCliente, this.gridBagConstraintsEstadoGarantiaCliente);
		
			this.gridBagConstraintsEstadoGarantiaCliente = new GridBagConstraints();
			this.gridBagConstraintsEstadoGarantiaCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoGarantiaCliente.gridy = 1;
			this.gridBagConstraintsEstadoGarantiaCliente.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEstadoGarantiaCliente.add(this.jButtonVerFormEstadoGarantiaCliente, this.gridBagConstraintsEstadoGarantiaCliente);
		
			this.gridBagConstraintsEstadoGarantiaCliente = new GridBagConstraints();
			this.gridBagConstraintsEstadoGarantiaCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoGarantiaCliente.gridy = 1;
			this.gridBagConstraintsEstadoGarantiaCliente.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionEstadoGarantiaCliente.add(this.jButtonCerrarEstadoGarantiaCliente, this.gridBagConstraintsEstadoGarantiaCliente);
		
		
		
		this.jButtonRecargarInformacionEstadoGarantiaCliente.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionEstadoGarantiaCliente.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionEstadoGarantiaCliente.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionEstadoGarantiaCliente, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesEstadoGarantiaCliente.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesEstadoGarantiaCliente.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesEstadoGarantiaCliente.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesEstadoGarantiaCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesEstadoGarantiaCliente.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesEstadoGarantiaCliente.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesEstadoGarantiaCliente.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesEstadoGarantiaCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesEstadoGarantiaCliente.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesEstadoGarantiaCliente.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesEstadoGarantiaCliente.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesEstadoGarantiaCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionEstadoGarantiaCliente.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionEstadoGarantiaCliente.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionEstadoGarantiaCliente.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionEstadoGarantiaCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesEstadoGarantiaCliente.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesEstadoGarantiaCliente.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesEstadoGarantiaCliente.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesEstadoGarantiaCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesEstadoGarantiaCliente.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEstadoGarantiaCliente.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEstadoGarantiaCliente.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesEstadoGarantiaCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarEstadoGarantiaCliente.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarEstadoGarantiaCliente.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarEstadoGarantiaCliente.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarEstadoGarantiaCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaEstadoGarantiaCliente.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaEstadoGarantiaCliente.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaEstadoGarantiaCliente.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaEstadoGarantiaCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteEstadoGarantiaCliente.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteEstadoGarantiaCliente.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteEstadoGarantiaCliente.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteEstadoGarantiaCliente, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosEstadoGarantiaCliente.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosEstadoGarantiaCliente.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosEstadoGarantiaCliente.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosEstadoGarantiaCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosEstadoGarantiaCliente.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosEstadoGarantiaCliente.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosEstadoGarantiaCliente.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosEstadoGarantiaCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesEstadoGarantiaCliente = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesEstadoGarantiaCliente = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1EstadoGarantiaCliente = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2EstadoGarantiaCliente = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3EstadoGarantiaCliente = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4EstadoGarantiaCliente = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesEstadoGarantiaCliente.setLayout(gridaBagParametrosReportesEstadoGarantiaCliente);
			this.jPanelParametrosReportesAccionesEstadoGarantiaCliente.setLayout(gridaBagParametrosReportesAccionesEstadoGarantiaCliente);
			
			
			this.jPanelParametrosAuxiliar1EstadoGarantiaCliente.setLayout(gridaBagParametrosAuxiliar1EstadoGarantiaCliente);
			this.jPanelParametrosAuxiliar2EstadoGarantiaCliente.setLayout(gridaBagParametrosAuxiliar2EstadoGarantiaCliente);
			this.jPanelParametrosAuxiliar3EstadoGarantiaCliente.setLayout(gridaBagParametrosAuxiliar3EstadoGarantiaCliente);
			this.jPanelParametrosAuxiliar4EstadoGarantiaCliente.setLayout(gridaBagParametrosAuxiliar4EstadoGarantiaCliente);
			//this.jPanelParametrosAuxiliar5EstadoGarantiaCliente.setLayout(gridaBagParametrosAuxiliar2EstadoGarantiaCliente);			
			
			
			
			
			this.gridBagConstraintsEstadoGarantiaCliente = new GridBagConstraints();
			this.gridBagConstraintsEstadoGarantiaCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoGarantiaCliente.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEstadoGarantiaCliente.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstadoGarantiaCliente.add(this.jButtonRecargarInformacionEstadoGarantiaCliente, this.gridBagConstraintsEstadoGarantiaCliente);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsEstadoGarantiaCliente = new GridBagConstraints();
			this.gridBagConstraintsEstadoGarantiaCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoGarantiaCliente.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoGarantiaCliente.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1EstadoGarantiaCliente.add(this.jComboBoxTiposPaginacionEstadoGarantiaCliente, this.gridBagConstraintsEstadoGarantiaCliente);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsEstadoGarantiaCliente = new GridBagConstraints();
			this.gridBagConstraintsEstadoGarantiaCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoGarantiaCliente.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoGarantiaCliente.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1EstadoGarantiaCliente.add(this.jCheckBoxConAltoMaximoTablaEstadoGarantiaCliente, this.gridBagConstraintsEstadoGarantiaCliente);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsEstadoGarantiaCliente = new GridBagConstraints();
			this.gridBagConstraintsEstadoGarantiaCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoGarantiaCliente.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoGarantiaCliente.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1EstadoGarantiaCliente.add(this.jComboBoxTiposArchivosReportesEstadoGarantiaCliente, this.gridBagConstraintsEstadoGarantiaCliente);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsEstadoGarantiaCliente = new GridBagConstraints();
			this.gridBagConstraintsEstadoGarantiaCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoGarantiaCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoGarantiaCliente.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoGarantiaCliente.add(this.jPanelParametrosAuxiliar1EstadoGarantiaCliente, this.gridBagConstraintsEstadoGarantiaCliente);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsEstadoGarantiaCliente = new GridBagConstraints();
			this.gridBagConstraintsEstadoGarantiaCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoGarantiaCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoGarantiaCliente.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEstadoGarantiaCliente.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4EstadoGarantiaCliente.add(this.jComboBoxTiposReportesEstadoGarantiaCliente, this.gridBagConstraintsEstadoGarantiaCliente);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsEstadoGarantiaCliente = new GridBagConstraints();
			this.gridBagConstraintsEstadoGarantiaCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoGarantiaCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoGarantiaCliente.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoGarantiaCliente.add(this.jPanelParametrosAuxiliar4EstadoGarantiaCliente, this.gridBagConstraintsEstadoGarantiaCliente);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsEstadoGarantiaCliente = new GridBagConstraints();
			this.gridBagConstraintsEstadoGarantiaCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoGarantiaCliente.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoGarantiaCliente.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoGarantiaCliente.add(this.jComboBoxTiposReportesEstadoGarantiaCliente, this.gridBagConstraintsEstadoGarantiaCliente);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsEstadoGarantiaCliente = new GridBagConstraints();
			this.gridBagConstraintsEstadoGarantiaCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoGarantiaCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoGarantiaCliente.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEstadoGarantiaCliente.add(this.jCheckBoxGenerarReporteEstadoGarantiaCliente, this.gridBagConstraintsEstadoGarantiaCliente);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsEstadoGarantiaCliente = new GridBagConstraints();
			this.gridBagConstraintsEstadoGarantiaCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoGarantiaCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoGarantiaCliente.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoGarantiaCliente.add(this.jPanelParametrosAuxiliar2EstadoGarantiaCliente, this.gridBagConstraintsEstadoGarantiaCliente);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsEstadoGarantiaCliente = new GridBagConstraints();
			this.gridBagConstraintsEstadoGarantiaCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoGarantiaCliente.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEstadoGarantiaCliente.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEstadoGarantiaCliente.add(this.jLabelAccionesEstadoGarantiaCliente, this.gridBagConstraintsEstadoGarantiaCliente);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsEstadoGarantiaCliente = new GridBagConstraints();
				this.gridBagConstraintsEstadoGarantiaCliente.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsEstadoGarantiaCliente.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsEstadoGarantiaCliente.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesEstadoGarantiaCliente.add(this.jButtonAbrirOrderByEstadoGarantiaCliente, this.gridBagConstraintsEstadoGarantiaCliente);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsEstadoGarantiaCliente = new GridBagConstraints();
			this.gridBagConstraintsEstadoGarantiaCliente.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsEstadoGarantiaCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoGarantiaCliente.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstadoGarantiaCliente.add(this.jComboBoxTiposSeleccionarEstadoGarantiaCliente, this.gridBagConstraintsEstadoGarantiaCliente);			
			
			
			/*
			this.gridBagConstraintsEstadoGarantiaCliente = new GridBagConstraints();
			this.gridBagConstraintsEstadoGarantiaCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoGarantiaCliente.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEstadoGarantiaCliente.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEstadoGarantiaCliente.add(this.jCheckBoxSeleccionarTodosEstadoGarantiaCliente, this.gridBagConstraintsEstadoGarantiaCliente);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsEstadoGarantiaCliente = new GridBagConstraints();
			this.gridBagConstraintsEstadoGarantiaCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoGarantiaCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoGarantiaCliente.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEstadoGarantiaCliente.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3EstadoGarantiaCliente.add(this.jCheckBoxSeleccionarTodosEstadoGarantiaCliente, this.gridBagConstraintsEstadoGarantiaCliente);															
				
			this.gridBagConstraintsEstadoGarantiaCliente = new GridBagConstraints();
			this.gridBagConstraintsEstadoGarantiaCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoGarantiaCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoGarantiaCliente.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEstadoGarantiaCliente.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3EstadoGarantiaCliente.add(this.jCheckBoxSeleccionadosEstadoGarantiaCliente, this.gridBagConstraintsEstadoGarantiaCliente);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsEstadoGarantiaCliente = new GridBagConstraints();
			this.gridBagConstraintsEstadoGarantiaCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoGarantiaCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoGarantiaCliente.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoGarantiaCliente.add(this.jPanelParametrosAuxiliar3EstadoGarantiaCliente, this.gridBagConstraintsEstadoGarantiaCliente);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsEstadoGarantiaCliente = new GridBagConstraints();
			this.gridBagConstraintsEstadoGarantiaCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoGarantiaCliente.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstadoGarantiaCliente.add(this.jComboBoxTiposRelacionesEstadoGarantiaCliente, this.gridBagConstraintsEstadoGarantiaCliente);
				
			this.gridBagConstraintsEstadoGarantiaCliente = new GridBagConstraints();
			this.gridBagConstraintsEstadoGarantiaCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoGarantiaCliente.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstadoGarantiaCliente.add(this.jComboBoxTiposAccionesEstadoGarantiaCliente, this.gridBagConstraintsEstadoGarantiaCliente);
	
				
			this.gridBagConstraintsEstadoGarantiaCliente = new GridBagConstraints();
			this.gridBagConstraintsEstadoGarantiaCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoGarantiaCliente.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstadoGarantiaCliente.add(this.jTextFieldValorCampoGeneralEstadoGarantiaCliente, this.gridBagConstraintsEstadoGarantiaCliente);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosEstadoGarantiaCliente = new GridBagLayout();

			this.jScrollPanelDatosEstadoGarantiaCliente.setLayout(gridaBagLayoutDatosEstadoGarantiaCliente);
			
			this.gridBagConstraintsEstadoGarantiaCliente = new GridBagConstraints();
			this.gridBagConstraintsEstadoGarantiaCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoGarantiaCliente.gridy = 0;
			this.gridBagConstraintsEstadoGarantiaCliente.gridx = 0;
			
			this.jScrollPanelDatosEstadoGarantiaCliente.add(this.jTableDatosEstadoGarantiaCliente, this.gridBagConstraintsEstadoGarantiaCliente);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosEstadoGarantiaCliente.setViewportView(this.jTableDatosEstadoGarantiaCliente);
		this.jTableDatosEstadoGarantiaCliente.setFillsViewportHeight(true);
		this.jTableDatosEstadoGarantiaCliente.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesEstadoGarantiaCliente= new GridBagLayout();
		this.jPanelAccionesEstadoGarantiaCliente.setLayout(gridaBagLayoutAccionesEstadoGarantiaCliente);
		
		
		/*	
		this.gridBagConstraintsEstadoGarantiaCliente = new GridBagConstraints();
		this.gridBagConstraintsEstadoGarantiaCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoGarantiaCliente.gridy = 0;
		this.gridBagConstraintsEstadoGarantiaCliente.gridx = 0;
			
		this.jPanelAccionesEstadoGarantiaCliente.add(this.jButtonNuevoEstadoGarantiaCliente, this.gridBagConstraintsEstadoGarantiaCliente);
		*/
		int iPosXAccion=0;
		
						
		
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutEstadoGarantiaCliente = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutEstadoGarantiaCliente);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.estadogarantiaclienteSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsEstadoGarantiaCliente = new GridBagConstraints();						
			this.gridBagConstraintsEstadoGarantiaCliente.gridy = iGridyPrincipal++;
			this.gridBagConstraintsEstadoGarantiaCliente.gridx = 0;		
			//this.gridBagConstraintsEstadoGarantiaCliente.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoGarantiaCliente.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsEstadoGarantiaCliente.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarEstadoGarantiaCliente, this.gridBagConstraintsEstadoGarantiaCliente);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsEstadoGarantiaCliente = new GridBagConstraints();
		this.gridBagConstraintsEstadoGarantiaCliente.gridy = iGridyPrincipal++;
		this.gridBagConstraintsEstadoGarantiaCliente.gridx = 0;		
		//this.gridBagConstraintsEstadoGarantiaCliente.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoGarantiaCliente.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsEstadoGarantiaCliente.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsEstadoGarantiaCliente);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsEstadoGarantiaCliente = new GridBagConstraints();
		this.gridBagConstraintsEstadoGarantiaCliente.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoGarantiaCliente.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesEstadoGarantiaCliente, this.gridBagConstraintsEstadoGarantiaCliente);								
		
		
		/*
		this.gridBagConstraintsEstadoGarantiaCliente = new GridBagConstraints();
		this.gridBagConstraintsEstadoGarantiaCliente.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoGarantiaCliente.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesEstadoGarantiaCliente, this.gridBagConstraintsEstadoGarantiaCliente);
		*/		
		
		this.gridBagConstraintsEstadoGarantiaCliente = new GridBagConstraints();
		this.gridBagConstraintsEstadoGarantiaCliente.gridy =iGridyPrincipal++;
		this.gridBagConstraintsEstadoGarantiaCliente.gridx =0;
		this.gridBagConstraintsEstadoGarantiaCliente.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsEstadoGarantiaCliente.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosEstadoGarantiaCliente, this.gridBagConstraintsEstadoGarantiaCliente);
				
		
		this.gridBagConstraintsEstadoGarantiaCliente = new GridBagConstraints();
		this.gridBagConstraintsEstadoGarantiaCliente.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoGarantiaCliente.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionEstadoGarantiaCliente, this.gridBagConstraintsEstadoGarantiaCliente);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(EstadoGarantiaClienteJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosEstadoGarantiaCliente= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosEstadoGarantiaCliente = new GridBagLayout();
			this.jPanelBusquedasParametrosEstadoGarantiaCliente.setLayout(gridaBagLayoutBusquedasParametrosEstadoGarantiaCliente);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralEstadoGarantiaCliente=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralEstadoGarantiaCliente.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEstadoGarantiaCliente.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEstadoGarantiaCliente.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsEstadoGarantiaCliente = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsEstadoGarantiaCliente = new GridBagConstraints();
		this.gridBagConstraintsEstadoGarantiaCliente.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoGarantiaCliente.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposEstadoGarantiaCliente, this.gridBagConstraintsEstadoGarantiaCliente);
			
			
		this.gridBagConstraintsEstadoGarantiaCliente = new GridBagConstraints();
		this.gridBagConstraintsEstadoGarantiaCliente.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoGarantiaCliente.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosEstadoGarantiaCliente, this.gridBagConstraintsEstadoGarantiaCliente);
		
			
		this.gridBagConstraintsEstadoGarantiaCliente = new GridBagConstraints();
		this.gridBagConstraintsEstadoGarantiaCliente.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsEstadoGarantiaCliente.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesEstadoGarantiaCliente, this.gridBagConstraintsEstadoGarantiaCliente);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralEstadoGarantiaCliente;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoEstadoGarantiaCliente() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoEstadoGarantiaCliente = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoEstadoGarantiaCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoEstadoGarantiaCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoEstadoGarantiaCliente.setName("jPanelReporteDinamicoEstadoGarantiaCliente"); 
		
		this.jPanelReporteDinamicoEstadoGarantiaCliente.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoEstadoGarantiaCliente.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoEstadoGarantiaCliente.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoEstadoGarantiaCliente.setLayout(gridaBagLayoutReporteDinamicoEstadoGarantiaCliente);
		
		
		this.jInternalFrameReporteDinamicoEstadoGarantiaCliente= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoEstadoGarantiaCliente = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteEstadoGarantiaCliente= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoEstadoGarantiaCliente.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoEstadoGarantiaCliente.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoEstadoGarantiaCliente.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoEstadoGarantiaCliente.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoEstadoGarantiaCliente.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoEstadoGarantiaCliente.setResizable(true);
	    this.jInternalFrameReporteDinamicoEstadoGarantiaCliente.setClosable(true);
	    this.jInternalFrameReporteDinamicoEstadoGarantiaCliente.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoEstadoGarantiaCliente.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoEstadoGarantiaCliente.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoEstadoGarantiaCliente.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoEstadoGarantiaCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Garantia Clientes"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteEstadoGarantiaCliente = new JLabelMe();

		this.jLabelColumnasSelectReporteEstadoGarantiaCliente.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteEstadoGarantiaCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteEstadoGarantiaCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteEstadoGarantiaCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsEstadoGarantiaCliente = new GridBagConstraints();
		this.gridBagConstraintsEstadoGarantiaCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoGarantiaCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoGarantiaCliente.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoEstadoGarantiaCliente.add(this.jLabelColumnasSelectReporteEstadoGarantiaCliente, this.gridBagConstraintsEstadoGarantiaCliente);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteEstadoGarantiaCliente = new JList<Reporte>();
		this.jListColumnasSelectReporteEstadoGarantiaCliente.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteEstadoGarantiaCliente.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteEstadoGarantiaCliente.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteEstadoGarantiaCliente.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteEstadoGarantiaCliente.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteEstadoGarantiaCliente=new JScrollPane(this.jListColumnasSelectReporteEstadoGarantiaCliente);
			
			this.jScrollColumnasSelectReporteEstadoGarantiaCliente.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteEstadoGarantiaCliente.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteEstadoGarantiaCliente.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteEstadoGarantiaCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsEstadoGarantiaCliente = new GridBagConstraints();
		this.gridBagConstraintsEstadoGarantiaCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoGarantiaCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoGarantiaCliente.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoEstadoGarantiaCliente.add(this.jListColumnasSelectReporteEstadoGarantiaCliente, this.gridBagConstraintsEstadoGarantiaCliente);
		this.jPanelReporteDinamicoEstadoGarantiaCliente.add(this.jScrollColumnasSelectReporteEstadoGarantiaCliente, this.gridBagConstraintsEstadoGarantiaCliente);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteEstadoGarantiaCliente = new JLabelMe();

		this.jLabelRelacionesSelectReporteEstadoGarantiaCliente.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteEstadoGarantiaCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteEstadoGarantiaCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteEstadoGarantiaCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsEstadoGarantiaCliente = new GridBagConstraints();
		this.gridBagConstraintsEstadoGarantiaCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoGarantiaCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoGarantiaCliente.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoEstadoGarantiaCliente.add(this.jLabelRelacionesSelectReporteEstadoGarantiaCliente, this.gridBagConstraintsEstadoGarantiaCliente);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteEstadoGarantiaCliente = new JList<Reporte>();
		this.jListRelacionesSelectReporteEstadoGarantiaCliente.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteEstadoGarantiaCliente.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteEstadoGarantiaCliente.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteEstadoGarantiaCliente.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteEstadoGarantiaCliente.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteEstadoGarantiaCliente=new JScrollPane(this.jListRelacionesSelectReporteEstadoGarantiaCliente);
			
			this.jScrollRelacionesSelectReporteEstadoGarantiaCliente.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteEstadoGarantiaCliente.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteEstadoGarantiaCliente.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteEstadoGarantiaCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsEstadoGarantiaCliente = new GridBagConstraints();
		this.gridBagConstraintsEstadoGarantiaCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoGarantiaCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoGarantiaCliente.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoEstadoGarantiaCliente.add(this.jListRelacionesSelectReporteEstadoGarantiaCliente, this.gridBagConstraintsEstadoGarantiaCliente);
		this.jPanelReporteDinamicoEstadoGarantiaCliente.add(this.jScrollRelacionesSelectReporteEstadoGarantiaCliente, this.gridBagConstraintsEstadoGarantiaCliente);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoEstadoGarantiaCliente = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoEstadoGarantiaCliente = new JComboBoxMe();
		this.jListColumnasValoresGraficoEstadoGarantiaCliente = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoEstadoGarantiaCliente = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoEstadoGarantiaCliente.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoEstadoGarantiaCliente.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoEstadoGarantiaCliente.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoEstadoGarantiaCliente.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoEstadoGarantiaCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoEstadoGarantiaCliente = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoEstadoGarantiaCliente.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoEstadoGarantiaCliente.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoEstadoGarantiaCliente.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoEstadoGarantiaCliente.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoEstadoGarantiaCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoEstadoGarantiaCliente = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoEstadoGarantiaCliente.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoEstadoGarantiaCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoEstadoGarantiaCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoEstadoGarantiaCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsEstadoGarantiaCliente = new GridBagConstraints();
		this.gridBagConstraintsEstadoGarantiaCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoGarantiaCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoGarantiaCliente.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEstadoGarantiaCliente.add(this.jLabelGenerarExcelReporteDinamicoEstadoGarantiaCliente, this.gridBagConstraintsEstadoGarantiaCliente);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoEstadoGarantiaCliente = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoEstadoGarantiaCliente.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoEstadoGarantiaCliente,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoEstadoGarantiaCliente.setToolTipText("Generar EXCEL"+" "+EstadoGarantiaClienteConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsEstadoGarantiaCliente = new GridBagConstraints();
		//this.gridBagConstraintsEstadoGarantiaCliente.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsEstadoGarantiaCliente.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsEstadoGarantiaCliente.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoEstadoGarantiaCliente.add(this.jButtonGenerarExcelReporteDinamicoEstadoGarantiaCliente, this.gridBagConstraintsEstadoGarantiaCliente);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsEstadoGarantiaCliente = new GridBagConstraints();
		this.gridBagConstraintsEstadoGarantiaCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoGarantiaCliente.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEstadoGarantiaCliente.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEstadoGarantiaCliente.add(this.jComboBoxTiposReportesDinamicoEstadoGarantiaCliente, this.gridBagConstraintsEstadoGarantiaCliente);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoEstadoGarantiaCliente = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoEstadoGarantiaCliente.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoEstadoGarantiaCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoEstadoGarantiaCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoEstadoGarantiaCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsEstadoGarantiaCliente = new GridBagConstraints();
		this.gridBagConstraintsEstadoGarantiaCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoGarantiaCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoGarantiaCliente.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEstadoGarantiaCliente.add(this.jLabelTiposArchivoReporteDinamicoEstadoGarantiaCliente, this.gridBagConstraintsEstadoGarantiaCliente);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsEstadoGarantiaCliente = new GridBagConstraints();
		this.gridBagConstraintsEstadoGarantiaCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoGarantiaCliente.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEstadoGarantiaCliente.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEstadoGarantiaCliente.add(this.jComboBoxTiposArchivosReportesDinamicoEstadoGarantiaCliente, this.gridBagConstraintsEstadoGarantiaCliente);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoEstadoGarantiaCliente = new JButtonMe();
		this.jButtonGenerarReporteDinamicoEstadoGarantiaCliente.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoEstadoGarantiaCliente,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoEstadoGarantiaCliente.setToolTipText("Generar"+" "+EstadoGarantiaClienteConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsEstadoGarantiaCliente = new GridBagConstraints();
		this.gridBagConstraintsEstadoGarantiaCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoGarantiaCliente.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEstadoGarantiaCliente.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEstadoGarantiaCliente.add(this.jButtonGenerarReporteDinamicoEstadoGarantiaCliente, this.gridBagConstraintsEstadoGarantiaCliente);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoEstadoGarantiaCliente = new JButtonMe();
		this.jButtonCerrarReporteDinamicoEstadoGarantiaCliente.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoEstadoGarantiaCliente,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoEstadoGarantiaCliente.setToolTipText("Cancelar"+" "+EstadoGarantiaClienteConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsEstadoGarantiaCliente = new GridBagConstraints();
		this.gridBagConstraintsEstadoGarantiaCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoGarantiaCliente.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEstadoGarantiaCliente.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEstadoGarantiaCliente.add(this.jButtonCerrarReporteDinamicoEstadoGarantiaCliente, this.gridBagConstraintsEstadoGarantiaCliente);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalEstadoGarantiaCliente = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoEstadoGarantiaCliente= new JScrollPane(jPanelReporteDinamicoEstadoGarantiaCliente,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoEstadoGarantiaCliente.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoEstadoGarantiaCliente.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoEstadoGarantiaCliente.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoEstadoGarantiaCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Garantia Clientes"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsEstadoGarantiaCliente = new GridBagConstraints();
		this.gridBagConstraintsEstadoGarantiaCliente.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsEstadoGarantiaCliente.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsEstadoGarantiaCliente.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoEstadoGarantiaCliente.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoEstadoGarantiaCliente.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalEstadoGarantiaCliente);
		this.jInternalFrameReporteDinamicoEstadoGarantiaCliente.getContentPane().add(this.jScrollPanelReporteDinamicoEstadoGarantiaCliente, this.gridBagConstraintsEstadoGarantiaCliente);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionEstadoGarantiaCliente() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionEstadoGarantiaCliente = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionEstadoGarantiaCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionEstadoGarantiaCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionEstadoGarantiaCliente.setName("jPanelImportacionEstadoGarantiaCliente"); 
		
		this.jPanelImportacionEstadoGarantiaCliente.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionEstadoGarantiaCliente.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionEstadoGarantiaCliente.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionEstadoGarantiaCliente.setLayout(gridaBagLayoutImportacionEstadoGarantiaCliente);
		
		
		this.jInternalFrameImportacionEstadoGarantiaCliente= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionEstadoGarantiaCliente= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionEstadoGarantiaCliente = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteEstadoGarantiaCliente= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionEstadoGarantiaCliente.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionEstadoGarantiaCliente.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionEstadoGarantiaCliente.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionEstadoGarantiaCliente.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionEstadoGarantiaCliente.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionEstadoGarantiaCliente.setResizable(true);
	    this.jInternalFrameImportacionEstadoGarantiaCliente.setClosable(true);
	    this.jInternalFrameImportacionEstadoGarantiaCliente.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionEstadoGarantiaCliente.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionEstadoGarantiaCliente.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionEstadoGarantiaCliente.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionEstadoGarantiaCliente.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionEstadoGarantiaCliente.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionEstadoGarantiaCliente.setResizable(true);
	    this.jInternalFrameImportacionEstadoGarantiaCliente.setClosable(true);
	    this.jInternalFrameImportacionEstadoGarantiaCliente.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionEstadoGarantiaCliente.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionEstadoGarantiaCliente.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionEstadoGarantiaCliente.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionEstadoGarantiaCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Garantia Clientes"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionEstadoGarantiaCliente = new JLabelMe();

		this.jLabelArchivoImportacionEstadoGarantiaCliente.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionEstadoGarantiaCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionEstadoGarantiaCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionEstadoGarantiaCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsEstadoGarantiaCliente = new GridBagConstraints();
		this.gridBagConstraintsEstadoGarantiaCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoGarantiaCliente.gridy = iPosYImportacion;		
		this.gridBagConstraintsEstadoGarantiaCliente.gridx = iPosXImportacion++;
			
		this.jPanelImportacionEstadoGarantiaCliente.add(this.jLabelArchivoImportacionEstadoGarantiaCliente, this.gridBagConstraintsEstadoGarantiaCliente);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionEstadoGarantiaCliente = new JFileChooser();		
		this.jFileChooserImportacionEstadoGarantiaCliente.setToolTipText("ESCOGER ARCHIVO"+" "+EstadoGarantiaClienteConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionEstadoGarantiaCliente = new JButtonMe();
		this.jButtonAbrirImportacionEstadoGarantiaCliente.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionEstadoGarantiaCliente,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionEstadoGarantiaCliente.setToolTipText("Generar"+" "+EstadoGarantiaClienteConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsEstadoGarantiaCliente = new GridBagConstraints();
		this.gridBagConstraintsEstadoGarantiaCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoGarantiaCliente.gridy = iPosYImportacion;
		this.gridBagConstraintsEstadoGarantiaCliente.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEstadoGarantiaCliente.add(this.jButtonAbrirImportacionEstadoGarantiaCliente, this.gridBagConstraintsEstadoGarantiaCliente);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionEstadoGarantiaCliente = new JLabelMe();

		this.jLabelPathArchivoImportacionEstadoGarantiaCliente.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionEstadoGarantiaCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionEstadoGarantiaCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionEstadoGarantiaCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsEstadoGarantiaCliente = new GridBagConstraints();
		this.gridBagConstraintsEstadoGarantiaCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoGarantiaCliente.gridy = iPosYImportacion;		
		this.gridBagConstraintsEstadoGarantiaCliente.gridx = iPosXImportacion++;
			
		this.jPanelImportacionEstadoGarantiaCliente.add(this.jLabelPathArchivoImportacionEstadoGarantiaCliente, this.gridBagConstraintsEstadoGarantiaCliente);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionEstadoGarantiaCliente=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionEstadoGarantiaCliente.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionEstadoGarantiaCliente.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionEstadoGarantiaCliente.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsEstadoGarantiaCliente = new GridBagConstraints();
		this.gridBagConstraintsEstadoGarantiaCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoGarantiaCliente.gridy = iPosYImportacion;
		this.gridBagConstraintsEstadoGarantiaCliente.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEstadoGarantiaCliente.add(this.jTextFieldPathArchivoImportacionEstadoGarantiaCliente, this.gridBagConstraintsEstadoGarantiaCliente);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionEstadoGarantiaCliente = new JButtonMe();
		this.jButtonGenerarImportacionEstadoGarantiaCliente.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionEstadoGarantiaCliente,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionEstadoGarantiaCliente.setToolTipText("Generar"+" "+EstadoGarantiaClienteConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsEstadoGarantiaCliente = new GridBagConstraints();
		this.gridBagConstraintsEstadoGarantiaCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoGarantiaCliente.gridy = iPosYImportacion;
		this.gridBagConstraintsEstadoGarantiaCliente.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEstadoGarantiaCliente.add(this.jButtonGenerarImportacionEstadoGarantiaCliente, this.gridBagConstraintsEstadoGarantiaCliente);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionEstadoGarantiaCliente = new JButtonMe();
		this.jButtonCerrarImportacionEstadoGarantiaCliente.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionEstadoGarantiaCliente,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionEstadoGarantiaCliente.setToolTipText("Cancelar"+" "+EstadoGarantiaClienteConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsEstadoGarantiaCliente = new GridBagConstraints();
		this.gridBagConstraintsEstadoGarantiaCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoGarantiaCliente.gridy = iPosYImportacion;
		this.gridBagConstraintsEstadoGarantiaCliente.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEstadoGarantiaCliente.add(this.jButtonCerrarImportacionEstadoGarantiaCliente, this.gridBagConstraintsEstadoGarantiaCliente);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalEstadoGarantiaCliente = new GridBagLayout();
		
		this.jScrollPanelImportacionEstadoGarantiaCliente= new JScrollPane(jPanelImportacionEstadoGarantiaCliente,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsEstadoGarantiaCliente = new GridBagConstraints();
		this.gridBagConstraintsEstadoGarantiaCliente.gridy =iPosYImportacion;
		this.gridBagConstraintsEstadoGarantiaCliente.gridx =iPosXImportacion;
		this.gridBagConstraintsEstadoGarantiaCliente.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionEstadoGarantiaCliente.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionEstadoGarantiaCliente.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalEstadoGarantiaCliente);
		this.jInternalFrameImportacionEstadoGarantiaCliente.getContentPane().add(this.jScrollPanelImportacionEstadoGarantiaCliente, this.gridBagConstraintsEstadoGarantiaCliente);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByEstadoGarantiaCliente(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByEstadoGarantiaCliente = new JButtonMe();
			this.jButtonAbrirOrderByEstadoGarantiaCliente.setText("Orden");
			this.jButtonAbrirOrderByEstadoGarantiaCliente.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByEstadoGarantiaCliente,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByEstadoGarantiaCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByEstadoGarantiaCliente";
			inputMap = this.jButtonAbrirOrderByEstadoGarantiaCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByEstadoGarantiaCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByEstadoGarantiaCliente"));
		
		
			GridBagLayout gridaBagLayoutOrderByEstadoGarantiaCliente = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByEstadoGarantiaCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByEstadoGarantiaCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByEstadoGarantiaCliente.setName("jPanelOrderByEstadoGarantiaCliente"); 
			
			this.jPanelOrderByEstadoGarantiaCliente.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByEstadoGarantiaCliente.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByEstadoGarantiaCliente.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByEstadoGarantiaCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByEstadoGarantiaCliente.setLayout(gridaBagLayoutOrderByEstadoGarantiaCliente);
			
			
			this.jTableDatosEstadoGarantiaClienteOrderBy = new JTableMe();        
			this.jTableDatosEstadoGarantiaClienteOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosEstadoGarantiaClienteOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosEstadoGarantiaClienteOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosEstadoGarantiaClienteOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosEstadoGarantiaClienteOrderBy.setViewportView(this.jTableDatosEstadoGarantiaClienteOrderBy);
			this.jTableDatosEstadoGarantiaClienteOrderBy.setFillsViewportHeight(true);
			this.jTableDatosEstadoGarantiaClienteOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByEstadoGarantiaCliente= new OrderByJInternalFrame();
			this.jInternalFrameOrderByEstadoGarantiaCliente= new OrderByJInternalFrame();
			this.jScrollPanelOrderByEstadoGarantiaCliente = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteEstadoGarantiaCliente= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByEstadoGarantiaCliente.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByEstadoGarantiaCliente.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByEstadoGarantiaCliente.setTitle("Orden");
			this.jInternalFrameOrderByEstadoGarantiaCliente.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByEstadoGarantiaCliente.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByEstadoGarantiaCliente.setResizable(true);
			this.jInternalFrameOrderByEstadoGarantiaCliente.setClosable(true);
			this.jInternalFrameOrderByEstadoGarantiaCliente.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByEstadoGarantiaCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByEstadoGarantiaCliente.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByEstadoGarantiaCliente.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByEstadoGarantiaCliente.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByEstadoGarantiaCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByEstadoGarantiaCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Garantia Clientes"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsEstadoGarantiaCliente = new GridBagConstraints();
			this.gridBagConstraintsEstadoGarantiaCliente.gridy =iPosYOrderBy++;
			this.gridBagConstraintsEstadoGarantiaCliente.gridx =iPosXOrderBy;
			this.gridBagConstraintsEstadoGarantiaCliente.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsEstadoGarantiaCliente.ipady =150;
				
			this.jPanelOrderByEstadoGarantiaCliente.add(jScrollPanelDatosEstadoGarantiaClienteOrderBy, this.gridBagConstraintsEstadoGarantiaCliente);//this.jTableDatosEstadoGarantiaClienteTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByEstadoGarantiaCliente = new JButtonMe();
			this.jButtonCerrarOrderByEstadoGarantiaCliente.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByEstadoGarantiaCliente,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByEstadoGarantiaCliente.setToolTipText("Cancelar"+" "+EstadoGarantiaClienteConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByEstadoGarantiaCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsEstadoGarantiaCliente = new GridBagConstraints();
			this.gridBagConstraintsEstadoGarantiaCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoGarantiaCliente.gridy = iPosYOrderBy++;
			this.gridBagConstraintsEstadoGarantiaCliente.gridx = iPosXOrderBy;
									
			this.jPanelOrderByEstadoGarantiaCliente.add(this.jButtonCerrarOrderByEstadoGarantiaCliente, this.gridBagConstraintsEstadoGarantiaCliente);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalEstadoGarantiaCliente = new GridBagLayout();
			
			this.jScrollPanelOrderByEstadoGarantiaCliente= new JScrollPane(jPanelOrderByEstadoGarantiaCliente,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsEstadoGarantiaCliente = new GridBagConstraints();
			this.gridBagConstraintsEstadoGarantiaCliente.gridy =iPosYOrderBy;
			this.gridBagConstraintsEstadoGarantiaCliente.gridx =iPosXOrderBy;
			this.gridBagConstraintsEstadoGarantiaCliente.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByEstadoGarantiaCliente.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByEstadoGarantiaCliente.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalEstadoGarantiaCliente);
			
			this.jInternalFrameOrderByEstadoGarantiaCliente.getContentPane().add(this.jScrollPanelOrderByEstadoGarantiaCliente, this.gridBagConstraintsEstadoGarantiaCliente);			
		
		} else {
			this.jButtonAbrirOrderByEstadoGarantiaCliente = new JButtonMe();
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
			&& this.estadogarantiaclienteSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosEstadoGarantiaCliente.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosEstadoGarantiaCliente.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosEstadoGarantiaCliente.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosEstadoGarantiaCliente.getRowHeight();//EstadoGarantiaClienteConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.estadogarantiaclienteSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > EstadoGarantiaClienteConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaEstadoGarantiaCliente.isSelected()) {
					iHeightTable=EstadoGarantiaClienteConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < EstadoGarantiaClienteConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=EstadoGarantiaClienteConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > EstadoGarantiaClienteConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaEstadoGarantiaCliente.isSelected()) {
					iHeightTable=EstadoGarantiaClienteConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < EstadoGarantiaClienteConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=EstadoGarantiaClienteConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosEstadoGarantiaCliente.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosEstadoGarantiaCliente.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosEstadoGarantiaCliente.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosEstadoGarantiaCliente.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosEstadoGarantiaCliente.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosEstadoGarantiaCliente.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByEstadoGarantiaCliente!=null && this.jInternalFrameOrderByEstadoGarantiaCliente.getjTableDatosOrderBy()!=null) {
			//if(!this.estadogarantiaclienteSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByEstadoGarantiaCliente.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByEstadoGarantiaCliente.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByEstadoGarantiaCliente.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByEstadoGarantiaCliente.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByEstadoGarantiaCliente.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByEstadoGarantiaCliente.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByEstadoGarantiaCliente.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosEstadoGarantiaCliente.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosEstadoGarantiaCliente.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosEstadoGarantiaCliente.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=estadogarantiaclienteLogic.getEstadoGarantiaClientes().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=estadogarantiaclientes.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<EstadoGarantiaCliente> TraerEstadoGarantiaClienteBeans(List<EstadoGarantiaCliente> estadogarantiaclientes,ArrayList<Classe> classes)throws Exception {
		try {
			for(EstadoGarantiaCliente estadogarantiacliente:estadogarantiaclientes) {
					
				if(!(EstadoGarantiaClienteConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || EstadoGarantiaClienteConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					estadogarantiacliente.setsDetalleGeneralEntityReporte(EstadoGarantiaClienteConstantesFunciones.getEstadoGarantiaClienteDescripcion(estadogarantiacliente));
										
						
					
					

					if(estadogarantiacliente.getGarantiaClientes()!=null && Funciones.existeClass(classes,GarantiaCliente.class)) {
						try{estadogarantiacliente.setgarantiaclientesDescripcionReporte(new JRBeanCollectionDataSource(GarantiaClienteJInternalFrame.TraerGarantiaClienteBeans(estadogarantiacliente.getGarantiaClientes(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//estadogarantiacliente.setsDetalleGeneralEntityReporte(estadogarantiacliente.getsDetalleGeneralEntityReporte());
										
				}
				
				//estadogarantiaclientebeans.add(estadogarantiaclientebean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return estadogarantiaclientes;
    }
	//PARA REPORTES FIN
}
