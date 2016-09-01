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


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;

import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;

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
import com.bydan.erp.facturacion.util.LibroContableConstantesFunciones;

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
public class LibroContableJInternalFrame extends LibroContableBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarLibroContable;
	
	protected JMenuBar jmenuBarLibroContable;
	
	protected JMenu jmenuLibroContable;
	protected JMenu jmenuDatosLibroContable;
	protected JMenu jmenuArchivoLibroContable;
	protected JMenu jmenuAccionesLibroContable;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosLibroContable = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutLibroContable;	
	protected GridBagConstraints gridBagConstraintsLibroContable;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public LibroContableDetalleFormJInternalFrame jInternalFrameDetalleFormLibroContable;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoLibroContable;	
	protected ImportacionJInternalFrame jInternalFrameImportacionLibroContable;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public LibroContableSessionBean librocontableSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<LibroContable> librocontables;		
	public List<LibroContable> librocontablesEliminados;	
	public List<LibroContable> librocontablesAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByLibroContable;		
	protected JButton jButtonAbrirOrderByLibroContable;
	
	
	//protected JPanel jPanelOrderByLibroContable;
	//public JScrollPane jScrollPanelOrderByLibroContable;	
	//protected JButton jButtonCerrarOrderByLibroContable;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public LibroContableLogic librocontableLogic;
	
	
	
	public JScrollPane jScrollPanelDatosLibroContable;
	public JScrollPane jScrollPanelDatosEdicionLibroContable;
	public JScrollPane jScrollPanelDatosGeneralLibroContable;
    
	
	
	//public JScrollPane jScrollPanelDatosLibroContableOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoLibroContable;
	//public JScrollPane jScrollPanelImportacionLibroContable;
	
	
	
	protected JPanel jPanelAccionesLibroContable;
	
    protected JPanel jPanelPaginacionLibroContable;
    protected JPanel jPanelParametrosReportesLibroContable;
	protected JPanel jPanelParametrosReportesAccionesLibroContable;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1LibroContable;
	protected JPanel jPanelParametrosAuxiliar2LibroContable;
	protected JPanel jPanelParametrosAuxiliar3LibroContable;
	protected JPanel jPanelParametrosAuxiliar4LibroContable;
	//protected JPanel jPanelParametrosAuxiliar5LibroContable;
	
	
	
	//protected JPanel jPanelReporteDinamicoLibroContable;
	//protected JPanel jPanelImportacionLibroContable;
	
	
	public JTable jTableDatosLibroContable;
	
	
	
	//public JTable jTableDatosLibroContableOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoLibroContable;
	protected JButton jButtonDuplicarLibroContable;
	protected JButton jButtonCopiarLibroContable;
	protected JButton jButtonVerFormLibroContable;
	protected JButton jButtonNuevoRelacionesLibroContable;
	protected JButton jButtonModificarLibroContable;
	
    protected JButton jButtonGuardarCambiosTablaLibroContable;
	protected JButton jButtonCerrarLibroContable;
	
	
	protected JButton jButtonRecargarInformacionLibroContable;
	protected JButton jButtonProcesarInformacionLibroContable;
	
	
	protected JButton jButtonAnterioresLibroContable;
	protected JButton jButtonSiguientesLibroContable;
	protected JButton jButtonNuevoGuardarCambiosLibroContable;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoLibroContable;
	//protected JButton jButtonCerrarReporteDinamicoLibroContable;
	//protected JButton jButtonGenerarExcelReporteDinamicoLibroContable;	
	
	
	
	//protected JButton jButtonAbrirImportacionLibroContable;
	//protected JButton jButtonGenerarImportacionLibroContable;
	//protected JButton jButtonCerrarImportacionLibroContable;
	//protected JFileChooser jFileChooserImportacionLibroContable;
	//protected File fileImportacionLibroContable;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarLibroContable;
	protected JButton jButtonDuplicarToolBarLibroContable;
	protected JButton jButtonNuevoRelacionesToolBarLibroContable;
	
	
	public JButton jButtonGuardarCambiosToolBarLibroContable;
	protected JButton jButtonCopiarToolBarLibroContable;
	protected JButton jButtonVerFormToolBarLibroContable;
	public JButton jButtonGuardarCambiosTablaToolBarLibroContable;
	protected JButton jButtonMostrarOcultarTablaToolBarLibroContable;
	protected JButton jButtonCerrarToolBarLibroContable;
	
	protected JButton jButtonRecargarInformacionToolBarLibroContable;
	protected JButton jButtonProcesarInformacionToolBarLibroContable;
	protected JButton jButtonAnterioresToolBarLibroContable;
	protected JButton jButtonSiguientesToolBarLibroContable;
	protected JButton jButtonNuevoGuardarCambiosToolBarLibroContable;
	protected JButton jButtonAbrirOrderByToolBarLibroContable;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoLibroContable;
	protected JMenuItem jMenuItemDuplicarLibroContable;
	protected JMenuItem jMenuItemNuevoRelacionesLibroContable;
	
	
	protected JMenuItem jMenuItemGuardarCambiosLibroContable;
	protected JMenuItem jMenuItemCopiarLibroContable;
	protected JMenuItem jMenuItemVerFormLibroContable;
	protected JMenuItem jMenuItemGuardarCambiosTablaLibroContable;
	protected JMenuItem jMenuItemCerrarLibroContable;
	protected JMenuItem jMenuItemDetalleCerrarLibroContable;
	protected JMenuItem jMenuItemDetalleAbrirOrderByLibroContable;
	protected JMenuItem jMenuItemDetalleMostarOcultarLibroContable;
	
	protected JMenuItem jMenuItemRecargarInformacionLibroContable;
	protected JMenuItem jMenuItemProcesarInformacionLibroContable;
	protected JMenuItem jMenuItemAnterioresLibroContable;
	protected JMenuItem jMenuItemSiguientesLibroContable;
	protected JMenuItem jMenuItemNuevoGuardarCambiosLibroContable;
	protected JMenuItem jMenuItemAbrirOrderByLibroContable;
	protected JMenuItem jMenuItemMostrarOcultarLibroContable;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesLibroContable;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosLibroContable;
	protected JCheckBox jCheckBoxSeleccionadosLibroContable;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaLibroContable;
	protected JCheckBox jCheckBoxConGraficoReporteLibroContable;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesLibroContable;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesLibroContable;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoLibroContable;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoLibroContable;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesLibroContable;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionLibroContable;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesLibroContable;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesLibroContable;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarLibroContable;
	protected JTextField jTextFieldValorCampoGeneralLibroContable;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteLibroContable;
	//public JList<Reporte> jListColumnasSelectReporteLibroContable;
	//public JScrollPane jScrollColumnasSelectReporteLibroContable;
	
	//public JLabel jLabelRelacionesSelectReporteLibroContable;
	//public JList<Reporte> jListRelacionesSelectReporteLibroContable;
	//public JScrollPane jScrollRelacionesSelectReporteLibroContable;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoLibroContable;
	//protected JCheckBox jCheckBoxConGraficoDinamicoLibroContable;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoLibroContable;
	//public JLabel jLabelTiposArchivoReporteDinamicoLibroContable;
	
		
	//public JLabel jLabelArchivoImportacionLibroContable;	
	//public JLabel jLabelPathArchivoImportacionLibroContable;
	//protected JTextField jTextFieldPathArchivoImportacionLibroContable;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoLibroContable;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoLibroContable;
	
	//public JLabel jLabelColumnaCategoriaValorLibroContable;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorLibroContable;
	
	//public JLabel jLabelColumnasValoresGraficoLibroContable;
	//public JList<Reporte> jListColumnasValoresGraficoLibroContable;
	//public JScrollPane jScrollColumnasValoresGraficoLibroContable;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoLibroContable;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoLibroContable;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasLibroContable;
	public JPanel jPanelBusquedaPorCodigoLibroContable;
	public JButton jButtonBusquedaPorCodigoLibroContable;
	public JPanel jPanelBusquedaPorNombreLibroContable;
	public JButton jButtonBusquedaPorNombreLibroContable;
	
	public JPanel jPanelcodigoBusquedaPorCodigoLibroContable;
	public JLabel jLabelcodigoBusquedaPorCodigoLibroContable;
	public JTextField jTextFieldcodigoBusquedaPorCodigoLibroContable;
	public JButton jButtoncodigoBusquedaPorCodigoLibroContableBusqueda= new JButtonMe();

	
	public JPanel jPanelnombreBusquedaPorNombreLibroContable;
	public JLabel jLabelnombreBusquedaPorNombreLibroContable;
	public JTextArea jTextAreanombreBusquedaPorNombreLibroContable;
	public JButton jButtonnombreBusquedaPorNombreLibroContableBusqueda= new JButtonMe();

	
	
	
	
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
	public LibroContableJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("LibroContable No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public LibroContableJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("LibroContable No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public LibroContableJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("LibroContable No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public LibroContableJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("LibroContable No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionLibroContable)	{
		this.jButtonRecargarInformacionLibroContable = jButtonRecargarInformacionLibroContable;
	}
	
	public JButton getjButtonProcesarInformacionLibroContable() {
		return this.jButtonProcesarInformacionLibroContable;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionLibroContable)	{
		this.jButtonProcesarInformacionLibroContable = jButtonProcesarInformacionLibroContable;
	}
	
	
	public JButton getjButtonRecargarInformacionLibroContable() {
		return this.jButtonRecargarInformacionLibroContable;
	}
	
	
	public List<LibroContable> getlibrocontables() {
		return this.librocontables;
	}

	public void setlibrocontables(List<LibroContable> librocontables) {
		this.librocontables = librocontables;
	}
	
	public List<LibroContable> getlibrocontablesAux() {
		return this.librocontablesAux;
	}

	public void setlibrocontablesAux(List<LibroContable> librocontablesAux) {
		this.librocontablesAux = librocontablesAux;
	}
	
	public List<LibroContable> getlibrocontablesEliminados() {
		return this.librocontablesEliminados;
	}

	public void setLibroContablesEliminados(List<LibroContable> librocontablesEliminados) {
		this.librocontablesEliminados = librocontablesEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarLibroContable() {
		return jComboBoxTiposSeleccionarLibroContable;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarLibroContable(
			JComboBox jComboBoxTiposSeleccionarLibroContable) {
		this.jComboBoxTiposSeleccionarLibroContable = jComboBoxTiposSeleccionarLibroContable;
	}
	
	public void setBorderResaltarTiposSeleccionarLibroContable() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarLibroContable.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarLibroContable .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralLibroContable() {
		return jTextFieldValorCampoGeneralLibroContable;
	}

	public void setjTextFieldValorCampoGeneralLibroContable(
			JTextField jTextFieldValorCampoGeneralLibroContable) {
		this.jTextFieldValorCampoGeneralLibroContable = jTextFieldValorCampoGeneralLibroContable;
	}

	public void setBorderResaltarValorCampoGeneralLibroContable() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarLibroContable.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralLibroContable .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosLibroContable() {
		return this.jCheckBoxSeleccionarTodosLibroContable;
	}

	public void setjCheckBoxSeleccionarTodosLibroContable(
			JCheckBox jCheckBoxSeleccionarTodosLibroContable) {
		this.jCheckBoxSeleccionarTodosLibroContable = jCheckBoxSeleccionarTodosLibroContable;
	}

	public void setBorderResaltarSeleccionarTodosLibroContable() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarLibroContable.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosLibroContable .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosLibroContable() {
		return this.jCheckBoxSeleccionadosLibroContable;
	}

	public void setjCheckBoxSeleccionadosLibroContable(
			JCheckBox jCheckBoxSeleccionadosLibroContable) {
		this.jCheckBoxSeleccionadosLibroContable = jCheckBoxSeleccionadosLibroContable;
	}
	
	public void setBorderResaltarSeleccionadosLibroContable() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarLibroContable.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosLibroContable .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesLibroContable() {
		return this.jComboBoxTiposArchivosReportesLibroContable;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesLibroContable(
			JComboBox jComboBoxTiposArchivosReportesLibroContable) {
		this.jComboBoxTiposArchivosReportesLibroContable = jComboBoxTiposArchivosReportesLibroContable;
	}

	public void setBorderResaltarTiposArchivosReportesLibroContable() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarLibroContable.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesLibroContable .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesLibroContable() {
		return this.jComboBoxTiposReportesLibroContable;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesLibroContable(
			JComboBox jComboBoxTiposReportesLibroContable) {
		this.jComboBoxTiposReportesLibroContable = jComboBoxTiposReportesLibroContable;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoLibroContable() {
	//	return jComboBoxTiposReportesDinamicoLibroContable;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoLibroContable(
	//		JComboBox jComboBoxTiposReportesDinamicoLibroContable) {
	//	this.jComboBoxTiposReportesDinamicoLibroContable = jComboBoxTiposReportesDinamicoLibroContable;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoLibroContable() {
	//	return jComboBoxTiposArchivosReportesDinamicoLibroContable;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoLibroContable(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoLibroContable) {
	//	this.jComboBoxTiposArchivosReportesDinamicoLibroContable = jComboBoxTiposArchivosReportesDinamicoLibroContable;
	//}
	
	public void setBorderResaltarTiposReportesLibroContable() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarLibroContable.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesLibroContable .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesLibroContable() {
		return this.jComboBoxTiposGraficosReportesLibroContable;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesLibroContable(
			JComboBox jComboBoxTiposGraficosReportesLibroContable) {
		this.jComboBoxTiposGraficosReportesLibroContable = jComboBoxTiposGraficosReportesLibroContable;
	}
	
	public void setBorderResaltarTiposGraficosReportesLibroContable() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarLibroContable.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesLibroContable .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionLibroContable() {
		return this.jComboBoxTiposPaginacionLibroContable;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionLibroContable(
			JComboBox jComboBoxTiposPaginacionLibroContable) {
		this.jComboBoxTiposPaginacionLibroContable = jComboBoxTiposPaginacionLibroContable;
	}
	
	public void setBorderResaltarTiposPaginacionLibroContable() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarLibroContable.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionLibroContable .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesLibroContable() {
		return this.jComboBoxTiposRelacionesLibroContable;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesLibroContable() {
		return this.jComboBoxTiposAccionesLibroContable;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesLibroContable(
			JComboBox jComboBoxTiposRelacionesLibroContable) {
		this.jComboBoxTiposRelacionesLibroContable = jComboBoxTiposRelacionesLibroContable;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesLibroContable(
			JComboBox jComboBoxTiposAccionesLibroContable) {
		this.jComboBoxTiposAccionesLibroContable = jComboBoxTiposAccionesLibroContable;
	}
	
	public void setBorderResaltarTiposRelacionesLibroContable() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarLibroContable.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesLibroContable .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesLibroContable() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarLibroContable.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesLibroContable .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoLibroContable() {
	//	return jCheckBoxConGraficoDinamicoLibroContable;
	//}

	//public void setjCheckBoxConGraficoDinamicoLibroContable(
	//		JCheckBox jCheckBoxConGraficoDinamicoLibroContable) {
	//	this.jCheckBoxConGraficoDinamicoLibroContable = jCheckBoxConGraficoDinamicoLibroContable;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoLibroContable() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarLibroContable.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoLibroContable .setBorder(borderResaltar);		
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
		this.librocontableSessionBean=new LibroContableSessionBean();
		
		this.librocontableSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.librocontableSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.librocontableSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=LibroContableJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=LibroContableJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		LibroContableJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		LibroContableJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		LibroContableJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Libro Contable MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.librocontableSessionBean.getEsGuardarRelacionado()) {
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
		
		LibroContableJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("LibroContable No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarLibroContable= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarLibroContable=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarLibroContable,this.jTtoolBarLibroContable,
							"nuevo","nuevo","Nuevo"+" "+LibroContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarLibroContable=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarLibroContable,this.jTtoolBarLibroContable,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarLibroContable=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarLibroContable,this.jTtoolBarLibroContable,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+LibroContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarLibroContable=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarLibroContable,this.jTtoolBarLibroContable,
							"duplicar","duplicar","Duplicar"+" "+LibroContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarLibroContable=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarLibroContable,this.jTtoolBarLibroContable,
							"copiar","copiar","Copiar"+" "+LibroContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarLibroContable=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarLibroContable,this.jTtoolBarLibroContable,
							"ver_form","ver_form","Ver"+" "+LibroContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarLibroContable=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarLibroContable,this.jTtoolBarLibroContable,
							"recargar","recargar","Recargar"+" "+LibroContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarLibroContable=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarLibroContable,this.jTtoolBarLibroContable,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarLibroContable=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarLibroContable,this.jTtoolBarLibroContable,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarLibroContable=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarLibroContable,this.jTtoolBarLibroContable,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarLibroContable=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarLibroContable,this.jTtoolBarLibroContable,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarLibroContable=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarLibroContable,this.jTtoolBarLibroContable,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+LibroContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarLibroContable=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarLibroContable,this.jTtoolBarLibroContable,
							"cerrar","cerrar","Salir"+" "+LibroContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarLibroContable=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarLibroContable;
			
				this.jButtonProcesarInformacionToolBarLibroContable=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarLibroContable;
				
		//protected JButton jButtonModificarToolBarLibroContable;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarLibroContable=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuLibroContable=new JMenuMe("General");
		this.jmenuArchivoLibroContable=new JMenuMe("Archivo");
		this.jmenuAccionesLibroContable=new JMenuMe("Acciones");
		this.jmenuDatosLibroContable=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoLibroContable= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoLibroContable.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoLibroContable,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoLibroContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarLibroContable= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarLibroContable.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarLibroContable,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarLibroContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesLibroContable= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesLibroContable.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesLibroContable,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesLibroContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosLibroContable= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosLibroContable.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosLibroContable,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosLibroContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarLibroContable= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarLibroContable.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarLibroContable,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarLibroContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormLibroContable= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormLibroContable.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormLibroContable,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormLibroContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaLibroContable= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaLibroContable.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaLibroContable,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaLibroContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarLibroContable= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarLibroContable.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarLibroContable,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarLibroContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionLibroContable= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionLibroContable.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionLibroContable,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionLibroContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionLibroContable= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionLibroContable.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionLibroContable,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresLibroContable= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresLibroContable.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresLibroContable,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresLibroContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesLibroContable= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesLibroContable.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesLibroContable,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesLibroContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByLibroContable= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByLibroContable.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByLibroContable,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByLibroContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarLibroContable= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarLibroContable.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarLibroContable,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarLibroContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByLibroContable= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByLibroContable.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByLibroContable,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByLibroContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarLibroContable= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarLibroContable.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarLibroContable,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarLibroContable, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosLibroContable= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosLibroContable.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosLibroContable,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosLibroContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoLibroContable.add(this.jMenuItemCerrarLibroContable);
			
			this.jmenuAccionesLibroContable.add(this.jMenuItemNuevoLibroContable);
			this.jmenuAccionesLibroContable.add(this.jMenuItemNuevoGuardarCambiosLibroContable);
			this.jmenuAccionesLibroContable.add(this.jMenuItemNuevoRelacionesLibroContable);
			this.jmenuAccionesLibroContable.add(this.jMenuItemGuardarCambiosTablaLibroContable);		
			this.jmenuAccionesLibroContable.add(this.jMenuItemDuplicarLibroContable);		
			this.jmenuAccionesLibroContable.add(this.jMenuItemCopiarLibroContable);		
			this.jmenuAccionesLibroContable.add(this.jMenuItemVerFormLibroContable);		
			
			this.jmenuDatosLibroContable.add(this.jMenuItemRecargarInformacionLibroContable);				
			this.jmenuDatosLibroContable.add(this.jMenuItemAnterioresLibroContable);				
			this.jmenuDatosLibroContable.add(this.jMenuItemSiguientesLibroContable);				
			this.jmenuDatosLibroContable.add(this.jMenuItemAbrirOrderByLibroContable);				
			this.jmenuDatosLibroContable.add(this.jMenuItemMostrarOcultarLibroContable);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesLibroContable.add(this.jMenuItemGuardarCambiosLibroContable);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoLibroContable, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesLibroContable, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosLibroContable, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarLibroContable.add(this.jmenuArchivoLibroContable);		
			this.jmenuBarLibroContable.add(this.jmenuAccionesLibroContable);		
			this.jmenuBarLibroContable.add(this.jmenuDatosLibroContable);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarLibroContable);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasLibroContable() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaPorCodigoLibroContable=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorCodigoLibroContable.setToolTipText("Buscar Por Codigo ");
		this.jButtonBusquedaPorCodigoLibroContable= new JButtonMe();
		this.jButtonBusquedaPorCodigoLibroContable.setText("Buscar");
		this.jButtonBusquedaPorCodigoLibroContable.setToolTipText("Buscar Por Codigo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorCodigoLibroContable,"buscar_button","Buscar Por Codigo ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorCodigoLibroContable, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelcodigoBusquedaPorCodigoLibroContable = new JLabelMe();
		jLabelcodigoBusquedaPorCodigoLibroContable.setText("Codigo :");
		jLabelcodigoBusquedaPorCodigoLibroContable.setToolTipText("Codigo");
		jLabelcodigoBusquedaPorCodigoLibroContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelcodigoBusquedaPorCodigoLibroContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelcodigoBusquedaPorCodigoLibroContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelcodigoBusquedaPorCodigoLibroContable,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextFieldcodigoBusquedaPorCodigoLibroContable= new JTextFieldMe();
		jTextFieldcodigoBusquedaPorCodigoLibroContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoBusquedaPorCodigoLibroContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoBusquedaPorCodigoLibroContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoBusquedaPorCodigoLibroContable,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelBusquedaPorNombreLibroContable=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorNombreLibroContable.setToolTipText("Buscar Por Nombre ");
		this.jButtonBusquedaPorNombreLibroContable= new JButtonMe();
		this.jButtonBusquedaPorNombreLibroContable.setText("Buscar");
		this.jButtonBusquedaPorNombreLibroContable.setToolTipText("Buscar Por Nombre ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorNombreLibroContable,"buscar_button","Buscar Por Nombre ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorNombreLibroContable, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelnombreBusquedaPorNombreLibroContable = new JLabelMe();
		jLabelnombreBusquedaPorNombreLibroContable.setText("Nombre :");
		jLabelnombreBusquedaPorNombreLibroContable.setToolTipText("Nombre");
		jLabelnombreBusquedaPorNombreLibroContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombreLibroContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombreLibroContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelnombreBusquedaPorNombreLibroContable,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextAreanombreBusquedaPorNombreLibroContable= new JTextAreaMe();
		jTextAreanombreBusquedaPorNombreLibroContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBusquedaPorNombreLibroContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBusquedaPorNombreLibroContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextArea(jTextAreanombreBusquedaPorNombreLibroContable,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasLibroContable=new JTabbedPane();


		this.jTabbedPaneBusquedasLibroContable.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasLibroContable.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasLibroContable.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasLibroContable.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasLibroContable.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasLibroContable,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleLibroContable = new LibroContableDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Libro Contable DATOS");
			this.jInternalFrameDetalleFormLibroContable = new LibroContableDetalleFormJInternalFrame(jDesktopPane,this.librocontableSessionBean.getConGuardarRelaciones(),this.librocontableSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormLibroContable = null;//new LibroContableDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutLibroContable= new GridBagLayout();
		
		
		this.jTableDatosLibroContable = new JTableMe();      
		
		String sToolTipLibroContable="";
		sToolTipLibroContable=LibroContableConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipLibroContable+="(Facturacion.LibroContable)";
		}
		
		if(!this.librocontableSessionBean.getEsGuardarRelacionado()) {
			sToolTipLibroContable+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosLibroContable.setToolTipText(sToolTipLibroContable);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosLibroContable);
		this.jTableDatosLibroContable.setAutoCreateRowSorter(true);
		this.jTableDatosLibroContable.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosLibroContable.setRowSelectionAllowed(true);
		this.jTableDatosLibroContable.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosLibroContable,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoLibroContable = new JButtonMe();
		this.jButtonDuplicarLibroContable = new JButtonMe();
		this.jButtonCopiarLibroContable = new JButtonMe();
		this.jButtonVerFormLibroContable = new JButtonMe();
		this.jButtonNuevoRelacionesLibroContable = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaLibroContable = new JButtonMe();
		this.jButtonCerrarLibroContable = new JButtonMe();
		
		this.jScrollPanelDatosLibroContable = new JScrollPane();   
        this.jScrollPanelDatosGeneralLibroContable = new JScrollPane();
		
				
		
		
		this.jPanelAccionesLibroContable = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Libro Contable";
		
		if(!this.librocontableSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosLibroContable.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Libro Contables" + this.sPath));
		} else {
			this.jScrollPanelDatosLibroContable.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralLibroContable.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesLibroContable.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesLibroContable.setToolTipText("Acciones");
        this.jPanelAccionesLibroContable.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralLibroContable, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosLibroContable, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoLibroContable=new ReporteDinamicoJInternalFrame(LibroContableConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoLibroContable();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionLibroContable=new ImportacionJInternalFrame(LibroContableConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionLibroContable();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByLibroContable = new JButtonMe();
		
		this.jButtonAbrirOrderByLibroContable.setText("Orden");
		this.jButtonAbrirOrderByLibroContable.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByLibroContable,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByLibroContable, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByLibroContable.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByLibroContable.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByLibroContable=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByLibroContable,false,this);
			
			//this.cargarOrderByLibroContable(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByLibroContable=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByLibroContable,true,this);
			
			//this.cargarOrderByLibroContable(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosLibroContable.setMinimumSize(new Dimension(400,50));//430
		this.jTableDatosLibroContable.setMaximumSize(new Dimension(400,50));//430
		this.jTableDatosLibroContable.setPreferredSize(new Dimension(400,50));//430
		
		this.jScrollPanelDatosLibroContable.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosLibroContable.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosLibroContable.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoLibroContable.setText("Nuevo");
		this.jButtonDuplicarLibroContable.setText("Duplicar");
		this.jButtonCopiarLibroContable.setText("Copiar");
		this.jButtonVerFormLibroContable.setText("Ver");
		this.jButtonNuevoRelacionesLibroContable.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaLibroContable.setText("Guardar");
		this.jButtonCerrarLibroContable.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoLibroContable,"nuevo_button","Nuevo",this.librocontableSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarLibroContable,"duplicar_button","Duplicar",this.librocontableSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarLibroContable,"copiar_button","Copiar",this.librocontableSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormLibroContable,"ver_form","Ver",this.librocontableSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesLibroContable,"nuevorelaciones_button","Nuevo Rel",this.librocontableSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaLibroContable,"guardarcambiostabla_button","Guardar",this.librocontableSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarLibroContable,"cerrar_button","Salir",this.librocontableSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoLibroContable, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarLibroContable, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarLibroContable, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormLibroContable, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesLibroContable, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaLibroContable, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarLibroContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoLibroContable.setToolTipText("Nuevo"+" "+LibroContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarLibroContable.setToolTipText("Duplicar"+" "+LibroContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarLibroContable.setToolTipText("Copiar"+" "+LibroContableConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormLibroContable.setToolTipText("Ver"+" "+LibroContableConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesLibroContable.setToolTipText("Nuevo Rel"+" "+LibroContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaLibroContable.setToolTipText("Guardar"+" "+LibroContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarLibroContable.setToolTipText("Salir"+" "+LibroContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoLibroContable";
		inputMap = this.jButtonNuevoLibroContable.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoLibroContable.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoLibroContable"));
		
		//DUPLICAR
		sMapKey = "DuplicarLibroContable";
		inputMap = this.jButtonDuplicarLibroContable.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarLibroContable.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarLibroContable"));
		
		//COPIAR
		sMapKey = "CopiarLibroContable";
		inputMap = this.jButtonCopiarLibroContable.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarLibroContable.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarLibroContable"));
		
		//VEr FORM
		sMapKey = "VerFormLibroContable";
		inputMap = this.jButtonVerFormLibroContable.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormLibroContable.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormLibroContable"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesLibroContable";
		inputMap = this.jButtonNuevoRelacionesLibroContable.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesLibroContable.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesLibroContable"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarLibroContable";
		inputMap = this.jButtonModificarLibroContable.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarLibroContable.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarLibroContable"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarLibroContable";
		inputMap = this.jButtonCerrarLibroContable.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarLibroContable.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarLibroContable"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaLibroContable";
		inputMap = this.jButtonGuardarCambiosTablaLibroContable.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaLibroContable.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaLibroContable"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesLibroContable = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesLibroContable = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionLibroContable = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1LibroContable= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2LibroContable= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3LibroContable= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4LibroContable= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5LibroContable= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesLibroContable.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesLibroContable.setName("jPanelParametrosReportesLibroContable"); 
		
		this.jPanelParametrosReportesAccionesLibroContable.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesLibroContable.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesLibroContable.setName("jPanelParametrosReportesAccionesLibroContable"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesLibroContable, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesLibroContable, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionLibroContable = new JButtonMe();
		this.jButtonRecargarInformacionLibroContable.setText("Recargar");
		this.jButtonRecargarInformacionLibroContable.setToolTipText("Recargar"+" "+LibroContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionLibroContable,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionLibroContable = new JButtonMe();
		this.jButtonProcesarInformacionLibroContable.setText("Procesar");
		this.jButtonProcesarInformacionLibroContable.setToolTipText("Procesar"+" "+LibroContableConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionLibroContable.setVisible(false);
			
		this.jButtonProcesarInformacionLibroContable.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionLibroContable.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionLibroContable.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesLibroContable = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesLibroContable.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesLibroContable.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesLibroContable = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesLibroContable.setText("TIPO");       
		this.jComboBoxTiposReportesLibroContable.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesLibroContable = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesLibroContable.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesLibroContable.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionLibroContable = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionLibroContable.setText("Paginacion");
		this.jComboBoxTiposPaginacionLibroContable.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesLibroContable = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesLibroContable.setText("Accion");
		this.jComboBoxTiposRelacionesLibroContable.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesLibroContable = new JComboBoxMe();
		//this.jComboBoxTiposAccionesLibroContable.setText("Accion");
		this.jComboBoxTiposAccionesLibroContable.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarLibroContable = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarLibroContable.setText("Accion");
		this.jComboBoxTiposSeleccionarLibroContable.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralLibroContable=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralLibroContable.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralLibroContable.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralLibroContable.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesLibroContable = new JLabelMe();
		
		this.jLabelAccionesLibroContable.setText("Acciones");		
		this.jLabelAccionesLibroContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesLibroContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesLibroContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosLibroContable = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosLibroContable.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosLibroContable.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosLibroContable = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosLibroContable.setText("Seleccionados");
		this.jCheckBoxSeleccionadosLibroContable.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaLibroContable = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaLibroContable.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaLibroContable.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteLibroContable = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteLibroContable.setText("Graf.");
		this.jCheckBoxConGraficoReporteLibroContable.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresLibroContable = new JButtonMe();
		//this.jButtonAnterioresLibroContable.setText("<<");
        this.jButtonAnterioresLibroContable.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresLibroContable,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresLibroContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesLibroContable = new JButtonMe();
		//this.jButtonSiguientesLibroContable.setText(">>");
        this.jButtonSiguientesLibroContable.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesLibroContable,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesLibroContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosLibroContable = new JButtonMe();
		this.jButtonNuevoGuardarCambiosLibroContable.setText("Nue");
        this.jButtonNuevoGuardarCambiosLibroContable.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosLibroContable,"nuevoguardarcambios_button","Nue",this.librocontableSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosLibroContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosLibroContable";
		inputMap = this.jButtonNuevoGuardarCambiosLibroContable.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosLibroContable.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosLibroContable"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionLibroContable";
		inputMap = this.jButtonRecargarInformacionLibroContable.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionLibroContable.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionLibroContable"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesLibroContable";
		inputMap = this.jButtonSiguientesLibroContable.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesLibroContable.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesLibroContable"));
		
		//ANTERIORES		
		sMapKey = "AnterioresLibroContable";
		inputMap = this.jButtonAnterioresLibroContable.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresLibroContable.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresLibroContable"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasLibroContable();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesLibroContable.setMinimumSize(new Dimension(this.getWidth(),LibroContableBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(LibroContableBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesLibroContable.setMaximumSize(new Dimension(this.getWidth(),LibroContableBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(LibroContableBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesLibroContable.setPreferredSize(new Dimension(this.getWidth(),LibroContableBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(LibroContableBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionLibroContable = new GridBagLayout();

			this.jPanelPaginacionLibroContable.setLayout(gridaBagLayoutPaginacionLibroContable);						
			
			this.gridBagConstraintsLibroContable = new GridBagConstraints();
			this.gridBagConstraintsLibroContable.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsLibroContable.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsLibroContable.gridy = 0;
			this.gridBagConstraintsLibroContable.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionLibroContable.add(this.jButtonAnterioresLibroContable, this.gridBagConstraintsLibroContable);
					
						
			this.gridBagConstraintsLibroContable = new GridBagConstraints();
			this.gridBagConstraintsLibroContable.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsLibroContable.gridy = 0;
			
			this.jPanelPaginacionLibroContable.add(this.jButtonNuevoGuardarCambiosLibroContable, this.gridBagConstraintsLibroContable);
						
			
			this.gridBagConstraintsLibroContable = new GridBagConstraints();
			this.gridBagConstraintsLibroContable.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsLibroContable.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsLibroContable.gridy = 0;
			this.jPanelPaginacionLibroContable.add(this.jButtonSiguientesLibroContable, this.gridBagConstraintsLibroContable);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsLibroContable = new GridBagConstraints();
			this.gridBagConstraintsLibroContable.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsLibroContable.gridy = 1;
			this.gridBagConstraintsLibroContable.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionLibroContable.add(this.jButtonNuevoLibroContable, this.gridBagConstraintsLibroContable);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsLibroContable = new GridBagConstraints();
				this.gridBagConstraintsLibroContable.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsLibroContable.gridy = 1;
				this.gridBagConstraintsLibroContable.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionLibroContable.add(this.jButtonNuevoRelacionesLibroContable, this.gridBagConstraintsLibroContable);
			}
			
			
			if(!this.librocontableSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsLibroContable = new GridBagConstraints();
				this.gridBagConstraintsLibroContable.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsLibroContable.gridy = 1;
				this.gridBagConstraintsLibroContable.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionLibroContable.add(this.jButtonGuardarCambiosTablaLibroContable, this.gridBagConstraintsLibroContable);
			}
			
			
			
			this.gridBagConstraintsLibroContable = new GridBagConstraints();
			this.gridBagConstraintsLibroContable.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsLibroContable.gridy = 1;
			this.gridBagConstraintsLibroContable.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionLibroContable.add(this.jButtonDuplicarLibroContable, this.gridBagConstraintsLibroContable);
			
			this.gridBagConstraintsLibroContable = new GridBagConstraints();
			this.gridBagConstraintsLibroContable.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsLibroContable.gridy = 1;
			this.gridBagConstraintsLibroContable.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionLibroContable.add(this.jButtonCopiarLibroContable, this.gridBagConstraintsLibroContable);
		
			this.gridBagConstraintsLibroContable = new GridBagConstraints();
			this.gridBagConstraintsLibroContable.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsLibroContable.gridy = 1;
			this.gridBagConstraintsLibroContable.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionLibroContable.add(this.jButtonVerFormLibroContable, this.gridBagConstraintsLibroContable);
		
			this.gridBagConstraintsLibroContable = new GridBagConstraints();
			this.gridBagConstraintsLibroContable.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsLibroContable.gridy = 1;
			this.gridBagConstraintsLibroContable.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionLibroContable.add(this.jButtonCerrarLibroContable, this.gridBagConstraintsLibroContable);
		
		
		
		this.jButtonRecargarInformacionLibroContable.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionLibroContable.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionLibroContable.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionLibroContable, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesLibroContable.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesLibroContable.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesLibroContable.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesLibroContable, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesLibroContable.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesLibroContable.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesLibroContable.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesLibroContable, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesLibroContable.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesLibroContable.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesLibroContable.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesLibroContable, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionLibroContable.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionLibroContable.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionLibroContable.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionLibroContable, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesLibroContable.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesLibroContable.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesLibroContable.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesLibroContable, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesLibroContable.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesLibroContable.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesLibroContable.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesLibroContable, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarLibroContable.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarLibroContable.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarLibroContable.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarLibroContable, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaLibroContable.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaLibroContable.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaLibroContable.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaLibroContable, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteLibroContable.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteLibroContable.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteLibroContable.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteLibroContable, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosLibroContable.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosLibroContable.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosLibroContable.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosLibroContable, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosLibroContable.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosLibroContable.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosLibroContable.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosLibroContable, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesLibroContable = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesLibroContable = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1LibroContable = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2LibroContable = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3LibroContable = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4LibroContable = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesLibroContable.setLayout(gridaBagParametrosReportesLibroContable);
			this.jPanelParametrosReportesAccionesLibroContable.setLayout(gridaBagParametrosReportesAccionesLibroContable);
			
			
			this.jPanelParametrosAuxiliar1LibroContable.setLayout(gridaBagParametrosAuxiliar1LibroContable);
			this.jPanelParametrosAuxiliar2LibroContable.setLayout(gridaBagParametrosAuxiliar2LibroContable);
			this.jPanelParametrosAuxiliar3LibroContable.setLayout(gridaBagParametrosAuxiliar3LibroContable);
			this.jPanelParametrosAuxiliar4LibroContable.setLayout(gridaBagParametrosAuxiliar4LibroContable);
			//this.jPanelParametrosAuxiliar5LibroContable.setLayout(gridaBagParametrosAuxiliar2LibroContable);			
			
			
			
			
			this.gridBagConstraintsLibroContable = new GridBagConstraints();
			this.gridBagConstraintsLibroContable.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsLibroContable.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsLibroContable.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesLibroContable.add(this.jButtonRecargarInformacionLibroContable, this.gridBagConstraintsLibroContable);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsLibroContable = new GridBagConstraints();
			this.gridBagConstraintsLibroContable.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsLibroContable.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsLibroContable.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1LibroContable.add(this.jComboBoxTiposPaginacionLibroContable, this.gridBagConstraintsLibroContable);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsLibroContable = new GridBagConstraints();
			this.gridBagConstraintsLibroContable.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsLibroContable.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsLibroContable.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1LibroContable.add(this.jCheckBoxConAltoMaximoTablaLibroContable, this.gridBagConstraintsLibroContable);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsLibroContable = new GridBagConstraints();
			this.gridBagConstraintsLibroContable.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsLibroContable.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsLibroContable.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1LibroContable.add(this.jComboBoxTiposArchivosReportesLibroContable, this.gridBagConstraintsLibroContable);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsLibroContable = new GridBagConstraints();
			this.gridBagConstraintsLibroContable.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsLibroContable.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsLibroContable.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesLibroContable.add(this.jPanelParametrosAuxiliar1LibroContable, this.gridBagConstraintsLibroContable);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsLibroContable = new GridBagConstraints();
			this.gridBagConstraintsLibroContable.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsLibroContable.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsLibroContable.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsLibroContable.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4LibroContable.add(this.jComboBoxTiposReportesLibroContable, this.gridBagConstraintsLibroContable);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsLibroContable = new GridBagConstraints();
			this.gridBagConstraintsLibroContable.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsLibroContable.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsLibroContable.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesLibroContable.add(this.jPanelParametrosAuxiliar4LibroContable, this.gridBagConstraintsLibroContable);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsLibroContable = new GridBagConstraints();
			this.gridBagConstraintsLibroContable.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsLibroContable.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsLibroContable.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesLibroContable.add(this.jComboBoxTiposReportesLibroContable, this.gridBagConstraintsLibroContable);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsLibroContable = new GridBagConstraints();
			this.gridBagConstraintsLibroContable.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsLibroContable.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsLibroContable.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesLibroContable.add(this.jCheckBoxGenerarReporteLibroContable, this.gridBagConstraintsLibroContable);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsLibroContable = new GridBagConstraints();
			this.gridBagConstraintsLibroContable.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsLibroContable.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsLibroContable.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesLibroContable.add(this.jPanelParametrosAuxiliar2LibroContable, this.gridBagConstraintsLibroContable);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsLibroContable = new GridBagConstraints();
			this.gridBagConstraintsLibroContable.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsLibroContable.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsLibroContable.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesLibroContable.add(this.jLabelAccionesLibroContable, this.gridBagConstraintsLibroContable);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsLibroContable = new GridBagConstraints();
				this.gridBagConstraintsLibroContable.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsLibroContable.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsLibroContable.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesLibroContable.add(this.jButtonAbrirOrderByLibroContable, this.gridBagConstraintsLibroContable);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsLibroContable = new GridBagConstraints();
			this.gridBagConstraintsLibroContable.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsLibroContable.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsLibroContable.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesLibroContable.add(this.jComboBoxTiposSeleccionarLibroContable, this.gridBagConstraintsLibroContable);			
			
			
			/*
			this.gridBagConstraintsLibroContable = new GridBagConstraints();
			this.gridBagConstraintsLibroContable.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsLibroContable.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsLibroContable.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesLibroContable.add(this.jCheckBoxSeleccionarTodosLibroContable, this.gridBagConstraintsLibroContable);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsLibroContable = new GridBagConstraints();
			this.gridBagConstraintsLibroContable.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsLibroContable.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsLibroContable.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsLibroContable.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3LibroContable.add(this.jCheckBoxSeleccionarTodosLibroContable, this.gridBagConstraintsLibroContable);															
				
			this.gridBagConstraintsLibroContable = new GridBagConstraints();
			this.gridBagConstraintsLibroContable.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsLibroContable.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsLibroContable.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsLibroContable.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3LibroContable.add(this.jCheckBoxSeleccionadosLibroContable, this.gridBagConstraintsLibroContable);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsLibroContable = new GridBagConstraints();
			this.gridBagConstraintsLibroContable.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsLibroContable.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsLibroContable.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesLibroContable.add(this.jPanelParametrosAuxiliar3LibroContable, this.gridBagConstraintsLibroContable);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsLibroContable = new GridBagConstraints();
			this.gridBagConstraintsLibroContable.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsLibroContable.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesLibroContable.add(this.jComboBoxTiposRelacionesLibroContable, this.gridBagConstraintsLibroContable);
				
			this.gridBagConstraintsLibroContable = new GridBagConstraints();
			this.gridBagConstraintsLibroContable.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsLibroContable.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesLibroContable.add(this.jComboBoxTiposAccionesLibroContable, this.gridBagConstraintsLibroContable);
	
				
			this.gridBagConstraintsLibroContable = new GridBagConstraints();
			this.gridBagConstraintsLibroContable.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsLibroContable.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesLibroContable.add(this.jTextFieldValorCampoGeneralLibroContable, this.gridBagConstraintsLibroContable);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosLibroContable = new GridBagLayout();

			this.jScrollPanelDatosLibroContable.setLayout(gridaBagLayoutDatosLibroContable);
			
			this.gridBagConstraintsLibroContable = new GridBagConstraints();
			this.gridBagConstraintsLibroContable.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsLibroContable.gridy = 0;
			this.gridBagConstraintsLibroContable.gridx = 0;
			
			this.jScrollPanelDatosLibroContable.add(this.jTableDatosLibroContable, this.gridBagConstraintsLibroContable);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosLibroContable.setViewportView(this.jTableDatosLibroContable);
		this.jTableDatosLibroContable.setFillsViewportHeight(true);
		this.jTableDatosLibroContable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesLibroContable= new GridBagLayout();
		this.jPanelAccionesLibroContable.setLayout(gridaBagLayoutAccionesLibroContable);
		
		
		/*	
		this.gridBagConstraintsLibroContable = new GridBagConstraints();
		this.gridBagConstraintsLibroContable.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsLibroContable.gridy = 0;
		this.gridBagConstraintsLibroContable.gridx = 0;
			
		this.jPanelAccionesLibroContable.add(this.jButtonNuevoLibroContable, this.gridBagConstraintsLibroContable);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaPorCodigoLibroContable= new GridBagLayout();
		gridaBagLayoutBusquedaPorCodigoLibroContable.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorCodigoLibroContable.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorCodigoLibroContable.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorCodigoLibroContable.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorCodigoLibroContable.setLayout(gridaBagLayoutBusquedaPorCodigoLibroContable);

		gridBagConstraintsLibroContable = new GridBagConstraints();
		gridBagConstraintsLibroContable.anchor = GridBagConstraints.WEST;
		gridBagConstraintsLibroContable.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsLibroContable.gridy = 0;
		gridBagConstraintsLibroContable.gridx = 0;
		jPanelBusquedaPorCodigoLibroContable.add(jLabelcodigoBusquedaPorCodigoLibroContable, gridBagConstraintsLibroContable);

		gridBagConstraintsLibroContable = new GridBagConstraints();
		gridBagConstraintsLibroContable.anchor = GridBagConstraints.WEST;
		gridBagConstraintsLibroContable.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsLibroContable.gridy = 0;
		gridBagConstraintsLibroContable.gridx = 1;
		jPanelBusquedaPorCodigoLibroContable.add(jTextFieldcodigoBusquedaPorCodigoLibroContable, gridBagConstraintsLibroContable);

		gridBagConstraintsLibroContable = new GridBagConstraints();
		gridBagConstraintsLibroContable.anchor = GridBagConstraints.WEST;
		gridBagConstraintsLibroContable.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsLibroContable.gridy = 1;
		gridBagConstraintsLibroContable.gridx =1;
		jPanelBusquedaPorCodigoLibroContable.add(jButtonBusquedaPorCodigoLibroContable, gridBagConstraintsLibroContable);

		jTabbedPaneBusquedasLibroContable.addTab("1.-Por Codigo ", jPanelBusquedaPorCodigoLibroContable);
		jTabbedPaneBusquedasLibroContable.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutBusquedaPorNombreLibroContable= new GridBagLayout();
		gridaBagLayoutBusquedaPorNombreLibroContable.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorNombreLibroContable.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorNombreLibroContable.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorNombreLibroContable.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorNombreLibroContable.setLayout(gridaBagLayoutBusquedaPorNombreLibroContable);

		gridBagConstraintsLibroContable = new GridBagConstraints();
		gridBagConstraintsLibroContable.anchor = GridBagConstraints.WEST;
		gridBagConstraintsLibroContable.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsLibroContable.gridy = 0;
		gridBagConstraintsLibroContable.gridx = 0;
		jPanelBusquedaPorNombreLibroContable.add(jLabelnombreBusquedaPorNombreLibroContable, gridBagConstraintsLibroContable);

		gridBagConstraintsLibroContable = new GridBagConstraints();
		gridBagConstraintsLibroContable.anchor = GridBagConstraints.WEST;
		gridBagConstraintsLibroContable.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsLibroContable.gridy = 0;
		gridBagConstraintsLibroContable.gridx = 1;
		jPanelBusquedaPorNombreLibroContable.add(jTextAreanombreBusquedaPorNombreLibroContable, gridBagConstraintsLibroContable);

		gridBagConstraintsLibroContable = new GridBagConstraints();
		gridBagConstraintsLibroContable.anchor = GridBagConstraints.WEST;
		gridBagConstraintsLibroContable.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsLibroContable.gridy = 1;
		gridBagConstraintsLibroContable.gridx =1;
		jPanelBusquedaPorNombreLibroContable.add(jButtonBusquedaPorNombreLibroContable, gridBagConstraintsLibroContable);

		jTabbedPaneBusquedasLibroContable.addTab("2.-Por Nombre ", jPanelBusquedaPorNombreLibroContable);
		jTabbedPaneBusquedasLibroContable.setMnemonicAt(1, KeyEvent.VK_2);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutLibroContable = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutLibroContable);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.librocontableSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsLibroContable = new GridBagConstraints();						
			this.gridBagConstraintsLibroContable.gridy = iGridyPrincipal++;
			this.gridBagConstraintsLibroContable.gridx = 0;		
			//this.gridBagConstraintsLibroContable.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsLibroContable.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsLibroContable.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarLibroContable, this.gridBagConstraintsLibroContable);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsLibroContable = new GridBagConstraints();
		this.gridBagConstraintsLibroContable.gridy = iGridyPrincipal++;
		this.gridBagConstraintsLibroContable.gridx = 0;		
		//this.gridBagConstraintsLibroContable.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsLibroContable.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsLibroContable.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsLibroContable);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsLibroContable = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsLibroContable.gridy = iGridyPrincipal++;
			this.gridBagConstraintsLibroContable.gridx = 0;		
			this.gridBagConstraintsLibroContable.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsLibroContable.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsLibroContable.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasLibroContable, this.gridBagConstraintsLibroContable);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsLibroContable = new GridBagConstraints();
		this.gridBagConstraintsLibroContable.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsLibroContable.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesLibroContable, this.gridBagConstraintsLibroContable);								
		
		
		/*
		this.gridBagConstraintsLibroContable = new GridBagConstraints();
		this.gridBagConstraintsLibroContable.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsLibroContable.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesLibroContable, this.gridBagConstraintsLibroContable);
		*/		
		
		this.gridBagConstraintsLibroContable = new GridBagConstraints();
		this.gridBagConstraintsLibroContable.gridy =iGridyPrincipal++;
		this.gridBagConstraintsLibroContable.gridx =0;
		this.gridBagConstraintsLibroContable.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsLibroContable.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosLibroContable, this.gridBagConstraintsLibroContable);
				
		
		this.gridBagConstraintsLibroContable = new GridBagConstraints();
		this.gridBagConstraintsLibroContable.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsLibroContable.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionLibroContable, this.gridBagConstraintsLibroContable);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(LibroContableJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosLibroContable= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosLibroContable = new GridBagLayout();
			this.jPanelBusquedasParametrosLibroContable.setLayout(gridaBagLayoutBusquedasParametrosLibroContable);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralLibroContable=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralLibroContable.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralLibroContable.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralLibroContable.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsLibroContable = new GridBagConstraints();
			
			
			
			
			//if(!this.conCargarMinimo) {
			
			//}
			
			this.conMaximoRelaciones=true;
			
			if(this.parametroGeneralUsuario.getcon_cargar_por_parte()) {
			}
			
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
			
			
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
		this.gridBagConstraintsLibroContable = new GridBagConstraints();
		this.gridBagConstraintsLibroContable.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsLibroContable.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposLibroContable, this.gridBagConstraintsLibroContable);
			
			
		this.gridBagConstraintsLibroContable = new GridBagConstraints();
		this.gridBagConstraintsLibroContable.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsLibroContable.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosLibroContable, this.gridBagConstraintsLibroContable);
		
			
		this.gridBagConstraintsLibroContable = new GridBagConstraints();
		this.gridBagConstraintsLibroContable.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsLibroContable.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesLibroContable, this.gridBagConstraintsLibroContable);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralLibroContable;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoLibroContable() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoLibroContable = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoLibroContable = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoLibroContable.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoLibroContable.setName("jPanelReporteDinamicoLibroContable"); 
		
		this.jPanelReporteDinamicoLibroContable.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoLibroContable.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoLibroContable.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoLibroContable.setLayout(gridaBagLayoutReporteDinamicoLibroContable);
		
		
		this.jInternalFrameReporteDinamicoLibroContable= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoLibroContable = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteLibroContable= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoLibroContable.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoLibroContable.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoLibroContable.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoLibroContable.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoLibroContable.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoLibroContable.setResizable(true);
	    this.jInternalFrameReporteDinamicoLibroContable.setClosable(true);
	    this.jInternalFrameReporteDinamicoLibroContable.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoLibroContable.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoLibroContable.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoLibroContable.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoLibroContable.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Libro Contables"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteLibroContable = new JLabelMe();

		this.jLabelColumnasSelectReporteLibroContable.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteLibroContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteLibroContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteLibroContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsLibroContable = new GridBagConstraints();
		this.gridBagConstraintsLibroContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsLibroContable.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsLibroContable.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoLibroContable.add(this.jLabelColumnasSelectReporteLibroContable, this.gridBagConstraintsLibroContable);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteLibroContable = new JList<Reporte>();
		this.jListColumnasSelectReporteLibroContable.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteLibroContable.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteLibroContable.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteLibroContable.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteLibroContable.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteLibroContable=new JScrollPane(this.jListColumnasSelectReporteLibroContable);
			
			this.jScrollColumnasSelectReporteLibroContable.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteLibroContable.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteLibroContable.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteLibroContable.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsLibroContable = new GridBagConstraints();
		this.gridBagConstraintsLibroContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsLibroContable.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsLibroContable.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoLibroContable.add(this.jListColumnasSelectReporteLibroContable, this.gridBagConstraintsLibroContable);
		this.jPanelReporteDinamicoLibroContable.add(this.jScrollColumnasSelectReporteLibroContable, this.gridBagConstraintsLibroContable);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteLibroContable = new JLabelMe();

		this.jLabelRelacionesSelectReporteLibroContable.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteLibroContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteLibroContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteLibroContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsLibroContable = new GridBagConstraints();
		this.gridBagConstraintsLibroContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsLibroContable.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsLibroContable.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoLibroContable.add(this.jLabelRelacionesSelectReporteLibroContable, this.gridBagConstraintsLibroContable);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteLibroContable = new JList<Reporte>();
		this.jListRelacionesSelectReporteLibroContable.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteLibroContable.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteLibroContable.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteLibroContable.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteLibroContable.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteLibroContable=new JScrollPane(this.jListRelacionesSelectReporteLibroContable);
			
			this.jScrollRelacionesSelectReporteLibroContable.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteLibroContable.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteLibroContable.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteLibroContable.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsLibroContable = new GridBagConstraints();
		this.gridBagConstraintsLibroContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsLibroContable.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsLibroContable.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoLibroContable.add(this.jListRelacionesSelectReporteLibroContable, this.gridBagConstraintsLibroContable);
		this.jPanelReporteDinamicoLibroContable.add(this.jScrollRelacionesSelectReporteLibroContable, this.gridBagConstraintsLibroContable);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoLibroContable = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoLibroContable = new JComboBoxMe();
		this.jListColumnasValoresGraficoLibroContable = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoLibroContable = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoLibroContable.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoLibroContable.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoLibroContable.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoLibroContable.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoLibroContable, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoLibroContable = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoLibroContable.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoLibroContable.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoLibroContable.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoLibroContable.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoLibroContable, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoLibroContable = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoLibroContable.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoLibroContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoLibroContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoLibroContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsLibroContable = new GridBagConstraints();
		this.gridBagConstraintsLibroContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsLibroContable.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsLibroContable.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoLibroContable.add(this.jLabelGenerarExcelReporteDinamicoLibroContable, this.gridBagConstraintsLibroContable);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoLibroContable = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoLibroContable.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoLibroContable,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoLibroContable.setToolTipText("Generar EXCEL"+" "+LibroContableConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsLibroContable = new GridBagConstraints();
		//this.gridBagConstraintsLibroContable.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsLibroContable.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsLibroContable.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoLibroContable.add(this.jButtonGenerarExcelReporteDinamicoLibroContable, this.gridBagConstraintsLibroContable);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsLibroContable = new GridBagConstraints();
		this.gridBagConstraintsLibroContable.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsLibroContable.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsLibroContable.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoLibroContable.add(this.jComboBoxTiposReportesDinamicoLibroContable, this.gridBagConstraintsLibroContable);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoLibroContable = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoLibroContable.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoLibroContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoLibroContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoLibroContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsLibroContable = new GridBagConstraints();
		this.gridBagConstraintsLibroContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsLibroContable.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsLibroContable.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoLibroContable.add(this.jLabelTiposArchivoReporteDinamicoLibroContable, this.gridBagConstraintsLibroContable);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsLibroContable = new GridBagConstraints();
		this.gridBagConstraintsLibroContable.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsLibroContable.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsLibroContable.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoLibroContable.add(this.jComboBoxTiposArchivosReportesDinamicoLibroContable, this.gridBagConstraintsLibroContable);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoLibroContable = new JButtonMe();
		this.jButtonGenerarReporteDinamicoLibroContable.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoLibroContable,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoLibroContable.setToolTipText("Generar"+" "+LibroContableConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsLibroContable = new GridBagConstraints();
		this.gridBagConstraintsLibroContable.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsLibroContable.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsLibroContable.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoLibroContable.add(this.jButtonGenerarReporteDinamicoLibroContable, this.gridBagConstraintsLibroContable);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoLibroContable = new JButtonMe();
		this.jButtonCerrarReporteDinamicoLibroContable.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoLibroContable,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoLibroContable.setToolTipText("Cancelar"+" "+LibroContableConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsLibroContable = new GridBagConstraints();
		this.gridBagConstraintsLibroContable.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsLibroContable.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsLibroContable.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoLibroContable.add(this.jButtonCerrarReporteDinamicoLibroContable, this.gridBagConstraintsLibroContable);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalLibroContable = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoLibroContable= new JScrollPane(jPanelReporteDinamicoLibroContable,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoLibroContable.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoLibroContable.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoLibroContable.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoLibroContable.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Libro Contables"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsLibroContable = new GridBagConstraints();
		this.gridBagConstraintsLibroContable.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsLibroContable.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsLibroContable.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoLibroContable.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoLibroContable.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalLibroContable);
		this.jInternalFrameReporteDinamicoLibroContable.getContentPane().add(this.jScrollPanelReporteDinamicoLibroContable, this.gridBagConstraintsLibroContable);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionLibroContable() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionLibroContable = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionLibroContable = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionLibroContable.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionLibroContable.setName("jPanelImportacionLibroContable"); 
		
		this.jPanelImportacionLibroContable.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionLibroContable.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionLibroContable.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionLibroContable.setLayout(gridaBagLayoutImportacionLibroContable);
		
		
		this.jInternalFrameImportacionLibroContable= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionLibroContable= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionLibroContable = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteLibroContable= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionLibroContable.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionLibroContable.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionLibroContable.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionLibroContable.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionLibroContable.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionLibroContable.setResizable(true);
	    this.jInternalFrameImportacionLibroContable.setClosable(true);
	    this.jInternalFrameImportacionLibroContable.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionLibroContable.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionLibroContable.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionLibroContable.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionLibroContable.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionLibroContable.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionLibroContable.setResizable(true);
	    this.jInternalFrameImportacionLibroContable.setClosable(true);
	    this.jInternalFrameImportacionLibroContable.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionLibroContable.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionLibroContable.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionLibroContable.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionLibroContable.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Libro Contables"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionLibroContable = new JLabelMe();

		this.jLabelArchivoImportacionLibroContable.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionLibroContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionLibroContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionLibroContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsLibroContable = new GridBagConstraints();
		this.gridBagConstraintsLibroContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsLibroContable.gridy = iPosYImportacion;		
		this.gridBagConstraintsLibroContable.gridx = iPosXImportacion++;
			
		this.jPanelImportacionLibroContable.add(this.jLabelArchivoImportacionLibroContable, this.gridBagConstraintsLibroContable);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionLibroContable = new JFileChooser();		
		this.jFileChooserImportacionLibroContable.setToolTipText("ESCOGER ARCHIVO"+" "+LibroContableConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionLibroContable = new JButtonMe();
		this.jButtonAbrirImportacionLibroContable.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionLibroContable,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionLibroContable.setToolTipText("Generar"+" "+LibroContableConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsLibroContable = new GridBagConstraints();
		this.gridBagConstraintsLibroContable.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsLibroContable.gridy = iPosYImportacion;
		this.gridBagConstraintsLibroContable.gridx = iPosXImportacion++;
							
		this.jPanelImportacionLibroContable.add(this.jButtonAbrirImportacionLibroContable, this.gridBagConstraintsLibroContable);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionLibroContable = new JLabelMe();

		this.jLabelPathArchivoImportacionLibroContable.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionLibroContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionLibroContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionLibroContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsLibroContable = new GridBagConstraints();
		this.gridBagConstraintsLibroContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsLibroContable.gridy = iPosYImportacion;		
		this.gridBagConstraintsLibroContable.gridx = iPosXImportacion++;
			
		this.jPanelImportacionLibroContable.add(this.jLabelPathArchivoImportacionLibroContable, this.gridBagConstraintsLibroContable);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionLibroContable=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionLibroContable.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionLibroContable.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionLibroContable.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsLibroContable = new GridBagConstraints();
		this.gridBagConstraintsLibroContable.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsLibroContable.gridy = iPosYImportacion;
		this.gridBagConstraintsLibroContable.gridx = iPosXImportacion++;
							
		this.jPanelImportacionLibroContable.add(this.jTextFieldPathArchivoImportacionLibroContable, this.gridBagConstraintsLibroContable);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionLibroContable = new JButtonMe();
		this.jButtonGenerarImportacionLibroContable.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionLibroContable,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionLibroContable.setToolTipText("Generar"+" "+LibroContableConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsLibroContable = new GridBagConstraints();
		this.gridBagConstraintsLibroContable.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsLibroContable.gridy = iPosYImportacion;
		this.gridBagConstraintsLibroContable.gridx = iPosXImportacion++;
							
		this.jPanelImportacionLibroContable.add(this.jButtonGenerarImportacionLibroContable, this.gridBagConstraintsLibroContable);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionLibroContable = new JButtonMe();
		this.jButtonCerrarImportacionLibroContable.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionLibroContable,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionLibroContable.setToolTipText("Cancelar"+" "+LibroContableConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsLibroContable = new GridBagConstraints();
		this.gridBagConstraintsLibroContable.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsLibroContable.gridy = iPosYImportacion;
		this.gridBagConstraintsLibroContable.gridx = iPosXImportacion++;
							
		this.jPanelImportacionLibroContable.add(this.jButtonCerrarImportacionLibroContable, this.gridBagConstraintsLibroContable);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalLibroContable = new GridBagLayout();
		
		this.jScrollPanelImportacionLibroContable= new JScrollPane(jPanelImportacionLibroContable,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsLibroContable = new GridBagConstraints();
		this.gridBagConstraintsLibroContable.gridy =iPosYImportacion;
		this.gridBagConstraintsLibroContable.gridx =iPosXImportacion;
		this.gridBagConstraintsLibroContable.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionLibroContable.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionLibroContable.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalLibroContable);
		this.jInternalFrameImportacionLibroContable.getContentPane().add(this.jScrollPanelImportacionLibroContable, this.gridBagConstraintsLibroContable);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByLibroContable(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByLibroContable = new JButtonMe();
			this.jButtonAbrirOrderByLibroContable.setText("Orden");
			this.jButtonAbrirOrderByLibroContable.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByLibroContable,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByLibroContable, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByLibroContable";
			inputMap = this.jButtonAbrirOrderByLibroContable.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByLibroContable.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByLibroContable"));
		
		
			GridBagLayout gridaBagLayoutOrderByLibroContable = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByLibroContable = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByLibroContable.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByLibroContable.setName("jPanelOrderByLibroContable"); 
			
			this.jPanelOrderByLibroContable.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByLibroContable.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByLibroContable.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByLibroContable, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByLibroContable.setLayout(gridaBagLayoutOrderByLibroContable);
			
			
			this.jTableDatosLibroContableOrderBy = new JTableMe();        
			this.jTableDatosLibroContableOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosLibroContableOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosLibroContableOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosLibroContableOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosLibroContableOrderBy.setViewportView(this.jTableDatosLibroContableOrderBy);
			this.jTableDatosLibroContableOrderBy.setFillsViewportHeight(true);
			this.jTableDatosLibroContableOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByLibroContable= new OrderByJInternalFrame();
			this.jInternalFrameOrderByLibroContable= new OrderByJInternalFrame();
			this.jScrollPanelOrderByLibroContable = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteLibroContable= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByLibroContable.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByLibroContable.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByLibroContable.setTitle("Orden");
			this.jInternalFrameOrderByLibroContable.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByLibroContable.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByLibroContable.setResizable(true);
			this.jInternalFrameOrderByLibroContable.setClosable(true);
			this.jInternalFrameOrderByLibroContable.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByLibroContable, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByLibroContable.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByLibroContable.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByLibroContable.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByLibroContable, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByLibroContable.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Libro Contables"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsLibroContable = new GridBagConstraints();
			this.gridBagConstraintsLibroContable.gridy =iPosYOrderBy++;
			this.gridBagConstraintsLibroContable.gridx =iPosXOrderBy;
			this.gridBagConstraintsLibroContable.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsLibroContable.ipady =150;
				
			this.jPanelOrderByLibroContable.add(jScrollPanelDatosLibroContableOrderBy, this.gridBagConstraintsLibroContable);//this.jTableDatosLibroContableTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByLibroContable = new JButtonMe();
			this.jButtonCerrarOrderByLibroContable.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByLibroContable,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByLibroContable.setToolTipText("Cancelar"+" "+LibroContableConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByLibroContable, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsLibroContable = new GridBagConstraints();
			this.gridBagConstraintsLibroContable.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsLibroContable.gridy = iPosYOrderBy++;
			this.gridBagConstraintsLibroContable.gridx = iPosXOrderBy;
									
			this.jPanelOrderByLibroContable.add(this.jButtonCerrarOrderByLibroContable, this.gridBagConstraintsLibroContable);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalLibroContable = new GridBagLayout();
			
			this.jScrollPanelOrderByLibroContable= new JScrollPane(jPanelOrderByLibroContable,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsLibroContable = new GridBagConstraints();
			this.gridBagConstraintsLibroContable.gridy =iPosYOrderBy;
			this.gridBagConstraintsLibroContable.gridx =iPosXOrderBy;
			this.gridBagConstraintsLibroContable.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByLibroContable.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByLibroContable.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalLibroContable);
			
			this.jInternalFrameOrderByLibroContable.getContentPane().add(this.jScrollPanelOrderByLibroContable, this.gridBagConstraintsLibroContable);			
		
		} else {
			this.jButtonAbrirOrderByLibroContable = new JButtonMe();
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
			iWidthTableCalculado+=400;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=200;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.librocontableSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosLibroContable.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosLibroContable.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosLibroContable.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosLibroContable.getRowHeight();//LibroContableConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.librocontableSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > LibroContableConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaLibroContable.isSelected()) {
					iHeightTable=LibroContableConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < LibroContableConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=LibroContableConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > LibroContableConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaLibroContable.isSelected()) {
					iHeightTable=LibroContableConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < LibroContableConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=LibroContableConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosLibroContable.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosLibroContable.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosLibroContable.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosLibroContable.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosLibroContable.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosLibroContable.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByLibroContable!=null && this.jInternalFrameOrderByLibroContable.getjTableDatosOrderBy()!=null) {
			//if(!this.librocontableSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByLibroContable.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByLibroContable.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByLibroContable.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByLibroContable.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByLibroContable.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByLibroContable.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByLibroContable.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosLibroContable.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosLibroContable.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosLibroContable.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=librocontableLogic.getLibroContables().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=librocontables.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<LibroContable> TraerLibroContableBeans(List<LibroContable> librocontables,ArrayList<Classe> classes)throws Exception {
		try {
			for(LibroContable librocontable:librocontables) {
					
				if(!(LibroContableConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || LibroContableConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					librocontable.setsDetalleGeneralEntityReporte(LibroContableConstantesFunciones.getLibroContableDescripcion(librocontable));
										
						
					
					

					if(librocontable.getParametroFactuPrincipals()!=null && Funciones.existeClass(classes,ParametroFactuPrincipal.class)) {
						try{librocontable.setparametrofactuprincipalsDescripcionReporte(new JRBeanCollectionDataSource(ParametroFactuPrincipalJInternalFrame.TraerParametroFactuPrincipalBeans(librocontable.getParametroFactuPrincipals(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(librocontable.getDefinicions()!=null && Funciones.existeClass(classes,Definicion.class)) {
						try{librocontable.setdefinicionsDescripcionReporte(new JRBeanCollectionDataSource(DefinicionJInternalFrame.TraerDefinicionBeans(librocontable.getDefinicions(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//librocontable.setsDetalleGeneralEntityReporte(librocontable.getsDetalleGeneralEntityReporte());
										
				}
				
				//librocontablebeans.add(librocontablebean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return librocontables;
    }
	//PARA REPORTES FIN
}
