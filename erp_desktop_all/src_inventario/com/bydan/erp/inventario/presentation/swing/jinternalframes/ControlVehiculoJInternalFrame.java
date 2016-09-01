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

import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;

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
import com.bydan.erp.inventario.util.ControlVehiculoConstantesFunciones;

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
public class ControlVehiculoJInternalFrame extends ControlVehiculoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarControlVehiculo;
	
	protected JMenuBar jmenuBarControlVehiculo;
	
	protected JMenu jmenuControlVehiculo;
	protected JMenu jmenuDatosControlVehiculo;
	protected JMenu jmenuArchivoControlVehiculo;
	protected JMenu jmenuAccionesControlVehiculo;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosControlVehiculo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutControlVehiculo;	
	protected GridBagConstraints gridBagConstraintsControlVehiculo;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public ControlVehiculoDetalleFormJInternalFrame jInternalFrameDetalleFormControlVehiculo;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoControlVehiculo;	
	protected ImportacionJInternalFrame jInternalFrameImportacionControlVehiculo;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public ControlVehiculoSessionBean controlvehiculoSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<ControlVehiculo> controlvehiculos;		
	public List<ControlVehiculo> controlvehiculosEliminados;	
	public List<ControlVehiculo> controlvehiculosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByControlVehiculo;		
	protected JButton jButtonAbrirOrderByControlVehiculo;
	
	
	//protected JPanel jPanelOrderByControlVehiculo;
	//public JScrollPane jScrollPanelOrderByControlVehiculo;	
	//protected JButton jButtonCerrarOrderByControlVehiculo;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public ControlVehiculoLogic controlvehiculoLogic;
	
	
	
	public JScrollPane jScrollPanelDatosControlVehiculo;
	public JScrollPane jScrollPanelDatosEdicionControlVehiculo;
	public JScrollPane jScrollPanelDatosGeneralControlVehiculo;
    
	
	
	//public JScrollPane jScrollPanelDatosControlVehiculoOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoControlVehiculo;
	//public JScrollPane jScrollPanelImportacionControlVehiculo;
	
	
	
	protected JPanel jPanelAccionesControlVehiculo;
	
    protected JPanel jPanelPaginacionControlVehiculo;
    protected JPanel jPanelParametrosReportesControlVehiculo;
	protected JPanel jPanelParametrosReportesAccionesControlVehiculo;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1ControlVehiculo;
	protected JPanel jPanelParametrosAuxiliar2ControlVehiculo;
	protected JPanel jPanelParametrosAuxiliar3ControlVehiculo;
	protected JPanel jPanelParametrosAuxiliar4ControlVehiculo;
	//protected JPanel jPanelParametrosAuxiliar5ControlVehiculo;
	
	
	
	//protected JPanel jPanelReporteDinamicoControlVehiculo;
	//protected JPanel jPanelImportacionControlVehiculo;
	
	
	public JTable jTableDatosControlVehiculo;
	
	
	
	//public JTable jTableDatosControlVehiculoOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoControlVehiculo;
	protected JButton jButtonDuplicarControlVehiculo;
	protected JButton jButtonCopiarControlVehiculo;
	protected JButton jButtonVerFormControlVehiculo;
	protected JButton jButtonNuevoRelacionesControlVehiculo;
	protected JButton jButtonModificarControlVehiculo;
	
    protected JButton jButtonGuardarCambiosTablaControlVehiculo;
	protected JButton jButtonCerrarControlVehiculo;
	
	
	protected JButton jButtonRecargarInformacionControlVehiculo;
	protected JButton jButtonProcesarInformacionControlVehiculo;
	
	
	protected JButton jButtonAnterioresControlVehiculo;
	protected JButton jButtonSiguientesControlVehiculo;
	protected JButton jButtonNuevoGuardarCambiosControlVehiculo;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoControlVehiculo;
	//protected JButton jButtonCerrarReporteDinamicoControlVehiculo;
	//protected JButton jButtonGenerarExcelReporteDinamicoControlVehiculo;	
	
	
	
	//protected JButton jButtonAbrirImportacionControlVehiculo;
	//protected JButton jButtonGenerarImportacionControlVehiculo;
	//protected JButton jButtonCerrarImportacionControlVehiculo;
	//protected JFileChooser jFileChooserImportacionControlVehiculo;
	//protected File fileImportacionControlVehiculo;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarControlVehiculo;
	protected JButton jButtonDuplicarToolBarControlVehiculo;
	protected JButton jButtonNuevoRelacionesToolBarControlVehiculo;
	
	
	public JButton jButtonGuardarCambiosToolBarControlVehiculo;
	protected JButton jButtonCopiarToolBarControlVehiculo;
	protected JButton jButtonVerFormToolBarControlVehiculo;
	public JButton jButtonGuardarCambiosTablaToolBarControlVehiculo;
	protected JButton jButtonMostrarOcultarTablaToolBarControlVehiculo;
	protected JButton jButtonCerrarToolBarControlVehiculo;
	
	protected JButton jButtonRecargarInformacionToolBarControlVehiculo;
	protected JButton jButtonProcesarInformacionToolBarControlVehiculo;
	protected JButton jButtonAnterioresToolBarControlVehiculo;
	protected JButton jButtonSiguientesToolBarControlVehiculo;
	protected JButton jButtonNuevoGuardarCambiosToolBarControlVehiculo;
	protected JButton jButtonAbrirOrderByToolBarControlVehiculo;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoControlVehiculo;
	protected JMenuItem jMenuItemDuplicarControlVehiculo;
	protected JMenuItem jMenuItemNuevoRelacionesControlVehiculo;
	
	
	protected JMenuItem jMenuItemGuardarCambiosControlVehiculo;
	protected JMenuItem jMenuItemCopiarControlVehiculo;
	protected JMenuItem jMenuItemVerFormControlVehiculo;
	protected JMenuItem jMenuItemGuardarCambiosTablaControlVehiculo;
	protected JMenuItem jMenuItemCerrarControlVehiculo;
	protected JMenuItem jMenuItemDetalleCerrarControlVehiculo;
	protected JMenuItem jMenuItemDetalleAbrirOrderByControlVehiculo;
	protected JMenuItem jMenuItemDetalleMostarOcultarControlVehiculo;
	
	protected JMenuItem jMenuItemRecargarInformacionControlVehiculo;
	protected JMenuItem jMenuItemProcesarInformacionControlVehiculo;
	protected JMenuItem jMenuItemAnterioresControlVehiculo;
	protected JMenuItem jMenuItemSiguientesControlVehiculo;
	protected JMenuItem jMenuItemNuevoGuardarCambiosControlVehiculo;
	protected JMenuItem jMenuItemAbrirOrderByControlVehiculo;
	protected JMenuItem jMenuItemMostrarOcultarControlVehiculo;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesControlVehiculo;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosControlVehiculo;
	protected JCheckBox jCheckBoxSeleccionadosControlVehiculo;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaControlVehiculo;
	protected JCheckBox jCheckBoxConGraficoReporteControlVehiculo;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesControlVehiculo;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesControlVehiculo;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoControlVehiculo;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoControlVehiculo;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesControlVehiculo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionControlVehiculo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesControlVehiculo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesControlVehiculo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarControlVehiculo;
	protected JTextField jTextFieldValorCampoGeneralControlVehiculo;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteControlVehiculo;
	//public JList<Reporte> jListColumnasSelectReporteControlVehiculo;
	//public JScrollPane jScrollColumnasSelectReporteControlVehiculo;
	
	//public JLabel jLabelRelacionesSelectReporteControlVehiculo;
	//public JList<Reporte> jListRelacionesSelectReporteControlVehiculo;
	//public JScrollPane jScrollRelacionesSelectReporteControlVehiculo;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoControlVehiculo;
	//protected JCheckBox jCheckBoxConGraficoDinamicoControlVehiculo;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoControlVehiculo;
	//public JLabel jLabelTiposArchivoReporteDinamicoControlVehiculo;
	
		
	//public JLabel jLabelArchivoImportacionControlVehiculo;	
	//public JLabel jLabelPathArchivoImportacionControlVehiculo;
	//protected JTextField jTextFieldPathArchivoImportacionControlVehiculo;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoControlVehiculo;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoControlVehiculo;
	
	//public JLabel jLabelColumnaCategoriaValorControlVehiculo;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorControlVehiculo;
	
	//public JLabel jLabelColumnasValoresGraficoControlVehiculo;
	//public JList<Reporte> jListColumnasValoresGraficoControlVehiculo;
	//public JScrollPane jScrollColumnasValoresGraficoControlVehiculo;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoControlVehiculo;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoControlVehiculo;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasControlVehiculo;
	public JPanel jPanelBusquedaPorFechaEntradaControlVehiculo;
	public JButton jButtonBusquedaPorFechaEntradaControlVehiculo;
	public JPanel jPanelBusquedaPorFechaSalidaControlVehiculo;
	public JButton jButtonBusquedaPorFechaSalidaControlVehiculo;
	public JPanel jPanelBusquedaPorNombreConductorControlVehiculo;
	public JButton jButtonBusquedaPorNombreConductorControlVehiculo;
	public JPanel jPanelBusquedaPorNumeroPlacaControlVehiculo;
	public JButton jButtonBusquedaPorNumeroPlacaControlVehiculo;
	
	public JPanel jPanelfecha_entradaBusquedaPorFechaEntradaControlVehiculo;
	public JLabel jLabelfecha_entradaBusquedaPorFechaEntradaControlVehiculo;
	//public JFormattedTextField jDateChooserfecha_entradaBusquedaPorFechaEntradaControlVehiculo;

	public JDateChooser jDateChooserfecha_entradaBusquedaPorFechaEntradaControlVehiculo;
	public JButton jButtonfecha_entradaBusquedaPorFechaEntradaControlVehiculoBusqueda= new JButtonMe();

	
	public JPanel jPanelfecha_salidaBusquedaPorFechaSalidaControlVehiculo;
	public JLabel jLabelfecha_salidaBusquedaPorFechaSalidaControlVehiculo;
	//public JFormattedTextField jDateChooserfecha_salidaBusquedaPorFechaSalidaControlVehiculo;

	public JDateChooser jDateChooserfecha_salidaBusquedaPorFechaSalidaControlVehiculo;
	public JButton jButtonfecha_salidaBusquedaPorFechaSalidaControlVehiculoBusqueda= new JButtonMe();

	
	public JPanel jPanelnombre_conductorBusquedaPorNombreConductorControlVehiculo;
	public JLabel jLabelnombre_conductorBusquedaPorNombreConductorControlVehiculo;
	public JTextArea jTextAreanombre_conductorBusquedaPorNombreConductorControlVehiculo;
	public JButton jButtonnombre_conductorBusquedaPorNombreConductorControlVehiculoBusqueda= new JButtonMe();

	
	public JPanel jPanelnumero_placaBusquedaPorNumeroPlacaControlVehiculo;
	public JLabel jLabelnumero_placaBusquedaPorNumeroPlacaControlVehiculo;
	public JTextArea jTextAreanumero_placaBusquedaPorNumeroPlacaControlVehiculo;
	public JButton jButtonnumero_placaBusquedaPorNumeroPlacaControlVehiculoBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=506;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public ControlVehiculoJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("ControlVehiculo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ControlVehiculoJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ControlVehiculo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ControlVehiculoJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ControlVehiculo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ControlVehiculoJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ControlVehiculo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionControlVehiculo)	{
		this.jButtonRecargarInformacionControlVehiculo = jButtonRecargarInformacionControlVehiculo;
	}
	
	public JButton getjButtonProcesarInformacionControlVehiculo() {
		return this.jButtonProcesarInformacionControlVehiculo;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionControlVehiculo)	{
		this.jButtonProcesarInformacionControlVehiculo = jButtonProcesarInformacionControlVehiculo;
	}
	
	
	public JButton getjButtonRecargarInformacionControlVehiculo() {
		return this.jButtonRecargarInformacionControlVehiculo;
	}
	
	
	public List<ControlVehiculo> getcontrolvehiculos() {
		return this.controlvehiculos;
	}

	public void setcontrolvehiculos(List<ControlVehiculo> controlvehiculos) {
		this.controlvehiculos = controlvehiculos;
	}
	
	public List<ControlVehiculo> getcontrolvehiculosAux() {
		return this.controlvehiculosAux;
	}

	public void setcontrolvehiculosAux(List<ControlVehiculo> controlvehiculosAux) {
		this.controlvehiculosAux = controlvehiculosAux;
	}
	
	public List<ControlVehiculo> getcontrolvehiculosEliminados() {
		return this.controlvehiculosEliminados;
	}

	public void setControlVehiculosEliminados(List<ControlVehiculo> controlvehiculosEliminados) {
		this.controlvehiculosEliminados = controlvehiculosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarControlVehiculo() {
		return jComboBoxTiposSeleccionarControlVehiculo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarControlVehiculo(
			JComboBox jComboBoxTiposSeleccionarControlVehiculo) {
		this.jComboBoxTiposSeleccionarControlVehiculo = jComboBoxTiposSeleccionarControlVehiculo;
	}
	
	public void setBorderResaltarTiposSeleccionarControlVehiculo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarControlVehiculo.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarControlVehiculo .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralControlVehiculo() {
		return jTextFieldValorCampoGeneralControlVehiculo;
	}

	public void setjTextFieldValorCampoGeneralControlVehiculo(
			JTextField jTextFieldValorCampoGeneralControlVehiculo) {
		this.jTextFieldValorCampoGeneralControlVehiculo = jTextFieldValorCampoGeneralControlVehiculo;
	}

	public void setBorderResaltarValorCampoGeneralControlVehiculo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarControlVehiculo.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralControlVehiculo .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosControlVehiculo() {
		return this.jCheckBoxSeleccionarTodosControlVehiculo;
	}

	public void setjCheckBoxSeleccionarTodosControlVehiculo(
			JCheckBox jCheckBoxSeleccionarTodosControlVehiculo) {
		this.jCheckBoxSeleccionarTodosControlVehiculo = jCheckBoxSeleccionarTodosControlVehiculo;
	}

	public void setBorderResaltarSeleccionarTodosControlVehiculo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarControlVehiculo.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosControlVehiculo .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosControlVehiculo() {
		return this.jCheckBoxSeleccionadosControlVehiculo;
	}

	public void setjCheckBoxSeleccionadosControlVehiculo(
			JCheckBox jCheckBoxSeleccionadosControlVehiculo) {
		this.jCheckBoxSeleccionadosControlVehiculo = jCheckBoxSeleccionadosControlVehiculo;
	}
	
	public void setBorderResaltarSeleccionadosControlVehiculo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarControlVehiculo.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosControlVehiculo .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesControlVehiculo() {
		return this.jComboBoxTiposArchivosReportesControlVehiculo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesControlVehiculo(
			JComboBox jComboBoxTiposArchivosReportesControlVehiculo) {
		this.jComboBoxTiposArchivosReportesControlVehiculo = jComboBoxTiposArchivosReportesControlVehiculo;
	}

	public void setBorderResaltarTiposArchivosReportesControlVehiculo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarControlVehiculo.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesControlVehiculo .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesControlVehiculo() {
		return this.jComboBoxTiposReportesControlVehiculo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesControlVehiculo(
			JComboBox jComboBoxTiposReportesControlVehiculo) {
		this.jComboBoxTiposReportesControlVehiculo = jComboBoxTiposReportesControlVehiculo;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoControlVehiculo() {
	//	return jComboBoxTiposReportesDinamicoControlVehiculo;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoControlVehiculo(
	//		JComboBox jComboBoxTiposReportesDinamicoControlVehiculo) {
	//	this.jComboBoxTiposReportesDinamicoControlVehiculo = jComboBoxTiposReportesDinamicoControlVehiculo;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoControlVehiculo() {
	//	return jComboBoxTiposArchivosReportesDinamicoControlVehiculo;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoControlVehiculo(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoControlVehiculo) {
	//	this.jComboBoxTiposArchivosReportesDinamicoControlVehiculo = jComboBoxTiposArchivosReportesDinamicoControlVehiculo;
	//}
	
	public void setBorderResaltarTiposReportesControlVehiculo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarControlVehiculo.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesControlVehiculo .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesControlVehiculo() {
		return this.jComboBoxTiposGraficosReportesControlVehiculo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesControlVehiculo(
			JComboBox jComboBoxTiposGraficosReportesControlVehiculo) {
		this.jComboBoxTiposGraficosReportesControlVehiculo = jComboBoxTiposGraficosReportesControlVehiculo;
	}
	
	public void setBorderResaltarTiposGraficosReportesControlVehiculo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarControlVehiculo.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesControlVehiculo .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionControlVehiculo() {
		return this.jComboBoxTiposPaginacionControlVehiculo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionControlVehiculo(
			JComboBox jComboBoxTiposPaginacionControlVehiculo) {
		this.jComboBoxTiposPaginacionControlVehiculo = jComboBoxTiposPaginacionControlVehiculo;
	}
	
	public void setBorderResaltarTiposPaginacionControlVehiculo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarControlVehiculo.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionControlVehiculo .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesControlVehiculo() {
		return this.jComboBoxTiposRelacionesControlVehiculo;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesControlVehiculo() {
		return this.jComboBoxTiposAccionesControlVehiculo;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesControlVehiculo(
			JComboBox jComboBoxTiposRelacionesControlVehiculo) {
		this.jComboBoxTiposRelacionesControlVehiculo = jComboBoxTiposRelacionesControlVehiculo;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesControlVehiculo(
			JComboBox jComboBoxTiposAccionesControlVehiculo) {
		this.jComboBoxTiposAccionesControlVehiculo = jComboBoxTiposAccionesControlVehiculo;
	}
	
	public void setBorderResaltarTiposRelacionesControlVehiculo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarControlVehiculo.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesControlVehiculo .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesControlVehiculo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarControlVehiculo.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesControlVehiculo .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoControlVehiculo() {
	//	return jCheckBoxConGraficoDinamicoControlVehiculo;
	//}

	//public void setjCheckBoxConGraficoDinamicoControlVehiculo(
	//		JCheckBox jCheckBoxConGraficoDinamicoControlVehiculo) {
	//	this.jCheckBoxConGraficoDinamicoControlVehiculo = jCheckBoxConGraficoDinamicoControlVehiculo;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoControlVehiculo() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarControlVehiculo.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoControlVehiculo .setBorder(borderResaltar);		
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
		this.controlvehiculoSessionBean=new ControlVehiculoSessionBean();
		
		this.controlvehiculoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.controlvehiculoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.controlvehiculoSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=ControlVehiculoJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=ControlVehiculoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ControlVehiculoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ControlVehiculoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ControlVehiculoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Control Vehiculo MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.controlvehiculoSessionBean.getEsGuardarRelacionado()) {
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
		
		ControlVehiculoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("ControlVehiculo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarControlVehiculo= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarControlVehiculo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarControlVehiculo,this.jTtoolBarControlVehiculo,
							"nuevo","nuevo","Nuevo"+" "+ControlVehiculoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarControlVehiculo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarControlVehiculo,this.jTtoolBarControlVehiculo,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarControlVehiculo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarControlVehiculo,this.jTtoolBarControlVehiculo,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+ControlVehiculoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarControlVehiculo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarControlVehiculo,this.jTtoolBarControlVehiculo,
							"duplicar","duplicar","Duplicar"+" "+ControlVehiculoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarControlVehiculo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarControlVehiculo,this.jTtoolBarControlVehiculo,
							"copiar","copiar","Copiar"+" "+ControlVehiculoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarControlVehiculo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarControlVehiculo,this.jTtoolBarControlVehiculo,
							"ver_form","ver_form","Ver"+" "+ControlVehiculoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarControlVehiculo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarControlVehiculo,this.jTtoolBarControlVehiculo,
							"recargar","recargar","Recargar"+" "+ControlVehiculoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarControlVehiculo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarControlVehiculo,this.jTtoolBarControlVehiculo,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarControlVehiculo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarControlVehiculo,this.jTtoolBarControlVehiculo,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarControlVehiculo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarControlVehiculo,this.jTtoolBarControlVehiculo,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarControlVehiculo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarControlVehiculo,this.jTtoolBarControlVehiculo,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarControlVehiculo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarControlVehiculo,this.jTtoolBarControlVehiculo,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+ControlVehiculoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarControlVehiculo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarControlVehiculo,this.jTtoolBarControlVehiculo,
							"cerrar","cerrar","Salir"+" "+ControlVehiculoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarControlVehiculo=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarControlVehiculo;
			
				this.jButtonProcesarInformacionToolBarControlVehiculo=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarControlVehiculo;
				
		//protected JButton jButtonModificarToolBarControlVehiculo;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarControlVehiculo=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuControlVehiculo=new JMenuMe("General");
		this.jmenuArchivoControlVehiculo=new JMenuMe("Archivo");
		this.jmenuAccionesControlVehiculo=new JMenuMe("Acciones");
		this.jmenuDatosControlVehiculo=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoControlVehiculo= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoControlVehiculo.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoControlVehiculo,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoControlVehiculo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarControlVehiculo= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarControlVehiculo.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarControlVehiculo,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarControlVehiculo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesControlVehiculo= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesControlVehiculo.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesControlVehiculo,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesControlVehiculo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosControlVehiculo= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosControlVehiculo.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosControlVehiculo,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosControlVehiculo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarControlVehiculo= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarControlVehiculo.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarControlVehiculo,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarControlVehiculo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormControlVehiculo= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormControlVehiculo.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormControlVehiculo,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormControlVehiculo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaControlVehiculo= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaControlVehiculo.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaControlVehiculo,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaControlVehiculo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarControlVehiculo= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarControlVehiculo.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarControlVehiculo,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarControlVehiculo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionControlVehiculo= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionControlVehiculo.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionControlVehiculo,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionControlVehiculo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionControlVehiculo= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionControlVehiculo.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionControlVehiculo,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresControlVehiculo= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresControlVehiculo.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresControlVehiculo,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresControlVehiculo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesControlVehiculo= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesControlVehiculo.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesControlVehiculo,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesControlVehiculo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByControlVehiculo= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByControlVehiculo.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByControlVehiculo,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByControlVehiculo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarControlVehiculo= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarControlVehiculo.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarControlVehiculo,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarControlVehiculo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByControlVehiculo= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByControlVehiculo.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByControlVehiculo,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByControlVehiculo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarControlVehiculo= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarControlVehiculo.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarControlVehiculo,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarControlVehiculo, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosControlVehiculo= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosControlVehiculo.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosControlVehiculo,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosControlVehiculo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoControlVehiculo.add(this.jMenuItemCerrarControlVehiculo);
			
			this.jmenuAccionesControlVehiculo.add(this.jMenuItemNuevoControlVehiculo);
			this.jmenuAccionesControlVehiculo.add(this.jMenuItemNuevoGuardarCambiosControlVehiculo);
			this.jmenuAccionesControlVehiculo.add(this.jMenuItemNuevoRelacionesControlVehiculo);
			this.jmenuAccionesControlVehiculo.add(this.jMenuItemGuardarCambiosTablaControlVehiculo);		
			this.jmenuAccionesControlVehiculo.add(this.jMenuItemDuplicarControlVehiculo);		
			this.jmenuAccionesControlVehiculo.add(this.jMenuItemCopiarControlVehiculo);		
			this.jmenuAccionesControlVehiculo.add(this.jMenuItemVerFormControlVehiculo);		
			
			this.jmenuDatosControlVehiculo.add(this.jMenuItemRecargarInformacionControlVehiculo);				
			this.jmenuDatosControlVehiculo.add(this.jMenuItemAnterioresControlVehiculo);				
			this.jmenuDatosControlVehiculo.add(this.jMenuItemSiguientesControlVehiculo);				
			this.jmenuDatosControlVehiculo.add(this.jMenuItemAbrirOrderByControlVehiculo);				
			this.jmenuDatosControlVehiculo.add(this.jMenuItemMostrarOcultarControlVehiculo);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesControlVehiculo.add(this.jMenuItemGuardarCambiosControlVehiculo);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoControlVehiculo, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesControlVehiculo, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosControlVehiculo, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarControlVehiculo.add(this.jmenuArchivoControlVehiculo);		
			this.jmenuBarControlVehiculo.add(this.jmenuAccionesControlVehiculo);		
			this.jmenuBarControlVehiculo.add(this.jmenuDatosControlVehiculo);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarControlVehiculo);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasControlVehiculo() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaPorFechaEntradaControlVehiculo=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorFechaEntradaControlVehiculo.setToolTipText("Buscar Por Fecha Entrada ");
		this.jButtonBusquedaPorFechaEntradaControlVehiculo= new JButtonMe();
		this.jButtonBusquedaPorFechaEntradaControlVehiculo.setText("Buscar");
		this.jButtonBusquedaPorFechaEntradaControlVehiculo.setToolTipText("Buscar Por Fecha Entrada ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorFechaEntradaControlVehiculo,"buscar_button","Buscar Por Fecha Entrada ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorFechaEntradaControlVehiculo, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelfecha_entradaBusquedaPorFechaEntradaControlVehiculo = new JLabelMe();
		jLabelfecha_entradaBusquedaPorFechaEntradaControlVehiculo.setText("Fecha Entrada :");
		jLabelfecha_entradaBusquedaPorFechaEntradaControlVehiculo.setToolTipText("Fecha Entrada");
		jLabelfecha_entradaBusquedaPorFechaEntradaControlVehiculo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelfecha_entradaBusquedaPorFechaEntradaControlVehiculo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelfecha_entradaBusquedaPorFechaEntradaControlVehiculo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelfecha_entradaBusquedaPorFechaEntradaControlVehiculo,STIPO_TAMANIO_GENERAL,false,true,this);

		jDateChooserfecha_entradaBusquedaPorFechaEntradaControlVehiculo= new JDateChooser();
		jDateChooserfecha_entradaBusquedaPorFechaEntradaControlVehiculo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_entradaBusquedaPorFechaEntradaControlVehiculo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_entradaBusquedaPorFechaEntradaControlVehiculo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_entradaBusquedaPorFechaEntradaControlVehiculo,STIPO_TAMANIO_GENERAL,false,true,this);
		jDateChooserfecha_entradaBusquedaPorFechaEntradaControlVehiculo.setDate(new Date());
		jDateChooserfecha_entradaBusquedaPorFechaEntradaControlVehiculo.setDateFormatString("yyyy-MM-dd");;
		//jDateChooserfecha_entradaBusquedaPorFechaEntradaControlVehiculo.setText(Funciones.getStringMySqlCurrentDate());



		this.jPanelBusquedaPorFechaSalidaControlVehiculo=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorFechaSalidaControlVehiculo.setToolTipText("Buscar Por Fecha Salida ");
		this.jButtonBusquedaPorFechaSalidaControlVehiculo= new JButtonMe();
		this.jButtonBusquedaPorFechaSalidaControlVehiculo.setText("Buscar");
		this.jButtonBusquedaPorFechaSalidaControlVehiculo.setToolTipText("Buscar Por Fecha Salida ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorFechaSalidaControlVehiculo,"buscar_button","Buscar Por Fecha Salida ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorFechaSalidaControlVehiculo, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelfecha_salidaBusquedaPorFechaSalidaControlVehiculo = new JLabelMe();
		jLabelfecha_salidaBusquedaPorFechaSalidaControlVehiculo.setText("Fecha Salida :");
		jLabelfecha_salidaBusquedaPorFechaSalidaControlVehiculo.setToolTipText("Fecha Salida");
		jLabelfecha_salidaBusquedaPorFechaSalidaControlVehiculo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelfecha_salidaBusquedaPorFechaSalidaControlVehiculo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelfecha_salidaBusquedaPorFechaSalidaControlVehiculo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelfecha_salidaBusquedaPorFechaSalidaControlVehiculo,STIPO_TAMANIO_GENERAL,false,true,this);

		jDateChooserfecha_salidaBusquedaPorFechaSalidaControlVehiculo= new JDateChooser();
		jDateChooserfecha_salidaBusquedaPorFechaSalidaControlVehiculo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_salidaBusquedaPorFechaSalidaControlVehiculo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_salidaBusquedaPorFechaSalidaControlVehiculo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_salidaBusquedaPorFechaSalidaControlVehiculo,STIPO_TAMANIO_GENERAL,false,true,this);
		jDateChooserfecha_salidaBusquedaPorFechaSalidaControlVehiculo.setDate(new Date());
		jDateChooserfecha_salidaBusquedaPorFechaSalidaControlVehiculo.setDateFormatString("yyyy-MM-dd");;
		//jDateChooserfecha_salidaBusquedaPorFechaSalidaControlVehiculo.setText(Funciones.getStringMySqlCurrentDate());



		this.jPanelBusquedaPorNombreConductorControlVehiculo=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorNombreConductorControlVehiculo.setToolTipText("Buscar Por Nombre Conductor ");
		this.jButtonBusquedaPorNombreConductorControlVehiculo= new JButtonMe();
		this.jButtonBusquedaPorNombreConductorControlVehiculo.setText("Buscar");
		this.jButtonBusquedaPorNombreConductorControlVehiculo.setToolTipText("Buscar Por Nombre Conductor ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorNombreConductorControlVehiculo,"buscar_button","Buscar Por Nombre Conductor ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorNombreConductorControlVehiculo, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelnombre_conductorBusquedaPorNombreConductorControlVehiculo = new JLabelMe();
		jLabelnombre_conductorBusquedaPorNombreConductorControlVehiculo.setText("Nombre Conductor :");
		jLabelnombre_conductorBusquedaPorNombreConductorControlVehiculo.setToolTipText("Nombre Conductor");
		jLabelnombre_conductorBusquedaPorNombreConductorControlVehiculo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelnombre_conductorBusquedaPorNombreConductorControlVehiculo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelnombre_conductorBusquedaPorNombreConductorControlVehiculo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelnombre_conductorBusquedaPorNombreConductorControlVehiculo,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextAreanombre_conductorBusquedaPorNombreConductorControlVehiculo= new JTextAreaMe();
		jTextAreanombre_conductorBusquedaPorNombreConductorControlVehiculo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_conductorBusquedaPorNombreConductorControlVehiculo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_conductorBusquedaPorNombreConductorControlVehiculo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextArea(jTextAreanombre_conductorBusquedaPorNombreConductorControlVehiculo,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelBusquedaPorNumeroPlacaControlVehiculo=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorNumeroPlacaControlVehiculo.setToolTipText("Buscar Por Numero_placa ");
		this.jButtonBusquedaPorNumeroPlacaControlVehiculo= new JButtonMe();
		this.jButtonBusquedaPorNumeroPlacaControlVehiculo.setText("Buscar");
		this.jButtonBusquedaPorNumeroPlacaControlVehiculo.setToolTipText("Buscar Por Numero_placa ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorNumeroPlacaControlVehiculo,"buscar_button","Buscar Por Numero_placa ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorNumeroPlacaControlVehiculo, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelnumero_placaBusquedaPorNumeroPlacaControlVehiculo = new JLabelMe();
		jLabelnumero_placaBusquedaPorNumeroPlacaControlVehiculo.setText("Numero_placa :");
		jLabelnumero_placaBusquedaPorNumeroPlacaControlVehiculo.setToolTipText("Numero_placa");
		jLabelnumero_placaBusquedaPorNumeroPlacaControlVehiculo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnumero_placaBusquedaPorNumeroPlacaControlVehiculo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnumero_placaBusquedaPorNumeroPlacaControlVehiculo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelnumero_placaBusquedaPorNumeroPlacaControlVehiculo,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextAreanumero_placaBusquedaPorNumeroPlacaControlVehiculo= new JTextAreaMe();
		jTextAreanumero_placaBusquedaPorNumeroPlacaControlVehiculo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanumero_placaBusquedaPorNumeroPlacaControlVehiculo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanumero_placaBusquedaPorNumeroPlacaControlVehiculo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextArea(jTextAreanumero_placaBusquedaPorNumeroPlacaControlVehiculo,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasControlVehiculo=new JTabbedPane();


		this.jTabbedPaneBusquedasControlVehiculo.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasControlVehiculo.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasControlVehiculo.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasControlVehiculo.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasControlVehiculo.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasControlVehiculo,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleControlVehiculo = new ControlVehiculoDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Control Vehiculo DATOS");
			this.jInternalFrameDetalleFormControlVehiculo = new ControlVehiculoDetalleFormJInternalFrame(jDesktopPane,this.controlvehiculoSessionBean.getConGuardarRelaciones(),this.controlvehiculoSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormControlVehiculo = null;//new ControlVehiculoDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutControlVehiculo= new GridBagLayout();
		
		
		this.jTableDatosControlVehiculo = new JTableMe();      
		
		String sToolTipControlVehiculo="";
		sToolTipControlVehiculo=ControlVehiculoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipControlVehiculo+="(Inventario.ControlVehiculo)";
		}
		
		if(!this.controlvehiculoSessionBean.getEsGuardarRelacionado()) {
			sToolTipControlVehiculo+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosControlVehiculo.setToolTipText(sToolTipControlVehiculo);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosControlVehiculo);
		this.jTableDatosControlVehiculo.setAutoCreateRowSorter(true);
		this.jTableDatosControlVehiculo.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosControlVehiculo.setRowSelectionAllowed(true);
		this.jTableDatosControlVehiculo.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosControlVehiculo,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoControlVehiculo = new JButtonMe();
		this.jButtonDuplicarControlVehiculo = new JButtonMe();
		this.jButtonCopiarControlVehiculo = new JButtonMe();
		this.jButtonVerFormControlVehiculo = new JButtonMe();
		this.jButtonNuevoRelacionesControlVehiculo = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaControlVehiculo = new JButtonMe();
		this.jButtonCerrarControlVehiculo = new JButtonMe();
		
		this.jScrollPanelDatosControlVehiculo = new JScrollPane();   
        this.jScrollPanelDatosGeneralControlVehiculo = new JScrollPane();
		
				
		
		
		this.jPanelAccionesControlVehiculo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Control Vehiculo";
		
		if(!this.controlvehiculoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosControlVehiculo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Control Vehiculoes" + this.sPath));
		} else {
			this.jScrollPanelDatosControlVehiculo.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralControlVehiculo.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesControlVehiculo.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesControlVehiculo.setToolTipText("Acciones");
        this.jPanelAccionesControlVehiculo.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralControlVehiculo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosControlVehiculo, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoControlVehiculo=new ReporteDinamicoJInternalFrame(ControlVehiculoConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoControlVehiculo();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionControlVehiculo=new ImportacionJInternalFrame(ControlVehiculoConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionControlVehiculo();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByControlVehiculo = new JButtonMe();
		
		this.jButtonAbrirOrderByControlVehiculo.setText("Orden");
		this.jButtonAbrirOrderByControlVehiculo.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByControlVehiculo,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByControlVehiculo, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByControlVehiculo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByControlVehiculo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByControlVehiculo=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByControlVehiculo,false,this);
			
			//this.cargarOrderByControlVehiculo(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByControlVehiculo=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByControlVehiculo,true,this);
			
			//this.cargarOrderByControlVehiculo(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosControlVehiculo.setMinimumSize(new Dimension(400,50));//630
		this.jTableDatosControlVehiculo.setMaximumSize(new Dimension(400,50));//630
		this.jTableDatosControlVehiculo.setPreferredSize(new Dimension(400,50));//630
		
		this.jScrollPanelDatosControlVehiculo.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosControlVehiculo.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosControlVehiculo.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoControlVehiculo.setText("Nuevo");
		this.jButtonDuplicarControlVehiculo.setText("Duplicar");
		this.jButtonCopiarControlVehiculo.setText("Copiar");
		this.jButtonVerFormControlVehiculo.setText("Ver");
		this.jButtonNuevoRelacionesControlVehiculo.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaControlVehiculo.setText("Guardar");
		this.jButtonCerrarControlVehiculo.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoControlVehiculo,"nuevo_button","Nuevo",this.controlvehiculoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarControlVehiculo,"duplicar_button","Duplicar",this.controlvehiculoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarControlVehiculo,"copiar_button","Copiar",this.controlvehiculoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormControlVehiculo,"ver_form","Ver",this.controlvehiculoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesControlVehiculo,"nuevorelaciones_button","Nuevo Rel",this.controlvehiculoSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaControlVehiculo,"guardarcambiostabla_button","Guardar",this.controlvehiculoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarControlVehiculo,"cerrar_button","Salir",this.controlvehiculoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoControlVehiculo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarControlVehiculo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarControlVehiculo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormControlVehiculo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesControlVehiculo, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaControlVehiculo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarControlVehiculo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoControlVehiculo.setToolTipText("Nuevo"+" "+ControlVehiculoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarControlVehiculo.setToolTipText("Duplicar"+" "+ControlVehiculoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarControlVehiculo.setToolTipText("Copiar"+" "+ControlVehiculoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormControlVehiculo.setToolTipText("Ver"+" "+ControlVehiculoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesControlVehiculo.setToolTipText("Nuevo Rel"+" "+ControlVehiculoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaControlVehiculo.setToolTipText("Guardar"+" "+ControlVehiculoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarControlVehiculo.setToolTipText("Salir"+" "+ControlVehiculoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoControlVehiculo";
		inputMap = this.jButtonNuevoControlVehiculo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoControlVehiculo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoControlVehiculo"));
		
		//DUPLICAR
		sMapKey = "DuplicarControlVehiculo";
		inputMap = this.jButtonDuplicarControlVehiculo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarControlVehiculo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarControlVehiculo"));
		
		//COPIAR
		sMapKey = "CopiarControlVehiculo";
		inputMap = this.jButtonCopiarControlVehiculo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarControlVehiculo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarControlVehiculo"));
		
		//VEr FORM
		sMapKey = "VerFormControlVehiculo";
		inputMap = this.jButtonVerFormControlVehiculo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormControlVehiculo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormControlVehiculo"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesControlVehiculo";
		inputMap = this.jButtonNuevoRelacionesControlVehiculo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesControlVehiculo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesControlVehiculo"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarControlVehiculo";
		inputMap = this.jButtonModificarControlVehiculo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarControlVehiculo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarControlVehiculo"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarControlVehiculo";
		inputMap = this.jButtonCerrarControlVehiculo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarControlVehiculo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarControlVehiculo"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaControlVehiculo";
		inputMap = this.jButtonGuardarCambiosTablaControlVehiculo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaControlVehiculo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaControlVehiculo"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesControlVehiculo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesControlVehiculo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionControlVehiculo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1ControlVehiculo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2ControlVehiculo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3ControlVehiculo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4ControlVehiculo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5ControlVehiculo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesControlVehiculo.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesControlVehiculo.setName("jPanelParametrosReportesControlVehiculo"); 
		
		this.jPanelParametrosReportesAccionesControlVehiculo.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesControlVehiculo.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesControlVehiculo.setName("jPanelParametrosReportesAccionesControlVehiculo"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesControlVehiculo, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesControlVehiculo, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionControlVehiculo = new JButtonMe();
		this.jButtonRecargarInformacionControlVehiculo.setText("Recargar");
		this.jButtonRecargarInformacionControlVehiculo.setToolTipText("Recargar"+" "+ControlVehiculoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionControlVehiculo,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionControlVehiculo = new JButtonMe();
		this.jButtonProcesarInformacionControlVehiculo.setText("Procesar");
		this.jButtonProcesarInformacionControlVehiculo.setToolTipText("Procesar"+" "+ControlVehiculoConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionControlVehiculo.setVisible(false);
			
		this.jButtonProcesarInformacionControlVehiculo.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionControlVehiculo.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionControlVehiculo.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesControlVehiculo = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesControlVehiculo.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesControlVehiculo.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesControlVehiculo = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesControlVehiculo.setText("TIPO");       
		this.jComboBoxTiposReportesControlVehiculo.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesControlVehiculo = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesControlVehiculo.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesControlVehiculo.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionControlVehiculo = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionControlVehiculo.setText("Paginacion");
		this.jComboBoxTiposPaginacionControlVehiculo.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesControlVehiculo = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesControlVehiculo.setText("Accion");
		this.jComboBoxTiposRelacionesControlVehiculo.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesControlVehiculo = new JComboBoxMe();
		//this.jComboBoxTiposAccionesControlVehiculo.setText("Accion");
		this.jComboBoxTiposAccionesControlVehiculo.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarControlVehiculo = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarControlVehiculo.setText("Accion");
		this.jComboBoxTiposSeleccionarControlVehiculo.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralControlVehiculo=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralControlVehiculo.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralControlVehiculo.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralControlVehiculo.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesControlVehiculo = new JLabelMe();
		
		this.jLabelAccionesControlVehiculo.setText("Acciones");		
		this.jLabelAccionesControlVehiculo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesControlVehiculo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesControlVehiculo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosControlVehiculo = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosControlVehiculo.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosControlVehiculo.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosControlVehiculo = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosControlVehiculo.setText("Seleccionados");
		this.jCheckBoxSeleccionadosControlVehiculo.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaControlVehiculo = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaControlVehiculo.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaControlVehiculo.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteControlVehiculo = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteControlVehiculo.setText("Graf.");
		this.jCheckBoxConGraficoReporteControlVehiculo.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresControlVehiculo = new JButtonMe();
		//this.jButtonAnterioresControlVehiculo.setText("<<");
        this.jButtonAnterioresControlVehiculo.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresControlVehiculo,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresControlVehiculo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesControlVehiculo = new JButtonMe();
		//this.jButtonSiguientesControlVehiculo.setText(">>");
        this.jButtonSiguientesControlVehiculo.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesControlVehiculo,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesControlVehiculo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosControlVehiculo = new JButtonMe();
		this.jButtonNuevoGuardarCambiosControlVehiculo.setText("Nue");
        this.jButtonNuevoGuardarCambiosControlVehiculo.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosControlVehiculo,"nuevoguardarcambios_button","Nue",this.controlvehiculoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosControlVehiculo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosControlVehiculo";
		inputMap = this.jButtonNuevoGuardarCambiosControlVehiculo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosControlVehiculo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosControlVehiculo"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionControlVehiculo";
		inputMap = this.jButtonRecargarInformacionControlVehiculo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionControlVehiculo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionControlVehiculo"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesControlVehiculo";
		inputMap = this.jButtonSiguientesControlVehiculo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesControlVehiculo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesControlVehiculo"));
		
		//ANTERIORES		
		sMapKey = "AnterioresControlVehiculo";
		inputMap = this.jButtonAnterioresControlVehiculo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresControlVehiculo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresControlVehiculo"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasControlVehiculo();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesControlVehiculo.setMinimumSize(new Dimension(this.getWidth(),ControlVehiculoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ControlVehiculoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesControlVehiculo.setMaximumSize(new Dimension(this.getWidth(),ControlVehiculoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ControlVehiculoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesControlVehiculo.setPreferredSize(new Dimension(this.getWidth(),ControlVehiculoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ControlVehiculoBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionControlVehiculo = new GridBagLayout();

			this.jPanelPaginacionControlVehiculo.setLayout(gridaBagLayoutPaginacionControlVehiculo);						
			
			this.gridBagConstraintsControlVehiculo = new GridBagConstraints();
			this.gridBagConstraintsControlVehiculo.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsControlVehiculo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsControlVehiculo.gridy = 0;
			this.gridBagConstraintsControlVehiculo.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionControlVehiculo.add(this.jButtonAnterioresControlVehiculo, this.gridBagConstraintsControlVehiculo);
					
						
			this.gridBagConstraintsControlVehiculo = new GridBagConstraints();
			this.gridBagConstraintsControlVehiculo.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsControlVehiculo.gridy = 0;
			
			this.jPanelPaginacionControlVehiculo.add(this.jButtonNuevoGuardarCambiosControlVehiculo, this.gridBagConstraintsControlVehiculo);
						
			
			this.gridBagConstraintsControlVehiculo = new GridBagConstraints();
			this.gridBagConstraintsControlVehiculo.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsControlVehiculo.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsControlVehiculo.gridy = 0;
			this.jPanelPaginacionControlVehiculo.add(this.jButtonSiguientesControlVehiculo, this.gridBagConstraintsControlVehiculo);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsControlVehiculo = new GridBagConstraints();
			this.gridBagConstraintsControlVehiculo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsControlVehiculo.gridy = 1;
			this.gridBagConstraintsControlVehiculo.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionControlVehiculo.add(this.jButtonNuevoControlVehiculo, this.gridBagConstraintsControlVehiculo);
						
			
			
			if(!this.controlvehiculoSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsControlVehiculo = new GridBagConstraints();
				this.gridBagConstraintsControlVehiculo.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsControlVehiculo.gridy = 1;
				this.gridBagConstraintsControlVehiculo.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionControlVehiculo.add(this.jButtonGuardarCambiosTablaControlVehiculo, this.gridBagConstraintsControlVehiculo);
			}
			
			
			
			this.gridBagConstraintsControlVehiculo = new GridBagConstraints();
			this.gridBagConstraintsControlVehiculo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsControlVehiculo.gridy = 1;
			this.gridBagConstraintsControlVehiculo.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionControlVehiculo.add(this.jButtonDuplicarControlVehiculo, this.gridBagConstraintsControlVehiculo);
			
			this.gridBagConstraintsControlVehiculo = new GridBagConstraints();
			this.gridBagConstraintsControlVehiculo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsControlVehiculo.gridy = 1;
			this.gridBagConstraintsControlVehiculo.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionControlVehiculo.add(this.jButtonCopiarControlVehiculo, this.gridBagConstraintsControlVehiculo);
		
			this.gridBagConstraintsControlVehiculo = new GridBagConstraints();
			this.gridBagConstraintsControlVehiculo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsControlVehiculo.gridy = 1;
			this.gridBagConstraintsControlVehiculo.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionControlVehiculo.add(this.jButtonVerFormControlVehiculo, this.gridBagConstraintsControlVehiculo);
		
			this.gridBagConstraintsControlVehiculo = new GridBagConstraints();
			this.gridBagConstraintsControlVehiculo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsControlVehiculo.gridy = 1;
			this.gridBagConstraintsControlVehiculo.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionControlVehiculo.add(this.jButtonCerrarControlVehiculo, this.gridBagConstraintsControlVehiculo);
		
		
		
		this.jButtonRecargarInformacionControlVehiculo.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionControlVehiculo.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionControlVehiculo.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionControlVehiculo, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesControlVehiculo.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesControlVehiculo.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesControlVehiculo.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesControlVehiculo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesControlVehiculo.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesControlVehiculo.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesControlVehiculo.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesControlVehiculo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesControlVehiculo.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesControlVehiculo.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesControlVehiculo.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesControlVehiculo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionControlVehiculo.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionControlVehiculo.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionControlVehiculo.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionControlVehiculo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesControlVehiculo.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesControlVehiculo.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesControlVehiculo.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesControlVehiculo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesControlVehiculo.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesControlVehiculo.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesControlVehiculo.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesControlVehiculo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarControlVehiculo.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarControlVehiculo.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarControlVehiculo.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarControlVehiculo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaControlVehiculo.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaControlVehiculo.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaControlVehiculo.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaControlVehiculo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteControlVehiculo.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteControlVehiculo.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteControlVehiculo.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteControlVehiculo, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosControlVehiculo.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosControlVehiculo.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosControlVehiculo.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosControlVehiculo, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosControlVehiculo.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosControlVehiculo.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosControlVehiculo.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosControlVehiculo, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesControlVehiculo = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesControlVehiculo = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1ControlVehiculo = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2ControlVehiculo = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3ControlVehiculo = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4ControlVehiculo = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesControlVehiculo.setLayout(gridaBagParametrosReportesControlVehiculo);
			this.jPanelParametrosReportesAccionesControlVehiculo.setLayout(gridaBagParametrosReportesAccionesControlVehiculo);
			
			
			this.jPanelParametrosAuxiliar1ControlVehiculo.setLayout(gridaBagParametrosAuxiliar1ControlVehiculo);
			this.jPanelParametrosAuxiliar2ControlVehiculo.setLayout(gridaBagParametrosAuxiliar2ControlVehiculo);
			this.jPanelParametrosAuxiliar3ControlVehiculo.setLayout(gridaBagParametrosAuxiliar3ControlVehiculo);
			this.jPanelParametrosAuxiliar4ControlVehiculo.setLayout(gridaBagParametrosAuxiliar4ControlVehiculo);
			//this.jPanelParametrosAuxiliar5ControlVehiculo.setLayout(gridaBagParametrosAuxiliar2ControlVehiculo);			
			
			
			
			
			this.gridBagConstraintsControlVehiculo = new GridBagConstraints();
			this.gridBagConstraintsControlVehiculo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsControlVehiculo.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsControlVehiculo.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesControlVehiculo.add(this.jButtonRecargarInformacionControlVehiculo, this.gridBagConstraintsControlVehiculo);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsControlVehiculo = new GridBagConstraints();
			this.gridBagConstraintsControlVehiculo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsControlVehiculo.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsControlVehiculo.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ControlVehiculo.add(this.jComboBoxTiposPaginacionControlVehiculo, this.gridBagConstraintsControlVehiculo);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsControlVehiculo = new GridBagConstraints();
			this.gridBagConstraintsControlVehiculo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsControlVehiculo.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsControlVehiculo.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ControlVehiculo.add(this.jCheckBoxConAltoMaximoTablaControlVehiculo, this.gridBagConstraintsControlVehiculo);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsControlVehiculo = new GridBagConstraints();
			this.gridBagConstraintsControlVehiculo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsControlVehiculo.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsControlVehiculo.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ControlVehiculo.add(this.jComboBoxTiposArchivosReportesControlVehiculo, this.gridBagConstraintsControlVehiculo);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsControlVehiculo = new GridBagConstraints();
			this.gridBagConstraintsControlVehiculo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsControlVehiculo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsControlVehiculo.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesControlVehiculo.add(this.jPanelParametrosAuxiliar1ControlVehiculo, this.gridBagConstraintsControlVehiculo);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsControlVehiculo = new GridBagConstraints();
			this.gridBagConstraintsControlVehiculo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsControlVehiculo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsControlVehiculo.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsControlVehiculo.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4ControlVehiculo.add(this.jComboBoxTiposReportesControlVehiculo, this.gridBagConstraintsControlVehiculo);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsControlVehiculo = new GridBagConstraints();
			this.gridBagConstraintsControlVehiculo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsControlVehiculo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsControlVehiculo.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesControlVehiculo.add(this.jPanelParametrosAuxiliar4ControlVehiculo, this.gridBagConstraintsControlVehiculo);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsControlVehiculo = new GridBagConstraints();
			this.gridBagConstraintsControlVehiculo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsControlVehiculo.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsControlVehiculo.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesControlVehiculo.add(this.jComboBoxTiposReportesControlVehiculo, this.gridBagConstraintsControlVehiculo);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsControlVehiculo = new GridBagConstraints();
			this.gridBagConstraintsControlVehiculo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsControlVehiculo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsControlVehiculo.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesControlVehiculo.add(this.jCheckBoxGenerarReporteControlVehiculo, this.gridBagConstraintsControlVehiculo);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsControlVehiculo = new GridBagConstraints();
			this.gridBagConstraintsControlVehiculo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsControlVehiculo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsControlVehiculo.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesControlVehiculo.add(this.jPanelParametrosAuxiliar2ControlVehiculo, this.gridBagConstraintsControlVehiculo);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsControlVehiculo = new GridBagConstraints();
			this.gridBagConstraintsControlVehiculo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsControlVehiculo.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsControlVehiculo.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesControlVehiculo.add(this.jLabelAccionesControlVehiculo, this.gridBagConstraintsControlVehiculo);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsControlVehiculo = new GridBagConstraints();
				this.gridBagConstraintsControlVehiculo.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsControlVehiculo.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsControlVehiculo.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesControlVehiculo.add(this.jButtonAbrirOrderByControlVehiculo, this.gridBagConstraintsControlVehiculo);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsControlVehiculo = new GridBagConstraints();
			this.gridBagConstraintsControlVehiculo.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsControlVehiculo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsControlVehiculo.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesControlVehiculo.add(this.jComboBoxTiposSeleccionarControlVehiculo, this.gridBagConstraintsControlVehiculo);			
			
			
			/*
			this.gridBagConstraintsControlVehiculo = new GridBagConstraints();
			this.gridBagConstraintsControlVehiculo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsControlVehiculo.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsControlVehiculo.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesControlVehiculo.add(this.jCheckBoxSeleccionarTodosControlVehiculo, this.gridBagConstraintsControlVehiculo);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsControlVehiculo = new GridBagConstraints();
			this.gridBagConstraintsControlVehiculo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsControlVehiculo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsControlVehiculo.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsControlVehiculo.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ControlVehiculo.add(this.jCheckBoxSeleccionarTodosControlVehiculo, this.gridBagConstraintsControlVehiculo);															
				
			this.gridBagConstraintsControlVehiculo = new GridBagConstraints();
			this.gridBagConstraintsControlVehiculo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsControlVehiculo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsControlVehiculo.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsControlVehiculo.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ControlVehiculo.add(this.jCheckBoxSeleccionadosControlVehiculo, this.gridBagConstraintsControlVehiculo);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsControlVehiculo = new GridBagConstraints();
			this.gridBagConstraintsControlVehiculo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsControlVehiculo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsControlVehiculo.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesControlVehiculo.add(this.jPanelParametrosAuxiliar3ControlVehiculo, this.gridBagConstraintsControlVehiculo);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsControlVehiculo = new GridBagConstraints();
			this.gridBagConstraintsControlVehiculo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsControlVehiculo.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesControlVehiculo.add(this.jComboBoxTiposAccionesControlVehiculo, this.gridBagConstraintsControlVehiculo);
	
				
			this.gridBagConstraintsControlVehiculo = new GridBagConstraints();
			this.gridBagConstraintsControlVehiculo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsControlVehiculo.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesControlVehiculo.add(this.jTextFieldValorCampoGeneralControlVehiculo, this.gridBagConstraintsControlVehiculo);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosControlVehiculo = new GridBagLayout();

			this.jScrollPanelDatosControlVehiculo.setLayout(gridaBagLayoutDatosControlVehiculo);
			
			this.gridBagConstraintsControlVehiculo = new GridBagConstraints();
			this.gridBagConstraintsControlVehiculo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsControlVehiculo.gridy = 0;
			this.gridBagConstraintsControlVehiculo.gridx = 0;
			
			this.jScrollPanelDatosControlVehiculo.add(this.jTableDatosControlVehiculo, this.gridBagConstraintsControlVehiculo);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosControlVehiculo.setViewportView(this.jTableDatosControlVehiculo);
		this.jTableDatosControlVehiculo.setFillsViewportHeight(true);
		this.jTableDatosControlVehiculo.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesControlVehiculo= new GridBagLayout();
		this.jPanelAccionesControlVehiculo.setLayout(gridaBagLayoutAccionesControlVehiculo);
		
		
		/*	
		this.gridBagConstraintsControlVehiculo = new GridBagConstraints();
		this.gridBagConstraintsControlVehiculo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsControlVehiculo.gridy = 0;
		this.gridBagConstraintsControlVehiculo.gridx = 0;
			
		this.jPanelAccionesControlVehiculo.add(this.jButtonNuevoControlVehiculo, this.gridBagConstraintsControlVehiculo);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaPorFechaEntradaControlVehiculo= new GridBagLayout();
		gridaBagLayoutBusquedaPorFechaEntradaControlVehiculo.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorFechaEntradaControlVehiculo.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorFechaEntradaControlVehiculo.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorFechaEntradaControlVehiculo.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorFechaEntradaControlVehiculo.setLayout(gridaBagLayoutBusquedaPorFechaEntradaControlVehiculo);

		gridBagConstraintsControlVehiculo = new GridBagConstraints();
		gridBagConstraintsControlVehiculo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsControlVehiculo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsControlVehiculo.gridy = 0;
		gridBagConstraintsControlVehiculo.gridx = 0;
		jPanelBusquedaPorFechaEntradaControlVehiculo.add(jLabelfecha_entradaBusquedaPorFechaEntradaControlVehiculo, gridBagConstraintsControlVehiculo);

		gridBagConstraintsControlVehiculo = new GridBagConstraints();
		gridBagConstraintsControlVehiculo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsControlVehiculo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsControlVehiculo.gridy = 0;
		gridBagConstraintsControlVehiculo.gridx = 1;
		jPanelBusquedaPorFechaEntradaControlVehiculo.add(jDateChooserfecha_entradaBusquedaPorFechaEntradaControlVehiculo, gridBagConstraintsControlVehiculo);

		gridBagConstraintsControlVehiculo = new GridBagConstraints();
		gridBagConstraintsControlVehiculo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsControlVehiculo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsControlVehiculo.gridy = 1;
		gridBagConstraintsControlVehiculo.gridx =1;
		jPanelBusquedaPorFechaEntradaControlVehiculo.add(jButtonBusquedaPorFechaEntradaControlVehiculo, gridBagConstraintsControlVehiculo);

		jTabbedPaneBusquedasControlVehiculo.addTab("1.-Por Fecha Entrada ", jPanelBusquedaPorFechaEntradaControlVehiculo);
		jTabbedPaneBusquedasControlVehiculo.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutBusquedaPorFechaSalidaControlVehiculo= new GridBagLayout();
		gridaBagLayoutBusquedaPorFechaSalidaControlVehiculo.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorFechaSalidaControlVehiculo.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorFechaSalidaControlVehiculo.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorFechaSalidaControlVehiculo.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorFechaSalidaControlVehiculo.setLayout(gridaBagLayoutBusquedaPorFechaSalidaControlVehiculo);

		gridBagConstraintsControlVehiculo = new GridBagConstraints();
		gridBagConstraintsControlVehiculo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsControlVehiculo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsControlVehiculo.gridy = 0;
		gridBagConstraintsControlVehiculo.gridx = 0;
		jPanelBusquedaPorFechaSalidaControlVehiculo.add(jLabelfecha_salidaBusquedaPorFechaSalidaControlVehiculo, gridBagConstraintsControlVehiculo);

		gridBagConstraintsControlVehiculo = new GridBagConstraints();
		gridBagConstraintsControlVehiculo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsControlVehiculo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsControlVehiculo.gridy = 0;
		gridBagConstraintsControlVehiculo.gridx = 1;
		jPanelBusquedaPorFechaSalidaControlVehiculo.add(jDateChooserfecha_salidaBusquedaPorFechaSalidaControlVehiculo, gridBagConstraintsControlVehiculo);

		gridBagConstraintsControlVehiculo = new GridBagConstraints();
		gridBagConstraintsControlVehiculo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsControlVehiculo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsControlVehiculo.gridy = 1;
		gridBagConstraintsControlVehiculo.gridx =1;
		jPanelBusquedaPorFechaSalidaControlVehiculo.add(jButtonBusquedaPorFechaSalidaControlVehiculo, gridBagConstraintsControlVehiculo);

		jTabbedPaneBusquedasControlVehiculo.addTab("2.-Por Fecha Salida ", jPanelBusquedaPorFechaSalidaControlVehiculo);
		jTabbedPaneBusquedasControlVehiculo.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutBusquedaPorNombreConductorControlVehiculo= new GridBagLayout();
		gridaBagLayoutBusquedaPorNombreConductorControlVehiculo.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorNombreConductorControlVehiculo.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorNombreConductorControlVehiculo.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorNombreConductorControlVehiculo.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorNombreConductorControlVehiculo.setLayout(gridaBagLayoutBusquedaPorNombreConductorControlVehiculo);

		gridBagConstraintsControlVehiculo = new GridBagConstraints();
		gridBagConstraintsControlVehiculo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsControlVehiculo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsControlVehiculo.gridy = 0;
		gridBagConstraintsControlVehiculo.gridx = 0;
		jPanelBusquedaPorNombreConductorControlVehiculo.add(jLabelnombre_conductorBusquedaPorNombreConductorControlVehiculo, gridBagConstraintsControlVehiculo);

		gridBagConstraintsControlVehiculo = new GridBagConstraints();
		gridBagConstraintsControlVehiculo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsControlVehiculo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsControlVehiculo.gridy = 0;
		gridBagConstraintsControlVehiculo.gridx = 1;
		jPanelBusquedaPorNombreConductorControlVehiculo.add(jTextAreanombre_conductorBusquedaPorNombreConductorControlVehiculo, gridBagConstraintsControlVehiculo);

		gridBagConstraintsControlVehiculo = new GridBagConstraints();
		gridBagConstraintsControlVehiculo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsControlVehiculo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsControlVehiculo.gridy = 1;
		gridBagConstraintsControlVehiculo.gridx =1;
		jPanelBusquedaPorNombreConductorControlVehiculo.add(jButtonBusquedaPorNombreConductorControlVehiculo, gridBagConstraintsControlVehiculo);

		jTabbedPaneBusquedasControlVehiculo.addTab("3.-Por Nombre Conductor ", jPanelBusquedaPorNombreConductorControlVehiculo);
		jTabbedPaneBusquedasControlVehiculo.setMnemonicAt(2, KeyEvent.VK_3);

		GridBagLayout gridaBagLayoutBusquedaPorNumeroPlacaControlVehiculo= new GridBagLayout();
		gridaBagLayoutBusquedaPorNumeroPlacaControlVehiculo.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorNumeroPlacaControlVehiculo.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorNumeroPlacaControlVehiculo.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorNumeroPlacaControlVehiculo.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorNumeroPlacaControlVehiculo.setLayout(gridaBagLayoutBusquedaPorNumeroPlacaControlVehiculo);

		gridBagConstraintsControlVehiculo = new GridBagConstraints();
		gridBagConstraintsControlVehiculo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsControlVehiculo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsControlVehiculo.gridy = 0;
		gridBagConstraintsControlVehiculo.gridx = 0;
		jPanelBusquedaPorNumeroPlacaControlVehiculo.add(jLabelnumero_placaBusquedaPorNumeroPlacaControlVehiculo, gridBagConstraintsControlVehiculo);

		gridBagConstraintsControlVehiculo = new GridBagConstraints();
		gridBagConstraintsControlVehiculo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsControlVehiculo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsControlVehiculo.gridy = 0;
		gridBagConstraintsControlVehiculo.gridx = 1;
		jPanelBusquedaPorNumeroPlacaControlVehiculo.add(jTextAreanumero_placaBusquedaPorNumeroPlacaControlVehiculo, gridBagConstraintsControlVehiculo);

		gridBagConstraintsControlVehiculo = new GridBagConstraints();
		gridBagConstraintsControlVehiculo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsControlVehiculo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsControlVehiculo.gridy = 1;
		gridBagConstraintsControlVehiculo.gridx =1;
		jPanelBusquedaPorNumeroPlacaControlVehiculo.add(jButtonBusquedaPorNumeroPlacaControlVehiculo, gridBagConstraintsControlVehiculo);

		jTabbedPaneBusquedasControlVehiculo.addTab("4.-Por Numero_placa ", jPanelBusquedaPorNumeroPlacaControlVehiculo);
		jTabbedPaneBusquedasControlVehiculo.setMnemonicAt(3, KeyEvent.VK_4);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutControlVehiculo = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutControlVehiculo);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.controlvehiculoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsControlVehiculo = new GridBagConstraints();						
			this.gridBagConstraintsControlVehiculo.gridy = iGridyPrincipal++;
			this.gridBagConstraintsControlVehiculo.gridx = 0;		
			//this.gridBagConstraintsControlVehiculo.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsControlVehiculo.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsControlVehiculo.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarControlVehiculo, this.gridBagConstraintsControlVehiculo);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsControlVehiculo = new GridBagConstraints();
		this.gridBagConstraintsControlVehiculo.gridy = iGridyPrincipal++;
		this.gridBagConstraintsControlVehiculo.gridx = 0;		
		//this.gridBagConstraintsControlVehiculo.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsControlVehiculo.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsControlVehiculo.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsControlVehiculo);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsControlVehiculo = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsControlVehiculo.gridy = iGridyPrincipal++;
			this.gridBagConstraintsControlVehiculo.gridx = 0;		
			this.gridBagConstraintsControlVehiculo.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsControlVehiculo.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsControlVehiculo.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasControlVehiculo, this.gridBagConstraintsControlVehiculo);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsControlVehiculo = new GridBagConstraints();
		this.gridBagConstraintsControlVehiculo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsControlVehiculo.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesControlVehiculo, this.gridBagConstraintsControlVehiculo);								
		
		
		/*
		this.gridBagConstraintsControlVehiculo = new GridBagConstraints();
		this.gridBagConstraintsControlVehiculo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsControlVehiculo.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesControlVehiculo, this.gridBagConstraintsControlVehiculo);
		*/		
		
		this.gridBagConstraintsControlVehiculo = new GridBagConstraints();
		this.gridBagConstraintsControlVehiculo.gridy =iGridyPrincipal++;
		this.gridBagConstraintsControlVehiculo.gridx =0;
		this.gridBagConstraintsControlVehiculo.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsControlVehiculo.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosControlVehiculo, this.gridBagConstraintsControlVehiculo);
				
		
		this.gridBagConstraintsControlVehiculo = new GridBagConstraints();
		this.gridBagConstraintsControlVehiculo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsControlVehiculo.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionControlVehiculo, this.gridBagConstraintsControlVehiculo);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(ControlVehiculoJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosControlVehiculo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosControlVehiculo = new GridBagLayout();
			this.jPanelBusquedasParametrosControlVehiculo.setLayout(gridaBagLayoutBusquedasParametrosControlVehiculo);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralControlVehiculo=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralControlVehiculo.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralControlVehiculo.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralControlVehiculo.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsControlVehiculo = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsControlVehiculo = new GridBagConstraints();
		this.gridBagConstraintsControlVehiculo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsControlVehiculo.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposControlVehiculo, this.gridBagConstraintsControlVehiculo);
			
			
		this.gridBagConstraintsControlVehiculo = new GridBagConstraints();
		this.gridBagConstraintsControlVehiculo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsControlVehiculo.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosControlVehiculo, this.gridBagConstraintsControlVehiculo);
		
			
		this.gridBagConstraintsControlVehiculo = new GridBagConstraints();
		this.gridBagConstraintsControlVehiculo.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsControlVehiculo.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesControlVehiculo, this.gridBagConstraintsControlVehiculo);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralControlVehiculo;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoControlVehiculo() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoControlVehiculo = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoControlVehiculo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoControlVehiculo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoControlVehiculo.setName("jPanelReporteDinamicoControlVehiculo"); 
		
		this.jPanelReporteDinamicoControlVehiculo.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoControlVehiculo.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoControlVehiculo.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoControlVehiculo.setLayout(gridaBagLayoutReporteDinamicoControlVehiculo);
		
		
		this.jInternalFrameReporteDinamicoControlVehiculo= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoControlVehiculo = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteControlVehiculo= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoControlVehiculo.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoControlVehiculo.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoControlVehiculo.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoControlVehiculo.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoControlVehiculo.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoControlVehiculo.setResizable(true);
	    this.jInternalFrameReporteDinamicoControlVehiculo.setClosable(true);
	    this.jInternalFrameReporteDinamicoControlVehiculo.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoControlVehiculo.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoControlVehiculo.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoControlVehiculo.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoControlVehiculo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Control Vehiculoes"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteControlVehiculo = new JLabelMe();

		this.jLabelColumnasSelectReporteControlVehiculo.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteControlVehiculo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteControlVehiculo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteControlVehiculo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsControlVehiculo = new GridBagConstraints();
		this.gridBagConstraintsControlVehiculo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsControlVehiculo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsControlVehiculo.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoControlVehiculo.add(this.jLabelColumnasSelectReporteControlVehiculo, this.gridBagConstraintsControlVehiculo);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteControlVehiculo = new JList<Reporte>();
		this.jListColumnasSelectReporteControlVehiculo.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteControlVehiculo.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteControlVehiculo.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteControlVehiculo.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteControlVehiculo.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteControlVehiculo=new JScrollPane(this.jListColumnasSelectReporteControlVehiculo);
			
			this.jScrollColumnasSelectReporteControlVehiculo.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteControlVehiculo.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteControlVehiculo.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteControlVehiculo.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsControlVehiculo = new GridBagConstraints();
		this.gridBagConstraintsControlVehiculo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsControlVehiculo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsControlVehiculo.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoControlVehiculo.add(this.jListColumnasSelectReporteControlVehiculo, this.gridBagConstraintsControlVehiculo);
		this.jPanelReporteDinamicoControlVehiculo.add(this.jScrollColumnasSelectReporteControlVehiculo, this.gridBagConstraintsControlVehiculo);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteControlVehiculo = new JLabelMe();

		this.jLabelRelacionesSelectReporteControlVehiculo.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteControlVehiculo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteControlVehiculo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteControlVehiculo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteControlVehiculo = new JList<Reporte>();
		this.jListRelacionesSelectReporteControlVehiculo.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteControlVehiculo.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteControlVehiculo.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteControlVehiculo.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteControlVehiculo.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteControlVehiculo=new JScrollPane(this.jListRelacionesSelectReporteControlVehiculo);
			
			this.jScrollRelacionesSelectReporteControlVehiculo.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteControlVehiculo.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteControlVehiculo.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteControlVehiculo.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoControlVehiculo = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoControlVehiculo = new JComboBoxMe();
		this.jListColumnasValoresGraficoControlVehiculo = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoControlVehiculo = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoControlVehiculo.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoControlVehiculo.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoControlVehiculo.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoControlVehiculo.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoControlVehiculo, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoControlVehiculo = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoControlVehiculo.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoControlVehiculo.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoControlVehiculo.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoControlVehiculo.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoControlVehiculo, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoControlVehiculo = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoControlVehiculo.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoControlVehiculo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoControlVehiculo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoControlVehiculo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsControlVehiculo = new GridBagConstraints();
		this.gridBagConstraintsControlVehiculo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsControlVehiculo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsControlVehiculo.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoControlVehiculo.add(this.jLabelGenerarExcelReporteDinamicoControlVehiculo, this.gridBagConstraintsControlVehiculo);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoControlVehiculo = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoControlVehiculo.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoControlVehiculo,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoControlVehiculo.setToolTipText("Generar EXCEL"+" "+ControlVehiculoConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsControlVehiculo = new GridBagConstraints();
		//this.gridBagConstraintsControlVehiculo.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsControlVehiculo.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsControlVehiculo.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoControlVehiculo.add(this.jButtonGenerarExcelReporteDinamicoControlVehiculo, this.gridBagConstraintsControlVehiculo);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsControlVehiculo = new GridBagConstraints();
		this.gridBagConstraintsControlVehiculo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsControlVehiculo.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsControlVehiculo.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoControlVehiculo.add(this.jComboBoxTiposReportesDinamicoControlVehiculo, this.gridBagConstraintsControlVehiculo);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoControlVehiculo = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoControlVehiculo.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoControlVehiculo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoControlVehiculo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoControlVehiculo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsControlVehiculo = new GridBagConstraints();
		this.gridBagConstraintsControlVehiculo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsControlVehiculo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsControlVehiculo.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoControlVehiculo.add(this.jLabelTiposArchivoReporteDinamicoControlVehiculo, this.gridBagConstraintsControlVehiculo);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsControlVehiculo = new GridBagConstraints();
		this.gridBagConstraintsControlVehiculo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsControlVehiculo.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsControlVehiculo.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoControlVehiculo.add(this.jComboBoxTiposArchivosReportesDinamicoControlVehiculo, this.gridBagConstraintsControlVehiculo);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoControlVehiculo = new JButtonMe();
		this.jButtonGenerarReporteDinamicoControlVehiculo.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoControlVehiculo,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoControlVehiculo.setToolTipText("Generar"+" "+ControlVehiculoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsControlVehiculo = new GridBagConstraints();
		this.gridBagConstraintsControlVehiculo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsControlVehiculo.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsControlVehiculo.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoControlVehiculo.add(this.jButtonGenerarReporteDinamicoControlVehiculo, this.gridBagConstraintsControlVehiculo);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoControlVehiculo = new JButtonMe();
		this.jButtonCerrarReporteDinamicoControlVehiculo.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoControlVehiculo,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoControlVehiculo.setToolTipText("Cancelar"+" "+ControlVehiculoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsControlVehiculo = new GridBagConstraints();
		this.gridBagConstraintsControlVehiculo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsControlVehiculo.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsControlVehiculo.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoControlVehiculo.add(this.jButtonCerrarReporteDinamicoControlVehiculo, this.gridBagConstraintsControlVehiculo);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalControlVehiculo = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoControlVehiculo= new JScrollPane(jPanelReporteDinamicoControlVehiculo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoControlVehiculo.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoControlVehiculo.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoControlVehiculo.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoControlVehiculo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Control Vehiculoes"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsControlVehiculo = new GridBagConstraints();
		this.gridBagConstraintsControlVehiculo.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsControlVehiculo.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsControlVehiculo.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoControlVehiculo.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoControlVehiculo.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalControlVehiculo);
		this.jInternalFrameReporteDinamicoControlVehiculo.getContentPane().add(this.jScrollPanelReporteDinamicoControlVehiculo, this.gridBagConstraintsControlVehiculo);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionControlVehiculo() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionControlVehiculo = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionControlVehiculo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionControlVehiculo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionControlVehiculo.setName("jPanelImportacionControlVehiculo"); 
		
		this.jPanelImportacionControlVehiculo.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionControlVehiculo.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionControlVehiculo.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionControlVehiculo.setLayout(gridaBagLayoutImportacionControlVehiculo);
		
		
		this.jInternalFrameImportacionControlVehiculo= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionControlVehiculo= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionControlVehiculo = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteControlVehiculo= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionControlVehiculo.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionControlVehiculo.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionControlVehiculo.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionControlVehiculo.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionControlVehiculo.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionControlVehiculo.setResizable(true);
	    this.jInternalFrameImportacionControlVehiculo.setClosable(true);
	    this.jInternalFrameImportacionControlVehiculo.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionControlVehiculo.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionControlVehiculo.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionControlVehiculo.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionControlVehiculo.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionControlVehiculo.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionControlVehiculo.setResizable(true);
	    this.jInternalFrameImportacionControlVehiculo.setClosable(true);
	    this.jInternalFrameImportacionControlVehiculo.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionControlVehiculo.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionControlVehiculo.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionControlVehiculo.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionControlVehiculo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Control Vehiculoes"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionControlVehiculo = new JLabelMe();

		this.jLabelArchivoImportacionControlVehiculo.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionControlVehiculo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionControlVehiculo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionControlVehiculo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsControlVehiculo = new GridBagConstraints();
		this.gridBagConstraintsControlVehiculo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsControlVehiculo.gridy = iPosYImportacion;		
		this.gridBagConstraintsControlVehiculo.gridx = iPosXImportacion++;
			
		this.jPanelImportacionControlVehiculo.add(this.jLabelArchivoImportacionControlVehiculo, this.gridBagConstraintsControlVehiculo);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionControlVehiculo = new JFileChooser();		
		this.jFileChooserImportacionControlVehiculo.setToolTipText("ESCOGER ARCHIVO"+" "+ControlVehiculoConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionControlVehiculo = new JButtonMe();
		this.jButtonAbrirImportacionControlVehiculo.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionControlVehiculo,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionControlVehiculo.setToolTipText("Generar"+" "+ControlVehiculoConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsControlVehiculo = new GridBagConstraints();
		this.gridBagConstraintsControlVehiculo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsControlVehiculo.gridy = iPosYImportacion;
		this.gridBagConstraintsControlVehiculo.gridx = iPosXImportacion++;
							
		this.jPanelImportacionControlVehiculo.add(this.jButtonAbrirImportacionControlVehiculo, this.gridBagConstraintsControlVehiculo);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionControlVehiculo = new JLabelMe();

		this.jLabelPathArchivoImportacionControlVehiculo.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionControlVehiculo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionControlVehiculo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionControlVehiculo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsControlVehiculo = new GridBagConstraints();
		this.gridBagConstraintsControlVehiculo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsControlVehiculo.gridy = iPosYImportacion;		
		this.gridBagConstraintsControlVehiculo.gridx = iPosXImportacion++;
			
		this.jPanelImportacionControlVehiculo.add(this.jLabelPathArchivoImportacionControlVehiculo, this.gridBagConstraintsControlVehiculo);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionControlVehiculo=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionControlVehiculo.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionControlVehiculo.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionControlVehiculo.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsControlVehiculo = new GridBagConstraints();
		this.gridBagConstraintsControlVehiculo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsControlVehiculo.gridy = iPosYImportacion;
		this.gridBagConstraintsControlVehiculo.gridx = iPosXImportacion++;
							
		this.jPanelImportacionControlVehiculo.add(this.jTextFieldPathArchivoImportacionControlVehiculo, this.gridBagConstraintsControlVehiculo);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionControlVehiculo = new JButtonMe();
		this.jButtonGenerarImportacionControlVehiculo.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionControlVehiculo,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionControlVehiculo.setToolTipText("Generar"+" "+ControlVehiculoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsControlVehiculo = new GridBagConstraints();
		this.gridBagConstraintsControlVehiculo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsControlVehiculo.gridy = iPosYImportacion;
		this.gridBagConstraintsControlVehiculo.gridx = iPosXImportacion++;
							
		this.jPanelImportacionControlVehiculo.add(this.jButtonGenerarImportacionControlVehiculo, this.gridBagConstraintsControlVehiculo);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionControlVehiculo = new JButtonMe();
		this.jButtonCerrarImportacionControlVehiculo.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionControlVehiculo,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionControlVehiculo.setToolTipText("Cancelar"+" "+ControlVehiculoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsControlVehiculo = new GridBagConstraints();
		this.gridBagConstraintsControlVehiculo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsControlVehiculo.gridy = iPosYImportacion;
		this.gridBagConstraintsControlVehiculo.gridx = iPosXImportacion++;
							
		this.jPanelImportacionControlVehiculo.add(this.jButtonCerrarImportacionControlVehiculo, this.gridBagConstraintsControlVehiculo);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalControlVehiculo = new GridBagLayout();
		
		this.jScrollPanelImportacionControlVehiculo= new JScrollPane(jPanelImportacionControlVehiculo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsControlVehiculo = new GridBagConstraints();
		this.gridBagConstraintsControlVehiculo.gridy =iPosYImportacion;
		this.gridBagConstraintsControlVehiculo.gridx =iPosXImportacion;
		this.gridBagConstraintsControlVehiculo.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionControlVehiculo.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionControlVehiculo.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalControlVehiculo);
		this.jInternalFrameImportacionControlVehiculo.getContentPane().add(this.jScrollPanelImportacionControlVehiculo, this.gridBagConstraintsControlVehiculo);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByControlVehiculo(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByControlVehiculo = new JButtonMe();
			this.jButtonAbrirOrderByControlVehiculo.setText("Orden");
			this.jButtonAbrirOrderByControlVehiculo.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByControlVehiculo,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByControlVehiculo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByControlVehiculo";
			inputMap = this.jButtonAbrirOrderByControlVehiculo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByControlVehiculo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByControlVehiculo"));
		
		
			GridBagLayout gridaBagLayoutOrderByControlVehiculo = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByControlVehiculo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByControlVehiculo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByControlVehiculo.setName("jPanelOrderByControlVehiculo"); 
			
			this.jPanelOrderByControlVehiculo.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByControlVehiculo.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByControlVehiculo.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByControlVehiculo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByControlVehiculo.setLayout(gridaBagLayoutOrderByControlVehiculo);
			
			
			this.jTableDatosControlVehiculoOrderBy = new JTableMe();        
			this.jTableDatosControlVehiculoOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosControlVehiculoOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosControlVehiculoOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosControlVehiculoOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosControlVehiculoOrderBy.setViewportView(this.jTableDatosControlVehiculoOrderBy);
			this.jTableDatosControlVehiculoOrderBy.setFillsViewportHeight(true);
			this.jTableDatosControlVehiculoOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByControlVehiculo= new OrderByJInternalFrame();
			this.jInternalFrameOrderByControlVehiculo= new OrderByJInternalFrame();
			this.jScrollPanelOrderByControlVehiculo = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteControlVehiculo= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByControlVehiculo.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByControlVehiculo.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByControlVehiculo.setTitle("Orden");
			this.jInternalFrameOrderByControlVehiculo.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByControlVehiculo.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByControlVehiculo.setResizable(true);
			this.jInternalFrameOrderByControlVehiculo.setClosable(true);
			this.jInternalFrameOrderByControlVehiculo.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByControlVehiculo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByControlVehiculo.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByControlVehiculo.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByControlVehiculo.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByControlVehiculo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByControlVehiculo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Control Vehiculoes"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsControlVehiculo = new GridBagConstraints();
			this.gridBagConstraintsControlVehiculo.gridy =iPosYOrderBy++;
			this.gridBagConstraintsControlVehiculo.gridx =iPosXOrderBy;
			this.gridBagConstraintsControlVehiculo.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsControlVehiculo.ipady =150;
				
			this.jPanelOrderByControlVehiculo.add(jScrollPanelDatosControlVehiculoOrderBy, this.gridBagConstraintsControlVehiculo);//this.jTableDatosControlVehiculoTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByControlVehiculo = new JButtonMe();
			this.jButtonCerrarOrderByControlVehiculo.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByControlVehiculo,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByControlVehiculo.setToolTipText("Cancelar"+" "+ControlVehiculoConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByControlVehiculo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsControlVehiculo = new GridBagConstraints();
			this.gridBagConstraintsControlVehiculo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsControlVehiculo.gridy = iPosYOrderBy++;
			this.gridBagConstraintsControlVehiculo.gridx = iPosXOrderBy;
									
			this.jPanelOrderByControlVehiculo.add(this.jButtonCerrarOrderByControlVehiculo, this.gridBagConstraintsControlVehiculo);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalControlVehiculo = new GridBagLayout();
			
			this.jScrollPanelOrderByControlVehiculo= new JScrollPane(jPanelOrderByControlVehiculo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsControlVehiculo = new GridBagConstraints();
			this.gridBagConstraintsControlVehiculo.gridy =iPosYOrderBy;
			this.gridBagConstraintsControlVehiculo.gridx =iPosXOrderBy;
			this.gridBagConstraintsControlVehiculo.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByControlVehiculo.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByControlVehiculo.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalControlVehiculo);
			
			this.jInternalFrameOrderByControlVehiculo.getContentPane().add(this.jScrollPanelOrderByControlVehiculo, this.gridBagConstraintsControlVehiculo);			
		
		} else {
			this.jButtonAbrirOrderByControlVehiculo = new JButtonMe();
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
		int iWidthTableCalculado=0;//1230
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=630;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=600;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.controlvehiculoSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosControlVehiculo.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosControlVehiculo.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosControlVehiculo.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosControlVehiculo.getRowHeight();//ControlVehiculoConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.controlvehiculoSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > ControlVehiculoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaControlVehiculo.isSelected()) {
					iHeightTable=ControlVehiculoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ControlVehiculoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ControlVehiculoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > ControlVehiculoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaControlVehiculo.isSelected()) {
					iHeightTable=ControlVehiculoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ControlVehiculoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ControlVehiculoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosControlVehiculo.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosControlVehiculo.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosControlVehiculo.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosControlVehiculo.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosControlVehiculo.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosControlVehiculo.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByControlVehiculo!=null && this.jInternalFrameOrderByControlVehiculo.getjTableDatosOrderBy()!=null) {
			//if(!this.controlvehiculoSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByControlVehiculo.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByControlVehiculo.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByControlVehiculo.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByControlVehiculo.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByControlVehiculo.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByControlVehiculo.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByControlVehiculo.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosControlVehiculo.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosControlVehiculo.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosControlVehiculo.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=controlvehiculoLogic.getControlVehiculos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=controlvehiculos.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<ControlVehiculo> TraerControlVehiculoBeans(List<ControlVehiculo> controlvehiculos,ArrayList<Classe> classes)throws Exception {
		try {
			for(ControlVehiculo controlvehiculo:controlvehiculos) {
					
				if(!(ControlVehiculoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || ControlVehiculoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					controlvehiculo.setsDetalleGeneralEntityReporte(ControlVehiculoConstantesFunciones.getControlVehiculoDescripcion(controlvehiculo));
										
						
					
						
					
				} else  {
							
					//controlvehiculo.setsDetalleGeneralEntityReporte(controlvehiculo.getsDetalleGeneralEntityReporte());
										
				}
				
				//controlvehiculobeans.add(controlvehiculobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return controlvehiculos;
    }
	//PARA REPORTES FIN
}
