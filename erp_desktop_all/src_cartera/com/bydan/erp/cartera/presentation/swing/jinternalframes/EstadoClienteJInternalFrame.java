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
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.sris.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.*;
import com.bydan.erp.importaciones.presentation.swing.jinternalframes.*;
import com.bydan.erp.produccion.presentation.swing.jinternalframes.*;

import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.sris.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.importaciones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.produccion.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.comisiones.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.sris.business.entity.*;
import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.puntoventa.business.entity.*;
import com.bydan.erp.activosfijos.business.entity.*;
import com.bydan.erp.importaciones.business.entity.*;
import com.bydan.erp.produccion.business.entity.*;

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
import com.bydan.erp.cartera.util.EstadoClienteConstantesFunciones;

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
public class EstadoClienteJInternalFrame extends EstadoClienteBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarEstadoCliente;
	
	protected JMenuBar jmenuBarEstadoCliente;
	
	protected JMenu jmenuEstadoCliente;
	protected JMenu jmenuDatosEstadoCliente;
	protected JMenu jmenuArchivoEstadoCliente;
	protected JMenu jmenuAccionesEstadoCliente;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosEstadoCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutEstadoCliente;	
	protected GridBagConstraints gridBagConstraintsEstadoCliente;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public EstadoClienteDetalleFormJInternalFrame jInternalFrameDetalleFormEstadoCliente;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoEstadoCliente;	
	protected ImportacionJInternalFrame jInternalFrameImportacionEstadoCliente;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public EstadoClienteSessionBean estadoclienteSessionBean;
		
	
	
	
	//protected JDesktopPane jDesktopPane;
	public List<EstadoCliente> estadoclientes;		
	public List<EstadoCliente> estadoclientesEliminados;	
	public List<EstadoCliente> estadoclientesAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByEstadoCliente;		
	protected JButton jButtonAbrirOrderByEstadoCliente;
	
	
	//protected JPanel jPanelOrderByEstadoCliente;
	//public JScrollPane jScrollPanelOrderByEstadoCliente;	
	//protected JButton jButtonCerrarOrderByEstadoCliente;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public EstadoClienteLogic estadoclienteLogic;
	
	
	
	public JScrollPane jScrollPanelDatosEstadoCliente;
	public JScrollPane jScrollPanelDatosEdicionEstadoCliente;
	public JScrollPane jScrollPanelDatosGeneralEstadoCliente;
    
	
	
	//public JScrollPane jScrollPanelDatosEstadoClienteOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoEstadoCliente;
	//public JScrollPane jScrollPanelImportacionEstadoCliente;
	
	
	
	protected JPanel jPanelAccionesEstadoCliente;
	
    protected JPanel jPanelPaginacionEstadoCliente;
    protected JPanel jPanelParametrosReportesEstadoCliente;
	protected JPanel jPanelParametrosReportesAccionesEstadoCliente;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1EstadoCliente;
	protected JPanel jPanelParametrosAuxiliar2EstadoCliente;
	protected JPanel jPanelParametrosAuxiliar3EstadoCliente;
	protected JPanel jPanelParametrosAuxiliar4EstadoCliente;
	//protected JPanel jPanelParametrosAuxiliar5EstadoCliente;
	
	
	
	//protected JPanel jPanelReporteDinamicoEstadoCliente;
	//protected JPanel jPanelImportacionEstadoCliente;
	
	
	public JTable jTableDatosEstadoCliente;
	
	
	
	//public JTable jTableDatosEstadoClienteOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoEstadoCliente;
	protected JButton jButtonDuplicarEstadoCliente;
	protected JButton jButtonCopiarEstadoCliente;
	protected JButton jButtonVerFormEstadoCliente;
	protected JButton jButtonNuevoRelacionesEstadoCliente;
	protected JButton jButtonModificarEstadoCliente;
	
    protected JButton jButtonGuardarCambiosTablaEstadoCliente;
	protected JButton jButtonCerrarEstadoCliente;
	
	
	protected JButton jButtonRecargarInformacionEstadoCliente;
	protected JButton jButtonProcesarInformacionEstadoCliente;
	
	
	protected JButton jButtonAnterioresEstadoCliente;
	protected JButton jButtonSiguientesEstadoCliente;
	protected JButton jButtonNuevoGuardarCambiosEstadoCliente;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoEstadoCliente;
	//protected JButton jButtonCerrarReporteDinamicoEstadoCliente;
	//protected JButton jButtonGenerarExcelReporteDinamicoEstadoCliente;	
	
	
	
	//protected JButton jButtonAbrirImportacionEstadoCliente;
	//protected JButton jButtonGenerarImportacionEstadoCliente;
	//protected JButton jButtonCerrarImportacionEstadoCliente;
	//protected JFileChooser jFileChooserImportacionEstadoCliente;
	//protected File fileImportacionEstadoCliente;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarEstadoCliente;
	protected JButton jButtonDuplicarToolBarEstadoCliente;
	protected JButton jButtonNuevoRelacionesToolBarEstadoCliente;
	
	
	public JButton jButtonGuardarCambiosToolBarEstadoCliente;
	protected JButton jButtonCopiarToolBarEstadoCliente;
	protected JButton jButtonVerFormToolBarEstadoCliente;
	public JButton jButtonGuardarCambiosTablaToolBarEstadoCliente;
	protected JButton jButtonMostrarOcultarTablaToolBarEstadoCliente;
	protected JButton jButtonCerrarToolBarEstadoCliente;
	
	protected JButton jButtonRecargarInformacionToolBarEstadoCliente;
	protected JButton jButtonProcesarInformacionToolBarEstadoCliente;
	protected JButton jButtonAnterioresToolBarEstadoCliente;
	protected JButton jButtonSiguientesToolBarEstadoCliente;
	protected JButton jButtonNuevoGuardarCambiosToolBarEstadoCliente;
	protected JButton jButtonAbrirOrderByToolBarEstadoCliente;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoEstadoCliente;
	protected JMenuItem jMenuItemDuplicarEstadoCliente;
	protected JMenuItem jMenuItemNuevoRelacionesEstadoCliente;
	
	
	protected JMenuItem jMenuItemGuardarCambiosEstadoCliente;
	protected JMenuItem jMenuItemCopiarEstadoCliente;
	protected JMenuItem jMenuItemVerFormEstadoCliente;
	protected JMenuItem jMenuItemGuardarCambiosTablaEstadoCliente;
	protected JMenuItem jMenuItemCerrarEstadoCliente;
	protected JMenuItem jMenuItemDetalleCerrarEstadoCliente;
	protected JMenuItem jMenuItemDetalleAbrirOrderByEstadoCliente;
	protected JMenuItem jMenuItemDetalleMostarOcultarEstadoCliente;
	
	protected JMenuItem jMenuItemRecargarInformacionEstadoCliente;
	protected JMenuItem jMenuItemProcesarInformacionEstadoCliente;
	protected JMenuItem jMenuItemAnterioresEstadoCliente;
	protected JMenuItem jMenuItemSiguientesEstadoCliente;
	protected JMenuItem jMenuItemNuevoGuardarCambiosEstadoCliente;
	protected JMenuItem jMenuItemAbrirOrderByEstadoCliente;
	protected JMenuItem jMenuItemMostrarOcultarEstadoCliente;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesEstadoCliente;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosEstadoCliente;
	protected JCheckBox jCheckBoxSeleccionadosEstadoCliente;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaEstadoCliente;
	protected JCheckBox jCheckBoxConGraficoReporteEstadoCliente;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesEstadoCliente;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesEstadoCliente;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoEstadoCliente;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoEstadoCliente;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesEstadoCliente;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionEstadoCliente;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesEstadoCliente;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesEstadoCliente;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarEstadoCliente;
	protected JTextField jTextFieldValorCampoGeneralEstadoCliente;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteEstadoCliente;
	//public JList<Reporte> jListColumnasSelectReporteEstadoCliente;
	//public JScrollPane jScrollColumnasSelectReporteEstadoCliente;
	
	//public JLabel jLabelRelacionesSelectReporteEstadoCliente;
	//public JList<Reporte> jListRelacionesSelectReporteEstadoCliente;
	//public JScrollPane jScrollRelacionesSelectReporteEstadoCliente;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoEstadoCliente;
	//protected JCheckBox jCheckBoxConGraficoDinamicoEstadoCliente;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoEstadoCliente;
	//public JLabel jLabelTiposArchivoReporteDinamicoEstadoCliente;
	
		
	//public JLabel jLabelArchivoImportacionEstadoCliente;	
	//public JLabel jLabelPathArchivoImportacionEstadoCliente;
	//protected JTextField jTextFieldPathArchivoImportacionEstadoCliente;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoEstadoCliente;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoEstadoCliente;
	
	//public JLabel jLabelColumnaCategoriaValorEstadoCliente;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorEstadoCliente;
	
	//public JLabel jLabelColumnasValoresGraficoEstadoCliente;
	//public JList<Reporte> jListColumnasValoresGraficoEstadoCliente;
	//public JScrollPane jScrollColumnasValoresGraficoEstadoCliente;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoEstadoCliente;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoEstadoCliente;	
	
	
	
	
	
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
	//public int iHeightFormulario=462;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public EstadoClienteJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("EstadoCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoClienteJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EstadoCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoClienteJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EstadoCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoClienteJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("EstadoCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionEstadoCliente)	{
		this.jButtonRecargarInformacionEstadoCliente = jButtonRecargarInformacionEstadoCliente;
	}
	
	public JButton getjButtonProcesarInformacionEstadoCliente() {
		return this.jButtonProcesarInformacionEstadoCliente;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionEstadoCliente)	{
		this.jButtonProcesarInformacionEstadoCliente = jButtonProcesarInformacionEstadoCliente;
	}
	
	
	public JButton getjButtonRecargarInformacionEstadoCliente() {
		return this.jButtonRecargarInformacionEstadoCliente;
	}
	
	
	public List<EstadoCliente> getestadoclientes() {
		return this.estadoclientes;
	}

	public void setestadoclientes(List<EstadoCliente> estadoclientes) {
		this.estadoclientes = estadoclientes;
	}
	
	public List<EstadoCliente> getestadoclientesAux() {
		return this.estadoclientesAux;
	}

	public void setestadoclientesAux(List<EstadoCliente> estadoclientesAux) {
		this.estadoclientesAux = estadoclientesAux;
	}
	
	public List<EstadoCliente> getestadoclientesEliminados() {
		return this.estadoclientesEliminados;
	}

	public void setEstadoClientesEliminados(List<EstadoCliente> estadoclientesEliminados) {
		this.estadoclientesEliminados = estadoclientesEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarEstadoCliente() {
		return jComboBoxTiposSeleccionarEstadoCliente;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarEstadoCliente(
			JComboBox jComboBoxTiposSeleccionarEstadoCliente) {
		this.jComboBoxTiposSeleccionarEstadoCliente = jComboBoxTiposSeleccionarEstadoCliente;
	}
	
	public void setBorderResaltarTiposSeleccionarEstadoCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarEstadoCliente.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarEstadoCliente .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralEstadoCliente() {
		return jTextFieldValorCampoGeneralEstadoCliente;
	}

	public void setjTextFieldValorCampoGeneralEstadoCliente(
			JTextField jTextFieldValorCampoGeneralEstadoCliente) {
		this.jTextFieldValorCampoGeneralEstadoCliente = jTextFieldValorCampoGeneralEstadoCliente;
	}

	public void setBorderResaltarValorCampoGeneralEstadoCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoCliente.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralEstadoCliente .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosEstadoCliente() {
		return this.jCheckBoxSeleccionarTodosEstadoCliente;
	}

	public void setjCheckBoxSeleccionarTodosEstadoCliente(
			JCheckBox jCheckBoxSeleccionarTodosEstadoCliente) {
		this.jCheckBoxSeleccionarTodosEstadoCliente = jCheckBoxSeleccionarTodosEstadoCliente;
	}

	public void setBorderResaltarSeleccionarTodosEstadoCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoCliente.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosEstadoCliente .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosEstadoCliente() {
		return this.jCheckBoxSeleccionadosEstadoCliente;
	}

	public void setjCheckBoxSeleccionadosEstadoCliente(
			JCheckBox jCheckBoxSeleccionadosEstadoCliente) {
		this.jCheckBoxSeleccionadosEstadoCliente = jCheckBoxSeleccionadosEstadoCliente;
	}
	
	public void setBorderResaltarSeleccionadosEstadoCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoCliente.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosEstadoCliente .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesEstadoCliente() {
		return this.jComboBoxTiposArchivosReportesEstadoCliente;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesEstadoCliente(
			JComboBox jComboBoxTiposArchivosReportesEstadoCliente) {
		this.jComboBoxTiposArchivosReportesEstadoCliente = jComboBoxTiposArchivosReportesEstadoCliente;
	}

	public void setBorderResaltarTiposArchivosReportesEstadoCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoCliente.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesEstadoCliente .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesEstadoCliente() {
		return this.jComboBoxTiposReportesEstadoCliente;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesEstadoCliente(
			JComboBox jComboBoxTiposReportesEstadoCliente) {
		this.jComboBoxTiposReportesEstadoCliente = jComboBoxTiposReportesEstadoCliente;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoEstadoCliente() {
	//	return jComboBoxTiposReportesDinamicoEstadoCliente;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoEstadoCliente(
	//		JComboBox jComboBoxTiposReportesDinamicoEstadoCliente) {
	//	this.jComboBoxTiposReportesDinamicoEstadoCliente = jComboBoxTiposReportesDinamicoEstadoCliente;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoEstadoCliente() {
	//	return jComboBoxTiposArchivosReportesDinamicoEstadoCliente;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoEstadoCliente(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoEstadoCliente) {
	//	this.jComboBoxTiposArchivosReportesDinamicoEstadoCliente = jComboBoxTiposArchivosReportesDinamicoEstadoCliente;
	//}
	
	public void setBorderResaltarTiposReportesEstadoCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoCliente.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesEstadoCliente .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesEstadoCliente() {
		return this.jComboBoxTiposGraficosReportesEstadoCliente;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesEstadoCliente(
			JComboBox jComboBoxTiposGraficosReportesEstadoCliente) {
		this.jComboBoxTiposGraficosReportesEstadoCliente = jComboBoxTiposGraficosReportesEstadoCliente;
	}
	
	public void setBorderResaltarTiposGraficosReportesEstadoCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoCliente.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesEstadoCliente .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionEstadoCliente() {
		return this.jComboBoxTiposPaginacionEstadoCliente;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionEstadoCliente(
			JComboBox jComboBoxTiposPaginacionEstadoCliente) {
		this.jComboBoxTiposPaginacionEstadoCliente = jComboBoxTiposPaginacionEstadoCliente;
	}
	
	public void setBorderResaltarTiposPaginacionEstadoCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoCliente.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionEstadoCliente .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesEstadoCliente() {
		return this.jComboBoxTiposRelacionesEstadoCliente;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesEstadoCliente() {
		return this.jComboBoxTiposAccionesEstadoCliente;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesEstadoCliente(
			JComboBox jComboBoxTiposRelacionesEstadoCliente) {
		this.jComboBoxTiposRelacionesEstadoCliente = jComboBoxTiposRelacionesEstadoCliente;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesEstadoCliente(
			JComboBox jComboBoxTiposAccionesEstadoCliente) {
		this.jComboBoxTiposAccionesEstadoCliente = jComboBoxTiposAccionesEstadoCliente;
	}
	
	public void setBorderResaltarTiposRelacionesEstadoCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoCliente.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesEstadoCliente .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesEstadoCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoCliente.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesEstadoCliente .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoEstadoCliente() {
	//	return jCheckBoxConGraficoDinamicoEstadoCliente;
	//}

	//public void setjCheckBoxConGraficoDinamicoEstadoCliente(
	//		JCheckBox jCheckBoxConGraficoDinamicoEstadoCliente) {
	//	this.jCheckBoxConGraficoDinamicoEstadoCliente = jCheckBoxConGraficoDinamicoEstadoCliente;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoEstadoCliente() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarEstadoCliente.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoEstadoCliente .setBorder(borderResaltar);		
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
		this.estadoclienteSessionBean=new EstadoClienteSessionBean();
		
		this.estadoclienteSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.estadoclienteSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.estadoclienteSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=EstadoClienteJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=EstadoClienteJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		EstadoClienteJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		EstadoClienteJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		EstadoClienteJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Estado Cliente MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 910) {
			iHeight=910;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.estadoclienteSessionBean.getEsGuardarRelacionado()) {
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
		
		EstadoClienteJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("EstadoCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarEstadoCliente= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarEstadoCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarEstadoCliente,this.jTtoolBarEstadoCliente,
							"nuevo","nuevo","Nuevo"+" "+EstadoClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarEstadoCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarEstadoCliente,this.jTtoolBarEstadoCliente,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarEstadoCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarEstadoCliente,this.jTtoolBarEstadoCliente,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+EstadoClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarEstadoCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarEstadoCliente,this.jTtoolBarEstadoCliente,
							"duplicar","duplicar","Duplicar"+" "+EstadoClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarEstadoCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarEstadoCliente,this.jTtoolBarEstadoCliente,
							"copiar","copiar","Copiar"+" "+EstadoClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarEstadoCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarEstadoCliente,this.jTtoolBarEstadoCliente,
							"ver_form","ver_form","Ver"+" "+EstadoClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarEstadoCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEstadoCliente,this.jTtoolBarEstadoCliente,
							"recargar","recargar","Recargar"+" "+EstadoClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarEstadoCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEstadoCliente,this.jTtoolBarEstadoCliente,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarEstadoCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEstadoCliente,this.jTtoolBarEstadoCliente,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarEstadoCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarEstadoCliente,this.jTtoolBarEstadoCliente,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarEstadoCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarEstadoCliente,this.jTtoolBarEstadoCliente,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarEstadoCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarEstadoCliente,this.jTtoolBarEstadoCliente,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+EstadoClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarEstadoCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarEstadoCliente,this.jTtoolBarEstadoCliente,
							"cerrar","cerrar","Salir"+" "+EstadoClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarEstadoCliente=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarEstadoCliente;
			
				this.jButtonProcesarInformacionToolBarEstadoCliente=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarEstadoCliente;
				
		//protected JButton jButtonModificarToolBarEstadoCliente;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarEstadoCliente=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuEstadoCliente=new JMenuMe("General");
		this.jmenuArchivoEstadoCliente=new JMenuMe("Archivo");
		this.jmenuAccionesEstadoCliente=new JMenuMe("Acciones");
		this.jmenuDatosEstadoCliente=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoEstadoCliente= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoEstadoCliente.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoEstadoCliente,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoEstadoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarEstadoCliente= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarEstadoCliente.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarEstadoCliente,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarEstadoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesEstadoCliente= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesEstadoCliente.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesEstadoCliente,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesEstadoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosEstadoCliente= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosEstadoCliente.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosEstadoCliente,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosEstadoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarEstadoCliente= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarEstadoCliente.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarEstadoCliente,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarEstadoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormEstadoCliente= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormEstadoCliente.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormEstadoCliente,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormEstadoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaEstadoCliente= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaEstadoCliente.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaEstadoCliente,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaEstadoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarEstadoCliente= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarEstadoCliente.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarEstadoCliente,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarEstadoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionEstadoCliente= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionEstadoCliente.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionEstadoCliente,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionEstadoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionEstadoCliente= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionEstadoCliente.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionEstadoCliente,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresEstadoCliente= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresEstadoCliente.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresEstadoCliente,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresEstadoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesEstadoCliente= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesEstadoCliente.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesEstadoCliente,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesEstadoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByEstadoCliente= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByEstadoCliente.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByEstadoCliente,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByEstadoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarEstadoCliente= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarEstadoCliente.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarEstadoCliente,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarEstadoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByEstadoCliente= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByEstadoCliente.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByEstadoCliente,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByEstadoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarEstadoCliente= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarEstadoCliente.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarEstadoCliente,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarEstadoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosEstadoCliente= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosEstadoCliente.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosEstadoCliente,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosEstadoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoEstadoCliente.add(this.jMenuItemCerrarEstadoCliente);
			
			this.jmenuAccionesEstadoCliente.add(this.jMenuItemNuevoEstadoCliente);
			this.jmenuAccionesEstadoCliente.add(this.jMenuItemNuevoGuardarCambiosEstadoCliente);
			this.jmenuAccionesEstadoCliente.add(this.jMenuItemNuevoRelacionesEstadoCliente);
			this.jmenuAccionesEstadoCliente.add(this.jMenuItemGuardarCambiosTablaEstadoCliente);		
			this.jmenuAccionesEstadoCliente.add(this.jMenuItemDuplicarEstadoCliente);		
			this.jmenuAccionesEstadoCliente.add(this.jMenuItemCopiarEstadoCliente);		
			this.jmenuAccionesEstadoCliente.add(this.jMenuItemVerFormEstadoCliente);		
			
			this.jmenuDatosEstadoCliente.add(this.jMenuItemRecargarInformacionEstadoCliente);				
			this.jmenuDatosEstadoCliente.add(this.jMenuItemAnterioresEstadoCliente);				
			this.jmenuDatosEstadoCliente.add(this.jMenuItemSiguientesEstadoCliente);				
			this.jmenuDatosEstadoCliente.add(this.jMenuItemAbrirOrderByEstadoCliente);				
			this.jmenuDatosEstadoCliente.add(this.jMenuItemMostrarOcultarEstadoCliente);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesEstadoCliente.add(this.jMenuItemGuardarCambiosEstadoCliente);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoEstadoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesEstadoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosEstadoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarEstadoCliente.add(this.jmenuArchivoEstadoCliente);		
			this.jmenuBarEstadoCliente.add(this.jmenuAccionesEstadoCliente);		
			this.jmenuBarEstadoCliente.add(this.jmenuDatosEstadoCliente);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarEstadoCliente);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasEstadoCliente() {
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
			//this.jInternalFrameDetalleEstadoCliente = new EstadoClienteDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Estado Cliente DATOS");
			this.jInternalFrameDetalleFormEstadoCliente = new EstadoClienteDetalleFormJInternalFrame(jDesktopPane,this.estadoclienteSessionBean.getConGuardarRelaciones(),this.estadoclienteSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormEstadoCliente = null;//new EstadoClienteDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutEstadoCliente= new GridBagLayout();
		
		
		this.jTableDatosEstadoCliente = new JTableMe();      
		
		String sToolTipEstadoCliente="";
		sToolTipEstadoCliente=EstadoClienteConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipEstadoCliente+="(Cartera.EstadoCliente)";
		}
		
		if(!this.estadoclienteSessionBean.getEsGuardarRelacionado()) {
			sToolTipEstadoCliente+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosEstadoCliente.setToolTipText(sToolTipEstadoCliente);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosEstadoCliente);
		this.jTableDatosEstadoCliente.setAutoCreateRowSorter(true);
		this.jTableDatosEstadoCliente.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosEstadoCliente.setRowSelectionAllowed(true);
		this.jTableDatosEstadoCliente.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosEstadoCliente,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoEstadoCliente = new JButtonMe();
		this.jButtonDuplicarEstadoCliente = new JButtonMe();
		this.jButtonCopiarEstadoCliente = new JButtonMe();
		this.jButtonVerFormEstadoCliente = new JButtonMe();
		this.jButtonNuevoRelacionesEstadoCliente = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaEstadoCliente = new JButtonMe();
		this.jButtonCerrarEstadoCliente = new JButtonMe();
		
		this.jScrollPanelDatosEstadoCliente = new JScrollPane();   
        this.jScrollPanelDatosGeneralEstadoCliente = new JScrollPane();
		
				
		
		
		this.jPanelAccionesEstadoCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Estado Cliente";
		
		if(!this.estadoclienteSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosEstadoCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Clientes" + this.sPath));
		} else {
			this.jScrollPanelDatosEstadoCliente.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralEstadoCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesEstadoCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesEstadoCliente.setToolTipText("Acciones");
        this.jPanelAccionesEstadoCliente.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralEstadoCliente, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEstadoCliente, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoEstadoCliente=new ReporteDinamicoJInternalFrame(EstadoClienteConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoEstadoCliente();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionEstadoCliente=new ImportacionJInternalFrame(EstadoClienteConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionEstadoCliente();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByEstadoCliente = new JButtonMe();
		
		this.jButtonAbrirOrderByEstadoCliente.setText("Orden");
		this.jButtonAbrirOrderByEstadoCliente.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByEstadoCliente,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByEstadoCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByEstadoCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByEstadoCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByEstadoCliente=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEstadoCliente,false,this);
			
			//this.cargarOrderByEstadoCliente(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByEstadoCliente=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEstadoCliente,true,this);
			
			//this.cargarOrderByEstadoCliente(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosEstadoCliente.setMinimumSize(new Dimension(400,50));//530
		this.jTableDatosEstadoCliente.setMaximumSize(new Dimension(400,50));//530
		this.jTableDatosEstadoCliente.setPreferredSize(new Dimension(400,50));//530
		
		this.jScrollPanelDatosEstadoCliente.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosEstadoCliente.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosEstadoCliente.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoEstadoCliente.setText("Nuevo");
		this.jButtonDuplicarEstadoCliente.setText("Duplicar");
		this.jButtonCopiarEstadoCliente.setText("Copiar");
		this.jButtonVerFormEstadoCliente.setText("Ver");
		this.jButtonNuevoRelacionesEstadoCliente.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaEstadoCliente.setText("Guardar");
		this.jButtonCerrarEstadoCliente.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoEstadoCliente,"nuevo_button","Nuevo",this.estadoclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarEstadoCliente,"duplicar_button","Duplicar",this.estadoclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarEstadoCliente,"copiar_button","Copiar",this.estadoclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormEstadoCliente,"ver_form","Ver",this.estadoclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesEstadoCliente,"nuevorelaciones_button","Nuevo Rel",this.estadoclienteSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaEstadoCliente,"guardarcambiostabla_button","Guardar",this.estadoclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarEstadoCliente,"cerrar_button","Salir",this.estadoclienteSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoEstadoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarEstadoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarEstadoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormEstadoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesEstadoCliente, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaEstadoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarEstadoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoEstadoCliente.setToolTipText("Nuevo"+" "+EstadoClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarEstadoCliente.setToolTipText("Duplicar"+" "+EstadoClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarEstadoCliente.setToolTipText("Copiar"+" "+EstadoClienteConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormEstadoCliente.setToolTipText("Ver"+" "+EstadoClienteConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesEstadoCliente.setToolTipText("Nuevo Rel"+" "+EstadoClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaEstadoCliente.setToolTipText("Guardar"+" "+EstadoClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarEstadoCliente.setToolTipText("Salir"+" "+EstadoClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoEstadoCliente";
		inputMap = this.jButtonNuevoEstadoCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoEstadoCliente.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoEstadoCliente"));
		
		//DUPLICAR
		sMapKey = "DuplicarEstadoCliente";
		inputMap = this.jButtonDuplicarEstadoCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarEstadoCliente.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarEstadoCliente"));
		
		//COPIAR
		sMapKey = "CopiarEstadoCliente";
		inputMap = this.jButtonCopiarEstadoCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarEstadoCliente.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarEstadoCliente"));
		
		//VEr FORM
		sMapKey = "VerFormEstadoCliente";
		inputMap = this.jButtonVerFormEstadoCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormEstadoCliente.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormEstadoCliente"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesEstadoCliente";
		inputMap = this.jButtonNuevoRelacionesEstadoCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesEstadoCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesEstadoCliente"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarEstadoCliente";
		inputMap = this.jButtonModificarEstadoCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarEstadoCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarEstadoCliente"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarEstadoCliente";
		inputMap = this.jButtonCerrarEstadoCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarEstadoCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarEstadoCliente"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaEstadoCliente";
		inputMap = this.jButtonGuardarCambiosTablaEstadoCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaEstadoCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaEstadoCliente"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesEstadoCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesEstadoCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionEstadoCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1EstadoCliente= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2EstadoCliente= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3EstadoCliente= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4EstadoCliente= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5EstadoCliente= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesEstadoCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesEstadoCliente.setName("jPanelParametrosReportesEstadoCliente"); 
		
		this.jPanelParametrosReportesAccionesEstadoCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesEstadoCliente.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesEstadoCliente.setName("jPanelParametrosReportesAccionesEstadoCliente"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesEstadoCliente, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesEstadoCliente, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionEstadoCliente = new JButtonMe();
		this.jButtonRecargarInformacionEstadoCliente.setText("Recargar");
		this.jButtonRecargarInformacionEstadoCliente.setToolTipText("Recargar"+" "+EstadoClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionEstadoCliente,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionEstadoCliente = new JButtonMe();
		this.jButtonProcesarInformacionEstadoCliente.setText("Procesar");
		this.jButtonProcesarInformacionEstadoCliente.setToolTipText("Procesar"+" "+EstadoClienteConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionEstadoCliente.setVisible(false);
			
		this.jButtonProcesarInformacionEstadoCliente.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionEstadoCliente.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionEstadoCliente.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesEstadoCliente = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEstadoCliente.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesEstadoCliente.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesEstadoCliente = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEstadoCliente.setText("TIPO");       
		this.jComboBoxTiposReportesEstadoCliente.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesEstadoCliente = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEstadoCliente.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesEstadoCliente.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionEstadoCliente = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionEstadoCliente.setText("Paginacion");
		this.jComboBoxTiposPaginacionEstadoCliente.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesEstadoCliente = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesEstadoCliente.setText("Accion");
		this.jComboBoxTiposRelacionesEstadoCliente.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesEstadoCliente = new JComboBoxMe();
		//this.jComboBoxTiposAccionesEstadoCliente.setText("Accion");
		this.jComboBoxTiposAccionesEstadoCliente.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarEstadoCliente = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarEstadoCliente.setText("Accion");
		this.jComboBoxTiposSeleccionarEstadoCliente.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralEstadoCliente=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralEstadoCliente.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralEstadoCliente.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralEstadoCliente.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesEstadoCliente = new JLabelMe();
		
		this.jLabelAccionesEstadoCliente.setText("Acciones");		
		this.jLabelAccionesEstadoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEstadoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEstadoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosEstadoCliente = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosEstadoCliente.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosEstadoCliente.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosEstadoCliente = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosEstadoCliente.setText("Seleccionados");
		this.jCheckBoxSeleccionadosEstadoCliente.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaEstadoCliente = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaEstadoCliente.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaEstadoCliente.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteEstadoCliente = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteEstadoCliente.setText("Graf.");
		this.jCheckBoxConGraficoReporteEstadoCliente.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresEstadoCliente = new JButtonMe();
		//this.jButtonAnterioresEstadoCliente.setText("<<");
        this.jButtonAnterioresEstadoCliente.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresEstadoCliente,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresEstadoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesEstadoCliente = new JButtonMe();
		//this.jButtonSiguientesEstadoCliente.setText(">>");
        this.jButtonSiguientesEstadoCliente.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesEstadoCliente,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesEstadoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosEstadoCliente = new JButtonMe();
		this.jButtonNuevoGuardarCambiosEstadoCliente.setText("Nue");
        this.jButtonNuevoGuardarCambiosEstadoCliente.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosEstadoCliente,"nuevoguardarcambios_button","Nue",this.estadoclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosEstadoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosEstadoCliente";
		inputMap = this.jButtonNuevoGuardarCambiosEstadoCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosEstadoCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosEstadoCliente"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionEstadoCliente";
		inputMap = this.jButtonRecargarInformacionEstadoCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionEstadoCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionEstadoCliente"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesEstadoCliente";
		inputMap = this.jButtonSiguientesEstadoCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesEstadoCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesEstadoCliente"));
		
		//ANTERIORES		
		sMapKey = "AnterioresEstadoCliente";
		inputMap = this.jButtonAnterioresEstadoCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresEstadoCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresEstadoCliente"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasEstadoCliente();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesEstadoCliente.setMinimumSize(new Dimension(this.getWidth(),EstadoClienteBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EstadoClienteBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesEstadoCliente.setMaximumSize(new Dimension(this.getWidth(),EstadoClienteBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EstadoClienteBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesEstadoCliente.setPreferredSize(new Dimension(this.getWidth(),EstadoClienteBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EstadoClienteBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionEstadoCliente = new GridBagLayout();

			this.jPanelPaginacionEstadoCliente.setLayout(gridaBagLayoutPaginacionEstadoCliente);						
			
			this.gridBagConstraintsEstadoCliente = new GridBagConstraints();
			this.gridBagConstraintsEstadoCliente.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsEstadoCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoCliente.gridy = 0;
			this.gridBagConstraintsEstadoCliente.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionEstadoCliente.add(this.jButtonAnterioresEstadoCliente, this.gridBagConstraintsEstadoCliente);
					
						
			this.gridBagConstraintsEstadoCliente = new GridBagConstraints();
			this.gridBagConstraintsEstadoCliente.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsEstadoCliente.gridy = 0;
			
			this.jPanelPaginacionEstadoCliente.add(this.jButtonNuevoGuardarCambiosEstadoCliente, this.gridBagConstraintsEstadoCliente);
						
			
			this.gridBagConstraintsEstadoCliente = new GridBagConstraints();
			this.gridBagConstraintsEstadoCliente.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsEstadoCliente.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsEstadoCliente.gridy = 0;
			this.jPanelPaginacionEstadoCliente.add(this.jButtonSiguientesEstadoCliente, this.gridBagConstraintsEstadoCliente);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsEstadoCliente = new GridBagConstraints();
			this.gridBagConstraintsEstadoCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoCliente.gridy = 1;
			this.gridBagConstraintsEstadoCliente.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEstadoCliente.add(this.jButtonNuevoEstadoCliente, this.gridBagConstraintsEstadoCliente);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsEstadoCliente = new GridBagConstraints();
				this.gridBagConstraintsEstadoCliente.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsEstadoCliente.gridy = 1;
				this.gridBagConstraintsEstadoCliente.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionEstadoCliente.add(this.jButtonNuevoRelacionesEstadoCliente, this.gridBagConstraintsEstadoCliente);
			}
			
			
			if(!this.estadoclienteSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsEstadoCliente = new GridBagConstraints();
				this.gridBagConstraintsEstadoCliente.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsEstadoCliente.gridy = 1;
				this.gridBagConstraintsEstadoCliente.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionEstadoCliente.add(this.jButtonGuardarCambiosTablaEstadoCliente, this.gridBagConstraintsEstadoCliente);
			}
			
			
			
			this.gridBagConstraintsEstadoCliente = new GridBagConstraints();
			this.gridBagConstraintsEstadoCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoCliente.gridy = 1;
			this.gridBagConstraintsEstadoCliente.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEstadoCliente.add(this.jButtonDuplicarEstadoCliente, this.gridBagConstraintsEstadoCliente);
			
			this.gridBagConstraintsEstadoCliente = new GridBagConstraints();
			this.gridBagConstraintsEstadoCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoCliente.gridy = 1;
			this.gridBagConstraintsEstadoCliente.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEstadoCliente.add(this.jButtonCopiarEstadoCliente, this.gridBagConstraintsEstadoCliente);
		
			this.gridBagConstraintsEstadoCliente = new GridBagConstraints();
			this.gridBagConstraintsEstadoCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoCliente.gridy = 1;
			this.gridBagConstraintsEstadoCliente.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEstadoCliente.add(this.jButtonVerFormEstadoCliente, this.gridBagConstraintsEstadoCliente);
		
			this.gridBagConstraintsEstadoCliente = new GridBagConstraints();
			this.gridBagConstraintsEstadoCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoCliente.gridy = 1;
			this.gridBagConstraintsEstadoCliente.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionEstadoCliente.add(this.jButtonCerrarEstadoCliente, this.gridBagConstraintsEstadoCliente);
		
		
		
		this.jButtonRecargarInformacionEstadoCliente.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionEstadoCliente.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionEstadoCliente.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionEstadoCliente, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesEstadoCliente.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesEstadoCliente.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesEstadoCliente.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesEstadoCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesEstadoCliente.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesEstadoCliente.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesEstadoCliente.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesEstadoCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesEstadoCliente.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesEstadoCliente.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesEstadoCliente.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesEstadoCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionEstadoCliente.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionEstadoCliente.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionEstadoCliente.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionEstadoCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesEstadoCliente.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesEstadoCliente.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesEstadoCliente.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesEstadoCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesEstadoCliente.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEstadoCliente.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEstadoCliente.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesEstadoCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarEstadoCliente.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarEstadoCliente.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarEstadoCliente.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarEstadoCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaEstadoCliente.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaEstadoCliente.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaEstadoCliente.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaEstadoCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteEstadoCliente.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteEstadoCliente.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteEstadoCliente.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteEstadoCliente, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosEstadoCliente.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosEstadoCliente.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosEstadoCliente.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosEstadoCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosEstadoCliente.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosEstadoCliente.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosEstadoCliente.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosEstadoCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesEstadoCliente = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesEstadoCliente = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1EstadoCliente = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2EstadoCliente = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3EstadoCliente = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4EstadoCliente = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesEstadoCliente.setLayout(gridaBagParametrosReportesEstadoCliente);
			this.jPanelParametrosReportesAccionesEstadoCliente.setLayout(gridaBagParametrosReportesAccionesEstadoCliente);
			
			
			this.jPanelParametrosAuxiliar1EstadoCliente.setLayout(gridaBagParametrosAuxiliar1EstadoCliente);
			this.jPanelParametrosAuxiliar2EstadoCliente.setLayout(gridaBagParametrosAuxiliar2EstadoCliente);
			this.jPanelParametrosAuxiliar3EstadoCliente.setLayout(gridaBagParametrosAuxiliar3EstadoCliente);
			this.jPanelParametrosAuxiliar4EstadoCliente.setLayout(gridaBagParametrosAuxiliar4EstadoCliente);
			//this.jPanelParametrosAuxiliar5EstadoCliente.setLayout(gridaBagParametrosAuxiliar2EstadoCliente);			
			
			
			
			
			this.gridBagConstraintsEstadoCliente = new GridBagConstraints();
			this.gridBagConstraintsEstadoCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoCliente.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEstadoCliente.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstadoCliente.add(this.jButtonRecargarInformacionEstadoCliente, this.gridBagConstraintsEstadoCliente);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsEstadoCliente = new GridBagConstraints();
			this.gridBagConstraintsEstadoCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoCliente.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoCliente.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1EstadoCliente.add(this.jComboBoxTiposPaginacionEstadoCliente, this.gridBagConstraintsEstadoCliente);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsEstadoCliente = new GridBagConstraints();
			this.gridBagConstraintsEstadoCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoCliente.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoCliente.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1EstadoCliente.add(this.jCheckBoxConAltoMaximoTablaEstadoCliente, this.gridBagConstraintsEstadoCliente);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsEstadoCliente = new GridBagConstraints();
			this.gridBagConstraintsEstadoCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoCliente.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoCliente.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1EstadoCliente.add(this.jComboBoxTiposArchivosReportesEstadoCliente, this.gridBagConstraintsEstadoCliente);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsEstadoCliente = new GridBagConstraints();
			this.gridBagConstraintsEstadoCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoCliente.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoCliente.add(this.jPanelParametrosAuxiliar1EstadoCliente, this.gridBagConstraintsEstadoCliente);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsEstadoCliente = new GridBagConstraints();
			this.gridBagConstraintsEstadoCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoCliente.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEstadoCliente.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4EstadoCliente.add(this.jComboBoxTiposReportesEstadoCliente, this.gridBagConstraintsEstadoCliente);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsEstadoCliente = new GridBagConstraints();
			this.gridBagConstraintsEstadoCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoCliente.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoCliente.add(this.jPanelParametrosAuxiliar4EstadoCliente, this.gridBagConstraintsEstadoCliente);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsEstadoCliente = new GridBagConstraints();
			this.gridBagConstraintsEstadoCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoCliente.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoCliente.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoCliente.add(this.jComboBoxTiposReportesEstadoCliente, this.gridBagConstraintsEstadoCliente);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsEstadoCliente = new GridBagConstraints();
			this.gridBagConstraintsEstadoCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoCliente.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEstadoCliente.add(this.jCheckBoxGenerarReporteEstadoCliente, this.gridBagConstraintsEstadoCliente);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsEstadoCliente = new GridBagConstraints();
			this.gridBagConstraintsEstadoCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoCliente.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoCliente.add(this.jPanelParametrosAuxiliar2EstadoCliente, this.gridBagConstraintsEstadoCliente);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsEstadoCliente = new GridBagConstraints();
			this.gridBagConstraintsEstadoCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoCliente.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEstadoCliente.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEstadoCliente.add(this.jLabelAccionesEstadoCliente, this.gridBagConstraintsEstadoCliente);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsEstadoCliente = new GridBagConstraints();
				this.gridBagConstraintsEstadoCliente.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsEstadoCliente.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsEstadoCliente.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesEstadoCliente.add(this.jButtonAbrirOrderByEstadoCliente, this.gridBagConstraintsEstadoCliente);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsEstadoCliente = new GridBagConstraints();
			this.gridBagConstraintsEstadoCliente.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsEstadoCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoCliente.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstadoCliente.add(this.jComboBoxTiposSeleccionarEstadoCliente, this.gridBagConstraintsEstadoCliente);			
			
			
			/*
			this.gridBagConstraintsEstadoCliente = new GridBagConstraints();
			this.gridBagConstraintsEstadoCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoCliente.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEstadoCliente.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEstadoCliente.add(this.jCheckBoxSeleccionarTodosEstadoCliente, this.gridBagConstraintsEstadoCliente);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsEstadoCliente = new GridBagConstraints();
			this.gridBagConstraintsEstadoCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoCliente.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEstadoCliente.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3EstadoCliente.add(this.jCheckBoxSeleccionarTodosEstadoCliente, this.gridBagConstraintsEstadoCliente);															
				
			this.gridBagConstraintsEstadoCliente = new GridBagConstraints();
			this.gridBagConstraintsEstadoCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoCliente.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEstadoCliente.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3EstadoCliente.add(this.jCheckBoxSeleccionadosEstadoCliente, this.gridBagConstraintsEstadoCliente);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsEstadoCliente = new GridBagConstraints();
			this.gridBagConstraintsEstadoCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoCliente.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoCliente.add(this.jPanelParametrosAuxiliar3EstadoCliente, this.gridBagConstraintsEstadoCliente);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsEstadoCliente = new GridBagConstraints();
			this.gridBagConstraintsEstadoCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoCliente.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstadoCliente.add(this.jComboBoxTiposRelacionesEstadoCliente, this.gridBagConstraintsEstadoCliente);
				
			this.gridBagConstraintsEstadoCliente = new GridBagConstraints();
			this.gridBagConstraintsEstadoCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoCliente.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstadoCliente.add(this.jComboBoxTiposAccionesEstadoCliente, this.gridBagConstraintsEstadoCliente);
	
				
			this.gridBagConstraintsEstadoCliente = new GridBagConstraints();
			this.gridBagConstraintsEstadoCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoCliente.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstadoCliente.add(this.jTextFieldValorCampoGeneralEstadoCliente, this.gridBagConstraintsEstadoCliente);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosEstadoCliente = new GridBagLayout();

			this.jScrollPanelDatosEstadoCliente.setLayout(gridaBagLayoutDatosEstadoCliente);
			
			this.gridBagConstraintsEstadoCliente = new GridBagConstraints();
			this.gridBagConstraintsEstadoCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoCliente.gridy = 0;
			this.gridBagConstraintsEstadoCliente.gridx = 0;
			
			this.jScrollPanelDatosEstadoCliente.add(this.jTableDatosEstadoCliente, this.gridBagConstraintsEstadoCliente);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosEstadoCliente.setViewportView(this.jTableDatosEstadoCliente);
		this.jTableDatosEstadoCliente.setFillsViewportHeight(true);
		this.jTableDatosEstadoCliente.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesEstadoCliente= new GridBagLayout();
		this.jPanelAccionesEstadoCliente.setLayout(gridaBagLayoutAccionesEstadoCliente);
		
		
		/*	
		this.gridBagConstraintsEstadoCliente = new GridBagConstraints();
		this.gridBagConstraintsEstadoCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoCliente.gridy = 0;
		this.gridBagConstraintsEstadoCliente.gridx = 0;
			
		this.jPanelAccionesEstadoCliente.add(this.jButtonNuevoEstadoCliente, this.gridBagConstraintsEstadoCliente);
		*/
		int iPosXAccion=0;
		
						
		
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutEstadoCliente = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutEstadoCliente);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.estadoclienteSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsEstadoCliente = new GridBagConstraints();						
			this.gridBagConstraintsEstadoCliente.gridy = iGridyPrincipal++;
			this.gridBagConstraintsEstadoCliente.gridx = 0;		
			//this.gridBagConstraintsEstadoCliente.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoCliente.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsEstadoCliente.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarEstadoCliente, this.gridBagConstraintsEstadoCliente);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsEstadoCliente = new GridBagConstraints();
		this.gridBagConstraintsEstadoCliente.gridy = iGridyPrincipal++;
		this.gridBagConstraintsEstadoCliente.gridx = 0;		
		//this.gridBagConstraintsEstadoCliente.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoCliente.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsEstadoCliente.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsEstadoCliente);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsEstadoCliente = new GridBagConstraints();
		this.gridBagConstraintsEstadoCliente.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoCliente.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesEstadoCliente, this.gridBagConstraintsEstadoCliente);								
		
		
		/*
		this.gridBagConstraintsEstadoCliente = new GridBagConstraints();
		this.gridBagConstraintsEstadoCliente.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoCliente.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesEstadoCliente, this.gridBagConstraintsEstadoCliente);
		*/		
		
		this.gridBagConstraintsEstadoCliente = new GridBagConstraints();
		this.gridBagConstraintsEstadoCliente.gridy =iGridyPrincipal++;
		this.gridBagConstraintsEstadoCliente.gridx =0;
		this.gridBagConstraintsEstadoCliente.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsEstadoCliente.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosEstadoCliente, this.gridBagConstraintsEstadoCliente);
				
		
		this.gridBagConstraintsEstadoCliente = new GridBagConstraints();
		this.gridBagConstraintsEstadoCliente.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoCliente.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionEstadoCliente, this.gridBagConstraintsEstadoCliente);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(EstadoClienteJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosEstadoCliente= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosEstadoCliente = new GridBagLayout();
			this.jPanelBusquedasParametrosEstadoCliente.setLayout(gridaBagLayoutBusquedasParametrosEstadoCliente);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralEstadoCliente=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralEstadoCliente.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEstadoCliente.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEstadoCliente.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsEstadoCliente = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsEstadoCliente = new GridBagConstraints();
		this.gridBagConstraintsEstadoCliente.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoCliente.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposEstadoCliente, this.gridBagConstraintsEstadoCliente);
			
			
		this.gridBagConstraintsEstadoCliente = new GridBagConstraints();
		this.gridBagConstraintsEstadoCliente.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoCliente.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosEstadoCliente, this.gridBagConstraintsEstadoCliente);
		
			
		this.gridBagConstraintsEstadoCliente = new GridBagConstraints();
		this.gridBagConstraintsEstadoCliente.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsEstadoCliente.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesEstadoCliente, this.gridBagConstraintsEstadoCliente);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralEstadoCliente;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoEstadoCliente() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoEstadoCliente = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoEstadoCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoEstadoCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoEstadoCliente.setName("jPanelReporteDinamicoEstadoCliente"); 
		
		this.jPanelReporteDinamicoEstadoCliente.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoEstadoCliente.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoEstadoCliente.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoEstadoCliente.setLayout(gridaBagLayoutReporteDinamicoEstadoCliente);
		
		
		this.jInternalFrameReporteDinamicoEstadoCliente= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoEstadoCliente = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteEstadoCliente= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoEstadoCliente.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoEstadoCliente.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoEstadoCliente.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoEstadoCliente.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoEstadoCliente.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoEstadoCliente.setResizable(true);
	    this.jInternalFrameReporteDinamicoEstadoCliente.setClosable(true);
	    this.jInternalFrameReporteDinamicoEstadoCliente.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoEstadoCliente.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoEstadoCliente.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoEstadoCliente.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoEstadoCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Clientes"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteEstadoCliente = new JLabelMe();

		this.jLabelColumnasSelectReporteEstadoCliente.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteEstadoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteEstadoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteEstadoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsEstadoCliente = new GridBagConstraints();
		this.gridBagConstraintsEstadoCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoCliente.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoEstadoCliente.add(this.jLabelColumnasSelectReporteEstadoCliente, this.gridBagConstraintsEstadoCliente);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteEstadoCliente = new JList<Reporte>();
		this.jListColumnasSelectReporteEstadoCliente.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteEstadoCliente.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteEstadoCliente.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteEstadoCliente.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteEstadoCliente.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteEstadoCliente=new JScrollPane(this.jListColumnasSelectReporteEstadoCliente);
			
			this.jScrollColumnasSelectReporteEstadoCliente.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteEstadoCliente.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteEstadoCliente.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteEstadoCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsEstadoCliente = new GridBagConstraints();
		this.gridBagConstraintsEstadoCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoCliente.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoEstadoCliente.add(this.jListColumnasSelectReporteEstadoCliente, this.gridBagConstraintsEstadoCliente);
		this.jPanelReporteDinamicoEstadoCliente.add(this.jScrollColumnasSelectReporteEstadoCliente, this.gridBagConstraintsEstadoCliente);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteEstadoCliente = new JLabelMe();

		this.jLabelRelacionesSelectReporteEstadoCliente.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteEstadoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteEstadoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteEstadoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsEstadoCliente = new GridBagConstraints();
		this.gridBagConstraintsEstadoCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoCliente.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoEstadoCliente.add(this.jLabelRelacionesSelectReporteEstadoCliente, this.gridBagConstraintsEstadoCliente);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteEstadoCliente = new JList<Reporte>();
		this.jListRelacionesSelectReporteEstadoCliente.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteEstadoCliente.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteEstadoCliente.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteEstadoCliente.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteEstadoCliente.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteEstadoCliente=new JScrollPane(this.jListRelacionesSelectReporteEstadoCliente);
			
			this.jScrollRelacionesSelectReporteEstadoCliente.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteEstadoCliente.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteEstadoCliente.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteEstadoCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsEstadoCliente = new GridBagConstraints();
		this.gridBagConstraintsEstadoCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoCliente.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoEstadoCliente.add(this.jListRelacionesSelectReporteEstadoCliente, this.gridBagConstraintsEstadoCliente);
		this.jPanelReporteDinamicoEstadoCliente.add(this.jScrollRelacionesSelectReporteEstadoCliente, this.gridBagConstraintsEstadoCliente);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoEstadoCliente = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoEstadoCliente = new JComboBoxMe();
		this.jListColumnasValoresGraficoEstadoCliente = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoEstadoCliente = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoEstadoCliente.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoEstadoCliente.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoEstadoCliente.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoEstadoCliente.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoEstadoCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoEstadoCliente = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoEstadoCliente.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoEstadoCliente.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoEstadoCliente.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoEstadoCliente.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoEstadoCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoEstadoCliente = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoEstadoCliente.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoEstadoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoEstadoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoEstadoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsEstadoCliente = new GridBagConstraints();
		this.gridBagConstraintsEstadoCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoCliente.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEstadoCliente.add(this.jLabelGenerarExcelReporteDinamicoEstadoCliente, this.gridBagConstraintsEstadoCliente);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoEstadoCliente = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoEstadoCliente.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoEstadoCliente,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoEstadoCliente.setToolTipText("Generar EXCEL"+" "+EstadoClienteConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsEstadoCliente = new GridBagConstraints();
		//this.gridBagConstraintsEstadoCliente.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsEstadoCliente.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsEstadoCliente.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoEstadoCliente.add(this.jButtonGenerarExcelReporteDinamicoEstadoCliente, this.gridBagConstraintsEstadoCliente);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsEstadoCliente = new GridBagConstraints();
		this.gridBagConstraintsEstadoCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoCliente.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEstadoCliente.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEstadoCliente.add(this.jComboBoxTiposReportesDinamicoEstadoCliente, this.gridBagConstraintsEstadoCliente);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoEstadoCliente = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoEstadoCliente.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoEstadoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoEstadoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoEstadoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsEstadoCliente = new GridBagConstraints();
		this.gridBagConstraintsEstadoCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoCliente.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEstadoCliente.add(this.jLabelTiposArchivoReporteDinamicoEstadoCliente, this.gridBagConstraintsEstadoCliente);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsEstadoCliente = new GridBagConstraints();
		this.gridBagConstraintsEstadoCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoCliente.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEstadoCliente.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEstadoCliente.add(this.jComboBoxTiposArchivosReportesDinamicoEstadoCliente, this.gridBagConstraintsEstadoCliente);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoEstadoCliente = new JButtonMe();
		this.jButtonGenerarReporteDinamicoEstadoCliente.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoEstadoCliente,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoEstadoCliente.setToolTipText("Generar"+" "+EstadoClienteConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsEstadoCliente = new GridBagConstraints();
		this.gridBagConstraintsEstadoCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoCliente.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEstadoCliente.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEstadoCliente.add(this.jButtonGenerarReporteDinamicoEstadoCliente, this.gridBagConstraintsEstadoCliente);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoEstadoCliente = new JButtonMe();
		this.jButtonCerrarReporteDinamicoEstadoCliente.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoEstadoCliente,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoEstadoCliente.setToolTipText("Cancelar"+" "+EstadoClienteConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsEstadoCliente = new GridBagConstraints();
		this.gridBagConstraintsEstadoCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoCliente.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEstadoCliente.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEstadoCliente.add(this.jButtonCerrarReporteDinamicoEstadoCliente, this.gridBagConstraintsEstadoCliente);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalEstadoCliente = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoEstadoCliente= new JScrollPane(jPanelReporteDinamicoEstadoCliente,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoEstadoCliente.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoEstadoCliente.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoEstadoCliente.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoEstadoCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Clientes"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsEstadoCliente = new GridBagConstraints();
		this.gridBagConstraintsEstadoCliente.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsEstadoCliente.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsEstadoCliente.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoEstadoCliente.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoEstadoCliente.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalEstadoCliente);
		this.jInternalFrameReporteDinamicoEstadoCliente.getContentPane().add(this.jScrollPanelReporteDinamicoEstadoCliente, this.gridBagConstraintsEstadoCliente);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionEstadoCliente() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionEstadoCliente = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionEstadoCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionEstadoCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionEstadoCliente.setName("jPanelImportacionEstadoCliente"); 
		
		this.jPanelImportacionEstadoCliente.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionEstadoCliente.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionEstadoCliente.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionEstadoCliente.setLayout(gridaBagLayoutImportacionEstadoCliente);
		
		
		this.jInternalFrameImportacionEstadoCliente= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionEstadoCliente= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionEstadoCliente = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteEstadoCliente= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionEstadoCliente.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionEstadoCliente.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionEstadoCliente.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionEstadoCliente.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionEstadoCliente.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionEstadoCliente.setResizable(true);
	    this.jInternalFrameImportacionEstadoCliente.setClosable(true);
	    this.jInternalFrameImportacionEstadoCliente.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionEstadoCliente.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionEstadoCliente.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionEstadoCliente.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionEstadoCliente.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionEstadoCliente.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionEstadoCliente.setResizable(true);
	    this.jInternalFrameImportacionEstadoCliente.setClosable(true);
	    this.jInternalFrameImportacionEstadoCliente.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionEstadoCliente.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionEstadoCliente.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionEstadoCliente.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionEstadoCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Clientes"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionEstadoCliente = new JLabelMe();

		this.jLabelArchivoImportacionEstadoCliente.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionEstadoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionEstadoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionEstadoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsEstadoCliente = new GridBagConstraints();
		this.gridBagConstraintsEstadoCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoCliente.gridy = iPosYImportacion;		
		this.gridBagConstraintsEstadoCliente.gridx = iPosXImportacion++;
			
		this.jPanelImportacionEstadoCliente.add(this.jLabelArchivoImportacionEstadoCliente, this.gridBagConstraintsEstadoCliente);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionEstadoCliente = new JFileChooser();		
		this.jFileChooserImportacionEstadoCliente.setToolTipText("ESCOGER ARCHIVO"+" "+EstadoClienteConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionEstadoCliente = new JButtonMe();
		this.jButtonAbrirImportacionEstadoCliente.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionEstadoCliente,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionEstadoCliente.setToolTipText("Generar"+" "+EstadoClienteConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsEstadoCliente = new GridBagConstraints();
		this.gridBagConstraintsEstadoCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoCliente.gridy = iPosYImportacion;
		this.gridBagConstraintsEstadoCliente.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEstadoCliente.add(this.jButtonAbrirImportacionEstadoCliente, this.gridBagConstraintsEstadoCliente);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionEstadoCliente = new JLabelMe();

		this.jLabelPathArchivoImportacionEstadoCliente.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionEstadoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionEstadoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionEstadoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsEstadoCliente = new GridBagConstraints();
		this.gridBagConstraintsEstadoCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoCliente.gridy = iPosYImportacion;		
		this.gridBagConstraintsEstadoCliente.gridx = iPosXImportacion++;
			
		this.jPanelImportacionEstadoCliente.add(this.jLabelPathArchivoImportacionEstadoCliente, this.gridBagConstraintsEstadoCliente);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionEstadoCliente=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionEstadoCliente.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionEstadoCliente.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionEstadoCliente.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsEstadoCliente = new GridBagConstraints();
		this.gridBagConstraintsEstadoCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoCliente.gridy = iPosYImportacion;
		this.gridBagConstraintsEstadoCliente.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEstadoCliente.add(this.jTextFieldPathArchivoImportacionEstadoCliente, this.gridBagConstraintsEstadoCliente);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionEstadoCliente = new JButtonMe();
		this.jButtonGenerarImportacionEstadoCliente.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionEstadoCliente,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionEstadoCliente.setToolTipText("Generar"+" "+EstadoClienteConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsEstadoCliente = new GridBagConstraints();
		this.gridBagConstraintsEstadoCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoCliente.gridy = iPosYImportacion;
		this.gridBagConstraintsEstadoCliente.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEstadoCliente.add(this.jButtonGenerarImportacionEstadoCliente, this.gridBagConstraintsEstadoCliente);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionEstadoCliente = new JButtonMe();
		this.jButtonCerrarImportacionEstadoCliente.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionEstadoCliente,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionEstadoCliente.setToolTipText("Cancelar"+" "+EstadoClienteConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsEstadoCliente = new GridBagConstraints();
		this.gridBagConstraintsEstadoCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoCliente.gridy = iPosYImportacion;
		this.gridBagConstraintsEstadoCliente.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEstadoCliente.add(this.jButtonCerrarImportacionEstadoCliente, this.gridBagConstraintsEstadoCliente);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalEstadoCliente = new GridBagLayout();
		
		this.jScrollPanelImportacionEstadoCliente= new JScrollPane(jPanelImportacionEstadoCliente,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsEstadoCliente = new GridBagConstraints();
		this.gridBagConstraintsEstadoCliente.gridy =iPosYImportacion;
		this.gridBagConstraintsEstadoCliente.gridx =iPosXImportacion;
		this.gridBagConstraintsEstadoCliente.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionEstadoCliente.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionEstadoCliente.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalEstadoCliente);
		this.jInternalFrameImportacionEstadoCliente.getContentPane().add(this.jScrollPanelImportacionEstadoCliente, this.gridBagConstraintsEstadoCliente);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByEstadoCliente(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByEstadoCliente = new JButtonMe();
			this.jButtonAbrirOrderByEstadoCliente.setText("Orden");
			this.jButtonAbrirOrderByEstadoCliente.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByEstadoCliente,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByEstadoCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByEstadoCliente";
			inputMap = this.jButtonAbrirOrderByEstadoCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByEstadoCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByEstadoCliente"));
		
		
			GridBagLayout gridaBagLayoutOrderByEstadoCliente = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByEstadoCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByEstadoCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByEstadoCliente.setName("jPanelOrderByEstadoCliente"); 
			
			this.jPanelOrderByEstadoCliente.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByEstadoCliente.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByEstadoCliente.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByEstadoCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByEstadoCliente.setLayout(gridaBagLayoutOrderByEstadoCliente);
			
			
			this.jTableDatosEstadoClienteOrderBy = new JTableMe();        
			this.jTableDatosEstadoClienteOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosEstadoClienteOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosEstadoClienteOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosEstadoClienteOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosEstadoClienteOrderBy.setViewportView(this.jTableDatosEstadoClienteOrderBy);
			this.jTableDatosEstadoClienteOrderBy.setFillsViewportHeight(true);
			this.jTableDatosEstadoClienteOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByEstadoCliente= new OrderByJInternalFrame();
			this.jInternalFrameOrderByEstadoCliente= new OrderByJInternalFrame();
			this.jScrollPanelOrderByEstadoCliente = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteEstadoCliente= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByEstadoCliente.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByEstadoCliente.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByEstadoCliente.setTitle("Orden");
			this.jInternalFrameOrderByEstadoCliente.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByEstadoCliente.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByEstadoCliente.setResizable(true);
			this.jInternalFrameOrderByEstadoCliente.setClosable(true);
			this.jInternalFrameOrderByEstadoCliente.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByEstadoCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByEstadoCliente.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByEstadoCliente.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByEstadoCliente.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByEstadoCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByEstadoCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Clientes"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsEstadoCliente = new GridBagConstraints();
			this.gridBagConstraintsEstadoCliente.gridy =iPosYOrderBy++;
			this.gridBagConstraintsEstadoCliente.gridx =iPosXOrderBy;
			this.gridBagConstraintsEstadoCliente.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsEstadoCliente.ipady =150;
				
			this.jPanelOrderByEstadoCliente.add(jScrollPanelDatosEstadoClienteOrderBy, this.gridBagConstraintsEstadoCliente);//this.jTableDatosEstadoClienteTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByEstadoCliente = new JButtonMe();
			this.jButtonCerrarOrderByEstadoCliente.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByEstadoCliente,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByEstadoCliente.setToolTipText("Cancelar"+" "+EstadoClienteConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByEstadoCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsEstadoCliente = new GridBagConstraints();
			this.gridBagConstraintsEstadoCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoCliente.gridy = iPosYOrderBy++;
			this.gridBagConstraintsEstadoCliente.gridx = iPosXOrderBy;
									
			this.jPanelOrderByEstadoCliente.add(this.jButtonCerrarOrderByEstadoCliente, this.gridBagConstraintsEstadoCliente);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalEstadoCliente = new GridBagLayout();
			
			this.jScrollPanelOrderByEstadoCliente= new JScrollPane(jPanelOrderByEstadoCliente,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsEstadoCliente = new GridBagConstraints();
			this.gridBagConstraintsEstadoCliente.gridy =iPosYOrderBy;
			this.gridBagConstraintsEstadoCliente.gridx =iPosXOrderBy;
			this.gridBagConstraintsEstadoCliente.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByEstadoCliente.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByEstadoCliente.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalEstadoCliente);
			
			this.jInternalFrameOrderByEstadoCliente.getContentPane().add(this.jScrollPanelOrderByEstadoCliente, this.gridBagConstraintsEstadoCliente);			
		
		} else {
			this.jButtonAbrirOrderByEstadoCliente = new JButtonMe();
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
		iWidthTableCalculado+=530;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=400;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=100;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.estadoclienteSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosEstadoCliente.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosEstadoCliente.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosEstadoCliente.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosEstadoCliente.getRowHeight();//EstadoClienteConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.estadoclienteSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > EstadoClienteConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaEstadoCliente.isSelected()) {
					iHeightTable=EstadoClienteConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < EstadoClienteConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=EstadoClienteConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > EstadoClienteConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaEstadoCliente.isSelected()) {
					iHeightTable=EstadoClienteConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < EstadoClienteConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=EstadoClienteConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosEstadoCliente.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosEstadoCliente.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosEstadoCliente.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosEstadoCliente.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosEstadoCliente.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosEstadoCliente.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByEstadoCliente!=null && this.jInternalFrameOrderByEstadoCliente.getjTableDatosOrderBy()!=null) {
			//if(!this.estadoclienteSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByEstadoCliente.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByEstadoCliente.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByEstadoCliente.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByEstadoCliente.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByEstadoCliente.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByEstadoCliente.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByEstadoCliente.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosEstadoCliente.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosEstadoCliente.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosEstadoCliente.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=estadoclienteLogic.getEstadoClientes().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=estadoclientes.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<EstadoCliente> TraerEstadoClienteBeans(List<EstadoCliente> estadoclientes,ArrayList<Classe> classes)throws Exception {
		try {
			for(EstadoCliente estadocliente:estadoclientes) {
					
				if(!(EstadoClienteConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || EstadoClienteConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					estadocliente.setsDetalleGeneralEntityReporte(EstadoClienteConstantesFunciones.getEstadoClienteDescripcion(estadocliente));
										
					estadocliente.setes_defecto_descripcion(EstadoClienteConstantesFunciones.getes_defectoDescripcion(estadocliente));	
					
					

					if(estadocliente.getClientes()!=null && Funciones.existeClass(classes,Cliente.class)) {
						try{estadocliente.setclientesDescripcionReporte(new JRBeanCollectionDataSource(ClienteJInternalFrame.TraerClienteBeans(estadocliente.getClientes(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//estadocliente.setsDetalleGeneralEntityReporte(estadocliente.getsDetalleGeneralEntityReporte());
										
				}
				
				//estadoclientebeans.add(estadoclientebean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return estadoclientes;
    }
	//PARA REPORTES FIN
}
