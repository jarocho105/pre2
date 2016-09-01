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
import com.bydan.erp.cartera.util.EstadoPoliticasClienteConstantesFunciones;

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
public class EstadoPoliticasClienteJInternalFrame extends EstadoPoliticasClienteBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarEstadoPoliticasCliente;
	
	protected JMenuBar jmenuBarEstadoPoliticasCliente;
	
	protected JMenu jmenuEstadoPoliticasCliente;
	protected JMenu jmenuDatosEstadoPoliticasCliente;
	protected JMenu jmenuArchivoEstadoPoliticasCliente;
	protected JMenu jmenuAccionesEstadoPoliticasCliente;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosEstadoPoliticasCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutEstadoPoliticasCliente;	
	protected GridBagConstraints gridBagConstraintsEstadoPoliticasCliente;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public EstadoPoliticasClienteDetalleFormJInternalFrame jInternalFrameDetalleFormEstadoPoliticasCliente;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoEstadoPoliticasCliente;	
	protected ImportacionJInternalFrame jInternalFrameImportacionEstadoPoliticasCliente;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public EstadoPoliticasClienteSessionBean estadopoliticasclienteSessionBean;
		
	
	
	
	//protected JDesktopPane jDesktopPane;
	public List<EstadoPoliticasCliente> estadopoliticasclientes;		
	public List<EstadoPoliticasCliente> estadopoliticasclientesEliminados;	
	public List<EstadoPoliticasCliente> estadopoliticasclientesAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByEstadoPoliticasCliente;		
	protected JButton jButtonAbrirOrderByEstadoPoliticasCliente;
	
	
	//protected JPanel jPanelOrderByEstadoPoliticasCliente;
	//public JScrollPane jScrollPanelOrderByEstadoPoliticasCliente;	
	//protected JButton jButtonCerrarOrderByEstadoPoliticasCliente;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public EstadoPoliticasClienteLogic estadopoliticasclienteLogic;
	
	
	
	public JScrollPane jScrollPanelDatosEstadoPoliticasCliente;
	public JScrollPane jScrollPanelDatosEdicionEstadoPoliticasCliente;
	public JScrollPane jScrollPanelDatosGeneralEstadoPoliticasCliente;
    
	
	
	//public JScrollPane jScrollPanelDatosEstadoPoliticasClienteOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoEstadoPoliticasCliente;
	//public JScrollPane jScrollPanelImportacionEstadoPoliticasCliente;
	
	
	
	protected JPanel jPanelAccionesEstadoPoliticasCliente;
	
    protected JPanel jPanelPaginacionEstadoPoliticasCliente;
    protected JPanel jPanelParametrosReportesEstadoPoliticasCliente;
	protected JPanel jPanelParametrosReportesAccionesEstadoPoliticasCliente;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1EstadoPoliticasCliente;
	protected JPanel jPanelParametrosAuxiliar2EstadoPoliticasCliente;
	protected JPanel jPanelParametrosAuxiliar3EstadoPoliticasCliente;
	protected JPanel jPanelParametrosAuxiliar4EstadoPoliticasCliente;
	//protected JPanel jPanelParametrosAuxiliar5EstadoPoliticasCliente;
	
	
	
	//protected JPanel jPanelReporteDinamicoEstadoPoliticasCliente;
	//protected JPanel jPanelImportacionEstadoPoliticasCliente;
	
	
	public JTable jTableDatosEstadoPoliticasCliente;
	
	
	
	//public JTable jTableDatosEstadoPoliticasClienteOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoEstadoPoliticasCliente;
	protected JButton jButtonDuplicarEstadoPoliticasCliente;
	protected JButton jButtonCopiarEstadoPoliticasCliente;
	protected JButton jButtonVerFormEstadoPoliticasCliente;
	protected JButton jButtonNuevoRelacionesEstadoPoliticasCliente;
	protected JButton jButtonModificarEstadoPoliticasCliente;
	
    protected JButton jButtonGuardarCambiosTablaEstadoPoliticasCliente;
	protected JButton jButtonCerrarEstadoPoliticasCliente;
	
	
	protected JButton jButtonRecargarInformacionEstadoPoliticasCliente;
	protected JButton jButtonProcesarInformacionEstadoPoliticasCliente;
	
	
	protected JButton jButtonAnterioresEstadoPoliticasCliente;
	protected JButton jButtonSiguientesEstadoPoliticasCliente;
	protected JButton jButtonNuevoGuardarCambiosEstadoPoliticasCliente;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoEstadoPoliticasCliente;
	//protected JButton jButtonCerrarReporteDinamicoEstadoPoliticasCliente;
	//protected JButton jButtonGenerarExcelReporteDinamicoEstadoPoliticasCliente;	
	
	
	
	//protected JButton jButtonAbrirImportacionEstadoPoliticasCliente;
	//protected JButton jButtonGenerarImportacionEstadoPoliticasCliente;
	//protected JButton jButtonCerrarImportacionEstadoPoliticasCliente;
	//protected JFileChooser jFileChooserImportacionEstadoPoliticasCliente;
	//protected File fileImportacionEstadoPoliticasCliente;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarEstadoPoliticasCliente;
	protected JButton jButtonDuplicarToolBarEstadoPoliticasCliente;
	protected JButton jButtonNuevoRelacionesToolBarEstadoPoliticasCliente;
	
	
	public JButton jButtonGuardarCambiosToolBarEstadoPoliticasCliente;
	protected JButton jButtonCopiarToolBarEstadoPoliticasCliente;
	protected JButton jButtonVerFormToolBarEstadoPoliticasCliente;
	public JButton jButtonGuardarCambiosTablaToolBarEstadoPoliticasCliente;
	protected JButton jButtonMostrarOcultarTablaToolBarEstadoPoliticasCliente;
	protected JButton jButtonCerrarToolBarEstadoPoliticasCliente;
	
	protected JButton jButtonRecargarInformacionToolBarEstadoPoliticasCliente;
	protected JButton jButtonProcesarInformacionToolBarEstadoPoliticasCliente;
	protected JButton jButtonAnterioresToolBarEstadoPoliticasCliente;
	protected JButton jButtonSiguientesToolBarEstadoPoliticasCliente;
	protected JButton jButtonNuevoGuardarCambiosToolBarEstadoPoliticasCliente;
	protected JButton jButtonAbrirOrderByToolBarEstadoPoliticasCliente;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoEstadoPoliticasCliente;
	protected JMenuItem jMenuItemDuplicarEstadoPoliticasCliente;
	protected JMenuItem jMenuItemNuevoRelacionesEstadoPoliticasCliente;
	
	
	protected JMenuItem jMenuItemGuardarCambiosEstadoPoliticasCliente;
	protected JMenuItem jMenuItemCopiarEstadoPoliticasCliente;
	protected JMenuItem jMenuItemVerFormEstadoPoliticasCliente;
	protected JMenuItem jMenuItemGuardarCambiosTablaEstadoPoliticasCliente;
	protected JMenuItem jMenuItemCerrarEstadoPoliticasCliente;
	protected JMenuItem jMenuItemDetalleCerrarEstadoPoliticasCliente;
	protected JMenuItem jMenuItemDetalleAbrirOrderByEstadoPoliticasCliente;
	protected JMenuItem jMenuItemDetalleMostarOcultarEstadoPoliticasCliente;
	
	protected JMenuItem jMenuItemRecargarInformacionEstadoPoliticasCliente;
	protected JMenuItem jMenuItemProcesarInformacionEstadoPoliticasCliente;
	protected JMenuItem jMenuItemAnterioresEstadoPoliticasCliente;
	protected JMenuItem jMenuItemSiguientesEstadoPoliticasCliente;
	protected JMenuItem jMenuItemNuevoGuardarCambiosEstadoPoliticasCliente;
	protected JMenuItem jMenuItemAbrirOrderByEstadoPoliticasCliente;
	protected JMenuItem jMenuItemMostrarOcultarEstadoPoliticasCliente;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesEstadoPoliticasCliente;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosEstadoPoliticasCliente;
	protected JCheckBox jCheckBoxSeleccionadosEstadoPoliticasCliente;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaEstadoPoliticasCliente;
	protected JCheckBox jCheckBoxConGraficoReporteEstadoPoliticasCliente;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesEstadoPoliticasCliente;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesEstadoPoliticasCliente;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoEstadoPoliticasCliente;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoEstadoPoliticasCliente;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesEstadoPoliticasCliente;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionEstadoPoliticasCliente;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesEstadoPoliticasCliente;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesEstadoPoliticasCliente;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarEstadoPoliticasCliente;
	protected JTextField jTextFieldValorCampoGeneralEstadoPoliticasCliente;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteEstadoPoliticasCliente;
	//public JList<Reporte> jListColumnasSelectReporteEstadoPoliticasCliente;
	//public JScrollPane jScrollColumnasSelectReporteEstadoPoliticasCliente;
	
	//public JLabel jLabelRelacionesSelectReporteEstadoPoliticasCliente;
	//public JList<Reporte> jListRelacionesSelectReporteEstadoPoliticasCliente;
	//public JScrollPane jScrollRelacionesSelectReporteEstadoPoliticasCliente;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoEstadoPoliticasCliente;
	//protected JCheckBox jCheckBoxConGraficoDinamicoEstadoPoliticasCliente;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoEstadoPoliticasCliente;
	//public JLabel jLabelTiposArchivoReporteDinamicoEstadoPoliticasCliente;
	
		
	//public JLabel jLabelArchivoImportacionEstadoPoliticasCliente;	
	//public JLabel jLabelPathArchivoImportacionEstadoPoliticasCliente;
	//protected JTextField jTextFieldPathArchivoImportacionEstadoPoliticasCliente;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoEstadoPoliticasCliente;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoEstadoPoliticasCliente;
	
	//public JLabel jLabelColumnaCategoriaValorEstadoPoliticasCliente;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorEstadoPoliticasCliente;
	
	//public JLabel jLabelColumnasValoresGraficoEstadoPoliticasCliente;
	//public JList<Reporte> jListColumnasValoresGraficoEstadoPoliticasCliente;
	//public JScrollPane jScrollColumnasValoresGraficoEstadoPoliticasCliente;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoEstadoPoliticasCliente;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoEstadoPoliticasCliente;	
	
	
	
	
	
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
	public EstadoPoliticasClienteJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("EstadoPoliticasCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoPoliticasClienteJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EstadoPoliticasCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoPoliticasClienteJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EstadoPoliticasCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoPoliticasClienteJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("EstadoPoliticasCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionEstadoPoliticasCliente)	{
		this.jButtonRecargarInformacionEstadoPoliticasCliente = jButtonRecargarInformacionEstadoPoliticasCliente;
	}
	
	public JButton getjButtonProcesarInformacionEstadoPoliticasCliente() {
		return this.jButtonProcesarInformacionEstadoPoliticasCliente;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionEstadoPoliticasCliente)	{
		this.jButtonProcesarInformacionEstadoPoliticasCliente = jButtonProcesarInformacionEstadoPoliticasCliente;
	}
	
	
	public JButton getjButtonRecargarInformacionEstadoPoliticasCliente() {
		return this.jButtonRecargarInformacionEstadoPoliticasCliente;
	}
	
	
	public List<EstadoPoliticasCliente> getestadopoliticasclientes() {
		return this.estadopoliticasclientes;
	}

	public void setestadopoliticasclientes(List<EstadoPoliticasCliente> estadopoliticasclientes) {
		this.estadopoliticasclientes = estadopoliticasclientes;
	}
	
	public List<EstadoPoliticasCliente> getestadopoliticasclientesAux() {
		return this.estadopoliticasclientesAux;
	}

	public void setestadopoliticasclientesAux(List<EstadoPoliticasCliente> estadopoliticasclientesAux) {
		this.estadopoliticasclientesAux = estadopoliticasclientesAux;
	}
	
	public List<EstadoPoliticasCliente> getestadopoliticasclientesEliminados() {
		return this.estadopoliticasclientesEliminados;
	}

	public void setEstadoPoliticasClientesEliminados(List<EstadoPoliticasCliente> estadopoliticasclientesEliminados) {
		this.estadopoliticasclientesEliminados = estadopoliticasclientesEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarEstadoPoliticasCliente() {
		return jComboBoxTiposSeleccionarEstadoPoliticasCliente;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarEstadoPoliticasCliente(
			JComboBox jComboBoxTiposSeleccionarEstadoPoliticasCliente) {
		this.jComboBoxTiposSeleccionarEstadoPoliticasCliente = jComboBoxTiposSeleccionarEstadoPoliticasCliente;
	}
	
	public void setBorderResaltarTiposSeleccionarEstadoPoliticasCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarEstadoPoliticasCliente.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarEstadoPoliticasCliente .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralEstadoPoliticasCliente() {
		return jTextFieldValorCampoGeneralEstadoPoliticasCliente;
	}

	public void setjTextFieldValorCampoGeneralEstadoPoliticasCliente(
			JTextField jTextFieldValorCampoGeneralEstadoPoliticasCliente) {
		this.jTextFieldValorCampoGeneralEstadoPoliticasCliente = jTextFieldValorCampoGeneralEstadoPoliticasCliente;
	}

	public void setBorderResaltarValorCampoGeneralEstadoPoliticasCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoPoliticasCliente.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralEstadoPoliticasCliente .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosEstadoPoliticasCliente() {
		return this.jCheckBoxSeleccionarTodosEstadoPoliticasCliente;
	}

	public void setjCheckBoxSeleccionarTodosEstadoPoliticasCliente(
			JCheckBox jCheckBoxSeleccionarTodosEstadoPoliticasCliente) {
		this.jCheckBoxSeleccionarTodosEstadoPoliticasCliente = jCheckBoxSeleccionarTodosEstadoPoliticasCliente;
	}

	public void setBorderResaltarSeleccionarTodosEstadoPoliticasCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoPoliticasCliente.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosEstadoPoliticasCliente .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosEstadoPoliticasCliente() {
		return this.jCheckBoxSeleccionadosEstadoPoliticasCliente;
	}

	public void setjCheckBoxSeleccionadosEstadoPoliticasCliente(
			JCheckBox jCheckBoxSeleccionadosEstadoPoliticasCliente) {
		this.jCheckBoxSeleccionadosEstadoPoliticasCliente = jCheckBoxSeleccionadosEstadoPoliticasCliente;
	}
	
	public void setBorderResaltarSeleccionadosEstadoPoliticasCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoPoliticasCliente.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosEstadoPoliticasCliente .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesEstadoPoliticasCliente() {
		return this.jComboBoxTiposArchivosReportesEstadoPoliticasCliente;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesEstadoPoliticasCliente(
			JComboBox jComboBoxTiposArchivosReportesEstadoPoliticasCliente) {
		this.jComboBoxTiposArchivosReportesEstadoPoliticasCliente = jComboBoxTiposArchivosReportesEstadoPoliticasCliente;
	}

	public void setBorderResaltarTiposArchivosReportesEstadoPoliticasCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoPoliticasCliente.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesEstadoPoliticasCliente .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesEstadoPoliticasCliente() {
		return this.jComboBoxTiposReportesEstadoPoliticasCliente;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesEstadoPoliticasCliente(
			JComboBox jComboBoxTiposReportesEstadoPoliticasCliente) {
		this.jComboBoxTiposReportesEstadoPoliticasCliente = jComboBoxTiposReportesEstadoPoliticasCliente;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoEstadoPoliticasCliente() {
	//	return jComboBoxTiposReportesDinamicoEstadoPoliticasCliente;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoEstadoPoliticasCliente(
	//		JComboBox jComboBoxTiposReportesDinamicoEstadoPoliticasCliente) {
	//	this.jComboBoxTiposReportesDinamicoEstadoPoliticasCliente = jComboBoxTiposReportesDinamicoEstadoPoliticasCliente;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoEstadoPoliticasCliente() {
	//	return jComboBoxTiposArchivosReportesDinamicoEstadoPoliticasCliente;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoEstadoPoliticasCliente(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoEstadoPoliticasCliente) {
	//	this.jComboBoxTiposArchivosReportesDinamicoEstadoPoliticasCliente = jComboBoxTiposArchivosReportesDinamicoEstadoPoliticasCliente;
	//}
	
	public void setBorderResaltarTiposReportesEstadoPoliticasCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoPoliticasCliente.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesEstadoPoliticasCliente .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesEstadoPoliticasCliente() {
		return this.jComboBoxTiposGraficosReportesEstadoPoliticasCliente;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesEstadoPoliticasCliente(
			JComboBox jComboBoxTiposGraficosReportesEstadoPoliticasCliente) {
		this.jComboBoxTiposGraficosReportesEstadoPoliticasCliente = jComboBoxTiposGraficosReportesEstadoPoliticasCliente;
	}
	
	public void setBorderResaltarTiposGraficosReportesEstadoPoliticasCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoPoliticasCliente.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesEstadoPoliticasCliente .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionEstadoPoliticasCliente() {
		return this.jComboBoxTiposPaginacionEstadoPoliticasCliente;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionEstadoPoliticasCliente(
			JComboBox jComboBoxTiposPaginacionEstadoPoliticasCliente) {
		this.jComboBoxTiposPaginacionEstadoPoliticasCliente = jComboBoxTiposPaginacionEstadoPoliticasCliente;
	}
	
	public void setBorderResaltarTiposPaginacionEstadoPoliticasCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoPoliticasCliente.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionEstadoPoliticasCliente .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesEstadoPoliticasCliente() {
		return this.jComboBoxTiposRelacionesEstadoPoliticasCliente;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesEstadoPoliticasCliente() {
		return this.jComboBoxTiposAccionesEstadoPoliticasCliente;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesEstadoPoliticasCliente(
			JComboBox jComboBoxTiposRelacionesEstadoPoliticasCliente) {
		this.jComboBoxTiposRelacionesEstadoPoliticasCliente = jComboBoxTiposRelacionesEstadoPoliticasCliente;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesEstadoPoliticasCliente(
			JComboBox jComboBoxTiposAccionesEstadoPoliticasCliente) {
		this.jComboBoxTiposAccionesEstadoPoliticasCliente = jComboBoxTiposAccionesEstadoPoliticasCliente;
	}
	
	public void setBorderResaltarTiposRelacionesEstadoPoliticasCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoPoliticasCliente.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesEstadoPoliticasCliente .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesEstadoPoliticasCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoPoliticasCliente.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesEstadoPoliticasCliente .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoEstadoPoliticasCliente() {
	//	return jCheckBoxConGraficoDinamicoEstadoPoliticasCliente;
	//}

	//public void setjCheckBoxConGraficoDinamicoEstadoPoliticasCliente(
	//		JCheckBox jCheckBoxConGraficoDinamicoEstadoPoliticasCliente) {
	//	this.jCheckBoxConGraficoDinamicoEstadoPoliticasCliente = jCheckBoxConGraficoDinamicoEstadoPoliticasCliente;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoEstadoPoliticasCliente() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarEstadoPoliticasCliente.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoEstadoPoliticasCliente .setBorder(borderResaltar);		
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
		this.estadopoliticasclienteSessionBean=new EstadoPoliticasClienteSessionBean();
		
		this.estadopoliticasclienteSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.estadopoliticasclienteSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.estadopoliticasclienteSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=EstadoPoliticasClienteJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=EstadoPoliticasClienteJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		EstadoPoliticasClienteJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		EstadoPoliticasClienteJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		EstadoPoliticasClienteJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Estado Politicas Cliente MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 910) {
			iHeight=910;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.estadopoliticasclienteSessionBean.getEsGuardarRelacionado()) {
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
		
		EstadoPoliticasClienteJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("EstadoPoliticasCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarEstadoPoliticasCliente= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarEstadoPoliticasCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarEstadoPoliticasCliente,this.jTtoolBarEstadoPoliticasCliente,
							"nuevo","nuevo","Nuevo"+" "+EstadoPoliticasClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarEstadoPoliticasCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarEstadoPoliticasCliente,this.jTtoolBarEstadoPoliticasCliente,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarEstadoPoliticasCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarEstadoPoliticasCliente,this.jTtoolBarEstadoPoliticasCliente,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+EstadoPoliticasClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarEstadoPoliticasCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarEstadoPoliticasCliente,this.jTtoolBarEstadoPoliticasCliente,
							"duplicar","duplicar","Duplicar"+" "+EstadoPoliticasClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarEstadoPoliticasCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarEstadoPoliticasCliente,this.jTtoolBarEstadoPoliticasCliente,
							"copiar","copiar","Copiar"+" "+EstadoPoliticasClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarEstadoPoliticasCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarEstadoPoliticasCliente,this.jTtoolBarEstadoPoliticasCliente,
							"ver_form","ver_form","Ver"+" "+EstadoPoliticasClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarEstadoPoliticasCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEstadoPoliticasCliente,this.jTtoolBarEstadoPoliticasCliente,
							"recargar","recargar","Recargar"+" "+EstadoPoliticasClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarEstadoPoliticasCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEstadoPoliticasCliente,this.jTtoolBarEstadoPoliticasCliente,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarEstadoPoliticasCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEstadoPoliticasCliente,this.jTtoolBarEstadoPoliticasCliente,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarEstadoPoliticasCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarEstadoPoliticasCliente,this.jTtoolBarEstadoPoliticasCliente,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarEstadoPoliticasCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarEstadoPoliticasCliente,this.jTtoolBarEstadoPoliticasCliente,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarEstadoPoliticasCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarEstadoPoliticasCliente,this.jTtoolBarEstadoPoliticasCliente,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+EstadoPoliticasClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarEstadoPoliticasCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarEstadoPoliticasCliente,this.jTtoolBarEstadoPoliticasCliente,
							"cerrar","cerrar","Salir"+" "+EstadoPoliticasClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarEstadoPoliticasCliente=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarEstadoPoliticasCliente;
			
				this.jButtonProcesarInformacionToolBarEstadoPoliticasCliente=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarEstadoPoliticasCliente;
				
		//protected JButton jButtonModificarToolBarEstadoPoliticasCliente;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarEstadoPoliticasCliente=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuEstadoPoliticasCliente=new JMenuMe("General");
		this.jmenuArchivoEstadoPoliticasCliente=new JMenuMe("Archivo");
		this.jmenuAccionesEstadoPoliticasCliente=new JMenuMe("Acciones");
		this.jmenuDatosEstadoPoliticasCliente=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoEstadoPoliticasCliente= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoEstadoPoliticasCliente.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoEstadoPoliticasCliente,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoEstadoPoliticasCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarEstadoPoliticasCliente= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarEstadoPoliticasCliente.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarEstadoPoliticasCliente,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarEstadoPoliticasCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesEstadoPoliticasCliente= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesEstadoPoliticasCliente.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesEstadoPoliticasCliente,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesEstadoPoliticasCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosEstadoPoliticasCliente= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosEstadoPoliticasCliente.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosEstadoPoliticasCliente,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosEstadoPoliticasCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarEstadoPoliticasCliente= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarEstadoPoliticasCliente.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarEstadoPoliticasCliente,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarEstadoPoliticasCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormEstadoPoliticasCliente= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormEstadoPoliticasCliente.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormEstadoPoliticasCliente,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormEstadoPoliticasCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaEstadoPoliticasCliente= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaEstadoPoliticasCliente.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaEstadoPoliticasCliente,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaEstadoPoliticasCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarEstadoPoliticasCliente= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarEstadoPoliticasCliente.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarEstadoPoliticasCliente,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarEstadoPoliticasCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionEstadoPoliticasCliente= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionEstadoPoliticasCliente.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionEstadoPoliticasCliente,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionEstadoPoliticasCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionEstadoPoliticasCliente= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionEstadoPoliticasCliente.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionEstadoPoliticasCliente,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresEstadoPoliticasCliente= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresEstadoPoliticasCliente.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresEstadoPoliticasCliente,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresEstadoPoliticasCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesEstadoPoliticasCliente= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesEstadoPoliticasCliente.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesEstadoPoliticasCliente,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesEstadoPoliticasCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByEstadoPoliticasCliente= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByEstadoPoliticasCliente.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByEstadoPoliticasCliente,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByEstadoPoliticasCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarEstadoPoliticasCliente= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarEstadoPoliticasCliente.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarEstadoPoliticasCliente,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarEstadoPoliticasCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByEstadoPoliticasCliente= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByEstadoPoliticasCliente.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByEstadoPoliticasCliente,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByEstadoPoliticasCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarEstadoPoliticasCliente= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarEstadoPoliticasCliente.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarEstadoPoliticasCliente,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarEstadoPoliticasCliente, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosEstadoPoliticasCliente= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosEstadoPoliticasCliente.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosEstadoPoliticasCliente,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosEstadoPoliticasCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoEstadoPoliticasCliente.add(this.jMenuItemCerrarEstadoPoliticasCliente);
			
			this.jmenuAccionesEstadoPoliticasCliente.add(this.jMenuItemNuevoEstadoPoliticasCliente);
			this.jmenuAccionesEstadoPoliticasCliente.add(this.jMenuItemNuevoGuardarCambiosEstadoPoliticasCliente);
			this.jmenuAccionesEstadoPoliticasCliente.add(this.jMenuItemNuevoRelacionesEstadoPoliticasCliente);
			this.jmenuAccionesEstadoPoliticasCliente.add(this.jMenuItemGuardarCambiosTablaEstadoPoliticasCliente);		
			this.jmenuAccionesEstadoPoliticasCliente.add(this.jMenuItemDuplicarEstadoPoliticasCliente);		
			this.jmenuAccionesEstadoPoliticasCliente.add(this.jMenuItemCopiarEstadoPoliticasCliente);		
			this.jmenuAccionesEstadoPoliticasCliente.add(this.jMenuItemVerFormEstadoPoliticasCliente);		
			
			this.jmenuDatosEstadoPoliticasCliente.add(this.jMenuItemRecargarInformacionEstadoPoliticasCliente);				
			this.jmenuDatosEstadoPoliticasCliente.add(this.jMenuItemAnterioresEstadoPoliticasCliente);				
			this.jmenuDatosEstadoPoliticasCliente.add(this.jMenuItemSiguientesEstadoPoliticasCliente);				
			this.jmenuDatosEstadoPoliticasCliente.add(this.jMenuItemAbrirOrderByEstadoPoliticasCliente);				
			this.jmenuDatosEstadoPoliticasCliente.add(this.jMenuItemMostrarOcultarEstadoPoliticasCliente);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesEstadoPoliticasCliente.add(this.jMenuItemGuardarCambiosEstadoPoliticasCliente);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoEstadoPoliticasCliente, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesEstadoPoliticasCliente, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosEstadoPoliticasCliente, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarEstadoPoliticasCliente.add(this.jmenuArchivoEstadoPoliticasCliente);		
			this.jmenuBarEstadoPoliticasCliente.add(this.jmenuAccionesEstadoPoliticasCliente);		
			this.jmenuBarEstadoPoliticasCliente.add(this.jmenuDatosEstadoPoliticasCliente);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarEstadoPoliticasCliente);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasEstadoPoliticasCliente() {
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
			//this.jInternalFrameDetalleEstadoPoliticasCliente = new EstadoPoliticasClienteDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Estado Politicas Cliente DATOS");
			this.jInternalFrameDetalleFormEstadoPoliticasCliente = new EstadoPoliticasClienteDetalleFormJInternalFrame(jDesktopPane,this.estadopoliticasclienteSessionBean.getConGuardarRelaciones(),this.estadopoliticasclienteSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormEstadoPoliticasCliente = null;//new EstadoPoliticasClienteDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutEstadoPoliticasCliente= new GridBagLayout();
		
		
		this.jTableDatosEstadoPoliticasCliente = new JTableMe();      
		
		String sToolTipEstadoPoliticasCliente="";
		sToolTipEstadoPoliticasCliente=EstadoPoliticasClienteConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipEstadoPoliticasCliente+="(Cartera.EstadoPoliticasCliente)";
		}
		
		if(!this.estadopoliticasclienteSessionBean.getEsGuardarRelacionado()) {
			sToolTipEstadoPoliticasCliente+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosEstadoPoliticasCliente.setToolTipText(sToolTipEstadoPoliticasCliente);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosEstadoPoliticasCliente);
		this.jTableDatosEstadoPoliticasCliente.setAutoCreateRowSorter(true);
		this.jTableDatosEstadoPoliticasCliente.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosEstadoPoliticasCliente.setRowSelectionAllowed(true);
		this.jTableDatosEstadoPoliticasCliente.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosEstadoPoliticasCliente,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoEstadoPoliticasCliente = new JButtonMe();
		this.jButtonDuplicarEstadoPoliticasCliente = new JButtonMe();
		this.jButtonCopiarEstadoPoliticasCliente = new JButtonMe();
		this.jButtonVerFormEstadoPoliticasCliente = new JButtonMe();
		this.jButtonNuevoRelacionesEstadoPoliticasCliente = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaEstadoPoliticasCliente = new JButtonMe();
		this.jButtonCerrarEstadoPoliticasCliente = new JButtonMe();
		
		this.jScrollPanelDatosEstadoPoliticasCliente = new JScrollPane();   
        this.jScrollPanelDatosGeneralEstadoPoliticasCliente = new JScrollPane();
		
				
		
		
		this.jPanelAccionesEstadoPoliticasCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Estado Politicas Cliente";
		
		if(!this.estadopoliticasclienteSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosEstadoPoliticasCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Politicas Clientes" + this.sPath));
		} else {
			this.jScrollPanelDatosEstadoPoliticasCliente.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralEstadoPoliticasCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesEstadoPoliticasCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesEstadoPoliticasCliente.setToolTipText("Acciones");
        this.jPanelAccionesEstadoPoliticasCliente.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralEstadoPoliticasCliente, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEstadoPoliticasCliente, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoEstadoPoliticasCliente=new ReporteDinamicoJInternalFrame(EstadoPoliticasClienteConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoEstadoPoliticasCliente();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionEstadoPoliticasCliente=new ImportacionJInternalFrame(EstadoPoliticasClienteConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionEstadoPoliticasCliente();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByEstadoPoliticasCliente = new JButtonMe();
		
		this.jButtonAbrirOrderByEstadoPoliticasCliente.setText("Orden");
		this.jButtonAbrirOrderByEstadoPoliticasCliente.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByEstadoPoliticasCliente,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByEstadoPoliticasCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByEstadoPoliticasCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByEstadoPoliticasCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByEstadoPoliticasCliente=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEstadoPoliticasCliente,false,this);
			
			//this.cargarOrderByEstadoPoliticasCliente(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByEstadoPoliticasCliente=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEstadoPoliticasCliente,true,this);
			
			//this.cargarOrderByEstadoPoliticasCliente(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosEstadoPoliticasCliente.setMinimumSize(new Dimension(400,50));//430
		this.jTableDatosEstadoPoliticasCliente.setMaximumSize(new Dimension(400,50));//430
		this.jTableDatosEstadoPoliticasCliente.setPreferredSize(new Dimension(400,50));//430
		
		this.jScrollPanelDatosEstadoPoliticasCliente.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosEstadoPoliticasCliente.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosEstadoPoliticasCliente.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoEstadoPoliticasCliente.setText("Nuevo");
		this.jButtonDuplicarEstadoPoliticasCliente.setText("Duplicar");
		this.jButtonCopiarEstadoPoliticasCliente.setText("Copiar");
		this.jButtonVerFormEstadoPoliticasCliente.setText("Ver");
		this.jButtonNuevoRelacionesEstadoPoliticasCliente.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaEstadoPoliticasCliente.setText("Guardar");
		this.jButtonCerrarEstadoPoliticasCliente.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoEstadoPoliticasCliente,"nuevo_button","Nuevo",this.estadopoliticasclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarEstadoPoliticasCliente,"duplicar_button","Duplicar",this.estadopoliticasclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarEstadoPoliticasCliente,"copiar_button","Copiar",this.estadopoliticasclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormEstadoPoliticasCliente,"ver_form","Ver",this.estadopoliticasclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesEstadoPoliticasCliente,"nuevorelaciones_button","Nuevo Rel",this.estadopoliticasclienteSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaEstadoPoliticasCliente,"guardarcambiostabla_button","Guardar",this.estadopoliticasclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarEstadoPoliticasCliente,"cerrar_button","Salir",this.estadopoliticasclienteSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoEstadoPoliticasCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarEstadoPoliticasCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarEstadoPoliticasCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormEstadoPoliticasCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesEstadoPoliticasCliente, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaEstadoPoliticasCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarEstadoPoliticasCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoEstadoPoliticasCliente.setToolTipText("Nuevo"+" "+EstadoPoliticasClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarEstadoPoliticasCliente.setToolTipText("Duplicar"+" "+EstadoPoliticasClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarEstadoPoliticasCliente.setToolTipText("Copiar"+" "+EstadoPoliticasClienteConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormEstadoPoliticasCliente.setToolTipText("Ver"+" "+EstadoPoliticasClienteConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesEstadoPoliticasCliente.setToolTipText("Nuevo Rel"+" "+EstadoPoliticasClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaEstadoPoliticasCliente.setToolTipText("Guardar"+" "+EstadoPoliticasClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarEstadoPoliticasCliente.setToolTipText("Salir"+" "+EstadoPoliticasClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoEstadoPoliticasCliente";
		inputMap = this.jButtonNuevoEstadoPoliticasCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoEstadoPoliticasCliente.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoEstadoPoliticasCliente"));
		
		//DUPLICAR
		sMapKey = "DuplicarEstadoPoliticasCliente";
		inputMap = this.jButtonDuplicarEstadoPoliticasCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarEstadoPoliticasCliente.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarEstadoPoliticasCliente"));
		
		//COPIAR
		sMapKey = "CopiarEstadoPoliticasCliente";
		inputMap = this.jButtonCopiarEstadoPoliticasCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarEstadoPoliticasCliente.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarEstadoPoliticasCliente"));
		
		//VEr FORM
		sMapKey = "VerFormEstadoPoliticasCliente";
		inputMap = this.jButtonVerFormEstadoPoliticasCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormEstadoPoliticasCliente.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormEstadoPoliticasCliente"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesEstadoPoliticasCliente";
		inputMap = this.jButtonNuevoRelacionesEstadoPoliticasCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesEstadoPoliticasCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesEstadoPoliticasCliente"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarEstadoPoliticasCliente";
		inputMap = this.jButtonModificarEstadoPoliticasCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarEstadoPoliticasCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarEstadoPoliticasCliente"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarEstadoPoliticasCliente";
		inputMap = this.jButtonCerrarEstadoPoliticasCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarEstadoPoliticasCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarEstadoPoliticasCliente"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaEstadoPoliticasCliente";
		inputMap = this.jButtonGuardarCambiosTablaEstadoPoliticasCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaEstadoPoliticasCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaEstadoPoliticasCliente"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesEstadoPoliticasCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesEstadoPoliticasCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionEstadoPoliticasCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1EstadoPoliticasCliente= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2EstadoPoliticasCliente= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3EstadoPoliticasCliente= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4EstadoPoliticasCliente= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5EstadoPoliticasCliente= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesEstadoPoliticasCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesEstadoPoliticasCliente.setName("jPanelParametrosReportesEstadoPoliticasCliente"); 
		
		this.jPanelParametrosReportesAccionesEstadoPoliticasCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesEstadoPoliticasCliente.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesEstadoPoliticasCliente.setName("jPanelParametrosReportesAccionesEstadoPoliticasCliente"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesEstadoPoliticasCliente, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesEstadoPoliticasCliente, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionEstadoPoliticasCliente = new JButtonMe();
		this.jButtonRecargarInformacionEstadoPoliticasCliente.setText("Recargar");
		this.jButtonRecargarInformacionEstadoPoliticasCliente.setToolTipText("Recargar"+" "+EstadoPoliticasClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionEstadoPoliticasCliente,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionEstadoPoliticasCliente = new JButtonMe();
		this.jButtonProcesarInformacionEstadoPoliticasCliente.setText("Procesar");
		this.jButtonProcesarInformacionEstadoPoliticasCliente.setToolTipText("Procesar"+" "+EstadoPoliticasClienteConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionEstadoPoliticasCliente.setVisible(false);
			
		this.jButtonProcesarInformacionEstadoPoliticasCliente.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionEstadoPoliticasCliente.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionEstadoPoliticasCliente.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesEstadoPoliticasCliente = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEstadoPoliticasCliente.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesEstadoPoliticasCliente.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesEstadoPoliticasCliente = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEstadoPoliticasCliente.setText("TIPO");       
		this.jComboBoxTiposReportesEstadoPoliticasCliente.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesEstadoPoliticasCliente = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEstadoPoliticasCliente.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesEstadoPoliticasCliente.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionEstadoPoliticasCliente = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionEstadoPoliticasCliente.setText("Paginacion");
		this.jComboBoxTiposPaginacionEstadoPoliticasCliente.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesEstadoPoliticasCliente = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesEstadoPoliticasCliente.setText("Accion");
		this.jComboBoxTiposRelacionesEstadoPoliticasCliente.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesEstadoPoliticasCliente = new JComboBoxMe();
		//this.jComboBoxTiposAccionesEstadoPoliticasCliente.setText("Accion");
		this.jComboBoxTiposAccionesEstadoPoliticasCliente.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarEstadoPoliticasCliente = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarEstadoPoliticasCliente.setText("Accion");
		this.jComboBoxTiposSeleccionarEstadoPoliticasCliente.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralEstadoPoliticasCliente=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralEstadoPoliticasCliente.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralEstadoPoliticasCliente.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralEstadoPoliticasCliente.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesEstadoPoliticasCliente = new JLabelMe();
		
		this.jLabelAccionesEstadoPoliticasCliente.setText("Acciones");		
		this.jLabelAccionesEstadoPoliticasCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEstadoPoliticasCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEstadoPoliticasCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosEstadoPoliticasCliente = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosEstadoPoliticasCliente.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosEstadoPoliticasCliente.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosEstadoPoliticasCliente = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosEstadoPoliticasCliente.setText("Seleccionados");
		this.jCheckBoxSeleccionadosEstadoPoliticasCliente.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaEstadoPoliticasCliente = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaEstadoPoliticasCliente.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaEstadoPoliticasCliente.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteEstadoPoliticasCliente = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteEstadoPoliticasCliente.setText("Graf.");
		this.jCheckBoxConGraficoReporteEstadoPoliticasCliente.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresEstadoPoliticasCliente = new JButtonMe();
		//this.jButtonAnterioresEstadoPoliticasCliente.setText("<<");
        this.jButtonAnterioresEstadoPoliticasCliente.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresEstadoPoliticasCliente,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresEstadoPoliticasCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesEstadoPoliticasCliente = new JButtonMe();
		//this.jButtonSiguientesEstadoPoliticasCliente.setText(">>");
        this.jButtonSiguientesEstadoPoliticasCliente.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesEstadoPoliticasCliente,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesEstadoPoliticasCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosEstadoPoliticasCliente = new JButtonMe();
		this.jButtonNuevoGuardarCambiosEstadoPoliticasCliente.setText("Nue");
        this.jButtonNuevoGuardarCambiosEstadoPoliticasCliente.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosEstadoPoliticasCliente,"nuevoguardarcambios_button","Nue",this.estadopoliticasclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosEstadoPoliticasCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosEstadoPoliticasCliente";
		inputMap = this.jButtonNuevoGuardarCambiosEstadoPoliticasCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosEstadoPoliticasCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosEstadoPoliticasCliente"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionEstadoPoliticasCliente";
		inputMap = this.jButtonRecargarInformacionEstadoPoliticasCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionEstadoPoliticasCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionEstadoPoliticasCliente"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesEstadoPoliticasCliente";
		inputMap = this.jButtonSiguientesEstadoPoliticasCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesEstadoPoliticasCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesEstadoPoliticasCliente"));
		
		//ANTERIORES		
		sMapKey = "AnterioresEstadoPoliticasCliente";
		inputMap = this.jButtonAnterioresEstadoPoliticasCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresEstadoPoliticasCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresEstadoPoliticasCliente"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasEstadoPoliticasCliente();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesEstadoPoliticasCliente.setMinimumSize(new Dimension(this.getWidth(),EstadoPoliticasClienteBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EstadoPoliticasClienteBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesEstadoPoliticasCliente.setMaximumSize(new Dimension(this.getWidth(),EstadoPoliticasClienteBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EstadoPoliticasClienteBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesEstadoPoliticasCliente.setPreferredSize(new Dimension(this.getWidth(),EstadoPoliticasClienteBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EstadoPoliticasClienteBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionEstadoPoliticasCliente = new GridBagLayout();

			this.jPanelPaginacionEstadoPoliticasCliente.setLayout(gridaBagLayoutPaginacionEstadoPoliticasCliente);						
			
			this.gridBagConstraintsEstadoPoliticasCliente = new GridBagConstraints();
			this.gridBagConstraintsEstadoPoliticasCliente.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsEstadoPoliticasCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoPoliticasCliente.gridy = 0;
			this.gridBagConstraintsEstadoPoliticasCliente.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionEstadoPoliticasCliente.add(this.jButtonAnterioresEstadoPoliticasCliente, this.gridBagConstraintsEstadoPoliticasCliente);
					
						
			this.gridBagConstraintsEstadoPoliticasCliente = new GridBagConstraints();
			this.gridBagConstraintsEstadoPoliticasCliente.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsEstadoPoliticasCliente.gridy = 0;
			
			this.jPanelPaginacionEstadoPoliticasCliente.add(this.jButtonNuevoGuardarCambiosEstadoPoliticasCliente, this.gridBagConstraintsEstadoPoliticasCliente);
						
			
			this.gridBagConstraintsEstadoPoliticasCliente = new GridBagConstraints();
			this.gridBagConstraintsEstadoPoliticasCliente.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsEstadoPoliticasCliente.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsEstadoPoliticasCliente.gridy = 0;
			this.jPanelPaginacionEstadoPoliticasCliente.add(this.jButtonSiguientesEstadoPoliticasCliente, this.gridBagConstraintsEstadoPoliticasCliente);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsEstadoPoliticasCliente = new GridBagConstraints();
			this.gridBagConstraintsEstadoPoliticasCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoPoliticasCliente.gridy = 1;
			this.gridBagConstraintsEstadoPoliticasCliente.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEstadoPoliticasCliente.add(this.jButtonNuevoEstadoPoliticasCliente, this.gridBagConstraintsEstadoPoliticasCliente);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsEstadoPoliticasCliente = new GridBagConstraints();
				this.gridBagConstraintsEstadoPoliticasCliente.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsEstadoPoliticasCliente.gridy = 1;
				this.gridBagConstraintsEstadoPoliticasCliente.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionEstadoPoliticasCliente.add(this.jButtonNuevoRelacionesEstadoPoliticasCliente, this.gridBagConstraintsEstadoPoliticasCliente);
			}
			
			
			if(!this.estadopoliticasclienteSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsEstadoPoliticasCliente = new GridBagConstraints();
				this.gridBagConstraintsEstadoPoliticasCliente.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsEstadoPoliticasCliente.gridy = 1;
				this.gridBagConstraintsEstadoPoliticasCliente.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionEstadoPoliticasCliente.add(this.jButtonGuardarCambiosTablaEstadoPoliticasCliente, this.gridBagConstraintsEstadoPoliticasCliente);
			}
			
			
			
			this.gridBagConstraintsEstadoPoliticasCliente = new GridBagConstraints();
			this.gridBagConstraintsEstadoPoliticasCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoPoliticasCliente.gridy = 1;
			this.gridBagConstraintsEstadoPoliticasCliente.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEstadoPoliticasCliente.add(this.jButtonDuplicarEstadoPoliticasCliente, this.gridBagConstraintsEstadoPoliticasCliente);
			
			this.gridBagConstraintsEstadoPoliticasCliente = new GridBagConstraints();
			this.gridBagConstraintsEstadoPoliticasCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoPoliticasCliente.gridy = 1;
			this.gridBagConstraintsEstadoPoliticasCliente.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEstadoPoliticasCliente.add(this.jButtonCopiarEstadoPoliticasCliente, this.gridBagConstraintsEstadoPoliticasCliente);
		
			this.gridBagConstraintsEstadoPoliticasCliente = new GridBagConstraints();
			this.gridBagConstraintsEstadoPoliticasCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoPoliticasCliente.gridy = 1;
			this.gridBagConstraintsEstadoPoliticasCliente.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEstadoPoliticasCliente.add(this.jButtonVerFormEstadoPoliticasCliente, this.gridBagConstraintsEstadoPoliticasCliente);
		
			this.gridBagConstraintsEstadoPoliticasCliente = new GridBagConstraints();
			this.gridBagConstraintsEstadoPoliticasCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoPoliticasCliente.gridy = 1;
			this.gridBagConstraintsEstadoPoliticasCliente.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionEstadoPoliticasCliente.add(this.jButtonCerrarEstadoPoliticasCliente, this.gridBagConstraintsEstadoPoliticasCliente);
		
		
		
		this.jButtonRecargarInformacionEstadoPoliticasCliente.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionEstadoPoliticasCliente.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionEstadoPoliticasCliente.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionEstadoPoliticasCliente, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesEstadoPoliticasCliente.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesEstadoPoliticasCliente.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesEstadoPoliticasCliente.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesEstadoPoliticasCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesEstadoPoliticasCliente.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesEstadoPoliticasCliente.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesEstadoPoliticasCliente.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesEstadoPoliticasCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesEstadoPoliticasCliente.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesEstadoPoliticasCliente.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesEstadoPoliticasCliente.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesEstadoPoliticasCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionEstadoPoliticasCliente.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionEstadoPoliticasCliente.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionEstadoPoliticasCliente.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionEstadoPoliticasCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesEstadoPoliticasCliente.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesEstadoPoliticasCliente.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesEstadoPoliticasCliente.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesEstadoPoliticasCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesEstadoPoliticasCliente.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEstadoPoliticasCliente.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEstadoPoliticasCliente.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesEstadoPoliticasCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarEstadoPoliticasCliente.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarEstadoPoliticasCliente.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarEstadoPoliticasCliente.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarEstadoPoliticasCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaEstadoPoliticasCliente.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaEstadoPoliticasCliente.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaEstadoPoliticasCliente.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaEstadoPoliticasCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteEstadoPoliticasCliente.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteEstadoPoliticasCliente.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteEstadoPoliticasCliente.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteEstadoPoliticasCliente, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosEstadoPoliticasCliente.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosEstadoPoliticasCliente.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosEstadoPoliticasCliente.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosEstadoPoliticasCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosEstadoPoliticasCliente.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosEstadoPoliticasCliente.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosEstadoPoliticasCliente.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosEstadoPoliticasCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesEstadoPoliticasCliente = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesEstadoPoliticasCliente = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1EstadoPoliticasCliente = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2EstadoPoliticasCliente = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3EstadoPoliticasCliente = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4EstadoPoliticasCliente = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesEstadoPoliticasCliente.setLayout(gridaBagParametrosReportesEstadoPoliticasCliente);
			this.jPanelParametrosReportesAccionesEstadoPoliticasCliente.setLayout(gridaBagParametrosReportesAccionesEstadoPoliticasCliente);
			
			
			this.jPanelParametrosAuxiliar1EstadoPoliticasCliente.setLayout(gridaBagParametrosAuxiliar1EstadoPoliticasCliente);
			this.jPanelParametrosAuxiliar2EstadoPoliticasCliente.setLayout(gridaBagParametrosAuxiliar2EstadoPoliticasCliente);
			this.jPanelParametrosAuxiliar3EstadoPoliticasCliente.setLayout(gridaBagParametrosAuxiliar3EstadoPoliticasCliente);
			this.jPanelParametrosAuxiliar4EstadoPoliticasCliente.setLayout(gridaBagParametrosAuxiliar4EstadoPoliticasCliente);
			//this.jPanelParametrosAuxiliar5EstadoPoliticasCliente.setLayout(gridaBagParametrosAuxiliar2EstadoPoliticasCliente);			
			
			
			
			
			this.gridBagConstraintsEstadoPoliticasCliente = new GridBagConstraints();
			this.gridBagConstraintsEstadoPoliticasCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoPoliticasCliente.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEstadoPoliticasCliente.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstadoPoliticasCliente.add(this.jButtonRecargarInformacionEstadoPoliticasCliente, this.gridBagConstraintsEstadoPoliticasCliente);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsEstadoPoliticasCliente = new GridBagConstraints();
			this.gridBagConstraintsEstadoPoliticasCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoPoliticasCliente.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoPoliticasCliente.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1EstadoPoliticasCliente.add(this.jComboBoxTiposPaginacionEstadoPoliticasCliente, this.gridBagConstraintsEstadoPoliticasCliente);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsEstadoPoliticasCliente = new GridBagConstraints();
			this.gridBagConstraintsEstadoPoliticasCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoPoliticasCliente.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoPoliticasCliente.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1EstadoPoliticasCliente.add(this.jCheckBoxConAltoMaximoTablaEstadoPoliticasCliente, this.gridBagConstraintsEstadoPoliticasCliente);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsEstadoPoliticasCliente = new GridBagConstraints();
			this.gridBagConstraintsEstadoPoliticasCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoPoliticasCliente.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoPoliticasCliente.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1EstadoPoliticasCliente.add(this.jComboBoxTiposArchivosReportesEstadoPoliticasCliente, this.gridBagConstraintsEstadoPoliticasCliente);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsEstadoPoliticasCliente = new GridBagConstraints();
			this.gridBagConstraintsEstadoPoliticasCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoPoliticasCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoPoliticasCliente.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoPoliticasCliente.add(this.jPanelParametrosAuxiliar1EstadoPoliticasCliente, this.gridBagConstraintsEstadoPoliticasCliente);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsEstadoPoliticasCliente = new GridBagConstraints();
			this.gridBagConstraintsEstadoPoliticasCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoPoliticasCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoPoliticasCliente.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEstadoPoliticasCliente.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4EstadoPoliticasCliente.add(this.jComboBoxTiposReportesEstadoPoliticasCliente, this.gridBagConstraintsEstadoPoliticasCliente);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsEstadoPoliticasCliente = new GridBagConstraints();
			this.gridBagConstraintsEstadoPoliticasCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoPoliticasCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoPoliticasCliente.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoPoliticasCliente.add(this.jPanelParametrosAuxiliar4EstadoPoliticasCliente, this.gridBagConstraintsEstadoPoliticasCliente);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsEstadoPoliticasCliente = new GridBagConstraints();
			this.gridBagConstraintsEstadoPoliticasCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoPoliticasCliente.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoPoliticasCliente.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoPoliticasCliente.add(this.jComboBoxTiposReportesEstadoPoliticasCliente, this.gridBagConstraintsEstadoPoliticasCliente);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsEstadoPoliticasCliente = new GridBagConstraints();
			this.gridBagConstraintsEstadoPoliticasCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoPoliticasCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoPoliticasCliente.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEstadoPoliticasCliente.add(this.jCheckBoxGenerarReporteEstadoPoliticasCliente, this.gridBagConstraintsEstadoPoliticasCliente);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsEstadoPoliticasCliente = new GridBagConstraints();
			this.gridBagConstraintsEstadoPoliticasCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoPoliticasCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoPoliticasCliente.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoPoliticasCliente.add(this.jPanelParametrosAuxiliar2EstadoPoliticasCliente, this.gridBagConstraintsEstadoPoliticasCliente);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsEstadoPoliticasCliente = new GridBagConstraints();
			this.gridBagConstraintsEstadoPoliticasCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoPoliticasCliente.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEstadoPoliticasCliente.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEstadoPoliticasCliente.add(this.jLabelAccionesEstadoPoliticasCliente, this.gridBagConstraintsEstadoPoliticasCliente);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsEstadoPoliticasCliente = new GridBagConstraints();
				this.gridBagConstraintsEstadoPoliticasCliente.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsEstadoPoliticasCliente.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsEstadoPoliticasCliente.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesEstadoPoliticasCliente.add(this.jButtonAbrirOrderByEstadoPoliticasCliente, this.gridBagConstraintsEstadoPoliticasCliente);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsEstadoPoliticasCliente = new GridBagConstraints();
			this.gridBagConstraintsEstadoPoliticasCliente.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsEstadoPoliticasCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoPoliticasCliente.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstadoPoliticasCliente.add(this.jComboBoxTiposSeleccionarEstadoPoliticasCliente, this.gridBagConstraintsEstadoPoliticasCliente);			
			
			
			/*
			this.gridBagConstraintsEstadoPoliticasCliente = new GridBagConstraints();
			this.gridBagConstraintsEstadoPoliticasCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoPoliticasCliente.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEstadoPoliticasCliente.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEstadoPoliticasCliente.add(this.jCheckBoxSeleccionarTodosEstadoPoliticasCliente, this.gridBagConstraintsEstadoPoliticasCliente);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsEstadoPoliticasCliente = new GridBagConstraints();
			this.gridBagConstraintsEstadoPoliticasCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoPoliticasCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoPoliticasCliente.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEstadoPoliticasCliente.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3EstadoPoliticasCliente.add(this.jCheckBoxSeleccionarTodosEstadoPoliticasCliente, this.gridBagConstraintsEstadoPoliticasCliente);															
				
			this.gridBagConstraintsEstadoPoliticasCliente = new GridBagConstraints();
			this.gridBagConstraintsEstadoPoliticasCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoPoliticasCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoPoliticasCliente.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEstadoPoliticasCliente.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3EstadoPoliticasCliente.add(this.jCheckBoxSeleccionadosEstadoPoliticasCliente, this.gridBagConstraintsEstadoPoliticasCliente);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsEstadoPoliticasCliente = new GridBagConstraints();
			this.gridBagConstraintsEstadoPoliticasCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoPoliticasCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoPoliticasCliente.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoPoliticasCliente.add(this.jPanelParametrosAuxiliar3EstadoPoliticasCliente, this.gridBagConstraintsEstadoPoliticasCliente);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsEstadoPoliticasCliente = new GridBagConstraints();
			this.gridBagConstraintsEstadoPoliticasCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoPoliticasCliente.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstadoPoliticasCliente.add(this.jComboBoxTiposRelacionesEstadoPoliticasCliente, this.gridBagConstraintsEstadoPoliticasCliente);
				
			this.gridBagConstraintsEstadoPoliticasCliente = new GridBagConstraints();
			this.gridBagConstraintsEstadoPoliticasCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoPoliticasCliente.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstadoPoliticasCliente.add(this.jComboBoxTiposAccionesEstadoPoliticasCliente, this.gridBagConstraintsEstadoPoliticasCliente);
	
				
			this.gridBagConstraintsEstadoPoliticasCliente = new GridBagConstraints();
			this.gridBagConstraintsEstadoPoliticasCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoPoliticasCliente.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstadoPoliticasCliente.add(this.jTextFieldValorCampoGeneralEstadoPoliticasCliente, this.gridBagConstraintsEstadoPoliticasCliente);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosEstadoPoliticasCliente = new GridBagLayout();

			this.jScrollPanelDatosEstadoPoliticasCliente.setLayout(gridaBagLayoutDatosEstadoPoliticasCliente);
			
			this.gridBagConstraintsEstadoPoliticasCliente = new GridBagConstraints();
			this.gridBagConstraintsEstadoPoliticasCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoPoliticasCliente.gridy = 0;
			this.gridBagConstraintsEstadoPoliticasCliente.gridx = 0;
			
			this.jScrollPanelDatosEstadoPoliticasCliente.add(this.jTableDatosEstadoPoliticasCliente, this.gridBagConstraintsEstadoPoliticasCliente);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosEstadoPoliticasCliente.setViewportView(this.jTableDatosEstadoPoliticasCliente);
		this.jTableDatosEstadoPoliticasCliente.setFillsViewportHeight(true);
		this.jTableDatosEstadoPoliticasCliente.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesEstadoPoliticasCliente= new GridBagLayout();
		this.jPanelAccionesEstadoPoliticasCliente.setLayout(gridaBagLayoutAccionesEstadoPoliticasCliente);
		
		
		/*	
		this.gridBagConstraintsEstadoPoliticasCliente = new GridBagConstraints();
		this.gridBagConstraintsEstadoPoliticasCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoPoliticasCliente.gridy = 0;
		this.gridBagConstraintsEstadoPoliticasCliente.gridx = 0;
			
		this.jPanelAccionesEstadoPoliticasCliente.add(this.jButtonNuevoEstadoPoliticasCliente, this.gridBagConstraintsEstadoPoliticasCliente);
		*/
		int iPosXAccion=0;
		
						
		
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutEstadoPoliticasCliente = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutEstadoPoliticasCliente);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.estadopoliticasclienteSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsEstadoPoliticasCliente = new GridBagConstraints();						
			this.gridBagConstraintsEstadoPoliticasCliente.gridy = iGridyPrincipal++;
			this.gridBagConstraintsEstadoPoliticasCliente.gridx = 0;		
			//this.gridBagConstraintsEstadoPoliticasCliente.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoPoliticasCliente.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsEstadoPoliticasCliente.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarEstadoPoliticasCliente, this.gridBagConstraintsEstadoPoliticasCliente);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsEstadoPoliticasCliente = new GridBagConstraints();
		this.gridBagConstraintsEstadoPoliticasCliente.gridy = iGridyPrincipal++;
		this.gridBagConstraintsEstadoPoliticasCliente.gridx = 0;		
		//this.gridBagConstraintsEstadoPoliticasCliente.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoPoliticasCliente.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsEstadoPoliticasCliente.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsEstadoPoliticasCliente);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsEstadoPoliticasCliente = new GridBagConstraints();
		this.gridBagConstraintsEstadoPoliticasCliente.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoPoliticasCliente.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesEstadoPoliticasCliente, this.gridBagConstraintsEstadoPoliticasCliente);								
		
		
		/*
		this.gridBagConstraintsEstadoPoliticasCliente = new GridBagConstraints();
		this.gridBagConstraintsEstadoPoliticasCliente.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoPoliticasCliente.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesEstadoPoliticasCliente, this.gridBagConstraintsEstadoPoliticasCliente);
		*/		
		
		this.gridBagConstraintsEstadoPoliticasCliente = new GridBagConstraints();
		this.gridBagConstraintsEstadoPoliticasCliente.gridy =iGridyPrincipal++;
		this.gridBagConstraintsEstadoPoliticasCliente.gridx =0;
		this.gridBagConstraintsEstadoPoliticasCliente.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsEstadoPoliticasCliente.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosEstadoPoliticasCliente, this.gridBagConstraintsEstadoPoliticasCliente);
				
		
		this.gridBagConstraintsEstadoPoliticasCliente = new GridBagConstraints();
		this.gridBagConstraintsEstadoPoliticasCliente.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoPoliticasCliente.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionEstadoPoliticasCliente, this.gridBagConstraintsEstadoPoliticasCliente);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(EstadoPoliticasClienteJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosEstadoPoliticasCliente= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosEstadoPoliticasCliente = new GridBagLayout();
			this.jPanelBusquedasParametrosEstadoPoliticasCliente.setLayout(gridaBagLayoutBusquedasParametrosEstadoPoliticasCliente);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralEstadoPoliticasCliente=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralEstadoPoliticasCliente.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEstadoPoliticasCliente.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEstadoPoliticasCliente.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsEstadoPoliticasCliente = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsEstadoPoliticasCliente = new GridBagConstraints();
		this.gridBagConstraintsEstadoPoliticasCliente.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoPoliticasCliente.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposEstadoPoliticasCliente, this.gridBagConstraintsEstadoPoliticasCliente);
			
			
		this.gridBagConstraintsEstadoPoliticasCliente = new GridBagConstraints();
		this.gridBagConstraintsEstadoPoliticasCliente.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoPoliticasCliente.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosEstadoPoliticasCliente, this.gridBagConstraintsEstadoPoliticasCliente);
		
			
		this.gridBagConstraintsEstadoPoliticasCliente = new GridBagConstraints();
		this.gridBagConstraintsEstadoPoliticasCliente.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsEstadoPoliticasCliente.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesEstadoPoliticasCliente, this.gridBagConstraintsEstadoPoliticasCliente);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralEstadoPoliticasCliente;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoEstadoPoliticasCliente() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoEstadoPoliticasCliente = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoEstadoPoliticasCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoEstadoPoliticasCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoEstadoPoliticasCliente.setName("jPanelReporteDinamicoEstadoPoliticasCliente"); 
		
		this.jPanelReporteDinamicoEstadoPoliticasCliente.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoEstadoPoliticasCliente.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoEstadoPoliticasCliente.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoEstadoPoliticasCliente.setLayout(gridaBagLayoutReporteDinamicoEstadoPoliticasCliente);
		
		
		this.jInternalFrameReporteDinamicoEstadoPoliticasCliente= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoEstadoPoliticasCliente = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteEstadoPoliticasCliente= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoEstadoPoliticasCliente.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoEstadoPoliticasCliente.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoEstadoPoliticasCliente.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoEstadoPoliticasCliente.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoEstadoPoliticasCliente.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoEstadoPoliticasCliente.setResizable(true);
	    this.jInternalFrameReporteDinamicoEstadoPoliticasCliente.setClosable(true);
	    this.jInternalFrameReporteDinamicoEstadoPoliticasCliente.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoEstadoPoliticasCliente.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoEstadoPoliticasCliente.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoEstadoPoliticasCliente.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoEstadoPoliticasCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Politicas Clientes"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteEstadoPoliticasCliente = new JLabelMe();

		this.jLabelColumnasSelectReporteEstadoPoliticasCliente.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteEstadoPoliticasCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteEstadoPoliticasCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteEstadoPoliticasCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsEstadoPoliticasCliente = new GridBagConstraints();
		this.gridBagConstraintsEstadoPoliticasCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoPoliticasCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoPoliticasCliente.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoEstadoPoliticasCliente.add(this.jLabelColumnasSelectReporteEstadoPoliticasCliente, this.gridBagConstraintsEstadoPoliticasCliente);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteEstadoPoliticasCliente = new JList<Reporte>();
		this.jListColumnasSelectReporteEstadoPoliticasCliente.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteEstadoPoliticasCliente.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteEstadoPoliticasCliente.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteEstadoPoliticasCliente.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteEstadoPoliticasCliente.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteEstadoPoliticasCliente=new JScrollPane(this.jListColumnasSelectReporteEstadoPoliticasCliente);
			
			this.jScrollColumnasSelectReporteEstadoPoliticasCliente.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteEstadoPoliticasCliente.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteEstadoPoliticasCliente.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteEstadoPoliticasCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsEstadoPoliticasCliente = new GridBagConstraints();
		this.gridBagConstraintsEstadoPoliticasCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoPoliticasCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoPoliticasCliente.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoEstadoPoliticasCliente.add(this.jListColumnasSelectReporteEstadoPoliticasCliente, this.gridBagConstraintsEstadoPoliticasCliente);
		this.jPanelReporteDinamicoEstadoPoliticasCliente.add(this.jScrollColumnasSelectReporteEstadoPoliticasCliente, this.gridBagConstraintsEstadoPoliticasCliente);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteEstadoPoliticasCliente = new JLabelMe();

		this.jLabelRelacionesSelectReporteEstadoPoliticasCliente.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteEstadoPoliticasCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteEstadoPoliticasCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteEstadoPoliticasCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsEstadoPoliticasCliente = new GridBagConstraints();
		this.gridBagConstraintsEstadoPoliticasCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoPoliticasCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoPoliticasCliente.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoEstadoPoliticasCliente.add(this.jLabelRelacionesSelectReporteEstadoPoliticasCliente, this.gridBagConstraintsEstadoPoliticasCliente);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteEstadoPoliticasCliente = new JList<Reporte>();
		this.jListRelacionesSelectReporteEstadoPoliticasCliente.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteEstadoPoliticasCliente.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteEstadoPoliticasCliente.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteEstadoPoliticasCliente.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteEstadoPoliticasCliente.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteEstadoPoliticasCliente=new JScrollPane(this.jListRelacionesSelectReporteEstadoPoliticasCliente);
			
			this.jScrollRelacionesSelectReporteEstadoPoliticasCliente.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteEstadoPoliticasCliente.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteEstadoPoliticasCliente.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteEstadoPoliticasCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsEstadoPoliticasCliente = new GridBagConstraints();
		this.gridBagConstraintsEstadoPoliticasCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoPoliticasCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoPoliticasCliente.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoEstadoPoliticasCliente.add(this.jListRelacionesSelectReporteEstadoPoliticasCliente, this.gridBagConstraintsEstadoPoliticasCliente);
		this.jPanelReporteDinamicoEstadoPoliticasCliente.add(this.jScrollRelacionesSelectReporteEstadoPoliticasCliente, this.gridBagConstraintsEstadoPoliticasCliente);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoEstadoPoliticasCliente = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoEstadoPoliticasCliente = new JComboBoxMe();
		this.jListColumnasValoresGraficoEstadoPoliticasCliente = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoEstadoPoliticasCliente = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoEstadoPoliticasCliente.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoEstadoPoliticasCliente.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoEstadoPoliticasCliente.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoEstadoPoliticasCliente.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoEstadoPoliticasCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoEstadoPoliticasCliente = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoEstadoPoliticasCliente.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoEstadoPoliticasCliente.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoEstadoPoliticasCliente.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoEstadoPoliticasCliente.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoEstadoPoliticasCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoEstadoPoliticasCliente = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoEstadoPoliticasCliente.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoEstadoPoliticasCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoEstadoPoliticasCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoEstadoPoliticasCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsEstadoPoliticasCliente = new GridBagConstraints();
		this.gridBagConstraintsEstadoPoliticasCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoPoliticasCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoPoliticasCliente.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEstadoPoliticasCliente.add(this.jLabelGenerarExcelReporteDinamicoEstadoPoliticasCliente, this.gridBagConstraintsEstadoPoliticasCliente);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoEstadoPoliticasCliente = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoEstadoPoliticasCliente.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoEstadoPoliticasCliente,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoEstadoPoliticasCliente.setToolTipText("Generar EXCEL"+" "+EstadoPoliticasClienteConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsEstadoPoliticasCliente = new GridBagConstraints();
		//this.gridBagConstraintsEstadoPoliticasCliente.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsEstadoPoliticasCliente.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsEstadoPoliticasCliente.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoEstadoPoliticasCliente.add(this.jButtonGenerarExcelReporteDinamicoEstadoPoliticasCliente, this.gridBagConstraintsEstadoPoliticasCliente);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsEstadoPoliticasCliente = new GridBagConstraints();
		this.gridBagConstraintsEstadoPoliticasCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoPoliticasCliente.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEstadoPoliticasCliente.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEstadoPoliticasCliente.add(this.jComboBoxTiposReportesDinamicoEstadoPoliticasCliente, this.gridBagConstraintsEstadoPoliticasCliente);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoEstadoPoliticasCliente = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoEstadoPoliticasCliente.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoEstadoPoliticasCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoEstadoPoliticasCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoEstadoPoliticasCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsEstadoPoliticasCliente = new GridBagConstraints();
		this.gridBagConstraintsEstadoPoliticasCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoPoliticasCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoPoliticasCliente.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEstadoPoliticasCliente.add(this.jLabelTiposArchivoReporteDinamicoEstadoPoliticasCliente, this.gridBagConstraintsEstadoPoliticasCliente);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsEstadoPoliticasCliente = new GridBagConstraints();
		this.gridBagConstraintsEstadoPoliticasCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoPoliticasCliente.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEstadoPoliticasCliente.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEstadoPoliticasCliente.add(this.jComboBoxTiposArchivosReportesDinamicoEstadoPoliticasCliente, this.gridBagConstraintsEstadoPoliticasCliente);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoEstadoPoliticasCliente = new JButtonMe();
		this.jButtonGenerarReporteDinamicoEstadoPoliticasCliente.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoEstadoPoliticasCliente,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoEstadoPoliticasCliente.setToolTipText("Generar"+" "+EstadoPoliticasClienteConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsEstadoPoliticasCliente = new GridBagConstraints();
		this.gridBagConstraintsEstadoPoliticasCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoPoliticasCliente.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEstadoPoliticasCliente.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEstadoPoliticasCliente.add(this.jButtonGenerarReporteDinamicoEstadoPoliticasCliente, this.gridBagConstraintsEstadoPoliticasCliente);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoEstadoPoliticasCliente = new JButtonMe();
		this.jButtonCerrarReporteDinamicoEstadoPoliticasCliente.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoEstadoPoliticasCliente,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoEstadoPoliticasCliente.setToolTipText("Cancelar"+" "+EstadoPoliticasClienteConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsEstadoPoliticasCliente = new GridBagConstraints();
		this.gridBagConstraintsEstadoPoliticasCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoPoliticasCliente.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEstadoPoliticasCliente.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEstadoPoliticasCliente.add(this.jButtonCerrarReporteDinamicoEstadoPoliticasCliente, this.gridBagConstraintsEstadoPoliticasCliente);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalEstadoPoliticasCliente = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoEstadoPoliticasCliente= new JScrollPane(jPanelReporteDinamicoEstadoPoliticasCliente,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoEstadoPoliticasCliente.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoEstadoPoliticasCliente.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoEstadoPoliticasCliente.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoEstadoPoliticasCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Politicas Clientes"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsEstadoPoliticasCliente = new GridBagConstraints();
		this.gridBagConstraintsEstadoPoliticasCliente.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsEstadoPoliticasCliente.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsEstadoPoliticasCliente.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoEstadoPoliticasCliente.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoEstadoPoliticasCliente.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalEstadoPoliticasCliente);
		this.jInternalFrameReporteDinamicoEstadoPoliticasCliente.getContentPane().add(this.jScrollPanelReporteDinamicoEstadoPoliticasCliente, this.gridBagConstraintsEstadoPoliticasCliente);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionEstadoPoliticasCliente() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionEstadoPoliticasCliente = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionEstadoPoliticasCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionEstadoPoliticasCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionEstadoPoliticasCliente.setName("jPanelImportacionEstadoPoliticasCliente"); 
		
		this.jPanelImportacionEstadoPoliticasCliente.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionEstadoPoliticasCliente.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionEstadoPoliticasCliente.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionEstadoPoliticasCliente.setLayout(gridaBagLayoutImportacionEstadoPoliticasCliente);
		
		
		this.jInternalFrameImportacionEstadoPoliticasCliente= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionEstadoPoliticasCliente= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionEstadoPoliticasCliente = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteEstadoPoliticasCliente= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionEstadoPoliticasCliente.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionEstadoPoliticasCliente.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionEstadoPoliticasCliente.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionEstadoPoliticasCliente.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionEstadoPoliticasCliente.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionEstadoPoliticasCliente.setResizable(true);
	    this.jInternalFrameImportacionEstadoPoliticasCliente.setClosable(true);
	    this.jInternalFrameImportacionEstadoPoliticasCliente.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionEstadoPoliticasCliente.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionEstadoPoliticasCliente.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionEstadoPoliticasCliente.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionEstadoPoliticasCliente.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionEstadoPoliticasCliente.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionEstadoPoliticasCliente.setResizable(true);
	    this.jInternalFrameImportacionEstadoPoliticasCliente.setClosable(true);
	    this.jInternalFrameImportacionEstadoPoliticasCliente.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionEstadoPoliticasCliente.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionEstadoPoliticasCliente.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionEstadoPoliticasCliente.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionEstadoPoliticasCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Politicas Clientes"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionEstadoPoliticasCliente = new JLabelMe();

		this.jLabelArchivoImportacionEstadoPoliticasCliente.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionEstadoPoliticasCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionEstadoPoliticasCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionEstadoPoliticasCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsEstadoPoliticasCliente = new GridBagConstraints();
		this.gridBagConstraintsEstadoPoliticasCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoPoliticasCliente.gridy = iPosYImportacion;		
		this.gridBagConstraintsEstadoPoliticasCliente.gridx = iPosXImportacion++;
			
		this.jPanelImportacionEstadoPoliticasCliente.add(this.jLabelArchivoImportacionEstadoPoliticasCliente, this.gridBagConstraintsEstadoPoliticasCliente);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionEstadoPoliticasCliente = new JFileChooser();		
		this.jFileChooserImportacionEstadoPoliticasCliente.setToolTipText("ESCOGER ARCHIVO"+" "+EstadoPoliticasClienteConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionEstadoPoliticasCliente = new JButtonMe();
		this.jButtonAbrirImportacionEstadoPoliticasCliente.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionEstadoPoliticasCliente,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionEstadoPoliticasCliente.setToolTipText("Generar"+" "+EstadoPoliticasClienteConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsEstadoPoliticasCliente = new GridBagConstraints();
		this.gridBagConstraintsEstadoPoliticasCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoPoliticasCliente.gridy = iPosYImportacion;
		this.gridBagConstraintsEstadoPoliticasCliente.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEstadoPoliticasCliente.add(this.jButtonAbrirImportacionEstadoPoliticasCliente, this.gridBagConstraintsEstadoPoliticasCliente);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionEstadoPoliticasCliente = new JLabelMe();

		this.jLabelPathArchivoImportacionEstadoPoliticasCliente.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionEstadoPoliticasCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionEstadoPoliticasCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionEstadoPoliticasCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsEstadoPoliticasCliente = new GridBagConstraints();
		this.gridBagConstraintsEstadoPoliticasCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoPoliticasCliente.gridy = iPosYImportacion;		
		this.gridBagConstraintsEstadoPoliticasCliente.gridx = iPosXImportacion++;
			
		this.jPanelImportacionEstadoPoliticasCliente.add(this.jLabelPathArchivoImportacionEstadoPoliticasCliente, this.gridBagConstraintsEstadoPoliticasCliente);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionEstadoPoliticasCliente=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionEstadoPoliticasCliente.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionEstadoPoliticasCliente.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionEstadoPoliticasCliente.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsEstadoPoliticasCliente = new GridBagConstraints();
		this.gridBagConstraintsEstadoPoliticasCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoPoliticasCliente.gridy = iPosYImportacion;
		this.gridBagConstraintsEstadoPoliticasCliente.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEstadoPoliticasCliente.add(this.jTextFieldPathArchivoImportacionEstadoPoliticasCliente, this.gridBagConstraintsEstadoPoliticasCliente);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionEstadoPoliticasCliente = new JButtonMe();
		this.jButtonGenerarImportacionEstadoPoliticasCliente.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionEstadoPoliticasCliente,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionEstadoPoliticasCliente.setToolTipText("Generar"+" "+EstadoPoliticasClienteConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsEstadoPoliticasCliente = new GridBagConstraints();
		this.gridBagConstraintsEstadoPoliticasCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoPoliticasCliente.gridy = iPosYImportacion;
		this.gridBagConstraintsEstadoPoliticasCliente.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEstadoPoliticasCliente.add(this.jButtonGenerarImportacionEstadoPoliticasCliente, this.gridBagConstraintsEstadoPoliticasCliente);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionEstadoPoliticasCliente = new JButtonMe();
		this.jButtonCerrarImportacionEstadoPoliticasCliente.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionEstadoPoliticasCliente,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionEstadoPoliticasCliente.setToolTipText("Cancelar"+" "+EstadoPoliticasClienteConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsEstadoPoliticasCliente = new GridBagConstraints();
		this.gridBagConstraintsEstadoPoliticasCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoPoliticasCliente.gridy = iPosYImportacion;
		this.gridBagConstraintsEstadoPoliticasCliente.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEstadoPoliticasCliente.add(this.jButtonCerrarImportacionEstadoPoliticasCliente, this.gridBagConstraintsEstadoPoliticasCliente);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalEstadoPoliticasCliente = new GridBagLayout();
		
		this.jScrollPanelImportacionEstadoPoliticasCliente= new JScrollPane(jPanelImportacionEstadoPoliticasCliente,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsEstadoPoliticasCliente = new GridBagConstraints();
		this.gridBagConstraintsEstadoPoliticasCliente.gridy =iPosYImportacion;
		this.gridBagConstraintsEstadoPoliticasCliente.gridx =iPosXImportacion;
		this.gridBagConstraintsEstadoPoliticasCliente.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionEstadoPoliticasCliente.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionEstadoPoliticasCliente.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalEstadoPoliticasCliente);
		this.jInternalFrameImportacionEstadoPoliticasCliente.getContentPane().add(this.jScrollPanelImportacionEstadoPoliticasCliente, this.gridBagConstraintsEstadoPoliticasCliente);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByEstadoPoliticasCliente(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByEstadoPoliticasCliente = new JButtonMe();
			this.jButtonAbrirOrderByEstadoPoliticasCliente.setText("Orden");
			this.jButtonAbrirOrderByEstadoPoliticasCliente.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByEstadoPoliticasCliente,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByEstadoPoliticasCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByEstadoPoliticasCliente";
			inputMap = this.jButtonAbrirOrderByEstadoPoliticasCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByEstadoPoliticasCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByEstadoPoliticasCliente"));
		
		
			GridBagLayout gridaBagLayoutOrderByEstadoPoliticasCliente = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByEstadoPoliticasCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByEstadoPoliticasCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByEstadoPoliticasCliente.setName("jPanelOrderByEstadoPoliticasCliente"); 
			
			this.jPanelOrderByEstadoPoliticasCliente.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByEstadoPoliticasCliente.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByEstadoPoliticasCliente.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByEstadoPoliticasCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByEstadoPoliticasCliente.setLayout(gridaBagLayoutOrderByEstadoPoliticasCliente);
			
			
			this.jTableDatosEstadoPoliticasClienteOrderBy = new JTableMe();        
			this.jTableDatosEstadoPoliticasClienteOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosEstadoPoliticasClienteOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosEstadoPoliticasClienteOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosEstadoPoliticasClienteOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosEstadoPoliticasClienteOrderBy.setViewportView(this.jTableDatosEstadoPoliticasClienteOrderBy);
			this.jTableDatosEstadoPoliticasClienteOrderBy.setFillsViewportHeight(true);
			this.jTableDatosEstadoPoliticasClienteOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByEstadoPoliticasCliente= new OrderByJInternalFrame();
			this.jInternalFrameOrderByEstadoPoliticasCliente= new OrderByJInternalFrame();
			this.jScrollPanelOrderByEstadoPoliticasCliente = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteEstadoPoliticasCliente= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByEstadoPoliticasCliente.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByEstadoPoliticasCliente.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByEstadoPoliticasCliente.setTitle("Orden");
			this.jInternalFrameOrderByEstadoPoliticasCliente.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByEstadoPoliticasCliente.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByEstadoPoliticasCliente.setResizable(true);
			this.jInternalFrameOrderByEstadoPoliticasCliente.setClosable(true);
			this.jInternalFrameOrderByEstadoPoliticasCliente.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByEstadoPoliticasCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByEstadoPoliticasCliente.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByEstadoPoliticasCliente.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByEstadoPoliticasCliente.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByEstadoPoliticasCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByEstadoPoliticasCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Politicas Clientes"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsEstadoPoliticasCliente = new GridBagConstraints();
			this.gridBagConstraintsEstadoPoliticasCliente.gridy =iPosYOrderBy++;
			this.gridBagConstraintsEstadoPoliticasCliente.gridx =iPosXOrderBy;
			this.gridBagConstraintsEstadoPoliticasCliente.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsEstadoPoliticasCliente.ipady =150;
				
			this.jPanelOrderByEstadoPoliticasCliente.add(jScrollPanelDatosEstadoPoliticasClienteOrderBy, this.gridBagConstraintsEstadoPoliticasCliente);//this.jTableDatosEstadoPoliticasClienteTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByEstadoPoliticasCliente = new JButtonMe();
			this.jButtonCerrarOrderByEstadoPoliticasCliente.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByEstadoPoliticasCliente,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByEstadoPoliticasCliente.setToolTipText("Cancelar"+" "+EstadoPoliticasClienteConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByEstadoPoliticasCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsEstadoPoliticasCliente = new GridBagConstraints();
			this.gridBagConstraintsEstadoPoliticasCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoPoliticasCliente.gridy = iPosYOrderBy++;
			this.gridBagConstraintsEstadoPoliticasCliente.gridx = iPosXOrderBy;
									
			this.jPanelOrderByEstadoPoliticasCliente.add(this.jButtonCerrarOrderByEstadoPoliticasCliente, this.gridBagConstraintsEstadoPoliticasCliente);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalEstadoPoliticasCliente = new GridBagLayout();
			
			this.jScrollPanelOrderByEstadoPoliticasCliente= new JScrollPane(jPanelOrderByEstadoPoliticasCliente,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsEstadoPoliticasCliente = new GridBagConstraints();
			this.gridBagConstraintsEstadoPoliticasCliente.gridy =iPosYOrderBy;
			this.gridBagConstraintsEstadoPoliticasCliente.gridx =iPosXOrderBy;
			this.gridBagConstraintsEstadoPoliticasCliente.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByEstadoPoliticasCliente.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByEstadoPoliticasCliente.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalEstadoPoliticasCliente);
			
			this.jInternalFrameOrderByEstadoPoliticasCliente.getContentPane().add(this.jScrollPanelOrderByEstadoPoliticasCliente, this.gridBagConstraintsEstadoPoliticasCliente);			
		
		} else {
			this.jButtonAbrirOrderByEstadoPoliticasCliente = new JButtonMe();
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
			&& this.estadopoliticasclienteSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosEstadoPoliticasCliente.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosEstadoPoliticasCliente.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosEstadoPoliticasCliente.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosEstadoPoliticasCliente.getRowHeight();//EstadoPoliticasClienteConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.estadopoliticasclienteSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > EstadoPoliticasClienteConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaEstadoPoliticasCliente.isSelected()) {
					iHeightTable=EstadoPoliticasClienteConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < EstadoPoliticasClienteConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=EstadoPoliticasClienteConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > EstadoPoliticasClienteConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaEstadoPoliticasCliente.isSelected()) {
					iHeightTable=EstadoPoliticasClienteConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < EstadoPoliticasClienteConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=EstadoPoliticasClienteConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosEstadoPoliticasCliente.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosEstadoPoliticasCliente.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosEstadoPoliticasCliente.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosEstadoPoliticasCliente.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosEstadoPoliticasCliente.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosEstadoPoliticasCliente.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByEstadoPoliticasCliente!=null && this.jInternalFrameOrderByEstadoPoliticasCliente.getjTableDatosOrderBy()!=null) {
			//if(!this.estadopoliticasclienteSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByEstadoPoliticasCliente.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByEstadoPoliticasCliente.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByEstadoPoliticasCliente.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByEstadoPoliticasCliente.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByEstadoPoliticasCliente.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByEstadoPoliticasCliente.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByEstadoPoliticasCliente.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosEstadoPoliticasCliente.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosEstadoPoliticasCliente.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosEstadoPoliticasCliente.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=estadopoliticasclienteLogic.getEstadoPoliticasClientes().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=estadopoliticasclientes.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<EstadoPoliticasCliente> TraerEstadoPoliticasClienteBeans(List<EstadoPoliticasCliente> estadopoliticasclientes,ArrayList<Classe> classes)throws Exception {
		try {
			for(EstadoPoliticasCliente estadopoliticascliente:estadopoliticasclientes) {
					
				if(!(EstadoPoliticasClienteConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || EstadoPoliticasClienteConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					estadopoliticascliente.setsDetalleGeneralEntityReporte(EstadoPoliticasClienteConstantesFunciones.getEstadoPoliticasClienteDescripcion(estadopoliticascliente));
										
						
					
					

					if(estadopoliticascliente.getPoliticasClientes()!=null && Funciones.existeClass(classes,PoliticasCliente.class)) {
						try{estadopoliticascliente.setpoliticasclientesDescripcionReporte(new JRBeanCollectionDataSource(PoliticasClienteJInternalFrame.TraerPoliticasClienteBeans(estadopoliticascliente.getPoliticasClientes(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//estadopoliticascliente.setsDetalleGeneralEntityReporte(estadopoliticascliente.getsDetalleGeneralEntityReporte());
										
				}
				
				//estadopoliticasclientebeans.add(estadopoliticasclientebean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return estadopoliticasclientes;
    }
	//PARA REPORTES FIN
}
