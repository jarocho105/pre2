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
import com.bydan.erp.cartera.util.VehiculoClienteConstantesFunciones;

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
public class VehiculoClienteJInternalFrame extends VehiculoClienteBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarVehiculoCliente;
	
	protected JMenuBar jmenuBarVehiculoCliente;
	
	protected JMenu jmenuVehiculoCliente;
	protected JMenu jmenuDatosVehiculoCliente;
	protected JMenu jmenuArchivoVehiculoCliente;
	protected JMenu jmenuAccionesVehiculoCliente;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosVehiculoCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutVehiculoCliente;	
	protected GridBagConstraints gridBagConstraintsVehiculoCliente;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public VehiculoClienteDetalleFormJInternalFrame jInternalFrameDetalleFormVehiculoCliente;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoVehiculoCliente;	
	protected ImportacionJInternalFrame jInternalFrameImportacionVehiculoCliente;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cliente="";
	
	public VehiculoClienteSessionBean vehiculoclienteSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public ClienteSessionBean clienteSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<VehiculoCliente> vehiculoclientes;		
	public List<VehiculoCliente> vehiculoclientesEliminados;	
	public List<VehiculoCliente> vehiculoclientesAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByVehiculoCliente;		
	protected JButton jButtonAbrirOrderByVehiculoCliente;
	
	
	//protected JPanel jPanelOrderByVehiculoCliente;
	//public JScrollPane jScrollPanelOrderByVehiculoCliente;	
	//protected JButton jButtonCerrarOrderByVehiculoCliente;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public VehiculoClienteLogic vehiculoclienteLogic;
	
	
	
	public JScrollPane jScrollPanelDatosVehiculoCliente;
	public JScrollPane jScrollPanelDatosEdicionVehiculoCliente;
	public JScrollPane jScrollPanelDatosGeneralVehiculoCliente;
    
	
	
	//public JScrollPane jScrollPanelDatosVehiculoClienteOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoVehiculoCliente;
	//public JScrollPane jScrollPanelImportacionVehiculoCliente;
	
	
	
	protected JPanel jPanelAccionesVehiculoCliente;
	
    protected JPanel jPanelPaginacionVehiculoCliente;
    protected JPanel jPanelParametrosReportesVehiculoCliente;
	protected JPanel jPanelParametrosReportesAccionesVehiculoCliente;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1VehiculoCliente;
	protected JPanel jPanelParametrosAuxiliar2VehiculoCliente;
	protected JPanel jPanelParametrosAuxiliar3VehiculoCliente;
	protected JPanel jPanelParametrosAuxiliar4VehiculoCliente;
	//protected JPanel jPanelParametrosAuxiliar5VehiculoCliente;
	
	
	
	//protected JPanel jPanelReporteDinamicoVehiculoCliente;
	//protected JPanel jPanelImportacionVehiculoCliente;
	
	
	public JTable jTableDatosVehiculoCliente;
	
	
	
	//public JTable jTableDatosVehiculoClienteOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoVehiculoCliente;
	protected JButton jButtonDuplicarVehiculoCliente;
	protected JButton jButtonCopiarVehiculoCliente;
	protected JButton jButtonVerFormVehiculoCliente;
	protected JButton jButtonNuevoRelacionesVehiculoCliente;
	protected JButton jButtonModificarVehiculoCliente;
	
    protected JButton jButtonGuardarCambiosTablaVehiculoCliente;
	protected JButton jButtonCerrarVehiculoCliente;
	
	
	protected JButton jButtonRecargarInformacionVehiculoCliente;
	protected JButton jButtonProcesarInformacionVehiculoCliente;
	
	
	protected JButton jButtonAnterioresVehiculoCliente;
	protected JButton jButtonSiguientesVehiculoCliente;
	protected JButton jButtonNuevoGuardarCambiosVehiculoCliente;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoVehiculoCliente;
	//protected JButton jButtonCerrarReporteDinamicoVehiculoCliente;
	//protected JButton jButtonGenerarExcelReporteDinamicoVehiculoCliente;	
	
	
	
	//protected JButton jButtonAbrirImportacionVehiculoCliente;
	//protected JButton jButtonGenerarImportacionVehiculoCliente;
	//protected JButton jButtonCerrarImportacionVehiculoCliente;
	//protected JFileChooser jFileChooserImportacionVehiculoCliente;
	//protected File fileImportacionVehiculoCliente;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarVehiculoCliente;
	protected JButton jButtonDuplicarToolBarVehiculoCliente;
	protected JButton jButtonNuevoRelacionesToolBarVehiculoCliente;
	
	
	public JButton jButtonGuardarCambiosToolBarVehiculoCliente;
	protected JButton jButtonCopiarToolBarVehiculoCliente;
	protected JButton jButtonVerFormToolBarVehiculoCliente;
	public JButton jButtonGuardarCambiosTablaToolBarVehiculoCliente;
	protected JButton jButtonMostrarOcultarTablaToolBarVehiculoCliente;
	protected JButton jButtonCerrarToolBarVehiculoCliente;
	
	protected JButton jButtonRecargarInformacionToolBarVehiculoCliente;
	protected JButton jButtonProcesarInformacionToolBarVehiculoCliente;
	protected JButton jButtonAnterioresToolBarVehiculoCliente;
	protected JButton jButtonSiguientesToolBarVehiculoCliente;
	protected JButton jButtonNuevoGuardarCambiosToolBarVehiculoCliente;
	protected JButton jButtonAbrirOrderByToolBarVehiculoCliente;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoVehiculoCliente;
	protected JMenuItem jMenuItemDuplicarVehiculoCliente;
	protected JMenuItem jMenuItemNuevoRelacionesVehiculoCliente;
	
	
	protected JMenuItem jMenuItemGuardarCambiosVehiculoCliente;
	protected JMenuItem jMenuItemCopiarVehiculoCliente;
	protected JMenuItem jMenuItemVerFormVehiculoCliente;
	protected JMenuItem jMenuItemGuardarCambiosTablaVehiculoCliente;
	protected JMenuItem jMenuItemCerrarVehiculoCliente;
	protected JMenuItem jMenuItemDetalleCerrarVehiculoCliente;
	protected JMenuItem jMenuItemDetalleAbrirOrderByVehiculoCliente;
	protected JMenuItem jMenuItemDetalleMostarOcultarVehiculoCliente;
	
	protected JMenuItem jMenuItemRecargarInformacionVehiculoCliente;
	protected JMenuItem jMenuItemProcesarInformacionVehiculoCliente;
	protected JMenuItem jMenuItemAnterioresVehiculoCliente;
	protected JMenuItem jMenuItemSiguientesVehiculoCliente;
	protected JMenuItem jMenuItemNuevoGuardarCambiosVehiculoCliente;
	protected JMenuItem jMenuItemAbrirOrderByVehiculoCliente;
	protected JMenuItem jMenuItemMostrarOcultarVehiculoCliente;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesVehiculoCliente;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosVehiculoCliente;
	protected JCheckBox jCheckBoxSeleccionadosVehiculoCliente;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaVehiculoCliente;
	protected JCheckBox jCheckBoxConGraficoReporteVehiculoCliente;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesVehiculoCliente;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesVehiculoCliente;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoVehiculoCliente;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoVehiculoCliente;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesVehiculoCliente;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionVehiculoCliente;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesVehiculoCliente;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesVehiculoCliente;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarVehiculoCliente;
	protected JTextField jTextFieldValorCampoGeneralVehiculoCliente;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteVehiculoCliente;
	//public JList<Reporte> jListColumnasSelectReporteVehiculoCliente;
	//public JScrollPane jScrollColumnasSelectReporteVehiculoCliente;
	
	//public JLabel jLabelRelacionesSelectReporteVehiculoCliente;
	//public JList<Reporte> jListRelacionesSelectReporteVehiculoCliente;
	//public JScrollPane jScrollRelacionesSelectReporteVehiculoCliente;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoVehiculoCliente;
	//protected JCheckBox jCheckBoxConGraficoDinamicoVehiculoCliente;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoVehiculoCliente;
	//public JLabel jLabelTiposArchivoReporteDinamicoVehiculoCliente;
	
		
	//public JLabel jLabelArchivoImportacionVehiculoCliente;	
	//public JLabel jLabelPathArchivoImportacionVehiculoCliente;
	//protected JTextField jTextFieldPathArchivoImportacionVehiculoCliente;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoVehiculoCliente;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoVehiculoCliente;
	
	//public JLabel jLabelColumnaCategoriaValorVehiculoCliente;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorVehiculoCliente;
	
	//public JLabel jLabelColumnasValoresGraficoVehiculoCliente;
	//public JList<Reporte> jListColumnasValoresGraficoVehiculoCliente;
	//public JScrollPane jScrollColumnasValoresGraficoVehiculoCliente;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoVehiculoCliente;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoVehiculoCliente;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasVehiculoCliente;
	public JPanel jPanelFK_IdClienteVehiculoCliente;
	public JButton jButtonFK_IdClienteVehiculoCliente;
	
	public JPanel jPanelid_clienteFK_IdClienteVehiculoCliente;
	public JLabel jLabelid_clienteFK_IdClienteVehiculoCliente;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_clienteFK_IdClienteVehiculoCliente;
	public JButton jButtonid_clienteFK_IdClienteVehiculoCliente= new JButtonMe();
	public JButton jButtonid_clienteFK_IdClienteVehiculoClienteUpdate= new JButtonMe();
	public JButton jButtonid_clienteFK_IdClienteVehiculoClienteBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdClienteid_clienteVehiculoCliente;
	
	
	
	
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
	//public int iHeightFormulario=858;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public VehiculoClienteJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("VehiculoCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public VehiculoClienteJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("VehiculoCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public VehiculoClienteJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("VehiculoCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public VehiculoClienteJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("VehiculoCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionVehiculoCliente)	{
		this.jButtonRecargarInformacionVehiculoCliente = jButtonRecargarInformacionVehiculoCliente;
	}
	
	public JButton getjButtonProcesarInformacionVehiculoCliente() {
		return this.jButtonProcesarInformacionVehiculoCliente;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionVehiculoCliente)	{
		this.jButtonProcesarInformacionVehiculoCliente = jButtonProcesarInformacionVehiculoCliente;
	}
	
	
	public JButton getjButtonRecargarInformacionVehiculoCliente() {
		return this.jButtonRecargarInformacionVehiculoCliente;
	}
	
	
	public List<VehiculoCliente> getvehiculoclientes() {
		return this.vehiculoclientes;
	}

	public void setvehiculoclientes(List<VehiculoCliente> vehiculoclientes) {
		this.vehiculoclientes = vehiculoclientes;
	}
	
	public List<VehiculoCliente> getvehiculoclientesAux() {
		return this.vehiculoclientesAux;
	}

	public void setvehiculoclientesAux(List<VehiculoCliente> vehiculoclientesAux) {
		this.vehiculoclientesAux = vehiculoclientesAux;
	}
	
	public List<VehiculoCliente> getvehiculoclientesEliminados() {
		return this.vehiculoclientesEliminados;
	}

	public void setVehiculoClientesEliminados(List<VehiculoCliente> vehiculoclientesEliminados) {
		this.vehiculoclientesEliminados = vehiculoclientesEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarVehiculoCliente() {
		return jComboBoxTiposSeleccionarVehiculoCliente;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarVehiculoCliente(
			JComboBox jComboBoxTiposSeleccionarVehiculoCliente) {
		this.jComboBoxTiposSeleccionarVehiculoCliente = jComboBoxTiposSeleccionarVehiculoCliente;
	}
	
	public void setBorderResaltarTiposSeleccionarVehiculoCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarVehiculoCliente.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarVehiculoCliente .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralVehiculoCliente() {
		return jTextFieldValorCampoGeneralVehiculoCliente;
	}

	public void setjTextFieldValorCampoGeneralVehiculoCliente(
			JTextField jTextFieldValorCampoGeneralVehiculoCliente) {
		this.jTextFieldValorCampoGeneralVehiculoCliente = jTextFieldValorCampoGeneralVehiculoCliente;
	}

	public void setBorderResaltarValorCampoGeneralVehiculoCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarVehiculoCliente.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralVehiculoCliente .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosVehiculoCliente() {
		return this.jCheckBoxSeleccionarTodosVehiculoCliente;
	}

	public void setjCheckBoxSeleccionarTodosVehiculoCliente(
			JCheckBox jCheckBoxSeleccionarTodosVehiculoCliente) {
		this.jCheckBoxSeleccionarTodosVehiculoCliente = jCheckBoxSeleccionarTodosVehiculoCliente;
	}

	public void setBorderResaltarSeleccionarTodosVehiculoCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarVehiculoCliente.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosVehiculoCliente .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosVehiculoCliente() {
		return this.jCheckBoxSeleccionadosVehiculoCliente;
	}

	public void setjCheckBoxSeleccionadosVehiculoCliente(
			JCheckBox jCheckBoxSeleccionadosVehiculoCliente) {
		this.jCheckBoxSeleccionadosVehiculoCliente = jCheckBoxSeleccionadosVehiculoCliente;
	}
	
	public void setBorderResaltarSeleccionadosVehiculoCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarVehiculoCliente.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosVehiculoCliente .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesVehiculoCliente() {
		return this.jComboBoxTiposArchivosReportesVehiculoCliente;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesVehiculoCliente(
			JComboBox jComboBoxTiposArchivosReportesVehiculoCliente) {
		this.jComboBoxTiposArchivosReportesVehiculoCliente = jComboBoxTiposArchivosReportesVehiculoCliente;
	}

	public void setBorderResaltarTiposArchivosReportesVehiculoCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarVehiculoCliente.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesVehiculoCliente .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesVehiculoCliente() {
		return this.jComboBoxTiposReportesVehiculoCliente;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesVehiculoCliente(
			JComboBox jComboBoxTiposReportesVehiculoCliente) {
		this.jComboBoxTiposReportesVehiculoCliente = jComboBoxTiposReportesVehiculoCliente;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoVehiculoCliente() {
	//	return jComboBoxTiposReportesDinamicoVehiculoCliente;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoVehiculoCliente(
	//		JComboBox jComboBoxTiposReportesDinamicoVehiculoCliente) {
	//	this.jComboBoxTiposReportesDinamicoVehiculoCliente = jComboBoxTiposReportesDinamicoVehiculoCliente;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoVehiculoCliente() {
	//	return jComboBoxTiposArchivosReportesDinamicoVehiculoCliente;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoVehiculoCliente(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoVehiculoCliente) {
	//	this.jComboBoxTiposArchivosReportesDinamicoVehiculoCliente = jComboBoxTiposArchivosReportesDinamicoVehiculoCliente;
	//}
	
	public void setBorderResaltarTiposReportesVehiculoCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarVehiculoCliente.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesVehiculoCliente .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesVehiculoCliente() {
		return this.jComboBoxTiposGraficosReportesVehiculoCliente;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesVehiculoCliente(
			JComboBox jComboBoxTiposGraficosReportesVehiculoCliente) {
		this.jComboBoxTiposGraficosReportesVehiculoCliente = jComboBoxTiposGraficosReportesVehiculoCliente;
	}
	
	public void setBorderResaltarTiposGraficosReportesVehiculoCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarVehiculoCliente.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesVehiculoCliente .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionVehiculoCliente() {
		return this.jComboBoxTiposPaginacionVehiculoCliente;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionVehiculoCliente(
			JComboBox jComboBoxTiposPaginacionVehiculoCliente) {
		this.jComboBoxTiposPaginacionVehiculoCliente = jComboBoxTiposPaginacionVehiculoCliente;
	}
	
	public void setBorderResaltarTiposPaginacionVehiculoCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarVehiculoCliente.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionVehiculoCliente .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesVehiculoCliente() {
		return this.jComboBoxTiposRelacionesVehiculoCliente;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesVehiculoCliente() {
		return this.jComboBoxTiposAccionesVehiculoCliente;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesVehiculoCliente(
			JComboBox jComboBoxTiposRelacionesVehiculoCliente) {
		this.jComboBoxTiposRelacionesVehiculoCliente = jComboBoxTiposRelacionesVehiculoCliente;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesVehiculoCliente(
			JComboBox jComboBoxTiposAccionesVehiculoCliente) {
		this.jComboBoxTiposAccionesVehiculoCliente = jComboBoxTiposAccionesVehiculoCliente;
	}
	
	public void setBorderResaltarTiposRelacionesVehiculoCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarVehiculoCliente.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesVehiculoCliente .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesVehiculoCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarVehiculoCliente.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesVehiculoCliente .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoVehiculoCliente() {
	//	return jCheckBoxConGraficoDinamicoVehiculoCliente;
	//}

	//public void setjCheckBoxConGraficoDinamicoVehiculoCliente(
	//		JCheckBox jCheckBoxConGraficoDinamicoVehiculoCliente) {
	//	this.jCheckBoxConGraficoDinamicoVehiculoCliente = jCheckBoxConGraficoDinamicoVehiculoCliente;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoVehiculoCliente() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarVehiculoCliente.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoVehiculoCliente .setBorder(borderResaltar);		
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
		this.vehiculoclienteSessionBean=new VehiculoClienteSessionBean();
		
		this.vehiculoclienteSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.vehiculoclienteSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.vehiculoclienteSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=VehiculoClienteJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=VehiculoClienteJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		VehiculoClienteJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		VehiculoClienteJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		VehiculoClienteJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Vehiculo Cliente MANTENIMIENTO"));
		
		
		if(iWidth > 1050) {
			iWidth=1050;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.vehiculoclienteSessionBean.getEsGuardarRelacionado()) {
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
		
		VehiculoClienteJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("VehiculoCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarVehiculoCliente= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarVehiculoCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarVehiculoCliente,this.jTtoolBarVehiculoCliente,
							"nuevo","nuevo","Nuevo"+" "+VehiculoClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarVehiculoCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarVehiculoCliente,this.jTtoolBarVehiculoCliente,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarVehiculoCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarVehiculoCliente,this.jTtoolBarVehiculoCliente,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+VehiculoClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarVehiculoCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarVehiculoCliente,this.jTtoolBarVehiculoCliente,
							"duplicar","duplicar","Duplicar"+" "+VehiculoClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarVehiculoCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarVehiculoCliente,this.jTtoolBarVehiculoCliente,
							"copiar","copiar","Copiar"+" "+VehiculoClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarVehiculoCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarVehiculoCliente,this.jTtoolBarVehiculoCliente,
							"ver_form","ver_form","Ver"+" "+VehiculoClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarVehiculoCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarVehiculoCliente,this.jTtoolBarVehiculoCliente,
							"recargar","recargar","Recargar"+" "+VehiculoClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarVehiculoCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarVehiculoCliente,this.jTtoolBarVehiculoCliente,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarVehiculoCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarVehiculoCliente,this.jTtoolBarVehiculoCliente,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarVehiculoCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarVehiculoCliente,this.jTtoolBarVehiculoCliente,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarVehiculoCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarVehiculoCliente,this.jTtoolBarVehiculoCliente,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarVehiculoCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarVehiculoCliente,this.jTtoolBarVehiculoCliente,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+VehiculoClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarVehiculoCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarVehiculoCliente,this.jTtoolBarVehiculoCliente,
							"cerrar","cerrar","Salir"+" "+VehiculoClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarVehiculoCliente=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarVehiculoCliente;
			
				this.jButtonProcesarInformacionToolBarVehiculoCliente=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarVehiculoCliente;
				
		//protected JButton jButtonModificarToolBarVehiculoCliente;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarVehiculoCliente=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuVehiculoCliente=new JMenuMe("General");
		this.jmenuArchivoVehiculoCliente=new JMenuMe("Archivo");
		this.jmenuAccionesVehiculoCliente=new JMenuMe("Acciones");
		this.jmenuDatosVehiculoCliente=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoVehiculoCliente= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoVehiculoCliente.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoVehiculoCliente,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoVehiculoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarVehiculoCliente= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarVehiculoCliente.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarVehiculoCliente,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarVehiculoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesVehiculoCliente= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesVehiculoCliente.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesVehiculoCliente,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesVehiculoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosVehiculoCliente= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosVehiculoCliente.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosVehiculoCliente,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosVehiculoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarVehiculoCliente= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarVehiculoCliente.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarVehiculoCliente,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarVehiculoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormVehiculoCliente= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormVehiculoCliente.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormVehiculoCliente,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormVehiculoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaVehiculoCliente= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaVehiculoCliente.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaVehiculoCliente,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaVehiculoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarVehiculoCliente= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarVehiculoCliente.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarVehiculoCliente,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarVehiculoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionVehiculoCliente= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionVehiculoCliente.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionVehiculoCliente,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionVehiculoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionVehiculoCliente= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionVehiculoCliente.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionVehiculoCliente,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresVehiculoCliente= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresVehiculoCliente.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresVehiculoCliente,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresVehiculoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesVehiculoCliente= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesVehiculoCliente.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesVehiculoCliente,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesVehiculoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByVehiculoCliente= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByVehiculoCliente.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByVehiculoCliente,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByVehiculoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarVehiculoCliente= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarVehiculoCliente.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarVehiculoCliente,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarVehiculoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByVehiculoCliente= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByVehiculoCliente.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByVehiculoCliente,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByVehiculoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarVehiculoCliente= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarVehiculoCliente.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarVehiculoCliente,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarVehiculoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosVehiculoCliente= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosVehiculoCliente.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosVehiculoCliente,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosVehiculoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoVehiculoCliente.add(this.jMenuItemCerrarVehiculoCliente);
			
			this.jmenuAccionesVehiculoCliente.add(this.jMenuItemNuevoVehiculoCliente);
			this.jmenuAccionesVehiculoCliente.add(this.jMenuItemNuevoGuardarCambiosVehiculoCliente);
			this.jmenuAccionesVehiculoCliente.add(this.jMenuItemNuevoRelacionesVehiculoCliente);
			this.jmenuAccionesVehiculoCliente.add(this.jMenuItemGuardarCambiosTablaVehiculoCliente);		
			this.jmenuAccionesVehiculoCliente.add(this.jMenuItemDuplicarVehiculoCliente);		
			this.jmenuAccionesVehiculoCliente.add(this.jMenuItemCopiarVehiculoCliente);		
			this.jmenuAccionesVehiculoCliente.add(this.jMenuItemVerFormVehiculoCliente);		
			
			this.jmenuDatosVehiculoCliente.add(this.jMenuItemRecargarInformacionVehiculoCliente);				
			this.jmenuDatosVehiculoCliente.add(this.jMenuItemAnterioresVehiculoCliente);				
			this.jmenuDatosVehiculoCliente.add(this.jMenuItemSiguientesVehiculoCliente);				
			this.jmenuDatosVehiculoCliente.add(this.jMenuItemAbrirOrderByVehiculoCliente);				
			this.jmenuDatosVehiculoCliente.add(this.jMenuItemMostrarOcultarVehiculoCliente);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesVehiculoCliente.add(this.jMenuItemGuardarCambiosVehiculoCliente);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoVehiculoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesVehiculoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosVehiculoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarVehiculoCliente.add(this.jmenuArchivoVehiculoCliente);		
			this.jmenuBarVehiculoCliente.add(this.jmenuAccionesVehiculoCliente);		
			this.jmenuBarVehiculoCliente.add(this.jmenuDatosVehiculoCliente);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarVehiculoCliente);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasVehiculoCliente() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdClienteVehiculoCliente=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdClienteVehiculoCliente.setToolTipText("Buscar Por Cliente ");
		this.jButtonFK_IdClienteVehiculoCliente= new JButtonMe();
		this.jButtonFK_IdClienteVehiculoCliente.setText("Buscar");
		this.jButtonFK_IdClienteVehiculoCliente.setToolTipText("Buscar Por Cliente ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdClienteVehiculoCliente,"buscar_button","Buscar Por Cliente ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdClienteVehiculoCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_clienteFK_IdClienteVehiculoCliente = new JLabelMe();
		jLabelid_clienteFK_IdClienteVehiculoCliente.setText("Cliente :");
		jLabelid_clienteFK_IdClienteVehiculoCliente.setToolTipText("Cliente");
		jLabelid_clienteFK_IdClienteVehiculoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_clienteFK_IdClienteVehiculoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_clienteFK_IdClienteVehiculoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_clienteFK_IdClienteVehiculoCliente,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_clienteFK_IdClienteVehiculoCliente= new JComboBoxMe();
		jComboBoxid_clienteFK_IdClienteVehiculoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteFK_IdClienteVehiculoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteFK_IdClienteVehiculoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_clienteFK_IdClienteVehiculoCliente,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdClienteid_clienteVehiculoCliente= new JButtonMe();
		this.jButtonBuscarFK_IdClienteid_clienteVehiculoCliente.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdClienteid_clienteVehiculoCliente.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdClienteid_clienteVehiculoCliente.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdClienteid_clienteVehiculoCliente.setText("Buscar");
		this.jButtonBuscarFK_IdClienteid_clienteVehiculoCliente.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdClienteid_clienteVehiculoCliente.setFocusable(false);


		this.jTabbedPaneBusquedasVehiculoCliente=new JTabbedPane();


		this.jTabbedPaneBusquedasVehiculoCliente.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasVehiculoCliente.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasVehiculoCliente.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasVehiculoCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasVehiculoCliente.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasVehiculoCliente,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleVehiculoCliente = new VehiculoClienteDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Vehiculo Cliente DATOS");
			this.jInternalFrameDetalleFormVehiculoCliente = new VehiculoClienteDetalleFormJInternalFrame(jDesktopPane,this.vehiculoclienteSessionBean.getConGuardarRelaciones(),this.vehiculoclienteSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormVehiculoCliente = null;//new VehiculoClienteDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutVehiculoCliente= new GridBagLayout();
		
		
		this.jTableDatosVehiculoCliente = new JTableMe();      
		
		String sToolTipVehiculoCliente="";
		sToolTipVehiculoCliente=VehiculoClienteConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipVehiculoCliente+="(Cartera.VehiculoCliente)";
		}
		
		if(!this.vehiculoclienteSessionBean.getEsGuardarRelacionado()) {
			sToolTipVehiculoCliente+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosVehiculoCliente.setToolTipText(sToolTipVehiculoCliente);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosVehiculoCliente);
		this.jTableDatosVehiculoCliente.setAutoCreateRowSorter(true);
		this.jTableDatosVehiculoCliente.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosVehiculoCliente.setRowSelectionAllowed(true);
		this.jTableDatosVehiculoCliente.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosVehiculoCliente,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoVehiculoCliente = new JButtonMe();
		this.jButtonDuplicarVehiculoCliente = new JButtonMe();
		this.jButtonCopiarVehiculoCliente = new JButtonMe();
		this.jButtonVerFormVehiculoCliente = new JButtonMe();
		this.jButtonNuevoRelacionesVehiculoCliente = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaVehiculoCliente = new JButtonMe();
		this.jButtonCerrarVehiculoCliente = new JButtonMe();
		
		this.jScrollPanelDatosVehiculoCliente = new JScrollPane();   
        this.jScrollPanelDatosGeneralVehiculoCliente = new JScrollPane();
		
				
		
		
		this.jPanelAccionesVehiculoCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Vehiculo Cliente";
		
		if(!this.vehiculoclienteSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosVehiculoCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Vehiculo Clientes" + this.sPath));
		} else {
			this.jScrollPanelDatosVehiculoCliente.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralVehiculoCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesVehiculoCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesVehiculoCliente.setToolTipText("Acciones");
        this.jPanelAccionesVehiculoCliente.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralVehiculoCliente, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosVehiculoCliente, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoVehiculoCliente=new ReporteDinamicoJInternalFrame(VehiculoClienteConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoVehiculoCliente();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionVehiculoCliente=new ImportacionJInternalFrame(VehiculoClienteConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionVehiculoCliente();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByVehiculoCliente = new JButtonMe();
		
		this.jButtonAbrirOrderByVehiculoCliente.setText("Orden");
		this.jButtonAbrirOrderByVehiculoCliente.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByVehiculoCliente,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByVehiculoCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByVehiculoCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByVehiculoCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByVehiculoCliente=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByVehiculoCliente,false,this);
			
			//this.cargarOrderByVehiculoCliente(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByVehiculoCliente=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByVehiculoCliente,true,this);
			
			//this.cargarOrderByVehiculoCliente(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosVehiculoCliente.setMinimumSize(new Dimension(400,50));//1030
		this.jTableDatosVehiculoCliente.setMaximumSize(new Dimension(400,50));//1030
		this.jTableDatosVehiculoCliente.setPreferredSize(new Dimension(400,50));//1030
		
		this.jScrollPanelDatosVehiculoCliente.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosVehiculoCliente.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosVehiculoCliente.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoVehiculoCliente.setText("Nuevo");
		this.jButtonDuplicarVehiculoCliente.setText("Duplicar");
		this.jButtonCopiarVehiculoCliente.setText("Copiar");
		this.jButtonVerFormVehiculoCliente.setText("Ver");
		this.jButtonNuevoRelacionesVehiculoCliente.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaVehiculoCliente.setText("Guardar");
		this.jButtonCerrarVehiculoCliente.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoVehiculoCliente,"nuevo_button","Nuevo",this.vehiculoclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarVehiculoCliente,"duplicar_button","Duplicar",this.vehiculoclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarVehiculoCliente,"copiar_button","Copiar",this.vehiculoclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormVehiculoCliente,"ver_form","Ver",this.vehiculoclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesVehiculoCliente,"nuevorelaciones_button","Nuevo Rel",this.vehiculoclienteSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaVehiculoCliente,"guardarcambiostabla_button","Guardar",this.vehiculoclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarVehiculoCliente,"cerrar_button","Salir",this.vehiculoclienteSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoVehiculoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarVehiculoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarVehiculoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormVehiculoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesVehiculoCliente, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaVehiculoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarVehiculoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoVehiculoCliente.setToolTipText("Nuevo"+" "+VehiculoClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarVehiculoCliente.setToolTipText("Duplicar"+" "+VehiculoClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarVehiculoCliente.setToolTipText("Copiar"+" "+VehiculoClienteConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormVehiculoCliente.setToolTipText("Ver"+" "+VehiculoClienteConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesVehiculoCliente.setToolTipText("Nuevo Rel"+" "+VehiculoClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaVehiculoCliente.setToolTipText("Guardar"+" "+VehiculoClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarVehiculoCliente.setToolTipText("Salir"+" "+VehiculoClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoVehiculoCliente";
		inputMap = this.jButtonNuevoVehiculoCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoVehiculoCliente.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoVehiculoCliente"));
		
		//DUPLICAR
		sMapKey = "DuplicarVehiculoCliente";
		inputMap = this.jButtonDuplicarVehiculoCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarVehiculoCliente.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarVehiculoCliente"));
		
		//COPIAR
		sMapKey = "CopiarVehiculoCliente";
		inputMap = this.jButtonCopiarVehiculoCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarVehiculoCliente.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarVehiculoCliente"));
		
		//VEr FORM
		sMapKey = "VerFormVehiculoCliente";
		inputMap = this.jButtonVerFormVehiculoCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormVehiculoCliente.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormVehiculoCliente"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesVehiculoCliente";
		inputMap = this.jButtonNuevoRelacionesVehiculoCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesVehiculoCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesVehiculoCliente"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarVehiculoCliente";
		inputMap = this.jButtonModificarVehiculoCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarVehiculoCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarVehiculoCliente"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarVehiculoCliente";
		inputMap = this.jButtonCerrarVehiculoCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarVehiculoCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarVehiculoCliente"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaVehiculoCliente";
		inputMap = this.jButtonGuardarCambiosTablaVehiculoCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaVehiculoCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaVehiculoCliente"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesVehiculoCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesVehiculoCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionVehiculoCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1VehiculoCliente= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2VehiculoCliente= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3VehiculoCliente= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4VehiculoCliente= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5VehiculoCliente= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesVehiculoCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesVehiculoCliente.setName("jPanelParametrosReportesVehiculoCliente"); 
		
		this.jPanelParametrosReportesAccionesVehiculoCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesVehiculoCliente.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesVehiculoCliente.setName("jPanelParametrosReportesAccionesVehiculoCliente"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesVehiculoCliente, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesVehiculoCliente, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionVehiculoCliente = new JButtonMe();
		this.jButtonRecargarInformacionVehiculoCliente.setText("Recargar");
		this.jButtonRecargarInformacionVehiculoCliente.setToolTipText("Recargar"+" "+VehiculoClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionVehiculoCliente,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionVehiculoCliente = new JButtonMe();
		this.jButtonProcesarInformacionVehiculoCliente.setText("Procesar");
		this.jButtonProcesarInformacionVehiculoCliente.setToolTipText("Procesar"+" "+VehiculoClienteConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionVehiculoCliente.setVisible(false);
			
		this.jButtonProcesarInformacionVehiculoCliente.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionVehiculoCliente.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionVehiculoCliente.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesVehiculoCliente = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesVehiculoCliente.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesVehiculoCliente.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesVehiculoCliente = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesVehiculoCliente.setText("TIPO");       
		this.jComboBoxTiposReportesVehiculoCliente.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesVehiculoCliente = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesVehiculoCliente.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesVehiculoCliente.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionVehiculoCliente = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionVehiculoCliente.setText("Paginacion");
		this.jComboBoxTiposPaginacionVehiculoCliente.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesVehiculoCliente = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesVehiculoCliente.setText("Accion");
		this.jComboBoxTiposRelacionesVehiculoCliente.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesVehiculoCliente = new JComboBoxMe();
		//this.jComboBoxTiposAccionesVehiculoCliente.setText("Accion");
		this.jComboBoxTiposAccionesVehiculoCliente.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarVehiculoCliente = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarVehiculoCliente.setText("Accion");
		this.jComboBoxTiposSeleccionarVehiculoCliente.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralVehiculoCliente=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralVehiculoCliente.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralVehiculoCliente.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralVehiculoCliente.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesVehiculoCliente = new JLabelMe();
		
		this.jLabelAccionesVehiculoCliente.setText("Acciones");		
		this.jLabelAccionesVehiculoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesVehiculoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesVehiculoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosVehiculoCliente = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosVehiculoCliente.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosVehiculoCliente.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosVehiculoCliente = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosVehiculoCliente.setText("Seleccionados");
		this.jCheckBoxSeleccionadosVehiculoCliente.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaVehiculoCliente = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaVehiculoCliente.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaVehiculoCliente.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteVehiculoCliente = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteVehiculoCliente.setText("Graf.");
		this.jCheckBoxConGraficoReporteVehiculoCliente.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresVehiculoCliente = new JButtonMe();
		//this.jButtonAnterioresVehiculoCliente.setText("<<");
        this.jButtonAnterioresVehiculoCliente.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresVehiculoCliente,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresVehiculoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesVehiculoCliente = new JButtonMe();
		//this.jButtonSiguientesVehiculoCliente.setText(">>");
        this.jButtonSiguientesVehiculoCliente.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesVehiculoCliente,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesVehiculoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosVehiculoCliente = new JButtonMe();
		this.jButtonNuevoGuardarCambiosVehiculoCliente.setText("Nue");
        this.jButtonNuevoGuardarCambiosVehiculoCliente.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosVehiculoCliente,"nuevoguardarcambios_button","Nue",this.vehiculoclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosVehiculoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosVehiculoCliente";
		inputMap = this.jButtonNuevoGuardarCambiosVehiculoCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosVehiculoCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosVehiculoCliente"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionVehiculoCliente";
		inputMap = this.jButtonRecargarInformacionVehiculoCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionVehiculoCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionVehiculoCliente"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesVehiculoCliente";
		inputMap = this.jButtonSiguientesVehiculoCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesVehiculoCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesVehiculoCliente"));
		
		//ANTERIORES		
		sMapKey = "AnterioresVehiculoCliente";
		inputMap = this.jButtonAnterioresVehiculoCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresVehiculoCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresVehiculoCliente"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasVehiculoCliente();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesVehiculoCliente.setMinimumSize(new Dimension(this.getWidth(),VehiculoClienteBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(VehiculoClienteBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesVehiculoCliente.setMaximumSize(new Dimension(this.getWidth(),VehiculoClienteBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(VehiculoClienteBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesVehiculoCliente.setPreferredSize(new Dimension(this.getWidth(),VehiculoClienteBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(VehiculoClienteBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionVehiculoCliente = new GridBagLayout();

			this.jPanelPaginacionVehiculoCliente.setLayout(gridaBagLayoutPaginacionVehiculoCliente);						
			
			this.gridBagConstraintsVehiculoCliente = new GridBagConstraints();
			this.gridBagConstraintsVehiculoCliente.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsVehiculoCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVehiculoCliente.gridy = 0;
			this.gridBagConstraintsVehiculoCliente.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionVehiculoCliente.add(this.jButtonAnterioresVehiculoCliente, this.gridBagConstraintsVehiculoCliente);
					
						
			this.gridBagConstraintsVehiculoCliente = new GridBagConstraints();
			this.gridBagConstraintsVehiculoCliente.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsVehiculoCliente.gridy = 0;
			
			this.jPanelPaginacionVehiculoCliente.add(this.jButtonNuevoGuardarCambiosVehiculoCliente, this.gridBagConstraintsVehiculoCliente);
						
			
			this.gridBagConstraintsVehiculoCliente = new GridBagConstraints();
			this.gridBagConstraintsVehiculoCliente.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsVehiculoCliente.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsVehiculoCliente.gridy = 0;
			this.jPanelPaginacionVehiculoCliente.add(this.jButtonSiguientesVehiculoCliente, this.gridBagConstraintsVehiculoCliente);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsVehiculoCliente = new GridBagConstraints();
			this.gridBagConstraintsVehiculoCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVehiculoCliente.gridy = 1;
			this.gridBagConstraintsVehiculoCliente.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionVehiculoCliente.add(this.jButtonNuevoVehiculoCliente, this.gridBagConstraintsVehiculoCliente);
						
			
			
			if(!this.vehiculoclienteSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsVehiculoCliente = new GridBagConstraints();
				this.gridBagConstraintsVehiculoCliente.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsVehiculoCliente.gridy = 1;
				this.gridBagConstraintsVehiculoCliente.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionVehiculoCliente.add(this.jButtonGuardarCambiosTablaVehiculoCliente, this.gridBagConstraintsVehiculoCliente);
			}
			
			
			
			this.gridBagConstraintsVehiculoCliente = new GridBagConstraints();
			this.gridBagConstraintsVehiculoCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVehiculoCliente.gridy = 1;
			this.gridBagConstraintsVehiculoCliente.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionVehiculoCliente.add(this.jButtonDuplicarVehiculoCliente, this.gridBagConstraintsVehiculoCliente);
			
			this.gridBagConstraintsVehiculoCliente = new GridBagConstraints();
			this.gridBagConstraintsVehiculoCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVehiculoCliente.gridy = 1;
			this.gridBagConstraintsVehiculoCliente.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionVehiculoCliente.add(this.jButtonCopiarVehiculoCliente, this.gridBagConstraintsVehiculoCliente);
		
			this.gridBagConstraintsVehiculoCliente = new GridBagConstraints();
			this.gridBagConstraintsVehiculoCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVehiculoCliente.gridy = 1;
			this.gridBagConstraintsVehiculoCliente.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionVehiculoCliente.add(this.jButtonVerFormVehiculoCliente, this.gridBagConstraintsVehiculoCliente);
		
			this.gridBagConstraintsVehiculoCliente = new GridBagConstraints();
			this.gridBagConstraintsVehiculoCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVehiculoCliente.gridy = 1;
			this.gridBagConstraintsVehiculoCliente.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionVehiculoCliente.add(this.jButtonCerrarVehiculoCliente, this.gridBagConstraintsVehiculoCliente);
		
		
		
		this.jButtonRecargarInformacionVehiculoCliente.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionVehiculoCliente.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionVehiculoCliente.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionVehiculoCliente, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesVehiculoCliente.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesVehiculoCliente.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesVehiculoCliente.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesVehiculoCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesVehiculoCliente.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesVehiculoCliente.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesVehiculoCliente.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesVehiculoCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesVehiculoCliente.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesVehiculoCliente.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesVehiculoCliente.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesVehiculoCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionVehiculoCliente.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionVehiculoCliente.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionVehiculoCliente.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionVehiculoCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesVehiculoCliente.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesVehiculoCliente.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesVehiculoCliente.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesVehiculoCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesVehiculoCliente.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesVehiculoCliente.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesVehiculoCliente.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesVehiculoCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarVehiculoCliente.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarVehiculoCliente.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarVehiculoCliente.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarVehiculoCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaVehiculoCliente.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaVehiculoCliente.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaVehiculoCliente.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaVehiculoCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteVehiculoCliente.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteVehiculoCliente.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteVehiculoCliente.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteVehiculoCliente, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosVehiculoCliente.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosVehiculoCliente.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosVehiculoCliente.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosVehiculoCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosVehiculoCliente.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosVehiculoCliente.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosVehiculoCliente.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosVehiculoCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesVehiculoCliente = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesVehiculoCliente = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1VehiculoCliente = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2VehiculoCliente = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3VehiculoCliente = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4VehiculoCliente = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesVehiculoCliente.setLayout(gridaBagParametrosReportesVehiculoCliente);
			this.jPanelParametrosReportesAccionesVehiculoCliente.setLayout(gridaBagParametrosReportesAccionesVehiculoCliente);
			
			
			this.jPanelParametrosAuxiliar1VehiculoCliente.setLayout(gridaBagParametrosAuxiliar1VehiculoCliente);
			this.jPanelParametrosAuxiliar2VehiculoCliente.setLayout(gridaBagParametrosAuxiliar2VehiculoCliente);
			this.jPanelParametrosAuxiliar3VehiculoCliente.setLayout(gridaBagParametrosAuxiliar3VehiculoCliente);
			this.jPanelParametrosAuxiliar4VehiculoCliente.setLayout(gridaBagParametrosAuxiliar4VehiculoCliente);
			//this.jPanelParametrosAuxiliar5VehiculoCliente.setLayout(gridaBagParametrosAuxiliar2VehiculoCliente);			
			
			
			
			
			this.gridBagConstraintsVehiculoCliente = new GridBagConstraints();
			this.gridBagConstraintsVehiculoCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVehiculoCliente.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsVehiculoCliente.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesVehiculoCliente.add(this.jButtonRecargarInformacionVehiculoCliente, this.gridBagConstraintsVehiculoCliente);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsVehiculoCliente = new GridBagConstraints();
			this.gridBagConstraintsVehiculoCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVehiculoCliente.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsVehiculoCliente.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1VehiculoCliente.add(this.jComboBoxTiposPaginacionVehiculoCliente, this.gridBagConstraintsVehiculoCliente);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsVehiculoCliente = new GridBagConstraints();
			this.gridBagConstraintsVehiculoCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVehiculoCliente.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsVehiculoCliente.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1VehiculoCliente.add(this.jCheckBoxConAltoMaximoTablaVehiculoCliente, this.gridBagConstraintsVehiculoCliente);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsVehiculoCliente = new GridBagConstraints();
			this.gridBagConstraintsVehiculoCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVehiculoCliente.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsVehiculoCliente.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1VehiculoCliente.add(this.jComboBoxTiposArchivosReportesVehiculoCliente, this.gridBagConstraintsVehiculoCliente);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsVehiculoCliente = new GridBagConstraints();
			this.gridBagConstraintsVehiculoCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVehiculoCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsVehiculoCliente.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesVehiculoCliente.add(this.jPanelParametrosAuxiliar1VehiculoCliente, this.gridBagConstraintsVehiculoCliente);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsVehiculoCliente = new GridBagConstraints();
			this.gridBagConstraintsVehiculoCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVehiculoCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVehiculoCliente.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsVehiculoCliente.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4VehiculoCliente.add(this.jComboBoxTiposReportesVehiculoCliente, this.gridBagConstraintsVehiculoCliente);																		
			
			
			
			this.gridBagConstraintsVehiculoCliente = new GridBagConstraints();
			this.gridBagConstraintsVehiculoCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVehiculoCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVehiculoCliente.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsVehiculoCliente.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4VehiculoCliente.add(this.jComboBoxTiposGraficosReportesVehiculoCliente, this.gridBagConstraintsVehiculoCliente);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsVehiculoCliente = new GridBagConstraints();
			this.gridBagConstraintsVehiculoCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVehiculoCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsVehiculoCliente.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesVehiculoCliente.add(this.jPanelParametrosAuxiliar4VehiculoCliente, this.gridBagConstraintsVehiculoCliente);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsVehiculoCliente = new GridBagConstraints();
			this.gridBagConstraintsVehiculoCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVehiculoCliente.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsVehiculoCliente.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesVehiculoCliente.add(this.jComboBoxTiposReportesVehiculoCliente, this.gridBagConstraintsVehiculoCliente);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsVehiculoCliente = new GridBagConstraints();
			this.gridBagConstraintsVehiculoCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVehiculoCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsVehiculoCliente.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesVehiculoCliente.add(this.jCheckBoxGenerarReporteVehiculoCliente, this.gridBagConstraintsVehiculoCliente);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsVehiculoCliente = new GridBagConstraints();
			this.gridBagConstraintsVehiculoCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVehiculoCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsVehiculoCliente.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesVehiculoCliente.add(this.jPanelParametrosAuxiliar2VehiculoCliente, this.gridBagConstraintsVehiculoCliente);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsVehiculoCliente = new GridBagConstraints();
			this.gridBagConstraintsVehiculoCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVehiculoCliente.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsVehiculoCliente.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesVehiculoCliente.add(this.jLabelAccionesVehiculoCliente, this.gridBagConstraintsVehiculoCliente);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsVehiculoCliente = new GridBagConstraints();
				this.gridBagConstraintsVehiculoCliente.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsVehiculoCliente.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsVehiculoCliente.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesVehiculoCliente.add(this.jButtonAbrirOrderByVehiculoCliente, this.gridBagConstraintsVehiculoCliente);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsVehiculoCliente = new GridBagConstraints();
			this.gridBagConstraintsVehiculoCliente.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsVehiculoCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsVehiculoCliente.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesVehiculoCliente.add(this.jComboBoxTiposSeleccionarVehiculoCliente, this.gridBagConstraintsVehiculoCliente);			
			
			
			/*
			this.gridBagConstraintsVehiculoCliente = new GridBagConstraints();
			this.gridBagConstraintsVehiculoCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVehiculoCliente.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsVehiculoCliente.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesVehiculoCliente.add(this.jCheckBoxSeleccionarTodosVehiculoCliente, this.gridBagConstraintsVehiculoCliente);
			
			this.gridBagConstraintsVehiculoCliente = new GridBagConstraints();
			this.gridBagConstraintsVehiculoCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVehiculoCliente.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsVehiculoCliente.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesVehiculoCliente.add(this.jCheckBoxConGraficoReporteVehiculoCliente, this.gridBagConstraintsVehiculoCliente);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsVehiculoCliente = new GridBagConstraints();
			this.gridBagConstraintsVehiculoCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVehiculoCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVehiculoCliente.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsVehiculoCliente.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3VehiculoCliente.add(this.jCheckBoxSeleccionarTodosVehiculoCliente, this.gridBagConstraintsVehiculoCliente);															
				
			this.gridBagConstraintsVehiculoCliente = new GridBagConstraints();
			this.gridBagConstraintsVehiculoCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVehiculoCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVehiculoCliente.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsVehiculoCliente.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3VehiculoCliente.add(this.jCheckBoxSeleccionadosVehiculoCliente, this.gridBagConstraintsVehiculoCliente);															
			
			this.gridBagConstraintsVehiculoCliente = new GridBagConstraints();
			this.gridBagConstraintsVehiculoCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVehiculoCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVehiculoCliente.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsVehiculoCliente.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3VehiculoCliente.add(this.jCheckBoxConGraficoReporteVehiculoCliente, this.gridBagConstraintsVehiculoCliente);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsVehiculoCliente = new GridBagConstraints();
			this.gridBagConstraintsVehiculoCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVehiculoCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsVehiculoCliente.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesVehiculoCliente.add(this.jPanelParametrosAuxiliar3VehiculoCliente, this.gridBagConstraintsVehiculoCliente);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsVehiculoCliente = new GridBagConstraints();
			this.gridBagConstraintsVehiculoCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsVehiculoCliente.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesVehiculoCliente.add(this.jComboBoxTiposAccionesVehiculoCliente, this.gridBagConstraintsVehiculoCliente);
	
				
			this.gridBagConstraintsVehiculoCliente = new GridBagConstraints();
			this.gridBagConstraintsVehiculoCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsVehiculoCliente.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesVehiculoCliente.add(this.jTextFieldValorCampoGeneralVehiculoCliente, this.gridBagConstraintsVehiculoCliente);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosVehiculoCliente = new GridBagLayout();

			this.jScrollPanelDatosVehiculoCliente.setLayout(gridaBagLayoutDatosVehiculoCliente);
			
			this.gridBagConstraintsVehiculoCliente = new GridBagConstraints();
			this.gridBagConstraintsVehiculoCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVehiculoCliente.gridy = 0;
			this.gridBagConstraintsVehiculoCliente.gridx = 0;
			
			this.jScrollPanelDatosVehiculoCliente.add(this.jTableDatosVehiculoCliente, this.gridBagConstraintsVehiculoCliente);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosVehiculoCliente.setViewportView(this.jTableDatosVehiculoCliente);
		this.jTableDatosVehiculoCliente.setFillsViewportHeight(true);
		this.jTableDatosVehiculoCliente.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesVehiculoCliente= new GridBagLayout();
		this.jPanelAccionesVehiculoCliente.setLayout(gridaBagLayoutAccionesVehiculoCliente);
		
		
		/*	
		this.gridBagConstraintsVehiculoCliente = new GridBagConstraints();
		this.gridBagConstraintsVehiculoCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVehiculoCliente.gridy = 0;
		this.gridBagConstraintsVehiculoCliente.gridx = 0;
			
		this.jPanelAccionesVehiculoCliente.add(this.jButtonNuevoVehiculoCliente, this.gridBagConstraintsVehiculoCliente);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdClienteVehiculoCliente= new GridBagLayout();
		gridaBagLayoutFK_IdClienteVehiculoCliente.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdClienteVehiculoCliente.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdClienteVehiculoCliente.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdClienteVehiculoCliente.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdClienteVehiculoCliente.setLayout(gridaBagLayoutFK_IdClienteVehiculoCliente);

		gridBagConstraintsVehiculoCliente = new GridBagConstraints();
		gridBagConstraintsVehiculoCliente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsVehiculoCliente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsVehiculoCliente.gridy = 0;
		gridBagConstraintsVehiculoCliente.gridx = 0;
		jPanelFK_IdClienteVehiculoCliente.add(jLabelid_clienteFK_IdClienteVehiculoCliente, gridBagConstraintsVehiculoCliente);

		gridBagConstraintsVehiculoCliente = new GridBagConstraints();
		gridBagConstraintsVehiculoCliente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsVehiculoCliente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsVehiculoCliente.gridy = 0;
		gridBagConstraintsVehiculoCliente.gridx = 1;
		jPanelFK_IdClienteVehiculoCliente.add(jComboBoxid_clienteFK_IdClienteVehiculoCliente, gridBagConstraintsVehiculoCliente);


		gridBagConstraintsVehiculoCliente = new GridBagConstraints();
		gridBagConstraintsVehiculoCliente.anchor = GridBagConstraints.EAST;
		gridBagConstraintsVehiculoCliente.fill = GridBagConstraints.NONE;
		gridBagConstraintsVehiculoCliente.gridy = 0;
		gridBagConstraintsVehiculoCliente.gridx = 0;
		jPanelFK_IdClienteVehiculoCliente.add(this.jButtonBuscarFK_IdClienteid_clienteVehiculoCliente, gridBagConstraintsVehiculoCliente);

		gridBagConstraintsVehiculoCliente = new GridBagConstraints();
		gridBagConstraintsVehiculoCliente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsVehiculoCliente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsVehiculoCliente.gridy = 1;
		gridBagConstraintsVehiculoCliente.gridx =1;
		jPanelFK_IdClienteVehiculoCliente.add(jButtonFK_IdClienteVehiculoCliente, gridBagConstraintsVehiculoCliente);

		jTabbedPaneBusquedasVehiculoCliente.addTab("1.-Por Cliente ", jPanelFK_IdClienteVehiculoCliente);
		jTabbedPaneBusquedasVehiculoCliente.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutVehiculoCliente = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutVehiculoCliente);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.vehiculoclienteSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsVehiculoCliente = new GridBagConstraints();						
			this.gridBagConstraintsVehiculoCliente.gridy = iGridyPrincipal++;
			this.gridBagConstraintsVehiculoCliente.gridx = 0;		
			//this.gridBagConstraintsVehiculoCliente.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVehiculoCliente.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsVehiculoCliente.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarVehiculoCliente, this.gridBagConstraintsVehiculoCliente);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsVehiculoCliente = new GridBagConstraints();
		this.gridBagConstraintsVehiculoCliente.gridy = iGridyPrincipal++;
		this.gridBagConstraintsVehiculoCliente.gridx = 0;		
		//this.gridBagConstraintsVehiculoCliente.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVehiculoCliente.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsVehiculoCliente.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsVehiculoCliente);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsVehiculoCliente = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsVehiculoCliente.gridy = iGridyPrincipal++;
			this.gridBagConstraintsVehiculoCliente.gridx = 0;		
			this.gridBagConstraintsVehiculoCliente.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVehiculoCliente.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsVehiculoCliente.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasVehiculoCliente, this.gridBagConstraintsVehiculoCliente);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsVehiculoCliente = new GridBagConstraints();
		this.gridBagConstraintsVehiculoCliente.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsVehiculoCliente.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesVehiculoCliente, this.gridBagConstraintsVehiculoCliente);								
		
		
		/*
		this.gridBagConstraintsVehiculoCliente = new GridBagConstraints();
		this.gridBagConstraintsVehiculoCliente.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsVehiculoCliente.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesVehiculoCliente, this.gridBagConstraintsVehiculoCliente);
		*/		
		
		this.gridBagConstraintsVehiculoCliente = new GridBagConstraints();
		this.gridBagConstraintsVehiculoCliente.gridy =iGridyPrincipal++;
		this.gridBagConstraintsVehiculoCliente.gridx =0;
		this.gridBagConstraintsVehiculoCliente.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsVehiculoCliente.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosVehiculoCliente, this.gridBagConstraintsVehiculoCliente);
				
		
		this.gridBagConstraintsVehiculoCliente = new GridBagConstraints();
		this.gridBagConstraintsVehiculoCliente.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsVehiculoCliente.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionVehiculoCliente, this.gridBagConstraintsVehiculoCliente);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(VehiculoClienteJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosVehiculoCliente= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosVehiculoCliente = new GridBagLayout();
			this.jPanelBusquedasParametrosVehiculoCliente.setLayout(gridaBagLayoutBusquedasParametrosVehiculoCliente);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralVehiculoCliente=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralVehiculoCliente.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralVehiculoCliente.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralVehiculoCliente.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsVehiculoCliente = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsVehiculoCliente = new GridBagConstraints();
		this.gridBagConstraintsVehiculoCliente.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsVehiculoCliente.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposVehiculoCliente, this.gridBagConstraintsVehiculoCliente);
			
			
		this.gridBagConstraintsVehiculoCliente = new GridBagConstraints();
		this.gridBagConstraintsVehiculoCliente.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsVehiculoCliente.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosVehiculoCliente, this.gridBagConstraintsVehiculoCliente);
		
			
		this.gridBagConstraintsVehiculoCliente = new GridBagConstraints();
		this.gridBagConstraintsVehiculoCliente.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsVehiculoCliente.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesVehiculoCliente, this.gridBagConstraintsVehiculoCliente);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralVehiculoCliente;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoVehiculoCliente() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoVehiculoCliente = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoVehiculoCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoVehiculoCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoVehiculoCliente.setName("jPanelReporteDinamicoVehiculoCliente"); 
		
		this.jPanelReporteDinamicoVehiculoCliente.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoVehiculoCliente.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoVehiculoCliente.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoVehiculoCliente.setLayout(gridaBagLayoutReporteDinamicoVehiculoCliente);
		
		
		this.jInternalFrameReporteDinamicoVehiculoCliente= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoVehiculoCliente = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteVehiculoCliente= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoVehiculoCliente.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoVehiculoCliente.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoVehiculoCliente.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoVehiculoCliente.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoVehiculoCliente.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoVehiculoCliente.setResizable(true);
	    this.jInternalFrameReporteDinamicoVehiculoCliente.setClosable(true);
	    this.jInternalFrameReporteDinamicoVehiculoCliente.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoVehiculoCliente.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoVehiculoCliente.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoVehiculoCliente.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoVehiculoCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Vehiculo Clientes"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteVehiculoCliente = new JLabelMe();

		this.jLabelColumnasSelectReporteVehiculoCliente.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteVehiculoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteVehiculoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteVehiculoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsVehiculoCliente = new GridBagConstraints();
		this.gridBagConstraintsVehiculoCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVehiculoCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVehiculoCliente.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoVehiculoCliente.add(this.jLabelColumnasSelectReporteVehiculoCliente, this.gridBagConstraintsVehiculoCliente);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteVehiculoCliente = new JList<Reporte>();
		this.jListColumnasSelectReporteVehiculoCliente.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteVehiculoCliente.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteVehiculoCliente.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteVehiculoCliente.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteVehiculoCliente.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteVehiculoCliente=new JScrollPane(this.jListColumnasSelectReporteVehiculoCliente);
			
			this.jScrollColumnasSelectReporteVehiculoCliente.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteVehiculoCliente.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteVehiculoCliente.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteVehiculoCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsVehiculoCliente = new GridBagConstraints();
		this.gridBagConstraintsVehiculoCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVehiculoCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVehiculoCliente.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoVehiculoCliente.add(this.jListColumnasSelectReporteVehiculoCliente, this.gridBagConstraintsVehiculoCliente);
		this.jPanelReporteDinamicoVehiculoCliente.add(this.jScrollColumnasSelectReporteVehiculoCliente, this.gridBagConstraintsVehiculoCliente);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteVehiculoCliente = new JLabelMe();

		this.jLabelRelacionesSelectReporteVehiculoCliente.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteVehiculoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteVehiculoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteVehiculoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteVehiculoCliente = new JList<Reporte>();
		this.jListRelacionesSelectReporteVehiculoCliente.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteVehiculoCliente.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteVehiculoCliente.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteVehiculoCliente.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteVehiculoCliente.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteVehiculoCliente=new JScrollPane(this.jListRelacionesSelectReporteVehiculoCliente);
			
			this.jScrollRelacionesSelectReporteVehiculoCliente.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteVehiculoCliente.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteVehiculoCliente.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteVehiculoCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoVehiculoCliente = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoVehiculoCliente = new JComboBoxMe();
		this.jListColumnasValoresGraficoVehiculoCliente = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoVehiculoCliente = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoVehiculoCliente.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoVehiculoCliente.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoVehiculoCliente.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoVehiculoCliente.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoVehiculoCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoVehiculoCliente = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoVehiculoCliente.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoVehiculoCliente.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoVehiculoCliente.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoVehiculoCliente.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoVehiculoCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoVehiculoCliente = new JLabelMe();

		this.jLabelConGraficoDinamicoVehiculoCliente.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoVehiculoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoVehiculoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoVehiculoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsVehiculoCliente = new GridBagConstraints();
		this.gridBagConstraintsVehiculoCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVehiculoCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVehiculoCliente.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoVehiculoCliente.add(this.jLabelConGraficoDinamicoVehiculoCliente, this.gridBagConstraintsVehiculoCliente);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoVehiculoCliente = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoVehiculoCliente.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoVehiculoCliente.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoVehiculoCliente.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoVehiculoCliente.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoVehiculoCliente.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsVehiculoCliente = new GridBagConstraints();
		this.gridBagConstraintsVehiculoCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVehiculoCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVehiculoCliente.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoVehiculoCliente.add(this.jCheckBoxConGraficoDinamicoVehiculoCliente, this.gridBagConstraintsVehiculoCliente);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoVehiculoCliente = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoVehiculoCliente.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoVehiculoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoVehiculoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoVehiculoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsVehiculoCliente = new GridBagConstraints();
		this.gridBagConstraintsVehiculoCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVehiculoCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVehiculoCliente.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoVehiculoCliente.add(this.jLabelColumnaCategoriaGraficoVehiculoCliente, this.gridBagConstraintsVehiculoCliente);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoVehiculoCliente = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoVehiculoCliente.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoVehiculoCliente.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoVehiculoCliente.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoVehiculoCliente.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoVehiculoCliente.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsVehiculoCliente = new GridBagConstraints();
		this.gridBagConstraintsVehiculoCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVehiculoCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVehiculoCliente.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoVehiculoCliente.add(this.jComboBoxColumnaCategoriaGraficoVehiculoCliente, this.gridBagConstraintsVehiculoCliente);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorVehiculoCliente = new JLabelMe();

		this.jLabelColumnaCategoriaValorVehiculoCliente.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorVehiculoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorVehiculoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorVehiculoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsVehiculoCliente = new GridBagConstraints();
		this.gridBagConstraintsVehiculoCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVehiculoCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVehiculoCliente.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoVehiculoCliente.add(this.jLabelColumnaCategoriaValorVehiculoCliente, this.gridBagConstraintsVehiculoCliente);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorVehiculoCliente = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorVehiculoCliente.setText("Accion");
        this.jComboBoxColumnaCategoriaValorVehiculoCliente.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorVehiculoCliente.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorVehiculoCliente.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorVehiculoCliente.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsVehiculoCliente = new GridBagConstraints();
		this.gridBagConstraintsVehiculoCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVehiculoCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVehiculoCliente.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoVehiculoCliente.add(this.jComboBoxColumnaCategoriaValorVehiculoCliente, this.gridBagConstraintsVehiculoCliente);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoVehiculoCliente = new JLabelMe();

		this.jLabelColumnasValoresGraficoVehiculoCliente.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoVehiculoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoVehiculoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoVehiculoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsVehiculoCliente = new GridBagConstraints();
		this.gridBagConstraintsVehiculoCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVehiculoCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVehiculoCliente.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoVehiculoCliente.add(this.jLabelColumnasValoresGraficoVehiculoCliente, this.gridBagConstraintsVehiculoCliente);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoVehiculoCliente = new JList<Reporte>();
		this.jListColumnasValoresGraficoVehiculoCliente.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoVehiculoCliente.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoVehiculoCliente.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoVehiculoCliente.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoVehiculoCliente.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoVehiculoCliente=new JScrollPane(this.jListColumnasValoresGraficoVehiculoCliente);
			
			this.jScrollColumnasValoresGraficoVehiculoCliente.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoVehiculoCliente.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoVehiculoCliente.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoVehiculoCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsVehiculoCliente = new GridBagConstraints();
		this.gridBagConstraintsVehiculoCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVehiculoCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVehiculoCliente.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoVehiculoCliente.add(this.jListColumnasSelectReporteVehiculoCliente, this.gridBagConstraintsVehiculoCliente);
		this.jPanelReporteDinamicoVehiculoCliente.add(this.jScrollColumnasValoresGraficoVehiculoCliente, this.gridBagConstraintsVehiculoCliente);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoVehiculoCliente = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoVehiculoCliente.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoVehiculoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoVehiculoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoVehiculoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsVehiculoCliente = new GridBagConstraints();
		this.gridBagConstraintsVehiculoCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVehiculoCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVehiculoCliente.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoVehiculoCliente.add(this.jLabelTiposGraficosReportesDinamicoVehiculoCliente, this.gridBagConstraintsVehiculoCliente);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoVehiculoCliente = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoVehiculoCliente.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoVehiculoCliente.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoVehiculoCliente.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoVehiculoCliente.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoVehiculoCliente.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsVehiculoCliente = new GridBagConstraints();
		this.gridBagConstraintsVehiculoCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVehiculoCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVehiculoCliente.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoVehiculoCliente.add(this.jComboBoxTiposGraficosReportesDinamicoVehiculoCliente, this.gridBagConstraintsVehiculoCliente);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoVehiculoCliente = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoVehiculoCliente.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoVehiculoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoVehiculoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoVehiculoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsVehiculoCliente = new GridBagConstraints();
		this.gridBagConstraintsVehiculoCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVehiculoCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVehiculoCliente.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoVehiculoCliente.add(this.jLabelGenerarExcelReporteDinamicoVehiculoCliente, this.gridBagConstraintsVehiculoCliente);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoVehiculoCliente = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoVehiculoCliente.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoVehiculoCliente,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoVehiculoCliente.setToolTipText("Generar EXCEL"+" "+VehiculoClienteConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsVehiculoCliente = new GridBagConstraints();
		//this.gridBagConstraintsVehiculoCliente.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsVehiculoCliente.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsVehiculoCliente.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoVehiculoCliente.add(this.jButtonGenerarExcelReporteDinamicoVehiculoCliente, this.gridBagConstraintsVehiculoCliente);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsVehiculoCliente = new GridBagConstraints();
		this.gridBagConstraintsVehiculoCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVehiculoCliente.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsVehiculoCliente.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoVehiculoCliente.add(this.jComboBoxTiposReportesDinamicoVehiculoCliente, this.gridBagConstraintsVehiculoCliente);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoVehiculoCliente = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoVehiculoCliente.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoVehiculoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoVehiculoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoVehiculoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsVehiculoCliente = new GridBagConstraints();
		this.gridBagConstraintsVehiculoCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVehiculoCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVehiculoCliente.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoVehiculoCliente.add(this.jLabelTiposArchivoReporteDinamicoVehiculoCliente, this.gridBagConstraintsVehiculoCliente);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsVehiculoCliente = new GridBagConstraints();
		this.gridBagConstraintsVehiculoCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVehiculoCliente.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsVehiculoCliente.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoVehiculoCliente.add(this.jComboBoxTiposArchivosReportesDinamicoVehiculoCliente, this.gridBagConstraintsVehiculoCliente);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoVehiculoCliente = new JButtonMe();
		this.jButtonGenerarReporteDinamicoVehiculoCliente.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoVehiculoCliente,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoVehiculoCliente.setToolTipText("Generar"+" "+VehiculoClienteConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsVehiculoCliente = new GridBagConstraints();
		this.gridBagConstraintsVehiculoCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVehiculoCliente.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsVehiculoCliente.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoVehiculoCliente.add(this.jButtonGenerarReporteDinamicoVehiculoCliente, this.gridBagConstraintsVehiculoCliente);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoVehiculoCliente = new JButtonMe();
		this.jButtonCerrarReporteDinamicoVehiculoCliente.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoVehiculoCliente,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoVehiculoCliente.setToolTipText("Cancelar"+" "+VehiculoClienteConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsVehiculoCliente = new GridBagConstraints();
		this.gridBagConstraintsVehiculoCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVehiculoCliente.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsVehiculoCliente.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoVehiculoCliente.add(this.jButtonCerrarReporteDinamicoVehiculoCliente, this.gridBagConstraintsVehiculoCliente);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalVehiculoCliente = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoVehiculoCliente= new JScrollPane(jPanelReporteDinamicoVehiculoCliente,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoVehiculoCliente.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoVehiculoCliente.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoVehiculoCliente.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoVehiculoCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Vehiculo Clientes"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsVehiculoCliente = new GridBagConstraints();
		this.gridBagConstraintsVehiculoCliente.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsVehiculoCliente.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsVehiculoCliente.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoVehiculoCliente.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoVehiculoCliente.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalVehiculoCliente);
		this.jInternalFrameReporteDinamicoVehiculoCliente.getContentPane().add(this.jScrollPanelReporteDinamicoVehiculoCliente, this.gridBagConstraintsVehiculoCliente);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionVehiculoCliente() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionVehiculoCliente = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionVehiculoCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionVehiculoCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionVehiculoCliente.setName("jPanelImportacionVehiculoCliente"); 
		
		this.jPanelImportacionVehiculoCliente.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionVehiculoCliente.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionVehiculoCliente.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionVehiculoCliente.setLayout(gridaBagLayoutImportacionVehiculoCliente);
		
		
		this.jInternalFrameImportacionVehiculoCliente= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionVehiculoCliente= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionVehiculoCliente = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteVehiculoCliente= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionVehiculoCliente.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionVehiculoCliente.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionVehiculoCliente.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionVehiculoCliente.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionVehiculoCliente.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionVehiculoCliente.setResizable(true);
	    this.jInternalFrameImportacionVehiculoCliente.setClosable(true);
	    this.jInternalFrameImportacionVehiculoCliente.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionVehiculoCliente.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionVehiculoCliente.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionVehiculoCliente.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionVehiculoCliente.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionVehiculoCliente.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionVehiculoCliente.setResizable(true);
	    this.jInternalFrameImportacionVehiculoCliente.setClosable(true);
	    this.jInternalFrameImportacionVehiculoCliente.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionVehiculoCliente.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionVehiculoCliente.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionVehiculoCliente.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionVehiculoCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Vehiculo Clientes"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionVehiculoCliente = new JLabelMe();

		this.jLabelArchivoImportacionVehiculoCliente.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionVehiculoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionVehiculoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionVehiculoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsVehiculoCliente = new GridBagConstraints();
		this.gridBagConstraintsVehiculoCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVehiculoCliente.gridy = iPosYImportacion;		
		this.gridBagConstraintsVehiculoCliente.gridx = iPosXImportacion++;
			
		this.jPanelImportacionVehiculoCliente.add(this.jLabelArchivoImportacionVehiculoCliente, this.gridBagConstraintsVehiculoCliente);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionVehiculoCliente = new JFileChooser();		
		this.jFileChooserImportacionVehiculoCliente.setToolTipText("ESCOGER ARCHIVO"+" "+VehiculoClienteConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionVehiculoCliente = new JButtonMe();
		this.jButtonAbrirImportacionVehiculoCliente.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionVehiculoCliente,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionVehiculoCliente.setToolTipText("Generar"+" "+VehiculoClienteConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsVehiculoCliente = new GridBagConstraints();
		this.gridBagConstraintsVehiculoCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVehiculoCliente.gridy = iPosYImportacion;
		this.gridBagConstraintsVehiculoCliente.gridx = iPosXImportacion++;
							
		this.jPanelImportacionVehiculoCliente.add(this.jButtonAbrirImportacionVehiculoCliente, this.gridBagConstraintsVehiculoCliente);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionVehiculoCliente = new JLabelMe();

		this.jLabelPathArchivoImportacionVehiculoCliente.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionVehiculoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionVehiculoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionVehiculoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsVehiculoCliente = new GridBagConstraints();
		this.gridBagConstraintsVehiculoCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVehiculoCliente.gridy = iPosYImportacion;		
		this.gridBagConstraintsVehiculoCliente.gridx = iPosXImportacion++;
			
		this.jPanelImportacionVehiculoCliente.add(this.jLabelPathArchivoImportacionVehiculoCliente, this.gridBagConstraintsVehiculoCliente);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionVehiculoCliente=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionVehiculoCliente.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionVehiculoCliente.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionVehiculoCliente.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsVehiculoCliente = new GridBagConstraints();
		this.gridBagConstraintsVehiculoCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVehiculoCliente.gridy = iPosYImportacion;
		this.gridBagConstraintsVehiculoCliente.gridx = iPosXImportacion++;
							
		this.jPanelImportacionVehiculoCliente.add(this.jTextFieldPathArchivoImportacionVehiculoCliente, this.gridBagConstraintsVehiculoCliente);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionVehiculoCliente = new JButtonMe();
		this.jButtonGenerarImportacionVehiculoCliente.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionVehiculoCliente,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionVehiculoCliente.setToolTipText("Generar"+" "+VehiculoClienteConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsVehiculoCliente = new GridBagConstraints();
		this.gridBagConstraintsVehiculoCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVehiculoCliente.gridy = iPosYImportacion;
		this.gridBagConstraintsVehiculoCliente.gridx = iPosXImportacion++;
							
		this.jPanelImportacionVehiculoCliente.add(this.jButtonGenerarImportacionVehiculoCliente, this.gridBagConstraintsVehiculoCliente);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionVehiculoCliente = new JButtonMe();
		this.jButtonCerrarImportacionVehiculoCliente.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionVehiculoCliente,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionVehiculoCliente.setToolTipText("Cancelar"+" "+VehiculoClienteConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsVehiculoCliente = new GridBagConstraints();
		this.gridBagConstraintsVehiculoCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVehiculoCliente.gridy = iPosYImportacion;
		this.gridBagConstraintsVehiculoCliente.gridx = iPosXImportacion++;
							
		this.jPanelImportacionVehiculoCliente.add(this.jButtonCerrarImportacionVehiculoCliente, this.gridBagConstraintsVehiculoCliente);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalVehiculoCliente = new GridBagLayout();
		
		this.jScrollPanelImportacionVehiculoCliente= new JScrollPane(jPanelImportacionVehiculoCliente,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsVehiculoCliente = new GridBagConstraints();
		this.gridBagConstraintsVehiculoCliente.gridy =iPosYImportacion;
		this.gridBagConstraintsVehiculoCliente.gridx =iPosXImportacion;
		this.gridBagConstraintsVehiculoCliente.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionVehiculoCliente.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionVehiculoCliente.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalVehiculoCliente);
		this.jInternalFrameImportacionVehiculoCliente.getContentPane().add(this.jScrollPanelImportacionVehiculoCliente, this.gridBagConstraintsVehiculoCliente);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByVehiculoCliente(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByVehiculoCliente = new JButtonMe();
			this.jButtonAbrirOrderByVehiculoCliente.setText("Orden");
			this.jButtonAbrirOrderByVehiculoCliente.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByVehiculoCliente,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByVehiculoCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByVehiculoCliente";
			inputMap = this.jButtonAbrirOrderByVehiculoCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByVehiculoCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByVehiculoCliente"));
		
		
			GridBagLayout gridaBagLayoutOrderByVehiculoCliente = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByVehiculoCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByVehiculoCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByVehiculoCliente.setName("jPanelOrderByVehiculoCliente"); 
			
			this.jPanelOrderByVehiculoCliente.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByVehiculoCliente.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByVehiculoCliente.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByVehiculoCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByVehiculoCliente.setLayout(gridaBagLayoutOrderByVehiculoCliente);
			
			
			this.jTableDatosVehiculoClienteOrderBy = new JTableMe();        
			this.jTableDatosVehiculoClienteOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosVehiculoClienteOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosVehiculoClienteOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosVehiculoClienteOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosVehiculoClienteOrderBy.setViewportView(this.jTableDatosVehiculoClienteOrderBy);
			this.jTableDatosVehiculoClienteOrderBy.setFillsViewportHeight(true);
			this.jTableDatosVehiculoClienteOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByVehiculoCliente= new OrderByJInternalFrame();
			this.jInternalFrameOrderByVehiculoCliente= new OrderByJInternalFrame();
			this.jScrollPanelOrderByVehiculoCliente = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteVehiculoCliente= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByVehiculoCliente.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByVehiculoCliente.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByVehiculoCliente.setTitle("Orden");
			this.jInternalFrameOrderByVehiculoCliente.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByVehiculoCliente.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByVehiculoCliente.setResizable(true);
			this.jInternalFrameOrderByVehiculoCliente.setClosable(true);
			this.jInternalFrameOrderByVehiculoCliente.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByVehiculoCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByVehiculoCliente.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByVehiculoCliente.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByVehiculoCliente.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByVehiculoCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByVehiculoCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Vehiculo Clientes"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsVehiculoCliente = new GridBagConstraints();
			this.gridBagConstraintsVehiculoCliente.gridy =iPosYOrderBy++;
			this.gridBagConstraintsVehiculoCliente.gridx =iPosXOrderBy;
			this.gridBagConstraintsVehiculoCliente.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsVehiculoCliente.ipady =150;
				
			this.jPanelOrderByVehiculoCliente.add(jScrollPanelDatosVehiculoClienteOrderBy, this.gridBagConstraintsVehiculoCliente);//this.jTableDatosVehiculoClienteTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByVehiculoCliente = new JButtonMe();
			this.jButtonCerrarOrderByVehiculoCliente.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByVehiculoCliente,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByVehiculoCliente.setToolTipText("Cancelar"+" "+VehiculoClienteConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByVehiculoCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsVehiculoCliente = new GridBagConstraints();
			this.gridBagConstraintsVehiculoCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVehiculoCliente.gridy = iPosYOrderBy++;
			this.gridBagConstraintsVehiculoCliente.gridx = iPosXOrderBy;
									
			this.jPanelOrderByVehiculoCliente.add(this.jButtonCerrarOrderByVehiculoCliente, this.gridBagConstraintsVehiculoCliente);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalVehiculoCliente = new GridBagLayout();
			
			this.jScrollPanelOrderByVehiculoCliente= new JScrollPane(jPanelOrderByVehiculoCliente,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsVehiculoCliente = new GridBagConstraints();
			this.gridBagConstraintsVehiculoCliente.gridy =iPosYOrderBy;
			this.gridBagConstraintsVehiculoCliente.gridx =iPosXOrderBy;
			this.gridBagConstraintsVehiculoCliente.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByVehiculoCliente.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByVehiculoCliente.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalVehiculoCliente);
			
			this.jInternalFrameOrderByVehiculoCliente.getContentPane().add(this.jScrollPanelOrderByVehiculoCliente, this.gridBagConstraintsVehiculoCliente);			
		
		} else {
			this.jButtonAbrirOrderByVehiculoCliente = new JButtonMe();
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
		int iWidthTableCalculado=0;//2030
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=1030;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1000;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.vehiculoclienteSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosVehiculoCliente.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosVehiculoCliente.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosVehiculoCliente.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosVehiculoCliente.getRowHeight();//VehiculoClienteConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.vehiculoclienteSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > VehiculoClienteConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaVehiculoCliente.isSelected()) {
					iHeightTable=VehiculoClienteConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < VehiculoClienteConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=VehiculoClienteConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > VehiculoClienteConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaVehiculoCliente.isSelected()) {
					iHeightTable=VehiculoClienteConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < VehiculoClienteConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=VehiculoClienteConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosVehiculoCliente.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosVehiculoCliente.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosVehiculoCliente.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosVehiculoCliente.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosVehiculoCliente.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosVehiculoCliente.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByVehiculoCliente!=null && this.jInternalFrameOrderByVehiculoCliente.getjTableDatosOrderBy()!=null) {
			//if(!this.vehiculoclienteSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByVehiculoCliente.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByVehiculoCliente.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByVehiculoCliente.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByVehiculoCliente.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByVehiculoCliente.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByVehiculoCliente.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByVehiculoCliente.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosVehiculoCliente.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosVehiculoCliente.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosVehiculoCliente.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=vehiculoclienteLogic.getVehiculoClientes().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=vehiculoclientes.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<VehiculoCliente> TraerVehiculoClienteBeans(List<VehiculoCliente> vehiculoclientes,ArrayList<Classe> classes)throws Exception {
		try {
			for(VehiculoCliente vehiculocliente:vehiculoclientes) {
					
				if(!(VehiculoClienteConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || VehiculoClienteConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					vehiculocliente.setsDetalleGeneralEntityReporte(VehiculoClienteConstantesFunciones.getVehiculoClienteDescripcion(vehiculocliente));
										
					vehiculocliente.setes_prendado_descripcion(VehiculoClienteConstantesFunciones.getes_prendadoDescripcion(vehiculocliente));	
					
						
					
				} else  {
							
					//vehiculocliente.setsDetalleGeneralEntityReporte(vehiculocliente.getsDetalleGeneralEntityReporte());
										
				}
				
				//vehiculoclientebeans.add(vehiculoclientebean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return vehiculoclientes;
    }
	//PARA REPORTES FIN
}
