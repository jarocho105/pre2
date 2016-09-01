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
package com.bydan.erp.facturacion.presentation.swing.jinternalframes;



import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;





//import com.bydan.erp.facturacion.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.facturacion.util.EstadoAntiClienteConstantesFunciones;

import com.bydan.erp.facturacion.business.logic.*;
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
public class EstadoAntiClienteJInternalFrame extends EstadoAntiClienteBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarEstadoAntiCliente;
	
	protected JMenuBar jmenuBarEstadoAntiCliente;
	
	protected JMenu jmenuEstadoAntiCliente;
	protected JMenu jmenuDatosEstadoAntiCliente;
	protected JMenu jmenuArchivoEstadoAntiCliente;
	protected JMenu jmenuAccionesEstadoAntiCliente;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosEstadoAntiCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutEstadoAntiCliente;	
	protected GridBagConstraints gridBagConstraintsEstadoAntiCliente;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public EstadoAntiClienteDetalleFormJInternalFrame jInternalFrameDetalleFormEstadoAntiCliente;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoEstadoAntiCliente;	
	protected ImportacionJInternalFrame jInternalFrameImportacionEstadoAntiCliente;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public EstadoAntiClienteSessionBean estadoanticlienteSessionBean;
		
	
	
	
	//protected JDesktopPane jDesktopPane;
	public List<EstadoAntiCliente> estadoanticlientes;		
	public List<EstadoAntiCliente> estadoanticlientesEliminados;	
	public List<EstadoAntiCliente> estadoanticlientesAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByEstadoAntiCliente;		
	protected JButton jButtonAbrirOrderByEstadoAntiCliente;
	
	
	//protected JPanel jPanelOrderByEstadoAntiCliente;
	//public JScrollPane jScrollPanelOrderByEstadoAntiCliente;	
	//protected JButton jButtonCerrarOrderByEstadoAntiCliente;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public EstadoAntiClienteLogic estadoanticlienteLogic;
	
	
	
	public JScrollPane jScrollPanelDatosEstadoAntiCliente;
	public JScrollPane jScrollPanelDatosEdicionEstadoAntiCliente;
	public JScrollPane jScrollPanelDatosGeneralEstadoAntiCliente;
    
	
	
	//public JScrollPane jScrollPanelDatosEstadoAntiClienteOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoEstadoAntiCliente;
	//public JScrollPane jScrollPanelImportacionEstadoAntiCliente;
	
	
	
	protected JPanel jPanelAccionesEstadoAntiCliente;
	
    protected JPanel jPanelPaginacionEstadoAntiCliente;
    protected JPanel jPanelParametrosReportesEstadoAntiCliente;
	protected JPanel jPanelParametrosReportesAccionesEstadoAntiCliente;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1EstadoAntiCliente;
	protected JPanel jPanelParametrosAuxiliar2EstadoAntiCliente;
	protected JPanel jPanelParametrosAuxiliar3EstadoAntiCliente;
	protected JPanel jPanelParametrosAuxiliar4EstadoAntiCliente;
	//protected JPanel jPanelParametrosAuxiliar5EstadoAntiCliente;
	
	
	
	//protected JPanel jPanelReporteDinamicoEstadoAntiCliente;
	//protected JPanel jPanelImportacionEstadoAntiCliente;
	
	
	public JTable jTableDatosEstadoAntiCliente;
	
	
	
	//public JTable jTableDatosEstadoAntiClienteOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoEstadoAntiCliente;
	protected JButton jButtonDuplicarEstadoAntiCliente;
	protected JButton jButtonCopiarEstadoAntiCliente;
	protected JButton jButtonVerFormEstadoAntiCliente;
	protected JButton jButtonNuevoRelacionesEstadoAntiCliente;
	protected JButton jButtonModificarEstadoAntiCliente;
	
    protected JButton jButtonGuardarCambiosTablaEstadoAntiCliente;
	protected JButton jButtonCerrarEstadoAntiCliente;
	
	
	protected JButton jButtonRecargarInformacionEstadoAntiCliente;
	protected JButton jButtonProcesarInformacionEstadoAntiCliente;
	
	
	protected JButton jButtonAnterioresEstadoAntiCliente;
	protected JButton jButtonSiguientesEstadoAntiCliente;
	protected JButton jButtonNuevoGuardarCambiosEstadoAntiCliente;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoEstadoAntiCliente;
	//protected JButton jButtonCerrarReporteDinamicoEstadoAntiCliente;
	//protected JButton jButtonGenerarExcelReporteDinamicoEstadoAntiCliente;	
	
	
	
	//protected JButton jButtonAbrirImportacionEstadoAntiCliente;
	//protected JButton jButtonGenerarImportacionEstadoAntiCliente;
	//protected JButton jButtonCerrarImportacionEstadoAntiCliente;
	//protected JFileChooser jFileChooserImportacionEstadoAntiCliente;
	//protected File fileImportacionEstadoAntiCliente;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarEstadoAntiCliente;
	protected JButton jButtonDuplicarToolBarEstadoAntiCliente;
	protected JButton jButtonNuevoRelacionesToolBarEstadoAntiCliente;
	
	
	public JButton jButtonGuardarCambiosToolBarEstadoAntiCliente;
	protected JButton jButtonCopiarToolBarEstadoAntiCliente;
	protected JButton jButtonVerFormToolBarEstadoAntiCliente;
	public JButton jButtonGuardarCambiosTablaToolBarEstadoAntiCliente;
	protected JButton jButtonMostrarOcultarTablaToolBarEstadoAntiCliente;
	protected JButton jButtonCerrarToolBarEstadoAntiCliente;
	
	protected JButton jButtonRecargarInformacionToolBarEstadoAntiCliente;
	protected JButton jButtonProcesarInformacionToolBarEstadoAntiCliente;
	protected JButton jButtonAnterioresToolBarEstadoAntiCliente;
	protected JButton jButtonSiguientesToolBarEstadoAntiCliente;
	protected JButton jButtonNuevoGuardarCambiosToolBarEstadoAntiCliente;
	protected JButton jButtonAbrirOrderByToolBarEstadoAntiCliente;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoEstadoAntiCliente;
	protected JMenuItem jMenuItemDuplicarEstadoAntiCliente;
	protected JMenuItem jMenuItemNuevoRelacionesEstadoAntiCliente;
	
	
	protected JMenuItem jMenuItemGuardarCambiosEstadoAntiCliente;
	protected JMenuItem jMenuItemCopiarEstadoAntiCliente;
	protected JMenuItem jMenuItemVerFormEstadoAntiCliente;
	protected JMenuItem jMenuItemGuardarCambiosTablaEstadoAntiCliente;
	protected JMenuItem jMenuItemCerrarEstadoAntiCliente;
	protected JMenuItem jMenuItemDetalleCerrarEstadoAntiCliente;
	protected JMenuItem jMenuItemDetalleAbrirOrderByEstadoAntiCliente;
	protected JMenuItem jMenuItemDetalleMostarOcultarEstadoAntiCliente;
	
	protected JMenuItem jMenuItemRecargarInformacionEstadoAntiCliente;
	protected JMenuItem jMenuItemProcesarInformacionEstadoAntiCliente;
	protected JMenuItem jMenuItemAnterioresEstadoAntiCliente;
	protected JMenuItem jMenuItemSiguientesEstadoAntiCliente;
	protected JMenuItem jMenuItemNuevoGuardarCambiosEstadoAntiCliente;
	protected JMenuItem jMenuItemAbrirOrderByEstadoAntiCliente;
	protected JMenuItem jMenuItemMostrarOcultarEstadoAntiCliente;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesEstadoAntiCliente;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosEstadoAntiCliente;
	protected JCheckBox jCheckBoxSeleccionadosEstadoAntiCliente;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaEstadoAntiCliente;
	protected JCheckBox jCheckBoxConGraficoReporteEstadoAntiCliente;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesEstadoAntiCliente;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesEstadoAntiCliente;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoEstadoAntiCliente;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoEstadoAntiCliente;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesEstadoAntiCliente;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionEstadoAntiCliente;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesEstadoAntiCliente;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesEstadoAntiCliente;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarEstadoAntiCliente;
	protected JTextField jTextFieldValorCampoGeneralEstadoAntiCliente;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteEstadoAntiCliente;
	//public JList<Reporte> jListColumnasSelectReporteEstadoAntiCliente;
	//public JScrollPane jScrollColumnasSelectReporteEstadoAntiCliente;
	
	//public JLabel jLabelRelacionesSelectReporteEstadoAntiCliente;
	//public JList<Reporte> jListRelacionesSelectReporteEstadoAntiCliente;
	//public JScrollPane jScrollRelacionesSelectReporteEstadoAntiCliente;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoEstadoAntiCliente;
	//protected JCheckBox jCheckBoxConGraficoDinamicoEstadoAntiCliente;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoEstadoAntiCliente;
	//public JLabel jLabelTiposArchivoReporteDinamicoEstadoAntiCliente;
	
		
	//public JLabel jLabelArchivoImportacionEstadoAntiCliente;	
	//public JLabel jLabelPathArchivoImportacionEstadoAntiCliente;
	//protected JTextField jTextFieldPathArchivoImportacionEstadoAntiCliente;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoEstadoAntiCliente;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoEstadoAntiCliente;
	
	//public JLabel jLabelColumnaCategoriaValorEstadoAntiCliente;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorEstadoAntiCliente;
	
	//public JLabel jLabelColumnasValoresGraficoEstadoAntiCliente;
	//public JList<Reporte> jListColumnasValoresGraficoEstadoAntiCliente;
	//public JScrollPane jScrollColumnasValoresGraficoEstadoAntiCliente;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoEstadoAntiCliente;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoEstadoAntiCliente;	
	
	
	
	
	
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
	public EstadoAntiClienteJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("EstadoAntiCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoAntiClienteJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EstadoAntiCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoAntiClienteJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EstadoAntiCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoAntiClienteJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("EstadoAntiCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionEstadoAntiCliente)	{
		this.jButtonRecargarInformacionEstadoAntiCliente = jButtonRecargarInformacionEstadoAntiCliente;
	}
	
	public JButton getjButtonProcesarInformacionEstadoAntiCliente() {
		return this.jButtonProcesarInformacionEstadoAntiCliente;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionEstadoAntiCliente)	{
		this.jButtonProcesarInformacionEstadoAntiCliente = jButtonProcesarInformacionEstadoAntiCliente;
	}
	
	
	public JButton getjButtonRecargarInformacionEstadoAntiCliente() {
		return this.jButtonRecargarInformacionEstadoAntiCliente;
	}
	
	
	public List<EstadoAntiCliente> getestadoanticlientes() {
		return this.estadoanticlientes;
	}

	public void setestadoanticlientes(List<EstadoAntiCliente> estadoanticlientes) {
		this.estadoanticlientes = estadoanticlientes;
	}
	
	public List<EstadoAntiCliente> getestadoanticlientesAux() {
		return this.estadoanticlientesAux;
	}

	public void setestadoanticlientesAux(List<EstadoAntiCliente> estadoanticlientesAux) {
		this.estadoanticlientesAux = estadoanticlientesAux;
	}
	
	public List<EstadoAntiCliente> getestadoanticlientesEliminados() {
		return this.estadoanticlientesEliminados;
	}

	public void setEstadoAntiClientesEliminados(List<EstadoAntiCliente> estadoanticlientesEliminados) {
		this.estadoanticlientesEliminados = estadoanticlientesEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarEstadoAntiCliente() {
		return jComboBoxTiposSeleccionarEstadoAntiCliente;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarEstadoAntiCliente(
			JComboBox jComboBoxTiposSeleccionarEstadoAntiCliente) {
		this.jComboBoxTiposSeleccionarEstadoAntiCliente = jComboBoxTiposSeleccionarEstadoAntiCliente;
	}
	
	public void setBorderResaltarTiposSeleccionarEstadoAntiCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarEstadoAntiCliente.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarEstadoAntiCliente .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralEstadoAntiCliente() {
		return jTextFieldValorCampoGeneralEstadoAntiCliente;
	}

	public void setjTextFieldValorCampoGeneralEstadoAntiCliente(
			JTextField jTextFieldValorCampoGeneralEstadoAntiCliente) {
		this.jTextFieldValorCampoGeneralEstadoAntiCliente = jTextFieldValorCampoGeneralEstadoAntiCliente;
	}

	public void setBorderResaltarValorCampoGeneralEstadoAntiCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoAntiCliente.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralEstadoAntiCliente .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosEstadoAntiCliente() {
		return this.jCheckBoxSeleccionarTodosEstadoAntiCliente;
	}

	public void setjCheckBoxSeleccionarTodosEstadoAntiCliente(
			JCheckBox jCheckBoxSeleccionarTodosEstadoAntiCliente) {
		this.jCheckBoxSeleccionarTodosEstadoAntiCliente = jCheckBoxSeleccionarTodosEstadoAntiCliente;
	}

	public void setBorderResaltarSeleccionarTodosEstadoAntiCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoAntiCliente.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosEstadoAntiCliente .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosEstadoAntiCliente() {
		return this.jCheckBoxSeleccionadosEstadoAntiCliente;
	}

	public void setjCheckBoxSeleccionadosEstadoAntiCliente(
			JCheckBox jCheckBoxSeleccionadosEstadoAntiCliente) {
		this.jCheckBoxSeleccionadosEstadoAntiCliente = jCheckBoxSeleccionadosEstadoAntiCliente;
	}
	
	public void setBorderResaltarSeleccionadosEstadoAntiCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoAntiCliente.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosEstadoAntiCliente .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesEstadoAntiCliente() {
		return this.jComboBoxTiposArchivosReportesEstadoAntiCliente;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesEstadoAntiCliente(
			JComboBox jComboBoxTiposArchivosReportesEstadoAntiCliente) {
		this.jComboBoxTiposArchivosReportesEstadoAntiCliente = jComboBoxTiposArchivosReportesEstadoAntiCliente;
	}

	public void setBorderResaltarTiposArchivosReportesEstadoAntiCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoAntiCliente.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesEstadoAntiCliente .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesEstadoAntiCliente() {
		return this.jComboBoxTiposReportesEstadoAntiCliente;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesEstadoAntiCliente(
			JComboBox jComboBoxTiposReportesEstadoAntiCliente) {
		this.jComboBoxTiposReportesEstadoAntiCliente = jComboBoxTiposReportesEstadoAntiCliente;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoEstadoAntiCliente() {
	//	return jComboBoxTiposReportesDinamicoEstadoAntiCliente;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoEstadoAntiCliente(
	//		JComboBox jComboBoxTiposReportesDinamicoEstadoAntiCliente) {
	//	this.jComboBoxTiposReportesDinamicoEstadoAntiCliente = jComboBoxTiposReportesDinamicoEstadoAntiCliente;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoEstadoAntiCliente() {
	//	return jComboBoxTiposArchivosReportesDinamicoEstadoAntiCliente;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoEstadoAntiCliente(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoEstadoAntiCliente) {
	//	this.jComboBoxTiposArchivosReportesDinamicoEstadoAntiCliente = jComboBoxTiposArchivosReportesDinamicoEstadoAntiCliente;
	//}
	
	public void setBorderResaltarTiposReportesEstadoAntiCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoAntiCliente.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesEstadoAntiCliente .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesEstadoAntiCliente() {
		return this.jComboBoxTiposGraficosReportesEstadoAntiCliente;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesEstadoAntiCliente(
			JComboBox jComboBoxTiposGraficosReportesEstadoAntiCliente) {
		this.jComboBoxTiposGraficosReportesEstadoAntiCliente = jComboBoxTiposGraficosReportesEstadoAntiCliente;
	}
	
	public void setBorderResaltarTiposGraficosReportesEstadoAntiCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoAntiCliente.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesEstadoAntiCliente .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionEstadoAntiCliente() {
		return this.jComboBoxTiposPaginacionEstadoAntiCliente;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionEstadoAntiCliente(
			JComboBox jComboBoxTiposPaginacionEstadoAntiCliente) {
		this.jComboBoxTiposPaginacionEstadoAntiCliente = jComboBoxTiposPaginacionEstadoAntiCliente;
	}
	
	public void setBorderResaltarTiposPaginacionEstadoAntiCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoAntiCliente.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionEstadoAntiCliente .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesEstadoAntiCliente() {
		return this.jComboBoxTiposRelacionesEstadoAntiCliente;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesEstadoAntiCliente() {
		return this.jComboBoxTiposAccionesEstadoAntiCliente;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesEstadoAntiCliente(
			JComboBox jComboBoxTiposRelacionesEstadoAntiCliente) {
		this.jComboBoxTiposRelacionesEstadoAntiCliente = jComboBoxTiposRelacionesEstadoAntiCliente;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesEstadoAntiCliente(
			JComboBox jComboBoxTiposAccionesEstadoAntiCliente) {
		this.jComboBoxTiposAccionesEstadoAntiCliente = jComboBoxTiposAccionesEstadoAntiCliente;
	}
	
	public void setBorderResaltarTiposRelacionesEstadoAntiCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoAntiCliente.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesEstadoAntiCliente .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesEstadoAntiCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoAntiCliente.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesEstadoAntiCliente .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoEstadoAntiCliente() {
	//	return jCheckBoxConGraficoDinamicoEstadoAntiCliente;
	//}

	//public void setjCheckBoxConGraficoDinamicoEstadoAntiCliente(
	//		JCheckBox jCheckBoxConGraficoDinamicoEstadoAntiCliente) {
	//	this.jCheckBoxConGraficoDinamicoEstadoAntiCliente = jCheckBoxConGraficoDinamicoEstadoAntiCliente;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoEstadoAntiCliente() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarEstadoAntiCliente.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoEstadoAntiCliente .setBorder(borderResaltar);		
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
		this.estadoanticlienteSessionBean=new EstadoAntiClienteSessionBean();
		
		this.estadoanticlienteSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.estadoanticlienteSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.estadoanticlienteSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=EstadoAntiClienteJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=EstadoAntiClienteJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		EstadoAntiClienteJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		EstadoAntiClienteJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		EstadoAntiClienteJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Estado Anti Cliente MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 910) {
			iHeight=910;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.estadoanticlienteSessionBean.getEsGuardarRelacionado()) {
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
		
		EstadoAntiClienteJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("EstadoAntiCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarEstadoAntiCliente= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarEstadoAntiCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarEstadoAntiCliente,this.jTtoolBarEstadoAntiCliente,
							"nuevo","nuevo","Nuevo"+" "+EstadoAntiClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarEstadoAntiCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarEstadoAntiCliente,this.jTtoolBarEstadoAntiCliente,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarEstadoAntiCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarEstadoAntiCliente,this.jTtoolBarEstadoAntiCliente,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+EstadoAntiClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarEstadoAntiCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarEstadoAntiCliente,this.jTtoolBarEstadoAntiCliente,
							"duplicar","duplicar","Duplicar"+" "+EstadoAntiClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarEstadoAntiCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarEstadoAntiCliente,this.jTtoolBarEstadoAntiCliente,
							"copiar","copiar","Copiar"+" "+EstadoAntiClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarEstadoAntiCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarEstadoAntiCliente,this.jTtoolBarEstadoAntiCliente,
							"ver_form","ver_form","Ver"+" "+EstadoAntiClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarEstadoAntiCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEstadoAntiCliente,this.jTtoolBarEstadoAntiCliente,
							"recargar","recargar","Recargar"+" "+EstadoAntiClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarEstadoAntiCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEstadoAntiCliente,this.jTtoolBarEstadoAntiCliente,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarEstadoAntiCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEstadoAntiCliente,this.jTtoolBarEstadoAntiCliente,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarEstadoAntiCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarEstadoAntiCliente,this.jTtoolBarEstadoAntiCliente,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarEstadoAntiCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarEstadoAntiCliente,this.jTtoolBarEstadoAntiCliente,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarEstadoAntiCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarEstadoAntiCliente,this.jTtoolBarEstadoAntiCliente,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+EstadoAntiClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarEstadoAntiCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarEstadoAntiCliente,this.jTtoolBarEstadoAntiCliente,
							"cerrar","cerrar","Salir"+" "+EstadoAntiClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarEstadoAntiCliente=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarEstadoAntiCliente;
			
				this.jButtonProcesarInformacionToolBarEstadoAntiCliente=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarEstadoAntiCliente;
				
		//protected JButton jButtonModificarToolBarEstadoAntiCliente;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarEstadoAntiCliente=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuEstadoAntiCliente=new JMenuMe("General");
		this.jmenuArchivoEstadoAntiCliente=new JMenuMe("Archivo");
		this.jmenuAccionesEstadoAntiCliente=new JMenuMe("Acciones");
		this.jmenuDatosEstadoAntiCliente=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoEstadoAntiCliente= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoEstadoAntiCliente.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoEstadoAntiCliente,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoEstadoAntiCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarEstadoAntiCliente= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarEstadoAntiCliente.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarEstadoAntiCliente,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarEstadoAntiCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesEstadoAntiCliente= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesEstadoAntiCliente.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesEstadoAntiCliente,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesEstadoAntiCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosEstadoAntiCliente= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosEstadoAntiCliente.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosEstadoAntiCliente,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosEstadoAntiCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarEstadoAntiCliente= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarEstadoAntiCliente.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarEstadoAntiCliente,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarEstadoAntiCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormEstadoAntiCliente= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormEstadoAntiCliente.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormEstadoAntiCliente,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormEstadoAntiCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaEstadoAntiCliente= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaEstadoAntiCliente.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaEstadoAntiCliente,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaEstadoAntiCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarEstadoAntiCliente= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarEstadoAntiCliente.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarEstadoAntiCliente,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarEstadoAntiCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionEstadoAntiCliente= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionEstadoAntiCliente.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionEstadoAntiCliente,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionEstadoAntiCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionEstadoAntiCliente= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionEstadoAntiCliente.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionEstadoAntiCliente,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresEstadoAntiCliente= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresEstadoAntiCliente.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresEstadoAntiCliente,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresEstadoAntiCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesEstadoAntiCliente= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesEstadoAntiCliente.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesEstadoAntiCliente,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesEstadoAntiCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByEstadoAntiCliente= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByEstadoAntiCliente.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByEstadoAntiCliente,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByEstadoAntiCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarEstadoAntiCliente= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarEstadoAntiCliente.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarEstadoAntiCliente,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarEstadoAntiCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByEstadoAntiCliente= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByEstadoAntiCliente.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByEstadoAntiCliente,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByEstadoAntiCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarEstadoAntiCliente= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarEstadoAntiCliente.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarEstadoAntiCliente,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarEstadoAntiCliente, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosEstadoAntiCliente= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosEstadoAntiCliente.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosEstadoAntiCliente,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosEstadoAntiCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoEstadoAntiCliente.add(this.jMenuItemCerrarEstadoAntiCliente);
			
			this.jmenuAccionesEstadoAntiCliente.add(this.jMenuItemNuevoEstadoAntiCliente);
			this.jmenuAccionesEstadoAntiCliente.add(this.jMenuItemNuevoGuardarCambiosEstadoAntiCliente);
			this.jmenuAccionesEstadoAntiCliente.add(this.jMenuItemNuevoRelacionesEstadoAntiCliente);
			this.jmenuAccionesEstadoAntiCliente.add(this.jMenuItemGuardarCambiosTablaEstadoAntiCliente);		
			this.jmenuAccionesEstadoAntiCliente.add(this.jMenuItemDuplicarEstadoAntiCliente);		
			this.jmenuAccionesEstadoAntiCliente.add(this.jMenuItemCopiarEstadoAntiCliente);		
			this.jmenuAccionesEstadoAntiCliente.add(this.jMenuItemVerFormEstadoAntiCliente);		
			
			this.jmenuDatosEstadoAntiCliente.add(this.jMenuItemRecargarInformacionEstadoAntiCliente);				
			this.jmenuDatosEstadoAntiCliente.add(this.jMenuItemAnterioresEstadoAntiCliente);				
			this.jmenuDatosEstadoAntiCliente.add(this.jMenuItemSiguientesEstadoAntiCliente);				
			this.jmenuDatosEstadoAntiCliente.add(this.jMenuItemAbrirOrderByEstadoAntiCliente);				
			this.jmenuDatosEstadoAntiCliente.add(this.jMenuItemMostrarOcultarEstadoAntiCliente);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesEstadoAntiCliente.add(this.jMenuItemGuardarCambiosEstadoAntiCliente);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoEstadoAntiCliente, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesEstadoAntiCliente, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosEstadoAntiCliente, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarEstadoAntiCliente.add(this.jmenuArchivoEstadoAntiCliente);		
			this.jmenuBarEstadoAntiCliente.add(this.jmenuAccionesEstadoAntiCliente);		
			this.jmenuBarEstadoAntiCliente.add(this.jmenuDatosEstadoAntiCliente);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarEstadoAntiCliente);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasEstadoAntiCliente() {
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
			//this.jInternalFrameDetalleEstadoAntiCliente = new EstadoAntiClienteDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Estado Anti Cliente DATOS");
			this.jInternalFrameDetalleFormEstadoAntiCliente = new EstadoAntiClienteDetalleFormJInternalFrame(jDesktopPane,this.estadoanticlienteSessionBean.getConGuardarRelaciones(),this.estadoanticlienteSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormEstadoAntiCliente = null;//new EstadoAntiClienteDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutEstadoAntiCliente= new GridBagLayout();
		
		
		this.jTableDatosEstadoAntiCliente = new JTableMe();      
		
		String sToolTipEstadoAntiCliente="";
		sToolTipEstadoAntiCliente=EstadoAntiClienteConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipEstadoAntiCliente+="(Facturacion.EstadoAntiCliente)";
		}
		
		if(!this.estadoanticlienteSessionBean.getEsGuardarRelacionado()) {
			sToolTipEstadoAntiCliente+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosEstadoAntiCliente.setToolTipText(sToolTipEstadoAntiCliente);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosEstadoAntiCliente);
		this.jTableDatosEstadoAntiCliente.setAutoCreateRowSorter(true);
		this.jTableDatosEstadoAntiCliente.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosEstadoAntiCliente.setRowSelectionAllowed(true);
		this.jTableDatosEstadoAntiCliente.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosEstadoAntiCliente,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoEstadoAntiCliente = new JButtonMe();
		this.jButtonDuplicarEstadoAntiCliente = new JButtonMe();
		this.jButtonCopiarEstadoAntiCliente = new JButtonMe();
		this.jButtonVerFormEstadoAntiCliente = new JButtonMe();
		this.jButtonNuevoRelacionesEstadoAntiCliente = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaEstadoAntiCliente = new JButtonMe();
		this.jButtonCerrarEstadoAntiCliente = new JButtonMe();
		
		this.jScrollPanelDatosEstadoAntiCliente = new JScrollPane();   
        this.jScrollPanelDatosGeneralEstadoAntiCliente = new JScrollPane();
		
				
		
		
		this.jPanelAccionesEstadoAntiCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Estado Anti Cliente";
		
		if(!this.estadoanticlienteSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosEstadoAntiCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Anti Clientes" + this.sPath));
		} else {
			this.jScrollPanelDatosEstadoAntiCliente.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralEstadoAntiCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesEstadoAntiCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesEstadoAntiCliente.setToolTipText("Acciones");
        this.jPanelAccionesEstadoAntiCliente.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralEstadoAntiCliente, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEstadoAntiCliente, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoEstadoAntiCliente=new ReporteDinamicoJInternalFrame(EstadoAntiClienteConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoEstadoAntiCliente();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionEstadoAntiCliente=new ImportacionJInternalFrame(EstadoAntiClienteConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionEstadoAntiCliente();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByEstadoAntiCliente = new JButtonMe();
		
		this.jButtonAbrirOrderByEstadoAntiCliente.setText("Orden");
		this.jButtonAbrirOrderByEstadoAntiCliente.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByEstadoAntiCliente,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByEstadoAntiCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByEstadoAntiCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByEstadoAntiCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByEstadoAntiCliente=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEstadoAntiCliente,false,this);
			
			//this.cargarOrderByEstadoAntiCliente(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByEstadoAntiCliente=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEstadoAntiCliente,true,this);
			
			//this.cargarOrderByEstadoAntiCliente(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosEstadoAntiCliente.setMinimumSize(new Dimension(400,50));//430
		this.jTableDatosEstadoAntiCliente.setMaximumSize(new Dimension(400,50));//430
		this.jTableDatosEstadoAntiCliente.setPreferredSize(new Dimension(400,50));//430
		
		this.jScrollPanelDatosEstadoAntiCliente.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosEstadoAntiCliente.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosEstadoAntiCliente.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoEstadoAntiCliente.setText("Nuevo");
		this.jButtonDuplicarEstadoAntiCliente.setText("Duplicar");
		this.jButtonCopiarEstadoAntiCliente.setText("Copiar");
		this.jButtonVerFormEstadoAntiCliente.setText("Ver");
		this.jButtonNuevoRelacionesEstadoAntiCliente.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaEstadoAntiCliente.setText("Guardar");
		this.jButtonCerrarEstadoAntiCliente.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoEstadoAntiCliente,"nuevo_button","Nuevo",this.estadoanticlienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarEstadoAntiCliente,"duplicar_button","Duplicar",this.estadoanticlienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarEstadoAntiCliente,"copiar_button","Copiar",this.estadoanticlienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormEstadoAntiCliente,"ver_form","Ver",this.estadoanticlienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesEstadoAntiCliente,"nuevorelaciones_button","Nuevo Rel",this.estadoanticlienteSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaEstadoAntiCliente,"guardarcambiostabla_button","Guardar",this.estadoanticlienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarEstadoAntiCliente,"cerrar_button","Salir",this.estadoanticlienteSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoEstadoAntiCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarEstadoAntiCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarEstadoAntiCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormEstadoAntiCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesEstadoAntiCliente, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaEstadoAntiCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarEstadoAntiCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoEstadoAntiCliente.setToolTipText("Nuevo"+" "+EstadoAntiClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarEstadoAntiCliente.setToolTipText("Duplicar"+" "+EstadoAntiClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarEstadoAntiCliente.setToolTipText("Copiar"+" "+EstadoAntiClienteConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormEstadoAntiCliente.setToolTipText("Ver"+" "+EstadoAntiClienteConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesEstadoAntiCliente.setToolTipText("Nuevo Rel"+" "+EstadoAntiClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaEstadoAntiCliente.setToolTipText("Guardar"+" "+EstadoAntiClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarEstadoAntiCliente.setToolTipText("Salir"+" "+EstadoAntiClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoEstadoAntiCliente";
		inputMap = this.jButtonNuevoEstadoAntiCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoEstadoAntiCliente.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoEstadoAntiCliente"));
		
		//DUPLICAR
		sMapKey = "DuplicarEstadoAntiCliente";
		inputMap = this.jButtonDuplicarEstadoAntiCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarEstadoAntiCliente.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarEstadoAntiCliente"));
		
		//COPIAR
		sMapKey = "CopiarEstadoAntiCliente";
		inputMap = this.jButtonCopiarEstadoAntiCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarEstadoAntiCliente.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarEstadoAntiCliente"));
		
		//VEr FORM
		sMapKey = "VerFormEstadoAntiCliente";
		inputMap = this.jButtonVerFormEstadoAntiCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormEstadoAntiCliente.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormEstadoAntiCliente"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesEstadoAntiCliente";
		inputMap = this.jButtonNuevoRelacionesEstadoAntiCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesEstadoAntiCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesEstadoAntiCliente"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarEstadoAntiCliente";
		inputMap = this.jButtonModificarEstadoAntiCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarEstadoAntiCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarEstadoAntiCliente"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarEstadoAntiCliente";
		inputMap = this.jButtonCerrarEstadoAntiCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarEstadoAntiCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarEstadoAntiCliente"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaEstadoAntiCliente";
		inputMap = this.jButtonGuardarCambiosTablaEstadoAntiCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaEstadoAntiCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaEstadoAntiCliente"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesEstadoAntiCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesEstadoAntiCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionEstadoAntiCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1EstadoAntiCliente= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2EstadoAntiCliente= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3EstadoAntiCliente= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4EstadoAntiCliente= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5EstadoAntiCliente= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesEstadoAntiCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesEstadoAntiCliente.setName("jPanelParametrosReportesEstadoAntiCliente"); 
		
		this.jPanelParametrosReportesAccionesEstadoAntiCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesEstadoAntiCliente.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesEstadoAntiCliente.setName("jPanelParametrosReportesAccionesEstadoAntiCliente"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesEstadoAntiCliente, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesEstadoAntiCliente, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionEstadoAntiCliente = new JButtonMe();
		this.jButtonRecargarInformacionEstadoAntiCliente.setText("Recargar");
		this.jButtonRecargarInformacionEstadoAntiCliente.setToolTipText("Recargar"+" "+EstadoAntiClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionEstadoAntiCliente,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionEstadoAntiCliente = new JButtonMe();
		this.jButtonProcesarInformacionEstadoAntiCliente.setText("Procesar");
		this.jButtonProcesarInformacionEstadoAntiCliente.setToolTipText("Procesar"+" "+EstadoAntiClienteConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionEstadoAntiCliente.setVisible(false);
			
		this.jButtonProcesarInformacionEstadoAntiCliente.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionEstadoAntiCliente.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionEstadoAntiCliente.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesEstadoAntiCliente = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEstadoAntiCliente.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesEstadoAntiCliente.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesEstadoAntiCliente = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEstadoAntiCliente.setText("TIPO");       
		this.jComboBoxTiposReportesEstadoAntiCliente.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesEstadoAntiCliente = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEstadoAntiCliente.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesEstadoAntiCliente.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionEstadoAntiCliente = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionEstadoAntiCliente.setText("Paginacion");
		this.jComboBoxTiposPaginacionEstadoAntiCliente.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesEstadoAntiCliente = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesEstadoAntiCliente.setText("Accion");
		this.jComboBoxTiposRelacionesEstadoAntiCliente.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesEstadoAntiCliente = new JComboBoxMe();
		//this.jComboBoxTiposAccionesEstadoAntiCliente.setText("Accion");
		this.jComboBoxTiposAccionesEstadoAntiCliente.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarEstadoAntiCliente = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarEstadoAntiCliente.setText("Accion");
		this.jComboBoxTiposSeleccionarEstadoAntiCliente.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralEstadoAntiCliente=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralEstadoAntiCliente.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralEstadoAntiCliente.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralEstadoAntiCliente.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesEstadoAntiCliente = new JLabelMe();
		
		this.jLabelAccionesEstadoAntiCliente.setText("Acciones");		
		this.jLabelAccionesEstadoAntiCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEstadoAntiCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEstadoAntiCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosEstadoAntiCliente = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosEstadoAntiCliente.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosEstadoAntiCliente.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosEstadoAntiCliente = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosEstadoAntiCliente.setText("Seleccionados");
		this.jCheckBoxSeleccionadosEstadoAntiCliente.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaEstadoAntiCliente = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaEstadoAntiCliente.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaEstadoAntiCliente.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteEstadoAntiCliente = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteEstadoAntiCliente.setText("Graf.");
		this.jCheckBoxConGraficoReporteEstadoAntiCliente.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresEstadoAntiCliente = new JButtonMe();
		//this.jButtonAnterioresEstadoAntiCliente.setText("<<");
        this.jButtonAnterioresEstadoAntiCliente.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresEstadoAntiCliente,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresEstadoAntiCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesEstadoAntiCliente = new JButtonMe();
		//this.jButtonSiguientesEstadoAntiCliente.setText(">>");
        this.jButtonSiguientesEstadoAntiCliente.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesEstadoAntiCliente,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesEstadoAntiCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosEstadoAntiCliente = new JButtonMe();
		this.jButtonNuevoGuardarCambiosEstadoAntiCliente.setText("Nue");
        this.jButtonNuevoGuardarCambiosEstadoAntiCliente.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosEstadoAntiCliente,"nuevoguardarcambios_button","Nue",this.estadoanticlienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosEstadoAntiCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosEstadoAntiCliente";
		inputMap = this.jButtonNuevoGuardarCambiosEstadoAntiCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosEstadoAntiCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosEstadoAntiCliente"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionEstadoAntiCliente";
		inputMap = this.jButtonRecargarInformacionEstadoAntiCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionEstadoAntiCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionEstadoAntiCliente"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesEstadoAntiCliente";
		inputMap = this.jButtonSiguientesEstadoAntiCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesEstadoAntiCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesEstadoAntiCliente"));
		
		//ANTERIORES		
		sMapKey = "AnterioresEstadoAntiCliente";
		inputMap = this.jButtonAnterioresEstadoAntiCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresEstadoAntiCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresEstadoAntiCliente"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasEstadoAntiCliente();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesEstadoAntiCliente.setMinimumSize(new Dimension(this.getWidth(),EstadoAntiClienteBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EstadoAntiClienteBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesEstadoAntiCliente.setMaximumSize(new Dimension(this.getWidth(),EstadoAntiClienteBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EstadoAntiClienteBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesEstadoAntiCliente.setPreferredSize(new Dimension(this.getWidth(),EstadoAntiClienteBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EstadoAntiClienteBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionEstadoAntiCliente = new GridBagLayout();

			this.jPanelPaginacionEstadoAntiCliente.setLayout(gridaBagLayoutPaginacionEstadoAntiCliente);						
			
			this.gridBagConstraintsEstadoAntiCliente = new GridBagConstraints();
			this.gridBagConstraintsEstadoAntiCliente.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsEstadoAntiCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoAntiCliente.gridy = 0;
			this.gridBagConstraintsEstadoAntiCliente.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionEstadoAntiCliente.add(this.jButtonAnterioresEstadoAntiCliente, this.gridBagConstraintsEstadoAntiCliente);
					
						
			this.gridBagConstraintsEstadoAntiCliente = new GridBagConstraints();
			this.gridBagConstraintsEstadoAntiCliente.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsEstadoAntiCliente.gridy = 0;
			
			this.jPanelPaginacionEstadoAntiCliente.add(this.jButtonNuevoGuardarCambiosEstadoAntiCliente, this.gridBagConstraintsEstadoAntiCliente);
						
			
			this.gridBagConstraintsEstadoAntiCliente = new GridBagConstraints();
			this.gridBagConstraintsEstadoAntiCliente.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsEstadoAntiCliente.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsEstadoAntiCliente.gridy = 0;
			this.jPanelPaginacionEstadoAntiCliente.add(this.jButtonSiguientesEstadoAntiCliente, this.gridBagConstraintsEstadoAntiCliente);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsEstadoAntiCliente = new GridBagConstraints();
			this.gridBagConstraintsEstadoAntiCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoAntiCliente.gridy = 1;
			this.gridBagConstraintsEstadoAntiCliente.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEstadoAntiCliente.add(this.jButtonNuevoEstadoAntiCliente, this.gridBagConstraintsEstadoAntiCliente);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsEstadoAntiCliente = new GridBagConstraints();
				this.gridBagConstraintsEstadoAntiCliente.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsEstadoAntiCliente.gridy = 1;
				this.gridBagConstraintsEstadoAntiCliente.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionEstadoAntiCliente.add(this.jButtonNuevoRelacionesEstadoAntiCliente, this.gridBagConstraintsEstadoAntiCliente);
			}
			
			
			if(!this.estadoanticlienteSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsEstadoAntiCliente = new GridBagConstraints();
				this.gridBagConstraintsEstadoAntiCliente.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsEstadoAntiCliente.gridy = 1;
				this.gridBagConstraintsEstadoAntiCliente.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionEstadoAntiCliente.add(this.jButtonGuardarCambiosTablaEstadoAntiCliente, this.gridBagConstraintsEstadoAntiCliente);
			}
			
			
			
			this.gridBagConstraintsEstadoAntiCliente = new GridBagConstraints();
			this.gridBagConstraintsEstadoAntiCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoAntiCliente.gridy = 1;
			this.gridBagConstraintsEstadoAntiCliente.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEstadoAntiCliente.add(this.jButtonDuplicarEstadoAntiCliente, this.gridBagConstraintsEstadoAntiCliente);
			
			this.gridBagConstraintsEstadoAntiCliente = new GridBagConstraints();
			this.gridBagConstraintsEstadoAntiCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoAntiCliente.gridy = 1;
			this.gridBagConstraintsEstadoAntiCliente.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEstadoAntiCliente.add(this.jButtonCopiarEstadoAntiCliente, this.gridBagConstraintsEstadoAntiCliente);
		
			this.gridBagConstraintsEstadoAntiCliente = new GridBagConstraints();
			this.gridBagConstraintsEstadoAntiCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoAntiCliente.gridy = 1;
			this.gridBagConstraintsEstadoAntiCliente.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEstadoAntiCliente.add(this.jButtonVerFormEstadoAntiCliente, this.gridBagConstraintsEstadoAntiCliente);
		
			this.gridBagConstraintsEstadoAntiCliente = new GridBagConstraints();
			this.gridBagConstraintsEstadoAntiCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoAntiCliente.gridy = 1;
			this.gridBagConstraintsEstadoAntiCliente.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionEstadoAntiCliente.add(this.jButtonCerrarEstadoAntiCliente, this.gridBagConstraintsEstadoAntiCliente);
		
		
		
		this.jButtonRecargarInformacionEstadoAntiCliente.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionEstadoAntiCliente.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionEstadoAntiCliente.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionEstadoAntiCliente, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesEstadoAntiCliente.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesEstadoAntiCliente.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesEstadoAntiCliente.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesEstadoAntiCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesEstadoAntiCliente.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesEstadoAntiCliente.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesEstadoAntiCliente.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesEstadoAntiCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesEstadoAntiCliente.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesEstadoAntiCliente.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesEstadoAntiCliente.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesEstadoAntiCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionEstadoAntiCliente.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionEstadoAntiCliente.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionEstadoAntiCliente.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionEstadoAntiCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesEstadoAntiCliente.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesEstadoAntiCliente.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesEstadoAntiCliente.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesEstadoAntiCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesEstadoAntiCliente.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEstadoAntiCliente.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEstadoAntiCliente.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesEstadoAntiCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarEstadoAntiCliente.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarEstadoAntiCliente.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarEstadoAntiCliente.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarEstadoAntiCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaEstadoAntiCliente.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaEstadoAntiCliente.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaEstadoAntiCliente.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaEstadoAntiCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteEstadoAntiCliente.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteEstadoAntiCliente.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteEstadoAntiCliente.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteEstadoAntiCliente, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosEstadoAntiCliente.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosEstadoAntiCliente.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosEstadoAntiCliente.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosEstadoAntiCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosEstadoAntiCliente.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosEstadoAntiCliente.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosEstadoAntiCliente.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosEstadoAntiCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesEstadoAntiCliente = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesEstadoAntiCliente = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1EstadoAntiCliente = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2EstadoAntiCliente = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3EstadoAntiCliente = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4EstadoAntiCliente = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesEstadoAntiCliente.setLayout(gridaBagParametrosReportesEstadoAntiCliente);
			this.jPanelParametrosReportesAccionesEstadoAntiCliente.setLayout(gridaBagParametrosReportesAccionesEstadoAntiCliente);
			
			
			this.jPanelParametrosAuxiliar1EstadoAntiCliente.setLayout(gridaBagParametrosAuxiliar1EstadoAntiCliente);
			this.jPanelParametrosAuxiliar2EstadoAntiCliente.setLayout(gridaBagParametrosAuxiliar2EstadoAntiCliente);
			this.jPanelParametrosAuxiliar3EstadoAntiCliente.setLayout(gridaBagParametrosAuxiliar3EstadoAntiCliente);
			this.jPanelParametrosAuxiliar4EstadoAntiCliente.setLayout(gridaBagParametrosAuxiliar4EstadoAntiCliente);
			//this.jPanelParametrosAuxiliar5EstadoAntiCliente.setLayout(gridaBagParametrosAuxiliar2EstadoAntiCliente);			
			
			
			
			
			this.gridBagConstraintsEstadoAntiCliente = new GridBagConstraints();
			this.gridBagConstraintsEstadoAntiCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoAntiCliente.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEstadoAntiCliente.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstadoAntiCliente.add(this.jButtonRecargarInformacionEstadoAntiCliente, this.gridBagConstraintsEstadoAntiCliente);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsEstadoAntiCliente = new GridBagConstraints();
			this.gridBagConstraintsEstadoAntiCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoAntiCliente.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoAntiCliente.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1EstadoAntiCliente.add(this.jComboBoxTiposPaginacionEstadoAntiCliente, this.gridBagConstraintsEstadoAntiCliente);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsEstadoAntiCliente = new GridBagConstraints();
			this.gridBagConstraintsEstadoAntiCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoAntiCliente.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoAntiCliente.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1EstadoAntiCliente.add(this.jCheckBoxConAltoMaximoTablaEstadoAntiCliente, this.gridBagConstraintsEstadoAntiCliente);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsEstadoAntiCliente = new GridBagConstraints();
			this.gridBagConstraintsEstadoAntiCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoAntiCliente.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoAntiCliente.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1EstadoAntiCliente.add(this.jComboBoxTiposArchivosReportesEstadoAntiCliente, this.gridBagConstraintsEstadoAntiCliente);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsEstadoAntiCliente = new GridBagConstraints();
			this.gridBagConstraintsEstadoAntiCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoAntiCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoAntiCliente.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoAntiCliente.add(this.jPanelParametrosAuxiliar1EstadoAntiCliente, this.gridBagConstraintsEstadoAntiCliente);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsEstadoAntiCliente = new GridBagConstraints();
			this.gridBagConstraintsEstadoAntiCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoAntiCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoAntiCliente.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEstadoAntiCliente.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4EstadoAntiCliente.add(this.jComboBoxTiposReportesEstadoAntiCliente, this.gridBagConstraintsEstadoAntiCliente);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsEstadoAntiCliente = new GridBagConstraints();
			this.gridBagConstraintsEstadoAntiCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoAntiCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoAntiCliente.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoAntiCliente.add(this.jPanelParametrosAuxiliar4EstadoAntiCliente, this.gridBagConstraintsEstadoAntiCliente);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsEstadoAntiCliente = new GridBagConstraints();
			this.gridBagConstraintsEstadoAntiCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoAntiCliente.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoAntiCliente.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoAntiCliente.add(this.jComboBoxTiposReportesEstadoAntiCliente, this.gridBagConstraintsEstadoAntiCliente);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsEstadoAntiCliente = new GridBagConstraints();
			this.gridBagConstraintsEstadoAntiCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoAntiCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoAntiCliente.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEstadoAntiCliente.add(this.jCheckBoxGenerarReporteEstadoAntiCliente, this.gridBagConstraintsEstadoAntiCliente);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsEstadoAntiCliente = new GridBagConstraints();
			this.gridBagConstraintsEstadoAntiCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoAntiCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoAntiCliente.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoAntiCliente.add(this.jPanelParametrosAuxiliar2EstadoAntiCliente, this.gridBagConstraintsEstadoAntiCliente);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsEstadoAntiCliente = new GridBagConstraints();
			this.gridBagConstraintsEstadoAntiCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoAntiCliente.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEstadoAntiCliente.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEstadoAntiCliente.add(this.jLabelAccionesEstadoAntiCliente, this.gridBagConstraintsEstadoAntiCliente);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsEstadoAntiCliente = new GridBagConstraints();
				this.gridBagConstraintsEstadoAntiCliente.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsEstadoAntiCliente.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsEstadoAntiCliente.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesEstadoAntiCliente.add(this.jButtonAbrirOrderByEstadoAntiCliente, this.gridBagConstraintsEstadoAntiCliente);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsEstadoAntiCliente = new GridBagConstraints();
			this.gridBagConstraintsEstadoAntiCliente.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsEstadoAntiCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoAntiCliente.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstadoAntiCliente.add(this.jComboBoxTiposSeleccionarEstadoAntiCliente, this.gridBagConstraintsEstadoAntiCliente);			
			
			
			/*
			this.gridBagConstraintsEstadoAntiCliente = new GridBagConstraints();
			this.gridBagConstraintsEstadoAntiCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoAntiCliente.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEstadoAntiCliente.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEstadoAntiCliente.add(this.jCheckBoxSeleccionarTodosEstadoAntiCliente, this.gridBagConstraintsEstadoAntiCliente);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsEstadoAntiCliente = new GridBagConstraints();
			this.gridBagConstraintsEstadoAntiCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoAntiCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoAntiCliente.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEstadoAntiCliente.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3EstadoAntiCliente.add(this.jCheckBoxSeleccionarTodosEstadoAntiCliente, this.gridBagConstraintsEstadoAntiCliente);															
				
			this.gridBagConstraintsEstadoAntiCliente = new GridBagConstraints();
			this.gridBagConstraintsEstadoAntiCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoAntiCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoAntiCliente.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEstadoAntiCliente.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3EstadoAntiCliente.add(this.jCheckBoxSeleccionadosEstadoAntiCliente, this.gridBagConstraintsEstadoAntiCliente);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsEstadoAntiCliente = new GridBagConstraints();
			this.gridBagConstraintsEstadoAntiCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoAntiCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoAntiCliente.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoAntiCliente.add(this.jPanelParametrosAuxiliar3EstadoAntiCliente, this.gridBagConstraintsEstadoAntiCliente);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsEstadoAntiCliente = new GridBagConstraints();
			this.gridBagConstraintsEstadoAntiCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoAntiCliente.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstadoAntiCliente.add(this.jComboBoxTiposRelacionesEstadoAntiCliente, this.gridBagConstraintsEstadoAntiCliente);
				
			this.gridBagConstraintsEstadoAntiCliente = new GridBagConstraints();
			this.gridBagConstraintsEstadoAntiCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoAntiCliente.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstadoAntiCliente.add(this.jComboBoxTiposAccionesEstadoAntiCliente, this.gridBagConstraintsEstadoAntiCliente);
	
				
			this.gridBagConstraintsEstadoAntiCliente = new GridBagConstraints();
			this.gridBagConstraintsEstadoAntiCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoAntiCliente.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstadoAntiCliente.add(this.jTextFieldValorCampoGeneralEstadoAntiCliente, this.gridBagConstraintsEstadoAntiCliente);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosEstadoAntiCliente = new GridBagLayout();

			this.jScrollPanelDatosEstadoAntiCliente.setLayout(gridaBagLayoutDatosEstadoAntiCliente);
			
			this.gridBagConstraintsEstadoAntiCliente = new GridBagConstraints();
			this.gridBagConstraintsEstadoAntiCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoAntiCliente.gridy = 0;
			this.gridBagConstraintsEstadoAntiCliente.gridx = 0;
			
			this.jScrollPanelDatosEstadoAntiCliente.add(this.jTableDatosEstadoAntiCliente, this.gridBagConstraintsEstadoAntiCliente);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosEstadoAntiCliente.setViewportView(this.jTableDatosEstadoAntiCliente);
		this.jTableDatosEstadoAntiCliente.setFillsViewportHeight(true);
		this.jTableDatosEstadoAntiCliente.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesEstadoAntiCliente= new GridBagLayout();
		this.jPanelAccionesEstadoAntiCliente.setLayout(gridaBagLayoutAccionesEstadoAntiCliente);
		
		
		/*	
		this.gridBagConstraintsEstadoAntiCliente = new GridBagConstraints();
		this.gridBagConstraintsEstadoAntiCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoAntiCliente.gridy = 0;
		this.gridBagConstraintsEstadoAntiCliente.gridx = 0;
			
		this.jPanelAccionesEstadoAntiCliente.add(this.jButtonNuevoEstadoAntiCliente, this.gridBagConstraintsEstadoAntiCliente);
		*/
		int iPosXAccion=0;
		
						
		
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutEstadoAntiCliente = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutEstadoAntiCliente);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.estadoanticlienteSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsEstadoAntiCliente = new GridBagConstraints();						
			this.gridBagConstraintsEstadoAntiCliente.gridy = iGridyPrincipal++;
			this.gridBagConstraintsEstadoAntiCliente.gridx = 0;		
			//this.gridBagConstraintsEstadoAntiCliente.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoAntiCliente.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsEstadoAntiCliente.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarEstadoAntiCliente, this.gridBagConstraintsEstadoAntiCliente);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsEstadoAntiCliente = new GridBagConstraints();
		this.gridBagConstraintsEstadoAntiCliente.gridy = iGridyPrincipal++;
		this.gridBagConstraintsEstadoAntiCliente.gridx = 0;		
		//this.gridBagConstraintsEstadoAntiCliente.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoAntiCliente.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsEstadoAntiCliente.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsEstadoAntiCliente);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsEstadoAntiCliente = new GridBagConstraints();
		this.gridBagConstraintsEstadoAntiCliente.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoAntiCliente.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesEstadoAntiCliente, this.gridBagConstraintsEstadoAntiCliente);								
		
		
		/*
		this.gridBagConstraintsEstadoAntiCliente = new GridBagConstraints();
		this.gridBagConstraintsEstadoAntiCliente.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoAntiCliente.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesEstadoAntiCliente, this.gridBagConstraintsEstadoAntiCliente);
		*/		
		
		this.gridBagConstraintsEstadoAntiCliente = new GridBagConstraints();
		this.gridBagConstraintsEstadoAntiCliente.gridy =iGridyPrincipal++;
		this.gridBagConstraintsEstadoAntiCliente.gridx =0;
		this.gridBagConstraintsEstadoAntiCliente.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsEstadoAntiCliente.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosEstadoAntiCliente, this.gridBagConstraintsEstadoAntiCliente);
				
		
		this.gridBagConstraintsEstadoAntiCliente = new GridBagConstraints();
		this.gridBagConstraintsEstadoAntiCliente.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoAntiCliente.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionEstadoAntiCliente, this.gridBagConstraintsEstadoAntiCliente);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(EstadoAntiClienteJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosEstadoAntiCliente= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosEstadoAntiCliente = new GridBagLayout();
			this.jPanelBusquedasParametrosEstadoAntiCliente.setLayout(gridaBagLayoutBusquedasParametrosEstadoAntiCliente);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralEstadoAntiCliente=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralEstadoAntiCliente.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEstadoAntiCliente.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEstadoAntiCliente.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsEstadoAntiCliente = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsEstadoAntiCliente = new GridBagConstraints();
		this.gridBagConstraintsEstadoAntiCliente.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoAntiCliente.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposEstadoAntiCliente, this.gridBagConstraintsEstadoAntiCliente);
			
			
		this.gridBagConstraintsEstadoAntiCliente = new GridBagConstraints();
		this.gridBagConstraintsEstadoAntiCliente.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoAntiCliente.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosEstadoAntiCliente, this.gridBagConstraintsEstadoAntiCliente);
		
			
		this.gridBagConstraintsEstadoAntiCliente = new GridBagConstraints();
		this.gridBagConstraintsEstadoAntiCliente.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsEstadoAntiCliente.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesEstadoAntiCliente, this.gridBagConstraintsEstadoAntiCliente);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralEstadoAntiCliente;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoEstadoAntiCliente() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoEstadoAntiCliente = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoEstadoAntiCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoEstadoAntiCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoEstadoAntiCliente.setName("jPanelReporteDinamicoEstadoAntiCliente"); 
		
		this.jPanelReporteDinamicoEstadoAntiCliente.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoEstadoAntiCliente.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoEstadoAntiCliente.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoEstadoAntiCliente.setLayout(gridaBagLayoutReporteDinamicoEstadoAntiCliente);
		
		
		this.jInternalFrameReporteDinamicoEstadoAntiCliente= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoEstadoAntiCliente = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteEstadoAntiCliente= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoEstadoAntiCliente.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoEstadoAntiCliente.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoEstadoAntiCliente.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoEstadoAntiCliente.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoEstadoAntiCliente.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoEstadoAntiCliente.setResizable(true);
	    this.jInternalFrameReporteDinamicoEstadoAntiCliente.setClosable(true);
	    this.jInternalFrameReporteDinamicoEstadoAntiCliente.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoEstadoAntiCliente.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoEstadoAntiCliente.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoEstadoAntiCliente.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoEstadoAntiCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Anti Clientes"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteEstadoAntiCliente = new JLabelMe();

		this.jLabelColumnasSelectReporteEstadoAntiCliente.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteEstadoAntiCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteEstadoAntiCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteEstadoAntiCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsEstadoAntiCliente = new GridBagConstraints();
		this.gridBagConstraintsEstadoAntiCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoAntiCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoAntiCliente.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoEstadoAntiCliente.add(this.jLabelColumnasSelectReporteEstadoAntiCliente, this.gridBagConstraintsEstadoAntiCliente);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteEstadoAntiCliente = new JList<Reporte>();
		this.jListColumnasSelectReporteEstadoAntiCliente.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteEstadoAntiCliente.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteEstadoAntiCliente.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteEstadoAntiCliente.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteEstadoAntiCliente.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteEstadoAntiCliente=new JScrollPane(this.jListColumnasSelectReporteEstadoAntiCliente);
			
			this.jScrollColumnasSelectReporteEstadoAntiCliente.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteEstadoAntiCliente.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteEstadoAntiCliente.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteEstadoAntiCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsEstadoAntiCliente = new GridBagConstraints();
		this.gridBagConstraintsEstadoAntiCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoAntiCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoAntiCliente.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoEstadoAntiCliente.add(this.jListColumnasSelectReporteEstadoAntiCliente, this.gridBagConstraintsEstadoAntiCliente);
		this.jPanelReporteDinamicoEstadoAntiCliente.add(this.jScrollColumnasSelectReporteEstadoAntiCliente, this.gridBagConstraintsEstadoAntiCliente);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteEstadoAntiCliente = new JLabelMe();

		this.jLabelRelacionesSelectReporteEstadoAntiCliente.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteEstadoAntiCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteEstadoAntiCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteEstadoAntiCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsEstadoAntiCliente = new GridBagConstraints();
		this.gridBagConstraintsEstadoAntiCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoAntiCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoAntiCliente.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoEstadoAntiCliente.add(this.jLabelRelacionesSelectReporteEstadoAntiCliente, this.gridBagConstraintsEstadoAntiCliente);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteEstadoAntiCliente = new JList<Reporte>();
		this.jListRelacionesSelectReporteEstadoAntiCliente.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteEstadoAntiCliente.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteEstadoAntiCliente.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteEstadoAntiCliente.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteEstadoAntiCliente.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteEstadoAntiCliente=new JScrollPane(this.jListRelacionesSelectReporteEstadoAntiCliente);
			
			this.jScrollRelacionesSelectReporteEstadoAntiCliente.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteEstadoAntiCliente.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteEstadoAntiCliente.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteEstadoAntiCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsEstadoAntiCliente = new GridBagConstraints();
		this.gridBagConstraintsEstadoAntiCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoAntiCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoAntiCliente.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoEstadoAntiCliente.add(this.jListRelacionesSelectReporteEstadoAntiCliente, this.gridBagConstraintsEstadoAntiCliente);
		this.jPanelReporteDinamicoEstadoAntiCliente.add(this.jScrollRelacionesSelectReporteEstadoAntiCliente, this.gridBagConstraintsEstadoAntiCliente);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoEstadoAntiCliente = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoEstadoAntiCliente = new JComboBoxMe();
		this.jListColumnasValoresGraficoEstadoAntiCliente = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoEstadoAntiCliente = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoEstadoAntiCliente.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoEstadoAntiCliente.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoEstadoAntiCliente.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoEstadoAntiCliente.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoEstadoAntiCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoEstadoAntiCliente = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoEstadoAntiCliente.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoEstadoAntiCliente.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoEstadoAntiCliente.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoEstadoAntiCliente.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoEstadoAntiCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoEstadoAntiCliente = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoEstadoAntiCliente.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoEstadoAntiCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoEstadoAntiCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoEstadoAntiCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsEstadoAntiCliente = new GridBagConstraints();
		this.gridBagConstraintsEstadoAntiCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoAntiCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoAntiCliente.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEstadoAntiCliente.add(this.jLabelGenerarExcelReporteDinamicoEstadoAntiCliente, this.gridBagConstraintsEstadoAntiCliente);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoEstadoAntiCliente = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoEstadoAntiCliente.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoEstadoAntiCliente,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoEstadoAntiCliente.setToolTipText("Generar EXCEL"+" "+EstadoAntiClienteConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsEstadoAntiCliente = new GridBagConstraints();
		//this.gridBagConstraintsEstadoAntiCliente.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsEstadoAntiCliente.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsEstadoAntiCliente.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoEstadoAntiCliente.add(this.jButtonGenerarExcelReporteDinamicoEstadoAntiCliente, this.gridBagConstraintsEstadoAntiCliente);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsEstadoAntiCliente = new GridBagConstraints();
		this.gridBagConstraintsEstadoAntiCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoAntiCliente.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEstadoAntiCliente.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEstadoAntiCliente.add(this.jComboBoxTiposReportesDinamicoEstadoAntiCliente, this.gridBagConstraintsEstadoAntiCliente);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoEstadoAntiCliente = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoEstadoAntiCliente.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoEstadoAntiCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoEstadoAntiCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoEstadoAntiCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsEstadoAntiCliente = new GridBagConstraints();
		this.gridBagConstraintsEstadoAntiCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoAntiCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoAntiCliente.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEstadoAntiCliente.add(this.jLabelTiposArchivoReporteDinamicoEstadoAntiCliente, this.gridBagConstraintsEstadoAntiCliente);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsEstadoAntiCliente = new GridBagConstraints();
		this.gridBagConstraintsEstadoAntiCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoAntiCliente.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEstadoAntiCliente.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEstadoAntiCliente.add(this.jComboBoxTiposArchivosReportesDinamicoEstadoAntiCliente, this.gridBagConstraintsEstadoAntiCliente);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoEstadoAntiCliente = new JButtonMe();
		this.jButtonGenerarReporteDinamicoEstadoAntiCliente.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoEstadoAntiCliente,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoEstadoAntiCliente.setToolTipText("Generar"+" "+EstadoAntiClienteConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsEstadoAntiCliente = new GridBagConstraints();
		this.gridBagConstraintsEstadoAntiCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoAntiCliente.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEstadoAntiCliente.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEstadoAntiCliente.add(this.jButtonGenerarReporteDinamicoEstadoAntiCliente, this.gridBagConstraintsEstadoAntiCliente);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoEstadoAntiCliente = new JButtonMe();
		this.jButtonCerrarReporteDinamicoEstadoAntiCliente.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoEstadoAntiCliente,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoEstadoAntiCliente.setToolTipText("Cancelar"+" "+EstadoAntiClienteConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsEstadoAntiCliente = new GridBagConstraints();
		this.gridBagConstraintsEstadoAntiCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoAntiCliente.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEstadoAntiCliente.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEstadoAntiCliente.add(this.jButtonCerrarReporteDinamicoEstadoAntiCliente, this.gridBagConstraintsEstadoAntiCliente);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalEstadoAntiCliente = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoEstadoAntiCliente= new JScrollPane(jPanelReporteDinamicoEstadoAntiCliente,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoEstadoAntiCliente.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoEstadoAntiCliente.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoEstadoAntiCliente.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoEstadoAntiCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Anti Clientes"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsEstadoAntiCliente = new GridBagConstraints();
		this.gridBagConstraintsEstadoAntiCliente.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsEstadoAntiCliente.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsEstadoAntiCliente.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoEstadoAntiCliente.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoEstadoAntiCliente.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalEstadoAntiCliente);
		this.jInternalFrameReporteDinamicoEstadoAntiCliente.getContentPane().add(this.jScrollPanelReporteDinamicoEstadoAntiCliente, this.gridBagConstraintsEstadoAntiCliente);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionEstadoAntiCliente() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionEstadoAntiCliente = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionEstadoAntiCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionEstadoAntiCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionEstadoAntiCliente.setName("jPanelImportacionEstadoAntiCliente"); 
		
		this.jPanelImportacionEstadoAntiCliente.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionEstadoAntiCliente.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionEstadoAntiCliente.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionEstadoAntiCliente.setLayout(gridaBagLayoutImportacionEstadoAntiCliente);
		
		
		this.jInternalFrameImportacionEstadoAntiCliente= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionEstadoAntiCliente= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionEstadoAntiCliente = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteEstadoAntiCliente= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionEstadoAntiCliente.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionEstadoAntiCliente.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionEstadoAntiCliente.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionEstadoAntiCliente.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionEstadoAntiCliente.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionEstadoAntiCliente.setResizable(true);
	    this.jInternalFrameImportacionEstadoAntiCliente.setClosable(true);
	    this.jInternalFrameImportacionEstadoAntiCliente.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionEstadoAntiCliente.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionEstadoAntiCliente.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionEstadoAntiCliente.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionEstadoAntiCliente.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionEstadoAntiCliente.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionEstadoAntiCliente.setResizable(true);
	    this.jInternalFrameImportacionEstadoAntiCliente.setClosable(true);
	    this.jInternalFrameImportacionEstadoAntiCliente.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionEstadoAntiCliente.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionEstadoAntiCliente.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionEstadoAntiCliente.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionEstadoAntiCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Anti Clientes"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionEstadoAntiCliente = new JLabelMe();

		this.jLabelArchivoImportacionEstadoAntiCliente.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionEstadoAntiCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionEstadoAntiCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionEstadoAntiCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsEstadoAntiCliente = new GridBagConstraints();
		this.gridBagConstraintsEstadoAntiCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoAntiCliente.gridy = iPosYImportacion;		
		this.gridBagConstraintsEstadoAntiCliente.gridx = iPosXImportacion++;
			
		this.jPanelImportacionEstadoAntiCliente.add(this.jLabelArchivoImportacionEstadoAntiCliente, this.gridBagConstraintsEstadoAntiCliente);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionEstadoAntiCliente = new JFileChooser();		
		this.jFileChooserImportacionEstadoAntiCliente.setToolTipText("ESCOGER ARCHIVO"+" "+EstadoAntiClienteConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionEstadoAntiCliente = new JButtonMe();
		this.jButtonAbrirImportacionEstadoAntiCliente.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionEstadoAntiCliente,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionEstadoAntiCliente.setToolTipText("Generar"+" "+EstadoAntiClienteConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsEstadoAntiCliente = new GridBagConstraints();
		this.gridBagConstraintsEstadoAntiCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoAntiCliente.gridy = iPosYImportacion;
		this.gridBagConstraintsEstadoAntiCliente.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEstadoAntiCliente.add(this.jButtonAbrirImportacionEstadoAntiCliente, this.gridBagConstraintsEstadoAntiCliente);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionEstadoAntiCliente = new JLabelMe();

		this.jLabelPathArchivoImportacionEstadoAntiCliente.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionEstadoAntiCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionEstadoAntiCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionEstadoAntiCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsEstadoAntiCliente = new GridBagConstraints();
		this.gridBagConstraintsEstadoAntiCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoAntiCliente.gridy = iPosYImportacion;		
		this.gridBagConstraintsEstadoAntiCliente.gridx = iPosXImportacion++;
			
		this.jPanelImportacionEstadoAntiCliente.add(this.jLabelPathArchivoImportacionEstadoAntiCliente, this.gridBagConstraintsEstadoAntiCliente);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionEstadoAntiCliente=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionEstadoAntiCliente.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionEstadoAntiCliente.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionEstadoAntiCliente.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsEstadoAntiCliente = new GridBagConstraints();
		this.gridBagConstraintsEstadoAntiCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoAntiCliente.gridy = iPosYImportacion;
		this.gridBagConstraintsEstadoAntiCliente.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEstadoAntiCliente.add(this.jTextFieldPathArchivoImportacionEstadoAntiCliente, this.gridBagConstraintsEstadoAntiCliente);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionEstadoAntiCliente = new JButtonMe();
		this.jButtonGenerarImportacionEstadoAntiCliente.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionEstadoAntiCliente,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionEstadoAntiCliente.setToolTipText("Generar"+" "+EstadoAntiClienteConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsEstadoAntiCliente = new GridBagConstraints();
		this.gridBagConstraintsEstadoAntiCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoAntiCliente.gridy = iPosYImportacion;
		this.gridBagConstraintsEstadoAntiCliente.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEstadoAntiCliente.add(this.jButtonGenerarImportacionEstadoAntiCliente, this.gridBagConstraintsEstadoAntiCliente);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionEstadoAntiCliente = new JButtonMe();
		this.jButtonCerrarImportacionEstadoAntiCliente.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionEstadoAntiCliente,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionEstadoAntiCliente.setToolTipText("Cancelar"+" "+EstadoAntiClienteConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsEstadoAntiCliente = new GridBagConstraints();
		this.gridBagConstraintsEstadoAntiCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoAntiCliente.gridy = iPosYImportacion;
		this.gridBagConstraintsEstadoAntiCliente.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEstadoAntiCliente.add(this.jButtonCerrarImportacionEstadoAntiCliente, this.gridBagConstraintsEstadoAntiCliente);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalEstadoAntiCliente = new GridBagLayout();
		
		this.jScrollPanelImportacionEstadoAntiCliente= new JScrollPane(jPanelImportacionEstadoAntiCliente,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsEstadoAntiCliente = new GridBagConstraints();
		this.gridBagConstraintsEstadoAntiCliente.gridy =iPosYImportacion;
		this.gridBagConstraintsEstadoAntiCliente.gridx =iPosXImportacion;
		this.gridBagConstraintsEstadoAntiCliente.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionEstadoAntiCliente.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionEstadoAntiCliente.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalEstadoAntiCliente);
		this.jInternalFrameImportacionEstadoAntiCliente.getContentPane().add(this.jScrollPanelImportacionEstadoAntiCliente, this.gridBagConstraintsEstadoAntiCliente);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByEstadoAntiCliente(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByEstadoAntiCliente = new JButtonMe();
			this.jButtonAbrirOrderByEstadoAntiCliente.setText("Orden");
			this.jButtonAbrirOrderByEstadoAntiCliente.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByEstadoAntiCliente,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByEstadoAntiCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByEstadoAntiCliente";
			inputMap = this.jButtonAbrirOrderByEstadoAntiCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByEstadoAntiCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByEstadoAntiCliente"));
		
		
			GridBagLayout gridaBagLayoutOrderByEstadoAntiCliente = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByEstadoAntiCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByEstadoAntiCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByEstadoAntiCliente.setName("jPanelOrderByEstadoAntiCliente"); 
			
			this.jPanelOrderByEstadoAntiCliente.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByEstadoAntiCliente.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByEstadoAntiCliente.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByEstadoAntiCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByEstadoAntiCliente.setLayout(gridaBagLayoutOrderByEstadoAntiCliente);
			
			
			this.jTableDatosEstadoAntiClienteOrderBy = new JTableMe();        
			this.jTableDatosEstadoAntiClienteOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosEstadoAntiClienteOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosEstadoAntiClienteOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosEstadoAntiClienteOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosEstadoAntiClienteOrderBy.setViewportView(this.jTableDatosEstadoAntiClienteOrderBy);
			this.jTableDatosEstadoAntiClienteOrderBy.setFillsViewportHeight(true);
			this.jTableDatosEstadoAntiClienteOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByEstadoAntiCliente= new OrderByJInternalFrame();
			this.jInternalFrameOrderByEstadoAntiCliente= new OrderByJInternalFrame();
			this.jScrollPanelOrderByEstadoAntiCliente = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteEstadoAntiCliente= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByEstadoAntiCliente.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByEstadoAntiCliente.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByEstadoAntiCliente.setTitle("Orden");
			this.jInternalFrameOrderByEstadoAntiCliente.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByEstadoAntiCliente.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByEstadoAntiCliente.setResizable(true);
			this.jInternalFrameOrderByEstadoAntiCliente.setClosable(true);
			this.jInternalFrameOrderByEstadoAntiCliente.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByEstadoAntiCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByEstadoAntiCliente.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByEstadoAntiCliente.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByEstadoAntiCliente.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByEstadoAntiCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByEstadoAntiCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Anti Clientes"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsEstadoAntiCliente = new GridBagConstraints();
			this.gridBagConstraintsEstadoAntiCliente.gridy =iPosYOrderBy++;
			this.gridBagConstraintsEstadoAntiCliente.gridx =iPosXOrderBy;
			this.gridBagConstraintsEstadoAntiCliente.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsEstadoAntiCliente.ipady =150;
				
			this.jPanelOrderByEstadoAntiCliente.add(jScrollPanelDatosEstadoAntiClienteOrderBy, this.gridBagConstraintsEstadoAntiCliente);//this.jTableDatosEstadoAntiClienteTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByEstadoAntiCliente = new JButtonMe();
			this.jButtonCerrarOrderByEstadoAntiCliente.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByEstadoAntiCliente,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByEstadoAntiCliente.setToolTipText("Cancelar"+" "+EstadoAntiClienteConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByEstadoAntiCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsEstadoAntiCliente = new GridBagConstraints();
			this.gridBagConstraintsEstadoAntiCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoAntiCliente.gridy = iPosYOrderBy++;
			this.gridBagConstraintsEstadoAntiCliente.gridx = iPosXOrderBy;
									
			this.jPanelOrderByEstadoAntiCliente.add(this.jButtonCerrarOrderByEstadoAntiCliente, this.gridBagConstraintsEstadoAntiCliente);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalEstadoAntiCliente = new GridBagLayout();
			
			this.jScrollPanelOrderByEstadoAntiCliente= new JScrollPane(jPanelOrderByEstadoAntiCliente,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsEstadoAntiCliente = new GridBagConstraints();
			this.gridBagConstraintsEstadoAntiCliente.gridy =iPosYOrderBy;
			this.gridBagConstraintsEstadoAntiCliente.gridx =iPosXOrderBy;
			this.gridBagConstraintsEstadoAntiCliente.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByEstadoAntiCliente.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByEstadoAntiCliente.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalEstadoAntiCliente);
			
			this.jInternalFrameOrderByEstadoAntiCliente.getContentPane().add(this.jScrollPanelOrderByEstadoAntiCliente, this.gridBagConstraintsEstadoAntiCliente);			
		
		} else {
			this.jButtonAbrirOrderByEstadoAntiCliente = new JButtonMe();
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
			&& this.estadoanticlienteSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosEstadoAntiCliente.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosEstadoAntiCliente.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosEstadoAntiCliente.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosEstadoAntiCliente.getRowHeight();//EstadoAntiClienteConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.estadoanticlienteSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > EstadoAntiClienteConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaEstadoAntiCliente.isSelected()) {
					iHeightTable=EstadoAntiClienteConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < EstadoAntiClienteConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=EstadoAntiClienteConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > EstadoAntiClienteConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaEstadoAntiCliente.isSelected()) {
					iHeightTable=EstadoAntiClienteConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < EstadoAntiClienteConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=EstadoAntiClienteConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosEstadoAntiCliente.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosEstadoAntiCliente.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosEstadoAntiCliente.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosEstadoAntiCliente.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosEstadoAntiCliente.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosEstadoAntiCliente.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByEstadoAntiCliente!=null && this.jInternalFrameOrderByEstadoAntiCliente.getjTableDatosOrderBy()!=null) {
			//if(!this.estadoanticlienteSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByEstadoAntiCliente.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByEstadoAntiCliente.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByEstadoAntiCliente.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByEstadoAntiCliente.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByEstadoAntiCliente.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByEstadoAntiCliente.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByEstadoAntiCliente.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosEstadoAntiCliente.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosEstadoAntiCliente.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosEstadoAntiCliente.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=estadoanticlienteLogic.getEstadoAntiClientes().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=estadoanticlientes.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<EstadoAntiCliente> TraerEstadoAntiClienteBeans(List<EstadoAntiCliente> estadoanticlientes,ArrayList<Classe> classes)throws Exception {
		try {
			for(EstadoAntiCliente estadoanticliente:estadoanticlientes) {
					
				if(!(EstadoAntiClienteConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || EstadoAntiClienteConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					estadoanticliente.setsDetalleGeneralEntityReporte(EstadoAntiClienteConstantesFunciones.getEstadoAntiClienteDescripcion(estadoanticliente));
										
						
					
					

					if(estadoanticliente.getAnticipoClientes()!=null && Funciones.existeClass(classes,AnticipoCliente.class)) {
						try{estadoanticliente.setanticipoclientesDescripcionReporte(new JRBeanCollectionDataSource(AnticipoClienteJInternalFrame.TraerAnticipoClienteBeans(estadoanticliente.getAnticipoClientes(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//estadoanticliente.setsDetalleGeneralEntityReporte(estadoanticliente.getsDetalleGeneralEntityReporte());
										
				}
				
				//estadoanticlientebeans.add(estadoanticlientebean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return estadoanticlientes;
    }
	//PARA REPORTES FIN
}
