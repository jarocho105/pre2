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


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;

import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;

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
import com.bydan.erp.cartera.util.EstadoDetalleClienteConstantesFunciones;

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
public class EstadoDetalleClienteJInternalFrame extends EstadoDetalleClienteBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarEstadoDetalleCliente;
	
	protected JMenuBar jmenuBarEstadoDetalleCliente;
	
	protected JMenu jmenuEstadoDetalleCliente;
	protected JMenu jmenuDatosEstadoDetalleCliente;
	protected JMenu jmenuArchivoEstadoDetalleCliente;
	protected JMenu jmenuAccionesEstadoDetalleCliente;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosEstadoDetalleCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutEstadoDetalleCliente;	
	protected GridBagConstraints gridBagConstraintsEstadoDetalleCliente;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public EstadoDetalleClienteDetalleFormJInternalFrame jInternalFrameDetalleFormEstadoDetalleCliente;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoEstadoDetalleCliente;	
	protected ImportacionJInternalFrame jInternalFrameImportacionEstadoDetalleCliente;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public EstadoDetalleClienteSessionBean estadodetalleclienteSessionBean;
		
	
	
	
	//protected JDesktopPane jDesktopPane;
	public List<EstadoDetalleCliente> estadodetalleclientes;		
	public List<EstadoDetalleCliente> estadodetalleclientesEliminados;	
	public List<EstadoDetalleCliente> estadodetalleclientesAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByEstadoDetalleCliente;		
	protected JButton jButtonAbrirOrderByEstadoDetalleCliente;
	
	
	//protected JPanel jPanelOrderByEstadoDetalleCliente;
	//public JScrollPane jScrollPanelOrderByEstadoDetalleCliente;	
	//protected JButton jButtonCerrarOrderByEstadoDetalleCliente;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public EstadoDetalleClienteLogic estadodetalleclienteLogic;
	
	
	
	public JScrollPane jScrollPanelDatosEstadoDetalleCliente;
	public JScrollPane jScrollPanelDatosEdicionEstadoDetalleCliente;
	public JScrollPane jScrollPanelDatosGeneralEstadoDetalleCliente;
    
	
	
	//public JScrollPane jScrollPanelDatosEstadoDetalleClienteOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoEstadoDetalleCliente;
	//public JScrollPane jScrollPanelImportacionEstadoDetalleCliente;
	
	
	
	protected JPanel jPanelAccionesEstadoDetalleCliente;
	
    protected JPanel jPanelPaginacionEstadoDetalleCliente;
    protected JPanel jPanelParametrosReportesEstadoDetalleCliente;
	protected JPanel jPanelParametrosReportesAccionesEstadoDetalleCliente;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1EstadoDetalleCliente;
	protected JPanel jPanelParametrosAuxiliar2EstadoDetalleCliente;
	protected JPanel jPanelParametrosAuxiliar3EstadoDetalleCliente;
	protected JPanel jPanelParametrosAuxiliar4EstadoDetalleCliente;
	//protected JPanel jPanelParametrosAuxiliar5EstadoDetalleCliente;
	
	
	
	//protected JPanel jPanelReporteDinamicoEstadoDetalleCliente;
	//protected JPanel jPanelImportacionEstadoDetalleCliente;
	
	
	public JTable jTableDatosEstadoDetalleCliente;
	
	
	
	//public JTable jTableDatosEstadoDetalleClienteOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoEstadoDetalleCliente;
	protected JButton jButtonDuplicarEstadoDetalleCliente;
	protected JButton jButtonCopiarEstadoDetalleCliente;
	protected JButton jButtonVerFormEstadoDetalleCliente;
	protected JButton jButtonNuevoRelacionesEstadoDetalleCliente;
	protected JButton jButtonModificarEstadoDetalleCliente;
	
    protected JButton jButtonGuardarCambiosTablaEstadoDetalleCliente;
	protected JButton jButtonCerrarEstadoDetalleCliente;
	
	
	protected JButton jButtonRecargarInformacionEstadoDetalleCliente;
	protected JButton jButtonProcesarInformacionEstadoDetalleCliente;
	
	
	protected JButton jButtonAnterioresEstadoDetalleCliente;
	protected JButton jButtonSiguientesEstadoDetalleCliente;
	protected JButton jButtonNuevoGuardarCambiosEstadoDetalleCliente;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoEstadoDetalleCliente;
	//protected JButton jButtonCerrarReporteDinamicoEstadoDetalleCliente;
	//protected JButton jButtonGenerarExcelReporteDinamicoEstadoDetalleCliente;	
	
	
	
	//protected JButton jButtonAbrirImportacionEstadoDetalleCliente;
	//protected JButton jButtonGenerarImportacionEstadoDetalleCliente;
	//protected JButton jButtonCerrarImportacionEstadoDetalleCliente;
	//protected JFileChooser jFileChooserImportacionEstadoDetalleCliente;
	//protected File fileImportacionEstadoDetalleCliente;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarEstadoDetalleCliente;
	protected JButton jButtonDuplicarToolBarEstadoDetalleCliente;
	protected JButton jButtonNuevoRelacionesToolBarEstadoDetalleCliente;
	
	
	public JButton jButtonGuardarCambiosToolBarEstadoDetalleCliente;
	protected JButton jButtonCopiarToolBarEstadoDetalleCliente;
	protected JButton jButtonVerFormToolBarEstadoDetalleCliente;
	public JButton jButtonGuardarCambiosTablaToolBarEstadoDetalleCliente;
	protected JButton jButtonMostrarOcultarTablaToolBarEstadoDetalleCliente;
	protected JButton jButtonCerrarToolBarEstadoDetalleCliente;
	
	protected JButton jButtonRecargarInformacionToolBarEstadoDetalleCliente;
	protected JButton jButtonProcesarInformacionToolBarEstadoDetalleCliente;
	protected JButton jButtonAnterioresToolBarEstadoDetalleCliente;
	protected JButton jButtonSiguientesToolBarEstadoDetalleCliente;
	protected JButton jButtonNuevoGuardarCambiosToolBarEstadoDetalleCliente;
	protected JButton jButtonAbrirOrderByToolBarEstadoDetalleCliente;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoEstadoDetalleCliente;
	protected JMenuItem jMenuItemDuplicarEstadoDetalleCliente;
	protected JMenuItem jMenuItemNuevoRelacionesEstadoDetalleCliente;
	
	
	protected JMenuItem jMenuItemGuardarCambiosEstadoDetalleCliente;
	protected JMenuItem jMenuItemCopiarEstadoDetalleCliente;
	protected JMenuItem jMenuItemVerFormEstadoDetalleCliente;
	protected JMenuItem jMenuItemGuardarCambiosTablaEstadoDetalleCliente;
	protected JMenuItem jMenuItemCerrarEstadoDetalleCliente;
	protected JMenuItem jMenuItemDetalleCerrarEstadoDetalleCliente;
	protected JMenuItem jMenuItemDetalleAbrirOrderByEstadoDetalleCliente;
	protected JMenuItem jMenuItemDetalleMostarOcultarEstadoDetalleCliente;
	
	protected JMenuItem jMenuItemRecargarInformacionEstadoDetalleCliente;
	protected JMenuItem jMenuItemProcesarInformacionEstadoDetalleCliente;
	protected JMenuItem jMenuItemAnterioresEstadoDetalleCliente;
	protected JMenuItem jMenuItemSiguientesEstadoDetalleCliente;
	protected JMenuItem jMenuItemNuevoGuardarCambiosEstadoDetalleCliente;
	protected JMenuItem jMenuItemAbrirOrderByEstadoDetalleCliente;
	protected JMenuItem jMenuItemMostrarOcultarEstadoDetalleCliente;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesEstadoDetalleCliente;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosEstadoDetalleCliente;
	protected JCheckBox jCheckBoxSeleccionadosEstadoDetalleCliente;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaEstadoDetalleCliente;
	protected JCheckBox jCheckBoxConGraficoReporteEstadoDetalleCliente;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesEstadoDetalleCliente;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesEstadoDetalleCliente;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoEstadoDetalleCliente;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoEstadoDetalleCliente;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesEstadoDetalleCliente;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionEstadoDetalleCliente;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesEstadoDetalleCliente;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesEstadoDetalleCliente;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarEstadoDetalleCliente;
	protected JTextField jTextFieldValorCampoGeneralEstadoDetalleCliente;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteEstadoDetalleCliente;
	//public JList<Reporte> jListColumnasSelectReporteEstadoDetalleCliente;
	//public JScrollPane jScrollColumnasSelectReporteEstadoDetalleCliente;
	
	//public JLabel jLabelRelacionesSelectReporteEstadoDetalleCliente;
	//public JList<Reporte> jListRelacionesSelectReporteEstadoDetalleCliente;
	//public JScrollPane jScrollRelacionesSelectReporteEstadoDetalleCliente;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoEstadoDetalleCliente;
	//protected JCheckBox jCheckBoxConGraficoDinamicoEstadoDetalleCliente;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoEstadoDetalleCliente;
	//public JLabel jLabelTiposArchivoReporteDinamicoEstadoDetalleCliente;
	
		
	//public JLabel jLabelArchivoImportacionEstadoDetalleCliente;	
	//public JLabel jLabelPathArchivoImportacionEstadoDetalleCliente;
	//protected JTextField jTextFieldPathArchivoImportacionEstadoDetalleCliente;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoEstadoDetalleCliente;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoEstadoDetalleCliente;
	
	//public JLabel jLabelColumnaCategoriaValorEstadoDetalleCliente;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorEstadoDetalleCliente;
	
	//public JLabel jLabelColumnasValoresGraficoEstadoDetalleCliente;
	//public JList<Reporte> jListColumnasValoresGraficoEstadoDetalleCliente;
	//public JScrollPane jScrollColumnasValoresGraficoEstadoDetalleCliente;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoEstadoDetalleCliente;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoEstadoDetalleCliente;	
	
	
	
	
	
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
	public EstadoDetalleClienteJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("EstadoDetalleCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoDetalleClienteJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EstadoDetalleCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoDetalleClienteJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EstadoDetalleCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoDetalleClienteJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("EstadoDetalleCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionEstadoDetalleCliente)	{
		this.jButtonRecargarInformacionEstadoDetalleCliente = jButtonRecargarInformacionEstadoDetalleCliente;
	}
	
	public JButton getjButtonProcesarInformacionEstadoDetalleCliente() {
		return this.jButtonProcesarInformacionEstadoDetalleCliente;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionEstadoDetalleCliente)	{
		this.jButtonProcesarInformacionEstadoDetalleCliente = jButtonProcesarInformacionEstadoDetalleCliente;
	}
	
	
	public JButton getjButtonRecargarInformacionEstadoDetalleCliente() {
		return this.jButtonRecargarInformacionEstadoDetalleCliente;
	}
	
	
	public List<EstadoDetalleCliente> getestadodetalleclientes() {
		return this.estadodetalleclientes;
	}

	public void setestadodetalleclientes(List<EstadoDetalleCliente> estadodetalleclientes) {
		this.estadodetalleclientes = estadodetalleclientes;
	}
	
	public List<EstadoDetalleCliente> getestadodetalleclientesAux() {
		return this.estadodetalleclientesAux;
	}

	public void setestadodetalleclientesAux(List<EstadoDetalleCliente> estadodetalleclientesAux) {
		this.estadodetalleclientesAux = estadodetalleclientesAux;
	}
	
	public List<EstadoDetalleCliente> getestadodetalleclientesEliminados() {
		return this.estadodetalleclientesEliminados;
	}

	public void setEstadoDetalleClientesEliminados(List<EstadoDetalleCliente> estadodetalleclientesEliminados) {
		this.estadodetalleclientesEliminados = estadodetalleclientesEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarEstadoDetalleCliente() {
		return jComboBoxTiposSeleccionarEstadoDetalleCliente;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarEstadoDetalleCliente(
			JComboBox jComboBoxTiposSeleccionarEstadoDetalleCliente) {
		this.jComboBoxTiposSeleccionarEstadoDetalleCliente = jComboBoxTiposSeleccionarEstadoDetalleCliente;
	}
	
	public void setBorderResaltarTiposSeleccionarEstadoDetalleCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarEstadoDetalleCliente.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarEstadoDetalleCliente .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralEstadoDetalleCliente() {
		return jTextFieldValorCampoGeneralEstadoDetalleCliente;
	}

	public void setjTextFieldValorCampoGeneralEstadoDetalleCliente(
			JTextField jTextFieldValorCampoGeneralEstadoDetalleCliente) {
		this.jTextFieldValorCampoGeneralEstadoDetalleCliente = jTextFieldValorCampoGeneralEstadoDetalleCliente;
	}

	public void setBorderResaltarValorCampoGeneralEstadoDetalleCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoDetalleCliente.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralEstadoDetalleCliente .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosEstadoDetalleCliente() {
		return this.jCheckBoxSeleccionarTodosEstadoDetalleCliente;
	}

	public void setjCheckBoxSeleccionarTodosEstadoDetalleCliente(
			JCheckBox jCheckBoxSeleccionarTodosEstadoDetalleCliente) {
		this.jCheckBoxSeleccionarTodosEstadoDetalleCliente = jCheckBoxSeleccionarTodosEstadoDetalleCliente;
	}

	public void setBorderResaltarSeleccionarTodosEstadoDetalleCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoDetalleCliente.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosEstadoDetalleCliente .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosEstadoDetalleCliente() {
		return this.jCheckBoxSeleccionadosEstadoDetalleCliente;
	}

	public void setjCheckBoxSeleccionadosEstadoDetalleCliente(
			JCheckBox jCheckBoxSeleccionadosEstadoDetalleCliente) {
		this.jCheckBoxSeleccionadosEstadoDetalleCliente = jCheckBoxSeleccionadosEstadoDetalleCliente;
	}
	
	public void setBorderResaltarSeleccionadosEstadoDetalleCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoDetalleCliente.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosEstadoDetalleCliente .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesEstadoDetalleCliente() {
		return this.jComboBoxTiposArchivosReportesEstadoDetalleCliente;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesEstadoDetalleCliente(
			JComboBox jComboBoxTiposArchivosReportesEstadoDetalleCliente) {
		this.jComboBoxTiposArchivosReportesEstadoDetalleCliente = jComboBoxTiposArchivosReportesEstadoDetalleCliente;
	}

	public void setBorderResaltarTiposArchivosReportesEstadoDetalleCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoDetalleCliente.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesEstadoDetalleCliente .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesEstadoDetalleCliente() {
		return this.jComboBoxTiposReportesEstadoDetalleCliente;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesEstadoDetalleCliente(
			JComboBox jComboBoxTiposReportesEstadoDetalleCliente) {
		this.jComboBoxTiposReportesEstadoDetalleCliente = jComboBoxTiposReportesEstadoDetalleCliente;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoEstadoDetalleCliente() {
	//	return jComboBoxTiposReportesDinamicoEstadoDetalleCliente;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoEstadoDetalleCliente(
	//		JComboBox jComboBoxTiposReportesDinamicoEstadoDetalleCliente) {
	//	this.jComboBoxTiposReportesDinamicoEstadoDetalleCliente = jComboBoxTiposReportesDinamicoEstadoDetalleCliente;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoEstadoDetalleCliente() {
	//	return jComboBoxTiposArchivosReportesDinamicoEstadoDetalleCliente;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoEstadoDetalleCliente(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoEstadoDetalleCliente) {
	//	this.jComboBoxTiposArchivosReportesDinamicoEstadoDetalleCliente = jComboBoxTiposArchivosReportesDinamicoEstadoDetalleCliente;
	//}
	
	public void setBorderResaltarTiposReportesEstadoDetalleCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoDetalleCliente.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesEstadoDetalleCliente .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesEstadoDetalleCliente() {
		return this.jComboBoxTiposGraficosReportesEstadoDetalleCliente;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesEstadoDetalleCliente(
			JComboBox jComboBoxTiposGraficosReportesEstadoDetalleCliente) {
		this.jComboBoxTiposGraficosReportesEstadoDetalleCliente = jComboBoxTiposGraficosReportesEstadoDetalleCliente;
	}
	
	public void setBorderResaltarTiposGraficosReportesEstadoDetalleCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoDetalleCliente.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesEstadoDetalleCliente .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionEstadoDetalleCliente() {
		return this.jComboBoxTiposPaginacionEstadoDetalleCliente;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionEstadoDetalleCliente(
			JComboBox jComboBoxTiposPaginacionEstadoDetalleCliente) {
		this.jComboBoxTiposPaginacionEstadoDetalleCliente = jComboBoxTiposPaginacionEstadoDetalleCliente;
	}
	
	public void setBorderResaltarTiposPaginacionEstadoDetalleCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoDetalleCliente.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionEstadoDetalleCliente .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesEstadoDetalleCliente() {
		return this.jComboBoxTiposRelacionesEstadoDetalleCliente;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesEstadoDetalleCliente() {
		return this.jComboBoxTiposAccionesEstadoDetalleCliente;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesEstadoDetalleCliente(
			JComboBox jComboBoxTiposRelacionesEstadoDetalleCliente) {
		this.jComboBoxTiposRelacionesEstadoDetalleCliente = jComboBoxTiposRelacionesEstadoDetalleCliente;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesEstadoDetalleCliente(
			JComboBox jComboBoxTiposAccionesEstadoDetalleCliente) {
		this.jComboBoxTiposAccionesEstadoDetalleCliente = jComboBoxTiposAccionesEstadoDetalleCliente;
	}
	
	public void setBorderResaltarTiposRelacionesEstadoDetalleCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoDetalleCliente.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesEstadoDetalleCliente .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesEstadoDetalleCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoDetalleCliente.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesEstadoDetalleCliente .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoEstadoDetalleCliente() {
	//	return jCheckBoxConGraficoDinamicoEstadoDetalleCliente;
	//}

	//public void setjCheckBoxConGraficoDinamicoEstadoDetalleCliente(
	//		JCheckBox jCheckBoxConGraficoDinamicoEstadoDetalleCliente) {
	//	this.jCheckBoxConGraficoDinamicoEstadoDetalleCliente = jCheckBoxConGraficoDinamicoEstadoDetalleCliente;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoEstadoDetalleCliente() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarEstadoDetalleCliente.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoEstadoDetalleCliente .setBorder(borderResaltar);		
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
		this.estadodetalleclienteSessionBean=new EstadoDetalleClienteSessionBean();
		
		this.estadodetalleclienteSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.estadodetalleclienteSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.estadodetalleclienteSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=EstadoDetalleClienteJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=EstadoDetalleClienteJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		EstadoDetalleClienteJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		EstadoDetalleClienteJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		EstadoDetalleClienteJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Estado Detalle Cliente MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 910) {
			iHeight=910;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.estadodetalleclienteSessionBean.getEsGuardarRelacionado()) {
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
		
		EstadoDetalleClienteJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("EstadoDetalleCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarEstadoDetalleCliente= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarEstadoDetalleCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarEstadoDetalleCliente,this.jTtoolBarEstadoDetalleCliente,
							"nuevo","nuevo","Nuevo"+" "+EstadoDetalleClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarEstadoDetalleCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarEstadoDetalleCliente,this.jTtoolBarEstadoDetalleCliente,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarEstadoDetalleCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarEstadoDetalleCliente,this.jTtoolBarEstadoDetalleCliente,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+EstadoDetalleClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarEstadoDetalleCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarEstadoDetalleCliente,this.jTtoolBarEstadoDetalleCliente,
							"duplicar","duplicar","Duplicar"+" "+EstadoDetalleClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarEstadoDetalleCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarEstadoDetalleCliente,this.jTtoolBarEstadoDetalleCliente,
							"copiar","copiar","Copiar"+" "+EstadoDetalleClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarEstadoDetalleCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarEstadoDetalleCliente,this.jTtoolBarEstadoDetalleCliente,
							"ver_form","ver_form","Ver"+" "+EstadoDetalleClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarEstadoDetalleCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEstadoDetalleCliente,this.jTtoolBarEstadoDetalleCliente,
							"recargar","recargar","Recargar"+" "+EstadoDetalleClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarEstadoDetalleCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEstadoDetalleCliente,this.jTtoolBarEstadoDetalleCliente,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarEstadoDetalleCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEstadoDetalleCliente,this.jTtoolBarEstadoDetalleCliente,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarEstadoDetalleCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarEstadoDetalleCliente,this.jTtoolBarEstadoDetalleCliente,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarEstadoDetalleCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarEstadoDetalleCliente,this.jTtoolBarEstadoDetalleCliente,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarEstadoDetalleCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarEstadoDetalleCliente,this.jTtoolBarEstadoDetalleCliente,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+EstadoDetalleClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarEstadoDetalleCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarEstadoDetalleCliente,this.jTtoolBarEstadoDetalleCliente,
							"cerrar","cerrar","Salir"+" "+EstadoDetalleClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarEstadoDetalleCliente=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarEstadoDetalleCliente;
			
				this.jButtonProcesarInformacionToolBarEstadoDetalleCliente=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarEstadoDetalleCliente;
				
		//protected JButton jButtonModificarToolBarEstadoDetalleCliente;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarEstadoDetalleCliente=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuEstadoDetalleCliente=new JMenuMe("General");
		this.jmenuArchivoEstadoDetalleCliente=new JMenuMe("Archivo");
		this.jmenuAccionesEstadoDetalleCliente=new JMenuMe("Acciones");
		this.jmenuDatosEstadoDetalleCliente=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoEstadoDetalleCliente= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoEstadoDetalleCliente.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoEstadoDetalleCliente,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoEstadoDetalleCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarEstadoDetalleCliente= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarEstadoDetalleCliente.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarEstadoDetalleCliente,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarEstadoDetalleCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesEstadoDetalleCliente= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesEstadoDetalleCliente.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesEstadoDetalleCliente,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesEstadoDetalleCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosEstadoDetalleCliente= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosEstadoDetalleCliente.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosEstadoDetalleCliente,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosEstadoDetalleCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarEstadoDetalleCliente= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarEstadoDetalleCliente.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarEstadoDetalleCliente,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarEstadoDetalleCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormEstadoDetalleCliente= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormEstadoDetalleCliente.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormEstadoDetalleCliente,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormEstadoDetalleCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaEstadoDetalleCliente= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaEstadoDetalleCliente.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaEstadoDetalleCliente,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaEstadoDetalleCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarEstadoDetalleCliente= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarEstadoDetalleCliente.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarEstadoDetalleCliente,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarEstadoDetalleCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionEstadoDetalleCliente= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionEstadoDetalleCliente.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionEstadoDetalleCliente,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionEstadoDetalleCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionEstadoDetalleCliente= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionEstadoDetalleCliente.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionEstadoDetalleCliente,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresEstadoDetalleCliente= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresEstadoDetalleCliente.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresEstadoDetalleCliente,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresEstadoDetalleCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesEstadoDetalleCliente= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesEstadoDetalleCliente.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesEstadoDetalleCliente,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesEstadoDetalleCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByEstadoDetalleCliente= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByEstadoDetalleCliente.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByEstadoDetalleCliente,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByEstadoDetalleCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarEstadoDetalleCliente= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarEstadoDetalleCliente.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarEstadoDetalleCliente,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarEstadoDetalleCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByEstadoDetalleCliente= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByEstadoDetalleCliente.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByEstadoDetalleCliente,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByEstadoDetalleCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarEstadoDetalleCliente= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarEstadoDetalleCliente.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarEstadoDetalleCliente,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarEstadoDetalleCliente, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosEstadoDetalleCliente= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosEstadoDetalleCliente.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosEstadoDetalleCliente,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosEstadoDetalleCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoEstadoDetalleCliente.add(this.jMenuItemCerrarEstadoDetalleCliente);
			
			this.jmenuAccionesEstadoDetalleCliente.add(this.jMenuItemNuevoEstadoDetalleCliente);
			this.jmenuAccionesEstadoDetalleCliente.add(this.jMenuItemNuevoGuardarCambiosEstadoDetalleCliente);
			this.jmenuAccionesEstadoDetalleCliente.add(this.jMenuItemNuevoRelacionesEstadoDetalleCliente);
			this.jmenuAccionesEstadoDetalleCliente.add(this.jMenuItemGuardarCambiosTablaEstadoDetalleCliente);		
			this.jmenuAccionesEstadoDetalleCliente.add(this.jMenuItemDuplicarEstadoDetalleCliente);		
			this.jmenuAccionesEstadoDetalleCliente.add(this.jMenuItemCopiarEstadoDetalleCliente);		
			this.jmenuAccionesEstadoDetalleCliente.add(this.jMenuItemVerFormEstadoDetalleCliente);		
			
			this.jmenuDatosEstadoDetalleCliente.add(this.jMenuItemRecargarInformacionEstadoDetalleCliente);				
			this.jmenuDatosEstadoDetalleCliente.add(this.jMenuItemAnterioresEstadoDetalleCliente);				
			this.jmenuDatosEstadoDetalleCliente.add(this.jMenuItemSiguientesEstadoDetalleCliente);				
			this.jmenuDatosEstadoDetalleCliente.add(this.jMenuItemAbrirOrderByEstadoDetalleCliente);				
			this.jmenuDatosEstadoDetalleCliente.add(this.jMenuItemMostrarOcultarEstadoDetalleCliente);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesEstadoDetalleCliente.add(this.jMenuItemGuardarCambiosEstadoDetalleCliente);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoEstadoDetalleCliente, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesEstadoDetalleCliente, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosEstadoDetalleCliente, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarEstadoDetalleCliente.add(this.jmenuArchivoEstadoDetalleCliente);		
			this.jmenuBarEstadoDetalleCliente.add(this.jmenuAccionesEstadoDetalleCliente);		
			this.jmenuBarEstadoDetalleCliente.add(this.jmenuDatosEstadoDetalleCliente);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarEstadoDetalleCliente);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasEstadoDetalleCliente() {
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
			//this.jInternalFrameDetalleEstadoDetalleCliente = new EstadoDetalleClienteDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Estado Detalle Cliente DATOS");
			this.jInternalFrameDetalleFormEstadoDetalleCliente = new EstadoDetalleClienteDetalleFormJInternalFrame(jDesktopPane,this.estadodetalleclienteSessionBean.getConGuardarRelaciones(),this.estadodetalleclienteSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormEstadoDetalleCliente = null;//new EstadoDetalleClienteDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutEstadoDetalleCliente= new GridBagLayout();
		
		
		this.jTableDatosEstadoDetalleCliente = new JTableMe();      
		
		String sToolTipEstadoDetalleCliente="";
		sToolTipEstadoDetalleCliente=EstadoDetalleClienteConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipEstadoDetalleCliente+="(Cartera.EstadoDetalleCliente)";
		}
		
		if(!this.estadodetalleclienteSessionBean.getEsGuardarRelacionado()) {
			sToolTipEstadoDetalleCliente+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosEstadoDetalleCliente.setToolTipText(sToolTipEstadoDetalleCliente);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosEstadoDetalleCliente);
		this.jTableDatosEstadoDetalleCliente.setAutoCreateRowSorter(true);
		this.jTableDatosEstadoDetalleCliente.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosEstadoDetalleCliente.setRowSelectionAllowed(true);
		this.jTableDatosEstadoDetalleCliente.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosEstadoDetalleCliente,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoEstadoDetalleCliente = new JButtonMe();
		this.jButtonDuplicarEstadoDetalleCliente = new JButtonMe();
		this.jButtonCopiarEstadoDetalleCliente = new JButtonMe();
		this.jButtonVerFormEstadoDetalleCliente = new JButtonMe();
		this.jButtonNuevoRelacionesEstadoDetalleCliente = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaEstadoDetalleCliente = new JButtonMe();
		this.jButtonCerrarEstadoDetalleCliente = new JButtonMe();
		
		this.jScrollPanelDatosEstadoDetalleCliente = new JScrollPane();   
        this.jScrollPanelDatosGeneralEstadoDetalleCliente = new JScrollPane();
		
				
		
		
		this.jPanelAccionesEstadoDetalleCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Estado Detalle Cliente";
		
		if(!this.estadodetalleclienteSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosEstadoDetalleCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Detalle Clientes" + this.sPath));
		} else {
			this.jScrollPanelDatosEstadoDetalleCliente.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralEstadoDetalleCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesEstadoDetalleCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesEstadoDetalleCliente.setToolTipText("Acciones");
        this.jPanelAccionesEstadoDetalleCliente.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralEstadoDetalleCliente, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEstadoDetalleCliente, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoEstadoDetalleCliente=new ReporteDinamicoJInternalFrame(EstadoDetalleClienteConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoEstadoDetalleCliente();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionEstadoDetalleCliente=new ImportacionJInternalFrame(EstadoDetalleClienteConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionEstadoDetalleCliente();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByEstadoDetalleCliente = new JButtonMe();
		
		this.jButtonAbrirOrderByEstadoDetalleCliente.setText("Orden");
		this.jButtonAbrirOrderByEstadoDetalleCliente.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByEstadoDetalleCliente,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByEstadoDetalleCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByEstadoDetalleCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByEstadoDetalleCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByEstadoDetalleCliente=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEstadoDetalleCliente,false,this);
			
			//this.cargarOrderByEstadoDetalleCliente(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByEstadoDetalleCliente=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEstadoDetalleCliente,true,this);
			
			//this.cargarOrderByEstadoDetalleCliente(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosEstadoDetalleCliente.setMinimumSize(new Dimension(400,50));//430
		this.jTableDatosEstadoDetalleCliente.setMaximumSize(new Dimension(400,50));//430
		this.jTableDatosEstadoDetalleCliente.setPreferredSize(new Dimension(400,50));//430
		
		this.jScrollPanelDatosEstadoDetalleCliente.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosEstadoDetalleCliente.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosEstadoDetalleCliente.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoEstadoDetalleCliente.setText("Nuevo");
		this.jButtonDuplicarEstadoDetalleCliente.setText("Duplicar");
		this.jButtonCopiarEstadoDetalleCliente.setText("Copiar");
		this.jButtonVerFormEstadoDetalleCliente.setText("Ver");
		this.jButtonNuevoRelacionesEstadoDetalleCliente.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaEstadoDetalleCliente.setText("Guardar");
		this.jButtonCerrarEstadoDetalleCliente.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoEstadoDetalleCliente,"nuevo_button","Nuevo",this.estadodetalleclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarEstadoDetalleCliente,"duplicar_button","Duplicar",this.estadodetalleclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarEstadoDetalleCliente,"copiar_button","Copiar",this.estadodetalleclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormEstadoDetalleCliente,"ver_form","Ver",this.estadodetalleclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesEstadoDetalleCliente,"nuevorelaciones_button","Nuevo Rel",this.estadodetalleclienteSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaEstadoDetalleCliente,"guardarcambiostabla_button","Guardar",this.estadodetalleclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarEstadoDetalleCliente,"cerrar_button","Salir",this.estadodetalleclienteSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoEstadoDetalleCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarEstadoDetalleCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarEstadoDetalleCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormEstadoDetalleCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesEstadoDetalleCliente, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaEstadoDetalleCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarEstadoDetalleCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoEstadoDetalleCliente.setToolTipText("Nuevo"+" "+EstadoDetalleClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarEstadoDetalleCliente.setToolTipText("Duplicar"+" "+EstadoDetalleClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarEstadoDetalleCliente.setToolTipText("Copiar"+" "+EstadoDetalleClienteConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormEstadoDetalleCliente.setToolTipText("Ver"+" "+EstadoDetalleClienteConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesEstadoDetalleCliente.setToolTipText("Nuevo Rel"+" "+EstadoDetalleClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaEstadoDetalleCliente.setToolTipText("Guardar"+" "+EstadoDetalleClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarEstadoDetalleCliente.setToolTipText("Salir"+" "+EstadoDetalleClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoEstadoDetalleCliente";
		inputMap = this.jButtonNuevoEstadoDetalleCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoEstadoDetalleCliente.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoEstadoDetalleCliente"));
		
		//DUPLICAR
		sMapKey = "DuplicarEstadoDetalleCliente";
		inputMap = this.jButtonDuplicarEstadoDetalleCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarEstadoDetalleCliente.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarEstadoDetalleCliente"));
		
		//COPIAR
		sMapKey = "CopiarEstadoDetalleCliente";
		inputMap = this.jButtonCopiarEstadoDetalleCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarEstadoDetalleCliente.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarEstadoDetalleCliente"));
		
		//VEr FORM
		sMapKey = "VerFormEstadoDetalleCliente";
		inputMap = this.jButtonVerFormEstadoDetalleCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormEstadoDetalleCliente.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormEstadoDetalleCliente"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesEstadoDetalleCliente";
		inputMap = this.jButtonNuevoRelacionesEstadoDetalleCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesEstadoDetalleCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesEstadoDetalleCliente"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarEstadoDetalleCliente";
		inputMap = this.jButtonModificarEstadoDetalleCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarEstadoDetalleCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarEstadoDetalleCliente"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarEstadoDetalleCliente";
		inputMap = this.jButtonCerrarEstadoDetalleCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarEstadoDetalleCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarEstadoDetalleCliente"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaEstadoDetalleCliente";
		inputMap = this.jButtonGuardarCambiosTablaEstadoDetalleCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaEstadoDetalleCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaEstadoDetalleCliente"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesEstadoDetalleCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesEstadoDetalleCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionEstadoDetalleCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1EstadoDetalleCliente= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2EstadoDetalleCliente= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3EstadoDetalleCliente= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4EstadoDetalleCliente= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5EstadoDetalleCliente= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesEstadoDetalleCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesEstadoDetalleCliente.setName("jPanelParametrosReportesEstadoDetalleCliente"); 
		
		this.jPanelParametrosReportesAccionesEstadoDetalleCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesEstadoDetalleCliente.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesEstadoDetalleCliente.setName("jPanelParametrosReportesAccionesEstadoDetalleCliente"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesEstadoDetalleCliente, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesEstadoDetalleCliente, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionEstadoDetalleCliente = new JButtonMe();
		this.jButtonRecargarInformacionEstadoDetalleCliente.setText("Recargar");
		this.jButtonRecargarInformacionEstadoDetalleCliente.setToolTipText("Recargar"+" "+EstadoDetalleClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionEstadoDetalleCliente,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionEstadoDetalleCliente = new JButtonMe();
		this.jButtonProcesarInformacionEstadoDetalleCliente.setText("Procesar");
		this.jButtonProcesarInformacionEstadoDetalleCliente.setToolTipText("Procesar"+" "+EstadoDetalleClienteConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionEstadoDetalleCliente.setVisible(false);
			
		this.jButtonProcesarInformacionEstadoDetalleCliente.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionEstadoDetalleCliente.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionEstadoDetalleCliente.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesEstadoDetalleCliente = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEstadoDetalleCliente.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesEstadoDetalleCliente.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesEstadoDetalleCliente = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEstadoDetalleCliente.setText("TIPO");       
		this.jComboBoxTiposReportesEstadoDetalleCliente.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesEstadoDetalleCliente = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEstadoDetalleCliente.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesEstadoDetalleCliente.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionEstadoDetalleCliente = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionEstadoDetalleCliente.setText("Paginacion");
		this.jComboBoxTiposPaginacionEstadoDetalleCliente.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesEstadoDetalleCliente = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesEstadoDetalleCliente.setText("Accion");
		this.jComboBoxTiposRelacionesEstadoDetalleCliente.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesEstadoDetalleCliente = new JComboBoxMe();
		//this.jComboBoxTiposAccionesEstadoDetalleCliente.setText("Accion");
		this.jComboBoxTiposAccionesEstadoDetalleCliente.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarEstadoDetalleCliente = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarEstadoDetalleCliente.setText("Accion");
		this.jComboBoxTiposSeleccionarEstadoDetalleCliente.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralEstadoDetalleCliente=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralEstadoDetalleCliente.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralEstadoDetalleCliente.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralEstadoDetalleCliente.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesEstadoDetalleCliente = new JLabelMe();
		
		this.jLabelAccionesEstadoDetalleCliente.setText("Acciones");		
		this.jLabelAccionesEstadoDetalleCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEstadoDetalleCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEstadoDetalleCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosEstadoDetalleCliente = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosEstadoDetalleCliente.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosEstadoDetalleCliente.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosEstadoDetalleCliente = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosEstadoDetalleCliente.setText("Seleccionados");
		this.jCheckBoxSeleccionadosEstadoDetalleCliente.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaEstadoDetalleCliente = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaEstadoDetalleCliente.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaEstadoDetalleCliente.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteEstadoDetalleCliente = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteEstadoDetalleCliente.setText("Graf.");
		this.jCheckBoxConGraficoReporteEstadoDetalleCliente.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresEstadoDetalleCliente = new JButtonMe();
		//this.jButtonAnterioresEstadoDetalleCliente.setText("<<");
        this.jButtonAnterioresEstadoDetalleCliente.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresEstadoDetalleCliente,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresEstadoDetalleCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesEstadoDetalleCliente = new JButtonMe();
		//this.jButtonSiguientesEstadoDetalleCliente.setText(">>");
        this.jButtonSiguientesEstadoDetalleCliente.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesEstadoDetalleCliente,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesEstadoDetalleCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosEstadoDetalleCliente = new JButtonMe();
		this.jButtonNuevoGuardarCambiosEstadoDetalleCliente.setText("Nue");
        this.jButtonNuevoGuardarCambiosEstadoDetalleCliente.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosEstadoDetalleCliente,"nuevoguardarcambios_button","Nue",this.estadodetalleclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosEstadoDetalleCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosEstadoDetalleCliente";
		inputMap = this.jButtonNuevoGuardarCambiosEstadoDetalleCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosEstadoDetalleCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosEstadoDetalleCliente"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionEstadoDetalleCliente";
		inputMap = this.jButtonRecargarInformacionEstadoDetalleCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionEstadoDetalleCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionEstadoDetalleCliente"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesEstadoDetalleCliente";
		inputMap = this.jButtonSiguientesEstadoDetalleCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesEstadoDetalleCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesEstadoDetalleCliente"));
		
		//ANTERIORES		
		sMapKey = "AnterioresEstadoDetalleCliente";
		inputMap = this.jButtonAnterioresEstadoDetalleCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresEstadoDetalleCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresEstadoDetalleCliente"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasEstadoDetalleCliente();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesEstadoDetalleCliente.setMinimumSize(new Dimension(this.getWidth(),EstadoDetalleClienteBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EstadoDetalleClienteBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesEstadoDetalleCliente.setMaximumSize(new Dimension(this.getWidth(),EstadoDetalleClienteBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EstadoDetalleClienteBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesEstadoDetalleCliente.setPreferredSize(new Dimension(this.getWidth(),EstadoDetalleClienteBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EstadoDetalleClienteBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionEstadoDetalleCliente = new GridBagLayout();

			this.jPanelPaginacionEstadoDetalleCliente.setLayout(gridaBagLayoutPaginacionEstadoDetalleCliente);						
			
			this.gridBagConstraintsEstadoDetalleCliente = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetalleCliente.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsEstadoDetalleCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoDetalleCliente.gridy = 0;
			this.gridBagConstraintsEstadoDetalleCliente.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionEstadoDetalleCliente.add(this.jButtonAnterioresEstadoDetalleCliente, this.gridBagConstraintsEstadoDetalleCliente);
					
						
			this.gridBagConstraintsEstadoDetalleCliente = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetalleCliente.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsEstadoDetalleCliente.gridy = 0;
			
			this.jPanelPaginacionEstadoDetalleCliente.add(this.jButtonNuevoGuardarCambiosEstadoDetalleCliente, this.gridBagConstraintsEstadoDetalleCliente);
						
			
			this.gridBagConstraintsEstadoDetalleCliente = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetalleCliente.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsEstadoDetalleCliente.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsEstadoDetalleCliente.gridy = 0;
			this.jPanelPaginacionEstadoDetalleCliente.add(this.jButtonSiguientesEstadoDetalleCliente, this.gridBagConstraintsEstadoDetalleCliente);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsEstadoDetalleCliente = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetalleCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoDetalleCliente.gridy = 1;
			this.gridBagConstraintsEstadoDetalleCliente.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEstadoDetalleCliente.add(this.jButtonNuevoEstadoDetalleCliente, this.gridBagConstraintsEstadoDetalleCliente);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsEstadoDetalleCliente = new GridBagConstraints();
				this.gridBagConstraintsEstadoDetalleCliente.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsEstadoDetalleCliente.gridy = 1;
				this.gridBagConstraintsEstadoDetalleCliente.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionEstadoDetalleCliente.add(this.jButtonNuevoRelacionesEstadoDetalleCliente, this.gridBagConstraintsEstadoDetalleCliente);
			}
			
			
			if(!this.estadodetalleclienteSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsEstadoDetalleCliente = new GridBagConstraints();
				this.gridBagConstraintsEstadoDetalleCliente.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsEstadoDetalleCliente.gridy = 1;
				this.gridBagConstraintsEstadoDetalleCliente.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionEstadoDetalleCliente.add(this.jButtonGuardarCambiosTablaEstadoDetalleCliente, this.gridBagConstraintsEstadoDetalleCliente);
			}
			
			
			
			this.gridBagConstraintsEstadoDetalleCliente = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetalleCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoDetalleCliente.gridy = 1;
			this.gridBagConstraintsEstadoDetalleCliente.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEstadoDetalleCliente.add(this.jButtonDuplicarEstadoDetalleCliente, this.gridBagConstraintsEstadoDetalleCliente);
			
			this.gridBagConstraintsEstadoDetalleCliente = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetalleCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoDetalleCliente.gridy = 1;
			this.gridBagConstraintsEstadoDetalleCliente.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEstadoDetalleCliente.add(this.jButtonCopiarEstadoDetalleCliente, this.gridBagConstraintsEstadoDetalleCliente);
		
			this.gridBagConstraintsEstadoDetalleCliente = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetalleCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoDetalleCliente.gridy = 1;
			this.gridBagConstraintsEstadoDetalleCliente.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEstadoDetalleCliente.add(this.jButtonVerFormEstadoDetalleCliente, this.gridBagConstraintsEstadoDetalleCliente);
		
			this.gridBagConstraintsEstadoDetalleCliente = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetalleCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoDetalleCliente.gridy = 1;
			this.gridBagConstraintsEstadoDetalleCliente.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionEstadoDetalleCliente.add(this.jButtonCerrarEstadoDetalleCliente, this.gridBagConstraintsEstadoDetalleCliente);
		
		
		
		this.jButtonRecargarInformacionEstadoDetalleCliente.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionEstadoDetalleCliente.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionEstadoDetalleCliente.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionEstadoDetalleCliente, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesEstadoDetalleCliente.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesEstadoDetalleCliente.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesEstadoDetalleCliente.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesEstadoDetalleCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesEstadoDetalleCliente.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesEstadoDetalleCliente.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesEstadoDetalleCliente.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesEstadoDetalleCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesEstadoDetalleCliente.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesEstadoDetalleCliente.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesEstadoDetalleCliente.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesEstadoDetalleCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionEstadoDetalleCliente.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionEstadoDetalleCliente.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionEstadoDetalleCliente.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionEstadoDetalleCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesEstadoDetalleCliente.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesEstadoDetalleCliente.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesEstadoDetalleCliente.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesEstadoDetalleCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesEstadoDetalleCliente.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEstadoDetalleCliente.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEstadoDetalleCliente.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesEstadoDetalleCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarEstadoDetalleCliente.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarEstadoDetalleCliente.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarEstadoDetalleCliente.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarEstadoDetalleCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaEstadoDetalleCliente.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaEstadoDetalleCliente.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaEstadoDetalleCliente.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaEstadoDetalleCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteEstadoDetalleCliente.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteEstadoDetalleCliente.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteEstadoDetalleCliente.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteEstadoDetalleCliente, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosEstadoDetalleCliente.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosEstadoDetalleCliente.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosEstadoDetalleCliente.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosEstadoDetalleCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosEstadoDetalleCliente.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosEstadoDetalleCliente.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosEstadoDetalleCliente.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosEstadoDetalleCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesEstadoDetalleCliente = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesEstadoDetalleCliente = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1EstadoDetalleCliente = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2EstadoDetalleCliente = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3EstadoDetalleCliente = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4EstadoDetalleCliente = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesEstadoDetalleCliente.setLayout(gridaBagParametrosReportesEstadoDetalleCliente);
			this.jPanelParametrosReportesAccionesEstadoDetalleCliente.setLayout(gridaBagParametrosReportesAccionesEstadoDetalleCliente);
			
			
			this.jPanelParametrosAuxiliar1EstadoDetalleCliente.setLayout(gridaBagParametrosAuxiliar1EstadoDetalleCliente);
			this.jPanelParametrosAuxiliar2EstadoDetalleCliente.setLayout(gridaBagParametrosAuxiliar2EstadoDetalleCliente);
			this.jPanelParametrosAuxiliar3EstadoDetalleCliente.setLayout(gridaBagParametrosAuxiliar3EstadoDetalleCliente);
			this.jPanelParametrosAuxiliar4EstadoDetalleCliente.setLayout(gridaBagParametrosAuxiliar4EstadoDetalleCliente);
			//this.jPanelParametrosAuxiliar5EstadoDetalleCliente.setLayout(gridaBagParametrosAuxiliar2EstadoDetalleCliente);			
			
			
			
			
			this.gridBagConstraintsEstadoDetalleCliente = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetalleCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoDetalleCliente.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEstadoDetalleCliente.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstadoDetalleCliente.add(this.jButtonRecargarInformacionEstadoDetalleCliente, this.gridBagConstraintsEstadoDetalleCliente);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsEstadoDetalleCliente = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetalleCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoDetalleCliente.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoDetalleCliente.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1EstadoDetalleCliente.add(this.jComboBoxTiposPaginacionEstadoDetalleCliente, this.gridBagConstraintsEstadoDetalleCliente);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsEstadoDetalleCliente = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetalleCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoDetalleCliente.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoDetalleCliente.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1EstadoDetalleCliente.add(this.jCheckBoxConAltoMaximoTablaEstadoDetalleCliente, this.gridBagConstraintsEstadoDetalleCliente);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsEstadoDetalleCliente = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetalleCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoDetalleCliente.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoDetalleCliente.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1EstadoDetalleCliente.add(this.jComboBoxTiposArchivosReportesEstadoDetalleCliente, this.gridBagConstraintsEstadoDetalleCliente);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsEstadoDetalleCliente = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetalleCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoDetalleCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoDetalleCliente.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoDetalleCliente.add(this.jPanelParametrosAuxiliar1EstadoDetalleCliente, this.gridBagConstraintsEstadoDetalleCliente);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsEstadoDetalleCliente = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetalleCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoDetalleCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoDetalleCliente.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEstadoDetalleCliente.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4EstadoDetalleCliente.add(this.jComboBoxTiposReportesEstadoDetalleCliente, this.gridBagConstraintsEstadoDetalleCliente);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsEstadoDetalleCliente = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetalleCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoDetalleCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoDetalleCliente.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoDetalleCliente.add(this.jPanelParametrosAuxiliar4EstadoDetalleCliente, this.gridBagConstraintsEstadoDetalleCliente);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsEstadoDetalleCliente = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetalleCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoDetalleCliente.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoDetalleCliente.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoDetalleCliente.add(this.jComboBoxTiposReportesEstadoDetalleCliente, this.gridBagConstraintsEstadoDetalleCliente);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsEstadoDetalleCliente = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetalleCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoDetalleCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoDetalleCliente.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEstadoDetalleCliente.add(this.jCheckBoxGenerarReporteEstadoDetalleCliente, this.gridBagConstraintsEstadoDetalleCliente);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsEstadoDetalleCliente = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetalleCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoDetalleCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoDetalleCliente.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoDetalleCliente.add(this.jPanelParametrosAuxiliar2EstadoDetalleCliente, this.gridBagConstraintsEstadoDetalleCliente);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsEstadoDetalleCliente = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetalleCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoDetalleCliente.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEstadoDetalleCliente.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEstadoDetalleCliente.add(this.jLabelAccionesEstadoDetalleCliente, this.gridBagConstraintsEstadoDetalleCliente);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsEstadoDetalleCliente = new GridBagConstraints();
				this.gridBagConstraintsEstadoDetalleCliente.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsEstadoDetalleCliente.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsEstadoDetalleCliente.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesEstadoDetalleCliente.add(this.jButtonAbrirOrderByEstadoDetalleCliente, this.gridBagConstraintsEstadoDetalleCliente);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsEstadoDetalleCliente = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetalleCliente.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsEstadoDetalleCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoDetalleCliente.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstadoDetalleCliente.add(this.jComboBoxTiposSeleccionarEstadoDetalleCliente, this.gridBagConstraintsEstadoDetalleCliente);			
			
			
			/*
			this.gridBagConstraintsEstadoDetalleCliente = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetalleCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoDetalleCliente.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEstadoDetalleCliente.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEstadoDetalleCliente.add(this.jCheckBoxSeleccionarTodosEstadoDetalleCliente, this.gridBagConstraintsEstadoDetalleCliente);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsEstadoDetalleCliente = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetalleCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoDetalleCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoDetalleCliente.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEstadoDetalleCliente.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3EstadoDetalleCliente.add(this.jCheckBoxSeleccionarTodosEstadoDetalleCliente, this.gridBagConstraintsEstadoDetalleCliente);															
				
			this.gridBagConstraintsEstadoDetalleCliente = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetalleCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoDetalleCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoDetalleCliente.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEstadoDetalleCliente.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3EstadoDetalleCliente.add(this.jCheckBoxSeleccionadosEstadoDetalleCliente, this.gridBagConstraintsEstadoDetalleCliente);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsEstadoDetalleCliente = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetalleCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoDetalleCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoDetalleCliente.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoDetalleCliente.add(this.jPanelParametrosAuxiliar3EstadoDetalleCliente, this.gridBagConstraintsEstadoDetalleCliente);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsEstadoDetalleCliente = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetalleCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoDetalleCliente.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstadoDetalleCliente.add(this.jComboBoxTiposRelacionesEstadoDetalleCliente, this.gridBagConstraintsEstadoDetalleCliente);
				
			this.gridBagConstraintsEstadoDetalleCliente = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetalleCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoDetalleCliente.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstadoDetalleCliente.add(this.jComboBoxTiposAccionesEstadoDetalleCliente, this.gridBagConstraintsEstadoDetalleCliente);
	
				
			this.gridBagConstraintsEstadoDetalleCliente = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetalleCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoDetalleCliente.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstadoDetalleCliente.add(this.jTextFieldValorCampoGeneralEstadoDetalleCliente, this.gridBagConstraintsEstadoDetalleCliente);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosEstadoDetalleCliente = new GridBagLayout();

			this.jScrollPanelDatosEstadoDetalleCliente.setLayout(gridaBagLayoutDatosEstadoDetalleCliente);
			
			this.gridBagConstraintsEstadoDetalleCliente = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetalleCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoDetalleCliente.gridy = 0;
			this.gridBagConstraintsEstadoDetalleCliente.gridx = 0;
			
			this.jScrollPanelDatosEstadoDetalleCliente.add(this.jTableDatosEstadoDetalleCliente, this.gridBagConstraintsEstadoDetalleCliente);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosEstadoDetalleCliente.setViewportView(this.jTableDatosEstadoDetalleCliente);
		this.jTableDatosEstadoDetalleCliente.setFillsViewportHeight(true);
		this.jTableDatosEstadoDetalleCliente.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesEstadoDetalleCliente= new GridBagLayout();
		this.jPanelAccionesEstadoDetalleCliente.setLayout(gridaBagLayoutAccionesEstadoDetalleCliente);
		
		
		/*	
		this.gridBagConstraintsEstadoDetalleCliente = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoDetalleCliente.gridy = 0;
		this.gridBagConstraintsEstadoDetalleCliente.gridx = 0;
			
		this.jPanelAccionesEstadoDetalleCliente.add(this.jButtonNuevoEstadoDetalleCliente, this.gridBagConstraintsEstadoDetalleCliente);
		*/
		int iPosXAccion=0;
		
						
		
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutEstadoDetalleCliente = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutEstadoDetalleCliente);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.estadodetalleclienteSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsEstadoDetalleCliente = new GridBagConstraints();						
			this.gridBagConstraintsEstadoDetalleCliente.gridy = iGridyPrincipal++;
			this.gridBagConstraintsEstadoDetalleCliente.gridx = 0;		
			//this.gridBagConstraintsEstadoDetalleCliente.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoDetalleCliente.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsEstadoDetalleCliente.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarEstadoDetalleCliente, this.gridBagConstraintsEstadoDetalleCliente);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsEstadoDetalleCliente = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleCliente.gridy = iGridyPrincipal++;
		this.gridBagConstraintsEstadoDetalleCliente.gridx = 0;		
		//this.gridBagConstraintsEstadoDetalleCliente.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoDetalleCliente.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsEstadoDetalleCliente.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsEstadoDetalleCliente);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsEstadoDetalleCliente = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleCliente.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoDetalleCliente.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesEstadoDetalleCliente, this.gridBagConstraintsEstadoDetalleCliente);								
		
		
		/*
		this.gridBagConstraintsEstadoDetalleCliente = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleCliente.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoDetalleCliente.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesEstadoDetalleCliente, this.gridBagConstraintsEstadoDetalleCliente);
		*/		
		
		this.gridBagConstraintsEstadoDetalleCliente = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleCliente.gridy =iGridyPrincipal++;
		this.gridBagConstraintsEstadoDetalleCliente.gridx =0;
		this.gridBagConstraintsEstadoDetalleCliente.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsEstadoDetalleCliente.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosEstadoDetalleCliente, this.gridBagConstraintsEstadoDetalleCliente);
				
		
		this.gridBagConstraintsEstadoDetalleCliente = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleCliente.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoDetalleCliente.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionEstadoDetalleCliente, this.gridBagConstraintsEstadoDetalleCliente);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(EstadoDetalleClienteJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosEstadoDetalleCliente= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosEstadoDetalleCliente = new GridBagLayout();
			this.jPanelBusquedasParametrosEstadoDetalleCliente.setLayout(gridaBagLayoutBusquedasParametrosEstadoDetalleCliente);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralEstadoDetalleCliente=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralEstadoDetalleCliente.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEstadoDetalleCliente.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEstadoDetalleCliente.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsEstadoDetalleCliente = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsEstadoDetalleCliente = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleCliente.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoDetalleCliente.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposEstadoDetalleCliente, this.gridBagConstraintsEstadoDetalleCliente);
			
			
		this.gridBagConstraintsEstadoDetalleCliente = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleCliente.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoDetalleCliente.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosEstadoDetalleCliente, this.gridBagConstraintsEstadoDetalleCliente);
		
			
		this.gridBagConstraintsEstadoDetalleCliente = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleCliente.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsEstadoDetalleCliente.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesEstadoDetalleCliente, this.gridBagConstraintsEstadoDetalleCliente);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralEstadoDetalleCliente;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoEstadoDetalleCliente() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoEstadoDetalleCliente = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoEstadoDetalleCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoEstadoDetalleCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoEstadoDetalleCliente.setName("jPanelReporteDinamicoEstadoDetalleCliente"); 
		
		this.jPanelReporteDinamicoEstadoDetalleCliente.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoEstadoDetalleCliente.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoEstadoDetalleCliente.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoEstadoDetalleCliente.setLayout(gridaBagLayoutReporteDinamicoEstadoDetalleCliente);
		
		
		this.jInternalFrameReporteDinamicoEstadoDetalleCliente= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoEstadoDetalleCliente = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteEstadoDetalleCliente= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoEstadoDetalleCliente.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoEstadoDetalleCliente.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoEstadoDetalleCliente.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoEstadoDetalleCliente.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoEstadoDetalleCliente.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoEstadoDetalleCliente.setResizable(true);
	    this.jInternalFrameReporteDinamicoEstadoDetalleCliente.setClosable(true);
	    this.jInternalFrameReporteDinamicoEstadoDetalleCliente.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoEstadoDetalleCliente.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoEstadoDetalleCliente.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoEstadoDetalleCliente.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoEstadoDetalleCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Detalle Clientes"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteEstadoDetalleCliente = new JLabelMe();

		this.jLabelColumnasSelectReporteEstadoDetalleCliente.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteEstadoDetalleCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteEstadoDetalleCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteEstadoDetalleCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsEstadoDetalleCliente = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoDetalleCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoDetalleCliente.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoEstadoDetalleCliente.add(this.jLabelColumnasSelectReporteEstadoDetalleCliente, this.gridBagConstraintsEstadoDetalleCliente);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteEstadoDetalleCliente = new JList<Reporte>();
		this.jListColumnasSelectReporteEstadoDetalleCliente.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteEstadoDetalleCliente.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteEstadoDetalleCliente.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteEstadoDetalleCliente.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteEstadoDetalleCliente.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteEstadoDetalleCliente=new JScrollPane(this.jListColumnasSelectReporteEstadoDetalleCliente);
			
			this.jScrollColumnasSelectReporteEstadoDetalleCliente.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteEstadoDetalleCliente.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteEstadoDetalleCliente.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteEstadoDetalleCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsEstadoDetalleCliente = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoDetalleCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoDetalleCliente.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoEstadoDetalleCliente.add(this.jListColumnasSelectReporteEstadoDetalleCliente, this.gridBagConstraintsEstadoDetalleCliente);
		this.jPanelReporteDinamicoEstadoDetalleCliente.add(this.jScrollColumnasSelectReporteEstadoDetalleCliente, this.gridBagConstraintsEstadoDetalleCliente);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteEstadoDetalleCliente = new JLabelMe();

		this.jLabelRelacionesSelectReporteEstadoDetalleCliente.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteEstadoDetalleCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteEstadoDetalleCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteEstadoDetalleCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsEstadoDetalleCliente = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoDetalleCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoDetalleCliente.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoEstadoDetalleCliente.add(this.jLabelRelacionesSelectReporteEstadoDetalleCliente, this.gridBagConstraintsEstadoDetalleCliente);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteEstadoDetalleCliente = new JList<Reporte>();
		this.jListRelacionesSelectReporteEstadoDetalleCliente.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteEstadoDetalleCliente.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteEstadoDetalleCliente.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteEstadoDetalleCliente.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteEstadoDetalleCliente.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteEstadoDetalleCliente=new JScrollPane(this.jListRelacionesSelectReporteEstadoDetalleCliente);
			
			this.jScrollRelacionesSelectReporteEstadoDetalleCliente.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteEstadoDetalleCliente.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteEstadoDetalleCliente.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteEstadoDetalleCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsEstadoDetalleCliente = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoDetalleCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoDetalleCliente.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoEstadoDetalleCliente.add(this.jListRelacionesSelectReporteEstadoDetalleCliente, this.gridBagConstraintsEstadoDetalleCliente);
		this.jPanelReporteDinamicoEstadoDetalleCliente.add(this.jScrollRelacionesSelectReporteEstadoDetalleCliente, this.gridBagConstraintsEstadoDetalleCliente);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoEstadoDetalleCliente = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoEstadoDetalleCliente = new JComboBoxMe();
		this.jListColumnasValoresGraficoEstadoDetalleCliente = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoEstadoDetalleCliente = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoEstadoDetalleCliente.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoEstadoDetalleCliente.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoEstadoDetalleCliente.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoEstadoDetalleCliente.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoEstadoDetalleCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoEstadoDetalleCliente = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoEstadoDetalleCliente.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoEstadoDetalleCliente.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoEstadoDetalleCliente.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoEstadoDetalleCliente.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoEstadoDetalleCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoEstadoDetalleCliente = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoEstadoDetalleCliente.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoEstadoDetalleCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoEstadoDetalleCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoEstadoDetalleCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsEstadoDetalleCliente = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoDetalleCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoDetalleCliente.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEstadoDetalleCliente.add(this.jLabelGenerarExcelReporteDinamicoEstadoDetalleCliente, this.gridBagConstraintsEstadoDetalleCliente);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoEstadoDetalleCliente = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoEstadoDetalleCliente.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoEstadoDetalleCliente,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoEstadoDetalleCliente.setToolTipText("Generar EXCEL"+" "+EstadoDetalleClienteConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsEstadoDetalleCliente = new GridBagConstraints();
		//this.gridBagConstraintsEstadoDetalleCliente.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsEstadoDetalleCliente.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsEstadoDetalleCliente.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoEstadoDetalleCliente.add(this.jButtonGenerarExcelReporteDinamicoEstadoDetalleCliente, this.gridBagConstraintsEstadoDetalleCliente);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsEstadoDetalleCliente = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoDetalleCliente.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEstadoDetalleCliente.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEstadoDetalleCliente.add(this.jComboBoxTiposReportesDinamicoEstadoDetalleCliente, this.gridBagConstraintsEstadoDetalleCliente);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoEstadoDetalleCliente = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoEstadoDetalleCliente.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoEstadoDetalleCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoEstadoDetalleCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoEstadoDetalleCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsEstadoDetalleCliente = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoDetalleCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoDetalleCliente.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEstadoDetalleCliente.add(this.jLabelTiposArchivoReporteDinamicoEstadoDetalleCliente, this.gridBagConstraintsEstadoDetalleCliente);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsEstadoDetalleCliente = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoDetalleCliente.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEstadoDetalleCliente.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEstadoDetalleCliente.add(this.jComboBoxTiposArchivosReportesDinamicoEstadoDetalleCliente, this.gridBagConstraintsEstadoDetalleCliente);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoEstadoDetalleCliente = new JButtonMe();
		this.jButtonGenerarReporteDinamicoEstadoDetalleCliente.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoEstadoDetalleCliente,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoEstadoDetalleCliente.setToolTipText("Generar"+" "+EstadoDetalleClienteConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsEstadoDetalleCliente = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoDetalleCliente.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEstadoDetalleCliente.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEstadoDetalleCliente.add(this.jButtonGenerarReporteDinamicoEstadoDetalleCliente, this.gridBagConstraintsEstadoDetalleCliente);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoEstadoDetalleCliente = new JButtonMe();
		this.jButtonCerrarReporteDinamicoEstadoDetalleCliente.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoEstadoDetalleCliente,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoEstadoDetalleCliente.setToolTipText("Cancelar"+" "+EstadoDetalleClienteConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsEstadoDetalleCliente = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoDetalleCliente.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEstadoDetalleCliente.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEstadoDetalleCliente.add(this.jButtonCerrarReporteDinamicoEstadoDetalleCliente, this.gridBagConstraintsEstadoDetalleCliente);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalEstadoDetalleCliente = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoEstadoDetalleCliente= new JScrollPane(jPanelReporteDinamicoEstadoDetalleCliente,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoEstadoDetalleCliente.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoEstadoDetalleCliente.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoEstadoDetalleCliente.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoEstadoDetalleCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Detalle Clientes"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsEstadoDetalleCliente = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleCliente.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsEstadoDetalleCliente.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsEstadoDetalleCliente.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoEstadoDetalleCliente.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoEstadoDetalleCliente.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalEstadoDetalleCliente);
		this.jInternalFrameReporteDinamicoEstadoDetalleCliente.getContentPane().add(this.jScrollPanelReporteDinamicoEstadoDetalleCliente, this.gridBagConstraintsEstadoDetalleCliente);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionEstadoDetalleCliente() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionEstadoDetalleCliente = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionEstadoDetalleCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionEstadoDetalleCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionEstadoDetalleCliente.setName("jPanelImportacionEstadoDetalleCliente"); 
		
		this.jPanelImportacionEstadoDetalleCliente.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionEstadoDetalleCliente.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionEstadoDetalleCliente.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionEstadoDetalleCliente.setLayout(gridaBagLayoutImportacionEstadoDetalleCliente);
		
		
		this.jInternalFrameImportacionEstadoDetalleCliente= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionEstadoDetalleCliente= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionEstadoDetalleCliente = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteEstadoDetalleCliente= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionEstadoDetalleCliente.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionEstadoDetalleCliente.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionEstadoDetalleCliente.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionEstadoDetalleCliente.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionEstadoDetalleCliente.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionEstadoDetalleCliente.setResizable(true);
	    this.jInternalFrameImportacionEstadoDetalleCliente.setClosable(true);
	    this.jInternalFrameImportacionEstadoDetalleCliente.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionEstadoDetalleCliente.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionEstadoDetalleCliente.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionEstadoDetalleCliente.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionEstadoDetalleCliente.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionEstadoDetalleCliente.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionEstadoDetalleCliente.setResizable(true);
	    this.jInternalFrameImportacionEstadoDetalleCliente.setClosable(true);
	    this.jInternalFrameImportacionEstadoDetalleCliente.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionEstadoDetalleCliente.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionEstadoDetalleCliente.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionEstadoDetalleCliente.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionEstadoDetalleCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Detalle Clientes"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionEstadoDetalleCliente = new JLabelMe();

		this.jLabelArchivoImportacionEstadoDetalleCliente.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionEstadoDetalleCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionEstadoDetalleCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionEstadoDetalleCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsEstadoDetalleCliente = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoDetalleCliente.gridy = iPosYImportacion;		
		this.gridBagConstraintsEstadoDetalleCliente.gridx = iPosXImportacion++;
			
		this.jPanelImportacionEstadoDetalleCliente.add(this.jLabelArchivoImportacionEstadoDetalleCliente, this.gridBagConstraintsEstadoDetalleCliente);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionEstadoDetalleCliente = new JFileChooser();		
		this.jFileChooserImportacionEstadoDetalleCliente.setToolTipText("ESCOGER ARCHIVO"+" "+EstadoDetalleClienteConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionEstadoDetalleCliente = new JButtonMe();
		this.jButtonAbrirImportacionEstadoDetalleCliente.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionEstadoDetalleCliente,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionEstadoDetalleCliente.setToolTipText("Generar"+" "+EstadoDetalleClienteConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsEstadoDetalleCliente = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoDetalleCliente.gridy = iPosYImportacion;
		this.gridBagConstraintsEstadoDetalleCliente.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEstadoDetalleCliente.add(this.jButtonAbrirImportacionEstadoDetalleCliente, this.gridBagConstraintsEstadoDetalleCliente);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionEstadoDetalleCliente = new JLabelMe();

		this.jLabelPathArchivoImportacionEstadoDetalleCliente.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionEstadoDetalleCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionEstadoDetalleCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionEstadoDetalleCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsEstadoDetalleCliente = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoDetalleCliente.gridy = iPosYImportacion;		
		this.gridBagConstraintsEstadoDetalleCliente.gridx = iPosXImportacion++;
			
		this.jPanelImportacionEstadoDetalleCliente.add(this.jLabelPathArchivoImportacionEstadoDetalleCliente, this.gridBagConstraintsEstadoDetalleCliente);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionEstadoDetalleCliente=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionEstadoDetalleCliente.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionEstadoDetalleCliente.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionEstadoDetalleCliente.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsEstadoDetalleCliente = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoDetalleCliente.gridy = iPosYImportacion;
		this.gridBagConstraintsEstadoDetalleCliente.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEstadoDetalleCliente.add(this.jTextFieldPathArchivoImportacionEstadoDetalleCliente, this.gridBagConstraintsEstadoDetalleCliente);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionEstadoDetalleCliente = new JButtonMe();
		this.jButtonGenerarImportacionEstadoDetalleCliente.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionEstadoDetalleCliente,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionEstadoDetalleCliente.setToolTipText("Generar"+" "+EstadoDetalleClienteConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsEstadoDetalleCliente = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoDetalleCliente.gridy = iPosYImportacion;
		this.gridBagConstraintsEstadoDetalleCliente.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEstadoDetalleCliente.add(this.jButtonGenerarImportacionEstadoDetalleCliente, this.gridBagConstraintsEstadoDetalleCliente);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionEstadoDetalleCliente = new JButtonMe();
		this.jButtonCerrarImportacionEstadoDetalleCliente.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionEstadoDetalleCliente,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionEstadoDetalleCliente.setToolTipText("Cancelar"+" "+EstadoDetalleClienteConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsEstadoDetalleCliente = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoDetalleCliente.gridy = iPosYImportacion;
		this.gridBagConstraintsEstadoDetalleCliente.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEstadoDetalleCliente.add(this.jButtonCerrarImportacionEstadoDetalleCliente, this.gridBagConstraintsEstadoDetalleCliente);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalEstadoDetalleCliente = new GridBagLayout();
		
		this.jScrollPanelImportacionEstadoDetalleCliente= new JScrollPane(jPanelImportacionEstadoDetalleCliente,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsEstadoDetalleCliente = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleCliente.gridy =iPosYImportacion;
		this.gridBagConstraintsEstadoDetalleCliente.gridx =iPosXImportacion;
		this.gridBagConstraintsEstadoDetalleCliente.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionEstadoDetalleCliente.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionEstadoDetalleCliente.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalEstadoDetalleCliente);
		this.jInternalFrameImportacionEstadoDetalleCliente.getContentPane().add(this.jScrollPanelImportacionEstadoDetalleCliente, this.gridBagConstraintsEstadoDetalleCliente);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByEstadoDetalleCliente(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByEstadoDetalleCliente = new JButtonMe();
			this.jButtonAbrirOrderByEstadoDetalleCliente.setText("Orden");
			this.jButtonAbrirOrderByEstadoDetalleCliente.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByEstadoDetalleCliente,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByEstadoDetalleCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByEstadoDetalleCliente";
			inputMap = this.jButtonAbrirOrderByEstadoDetalleCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByEstadoDetalleCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByEstadoDetalleCliente"));
		
		
			GridBagLayout gridaBagLayoutOrderByEstadoDetalleCliente = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByEstadoDetalleCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByEstadoDetalleCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByEstadoDetalleCliente.setName("jPanelOrderByEstadoDetalleCliente"); 
			
			this.jPanelOrderByEstadoDetalleCliente.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByEstadoDetalleCliente.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByEstadoDetalleCliente.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByEstadoDetalleCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByEstadoDetalleCliente.setLayout(gridaBagLayoutOrderByEstadoDetalleCliente);
			
			
			this.jTableDatosEstadoDetalleClienteOrderBy = new JTableMe();        
			this.jTableDatosEstadoDetalleClienteOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosEstadoDetalleClienteOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosEstadoDetalleClienteOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosEstadoDetalleClienteOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosEstadoDetalleClienteOrderBy.setViewportView(this.jTableDatosEstadoDetalleClienteOrderBy);
			this.jTableDatosEstadoDetalleClienteOrderBy.setFillsViewportHeight(true);
			this.jTableDatosEstadoDetalleClienteOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByEstadoDetalleCliente= new OrderByJInternalFrame();
			this.jInternalFrameOrderByEstadoDetalleCliente= new OrderByJInternalFrame();
			this.jScrollPanelOrderByEstadoDetalleCliente = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteEstadoDetalleCliente= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByEstadoDetalleCliente.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByEstadoDetalleCliente.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByEstadoDetalleCliente.setTitle("Orden");
			this.jInternalFrameOrderByEstadoDetalleCliente.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByEstadoDetalleCliente.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByEstadoDetalleCliente.setResizable(true);
			this.jInternalFrameOrderByEstadoDetalleCliente.setClosable(true);
			this.jInternalFrameOrderByEstadoDetalleCliente.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByEstadoDetalleCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByEstadoDetalleCliente.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByEstadoDetalleCliente.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByEstadoDetalleCliente.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByEstadoDetalleCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByEstadoDetalleCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Detalle Clientes"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsEstadoDetalleCliente = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetalleCliente.gridy =iPosYOrderBy++;
			this.gridBagConstraintsEstadoDetalleCliente.gridx =iPosXOrderBy;
			this.gridBagConstraintsEstadoDetalleCliente.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsEstadoDetalleCliente.ipady =150;
				
			this.jPanelOrderByEstadoDetalleCliente.add(jScrollPanelDatosEstadoDetalleClienteOrderBy, this.gridBagConstraintsEstadoDetalleCliente);//this.jTableDatosEstadoDetalleClienteTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByEstadoDetalleCliente = new JButtonMe();
			this.jButtonCerrarOrderByEstadoDetalleCliente.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByEstadoDetalleCliente,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByEstadoDetalleCliente.setToolTipText("Cancelar"+" "+EstadoDetalleClienteConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByEstadoDetalleCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsEstadoDetalleCliente = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetalleCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoDetalleCliente.gridy = iPosYOrderBy++;
			this.gridBagConstraintsEstadoDetalleCliente.gridx = iPosXOrderBy;
									
			this.jPanelOrderByEstadoDetalleCliente.add(this.jButtonCerrarOrderByEstadoDetalleCliente, this.gridBagConstraintsEstadoDetalleCliente);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalEstadoDetalleCliente = new GridBagLayout();
			
			this.jScrollPanelOrderByEstadoDetalleCliente= new JScrollPane(jPanelOrderByEstadoDetalleCliente,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsEstadoDetalleCliente = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetalleCliente.gridy =iPosYOrderBy;
			this.gridBagConstraintsEstadoDetalleCliente.gridx =iPosXOrderBy;
			this.gridBagConstraintsEstadoDetalleCliente.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByEstadoDetalleCliente.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByEstadoDetalleCliente.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalEstadoDetalleCliente);
			
			this.jInternalFrameOrderByEstadoDetalleCliente.getContentPane().add(this.jScrollPanelOrderByEstadoDetalleCliente, this.gridBagConstraintsEstadoDetalleCliente);			
		
		} else {
			this.jButtonAbrirOrderByEstadoDetalleCliente = new JButtonMe();
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
		int iWidthTableCalculado=0;//1030
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=430;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=300;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=300;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.estadodetalleclienteSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosEstadoDetalleCliente.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosEstadoDetalleCliente.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosEstadoDetalleCliente.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosEstadoDetalleCliente.getRowHeight();//EstadoDetalleClienteConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.estadodetalleclienteSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > EstadoDetalleClienteConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaEstadoDetalleCliente.isSelected()) {
					iHeightTable=EstadoDetalleClienteConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < EstadoDetalleClienteConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=EstadoDetalleClienteConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > EstadoDetalleClienteConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaEstadoDetalleCliente.isSelected()) {
					iHeightTable=EstadoDetalleClienteConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < EstadoDetalleClienteConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=EstadoDetalleClienteConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosEstadoDetalleCliente.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosEstadoDetalleCliente.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosEstadoDetalleCliente.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosEstadoDetalleCliente.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosEstadoDetalleCliente.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosEstadoDetalleCliente.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByEstadoDetalleCliente!=null && this.jInternalFrameOrderByEstadoDetalleCliente.getjTableDatosOrderBy()!=null) {
			//if(!this.estadodetalleclienteSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByEstadoDetalleCliente.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByEstadoDetalleCliente.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByEstadoDetalleCliente.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByEstadoDetalleCliente.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByEstadoDetalleCliente.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByEstadoDetalleCliente.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByEstadoDetalleCliente.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosEstadoDetalleCliente.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosEstadoDetalleCliente.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosEstadoDetalleCliente.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=estadodetalleclienteLogic.getEstadoDetalleClientes().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=estadodetalleclientes.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<EstadoDetalleCliente> TraerEstadoDetalleClienteBeans(List<EstadoDetalleCliente> estadodetalleclientes,ArrayList<Classe> classes)throws Exception {
		try {
			for(EstadoDetalleCliente estadodetallecliente:estadodetalleclientes) {
					
				if(!(EstadoDetalleClienteConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || EstadoDetalleClienteConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					estadodetallecliente.setsDetalleGeneralEntityReporte(EstadoDetalleClienteConstantesFunciones.getEstadoDetalleClienteDescripcion(estadodetallecliente));
										
						
					
					

					if(estadodetallecliente.getDetalleProves()!=null && Funciones.existeClass(classes,DetalleProve.class)) {
						try{estadodetallecliente.setdetalleprovesDescripcionReporte(new JRBeanCollectionDataSource(DetalleProveJInternalFrame.TraerDetalleProveBeans(estadodetallecliente.getDetalleProves(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(estadodetallecliente.getDetalleMoviClienProves()!=null && Funciones.existeClass(classes,DetalleMoviClienProve.class)) {
						try{estadodetallecliente.setdetallemoviclienprovesDescripcionReporte(new JRBeanCollectionDataSource(DetalleMoviClienProveJInternalFrame.TraerDetalleMoviClienProveBeans(estadodetallecliente.getDetalleMoviClienProves(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(estadodetallecliente.getDetalleClientes()!=null && Funciones.existeClass(classes,DetalleCliente.class)) {
						try{estadodetallecliente.setdetalleclientesDescripcionReporte(new JRBeanCollectionDataSource(DetalleClienteJInternalFrame.TraerDetalleClienteBeans(estadodetallecliente.getDetalleClientes(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//estadodetallecliente.setsDetalleGeneralEntityReporte(estadodetallecliente.getsDetalleGeneralEntityReporte());
										
				}
				
				//estadodetalleclientebeans.add(estadodetalleclientebean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return estadodetalleclientes;
    }
	//PARA REPORTES FIN
}
