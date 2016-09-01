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

import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;

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
import com.bydan.erp.cartera.util.TipoVentaConstantesFunciones;

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
public class TipoVentaJInternalFrame extends TipoVentaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarTipoVenta;
	
	protected JMenuBar jmenuBarTipoVenta;
	
	protected JMenu jmenuTipoVenta;
	protected JMenu jmenuDatosTipoVenta;
	protected JMenu jmenuArchivoTipoVenta;
	protected JMenu jmenuAccionesTipoVenta;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosTipoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoVenta;	
	protected GridBagConstraints gridBagConstraintsTipoVenta;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public TipoVentaDetalleFormJInternalFrame jInternalFrameDetalleFormTipoVenta;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoTipoVenta;	
	protected ImportacionJInternalFrame jInternalFrameImportacionTipoVenta;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public TipoVentaSessionBean tipoventaSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<TipoVenta> tipoventas;		
	public List<TipoVenta> tipoventasEliminados;	
	public List<TipoVenta> tipoventasAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByTipoVenta;		
	protected JButton jButtonAbrirOrderByTipoVenta;
	
	
	//protected JPanel jPanelOrderByTipoVenta;
	//public JScrollPane jScrollPanelOrderByTipoVenta;	
	//protected JButton jButtonCerrarOrderByTipoVenta;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public TipoVentaLogic tipoventaLogic;
	
	
	
	public JScrollPane jScrollPanelDatosTipoVenta;
	public JScrollPane jScrollPanelDatosEdicionTipoVenta;
	public JScrollPane jScrollPanelDatosGeneralTipoVenta;
    
	
	
	//public JScrollPane jScrollPanelDatosTipoVentaOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoTipoVenta;
	//public JScrollPane jScrollPanelImportacionTipoVenta;
	
	
	
	protected JPanel jPanelAccionesTipoVenta;
	
    protected JPanel jPanelPaginacionTipoVenta;
    protected JPanel jPanelParametrosReportesTipoVenta;
	protected JPanel jPanelParametrosReportesAccionesTipoVenta;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1TipoVenta;
	protected JPanel jPanelParametrosAuxiliar2TipoVenta;
	protected JPanel jPanelParametrosAuxiliar3TipoVenta;
	protected JPanel jPanelParametrosAuxiliar4TipoVenta;
	//protected JPanel jPanelParametrosAuxiliar5TipoVenta;
	
	
	
	//protected JPanel jPanelReporteDinamicoTipoVenta;
	//protected JPanel jPanelImportacionTipoVenta;
	
	
	public JTable jTableDatosTipoVenta;
	
	
	
	//public JTable jTableDatosTipoVentaOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoTipoVenta;
	protected JButton jButtonDuplicarTipoVenta;
	protected JButton jButtonCopiarTipoVenta;
	protected JButton jButtonVerFormTipoVenta;
	protected JButton jButtonNuevoRelacionesTipoVenta;
	protected JButton jButtonModificarTipoVenta;
	
    protected JButton jButtonGuardarCambiosTablaTipoVenta;
	protected JButton jButtonCerrarTipoVenta;
	
	
	protected JButton jButtonRecargarInformacionTipoVenta;
	protected JButton jButtonProcesarInformacionTipoVenta;
	
	
	protected JButton jButtonAnterioresTipoVenta;
	protected JButton jButtonSiguientesTipoVenta;
	protected JButton jButtonNuevoGuardarCambiosTipoVenta;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoTipoVenta;
	//protected JButton jButtonCerrarReporteDinamicoTipoVenta;
	//protected JButton jButtonGenerarExcelReporteDinamicoTipoVenta;	
	
	
	
	//protected JButton jButtonAbrirImportacionTipoVenta;
	//protected JButton jButtonGenerarImportacionTipoVenta;
	//protected JButton jButtonCerrarImportacionTipoVenta;
	//protected JFileChooser jFileChooserImportacionTipoVenta;
	//protected File fileImportacionTipoVenta;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoVenta;
	protected JButton jButtonDuplicarToolBarTipoVenta;
	protected JButton jButtonNuevoRelacionesToolBarTipoVenta;
	
	
	public JButton jButtonGuardarCambiosToolBarTipoVenta;
	protected JButton jButtonCopiarToolBarTipoVenta;
	protected JButton jButtonVerFormToolBarTipoVenta;
	public JButton jButtonGuardarCambiosTablaToolBarTipoVenta;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoVenta;
	protected JButton jButtonCerrarToolBarTipoVenta;
	
	protected JButton jButtonRecargarInformacionToolBarTipoVenta;
	protected JButton jButtonProcesarInformacionToolBarTipoVenta;
	protected JButton jButtonAnterioresToolBarTipoVenta;
	protected JButton jButtonSiguientesToolBarTipoVenta;
	protected JButton jButtonNuevoGuardarCambiosToolBarTipoVenta;
	protected JButton jButtonAbrirOrderByToolBarTipoVenta;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoVenta;
	protected JMenuItem jMenuItemDuplicarTipoVenta;
	protected JMenuItem jMenuItemNuevoRelacionesTipoVenta;
	
	
	protected JMenuItem jMenuItemGuardarCambiosTipoVenta;
	protected JMenuItem jMenuItemCopiarTipoVenta;
	protected JMenuItem jMenuItemVerFormTipoVenta;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoVenta;
	protected JMenuItem jMenuItemCerrarTipoVenta;
	protected JMenuItem jMenuItemDetalleCerrarTipoVenta;
	protected JMenuItem jMenuItemDetalleAbrirOrderByTipoVenta;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoVenta;
	
	protected JMenuItem jMenuItemRecargarInformacionTipoVenta;
	protected JMenuItem jMenuItemProcesarInformacionTipoVenta;
	protected JMenuItem jMenuItemAnterioresTipoVenta;
	protected JMenuItem jMenuItemSiguientesTipoVenta;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoVenta;
	protected JMenuItem jMenuItemAbrirOrderByTipoVenta;
	protected JMenuItem jMenuItemMostrarOcultarTipoVenta;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoVenta;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosTipoVenta;
	protected JCheckBox jCheckBoxSeleccionadosTipoVenta;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaTipoVenta;
	protected JCheckBox jCheckBoxConGraficoReporteTipoVenta;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesTipoVenta;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesTipoVenta;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoTipoVenta;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoTipoVenta;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesTipoVenta;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionTipoVenta;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoVenta;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoVenta;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarTipoVenta;
	protected JTextField jTextFieldValorCampoGeneralTipoVenta;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteTipoVenta;
	//public JList<Reporte> jListColumnasSelectReporteTipoVenta;
	//public JScrollPane jScrollColumnasSelectReporteTipoVenta;
	
	//public JLabel jLabelRelacionesSelectReporteTipoVenta;
	//public JList<Reporte> jListRelacionesSelectReporteTipoVenta;
	//public JScrollPane jScrollRelacionesSelectReporteTipoVenta;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoTipoVenta;
	//protected JCheckBox jCheckBoxConGraficoDinamicoTipoVenta;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoTipoVenta;
	//public JLabel jLabelTiposArchivoReporteDinamicoTipoVenta;
	
		
	//public JLabel jLabelArchivoImportacionTipoVenta;	
	//public JLabel jLabelPathArchivoImportacionTipoVenta;
	//protected JTextField jTextFieldPathArchivoImportacionTipoVenta;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoTipoVenta;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoTipoVenta;
	
	//public JLabel jLabelColumnaCategoriaValorTipoVenta;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorTipoVenta;
	
	//public JLabel jLabelColumnasValoresGraficoTipoVenta;
	//public JList<Reporte> jListColumnasValoresGraficoTipoVenta;
	//public JScrollPane jScrollColumnasValoresGraficoTipoVenta;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoTipoVenta;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoTipoVenta;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasTipoVenta;
	
	
	
	
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
	public TipoVentaJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("TipoVenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoVentaJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoVenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoVentaJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoVenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoVentaJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoVenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionTipoVenta)	{
		this.jButtonRecargarInformacionTipoVenta = jButtonRecargarInformacionTipoVenta;
	}
	
	public JButton getjButtonProcesarInformacionTipoVenta() {
		return this.jButtonProcesarInformacionTipoVenta;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoVenta)	{
		this.jButtonProcesarInformacionTipoVenta = jButtonProcesarInformacionTipoVenta;
	}
	
	
	public JButton getjButtonRecargarInformacionTipoVenta() {
		return this.jButtonRecargarInformacionTipoVenta;
	}
	
	
	public List<TipoVenta> gettipoventas() {
		return this.tipoventas;
	}

	public void settipoventas(List<TipoVenta> tipoventas) {
		this.tipoventas = tipoventas;
	}
	
	public List<TipoVenta> gettipoventasAux() {
		return this.tipoventasAux;
	}

	public void settipoventasAux(List<TipoVenta> tipoventasAux) {
		this.tipoventasAux = tipoventasAux;
	}
	
	public List<TipoVenta> gettipoventasEliminados() {
		return this.tipoventasEliminados;
	}

	public void setTipoVentasEliminados(List<TipoVenta> tipoventasEliminados) {
		this.tipoventasEliminados = tipoventasEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarTipoVenta() {
		return jComboBoxTiposSeleccionarTipoVenta;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarTipoVenta(
			JComboBox jComboBoxTiposSeleccionarTipoVenta) {
		this.jComboBoxTiposSeleccionarTipoVenta = jComboBoxTiposSeleccionarTipoVenta;
	}
	
	public void setBorderResaltarTiposSeleccionarTipoVenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarTipoVenta.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarTipoVenta .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralTipoVenta() {
		return jTextFieldValorCampoGeneralTipoVenta;
	}

	public void setjTextFieldValorCampoGeneralTipoVenta(
			JTextField jTextFieldValorCampoGeneralTipoVenta) {
		this.jTextFieldValorCampoGeneralTipoVenta = jTextFieldValorCampoGeneralTipoVenta;
	}

	public void setBorderResaltarValorCampoGeneralTipoVenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoVenta.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralTipoVenta .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosTipoVenta() {
		return this.jCheckBoxSeleccionarTodosTipoVenta;
	}

	public void setjCheckBoxSeleccionarTodosTipoVenta(
			JCheckBox jCheckBoxSeleccionarTodosTipoVenta) {
		this.jCheckBoxSeleccionarTodosTipoVenta = jCheckBoxSeleccionarTodosTipoVenta;
	}

	public void setBorderResaltarSeleccionarTodosTipoVenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoVenta.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosTipoVenta .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosTipoVenta() {
		return this.jCheckBoxSeleccionadosTipoVenta;
	}

	public void setjCheckBoxSeleccionadosTipoVenta(
			JCheckBox jCheckBoxSeleccionadosTipoVenta) {
		this.jCheckBoxSeleccionadosTipoVenta = jCheckBoxSeleccionadosTipoVenta;
	}
	
	public void setBorderResaltarSeleccionadosTipoVenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoVenta.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosTipoVenta .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesTipoVenta() {
		return this.jComboBoxTiposArchivosReportesTipoVenta;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesTipoVenta(
			JComboBox jComboBoxTiposArchivosReportesTipoVenta) {
		this.jComboBoxTiposArchivosReportesTipoVenta = jComboBoxTiposArchivosReportesTipoVenta;
	}

	public void setBorderResaltarTiposArchivosReportesTipoVenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoVenta.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesTipoVenta .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesTipoVenta() {
		return this.jComboBoxTiposReportesTipoVenta;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesTipoVenta(
			JComboBox jComboBoxTiposReportesTipoVenta) {
		this.jComboBoxTiposReportesTipoVenta = jComboBoxTiposReportesTipoVenta;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoTipoVenta() {
	//	return jComboBoxTiposReportesDinamicoTipoVenta;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoTipoVenta(
	//		JComboBox jComboBoxTiposReportesDinamicoTipoVenta) {
	//	this.jComboBoxTiposReportesDinamicoTipoVenta = jComboBoxTiposReportesDinamicoTipoVenta;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoTipoVenta() {
	//	return jComboBoxTiposArchivosReportesDinamicoTipoVenta;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoTipoVenta(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoTipoVenta) {
	//	this.jComboBoxTiposArchivosReportesDinamicoTipoVenta = jComboBoxTiposArchivosReportesDinamicoTipoVenta;
	//}
	
	public void setBorderResaltarTiposReportesTipoVenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoVenta.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesTipoVenta .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesTipoVenta() {
		return this.jComboBoxTiposGraficosReportesTipoVenta;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesTipoVenta(
			JComboBox jComboBoxTiposGraficosReportesTipoVenta) {
		this.jComboBoxTiposGraficosReportesTipoVenta = jComboBoxTiposGraficosReportesTipoVenta;
	}
	
	public void setBorderResaltarTiposGraficosReportesTipoVenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoVenta.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesTipoVenta .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionTipoVenta() {
		return this.jComboBoxTiposPaginacionTipoVenta;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionTipoVenta(
			JComboBox jComboBoxTiposPaginacionTipoVenta) {
		this.jComboBoxTiposPaginacionTipoVenta = jComboBoxTiposPaginacionTipoVenta;
	}
	
	public void setBorderResaltarTiposPaginacionTipoVenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoVenta.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionTipoVenta .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesTipoVenta() {
		return this.jComboBoxTiposRelacionesTipoVenta;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoVenta() {
		return this.jComboBoxTiposAccionesTipoVenta;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoVenta(
			JComboBox jComboBoxTiposRelacionesTipoVenta) {
		this.jComboBoxTiposRelacionesTipoVenta = jComboBoxTiposRelacionesTipoVenta;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoVenta(
			JComboBox jComboBoxTiposAccionesTipoVenta) {
		this.jComboBoxTiposAccionesTipoVenta = jComboBoxTiposAccionesTipoVenta;
	}
	
	public void setBorderResaltarTiposRelacionesTipoVenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoVenta.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesTipoVenta .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesTipoVenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoVenta.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesTipoVenta .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoTipoVenta() {
	//	return jCheckBoxConGraficoDinamicoTipoVenta;
	//}

	//public void setjCheckBoxConGraficoDinamicoTipoVenta(
	//		JCheckBox jCheckBoxConGraficoDinamicoTipoVenta) {
	//	this.jCheckBoxConGraficoDinamicoTipoVenta = jCheckBoxConGraficoDinamicoTipoVenta;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoTipoVenta() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarTipoVenta.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoTipoVenta .setBorder(borderResaltar);		
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
		this.tipoventaSessionBean=new TipoVentaSessionBean();
		
		this.tipoventaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipoventaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipoventaSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=TipoVentaJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=TipoVentaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoVentaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoVentaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoVentaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Venta MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.tipoventaSessionBean.getEsGuardarRelacionado()) {
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
		
		TipoVentaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("TipoVenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarTipoVenta= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarTipoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarTipoVenta,this.jTtoolBarTipoVenta,
							"nuevo","nuevo","Nuevo"+" "+TipoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarTipoVenta,this.jTtoolBarTipoVenta,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarTipoVenta,this.jTtoolBarTipoVenta,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+TipoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarTipoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarTipoVenta,this.jTtoolBarTipoVenta,
							"duplicar","duplicar","Duplicar"+" "+TipoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarTipoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarTipoVenta,this.jTtoolBarTipoVenta,
							"copiar","copiar","Copiar"+" "+TipoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarTipoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarTipoVenta,this.jTtoolBarTipoVenta,
							"ver_form","ver_form","Ver"+" "+TipoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarTipoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoVenta,this.jTtoolBarTipoVenta,
							"recargar","recargar","Recargar"+" "+TipoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarTipoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoVenta,this.jTtoolBarTipoVenta,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarTipoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoVenta,this.jTtoolBarTipoVenta,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarTipoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarTipoVenta,this.jTtoolBarTipoVenta,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarTipoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarTipoVenta,this.jTtoolBarTipoVenta,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarTipoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarTipoVenta,this.jTtoolBarTipoVenta,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+TipoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarTipoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarTipoVenta,this.jTtoolBarTipoVenta,
							"cerrar","cerrar","Salir"+" "+TipoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarTipoVenta=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarTipoVenta;
			
				this.jButtonProcesarInformacionToolBarTipoVenta=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarTipoVenta;
				
		//protected JButton jButtonModificarToolBarTipoVenta;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarTipoVenta=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuTipoVenta=new JMenuMe("General");
		this.jmenuArchivoTipoVenta=new JMenuMe("Archivo");
		this.jmenuAccionesTipoVenta=new JMenuMe("Acciones");
		this.jmenuDatosTipoVenta=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoVenta= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoVenta.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoVenta,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarTipoVenta= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarTipoVenta.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarTipoVenta,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarTipoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesTipoVenta= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesTipoVenta.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesTipoVenta,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesTipoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosTipoVenta= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoVenta.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoVenta,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarTipoVenta= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarTipoVenta.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarTipoVenta,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarTipoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormTipoVenta= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormTipoVenta.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormTipoVenta,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormTipoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaTipoVenta= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaTipoVenta.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaTipoVenta,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaTipoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoVenta= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoVenta.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoVenta,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionTipoVenta= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionTipoVenta.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionTipoVenta,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionTipoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionTipoVenta= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionTipoVenta.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionTipoVenta,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresTipoVenta= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresTipoVenta.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresTipoVenta,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresTipoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesTipoVenta= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesTipoVenta.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesTipoVenta,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesTipoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByTipoVenta= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByTipoVenta.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByTipoVenta,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByTipoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoVenta= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoVenta.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoVenta,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByTipoVenta= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByTipoVenta.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByTipoVenta,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByTipoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoVenta= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoVenta.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoVenta,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosTipoVenta= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosTipoVenta.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosTipoVenta,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosTipoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoTipoVenta.add(this.jMenuItemCerrarTipoVenta);
			
			this.jmenuAccionesTipoVenta.add(this.jMenuItemNuevoTipoVenta);
			this.jmenuAccionesTipoVenta.add(this.jMenuItemNuevoGuardarCambiosTipoVenta);
			this.jmenuAccionesTipoVenta.add(this.jMenuItemNuevoRelacionesTipoVenta);
			this.jmenuAccionesTipoVenta.add(this.jMenuItemGuardarCambiosTablaTipoVenta);		
			this.jmenuAccionesTipoVenta.add(this.jMenuItemDuplicarTipoVenta);		
			this.jmenuAccionesTipoVenta.add(this.jMenuItemCopiarTipoVenta);		
			this.jmenuAccionesTipoVenta.add(this.jMenuItemVerFormTipoVenta);		
			
			this.jmenuDatosTipoVenta.add(this.jMenuItemRecargarInformacionTipoVenta);				
			this.jmenuDatosTipoVenta.add(this.jMenuItemAnterioresTipoVenta);				
			this.jmenuDatosTipoVenta.add(this.jMenuItemSiguientesTipoVenta);				
			this.jmenuDatosTipoVenta.add(this.jMenuItemAbrirOrderByTipoVenta);				
			this.jmenuDatosTipoVenta.add(this.jMenuItemMostrarOcultarTipoVenta);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesTipoVenta.add(this.jMenuItemGuardarCambiosTipoVenta);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoTipoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesTipoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosTipoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarTipoVenta.add(this.jmenuArchivoTipoVenta);		
			this.jmenuBarTipoVenta.add(this.jmenuAccionesTipoVenta);		
			this.jmenuBarTipoVenta.add(this.jmenuDatosTipoVenta);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarTipoVenta);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasTipoVenta() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		

		this.jTabbedPaneBusquedasTipoVenta=new JTabbedPane();


		this.jTabbedPaneBusquedasTipoVenta.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoVenta.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoVenta.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasTipoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasTipoVenta.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasTipoVenta,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleTipoVenta = new TipoVentaDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Tipo Venta DATOS");
			this.jInternalFrameDetalleFormTipoVenta = new TipoVentaDetalleFormJInternalFrame(jDesktopPane,this.tipoventaSessionBean.getConGuardarRelaciones(),this.tipoventaSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormTipoVenta = null;//new TipoVentaDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoVenta= new GridBagLayout();
		
		
		this.jTableDatosTipoVenta = new JTableMe();      
		
		String sToolTipTipoVenta="";
		sToolTipTipoVenta=TipoVentaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoVenta+="(Cartera.TipoVenta)";
		}
		
		if(!this.tipoventaSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoVenta+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosTipoVenta.setToolTipText(sToolTipTipoVenta);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosTipoVenta);
		this.jTableDatosTipoVenta.setAutoCreateRowSorter(true);
		this.jTableDatosTipoVenta.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosTipoVenta.setRowSelectionAllowed(true);
		this.jTableDatosTipoVenta.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosTipoVenta,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoTipoVenta = new JButtonMe();
		this.jButtonDuplicarTipoVenta = new JButtonMe();
		this.jButtonCopiarTipoVenta = new JButtonMe();
		this.jButtonVerFormTipoVenta = new JButtonMe();
		this.jButtonNuevoRelacionesTipoVenta = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaTipoVenta = new JButtonMe();
		this.jButtonCerrarTipoVenta = new JButtonMe();
		
		this.jScrollPanelDatosTipoVenta = new JScrollPane();   
        this.jScrollPanelDatosGeneralTipoVenta = new JScrollPane();
		
				
		
		
		this.jPanelAccionesTipoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Venta";
		
		if(!this.tipoventaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Ventas" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoVenta.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralTipoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesTipoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoVenta.setToolTipText("Acciones");
        this.jPanelAccionesTipoVenta.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoVenta, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoVenta, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoTipoVenta=new ReporteDinamicoJInternalFrame(TipoVentaConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoTipoVenta();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionTipoVenta=new ImportacionJInternalFrame(TipoVentaConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionTipoVenta();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByTipoVenta = new JButtonMe();
		
		this.jButtonAbrirOrderByTipoVenta.setText("Orden");
		this.jButtonAbrirOrderByTipoVenta.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoVenta,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByTipoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByTipoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoVenta=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoVenta,false,this);
			
			//this.cargarOrderByTipoVenta(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoVenta=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoVenta,true,this);
			
			//this.cargarOrderByTipoVenta(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosTipoVenta.setMinimumSize(new Dimension(400,50));//430
		this.jTableDatosTipoVenta.setMaximumSize(new Dimension(400,50));//430
		this.jTableDatosTipoVenta.setPreferredSize(new Dimension(400,50));//430
		
		this.jScrollPanelDatosTipoVenta.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoVenta.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoVenta.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoTipoVenta.setText("Nuevo");
		this.jButtonDuplicarTipoVenta.setText("Duplicar");
		this.jButtonCopiarTipoVenta.setText("Copiar");
		this.jButtonVerFormTipoVenta.setText("Ver");
		this.jButtonNuevoRelacionesTipoVenta.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaTipoVenta.setText("Guardar");
		this.jButtonCerrarTipoVenta.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoVenta,"nuevo_button","Nuevo",this.tipoventaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarTipoVenta,"duplicar_button","Duplicar",this.tipoventaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarTipoVenta,"copiar_button","Copiar",this.tipoventaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormTipoVenta,"ver_form","Ver",this.tipoventaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesTipoVenta,"nuevorelaciones_button","Nuevo Rel",this.tipoventaSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoVenta,"guardarcambiostabla_button","Guardar",this.tipoventaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoVenta,"cerrar_button","Salir",this.tipoventaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarTipoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarTipoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormTipoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesTipoVenta, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoTipoVenta.setToolTipText("Nuevo"+" "+TipoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarTipoVenta.setToolTipText("Duplicar"+" "+TipoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarTipoVenta.setToolTipText("Copiar"+" "+TipoVentaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormTipoVenta.setToolTipText("Ver"+" "+TipoVentaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesTipoVenta.setToolTipText("Nuevo Rel"+" "+TipoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaTipoVenta.setToolTipText("Guardar"+" "+TipoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoVenta.setToolTipText("Salir"+" "+TipoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoVenta";
		inputMap = this.jButtonNuevoTipoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoVenta.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoVenta"));
		
		//DUPLICAR
		sMapKey = "DuplicarTipoVenta";
		inputMap = this.jButtonDuplicarTipoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarTipoVenta.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarTipoVenta"));
		
		//COPIAR
		sMapKey = "CopiarTipoVenta";
		inputMap = this.jButtonCopiarTipoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarTipoVenta.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarTipoVenta"));
		
		//VEr FORM
		sMapKey = "VerFormTipoVenta";
		inputMap = this.jButtonVerFormTipoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormTipoVenta.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormTipoVenta"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesTipoVenta";
		inputMap = this.jButtonNuevoRelacionesTipoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesTipoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesTipoVenta"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarTipoVenta";
		inputMap = this.jButtonModificarTipoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarTipoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarTipoVenta"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarTipoVenta";
		inputMap = this.jButtonCerrarTipoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoVenta"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoVenta";
		inputMap = this.jButtonGuardarCambiosTablaTipoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoVenta"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesTipoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesTipoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionTipoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1TipoVenta= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2TipoVenta= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3TipoVenta= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4TipoVenta= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5TipoVenta= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesTipoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesTipoVenta.setName("jPanelParametrosReportesTipoVenta"); 
		
		this.jPanelParametrosReportesAccionesTipoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesTipoVenta.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesTipoVenta.setName("jPanelParametrosReportesAccionesTipoVenta"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesTipoVenta, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesTipoVenta, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionTipoVenta = new JButtonMe();
		this.jButtonRecargarInformacionTipoVenta.setText("Recargar");
		this.jButtonRecargarInformacionTipoVenta.setToolTipText("Recargar"+" "+TipoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionTipoVenta,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionTipoVenta = new JButtonMe();
		this.jButtonProcesarInformacionTipoVenta.setText("Procesar");
		this.jButtonProcesarInformacionTipoVenta.setToolTipText("Procesar"+" "+TipoVentaConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionTipoVenta.setVisible(false);
			
		this.jButtonProcesarInformacionTipoVenta.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoVenta.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoVenta.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesTipoVenta = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoVenta.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesTipoVenta.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesTipoVenta = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoVenta.setText("TIPO");       
		this.jComboBoxTiposReportesTipoVenta.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesTipoVenta = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoVenta.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesTipoVenta.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionTipoVenta = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionTipoVenta.setText("Paginacion");
		this.jComboBoxTiposPaginacionTipoVenta.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesTipoVenta = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesTipoVenta.setText("Accion");
		this.jComboBoxTiposRelacionesTipoVenta.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesTipoVenta = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoVenta.setText("Accion");
		this.jComboBoxTiposAccionesTipoVenta.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarTipoVenta = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarTipoVenta.setText("Accion");
		this.jComboBoxTiposSeleccionarTipoVenta.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralTipoVenta=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralTipoVenta.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoVenta.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoVenta.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesTipoVenta = new JLabelMe();
		
		this.jLabelAccionesTipoVenta.setText("Acciones");		
		this.jLabelAccionesTipoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosTipoVenta = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosTipoVenta.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosTipoVenta.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosTipoVenta = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosTipoVenta.setText("Seleccionados");
		this.jCheckBoxSeleccionadosTipoVenta.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaTipoVenta = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaTipoVenta.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaTipoVenta.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteTipoVenta = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteTipoVenta.setText("Graf.");
		this.jCheckBoxConGraficoReporteTipoVenta.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresTipoVenta = new JButtonMe();
		//this.jButtonAnterioresTipoVenta.setText("<<");
        this.jButtonAnterioresTipoVenta.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresTipoVenta,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresTipoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesTipoVenta = new JButtonMe();
		//this.jButtonSiguientesTipoVenta.setText(">>");
        this.jButtonSiguientesTipoVenta.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesTipoVenta,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesTipoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosTipoVenta = new JButtonMe();
		this.jButtonNuevoGuardarCambiosTipoVenta.setText("Nue");
        this.jButtonNuevoGuardarCambiosTipoVenta.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosTipoVenta,"nuevoguardarcambios_button","Nue",this.tipoventaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosTipoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosTipoVenta";
		inputMap = this.jButtonNuevoGuardarCambiosTipoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosTipoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosTipoVenta"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionTipoVenta";
		inputMap = this.jButtonRecargarInformacionTipoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionTipoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionTipoVenta"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesTipoVenta";
		inputMap = this.jButtonSiguientesTipoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesTipoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesTipoVenta"));
		
		//ANTERIORES		
		sMapKey = "AnterioresTipoVenta";
		inputMap = this.jButtonAnterioresTipoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresTipoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresTipoVenta"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasTipoVenta();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesTipoVenta.setMinimumSize(new Dimension(this.getWidth(),TipoVentaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoVentaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoVenta.setMaximumSize(new Dimension(this.getWidth(),TipoVentaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoVentaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoVenta.setPreferredSize(new Dimension(this.getWidth(),TipoVentaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoVentaBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionTipoVenta = new GridBagLayout();

			this.jPanelPaginacionTipoVenta.setLayout(gridaBagLayoutPaginacionTipoVenta);						
			
			this.gridBagConstraintsTipoVenta = new GridBagConstraints();
			this.gridBagConstraintsTipoVenta.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsTipoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoVenta.gridy = 0;
			this.gridBagConstraintsTipoVenta.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionTipoVenta.add(this.jButtonAnterioresTipoVenta, this.gridBagConstraintsTipoVenta);
					
						
			this.gridBagConstraintsTipoVenta = new GridBagConstraints();
			this.gridBagConstraintsTipoVenta.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoVenta.gridy = 0;
			
			this.jPanelPaginacionTipoVenta.add(this.jButtonNuevoGuardarCambiosTipoVenta, this.gridBagConstraintsTipoVenta);
						
			
			this.gridBagConstraintsTipoVenta = new GridBagConstraints();
			this.gridBagConstraintsTipoVenta.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsTipoVenta.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoVenta.gridy = 0;
			this.jPanelPaginacionTipoVenta.add(this.jButtonSiguientesTipoVenta, this.gridBagConstraintsTipoVenta);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsTipoVenta = new GridBagConstraints();
			this.gridBagConstraintsTipoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoVenta.gridy = 1;
			this.gridBagConstraintsTipoVenta.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoVenta.add(this.jButtonNuevoTipoVenta, this.gridBagConstraintsTipoVenta);
						
			
			
			if(!this.tipoventaSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsTipoVenta = new GridBagConstraints();
				this.gridBagConstraintsTipoVenta.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoVenta.gridy = 1;
				this.gridBagConstraintsTipoVenta.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionTipoVenta.add(this.jButtonGuardarCambiosTablaTipoVenta, this.gridBagConstraintsTipoVenta);
			}
			
			
			
			this.gridBagConstraintsTipoVenta = new GridBagConstraints();
			this.gridBagConstraintsTipoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoVenta.gridy = 1;
			this.gridBagConstraintsTipoVenta.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoVenta.add(this.jButtonDuplicarTipoVenta, this.gridBagConstraintsTipoVenta);
			
			this.gridBagConstraintsTipoVenta = new GridBagConstraints();
			this.gridBagConstraintsTipoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoVenta.gridy = 1;
			this.gridBagConstraintsTipoVenta.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoVenta.add(this.jButtonCopiarTipoVenta, this.gridBagConstraintsTipoVenta);
		
			this.gridBagConstraintsTipoVenta = new GridBagConstraints();
			this.gridBagConstraintsTipoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoVenta.gridy = 1;
			this.gridBagConstraintsTipoVenta.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoVenta.add(this.jButtonVerFormTipoVenta, this.gridBagConstraintsTipoVenta);
		
			this.gridBagConstraintsTipoVenta = new GridBagConstraints();
			this.gridBagConstraintsTipoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoVenta.gridy = 1;
			this.gridBagConstraintsTipoVenta.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionTipoVenta.add(this.jButtonCerrarTipoVenta, this.gridBagConstraintsTipoVenta);
		
		
		
		this.jButtonRecargarInformacionTipoVenta.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoVenta.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoVenta.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionTipoVenta, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesTipoVenta.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoVenta.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoVenta.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesTipoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesTipoVenta.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoVenta.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoVenta.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesTipoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesTipoVenta.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoVenta.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoVenta.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesTipoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionTipoVenta.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoVenta.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoVenta.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionTipoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesTipoVenta.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoVenta.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoVenta.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesTipoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesTipoVenta.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoVenta.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoVenta.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarTipoVenta.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoVenta.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoVenta.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarTipoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaTipoVenta.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoVenta.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoVenta.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaTipoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteTipoVenta.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoVenta.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoVenta.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteTipoVenta, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosTipoVenta.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoVenta.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoVenta.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosTipoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosTipoVenta.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoVenta.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoVenta.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosTipoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesTipoVenta = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesTipoVenta = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1TipoVenta = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2TipoVenta = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3TipoVenta = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4TipoVenta = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesTipoVenta.setLayout(gridaBagParametrosReportesTipoVenta);
			this.jPanelParametrosReportesAccionesTipoVenta.setLayout(gridaBagParametrosReportesAccionesTipoVenta);
			
			
			this.jPanelParametrosAuxiliar1TipoVenta.setLayout(gridaBagParametrosAuxiliar1TipoVenta);
			this.jPanelParametrosAuxiliar2TipoVenta.setLayout(gridaBagParametrosAuxiliar2TipoVenta);
			this.jPanelParametrosAuxiliar3TipoVenta.setLayout(gridaBagParametrosAuxiliar3TipoVenta);
			this.jPanelParametrosAuxiliar4TipoVenta.setLayout(gridaBagParametrosAuxiliar4TipoVenta);
			//this.jPanelParametrosAuxiliar5TipoVenta.setLayout(gridaBagParametrosAuxiliar2TipoVenta);			
			
			
			
			
			this.gridBagConstraintsTipoVenta = new GridBagConstraints();
			this.gridBagConstraintsTipoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoVenta.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoVenta.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoVenta.add(this.jButtonRecargarInformacionTipoVenta, this.gridBagConstraintsTipoVenta);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsTipoVenta = new GridBagConstraints();
			this.gridBagConstraintsTipoVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoVenta.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoVenta.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoVenta.add(this.jComboBoxTiposPaginacionTipoVenta, this.gridBagConstraintsTipoVenta);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsTipoVenta = new GridBagConstraints();
			this.gridBagConstraintsTipoVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoVenta.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoVenta.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoVenta.add(this.jCheckBoxConAltoMaximoTablaTipoVenta, this.gridBagConstraintsTipoVenta);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsTipoVenta = new GridBagConstraints();
			this.gridBagConstraintsTipoVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoVenta.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoVenta.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoVenta.add(this.jComboBoxTiposArchivosReportesTipoVenta, this.gridBagConstraintsTipoVenta);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsTipoVenta = new GridBagConstraints();
			this.gridBagConstraintsTipoVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoVenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoVenta.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoVenta.add(this.jPanelParametrosAuxiliar1TipoVenta, this.gridBagConstraintsTipoVenta);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsTipoVenta = new GridBagConstraints();
			this.gridBagConstraintsTipoVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoVenta.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoVenta.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4TipoVenta.add(this.jComboBoxTiposReportesTipoVenta, this.gridBagConstraintsTipoVenta);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsTipoVenta = new GridBagConstraints();
			this.gridBagConstraintsTipoVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoVenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoVenta.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoVenta.add(this.jPanelParametrosAuxiliar4TipoVenta, this.gridBagConstraintsTipoVenta);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsTipoVenta = new GridBagConstraints();
			this.gridBagConstraintsTipoVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoVenta.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoVenta.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoVenta.add(this.jComboBoxTiposReportesTipoVenta, this.gridBagConstraintsTipoVenta);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsTipoVenta = new GridBagConstraints();
			this.gridBagConstraintsTipoVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoVenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoVenta.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoVenta.add(this.jCheckBoxGenerarReporteTipoVenta, this.gridBagConstraintsTipoVenta);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsTipoVenta = new GridBagConstraints();
			this.gridBagConstraintsTipoVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoVenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoVenta.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoVenta.add(this.jPanelParametrosAuxiliar2TipoVenta, this.gridBagConstraintsTipoVenta);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsTipoVenta = new GridBagConstraints();
			this.gridBagConstraintsTipoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoVenta.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoVenta.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoVenta.add(this.jLabelAccionesTipoVenta, this.gridBagConstraintsTipoVenta);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsTipoVenta = new GridBagConstraints();
				this.gridBagConstraintsTipoVenta.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsTipoVenta.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsTipoVenta.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesTipoVenta.add(this.jButtonAbrirOrderByTipoVenta, this.gridBagConstraintsTipoVenta);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsTipoVenta = new GridBagConstraints();
			this.gridBagConstraintsTipoVenta.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsTipoVenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoVenta.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoVenta.add(this.jComboBoxTiposSeleccionarTipoVenta, this.gridBagConstraintsTipoVenta);			
			
			
			/*
			this.gridBagConstraintsTipoVenta = new GridBagConstraints();
			this.gridBagConstraintsTipoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoVenta.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoVenta.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoVenta.add(this.jCheckBoxSeleccionarTodosTipoVenta, this.gridBagConstraintsTipoVenta);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsTipoVenta = new GridBagConstraints();
			this.gridBagConstraintsTipoVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoVenta.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoVenta.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoVenta.add(this.jCheckBoxSeleccionarTodosTipoVenta, this.gridBagConstraintsTipoVenta);															
				
			this.gridBagConstraintsTipoVenta = new GridBagConstraints();
			this.gridBagConstraintsTipoVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoVenta.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoVenta.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoVenta.add(this.jCheckBoxSeleccionadosTipoVenta, this.gridBagConstraintsTipoVenta);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsTipoVenta = new GridBagConstraints();
			this.gridBagConstraintsTipoVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoVenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoVenta.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoVenta.add(this.jPanelParametrosAuxiliar3TipoVenta, this.gridBagConstraintsTipoVenta);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsTipoVenta = new GridBagConstraints();
			this.gridBagConstraintsTipoVenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoVenta.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoVenta.add(this.jComboBoxTiposAccionesTipoVenta, this.gridBagConstraintsTipoVenta);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosTipoVenta = new GridBagLayout();

			this.jScrollPanelDatosTipoVenta.setLayout(gridaBagLayoutDatosTipoVenta);
			
			this.gridBagConstraintsTipoVenta = new GridBagConstraints();
			this.gridBagConstraintsTipoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoVenta.gridy = 0;
			this.gridBagConstraintsTipoVenta.gridx = 0;
			
			this.jScrollPanelDatosTipoVenta.add(this.jTableDatosTipoVenta, this.gridBagConstraintsTipoVenta);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosTipoVenta.setViewportView(this.jTableDatosTipoVenta);
		this.jTableDatosTipoVenta.setFillsViewportHeight(true);
		this.jTableDatosTipoVenta.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesTipoVenta= new GridBagLayout();
		this.jPanelAccionesTipoVenta.setLayout(gridaBagLayoutAccionesTipoVenta);
		
		
		/*	
		this.gridBagConstraintsTipoVenta = new GridBagConstraints();
		this.gridBagConstraintsTipoVenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoVenta.gridy = 0;
		this.gridBagConstraintsTipoVenta.gridx = 0;
			
		this.jPanelAccionesTipoVenta.add(this.jButtonNuevoTipoVenta, this.gridBagConstraintsTipoVenta);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoVenta = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoVenta);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipoventaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoVenta = new GridBagConstraints();						
			this.gridBagConstraintsTipoVenta.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoVenta.gridx = 0;		
			//this.gridBagConstraintsTipoVenta.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoVenta.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoVenta.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarTipoVenta, this.gridBagConstraintsTipoVenta);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsTipoVenta = new GridBagConstraints();
		this.gridBagConstraintsTipoVenta.gridy = iGridyPrincipal++;
		this.gridBagConstraintsTipoVenta.gridx = 0;		
		//this.gridBagConstraintsTipoVenta.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoVenta.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsTipoVenta.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsTipoVenta);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsTipoVenta = new GridBagConstraints();
		this.gridBagConstraintsTipoVenta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoVenta.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesTipoVenta, this.gridBagConstraintsTipoVenta);								
		
		
		/*
		this.gridBagConstraintsTipoVenta = new GridBagConstraints();
		this.gridBagConstraintsTipoVenta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoVenta.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesTipoVenta, this.gridBagConstraintsTipoVenta);
		*/		
		
		this.gridBagConstraintsTipoVenta = new GridBagConstraints();
		this.gridBagConstraintsTipoVenta.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoVenta.gridx =0;
		this.gridBagConstraintsTipoVenta.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoVenta.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoVenta, this.gridBagConstraintsTipoVenta);
				
		
		this.gridBagConstraintsTipoVenta = new GridBagConstraints();
		this.gridBagConstraintsTipoVenta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoVenta.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionTipoVenta, this.gridBagConstraintsTipoVenta);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(TipoVentaJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosTipoVenta= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoVenta = new GridBagLayout();
			this.jPanelBusquedasParametrosTipoVenta.setLayout(gridaBagLayoutBusquedasParametrosTipoVenta);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralTipoVenta=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoVenta.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoVenta.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoVenta.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoVenta = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsTipoVenta = new GridBagConstraints();
		this.gridBagConstraintsTipoVenta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoVenta.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoVenta, this.gridBagConstraintsTipoVenta);
			
			
		this.gridBagConstraintsTipoVenta = new GridBagConstraints();
		this.gridBagConstraintsTipoVenta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoVenta.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoVenta, this.gridBagConstraintsTipoVenta);
		
			
		this.gridBagConstraintsTipoVenta = new GridBagConstraints();
		this.gridBagConstraintsTipoVenta.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoVenta.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoVenta, this.gridBagConstraintsTipoVenta);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralTipoVenta;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoTipoVenta() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoTipoVenta = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoTipoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoTipoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoTipoVenta.setName("jPanelReporteDinamicoTipoVenta"); 
		
		this.jPanelReporteDinamicoTipoVenta.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoVenta.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoVenta.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoTipoVenta.setLayout(gridaBagLayoutReporteDinamicoTipoVenta);
		
		
		this.jInternalFrameReporteDinamicoTipoVenta= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoTipoVenta = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoVenta= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoTipoVenta.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoTipoVenta.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoTipoVenta.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoTipoVenta.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoTipoVenta.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoTipoVenta.setResizable(true);
	    this.jInternalFrameReporteDinamicoTipoVenta.setClosable(true);
	    this.jInternalFrameReporteDinamicoTipoVenta.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoTipoVenta.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoVenta.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoVenta.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoTipoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Ventas"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteTipoVenta = new JLabelMe();

		this.jLabelColumnasSelectReporteTipoVenta.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteTipoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoVenta = new GridBagConstraints();
		this.gridBagConstraintsTipoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoVenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoVenta.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoVenta.add(this.jLabelColumnasSelectReporteTipoVenta, this.gridBagConstraintsTipoVenta);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteTipoVenta = new JList<Reporte>();
		this.jListColumnasSelectReporteTipoVenta.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteTipoVenta.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteTipoVenta.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoVenta.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoVenta.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteTipoVenta=new JScrollPane(this.jListColumnasSelectReporteTipoVenta);
			
			this.jScrollColumnasSelectReporteTipoVenta.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoVenta.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoVenta.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteTipoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTipoVenta = new GridBagConstraints();
		this.gridBagConstraintsTipoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoVenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoVenta.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoVenta.add(this.jListColumnasSelectReporteTipoVenta, this.gridBagConstraintsTipoVenta);
		this.jPanelReporteDinamicoTipoVenta.add(this.jScrollColumnasSelectReporteTipoVenta, this.gridBagConstraintsTipoVenta);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteTipoVenta = new JLabelMe();

		this.jLabelRelacionesSelectReporteTipoVenta.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteTipoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteTipoVenta = new JList<Reporte>();
		this.jListRelacionesSelectReporteTipoVenta.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteTipoVenta.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteTipoVenta.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoVenta.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoVenta.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteTipoVenta=new JScrollPane(this.jListRelacionesSelectReporteTipoVenta);
			
			this.jScrollRelacionesSelectReporteTipoVenta.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoVenta.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoVenta.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteTipoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoTipoVenta = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoTipoVenta = new JComboBoxMe();
		this.jListColumnasValoresGraficoTipoVenta = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoTipoVenta = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoTipoVenta.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoTipoVenta.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoVenta.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoVenta.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoTipoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoTipoVenta = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoTipoVenta.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoTipoVenta.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoVenta.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoVenta.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoTipoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoTipoVenta = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoTipoVenta.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoTipoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoVenta = new GridBagConstraints();
		this.gridBagConstraintsTipoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoVenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoVenta.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoVenta.add(this.jLabelGenerarExcelReporteDinamicoTipoVenta, this.gridBagConstraintsTipoVenta);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoTipoVenta = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoTipoVenta.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoTipoVenta,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoTipoVenta.setToolTipText("Generar EXCEL"+" "+TipoVentaConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsTipoVenta = new GridBagConstraints();
		//this.gridBagConstraintsTipoVenta.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsTipoVenta.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsTipoVenta.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoTipoVenta.add(this.jButtonGenerarExcelReporteDinamicoTipoVenta, this.gridBagConstraintsTipoVenta);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsTipoVenta = new GridBagConstraints();
		this.gridBagConstraintsTipoVenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoVenta.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoVenta.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoVenta.add(this.jComboBoxTiposReportesDinamicoTipoVenta, this.gridBagConstraintsTipoVenta);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoTipoVenta = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoTipoVenta.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoTipoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoVenta = new GridBagConstraints();
		this.gridBagConstraintsTipoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoVenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoVenta.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoVenta.add(this.jLabelTiposArchivoReporteDinamicoTipoVenta, this.gridBagConstraintsTipoVenta);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsTipoVenta = new GridBagConstraints();
		this.gridBagConstraintsTipoVenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoVenta.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoVenta.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoVenta.add(this.jComboBoxTiposArchivosReportesDinamicoTipoVenta, this.gridBagConstraintsTipoVenta);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoTipoVenta = new JButtonMe();
		this.jButtonGenerarReporteDinamicoTipoVenta.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoTipoVenta,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoTipoVenta.setToolTipText("Generar"+" "+TipoVentaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsTipoVenta = new GridBagConstraints();
		this.gridBagConstraintsTipoVenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoVenta.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoVenta.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoVenta.add(this.jButtonGenerarReporteDinamicoTipoVenta, this.gridBagConstraintsTipoVenta);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoTipoVenta = new JButtonMe();
		this.jButtonCerrarReporteDinamicoTipoVenta.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoTipoVenta,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoTipoVenta.setToolTipText("Cancelar"+" "+TipoVentaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoVenta = new GridBagConstraints();
		this.gridBagConstraintsTipoVenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoVenta.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoVenta.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoVenta.add(this.jButtonCerrarReporteDinamicoTipoVenta, this.gridBagConstraintsTipoVenta);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalTipoVenta = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoTipoVenta= new JScrollPane(jPanelReporteDinamicoTipoVenta,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoTipoVenta.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoVenta.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoVenta.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoTipoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Ventas"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoVenta = new GridBagConstraints();
		this.gridBagConstraintsTipoVenta.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsTipoVenta.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsTipoVenta.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoTipoVenta.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoTipoVenta.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalTipoVenta);
		this.jInternalFrameReporteDinamicoTipoVenta.getContentPane().add(this.jScrollPanelReporteDinamicoTipoVenta, this.gridBagConstraintsTipoVenta);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionTipoVenta() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionTipoVenta = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionTipoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionTipoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionTipoVenta.setName("jPanelImportacionTipoVenta"); 
		
		this.jPanelImportacionTipoVenta.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoVenta.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoVenta.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionTipoVenta.setLayout(gridaBagLayoutImportacionTipoVenta);
		
		
		this.jInternalFrameImportacionTipoVenta= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionTipoVenta= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionTipoVenta = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoVenta= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionTipoVenta.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoVenta.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoVenta.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionTipoVenta.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoVenta.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoVenta.setResizable(true);
	    this.jInternalFrameImportacionTipoVenta.setClosable(true);
	    this.jInternalFrameImportacionTipoVenta.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionTipoVenta.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoVenta.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoVenta.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionTipoVenta.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoVenta.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoVenta.setResizable(true);
	    this.jInternalFrameImportacionTipoVenta.setClosable(true);
	    this.jInternalFrameImportacionTipoVenta.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionTipoVenta.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoVenta.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoVenta.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionTipoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Ventas"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionTipoVenta = new JLabelMe();

		this.jLabelArchivoImportacionTipoVenta.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionTipoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoVenta = new GridBagConstraints();
		this.gridBagConstraintsTipoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoVenta.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoVenta.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoVenta.add(this.jLabelArchivoImportacionTipoVenta, this.gridBagConstraintsTipoVenta);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionTipoVenta = new JFileChooser();		
		this.jFileChooserImportacionTipoVenta.setToolTipText("ESCOGER ARCHIVO"+" "+TipoVentaConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionTipoVenta = new JButtonMe();
		this.jButtonAbrirImportacionTipoVenta.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionTipoVenta,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionTipoVenta.setToolTipText("Generar"+" "+TipoVentaConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsTipoVenta = new GridBagConstraints();
		this.gridBagConstraintsTipoVenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoVenta.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoVenta.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoVenta.add(this.jButtonAbrirImportacionTipoVenta, this.gridBagConstraintsTipoVenta);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionTipoVenta = new JLabelMe();

		this.jLabelPathArchivoImportacionTipoVenta.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionTipoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoVenta = new GridBagConstraints();
		this.gridBagConstraintsTipoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoVenta.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoVenta.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoVenta.add(this.jLabelPathArchivoImportacionTipoVenta, this.gridBagConstraintsTipoVenta);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionTipoVenta=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionTipoVenta.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoVenta.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoVenta.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsTipoVenta = new GridBagConstraints();
		this.gridBagConstraintsTipoVenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoVenta.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoVenta.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoVenta.add(this.jTextFieldPathArchivoImportacionTipoVenta, this.gridBagConstraintsTipoVenta);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionTipoVenta = new JButtonMe();
		this.jButtonGenerarImportacionTipoVenta.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionTipoVenta,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionTipoVenta.setToolTipText("Generar"+" "+TipoVentaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsTipoVenta = new GridBagConstraints();
		this.gridBagConstraintsTipoVenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoVenta.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoVenta.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoVenta.add(this.jButtonGenerarImportacionTipoVenta, this.gridBagConstraintsTipoVenta);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionTipoVenta = new JButtonMe();
		this.jButtonCerrarImportacionTipoVenta.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionTipoVenta,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionTipoVenta.setToolTipText("Cancelar"+" "+TipoVentaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoVenta = new GridBagConstraints();
		this.gridBagConstraintsTipoVenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoVenta.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoVenta.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoVenta.add(this.jButtonCerrarImportacionTipoVenta, this.gridBagConstraintsTipoVenta);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalTipoVenta = new GridBagLayout();
		
		this.jScrollPanelImportacionTipoVenta= new JScrollPane(jPanelImportacionTipoVenta,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsTipoVenta = new GridBagConstraints();
		this.gridBagConstraintsTipoVenta.gridy =iPosYImportacion;
		this.gridBagConstraintsTipoVenta.gridx =iPosXImportacion;
		this.gridBagConstraintsTipoVenta.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionTipoVenta.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionTipoVenta.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalTipoVenta);
		this.jInternalFrameImportacionTipoVenta.getContentPane().add(this.jScrollPanelImportacionTipoVenta, this.gridBagConstraintsTipoVenta);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByTipoVenta(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByTipoVenta = new JButtonMe();
			this.jButtonAbrirOrderByTipoVenta.setText("Orden");
			this.jButtonAbrirOrderByTipoVenta.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoVenta,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByTipoVenta";
			inputMap = this.jButtonAbrirOrderByTipoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByTipoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByTipoVenta"));
		
		
			GridBagLayout gridaBagLayoutOrderByTipoVenta = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByTipoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByTipoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByTipoVenta.setName("jPanelOrderByTipoVenta"); 
			
			this.jPanelOrderByTipoVenta.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoVenta.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoVenta.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByTipoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByTipoVenta.setLayout(gridaBagLayoutOrderByTipoVenta);
			
			
			this.jTableDatosTipoVentaOrderBy = new JTableMe();        
			this.jTableDatosTipoVentaOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosTipoVentaOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosTipoVentaOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosTipoVentaOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosTipoVentaOrderBy.setViewportView(this.jTableDatosTipoVentaOrderBy);
			this.jTableDatosTipoVentaOrderBy.setFillsViewportHeight(true);
			this.jTableDatosTipoVentaOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByTipoVenta= new OrderByJInternalFrame();
			this.jInternalFrameOrderByTipoVenta= new OrderByJInternalFrame();
			this.jScrollPanelOrderByTipoVenta = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteTipoVenta= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByTipoVenta.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByTipoVenta.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByTipoVenta.setTitle("Orden");
			this.jInternalFrameOrderByTipoVenta.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByTipoVenta.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByTipoVenta.setResizable(true);
			this.jInternalFrameOrderByTipoVenta.setClosable(true);
			this.jInternalFrameOrderByTipoVenta.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByTipoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByTipoVenta.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoVenta.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoVenta.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByTipoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByTipoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Ventas"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsTipoVenta = new GridBagConstraints();
			this.gridBagConstraintsTipoVenta.gridy =iPosYOrderBy++;
			this.gridBagConstraintsTipoVenta.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoVenta.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsTipoVenta.ipady =150;
				
			this.jPanelOrderByTipoVenta.add(jScrollPanelDatosTipoVentaOrderBy, this.gridBagConstraintsTipoVenta);//this.jTableDatosTipoVentaTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByTipoVenta = new JButtonMe();
			this.jButtonCerrarOrderByTipoVenta.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByTipoVenta,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByTipoVenta.setToolTipText("Cancelar"+" "+TipoVentaConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByTipoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsTipoVenta = new GridBagConstraints();
			this.gridBagConstraintsTipoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoVenta.gridy = iPosYOrderBy++;
			this.gridBagConstraintsTipoVenta.gridx = iPosXOrderBy;
									
			this.jPanelOrderByTipoVenta.add(this.jButtonCerrarOrderByTipoVenta, this.gridBagConstraintsTipoVenta);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalTipoVenta = new GridBagLayout();
			
			this.jScrollPanelOrderByTipoVenta= new JScrollPane(jPanelOrderByTipoVenta,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsTipoVenta = new GridBagConstraints();
			this.gridBagConstraintsTipoVenta.gridy =iPosYOrderBy;
			this.gridBagConstraintsTipoVenta.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoVenta.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByTipoVenta.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByTipoVenta.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalTipoVenta);
			
			this.jInternalFrameOrderByTipoVenta.getContentPane().add(this.jScrollPanelOrderByTipoVenta, this.gridBagConstraintsTipoVenta);			
		
		} else {
			this.jButtonAbrirOrderByTipoVenta = new JButtonMe();
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
			iWidthTableCalculado+=400;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.tipoventaSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosTipoVenta.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosTipoVenta.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosTipoVenta.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosTipoVenta.getRowHeight();//TipoVentaConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.tipoventaSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > TipoVentaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoVenta.isSelected()) {
					iHeightTable=TipoVentaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoVentaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoVentaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > TipoVentaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoVenta.isSelected()) {
					iHeightTable=TipoVentaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoVentaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoVentaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosTipoVenta.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoVenta.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoVenta.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosTipoVenta.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoVenta.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoVenta.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByTipoVenta!=null && this.jInternalFrameOrderByTipoVenta.getjTableDatosOrderBy()!=null) {
			//if(!this.tipoventaSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByTipoVenta.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByTipoVenta.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByTipoVenta.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByTipoVenta.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByTipoVenta.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByTipoVenta.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByTipoVenta.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosTipoVenta.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoVenta.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoVenta.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=tipoventaLogic.getTipoVentas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipoventas.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<TipoVenta> TraerTipoVentaBeans(List<TipoVenta> tipoventas,ArrayList<Classe> classes)throws Exception {
		try {
			for(TipoVenta tipoventa:tipoventas) {
					
				if(!(TipoVentaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || TipoVentaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					tipoventa.setsDetalleGeneralEntityReporte(TipoVentaConstantesFunciones.getTipoVentaDescripcion(tipoventa));
										
						
					
						
					
				} else  {
							
					//tipoventa.setsDetalleGeneralEntityReporte(tipoventa.getsDetalleGeneralEntityReporte());
										
				}
				
				//tipoventabeans.add(tipoventabean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return tipoventas;
    }
	//PARA REPORTES FIN
}
