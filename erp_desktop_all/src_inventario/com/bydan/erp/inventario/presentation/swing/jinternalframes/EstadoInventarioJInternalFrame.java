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
package com.bydan.erp.inventario.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.sris.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;

import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.sris.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.sris.business.entity.*;
import com.bydan.erp.tesoreria.business.entity.*;

//import com.bydan.erp.inventario.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.inventario.util.EstadoInventarioConstantesFunciones;

import com.bydan.erp.inventario.business.logic.*;
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
public class EstadoInventarioJInternalFrame extends EstadoInventarioBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarEstadoInventario;
	
	protected JMenuBar jmenuBarEstadoInventario;
	
	protected JMenu jmenuEstadoInventario;
	protected JMenu jmenuDatosEstadoInventario;
	protected JMenu jmenuArchivoEstadoInventario;
	protected JMenu jmenuAccionesEstadoInventario;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosEstadoInventario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutEstadoInventario;	
	protected GridBagConstraints gridBagConstraintsEstadoInventario;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public EstadoInventarioDetalleFormJInternalFrame jInternalFrameDetalleFormEstadoInventario;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoEstadoInventario;	
	protected ImportacionJInternalFrame jInternalFrameImportacionEstadoInventario;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public EstadoInventarioSessionBean estadoinventarioSessionBean;
		
	
	
	
	//protected JDesktopPane jDesktopPane;
	public List<EstadoInventario> estadoinventarios;		
	public List<EstadoInventario> estadoinventariosEliminados;	
	public List<EstadoInventario> estadoinventariosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByEstadoInventario;		
	protected JButton jButtonAbrirOrderByEstadoInventario;
	
	
	//protected JPanel jPanelOrderByEstadoInventario;
	//public JScrollPane jScrollPanelOrderByEstadoInventario;	
	//protected JButton jButtonCerrarOrderByEstadoInventario;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public EstadoInventarioLogic estadoinventarioLogic;
	
	
	
	public JScrollPane jScrollPanelDatosEstadoInventario;
	public JScrollPane jScrollPanelDatosEdicionEstadoInventario;
	public JScrollPane jScrollPanelDatosGeneralEstadoInventario;
    
	
	
	//public JScrollPane jScrollPanelDatosEstadoInventarioOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoEstadoInventario;
	//public JScrollPane jScrollPanelImportacionEstadoInventario;
	
	
	
	protected JPanel jPanelAccionesEstadoInventario;
	
    protected JPanel jPanelPaginacionEstadoInventario;
    protected JPanel jPanelParametrosReportesEstadoInventario;
	protected JPanel jPanelParametrosReportesAccionesEstadoInventario;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1EstadoInventario;
	protected JPanel jPanelParametrosAuxiliar2EstadoInventario;
	protected JPanel jPanelParametrosAuxiliar3EstadoInventario;
	protected JPanel jPanelParametrosAuxiliar4EstadoInventario;
	//protected JPanel jPanelParametrosAuxiliar5EstadoInventario;
	
	
	
	//protected JPanel jPanelReporteDinamicoEstadoInventario;
	//protected JPanel jPanelImportacionEstadoInventario;
	
	
	public JTable jTableDatosEstadoInventario;
	
	
	
	//public JTable jTableDatosEstadoInventarioOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoEstadoInventario;
	protected JButton jButtonDuplicarEstadoInventario;
	protected JButton jButtonCopiarEstadoInventario;
	protected JButton jButtonVerFormEstadoInventario;
	protected JButton jButtonNuevoRelacionesEstadoInventario;
	protected JButton jButtonModificarEstadoInventario;
	
    protected JButton jButtonGuardarCambiosTablaEstadoInventario;
	protected JButton jButtonCerrarEstadoInventario;
	
	
	protected JButton jButtonRecargarInformacionEstadoInventario;
	protected JButton jButtonProcesarInformacionEstadoInventario;
	
	
	protected JButton jButtonAnterioresEstadoInventario;
	protected JButton jButtonSiguientesEstadoInventario;
	protected JButton jButtonNuevoGuardarCambiosEstadoInventario;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoEstadoInventario;
	//protected JButton jButtonCerrarReporteDinamicoEstadoInventario;
	//protected JButton jButtonGenerarExcelReporteDinamicoEstadoInventario;	
	
	
	
	//protected JButton jButtonAbrirImportacionEstadoInventario;
	//protected JButton jButtonGenerarImportacionEstadoInventario;
	//protected JButton jButtonCerrarImportacionEstadoInventario;
	//protected JFileChooser jFileChooserImportacionEstadoInventario;
	//protected File fileImportacionEstadoInventario;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarEstadoInventario;
	protected JButton jButtonDuplicarToolBarEstadoInventario;
	protected JButton jButtonNuevoRelacionesToolBarEstadoInventario;
	
	
	public JButton jButtonGuardarCambiosToolBarEstadoInventario;
	protected JButton jButtonCopiarToolBarEstadoInventario;
	protected JButton jButtonVerFormToolBarEstadoInventario;
	public JButton jButtonGuardarCambiosTablaToolBarEstadoInventario;
	protected JButton jButtonMostrarOcultarTablaToolBarEstadoInventario;
	protected JButton jButtonCerrarToolBarEstadoInventario;
	
	protected JButton jButtonRecargarInformacionToolBarEstadoInventario;
	protected JButton jButtonProcesarInformacionToolBarEstadoInventario;
	protected JButton jButtonAnterioresToolBarEstadoInventario;
	protected JButton jButtonSiguientesToolBarEstadoInventario;
	protected JButton jButtonNuevoGuardarCambiosToolBarEstadoInventario;
	protected JButton jButtonAbrirOrderByToolBarEstadoInventario;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoEstadoInventario;
	protected JMenuItem jMenuItemDuplicarEstadoInventario;
	protected JMenuItem jMenuItemNuevoRelacionesEstadoInventario;
	
	
	protected JMenuItem jMenuItemGuardarCambiosEstadoInventario;
	protected JMenuItem jMenuItemCopiarEstadoInventario;
	protected JMenuItem jMenuItemVerFormEstadoInventario;
	protected JMenuItem jMenuItemGuardarCambiosTablaEstadoInventario;
	protected JMenuItem jMenuItemCerrarEstadoInventario;
	protected JMenuItem jMenuItemDetalleCerrarEstadoInventario;
	protected JMenuItem jMenuItemDetalleAbrirOrderByEstadoInventario;
	protected JMenuItem jMenuItemDetalleMostarOcultarEstadoInventario;
	
	protected JMenuItem jMenuItemRecargarInformacionEstadoInventario;
	protected JMenuItem jMenuItemProcesarInformacionEstadoInventario;
	protected JMenuItem jMenuItemAnterioresEstadoInventario;
	protected JMenuItem jMenuItemSiguientesEstadoInventario;
	protected JMenuItem jMenuItemNuevoGuardarCambiosEstadoInventario;
	protected JMenuItem jMenuItemAbrirOrderByEstadoInventario;
	protected JMenuItem jMenuItemMostrarOcultarEstadoInventario;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesEstadoInventario;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosEstadoInventario;
	protected JCheckBox jCheckBoxSeleccionadosEstadoInventario;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaEstadoInventario;
	protected JCheckBox jCheckBoxConGraficoReporteEstadoInventario;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesEstadoInventario;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesEstadoInventario;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoEstadoInventario;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoEstadoInventario;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesEstadoInventario;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionEstadoInventario;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesEstadoInventario;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesEstadoInventario;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarEstadoInventario;
	protected JTextField jTextFieldValorCampoGeneralEstadoInventario;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteEstadoInventario;
	//public JList<Reporte> jListColumnasSelectReporteEstadoInventario;
	//public JScrollPane jScrollColumnasSelectReporteEstadoInventario;
	
	//public JLabel jLabelRelacionesSelectReporteEstadoInventario;
	//public JList<Reporte> jListRelacionesSelectReporteEstadoInventario;
	//public JScrollPane jScrollRelacionesSelectReporteEstadoInventario;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoEstadoInventario;
	//protected JCheckBox jCheckBoxConGraficoDinamicoEstadoInventario;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoEstadoInventario;
	//public JLabel jLabelTiposArchivoReporteDinamicoEstadoInventario;
	
		
	//public JLabel jLabelArchivoImportacionEstadoInventario;	
	//public JLabel jLabelPathArchivoImportacionEstadoInventario;
	//protected JTextField jTextFieldPathArchivoImportacionEstadoInventario;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoEstadoInventario;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoEstadoInventario;
	
	//public JLabel jLabelColumnaCategoriaValorEstadoInventario;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorEstadoInventario;
	
	//public JLabel jLabelColumnasValoresGraficoEstadoInventario;
	//public JList<Reporte> jListColumnasValoresGraficoEstadoInventario;
	//public JScrollPane jScrollColumnasValoresGraficoEstadoInventario;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoEstadoInventario;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoEstadoInventario;	
	
	
	
	
	
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
	public EstadoInventarioJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("EstadoInventario No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoInventarioJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EstadoInventario No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoInventarioJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EstadoInventario No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoInventarioJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("EstadoInventario No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionEstadoInventario)	{
		this.jButtonRecargarInformacionEstadoInventario = jButtonRecargarInformacionEstadoInventario;
	}
	
	public JButton getjButtonProcesarInformacionEstadoInventario() {
		return this.jButtonProcesarInformacionEstadoInventario;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionEstadoInventario)	{
		this.jButtonProcesarInformacionEstadoInventario = jButtonProcesarInformacionEstadoInventario;
	}
	
	
	public JButton getjButtonRecargarInformacionEstadoInventario() {
		return this.jButtonRecargarInformacionEstadoInventario;
	}
	
	
	public List<EstadoInventario> getestadoinventarios() {
		return this.estadoinventarios;
	}

	public void setestadoinventarios(List<EstadoInventario> estadoinventarios) {
		this.estadoinventarios = estadoinventarios;
	}
	
	public List<EstadoInventario> getestadoinventariosAux() {
		return this.estadoinventariosAux;
	}

	public void setestadoinventariosAux(List<EstadoInventario> estadoinventariosAux) {
		this.estadoinventariosAux = estadoinventariosAux;
	}
	
	public List<EstadoInventario> getestadoinventariosEliminados() {
		return this.estadoinventariosEliminados;
	}

	public void setEstadoInventariosEliminados(List<EstadoInventario> estadoinventariosEliminados) {
		this.estadoinventariosEliminados = estadoinventariosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarEstadoInventario() {
		return jComboBoxTiposSeleccionarEstadoInventario;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarEstadoInventario(
			JComboBox jComboBoxTiposSeleccionarEstadoInventario) {
		this.jComboBoxTiposSeleccionarEstadoInventario = jComboBoxTiposSeleccionarEstadoInventario;
	}
	
	public void setBorderResaltarTiposSeleccionarEstadoInventario() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarEstadoInventario.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarEstadoInventario .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralEstadoInventario() {
		return jTextFieldValorCampoGeneralEstadoInventario;
	}

	public void setjTextFieldValorCampoGeneralEstadoInventario(
			JTextField jTextFieldValorCampoGeneralEstadoInventario) {
		this.jTextFieldValorCampoGeneralEstadoInventario = jTextFieldValorCampoGeneralEstadoInventario;
	}

	public void setBorderResaltarValorCampoGeneralEstadoInventario() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoInventario.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralEstadoInventario .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosEstadoInventario() {
		return this.jCheckBoxSeleccionarTodosEstadoInventario;
	}

	public void setjCheckBoxSeleccionarTodosEstadoInventario(
			JCheckBox jCheckBoxSeleccionarTodosEstadoInventario) {
		this.jCheckBoxSeleccionarTodosEstadoInventario = jCheckBoxSeleccionarTodosEstadoInventario;
	}

	public void setBorderResaltarSeleccionarTodosEstadoInventario() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoInventario.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosEstadoInventario .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosEstadoInventario() {
		return this.jCheckBoxSeleccionadosEstadoInventario;
	}

	public void setjCheckBoxSeleccionadosEstadoInventario(
			JCheckBox jCheckBoxSeleccionadosEstadoInventario) {
		this.jCheckBoxSeleccionadosEstadoInventario = jCheckBoxSeleccionadosEstadoInventario;
	}
	
	public void setBorderResaltarSeleccionadosEstadoInventario() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoInventario.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosEstadoInventario .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesEstadoInventario() {
		return this.jComboBoxTiposArchivosReportesEstadoInventario;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesEstadoInventario(
			JComboBox jComboBoxTiposArchivosReportesEstadoInventario) {
		this.jComboBoxTiposArchivosReportesEstadoInventario = jComboBoxTiposArchivosReportesEstadoInventario;
	}

	public void setBorderResaltarTiposArchivosReportesEstadoInventario() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoInventario.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesEstadoInventario .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesEstadoInventario() {
		return this.jComboBoxTiposReportesEstadoInventario;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesEstadoInventario(
			JComboBox jComboBoxTiposReportesEstadoInventario) {
		this.jComboBoxTiposReportesEstadoInventario = jComboBoxTiposReportesEstadoInventario;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoEstadoInventario() {
	//	return jComboBoxTiposReportesDinamicoEstadoInventario;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoEstadoInventario(
	//		JComboBox jComboBoxTiposReportesDinamicoEstadoInventario) {
	//	this.jComboBoxTiposReportesDinamicoEstadoInventario = jComboBoxTiposReportesDinamicoEstadoInventario;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoEstadoInventario() {
	//	return jComboBoxTiposArchivosReportesDinamicoEstadoInventario;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoEstadoInventario(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoEstadoInventario) {
	//	this.jComboBoxTiposArchivosReportesDinamicoEstadoInventario = jComboBoxTiposArchivosReportesDinamicoEstadoInventario;
	//}
	
	public void setBorderResaltarTiposReportesEstadoInventario() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoInventario.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesEstadoInventario .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesEstadoInventario() {
		return this.jComboBoxTiposGraficosReportesEstadoInventario;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesEstadoInventario(
			JComboBox jComboBoxTiposGraficosReportesEstadoInventario) {
		this.jComboBoxTiposGraficosReportesEstadoInventario = jComboBoxTiposGraficosReportesEstadoInventario;
	}
	
	public void setBorderResaltarTiposGraficosReportesEstadoInventario() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoInventario.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesEstadoInventario .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionEstadoInventario() {
		return this.jComboBoxTiposPaginacionEstadoInventario;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionEstadoInventario(
			JComboBox jComboBoxTiposPaginacionEstadoInventario) {
		this.jComboBoxTiposPaginacionEstadoInventario = jComboBoxTiposPaginacionEstadoInventario;
	}
	
	public void setBorderResaltarTiposPaginacionEstadoInventario() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoInventario.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionEstadoInventario .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesEstadoInventario() {
		return this.jComboBoxTiposRelacionesEstadoInventario;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesEstadoInventario() {
		return this.jComboBoxTiposAccionesEstadoInventario;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesEstadoInventario(
			JComboBox jComboBoxTiposRelacionesEstadoInventario) {
		this.jComboBoxTiposRelacionesEstadoInventario = jComboBoxTiposRelacionesEstadoInventario;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesEstadoInventario(
			JComboBox jComboBoxTiposAccionesEstadoInventario) {
		this.jComboBoxTiposAccionesEstadoInventario = jComboBoxTiposAccionesEstadoInventario;
	}
	
	public void setBorderResaltarTiposRelacionesEstadoInventario() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoInventario.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesEstadoInventario .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesEstadoInventario() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoInventario.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesEstadoInventario .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoEstadoInventario() {
	//	return jCheckBoxConGraficoDinamicoEstadoInventario;
	//}

	//public void setjCheckBoxConGraficoDinamicoEstadoInventario(
	//		JCheckBox jCheckBoxConGraficoDinamicoEstadoInventario) {
	//	this.jCheckBoxConGraficoDinamicoEstadoInventario = jCheckBoxConGraficoDinamicoEstadoInventario;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoEstadoInventario() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarEstadoInventario.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoEstadoInventario .setBorder(borderResaltar);		
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
		this.estadoinventarioSessionBean=new EstadoInventarioSessionBean();
		
		this.estadoinventarioSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.estadoinventarioSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.estadoinventarioSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=EstadoInventarioJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=EstadoInventarioJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		EstadoInventarioJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		EstadoInventarioJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		EstadoInventarioJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Estado Inventario MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 910) {
			iHeight=910;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.estadoinventarioSessionBean.getEsGuardarRelacionado()) {
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
		
		EstadoInventarioJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("EstadoInventario No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarEstadoInventario= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarEstadoInventario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarEstadoInventario,this.jTtoolBarEstadoInventario,
							"nuevo","nuevo","Nuevo"+" "+EstadoInventarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarEstadoInventario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarEstadoInventario,this.jTtoolBarEstadoInventario,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarEstadoInventario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarEstadoInventario,this.jTtoolBarEstadoInventario,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+EstadoInventarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarEstadoInventario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarEstadoInventario,this.jTtoolBarEstadoInventario,
							"duplicar","duplicar","Duplicar"+" "+EstadoInventarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarEstadoInventario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarEstadoInventario,this.jTtoolBarEstadoInventario,
							"copiar","copiar","Copiar"+" "+EstadoInventarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarEstadoInventario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarEstadoInventario,this.jTtoolBarEstadoInventario,
							"ver_form","ver_form","Ver"+" "+EstadoInventarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarEstadoInventario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEstadoInventario,this.jTtoolBarEstadoInventario,
							"recargar","recargar","Recargar"+" "+EstadoInventarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarEstadoInventario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEstadoInventario,this.jTtoolBarEstadoInventario,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarEstadoInventario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEstadoInventario,this.jTtoolBarEstadoInventario,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarEstadoInventario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarEstadoInventario,this.jTtoolBarEstadoInventario,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarEstadoInventario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarEstadoInventario,this.jTtoolBarEstadoInventario,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarEstadoInventario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarEstadoInventario,this.jTtoolBarEstadoInventario,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+EstadoInventarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarEstadoInventario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarEstadoInventario,this.jTtoolBarEstadoInventario,
							"cerrar","cerrar","Salir"+" "+EstadoInventarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarEstadoInventario=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarEstadoInventario;
			
				this.jButtonProcesarInformacionToolBarEstadoInventario=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarEstadoInventario;
				
		//protected JButton jButtonModificarToolBarEstadoInventario;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarEstadoInventario=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuEstadoInventario=new JMenuMe("General");
		this.jmenuArchivoEstadoInventario=new JMenuMe("Archivo");
		this.jmenuAccionesEstadoInventario=new JMenuMe("Acciones");
		this.jmenuDatosEstadoInventario=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoEstadoInventario= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoEstadoInventario.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoEstadoInventario,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoEstadoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarEstadoInventario= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarEstadoInventario.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarEstadoInventario,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarEstadoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesEstadoInventario= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesEstadoInventario.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesEstadoInventario,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesEstadoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosEstadoInventario= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosEstadoInventario.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosEstadoInventario,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosEstadoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarEstadoInventario= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarEstadoInventario.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarEstadoInventario,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarEstadoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormEstadoInventario= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormEstadoInventario.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormEstadoInventario,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormEstadoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaEstadoInventario= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaEstadoInventario.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaEstadoInventario,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaEstadoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarEstadoInventario= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarEstadoInventario.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarEstadoInventario,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarEstadoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionEstadoInventario= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionEstadoInventario.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionEstadoInventario,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionEstadoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionEstadoInventario= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionEstadoInventario.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionEstadoInventario,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresEstadoInventario= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresEstadoInventario.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresEstadoInventario,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresEstadoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesEstadoInventario= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesEstadoInventario.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesEstadoInventario,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesEstadoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByEstadoInventario= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByEstadoInventario.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByEstadoInventario,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByEstadoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarEstadoInventario= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarEstadoInventario.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarEstadoInventario,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarEstadoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByEstadoInventario= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByEstadoInventario.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByEstadoInventario,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByEstadoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarEstadoInventario= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarEstadoInventario.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarEstadoInventario,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarEstadoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosEstadoInventario= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosEstadoInventario.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosEstadoInventario,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosEstadoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoEstadoInventario.add(this.jMenuItemCerrarEstadoInventario);
			
			this.jmenuAccionesEstadoInventario.add(this.jMenuItemNuevoEstadoInventario);
			this.jmenuAccionesEstadoInventario.add(this.jMenuItemNuevoGuardarCambiosEstadoInventario);
			this.jmenuAccionesEstadoInventario.add(this.jMenuItemNuevoRelacionesEstadoInventario);
			this.jmenuAccionesEstadoInventario.add(this.jMenuItemGuardarCambiosTablaEstadoInventario);		
			this.jmenuAccionesEstadoInventario.add(this.jMenuItemDuplicarEstadoInventario);		
			this.jmenuAccionesEstadoInventario.add(this.jMenuItemCopiarEstadoInventario);		
			this.jmenuAccionesEstadoInventario.add(this.jMenuItemVerFormEstadoInventario);		
			
			this.jmenuDatosEstadoInventario.add(this.jMenuItemRecargarInformacionEstadoInventario);				
			this.jmenuDatosEstadoInventario.add(this.jMenuItemAnterioresEstadoInventario);				
			this.jmenuDatosEstadoInventario.add(this.jMenuItemSiguientesEstadoInventario);				
			this.jmenuDatosEstadoInventario.add(this.jMenuItemAbrirOrderByEstadoInventario);				
			this.jmenuDatosEstadoInventario.add(this.jMenuItemMostrarOcultarEstadoInventario);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesEstadoInventario.add(this.jMenuItemGuardarCambiosEstadoInventario);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoEstadoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesEstadoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosEstadoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarEstadoInventario.add(this.jmenuArchivoEstadoInventario);		
			this.jmenuBarEstadoInventario.add(this.jmenuAccionesEstadoInventario);		
			this.jmenuBarEstadoInventario.add(this.jmenuDatosEstadoInventario);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarEstadoInventario);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasEstadoInventario() {
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
			//this.jInternalFrameDetalleEstadoInventario = new EstadoInventarioDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Estado Inventario DATOS");
			this.jInternalFrameDetalleFormEstadoInventario = new EstadoInventarioDetalleFormJInternalFrame(jDesktopPane,this.estadoinventarioSessionBean.getConGuardarRelaciones(),this.estadoinventarioSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormEstadoInventario = null;//new EstadoInventarioDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutEstadoInventario= new GridBagLayout();
		
		
		this.jTableDatosEstadoInventario = new JTableMe();      
		
		String sToolTipEstadoInventario="";
		sToolTipEstadoInventario=EstadoInventarioConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipEstadoInventario+="(Inventario.EstadoInventario)";
		}
		
		if(!this.estadoinventarioSessionBean.getEsGuardarRelacionado()) {
			sToolTipEstadoInventario+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosEstadoInventario.setToolTipText(sToolTipEstadoInventario);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosEstadoInventario);
		this.jTableDatosEstadoInventario.setAutoCreateRowSorter(true);
		this.jTableDatosEstadoInventario.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosEstadoInventario.setRowSelectionAllowed(true);
		this.jTableDatosEstadoInventario.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosEstadoInventario,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoEstadoInventario = new JButtonMe();
		this.jButtonDuplicarEstadoInventario = new JButtonMe();
		this.jButtonCopiarEstadoInventario = new JButtonMe();
		this.jButtonVerFormEstadoInventario = new JButtonMe();
		this.jButtonNuevoRelacionesEstadoInventario = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaEstadoInventario = new JButtonMe();
		this.jButtonCerrarEstadoInventario = new JButtonMe();
		
		this.jScrollPanelDatosEstadoInventario = new JScrollPane();   
        this.jScrollPanelDatosGeneralEstadoInventario = new JScrollPane();
		
				
		
		
		this.jPanelAccionesEstadoInventario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Estado Inventario";
		
		if(!this.estadoinventarioSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosEstadoInventario.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Inventarios" + this.sPath));
		} else {
			this.jScrollPanelDatosEstadoInventario.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralEstadoInventario.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesEstadoInventario.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesEstadoInventario.setToolTipText("Acciones");
        this.jPanelAccionesEstadoInventario.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralEstadoInventario, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEstadoInventario, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoEstadoInventario=new ReporteDinamicoJInternalFrame(EstadoInventarioConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoEstadoInventario();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionEstadoInventario=new ImportacionJInternalFrame(EstadoInventarioConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionEstadoInventario();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByEstadoInventario = new JButtonMe();
		
		this.jButtonAbrirOrderByEstadoInventario.setText("Orden");
		this.jButtonAbrirOrderByEstadoInventario.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByEstadoInventario,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByEstadoInventario, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByEstadoInventario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByEstadoInventario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByEstadoInventario=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEstadoInventario,false,this);
			
			//this.cargarOrderByEstadoInventario(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByEstadoInventario=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEstadoInventario,true,this);
			
			//this.cargarOrderByEstadoInventario(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosEstadoInventario.setMinimumSize(new Dimension(400,50));//430
		this.jTableDatosEstadoInventario.setMaximumSize(new Dimension(400,50));//430
		this.jTableDatosEstadoInventario.setPreferredSize(new Dimension(400,50));//430
		
		this.jScrollPanelDatosEstadoInventario.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosEstadoInventario.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosEstadoInventario.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoEstadoInventario.setText("Nuevo");
		this.jButtonDuplicarEstadoInventario.setText("Duplicar");
		this.jButtonCopiarEstadoInventario.setText("Copiar");
		this.jButtonVerFormEstadoInventario.setText("Ver");
		this.jButtonNuevoRelacionesEstadoInventario.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaEstadoInventario.setText("Guardar");
		this.jButtonCerrarEstadoInventario.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoEstadoInventario,"nuevo_button","Nuevo",this.estadoinventarioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarEstadoInventario,"duplicar_button","Duplicar",this.estadoinventarioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarEstadoInventario,"copiar_button","Copiar",this.estadoinventarioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormEstadoInventario,"ver_form","Ver",this.estadoinventarioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesEstadoInventario,"nuevorelaciones_button","Nuevo Rel",this.estadoinventarioSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaEstadoInventario,"guardarcambiostabla_button","Guardar",this.estadoinventarioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarEstadoInventario,"cerrar_button","Salir",this.estadoinventarioSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoEstadoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarEstadoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarEstadoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormEstadoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesEstadoInventario, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaEstadoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarEstadoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoEstadoInventario.setToolTipText("Nuevo"+" "+EstadoInventarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarEstadoInventario.setToolTipText("Duplicar"+" "+EstadoInventarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarEstadoInventario.setToolTipText("Copiar"+" "+EstadoInventarioConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormEstadoInventario.setToolTipText("Ver"+" "+EstadoInventarioConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesEstadoInventario.setToolTipText("Nuevo Rel"+" "+EstadoInventarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaEstadoInventario.setToolTipText("Guardar"+" "+EstadoInventarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarEstadoInventario.setToolTipText("Salir"+" "+EstadoInventarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoEstadoInventario";
		inputMap = this.jButtonNuevoEstadoInventario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoEstadoInventario.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoEstadoInventario"));
		
		//DUPLICAR
		sMapKey = "DuplicarEstadoInventario";
		inputMap = this.jButtonDuplicarEstadoInventario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarEstadoInventario.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarEstadoInventario"));
		
		//COPIAR
		sMapKey = "CopiarEstadoInventario";
		inputMap = this.jButtonCopiarEstadoInventario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarEstadoInventario.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarEstadoInventario"));
		
		//VEr FORM
		sMapKey = "VerFormEstadoInventario";
		inputMap = this.jButtonVerFormEstadoInventario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormEstadoInventario.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormEstadoInventario"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesEstadoInventario";
		inputMap = this.jButtonNuevoRelacionesEstadoInventario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesEstadoInventario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesEstadoInventario"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarEstadoInventario";
		inputMap = this.jButtonModificarEstadoInventario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarEstadoInventario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarEstadoInventario"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarEstadoInventario";
		inputMap = this.jButtonCerrarEstadoInventario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarEstadoInventario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarEstadoInventario"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaEstadoInventario";
		inputMap = this.jButtonGuardarCambiosTablaEstadoInventario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaEstadoInventario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaEstadoInventario"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesEstadoInventario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesEstadoInventario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionEstadoInventario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1EstadoInventario= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2EstadoInventario= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3EstadoInventario= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4EstadoInventario= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5EstadoInventario= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesEstadoInventario.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesEstadoInventario.setName("jPanelParametrosReportesEstadoInventario"); 
		
		this.jPanelParametrosReportesAccionesEstadoInventario.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesEstadoInventario.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesEstadoInventario.setName("jPanelParametrosReportesAccionesEstadoInventario"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesEstadoInventario, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesEstadoInventario, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionEstadoInventario = new JButtonMe();
		this.jButtonRecargarInformacionEstadoInventario.setText("Recargar");
		this.jButtonRecargarInformacionEstadoInventario.setToolTipText("Recargar"+" "+EstadoInventarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionEstadoInventario,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionEstadoInventario = new JButtonMe();
		this.jButtonProcesarInformacionEstadoInventario.setText("Procesar");
		this.jButtonProcesarInformacionEstadoInventario.setToolTipText("Procesar"+" "+EstadoInventarioConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionEstadoInventario.setVisible(false);
			
		this.jButtonProcesarInformacionEstadoInventario.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionEstadoInventario.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionEstadoInventario.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesEstadoInventario = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEstadoInventario.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesEstadoInventario.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesEstadoInventario = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEstadoInventario.setText("TIPO");       
		this.jComboBoxTiposReportesEstadoInventario.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesEstadoInventario = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEstadoInventario.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesEstadoInventario.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionEstadoInventario = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionEstadoInventario.setText("Paginacion");
		this.jComboBoxTiposPaginacionEstadoInventario.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesEstadoInventario = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesEstadoInventario.setText("Accion");
		this.jComboBoxTiposRelacionesEstadoInventario.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesEstadoInventario = new JComboBoxMe();
		//this.jComboBoxTiposAccionesEstadoInventario.setText("Accion");
		this.jComboBoxTiposAccionesEstadoInventario.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarEstadoInventario = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarEstadoInventario.setText("Accion");
		this.jComboBoxTiposSeleccionarEstadoInventario.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralEstadoInventario=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralEstadoInventario.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralEstadoInventario.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralEstadoInventario.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesEstadoInventario = new JLabelMe();
		
		this.jLabelAccionesEstadoInventario.setText("Acciones");		
		this.jLabelAccionesEstadoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEstadoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEstadoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosEstadoInventario = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosEstadoInventario.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosEstadoInventario.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosEstadoInventario = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosEstadoInventario.setText("Seleccionados");
		this.jCheckBoxSeleccionadosEstadoInventario.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaEstadoInventario = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaEstadoInventario.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaEstadoInventario.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteEstadoInventario = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteEstadoInventario.setText("Graf.");
		this.jCheckBoxConGraficoReporteEstadoInventario.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresEstadoInventario = new JButtonMe();
		//this.jButtonAnterioresEstadoInventario.setText("<<");
        this.jButtonAnterioresEstadoInventario.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresEstadoInventario,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresEstadoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesEstadoInventario = new JButtonMe();
		//this.jButtonSiguientesEstadoInventario.setText(">>");
        this.jButtonSiguientesEstadoInventario.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesEstadoInventario,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesEstadoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosEstadoInventario = new JButtonMe();
		this.jButtonNuevoGuardarCambiosEstadoInventario.setText("Nue");
        this.jButtonNuevoGuardarCambiosEstadoInventario.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosEstadoInventario,"nuevoguardarcambios_button","Nue",this.estadoinventarioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosEstadoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosEstadoInventario";
		inputMap = this.jButtonNuevoGuardarCambiosEstadoInventario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosEstadoInventario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosEstadoInventario"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionEstadoInventario";
		inputMap = this.jButtonRecargarInformacionEstadoInventario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionEstadoInventario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionEstadoInventario"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesEstadoInventario";
		inputMap = this.jButtonSiguientesEstadoInventario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesEstadoInventario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesEstadoInventario"));
		
		//ANTERIORES		
		sMapKey = "AnterioresEstadoInventario";
		inputMap = this.jButtonAnterioresEstadoInventario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresEstadoInventario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresEstadoInventario"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasEstadoInventario();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesEstadoInventario.setMinimumSize(new Dimension(this.getWidth(),EstadoInventarioBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EstadoInventarioBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesEstadoInventario.setMaximumSize(new Dimension(this.getWidth(),EstadoInventarioBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EstadoInventarioBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesEstadoInventario.setPreferredSize(new Dimension(this.getWidth(),EstadoInventarioBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EstadoInventarioBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionEstadoInventario = new GridBagLayout();

			this.jPanelPaginacionEstadoInventario.setLayout(gridaBagLayoutPaginacionEstadoInventario);						
			
			this.gridBagConstraintsEstadoInventario = new GridBagConstraints();
			this.gridBagConstraintsEstadoInventario.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsEstadoInventario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoInventario.gridy = 0;
			this.gridBagConstraintsEstadoInventario.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionEstadoInventario.add(this.jButtonAnterioresEstadoInventario, this.gridBagConstraintsEstadoInventario);
					
						
			this.gridBagConstraintsEstadoInventario = new GridBagConstraints();
			this.gridBagConstraintsEstadoInventario.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsEstadoInventario.gridy = 0;
			
			this.jPanelPaginacionEstadoInventario.add(this.jButtonNuevoGuardarCambiosEstadoInventario, this.gridBagConstraintsEstadoInventario);
						
			
			this.gridBagConstraintsEstadoInventario = new GridBagConstraints();
			this.gridBagConstraintsEstadoInventario.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsEstadoInventario.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsEstadoInventario.gridy = 0;
			this.jPanelPaginacionEstadoInventario.add(this.jButtonSiguientesEstadoInventario, this.gridBagConstraintsEstadoInventario);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsEstadoInventario = new GridBagConstraints();
			this.gridBagConstraintsEstadoInventario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoInventario.gridy = 1;
			this.gridBagConstraintsEstadoInventario.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEstadoInventario.add(this.jButtonNuevoEstadoInventario, this.gridBagConstraintsEstadoInventario);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsEstadoInventario = new GridBagConstraints();
				this.gridBagConstraintsEstadoInventario.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsEstadoInventario.gridy = 1;
				this.gridBagConstraintsEstadoInventario.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionEstadoInventario.add(this.jButtonNuevoRelacionesEstadoInventario, this.gridBagConstraintsEstadoInventario);
			}
			
			
			if(!this.estadoinventarioSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsEstadoInventario = new GridBagConstraints();
				this.gridBagConstraintsEstadoInventario.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsEstadoInventario.gridy = 1;
				this.gridBagConstraintsEstadoInventario.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionEstadoInventario.add(this.jButtonGuardarCambiosTablaEstadoInventario, this.gridBagConstraintsEstadoInventario);
			}
			
			
			
			this.gridBagConstraintsEstadoInventario = new GridBagConstraints();
			this.gridBagConstraintsEstadoInventario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoInventario.gridy = 1;
			this.gridBagConstraintsEstadoInventario.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEstadoInventario.add(this.jButtonDuplicarEstadoInventario, this.gridBagConstraintsEstadoInventario);
			
			this.gridBagConstraintsEstadoInventario = new GridBagConstraints();
			this.gridBagConstraintsEstadoInventario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoInventario.gridy = 1;
			this.gridBagConstraintsEstadoInventario.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEstadoInventario.add(this.jButtonCopiarEstadoInventario, this.gridBagConstraintsEstadoInventario);
		
			this.gridBagConstraintsEstadoInventario = new GridBagConstraints();
			this.gridBagConstraintsEstadoInventario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoInventario.gridy = 1;
			this.gridBagConstraintsEstadoInventario.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEstadoInventario.add(this.jButtonVerFormEstadoInventario, this.gridBagConstraintsEstadoInventario);
		
			this.gridBagConstraintsEstadoInventario = new GridBagConstraints();
			this.gridBagConstraintsEstadoInventario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoInventario.gridy = 1;
			this.gridBagConstraintsEstadoInventario.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionEstadoInventario.add(this.jButtonCerrarEstadoInventario, this.gridBagConstraintsEstadoInventario);
		
		
		
		this.jButtonRecargarInformacionEstadoInventario.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionEstadoInventario.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionEstadoInventario.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionEstadoInventario, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesEstadoInventario.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesEstadoInventario.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesEstadoInventario.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesEstadoInventario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesEstadoInventario.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesEstadoInventario.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesEstadoInventario.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesEstadoInventario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesEstadoInventario.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesEstadoInventario.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesEstadoInventario.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesEstadoInventario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionEstadoInventario.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionEstadoInventario.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionEstadoInventario.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionEstadoInventario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesEstadoInventario.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesEstadoInventario.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesEstadoInventario.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesEstadoInventario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesEstadoInventario.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEstadoInventario.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEstadoInventario.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesEstadoInventario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarEstadoInventario.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarEstadoInventario.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarEstadoInventario.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarEstadoInventario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaEstadoInventario.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaEstadoInventario.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaEstadoInventario.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaEstadoInventario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteEstadoInventario.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteEstadoInventario.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteEstadoInventario.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteEstadoInventario, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosEstadoInventario.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosEstadoInventario.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosEstadoInventario.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosEstadoInventario, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosEstadoInventario.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosEstadoInventario.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosEstadoInventario.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosEstadoInventario, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesEstadoInventario = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesEstadoInventario = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1EstadoInventario = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2EstadoInventario = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3EstadoInventario = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4EstadoInventario = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesEstadoInventario.setLayout(gridaBagParametrosReportesEstadoInventario);
			this.jPanelParametrosReportesAccionesEstadoInventario.setLayout(gridaBagParametrosReportesAccionesEstadoInventario);
			
			
			this.jPanelParametrosAuxiliar1EstadoInventario.setLayout(gridaBagParametrosAuxiliar1EstadoInventario);
			this.jPanelParametrosAuxiliar2EstadoInventario.setLayout(gridaBagParametrosAuxiliar2EstadoInventario);
			this.jPanelParametrosAuxiliar3EstadoInventario.setLayout(gridaBagParametrosAuxiliar3EstadoInventario);
			this.jPanelParametrosAuxiliar4EstadoInventario.setLayout(gridaBagParametrosAuxiliar4EstadoInventario);
			//this.jPanelParametrosAuxiliar5EstadoInventario.setLayout(gridaBagParametrosAuxiliar2EstadoInventario);			
			
			
			
			
			this.gridBagConstraintsEstadoInventario = new GridBagConstraints();
			this.gridBagConstraintsEstadoInventario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoInventario.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEstadoInventario.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstadoInventario.add(this.jButtonRecargarInformacionEstadoInventario, this.gridBagConstraintsEstadoInventario);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsEstadoInventario = new GridBagConstraints();
			this.gridBagConstraintsEstadoInventario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoInventario.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoInventario.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1EstadoInventario.add(this.jComboBoxTiposPaginacionEstadoInventario, this.gridBagConstraintsEstadoInventario);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsEstadoInventario = new GridBagConstraints();
			this.gridBagConstraintsEstadoInventario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoInventario.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoInventario.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1EstadoInventario.add(this.jCheckBoxConAltoMaximoTablaEstadoInventario, this.gridBagConstraintsEstadoInventario);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsEstadoInventario = new GridBagConstraints();
			this.gridBagConstraintsEstadoInventario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoInventario.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoInventario.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1EstadoInventario.add(this.jComboBoxTiposArchivosReportesEstadoInventario, this.gridBagConstraintsEstadoInventario);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsEstadoInventario = new GridBagConstraints();
			this.gridBagConstraintsEstadoInventario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoInventario.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoInventario.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoInventario.add(this.jPanelParametrosAuxiliar1EstadoInventario, this.gridBagConstraintsEstadoInventario);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsEstadoInventario = new GridBagConstraints();
			this.gridBagConstraintsEstadoInventario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoInventario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoInventario.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEstadoInventario.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4EstadoInventario.add(this.jComboBoxTiposReportesEstadoInventario, this.gridBagConstraintsEstadoInventario);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsEstadoInventario = new GridBagConstraints();
			this.gridBagConstraintsEstadoInventario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoInventario.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoInventario.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoInventario.add(this.jPanelParametrosAuxiliar4EstadoInventario, this.gridBagConstraintsEstadoInventario);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsEstadoInventario = new GridBagConstraints();
			this.gridBagConstraintsEstadoInventario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoInventario.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoInventario.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoInventario.add(this.jComboBoxTiposReportesEstadoInventario, this.gridBagConstraintsEstadoInventario);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsEstadoInventario = new GridBagConstraints();
			this.gridBagConstraintsEstadoInventario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoInventario.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoInventario.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEstadoInventario.add(this.jCheckBoxGenerarReporteEstadoInventario, this.gridBagConstraintsEstadoInventario);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsEstadoInventario = new GridBagConstraints();
			this.gridBagConstraintsEstadoInventario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoInventario.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoInventario.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoInventario.add(this.jPanelParametrosAuxiliar2EstadoInventario, this.gridBagConstraintsEstadoInventario);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsEstadoInventario = new GridBagConstraints();
			this.gridBagConstraintsEstadoInventario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoInventario.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEstadoInventario.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEstadoInventario.add(this.jLabelAccionesEstadoInventario, this.gridBagConstraintsEstadoInventario);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsEstadoInventario = new GridBagConstraints();
				this.gridBagConstraintsEstadoInventario.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsEstadoInventario.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsEstadoInventario.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesEstadoInventario.add(this.jButtonAbrirOrderByEstadoInventario, this.gridBagConstraintsEstadoInventario);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsEstadoInventario = new GridBagConstraints();
			this.gridBagConstraintsEstadoInventario.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsEstadoInventario.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoInventario.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstadoInventario.add(this.jComboBoxTiposSeleccionarEstadoInventario, this.gridBagConstraintsEstadoInventario);			
			
			
			/*
			this.gridBagConstraintsEstadoInventario = new GridBagConstraints();
			this.gridBagConstraintsEstadoInventario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoInventario.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEstadoInventario.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEstadoInventario.add(this.jCheckBoxSeleccionarTodosEstadoInventario, this.gridBagConstraintsEstadoInventario);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsEstadoInventario = new GridBagConstraints();
			this.gridBagConstraintsEstadoInventario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoInventario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoInventario.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEstadoInventario.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3EstadoInventario.add(this.jCheckBoxSeleccionarTodosEstadoInventario, this.gridBagConstraintsEstadoInventario);															
				
			this.gridBagConstraintsEstadoInventario = new GridBagConstraints();
			this.gridBagConstraintsEstadoInventario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoInventario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoInventario.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEstadoInventario.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3EstadoInventario.add(this.jCheckBoxSeleccionadosEstadoInventario, this.gridBagConstraintsEstadoInventario);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsEstadoInventario = new GridBagConstraints();
			this.gridBagConstraintsEstadoInventario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoInventario.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoInventario.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoInventario.add(this.jPanelParametrosAuxiliar3EstadoInventario, this.gridBagConstraintsEstadoInventario);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsEstadoInventario = new GridBagConstraints();
			this.gridBagConstraintsEstadoInventario.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoInventario.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstadoInventario.add(this.jComboBoxTiposRelacionesEstadoInventario, this.gridBagConstraintsEstadoInventario);
				
			this.gridBagConstraintsEstadoInventario = new GridBagConstraints();
			this.gridBagConstraintsEstadoInventario.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoInventario.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstadoInventario.add(this.jComboBoxTiposAccionesEstadoInventario, this.gridBagConstraintsEstadoInventario);
	
				
			this.gridBagConstraintsEstadoInventario = new GridBagConstraints();
			this.gridBagConstraintsEstadoInventario.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoInventario.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstadoInventario.add(this.jTextFieldValorCampoGeneralEstadoInventario, this.gridBagConstraintsEstadoInventario);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosEstadoInventario = new GridBagLayout();

			this.jScrollPanelDatosEstadoInventario.setLayout(gridaBagLayoutDatosEstadoInventario);
			
			this.gridBagConstraintsEstadoInventario = new GridBagConstraints();
			this.gridBagConstraintsEstadoInventario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoInventario.gridy = 0;
			this.gridBagConstraintsEstadoInventario.gridx = 0;
			
			this.jScrollPanelDatosEstadoInventario.add(this.jTableDatosEstadoInventario, this.gridBagConstraintsEstadoInventario);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosEstadoInventario.setViewportView(this.jTableDatosEstadoInventario);
		this.jTableDatosEstadoInventario.setFillsViewportHeight(true);
		this.jTableDatosEstadoInventario.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesEstadoInventario= new GridBagLayout();
		this.jPanelAccionesEstadoInventario.setLayout(gridaBagLayoutAccionesEstadoInventario);
		
		
		/*	
		this.gridBagConstraintsEstadoInventario = new GridBagConstraints();
		this.gridBagConstraintsEstadoInventario.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoInventario.gridy = 0;
		this.gridBagConstraintsEstadoInventario.gridx = 0;
			
		this.jPanelAccionesEstadoInventario.add(this.jButtonNuevoEstadoInventario, this.gridBagConstraintsEstadoInventario);
		*/
		int iPosXAccion=0;
		
						
		
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutEstadoInventario = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutEstadoInventario);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.estadoinventarioSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsEstadoInventario = new GridBagConstraints();						
			this.gridBagConstraintsEstadoInventario.gridy = iGridyPrincipal++;
			this.gridBagConstraintsEstadoInventario.gridx = 0;		
			//this.gridBagConstraintsEstadoInventario.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoInventario.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsEstadoInventario.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarEstadoInventario, this.gridBagConstraintsEstadoInventario);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsEstadoInventario = new GridBagConstraints();
		this.gridBagConstraintsEstadoInventario.gridy = iGridyPrincipal++;
		this.gridBagConstraintsEstadoInventario.gridx = 0;		
		//this.gridBagConstraintsEstadoInventario.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoInventario.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsEstadoInventario.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsEstadoInventario);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsEstadoInventario = new GridBagConstraints();
		this.gridBagConstraintsEstadoInventario.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoInventario.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesEstadoInventario, this.gridBagConstraintsEstadoInventario);								
		
		
		/*
		this.gridBagConstraintsEstadoInventario = new GridBagConstraints();
		this.gridBagConstraintsEstadoInventario.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoInventario.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesEstadoInventario, this.gridBagConstraintsEstadoInventario);
		*/		
		
		this.gridBagConstraintsEstadoInventario = new GridBagConstraints();
		this.gridBagConstraintsEstadoInventario.gridy =iGridyPrincipal++;
		this.gridBagConstraintsEstadoInventario.gridx =0;
		this.gridBagConstraintsEstadoInventario.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsEstadoInventario.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosEstadoInventario, this.gridBagConstraintsEstadoInventario);
				
		
		this.gridBagConstraintsEstadoInventario = new GridBagConstraints();
		this.gridBagConstraintsEstadoInventario.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoInventario.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionEstadoInventario, this.gridBagConstraintsEstadoInventario);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(EstadoInventarioJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosEstadoInventario= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosEstadoInventario = new GridBagLayout();
			this.jPanelBusquedasParametrosEstadoInventario.setLayout(gridaBagLayoutBusquedasParametrosEstadoInventario);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralEstadoInventario=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralEstadoInventario.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEstadoInventario.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEstadoInventario.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsEstadoInventario = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsEstadoInventario = new GridBagConstraints();
		this.gridBagConstraintsEstadoInventario.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoInventario.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposEstadoInventario, this.gridBagConstraintsEstadoInventario);
			
			
		this.gridBagConstraintsEstadoInventario = new GridBagConstraints();
		this.gridBagConstraintsEstadoInventario.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoInventario.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosEstadoInventario, this.gridBagConstraintsEstadoInventario);
		
			
		this.gridBagConstraintsEstadoInventario = new GridBagConstraints();
		this.gridBagConstraintsEstadoInventario.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsEstadoInventario.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesEstadoInventario, this.gridBagConstraintsEstadoInventario);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralEstadoInventario;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoEstadoInventario() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoEstadoInventario = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoEstadoInventario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoEstadoInventario.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoEstadoInventario.setName("jPanelReporteDinamicoEstadoInventario"); 
		
		this.jPanelReporteDinamicoEstadoInventario.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoEstadoInventario.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoEstadoInventario.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoEstadoInventario.setLayout(gridaBagLayoutReporteDinamicoEstadoInventario);
		
		
		this.jInternalFrameReporteDinamicoEstadoInventario= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoEstadoInventario = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteEstadoInventario= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoEstadoInventario.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoEstadoInventario.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoEstadoInventario.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoEstadoInventario.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoEstadoInventario.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoEstadoInventario.setResizable(true);
	    this.jInternalFrameReporteDinamicoEstadoInventario.setClosable(true);
	    this.jInternalFrameReporteDinamicoEstadoInventario.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoEstadoInventario.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoEstadoInventario.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoEstadoInventario.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoEstadoInventario.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Inventarios"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteEstadoInventario = new JLabelMe();

		this.jLabelColumnasSelectReporteEstadoInventario.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteEstadoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteEstadoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteEstadoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsEstadoInventario = new GridBagConstraints();
		this.gridBagConstraintsEstadoInventario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoInventario.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoInventario.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoEstadoInventario.add(this.jLabelColumnasSelectReporteEstadoInventario, this.gridBagConstraintsEstadoInventario);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteEstadoInventario = new JList<Reporte>();
		this.jListColumnasSelectReporteEstadoInventario.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteEstadoInventario.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteEstadoInventario.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteEstadoInventario.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteEstadoInventario.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteEstadoInventario=new JScrollPane(this.jListColumnasSelectReporteEstadoInventario);
			
			this.jScrollColumnasSelectReporteEstadoInventario.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteEstadoInventario.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteEstadoInventario.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteEstadoInventario.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsEstadoInventario = new GridBagConstraints();
		this.gridBagConstraintsEstadoInventario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoInventario.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoInventario.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoEstadoInventario.add(this.jListColumnasSelectReporteEstadoInventario, this.gridBagConstraintsEstadoInventario);
		this.jPanelReporteDinamicoEstadoInventario.add(this.jScrollColumnasSelectReporteEstadoInventario, this.gridBagConstraintsEstadoInventario);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteEstadoInventario = new JLabelMe();

		this.jLabelRelacionesSelectReporteEstadoInventario.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteEstadoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteEstadoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteEstadoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsEstadoInventario = new GridBagConstraints();
		this.gridBagConstraintsEstadoInventario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoInventario.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoInventario.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoEstadoInventario.add(this.jLabelRelacionesSelectReporteEstadoInventario, this.gridBagConstraintsEstadoInventario);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteEstadoInventario = new JList<Reporte>();
		this.jListRelacionesSelectReporteEstadoInventario.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteEstadoInventario.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteEstadoInventario.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteEstadoInventario.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteEstadoInventario.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteEstadoInventario=new JScrollPane(this.jListRelacionesSelectReporteEstadoInventario);
			
			this.jScrollRelacionesSelectReporteEstadoInventario.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteEstadoInventario.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteEstadoInventario.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteEstadoInventario.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsEstadoInventario = new GridBagConstraints();
		this.gridBagConstraintsEstadoInventario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoInventario.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoInventario.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoEstadoInventario.add(this.jListRelacionesSelectReporteEstadoInventario, this.gridBagConstraintsEstadoInventario);
		this.jPanelReporteDinamicoEstadoInventario.add(this.jScrollRelacionesSelectReporteEstadoInventario, this.gridBagConstraintsEstadoInventario);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoEstadoInventario = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoEstadoInventario = new JComboBoxMe();
		this.jListColumnasValoresGraficoEstadoInventario = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoEstadoInventario = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoEstadoInventario.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoEstadoInventario.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoEstadoInventario.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoEstadoInventario.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoEstadoInventario, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoEstadoInventario = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoEstadoInventario.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoEstadoInventario.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoEstadoInventario.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoEstadoInventario.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoEstadoInventario, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoEstadoInventario = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoEstadoInventario.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoEstadoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoEstadoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoEstadoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsEstadoInventario = new GridBagConstraints();
		this.gridBagConstraintsEstadoInventario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoInventario.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoInventario.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEstadoInventario.add(this.jLabelGenerarExcelReporteDinamicoEstadoInventario, this.gridBagConstraintsEstadoInventario);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoEstadoInventario = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoEstadoInventario.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoEstadoInventario,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoEstadoInventario.setToolTipText("Generar EXCEL"+" "+EstadoInventarioConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsEstadoInventario = new GridBagConstraints();
		//this.gridBagConstraintsEstadoInventario.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsEstadoInventario.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsEstadoInventario.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoEstadoInventario.add(this.jButtonGenerarExcelReporteDinamicoEstadoInventario, this.gridBagConstraintsEstadoInventario);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsEstadoInventario = new GridBagConstraints();
		this.gridBagConstraintsEstadoInventario.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoInventario.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEstadoInventario.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEstadoInventario.add(this.jComboBoxTiposReportesDinamicoEstadoInventario, this.gridBagConstraintsEstadoInventario);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoEstadoInventario = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoEstadoInventario.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoEstadoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoEstadoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoEstadoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsEstadoInventario = new GridBagConstraints();
		this.gridBagConstraintsEstadoInventario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoInventario.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoInventario.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEstadoInventario.add(this.jLabelTiposArchivoReporteDinamicoEstadoInventario, this.gridBagConstraintsEstadoInventario);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsEstadoInventario = new GridBagConstraints();
		this.gridBagConstraintsEstadoInventario.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoInventario.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEstadoInventario.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEstadoInventario.add(this.jComboBoxTiposArchivosReportesDinamicoEstadoInventario, this.gridBagConstraintsEstadoInventario);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoEstadoInventario = new JButtonMe();
		this.jButtonGenerarReporteDinamicoEstadoInventario.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoEstadoInventario,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoEstadoInventario.setToolTipText("Generar"+" "+EstadoInventarioConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsEstadoInventario = new GridBagConstraints();
		this.gridBagConstraintsEstadoInventario.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoInventario.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEstadoInventario.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEstadoInventario.add(this.jButtonGenerarReporteDinamicoEstadoInventario, this.gridBagConstraintsEstadoInventario);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoEstadoInventario = new JButtonMe();
		this.jButtonCerrarReporteDinamicoEstadoInventario.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoEstadoInventario,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoEstadoInventario.setToolTipText("Cancelar"+" "+EstadoInventarioConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsEstadoInventario = new GridBagConstraints();
		this.gridBagConstraintsEstadoInventario.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoInventario.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEstadoInventario.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEstadoInventario.add(this.jButtonCerrarReporteDinamicoEstadoInventario, this.gridBagConstraintsEstadoInventario);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalEstadoInventario = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoEstadoInventario= new JScrollPane(jPanelReporteDinamicoEstadoInventario,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoEstadoInventario.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoEstadoInventario.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoEstadoInventario.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoEstadoInventario.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Inventarios"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsEstadoInventario = new GridBagConstraints();
		this.gridBagConstraintsEstadoInventario.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsEstadoInventario.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsEstadoInventario.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoEstadoInventario.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoEstadoInventario.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalEstadoInventario);
		this.jInternalFrameReporteDinamicoEstadoInventario.getContentPane().add(this.jScrollPanelReporteDinamicoEstadoInventario, this.gridBagConstraintsEstadoInventario);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionEstadoInventario() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionEstadoInventario = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionEstadoInventario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionEstadoInventario.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionEstadoInventario.setName("jPanelImportacionEstadoInventario"); 
		
		this.jPanelImportacionEstadoInventario.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionEstadoInventario.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionEstadoInventario.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionEstadoInventario.setLayout(gridaBagLayoutImportacionEstadoInventario);
		
		
		this.jInternalFrameImportacionEstadoInventario= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionEstadoInventario= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionEstadoInventario = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteEstadoInventario= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionEstadoInventario.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionEstadoInventario.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionEstadoInventario.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionEstadoInventario.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionEstadoInventario.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionEstadoInventario.setResizable(true);
	    this.jInternalFrameImportacionEstadoInventario.setClosable(true);
	    this.jInternalFrameImportacionEstadoInventario.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionEstadoInventario.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionEstadoInventario.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionEstadoInventario.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionEstadoInventario.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionEstadoInventario.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionEstadoInventario.setResizable(true);
	    this.jInternalFrameImportacionEstadoInventario.setClosable(true);
	    this.jInternalFrameImportacionEstadoInventario.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionEstadoInventario.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionEstadoInventario.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionEstadoInventario.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionEstadoInventario.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Inventarios"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionEstadoInventario = new JLabelMe();

		this.jLabelArchivoImportacionEstadoInventario.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionEstadoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionEstadoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionEstadoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsEstadoInventario = new GridBagConstraints();
		this.gridBagConstraintsEstadoInventario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoInventario.gridy = iPosYImportacion;		
		this.gridBagConstraintsEstadoInventario.gridx = iPosXImportacion++;
			
		this.jPanelImportacionEstadoInventario.add(this.jLabelArchivoImportacionEstadoInventario, this.gridBagConstraintsEstadoInventario);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionEstadoInventario = new JFileChooser();		
		this.jFileChooserImportacionEstadoInventario.setToolTipText("ESCOGER ARCHIVO"+" "+EstadoInventarioConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionEstadoInventario = new JButtonMe();
		this.jButtonAbrirImportacionEstadoInventario.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionEstadoInventario,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionEstadoInventario.setToolTipText("Generar"+" "+EstadoInventarioConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsEstadoInventario = new GridBagConstraints();
		this.gridBagConstraintsEstadoInventario.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoInventario.gridy = iPosYImportacion;
		this.gridBagConstraintsEstadoInventario.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEstadoInventario.add(this.jButtonAbrirImportacionEstadoInventario, this.gridBagConstraintsEstadoInventario);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionEstadoInventario = new JLabelMe();

		this.jLabelPathArchivoImportacionEstadoInventario.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionEstadoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionEstadoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionEstadoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsEstadoInventario = new GridBagConstraints();
		this.gridBagConstraintsEstadoInventario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoInventario.gridy = iPosYImportacion;		
		this.gridBagConstraintsEstadoInventario.gridx = iPosXImportacion++;
			
		this.jPanelImportacionEstadoInventario.add(this.jLabelPathArchivoImportacionEstadoInventario, this.gridBagConstraintsEstadoInventario);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionEstadoInventario=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionEstadoInventario.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionEstadoInventario.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionEstadoInventario.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsEstadoInventario = new GridBagConstraints();
		this.gridBagConstraintsEstadoInventario.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoInventario.gridy = iPosYImportacion;
		this.gridBagConstraintsEstadoInventario.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEstadoInventario.add(this.jTextFieldPathArchivoImportacionEstadoInventario, this.gridBagConstraintsEstadoInventario);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionEstadoInventario = new JButtonMe();
		this.jButtonGenerarImportacionEstadoInventario.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionEstadoInventario,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionEstadoInventario.setToolTipText("Generar"+" "+EstadoInventarioConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsEstadoInventario = new GridBagConstraints();
		this.gridBagConstraintsEstadoInventario.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoInventario.gridy = iPosYImportacion;
		this.gridBagConstraintsEstadoInventario.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEstadoInventario.add(this.jButtonGenerarImportacionEstadoInventario, this.gridBagConstraintsEstadoInventario);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionEstadoInventario = new JButtonMe();
		this.jButtonCerrarImportacionEstadoInventario.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionEstadoInventario,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionEstadoInventario.setToolTipText("Cancelar"+" "+EstadoInventarioConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsEstadoInventario = new GridBagConstraints();
		this.gridBagConstraintsEstadoInventario.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoInventario.gridy = iPosYImportacion;
		this.gridBagConstraintsEstadoInventario.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEstadoInventario.add(this.jButtonCerrarImportacionEstadoInventario, this.gridBagConstraintsEstadoInventario);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalEstadoInventario = new GridBagLayout();
		
		this.jScrollPanelImportacionEstadoInventario= new JScrollPane(jPanelImportacionEstadoInventario,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsEstadoInventario = new GridBagConstraints();
		this.gridBagConstraintsEstadoInventario.gridy =iPosYImportacion;
		this.gridBagConstraintsEstadoInventario.gridx =iPosXImportacion;
		this.gridBagConstraintsEstadoInventario.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionEstadoInventario.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionEstadoInventario.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalEstadoInventario);
		this.jInternalFrameImportacionEstadoInventario.getContentPane().add(this.jScrollPanelImportacionEstadoInventario, this.gridBagConstraintsEstadoInventario);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByEstadoInventario(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByEstadoInventario = new JButtonMe();
			this.jButtonAbrirOrderByEstadoInventario.setText("Orden");
			this.jButtonAbrirOrderByEstadoInventario.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByEstadoInventario,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByEstadoInventario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByEstadoInventario";
			inputMap = this.jButtonAbrirOrderByEstadoInventario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByEstadoInventario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByEstadoInventario"));
		
		
			GridBagLayout gridaBagLayoutOrderByEstadoInventario = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByEstadoInventario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByEstadoInventario.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByEstadoInventario.setName("jPanelOrderByEstadoInventario"); 
			
			this.jPanelOrderByEstadoInventario.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByEstadoInventario.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByEstadoInventario.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByEstadoInventario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByEstadoInventario.setLayout(gridaBagLayoutOrderByEstadoInventario);
			
			
			this.jTableDatosEstadoInventarioOrderBy = new JTableMe();        
			this.jTableDatosEstadoInventarioOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosEstadoInventarioOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosEstadoInventarioOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosEstadoInventarioOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosEstadoInventarioOrderBy.setViewportView(this.jTableDatosEstadoInventarioOrderBy);
			this.jTableDatosEstadoInventarioOrderBy.setFillsViewportHeight(true);
			this.jTableDatosEstadoInventarioOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByEstadoInventario= new OrderByJInternalFrame();
			this.jInternalFrameOrderByEstadoInventario= new OrderByJInternalFrame();
			this.jScrollPanelOrderByEstadoInventario = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteEstadoInventario= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByEstadoInventario.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByEstadoInventario.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByEstadoInventario.setTitle("Orden");
			this.jInternalFrameOrderByEstadoInventario.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByEstadoInventario.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByEstadoInventario.setResizable(true);
			this.jInternalFrameOrderByEstadoInventario.setClosable(true);
			this.jInternalFrameOrderByEstadoInventario.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByEstadoInventario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByEstadoInventario.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByEstadoInventario.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByEstadoInventario.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByEstadoInventario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByEstadoInventario.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Inventarios"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsEstadoInventario = new GridBagConstraints();
			this.gridBagConstraintsEstadoInventario.gridy =iPosYOrderBy++;
			this.gridBagConstraintsEstadoInventario.gridx =iPosXOrderBy;
			this.gridBagConstraintsEstadoInventario.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsEstadoInventario.ipady =150;
				
			this.jPanelOrderByEstadoInventario.add(jScrollPanelDatosEstadoInventarioOrderBy, this.gridBagConstraintsEstadoInventario);//this.jTableDatosEstadoInventarioTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByEstadoInventario = new JButtonMe();
			this.jButtonCerrarOrderByEstadoInventario.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByEstadoInventario,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByEstadoInventario.setToolTipText("Cancelar"+" "+EstadoInventarioConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByEstadoInventario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsEstadoInventario = new GridBagConstraints();
			this.gridBagConstraintsEstadoInventario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoInventario.gridy = iPosYOrderBy++;
			this.gridBagConstraintsEstadoInventario.gridx = iPosXOrderBy;
									
			this.jPanelOrderByEstadoInventario.add(this.jButtonCerrarOrderByEstadoInventario, this.gridBagConstraintsEstadoInventario);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalEstadoInventario = new GridBagLayout();
			
			this.jScrollPanelOrderByEstadoInventario= new JScrollPane(jPanelOrderByEstadoInventario,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsEstadoInventario = new GridBagConstraints();
			this.gridBagConstraintsEstadoInventario.gridy =iPosYOrderBy;
			this.gridBagConstraintsEstadoInventario.gridx =iPosXOrderBy;
			this.gridBagConstraintsEstadoInventario.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByEstadoInventario.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByEstadoInventario.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalEstadoInventario);
			
			this.jInternalFrameOrderByEstadoInventario.getContentPane().add(this.jScrollPanelOrderByEstadoInventario, this.gridBagConstraintsEstadoInventario);			
		
		} else {
			this.jButtonAbrirOrderByEstadoInventario = new JButtonMe();
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
		int iWidthTableCalculado=0;//930
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=430;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=300;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=200;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.estadoinventarioSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosEstadoInventario.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosEstadoInventario.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosEstadoInventario.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosEstadoInventario.getRowHeight();//EstadoInventarioConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.estadoinventarioSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > EstadoInventarioConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaEstadoInventario.isSelected()) {
					iHeightTable=EstadoInventarioConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < EstadoInventarioConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=EstadoInventarioConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > EstadoInventarioConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaEstadoInventario.isSelected()) {
					iHeightTable=EstadoInventarioConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < EstadoInventarioConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=EstadoInventarioConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosEstadoInventario.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosEstadoInventario.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosEstadoInventario.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosEstadoInventario.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosEstadoInventario.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosEstadoInventario.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByEstadoInventario!=null && this.jInternalFrameOrderByEstadoInventario.getjTableDatosOrderBy()!=null) {
			//if(!this.estadoinventarioSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByEstadoInventario.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByEstadoInventario.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByEstadoInventario.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByEstadoInventario.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByEstadoInventario.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByEstadoInventario.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByEstadoInventario.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosEstadoInventario.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosEstadoInventario.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosEstadoInventario.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=estadoinventarioLogic.getEstadoInventarios().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=estadoinventarios.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<EstadoInventario> TraerEstadoInventarioBeans(List<EstadoInventario> estadoinventarios,ArrayList<Classe> classes)throws Exception {
		try {
			for(EstadoInventario estadoinventario:estadoinventarios) {
					
				if(!(EstadoInventarioConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || EstadoInventarioConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					estadoinventario.setsDetalleGeneralEntityReporte(EstadoInventarioConstantesFunciones.getEstadoInventarioDescripcion(estadoinventario));
										
						
					
					

					if(estadoinventario.getTransferencias()!=null && Funciones.existeClass(classes,Transferencia.class)) {
						try{estadoinventario.settransferenciasDescripcionReporte(new JRBeanCollectionDataSource(TransferenciaJInternalFrame.TraerTransferenciaBeans(estadoinventario.getTransferencias(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(estadoinventario.getCompras()!=null && Funciones.existeClass(classes,Compra.class)) {
						try{estadoinventario.setcomprasDescripcionReporte(new JRBeanCollectionDataSource(CompraJInternalFrame.TraerCompraBeans(estadoinventario.getCompras(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//estadoinventario.setsDetalleGeneralEntityReporte(estadoinventario.getsDetalleGeneralEntityReporte());
										
				}
				
				//estadoinventariobeans.add(estadoinventariobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return estadoinventarios;
    }
	//PARA REPORTES FIN
}
