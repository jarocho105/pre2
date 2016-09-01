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
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;

import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;

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
import com.bydan.erp.facturacion.util.PoliticaClienteConstantesFunciones;

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
public class PoliticaClienteJInternalFrame extends PoliticaClienteBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarPoliticaCliente;
	
	protected JMenuBar jmenuBarPoliticaCliente;
	
	protected JMenu jmenuPoliticaCliente;
	protected JMenu jmenuDatosPoliticaCliente;
	protected JMenu jmenuArchivoPoliticaCliente;
	protected JMenu jmenuAccionesPoliticaCliente;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosPoliticaCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutPoliticaCliente;	
	protected GridBagConstraints gridBagConstraintsPoliticaCliente;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public PoliticaClienteDetalleFormJInternalFrame jInternalFrameDetalleFormPoliticaCliente;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoPoliticaCliente;	
	protected ImportacionJInternalFrame jInternalFrameImportacionPoliticaCliente;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cliente="";
	
	public PoliticaClienteSessionBean politicaclienteSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public ClienteSessionBean clienteSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<PoliticaCliente> politicaclientes;		
	public List<PoliticaCliente> politicaclientesEliminados;	
	public List<PoliticaCliente> politicaclientesAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByPoliticaCliente;		
	protected JButton jButtonAbrirOrderByPoliticaCliente;
	
	
	//protected JPanel jPanelOrderByPoliticaCliente;
	//public JScrollPane jScrollPanelOrderByPoliticaCliente;	
	//protected JButton jButtonCerrarOrderByPoliticaCliente;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public PoliticaClienteLogic politicaclienteLogic;
	
	
	
	public JScrollPane jScrollPanelDatosPoliticaCliente;
	public JScrollPane jScrollPanelDatosEdicionPoliticaCliente;
	public JScrollPane jScrollPanelDatosGeneralPoliticaCliente;
    
	
	
	//public JScrollPane jScrollPanelDatosPoliticaClienteOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoPoliticaCliente;
	//public JScrollPane jScrollPanelImportacionPoliticaCliente;
	
	
	
	protected JPanel jPanelAccionesPoliticaCliente;
	
    protected JPanel jPanelPaginacionPoliticaCliente;
    protected JPanel jPanelParametrosReportesPoliticaCliente;
	protected JPanel jPanelParametrosReportesAccionesPoliticaCliente;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1PoliticaCliente;
	protected JPanel jPanelParametrosAuxiliar2PoliticaCliente;
	protected JPanel jPanelParametrosAuxiliar3PoliticaCliente;
	protected JPanel jPanelParametrosAuxiliar4PoliticaCliente;
	//protected JPanel jPanelParametrosAuxiliar5PoliticaCliente;
	
	
	
	//protected JPanel jPanelReporteDinamicoPoliticaCliente;
	//protected JPanel jPanelImportacionPoliticaCliente;
	
	
	public JTable jTableDatosPoliticaCliente;
	
	
	
	//public JTable jTableDatosPoliticaClienteOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoPoliticaCliente;
	protected JButton jButtonDuplicarPoliticaCliente;
	protected JButton jButtonCopiarPoliticaCliente;
	protected JButton jButtonVerFormPoliticaCliente;
	protected JButton jButtonNuevoRelacionesPoliticaCliente;
	protected JButton jButtonModificarPoliticaCliente;
	
    protected JButton jButtonGuardarCambiosTablaPoliticaCliente;
	protected JButton jButtonCerrarPoliticaCliente;
	
	
	protected JButton jButtonRecargarInformacionPoliticaCliente;
	protected JButton jButtonProcesarInformacionPoliticaCliente;
	
	
	protected JButton jButtonAnterioresPoliticaCliente;
	protected JButton jButtonSiguientesPoliticaCliente;
	protected JButton jButtonNuevoGuardarCambiosPoliticaCliente;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoPoliticaCliente;
	//protected JButton jButtonCerrarReporteDinamicoPoliticaCliente;
	//protected JButton jButtonGenerarExcelReporteDinamicoPoliticaCliente;	
	
	
	
	//protected JButton jButtonAbrirImportacionPoliticaCliente;
	//protected JButton jButtonGenerarImportacionPoliticaCliente;
	//protected JButton jButtonCerrarImportacionPoliticaCliente;
	//protected JFileChooser jFileChooserImportacionPoliticaCliente;
	//protected File fileImportacionPoliticaCliente;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarPoliticaCliente;
	protected JButton jButtonDuplicarToolBarPoliticaCliente;
	protected JButton jButtonNuevoRelacionesToolBarPoliticaCliente;
	
	
	public JButton jButtonGuardarCambiosToolBarPoliticaCliente;
	protected JButton jButtonCopiarToolBarPoliticaCliente;
	protected JButton jButtonVerFormToolBarPoliticaCliente;
	public JButton jButtonGuardarCambiosTablaToolBarPoliticaCliente;
	protected JButton jButtonMostrarOcultarTablaToolBarPoliticaCliente;
	protected JButton jButtonCerrarToolBarPoliticaCliente;
	
	protected JButton jButtonRecargarInformacionToolBarPoliticaCliente;
	protected JButton jButtonProcesarInformacionToolBarPoliticaCliente;
	protected JButton jButtonAnterioresToolBarPoliticaCliente;
	protected JButton jButtonSiguientesToolBarPoliticaCliente;
	protected JButton jButtonNuevoGuardarCambiosToolBarPoliticaCliente;
	protected JButton jButtonAbrirOrderByToolBarPoliticaCliente;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoPoliticaCliente;
	protected JMenuItem jMenuItemDuplicarPoliticaCliente;
	protected JMenuItem jMenuItemNuevoRelacionesPoliticaCliente;
	
	
	protected JMenuItem jMenuItemGuardarCambiosPoliticaCliente;
	protected JMenuItem jMenuItemCopiarPoliticaCliente;
	protected JMenuItem jMenuItemVerFormPoliticaCliente;
	protected JMenuItem jMenuItemGuardarCambiosTablaPoliticaCliente;
	protected JMenuItem jMenuItemCerrarPoliticaCliente;
	protected JMenuItem jMenuItemDetalleCerrarPoliticaCliente;
	protected JMenuItem jMenuItemDetalleAbrirOrderByPoliticaCliente;
	protected JMenuItem jMenuItemDetalleMostarOcultarPoliticaCliente;
	
	protected JMenuItem jMenuItemRecargarInformacionPoliticaCliente;
	protected JMenuItem jMenuItemProcesarInformacionPoliticaCliente;
	protected JMenuItem jMenuItemAnterioresPoliticaCliente;
	protected JMenuItem jMenuItemSiguientesPoliticaCliente;
	protected JMenuItem jMenuItemNuevoGuardarCambiosPoliticaCliente;
	protected JMenuItem jMenuItemAbrirOrderByPoliticaCliente;
	protected JMenuItem jMenuItemMostrarOcultarPoliticaCliente;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesPoliticaCliente;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosPoliticaCliente;
	protected JCheckBox jCheckBoxSeleccionadosPoliticaCliente;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaPoliticaCliente;
	protected JCheckBox jCheckBoxConGraficoReportePoliticaCliente;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesPoliticaCliente;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesPoliticaCliente;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoPoliticaCliente;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoPoliticaCliente;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesPoliticaCliente;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionPoliticaCliente;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesPoliticaCliente;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesPoliticaCliente;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarPoliticaCliente;
	protected JTextField jTextFieldValorCampoGeneralPoliticaCliente;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReportePoliticaCliente;
	//public JList<Reporte> jListColumnasSelectReportePoliticaCliente;
	//public JScrollPane jScrollColumnasSelectReportePoliticaCliente;
	
	//public JLabel jLabelRelacionesSelectReportePoliticaCliente;
	//public JList<Reporte> jListRelacionesSelectReportePoliticaCliente;
	//public JScrollPane jScrollRelacionesSelectReportePoliticaCliente;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoPoliticaCliente;
	//protected JCheckBox jCheckBoxConGraficoDinamicoPoliticaCliente;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoPoliticaCliente;
	//public JLabel jLabelTiposArchivoReporteDinamicoPoliticaCliente;
	
		
	//public JLabel jLabelArchivoImportacionPoliticaCliente;	
	//public JLabel jLabelPathArchivoImportacionPoliticaCliente;
	//protected JTextField jTextFieldPathArchivoImportacionPoliticaCliente;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoPoliticaCliente;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoPoliticaCliente;
	
	//public JLabel jLabelColumnaCategoriaValorPoliticaCliente;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorPoliticaCliente;
	
	//public JLabel jLabelColumnasValoresGraficoPoliticaCliente;
	//public JList<Reporte> jListColumnasValoresGraficoPoliticaCliente;
	//public JScrollPane jScrollColumnasValoresGraficoPoliticaCliente;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoPoliticaCliente;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoPoliticaCliente;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasPoliticaCliente;
	public JPanel jPanelFK_IdClientePoliticaCliente;
	public JButton jButtonFK_IdClientePoliticaCliente;
	
	public JPanel jPanelid_clienteFK_IdClientePoliticaCliente;
	public JLabel jLabelid_clienteFK_IdClientePoliticaCliente;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_clienteFK_IdClientePoliticaCliente;
	public JButton jButtonid_clienteFK_IdClientePoliticaCliente= new JButtonMe();
	public JButton jButtonid_clienteFK_IdClientePoliticaClienteUpdate= new JButtonMe();
	public JButton jButtonid_clienteFK_IdClientePoliticaClienteBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdClienteid_clientePoliticaCliente;
	
	
	
	
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
	//public int iHeightFormulario=198;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public PoliticaClienteJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("PoliticaCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PoliticaClienteJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("PoliticaCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PoliticaClienteJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("PoliticaCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PoliticaClienteJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("PoliticaCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionPoliticaCliente)	{
		this.jButtonRecargarInformacionPoliticaCliente = jButtonRecargarInformacionPoliticaCliente;
	}
	
	public JButton getjButtonProcesarInformacionPoliticaCliente() {
		return this.jButtonProcesarInformacionPoliticaCliente;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionPoliticaCliente)	{
		this.jButtonProcesarInformacionPoliticaCliente = jButtonProcesarInformacionPoliticaCliente;
	}
	
	
	public JButton getjButtonRecargarInformacionPoliticaCliente() {
		return this.jButtonRecargarInformacionPoliticaCliente;
	}
	
	
	public List<PoliticaCliente> getpoliticaclientes() {
		return this.politicaclientes;
	}

	public void setpoliticaclientes(List<PoliticaCliente> politicaclientes) {
		this.politicaclientes = politicaclientes;
	}
	
	public List<PoliticaCliente> getpoliticaclientesAux() {
		return this.politicaclientesAux;
	}

	public void setpoliticaclientesAux(List<PoliticaCliente> politicaclientesAux) {
		this.politicaclientesAux = politicaclientesAux;
	}
	
	public List<PoliticaCliente> getpoliticaclientesEliminados() {
		return this.politicaclientesEliminados;
	}

	public void setPoliticaClientesEliminados(List<PoliticaCliente> politicaclientesEliminados) {
		this.politicaclientesEliminados = politicaclientesEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarPoliticaCliente() {
		return jComboBoxTiposSeleccionarPoliticaCliente;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarPoliticaCliente(
			JComboBox jComboBoxTiposSeleccionarPoliticaCliente) {
		this.jComboBoxTiposSeleccionarPoliticaCliente = jComboBoxTiposSeleccionarPoliticaCliente;
	}
	
	public void setBorderResaltarTiposSeleccionarPoliticaCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarPoliticaCliente.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarPoliticaCliente .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralPoliticaCliente() {
		return jTextFieldValorCampoGeneralPoliticaCliente;
	}

	public void setjTextFieldValorCampoGeneralPoliticaCliente(
			JTextField jTextFieldValorCampoGeneralPoliticaCliente) {
		this.jTextFieldValorCampoGeneralPoliticaCliente = jTextFieldValorCampoGeneralPoliticaCliente;
	}

	public void setBorderResaltarValorCampoGeneralPoliticaCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPoliticaCliente.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralPoliticaCliente .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosPoliticaCliente() {
		return this.jCheckBoxSeleccionarTodosPoliticaCliente;
	}

	public void setjCheckBoxSeleccionarTodosPoliticaCliente(
			JCheckBox jCheckBoxSeleccionarTodosPoliticaCliente) {
		this.jCheckBoxSeleccionarTodosPoliticaCliente = jCheckBoxSeleccionarTodosPoliticaCliente;
	}

	public void setBorderResaltarSeleccionarTodosPoliticaCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPoliticaCliente.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosPoliticaCliente .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosPoliticaCliente() {
		return this.jCheckBoxSeleccionadosPoliticaCliente;
	}

	public void setjCheckBoxSeleccionadosPoliticaCliente(
			JCheckBox jCheckBoxSeleccionadosPoliticaCliente) {
		this.jCheckBoxSeleccionadosPoliticaCliente = jCheckBoxSeleccionadosPoliticaCliente;
	}
	
	public void setBorderResaltarSeleccionadosPoliticaCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPoliticaCliente.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosPoliticaCliente .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesPoliticaCliente() {
		return this.jComboBoxTiposArchivosReportesPoliticaCliente;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesPoliticaCliente(
			JComboBox jComboBoxTiposArchivosReportesPoliticaCliente) {
		this.jComboBoxTiposArchivosReportesPoliticaCliente = jComboBoxTiposArchivosReportesPoliticaCliente;
	}

	public void setBorderResaltarTiposArchivosReportesPoliticaCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPoliticaCliente.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesPoliticaCliente .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesPoliticaCliente() {
		return this.jComboBoxTiposReportesPoliticaCliente;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesPoliticaCliente(
			JComboBox jComboBoxTiposReportesPoliticaCliente) {
		this.jComboBoxTiposReportesPoliticaCliente = jComboBoxTiposReportesPoliticaCliente;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoPoliticaCliente() {
	//	return jComboBoxTiposReportesDinamicoPoliticaCliente;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoPoliticaCliente(
	//		JComboBox jComboBoxTiposReportesDinamicoPoliticaCliente) {
	//	this.jComboBoxTiposReportesDinamicoPoliticaCliente = jComboBoxTiposReportesDinamicoPoliticaCliente;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoPoliticaCliente() {
	//	return jComboBoxTiposArchivosReportesDinamicoPoliticaCliente;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoPoliticaCliente(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoPoliticaCliente) {
	//	this.jComboBoxTiposArchivosReportesDinamicoPoliticaCliente = jComboBoxTiposArchivosReportesDinamicoPoliticaCliente;
	//}
	
	public void setBorderResaltarTiposReportesPoliticaCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPoliticaCliente.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesPoliticaCliente .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesPoliticaCliente() {
		return this.jComboBoxTiposGraficosReportesPoliticaCliente;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesPoliticaCliente(
			JComboBox jComboBoxTiposGraficosReportesPoliticaCliente) {
		this.jComboBoxTiposGraficosReportesPoliticaCliente = jComboBoxTiposGraficosReportesPoliticaCliente;
	}
	
	public void setBorderResaltarTiposGraficosReportesPoliticaCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPoliticaCliente.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesPoliticaCliente .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionPoliticaCliente() {
		return this.jComboBoxTiposPaginacionPoliticaCliente;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionPoliticaCliente(
			JComboBox jComboBoxTiposPaginacionPoliticaCliente) {
		this.jComboBoxTiposPaginacionPoliticaCliente = jComboBoxTiposPaginacionPoliticaCliente;
	}
	
	public void setBorderResaltarTiposPaginacionPoliticaCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPoliticaCliente.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionPoliticaCliente .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesPoliticaCliente() {
		return this.jComboBoxTiposRelacionesPoliticaCliente;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesPoliticaCliente() {
		return this.jComboBoxTiposAccionesPoliticaCliente;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesPoliticaCliente(
			JComboBox jComboBoxTiposRelacionesPoliticaCliente) {
		this.jComboBoxTiposRelacionesPoliticaCliente = jComboBoxTiposRelacionesPoliticaCliente;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesPoliticaCliente(
			JComboBox jComboBoxTiposAccionesPoliticaCliente) {
		this.jComboBoxTiposAccionesPoliticaCliente = jComboBoxTiposAccionesPoliticaCliente;
	}
	
	public void setBorderResaltarTiposRelacionesPoliticaCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPoliticaCliente.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesPoliticaCliente .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesPoliticaCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPoliticaCliente.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesPoliticaCliente .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoPoliticaCliente() {
	//	return jCheckBoxConGraficoDinamicoPoliticaCliente;
	//}

	//public void setjCheckBoxConGraficoDinamicoPoliticaCliente(
	//		JCheckBox jCheckBoxConGraficoDinamicoPoliticaCliente) {
	//	this.jCheckBoxConGraficoDinamicoPoliticaCliente = jCheckBoxConGraficoDinamicoPoliticaCliente;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoPoliticaCliente() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarPoliticaCliente.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoPoliticaCliente .setBorder(borderResaltar);		
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
		this.politicaclienteSessionBean=new PoliticaClienteSessionBean();
		
		this.politicaclienteSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.politicaclienteSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.politicaclienteSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=PoliticaClienteJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=PoliticaClienteJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		PoliticaClienteJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		PoliticaClienteJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		PoliticaClienteJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Politica Cliente MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.politicaclienteSessionBean.getEsGuardarRelacionado()) {
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
		
		PoliticaClienteJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("PoliticaCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarPoliticaCliente= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarPoliticaCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarPoliticaCliente,this.jTtoolBarPoliticaCliente,
							"nuevo","nuevo","Nuevo"+" "+PoliticaClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarPoliticaCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarPoliticaCliente,this.jTtoolBarPoliticaCliente,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarPoliticaCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarPoliticaCliente,this.jTtoolBarPoliticaCliente,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+PoliticaClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarPoliticaCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarPoliticaCliente,this.jTtoolBarPoliticaCliente,
							"duplicar","duplicar","Duplicar"+" "+PoliticaClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarPoliticaCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarPoliticaCliente,this.jTtoolBarPoliticaCliente,
							"copiar","copiar","Copiar"+" "+PoliticaClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarPoliticaCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarPoliticaCliente,this.jTtoolBarPoliticaCliente,
							"ver_form","ver_form","Ver"+" "+PoliticaClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarPoliticaCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarPoliticaCliente,this.jTtoolBarPoliticaCliente,
							"recargar","recargar","Recargar"+" "+PoliticaClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarPoliticaCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarPoliticaCliente,this.jTtoolBarPoliticaCliente,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarPoliticaCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarPoliticaCliente,this.jTtoolBarPoliticaCliente,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarPoliticaCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarPoliticaCliente,this.jTtoolBarPoliticaCliente,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarPoliticaCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarPoliticaCliente,this.jTtoolBarPoliticaCliente,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarPoliticaCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarPoliticaCliente,this.jTtoolBarPoliticaCliente,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+PoliticaClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarPoliticaCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarPoliticaCliente,this.jTtoolBarPoliticaCliente,
							"cerrar","cerrar","Salir"+" "+PoliticaClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarPoliticaCliente=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarPoliticaCliente;
			
				this.jButtonProcesarInformacionToolBarPoliticaCliente=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarPoliticaCliente;
				
		//protected JButton jButtonModificarToolBarPoliticaCliente;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarPoliticaCliente=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuPoliticaCliente=new JMenuMe("General");
		this.jmenuArchivoPoliticaCliente=new JMenuMe("Archivo");
		this.jmenuAccionesPoliticaCliente=new JMenuMe("Acciones");
		this.jmenuDatosPoliticaCliente=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoPoliticaCliente= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoPoliticaCliente.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoPoliticaCliente,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoPoliticaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarPoliticaCliente= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarPoliticaCliente.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarPoliticaCliente,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarPoliticaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesPoliticaCliente= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesPoliticaCliente.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesPoliticaCliente,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesPoliticaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosPoliticaCliente= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosPoliticaCliente.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosPoliticaCliente,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosPoliticaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarPoliticaCliente= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarPoliticaCliente.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarPoliticaCliente,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarPoliticaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormPoliticaCliente= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormPoliticaCliente.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormPoliticaCliente,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormPoliticaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaPoliticaCliente= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaPoliticaCliente.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaPoliticaCliente,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaPoliticaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarPoliticaCliente= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarPoliticaCliente.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarPoliticaCliente,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarPoliticaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionPoliticaCliente= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionPoliticaCliente.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionPoliticaCliente,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionPoliticaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionPoliticaCliente= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionPoliticaCliente.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionPoliticaCliente,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresPoliticaCliente= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresPoliticaCliente.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresPoliticaCliente,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresPoliticaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesPoliticaCliente= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesPoliticaCliente.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesPoliticaCliente,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesPoliticaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByPoliticaCliente= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByPoliticaCliente.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByPoliticaCliente,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByPoliticaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarPoliticaCliente= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarPoliticaCliente.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarPoliticaCliente,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarPoliticaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByPoliticaCliente= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByPoliticaCliente.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByPoliticaCliente,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByPoliticaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarPoliticaCliente= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarPoliticaCliente.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarPoliticaCliente,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarPoliticaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosPoliticaCliente= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosPoliticaCliente.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosPoliticaCliente,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosPoliticaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoPoliticaCliente.add(this.jMenuItemCerrarPoliticaCliente);
			
			this.jmenuAccionesPoliticaCliente.add(this.jMenuItemNuevoPoliticaCliente);
			this.jmenuAccionesPoliticaCliente.add(this.jMenuItemNuevoGuardarCambiosPoliticaCliente);
			this.jmenuAccionesPoliticaCliente.add(this.jMenuItemNuevoRelacionesPoliticaCliente);
			this.jmenuAccionesPoliticaCliente.add(this.jMenuItemGuardarCambiosTablaPoliticaCliente);		
			this.jmenuAccionesPoliticaCliente.add(this.jMenuItemDuplicarPoliticaCliente);		
			this.jmenuAccionesPoliticaCliente.add(this.jMenuItemCopiarPoliticaCliente);		
			this.jmenuAccionesPoliticaCliente.add(this.jMenuItemVerFormPoliticaCliente);		
			
			this.jmenuDatosPoliticaCliente.add(this.jMenuItemRecargarInformacionPoliticaCliente);				
			this.jmenuDatosPoliticaCliente.add(this.jMenuItemAnterioresPoliticaCliente);				
			this.jmenuDatosPoliticaCliente.add(this.jMenuItemSiguientesPoliticaCliente);				
			this.jmenuDatosPoliticaCliente.add(this.jMenuItemAbrirOrderByPoliticaCliente);				
			this.jmenuDatosPoliticaCliente.add(this.jMenuItemMostrarOcultarPoliticaCliente);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesPoliticaCliente.add(this.jMenuItemGuardarCambiosPoliticaCliente);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoPoliticaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesPoliticaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosPoliticaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarPoliticaCliente.add(this.jmenuArchivoPoliticaCliente);		
			this.jmenuBarPoliticaCliente.add(this.jmenuAccionesPoliticaCliente);		
			this.jmenuBarPoliticaCliente.add(this.jmenuDatosPoliticaCliente);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarPoliticaCliente);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasPoliticaCliente() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdClientePoliticaCliente=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdClientePoliticaCliente.setToolTipText("Buscar Por Cliente ");
		this.jButtonFK_IdClientePoliticaCliente= new JButtonMe();
		this.jButtonFK_IdClientePoliticaCliente.setText("Buscar");
		this.jButtonFK_IdClientePoliticaCliente.setToolTipText("Buscar Por Cliente ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdClientePoliticaCliente,"buscar_button","Buscar Por Cliente ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdClientePoliticaCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_clienteFK_IdClientePoliticaCliente = new JLabelMe();
		jLabelid_clienteFK_IdClientePoliticaCliente.setText("Cliente :");
		jLabelid_clienteFK_IdClientePoliticaCliente.setToolTipText("Cliente");
		jLabelid_clienteFK_IdClientePoliticaCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_clienteFK_IdClientePoliticaCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_clienteFK_IdClientePoliticaCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_clienteFK_IdClientePoliticaCliente,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_clienteFK_IdClientePoliticaCliente= new JComboBoxMe();
		jComboBoxid_clienteFK_IdClientePoliticaCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteFK_IdClientePoliticaCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteFK_IdClientePoliticaCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_clienteFK_IdClientePoliticaCliente,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdClienteid_clientePoliticaCliente= new JButtonMe();
		this.jButtonBuscarFK_IdClienteid_clientePoliticaCliente.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdClienteid_clientePoliticaCliente.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdClienteid_clientePoliticaCliente.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdClienteid_clientePoliticaCliente.setText("Buscar");
		this.jButtonBuscarFK_IdClienteid_clientePoliticaCliente.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdClienteid_clientePoliticaCliente.setFocusable(false);


		this.jTabbedPaneBusquedasPoliticaCliente=new JTabbedPane();


		this.jTabbedPaneBusquedasPoliticaCliente.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasPoliticaCliente.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasPoliticaCliente.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasPoliticaCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasPoliticaCliente.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasPoliticaCliente,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetallePoliticaCliente = new PoliticaClienteDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Politica Cliente DATOS");
			this.jInternalFrameDetalleFormPoliticaCliente = new PoliticaClienteDetalleFormJInternalFrame(jDesktopPane,this.politicaclienteSessionBean.getConGuardarRelaciones(),this.politicaclienteSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormPoliticaCliente = null;//new PoliticaClienteDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutPoliticaCliente= new GridBagLayout();
		
		
		this.jTableDatosPoliticaCliente = new JTableMe();      
		
		String sToolTipPoliticaCliente="";
		sToolTipPoliticaCliente=PoliticaClienteConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipPoliticaCliente+="(Facturacion.PoliticaCliente)";
		}
		
		if(!this.politicaclienteSessionBean.getEsGuardarRelacionado()) {
			sToolTipPoliticaCliente+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosPoliticaCliente.setToolTipText(sToolTipPoliticaCliente);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosPoliticaCliente);
		this.jTableDatosPoliticaCliente.setAutoCreateRowSorter(true);
		this.jTableDatosPoliticaCliente.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosPoliticaCliente.setRowSelectionAllowed(true);
		this.jTableDatosPoliticaCliente.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosPoliticaCliente,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoPoliticaCliente = new JButtonMe();
		this.jButtonDuplicarPoliticaCliente = new JButtonMe();
		this.jButtonCopiarPoliticaCliente = new JButtonMe();
		this.jButtonVerFormPoliticaCliente = new JButtonMe();
		this.jButtonNuevoRelacionesPoliticaCliente = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaPoliticaCliente = new JButtonMe();
		this.jButtonCerrarPoliticaCliente = new JButtonMe();
		
		this.jScrollPanelDatosPoliticaCliente = new JScrollPane();   
        this.jScrollPanelDatosGeneralPoliticaCliente = new JScrollPane();
		
				
		
		
		this.jPanelAccionesPoliticaCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Politica Cliente";
		
		if(!this.politicaclienteSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosPoliticaCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Politica Clientes" + this.sPath));
		} else {
			this.jScrollPanelDatosPoliticaCliente.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralPoliticaCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesPoliticaCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesPoliticaCliente.setToolTipText("Acciones");
        this.jPanelAccionesPoliticaCliente.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralPoliticaCliente, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosPoliticaCliente, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoPoliticaCliente=new ReporteDinamicoJInternalFrame(PoliticaClienteConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoPoliticaCliente();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionPoliticaCliente=new ImportacionJInternalFrame(PoliticaClienteConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionPoliticaCliente();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByPoliticaCliente = new JButtonMe();
		
		this.jButtonAbrirOrderByPoliticaCliente.setText("Orden");
		this.jButtonAbrirOrderByPoliticaCliente.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByPoliticaCliente,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByPoliticaCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByPoliticaCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByPoliticaCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByPoliticaCliente=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPoliticaCliente,false,this);
			
			//this.cargarOrderByPoliticaCliente(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByPoliticaCliente=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPoliticaCliente,true,this);
			
			//this.cargarOrderByPoliticaCliente(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosPoliticaCliente.setMinimumSize(new Dimension(400,50));//330
		this.jTableDatosPoliticaCliente.setMaximumSize(new Dimension(400,50));//330
		this.jTableDatosPoliticaCliente.setPreferredSize(new Dimension(400,50));//330
		
		this.jScrollPanelDatosPoliticaCliente.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosPoliticaCliente.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosPoliticaCliente.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoPoliticaCliente.setText("Nuevo");
		this.jButtonDuplicarPoliticaCliente.setText("Duplicar");
		this.jButtonCopiarPoliticaCliente.setText("Copiar");
		this.jButtonVerFormPoliticaCliente.setText("Ver");
		this.jButtonNuevoRelacionesPoliticaCliente.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaPoliticaCliente.setText("Guardar");
		this.jButtonCerrarPoliticaCliente.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoPoliticaCliente,"nuevo_button","Nuevo",this.politicaclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarPoliticaCliente,"duplicar_button","Duplicar",this.politicaclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarPoliticaCliente,"copiar_button","Copiar",this.politicaclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormPoliticaCliente,"ver_form","Ver",this.politicaclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesPoliticaCliente,"nuevorelaciones_button","Nuevo Rel",this.politicaclienteSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaPoliticaCliente,"guardarcambiostabla_button","Guardar",this.politicaclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarPoliticaCliente,"cerrar_button","Salir",this.politicaclienteSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoPoliticaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarPoliticaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarPoliticaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormPoliticaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesPoliticaCliente, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaPoliticaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarPoliticaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoPoliticaCliente.setToolTipText("Nuevo"+" "+PoliticaClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarPoliticaCliente.setToolTipText("Duplicar"+" "+PoliticaClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarPoliticaCliente.setToolTipText("Copiar"+" "+PoliticaClienteConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormPoliticaCliente.setToolTipText("Ver"+" "+PoliticaClienteConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesPoliticaCliente.setToolTipText("Nuevo Rel"+" "+PoliticaClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaPoliticaCliente.setToolTipText("Guardar"+" "+PoliticaClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarPoliticaCliente.setToolTipText("Salir"+" "+PoliticaClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoPoliticaCliente";
		inputMap = this.jButtonNuevoPoliticaCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoPoliticaCliente.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoPoliticaCliente"));
		
		//DUPLICAR
		sMapKey = "DuplicarPoliticaCliente";
		inputMap = this.jButtonDuplicarPoliticaCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarPoliticaCliente.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarPoliticaCliente"));
		
		//COPIAR
		sMapKey = "CopiarPoliticaCliente";
		inputMap = this.jButtonCopiarPoliticaCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarPoliticaCliente.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarPoliticaCliente"));
		
		//VEr FORM
		sMapKey = "VerFormPoliticaCliente";
		inputMap = this.jButtonVerFormPoliticaCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormPoliticaCliente.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormPoliticaCliente"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesPoliticaCliente";
		inputMap = this.jButtonNuevoRelacionesPoliticaCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesPoliticaCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesPoliticaCliente"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarPoliticaCliente";
		inputMap = this.jButtonModificarPoliticaCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarPoliticaCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarPoliticaCliente"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarPoliticaCliente";
		inputMap = this.jButtonCerrarPoliticaCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarPoliticaCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarPoliticaCliente"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaPoliticaCliente";
		inputMap = this.jButtonGuardarCambiosTablaPoliticaCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaPoliticaCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaPoliticaCliente"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesPoliticaCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesPoliticaCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionPoliticaCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1PoliticaCliente= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2PoliticaCliente= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3PoliticaCliente= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4PoliticaCliente= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5PoliticaCliente= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesPoliticaCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesPoliticaCliente.setName("jPanelParametrosReportesPoliticaCliente"); 
		
		this.jPanelParametrosReportesAccionesPoliticaCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesPoliticaCliente.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesPoliticaCliente.setName("jPanelParametrosReportesAccionesPoliticaCliente"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesPoliticaCliente, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesPoliticaCliente, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionPoliticaCliente = new JButtonMe();
		this.jButtonRecargarInformacionPoliticaCliente.setText("Recargar");
		this.jButtonRecargarInformacionPoliticaCliente.setToolTipText("Recargar"+" "+PoliticaClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionPoliticaCliente,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionPoliticaCliente = new JButtonMe();
		this.jButtonProcesarInformacionPoliticaCliente.setText("Procesar");
		this.jButtonProcesarInformacionPoliticaCliente.setToolTipText("Procesar"+" "+PoliticaClienteConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionPoliticaCliente.setVisible(false);
			
		this.jButtonProcesarInformacionPoliticaCliente.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionPoliticaCliente.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionPoliticaCliente.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesPoliticaCliente = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesPoliticaCliente.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesPoliticaCliente.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesPoliticaCliente = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesPoliticaCliente.setText("TIPO");       
		this.jComboBoxTiposReportesPoliticaCliente.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesPoliticaCliente = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesPoliticaCliente.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesPoliticaCliente.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionPoliticaCliente = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionPoliticaCliente.setText("Paginacion");
		this.jComboBoxTiposPaginacionPoliticaCliente.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesPoliticaCliente = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesPoliticaCliente.setText("Accion");
		this.jComboBoxTiposRelacionesPoliticaCliente.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesPoliticaCliente = new JComboBoxMe();
		//this.jComboBoxTiposAccionesPoliticaCliente.setText("Accion");
		this.jComboBoxTiposAccionesPoliticaCliente.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarPoliticaCliente = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarPoliticaCliente.setText("Accion");
		this.jComboBoxTiposSeleccionarPoliticaCliente.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralPoliticaCliente=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralPoliticaCliente.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralPoliticaCliente.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralPoliticaCliente.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesPoliticaCliente = new JLabelMe();
		
		this.jLabelAccionesPoliticaCliente.setText("Acciones");		
		this.jLabelAccionesPoliticaCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPoliticaCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPoliticaCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosPoliticaCliente = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosPoliticaCliente.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosPoliticaCliente.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosPoliticaCliente = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosPoliticaCliente.setText("Seleccionados");
		this.jCheckBoxSeleccionadosPoliticaCliente.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaPoliticaCliente = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaPoliticaCliente.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaPoliticaCliente.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReportePoliticaCliente = new JCheckBoxMe();
		this.jCheckBoxConGraficoReportePoliticaCliente.setText("Graf.");
		this.jCheckBoxConGraficoReportePoliticaCliente.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresPoliticaCliente = new JButtonMe();
		//this.jButtonAnterioresPoliticaCliente.setText("<<");
        this.jButtonAnterioresPoliticaCliente.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresPoliticaCliente,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresPoliticaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesPoliticaCliente = new JButtonMe();
		//this.jButtonSiguientesPoliticaCliente.setText(">>");
        this.jButtonSiguientesPoliticaCliente.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesPoliticaCliente,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesPoliticaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosPoliticaCliente = new JButtonMe();
		this.jButtonNuevoGuardarCambiosPoliticaCliente.setText("Nue");
        this.jButtonNuevoGuardarCambiosPoliticaCliente.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosPoliticaCliente,"nuevoguardarcambios_button","Nue",this.politicaclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosPoliticaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosPoliticaCliente";
		inputMap = this.jButtonNuevoGuardarCambiosPoliticaCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosPoliticaCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosPoliticaCliente"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionPoliticaCliente";
		inputMap = this.jButtonRecargarInformacionPoliticaCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionPoliticaCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionPoliticaCliente"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesPoliticaCliente";
		inputMap = this.jButtonSiguientesPoliticaCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesPoliticaCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesPoliticaCliente"));
		
		//ANTERIORES		
		sMapKey = "AnterioresPoliticaCliente";
		inputMap = this.jButtonAnterioresPoliticaCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresPoliticaCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresPoliticaCliente"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasPoliticaCliente();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesPoliticaCliente.setMinimumSize(new Dimension(this.getWidth(),PoliticaClienteBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(PoliticaClienteBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesPoliticaCliente.setMaximumSize(new Dimension(this.getWidth(),PoliticaClienteBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(PoliticaClienteBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesPoliticaCliente.setPreferredSize(new Dimension(this.getWidth(),PoliticaClienteBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(PoliticaClienteBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionPoliticaCliente = new GridBagLayout();

			this.jPanelPaginacionPoliticaCliente.setLayout(gridaBagLayoutPaginacionPoliticaCliente);						
			
			this.gridBagConstraintsPoliticaCliente = new GridBagConstraints();
			this.gridBagConstraintsPoliticaCliente.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsPoliticaCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPoliticaCliente.gridy = 0;
			this.gridBagConstraintsPoliticaCliente.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionPoliticaCliente.add(this.jButtonAnterioresPoliticaCliente, this.gridBagConstraintsPoliticaCliente);
					
						
			this.gridBagConstraintsPoliticaCliente = new GridBagConstraints();
			this.gridBagConstraintsPoliticaCliente.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsPoliticaCliente.gridy = 0;
			
			this.jPanelPaginacionPoliticaCliente.add(this.jButtonNuevoGuardarCambiosPoliticaCliente, this.gridBagConstraintsPoliticaCliente);
						
			
			this.gridBagConstraintsPoliticaCliente = new GridBagConstraints();
			this.gridBagConstraintsPoliticaCliente.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsPoliticaCliente.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsPoliticaCliente.gridy = 0;
			this.jPanelPaginacionPoliticaCliente.add(this.jButtonSiguientesPoliticaCliente, this.gridBagConstraintsPoliticaCliente);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsPoliticaCliente = new GridBagConstraints();
			this.gridBagConstraintsPoliticaCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPoliticaCliente.gridy = 1;
			this.gridBagConstraintsPoliticaCliente.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionPoliticaCliente.add(this.jButtonNuevoPoliticaCliente, this.gridBagConstraintsPoliticaCliente);
						
			
			
			if(!this.politicaclienteSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsPoliticaCliente = new GridBagConstraints();
				this.gridBagConstraintsPoliticaCliente.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsPoliticaCliente.gridy = 1;
				this.gridBagConstraintsPoliticaCliente.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionPoliticaCliente.add(this.jButtonGuardarCambiosTablaPoliticaCliente, this.gridBagConstraintsPoliticaCliente);
			}
			
			
			
			this.gridBagConstraintsPoliticaCliente = new GridBagConstraints();
			this.gridBagConstraintsPoliticaCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPoliticaCliente.gridy = 1;
			this.gridBagConstraintsPoliticaCliente.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionPoliticaCliente.add(this.jButtonDuplicarPoliticaCliente, this.gridBagConstraintsPoliticaCliente);
			
			this.gridBagConstraintsPoliticaCliente = new GridBagConstraints();
			this.gridBagConstraintsPoliticaCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPoliticaCliente.gridy = 1;
			this.gridBagConstraintsPoliticaCliente.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionPoliticaCliente.add(this.jButtonCopiarPoliticaCliente, this.gridBagConstraintsPoliticaCliente);
		
			this.gridBagConstraintsPoliticaCliente = new GridBagConstraints();
			this.gridBagConstraintsPoliticaCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPoliticaCliente.gridy = 1;
			this.gridBagConstraintsPoliticaCliente.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionPoliticaCliente.add(this.jButtonVerFormPoliticaCliente, this.gridBagConstraintsPoliticaCliente);
		
			this.gridBagConstraintsPoliticaCliente = new GridBagConstraints();
			this.gridBagConstraintsPoliticaCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPoliticaCliente.gridy = 1;
			this.gridBagConstraintsPoliticaCliente.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionPoliticaCliente.add(this.jButtonCerrarPoliticaCliente, this.gridBagConstraintsPoliticaCliente);
		
		
		
		this.jButtonRecargarInformacionPoliticaCliente.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionPoliticaCliente.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionPoliticaCliente.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionPoliticaCliente, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesPoliticaCliente.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesPoliticaCliente.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesPoliticaCliente.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesPoliticaCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesPoliticaCliente.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesPoliticaCliente.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesPoliticaCliente.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesPoliticaCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesPoliticaCliente.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesPoliticaCliente.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesPoliticaCliente.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesPoliticaCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionPoliticaCliente.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionPoliticaCliente.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionPoliticaCliente.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionPoliticaCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesPoliticaCliente.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesPoliticaCliente.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesPoliticaCliente.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesPoliticaCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesPoliticaCliente.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPoliticaCliente.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPoliticaCliente.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesPoliticaCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarPoliticaCliente.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarPoliticaCliente.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarPoliticaCliente.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarPoliticaCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaPoliticaCliente.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaPoliticaCliente.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaPoliticaCliente.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaPoliticaCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReportePoliticaCliente.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReportePoliticaCliente.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReportePoliticaCliente.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReportePoliticaCliente, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosPoliticaCliente.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosPoliticaCliente.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosPoliticaCliente.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosPoliticaCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosPoliticaCliente.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosPoliticaCliente.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosPoliticaCliente.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosPoliticaCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesPoliticaCliente = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesPoliticaCliente = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1PoliticaCliente = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2PoliticaCliente = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3PoliticaCliente = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4PoliticaCliente = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesPoliticaCliente.setLayout(gridaBagParametrosReportesPoliticaCliente);
			this.jPanelParametrosReportesAccionesPoliticaCliente.setLayout(gridaBagParametrosReportesAccionesPoliticaCliente);
			
			
			this.jPanelParametrosAuxiliar1PoliticaCliente.setLayout(gridaBagParametrosAuxiliar1PoliticaCliente);
			this.jPanelParametrosAuxiliar2PoliticaCliente.setLayout(gridaBagParametrosAuxiliar2PoliticaCliente);
			this.jPanelParametrosAuxiliar3PoliticaCliente.setLayout(gridaBagParametrosAuxiliar3PoliticaCliente);
			this.jPanelParametrosAuxiliar4PoliticaCliente.setLayout(gridaBagParametrosAuxiliar4PoliticaCliente);
			//this.jPanelParametrosAuxiliar5PoliticaCliente.setLayout(gridaBagParametrosAuxiliar2PoliticaCliente);			
			
			
			
			
			this.gridBagConstraintsPoliticaCliente = new GridBagConstraints();
			this.gridBagConstraintsPoliticaCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPoliticaCliente.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsPoliticaCliente.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPoliticaCliente.add(this.jButtonRecargarInformacionPoliticaCliente, this.gridBagConstraintsPoliticaCliente);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsPoliticaCliente = new GridBagConstraints();
			this.gridBagConstraintsPoliticaCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPoliticaCliente.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsPoliticaCliente.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1PoliticaCliente.add(this.jComboBoxTiposPaginacionPoliticaCliente, this.gridBagConstraintsPoliticaCliente);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsPoliticaCliente = new GridBagConstraints();
			this.gridBagConstraintsPoliticaCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPoliticaCliente.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsPoliticaCliente.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1PoliticaCliente.add(this.jCheckBoxConAltoMaximoTablaPoliticaCliente, this.gridBagConstraintsPoliticaCliente);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsPoliticaCliente = new GridBagConstraints();
			this.gridBagConstraintsPoliticaCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPoliticaCliente.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsPoliticaCliente.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1PoliticaCliente.add(this.jComboBoxTiposArchivosReportesPoliticaCliente, this.gridBagConstraintsPoliticaCliente);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsPoliticaCliente = new GridBagConstraints();
			this.gridBagConstraintsPoliticaCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPoliticaCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPoliticaCliente.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPoliticaCliente.add(this.jPanelParametrosAuxiliar1PoliticaCliente, this.gridBagConstraintsPoliticaCliente);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsPoliticaCliente = new GridBagConstraints();
			this.gridBagConstraintsPoliticaCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPoliticaCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPoliticaCliente.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPoliticaCliente.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4PoliticaCliente.add(this.jComboBoxTiposReportesPoliticaCliente, this.gridBagConstraintsPoliticaCliente);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsPoliticaCliente = new GridBagConstraints();
			this.gridBagConstraintsPoliticaCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPoliticaCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPoliticaCliente.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPoliticaCliente.add(this.jPanelParametrosAuxiliar4PoliticaCliente, this.gridBagConstraintsPoliticaCliente);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsPoliticaCliente = new GridBagConstraints();
			this.gridBagConstraintsPoliticaCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPoliticaCliente.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsPoliticaCliente.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPoliticaCliente.add(this.jComboBoxTiposReportesPoliticaCliente, this.gridBagConstraintsPoliticaCliente);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsPoliticaCliente = new GridBagConstraints();
			this.gridBagConstraintsPoliticaCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPoliticaCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPoliticaCliente.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesPoliticaCliente.add(this.jCheckBoxGenerarReportePoliticaCliente, this.gridBagConstraintsPoliticaCliente);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsPoliticaCliente = new GridBagConstraints();
			this.gridBagConstraintsPoliticaCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPoliticaCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPoliticaCliente.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPoliticaCliente.add(this.jPanelParametrosAuxiliar2PoliticaCliente, this.gridBagConstraintsPoliticaCliente);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsPoliticaCliente = new GridBagConstraints();
			this.gridBagConstraintsPoliticaCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPoliticaCliente.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsPoliticaCliente.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesPoliticaCliente.add(this.jLabelAccionesPoliticaCliente, this.gridBagConstraintsPoliticaCliente);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsPoliticaCliente = new GridBagConstraints();
				this.gridBagConstraintsPoliticaCliente.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsPoliticaCliente.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsPoliticaCliente.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesPoliticaCliente.add(this.jButtonAbrirOrderByPoliticaCliente, this.gridBagConstraintsPoliticaCliente);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsPoliticaCliente = new GridBagConstraints();
			this.gridBagConstraintsPoliticaCliente.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsPoliticaCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPoliticaCliente.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPoliticaCliente.add(this.jComboBoxTiposSeleccionarPoliticaCliente, this.gridBagConstraintsPoliticaCliente);			
			
			
			/*
			this.gridBagConstraintsPoliticaCliente = new GridBagConstraints();
			this.gridBagConstraintsPoliticaCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPoliticaCliente.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsPoliticaCliente.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesPoliticaCliente.add(this.jCheckBoxSeleccionarTodosPoliticaCliente, this.gridBagConstraintsPoliticaCliente);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsPoliticaCliente = new GridBagConstraints();
			this.gridBagConstraintsPoliticaCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPoliticaCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPoliticaCliente.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPoliticaCliente.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3PoliticaCliente.add(this.jCheckBoxSeleccionarTodosPoliticaCliente, this.gridBagConstraintsPoliticaCliente);															
				
			this.gridBagConstraintsPoliticaCliente = new GridBagConstraints();
			this.gridBagConstraintsPoliticaCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPoliticaCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPoliticaCliente.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPoliticaCliente.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3PoliticaCliente.add(this.jCheckBoxSeleccionadosPoliticaCliente, this.gridBagConstraintsPoliticaCliente);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsPoliticaCliente = new GridBagConstraints();
			this.gridBagConstraintsPoliticaCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPoliticaCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPoliticaCliente.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPoliticaCliente.add(this.jPanelParametrosAuxiliar3PoliticaCliente, this.gridBagConstraintsPoliticaCliente);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsPoliticaCliente = new GridBagConstraints();
			this.gridBagConstraintsPoliticaCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPoliticaCliente.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPoliticaCliente.add(this.jComboBoxTiposAccionesPoliticaCliente, this.gridBagConstraintsPoliticaCliente);
	
				
			this.gridBagConstraintsPoliticaCliente = new GridBagConstraints();
			this.gridBagConstraintsPoliticaCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPoliticaCliente.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPoliticaCliente.add(this.jTextFieldValorCampoGeneralPoliticaCliente, this.gridBagConstraintsPoliticaCliente);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosPoliticaCliente = new GridBagLayout();

			this.jScrollPanelDatosPoliticaCliente.setLayout(gridaBagLayoutDatosPoliticaCliente);
			
			this.gridBagConstraintsPoliticaCliente = new GridBagConstraints();
			this.gridBagConstraintsPoliticaCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPoliticaCliente.gridy = 0;
			this.gridBagConstraintsPoliticaCliente.gridx = 0;
			
			this.jScrollPanelDatosPoliticaCliente.add(this.jTableDatosPoliticaCliente, this.gridBagConstraintsPoliticaCliente);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosPoliticaCliente.setViewportView(this.jTableDatosPoliticaCliente);
		this.jTableDatosPoliticaCliente.setFillsViewportHeight(true);
		this.jTableDatosPoliticaCliente.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesPoliticaCliente= new GridBagLayout();
		this.jPanelAccionesPoliticaCliente.setLayout(gridaBagLayoutAccionesPoliticaCliente);
		
		
		/*	
		this.gridBagConstraintsPoliticaCliente = new GridBagConstraints();
		this.gridBagConstraintsPoliticaCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPoliticaCliente.gridy = 0;
		this.gridBagConstraintsPoliticaCliente.gridx = 0;
			
		this.jPanelAccionesPoliticaCliente.add(this.jButtonNuevoPoliticaCliente, this.gridBagConstraintsPoliticaCliente);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdClientePoliticaCliente= new GridBagLayout();
		gridaBagLayoutFK_IdClientePoliticaCliente.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdClientePoliticaCliente.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdClientePoliticaCliente.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdClientePoliticaCliente.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdClientePoliticaCliente.setLayout(gridaBagLayoutFK_IdClientePoliticaCliente);

		gridBagConstraintsPoliticaCliente = new GridBagConstraints();
		gridBagConstraintsPoliticaCliente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPoliticaCliente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPoliticaCliente.gridy = 0;
		gridBagConstraintsPoliticaCliente.gridx = 0;
		jPanelFK_IdClientePoliticaCliente.add(jLabelid_clienteFK_IdClientePoliticaCliente, gridBagConstraintsPoliticaCliente);

		gridBagConstraintsPoliticaCliente = new GridBagConstraints();
		gridBagConstraintsPoliticaCliente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPoliticaCliente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPoliticaCliente.gridy = 0;
		gridBagConstraintsPoliticaCliente.gridx = 1;
		jPanelFK_IdClientePoliticaCliente.add(jComboBoxid_clienteFK_IdClientePoliticaCliente, gridBagConstraintsPoliticaCliente);


		gridBagConstraintsPoliticaCliente = new GridBagConstraints();
		gridBagConstraintsPoliticaCliente.anchor = GridBagConstraints.EAST;
		gridBagConstraintsPoliticaCliente.fill = GridBagConstraints.NONE;
		gridBagConstraintsPoliticaCliente.gridy = 0;
		gridBagConstraintsPoliticaCliente.gridx = 0;
		jPanelFK_IdClientePoliticaCliente.add(this.jButtonBuscarFK_IdClienteid_clientePoliticaCliente, gridBagConstraintsPoliticaCliente);

		gridBagConstraintsPoliticaCliente = new GridBagConstraints();
		gridBagConstraintsPoliticaCliente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPoliticaCliente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPoliticaCliente.gridy = 1;
		gridBagConstraintsPoliticaCliente.gridx =1;
		jPanelFK_IdClientePoliticaCliente.add(jButtonFK_IdClientePoliticaCliente, gridBagConstraintsPoliticaCliente);

		jTabbedPaneBusquedasPoliticaCliente.addTab("1.-Por Cliente ", jPanelFK_IdClientePoliticaCliente);
		jTabbedPaneBusquedasPoliticaCliente.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutPoliticaCliente = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutPoliticaCliente);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.politicaclienteSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsPoliticaCliente = new GridBagConstraints();						
			this.gridBagConstraintsPoliticaCliente.gridy = iGridyPrincipal++;
			this.gridBagConstraintsPoliticaCliente.gridx = 0;		
			//this.gridBagConstraintsPoliticaCliente.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPoliticaCliente.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsPoliticaCliente.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarPoliticaCliente, this.gridBagConstraintsPoliticaCliente);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsPoliticaCliente = new GridBagConstraints();
		this.gridBagConstraintsPoliticaCliente.gridy = iGridyPrincipal++;
		this.gridBagConstraintsPoliticaCliente.gridx = 0;		
		//this.gridBagConstraintsPoliticaCliente.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPoliticaCliente.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsPoliticaCliente.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsPoliticaCliente);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsPoliticaCliente = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsPoliticaCliente.gridy = iGridyPrincipal++;
			this.gridBagConstraintsPoliticaCliente.gridx = 0;		
			this.gridBagConstraintsPoliticaCliente.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPoliticaCliente.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsPoliticaCliente.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasPoliticaCliente, this.gridBagConstraintsPoliticaCliente);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsPoliticaCliente = new GridBagConstraints();
		this.gridBagConstraintsPoliticaCliente.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPoliticaCliente.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesPoliticaCliente, this.gridBagConstraintsPoliticaCliente);								
		
		
		/*
		this.gridBagConstraintsPoliticaCliente = new GridBagConstraints();
		this.gridBagConstraintsPoliticaCliente.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPoliticaCliente.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesPoliticaCliente, this.gridBagConstraintsPoliticaCliente);
		*/		
		
		this.gridBagConstraintsPoliticaCliente = new GridBagConstraints();
		this.gridBagConstraintsPoliticaCliente.gridy =iGridyPrincipal++;
		this.gridBagConstraintsPoliticaCliente.gridx =0;
		this.gridBagConstraintsPoliticaCliente.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsPoliticaCliente.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosPoliticaCliente, this.gridBagConstraintsPoliticaCliente);
				
		
		this.gridBagConstraintsPoliticaCliente = new GridBagConstraints();
		this.gridBagConstraintsPoliticaCliente.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPoliticaCliente.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionPoliticaCliente, this.gridBagConstraintsPoliticaCliente);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(PoliticaClienteJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosPoliticaCliente= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosPoliticaCliente = new GridBagLayout();
			this.jPanelBusquedasParametrosPoliticaCliente.setLayout(gridaBagLayoutBusquedasParametrosPoliticaCliente);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralPoliticaCliente=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralPoliticaCliente.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPoliticaCliente.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPoliticaCliente.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsPoliticaCliente = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsPoliticaCliente = new GridBagConstraints();
		this.gridBagConstraintsPoliticaCliente.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPoliticaCliente.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposPoliticaCliente, this.gridBagConstraintsPoliticaCliente);
			
			
		this.gridBagConstraintsPoliticaCliente = new GridBagConstraints();
		this.gridBagConstraintsPoliticaCliente.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPoliticaCliente.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosPoliticaCliente, this.gridBagConstraintsPoliticaCliente);
		
			
		this.gridBagConstraintsPoliticaCliente = new GridBagConstraints();
		this.gridBagConstraintsPoliticaCliente.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsPoliticaCliente.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesPoliticaCliente, this.gridBagConstraintsPoliticaCliente);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralPoliticaCliente;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoPoliticaCliente() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoPoliticaCliente = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoPoliticaCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoPoliticaCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoPoliticaCliente.setName("jPanelReporteDinamicoPoliticaCliente"); 
		
		this.jPanelReporteDinamicoPoliticaCliente.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoPoliticaCliente.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoPoliticaCliente.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoPoliticaCliente.setLayout(gridaBagLayoutReporteDinamicoPoliticaCliente);
		
		
		this.jInternalFrameReporteDinamicoPoliticaCliente= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoPoliticaCliente = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReportePoliticaCliente= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoPoliticaCliente.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoPoliticaCliente.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoPoliticaCliente.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoPoliticaCliente.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoPoliticaCliente.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoPoliticaCliente.setResizable(true);
	    this.jInternalFrameReporteDinamicoPoliticaCliente.setClosable(true);
	    this.jInternalFrameReporteDinamicoPoliticaCliente.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoPoliticaCliente.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoPoliticaCliente.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoPoliticaCliente.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoPoliticaCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Politica Clientes"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReportePoliticaCliente = new JLabelMe();

		this.jLabelColumnasSelectReportePoliticaCliente.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReportePoliticaCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReportePoliticaCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReportePoliticaCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsPoliticaCliente = new GridBagConstraints();
		this.gridBagConstraintsPoliticaCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPoliticaCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPoliticaCliente.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoPoliticaCliente.add(this.jLabelColumnasSelectReportePoliticaCliente, this.gridBagConstraintsPoliticaCliente);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReportePoliticaCliente = new JList<Reporte>();
		this.jListColumnasSelectReportePoliticaCliente.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReportePoliticaCliente.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReportePoliticaCliente.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReportePoliticaCliente.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReportePoliticaCliente.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReportePoliticaCliente=new JScrollPane(this.jListColumnasSelectReportePoliticaCliente);
			
			this.jScrollColumnasSelectReportePoliticaCliente.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReportePoliticaCliente.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReportePoliticaCliente.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReportePoliticaCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsPoliticaCliente = new GridBagConstraints();
		this.gridBagConstraintsPoliticaCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPoliticaCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPoliticaCliente.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoPoliticaCliente.add(this.jListColumnasSelectReportePoliticaCliente, this.gridBagConstraintsPoliticaCliente);
		this.jPanelReporteDinamicoPoliticaCliente.add(this.jScrollColumnasSelectReportePoliticaCliente, this.gridBagConstraintsPoliticaCliente);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReportePoliticaCliente = new JLabelMe();

		this.jLabelRelacionesSelectReportePoliticaCliente.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReportePoliticaCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReportePoliticaCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReportePoliticaCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReportePoliticaCliente = new JList<Reporte>();
		this.jListRelacionesSelectReportePoliticaCliente.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReportePoliticaCliente.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReportePoliticaCliente.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReportePoliticaCliente.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReportePoliticaCliente.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReportePoliticaCliente=new JScrollPane(this.jListRelacionesSelectReportePoliticaCliente);
			
			this.jScrollRelacionesSelectReportePoliticaCliente.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReportePoliticaCliente.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReportePoliticaCliente.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReportePoliticaCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoPoliticaCliente = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoPoliticaCliente = new JComboBoxMe();
		this.jListColumnasValoresGraficoPoliticaCliente = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoPoliticaCliente = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoPoliticaCliente.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoPoliticaCliente.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoPoliticaCliente.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoPoliticaCliente.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoPoliticaCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoPoliticaCliente = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoPoliticaCliente.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoPoliticaCliente.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoPoliticaCliente.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoPoliticaCliente.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoPoliticaCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoPoliticaCliente = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoPoliticaCliente.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoPoliticaCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoPoliticaCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoPoliticaCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsPoliticaCliente = new GridBagConstraints();
		this.gridBagConstraintsPoliticaCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPoliticaCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPoliticaCliente.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPoliticaCliente.add(this.jLabelGenerarExcelReporteDinamicoPoliticaCliente, this.gridBagConstraintsPoliticaCliente);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoPoliticaCliente = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoPoliticaCliente.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoPoliticaCliente,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoPoliticaCliente.setToolTipText("Generar EXCEL"+" "+PoliticaClienteConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsPoliticaCliente = new GridBagConstraints();
		//this.gridBagConstraintsPoliticaCliente.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsPoliticaCliente.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsPoliticaCliente.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoPoliticaCliente.add(this.jButtonGenerarExcelReporteDinamicoPoliticaCliente, this.gridBagConstraintsPoliticaCliente);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsPoliticaCliente = new GridBagConstraints();
		this.gridBagConstraintsPoliticaCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPoliticaCliente.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPoliticaCliente.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPoliticaCliente.add(this.jComboBoxTiposReportesDinamicoPoliticaCliente, this.gridBagConstraintsPoliticaCliente);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoPoliticaCliente = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoPoliticaCliente.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoPoliticaCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoPoliticaCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoPoliticaCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsPoliticaCliente = new GridBagConstraints();
		this.gridBagConstraintsPoliticaCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPoliticaCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPoliticaCliente.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPoliticaCliente.add(this.jLabelTiposArchivoReporteDinamicoPoliticaCliente, this.gridBagConstraintsPoliticaCliente);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsPoliticaCliente = new GridBagConstraints();
		this.gridBagConstraintsPoliticaCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPoliticaCliente.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPoliticaCliente.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPoliticaCliente.add(this.jComboBoxTiposArchivosReportesDinamicoPoliticaCliente, this.gridBagConstraintsPoliticaCliente);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoPoliticaCliente = new JButtonMe();
		this.jButtonGenerarReporteDinamicoPoliticaCliente.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoPoliticaCliente,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoPoliticaCliente.setToolTipText("Generar"+" "+PoliticaClienteConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsPoliticaCliente = new GridBagConstraints();
		this.gridBagConstraintsPoliticaCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPoliticaCliente.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPoliticaCliente.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPoliticaCliente.add(this.jButtonGenerarReporteDinamicoPoliticaCliente, this.gridBagConstraintsPoliticaCliente);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoPoliticaCliente = new JButtonMe();
		this.jButtonCerrarReporteDinamicoPoliticaCliente.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoPoliticaCliente,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoPoliticaCliente.setToolTipText("Cancelar"+" "+PoliticaClienteConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsPoliticaCliente = new GridBagConstraints();
		this.gridBagConstraintsPoliticaCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPoliticaCliente.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPoliticaCliente.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPoliticaCliente.add(this.jButtonCerrarReporteDinamicoPoliticaCliente, this.gridBagConstraintsPoliticaCliente);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalPoliticaCliente = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoPoliticaCliente= new JScrollPane(jPanelReporteDinamicoPoliticaCliente,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoPoliticaCliente.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoPoliticaCliente.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoPoliticaCliente.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoPoliticaCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Politica Clientes"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsPoliticaCliente = new GridBagConstraints();
		this.gridBagConstraintsPoliticaCliente.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsPoliticaCliente.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsPoliticaCliente.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoPoliticaCliente.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoPoliticaCliente.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalPoliticaCliente);
		this.jInternalFrameReporteDinamicoPoliticaCliente.getContentPane().add(this.jScrollPanelReporteDinamicoPoliticaCliente, this.gridBagConstraintsPoliticaCliente);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionPoliticaCliente() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionPoliticaCliente = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionPoliticaCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionPoliticaCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionPoliticaCliente.setName("jPanelImportacionPoliticaCliente"); 
		
		this.jPanelImportacionPoliticaCliente.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionPoliticaCliente.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionPoliticaCliente.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionPoliticaCliente.setLayout(gridaBagLayoutImportacionPoliticaCliente);
		
		
		this.jInternalFrameImportacionPoliticaCliente= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionPoliticaCliente= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionPoliticaCliente = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReportePoliticaCliente= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionPoliticaCliente.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionPoliticaCliente.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionPoliticaCliente.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionPoliticaCliente.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionPoliticaCliente.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionPoliticaCliente.setResizable(true);
	    this.jInternalFrameImportacionPoliticaCliente.setClosable(true);
	    this.jInternalFrameImportacionPoliticaCliente.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionPoliticaCliente.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionPoliticaCliente.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionPoliticaCliente.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionPoliticaCliente.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionPoliticaCliente.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionPoliticaCliente.setResizable(true);
	    this.jInternalFrameImportacionPoliticaCliente.setClosable(true);
	    this.jInternalFrameImportacionPoliticaCliente.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionPoliticaCliente.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionPoliticaCliente.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionPoliticaCliente.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionPoliticaCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Politica Clientes"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionPoliticaCliente = new JLabelMe();

		this.jLabelArchivoImportacionPoliticaCliente.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionPoliticaCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionPoliticaCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionPoliticaCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsPoliticaCliente = new GridBagConstraints();
		this.gridBagConstraintsPoliticaCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPoliticaCliente.gridy = iPosYImportacion;		
		this.gridBagConstraintsPoliticaCliente.gridx = iPosXImportacion++;
			
		this.jPanelImportacionPoliticaCliente.add(this.jLabelArchivoImportacionPoliticaCliente, this.gridBagConstraintsPoliticaCliente);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionPoliticaCliente = new JFileChooser();		
		this.jFileChooserImportacionPoliticaCliente.setToolTipText("ESCOGER ARCHIVO"+" "+PoliticaClienteConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionPoliticaCliente = new JButtonMe();
		this.jButtonAbrirImportacionPoliticaCliente.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionPoliticaCliente,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionPoliticaCliente.setToolTipText("Generar"+" "+PoliticaClienteConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsPoliticaCliente = new GridBagConstraints();
		this.gridBagConstraintsPoliticaCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPoliticaCliente.gridy = iPosYImportacion;
		this.gridBagConstraintsPoliticaCliente.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPoliticaCliente.add(this.jButtonAbrirImportacionPoliticaCliente, this.gridBagConstraintsPoliticaCliente);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionPoliticaCliente = new JLabelMe();

		this.jLabelPathArchivoImportacionPoliticaCliente.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionPoliticaCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionPoliticaCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionPoliticaCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsPoliticaCliente = new GridBagConstraints();
		this.gridBagConstraintsPoliticaCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPoliticaCliente.gridy = iPosYImportacion;		
		this.gridBagConstraintsPoliticaCliente.gridx = iPosXImportacion++;
			
		this.jPanelImportacionPoliticaCliente.add(this.jLabelPathArchivoImportacionPoliticaCliente, this.gridBagConstraintsPoliticaCliente);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionPoliticaCliente=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionPoliticaCliente.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionPoliticaCliente.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionPoliticaCliente.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsPoliticaCliente = new GridBagConstraints();
		this.gridBagConstraintsPoliticaCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPoliticaCliente.gridy = iPosYImportacion;
		this.gridBagConstraintsPoliticaCliente.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPoliticaCliente.add(this.jTextFieldPathArchivoImportacionPoliticaCliente, this.gridBagConstraintsPoliticaCliente);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionPoliticaCliente = new JButtonMe();
		this.jButtonGenerarImportacionPoliticaCliente.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionPoliticaCliente,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionPoliticaCliente.setToolTipText("Generar"+" "+PoliticaClienteConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsPoliticaCliente = new GridBagConstraints();
		this.gridBagConstraintsPoliticaCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPoliticaCliente.gridy = iPosYImportacion;
		this.gridBagConstraintsPoliticaCliente.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPoliticaCliente.add(this.jButtonGenerarImportacionPoliticaCliente, this.gridBagConstraintsPoliticaCliente);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionPoliticaCliente = new JButtonMe();
		this.jButtonCerrarImportacionPoliticaCliente.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionPoliticaCliente,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionPoliticaCliente.setToolTipText("Cancelar"+" "+PoliticaClienteConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsPoliticaCliente = new GridBagConstraints();
		this.gridBagConstraintsPoliticaCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPoliticaCliente.gridy = iPosYImportacion;
		this.gridBagConstraintsPoliticaCliente.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPoliticaCliente.add(this.jButtonCerrarImportacionPoliticaCliente, this.gridBagConstraintsPoliticaCliente);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalPoliticaCliente = new GridBagLayout();
		
		this.jScrollPanelImportacionPoliticaCliente= new JScrollPane(jPanelImportacionPoliticaCliente,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsPoliticaCliente = new GridBagConstraints();
		this.gridBagConstraintsPoliticaCliente.gridy =iPosYImportacion;
		this.gridBagConstraintsPoliticaCliente.gridx =iPosXImportacion;
		this.gridBagConstraintsPoliticaCliente.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionPoliticaCliente.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionPoliticaCliente.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalPoliticaCliente);
		this.jInternalFrameImportacionPoliticaCliente.getContentPane().add(this.jScrollPanelImportacionPoliticaCliente, this.gridBagConstraintsPoliticaCliente);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByPoliticaCliente(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByPoliticaCliente = new JButtonMe();
			this.jButtonAbrirOrderByPoliticaCliente.setText("Orden");
			this.jButtonAbrirOrderByPoliticaCliente.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByPoliticaCliente,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByPoliticaCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByPoliticaCliente";
			inputMap = this.jButtonAbrirOrderByPoliticaCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByPoliticaCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByPoliticaCliente"));
		
		
			GridBagLayout gridaBagLayoutOrderByPoliticaCliente = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByPoliticaCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByPoliticaCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByPoliticaCliente.setName("jPanelOrderByPoliticaCliente"); 
			
			this.jPanelOrderByPoliticaCliente.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByPoliticaCliente.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByPoliticaCliente.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByPoliticaCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByPoliticaCliente.setLayout(gridaBagLayoutOrderByPoliticaCliente);
			
			
			this.jTableDatosPoliticaClienteOrderBy = new JTableMe();        
			this.jTableDatosPoliticaClienteOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosPoliticaClienteOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosPoliticaClienteOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosPoliticaClienteOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosPoliticaClienteOrderBy.setViewportView(this.jTableDatosPoliticaClienteOrderBy);
			this.jTableDatosPoliticaClienteOrderBy.setFillsViewportHeight(true);
			this.jTableDatosPoliticaClienteOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByPoliticaCliente= new OrderByJInternalFrame();
			this.jInternalFrameOrderByPoliticaCliente= new OrderByJInternalFrame();
			this.jScrollPanelOrderByPoliticaCliente = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReportePoliticaCliente= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByPoliticaCliente.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByPoliticaCliente.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByPoliticaCliente.setTitle("Orden");
			this.jInternalFrameOrderByPoliticaCliente.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByPoliticaCliente.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByPoliticaCliente.setResizable(true);
			this.jInternalFrameOrderByPoliticaCliente.setClosable(true);
			this.jInternalFrameOrderByPoliticaCliente.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByPoliticaCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByPoliticaCliente.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByPoliticaCliente.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByPoliticaCliente.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByPoliticaCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByPoliticaCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Politica Clientes"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsPoliticaCliente = new GridBagConstraints();
			this.gridBagConstraintsPoliticaCliente.gridy =iPosYOrderBy++;
			this.gridBagConstraintsPoliticaCliente.gridx =iPosXOrderBy;
			this.gridBagConstraintsPoliticaCliente.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsPoliticaCliente.ipady =150;
				
			this.jPanelOrderByPoliticaCliente.add(jScrollPanelDatosPoliticaClienteOrderBy, this.gridBagConstraintsPoliticaCliente);//this.jTableDatosPoliticaClienteTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByPoliticaCliente = new JButtonMe();
			this.jButtonCerrarOrderByPoliticaCliente.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByPoliticaCliente,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByPoliticaCliente.setToolTipText("Cancelar"+" "+PoliticaClienteConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByPoliticaCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsPoliticaCliente = new GridBagConstraints();
			this.gridBagConstraintsPoliticaCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPoliticaCliente.gridy = iPosYOrderBy++;
			this.gridBagConstraintsPoliticaCliente.gridx = iPosXOrderBy;
									
			this.jPanelOrderByPoliticaCliente.add(this.jButtonCerrarOrderByPoliticaCliente, this.gridBagConstraintsPoliticaCliente);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalPoliticaCliente = new GridBagLayout();
			
			this.jScrollPanelOrderByPoliticaCliente= new JScrollPane(jPanelOrderByPoliticaCliente,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsPoliticaCliente = new GridBagConstraints();
			this.gridBagConstraintsPoliticaCliente.gridy =iPosYOrderBy;
			this.gridBagConstraintsPoliticaCliente.gridx =iPosXOrderBy;
			this.gridBagConstraintsPoliticaCliente.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByPoliticaCliente.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByPoliticaCliente.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalPoliticaCliente);
			
			this.jInternalFrameOrderByPoliticaCliente.getContentPane().add(this.jScrollPanelOrderByPoliticaCliente, this.gridBagConstraintsPoliticaCliente);			
		
		} else {
			this.jButtonAbrirOrderByPoliticaCliente = new JButtonMe();
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
		int iWidthTableCalculado=0;//730
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=330;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=400;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.politicaclienteSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosPoliticaCliente.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosPoliticaCliente.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosPoliticaCliente.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosPoliticaCliente.getRowHeight();//PoliticaClienteConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.politicaclienteSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > PoliticaClienteConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaPoliticaCliente.isSelected()) {
					iHeightTable=PoliticaClienteConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < PoliticaClienteConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=PoliticaClienteConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > PoliticaClienteConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaPoliticaCliente.isSelected()) {
					iHeightTable=PoliticaClienteConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < PoliticaClienteConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=PoliticaClienteConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosPoliticaCliente.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosPoliticaCliente.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosPoliticaCliente.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosPoliticaCliente.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosPoliticaCliente.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosPoliticaCliente.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByPoliticaCliente!=null && this.jInternalFrameOrderByPoliticaCliente.getjTableDatosOrderBy()!=null) {
			//if(!this.politicaclienteSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByPoliticaCliente.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByPoliticaCliente.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByPoliticaCliente.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByPoliticaCliente.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByPoliticaCliente.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByPoliticaCliente.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByPoliticaCliente.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosPoliticaCliente.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosPoliticaCliente.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosPoliticaCliente.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=politicaclienteLogic.getPoliticaClientes().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=politicaclientes.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<PoliticaCliente> TraerPoliticaClienteBeans(List<PoliticaCliente> politicaclientes,ArrayList<Classe> classes)throws Exception {
		try {
			for(PoliticaCliente politicacliente:politicaclientes) {
					
				if(!(PoliticaClienteConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || PoliticaClienteConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					politicacliente.setsDetalleGeneralEntityReporte(PoliticaClienteConstantesFunciones.getPoliticaClienteDescripcion(politicacliente));
										
						
					
						
					
				} else  {
							
					//politicacliente.setsDetalleGeneralEntityReporte(politicacliente.getsDetalleGeneralEntityReporte());
										
				}
				
				//politicaclientebeans.add(politicaclientebean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return politicaclientes;
    }
	//PARA REPORTES FIN
}
